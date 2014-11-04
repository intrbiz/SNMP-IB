package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class PerfHistTCMIBDef extends MIB
{
    public static final PerfHistTCMIBDef PerfHistTCMIB = new PerfHistTCMIBDef();

    static { MIBs.getInstance().registerMIB(PerfHistTCMIBDef.PerfHistTCMIB); }

    public final PerfHistTCMIBEnt perfHistTCMIB;

    private PerfHistTCMIBDef()
    {
        super("PerfHist-TC-MIB");
        this.perfHistTCMIB = new PerfHistTCMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.perfHistTCMIB
        };
    }

    public static final class PerfHistTCMIBEnt extends MIBEntry<PerfHistTCMIBDef>
    {
        private PerfHistTCMIBEnt(PerfHistTCMIBDef mib, MIBEntry<PerfHistTCMIBDef> parent)
        {
            super(mib, parent, "perfHistTCMIB", "1.3.6.1.2.1.58", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
