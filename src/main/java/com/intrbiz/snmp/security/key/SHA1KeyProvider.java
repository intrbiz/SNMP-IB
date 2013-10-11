package com.intrbiz.snmp.security.key;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;

import com.intrbiz.snmp.security.SNMPAuthMode;

public class SHA1KeyProvider extends KeyProviderBase
{
    public SHA1KeyProvider(String password)
    {
        super(SNMPAuthMode.SHA1, password);
    }

    @Override
    protected Digest createDigest()
    {
        return new SHA1Digest();
    }
}
