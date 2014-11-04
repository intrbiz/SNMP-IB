package com.intrbiz.snmp.mib.defs.iana;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class IANAifTypeMIBDef extends MIB
{
    public static final IANAifTypeMIBDef IANAifTypeMIB = new IANAifTypeMIBDef();

    static { MIBs.getInstance().registerMIB(IANAifTypeMIBDef.IANAifTypeMIB); }

    /** September 13, 2007*/
    public final IanaifTypeEnt ianaifType;

    private IANAifTypeMIBDef()
    {
        super("IANAifType-MIB");
        this.ianaifType = new IanaifTypeEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ianaifType
        };
    }

    public static final class IanaifTypeEnt extends MIBEntry<IANAifTypeMIBDef>
    {
        private IanaifTypeEnt(IANAifTypeMIBDef mib, MIBEntry<IANAifTypeMIBDef> parent)
        {
            super(mib, parent, "ianaifType", "1.3.6.1.2.1.30", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
