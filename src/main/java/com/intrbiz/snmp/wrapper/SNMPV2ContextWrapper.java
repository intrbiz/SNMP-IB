package com.intrbiz.snmp.wrapper;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;

import com.intrbiz.snmp.SNMPContextId;
import com.intrbiz.snmp.SNMPV2Context;
import com.intrbiz.snmp.SNMPVersion;
import com.intrbiz.snmp.handler.OnError;
import com.intrbiz.snmp.handler.OnMessage;
import com.intrbiz.snmp.handler.ReceiveHandler;
import com.intrbiz.snmp.handler.TrapHandler;
import com.intrbiz.snmp.model.SNMPMessage;

public class SNMPV2ContextWrapper extends SNMPV2Context
{
    private SNMPV2Context parent;
    
    public SNMPV2ContextWrapper(SNMPV2Context parent, OnError defaultErrorHandler)
    {
        super(parent.getAgent(), parent.getPort());
        this.parent = parent;
        this.defaultErrorHandler = defaultErrorHandler;
    }
    
    public SNMPV2ContextWrapper(SNMPV2Context parent)
    {
        this(parent, new OnError.LoggingAdapter());
    }

    @Override
    public String getCommunity()
    {
        return parent.getCommunity();
    }

    @Override
    public SNMPV2Context setCommunity(String community)
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
    public TrapHandler getTrapHandler()
    {
        return parent.getTrapHandler();
    }

    @Override
    public ReceiveHandler getReceiveHandler()
    {
        return parent.getReceiveHandler();
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
    public SNMPV2Context setTimeOut(long timeOut)
    {
        return this;
    }

    @Override
    public SNMPV2Context setResendCount(int resendCount)
    {
        return this;
    }

    @Override
    public SNMPV2Context setTrapHandler(TrapHandler trapHandler)
    {
        return this;
    }

    @Override
    public SNMPV2Context setReceiveHandler(ReceiveHandler receiveHandler)
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
