package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class APSMIBDef extends MIB
{
    public static final APSMIBDef APSMIB = new APSMIBDef();

    /** February 28, 2003*/
    public final ApsMIBEnt apsMIB;

    private APSMIBDef()
    {
        super("APS-MIB");
        this.apsMIB = new ApsMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.apsMIB
        };
    }

    public static final class ApsMIBEnt extends MIBEntry<APSMIBDef>
    {
        public final ApsMIBObjectsEnt apsMIBObjects;

        public final ApsMIBNotificationsEnt apsMIBNotifications;

        public final ApsMIBConformanceEnt apsMIBConformance;

        private ApsMIBEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
        {
            super(mib, parent, "apsMIB", "1.3.6.1.2.1.10.49", false, false, false, false);
            this.apsMIBObjects = new ApsMIBObjectsEnt(mib, this);
            this.apsMIBNotifications = new ApsMIBNotificationsEnt(mib, this);
            this.apsMIBConformance = new ApsMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.apsMIBObjects,
                this.apsMIBNotifications,
                this.apsMIBConformance
            };
        }
        public static final class ApsMIBObjectsEnt extends MIBEntry<APSMIBDef>
        {
            /** APS Configuration TableThis table supports the addition, configuration and deletion of APSgroups.*/
            public final ApsConfigEnt apsConfig;

            /** APS Status TableThis table provides APS group statistics.*/
            public final ApsStatusTableEnt apsStatusTable;

            /** APS Map GroupLists the SONET LTE interfaces that may be used to create APS groups.*/
            public final ApsMapEnt apsMap;

            /** APS Channel Configuration TableThis table supports the addition, configuration and deletion ofchannels in APS groups.*/
            public final ApsChanConfigTableEnt apsChanConfigTable;

            /** APS Command TableThis table provides the ability to initiate APS commands.*/
            public final ApsCommandTableEnt apsCommandTable;

            /** APS Channel Status TableThis table provides APS channel statistics.*/
            public final ApsChanStatusTableEnt apsChanStatusTable;

            public final ApsNotificationEnableEnt apsNotificationEnable;

            private ApsMIBObjectsEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
            {
                super(mib, parent, "apsMIBObjects", "1.3.6.1.2.1.10.49.1", false, false, false, false);
                this.apsConfig = new ApsConfigEnt(mib, this);
                this.apsStatusTable = new ApsStatusTableEnt(mib, this);
                this.apsMap = new ApsMapEnt(mib, this);
                this.apsChanConfigTable = new ApsChanConfigTableEnt(mib, this);
                this.apsCommandTable = new ApsCommandTableEnt(mib, this);
                this.apsChanStatusTable = new ApsChanStatusTableEnt(mib, this);
                this.apsNotificationEnable = new ApsNotificationEnableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.apsConfig,
                    this.apsStatusTable,
                    this.apsMap,
                    this.apsChanConfigTable,
                    this.apsCommandTable,
                    this.apsChanStatusTable,
                    this.apsNotificationEnable
                };
            }
            public static final class ApsConfigEnt extends MIBEntry<APSMIBDef>
            {
                public final ApsConfigGroupsEnt apsConfigGroups;

                public final ApsConfigTableEnt apsConfigTable;

                private ApsConfigEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                {
                    super(mib, parent, "apsConfig", "1.3.6.1.2.1.10.49.1.1", false, false, false, false);
                    this.apsConfigGroups = new ApsConfigGroupsEnt(mib, this);
                    this.apsConfigTable = new ApsConfigTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apsConfigGroups,
                        this.apsConfigTable
                    };
                }
                public static final class ApsConfigGroupsEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsConfigGroupsEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsConfigGroups", "1.3.6.1.2.1.10.49.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApsConfigTableEnt extends MIBEntry<APSMIBDef>
                {
                    public final ApsConfigEntryEnt apsConfigEntry;

                    private ApsConfigTableEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsConfigTable", "1.3.6.1.2.1.10.49.1.1.2", false, true, false, false);
                        this.apsConfigEntry = new ApsConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.apsConfigEntry
                        };
                    }
                    public static final class ApsConfigEntryEnt extends MIBEntry<APSMIBDef>
                    {
                        public final ApsConfigNameEnt apsConfigName;

                        public final ApsConfigRowStatusEnt apsConfigRowStatus;

                        public final ApsConfigModeEnt apsConfigMode;

                        public final ApsConfigRevertEnt apsConfigRevert;

                        public final ApsConfigDirectionEnt apsConfigDirection;

                        public final ApsConfigExtraTrafficEnt apsConfigExtraTraffic;

                        public final ApsConfigSdBerThresholdEnt apsConfigSdBerThreshold;

                        public final ApsConfigSfBerThresholdEnt apsConfigSfBerThreshold;

                        public final ApsConfigWaitToRestoreEnt apsConfigWaitToRestore;

                        public final ApsConfigCreationTimeEnt apsConfigCreationTime;

                        public final ApsConfigStorageTypeEnt apsConfigStorageType;

                        private ApsConfigEntryEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsConfigEntry", "1.3.6.1.2.1.10.49.1.1.2.1", false, false, false, true);
                            this.apsConfigName = new ApsConfigNameEnt(mib, this);
                            this.apsConfigRowStatus = new ApsConfigRowStatusEnt(mib, this);
                            this.apsConfigMode = new ApsConfigModeEnt(mib, this);
                            this.apsConfigRevert = new ApsConfigRevertEnt(mib, this);
                            this.apsConfigDirection = new ApsConfigDirectionEnt(mib, this);
                            this.apsConfigExtraTraffic = new ApsConfigExtraTrafficEnt(mib, this);
                            this.apsConfigSdBerThreshold = new ApsConfigSdBerThresholdEnt(mib, this);
                            this.apsConfigSfBerThreshold = new ApsConfigSfBerThresholdEnt(mib, this);
                            this.apsConfigWaitToRestore = new ApsConfigWaitToRestoreEnt(mib, this);
                            this.apsConfigCreationTime = new ApsConfigCreationTimeEnt(mib, this);
                            this.apsConfigStorageType = new ApsConfigStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.apsConfigName,
                                this.apsConfigRowStatus,
                                this.apsConfigMode,
                                this.apsConfigRevert,
                                this.apsConfigDirection,
                                this.apsConfigExtraTraffic,
                                this.apsConfigSdBerThreshold,
                                this.apsConfigSfBerThreshold,
                                this.apsConfigWaitToRestore,
                                this.apsConfigCreationTime,
                                this.apsConfigStorageType
                            };
                        }
                        public static final class ApsConfigNameEnt extends MIBEntry<APSMIBDef>
                        {
                            private ApsConfigNameEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                            {
                                super(mib, parent, "apsConfigName", "1.3.6.1.2.1.10.49.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApsConfigRowStatusEnt extends MIBEntry<APSMIBDef>
                        {
                            private ApsConfigRowStatusEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                            {
                                super(mib, parent, "apsConfigRowStatus", "1.3.6.1.2.1.10.49.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApsConfigModeEnt extends MIBEntry<APSMIBDef>
                        {
                            private ApsConfigModeEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                            {
                                super(mib, parent, "apsConfigMode", "1.3.6.1.2.1.10.49.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApsConfigRevertEnt extends MIBEntry<APSMIBDef>
                        {
                            private ApsConfigRevertEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                            {
                                super(mib, parent, "apsConfigRevert", "1.3.6.1.2.1.10.49.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApsConfigDirectionEnt extends MIBEntry<APSMIBDef>
                        {
                            private ApsConfigDirectionEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                            {
                                super(mib, parent, "apsConfigDirection", "1.3.6.1.2.1.10.49.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApsConfigExtraTrafficEnt extends MIBEntry<APSMIBDef>
                        {
                            private ApsConfigExtraTrafficEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                            {
                                super(mib, parent, "apsConfigExtraTraffic", "1.3.6.1.2.1.10.49.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApsConfigSdBerThresholdEnt extends MIBEntry<APSMIBDef>
                        {
                            private ApsConfigSdBerThresholdEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                            {
                                super(mib, parent, "apsConfigSdBerThreshold", "1.3.6.1.2.1.10.49.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApsConfigSfBerThresholdEnt extends MIBEntry<APSMIBDef>
                        {
                            private ApsConfigSfBerThresholdEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                            {
                                super(mib, parent, "apsConfigSfBerThreshold", "1.3.6.1.2.1.10.49.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApsConfigWaitToRestoreEnt extends MIBEntry<APSMIBDef>
                        {
                            private ApsConfigWaitToRestoreEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                            {
                                super(mib, parent, "apsConfigWaitToRestore", "1.3.6.1.2.1.10.49.1.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApsConfigCreationTimeEnt extends MIBEntry<APSMIBDef>
                        {
                            private ApsConfigCreationTimeEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                            {
                                super(mib, parent, "apsConfigCreationTime", "1.3.6.1.2.1.10.49.1.1.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApsConfigStorageTypeEnt extends MIBEntry<APSMIBDef>
                        {
                            private ApsConfigStorageTypeEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                            {
                                super(mib, parent, "apsConfigStorageType", "1.3.6.1.2.1.10.49.1.1.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class ApsStatusTableEnt extends MIBEntry<APSMIBDef>
            {
                public final ApsStatusEntryEnt apsStatusEntry;

                private ApsStatusTableEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                {
                    super(mib, parent, "apsStatusTable", "1.3.6.1.2.1.10.49.1.2", false, true, false, false);
                    this.apsStatusEntry = new ApsStatusEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apsStatusEntry
                    };
                }
                public static final class ApsStatusEntryEnt extends MIBEntry<APSMIBDef>
                {
                    public final ApsStatusK1K2RcvEnt apsStatusK1K2Rcv;

                    public final ApsStatusK1K2TransEnt apsStatusK1K2Trans;

                    public final ApsStatusCurrentEnt apsStatusCurrent;

                    public final ApsStatusModeMismatchesEnt apsStatusModeMismatches;

                    public final ApsStatusChannelMismatchesEnt apsStatusChannelMismatches;

                    public final ApsStatusPSBFsEnt apsStatusPSBFs;

                    public final ApsStatusFEPLFsEnt apsStatusFEPLFs;

                    public final ApsStatusSwitchedChannelEnt apsStatusSwitchedChannel;

                    public final ApsStatusDiscontinuityTimeEnt apsStatusDiscontinuityTime;

                    private ApsStatusEntryEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsStatusEntry", "1.3.6.1.2.1.10.49.1.2.1", false, false, false, true);
                        this.apsStatusK1K2Rcv = new ApsStatusK1K2RcvEnt(mib, this);
                        this.apsStatusK1K2Trans = new ApsStatusK1K2TransEnt(mib, this);
                        this.apsStatusCurrent = new ApsStatusCurrentEnt(mib, this);
                        this.apsStatusModeMismatches = new ApsStatusModeMismatchesEnt(mib, this);
                        this.apsStatusChannelMismatches = new ApsStatusChannelMismatchesEnt(mib, this);
                        this.apsStatusPSBFs = new ApsStatusPSBFsEnt(mib, this);
                        this.apsStatusFEPLFs = new ApsStatusFEPLFsEnt(mib, this);
                        this.apsStatusSwitchedChannel = new ApsStatusSwitchedChannelEnt(mib, this);
                        this.apsStatusDiscontinuityTime = new ApsStatusDiscontinuityTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.apsStatusK1K2Rcv,
                            this.apsStatusK1K2Trans,
                            this.apsStatusCurrent,
                            this.apsStatusModeMismatches,
                            this.apsStatusChannelMismatches,
                            this.apsStatusPSBFs,
                            this.apsStatusFEPLFs,
                            this.apsStatusSwitchedChannel,
                            this.apsStatusDiscontinuityTime
                        };
                    }
                    public static final class ApsStatusK1K2RcvEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsStatusK1K2RcvEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsStatusK1K2Rcv", "1.3.6.1.2.1.10.49.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsStatusK1K2TransEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsStatusK1K2TransEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsStatusK1K2Trans", "1.3.6.1.2.1.10.49.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsStatusCurrentEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsStatusCurrentEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsStatusCurrent", "1.3.6.1.2.1.10.49.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsStatusModeMismatchesEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsStatusModeMismatchesEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsStatusModeMismatches", "1.3.6.1.2.1.10.49.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsStatusChannelMismatchesEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsStatusChannelMismatchesEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsStatusChannelMismatches", "1.3.6.1.2.1.10.49.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsStatusPSBFsEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsStatusPSBFsEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsStatusPSBFs", "1.3.6.1.2.1.10.49.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsStatusFEPLFsEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsStatusFEPLFsEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsStatusFEPLFs", "1.3.6.1.2.1.10.49.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsStatusSwitchedChannelEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsStatusSwitchedChannelEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsStatusSwitchedChannel", "1.3.6.1.2.1.10.49.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsStatusDiscontinuityTimeEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsStatusDiscontinuityTimeEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsStatusDiscontinuityTime", "1.3.6.1.2.1.10.49.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ApsMapEnt extends MIBEntry<APSMIBDef>
            {
                public final ApsChanLTEsEnt apsChanLTEs;

                public final ApsMapTableEnt apsMapTable;

                private ApsMapEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                {
                    super(mib, parent, "apsMap", "1.3.6.1.2.1.10.49.1.3", false, false, false, false);
                    this.apsChanLTEs = new ApsChanLTEsEnt(mib, this);
                    this.apsMapTable = new ApsMapTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apsChanLTEs,
                        this.apsMapTable
                    };
                }
                public static final class ApsChanLTEsEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsChanLTEsEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsChanLTEs", "1.3.6.1.2.1.10.49.1.3.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApsMapTableEnt extends MIBEntry<APSMIBDef>
                {
                    public final ApsMapEntryEnt apsMapEntry;

                    private ApsMapTableEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsMapTable", "1.3.6.1.2.1.10.49.1.3.2", false, true, false, false);
                        this.apsMapEntry = new ApsMapEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.apsMapEntry
                        };
                    }
                    public static final class ApsMapEntryEnt extends MIBEntry<APSMIBDef>
                    {
                        public final ApsMapGroupNameEnt apsMapGroupName;

                        public final ApsMapChanNumberEnt apsMapChanNumber;

                        private ApsMapEntryEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsMapEntry", "1.3.6.1.2.1.10.49.1.3.2.1", false, false, false, true);
                            this.apsMapGroupName = new ApsMapGroupNameEnt(mib, this);
                            this.apsMapChanNumber = new ApsMapChanNumberEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.apsMapGroupName,
                                this.apsMapChanNumber
                            };
                        }
                        public static final class ApsMapGroupNameEnt extends MIBEntry<APSMIBDef>
                        {
                            private ApsMapGroupNameEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                            {
                                super(mib, parent, "apsMapGroupName", "1.3.6.1.2.1.10.49.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApsMapChanNumberEnt extends MIBEntry<APSMIBDef>
                        {
                            private ApsMapChanNumberEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                            {
                                super(mib, parent, "apsMapChanNumber", "1.3.6.1.2.1.10.49.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class ApsChanConfigTableEnt extends MIBEntry<APSMIBDef>
            {
                public final ApsChanConfigEntryEnt apsChanConfigEntry;

                private ApsChanConfigTableEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                {
                    super(mib, parent, "apsChanConfigTable", "1.3.6.1.2.1.10.49.1.4", false, true, false, false);
                    this.apsChanConfigEntry = new ApsChanConfigEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apsChanConfigEntry
                    };
                }
                public static final class ApsChanConfigEntryEnt extends MIBEntry<APSMIBDef>
                {
                    public final ApsChanConfigGroupNameEnt apsChanConfigGroupName;

                    public final ApsChanConfigNumberEnt apsChanConfigNumber;

                    public final ApsChanConfigRowStatusEnt apsChanConfigRowStatus;

                    public final ApsChanConfigIfIndexEnt apsChanConfigIfIndex;

                    public final ApsChanConfigPriorityEnt apsChanConfigPriority;

                    public final ApsChanConfigStorageTypeEnt apsChanConfigStorageType;

                    private ApsChanConfigEntryEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsChanConfigEntry", "1.3.6.1.2.1.10.49.1.4.1", false, false, false, true);
                        this.apsChanConfigGroupName = new ApsChanConfigGroupNameEnt(mib, this);
                        this.apsChanConfigNumber = new ApsChanConfigNumberEnt(mib, this);
                        this.apsChanConfigRowStatus = new ApsChanConfigRowStatusEnt(mib, this);
                        this.apsChanConfigIfIndex = new ApsChanConfigIfIndexEnt(mib, this);
                        this.apsChanConfigPriority = new ApsChanConfigPriorityEnt(mib, this);
                        this.apsChanConfigStorageType = new ApsChanConfigStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.apsChanConfigGroupName,
                            this.apsChanConfigNumber,
                            this.apsChanConfigRowStatus,
                            this.apsChanConfigIfIndex,
                            this.apsChanConfigPriority,
                            this.apsChanConfigStorageType
                        };
                    }
                    public static final class ApsChanConfigGroupNameEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsChanConfigGroupNameEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsChanConfigGroupName", "1.3.6.1.2.1.10.49.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsChanConfigNumberEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsChanConfigNumberEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsChanConfigNumber", "1.3.6.1.2.1.10.49.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsChanConfigRowStatusEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsChanConfigRowStatusEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsChanConfigRowStatus", "1.3.6.1.2.1.10.49.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsChanConfigIfIndexEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsChanConfigIfIndexEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsChanConfigIfIndex", "1.3.6.1.2.1.10.49.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsChanConfigPriorityEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsChanConfigPriorityEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsChanConfigPriority", "1.3.6.1.2.1.10.49.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsChanConfigStorageTypeEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsChanConfigStorageTypeEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsChanConfigStorageType", "1.3.6.1.2.1.10.49.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ApsCommandTableEnt extends MIBEntry<APSMIBDef>
            {
                public final ApsCommandEntryEnt apsCommandEntry;

                private ApsCommandTableEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                {
                    super(mib, parent, "apsCommandTable", "1.3.6.1.2.1.10.49.1.5", false, true, false, false);
                    this.apsCommandEntry = new ApsCommandEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apsCommandEntry
                    };
                }
                public static final class ApsCommandEntryEnt extends MIBEntry<APSMIBDef>
                {
                    public final ApsCommandSwitchEnt apsCommandSwitch;

                    public final ApsCommandControlEnt apsCommandControl;

                    private ApsCommandEntryEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsCommandEntry", "1.3.6.1.2.1.10.49.1.5.1", false, false, false, true);
                        this.apsCommandSwitch = new ApsCommandSwitchEnt(mib, this);
                        this.apsCommandControl = new ApsCommandControlEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.apsCommandSwitch,
                            this.apsCommandControl
                        };
                    }
                    public static final class ApsCommandSwitchEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsCommandSwitchEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsCommandSwitch", "1.3.6.1.2.1.10.49.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsCommandControlEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsCommandControlEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsCommandControl", "1.3.6.1.2.1.10.49.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ApsChanStatusTableEnt extends MIBEntry<APSMIBDef>
            {
                public final ApsChanStatusEntryEnt apsChanStatusEntry;

                private ApsChanStatusTableEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                {
                    super(mib, parent, "apsChanStatusTable", "1.3.6.1.2.1.10.49.1.6", false, true, false, false);
                    this.apsChanStatusEntry = new ApsChanStatusEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apsChanStatusEntry
                    };
                }
                public static final class ApsChanStatusEntryEnt extends MIBEntry<APSMIBDef>
                {
                    public final ApsChanStatusCurrentEnt apsChanStatusCurrent;

                    public final ApsChanStatusSignalDegradesEnt apsChanStatusSignalDegrades;

                    public final ApsChanStatusSignalFailuresEnt apsChanStatusSignalFailures;

                    public final ApsChanStatusSwitchoversEnt apsChanStatusSwitchovers;

                    public final ApsChanStatusLastSwitchoverEnt apsChanStatusLastSwitchover;

                    public final ApsChanStatusSwitchoverSecondsEnt apsChanStatusSwitchoverSeconds;

                    public final ApsChanStatusDiscontinuityTimeEnt apsChanStatusDiscontinuityTime;

                    private ApsChanStatusEntryEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsChanStatusEntry", "1.3.6.1.2.1.10.49.1.6.1", false, false, false, true);
                        this.apsChanStatusCurrent = new ApsChanStatusCurrentEnt(mib, this);
                        this.apsChanStatusSignalDegrades = new ApsChanStatusSignalDegradesEnt(mib, this);
                        this.apsChanStatusSignalFailures = new ApsChanStatusSignalFailuresEnt(mib, this);
                        this.apsChanStatusSwitchovers = new ApsChanStatusSwitchoversEnt(mib, this);
                        this.apsChanStatusLastSwitchover = new ApsChanStatusLastSwitchoverEnt(mib, this);
                        this.apsChanStatusSwitchoverSeconds = new ApsChanStatusSwitchoverSecondsEnt(mib, this);
                        this.apsChanStatusDiscontinuityTime = new ApsChanStatusDiscontinuityTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.apsChanStatusCurrent,
                            this.apsChanStatusSignalDegrades,
                            this.apsChanStatusSignalFailures,
                            this.apsChanStatusSwitchovers,
                            this.apsChanStatusLastSwitchover,
                            this.apsChanStatusSwitchoverSeconds,
                            this.apsChanStatusDiscontinuityTime
                        };
                    }
                    public static final class ApsChanStatusCurrentEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsChanStatusCurrentEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsChanStatusCurrent", "1.3.6.1.2.1.10.49.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsChanStatusSignalDegradesEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsChanStatusSignalDegradesEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsChanStatusSignalDegrades", "1.3.6.1.2.1.10.49.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsChanStatusSignalFailuresEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsChanStatusSignalFailuresEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsChanStatusSignalFailures", "1.3.6.1.2.1.10.49.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsChanStatusSwitchoversEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsChanStatusSwitchoversEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsChanStatusSwitchovers", "1.3.6.1.2.1.10.49.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsChanStatusLastSwitchoverEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsChanStatusLastSwitchoverEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsChanStatusLastSwitchover", "1.3.6.1.2.1.10.49.1.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsChanStatusSwitchoverSecondsEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsChanStatusSwitchoverSecondsEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsChanStatusSwitchoverSeconds", "1.3.6.1.2.1.10.49.1.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ApsChanStatusDiscontinuityTimeEnt extends MIBEntry<APSMIBDef>
                    {
                        private ApsChanStatusDiscontinuityTimeEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                        {
                            super(mib, parent, "apsChanStatusDiscontinuityTime", "1.3.6.1.2.1.10.49.1.6.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ApsNotificationEnableEnt extends MIBEntry<APSMIBDef>
            {
                private ApsNotificationEnableEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                {
                    super(mib, parent, "apsNotificationEnable", "1.3.6.1.2.1.10.49.1.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class ApsMIBNotificationsEnt extends MIBEntry<APSMIBDef>
        {
            /** APS EVENTS*/
            public final ApsNotificationsPrefixEnt apsNotificationsPrefix;

            private ApsMIBNotificationsEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
            {
                super(mib, parent, "apsMIBNotifications", "1.3.6.1.2.1.10.49.2", false, false, false, false);
                this.apsNotificationsPrefix = new ApsNotificationsPrefixEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.apsNotificationsPrefix
                };
            }
            public static final class ApsNotificationsPrefixEnt extends MIBEntry<APSMIBDef>
            {
                public final ApsEventSwitchoverEnt apsEventSwitchover;

                public final ApsEventModeMismatchEnt apsEventModeMismatch;

                public final ApsEventChannelMismatchEnt apsEventChannelMismatch;

                public final ApsEventPSBFEnt apsEventPSBF;

                public final ApsEventFEPLFEnt apsEventFEPLF;

                private ApsNotificationsPrefixEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                {
                    super(mib, parent, "apsNotificationsPrefix", "1.3.6.1.2.1.10.49.2.0", false, false, false, false);
                    this.apsEventSwitchover = new ApsEventSwitchoverEnt(mib, this);
                    this.apsEventModeMismatch = new ApsEventModeMismatchEnt(mib, this);
                    this.apsEventChannelMismatch = new ApsEventChannelMismatchEnt(mib, this);
                    this.apsEventPSBF = new ApsEventPSBFEnt(mib, this);
                    this.apsEventFEPLF = new ApsEventFEPLFEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apsEventSwitchover,
                        this.apsEventModeMismatch,
                        this.apsEventChannelMismatch,
                        this.apsEventPSBF,
                        this.apsEventFEPLF
                    };
                }
                public static final class ApsEventSwitchoverEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsEventSwitchoverEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsEventSwitchover", "1.3.6.1.2.1.10.49.2.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApsEventModeMismatchEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsEventModeMismatchEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsEventModeMismatch", "1.3.6.1.2.1.10.49.2.0.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApsEventChannelMismatchEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsEventChannelMismatchEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsEventChannelMismatch", "1.3.6.1.2.1.10.49.2.0.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApsEventPSBFEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsEventPSBFEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsEventPSBF", "1.3.6.1.2.1.10.49.2.0.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApsEventFEPLFEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsEventFEPLFEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsEventFEPLF", "1.3.6.1.2.1.10.49.2.0.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class ApsMIBConformanceEnt extends MIBEntry<APSMIBDef>
        {
            /** conformance information*/
            public final ApsGroupsEnt apsGroups;

            public final ApsCompliancesEnt apsCompliances;

            private ApsMIBConformanceEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
            {
                super(mib, parent, "apsMIBConformance", "1.3.6.1.2.1.10.49.3", false, false, false, false);
                this.apsGroups = new ApsGroupsEnt(mib, this);
                this.apsCompliances = new ApsCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.apsGroups,
                    this.apsCompliances
                };
            }
            public static final class ApsGroupsEnt extends MIBEntry<APSMIBDef>
            {
                /** units of conformance*/
                public final ApsConfigGeneralEnt apsConfigGeneral;

                public final ApsConfigWtrEnt apsConfigWtr;

                /** If set operations are not supported neither of the following twogroups are implemented. If sets are supported only one of thesegroups is implemented for a linear APS group instance.*/
                public final ApsCommandOnePlusOneEnt apsCommandOnePlusOne;

                public final ApsCommandOneToNEnt apsCommandOneToN;

                public final ApsStatusGeneralEnt apsStatusGeneral;

                public final ApsChanGeneralEnt apsChanGeneral;

                public final ApsChanOneToNEnt apsChanOneToN;

                public final ApsTotalsGroupEnt apsTotalsGroup;

                public final ApsMapGroupEnt apsMapGroup;

                public final ApsEventGroupEnt apsEventGroup;

                private ApsGroupsEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                {
                    super(mib, parent, "apsGroups", "1.3.6.1.2.1.10.49.3.1", false, false, false, false);
                    this.apsConfigGeneral = new ApsConfigGeneralEnt(mib, this);
                    this.apsConfigWtr = new ApsConfigWtrEnt(mib, this);
                    this.apsCommandOnePlusOne = new ApsCommandOnePlusOneEnt(mib, this);
                    this.apsCommandOneToN = new ApsCommandOneToNEnt(mib, this);
                    this.apsStatusGeneral = new ApsStatusGeneralEnt(mib, this);
                    this.apsChanGeneral = new ApsChanGeneralEnt(mib, this);
                    this.apsChanOneToN = new ApsChanOneToNEnt(mib, this);
                    this.apsTotalsGroup = new ApsTotalsGroupEnt(mib, this);
                    this.apsMapGroup = new ApsMapGroupEnt(mib, this);
                    this.apsEventGroup = new ApsEventGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apsConfigGeneral,
                        this.apsConfigWtr,
                        this.apsCommandOnePlusOne,
                        this.apsCommandOneToN,
                        this.apsStatusGeneral,
                        this.apsChanGeneral,
                        this.apsChanOneToN,
                        this.apsTotalsGroup,
                        this.apsMapGroup,
                        this.apsEventGroup
                    };
                }
                public static final class ApsConfigGeneralEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsConfigGeneralEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsConfigGeneral", "1.3.6.1.2.1.10.49.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApsConfigWtrEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsConfigWtrEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsConfigWtr", "1.3.6.1.2.1.10.49.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApsCommandOnePlusOneEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsCommandOnePlusOneEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsCommandOnePlusOne", "1.3.6.1.2.1.10.49.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApsCommandOneToNEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsCommandOneToNEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsCommandOneToN", "1.3.6.1.2.1.10.49.3.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApsStatusGeneralEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsStatusGeneralEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsStatusGeneral", "1.3.6.1.2.1.10.49.3.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApsChanGeneralEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsChanGeneralEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsChanGeneral", "1.3.6.1.2.1.10.49.3.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApsChanOneToNEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsChanOneToNEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsChanOneToN", "1.3.6.1.2.1.10.49.3.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApsTotalsGroupEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsTotalsGroupEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsTotalsGroup", "1.3.6.1.2.1.10.49.3.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApsMapGroupEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsMapGroupEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsMapGroup", "1.3.6.1.2.1.10.49.3.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApsEventGroupEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsEventGroupEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsEventGroup", "1.3.6.1.2.1.10.49.3.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class ApsCompliancesEnt extends MIBEntry<APSMIBDef>
            {
                public final ApsFullComplianceEnt apsFullCompliance;

                /** Read-Only Compliance*/
                public final ApsReadOnlyComplianceEnt apsReadOnlyCompliance;

                private ApsCompliancesEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                {
                    super(mib, parent, "apsCompliances", "1.3.6.1.2.1.10.49.3.2", false, false, false, false);
                    this.apsFullCompliance = new ApsFullComplianceEnt(mib, this);
                    this.apsReadOnlyCompliance = new ApsReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.apsFullCompliance,
                        this.apsReadOnlyCompliance
                    };
                }
                public static final class ApsFullComplianceEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsFullComplianceEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsFullCompliance", "1.3.6.1.2.1.10.49.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApsReadOnlyComplianceEnt extends MIBEntry<APSMIBDef>
                {
                    private ApsReadOnlyComplianceEnt(APSMIBDef mib, MIBEntry<APSMIBDef> parent)
                    {
                        super(mib, parent, "apsReadOnlyCompliance", "1.3.6.1.2.1.10.49.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
