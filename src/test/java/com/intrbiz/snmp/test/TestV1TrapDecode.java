package com.intrbiz.snmp.test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.net.InetAddress;

import org.hamcrest.Matcher;
import org.junit.Test;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.SNMPContextResolver;
import com.intrbiz.snmp.SNMPV2Context;
import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.handler.OnError;
import com.intrbiz.snmp.handler.OnMessage;
import com.intrbiz.snmp.model.SNMPMessage;
import com.intrbiz.snmp.model.v1.GenericTrap;
import com.intrbiz.snmp.model.v1.TrapPDUV1;
import com.intrbiz.snmp.model.v2.SNMPMessageV2;
import com.intrbiz.snmp.util.SNMPUtil;

/**
 * Some decoder tests with data captured from Wireshark
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class TestV1TrapDecode
{   
    public static final byte[] MSG_1 = SNMPUtil.fromHex("3031020100040c747261707472617074726170a41e060a2b060104010206811e044004ac1e0d14020100020100430203843000");
    
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
        assertThat(msg.getVersion(), is(equalTo(SNMPVersion.V1)));
        assertThat(msg.getPdu(), (Matcher) is(instanceOf(TrapPDUV1.class)));
        assertThat(msg.getCommunity(), is(equalTo("traptraptrap")));
        TrapPDUV1 trap = msg.getPdu();
        assertThat(trap.getEnterprise(), is(equalTo("1.3.6.1.4.1.2.6.158.4")));
        assertThat(trap.getGenericTrap(), is(equalTo(GenericTrap.COLD_START)));
        assertThat(trap.getSpecificTrap(), is(equalTo(0)));
        assertThat(trap.getTimestamp().getTicks(), is(equalTo(900)));
        assertThat(trap.getAgentAddr().getValue(), is(equalTo(InetAddress.getByAddress(new byte[] { (byte) 172, 30, 13, 20 }))));
    }
}
