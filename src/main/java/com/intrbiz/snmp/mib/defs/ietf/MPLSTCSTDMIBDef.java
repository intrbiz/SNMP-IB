package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]*/
public final class MPLSTCSTDMIBDef extends MIB
{
    public static final MPLSTCSTDMIBDef MPLSTCSTDMIB = new MPLSTCSTDMIBDef();

    public final MplsStdMIBEnt mplsStdMIB;

    private MPLSTCSTDMIBDef()
    {
        super("MPLS-TC-STD-MIB");
        this.mplsStdMIB = new MplsStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mplsStdMIB
        };
    }

    public static final class MplsStdMIBEnt extends MIBEntry<MPLSTCSTDMIBDef>
    {
        /** [RFC2579]

June 3, 2004*/
        public final MplsTCStdMIBEnt mplsTCStdMIB;

        private MplsStdMIBEnt(MPLSTCSTDMIBDef mib, MIBEntry<MPLSTCSTDMIBDef> parent)
        {
            super(mib, parent, "mplsStdMIB", "1.3.6.1.2.1.10.166", false, false, false, false);
            this.mplsTCStdMIB = new MplsTCStdMIBEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mplsTCStdMIB
            };
        }
        public static final class MplsTCStdMIBEnt extends MIBEntry<MPLSTCSTDMIBDef>
        {
            private MplsTCStdMIBEnt(MPLSTCSTDMIBDef mib, MIBEntry<MPLSTCSTDMIBDef> parent)
            {
                super(mib, parent, "mplsTCStdMIB", "1.3.6.1.2.1.10.166.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

}
