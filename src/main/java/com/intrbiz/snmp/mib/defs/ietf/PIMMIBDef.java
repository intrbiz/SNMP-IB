package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class PIMMIBDef extends MIB
{
    public static final PIMMIBDef PIMMIB = new PIMMIBDef();

    /** September 28, 2000*/
    public final PimMIBEnt pimMIB;

    private PIMMIBDef()
    {
        super("PIM-MIB");
        this.pimMIB = new PimMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.pimMIB
        };
    }

    public static final class PimMIBEnt extends MIBEntry<PIMMIBDef>
    {
        public final PimMIBObjectsEnt pimMIBObjects;

        /** conformance information*/
        public final PimMIBConformanceEnt pimMIBConformance;

        private PimMIBEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
        {
            super(mib, parent, "pimMIB", "1.3.6.1.3.61", false, false, false, false);
            this.pimMIBObjects = new PimMIBObjectsEnt(mib, this);
            this.pimMIBConformance = new PimMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.pimMIBObjects,
                this.pimMIBConformance
            };
        }
        public static final class PimMIBObjectsEnt extends MIBEntry<PIMMIBDef>
        {
            public final PimTrapsEnt pimTraps;

            public final PimEnt pim;

            private PimMIBObjectsEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
            {
                super(mib, parent, "pimMIBObjects", "1.3.6.1.3.61.1", false, false, false, false);
                this.pimTraps = new PimTrapsEnt(mib, this);
                this.pim = new PimEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pimTraps,
                    this.pim
                };
            }
            public static final class PimTrapsEnt extends MIBEntry<PIMMIBDef>
            {
                /** PIM Traps*/
                public final PimNeighborLossEnt pimNeighborLoss;

                private PimTrapsEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                {
                    super(mib, parent, "pimTraps", "1.3.6.1.3.61.1.0", false, false, false, false);
                    this.pimNeighborLoss = new PimNeighborLossEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimNeighborLoss
                    };
                }
                public static final class PimNeighborLossEnt extends MIBEntry<PIMMIBDef>
                {
                    private PimNeighborLossEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimNeighborLoss", "1.3.6.1.3.61.1.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class PimEnt extends MIBEntry<PIMMIBDef>
            {
                public final PimJoinPruneIntervalEnt pimJoinPruneInterval;

                /** The PIM Interface Table*/
                public final PimInterfaceTableEnt pimInterfaceTable;

                /** The PIM Neighbor Table*/
                public final PimNeighborTableEnt pimNeighborTable;

                /** The PIM IP Multicast Route Table*/
                public final PimIpMRouteTableEnt pimIpMRouteTable;

                /** The PIM Next Hop Table*/
                public final PimIpMRouteNextHopTableEnt pimIpMRouteNextHopTable;

                /** The PIM RP Table*/
                public final PimRPTableEnt pimRPTable;

                /** The PIM RP-Set Table*/
                public final PimRPSetTableEnt pimRPSetTable;

                /** Note: { pim 8 } through { pim 10 } were used in older versionsof this MIB.  Since some earlier versions of this MIB have beenwidely-deployed, these values must not be used in the future,as long the MIB is rooted under { experimental 61 }.
The PIM Candidate-RP Table*/
                public final PimCandidateRPTableEnt pimCandidateRPTable;

                /** The PIM Component Table*/
                public final PimComponentTableEnt pimComponentTable;

                private PimEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                {
                    super(mib, parent, "pim", "1.3.6.1.3.61.1.1", false, false, false, false);
                    this.pimJoinPruneInterval = new PimJoinPruneIntervalEnt(mib, this);
                    this.pimInterfaceTable = new PimInterfaceTableEnt(mib, this);
                    this.pimNeighborTable = new PimNeighborTableEnt(mib, this);
                    this.pimIpMRouteTable = new PimIpMRouteTableEnt(mib, this);
                    this.pimIpMRouteNextHopTable = new PimIpMRouteNextHopTableEnt(mib, this);
                    this.pimRPTable = new PimRPTableEnt(mib, this);
                    this.pimRPSetTable = new PimRPSetTableEnt(mib, this);
                    this.pimCandidateRPTable = new PimCandidateRPTableEnt(mib, this);
                    this.pimComponentTable = new PimComponentTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimJoinPruneInterval,
                        this.pimInterfaceTable,
                        this.pimNeighborTable,
                        this.pimIpMRouteTable,
                        this.pimIpMRouteNextHopTable,
                        this.pimRPTable,
                        this.pimRPSetTable,
                        this.pimCandidateRPTable,
                        this.pimComponentTable
                    };
                }
                public static final class PimJoinPruneIntervalEnt extends MIBEntry<PIMMIBDef>
                {
                    private PimJoinPruneIntervalEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimJoinPruneInterval", "1.3.6.1.3.61.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimInterfaceTableEnt extends MIBEntry<PIMMIBDef>
                {
                    public final PimInterfaceEntryEnt pimInterfaceEntry;

                    private PimInterfaceTableEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimInterfaceTable", "1.3.6.1.3.61.1.1.2", false, true, false, false);
                        this.pimInterfaceEntry = new PimInterfaceEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimInterfaceEntry
                        };
                    }
                    public static final class PimInterfaceEntryEnt extends MIBEntry<PIMMIBDef>
                    {
                        public final PimInterfaceIfIndexEnt pimInterfaceIfIndex;

                        public final PimInterfaceAddressEnt pimInterfaceAddress;

                        public final PimInterfaceNetMaskEnt pimInterfaceNetMask;

                        public final PimInterfaceModeEnt pimInterfaceMode;

                        public final PimInterfaceDREnt pimInterfaceDR;

                        public final PimInterfaceHelloIntervalEnt pimInterfaceHelloInterval;

                        public final PimInterfaceStatusEnt pimInterfaceStatus;

                        public final PimInterfaceJoinPruneIntervalEnt pimInterfaceJoinPruneInterval;

                        public final PimInterfaceCBSRPreferenceEnt pimInterfaceCBSRPreference;

                        private PimInterfaceEntryEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceEntry", "1.3.6.1.3.61.1.1.2.1", false, false, false, true);
                            this.pimInterfaceIfIndex = new PimInterfaceIfIndexEnt(mib, this);
                            this.pimInterfaceAddress = new PimInterfaceAddressEnt(mib, this);
                            this.pimInterfaceNetMask = new PimInterfaceNetMaskEnt(mib, this);
                            this.pimInterfaceMode = new PimInterfaceModeEnt(mib, this);
                            this.pimInterfaceDR = new PimInterfaceDREnt(mib, this);
                            this.pimInterfaceHelloInterval = new PimInterfaceHelloIntervalEnt(mib, this);
                            this.pimInterfaceStatus = new PimInterfaceStatusEnt(mib, this);
                            this.pimInterfaceJoinPruneInterval = new PimInterfaceJoinPruneIntervalEnt(mib, this);
                            this.pimInterfaceCBSRPreference = new PimInterfaceCBSRPreferenceEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pimInterfaceIfIndex,
                                this.pimInterfaceAddress,
                                this.pimInterfaceNetMask,
                                this.pimInterfaceMode,
                                this.pimInterfaceDR,
                                this.pimInterfaceHelloInterval,
                                this.pimInterfaceStatus,
                                this.pimInterfaceJoinPruneInterval,
                                this.pimInterfaceCBSRPreference
                            };
                        }
                        public static final class PimInterfaceIfIndexEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimInterfaceIfIndexEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimInterfaceIfIndex", "1.3.6.1.3.61.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimInterfaceAddressEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimInterfaceAddressEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimInterfaceAddress", "1.3.6.1.3.61.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimInterfaceNetMaskEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimInterfaceNetMaskEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimInterfaceNetMask", "1.3.6.1.3.61.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimInterfaceModeEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimInterfaceModeEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimInterfaceMode", "1.3.6.1.3.61.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimInterfaceDREnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimInterfaceDREnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimInterfaceDR", "1.3.6.1.3.61.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimInterfaceHelloIntervalEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimInterfaceHelloIntervalEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimInterfaceHelloInterval", "1.3.6.1.3.61.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimInterfaceStatusEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimInterfaceStatusEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimInterfaceStatus", "1.3.6.1.3.61.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimInterfaceJoinPruneIntervalEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimInterfaceJoinPruneIntervalEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimInterfaceJoinPruneInterval", "1.3.6.1.3.61.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimInterfaceCBSRPreferenceEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimInterfaceCBSRPreferenceEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimInterfaceCBSRPreference", "1.3.6.1.3.61.1.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PimNeighborTableEnt extends MIBEntry<PIMMIBDef>
                {
                    public final PimNeighborEntryEnt pimNeighborEntry;

                    private PimNeighborTableEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimNeighborTable", "1.3.6.1.3.61.1.1.3", false, true, false, false);
                        this.pimNeighborEntry = new PimNeighborEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimNeighborEntry
                        };
                    }
                    public static final class PimNeighborEntryEnt extends MIBEntry<PIMMIBDef>
                    {
                        public final PimNeighborAddressEnt pimNeighborAddress;

                        public final PimNeighborIfIndexEnt pimNeighborIfIndex;

                        public final PimNeighborUpTimeEnt pimNeighborUpTime;

                        public final PimNeighborExpiryTimeEnt pimNeighborExpiryTime;

                        public final PimNeighborModeEnt pimNeighborMode;

                        private PimNeighborEntryEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                        {
                            super(mib, parent, "pimNeighborEntry", "1.3.6.1.3.61.1.1.3.1", false, false, false, true);
                            this.pimNeighborAddress = new PimNeighborAddressEnt(mib, this);
                            this.pimNeighborIfIndex = new PimNeighborIfIndexEnt(mib, this);
                            this.pimNeighborUpTime = new PimNeighborUpTimeEnt(mib, this);
                            this.pimNeighborExpiryTime = new PimNeighborExpiryTimeEnt(mib, this);
                            this.pimNeighborMode = new PimNeighborModeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pimNeighborAddress,
                                this.pimNeighborIfIndex,
                                this.pimNeighborUpTime,
                                this.pimNeighborExpiryTime,
                                this.pimNeighborMode
                            };
                        }
                        public static final class PimNeighborAddressEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimNeighborAddressEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimNeighborAddress", "1.3.6.1.3.61.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimNeighborIfIndexEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimNeighborIfIndexEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimNeighborIfIndex", "1.3.6.1.3.61.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimNeighborUpTimeEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimNeighborUpTimeEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimNeighborUpTime", "1.3.6.1.3.61.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimNeighborExpiryTimeEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimNeighborExpiryTimeEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimNeighborExpiryTime", "1.3.6.1.3.61.1.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimNeighborModeEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimNeighborModeEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimNeighborMode", "1.3.6.1.3.61.1.1.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PimIpMRouteTableEnt extends MIBEntry<PIMMIBDef>
                {
                    public final PimIpMRouteEntryEnt pimIpMRouteEntry;

                    private PimIpMRouteTableEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimIpMRouteTable", "1.3.6.1.3.61.1.1.4", false, true, false, false);
                        this.pimIpMRouteEntry = new PimIpMRouteEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimIpMRouteEntry
                        };
                    }
                    public static final class PimIpMRouteEntryEnt extends MIBEntry<PIMMIBDef>
                    {
                        public final PimIpMRouteUpstreamAssertTimerEnt pimIpMRouteUpstreamAssertTimer;

                        public final PimIpMRouteAssertMetricEnt pimIpMRouteAssertMetric;

                        public final PimIpMRouteAssertMetricPrefEnt pimIpMRouteAssertMetricPref;

                        public final PimIpMRouteAssertRPTBitEnt pimIpMRouteAssertRPTBit;

                        public final PimIpMRouteFlagsEnt pimIpMRouteFlags;

                        private PimIpMRouteEntryEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                        {
                            super(mib, parent, "pimIpMRouteEntry", "1.3.6.1.3.61.1.1.4.1", false, false, false, true);
                            this.pimIpMRouteUpstreamAssertTimer = new PimIpMRouteUpstreamAssertTimerEnt(mib, this);
                            this.pimIpMRouteAssertMetric = new PimIpMRouteAssertMetricEnt(mib, this);
                            this.pimIpMRouteAssertMetricPref = new PimIpMRouteAssertMetricPrefEnt(mib, this);
                            this.pimIpMRouteAssertRPTBit = new PimIpMRouteAssertRPTBitEnt(mib, this);
                            this.pimIpMRouteFlags = new PimIpMRouteFlagsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pimIpMRouteUpstreamAssertTimer,
                                this.pimIpMRouteAssertMetric,
                                this.pimIpMRouteAssertMetricPref,
                                this.pimIpMRouteAssertRPTBit,
                                this.pimIpMRouteFlags
                            };
                        }
                        public static final class PimIpMRouteUpstreamAssertTimerEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimIpMRouteUpstreamAssertTimerEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimIpMRouteUpstreamAssertTimer", "1.3.6.1.3.61.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimIpMRouteAssertMetricEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimIpMRouteAssertMetricEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimIpMRouteAssertMetric", "1.3.6.1.3.61.1.1.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimIpMRouteAssertMetricPrefEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimIpMRouteAssertMetricPrefEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimIpMRouteAssertMetricPref", "1.3.6.1.3.61.1.1.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimIpMRouteAssertRPTBitEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimIpMRouteAssertRPTBitEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimIpMRouteAssertRPTBit", "1.3.6.1.3.61.1.1.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimIpMRouteFlagsEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimIpMRouteFlagsEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimIpMRouteFlags", "1.3.6.1.3.61.1.1.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PimIpMRouteNextHopTableEnt extends MIBEntry<PIMMIBDef>
                {
                    public final PimIpMRouteNextHopEntryEnt pimIpMRouteNextHopEntry;

                    private PimIpMRouteNextHopTableEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimIpMRouteNextHopTable", "1.3.6.1.3.61.1.1.7", false, true, false, false);
                        this.pimIpMRouteNextHopEntry = new PimIpMRouteNextHopEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimIpMRouteNextHopEntry
                        };
                    }
                    public static final class PimIpMRouteNextHopEntryEnt extends MIBEntry<PIMMIBDef>
                    {
                        public final PimIpMRouteNextHopPruneReasonEnt pimIpMRouteNextHopPruneReason;

                        private PimIpMRouteNextHopEntryEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                        {
                            super(mib, parent, "pimIpMRouteNextHopEntry", "1.3.6.1.3.61.1.1.7.1", false, false, false, true);
                            this.pimIpMRouteNextHopPruneReason = new PimIpMRouteNextHopPruneReasonEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pimIpMRouteNextHopPruneReason
                            };
                        }
                        public static final class PimIpMRouteNextHopPruneReasonEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimIpMRouteNextHopPruneReasonEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimIpMRouteNextHopPruneReason", "1.3.6.1.3.61.1.1.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PimRPTableEnt extends MIBEntry<PIMMIBDef>
                {
                    public final PimRPEntryEnt pimRPEntry;

                    private PimRPTableEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimRPTable", "1.3.6.1.3.61.1.1.5", false, true, false, false);
                        this.pimRPEntry = new PimRPEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimRPEntry
                        };
                    }
                    public static final class PimRPEntryEnt extends MIBEntry<PIMMIBDef>
                    {
                        public final PimRPGroupAddressEnt pimRPGroupAddress;

                        public final PimRPAddressEnt pimRPAddress;

                        public final PimRPStateEnt pimRPState;

                        public final PimRPStateTimerEnt pimRPStateTimer;

                        public final PimRPLastChangeEnt pimRPLastChange;

                        public final PimRPRowStatusEnt pimRPRowStatus;

                        private PimRPEntryEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                        {
                            super(mib, parent, "pimRPEntry", "1.3.6.1.3.61.1.1.5.1", false, false, false, true);
                            this.pimRPGroupAddress = new PimRPGroupAddressEnt(mib, this);
                            this.pimRPAddress = new PimRPAddressEnt(mib, this);
                            this.pimRPState = new PimRPStateEnt(mib, this);
                            this.pimRPStateTimer = new PimRPStateTimerEnt(mib, this);
                            this.pimRPLastChange = new PimRPLastChangeEnt(mib, this);
                            this.pimRPRowStatus = new PimRPRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pimRPGroupAddress,
                                this.pimRPAddress,
                                this.pimRPState,
                                this.pimRPStateTimer,
                                this.pimRPLastChange,
                                this.pimRPRowStatus
                            };
                        }
                        public static final class PimRPGroupAddressEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimRPGroupAddressEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimRPGroupAddress", "1.3.6.1.3.61.1.1.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimRPAddressEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimRPAddressEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimRPAddress", "1.3.6.1.3.61.1.1.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimRPStateEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimRPStateEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimRPState", "1.3.6.1.3.61.1.1.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimRPStateTimerEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimRPStateTimerEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimRPStateTimer", "1.3.6.1.3.61.1.1.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimRPLastChangeEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimRPLastChangeEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimRPLastChange", "1.3.6.1.3.61.1.1.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimRPRowStatusEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimRPRowStatusEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimRPRowStatus", "1.3.6.1.3.61.1.1.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PimRPSetTableEnt extends MIBEntry<PIMMIBDef>
                {
                    public final PimRPSetEntryEnt pimRPSetEntry;

                    private PimRPSetTableEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimRPSetTable", "1.3.6.1.3.61.1.1.6", false, true, false, false);
                        this.pimRPSetEntry = new PimRPSetEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimRPSetEntry
                        };
                    }
                    public static final class PimRPSetEntryEnt extends MIBEntry<PIMMIBDef>
                    {
                        public final PimRPSetGroupAddressEnt pimRPSetGroupAddress;

                        public final PimRPSetGroupMaskEnt pimRPSetGroupMask;

                        public final PimRPSetAddressEnt pimRPSetAddress;

                        public final PimRPSetHoldTimeEnt pimRPSetHoldTime;

                        public final PimRPSetExpiryTimeEnt pimRPSetExpiryTime;

                        public final PimRPSetComponentEnt pimRPSetComponent;

                        private PimRPSetEntryEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                        {
                            super(mib, parent, "pimRPSetEntry", "1.3.6.1.3.61.1.1.6.1", false, false, false, true);
                            this.pimRPSetGroupAddress = new PimRPSetGroupAddressEnt(mib, this);
                            this.pimRPSetGroupMask = new PimRPSetGroupMaskEnt(mib, this);
                            this.pimRPSetAddress = new PimRPSetAddressEnt(mib, this);
                            this.pimRPSetHoldTime = new PimRPSetHoldTimeEnt(mib, this);
                            this.pimRPSetExpiryTime = new PimRPSetExpiryTimeEnt(mib, this);
                            this.pimRPSetComponent = new PimRPSetComponentEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pimRPSetGroupAddress,
                                this.pimRPSetGroupMask,
                                this.pimRPSetAddress,
                                this.pimRPSetHoldTime,
                                this.pimRPSetExpiryTime,
                                this.pimRPSetComponent
                            };
                        }
                        public static final class PimRPSetGroupAddressEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimRPSetGroupAddressEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimRPSetGroupAddress", "1.3.6.1.3.61.1.1.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimRPSetGroupMaskEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimRPSetGroupMaskEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimRPSetGroupMask", "1.3.6.1.3.61.1.1.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimRPSetAddressEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimRPSetAddressEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimRPSetAddress", "1.3.6.1.3.61.1.1.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimRPSetHoldTimeEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimRPSetHoldTimeEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimRPSetHoldTime", "1.3.6.1.3.61.1.1.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimRPSetExpiryTimeEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimRPSetExpiryTimeEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimRPSetExpiryTime", "1.3.6.1.3.61.1.1.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimRPSetComponentEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimRPSetComponentEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimRPSetComponent", "1.3.6.1.3.61.1.1.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PimCandidateRPTableEnt extends MIBEntry<PIMMIBDef>
                {
                    public final PimCandidateRPEntryEnt pimCandidateRPEntry;

                    private PimCandidateRPTableEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimCandidateRPTable", "1.3.6.1.3.61.1.1.11", false, true, false, false);
                        this.pimCandidateRPEntry = new PimCandidateRPEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimCandidateRPEntry
                        };
                    }
                    public static final class PimCandidateRPEntryEnt extends MIBEntry<PIMMIBDef>
                    {
                        public final PimCandidateRPGroupAddressEnt pimCandidateRPGroupAddress;

                        public final PimCandidateRPGroupMaskEnt pimCandidateRPGroupMask;

                        public final PimCandidateRPAddressEnt pimCandidateRPAddress;

                        public final PimCandidateRPRowStatusEnt pimCandidateRPRowStatus;

                        private PimCandidateRPEntryEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                        {
                            super(mib, parent, "pimCandidateRPEntry", "1.3.6.1.3.61.1.1.11.1", false, false, false, true);
                            this.pimCandidateRPGroupAddress = new PimCandidateRPGroupAddressEnt(mib, this);
                            this.pimCandidateRPGroupMask = new PimCandidateRPGroupMaskEnt(mib, this);
                            this.pimCandidateRPAddress = new PimCandidateRPAddressEnt(mib, this);
                            this.pimCandidateRPRowStatus = new PimCandidateRPRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pimCandidateRPGroupAddress,
                                this.pimCandidateRPGroupMask,
                                this.pimCandidateRPAddress,
                                this.pimCandidateRPRowStatus
                            };
                        }
                        public static final class PimCandidateRPGroupAddressEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimCandidateRPGroupAddressEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimCandidateRPGroupAddress", "1.3.6.1.3.61.1.1.11.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimCandidateRPGroupMaskEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimCandidateRPGroupMaskEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimCandidateRPGroupMask", "1.3.6.1.3.61.1.1.11.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimCandidateRPAddressEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimCandidateRPAddressEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimCandidateRPAddress", "1.3.6.1.3.61.1.1.11.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimCandidateRPRowStatusEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimCandidateRPRowStatusEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimCandidateRPRowStatus", "1.3.6.1.3.61.1.1.11.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PimComponentTableEnt extends MIBEntry<PIMMIBDef>
                {
                    public final PimComponentEntryEnt pimComponentEntry;

                    private PimComponentTableEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimComponentTable", "1.3.6.1.3.61.1.1.12", false, true, false, false);
                        this.pimComponentEntry = new PimComponentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimComponentEntry
                        };
                    }
                    public static final class PimComponentEntryEnt extends MIBEntry<PIMMIBDef>
                    {
                        public final PimComponentIndexEnt pimComponentIndex;

                        public final PimComponentBSRAddressEnt pimComponentBSRAddress;

                        public final PimComponentBSRExpiryTimeEnt pimComponentBSRExpiryTime;

                        public final PimComponentCRPHoldTimeEnt pimComponentCRPHoldTime;

                        public final PimComponentStatusEnt pimComponentStatus;

                        private PimComponentEntryEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                        {
                            super(mib, parent, "pimComponentEntry", "1.3.6.1.3.61.1.1.12.1", false, false, false, true);
                            this.pimComponentIndex = new PimComponentIndexEnt(mib, this);
                            this.pimComponentBSRAddress = new PimComponentBSRAddressEnt(mib, this);
                            this.pimComponentBSRExpiryTime = new PimComponentBSRExpiryTimeEnt(mib, this);
                            this.pimComponentCRPHoldTime = new PimComponentCRPHoldTimeEnt(mib, this);
                            this.pimComponentStatus = new PimComponentStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pimComponentIndex,
                                this.pimComponentBSRAddress,
                                this.pimComponentBSRExpiryTime,
                                this.pimComponentCRPHoldTime,
                                this.pimComponentStatus
                            };
                        }
                        public static final class PimComponentIndexEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimComponentIndexEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimComponentIndex", "1.3.6.1.3.61.1.1.12.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimComponentBSRAddressEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimComponentBSRAddressEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimComponentBSRAddress", "1.3.6.1.3.61.1.1.12.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimComponentBSRExpiryTimeEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimComponentBSRExpiryTimeEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimComponentBSRExpiryTime", "1.3.6.1.3.61.1.1.12.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimComponentCRPHoldTimeEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimComponentCRPHoldTimeEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimComponentCRPHoldTime", "1.3.6.1.3.61.1.1.12.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PimComponentStatusEnt extends MIBEntry<PIMMIBDef>
                        {
                            private PimComponentStatusEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                            {
                                super(mib, parent, "pimComponentStatus", "1.3.6.1.3.61.1.1.12.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class PimMIBConformanceEnt extends MIBEntry<PIMMIBDef>
        {
            public final PimMIBCompliancesEnt pimMIBCompliances;

            public final PimMIBGroupsEnt pimMIBGroups;

            private PimMIBConformanceEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
            {
                super(mib, parent, "pimMIBConformance", "1.3.6.1.3.61.2", false, false, false, false);
                this.pimMIBCompliances = new PimMIBCompliancesEnt(mib, this);
                this.pimMIBGroups = new PimMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pimMIBCompliances,
                    this.pimMIBGroups
                };
            }
            public static final class PimMIBCompliancesEnt extends MIBEntry<PIMMIBDef>
            {
                /** compliance statements*/
                public final PimV1MIBComplianceEnt pimV1MIBCompliance;

                public final PimSparseV2MIBComplianceEnt pimSparseV2MIBCompliance;

                public final PimDenseV2MIBComplianceEnt pimDenseV2MIBCompliance;

                private PimMIBCompliancesEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                {
                    super(mib, parent, "pimMIBCompliances", "1.3.6.1.3.61.2.1", false, false, false, false);
                    this.pimV1MIBCompliance = new PimV1MIBComplianceEnt(mib, this);
                    this.pimSparseV2MIBCompliance = new PimSparseV2MIBComplianceEnt(mib, this);
                    this.pimDenseV2MIBCompliance = new PimDenseV2MIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimV1MIBCompliance,
                        this.pimSparseV2MIBCompliance,
                        this.pimDenseV2MIBCompliance
                    };
                }
                public static final class PimV1MIBComplianceEnt extends MIBEntry<PIMMIBDef>
                {
                    private PimV1MIBComplianceEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimV1MIBCompliance", "1.3.6.1.3.61.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimSparseV2MIBComplianceEnt extends MIBEntry<PIMMIBDef>
                {
                    private PimSparseV2MIBComplianceEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimSparseV2MIBCompliance", "1.3.6.1.3.61.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimDenseV2MIBComplianceEnt extends MIBEntry<PIMMIBDef>
                {
                    private PimDenseV2MIBComplianceEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimDenseV2MIBCompliance", "1.3.6.1.3.61.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class PimMIBGroupsEnt extends MIBEntry<PIMMIBDef>
            {
                /** units of conformance*/
                public final PimNotificationGroupEnt pimNotificationGroup;

                public final PimV2MIBGroupEnt pimV2MIBGroup;

                public final PimDenseV2MIBGroupEnt pimDenseV2MIBGroup;

                public final PimV2CandidateRPMIBGroupEnt pimV2CandidateRPMIBGroup;

                public final PimV1MIBGroupEnt pimV1MIBGroup;

                public final PimNextHopGroupEnt pimNextHopGroup;

                public final PimAssertGroupEnt pimAssertGroup;

                private PimMIBGroupsEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                {
                    super(mib, parent, "pimMIBGroups", "1.3.6.1.3.61.2.2", false, false, false, false);
                    this.pimNotificationGroup = new PimNotificationGroupEnt(mib, this);
                    this.pimV2MIBGroup = new PimV2MIBGroupEnt(mib, this);
                    this.pimDenseV2MIBGroup = new PimDenseV2MIBGroupEnt(mib, this);
                    this.pimV2CandidateRPMIBGroup = new PimV2CandidateRPMIBGroupEnt(mib, this);
                    this.pimV1MIBGroup = new PimV1MIBGroupEnt(mib, this);
                    this.pimNextHopGroup = new PimNextHopGroupEnt(mib, this);
                    this.pimAssertGroup = new PimAssertGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimNotificationGroup,
                        this.pimV2MIBGroup,
                        this.pimDenseV2MIBGroup,
                        this.pimV2CandidateRPMIBGroup,
                        this.pimV1MIBGroup,
                        this.pimNextHopGroup,
                        this.pimAssertGroup
                    };
                }
                public static final class PimNotificationGroupEnt extends MIBEntry<PIMMIBDef>
                {
                    private PimNotificationGroupEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimNotificationGroup", "1.3.6.1.3.61.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimV2MIBGroupEnt extends MIBEntry<PIMMIBDef>
                {
                    private PimV2MIBGroupEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimV2MIBGroup", "1.3.6.1.3.61.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimDenseV2MIBGroupEnt extends MIBEntry<PIMMIBDef>
                {
                    private PimDenseV2MIBGroupEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimDenseV2MIBGroup", "1.3.6.1.3.61.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimV2CandidateRPMIBGroupEnt extends MIBEntry<PIMMIBDef>
                {
                    private PimV2CandidateRPMIBGroupEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimV2CandidateRPMIBGroup", "1.3.6.1.3.61.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimV1MIBGroupEnt extends MIBEntry<PIMMIBDef>
                {
                    private PimV1MIBGroupEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimV1MIBGroup", "1.3.6.1.3.61.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimNextHopGroupEnt extends MIBEntry<PIMMIBDef>
                {
                    private PimNextHopGroupEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimNextHopGroup", "1.3.6.1.3.61.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimAssertGroupEnt extends MIBEntry<PIMMIBDef>
                {
                    private PimAssertGroupEnt(PIMMIBDef mib, MIBEntry<PIMMIBDef> parent)
                    {
                        super(mib, parent, "pimAssertGroup", "1.3.6.1.3.61.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
