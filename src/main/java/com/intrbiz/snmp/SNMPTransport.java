package com.intrbiz.snmp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;

import com.intrbiz.snmp.handler.OnError;
import com.intrbiz.snmp.handler.OnMessage;
import com.intrbiz.snmp.handler.OnTrap;
import com.intrbiz.snmp.handler.OnUnknown;
import com.intrbiz.snmp.model.SNMPMessage;
import com.intrbiz.snmp.poller.SNMPJob;
import com.intrbiz.snmp.transport.AsyncUDPTransport;
import com.intrbiz.snmp.transport.DispatchingAsyncUDPTransport;

/**
 * A transport sends and received SNMPMessages
 */
public abstract class SNMPTransport implements Runnable
{
    protected OnTrap globalTrapHandler;
    
    protected OnUnknown globalUnknownHandler;
    
    public SNMPTransport() throws IOException
    {
        super();
    }
    
    public abstract void close();
    
    /**
     * Internal method, use SNMPContext.register()
     */
    protected abstract <T extends SNMPContext<T>> SNMPContext<T> register(SNMPContext<T> context);

    /**
     * Internal method, use SNMPContext.send()
     */
    protected abstract void send(SNMPMessage message, SNMPContext<?> context, OnMessage messageCallback, OnError errorCallback) throws IOException;
    
    /**
     * Schedule the given job
     */
    protected abstract SNMPJob schedule(SNMPJob job);

    /**
     * Create a default SNMPTransport implementation using the 
     * default client UDP port
     */
    public static final SNMPTransport open() throws IOException
    {
        return new AsyncUDPTransport();
    }
    
    /**
     * Create a default SNMPTransport implementation using the 
     * given client UDP port
     */
    public static final SNMPTransport open(int port) throws IOException
    {
        return new AsyncUDPTransport(port);
    }
    
    /**
     * Create a default SNMPTransport implementation using the 
     * default client UDP port and which executes callbacks in a 
     * thread pool
     */
    public static final SNMPTransport openThreaded() throws IOException
    {
        return new DispatchingAsyncUDPTransport();
    }
    
    /**
     * Create a default SNMPTransport implementation using the 
     * given client UDP port and which executes callbacks in a 
     * thread pool
     */
    public static final SNMPTransport openThreaded(int port) throws IOException
    {
        return new DispatchingAsyncUDPTransport(port);
    }
    
    /**
     * Create a default SNMPTransport implementation using the 
     * default client UDP port and which executes callbacks in the 
     * given thread pool
     */
    public static final SNMPTransport openThreaded(ExecutorService executor) throws IOException
    {
        return new DispatchingAsyncUDPTransport(executor);
    }
    
    /**
     * Create a default SNMPTransport implementation using the 
     * given client UDP port and which executes callbacks in the 
     * given thread pool
     */
    public static final SNMPTransport openThreaded(int port, ExecutorService executor) throws IOException
    {
        return new DispatchingAsyncUDPTransport(port, executor);
    }
    
    // handlers
    
    public OnTrap getGlobalTrapHandler()
    {
        return globalTrapHandler;
    }

    public SNMPTransport setGlobalTrapHandler(OnTrap globalTrapHandler)
    {
        this.globalTrapHandler = globalTrapHandler;
        return this;
    }

    public OnUnknown getGlobalUnknownHandler()
    {
        return globalUnknownHandler;
    }

    public SNMPTransport setGlobalUnknownHandler(OnUnknown globalUnknownHandler)
    {
        this.globalUnknownHandler = globalUnknownHandler;
        return this;
    }

    // Context creation methods
    
    public abstract SNMPContext<?> getContext(SNMPContextId id);
    
    public abstract SNMPContext<?> getContext(String host);
    
    public abstract SNMPContext<?> getContext(String host, String engineId);
    
