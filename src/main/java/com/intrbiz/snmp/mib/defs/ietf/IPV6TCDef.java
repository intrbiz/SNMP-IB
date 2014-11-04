package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class IPV6TCDef extends MIB
{
    public static final IPV6TCDef IPV6TC = new IPV6TCDef();

    static { MIBs.getInstance().registerMIB(IPV6TCDef.IPV6TC); }

    private IPV6TCDef()
    {
        super("IPV6-TC");
        this.entries = new MIBEntry<?>[] {

        };
    }

}
