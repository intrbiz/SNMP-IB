package com.intrbiz.snmp.security.priv;

import java.io.IOException;
import java.security.SecureRandom;

import com.intrbiz.snmp.model.v3.SNMPMessageV3;
import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.security.SNMPPrivMode;
import com.intrbiz.snmp.security.key.KeyProvider;

public abstract class PrivacyProvider
{
    private final KeyProvider keyProvider;

    private final SNMPPrivMode privMode;

    protected PrivacyProvider(SNMPPrivMode privMode, KeyProvider keyProvider)
    {
        super();
        this.privMode = privMode;
        this.keyProvider = keyProvider;
    }

    public KeyProvider getKeyProvider()
    {
        return this.keyProvider;
    }

    public SNMPPrivMode getPrivMode()
    {
        return this.privMode;
    }
    
    public byte[] genSalt()
    {
        byte[] salt = new byte[8];
        new SecureRandom().nextBytes(salt);
        return salt;
    }
    
    public abstract byte[] decrypt(SNMPMessageV3 message, byte[] data) throws IOException;
    
    public abstract byte[] encrypt(SNMPMessageV3 message, byte[] data) throws IOException;

    public static PrivacyProvider open(SNMPAuthMode authMode, SNMPPrivMode privMode, String password)
    {
        KeyProvider keyProv = KeyProvider.open(authMode, password);
        if (SNMPPrivMode.NULL == privMode) return new NullPrivacyProvider(keyProv);
        else if (SNMPPrivMode.AES128 == privMode) return new AESPrivacyProvider(keyProv);
        else if (SNMPPrivMode.DES == privMode) return new DESPrivacyProvider(keyProv);
        return null;
    }
}
