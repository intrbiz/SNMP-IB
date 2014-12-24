package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2580]
[RFC2579]
[RFC3411]
[RFC2788]
[RFC4044]
[RFC4438]
[RFC4439]*/
public final class T11FCFABRICCONFIGSERVERMIBDef extends MIB
{
    public static final T11FCFABRICCONFIGSERVERMIBDef T11FCFABRICCONFIGSERVERMIB = new T11FCFABRICCONFIGSERVERMIBDef();

    /** [RFC4439]*/
    public final T11FcFabricConfigServerMIBEnt t11FcFabricConfigServerMIB;

    private T11FCFABRICCONFIGSERVERMIBDef()
    {
        super("T11-FC-FABRIC-CONFIG-SERVER-MIB");
        this.t11FcFabricConfigServerMIB = new T11FcFabricConfigServerMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.t11FcFabricConfigServerMIB
        };
    }

    public static final class T11FcFabricConfigServerMIBEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
    {
        public final T11FcsMIBObjectsEnt t11FcsMIBObjects;

        public final T11FcsMIBConformanceEnt t11FcsMIBConformance;

        public final T11FcsNotificationsEnt t11FcsNotifications;

        private T11FcFabricConfigServerMIBEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
        {
            super(mib, parent, "t11FcFabricConfigServerMIB", "1.3.6.1.2.1.162", false, false, false, false);
            this.t11FcsMIBObjects = new T11FcsMIBObjectsEnt(mib, this);
            this.t11FcsMIBConformance = new T11FcsMIBConformanceEnt(mib, this);
            this.t11FcsNotifications = new T11FcsNotificationsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.t11FcsMIBObjects,
                this.t11FcsMIBConformance,
                this.t11FcsNotifications
            };
        }
        public static final class T11FcsMIBObjectsEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
        {
            public final T11FcsDiscoveryEnt t11FcsDiscovery;

            public final T11FcsDiscoveredConfigEnt t11FcsDiscoveredConfig;

            public final T11FcsStatsEnt t11FcsStats;

            public final T11FcsNotificationInfoEnt t11FcsNotificationInfo;

            private T11FcsMIBObjectsEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
            {
                super(mib, parent, "t11FcsMIBObjects", "1.3.6.1.2.1.162.1", false, false, false, false);
                this.t11FcsDiscovery = new T11FcsDiscoveryEnt(mib, this);
                this.t11FcsDiscoveredConfig = new T11FcsDiscoveredConfigEnt(mib, this);
                this.t11FcsStats = new T11FcsStatsEnt(mib, this);
                this.t11FcsNotificationInfo = new T11FcsNotificationInfoEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11FcsDiscovery,
                    this.t11FcsDiscoveredConfig,
                    this.t11FcsStats,
                    this.t11FcsNotificationInfo
                };
            }
            public static final class T11FcsDiscoveryEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
            {
                /** Objects for Fabric Discovery*/
                public final T11FcsFabricDiscoveryTableEnt t11FcsFabricDiscoveryTable;

                /** Discovery State table*/
                public final T11FcsDiscoveryStateTableEnt t11FcsDiscoveryStateTable;

                private T11FcsDiscoveryEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                {
                    super(mib, parent, "t11FcsDiscovery", "1.3.6.1.2.1.162.1.1", false, false, false, false);
                    this.t11FcsFabricDiscoveryTable = new T11FcsFabricDiscoveryTableEnt(mib, this);
                    this.t11FcsDiscoveryStateTable = new T11FcsDiscoveryStateTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FcsFabricDiscoveryTable,
                        this.t11FcsDiscoveryStateTable
                    };
                }
                public static final class T11FcsFabricDiscoveryTableEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    public final T11FcsFabricDiscoveryEntryEnt t11FcsFabricDiscoveryEntry;

                    private T11FcsFabricDiscoveryTableEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsFabricDiscoveryTable", "1.3.6.1.2.1.162.1.1.1", false, true, false, false);
                        this.t11FcsFabricDiscoveryEntry = new T11FcsFabricDiscoveryEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FcsFabricDiscoveryEntry
                        };
                    }
                    public static final class T11FcsFabricDiscoveryEntryEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                    {
                        public final T11FcsFabricDiscoveryRangeLowEnt t11FcsFabricDiscoveryRangeLow;

                        public final T11FcsFabricDiscoveryRangeHighEnt t11FcsFabricDiscoveryRangeHigh;

                        public final T11FcsFabricDiscoveryStartEnt t11FcsFabricDiscoveryStart;

                        public final T11FcsFabricDiscoveryTimeOutEnt t11FcsFabricDiscoveryTimeOut;

                        private T11FcsFabricDiscoveryEntryEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11FcsFabricDiscoveryEntry", "1.3.6.1.2.1.162.1.1.1.1", false, false, false, true);
                            this.t11FcsFabricDiscoveryRangeLow = new T11FcsFabricDiscoveryRangeLowEnt(mib, this);
                            this.t11FcsFabricDiscoveryRangeHigh = new T11FcsFabricDiscoveryRangeHighEnt(mib, this);
                            this.t11FcsFabricDiscoveryStart = new T11FcsFabricDiscoveryStartEnt(mib, this);
                            this.t11FcsFabricDiscoveryTimeOut = new T11FcsFabricDiscoveryTimeOutEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FcsFabricDiscoveryRangeLow,
                                this.t11FcsFabricDiscoveryRangeHigh,
                                this.t11FcsFabricDiscoveryStart,
                                this.t11FcsFabricDiscoveryTimeOut
                            };
                        }
                        public static final class T11FcsFabricDiscoveryRangeLowEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsFabricDiscoveryRangeLowEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsFabricDiscoveryRangeLow", "1.3.6.1.2.1.162.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsFabricDiscoveryRangeHighEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsFabricDiscoveryRangeHighEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsFabricDiscoveryRangeHigh", "1.3.6.1.2.1.162.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsFabricDiscoveryStartEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsFabricDiscoveryStartEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsFabricDiscoveryStart", "1.3.6.1.2.1.162.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsFabricDiscoveryTimeOutEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsFabricDiscoveryTimeOutEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsFabricDiscoveryTimeOut", "1.3.6.1.2.1.162.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11FcsDiscoveryStateTableEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    public final T11FcsDiscoveryStateEntryEnt t11FcsDiscoveryStateEntry;

                    private T11FcsDiscoveryStateTableEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsDiscoveryStateTable", "1.3.6.1.2.1.162.1.1.2", false, true, false, false);
                        this.t11FcsDiscoveryStateEntry = new T11FcsDiscoveryStateEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FcsDiscoveryStateEntry
                        };
                    }
                    public static final class T11FcsDiscoveryStateEntryEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                    {
                        public final T11FcsFabricIndexEnt t11FcsFabricIndex;

                        public final T11FcsDiscoveryStatusEnt t11FcsDiscoveryStatus;

                        public final T11FcsDiscoveryCompleteTimeEnt t11FcsDiscoveryCompleteTime;

                        private T11FcsDiscoveryStateEntryEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11FcsDiscoveryStateEntry", "1.3.6.1.2.1.162.1.1.2.1", false, false, false, true);
                            this.t11FcsFabricIndex = new T11FcsFabricIndexEnt(mib, this);
                            this.t11FcsDiscoveryStatus = new T11FcsDiscoveryStatusEnt(mib, this);
                            this.t11FcsDiscoveryCompleteTime = new T11FcsDiscoveryCompleteTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FcsFabricIndex,
                                this.t11FcsDiscoveryStatus,
                                this.t11FcsDiscoveryCompleteTime
                            };
                        }
                        public static final class T11FcsFabricIndexEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsFabricIndexEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsFabricIndex", "1.3.6.1.2.1.162.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsDiscoveryStatusEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsDiscoveryStatusEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsDiscoveryStatus", "1.3.6.1.2.1.162.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsDiscoveryCompleteTimeEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsDiscoveryCompleteTimeEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsDiscoveryCompleteTime", "1.3.6.1.2.1.162.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class T11FcsDiscoveredConfigEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
            {
                /** The Database of Fabric Configuration Information
Interconnect Element table*/
                public final T11FcsIeTableEnt t11FcsIeTable;

                /** Management Address List table*/
                public final T11FcsMgmtAddrListTableEnt t11FcsMgmtAddrListTable;

                /** Ports*/
                public final T11FcsPortTableEnt t11FcsPortTable;

                /** Attached Port List table*/
                public final T11FcsAttachPortNameListTableEnt t11FcsAttachPortNameListTable;

                /** Platforms*/
                public final T11FcsPlatformTableEnt t11FcsPlatformTable;

                /** Node Name List table*/
                public final T11FcsNodeNameListTableEnt t11FcsNodeNameListTable;

                private T11FcsDiscoveredConfigEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                {
                    super(mib, parent, "t11FcsDiscoveredConfig", "1.3.6.1.2.1.162.1.2", false, false, false, false);
                    this.t11FcsIeTable = new T11FcsIeTableEnt(mib, this);
                    this.t11FcsMgmtAddrListTable = new T11FcsMgmtAddrListTableEnt(mib, this);
                    this.t11FcsPortTable = new T11FcsPortTableEnt(mib, this);
                    this.t11FcsAttachPortNameListTable = new T11FcsAttachPortNameListTableEnt(mib, this);
                    this.t11FcsPlatformTable = new T11FcsPlatformTableEnt(mib, this);
                    this.t11FcsNodeNameListTable = new T11FcsNodeNameListTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FcsIeTable,
                        this.t11FcsMgmtAddrListTable,
                        this.t11FcsPortTable,
                        this.t11FcsAttachPortNameListTable,
                        this.t11FcsPlatformTable,
                        this.t11FcsNodeNameListTable
                    };
                }
                public static final class T11FcsIeTableEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    public final T11FcsIeEntryEnt t11FcsIeEntry;

                    private T11FcsIeTableEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsIeTable", "1.3.6.1.2.1.162.1.2.1", false, true, false, false);
                        this.t11FcsIeEntry = new T11FcsIeEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FcsIeEntry
                        };
                    }
                    public static final class T11FcsIeEntryEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                    {
                        public final T11FcsIeNameEnt t11FcsIeName;

                        public final T11FcsIeTypeEnt t11FcsIeType;

                        public final T11FcsIeDomainIdEnt t11FcsIeDomainId;

                        public final T11FcsIeMgmtIdEnt t11FcsIeMgmtId;

                        public final T11FcsIeFabricNameEnt t11FcsIeFabricName;

                        public final T11FcsIeLogicalNameEnt t11FcsIeLogicalName;

                        public final T11FcsIeMgmtAddrListIndexEnt t11FcsIeMgmtAddrListIndex;

                        public final T11FcsIeInfoListEnt t11FcsIeInfoList;

                        private T11FcsIeEntryEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11FcsIeEntry", "1.3.6.1.2.1.162.1.2.1.1", false, false, false, true);
                            this.t11FcsIeName = new T11FcsIeNameEnt(mib, this);
                            this.t11FcsIeType = new T11FcsIeTypeEnt(mib, this);
                            this.t11FcsIeDomainId = new T11FcsIeDomainIdEnt(mib, this);
                            this.t11FcsIeMgmtId = new T11FcsIeMgmtIdEnt(mib, this);
                            this.t11FcsIeFabricName = new T11FcsIeFabricNameEnt(mib, this);
                            this.t11FcsIeLogicalName = new T11FcsIeLogicalNameEnt(mib, this);
                            this.t11FcsIeMgmtAddrListIndex = new T11FcsIeMgmtAddrListIndexEnt(mib, this);
                            this.t11FcsIeInfoList = new T11FcsIeInfoListEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FcsIeName,
                                this.t11FcsIeType,
                                this.t11FcsIeDomainId,
                                this.t11FcsIeMgmtId,
                                this.t11FcsIeFabricName,
                                this.t11FcsIeLogicalName,
                                this.t11FcsIeMgmtAddrListIndex,
                                this.t11FcsIeInfoList
                            };
                        }
                        public static final class T11FcsIeNameEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsIeNameEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsIeName", "1.3.6.1.2.1.162.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsIeTypeEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsIeTypeEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsIeType", "1.3.6.1.2.1.162.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsIeDomainIdEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsIeDomainIdEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsIeDomainId", "1.3.6.1.2.1.162.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsIeMgmtIdEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsIeMgmtIdEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsIeMgmtId", "1.3.6.1.2.1.162.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsIeFabricNameEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsIeFabricNameEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsIeFabricName", "1.3.6.1.2.1.162.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsIeLogicalNameEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsIeLogicalNameEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsIeLogicalName", "1.3.6.1.2.1.162.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsIeMgmtAddrListIndexEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsIeMgmtAddrListIndexEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsIeMgmtAddrListIndex", "1.3.6.1.2.1.162.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsIeInfoListEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsIeInfoListEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsIeInfoList", "1.3.6.1.2.1.162.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11FcsMgmtAddrListTableEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    public final T11FcsMgmtAddrListEntryEnt t11FcsMgmtAddrListEntry;

                    private T11FcsMgmtAddrListTableEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsMgmtAddrListTable", "1.3.6.1.2.1.162.1.2.2", false, true, false, false);
                        this.t11FcsMgmtAddrListEntry = new T11FcsMgmtAddrListEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FcsMgmtAddrListEntry
                        };
                    }
                    public static final class T11FcsMgmtAddrListEntryEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                    {
                        public final T11FcsMgmtAddrListIndexEnt t11FcsMgmtAddrListIndex;

                        public final T11FcsMgmtAddrIndexEnt t11FcsMgmtAddrIndex;

                        public final T11FcsMgmtAddrEnt t11FcsMgmtAddr;

                        private T11FcsMgmtAddrListEntryEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11FcsMgmtAddrListEntry", "1.3.6.1.2.1.162.1.2.2.1", false, false, false, true);
                            this.t11FcsMgmtAddrListIndex = new T11FcsMgmtAddrListIndexEnt(mib, this);
                            this.t11FcsMgmtAddrIndex = new T11FcsMgmtAddrIndexEnt(mib, this);
                            this.t11FcsMgmtAddr = new T11FcsMgmtAddrEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FcsMgmtAddrListIndex,
                                this.t11FcsMgmtAddrIndex,
                                this.t11FcsMgmtAddr
                            };
                        }
                        public static final class T11FcsMgmtAddrListIndexEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsMgmtAddrListIndexEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsMgmtAddrListIndex", "1.3.6.1.2.1.162.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsMgmtAddrIndexEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsMgmtAddrIndexEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsMgmtAddrIndex", "1.3.6.1.2.1.162.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsMgmtAddrEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsMgmtAddrEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsMgmtAddr", "1.3.6.1.2.1.162.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11FcsPortTableEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    public final T11FcsPortEntryEnt t11FcsPortEntry;

                    private T11FcsPortTableEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsPortTable", "1.3.6.1.2.1.162.1.2.4", false, true, false, false);
                        this.t11FcsPortEntry = new T11FcsPortEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FcsPortEntry
                        };
                    }
                    public static final class T11FcsPortEntryEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                    {
                        public final T11FcsPortNameEnt t11FcsPortName;

                        public final T11FcsPortTypeEnt t11FcsPortType;

                        public final T11FcsPortTxTypeEnt t11FcsPortTxType;

                        public final T11FcsPortModuleTypeEnt t11FcsPortModuleType;

                        public final T11FcsPortPhyPortNumEnt t11FcsPortPhyPortNum;

                        public final T11FcsPortAttachPortNameIndexEnt t11FcsPortAttachPortNameIndex;

                        public final T11FcsPortStateEnt t11FcsPortState;

                        public final T11FcsPortSpeedCapabEnt t11FcsPortSpeedCapab;

                        public final T11FcsPortOperSpeedEnt t11FcsPortOperSpeed;

                        public final T11FcsPortZoningEnfStatusEnt t11FcsPortZoningEnfStatus;

                        private T11FcsPortEntryEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11FcsPortEntry", "1.3.6.1.2.1.162.1.2.4.1", false, false, false, true);
                            this.t11FcsPortName = new T11FcsPortNameEnt(mib, this);
                            this.t11FcsPortType = new T11FcsPortTypeEnt(mib, this);
                            this.t11FcsPortTxType = new T11FcsPortTxTypeEnt(mib, this);
                            this.t11FcsPortModuleType = new T11FcsPortModuleTypeEnt(mib, this);
                            this.t11FcsPortPhyPortNum = new T11FcsPortPhyPortNumEnt(mib, this);
                            this.t11FcsPortAttachPortNameIndex = new T11FcsPortAttachPortNameIndexEnt(mib, this);
                            this.t11FcsPortState = new T11FcsPortStateEnt(mib, this);
                            this.t11FcsPortSpeedCapab = new T11FcsPortSpeedCapabEnt(mib, this);
                            this.t11FcsPortOperSpeed = new T11FcsPortOperSpeedEnt(mib, this);
                            this.t11FcsPortZoningEnfStatus = new T11FcsPortZoningEnfStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FcsPortName,
                                this.t11FcsPortType,
                                this.t11FcsPortTxType,
                                this.t11FcsPortModuleType,
                                this.t11FcsPortPhyPortNum,
                                this.t11FcsPortAttachPortNameIndex,
                                this.t11FcsPortState,
                                this.t11FcsPortSpeedCapab,
                                this.t11FcsPortOperSpeed,
                                this.t11FcsPortZoningEnfStatus
                            };
                        }
                        public static final class T11FcsPortNameEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPortNameEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPortName", "1.3.6.1.2.1.162.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPortTypeEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPortTypeEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPortType", "1.3.6.1.2.1.162.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPortTxTypeEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPortTxTypeEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPortTxType", "1.3.6.1.2.1.162.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPortModuleTypeEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPortModuleTypeEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPortModuleType", "1.3.6.1.2.1.162.1.2.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPortPhyPortNumEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPortPhyPortNumEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPortPhyPortNum", "1.3.6.1.2.1.162.1.2.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPortAttachPortNameIndexEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPortAttachPortNameIndexEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPortAttachPortNameIndex", "1.3.6.1.2.1.162.1.2.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPortStateEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPortStateEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPortState", "1.3.6.1.2.1.162.1.2.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPortSpeedCapabEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPortSpeedCapabEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPortSpeedCapab", "1.3.6.1.2.1.162.1.2.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPortOperSpeedEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPortOperSpeedEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPortOperSpeed", "1.3.6.1.2.1.162.1.2.4.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPortZoningEnfStatusEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPortZoningEnfStatusEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPortZoningEnfStatus", "1.3.6.1.2.1.162.1.2.4.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11FcsAttachPortNameListTableEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    public final T11FcsAttachPortNameListEntryEnt t11FcsAttachPortNameListEntry;

                    private T11FcsAttachPortNameListTableEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsAttachPortNameListTable", "1.3.6.1.2.1.162.1.2.5", false, true, false, false);
                        this.t11FcsAttachPortNameListEntry = new T11FcsAttachPortNameListEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FcsAttachPortNameListEntry
                        };
                    }
                    public static final class T11FcsAttachPortNameListEntryEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                    {
                        public final T11FcsAttachPortNameListIndexEnt t11FcsAttachPortNameListIndex;

                        public final T11FcsAttachPortNameEnt t11FcsAttachPortName;

                        private T11FcsAttachPortNameListEntryEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11FcsAttachPortNameListEntry", "1.3.6.1.2.1.162.1.2.5.1", false, false, false, true);
                            this.t11FcsAttachPortNameListIndex = new T11FcsAttachPortNameListIndexEnt(mib, this);
                            this.t11FcsAttachPortName = new T11FcsAttachPortNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FcsAttachPortNameListIndex,
                                this.t11FcsAttachPortName
                            };
                        }
                        public static final class T11FcsAttachPortNameListIndexEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsAttachPortNameListIndexEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsAttachPortNameListIndex", "1.3.6.1.2.1.162.1.2.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsAttachPortNameEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsAttachPortNameEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsAttachPortName", "1.3.6.1.2.1.162.1.2.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11FcsPlatformTableEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    public final T11FcsPlatformEntryEnt t11FcsPlatformEntry;

                    private T11FcsPlatformTableEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsPlatformTable", "1.3.6.1.2.1.162.1.2.6", false, true, false, false);
                        this.t11FcsPlatformEntry = new T11FcsPlatformEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FcsPlatformEntry
                        };
                    }
                    public static final class T11FcsPlatformEntryEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                    {
                        public final T11FcsPlatformIndexEnt t11FcsPlatformIndex;

                        public final T11FcsPlatformNameEnt t11FcsPlatformName;

                        public final T11FcsPlatformTypeEnt t11FcsPlatformType;

                        public final T11FcsPlatformNodeNameListIndexEnt t11FcsPlatformNodeNameListIndex;

                        public final T11FcsPlatformMgmtAddrListIndexEnt t11FcsPlatformMgmtAddrListIndex;

                        public final T11FcsPlatformVendorIdEnt t11FcsPlatformVendorId;

                        public final T11FcsPlatformProductIdEnt t11FcsPlatformProductId;

                        public final T11FcsPlatformProductRevLevelEnt t11FcsPlatformProductRevLevel;

                        public final T11FcsPlatformDescriptionEnt t11FcsPlatformDescription;

                        public final T11FcsPlatformLabelEnt t11FcsPlatformLabel;

                        public final T11FcsPlatformLocationEnt t11FcsPlatformLocation;

                        public final T11FcsPlatformSystemIDEnt t11FcsPlatformSystemID;

                        public final T11FcsPlatformSysMgmtAddrEnt t11FcsPlatformSysMgmtAddr;

                        public final T11FcsPlatformClusterIdEnt t11FcsPlatformClusterId;

                        public final T11FcsPlatformClusterMgmtAddrEnt t11FcsPlatformClusterMgmtAddr;

                        public final T11FcsPlatformFC4TypesEnt t11FcsPlatformFC4Types;

                        private T11FcsPlatformEntryEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11FcsPlatformEntry", "1.3.6.1.2.1.162.1.2.6.1", false, false, false, true);
                            this.t11FcsPlatformIndex = new T11FcsPlatformIndexEnt(mib, this);
                            this.t11FcsPlatformName = new T11FcsPlatformNameEnt(mib, this);
                            this.t11FcsPlatformType = new T11FcsPlatformTypeEnt(mib, this);
                            this.t11FcsPlatformNodeNameListIndex = new T11FcsPlatformNodeNameListIndexEnt(mib, this);
                            this.t11FcsPlatformMgmtAddrListIndex = new T11FcsPlatformMgmtAddrListIndexEnt(mib, this);
                            this.t11FcsPlatformVendorId = new T11FcsPlatformVendorIdEnt(mib, this);
                            this.t11FcsPlatformProductId = new T11FcsPlatformProductIdEnt(mib, this);
                            this.t11FcsPlatformProductRevLevel = new T11FcsPlatformProductRevLevelEnt(mib, this);
                            this.t11FcsPlatformDescription = new T11FcsPlatformDescriptionEnt(mib, this);
                            this.t11FcsPlatformLabel = new T11FcsPlatformLabelEnt(mib, this);
                            this.t11FcsPlatformLocation = new T11FcsPlatformLocationEnt(mib, this);
                            this.t11FcsPlatformSystemID = new T11FcsPlatformSystemIDEnt(mib, this);
                            this.t11FcsPlatformSysMgmtAddr = new T11FcsPlatformSysMgmtAddrEnt(mib, this);
                            this.t11FcsPlatformClusterId = new T11FcsPlatformClusterIdEnt(mib, this);
                            this.t11FcsPlatformClusterMgmtAddr = new T11FcsPlatformClusterMgmtAddrEnt(mib, this);
                            this.t11FcsPlatformFC4Types = new T11FcsPlatformFC4TypesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FcsPlatformIndex,
                                this.t11FcsPlatformName,
                                this.t11FcsPlatformType,
                                this.t11FcsPlatformNodeNameListIndex,
                                this.t11FcsPlatformMgmtAddrListIndex,
                                this.t11FcsPlatformVendorId,
                                this.t11FcsPlatformProductId,
                                this.t11FcsPlatformProductRevLevel,
                                this.t11FcsPlatformDescription,
                                this.t11FcsPlatformLabel,
                                this.t11FcsPlatformLocation,
                                this.t11FcsPlatformSystemID,
                                this.t11FcsPlatformSysMgmtAddr,
                                this.t11FcsPlatformClusterId,
                                this.t11FcsPlatformClusterMgmtAddr,
                                this.t11FcsPlatformFC4Types
                            };
                        }
                        public static final class T11FcsPlatformIndexEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPlatformIndexEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPlatformIndex", "1.3.6.1.2.1.162.1.2.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPlatformNameEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPlatformNameEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPlatformName", "1.3.6.1.2.1.162.1.2.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPlatformTypeEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPlatformTypeEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPlatformType", "1.3.6.1.2.1.162.1.2.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPlatformNodeNameListIndexEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPlatformNodeNameListIndexEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPlatformNodeNameListIndex", "1.3.6.1.2.1.162.1.2.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPlatformMgmtAddrListIndexEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPlatformMgmtAddrListIndexEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPlatformMgmtAddrListIndex", "1.3.6.1.2.1.162.1.2.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPlatformVendorIdEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPlatformVendorIdEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPlatformVendorId", "1.3.6.1.2.1.162.1.2.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPlatformProductIdEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPlatformProductIdEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPlatformProductId", "1.3.6.1.2.1.162.1.2.6.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPlatformProductRevLevelEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPlatformProductRevLevelEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPlatformProductRevLevel", "1.3.6.1.2.1.162.1.2.6.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPlatformDescriptionEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPlatformDescriptionEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPlatformDescription", "1.3.6.1.2.1.162.1.2.6.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPlatformLabelEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPlatformLabelEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPlatformLabel", "1.3.6.1.2.1.162.1.2.6.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPlatformLocationEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPlatformLocationEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPlatformLocation", "1.3.6.1.2.1.162.1.2.6.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPlatformSystemIDEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPlatformSystemIDEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPlatformSystemID", "1.3.6.1.2.1.162.1.2.6.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPlatformSysMgmtAddrEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPlatformSysMgmtAddrEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPlatformSysMgmtAddr", "1.3.6.1.2.1.162.1.2.6.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPlatformClusterIdEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPlatformClusterIdEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPlatformClusterId", "1.3.6.1.2.1.162.1.2.6.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPlatformClusterMgmtAddrEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPlatformClusterMgmtAddrEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPlatformClusterMgmtAddr", "1.3.6.1.2.1.162.1.2.6.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsPlatformFC4TypesEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsPlatformFC4TypesEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsPlatformFC4Types", "1.3.6.1.2.1.162.1.2.6.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11FcsNodeNameListTableEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    public final T11FcsNodeNameListEntryEnt t11FcsNodeNameListEntry;

                    private T11FcsNodeNameListTableEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsNodeNameListTable", "1.3.6.1.2.1.162.1.2.7", false, true, false, false);
                        this.t11FcsNodeNameListEntry = new T11FcsNodeNameListEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FcsNodeNameListEntry
                        };
                    }
                    public static final class T11FcsNodeNameListEntryEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                    {
                        public final T11FcsNodeNameListIndexEnt t11FcsNodeNameListIndex;

                        public final T11FcsNodeNameEnt t11FcsNodeName;

                        private T11FcsNodeNameListEntryEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11FcsNodeNameListEntry", "1.3.6.1.2.1.162.1.2.7.1", false, false, false, true);
                            this.t11FcsNodeNameListIndex = new T11FcsNodeNameListIndexEnt(mib, this);
                            this.t11FcsNodeName = new T11FcsNodeNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FcsNodeNameListIndex,
                                this.t11FcsNodeName
                            };
                        }
                        public static final class T11FcsNodeNameListIndexEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsNodeNameListIndexEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsNodeNameListIndex", "1.3.6.1.2.1.162.1.2.7.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsNodeNameEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsNodeNameEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsNodeName", "1.3.6.1.2.1.162.1.2.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class T11FcsStatsEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
            {
                /** Statistics*/
                public final T11FcsStatsTableEnt t11FcsStatsTable;

                private T11FcsStatsEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                {
                    super(mib, parent, "t11FcsStats", "1.3.6.1.2.1.162.1.3", false, false, false, false);
                    this.t11FcsStatsTable = new T11FcsStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FcsStatsTable
                    };
                }
                public static final class T11FcsStatsTableEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    public final T11FcsStatsEntryEnt t11FcsStatsEntry;

                    private T11FcsStatsTableEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsStatsTable", "1.3.6.1.2.1.162.1.3.1", false, true, false, false);
                        this.t11FcsStatsEntry = new T11FcsStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FcsStatsEntry
                        };
                    }
                    public static final class T11FcsStatsEntryEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                    {
                        public final T11FcsInGetReqsEnt t11FcsInGetReqs;

                        public final T11FcsOutGetReqsEnt t11FcsOutGetReqs;

                        public final T11FcsInRegReqsEnt t11FcsInRegReqs;

                        public final T11FcsOutRegReqsEnt t11FcsOutRegReqs;

                        public final T11FcsInDeregReqsEnt t11FcsInDeregReqs;

                        public final T11FcsOutDeregReqsEnt t11FcsOutDeregReqs;

                        public final T11FcsRejectsEnt t11FcsRejects;

                        private T11FcsStatsEntryEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11FcsStatsEntry", "1.3.6.1.2.1.162.1.3.1.1", false, false, false, true);
                            this.t11FcsInGetReqs = new T11FcsInGetReqsEnt(mib, this);
                            this.t11FcsOutGetReqs = new T11FcsOutGetReqsEnt(mib, this);
                            this.t11FcsInRegReqs = new T11FcsInRegReqsEnt(mib, this);
                            this.t11FcsOutRegReqs = new T11FcsOutRegReqsEnt(mib, this);
                            this.t11FcsInDeregReqs = new T11FcsInDeregReqsEnt(mib, this);
                            this.t11FcsOutDeregReqs = new T11FcsOutDeregReqsEnt(mib, this);
                            this.t11FcsRejects = new T11FcsRejectsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FcsInGetReqs,
                                this.t11FcsOutGetReqs,
                                this.t11FcsInRegReqs,
                                this.t11FcsOutRegReqs,
                                this.t11FcsInDeregReqs,
                                this.t11FcsOutDeregReqs,
                                this.t11FcsRejects
                            };
                        }
                        public static final class T11FcsInGetReqsEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsInGetReqsEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsInGetReqs", "1.3.6.1.2.1.162.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsOutGetReqsEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsOutGetReqsEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsOutGetReqs", "1.3.6.1.2.1.162.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsInRegReqsEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsInRegReqsEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsInRegReqs", "1.3.6.1.2.1.162.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsOutRegReqsEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsOutRegReqsEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsOutRegReqs", "1.3.6.1.2.1.162.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsInDeregReqsEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsInDeregReqsEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsInDeregReqs", "1.3.6.1.2.1.162.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsOutDeregReqsEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsOutDeregReqsEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsOutDeregReqs", "1.3.6.1.2.1.162.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsRejectsEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsRejectsEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsRejects", "1.3.6.1.2.1.162.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class T11FcsNotificationInfoEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
            {
                /** Notification Control Table*/
                public final T11FcsNotifyControlTableEnt t11FcsNotifyControlTable;

                public final T11FcsMgmtAddrChangeFabricIndexEnt t11FcsMgmtAddrChangeFabricIndex;

                public final T11FcsMgmtAddrChangeIeNameEnt t11FcsMgmtAddrChangeIeName;

                private T11FcsNotificationInfoEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                {
                    super(mib, parent, "t11FcsNotificationInfo", "1.3.6.1.2.1.162.1.4", false, false, false, false);
                    this.t11FcsNotifyControlTable = new T11FcsNotifyControlTableEnt(mib, this);
                    this.t11FcsMgmtAddrChangeFabricIndex = new T11FcsMgmtAddrChangeFabricIndexEnt(mib, this);
                    this.t11FcsMgmtAddrChangeIeName = new T11FcsMgmtAddrChangeIeNameEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FcsNotifyControlTable,
                        this.t11FcsMgmtAddrChangeFabricIndex,
                        this.t11FcsMgmtAddrChangeIeName
                    };
                }
                public static final class T11FcsNotifyControlTableEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    public final T11FcsNotifyControlEntryEnt t11FcsNotifyControlEntry;

                    private T11FcsNotifyControlTableEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsNotifyControlTable", "1.3.6.1.2.1.162.1.4.1", false, true, false, false);
                        this.t11FcsNotifyControlEntry = new T11FcsNotifyControlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FcsNotifyControlEntry
                        };
                    }
                    public static final class T11FcsNotifyControlEntryEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                    {
                        public final T11FcsReqRejectNotifyEnableEnt t11FcsReqRejectNotifyEnable;

                        public final T11FcsDiscoveryCompNotifyEnableEnt t11FcsDiscoveryCompNotifyEnable;

                        public final T11FcsMgmtAddrChangeNotifyEnableEnt t11FcsMgmtAddrChangeNotifyEnable;

                        public final T11FcsRejectCtCommandStringEnt t11FcsRejectCtCommandString;

                        public final T11FcsRejectRequestSourceEnt t11FcsRejectRequestSource;

                        public final T11FcsRejectReasonCodeEnt t11FcsRejectReasonCode;

                        public final T11FcsRejectReasonCodeExpEnt t11FcsRejectReasonCodeExp;

                        public final T11FcsRejectReasonVendorCodeEnt t11FcsRejectReasonVendorCode;

                        private T11FcsNotifyControlEntryEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11FcsNotifyControlEntry", "1.3.6.1.2.1.162.1.4.1.1", false, false, false, true);
                            this.t11FcsReqRejectNotifyEnable = new T11FcsReqRejectNotifyEnableEnt(mib, this);
                            this.t11FcsDiscoveryCompNotifyEnable = new T11FcsDiscoveryCompNotifyEnableEnt(mib, this);
                            this.t11FcsMgmtAddrChangeNotifyEnable = new T11FcsMgmtAddrChangeNotifyEnableEnt(mib, this);
                            this.t11FcsRejectCtCommandString = new T11FcsRejectCtCommandStringEnt(mib, this);
                            this.t11FcsRejectRequestSource = new T11FcsRejectRequestSourceEnt(mib, this);
                            this.t11FcsRejectReasonCode = new T11FcsRejectReasonCodeEnt(mib, this);
                            this.t11FcsRejectReasonCodeExp = new T11FcsRejectReasonCodeExpEnt(mib, this);
                            this.t11FcsRejectReasonVendorCode = new T11FcsRejectReasonVendorCodeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FcsReqRejectNotifyEnable,
                                this.t11FcsDiscoveryCompNotifyEnable,
                                this.t11FcsMgmtAddrChangeNotifyEnable,
                                this.t11FcsRejectCtCommandString,
                                this.t11FcsRejectRequestSource,
                                this.t11FcsRejectReasonCode,
                                this.t11FcsRejectReasonCodeExp,
                                this.t11FcsRejectReasonVendorCode
                            };
                        }
                        public static final class T11FcsReqRejectNotifyEnableEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsReqRejectNotifyEnableEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsReqRejectNotifyEnable", "1.3.6.1.2.1.162.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsDiscoveryCompNotifyEnableEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsDiscoveryCompNotifyEnableEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsDiscoveryCompNotifyEnable", "1.3.6.1.2.1.162.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsMgmtAddrChangeNotifyEnableEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsMgmtAddrChangeNotifyEnableEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsMgmtAddrChangeNotifyEnable", "1.3.6.1.2.1.162.1.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsRejectCtCommandStringEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsRejectCtCommandStringEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsRejectCtCommandString", "1.3.6.1.2.1.162.1.4.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsRejectRequestSourceEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsRejectRequestSourceEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsRejectRequestSource", "1.3.6.1.2.1.162.1.4.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsRejectReasonCodeEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsRejectReasonCodeEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsRejectReasonCode", "1.3.6.1.2.1.162.1.4.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsRejectReasonCodeExpEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsRejectReasonCodeExpEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsRejectReasonCodeExp", "1.3.6.1.2.1.162.1.4.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcsRejectReasonVendorCodeEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                        {
                            private T11FcsRejectReasonVendorCodeEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11FcsRejectReasonVendorCode", "1.3.6.1.2.1.162.1.4.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11FcsMgmtAddrChangeFabricIndexEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    private T11FcsMgmtAddrChangeFabricIndexEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsMgmtAddrChangeFabricIndex", "1.3.6.1.2.1.162.1.4.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FcsMgmtAddrChangeIeNameEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    private T11FcsMgmtAddrChangeIeNameEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsMgmtAddrChangeIeName", "1.3.6.1.2.1.162.1.4.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class T11FcsMIBConformanceEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
        {
            /** Conformance*/
            public final T11FcsMIBCompliancesEnt t11FcsMIBCompliances;

            public final T11FcsMIBGroupsEnt t11FcsMIBGroups;

            private T11FcsMIBConformanceEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
            {
                super(mib, parent, "t11FcsMIBConformance", "1.3.6.1.2.1.162.2", false, false, false, false);
                this.t11FcsMIBCompliances = new T11FcsMIBCompliancesEnt(mib, this);
                this.t11FcsMIBGroups = new T11FcsMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11FcsMIBCompliances,
                    this.t11FcsMIBGroups
                };
            }
            public static final class T11FcsMIBCompliancesEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
            {
                public final T11FcsMIBComplianceEnt t11FcsMIBCompliance;

                private T11FcsMIBCompliancesEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                {
                    super(mib, parent, "t11FcsMIBCompliances", "1.3.6.1.2.1.162.2.1", false, false, false, false);
                    this.t11FcsMIBCompliance = new T11FcsMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FcsMIBCompliance
                    };
                }
                public static final class T11FcsMIBComplianceEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    private T11FcsMIBComplianceEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsMIBCompliance", "1.3.6.1.2.1.162.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class T11FcsMIBGroupsEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
            {
                /** Units of Conformance*/
                public final T11FcsDiscoveryControlGroupEnt t11FcsDiscoveryControlGroup;

                public final T11FcsDiscoveryStatusGroupEnt t11FcsDiscoveryStatusGroup;

                public final T11FcsDiscoveredConfigGroupEnt t11FcsDiscoveredConfigGroup;

                public final T11FcsStatisticsGroupEnt t11FcsStatisticsGroup;

                public final T11FcsNotificationInfoGroupEnt t11FcsNotificationInfoGroup;

                public final T11FcsNotificationGroupEnt t11FcsNotificationGroup;

                private T11FcsMIBGroupsEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                {
                    super(mib, parent, "t11FcsMIBGroups", "1.3.6.1.2.1.162.2.2", false, false, false, false);
                    this.t11FcsDiscoveryControlGroup = new T11FcsDiscoveryControlGroupEnt(mib, this);
                    this.t11FcsDiscoveryStatusGroup = new T11FcsDiscoveryStatusGroupEnt(mib, this);
                    this.t11FcsDiscoveredConfigGroup = new T11FcsDiscoveredConfigGroupEnt(mib, this);
                    this.t11FcsStatisticsGroup = new T11FcsStatisticsGroupEnt(mib, this);
                    this.t11FcsNotificationInfoGroup = new T11FcsNotificationInfoGroupEnt(mib, this);
                    this.t11FcsNotificationGroup = new T11FcsNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FcsDiscoveryControlGroup,
                        this.t11FcsDiscoveryStatusGroup,
                        this.t11FcsDiscoveredConfigGroup,
                        this.t11FcsStatisticsGroup,
                        this.t11FcsNotificationInfoGroup,
                        this.t11FcsNotificationGroup
                    };
                }
                public static final class T11FcsDiscoveryControlGroupEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    private T11FcsDiscoveryControlGroupEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsDiscoveryControlGroup", "1.3.6.1.2.1.162.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FcsDiscoveryStatusGroupEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    private T11FcsDiscoveryStatusGroupEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsDiscoveryStatusGroup", "1.3.6.1.2.1.162.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FcsDiscoveredConfigGroupEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    private T11FcsDiscoveredConfigGroupEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsDiscoveredConfigGroup", "1.3.6.1.2.1.162.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FcsStatisticsGroupEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    private T11FcsStatisticsGroupEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsStatisticsGroup", "1.3.6.1.2.1.162.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FcsNotificationInfoGroupEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    private T11FcsNotificationInfoGroupEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsNotificationInfoGroup", "1.3.6.1.2.1.162.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FcsNotificationGroupEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
                {
                    private T11FcsNotificationGroupEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11FcsNotificationGroup", "1.3.6.1.2.1.162.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class T11FcsNotificationsEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
        {
            /** Notifications*/
            public final T11FcsRqRejectNotificationEnt t11FcsRqRejectNotification;

            public final T11FcsDiscoveryCompleteNotifyEnt t11FcsDiscoveryCompleteNotify;

            public final T11FcsMgmtAddrChangeNotifyEnt t11FcsMgmtAddrChangeNotify;

            private T11FcsNotificationsEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
            {
                super(mib, parent, "t11FcsNotifications", "1.3.6.1.2.1.162.0", false, false, false, false);
                this.t11FcsRqRejectNotification = new T11FcsRqRejectNotificationEnt(mib, this);
                this.t11FcsDiscoveryCompleteNotify = new T11FcsDiscoveryCompleteNotifyEnt(mib, this);
                this.t11FcsMgmtAddrChangeNotify = new T11FcsMgmtAddrChangeNotifyEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11FcsRqRejectNotification,
                    this.t11FcsDiscoveryCompleteNotify,
                    this.t11FcsMgmtAddrChangeNotify
                };
            }
            public static final class T11FcsRqRejectNotificationEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
            {
                private T11FcsRqRejectNotificationEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                {
                    super(mib, parent, "t11FcsRqRejectNotification", "1.3.6.1.2.1.162.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class T11FcsDiscoveryCompleteNotifyEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
            {
                private T11FcsDiscoveryCompleteNotifyEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                {
                    super(mib, parent, "t11FcsDiscoveryCompleteNotify", "1.3.6.1.2.1.162.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class T11FcsMgmtAddrChangeNotifyEnt extends MIBEntry<T11FCFABRICCONFIGSERVERMIBDef>
            {
                private T11FcsMgmtAddrChangeNotifyEnt(T11FCFABRICCONFIGSERVERMIBDef mib, MIBEntry<T11FCFABRICCONFIGSERVERMIBDef> parent)
                {
                    super(mib, parent, "t11FcsMgmtAddrChangeNotify", "1.3.6.1.2.1.162.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
