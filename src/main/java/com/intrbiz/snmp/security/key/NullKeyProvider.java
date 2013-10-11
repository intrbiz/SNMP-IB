package com.intrbiz.snmp.security.key;

import com.intrbiz.snmp.security.SNMPAuthMode;

public class NullKeyProvider extends KeyProvider
{
    public NullKeyProvider(String password)
    {
        super(SNMPAuthMode.NULL, password);
    }

    @Override
    public byte[] computeLocalisedKey(byte[] engineId)
    {
        return null;
    }

    @Override
    public byte[] computePrivateKey()
    {
        return null;
    }

    @Override
    public byte[] getPrivateKey()
    {
        return null;
    }

}
