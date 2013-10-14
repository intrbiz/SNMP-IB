package com.intrbiz.snmp.test;

import org.junit.Test;

import com.intrbiz.snmp.SNMPV3Context;
import com.intrbiz.snmp.model.v3.SNMPMessageV3;
import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.security.SNMPPrivMode;
import com.intrbiz.snmp.util.SNMPUtil;

/**
 * Some decoder tests with data captured from Wireshark
 */
public class V3MessageDecodeTests
{
    private static final byte[] MSG_0_3  = SNMPUtil.fromHex("308200c70201033010020471d0822f020205dc04010302010304373035040c8000002b0016e0357e4068770201190203136ce2040561646d696e040cb75f4fea5b0e6315606a66200408ec520000cd0000000477f292039037de1c9816d7d581f4ee51db8afe995bb4262d2be647b0a3793c735cd062280a5680c2e915d7faabf866aeefc8c2a46e9575f5bd1a0174da0b34644965c4bd5d4ca22c3b2ab30f3760cb562c71dee2780a6637c61150efa13f4542850f16bc89f18c0e3a5d538565aca4a28b43e33b915eac2b");
    
    
    private static final byte[] MSG_1_0 = SNMPUtil.fromHex("307f0201033011020448616a17020300ffe304010702010304353033040c8000002b0016e0357e406877020100020100040561646d696e040cfb94e4b859e6a39ce6ca213004089bbfd827459a6cfa043062b386cedcf917be4a0fb69b39b120aeff631ebcda55474f52ecb83efd6626c1a9b7e621d06a5443ac7f6a78105de0fd");
    private static final byte[] MSG_1_1 = SNMPUtil.fromHex("30760201033010020448616a17020205dc040101020103042f302d040c8000002b0016e0357e406877020119020315e7ce040561646d696e040c9956619972f576d10fa5c7520400302e040c8000002b0016e0357e4068770400a81c0201000201000201003011300f060a2b060106030f01010200410110");
    private static final byte[] MSG_1_2 = SNMPUtil.fromHex("3081810201033011020448616a18020300ffe304010702010304373035040c8000002b0016e0357e406877020119020315e7ce040561646d696e040cceb1a347607e23076101344204089bbfd827459a6cfb0430f670d314e63f8ad253d2bf318bd11ebaa998f836425369f4aeab17a5b8e0ff16f0ac6db4c2c256df859a22fa7a166505");
    private static final byte[] MSG_1_3 = SNMPUtil.fromHex("308200c7020103301002046551bff0020205dc04010302010304373035040c8000002b0016e0357e406877020119020315ecbd040561646d696e040c2fb8d9a1cc9f544a4bd452890408f51e0000201000000477ea1f669203eeec3cb4ead1cceaf660331bf8121deb7969b3f74c38d6edbdd84d7ee3f2b0eb7e67bdc7a464db323a62ded9830055b8dd20b0b9bf4d53585cf16be4cd40f64412089392088341b4e64e839bf5f50b372f5e9d4a3916af22396c998eb90cb4b525f60b3ff8b4420d5070eea9dbdd8fa07c7a");
    
    // plain
    private static final byte[] MSG_2_0 = SNMPUtil.fromHex("30690201033011020438da0cd3020300ffe30401040201030421301f040c8000002b0016e0357e406877020100020100040561646d696e04000400302e040c8000002b0016e0357e4068770400a01c020474de8c75020100020100300e300c06082b060102010101000500");
    private static final byte[] MSG_2_1 = SNMPUtil.fromHex("308200bd0201033010020438da0cd3020205dc040100020103042f302d040c8000002b0016e0357e406877020119020315eda0040561646d696e040c00000000000000000000000004003075040c8000002b0016e0357e4068770400a263020474de8c750201000201003055305306082b06010201010100044733436f6d2053776974636820353530302d45492032382d506f7274205420536f6674776172652056657273696f6e2033436f6d204f532056332e30332e30327331363865703231");
    
    private static final SNMPV3Context CTX = createContext();
    private static final SNMPV3Context PLAIN_CTX = createPlainContext();
    
    public static final SNMPV3Context createContext()
    {
        SNMPV3Context ctx = new SNMPV3Context(null, null, 0);
        ctx.setUser("admin", SNMPAuthMode.SHA1, SNMPPrivMode.AES128, "abcde12345");
        ctx.setEngineId("8000002B0016E0357E406877");
        return ctx;
    }
    
    public static final SNMPV3Context createPlainContext()
    {
        SNMPV3Context ctx = new SNMPV3Context(null, null, 0);
        ctx.setUser("admin", SNMPAuthMode.NULL, SNMPPrivMode.NULL, "abcde12345");
        ctx.setEngineId("8000002B0016E0357E406877");
        return ctx;
    }
    
    public static final byte[] clone(byte[] msg)
    {
        byte[] b = new byte[msg.length];
        System.arraycopy(msg, 0, b, 0, msg.length);
        return b;
    }
    
    @Test
    public void testMessage_0_3() throws Exception
    {
        SNMPMessageV3 msg = new SNMPMessageV3(clone(MSG_0_3), CTX);
        System.out.println(msg);
        System.out.println("Authentic: " + CTX.getAuthProvider().authenticateMessage(msg));   
    }
    
    @Test
    public void testMessage_1_0() throws Exception
    {
        SNMPMessageV3 msg = new SNMPMessageV3(clone(MSG_1_0), CTX);
        System.out.println(msg);
        System.out.println("Authentic: " + CTX.getAuthProvider().authenticateMessage(msg));   
    }
    
    @Test
    public void testMessage_1_1() throws Exception
    {
        SNMPMessageV3 msg = new SNMPMessageV3(clone(MSG_1_1), CTX);
        System.out.println(msg);
        System.out.println("Authentic: " + CTX.getAuthProvider().authenticateMessage(msg));   
    }
    
    @Test
    public void testMessage_1_2() throws Exception
    {
        SNMPMessageV3 msg = new SNMPMessageV3(clone(MSG_1_2), CTX);
        System.out.println(msg);
        System.out.println("Authentic: " + CTX.getAuthProvider().authenticateMessage(msg));   
    }
    
    @Test
    public void testMessage_1_3() throws Exception
    {
        SNMPMessageV3 msg = new SNMPMessageV3(clone(MSG_1_3), CTX);
        System.out.println(msg);
        System.out.println("Authentic: " + CTX.getAuthProvider().authenticateMessage(msg));   
    }
    
    @Test
    public void testMessage_2_0() throws Exception
    {
        SNMPMessageV3 msg = new SNMPMessageV3(clone(MSG_2_0), PLAIN_CTX);
        System.out.println(msg);
    }
    
    @Test
    public void testMessage_2_1() throws Exception
    {
        SNMPMessageV3 msg = new SNMPMessageV3(clone(MSG_2_1), PLAIN_CTX);
        System.out.println(msg);
    }
    
    //
    
    @Test
    public void decodeEncodeDecodeTest_0_3() throws Exception
    {
        SNMPMessageV3 msg = new SNMPMessageV3(clone(MSG_0_3), CTX);
        System.out.println(msg);
        System.out.println("Authentic: " + CTX.getAuthProvider().authenticateMessage(msg));
        //
        byte[] encoded = msg.encodeToBytes(CTX);
        //
        SNMPMessageV3 msg2 = new SNMPMessageV3(encoded, CTX);
        System.out.println("Authentic(2): " + CTX.getAuthProvider().authenticateMessage(msg2));
    }
}
