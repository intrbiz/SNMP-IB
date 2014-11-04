package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]*/
public final class SNMPUSMAESMIBDef extends MIB
{
    public static final SNMPUSMAESMIBDef SNMPUSMAESMIB = new SNMPUSMAESMIBDef();

    static { MIBs.getInstance().registerMIB(SNMPUSMAESMIBDef.SNMPUSMAESMIB); }

    /** [RFC3411]*/
    public final SnmpUsmAesMIBEnt snmpUsmAesMIB;

    public final UsmAesCfb128ProtocolEnt usmAesCfb128Protocol;

    private SNMPUSMAESMIBDef()
    {
        super("SNMP-USM-AES-MIB");
        this.snmpUsmAesMIB = new SnmpUsmAesMIBEnt(this, null);
        this.usmAesCfb128Protocol = new UsmAesCfb128ProtocolEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.snmpUsmAesMIB,
            this.usmAesCfb128Protocol
        };
    }

    public static final class SnmpUsmAesMIBEnt extends MIBEntry<SNMPUSMAESMIBDef>
    {
        private SnmpUsmAesMIBEnt(SNMPUSMAESMIBDef mib, MIBEntry<SNMPUSMAESMIBDef> parent)
        {
            super(mib, parent, "snmpUsmAesMIB", "1.3.6.1.6.3.20", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class UsmAesCfb128ProtocolEnt extends MIBEntry<SNMPUSMAESMIBDef>
    {
        private UsmAesCfb128ProtocolEnt(SNMPUSMAESMIBDef mib, MIBEntry<SNMPUSMAESMIBDef> parent)
        {
            super(mib, parent, "usmAesCfb128Protocol", "1.3.6.1.6.3.10.1.2.4", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
