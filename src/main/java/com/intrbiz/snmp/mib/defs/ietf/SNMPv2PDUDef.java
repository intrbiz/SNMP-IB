package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class SNMPv2PDUDef extends MIB
{
    public static final SNMPv2PDUDef SNMPv2PDU = new SNMPv2PDUDef();

    private SNMPv2PDUDef()
    {
        super("SNMPv2-PDU");
        this.entries = new MIBEntry<?>[] {

        };
    }

}
