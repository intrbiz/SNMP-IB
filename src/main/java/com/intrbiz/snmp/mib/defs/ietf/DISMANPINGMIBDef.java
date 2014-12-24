package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**RFC2578
RFC2579
RFC2580
RFC2863
RFC3411*/
public final class DISMANPINGMIBDef extends MIB
{
    public static final DISMANPINGMIBDef DISMANPINGMIB = new DISMANPINGMIBDef();

    /** RFC4001

13 June 2006*/
    public final PingMIBEnt pingMIB;

    private DISMANPINGMIBDef()
    {
        super("DISMAN-PING-MIB");
        this.pingMIB = new PingMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.pingMIB
        };
    }

    public static final class PingMIBEnt extends MIBEntry<DISMANPINGMIBDef>
    {
        /** Top level structure of the MIB*/
        public final PingNotificationsEnt pingNotifications;

        public final PingObjectsEnt pingObjects;

        public final PingConformanceEnt pingConformance;

        /** The registration node (point) for ping implementation types*/
        public final PingImplementationTypeDomainsEnt pingImplementationTypeDomains;

        private PingMIBEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
        {
            super(mib, parent, "pingMIB", "1.3.6.1.2.1.80", false, false, false, false);
            this.pingNotifications = new PingNotificationsEnt(mib, this);
            this.pingObjects = new PingObjectsEnt(mib, this);
            this.pingConformance = new PingConformanceEnt(mib, this);
            this.pingImplementationTypeDomains = new PingImplementationTypeDomainsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.pingNotifications,
                this.pingObjects,
                this.pingConformance,
                this.pingImplementationTypeDomains
            };
        }
        public static final class PingNotificationsEnt extends MIBEntry<DISMANPINGMIBDef>
        {
            /** Notification Definition section*/
            public final PingProbeFailedEnt pingProbeFailed;

            public final PingTestFailedEnt pingTestFailed;

            public final PingTestCompletedEnt pingTestCompleted;

            private PingNotificationsEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
            {
                super(mib, parent, "pingNotifications", "1.3.6.1.2.1.80.0", false, false, false, false);
                this.pingProbeFailed = new PingProbeFailedEnt(mib, this);
                this.pingTestFailed = new PingTestFailedEnt(mib, this);
                this.pingTestCompleted = new PingTestCompletedEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pingProbeFailed,
                    this.pingTestFailed,
                    this.pingTestCompleted
                };
            }
            public static final class PingProbeFailedEnt extends MIBEntry<DISMANPINGMIBDef>
            {
                private PingProbeFailedEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                {
                    super(mib, parent, "pingProbeFailed", "1.3.6.1.2.1.80.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PingTestFailedEnt extends MIBEntry<DISMANPINGMIBDef>
            {
                private PingTestFailedEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                {
                    super(mib, parent, "pingTestFailed", "1.3.6.1.2.1.80.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PingTestCompletedEnt extends MIBEntry<DISMANPINGMIBDef>
            {
                private PingTestCompletedEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                {
                    super(mib, parent, "pingTestCompleted", "1.3.6.1.2.1.80.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class PingObjectsEnt extends MIBEntry<DISMANPINGMIBDef>
        {
            /** Simple Object Definitions*/
            public final PingMaxConcurrentRequestsEnt pingMaxConcurrentRequests;

            /** Ping Control Table*/
            public final PingCtlTableEnt pingCtlTable;

            /** Ping Results Table*/
            public final PingResultsTableEnt pingResultsTable;

            /** Ping Probe History Table*/
            public final PingProbeHistoryTableEnt pingProbeHistoryTable;

            private PingObjectsEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
            {
                super(mib, parent, "pingObjects", "1.3.6.1.2.1.80.1", false, false, false, false);
                this.pingMaxConcurrentRequests = new PingMaxConcurrentRequestsEnt(mib, this);
                this.pingCtlTable = new PingCtlTableEnt(mib, this);
                this.pingResultsTable = new PingResultsTableEnt(mib, this);
                this.pingProbeHistoryTable = new PingProbeHistoryTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pingMaxConcurrentRequests,
                    this.pingCtlTable,
                    this.pingResultsTable,
                    this.pingProbeHistoryTable
                };
            }
            public static final class PingMaxConcurrentRequestsEnt extends MIBEntry<DISMANPINGMIBDef>
            {
                private PingMaxConcurrentRequestsEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                {
                    super(mib, parent, "pingMaxConcurrentRequests", "1.3.6.1.2.1.80.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PingCtlTableEnt extends MIBEntry<DISMANPINGMIBDef>
            {
                public final PingCtlEntryEnt pingCtlEntry;

                private PingCtlTableEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                {
                    super(mib, parent, "pingCtlTable", "1.3.6.1.2.1.80.1.2", false, true, false, false);
                    this.pingCtlEntry = new PingCtlEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pingCtlEntry
                    };
                }
                public static final class PingCtlEntryEnt extends MIBEntry<DISMANPINGMIBDef>
                {
                    public final PingCtlOwnerIndexEnt pingCtlOwnerIndex;

                    public final PingCtlTestNameEnt pingCtlTestName;

                    public final PingCtlTargetAddressTypeEnt pingCtlTargetAddressType;

                    public final PingCtlTargetAddressEnt pingCtlTargetAddress;

                    public final PingCtlDataSizeEnt pingCtlDataSize;

                    public final PingCtlTimeOutEnt pingCtlTimeOut;

                    public final PingCtlProbeCountEnt pingCtlProbeCount;

                    public final PingCtlAdminStatusEnt pingCtlAdminStatus;

                    public final PingCtlDataFillEnt pingCtlDataFill;

                    public final PingCtlFrequencyEnt pingCtlFrequency;

                    public final PingCtlMaxRowsEnt pingCtlMaxRows;

                    public final PingCtlStorageTypeEnt pingCtlStorageType;

                    /** no bits set.*/
                    public final PingCtlTrapGenerationEnt pingCtlTrapGeneration;

                    public final PingCtlTrapProbeFailureFilterEnt pingCtlTrapProbeFailureFilter;

                    public final PingCtlTrapTestFailureFilterEnt pingCtlTrapTestFailureFilter;

                    public final PingCtlTypeEnt pingCtlType;

                    public final PingCtlDescrEnt pingCtlDescr;

                    public final PingCtlSourceAddressTypeEnt pingCtlSourceAddressType;

                    public final PingCtlSourceAddressEnt pingCtlSourceAddress;

                    public final PingCtlIfIndexEnt pingCtlIfIndex;

                    public final PingCtlByPassRouteTableEnt pingCtlByPassRouteTable;

                    public final PingCtlDSFieldEnt pingCtlDSField;

                    public final PingCtlRowStatusEnt pingCtlRowStatus;

                    private PingCtlEntryEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                    {
                        super(mib, parent, "pingCtlEntry", "1.3.6.1.2.1.80.1.2.1", false, false, false, true);
                        this.pingCtlOwnerIndex = new PingCtlOwnerIndexEnt(mib, this);
                        this.pingCtlTestName = new PingCtlTestNameEnt(mib, this);
                        this.pingCtlTargetAddressType = new PingCtlTargetAddressTypeEnt(mib, this);
                        this.pingCtlTargetAddress = new PingCtlTargetAddressEnt(mib, this);
                        this.pingCtlDataSize = new PingCtlDataSizeEnt(mib, this);
                        this.pingCtlTimeOut = new PingCtlTimeOutEnt(mib, this);
                        this.pingCtlProbeCount = new PingCtlProbeCountEnt(mib, this);
                        this.pingCtlAdminStatus = new PingCtlAdminStatusEnt(mib, this);
                        this.pingCtlDataFill = new PingCtlDataFillEnt(mib, this);
                        this.pingCtlFrequency = new PingCtlFrequencyEnt(mib, this);
                        this.pingCtlMaxRows = new PingCtlMaxRowsEnt(mib, this);
                        this.pingCtlStorageType = new PingCtlStorageTypeEnt(mib, this);
                        this.pingCtlTrapGeneration = new PingCtlTrapGenerationEnt(mib, this);
                        this.pingCtlTrapProbeFailureFilter = new PingCtlTrapProbeFailureFilterEnt(mib, this);
                        this.pingCtlTrapTestFailureFilter = new PingCtlTrapTestFailureFilterEnt(mib, this);
                        this.pingCtlType = new PingCtlTypeEnt(mib, this);
                        this.pingCtlDescr = new PingCtlDescrEnt(mib, this);
                        this.pingCtlSourceAddressType = new PingCtlSourceAddressTypeEnt(mib, this);
                        this.pingCtlSourceAddress = new PingCtlSourceAddressEnt(mib, this);
                        this.pingCtlIfIndex = new PingCtlIfIndexEnt(mib, this);
                        this.pingCtlByPassRouteTable = new PingCtlByPassRouteTableEnt(mib, this);
                        this.pingCtlDSField = new PingCtlDSFieldEnt(mib, this);
                        this.pingCtlRowStatus = new PingCtlRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pingCtlOwnerIndex,
                            this.pingCtlTestName,
                            this.pingCtlTargetAddressType,
                            this.pingCtlTargetAddress,
                            this.pingCtlDataSize,
                            this.pingCtlTimeOut,
                            this.pingCtlProbeCount,
                            this.pingCtlAdminStatus,
                            this.pingCtlDataFill,
                            this.pingCtlFrequency,
                            this.pingCtlMaxRows,
                            this.pingCtlStorageType,
                            this.pingCtlTrapGeneration,
                            this.pingCtlTrapProbeFailureFilter,
                            this.pingCtlTrapTestFailureFilter,
                            this.pingCtlType,
                            this.pingCtlDescr,
                            this.pingCtlSourceAddressType,
                            this.pingCtlSourceAddress,
                            this.pingCtlIfIndex,
                            this.pingCtlByPassRouteTable,
                            this.pingCtlDSField,
                            this.pingCtlRowStatus
                        };
                    }
                    public static final class PingCtlOwnerIndexEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlOwnerIndexEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlOwnerIndex", "1.3.6.1.2.1.80.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlTestNameEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlTestNameEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlTestName", "1.3.6.1.2.1.80.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlTargetAddressTypeEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlTargetAddressTypeEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlTargetAddressType", "1.3.6.1.2.1.80.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlTargetAddressEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlTargetAddressEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlTargetAddress", "1.3.6.1.2.1.80.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlDataSizeEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlDataSizeEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlDataSize", "1.3.6.1.2.1.80.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlTimeOutEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlTimeOutEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlTimeOut", "1.3.6.1.2.1.80.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlProbeCountEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlProbeCountEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlProbeCount", "1.3.6.1.2.1.80.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlAdminStatusEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlAdminStatusEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlAdminStatus", "1.3.6.1.2.1.80.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlDataFillEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlDataFillEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlDataFill", "1.3.6.1.2.1.80.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlFrequencyEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlFrequencyEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlFrequency", "1.3.6.1.2.1.80.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlMaxRowsEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlMaxRowsEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlMaxRows", "1.3.6.1.2.1.80.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlStorageTypeEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlStorageTypeEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlStorageType", "1.3.6.1.2.1.80.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlTrapGenerationEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlTrapGenerationEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlTrapGeneration", "1.3.6.1.2.1.80.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlTrapProbeFailureFilterEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlTrapProbeFailureFilterEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlTrapProbeFailureFilter", "1.3.6.1.2.1.80.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlTrapTestFailureFilterEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlTrapTestFailureFilterEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlTrapTestFailureFilter", "1.3.6.1.2.1.80.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlTypeEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlTypeEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlType", "1.3.6.1.2.1.80.1.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlDescrEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlDescrEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlDescr", "1.3.6.1.2.1.80.1.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlSourceAddressTypeEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlSourceAddressTypeEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlSourceAddressType", "1.3.6.1.2.1.80.1.2.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlSourceAddressEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlSourceAddressEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlSourceAddress", "1.3.6.1.2.1.80.1.2.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlIfIndexEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlIfIndexEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlIfIndex", "1.3.6.1.2.1.80.1.2.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlByPassRouteTableEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlByPassRouteTableEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlByPassRouteTable", "1.3.6.1.2.1.80.1.2.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlDSFieldEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlDSFieldEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlDSField", "1.3.6.1.2.1.80.1.2.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingCtlRowStatusEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingCtlRowStatusEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingCtlRowStatus", "1.3.6.1.2.1.80.1.2.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PingResultsTableEnt extends MIBEntry<DISMANPINGMIBDef>
            {
                public final PingResultsEntryEnt pingResultsEntry;

                private PingResultsTableEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                {
                    super(mib, parent, "pingResultsTable", "1.3.6.1.2.1.80.1.3", false, true, false, false);
                    this.pingResultsEntry = new PingResultsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pingResultsEntry
                    };
                }
                public static final class PingResultsEntryEnt extends MIBEntry<DISMANPINGMIBDef>
                {
                    public final PingResultsOperStatusEnt pingResultsOperStatus;

                    public final PingResultsIpTargetAddressTypeEnt pingResultsIpTargetAddressType;

                    public final PingResultsIpTargetAddressEnt pingResultsIpTargetAddress;

                    public final PingResultsMinRttEnt pingResultsMinRtt;

                    public final PingResultsMaxRttEnt pingResultsMaxRtt;

                    public final PingResultsAverageRttEnt pingResultsAverageRtt;

                    public final PingResultsProbeResponsesEnt pingResultsProbeResponses;

                    public final PingResultsSentProbesEnt pingResultsSentProbes;

                    public final PingResultsRttSumOfSquaresEnt pingResultsRttSumOfSquares;

                    public final PingResultsLastGoodProbeEnt pingResultsLastGoodProbe;

                    private PingResultsEntryEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                    {
                        super(mib, parent, "pingResultsEntry", "1.3.6.1.2.1.80.1.3.1", false, false, false, true);
                        this.pingResultsOperStatus = new PingResultsOperStatusEnt(mib, this);
                        this.pingResultsIpTargetAddressType = new PingResultsIpTargetAddressTypeEnt(mib, this);
                        this.pingResultsIpTargetAddress = new PingResultsIpTargetAddressEnt(mib, this);
                        this.pingResultsMinRtt = new PingResultsMinRttEnt(mib, this);
                        this.pingResultsMaxRtt = new PingResultsMaxRttEnt(mib, this);
                        this.pingResultsAverageRtt = new PingResultsAverageRttEnt(mib, this);
                        this.pingResultsProbeResponses = new PingResultsProbeResponsesEnt(mib, this);
                        this.pingResultsSentProbes = new PingResultsSentProbesEnt(mib, this);
                        this.pingResultsRttSumOfSquares = new PingResultsRttSumOfSquaresEnt(mib, this);
                        this.pingResultsLastGoodProbe = new PingResultsLastGoodProbeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pingResultsOperStatus,
                            this.pingResultsIpTargetAddressType,
                            this.pingResultsIpTargetAddress,
                            this.pingResultsMinRtt,
                            this.pingResultsMaxRtt,
                            this.pingResultsAverageRtt,
                            this.pingResultsProbeResponses,
                            this.pingResultsSentProbes,
                            this.pingResultsRttSumOfSquares,
                            this.pingResultsLastGoodProbe
                        };
                    }
                    public static final class PingResultsOperStatusEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingResultsOperStatusEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingResultsOperStatus", "1.3.6.1.2.1.80.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingResultsIpTargetAddressTypeEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingResultsIpTargetAddressTypeEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingResultsIpTargetAddressType", "1.3.6.1.2.1.80.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingResultsIpTargetAddressEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingResultsIpTargetAddressEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingResultsIpTargetAddress", "1.3.6.1.2.1.80.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingResultsMinRttEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingResultsMinRttEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingResultsMinRtt", "1.3.6.1.2.1.80.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingResultsMaxRttEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingResultsMaxRttEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingResultsMaxRtt", "1.3.6.1.2.1.80.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingResultsAverageRttEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingResultsAverageRttEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingResultsAverageRtt", "1.3.6.1.2.1.80.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingResultsProbeResponsesEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingResultsProbeResponsesEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingResultsProbeResponses", "1.3.6.1.2.1.80.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingResultsSentProbesEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingResultsSentProbesEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingResultsSentProbes", "1.3.6.1.2.1.80.1.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingResultsRttSumOfSquaresEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingResultsRttSumOfSquaresEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingResultsRttSumOfSquares", "1.3.6.1.2.1.80.1.3.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingResultsLastGoodProbeEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingResultsLastGoodProbeEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingResultsLastGoodProbe", "1.3.6.1.2.1.80.1.3.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PingProbeHistoryTableEnt extends MIBEntry<DISMANPINGMIBDef>
            {
                public final PingProbeHistoryEntryEnt pingProbeHistoryEntry;

                private PingProbeHistoryTableEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                {
                    super(mib, parent, "pingProbeHistoryTable", "1.3.6.1.2.1.80.1.4", false, true, false, false);
                    this.pingProbeHistoryEntry = new PingProbeHistoryEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pingProbeHistoryEntry
                    };
                }
                public static final class PingProbeHistoryEntryEnt extends MIBEntry<DISMANPINGMIBDef>
                {
                    public final PingProbeHistoryIndexEnt pingProbeHistoryIndex;

                    public final PingProbeHistoryResponseEnt pingProbeHistoryResponse;

                    public final PingProbeHistoryStatusEnt pingProbeHistoryStatus;

                    public final PingProbeHistoryLastRCEnt pingProbeHistoryLastRC;

                    public final PingProbeHistoryTimeEnt pingProbeHistoryTime;

                    private PingProbeHistoryEntryEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                    {
                        super(mib, parent, "pingProbeHistoryEntry", "1.3.6.1.2.1.80.1.4.1", false, false, false, true);
                        this.pingProbeHistoryIndex = new PingProbeHistoryIndexEnt(mib, this);
                        this.pingProbeHistoryResponse = new PingProbeHistoryResponseEnt(mib, this);
                        this.pingProbeHistoryStatus = new PingProbeHistoryStatusEnt(mib, this);
                        this.pingProbeHistoryLastRC = new PingProbeHistoryLastRCEnt(mib, this);
                        this.pingProbeHistoryTime = new PingProbeHistoryTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pingProbeHistoryIndex,
                            this.pingProbeHistoryResponse,
                            this.pingProbeHistoryStatus,
                            this.pingProbeHistoryLastRC,
                            this.pingProbeHistoryTime
                        };
                    }
                    public static final class PingProbeHistoryIndexEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingProbeHistoryIndexEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingProbeHistoryIndex", "1.3.6.1.2.1.80.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingProbeHistoryResponseEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingProbeHistoryResponseEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingProbeHistoryResponse", "1.3.6.1.2.1.80.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingProbeHistoryStatusEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingProbeHistoryStatusEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingProbeHistoryStatus", "1.3.6.1.2.1.80.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingProbeHistoryLastRCEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingProbeHistoryLastRCEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingProbeHistoryLastRC", "1.3.6.1.2.1.80.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PingProbeHistoryTimeEnt extends MIBEntry<DISMANPINGMIBDef>
                    {
                        private PingProbeHistoryTimeEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                        {
                            super(mib, parent, "pingProbeHistoryTime", "1.3.6.1.2.1.80.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PingConformanceEnt extends MIBEntry<DISMANPINGMIBDef>
        {
            /** Conformance information
Compliance statements*/
            public final PingCompliancesEnt pingCompliances;

            public final PingGroupsEnt pingGroups;

            private PingConformanceEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
            {
                super(mib, parent, "pingConformance", "1.3.6.1.2.1.80.2", false, false, false, false);
                this.pingCompliances = new PingCompliancesEnt(mib, this);
                this.pingGroups = new PingGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pingCompliances,
                    this.pingGroups
                };
            }
            public static final class PingCompliancesEnt extends MIBEntry<DISMANPINGMIBDef>
            {
                /** Compliance statements*/
                public final PingFullComplianceEnt pingFullCompliance;

                public final PingMinimumComplianceEnt pingMinimumCompliance;

                public final PingComplianceEnt pingCompliance;

                private PingCompliancesEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                {
                    super(mib, parent, "pingCompliances", "1.3.6.1.2.1.80.2.1", false, false, false, false);
                    this.pingFullCompliance = new PingFullComplianceEnt(mib, this);
                    this.pingMinimumCompliance = new PingMinimumComplianceEnt(mib, this);
                    this.pingCompliance = new PingComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pingFullCompliance,
                        this.pingMinimumCompliance,
                        this.pingCompliance
                    };
                }
                public static final class PingFullComplianceEnt extends MIBEntry<DISMANPINGMIBDef>
                {
                    private PingFullComplianceEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                    {
                        super(mib, parent, "pingFullCompliance", "1.3.6.1.2.1.80.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PingMinimumComplianceEnt extends MIBEntry<DISMANPINGMIBDef>
                {
                    private PingMinimumComplianceEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                    {
                        super(mib, parent, "pingMinimumCompliance", "1.3.6.1.2.1.80.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PingComplianceEnt extends MIBEntry<DISMANPINGMIBDef>
                {
                    private PingComplianceEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                    {
                        super(mib, parent, "pingCompliance", "1.3.6.1.2.1.80.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class PingGroupsEnt extends MIBEntry<DISMANPINGMIBDef>
            {
                /** MIB groupings*/
                public final PingMinimumGroupEnt pingMinimumGroup;

                public final PingCtlRowStatusGroupEnt pingCtlRowStatusGroup;

                public final PingHistoryGroupEnt pingHistoryGroup;

                public final PingNotificationsGroupEnt pingNotificationsGroup;

                public final PingGroupEnt pingGroup;

                public final PingTimeStampGroupEnt pingTimeStampGroup;

                private PingGroupsEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                {
                    super(mib, parent, "pingGroups", "1.3.6.1.2.1.80.2.2", false, false, false, false);
                    this.pingMinimumGroup = new PingMinimumGroupEnt(mib, this);
                    this.pingCtlRowStatusGroup = new PingCtlRowStatusGroupEnt(mib, this);
                    this.pingHistoryGroup = new PingHistoryGroupEnt(mib, this);
                    this.pingNotificationsGroup = new PingNotificationsGroupEnt(mib, this);
                    this.pingGroup = new PingGroupEnt(mib, this);
                    this.pingTimeStampGroup = new PingTimeStampGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pingMinimumGroup,
                        this.pingCtlRowStatusGroup,
                        this.pingHistoryGroup,
                        this.pingNotificationsGroup,
                        this.pingGroup,
                        this.pingTimeStampGroup
                    };
                }
                public static final class PingMinimumGroupEnt extends MIBEntry<DISMANPINGMIBDef>
                {
                    private PingMinimumGroupEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                    {
                        super(mib, parent, "pingMinimumGroup", "1.3.6.1.2.1.80.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PingCtlRowStatusGroupEnt extends MIBEntry<DISMANPINGMIBDef>
                {
                    private PingCtlRowStatusGroupEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                    {
                        super(mib, parent, "pingCtlRowStatusGroup", "1.3.6.1.2.1.80.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PingHistoryGroupEnt extends MIBEntry<DISMANPINGMIBDef>
                {
                    private PingHistoryGroupEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                    {
                        super(mib, parent, "pingHistoryGroup", "1.3.6.1.2.1.80.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PingNotificationsGroupEnt extends MIBEntry<DISMANPINGMIBDef>
                {
                    private PingNotificationsGroupEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                    {
                        super(mib, parent, "pingNotificationsGroup", "1.3.6.1.2.1.80.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PingGroupEnt extends MIBEntry<DISMANPINGMIBDef>
                {
                    private PingGroupEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                    {
                        super(mib, parent, "pingGroup", "1.3.6.1.2.1.80.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PingTimeStampGroupEnt extends MIBEntry<DISMANPINGMIBDef>
                {
                    private PingTimeStampGroupEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                    {
                        super(mib, parent, "pingTimeStampGroup", "1.3.6.1.2.1.80.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PingImplementationTypeDomainsEnt extends MIBEntry<DISMANPINGMIBDef>
        {
            public final PingIcmpEchoEnt pingIcmpEcho;

            public final PingUdpEchoEnt pingUdpEcho;

            public final PingSnmpQueryEnt pingSnmpQuery;

            public final PingTcpConnectionAttemptEnt pingTcpConnectionAttempt;

            private PingImplementationTypeDomainsEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
            {
                super(mib, parent, "pingImplementationTypeDomains", "1.3.6.1.2.1.80.3", false, false, false, false);
                this.pingIcmpEcho = new PingIcmpEchoEnt(mib, this);
                this.pingUdpEcho = new PingUdpEchoEnt(mib, this);
                this.pingSnmpQuery = new PingSnmpQueryEnt(mib, this);
                this.pingTcpConnectionAttempt = new PingTcpConnectionAttemptEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pingIcmpEcho,
                    this.pingUdpEcho,
                    this.pingSnmpQuery,
                    this.pingTcpConnectionAttempt
                };
            }
            public static final class PingIcmpEchoEnt extends MIBEntry<DISMANPINGMIBDef>
            {
                private PingIcmpEchoEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                {
                    super(mib, parent, "pingIcmpEcho", "1.3.6.1.2.1.80.3.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PingUdpEchoEnt extends MIBEntry<DISMANPINGMIBDef>
            {
                private PingUdpEchoEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                {
                    super(mib, parent, "pingUdpEcho", "1.3.6.1.2.1.80.3.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PingSnmpQueryEnt extends MIBEntry<DISMANPINGMIBDef>
            {
                private PingSnmpQueryEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                {
                    super(mib, parent, "pingSnmpQuery", "1.3.6.1.2.1.80.3.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PingTcpConnectionAttemptEnt extends MIBEntry<DISMANPINGMIBDef>
            {
                private PingTcpConnectionAttemptEnt(DISMANPINGMIBDef mib, MIBEntry<DISMANPINGMIBDef> parent)
                {
                    super(mib, parent, "pingTcpConnectionAttempt", "1.3.6.1.2.1.80.3.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
