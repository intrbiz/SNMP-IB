package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class IGMPSTDMIBDef extends MIB
{
    public static final IGMPSTDMIBDef IGMPSTDMIB = new IGMPSTDMIBDef();

    static { MIBs.getInstance().registerMIB(IGMPSTDMIBDef.IGMPSTDMIB); }

    /** September 28, 2000*/
    public final IgmpStdMIBEnt igmpStdMIB;

    private IGMPSTDMIBDef()
    {
        super("IGMP-STD-MIB");
        this.igmpStdMIB = new IgmpStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.igmpStdMIB
        };
    }

    public static final class IgmpStdMIBEnt extends MIBEntry<IGMPSTDMIBDef>
    {
        public final IgmpMIBObjectsEnt igmpMIBObjects;

        /** conformance information*/
        public final IgmpMIBConformanceEnt igmpMIBConformance;

        private IgmpStdMIBEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
        {
            super(mib, parent, "igmpStdMIB", "1.3.6.1.2.1.85", false, false, false, false);
            this.igmpMIBObjects = new IgmpMIBObjectsEnt(mib, this);
            this.igmpMIBConformance = new IgmpMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.igmpMIBObjects,
                this.igmpMIBConformance
            };
        }
        public static final class IgmpMIBObjectsEnt extends MIBEntry<IGMPSTDMIBDef>
        {
            /** The IGMP Interface Table*/
            public final IgmpInterfaceTableEnt igmpInterfaceTable;

            /** The IGMP Cache Table*/
            public final IgmpCacheTableEnt igmpCacheTable;

            private IgmpMIBObjectsEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
            {
                super(mib, parent, "igmpMIBObjects", "1.3.6.1.2.1.85.1", false, false, false, false);
                this.igmpInterfaceTable = new IgmpInterfaceTableEnt(mib, this);
                this.igmpCacheTable = new IgmpCacheTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.igmpInterfaceTable,
                    this.igmpCacheTable
                };
            }
            public static final class IgmpInterfaceTableEnt extends MIBEntry<IGMPSTDMIBDef>
            {
                public final IgmpInterfaceEntryEnt igmpInterfaceEntry;

                private IgmpInterfaceTableEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                {
                    super(mib, parent, "igmpInterfaceTable", "1.3.6.1.2.1.85.1.1", false, true, false, false);
                    this.igmpInterfaceEntry = new IgmpInterfaceEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.igmpInterfaceEntry
                    };
                }
                public static final class IgmpInterfaceEntryEnt extends MIBEntry<IGMPSTDMIBDef>
                {
                    public final IgmpInterfaceIfIndexEnt igmpInterfaceIfIndex;

                    public final IgmpInterfaceQueryIntervalEnt igmpInterfaceQueryInterval;

                    public final IgmpInterfaceStatusEnt igmpInterfaceStatus;

                    public final IgmpInterfaceVersionEnt igmpInterfaceVersion;

                    public final IgmpInterfaceQuerierEnt igmpInterfaceQuerier;

                    public final IgmpInterfaceQueryMaxResponseTimeEnt igmpInterfaceQueryMaxResponseTime;

                    public final IgmpInterfaceQuerierUpTimeEnt igmpInterfaceQuerierUpTime;

                    public final IgmpInterfaceQuerierExpiryTimeEnt igmpInterfaceQuerierExpiryTime;

                    public final IgmpInterfaceVersion1QuerierTimerEnt igmpInterfaceVersion1QuerierTimer;

                    public final IgmpInterfaceWrongVersionQueriesEnt igmpInterfaceWrongVersionQueries;

                    public final IgmpInterfaceJoinsEnt igmpInterfaceJoins;

                    public final IgmpInterfaceProxyIfIndexEnt igmpInterfaceProxyIfIndex;

                    public final IgmpInterfaceGroupsEnt igmpInterfaceGroups;

                    public final IgmpInterfaceRobustnessEnt igmpInterfaceRobustness;

                    public final IgmpInterfaceLastMembQueryIntvlEnt igmpInterfaceLastMembQueryIntvl;

                    private IgmpInterfaceEntryEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                    {
                        super(mib, parent, "igmpInterfaceEntry", "1.3.6.1.2.1.85.1.1.1", false, false, false, true);
                        this.igmpInterfaceIfIndex = new IgmpInterfaceIfIndexEnt(mib, this);
                        this.igmpInterfaceQueryInterval = new IgmpInterfaceQueryIntervalEnt(mib, this);
                        this.igmpInterfaceStatus = new IgmpInterfaceStatusEnt(mib, this);
                        this.igmpInterfaceVersion = new IgmpInterfaceVersionEnt(mib, this);
                        this.igmpInterfaceQuerier = new IgmpInterfaceQuerierEnt(mib, this);
                        this.igmpInterfaceQueryMaxResponseTime = new IgmpInterfaceQueryMaxResponseTimeEnt(mib, this);
                        this.igmpInterfaceQuerierUpTime = new IgmpInterfaceQuerierUpTimeEnt(mib, this);
                        this.igmpInterfaceQuerierExpiryTime = new IgmpInterfaceQuerierExpiryTimeEnt(mib, this);
                        this.igmpInterfaceVersion1QuerierTimer = new IgmpInterfaceVersion1QuerierTimerEnt(mib, this);
                        this.igmpInterfaceWrongVersionQueries = new IgmpInterfaceWrongVersionQueriesEnt(mib, this);
                        this.igmpInterfaceJoins = new IgmpInterfaceJoinsEnt(mib, this);
                        this.igmpInterfaceProxyIfIndex = new IgmpInterfaceProxyIfIndexEnt(mib, this);
                        this.igmpInterfaceGroups = new IgmpInterfaceGroupsEnt(mib, this);
                        this.igmpInterfaceRobustness = new IgmpInterfaceRobustnessEnt(mib, this);
                        this.igmpInterfaceLastMembQueryIntvl = new IgmpInterfaceLastMembQueryIntvlEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.igmpInterfaceIfIndex,
                            this.igmpInterfaceQueryInterval,
                            this.igmpInterfaceStatus,
                            this.igmpInterfaceVersion,
                            this.igmpInterfaceQuerier,
                            this.igmpInterfaceQueryMaxResponseTime,
                            this.igmpInterfaceQuerierUpTime,
                            this.igmpInterfaceQuerierExpiryTime,
                            this.igmpInterfaceVersion1QuerierTimer,
                            this.igmpInterfaceWrongVersionQueries,
                            this.igmpInterfaceJoins,
                            this.igmpInterfaceProxyIfIndex,
                            this.igmpInterfaceGroups,
                            this.igmpInterfaceRobustness,
                            this.igmpInterfaceLastMembQueryIntvl
                        };
                    }
                    public static final class IgmpInterfaceIfIndexEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpInterfaceIfIndexEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpInterfaceIfIndex", "1.3.6.1.2.1.85.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpInterfaceQueryIntervalEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpInterfaceQueryIntervalEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpInterfaceQueryInterval", "1.3.6.1.2.1.85.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpInterfaceStatusEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpInterfaceStatusEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpInterfaceStatus", "1.3.6.1.2.1.85.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpInterfaceVersionEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpInterfaceVersionEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpInterfaceVersion", "1.3.6.1.2.1.85.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpInterfaceQuerierEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpInterfaceQuerierEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpInterfaceQuerier", "1.3.6.1.2.1.85.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpInterfaceQueryMaxResponseTimeEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpInterfaceQueryMaxResponseTimeEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpInterfaceQueryMaxResponseTime", "1.3.6.1.2.1.85.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpInterfaceQuerierUpTimeEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpInterfaceQuerierUpTimeEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpInterfaceQuerierUpTime", "1.3.6.1.2.1.85.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpInterfaceQuerierExpiryTimeEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpInterfaceQuerierExpiryTimeEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpInterfaceQuerierExpiryTime", "1.3.6.1.2.1.85.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpInterfaceVersion1QuerierTimerEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpInterfaceVersion1QuerierTimerEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpInterfaceVersion1QuerierTimer", "1.3.6.1.2.1.85.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpInterfaceWrongVersionQueriesEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpInterfaceWrongVersionQueriesEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpInterfaceWrongVersionQueries", "1.3.6.1.2.1.85.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpInterfaceJoinsEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpInterfaceJoinsEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpInterfaceJoins", "1.3.6.1.2.1.85.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpInterfaceProxyIfIndexEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpInterfaceProxyIfIndexEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpInterfaceProxyIfIndex", "1.3.6.1.2.1.85.1.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpInterfaceGroupsEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpInterfaceGroupsEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpInterfaceGroups", "1.3.6.1.2.1.85.1.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpInterfaceRobustnessEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpInterfaceRobustnessEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpInterfaceRobustness", "1.3.6.1.2.1.85.1.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpInterfaceLastMembQueryIntvlEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpInterfaceLastMembQueryIntvlEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpInterfaceLastMembQueryIntvl", "1.3.6.1.2.1.85.1.1.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IgmpCacheTableEnt extends MIBEntry<IGMPSTDMIBDef>
            {
                public final IgmpCacheEntryEnt igmpCacheEntry;

                private IgmpCacheTableEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                {
                    super(mib, parent, "igmpCacheTable", "1.3.6.1.2.1.85.1.2", false, true, false, false);
                    this.igmpCacheEntry = new IgmpCacheEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.igmpCacheEntry
                    };
                }
                public static final class IgmpCacheEntryEnt extends MIBEntry<IGMPSTDMIBDef>
                {
                    public final IgmpCacheAddressEnt igmpCacheAddress;

                    public final IgmpCacheIfIndexEnt igmpCacheIfIndex;

                    public final IgmpCacheSelfEnt igmpCacheSelf;

                    public final IgmpCacheLastReporterEnt igmpCacheLastReporter;

                    public final IgmpCacheUpTimeEnt igmpCacheUpTime;

                    public final IgmpCacheExpiryTimeEnt igmpCacheExpiryTime;

                    public final IgmpCacheStatusEnt igmpCacheStatus;

                    public final IgmpCacheVersion1HostTimerEnt igmpCacheVersion1HostTimer;

                    private IgmpCacheEntryEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                    {
                        super(mib, parent, "igmpCacheEntry", "1.3.6.1.2.1.85.1.2.1", false, false, false, true);
                        this.igmpCacheAddress = new IgmpCacheAddressEnt(mib, this);
                        this.igmpCacheIfIndex = new IgmpCacheIfIndexEnt(mib, this);
                        this.igmpCacheSelf = new IgmpCacheSelfEnt(mib, this);
                        this.igmpCacheLastReporter = new IgmpCacheLastReporterEnt(mib, this);
                        this.igmpCacheUpTime = new IgmpCacheUpTimeEnt(mib, this);
                        this.igmpCacheExpiryTime = new IgmpCacheExpiryTimeEnt(mib, this);
                        this.igmpCacheStatus = new IgmpCacheStatusEnt(mib, this);
                        this.igmpCacheVersion1HostTimer = new IgmpCacheVersion1HostTimerEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.igmpCacheAddress,
                            this.igmpCacheIfIndex,
                            this.igmpCacheSelf,
                            this.igmpCacheLastReporter,
                            this.igmpCacheUpTime,
                            this.igmpCacheExpiryTime,
                            this.igmpCacheStatus,
                            this.igmpCacheVersion1HostTimer
                        };
                    }
                    public static final class IgmpCacheAddressEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpCacheAddressEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpCacheAddress", "1.3.6.1.2.1.85.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpCacheIfIndexEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpCacheIfIndexEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpCacheIfIndex", "1.3.6.1.2.1.85.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpCacheSelfEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpCacheSelfEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpCacheSelf", "1.3.6.1.2.1.85.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpCacheLastReporterEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpCacheLastReporterEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpCacheLastReporter", "1.3.6.1.2.1.85.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpCacheUpTimeEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpCacheUpTimeEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpCacheUpTime", "1.3.6.1.2.1.85.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpCacheExpiryTimeEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpCacheExpiryTimeEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpCacheExpiryTime", "1.3.6.1.2.1.85.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpCacheStatusEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpCacheStatusEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpCacheStatus", "1.3.6.1.2.1.85.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IgmpCacheVersion1HostTimerEnt extends MIBEntry<IGMPSTDMIBDef>
                    {
                        private IgmpCacheVersion1HostTimerEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                        {
                            super(mib, parent, "igmpCacheVersion1HostTimer", "1.3.6.1.2.1.85.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class IgmpMIBConformanceEnt extends MIBEntry<IGMPSTDMIBDef>
        {
            public final IgmpMIBCompliancesEnt igmpMIBCompliances;

            public final IgmpMIBGroupsEnt igmpMIBGroups;

            private IgmpMIBConformanceEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
            {
                super(mib, parent, "igmpMIBConformance", "1.3.6.1.2.1.85.2", false, false, false, false);
                this.igmpMIBCompliances = new IgmpMIBCompliancesEnt(mib, this);
                this.igmpMIBGroups = new IgmpMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.igmpMIBCompliances,
                    this.igmpMIBGroups
                };
            }
            public static final class IgmpMIBCompliancesEnt extends MIBEntry<IGMPSTDMIBDef>
            {
                /** compliance statements*/
                public final IgmpV1HostMIBComplianceEnt igmpV1HostMIBCompliance;

                public final IgmpV1RouterMIBComplianceEnt igmpV1RouterMIBCompliance;

                public final IgmpV2HostMIBComplianceEnt igmpV2HostMIBCompliance;

                public final IgmpV2RouterMIBComplianceEnt igmpV2RouterMIBCompliance;

                private IgmpMIBCompliancesEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                {
                    super(mib, parent, "igmpMIBCompliances", "1.3.6.1.2.1.85.2.1", false, false, false, false);
                    this.igmpV1HostMIBCompliance = new IgmpV1HostMIBComplianceEnt(mib, this);
                    this.igmpV1RouterMIBCompliance = new IgmpV1RouterMIBComplianceEnt(mib, this);
                    this.igmpV2HostMIBCompliance = new IgmpV2HostMIBComplianceEnt(mib, this);
                    this.igmpV2RouterMIBCompliance = new IgmpV2RouterMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.igmpV1HostMIBCompliance,
                        this.igmpV1RouterMIBCompliance,
                        this.igmpV2HostMIBCompliance,
                        this.igmpV2RouterMIBCompliance
                    };
                }
                public static final class IgmpV1HostMIBComplianceEnt extends MIBEntry<IGMPSTDMIBDef>
                {
                    private IgmpV1HostMIBComplianceEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                    {
                        super(mib, parent, "igmpV1HostMIBCompliance", "1.3.6.1.2.1.85.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IgmpV1RouterMIBComplianceEnt extends MIBEntry<IGMPSTDMIBDef>
                {
                    private IgmpV1RouterMIBComplianceEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                    {
                        super(mib, parent, "igmpV1RouterMIBCompliance", "1.3.6.1.2.1.85.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IgmpV2HostMIBComplianceEnt extends MIBEntry<IGMPSTDMIBDef>
                {
                    private IgmpV2HostMIBComplianceEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                    {
                        super(mib, parent, "igmpV2HostMIBCompliance", "1.3.6.1.2.1.85.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IgmpV2RouterMIBComplianceEnt extends MIBEntry<IGMPSTDMIBDef>
                {
                    private IgmpV2RouterMIBComplianceEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                    {
                        super(mib, parent, "igmpV2RouterMIBCompliance", "1.3.6.1.2.1.85.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class IgmpMIBGroupsEnt extends MIBEntry<IGMPSTDMIBDef>
            {
                /** units of conformance*/
                public final IgmpBaseMIBGroupEnt igmpBaseMIBGroup;

                public final IgmpRouterMIBGroupEnt igmpRouterMIBGroup;

                public final IgmpV2HostMIBGroupEnt igmpV2HostMIBGroup;

                public final IgmpHostOptMIBGroupEnt igmpHostOptMIBGroup;

                public final IgmpV2RouterMIBGroupEnt igmpV2RouterMIBGroup;

                public final IgmpV2ProxyMIBGroupEnt igmpV2ProxyMIBGroup;

                private IgmpMIBGroupsEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                {
                    super(mib, parent, "igmpMIBGroups", "1.3.6.1.2.1.85.2.2", false, false, false, false);
                    this.igmpBaseMIBGroup = new IgmpBaseMIBGroupEnt(mib, this);
                    this.igmpRouterMIBGroup = new IgmpRouterMIBGroupEnt(mib, this);
                    this.igmpV2HostMIBGroup = new IgmpV2HostMIBGroupEnt(mib, this);
                    this.igmpHostOptMIBGroup = new IgmpHostOptMIBGroupEnt(mib, this);
                    this.igmpV2RouterMIBGroup = new IgmpV2RouterMIBGroupEnt(mib, this);
                    this.igmpV2ProxyMIBGroup = new IgmpV2ProxyMIBGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.igmpBaseMIBGroup,
                        this.igmpRouterMIBGroup,
                        this.igmpV2HostMIBGroup,
                        this.igmpHostOptMIBGroup,
                        this.igmpV2RouterMIBGroup,
                        this.igmpV2ProxyMIBGroup
                    };
                }
                public static final class IgmpBaseMIBGroupEnt extends MIBEntry<IGMPSTDMIBDef>
                {
                    private IgmpBaseMIBGroupEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                    {
                        super(mib, parent, "igmpBaseMIBGroup", "1.3.6.1.2.1.85.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IgmpRouterMIBGroupEnt extends MIBEntry<IGMPSTDMIBDef>
                {
                    private IgmpRouterMIBGroupEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                    {
                        super(mib, parent, "igmpRouterMIBGroup", "1.3.6.1.2.1.85.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IgmpV2HostMIBGroupEnt extends MIBEntry<IGMPSTDMIBDef>
                {
                    private IgmpV2HostMIBGroupEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                    {
                        super(mib, parent, "igmpV2HostMIBGroup", "1.3.6.1.2.1.85.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IgmpHostOptMIBGroupEnt extends MIBEntry<IGMPSTDMIBDef>
                {
                    private IgmpHostOptMIBGroupEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                    {
                        super(mib, parent, "igmpHostOptMIBGroup", "1.3.6.1.2.1.85.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IgmpV2RouterMIBGroupEnt extends MIBEntry<IGMPSTDMIBDef>
                {
                    private IgmpV2RouterMIBGroupEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                    {
                        super(mib, parent, "igmpV2RouterMIBGroup", "1.3.6.1.2.1.85.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IgmpV2ProxyMIBGroupEnt extends MIBEntry<IGMPSTDMIBDef>
                {
                    private IgmpV2ProxyMIBGroupEnt(IGMPSTDMIBDef mib, MIBEntry<IGMPSTDMIBDef> parent)
                    {
                        super(mib, parent, "igmpV2ProxyMIBGroup", "1.3.6.1.2.1.85.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
