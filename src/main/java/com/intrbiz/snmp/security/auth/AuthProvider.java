package com.intrbiz.snmp.security.auth;

import java.io.IOException;

import com.intrbiz.snmp.model.v3.SNMPMessageV3;
import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.security.key.KeyProvider;

public abstract class AuthProvider
{
    protected final KeyProvider keyProvider;

    private final SNMPAuthMode authMode;

    protected AuthProvider(SNMPAuthMode authMode, KeyProvider keyProvider)
    {
        super();
        this.authMode = authMode;
        this.keyProvider = keyProvider;
    }

    public KeyProvider getKeyProvider()
    {
        return this.keyProvider;
    }

    public SNMPAuthMode getAuthMode()
    {
        return this.authMode;
    }
    
    public abstract byte[] computeExtendedKey(byte[] localisedKey);
    
    public abstract byte[] computeK1(byte[] extKey);
    
    public abstract byte[] computeK2(byte[] extKey);
    
    public abstract byte[] computeMessageHash(byte[] localisedKey, byte[] message);
    
    public abstract boolean authenticateMessage(SNMPMessageV3 message);
    
    public abstract byte[] hashMessage(SNMPMessageV3 message, byte[] encodedMessage) throws IOException;

    public static AuthProvider open(SNMPAuthMode authMode, String password)
    {
        KeyProvider keyProv = KeyProvider.open(authMode, password);
        if (SNMPAuthMode.NULL == authMode) return new NullAuthProvider(keyProv);
        else if (SNMPAuthMode.MD5 == authMode) return new MD5AuthProvider(keyProv);
        else if (SNMPAuthMode.SHA1 == authMode) return new SHA1AuthProvider(keyProv);
        return null;
    }
}
