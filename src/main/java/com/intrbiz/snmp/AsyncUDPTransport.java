package com.intrbiz.snmp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;

import org.apache.log4j.Logger;

import com.intrbiz.snmp.handler.ResponseHandler;
import com.intrbiz.snmp.model.SNMPMessage;
import com.intrbiz.snmp.model.v2.GetBulkRequestPDU;
import com.intrbiz.snmp.model.v2.SNMPMessageV2;
import com.intrbiz.snmp.model.v3.ReportPDU;
import com.intrbiz.snmp.model.v3.SNMPMessageV3;
import com.intrbiz.snmp.model.v3.USMSecurityParameters;
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
    private static final long BG_INTERVAL = 1000;
    
    private Logger logger = Logger.getLogger(AsyncUDPTransport.class);

    private boolean closed = false;

    private DatagramChannel channel;

    private Selector selector;

    private SelectionKey key;

    private ConcurrentMap<SocketAddress, SNMPContext> contexts = new ConcurrentHashMap<SocketAddress, SNMPContext>();

    private ConcurrentMap<SocketAddress, ConcurrentMap<Integer, EnqueuedMessage>> sentMessages = new ConcurrentHashMap<SocketAddress, ConcurrentMap<Integer, EnqueuedMessage>>();

    private Queue<EnqueuedMessage> sendQueue = new ConcurrentLinkedQueue<EnqueuedMessage>();

    private long lastBackgroundRun = 0;

    public AsyncUDPTransport() throws IOException
    {
        super();
        this.init();
    }

    private void init() throws IOException
    {
        // the channel to send and recv UDP packets on
        this.channel = DatagramChannel.open();
        this.channel.bind(new InetSocketAddress(InetAddress.getByAddress(new byte[] { 0, 0, 0, 0 }), 8161));
        this.channel.configureBlocking(false);
        // the selector to know when the channel can be used
        this.selector = Selector.open();
        this.key = this.channel.register(this.selector, SelectionKey.OP_READ);
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
                e.printStackTrace();
            }
        }
    }

    private void background() throws IOException
    {
        if ((System.currentTimeMillis() - this.lastBackgroundRun) >= BG_INTERVAL)
        {
            long now = System.currentTimeMillis();
            for (ConcurrentMap<Integer, EnqueuedMessage> msgGrp : this.sentMessages.values())
            {
                Iterator<Entry<Integer, EnqueuedMessage>> msgs = msgGrp.entrySet().iterator();
                while (msgs.hasNext())
                {
                    Entry<Integer, EnqueuedMessage> ent = msgs.next();
                    EnqueuedMessage msg = ent.getValue();
                    if ((now - msg.sentTime) > msg.context.getTimeOut())
                    {
                        if (msg.resendCount < msg.context.getResendCount())
                        {
                            // resend
                            logger.debug("Resend");
                            msg.resendCount++;
                            this.enqueueMessage(msg);
                        }
                        else
                        {
                            // handle the timeout
                            msg.callback.handleTimeout(msg.message, msg.target, msg.context);
                        }
                        msgs.remove();
                    }
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
                ((GetBulkRequestPDU) msg.message.getPdu()).setMaxRepetitions(10);
            }
            byte[] encoded = msg.message.encodeToBytes(msg.context);
            logger.debug("Sending " + encoded.length + " bytes");
            this.channel.send(ByteBuffer.wrap(encoded), msg.target);
            // move to the sent pool
            msg.sentTime = System.currentTimeMillis();
            this.putSentMessage(msg.target, msg.message.getId(), msg);
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
        // lookup the context
        SNMPContext context = this.getContext(from);
        if (context != null)
        {
            try
            {
                SNMPMessage msg = this.decodeMessage(buffer, context);
                // in response to
                EnqueuedMessage responseTo = this.getSentMessage(from, msg.getId());
                if (responseTo != null)
                {
                    logger.debug("Latency: " + (System.currentTimeMillis() - responseTo.sentTime));
                    //
                    if (msg instanceof SNMPMessageV3 && msg.getPdu() instanceof ReportPDU)
                    {
                        SNMPMessageV3 msgv3 = (SNMPMessageV3) msg;
                        USMSecurityParameters sp = (USMSecurityParameters) msgv3.getSecurityParameters();
                        SNMPV3Context ctxv3 = (SNMPV3Context) context;
                        // update the context
                        logger.debug("Updating EngineTime: " + sp.getAuthoritativeEngineBoots() + "::" + sp.getAuthoritativeEngineTime());
                        ctxv3.setEngineBoots(sp.getAuthoritativeEngineBoots());
                        ctxv3.setEngineTime(sp.getAuthoritativeEngineTime());
                        ctxv3.setLastEngineTimeUpdate(System.currentTimeMillis());
                        // alter the request
                        ((USMSecurityParameters) ((SNMPMessageV3) responseTo.message).getSecurityParameters()).setAuthoritativeEngineBoots(sp.getAuthoritativeEngineBoots());
                        ((USMSecurityParameters) ((SNMPMessageV3) responseTo.message).getSecurityParameters()).setAuthoritativeEngineTime(sp.getAuthoritativeEngineTime());
                        // resend the request
                        responseTo.resendCount = 0;
                        this.enqueueMessage(responseTo);
                    }
                    else if (msg.getPdu().getRequestId() == responseTo.message.getPdu().getRequestId() && responseTo.callback != null)
                    {
                        // exec the receive callback
                        this.removeSentMessage(from, msg.getId());
                        responseTo.callback.handleResponse(msg, from, responseTo.message, responseTo.context);
                    }
                    else
                    {
                        logger.warn("Unhandled response: " + msg);
                    }
                }
                else
                {
                    // exec context level callback
                    logger.warn("Unknown message received:\n" + msg);
                }
            }
            catch (IOException e)
            {
                context.setErrorCount(context.getErrorCount() + 1);
                context.setDecodeErrorCount(context.getDecodeErrorCount() + 1);
                context.setNaughtyDevice(true);
                logger.error("Device " + context.getAgent().getHostAddress() + " is naughty: " + context.getErrorCount() + " " + context.getDecodeErrorCount());
            }
        }
        else
        {
            logger.error("Could not find context for " + from);
        }
    }

    private SNMPMessage decodeMessage(ByteBuffer buffer, SNMPContext ctx) throws IOException
    {
        // parse the payload
        byte[] data = new byte[buffer.limit()];
        System.arraycopy(buffer.array(), buffer.arrayOffset(), data, 0, data.length);
        // peek at the payload to determine the message version
        SNMPVersion version = SNMPUtil.peekVersion(data, 0, data.length);
        //
        if (SNMPVersion.V3 == version)
        {
            SNMPMessageV3 msg = new SNMPMessageV3(data, ctx);
            if (logger.isTraceEnabled()) logger.trace(msg.toString());
            return msg;
        }
        else
        {
            SNMPMessageV2 msg = new SNMPMessageV2(data, ctx);
            if (logger.isTraceEnabled()) logger.trace(msg.toString());
            return msg;
        }
    }

    @Override
    void send(SNMPMessage message, SNMPContext context, ResponseHandler callback) throws IOException
    {
        if (this.closed) throw new IOException("Transport is closed, cannot send message");
        if (context.getTransport() != this) throw new IOException("The SNMPContext must first be registered with this SNMPTransport");
        // serialise
        EnqueuedMessage emsg = new EnqueuedMessage();
        emsg.context = context;
        emsg.message = message;
        emsg.target = context.getAgentSocketAddress();
        emsg.callback = callback;
        // enqueue
        this.enqueueMessage(emsg);
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
    void register(SNMPContext context)
    {
        if (context.getTransport() != this) throw new IllegalStateException("Use SNMPContext.register()!");
        this.putContext(context);
    }

    // internal helpers

    private void enqueueMessage(EnqueuedMessage emsg)
    {
        this.sendQueue.offer(emsg);
        this.key.interestOps(SelectionKey.OP_READ | SelectionKey.OP_WRITE);
    }

    private void putContext(SNMPContext context)
    {
        SocketAddress target = context.getAgentSocketAddress();
        if (!this.contexts.containsKey(target))
        {
            this.contexts.put(target, context);
            this.sentMessages.put(target, new ConcurrentHashMap<Integer, EnqueuedMessage>());
        }
    }

    private SNMPContext getContext(SocketAddress target)
    {
        return this.contexts.get(target);
    }

    private EnqueuedMessage getSentMessage(SocketAddress from, int requestId)
    {
        ConcurrentMap<Integer, EnqueuedMessage> msgs = this.sentMessages.get(from);
        if (msgs != null) { return msgs.get(requestId); }
        return null;
    }

    private void removeSentMessage(SocketAddress from, int requestId)
    {
        ConcurrentMap<Integer, EnqueuedMessage> msgs = this.sentMessages.get(from);
        if (msgs != null)
        {
            msgs.remove(requestId);
        }
    }

    private void putSentMessage(SocketAddress from, int requestId, EnqueuedMessage msg)
    {
        ConcurrentMap<Integer, EnqueuedMessage> msgs = this.sentMessages.get(from);
        if (msgs != null)
        {
            msgs.put(requestId, msg);
        }
    }

    private class EnqueuedMessage
    {
        public SNMPContext context;

        public SNMPMessage message;

        public SocketAddress target;

        public ResponseHandler callback;

        public long sentTime = -1;

        public int resendCount = 0;
    }
}
