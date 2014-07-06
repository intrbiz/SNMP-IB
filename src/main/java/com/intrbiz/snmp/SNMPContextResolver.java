package com.intrbiz.snmp;

public interface SNMPContextResolver
{    
    SNMPContext<?> lookupContext(int requestId, byte[] engineId);
}
