package com.intrbiz.snmp;

import java.io.IOException;
import java.net.InetAddress;

import com.intrbiz.snmp.handler.ResponseHandler;
import com.intrbiz.snmp.model.v2.PDU;
import com.intrbiz.snmp.model.v2.SNMPMessageV2;
import com.intrbiz.snmp.model.v2.VarBind;
import com.intrbiz.snmp.model.v2.VarBindPDU;

public abstract class SNMPV2Context extends SNMPContext<SNMPV2Context>
{
    protected String community = "public";
    
    protected boolean fakeVersion1 = false;

    public SNMPV2Context(InetAddress agent, int port)
    {
        super(SNMPVersion.V2C, agent, port);
    }

    public String getCommunity()
    {
        return community;
    }

    public SNMPV2Context setCommunity(String community)
    {
        this.community = community;
        return this;
    }

    public boolean isFakeVersion1()
    {
        return fakeVersion1;
    }

    public SNMPV2Context setFakeVersion1(boolean fakeVersion1)
    {
        this.fakeVersion1 = fakeVersion1;
        return this;
    }
    
    //

    @Override
    public void send(PDU pdu, ResponseHandler callback) throws IOException
    {
        SNMPMessageV2 msg = new SNMPMessageV2(this.fakeVersion1 ? SNMPVersion.V1 : this.getVersion(), this.getCommunity(), pdu);
        // check that 64bit counters are not being used in V1
        if (this.fakeVersion1)
        {
            if (msg.getPdu() instanceof VarBindPDU)
            {
                VarBindPDU vpdu = (VarBindPDU) msg.getPdu();
                for (VarBind vb : vpdu.getVarBinds())
                {
                    if (vb.isCounter64Value()) throw new IllegalArgumentException("64bit counters are not permitted in SNMP V1");
                }
            }
        }
        // send the actual message
        this.send(msg, this, callback);
    }
    
    @Override
    public SNMPContextId getContextId()
    {
        return new SNMPContextId(this.getAgentSocketAddress());
    }
}
