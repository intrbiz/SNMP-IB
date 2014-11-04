package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2579]
[RFC2580]
[RFC2856]
[RFC2863]
[RFC3411]
[RFC4001]*/
public final class IPMCASTMIBDef extends MIB
{
    public static final IPMCASTMIBDef IPMCASTMIB = new IPMCASTMIBDef();

    static { MIBs.getInstance().registerMIB(IPMCASTMIBDef.IPMCASTMIB); }

    /** [RFC5131]

9 November 2007*/
    public final IpMcastMIBEnt ipMcastMIB;

    private IPMCASTMIBDef()
    {
        super("IPMCAST-MIB");
        this.ipMcastMIB = new IpMcastMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ipMcastMIB
        };
    }

    public static final class IpMcastMIBEnt extends MIBEntry<IPMCASTMIBDef>
    {
        /** Top-level structure of the MIB*/
        public final IpMcastEnt ipMcast;

        /** Conformance information*/
        public final IpMcastMIBConformanceEnt ipMcastMIBConformance;

        private IpMcastMIBEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
        {
            super(mib, parent, "ipMcastMIB", "1.3.6.1.2.1.168", false, false, false, false);
            this.ipMcast = new IpMcastEnt(mib, this);
            this.ipMcastMIBConformance = new IpMcastMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipMcast,
                this.ipMcastMIBConformance
            };
        }
        public static final class IpMcastEnt extends MIBEntry<IPMCASTMIBDef>
        {
            public final IpMcastEnabledEnt ipMcastEnabled;

            public final IpMcastRouteEntryCountEnt ipMcastRouteEntryCount;

            public final IpMcastDeviceConfigStorageTypeEnt ipMcastDeviceConfigStorageType;

            /** The Multicast Interface Table*/
            public final IpMcastInterfaceTableEnt ipMcastInterfaceTable;

            /** The SSM Range Table*/
            public final IpMcastSsmRangeTableEnt ipMcastSsmRangeTable;

            /** The IP Multicast Routing Table*/
            public final IpMcastRouteTableEnt ipMcastRouteTable;

            /** The IP Multicast Routing Next Hop Table*/
            public final IpMcastRouteNextHopTableEnt ipMcastRouteNextHopTable;

            /** The IP Multicast Scope Boundary Table*/
            public final IpMcastBoundaryTableEnt ipMcastBoundaryTable;

            /** The IP Multicast Scope Name Table*/
            public final IpMcastScopeNameTableEnt ipMcastScopeNameTable;

            /** The Multicast Listeners Table*/
            public final IpMcastLocalListenerTableEnt ipMcastLocalListenerTable;

            /** The Multicast Zone Table*/
            public final IpMcastZoneTableEnt ipMcastZoneTable;

            private IpMcastEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
            {
                super(mib, parent, "ipMcast", "1.3.6.1.2.1.168.1", false, false, false, false);
                this.ipMcastEnabled = new IpMcastEnabledEnt(mib, this);
                this.ipMcastRouteEntryCount = new IpMcastRouteEntryCountEnt(mib, this);
                this.ipMcastDeviceConfigStorageType = new IpMcastDeviceConfigStorageTypeEnt(mib, this);
                this.ipMcastInterfaceTable = new IpMcastInterfaceTableEnt(mib, this);
                this.ipMcastSsmRangeTable = new IpMcastSsmRangeTableEnt(mib, this);
                this.ipMcastRouteTable = new IpMcastRouteTableEnt(mib, this);
                this.ipMcastRouteNextHopTable = new IpMcastRouteNextHopTableEnt(mib, this);
                this.ipMcastBoundaryTable = new IpMcastBoundaryTableEnt(mib, this);
                this.ipMcastScopeNameTable = new IpMcastScopeNameTableEnt(mib, this);
                this.ipMcastLocalListenerTable = new IpMcastLocalListenerTableEnt(mib, this);
                this.ipMcastZoneTable = new IpMcastZoneTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipMcastEnabled,
                    this.ipMcastRouteEntryCount,
                    this.ipMcastDeviceConfigStorageType,
                    this.ipMcastInterfaceTable,
                    this.ipMcastSsmRangeTable,
                    this.ipMcastRouteTable,
                    this.ipMcastRouteNextHopTable,
                    this.ipMcastBoundaryTable,
                    this.ipMcastScopeNameTable,
                    this.ipMcastLocalListenerTable,
                    this.ipMcastZoneTable
                };
            }
            public static final class IpMcastEnabledEnt extends MIBEntry<IPMCASTMIBDef>
            {
                private IpMcastEnabledEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                {
                    super(mib, parent, "ipMcastEnabled", "1.3.6.1.2.1.168.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpMcastRouteEntryCountEnt extends MIBEntry<IPMCASTMIBDef>
            {
                private IpMcastRouteEntryCountEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                {
                    super(mib, parent, "ipMcastRouteEntryCount", "1.3.6.1.2.1.168.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpMcastDeviceConfigStorageTypeEnt extends MIBEntry<IPMCASTMIBDef>
            {
                private IpMcastDeviceConfigStorageTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                {
                    super(mib, parent, "ipMcastDeviceConfigStorageType", "1.3.6.1.2.1.168.1.11", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpMcastInterfaceTableEnt extends MIBEntry<IPMCASTMIBDef>
            {
                public final IpMcastInterfaceEntryEnt ipMcastInterfaceEntry;

                private IpMcastInterfaceTableEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                {
                    super(mib, parent, "ipMcastInterfaceTable", "1.3.6.1.2.1.168.1.3", false, true, false, false);
                    this.ipMcastInterfaceEntry = new IpMcastInterfaceEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipMcastInterfaceEntry
                    };
                }
                public static final class IpMcastInterfaceEntryEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    public final IpMcastInterfaceIPVersionEnt ipMcastInterfaceIPVersion;

                    public final IpMcastInterfaceIfIndexEnt ipMcastInterfaceIfIndex;

                    public final IpMcastInterfaceTtlEnt ipMcastInterfaceTtl;

                    public final IpMcastInterfaceRateLimitEnt ipMcastInterfaceRateLimit;

                    public final IpMcastInterfaceStorageTypeEnt ipMcastInterfaceStorageType;

                    private IpMcastInterfaceEntryEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastInterfaceEntry", "1.3.6.1.2.1.168.1.3.1", false, false, false, true);
                        this.ipMcastInterfaceIPVersion = new IpMcastInterfaceIPVersionEnt(mib, this);
                        this.ipMcastInterfaceIfIndex = new IpMcastInterfaceIfIndexEnt(mib, this);
                        this.ipMcastInterfaceTtl = new IpMcastInterfaceTtlEnt(mib, this);
                        this.ipMcastInterfaceRateLimit = new IpMcastInterfaceRateLimitEnt(mib, this);
                        this.ipMcastInterfaceStorageType = new IpMcastInterfaceStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipMcastInterfaceIPVersion,
                            this.ipMcastInterfaceIfIndex,
                            this.ipMcastInterfaceTtl,
                            this.ipMcastInterfaceRateLimit,
                            this.ipMcastInterfaceStorageType
                        };
                    }
                    public static final class IpMcastInterfaceIPVersionEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastInterfaceIPVersionEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastInterfaceIPVersion", "1.3.6.1.2.1.168.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastInterfaceIfIndexEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastInterfaceIfIndexEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastInterfaceIfIndex", "1.3.6.1.2.1.168.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastInterfaceTtlEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastInterfaceTtlEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastInterfaceTtl", "1.3.6.1.2.1.168.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastInterfaceRateLimitEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastInterfaceRateLimitEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastInterfaceRateLimit", "1.3.6.1.2.1.168.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastInterfaceStorageTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastInterfaceStorageTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastInterfaceStorageType", "1.3.6.1.2.1.168.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IpMcastSsmRangeTableEnt extends MIBEntry<IPMCASTMIBDef>
            {
                public final IpMcastSsmRangeEntryEnt ipMcastSsmRangeEntry;

                private IpMcastSsmRangeTableEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                {
                    super(mib, parent, "ipMcastSsmRangeTable", "1.3.6.1.2.1.168.1.4", false, true, false, false);
                    this.ipMcastSsmRangeEntry = new IpMcastSsmRangeEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipMcastSsmRangeEntry
                    };
                }
                public static final class IpMcastSsmRangeEntryEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    public final IpMcastSsmRangeAddressTypeEnt ipMcastSsmRangeAddressType;

                    public final IpMcastSsmRangeAddressEnt ipMcastSsmRangeAddress;

                    public final IpMcastSsmRangePrefixLengthEnt ipMcastSsmRangePrefixLength;

                    public final IpMcastSsmRangeRowStatusEnt ipMcastSsmRangeRowStatus;

                    public final IpMcastSsmRangeStorageTypeEnt ipMcastSsmRangeStorageType;

                    private IpMcastSsmRangeEntryEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastSsmRangeEntry", "1.3.6.1.2.1.168.1.4.1", false, false, false, true);
                        this.ipMcastSsmRangeAddressType = new IpMcastSsmRangeAddressTypeEnt(mib, this);
                        this.ipMcastSsmRangeAddress = new IpMcastSsmRangeAddressEnt(mib, this);
                        this.ipMcastSsmRangePrefixLength = new IpMcastSsmRangePrefixLengthEnt(mib, this);
                        this.ipMcastSsmRangeRowStatus = new IpMcastSsmRangeRowStatusEnt(mib, this);
                        this.ipMcastSsmRangeStorageType = new IpMcastSsmRangeStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipMcastSsmRangeAddressType,
                            this.ipMcastSsmRangeAddress,
                            this.ipMcastSsmRangePrefixLength,
                            this.ipMcastSsmRangeRowStatus,
                            this.ipMcastSsmRangeStorageType
                        };
                    }
                    public static final class IpMcastSsmRangeAddressTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastSsmRangeAddressTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastSsmRangeAddressType", "1.3.6.1.2.1.168.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastSsmRangeAddressEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastSsmRangeAddressEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastSsmRangeAddress", "1.3.6.1.2.1.168.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastSsmRangePrefixLengthEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastSsmRangePrefixLengthEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastSsmRangePrefixLength", "1.3.6.1.2.1.168.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastSsmRangeRowStatusEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastSsmRangeRowStatusEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastSsmRangeRowStatus", "1.3.6.1.2.1.168.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastSsmRangeStorageTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastSsmRangeStorageTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastSsmRangeStorageType", "1.3.6.1.2.1.168.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IpMcastRouteTableEnt extends MIBEntry<IPMCASTMIBDef>
            {
                public final IpMcastRouteEntryEnt ipMcastRouteEntry;

                private IpMcastRouteTableEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                {
                    super(mib, parent, "ipMcastRouteTable", "1.3.6.1.2.1.168.1.5", false, true, false, false);
                    this.ipMcastRouteEntry = new IpMcastRouteEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipMcastRouteEntry
                    };
                }
                public static final class IpMcastRouteEntryEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    public final IpMcastRouteGroupAddressTypeEnt ipMcastRouteGroupAddressType;

                    public final IpMcastRouteGroupEnt ipMcastRouteGroup;

                    public final IpMcastRouteGroupPrefixLengthEnt ipMcastRouteGroupPrefixLength;

                    public final IpMcastRouteSourceAddressTypeEnt ipMcastRouteSourceAddressType;

                    public final IpMcastRouteSourceEnt ipMcastRouteSource;

                    public final IpMcastRouteSourcePrefixLengthEnt ipMcastRouteSourcePrefixLength;

                    public final IpMcastRouteUpstreamNeighborTypeEnt ipMcastRouteUpstreamNeighborType;

                    public final IpMcastRouteUpstreamNeighborEnt ipMcastRouteUpstreamNeighbor;

                    public final IpMcastRouteInIfIndexEnt ipMcastRouteInIfIndex;

                    public final IpMcastRouteTimeStampEnt ipMcastRouteTimeStamp;

                    public final IpMcastRouteExpiryTimeEnt ipMcastRouteExpiryTime;

                    public final IpMcastRouteProtocolEnt ipMcastRouteProtocol;

                    public final IpMcastRouteRtProtocolEnt ipMcastRouteRtProtocol;

                    public final IpMcastRouteRtAddressTypeEnt ipMcastRouteRtAddressType;

                    public final IpMcastRouteRtAddressEnt ipMcastRouteRtAddress;

                    public final IpMcastRouteRtPrefixLengthEnt ipMcastRouteRtPrefixLength;

                    public final IpMcastRouteRtTypeEnt ipMcastRouteRtType;

                    public final IpMcastRouteOctetsEnt ipMcastRouteOctets;

                    public final IpMcastRoutePktsEnt ipMcastRoutePkts;

                    public final IpMcastRouteTtlDropOctetsEnt ipMcastRouteTtlDropOctets;

                    public final IpMcastRouteTtlDropPacketsEnt ipMcastRouteTtlDropPackets;

                    public final IpMcastRouteDifferentInIfOctetsEnt ipMcastRouteDifferentInIfOctets;

                    public final IpMcastRouteDifferentInIfPacketsEnt ipMcastRouteDifferentInIfPackets;

                    public final IpMcastRouteBpsEnt ipMcastRouteBps;

                    private IpMcastRouteEntryEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastRouteEntry", "1.3.6.1.2.1.168.1.5.1", false, false, false, true);
                        this.ipMcastRouteGroupAddressType = new IpMcastRouteGroupAddressTypeEnt(mib, this);
                        this.ipMcastRouteGroup = new IpMcastRouteGroupEnt(mib, this);
                        this.ipMcastRouteGroupPrefixLength = new IpMcastRouteGroupPrefixLengthEnt(mib, this);
                        this.ipMcastRouteSourceAddressType = new IpMcastRouteSourceAddressTypeEnt(mib, this);
                        this.ipMcastRouteSource = new IpMcastRouteSourceEnt(mib, this);
                        this.ipMcastRouteSourcePrefixLength = new IpMcastRouteSourcePrefixLengthEnt(mib, this);
                        this.ipMcastRouteUpstreamNeighborType = new IpMcastRouteUpstreamNeighborTypeEnt(mib, this);
                        this.ipMcastRouteUpstreamNeighbor = new IpMcastRouteUpstreamNeighborEnt(mib, this);
                        this.ipMcastRouteInIfIndex = new IpMcastRouteInIfIndexEnt(mib, this);
                        this.ipMcastRouteTimeStamp = new IpMcastRouteTimeStampEnt(mib, this);
                        this.ipMcastRouteExpiryTime = new IpMcastRouteExpiryTimeEnt(mib, this);
                        this.ipMcastRouteProtocol = new IpMcastRouteProtocolEnt(mib, this);
                        this.ipMcastRouteRtProtocol = new IpMcastRouteRtProtocolEnt(mib, this);
                        this.ipMcastRouteRtAddressType = new IpMcastRouteRtAddressTypeEnt(mib, this);
                        this.ipMcastRouteRtAddress = new IpMcastRouteRtAddressEnt(mib, this);
                        this.ipMcastRouteRtPrefixLength = new IpMcastRouteRtPrefixLengthEnt(mib, this);
                        this.ipMcastRouteRtType = new IpMcastRouteRtTypeEnt(mib, this);
                        this.ipMcastRouteOctets = new IpMcastRouteOctetsEnt(mib, this);
                        this.ipMcastRoutePkts = new IpMcastRoutePktsEnt(mib, this);
                        this.ipMcastRouteTtlDropOctets = new IpMcastRouteTtlDropOctetsEnt(mib, this);
                        this.ipMcastRouteTtlDropPackets = new IpMcastRouteTtlDropPacketsEnt(mib, this);
                        this.ipMcastRouteDifferentInIfOctets = new IpMcastRouteDifferentInIfOctetsEnt(mib, this);
                        this.ipMcastRouteDifferentInIfPackets = new IpMcastRouteDifferentInIfPacketsEnt(mib, this);
                        this.ipMcastRouteBps = new IpMcastRouteBpsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipMcastRouteGroupAddressType,
                            this.ipMcastRouteGroup,
                            this.ipMcastRouteGroupPrefixLength,
                            this.ipMcastRouteSourceAddressType,
                            this.ipMcastRouteSource,
                            this.ipMcastRouteSourcePrefixLength,
                            this.ipMcastRouteUpstreamNeighborType,
                            this.ipMcastRouteUpstreamNeighbor,
                            this.ipMcastRouteInIfIndex,
                            this.ipMcastRouteTimeStamp,
                            this.ipMcastRouteExpiryTime,
                            this.ipMcastRouteProtocol,
                            this.ipMcastRouteRtProtocol,
                            this.ipMcastRouteRtAddressType,
                            this.ipMcastRouteRtAddress,
                            this.ipMcastRouteRtPrefixLength,
                            this.ipMcastRouteRtType,
                            this.ipMcastRouteOctets,
                            this.ipMcastRoutePkts,
                            this.ipMcastRouteTtlDropOctets,
                            this.ipMcastRouteTtlDropPackets,
                            this.ipMcastRouteDifferentInIfOctets,
                            this.ipMcastRouteDifferentInIfPackets,
                            this.ipMcastRouteBps
                        };
                    }
                    public static final class IpMcastRouteGroupAddressTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteGroupAddressTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteGroupAddressType", "1.3.6.1.2.1.168.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteGroupEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteGroupEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteGroup", "1.3.6.1.2.1.168.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteGroupPrefixLengthEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteGroupPrefixLengthEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteGroupPrefixLength", "1.3.6.1.2.1.168.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteSourceAddressTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteSourceAddressTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteSourceAddressType", "1.3.6.1.2.1.168.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteSourceEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteSourceEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteSource", "1.3.6.1.2.1.168.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteSourcePrefixLengthEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteSourcePrefixLengthEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteSourcePrefixLength", "1.3.6.1.2.1.168.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteUpstreamNeighborTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteUpstreamNeighborTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteUpstreamNeighborType", "1.3.6.1.2.1.168.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteUpstreamNeighborEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteUpstreamNeighborEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteUpstreamNeighbor", "1.3.6.1.2.1.168.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteInIfIndexEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteInIfIndexEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteInIfIndex", "1.3.6.1.2.1.168.1.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteTimeStampEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteTimeStampEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteTimeStamp", "1.3.6.1.2.1.168.1.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteExpiryTimeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteExpiryTimeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteExpiryTime", "1.3.6.1.2.1.168.1.5.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteProtocolEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteProtocolEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteProtocol", "1.3.6.1.2.1.168.1.5.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteRtProtocolEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteRtProtocolEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteRtProtocol", "1.3.6.1.2.1.168.1.5.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteRtAddressTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteRtAddressTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteRtAddressType", "1.3.6.1.2.1.168.1.5.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteRtAddressEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteRtAddressEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteRtAddress", "1.3.6.1.2.1.168.1.5.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteRtPrefixLengthEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteRtPrefixLengthEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteRtPrefixLength", "1.3.6.1.2.1.168.1.5.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteRtTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteRtTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteRtType", "1.3.6.1.2.1.168.1.5.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteOctetsEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteOctetsEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteOctets", "1.3.6.1.2.1.168.1.5.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRoutePktsEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRoutePktsEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRoutePkts", "1.3.6.1.2.1.168.1.5.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteTtlDropOctetsEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteTtlDropOctetsEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteTtlDropOctets", "1.3.6.1.2.1.168.1.5.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteTtlDropPacketsEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteTtlDropPacketsEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteTtlDropPackets", "1.3.6.1.2.1.168.1.5.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteDifferentInIfOctetsEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteDifferentInIfOctetsEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteDifferentInIfOctets", "1.3.6.1.2.1.168.1.5.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteDifferentInIfPacketsEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteDifferentInIfPacketsEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteDifferentInIfPackets", "1.3.6.1.2.1.168.1.5.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteBpsEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteBpsEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteBps", "1.3.6.1.2.1.168.1.5.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IpMcastRouteNextHopTableEnt extends MIBEntry<IPMCASTMIBDef>
            {
                public final IpMcastRouteNextHopEntryEnt ipMcastRouteNextHopEntry;

                private IpMcastRouteNextHopTableEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                {
                    super(mib, parent, "ipMcastRouteNextHopTable", "1.3.6.1.2.1.168.1.6", false, true, false, false);
                    this.ipMcastRouteNextHopEntry = new IpMcastRouteNextHopEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipMcastRouteNextHopEntry
                    };
                }
                public static final class IpMcastRouteNextHopEntryEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    public final IpMcastRouteNextHopGroupAddressTypeEnt ipMcastRouteNextHopGroupAddressType;

                    public final IpMcastRouteNextHopGroupEnt ipMcastRouteNextHopGroup;

                    public final IpMcastRouteNextHopGroupPrefixLengthEnt ipMcastRouteNextHopGroupPrefixLength;

                    public final IpMcastRouteNextHopSourceAddressTypeEnt ipMcastRouteNextHopSourceAddressType;

                    public final IpMcastRouteNextHopSourceEnt ipMcastRouteNextHopSource;

                    public final IpMcastRouteNextHopSourcePrefixLengthEnt ipMcastRouteNextHopSourcePrefixLength;

                    public final IpMcastRouteNextHopIfIndexEnt ipMcastRouteNextHopIfIndex;

                    public final IpMcastRouteNextHopAddressTypeEnt ipMcastRouteNextHopAddressType;

                    public final IpMcastRouteNextHopAddressEnt ipMcastRouteNextHopAddress;

                    public final IpMcastRouteNextHopStateEnt ipMcastRouteNextHopState;

                    public final IpMcastRouteNextHopTimeStampEnt ipMcastRouteNextHopTimeStamp;

                    public final IpMcastRouteNextHopExpiryTimeEnt ipMcastRouteNextHopExpiryTime;

                    public final IpMcastRouteNextHopClosestMemberHopsEnt ipMcastRouteNextHopClosestMemberHops;

                    public final IpMcastRouteNextHopProtocolEnt ipMcastRouteNextHopProtocol;

                    public final IpMcastRouteNextHopOctetsEnt ipMcastRouteNextHopOctets;

                    public final IpMcastRouteNextHopPktsEnt ipMcastRouteNextHopPkts;

                    private IpMcastRouteNextHopEntryEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastRouteNextHopEntry", "1.3.6.1.2.1.168.1.6.1", false, false, false, true);
                        this.ipMcastRouteNextHopGroupAddressType = new IpMcastRouteNextHopGroupAddressTypeEnt(mib, this);
                        this.ipMcastRouteNextHopGroup = new IpMcastRouteNextHopGroupEnt(mib, this);
                        this.ipMcastRouteNextHopGroupPrefixLength = new IpMcastRouteNextHopGroupPrefixLengthEnt(mib, this);
                        this.ipMcastRouteNextHopSourceAddressType = new IpMcastRouteNextHopSourceAddressTypeEnt(mib, this);
                        this.ipMcastRouteNextHopSource = new IpMcastRouteNextHopSourceEnt(mib, this);
                        this.ipMcastRouteNextHopSourcePrefixLength = new IpMcastRouteNextHopSourcePrefixLengthEnt(mib, this);
                        this.ipMcastRouteNextHopIfIndex = new IpMcastRouteNextHopIfIndexEnt(mib, this);
                        this.ipMcastRouteNextHopAddressType = new IpMcastRouteNextHopAddressTypeEnt(mib, this);
                        this.ipMcastRouteNextHopAddress = new IpMcastRouteNextHopAddressEnt(mib, this);
                        this.ipMcastRouteNextHopState = new IpMcastRouteNextHopStateEnt(mib, this);
                        this.ipMcastRouteNextHopTimeStamp = new IpMcastRouteNextHopTimeStampEnt(mib, this);
                        this.ipMcastRouteNextHopExpiryTime = new IpMcastRouteNextHopExpiryTimeEnt(mib, this);
                        this.ipMcastRouteNextHopClosestMemberHops = new IpMcastRouteNextHopClosestMemberHopsEnt(mib, this);
                        this.ipMcastRouteNextHopProtocol = new IpMcastRouteNextHopProtocolEnt(mib, this);
                        this.ipMcastRouteNextHopOctets = new IpMcastRouteNextHopOctetsEnt(mib, this);
                        this.ipMcastRouteNextHopPkts = new IpMcastRouteNextHopPktsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipMcastRouteNextHopGroupAddressType,
                            this.ipMcastRouteNextHopGroup,
                            this.ipMcastRouteNextHopGroupPrefixLength,
                            this.ipMcastRouteNextHopSourceAddressType,
                            this.ipMcastRouteNextHopSource,
                            this.ipMcastRouteNextHopSourcePrefixLength,
                            this.ipMcastRouteNextHopIfIndex,
                            this.ipMcastRouteNextHopAddressType,
                            this.ipMcastRouteNextHopAddress,
                            this.ipMcastRouteNextHopState,
                            this.ipMcastRouteNextHopTimeStamp,
                            this.ipMcastRouteNextHopExpiryTime,
                            this.ipMcastRouteNextHopClosestMemberHops,
                            this.ipMcastRouteNextHopProtocol,
                            this.ipMcastRouteNextHopOctets,
                            this.ipMcastRouteNextHopPkts
                        };
                    }
                    public static final class IpMcastRouteNextHopGroupAddressTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteNextHopGroupAddressTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteNextHopGroupAddressType", "1.3.6.1.2.1.168.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteNextHopGroupEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteNextHopGroupEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteNextHopGroup", "1.3.6.1.2.1.168.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteNextHopGroupPrefixLengthEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteNextHopGroupPrefixLengthEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteNextHopGroupPrefixLength", "1.3.6.1.2.1.168.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteNextHopSourceAddressTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteNextHopSourceAddressTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteNextHopSourceAddressType", "1.3.6.1.2.1.168.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteNextHopSourceEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteNextHopSourceEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteNextHopSource", "1.3.6.1.2.1.168.1.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteNextHopSourcePrefixLengthEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteNextHopSourcePrefixLengthEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteNextHopSourcePrefixLength", "1.3.6.1.2.1.168.1.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteNextHopIfIndexEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteNextHopIfIndexEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteNextHopIfIndex", "1.3.6.1.2.1.168.1.6.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteNextHopAddressTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteNextHopAddressTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteNextHopAddressType", "1.3.6.1.2.1.168.1.6.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteNextHopAddressEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteNextHopAddressEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteNextHopAddress", "1.3.6.1.2.1.168.1.6.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteNextHopStateEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteNextHopStateEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteNextHopState", "1.3.6.1.2.1.168.1.6.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteNextHopTimeStampEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteNextHopTimeStampEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteNextHopTimeStamp", "1.3.6.1.2.1.168.1.6.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteNextHopExpiryTimeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteNextHopExpiryTimeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteNextHopExpiryTime", "1.3.6.1.2.1.168.1.6.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteNextHopClosestMemberHopsEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteNextHopClosestMemberHopsEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteNextHopClosestMemberHops", "1.3.6.1.2.1.168.1.6.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteNextHopProtocolEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteNextHopProtocolEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteNextHopProtocol", "1.3.6.1.2.1.168.1.6.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteNextHopOctetsEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteNextHopOctetsEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteNextHopOctets", "1.3.6.1.2.1.168.1.6.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastRouteNextHopPktsEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastRouteNextHopPktsEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastRouteNextHopPkts", "1.3.6.1.2.1.168.1.6.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IpMcastBoundaryTableEnt extends MIBEntry<IPMCASTMIBDef>
            {
                public final IpMcastBoundaryEntryEnt ipMcastBoundaryEntry;

                private IpMcastBoundaryTableEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                {
                    super(mib, parent, "ipMcastBoundaryTable", "1.3.6.1.2.1.168.1.7", false, true, false, false);
                    this.ipMcastBoundaryEntry = new IpMcastBoundaryEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipMcastBoundaryEntry
                    };
                }
                public static final class IpMcastBoundaryEntryEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    public final IpMcastBoundaryIfIndexEnt ipMcastBoundaryIfIndex;

                    public final IpMcastBoundaryAddressTypeEnt ipMcastBoundaryAddressType;

                    public final IpMcastBoundaryAddressEnt ipMcastBoundaryAddress;

                    public final IpMcastBoundaryAddressPrefixLengthEnt ipMcastBoundaryAddressPrefixLength;

                    public final IpMcastBoundaryTimeStampEnt ipMcastBoundaryTimeStamp;

                    public final IpMcastBoundaryDroppedMcastOctetsEnt ipMcastBoundaryDroppedMcastOctets;

                    public final IpMcastBoundaryDroppedMcastPktsEnt ipMcastBoundaryDroppedMcastPkts;

                    public final IpMcastBoundaryStatusEnt ipMcastBoundaryStatus;

                    public final IpMcastBoundaryStorageTypeEnt ipMcastBoundaryStorageType;

                    private IpMcastBoundaryEntryEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastBoundaryEntry", "1.3.6.1.2.1.168.1.7.1", false, false, false, true);
                        this.ipMcastBoundaryIfIndex = new IpMcastBoundaryIfIndexEnt(mib, this);
                        this.ipMcastBoundaryAddressType = new IpMcastBoundaryAddressTypeEnt(mib, this);
                        this.ipMcastBoundaryAddress = new IpMcastBoundaryAddressEnt(mib, this);
                        this.ipMcastBoundaryAddressPrefixLength = new IpMcastBoundaryAddressPrefixLengthEnt(mib, this);
                        this.ipMcastBoundaryTimeStamp = new IpMcastBoundaryTimeStampEnt(mib, this);
                        this.ipMcastBoundaryDroppedMcastOctets = new IpMcastBoundaryDroppedMcastOctetsEnt(mib, this);
                        this.ipMcastBoundaryDroppedMcastPkts = new IpMcastBoundaryDroppedMcastPktsEnt(mib, this);
                        this.ipMcastBoundaryStatus = new IpMcastBoundaryStatusEnt(mib, this);
                        this.ipMcastBoundaryStorageType = new IpMcastBoundaryStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipMcastBoundaryIfIndex,
                            this.ipMcastBoundaryAddressType,
                            this.ipMcastBoundaryAddress,
                            this.ipMcastBoundaryAddressPrefixLength,
                            this.ipMcastBoundaryTimeStamp,
                            this.ipMcastBoundaryDroppedMcastOctets,
                            this.ipMcastBoundaryDroppedMcastPkts,
                            this.ipMcastBoundaryStatus,
                            this.ipMcastBoundaryStorageType
                        };
                    }
                    public static final class IpMcastBoundaryIfIndexEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastBoundaryIfIndexEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastBoundaryIfIndex", "1.3.6.1.2.1.168.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastBoundaryAddressTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastBoundaryAddressTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastBoundaryAddressType", "1.3.6.1.2.1.168.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastBoundaryAddressEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastBoundaryAddressEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastBoundaryAddress", "1.3.6.1.2.1.168.1.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastBoundaryAddressPrefixLengthEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastBoundaryAddressPrefixLengthEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastBoundaryAddressPrefixLength", "1.3.6.1.2.1.168.1.7.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastBoundaryTimeStampEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastBoundaryTimeStampEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastBoundaryTimeStamp", "1.3.6.1.2.1.168.1.7.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastBoundaryDroppedMcastOctetsEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastBoundaryDroppedMcastOctetsEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastBoundaryDroppedMcastOctets", "1.3.6.1.2.1.168.1.7.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastBoundaryDroppedMcastPktsEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastBoundaryDroppedMcastPktsEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastBoundaryDroppedMcastPkts", "1.3.6.1.2.1.168.1.7.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastBoundaryStatusEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastBoundaryStatusEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastBoundaryStatus", "1.3.6.1.2.1.168.1.7.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastBoundaryStorageTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastBoundaryStorageTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastBoundaryStorageType", "1.3.6.1.2.1.168.1.7.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IpMcastScopeNameTableEnt extends MIBEntry<IPMCASTMIBDef>
            {
                public final IpMcastScopeNameEntryEnt ipMcastScopeNameEntry;

                private IpMcastScopeNameTableEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                {
                    super(mib, parent, "ipMcastScopeNameTable", "1.3.6.1.2.1.168.1.8", false, true, false, false);
                    this.ipMcastScopeNameEntry = new IpMcastScopeNameEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipMcastScopeNameEntry
                    };
                }
                public static final class IpMcastScopeNameEntryEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    public final IpMcastScopeNameAddressTypeEnt ipMcastScopeNameAddressType;

                    public final IpMcastScopeNameAddressEnt ipMcastScopeNameAddress;

                    public final IpMcastScopeNameAddressPrefixLengthEnt ipMcastScopeNameAddressPrefixLength;

                    public final IpMcastScopeNameLanguageEnt ipMcastScopeNameLanguage;

                    public final IpMcastScopeNameStringEnt ipMcastScopeNameString;

                    public final IpMcastScopeNameDefaultEnt ipMcastScopeNameDefault;

                    public final IpMcastScopeNameStatusEnt ipMcastScopeNameStatus;

                    public final IpMcastScopeNameStorageTypeEnt ipMcastScopeNameStorageType;

                    private IpMcastScopeNameEntryEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastScopeNameEntry", "1.3.6.1.2.1.168.1.8.1", false, false, false, true);
                        this.ipMcastScopeNameAddressType = new IpMcastScopeNameAddressTypeEnt(mib, this);
                        this.ipMcastScopeNameAddress = new IpMcastScopeNameAddressEnt(mib, this);
                        this.ipMcastScopeNameAddressPrefixLength = new IpMcastScopeNameAddressPrefixLengthEnt(mib, this);
                        this.ipMcastScopeNameLanguage = new IpMcastScopeNameLanguageEnt(mib, this);
                        this.ipMcastScopeNameString = new IpMcastScopeNameStringEnt(mib, this);
                        this.ipMcastScopeNameDefault = new IpMcastScopeNameDefaultEnt(mib, this);
                        this.ipMcastScopeNameStatus = new IpMcastScopeNameStatusEnt(mib, this);
                        this.ipMcastScopeNameStorageType = new IpMcastScopeNameStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipMcastScopeNameAddressType,
                            this.ipMcastScopeNameAddress,
                            this.ipMcastScopeNameAddressPrefixLength,
                            this.ipMcastScopeNameLanguage,
                            this.ipMcastScopeNameString,
                            this.ipMcastScopeNameDefault,
                            this.ipMcastScopeNameStatus,
                            this.ipMcastScopeNameStorageType
                        };
                    }
                    public static final class IpMcastScopeNameAddressTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastScopeNameAddressTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastScopeNameAddressType", "1.3.6.1.2.1.168.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastScopeNameAddressEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastScopeNameAddressEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastScopeNameAddress", "1.3.6.1.2.1.168.1.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastScopeNameAddressPrefixLengthEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastScopeNameAddressPrefixLengthEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastScopeNameAddressPrefixLength", "1.3.6.1.2.1.168.1.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastScopeNameLanguageEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastScopeNameLanguageEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastScopeNameLanguage", "1.3.6.1.2.1.168.1.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastScopeNameStringEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastScopeNameStringEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastScopeNameString", "1.3.6.1.2.1.168.1.8.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastScopeNameDefaultEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastScopeNameDefaultEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastScopeNameDefault", "1.3.6.1.2.1.168.1.8.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastScopeNameStatusEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastScopeNameStatusEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastScopeNameStatus", "1.3.6.1.2.1.168.1.8.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastScopeNameStorageTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastScopeNameStorageTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastScopeNameStorageType", "1.3.6.1.2.1.168.1.8.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IpMcastLocalListenerTableEnt extends MIBEntry<IPMCASTMIBDef>
            {
                public final IpMcastLocalListenerEntryEnt ipMcastLocalListenerEntry;

                private IpMcastLocalListenerTableEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                {
                    super(mib, parent, "ipMcastLocalListenerTable", "1.3.6.1.2.1.168.1.9", false, true, false, false);
                    this.ipMcastLocalListenerEntry = new IpMcastLocalListenerEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipMcastLocalListenerEntry
                    };
                }
                public static final class IpMcastLocalListenerEntryEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    public final IpMcastLocalListenerGroupAddressTypeEnt ipMcastLocalListenerGroupAddressType;

                    public final IpMcastLocalListenerGroupAddressEnt ipMcastLocalListenerGroupAddress;

                    public final IpMcastLocalListenerSourceAddressTypeEnt ipMcastLocalListenerSourceAddressType;

                    public final IpMcastLocalListenerSourceAddressEnt ipMcastLocalListenerSourceAddress;

                    public final IpMcastLocalListenerSourcePrefixLengthEnt ipMcastLocalListenerSourcePrefixLength;

                    public final IpMcastLocalListenerIfIndexEnt ipMcastLocalListenerIfIndex;

                    public final IpMcastLocalListenerRunIndexEnt ipMcastLocalListenerRunIndex;

                    private IpMcastLocalListenerEntryEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastLocalListenerEntry", "1.3.6.1.2.1.168.1.9.1", false, false, false, true);
                        this.ipMcastLocalListenerGroupAddressType = new IpMcastLocalListenerGroupAddressTypeEnt(mib, this);
                        this.ipMcastLocalListenerGroupAddress = new IpMcastLocalListenerGroupAddressEnt(mib, this);
                        this.ipMcastLocalListenerSourceAddressType = new IpMcastLocalListenerSourceAddressTypeEnt(mib, this);
                        this.ipMcastLocalListenerSourceAddress = new IpMcastLocalListenerSourceAddressEnt(mib, this);
                        this.ipMcastLocalListenerSourcePrefixLength = new IpMcastLocalListenerSourcePrefixLengthEnt(mib, this);
                        this.ipMcastLocalListenerIfIndex = new IpMcastLocalListenerIfIndexEnt(mib, this);
                        this.ipMcastLocalListenerRunIndex = new IpMcastLocalListenerRunIndexEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipMcastLocalListenerGroupAddressType,
                            this.ipMcastLocalListenerGroupAddress,
                            this.ipMcastLocalListenerSourceAddressType,
                            this.ipMcastLocalListenerSourceAddress,
                            this.ipMcastLocalListenerSourcePrefixLength,
                            this.ipMcastLocalListenerIfIndex,
                            this.ipMcastLocalListenerRunIndex
                        };
                    }
                    public static final class IpMcastLocalListenerGroupAddressTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastLocalListenerGroupAddressTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastLocalListenerGroupAddressType", "1.3.6.1.2.1.168.1.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastLocalListenerGroupAddressEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastLocalListenerGroupAddressEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastLocalListenerGroupAddress", "1.3.6.1.2.1.168.1.9.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastLocalListenerSourceAddressTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastLocalListenerSourceAddressTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastLocalListenerSourceAddressType", "1.3.6.1.2.1.168.1.9.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastLocalListenerSourceAddressEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastLocalListenerSourceAddressEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastLocalListenerSourceAddress", "1.3.6.1.2.1.168.1.9.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastLocalListenerSourcePrefixLengthEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastLocalListenerSourcePrefixLengthEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastLocalListenerSourcePrefixLength", "1.3.6.1.2.1.168.1.9.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastLocalListenerIfIndexEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastLocalListenerIfIndexEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastLocalListenerIfIndex", "1.3.6.1.2.1.168.1.9.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastLocalListenerRunIndexEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastLocalListenerRunIndexEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastLocalListenerRunIndex", "1.3.6.1.2.1.168.1.9.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IpMcastZoneTableEnt extends MIBEntry<IPMCASTMIBDef>
            {
                public final IpMcastZoneEntryEnt ipMcastZoneEntry;

                private IpMcastZoneTableEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                {
                    super(mib, parent, "ipMcastZoneTable", "1.3.6.1.2.1.168.1.10", false, true, false, false);
                    this.ipMcastZoneEntry = new IpMcastZoneEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipMcastZoneEntry
                    };
                }
                public static final class IpMcastZoneEntryEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    public final IpMcastZoneIndexEnt ipMcastZoneIndex;

                    public final IpMcastZoneScopeDefaultZoneIndexEnt ipMcastZoneScopeDefaultZoneIndex;

                    public final IpMcastZoneScopeAddressTypeEnt ipMcastZoneScopeAddressType;

                    public final IpMcastZoneScopeAddressEnt ipMcastZoneScopeAddress;

                    public final IpMcastZoneScopeAddressPrefixLengthEnt ipMcastZoneScopeAddressPrefixLength;

                    private IpMcastZoneEntryEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastZoneEntry", "1.3.6.1.2.1.168.1.10.1", false, false, false, true);
                        this.ipMcastZoneIndex = new IpMcastZoneIndexEnt(mib, this);
                        this.ipMcastZoneScopeDefaultZoneIndex = new IpMcastZoneScopeDefaultZoneIndexEnt(mib, this);
                        this.ipMcastZoneScopeAddressType = new IpMcastZoneScopeAddressTypeEnt(mib, this);
                        this.ipMcastZoneScopeAddress = new IpMcastZoneScopeAddressEnt(mib, this);
                        this.ipMcastZoneScopeAddressPrefixLength = new IpMcastZoneScopeAddressPrefixLengthEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipMcastZoneIndex,
                            this.ipMcastZoneScopeDefaultZoneIndex,
                            this.ipMcastZoneScopeAddressType,
                            this.ipMcastZoneScopeAddress,
                            this.ipMcastZoneScopeAddressPrefixLength
                        };
                    }
                    public static final class IpMcastZoneIndexEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastZoneIndexEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastZoneIndex", "1.3.6.1.2.1.168.1.10.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastZoneScopeDefaultZoneIndexEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastZoneScopeDefaultZoneIndexEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastZoneScopeDefaultZoneIndex", "1.3.6.1.2.1.168.1.10.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastZoneScopeAddressTypeEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastZoneScopeAddressTypeEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastZoneScopeAddressType", "1.3.6.1.2.1.168.1.10.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastZoneScopeAddressEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastZoneScopeAddressEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastZoneScopeAddress", "1.3.6.1.2.1.168.1.10.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpMcastZoneScopeAddressPrefixLengthEnt extends MIBEntry<IPMCASTMIBDef>
                    {
                        private IpMcastZoneScopeAddressPrefixLengthEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                        {
                            super(mib, parent, "ipMcastZoneScopeAddressPrefixLength", "1.3.6.1.2.1.168.1.10.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class IpMcastMIBConformanceEnt extends MIBEntry<IPMCASTMIBDef>
        {
            public final IpMcastMIBCompliancesEnt ipMcastMIBCompliances;

            public final IpMcastMIBGroupsEnt ipMcastMIBGroups;

            private IpMcastMIBConformanceEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
            {
                super(mib, parent, "ipMcastMIBConformance", "1.3.6.1.2.1.168.2", false, false, false, false);
                this.ipMcastMIBCompliances = new IpMcastMIBCompliancesEnt(mib, this);
                this.ipMcastMIBGroups = new IpMcastMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipMcastMIBCompliances,
                    this.ipMcastMIBGroups
                };
            }
            public static final class IpMcastMIBCompliancesEnt extends MIBEntry<IPMCASTMIBDef>
            {
                /** Compliance statements*/
                public final IpMcastMIBComplianceHostEnt ipMcastMIBComplianceHost;

                public final IpMcastMIBComplianceRouterEnt ipMcastMIBComplianceRouter;

                public final IpMcastMIBComplianceBorderRouterEnt ipMcastMIBComplianceBorderRouter;

                private IpMcastMIBCompliancesEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                {
                    super(mib, parent, "ipMcastMIBCompliances", "1.3.6.1.2.1.168.2.1", false, false, false, false);
                    this.ipMcastMIBComplianceHost = new IpMcastMIBComplianceHostEnt(mib, this);
                    this.ipMcastMIBComplianceRouter = new IpMcastMIBComplianceRouterEnt(mib, this);
                    this.ipMcastMIBComplianceBorderRouter = new IpMcastMIBComplianceBorderRouterEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipMcastMIBComplianceHost,
                        this.ipMcastMIBComplianceRouter,
                        this.ipMcastMIBComplianceBorderRouter
                    };
                }
                public static final class IpMcastMIBComplianceHostEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    private IpMcastMIBComplianceHostEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastMIBComplianceHost", "1.3.6.1.2.1.168.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMcastMIBComplianceRouterEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    private IpMcastMIBComplianceRouterEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastMIBComplianceRouter", "1.3.6.1.2.1.168.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMcastMIBComplianceBorderRouterEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    private IpMcastMIBComplianceBorderRouterEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastMIBComplianceBorderRouter", "1.3.6.1.2.1.168.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class IpMcastMIBGroupsEnt extends MIBEntry<IPMCASTMIBDef>
            {
                /** Units of conformance*/
                public final IpMcastMIBBasicGroupEnt ipMcastMIBBasicGroup;

                public final IpMcastMIBSsmGroupEnt ipMcastMIBSsmGroup;

                public final IpMcastMIBRouteGroupEnt ipMcastMIBRouteGroup;

                public final IpMcastMIBRouteDiagnosticsGroupEnt ipMcastMIBRouteDiagnosticsGroup;

                public final IpMcastMIBPktsOutGroupEnt ipMcastMIBPktsOutGroup;

                public final IpMcastMIBHopCountGroupEnt ipMcastMIBHopCountGroup;

                public final IpMcastMIBRouteOctetsGroupEnt ipMcastMIBRouteOctetsGroup;

                public final IpMcastMIBRouteBpsGroupEnt ipMcastMIBRouteBpsGroup;

                public final IpMcastMIBRouteProtoGroupEnt ipMcastMIBRouteProtoGroup;

                public final IpMcastMIBLocalListenerGroupEnt ipMcastMIBLocalListenerGroup;

                public final IpMcastMIBBoundaryIfGroupEnt ipMcastMIBBoundaryIfGroup;

                public final IpMcastMIBScopeNameGroupEnt ipMcastMIBScopeNameGroup;

                private IpMcastMIBGroupsEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                {
                    super(mib, parent, "ipMcastMIBGroups", "1.3.6.1.2.1.168.2.2", false, false, false, false);
                    this.ipMcastMIBBasicGroup = new IpMcastMIBBasicGroupEnt(mib, this);
                    this.ipMcastMIBSsmGroup = new IpMcastMIBSsmGroupEnt(mib, this);
                    this.ipMcastMIBRouteGroup = new IpMcastMIBRouteGroupEnt(mib, this);
                    this.ipMcastMIBRouteDiagnosticsGroup = new IpMcastMIBRouteDiagnosticsGroupEnt(mib, this);
                    this.ipMcastMIBPktsOutGroup = new IpMcastMIBPktsOutGroupEnt(mib, this);
                    this.ipMcastMIBHopCountGroup = new IpMcastMIBHopCountGroupEnt(mib, this);
                    this.ipMcastMIBRouteOctetsGroup = new IpMcastMIBRouteOctetsGroupEnt(mib, this);
                    this.ipMcastMIBRouteBpsGroup = new IpMcastMIBRouteBpsGroupEnt(mib, this);
                    this.ipMcastMIBRouteProtoGroup = new IpMcastMIBRouteProtoGroupEnt(mib, this);
                    this.ipMcastMIBLocalListenerGroup = new IpMcastMIBLocalListenerGroupEnt(mib, this);
                    this.ipMcastMIBBoundaryIfGroup = new IpMcastMIBBoundaryIfGroupEnt(mib, this);
                    this.ipMcastMIBScopeNameGroup = new IpMcastMIBScopeNameGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipMcastMIBBasicGroup,
                        this.ipMcastMIBSsmGroup,
                        this.ipMcastMIBRouteGroup,
                        this.ipMcastMIBRouteDiagnosticsGroup,
                        this.ipMcastMIBPktsOutGroup,
                        this.ipMcastMIBHopCountGroup,
                        this.ipMcastMIBRouteOctetsGroup,
                        this.ipMcastMIBRouteBpsGroup,
                        this.ipMcastMIBRouteProtoGroup,
                        this.ipMcastMIBLocalListenerGroup,
                        this.ipMcastMIBBoundaryIfGroup,
                        this.ipMcastMIBScopeNameGroup
                    };
                }
                public static final class IpMcastMIBBasicGroupEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    private IpMcastMIBBasicGroupEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastMIBBasicGroup", "1.3.6.1.2.1.168.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMcastMIBSsmGroupEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    private IpMcastMIBSsmGroupEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastMIBSsmGroup", "1.3.6.1.2.1.168.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMcastMIBRouteGroupEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    private IpMcastMIBRouteGroupEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastMIBRouteGroup", "1.3.6.1.2.1.168.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMcastMIBRouteDiagnosticsGroupEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    private IpMcastMIBRouteDiagnosticsGroupEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastMIBRouteDiagnosticsGroup", "1.3.6.1.2.1.168.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMcastMIBPktsOutGroupEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    private IpMcastMIBPktsOutGroupEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastMIBPktsOutGroup", "1.3.6.1.2.1.168.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMcastMIBHopCountGroupEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    private IpMcastMIBHopCountGroupEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastMIBHopCountGroup", "1.3.6.1.2.1.168.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMcastMIBRouteOctetsGroupEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    private IpMcastMIBRouteOctetsGroupEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastMIBRouteOctetsGroup", "1.3.6.1.2.1.168.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMcastMIBRouteBpsGroupEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    private IpMcastMIBRouteBpsGroupEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastMIBRouteBpsGroup", "1.3.6.1.2.1.168.2.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMcastMIBRouteProtoGroupEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    private IpMcastMIBRouteProtoGroupEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastMIBRouteProtoGroup", "1.3.6.1.2.1.168.2.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMcastMIBLocalListenerGroupEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    private IpMcastMIBLocalListenerGroupEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastMIBLocalListenerGroup", "1.3.6.1.2.1.168.2.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMcastMIBBoundaryIfGroupEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    private IpMcastMIBBoundaryIfGroupEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastMIBBoundaryIfGroup", "1.3.6.1.2.1.168.2.2.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMcastMIBScopeNameGroupEnt extends MIBEntry<IPMCASTMIBDef>
                {
                    private IpMcastMIBScopeNameGroupEnt(IPMCASTMIBDef mib, MIBEntry<IPMCASTMIBDef> parent)
                    {
                        super(mib, parent, "ipMcastMIBScopeNameGroup", "1.3.6.1.2.1.168.2.2.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
