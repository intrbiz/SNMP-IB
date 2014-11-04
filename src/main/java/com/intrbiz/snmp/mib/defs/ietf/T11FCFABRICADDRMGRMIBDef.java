package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**the Fibre Channel Fabric Address Manager MIB

for management of the functionality, in Fibre Channel switches,
which is used to manage fabric configuration, domains, and
addresses within a domain.

[RFC2578]
[RFC2580]
[RFC2579]
[IF-MIB]
[FC-MGMT]*/
public final class T11FCFABRICADDRMGRMIBDef extends MIB
{
    public static final T11FCFABRICADDRMGRMIBDef T11FCFABRICADDRMGRMIB = new T11FCFABRICADDRMGRMIBDef();

    static { MIBs.getInstance().registerMIB(T11FCFABRICADDRMGRMIBDef.T11FCFABRICADDRMGRMIB); }

    public final T11FcFabricAddrMgrMIBEnt t11FcFabricAddrMgrMIB;

    private T11FCFABRICADDRMGRMIBDef()
    {
        super("T11-FC-FABRIC-ADDR-MGR-MIB");
        this.t11FcFabricAddrMgrMIB = new T11FcFabricAddrMgrMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.t11FcFabricAddrMgrMIB
        };
    }

    public static final class T11FcFabricAddrMgrMIBEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
    {
        public final T11FamNotificationsEnt t11FamNotifications;

        public final T11FamMIBObjectsEnt t11FamMIBObjects;

        public final T11FamMIBConformanceEnt t11FamMIBConformance;

        private T11FcFabricAddrMgrMIBEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
        {
            super(mib, parent, "t11FcFabricAddrMgrMIB", "1.3.6.1.2.1.137", false, false, false, false);
            this.t11FamNotifications = new T11FamNotificationsEnt(mib, this);
            this.t11FamMIBObjects = new T11FamMIBObjectsEnt(mib, this);
            this.t11FamMIBConformance = new T11FamMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.t11FamNotifications,
                this.t11FamMIBObjects,
                this.t11FamMIBConformance
            };
        }
        public static final class T11FamNotificationsEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
        {
            /** Notifications*/
            public final T11FamDomainIdNotAssignedNotifyEnt t11FamDomainIdNotAssignedNotify;

            public final T11FamNewPrincipalSwitchNotifyEnt t11FamNewPrincipalSwitchNotify;

            public final T11FamFabricChangeNotifyEnt t11FamFabricChangeNotify;

            private T11FamNotificationsEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
            {
                super(mib, parent, "t11FamNotifications", "1.3.6.1.2.1.137.0", false, false, false, false);
                this.t11FamDomainIdNotAssignedNotify = new T11FamDomainIdNotAssignedNotifyEnt(mib, this);
                this.t11FamNewPrincipalSwitchNotify = new T11FamNewPrincipalSwitchNotifyEnt(mib, this);
                this.t11FamFabricChangeNotify = new T11FamFabricChangeNotifyEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11FamDomainIdNotAssignedNotify,
                    this.t11FamNewPrincipalSwitchNotify,
                    this.t11FamFabricChangeNotify
                };
            }
            public static final class T11FamDomainIdNotAssignedNotifyEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
            {
                private T11FamDomainIdNotAssignedNotifyEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                {
                    super(mib, parent, "t11FamDomainIdNotAssignedNotify", "1.3.6.1.2.1.137.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class T11FamNewPrincipalSwitchNotifyEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
            {
                private T11FamNewPrincipalSwitchNotifyEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                {
                    super(mib, parent, "t11FamNewPrincipalSwitchNotify", "1.3.6.1.2.1.137.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class T11FamFabricChangeNotifyEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
            {
                private T11FamFabricChangeNotifyEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                {
                    super(mib, parent, "t11FamFabricChangeNotify", "1.3.6.1.2.1.137.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class T11FamMIBObjectsEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
        {
            public final T11FamConfigurationEnt t11FamConfiguration;

            public final T11FamInfoEnt t11FamInfo;

            public final T11FamNotifyControlEnt t11FamNotifyControl;

            private T11FamMIBObjectsEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
            {
                super(mib, parent, "t11FamMIBObjects", "1.3.6.1.2.1.137.1", false, false, false, false);
                this.t11FamConfiguration = new T11FamConfigurationEnt(mib, this);
                this.t11FamInfo = new T11FamInfoEnt(mib, this);
                this.t11FamNotifyControl = new T11FamNotifyControlEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11FamConfiguration,
                    this.t11FamInfo,
                    this.t11FamNotifyControl
                };
            }
            public static final class T11FamConfigurationEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
            {
                /** t11FamTable*/
                public final T11FamTableEnt t11FamTable;

                /** t11FamIfTable - Interface configuration*/
                public final T11FamIfTableEnt t11FamIfTable;

                private T11FamConfigurationEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                {
                    super(mib, parent, "t11FamConfiguration", "1.3.6.1.2.1.137.1.1", false, false, false, false);
                    this.t11FamTable = new T11FamTableEnt(mib, this);
                    this.t11FamIfTable = new T11FamIfTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FamTable,
                        this.t11FamIfTable
                    };
                }
                public static final class T11FamTableEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                {
                    public final T11FamEntryEnt t11FamEntry;

                    private T11FamTableEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                    {
                        super(mib, parent, "t11FamTable", "1.3.6.1.2.1.137.1.1.1", false, true, false, false);
                        this.t11FamEntry = new T11FamEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FamEntry
                        };
                    }
                    public static final class T11FamEntryEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                    {
                        public final T11FamFabricIndexEnt t11FamFabricIndex;

                        public final T11FamConfigDomainIdEnt t11FamConfigDomainId;

                        public final T11FamConfigDomainIdTypeEnt t11FamConfigDomainIdType;

                        public final T11FamAutoReconfigureEnt t11FamAutoReconfigure;

                        public final T11FamContiguousAllocationEnt t11FamContiguousAllocation;

                        public final T11FamPriorityEnt t11FamPriority;

                        public final T11FamPrincipalSwitchWwnEnt t11FamPrincipalSwitchWwn;

                        public final T11FamLocalSwitchWwnEnt t11FamLocalSwitchWwn;

                        public final T11FamAssignedAreaIdListEnt t11FamAssignedAreaIdList;

                        public final T11FamGrantedFcIdsEnt t11FamGrantedFcIds;

                        public final T11FamRecoveredFcIdsEnt t11FamRecoveredFcIds;

                        public final T11FamFreeFcIdsEnt t11FamFreeFcIds;

                        public final T11FamAssignedFcIdsEnt t11FamAssignedFcIds;

                        public final T11FamAvailableFcIdsEnt t11FamAvailableFcIds;

                        public final T11FamRunningPriorityEnt t11FamRunningPriority;

                        public final T11FamPrincSwRunningPriorityEnt t11FamPrincSwRunningPriority;

                        public final T11FamStateEnt t11FamState;

                        public final T11FamLocalPrincipalSwitchSlctnsEnt t11FamLocalPrincipalSwitchSlctns;

                        public final T11FamPrincipalSwitchSelectionsEnt t11FamPrincipalSwitchSelections;

                        public final T11FamBuildFabricsEnt t11FamBuildFabrics;

                        public final T11FamFabricReconfiguresEnt t11FamFabricReconfigures;

                        public final T11FamDomainIdEnt t11FamDomainId;

                        public final T11FamStickyEnt t11FamSticky;

                        public final T11FamRestartEnt t11FamRestart;

                        public final T11FamRcFabricNotifyEnableEnt t11FamRcFabricNotifyEnable;

                        public final T11FamEnableEnt t11FamEnable;

                        public final T11FamFabricNameEnt t11FamFabricName;

                        private T11FamEntryEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                        {
                            super(mib, parent, "t11FamEntry", "1.3.6.1.2.1.137.1.1.1.1", false, false, false, true);
                            this.t11FamFabricIndex = new T11FamFabricIndexEnt(mib, this);
                            this.t11FamConfigDomainId = new T11FamConfigDomainIdEnt(mib, this);
                            this.t11FamConfigDomainIdType = new T11FamConfigDomainIdTypeEnt(mib, this);
                            this.t11FamAutoReconfigure = new T11FamAutoReconfigureEnt(mib, this);
                            this.t11FamContiguousAllocation = new T11FamContiguousAllocationEnt(mib, this);
                            this.t11FamPriority = new T11FamPriorityEnt(mib, this);
                            this.t11FamPrincipalSwitchWwn = new T11FamPrincipalSwitchWwnEnt(mib, this);
                            this.t11FamLocalSwitchWwn = new T11FamLocalSwitchWwnEnt(mib, this);
                            this.t11FamAssignedAreaIdList = new T11FamAssignedAreaIdListEnt(mib, this);
                            this.t11FamGrantedFcIds = new T11FamGrantedFcIdsEnt(mib, this);
                            this.t11FamRecoveredFcIds = new T11FamRecoveredFcIdsEnt(mib, this);
                            this.t11FamFreeFcIds = new T11FamFreeFcIdsEnt(mib, this);
                            this.t11FamAssignedFcIds = new T11FamAssignedFcIdsEnt(mib, this);
                            this.t11FamAvailableFcIds = new T11FamAvailableFcIdsEnt(mib, this);
                            this.t11FamRunningPriority = new T11FamRunningPriorityEnt(mib, this);
                            this.t11FamPrincSwRunningPriority = new T11FamPrincSwRunningPriorityEnt(mib, this);
                            this.t11FamState = new T11FamStateEnt(mib, this);
                            this.t11FamLocalPrincipalSwitchSlctns = new T11FamLocalPrincipalSwitchSlctnsEnt(mib, this);
                            this.t11FamPrincipalSwitchSelections = new T11FamPrincipalSwitchSelectionsEnt(mib, this);
                            this.t11FamBuildFabrics = new T11FamBuildFabricsEnt(mib, this);
                            this.t11FamFabricReconfigures = new T11FamFabricReconfiguresEnt(mib, this);
                            this.t11FamDomainId = new T11FamDomainIdEnt(mib, this);
                            this.t11FamSticky = new T11FamStickyEnt(mib, this);
                            this.t11FamRestart = new T11FamRestartEnt(mib, this);
                            this.t11FamRcFabricNotifyEnable = new T11FamRcFabricNotifyEnableEnt(mib, this);
                            this.t11FamEnable = new T11FamEnableEnt(mib, this);
                            this.t11FamFabricName = new T11FamFabricNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FamFabricIndex,
                                this.t11FamConfigDomainId,
                                this.t11FamConfigDomainIdType,
                                this.t11FamAutoReconfigure,
                                this.t11FamContiguousAllocation,
                                this.t11FamPriority,
                                this.t11FamPrincipalSwitchWwn,
                                this.t11FamLocalSwitchWwn,
                                this.t11FamAssignedAreaIdList,
                                this.t11FamGrantedFcIds,
                                this.t11FamRecoveredFcIds,
                                this.t11FamFreeFcIds,
                                this.t11FamAssignedFcIds,
                                this.t11FamAvailableFcIds,
                                this.t11FamRunningPriority,
                                this.t11FamPrincSwRunningPriority,
                                this.t11FamState,
                                this.t11FamLocalPrincipalSwitchSlctns,
                                this.t11FamPrincipalSwitchSelections,
                                this.t11FamBuildFabrics,
                                this.t11FamFabricReconfigures,
                                this.t11FamDomainId,
                                this.t11FamSticky,
                                this.t11FamRestart,
                                this.t11FamRcFabricNotifyEnable,
                                this.t11FamEnable,
                                this.t11FamFabricName
                            };
                        }
                        public static final class T11FamFabricIndexEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamFabricIndexEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamFabricIndex", "1.3.6.1.2.1.137.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamConfigDomainIdEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamConfigDomainIdEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamConfigDomainId", "1.3.6.1.2.1.137.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamConfigDomainIdTypeEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamConfigDomainIdTypeEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamConfigDomainIdType", "1.3.6.1.2.1.137.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamAutoReconfigureEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamAutoReconfigureEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamAutoReconfigure", "1.3.6.1.2.1.137.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamContiguousAllocationEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamContiguousAllocationEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamContiguousAllocation", "1.3.6.1.2.1.137.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamPriorityEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamPriorityEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamPriority", "1.3.6.1.2.1.137.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamPrincipalSwitchWwnEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamPrincipalSwitchWwnEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamPrincipalSwitchWwn", "1.3.6.1.2.1.137.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamLocalSwitchWwnEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamLocalSwitchWwnEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamLocalSwitchWwn", "1.3.6.1.2.1.137.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamAssignedAreaIdListEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamAssignedAreaIdListEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamAssignedAreaIdList", "1.3.6.1.2.1.137.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamGrantedFcIdsEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamGrantedFcIdsEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamGrantedFcIds", "1.3.6.1.2.1.137.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamRecoveredFcIdsEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamRecoveredFcIdsEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamRecoveredFcIds", "1.3.6.1.2.1.137.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamFreeFcIdsEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamFreeFcIdsEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamFreeFcIds", "1.3.6.1.2.1.137.1.1.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamAssignedFcIdsEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamAssignedFcIdsEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamAssignedFcIds", "1.3.6.1.2.1.137.1.1.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamAvailableFcIdsEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamAvailableFcIdsEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamAvailableFcIds", "1.3.6.1.2.1.137.1.1.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamRunningPriorityEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamRunningPriorityEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamRunningPriority", "1.3.6.1.2.1.137.1.1.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamPrincSwRunningPriorityEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamPrincSwRunningPriorityEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamPrincSwRunningPriority", "1.3.6.1.2.1.137.1.1.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamStateEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamStateEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamState", "1.3.6.1.2.1.137.1.1.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamLocalPrincipalSwitchSlctnsEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamLocalPrincipalSwitchSlctnsEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamLocalPrincipalSwitchSlctns", "1.3.6.1.2.1.137.1.1.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamPrincipalSwitchSelectionsEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamPrincipalSwitchSelectionsEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamPrincipalSwitchSelections", "1.3.6.1.2.1.137.1.1.1.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamBuildFabricsEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamBuildFabricsEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamBuildFabrics", "1.3.6.1.2.1.137.1.1.1.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamFabricReconfiguresEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamFabricReconfiguresEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamFabricReconfigures", "1.3.6.1.2.1.137.1.1.1.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamDomainIdEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamDomainIdEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamDomainId", "1.3.6.1.2.1.137.1.1.1.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamStickyEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamStickyEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamSticky", "1.3.6.1.2.1.137.1.1.1.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamRestartEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamRestartEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamRestart", "1.3.6.1.2.1.137.1.1.1.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamRcFabricNotifyEnableEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamRcFabricNotifyEnableEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamRcFabricNotifyEnable", "1.3.6.1.2.1.137.1.1.1.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamEnableEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamEnableEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamEnable", "1.3.6.1.2.1.137.1.1.1.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamFabricNameEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamFabricNameEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamFabricName", "1.3.6.1.2.1.137.1.1.1.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11FamIfTableEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                {
                    public final T11FamIfEntryEnt t11FamIfEntry;

                    private T11FamIfTableEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                    {
                        super(mib, parent, "t11FamIfTable", "1.3.6.1.2.1.137.1.1.2", false, true, false, false);
                        this.t11FamIfEntry = new T11FamIfEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FamIfEntry
                        };
                    }
                    public static final class T11FamIfEntryEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                    {
                        public final T11FamIfRcfRejectEnt t11FamIfRcfReject;

                        public final T11FamIfRoleEnt t11FamIfRole;

                        public final T11FamIfRowStatusEnt t11FamIfRowStatus;

                        private T11FamIfEntryEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                        {
                            super(mib, parent, "t11FamIfEntry", "1.3.6.1.2.1.137.1.1.2.1", false, false, false, true);
                            this.t11FamIfRcfReject = new T11FamIfRcfRejectEnt(mib, this);
                            this.t11FamIfRole = new T11FamIfRoleEnt(mib, this);
                            this.t11FamIfRowStatus = new T11FamIfRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FamIfRcfReject,
                                this.t11FamIfRole,
                                this.t11FamIfRowStatus
                            };
                        }
                        public static final class T11FamIfRcfRejectEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamIfRcfRejectEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamIfRcfReject", "1.3.6.1.2.1.137.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamIfRoleEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamIfRoleEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamIfRole", "1.3.6.1.2.1.137.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamIfRowStatusEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamIfRowStatusEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamIfRowStatus", "1.3.6.1.2.1.137.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class T11FamInfoEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
            {
                /** t11FamAreaTable*/
                public final T11FamAreaTableEnt t11FamAreaTable;

                /** t11FamDatabaseTable*/
                public final T11FamDatabaseTableEnt t11FamDatabaseTable;

                /** Fibre Channel Address Identifier cache informationThe cached information allows the Fabric Address Manager toimplement the concept of a Preferred Domain_ID, whereby after a portreleases a Fibre Channel Address Identifier value, a switch makes anattempt to re-assign the same Fibre Channel Address Identifier valueon the next occasion when that port requests an assignment.*/
                public final T11FamMaxFcIdCacheSizeEnt t11FamMaxFcIdCacheSize;

                /** t11FamFcIdCacheTable*/
                public final T11FamFcIdCacheTableEnt t11FamFcIdCacheTable;

                private T11FamInfoEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                {
                    super(mib, parent, "t11FamInfo", "1.3.6.1.2.1.137.1.2", false, false, false, false);
                    this.t11FamAreaTable = new T11FamAreaTableEnt(mib, this);
                    this.t11FamDatabaseTable = new T11FamDatabaseTableEnt(mib, this);
                    this.t11FamMaxFcIdCacheSize = new T11FamMaxFcIdCacheSizeEnt(mib, this);
                    this.t11FamFcIdCacheTable = new T11FamFcIdCacheTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FamAreaTable,
                        this.t11FamDatabaseTable,
                        this.t11FamMaxFcIdCacheSize,
                        this.t11FamFcIdCacheTable
                    };
                }
                public static final class T11FamAreaTableEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                {
                    public final T11FamAreaEntryEnt t11FamAreaEntry;

                    private T11FamAreaTableEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                    {
                        super(mib, parent, "t11FamAreaTable", "1.3.6.1.2.1.137.1.2.1", false, true, false, false);
                        this.t11FamAreaEntry = new T11FamAreaEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FamAreaEntry
                        };
                    }
                    public static final class T11FamAreaEntryEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                    {
                        public final T11FamAreaAreaIdEnt t11FamAreaAreaId;

                        public final T11FamAreaAssignedPortIdListEnt t11FamAreaAssignedPortIdList;

                        private T11FamAreaEntryEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                        {
                            super(mib, parent, "t11FamAreaEntry", "1.3.6.1.2.1.137.1.2.1.1", false, false, false, true);
                            this.t11FamAreaAreaId = new T11FamAreaAreaIdEnt(mib, this);
                            this.t11FamAreaAssignedPortIdList = new T11FamAreaAssignedPortIdListEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FamAreaAreaId,
                                this.t11FamAreaAssignedPortIdList
                            };
                        }
                        public static final class T11FamAreaAreaIdEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamAreaAreaIdEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamAreaAreaId", "1.3.6.1.2.1.137.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamAreaAssignedPortIdListEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamAreaAssignedPortIdListEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamAreaAssignedPortIdList", "1.3.6.1.2.1.137.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11FamDatabaseTableEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                {
                    public final T11FamDatabaseEntryEnt t11FamDatabaseEntry;

                    private T11FamDatabaseTableEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                    {
                        super(mib, parent, "t11FamDatabaseTable", "1.3.6.1.2.1.137.1.2.2", false, true, false, false);
                        this.t11FamDatabaseEntry = new T11FamDatabaseEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FamDatabaseEntry
                        };
                    }
                    public static final class T11FamDatabaseEntryEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                    {
                        public final T11FamDatabaseDomainIdEnt t11FamDatabaseDomainId;

                        public final T11FamDatabaseSwitchWwnEnt t11FamDatabaseSwitchWwn;

                        private T11FamDatabaseEntryEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                        {
                            super(mib, parent, "t11FamDatabaseEntry", "1.3.6.1.2.1.137.1.2.2.1", false, false, false, true);
                            this.t11FamDatabaseDomainId = new T11FamDatabaseDomainIdEnt(mib, this);
                            this.t11FamDatabaseSwitchWwn = new T11FamDatabaseSwitchWwnEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FamDatabaseDomainId,
                                this.t11FamDatabaseSwitchWwn
                            };
                        }
                        public static final class T11FamDatabaseDomainIdEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamDatabaseDomainIdEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamDatabaseDomainId", "1.3.6.1.2.1.137.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamDatabaseSwitchWwnEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamDatabaseSwitchWwnEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamDatabaseSwitchWwn", "1.3.6.1.2.1.137.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11FamMaxFcIdCacheSizeEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                {
                    private T11FamMaxFcIdCacheSizeEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                    {
                        super(mib, parent, "t11FamMaxFcIdCacheSize", "1.3.6.1.2.1.137.1.2.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FamFcIdCacheTableEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                {
                    public final T11FamFcIdCacheEntryEnt t11FamFcIdCacheEntry;

                    private T11FamFcIdCacheTableEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                    {
                        super(mib, parent, "t11FamFcIdCacheTable", "1.3.6.1.2.1.137.1.2.4", false, true, false, false);
                        this.t11FamFcIdCacheEntry = new T11FamFcIdCacheEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FamFcIdCacheEntry
                        };
                    }
                    public static final class T11FamFcIdCacheEntryEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                    {
                        public final T11FamFcIdCacheWwnEnt t11FamFcIdCacheWwn;

                        public final T11FamFcIdCacheAreaIdPortIdEnt t11FamFcIdCacheAreaIdPortId;

                        public final T11FamFcIdCachePortIdsEnt t11FamFcIdCachePortIds;

                        private T11FamFcIdCacheEntryEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                        {
                            super(mib, parent, "t11FamFcIdCacheEntry", "1.3.6.1.2.1.137.1.2.4.1", false, false, false, true);
                            this.t11FamFcIdCacheWwn = new T11FamFcIdCacheWwnEnt(mib, this);
                            this.t11FamFcIdCacheAreaIdPortId = new T11FamFcIdCacheAreaIdPortIdEnt(mib, this);
                            this.t11FamFcIdCachePortIds = new T11FamFcIdCachePortIdsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FamFcIdCacheWwn,
                                this.t11FamFcIdCacheAreaIdPortId,
                                this.t11FamFcIdCachePortIds
                            };
                        }
                        public static final class T11FamFcIdCacheWwnEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamFcIdCacheWwnEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamFcIdCacheWwn", "1.3.6.1.2.1.137.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamFcIdCacheAreaIdPortIdEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamFcIdCacheAreaIdPortIdEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamFcIdCacheAreaIdPortId", "1.3.6.1.2.1.137.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FamFcIdCachePortIdsEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                        {
                            private T11FamFcIdCachePortIdsEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                            {
                                super(mib, parent, "t11FamFcIdCachePortIds", "1.3.6.1.2.1.137.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class T11FamNotifyControlEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
            {
                /** Objects for use in notifications*/
                public final T11FamNotifyFabricIndexEnt t11FamNotifyFabricIndex;

                private T11FamNotifyControlEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                {
                    super(mib, parent, "t11FamNotifyControl", "1.3.6.1.2.1.137.1.3", false, false, false, false);
                    this.t11FamNotifyFabricIndex = new T11FamNotifyFabricIndexEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FamNotifyFabricIndex
                    };
                }
                public static final class T11FamNotifyFabricIndexEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                {
                    private T11FamNotifyFabricIndexEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                    {
                        super(mib, parent, "t11FamNotifyFabricIndex", "1.3.6.1.2.1.137.1.3.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class T11FamMIBConformanceEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
        {
            /** Conformance*/
            public final T11FamMIBCompliancesEnt t11FamMIBCompliances;

            public final T11FamMIBGroupsEnt t11FamMIBGroups;

            private T11FamMIBConformanceEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
            {
                super(mib, parent, "t11FamMIBConformance", "1.3.6.1.2.1.137.2", false, false, false, false);
                this.t11FamMIBCompliances = new T11FamMIBCompliancesEnt(mib, this);
                this.t11FamMIBGroups = new T11FamMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11FamMIBCompliances,
                    this.t11FamMIBGroups
                };
            }
            public static final class T11FamMIBCompliancesEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
            {
                public final T11FamMIBComplianceEnt t11FamMIBCompliance;

                private T11FamMIBCompliancesEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                {
                    super(mib, parent, "t11FamMIBCompliances", "1.3.6.1.2.1.137.2.1", false, false, false, false);
                    this.t11FamMIBCompliance = new T11FamMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FamMIBCompliance
                    };
                }
                public static final class T11FamMIBComplianceEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                {
                    private T11FamMIBComplianceEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                    {
                        super(mib, parent, "t11FamMIBCompliance", "1.3.6.1.2.1.137.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class T11FamMIBGroupsEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
            {
                /** Units of Conformance*/
                public final T11FamGroupEnt t11FamGroup;

                public final T11FamCommandGroupEnt t11FamCommandGroup;

                public final T11FamDatabaseGroupEnt t11FamDatabaseGroup;

                public final T11FamAreaGroupEnt t11FamAreaGroup;

                public final T11FamCacheGroupEnt t11FamCacheGroup;

                public final T11FamNotificationGroupEnt t11FamNotificationGroup;

                private T11FamMIBGroupsEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                {
                    super(mib, parent, "t11FamMIBGroups", "1.3.6.1.2.1.137.2.2", false, false, false, false);
                    this.t11FamGroup = new T11FamGroupEnt(mib, this);
                    this.t11FamCommandGroup = new T11FamCommandGroupEnt(mib, this);
                    this.t11FamDatabaseGroup = new T11FamDatabaseGroupEnt(mib, this);
                    this.t11FamAreaGroup = new T11FamAreaGroupEnt(mib, this);
                    this.t11FamCacheGroup = new T11FamCacheGroupEnt(mib, this);
                    this.t11FamNotificationGroup = new T11FamNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FamGroup,
                        this.t11FamCommandGroup,
                        this.t11FamDatabaseGroup,
                        this.t11FamAreaGroup,
                        this.t11FamCacheGroup,
                        this.t11FamNotificationGroup
                    };
                }
                public static final class T11FamGroupEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                {
                    private T11FamGroupEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                    {
                        super(mib, parent, "t11FamGroup", "1.3.6.1.2.1.137.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FamCommandGroupEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                {
                    private T11FamCommandGroupEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                    {
                        super(mib, parent, "t11FamCommandGroup", "1.3.6.1.2.1.137.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FamDatabaseGroupEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                {
                    private T11FamDatabaseGroupEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                    {
                        super(mib, parent, "t11FamDatabaseGroup", "1.3.6.1.2.1.137.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FamAreaGroupEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                {
                    private T11FamAreaGroupEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                    {
                        super(mib, parent, "t11FamAreaGroup", "1.3.6.1.2.1.137.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FamCacheGroupEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                {
                    private T11FamCacheGroupEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                    {
                        super(mib, parent, "t11FamCacheGroup", "1.3.6.1.2.1.137.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FamNotificationGroupEnt extends MIBEntry<T11FCFABRICADDRMGRMIBDef>
                {
                    private T11FamNotificationGroupEnt(T11FCFABRICADDRMGRMIBDef mib, MIBEntry<T11FCFABRICADDRMGRMIBDef> parent)
                    {
                        super(mib, parent, "t11FamNotificationGroup", "1.3.6.1.2.1.137.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
