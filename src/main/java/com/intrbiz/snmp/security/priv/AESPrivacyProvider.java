package com.intrbiz.snmp.security.priv;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.log4j.Logger;

import com.intrbiz.snmp.model.v3.SNMPMessageV3;
import com.intrbiz.snmp.model.v3.USMSecurityParameters;
import com.intrbiz.snmp.security.SNMPPrivMode;
import com.intrbiz.snmp.security.key.KeyProvider;
import com.intrbiz.snmp.util.SNMPUtil;

public class AESPrivacyProvider extends PrivacyProvider
{
    private Logger logger = Logger.getLogger(AESPrivacyProvider.class);
    
    public AESPrivacyProvider(KeyProvider keyProvider)
    {
        super(SNMPPrivMode.AES128, keyProvider);
    }

    public byte[] computeAESKey(SNMPMessageV3 message)
    {
        USMSecurityParameters usmSP = (USMSecurityParameters) message.getSecurityParameters();
        byte[] localisedKey = this.getKeyProvider().computeLocalisedKey(usmSP.getAuthoritativeEngineId());
        byte[] key = new byte[16];
        System.arraycopy(localisedKey, 0, key, 0, 16);
        return key;
    }

    public byte[] computeAESIV(SNMPMessageV3 message)
    {
        USMSecurityParameters usmSP = (USMSecurityParameters) message.getSecurityParameters();
        ByteBuffer ivDrip = ByteBuffer.wrap(new byte[16]);
        ivDrip.putInt(usmSP.getAuthoritativeEngineBoots());
        ivDrip.putInt(usmSP.getAuthoritativeEngineTime());
        ivDrip.put(usmSP.getPrivacyParameters(), 0, 8);
        return ivDrip.array();
    }

    @Override
    public byte[] decrypt(SNMPMessageV3 message, byte[] data) throws IOException
    {
        byte[] aesKey = this.computeAESKey(message);
        byte[] aesIV = this.computeAESIV(message);
        try
        {
            Cipher aes = Cipher.getInstance("AES/CFB/NoPadding");
            aes.init(Cipher.DECRYPT_MODE, new SecretKeySpec(aesKey, "AES"), new IvParameterSpec(aesIV));
            byte[] decrypted = aes.doFinal(data);
            logger.debug("Decrypted: " + SNMPUtil.dumpArray(decrypted));
            return decrypted;
        }
        catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException e)
        {
            throw new IOException("Failed to decrypt message payload", e);
        }
    }
    
    @Override
    public byte[] encrypt(SNMPMessageV3 message, byte[] data) throws IOException
    {
        byte[] aesKey = this.computeAESKey(message);
        byte[] aesIV = this.computeAESIV(message);
        try
        {
            Cipher aes = Cipher.getInstance("AES/CFB/NoPadding");
            aes.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(aesKey, "AES"), new IvParameterSpec(aesIV));
            byte[] encrypted = aes.doFinal(data);
            logger.debug("Encrypted: " + SNMPUtil.dumpArray(encrypted));
            return encrypted;
        }
        catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException e)
        {
            throw new IOException("Failed to encrypt message payload", e);
        }
    }

}
