package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**RFC 2578
RFC 2579
RFC 3811*/
public final class GMPLSTCSTDMIBDef extends MIB
{
    public static final GMPLSTCSTDMIBDef GMPLSTCSTDMIB = new GMPLSTCSTDMIBDef();

    /** 28 February 2007 00:00:00 GMT*/
    public final GmplsTCStdMIBEnt gmplsTCStdMIB;

    private GMPLSTCSTDMIBDef()
    {
        super("GMPLS-TC-STD-MIB");
        this.gmplsTCStdMIB = new GmplsTCStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.gmplsTCStdMIB
        };
    }

    public static final class GmplsTCStdMIBEnt extends MIBEntry<GMPLSTCSTDMIBDef>
    {
        private GmplsTCStdMIBEnt(GMPLSTCSTDMIBDef mib, MIBEntry<GMPLSTCSTDMIBDef> parent)
        {
            super(mib, parent, "gmplsTCStdMIB", "1.3.6.1.2.1.10.166.12", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
