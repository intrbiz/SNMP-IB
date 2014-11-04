package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class HCNUMTCDef extends MIB
{
    public static final HCNUMTCDef HCNUMTC = new HCNUMTCDef();

    static { MIBs.getInstance().registerMIB(HCNUMTCDef.HCNUMTC); }

    public final HcnumTCEnt hcnumTC;

    private HCNUMTCDef()
    {
        super("HCNUM-TC");
        this.hcnumTC = new HcnumTCEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.hcnumTC
        };
    }

    public static final class HcnumTCEnt extends MIBEntry<HCNUMTCDef>
    {
        private HcnumTCEnt(HCNUMTCDef mib, MIBEntry<HCNUMTCDef> parent)
        {
            super(mib, parent, "hcnumTC", "1.3.6.1.2.1.78", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
