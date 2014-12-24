package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class HOSTRESOURCESMIBDef extends MIB
{
    public static final HOSTRESOURCESMIBDef HOSTRESOURCESMIB = new HOSTRESOURCESMIBDef();

    public final HostEnt host;

    private HOSTRESOURCESMIBDef()
    {
        super("HOST-RESOURCES-MIB");
        this.host = new HostEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.host
        };
    }

    public static final class HostEnt extends MIBEntry<HOSTRESOURCESMIBDef>
    {
        public final HrMIBAdminInfoEnt hrMIBAdminInfo;

        public final HrSystemEnt hrSystem;

        public final HrStorageEnt hrStorage;

        public final HrDeviceEnt hrDevice;

        public final HrSWRunEnt hrSWRun;

        public final HrSWRunPerfEnt hrSWRunPerf;

        public final HrSWInstalledEnt hrSWInstalled;

        private HostEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
        {
            super(mib, parent, "host", "1.3.6.1.2.1.25", false, false, false, false);
            this.hrMIBAdminInfo = new HrMIBAdminInfoEnt(mib, this);
            this.hrSystem = new HrSystemEnt(mib, this);
            this.hrStorage = new HrStorageEnt(mib, this);
            this.hrDevice = new HrDeviceEnt(mib, this);
            this.hrSWRun = new HrSWRunEnt(mib, this);
            this.hrSWRunPerf = new HrSWRunPerfEnt(mib, this);
            this.hrSWInstalled = new HrSWInstalledEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.hrMIBAdminInfo,
                this.hrSystem,
                this.hrStorage,
                this.hrDevice,
                this.hrSWRun,
                this.hrSWRunPerf,
                this.hrSWInstalled
            };
        }
        public static final class HrMIBAdminInfoEnt extends MIBEntry<HOSTRESOURCESMIBDef>
        {
            /** 6 March 2000*/
            public final HostResourcesMibModuleEnt hostResourcesMibModule;

            /** Conformance information*/
            public final HrMIBCompliancesEnt hrMIBCompliances;

            public final HrMIBGroupsEnt hrMIBGroups;

            private HrMIBAdminInfoEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
            {
                super(mib, parent, "hrMIBAdminInfo", "1.3.6.1.2.1.25.7", false, false, false, false);
                this.hostResourcesMibModule = new HostResourcesMibModuleEnt(mib, this);
                this.hrMIBCompliances = new HrMIBCompliancesEnt(mib, this);
                this.hrMIBGroups = new HrMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hostResourcesMibModule,
                    this.hrMIBCompliances,
                    this.hrMIBGroups
                };
            }
            public static final class HostResourcesMibModuleEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                private HostResourcesMibModuleEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hostResourcesMibModule", "1.3.6.1.2.1.25.7.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HrMIBCompliancesEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                /** Compliance Statements*/
                public final HrMIBComplianceEnt hrMIBCompliance;

                private HrMIBCompliancesEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrMIBCompliances", "1.3.6.1.2.1.25.7.2", false, false, false, false);
                    this.hrMIBCompliance = new HrMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hrMIBCompliance
                    };
                }
                public static final class HrMIBComplianceEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    private HrMIBComplianceEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrMIBCompliance", "1.3.6.1.2.1.25.7.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class HrMIBGroupsEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                public final HrSystemGroupEnt hrSystemGroup;

                public final HrStorageGroupEnt hrStorageGroup;

                public final HrDeviceGroupEnt hrDeviceGroup;

                public final HrSWRunGroupEnt hrSWRunGroup;

                public final HrSWRunPerfGroupEnt hrSWRunPerfGroup;

                public final HrSWInstalledGroupEnt hrSWInstalledGroup;

                private HrMIBGroupsEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrMIBGroups", "1.3.6.1.2.1.25.7.3", false, false, false, false);
                    this.hrSystemGroup = new HrSystemGroupEnt(mib, this);
                    this.hrStorageGroup = new HrStorageGroupEnt(mib, this);
                    this.hrDeviceGroup = new HrDeviceGroupEnt(mib, this);
                    this.hrSWRunGroup = new HrSWRunGroupEnt(mib, this);
                    this.hrSWRunPerfGroup = new HrSWRunPerfGroupEnt(mib, this);
                    this.hrSWInstalledGroup = new HrSWInstalledGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hrSystemGroup,
                        this.hrStorageGroup,
                        this.hrDeviceGroup,
                        this.hrSWRunGroup,
                        this.hrSWRunPerfGroup,
                        this.hrSWInstalledGroup
                    };
                }
                public static final class HrSystemGroupEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    private HrSystemGroupEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrSystemGroup", "1.3.6.1.2.1.25.7.3.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HrStorageGroupEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    private HrStorageGroupEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrStorageGroup", "1.3.6.1.2.1.25.7.3.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HrDeviceGroupEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    private HrDeviceGroupEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrDeviceGroup", "1.3.6.1.2.1.25.7.3.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HrSWRunGroupEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    private HrSWRunGroupEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrSWRunGroup", "1.3.6.1.2.1.25.7.3.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HrSWRunPerfGroupEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    private HrSWRunPerfGroupEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrSWRunPerfGroup", "1.3.6.1.2.1.25.7.3.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HrSWInstalledGroupEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    private HrSWInstalledGroupEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrSWInstalledGroup", "1.3.6.1.2.1.25.7.3.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class HrSystemEnt extends MIBEntry<HOSTRESOURCESMIBDef>
        {
            /** The Host Resources System Group*/
            public final HrSystemUptimeEnt hrSystemUptime;

            public final HrSystemDateEnt hrSystemDate;

            public final HrSystemInitialLoadDeviceEnt hrSystemInitialLoadDevice;

            public final HrSystemInitialLoadParametersEnt hrSystemInitialLoadParameters;

            public final HrSystemNumUsersEnt hrSystemNumUsers;

            public final HrSystemProcessesEnt hrSystemProcesses;

            public final HrSystemMaxProcessesEnt hrSystemMaxProcesses;

            private HrSystemEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
            {
                super(mib, parent, "hrSystem", "1.3.6.1.2.1.25.1", false, false, false, false);
                this.hrSystemUptime = new HrSystemUptimeEnt(mib, this);
                this.hrSystemDate = new HrSystemDateEnt(mib, this);
                this.hrSystemInitialLoadDevice = new HrSystemInitialLoadDeviceEnt(mib, this);
                this.hrSystemInitialLoadParameters = new HrSystemInitialLoadParametersEnt(mib, this);
                this.hrSystemNumUsers = new HrSystemNumUsersEnt(mib, this);
                this.hrSystemProcesses = new HrSystemProcessesEnt(mib, this);
                this.hrSystemMaxProcesses = new HrSystemMaxProcessesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hrSystemUptime,
                    this.hrSystemDate,
                    this.hrSystemInitialLoadDevice,
                    this.hrSystemInitialLoadParameters,
                    this.hrSystemNumUsers,
                    this.hrSystemProcesses,
                    this.hrSystemMaxProcesses
                };
            }
            public static final class HrSystemUptimeEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                private HrSystemUptimeEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrSystemUptime", "1.3.6.1.2.1.25.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HrSystemDateEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                private HrSystemDateEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrSystemDate", "1.3.6.1.2.1.25.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HrSystemInitialLoadDeviceEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                private HrSystemInitialLoadDeviceEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrSystemInitialLoadDevice", "1.3.6.1.2.1.25.1.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HrSystemInitialLoadParametersEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                private HrSystemInitialLoadParametersEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrSystemInitialLoadParameters", "1.3.6.1.2.1.25.1.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HrSystemNumUsersEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                private HrSystemNumUsersEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrSystemNumUsers", "1.3.6.1.2.1.25.1.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HrSystemProcessesEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                private HrSystemProcessesEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrSystemProcesses", "1.3.6.1.2.1.25.1.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HrSystemMaxProcessesEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                private HrSystemMaxProcessesEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrSystemMaxProcesses", "1.3.6.1.2.1.25.1.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class HrStorageEnt extends MIBEntry<HOSTRESOURCESMIBDef>
        {
            /** The Host Resources Storage Group
Registration point for storage types, for use with hrStorageType.These are defined in the HOST-RESOURCES-TYPES module.*/
            public final HrStorageTypesEnt hrStorageTypes;

            public final HrMemorySizeEnt hrMemorySize;

            public final HrStorageTableEnt hrStorageTable;

            private HrStorageEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
            {
                super(mib, parent, "hrStorage", "1.3.6.1.2.1.25.2", false, false, false, false);
                this.hrStorageTypes = new HrStorageTypesEnt(mib, this);
                this.hrMemorySize = new HrMemorySizeEnt(mib, this);
                this.hrStorageTable = new HrStorageTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hrStorageTypes,
                    this.hrMemorySize,
                    this.hrStorageTable
                };
            }
            public static final class HrStorageTypesEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                private HrStorageTypesEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrStorageTypes", "1.3.6.1.2.1.25.2.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HrMemorySizeEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                private HrMemorySizeEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrMemorySize", "1.3.6.1.2.1.25.2.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HrStorageTableEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                public final HrStorageEntryEnt hrStorageEntry;

                private HrStorageTableEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrStorageTable", "1.3.6.1.2.1.25.2.3", false, true, false, false);
                    this.hrStorageEntry = new HrStorageEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hrStorageEntry
                    };
                }
                public static final class HrStorageEntryEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    public final HrStorageIndexEnt hrStorageIndex;

                    public final HrStorageTypeEnt hrStorageType;

                    public final HrStorageDescrEnt hrStorageDescr;

                    public final HrStorageAllocationUnitsEnt hrStorageAllocationUnits;

                    public final HrStorageSizeEnt hrStorageSize;

                    public final HrStorageUsedEnt hrStorageUsed;

                    public final HrStorageAllocationFailuresEnt hrStorageAllocationFailures;

                    private HrStorageEntryEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrStorageEntry", "1.3.6.1.2.1.25.2.3.1", false, false, false, true);
                        this.hrStorageIndex = new HrStorageIndexEnt(mib, this);
                        this.hrStorageType = new HrStorageTypeEnt(mib, this);
                        this.hrStorageDescr = new HrStorageDescrEnt(mib, this);
                        this.hrStorageAllocationUnits = new HrStorageAllocationUnitsEnt(mib, this);
                        this.hrStorageSize = new HrStorageSizeEnt(mib, this);
                        this.hrStorageUsed = new HrStorageUsedEnt(mib, this);
                        this.hrStorageAllocationFailures = new HrStorageAllocationFailuresEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hrStorageIndex,
                            this.hrStorageType,
                            this.hrStorageDescr,
                            this.hrStorageAllocationUnits,
                            this.hrStorageSize,
                            this.hrStorageUsed,
                            this.hrStorageAllocationFailures
                        };
                    }
                    public static final class HrStorageIndexEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrStorageIndexEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrStorageIndex", "1.3.6.1.2.1.25.2.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrStorageTypeEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrStorageTypeEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrStorageType", "1.3.6.1.2.1.25.2.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrStorageDescrEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrStorageDescrEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrStorageDescr", "1.3.6.1.2.1.25.2.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrStorageAllocationUnitsEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrStorageAllocationUnitsEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrStorageAllocationUnits", "1.3.6.1.2.1.25.2.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrStorageSizeEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrStorageSizeEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrStorageSize", "1.3.6.1.2.1.25.2.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrStorageUsedEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrStorageUsedEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrStorageUsed", "1.3.6.1.2.1.25.2.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrStorageAllocationFailuresEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrStorageAllocationFailuresEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrStorageAllocationFailures", "1.3.6.1.2.1.25.2.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class HrDeviceEnt extends MIBEntry<HOSTRESOURCESMIBDef>
        {
            /** The Host Resources Device GroupThe device group is useful for identifying and diagnosing thedevices on a system.  The hrDeviceTable contains commoninformation for any type of device.  In addition, some deviceshave device-specific tables for more detailed information.  Moresuch tables may be defined in the future for other device types.
Registration point for device types, for use with hrDeviceType.
These are defined in the HOST-RESOURCES-TYPES module.*/
            public final HrDeviceTypesEnt hrDeviceTypes;

            public final HrDeviceTableEnt hrDeviceTable;

            public final HrProcessorTableEnt hrProcessorTable;

            public final HrNetworkTableEnt hrNetworkTable;

            public final HrPrinterTableEnt hrPrinterTable;

            public final HrDiskStorageTableEnt hrDiskStorageTable;

            public final HrPartitionTableEnt hrPartitionTable;

            /** The File System Table
Registration point for popular File System types,for use with hrFSType. These are defined in theHOST-RESOURCES-TYPES module.*/
            public final HrFSTypesEnt hrFSTypes;

            public final HrFSTableEnt hrFSTable;

            private HrDeviceEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
            {
                super(mib, parent, "hrDevice", "1.3.6.1.2.1.25.3", false, false, false, false);
                this.hrDeviceTypes = new HrDeviceTypesEnt(mib, this);
                this.hrDeviceTable = new HrDeviceTableEnt(mib, this);
                this.hrProcessorTable = new HrProcessorTableEnt(mib, this);
                this.hrNetworkTable = new HrNetworkTableEnt(mib, this);
                this.hrPrinterTable = new HrPrinterTableEnt(mib, this);
                this.hrDiskStorageTable = new HrDiskStorageTableEnt(mib, this);
                this.hrPartitionTable = new HrPartitionTableEnt(mib, this);
                this.hrFSTypes = new HrFSTypesEnt(mib, this);
                this.hrFSTable = new HrFSTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hrDeviceTypes,
                    this.hrDeviceTable,
                    this.hrProcessorTable,
                    this.hrNetworkTable,
                    this.hrPrinterTable,
                    this.hrDiskStorageTable,
                    this.hrPartitionTable,
                    this.hrFSTypes,
                    this.hrFSTable
                };
            }
            public static final class HrDeviceTypesEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                private HrDeviceTypesEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrDeviceTypes", "1.3.6.1.2.1.25.3.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HrDeviceTableEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                public final HrDeviceEntryEnt hrDeviceEntry;

                private HrDeviceTableEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrDeviceTable", "1.3.6.1.2.1.25.3.2", false, true, false, false);
                    this.hrDeviceEntry = new HrDeviceEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hrDeviceEntry
                    };
                }
                public static final class HrDeviceEntryEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    public final HrDeviceIndexEnt hrDeviceIndex;

                    public final HrDeviceTypeEnt hrDeviceType;

                    public final HrDeviceDescrEnt hrDeviceDescr;

                    public final HrDeviceIDEnt hrDeviceID;

                    public final HrDeviceStatusEnt hrDeviceStatus;

                    public final HrDeviceErrorsEnt hrDeviceErrors;

                    private HrDeviceEntryEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrDeviceEntry", "1.3.6.1.2.1.25.3.2.1", false, false, false, true);
                        this.hrDeviceIndex = new HrDeviceIndexEnt(mib, this);
                        this.hrDeviceType = new HrDeviceTypeEnt(mib, this);
                        this.hrDeviceDescr = new HrDeviceDescrEnt(mib, this);
                        this.hrDeviceID = new HrDeviceIDEnt(mib, this);
                        this.hrDeviceStatus = new HrDeviceStatusEnt(mib, this);
                        this.hrDeviceErrors = new HrDeviceErrorsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hrDeviceIndex,
                            this.hrDeviceType,
                            this.hrDeviceDescr,
                            this.hrDeviceID,
                            this.hrDeviceStatus,
                            this.hrDeviceErrors
                        };
                    }
                    public static final class HrDeviceIndexEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrDeviceIndexEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrDeviceIndex", "1.3.6.1.2.1.25.3.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrDeviceTypeEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrDeviceTypeEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrDeviceType", "1.3.6.1.2.1.25.3.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrDeviceDescrEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrDeviceDescrEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrDeviceDescr", "1.3.6.1.2.1.25.3.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrDeviceIDEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrDeviceIDEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrDeviceID", "1.3.6.1.2.1.25.3.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrDeviceStatusEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrDeviceStatusEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrDeviceStatus", "1.3.6.1.2.1.25.3.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrDeviceErrorsEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrDeviceErrorsEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrDeviceErrors", "1.3.6.1.2.1.25.3.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class HrProcessorTableEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                public final HrProcessorEntryEnt hrProcessorEntry;

                private HrProcessorTableEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrProcessorTable", "1.3.6.1.2.1.25.3.3", false, true, false, false);
                    this.hrProcessorEntry = new HrProcessorEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hrProcessorEntry
                    };
                }
                public static final class HrProcessorEntryEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    public final HrProcessorFrwIDEnt hrProcessorFrwID;

                    public final HrProcessorLoadEnt hrProcessorLoad;

                    private HrProcessorEntryEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrProcessorEntry", "1.3.6.1.2.1.25.3.3.1", false, false, false, true);
                        this.hrProcessorFrwID = new HrProcessorFrwIDEnt(mib, this);
                        this.hrProcessorLoad = new HrProcessorLoadEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hrProcessorFrwID,
                            this.hrProcessorLoad
                        };
                    }
                    public static final class HrProcessorFrwIDEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrProcessorFrwIDEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrProcessorFrwID", "1.3.6.1.2.1.25.3.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrProcessorLoadEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrProcessorLoadEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrProcessorLoad", "1.3.6.1.2.1.25.3.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class HrNetworkTableEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                public final HrNetworkEntryEnt hrNetworkEntry;

                private HrNetworkTableEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrNetworkTable", "1.3.6.1.2.1.25.3.4", false, true, false, false);
                    this.hrNetworkEntry = new HrNetworkEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hrNetworkEntry
                    };
                }
                public static final class HrNetworkEntryEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    public final HrNetworkIfIndexEnt hrNetworkIfIndex;

                    private HrNetworkEntryEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrNetworkEntry", "1.3.6.1.2.1.25.3.4.1", false, false, false, true);
                        this.hrNetworkIfIndex = new HrNetworkIfIndexEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hrNetworkIfIndex
                        };
                    }
                    public static final class HrNetworkIfIndexEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrNetworkIfIndexEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrNetworkIfIndex", "1.3.6.1.2.1.25.3.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class HrPrinterTableEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                public final HrPrinterEntryEnt hrPrinterEntry;

                private HrPrinterTableEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrPrinterTable", "1.3.6.1.2.1.25.3.5", false, true, false, false);
                    this.hrPrinterEntry = new HrPrinterEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hrPrinterEntry
                    };
                }
                public static final class HrPrinterEntryEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    public final HrPrinterStatusEnt hrPrinterStatus;

                    public final HrPrinterDetectedErrorStateEnt hrPrinterDetectedErrorState;

                    private HrPrinterEntryEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrPrinterEntry", "1.3.6.1.2.1.25.3.5.1", false, false, false, true);
                        this.hrPrinterStatus = new HrPrinterStatusEnt(mib, this);
                        this.hrPrinterDetectedErrorState = new HrPrinterDetectedErrorStateEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hrPrinterStatus,
                            this.hrPrinterDetectedErrorState
                        };
                    }
                    public static final class HrPrinterStatusEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrPrinterStatusEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrPrinterStatus", "1.3.6.1.2.1.25.3.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrPrinterDetectedErrorStateEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrPrinterDetectedErrorStateEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrPrinterDetectedErrorState", "1.3.6.1.2.1.25.3.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class HrDiskStorageTableEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                public final HrDiskStorageEntryEnt hrDiskStorageEntry;

                private HrDiskStorageTableEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrDiskStorageTable", "1.3.6.1.2.1.25.3.6", false, true, false, false);
                    this.hrDiskStorageEntry = new HrDiskStorageEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hrDiskStorageEntry
                    };
                }
                public static final class HrDiskStorageEntryEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    public final HrDiskStorageAccessEnt hrDiskStorageAccess;

                    public final HrDiskStorageMediaEnt hrDiskStorageMedia;

                    public final HrDiskStorageRemovebleEnt hrDiskStorageRemoveble;

                    public final HrDiskStorageCapacityEnt hrDiskStorageCapacity;

                    private HrDiskStorageEntryEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrDiskStorageEntry", "1.3.6.1.2.1.25.3.6.1", false, false, false, true);
                        this.hrDiskStorageAccess = new HrDiskStorageAccessEnt(mib, this);
                        this.hrDiskStorageMedia = new HrDiskStorageMediaEnt(mib, this);
                        this.hrDiskStorageRemoveble = new HrDiskStorageRemovebleEnt(mib, this);
                        this.hrDiskStorageCapacity = new HrDiskStorageCapacityEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hrDiskStorageAccess,
                            this.hrDiskStorageMedia,
                            this.hrDiskStorageRemoveble,
                            this.hrDiskStorageCapacity
                        };
                    }
                    public static final class HrDiskStorageAccessEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrDiskStorageAccessEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrDiskStorageAccess", "1.3.6.1.2.1.25.3.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrDiskStorageMediaEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrDiskStorageMediaEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrDiskStorageMedia", "1.3.6.1.2.1.25.3.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrDiskStorageRemovebleEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrDiskStorageRemovebleEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrDiskStorageRemoveble", "1.3.6.1.2.1.25.3.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrDiskStorageCapacityEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrDiskStorageCapacityEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrDiskStorageCapacity", "1.3.6.1.2.1.25.3.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class HrPartitionTableEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                public final HrPartitionEntryEnt hrPartitionEntry;

                private HrPartitionTableEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrPartitionTable", "1.3.6.1.2.1.25.3.7", false, true, false, false);
                    this.hrPartitionEntry = new HrPartitionEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hrPartitionEntry
                    };
                }
                public static final class HrPartitionEntryEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    public final HrPartitionIndexEnt hrPartitionIndex;

                    public final HrPartitionLabelEnt hrPartitionLabel;

                    public final HrPartitionIDEnt hrPartitionID;

                    public final HrPartitionSizeEnt hrPartitionSize;

                    public final HrPartitionFSIndexEnt hrPartitionFSIndex;

                    private HrPartitionEntryEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrPartitionEntry", "1.3.6.1.2.1.25.3.7.1", false, false, false, true);
                        this.hrPartitionIndex = new HrPartitionIndexEnt(mib, this);
                        this.hrPartitionLabel = new HrPartitionLabelEnt(mib, this);
                        this.hrPartitionID = new HrPartitionIDEnt(mib, this);
                        this.hrPartitionSize = new HrPartitionSizeEnt(mib, this);
                        this.hrPartitionFSIndex = new HrPartitionFSIndexEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hrPartitionIndex,
                            this.hrPartitionLabel,
                            this.hrPartitionID,
                            this.hrPartitionSize,
                            this.hrPartitionFSIndex
                        };
                    }
                    public static final class HrPartitionIndexEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrPartitionIndexEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrPartitionIndex", "1.3.6.1.2.1.25.3.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrPartitionLabelEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrPartitionLabelEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrPartitionLabel", "1.3.6.1.2.1.25.3.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrPartitionIDEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrPartitionIDEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrPartitionID", "1.3.6.1.2.1.25.3.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrPartitionSizeEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrPartitionSizeEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrPartitionSize", "1.3.6.1.2.1.25.3.7.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrPartitionFSIndexEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrPartitionFSIndexEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrPartitionFSIndex", "1.3.6.1.2.1.25.3.7.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class HrFSTypesEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                private HrFSTypesEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrFSTypes", "1.3.6.1.2.1.25.3.9", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HrFSTableEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                public final HrFSEntryEnt hrFSEntry;

                private HrFSTableEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrFSTable", "1.3.6.1.2.1.25.3.8", false, true, false, false);
                    this.hrFSEntry = new HrFSEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hrFSEntry
                    };
                }
                public static final class HrFSEntryEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    public final HrFSIndexEnt hrFSIndex;

                    public final HrFSMountPointEnt hrFSMountPoint;

                    public final HrFSRemoteMountPointEnt hrFSRemoteMountPoint;

                    public final HrFSTypeEnt hrFSType;

                    public final HrFSAccessEnt hrFSAccess;

                    public final HrFSBootableEnt hrFSBootable;

                    public final HrFSStorageIndexEnt hrFSStorageIndex;

                    public final HrFSLastFullBackupDateEnt hrFSLastFullBackupDate;

                    public final HrFSLastPartialBackupDateEnt hrFSLastPartialBackupDate;

                    private HrFSEntryEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrFSEntry", "1.3.6.1.2.1.25.3.8.1", false, false, false, true);
                        this.hrFSIndex = new HrFSIndexEnt(mib, this);
                        this.hrFSMountPoint = new HrFSMountPointEnt(mib, this);
                        this.hrFSRemoteMountPoint = new HrFSRemoteMountPointEnt(mib, this);
                        this.hrFSType = new HrFSTypeEnt(mib, this);
                        this.hrFSAccess = new HrFSAccessEnt(mib, this);
                        this.hrFSBootable = new HrFSBootableEnt(mib, this);
                        this.hrFSStorageIndex = new HrFSStorageIndexEnt(mib, this);
                        this.hrFSLastFullBackupDate = new HrFSLastFullBackupDateEnt(mib, this);
                        this.hrFSLastPartialBackupDate = new HrFSLastPartialBackupDateEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hrFSIndex,
                            this.hrFSMountPoint,
                            this.hrFSRemoteMountPoint,
                            this.hrFSType,
                            this.hrFSAccess,
                            this.hrFSBootable,
                            this.hrFSStorageIndex,
                            this.hrFSLastFullBackupDate,
                            this.hrFSLastPartialBackupDate
                        };
                    }
                    public static final class HrFSIndexEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrFSIndexEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrFSIndex", "1.3.6.1.2.1.25.3.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrFSMountPointEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrFSMountPointEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrFSMountPoint", "1.3.6.1.2.1.25.3.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrFSRemoteMountPointEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrFSRemoteMountPointEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrFSRemoteMountPoint", "1.3.6.1.2.1.25.3.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrFSTypeEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrFSTypeEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrFSType", "1.3.6.1.2.1.25.3.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrFSAccessEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrFSAccessEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrFSAccess", "1.3.6.1.2.1.25.3.8.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrFSBootableEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrFSBootableEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrFSBootable", "1.3.6.1.2.1.25.3.8.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrFSStorageIndexEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrFSStorageIndexEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrFSStorageIndex", "1.3.6.1.2.1.25.3.8.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrFSLastFullBackupDateEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrFSLastFullBackupDateEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrFSLastFullBackupDate", "1.3.6.1.2.1.25.3.8.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrFSLastPartialBackupDateEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrFSLastPartialBackupDateEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrFSLastPartialBackupDate", "1.3.6.1.2.1.25.3.8.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class HrSWRunEnt extends MIBEntry<HOSTRESOURCESMIBDef>
        {
            /** The Host Resources Running Software GroupThe hrSWRunTable contains an entry for each distinct piece ofsoftware that is running or loaded into physical or virtualmemory in preparation for running.  This includes the host'soperating system, device drivers, and applications.*/
            public final HrSWOSIndexEnt hrSWOSIndex;

            public final HrSWRunTableEnt hrSWRunTable;

            private HrSWRunEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
            {
                super(mib, parent, "hrSWRun", "1.3.6.1.2.1.25.4", false, false, false, false);
                this.hrSWOSIndex = new HrSWOSIndexEnt(mib, this);
                this.hrSWRunTable = new HrSWRunTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hrSWOSIndex,
                    this.hrSWRunTable
                };
            }
            public static final class HrSWOSIndexEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                private HrSWOSIndexEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrSWOSIndex", "1.3.6.1.2.1.25.4.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HrSWRunTableEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                public final HrSWRunEntryEnt hrSWRunEntry;

                private HrSWRunTableEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrSWRunTable", "1.3.6.1.2.1.25.4.2", false, true, false, false);
                    this.hrSWRunEntry = new HrSWRunEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hrSWRunEntry
                    };
                }
                public static final class HrSWRunEntryEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    public final HrSWRunIndexEnt hrSWRunIndex;

                    public final HrSWRunNameEnt hrSWRunName;

                    public final HrSWRunIDEnt hrSWRunID;

                    public final HrSWRunPathEnt hrSWRunPath;

                    public final HrSWRunParametersEnt hrSWRunParameters;

                    public final HrSWRunTypeEnt hrSWRunType;

                    public final HrSWRunStatusEnt hrSWRunStatus;

                    private HrSWRunEntryEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrSWRunEntry", "1.3.6.1.2.1.25.4.2.1", false, false, false, true);
                        this.hrSWRunIndex = new HrSWRunIndexEnt(mib, this);
                        this.hrSWRunName = new HrSWRunNameEnt(mib, this);
                        this.hrSWRunID = new HrSWRunIDEnt(mib, this);
                        this.hrSWRunPath = new HrSWRunPathEnt(mib, this);
                        this.hrSWRunParameters = new HrSWRunParametersEnt(mib, this);
                        this.hrSWRunType = new HrSWRunTypeEnt(mib, this);
                        this.hrSWRunStatus = new HrSWRunStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hrSWRunIndex,
                            this.hrSWRunName,
                            this.hrSWRunID,
                            this.hrSWRunPath,
                            this.hrSWRunParameters,
                            this.hrSWRunType,
                            this.hrSWRunStatus
                        };
                    }
                    public static final class HrSWRunIndexEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrSWRunIndexEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrSWRunIndex", "1.3.6.1.2.1.25.4.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrSWRunNameEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrSWRunNameEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrSWRunName", "1.3.6.1.2.1.25.4.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrSWRunIDEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrSWRunIDEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrSWRunID", "1.3.6.1.2.1.25.4.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrSWRunPathEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrSWRunPathEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrSWRunPath", "1.3.6.1.2.1.25.4.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrSWRunParametersEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrSWRunParametersEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrSWRunParameters", "1.3.6.1.2.1.25.4.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrSWRunTypeEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrSWRunTypeEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrSWRunType", "1.3.6.1.2.1.25.4.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrSWRunStatusEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrSWRunStatusEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrSWRunStatus", "1.3.6.1.2.1.25.4.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class HrSWRunPerfEnt extends MIBEntry<HOSTRESOURCESMIBDef>
        {
            /** The Host Resources Running Software Performance GroupThe hrSWRunPerfTable contains an entry corresponding toeach entry in the hrSWRunTable.*/
            public final HrSWRunPerfTableEnt hrSWRunPerfTable;

            private HrSWRunPerfEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
            {
                super(mib, parent, "hrSWRunPerf", "1.3.6.1.2.1.25.5", false, false, false, false);
                this.hrSWRunPerfTable = new HrSWRunPerfTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hrSWRunPerfTable
                };
            }
            public static final class HrSWRunPerfTableEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                /** This table augments information in
the hrSWRunTable.*/
                public final HrSWRunPerfEntryEnt hrSWRunPerfEntry;

                private HrSWRunPerfTableEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrSWRunPerfTable", "1.3.6.1.2.1.25.5.1", false, true, false, false);
                    this.hrSWRunPerfEntry = new HrSWRunPerfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hrSWRunPerfEntry
                    };
                }
                public static final class HrSWRunPerfEntryEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    public final HrSWRunPerfCPUEnt hrSWRunPerfCPU;

                    public final HrSWRunPerfMemEnt hrSWRunPerfMem;

                    private HrSWRunPerfEntryEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrSWRunPerfEntry", "1.3.6.1.2.1.25.5.1.1", false, false, false, true);
                        this.hrSWRunPerfCPU = new HrSWRunPerfCPUEnt(mib, this);
                        this.hrSWRunPerfMem = new HrSWRunPerfMemEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hrSWRunPerfCPU,
                            this.hrSWRunPerfMem
                        };
                    }
                    public static final class HrSWRunPerfCPUEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrSWRunPerfCPUEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrSWRunPerfCPU", "1.3.6.1.2.1.25.5.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrSWRunPerfMemEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrSWRunPerfMemEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrSWRunPerfMem", "1.3.6.1.2.1.25.5.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class HrSWInstalledEnt extends MIBEntry<HOSTRESOURCESMIBDef>
        {
            /** The Host Resources Installed Software GroupThe hrSWInstalledTable contains an entry for each pieceof software installed in long-term storage (e.g. a diskdrive) locally on this host.  Note that this does notinclude software loadable remotely from a networkserver.Different implementations may track software in varyingways. For example, while some implementations may trackexecutable files as distinct pieces of software, otherimplementations may use other strategies such as keepingtrack of software "packages" (e.g., related groups of files)or keeping track of system or application "patches".This table is useful for identifying and inventoryingsoftware on a host and for diagnosing incompatibilityand version mismatch problems between various piecesof hardware and software.*/
            public final HrSWInstalledLastChangeEnt hrSWInstalledLastChange;

            public final HrSWInstalledLastUpdateTimeEnt hrSWInstalledLastUpdateTime;

            public final HrSWInstalledTableEnt hrSWInstalledTable;

            private HrSWInstalledEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
            {
                super(mib, parent, "hrSWInstalled", "1.3.6.1.2.1.25.6", false, false, false, false);
                this.hrSWInstalledLastChange = new HrSWInstalledLastChangeEnt(mib, this);
                this.hrSWInstalledLastUpdateTime = new HrSWInstalledLastUpdateTimeEnt(mib, this);
                this.hrSWInstalledTable = new HrSWInstalledTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hrSWInstalledLastChange,
                    this.hrSWInstalledLastUpdateTime,
                    this.hrSWInstalledTable
                };
            }
            public static final class HrSWInstalledLastChangeEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                private HrSWInstalledLastChangeEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrSWInstalledLastChange", "1.3.6.1.2.1.25.6.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HrSWInstalledLastUpdateTimeEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                private HrSWInstalledLastUpdateTimeEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrSWInstalledLastUpdateTime", "1.3.6.1.2.1.25.6.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HrSWInstalledTableEnt extends MIBEntry<HOSTRESOURCESMIBDef>
            {
                public final HrSWInstalledEntryEnt hrSWInstalledEntry;

                private HrSWInstalledTableEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                {
                    super(mib, parent, "hrSWInstalledTable", "1.3.6.1.2.1.25.6.3", false, true, false, false);
                    this.hrSWInstalledEntry = new HrSWInstalledEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hrSWInstalledEntry
                    };
                }
                public static final class HrSWInstalledEntryEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                {
                    public final HrSWInstalledIndexEnt hrSWInstalledIndex;

                    public final HrSWInstalledNameEnt hrSWInstalledName;

                    public final HrSWInstalledIDEnt hrSWInstalledID;

                    public final HrSWInstalledTypeEnt hrSWInstalledType;

                    public final HrSWInstalledDateEnt hrSWInstalledDate;

                    private HrSWInstalledEntryEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                    {
                        super(mib, parent, "hrSWInstalledEntry", "1.3.6.1.2.1.25.6.3.1", false, false, false, true);
                        this.hrSWInstalledIndex = new HrSWInstalledIndexEnt(mib, this);
                        this.hrSWInstalledName = new HrSWInstalledNameEnt(mib, this);
                        this.hrSWInstalledID = new HrSWInstalledIDEnt(mib, this);
                        this.hrSWInstalledType = new HrSWInstalledTypeEnt(mib, this);
                        this.hrSWInstalledDate = new HrSWInstalledDateEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hrSWInstalledIndex,
                            this.hrSWInstalledName,
                            this.hrSWInstalledID,
                            this.hrSWInstalledType,
                            this.hrSWInstalledDate
                        };
                    }
                    public static final class HrSWInstalledIndexEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrSWInstalledIndexEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrSWInstalledIndex", "1.3.6.1.2.1.25.6.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrSWInstalledNameEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrSWInstalledNameEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrSWInstalledName", "1.3.6.1.2.1.25.6.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrSWInstalledIDEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrSWInstalledIDEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrSWInstalledID", "1.3.6.1.2.1.25.6.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrSWInstalledTypeEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrSWInstalledTypeEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrSWInstalledType", "1.3.6.1.2.1.25.6.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HrSWInstalledDateEnt extends MIBEntry<HOSTRESOURCESMIBDef>
                    {
                        private HrSWInstalledDateEnt(HOSTRESOURCESMIBDef mib, MIBEntry<HOSTRESOURCESMIBDef> parent)
                        {
                            super(mib, parent, "hrSWInstalledDate", "1.3.6.1.2.1.25.6.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

}
