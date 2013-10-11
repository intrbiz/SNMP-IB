package com.intrbiz.snmp;

import java.io.IOException;
import java.net.InetAddress;

import com.intrbiz.snmp.handler.ResponseHandler;
import com.intrbiz.snmp.model.v2.PDU;
import com.intrbiz.snmp.model.v2.SNMPMessageV2;



public class SNMPV2Context extends SNMPContext
{
    public SNMPV2Context()
    {
        super(SNMPVersion.V2C);
    }
    
    public SNMPV2Context(InetAddress agent)
    {
        super(SNMPVersion.V2C);
        this.setAgent(agent);
    }
    
    public SNMPV2Context(InetAddress agent, int port, String community)
    {
        super(SNMPVersion.V2C);
        this.setAgent(agent);
        this.setPort(port);
        this.setCommunity(community);
    }
    
    @Override
    public void send(PDU pdu, ResponseHandler callback) throws IOException
    {
        SNMPMessageV2 msg = new SNMPMessageV2(this.getVersion(), this.getCommunity(), pdu);
        // send the actual message
        this.transport.send(msg, this, callback);
    }
}
