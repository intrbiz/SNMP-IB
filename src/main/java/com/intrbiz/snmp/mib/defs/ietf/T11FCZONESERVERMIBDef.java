package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2580]
[RFC2579]
[RFC3411]
[RFC2863]
[RFC4044]
[RFC4438]
[RFC4439]*/
public final class T11FCZONESERVERMIBDef extends MIB
{
    public static final T11FCZONESERVERMIBDef T11FCZONESERVERMIB = new T11FCZONESERVERMIBDef();

    static { MIBs.getInstance().registerMIB(T11FCZONESERVERMIBDef.T11FCZONESERVERMIB); }

    /** [RFC4439]*/
    public final T11ZoneServerMIBEnt t11ZoneServerMIB;

    private T11FCZONESERVERMIBDef()
    {
        super("T11-FC-ZONE-SERVER-MIB");
        this.t11ZoneServerMIB = new T11ZoneServerMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.t11ZoneServerMIB
        };
    }

    public static final class T11ZoneServerMIBEnt extends MIBEntry<T11FCZONESERVERMIBDef>
    {
        public final T11ZsMIBObjectsEnt t11ZsMIBObjects;

        public final T11ZsMIBConformanceEnt t11ZsMIBConformance;

        public final T11ZsMIBNotificationsEnt t11ZsMIBNotifications;

        private T11ZoneServerMIBEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
        {
            super(mib, parent, "t11ZoneServerMIB", "1.3.6.1.2.1.160", false, false, false, false);
            this.t11ZsMIBObjects = new T11ZsMIBObjectsEnt(mib, this);
            this.t11ZsMIBConformance = new T11ZsMIBConformanceEnt(mib, this);
            this.t11ZsMIBNotifications = new T11ZsMIBNotificationsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.t11ZsMIBObjects,
                this.t11ZsMIBConformance,
                this.t11ZsMIBNotifications
            };
        }
        public static final class T11ZsMIBObjectsEnt extends MIBEntry<T11FCZONESERVERMIBDef>
        {
            public final T11ZsConfigurationEnt t11ZsConfiguration;

            public final T11ZsStatisticsEnt t11ZsStatistics;

            private T11ZsMIBObjectsEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
            {
                super(mib, parent, "t11ZsMIBObjects", "1.3.6.1.2.1.160.1", false, false, false, false);
                this.t11ZsConfiguration = new T11ZsConfigurationEnt(mib, this);
                this.t11ZsStatistics = new T11ZsStatisticsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11ZsConfiguration,
                    this.t11ZsStatistics
                };
            }
            public static final class T11ZsConfigurationEnt extends MIBEntry<T11FCZONESERVERMIBDef>
            {
                /** The table of Zone Servers*/
                public final T11ZsServerTableEnt t11ZsServerTable;

                /** The table of Zone Sets*/
                public final T11ZsSetTableEnt t11ZsSetTable;

                /** The table of Zones*/
                public final T11ZsZoneTableEnt t11ZsZoneTable;

                /** The table specifying the Zones that belong to each Zone Set*/
                public final T11ZsSetZoneTableEnt t11ZsSetZoneTable;

                /** The table of Zone Aliases*/
                public final T11ZsAliasTableEnt t11ZsAliasTable;

                /** The table of Zone Members*/
                public final T11ZsZoneMemberTableEnt t11ZsZoneMemberTable;

                /** The table of Zone Attribute Blocks*/
                public final T11ZsAttribBlockTableEnt t11ZsAttribBlockTable;

                /** The table of Zone Attributes*/
                public final T11ZsAttribTableEnt t11ZsAttribTable;

                /** Activating a Zone Set*/
                public final T11ZsActivateTableEnt t11ZsActivateTable;

                /** t11ZsActiveTable*/
                public final T11ZsActiveTableEnt t11ZsActiveTable;

                /** Zones in the Active/Enforced Zone Set*/
                public final T11ZsActiveZoneTableEnt t11ZsActiveZoneTable;

                /** Zone Members in the Active/Enforced Zone Set*/
                public final T11ZsActiveZoneMemberTableEnt t11ZsActiveZoneMemberTable;

                /** Zone Attributes in the Active/Enforced Zone Set*/
                public final T11ZsActiveAttribTableEnt t11ZsActiveAttribTable;

                /** Notification Control Table*/
                public final T11ZsNotifyControlTableEnt t11ZsNotifyControlTable;

                public final T11ZsFabricIndexEnt t11ZsFabricIndex;

                private T11ZsConfigurationEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                {
                    super(mib, parent, "t11ZsConfiguration", "1.3.6.1.2.1.160.1.1", false, false, false, false);
                    this.t11ZsServerTable = new T11ZsServerTableEnt(mib, this);
                    this.t11ZsSetTable = new T11ZsSetTableEnt(mib, this);
                    this.t11ZsZoneTable = new T11ZsZoneTableEnt(mib, this);
                    this.t11ZsSetZoneTable = new T11ZsSetZoneTableEnt(mib, this);
                    this.t11ZsAliasTable = new T11ZsAliasTableEnt(mib, this);
                    this.t11ZsZoneMemberTable = new T11ZsZoneMemberTableEnt(mib, this);
                    this.t11ZsAttribBlockTable = new T11ZsAttribBlockTableEnt(mib, this);
                    this.t11ZsAttribTable = new T11ZsAttribTableEnt(mib, this);
                    this.t11ZsActivateTable = new T11ZsActivateTableEnt(mib, this);
                    this.t11ZsActiveTable = new T11ZsActiveTableEnt(mib, this);
                    this.t11ZsActiveZoneTable = new T11ZsActiveZoneTableEnt(mib, this);
                    this.t11ZsActiveZoneMemberTable = new T11ZsActiveZoneMemberTableEnt(mib, this);
                    this.t11ZsActiveAttribTable = new T11ZsActiveAttribTableEnt(mib, this);
                    this.t11ZsNotifyControlTable = new T11ZsNotifyControlTableEnt(mib, this);
                    this.t11ZsFabricIndex = new T11ZsFabricIndexEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11ZsServerTable,
                        this.t11ZsSetTable,
                        this.t11ZsZoneTable,
                        this.t11ZsSetZoneTable,
                        this.t11ZsAliasTable,
                        this.t11ZsZoneMemberTable,
                        this.t11ZsAttribBlockTable,
                        this.t11ZsAttribTable,
                        this.t11ZsActivateTable,
                        this.t11ZsActiveTable,
                        this.t11ZsActiveZoneTable,
                        this.t11ZsActiveZoneMemberTable,
                        this.t11ZsActiveAttribTable,
                        this.t11ZsNotifyControlTable,
                        this.t11ZsFabricIndex
                    };
                }
                public static final class T11ZsServerTableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    public final T11ZsServerEntryEnt t11ZsServerEntry;

                    private T11ZsServerTableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsServerTable", "1.3.6.1.2.1.160.1.1.1", false, true, false, false);
                        this.t11ZsServerEntry = new T11ZsServerEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11ZsServerEntry
                        };
                    }
                    public static final class T11ZsServerEntryEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                    {
                        public final T11ZsServerFabricIndexEnt t11ZsServerFabricIndex;

                        public final T11ZsServerCapabilityObjectEnt t11ZsServerCapabilityObject;

                        public final T11ZsServerDatabaseStorageTypeEnt t11ZsServerDatabaseStorageType;

                        public final T11ZsServerDistributeEnt t11ZsServerDistribute;

                        public final T11ZsServerCommitEnt t11ZsServerCommit;

                        public final T11ZsServerResultEnt t11ZsServerResult;

                        public final T11ZsServerReasonCodeEnt t11ZsServerReasonCode;

                        public final T11ZsServerReasonCodeExpEnt t11ZsServerReasonCodeExp;

                        public final T11ZsServerReasonVendorCodeEnt t11ZsServerReasonVendorCode;

                        public final T11ZsServerLastChangeEnt t11ZsServerLastChange;

                        public final T11ZsServerHardZoningEnt t11ZsServerHardZoning;

                        public final T11ZsServerReadFromDatabaseEnt t11ZsServerReadFromDatabase;

                        public final T11ZsServerOperationModeEnt t11ZsServerOperationMode;

                        public final T11ZsServerChangeModeResultEnt t11ZsServerChangeModeResult;

                        public final T11ZsServerDefaultZoneSettingEnt t11ZsServerDefaultZoneSetting;

                        public final T11ZsServerMergeControlSettingEnt t11ZsServerMergeControlSetting;

                        public final T11ZsServerDefZoneBroadcastEnt t11ZsServerDefZoneBroadcast;

                        private T11ZsServerEntryEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11ZsServerEntry", "1.3.6.1.2.1.160.1.1.1.1", false, false, false, true);
                            this.t11ZsServerFabricIndex = new T11ZsServerFabricIndexEnt(mib, this);
                            this.t11ZsServerCapabilityObject = new T11ZsServerCapabilityObjectEnt(mib, this);
                            this.t11ZsServerDatabaseStorageType = new T11ZsServerDatabaseStorageTypeEnt(mib, this);
                            this.t11ZsServerDistribute = new T11ZsServerDistributeEnt(mib, this);
                            this.t11ZsServerCommit = new T11ZsServerCommitEnt(mib, this);
                            this.t11ZsServerResult = new T11ZsServerResultEnt(mib, this);
                            this.t11ZsServerReasonCode = new T11ZsServerReasonCodeEnt(mib, this);
                            this.t11ZsServerReasonCodeExp = new T11ZsServerReasonCodeExpEnt(mib, this);
                            this.t11ZsServerReasonVendorCode = new T11ZsServerReasonVendorCodeEnt(mib, this);
                            this.t11ZsServerLastChange = new T11ZsServerLastChangeEnt(mib, this);
                            this.t11ZsServerHardZoning = new T11ZsServerHardZoningEnt(mib, this);
                            this.t11ZsServerReadFromDatabase = new T11ZsServerReadFromDatabaseEnt(mib, this);
                            this.t11ZsServerOperationMode = new T11ZsServerOperationModeEnt(mib, this);
                            this.t11ZsServerChangeModeResult = new T11ZsServerChangeModeResultEnt(mib, this);
                            this.t11ZsServerDefaultZoneSetting = new T11ZsServerDefaultZoneSettingEnt(mib, this);
                            this.t11ZsServerMergeControlSetting = new T11ZsServerMergeControlSettingEnt(mib, this);
                            this.t11ZsServerDefZoneBroadcast = new T11ZsServerDefZoneBroadcastEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11ZsServerFabricIndex,
                                this.t11ZsServerCapabilityObject,
                                this.t11ZsServerDatabaseStorageType,
                                this.t11ZsServerDistribute,
                                this.t11ZsServerCommit,
                                this.t11ZsServerResult,
                                this.t11ZsServerReasonCode,
                                this.t11ZsServerReasonCodeExp,
                                this.t11ZsServerReasonVendorCode,
                                this.t11ZsServerLastChange,
                                this.t11ZsServerHardZoning,
                                this.t11ZsServerReadFromDatabase,
                                this.t11ZsServerOperationMode,
                                this.t11ZsServerChangeModeResult,
                                this.t11ZsServerDefaultZoneSetting,
                                this.t11ZsServerMergeControlSetting,
                                this.t11ZsServerDefZoneBroadcast
                            };
                        }
                        public static final class T11ZsServerFabricIndexEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsServerFabricIndexEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsServerFabricIndex", "1.3.6.1.2.1.160.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsServerCapabilityObjectEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsServerCapabilityObjectEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsServerCapabilityObject", "1.3.6.1.2.1.160.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsServerDatabaseStorageTypeEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsServerDatabaseStorageTypeEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsServerDatabaseStorageType", "1.3.6.1.2.1.160.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsServerDistributeEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsServerDistributeEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsServerDistribute", "1.3.6.1.2.1.160.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsServerCommitEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsServerCommitEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsServerCommit", "1.3.6.1.2.1.160.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsServerResultEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsServerResultEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsServerResult", "1.3.6.1.2.1.160.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsServerReasonCodeEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsServerReasonCodeEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsServerReasonCode", "1.3.6.1.2.1.160.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsServerReasonCodeExpEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsServerReasonCodeExpEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsServerReasonCodeExp", "1.3.6.1.2.1.160.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsServerReasonVendorCodeEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsServerReasonVendorCodeEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsServerReasonVendorCode", "1.3.6.1.2.1.160.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsServerLastChangeEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsServerLastChangeEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsServerLastChange", "1.3.6.1.2.1.160.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsServerHardZoningEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsServerHardZoningEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsServerHardZoning", "1.3.6.1.2.1.160.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsServerReadFromDatabaseEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsServerReadFromDatabaseEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsServerReadFromDatabase", "1.3.6.1.2.1.160.1.1.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsServerOperationModeEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsServerOperationModeEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsServerOperationMode", "1.3.6.1.2.1.160.1.1.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsServerChangeModeResultEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsServerChangeModeResultEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsServerChangeModeResult", "1.3.6.1.2.1.160.1.1.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsServerDefaultZoneSettingEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsServerDefaultZoneSettingEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsServerDefaultZoneSetting", "1.3.6.1.2.1.160.1.1.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsServerMergeControlSettingEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsServerMergeControlSettingEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsServerMergeControlSetting", "1.3.6.1.2.1.160.1.1.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsServerDefZoneBroadcastEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsServerDefZoneBroadcastEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsServerDefZoneBroadcast", "1.3.6.1.2.1.160.1.1.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11ZsSetTableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    public final T11ZsSetEntryEnt t11ZsSetEntry;

                    private T11ZsSetTableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsSetTable", "1.3.6.1.2.1.160.1.1.2", false, true, false, false);
                        this.t11ZsSetEntry = new T11ZsSetEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11ZsSetEntry
                        };
                    }
                    public static final class T11ZsSetEntryEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                    {
                        public final T11ZsSetIndexEnt t11ZsSetIndex;

                        public final T11ZsSetNameEnt t11ZsSetName;

                        public final T11ZsSetRowStatusEnt t11ZsSetRowStatus;

                        private T11ZsSetEntryEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11ZsSetEntry", "1.3.6.1.2.1.160.1.1.2.1", false, false, false, true);
                            this.t11ZsSetIndex = new T11ZsSetIndexEnt(mib, this);
                            this.t11ZsSetName = new T11ZsSetNameEnt(mib, this);
                            this.t11ZsSetRowStatus = new T11ZsSetRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11ZsSetIndex,
                                this.t11ZsSetName,
                                this.t11ZsSetRowStatus
                            };
                        }
                        public static final class T11ZsSetIndexEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsSetIndexEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsSetIndex", "1.3.6.1.2.1.160.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsSetNameEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsSetNameEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsSetName", "1.3.6.1.2.1.160.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsSetRowStatusEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsSetRowStatusEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsSetRowStatus", "1.3.6.1.2.1.160.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11ZsZoneTableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    public final T11ZsZoneEntryEnt t11ZsZoneEntry;

                    private T11ZsZoneTableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsZoneTable", "1.3.6.1.2.1.160.1.1.3", false, true, false, false);
                        this.t11ZsZoneEntry = new T11ZsZoneEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11ZsZoneEntry
                        };
                    }
                    public static final class T11ZsZoneEntryEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                    {
                        public final T11ZsZoneIndexEnt t11ZsZoneIndex;

                        public final T11ZsZoneNameEnt t11ZsZoneName;

                        public final T11ZsZoneAttribBlockEnt t11ZsZoneAttribBlock;

                        public final T11ZsZoneRowStatusEnt t11ZsZoneRowStatus;

                        private T11ZsZoneEntryEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11ZsZoneEntry", "1.3.6.1.2.1.160.1.1.3.1", false, false, false, true);
                            this.t11ZsZoneIndex = new T11ZsZoneIndexEnt(mib, this);
                            this.t11ZsZoneName = new T11ZsZoneNameEnt(mib, this);
                            this.t11ZsZoneAttribBlock = new T11ZsZoneAttribBlockEnt(mib, this);
                            this.t11ZsZoneRowStatus = new T11ZsZoneRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11ZsZoneIndex,
                                this.t11ZsZoneName,
                                this.t11ZsZoneAttribBlock,
                                this.t11ZsZoneRowStatus
                            };
                        }
                        public static final class T11ZsZoneIndexEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsZoneIndexEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsZoneIndex", "1.3.6.1.2.1.160.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsZoneNameEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsZoneNameEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsZoneName", "1.3.6.1.2.1.160.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsZoneAttribBlockEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsZoneAttribBlockEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsZoneAttribBlock", "1.3.6.1.2.1.160.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsZoneRowStatusEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsZoneRowStatusEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsZoneRowStatus", "1.3.6.1.2.1.160.1.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11ZsSetZoneTableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    public final T11ZsSetZoneEntryEnt t11ZsSetZoneEntry;

                    private T11ZsSetZoneTableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsSetZoneTable", "1.3.6.1.2.1.160.1.1.4", false, true, false, false);
                        this.t11ZsSetZoneEntry = new T11ZsSetZoneEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11ZsSetZoneEntry
                        };
                    }
                    public static final class T11ZsSetZoneEntryEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                    {
                        public final T11ZsSetZoneRowStatusEnt t11ZsSetZoneRowStatus;

                        private T11ZsSetZoneEntryEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11ZsSetZoneEntry", "1.3.6.1.2.1.160.1.1.4.1", false, false, false, true);
                            this.t11ZsSetZoneRowStatus = new T11ZsSetZoneRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11ZsSetZoneRowStatus
                            };
                        }
                        public static final class T11ZsSetZoneRowStatusEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsSetZoneRowStatusEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsSetZoneRowStatus", "1.3.6.1.2.1.160.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11ZsAliasTableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    public final T11ZsAliasEntryEnt t11ZsAliasEntry;

                    private T11ZsAliasTableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsAliasTable", "1.3.6.1.2.1.160.1.1.5", false, true, false, false);
                        this.t11ZsAliasEntry = new T11ZsAliasEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11ZsAliasEntry
                        };
                    }
                    public static final class T11ZsAliasEntryEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                    {
                        public final T11ZsAliasIndexEnt t11ZsAliasIndex;

                        public final T11ZsAliasNameEnt t11ZsAliasName;

                        public final T11ZsAliasRowStatusEnt t11ZsAliasRowStatus;

                        private T11ZsAliasEntryEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11ZsAliasEntry", "1.3.6.1.2.1.160.1.1.5.1", false, false, false, true);
                            this.t11ZsAliasIndex = new T11ZsAliasIndexEnt(mib, this);
                            this.t11ZsAliasName = new T11ZsAliasNameEnt(mib, this);
                            this.t11ZsAliasRowStatus = new T11ZsAliasRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11ZsAliasIndex,
                                this.t11ZsAliasName,
                                this.t11ZsAliasRowStatus
                            };
                        }
                        public static final class T11ZsAliasIndexEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsAliasIndexEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsAliasIndex", "1.3.6.1.2.1.160.1.1.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsAliasNameEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsAliasNameEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsAliasName", "1.3.6.1.2.1.160.1.1.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsAliasRowStatusEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsAliasRowStatusEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsAliasRowStatus", "1.3.6.1.2.1.160.1.1.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11ZsZoneMemberTableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    public final T11ZsZoneMemberEntryEnt t11ZsZoneMemberEntry;

                    private T11ZsZoneMemberTableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsZoneMemberTable", "1.3.6.1.2.1.160.1.1.6", false, true, false, false);
                        this.t11ZsZoneMemberEntry = new T11ZsZoneMemberEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11ZsZoneMemberEntry
                        };
                    }
                    public static final class T11ZsZoneMemberEntryEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                    {
                        public final T11ZsZoneMemberParentTypeEnt t11ZsZoneMemberParentType;

                        public final T11ZsZoneMemberParentIndexEnt t11ZsZoneMemberParentIndex;

                        public final T11ZsZoneMemberIndexEnt t11ZsZoneMemberIndex;

                        public final T11ZsZoneMemberFormatEnt t11ZsZoneMemberFormat;

                        public final T11ZsZoneMemberIDEnt t11ZsZoneMemberID;

                        public final T11ZsZoneMemberRowStatusEnt t11ZsZoneMemberRowStatus;

                        private T11ZsZoneMemberEntryEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11ZsZoneMemberEntry", "1.3.6.1.2.1.160.1.1.6.1", false, false, false, true);
                            this.t11ZsZoneMemberParentType = new T11ZsZoneMemberParentTypeEnt(mib, this);
                            this.t11ZsZoneMemberParentIndex = new T11ZsZoneMemberParentIndexEnt(mib, this);
                            this.t11ZsZoneMemberIndex = new T11ZsZoneMemberIndexEnt(mib, this);
                            this.t11ZsZoneMemberFormat = new T11ZsZoneMemberFormatEnt(mib, this);
                            this.t11ZsZoneMemberID = new T11ZsZoneMemberIDEnt(mib, this);
                            this.t11ZsZoneMemberRowStatus = new T11ZsZoneMemberRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11ZsZoneMemberParentType,
                                this.t11ZsZoneMemberParentIndex,
                                this.t11ZsZoneMemberIndex,
                                this.t11ZsZoneMemberFormat,
                                this.t11ZsZoneMemberID,
                                this.t11ZsZoneMemberRowStatus
                            };
                        }
                        public static final class T11ZsZoneMemberParentTypeEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsZoneMemberParentTypeEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsZoneMemberParentType", "1.3.6.1.2.1.160.1.1.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsZoneMemberParentIndexEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsZoneMemberParentIndexEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsZoneMemberParentIndex", "1.3.6.1.2.1.160.1.1.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsZoneMemberIndexEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsZoneMemberIndexEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsZoneMemberIndex", "1.3.6.1.2.1.160.1.1.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsZoneMemberFormatEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsZoneMemberFormatEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsZoneMemberFormat", "1.3.6.1.2.1.160.1.1.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsZoneMemberIDEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsZoneMemberIDEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsZoneMemberID", "1.3.6.1.2.1.160.1.1.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsZoneMemberRowStatusEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsZoneMemberRowStatusEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsZoneMemberRowStatus", "1.3.6.1.2.1.160.1.1.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11ZsAttribBlockTableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    public final T11ZsAttribBlockEntryEnt t11ZsAttribBlockEntry;

                    private T11ZsAttribBlockTableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsAttribBlockTable", "1.3.6.1.2.1.160.1.1.7", false, true, false, false);
                        this.t11ZsAttribBlockEntry = new T11ZsAttribBlockEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11ZsAttribBlockEntry
                        };
                    }
                    public static final class T11ZsAttribBlockEntryEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                    {
                        public final T11ZsAttribBlockIndexEnt t11ZsAttribBlockIndex;

                        public final T11ZsAttribBlockNameEnt t11ZsAttribBlockName;

                        public final T11ZsAttribBlockRowStatusEnt t11ZsAttribBlockRowStatus;

                        private T11ZsAttribBlockEntryEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11ZsAttribBlockEntry", "1.3.6.1.2.1.160.1.1.7.1", false, false, false, true);
                            this.t11ZsAttribBlockIndex = new T11ZsAttribBlockIndexEnt(mib, this);
                            this.t11ZsAttribBlockName = new T11ZsAttribBlockNameEnt(mib, this);
                            this.t11ZsAttribBlockRowStatus = new T11ZsAttribBlockRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11ZsAttribBlockIndex,
                                this.t11ZsAttribBlockName,
                                this.t11ZsAttribBlockRowStatus
                            };
                        }
                        public static final class T11ZsAttribBlockIndexEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsAttribBlockIndexEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsAttribBlockIndex", "1.3.6.1.2.1.160.1.1.7.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsAttribBlockNameEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsAttribBlockNameEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsAttribBlockName", "1.3.6.1.2.1.160.1.1.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsAttribBlockRowStatusEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsAttribBlockRowStatusEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsAttribBlockRowStatus", "1.3.6.1.2.1.160.1.1.7.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11ZsAttribTableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    public final T11ZsAttribEntryEnt t11ZsAttribEntry;

                    private T11ZsAttribTableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsAttribTable", "1.3.6.1.2.1.160.1.1.8", false, true, false, false);
                        this.t11ZsAttribEntry = new T11ZsAttribEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11ZsAttribEntry
                        };
                    }
                    public static final class T11ZsAttribEntryEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                    {
                        public final T11ZsAttribIndexEnt t11ZsAttribIndex;

                        public final T11ZsAttribTypeEnt t11ZsAttribType;

                        public final T11ZsAttribValueEnt t11ZsAttribValue;

                        public final T11ZsAttribRowStatusEnt t11ZsAttribRowStatus;

                        private T11ZsAttribEntryEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11ZsAttribEntry", "1.3.6.1.2.1.160.1.1.8.1", false, false, false, true);
                            this.t11ZsAttribIndex = new T11ZsAttribIndexEnt(mib, this);
                            this.t11ZsAttribType = new T11ZsAttribTypeEnt(mib, this);
                            this.t11ZsAttribValue = new T11ZsAttribValueEnt(mib, this);
                            this.t11ZsAttribRowStatus = new T11ZsAttribRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11ZsAttribIndex,
                                this.t11ZsAttribType,
                                this.t11ZsAttribValue,
                                this.t11ZsAttribRowStatus
                            };
                        }
                        public static final class T11ZsAttribIndexEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsAttribIndexEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsAttribIndex", "1.3.6.1.2.1.160.1.1.8.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsAttribTypeEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsAttribTypeEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsAttribType", "1.3.6.1.2.1.160.1.1.8.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsAttribValueEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsAttribValueEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsAttribValue", "1.3.6.1.2.1.160.1.1.8.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsAttribRowStatusEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsAttribRowStatusEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsAttribRowStatus", "1.3.6.1.2.1.160.1.1.8.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11ZsActivateTableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    public final T11ZsActivateEntryEnt t11ZsActivateEntry;

                    private T11ZsActivateTableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsActivateTable", "1.3.6.1.2.1.160.1.1.9", false, true, false, false);
                        this.t11ZsActivateEntry = new T11ZsActivateEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11ZsActivateEntry
                        };
                    }
                    public static final class T11ZsActivateEntryEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                    {
                        public final T11ZsActivateRequestEnt t11ZsActivateRequest;

                        public final T11ZsActivateDeactivateEnt t11ZsActivateDeactivate;

                        public final T11ZsActivateResultEnt t11ZsActivateResult;

                        public final T11ZsActivateFailCauseEnt t11ZsActivateFailCause;

                        public final T11ZsActivateFailDomainIdEnt t11ZsActivateFailDomainId;

                        private T11ZsActivateEntryEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11ZsActivateEntry", "1.3.6.1.2.1.160.1.1.9.1", false, false, false, true);
                            this.t11ZsActivateRequest = new T11ZsActivateRequestEnt(mib, this);
                            this.t11ZsActivateDeactivate = new T11ZsActivateDeactivateEnt(mib, this);
                            this.t11ZsActivateResult = new T11ZsActivateResultEnt(mib, this);
                            this.t11ZsActivateFailCause = new T11ZsActivateFailCauseEnt(mib, this);
                            this.t11ZsActivateFailDomainId = new T11ZsActivateFailDomainIdEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11ZsActivateRequest,
                                this.t11ZsActivateDeactivate,
                                this.t11ZsActivateResult,
                                this.t11ZsActivateFailCause,
                                this.t11ZsActivateFailDomainId
                            };
                        }
                        public static final class T11ZsActivateRequestEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsActivateRequestEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsActivateRequest", "1.3.6.1.2.1.160.1.1.9.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsActivateDeactivateEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsActivateDeactivateEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsActivateDeactivate", "1.3.6.1.2.1.160.1.1.9.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsActivateResultEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsActivateResultEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsActivateResult", "1.3.6.1.2.1.160.1.1.9.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsActivateFailCauseEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsActivateFailCauseEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsActivateFailCause", "1.3.6.1.2.1.160.1.1.9.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsActivateFailDomainIdEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsActivateFailDomainIdEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsActivateFailDomainId", "1.3.6.1.2.1.160.1.1.9.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11ZsActiveTableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    public final T11ZsActiveEntryEnt t11ZsActiveEntry;

                    private T11ZsActiveTableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsActiveTable", "1.3.6.1.2.1.160.1.1.10", false, true, false, false);
                        this.t11ZsActiveEntry = new T11ZsActiveEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11ZsActiveEntry
                        };
                    }
                    public static final class T11ZsActiveEntryEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                    {
                        public final T11ZsActiveZoneSetNameEnt t11ZsActiveZoneSetName;

                        public final T11ZsActiveActivateTimeEnt t11ZsActiveActivateTime;

                        private T11ZsActiveEntryEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11ZsActiveEntry", "1.3.6.1.2.1.160.1.1.10.1", false, false, false, true);
                            this.t11ZsActiveZoneSetName = new T11ZsActiveZoneSetNameEnt(mib, this);
                            this.t11ZsActiveActivateTime = new T11ZsActiveActivateTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11ZsActiveZoneSetName,
                                this.t11ZsActiveActivateTime
                            };
                        }
                        public static final class T11ZsActiveZoneSetNameEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsActiveZoneSetNameEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsActiveZoneSetName", "1.3.6.1.2.1.160.1.1.10.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsActiveActivateTimeEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsActiveActivateTimeEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsActiveActivateTime", "1.3.6.1.2.1.160.1.1.10.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11ZsActiveZoneTableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    public final T11ZsActiveZoneEntryEnt t11ZsActiveZoneEntry;

                    private T11ZsActiveZoneTableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsActiveZoneTable", "1.3.6.1.2.1.160.1.1.11", false, true, false, false);
                        this.t11ZsActiveZoneEntry = new T11ZsActiveZoneEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11ZsActiveZoneEntry
                        };
                    }
                    public static final class T11ZsActiveZoneEntryEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                    {
                        public final T11ZsActiveZoneIndexEnt t11ZsActiveZoneIndex;

                        public final T11ZsActiveZoneNameEnt t11ZsActiveZoneName;

                        public final T11ZsActiveZoneBroadcastZoningEnt t11ZsActiveZoneBroadcastZoning;

                        public final T11ZsActiveZoneHardZoningEnt t11ZsActiveZoneHardZoning;

                        private T11ZsActiveZoneEntryEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11ZsActiveZoneEntry", "1.3.6.1.2.1.160.1.1.11.1", false, false, false, true);
                            this.t11ZsActiveZoneIndex = new T11ZsActiveZoneIndexEnt(mib, this);
                            this.t11ZsActiveZoneName = new T11ZsActiveZoneNameEnt(mib, this);
                            this.t11ZsActiveZoneBroadcastZoning = new T11ZsActiveZoneBroadcastZoningEnt(mib, this);
                            this.t11ZsActiveZoneHardZoning = new T11ZsActiveZoneHardZoningEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11ZsActiveZoneIndex,
                                this.t11ZsActiveZoneName,
                                this.t11ZsActiveZoneBroadcastZoning,
                                this.t11ZsActiveZoneHardZoning
                            };
                        }
                        public static final class T11ZsActiveZoneIndexEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsActiveZoneIndexEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsActiveZoneIndex", "1.3.6.1.2.1.160.1.1.11.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsActiveZoneNameEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsActiveZoneNameEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsActiveZoneName", "1.3.6.1.2.1.160.1.1.11.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsActiveZoneBroadcastZoningEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsActiveZoneBroadcastZoningEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsActiveZoneBroadcastZoning", "1.3.6.1.2.1.160.1.1.11.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsActiveZoneHardZoningEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsActiveZoneHardZoningEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsActiveZoneHardZoning", "1.3.6.1.2.1.160.1.1.11.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11ZsActiveZoneMemberTableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    public final T11ZsActiveZoneMemberEntryEnt t11ZsActiveZoneMemberEntry;

                    private T11ZsActiveZoneMemberTableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsActiveZoneMemberTable", "1.3.6.1.2.1.160.1.1.12", false, true, false, false);
                        this.t11ZsActiveZoneMemberEntry = new T11ZsActiveZoneMemberEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11ZsActiveZoneMemberEntry
                        };
                    }
                    public static final class T11ZsActiveZoneMemberEntryEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                    {
                        public final T11ZsActiveZoneMemberIndexEnt t11ZsActiveZoneMemberIndex;

                        public final T11ZsActiveZoneMemberFormatEnt t11ZsActiveZoneMemberFormat;

                        public final T11ZsActiveZoneMemberIDEnt t11ZsActiveZoneMemberID;

                        private T11ZsActiveZoneMemberEntryEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11ZsActiveZoneMemberEntry", "1.3.6.1.2.1.160.1.1.12.1", false, false, false, true);
                            this.t11ZsActiveZoneMemberIndex = new T11ZsActiveZoneMemberIndexEnt(mib, this);
                            this.t11ZsActiveZoneMemberFormat = new T11ZsActiveZoneMemberFormatEnt(mib, this);
                            this.t11ZsActiveZoneMemberID = new T11ZsActiveZoneMemberIDEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11ZsActiveZoneMemberIndex,
                                this.t11ZsActiveZoneMemberFormat,
                                this.t11ZsActiveZoneMemberID
                            };
                        }
                        public static final class T11ZsActiveZoneMemberIndexEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsActiveZoneMemberIndexEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsActiveZoneMemberIndex", "1.3.6.1.2.1.160.1.1.12.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsActiveZoneMemberFormatEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsActiveZoneMemberFormatEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsActiveZoneMemberFormat", "1.3.6.1.2.1.160.1.1.12.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsActiveZoneMemberIDEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsActiveZoneMemberIDEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsActiveZoneMemberID", "1.3.6.1.2.1.160.1.1.12.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11ZsActiveAttribTableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    public final T11ZsActiveAttribEntryEnt t11ZsActiveAttribEntry;

                    private T11ZsActiveAttribTableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsActiveAttribTable", "1.3.6.1.2.1.160.1.1.13", false, true, false, false);
                        this.t11ZsActiveAttribEntry = new T11ZsActiveAttribEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11ZsActiveAttribEntry
                        };
                    }
                    public static final class T11ZsActiveAttribEntryEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                    {
                        public final T11ZsActiveAttribIndexEnt t11ZsActiveAttribIndex;

                        public final T11ZsActiveAttribTypeEnt t11ZsActiveAttribType;

                        public final T11ZsActiveAttribValueEnt t11ZsActiveAttribValue;

                        private T11ZsActiveAttribEntryEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11ZsActiveAttribEntry", "1.3.6.1.2.1.160.1.1.13.1", false, false, false, true);
                            this.t11ZsActiveAttribIndex = new T11ZsActiveAttribIndexEnt(mib, this);
                            this.t11ZsActiveAttribType = new T11ZsActiveAttribTypeEnt(mib, this);
                            this.t11ZsActiveAttribValue = new T11ZsActiveAttribValueEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11ZsActiveAttribIndex,
                                this.t11ZsActiveAttribType,
                                this.t11ZsActiveAttribValue
                            };
                        }
                        public static final class T11ZsActiveAttribIndexEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsActiveAttribIndexEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsActiveAttribIndex", "1.3.6.1.2.1.160.1.1.13.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsActiveAttribTypeEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsActiveAttribTypeEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsActiveAttribType", "1.3.6.1.2.1.160.1.1.13.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsActiveAttribValueEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsActiveAttribValueEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsActiveAttribValue", "1.3.6.1.2.1.160.1.1.13.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11ZsNotifyControlTableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    public final T11ZsNotifyControlEntryEnt t11ZsNotifyControlEntry;

                    private T11ZsNotifyControlTableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsNotifyControlTable", "1.3.6.1.2.1.160.1.1.14", false, true, false, false);
                        this.t11ZsNotifyControlEntry = new T11ZsNotifyControlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11ZsNotifyControlEntry
                        };
                    }
                    public static final class T11ZsNotifyControlEntryEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                    {
                        public final T11ZsNotifyRequestRejectEnableEnt t11ZsNotifyRequestRejectEnable;

                        public final T11ZsNotifyMergeFailureEnableEnt t11ZsNotifyMergeFailureEnable;

                        public final T11ZsNotifyMergeSuccessEnableEnt t11ZsNotifyMergeSuccessEnable;

                        public final T11ZsNotifyDefZoneChangeEnableEnt t11ZsNotifyDefZoneChangeEnable;

                        public final T11ZsNotifyActivateEnableEnt t11ZsNotifyActivateEnable;

                        public final T11ZsRejectCtCommandStringEnt t11ZsRejectCtCommandString;

                        public final T11ZsRejectRequestSourceEnt t11ZsRejectRequestSource;

                        public final T11ZsRejectReasonCodeEnt t11ZsRejectReasonCode;

                        public final T11ZsRejectReasonCodeExpEnt t11ZsRejectReasonCodeExp;

                        public final T11ZsRejectReasonVendorCodeEnt t11ZsRejectReasonVendorCode;

                        private T11ZsNotifyControlEntryEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11ZsNotifyControlEntry", "1.3.6.1.2.1.160.1.1.14.1", false, false, false, true);
                            this.t11ZsNotifyRequestRejectEnable = new T11ZsNotifyRequestRejectEnableEnt(mib, this);
                            this.t11ZsNotifyMergeFailureEnable = new T11ZsNotifyMergeFailureEnableEnt(mib, this);
                            this.t11ZsNotifyMergeSuccessEnable = new T11ZsNotifyMergeSuccessEnableEnt(mib, this);
                            this.t11ZsNotifyDefZoneChangeEnable = new T11ZsNotifyDefZoneChangeEnableEnt(mib, this);
                            this.t11ZsNotifyActivateEnable = new T11ZsNotifyActivateEnableEnt(mib, this);
                            this.t11ZsRejectCtCommandString = new T11ZsRejectCtCommandStringEnt(mib, this);
                            this.t11ZsRejectRequestSource = new T11ZsRejectRequestSourceEnt(mib, this);
                            this.t11ZsRejectReasonCode = new T11ZsRejectReasonCodeEnt(mib, this);
                            this.t11ZsRejectReasonCodeExp = new T11ZsRejectReasonCodeExpEnt(mib, this);
                            this.t11ZsRejectReasonVendorCode = new T11ZsRejectReasonVendorCodeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11ZsNotifyRequestRejectEnable,
                                this.t11ZsNotifyMergeFailureEnable,
                                this.t11ZsNotifyMergeSuccessEnable,
                                this.t11ZsNotifyDefZoneChangeEnable,
                                this.t11ZsNotifyActivateEnable,
                                this.t11ZsRejectCtCommandString,
                                this.t11ZsRejectRequestSource,
                                this.t11ZsRejectReasonCode,
                                this.t11ZsRejectReasonCodeExp,
                                this.t11ZsRejectReasonVendorCode
                            };
                        }
                        public static final class T11ZsNotifyRequestRejectEnableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsNotifyRequestRejectEnableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsNotifyRequestRejectEnable", "1.3.6.1.2.1.160.1.1.14.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsNotifyMergeFailureEnableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsNotifyMergeFailureEnableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsNotifyMergeFailureEnable", "1.3.6.1.2.1.160.1.1.14.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsNotifyMergeSuccessEnableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsNotifyMergeSuccessEnableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsNotifyMergeSuccessEnable", "1.3.6.1.2.1.160.1.1.14.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsNotifyDefZoneChangeEnableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsNotifyDefZoneChangeEnableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsNotifyDefZoneChangeEnable", "1.3.6.1.2.1.160.1.1.14.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsNotifyActivateEnableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsNotifyActivateEnableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsNotifyActivateEnable", "1.3.6.1.2.1.160.1.1.14.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsRejectCtCommandStringEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsRejectCtCommandStringEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsRejectCtCommandString", "1.3.6.1.2.1.160.1.1.14.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsRejectRequestSourceEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsRejectRequestSourceEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsRejectRequestSource", "1.3.6.1.2.1.160.1.1.14.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsRejectReasonCodeEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsRejectReasonCodeEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsRejectReasonCode", "1.3.6.1.2.1.160.1.1.14.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsRejectReasonCodeExpEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsRejectReasonCodeExpEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsRejectReasonCodeExp", "1.3.6.1.2.1.160.1.1.14.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsRejectReasonVendorCodeEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsRejectReasonVendorCodeEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsRejectReasonVendorCode", "1.3.6.1.2.1.160.1.1.14.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11ZsFabricIndexEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    private T11ZsFabricIndexEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsFabricIndex", "1.3.6.1.2.1.160.1.1.15", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class T11ZsStatisticsEnt extends MIBEntry<T11FCZONESERVERMIBDef>
            {
                /** Zone Server Statistics*/
                public final T11ZsStatsTableEnt t11ZsStatsTable;

                private T11ZsStatisticsEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                {
                    super(mib, parent, "t11ZsStatistics", "1.3.6.1.2.1.160.1.2", false, false, false, false);
                    this.t11ZsStatsTable = new T11ZsStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11ZsStatsTable
                    };
                }
                public static final class T11ZsStatsTableEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    public final T11ZsStatsEntryEnt t11ZsStatsEntry;

                    private T11ZsStatsTableEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsStatsTable", "1.3.6.1.2.1.160.1.2.1", false, true, false, false);
                        this.t11ZsStatsEntry = new T11ZsStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11ZsStatsEntry
                        };
                    }
                    public static final class T11ZsStatsEntryEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                    {
                        public final T11ZsOutMergeRequestsEnt t11ZsOutMergeRequests;

                        public final T11ZsInMergeAcceptsEnt t11ZsInMergeAccepts;

                        public final T11ZsInMergeRequestsEnt t11ZsInMergeRequests;

                        public final T11ZsOutMergeAcceptsEnt t11ZsOutMergeAccepts;

                        public final T11ZsOutChangeRequestsEnt t11ZsOutChangeRequests;

                        public final T11ZsInChangeAcceptsEnt t11ZsInChangeAccepts;

                        public final T11ZsInChangeRequestsEnt t11ZsInChangeRequests;

                        public final T11ZsOutChangeAcceptsEnt t11ZsOutChangeAccepts;

                        public final T11ZsInZsRequestsEnt t11ZsInZsRequests;

                        public final T11ZsOutZsRejectsEnt t11ZsOutZsRejects;

                        private T11ZsStatsEntryEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11ZsStatsEntry", "1.3.6.1.2.1.160.1.2.1.1", false, false, false, true);
                            this.t11ZsOutMergeRequests = new T11ZsOutMergeRequestsEnt(mib, this);
                            this.t11ZsInMergeAccepts = new T11ZsInMergeAcceptsEnt(mib, this);
                            this.t11ZsInMergeRequests = new T11ZsInMergeRequestsEnt(mib, this);
                            this.t11ZsOutMergeAccepts = new T11ZsOutMergeAcceptsEnt(mib, this);
                            this.t11ZsOutChangeRequests = new T11ZsOutChangeRequestsEnt(mib, this);
                            this.t11ZsInChangeAccepts = new T11ZsInChangeAcceptsEnt(mib, this);
                            this.t11ZsInChangeRequests = new T11ZsInChangeRequestsEnt(mib, this);
                            this.t11ZsOutChangeAccepts = new T11ZsOutChangeAcceptsEnt(mib, this);
                            this.t11ZsInZsRequests = new T11ZsInZsRequestsEnt(mib, this);
                            this.t11ZsOutZsRejects = new T11ZsOutZsRejectsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11ZsOutMergeRequests,
                                this.t11ZsInMergeAccepts,
                                this.t11ZsInMergeRequests,
                                this.t11ZsOutMergeAccepts,
                                this.t11ZsOutChangeRequests,
                                this.t11ZsInChangeAccepts,
                                this.t11ZsInChangeRequests,
                                this.t11ZsOutChangeAccepts,
                                this.t11ZsInZsRequests,
                                this.t11ZsOutZsRejects
                            };
                        }
                        public static final class T11ZsOutMergeRequestsEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsOutMergeRequestsEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsOutMergeRequests", "1.3.6.1.2.1.160.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsInMergeAcceptsEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsInMergeAcceptsEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsInMergeAccepts", "1.3.6.1.2.1.160.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsInMergeRequestsEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsInMergeRequestsEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsInMergeRequests", "1.3.6.1.2.1.160.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsOutMergeAcceptsEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsOutMergeAcceptsEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsOutMergeAccepts", "1.3.6.1.2.1.160.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsOutChangeRequestsEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsOutChangeRequestsEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsOutChangeRequests", "1.3.6.1.2.1.160.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsInChangeAcceptsEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsInChangeAcceptsEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsInChangeAccepts", "1.3.6.1.2.1.160.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsInChangeRequestsEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsInChangeRequestsEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsInChangeRequests", "1.3.6.1.2.1.160.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsOutChangeAcceptsEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsOutChangeAcceptsEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsOutChangeAccepts", "1.3.6.1.2.1.160.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsInZsRequestsEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsInZsRequestsEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsInZsRequests", "1.3.6.1.2.1.160.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11ZsOutZsRejectsEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                        {
                            private T11ZsOutZsRejectsEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11ZsOutZsRejects", "1.3.6.1.2.1.160.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class T11ZsMIBConformanceEnt extends MIBEntry<T11FCZONESERVERMIBDef>
        {
            /** Conformance*/
            public final T11ZsMIBCompliancesEnt t11ZsMIBCompliances;

            public final T11ZsMIBGroupsEnt t11ZsMIBGroups;

            private T11ZsMIBConformanceEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
            {
                super(mib, parent, "t11ZsMIBConformance", "1.3.6.1.2.1.160.2", false, false, false, false);
                this.t11ZsMIBCompliances = new T11ZsMIBCompliancesEnt(mib, this);
                this.t11ZsMIBGroups = new T11ZsMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11ZsMIBCompliances,
                    this.t11ZsMIBGroups
                };
            }
            public static final class T11ZsMIBCompliancesEnt extends MIBEntry<T11FCZONESERVERMIBDef>
            {
                public final T11ZsMIBComplianceEnt t11ZsMIBCompliance;

                private T11ZsMIBCompliancesEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                {
                    super(mib, parent, "t11ZsMIBCompliances", "1.3.6.1.2.1.160.2.1", false, false, false, false);
                    this.t11ZsMIBCompliance = new T11ZsMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11ZsMIBCompliance
                    };
                }
                public static final class T11ZsMIBComplianceEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    private T11ZsMIBComplianceEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsMIBCompliance", "1.3.6.1.2.1.160.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class T11ZsMIBGroupsEnt extends MIBEntry<T11FCZONESERVERMIBDef>
            {
                /** Units of Conformance*/
                public final T11ZsBasicGroupEnt t11ZsBasicGroup;

                public final T11ZsEnhancedModeGroupEnt t11ZsEnhancedModeGroup;

                public final T11ZsStatisticsGroupEnt t11ZsStatisticsGroup;

                public final T11ZsNotificationControlGroupEnt t11ZsNotificationControlGroup;

                public final T11ZsActivateGroupEnt t11ZsActivateGroup;

                public final T11ZsNotificationGroupEnt t11ZsNotificationGroup;

                private T11ZsMIBGroupsEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                {
                    super(mib, parent, "t11ZsMIBGroups", "1.3.6.1.2.1.160.2.2", false, false, false, false);
                    this.t11ZsBasicGroup = new T11ZsBasicGroupEnt(mib, this);
                    this.t11ZsEnhancedModeGroup = new T11ZsEnhancedModeGroupEnt(mib, this);
                    this.t11ZsStatisticsGroup = new T11ZsStatisticsGroupEnt(mib, this);
                    this.t11ZsNotificationControlGroup = new T11ZsNotificationControlGroupEnt(mib, this);
                    this.t11ZsActivateGroup = new T11ZsActivateGroupEnt(mib, this);
                    this.t11ZsNotificationGroup = new T11ZsNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11ZsBasicGroup,
                        this.t11ZsEnhancedModeGroup,
                        this.t11ZsStatisticsGroup,
                        this.t11ZsNotificationControlGroup,
                        this.t11ZsActivateGroup,
                        this.t11ZsNotificationGroup
                    };
                }
                public static final class T11ZsBasicGroupEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    private T11ZsBasicGroupEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsBasicGroup", "1.3.6.1.2.1.160.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11ZsEnhancedModeGroupEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    private T11ZsEnhancedModeGroupEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsEnhancedModeGroup", "1.3.6.1.2.1.160.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11ZsStatisticsGroupEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    private T11ZsStatisticsGroupEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsStatisticsGroup", "1.3.6.1.2.1.160.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11ZsNotificationControlGroupEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    private T11ZsNotificationControlGroupEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsNotificationControlGroup", "1.3.6.1.2.1.160.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11ZsActivateGroupEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    private T11ZsActivateGroupEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsActivateGroup", "1.3.6.1.2.1.160.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11ZsNotificationGroupEnt extends MIBEntry<T11FCZONESERVERMIBDef>
                {
                    private T11ZsNotificationGroupEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11ZsNotificationGroup", "1.3.6.1.2.1.160.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class T11ZsMIBNotificationsEnt extends MIBEntry<T11FCZONESERVERMIBDef>
        {
            /** Notifications*/
            public final T11ZsRequestRejectNotifyEnt t11ZsRequestRejectNotify;

            public final T11ZsMergeFailureNotifyEnt t11ZsMergeFailureNotify;

            public final T11ZsMergeSuccessNotifyEnt t11ZsMergeSuccessNotify;

            public final T11ZsDefZoneChangeNotifyEnt t11ZsDefZoneChangeNotify;

            public final T11ZsActivateNotifyEnt t11ZsActivateNotify;

            private T11ZsMIBNotificationsEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
            {
                super(mib, parent, "t11ZsMIBNotifications", "1.3.6.1.2.1.160.0", false, false, false, false);
                this.t11ZsRequestRejectNotify = new T11ZsRequestRejectNotifyEnt(mib, this);
                this.t11ZsMergeFailureNotify = new T11ZsMergeFailureNotifyEnt(mib, this);
                this.t11ZsMergeSuccessNotify = new T11ZsMergeSuccessNotifyEnt(mib, this);
                this.t11ZsDefZoneChangeNotify = new T11ZsDefZoneChangeNotifyEnt(mib, this);
                this.t11ZsActivateNotify = new T11ZsActivateNotifyEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11ZsRequestRejectNotify,
                    this.t11ZsMergeFailureNotify,
                    this.t11ZsMergeSuccessNotify,
                    this.t11ZsDefZoneChangeNotify,
                    this.t11ZsActivateNotify
                };
            }
            public static final class T11ZsRequestRejectNotifyEnt extends MIBEntry<T11FCZONESERVERMIBDef>
            {
                private T11ZsRequestRejectNotifyEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                {
                    super(mib, parent, "t11ZsRequestRejectNotify", "1.3.6.1.2.1.160.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class T11ZsMergeFailureNotifyEnt extends MIBEntry<T11FCZONESERVERMIBDef>
            {
                private T11ZsMergeFailureNotifyEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                {
                    super(mib, parent, "t11ZsMergeFailureNotify", "1.3.6.1.2.1.160.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class T11ZsMergeSuccessNotifyEnt extends MIBEntry<T11FCZONESERVERMIBDef>
            {
                private T11ZsMergeSuccessNotifyEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                {
                    super(mib, parent, "t11ZsMergeSuccessNotify", "1.3.6.1.2.1.160.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class T11ZsDefZoneChangeNotifyEnt extends MIBEntry<T11FCZONESERVERMIBDef>
            {
                private T11ZsDefZoneChangeNotifyEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                {
                    super(mib, parent, "t11ZsDefZoneChangeNotify", "1.3.6.1.2.1.160.0.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class T11ZsActivateNotifyEnt extends MIBEntry<T11FCZONESERVERMIBDef>
            {
                private T11ZsActivateNotifyEnt(T11FCZONESERVERMIBDef mib, MIBEntry<T11FCZONESERVERMIBDef> parent)
                {
                    super(mib, parent, "t11ZsActivateNotify", "1.3.6.1.2.1.160.0.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
