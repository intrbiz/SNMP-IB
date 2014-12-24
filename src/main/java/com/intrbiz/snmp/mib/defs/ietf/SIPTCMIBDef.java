package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**RFC 2578*/
public final class SIPTCMIBDef extends MIB
{
    public static final SIPTCMIBDef SIPTCMIB = new SIPTCMIBDef();

    /** RFC 2579*/
    public final SipTCEnt sipTC;

    private SIPTCMIBDef()
    {
        super("SIP-TC-MIB");
        this.sipTC = new SipTCEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.sipTC
        };
    }

    public static final class SipTCEnt extends MIBEntry<SIPTCMIBDef>
    {
        private SipTCEnt(SIPTCMIBDef mib, MIBEntry<SIPTCMIBDef> parent)
        {
            super(mib, parent, "sipTC", "1.3.6.1.2.1.148", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
