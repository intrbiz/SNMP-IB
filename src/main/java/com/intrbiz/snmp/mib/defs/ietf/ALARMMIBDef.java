package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2579]
[RFC3411]
[RFC3291]
[RFC2580]*/
public final class ALARMMIBDef extends MIB
{
    public static final ALARMMIBDef ALARMMIB = new ALARMMIBDef();

    static { MIBs.getInstance().registerMIB(ALARMMIBDef.ALARMMIB); }

    /** [RFC2021]

September 09, 2004*/
    public final AlarmMIBEnt alarmMIB;

    private ALARMMIBDef()
    {
        super("ALARM-MIB");
        this.alarmMIB = new AlarmMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.alarmMIB
        };
    }

    public static final class AlarmMIBEnt extends MIBEntry<ALARMMIBDef>
    {
        public final AlarmObjectsEnt alarmObjects;

        public final AlarmNotificationsEnt alarmNotifications;

        /** Conformance*/
        public final AlarmConformanceEnt alarmConformance;

        private AlarmMIBEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
        {
            super(mib, parent, "alarmMIB", "1.3.6.1.2.1.118", false, false, false, false);
            this.alarmObjects = new AlarmObjectsEnt(mib, this);
            this.alarmNotifications = new AlarmNotificationsEnt(mib, this);
            this.alarmConformance = new AlarmConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.alarmObjects,
                this.alarmNotifications,
                this.alarmConformance
            };
        }
        public static final class AlarmObjectsEnt extends MIBEntry<ALARMMIBDef>
        {
            public final AlarmModelEnt alarmModel;

            public final AlarmActiveEnt alarmActive;

            public final AlarmClearEnt alarmClear;

            private AlarmObjectsEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
            {
                super(mib, parent, "alarmObjects", "1.3.6.1.2.1.118.1", false, false, false, false);
                this.alarmModel = new AlarmModelEnt(mib, this);
                this.alarmActive = new AlarmActiveEnt(mib, this);
                this.alarmClear = new AlarmClearEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.alarmModel,
                    this.alarmActive,
                    this.alarmClear
                };
            }
            public static final class AlarmModelEnt extends MIBEntry<ALARMMIBDef>
            {
                /** Alarm Model*/
                public final AlarmModelLastChangedEnt alarmModelLastChanged;

                public final AlarmModelTableEnt alarmModelTable;

                private AlarmModelEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                {
                    super(mib, parent, "alarmModel", "1.3.6.1.2.1.118.1.1", false, false, false, false);
                    this.alarmModelLastChanged = new AlarmModelLastChangedEnt(mib, this);
                    this.alarmModelTable = new AlarmModelTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.alarmModelLastChanged,
                        this.alarmModelTable
                    };
                }
                public static final class AlarmModelLastChangedEnt extends MIBEntry<ALARMMIBDef>
                {
                    private AlarmModelLastChangedEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                    {
                        super(mib, parent, "alarmModelLastChanged", "1.3.6.1.2.1.118.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlarmModelTableEnt extends MIBEntry<ALARMMIBDef>
                {
                    public final AlarmModelEntryEnt alarmModelEntry;

                    private AlarmModelTableEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                    {
                        super(mib, parent, "alarmModelTable", "1.3.6.1.2.1.118.1.1.2", false, true, false, false);
                        this.alarmModelEntry = new AlarmModelEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.alarmModelEntry
                        };
                    }
                    public static final class AlarmModelEntryEnt extends MIBEntry<ALARMMIBDef>
                    {
                        public final AlarmModelIndexEnt alarmModelIndex;

                        public final AlarmModelStateEnt alarmModelState;

                        public final AlarmModelNotificationIdEnt alarmModelNotificationId;

                        public final AlarmModelVarbindIndexEnt alarmModelVarbindIndex;

                        public final AlarmModelVarbindValueEnt alarmModelVarbindValue;

                        public final AlarmModelDescriptionEnt alarmModelDescription;

                        public final AlarmModelSpecificPointerEnt alarmModelSpecificPointer;

                        public final AlarmModelVarbindSubtreeEnt alarmModelVarbindSubtree;

                        public final AlarmModelResourcePrefixEnt alarmModelResourcePrefix;

                        public final AlarmModelRowStatusEnt alarmModelRowStatus;

                        private AlarmModelEntryEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                        {
                            super(mib, parent, "alarmModelEntry", "1.3.6.1.2.1.118.1.1.2.1", false, false, false, true);
                            this.alarmModelIndex = new AlarmModelIndexEnt(mib, this);
                            this.alarmModelState = new AlarmModelStateEnt(mib, this);
                            this.alarmModelNotificationId = new AlarmModelNotificationIdEnt(mib, this);
                            this.alarmModelVarbindIndex = new AlarmModelVarbindIndexEnt(mib, this);
                            this.alarmModelVarbindValue = new AlarmModelVarbindValueEnt(mib, this);
                            this.alarmModelDescription = new AlarmModelDescriptionEnt(mib, this);
                            this.alarmModelSpecificPointer = new AlarmModelSpecificPointerEnt(mib, this);
                            this.alarmModelVarbindSubtree = new AlarmModelVarbindSubtreeEnt(mib, this);
                            this.alarmModelResourcePrefix = new AlarmModelResourcePrefixEnt(mib, this);
                            this.alarmModelRowStatus = new AlarmModelRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.alarmModelIndex,
                                this.alarmModelState,
                                this.alarmModelNotificationId,
                                this.alarmModelVarbindIndex,
                                this.alarmModelVarbindValue,
                                this.alarmModelDescription,
                                this.alarmModelSpecificPointer,
                                this.alarmModelVarbindSubtree,
                                this.alarmModelResourcePrefix,
                                this.alarmModelRowStatus
                            };
                        }
                        public static final class AlarmModelIndexEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmModelIndexEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmModelIndex", "1.3.6.1.2.1.118.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmModelStateEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmModelStateEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmModelState", "1.3.6.1.2.1.118.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmModelNotificationIdEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmModelNotificationIdEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmModelNotificationId", "1.3.6.1.2.1.118.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmModelVarbindIndexEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmModelVarbindIndexEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmModelVarbindIndex", "1.3.6.1.2.1.118.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmModelVarbindValueEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmModelVarbindValueEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmModelVarbindValue", "1.3.6.1.2.1.118.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmModelDescriptionEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmModelDescriptionEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmModelDescription", "1.3.6.1.2.1.118.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmModelSpecificPointerEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmModelSpecificPointerEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmModelSpecificPointer", "1.3.6.1.2.1.118.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmModelVarbindSubtreeEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmModelVarbindSubtreeEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmModelVarbindSubtree", "1.3.6.1.2.1.118.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmModelResourcePrefixEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmModelResourcePrefixEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmModelResourcePrefix", "1.3.6.1.2.1.118.1.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmModelRowStatusEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmModelRowStatusEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmModelRowStatus", "1.3.6.1.2.1.118.1.1.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class AlarmActiveEnt extends MIBEntry<ALARMMIBDef>
            {
                /** Active Alarm Table --*/
                public final AlarmActiveLastChangedEnt alarmActiveLastChanged;

                public final AlarmActiveOverflowEnt alarmActiveOverflow;

                public final AlarmActiveTableEnt alarmActiveTable;

                /** Active Alarm Variable Table --*/
                public final AlarmActiveVariableTableEnt alarmActiveVariableTable;

                /** Statistics --*/
                public final AlarmActiveStatsTableEnt alarmActiveStatsTable;

                private AlarmActiveEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                {
                    super(mib, parent, "alarmActive", "1.3.6.1.2.1.118.1.2", false, false, false, false);
                    this.alarmActiveLastChanged = new AlarmActiveLastChangedEnt(mib, this);
                    this.alarmActiveOverflow = new AlarmActiveOverflowEnt(mib, this);
                    this.alarmActiveTable = new AlarmActiveTableEnt(mib, this);
                    this.alarmActiveVariableTable = new AlarmActiveVariableTableEnt(mib, this);
                    this.alarmActiveStatsTable = new AlarmActiveStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.alarmActiveLastChanged,
                        this.alarmActiveOverflow,
                        this.alarmActiveTable,
                        this.alarmActiveVariableTable,
                        this.alarmActiveStatsTable
                    };
                }
                public static final class AlarmActiveLastChangedEnt extends MIBEntry<ALARMMIBDef>
                {
                    private AlarmActiveLastChangedEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                    {
                        super(mib, parent, "alarmActiveLastChanged", "1.3.6.1.2.1.118.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlarmActiveOverflowEnt extends MIBEntry<ALARMMIBDef>
                {
                    private AlarmActiveOverflowEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                    {
                        super(mib, parent, "alarmActiveOverflow", "1.3.6.1.2.1.118.1.2.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlarmActiveTableEnt extends MIBEntry<ALARMMIBDef>
                {
                    public final AlarmActiveEntryEnt alarmActiveEntry;

                    private AlarmActiveTableEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                    {
                        super(mib, parent, "alarmActiveTable", "1.3.6.1.2.1.118.1.2.2", false, true, false, false);
                        this.alarmActiveEntry = new AlarmActiveEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.alarmActiveEntry
                        };
                    }
                    public static final class AlarmActiveEntryEnt extends MIBEntry<ALARMMIBDef>
                    {
                        public final AlarmListNameEnt alarmListName;

                        public final AlarmActiveDateAndTimeEnt alarmActiveDateAndTime;

                        public final AlarmActiveIndexEnt alarmActiveIndex;

                        public final AlarmActiveEngineIDEnt alarmActiveEngineID;

                        public final AlarmActiveEngineAddressTypeEnt alarmActiveEngineAddressType;

                        public final AlarmActiveEngineAddressEnt alarmActiveEngineAddress;

                        public final AlarmActiveContextNameEnt alarmActiveContextName;

                        public final AlarmActiveVariablesEnt alarmActiveVariables;

                        public final AlarmActiveNotificationIDEnt alarmActiveNotificationID;

                        public final AlarmActiveResourceIdEnt alarmActiveResourceId;

                        public final AlarmActiveDescriptionEnt alarmActiveDescription;

                        public final AlarmActiveLogPointerEnt alarmActiveLogPointer;

                        public final AlarmActiveModelPointerEnt alarmActiveModelPointer;

                        public final AlarmActiveSpecificPointerEnt alarmActiveSpecificPointer;

                        private AlarmActiveEntryEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                        {
                            super(mib, parent, "alarmActiveEntry", "1.3.6.1.2.1.118.1.2.2.1", false, false, false, true);
                            this.alarmListName = new AlarmListNameEnt(mib, this);
                            this.alarmActiveDateAndTime = new AlarmActiveDateAndTimeEnt(mib, this);
                            this.alarmActiveIndex = new AlarmActiveIndexEnt(mib, this);
                            this.alarmActiveEngineID = new AlarmActiveEngineIDEnt(mib, this);
                            this.alarmActiveEngineAddressType = new AlarmActiveEngineAddressTypeEnt(mib, this);
                            this.alarmActiveEngineAddress = new AlarmActiveEngineAddressEnt(mib, this);
                            this.alarmActiveContextName = new AlarmActiveContextNameEnt(mib, this);
                            this.alarmActiveVariables = new AlarmActiveVariablesEnt(mib, this);
                            this.alarmActiveNotificationID = new AlarmActiveNotificationIDEnt(mib, this);
                            this.alarmActiveResourceId = new AlarmActiveResourceIdEnt(mib, this);
                            this.alarmActiveDescription = new AlarmActiveDescriptionEnt(mib, this);
                            this.alarmActiveLogPointer = new AlarmActiveLogPointerEnt(mib, this);
                            this.alarmActiveModelPointer = new AlarmActiveModelPointerEnt(mib, this);
                            this.alarmActiveSpecificPointer = new AlarmActiveSpecificPointerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.alarmListName,
                                this.alarmActiveDateAndTime,
                                this.alarmActiveIndex,
                                this.alarmActiveEngineID,
                                this.alarmActiveEngineAddressType,
                                this.alarmActiveEngineAddress,
                                this.alarmActiveContextName,
                                this.alarmActiveVariables,
                                this.alarmActiveNotificationID,
                                this.alarmActiveResourceId,
                                this.alarmActiveDescription,
                                this.alarmActiveLogPointer,
                                this.alarmActiveModelPointer,
                                this.alarmActiveSpecificPointer
                            };
                        }
                        public static final class AlarmListNameEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmListNameEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmListName", "1.3.6.1.2.1.118.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveDateAndTimeEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveDateAndTimeEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveDateAndTime", "1.3.6.1.2.1.118.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveIndexEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveIndexEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveIndex", "1.3.6.1.2.1.118.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveEngineIDEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveEngineIDEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveEngineID", "1.3.6.1.2.1.118.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveEngineAddressTypeEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveEngineAddressTypeEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveEngineAddressType", "1.3.6.1.2.1.118.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveEngineAddressEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveEngineAddressEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveEngineAddress", "1.3.6.1.2.1.118.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveContextNameEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveContextNameEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveContextName", "1.3.6.1.2.1.118.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveVariablesEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveVariablesEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveVariables", "1.3.6.1.2.1.118.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveNotificationIDEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveNotificationIDEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveNotificationID", "1.3.6.1.2.1.118.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveResourceIdEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveResourceIdEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveResourceId", "1.3.6.1.2.1.118.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveDescriptionEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveDescriptionEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveDescription", "1.3.6.1.2.1.118.1.2.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveLogPointerEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveLogPointerEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveLogPointer", "1.3.6.1.2.1.118.1.2.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveModelPointerEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveModelPointerEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveModelPointer", "1.3.6.1.2.1.118.1.2.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveSpecificPointerEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveSpecificPointerEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveSpecificPointer", "1.3.6.1.2.1.118.1.2.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AlarmActiveVariableTableEnt extends MIBEntry<ALARMMIBDef>
                {
                    public final AlarmActiveVariableEntryEnt alarmActiveVariableEntry;

                    private AlarmActiveVariableTableEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                    {
                        super(mib, parent, "alarmActiveVariableTable", "1.3.6.1.2.1.118.1.2.3", false, true, false, false);
                        this.alarmActiveVariableEntry = new AlarmActiveVariableEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.alarmActiveVariableEntry
                        };
                    }
                    public static final class AlarmActiveVariableEntryEnt extends MIBEntry<ALARMMIBDef>
                    {
                        public final AlarmActiveVariableIndexEnt alarmActiveVariableIndex;

                        public final AlarmActiveVariableIDEnt alarmActiveVariableID;

                        public final AlarmActiveVariableValueTypeEnt alarmActiveVariableValueType;

                        public final AlarmActiveVariableCounter32ValEnt alarmActiveVariableCounter32Val;

                        public final AlarmActiveVariableUnsigned32ValEnt alarmActiveVariableUnsigned32Val;

                        public final AlarmActiveVariableTimeTicksValEnt alarmActiveVariableTimeTicksVal;

                        public final AlarmActiveVariableInteger32ValEnt alarmActiveVariableInteger32Val;

                        public final AlarmActiveVariableOctetStringValEnt alarmActiveVariableOctetStringVal;

                        public final AlarmActiveVariableIpAddressValEnt alarmActiveVariableIpAddressVal;

                        public final AlarmActiveVariableOidValEnt alarmActiveVariableOidVal;

                        public final AlarmActiveVariableCounter64ValEnt alarmActiveVariableCounter64Val;

                        public final AlarmActiveVariableOpaqueValEnt alarmActiveVariableOpaqueVal;

                        private AlarmActiveVariableEntryEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                        {
                            super(mib, parent, "alarmActiveVariableEntry", "1.3.6.1.2.1.118.1.2.3.1", false, false, false, true);
                            this.alarmActiveVariableIndex = new AlarmActiveVariableIndexEnt(mib, this);
                            this.alarmActiveVariableID = new AlarmActiveVariableIDEnt(mib, this);
                            this.alarmActiveVariableValueType = new AlarmActiveVariableValueTypeEnt(mib, this);
                            this.alarmActiveVariableCounter32Val = new AlarmActiveVariableCounter32ValEnt(mib, this);
                            this.alarmActiveVariableUnsigned32Val = new AlarmActiveVariableUnsigned32ValEnt(mib, this);
                            this.alarmActiveVariableTimeTicksVal = new AlarmActiveVariableTimeTicksValEnt(mib, this);
                            this.alarmActiveVariableInteger32Val = new AlarmActiveVariableInteger32ValEnt(mib, this);
                            this.alarmActiveVariableOctetStringVal = new AlarmActiveVariableOctetStringValEnt(mib, this);
                            this.alarmActiveVariableIpAddressVal = new AlarmActiveVariableIpAddressValEnt(mib, this);
                            this.alarmActiveVariableOidVal = new AlarmActiveVariableOidValEnt(mib, this);
                            this.alarmActiveVariableCounter64Val = new AlarmActiveVariableCounter64ValEnt(mib, this);
                            this.alarmActiveVariableOpaqueVal = new AlarmActiveVariableOpaqueValEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.alarmActiveVariableIndex,
                                this.alarmActiveVariableID,
                                this.alarmActiveVariableValueType,
                                this.alarmActiveVariableCounter32Val,
                                this.alarmActiveVariableUnsigned32Val,
                                this.alarmActiveVariableTimeTicksVal,
                                this.alarmActiveVariableInteger32Val,
                                this.alarmActiveVariableOctetStringVal,
                                this.alarmActiveVariableIpAddressVal,
                                this.alarmActiveVariableOidVal,
                                this.alarmActiveVariableCounter64Val,
                                this.alarmActiveVariableOpaqueVal
                            };
                        }
                        public static final class AlarmActiveVariableIndexEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveVariableIndexEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveVariableIndex", "1.3.6.1.2.1.118.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveVariableIDEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveVariableIDEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveVariableID", "1.3.6.1.2.1.118.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveVariableValueTypeEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveVariableValueTypeEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveVariableValueType", "1.3.6.1.2.1.118.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveVariableCounter32ValEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveVariableCounter32ValEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveVariableCounter32Val", "1.3.6.1.2.1.118.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveVariableUnsigned32ValEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveVariableUnsigned32ValEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveVariableUnsigned32Val", "1.3.6.1.2.1.118.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveVariableTimeTicksValEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveVariableTimeTicksValEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveVariableTimeTicksVal", "1.3.6.1.2.1.118.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveVariableInteger32ValEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveVariableInteger32ValEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveVariableInteger32Val", "1.3.6.1.2.1.118.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveVariableOctetStringValEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveVariableOctetStringValEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveVariableOctetStringVal", "1.3.6.1.2.1.118.1.2.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveVariableIpAddressValEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveVariableIpAddressValEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveVariableIpAddressVal", "1.3.6.1.2.1.118.1.2.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveVariableOidValEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveVariableOidValEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveVariableOidVal", "1.3.6.1.2.1.118.1.2.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveVariableCounter64ValEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveVariableCounter64ValEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveVariableCounter64Val", "1.3.6.1.2.1.118.1.2.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveVariableOpaqueValEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveVariableOpaqueValEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveVariableOpaqueVal", "1.3.6.1.2.1.118.1.2.3.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class AlarmActiveStatsTableEnt extends MIBEntry<ALARMMIBDef>
                {
                    public final AlarmActiveStatsEntryEnt alarmActiveStatsEntry;

                    private AlarmActiveStatsTableEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                    {
                        super(mib, parent, "alarmActiveStatsTable", "1.3.6.1.2.1.118.1.2.4", false, true, false, false);
                        this.alarmActiveStatsEntry = new AlarmActiveStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.alarmActiveStatsEntry
                        };
                    }
                    public static final class AlarmActiveStatsEntryEnt extends MIBEntry<ALARMMIBDef>
                    {
                        public final AlarmActiveStatsActiveCurrentEnt alarmActiveStatsActiveCurrent;

                        public final AlarmActiveStatsActivesEnt alarmActiveStatsActives;

                        public final AlarmActiveStatsLastRaiseEnt alarmActiveStatsLastRaise;

                        public final AlarmActiveStatsLastClearEnt alarmActiveStatsLastClear;

                        private AlarmActiveStatsEntryEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                        {
                            super(mib, parent, "alarmActiveStatsEntry", "1.3.6.1.2.1.118.1.2.4.1", false, false, false, true);
                            this.alarmActiveStatsActiveCurrent = new AlarmActiveStatsActiveCurrentEnt(mib, this);
                            this.alarmActiveStatsActives = new AlarmActiveStatsActivesEnt(mib, this);
                            this.alarmActiveStatsLastRaise = new AlarmActiveStatsLastRaiseEnt(mib, this);
                            this.alarmActiveStatsLastClear = new AlarmActiveStatsLastClearEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.alarmActiveStatsActiveCurrent,
                                this.alarmActiveStatsActives,
                                this.alarmActiveStatsLastRaise,
                                this.alarmActiveStatsLastClear
                            };
                        }
                        public static final class AlarmActiveStatsActiveCurrentEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveStatsActiveCurrentEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveStatsActiveCurrent", "1.3.6.1.2.1.118.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveStatsActivesEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveStatsActivesEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveStatsActives", "1.3.6.1.2.1.118.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveStatsLastRaiseEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveStatsLastRaiseEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveStatsLastRaise", "1.3.6.1.2.1.118.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmActiveStatsLastClearEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmActiveStatsLastClearEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmActiveStatsLastClear", "1.3.6.1.2.1.118.1.2.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class AlarmClearEnt extends MIBEntry<ALARMMIBDef>
            {
                /** Alarm Clear*/
                public final AlarmClearMaximumEnt alarmClearMaximum;

                public final AlarmClearTableEnt alarmClearTable;

                private AlarmClearEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                {
                    super(mib, parent, "alarmClear", "1.3.6.1.2.1.118.1.3", false, false, false, false);
                    this.alarmClearMaximum = new AlarmClearMaximumEnt(mib, this);
                    this.alarmClearTable = new AlarmClearTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.alarmClearMaximum,
                        this.alarmClearTable
                    };
                }
                public static final class AlarmClearMaximumEnt extends MIBEntry<ALARMMIBDef>
                {
                    private AlarmClearMaximumEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                    {
                        super(mib, parent, "alarmClearMaximum", "1.3.6.1.2.1.118.1.3.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlarmClearTableEnt extends MIBEntry<ALARMMIBDef>
                {
                    public final AlarmClearEntryEnt alarmClearEntry;

                    private AlarmClearTableEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                    {
                        super(mib, parent, "alarmClearTable", "1.3.6.1.2.1.118.1.3.2", false, true, false, false);
                        this.alarmClearEntry = new AlarmClearEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.alarmClearEntry
                        };
                    }
                    public static final class AlarmClearEntryEnt extends MIBEntry<ALARMMIBDef>
                    {
                        public final AlarmClearIndexEnt alarmClearIndex;

                        public final AlarmClearDateAndTimeEnt alarmClearDateAndTime;

                        public final AlarmClearEngineIDEnt alarmClearEngineID;

                        public final AlarmClearEngineAddressTypeEnt alarmClearEngineAddressType;

                        public final AlarmClearEngineAddressEnt alarmClearEngineAddress;

                        public final AlarmClearContextNameEnt alarmClearContextName;

                        public final AlarmClearNotificationIDEnt alarmClearNotificationID;

                        public final AlarmClearResourceIdEnt alarmClearResourceId;

                        public final AlarmClearLogIndexEnt alarmClearLogIndex;

                        public final AlarmClearModelPointerEnt alarmClearModelPointer;

                        private AlarmClearEntryEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                        {
                            super(mib, parent, "alarmClearEntry", "1.3.6.1.2.1.118.1.3.2.1", false, false, false, true);
                            this.alarmClearIndex = new AlarmClearIndexEnt(mib, this);
                            this.alarmClearDateAndTime = new AlarmClearDateAndTimeEnt(mib, this);
                            this.alarmClearEngineID = new AlarmClearEngineIDEnt(mib, this);
                            this.alarmClearEngineAddressType = new AlarmClearEngineAddressTypeEnt(mib, this);
                            this.alarmClearEngineAddress = new AlarmClearEngineAddressEnt(mib, this);
                            this.alarmClearContextName = new AlarmClearContextNameEnt(mib, this);
                            this.alarmClearNotificationID = new AlarmClearNotificationIDEnt(mib, this);
                            this.alarmClearResourceId = new AlarmClearResourceIdEnt(mib, this);
                            this.alarmClearLogIndex = new AlarmClearLogIndexEnt(mib, this);
                            this.alarmClearModelPointer = new AlarmClearModelPointerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.alarmClearIndex,
                                this.alarmClearDateAndTime,
                                this.alarmClearEngineID,
                                this.alarmClearEngineAddressType,
                                this.alarmClearEngineAddress,
                                this.alarmClearContextName,
                                this.alarmClearNotificationID,
                                this.alarmClearResourceId,
                                this.alarmClearLogIndex,
                                this.alarmClearModelPointer
                            };
                        }
                        public static final class AlarmClearIndexEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmClearIndexEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmClearIndex", "1.3.6.1.2.1.118.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmClearDateAndTimeEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmClearDateAndTimeEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmClearDateAndTime", "1.3.6.1.2.1.118.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmClearEngineIDEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmClearEngineIDEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmClearEngineID", "1.3.6.1.2.1.118.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmClearEngineAddressTypeEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmClearEngineAddressTypeEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmClearEngineAddressType", "1.3.6.1.2.1.118.1.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmClearEngineAddressEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmClearEngineAddressEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmClearEngineAddress", "1.3.6.1.2.1.118.1.3.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmClearContextNameEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmClearContextNameEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmClearContextName", "1.3.6.1.2.1.118.1.3.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmClearNotificationIDEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmClearNotificationIDEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmClearNotificationID", "1.3.6.1.2.1.118.1.3.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmClearResourceIdEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmClearResourceIdEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmClearResourceId", "1.3.6.1.2.1.118.1.3.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmClearLogIndexEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmClearLogIndexEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmClearLogIndex", "1.3.6.1.2.1.118.1.3.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AlarmClearModelPointerEnt extends MIBEntry<ALARMMIBDef>
                        {
                            private AlarmClearModelPointerEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                            {
                                super(mib, parent, "alarmClearModelPointer", "1.3.6.1.2.1.118.1.3.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class AlarmNotificationsEnt extends MIBEntry<ALARMMIBDef>
        {
            /** Notifications*/
            public final AlarmActiveStateEnt alarmActiveState;

            public final AlarmClearStateEnt alarmClearState;

            private AlarmNotificationsEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
            {
                super(mib, parent, "alarmNotifications", "1.3.6.1.2.1.118.0", false, false, false, false);
                this.alarmActiveState = new AlarmActiveStateEnt(mib, this);
                this.alarmClearState = new AlarmClearStateEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.alarmActiveState,
                    this.alarmClearState
                };
            }
            public static final class AlarmActiveStateEnt extends MIBEntry<ALARMMIBDef>
            {
                private AlarmActiveStateEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                {
                    super(mib, parent, "alarmActiveState", "1.3.6.1.2.1.118.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlarmClearStateEnt extends MIBEntry<ALARMMIBDef>
            {
                private AlarmClearStateEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                {
                    super(mib, parent, "alarmClearState", "1.3.6.1.2.1.118.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class AlarmConformanceEnt extends MIBEntry<ALARMMIBDef>
        {
            public final AlarmCompliancesEnt alarmCompliances;

            public final AlarmGroupsEnt alarmGroups;

            private AlarmConformanceEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
            {
                super(mib, parent, "alarmConformance", "1.3.6.1.2.1.118.2", false, false, false, false);
                this.alarmCompliances = new AlarmCompliancesEnt(mib, this);
                this.alarmGroups = new AlarmGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.alarmCompliances,
                    this.alarmGroups
                };
            }
            public static final class AlarmCompliancesEnt extends MIBEntry<ALARMMIBDef>
            {
                public final AlarmComplianceEnt alarmCompliance;

                private AlarmCompliancesEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                {
                    super(mib, parent, "alarmCompliances", "1.3.6.1.2.1.118.2.1", false, false, false, false);
                    this.alarmCompliance = new AlarmComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.alarmCompliance
                    };
                }
                public static final class AlarmComplianceEnt extends MIBEntry<ALARMMIBDef>
                {
                    private AlarmComplianceEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                    {
                        super(mib, parent, "alarmCompliance", "1.3.6.1.2.1.118.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class AlarmGroupsEnt extends MIBEntry<ALARMMIBDef>
            {
                public final AlarmModelGroupEnt alarmModelGroup;

                public final AlarmActiveGroupEnt alarmActiveGroup;

                public final AlarmActiveStatsGroupEnt alarmActiveStatsGroup;

                public final AlarmClearGroupEnt alarmClearGroup;

                public final AlarmNotificationsGroupEnt alarmNotificationsGroup;

                private AlarmGroupsEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                {
                    super(mib, parent, "alarmGroups", "1.3.6.1.2.1.118.2.2", false, false, false, false);
                    this.alarmModelGroup = new AlarmModelGroupEnt(mib, this);
                    this.alarmActiveGroup = new AlarmActiveGroupEnt(mib, this);
                    this.alarmActiveStatsGroup = new AlarmActiveStatsGroupEnt(mib, this);
                    this.alarmClearGroup = new AlarmClearGroupEnt(mib, this);
                    this.alarmNotificationsGroup = new AlarmNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.alarmModelGroup,
                        this.alarmActiveGroup,
                        this.alarmActiveStatsGroup,
                        this.alarmClearGroup,
                        this.alarmNotificationsGroup
                    };
                }
                public static final class AlarmModelGroupEnt extends MIBEntry<ALARMMIBDef>
                {
                    private AlarmModelGroupEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                    {
                        super(mib, parent, "alarmModelGroup", "1.3.6.1.2.1.118.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlarmActiveGroupEnt extends MIBEntry<ALARMMIBDef>
                {
                    private AlarmActiveGroupEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                    {
                        super(mib, parent, "alarmActiveGroup", "1.3.6.1.2.1.118.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlarmActiveStatsGroupEnt extends MIBEntry<ALARMMIBDef>
                {
                    private AlarmActiveStatsGroupEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                    {
                        super(mib, parent, "alarmActiveStatsGroup", "1.3.6.1.2.1.118.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlarmClearGroupEnt extends MIBEntry<ALARMMIBDef>
                {
                    private AlarmClearGroupEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                    {
                        super(mib, parent, "alarmClearGroup", "1.3.6.1.2.1.118.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlarmNotificationsGroupEnt extends MIBEntry<ALARMMIBDef>
                {
                    private AlarmNotificationsGroupEnt(ALARMMIBDef mib, MIBEntry<ALARMMIBDef> parent)
                    {
                        super(mib, parent, "alarmNotificationsGroup", "1.3.6.1.2.1.118.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
