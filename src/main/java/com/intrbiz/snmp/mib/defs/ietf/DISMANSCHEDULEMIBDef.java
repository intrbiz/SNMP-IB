package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class DISMANSCHEDULEMIBDef extends MIB
{
    public static final DISMANSCHEDULEMIBDef DISMANSCHEDULEMIB = new DISMANSCHEDULEMIBDef();

    static { MIBs.getInstance().registerMIB(DISMANSCHEDULEMIBDef.DISMANSCHEDULEMIB); }

    public final SchedMIBEnt schedMIB;

    private DISMANSCHEDULEMIBDef()
    {
        super("DISMAN-SCHEDULE-MIB");
        this.schedMIB = new SchedMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.schedMIB
        };
    }

    public static final class SchedMIBEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
    {
        /** The various groups defined within this MIB definition:*/
        public final SchedObjectsEnt schedObjects;

        public final SchedNotificationsEnt schedNotifications;

        public final SchedConformanceEnt schedConformance;

        private SchedMIBEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
        {
            super(mib, parent, "schedMIB", "1.3.6.1.2.1.63", false, false, false, false);
            this.schedObjects = new SchedObjectsEnt(mib, this);
            this.schedNotifications = new SchedNotificationsEnt(mib, this);
            this.schedConformance = new SchedConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.schedObjects,
                this.schedNotifications,
                this.schedConformance
            };
        }
        public static final class SchedObjectsEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
        {
            /** Some scalars which provide information about the local time zone.*/
            public final SchedLocalTimeEnt schedLocalTime;

            /** The schedule table which controls the scheduler.*/
            public final SchedTableEnt schedTable;

            private SchedObjectsEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
            {
                super(mib, parent, "schedObjects", "1.3.6.1.2.1.63.1", false, false, false, false);
                this.schedLocalTime = new SchedLocalTimeEnt(mib, this);
                this.schedTable = new SchedTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.schedLocalTime,
                    this.schedTable
                };
            }
            public static final class SchedLocalTimeEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
            {
                private SchedLocalTimeEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                {
                    super(mib, parent, "schedLocalTime", "1.3.6.1.2.1.63.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SchedTableEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
            {
                public final SchedEntryEnt schedEntry;

                private SchedTableEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                {
                    super(mib, parent, "schedTable", "1.3.6.1.2.1.63.1.2", false, true, false, false);
                    this.schedEntry = new SchedEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.schedEntry
                    };
                }
                public static final class SchedEntryEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                {
                    public final SchedOwnerEnt schedOwner;

                    public final SchedNameEnt schedName;

                    public final SchedDescrEnt schedDescr;

                    public final SchedIntervalEnt schedInterval;

                    public final SchedWeekDayEnt schedWeekDay;

                    public final SchedMonthEnt schedMonth;

                    public final SchedDayEnt schedDay;

                    public final SchedHourEnt schedHour;

                    public final SchedMinuteEnt schedMinute;

                    public final SchedContextNameEnt schedContextName;

                    public final SchedVariableEnt schedVariable;

                    public final SchedValueEnt schedValue;

                    public final SchedTypeEnt schedType;

                    public final SchedAdminStatusEnt schedAdminStatus;

                    public final SchedOperStatusEnt schedOperStatus;

                    public final SchedFailuresEnt schedFailures;

                    public final SchedLastFailureEnt schedLastFailure;

                    public final SchedLastFailedEnt schedLastFailed;

                    public final SchedStorageTypeEnt schedStorageType;

                    public final SchedRowStatusEnt schedRowStatus;

                    public final SchedTriggersEnt schedTriggers;

                    private SchedEntryEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                    {
                        super(mib, parent, "schedEntry", "1.3.6.1.2.1.63.1.2.1", false, false, false, true);
                        this.schedOwner = new SchedOwnerEnt(mib, this);
                        this.schedName = new SchedNameEnt(mib, this);
                        this.schedDescr = new SchedDescrEnt(mib, this);
                        this.schedInterval = new SchedIntervalEnt(mib, this);
                        this.schedWeekDay = new SchedWeekDayEnt(mib, this);
                        this.schedMonth = new SchedMonthEnt(mib, this);
                        this.schedDay = new SchedDayEnt(mib, this);
                        this.schedHour = new SchedHourEnt(mib, this);
                        this.schedMinute = new SchedMinuteEnt(mib, this);
                        this.schedContextName = new SchedContextNameEnt(mib, this);
                        this.schedVariable = new SchedVariableEnt(mib, this);
                        this.schedValue = new SchedValueEnt(mib, this);
                        this.schedType = new SchedTypeEnt(mib, this);
                        this.schedAdminStatus = new SchedAdminStatusEnt(mib, this);
                        this.schedOperStatus = new SchedOperStatusEnt(mib, this);
                        this.schedFailures = new SchedFailuresEnt(mib, this);
                        this.schedLastFailure = new SchedLastFailureEnt(mib, this);
                        this.schedLastFailed = new SchedLastFailedEnt(mib, this);
                        this.schedStorageType = new SchedStorageTypeEnt(mib, this);
                        this.schedRowStatus = new SchedRowStatusEnt(mib, this);
                        this.schedTriggers = new SchedTriggersEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.schedOwner,
                            this.schedName,
                            this.schedDescr,
                            this.schedInterval,
                            this.schedWeekDay,
                            this.schedMonth,
                            this.schedDay,
                            this.schedHour,
                            this.schedMinute,
                            this.schedContextName,
                            this.schedVariable,
                            this.schedValue,
                            this.schedType,
                            this.schedAdminStatus,
                            this.schedOperStatus,
                            this.schedFailures,
                            this.schedLastFailure,
                            this.schedLastFailed,
                            this.schedStorageType,
                            this.schedRowStatus,
                            this.schedTriggers
                        };
                    }
                    public static final class SchedOwnerEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedOwnerEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedOwner", "1.3.6.1.2.1.63.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedNameEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedNameEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedName", "1.3.6.1.2.1.63.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedDescrEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedDescrEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedDescr", "1.3.6.1.2.1.63.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedIntervalEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedIntervalEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedInterval", "1.3.6.1.2.1.63.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedWeekDayEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedWeekDayEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedWeekDay", "1.3.6.1.2.1.63.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedMonthEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedMonthEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedMonth", "1.3.6.1.2.1.63.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedDayEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedDayEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedDay", "1.3.6.1.2.1.63.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedHourEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedHourEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedHour", "1.3.6.1.2.1.63.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedMinuteEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedMinuteEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedMinute", "1.3.6.1.2.1.63.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedContextNameEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedContextNameEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedContextName", "1.3.6.1.2.1.63.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedVariableEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedVariableEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedVariable", "1.3.6.1.2.1.63.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedValueEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedValueEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedValue", "1.3.6.1.2.1.63.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedTypeEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedTypeEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedType", "1.3.6.1.2.1.63.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedAdminStatusEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedAdminStatusEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedAdminStatus", "1.3.6.1.2.1.63.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedOperStatusEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedOperStatusEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedOperStatus", "1.3.6.1.2.1.63.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedFailuresEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedFailuresEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedFailures", "1.3.6.1.2.1.63.1.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedLastFailureEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedLastFailureEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedLastFailure", "1.3.6.1.2.1.63.1.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedLastFailedEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedLastFailedEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedLastFailed", "1.3.6.1.2.1.63.1.2.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedStorageTypeEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedStorageTypeEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedStorageType", "1.3.6.1.2.1.63.1.2.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedRowStatusEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedRowStatusEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedRowStatus", "1.3.6.1.2.1.63.1.2.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SchedTriggersEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                    {
                        private SchedTriggersEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                        {
                            super(mib, parent, "schedTriggers", "1.3.6.1.2.1.63.1.2.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class SchedNotificationsEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
        {
            /** Notifications that are emitted to indicate failures.  Thedefinition of schedTraps makes notification registrationsreversible (see STD 58, RFC 2578).*/
            public final SchedTrapsEnt schedTraps;

            private SchedNotificationsEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
            {
                super(mib, parent, "schedNotifications", "1.3.6.1.2.1.63.2", false, false, false, false);
                this.schedTraps = new SchedTrapsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.schedTraps
                };
            }
            public static final class SchedTrapsEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
            {
                public final SchedActionFailureEnt schedActionFailure;

                private SchedTrapsEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                {
                    super(mib, parent, "schedTraps", "1.3.6.1.2.1.63.2.0", false, false, false, false);
                    this.schedActionFailure = new SchedActionFailureEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.schedActionFailure
                    };
                }
                public static final class SchedActionFailureEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                {
                    private SchedActionFailureEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                    {
                        super(mib, parent, "schedActionFailure", "1.3.6.1.2.1.63.2.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class SchedConformanceEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
        {
            /** conformance information*/
            public final SchedCompliancesEnt schedCompliances;

            public final SchedGroupsEnt schedGroups;

            private SchedConformanceEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
            {
                super(mib, parent, "schedConformance", "1.3.6.1.2.1.63.3", false, false, false, false);
                this.schedCompliances = new SchedCompliancesEnt(mib, this);
                this.schedGroups = new SchedGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.schedCompliances,
                    this.schedGroups
                };
            }
            public static final class SchedCompliancesEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
            {
                /** compliance statements*/
                public final SchedCompliance2Ent schedCompliance2;

                /** Deprecated compliance and conformance group definitionsfrom RFC 2591.*/
                public final SchedComplianceEnt schedCompliance;

                private SchedCompliancesEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                {
                    super(mib, parent, "schedCompliances", "1.3.6.1.2.1.63.3.1", false, false, false, false);
                    this.schedCompliance2 = new SchedCompliance2Ent(mib, this);
                    this.schedCompliance = new SchedComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.schedCompliance2,
                        this.schedCompliance
                    };
                }
                public static final class SchedCompliance2Ent extends MIBEntry<DISMANSCHEDULEMIBDef>
                {
                    private SchedCompliance2Ent(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                    {
                        super(mib, parent, "schedCompliance2", "1.3.6.1.2.1.63.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SchedComplianceEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                {
                    private SchedComplianceEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                    {
                        super(mib, parent, "schedCompliance", "1.3.6.1.2.1.63.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SchedGroupsEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
            {
                public final SchedGroup2Ent schedGroup2;

                public final SchedCalendarGroupEnt schedCalendarGroup;

                public final SchedNotificationsGroupEnt schedNotificationsGroup;

                public final SchedGroupEnt schedGroup;

                private SchedGroupsEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                {
                    super(mib, parent, "schedGroups", "1.3.6.1.2.1.63.3.2", false, false, false, false);
                    this.schedGroup2 = new SchedGroup2Ent(mib, this);
                    this.schedCalendarGroup = new SchedCalendarGroupEnt(mib, this);
                    this.schedNotificationsGroup = new SchedNotificationsGroupEnt(mib, this);
                    this.schedGroup = new SchedGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.schedGroup2,
                        this.schedCalendarGroup,
                        this.schedNotificationsGroup,
                        this.schedGroup
                    };
                }
                public static final class SchedGroup2Ent extends MIBEntry<DISMANSCHEDULEMIBDef>
                {
                    private SchedGroup2Ent(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                    {
                        super(mib, parent, "schedGroup2", "1.3.6.1.2.1.63.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SchedCalendarGroupEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                {
                    private SchedCalendarGroupEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                    {
                        super(mib, parent, "schedCalendarGroup", "1.3.6.1.2.1.63.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SchedNotificationsGroupEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                {
                    private SchedNotificationsGroupEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                    {
                        super(mib, parent, "schedNotificationsGroup", "1.3.6.1.2.1.63.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SchedGroupEnt extends MIBEntry<DISMANSCHEDULEMIBDef>
                {
                    private SchedGroupEnt(DISMANSCHEDULEMIBDef mib, MIBEntry<DISMANSCHEDULEMIBDef> parent)
                    {
                        super(mib, parent, "schedGroup", "1.3.6.1.2.1.63.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
