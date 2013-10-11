package com.intrbiz.snmp;

import java.io.IOException;

import com.intrbiz.snmp.handler.ResponseHandler;
import com.intrbiz.snmp.model.SNMPMessage;

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
    abstract void register(SNMPContext context);

    /**
     * Internal method, use SNMPContext.send()
     */
    abstract void send(SNMPMessage message, SNMPContext context, ResponseHandler callback) throws IOException;

    /**
     * Create a default SNMPTransport implementation
     */
    public static final SNMPTransport open() throws IOException
    {
        return new AsyncUDPTransport();
    }

}
