package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**RFC2578
RFC2579
RFC2580*/
public final class SLAPMMIBDef extends MIB
{
    public static final SLAPMMIBDef SLAPMMIB = new SLAPMMIBDef();

    static { MIBs.getInstance().registerMIB(SLAPMMIBDef.SLAPMMIB); }

    /** RFC2571

24 January 2000*/
    public final SlapmMIBEnt slapmMIB;

    private SLAPMMIBDef()
    {
        super("SLAPM-MIB");
        this.slapmMIB = new SlapmMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.slapmMIB
        };
    }

    public static final class SlapmMIBEnt extends MIBEntry<SLAPMMIBDef>
    {
        /** Top-level structure of the MIB*/
        public final SlapmNotificationsEnt slapmNotifications;

        public final SlapmObjectsEnt slapmObjects;

        public final SlapmConformanceEnt slapmConformance;

        private SlapmMIBEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
        {
            super(mib, parent, "slapmMIB", "1.3.6.1.3.88", false, false, false, false);
            this.slapmNotifications = new SlapmNotificationsEnt(mib, this);
            this.slapmObjects = new SlapmObjectsEnt(mib, this);
            this.slapmConformance = new SlapmConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.slapmNotifications,
                this.slapmObjects,
                this.slapmConformance
            };
        }
        public static final class SlapmNotificationsEnt extends MIBEntry<SLAPMMIBDef>
        {
            /** Notifications*/
            public final SlapmMonitoredEventNotAchievedEnt slapmMonitoredEventNotAchieved;

            public final SlapmMonitoredEventOkayEnt slapmMonitoredEventOkay;

            public final SlapmPolicyProfileDeletedEnt slapmPolicyProfileDeleted;

            public final SlapmPolicyMonitorDeletedEnt slapmPolicyMonitorDeleted;

            public final SlapmSubcomponentMonitoredEventNotAchievedEnt slapmSubcomponentMonitoredEventNotAchieved;

            public final SlapmSubcomponentMonitoredEventOkayEnt slapmSubcomponentMonitoredEventOkay;

            public final SlapmPolicyRuleMonNotOkayEnt slapmPolicyRuleMonNotOkay;

            public final SlapmPolicyRuleMonOkayEnt slapmPolicyRuleMonOkay;

            public final SlapmPolicyRuleDeletedEnt slapmPolicyRuleDeleted;

            public final SlapmPolicyRuleMonDeletedEnt slapmPolicyRuleMonDeleted;

            public final SlapmSubcMonitorNotOkayEnt slapmSubcMonitorNotOkay;

            public final SlapmSubcMonitorOkayEnt slapmSubcMonitorOkay;

            private SlapmNotificationsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
            {
                super(mib, parent, "slapmNotifications", "1.3.6.1.3.88.0", false, false, false, false);
                this.slapmMonitoredEventNotAchieved = new SlapmMonitoredEventNotAchievedEnt(mib, this);
                this.slapmMonitoredEventOkay = new SlapmMonitoredEventOkayEnt(mib, this);
                this.slapmPolicyProfileDeleted = new SlapmPolicyProfileDeletedEnt(mib, this);
                this.slapmPolicyMonitorDeleted = new SlapmPolicyMonitorDeletedEnt(mib, this);
                this.slapmSubcomponentMonitoredEventNotAchieved = new SlapmSubcomponentMonitoredEventNotAchievedEnt(mib, this);
                this.slapmSubcomponentMonitoredEventOkay = new SlapmSubcomponentMonitoredEventOkayEnt(mib, this);
                this.slapmPolicyRuleMonNotOkay = new SlapmPolicyRuleMonNotOkayEnt(mib, this);
                this.slapmPolicyRuleMonOkay = new SlapmPolicyRuleMonOkayEnt(mib, this);
                this.slapmPolicyRuleDeleted = new SlapmPolicyRuleDeletedEnt(mib, this);
                this.slapmPolicyRuleMonDeleted = new SlapmPolicyRuleMonDeletedEnt(mib, this);
                this.slapmSubcMonitorNotOkay = new SlapmSubcMonitorNotOkayEnt(mib, this);
                this.slapmSubcMonitorOkay = new SlapmSubcMonitorOkayEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.slapmMonitoredEventNotAchieved,
                    this.slapmMonitoredEventOkay,
                    this.slapmPolicyProfileDeleted,
                    this.slapmPolicyMonitorDeleted,
                    this.slapmSubcomponentMonitoredEventNotAchieved,
                    this.slapmSubcomponentMonitoredEventOkay,
                    this.slapmPolicyRuleMonNotOkay,
                    this.slapmPolicyRuleMonOkay,
                    this.slapmPolicyRuleDeleted,
                    this.slapmPolicyRuleMonDeleted,
                    this.slapmSubcMonitorNotOkay,
                    this.slapmSubcMonitorOkay
                };
            }
            public static final class SlapmMonitoredEventNotAchievedEnt extends MIBEntry<SLAPMMIBDef>
            {
                private SlapmMonitoredEventNotAchievedEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                {
                    super(mib, parent, "slapmMonitoredEventNotAchieved", "1.3.6.1.3.88.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SlapmMonitoredEventOkayEnt extends MIBEntry<SLAPMMIBDef>
            {
                private SlapmMonitoredEventOkayEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                {
                    super(mib, parent, "slapmMonitoredEventOkay", "1.3.6.1.3.88.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SlapmPolicyProfileDeletedEnt extends MIBEntry<SLAPMMIBDef>
            {
                private SlapmPolicyProfileDeletedEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                {
                    super(mib, parent, "slapmPolicyProfileDeleted", "1.3.6.1.3.88.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SlapmPolicyMonitorDeletedEnt extends MIBEntry<SLAPMMIBDef>
            {
                private SlapmPolicyMonitorDeletedEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                {
                    super(mib, parent, "slapmPolicyMonitorDeleted", "1.3.6.1.3.88.0.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SlapmSubcomponentMonitoredEventNotAchievedEnt extends MIBEntry<SLAPMMIBDef>
            {
                private SlapmSubcomponentMonitoredEventNotAchievedEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                {
                    super(mib, parent, "slapmSubcomponentMonitoredEventNotAchieved", "1.3.6.1.3.88.0.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SlapmSubcomponentMonitoredEventOkayEnt extends MIBEntry<SLAPMMIBDef>
            {
                private SlapmSubcomponentMonitoredEventOkayEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                {
                    super(mib, parent, "slapmSubcomponentMonitoredEventOkay", "1.3.6.1.3.88.0.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SlapmPolicyRuleMonNotOkayEnt extends MIBEntry<SLAPMMIBDef>
            {
                private SlapmPolicyRuleMonNotOkayEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                {
                    super(mib, parent, "slapmPolicyRuleMonNotOkay", "1.3.6.1.3.88.0.7", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SlapmPolicyRuleMonOkayEnt extends MIBEntry<SLAPMMIBDef>
            {
                private SlapmPolicyRuleMonOkayEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                {
                    super(mib, parent, "slapmPolicyRuleMonOkay", "1.3.6.1.3.88.0.8", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SlapmPolicyRuleDeletedEnt extends MIBEntry<SLAPMMIBDef>
            {
                private SlapmPolicyRuleDeletedEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                {
                    super(mib, parent, "slapmPolicyRuleDeleted", "1.3.6.1.3.88.0.9", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SlapmPolicyRuleMonDeletedEnt extends MIBEntry<SLAPMMIBDef>
            {
                private SlapmPolicyRuleMonDeletedEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                {
                    super(mib, parent, "slapmPolicyRuleMonDeleted", "1.3.6.1.3.88.0.10", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SlapmSubcMonitorNotOkayEnt extends MIBEntry<SLAPMMIBDef>
            {
                private SlapmSubcMonitorNotOkayEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                {
                    super(mib, parent, "slapmSubcMonitorNotOkay", "1.3.6.1.3.88.0.11", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SlapmSubcMonitorOkayEnt extends MIBEntry<SLAPMMIBDef>
            {
                private SlapmSubcMonitorOkayEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                {
                    super(mib, parent, "slapmSubcMonitorOkay", "1.3.6.1.3.88.0.12", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class SlapmObjectsEnt extends MIBEntry<SLAPMMIBDef>
        {
            /** All scalar objects*/
            public final SlapmBaseObjectsEnt slapmBaseObjects;

            public final SlapmTableObjectsEnt slapmTableObjects;

            private SlapmObjectsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
            {
                super(mib, parent, "slapmObjects", "1.3.6.1.3.88.1", false, false, false, false);
                this.slapmBaseObjects = new SlapmBaseObjectsEnt(mib, this);
                this.slapmTableObjects = new SlapmTableObjectsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.slapmBaseObjects,
                    this.slapmTableObjects
                };
            }
            public static final class SlapmBaseObjectsEnt extends MIBEntry<SLAPMMIBDef>
            {
                /** Scalar Object Definitions*/
                public final SlapmSpinLockEnt slapmSpinLock;

                public final SlapmPolicyCountQueriesEnt slapmPolicyCountQueries;

                public final SlapmPolicyCountAccessesEnt slapmPolicyCountAccesses;

                public final SlapmPolicyCountSuccessAccessesEnt slapmPolicyCountSuccessAccesses;

                public final SlapmPolicyCountNotFoundsEnt slapmPolicyCountNotFounds;

                /** 15 minute default purge time*/
                public final SlapmPolicyPurgeTimeEnt slapmPolicyPurgeTime;

                public final SlapmPolicyTrapEnableEnt slapmPolicyTrapEnable;

                public final SlapmPolicyTrapFilterEnt slapmPolicyTrapFilter;

                private SlapmBaseObjectsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                {
                    super(mib, parent, "slapmBaseObjects", "1.3.6.1.3.88.1.1", false, false, false, false);
                    this.slapmSpinLock = new SlapmSpinLockEnt(mib, this);
                    this.slapmPolicyCountQueries = new SlapmPolicyCountQueriesEnt(mib, this);
                    this.slapmPolicyCountAccesses = new SlapmPolicyCountAccessesEnt(mib, this);
                    this.slapmPolicyCountSuccessAccesses = new SlapmPolicyCountSuccessAccessesEnt(mib, this);
                    this.slapmPolicyCountNotFounds = new SlapmPolicyCountNotFoundsEnt(mib, this);
                    this.slapmPolicyPurgeTime = new SlapmPolicyPurgeTimeEnt(mib, this);
                    this.slapmPolicyTrapEnable = new SlapmPolicyTrapEnableEnt(mib, this);
                    this.slapmPolicyTrapFilter = new SlapmPolicyTrapFilterEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.slapmSpinLock,
                        this.slapmPolicyCountQueries,
                        this.slapmPolicyCountAccesses,
                        this.slapmPolicyCountSuccessAccesses,
                        this.slapmPolicyCountNotFounds,
                        this.slapmPolicyPurgeTime,
                        this.slapmPolicyTrapEnable,
                        this.slapmPolicyTrapFilter
                    };
                }
                public static final class SlapmSpinLockEnt extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmSpinLockEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmSpinLock", "1.3.6.1.3.88.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SlapmPolicyCountQueriesEnt extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmPolicyCountQueriesEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmPolicyCountQueries", "1.3.6.1.3.88.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SlapmPolicyCountAccessesEnt extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmPolicyCountAccessesEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmPolicyCountAccesses", "1.3.6.1.3.88.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SlapmPolicyCountSuccessAccessesEnt extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmPolicyCountSuccessAccessesEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmPolicyCountSuccessAccesses", "1.3.6.1.3.88.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SlapmPolicyCountNotFoundsEnt extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmPolicyCountNotFoundsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmPolicyCountNotFounds", "1.3.6.1.3.88.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SlapmPolicyPurgeTimeEnt extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmPolicyPurgeTimeEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmPolicyPurgeTime", "1.3.6.1.3.88.1.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SlapmPolicyTrapEnableEnt extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmPolicyTrapEnableEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmPolicyTrapEnable", "1.3.6.1.3.88.1.1.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SlapmPolicyTrapFilterEnt extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmPolicyTrapFilterEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmPolicyTrapFilter", "1.3.6.1.3.88.1.1.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SlapmTableObjectsEnt extends MIBEntry<SLAPMMIBDef>
            {
                /** Sla Performance Monitoring Policy Statistics Table*/
                public final SlapmPolicyStatsTableEnt slapmPolicyStatsTable;

                /** SLA Performance Monitoring Policy Monitor Table*/
                public final SlapmPolicyMonitorTableEnt slapmPolicyMonitorTable;

                /** Subcomponent Table*/
                public final SlapmSubcomponentTableEnt slapmSubcomponentTable;

                /** Table that maps an unsigned integer index to whatevernames a policy rule.*/
                public final SlapmPolicyNameTableEnt slapmPolicyNameTable;

                /** Sla Performance Monitoring Policy Rule Statistics Table*/
                public final SlapmPolicyRuleStatsTableEnt slapmPolicyRuleStatsTable;

                /** SLA Performance Monitoring Policy Rule Monitor Table*/
                public final SlapmPRMonTableEnt slapmPRMonTable;

                private SlapmTableObjectsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                {
                    super(mib, parent, "slapmTableObjects", "1.3.6.1.3.88.1.2", false, false, false, false);
                    this.slapmPolicyStatsTable = new SlapmPolicyStatsTableEnt(mib, this);
                    this.slapmPolicyMonitorTable = new SlapmPolicyMonitorTableEnt(mib, this);
                    this.slapmSubcomponentTable = new SlapmSubcomponentTableEnt(mib, this);
                    this.slapmPolicyNameTable = new SlapmPolicyNameTableEnt(mib, this);
                    this.slapmPolicyRuleStatsTable = new SlapmPolicyRuleStatsTableEnt(mib, this);
                    this.slapmPRMonTable = new SlapmPRMonTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.slapmPolicyStatsTable,
                        this.slapmPolicyMonitorTable,
                        this.slapmSubcomponentTable,
                        this.slapmPolicyNameTable,
                        this.slapmPolicyRuleStatsTable,
                        this.slapmPRMonTable
                    };
                }
                public static final class SlapmPolicyStatsTableEnt extends MIBEntry<SLAPMMIBDef>
                {
                    public final SlapmPolicyStatsEntryEnt slapmPolicyStatsEntry;

                    private SlapmPolicyStatsTableEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmPolicyStatsTable", "1.3.6.1.3.88.1.2.1", false, true, false, false);
                        this.slapmPolicyStatsEntry = new SlapmPolicyStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.slapmPolicyStatsEntry
                        };
                    }
                    public static final class SlapmPolicyStatsEntryEnt extends MIBEntry<SLAPMMIBDef>
                    {
                        public final SlapmPolicyStatsSystemAddressEnt slapmPolicyStatsSystemAddress;

                        public final SlapmPolicyStatsPolicyNameEnt slapmPolicyStatsPolicyName;

                        public final SlapmPolicyStatsTrafficProfileNameEnt slapmPolicyStatsTrafficProfileName;

                        public final SlapmPolicyStatsOperStatusEnt slapmPolicyStatsOperStatus;

                        public final SlapmPolicyStatsActiveConnsEnt slapmPolicyStatsActiveConns;

                        public final SlapmPolicyStatsTotalConnsEnt slapmPolicyStatsTotalConns;

                        public final SlapmPolicyStatsFirstActivatedEnt slapmPolicyStatsFirstActivated;

                        public final SlapmPolicyStatsLastMappingEnt slapmPolicyStatsLastMapping;

                        public final SlapmPolicyStatsInOctetsEnt slapmPolicyStatsInOctets;

                        public final SlapmPolicyStatsOutOctetsEnt slapmPolicyStatsOutOctets;

                        public final SlapmPolicyStatsConnectionLimitEnt slapmPolicyStatsConnectionLimit;

                        public final SlapmPolicyStatsCountAcceptsEnt slapmPolicyStatsCountAccepts;

                        public final SlapmPolicyStatsCountDeniesEnt slapmPolicyStatsCountDenies;

                        public final SlapmPolicyStatsInDiscardsEnt slapmPolicyStatsInDiscards;

                        public final SlapmPolicyStatsOutDiscardsEnt slapmPolicyStatsOutDiscards;

                        public final SlapmPolicyStatsInPacketsEnt slapmPolicyStatsInPackets;

                        public final SlapmPolicyStatsOutPacketsEnt slapmPolicyStatsOutPackets;

                        public final SlapmPolicyStatsInProfileOctetsEnt slapmPolicyStatsInProfileOctets;

                        public final SlapmPolicyStatsOutProfileOctetsEnt slapmPolicyStatsOutProfileOctets;

                        public final SlapmPolicyStatsMinRateEnt slapmPolicyStatsMinRate;

                        public final SlapmPolicyStatsMaxRateEnt slapmPolicyStatsMaxRate;

                        public final SlapmPolicyStatsMaxDelayEnt slapmPolicyStatsMaxDelay;

                        private SlapmPolicyStatsEntryEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                        {
                            super(mib, parent, "slapmPolicyStatsEntry", "1.3.6.1.3.88.1.2.1.1", false, false, false, true);
                            this.slapmPolicyStatsSystemAddress = new SlapmPolicyStatsSystemAddressEnt(mib, this);
                            this.slapmPolicyStatsPolicyName = new SlapmPolicyStatsPolicyNameEnt(mib, this);
                            this.slapmPolicyStatsTrafficProfileName = new SlapmPolicyStatsTrafficProfileNameEnt(mib, this);
                            this.slapmPolicyStatsOperStatus = new SlapmPolicyStatsOperStatusEnt(mib, this);
                            this.slapmPolicyStatsActiveConns = new SlapmPolicyStatsActiveConnsEnt(mib, this);
                            this.slapmPolicyStatsTotalConns = new SlapmPolicyStatsTotalConnsEnt(mib, this);
                            this.slapmPolicyStatsFirstActivated = new SlapmPolicyStatsFirstActivatedEnt(mib, this);
                            this.slapmPolicyStatsLastMapping = new SlapmPolicyStatsLastMappingEnt(mib, this);
                            this.slapmPolicyStatsInOctets = new SlapmPolicyStatsInOctetsEnt(mib, this);
                            this.slapmPolicyStatsOutOctets = new SlapmPolicyStatsOutOctetsEnt(mib, this);
                            this.slapmPolicyStatsConnectionLimit = new SlapmPolicyStatsConnectionLimitEnt(mib, this);
                            this.slapmPolicyStatsCountAccepts = new SlapmPolicyStatsCountAcceptsEnt(mib, this);
                            this.slapmPolicyStatsCountDenies = new SlapmPolicyStatsCountDeniesEnt(mib, this);
                            this.slapmPolicyStatsInDiscards = new SlapmPolicyStatsInDiscardsEnt(mib, this);
                            this.slapmPolicyStatsOutDiscards = new SlapmPolicyStatsOutDiscardsEnt(mib, this);
                            this.slapmPolicyStatsInPackets = new SlapmPolicyStatsInPacketsEnt(mib, this);
                            this.slapmPolicyStatsOutPackets = new SlapmPolicyStatsOutPacketsEnt(mib, this);
                            this.slapmPolicyStatsInProfileOctets = new SlapmPolicyStatsInProfileOctetsEnt(mib, this);
                            this.slapmPolicyStatsOutProfileOctets = new SlapmPolicyStatsOutProfileOctetsEnt(mib, this);
                            this.slapmPolicyStatsMinRate = new SlapmPolicyStatsMinRateEnt(mib, this);
                            this.slapmPolicyStatsMaxRate = new SlapmPolicyStatsMaxRateEnt(mib, this);
                            this.slapmPolicyStatsMaxDelay = new SlapmPolicyStatsMaxDelayEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.slapmPolicyStatsSystemAddress,
                                this.slapmPolicyStatsPolicyName,
                                this.slapmPolicyStatsTrafficProfileName,
                                this.slapmPolicyStatsOperStatus,
                                this.slapmPolicyStatsActiveConns,
                                this.slapmPolicyStatsTotalConns,
                                this.slapmPolicyStatsFirstActivated,
                                this.slapmPolicyStatsLastMapping,
                                this.slapmPolicyStatsInOctets,
                                this.slapmPolicyStatsOutOctets,
                                this.slapmPolicyStatsConnectionLimit,
                                this.slapmPolicyStatsCountAccepts,
                                this.slapmPolicyStatsCountDenies,
                                this.slapmPolicyStatsInDiscards,
                                this.slapmPolicyStatsOutDiscards,
                                this.slapmPolicyStatsInPackets,
                                this.slapmPolicyStatsOutPackets,
                                this.slapmPolicyStatsInProfileOctets,
                                this.slapmPolicyStatsOutProfileOctets,
                                this.slapmPolicyStatsMinRate,
                                this.slapmPolicyStatsMaxRate,
                                this.slapmPolicyStatsMaxDelay
                            };
                        }
                        public static final class SlapmPolicyStatsSystemAddressEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsSystemAddressEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsSystemAddress", "1.3.6.1.3.88.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsPolicyNameEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsPolicyNameEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsPolicyName", "1.3.6.1.3.88.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsTrafficProfileNameEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsTrafficProfileNameEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsTrafficProfileName", "1.3.6.1.3.88.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsOperStatusEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsOperStatusEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsOperStatus", "1.3.6.1.3.88.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsActiveConnsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsActiveConnsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsActiveConns", "1.3.6.1.3.88.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsTotalConnsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsTotalConnsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsTotalConns", "1.3.6.1.3.88.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsFirstActivatedEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsFirstActivatedEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsFirstActivated", "1.3.6.1.3.88.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsLastMappingEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsLastMappingEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsLastMapping", "1.3.6.1.3.88.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsInOctetsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsInOctetsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsInOctets", "1.3.6.1.3.88.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsOutOctetsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsOutOctetsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsOutOctets", "1.3.6.1.3.88.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsConnectionLimitEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsConnectionLimitEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsConnectionLimit", "1.3.6.1.3.88.1.2.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsCountAcceptsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsCountAcceptsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsCountAccepts", "1.3.6.1.3.88.1.2.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsCountDeniesEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsCountDeniesEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsCountDenies", "1.3.6.1.3.88.1.2.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsInDiscardsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsInDiscardsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsInDiscards", "1.3.6.1.3.88.1.2.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsOutDiscardsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsOutDiscardsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsOutDiscards", "1.3.6.1.3.88.1.2.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsInPacketsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsInPacketsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsInPackets", "1.3.6.1.3.88.1.2.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsOutPacketsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsOutPacketsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsOutPackets", "1.3.6.1.3.88.1.2.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsInProfileOctetsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsInProfileOctetsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsInProfileOctets", "1.3.6.1.3.88.1.2.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsOutProfileOctetsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsOutProfileOctetsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsOutProfileOctets", "1.3.6.1.3.88.1.2.1.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsMinRateEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsMinRateEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsMinRate", "1.3.6.1.3.88.1.2.1.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsMaxRateEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsMaxRateEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsMaxRate", "1.3.6.1.3.88.1.2.1.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyStatsMaxDelayEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyStatsMaxDelayEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyStatsMaxDelay", "1.3.6.1.3.88.1.2.1.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SlapmPolicyMonitorTableEnt extends MIBEntry<SLAPMMIBDef>
                {
                    public final SlapmPolicyMonitorEntryEnt slapmPolicyMonitorEntry;

                    private SlapmPolicyMonitorTableEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmPolicyMonitorTable", "1.3.6.1.3.88.1.2.2", false, true, false, false);
                        this.slapmPolicyMonitorEntry = new SlapmPolicyMonitorEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.slapmPolicyMonitorEntry
                        };
                    }
                    public static final class SlapmPolicyMonitorEntryEnt extends MIBEntry<SLAPMMIBDef>
                    {
                        public final SlapmPolicyMonitorOwnerIndexEnt slapmPolicyMonitorOwnerIndex;

                        public final SlapmPolicyMonitorSystemAddressEnt slapmPolicyMonitorSystemAddress;

                        public final SlapmPolicyMonitorPolicyNameEnt slapmPolicyMonitorPolicyName;

                        public final SlapmPolicyMonitorTrafficProfileNameEnt slapmPolicyMonitorTrafficProfileName;

                        public final SlapmPolicyMonitorControlEnt slapmPolicyMonitorControl;

                        public final SlapmPolicyMonitorStatusEnt slapmPolicyMonitorStatus;

                        /** 20 seconds*/
                        public final SlapmPolicyMonitorIntervalEnt slapmPolicyMonitorInterval;

                        public final SlapmPolicyMonitorIntTimeEnt slapmPolicyMonitorIntTime;

                        public final SlapmPolicyMonitorCurrentInRateEnt slapmPolicyMonitorCurrentInRate;

                        public final SlapmPolicyMonitorCurrentOutRateEnt slapmPolicyMonitorCurrentOutRate;

                        public final SlapmPolicyMonitorMinRateLowEnt slapmPolicyMonitorMinRateLow;

                        public final SlapmPolicyMonitorMinRateHighEnt slapmPolicyMonitorMinRateHigh;

                        public final SlapmPolicyMonitorMaxRateHighEnt slapmPolicyMonitorMaxRateHigh;

                        public final SlapmPolicyMonitorMaxRateLowEnt slapmPolicyMonitorMaxRateLow;

                        public final SlapmPolicyMonitorMaxDelayHighEnt slapmPolicyMonitorMaxDelayHigh;

                        public final SlapmPolicyMonitorMaxDelayLowEnt slapmPolicyMonitorMaxDelayLow;

                        public final SlapmPolicyMonitorMinInRateNotAchievesEnt slapmPolicyMonitorMinInRateNotAchieves;

                        public final SlapmPolicyMonitorMaxInRateExceedsEnt slapmPolicyMonitorMaxInRateExceeds;

                        public final SlapmPolicyMonitorMaxDelayExceedsEnt slapmPolicyMonitorMaxDelayExceeds;

                        public final SlapmPolicyMonitorMinOutRateNotAchievesEnt slapmPolicyMonitorMinOutRateNotAchieves;

                        public final SlapmPolicyMonitorMaxOutRateExceedsEnt slapmPolicyMonitorMaxOutRateExceeds;

                        public final SlapmPolicyMonitorCurrentDelayRateEnt slapmPolicyMonitorCurrentDelayRate;

                        public final SlapmPolicyMonitorRowStatusEnt slapmPolicyMonitorRowStatus;

                        private SlapmPolicyMonitorEntryEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                        {
                            super(mib, parent, "slapmPolicyMonitorEntry", "1.3.6.1.3.88.1.2.2.1", false, false, false, true);
                            this.slapmPolicyMonitorOwnerIndex = new SlapmPolicyMonitorOwnerIndexEnt(mib, this);
                            this.slapmPolicyMonitorSystemAddress = new SlapmPolicyMonitorSystemAddressEnt(mib, this);
                            this.slapmPolicyMonitorPolicyName = new SlapmPolicyMonitorPolicyNameEnt(mib, this);
                            this.slapmPolicyMonitorTrafficProfileName = new SlapmPolicyMonitorTrafficProfileNameEnt(mib, this);
                            this.slapmPolicyMonitorControl = new SlapmPolicyMonitorControlEnt(mib, this);
                            this.slapmPolicyMonitorStatus = new SlapmPolicyMonitorStatusEnt(mib, this);
                            this.slapmPolicyMonitorInterval = new SlapmPolicyMonitorIntervalEnt(mib, this);
                            this.slapmPolicyMonitorIntTime = new SlapmPolicyMonitorIntTimeEnt(mib, this);
                            this.slapmPolicyMonitorCurrentInRate = new SlapmPolicyMonitorCurrentInRateEnt(mib, this);
                            this.slapmPolicyMonitorCurrentOutRate = new SlapmPolicyMonitorCurrentOutRateEnt(mib, this);
                            this.slapmPolicyMonitorMinRateLow = new SlapmPolicyMonitorMinRateLowEnt(mib, this);
                            this.slapmPolicyMonitorMinRateHigh = new SlapmPolicyMonitorMinRateHighEnt(mib, this);
                            this.slapmPolicyMonitorMaxRateHigh = new SlapmPolicyMonitorMaxRateHighEnt(mib, this);
                            this.slapmPolicyMonitorMaxRateLow = new SlapmPolicyMonitorMaxRateLowEnt(mib, this);
                            this.slapmPolicyMonitorMaxDelayHigh = new SlapmPolicyMonitorMaxDelayHighEnt(mib, this);
                            this.slapmPolicyMonitorMaxDelayLow = new SlapmPolicyMonitorMaxDelayLowEnt(mib, this);
                            this.slapmPolicyMonitorMinInRateNotAchieves = new SlapmPolicyMonitorMinInRateNotAchievesEnt(mib, this);
                            this.slapmPolicyMonitorMaxInRateExceeds = new SlapmPolicyMonitorMaxInRateExceedsEnt(mib, this);
                            this.slapmPolicyMonitorMaxDelayExceeds = new SlapmPolicyMonitorMaxDelayExceedsEnt(mib, this);
                            this.slapmPolicyMonitorMinOutRateNotAchieves = new SlapmPolicyMonitorMinOutRateNotAchievesEnt(mib, this);
                            this.slapmPolicyMonitorMaxOutRateExceeds = new SlapmPolicyMonitorMaxOutRateExceedsEnt(mib, this);
                            this.slapmPolicyMonitorCurrentDelayRate = new SlapmPolicyMonitorCurrentDelayRateEnt(mib, this);
                            this.slapmPolicyMonitorRowStatus = new SlapmPolicyMonitorRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.slapmPolicyMonitorOwnerIndex,
                                this.slapmPolicyMonitorSystemAddress,
                                this.slapmPolicyMonitorPolicyName,
                                this.slapmPolicyMonitorTrafficProfileName,
                                this.slapmPolicyMonitorControl,
                                this.slapmPolicyMonitorStatus,
                                this.slapmPolicyMonitorInterval,
                                this.slapmPolicyMonitorIntTime,
                                this.slapmPolicyMonitorCurrentInRate,
                                this.slapmPolicyMonitorCurrentOutRate,
                                this.slapmPolicyMonitorMinRateLow,
                                this.slapmPolicyMonitorMinRateHigh,
                                this.slapmPolicyMonitorMaxRateHigh,
                                this.slapmPolicyMonitorMaxRateLow,
                                this.slapmPolicyMonitorMaxDelayHigh,
                                this.slapmPolicyMonitorMaxDelayLow,
                                this.slapmPolicyMonitorMinInRateNotAchieves,
                                this.slapmPolicyMonitorMaxInRateExceeds,
                                this.slapmPolicyMonitorMaxDelayExceeds,
                                this.slapmPolicyMonitorMinOutRateNotAchieves,
                                this.slapmPolicyMonitorMaxOutRateExceeds,
                                this.slapmPolicyMonitorCurrentDelayRate,
                                this.slapmPolicyMonitorRowStatus
                            };
                        }
                        public static final class SlapmPolicyMonitorOwnerIndexEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorOwnerIndexEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorOwnerIndex", "1.3.6.1.3.88.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorSystemAddressEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorSystemAddressEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorSystemAddress", "1.3.6.1.3.88.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorPolicyNameEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorPolicyNameEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorPolicyName", "1.3.6.1.3.88.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorTrafficProfileNameEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorTrafficProfileNameEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorTrafficProfileName", "1.3.6.1.3.88.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorControlEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorControlEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorControl", "1.3.6.1.3.88.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorStatusEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorStatusEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorStatus", "1.3.6.1.3.88.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorIntervalEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorIntervalEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorInterval", "1.3.6.1.3.88.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorIntTimeEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorIntTimeEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorIntTime", "1.3.6.1.3.88.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorCurrentInRateEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorCurrentInRateEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorCurrentInRate", "1.3.6.1.3.88.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorCurrentOutRateEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorCurrentOutRateEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorCurrentOutRate", "1.3.6.1.3.88.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorMinRateLowEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorMinRateLowEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorMinRateLow", "1.3.6.1.3.88.1.2.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorMinRateHighEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorMinRateHighEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorMinRateHigh", "1.3.6.1.3.88.1.2.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorMaxRateHighEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorMaxRateHighEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorMaxRateHigh", "1.3.6.1.3.88.1.2.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorMaxRateLowEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorMaxRateLowEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorMaxRateLow", "1.3.6.1.3.88.1.2.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorMaxDelayHighEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorMaxDelayHighEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorMaxDelayHigh", "1.3.6.1.3.88.1.2.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorMaxDelayLowEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorMaxDelayLowEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorMaxDelayLow", "1.3.6.1.3.88.1.2.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorMinInRateNotAchievesEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorMinInRateNotAchievesEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorMinInRateNotAchieves", "1.3.6.1.3.88.1.2.2.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorMaxInRateExceedsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorMaxInRateExceedsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorMaxInRateExceeds", "1.3.6.1.3.88.1.2.2.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorMaxDelayExceedsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorMaxDelayExceedsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorMaxDelayExceeds", "1.3.6.1.3.88.1.2.2.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorMinOutRateNotAchievesEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorMinOutRateNotAchievesEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorMinOutRateNotAchieves", "1.3.6.1.3.88.1.2.2.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorMaxOutRateExceedsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorMaxOutRateExceedsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorMaxOutRateExceeds", "1.3.6.1.3.88.1.2.2.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorCurrentDelayRateEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorCurrentDelayRateEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorCurrentDelayRate", "1.3.6.1.3.88.1.2.2.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyMonitorRowStatusEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyMonitorRowStatusEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyMonitorRowStatus", "1.3.6.1.3.88.1.2.2.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SlapmSubcomponentTableEnt extends MIBEntry<SLAPMMIBDef>
                {
                    public final SlapmSubcomponentEntryEnt slapmSubcomponentEntry;

                    private SlapmSubcomponentTableEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmSubcomponentTable", "1.3.6.1.3.88.1.2.3", false, true, false, false);
                        this.slapmSubcomponentEntry = new SlapmSubcomponentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.slapmSubcomponentEntry
                        };
                    }
                    public static final class SlapmSubcomponentEntryEnt extends MIBEntry<SLAPMMIBDef>
                    {
                        public final SlapmSubcomponentRemAddressEnt slapmSubcomponentRemAddress;

                        public final SlapmSubcomponentRemPortEnt slapmSubcomponentRemPort;

                        public final SlapmSubcomponentLocalAddressEnt slapmSubcomponentLocalAddress;

                        public final SlapmSubcomponentLocalPortEnt slapmSubcomponentLocalPort;

                        public final SlapmSubcomponentProtocolEnt slapmSubcomponentProtocol;

                        public final SlapmSubcomponentSystemAddressEnt slapmSubcomponentSystemAddress;

                        public final SlapmSubcomponentPolicyNameEnt slapmSubcomponentPolicyName;

                        public final SlapmSubcomponentTrafficProfileNameEnt slapmSubcomponentTrafficProfileName;

                        public final SlapmSubcomponentLastActivityEnt slapmSubcomponentLastActivity;

                        public final SlapmSubcomponentInOctetsEnt slapmSubcomponentInOctets;

                        public final SlapmSubcomponentOutOctetsEnt slapmSubcomponentOutOctets;

                        public final SlapmSubcomponentTcpOutBufferedOctetsEnt slapmSubcomponentTcpOutBufferedOctets;

                        public final SlapmSubcomponentTcpInBufferedOctetsEnt slapmSubcomponentTcpInBufferedOctets;

                        public final SlapmSubcomponentTcpReXmtsEnt slapmSubcomponentTcpReXmts;

                        public final SlapmSubcomponentTcpRoundTripTimeEnt slapmSubcomponentTcpRoundTripTime;

                        public final SlapmSubcomponentTcpRoundTripVarianceEnt slapmSubcomponentTcpRoundTripVariance;

                        public final SlapmSubcomponentInPdusEnt slapmSubcomponentInPdus;

                        public final SlapmSubcomponentOutPdusEnt slapmSubcomponentOutPdus;

                        public final SlapmSubcomponentApplNameEnt slapmSubcomponentApplName;

                        public final SlapmSubcomponentMonitorStatusEnt slapmSubcomponentMonitorStatus;

                        public final SlapmSubcomponentMonitorIntTimeEnt slapmSubcomponentMonitorIntTime;

                        public final SlapmSubcomponentMonitorCurrentInRateEnt slapmSubcomponentMonitorCurrentInRate;

                        public final SlapmSubcomponentMonitorCurrentOutRateEnt slapmSubcomponentMonitorCurrentOutRate;

                        public final SlapmSubcomponentPolicyRuleIndexEnt slapmSubcomponentPolicyRuleIndex;

                        private SlapmSubcomponentEntryEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                        {
                            super(mib, parent, "slapmSubcomponentEntry", "1.3.6.1.3.88.1.2.3.1", false, false, false, true);
                            this.slapmSubcomponentRemAddress = new SlapmSubcomponentRemAddressEnt(mib, this);
                            this.slapmSubcomponentRemPort = new SlapmSubcomponentRemPortEnt(mib, this);
                            this.slapmSubcomponentLocalAddress = new SlapmSubcomponentLocalAddressEnt(mib, this);
                            this.slapmSubcomponentLocalPort = new SlapmSubcomponentLocalPortEnt(mib, this);
                            this.slapmSubcomponentProtocol = new SlapmSubcomponentProtocolEnt(mib, this);
                            this.slapmSubcomponentSystemAddress = new SlapmSubcomponentSystemAddressEnt(mib, this);
                            this.slapmSubcomponentPolicyName = new SlapmSubcomponentPolicyNameEnt(mib, this);
                            this.slapmSubcomponentTrafficProfileName = new SlapmSubcomponentTrafficProfileNameEnt(mib, this);
                            this.slapmSubcomponentLastActivity = new SlapmSubcomponentLastActivityEnt(mib, this);
                            this.slapmSubcomponentInOctets = new SlapmSubcomponentInOctetsEnt(mib, this);
                            this.slapmSubcomponentOutOctets = new SlapmSubcomponentOutOctetsEnt(mib, this);
                            this.slapmSubcomponentTcpOutBufferedOctets = new SlapmSubcomponentTcpOutBufferedOctetsEnt(mib, this);
                            this.slapmSubcomponentTcpInBufferedOctets = new SlapmSubcomponentTcpInBufferedOctetsEnt(mib, this);
                            this.slapmSubcomponentTcpReXmts = new SlapmSubcomponentTcpReXmtsEnt(mib, this);
                            this.slapmSubcomponentTcpRoundTripTime = new SlapmSubcomponentTcpRoundTripTimeEnt(mib, this);
                            this.slapmSubcomponentTcpRoundTripVariance = new SlapmSubcomponentTcpRoundTripVarianceEnt(mib, this);
                            this.slapmSubcomponentInPdus = new SlapmSubcomponentInPdusEnt(mib, this);
                            this.slapmSubcomponentOutPdus = new SlapmSubcomponentOutPdusEnt(mib, this);
                            this.slapmSubcomponentApplName = new SlapmSubcomponentApplNameEnt(mib, this);
                            this.slapmSubcomponentMonitorStatus = new SlapmSubcomponentMonitorStatusEnt(mib, this);
                            this.slapmSubcomponentMonitorIntTime = new SlapmSubcomponentMonitorIntTimeEnt(mib, this);
                            this.slapmSubcomponentMonitorCurrentInRate = new SlapmSubcomponentMonitorCurrentInRateEnt(mib, this);
                            this.slapmSubcomponentMonitorCurrentOutRate = new SlapmSubcomponentMonitorCurrentOutRateEnt(mib, this);
                            this.slapmSubcomponentPolicyRuleIndex = new SlapmSubcomponentPolicyRuleIndexEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.slapmSubcomponentRemAddress,
                                this.slapmSubcomponentRemPort,
                                this.slapmSubcomponentLocalAddress,
                                this.slapmSubcomponentLocalPort,
                                this.slapmSubcomponentProtocol,
                                this.slapmSubcomponentSystemAddress,
                                this.slapmSubcomponentPolicyName,
                                this.slapmSubcomponentTrafficProfileName,
                                this.slapmSubcomponentLastActivity,
                                this.slapmSubcomponentInOctets,
                                this.slapmSubcomponentOutOctets,
                                this.slapmSubcomponentTcpOutBufferedOctets,
                                this.slapmSubcomponentTcpInBufferedOctets,
                                this.slapmSubcomponentTcpReXmts,
                                this.slapmSubcomponentTcpRoundTripTime,
                                this.slapmSubcomponentTcpRoundTripVariance,
                                this.slapmSubcomponentInPdus,
                                this.slapmSubcomponentOutPdus,
                                this.slapmSubcomponentApplName,
                                this.slapmSubcomponentMonitorStatus,
                                this.slapmSubcomponentMonitorIntTime,
                                this.slapmSubcomponentMonitorCurrentInRate,
                                this.slapmSubcomponentMonitorCurrentOutRate,
                                this.slapmSubcomponentPolicyRuleIndex
                            };
                        }
                        public static final class SlapmSubcomponentRemAddressEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentRemAddressEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentRemAddress", "1.3.6.1.3.88.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentRemPortEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentRemPortEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentRemPort", "1.3.6.1.3.88.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentLocalAddressEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentLocalAddressEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentLocalAddress", "1.3.6.1.3.88.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentLocalPortEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentLocalPortEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentLocalPort", "1.3.6.1.3.88.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentProtocolEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentProtocolEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentProtocol", "1.3.6.1.3.88.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentSystemAddressEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentSystemAddressEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentSystemAddress", "1.3.6.1.3.88.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentPolicyNameEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentPolicyNameEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentPolicyName", "1.3.6.1.3.88.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentTrafficProfileNameEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentTrafficProfileNameEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentTrafficProfileName", "1.3.6.1.3.88.1.2.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentLastActivityEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentLastActivityEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentLastActivity", "1.3.6.1.3.88.1.2.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentInOctetsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentInOctetsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentInOctets", "1.3.6.1.3.88.1.2.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentOutOctetsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentOutOctetsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentOutOctets", "1.3.6.1.3.88.1.2.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentTcpOutBufferedOctetsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentTcpOutBufferedOctetsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentTcpOutBufferedOctets", "1.3.6.1.3.88.1.2.3.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentTcpInBufferedOctetsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentTcpInBufferedOctetsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentTcpInBufferedOctets", "1.3.6.1.3.88.1.2.3.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentTcpReXmtsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentTcpReXmtsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentTcpReXmts", "1.3.6.1.3.88.1.2.3.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentTcpRoundTripTimeEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentTcpRoundTripTimeEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentTcpRoundTripTime", "1.3.6.1.3.88.1.2.3.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentTcpRoundTripVarianceEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentTcpRoundTripVarianceEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentTcpRoundTripVariance", "1.3.6.1.3.88.1.2.3.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentInPdusEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentInPdusEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentInPdus", "1.3.6.1.3.88.1.2.3.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentOutPdusEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentOutPdusEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentOutPdus", "1.3.6.1.3.88.1.2.3.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentApplNameEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentApplNameEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentApplName", "1.3.6.1.3.88.1.2.3.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentMonitorStatusEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentMonitorStatusEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentMonitorStatus", "1.3.6.1.3.88.1.2.3.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentMonitorIntTimeEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentMonitorIntTimeEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentMonitorIntTime", "1.3.6.1.3.88.1.2.3.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentMonitorCurrentInRateEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentMonitorCurrentInRateEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentMonitorCurrentInRate", "1.3.6.1.3.88.1.2.3.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentMonitorCurrentOutRateEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentMonitorCurrentOutRateEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentMonitorCurrentOutRate", "1.3.6.1.3.88.1.2.3.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmSubcomponentPolicyRuleIndexEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmSubcomponentPolicyRuleIndexEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmSubcomponentPolicyRuleIndex", "1.3.6.1.3.88.1.2.3.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SlapmPolicyNameTableEnt extends MIBEntry<SLAPMMIBDef>
                {
                    public final SlapmPolicyNameEntryEnt slapmPolicyNameEntry;

                    private SlapmPolicyNameTableEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmPolicyNameTable", "1.3.6.1.3.88.1.2.4", false, true, false, false);
                        this.slapmPolicyNameEntry = new SlapmPolicyNameEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.slapmPolicyNameEntry
                        };
                    }
                    public static final class SlapmPolicyNameEntryEnt extends MIBEntry<SLAPMMIBDef>
                    {
                        public final SlapmPolicyNameSystemAddressEnt slapmPolicyNameSystemAddress;

                        public final SlapmPolicyNameIndexEnt slapmPolicyNameIndex;

                        public final SlapmPolicyNameOfRuleEnt slapmPolicyNameOfRule;

                        private SlapmPolicyNameEntryEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                        {
                            super(mib, parent, "slapmPolicyNameEntry", "1.3.6.1.3.88.1.2.4.1", false, false, false, true);
                            this.slapmPolicyNameSystemAddress = new SlapmPolicyNameSystemAddressEnt(mib, this);
                            this.slapmPolicyNameIndex = new SlapmPolicyNameIndexEnt(mib, this);
                            this.slapmPolicyNameOfRule = new SlapmPolicyNameOfRuleEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.slapmPolicyNameSystemAddress,
                                this.slapmPolicyNameIndex,
                                this.slapmPolicyNameOfRule
                            };
                        }
                        public static final class SlapmPolicyNameSystemAddressEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyNameSystemAddressEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyNameSystemAddress", "1.3.6.1.3.88.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyNameIndexEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyNameIndexEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyNameIndex", "1.3.6.1.3.88.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyNameOfRuleEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyNameOfRuleEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyNameOfRule", "1.3.6.1.3.88.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SlapmPolicyRuleStatsTableEnt extends MIBEntry<SLAPMMIBDef>
                {
                    public final SlapmPolicyRuleStatsEntryEnt slapmPolicyRuleStatsEntry;

                    private SlapmPolicyRuleStatsTableEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmPolicyRuleStatsTable", "1.3.6.1.3.88.1.2.5", false, true, false, false);
                        this.slapmPolicyRuleStatsEntry = new SlapmPolicyRuleStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.slapmPolicyRuleStatsEntry
                        };
                    }
                    public static final class SlapmPolicyRuleStatsEntryEnt extends MIBEntry<SLAPMMIBDef>
                    {
                        public final SlapmPolicyRuleStatsOperStatusEnt slapmPolicyRuleStatsOperStatus;

                        public final SlapmPolicyRuleStatsActiveConnsEnt slapmPolicyRuleStatsActiveConns;

                        public final SlapmPolicyRuleStatsTotalConnsEnt slapmPolicyRuleStatsTotalConns;

                        public final SlapmPolicyRuleStatsLActivatedEnt slapmPolicyRuleStatsLActivated;

                        public final SlapmPolicyRuleStatsLastMappingEnt slapmPolicyRuleStatsLastMapping;

                        public final SlapmPolicyRuleStatsInOctetsEnt slapmPolicyRuleStatsInOctets;

                        public final SlapmPolicyRuleStatsOutOctetsEnt slapmPolicyRuleStatsOutOctets;

                        public final SlapmPolicyRuleStatsConnLimitEnt slapmPolicyRuleStatsConnLimit;

                        public final SlapmPolicyRuleStatsCountAcceptsEnt slapmPolicyRuleStatsCountAccepts;

                        public final SlapmPolicyRuleStatsCountDeniesEnt slapmPolicyRuleStatsCountDenies;

                        public final SlapmPolicyRuleStatsInDiscardsEnt slapmPolicyRuleStatsInDiscards;

                        public final SlapmPolicyRuleStatsOutDiscardsEnt slapmPolicyRuleStatsOutDiscards;

                        public final SlapmPolicyRuleStatsInPacketsEnt slapmPolicyRuleStatsInPackets;

                        public final SlapmPolicyRuleStatsOutPacketsEnt slapmPolicyRuleStatsOutPackets;

                        public final SlapmPolicyRuleStatsInProOctetsEnt slapmPolicyRuleStatsInProOctets;

                        public final SlapmPolicyRuleStatsOutProOctetsEnt slapmPolicyRuleStatsOutProOctets;

                        public final SlapmPolicyRuleStatsMinRateEnt slapmPolicyRuleStatsMinRate;

                        public final SlapmPolicyRuleStatsMaxRateEnt slapmPolicyRuleStatsMaxRate;

                        public final SlapmPolicyRuleStatsMaxDelayEnt slapmPolicyRuleStatsMaxDelay;

                        public final SlapmPolicyRuleStatsTotalRsvpFlowsEnt slapmPolicyRuleStatsTotalRsvpFlows;

                        public final SlapmPolicyRuleStatsActRsvpFlowsEnt slapmPolicyRuleStatsActRsvpFlows;

                        private SlapmPolicyRuleStatsEntryEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                        {
                            super(mib, parent, "slapmPolicyRuleStatsEntry", "1.3.6.1.3.88.1.2.5.1", false, false, false, true);
                            this.slapmPolicyRuleStatsOperStatus = new SlapmPolicyRuleStatsOperStatusEnt(mib, this);
                            this.slapmPolicyRuleStatsActiveConns = new SlapmPolicyRuleStatsActiveConnsEnt(mib, this);
                            this.slapmPolicyRuleStatsTotalConns = new SlapmPolicyRuleStatsTotalConnsEnt(mib, this);
                            this.slapmPolicyRuleStatsLActivated = new SlapmPolicyRuleStatsLActivatedEnt(mib, this);
                            this.slapmPolicyRuleStatsLastMapping = new SlapmPolicyRuleStatsLastMappingEnt(mib, this);
                            this.slapmPolicyRuleStatsInOctets = new SlapmPolicyRuleStatsInOctetsEnt(mib, this);
                            this.slapmPolicyRuleStatsOutOctets = new SlapmPolicyRuleStatsOutOctetsEnt(mib, this);
                            this.slapmPolicyRuleStatsConnLimit = new SlapmPolicyRuleStatsConnLimitEnt(mib, this);
                            this.slapmPolicyRuleStatsCountAccepts = new SlapmPolicyRuleStatsCountAcceptsEnt(mib, this);
                            this.slapmPolicyRuleStatsCountDenies = new SlapmPolicyRuleStatsCountDeniesEnt(mib, this);
                            this.slapmPolicyRuleStatsInDiscards = new SlapmPolicyRuleStatsInDiscardsEnt(mib, this);
                            this.slapmPolicyRuleStatsOutDiscards = new SlapmPolicyRuleStatsOutDiscardsEnt(mib, this);
                            this.slapmPolicyRuleStatsInPackets = new SlapmPolicyRuleStatsInPacketsEnt(mib, this);
                            this.slapmPolicyRuleStatsOutPackets = new SlapmPolicyRuleStatsOutPacketsEnt(mib, this);
                            this.slapmPolicyRuleStatsInProOctets = new SlapmPolicyRuleStatsInProOctetsEnt(mib, this);
                            this.slapmPolicyRuleStatsOutProOctets = new SlapmPolicyRuleStatsOutProOctetsEnt(mib, this);
                            this.slapmPolicyRuleStatsMinRate = new SlapmPolicyRuleStatsMinRateEnt(mib, this);
                            this.slapmPolicyRuleStatsMaxRate = new SlapmPolicyRuleStatsMaxRateEnt(mib, this);
                            this.slapmPolicyRuleStatsMaxDelay = new SlapmPolicyRuleStatsMaxDelayEnt(mib, this);
                            this.slapmPolicyRuleStatsTotalRsvpFlows = new SlapmPolicyRuleStatsTotalRsvpFlowsEnt(mib, this);
                            this.slapmPolicyRuleStatsActRsvpFlows = new SlapmPolicyRuleStatsActRsvpFlowsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.slapmPolicyRuleStatsOperStatus,
                                this.slapmPolicyRuleStatsActiveConns,
                                this.slapmPolicyRuleStatsTotalConns,
                                this.slapmPolicyRuleStatsLActivated,
                                this.slapmPolicyRuleStatsLastMapping,
                                this.slapmPolicyRuleStatsInOctets,
                                this.slapmPolicyRuleStatsOutOctets,
                                this.slapmPolicyRuleStatsConnLimit,
                                this.slapmPolicyRuleStatsCountAccepts,
                                this.slapmPolicyRuleStatsCountDenies,
                                this.slapmPolicyRuleStatsInDiscards,
                                this.slapmPolicyRuleStatsOutDiscards,
                                this.slapmPolicyRuleStatsInPackets,
                                this.slapmPolicyRuleStatsOutPackets,
                                this.slapmPolicyRuleStatsInProOctets,
                                this.slapmPolicyRuleStatsOutProOctets,
                                this.slapmPolicyRuleStatsMinRate,
                                this.slapmPolicyRuleStatsMaxRate,
                                this.slapmPolicyRuleStatsMaxDelay,
                                this.slapmPolicyRuleStatsTotalRsvpFlows,
                                this.slapmPolicyRuleStatsActRsvpFlows
                            };
                        }
                        public static final class SlapmPolicyRuleStatsOperStatusEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsOperStatusEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsOperStatus", "1.3.6.1.3.88.1.2.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsActiveConnsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsActiveConnsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsActiveConns", "1.3.6.1.3.88.1.2.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsTotalConnsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsTotalConnsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsTotalConns", "1.3.6.1.3.88.1.2.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsLActivatedEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsLActivatedEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsLActivated", "1.3.6.1.3.88.1.2.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsLastMappingEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsLastMappingEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsLastMapping", "1.3.6.1.3.88.1.2.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsInOctetsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsInOctetsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsInOctets", "1.3.6.1.3.88.1.2.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsOutOctetsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsOutOctetsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsOutOctets", "1.3.6.1.3.88.1.2.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsConnLimitEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsConnLimitEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsConnLimit", "1.3.6.1.3.88.1.2.5.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsCountAcceptsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsCountAcceptsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsCountAccepts", "1.3.6.1.3.88.1.2.5.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsCountDeniesEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsCountDeniesEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsCountDenies", "1.3.6.1.3.88.1.2.5.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsInDiscardsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsInDiscardsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsInDiscards", "1.3.6.1.3.88.1.2.5.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsOutDiscardsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsOutDiscardsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsOutDiscards", "1.3.6.1.3.88.1.2.5.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsInPacketsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsInPacketsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsInPackets", "1.3.6.1.3.88.1.2.5.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsOutPacketsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsOutPacketsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsOutPackets", "1.3.6.1.3.88.1.2.5.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsInProOctetsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsInProOctetsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsInProOctets", "1.3.6.1.3.88.1.2.5.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsOutProOctetsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsOutProOctetsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsOutProOctets", "1.3.6.1.3.88.1.2.5.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsMinRateEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsMinRateEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsMinRate", "1.3.6.1.3.88.1.2.5.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsMaxRateEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsMaxRateEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsMaxRate", "1.3.6.1.3.88.1.2.5.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsMaxDelayEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsMaxDelayEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsMaxDelay", "1.3.6.1.3.88.1.2.5.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsTotalRsvpFlowsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsTotalRsvpFlowsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsTotalRsvpFlows", "1.3.6.1.3.88.1.2.5.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPolicyRuleStatsActRsvpFlowsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPolicyRuleStatsActRsvpFlowsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPolicyRuleStatsActRsvpFlows", "1.3.6.1.3.88.1.2.5.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SlapmPRMonTableEnt extends MIBEntry<SLAPMMIBDef>
                {
                    public final SlapmPRMonEntryEnt slapmPRMonEntry;

                    private SlapmPRMonTableEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmPRMonTable", "1.3.6.1.3.88.1.2.6", false, true, false, false);
                        this.slapmPRMonEntry = new SlapmPRMonEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.slapmPRMonEntry
                        };
                    }
                    public static final class SlapmPRMonEntryEnt extends MIBEntry<SLAPMMIBDef>
                    {
                        public final SlapmPRMonOwnerIndexEnt slapmPRMonOwnerIndex;

                        public final SlapmPRMonSystemAddressEnt slapmPRMonSystemAddress;

                        public final SlapmPRMonIndexEnt slapmPRMonIndex;

                        public final SlapmPRMonControlEnt slapmPRMonControl;

                        public final SlapmPRMonStatusEnt slapmPRMonStatus;

                        /** 20 seconds*/
                        public final SlapmPRMonIntervalEnt slapmPRMonInterval;

                        public final SlapmPRMonIntTimeEnt slapmPRMonIntTime;

                        public final SlapmPRMonCurrentInRateEnt slapmPRMonCurrentInRate;

                        public final SlapmPRMonCurrentOutRateEnt slapmPRMonCurrentOutRate;

                        public final SlapmPRMonMinRateLowEnt slapmPRMonMinRateLow;

                        public final SlapmPRMonMinRateHighEnt slapmPRMonMinRateHigh;

                        public final SlapmPRMonMaxRateHighEnt slapmPRMonMaxRateHigh;

                        public final SlapmPRMonMaxRateLowEnt slapmPRMonMaxRateLow;

                        public final SlapmPRMonMaxDelayHighEnt slapmPRMonMaxDelayHigh;

                        public final SlapmPRMonMaxDelayLowEnt slapmPRMonMaxDelayLow;

                        public final SlapmPRMonMinInRateNotAchievesEnt slapmPRMonMinInRateNotAchieves;

                        public final SlapmPRMonMaxInRateExceedsEnt slapmPRMonMaxInRateExceeds;

                        public final SlapmPRMonMaxDelayExceedsEnt slapmPRMonMaxDelayExceeds;

                        public final SlapmPRMonMinOutRateNotAchievesEnt slapmPRMonMinOutRateNotAchieves;

                        public final SlapmPRMonMaxOutRateExceedsEnt slapmPRMonMaxOutRateExceeds;

                        public final SlapmPRMonCurrentDelayRateEnt slapmPRMonCurrentDelayRate;

                        public final SlapmPRMonRowStatusEnt slapmPRMonRowStatus;

                        private SlapmPRMonEntryEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                        {
                            super(mib, parent, "slapmPRMonEntry", "1.3.6.1.3.88.1.2.6.1", false, false, false, true);
                            this.slapmPRMonOwnerIndex = new SlapmPRMonOwnerIndexEnt(mib, this);
                            this.slapmPRMonSystemAddress = new SlapmPRMonSystemAddressEnt(mib, this);
                            this.slapmPRMonIndex = new SlapmPRMonIndexEnt(mib, this);
                            this.slapmPRMonControl = new SlapmPRMonControlEnt(mib, this);
                            this.slapmPRMonStatus = new SlapmPRMonStatusEnt(mib, this);
                            this.slapmPRMonInterval = new SlapmPRMonIntervalEnt(mib, this);
                            this.slapmPRMonIntTime = new SlapmPRMonIntTimeEnt(mib, this);
                            this.slapmPRMonCurrentInRate = new SlapmPRMonCurrentInRateEnt(mib, this);
                            this.slapmPRMonCurrentOutRate = new SlapmPRMonCurrentOutRateEnt(mib, this);
                            this.slapmPRMonMinRateLow = new SlapmPRMonMinRateLowEnt(mib, this);
                            this.slapmPRMonMinRateHigh = new SlapmPRMonMinRateHighEnt(mib, this);
                            this.slapmPRMonMaxRateHigh = new SlapmPRMonMaxRateHighEnt(mib, this);
                            this.slapmPRMonMaxRateLow = new SlapmPRMonMaxRateLowEnt(mib, this);
                            this.slapmPRMonMaxDelayHigh = new SlapmPRMonMaxDelayHighEnt(mib, this);
                            this.slapmPRMonMaxDelayLow = new SlapmPRMonMaxDelayLowEnt(mib, this);
                            this.slapmPRMonMinInRateNotAchieves = new SlapmPRMonMinInRateNotAchievesEnt(mib, this);
                            this.slapmPRMonMaxInRateExceeds = new SlapmPRMonMaxInRateExceedsEnt(mib, this);
                            this.slapmPRMonMaxDelayExceeds = new SlapmPRMonMaxDelayExceedsEnt(mib, this);
                            this.slapmPRMonMinOutRateNotAchieves = new SlapmPRMonMinOutRateNotAchievesEnt(mib, this);
                            this.slapmPRMonMaxOutRateExceeds = new SlapmPRMonMaxOutRateExceedsEnt(mib, this);
                            this.slapmPRMonCurrentDelayRate = new SlapmPRMonCurrentDelayRateEnt(mib, this);
                            this.slapmPRMonRowStatus = new SlapmPRMonRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.slapmPRMonOwnerIndex,
                                this.slapmPRMonSystemAddress,
                                this.slapmPRMonIndex,
                                this.slapmPRMonControl,
                                this.slapmPRMonStatus,
                                this.slapmPRMonInterval,
                                this.slapmPRMonIntTime,
                                this.slapmPRMonCurrentInRate,
                                this.slapmPRMonCurrentOutRate,
                                this.slapmPRMonMinRateLow,
                                this.slapmPRMonMinRateHigh,
                                this.slapmPRMonMaxRateHigh,
                                this.slapmPRMonMaxRateLow,
                                this.slapmPRMonMaxDelayHigh,
                                this.slapmPRMonMaxDelayLow,
                                this.slapmPRMonMinInRateNotAchieves,
                                this.slapmPRMonMaxInRateExceeds,
                                this.slapmPRMonMaxDelayExceeds,
                                this.slapmPRMonMinOutRateNotAchieves,
                                this.slapmPRMonMaxOutRateExceeds,
                                this.slapmPRMonCurrentDelayRate,
                                this.slapmPRMonRowStatus
                            };
                        }
                        public static final class SlapmPRMonOwnerIndexEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonOwnerIndexEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonOwnerIndex", "1.3.6.1.3.88.1.2.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonSystemAddressEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonSystemAddressEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonSystemAddress", "1.3.6.1.3.88.1.2.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonIndexEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonIndexEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonIndex", "1.3.6.1.3.88.1.2.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonControlEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonControlEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonControl", "1.3.6.1.3.88.1.2.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonStatusEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonStatusEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonStatus", "1.3.6.1.3.88.1.2.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonIntervalEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonIntervalEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonInterval", "1.3.6.1.3.88.1.2.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonIntTimeEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonIntTimeEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonIntTime", "1.3.6.1.3.88.1.2.6.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonCurrentInRateEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonCurrentInRateEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonCurrentInRate", "1.3.6.1.3.88.1.2.6.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonCurrentOutRateEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonCurrentOutRateEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonCurrentOutRate", "1.3.6.1.3.88.1.2.6.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonMinRateLowEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonMinRateLowEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonMinRateLow", "1.3.6.1.3.88.1.2.6.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonMinRateHighEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonMinRateHighEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonMinRateHigh", "1.3.6.1.3.88.1.2.6.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonMaxRateHighEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonMaxRateHighEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonMaxRateHigh", "1.3.6.1.3.88.1.2.6.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonMaxRateLowEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonMaxRateLowEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonMaxRateLow", "1.3.6.1.3.88.1.2.6.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonMaxDelayHighEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonMaxDelayHighEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonMaxDelayHigh", "1.3.6.1.3.88.1.2.6.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonMaxDelayLowEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonMaxDelayLowEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonMaxDelayLow", "1.3.6.1.3.88.1.2.6.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonMinInRateNotAchievesEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonMinInRateNotAchievesEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonMinInRateNotAchieves", "1.3.6.1.3.88.1.2.6.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonMaxInRateExceedsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonMaxInRateExceedsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonMaxInRateExceeds", "1.3.6.1.3.88.1.2.6.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonMaxDelayExceedsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonMaxDelayExceedsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonMaxDelayExceeds", "1.3.6.1.3.88.1.2.6.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonMinOutRateNotAchievesEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonMinOutRateNotAchievesEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonMinOutRateNotAchieves", "1.3.6.1.3.88.1.2.6.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonMaxOutRateExceedsEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonMaxOutRateExceedsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonMaxOutRateExceeds", "1.3.6.1.3.88.1.2.6.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonCurrentDelayRateEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonCurrentDelayRateEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonCurrentDelayRate", "1.3.6.1.3.88.1.2.6.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SlapmPRMonRowStatusEnt extends MIBEntry<SLAPMMIBDef>
                        {
                            private SlapmPRMonRowStatusEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                            {
                                super(mib, parent, "slapmPRMonRowStatus", "1.3.6.1.3.88.1.2.6.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class SlapmConformanceEnt extends MIBEntry<SLAPMMIBDef>
        {
            /** Conformance informationCompliance statements*/
            public final SlapmCompliancesEnt slapmCompliances;

            public final SlapmGroupsEnt slapmGroups;

            private SlapmConformanceEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
            {
                super(mib, parent, "slapmConformance", "1.3.6.1.3.88.2", false, false, false, false);
                this.slapmCompliances = new SlapmCompliancesEnt(mib, this);
                this.slapmGroups = new SlapmGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.slapmCompliances,
                    this.slapmGroups
                };
            }
            public static final class SlapmCompliancesEnt extends MIBEntry<SLAPMMIBDef>
            {
                /** Compliance statements*/
                public final SlapmComplianceEnt slapmCompliance;

                private SlapmCompliancesEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                {
                    super(mib, parent, "slapmCompliances", "1.3.6.1.3.88.2.1", false, false, false, false);
                    this.slapmCompliance = new SlapmComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.slapmCompliance
                    };
                }
                public static final class SlapmComplianceEnt extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmComplianceEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmCompliance", "1.3.6.1.3.88.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SlapmGroupsEnt extends MIBEntry<SLAPMMIBDef>
            {
                /** MIB groupings*/
                public final SlapmBaseGroupEnt slapmBaseGroup;

                public final SlapmOptionalGroupEnt slapmOptionalGroup;

                public final SlapmEndSystemGroupEnt slapmEndSystemGroup;

                public final SlapmNotGroupEnt slapmNotGroup;

                public final SlapmEndSystemNotGroupEnt slapmEndSystemNotGroup;

                public final SlapmBaseGroup2Ent slapmBaseGroup2;

                public final SlapmEndSystemGroup2Ent slapmEndSystemGroup2;

                public final SlapmNotGroup2Ent slapmNotGroup2;

                public final SlapmEndSystemNotGroup2Ent slapmEndSystemNotGroup2;

                private SlapmGroupsEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                {
                    super(mib, parent, "slapmGroups", "1.3.6.1.3.88.2.2", false, false, false, false);
                    this.slapmBaseGroup = new SlapmBaseGroupEnt(mib, this);
                    this.slapmOptionalGroup = new SlapmOptionalGroupEnt(mib, this);
                    this.slapmEndSystemGroup = new SlapmEndSystemGroupEnt(mib, this);
                    this.slapmNotGroup = new SlapmNotGroupEnt(mib, this);
                    this.slapmEndSystemNotGroup = new SlapmEndSystemNotGroupEnt(mib, this);
                    this.slapmBaseGroup2 = new SlapmBaseGroup2Ent(mib, this);
                    this.slapmEndSystemGroup2 = new SlapmEndSystemGroup2Ent(mib, this);
                    this.slapmNotGroup2 = new SlapmNotGroup2Ent(mib, this);
                    this.slapmEndSystemNotGroup2 = new SlapmEndSystemNotGroup2Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.slapmBaseGroup,
                        this.slapmOptionalGroup,
                        this.slapmEndSystemGroup,
                        this.slapmNotGroup,
                        this.slapmEndSystemNotGroup,
                        this.slapmBaseGroup2,
                        this.slapmEndSystemGroup2,
                        this.slapmNotGroup2,
                        this.slapmEndSystemNotGroup2
                    };
                }
                public static final class SlapmBaseGroupEnt extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmBaseGroupEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmBaseGroup", "1.3.6.1.3.88.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SlapmOptionalGroupEnt extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmOptionalGroupEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmOptionalGroup", "1.3.6.1.3.88.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SlapmEndSystemGroupEnt extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmEndSystemGroupEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmEndSystemGroup", "1.3.6.1.3.88.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SlapmNotGroupEnt extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmNotGroupEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmNotGroup", "1.3.6.1.3.88.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SlapmEndSystemNotGroupEnt extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmEndSystemNotGroupEnt(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmEndSystemNotGroup", "1.3.6.1.3.88.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SlapmBaseGroup2Ent extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmBaseGroup2Ent(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmBaseGroup2", "1.3.6.1.3.88.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SlapmEndSystemGroup2Ent extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmEndSystemGroup2Ent(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmEndSystemGroup2", "1.3.6.1.3.88.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SlapmNotGroup2Ent extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmNotGroup2Ent(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmNotGroup2", "1.3.6.1.3.88.2.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SlapmEndSystemNotGroup2Ent extends MIBEntry<SLAPMMIBDef>
                {
                    private SlapmEndSystemNotGroup2Ent(SLAPMMIBDef mib, MIBEntry<SLAPMMIBDef> parent)
                    {
                        super(mib, parent, "slapmEndSystemNotGroup2", "1.3.6.1.3.88.2.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
