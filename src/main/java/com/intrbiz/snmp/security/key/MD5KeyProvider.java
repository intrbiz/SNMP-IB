package com.intrbiz.snmp.security.key;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD5Digest;

import com.intrbiz.snmp.security.SNMPAuthMode;

public class MD5KeyProvider extends KeyProviderBase
{
    public MD5KeyProvider(String password)
    {
        super(SNMPAuthMode.MD5, password);
    }

    @Override
    protected Digest createDigest()
    {
        return new MD5Digest();
    }
}
