package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class SNMPv2CONFDef extends MIB
{
    public static final SNMPv2CONFDef SNMPv2CONF = new SNMPv2CONFDef();

    static { MIBs.getInstance().registerMIB(SNMPv2CONFDef.SNMPv2CONF); }

    private SNMPv2CONFDef()
    {
        super("SNMPv2-CONF");
        this.entries = new MIBEntry<?>[] {

        };
    }

}
