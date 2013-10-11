package com.intrbiz.snmp;

import java.io.IOException;
import java.net.InetAddress;

import com.intrbiz.snmp.handler.ResponseHandler;
import com.intrbiz.snmp.model.v2.PDU;
import com.intrbiz.snmp.model.v3.SNMPMessageV3;
import com.intrbiz.snmp.model.v3.USMSecurityParameters;
import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.security.SNMPPrivMode;
import com.intrbiz.snmp.security.auth.AuthProvider;
import com.intrbiz.snmp.security.priv.PrivacyProvider;
import com.intrbiz.snmp.util.SNMPUtil;

public class SNMPV3Context extends SNMPContext
{
    private String username;

    private byte[] engineId;

    private AuthProvider authProvider;

    private PrivacyProvider privacyProvider;

    private int engineBoots = 0;

    private int engineTime = 0;

    private long lastEngineTimeUpdate = 0;

    public SNMPV3Context()
    {
        super(SNMPVersion.V3);
    }

    public SNMPV3Context(InetAddress agent)
    {
        super(SNMPVersion.V3);
        this.setAgent(agent);
    }

    public SNMPV3Context(InetAddress agent, int port, String community)
    {
        super(SNMPVersion.V3);
        this.setAgent(agent);
        this.setPort(port);
        this.setCommunity(community);
    }

    public AuthProvider getAuthProvider()
    {
        return authProvider;
    }

    public PrivacyProvider getPrivacyProvider()
    {
        return privacyProvider;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public byte[] getEngineId()
    {
        return engineId;
    }

    public void setEngineId(byte[] engineId)
    {
        this.engineId = engineId;
    }

    public void setEngineId(String engineId)
    {
        this.engineId = SNMPUtil.fromHex(engineId);
    }

    public int getEngineBoots()
    {
        return engineBoots;
    }

    public void setEngineBoots(int engineBoots)
    {
        this.engineBoots = engineBoots;
    }

    public int getEngineTime()
    {
        return engineTime;
    }

    public void setEngineTime(int engineTime)
    {
        this.engineTime = engineTime;
    }

    public long getLastEngineTimeUpdate()
    {
        return lastEngineTimeUpdate;
    }

    public void setLastEngineTimeUpdate(long lastEngineTimeUpdate)
    {
        this.lastEngineTimeUpdate = lastEngineTimeUpdate;
    }
    
    public int computeCurrentEngineTime()
    {
        if (this.lastEngineTimeUpdate == 0) return 0;
        return ((int) ((System.currentTimeMillis() - this.lastEngineTimeUpdate)/1000)) + this.engineTime;
    }
    
    //

    public void setUser(String username, SNMPAuthMode authMode, String authPassword, SNMPPrivMode privMode)
    {
        this.setUser(username, authMode, authPassword, privMode, authPassword);
    }

    public void setUser(String username, SNMPAuthMode authMode, String authPassword, SNMPPrivMode privMode, String privPassword)
    {
        this.username = username;
        this.authProvider = AuthProvider.open(authMode, authPassword);
        this.privacyProvider = PrivacyProvider.open(authMode, privMode, privPassword);
    }

    // actions

    @Override
    public void send(PDU pdu, ResponseHandler callback) throws IOException
    {
        // create the SNMPV3Message and send it
        SNMPMessageV3 message = new SNMPMessageV3();
        // setup
        USMSecurityParameters spar = (USMSecurityParameters) message.getSecurityParameters();
        spar.setAuthoritativeEngineId(this.getEngineId());
        spar.setAuthoritativeEngineBoots(this.getEngineBoots());
        spar.setAuthoritativeEngineTime(this.computeCurrentEngineTime());
        spar.setUserName(this.getUsername());
        spar.setAuthenticationParameters(new byte[12]);
        spar.setPrivacyParameters(this.getPrivacyProvider().genSalt());
        //
        message.getScopedPdu().setContextEngineId(this.getEngineId());
        message.getScopedPdu().setPdu(pdu);
        //
        this.transport.send(message, this, callback);
    }

}
