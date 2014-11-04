package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class UDPMIBDef extends MIB
{
    public static final UDPMIBDef UDPMIB = new UDPMIBDef();

    static { MIBs.getInstance().registerMIB(UDPMIBDef.UDPMIB); }

    /** May 20, 2005*/
    public final UdpMIBEnt udpMIB;

    public final UdpEnt udp;

    public final UdpHCInDatagramsEnt udpHCInDatagrams;

    public final UdpHCOutDatagramsEnt udpHCOutDatagrams;

    /** { udp 6 } was defined as the ipv6UdpTable in RFC2454'sIPV6-UDP-MIB.  This RFC obsoletes RFC 2454, so { udp 6 } isobsoleted.
The UDP "Endpoint" table.*/
    public final UdpEndpointTableEnt udpEndpointTable;

    private UDPMIBDef()
    {
        super("UDP-MIB");
        this.udpMIB = new UdpMIBEnt(this, null);
        this.udp = new UdpEnt(this, null);
        this.udpHCInDatagrams = new UdpHCInDatagramsEnt(this, null);
        this.udpHCOutDatagrams = new UdpHCOutDatagramsEnt(this, null);
        this.udpEndpointTable = new UdpEndpointTableEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.udpMIB,
            this.udp,
            this.udpHCInDatagrams,
            this.udpHCOutDatagrams,
            this.udpEndpointTable
        };
    }

    public static final class UdpMIBEnt extends MIBEntry<UDPMIBDef>
    {
        /** conformance information*/
        public final UdpMIBConformanceEnt udpMIBConformance;

        private UdpMIBEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
        {
            super(mib, parent, "udpMIB", "1.3.6.1.2.1.50", false, false, false, false);
            this.udpMIBConformance = new UdpMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.udpMIBConformance
            };
        }
        public static final class UdpMIBConformanceEnt extends MIBEntry<UDPMIBDef>
        {
            public final UdpMIBCompliancesEnt udpMIBCompliances;

            public final UdpMIBGroupsEnt udpMIBGroups;

            private UdpMIBConformanceEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
            {
                super(mib, parent, "udpMIBConformance", "1.3.6.1.2.1.50.2", false, false, false, false);
                this.udpMIBCompliances = new UdpMIBCompliancesEnt(mib, this);
                this.udpMIBGroups = new UdpMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.udpMIBCompliances,
                    this.udpMIBGroups
                };
            }
            public static final class UdpMIBCompliancesEnt extends MIBEntry<UDPMIBDef>
            {
                /** compliance statements*/
                public final UdpMIBCompliance2Ent udpMIBCompliance2;

                public final UdpMIBComplianceEnt udpMIBCompliance;

                private UdpMIBCompliancesEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                {
                    super(mib, parent, "udpMIBCompliances", "1.3.6.1.2.1.50.2.1", false, false, false, false);
                    this.udpMIBCompliance2 = new UdpMIBCompliance2Ent(mib, this);
                    this.udpMIBCompliance = new UdpMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.udpMIBCompliance2,
                        this.udpMIBCompliance
                    };
                }
                public static final class UdpMIBCompliance2Ent extends MIBEntry<UDPMIBDef>
                {
                    private UdpMIBCompliance2Ent(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                    {
                        super(mib, parent, "udpMIBCompliance2", "1.3.6.1.2.1.50.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UdpMIBComplianceEnt extends MIBEntry<UDPMIBDef>
                {
                    private UdpMIBComplianceEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                    {
                        super(mib, parent, "udpMIBCompliance", "1.3.6.1.2.1.50.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class UdpMIBGroupsEnt extends MIBEntry<UDPMIBDef>
            {
                /** units of conformance*/
                public final UdpGroupEnt udpGroup;

                public final UdpBaseGroupEnt udpBaseGroup;

                public final UdpHCGroupEnt udpHCGroup;

                public final UdpEndpointGroupEnt udpEndpointGroup;

                private UdpMIBGroupsEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                {
                    super(mib, parent, "udpMIBGroups", "1.3.6.1.2.1.50.2.2", false, false, false, false);
                    this.udpGroup = new UdpGroupEnt(mib, this);
                    this.udpBaseGroup = new UdpBaseGroupEnt(mib, this);
                    this.udpHCGroup = new UdpHCGroupEnt(mib, this);
                    this.udpEndpointGroup = new UdpEndpointGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.udpGroup,
                        this.udpBaseGroup,
                        this.udpHCGroup,
                        this.udpEndpointGroup
                    };
                }
                public static final class UdpGroupEnt extends MIBEntry<UDPMIBDef>
                {
                    private UdpGroupEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                    {
                        super(mib, parent, "udpGroup", "1.3.6.1.2.1.50.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UdpBaseGroupEnt extends MIBEntry<UDPMIBDef>
                {
                    private UdpBaseGroupEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                    {
                        super(mib, parent, "udpBaseGroup", "1.3.6.1.2.1.50.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UdpHCGroupEnt extends MIBEntry<UDPMIBDef>
                {
                    private UdpHCGroupEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                    {
                        super(mib, parent, "udpHCGroup", "1.3.6.1.2.1.50.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UdpEndpointGroupEnt extends MIBEntry<UDPMIBDef>
                {
                    private UdpEndpointGroupEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                    {
                        super(mib, parent, "udpEndpointGroup", "1.3.6.1.2.1.50.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class UdpEnt extends MIBEntry<UDPMIBDef>
    {
        /** the UDP group
Implementation of the UDP group is mandatory for allsystems which implement the UDP.*/
        public final UdpInDatagramsEnt udpInDatagrams;

        public final UdpNoPortsEnt udpNoPorts;

        public final UdpInErrorsEnt udpInErrors;

        public final UdpOutDatagramsEnt udpOutDatagrams;

        /** the UDP Listener table
The UDP listener table contains information about thisentity's UDP end-points on which a local application iscurrently accepting datagrams.*/
        public final UdpTableEnt udpTable;

        private UdpEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
        {
            super(mib, parent, "udp", "1.3.6.1.2.1.7", false, false, false, false);
            this.udpInDatagrams = new UdpInDatagramsEnt(mib, this);
            this.udpNoPorts = new UdpNoPortsEnt(mib, this);
            this.udpInErrors = new UdpInErrorsEnt(mib, this);
            this.udpOutDatagrams = new UdpOutDatagramsEnt(mib, this);
            this.udpTable = new UdpTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.udpInDatagrams,
                this.udpNoPorts,
                this.udpInErrors,
                this.udpOutDatagrams,
                this.udpTable
            };
        }
        public static final class UdpInDatagramsEnt extends MIBEntry<UDPMIBDef>
        {
            private UdpInDatagramsEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
            {
                super(mib, parent, "udpInDatagrams", "1.3.6.1.2.1.7.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class UdpNoPortsEnt extends MIBEntry<UDPMIBDef>
        {
            private UdpNoPortsEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
            {
                super(mib, parent, "udpNoPorts", "1.3.6.1.2.1.7.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class UdpInErrorsEnt extends MIBEntry<UDPMIBDef>
        {
            private UdpInErrorsEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
            {
                super(mib, parent, "udpInErrors", "1.3.6.1.2.1.7.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class UdpOutDatagramsEnt extends MIBEntry<UDPMIBDef>
        {
            private UdpOutDatagramsEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
            {
                super(mib, parent, "udpOutDatagrams", "1.3.6.1.2.1.7.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class UdpTableEnt extends MIBEntry<UDPMIBDef>
        {
            public final UdpEntryEnt udpEntry;

            private UdpTableEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
            {
                super(mib, parent, "udpTable", "1.3.6.1.2.1.7.5", false, true, false, false);
                this.udpEntry = new UdpEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.udpEntry
                };
            }
            public static final class UdpEntryEnt extends MIBEntry<UDPMIBDef>
            {
                public final UdpLocalAddressEnt udpLocalAddress;

                public final UdpLocalPortEnt udpLocalPort;

                private UdpEntryEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                {
                    super(mib, parent, "udpEntry", "1.3.6.1.2.1.7.5.1", false, false, false, true);
                    this.udpLocalAddress = new UdpLocalAddressEnt(mib, this);
                    this.udpLocalPort = new UdpLocalPortEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.udpLocalAddress,
                        this.udpLocalPort
                    };
                }
                public static final class UdpLocalAddressEnt extends MIBEntry<UDPMIBDef>
                {
                    private UdpLocalAddressEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                    {
                        super(mib, parent, "udpLocalAddress", "1.3.6.1.2.1.7.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UdpLocalPortEnt extends MIBEntry<UDPMIBDef>
                {
                    private UdpLocalPortEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                    {
                        super(mib, parent, "udpLocalPort", "1.3.6.1.2.1.7.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class UdpHCInDatagramsEnt extends MIBEntry<UDPMIBDef>
    {
        private UdpHCInDatagramsEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
        {
            super(mib, parent, "udpHCInDatagrams", "1.3.6.1.2.1.7.8", true, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class UdpHCOutDatagramsEnt extends MIBEntry<UDPMIBDef>
    {
        private UdpHCOutDatagramsEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
        {
            super(mib, parent, "udpHCOutDatagrams", "1.3.6.1.2.1.7.9", true, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class UdpEndpointTableEnt extends MIBEntry<UDPMIBDef>
    {
        public final UdpEndpointEntryEnt udpEndpointEntry;

        private UdpEndpointTableEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
        {
            super(mib, parent, "udpEndpointTable", "1.3.6.1.2.1.7.7", false, true, false, false);
            this.udpEndpointEntry = new UdpEndpointEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.udpEndpointEntry
            };
        }
        public static final class UdpEndpointEntryEnt extends MIBEntry<UDPMIBDef>
        {
            public final UdpEndpointLocalAddressTypeEnt udpEndpointLocalAddressType;

            public final UdpEndpointLocalAddressEnt udpEndpointLocalAddress;

            public final UdpEndpointLocalPortEnt udpEndpointLocalPort;

            public final UdpEndpointRemoteAddressTypeEnt udpEndpointRemoteAddressType;

            public final UdpEndpointRemoteAddressEnt udpEndpointRemoteAddress;

            public final UdpEndpointRemotePortEnt udpEndpointRemotePort;

            public final UdpEndpointInstanceEnt udpEndpointInstance;

            public final UdpEndpointProcessEnt udpEndpointProcess;

            private UdpEndpointEntryEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
            {
                super(mib, parent, "udpEndpointEntry", "1.3.6.1.2.1.7.7.1", false, false, false, true);
                this.udpEndpointLocalAddressType = new UdpEndpointLocalAddressTypeEnt(mib, this);
                this.udpEndpointLocalAddress = new UdpEndpointLocalAddressEnt(mib, this);
                this.udpEndpointLocalPort = new UdpEndpointLocalPortEnt(mib, this);
                this.udpEndpointRemoteAddressType = new UdpEndpointRemoteAddressTypeEnt(mib, this);
                this.udpEndpointRemoteAddress = new UdpEndpointRemoteAddressEnt(mib, this);
                this.udpEndpointRemotePort = new UdpEndpointRemotePortEnt(mib, this);
                this.udpEndpointInstance = new UdpEndpointInstanceEnt(mib, this);
                this.udpEndpointProcess = new UdpEndpointProcessEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.udpEndpointLocalAddressType,
                    this.udpEndpointLocalAddress,
                    this.udpEndpointLocalPort,
                    this.udpEndpointRemoteAddressType,
                    this.udpEndpointRemoteAddress,
                    this.udpEndpointRemotePort,
                    this.udpEndpointInstance,
                    this.udpEndpointProcess
                };
            }
            public static final class UdpEndpointLocalAddressTypeEnt extends MIBEntry<UDPMIBDef>
            {
                private UdpEndpointLocalAddressTypeEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                {
                    super(mib, parent, "udpEndpointLocalAddressType", "1.3.6.1.2.1.7.7.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UdpEndpointLocalAddressEnt extends MIBEntry<UDPMIBDef>
            {
                private UdpEndpointLocalAddressEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                {
                    super(mib, parent, "udpEndpointLocalAddress", "1.3.6.1.2.1.7.7.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UdpEndpointLocalPortEnt extends MIBEntry<UDPMIBDef>
            {
                private UdpEndpointLocalPortEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                {
                    super(mib, parent, "udpEndpointLocalPort", "1.3.6.1.2.1.7.7.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UdpEndpointRemoteAddressTypeEnt extends MIBEntry<UDPMIBDef>
            {
                private UdpEndpointRemoteAddressTypeEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                {
                    super(mib, parent, "udpEndpointRemoteAddressType", "1.3.6.1.2.1.7.7.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UdpEndpointRemoteAddressEnt extends MIBEntry<UDPMIBDef>
            {
                private UdpEndpointRemoteAddressEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                {
                    super(mib, parent, "udpEndpointRemoteAddress", "1.3.6.1.2.1.7.7.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UdpEndpointRemotePortEnt extends MIBEntry<UDPMIBDef>
            {
                private UdpEndpointRemotePortEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                {
                    super(mib, parent, "udpEndpointRemotePort", "1.3.6.1.2.1.7.7.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UdpEndpointInstanceEnt extends MIBEntry<UDPMIBDef>
            {
                private UdpEndpointInstanceEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                {
                    super(mib, parent, "udpEndpointInstance", "1.3.6.1.2.1.7.7.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UdpEndpointProcessEnt extends MIBEntry<UDPMIBDef>
            {
                private UdpEndpointProcessEnt(UDPMIBDef mib, MIBEntry<UDPMIBDef> parent)
                {
                    super(mib, parent, "udpEndpointProcess", "1.3.6.1.2.1.7.7.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
