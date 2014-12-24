package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class CLNSMIBDef extends MIB
{
    public static final CLNSMIBDef CLNSMIB = new CLNSMIBDef();

    /** This MIB module uses the extended OBJECT-TYPE macro asdefined in [9]

the CLNS MIB module*/
    public final ClnsEnt clns;

    private CLNSMIBDef()
    {
        super("CLNS-MIB");
        this.clns = new ClnsEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.clns
        };
    }

    public static final class ClnsEnt extends MIBEntry<CLNSMIBDef>
    {
        /** This data type is used to model NSAP addresses.

groups in the CLNS MIB*/
        public final ClnpEnt clnp;

        public final ErrorEnt error;

        public final EchoEnt echo;

        public final EsisEnt esis;

        private ClnsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
        {
            super(mib, parent, "clns", "1.3.6.1.3.1", false, false, false, false);
            this.clnp = new ClnpEnt(mib, this);
            this.error = new ErrorEnt(mib, this);
            this.echo = new EchoEnt(mib, this);
            this.esis = new EsisEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.clnp,
                this.error,
                this.echo,
                this.esis
            };
        }
        public static final class ClnpEnt extends MIBEntry<CLNSMIBDef>
        {
            /** the CLNP group
Implementation of this group is recommended for allsystems which implement the CLNP.*/
            public final ClnpForwardingEnt clnpForwarding;

            public final ClnpDefaultLifeTimeEnt clnpDefaultLifeTime;

            public final ClnpInReceivesEnt clnpInReceives;

            public final ClnpInHdrErrorsEnt clnpInHdrErrors;

            public final ClnpInAddrErrorsEnt clnpInAddrErrors;

            public final ClnpForwPDUsEnt clnpForwPDUs;

            public final ClnpInUnknownNLPsEnt clnpInUnknownNLPs;

            public final ClnpInUnknownULPsEnt clnpInUnknownULPs;

            public final ClnpInDiscardsEnt clnpInDiscards;

            public final ClnpInDeliversEnt clnpInDelivers;

            public final ClnpOutRequestsEnt clnpOutRequests;

            public final ClnpOutDiscardsEnt clnpOutDiscards;

            public final ClnpOutNoRoutesEnt clnpOutNoRoutes;

            public final ClnpReasmTimeoutEnt clnpReasmTimeout;

            public final ClnpReasmReqdsEnt clnpReasmReqds;

            public final ClnpReasmOKsEnt clnpReasmOKs;

            public final ClnpReasmFailsEnt clnpReasmFails;

            public final ClnpSegOKsEnt clnpSegOKs;

            public final ClnpSegFailsEnt clnpSegFails;

            public final ClnpSegCreatesEnt clnpSegCreates;

            public final ClnpInOptsEnt clnpInOpts;

            public final ClnpOutOptsEnt clnpOutOpts;

            public final ClnpRoutingDiscardsEnt clnpRoutingDiscards;

            /** the CLNP Interfaces table
The CLNP interfaces table contains information on theentity's interfaces which are running the CLNP.*/
            public final ClnpAddrTableEnt clnpAddrTable;

            /** The CLNP Routing table
The CLNP routing table contains an entry for each routeknown to the entity.*/
            public final ClnpRoutingTableEnt clnpRoutingTable;

            /** the CLNP Address Translation table
The Address Translation tables contain the CLNP addressto physical address equivalences.  Some interfaces do notuse translation tables for determining addressequivalences; if all interfaces are of this type, then theAddress Translation table is empty, i.e., has zeroentries.*/
            public final ClnpNetToMediaTableEnt clnpNetToMediaTable;

            public final ClnpMediaToNetTableEnt clnpMediaToNetTable;

            private ClnpEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
            {
                super(mib, parent, "clnp", "1.3.6.1.3.1.1", false, false, false, false);
                this.clnpForwarding = new ClnpForwardingEnt(mib, this);
                this.clnpDefaultLifeTime = new ClnpDefaultLifeTimeEnt(mib, this);
                this.clnpInReceives = new ClnpInReceivesEnt(mib, this);
                this.clnpInHdrErrors = new ClnpInHdrErrorsEnt(mib, this);
                this.clnpInAddrErrors = new ClnpInAddrErrorsEnt(mib, this);
                this.clnpForwPDUs = new ClnpForwPDUsEnt(mib, this);
                this.clnpInUnknownNLPs = new ClnpInUnknownNLPsEnt(mib, this);
                this.clnpInUnknownULPs = new ClnpInUnknownULPsEnt(mib, this);
                this.clnpInDiscards = new ClnpInDiscardsEnt(mib, this);
                this.clnpInDelivers = new ClnpInDeliversEnt(mib, this);
                this.clnpOutRequests = new ClnpOutRequestsEnt(mib, this);
                this.clnpOutDiscards = new ClnpOutDiscardsEnt(mib, this);
                this.clnpOutNoRoutes = new ClnpOutNoRoutesEnt(mib, this);
                this.clnpReasmTimeout = new ClnpReasmTimeoutEnt(mib, this);
                this.clnpReasmReqds = new ClnpReasmReqdsEnt(mib, this);
                this.clnpReasmOKs = new ClnpReasmOKsEnt(mib, this);
                this.clnpReasmFails = new ClnpReasmFailsEnt(mib, this);
                this.clnpSegOKs = new ClnpSegOKsEnt(mib, this);
                this.clnpSegFails = new ClnpSegFailsEnt(mib, this);
                this.clnpSegCreates = new ClnpSegCreatesEnt(mib, this);
                this.clnpInOpts = new ClnpInOptsEnt(mib, this);
                this.clnpOutOpts = new ClnpOutOptsEnt(mib, this);
                this.clnpRoutingDiscards = new ClnpRoutingDiscardsEnt(mib, this);
                this.clnpAddrTable = new ClnpAddrTableEnt(mib, this);
                this.clnpRoutingTable = new ClnpRoutingTableEnt(mib, this);
                this.clnpNetToMediaTable = new ClnpNetToMediaTableEnt(mib, this);
                this.clnpMediaToNetTable = new ClnpMediaToNetTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.clnpForwarding,
                    this.clnpDefaultLifeTime,
                    this.clnpInReceives,
                    this.clnpInHdrErrors,
                    this.clnpInAddrErrors,
                    this.clnpForwPDUs,
                    this.clnpInUnknownNLPs,
                    this.clnpInUnknownULPs,
                    this.clnpInDiscards,
                    this.clnpInDelivers,
                    this.clnpOutRequests,
                    this.clnpOutDiscards,
                    this.clnpOutNoRoutes,
                    this.clnpReasmTimeout,
                    this.clnpReasmReqds,
                    this.clnpReasmOKs,
                    this.clnpReasmFails,
                    this.clnpSegOKs,
                    this.clnpSegFails,
                    this.clnpSegCreates,
                    this.clnpInOpts,
                    this.clnpOutOpts,
                    this.clnpRoutingDiscards,
                    this.clnpAddrTable,
                    this.clnpRoutingTable,
                    this.clnpNetToMediaTable,
                    this.clnpMediaToNetTable
                };
            }
            public static final class ClnpForwardingEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpForwardingEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpForwarding", "1.3.6.1.3.1.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpDefaultLifeTimeEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpDefaultLifeTimeEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpDefaultLifeTime", "1.3.6.1.3.1.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInReceivesEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInReceivesEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInReceives", "1.3.6.1.3.1.1.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInHdrErrorsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInHdrErrorsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInHdrErrors", "1.3.6.1.3.1.1.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInAddrErrorsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInAddrErrorsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInAddrErrors", "1.3.6.1.3.1.1.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpForwPDUsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpForwPDUsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpForwPDUs", "1.3.6.1.3.1.1.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInUnknownNLPsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInUnknownNLPsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInUnknownNLPs", "1.3.6.1.3.1.1.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInUnknownULPsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInUnknownULPsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInUnknownULPs", "1.3.6.1.3.1.1.8", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInDiscardsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInDiscardsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInDiscards", "1.3.6.1.3.1.1.9", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInDeliversEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInDeliversEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInDelivers", "1.3.6.1.3.1.1.10", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutRequestsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutRequestsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutRequests", "1.3.6.1.3.1.1.11", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutDiscardsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutDiscardsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutDiscards", "1.3.6.1.3.1.1.12", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutNoRoutesEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutNoRoutesEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutNoRoutes", "1.3.6.1.3.1.1.13", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpReasmTimeoutEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpReasmTimeoutEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpReasmTimeout", "1.3.6.1.3.1.1.14", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpReasmReqdsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpReasmReqdsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpReasmReqds", "1.3.6.1.3.1.1.15", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpReasmOKsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpReasmOKsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpReasmOKs", "1.3.6.1.3.1.1.16", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpReasmFailsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpReasmFailsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpReasmFails", "1.3.6.1.3.1.1.17", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpSegOKsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpSegOKsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpSegOKs", "1.3.6.1.3.1.1.18", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpSegFailsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpSegFailsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpSegFails", "1.3.6.1.3.1.1.19", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpSegCreatesEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpSegCreatesEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpSegCreates", "1.3.6.1.3.1.1.20", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInOptsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInOptsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInOpts", "1.3.6.1.3.1.1.25", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutOptsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutOptsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutOpts", "1.3.6.1.3.1.1.26", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpRoutingDiscardsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpRoutingDiscardsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpRoutingDiscards", "1.3.6.1.3.1.1.27", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpAddrTableEnt extends MIBEntry<CLNSMIBDef>
            {
                public final ClnpAddrEntryEnt clnpAddrEntry;

                private ClnpAddrTableEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpAddrTable", "1.3.6.1.3.1.1.21", false, true, false, false);
                    this.clnpAddrEntry = new ClnpAddrEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.clnpAddrEntry
                    };
                }
                public static final class ClnpAddrEntryEnt extends MIBEntry<CLNSMIBDef>
                {
                    public final ClnpAdEntAddrEnt clnpAdEntAddr;

                    public final ClnpAdEntIfIndexEnt clnpAdEntIfIndex;

                    public final ClnpAdEntReasmMaxSizeEnt clnpAdEntReasmMaxSize;

                    private ClnpAddrEntryEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                    {
                        super(mib, parent, "clnpAddrEntry", "1.3.6.1.3.1.1.21.1", false, false, false, true);
                        this.clnpAdEntAddr = new ClnpAdEntAddrEnt(mib, this);
                        this.clnpAdEntIfIndex = new ClnpAdEntIfIndexEnt(mib, this);
                        this.clnpAdEntReasmMaxSize = new ClnpAdEntReasmMaxSizeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.clnpAdEntAddr,
                            this.clnpAdEntIfIndex,
                            this.clnpAdEntReasmMaxSize
                        };
                    }
                    public static final class ClnpAdEntAddrEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpAdEntAddrEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpAdEntAddr", "1.3.6.1.3.1.1.21.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpAdEntIfIndexEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpAdEntIfIndexEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpAdEntIfIndex", "1.3.6.1.3.1.1.21.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpAdEntReasmMaxSizeEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpAdEntReasmMaxSizeEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpAdEntReasmMaxSize", "1.3.6.1.3.1.1.21.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ClnpRoutingTableEnt extends MIBEntry<CLNSMIBDef>
            {
                public final ClnpRouteEntryEnt clnpRouteEntry;

                private ClnpRoutingTableEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpRoutingTable", "1.3.6.1.3.1.1.22", false, true, false, false);
                    this.clnpRouteEntry = new ClnpRouteEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.clnpRouteEntry
                    };
                }
                public static final class ClnpRouteEntryEnt extends MIBEntry<CLNSMIBDef>
                {
                    public final ClnpRouteDestEnt clnpRouteDest;

                    public final ClnpRouteIfIndexEnt clnpRouteIfIndex;

                    public final ClnpRouteMetric1Ent clnpRouteMetric1;

                    public final ClnpRouteMetric2Ent clnpRouteMetric2;

                    public final ClnpRouteMetric3Ent clnpRouteMetric3;

                    public final ClnpRouteMetric4Ent clnpRouteMetric4;

                    public final ClnpRouteNextHopEnt clnpRouteNextHop;

                    public final ClnpRouteTypeEnt clnpRouteType;

                    public final ClnpRouteProtoEnt clnpRouteProto;

                    public final ClnpRouteAgeEnt clnpRouteAge;

                    public final ClnpRouteMetric5Ent clnpRouteMetric5;

                    public final ClnpRouteInfoEnt clnpRouteInfo;

                    private ClnpRouteEntryEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                    {
                        super(mib, parent, "clnpRouteEntry", "1.3.6.1.3.1.1.22.1", false, false, false, true);
                        this.clnpRouteDest = new ClnpRouteDestEnt(mib, this);
                        this.clnpRouteIfIndex = new ClnpRouteIfIndexEnt(mib, this);
                        this.clnpRouteMetric1 = new ClnpRouteMetric1Ent(mib, this);
                        this.clnpRouteMetric2 = new ClnpRouteMetric2Ent(mib, this);
                        this.clnpRouteMetric3 = new ClnpRouteMetric3Ent(mib, this);
                        this.clnpRouteMetric4 = new ClnpRouteMetric4Ent(mib, this);
                        this.clnpRouteNextHop = new ClnpRouteNextHopEnt(mib, this);
                        this.clnpRouteType = new ClnpRouteTypeEnt(mib, this);
                        this.clnpRouteProto = new ClnpRouteProtoEnt(mib, this);
                        this.clnpRouteAge = new ClnpRouteAgeEnt(mib, this);
                        this.clnpRouteMetric5 = new ClnpRouteMetric5Ent(mib, this);
                        this.clnpRouteInfo = new ClnpRouteInfoEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.clnpRouteDest,
                            this.clnpRouteIfIndex,
                            this.clnpRouteMetric1,
                            this.clnpRouteMetric2,
                            this.clnpRouteMetric3,
                            this.clnpRouteMetric4,
                            this.clnpRouteNextHop,
                            this.clnpRouteType,
                            this.clnpRouteProto,
                            this.clnpRouteAge,
                            this.clnpRouteMetric5,
                            this.clnpRouteInfo
                        };
                    }
                    public static final class ClnpRouteDestEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpRouteDestEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpRouteDest", "1.3.6.1.3.1.1.22.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpRouteIfIndexEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpRouteIfIndexEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpRouteIfIndex", "1.3.6.1.3.1.1.22.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpRouteMetric1Ent extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpRouteMetric1Ent(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpRouteMetric1", "1.3.6.1.3.1.1.22.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpRouteMetric2Ent extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpRouteMetric2Ent(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpRouteMetric2", "1.3.6.1.3.1.1.22.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpRouteMetric3Ent extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpRouteMetric3Ent(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpRouteMetric3", "1.3.6.1.3.1.1.22.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpRouteMetric4Ent extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpRouteMetric4Ent(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpRouteMetric4", "1.3.6.1.3.1.1.22.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpRouteNextHopEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpRouteNextHopEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpRouteNextHop", "1.3.6.1.3.1.1.22.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpRouteTypeEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpRouteTypeEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpRouteType", "1.3.6.1.3.1.1.22.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpRouteProtoEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpRouteProtoEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpRouteProto", "1.3.6.1.3.1.1.22.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpRouteAgeEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpRouteAgeEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpRouteAge", "1.3.6.1.3.1.1.22.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpRouteMetric5Ent extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpRouteMetric5Ent(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpRouteMetric5", "1.3.6.1.3.1.1.22.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpRouteInfoEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpRouteInfoEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpRouteInfo", "1.3.6.1.3.1.1.22.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ClnpNetToMediaTableEnt extends MIBEntry<CLNSMIBDef>
            {
                public final ClnpNetToMediaEntryEnt clnpNetToMediaEntry;

                private ClnpNetToMediaTableEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpNetToMediaTable", "1.3.6.1.3.1.1.23", false, true, false, false);
                    this.clnpNetToMediaEntry = new ClnpNetToMediaEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.clnpNetToMediaEntry
                    };
                }
                public static final class ClnpNetToMediaEntryEnt extends MIBEntry<CLNSMIBDef>
                {
                    public final ClnpNetToMediaIfIndexEnt clnpNetToMediaIfIndex;

                    public final ClnpNetToMediaPhysAddressEnt clnpNetToMediaPhysAddress;

                    public final ClnpNetToMediaNetAddressEnt clnpNetToMediaNetAddress;

                    public final ClnpNetToMediaTypeEnt clnpNetToMediaType;

                    public final ClnpNetToMediaAgeEnt clnpNetToMediaAge;

                    public final ClnpNetToMediaHoldTimeEnt clnpNetToMediaHoldTime;

                    private ClnpNetToMediaEntryEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                    {
                        super(mib, parent, "clnpNetToMediaEntry", "1.3.6.1.3.1.1.23.1", false, false, false, true);
                        this.clnpNetToMediaIfIndex = new ClnpNetToMediaIfIndexEnt(mib, this);
                        this.clnpNetToMediaPhysAddress = new ClnpNetToMediaPhysAddressEnt(mib, this);
                        this.clnpNetToMediaNetAddress = new ClnpNetToMediaNetAddressEnt(mib, this);
                        this.clnpNetToMediaType = new ClnpNetToMediaTypeEnt(mib, this);
                        this.clnpNetToMediaAge = new ClnpNetToMediaAgeEnt(mib, this);
                        this.clnpNetToMediaHoldTime = new ClnpNetToMediaHoldTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.clnpNetToMediaIfIndex,
                            this.clnpNetToMediaPhysAddress,
                            this.clnpNetToMediaNetAddress,
                            this.clnpNetToMediaType,
                            this.clnpNetToMediaAge,
                            this.clnpNetToMediaHoldTime
                        };
                    }
                    public static final class ClnpNetToMediaIfIndexEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpNetToMediaIfIndexEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpNetToMediaIfIndex", "1.3.6.1.3.1.1.23.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpNetToMediaPhysAddressEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpNetToMediaPhysAddressEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpNetToMediaPhysAddress", "1.3.6.1.3.1.1.23.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpNetToMediaNetAddressEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpNetToMediaNetAddressEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpNetToMediaNetAddress", "1.3.6.1.3.1.1.23.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpNetToMediaTypeEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpNetToMediaTypeEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpNetToMediaType", "1.3.6.1.3.1.1.23.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpNetToMediaAgeEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpNetToMediaAgeEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpNetToMediaAge", "1.3.6.1.3.1.1.23.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpNetToMediaHoldTimeEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpNetToMediaHoldTimeEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpNetToMediaHoldTime", "1.3.6.1.3.1.1.23.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ClnpMediaToNetTableEnt extends MIBEntry<CLNSMIBDef>
            {
                public final ClnpMediaToNetEntryEnt clnpMediaToNetEntry;

                private ClnpMediaToNetTableEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpMediaToNetTable", "1.3.6.1.3.1.1.24", false, true, false, false);
                    this.clnpMediaToNetEntry = new ClnpMediaToNetEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.clnpMediaToNetEntry
                    };
                }
                public static final class ClnpMediaToNetEntryEnt extends MIBEntry<CLNSMIBDef>
                {
                    public final ClnpMediaToNetIfIndexEnt clnpMediaToNetIfIndex;

                    public final ClnpMediaToNetAddressEnt clnpMediaToNetAddress;

                    public final ClnpMediaToNetPhysAddressEnt clnpMediaToNetPhysAddress;

                    public final ClnpMediaToNetTypeEnt clnpMediaToNetType;

                    public final ClnpMediaToNetAgeEnt clnpMediaToNetAge;

                    public final ClnpMediaToNetHoldTimeEnt clnpMediaToNetHoldTime;

                    private ClnpMediaToNetEntryEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                    {
                        super(mib, parent, "clnpMediaToNetEntry", "1.3.6.1.3.1.1.24.1", false, false, false, true);
                        this.clnpMediaToNetIfIndex = new ClnpMediaToNetIfIndexEnt(mib, this);
                        this.clnpMediaToNetAddress = new ClnpMediaToNetAddressEnt(mib, this);
                        this.clnpMediaToNetPhysAddress = new ClnpMediaToNetPhysAddressEnt(mib, this);
                        this.clnpMediaToNetType = new ClnpMediaToNetTypeEnt(mib, this);
                        this.clnpMediaToNetAge = new ClnpMediaToNetAgeEnt(mib, this);
                        this.clnpMediaToNetHoldTime = new ClnpMediaToNetHoldTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.clnpMediaToNetIfIndex,
                            this.clnpMediaToNetAddress,
                            this.clnpMediaToNetPhysAddress,
                            this.clnpMediaToNetType,
                            this.clnpMediaToNetAge,
                            this.clnpMediaToNetHoldTime
                        };
                    }
                    public static final class ClnpMediaToNetIfIndexEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpMediaToNetIfIndexEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpMediaToNetIfIndex", "1.3.6.1.3.1.1.24.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpMediaToNetAddressEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpMediaToNetAddressEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpMediaToNetAddress", "1.3.6.1.3.1.1.24.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpMediaToNetPhysAddressEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpMediaToNetPhysAddressEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpMediaToNetPhysAddress", "1.3.6.1.3.1.1.24.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpMediaToNetTypeEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpMediaToNetTypeEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpMediaToNetType", "1.3.6.1.3.1.1.24.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpMediaToNetAgeEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpMediaToNetAgeEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpMediaToNetAge", "1.3.6.1.3.1.1.24.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ClnpMediaToNetHoldTimeEnt extends MIBEntry<CLNSMIBDef>
                    {
                        private ClnpMediaToNetHoldTimeEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                        {
                            super(mib, parent, "clnpMediaToNetHoldTime", "1.3.6.1.3.1.1.24.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class ErrorEnt extends MIBEntry<CLNSMIBDef>
        {
            /** the CLNP Error group
Implementation of this group is recommended for allsystems which implement the CLNP Error protocol.*/
            public final ClnpInErrorsEnt clnpInErrors;

            public final ClnpOutErrorsEnt clnpOutErrors;

            public final ClnpInErrUnspecsEnt clnpInErrUnspecs;

            public final ClnpInErrProcsEnt clnpInErrProcs;

            public final ClnpInErrCksumsEnt clnpInErrCksums;

            public final ClnpInErrCongestsEnt clnpInErrCongests;

            public final ClnpInErrHdrsEnt clnpInErrHdrs;

            public final ClnpInErrSegsEnt clnpInErrSegs;

            public final ClnpInErrIncompsEnt clnpInErrIncomps;

            public final ClnpInErrDupsEnt clnpInErrDups;

            public final ClnpInErrUnreachDstsEnt clnpInErrUnreachDsts;

            public final ClnpInErrUnknownDstsEnt clnpInErrUnknownDsts;

            public final ClnpInErrSRUnspecsEnt clnpInErrSRUnspecs;

            public final ClnpInErrSRSyntaxesEnt clnpInErrSRSyntaxes;

            public final ClnpInErrSRUnkAddrsEnt clnpInErrSRUnkAddrs;

            public final ClnpInErrSRBadPathsEnt clnpInErrSRBadPaths;

            public final ClnpInErrHopsEnt clnpInErrHops;

            public final ClnpInErrHopReassmsEnt clnpInErrHopReassms;

            public final ClnpInErrUnsOptionsEnt clnpInErrUnsOptions;

            public final ClnpInErrUnsVersionsEnt clnpInErrUnsVersions;

            public final ClnpInErrUnsSecuritiesEnt clnpInErrUnsSecurities;

            public final ClnpInErrUnsSRsEnt clnpInErrUnsSRs;

            public final ClnpInErrUnsRRsEnt clnpInErrUnsRRs;

            public final ClnpInErrInterferencesEnt clnpInErrInterferences;

            public final ClnpOutErrUnspecsEnt clnpOutErrUnspecs;

            public final ClnpOutErrProcsEnt clnpOutErrProcs;

            public final ClnpOutErrCksumsEnt clnpOutErrCksums;

            public final ClnpOutErrCongestsEnt clnpOutErrCongests;

            public final ClnpOutErrHdrsEnt clnpOutErrHdrs;

            public final ClnpOutErrSegsEnt clnpOutErrSegs;

            public final ClnpOutErrIncompsEnt clnpOutErrIncomps;

            public final ClnpOutErrDupsEnt clnpOutErrDups;

            public final ClnpOutErrUnreachDstsEnt clnpOutErrUnreachDsts;

            public final ClnpOutErrUnknownDstsEnt clnpOutErrUnknownDsts;

            public final ClnpOutErrSRUnspecsEnt clnpOutErrSRUnspecs;

            public final ClnpOutErrSRSyntaxesEnt clnpOutErrSRSyntaxes;

            public final ClnpOutErrSRUnkAddrsEnt clnpOutErrSRUnkAddrs;

            public final ClnpOutErrSRBadPathsEnt clnpOutErrSRBadPaths;

            public final ClnpOutErrHopsEnt clnpOutErrHops;

            public final ClnpOutErrHopReassmsEnt clnpOutErrHopReassms;

            public final ClnpOutErrUnsOptionsEnt clnpOutErrUnsOptions;

            public final ClnpOutErrUnsVersionsEnt clnpOutErrUnsVersions;

            public final ClnpOutErrUnsSecuritiesEnt clnpOutErrUnsSecurities;

            public final ClnpOutErrUnsSRsEnt clnpOutErrUnsSRs;

            public final ClnpOutErrUnsRRsEnt clnpOutErrUnsRRs;

            public final ClnpOutErrInterferencesEnt clnpOutErrInterferences;

            private ErrorEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
            {
                super(mib, parent, "error", "1.3.6.1.3.1.2", false, false, false, false);
                this.clnpInErrors = new ClnpInErrorsEnt(mib, this);
                this.clnpOutErrors = new ClnpOutErrorsEnt(mib, this);
                this.clnpInErrUnspecs = new ClnpInErrUnspecsEnt(mib, this);
                this.clnpInErrProcs = new ClnpInErrProcsEnt(mib, this);
                this.clnpInErrCksums = new ClnpInErrCksumsEnt(mib, this);
                this.clnpInErrCongests = new ClnpInErrCongestsEnt(mib, this);
                this.clnpInErrHdrs = new ClnpInErrHdrsEnt(mib, this);
                this.clnpInErrSegs = new ClnpInErrSegsEnt(mib, this);
                this.clnpInErrIncomps = new ClnpInErrIncompsEnt(mib, this);
                this.clnpInErrDups = new ClnpInErrDupsEnt(mib, this);
                this.clnpInErrUnreachDsts = new ClnpInErrUnreachDstsEnt(mib, this);
                this.clnpInErrUnknownDsts = new ClnpInErrUnknownDstsEnt(mib, this);
                this.clnpInErrSRUnspecs = new ClnpInErrSRUnspecsEnt(mib, this);
                this.clnpInErrSRSyntaxes = new ClnpInErrSRSyntaxesEnt(mib, this);
                this.clnpInErrSRUnkAddrs = new ClnpInErrSRUnkAddrsEnt(mib, this);
                this.clnpInErrSRBadPaths = new ClnpInErrSRBadPathsEnt(mib, this);
                this.clnpInErrHops = new ClnpInErrHopsEnt(mib, this);
                this.clnpInErrHopReassms = new ClnpInErrHopReassmsEnt(mib, this);
                this.clnpInErrUnsOptions = new ClnpInErrUnsOptionsEnt(mib, this);
                this.clnpInErrUnsVersions = new ClnpInErrUnsVersionsEnt(mib, this);
                this.clnpInErrUnsSecurities = new ClnpInErrUnsSecuritiesEnt(mib, this);
                this.clnpInErrUnsSRs = new ClnpInErrUnsSRsEnt(mib, this);
                this.clnpInErrUnsRRs = new ClnpInErrUnsRRsEnt(mib, this);
                this.clnpInErrInterferences = new ClnpInErrInterferencesEnt(mib, this);
                this.clnpOutErrUnspecs = new ClnpOutErrUnspecsEnt(mib, this);
                this.clnpOutErrProcs = new ClnpOutErrProcsEnt(mib, this);
                this.clnpOutErrCksums = new ClnpOutErrCksumsEnt(mib, this);
                this.clnpOutErrCongests = new ClnpOutErrCongestsEnt(mib, this);
                this.clnpOutErrHdrs = new ClnpOutErrHdrsEnt(mib, this);
                this.clnpOutErrSegs = new ClnpOutErrSegsEnt(mib, this);
                this.clnpOutErrIncomps = new ClnpOutErrIncompsEnt(mib, this);
                this.clnpOutErrDups = new ClnpOutErrDupsEnt(mib, this);
                this.clnpOutErrUnreachDsts = new ClnpOutErrUnreachDstsEnt(mib, this);
                this.clnpOutErrUnknownDsts = new ClnpOutErrUnknownDstsEnt(mib, this);
                this.clnpOutErrSRUnspecs = new ClnpOutErrSRUnspecsEnt(mib, this);
                this.clnpOutErrSRSyntaxes = new ClnpOutErrSRSyntaxesEnt(mib, this);
                this.clnpOutErrSRUnkAddrs = new ClnpOutErrSRUnkAddrsEnt(mib, this);
                this.clnpOutErrSRBadPaths = new ClnpOutErrSRBadPathsEnt(mib, this);
                this.clnpOutErrHops = new ClnpOutErrHopsEnt(mib, this);
                this.clnpOutErrHopReassms = new ClnpOutErrHopReassmsEnt(mib, this);
                this.clnpOutErrUnsOptions = new ClnpOutErrUnsOptionsEnt(mib, this);
                this.clnpOutErrUnsVersions = new ClnpOutErrUnsVersionsEnt(mib, this);
                this.clnpOutErrUnsSecurities = new ClnpOutErrUnsSecuritiesEnt(mib, this);
                this.clnpOutErrUnsSRs = new ClnpOutErrUnsSRsEnt(mib, this);
                this.clnpOutErrUnsRRs = new ClnpOutErrUnsRRsEnt(mib, this);
                this.clnpOutErrInterferences = new ClnpOutErrInterferencesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.clnpInErrors,
                    this.clnpOutErrors,
                    this.clnpInErrUnspecs,
                    this.clnpInErrProcs,
                    this.clnpInErrCksums,
                    this.clnpInErrCongests,
                    this.clnpInErrHdrs,
                    this.clnpInErrSegs,
                    this.clnpInErrIncomps,
                    this.clnpInErrDups,
                    this.clnpInErrUnreachDsts,
                    this.clnpInErrUnknownDsts,
                    this.clnpInErrSRUnspecs,
                    this.clnpInErrSRSyntaxes,
                    this.clnpInErrSRUnkAddrs,
                    this.clnpInErrSRBadPaths,
                    this.clnpInErrHops,
                    this.clnpInErrHopReassms,
                    this.clnpInErrUnsOptions,
                    this.clnpInErrUnsVersions,
                    this.clnpInErrUnsSecurities,
                    this.clnpInErrUnsSRs,
                    this.clnpInErrUnsRRs,
                    this.clnpInErrInterferences,
                    this.clnpOutErrUnspecs,
                    this.clnpOutErrProcs,
                    this.clnpOutErrCksums,
                    this.clnpOutErrCongests,
                    this.clnpOutErrHdrs,
                    this.clnpOutErrSegs,
                    this.clnpOutErrIncomps,
                    this.clnpOutErrDups,
                    this.clnpOutErrUnreachDsts,
                    this.clnpOutErrUnknownDsts,
                    this.clnpOutErrSRUnspecs,
                    this.clnpOutErrSRSyntaxes,
                    this.clnpOutErrSRUnkAddrs,
                    this.clnpOutErrSRBadPaths,
                    this.clnpOutErrHops,
                    this.clnpOutErrHopReassms,
                    this.clnpOutErrUnsOptions,
                    this.clnpOutErrUnsVersions,
                    this.clnpOutErrUnsSecurities,
                    this.clnpOutErrUnsSRs,
                    this.clnpOutErrUnsRRs,
                    this.clnpOutErrInterferences
                };
            }
            public static final class ClnpInErrorsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrorsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrors", "1.3.6.1.3.1.2.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrorsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrorsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrors", "1.3.6.1.3.1.2.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrUnspecsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrUnspecsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrUnspecs", "1.3.6.1.3.1.2.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrProcsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrProcsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrProcs", "1.3.6.1.3.1.2.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrCksumsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrCksumsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrCksums", "1.3.6.1.3.1.2.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrCongestsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrCongestsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrCongests", "1.3.6.1.3.1.2.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrHdrsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrHdrsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrHdrs", "1.3.6.1.3.1.2.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrSegsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrSegsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrSegs", "1.3.6.1.3.1.2.8", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrIncompsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrIncompsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrIncomps", "1.3.6.1.3.1.2.9", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrDupsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrDupsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrDups", "1.3.6.1.3.1.2.10", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrUnreachDstsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrUnreachDstsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrUnreachDsts", "1.3.6.1.3.1.2.11", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrUnknownDstsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrUnknownDstsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrUnknownDsts", "1.3.6.1.3.1.2.12", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrSRUnspecsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrSRUnspecsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrSRUnspecs", "1.3.6.1.3.1.2.13", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrSRSyntaxesEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrSRSyntaxesEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrSRSyntaxes", "1.3.6.1.3.1.2.14", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrSRUnkAddrsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrSRUnkAddrsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrSRUnkAddrs", "1.3.6.1.3.1.2.15", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrSRBadPathsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrSRBadPathsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrSRBadPaths", "1.3.6.1.3.1.2.16", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrHopsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrHopsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrHops", "1.3.6.1.3.1.2.17", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrHopReassmsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrHopReassmsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrHopReassms", "1.3.6.1.3.1.2.18", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrUnsOptionsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrUnsOptionsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrUnsOptions", "1.3.6.1.3.1.2.19", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrUnsVersionsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrUnsVersionsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrUnsVersions", "1.3.6.1.3.1.2.20", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrUnsSecuritiesEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrUnsSecuritiesEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrUnsSecurities", "1.3.6.1.3.1.2.21", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrUnsSRsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrUnsSRsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrUnsSRs", "1.3.6.1.3.1.2.22", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrUnsRRsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrUnsRRsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrUnsRRs", "1.3.6.1.3.1.2.23", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpInErrInterferencesEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpInErrInterferencesEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpInErrInterferences", "1.3.6.1.3.1.2.24", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrUnspecsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrUnspecsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrUnspecs", "1.3.6.1.3.1.2.25", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrProcsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrProcsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrProcs", "1.3.6.1.3.1.2.26", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrCksumsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrCksumsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrCksums", "1.3.6.1.3.1.2.27", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrCongestsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrCongestsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrCongests", "1.3.6.1.3.1.2.28", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrHdrsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrHdrsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrHdrs", "1.3.6.1.3.1.2.29", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrSegsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrSegsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrSegs", "1.3.6.1.3.1.2.30", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrIncompsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrIncompsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrIncomps", "1.3.6.1.3.1.2.31", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrDupsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrDupsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrDups", "1.3.6.1.3.1.2.32", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrUnreachDstsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrUnreachDstsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrUnreachDsts", "1.3.6.1.3.1.2.33", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrUnknownDstsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrUnknownDstsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrUnknownDsts", "1.3.6.1.3.1.2.34", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrSRUnspecsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrSRUnspecsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrSRUnspecs", "1.3.6.1.3.1.2.35", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrSRSyntaxesEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrSRSyntaxesEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrSRSyntaxes", "1.3.6.1.3.1.2.36", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrSRUnkAddrsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrSRUnkAddrsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrSRUnkAddrs", "1.3.6.1.3.1.2.37", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrSRBadPathsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrSRBadPathsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrSRBadPaths", "1.3.6.1.3.1.2.38", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrHopsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrHopsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrHops", "1.3.6.1.3.1.2.39", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrHopReassmsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrHopReassmsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrHopReassms", "1.3.6.1.3.1.2.40", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrUnsOptionsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrUnsOptionsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrUnsOptions", "1.3.6.1.3.1.2.41", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrUnsVersionsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrUnsVersionsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrUnsVersions", "1.3.6.1.3.1.2.42", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrUnsSecuritiesEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrUnsSecuritiesEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrUnsSecurities", "1.3.6.1.3.1.2.43", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrUnsSRsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrUnsSRsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrUnsSRs", "1.3.6.1.3.1.2.44", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrUnsRRsEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrUnsRRsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrUnsRRs", "1.3.6.1.3.1.2.45", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ClnpOutErrInterferencesEnt extends MIBEntry<CLNSMIBDef>
            {
                private ClnpOutErrInterferencesEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "clnpOutErrInterferences", "1.3.6.1.3.1.2.46", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class EchoEnt extends MIBEntry<CLNSMIBDef>
        {
            private EchoEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
            {
                super(mib, parent, "echo", "1.3.6.1.3.1.3", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class EsisEnt extends MIBEntry<CLNSMIBDef>
        {
            /** the ES-IS group
Implementation of this group is recommended for allsystems which implement the End-System to IntermediateSystem protocol.*/
            public final EsisESHinsEnt esisESHins;

            public final EsisESHoutsEnt esisESHouts;

            public final EsisISHinsEnt esisISHins;

            public final EsisISHoutsEnt esisISHouts;

            public final EsisRDUinsEnt esisRDUins;

            public final EsisRDUoutsEnt esisRDUouts;

            private EsisEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
            {
                super(mib, parent, "es-is", "1.3.6.1.3.1.4", false, false, false, false);
                this.esisESHins = new EsisESHinsEnt(mib, this);
                this.esisESHouts = new EsisESHoutsEnt(mib, this);
                this.esisISHins = new EsisISHinsEnt(mib, this);
                this.esisISHouts = new EsisISHoutsEnt(mib, this);
                this.esisRDUins = new EsisRDUinsEnt(mib, this);
                this.esisRDUouts = new EsisRDUoutsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.esisESHins,
                    this.esisESHouts,
                    this.esisISHins,
                    this.esisISHouts,
                    this.esisRDUins,
                    this.esisRDUouts
                };
            }
            public static final class EsisESHinsEnt extends MIBEntry<CLNSMIBDef>
            {
                private EsisESHinsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "esisESHins", "1.3.6.1.3.1.4.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EsisESHoutsEnt extends MIBEntry<CLNSMIBDef>
            {
                private EsisESHoutsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "esisESHouts", "1.3.6.1.3.1.4.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EsisISHinsEnt extends MIBEntry<CLNSMIBDef>
            {
                private EsisISHinsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "esisISHins", "1.3.6.1.3.1.4.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EsisISHoutsEnt extends MIBEntry<CLNSMIBDef>
            {
                private EsisISHoutsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "esisISHouts", "1.3.6.1.3.1.4.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EsisRDUinsEnt extends MIBEntry<CLNSMIBDef>
            {
                private EsisRDUinsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "esisRDUins", "1.3.6.1.3.1.4.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EsisRDUoutsEnt extends MIBEntry<CLNSMIBDef>
            {
                private EsisRDUoutsEnt(CLNSMIBDef mib, MIBEntry<CLNSMIBDef> parent)
                {
                    super(mib, parent, "esisRDUouts", "1.3.6.1.3.1.4.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
