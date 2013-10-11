package com.intrbiz.snmp.model;

import java.io.IOException;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.model.v2.PDU;

public abstract class SNMPMessage extends SNMPTranscodable
{
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
}
