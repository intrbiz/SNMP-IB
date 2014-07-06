package com.intrbiz.snmp.security.priv;

import java.io.IOException;
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

public class DESPrivacyProvider extends PrivacyProvider
{
    private Logger logger = Logger.getLogger(DESPrivacyProvider.class);

    public DESPrivacyProvider(KeyProvider keyProvider)
    {
        super(SNMPPrivMode.DES, keyProvider);
    }

    public byte[] computeDESKey(SNMPMessageV3 message)
    {
        USMSecurityParameters usmSP = (USMSecurityParameters) message.getSecurityParameters();
        byte[] localisedKey = this.getKeyProvider().computeLocalisedKey(usmSP.getAuthoritativeEngineId());
        logger.debug("Localised key length: " + localisedKey.length);
        byte[] key = new byte[8];
        System.arraycopy(localisedKey, 0, key, 0, 8);
        return key;
    }

    public byte[] computeDESIV(SNMPMessageV3 message)
    {
        USMSecurityParameters usmSP = (USMSecurityParameters) message.getSecurityParameters();
        byte[] localisedKey = this.getKeyProvider().computeLocalisedKey(usmSP.getAuthoritativeEngineId());
        byte[] salt = usmSP.getPrivacyParameters();
        byte[] iv = new byte[8];
        for (int i = 0; i < iv.length; i++)
        {
            iv[i] = (byte) (salt[i] ^ localisedKey[i + 8]);
        }
        return iv;
    }

    @Override
    public byte[] decrypt(SNMPMessageV3 message, byte[] data) throws IOException
    {
        byte[] desKey = this.computeDESKey(message);
        byte[] desIV = this.computeDESIV(message);
        try
        {
            Cipher des = Cipher.getInstance("DES/CBC/NoPadding");
            des.init(Cipher.DECRYPT_MODE, new SecretKeySpec(desKey, "DES"), new IvParameterSpec(desIV));
            byte[] decrypted = des.doFinal(data);
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
        byte[] desKey = this.computeDESKey(message);
        byte[] desIV = this.computeDESIV(message);
        try
        {
            Cipher des = Cipher.getInstance("DES/CBC/NoPadding");
            des.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(desKey, "DES"), new IvParameterSpec(desIV));
            // we have to manually pad
            byte[] paddedData = new byte[data.length + (8 - (data.length % 8))];
            System.arraycopy(data, 0, paddedData, 0, data.length);
            byte[] encrypted = des.doFinal(paddedData);
            logger.debug("Encrypted: " + SNMPUtil.dumpArray(encrypted));
            return encrypted;
        }
        catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException e)
        {
            throw new IOException("Failed to encrypt message payload", e);
        }
    }

}
