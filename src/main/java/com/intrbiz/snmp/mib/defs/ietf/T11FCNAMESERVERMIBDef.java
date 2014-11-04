package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**The MIB for management of the Fibre Channel functionality which
implements the Name Server function.
[RFC2578]
[RFC2580]
[RFC3411]
[RFC2579]
[FC-MGMT]
[FC-FAM-MIB]*/
public final class T11FCNAMESERVERMIBDef extends MIB
{
    public static final T11FCNAMESERVERMIBDef T11FCNAMESERVERMIB = new T11FCNAMESERVERMIBDef();

    static { MIBs.getInstance().registerMIB(T11FCNAMESERVERMIBDef.T11FCNAMESERVERMIB); }

    /** [FC-FAM-MIB]*/
    public final T11FcNameServerMIBEnt t11FcNameServerMIB;

    private T11FCNAMESERVERMIBDef()
    {
        super("T11-FC-NAME-SERVER-MIB");
        this.t11FcNameServerMIB = new T11FcNameServerMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.t11FcNameServerMIB
        };
    }

    public static final class T11FcNameServerMIBEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
    {
        public final T11NsNotificationsEnt t11NsNotifications;

        public final T11NsMIBObjectsEnt t11NsMIBObjects;

        public final T11NsMIBConformanceEnt t11NsMIBConformance;

        private T11FcNameServerMIBEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
        {
            super(mib, parent, "t11FcNameServerMIB", "1.3.6.1.2.1.135", false, false, false, false);
            this.t11NsNotifications = new T11NsNotificationsEnt(mib, this);
            this.t11NsMIBObjects = new T11NsMIBObjectsEnt(mib, this);
            this.t11NsMIBConformance = new T11NsMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.t11NsNotifications,
                this.t11NsMIBObjects,
                this.t11NsMIBConformance
            };
        }
        public static final class T11NsNotificationsEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
        {
            /** Notifications*/
            public final T11NsRejectRegNotifyEnt t11NsRejectRegNotify;

            private T11NsNotificationsEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
            {
                super(mib, parent, "t11NsNotifications", "1.3.6.1.2.1.135.0", false, false, false, false);
                this.t11NsRejectRegNotify = new T11NsRejectRegNotifyEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11NsRejectRegNotify
                };
            }
            public static final class T11NsRejectRegNotifyEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
            {
                private T11NsRejectRegNotifyEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                {
                    super(mib, parent, "t11NsRejectRegNotify", "1.3.6.1.2.1.135.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class T11NsMIBObjectsEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
        {
            public final T11NsStatusEnt t11NsStatus;

            public final T11NsStatisticsEnt t11NsStatistics;

            private T11NsMIBObjectsEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
            {
                super(mib, parent, "t11NsMIBObjects", "1.3.6.1.2.1.135.1", false, false, false, false);
                this.t11NsStatus = new T11NsStatusEnt(mib, this);
                this.t11NsStatistics = new T11NsStatisticsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11NsStatus,
                    this.t11NsStatistics
                };
            }
            public static final class T11NsStatusEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
            {
                /** Information about a Name Server Information Subset*/
                public final T11NsInfoSubsetTableEnt t11NsInfoSubsetTable;

                /** Registered Port Information*/
                public final T11NsRegTableEnt t11NsRegTable;

                /** Registered FC-4 Descriptors*/
                public final T11NsRegFc4DescriptorTableEnt t11NsRegFc4DescriptorTable;

                /** Reject information objects*/
                public final T11NsRejectTableEnt t11NsRejectTable;

                private T11NsStatusEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                {
                    super(mib, parent, "t11NsStatus", "1.3.6.1.2.1.135.1.1", false, false, false, false);
                    this.t11NsInfoSubsetTable = new T11NsInfoSubsetTableEnt(mib, this);
                    this.t11NsRegTable = new T11NsRegTableEnt(mib, this);
                    this.t11NsRegFc4DescriptorTable = new T11NsRegFc4DescriptorTableEnt(mib, this);
                    this.t11NsRejectTable = new T11NsRejectTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11NsInfoSubsetTable,
                        this.t11NsRegTable,
                        this.t11NsRegFc4DescriptorTable,
                        this.t11NsRejectTable
                    };
                }
                public static final class T11NsInfoSubsetTableEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                {
                    public final T11NsInfoSubsetEntryEnt t11NsInfoSubsetEntry;

                    private T11NsInfoSubsetTableEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11NsInfoSubsetTable", "1.3.6.1.2.1.135.1.1.1", false, true, false, false);
                        this.t11NsInfoSubsetEntry = new T11NsInfoSubsetEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11NsInfoSubsetEntry
                        };
                    }
                    public static final class T11NsInfoSubsetEntryEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                    {
                        public final T11NsInfoSubsetIndexEnt t11NsInfoSubsetIndex;

                        public final T11NsInfoSubsetSwitchIndexEnt t11NsInfoSubsetSwitchIndex;

                        public final T11NsInfoSubsetTableLastChangeEnt t11NsInfoSubsetTableLastChange;

                        public final T11NsInfoSubsetNumRowsEnt t11NsInfoSubsetNumRows;

                        public final T11NsInfoSubsetTotalRejectsEnt t11NsInfoSubsetTotalRejects;

                        public final T11NsInfoSubsetRejReqNotfyEnableEnt t11NsInfoSubsetRejReqNotfyEnable;

                        private T11NsInfoSubsetEntryEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11NsInfoSubsetEntry", "1.3.6.1.2.1.135.1.1.1.1", false, false, false, true);
                            this.t11NsInfoSubsetIndex = new T11NsInfoSubsetIndexEnt(mib, this);
                            this.t11NsInfoSubsetSwitchIndex = new T11NsInfoSubsetSwitchIndexEnt(mib, this);
                            this.t11NsInfoSubsetTableLastChange = new T11NsInfoSubsetTableLastChangeEnt(mib, this);
                            this.t11NsInfoSubsetNumRows = new T11NsInfoSubsetNumRowsEnt(mib, this);
                            this.t11NsInfoSubsetTotalRejects = new T11NsInfoSubsetTotalRejectsEnt(mib, this);
                            this.t11NsInfoSubsetRejReqNotfyEnable = new T11NsInfoSubsetRejReqNotfyEnableEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11NsInfoSubsetIndex,
                                this.t11NsInfoSubsetSwitchIndex,
                                this.t11NsInfoSubsetTableLastChange,
                                this.t11NsInfoSubsetNumRows,
                                this.t11NsInfoSubsetTotalRejects,
                                this.t11NsInfoSubsetRejReqNotfyEnable
                            };
                        }
                        public static final class T11NsInfoSubsetIndexEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsInfoSubsetIndexEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsInfoSubsetIndex", "1.3.6.1.2.1.135.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsInfoSubsetSwitchIndexEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsInfoSubsetSwitchIndexEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsInfoSubsetSwitchIndex", "1.3.6.1.2.1.135.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsInfoSubsetTableLastChangeEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsInfoSubsetTableLastChangeEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsInfoSubsetTableLastChange", "1.3.6.1.2.1.135.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsInfoSubsetNumRowsEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsInfoSubsetNumRowsEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsInfoSubsetNumRows", "1.3.6.1.2.1.135.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsInfoSubsetTotalRejectsEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsInfoSubsetTotalRejectsEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsInfoSubsetTotalRejects", "1.3.6.1.2.1.135.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsInfoSubsetRejReqNotfyEnableEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsInfoSubsetRejReqNotfyEnableEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsInfoSubsetRejReqNotfyEnable", "1.3.6.1.2.1.135.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11NsRegTableEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                {
                    public final T11NsRegEntryEnt t11NsRegEntry;

                    private T11NsRegTableEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11NsRegTable", "1.3.6.1.2.1.135.1.1.2", false, true, false, false);
                        this.t11NsRegEntry = new T11NsRegEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11NsRegEntry
                        };
                    }
                    public static final class T11NsRegEntryEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                    {
                        public final T11NsRegFabricIndexEnt t11NsRegFabricIndex;

                        public final T11NsRegPortIdentifierEnt t11NsRegPortIdentifier;

                        public final T11NsRegPortNameEnt t11NsRegPortName;

                        public final T11NsRegNodeNameEnt t11NsRegNodeName;

                        public final T11NsRegClassOfSvcEnt t11NsRegClassOfSvc;

                        public final T11NsRegNodeIpAddressEnt t11NsRegNodeIpAddress;

                        public final T11NsRegProcAssocEnt t11NsRegProcAssoc;

                        public final T11NsRegFc4TypeEnt t11NsRegFc4Type;

                        /** 'unknown', see [FC-MGMT]*/
                        public final T11NsRegPortTypeEnt t11NsRegPortType;

                        public final T11NsRegPortIpAddressEnt t11NsRegPortIpAddress;

                        public final T11NsRegFabricPortNameEnt t11NsRegFabricPortName;

                        public final T11NsRegHardAddressEnt t11NsRegHardAddress;

                        public final T11NsRegSymbolicPortNameEnt t11NsRegSymbolicPortName;

                        public final T11NsRegSymbolicNodeNameEnt t11NsRegSymbolicNodeName;

                        public final T11NsRegFc4FeaturesEnt t11NsRegFc4Features;

                        private T11NsRegEntryEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11NsRegEntry", "1.3.6.1.2.1.135.1.1.2.1", false, false, false, true);
                            this.t11NsRegFabricIndex = new T11NsRegFabricIndexEnt(mib, this);
                            this.t11NsRegPortIdentifier = new T11NsRegPortIdentifierEnt(mib, this);
                            this.t11NsRegPortName = new T11NsRegPortNameEnt(mib, this);
                            this.t11NsRegNodeName = new T11NsRegNodeNameEnt(mib, this);
                            this.t11NsRegClassOfSvc = new T11NsRegClassOfSvcEnt(mib, this);
                            this.t11NsRegNodeIpAddress = new T11NsRegNodeIpAddressEnt(mib, this);
                            this.t11NsRegProcAssoc = new T11NsRegProcAssocEnt(mib, this);
                            this.t11NsRegFc4Type = new T11NsRegFc4TypeEnt(mib, this);
                            this.t11NsRegPortType = new T11NsRegPortTypeEnt(mib, this);
                            this.t11NsRegPortIpAddress = new T11NsRegPortIpAddressEnt(mib, this);
                            this.t11NsRegFabricPortName = new T11NsRegFabricPortNameEnt(mib, this);
                            this.t11NsRegHardAddress = new T11NsRegHardAddressEnt(mib, this);
                            this.t11NsRegSymbolicPortName = new T11NsRegSymbolicPortNameEnt(mib, this);
                            this.t11NsRegSymbolicNodeName = new T11NsRegSymbolicNodeNameEnt(mib, this);
                            this.t11NsRegFc4Features = new T11NsRegFc4FeaturesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11NsRegFabricIndex,
                                this.t11NsRegPortIdentifier,
                                this.t11NsRegPortName,
                                this.t11NsRegNodeName,
                                this.t11NsRegClassOfSvc,
                                this.t11NsRegNodeIpAddress,
                                this.t11NsRegProcAssoc,
                                this.t11NsRegFc4Type,
                                this.t11NsRegPortType,
                                this.t11NsRegPortIpAddress,
                                this.t11NsRegFabricPortName,
                                this.t11NsRegHardAddress,
                                this.t11NsRegSymbolicPortName,
                                this.t11NsRegSymbolicNodeName,
                                this.t11NsRegFc4Features
                            };
                        }
                        public static final class T11NsRegFabricIndexEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRegFabricIndexEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRegFabricIndex", "1.3.6.1.2.1.135.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRegPortIdentifierEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRegPortIdentifierEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRegPortIdentifier", "1.3.6.1.2.1.135.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRegPortNameEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRegPortNameEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRegPortName", "1.3.6.1.2.1.135.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRegNodeNameEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRegNodeNameEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRegNodeName", "1.3.6.1.2.1.135.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRegClassOfSvcEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRegClassOfSvcEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRegClassOfSvc", "1.3.6.1.2.1.135.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRegNodeIpAddressEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRegNodeIpAddressEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRegNodeIpAddress", "1.3.6.1.2.1.135.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRegProcAssocEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRegProcAssocEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRegProcAssoc", "1.3.6.1.2.1.135.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRegFc4TypeEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRegFc4TypeEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRegFc4Type", "1.3.6.1.2.1.135.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRegPortTypeEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRegPortTypeEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRegPortType", "1.3.6.1.2.1.135.1.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRegPortIpAddressEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRegPortIpAddressEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRegPortIpAddress", "1.3.6.1.2.1.135.1.1.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRegFabricPortNameEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRegFabricPortNameEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRegFabricPortName", "1.3.6.1.2.1.135.1.1.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRegHardAddressEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRegHardAddressEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRegHardAddress", "1.3.6.1.2.1.135.1.1.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRegSymbolicPortNameEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRegSymbolicPortNameEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRegSymbolicPortName", "1.3.6.1.2.1.135.1.1.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRegSymbolicNodeNameEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRegSymbolicNodeNameEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRegSymbolicNodeName", "1.3.6.1.2.1.135.1.1.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRegFc4FeaturesEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRegFc4FeaturesEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRegFc4Features", "1.3.6.1.2.1.135.1.1.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11NsRegFc4DescriptorTableEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                {
                    public final T11NsRegFc4DescriptorEntryEnt t11NsRegFc4DescriptorEntry;

                    private T11NsRegFc4DescriptorTableEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11NsRegFc4DescriptorTable", "1.3.6.1.2.1.135.1.1.3", false, true, false, false);
                        this.t11NsRegFc4DescriptorEntry = new T11NsRegFc4DescriptorEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11NsRegFc4DescriptorEntry
                        };
                    }
                    public static final class T11NsRegFc4DescriptorEntryEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                    {
                        public final T11NsRegFc4TypeValueEnt t11NsRegFc4TypeValue;

                        public final T11NsRegFc4DescriptorEnt t11NsRegFc4Descriptor;

                        private T11NsRegFc4DescriptorEntryEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11NsRegFc4DescriptorEntry", "1.3.6.1.2.1.135.1.1.3.1", false, false, false, true);
                            this.t11NsRegFc4TypeValue = new T11NsRegFc4TypeValueEnt(mib, this);
                            this.t11NsRegFc4Descriptor = new T11NsRegFc4DescriptorEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11NsRegFc4TypeValue,
                                this.t11NsRegFc4Descriptor
                            };
                        }
                        public static final class T11NsRegFc4TypeValueEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRegFc4TypeValueEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRegFc4TypeValue", "1.3.6.1.2.1.135.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRegFc4DescriptorEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRegFc4DescriptorEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRegFc4Descriptor", "1.3.6.1.2.1.135.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11NsRejectTableEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                {
                    public final T11NsRejectEntryEnt t11NsRejectEntry;

                    private T11NsRejectTableEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11NsRejectTable", "1.3.6.1.2.1.135.1.1.4", false, true, false, false);
                        this.t11NsRejectEntry = new T11NsRejectEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11NsRejectEntry
                        };
                    }
                    public static final class T11NsRejectEntryEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                    {
                        public final T11NsRejectCtCommandStringEnt t11NsRejectCtCommandString;

                        public final T11NsRejectReasonCodeEnt t11NsRejectReasonCode;

                        public final T11NsRejReasonCodeExpEnt t11NsRejReasonCodeExp;

                        public final T11NsRejReasonVendorCodeEnt t11NsRejReasonVendorCode;

                        private T11NsRejectEntryEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11NsRejectEntry", "1.3.6.1.2.1.135.1.1.4.1", false, false, false, true);
                            this.t11NsRejectCtCommandString = new T11NsRejectCtCommandStringEnt(mib, this);
                            this.t11NsRejectReasonCode = new T11NsRejectReasonCodeEnt(mib, this);
                            this.t11NsRejReasonCodeExp = new T11NsRejReasonCodeExpEnt(mib, this);
                            this.t11NsRejReasonVendorCode = new T11NsRejReasonVendorCodeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11NsRejectCtCommandString,
                                this.t11NsRejectReasonCode,
                                this.t11NsRejReasonCodeExp,
                                this.t11NsRejReasonVendorCode
                            };
                        }
                        public static final class T11NsRejectCtCommandStringEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRejectCtCommandStringEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRejectCtCommandString", "1.3.6.1.2.1.135.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRejectReasonCodeEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRejectReasonCodeEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRejectReasonCode", "1.3.6.1.2.1.135.1.1.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRejReasonCodeExpEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRejReasonCodeExpEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRejReasonCodeExp", "1.3.6.1.2.1.135.1.1.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRejReasonVendorCodeEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRejReasonVendorCodeEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRejReasonVendorCode", "1.3.6.1.2.1.135.1.1.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class T11NsStatisticsEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
            {
                /** Name Server per-Fabric Statistics*/
                public final T11NsStatsTableEnt t11NsStatsTable;

                private T11NsStatisticsEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                {
                    super(mib, parent, "t11NsStatistics", "1.3.6.1.2.1.135.1.2", false, false, false, false);
                    this.t11NsStatsTable = new T11NsStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11NsStatsTable
                    };
                }
                public static final class T11NsStatsTableEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                {
                    public final T11NsStatsEntryEnt t11NsStatsEntry;

                    private T11NsStatsTableEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11NsStatsTable", "1.3.6.1.2.1.135.1.2.1", false, true, false, false);
                        this.t11NsStatsEntry = new T11NsStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11NsStatsEntry
                        };
                    }
                    public static final class T11NsStatsEntryEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                    {
                        public final T11NsInGetReqsEnt t11NsInGetReqs;

                        public final T11NsOutGetReqsEnt t11NsOutGetReqs;

                        public final T11NsInRegReqsEnt t11NsInRegReqs;

                        public final T11NsInDeRegReqsEnt t11NsInDeRegReqs;

                        public final T11NsInRscnsEnt t11NsInRscns;

                        public final T11NsOutRscnsEnt t11NsOutRscns;

                        public final T11NsRejectsEnt t11NsRejects;

                        public final T11NsDatabaseFullEnt t11NsDatabaseFull;

                        private T11NsStatsEntryEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                        {
                            super(mib, parent, "t11NsStatsEntry", "1.3.6.1.2.1.135.1.2.1.1", false, false, false, true);
                            this.t11NsInGetReqs = new T11NsInGetReqsEnt(mib, this);
                            this.t11NsOutGetReqs = new T11NsOutGetReqsEnt(mib, this);
                            this.t11NsInRegReqs = new T11NsInRegReqsEnt(mib, this);
                            this.t11NsInDeRegReqs = new T11NsInDeRegReqsEnt(mib, this);
                            this.t11NsInRscns = new T11NsInRscnsEnt(mib, this);
                            this.t11NsOutRscns = new T11NsOutRscnsEnt(mib, this);
                            this.t11NsRejects = new T11NsRejectsEnt(mib, this);
                            this.t11NsDatabaseFull = new T11NsDatabaseFullEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11NsInGetReqs,
                                this.t11NsOutGetReqs,
                                this.t11NsInRegReqs,
                                this.t11NsInDeRegReqs,
                                this.t11NsInRscns,
                                this.t11NsOutRscns,
                                this.t11NsRejects,
                                this.t11NsDatabaseFull
                            };
                        }
                        public static final class T11NsInGetReqsEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsInGetReqsEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsInGetReqs", "1.3.6.1.2.1.135.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsOutGetReqsEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsOutGetReqsEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsOutGetReqs", "1.3.6.1.2.1.135.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsInRegReqsEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsInRegReqsEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsInRegReqs", "1.3.6.1.2.1.135.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsInDeRegReqsEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsInDeRegReqsEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsInDeRegReqs", "1.3.6.1.2.1.135.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsInRscnsEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsInRscnsEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsInRscns", "1.3.6.1.2.1.135.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsOutRscnsEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsOutRscnsEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsOutRscns", "1.3.6.1.2.1.135.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsRejectsEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsRejectsEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsRejects", "1.3.6.1.2.1.135.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11NsDatabaseFullEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                        {
                            private T11NsDatabaseFullEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                            {
                                super(mib, parent, "t11NsDatabaseFull", "1.3.6.1.2.1.135.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class T11NsMIBConformanceEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
        {
            /** Conformance*/
            public final T11NsMIBCompliancesEnt t11NsMIBCompliances;

            public final T11NsMIBGroupsEnt t11NsMIBGroups;

            private T11NsMIBConformanceEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
            {
                super(mib, parent, "t11NsMIBConformance", "1.3.6.1.2.1.135.2", false, false, false, false);
                this.t11NsMIBCompliances = new T11NsMIBCompliancesEnt(mib, this);
                this.t11NsMIBGroups = new T11NsMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11NsMIBCompliances,
                    this.t11NsMIBGroups
                };
            }
            public static final class T11NsMIBCompliancesEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
            {
                public final T11NsMIBComplianceEnt t11NsMIBCompliance;

                private T11NsMIBCompliancesEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                {
                    super(mib, parent, "t11NsMIBCompliances", "1.3.6.1.2.1.135.2.1", false, false, false, false);
                    this.t11NsMIBCompliance = new T11NsMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11NsMIBCompliance
                    };
                }
                public static final class T11NsMIBComplianceEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                {
                    private T11NsMIBComplianceEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11NsMIBCompliance", "1.3.6.1.2.1.135.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class T11NsMIBGroupsEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
            {
                /** Units of conformance*/
                public final T11NsDBGroupEnt t11NsDBGroup;

                public final T11NsRequestStatsGroupEnt t11NsRequestStatsGroup;

                public final T11NsRscnStatsGroupEnt t11NsRscnStatsGroup;

                public final T11NsRejectStatsGroupEnt t11NsRejectStatsGroup;

                public final T11NsNotifyControlGroupEnt t11NsNotifyControlGroup;

                public final T11NsNotifyGroupEnt t11NsNotifyGroup;

                private T11NsMIBGroupsEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                {
                    super(mib, parent, "t11NsMIBGroups", "1.3.6.1.2.1.135.2.2", false, false, false, false);
                    this.t11NsDBGroup = new T11NsDBGroupEnt(mib, this);
                    this.t11NsRequestStatsGroup = new T11NsRequestStatsGroupEnt(mib, this);
                    this.t11NsRscnStatsGroup = new T11NsRscnStatsGroupEnt(mib, this);
                    this.t11NsRejectStatsGroup = new T11NsRejectStatsGroupEnt(mib, this);
                    this.t11NsNotifyControlGroup = new T11NsNotifyControlGroupEnt(mib, this);
                    this.t11NsNotifyGroup = new T11NsNotifyGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11NsDBGroup,
                        this.t11NsRequestStatsGroup,
                        this.t11NsRscnStatsGroup,
                        this.t11NsRejectStatsGroup,
                        this.t11NsNotifyControlGroup,
                        this.t11NsNotifyGroup
                    };
                }
                public static final class T11NsDBGroupEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                {
                    private T11NsDBGroupEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11NsDBGroup", "1.3.6.1.2.1.135.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11NsRequestStatsGroupEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                {
                    private T11NsRequestStatsGroupEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11NsRequestStatsGroup", "1.3.6.1.2.1.135.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11NsRscnStatsGroupEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                {
                    private T11NsRscnStatsGroupEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11NsRscnStatsGroup", "1.3.6.1.2.1.135.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11NsRejectStatsGroupEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                {
                    private T11NsRejectStatsGroupEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11NsRejectStatsGroup", "1.3.6.1.2.1.135.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11NsNotifyControlGroupEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                {
                    private T11NsNotifyControlGroupEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11NsNotifyControlGroup", "1.3.6.1.2.1.135.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11NsNotifyGroupEnt extends MIBEntry<T11FCNAMESERVERMIBDef>
                {
                    private T11NsNotifyGroupEnt(T11FCNAMESERVERMIBDef mib, MIBEntry<T11FCNAMESERVERMIBDef> parent)
                    {
                        super(mib, parent, "t11NsNotifyGroup", "1.3.6.1.2.1.135.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
