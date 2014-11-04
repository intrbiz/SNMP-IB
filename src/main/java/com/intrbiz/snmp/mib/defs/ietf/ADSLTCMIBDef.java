package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class ADSLTCMIBDef extends MIB
{
    public static final ADSLTCMIBDef ADSLTCMIB = new ADSLTCMIBDef();

    static { MIBs.getInstance().registerMIB(ADSLTCMIBDef.ADSLTCMIB); }

    public final AdsltcmibEnt adsltcmib;

    private ADSLTCMIBDef()
    {
        super("ADSL-TC-MIB");
        this.adsltcmib = new AdsltcmibEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.adsltcmib
        };
    }

    public static final class AdsltcmibEnt extends MIBEntry<ADSLTCMIBDef>
    {
        private AdsltcmibEnt(ADSLTCMIBDef mib, MIBEntry<ADSLTCMIBDef> parent)
        {
            super(mib, parent, "adsltcmib", "1.3.6.1.2.1.10.94.2", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
