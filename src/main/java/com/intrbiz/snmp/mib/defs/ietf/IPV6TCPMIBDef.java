package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class IPV6TCPMIBDef extends MIB
{
    public static final IPV6TCPMIBDef IPV6TCPMIB = new IPV6TCPMIBDef();

    public final Ipv6TcpMIBEnt ipv6TcpMIB;

    public final TcpEnt tcp;

    /** the TCP over IPv6 Connection table
This connection table contains information about thisentity's existing TCP connections between IPv6 endpoints.Only connections between IPv6 addresses are contained inthis table.  This entity's connections between IPv4endpoints are contained in tcpConnTable.*/
    public final Ipv6TcpConnTableEnt ipv6TcpConnTable;

    private IPV6TCPMIBDef()
    {
        super("IPV6-TCP-MIB");
        this.ipv6TcpMIB = new Ipv6TcpMIBEnt(this, null);
        this.tcp = new TcpEnt(this, null);
        this.ipv6TcpConnTable = new Ipv6TcpConnTableEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ipv6TcpMIB,
            this.tcp,
            this.ipv6TcpConnTable
        };
    }

    public static final class Ipv6TcpMIBEnt extends MIBEntry<IPV6TCPMIBDef>
    {
        /** conformance information*/
        public final Ipv6TcpConformanceEnt ipv6TcpConformance;

        private Ipv6TcpMIBEnt(IPV6TCPMIBDef mib, MIBEntry<IPV6TCPMIBDef> parent)
        {
            super(mib, parent, "ipv6TcpMIB", "1.3.6.1.3.86", false, false, false, false);
            this.ipv6TcpConformance = new Ipv6TcpConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipv6TcpConformance
            };
        }
        public static final class Ipv6TcpConformanceEnt extends MIBEntry<IPV6TCPMIBDef>
        {
            public final Ipv6TcpCompliancesEnt ipv6TcpCompliances;

            public final Ipv6TcpGroupsEnt ipv6TcpGroups;

            private Ipv6TcpConformanceEnt(IPV6TCPMIBDef mib, MIBEntry<IPV6TCPMIBDef> parent)
            {
                super(mib, parent, "ipv6TcpConformance", "1.3.6.1.3.86.2", false, false, false, false);
                this.ipv6TcpCompliances = new Ipv6TcpCompliancesEnt(mib, this);
                this.ipv6TcpGroups = new Ipv6TcpGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipv6TcpCompliances,
                    this.ipv6TcpGroups
                };
            }
            public static final class Ipv6TcpCompliancesEnt extends MIBEntry<IPV6TCPMIBDef>
            {
                /** compliance statements*/
                public final Ipv6TcpComplianceEnt ipv6TcpCompliance;

                private Ipv6TcpCompliancesEnt(IPV6TCPMIBDef mib, MIBEntry<IPV6TCPMIBDef> parent)
                {
                    super(mib, parent, "ipv6TcpCompliances", "1.3.6.1.3.86.2.1", false, false, false, false);
                    this.ipv6TcpCompliance = new Ipv6TcpComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipv6TcpCompliance
                    };
                }
                public static final class Ipv6TcpComplianceEnt extends MIBEntry<IPV6TCPMIBDef>
                {
                    private Ipv6TcpComplianceEnt(IPV6TCPMIBDef mib, MIBEntry<IPV6TCPMIBDef> parent)
                    {
                        super(mib, parent, "ipv6TcpCompliance", "1.3.6.1.3.86.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Ipv6TcpGroupsEnt extends MIBEntry<IPV6TCPMIBDef>
            {
                /** these are defined in this module
ipv6TcpConnLocalAddress (not-accessible)
ipv6TcpConnLocalPort (not-accessible)
ipv6TcpConnRemAddress (not-accessible)
ipv6TcpConnRemPort (not-accessible)
ipv6TcpConnIfIndex (not-accessible)*/
                public final Ipv6TcpGroupEnt ipv6TcpGroup;

                private Ipv6TcpGroupsEnt(IPV6TCPMIBDef mib, MIBEntry<IPV6TCPMIBDef> parent)
                {
                    super(mib, parent, "ipv6TcpGroups", "1.3.6.1.3.86.2.2", false, false, false, false);
                    this.ipv6TcpGroup = new Ipv6TcpGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipv6TcpGroup
                    };
                }
                public static final class Ipv6TcpGroupEnt extends MIBEntry<IPV6TCPMIBDef>
                {
                    private Ipv6TcpGroupEnt(IPV6TCPMIBDef mib, MIBEntry<IPV6TCPMIBDef> parent)
                    {
                        super(mib, parent, "ipv6TcpGroup", "1.3.6.1.3.86.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class TcpEnt extends MIBEntry<IPV6TCPMIBDef>
    {
        private TcpEnt(IPV6TCPMIBDef mib, MIBEntry<IPV6TCPMIBDef> parent)
        {
            super(mib, parent, "tcp", "1.3.6.1.2.1.6", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class Ipv6TcpConnTableEnt extends MIBEntry<IPV6TCPMIBDef>
    {
        public final Ipv6TcpConnEntryEnt ipv6TcpConnEntry;

        private Ipv6TcpConnTableEnt(IPV6TCPMIBDef mib, MIBEntry<IPV6TCPMIBDef> parent)
        {
            super(mib, parent, "ipv6TcpConnTable", "1.3.6.1.2.1.6.16", false, true, false, false);
            this.ipv6TcpConnEntry = new Ipv6TcpConnEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipv6TcpConnEntry
            };
        }
        public static final class Ipv6TcpConnEntryEnt extends MIBEntry<IPV6TCPMIBDef>
        {
            public final Ipv6TcpConnLocalAddressEnt ipv6TcpConnLocalAddress;

            public final Ipv6TcpConnLocalPortEnt ipv6TcpConnLocalPort;

            public final Ipv6TcpConnRemAddressEnt ipv6TcpConnRemAddress;

            public final Ipv6TcpConnRemPortEnt ipv6TcpConnRemPort;

            public final Ipv6TcpConnIfIndexEnt ipv6TcpConnIfIndex;

            public final Ipv6TcpConnStateEnt ipv6TcpConnState;

            private Ipv6TcpConnEntryEnt(IPV6TCPMIBDef mib, MIBEntry<IPV6TCPMIBDef> parent)
            {
                super(mib, parent, "ipv6TcpConnEntry", "1.3.6.1.2.1.6.16.1", false, false, false, true);
                this.ipv6TcpConnLocalAddress = new Ipv6TcpConnLocalAddressEnt(mib, this);
                this.ipv6TcpConnLocalPort = new Ipv6TcpConnLocalPortEnt(mib, this);
                this.ipv6TcpConnRemAddress = new Ipv6TcpConnRemAddressEnt(mib, this);
                this.ipv6TcpConnRemPort = new Ipv6TcpConnRemPortEnt(mib, this);
                this.ipv6TcpConnIfIndex = new Ipv6TcpConnIfIndexEnt(mib, this);
                this.ipv6TcpConnState = new Ipv6TcpConnStateEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipv6TcpConnLocalAddress,
                    this.ipv6TcpConnLocalPort,
                    this.ipv6TcpConnRemAddress,
                    this.ipv6TcpConnRemPort,
                    this.ipv6TcpConnIfIndex,
                    this.ipv6TcpConnState
                };
            }
            public static final class Ipv6TcpConnLocalAddressEnt extends MIBEntry<IPV6TCPMIBDef>
            {
                private Ipv6TcpConnLocalAddressEnt(IPV6TCPMIBDef mib, MIBEntry<IPV6TCPMIBDef> parent)
                {
                    super(mib, parent, "ipv6TcpConnLocalAddress", "1.3.6.1.2.1.6.16.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6TcpConnLocalPortEnt extends MIBEntry<IPV6TCPMIBDef>
            {
                private Ipv6TcpConnLocalPortEnt(IPV6TCPMIBDef mib, MIBEntry<IPV6TCPMIBDef> parent)
                {
                    super(mib, parent, "ipv6TcpConnLocalPort", "1.3.6.1.2.1.6.16.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6TcpConnRemAddressEnt extends MIBEntry<IPV6TCPMIBDef>
            {
                private Ipv6TcpConnRemAddressEnt(IPV6TCPMIBDef mib, MIBEntry<IPV6TCPMIBDef> parent)
                {
                    super(mib, parent, "ipv6TcpConnRemAddress", "1.3.6.1.2.1.6.16.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6TcpConnRemPortEnt extends MIBEntry<IPV6TCPMIBDef>
            {
                private Ipv6TcpConnRemPortEnt(IPV6TCPMIBDef mib, MIBEntry<IPV6TCPMIBDef> parent)
                {
                    super(mib, parent, "ipv6TcpConnRemPort", "1.3.6.1.2.1.6.16.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6TcpConnIfIndexEnt extends MIBEntry<IPV6TCPMIBDef>
            {
                private Ipv6TcpConnIfIndexEnt(IPV6TCPMIBDef mib, MIBEntry<IPV6TCPMIBDef> parent)
                {
                    super(mib, parent, "ipv6TcpConnIfIndex", "1.3.6.1.2.1.6.16.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6TcpConnStateEnt extends MIBEntry<IPV6TCPMIBDef>
            {
                private Ipv6TcpConnStateEnt(IPV6TCPMIBDef mib, MIBEntry<IPV6TCPMIBDef> parent)
                {
                    super(mib, parent, "ipv6TcpConnState", "1.3.6.1.2.1.6.16.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
