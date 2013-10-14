package com.intrbiz.snmp.security.key;

import com.intrbiz.snmp.security.SNMPAuthMode;

public abstract class KeyProvider
{
    private final SNMPAuthMode mode;
    
    protected String password;
    
    protected byte[] passwordBytes;
    
    protected KeyProvider(SNMPAuthMode mode, String password)
    {
        super();
        this.mode = mode;
        this.password = password;
    }
    
    public SNMPAuthMode getAuthMode()
    {
        return this.mode;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    public byte[] getPasswordBytes()
    {
        if (this.passwordBytes == null) this.passwordBytes = this.computePasswordBytes();
        return this.passwordBytes;
    }
    
    public byte[] computePasswordBytes()
    {
        byte[] pw = new byte[this.password.length()];
        for (int i = 0; i < pw.length; i++)
        {
            pw[i] = (byte) (this.password.charAt(i) & 0xFF);
        }
        return pw;
    }
    
    public abstract byte[] computeLocalisedKey(byte[] engineId);
    
    public abstract byte[] computePrivateKey();
    
    public abstract byte[] getPrivateKey();
    
    public static KeyProvider open(SNMPAuthMode mode, String password)
    {
        if (SNMPAuthMode.NONE == mode) return new NullKeyProvider(password);
        else if (SNMPAuthMode.MD5 == mode) return new MD5KeyProvider(password);
        else if (SNMPAuthMode.SHA1 == mode) return new SHA1KeyProvider(password);
        return null;
    }
}
