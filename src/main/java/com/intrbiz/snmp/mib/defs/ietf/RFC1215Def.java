package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class RFC1215Def extends MIB
{
    public static final RFC1215Def RFC1215 = new RFC1215Def();

    static { MIBs.getInstance().registerMIB(RFC1215Def.RFC1215); }

    private RFC1215Def()
    {
        super("RFC-1215");
        this.entries = new MIBEntry<?>[] {

        };
    }

}
