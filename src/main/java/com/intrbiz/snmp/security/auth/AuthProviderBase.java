package com.intrbiz.snmp.security.auth;

import java.io.IOException;
import java.util.Arrays;

import org.bouncycastle.crypto.Digest;

import com.intrbiz.snmp.model.v3.SNMPMessageV3;
import com.intrbiz.snmp.model.v3.USMSecurityParameters;
import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.security.key.KeyProvider;
import com.intrbiz.snmp.util.SNMPUtil;

public abstract class AuthProviderBase extends AuthProvider
{    
    protected AuthProviderBase(SNMPAuthMode authMode, KeyProvider keyProvider)
    {
        super(authMode, keyProvider);
    }
    
    protected abstract Digest createDigest();
    
    @Override
    public byte[] computeExtendedKey(byte[] localisedKey)
    {
        byte[] extKey = new byte[64];
        System.arraycopy(localisedKey, 0, extKey, 0, localisedKey.length);
        return extKey;
    }
    
    @Override
    public byte[] computeK1(byte[] extKey)
    {
        byte[] k1 = new byte[64];
        for (int i = 0; i < extKey.length; i++)
        {
            k1[i] = (byte) (extKey[i] ^ 0x36);
        }
        return k1;
    }
    
    @Override
    public byte[] computeK2(byte[] extKey)
    {
        byte[] k1 = new byte[64];
        for (int i = 0; i < extKey.length; i++)
        {
            k1[i] = (byte) (extKey[i] ^ 0x5c);
        }
        return k1;
    }
    
    @Override
    public byte[] computeMessageHash(byte[] localisedKey, byte[] message)
    {
        Digest digest = this.createDigest();
        byte[] extKey = this.computeExtendedKey(localisedKey);
        byte[] k1     = this.computeK1(extKey);
        byte[] k2     = this.computeK2(extKey);
        byte[] ir     = new byte[digest.getDigestSize()];
        byte[] ret    = new byte[12];
        // round one
        digest.update(k1, 0, k1.length);
        digest.update(message, 0, message.length);
        digest.doFinal(ir, 0);
        // round two
        digest.update(k2, 0, k2.length);
        digest.update(ir, 0, ir.length);
        digest.doFinal(ir, 0);
        // return hash
        System.arraycopy(ir, 0, ret, 0, 12);
        return ret;
    }
    
    @Override
    public boolean authenticateMessage(SNMPMessageV3 message)
    {   
        USMSecurityParameters usmSP = (USMSecurityParameters) message.getSecurityParameters();
        // localise the key
        byte[] localisedKey = this.getKeyProvider().computeLocalisedKey(usmSP.getAuthoritativeEngineId());
        /*
        // this feels hacky, but it is important the message stays in its binary form 
        // clone the security parameters
        byte[] secParams = SNMPUtil.cloneBytes(usmSP.getDecodedFrom());
        // replace the hash with zeros
        SNMPUtil.byteReplace(secParams, usmSP.getAuthenticationParameters(), new byte[12]);
        // replace the secParams in the message so we have the original message with the hash blanked
        SNMPUtil.byteReplace(message.getDecodedFrom(), usmSP.getDecodedFrom(), secParams);
        */
        SNMPUtil.replaceAuthenticationHash(message.getDecodedFrom(), new byte[12]);
        // compute the hash
        byte[] computedHash = this.computeMessageHash(localisedKey, message.getDecodedFrom());
        return Arrays.equals(computedHash, usmSP.getAuthenticationParameters());
    }
    
    public byte[] hashMessage(SNMPMessageV3 message, byte[] encodedMessage) throws IOException
    {
        USMSecurityParameters usmSP = (USMSecurityParameters) message.getSecurityParameters();
        // localise the key
        byte[] localisedKey = this.getKeyProvider().computeLocalisedKey(usmSP.getAuthoritativeEngineId());
        // compute the hash
        byte[] computedHash = this.computeMessageHash(localisedKey, encodedMessage);
        /*
        // this feels hacky, but it is important the message stays in its binary form 
        // clone the security parameters
        byte[] secParams = usmSP.encodeToBytes(null);
        byte[] secParamsClone = SNMPUtil.cloneBytes(secParams);
        // replace the hash with zeros
        SNMPUtil.byteReplace(secParamsClone, usmSP.getAuthenticationParameters(), computedHash);
        // replace the secParams in the message so we have the original message with the hash blanked
        SNMPUtil.byteReplace(encodedMessage, secParams, secParamsClone);
        */
        SNMPUtil.replaceAuthenticationHash(encodedMessage, computedHash);
        return encodedMessage;
    }
    
}
