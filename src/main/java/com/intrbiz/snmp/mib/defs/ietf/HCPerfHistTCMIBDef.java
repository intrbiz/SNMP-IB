package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class HCPerfHistTCMIBDef extends MIB
{
    public static final HCPerfHistTCMIBDef HCPerfHistTCMIB = new HCPerfHistTCMIBDef();

    static { MIBs.getInstance().registerMIB(HCPerfHistTCMIBDef.HCPerfHistTCMIB); }

    /** February 3, 2004*/
    public final HcPerfHistTCMIBEnt hcPerfHistTCMIB;

    private HCPerfHistTCMIBDef()
    {
        super("HC-PerfHist-TC-MIB");
        this.hcPerfHistTCMIB = new HcPerfHistTCMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.hcPerfHistTCMIB
        };
    }

    public static final class HcPerfHistTCMIBEnt extends MIBEntry<HCPerfHistTCMIBDef>
    {
        private HcPerfHistTCMIBEnt(HCPerfHistTCMIBDef mib, MIBEntry<HCPerfHistTCMIBDef> parent)
        {
            super(mib, parent, "hcPerfHistTCMIB", "1.3.6.1.2.1.107", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
