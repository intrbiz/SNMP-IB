package com.intrbiz.snmp.handler;

import java.net.SocketAddress;

import com.intrbiz.snmp.SNMPContext;
import com.intrbiz.snmp.model.SNMPMessage;

public interface TrapHandler
{
    void handleTrap(SNMPMessage message, SocketAddress from, SNMPContext context);
}
