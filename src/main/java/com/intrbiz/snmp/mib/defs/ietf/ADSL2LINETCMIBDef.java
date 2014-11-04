package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class ADSL2LINETCMIBDef extends MIB
{
    public static final ADSL2LINETCMIBDef ADSL2LINETCMIB = new ADSL2LINETCMIBDef();

    static { MIBs.getInstance().registerMIB(ADSL2LINETCMIBDef.ADSL2LINETCMIB); }

    /** October 4th, 2006*/
    public final Adsl2TCMIBEnt adsl2TCMIB;

    private ADSL2LINETCMIBDef()
    {
        super("ADSL2-LINE-TC-MIB");
        this.adsl2TCMIB = new Adsl2TCMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.adsl2TCMIB
        };
    }

    public static final class Adsl2TCMIBEnt extends MIBEntry<ADSL2LINETCMIBDef>
    {
        private Adsl2TCMIBEnt(ADSL2LINETCMIBDef mib, MIBEntry<ADSL2LINETCMIBDef> parent)
        {
            super(mib, parent, "adsl2TCMIB", "1.3.6.1.2.1.10.238.2", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
