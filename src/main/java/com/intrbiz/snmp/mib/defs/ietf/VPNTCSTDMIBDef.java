package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class VPNTCSTDMIBDef extends MIB
{
    public static final VPNTCSTDMIBDef VPNTCSTDMIB = new VPNTCSTDMIBDef();

    static { MIBs.getInstance().registerMIB(VPNTCSTDMIBDef.VPNTCSTDMIB); }

    /** 15 November 2005*/
    public final VpnTcMIBEnt vpnTcMIB;

    private VPNTCSTDMIBDef()
    {
        super("VPN-TC-STD-MIB");
        this.vpnTcMIB = new VpnTcMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.vpnTcMIB
        };
    }

    public static final class VpnTcMIBEnt extends MIBEntry<VPNTCSTDMIBDef>
    {
        private VpnTcMIBEnt(VPNTCSTDMIBDef mib, MIBEntry<VPNTCSTDMIBDef> parent)
        {
            super(mib, parent, "vpnTcMIB", "1.3.6.1.2.1.129", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
