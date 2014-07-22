package com.intrbiz.snmp.test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;

import org.hamcrest.Matcher;
import org.junit.Test;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.SNMPContextResolver;
import com.intrbiz.snmp.SNMPV3Context;
import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.handler.OnError;
import com.intrbiz.snmp.handler.OnMessage;
import com.intrbiz.snmp.model.SNMPMessage;
import com.intrbiz.snmp.model.v2.ErrorStatus;
import com.intrbiz.snmp.model.v2.TrapPDU;
import com.intrbiz.snmp.model.v3.SNMPMessageV3;
import com.intrbiz.snmp.model.v3.USMSecurityParameters;
import com.intrbiz.snmp.poller.SNMPJob;
import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.security.SNMPPrivMode;
import com.intrbiz.snmp.util.SNMPUtil;

/**
 * Some decoder tests with data captured from Wireshark
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class TestV3TrapDecode
{   
    public static final byte[] MSG_1 = SNMPUtil.fromHex("308200e3020103300d020100020205dc04010302010304373035040c8000002b0016e0357e40687702011d02030bf6c2040561646d696e040ce3fc555c0eb59923cb74dd190408ac390000ce0500000482009408b0ab4d1803b848e5e79b5155f317c1af58acdb44e61c1187808626007214bbb357c0c0cb308430efe9ba418bf6cadfc46687daf6970694de4b8eb5244cc38c66d89a6c84bf5b0298115b997bcbaf0d99217235ec0e8ac1814d70eff1c013bdaad34e5352c885bdc6762f45d01a21b7872946734a43b9d3b8070fe00cdd26673dc4e68a61d65112fa5941bba1fd610f2e38f3a4");
    
    public static final byte[] MSG_2 = SNMPUtil.fromHex("308200b4020103300d020100020205dc04010302010304373035040c8000002b0016e0357e40687702011d02030bf768040561646d696e040c1b3b41b33378cbb49024f2f704083e3c0000b37100000467d6ca306fcfa7d014ba3f5dc3c0cb6a04a8caa6a9cd6479a1830874f42ccb1e0f35c0591710c55fddb8f022d8ad0a6934f2041c41c94c909bfd70309cf4ab82e434e4d07d7c59904f78a2126700d99389fab3594eed925fac12c00f1c3f7edb29129728ceeed2f8");
    
    // link down
    public static final byte[] LINK_DOWN = SNMPUtil.fromHex("308200d9020103300d020100020205dc04010302010304373035040c8000002b0016e0357e40687702011d02030bf7d4040561646d696e040cf4f7e05889a63ee13e3b87c104086c4f0000124600000482008ad42d937a802648130be306ccccd050ba0c34c797dfe5f556ac64f43e2390e20345c4f63eb4c292e531f524f8177787eab5c47fc9a9d7aaecf6e2333c98afb3cccbd17723e24cb585db121ba881c5573cab0f665136720a96ce85bfafcd4cea9625ca72c56e923c7b120a23bf5b63e90b1d4861acf4f5cd79552c4a43dba2f822db691864f1a8a675a203");

    // link up
    public static final byte[] LINK_UP = SNMPUtil.fromHex("308200d9020103300d020100020205dc04010302010304373035040c8000002b0016e0357e40687702011d02030bf7dc040561646d696e040c930e4cc694171fd911081c130408f47d0000b36100000482008a89da1fc9f1b2390497acdf02d0d6d2f521b95e3879cc5d152475c74066507c609fd06ff8183e3cbfaede14a1465eff45d4bea1313c884e8f2cbab43e7b1e343f513bd4722f8b41bb96cf978a3e2ed28624ec2bab45cfd090cd3eb8b8fcc2d5d50b391cc63283b40637ed1964541c8c4109c9c824860a77a75a6751e1f1845cb621396f5c54f23c8624a1");
    
    private static final SNMPV3Context CTX = createContext();
    
    private static final SNMPContextResolver RES = createResolver();
    
    public static final SNMPContextResolver createResolver()
    {
        return new SNMPContextResolver()
        {
            @Override
            public SNMPContext<?> lookupContext(int requestId, byte[] engineId)
            {
                return CTX;
            }            
        };
    }
    
    public static final SNMPV3Context createContext()
    {
        SNMPV3Context ctx = new SNMPV3Context(null, 0) {
            @Override
            public void send(SNMPMessage message, OnMessage onMessage, OnError onError) throws IOException
            {
            }
            
            @Override
            public SNMPJob schedule(SNMPJob job)
            {
                return null;
            }
        };
        ctx.setUser("admin", SNMPAuthMode.SHA1, SNMPPrivMode.AES128, "abcde12345");
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
    public void testMessage1() throws Exception
    {
        SNMPMessageV3 msg = new SNMPMessageV3(clone(MSG_1), RES);
        msg.authenticateMessage();
        assertThat(msg.getVersion(), is(equalTo(SNMPVersion.V3)));
        assertThat(msg.getPdu(), (Matcher) is(instanceOf(TrapPDU.class)));
        assertThat(((USMSecurityParameters) msg.getSecurityParameters()).getUserName(), is(equalTo("admin")));
        TrapPDU trap = msg.getPdu();
        assertThat(trap.getRequestId(), is(equalTo(0)));
        assertThat(trap.getErrorStatus(), is(equalTo(ErrorStatus.NO_ERROR)));
        assertThat(trap.getErrorIndex(), is(equalTo(0)));
        assertThat(trap.getAgentUptime().getTicksMillis(), is(equalTo(784066370L)));
        assertThat(trap.getTrapOID(), is(equalTo("1.3.6.1.4.1.43.45.1.6.10.2.1")));
        assertThat(trap.getNumberOfTrapArguments(), is(equalTo(3)));
    }
    
    @Test
    public void testMessage2() throws Exception
    {
        SNMPMessageV3 msg = new SNMPMessageV3(clone(MSG_2), RES);
        msg.authenticateMessage();
        assertThat(msg.getVersion(), is(equalTo(SNMPVersion.V3)));
        assertThat(msg.getPdu(), (Matcher) is(instanceOf(TrapPDU.class)));
        assertThat(((USMSecurityParameters) msg.getSecurityParameters()).getUserName(), is(equalTo("admin")));
        TrapPDU trap = msg.getPdu();
        assertThat(trap.getRequestId(), is(equalTo(0)));
        assertThat(trap.getErrorStatus(), is(equalTo(ErrorStatus.NO_ERROR)));
        assertThat(trap.getErrorIndex(), is(equalTo(0)));
        assertThat(trap.getAgentUptime().getTicksMillis(), is(equalTo(784232050L)));
        assertThat(trap.getTrapOID(), is(equalTo("1.3.6.1.4.1.43.45.1.2.23.1.12.1.6")));
        assertThat(trap.getNumberOfTrapArguments(), is(equalTo(1)));
    }
    
    @Test
    public void testLinkDown() throws Exception
    {
        SNMPMessageV3 msg = new SNMPMessageV3(clone(LINK_DOWN), RES);
        msg.authenticateMessage();
        assertThat(msg.getVersion(), is(equalTo(SNMPVersion.V3)));
        assertThat(msg.getPdu(), (Matcher) is(instanceOf(TrapPDU.class)));
        assertThat(((USMSecurityParameters) msg.getSecurityParameters()).getUserName(), is(equalTo("admin")));
        TrapPDU trap = msg.getPdu();
        assertThat(trap.getRequestId(), is(equalTo(0)));
        assertThat(trap.getErrorStatus(), is(equalTo(ErrorStatus.NO_ERROR)));
        assertThat(trap.getErrorIndex(), is(equalTo(0)));
        assertThat(trap.getAgentUptime().getTicksMillis(), is(equalTo(784340810L)));
        assertThat(trap.isLinkDownTrap(), is(equalTo(true)));
        assertThat(trap.getTrapOID(), is(equalTo("1.3.6.1.6.3.1.1.5.3")));
        assertThat(trap.getNumberOfTrapArguments(), is(equalTo(3)));
    }
    
    @Test
    public void testLinkUp() throws Exception
    {
        SNMPMessageV3 msg = new SNMPMessageV3(clone(LINK_UP), RES);
        msg.authenticateMessage();
        assertThat(msg.getVersion(), is(equalTo(SNMPVersion.V3)));
        assertThat(msg.getPdu(), (Matcher) is(instanceOf(TrapPDU.class)));
        assertThat(((USMSecurityParameters) msg.getSecurityParameters()).getUserName(), is(equalTo("admin")));
        TrapPDU trap = msg.getPdu();
        assertThat(trap.getRequestId(), is(equalTo(0)));
        assertThat(trap.getErrorStatus(), is(equalTo(ErrorStatus.NO_ERROR)));
        assertThat(trap.getErrorIndex(), is(equalTo(0)));
        assertThat(trap.getAgentUptime().getTicksMillis(), is(equalTo(784348270L)));
        assertThat(trap.getTrapOID(), is(equalTo("1.3.6.1.6.3.1.1.5.4")));
        assertThat(trap.isLinkUpTrap(), is(equalTo(true)));
        assertThat(trap.getNumberOfTrapArguments(), is(equalTo(3)));
    }
}
