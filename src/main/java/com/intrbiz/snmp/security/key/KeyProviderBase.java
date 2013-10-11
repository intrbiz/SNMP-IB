package com.intrbiz.snmp.security.key;

import org.bouncycastle.crypto.Digest;

import com.intrbiz.snmp.security.SNMPAuthMode;

public abstract class KeyProviderBase extends KeyProvider
{
    private byte[] privateKey = null;
    
    protected KeyProviderBase(SNMPAuthMode mode, String password)
    {
        super(mode, password);
    }
    
    protected abstract Digest createDigest();
    
    @Override
    public byte[] getPrivateKey()
    {
        if (this.privateKey == null) this.privateKey = this.computePrivateKey();
        return this.privateKey;
    }
    
    /**
     * Compute the SNMP V3 private key from the password
     */
    @Override
    public byte[] computePrivateKey()
    {
        byte[] pw = this.getPasswordBytes();
        Digest digest = this.createDigest();
        // the password is rotated until 1 MiB has been hashed
        byte[] key = new byte[digest.getDigestSize()];
        for (int c = 0; c < 1048576; c += pw.length)
        {
            digest.update(pw, 0, ((1048576 - c) <  pw.length) ? (1048576 - c) : pw.length);
        } 
        digest.doFinal(key, 0);
        return key;
    }

    /**
     * Compute the localised key for the given engine ID
     */
    @Override
    public byte[] computeLocalisedKey(byte[] engineId)
    {
        byte[] key = this.getPrivateKey();
        Digest digest = this.createDigest();
        //
        byte[] lkey = new byte[digest.getDigestSize()];
        digest.update(key, 0, key.length);
        digest.update(engineId, 0, engineId.length);
        digest.update(key, 0, key.length);
        digest.doFinal(lkey, 0);
        return lkey;
    }
}
