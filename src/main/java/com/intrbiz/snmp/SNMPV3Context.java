package com.intrbiz.snmp;

import java.io.IOException;
import java.net.InetAddress;

import com.intrbiz.snmp.handler.OnError;
import com.intrbiz.snmp.handler.OnMessage;
import com.intrbiz.snmp.model.v2.PDU;
import com.intrbiz.snmp.model.v3.SNMPMessageV3;
import com.intrbiz.snmp.model.v3.USMSecurityParameters;
import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.security.SNMPPrivMode;
import com.intrbiz.snmp.security.auth.AuthProvider;
import com.intrbiz.snmp.security.priv.PrivacyProvider;
import com.intrbiz.snmp.util.SNMPUtil;

public abstract class SNMPV3Context extends SNMPContext<SNMPV3Context>
{
    public static final String LOCAL_ENGINE_ID_STRING = "800000000600000000000000";
    
    public static final byte[] LOCAL_ENGINE_ID = SNMPUtil.fromHex(LOCAL_ENGINE_ID_STRING);
    
    private String username;

    private byte[] engineId;

    private AuthProvider authProvider;

    private PrivacyProvider privacyProvider;

    private int engineBoots = 0;

    private int engineTime = 0;

    private long lastEngineTimeUpdate = 0;
    
    private volatile boolean discovering = false;

    public SNMPV3Context(InetAddress agent, int port)
    {
        super(SNMPVersion.V3, agent, port);
    }

    public AuthProvider getAuthProvider()
    {
        return authProvider;
    }

    public PrivacyProvider getPrivacyProvider()
    {
        return privacyProvider;
    }
    
    public boolean isAuth()
    {
        return this.authProvider.getAuthMode() != SNMPAuthMode.NONE;
    }
    
    public boolean isPriv()
    {
        return this.privacyProvider.getPrivMode() != SNMPPrivMode.NONE;
    }

    public String getUsername()
    {
        return username;
    }

    public byte[] getEngineId()
    {
        return engineId;
    }
    
    public String getEngineIdAsString()
    {
        return SNMPUtil.toHex(engineId);
    }

    public SNMPV3Context setEngineId(byte[] engineId)
    {
        this.engineId = engineId;
        return this;
    }

    public SNMPV3Context setEngineId(String engineId)
    {
        this.engineId = SNMPUtil.fromHex(engineId);
        return this;
    }
    
    public SNMPV3Context setUser(String username, SNMPAuthMode authMode, SNMPPrivMode privMode, String authPassword, String privPassword)
    {
        this.username = username;
        this.authProvider = AuthProvider.open(authMode, authPassword);
        this.privacyProvider = PrivacyProvider.open(authMode, privMode, privPassword);
        return this;
    }
    
    public SNMPV3Context setUser(String username, SNMPAuthMode authMode, SNMPPrivMode privMode, String password)
    {
        this.username = username;
        this.authProvider = AuthProvider.open(authMode, password);
        this.privacyProvider = PrivacyProvider.open(authMode, privMode, password);
        return this;
    }
    
    public SNMPV3Context setUser(String username, SNMPAuthMode authMode, String password)
    {
        this.username = username;
        this.authProvider = AuthProvider.open(authMode, password);
        this.privacyProvider = PrivacyProvider.open(authMode, SNMPPrivMode.NONE, password);
        return this;
    }
    
    public SNMPV3Context setUser(String username)
    {
        this.username = username;
        this.authProvider = AuthProvider.open(SNMPAuthMode.NONE, null);
        this.privacyProvider = PrivacyProvider.open(SNMPAuthMode.NONE, SNMPPrivMode.NONE, null);
        return this;
    }

    public boolean isDiscovering()
    {
        return discovering;
    }

    public SNMPV3Context setDiscovering(boolean discovering)
    {
        this.discovering = discovering;
        return this;
    }
    
    /**
     * Is this context using authentication, IE: SHA1, MD5
     */
    @Override
    public boolean isAuthenticated()
    {
        return this.getAuthProvider() != null && this.getAuthProvider().getAuthMode() != SNMPAuthMode.NONE;
    }

    /**
     * Is this context using encryption, IE: AES, DES
     */
    @Override
    public boolean isEncrypted()
    {
        return this.getPrivacyProvider() != null && this.getPrivacyProvider().getPrivMode() != SNMPPrivMode.NONE;
    }
    
    /**
     * Is this context using strong authentication and encryption, IE: SHA1 and AES
     */
    public boolean isSecure()
    {
        return this.isAuthenticated() && this.isEncrypted() && this.getAuthProvider().getAuthMode() != SNMPAuthMode.MD5 && this.getPrivacyProvider().getPrivMode() != SNMPPrivMode.DES;
    }

    /**
     * Put this context into discover mode
     */
    public SNMPV3Context setDiscover()
    {
        this.discovering = true;
        this.engineId = LOCAL_ENGINE_ID;
        return this;
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
        return ((int) ((System.currentTimeMillis() - this.lastEngineTimeUpdate) / 1000)) + this.engineTime;
    }

    // actions

    @Override
    public void send(PDU pdu, OnMessage messageCallback, OnError errorCallback) throws IOException
    {
        // create the SNMPV3Message and send it
        SNMPMessageV3 message = new SNMPMessageV3();
        // setup
        message.getHeader().setFlags((byte) 0x04);
        // setup security parameters
        USMSecurityParameters spar = (USMSecurityParameters) message.getSecurityParameters();
        spar.setAuthoritativeEngineId(this.getEngineId());
        spar.setAuthoritativeEngineBoots(this.getEngineBoots());
        spar.setAuthoritativeEngineTime(this.computeCurrentEngineTime());
        spar.setUserName(this.getUsername());
        // setup auth parameters
        if (this.authProvider.getAuthMode() != SNMPAuthMode.NONE)
        {
            message.getHeader().setAuth();
            spar.setAuthenticationParameters(new byte[0]);
        }
        else
        {
            spar.setAuthenticationParameters(new byte[12]);
        }
        // setup priv parameters
        if (this.privacyProvider.getPrivMode() != SNMPPrivMode.NONE)
        {
            message.getHeader().setPriv();
            spar.setPrivacyParameters(this.getPrivacyProvider().genSalt());
        }
        else
        {
            spar.setPrivacyParameters(new byte[0]);
        }
        //
        message.getScopedPdu().setContextEngineId(this.getEngineId());
        message.getScopedPdu().setPdu(pdu);
        //
        this.send(message, this, messageCallback, errorCallback);
    }

    @Override
    public SNMPContextId getContextId()
    {
        return new SNMPContextId(this.getAgentSocketAddress(), this.getEngineId());
    }
}
