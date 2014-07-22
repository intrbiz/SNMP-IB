package com.intrbiz.snmp.transport;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;

import org.apache.log4j.Logger;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.SNMPContextId;
import com.intrbiz.snmp.SNMPContextResolver;
import com.intrbiz.snmp.SNMPTransport;
import com.intrbiz.snmp.SNMPV3Context;
import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.error.SNMPTimeout;
import com.intrbiz.snmp.handler.OnError;
import com.intrbiz.snmp.handler.OnMessage;
import com.intrbiz.snmp.handler.OnTrap;
import com.intrbiz.snmp.model.SNMPMessage;
import com.intrbiz.snmp.model.v1.TrapPDUV1;
import com.intrbiz.snmp.model.v2.GetBulkRequestPDU;
import com.intrbiz.snmp.model.v2.SNMPMessageV2;
import com.intrbiz.snmp.model.v2.TrapPDU;
import com.intrbiz.snmp.model.v3.ReportPDU;
import com.intrbiz.snmp.model.v3.SNMPMessageV3;
import com.intrbiz.snmp.model.v3.USMSecurityParameters;
import com.intrbiz.snmp.poller.SNMPJob;
import com.intrbiz.snmp.util.SNMPUtil;

/**
 * Transport SNMPMessages over UDP using NIO.
 * 
 * This transport will use a single UDP socket to communicate with many SNMP Agents. Messages are sent and received when the underlying Kernel is ready, rather than blocking on IO calls.
 * 
 * As such a large number of SNMP Agents should be pollable with minimal resource utilisation.
 * 
 */
public final class AsyncUDPTransport extends SNMPTransport
{
    private static final long BG_INTERVAL = 500;

    private Logger logger = Logger.getLogger(AsyncUDPTransport.class);

    private boolean closed = false;

    private DatagramChannel channel;

    private Selector selector;

    private SelectionKey key;

    private ConcurrentMap<SNMPContextId, SNMPContext<?>> contexts = new ConcurrentHashMap<SNMPContextId, SNMPContext<?>>();

    private ConcurrentMap<Integer, EnqueuedMessage> sentMessages = new ConcurrentHashMap<Integer, EnqueuedMessage>();

    private Queue<EnqueuedMessage> sendQueue = new ConcurrentLinkedQueue<EnqueuedMessage>();

    private long lastBackgroundRun = 0;
    
    private int port;
    
    private Timer poller = new Timer();

    public AsyncUDPTransport(int port) throws IOException
    {
        super();
        this.port = port;
        this.init();
    }
    
    public AsyncUDPTransport() throws IOException
    {
        this(8161);
    }

    private void init() throws IOException
    {
        // the channel to send and recv UDP packets on
        this.channel = DatagramChannel.open();
        this.channel.bind(new InetSocketAddress(InetAddress.getByAddress(new byte[] { 0, 0, 0, 0 }), this.port));
        this.channel.configureBlocking(false);
        // the selector to know when the channel can be used
        this.selector = Selector.open();
        this.key = this.channel.register(this.selector, SelectionKey.OP_READ);
    }

