package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class IPV6FLOWLABELMIBDef extends MIB
{
    public static final IPV6FLOWLABELMIBDef IPV6FLOWLABELMIB = new IPV6FLOWLABELMIBDef();

    static { MIBs.getInstance().registerMIB(IPV6FLOWLABELMIBDef.IPV6FLOWLABELMIB); }

    /** 28 August 2003*/
    public final Ipv6FlowLabelMIBEnt ipv6FlowLabelMIB;

    private IPV6FLOWLABELMIBDef()
    {
        super("IPV6-FLOW-LABEL-MIB");
        this.ipv6FlowLabelMIB = new Ipv6FlowLabelMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ipv6FlowLabelMIB
        };
    }

    public static final class Ipv6FlowLabelMIBEnt extends MIBEntry<IPV6FLOWLABELMIBDef>
    {
        private Ipv6FlowLabelMIBEnt(IPV6FLOWLABELMIBDef mib, MIBEntry<IPV6FLOWLABELMIBDef> parent)
        {
            super(mib, parent, "ipv6FlowLabelMIB", "1.3.6.1.2.1.103", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
