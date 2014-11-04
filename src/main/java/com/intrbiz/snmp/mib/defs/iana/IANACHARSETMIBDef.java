package com.intrbiz.snmp.mib.defs.iana;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**http://www.iana.org/assignments/ianacharset-mib
[RFC2578]*/
public final class IANACHARSETMIBDef extends MIB
{
    public static final IANACHARSETMIBDef IANACHARSETMIB = new IANACHARSETMIBDef();

    static { MIBs.getInstance().registerMIB(IANACHARSETMIBDef.IANACHARSETMIB); }

    /** [RFC2579]*/
    public final IanaCharsetMIBEnt ianaCharsetMIB;

    private IANACHARSETMIBDef()
    {
        super("IANA-CHARSET-MIB");
        this.ianaCharsetMIB = new IanaCharsetMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ianaCharsetMIB
        };
    }

    public static final class IanaCharsetMIBEnt extends MIBEntry<IANACHARSETMIBDef>
    {
        private IanaCharsetMIBEnt(IANACHARSETMIBDef mib, MIBEntry<IANACHARSETMIBDef> parent)
        {
            super(mib, parent, "ianaCharsetMIB", "1.3.6.1.2.1.106", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
