package com.intrbiz.snmp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import com.intrbiz.snmp.handler.ResponseHandler;
import com.intrbiz.snmp.model.SNMPMessage;
import com.intrbiz.snmp.transport.AsyncUDPTransport;

/**
 * A transport sends and received SNMPMessages
 */
public abstract class SNMPTransport implements Runnable
{
    public SNMPTransport() throws IOException
    {
        super();
    }
    
    public abstract void close();
    
    /**
     * Internal method, use SNMPContext.register()
     */
    protected abstract void register(SNMPContext<?> context);

    /**
     * Internal method, use SNMPContext.send()
     */
    protected abstract void send(SNMPMessage message, SNMPContext<?> context, ResponseHandler callback) throws IOException;

    /**
     * Create a default SNMPTransport implementation
     */
    public static final SNMPTransport open() throws IOException
    {
        return new AsyncUDPTransport();
    }

    // Context creation methods
    
    /**
     * Create a context for a SNMP V2 device registered with this transport
     */
    public SNMPV2Context openV2Context(InetAddress agent, int port)
    {
       SNMPV2Context ctx = new SNMPV2Context(agent, port) {
        @Override
        protected void send(SNMPMessage message, SNMPContext<?> context, ResponseHandler callback) throws IOException
        {
            SNMPTransport.this.send(message, context, callback);
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
    
    /**
     * Create a context for a SNMP V3 device registered with this transport, which will discover the engine id
     */
    public SNMPV3Context openV3Context(InetAddress agent, int port)
    {
        SNMPV3Context ctx = new SNMPV3Context(agent, port) {
            @Override
            protected void send(SNMPMessage message, SNMPContext<?> context, ResponseHandler callback) throws IOException
            {
                SNMPTransport.this.send(message, context, callback);
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
        SNMPV3Context ctx = new SNMPV3Context(agent, port) {
            @Override
            protected void send(SNMPMessage message, SNMPContext<?> context, ResponseHandler callback) throws IOException
            {
                SNMPTransport.this.send(message, context, callback);
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
