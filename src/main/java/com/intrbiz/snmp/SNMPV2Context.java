package com.intrbiz.snmp;

import java.io.IOException;
import java.net.InetAddress;

import com.intrbiz.snmp.handler.ReceiveHandler;
import com.intrbiz.snmp.handler.ResponseHandler;
import com.intrbiz.snmp.handler.TrapHandler;
import com.intrbiz.snmp.model.v2.PDU;
import com.intrbiz.snmp.model.v2.SNMPMessageV2;

public class SNMPV2Context extends SNMPContext
{
    protected String community = "public";

    public SNMPV2Context(SNMPTransport transport, InetAddress agent, int port)
    {
        super(SNMPVersion.V2C, transport, agent, port);
    }

    @Override
    public SNMPV2Context setTimeOut(long timeOut)
    {
        super.setTimeOut(timeOut);
        return this;
    }

    @Override
    public SNMPV2Context setResendCount(int resendCount)
    {
        super.setResendCount(resendCount);
        return this;
    }

    @Override
    public SNMPV2Context setTrapHandler(TrapHandler trapHandler)
    {
        super.setTrapHandler(trapHandler);
        return this;
    }

    @Override
    public SNMPV2Context setReceiveHandler(ReceiveHandler receiveHandler)
    {
        super.setReceiveHandler(receiveHandler);
        return this;
    }

    @Override
    public SNMPV2Context setUserContext(Object userContext)
    {
        super.setUserContext(userContext);
        return this;
    }
    
    //

    public String getCommunity()
    {
        return community;
    }

    public SNMPV2Context setCommunity(String community)
    {
        this.community = community;
        return this;
    }

    //

    @Override
    public void send(PDU pdu, ResponseHandler callback) throws IOException
    {
        SNMPMessageV2 msg = new SNMPMessageV2(this.getVersion(), this.getCommunity(), pdu);
        // send the actual message
        this.transport.send(msg, this, callback);
    }
}
