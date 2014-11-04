package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**FIX: added additional imports (NetworkAddress, IpAddress)*/
public final class RFC1212Def extends MIB
{
    public static final RFC1212Def RFC1212 = new RFC1212Def();

    static { MIBs.getInstance().registerMIB(RFC1212Def.RFC1212); }

    private RFC1212Def()
    {
        super("RFC-1212");
        this.entries = new MIBEntry<?>[] {

        };
    }

}
