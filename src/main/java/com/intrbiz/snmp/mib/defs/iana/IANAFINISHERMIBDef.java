package com.intrbiz.snmp.mib.defs.iana;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**http://www.iana.org/assignments/ianafinisher-mib
[RFC2578]*/
public final class IANAFINISHERMIBDef extends MIB
{
    public static final IANAFINISHERMIBDef IANAFINISHERMIB = new IANAFINISHERMIBDef();

    static { MIBs.getInstance().registerMIB(IANAFINISHERMIBDef.IANAFINISHERMIB); }

    /** [RFC2579]

June 2, 2004*/
    public final IanafinisherMIBEnt ianafinisherMIB;

    private IANAFINISHERMIBDef()
    {
        super("IANA-FINISHER-MIB");
        this.ianafinisherMIB = new IanafinisherMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ianafinisherMIB
        };
    }

    public static final class IanafinisherMIBEnt extends MIBEntry<IANAFINISHERMIBDef>
    {
        private IanafinisherMIBEnt(IANAFINISHERMIBDef mib, MIBEntry<IANAFINISHERMIBDef> parent)
        {
            super(mib, parent, "ianafinisherMIB", "1.3.6.1.2.1.110", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
