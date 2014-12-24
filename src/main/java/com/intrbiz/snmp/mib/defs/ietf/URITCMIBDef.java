package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]*/
public final class URITCMIBDef extends MIB
{
    public static final URITCMIBDef URITCMIB = new URITCMIBDef();

    /** [RFC2579]

10 September 2007*/
    public final UriTcMIBEnt uriTcMIB;

    private URITCMIBDef()
    {
        super("URI-TC-MIB");
        this.uriTcMIB = new UriTcMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.uriTcMIB
        };
    }

    public static final class UriTcMIBEnt extends MIBEntry<URITCMIBDef>
    {
        private UriTcMIBEnt(URITCMIBDef mib, MIBEntry<URITCMIBDef> parent)
        {
            super(mib, parent, "uriTcMIB", "1.3.6.1.2.1.164", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
