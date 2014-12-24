package com.intrbiz.snmp.mib.defs.iana;

import com.intrbiz.snmp.mib.MIB;

/**RFC 2578*/
public final class IANAGMPLSTCMIBDef extends MIB
{
    public static final IANAGMPLSTCMIBDef IANAGMPLSTCMIB = new IANAGMPLSTCMIBDef();

    /** RFC 2579

27 February 2007 00:00:00 GMT*/
    public final IanaGmplsEnt ianaGmpls;

    private IANAGMPLSTCMIBDef()
    {
        super("IANA-GMPLS-TC-MIB");
        this.ianaGmpls = new IanaGmplsEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ianaGmpls
        };
    }

    public static final class IanaGmplsEnt extends MIBEntry<IANAGMPLSTCMIBDef>
    {
        private IanaGmplsEnt(IANAGMPLSTCMIBDef mib, MIBEntry<IANAGMPLSTCMIBDef> parent)
        {
            super(mib, parent, "ianaGmpls", "1.3.6.1.2.1.152", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
