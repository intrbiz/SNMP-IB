package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**RFC2578
RFC2579
RFC2580
RFC3411
RFC2863
RFC4001*/
public final class DISMANTRACEROUTEMIBDef extends MIB
{
    public static final DISMANTRACEROUTEMIBDef DISMANTRACEROUTEMIB = new DISMANTRACEROUTEMIBDef();

    /** RFC4560

13 June 2006*/
    public final TraceRouteMIBEnt traceRouteMIB;

    private DISMANTRACEROUTEMIBDef()
    {
        super("DISMAN-TRACEROUTE-MIB");
        this.traceRouteMIB = new TraceRouteMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.traceRouteMIB
        };
    }

    public static final class TraceRouteMIBEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
    {
        /** Top level structure of the MIB*/
        public final TraceRouteNotificationsEnt traceRouteNotifications;

        public final TraceRouteObjectsEnt traceRouteObjects;

        public final TraceRouteConformanceEnt traceRouteConformance;

        /** The registration node (point) for traceroute implementation types*/
        public final TraceRouteImplementationTypeDomainsEnt traceRouteImplementationTypeDomains;

        private TraceRouteMIBEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
        {
            super(mib, parent, "traceRouteMIB", "1.3.6.1.2.1.81", false, false, false, false);
            this.traceRouteNotifications = new TraceRouteNotificationsEnt(mib, this);
            this.traceRouteObjects = new TraceRouteObjectsEnt(mib, this);
            this.traceRouteConformance = new TraceRouteConformanceEnt(mib, this);
            this.traceRouteImplementationTypeDomains = new TraceRouteImplementationTypeDomainsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.traceRouteNotifications,
                this.traceRouteObjects,
                this.traceRouteConformance,
                this.traceRouteImplementationTypeDomains
            };
        }
        public static final class TraceRouteNotificationsEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
        {
            /** Notification Definition section*/
            public final TraceRoutePathChangeEnt traceRoutePathChange;

            public final TraceRouteTestFailedEnt traceRouteTestFailed;

            public final TraceRouteTestCompletedEnt traceRouteTestCompleted;

            private TraceRouteNotificationsEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
            {
                super(mib, parent, "traceRouteNotifications", "1.3.6.1.2.1.81.0", false, false, false, false);
                this.traceRoutePathChange = new TraceRoutePathChangeEnt(mib, this);
                this.traceRouteTestFailed = new TraceRouteTestFailedEnt(mib, this);
                this.traceRouteTestCompleted = new TraceRouteTestCompletedEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.traceRoutePathChange,
                    this.traceRouteTestFailed,
                    this.traceRouteTestCompleted
                };
            }
            public static final class TraceRoutePathChangeEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
            {
                private TraceRoutePathChangeEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                {
                    super(mib, parent, "traceRoutePathChange", "1.3.6.1.2.1.81.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TraceRouteTestFailedEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
            {
                private TraceRouteTestFailedEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                {
                    super(mib, parent, "traceRouteTestFailed", "1.3.6.1.2.1.81.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TraceRouteTestCompletedEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
            {
                private TraceRouteTestCompletedEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                {
                    super(mib, parent, "traceRouteTestCompleted", "1.3.6.1.2.1.81.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class TraceRouteObjectsEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
        {
            /** Simple Object Definitions*/
            public final TraceRouteMaxConcurrentRequestsEnt traceRouteMaxConcurrentRequests;

            /** Traceroute Control Table*/
            public final TraceRouteCtlTableEnt traceRouteCtlTable;

            /** Traceroute Results Table*/
            public final TraceRouteResultsTableEnt traceRouteResultsTable;

            /** Trace Route Probe History Table*/
            public final TraceRouteProbeHistoryTableEnt traceRouteProbeHistoryTable;

            /** Traceroute Hop Results Table*/
            public final TraceRouteHopsTableEnt traceRouteHopsTable;

            private TraceRouteObjectsEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
            {
                super(mib, parent, "traceRouteObjects", "1.3.6.1.2.1.81.1", false, false, false, false);
                this.traceRouteMaxConcurrentRequests = new TraceRouteMaxConcurrentRequestsEnt(mib, this);
                this.traceRouteCtlTable = new TraceRouteCtlTableEnt(mib, this);
                this.traceRouteResultsTable = new TraceRouteResultsTableEnt(mib, this);
                this.traceRouteProbeHistoryTable = new TraceRouteProbeHistoryTableEnt(mib, this);
                this.traceRouteHopsTable = new TraceRouteHopsTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.traceRouteMaxConcurrentRequests,
                    this.traceRouteCtlTable,
                    this.traceRouteResultsTable,
                    this.traceRouteProbeHistoryTable,
                    this.traceRouteHopsTable
                };
            }
            public static final class TraceRouteMaxConcurrentRequestsEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
            {
                private TraceRouteMaxConcurrentRequestsEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                {
                    super(mib, parent, "traceRouteMaxConcurrentRequests", "1.3.6.1.2.1.81.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TraceRouteCtlTableEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
            {
                public final TraceRouteCtlEntryEnt traceRouteCtlEntry;

                private TraceRouteCtlTableEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                {
                    super(mib, parent, "traceRouteCtlTable", "1.3.6.1.2.1.81.1.2", false, true, false, false);
                    this.traceRouteCtlEntry = new TraceRouteCtlEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.traceRouteCtlEntry
                    };
                }
                public static final class TraceRouteCtlEntryEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                {
                    public final TraceRouteCtlOwnerIndexEnt traceRouteCtlOwnerIndex;

                    public final TraceRouteCtlTestNameEnt traceRouteCtlTestName;

                    public final TraceRouteCtlTargetAddressTypeEnt traceRouteCtlTargetAddressType;

                    public final TraceRouteCtlTargetAddressEnt traceRouteCtlTargetAddress;

                    public final TraceRouteCtlByPassRouteTableEnt traceRouteCtlByPassRouteTable;

                    public final TraceRouteCtlDataSizeEnt traceRouteCtlDataSize;

                    public final TraceRouteCtlTimeOutEnt traceRouteCtlTimeOut;

                    public final TraceRouteCtlProbesPerHopEnt traceRouteCtlProbesPerHop;

                    public final TraceRouteCtlPortEnt traceRouteCtlPort;

                    public final TraceRouteCtlMaxTtlEnt traceRouteCtlMaxTtl;

                    public final TraceRouteCtlDSFieldEnt traceRouteCtlDSField;

                    public final TraceRouteCtlSourceAddressTypeEnt traceRouteCtlSourceAddressType;

                    public final TraceRouteCtlSourceAddressEnt traceRouteCtlSourceAddress;

                    public final TraceRouteCtlIfIndexEnt traceRouteCtlIfIndex;

                    public final TraceRouteCtlMiscOptionsEnt traceRouteCtlMiscOptions;

                    public final TraceRouteCtlMaxFailuresEnt traceRouteCtlMaxFailures;

                    public final TraceRouteCtlDontFragmentEnt traceRouteCtlDontFragment;

                    public final TraceRouteCtlInitialTtlEnt traceRouteCtlInitialTtl;

                    public final TraceRouteCtlFrequencyEnt traceRouteCtlFrequency;

                    public final TraceRouteCtlStorageTypeEnt traceRouteCtlStorageType;

                    public final TraceRouteCtlAdminStatusEnt traceRouteCtlAdminStatus;

                    public final TraceRouteCtlDescrEnt traceRouteCtlDescr;

                    public final TraceRouteCtlMaxRowsEnt traceRouteCtlMaxRows;

                    public final TraceRouteCtlTrapGenerationEnt traceRouteCtlTrapGeneration;

                    public final TraceRouteCtlCreateHopsEntriesEnt traceRouteCtlCreateHopsEntries;

                    public final TraceRouteCtlTypeEnt traceRouteCtlType;

                    public final TraceRouteCtlRowStatusEnt traceRouteCtlRowStatus;

                    private TraceRouteCtlEntryEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                    {
                        super(mib, parent, "traceRouteCtlEntry", "1.3.6.1.2.1.81.1.2.1", false, false, false, true);
                        this.traceRouteCtlOwnerIndex = new TraceRouteCtlOwnerIndexEnt(mib, this);
                        this.traceRouteCtlTestName = new TraceRouteCtlTestNameEnt(mib, this);
                        this.traceRouteCtlTargetAddressType = new TraceRouteCtlTargetAddressTypeEnt(mib, this);
                        this.traceRouteCtlTargetAddress = new TraceRouteCtlTargetAddressEnt(mib, this);
                        this.traceRouteCtlByPassRouteTable = new TraceRouteCtlByPassRouteTableEnt(mib, this);
                        this.traceRouteCtlDataSize = new TraceRouteCtlDataSizeEnt(mib, this);
                        this.traceRouteCtlTimeOut = new TraceRouteCtlTimeOutEnt(mib, this);
                        this.traceRouteCtlProbesPerHop = new TraceRouteCtlProbesPerHopEnt(mib, this);
                        this.traceRouteCtlPort = new TraceRouteCtlPortEnt(mib, this);
                        this.traceRouteCtlMaxTtl = new TraceRouteCtlMaxTtlEnt(mib, this);
                        this.traceRouteCtlDSField = new TraceRouteCtlDSFieldEnt(mib, this);
                        this.traceRouteCtlSourceAddressType = new TraceRouteCtlSourceAddressTypeEnt(mib, this);
                        this.traceRouteCtlSourceAddress = new TraceRouteCtlSourceAddressEnt(mib, this);
                        this.traceRouteCtlIfIndex = new TraceRouteCtlIfIndexEnt(mib, this);
                        this.traceRouteCtlMiscOptions = new TraceRouteCtlMiscOptionsEnt(mib, this);
                        this.traceRouteCtlMaxFailures = new TraceRouteCtlMaxFailuresEnt(mib, this);
                        this.traceRouteCtlDontFragment = new TraceRouteCtlDontFragmentEnt(mib, this);
                        this.traceRouteCtlInitialTtl = new TraceRouteCtlInitialTtlEnt(mib, this);
                        this.traceRouteCtlFrequency = new TraceRouteCtlFrequencyEnt(mib, this);
                        this.traceRouteCtlStorageType = new TraceRouteCtlStorageTypeEnt(mib, this);
                        this.traceRouteCtlAdminStatus = new TraceRouteCtlAdminStatusEnt(mib, this);
                        this.traceRouteCtlDescr = new TraceRouteCtlDescrEnt(mib, this);
                        this.traceRouteCtlMaxRows = new TraceRouteCtlMaxRowsEnt(mib, this);
                        this.traceRouteCtlTrapGeneration = new TraceRouteCtlTrapGenerationEnt(mib, this);
                        this.traceRouteCtlCreateHopsEntries = new TraceRouteCtlCreateHopsEntriesEnt(mib, this);
                        this.traceRouteCtlType = new TraceRouteCtlTypeEnt(mib, this);
                        this.traceRouteCtlRowStatus = new TraceRouteCtlRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.traceRouteCtlOwnerIndex,
                            this.traceRouteCtlTestName,
                            this.traceRouteCtlTargetAddressType,
                            this.traceRouteCtlTargetAddress,
                            this.traceRouteCtlByPassRouteTable,
                            this.traceRouteCtlDataSize,
                            this.traceRouteCtlTimeOut,
                            this.traceRouteCtlProbesPerHop,
                            this.traceRouteCtlPort,
                            this.traceRouteCtlMaxTtl,
                            this.traceRouteCtlDSField,
                            this.traceRouteCtlSourceAddressType,
                            this.traceRouteCtlSourceAddress,
                            this.traceRouteCtlIfIndex,
                            this.traceRouteCtlMiscOptions,
                            this.traceRouteCtlMaxFailures,
                            this.traceRouteCtlDontFragment,
                            this.traceRouteCtlInitialTtl,
                            this.traceRouteCtlFrequency,
                            this.traceRouteCtlStorageType,
                            this.traceRouteCtlAdminStatus,
                            this.traceRouteCtlDescr,
                            this.traceRouteCtlMaxRows,
                            this.traceRouteCtlTrapGeneration,
                            this.traceRouteCtlCreateHopsEntries,
                            this.traceRouteCtlType,
                            this.traceRouteCtlRowStatus
                        };
                    }
                    public static final class TraceRouteCtlOwnerIndexEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlOwnerIndexEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlOwnerIndex", "1.3.6.1.2.1.81.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlTestNameEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlTestNameEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlTestName", "1.3.6.1.2.1.81.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlTargetAddressTypeEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlTargetAddressTypeEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlTargetAddressType", "1.3.6.1.2.1.81.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlTargetAddressEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlTargetAddressEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlTargetAddress", "1.3.6.1.2.1.81.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlByPassRouteTableEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlByPassRouteTableEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlByPassRouteTable", "1.3.6.1.2.1.81.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlDataSizeEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlDataSizeEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlDataSize", "1.3.6.1.2.1.81.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlTimeOutEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlTimeOutEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlTimeOut", "1.3.6.1.2.1.81.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlProbesPerHopEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlProbesPerHopEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlProbesPerHop", "1.3.6.1.2.1.81.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlPortEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlPortEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlPort", "1.3.6.1.2.1.81.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlMaxTtlEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlMaxTtlEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlMaxTtl", "1.3.6.1.2.1.81.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlDSFieldEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlDSFieldEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlDSField", "1.3.6.1.2.1.81.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlSourceAddressTypeEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlSourceAddressTypeEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlSourceAddressType", "1.3.6.1.2.1.81.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlSourceAddressEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlSourceAddressEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlSourceAddress", "1.3.6.1.2.1.81.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlIfIndexEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlIfIndexEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlIfIndex", "1.3.6.1.2.1.81.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlMiscOptionsEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlMiscOptionsEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlMiscOptions", "1.3.6.1.2.1.81.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlMaxFailuresEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlMaxFailuresEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlMaxFailures", "1.3.6.1.2.1.81.1.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlDontFragmentEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlDontFragmentEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlDontFragment", "1.3.6.1.2.1.81.1.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlInitialTtlEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlInitialTtlEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlInitialTtl", "1.3.6.1.2.1.81.1.2.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlFrequencyEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlFrequencyEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlFrequency", "1.3.6.1.2.1.81.1.2.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlStorageTypeEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlStorageTypeEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlStorageType", "1.3.6.1.2.1.81.1.2.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlAdminStatusEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlAdminStatusEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlAdminStatus", "1.3.6.1.2.1.81.1.2.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlDescrEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlDescrEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlDescr", "1.3.6.1.2.1.81.1.2.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlMaxRowsEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlMaxRowsEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlMaxRows", "1.3.6.1.2.1.81.1.2.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlTrapGenerationEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlTrapGenerationEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlTrapGeneration", "1.3.6.1.2.1.81.1.2.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlCreateHopsEntriesEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlCreateHopsEntriesEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlCreateHopsEntries", "1.3.6.1.2.1.81.1.2.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlTypeEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlTypeEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlType", "1.3.6.1.2.1.81.1.2.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteCtlRowStatusEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteCtlRowStatusEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteCtlRowStatus", "1.3.6.1.2.1.81.1.2.1.27", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class TraceRouteResultsTableEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
            {
                public final TraceRouteResultsEntryEnt traceRouteResultsEntry;

                private TraceRouteResultsTableEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                {
                    super(mib, parent, "traceRouteResultsTable", "1.3.6.1.2.1.81.1.3", false, true, false, false);
                    this.traceRouteResultsEntry = new TraceRouteResultsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.traceRouteResultsEntry
                    };
                }
                public static final class TraceRouteResultsEntryEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                {
                    public final TraceRouteResultsOperStatusEnt traceRouteResultsOperStatus;

                    public final TraceRouteResultsCurHopCountEnt traceRouteResultsCurHopCount;

                    public final TraceRouteResultsCurProbeCountEnt traceRouteResultsCurProbeCount;

                    public final TraceRouteResultsIpTgtAddrTypeEnt traceRouteResultsIpTgtAddrType;

                    public final TraceRouteResultsIpTgtAddrEnt traceRouteResultsIpTgtAddr;

                    public final TraceRouteResultsTestAttemptsEnt traceRouteResultsTestAttempts;

                    public final TraceRouteResultsTestSuccessesEnt traceRouteResultsTestSuccesses;

                    public final TraceRouteResultsLastGoodPathEnt traceRouteResultsLastGoodPath;

                    private TraceRouteResultsEntryEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                    {
                        super(mib, parent, "traceRouteResultsEntry", "1.3.6.1.2.1.81.1.3.1", false, false, false, true);
                        this.traceRouteResultsOperStatus = new TraceRouteResultsOperStatusEnt(mib, this);
                        this.traceRouteResultsCurHopCount = new TraceRouteResultsCurHopCountEnt(mib, this);
                        this.traceRouteResultsCurProbeCount = new TraceRouteResultsCurProbeCountEnt(mib, this);
                        this.traceRouteResultsIpTgtAddrType = new TraceRouteResultsIpTgtAddrTypeEnt(mib, this);
                        this.traceRouteResultsIpTgtAddr = new TraceRouteResultsIpTgtAddrEnt(mib, this);
                        this.traceRouteResultsTestAttempts = new TraceRouteResultsTestAttemptsEnt(mib, this);
                        this.traceRouteResultsTestSuccesses = new TraceRouteResultsTestSuccessesEnt(mib, this);
                        this.traceRouteResultsLastGoodPath = new TraceRouteResultsLastGoodPathEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.traceRouteResultsOperStatus,
                            this.traceRouteResultsCurHopCount,
                            this.traceRouteResultsCurProbeCount,
                            this.traceRouteResultsIpTgtAddrType,
                            this.traceRouteResultsIpTgtAddr,
                            this.traceRouteResultsTestAttempts,
                            this.traceRouteResultsTestSuccesses,
                            this.traceRouteResultsLastGoodPath
                        };
                    }
                    public static final class TraceRouteResultsOperStatusEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteResultsOperStatusEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteResultsOperStatus", "1.3.6.1.2.1.81.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteResultsCurHopCountEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteResultsCurHopCountEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteResultsCurHopCount", "1.3.6.1.2.1.81.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteResultsCurProbeCountEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteResultsCurProbeCountEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteResultsCurProbeCount", "1.3.6.1.2.1.81.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteResultsIpTgtAddrTypeEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteResultsIpTgtAddrTypeEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteResultsIpTgtAddrType", "1.3.6.1.2.1.81.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteResultsIpTgtAddrEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteResultsIpTgtAddrEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteResultsIpTgtAddr", "1.3.6.1.2.1.81.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteResultsTestAttemptsEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteResultsTestAttemptsEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteResultsTestAttempts", "1.3.6.1.2.1.81.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteResultsTestSuccessesEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteResultsTestSuccessesEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteResultsTestSuccesses", "1.3.6.1.2.1.81.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteResultsLastGoodPathEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteResultsLastGoodPathEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteResultsLastGoodPath", "1.3.6.1.2.1.81.1.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class TraceRouteProbeHistoryTableEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
            {
                public final TraceRouteProbeHistoryEntryEnt traceRouteProbeHistoryEntry;

                private TraceRouteProbeHistoryTableEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                {
                    super(mib, parent, "traceRouteProbeHistoryTable", "1.3.6.1.2.1.81.1.4", false, true, false, false);
                    this.traceRouteProbeHistoryEntry = new TraceRouteProbeHistoryEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.traceRouteProbeHistoryEntry
                    };
                }
                public static final class TraceRouteProbeHistoryEntryEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                {
                    public final TraceRouteProbeHistoryIndexEnt traceRouteProbeHistoryIndex;

                    public final TraceRouteProbeHistoryHopIndexEnt traceRouteProbeHistoryHopIndex;

                    public final TraceRouteProbeHistoryProbeIndexEnt traceRouteProbeHistoryProbeIndex;

                    public final TraceRouteProbeHistoryHAddrTypeEnt traceRouteProbeHistoryHAddrType;

                    public final TraceRouteProbeHistoryHAddrEnt traceRouteProbeHistoryHAddr;

                    public final TraceRouteProbeHistoryResponseEnt traceRouteProbeHistoryResponse;

                    public final TraceRouteProbeHistoryStatusEnt traceRouteProbeHistoryStatus;

                    public final TraceRouteProbeHistoryLastRCEnt traceRouteProbeHistoryLastRC;

                    public final TraceRouteProbeHistoryTimeEnt traceRouteProbeHistoryTime;

                    private TraceRouteProbeHistoryEntryEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                    {
                        super(mib, parent, "traceRouteProbeHistoryEntry", "1.3.6.1.2.1.81.1.4.1", false, false, false, true);
                        this.traceRouteProbeHistoryIndex = new TraceRouteProbeHistoryIndexEnt(mib, this);
                        this.traceRouteProbeHistoryHopIndex = new TraceRouteProbeHistoryHopIndexEnt(mib, this);
                        this.traceRouteProbeHistoryProbeIndex = new TraceRouteProbeHistoryProbeIndexEnt(mib, this);
                        this.traceRouteProbeHistoryHAddrType = new TraceRouteProbeHistoryHAddrTypeEnt(mib, this);
                        this.traceRouteProbeHistoryHAddr = new TraceRouteProbeHistoryHAddrEnt(mib, this);
                        this.traceRouteProbeHistoryResponse = new TraceRouteProbeHistoryResponseEnt(mib, this);
                        this.traceRouteProbeHistoryStatus = new TraceRouteProbeHistoryStatusEnt(mib, this);
                        this.traceRouteProbeHistoryLastRC = new TraceRouteProbeHistoryLastRCEnt(mib, this);
                        this.traceRouteProbeHistoryTime = new TraceRouteProbeHistoryTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.traceRouteProbeHistoryIndex,
                            this.traceRouteProbeHistoryHopIndex,
                            this.traceRouteProbeHistoryProbeIndex,
                            this.traceRouteProbeHistoryHAddrType,
                            this.traceRouteProbeHistoryHAddr,
                            this.traceRouteProbeHistoryResponse,
                            this.traceRouteProbeHistoryStatus,
                            this.traceRouteProbeHistoryLastRC,
                            this.traceRouteProbeHistoryTime
                        };
                    }
                    public static final class TraceRouteProbeHistoryIndexEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteProbeHistoryIndexEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteProbeHistoryIndex", "1.3.6.1.2.1.81.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteProbeHistoryHopIndexEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteProbeHistoryHopIndexEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteProbeHistoryHopIndex", "1.3.6.1.2.1.81.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteProbeHistoryProbeIndexEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteProbeHistoryProbeIndexEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteProbeHistoryProbeIndex", "1.3.6.1.2.1.81.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteProbeHistoryHAddrTypeEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteProbeHistoryHAddrTypeEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteProbeHistoryHAddrType", "1.3.6.1.2.1.81.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteProbeHistoryHAddrEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteProbeHistoryHAddrEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteProbeHistoryHAddr", "1.3.6.1.2.1.81.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteProbeHistoryResponseEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteProbeHistoryResponseEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteProbeHistoryResponse", "1.3.6.1.2.1.81.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteProbeHistoryStatusEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteProbeHistoryStatusEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteProbeHistoryStatus", "1.3.6.1.2.1.81.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteProbeHistoryLastRCEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteProbeHistoryLastRCEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteProbeHistoryLastRC", "1.3.6.1.2.1.81.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteProbeHistoryTimeEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteProbeHistoryTimeEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteProbeHistoryTime", "1.3.6.1.2.1.81.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class TraceRouteHopsTableEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
            {
                public final TraceRouteHopsEntryEnt traceRouteHopsEntry;

                private TraceRouteHopsTableEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                {
                    super(mib, parent, "traceRouteHopsTable", "1.3.6.1.2.1.81.1.5", false, true, false, false);
                    this.traceRouteHopsEntry = new TraceRouteHopsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.traceRouteHopsEntry
                    };
                }
                public static final class TraceRouteHopsEntryEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                {
                    public final TraceRouteHopsHopIndexEnt traceRouteHopsHopIndex;

                    public final TraceRouteHopsIpTgtAddressTypeEnt traceRouteHopsIpTgtAddressType;

                    public final TraceRouteHopsIpTgtAddressEnt traceRouteHopsIpTgtAddress;

                    public final TraceRouteHopsMinRttEnt traceRouteHopsMinRtt;

                    public final TraceRouteHopsMaxRttEnt traceRouteHopsMaxRtt;

                    public final TraceRouteHopsAverageRttEnt traceRouteHopsAverageRtt;

                    public final TraceRouteHopsRttSumOfSquaresEnt traceRouteHopsRttSumOfSquares;

                    public final TraceRouteHopsSentProbesEnt traceRouteHopsSentProbes;

                    public final TraceRouteHopsProbeResponsesEnt traceRouteHopsProbeResponses;

                    public final TraceRouteHopsLastGoodProbeEnt traceRouteHopsLastGoodProbe;

                    private TraceRouteHopsEntryEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                    {
                        super(mib, parent, "traceRouteHopsEntry", "1.3.6.1.2.1.81.1.5.1", false, false, false, true);
                        this.traceRouteHopsHopIndex = new TraceRouteHopsHopIndexEnt(mib, this);
                        this.traceRouteHopsIpTgtAddressType = new TraceRouteHopsIpTgtAddressTypeEnt(mib, this);
                        this.traceRouteHopsIpTgtAddress = new TraceRouteHopsIpTgtAddressEnt(mib, this);
                        this.traceRouteHopsMinRtt = new TraceRouteHopsMinRttEnt(mib, this);
                        this.traceRouteHopsMaxRtt = new TraceRouteHopsMaxRttEnt(mib, this);
                        this.traceRouteHopsAverageRtt = new TraceRouteHopsAverageRttEnt(mib, this);
                        this.traceRouteHopsRttSumOfSquares = new TraceRouteHopsRttSumOfSquaresEnt(mib, this);
                        this.traceRouteHopsSentProbes = new TraceRouteHopsSentProbesEnt(mib, this);
                        this.traceRouteHopsProbeResponses = new TraceRouteHopsProbeResponsesEnt(mib, this);
                        this.traceRouteHopsLastGoodProbe = new TraceRouteHopsLastGoodProbeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.traceRouteHopsHopIndex,
                            this.traceRouteHopsIpTgtAddressType,
                            this.traceRouteHopsIpTgtAddress,
                            this.traceRouteHopsMinRtt,
                            this.traceRouteHopsMaxRtt,
                            this.traceRouteHopsAverageRtt,
                            this.traceRouteHopsRttSumOfSquares,
                            this.traceRouteHopsSentProbes,
                            this.traceRouteHopsProbeResponses,
                            this.traceRouteHopsLastGoodProbe
                        };
                    }
                    public static final class TraceRouteHopsHopIndexEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteHopsHopIndexEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteHopsHopIndex", "1.3.6.1.2.1.81.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteHopsIpTgtAddressTypeEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteHopsIpTgtAddressTypeEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteHopsIpTgtAddressType", "1.3.6.1.2.1.81.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteHopsIpTgtAddressEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteHopsIpTgtAddressEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteHopsIpTgtAddress", "1.3.6.1.2.1.81.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteHopsMinRttEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteHopsMinRttEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteHopsMinRtt", "1.3.6.1.2.1.81.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteHopsMaxRttEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteHopsMaxRttEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteHopsMaxRtt", "1.3.6.1.2.1.81.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteHopsAverageRttEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteHopsAverageRttEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteHopsAverageRtt", "1.3.6.1.2.1.81.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteHopsRttSumOfSquaresEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteHopsRttSumOfSquaresEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteHopsRttSumOfSquares", "1.3.6.1.2.1.81.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteHopsSentProbesEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteHopsSentProbesEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteHopsSentProbes", "1.3.6.1.2.1.81.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteHopsProbeResponsesEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteHopsProbeResponsesEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteHopsProbeResponses", "1.3.6.1.2.1.81.1.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TraceRouteHopsLastGoodProbeEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                    {
                        private TraceRouteHopsLastGoodProbeEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                        {
                            super(mib, parent, "traceRouteHopsLastGoodProbe", "1.3.6.1.2.1.81.1.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class TraceRouteConformanceEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
        {
            /** Conformance informationCompliance statements*/
            public final TraceRouteCompliancesEnt traceRouteCompliances;

            public final TraceRouteGroupsEnt traceRouteGroups;

            private TraceRouteConformanceEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
            {
                super(mib, parent, "traceRouteConformance", "1.3.6.1.2.1.81.2", false, false, false, false);
                this.traceRouteCompliances = new TraceRouteCompliancesEnt(mib, this);
                this.traceRouteGroups = new TraceRouteGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.traceRouteCompliances,
                    this.traceRouteGroups
                };
            }
            public static final class TraceRouteCompliancesEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
            {
                /** Compliance statements*/
                public final TraceRouteFullComplianceEnt traceRouteFullCompliance;

                public final TraceRouteMinimumComplianceEnt traceRouteMinimumCompliance;

                public final TraceRouteComplianceEnt traceRouteCompliance;

                private TraceRouteCompliancesEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                {
                    super(mib, parent, "traceRouteCompliances", "1.3.6.1.2.1.81.2.1", false, false, false, false);
                    this.traceRouteFullCompliance = new TraceRouteFullComplianceEnt(mib, this);
                    this.traceRouteMinimumCompliance = new TraceRouteMinimumComplianceEnt(mib, this);
                    this.traceRouteCompliance = new TraceRouteComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.traceRouteFullCompliance,
                        this.traceRouteMinimumCompliance,
                        this.traceRouteCompliance
                    };
                }
                public static final class TraceRouteFullComplianceEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                {
                    private TraceRouteFullComplianceEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                    {
                        super(mib, parent, "traceRouteFullCompliance", "1.3.6.1.2.1.81.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TraceRouteMinimumComplianceEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                {
                    private TraceRouteMinimumComplianceEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                    {
                        super(mib, parent, "traceRouteMinimumCompliance", "1.3.6.1.2.1.81.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TraceRouteComplianceEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                {
                    private TraceRouteComplianceEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                    {
                        super(mib, parent, "traceRouteCompliance", "1.3.6.1.2.1.81.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class TraceRouteGroupsEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
            {
                /** MIB groupings*/
                public final TraceRouteMinimumGroupEnt traceRouteMinimumGroup;

                public final TraceRouteCtlRowStatusGroupEnt traceRouteCtlRowStatusGroup;

                public final TraceRouteHistoryGroupEnt traceRouteHistoryGroup;

                public final TraceRouteNotificationsGroupEnt traceRouteNotificationsGroup;

                public final TraceRouteHopsTableGroupEnt traceRouteHopsTableGroup;

                public final TraceRouteGroupEnt traceRouteGroup;

                public final TraceRouteTimeStampGroupEnt traceRouteTimeStampGroup;

                private TraceRouteGroupsEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                {
                    super(mib, parent, "traceRouteGroups", "1.3.6.1.2.1.81.2.2", false, false, false, false);
                    this.traceRouteMinimumGroup = new TraceRouteMinimumGroupEnt(mib, this);
                    this.traceRouteCtlRowStatusGroup = new TraceRouteCtlRowStatusGroupEnt(mib, this);
                    this.traceRouteHistoryGroup = new TraceRouteHistoryGroupEnt(mib, this);
                    this.traceRouteNotificationsGroup = new TraceRouteNotificationsGroupEnt(mib, this);
                    this.traceRouteHopsTableGroup = new TraceRouteHopsTableGroupEnt(mib, this);
                    this.traceRouteGroup = new TraceRouteGroupEnt(mib, this);
                    this.traceRouteTimeStampGroup = new TraceRouteTimeStampGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.traceRouteMinimumGroup,
                        this.traceRouteCtlRowStatusGroup,
                        this.traceRouteHistoryGroup,
                        this.traceRouteNotificationsGroup,
                        this.traceRouteHopsTableGroup,
                        this.traceRouteGroup,
                        this.traceRouteTimeStampGroup
                    };
                }
                public static final class TraceRouteMinimumGroupEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                {
                    private TraceRouteMinimumGroupEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                    {
                        super(mib, parent, "traceRouteMinimumGroup", "1.3.6.1.2.1.81.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TraceRouteCtlRowStatusGroupEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                {
                    private TraceRouteCtlRowStatusGroupEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                    {
                        super(mib, parent, "traceRouteCtlRowStatusGroup", "1.3.6.1.2.1.81.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TraceRouteHistoryGroupEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                {
                    private TraceRouteHistoryGroupEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                    {
                        super(mib, parent, "traceRouteHistoryGroup", "1.3.6.1.2.1.81.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TraceRouteNotificationsGroupEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                {
                    private TraceRouteNotificationsGroupEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                    {
                        super(mib, parent, "traceRouteNotificationsGroup", "1.3.6.1.2.1.81.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TraceRouteHopsTableGroupEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                {
                    private TraceRouteHopsTableGroupEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                    {
                        super(mib, parent, "traceRouteHopsTableGroup", "1.3.6.1.2.1.81.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TraceRouteGroupEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                {
                    private TraceRouteGroupEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                    {
                        super(mib, parent, "traceRouteGroup", "1.3.6.1.2.1.81.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TraceRouteTimeStampGroupEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
                {
                    private TraceRouteTimeStampGroupEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                    {
                        super(mib, parent, "traceRouteTimeStampGroup", "1.3.6.1.2.1.81.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class TraceRouteImplementationTypeDomainsEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
        {
            public final TraceRouteUsingUdpProbesEnt traceRouteUsingUdpProbes;

            private TraceRouteImplementationTypeDomainsEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
            {
                super(mib, parent, "traceRouteImplementationTypeDomains", "1.3.6.1.2.1.81.3", false, false, false, false);
                this.traceRouteUsingUdpProbes = new TraceRouteUsingUdpProbesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.traceRouteUsingUdpProbes
                };
            }
            public static final class TraceRouteUsingUdpProbesEnt extends MIBEntry<DISMANTRACEROUTEMIBDef>
            {
                private TraceRouteUsingUdpProbesEnt(DISMANTRACEROUTEMIBDef mib, MIBEntry<DISMANTRACEROUTEMIBDef> parent)
                {
                    super(mib, parent, "traceRouteUsingUdpProbes", "1.3.6.1.2.1.81.3.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
