package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class DIFFSERVDSCPTCDef extends MIB
{
    public static final DIFFSERVDSCPTCDef DIFFSERVDSCPTC = new DIFFSERVDSCPTCDef();

    public final DiffServDSCPTCEnt diffServDSCPTC;

    private DIFFSERVDSCPTCDef()
    {
        super("DIFFSERV-DSCP-TC");
        this.diffServDSCPTC = new DiffServDSCPTCEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.diffServDSCPTC
        };
    }

    public static final class DiffServDSCPTCEnt extends MIBEntry<DIFFSERVDSCPTCDef>
    {
        private DiffServDSCPTCEnt(DIFFSERVDSCPTCDef mib, MIBEntry<DIFFSERVDSCPTCDef> parent)
        {
            super(mib, parent, "diffServDSCPTC", "1.3.6.1.2.1.96", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
