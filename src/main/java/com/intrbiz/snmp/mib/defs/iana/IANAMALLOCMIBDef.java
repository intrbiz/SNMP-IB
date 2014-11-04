package com.intrbiz.snmp.mib.defs.iana;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class IANAMALLOCMIBDef extends MIB
{
    public static final IANAMALLOCMIBDef IANAMALLOCMIB = new IANAMALLOCMIBDef();

    static { MIBs.getInstance().registerMIB(IANAMALLOCMIBDef.IANAMALLOCMIB); }

    /** January 27, 2003*/
    public final IanaMallocMIBEnt ianaMallocMIB;

    private IANAMALLOCMIBDef()
    {
        super("IANA-MALLOC-MIB");
        this.ianaMallocMIB = new IanaMallocMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ianaMallocMIB
        };
    }

    public static final class IanaMallocMIBEnt extends MIBEntry<IANAMALLOCMIBDef>
    {
        private IanaMallocMIBEnt(IANAMALLOCMIBDef mib, MIBEntry<IANAMALLOCMIBDef> parent)
        {
            super(mib, parent, "ianaMallocMIB", "1.3.6.1.2.1.102", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
