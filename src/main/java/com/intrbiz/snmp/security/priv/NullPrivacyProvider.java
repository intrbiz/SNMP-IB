package com.intrbiz.snmp.security.priv;

import java.io.IOException;

import com.intrbiz.snmp.model.v3.SNMPMessageV3;
import com.intrbiz.snmp.security.SNMPPrivMode;
import com.intrbiz.snmp.security.key.KeyProvider;

public class NullPrivacyProvider extends PrivacyProvider
{
    public NullPrivacyProvider(KeyProvider keyProvider)
    {
        super(SNMPPrivMode.NONE, keyProvider);
    }

    @Override
    public byte[] decrypt(SNMPMessageV3 message, byte[] data) throws IOException
    {
        return data;
    }
    
    @Override
    public byte[] encrypt(SNMPMessageV3 message, byte[] data) throws IOException
    {
        return data;
    }

}
