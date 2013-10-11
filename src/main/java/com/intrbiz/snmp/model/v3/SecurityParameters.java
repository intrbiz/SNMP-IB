package com.intrbiz.snmp.model.v3;

import java.io.IOException;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.model.SNMPTranscodable;

public abstract class SecurityParameters extends SNMPTranscodable
{
    public SecurityParameters()
    {
        super();
    }

    public SecurityParameters(byte[] data, SNMPContext ctx) throws IOException
    {
        super(data, ctx);
    }
}
