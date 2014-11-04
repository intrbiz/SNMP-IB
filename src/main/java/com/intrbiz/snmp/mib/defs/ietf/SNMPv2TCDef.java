package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class SNMPv2TCDef extends MIB
{
    public static final SNMPv2TCDef SNMPv2TC = new SNMPv2TCDef();

    static { MIBs.getInstance().registerMIB(SNMPv2TCDef.SNMPv2TC); }

    private SNMPv2TCDef()
    {
        super("SNMPv2-TC");
        this.entries = new MIBEntry<?>[] {

        };
    }

}
