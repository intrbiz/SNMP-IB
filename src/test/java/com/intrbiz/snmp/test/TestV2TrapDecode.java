package com.intrbiz.snmp.test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;

import org.hamcrest.Matcher;
import org.junit.Test;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.SNMPContextResolver;
import com.intrbiz.snmp.SNMPV2Context;
import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.handler.OnError;
import com.intrbiz.snmp.handler.OnMessage;
import com.intrbiz.snmp.model.SNMPMessage;
import com.intrbiz.snmp.model.v2.ErrorStatus;
import com.intrbiz.snmp.model.v2.SNMPMessageV2;
import com.intrbiz.snmp.model.v2.TrapPDU;
import com.intrbiz.snmp.util.SNMPUtil;

/**
 * Some decoder tests with data captured from Wireshark
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class TestV2TrapDecode
{   
    public static final byte[] MSG_1 = SNMPUtil.fromHex("3082008b02010104067075626c6963a77e0201000201000201003073301006082b0601020101030043040487e408301a060a2b060106030101040100060c2b060104012b2d01060a0201301506102b060104012b2d01060a010107010306020101301506102b060104012b2d01060a010107010406020103301506102b060104012b2d01060a010107010506020102");
    
    public static final byte[] MSG_2 = SNMPUtil.fromHex("306002010104067075626c6963a7530201000201000201003048301006082b0601020101030043040487fd1d301c060a2b060106030101040100060e2b060104012b2d010217010c0106301606112b060104012b2d01021701090101010101020101");
    
    // link down
    public static final byte[] LINK_DOWN = SNMPUtil.fromHex("3082008102010104067075626c6963a7740201000201000201003069301006082b060102010103004304048ce7193017060a2b06010603010104010006092b06010603010105033014060d2b06010201020201018282845a020340825a3012060d2b06010201020201078282845a0201013012060d2b06010201020201088282845a020102");

    // link up
    public static final byte[] LINK_UP = SNMPUtil.fromHex("3082008102010104067075626c6963a7740201000201000201003069301006082b060102010103004304048cea543017060a2b06010603010104010006092b06010603010105043014060d2b06010201020201018282845a020340825a3012060d2b06010201020201078282845a0201013012060d2b06010201020201088282845a020101");
    
    private static final SNMPV2Context CTX = createContext();
    
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
    
    public static final SNMPV2Context createContext()
    {
        SNMPV2Context ctx = new SNMPV2Context(null, 0) {
            @Override
            public void send(SNMPMessage message, OnMessage onMessage, OnError onError) throws IOException
            {
            }
        };
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
        SNMPMessageV2 msg = new SNMPMessageV2(clone(MSG_1), RES);
        assertThat(msg.getVersion(), is(equalTo(SNMPVersion.V2C)));
        assertThat(msg.getPdu(), (Matcher) is(instanceOf(TrapPDU.class)));
        assertThat(msg.getCommunity(), is(equalTo("public")));
        TrapPDU trap = msg.getPdu();
        assertThat(trap.getRequestId(), is(equalTo(0)));
        assertThat(trap.getErrorStatus(), is(equalTo(ErrorStatus.NO_ERROR)));
        assertThat(trap.getErrorIndex(), is(equalTo(0)));
        assertThat(trap.getAgentUptime().getTicksMillis(), is(equalTo(760146000L)));
        assertThat(trap.getTrapOID(), is(equalTo("1.3.6.1.4.1.43.45.1.6.10.2.1")));
        assertThat(trap.getNumberOfTrapArguments(), is(equalTo(3)));
    }
    
    @Test
    public void testMessage2() throws Exception
    {
        SNMPMessageV2 msg = new SNMPMessageV2(clone(MSG_2), RES);
        assertThat(msg.getVersion(), is(equalTo(SNMPVersion.V2C)));
        assertThat(msg.getPdu(), (Matcher) is(instanceOf(TrapPDU.class)));
        assertThat(msg.getCommunity(), is(equalTo("public")));
        TrapPDU trap = msg.getPdu();
        assertThat(trap.getRequestId(), is(equalTo(0)));
        assertThat(trap.getErrorStatus(), is(equalTo(ErrorStatus.NO_ERROR)));
        assertThat(trap.getErrorIndex(), is(equalTo(0)));
        assertThat(trap.getAgentUptime().getTicksMillis(), is(equalTo(760210210L)));
        assertThat(trap.getTrapOID(), is(equalTo("1.3.6.1.4.1.43.45.1.2.23.1.12.1.6")));
        assertThat(trap.getNumberOfTrapArguments(), is(equalTo(1)));
    }
    
    @Test
    public void testLinkDown() throws Exception
    {
        SNMPMessageV2 msg = new SNMPMessageV2(clone(LINK_DOWN), RES);
        assertThat(msg.getVersion(), is(equalTo(SNMPVersion.V2C)));
        assertThat(msg.getPdu(), (Matcher) is(instanceOf(TrapPDU.class)));
        assertThat(msg.getCommunity(), is(equalTo("public")));
        TrapPDU trap = msg.getPdu();
        assertThat(trap.getRequestId(), is(equalTo(0)));
        assertThat(trap.getErrorStatus(), is(equalTo(ErrorStatus.NO_ERROR)));
        assertThat(trap.getErrorIndex(), is(equalTo(0)));
        assertThat(trap.getAgentUptime().getTicksMillis(), is(equalTo(763430650L)));
        assertThat(trap.isLinkDownTrap(), is(equalTo(true)));
        assertThat(trap.getTrapOID(), is(equalTo("1.3.6.1.6.3.1.1.5.3")));
        assertThat(trap.getNumberOfTrapArguments(), is(equalTo(3)));
    }
    
    @Test
    public void testLinkUp() throws Exception
    {
        SNMPMessageV2 msg = new SNMPMessageV2(clone(LINK_UP), RES);
        assertThat(msg.getVersion(), is(equalTo(SNMPVersion.V2C)));
        assertThat(msg.getPdu(), (Matcher) is(instanceOf(TrapPDU.class)));
        assertThat(msg.getCommunity(), is(equalTo("public")));
        TrapPDU trap = msg.getPdu();
        assertThat(trap.getRequestId(), is(equalTo(0)));
        assertThat(trap.getErrorStatus(), is(equalTo(ErrorStatus.NO_ERROR)));
        assertThat(trap.getErrorIndex(), is(equalTo(0)));
        assertThat(trap.getAgentUptime().getTicksMillis(), is(equalTo(763438920L)));
        assertThat(trap.getTrapOID(), is(equalTo("1.3.6.1.6.3.1.1.5.4")));
        assertThat(trap.isLinkUpTrap(), is(equalTo(true)));
        assertThat(trap.getNumberOfTrapArguments(), is(equalTo(3)));
    }
}
