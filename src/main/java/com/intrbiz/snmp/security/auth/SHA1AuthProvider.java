package com.intrbiz.snmp.security.auth;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;

import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.security.key.KeyProvider;

public class SHA1AuthProvider extends AuthProviderBase
{
    public SHA1AuthProvider(KeyProvider keyProvider)
    {
        super(SNMPAuthMode.SHA1, keyProvider);
    }

    @Override
    protected Digest createDigest()
    {
        return new SHA1Digest();
    }
}
