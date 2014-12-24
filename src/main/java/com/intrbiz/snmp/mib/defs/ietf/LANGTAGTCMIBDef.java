package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]*/
public final class LANGTAGTCMIBDef extends MIB
{
    public static final LANGTAGTCMIBDef LANGTAGTCMIB = new LANGTAGTCMIBDef();

    /** [RFC2579]

9 November 2007*/
    public final LangTagTcMIBEnt langTagTcMIB;

    private LANGTAGTCMIBDef()
    {
        super("LANGTAG-TC-MIB");
        this.langTagTcMIB = new LangTagTcMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.langTagTcMIB
        };
    }

    public static final class LangTagTcMIBEnt extends MIBEntry<LANGTAGTCMIBDef>
    {
        private LangTagTcMIBEnt(LANGTAGTCMIBDef mib, MIBEntry<LANGTAGTCMIBDef> parent)
        {
            super(mib, parent, "langTagTcMIB", "1.3.6.1.2.1.165", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
