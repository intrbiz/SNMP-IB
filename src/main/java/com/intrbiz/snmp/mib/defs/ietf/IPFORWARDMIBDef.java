package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class IPFORWARDMIBDef extends MIB
{
    public static final IPFORWARDMIBDef IPFORWARDMIB = new IPFORWARDMIBDef();

    static { MIBs.getInstance().registerMIB(IPFORWARDMIBDef.IPFORWARDMIB); }

    public final IpForwardEnt ipForward;

    private IPFORWARDMIBDef()
    {
        super("IP-FORWARD-MIB");
        this.ipForward = new IpForwardEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ipForward
        };
    }

    public static final class IpForwardEnt extends MIBEntry<IPFORWARDMIBDef>
    {
        public final InetCidrRouteNumberEnt inetCidrRouteNumber;

        public final InetCidrRouteDiscardsEnt inetCidrRouteDiscards;

        /** Inet CIDR Route Table
The Inet CIDR Route Table deprecates and replaces theipCidrRoute Table currently in the IP Forwarding Table MIB.It adds IP protocol independence.*/
        public final InetCidrRouteTableEnt inetCidrRouteTable;

        /** Conformance information*/
        public final IpForwardConformanceEnt ipForwardConformance;

        /** Deprecated Objects*/
        public final IpCidrRouteNumberEnt ipCidrRouteNumber;

        /** IP CIDR Route Table
The IP CIDR Route Table obsoletes and replaces the ipRouteTable current in MIB-I and MIB-II and the IP Forwarding Table.It adds knowledge of the autonomous system of the next hop,multiple next hops, policy routing, and ClasslessInter-Domain Routing.*/
        public final IpCidrRouteTableEnt ipCidrRouteTable;

        /** Obsoleted Definitions - Objects*/
        public final IpForwardNumberEnt ipForwardNumber;

        /** IP Forwarding Table
The IP Forwarding Table obsoletes and replaces the ipRouteTable current in MIB-I and MIB-II.  It adds knowledge ofthe autonomous system of the next hop, multiple next hopsupport, and policy routing support.*/
        public final IpForwardTableEnt ipForwardTable;

        private IpForwardEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
        {
            super(mib, parent, "ipForward", "1.3.6.1.2.1.4.24", false, false, false, false);
            this.inetCidrRouteNumber = new InetCidrRouteNumberEnt(mib, this);
            this.inetCidrRouteDiscards = new InetCidrRouteDiscardsEnt(mib, this);
            this.inetCidrRouteTable = new InetCidrRouteTableEnt(mib, this);
            this.ipForwardConformance = new IpForwardConformanceEnt(mib, this);
            this.ipCidrRouteNumber = new IpCidrRouteNumberEnt(mib, this);
            this.ipCidrRouteTable = new IpCidrRouteTableEnt(mib, this);
            this.ipForwardNumber = new IpForwardNumberEnt(mib, this);
            this.ipForwardTable = new IpForwardTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.inetCidrRouteNumber,
                this.inetCidrRouteDiscards,
                this.inetCidrRouteTable,
                this.ipForwardConformance,
                this.ipCidrRouteNumber,
                this.ipCidrRouteTable,
                this.ipForwardNumber,
                this.ipForwardTable
            };
        }
        public static final class InetCidrRouteNumberEnt extends MIBEntry<IPFORWARDMIBDef>
        {
            private InetCidrRouteNumberEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
            {
                super(mib, parent, "inetCidrRouteNumber", "1.3.6.1.2.1.4.24.6", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class InetCidrRouteDiscardsEnt extends MIBEntry<IPFORWARDMIBDef>
        {
            private InetCidrRouteDiscardsEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
            {
                super(mib, parent, "inetCidrRouteDiscards", "1.3.6.1.2.1.4.24.8", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class InetCidrRouteTableEnt extends MIBEntry<IPFORWARDMIBDef>
        {
            public final InetCidrRouteEntryEnt inetCidrRouteEntry;

            private InetCidrRouteTableEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
            {
                super(mib, parent, "inetCidrRouteTable", "1.3.6.1.2.1.4.24.7", false, true, false, false);
                this.inetCidrRouteEntry = new InetCidrRouteEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.inetCidrRouteEntry
                };
            }
            public static final class InetCidrRouteEntryEnt extends MIBEntry<IPFORWARDMIBDef>
            {
                public final InetCidrRouteDestTypeEnt inetCidrRouteDestType;

                public final InetCidrRouteDestEnt inetCidrRouteDest;

                public final InetCidrRoutePfxLenEnt inetCidrRoutePfxLen;

                public final InetCidrRoutePolicyEnt inetCidrRoutePolicy;

                public final InetCidrRouteNextHopTypeEnt inetCidrRouteNextHopType;

                public final InetCidrRouteNextHopEnt inetCidrRouteNextHop;

                public final InetCidrRouteIfIndexEnt inetCidrRouteIfIndex;

                public final InetCidrRouteTypeEnt inetCidrRouteType;

                public final InetCidrRouteProtoEnt inetCidrRouteProto;

                public final InetCidrRouteAgeEnt inetCidrRouteAge;

                public final InetCidrRouteNextHopASEnt inetCidrRouteNextHopAS;

                public final InetCidrRouteMetric1Ent inetCidrRouteMetric1;

                public final InetCidrRouteMetric2Ent inetCidrRouteMetric2;

                public final InetCidrRouteMetric3Ent inetCidrRouteMetric3;

                public final InetCidrRouteMetric4Ent inetCidrRouteMetric4;

                public final InetCidrRouteMetric5Ent inetCidrRouteMetric5;

                public final InetCidrRouteStatusEnt inetCidrRouteStatus;

                private InetCidrRouteEntryEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                {
                    super(mib, parent, "inetCidrRouteEntry", "1.3.6.1.2.1.4.24.7.1", false, false, false, true);
                    this.inetCidrRouteDestType = new InetCidrRouteDestTypeEnt(mib, this);
                    this.inetCidrRouteDest = new InetCidrRouteDestEnt(mib, this);
                    this.inetCidrRoutePfxLen = new InetCidrRoutePfxLenEnt(mib, this);
                    this.inetCidrRoutePolicy = new InetCidrRoutePolicyEnt(mib, this);
                    this.inetCidrRouteNextHopType = new InetCidrRouteNextHopTypeEnt(mib, this);
                    this.inetCidrRouteNextHop = new InetCidrRouteNextHopEnt(mib, this);
                    this.inetCidrRouteIfIndex = new InetCidrRouteIfIndexEnt(mib, this);
                    this.inetCidrRouteType = new InetCidrRouteTypeEnt(mib, this);
                    this.inetCidrRouteProto = new InetCidrRouteProtoEnt(mib, this);
                    this.inetCidrRouteAge = new InetCidrRouteAgeEnt(mib, this);
                    this.inetCidrRouteNextHopAS = new InetCidrRouteNextHopASEnt(mib, this);
                    this.inetCidrRouteMetric1 = new InetCidrRouteMetric1Ent(mib, this);
                    this.inetCidrRouteMetric2 = new InetCidrRouteMetric2Ent(mib, this);
                    this.inetCidrRouteMetric3 = new InetCidrRouteMetric3Ent(mib, this);
                    this.inetCidrRouteMetric4 = new InetCidrRouteMetric4Ent(mib, this);
                    this.inetCidrRouteMetric5 = new InetCidrRouteMetric5Ent(mib, this);
                    this.inetCidrRouteStatus = new InetCidrRouteStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.inetCidrRouteDestType,
                        this.inetCidrRouteDest,
                        this.inetCidrRoutePfxLen,
                        this.inetCidrRoutePolicy,
                        this.inetCidrRouteNextHopType,
                        this.inetCidrRouteNextHop,
                        this.inetCidrRouteIfIndex,
                        this.inetCidrRouteType,
                        this.inetCidrRouteProto,
                        this.inetCidrRouteAge,
                        this.inetCidrRouteNextHopAS,
                        this.inetCidrRouteMetric1,
                        this.inetCidrRouteMetric2,
                        this.inetCidrRouteMetric3,
                        this.inetCidrRouteMetric4,
                        this.inetCidrRouteMetric5,
                        this.inetCidrRouteStatus
                    };
                }
                public static final class InetCidrRouteDestTypeEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetCidrRouteDestTypeEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetCidrRouteDestType", "1.3.6.1.2.1.4.24.7.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class InetCidrRouteDestEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetCidrRouteDestEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetCidrRouteDest", "1.3.6.1.2.1.4.24.7.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class InetCidrRoutePfxLenEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetCidrRoutePfxLenEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetCidrRoutePfxLen", "1.3.6.1.2.1.4.24.7.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class InetCidrRoutePolicyEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetCidrRoutePolicyEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetCidrRoutePolicy", "1.3.6.1.2.1.4.24.7.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class InetCidrRouteNextHopTypeEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetCidrRouteNextHopTypeEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetCidrRouteNextHopType", "1.3.6.1.2.1.4.24.7.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class InetCidrRouteNextHopEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetCidrRouteNextHopEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetCidrRouteNextHop", "1.3.6.1.2.1.4.24.7.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class InetCidrRouteIfIndexEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetCidrRouteIfIndexEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetCidrRouteIfIndex", "1.3.6.1.2.1.4.24.7.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class InetCidrRouteTypeEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetCidrRouteTypeEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetCidrRouteType", "1.3.6.1.2.1.4.24.7.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class InetCidrRouteProtoEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetCidrRouteProtoEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetCidrRouteProto", "1.3.6.1.2.1.4.24.7.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class InetCidrRouteAgeEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetCidrRouteAgeEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetCidrRouteAge", "1.3.6.1.2.1.4.24.7.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class InetCidrRouteNextHopASEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetCidrRouteNextHopASEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetCidrRouteNextHopAS", "1.3.6.1.2.1.4.24.7.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class InetCidrRouteMetric1Ent extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetCidrRouteMetric1Ent(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetCidrRouteMetric1", "1.3.6.1.2.1.4.24.7.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class InetCidrRouteMetric2Ent extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetCidrRouteMetric2Ent(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetCidrRouteMetric2", "1.3.6.1.2.1.4.24.7.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class InetCidrRouteMetric3Ent extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetCidrRouteMetric3Ent(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetCidrRouteMetric3", "1.3.6.1.2.1.4.24.7.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class InetCidrRouteMetric4Ent extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetCidrRouteMetric4Ent(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetCidrRouteMetric4", "1.3.6.1.2.1.4.24.7.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class InetCidrRouteMetric5Ent extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetCidrRouteMetric5Ent(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetCidrRouteMetric5", "1.3.6.1.2.1.4.24.7.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class InetCidrRouteStatusEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetCidrRouteStatusEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetCidrRouteStatus", "1.3.6.1.2.1.4.24.7.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class IpForwardConformanceEnt extends MIBEntry<IPFORWARDMIBDef>
        {
            public final IpForwardGroupsEnt ipForwardGroups;

            public final IpForwardCompliancesEnt ipForwardCompliances;

            private IpForwardConformanceEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
            {
                super(mib, parent, "ipForwardConformance", "1.3.6.1.2.1.4.24.5", false, false, false, false);
                this.ipForwardGroups = new IpForwardGroupsEnt(mib, this);
                this.ipForwardCompliances = new IpForwardCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipForwardGroups,
                    this.ipForwardCompliances
                };
            }
            public static final class IpForwardGroupsEnt extends MIBEntry<IPFORWARDMIBDef>
            {
                /** units of conformance*/
                public final InetForwardCidrRouteGroupEnt inetForwardCidrRouteGroup;

                /** units of conformance*/
                public final IpForwardCidrRouteGroupEnt ipForwardCidrRouteGroup;

                public final IpForwardMultiPathGroupEnt ipForwardMultiPathGroup;

                private IpForwardGroupsEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                {
                    super(mib, parent, "ipForwardGroups", "1.3.6.1.2.1.4.24.5.1", false, false, false, false);
                    this.inetForwardCidrRouteGroup = new InetForwardCidrRouteGroupEnt(mib, this);
                    this.ipForwardCidrRouteGroup = new IpForwardCidrRouteGroupEnt(mib, this);
                    this.ipForwardMultiPathGroup = new IpForwardMultiPathGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.inetForwardCidrRouteGroup,
                        this.ipForwardCidrRouteGroup,
                        this.ipForwardMultiPathGroup
                    };
                }
                public static final class InetForwardCidrRouteGroupEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private InetForwardCidrRouteGroupEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "inetForwardCidrRouteGroup", "1.3.6.1.2.1.4.24.5.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardCidrRouteGroupEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardCidrRouteGroupEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardCidrRouteGroup", "1.3.6.1.2.1.4.24.5.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardMultiPathGroupEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardMultiPathGroupEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardMultiPathGroup", "1.3.6.1.2.1.4.24.5.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class IpForwardCompliancesEnt extends MIBEntry<IPFORWARDMIBDef>
            {
                /** Compliance statements*/
                public final IpForwardFullComplianceEnt ipForwardFullCompliance;

                public final IpForwardReadOnlyComplianceEnt ipForwardReadOnlyCompliance;

                /** compliance statements*/
                public final IpForwardComplianceEnt ipForwardCompliance;

                /** Obsoleted Definitions - Groupscompliance statements*/
                public final IpForwardOldComplianceEnt ipForwardOldCompliance;

                private IpForwardCompliancesEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                {
                    super(mib, parent, "ipForwardCompliances", "1.3.6.1.2.1.4.24.5.2", false, false, false, false);
                    this.ipForwardFullCompliance = new IpForwardFullComplianceEnt(mib, this);
                    this.ipForwardReadOnlyCompliance = new IpForwardReadOnlyComplianceEnt(mib, this);
                    this.ipForwardCompliance = new IpForwardComplianceEnt(mib, this);
                    this.ipForwardOldCompliance = new IpForwardOldComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipForwardFullCompliance,
                        this.ipForwardReadOnlyCompliance,
                        this.ipForwardCompliance,
                        this.ipForwardOldCompliance
                    };
                }
                public static final class IpForwardFullComplianceEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardFullComplianceEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardFullCompliance", "1.3.6.1.2.1.4.24.5.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardReadOnlyComplianceEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardReadOnlyComplianceEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardReadOnlyCompliance", "1.3.6.1.2.1.4.24.5.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardComplianceEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardComplianceEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardCompliance", "1.3.6.1.2.1.4.24.5.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardOldComplianceEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardOldComplianceEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardOldCompliance", "1.3.6.1.2.1.4.24.5.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class IpCidrRouteNumberEnt extends MIBEntry<IPFORWARDMIBDef>
        {
            private IpCidrRouteNumberEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
            {
                super(mib, parent, "ipCidrRouteNumber", "1.3.6.1.2.1.4.24.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpCidrRouteTableEnt extends MIBEntry<IPFORWARDMIBDef>
        {
            public final IpCidrRouteEntryEnt ipCidrRouteEntry;

            private IpCidrRouteTableEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
            {
                super(mib, parent, "ipCidrRouteTable", "1.3.6.1.2.1.4.24.4", false, true, false, false);
                this.ipCidrRouteEntry = new IpCidrRouteEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipCidrRouteEntry
                };
            }
            public static final class IpCidrRouteEntryEnt extends MIBEntry<IPFORWARDMIBDef>
            {
                public final IpCidrRouteDestEnt ipCidrRouteDest;

                public final IpCidrRouteMaskEnt ipCidrRouteMask;

                /** The following convention is included for specificationof TOS Field contents.  At this time, the Host Requirementsand the Router Requirements documents disagree on the widthof the TOS field.  This mapping describes the RouterRequirements mapping, and leaves room to widen the TOS fieldwithout impact to fielded systems.*/
                public final IpCidrRouteTosEnt ipCidrRouteTos;

                public final IpCidrRouteNextHopEnt ipCidrRouteNextHop;

                public final IpCidrRouteIfIndexEnt ipCidrRouteIfIndex;

                public final IpCidrRouteTypeEnt ipCidrRouteType;

                public final IpCidrRouteProtoEnt ipCidrRouteProto;

                public final IpCidrRouteAgeEnt ipCidrRouteAge;

                public final IpCidrRouteInfoEnt ipCidrRouteInfo;

                public final IpCidrRouteNextHopASEnt ipCidrRouteNextHopAS;

                public final IpCidrRouteMetric1Ent ipCidrRouteMetric1;

                public final IpCidrRouteMetric2Ent ipCidrRouteMetric2;

                public final IpCidrRouteMetric3Ent ipCidrRouteMetric3;

                public final IpCidrRouteMetric4Ent ipCidrRouteMetric4;

                public final IpCidrRouteMetric5Ent ipCidrRouteMetric5;

                public final IpCidrRouteStatusEnt ipCidrRouteStatus;

                private IpCidrRouteEntryEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                {
                    super(mib, parent, "ipCidrRouteEntry", "1.3.6.1.2.1.4.24.4.1", false, false, false, true);
                    this.ipCidrRouteDest = new IpCidrRouteDestEnt(mib, this);
                    this.ipCidrRouteMask = new IpCidrRouteMaskEnt(mib, this);
                    this.ipCidrRouteTos = new IpCidrRouteTosEnt(mib, this);
                    this.ipCidrRouteNextHop = new IpCidrRouteNextHopEnt(mib, this);
                    this.ipCidrRouteIfIndex = new IpCidrRouteIfIndexEnt(mib, this);
                    this.ipCidrRouteType = new IpCidrRouteTypeEnt(mib, this);
                    this.ipCidrRouteProto = new IpCidrRouteProtoEnt(mib, this);
                    this.ipCidrRouteAge = new IpCidrRouteAgeEnt(mib, this);
                    this.ipCidrRouteInfo = new IpCidrRouteInfoEnt(mib, this);
                    this.ipCidrRouteNextHopAS = new IpCidrRouteNextHopASEnt(mib, this);
                    this.ipCidrRouteMetric1 = new IpCidrRouteMetric1Ent(mib, this);
                    this.ipCidrRouteMetric2 = new IpCidrRouteMetric2Ent(mib, this);
                    this.ipCidrRouteMetric3 = new IpCidrRouteMetric3Ent(mib, this);
                    this.ipCidrRouteMetric4 = new IpCidrRouteMetric4Ent(mib, this);
                    this.ipCidrRouteMetric5 = new IpCidrRouteMetric5Ent(mib, this);
                    this.ipCidrRouteStatus = new IpCidrRouteStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipCidrRouteDest,
                        this.ipCidrRouteMask,
                        this.ipCidrRouteTos,
                        this.ipCidrRouteNextHop,
                        this.ipCidrRouteIfIndex,
                        this.ipCidrRouteType,
                        this.ipCidrRouteProto,
                        this.ipCidrRouteAge,
                        this.ipCidrRouteInfo,
                        this.ipCidrRouteNextHopAS,
                        this.ipCidrRouteMetric1,
                        this.ipCidrRouteMetric2,
                        this.ipCidrRouteMetric3,
                        this.ipCidrRouteMetric4,
                        this.ipCidrRouteMetric5,
                        this.ipCidrRouteStatus
                    };
                }
                public static final class IpCidrRouteDestEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpCidrRouteDestEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipCidrRouteDest", "1.3.6.1.2.1.4.24.4.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpCidrRouteMaskEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpCidrRouteMaskEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipCidrRouteMask", "1.3.6.1.2.1.4.24.4.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpCidrRouteTosEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpCidrRouteTosEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipCidrRouteTos", "1.3.6.1.2.1.4.24.4.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpCidrRouteNextHopEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpCidrRouteNextHopEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipCidrRouteNextHop", "1.3.6.1.2.1.4.24.4.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpCidrRouteIfIndexEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpCidrRouteIfIndexEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipCidrRouteIfIndex", "1.3.6.1.2.1.4.24.4.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpCidrRouteTypeEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpCidrRouteTypeEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipCidrRouteType", "1.3.6.1.2.1.4.24.4.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpCidrRouteProtoEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpCidrRouteProtoEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipCidrRouteProto", "1.3.6.1.2.1.4.24.4.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpCidrRouteAgeEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpCidrRouteAgeEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipCidrRouteAge", "1.3.6.1.2.1.4.24.4.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpCidrRouteInfoEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpCidrRouteInfoEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipCidrRouteInfo", "1.3.6.1.2.1.4.24.4.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpCidrRouteNextHopASEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpCidrRouteNextHopASEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipCidrRouteNextHopAS", "1.3.6.1.2.1.4.24.4.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpCidrRouteMetric1Ent extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpCidrRouteMetric1Ent(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipCidrRouteMetric1", "1.3.6.1.2.1.4.24.4.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpCidrRouteMetric2Ent extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpCidrRouteMetric2Ent(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipCidrRouteMetric2", "1.3.6.1.2.1.4.24.4.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpCidrRouteMetric3Ent extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpCidrRouteMetric3Ent(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipCidrRouteMetric3", "1.3.6.1.2.1.4.24.4.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpCidrRouteMetric4Ent extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpCidrRouteMetric4Ent(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipCidrRouteMetric4", "1.3.6.1.2.1.4.24.4.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpCidrRouteMetric5Ent extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpCidrRouteMetric5Ent(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipCidrRouteMetric5", "1.3.6.1.2.1.4.24.4.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpCidrRouteStatusEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpCidrRouteStatusEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipCidrRouteStatus", "1.3.6.1.2.1.4.24.4.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class IpForwardNumberEnt extends MIBEntry<IPFORWARDMIBDef>
        {
            private IpForwardNumberEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
            {
                super(mib, parent, "ipForwardNumber", "1.3.6.1.2.1.4.24.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpForwardTableEnt extends MIBEntry<IPFORWARDMIBDef>
        {
            public final IpForwardEntryEnt ipForwardEntry;

            private IpForwardTableEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
            {
                super(mib, parent, "ipForwardTable", "1.3.6.1.2.1.4.24.2", false, true, false, false);
                this.ipForwardEntry = new IpForwardEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipForwardEntry
                };
            }
            public static final class IpForwardEntryEnt extends MIBEntry<IPFORWARDMIBDef>
            {
                public final IpForwardDestEnt ipForwardDest;

                /** 0.0.0.0*/
                public final IpForwardMaskEnt ipForwardMask;

                /** The following convention is included for specificationof TOS Field contents.  At this time, the Host Requirementsand the Router Requirements documents disagree on the widthof the TOS field.  This mapping describes the Router


Requirements mapping, and leaves room to widen the TOS fieldwithout impact to fielded systems.*/
                public final IpForwardPolicyEnt ipForwardPolicy;

                public final IpForwardNextHopEnt ipForwardNextHop;

                public final IpForwardIfIndexEnt ipForwardIfIndex;

                public final IpForwardTypeEnt ipForwardType;

                public final IpForwardProtoEnt ipForwardProto;

                public final IpForwardAgeEnt ipForwardAge;

                public final IpForwardInfoEnt ipForwardInfo;

                public final IpForwardNextHopASEnt ipForwardNextHopAS;

                public final IpForwardMetric1Ent ipForwardMetric1;

                public final IpForwardMetric2Ent ipForwardMetric2;

                public final IpForwardMetric3Ent ipForwardMetric3;

                public final IpForwardMetric4Ent ipForwardMetric4;

                public final IpForwardMetric5Ent ipForwardMetric5;

                private IpForwardEntryEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                {
                    super(mib, parent, "ipForwardEntry", "1.3.6.1.2.1.4.24.2.1", false, false, false, true);
                    this.ipForwardDest = new IpForwardDestEnt(mib, this);
                    this.ipForwardMask = new IpForwardMaskEnt(mib, this);
                    this.ipForwardPolicy = new IpForwardPolicyEnt(mib, this);
                    this.ipForwardNextHop = new IpForwardNextHopEnt(mib, this);
                    this.ipForwardIfIndex = new IpForwardIfIndexEnt(mib, this);
                    this.ipForwardType = new IpForwardTypeEnt(mib, this);
                    this.ipForwardProto = new IpForwardProtoEnt(mib, this);
                    this.ipForwardAge = new IpForwardAgeEnt(mib, this);
                    this.ipForwardInfo = new IpForwardInfoEnt(mib, this);
                    this.ipForwardNextHopAS = new IpForwardNextHopASEnt(mib, this);
                    this.ipForwardMetric1 = new IpForwardMetric1Ent(mib, this);
                    this.ipForwardMetric2 = new IpForwardMetric2Ent(mib, this);
                    this.ipForwardMetric3 = new IpForwardMetric3Ent(mib, this);
                    this.ipForwardMetric4 = new IpForwardMetric4Ent(mib, this);
                    this.ipForwardMetric5 = new IpForwardMetric5Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipForwardDest,
                        this.ipForwardMask,
                        this.ipForwardPolicy,
                        this.ipForwardNextHop,
                        this.ipForwardIfIndex,
                        this.ipForwardType,
                        this.ipForwardProto,
                        this.ipForwardAge,
                        this.ipForwardInfo,
                        this.ipForwardNextHopAS,
                        this.ipForwardMetric1,
                        this.ipForwardMetric2,
                        this.ipForwardMetric3,
                        this.ipForwardMetric4,
                        this.ipForwardMetric5
                    };
                }
                public static final class IpForwardDestEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardDestEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardDest", "1.3.6.1.2.1.4.24.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardMaskEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardMaskEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardMask", "1.3.6.1.2.1.4.24.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardPolicyEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardPolicyEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardPolicy", "1.3.6.1.2.1.4.24.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardNextHopEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardNextHopEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardNextHop", "1.3.6.1.2.1.4.24.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardIfIndexEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardIfIndexEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardIfIndex", "1.3.6.1.2.1.4.24.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardTypeEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardTypeEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardType", "1.3.6.1.2.1.4.24.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardProtoEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardProtoEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardProto", "1.3.6.1.2.1.4.24.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardAgeEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardAgeEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardAge", "1.3.6.1.2.1.4.24.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardInfoEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardInfoEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardInfo", "1.3.6.1.2.1.4.24.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardNextHopASEnt extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardNextHopASEnt(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardNextHopAS", "1.3.6.1.2.1.4.24.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardMetric1Ent extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardMetric1Ent(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardMetric1", "1.3.6.1.2.1.4.24.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardMetric2Ent extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardMetric2Ent(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardMetric2", "1.3.6.1.2.1.4.24.2.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardMetric3Ent extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardMetric3Ent(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardMetric3", "1.3.6.1.2.1.4.24.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardMetric4Ent extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardMetric4Ent(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardMetric4", "1.3.6.1.2.1.4.24.2.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpForwardMetric5Ent extends MIBEntry<IPFORWARDMIBDef>
                {
                    private IpForwardMetric5Ent(IPFORWARDMIBDef mib, MIBEntry<IPFORWARDMIBDef> parent)
                    {
                        super(mib, parent, "ipForwardMetric5", "1.3.6.1.2.1.4.24.2.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
