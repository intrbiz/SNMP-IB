package com.intrbiz.snmp.wrapper;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;

import com.intrbiz.snmp.SNMPContextId;
import com.intrbiz.snmp.SNMPV1Context;
import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.handler.OnError;
import com.intrbiz.snmp.handler.OnMessage;
import com.intrbiz.snmp.handler.OnUnknown;
import com.intrbiz.snmp.handler.OnTrap;
import com.intrbiz.snmp.model.SNMPMessage;

public class SNMPV1ContextWrapper extends SNMPV1Context
{
    private SNMPV1Context parent;
    
    public SNMPV1ContextWrapper(SNMPV1Context parent, OnError defaultErrorHandler)
    {
        super(parent.getAgent(), parent.getPort());
        this.parent = parent;
        this.defaultErrorHandler = defaultErrorHandler;
    }
    
    public SNMPV1ContextWrapper(SNMPV1Context parent)
    {
        this(parent, new OnError.LoggingAdapter());
    }

    @Override
    public String getCommunity()
    {
        return parent.getCommunity();
    }

    @Override
    public SNMPV1Context setCommunity(String community)
    {
        return this;
    }

    @Override
    public SNMPContextId getContextId()
    {
        return parent.getContextId();
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
    public boolean isAuthenticated()
    {
        return parent.isAuthenticated();
    }

    @Override
    public boolean isEncrypted()
    {
        return parent.isEncrypted();
    }

    @Override
    public boolean isSecure()
    {
        return parent.isSecure();
    }

    @Override
    public SNMPV1Context setTimeOut(long timeOut)
    {
        return this;
    }

    @Override
    public SNMPV1Context setResendCount(int resendCount)
    {
        return this;
    }

    @Override
    public SNMPV1Context setTrapHandler(OnTrap onTrap)
    {
        return this;
    }

    @Override
    public SNMPV1Context setUnknownHandler(OnUnknown onUnknown)
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
