package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class INETADDRESSMIBDef extends MIB
{
    public static final INETADDRESSMIBDef INETADDRESSMIB = new INETADDRESSMIBDef();

    static { MIBs.getInstance().registerMIB(INETADDRESSMIBDef.INETADDRESSMIB); }

    public final InetAddressMIBEnt inetAddressMIB;

    private INETADDRESSMIBDef()
    {
        super("INET-ADDRESS-MIB");
        this.inetAddressMIB = new InetAddressMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.inetAddressMIB
        };
    }

    public static final class InetAddressMIBEnt extends MIBEntry<INETADDRESSMIBDef>
    {
        private InetAddressMIBEnt(INETADDRESSMIBDef mib, MIBEntry<INETADDRESSMIBDef> parent)
        {
            super(mib, parent, "inetAddressMIB", "1.3.6.1.2.1.76", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
