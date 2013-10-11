package com.intrbiz.snmp.security.auth;

import com.intrbiz.snmp.model.v3.SNMPMessageV3;
import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.security.key.KeyProvider;

public class NullAuthProvider extends AuthProvider
{
    public NullAuthProvider(KeyProvider keyProvider)
    {
        super(SNMPAuthMode.NULL, keyProvider);
    }

    @Override
    public byte[] computeExtendedKey(byte[] localisedKey)
    {
        return null;
    }

    @Override
    public byte[] computeK1(byte[] extKey)
    {
        return null;
    }

    @Override
    public byte[] computeK2(byte[] extKey)
    {
        return null;
    }

    @Override
    public byte[] computeMessageHash(byte[] localisedKey, byte[] message)
    {
        return null;
    }

    @Override
    public boolean authenticateMessage(SNMPMessageV3 message)
    {
        return true;
    }
    
    @Override
    public byte[] hashMessage(SNMPMessageV3 message, byte[] encodedMessage)
    {
        return encodedMessage;
    }
}
