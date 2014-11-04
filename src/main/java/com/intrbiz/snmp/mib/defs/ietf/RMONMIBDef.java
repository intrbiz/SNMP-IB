package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class RMONMIBDef extends MIB
{
    public static final RMONMIBDef RMONMIB = new RMONMIBDef();

    static { MIBs.getInstance().registerMIB(RMONMIBDef.RMONMIB); }

    public final RmonEnt rmon;

    private RMONMIBDef()
    {
        super("RMON-MIB");
        this.rmon = new RmonEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.rmon
        };
    }

    public static final class RmonEnt extends MIBEntry<RMONMIBDef>
    {
        public final RmonConformanceEnt rmonConformance;

        public final StatisticsEnt statistics;

        public final HistoryEnt history;

        public final AlarmEnt alarm;

        public final HostsEnt hosts;

        public final HostTopNEnt hostTopN;

        public final MatrixEnt matrix;

        public final FilterEnt filter;

        public final CaptureEnt capture;

        public final EventEnt event;

        /** Remote Network Monitoring Traps*/
        public final RmonEventsV2Ent rmonEventsV2;

        private RmonEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
        {
            super(mib, parent, "rmon", "1.3.6.1.2.1.16", false, false, false, false);
            this.rmonConformance = new RmonConformanceEnt(mib, this);
            this.statistics = new StatisticsEnt(mib, this);
            this.history = new HistoryEnt(mib, this);
            this.alarm = new AlarmEnt(mib, this);
            this.hosts = new HostsEnt(mib, this);
            this.hostTopN = new HostTopNEnt(mib, this);
            this.matrix = new MatrixEnt(mib, this);
            this.filter = new FilterEnt(mib, this);
            this.capture = new CaptureEnt(mib, this);
            this.event = new EventEnt(mib, this);
            this.rmonEventsV2 = new RmonEventsV2Ent(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.rmonConformance,
                this.statistics,
                this.history,
                this.alarm,
                this.hosts,
                this.hostTopN,
                this.matrix,
                this.filter,
                this.capture,
                this.event,
                this.rmonEventsV2
            };
        }
        public static final class RmonConformanceEnt extends MIBEntry<RMONMIBDef>
        {
            /** Remote Network Monitoring MIB

11 May, 2000*/
            public final RmonMibModuleEnt rmonMibModule;

            /** Conformance information*/
            public final RmonCompliancesEnt rmonCompliances;

            public final RmonGroupsEnt rmonGroups;

            private RmonConformanceEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
            {
                super(mib, parent, "rmonConformance", "1.3.6.1.2.1.16.20", false, false, false, false);
                this.rmonMibModule = new RmonMibModuleEnt(mib, this);
                this.rmonCompliances = new RmonCompliancesEnt(mib, this);
                this.rmonGroups = new RmonGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rmonMibModule,
                    this.rmonCompliances,
                    this.rmonGroups
                };
            }
            public static final class RmonMibModuleEnt extends MIBEntry<RMONMIBDef>
            {
                private RmonMibModuleEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "rmonMibModule", "1.3.6.1.2.1.16.20.8", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RmonCompliancesEnt extends MIBEntry<RMONMIBDef>
            {
                /** Compliance Statements*/
                public final RmonComplianceEnt rmonCompliance;

                private RmonCompliancesEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "rmonCompliances", "1.3.6.1.2.1.16.20.9", false, false, false, false);
                    this.rmonCompliance = new RmonComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rmonCompliance
                    };
                }
                public static final class RmonComplianceEnt extends MIBEntry<RMONMIBDef>
                {
                    private RmonComplianceEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "rmonCompliance", "1.3.6.1.2.1.16.20.9.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class RmonGroupsEnt extends MIBEntry<RMONMIBDef>
            {
                public final RmonEtherStatsGroupEnt rmonEtherStatsGroup;

                public final RmonHistoryControlGroupEnt rmonHistoryControlGroup;

                public final RmonEthernetHistoryGroupEnt rmonEthernetHistoryGroup;

                public final RmonAlarmGroupEnt rmonAlarmGroup;

                public final RmonHostGroupEnt rmonHostGroup;

                public final RmonHostTopNGroupEnt rmonHostTopNGroup;

                public final RmonMatrixGroupEnt rmonMatrixGroup;

                public final RmonFilterGroupEnt rmonFilterGroup;

                public final RmonPacketCaptureGroupEnt rmonPacketCaptureGroup;

                public final RmonEventGroupEnt rmonEventGroup;

                public final RmonNotificationGroupEnt rmonNotificationGroup;

                private RmonGroupsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "rmonGroups", "1.3.6.1.2.1.16.20.10", false, false, false, false);
                    this.rmonEtherStatsGroup = new RmonEtherStatsGroupEnt(mib, this);
                    this.rmonHistoryControlGroup = new RmonHistoryControlGroupEnt(mib, this);
                    this.rmonEthernetHistoryGroup = new RmonEthernetHistoryGroupEnt(mib, this);
                    this.rmonAlarmGroup = new RmonAlarmGroupEnt(mib, this);
                    this.rmonHostGroup = new RmonHostGroupEnt(mib, this);
                    this.rmonHostTopNGroup = new RmonHostTopNGroupEnt(mib, this);
                    this.rmonMatrixGroup = new RmonMatrixGroupEnt(mib, this);
                    this.rmonFilterGroup = new RmonFilterGroupEnt(mib, this);
                    this.rmonPacketCaptureGroup = new RmonPacketCaptureGroupEnt(mib, this);
                    this.rmonEventGroup = new RmonEventGroupEnt(mib, this);
                    this.rmonNotificationGroup = new RmonNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rmonEtherStatsGroup,
                        this.rmonHistoryControlGroup,
                        this.rmonEthernetHistoryGroup,
                        this.rmonAlarmGroup,
                        this.rmonHostGroup,
                        this.rmonHostTopNGroup,
                        this.rmonMatrixGroup,
                        this.rmonFilterGroup,
                        this.rmonPacketCaptureGroup,
                        this.rmonEventGroup,
                        this.rmonNotificationGroup
                    };
                }
                public static final class RmonEtherStatsGroupEnt extends MIBEntry<RMONMIBDef>
                {
                    private RmonEtherStatsGroupEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "rmonEtherStatsGroup", "1.3.6.1.2.1.16.20.10.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RmonHistoryControlGroupEnt extends MIBEntry<RMONMIBDef>
                {
                    private RmonHistoryControlGroupEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "rmonHistoryControlGroup", "1.3.6.1.2.1.16.20.10.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RmonEthernetHistoryGroupEnt extends MIBEntry<RMONMIBDef>
                {
                    private RmonEthernetHistoryGroupEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "rmonEthernetHistoryGroup", "1.3.6.1.2.1.16.20.10.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RmonAlarmGroupEnt extends MIBEntry<RMONMIBDef>
                {
                    private RmonAlarmGroupEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "rmonAlarmGroup", "1.3.6.1.2.1.16.20.10.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RmonHostGroupEnt extends MIBEntry<RMONMIBDef>
                {
                    private RmonHostGroupEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "rmonHostGroup", "1.3.6.1.2.1.16.20.10.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RmonHostTopNGroupEnt extends MIBEntry<RMONMIBDef>
                {
                    private RmonHostTopNGroupEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "rmonHostTopNGroup", "1.3.6.1.2.1.16.20.10.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RmonMatrixGroupEnt extends MIBEntry<RMONMIBDef>
                {
                    private RmonMatrixGroupEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "rmonMatrixGroup", "1.3.6.1.2.1.16.20.10.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RmonFilterGroupEnt extends MIBEntry<RMONMIBDef>
                {
                    private RmonFilterGroupEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "rmonFilterGroup", "1.3.6.1.2.1.16.20.10.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RmonPacketCaptureGroupEnt extends MIBEntry<RMONMIBDef>
                {
                    private RmonPacketCaptureGroupEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "rmonPacketCaptureGroup", "1.3.6.1.2.1.16.20.10.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RmonEventGroupEnt extends MIBEntry<RMONMIBDef>
                {
                    private RmonEventGroupEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "rmonEventGroup", "1.3.6.1.2.1.16.20.10.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RmonNotificationGroupEnt extends MIBEntry<RMONMIBDef>
                {
                    private RmonNotificationGroupEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "rmonNotificationGroup", "1.3.6.1.2.1.16.20.10.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class StatisticsEnt extends MIBEntry<RMONMIBDef>
        {
            /** The Ethernet Statistics GroupImplementation of the Ethernet Statistics group is optional.Consult the MODULE-COMPLIANCE macro for the authoritativeconformance information for this MIB.The ethernet statistics group contains statistics measured by theprobe for each monitored interface on this device.  Thesestatistics take the form of free running counters that start fromzero when a valid entry is created.This group currently has statistics defined only forEthernet interfaces.  Each etherStatsEntry contains statisticsfor one Ethernet interface.  The probe must create oneetherStats entry for each monitored Ethernet interfaceon the device.*/
            public final EtherStatsTableEnt etherStatsTable;

            private StatisticsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
            {
                super(mib, parent, "statistics", "1.3.6.1.2.1.16.1", false, false, false, false);
                this.etherStatsTable = new EtherStatsTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.etherStatsTable
                };
            }
            public static final class EtherStatsTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final EtherStatsEntryEnt etherStatsEntry;

                private EtherStatsTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "etherStatsTable", "1.3.6.1.2.1.16.1.1", false, true, false, false);
                    this.etherStatsEntry = new EtherStatsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.etherStatsEntry
                    };
                }
                public static final class EtherStatsEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final EtherStatsIndexEnt etherStatsIndex;

                    public final EtherStatsDataSourceEnt etherStatsDataSource;

                    public final EtherStatsDropEventsEnt etherStatsDropEvents;

                    public final EtherStatsOctetsEnt etherStatsOctets;

                    public final EtherStatsPktsEnt etherStatsPkts;

                    public final EtherStatsBroadcastPktsEnt etherStatsBroadcastPkts;

                    public final EtherStatsMulticastPktsEnt etherStatsMulticastPkts;

                    public final EtherStatsCRCAlignErrorsEnt etherStatsCRCAlignErrors;

                    public final EtherStatsUndersizePktsEnt etherStatsUndersizePkts;

                    public final EtherStatsOversizePktsEnt etherStatsOversizePkts;

                    public final EtherStatsFragmentsEnt etherStatsFragments;

                    public final EtherStatsJabbersEnt etherStatsJabbers;

                    public final EtherStatsCollisionsEnt etherStatsCollisions;

                    public final EtherStatsPkts64OctetsEnt etherStatsPkts64Octets;

                    public final EtherStatsPkts65to127OctetsEnt etherStatsPkts65to127Octets;

                    public final EtherStatsPkts128to255OctetsEnt etherStatsPkts128to255Octets;

                    public final EtherStatsPkts256to511OctetsEnt etherStatsPkts256to511Octets;

                    public final EtherStatsPkts512to1023OctetsEnt etherStatsPkts512to1023Octets;

                    public final EtherStatsPkts1024to1518OctetsEnt etherStatsPkts1024to1518Octets;

                    public final EtherStatsOwnerEnt etherStatsOwner;

                    public final EtherStatsStatusEnt etherStatsStatus;

                    private EtherStatsEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "etherStatsEntry", "1.3.6.1.2.1.16.1.1.1", false, false, false, true);
                        this.etherStatsIndex = new EtherStatsIndexEnt(mib, this);
                        this.etherStatsDataSource = new EtherStatsDataSourceEnt(mib, this);
                        this.etherStatsDropEvents = new EtherStatsDropEventsEnt(mib, this);
                        this.etherStatsOctets = new EtherStatsOctetsEnt(mib, this);
                        this.etherStatsPkts = new EtherStatsPktsEnt(mib, this);
                        this.etherStatsBroadcastPkts = new EtherStatsBroadcastPktsEnt(mib, this);
                        this.etherStatsMulticastPkts = new EtherStatsMulticastPktsEnt(mib, this);
                        this.etherStatsCRCAlignErrors = new EtherStatsCRCAlignErrorsEnt(mib, this);
                        this.etherStatsUndersizePkts = new EtherStatsUndersizePktsEnt(mib, this);
                        this.etherStatsOversizePkts = new EtherStatsOversizePktsEnt(mib, this);
                        this.etherStatsFragments = new EtherStatsFragmentsEnt(mib, this);
                        this.etherStatsJabbers = new EtherStatsJabbersEnt(mib, this);
                        this.etherStatsCollisions = new EtherStatsCollisionsEnt(mib, this);
                        this.etherStatsPkts64Octets = new EtherStatsPkts64OctetsEnt(mib, this);
                        this.etherStatsPkts65to127Octets = new EtherStatsPkts65to127OctetsEnt(mib, this);
                        this.etherStatsPkts128to255Octets = new EtherStatsPkts128to255OctetsEnt(mib, this);
                        this.etherStatsPkts256to511Octets = new EtherStatsPkts256to511OctetsEnt(mib, this);
                        this.etherStatsPkts512to1023Octets = new EtherStatsPkts512to1023OctetsEnt(mib, this);
                        this.etherStatsPkts1024to1518Octets = new EtherStatsPkts1024to1518OctetsEnt(mib, this);
                        this.etherStatsOwner = new EtherStatsOwnerEnt(mib, this);
                        this.etherStatsStatus = new EtherStatsStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.etherStatsIndex,
                            this.etherStatsDataSource,
                            this.etherStatsDropEvents,
                            this.etherStatsOctets,
                            this.etherStatsPkts,
                            this.etherStatsBroadcastPkts,
                            this.etherStatsMulticastPkts,
                            this.etherStatsCRCAlignErrors,
                            this.etherStatsUndersizePkts,
                            this.etherStatsOversizePkts,
                            this.etherStatsFragments,
                            this.etherStatsJabbers,
                            this.etherStatsCollisions,
                            this.etherStatsPkts64Octets,
                            this.etherStatsPkts65to127Octets,
                            this.etherStatsPkts128to255Octets,
                            this.etherStatsPkts256to511Octets,
                            this.etherStatsPkts512to1023Octets,
                            this.etherStatsPkts1024to1518Octets,
                            this.etherStatsOwner,
                            this.etherStatsStatus
                        };
                    }
                    public static final class EtherStatsIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsIndex", "1.3.6.1.2.1.16.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsDataSourceEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsDataSourceEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsDataSource", "1.3.6.1.2.1.16.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsDropEventsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsDropEventsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsDropEvents", "1.3.6.1.2.1.16.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsOctetsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsOctetsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsOctets", "1.3.6.1.2.1.16.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsPktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsPktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsPkts", "1.3.6.1.2.1.16.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsBroadcastPktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsBroadcastPktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsBroadcastPkts", "1.3.6.1.2.1.16.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsMulticastPktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsMulticastPktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsMulticastPkts", "1.3.6.1.2.1.16.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsCRCAlignErrorsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsCRCAlignErrorsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsCRCAlignErrors", "1.3.6.1.2.1.16.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsUndersizePktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsUndersizePktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsUndersizePkts", "1.3.6.1.2.1.16.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsOversizePktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsOversizePktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsOversizePkts", "1.3.6.1.2.1.16.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsFragmentsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsFragmentsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsFragments", "1.3.6.1.2.1.16.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsJabbersEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsJabbersEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsJabbers", "1.3.6.1.2.1.16.1.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsCollisionsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsCollisionsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsCollisions", "1.3.6.1.2.1.16.1.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsPkts64OctetsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsPkts64OctetsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsPkts64Octets", "1.3.6.1.2.1.16.1.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsPkts65to127OctetsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsPkts65to127OctetsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsPkts65to127Octets", "1.3.6.1.2.1.16.1.1.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsPkts128to255OctetsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsPkts128to255OctetsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsPkts128to255Octets", "1.3.6.1.2.1.16.1.1.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsPkts256to511OctetsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsPkts256to511OctetsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsPkts256to511Octets", "1.3.6.1.2.1.16.1.1.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsPkts512to1023OctetsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsPkts512to1023OctetsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsPkts512to1023Octets", "1.3.6.1.2.1.16.1.1.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsPkts1024to1518OctetsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsPkts1024to1518OctetsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsPkts1024to1518Octets", "1.3.6.1.2.1.16.1.1.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsOwnerEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsOwnerEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsOwner", "1.3.6.1.2.1.16.1.1.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherStatsStatusEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherStatsStatusEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherStatsStatus", "1.3.6.1.2.1.16.1.1.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class HistoryEnt extends MIBEntry<RMONMIBDef>
        {
            /** The History Control Group
Implementation of the History Control group is optional.Consult the MODULE-COMPLIANCE macro for the authoritativeconformance information for this MIB.The history control group controls the periodic statisticalsampling of data from various types of networks.  ThehistoryControlTable stores configuration entries that eachdefine an interface, polling period, and other parameters.Once samples are taken, their data is stored in an entryin a media-specific table.  Each such entry defines onesample, and is associated with the historyControlEntry thatcaused the sample to be taken.  Each counter in theetherHistoryEntry counts the same event as its similarly-namedcounterpart in the etherStatsEntry, except that each value hereis a cumulative sum during a sampling period.If the probe keeps track of the time of day, it should startthe first sample of the history at a time such thatwhen the next hour of the day begins, a sample isstarted at that instant.  This tends to make moreuser-friendly reports, and enables comparison of reportsfrom different probes that have relatively accurate timeof day.The probe is encouraged to add two history control entriesper monitored interface upon initialization that describe a shortterm and a long term polling period.  Suggested parameters are 30seconds for the short term polling period and 30 minutes forthe long term period.*/
            public final HistoryControlTableEnt historyControlTable;

            /** The Ethernet History Group
Implementation of the Ethernet History group is optional.Consult the MODULE-COMPLIANCE macro for the authoritativeconformance information for this MIB.The Ethernet History group records periodic statistical samplesfrom a network and stores them for later retrieval.Once samples are taken, their data is stored in an entryin a media-specific table.  Each such entry defines one
sample, and is associated with the historyControlEntry thatcaused the sample to be taken.  This group defines theetherHistoryTable, for Ethernet networks.*/
            public final EtherHistoryTableEnt etherHistoryTable;

            private HistoryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
            {
                super(mib, parent, "history", "1.3.6.1.2.1.16.2", false, false, false, false);
                this.historyControlTable = new HistoryControlTableEnt(mib, this);
                this.etherHistoryTable = new EtherHistoryTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.historyControlTable,
                    this.etherHistoryTable
                };
            }
            public static final class HistoryControlTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final HistoryControlEntryEnt historyControlEntry;

                private HistoryControlTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "historyControlTable", "1.3.6.1.2.1.16.2.1", false, true, false, false);
                    this.historyControlEntry = new HistoryControlEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.historyControlEntry
                    };
                }
                public static final class HistoryControlEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final HistoryControlIndexEnt historyControlIndex;

                    public final HistoryControlDataSourceEnt historyControlDataSource;

                    public final HistoryControlBucketsRequestedEnt historyControlBucketsRequested;

                    public final HistoryControlBucketsGrantedEnt historyControlBucketsGranted;

                    public final HistoryControlIntervalEnt historyControlInterval;

                    public final HistoryControlOwnerEnt historyControlOwner;

                    public final HistoryControlStatusEnt historyControlStatus;

                    private HistoryControlEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "historyControlEntry", "1.3.6.1.2.1.16.2.1.1", false, false, false, true);
                        this.historyControlIndex = new HistoryControlIndexEnt(mib, this);
                        this.historyControlDataSource = new HistoryControlDataSourceEnt(mib, this);
                        this.historyControlBucketsRequested = new HistoryControlBucketsRequestedEnt(mib, this);
                        this.historyControlBucketsGranted = new HistoryControlBucketsGrantedEnt(mib, this);
                        this.historyControlInterval = new HistoryControlIntervalEnt(mib, this);
                        this.historyControlOwner = new HistoryControlOwnerEnt(mib, this);
                        this.historyControlStatus = new HistoryControlStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.historyControlIndex,
                            this.historyControlDataSource,
                            this.historyControlBucketsRequested,
                            this.historyControlBucketsGranted,
                            this.historyControlInterval,
                            this.historyControlOwner,
                            this.historyControlStatus
                        };
                    }
                    public static final class HistoryControlIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HistoryControlIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "historyControlIndex", "1.3.6.1.2.1.16.2.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HistoryControlDataSourceEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HistoryControlDataSourceEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "historyControlDataSource", "1.3.6.1.2.1.16.2.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HistoryControlBucketsRequestedEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HistoryControlBucketsRequestedEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "historyControlBucketsRequested", "1.3.6.1.2.1.16.2.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HistoryControlBucketsGrantedEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HistoryControlBucketsGrantedEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "historyControlBucketsGranted", "1.3.6.1.2.1.16.2.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HistoryControlIntervalEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HistoryControlIntervalEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "historyControlInterval", "1.3.6.1.2.1.16.2.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HistoryControlOwnerEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HistoryControlOwnerEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "historyControlOwner", "1.3.6.1.2.1.16.2.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HistoryControlStatusEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HistoryControlStatusEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "historyControlStatus", "1.3.6.1.2.1.16.2.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class EtherHistoryTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final EtherHistoryEntryEnt etherHistoryEntry;

                private EtherHistoryTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "etherHistoryTable", "1.3.6.1.2.1.16.2.2", false, true, false, false);
                    this.etherHistoryEntry = new EtherHistoryEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.etherHistoryEntry
                    };
                }
                public static final class EtherHistoryEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final EtherHistoryIndexEnt etherHistoryIndex;

                    public final EtherHistorySampleIndexEnt etherHistorySampleIndex;

                    public final EtherHistoryIntervalStartEnt etherHistoryIntervalStart;

                    public final EtherHistoryDropEventsEnt etherHistoryDropEvents;

                    public final EtherHistoryOctetsEnt etherHistoryOctets;

                    public final EtherHistoryPktsEnt etherHistoryPkts;

                    public final EtherHistoryBroadcastPktsEnt etherHistoryBroadcastPkts;

                    public final EtherHistoryMulticastPktsEnt etherHistoryMulticastPkts;

                    public final EtherHistoryCRCAlignErrorsEnt etherHistoryCRCAlignErrors;

                    public final EtherHistoryUndersizePktsEnt etherHistoryUndersizePkts;

                    public final EtherHistoryOversizePktsEnt etherHistoryOversizePkts;

                    public final EtherHistoryFragmentsEnt etherHistoryFragments;

                    public final EtherHistoryJabbersEnt etherHistoryJabbers;

                    public final EtherHistoryCollisionsEnt etherHistoryCollisions;

                    public final EtherHistoryUtilizationEnt etherHistoryUtilization;

                    private EtherHistoryEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "etherHistoryEntry", "1.3.6.1.2.1.16.2.2.1", false, false, false, true);
                        this.etherHistoryIndex = new EtherHistoryIndexEnt(mib, this);
                        this.etherHistorySampleIndex = new EtherHistorySampleIndexEnt(mib, this);
                        this.etherHistoryIntervalStart = new EtherHistoryIntervalStartEnt(mib, this);
                        this.etherHistoryDropEvents = new EtherHistoryDropEventsEnt(mib, this);
                        this.etherHistoryOctets = new EtherHistoryOctetsEnt(mib, this);
                        this.etherHistoryPkts = new EtherHistoryPktsEnt(mib, this);
                        this.etherHistoryBroadcastPkts = new EtherHistoryBroadcastPktsEnt(mib, this);
                        this.etherHistoryMulticastPkts = new EtherHistoryMulticastPktsEnt(mib, this);
                        this.etherHistoryCRCAlignErrors = new EtherHistoryCRCAlignErrorsEnt(mib, this);
                        this.etherHistoryUndersizePkts = new EtherHistoryUndersizePktsEnt(mib, this);
                        this.etherHistoryOversizePkts = new EtherHistoryOversizePktsEnt(mib, this);
                        this.etherHistoryFragments = new EtherHistoryFragmentsEnt(mib, this);
                        this.etherHistoryJabbers = new EtherHistoryJabbersEnt(mib, this);
                        this.etherHistoryCollisions = new EtherHistoryCollisionsEnt(mib, this);
                        this.etherHistoryUtilization = new EtherHistoryUtilizationEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.etherHistoryIndex,
                            this.etherHistorySampleIndex,
                            this.etherHistoryIntervalStart,
                            this.etherHistoryDropEvents,
                            this.etherHistoryOctets,
                            this.etherHistoryPkts,
                            this.etherHistoryBroadcastPkts,
                            this.etherHistoryMulticastPkts,
                            this.etherHistoryCRCAlignErrors,
                            this.etherHistoryUndersizePkts,
                            this.etherHistoryOversizePkts,
                            this.etherHistoryFragments,
                            this.etherHistoryJabbers,
                            this.etherHistoryCollisions,
                            this.etherHistoryUtilization
                        };
                    }
                    public static final class EtherHistoryIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherHistoryIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherHistoryIndex", "1.3.6.1.2.1.16.2.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherHistorySampleIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherHistorySampleIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherHistorySampleIndex", "1.3.6.1.2.1.16.2.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherHistoryIntervalStartEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherHistoryIntervalStartEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherHistoryIntervalStart", "1.3.6.1.2.1.16.2.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherHistoryDropEventsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherHistoryDropEventsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherHistoryDropEvents", "1.3.6.1.2.1.16.2.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherHistoryOctetsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherHistoryOctetsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherHistoryOctets", "1.3.6.1.2.1.16.2.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherHistoryPktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherHistoryPktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherHistoryPkts", "1.3.6.1.2.1.16.2.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherHistoryBroadcastPktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherHistoryBroadcastPktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherHistoryBroadcastPkts", "1.3.6.1.2.1.16.2.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherHistoryMulticastPktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherHistoryMulticastPktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherHistoryMulticastPkts", "1.3.6.1.2.1.16.2.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherHistoryCRCAlignErrorsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherHistoryCRCAlignErrorsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherHistoryCRCAlignErrors", "1.3.6.1.2.1.16.2.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherHistoryUndersizePktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherHistoryUndersizePktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherHistoryUndersizePkts", "1.3.6.1.2.1.16.2.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherHistoryOversizePktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherHistoryOversizePktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherHistoryOversizePkts", "1.3.6.1.2.1.16.2.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherHistoryFragmentsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherHistoryFragmentsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherHistoryFragments", "1.3.6.1.2.1.16.2.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherHistoryJabbersEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherHistoryJabbersEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherHistoryJabbers", "1.3.6.1.2.1.16.2.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherHistoryCollisionsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherHistoryCollisionsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherHistoryCollisions", "1.3.6.1.2.1.16.2.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EtherHistoryUtilizationEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EtherHistoryUtilizationEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "etherHistoryUtilization", "1.3.6.1.2.1.16.2.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class AlarmEnt extends MIBEntry<RMONMIBDef>
        {
            /** The Alarm Group
Implementation of the Alarm group is optional. The Alarm Grouprequires the implementation of the Event group.Consult the MODULE-COMPLIANCE macro for the authoritativeconformance information for this MIB.The Alarm group periodically takes statistical samples fromvariables in the probe and compares them to thresholds that havebeen configured.  The alarm table stores configurationentries that each define a variable, polling period, andthreshold parameters.  If a sample is found to cross thethreshold values, an event is generated.  Only variables thatresolve to an ASN.1 primitive type of INTEGER (INTEGER, Integer32,Counter32, Counter64, Gauge32, or TimeTicks) may be monitored inthis way.
This function has a hysteresis mechanism to limit the generationof events.  This mechanism generates one event as a thresholdis crossed in the appropriate direction.  No more events aregenerated for that threshold until the opposite threshold iscrossed.In the case of a sampling a deltaValue, a probe may implementthis mechanism with more precision if it takes a delta sampletwice per period, each time comparing the sum of the latest twosamples to the threshold.  This allows the detection of thresholdcrossings that span the sampling boundary.  Note that this doesnot require any special configuration of the threshold value.It is suggested that probes implement this more precise algorithm.*/
            public final AlarmTableEnt alarmTable;

            private AlarmEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
            {
                super(mib, parent, "alarm", "1.3.6.1.2.1.16.3", false, false, false, false);
                this.alarmTable = new AlarmTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.alarmTable
                };
            }
            public static final class AlarmTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final AlarmEntryEnt alarmEntry;

                private AlarmTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "alarmTable", "1.3.6.1.2.1.16.3.1", false, true, false, false);
                    this.alarmEntry = new AlarmEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.alarmEntry
                    };
                }
                public static final class AlarmEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final AlarmIndexEnt alarmIndex;

                    public final AlarmIntervalEnt alarmInterval;

                    public final AlarmVariableEnt alarmVariable;

                    public final AlarmSampleTypeEnt alarmSampleType;

                    public final AlarmValueEnt alarmValue;

                    public final AlarmStartupAlarmEnt alarmStartupAlarm;

                    public final AlarmRisingThresholdEnt alarmRisingThreshold;

                    public final AlarmFallingThresholdEnt alarmFallingThreshold;

                    public final AlarmRisingEventIndexEnt alarmRisingEventIndex;

                    public final AlarmFallingEventIndexEnt alarmFallingEventIndex;

                    public final AlarmOwnerEnt alarmOwner;

                    public final AlarmStatusEnt alarmStatus;

                    private AlarmEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "alarmEntry", "1.3.6.1.2.1.16.3.1.1", false, false, false, true);
                        this.alarmIndex = new AlarmIndexEnt(mib, this);
                        this.alarmInterval = new AlarmIntervalEnt(mib, this);
                        this.alarmVariable = new AlarmVariableEnt(mib, this);
                        this.alarmSampleType = new AlarmSampleTypeEnt(mib, this);
                        this.alarmValue = new AlarmValueEnt(mib, this);
                        this.alarmStartupAlarm = new AlarmStartupAlarmEnt(mib, this);
                        this.alarmRisingThreshold = new AlarmRisingThresholdEnt(mib, this);
                        this.alarmFallingThreshold = new AlarmFallingThresholdEnt(mib, this);
                        this.alarmRisingEventIndex = new AlarmRisingEventIndexEnt(mib, this);
                        this.alarmFallingEventIndex = new AlarmFallingEventIndexEnt(mib, this);
                        this.alarmOwner = new AlarmOwnerEnt(mib, this);
                        this.alarmStatus = new AlarmStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.alarmIndex,
                            this.alarmInterval,
                            this.alarmVariable,
                            this.alarmSampleType,
                            this.alarmValue,
                            this.alarmStartupAlarm,
                            this.alarmRisingThreshold,
                            this.alarmFallingThreshold,
                            this.alarmRisingEventIndex,
                            this.alarmFallingEventIndex,
                            this.alarmOwner,
                            this.alarmStatus
                        };
                    }
                    public static final class AlarmIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private AlarmIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "alarmIndex", "1.3.6.1.2.1.16.3.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AlarmIntervalEnt extends MIBEntry<RMONMIBDef>
                    {
                        private AlarmIntervalEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "alarmInterval", "1.3.6.1.2.1.16.3.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AlarmVariableEnt extends MIBEntry<RMONMIBDef>
                    {
                        private AlarmVariableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "alarmVariable", "1.3.6.1.2.1.16.3.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AlarmSampleTypeEnt extends MIBEntry<RMONMIBDef>
                    {
                        private AlarmSampleTypeEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "alarmSampleType", "1.3.6.1.2.1.16.3.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AlarmValueEnt extends MIBEntry<RMONMIBDef>
                    {
                        private AlarmValueEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "alarmValue", "1.3.6.1.2.1.16.3.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AlarmStartupAlarmEnt extends MIBEntry<RMONMIBDef>
                    {
                        private AlarmStartupAlarmEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "alarmStartupAlarm", "1.3.6.1.2.1.16.3.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AlarmRisingThresholdEnt extends MIBEntry<RMONMIBDef>
                    {
                        private AlarmRisingThresholdEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "alarmRisingThreshold", "1.3.6.1.2.1.16.3.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AlarmFallingThresholdEnt extends MIBEntry<RMONMIBDef>
                    {
                        private AlarmFallingThresholdEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "alarmFallingThreshold", "1.3.6.1.2.1.16.3.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AlarmRisingEventIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private AlarmRisingEventIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "alarmRisingEventIndex", "1.3.6.1.2.1.16.3.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AlarmFallingEventIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private AlarmFallingEventIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "alarmFallingEventIndex", "1.3.6.1.2.1.16.3.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AlarmOwnerEnt extends MIBEntry<RMONMIBDef>
                    {
                        private AlarmOwnerEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "alarmOwner", "1.3.6.1.2.1.16.3.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AlarmStatusEnt extends MIBEntry<RMONMIBDef>
                    {
                        private AlarmStatusEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "alarmStatus", "1.3.6.1.2.1.16.3.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class HostsEnt extends MIBEntry<RMONMIBDef>
        {
            /** The Host Group
Implementation of the Host group is optional.Consult the MODULE-COMPLIANCE macro for the authoritativeconformance information for this MIB.The host group discovers new hosts on the network bykeeping a list of source and destination MAC Addresses seenin good packets.  For each of these addresses, the host group
keeps a set of statistics.  The hostControlTable controlswhich interfaces this function is performed on, and containssome information about the process.  On behalf of eachhostControlEntry, data is collected on an interface and placedin both the hostTable and the hostTimeTable.  If themonitoring device finds itself short of resources, it maydelete entries as needed.  It is suggested that the devicedelete the least recently used entries first.
The hostTable contains entries for each address discovered ona particular interface.  Each entry contains statisticaldata about that host.  This table is indexed by theMAC address of the host, through which a random accessmay be achieved.
The hostTimeTable contains data in the same format as thehostTable, and must contain the same set of hosts, but isindexed using hostTimeCreationOrder rather than hostAddress.The hostTimeCreationOrder is an integer which reflectsthe relative order in which a particular entry was discoveredand thus inserted into the table.  As this order, and thusthe index, is among those entries currently in the table,the index for a particular entry may change if an(earlier) entry is deleted.  Thus the association betweenhostTimeCreationOrder and hostTimeEntry may be broken atany time.
The hostTimeTable has two important uses.  The first is thefast download of this potentially large table.  Because theindex of this table runs from 1 to the size of the table,inclusive, its values are predictable.  This allows veryefficient packing of variables into SNMP PDU's and allowsa table transfer to have multiple packets outstanding.These benefits increase transfer rates tremendously.
The second use of the hostTimeTable is the efficient discoveryby the management station of new entries added to the table.After the management station has downloaded the entire table,it knows that new entries will be added immediately after theend of the current table.  It can thus detect new entries thereand retrieve them easily.
Because the association between hostTimeCreationOrder andhostTimeEntry may be broken at any time, the managementstation must monitor the related hostControlLastDeleteTimeobject.  When the management station thus detects a deletion,it must assume that any such associations have been broken,and invalidate any it has stored locally.  This includes
restarting any download of the hostTimeTable that may have beenin progress, as well as rediscovering the end of thehostTimeTable so that it may detect new entries.  If themanagement station does not detect the broken association,it may continue to refer to a particular host by itscreationOrder while unwittingly retrieving the data associatedwith another host entirely.  If this happens while downloadingthe host table, the management station may fail to downloadall of the entries in the table.*/
            public final HostControlTableEnt hostControlTable;

            public final HostTableEnt hostTable;

            /** host Time Table*/
            public final HostTimeTableEnt hostTimeTable;

            private HostsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
            {
                super(mib, parent, "hosts", "1.3.6.1.2.1.16.4", false, false, false, false);
                this.hostControlTable = new HostControlTableEnt(mib, this);
                this.hostTable = new HostTableEnt(mib, this);
                this.hostTimeTable = new HostTimeTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hostControlTable,
                    this.hostTable,
                    this.hostTimeTable
                };
            }
            public static final class HostControlTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final HostControlEntryEnt hostControlEntry;

                private HostControlTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "hostControlTable", "1.3.6.1.2.1.16.4.1", false, true, false, false);
                    this.hostControlEntry = new HostControlEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hostControlEntry
                    };
                }
                public static final class HostControlEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final HostControlIndexEnt hostControlIndex;

                    public final HostControlDataSourceEnt hostControlDataSource;

                    public final HostControlTableSizeEnt hostControlTableSize;

                    public final HostControlLastDeleteTimeEnt hostControlLastDeleteTime;

                    public final HostControlOwnerEnt hostControlOwner;

                    public final HostControlStatusEnt hostControlStatus;

                    private HostControlEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "hostControlEntry", "1.3.6.1.2.1.16.4.1.1", false, false, false, true);
                        this.hostControlIndex = new HostControlIndexEnt(mib, this);
                        this.hostControlDataSource = new HostControlDataSourceEnt(mib, this);
                        this.hostControlTableSize = new HostControlTableSizeEnt(mib, this);
                        this.hostControlLastDeleteTime = new HostControlLastDeleteTimeEnt(mib, this);
                        this.hostControlOwner = new HostControlOwnerEnt(mib, this);
                        this.hostControlStatus = new HostControlStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hostControlIndex,
                            this.hostControlDataSource,
                            this.hostControlTableSize,
                            this.hostControlLastDeleteTime,
                            this.hostControlOwner,
                            this.hostControlStatus
                        };
                    }
                    public static final class HostControlIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostControlIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostControlIndex", "1.3.6.1.2.1.16.4.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostControlDataSourceEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostControlDataSourceEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostControlDataSource", "1.3.6.1.2.1.16.4.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostControlTableSizeEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostControlTableSizeEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostControlTableSize", "1.3.6.1.2.1.16.4.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostControlLastDeleteTimeEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostControlLastDeleteTimeEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostControlLastDeleteTime", "1.3.6.1.2.1.16.4.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostControlOwnerEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostControlOwnerEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostControlOwner", "1.3.6.1.2.1.16.4.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostControlStatusEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostControlStatusEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostControlStatus", "1.3.6.1.2.1.16.4.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class HostTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final HostEntryEnt hostEntry;

                private HostTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "hostTable", "1.3.6.1.2.1.16.4.2", false, true, false, false);
                    this.hostEntry = new HostEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hostEntry
                    };
                }
                public static final class HostEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final HostAddressEnt hostAddress;

                    public final HostCreationOrderEnt hostCreationOrder;

                    public final HostIndexEnt hostIndex;

                    public final HostInPktsEnt hostInPkts;

                    public final HostOutPktsEnt hostOutPkts;

                    public final HostInOctetsEnt hostInOctets;

                    public final HostOutOctetsEnt hostOutOctets;

                    public final HostOutErrorsEnt hostOutErrors;

                    public final HostOutBroadcastPktsEnt hostOutBroadcastPkts;

                    public final HostOutMulticastPktsEnt hostOutMulticastPkts;

                    private HostEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "hostEntry", "1.3.6.1.2.1.16.4.2.1", false, false, false, true);
                        this.hostAddress = new HostAddressEnt(mib, this);
                        this.hostCreationOrder = new HostCreationOrderEnt(mib, this);
                        this.hostIndex = new HostIndexEnt(mib, this);
                        this.hostInPkts = new HostInPktsEnt(mib, this);
                        this.hostOutPkts = new HostOutPktsEnt(mib, this);
                        this.hostInOctets = new HostInOctetsEnt(mib, this);
                        this.hostOutOctets = new HostOutOctetsEnt(mib, this);
                        this.hostOutErrors = new HostOutErrorsEnt(mib, this);
                        this.hostOutBroadcastPkts = new HostOutBroadcastPktsEnt(mib, this);
                        this.hostOutMulticastPkts = new HostOutMulticastPktsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hostAddress,
                            this.hostCreationOrder,
                            this.hostIndex,
                            this.hostInPkts,
                            this.hostOutPkts,
                            this.hostInOctets,
                            this.hostOutOctets,
                            this.hostOutErrors,
                            this.hostOutBroadcastPkts,
                            this.hostOutMulticastPkts
                        };
                    }
                    public static final class HostAddressEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostAddressEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostAddress", "1.3.6.1.2.1.16.4.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostCreationOrderEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostCreationOrderEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostCreationOrder", "1.3.6.1.2.1.16.4.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostIndex", "1.3.6.1.2.1.16.4.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostInPktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostInPktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostInPkts", "1.3.6.1.2.1.16.4.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostOutPktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostOutPktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostOutPkts", "1.3.6.1.2.1.16.4.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostInOctetsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostInOctetsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostInOctets", "1.3.6.1.2.1.16.4.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostOutOctetsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostOutOctetsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostOutOctets", "1.3.6.1.2.1.16.4.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostOutErrorsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostOutErrorsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostOutErrors", "1.3.6.1.2.1.16.4.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostOutBroadcastPktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostOutBroadcastPktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostOutBroadcastPkts", "1.3.6.1.2.1.16.4.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostOutMulticastPktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostOutMulticastPktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostOutMulticastPkts", "1.3.6.1.2.1.16.4.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class HostTimeTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final HostTimeEntryEnt hostTimeEntry;

                private HostTimeTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "hostTimeTable", "1.3.6.1.2.1.16.4.3", false, true, false, false);
                    this.hostTimeEntry = new HostTimeEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hostTimeEntry
                    };
                }
                public static final class HostTimeEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final HostTimeAddressEnt hostTimeAddress;

                    public final HostTimeCreationOrderEnt hostTimeCreationOrder;

                    public final HostTimeIndexEnt hostTimeIndex;

                    public final HostTimeInPktsEnt hostTimeInPkts;

                    public final HostTimeOutPktsEnt hostTimeOutPkts;

                    public final HostTimeInOctetsEnt hostTimeInOctets;

                    public final HostTimeOutOctetsEnt hostTimeOutOctets;

                    public final HostTimeOutErrorsEnt hostTimeOutErrors;

                    public final HostTimeOutBroadcastPktsEnt hostTimeOutBroadcastPkts;

                    public final HostTimeOutMulticastPktsEnt hostTimeOutMulticastPkts;

                    private HostTimeEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "hostTimeEntry", "1.3.6.1.2.1.16.4.3.1", false, false, false, true);
                        this.hostTimeAddress = new HostTimeAddressEnt(mib, this);
                        this.hostTimeCreationOrder = new HostTimeCreationOrderEnt(mib, this);
                        this.hostTimeIndex = new HostTimeIndexEnt(mib, this);
                        this.hostTimeInPkts = new HostTimeInPktsEnt(mib, this);
                        this.hostTimeOutPkts = new HostTimeOutPktsEnt(mib, this);
                        this.hostTimeInOctets = new HostTimeInOctetsEnt(mib, this);
                        this.hostTimeOutOctets = new HostTimeOutOctetsEnt(mib, this);
                        this.hostTimeOutErrors = new HostTimeOutErrorsEnt(mib, this);
                        this.hostTimeOutBroadcastPkts = new HostTimeOutBroadcastPktsEnt(mib, this);
                        this.hostTimeOutMulticastPkts = new HostTimeOutMulticastPktsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hostTimeAddress,
                            this.hostTimeCreationOrder,
                            this.hostTimeIndex,
                            this.hostTimeInPkts,
                            this.hostTimeOutPkts,
                            this.hostTimeInOctets,
                            this.hostTimeOutOctets,
                            this.hostTimeOutErrors,
                            this.hostTimeOutBroadcastPkts,
                            this.hostTimeOutMulticastPkts
                        };
                    }
                    public static final class HostTimeAddressEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTimeAddressEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTimeAddress", "1.3.6.1.2.1.16.4.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTimeCreationOrderEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTimeCreationOrderEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTimeCreationOrder", "1.3.6.1.2.1.16.4.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTimeIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTimeIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTimeIndex", "1.3.6.1.2.1.16.4.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTimeInPktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTimeInPktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTimeInPkts", "1.3.6.1.2.1.16.4.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTimeOutPktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTimeOutPktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTimeOutPkts", "1.3.6.1.2.1.16.4.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTimeInOctetsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTimeInOctetsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTimeInOctets", "1.3.6.1.2.1.16.4.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTimeOutOctetsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTimeOutOctetsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTimeOutOctets", "1.3.6.1.2.1.16.4.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTimeOutErrorsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTimeOutErrorsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTimeOutErrors", "1.3.6.1.2.1.16.4.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTimeOutBroadcastPktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTimeOutBroadcastPktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTimeOutBroadcastPkts", "1.3.6.1.2.1.16.4.3.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTimeOutMulticastPktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTimeOutMulticastPktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTimeOutMulticastPkts", "1.3.6.1.2.1.16.4.3.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class HostTopNEnt extends MIBEntry<RMONMIBDef>
        {
            /** The Host Top "N" Group
Implementation of the Host Top N group is optional. The Host Top Ngroup requires the implementation of the host group.Consult the MODULE-COMPLIANCE macro for the authoritativeconformance information for this MIB.The Host Top N group is used to prepare reports that describethe hosts that top a list ordered by one of their statistics.The available statistics are samples of one of theirbase statistics, over an interval specified by the managementstation.  Thus, these statistics are rate based.  The managementstation also selects how many such hosts are reported.
The hostTopNControlTable is used to initiate the generation ofsuch a report.  The management station may select the parametersof such a report, such as which interface, which statistic,how many hosts, and the start and stop times of the sampling.When the report is prepared, entries are created in thehostTopNTable associated with the relevant hostTopNControlEntry.These entries are static for each report after it has beenprepared.*/
            public final HostTopNControlTableEnt hostTopNControlTable;

            public final HostTopNTableEnt hostTopNTable;

            private HostTopNEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
            {
                super(mib, parent, "hostTopN", "1.3.6.1.2.1.16.5", false, false, false, false);
                this.hostTopNControlTable = new HostTopNControlTableEnt(mib, this);
                this.hostTopNTable = new HostTopNTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hostTopNControlTable,
                    this.hostTopNTable
                };
            }
            public static final class HostTopNControlTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final HostTopNControlEntryEnt hostTopNControlEntry;

                private HostTopNControlTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "hostTopNControlTable", "1.3.6.1.2.1.16.5.1", false, true, false, false);
                    this.hostTopNControlEntry = new HostTopNControlEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hostTopNControlEntry
                    };
                }
                public static final class HostTopNControlEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final HostTopNControlIndexEnt hostTopNControlIndex;

                    public final HostTopNHostIndexEnt hostTopNHostIndex;

                    public final HostTopNRateBaseEnt hostTopNRateBase;

                    public final HostTopNTimeRemainingEnt hostTopNTimeRemaining;

                    public final HostTopNDurationEnt hostTopNDuration;

                    public final HostTopNRequestedSizeEnt hostTopNRequestedSize;

                    public final HostTopNGrantedSizeEnt hostTopNGrantedSize;

                    public final HostTopNStartTimeEnt hostTopNStartTime;

                    public final HostTopNOwnerEnt hostTopNOwner;

                    public final HostTopNStatusEnt hostTopNStatus;

                    private HostTopNControlEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "hostTopNControlEntry", "1.3.6.1.2.1.16.5.1.1", false, false, false, true);
                        this.hostTopNControlIndex = new HostTopNControlIndexEnt(mib, this);
                        this.hostTopNHostIndex = new HostTopNHostIndexEnt(mib, this);
                        this.hostTopNRateBase = new HostTopNRateBaseEnt(mib, this);
                        this.hostTopNTimeRemaining = new HostTopNTimeRemainingEnt(mib, this);
                        this.hostTopNDuration = new HostTopNDurationEnt(mib, this);
                        this.hostTopNRequestedSize = new HostTopNRequestedSizeEnt(mib, this);
                        this.hostTopNGrantedSize = new HostTopNGrantedSizeEnt(mib, this);
                        this.hostTopNStartTime = new HostTopNStartTimeEnt(mib, this);
                        this.hostTopNOwner = new HostTopNOwnerEnt(mib, this);
                        this.hostTopNStatus = new HostTopNStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hostTopNControlIndex,
                            this.hostTopNHostIndex,
                            this.hostTopNRateBase,
                            this.hostTopNTimeRemaining,
                            this.hostTopNDuration,
                            this.hostTopNRequestedSize,
                            this.hostTopNGrantedSize,
                            this.hostTopNStartTime,
                            this.hostTopNOwner,
                            this.hostTopNStatus
                        };
                    }
                    public static final class HostTopNControlIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTopNControlIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTopNControlIndex", "1.3.6.1.2.1.16.5.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTopNHostIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTopNHostIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTopNHostIndex", "1.3.6.1.2.1.16.5.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTopNRateBaseEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTopNRateBaseEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTopNRateBase", "1.3.6.1.2.1.16.5.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTopNTimeRemainingEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTopNTimeRemainingEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTopNTimeRemaining", "1.3.6.1.2.1.16.5.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTopNDurationEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTopNDurationEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTopNDuration", "1.3.6.1.2.1.16.5.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTopNRequestedSizeEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTopNRequestedSizeEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTopNRequestedSize", "1.3.6.1.2.1.16.5.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTopNGrantedSizeEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTopNGrantedSizeEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTopNGrantedSize", "1.3.6.1.2.1.16.5.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTopNStartTimeEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTopNStartTimeEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTopNStartTime", "1.3.6.1.2.1.16.5.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTopNOwnerEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTopNOwnerEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTopNOwner", "1.3.6.1.2.1.16.5.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTopNStatusEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTopNStatusEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTopNStatus", "1.3.6.1.2.1.16.5.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class HostTopNTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final HostTopNEntryEnt hostTopNEntry;

                private HostTopNTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "hostTopNTable", "1.3.6.1.2.1.16.5.2", false, true, false, false);
                    this.hostTopNEntry = new HostTopNEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hostTopNEntry
                    };
                }
                public static final class HostTopNEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final HostTopNReportEnt hostTopNReport;

                    public final HostTopNIndexEnt hostTopNIndex;

                    public final HostTopNAddressEnt hostTopNAddress;

                    public final HostTopNRateEnt hostTopNRate;

                    private HostTopNEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "hostTopNEntry", "1.3.6.1.2.1.16.5.2.1", false, false, false, true);
                        this.hostTopNReport = new HostTopNReportEnt(mib, this);
                        this.hostTopNIndex = new HostTopNIndexEnt(mib, this);
                        this.hostTopNAddress = new HostTopNAddressEnt(mib, this);
                        this.hostTopNRate = new HostTopNRateEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hostTopNReport,
                            this.hostTopNIndex,
                            this.hostTopNAddress,
                            this.hostTopNRate
                        };
                    }
                    public static final class HostTopNReportEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTopNReportEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTopNReport", "1.3.6.1.2.1.16.5.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTopNIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTopNIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTopNIndex", "1.3.6.1.2.1.16.5.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTopNAddressEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTopNAddressEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTopNAddress", "1.3.6.1.2.1.16.5.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HostTopNRateEnt extends MIBEntry<RMONMIBDef>
                    {
                        private HostTopNRateEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "hostTopNRate", "1.3.6.1.2.1.16.5.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class MatrixEnt extends MIBEntry<RMONMIBDef>
        {
            /** The Matrix Group
Implementation of the Matrix group is optional.Consult the MODULE-COMPLIANCE macro for the authoritativeconformance information for this MIB.The Matrix group consists of the matrixControlTable, matrixSDTableand the matrixDSTable.  These tables store statistics for aparticular conversation between two addresses.  As the devicedetects a new conversation, including those to a non-unicastaddress, it creates a new entry in both of the matrix tables.It must only create new entries based on informationreceived in good packets.  If the monitoring device findsitself short of resources, it may delete entries as needed.It is suggested that the device delete the least recently usedentries first.*/
            public final MatrixControlTableEnt matrixControlTable;

            public final MatrixSDTableEnt matrixSDTable;

            /** Traffic matrix tables from destination to source*/
            public final MatrixDSTableEnt matrixDSTable;

            private MatrixEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
            {
                super(mib, parent, "matrix", "1.3.6.1.2.1.16.6", false, false, false, false);
                this.matrixControlTable = new MatrixControlTableEnt(mib, this);
                this.matrixSDTable = new MatrixSDTableEnt(mib, this);
                this.matrixDSTable = new MatrixDSTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.matrixControlTable,
                    this.matrixSDTable,
                    this.matrixDSTable
                };
            }
            public static final class MatrixControlTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final MatrixControlEntryEnt matrixControlEntry;

                private MatrixControlTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "matrixControlTable", "1.3.6.1.2.1.16.6.1", false, true, false, false);
                    this.matrixControlEntry = new MatrixControlEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.matrixControlEntry
                    };
                }
                public static final class MatrixControlEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final MatrixControlIndexEnt matrixControlIndex;

                    public final MatrixControlDataSourceEnt matrixControlDataSource;

                    public final MatrixControlTableSizeEnt matrixControlTableSize;

                    public final MatrixControlLastDeleteTimeEnt matrixControlLastDeleteTime;

                    public final MatrixControlOwnerEnt matrixControlOwner;

                    public final MatrixControlStatusEnt matrixControlStatus;

                    private MatrixControlEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "matrixControlEntry", "1.3.6.1.2.1.16.6.1.1", false, false, false, true);
                        this.matrixControlIndex = new MatrixControlIndexEnt(mib, this);
                        this.matrixControlDataSource = new MatrixControlDataSourceEnt(mib, this);
                        this.matrixControlTableSize = new MatrixControlTableSizeEnt(mib, this);
                        this.matrixControlLastDeleteTime = new MatrixControlLastDeleteTimeEnt(mib, this);
                        this.matrixControlOwner = new MatrixControlOwnerEnt(mib, this);
                        this.matrixControlStatus = new MatrixControlStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.matrixControlIndex,
                            this.matrixControlDataSource,
                            this.matrixControlTableSize,
                            this.matrixControlLastDeleteTime,
                            this.matrixControlOwner,
                            this.matrixControlStatus
                        };
                    }
                    public static final class MatrixControlIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixControlIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixControlIndex", "1.3.6.1.2.1.16.6.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MatrixControlDataSourceEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixControlDataSourceEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixControlDataSource", "1.3.6.1.2.1.16.6.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MatrixControlTableSizeEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixControlTableSizeEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixControlTableSize", "1.3.6.1.2.1.16.6.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MatrixControlLastDeleteTimeEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixControlLastDeleteTimeEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixControlLastDeleteTime", "1.3.6.1.2.1.16.6.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MatrixControlOwnerEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixControlOwnerEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixControlOwner", "1.3.6.1.2.1.16.6.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MatrixControlStatusEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixControlStatusEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixControlStatus", "1.3.6.1.2.1.16.6.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MatrixSDTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final MatrixSDEntryEnt matrixSDEntry;

                private MatrixSDTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "matrixSDTable", "1.3.6.1.2.1.16.6.2", false, true, false, false);
                    this.matrixSDEntry = new MatrixSDEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.matrixSDEntry
                    };
                }
                public static final class MatrixSDEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final MatrixSDSourceAddressEnt matrixSDSourceAddress;

                    public final MatrixSDDestAddressEnt matrixSDDestAddress;

                    public final MatrixSDIndexEnt matrixSDIndex;

                    public final MatrixSDPktsEnt matrixSDPkts;

                    public final MatrixSDOctetsEnt matrixSDOctets;

                    public final MatrixSDErrorsEnt matrixSDErrors;

                    private MatrixSDEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "matrixSDEntry", "1.3.6.1.2.1.16.6.2.1", false, false, false, true);
                        this.matrixSDSourceAddress = new MatrixSDSourceAddressEnt(mib, this);
                        this.matrixSDDestAddress = new MatrixSDDestAddressEnt(mib, this);
                        this.matrixSDIndex = new MatrixSDIndexEnt(mib, this);
                        this.matrixSDPkts = new MatrixSDPktsEnt(mib, this);
                        this.matrixSDOctets = new MatrixSDOctetsEnt(mib, this);
                        this.matrixSDErrors = new MatrixSDErrorsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.matrixSDSourceAddress,
                            this.matrixSDDestAddress,
                            this.matrixSDIndex,
                            this.matrixSDPkts,
                            this.matrixSDOctets,
                            this.matrixSDErrors
                        };
                    }
                    public static final class MatrixSDSourceAddressEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixSDSourceAddressEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixSDSourceAddress", "1.3.6.1.2.1.16.6.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MatrixSDDestAddressEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixSDDestAddressEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixSDDestAddress", "1.3.6.1.2.1.16.6.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MatrixSDIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixSDIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixSDIndex", "1.3.6.1.2.1.16.6.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MatrixSDPktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixSDPktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixSDPkts", "1.3.6.1.2.1.16.6.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MatrixSDOctetsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixSDOctetsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixSDOctets", "1.3.6.1.2.1.16.6.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MatrixSDErrorsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixSDErrorsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixSDErrors", "1.3.6.1.2.1.16.6.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MatrixDSTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final MatrixDSEntryEnt matrixDSEntry;

                private MatrixDSTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "matrixDSTable", "1.3.6.1.2.1.16.6.3", false, true, false, false);
                    this.matrixDSEntry = new MatrixDSEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.matrixDSEntry
                    };
                }
                public static final class MatrixDSEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final MatrixDSSourceAddressEnt matrixDSSourceAddress;

                    public final MatrixDSDestAddressEnt matrixDSDestAddress;

                    public final MatrixDSIndexEnt matrixDSIndex;

                    public final MatrixDSPktsEnt matrixDSPkts;

                    public final MatrixDSOctetsEnt matrixDSOctets;

                    public final MatrixDSErrorsEnt matrixDSErrors;

                    private MatrixDSEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "matrixDSEntry", "1.3.6.1.2.1.16.6.3.1", false, false, false, true);
                        this.matrixDSSourceAddress = new MatrixDSSourceAddressEnt(mib, this);
                        this.matrixDSDestAddress = new MatrixDSDestAddressEnt(mib, this);
                        this.matrixDSIndex = new MatrixDSIndexEnt(mib, this);
                        this.matrixDSPkts = new MatrixDSPktsEnt(mib, this);
                        this.matrixDSOctets = new MatrixDSOctetsEnt(mib, this);
                        this.matrixDSErrors = new MatrixDSErrorsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.matrixDSSourceAddress,
                            this.matrixDSDestAddress,
                            this.matrixDSIndex,
                            this.matrixDSPkts,
                            this.matrixDSOctets,
                            this.matrixDSErrors
                        };
                    }
                    public static final class MatrixDSSourceAddressEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixDSSourceAddressEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixDSSourceAddress", "1.3.6.1.2.1.16.6.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MatrixDSDestAddressEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixDSDestAddressEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixDSDestAddress", "1.3.6.1.2.1.16.6.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MatrixDSIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixDSIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixDSIndex", "1.3.6.1.2.1.16.6.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MatrixDSPktsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixDSPktsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixDSPkts", "1.3.6.1.2.1.16.6.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MatrixDSOctetsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixDSOctetsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixDSOctets", "1.3.6.1.2.1.16.6.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MatrixDSErrorsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private MatrixDSErrorsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "matrixDSErrors", "1.3.6.1.2.1.16.6.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class FilterEnt extends MIBEntry<RMONMIBDef>
        {
            /** The Filter Group
Implementation of the Filter group is optional.
Consult the MODULE-COMPLIANCE macro for the authoritativeconformance information for this MIB.The Filter group allows packets to be captured with anarbitrary filter expression.  A logical data andevent stream or "channel" is formed by the packetsthat match the filter expression.This filter mechanism allows the creation of an arbitrarylogical expression with which to filter packets.  Eachfilter associated with a channel is OR'ed with the others.Within a filter, any bits checked in the data and status areAND'ed with respect to other bits in the same filter.  TheNotMask also allows for checking for inequality.  Finally,the channelAcceptType object allows for inversion of thewhole equation.If a management station wishes to receive a trap to alert itthat new packets have been captured and are available fordownload, it is recommended that it set up an alarm entry thatmonitors the value of the relevant channelMatches instance.The channel can be turned on or off, and can alsogenerate events when packets pass through it.*/
            public final FilterTableEnt filterTable;

            public final ChannelTableEnt channelTable;

            private FilterEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
            {
                super(mib, parent, "filter", "1.3.6.1.2.1.16.7", false, false, false, false);
                this.filterTable = new FilterTableEnt(mib, this);
                this.channelTable = new ChannelTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.filterTable,
                    this.channelTable
                };
            }
            public static final class FilterTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final FilterEntryEnt filterEntry;

                private FilterTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "filterTable", "1.3.6.1.2.1.16.7.1", false, true, false, false);
                    this.filterEntry = new FilterEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.filterEntry
                    };
                }
                public static final class FilterEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final FilterIndexEnt filterIndex;

                    public final FilterChannelIndexEnt filterChannelIndex;

                    public final FilterPktDataOffsetEnt filterPktDataOffset;

                    public final FilterPktDataEnt filterPktData;

                    public final FilterPktDataMaskEnt filterPktDataMask;

                    public final FilterPktDataNotMaskEnt filterPktDataNotMask;

                    public final FilterPktStatusEnt filterPktStatus;

                    public final FilterPktStatusMaskEnt filterPktStatusMask;

                    public final FilterPktStatusNotMaskEnt filterPktStatusNotMask;

                    public final FilterOwnerEnt filterOwner;

                    public final FilterStatusEnt filterStatus;

                    private FilterEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "filterEntry", "1.3.6.1.2.1.16.7.1.1", false, false, false, true);
                        this.filterIndex = new FilterIndexEnt(mib, this);
                        this.filterChannelIndex = new FilterChannelIndexEnt(mib, this);
                        this.filterPktDataOffset = new FilterPktDataOffsetEnt(mib, this);
                        this.filterPktData = new FilterPktDataEnt(mib, this);
                        this.filterPktDataMask = new FilterPktDataMaskEnt(mib, this);
                        this.filterPktDataNotMask = new FilterPktDataNotMaskEnt(mib, this);
                        this.filterPktStatus = new FilterPktStatusEnt(mib, this);
                        this.filterPktStatusMask = new FilterPktStatusMaskEnt(mib, this);
                        this.filterPktStatusNotMask = new FilterPktStatusNotMaskEnt(mib, this);
                        this.filterOwner = new FilterOwnerEnt(mib, this);
                        this.filterStatus = new FilterStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.filterIndex,
                            this.filterChannelIndex,
                            this.filterPktDataOffset,
                            this.filterPktData,
                            this.filterPktDataMask,
                            this.filterPktDataNotMask,
                            this.filterPktStatus,
                            this.filterPktStatusMask,
                            this.filterPktStatusNotMask,
                            this.filterOwner,
                            this.filterStatus
                        };
                    }
                    public static final class FilterIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private FilterIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "filterIndex", "1.3.6.1.2.1.16.7.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FilterChannelIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private FilterChannelIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "filterChannelIndex", "1.3.6.1.2.1.16.7.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FilterPktDataOffsetEnt extends MIBEntry<RMONMIBDef>
                    {
                        private FilterPktDataOffsetEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "filterPktDataOffset", "1.3.6.1.2.1.16.7.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FilterPktDataEnt extends MIBEntry<RMONMIBDef>
                    {
                        private FilterPktDataEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "filterPktData", "1.3.6.1.2.1.16.7.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FilterPktDataMaskEnt extends MIBEntry<RMONMIBDef>
                    {
                        private FilterPktDataMaskEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "filterPktDataMask", "1.3.6.1.2.1.16.7.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FilterPktDataNotMaskEnt extends MIBEntry<RMONMIBDef>
                    {
                        private FilterPktDataNotMaskEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "filterPktDataNotMask", "1.3.6.1.2.1.16.7.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FilterPktStatusEnt extends MIBEntry<RMONMIBDef>
                    {
                        private FilterPktStatusEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "filterPktStatus", "1.3.6.1.2.1.16.7.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FilterPktStatusMaskEnt extends MIBEntry<RMONMIBDef>
                    {
                        private FilterPktStatusMaskEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "filterPktStatusMask", "1.3.6.1.2.1.16.7.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FilterPktStatusNotMaskEnt extends MIBEntry<RMONMIBDef>
                    {
                        private FilterPktStatusNotMaskEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "filterPktStatusNotMask", "1.3.6.1.2.1.16.7.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FilterOwnerEnt extends MIBEntry<RMONMIBDef>
                    {
                        private FilterOwnerEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "filterOwner", "1.3.6.1.2.1.16.7.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FilterStatusEnt extends MIBEntry<RMONMIBDef>
                    {
                        private FilterStatusEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "filterStatus", "1.3.6.1.2.1.16.7.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ChannelTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final ChannelEntryEnt channelEntry;

                private ChannelTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "channelTable", "1.3.6.1.2.1.16.7.2", false, true, false, false);
                    this.channelEntry = new ChannelEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.channelEntry
                    };
                }
                public static final class ChannelEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final ChannelIndexEnt channelIndex;

                    public final ChannelIfIndexEnt channelIfIndex;

                    public final ChannelAcceptTypeEnt channelAcceptType;

                    public final ChannelDataControlEnt channelDataControl;

                    public final ChannelTurnOnEventIndexEnt channelTurnOnEventIndex;

                    public final ChannelTurnOffEventIndexEnt channelTurnOffEventIndex;

                    public final ChannelEventIndexEnt channelEventIndex;

                    public final ChannelEventStatusEnt channelEventStatus;

                    public final ChannelMatchesEnt channelMatches;

                    public final ChannelDescriptionEnt channelDescription;

                    public final ChannelOwnerEnt channelOwner;

                    public final ChannelStatusEnt channelStatus;

                    private ChannelEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "channelEntry", "1.3.6.1.2.1.16.7.2.1", false, false, false, true);
                        this.channelIndex = new ChannelIndexEnt(mib, this);
                        this.channelIfIndex = new ChannelIfIndexEnt(mib, this);
                        this.channelAcceptType = new ChannelAcceptTypeEnt(mib, this);
                        this.channelDataControl = new ChannelDataControlEnt(mib, this);
                        this.channelTurnOnEventIndex = new ChannelTurnOnEventIndexEnt(mib, this);
                        this.channelTurnOffEventIndex = new ChannelTurnOffEventIndexEnt(mib, this);
                        this.channelEventIndex = new ChannelEventIndexEnt(mib, this);
                        this.channelEventStatus = new ChannelEventStatusEnt(mib, this);
                        this.channelMatches = new ChannelMatchesEnt(mib, this);
                        this.channelDescription = new ChannelDescriptionEnt(mib, this);
                        this.channelOwner = new ChannelOwnerEnt(mib, this);
                        this.channelStatus = new ChannelStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.channelIndex,
                            this.channelIfIndex,
                            this.channelAcceptType,
                            this.channelDataControl,
                            this.channelTurnOnEventIndex,
                            this.channelTurnOffEventIndex,
                            this.channelEventIndex,
                            this.channelEventStatus,
                            this.channelMatches,
                            this.channelDescription,
                            this.channelOwner,
                            this.channelStatus
                        };
                    }
                    public static final class ChannelIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private ChannelIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "channelIndex", "1.3.6.1.2.1.16.7.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ChannelIfIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private ChannelIfIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "channelIfIndex", "1.3.6.1.2.1.16.7.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ChannelAcceptTypeEnt extends MIBEntry<RMONMIBDef>
                    {
                        private ChannelAcceptTypeEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "channelAcceptType", "1.3.6.1.2.1.16.7.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ChannelDataControlEnt extends MIBEntry<RMONMIBDef>
                    {
                        private ChannelDataControlEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "channelDataControl", "1.3.6.1.2.1.16.7.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ChannelTurnOnEventIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private ChannelTurnOnEventIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "channelTurnOnEventIndex", "1.3.6.1.2.1.16.7.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ChannelTurnOffEventIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private ChannelTurnOffEventIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "channelTurnOffEventIndex", "1.3.6.1.2.1.16.7.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ChannelEventIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private ChannelEventIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "channelEventIndex", "1.3.6.1.2.1.16.7.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ChannelEventStatusEnt extends MIBEntry<RMONMIBDef>
                    {
                        private ChannelEventStatusEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "channelEventStatus", "1.3.6.1.2.1.16.7.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ChannelMatchesEnt extends MIBEntry<RMONMIBDef>
                    {
                        private ChannelMatchesEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "channelMatches", "1.3.6.1.2.1.16.7.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ChannelDescriptionEnt extends MIBEntry<RMONMIBDef>
                    {
                        private ChannelDescriptionEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "channelDescription", "1.3.6.1.2.1.16.7.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ChannelOwnerEnt extends MIBEntry<RMONMIBDef>
                    {
                        private ChannelOwnerEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "channelOwner", "1.3.6.1.2.1.16.7.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ChannelStatusEnt extends MIBEntry<RMONMIBDef>
                    {
                        private ChannelStatusEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "channelStatus", "1.3.6.1.2.1.16.7.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class CaptureEnt extends MIBEntry<RMONMIBDef>
        {
            /** The Packet Capture Group
Implementation of the Packet Capture group is optional. The PacketCapture Group requires implementation of the Filter Group.Consult the MODULE-COMPLIANCE macro for the authoritativeconformance information for this MIB.The Packet Capture group allows packets to be capturedupon a filter match.  The bufferControlTable controlsthe captured packets output from a channel that isassociated with it.  The captured packets are placedin entries in the captureBufferTable.  These entries areassociated with the bufferControlEntry on whose behalf theywere stored.*/
            public final BufferControlTableEnt bufferControlTable;

            public final CaptureBufferTableEnt captureBufferTable;

            private CaptureEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
            {
                super(mib, parent, "capture", "1.3.6.1.2.1.16.8", false, false, false, false);
                this.bufferControlTable = new BufferControlTableEnt(mib, this);
                this.captureBufferTable = new CaptureBufferTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.bufferControlTable,
                    this.captureBufferTable
                };
            }
            public static final class BufferControlTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final BufferControlEntryEnt bufferControlEntry;

                private BufferControlTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "bufferControlTable", "1.3.6.1.2.1.16.8.1", false, true, false, false);
                    this.bufferControlEntry = new BufferControlEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.bufferControlEntry
                    };
                }
                public static final class BufferControlEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final BufferControlIndexEnt bufferControlIndex;

                    public final BufferControlChannelIndexEnt bufferControlChannelIndex;

                    public final BufferControlFullStatusEnt bufferControlFullStatus;

                    public final BufferControlFullActionEnt bufferControlFullAction;

                    public final BufferControlCaptureSliceSizeEnt bufferControlCaptureSliceSize;

                    public final BufferControlDownloadSliceSizeEnt bufferControlDownloadSliceSize;

                    public final BufferControlDownloadOffsetEnt bufferControlDownloadOffset;

                    public final BufferControlMaxOctetsRequestedEnt bufferControlMaxOctetsRequested;

                    public final BufferControlMaxOctetsGrantedEnt bufferControlMaxOctetsGranted;

                    public final BufferControlCapturedPacketsEnt bufferControlCapturedPackets;

                    public final BufferControlTurnOnTimeEnt bufferControlTurnOnTime;

                    public final BufferControlOwnerEnt bufferControlOwner;

                    public final BufferControlStatusEnt bufferControlStatus;

                    private BufferControlEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "bufferControlEntry", "1.3.6.1.2.1.16.8.1.1", false, false, false, true);
                        this.bufferControlIndex = new BufferControlIndexEnt(mib, this);
                        this.bufferControlChannelIndex = new BufferControlChannelIndexEnt(mib, this);
                        this.bufferControlFullStatus = new BufferControlFullStatusEnt(mib, this);
                        this.bufferControlFullAction = new BufferControlFullActionEnt(mib, this);
                        this.bufferControlCaptureSliceSize = new BufferControlCaptureSliceSizeEnt(mib, this);
                        this.bufferControlDownloadSliceSize = new BufferControlDownloadSliceSizeEnt(mib, this);
                        this.bufferControlDownloadOffset = new BufferControlDownloadOffsetEnt(mib, this);
                        this.bufferControlMaxOctetsRequested = new BufferControlMaxOctetsRequestedEnt(mib, this);
                        this.bufferControlMaxOctetsGranted = new BufferControlMaxOctetsGrantedEnt(mib, this);
                        this.bufferControlCapturedPackets = new BufferControlCapturedPacketsEnt(mib, this);
                        this.bufferControlTurnOnTime = new BufferControlTurnOnTimeEnt(mib, this);
                        this.bufferControlOwner = new BufferControlOwnerEnt(mib, this);
                        this.bufferControlStatus = new BufferControlStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.bufferControlIndex,
                            this.bufferControlChannelIndex,
                            this.bufferControlFullStatus,
                            this.bufferControlFullAction,
                            this.bufferControlCaptureSliceSize,
                            this.bufferControlDownloadSliceSize,
                            this.bufferControlDownloadOffset,
                            this.bufferControlMaxOctetsRequested,
                            this.bufferControlMaxOctetsGranted,
                            this.bufferControlCapturedPackets,
                            this.bufferControlTurnOnTime,
                            this.bufferControlOwner,
                            this.bufferControlStatus
                        };
                    }
                    public static final class BufferControlIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private BufferControlIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "bufferControlIndex", "1.3.6.1.2.1.16.8.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BufferControlChannelIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private BufferControlChannelIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "bufferControlChannelIndex", "1.3.6.1.2.1.16.8.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BufferControlFullStatusEnt extends MIBEntry<RMONMIBDef>
                    {
                        private BufferControlFullStatusEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "bufferControlFullStatus", "1.3.6.1.2.1.16.8.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BufferControlFullActionEnt extends MIBEntry<RMONMIBDef>
                    {
                        private BufferControlFullActionEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "bufferControlFullAction", "1.3.6.1.2.1.16.8.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BufferControlCaptureSliceSizeEnt extends MIBEntry<RMONMIBDef>
                    {
                        private BufferControlCaptureSliceSizeEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "bufferControlCaptureSliceSize", "1.3.6.1.2.1.16.8.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BufferControlDownloadSliceSizeEnt extends MIBEntry<RMONMIBDef>
                    {
                        private BufferControlDownloadSliceSizeEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "bufferControlDownloadSliceSize", "1.3.6.1.2.1.16.8.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BufferControlDownloadOffsetEnt extends MIBEntry<RMONMIBDef>
                    {
                        private BufferControlDownloadOffsetEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "bufferControlDownloadOffset", "1.3.6.1.2.1.16.8.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BufferControlMaxOctetsRequestedEnt extends MIBEntry<RMONMIBDef>
                    {
                        private BufferControlMaxOctetsRequestedEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "bufferControlMaxOctetsRequested", "1.3.6.1.2.1.16.8.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BufferControlMaxOctetsGrantedEnt extends MIBEntry<RMONMIBDef>
                    {
                        private BufferControlMaxOctetsGrantedEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "bufferControlMaxOctetsGranted", "1.3.6.1.2.1.16.8.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BufferControlCapturedPacketsEnt extends MIBEntry<RMONMIBDef>
                    {
                        private BufferControlCapturedPacketsEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "bufferControlCapturedPackets", "1.3.6.1.2.1.16.8.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BufferControlTurnOnTimeEnt extends MIBEntry<RMONMIBDef>
                    {
                        private BufferControlTurnOnTimeEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "bufferControlTurnOnTime", "1.3.6.1.2.1.16.8.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BufferControlOwnerEnt extends MIBEntry<RMONMIBDef>
                    {
                        private BufferControlOwnerEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "bufferControlOwner", "1.3.6.1.2.1.16.8.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BufferControlStatusEnt extends MIBEntry<RMONMIBDef>
                    {
                        private BufferControlStatusEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "bufferControlStatus", "1.3.6.1.2.1.16.8.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class CaptureBufferTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final CaptureBufferEntryEnt captureBufferEntry;

                private CaptureBufferTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "captureBufferTable", "1.3.6.1.2.1.16.8.2", false, true, false, false);
                    this.captureBufferEntry = new CaptureBufferEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.captureBufferEntry
                    };
                }
                public static final class CaptureBufferEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final CaptureBufferControlIndexEnt captureBufferControlIndex;

                    public final CaptureBufferIndexEnt captureBufferIndex;

                    public final CaptureBufferPacketIDEnt captureBufferPacketID;

                    public final CaptureBufferPacketDataEnt captureBufferPacketData;

                    public final CaptureBufferPacketLengthEnt captureBufferPacketLength;

                    public final CaptureBufferPacketTimeEnt captureBufferPacketTime;

                    public final CaptureBufferPacketStatusEnt captureBufferPacketStatus;

                    private CaptureBufferEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "captureBufferEntry", "1.3.6.1.2.1.16.8.2.1", false, false, false, true);
                        this.captureBufferControlIndex = new CaptureBufferControlIndexEnt(mib, this);
                        this.captureBufferIndex = new CaptureBufferIndexEnt(mib, this);
                        this.captureBufferPacketID = new CaptureBufferPacketIDEnt(mib, this);
                        this.captureBufferPacketData = new CaptureBufferPacketDataEnt(mib, this);
                        this.captureBufferPacketLength = new CaptureBufferPacketLengthEnt(mib, this);
                        this.captureBufferPacketTime = new CaptureBufferPacketTimeEnt(mib, this);
                        this.captureBufferPacketStatus = new CaptureBufferPacketStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.captureBufferControlIndex,
                            this.captureBufferIndex,
                            this.captureBufferPacketID,
                            this.captureBufferPacketData,
                            this.captureBufferPacketLength,
                            this.captureBufferPacketTime,
                            this.captureBufferPacketStatus
                        };
                    }
                    public static final class CaptureBufferControlIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private CaptureBufferControlIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "captureBufferControlIndex", "1.3.6.1.2.1.16.8.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class CaptureBufferIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private CaptureBufferIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "captureBufferIndex", "1.3.6.1.2.1.16.8.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class CaptureBufferPacketIDEnt extends MIBEntry<RMONMIBDef>
                    {
                        private CaptureBufferPacketIDEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "captureBufferPacketID", "1.3.6.1.2.1.16.8.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class CaptureBufferPacketDataEnt extends MIBEntry<RMONMIBDef>
                    {
                        private CaptureBufferPacketDataEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "captureBufferPacketData", "1.3.6.1.2.1.16.8.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class CaptureBufferPacketLengthEnt extends MIBEntry<RMONMIBDef>
                    {
                        private CaptureBufferPacketLengthEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "captureBufferPacketLength", "1.3.6.1.2.1.16.8.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class CaptureBufferPacketTimeEnt extends MIBEntry<RMONMIBDef>
                    {
                        private CaptureBufferPacketTimeEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "captureBufferPacketTime", "1.3.6.1.2.1.16.8.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class CaptureBufferPacketStatusEnt extends MIBEntry<RMONMIBDef>
                    {
                        private CaptureBufferPacketStatusEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "captureBufferPacketStatus", "1.3.6.1.2.1.16.8.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class EventEnt extends MIBEntry<RMONMIBDef>
        {
            /** The Event Group
Implementation of the Event group is optional.Consult the MODULE-COMPLIANCE macro for the authoritativeconformance information for this MIB.The Event group controls the generation and notificationof events from this device.  Each entry in the eventTabledescribes the parameters of the event that can be triggered.Each event entry is fired by an associated condition locatedelsewhere in the MIB.  An event entry may also be associatedwith a function elsewhere in the MIB that will be executedwhen the event is generated.  For example, a channel maybe turned on or off by the firing of an event.Each eventEntry may optionally specify that a log entrybe created on its behalf whenever the event occurs.Each entry may also specify that notification shouldoccur by way of SNMP trap messages.  In this case, thecommunity for the trap message is given in the associatedeventCommunity object.  The enterprise and specific trapfields of the trap are determined by the condition thattriggered the event.  Two traps are defined: risingAlarm andfallingAlarm.  If the eventTable is triggered by a conditionspecified elsewhere, the enterprise and specific trap fieldsmust be specified for traps generated for that condition.*/
            public final EventTableEnt eventTable;

            public final LogTableEnt logTable;

            private EventEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
            {
                super(mib, parent, "event", "1.3.6.1.2.1.16.9", false, false, false, false);
                this.eventTable = new EventTableEnt(mib, this);
                this.logTable = new LogTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.eventTable,
                    this.logTable
                };
            }
            public static final class EventTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final EventEntryEnt eventEntry;

                private EventTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "eventTable", "1.3.6.1.2.1.16.9.1", false, true, false, false);
                    this.eventEntry = new EventEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.eventEntry
                    };
                }
                public static final class EventEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final EventIndexEnt eventIndex;

                    public final EventDescriptionEnt eventDescription;

                    public final EventTypeEnt eventType;

                    public final EventCommunityEnt eventCommunity;

                    public final EventLastTimeSentEnt eventLastTimeSent;

                    public final EventOwnerEnt eventOwner;

                    public final EventStatusEnt eventStatus;

                    private EventEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "eventEntry", "1.3.6.1.2.1.16.9.1.1", false, false, false, true);
                        this.eventIndex = new EventIndexEnt(mib, this);
                        this.eventDescription = new EventDescriptionEnt(mib, this);
                        this.eventType = new EventTypeEnt(mib, this);
                        this.eventCommunity = new EventCommunityEnt(mib, this);
                        this.eventLastTimeSent = new EventLastTimeSentEnt(mib, this);
                        this.eventOwner = new EventOwnerEnt(mib, this);
                        this.eventStatus = new EventStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.eventIndex,
                            this.eventDescription,
                            this.eventType,
                            this.eventCommunity,
                            this.eventLastTimeSent,
                            this.eventOwner,
                            this.eventStatus
                        };
                    }
                    public static final class EventIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EventIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "eventIndex", "1.3.6.1.2.1.16.9.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EventDescriptionEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EventDescriptionEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "eventDescription", "1.3.6.1.2.1.16.9.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EventTypeEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EventTypeEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "eventType", "1.3.6.1.2.1.16.9.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EventCommunityEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EventCommunityEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "eventCommunity", "1.3.6.1.2.1.16.9.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EventLastTimeSentEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EventLastTimeSentEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "eventLastTimeSent", "1.3.6.1.2.1.16.9.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EventOwnerEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EventOwnerEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "eventOwner", "1.3.6.1.2.1.16.9.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EventStatusEnt extends MIBEntry<RMONMIBDef>
                    {
                        private EventStatusEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "eventStatus", "1.3.6.1.2.1.16.9.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class LogTableEnt extends MIBEntry<RMONMIBDef>
            {
                public final LogEntryEnt logEntry;

                private LogTableEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "logTable", "1.3.6.1.2.1.16.9.2", false, true, false, false);
                    this.logEntry = new LogEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.logEntry
                    };
                }
                public static final class LogEntryEnt extends MIBEntry<RMONMIBDef>
                {
                    public final LogEventIndexEnt logEventIndex;

                    public final LogIndexEnt logIndex;

                    public final LogTimeEnt logTime;

                    public final LogDescriptionEnt logDescription;

                    private LogEntryEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                    {
                        super(mib, parent, "logEntry", "1.3.6.1.2.1.16.9.2.1", false, false, false, true);
                        this.logEventIndex = new LogEventIndexEnt(mib, this);
                        this.logIndex = new LogIndexEnt(mib, this);
                        this.logTime = new LogTimeEnt(mib, this);
                        this.logDescription = new LogDescriptionEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.logEventIndex,
                            this.logIndex,
                            this.logTime,
                            this.logDescription
                        };
                    }
                    public static final class LogEventIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private LogEventIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "logEventIndex", "1.3.6.1.2.1.16.9.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LogIndexEnt extends MIBEntry<RMONMIBDef>
                    {
                        private LogIndexEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "logIndex", "1.3.6.1.2.1.16.9.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LogTimeEnt extends MIBEntry<RMONMIBDef>
                    {
                        private LogTimeEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "logTime", "1.3.6.1.2.1.16.9.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LogDescriptionEnt extends MIBEntry<RMONMIBDef>
                    {
                        private LogDescriptionEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                        {
                            super(mib, parent, "logDescription", "1.3.6.1.2.1.16.9.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class RmonEventsV2Ent extends MIBEntry<RMONMIBDef>
        {
            public final RisingAlarmEnt risingAlarm;

            public final FallingAlarmEnt fallingAlarm;

            private RmonEventsV2Ent(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
            {
                super(mib, parent, "rmonEventsV2", "1.3.6.1.2.1.16.0", false, false, false, false);
                this.risingAlarm = new RisingAlarmEnt(mib, this);
                this.fallingAlarm = new FallingAlarmEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.risingAlarm,
                    this.fallingAlarm
                };
            }
            public static final class RisingAlarmEnt extends MIBEntry<RMONMIBDef>
            {
                private RisingAlarmEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "risingAlarm", "1.3.6.1.2.1.16.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class FallingAlarmEnt extends MIBEntry<RMONMIBDef>
            {
                private FallingAlarmEnt(RMONMIBDef mib, MIBEntry<RMONMIBDef> parent)
                {
                    super(mib, parent, "fallingAlarm", "1.3.6.1.2.1.16.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
