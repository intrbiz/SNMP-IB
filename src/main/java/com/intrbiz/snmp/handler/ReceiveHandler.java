package com.intrbiz.snmp.handler;

import java.net.SocketAddress;

import com.intrbiz.snmp.model.SNMPMessage;

public interface ReceiveHandler
{
    void handleUnknown(SNMPMessage message, SocketAddress from);
}
