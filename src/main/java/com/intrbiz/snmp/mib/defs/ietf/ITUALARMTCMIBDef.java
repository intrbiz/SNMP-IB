package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]*/
public final class ITUALARMTCMIBDef extends MIB
{
    public static final ITUALARMTCMIBDef ITUALARMTCMIB = new ITUALARMTCMIBDef();

    static { MIBs.getInstance().registerMIB(ITUALARMTCMIBDef.ITUALARMTCMIB); }

    /** [RFC2579]

September 09, 2004*/
    public final ItuAlarmTcEnt ituAlarmTc;

    private ITUALARMTCMIBDef()
    {
        super("ITU-ALARM-TC-MIB");
        this.ituAlarmTc = new ItuAlarmTcEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ituAlarmTc
        };
    }

    public static final class ItuAlarmTcEnt extends MIBEntry<ITUALARMTCMIBDef>
    {
        private ItuAlarmTcEnt(ITUALARMTCMIBDef mib, MIBEntry<ITUALARMTCMIBDef> parent)
        {
            super(mib, parent, "ituAlarmTc", "1.3.6.1.2.1.120", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
