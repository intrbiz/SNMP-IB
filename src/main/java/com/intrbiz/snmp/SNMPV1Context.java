package com.intrbiz.snmp;

import java.io.IOException;
import java.net.InetAddress;

import com.intrbiz.snmp.handler.OnError;
import com.intrbiz.snmp.handler.OnMessage;
import com.intrbiz.snmp.model.v2.PDU;
import com.intrbiz.snmp.model.v2.SNMPMessageV2;
import com.intrbiz.snmp.model.v2.VarBind;
import com.intrbiz.snmp.model.v2.VarBindPDU;
import com.intrbiz.snmp.wrapper.SNMPV1ContextWrapper;

public abstract class SNMPV1Context extends SNMPContext<SNMPV1Context>
{
    protected String community = "public";

    public SNMPV1Context(InetAddress agent, int port)
    {
        super(SNMPVersion.V1, agent, port);
    }

    public String getCommunity()
    {
        return community;
    }

    public SNMPV1Context setCommunity(String community)
    {
        this.community = community;
        return this;
    }
    
    //

    @Override
    public void send(PDU pdu, OnMessage messageCallback, OnError errorCallback) throws IOException
    {
        SNMPMessageV2 msg = new SNMPMessageV2(this.getVersion(), this.getCommunity(), pdu);
        // check that 64bit counters are not being used in V1{
        if (msg.getPdu() instanceof VarBindPDU)
        {
            VarBindPDU vpdu = (VarBindPDU) msg.getPdu();
            for (VarBind vb : vpdu.getVarBinds())
            {
                if (vb.isCounter64Value()) throw new IllegalArgumentException("64bit counters are not permitted in SNMP V1");
            }
        }
        // send the actual message
        this.send(msg, messageCallback, errorCallback);
    }
    
    @Override
    public SNMPContextId getContextId()
    {
        return new SNMPContextId(this.getAgentSocketAddress());
    }
    
    @Override
    public SNMPV1Context with(OnError defaultErrorHandler)
    {
        return new SNMPV1ContextWrapper(this, defaultErrorHandler);
    }
    
    @Override
    public SNMPV1Context readOnly()
    {
        return new SNMPV1ContextWrapper(this);
    }
}
