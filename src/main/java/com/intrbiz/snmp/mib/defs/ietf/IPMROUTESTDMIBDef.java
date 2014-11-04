package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class IPMROUTESTDMIBDef extends MIB
{
    public static final IPMROUTESTDMIBDef IPMROUTESTDMIB = new IPMROUTESTDMIBDef();

    static { MIBs.getInstance().registerMIB(IPMROUTESTDMIBDef.IPMROUTESTDMIB); }

    /** September 22, 2000*/
    public final IpMRouteStdMIBEnt ipMRouteStdMIB;

    private IPMROUTESTDMIBDef()
    {
        super("IPMROUTE-STD-MIB");
        this.ipMRouteStdMIB = new IpMRouteStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ipMRouteStdMIB
        };
    }

    public static final class IpMRouteStdMIBEnt extends MIBEntry<IPMROUTESTDMIBDef>
    {
        /** Top-level structure of the MIB*/
        public final IpMRouteMIBObjectsEnt ipMRouteMIBObjects;

        /** conformance information*/
        public final IpMRouteMIBConformanceEnt ipMRouteMIBConformance;

        private IpMRouteStdMIBEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
        {
            super(mib, parent, "ipMRouteStdMIB", "1.3.6.1.2.1.83", false, false, false, false);
            this.ipMRouteMIBObjects = new IpMRouteMIBObjectsEnt(mib, this);
            this.ipMRouteMIBConformance = new IpMRouteMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipMRouteMIBObjects,
                this.ipMRouteMIBConformance
            };
        }
        public static final class IpMRouteMIBObjectsEnt extends MIBEntry<IPMROUTESTDMIBDef>
        {
            public final IpMRouteEnt ipMRoute;

            private IpMRouteMIBObjectsEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
            {
                super(mib, parent, "ipMRouteMIBObjects", "1.3.6.1.2.1.83.1", false, false, false, false);
                this.ipMRoute = new IpMRouteEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipMRoute
                };
            }
            public static final class IpMRouteEnt extends MIBEntry<IPMROUTESTDMIBDef>
            {
                /** the IP Multicast Routing MIB-Groupa collection of objects providing information aboutIP Multicast Groups*/
                public final IpMRouteEnableEnt ipMRouteEnable;

                public final IpMRouteEntryCountEnt ipMRouteEntryCount;

                public final IpMRouteTableEnt ipMRouteTable;

                /** The IP Multicast Routing Next Hop Table*/
                public final IpMRouteNextHopTableEnt ipMRouteNextHopTable;

                /** The Multicast Routing Interface Table*/
                public final IpMRouteInterfaceTableEnt ipMRouteInterfaceTable;

                /** The IP Multicast Scope Boundary Table*/
                public final IpMRouteBoundaryTableEnt ipMRouteBoundaryTable;

                /** The IP Multicast Scope Name Table*/
                public final IpMRouteScopeNameTableEnt ipMRouteScopeNameTable;

                private IpMRouteEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                {
                    super(mib, parent, "ipMRoute", "1.3.6.1.2.1.83.1.1", false, false, false, false);
                    this.ipMRouteEnable = new IpMRouteEnableEnt(mib, this);
                    this.ipMRouteEntryCount = new IpMRouteEntryCountEnt(mib, this);
                    this.ipMRouteTable = new IpMRouteTableEnt(mib, this);
                    this.ipMRouteNextHopTable = new IpMRouteNextHopTableEnt(mib, this);
                    this.ipMRouteInterfaceTable = new IpMRouteInterfaceTableEnt(mib, this);
                    this.ipMRouteBoundaryTable = new IpMRouteBoundaryTableEnt(mib, this);
                    this.ipMRouteScopeNameTable = new IpMRouteScopeNameTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipMRouteEnable,
                        this.ipMRouteEntryCount,
                        this.ipMRouteTable,
                        this.ipMRouteNextHopTable,
                        this.ipMRouteInterfaceTable,
                        this.ipMRouteBoundaryTable,
                        this.ipMRouteScopeNameTable
                    };
                }
                public static final class IpMRouteEnableEnt extends MIBEntry<IPMROUTESTDMIBDef>
                {
                    private IpMRouteEnableEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                    {
                        super(mib, parent, "ipMRouteEnable", "1.3.6.1.2.1.83.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMRouteEntryCountEnt extends MIBEntry<IPMROUTESTDMIBDef>
                {
                    private IpMRouteEntryCountEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                    {
                        super(mib, parent, "ipMRouteEntryCount", "1.3.6.1.2.1.83.1.1.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMRouteTableEnt extends MIBEntry<IPMROUTESTDMIBDef>
                {
                    public final IpMRouteEntryEnt ipMRouteEntry;

                    private IpMRouteTableEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                    {
                        super(mib, parent, "ipMRouteTable", "1.3.6.1.2.1.83.1.1.2", false, true, false, false);
                        this.ipMRouteEntry = new IpMRouteEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipMRouteEntry
                        };
                    }
                    public static final class IpMRouteEntryEnt extends MIBEntry<IPMROUTESTDMIBDef>
                    {
                        public final IpMRouteGroupEnt ipMRouteGroup;

                        public final IpMRouteSourceEnt ipMRouteSource;

                        public final IpMRouteSourceMaskEnt ipMRouteSourceMask;

                        public final IpMRouteUpstreamNeighborEnt ipMRouteUpstreamNeighbor;

                        public final IpMRouteInIfIndexEnt ipMRouteInIfIndex;

                        public final IpMRouteUpTimeEnt ipMRouteUpTime;

                        public final IpMRouteExpiryTimeEnt ipMRouteExpiryTime;

                        public final IpMRoutePktsEnt ipMRoutePkts;

                        public final IpMRouteDifferentInIfPacketsEnt ipMRouteDifferentInIfPackets;

                        public final IpMRouteOctetsEnt ipMRouteOctets;

                        public final IpMRouteProtocolEnt ipMRouteProtocol;

                        public final IpMRouteRtProtoEnt ipMRouteRtProto;

                        public final IpMRouteRtAddressEnt ipMRouteRtAddress;

                        public final IpMRouteRtMaskEnt ipMRouteRtMask;

                        public final IpMRouteRtTypeEnt ipMRouteRtType;

                        public final IpMRouteHCOctetsEnt ipMRouteHCOctets;

                        private IpMRouteEntryEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                        {
                            super(mib, parent, "ipMRouteEntry", "1.3.6.1.2.1.83.1.1.2.1", false, false, false, true);
                            this.ipMRouteGroup = new IpMRouteGroupEnt(mib, this);
                            this.ipMRouteSource = new IpMRouteSourceEnt(mib, this);
                            this.ipMRouteSourceMask = new IpMRouteSourceMaskEnt(mib, this);
                            this.ipMRouteUpstreamNeighbor = new IpMRouteUpstreamNeighborEnt(mib, this);
                            this.ipMRouteInIfIndex = new IpMRouteInIfIndexEnt(mib, this);
                            this.ipMRouteUpTime = new IpMRouteUpTimeEnt(mib, this);
                            this.ipMRouteExpiryTime = new IpMRouteExpiryTimeEnt(mib, this);
                            this.ipMRoutePkts = new IpMRoutePktsEnt(mib, this);
                            this.ipMRouteDifferentInIfPackets = new IpMRouteDifferentInIfPacketsEnt(mib, this);
                            this.ipMRouteOctets = new IpMRouteOctetsEnt(mib, this);
                            this.ipMRouteProtocol = new IpMRouteProtocolEnt(mib, this);
                            this.ipMRouteRtProto = new IpMRouteRtProtoEnt(mib, this);
                            this.ipMRouteRtAddress = new IpMRouteRtAddressEnt(mib, this);
                            this.ipMRouteRtMask = new IpMRouteRtMaskEnt(mib, this);
                            this.ipMRouteRtType = new IpMRouteRtTypeEnt(mib, this);
                            this.ipMRouteHCOctets = new IpMRouteHCOctetsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ipMRouteGroup,
                                this.ipMRouteSource,
                                this.ipMRouteSourceMask,
                                this.ipMRouteUpstreamNeighbor,
                                this.ipMRouteInIfIndex,
                                this.ipMRouteUpTime,
                                this.ipMRouteExpiryTime,
                                this.ipMRoutePkts,
                                this.ipMRouteDifferentInIfPackets,
                                this.ipMRouteOctets,
                                this.ipMRouteProtocol,
                                this.ipMRouteRtProto,
                                this.ipMRouteRtAddress,
                                this.ipMRouteRtMask,
                                this.ipMRouteRtType,
                                this.ipMRouteHCOctets
                            };
                        }
                        public static final class IpMRouteGroupEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteGroupEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteGroup", "1.3.6.1.2.1.83.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteSourceEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteSourceEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteSource", "1.3.6.1.2.1.83.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteSourceMaskEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteSourceMaskEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteSourceMask", "1.3.6.1.2.1.83.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteUpstreamNeighborEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteUpstreamNeighborEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteUpstreamNeighbor", "1.3.6.1.2.1.83.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteInIfIndexEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteInIfIndexEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteInIfIndex", "1.3.6.1.2.1.83.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteUpTimeEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteUpTimeEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteUpTime", "1.3.6.1.2.1.83.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteExpiryTimeEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteExpiryTimeEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteExpiryTime", "1.3.6.1.2.1.83.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRoutePktsEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRoutePktsEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRoutePkts", "1.3.6.1.2.1.83.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteDifferentInIfPacketsEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteDifferentInIfPacketsEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteDifferentInIfPackets", "1.3.6.1.2.1.83.1.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteOctetsEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteOctetsEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteOctets", "1.3.6.1.2.1.83.1.1.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteProtocolEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteProtocolEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteProtocol", "1.3.6.1.2.1.83.1.1.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteRtProtoEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteRtProtoEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteRtProto", "1.3.6.1.2.1.83.1.1.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteRtAddressEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteRtAddressEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteRtAddress", "1.3.6.1.2.1.83.1.1.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteRtMaskEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteRtMaskEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteRtMask", "1.3.6.1.2.1.83.1.1.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteRtTypeEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteRtTypeEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteRtType", "1.3.6.1.2.1.83.1.1.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteHCOctetsEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteHCOctetsEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteHCOctets", "1.3.6.1.2.1.83.1.1.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IpMRouteNextHopTableEnt extends MIBEntry<IPMROUTESTDMIBDef>
                {
                    public final IpMRouteNextHopEntryEnt ipMRouteNextHopEntry;

                    private IpMRouteNextHopTableEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                    {
                        super(mib, parent, "ipMRouteNextHopTable", "1.3.6.1.2.1.83.1.1.3", false, true, false, false);
                        this.ipMRouteNextHopEntry = new IpMRouteNextHopEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipMRouteNextHopEntry
                        };
                    }
                    public static final class IpMRouteNextHopEntryEnt extends MIBEntry<IPMROUTESTDMIBDef>
                    {
                        public final IpMRouteNextHopGroupEnt ipMRouteNextHopGroup;

                        public final IpMRouteNextHopSourceEnt ipMRouteNextHopSource;

                        public final IpMRouteNextHopSourceMaskEnt ipMRouteNextHopSourceMask;

                        public final IpMRouteNextHopIfIndexEnt ipMRouteNextHopIfIndex;

                        public final IpMRouteNextHopAddressEnt ipMRouteNextHopAddress;

                        public final IpMRouteNextHopStateEnt ipMRouteNextHopState;

                        public final IpMRouteNextHopUpTimeEnt ipMRouteNextHopUpTime;

                        public final IpMRouteNextHopExpiryTimeEnt ipMRouteNextHopExpiryTime;

                        public final IpMRouteNextHopClosestMemberHopsEnt ipMRouteNextHopClosestMemberHops;

                        public final IpMRouteNextHopProtocolEnt ipMRouteNextHopProtocol;

                        public final IpMRouteNextHopPktsEnt ipMRouteNextHopPkts;

                        private IpMRouteNextHopEntryEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                        {
                            super(mib, parent, "ipMRouteNextHopEntry", "1.3.6.1.2.1.83.1.1.3.1", false, false, false, true);
                            this.ipMRouteNextHopGroup = new IpMRouteNextHopGroupEnt(mib, this);
                            this.ipMRouteNextHopSource = new IpMRouteNextHopSourceEnt(mib, this);
                            this.ipMRouteNextHopSourceMask = new IpMRouteNextHopSourceMaskEnt(mib, this);
                            this.ipMRouteNextHopIfIndex = new IpMRouteNextHopIfIndexEnt(mib, this);
                            this.ipMRouteNextHopAddress = new IpMRouteNextHopAddressEnt(mib, this);
                            this.ipMRouteNextHopState = new IpMRouteNextHopStateEnt(mib, this);
                            this.ipMRouteNextHopUpTime = new IpMRouteNextHopUpTimeEnt(mib, this);
                            this.ipMRouteNextHopExpiryTime = new IpMRouteNextHopExpiryTimeEnt(mib, this);
                            this.ipMRouteNextHopClosestMemberHops = new IpMRouteNextHopClosestMemberHopsEnt(mib, this);
                            this.ipMRouteNextHopProtocol = new IpMRouteNextHopProtocolEnt(mib, this);
                            this.ipMRouteNextHopPkts = new IpMRouteNextHopPktsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ipMRouteNextHopGroup,
                                this.ipMRouteNextHopSource,
                                this.ipMRouteNextHopSourceMask,
                                this.ipMRouteNextHopIfIndex,
                                this.ipMRouteNextHopAddress,
                                this.ipMRouteNextHopState,
                                this.ipMRouteNextHopUpTime,
                                this.ipMRouteNextHopExpiryTime,
                                this.ipMRouteNextHopClosestMemberHops,
                                this.ipMRouteNextHopProtocol,
                                this.ipMRouteNextHopPkts
                            };
                        }
                        public static final class IpMRouteNextHopGroupEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteNextHopGroupEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteNextHopGroup", "1.3.6.1.2.1.83.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteNextHopSourceEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteNextHopSourceEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteNextHopSource", "1.3.6.1.2.1.83.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteNextHopSourceMaskEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteNextHopSourceMaskEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteNextHopSourceMask", "1.3.6.1.2.1.83.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteNextHopIfIndexEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteNextHopIfIndexEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteNextHopIfIndex", "1.3.6.1.2.1.83.1.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteNextHopAddressEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteNextHopAddressEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteNextHopAddress", "1.3.6.1.2.1.83.1.1.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteNextHopStateEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteNextHopStateEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteNextHopState", "1.3.6.1.2.1.83.1.1.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteNextHopUpTimeEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteNextHopUpTimeEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteNextHopUpTime", "1.3.6.1.2.1.83.1.1.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteNextHopExpiryTimeEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteNextHopExpiryTimeEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteNextHopExpiryTime", "1.3.6.1.2.1.83.1.1.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteNextHopClosestMemberHopsEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteNextHopClosestMemberHopsEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteNextHopClosestMemberHops", "1.3.6.1.2.1.83.1.1.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteNextHopProtocolEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteNextHopProtocolEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteNextHopProtocol", "1.3.6.1.2.1.83.1.1.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteNextHopPktsEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteNextHopPktsEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteNextHopPkts", "1.3.6.1.2.1.83.1.1.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IpMRouteInterfaceTableEnt extends MIBEntry<IPMROUTESTDMIBDef>
                {
                    public final IpMRouteInterfaceEntryEnt ipMRouteInterfaceEntry;

                    private IpMRouteInterfaceTableEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                    {
                        super(mib, parent, "ipMRouteInterfaceTable", "1.3.6.1.2.1.83.1.1.4", false, true, false, false);
                        this.ipMRouteInterfaceEntry = new IpMRouteInterfaceEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipMRouteInterfaceEntry
                        };
                    }
                    public static final class IpMRouteInterfaceEntryEnt extends MIBEntry<IPMROUTESTDMIBDef>
                    {
                        public final IpMRouteInterfaceIfIndexEnt ipMRouteInterfaceIfIndex;

                        public final IpMRouteInterfaceTtlEnt ipMRouteInterfaceTtl;

                        public final IpMRouteInterfaceProtocolEnt ipMRouteInterfaceProtocol;

                        public final IpMRouteInterfaceRateLimitEnt ipMRouteInterfaceRateLimit;

                        public final IpMRouteInterfaceInMcastOctetsEnt ipMRouteInterfaceInMcastOctets;

                        public final IpMRouteInterfaceOutMcastOctetsEnt ipMRouteInterfaceOutMcastOctets;

                        public final IpMRouteInterfaceHCInMcastOctetsEnt ipMRouteInterfaceHCInMcastOctets;

                        public final IpMRouteInterfaceHCOutMcastOctetsEnt ipMRouteInterfaceHCOutMcastOctets;

                        private IpMRouteInterfaceEntryEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                        {
                            super(mib, parent, "ipMRouteInterfaceEntry", "1.3.6.1.2.1.83.1.1.4.1", false, false, false, true);
                            this.ipMRouteInterfaceIfIndex = new IpMRouteInterfaceIfIndexEnt(mib, this);
                            this.ipMRouteInterfaceTtl = new IpMRouteInterfaceTtlEnt(mib, this);
                            this.ipMRouteInterfaceProtocol = new IpMRouteInterfaceProtocolEnt(mib, this);
                            this.ipMRouteInterfaceRateLimit = new IpMRouteInterfaceRateLimitEnt(mib, this);
                            this.ipMRouteInterfaceInMcastOctets = new IpMRouteInterfaceInMcastOctetsEnt(mib, this);
                            this.ipMRouteInterfaceOutMcastOctets = new IpMRouteInterfaceOutMcastOctetsEnt(mib, this);
                            this.ipMRouteInterfaceHCInMcastOctets = new IpMRouteInterfaceHCInMcastOctetsEnt(mib, this);
                            this.ipMRouteInterfaceHCOutMcastOctets = new IpMRouteInterfaceHCOutMcastOctetsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ipMRouteInterfaceIfIndex,
                                this.ipMRouteInterfaceTtl,
                                this.ipMRouteInterfaceProtocol,
                                this.ipMRouteInterfaceRateLimit,
                                this.ipMRouteInterfaceInMcastOctets,
                                this.ipMRouteInterfaceOutMcastOctets,
                                this.ipMRouteInterfaceHCInMcastOctets,
                                this.ipMRouteInterfaceHCOutMcastOctets
                            };
                        }
                        public static final class IpMRouteInterfaceIfIndexEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteInterfaceIfIndexEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteInterfaceIfIndex", "1.3.6.1.2.1.83.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteInterfaceTtlEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteInterfaceTtlEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteInterfaceTtl", "1.3.6.1.2.1.83.1.1.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteInterfaceProtocolEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteInterfaceProtocolEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteInterfaceProtocol", "1.3.6.1.2.1.83.1.1.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteInterfaceRateLimitEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteInterfaceRateLimitEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteInterfaceRateLimit", "1.3.6.1.2.1.83.1.1.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteInterfaceInMcastOctetsEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteInterfaceInMcastOctetsEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteInterfaceInMcastOctets", "1.3.6.1.2.1.83.1.1.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteInterfaceOutMcastOctetsEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteInterfaceOutMcastOctetsEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteInterfaceOutMcastOctets", "1.3.6.1.2.1.83.1.1.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteInterfaceHCInMcastOctetsEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteInterfaceHCInMcastOctetsEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteInterfaceHCInMcastOctets", "1.3.6.1.2.1.83.1.1.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteInterfaceHCOutMcastOctetsEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteInterfaceHCOutMcastOctetsEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteInterfaceHCOutMcastOctets", "1.3.6.1.2.1.83.1.1.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IpMRouteBoundaryTableEnt extends MIBEntry<IPMROUTESTDMIBDef>
                {
                    public final IpMRouteBoundaryEntryEnt ipMRouteBoundaryEntry;

                    private IpMRouteBoundaryTableEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                    {
                        super(mib, parent, "ipMRouteBoundaryTable", "1.3.6.1.2.1.83.1.1.5", false, true, false, false);
                        this.ipMRouteBoundaryEntry = new IpMRouteBoundaryEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipMRouteBoundaryEntry
                        };
                    }
                    public static final class IpMRouteBoundaryEntryEnt extends MIBEntry<IPMROUTESTDMIBDef>
                    {
                        public final IpMRouteBoundaryIfIndexEnt ipMRouteBoundaryIfIndex;

                        public final IpMRouteBoundaryAddressEnt ipMRouteBoundaryAddress;

                        public final IpMRouteBoundaryAddressMaskEnt ipMRouteBoundaryAddressMask;

                        public final IpMRouteBoundaryStatusEnt ipMRouteBoundaryStatus;

                        private IpMRouteBoundaryEntryEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                        {
                            super(mib, parent, "ipMRouteBoundaryEntry", "1.3.6.1.2.1.83.1.1.5.1", false, false, false, true);
                            this.ipMRouteBoundaryIfIndex = new IpMRouteBoundaryIfIndexEnt(mib, this);
                            this.ipMRouteBoundaryAddress = new IpMRouteBoundaryAddressEnt(mib, this);
                            this.ipMRouteBoundaryAddressMask = new IpMRouteBoundaryAddressMaskEnt(mib, this);
                            this.ipMRouteBoundaryStatus = new IpMRouteBoundaryStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ipMRouteBoundaryIfIndex,
                                this.ipMRouteBoundaryAddress,
                                this.ipMRouteBoundaryAddressMask,
                                this.ipMRouteBoundaryStatus
                            };
                        }
                        public static final class IpMRouteBoundaryIfIndexEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteBoundaryIfIndexEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteBoundaryIfIndex", "1.3.6.1.2.1.83.1.1.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteBoundaryAddressEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteBoundaryAddressEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteBoundaryAddress", "1.3.6.1.2.1.83.1.1.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteBoundaryAddressMaskEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteBoundaryAddressMaskEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteBoundaryAddressMask", "1.3.6.1.2.1.83.1.1.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteBoundaryStatusEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteBoundaryStatusEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteBoundaryStatus", "1.3.6.1.2.1.83.1.1.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IpMRouteScopeNameTableEnt extends MIBEntry<IPMROUTESTDMIBDef>
                {
                    public final IpMRouteScopeNameEntryEnt ipMRouteScopeNameEntry;

                    private IpMRouteScopeNameTableEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                    {
                        super(mib, parent, "ipMRouteScopeNameTable", "1.3.6.1.2.1.83.1.1.6", false, true, false, false);
                        this.ipMRouteScopeNameEntry = new IpMRouteScopeNameEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipMRouteScopeNameEntry
                        };
                    }
                    public static final class IpMRouteScopeNameEntryEnt extends MIBEntry<IPMROUTESTDMIBDef>
                    {
                        public final IpMRouteScopeNameAddressEnt ipMRouteScopeNameAddress;

                        public final IpMRouteScopeNameAddressMaskEnt ipMRouteScopeNameAddressMask;

                        public final IpMRouteScopeNameLanguageEnt ipMRouteScopeNameLanguage;

                        public final IpMRouteScopeNameStringEnt ipMRouteScopeNameString;

                        public final IpMRouteScopeNameDefaultEnt ipMRouteScopeNameDefault;

                        public final IpMRouteScopeNameStatusEnt ipMRouteScopeNameStatus;

                        private IpMRouteScopeNameEntryEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                        {
                            super(mib, parent, "ipMRouteScopeNameEntry", "1.3.6.1.2.1.83.1.1.6.1", false, false, false, true);
                            this.ipMRouteScopeNameAddress = new IpMRouteScopeNameAddressEnt(mib, this);
                            this.ipMRouteScopeNameAddressMask = new IpMRouteScopeNameAddressMaskEnt(mib, this);
                            this.ipMRouteScopeNameLanguage = new IpMRouteScopeNameLanguageEnt(mib, this);
                            this.ipMRouteScopeNameString = new IpMRouteScopeNameStringEnt(mib, this);
                            this.ipMRouteScopeNameDefault = new IpMRouteScopeNameDefaultEnt(mib, this);
                            this.ipMRouteScopeNameStatus = new IpMRouteScopeNameStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ipMRouteScopeNameAddress,
                                this.ipMRouteScopeNameAddressMask,
                                this.ipMRouteScopeNameLanguage,
                                this.ipMRouteScopeNameString,
                                this.ipMRouteScopeNameDefault,
                                this.ipMRouteScopeNameStatus
                            };
                        }
                        public static final class IpMRouteScopeNameAddressEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteScopeNameAddressEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteScopeNameAddress", "1.3.6.1.2.1.83.1.1.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteScopeNameAddressMaskEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteScopeNameAddressMaskEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteScopeNameAddressMask", "1.3.6.1.2.1.83.1.1.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteScopeNameLanguageEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteScopeNameLanguageEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteScopeNameLanguage", "1.3.6.1.2.1.83.1.1.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteScopeNameStringEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteScopeNameStringEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteScopeNameString", "1.3.6.1.2.1.83.1.1.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteScopeNameDefaultEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteScopeNameDefaultEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteScopeNameDefault", "1.3.6.1.2.1.83.1.1.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpMRouteScopeNameStatusEnt extends MIBEntry<IPMROUTESTDMIBDef>
                        {
                            private IpMRouteScopeNameStatusEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                            {
                                super(mib, parent, "ipMRouteScopeNameStatus", "1.3.6.1.2.1.83.1.1.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class IpMRouteMIBConformanceEnt extends MIBEntry<IPMROUTESTDMIBDef>
        {
            public final IpMRouteMIBCompliancesEnt ipMRouteMIBCompliances;

            public final IpMRouteMIBGroupsEnt ipMRouteMIBGroups;

            private IpMRouteMIBConformanceEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
            {
                super(mib, parent, "ipMRouteMIBConformance", "1.3.6.1.2.1.83.2", false, false, false, false);
                this.ipMRouteMIBCompliances = new IpMRouteMIBCompliancesEnt(mib, this);
                this.ipMRouteMIBGroups = new IpMRouteMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipMRouteMIBCompliances,
                    this.ipMRouteMIBGroups
                };
            }
            public static final class IpMRouteMIBCompliancesEnt extends MIBEntry<IPMROUTESTDMIBDef>
            {
                /** compliance statements*/
                public final IpMRouteMIBComplianceEnt ipMRouteMIBCompliance;

                private IpMRouteMIBCompliancesEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                {
                    super(mib, parent, "ipMRouteMIBCompliances", "1.3.6.1.2.1.83.2.1", false, false, false, false);
                    this.ipMRouteMIBCompliance = new IpMRouteMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipMRouteMIBCompliance
                    };
                }
                public static final class IpMRouteMIBComplianceEnt extends MIBEntry<IPMROUTESTDMIBDef>
                {
                    private IpMRouteMIBComplianceEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                    {
                        super(mib, parent, "ipMRouteMIBCompliance", "1.3.6.1.2.1.83.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class IpMRouteMIBGroupsEnt extends MIBEntry<IPMROUTESTDMIBDef>
            {
                /** units of conformance*/
                public final IpMRouteMIBBasicGroupEnt ipMRouteMIBBasicGroup;

                public final IpMRouteMIBHopCountGroupEnt ipMRouteMIBHopCountGroup;

                public final IpMRouteMIBBoundaryGroupEnt ipMRouteMIBBoundaryGroup;

                public final IpMRouteMIBPktsOutGroupEnt ipMRouteMIBPktsOutGroup;

                public final IpMRouteMIBHCInterfaceGroupEnt ipMRouteMIBHCInterfaceGroup;

                public final IpMRouteMIBRouteGroupEnt ipMRouteMIBRouteGroup;

                public final IpMRouteMIBPktsGroupEnt ipMRouteMIBPktsGroup;

                private IpMRouteMIBGroupsEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                {
                    super(mib, parent, "ipMRouteMIBGroups", "1.3.6.1.2.1.83.2.2", false, false, false, false);
                    this.ipMRouteMIBBasicGroup = new IpMRouteMIBBasicGroupEnt(mib, this);
                    this.ipMRouteMIBHopCountGroup = new IpMRouteMIBHopCountGroupEnt(mib, this);
                    this.ipMRouteMIBBoundaryGroup = new IpMRouteMIBBoundaryGroupEnt(mib, this);
                    this.ipMRouteMIBPktsOutGroup = new IpMRouteMIBPktsOutGroupEnt(mib, this);
                    this.ipMRouteMIBHCInterfaceGroup = new IpMRouteMIBHCInterfaceGroupEnt(mib, this);
                    this.ipMRouteMIBRouteGroup = new IpMRouteMIBRouteGroupEnt(mib, this);
                    this.ipMRouteMIBPktsGroup = new IpMRouteMIBPktsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipMRouteMIBBasicGroup,
                        this.ipMRouteMIBHopCountGroup,
                        this.ipMRouteMIBBoundaryGroup,
                        this.ipMRouteMIBPktsOutGroup,
                        this.ipMRouteMIBHCInterfaceGroup,
                        this.ipMRouteMIBRouteGroup,
                        this.ipMRouteMIBPktsGroup
                    };
                }
                public static final class IpMRouteMIBBasicGroupEnt extends MIBEntry<IPMROUTESTDMIBDef>
                {
                    private IpMRouteMIBBasicGroupEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                    {
                        super(mib, parent, "ipMRouteMIBBasicGroup", "1.3.6.1.2.1.83.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMRouteMIBHopCountGroupEnt extends MIBEntry<IPMROUTESTDMIBDef>
                {
                    private IpMRouteMIBHopCountGroupEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                    {
                        super(mib, parent, "ipMRouteMIBHopCountGroup", "1.3.6.1.2.1.83.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMRouteMIBBoundaryGroupEnt extends MIBEntry<IPMROUTESTDMIBDef>
                {
                    private IpMRouteMIBBoundaryGroupEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                    {
                        super(mib, parent, "ipMRouteMIBBoundaryGroup", "1.3.6.1.2.1.83.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMRouteMIBPktsOutGroupEnt extends MIBEntry<IPMROUTESTDMIBDef>
                {
                    private IpMRouteMIBPktsOutGroupEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                    {
                        super(mib, parent, "ipMRouteMIBPktsOutGroup", "1.3.6.1.2.1.83.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMRouteMIBHCInterfaceGroupEnt extends MIBEntry<IPMROUTESTDMIBDef>
                {
                    private IpMRouteMIBHCInterfaceGroupEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                    {
                        super(mib, parent, "ipMRouteMIBHCInterfaceGroup", "1.3.6.1.2.1.83.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMRouteMIBRouteGroupEnt extends MIBEntry<IPMROUTESTDMIBDef>
                {
                    private IpMRouteMIBRouteGroupEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                    {
                        super(mib, parent, "ipMRouteMIBRouteGroup", "1.3.6.1.2.1.83.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMRouteMIBPktsGroupEnt extends MIBEntry<IPMROUTESTDMIBDef>
                {
                    private IpMRouteMIBPktsGroupEnt(IPMROUTESTDMIBDef mib, MIBEntry<IPMROUTESTDMIBDef> parent)
                    {
                        super(mib, parent, "ipMRouteMIBPktsGroup", "1.3.6.1.2.1.83.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
