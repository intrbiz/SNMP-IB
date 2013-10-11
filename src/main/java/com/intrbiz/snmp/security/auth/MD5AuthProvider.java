package com.intrbiz.snmp.security.auth;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD5Digest;

import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.security.key.KeyProvider;

public class MD5AuthProvider extends AuthProviderBase
{
    public MD5AuthProvider(KeyProvider keyProvider)
    {
        super(SNMPAuthMode.MD5, keyProvider);
    }

    @Override
    protected Digest createDigest()
    {
        return new MD5Digest();
    }
}