    public int getPort()
    {
        return this.port;
    }

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                if (this.selector.select(BG_INTERVAL) > 0)
                {
                    Iterator<SelectionKey> keys = this.selector.selectedKeys().iterator();
                    while (keys.hasNext())
                    {
                        SelectionKey k = keys.next();
                        if (k.isReadable())
                        {
                            // read
                            this.read();
                        }
                        if (k.isWritable())
                        {
                            this.write();
                        }
                        keys.remove();
                    }
                }
                this.background();
            }
            catch (ClosedSelectorException e)
            {
                break;
            }
            catch (IOException e)
            {
                logger.error("Error processing transport", e);
            }
        }
    }

    private void background() throws IOException
    {
        if ((System.currentTimeMillis() - this.lastBackgroundRun) >= BG_INTERVAL)
        {
            long now = System.currentTimeMillis();
            Iterator<Entry<Integer, EnqueuedMessage>> msgs = this.sentMessages.entrySet().iterator();
            while (msgs.hasNext())
            {
                Entry<Integer, EnqueuedMessage> ent = msgs.next();
                EnqueuedMessage msg = ent.getValue();
                if ((now - msg.sentTime) > msg.context.getTimeOut())
                {
                    resendMessage(msg, true);
                }
            }
            this.lastBackgroundRun = System.currentTimeMillis();
        }
    }

    private void write() throws IOException
    {
        EnqueuedMessage msg = this.sendQueue.poll();
        if (msg != null)
        {
            // BTF
            if (msg.message.getPdu() instanceof GetBulkRequestPDU && msg.context.isNaughtyDevice())
            {
                logger.debug("Clamping max-repetitions for a naughty device");
                ((GetBulkRequestPDU) msg.message.getPdu()).setMaxRepetitions(msg.resendCount > 2 ? 1 : 10);
            }
            //
            logger.trace("Sending message: " + msg.message);
            byte[] encoded = msg.message.encodeToBytes(msg.context);
            logger.debug("Sending " + encoded.length + " bytes");
            this.channel.send(ByteBuffer.wrap(encoded), msg.target);
            // move to the sent pool
            msg.sentTime = System.currentTimeMillis();
            this.putSentMessage(msg.message.getId(), msg);
        }
        else
        {
            this.key.interestOps(SelectionKey.OP_READ);
        }
    }

    private void read() throws IOException
    {
        ByteBuffer buffer = ByteBuffer.allocate(1500);
        SocketAddress from = this.channel.receive(buffer);
        buffer.flip();
        logger.debug("Got " + buffer.limit() + " bytes from " + from);
        try
        {
            SNMPMessage msg = this.decodeMessage(buffer, (InetSocketAddress) from);
            // in response to
            EnqueuedMessage responseTo = this.getSentMessage(msg.getId());
            if (responseTo != null)
            {
                logger.debug("Latency: " + (System.currentTimeMillis() - responseTo.sentTime));
                //
                if (msg instanceof SNMPMessageV3 && msg.getPdu() instanceof ReportPDU)
                {
                    // handle updating the V3 context upon an error and resending
                    SNMPMessageV3 msgv3 = (SNMPMessageV3) msg;
                    USMSecurityParameters sp = (USMSecurityParameters) msgv3.getSecurityParameters();
                    SNMPV3Context ctxv3 = (SNMPV3Context) msgv3.getSNMPContext();
                    // update the context
                    logger.debug("Updating EngineTime: " + sp.getAuthoritativeEngineBoots() + "::" + sp.getAuthoritativeEngineTime() + "::" + SNMPUtil.toHex(sp.getAuthoritativeEngineId()));
                    ctxv3.setEngineBoots(sp.getAuthoritativeEngineBoots());
                    ctxv3.setEngineTime(sp.getAuthoritativeEngineTime());
                    ctxv3.setLastEngineTimeUpdate(System.currentTimeMillis());
                    if (ctxv3.isDiscovering())
                    {
                        ctxv3.setEngineId(sp.getAuthoritativeEngineId());
                        ctxv3.setDiscovering(false);
                        logger.debug("Set SNMP Context Engine ID to: " + ctxv3.getEngineIdAsString() + ", discovered: " + ctxv3.isDiscovering() + ", id: " + ctxv3.getContextId());
                        // update the context id
                        this.contexts.put(ctxv3.getContextId(), ctxv3);
                        this.contexts.remove(new SNMPContextId(ctxv3.getAgent(), SNMPV3Context.LOCAL_ENGINE_ID));
                    }
                    // alter the request
                    ((USMSecurityParameters) ((SNMPMessageV3) responseTo.message).getSecurityParameters()).setAuthoritativeEngineBoots(sp.getAuthoritativeEngineBoots());
                    ((USMSecurityParameters) ((SNMPMessageV3) responseTo.message).getSecurityParameters()).setAuthoritativeEngineTime(sp.getAuthoritativeEngineTime());
                    ((USMSecurityParameters) ((SNMPMessageV3) responseTo.message).getSecurityParameters()).setAuthoritativeEngineId(sp.getAuthoritativeEngineId());
                    ((SNMPMessageV3) responseTo.message).getScopedPdu().setContextEngineId(sp.getAuthoritativeEngineId());
                    // resend the request
                    this.resendMessage(responseTo, false);
                }
                else if (msg.getId() == responseTo.message.getId())
                {
                    // exec the receive callback
                    this.removeSentMessage(msg.getId());
                    // dispatch the message
                    this.dispatchResponse(msg, responseTo, from);
                }
                else
                {
                    logger.warn("Unhandled response:\n" + msg);
                    if (msg.getSNMPContext() != null && msg.getSNMPContext().getUnknownHandler() != null)
                    {
                        msg.getSNMPContext().getUnknownHandler().apply(msg, from, msg.getSNMPContext());
                    }
                    else if (this.globalUnknownHandler != null)
                    {
                        this.globalUnknownHandler.apply(msg, from, msg.getSNMPContext());
                    }
                }
            }
            else if (msg.getPdu() instanceof TrapPDU || msg.getPdu() instanceof TrapPDUV1)
            {
                logger.debug("Got Trap:\n" + msg);
                if (msg.getSNMPContext() != null && (! msg.getSNMPContext().getTrapHandlers().isEmpty()))
                {
                    for (OnTrap handler : msg.getSNMPContext().getTrapHandlers())
                    {
                        handler.apply(msg, from, msg.getSNMPContext());
                    }
                }
                else if (this.globalTrapHandler != null)
                {
                    this.globalTrapHandler.apply(msg, from, msg.getSNMPContext());
                }
            }
            else
            {
                logger.warn("Unknown message received:\n" + msg);
                if (msg.getSNMPContext() != null && msg.getSNMPContext().getUnknownHandler() != null)
                {
                    msg.getSNMPContext().getUnknownHandler().apply(msg, from, msg.getSNMPContext());
                }
                else if (this.globalUnknownHandler != null)
                {
                    this.globalUnknownHandler.apply(msg, from, msg.getSNMPContext());
                }
            }
        }
        catch (IOException e)
        {
            logger.error("Got decode error", e);
            logger.error("Got error from: " + from + " updating error state on the following contexts: ");
            for (SNMPContext<?> context : this.getContextsByTransport(from))
            {
                context.setErrorCount(context.getErrorCount() + 1);
                context.setDecodeErrorCount(context.getDecodeErrorCount() + 1);
                context.setNaughtyDevice(true);
                logger.error("\t+-> Device " + context.getAgent().getHostAddress() + " is naughty: " + context.getErrorCount() + " " + context.getDecodeErrorCount());
            }
        }
    }

    private SNMPMessage decodeMessage(ByteBuffer buffer, InetSocketAddress from) throws IOException
    {
        // parse the payload
        byte[] data = new byte[buffer.limit()];
        System.arraycopy(buffer.array(), buffer.arrayOffset(), data, 0, data.length);
        // peek at the payload to determine the message version
        SNMPVersion version = SNMPUtil.peekVersion(data, 0, data.length);
        if (SNMPVersion.V3 == version)
        {
            SNMPMessageV3 msg = new SNMPMessageV3(data, this.getContextResolver(from.getAddress()));
            if (logger.isTraceEnabled()) logger.trace("Decoded message: " + msg.toString());
            return msg;
        }
        else
        {
            SNMPMessageV2 msg = new SNMPMessageV2(data, this.getContextResolver(from.getAddress()));
            if (logger.isTraceEnabled()) logger.trace("Decoded message: " + msg.toString());
            return msg;
        }
    }

    @Override
    protected void send(SNMPMessage message, SNMPContext<?> context, OnMessage messageCallback, OnError errorCallback) throws IOException
    {
        if (this.closed)      throw new IllegalStateException("Transport is closed, cannot send message");
        if (message == null)  throw new NullPointerException("Cannot sent a null message!");
        if (messageCallback == null) throw new IllegalArgumentException("Cannot send message without a message callback being given!");
        if (context == null)  throw new IllegalArgumentException("Cannot send message without a context!");
        // serialise
        EnqueuedMessage emsg = new EnqueuedMessage();
        emsg.context = context;
        emsg.message = message;
        emsg.target = context.getAgentSocketAddress();
        emsg.messageCallback = messageCallback;
        emsg.errorCallback = errorCallback == null ? new OnError.LoggingAdapter() : errorCallback;
        // enqueue
        this.enqueueMessage(emsg);
    }

    @Override
    protected SNMPJob schedule(SNMPJob job)
    {
        if (this.closed) throw new IllegalStateException("Transport is closed, cannot schedule message");
        this.poller.schedule(job, job.getInitial(), job.getInterval());
        return job;
    }

    @Override
    public void close()
    {
        this.closed = true;
        try
        {
            this.selector.close();
        }
        catch (Exception e)
        {
        }
        try
        {
            this.channel.close();
        }
        catch (Exception e)
        {
        }
        this.channel = null;
        this.selector = null;
        this.key = null;
        this.contexts.clear();
        this.sentMessages.clear();
        this.sendQueue.clear();
    }

    @Override
    @SuppressWarnings("unchecked")
    protected <T extends SNMPContext<T>> SNMPContext<T> register(SNMPContext<T> context)
    {
        SNMPContext<?> existing = this.contexts.putIfAbsent(context.getContextId(), context);
        return existing == null ? context : (SNMPContext<T>) existing;
    }

    @Override
    public SNMPContext<?> getContext(SNMPContextId id)
    {
        return this.contexts.get(id);
    }

    @Override
    public SNMPContext<?> getContext(String host)
    {
        for (SNMPContext<?> context : this.contexts.values())
        {
            if (host.equals(context.getAgent().getHostName()))
            {
                return context;
            }
        }
        return null;
    }

    @Override
    public SNMPContext<?> getContext(String host, String engineId)
    {
        for (SNMPContext<?> context : this.contexts.values())
        {
            if (context instanceof SNMPV3Context && host.equals(context.getAgent().getHostName()) && engineId.equals(((SNMPV3Context) context).getEngineIdAsString()))
            {
                return context;
            }
        }
        return null;
    }
    
    // internal helpers

    private void enqueueMessage(EnqueuedMessage emsg)
    {
        this.sendQueue.offer(emsg);
        this.key.interestOps(SelectionKey.OP_READ | SelectionKey.OP_WRITE);
    }
    
    private SNMPContextResolver getContextResolver(final InetAddress address)
    {
        return new SNMPContextResolver()
        {
            @Override
            public SNMPContext<?> lookupContext(int requestId, byte[] engineId)
            {
                return getContext(address, requestId, engineId);
            }
        };
    }

    private SNMPContext<?> getContext(InetAddress target, int requestId, byte[] engineId)
    {
        // ideally lookup by request id
        logger.trace("Lookup message id :" + requestId + " in " + this.sentMessages);
        EnqueuedMessage sent = this.getSentMessage(requestId);
        if (sent != null)
        {
            return sent.context;
        }
        // fallback to search by context
        SNMPContextId id = new SNMPContextId(target, engineId);
        logger.trace("Lookup engine :" + id + " in " + this.contexts);
        return this.contexts.get(id);
    }
    
    private Set<SNMPContext<?>> getContextsByTransport(SocketAddress address)
    {
        Set<SNMPContext<?>> set = new HashSet<SNMPContext<?>>();
        for (SNMPContext<?> context : this.contexts.values())
        {
            if (address.equals(context.getAgentSocketAddress()))
            {
                set.add(context);
            }
        }
        return set;
    }

    private EnqueuedMessage getSentMessage(int requestId)
    {
        return this.sentMessages.get(requestId);
    }

    private void removeSentMessage(int requestId)
    {
        this.sentMessages.remove(requestId);
        
    }

    private void putSentMessage(int requestId, EnqueuedMessage msg)
    {
        msg.requestId = requestId;
        this.sentMessages.put(requestId, msg);
    }
    
    private void resendMessage(EnqueuedMessage msg, boolean timeoutCausedThis) throws IOException
    {
        if (msg.resendCount < msg.context.getResendCount())
        {
            // if we get a resend on a GetBulkRequest then set naughty device
            if (timeoutCausedThis && msg.message.getPdu() instanceof GetBulkRequestPDU)
            {
                logger.error("Got resend (due to timeout) for GetBulkRequest, device " + msg.context.getAgent().getHostAddress() + " is naughty: " + msg.context.getErrorCount() + " " + msg.context.getTimeoutCount());
                msg.context.setErrorCount(msg.context.getErrorCount() + 1);
                msg.context.setNaughtyDevice(true);
            }
            // resend
            logger.debug("Resending " + msg.context.getContextId() + "::" + msg.message.getId());
            msg.resendCount++;
            this.enqueueMessage(msg);
        }
        else
        {
            // handle the timeout
            this.dispatchTimeout(msg);
            this.removeSentMessage(msg.requestId);
        }
    }
    
    private void dispatchResponse(SNMPMessage msg, EnqueuedMessage responseTo, SocketAddress from)
    {
        try
        {
            if (msg instanceof SNMPMessageV3)
            {
                // authenticate the message
                ((SNMPMessageV3) msg).authenticateMessage();
            }
            // invoke the callback
            try
            {
                if (responseTo.messageCallback != null) responseTo.messageCallback.apply(msg);
            }
            catch (IOException e)
            {
                logger.warn("Error during response handler", e);
            }
        }
        catch (IOException e)
        {
            logger.warn("Error authenticate message", e);
            this.dispatchTimeout(responseTo);
        }
    }
    
    private void dispatchTimeout(EnqueuedMessage responseTo)
    {
        try
        {
            responseTo.context.setTimeoutCount(responseTo.context.getTimeoutCount() + 1);
            responseTo.context.setErrorCount(responseTo.context.getErrorCount() + 1);
            responseTo.context.setNaughtyDevice(true);
            logger.error("Got timeout for device " + responseTo.context.getContextId() + " is naughty: " + responseTo.context.getErrorCount() + " " + responseTo.context.getTimeoutCount());
            if (responseTo.errorCallback != null) responseTo.errorCallback.apply(new SNMPTimeout(responseTo.context, responseTo.message, "Got timeout for device " + responseTo.context.getContextId() + " is naughty: " + responseTo.context.getErrorCount() + " " + responseTo.context.getTimeoutCount()));
        }
        catch (IOException ee)
        {
            logger.warn("Error during timeout handler", ee);
        }
    }

    private class EnqueuedMessage
    {
        public SNMPContext<?> context;

        public SNMPMessage message;

        public SocketAddress target;

        public OnMessage messageCallback;
        
        public OnError errorCallback;

        public long sentTime = -1;

        public int resendCount = 0;
        
        public int requestId;
    }
}
