package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2580]
[RFC2579]
[RFC2863]
[RFC4044]*/
public final class T11FCVIRTUALFABRICMIBDef extends MIB
{
    public static final T11FCVIRTUALFABRICMIBDef T11FCVIRTUALFABRICMIB = new T11FCVIRTUALFABRICMIBDef();

    /** [RFC4439]*/
    public final T11FcVirtualFabricMIBEnt t11FcVirtualFabricMIB;

    private T11FCVIRTUALFABRICMIBDef()
    {
        super("T11-FC-VIRTUAL-FABRIC-MIB");
        this.t11FcVirtualFabricMIB = new T11FcVirtualFabricMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.t11FcVirtualFabricMIB
        };
    }

    public static final class T11FcVirtualFabricMIBEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
    {
        public final T11vfObjectsEnt t11vfObjects;

        public final T11vfConformanceEnt t11vfConformance;

        private T11FcVirtualFabricMIBEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
        {
            super(mib, parent, "t11FcVirtualFabricMIB", "1.3.6.1.2.1.147", false, false, false, false);
            this.t11vfObjects = new T11vfObjectsEnt(mib, this);
            this.t11vfConformance = new T11vfConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.t11vfObjects,
                this.t11vfConformance
            };
        }
        public static final class T11vfObjectsEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
        {
            /** ********************************MIB object definitions*/
            public final T11vfCoreSwitchTableEnt t11vfCoreSwitchTable;

            /** Virtual Switch table*/
            public final T11vfVirtualSwitchTableEnt t11vfVirtualSwitchTable;

            /** Port table*/
            public final T11vfPortTableEnt t11vfPortTable;

            /** Locally Enabled Table*/
            public final T11vfLocallyEnabledTableEnt t11vfLocallyEnabledTable;

            private T11vfObjectsEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
            {
                super(mib, parent, "t11vfObjects", "1.3.6.1.2.1.147.1", false, false, false, false);
                this.t11vfCoreSwitchTable = new T11vfCoreSwitchTableEnt(mib, this);
                this.t11vfVirtualSwitchTable = new T11vfVirtualSwitchTableEnt(mib, this);
                this.t11vfPortTable = new T11vfPortTableEnt(mib, this);
                this.t11vfLocallyEnabledTable = new T11vfLocallyEnabledTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11vfCoreSwitchTable,
                    this.t11vfVirtualSwitchTable,
                    this.t11vfPortTable,
                    this.t11vfLocallyEnabledTable
                };
            }
            public static final class T11vfCoreSwitchTableEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
            {
                public final T11vfCoreSwitchEntryEnt t11vfCoreSwitchEntry;

                private T11vfCoreSwitchTableEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                {
                    super(mib, parent, "t11vfCoreSwitchTable", "1.3.6.1.2.1.147.1.1", false, true, false, false);
                    this.t11vfCoreSwitchEntry = new T11vfCoreSwitchEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11vfCoreSwitchEntry
                    };
                }
                public static final class T11vfCoreSwitchEntryEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                {
                    public final T11vfCoreSwitchSwitchNameEnt t11vfCoreSwitchSwitchName;

                    public final T11vfCoreSwitchMaxSupportedEnt t11vfCoreSwitchMaxSupported;

                    public final T11vfCoreSwitchStorageTypeEnt t11vfCoreSwitchStorageType;

                    private T11vfCoreSwitchEntryEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                    {
                        super(mib, parent, "t11vfCoreSwitchEntry", "1.3.6.1.2.1.147.1.1.1", false, false, false, true);
                        this.t11vfCoreSwitchSwitchName = new T11vfCoreSwitchSwitchNameEnt(mib, this);
                        this.t11vfCoreSwitchMaxSupported = new T11vfCoreSwitchMaxSupportedEnt(mib, this);
                        this.t11vfCoreSwitchStorageType = new T11vfCoreSwitchStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11vfCoreSwitchSwitchName,
                            this.t11vfCoreSwitchMaxSupported,
                            this.t11vfCoreSwitchStorageType
                        };
                    }
                    public static final class T11vfCoreSwitchSwitchNameEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                    {
                        private T11vfCoreSwitchSwitchNameEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                        {
                            super(mib, parent, "t11vfCoreSwitchSwitchName", "1.3.6.1.2.1.147.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11vfCoreSwitchMaxSupportedEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                    {
                        private T11vfCoreSwitchMaxSupportedEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                        {
                            super(mib, parent, "t11vfCoreSwitchMaxSupported", "1.3.6.1.2.1.147.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11vfCoreSwitchStorageTypeEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                    {
                        private T11vfCoreSwitchStorageTypeEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                        {
                            super(mib, parent, "t11vfCoreSwitchStorageType", "1.3.6.1.2.1.147.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class T11vfVirtualSwitchTableEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
            {
                public final T11vfVirtualSwitchEntryEnt t11vfVirtualSwitchEntry;

                private T11vfVirtualSwitchTableEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                {
                    super(mib, parent, "t11vfVirtualSwitchTable", "1.3.6.1.2.1.147.1.2", false, true, false, false);
                    this.t11vfVirtualSwitchEntry = new T11vfVirtualSwitchEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11vfVirtualSwitchEntry
                    };
                }
                public static final class T11vfVirtualSwitchEntryEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                {
                    public final T11vfVirtualSwitchVfIdEnt t11vfVirtualSwitchVfId;

                    public final T11vfVirtualSwitchCoreSwitchNameEnt t11vfVirtualSwitchCoreSwitchName;

                    public final T11vfVirtualSwitchRowStatusEnt t11vfVirtualSwitchRowStatus;

                    public final T11vfVirtualSwitchStorageTypeEnt t11vfVirtualSwitchStorageType;

                    private T11vfVirtualSwitchEntryEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                    {
                        super(mib, parent, "t11vfVirtualSwitchEntry", "1.3.6.1.2.1.147.1.2.1", false, false, false, true);
                        this.t11vfVirtualSwitchVfId = new T11vfVirtualSwitchVfIdEnt(mib, this);
                        this.t11vfVirtualSwitchCoreSwitchName = new T11vfVirtualSwitchCoreSwitchNameEnt(mib, this);
                        this.t11vfVirtualSwitchRowStatus = new T11vfVirtualSwitchRowStatusEnt(mib, this);
                        this.t11vfVirtualSwitchStorageType = new T11vfVirtualSwitchStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11vfVirtualSwitchVfId,
                            this.t11vfVirtualSwitchCoreSwitchName,
                            this.t11vfVirtualSwitchRowStatus,
                            this.t11vfVirtualSwitchStorageType
                        };
                    }
                    public static final class T11vfVirtualSwitchVfIdEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                    {
                        private T11vfVirtualSwitchVfIdEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                        {
                            super(mib, parent, "t11vfVirtualSwitchVfId", "1.3.6.1.2.1.147.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11vfVirtualSwitchCoreSwitchNameEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                    {
                        private T11vfVirtualSwitchCoreSwitchNameEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                        {
                            super(mib, parent, "t11vfVirtualSwitchCoreSwitchName", "1.3.6.1.2.1.147.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11vfVirtualSwitchRowStatusEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                    {
                        private T11vfVirtualSwitchRowStatusEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                        {
                            super(mib, parent, "t11vfVirtualSwitchRowStatus", "1.3.6.1.2.1.147.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11vfVirtualSwitchStorageTypeEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                    {
                        private T11vfVirtualSwitchStorageTypeEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                        {
                            super(mib, parent, "t11vfVirtualSwitchStorageType", "1.3.6.1.2.1.147.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class T11vfPortTableEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
            {
                public final T11vfPortEntryEnt t11vfPortEntry;

                private T11vfPortTableEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                {
                    super(mib, parent, "t11vfPortTable", "1.3.6.1.2.1.147.1.3", false, true, false, false);
                    this.t11vfPortEntry = new T11vfPortEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11vfPortEntry
                    };
                }
                public static final class T11vfPortEntryEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                {
                    public final T11vfPortVfIdEnt t11vfPortVfId;

                    public final T11vfPortTaggingAdminStatusEnt t11vfPortTaggingAdminStatus;

                    public final T11vfPortTaggingOperStatusEnt t11vfPortTaggingOperStatus;

                    public final T11vfPortStorageTypeEnt t11vfPortStorageType;

                    private T11vfPortEntryEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                    {
                        super(mib, parent, "t11vfPortEntry", "1.3.6.1.2.1.147.1.3.1", false, false, false, true);
                        this.t11vfPortVfId = new T11vfPortVfIdEnt(mib, this);
                        this.t11vfPortTaggingAdminStatus = new T11vfPortTaggingAdminStatusEnt(mib, this);
                        this.t11vfPortTaggingOperStatus = new T11vfPortTaggingOperStatusEnt(mib, this);
                        this.t11vfPortStorageType = new T11vfPortStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11vfPortVfId,
                            this.t11vfPortTaggingAdminStatus,
                            this.t11vfPortTaggingOperStatus,
                            this.t11vfPortStorageType
                        };
                    }
                    public static final class T11vfPortVfIdEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                    {
                        private T11vfPortVfIdEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                        {
                            super(mib, parent, "t11vfPortVfId", "1.3.6.1.2.1.147.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11vfPortTaggingAdminStatusEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                    {
                        private T11vfPortTaggingAdminStatusEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                        {
                            super(mib, parent, "t11vfPortTaggingAdminStatus", "1.3.6.1.2.1.147.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11vfPortTaggingOperStatusEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                    {
                        private T11vfPortTaggingOperStatusEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                        {
                            super(mib, parent, "t11vfPortTaggingOperStatus", "1.3.6.1.2.1.147.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11vfPortStorageTypeEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                    {
                        private T11vfPortStorageTypeEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                        {
                            super(mib, parent, "t11vfPortStorageType", "1.3.6.1.2.1.147.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class T11vfLocallyEnabledTableEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
            {
                public final T11vfLocallyEnabledEntryEnt t11vfLocallyEnabledEntry;

                private T11vfLocallyEnabledTableEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                {
                    super(mib, parent, "t11vfLocallyEnabledTable", "1.3.6.1.2.1.147.1.4", false, true, false, false);
                    this.t11vfLocallyEnabledEntry = new T11vfLocallyEnabledEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11vfLocallyEnabledEntry
                    };
                }
                public static final class T11vfLocallyEnabledEntryEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                {
                    public final T11vfLocallyEnabledPortIfIndexEnt t11vfLocallyEnabledPortIfIndex;

                    public final T11vfLocallyEnabledVfIdEnt t11vfLocallyEnabledVfId;

                    public final T11vfLocallyEnabledOperStatusEnt t11vfLocallyEnabledOperStatus;

                    public final T11vfLocallyEnabledRowStatusEnt t11vfLocallyEnabledRowStatus;

                    public final T11vfLocallyEnabledStorageTypeEnt t11vfLocallyEnabledStorageType;

                    private T11vfLocallyEnabledEntryEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                    {
                        super(mib, parent, "t11vfLocallyEnabledEntry", "1.3.6.1.2.1.147.1.4.1", false, false, false, true);
                        this.t11vfLocallyEnabledPortIfIndex = new T11vfLocallyEnabledPortIfIndexEnt(mib, this);
                        this.t11vfLocallyEnabledVfId = new T11vfLocallyEnabledVfIdEnt(mib, this);
                        this.t11vfLocallyEnabledOperStatus = new T11vfLocallyEnabledOperStatusEnt(mib, this);
                        this.t11vfLocallyEnabledRowStatus = new T11vfLocallyEnabledRowStatusEnt(mib, this);
                        this.t11vfLocallyEnabledStorageType = new T11vfLocallyEnabledStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11vfLocallyEnabledPortIfIndex,
                            this.t11vfLocallyEnabledVfId,
                            this.t11vfLocallyEnabledOperStatus,
                            this.t11vfLocallyEnabledRowStatus,
                            this.t11vfLocallyEnabledStorageType
                        };
                    }
                    public static final class T11vfLocallyEnabledPortIfIndexEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                    {
                        private T11vfLocallyEnabledPortIfIndexEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                        {
                            super(mib, parent, "t11vfLocallyEnabledPortIfIndex", "1.3.6.1.2.1.147.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11vfLocallyEnabledVfIdEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                    {
                        private T11vfLocallyEnabledVfIdEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                        {
                            super(mib, parent, "t11vfLocallyEnabledVfId", "1.3.6.1.2.1.147.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11vfLocallyEnabledOperStatusEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                    {
                        private T11vfLocallyEnabledOperStatusEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                        {
                            super(mib, parent, "t11vfLocallyEnabledOperStatus", "1.3.6.1.2.1.147.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11vfLocallyEnabledRowStatusEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                    {
                        private T11vfLocallyEnabledRowStatusEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                        {
                            super(mib, parent, "t11vfLocallyEnabledRowStatus", "1.3.6.1.2.1.147.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11vfLocallyEnabledStorageTypeEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                    {
                        private T11vfLocallyEnabledStorageTypeEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                        {
                            super(mib, parent, "t11vfLocallyEnabledStorageType", "1.3.6.1.2.1.147.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class T11vfConformanceEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
        {
            /** ********************************


Conformance Section*/
            public final T11vfMIBCompliancesEnt t11vfMIBCompliances;

            public final T11vfMIBGroupsEnt t11vfMIBGroups;

            private T11vfConformanceEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
            {
                super(mib, parent, "t11vfConformance", "1.3.6.1.2.1.147.2", false, false, false, false);
                this.t11vfMIBCompliances = new T11vfMIBCompliancesEnt(mib, this);
                this.t11vfMIBGroups = new T11vfMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11vfMIBCompliances,
                    this.t11vfMIBGroups
                };
            }
            public static final class T11vfMIBCompliancesEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
            {
                public final T11vfMIBComplianceEnt t11vfMIBCompliance;

                private T11vfMIBCompliancesEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                {
                    super(mib, parent, "t11vfMIBCompliances", "1.3.6.1.2.1.147.2.1", false, false, false, false);
                    this.t11vfMIBCompliance = new T11vfMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11vfMIBCompliance
                    };
                }
                public static final class T11vfMIBComplianceEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                {
                    private T11vfMIBComplianceEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                    {
                        super(mib, parent, "t11vfMIBCompliance", "1.3.6.1.2.1.147.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class T11vfMIBGroupsEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
            {
                /** Units of conformance*/
                public final T11vfGeneralGroupEnt t11vfGeneralGroup;

                private T11vfMIBGroupsEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                {
                    super(mib, parent, "t11vfMIBGroups", "1.3.6.1.2.1.147.2.2", false, false, false, false);
                    this.t11vfGeneralGroup = new T11vfGeneralGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11vfGeneralGroup
                    };
                }
                public static final class T11vfGeneralGroupEnt extends MIBEntry<T11FCVIRTUALFABRICMIBDef>
                {
                    private T11vfGeneralGroupEnt(T11FCVIRTUALFABRICMIBDef mib, MIBEntry<T11FCVIRTUALFABRICMIBDef> parent)
                    {
                        super(mib, parent, "t11vfGeneralGroup", "1.3.6.1.2.1.147.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
