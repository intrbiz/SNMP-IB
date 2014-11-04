package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]*/
public final class TRIPTCMIBDef extends MIB
{
    public static final TRIPTCMIBDef TRIPTCMIB = new TRIPTCMIBDef();

    static { MIBs.getInstance().registerMIB(TRIPTCMIBDef.TRIPTCMIB); }

    /** [RFC2579]

Sep 02, 2004*/
    public final TripTCEnt tripTC;

    private TRIPTCMIBDef()
    {
        super("TRIP-TC-MIB");
        this.tripTC = new TripTCEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.tripTC
        };
    }

    public static final class TripTCEnt extends MIBEntry<TRIPTCMIBDef>
    {
        private TripTCEnt(TRIPTCMIBDef mib, MIBEntry<TRIPTCMIBDef> parent)
        {
            super(mib, parent, "tripTC", "1.3.6.1.2.1.115", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
