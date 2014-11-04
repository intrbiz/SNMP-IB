package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2579]
[RFC2580]*/
public final class ARCMIBDef extends MIB
{
    public static final ARCMIBDef ARCMIB = new ARCMIBDef();

    static { MIBs.getInstance().registerMIB(ARCMIBDef.ARCMIB); }

    /** [RFC3877]

September 09, 2004*/
    public final ArcMibModuleEnt arcMibModule;

    private ARCMIBDef()
    {
        super("ARC-MIB");
        this.arcMibModule = new ArcMibModuleEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.arcMibModule
        };
    }

    public static final class ArcMibModuleEnt extends MIBEntry<ARCMIBDef>
    {
        /** --------MIB Objects--------*/
        public final ArcTimeIntervalsEnt arcTimeIntervals;

        public final ArcObjectsEnt arcObjects;

        /** ------------conformance information------------*/
        public final ArcConformanceEnt arcConformance;

        private ArcMibModuleEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
        {
            super(mib, parent, "arcMibModule", "1.3.6.1.2.1.117", false, false, false, false);
            this.arcTimeIntervals = new ArcTimeIntervalsEnt(mib, this);
            this.arcObjects = new ArcObjectsEnt(mib, this);
            this.arcConformance = new ArcConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.arcTimeIntervals,
                this.arcObjects,
                this.arcConformance
            };
        }
        public static final class ArcTimeIntervalsEnt extends MIBEntry<ARCMIBDef>
        {
            public final ArcTITimeIntervalEnt arcTITimeInterval;

            public final ArcCDTimeIntervalEnt arcCDTimeInterval;

            private ArcTimeIntervalsEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
            {
                super(mib, parent, "arcTimeIntervals", "1.3.6.1.2.1.117.1", false, false, false, false);
                this.arcTITimeInterval = new ArcTITimeIntervalEnt(mib, this);
                this.arcCDTimeInterval = new ArcCDTimeIntervalEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.arcTITimeInterval,
                    this.arcCDTimeInterval
                };
            }
            public static final class ArcTITimeIntervalEnt extends MIBEntry<ARCMIBDef>
            {
                private ArcTITimeIntervalEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
                {
                    super(mib, parent, "arcTITimeInterval", "1.3.6.1.2.1.117.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ArcCDTimeIntervalEnt extends MIBEntry<ARCMIBDef>
            {
                private ArcCDTimeIntervalEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
                {
                    super(mib, parent, "arcCDTimeInterval", "1.3.6.1.2.1.117.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class ArcObjectsEnt extends MIBEntry<ARCMIBDef>
        {
            public final ArcTableEnt arcTable;

            private ArcObjectsEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
            {
                super(mib, parent, "arcObjects", "1.3.6.1.2.1.117.2", false, false, false, false);
                this.arcTable = new ArcTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.arcTable
                };
            }
            public static final class ArcTableEnt extends MIBEntry<ARCMIBDef>
            {
                public final ArcEntryEnt arcEntry;

                private ArcTableEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
                {
                    super(mib, parent, "arcTable", "1.3.6.1.2.1.117.2.1", false, true, false, false);
                    this.arcEntry = new ArcEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.arcEntry
                    };
                }
                public static final class ArcEntryEnt extends MIBEntry<ARCMIBDef>
                {
                    public final ArcIndexEnt arcIndex;

                    public final ArcAlarmTypeEnt arcAlarmType;

                    public final ArcNotificationIdEnt arcNotificationId;

                    public final ArcStateEnt arcState;

                    public final ArcNalmTimeRemainingEnt arcNalmTimeRemaining;

                    public final ArcRowStatusEnt arcRowStatus;

                    public final ArcStorageTypeEnt arcStorageType;

                    private ArcEntryEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
                    {
                        super(mib, parent, "arcEntry", "1.3.6.1.2.1.117.2.1.1", false, false, false, true);
                        this.arcIndex = new ArcIndexEnt(mib, this);
                        this.arcAlarmType = new ArcAlarmTypeEnt(mib, this);
                        this.arcNotificationId = new ArcNotificationIdEnt(mib, this);
                        this.arcState = new ArcStateEnt(mib, this);
                        this.arcNalmTimeRemaining = new ArcNalmTimeRemainingEnt(mib, this);
                        this.arcRowStatus = new ArcRowStatusEnt(mib, this);
                        this.arcStorageType = new ArcStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.arcIndex,
                            this.arcAlarmType,
                            this.arcNotificationId,
                            this.arcState,
                            this.arcNalmTimeRemaining,
                            this.arcRowStatus,
                            this.arcStorageType
                        };
                    }
                    public static final class ArcIndexEnt extends MIBEntry<ARCMIBDef>
                    {
                        private ArcIndexEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
                        {
                            super(mib, parent, "arcIndex", "1.3.6.1.2.1.117.2.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ArcAlarmTypeEnt extends MIBEntry<ARCMIBDef>
                    {
                        private ArcAlarmTypeEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
                        {
                            super(mib, parent, "arcAlarmType", "1.3.6.1.2.1.117.2.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ArcNotificationIdEnt extends MIBEntry<ARCMIBDef>
                    {
                        private ArcNotificationIdEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
                        {
                            super(mib, parent, "arcNotificationId", "1.3.6.1.2.1.117.2.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ArcStateEnt extends MIBEntry<ARCMIBDef>
                    {
                        private ArcStateEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
                        {
                            super(mib, parent, "arcState", "1.3.6.1.2.1.117.2.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ArcNalmTimeRemainingEnt extends MIBEntry<ARCMIBDef>
                    {
                        private ArcNalmTimeRemainingEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
                        {
                            super(mib, parent, "arcNalmTimeRemaining", "1.3.6.1.2.1.117.2.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ArcRowStatusEnt extends MIBEntry<ARCMIBDef>
                    {
                        private ArcRowStatusEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
                        {
                            super(mib, parent, "arcRowStatus", "1.3.6.1.2.1.117.2.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ArcStorageTypeEnt extends MIBEntry<ARCMIBDef>
                    {
                        private ArcStorageTypeEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
                        {
                            super(mib, parent, "arcStorageType", "1.3.6.1.2.1.117.2.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class ArcConformanceEnt extends MIBEntry<ARCMIBDef>
        {
            public final ArcCompliancesEnt arcCompliances;

            public final ArcGroupsEnt arcGroups;

            private ArcConformanceEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
            {
                super(mib, parent, "arcConformance", "1.3.6.1.2.1.117.3", false, false, false, false);
                this.arcCompliances = new ArcCompliancesEnt(mib, this);
                this.arcGroups = new ArcGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.arcCompliances,
                    this.arcGroups
                };
            }
            public static final class ArcCompliancesEnt extends MIBEntry<ARCMIBDef>
            {
                public final ArcComplianceEnt arcCompliance;

                private ArcCompliancesEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
                {
                    super(mib, parent, "arcCompliances", "1.3.6.1.2.1.117.3.1", false, false, false, false);
                    this.arcCompliance = new ArcComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.arcCompliance
                    };
                }
                public static final class ArcComplianceEnt extends MIBEntry<ARCMIBDef>
                {
                    private ArcComplianceEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
                    {
                        super(mib, parent, "arcCompliance", "1.3.6.1.2.1.117.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class ArcGroupsEnt extends MIBEntry<ARCMIBDef>
            {
                public final ArcSettingGroupEnt arcSettingGroup;

                public final ArcTIGroupEnt arcTIGroup;

                public final ArcQICDGroupEnt arcQICDGroup;

                private ArcGroupsEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
                {
                    super(mib, parent, "arcGroups", "1.3.6.1.2.1.117.3.2", false, false, false, false);
                    this.arcSettingGroup = new ArcSettingGroupEnt(mib, this);
                    this.arcTIGroup = new ArcTIGroupEnt(mib, this);
                    this.arcQICDGroup = new ArcQICDGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.arcSettingGroup,
                        this.arcTIGroup,
                        this.arcQICDGroup
                    };
                }
                public static final class ArcSettingGroupEnt extends MIBEntry<ARCMIBDef>
                {
                    private ArcSettingGroupEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
                    {
                        super(mib, parent, "arcSettingGroup", "1.3.6.1.2.1.117.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ArcTIGroupEnt extends MIBEntry<ARCMIBDef>
                {
                    private ArcTIGroupEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
                    {
                        super(mib, parent, "arcTIGroup", "1.3.6.1.2.1.117.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ArcQICDGroupEnt extends MIBEntry<ARCMIBDef>
                {
                    private ArcQICDGroupEnt(ARCMIBDef mib, MIBEntry<ARCMIBDef> parent)
                    {
                        super(mib, parent, "arcQICDGroup", "1.3.6.1.2.1.117.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
