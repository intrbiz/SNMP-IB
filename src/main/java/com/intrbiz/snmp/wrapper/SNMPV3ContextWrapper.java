package com.intrbiz.snmp.wrapper;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;

import com.intrbiz.snmp.SNMPContextId;
import com.intrbiz.snmp.SNMPV3Context;
import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.handler.OnError;
import com.intrbiz.snmp.handler.OnMessage;
import com.intrbiz.snmp.handler.OnUnknown;
import com.intrbiz.snmp.handler.OnTrap;
import com.intrbiz.snmp.model.SNMPMessage;
import com.intrbiz.snmp.security.SNMPAuthMode;
import com.intrbiz.snmp.security.SNMPPrivMode;
import com.intrbiz.snmp.security.auth.AuthProvider;
import com.intrbiz.snmp.security.priv.PrivacyProvider;

public class SNMPV3ContextWrapper extends SNMPV3Context
{
    private SNMPV3Context parent;
    
    public SNMPV3ContextWrapper(SNMPV3Context parent, OnError defaultErrorHandler)
    {
        super(parent.getAgent(), parent.getPort());
        this.parent = parent;
        this.defaultErrorHandler = defaultErrorHandler;
    }
    
    public SNMPV3ContextWrapper(SNMPV3Context parent)
    {
        this(parent, new OnError.LoggingAdapter());
    }

    @Override
    public SNMPV3Context setTimeOut(long timeOut)
    {
        return this;
    }

    @Override
    public AuthProvider getAuthProvider()
    {
        return this.parent.getAuthProvider();
    }

    @Override
    public PrivacyProvider getPrivacyProvider()
    {
        return this.parent.getPrivacyProvider();
    }

    @Override
    public boolean isAuth()
    {
        return this.parent.isAuth();
    }

    @Override
    public boolean isPriv()
    {
        return this.parent.isPriv();
    }

    @Override
    public String getUsername()
    {
        return this.parent.getUsername();
    }

    @Override
    public byte[] getEngineId()
    {
        return this.parent.getEngineId();
    }

    @Override
    public String getEngineIdAsString()
    {
        return this.parent.getEngineIdAsString();
    }

    @Override
    public SNMPV3Context setEngineId(byte[] engineId)
    {
        return this;
    }

    @Override
    public SNMPV3Context setEngineId(String engineId)
    {
        return this;
    }

    @Override
    public SNMPV3Context setUser(String username, SNMPAuthMode authMode, SNMPPrivMode privMode, String authPassword, String privPassword)
    {
        return this;
    }

    @Override
    public SNMPV3Context setUser(String username, SNMPAuthMode authMode, SNMPPrivMode privMode, String password)
    {
        return this;
    }

    @Override
    public SNMPV3Context setUser(String username, SNMPAuthMode authMode, String password)
    {
        return this;
    }

    @Override
    public SNMPV3Context setUser(String username)
    {
        return this;
    }

    @Override
    public boolean isDiscovering()
    {
        return this.parent.isDiscovering();
    }

    @Override
    public SNMPV3Context setDiscovering(boolean discovering)
    {
        return this;
    }

    @Override
    public boolean isAuthenticated()
    {
        return this.parent.isAuthenticated();
    }

    @Override
    public boolean isEncrypted()
    {
        return this.parent.isEncrypted();
    }

    @Override
    public boolean isSecure()
    {
        return this.parent.isSecure();
    }

    @Override
    public SNMPV3Context setDiscover()
    {
        return this;
    }

    @Override
    public int getEngineBoots()
    {
        return this.parent.getEngineBoots();
    }

    @Override
    public void setEngineBoots(int engineBoots)
    {
    }

    @Override
    public int getEngineTime()
    {
        return this.parent.getEngineTime();
    }

    @Override
    public void setEngineTime(int engineTime)
    {
    }

    @Override
    public long getLastEngineTimeUpdate()
    {
        return this.parent.getLastEngineTimeUpdate();
    }

    @Override
    public void setLastEngineTimeUpdate(long lastEngineTimeUpdate)
    {
    }

    @Override
    public int computeCurrentEngineTime()
    {
        return this.parent.computeCurrentEngineTime();
    }

    @Override
    public SNMPContextId getContextId()
    {
        return this.parent.getContextId();
    }

    @Override
    public SNMPVersion getVersion()
    {
        return parent.getVersion();
    }

    @Override
    public boolean isVersion1()
    {
        return parent.isVersion1();
    }

    @Override
    public boolean isVersion2()
    {
        return parent.isVersion2();
    }

    @Override
    public boolean isVersion3()
    {
        return parent.isVersion3();
    }

    @Override
    public InetAddress getAgent()
    {
        return parent.getAgent();
    }

    @Override
    public SocketAddress getAgentSocketAddress()
    {
        return parent.getAgentSocketAddress();
    }

    @Override
    public int getPort()
    {
        return parent.getPort();
    }

    @Override
    public long getTimeOut()
    {
        return parent.getTimeOut();
    }

    @Override
    public int getResendCount()
    {
        return parent.getResendCount();
    }

    @Override
    public OnTrap getTrapHandler()
    {
        return parent.getTrapHandler();
    }

    @Override
    public OnUnknown getUnknownHandler()
    {
        return parent.getUnknownHandler();
    }

    @Override
    public int getTimeoutCount()
    {
        return parent.getTimeoutCount();
    }

    @Override
    public int getErrorCount()
    {
        return parent.getErrorCount();
    }

    @Override
    public int getDecodeErrorCount()
    {
        return parent.getDecodeErrorCount();
    }

    @Override
    public boolean isNaughtyDevice()
    {
        return parent.isNaughtyDevice();
    }

    @Override
    public OnError getDefaultErrorHandler()
    {
        return parent.getDefaultErrorHandler();
    }

    @Override
    public SNMPV3Context setResendCount(int resendCount)
    {
        return this;
    }

    @Override
    public SNMPV3Context setTrapHandler(OnTrap onTrap)
    {
        return this;
    }

    @Override
    public SNMPV3Context setUnknownHandler(OnUnknown onUnknown)
    {
        return this;
    }

    @Override
    public void setTimeoutCount(int timeoutCount)
    {
    }

    @Override
    public void setErrorCount(int errorCount)
    {
    }

    @Override
    public void setDecodeErrorCount(int decodeErrorCount)
    {
    }

    @Override
    public void setNaughtyDevice(boolean naughtyDevice)
    {
    }

    @Override
    public void send(SNMPMessage message, OnMessage messageCallback, OnError errorCallback) throws IOException
    {
        // pass the message down to the real context to be sent
        this.parent.send(message, messageCallback, errorCallback);
    }
}
