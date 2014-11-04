package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class IPV6UDPMIBDef extends MIB
{
    public static final IPV6UDPMIBDef IPV6UDPMIB = new IPV6UDPMIBDef();

    static { MIBs.getInstance().registerMIB(IPV6UDPMIBDef.IPV6UDPMIB); }

    public final Ipv6UdpMIBEnt ipv6UdpMIB;

    public final UdpEnt udp;

    /** the UDP over IPv6 Listener table
This table contains information about this entity'sUDP/IPv6 endpoints.  Only endpoints utilizing IPv6 addressesare contained in this table.  This entity's UDP/IPv4 endpointsare contained in udpTable.*/
    public final Ipv6UdpTableEnt ipv6UdpTable;

    private IPV6UDPMIBDef()
    {
        super("IPV6-UDP-MIB");
        this.ipv6UdpMIB = new Ipv6UdpMIBEnt(this, null);
        this.udp = new UdpEnt(this, null);
        this.ipv6UdpTable = new Ipv6UdpTableEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ipv6UdpMIB,
            this.udp,
            this.ipv6UdpTable
        };
    }

    public static final class Ipv6UdpMIBEnt extends MIBEntry<IPV6UDPMIBDef>
    {
        /** conformance information*/
        public final Ipv6UdpConformanceEnt ipv6UdpConformance;

        private Ipv6UdpMIBEnt(IPV6UDPMIBDef mib, MIBEntry<IPV6UDPMIBDef> parent)
        {
            super(mib, parent, "ipv6UdpMIB", "1.3.6.1.3.87", false, false, false, false);
            this.ipv6UdpConformance = new Ipv6UdpConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipv6UdpConformance
            };
        }
        public static final class Ipv6UdpConformanceEnt extends MIBEntry<IPV6UDPMIBDef>
        {
            public final Ipv6UdpCompliancesEnt ipv6UdpCompliances;

            public final Ipv6UdpGroupsEnt ipv6UdpGroups;

            private Ipv6UdpConformanceEnt(IPV6UDPMIBDef mib, MIBEntry<IPV6UDPMIBDef> parent)
            {
                super(mib, parent, "ipv6UdpConformance", "1.3.6.1.3.87.2", false, false, false, false);
                this.ipv6UdpCompliances = new Ipv6UdpCompliancesEnt(mib, this);
                this.ipv6UdpGroups = new Ipv6UdpGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipv6UdpCompliances,
                    this.ipv6UdpGroups
                };
            }
            public static final class Ipv6UdpCompliancesEnt extends MIBEntry<IPV6UDPMIBDef>
            {
                /** compliance statements*/
                public final Ipv6UdpComplianceEnt ipv6UdpCompliance;

                private Ipv6UdpCompliancesEnt(IPV6UDPMIBDef mib, MIBEntry<IPV6UDPMIBDef> parent)
                {
                    super(mib, parent, "ipv6UdpCompliances", "1.3.6.1.3.87.2.1", false, false, false, false);
                    this.ipv6UdpCompliance = new Ipv6UdpComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipv6UdpCompliance
                    };
                }
                public static final class Ipv6UdpComplianceEnt extends MIBEntry<IPV6UDPMIBDef>
                {
                    private Ipv6UdpComplianceEnt(IPV6UDPMIBDef mib, MIBEntry<IPV6UDPMIBDef> parent)
                    {
                        super(mib, parent, "ipv6UdpCompliance", "1.3.6.1.3.87.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Ipv6UdpGroupsEnt extends MIBEntry<IPV6UDPMIBDef>
            {
                /** these are defined in this module
ipv6UdpLocalAddress (not-accessible)
ipv6UdpLocalPort (not-accessible)*/
                public final Ipv6UdpGroupEnt ipv6UdpGroup;

                private Ipv6UdpGroupsEnt(IPV6UDPMIBDef mib, MIBEntry<IPV6UDPMIBDef> parent)
                {
                    super(mib, parent, "ipv6UdpGroups", "1.3.6.1.3.87.2.2", false, false, false, false);
                    this.ipv6UdpGroup = new Ipv6UdpGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipv6UdpGroup
                    };
                }
                public static final class Ipv6UdpGroupEnt extends MIBEntry<IPV6UDPMIBDef>
                {
                    private Ipv6UdpGroupEnt(IPV6UDPMIBDef mib, MIBEntry<IPV6UDPMIBDef> parent)
                    {
                        super(mib, parent, "ipv6UdpGroup", "1.3.6.1.3.87.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class UdpEnt extends MIBEntry<IPV6UDPMIBDef>
    {
        private UdpEnt(IPV6UDPMIBDef mib, MIBEntry<IPV6UDPMIBDef> parent)
        {
            super(mib, parent, "udp", "1.3.6.1.2.1.7", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class Ipv6UdpTableEnt extends MIBEntry<IPV6UDPMIBDef>
    {
        public final Ipv6UdpEntryEnt ipv6UdpEntry;

        private Ipv6UdpTableEnt(IPV6UDPMIBDef mib, MIBEntry<IPV6UDPMIBDef> parent)
        {
            super(mib, parent, "ipv6UdpTable", "1.3.6.1.2.1.7.6", false, true, false, false);
            this.ipv6UdpEntry = new Ipv6UdpEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipv6UdpEntry
            };
        }
        public static final class Ipv6UdpEntryEnt extends MIBEntry<IPV6UDPMIBDef>
        {
            public final Ipv6UdpLocalAddressEnt ipv6UdpLocalAddress;

            public final Ipv6UdpLocalPortEnt ipv6UdpLocalPort;

            public final Ipv6UdpIfIndexEnt ipv6UdpIfIndex;

            private Ipv6UdpEntryEnt(IPV6UDPMIBDef mib, MIBEntry<IPV6UDPMIBDef> parent)
            {
                super(mib, parent, "ipv6UdpEntry", "1.3.6.1.2.1.7.6.1", false, false, false, true);
                this.ipv6UdpLocalAddress = new Ipv6UdpLocalAddressEnt(mib, this);
                this.ipv6UdpLocalPort = new Ipv6UdpLocalPortEnt(mib, this);
                this.ipv6UdpIfIndex = new Ipv6UdpIfIndexEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipv6UdpLocalAddress,
                    this.ipv6UdpLocalPort,
                    this.ipv6UdpIfIndex
                };
            }
            public static final class Ipv6UdpLocalAddressEnt extends MIBEntry<IPV6UDPMIBDef>
            {
                private Ipv6UdpLocalAddressEnt(IPV6UDPMIBDef mib, MIBEntry<IPV6UDPMIBDef> parent)
                {
                    super(mib, parent, "ipv6UdpLocalAddress", "1.3.6.1.2.1.7.6.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6UdpLocalPortEnt extends MIBEntry<IPV6UDPMIBDef>
            {
                private Ipv6UdpLocalPortEnt(IPV6UDPMIBDef mib, MIBEntry<IPV6UDPMIBDef> parent)
                {
                    super(mib, parent, "ipv6UdpLocalPort", "1.3.6.1.2.1.7.6.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6UdpIfIndexEnt extends MIBEntry<IPV6UDPMIBDef>
            {
                private Ipv6UdpIfIndexEnt(IPV6UDPMIBDef mib, MIBEntry<IPV6UDPMIBDef> parent)
                {
                    super(mib, parent, "ipv6UdpIfIndex", "1.3.6.1.2.1.7.6.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
