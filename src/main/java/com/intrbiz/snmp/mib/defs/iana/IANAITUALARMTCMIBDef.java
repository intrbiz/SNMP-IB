package com.intrbiz.snmp.mib.defs.iana;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class IANAITUALARMTCMIBDef extends MIB
{
    public static final IANAITUALARMTCMIBDef IANAITUALARMTCMIB = new IANAITUALARMTCMIBDef();

    static { MIBs.getInstance().registerMIB(IANAITUALARMTCMIBDef.IANAITUALARMTCMIB); }

    /** September 09, 2004*/
    public final IanaItuAlarmNumbersEnt ianaItuAlarmNumbers;

    private IANAITUALARMTCMIBDef()
    {
        super("IANA-ITU-ALARM-TC-MIB");
        this.ianaItuAlarmNumbers = new IanaItuAlarmNumbersEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ianaItuAlarmNumbers
        };
    }

    public static final class IanaItuAlarmNumbersEnt extends MIBEntry<IANAITUALARMTCMIBDef>
    {
        private IanaItuAlarmNumbersEnt(IANAITUALARMTCMIBDef mib, MIBEntry<IANAITUALARMTCMIBDef> parent)
        {
            super(mib, parent, "ianaItuAlarmNumbers", "1.3.6.1.2.1.119", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