    /**
     * Create a context for a SNMP V1 device registered with this transport
     */
    public SNMPV1Context openV1Context(InetAddress agent, int port)
    {
       SNMPV1Context ctx = new SNMPV1Context(agent, port) {
           @Override
           public void send(SNMPMessage message, OnMessage messageCallback, OnError errorCallback) throws IOException
           {
               SNMPTransport.this.send(message, this, messageCallback, errorCallback);
           }

           @Override
           public SNMPJob schedule(SNMPJob job)
           {
               return SNMPTransport.this.schedule(job);
           }
       };
       this.register(ctx);
       return ctx;
    }
    
    public SNMPV1Context openV1Context(InetAddress agent)
    {
        return this.openV1Context(agent, 161);
    }
    
    public SNMPV1Context openV1Context(String agent) throws UnknownHostException
    {
        return this.openV1Context(InetAddress.getByName(agent));
    }
    
    public SNMPV1Context openV1Context(String agent, String community) throws UnknownHostException
    {
        return this.openV1Context(InetAddress.getByName(agent)).setCommunity(community);
    }
    
    /**
     * Create a context for a SNMP V2 device registered with this transport
     */
    public SNMPV2Context openV2Context(InetAddress agent, int port)
    {
       SNMPV2Context ctx = new SNMPV2Context(agent, port)
       {
            @Override
            public void send(SNMPMessage message, OnMessage messageCallback, OnError errorCallback) throws IOException
            {
                SNMPTransport.this.send(message, this, messageCallback, errorCallback);
            }
            
            @Override
            public SNMPJob schedule(SNMPJob job)
            {
                return SNMPTransport.this.schedule(job);
            }
       };
       this.register(ctx);
       return ctx;
    }
    
    public SNMPV2Context openV2Context(InetAddress agent)
    {
        return this.openV2Context(agent, 161);
    }
    
    public SNMPV2Context openV2Context(String agent) throws UnknownHostException
    {
        return this.openV2Context(InetAddress.getByName(agent));
    }
    
    public SNMPV2Context openV2Context(String agent, String community) throws UnknownHostException
    {
        return this.openV2Context(InetAddress.getByName(agent)).setCommunity(community);
    }
    
    /**
     * Create a context for a SNMP V3 device registered with this transport, which will discover the engine id
     */
    public SNMPV3Context openV3Context(InetAddress agent, int port)
    {
        SNMPV3Context ctx = new SNMPV3Context(agent, port)
        {
            @Override
            public void send(SNMPMessage message, OnMessage messageCallback, OnError errorCallback) throws IOException
            {
                SNMPTransport.this.send(message, this, messageCallback, errorCallback);
            }
            
            @Override
            public SNMPJob schedule(SNMPJob job)
            {
                return SNMPTransport.this.schedule(job);
            }
        };
        ctx.setDiscover();
        this.register(ctx);
        return ctx;
    }
    
    /**
     * Create a context for a SNMP V3 device registered with this transport
     */
    public SNMPV3Context openV3Context(InetAddress agent, int port, String engineId)
    {
        SNMPV3Context ctx = new SNMPV3Context(agent, port)
        {
            @Override
            public void send(SNMPMessage message, OnMessage messageCallback, OnError errorCallback) throws IOException
            {
                SNMPTransport.this.send(message, this, messageCallback, errorCallback);
            }
            
            @Override
            public SNMPJob schedule(SNMPJob job)
            {
                return SNMPTransport.this.schedule(job);
            }
        };
        ctx.setEngineId(engineId);
        this.register(ctx);
        return ctx;
    }
    
    public SNMPV3Context openV3Context(InetAddress agent)
    {
        return this.openV3Context(agent, 161);
    }
    
    public SNMPV3Context openV3Context(InetAddress agent, String engineId)
    {
        return this.openV3Context(agent, 161, engineId);
    }
    
    public SNMPV3Context openV3Context(String agent, String engineId) throws UnknownHostException
    {
        return this.openV3Context(InetAddress.getByName(agent), engineId);
    }
    
    public SNMPV3Context openV3Context(String agent) throws UnknownHostException
    {
        return this.openV3Context(InetAddress.getByName(agent));
    }
}
