package com.intrbiz.snmp.mib.defs.iana;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class IANATn3270eTCMIBDef extends MIB
{
    public static final IANATn3270eTCMIBDef IANATn3270eTCMIB = new IANATn3270eTCMIBDef();

    static { MIBs.getInstance().registerMIB(IANATn3270eTCMIBDef.IANATn3270eTCMIB); }

    /** May 10, 2000*/
    public final IanaTn3270eTcMibEnt ianaTn3270eTcMib;

    private IANATn3270eTCMIBDef()
    {
        super("IANATn3270eTC-MIB");
        this.ianaTn3270eTcMib = new IanaTn3270eTcMibEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ianaTn3270eTcMib
        };
    }

    public static final class IanaTn3270eTcMibEnt extends MIBEntry<IANATn3270eTCMIBDef>
    {
        private IanaTn3270eTcMibEnt(IANATn3270eTCMIBDef mib, MIBEntry<IANATn3270eTCMIBDef> parent)
        {
            super(mib, parent, "ianaTn3270eTcMib", "1.3.6.1.2.1.61", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
