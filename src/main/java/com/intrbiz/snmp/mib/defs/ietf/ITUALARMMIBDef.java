package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2579]
[RFC3411]
[RFC3877]
[RFC3877]
[RFC3877]
[RFC2580]*/
public final class ITUALARMMIBDef extends MIB
{
    public static final ITUALARMMIBDef ITUALARMMIB = new ITUALARMMIBDef();

    /** [RFC2021]

September 09, 2004*/
    public final ItuAlarmMIBEnt ituAlarmMIB;

    private ITUALARMMIBDef()
    {
        super("ITU-ALARM-MIB");
        this.ituAlarmMIB = new ItuAlarmMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ituAlarmMIB
        };
    }

    public static final class ItuAlarmMIBEnt extends MIBEntry<ITUALARMMIBDef>
    {
        public final ItuAlarmObjectsEnt ituAlarmObjects;

        /** Conformance*/
        public final ItuAlarmConformanceEnt ituAlarmConformance;

        private ItuAlarmMIBEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
        {
            super(mib, parent, "ituAlarmMIB", "1.3.6.1.2.1.121", false, false, false, false);
            this.ituAlarmObjects = new ItuAlarmObjectsEnt(mib, this);
            this.ituAlarmConformance = new ItuAlarmConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ituAlarmObjects,
                this.ituAlarmConformance
            };
        }
        public static final class ItuAlarmObjectsEnt extends MIBEntry<ITUALARMMIBDef>
        {
            public final ItuAlarmModelEnt ituAlarmModel;

            public final ItuAlarmActiveEnt ituAlarmActive;

            private ItuAlarmObjectsEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
            {
                super(mib, parent, "ituAlarmObjects", "1.3.6.1.2.1.121.1", false, false, false, false);
                this.ituAlarmModel = new ItuAlarmModelEnt(mib, this);
                this.ituAlarmActive = new ItuAlarmActiveEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ituAlarmModel,
                    this.ituAlarmActive
                };
            }
            public static final class ItuAlarmModelEnt extends MIBEntry<ITUALARMMIBDef>
            {
                public final ItuAlarmTableEnt ituAlarmTable;

                private ItuAlarmModelEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                {
                    super(mib, parent, "ituAlarmModel", "1.3.6.1.2.1.121.1.1", false, false, false, false);
                    this.ituAlarmTable = new ItuAlarmTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ituAlarmTable
                    };
                }
                public static final class ItuAlarmTableEnt extends MIBEntry<ITUALARMMIBDef>
                {
                    public final ItuAlarmEntryEnt ituAlarmEntry;

                    private ItuAlarmTableEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                    {
                        super(mib, parent, "ituAlarmTable", "1.3.6.1.2.1.121.1.1.1", false, true, false, false);
                        this.ituAlarmEntry = new ItuAlarmEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ituAlarmEntry
                        };
                    }
                    public static final class ItuAlarmEntryEnt extends MIBEntry<ITUALARMMIBDef>
                    {
                        public final ItuAlarmPerceivedSeverityEnt ituAlarmPerceivedSeverity;

                        public final ItuAlarmEventTypeEnt ituAlarmEventType;

                        public final ItuAlarmProbableCauseEnt ituAlarmProbableCause;

                        public final ItuAlarmAdditionalTextEnt ituAlarmAdditionalText;

                        public final ItuAlarmGenericModelEnt ituAlarmGenericModel;

                        private ItuAlarmEntryEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                        {
                            super(mib, parent, "ituAlarmEntry", "1.3.6.1.2.1.121.1.1.1.1", false, false, false, true);
                            this.ituAlarmPerceivedSeverity = new ItuAlarmPerceivedSeverityEnt(mib, this);
                            this.ituAlarmEventType = new ItuAlarmEventTypeEnt(mib, this);
                            this.ituAlarmProbableCause = new ItuAlarmProbableCauseEnt(mib, this);
                            this.ituAlarmAdditionalText = new ItuAlarmAdditionalTextEnt(mib, this);
                            this.ituAlarmGenericModel = new ItuAlarmGenericModelEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ituAlarmPerceivedSeverity,
                                this.ituAlarmEventType,
                                this.ituAlarmProbableCause,
                                this.ituAlarmAdditionalText,
                                this.ituAlarmGenericModel
                            };
                        }
                        public static final class ItuAlarmPerceivedSeverityEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmPerceivedSeverityEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmPerceivedSeverity", "1.3.6.1.2.1.121.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ItuAlarmEventTypeEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmEventTypeEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmEventType", "1.3.6.1.2.1.121.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ItuAlarmProbableCauseEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmProbableCauseEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmProbableCause", "1.3.6.1.2.1.121.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ItuAlarmAdditionalTextEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmAdditionalTextEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmAdditionalText", "1.3.6.1.2.1.121.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ItuAlarmGenericModelEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmGenericModelEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmGenericModel", "1.3.6.1.2.1.121.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class ItuAlarmActiveEnt extends MIBEntry<ITUALARMMIBDef>
            {
                /** ITU Active Alarm Table --*/
                public final ItuAlarmActiveTableEnt ituAlarmActiveTable;

                /** Statistics and Counters*/
                public final ItuAlarmActiveStatsTableEnt ituAlarmActiveStatsTable;

                private ItuAlarmActiveEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                {
                    super(mib, parent, "ituAlarmActive", "1.3.6.1.2.1.121.1.2", false, false, false, false);
                    this.ituAlarmActiveTable = new ItuAlarmActiveTableEnt(mib, this);
                    this.ituAlarmActiveStatsTable = new ItuAlarmActiveStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ituAlarmActiveTable,
                        this.ituAlarmActiveStatsTable
                    };
                }
                public static final class ItuAlarmActiveTableEnt extends MIBEntry<ITUALARMMIBDef>
                {
                    public final ItuAlarmActiveEntryEnt ituAlarmActiveEntry;

                    private ItuAlarmActiveTableEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                    {
                        super(mib, parent, "ituAlarmActiveTable", "1.3.6.1.2.1.121.1.2.1", false, true, false, false);
                        this.ituAlarmActiveEntry = new ItuAlarmActiveEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ituAlarmActiveEntry
                        };
                    }
                    public static final class ItuAlarmActiveEntryEnt extends MIBEntry<ITUALARMMIBDef>
                    {
                        public final ItuAlarmActiveTrendIndicationEnt ituAlarmActiveTrendIndication;

                        public final ItuAlarmActiveDetectorEnt ituAlarmActiveDetector;

                        public final ItuAlarmActiveServiceProviderEnt ituAlarmActiveServiceProvider;

                        public final ItuAlarmActiveServiceUserEnt ituAlarmActiveServiceUser;

                        private ItuAlarmActiveEntryEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                        {
                            super(mib, parent, "ituAlarmActiveEntry", "1.3.6.1.2.1.121.1.2.1.1", false, false, false, true);
                            this.ituAlarmActiveTrendIndication = new ItuAlarmActiveTrendIndicationEnt(mib, this);
                            this.ituAlarmActiveDetector = new ItuAlarmActiveDetectorEnt(mib, this);
                            this.ituAlarmActiveServiceProvider = new ItuAlarmActiveServiceProviderEnt(mib, this);
                            this.ituAlarmActiveServiceUser = new ItuAlarmActiveServiceUserEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ituAlarmActiveTrendIndication,
                                this.ituAlarmActiveDetector,
                                this.ituAlarmActiveServiceProvider,
                                this.ituAlarmActiveServiceUser
                            };
                        }
                        public static final class ItuAlarmActiveTrendIndicationEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmActiveTrendIndicationEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmActiveTrendIndication", "1.3.6.1.2.1.121.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ItuAlarmActiveDetectorEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmActiveDetectorEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmActiveDetector", "1.3.6.1.2.1.121.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ItuAlarmActiveServiceProviderEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmActiveServiceProviderEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmActiveServiceProvider", "1.3.6.1.2.1.121.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ItuAlarmActiveServiceUserEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmActiveServiceUserEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmActiveServiceUser", "1.3.6.1.2.1.121.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ItuAlarmActiveStatsTableEnt extends MIBEntry<ITUALARMMIBDef>
                {
                    public final ItuAlarmActiveStatsEntryEnt ituAlarmActiveStatsEntry;

                    private ItuAlarmActiveStatsTableEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                    {
                        super(mib, parent, "ituAlarmActiveStatsTable", "1.3.6.1.2.1.121.1.2.2", false, true, false, false);
                        this.ituAlarmActiveStatsEntry = new ItuAlarmActiveStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ituAlarmActiveStatsEntry
                        };
                    }
                    public static final class ItuAlarmActiveStatsEntryEnt extends MIBEntry<ITUALARMMIBDef>
                    {
                        public final ItuAlarmActiveStatsIndeterminateCurrentEnt ituAlarmActiveStatsIndeterminateCurrent;

                        public final ItuAlarmActiveStatsCriticalCurrentEnt ituAlarmActiveStatsCriticalCurrent;

                        public final ItuAlarmActiveStatsMajorCurrentEnt ituAlarmActiveStatsMajorCurrent;

                        public final ItuAlarmActiveStatsMinorCurrentEnt ituAlarmActiveStatsMinorCurrent;

                        public final ItuAlarmActiveStatsWarningCurrentEnt ituAlarmActiveStatsWarningCurrent;

                        public final ItuAlarmActiveStatsIndeterminatesEnt ituAlarmActiveStatsIndeterminates;

                        public final ItuAlarmActiveStatsCriticalsEnt ituAlarmActiveStatsCriticals;

                        public final ItuAlarmActiveStatsMajorsEnt ituAlarmActiveStatsMajors;

                        public final ItuAlarmActiveStatsMinorsEnt ituAlarmActiveStatsMinors;

                        public final ItuAlarmActiveStatsWarningsEnt ituAlarmActiveStatsWarnings;

                        private ItuAlarmActiveStatsEntryEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                        {
                            super(mib, parent, "ituAlarmActiveStatsEntry", "1.3.6.1.2.1.121.1.2.2.1", false, false, false, true);
                            this.ituAlarmActiveStatsIndeterminateCurrent = new ItuAlarmActiveStatsIndeterminateCurrentEnt(mib, this);
                            this.ituAlarmActiveStatsCriticalCurrent = new ItuAlarmActiveStatsCriticalCurrentEnt(mib, this);
                            this.ituAlarmActiveStatsMajorCurrent = new ItuAlarmActiveStatsMajorCurrentEnt(mib, this);
                            this.ituAlarmActiveStatsMinorCurrent = new ItuAlarmActiveStatsMinorCurrentEnt(mib, this);
                            this.ituAlarmActiveStatsWarningCurrent = new ItuAlarmActiveStatsWarningCurrentEnt(mib, this);
                            this.ituAlarmActiveStatsIndeterminates = new ItuAlarmActiveStatsIndeterminatesEnt(mib, this);
                            this.ituAlarmActiveStatsCriticals = new ItuAlarmActiveStatsCriticalsEnt(mib, this);
                            this.ituAlarmActiveStatsMajors = new ItuAlarmActiveStatsMajorsEnt(mib, this);
                            this.ituAlarmActiveStatsMinors = new ItuAlarmActiveStatsMinorsEnt(mib, this);
                            this.ituAlarmActiveStatsWarnings = new ItuAlarmActiveStatsWarningsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ituAlarmActiveStatsIndeterminateCurrent,
                                this.ituAlarmActiveStatsCriticalCurrent,
                                this.ituAlarmActiveStatsMajorCurrent,
                                this.ituAlarmActiveStatsMinorCurrent,
                                this.ituAlarmActiveStatsWarningCurrent,
                                this.ituAlarmActiveStatsIndeterminates,
                                this.ituAlarmActiveStatsCriticals,
                                this.ituAlarmActiveStatsMajors,
                                this.ituAlarmActiveStatsMinors,
                                this.ituAlarmActiveStatsWarnings
                            };
                        }
                        public static final class ItuAlarmActiveStatsIndeterminateCurrentEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmActiveStatsIndeterminateCurrentEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmActiveStatsIndeterminateCurrent", "1.3.6.1.2.1.121.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ItuAlarmActiveStatsCriticalCurrentEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmActiveStatsCriticalCurrentEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmActiveStatsCriticalCurrent", "1.3.6.1.2.1.121.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ItuAlarmActiveStatsMajorCurrentEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmActiveStatsMajorCurrentEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmActiveStatsMajorCurrent", "1.3.6.1.2.1.121.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ItuAlarmActiveStatsMinorCurrentEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmActiveStatsMinorCurrentEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmActiveStatsMinorCurrent", "1.3.6.1.2.1.121.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ItuAlarmActiveStatsWarningCurrentEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmActiveStatsWarningCurrentEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmActiveStatsWarningCurrent", "1.3.6.1.2.1.121.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ItuAlarmActiveStatsIndeterminatesEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmActiveStatsIndeterminatesEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmActiveStatsIndeterminates", "1.3.6.1.2.1.121.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ItuAlarmActiveStatsCriticalsEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmActiveStatsCriticalsEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmActiveStatsCriticals", "1.3.6.1.2.1.121.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ItuAlarmActiveStatsMajorsEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmActiveStatsMajorsEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmActiveStatsMajors", "1.3.6.1.2.1.121.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ItuAlarmActiveStatsMinorsEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmActiveStatsMinorsEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmActiveStatsMinors", "1.3.6.1.2.1.121.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ItuAlarmActiveStatsWarningsEnt extends MIBEntry<ITUALARMMIBDef>
                        {
                            private ItuAlarmActiveStatsWarningsEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                            {
                                super(mib, parent, "ituAlarmActiveStatsWarnings", "1.3.6.1.2.1.121.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class ItuAlarmConformanceEnt extends MIBEntry<ITUALARMMIBDef>
        {
            public final ItuAlarmCompliancesEnt ituAlarmCompliances;

            public final ItuAlarmGroupsEnt ituAlarmGroups;

            private ItuAlarmConformanceEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
            {
                super(mib, parent, "ituAlarmConformance", "1.3.6.1.2.1.121.2", false, false, false, false);
                this.ituAlarmCompliances = new ItuAlarmCompliancesEnt(mib, this);
                this.ituAlarmGroups = new ItuAlarmGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ituAlarmCompliances,
                    this.ituAlarmGroups
                };
            }
            public static final class ItuAlarmCompliancesEnt extends MIBEntry<ITUALARMMIBDef>
            {
                public final ItuAlarmComplianceEnt ituAlarmCompliance;

                private ItuAlarmCompliancesEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                {
                    super(mib, parent, "ituAlarmCompliances", "1.3.6.1.2.1.121.2.1", false, false, false, false);
                    this.ituAlarmCompliance = new ItuAlarmComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ituAlarmCompliance
                    };
                }
                public static final class ItuAlarmComplianceEnt extends MIBEntry<ITUALARMMIBDef>
                {
                    private ItuAlarmComplianceEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                    {
                        super(mib, parent, "ituAlarmCompliance", "1.3.6.1.2.1.121.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class ItuAlarmGroupsEnt extends MIBEntry<ITUALARMMIBDef>
            {
                public final ItuAlarmGroupEnt ituAlarmGroup;

                public final ItuAlarmServiceUserGroupEnt ituAlarmServiceUserGroup;

                public final ItuAlarmSecurityGroupEnt ituAlarmSecurityGroup;

                public final ItuAlarmStatisticsGroupEnt ituAlarmStatisticsGroup;

                private ItuAlarmGroupsEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                {
                    super(mib, parent, "ituAlarmGroups", "1.3.6.1.2.1.121.2.2", false, false, false, false);
                    this.ituAlarmGroup = new ItuAlarmGroupEnt(mib, this);
                    this.ituAlarmServiceUserGroup = new ItuAlarmServiceUserGroupEnt(mib, this);
                    this.ituAlarmSecurityGroup = new ItuAlarmSecurityGroupEnt(mib, this);
                    this.ituAlarmStatisticsGroup = new ItuAlarmStatisticsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ituAlarmGroup,
                        this.ituAlarmServiceUserGroup,
                        this.ituAlarmSecurityGroup,
                        this.ituAlarmStatisticsGroup
                    };
                }
                public static final class ItuAlarmGroupEnt extends MIBEntry<ITUALARMMIBDef>
                {
                    private ItuAlarmGroupEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                    {
                        super(mib, parent, "ituAlarmGroup", "1.3.6.1.2.1.121.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ItuAlarmServiceUserGroupEnt extends MIBEntry<ITUALARMMIBDef>
                {
                    private ItuAlarmServiceUserGroupEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                    {
                        super(mib, parent, "ituAlarmServiceUserGroup", "1.3.6.1.2.1.121.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ItuAlarmSecurityGroupEnt extends MIBEntry<ITUALARMMIBDef>
                {
                    private ItuAlarmSecurityGroupEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                    {
                        super(mib, parent, "ituAlarmSecurityGroup", "1.3.6.1.2.1.121.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ItuAlarmStatisticsGroupEnt extends MIBEntry<ITUALARMMIBDef>
                {
                    private ItuAlarmStatisticsGroupEnt(ITUALARMMIBDef mib, MIBEntry<ITUALARMMIBDef> parent)
                    {
                        super(mib, parent, "ituAlarmStatisticsGroup", "1.3.6.1.2.1.121.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
