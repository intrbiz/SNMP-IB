package com.intrbiz.snmp.test;

import org.junit.Assert;
import org.junit.Test;

import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.security.key.KeyProvider;
import com.intrbiz.snmp.util.SNMPUtil;

/**
 * Tests taken from the RFC
 */
public class SHA1KeyTests
{
    private static final String PASSWORD = "maplesyrup";
    
    private static final byte[] EXPECTED_PRIV_KEY = SNMPUtil.fromHex("9fb5cc0381497b3793528939ff788d5d79145211");
    
    private static final byte[] ENGINE_ID = SNMPUtil.fromHex("000000000000000000000002");
    
    private static final byte[] EXPECTED_LOCAL_KEY = SNMPUtil.fromHex("6695febc9288e36282235fc7151f128497b38f3f");
    
    @Test
    public void testPrivateKey()
    {
        KeyProvider ap = KeyProvider.open(SNMPAuthMode.SHA1, PASSWORD);
        Assert.assertArrayEquals(EXPECTED_PRIV_KEY, ap.computePrivateKey());
    }
    
    @Test
    public void testLocalisedKey()
    {
        KeyProvider ap = KeyProvider.open(SNMPAuthMode.SHA1, PASSWORD);
        Assert.assertArrayEquals(EXPECTED_LOCAL_KEY, ap.computeLocalisedKey(ENGINE_ID));
    }
}
