package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class IPV6MLDMIBDef extends MIB
{
    public static final IPV6MLDMIBDef IPV6MLDMIB = new IPV6MLDMIBDef();

    static { MIBs.getInstance().registerMIB(IPV6MLDMIBDef.IPV6MLDMIB); }

    /** 25 Jan 2001*/
    public final MldMIBEnt mldMIB;

    private IPV6MLDMIBDef()
    {
        super("IPV6-MLD-MIB");
        this.mldMIB = new MldMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mldMIB
        };
    }

    public static final class MldMIBEnt extends MIBEntry<IPV6MLDMIBDef>
    {
        public final MldMIBObjectsEnt mldMIBObjects;

        /** conformance information*/
        public final MldMIBConformanceEnt mldMIBConformance;

        private MldMIBEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
        {
            super(mib, parent, "mldMIB", "1.3.6.1.2.1.91", false, false, false, false);
            this.mldMIBObjects = new MldMIBObjectsEnt(mib, this);
            this.mldMIBConformance = new MldMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mldMIBObjects,
                this.mldMIBConformance
            };
        }
        public static final class MldMIBObjectsEnt extends MIBEntry<IPV6MLDMIBDef>
        {
            /** The MLD Interface Table*/
            public final MldInterfaceTableEnt mldInterfaceTable;

            /** The MLD Cache Table*/
            public final MldCacheTableEnt mldCacheTable;

            private MldMIBObjectsEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
            {
                super(mib, parent, "mldMIBObjects", "1.3.6.1.2.1.91.1", false, false, false, false);
                this.mldInterfaceTable = new MldInterfaceTableEnt(mib, this);
                this.mldCacheTable = new MldCacheTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mldInterfaceTable,
                    this.mldCacheTable
                };
            }
            public static final class MldInterfaceTableEnt extends MIBEntry<IPV6MLDMIBDef>
            {
                public final MldInterfaceEntryEnt mldInterfaceEntry;

                private MldInterfaceTableEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                {
                    super(mib, parent, "mldInterfaceTable", "1.3.6.1.2.1.91.1.1", false, true, false, false);
                    this.mldInterfaceEntry = new MldInterfaceEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mldInterfaceEntry
                    };
                }
                public static final class MldInterfaceEntryEnt extends MIBEntry<IPV6MLDMIBDef>
                {
                    public final MldInterfaceIfIndexEnt mldInterfaceIfIndex;

                    public final MldInterfaceQueryIntervalEnt mldInterfaceQueryInterval;

                    public final MldInterfaceStatusEnt mldInterfaceStatus;

                    public final MldInterfaceVersionEnt mldInterfaceVersion;

                    public final MldInterfaceQuerierEnt mldInterfaceQuerier;

                    public final MldInterfaceQueryMaxResponseDelayEnt mldInterfaceQueryMaxResponseDelay;

                    public final MldInterfaceJoinsEnt mldInterfaceJoins;

                    public final MldInterfaceGroupsEnt mldInterfaceGroups;

                    public final MldInterfaceRobustnessEnt mldInterfaceRobustness;

                    public final MldInterfaceLastListenQueryIntvlEnt mldInterfaceLastListenQueryIntvl;

                    public final MldInterfaceProxyIfIndexEnt mldInterfaceProxyIfIndex;

                    public final MldInterfaceQuerierUpTimeEnt mldInterfaceQuerierUpTime;

                    public final MldInterfaceQuerierExpiryTimeEnt mldInterfaceQuerierExpiryTime;

                    private MldInterfaceEntryEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                    {
                        super(mib, parent, "mldInterfaceEntry", "1.3.6.1.2.1.91.1.1.1", false, false, false, true);
                        this.mldInterfaceIfIndex = new MldInterfaceIfIndexEnt(mib, this);
                        this.mldInterfaceQueryInterval = new MldInterfaceQueryIntervalEnt(mib, this);
                        this.mldInterfaceStatus = new MldInterfaceStatusEnt(mib, this);
                        this.mldInterfaceVersion = new MldInterfaceVersionEnt(mib, this);
                        this.mldInterfaceQuerier = new MldInterfaceQuerierEnt(mib, this);
                        this.mldInterfaceQueryMaxResponseDelay = new MldInterfaceQueryMaxResponseDelayEnt(mib, this);
                        this.mldInterfaceJoins = new MldInterfaceJoinsEnt(mib, this);
                        this.mldInterfaceGroups = new MldInterfaceGroupsEnt(mib, this);
                        this.mldInterfaceRobustness = new MldInterfaceRobustnessEnt(mib, this);
                        this.mldInterfaceLastListenQueryIntvl = new MldInterfaceLastListenQueryIntvlEnt(mib, this);
                        this.mldInterfaceProxyIfIndex = new MldInterfaceProxyIfIndexEnt(mib, this);
                        this.mldInterfaceQuerierUpTime = new MldInterfaceQuerierUpTimeEnt(mib, this);
                        this.mldInterfaceQuerierExpiryTime = new MldInterfaceQuerierExpiryTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mldInterfaceIfIndex,
                            this.mldInterfaceQueryInterval,
                            this.mldInterfaceStatus,
                            this.mldInterfaceVersion,
                            this.mldInterfaceQuerier,
                            this.mldInterfaceQueryMaxResponseDelay,
                            this.mldInterfaceJoins,
                            this.mldInterfaceGroups,
                            this.mldInterfaceRobustness,
                            this.mldInterfaceLastListenQueryIntvl,
                            this.mldInterfaceProxyIfIndex,
                            this.mldInterfaceQuerierUpTime,
                            this.mldInterfaceQuerierExpiryTime
                        };
                    }
                    public static final class MldInterfaceIfIndexEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldInterfaceIfIndexEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldInterfaceIfIndex", "1.3.6.1.2.1.91.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldInterfaceQueryIntervalEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldInterfaceQueryIntervalEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldInterfaceQueryInterval", "1.3.6.1.2.1.91.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldInterfaceStatusEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldInterfaceStatusEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldInterfaceStatus", "1.3.6.1.2.1.91.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldInterfaceVersionEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldInterfaceVersionEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldInterfaceVersion", "1.3.6.1.2.1.91.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldInterfaceQuerierEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldInterfaceQuerierEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldInterfaceQuerier", "1.3.6.1.2.1.91.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldInterfaceQueryMaxResponseDelayEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldInterfaceQueryMaxResponseDelayEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldInterfaceQueryMaxResponseDelay", "1.3.6.1.2.1.91.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldInterfaceJoinsEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldInterfaceJoinsEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldInterfaceJoins", "1.3.6.1.2.1.91.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldInterfaceGroupsEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldInterfaceGroupsEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldInterfaceGroups", "1.3.6.1.2.1.91.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldInterfaceRobustnessEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldInterfaceRobustnessEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldInterfaceRobustness", "1.3.6.1.2.1.91.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldInterfaceLastListenQueryIntvlEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldInterfaceLastListenQueryIntvlEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldInterfaceLastListenQueryIntvl", "1.3.6.1.2.1.91.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldInterfaceProxyIfIndexEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldInterfaceProxyIfIndexEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldInterfaceProxyIfIndex", "1.3.6.1.2.1.91.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldInterfaceQuerierUpTimeEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldInterfaceQuerierUpTimeEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldInterfaceQuerierUpTime", "1.3.6.1.2.1.91.1.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldInterfaceQuerierExpiryTimeEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldInterfaceQuerierExpiryTimeEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldInterfaceQuerierExpiryTime", "1.3.6.1.2.1.91.1.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MldCacheTableEnt extends MIBEntry<IPV6MLDMIBDef>
            {
                public final MldCacheEntryEnt mldCacheEntry;

                private MldCacheTableEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                {
                    super(mib, parent, "mldCacheTable", "1.3.6.1.2.1.91.1.2", false, true, false, false);
                    this.mldCacheEntry = new MldCacheEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mldCacheEntry
                    };
                }
                public static final class MldCacheEntryEnt extends MIBEntry<IPV6MLDMIBDef>
                {
                    public final MldCacheAddressEnt mldCacheAddress;

                    public final MldCacheIfIndexEnt mldCacheIfIndex;

                    public final MldCacheSelfEnt mldCacheSelf;

                    public final MldCacheLastReporterEnt mldCacheLastReporter;

                    public final MldCacheUpTimeEnt mldCacheUpTime;

                    public final MldCacheExpiryTimeEnt mldCacheExpiryTime;

                    public final MldCacheStatusEnt mldCacheStatus;

                    private MldCacheEntryEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                    {
                        super(mib, parent, "mldCacheEntry", "1.3.6.1.2.1.91.1.2.1", false, false, false, true);
                        this.mldCacheAddress = new MldCacheAddressEnt(mib, this);
                        this.mldCacheIfIndex = new MldCacheIfIndexEnt(mib, this);
                        this.mldCacheSelf = new MldCacheSelfEnt(mib, this);
                        this.mldCacheLastReporter = new MldCacheLastReporterEnt(mib, this);
                        this.mldCacheUpTime = new MldCacheUpTimeEnt(mib, this);
                        this.mldCacheExpiryTime = new MldCacheExpiryTimeEnt(mib, this);
                        this.mldCacheStatus = new MldCacheStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mldCacheAddress,
                            this.mldCacheIfIndex,
                            this.mldCacheSelf,
                            this.mldCacheLastReporter,
                            this.mldCacheUpTime,
                            this.mldCacheExpiryTime,
                            this.mldCacheStatus
                        };
                    }
                    public static final class MldCacheAddressEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldCacheAddressEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldCacheAddress", "1.3.6.1.2.1.91.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldCacheIfIndexEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldCacheIfIndexEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldCacheIfIndex", "1.3.6.1.2.1.91.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldCacheSelfEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldCacheSelfEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldCacheSelf", "1.3.6.1.2.1.91.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldCacheLastReporterEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldCacheLastReporterEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldCacheLastReporter", "1.3.6.1.2.1.91.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldCacheUpTimeEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldCacheUpTimeEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldCacheUpTime", "1.3.6.1.2.1.91.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldCacheExpiryTimeEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldCacheExpiryTimeEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldCacheExpiryTime", "1.3.6.1.2.1.91.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MldCacheStatusEnt extends MIBEntry<IPV6MLDMIBDef>
                    {
                        private MldCacheStatusEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                        {
                            super(mib, parent, "mldCacheStatus", "1.3.6.1.2.1.91.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class MldMIBConformanceEnt extends MIBEntry<IPV6MLDMIBDef>
        {
            public final MldMIBCompliancesEnt mldMIBCompliances;

            public final MldMIBGroupsEnt mldMIBGroups;

            private MldMIBConformanceEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
            {
                super(mib, parent, "mldMIBConformance", "1.3.6.1.2.1.91.2", false, false, false, false);
                this.mldMIBCompliances = new MldMIBCompliancesEnt(mib, this);
                this.mldMIBGroups = new MldMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mldMIBCompliances,
                    this.mldMIBGroups
                };
            }
            public static final class MldMIBCompliancesEnt extends MIBEntry<IPV6MLDMIBDef>
            {
                /** compliance statements*/
                public final MldHostMIBComplianceEnt mldHostMIBCompliance;

                public final MldRouterMIBComplianceEnt mldRouterMIBCompliance;

                private MldMIBCompliancesEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                {
                    super(mib, parent, "mldMIBCompliances", "1.3.6.1.2.1.91.2.1", false, false, false, false);
                    this.mldHostMIBCompliance = new MldHostMIBComplianceEnt(mib, this);
                    this.mldRouterMIBCompliance = new MldRouterMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mldHostMIBCompliance,
                        this.mldRouterMIBCompliance
                    };
                }
                public static final class MldHostMIBComplianceEnt extends MIBEntry<IPV6MLDMIBDef>
                {
                    private MldHostMIBComplianceEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                    {
                        super(mib, parent, "mldHostMIBCompliance", "1.3.6.1.2.1.91.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MldRouterMIBComplianceEnt extends MIBEntry<IPV6MLDMIBDef>
                {
                    private MldRouterMIBComplianceEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                    {
                        super(mib, parent, "mldRouterMIBCompliance", "1.3.6.1.2.1.91.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MldMIBGroupsEnt extends MIBEntry<IPV6MLDMIBDef>
            {
                /** units of conformance*/
                public final MldBaseMIBGroupEnt mldBaseMIBGroup;

                public final MldRouterMIBGroupEnt mldRouterMIBGroup;

                public final MldHostMIBGroupEnt mldHostMIBGroup;

                public final MldProxyMIBGroupEnt mldProxyMIBGroup;

                private MldMIBGroupsEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                {
                    super(mib, parent, "mldMIBGroups", "1.3.6.1.2.1.91.2.2", false, false, false, false);
                    this.mldBaseMIBGroup = new MldBaseMIBGroupEnt(mib, this);
                    this.mldRouterMIBGroup = new MldRouterMIBGroupEnt(mib, this);
                    this.mldHostMIBGroup = new MldHostMIBGroupEnt(mib, this);
                    this.mldProxyMIBGroup = new MldProxyMIBGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mldBaseMIBGroup,
                        this.mldRouterMIBGroup,
                        this.mldHostMIBGroup,
                        this.mldProxyMIBGroup
                    };
                }
                public static final class MldBaseMIBGroupEnt extends MIBEntry<IPV6MLDMIBDef>
                {
                    private MldBaseMIBGroupEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                    {
                        super(mib, parent, "mldBaseMIBGroup", "1.3.6.1.2.1.91.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MldRouterMIBGroupEnt extends MIBEntry<IPV6MLDMIBDef>
                {
                    private MldRouterMIBGroupEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                    {
                        super(mib, parent, "mldRouterMIBGroup", "1.3.6.1.2.1.91.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MldHostMIBGroupEnt extends MIBEntry<IPV6MLDMIBDef>
                {
                    private MldHostMIBGroupEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                    {
                        super(mib, parent, "mldHostMIBGroup", "1.3.6.1.2.1.91.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MldProxyMIBGroupEnt extends MIBEntry<IPV6MLDMIBDef>
                {
                    private MldProxyMIBGroupEnt(IPV6MLDMIBDef mib, MIBEntry<IPV6MLDMIBDef> parent)
                    {
                        super(mib, parent, "mldProxyMIBGroup", "1.3.6.1.2.1.91.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
