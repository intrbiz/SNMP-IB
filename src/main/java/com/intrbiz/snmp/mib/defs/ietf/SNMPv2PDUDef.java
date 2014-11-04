package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class SNMPv2PDUDef extends MIB
{
    public static final SNMPv2PDUDef SNMPv2PDU = new SNMPv2PDUDef();

    static { MIBs.getInstance().registerMIB(SNMPv2PDUDef.SNMPv2PDU); }

    private SNMPv2PDUDef()
    {
        super("SNMPv2-PDU");
        this.entries = new MIBEntry<?>[] {

        };
    }

}
