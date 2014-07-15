package com.intrbiz.snmp.test;

import org.junit.Assert;
import org.junit.Test;

import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.security.key.KeyProvider;
import com.intrbiz.snmp.util.SNMPUtil;

/**
 * Tests taken from the RFC
 */
public class TestMD5Key
{
    private static final String PASSWORD = "maplesyrup";
    
    private static final byte[] EXPECTED_PRIV_KEY = SNMPUtil.fromHex("9faf3283884e92834ebc9847d8edd963");
    
    private static final byte[] ENGINE_ID = SNMPUtil.fromHex("000000000000000000000002");
    
    private static final byte[] EXPECTED_LOCAL_KEY = SNMPUtil.fromHex("526f5eed9fcce26f8964c2930787d82b");
    
    @Test
    public void testPrivateKey()
    {
        KeyProvider ap = KeyProvider.open(SNMPAuthMode.MD5, PASSWORD);
        Assert.assertArrayEquals(EXPECTED_PRIV_KEY, ap.computePrivateKey());
    }
    
    @Test
    public void testLocalisedKey()
    {
        KeyProvider ap = KeyProvider.open(SNMPAuthMode.MD5, PASSWORD);
        Assert.assertArrayEquals(EXPECTED_LOCAL_KEY, ap.computeLocalisedKey(ENGINE_ID));
    }
}
