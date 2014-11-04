package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class ENTITYSTATEMIBDef extends MIB
{
    public static final ENTITYSTATEMIBDef ENTITYSTATEMIB = new ENTITYSTATEMIBDef();

    static { MIBs.getInstance().registerMIB(ENTITYSTATEMIBDef.ENTITYSTATEMIB); }

    public final EntityStateMIBEnt entityStateMIB;

    private ENTITYSTATEMIBDef()
    {
        super("ENTITY-STATE-MIB");
        this.entityStateMIB = new EntityStateMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.entityStateMIB
        };
    }

    public static final class EntityStateMIBEnt extends MIBEntry<ENTITYSTATEMIBDef>
    {
        /** Entity State Objects*/
        public final EntStateObjectsEnt entStateObjects;

        /** Notifications*/
        public final EntStateNotificationsEnt entStateNotifications;

        /** Conformance and Compliance*/
        public final EntStateConformanceEnt entStateConformance;

        private EntityStateMIBEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
        {
            super(mib, parent, "entityStateMIB", "1.3.6.1.2.1.131", false, false, false, false);
            this.entStateObjects = new EntStateObjectsEnt(mib, this);
            this.entStateNotifications = new EntStateNotificationsEnt(mib, this);
            this.entStateConformance = new EntStateConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.entStateObjects,
                this.entStateNotifications,
                this.entStateConformance
            };
        }
        public static final class EntStateObjectsEnt extends MIBEntry<ENTITYSTATEMIBDef>
        {
            public final EntStateTableEnt entStateTable;

            private EntStateObjectsEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
            {
                super(mib, parent, "entStateObjects", "1.3.6.1.2.1.131.1", false, false, false, false);
                this.entStateTable = new EntStateTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.entStateTable
                };
            }
            public static final class EntStateTableEnt extends MIBEntry<ENTITYSTATEMIBDef>
            {
                public final EntStateEntryEnt entStateEntry;

                private EntStateTableEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
                {
                    super(mib, parent, "entStateTable", "1.3.6.1.2.1.131.1.1", false, true, false, false);
                    this.entStateEntry = new EntStateEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.entStateEntry
                    };
                }
                public static final class EntStateEntryEnt extends MIBEntry<ENTITYSTATEMIBDef>
                {
                    public final EntStateLastChangedEnt entStateLastChanged;

                    public final EntStateAdminEnt entStateAdmin;

                    public final EntStateOperEnt entStateOper;

                    public final EntStateUsageEnt entStateUsage;

                    public final EntStateAlarmEnt entStateAlarm;

                    public final EntStateStandbyEnt entStateStandby;

                    private EntStateEntryEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
                    {
                        super(mib, parent, "entStateEntry", "1.3.6.1.2.1.131.1.1.1", false, false, false, true);
                        this.entStateLastChanged = new EntStateLastChangedEnt(mib, this);
                        this.entStateAdmin = new EntStateAdminEnt(mib, this);
                        this.entStateOper = new EntStateOperEnt(mib, this);
                        this.entStateUsage = new EntStateUsageEnt(mib, this);
                        this.entStateAlarm = new EntStateAlarmEnt(mib, this);
                        this.entStateStandby = new EntStateStandbyEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.entStateLastChanged,
                            this.entStateAdmin,
                            this.entStateOper,
                            this.entStateUsage,
                            this.entStateAlarm,
                            this.entStateStandby
                        };
                    }
                    public static final class EntStateLastChangedEnt extends MIBEntry<ENTITYSTATEMIBDef>
                    {
                        private EntStateLastChangedEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
                        {
                            super(mib, parent, "entStateLastChanged", "1.3.6.1.2.1.131.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EntStateAdminEnt extends MIBEntry<ENTITYSTATEMIBDef>
                    {
                        private EntStateAdminEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
                        {
                            super(mib, parent, "entStateAdmin", "1.3.6.1.2.1.131.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EntStateOperEnt extends MIBEntry<ENTITYSTATEMIBDef>
                    {
                        private EntStateOperEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
                        {
                            super(mib, parent, "entStateOper", "1.3.6.1.2.1.131.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EntStateUsageEnt extends MIBEntry<ENTITYSTATEMIBDef>
                    {
                        private EntStateUsageEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
                        {
                            super(mib, parent, "entStateUsage", "1.3.6.1.2.1.131.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EntStateAlarmEnt extends MIBEntry<ENTITYSTATEMIBDef>
                    {
                        private EntStateAlarmEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
                        {
                            super(mib, parent, "entStateAlarm", "1.3.6.1.2.1.131.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EntStateStandbyEnt extends MIBEntry<ENTITYSTATEMIBDef>
                    {
                        private EntStateStandbyEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
                        {
                            super(mib, parent, "entStateStandby", "1.3.6.1.2.1.131.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class EntStateNotificationsEnt extends MIBEntry<ENTITYSTATEMIBDef>
        {
            public final EntStateOperEnabledEnt entStateOperEnabled;

            public final EntStateOperDisabledEnt entStateOperDisabled;

            private EntStateNotificationsEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
            {
                super(mib, parent, "entStateNotifications", "1.3.6.1.2.1.131.0", false, false, false, false);
                this.entStateOperEnabled = new EntStateOperEnabledEnt(mib, this);
                this.entStateOperDisabled = new EntStateOperDisabledEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.entStateOperEnabled,
                    this.entStateOperDisabled
                };
            }
            public static final class EntStateOperEnabledEnt extends MIBEntry<ENTITYSTATEMIBDef>
            {
                private EntStateOperEnabledEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
                {
                    super(mib, parent, "entStateOperEnabled", "1.3.6.1.2.1.131.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EntStateOperDisabledEnt extends MIBEntry<ENTITYSTATEMIBDef>
            {
                private EntStateOperDisabledEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
                {
                    super(mib, parent, "entStateOperDisabled", "1.3.6.1.2.1.131.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class EntStateConformanceEnt extends MIBEntry<ENTITYSTATEMIBDef>
        {
            public final EntStateCompliancesEnt entStateCompliances;

            public final EntStateGroupsEnt entStateGroups;

            private EntStateConformanceEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
            {
                super(mib, parent, "entStateConformance", "1.3.6.1.2.1.131.2", false, false, false, false);
                this.entStateCompliances = new EntStateCompliancesEnt(mib, this);
                this.entStateGroups = new EntStateGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.entStateCompliances,
                    this.entStateGroups
                };
            }
            public static final class EntStateCompliancesEnt extends MIBEntry<ENTITYSTATEMIBDef>
            {
                public final EntStateComplianceEnt entStateCompliance;

                private EntStateCompliancesEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
                {
                    super(mib, parent, "entStateCompliances", "1.3.6.1.2.1.131.2.1", false, false, false, false);
                    this.entStateCompliance = new EntStateComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.entStateCompliance
                    };
                }
                public static final class EntStateComplianceEnt extends MIBEntry<ENTITYSTATEMIBDef>
                {
                    private EntStateComplianceEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
                    {
                        super(mib, parent, "entStateCompliance", "1.3.6.1.2.1.131.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class EntStateGroupsEnt extends MIBEntry<ENTITYSTATEMIBDef>
            {
                public final EntStateGroupEnt entStateGroup;

                public final EntStateNotificationsGroupEnt entStateNotificationsGroup;

                private EntStateGroupsEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
                {
                    super(mib, parent, "entStateGroups", "1.3.6.1.2.1.131.2.2", false, false, false, false);
                    this.entStateGroup = new EntStateGroupEnt(mib, this);
                    this.entStateNotificationsGroup = new EntStateNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.entStateGroup,
                        this.entStateNotificationsGroup
                    };
                }
                public static final class EntStateGroupEnt extends MIBEntry<ENTITYSTATEMIBDef>
                {
                    private EntStateGroupEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
                    {
                        super(mib, parent, "entStateGroup", "1.3.6.1.2.1.131.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EntStateNotificationsGroupEnt extends MIBEntry<ENTITYSTATEMIBDef>
                {
                    private EntStateNotificationsGroupEnt(ENTITYSTATEMIBDef mib, MIBEntry<ENTITYSTATEMIBDef> parent)
                    {
                        super(mib, parent, "entStateNotificationsGroup", "1.3.6.1.2.1.131.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
