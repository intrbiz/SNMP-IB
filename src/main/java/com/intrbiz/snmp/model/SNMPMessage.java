package com.intrbiz.snmp.model;

import java.io.IOException;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.model.v2.PDU;

public abstract class SNMPMessage extends SNMPTranscodable
{
    protected Object userContext;
    
    protected SNMPMessage()
    {
        super();
    }

    public SNMPMessage(byte[] data, SNMPContext ctx) throws IOException
    {
        super(data, ctx);
    }

    public abstract SNMPVersion getVersion();
    
    public abstract PDU getPdu();
    
    public abstract int getId();
    
    /**
     * Get the user context which is related to this message
     */
    public Object getUserContext()
    {
        return this.userContext;
    }
    
    /**
     * Set the user context which is related to this message
     */
    public void setUserContext(Object userContext)
    {
        this.userContext = userContext;
    }
}
