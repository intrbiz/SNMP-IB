package com.intrbiz.snmp.model.v3;

import java.io.IOException;

import com.intrbiz.snmp.model.SNMPTranscodable;

public abstract class SecurityParameters extends SNMPTranscodable
{
    public SecurityParameters()
    {
        super();
    }

    public SecurityParameters(byte[] data) throws IOException
    {
        super(data);
    }
}
