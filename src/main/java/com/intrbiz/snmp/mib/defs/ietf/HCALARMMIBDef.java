package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class HCALARMMIBDef extends MIB
{
    public static final HCALARMMIBDef HCALARMMIB = new HCALARMMIBDef();

    public final HcAlarmMIBEnt hcAlarmMIB;

    private HCALARMMIBDef()
    {
        super("HC-ALARM-MIB");
        this.hcAlarmMIB = new HcAlarmMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.hcAlarmMIB
        };
    }

    public static final class HcAlarmMIBEnt extends MIBEntry<HCALARMMIBDef>
    {
        public final HcAlarmObjectsEnt hcAlarmObjects;

        public final HcAlarmNotificationsEnt hcAlarmNotifications;

        public final HcAlarmConformanceEnt hcAlarmConformance;

        private HcAlarmMIBEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
        {
            super(mib, parent, "hcAlarmMIB", "1.3.6.1.2.1.16.29", false, false, false, false);
            this.hcAlarmObjects = new HcAlarmObjectsEnt(mib, this);
            this.hcAlarmNotifications = new HcAlarmNotificationsEnt(mib, this);
            this.hcAlarmConformance = new HcAlarmConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.hcAlarmObjects,
                this.hcAlarmNotifications,
                this.hcAlarmConformance
            };
        }
        public static final class HcAlarmObjectsEnt extends MIBEntry<HCALARMMIBDef>
        {
            public final HcAlarmControlObjectsEnt hcAlarmControlObjects;

            public final HcAlarmCapabilitiesObjectsEnt hcAlarmCapabilitiesObjects;

            private HcAlarmObjectsEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
            {
                super(mib, parent, "hcAlarmObjects", "1.3.6.1.2.1.16.29.1", false, false, false, false);
                this.hcAlarmControlObjects = new HcAlarmControlObjectsEnt(mib, this);
                this.hcAlarmCapabilitiesObjects = new HcAlarmCapabilitiesObjectsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hcAlarmControlObjects,
                    this.hcAlarmCapabilitiesObjects
                };
            }
            public static final class HcAlarmControlObjectsEnt extends MIBEntry<HCALARMMIBDef>
            {
                /** High Capacity Alarm Table*/
                public final HcAlarmTableEnt hcAlarmTable;

                private HcAlarmControlObjectsEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                {
                    super(mib, parent, "hcAlarmControlObjects", "1.3.6.1.2.1.16.29.1.1", false, false, false, false);
                    this.hcAlarmTable = new HcAlarmTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hcAlarmTable
                    };
                }
                public static final class HcAlarmTableEnt extends MIBEntry<HCALARMMIBDef>
                {
                    public final HcAlarmEntryEnt hcAlarmEntry;

                    private HcAlarmTableEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                    {
                        super(mib, parent, "hcAlarmTable", "1.3.6.1.2.1.16.29.1.1.1", false, true, false, false);
                        this.hcAlarmEntry = new HcAlarmEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hcAlarmEntry
                        };
                    }
                    public static final class HcAlarmEntryEnt extends MIBEntry<HCALARMMIBDef>
                    {
                        public final HcAlarmIndexEnt hcAlarmIndex;

                        public final HcAlarmIntervalEnt hcAlarmInterval;

                        public final HcAlarmVariableEnt hcAlarmVariable;

                        public final HcAlarmSampleTypeEnt hcAlarmSampleType;

                        public final HcAlarmAbsValueEnt hcAlarmAbsValue;

                        public final HcAlarmValueStatusEnt hcAlarmValueStatus;

                        public final HcAlarmStartupAlarmEnt hcAlarmStartupAlarm;

                        public final HcAlarmRisingThreshAbsValueLoEnt hcAlarmRisingThreshAbsValueLo;

                        public final HcAlarmRisingThreshAbsValueHiEnt hcAlarmRisingThreshAbsValueHi;

                        public final HcAlarmRisingThresholdValStatusEnt hcAlarmRisingThresholdValStatus;

                        public final HcAlarmFallingThreshAbsValueLoEnt hcAlarmFallingThreshAbsValueLo;

                        public final HcAlarmFallingThreshAbsValueHiEnt hcAlarmFallingThreshAbsValueHi;

                        public final HcAlarmFallingThresholdValStatusEnt hcAlarmFallingThresholdValStatus;

                        public final HcAlarmRisingEventIndexEnt hcAlarmRisingEventIndex;

                        public final HcAlarmFallingEventIndexEnt hcAlarmFallingEventIndex;

                        public final HcAlarmValueFailedAttemptsEnt hcAlarmValueFailedAttempts;

                        public final HcAlarmOwnerEnt hcAlarmOwner;

                        public final HcAlarmStorageTypeEnt hcAlarmStorageType;

                        public final HcAlarmStatusEnt hcAlarmStatus;

                        private HcAlarmEntryEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                        {
                            super(mib, parent, "hcAlarmEntry", "1.3.6.1.2.1.16.29.1.1.1.1", false, false, false, true);
                            this.hcAlarmIndex = new HcAlarmIndexEnt(mib, this);
                            this.hcAlarmInterval = new HcAlarmIntervalEnt(mib, this);
                            this.hcAlarmVariable = new HcAlarmVariableEnt(mib, this);
                            this.hcAlarmSampleType = new HcAlarmSampleTypeEnt(mib, this);
                            this.hcAlarmAbsValue = new HcAlarmAbsValueEnt(mib, this);
                            this.hcAlarmValueStatus = new HcAlarmValueStatusEnt(mib, this);
                            this.hcAlarmStartupAlarm = new HcAlarmStartupAlarmEnt(mib, this);
                            this.hcAlarmRisingThreshAbsValueLo = new HcAlarmRisingThreshAbsValueLoEnt(mib, this);
                            this.hcAlarmRisingThreshAbsValueHi = new HcAlarmRisingThreshAbsValueHiEnt(mib, this);
                            this.hcAlarmRisingThresholdValStatus = new HcAlarmRisingThresholdValStatusEnt(mib, this);
                            this.hcAlarmFallingThreshAbsValueLo = new HcAlarmFallingThreshAbsValueLoEnt(mib, this);
                            this.hcAlarmFallingThreshAbsValueHi = new HcAlarmFallingThreshAbsValueHiEnt(mib, this);
                            this.hcAlarmFallingThresholdValStatus = new HcAlarmFallingThresholdValStatusEnt(mib, this);
                            this.hcAlarmRisingEventIndex = new HcAlarmRisingEventIndexEnt(mib, this);
                            this.hcAlarmFallingEventIndex = new HcAlarmFallingEventIndexEnt(mib, this);
                            this.hcAlarmValueFailedAttempts = new HcAlarmValueFailedAttemptsEnt(mib, this);
                            this.hcAlarmOwner = new HcAlarmOwnerEnt(mib, this);
                            this.hcAlarmStorageType = new HcAlarmStorageTypeEnt(mib, this);
                            this.hcAlarmStatus = new HcAlarmStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.hcAlarmIndex,
                                this.hcAlarmInterval,
                                this.hcAlarmVariable,
                                this.hcAlarmSampleType,
                                this.hcAlarmAbsValue,
                                this.hcAlarmValueStatus,
                                this.hcAlarmStartupAlarm,
                                this.hcAlarmRisingThreshAbsValueLo,
                                this.hcAlarmRisingThreshAbsValueHi,
                                this.hcAlarmRisingThresholdValStatus,
                                this.hcAlarmFallingThreshAbsValueLo,
                                this.hcAlarmFallingThreshAbsValueHi,
                                this.hcAlarmFallingThresholdValStatus,
                                this.hcAlarmRisingEventIndex,
                                this.hcAlarmFallingEventIndex,
                                this.hcAlarmValueFailedAttempts,
                                this.hcAlarmOwner,
                                this.hcAlarmStorageType,
                                this.hcAlarmStatus
                            };
                        }
                        public static final class HcAlarmIndexEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmIndexEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmIndex", "1.3.6.1.2.1.16.29.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmIntervalEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmIntervalEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmInterval", "1.3.6.1.2.1.16.29.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmVariableEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmVariableEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmVariable", "1.3.6.1.2.1.16.29.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmSampleTypeEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmSampleTypeEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmSampleType", "1.3.6.1.2.1.16.29.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmAbsValueEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmAbsValueEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmAbsValue", "1.3.6.1.2.1.16.29.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmValueStatusEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmValueStatusEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmValueStatus", "1.3.6.1.2.1.16.29.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmStartupAlarmEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmStartupAlarmEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmStartupAlarm", "1.3.6.1.2.1.16.29.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmRisingThreshAbsValueLoEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmRisingThreshAbsValueLoEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmRisingThreshAbsValueLo", "1.3.6.1.2.1.16.29.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmRisingThreshAbsValueHiEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmRisingThreshAbsValueHiEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmRisingThreshAbsValueHi", "1.3.6.1.2.1.16.29.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmRisingThresholdValStatusEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmRisingThresholdValStatusEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmRisingThresholdValStatus", "1.3.6.1.2.1.16.29.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmFallingThreshAbsValueLoEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmFallingThreshAbsValueLoEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmFallingThreshAbsValueLo", "1.3.6.1.2.1.16.29.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmFallingThreshAbsValueHiEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmFallingThreshAbsValueHiEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmFallingThreshAbsValueHi", "1.3.6.1.2.1.16.29.1.1.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmFallingThresholdValStatusEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmFallingThresholdValStatusEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmFallingThresholdValStatus", "1.3.6.1.2.1.16.29.1.1.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmRisingEventIndexEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmRisingEventIndexEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmRisingEventIndex", "1.3.6.1.2.1.16.29.1.1.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmFallingEventIndexEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmFallingEventIndexEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmFallingEventIndex", "1.3.6.1.2.1.16.29.1.1.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmValueFailedAttemptsEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmValueFailedAttemptsEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmValueFailedAttempts", "1.3.6.1.2.1.16.29.1.1.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmOwnerEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmOwnerEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmOwner", "1.3.6.1.2.1.16.29.1.1.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmStorageTypeEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmStorageTypeEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmStorageType", "1.3.6.1.2.1.16.29.1.1.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HcAlarmStatusEnt extends MIBEntry<HCALARMMIBDef>
                        {
                            private HcAlarmStatusEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                            {
                                super(mib, parent, "hcAlarmStatus", "1.3.6.1.2.1.16.29.1.1.1.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class HcAlarmCapabilitiesObjectsEnt extends MIBEntry<HCALARMMIBDef>
            {
                /** Capabilities*/
                public final HcAlarmCapabilitiesEnt hcAlarmCapabilities;

                private HcAlarmCapabilitiesObjectsEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                {
                    super(mib, parent, "hcAlarmCapabilitiesObjects", "1.3.6.1.2.1.16.29.1.2", false, false, false, false);
                    this.hcAlarmCapabilities = new HcAlarmCapabilitiesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hcAlarmCapabilities
                    };
                }
                public static final class HcAlarmCapabilitiesEnt extends MIBEntry<HCALARMMIBDef>
                {
                    private HcAlarmCapabilitiesEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                    {
                        super(mib, parent, "hcAlarmCapabilities", "1.3.6.1.2.1.16.29.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class HcAlarmNotificationsEnt extends MIBEntry<HCALARMMIBDef>
        {
            /** Notifications*/
            public final HcAlarmNotifPrefixEnt hcAlarmNotifPrefix;

            private HcAlarmNotificationsEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
            {
                super(mib, parent, "hcAlarmNotifications", "1.3.6.1.2.1.16.29.2", false, false, false, false);
                this.hcAlarmNotifPrefix = new HcAlarmNotifPrefixEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hcAlarmNotifPrefix
                };
            }
            public static final class HcAlarmNotifPrefixEnt extends MIBEntry<HCALARMMIBDef>
            {
                public final HcRisingAlarmEnt hcRisingAlarm;

                public final HcFallingAlarmEnt hcFallingAlarm;

                private HcAlarmNotifPrefixEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                {
                    super(mib, parent, "hcAlarmNotifPrefix", "1.3.6.1.2.1.16.29.2.0", false, false, false, false);
                    this.hcRisingAlarm = new HcRisingAlarmEnt(mib, this);
                    this.hcFallingAlarm = new HcFallingAlarmEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hcRisingAlarm,
                        this.hcFallingAlarm
                    };
                }
                public static final class HcRisingAlarmEnt extends MIBEntry<HCALARMMIBDef>
                {
                    private HcRisingAlarmEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                    {
                        super(mib, parent, "hcRisingAlarm", "1.3.6.1.2.1.16.29.2.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HcFallingAlarmEnt extends MIBEntry<HCALARMMIBDef>
                {
                    private HcFallingAlarmEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                    {
                        super(mib, parent, "hcFallingAlarm", "1.3.6.1.2.1.16.29.2.0.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class HcAlarmConformanceEnt extends MIBEntry<HCALARMMIBDef>
        {
            /** Conformance Section*/
            public final HcAlarmCompliancesEnt hcAlarmCompliances;

            public final HcAlarmGroupsEnt hcAlarmGroups;

            private HcAlarmConformanceEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
            {
                super(mib, parent, "hcAlarmConformance", "1.3.6.1.2.1.16.29.3", false, false, false, false);
                this.hcAlarmCompliances = new HcAlarmCompliancesEnt(mib, this);
                this.hcAlarmGroups = new HcAlarmGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hcAlarmCompliances,
                    this.hcAlarmGroups
                };
            }
            public static final class HcAlarmCompliancesEnt extends MIBEntry<HCALARMMIBDef>
            {
                public final HcAlarmComplianceEnt hcAlarmCompliance;

                private HcAlarmCompliancesEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                {
                    super(mib, parent, "hcAlarmCompliances", "1.3.6.1.2.1.16.29.3.1", false, false, false, false);
                    this.hcAlarmCompliance = new HcAlarmComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hcAlarmCompliance
                    };
                }
                public static final class HcAlarmComplianceEnt extends MIBEntry<HCALARMMIBDef>
                {
                    private HcAlarmComplianceEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                    {
                        super(mib, parent, "hcAlarmCompliance", "1.3.6.1.2.1.16.29.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class HcAlarmGroupsEnt extends MIBEntry<HCALARMMIBDef>
            {
                /** Object Groups*/
                public final HcAlarmControlGroupEnt hcAlarmControlGroup;

                public final HcAlarmCapabilitiesGroupEnt hcAlarmCapabilitiesGroup;

                public final HcAlarmNotificationsGroupEnt hcAlarmNotificationsGroup;

                private HcAlarmGroupsEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                {
                    super(mib, parent, "hcAlarmGroups", "1.3.6.1.2.1.16.29.3.2", false, false, false, false);
                    this.hcAlarmControlGroup = new HcAlarmControlGroupEnt(mib, this);
                    this.hcAlarmCapabilitiesGroup = new HcAlarmCapabilitiesGroupEnt(mib, this);
                    this.hcAlarmNotificationsGroup = new HcAlarmNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hcAlarmControlGroup,
                        this.hcAlarmCapabilitiesGroup,
                        this.hcAlarmNotificationsGroup
                    };
                }
                public static final class HcAlarmControlGroupEnt extends MIBEntry<HCALARMMIBDef>
                {
                    private HcAlarmControlGroupEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                    {
                        super(mib, parent, "hcAlarmControlGroup", "1.3.6.1.2.1.16.29.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HcAlarmCapabilitiesGroupEnt extends MIBEntry<HCALARMMIBDef>
                {
                    private HcAlarmCapabilitiesGroupEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                    {
                        super(mib, parent, "hcAlarmCapabilitiesGroup", "1.3.6.1.2.1.16.29.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HcAlarmNotificationsGroupEnt extends MIBEntry<HCALARMMIBDef>
                {
                    private HcAlarmNotificationsGroupEnt(HCALARMMIBDef mib, MIBEntry<HCALARMMIBDef> parent)
                    {
                        super(mib, parent, "hcAlarmNotificationsGroup", "1.3.6.1.2.1.16.29.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
