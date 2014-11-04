package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]*/
public final class T11TCMIBDef extends MIB
{
    public static final T11TCMIBDef T11TCMIB = new T11TCMIBDef();

    static { MIBs.getInstance().registerMIB(T11TCMIBDef.T11TCMIB); }

    /** [RFC2579]*/
    public final T11TcMIBEnt t11TcMIB;

    private T11TCMIBDef()
    {
        super("T11-TC-MIB");
        this.t11TcMIB = new T11TcMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.t11TcMIB
        };
    }

    public static final class T11TcMIBEnt extends MIBEntry<T11TCMIBDef>
    {
        private T11TcMIBEnt(T11TCMIBDef mib, MIBEntry<T11TCMIBDef> parent)
        {
            super(mib, parent, "t11TcMIB", "1.3.6.1.2.1.136", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
