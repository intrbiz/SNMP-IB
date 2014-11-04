package com.intrbiz.snmp.mib.defs.iana;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class IANARTPROTOMIBDef extends MIB
{
    public static final IANARTPROTOMIBDef IANARTPROTOMIB = new IANARTPROTOMIBDef();

    static { MIBs.getInstance().registerMIB(IANARTPROTOMIBDef.IANARTPROTOMIB); }

    /** September 26, 2000*/
    public final IanaRtProtoMIBEnt ianaRtProtoMIB;

    private IANARTPROTOMIBDef()
    {
        super("IANA-RTPROTO-MIB");
        this.ianaRtProtoMIB = new IanaRtProtoMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ianaRtProtoMIB
        };
    }

    public static final class IanaRtProtoMIBEnt extends MIBEntry<IANARTPROTOMIBDef>
    {
        private IanaRtProtoMIBEnt(IANARTPROTOMIBDef mib, MIBEntry<IANARTPROTOMIBDef> parent)
        {
            super(mib, parent, "ianaRtProtoMIB", "1.3.6.1.2.1.84", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
