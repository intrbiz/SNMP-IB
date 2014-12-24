package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class APPLICATIONMIBDef extends MIB
{
    public static final APPLICATIONMIBDef APPLICATIONMIB = new APPLICATIONMIBDef();

    public final ApplicationMibEnt applicationMib;

    private APPLICATIONMIBDef()
    {
        super("APPLICATION-MIB");
        this.applicationMib = new ApplicationMibEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.applicationMib
        };
    }

    public static final class ApplicationMibEnt extends MIBEntry<APPLICATIONMIBDef>
    {
        /** Registration hierarchy for this MIB*/
        public final ApplicationMibObjectsEnt applicationMibObjects;

        public final ApplicationMibConformanceEnt applicationMibConformance;

        private ApplicationMibEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
        {
            super(mib, parent, "applicationMib", "1.3.6.1.2.1.62", false, false, false, false);
            this.applicationMibObjects = new ApplicationMibObjectsEnt(mib, this);
            this.applicationMibConformance = new ApplicationMibConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.applicationMibObjects,
                this.applicationMibConformance
            };
        }
        public static final class ApplicationMibObjectsEnt extends MIBEntry<APPLICATIONMIBDef>
        {
            /** Groups defined in this MIB*/
            public final ApplServiceGroupEnt applServiceGroup;

            public final ApplChannelGroupEnt applChannelGroup;

            public final ApplPastChannelGroupEnt applPastChannelGroup;

            public final ApplElmtRunControlGroupEnt applElmtRunControlGroup;

            private ApplicationMibObjectsEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
            {
                super(mib, parent, "applicationMibObjects", "1.3.6.1.2.1.62.1", false, false, false, false);
                this.applServiceGroup = new ApplServiceGroupEnt(mib, this);
                this.applChannelGroup = new ApplChannelGroupEnt(mib, this);
                this.applPastChannelGroup = new ApplPastChannelGroupEnt(mib, this);
                this.applElmtRunControlGroup = new ApplElmtRunControlGroupEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.applServiceGroup,
                    this.applChannelGroup,
                    this.applPastChannelGroup,
                    this.applElmtRunControlGroup
                };
            }
            public static final class ApplServiceGroupEnt extends MIBEntry<APPLICATIONMIBDef>
            {
                /** ****************************************************************applServiceGroup -The service-level tables permit the identification of oneor more instances of named services on a system, and theassociation of running application elements to services.****************************************************************

****************************************************************The service name to service instance table*****************************************************************/
                public final ApplSrvNameToSrvInstTableEnt applSrvNameToSrvInstTable;

                /** ****************************************************************Service instance to Service Name table*****************************************************************/
                public final ApplSrvInstToSrvNameTableEnt applSrvInstToSrvNameTable;

                /** ****************************************************************The service instance to running application element table*****************************************************************/
                public final ApplSrvInstToRunApplElmtTableEnt applSrvInstToRunApplElmtTable;

                /** ****************************************************************The running application element to service instance table*****************************************************************/
                public final ApplRunApplElmtToSrvInstTableEnt applRunApplElmtToSrvInstTable;

                private ApplServiceGroupEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                {
                    super(mib, parent, "applServiceGroup", "1.3.6.1.2.1.62.1.1", false, false, false, false);
                    this.applSrvNameToSrvInstTable = new ApplSrvNameToSrvInstTableEnt(mib, this);
                    this.applSrvInstToSrvNameTable = new ApplSrvInstToSrvNameTableEnt(mib, this);
                    this.applSrvInstToRunApplElmtTable = new ApplSrvInstToRunApplElmtTableEnt(mib, this);
                    this.applRunApplElmtToSrvInstTable = new ApplRunApplElmtToSrvInstTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.applSrvNameToSrvInstTable,
                        this.applSrvInstToSrvNameTable,
                        this.applSrvInstToRunApplElmtTable,
                        this.applRunApplElmtToSrvInstTable
                    };
                }
                public static final class ApplSrvNameToSrvInstTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplSrvNameToSrvInstEntryEnt applSrvNameToSrvInstEntry;

                    private ApplSrvNameToSrvInstTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applSrvNameToSrvInstTable", "1.3.6.1.2.1.62.1.1.1", false, true, false, false);
                        this.applSrvNameToSrvInstEntry = new ApplSrvNameToSrvInstEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applSrvNameToSrvInstEntry
                        };
                    }
                    public static final class ApplSrvNameToSrvInstEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplSrvInstQualEnt applSrvInstQual;

                        private ApplSrvNameToSrvInstEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applSrvNameToSrvInstEntry", "1.3.6.1.2.1.62.1.1.1.1", false, false, false, true);
                            this.applSrvInstQual = new ApplSrvInstQualEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applSrvInstQual
                            };
                        }
                        public static final class ApplSrvInstQualEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplSrvInstQualEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applSrvInstQual", "1.3.6.1.2.1.62.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ApplSrvInstToSrvNameTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplSrvInstToSrvNameEntryEnt applSrvInstToSrvNameEntry;

                    private ApplSrvInstToSrvNameTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applSrvInstToSrvNameTable", "1.3.6.1.2.1.62.1.1.2", false, true, false, false);
                        this.applSrvInstToSrvNameEntry = new ApplSrvInstToSrvNameEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applSrvInstToSrvNameEntry
                        };
                    }
                    public static final class ApplSrvInstToSrvNameEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplSrvNameEnt applSrvName;

                        private ApplSrvInstToSrvNameEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applSrvInstToSrvNameEntry", "1.3.6.1.2.1.62.1.1.2.1", false, false, false, true);
                            this.applSrvName = new ApplSrvNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applSrvName
                            };
                        }
                        public static final class ApplSrvNameEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplSrvNameEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applSrvName", "1.3.6.1.2.1.62.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ApplSrvInstToRunApplElmtTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplSrvInstToRunApplElmtEntryEnt applSrvInstToRunApplElmtEntry;

                    private ApplSrvInstToRunApplElmtTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applSrvInstToRunApplElmtTable", "1.3.6.1.2.1.62.1.1.3", false, true, false, false);
                        this.applSrvInstToRunApplElmtEntry = new ApplSrvInstToRunApplElmtEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applSrvInstToRunApplElmtEntry
                        };
                    }
                    public static final class ApplSrvInstToRunApplElmtEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplSrvIndexEnt applSrvIndex;

                        private ApplSrvInstToRunApplElmtEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applSrvInstToRunApplElmtEntry", "1.3.6.1.2.1.62.1.1.3.1", false, false, false, true);
                            this.applSrvIndex = new ApplSrvIndexEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applSrvIndex
                            };
                        }
                        public static final class ApplSrvIndexEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplSrvIndexEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applSrvIndex", "1.3.6.1.2.1.62.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ApplRunApplElmtToSrvInstTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplRunApplElmtToSrvInstEntryEnt applRunApplElmtToSrvInstEntry;

                    private ApplRunApplElmtToSrvInstTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applRunApplElmtToSrvInstTable", "1.3.6.1.2.1.62.1.1.4", false, true, false, false);
                        this.applRunApplElmtToSrvInstEntry = new ApplRunApplElmtToSrvInstEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applRunApplElmtToSrvInstEntry
                        };
                    }
                    public static final class ApplRunApplElmtToSrvInstEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplSrvInstanceEnt applSrvInstance;

                        private ApplRunApplElmtToSrvInstEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applRunApplElmtToSrvInstEntry", "1.3.6.1.2.1.62.1.1.4.1", false, false, false, true);
                            this.applSrvInstance = new ApplSrvInstanceEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applSrvInstance
                            };
                        }
                        public static final class ApplSrvInstanceEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplSrvInstanceEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applSrvInstance", "1.3.6.1.2.1.62.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class ApplChannelGroupEnt extends MIBEntry<APPLICATIONMIBDef>
            {
                /** ****************************************************************applChannelGroup - group with tables for I/OIn this group, the common abstraction is the Channel.Channels are realized as files or connections.The information flowing on a channel can always bemeasured in terms of a byte stream.  Furthermore, for manychannels, this information may also be measured in termsof transactions.For all of these tables, the first two indexes determineswhether what is being measured is for a single runningapplication element or for an instance of a service.The second index identifies the running application elementor service instance.The third index is the channel id, which uniquely identifiesa channel within the context of a running application elementor service instance.Any remaining indexes are table-specific.****************************************************************

****************************************************************applOpenChannelTable - Table of Open Channels*****************************************************************/
                public final ApplOpenChannelTableEnt applOpenChannelTable;

                /** ****************************************************************applOpenFileTable - Table of Open Files*****************************************************************/
                public final ApplOpenFileTableEnt applOpenFileTable;

                /** ****************************************************************applOpenConnectionTable - Open Connection Table*****************************************************************/
                public final ApplOpenConnectionTableEnt applOpenConnectionTable;

                /** ****************************************************************applTransactionStreamTable - commoninformation for transaction stream monitoring*****************************************************************/
                public final ApplTransactionStreamTableEnt applTransactionStreamTable;

                /** ****************************************************************applTransactFlowTable*****************************************************************/
                public final ApplTransactFlowTableEnt applTransactFlowTable;

                /** ****************************************************************applTransactKindTable - transaction statistics broken downaccording to the kinds of transactions in each directionfor a transaction stream.*****************************************************************/
                public final ApplTransactKindTableEnt applTransactKindTable;

                private ApplChannelGroupEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                {
                    super(mib, parent, "applChannelGroup", "1.3.6.1.2.1.62.1.2", false, false, false, false);
                    this.applOpenChannelTable = new ApplOpenChannelTableEnt(mib, this);
                    this.applOpenFileTable = new ApplOpenFileTableEnt(mib, this);
                    this.applOpenConnectionTable = new ApplOpenConnectionTableEnt(mib, this);
                    this.applTransactionStreamTable = new ApplTransactionStreamTableEnt(mib, this);
                    this.applTransactFlowTable = new ApplTransactFlowTableEnt(mib, this);
                    this.applTransactKindTable = new ApplTransactKindTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.applOpenChannelTable,
                        this.applOpenFileTable,
                        this.applOpenConnectionTable,
                        this.applTransactionStreamTable,
                        this.applTransactFlowTable,
                        this.applTransactKindTable
                    };
                }
                public static final class ApplOpenChannelTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplOpenChannelEntryEnt applOpenChannelEntry;

                    private ApplOpenChannelTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applOpenChannelTable", "1.3.6.1.2.1.62.1.2.1", false, true, false, false);
                        this.applOpenChannelEntry = new ApplOpenChannelEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applOpenChannelEntry
                        };
                    }
                    public static final class ApplOpenChannelEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplElmtOrSvcEnt applElmtOrSvc;

                        public final ApplElmtOrSvcIdEnt applElmtOrSvcId;

                        public final ApplOpenChannelIndexEnt applOpenChannelIndex;

                        public final ApplOpenChannelOpenTimeEnt applOpenChannelOpenTime;

                        public final ApplOpenChannelReadRequestsEnt applOpenChannelReadRequests;

                        public final ApplOpenChannelReadRequestsLowEnt applOpenChannelReadRequestsLow;

                        public final ApplOpenChannelReadFailuresEnt applOpenChannelReadFailures;

                        public final ApplOpenChannelBytesReadEnt applOpenChannelBytesRead;

                        public final ApplOpenChannelBytesReadLowEnt applOpenChannelBytesReadLow;

                        public final ApplOpenChannelLastReadTimeEnt applOpenChannelLastReadTime;

                        public final ApplOpenChannelWriteRequestsEnt applOpenChannelWriteRequests;

                        public final ApplOpenChannelWriteRequestsLowEnt applOpenChannelWriteRequestsLow;

                        public final ApplOpenChannelWriteFailuresEnt applOpenChannelWriteFailures;

                        public final ApplOpenChannelBytesWrittenEnt applOpenChannelBytesWritten;

                        public final ApplOpenChannelBytesWrittenLowEnt applOpenChannelBytesWrittenLow;

                        public final ApplOpenChannelLastWriteTimeEnt applOpenChannelLastWriteTime;

                        private ApplOpenChannelEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applOpenChannelEntry", "1.3.6.1.2.1.62.1.2.1.1", false, false, false, true);
                            this.applElmtOrSvc = new ApplElmtOrSvcEnt(mib, this);
                            this.applElmtOrSvcId = new ApplElmtOrSvcIdEnt(mib, this);
                            this.applOpenChannelIndex = new ApplOpenChannelIndexEnt(mib, this);
                            this.applOpenChannelOpenTime = new ApplOpenChannelOpenTimeEnt(mib, this);
                            this.applOpenChannelReadRequests = new ApplOpenChannelReadRequestsEnt(mib, this);
                            this.applOpenChannelReadRequestsLow = new ApplOpenChannelReadRequestsLowEnt(mib, this);
                            this.applOpenChannelReadFailures = new ApplOpenChannelReadFailuresEnt(mib, this);
                            this.applOpenChannelBytesRead = new ApplOpenChannelBytesReadEnt(mib, this);
                            this.applOpenChannelBytesReadLow = new ApplOpenChannelBytesReadLowEnt(mib, this);
                            this.applOpenChannelLastReadTime = new ApplOpenChannelLastReadTimeEnt(mib, this);
                            this.applOpenChannelWriteRequests = new ApplOpenChannelWriteRequestsEnt(mib, this);
                            this.applOpenChannelWriteRequestsLow = new ApplOpenChannelWriteRequestsLowEnt(mib, this);
                            this.applOpenChannelWriteFailures = new ApplOpenChannelWriteFailuresEnt(mib, this);
                            this.applOpenChannelBytesWritten = new ApplOpenChannelBytesWrittenEnt(mib, this);
                            this.applOpenChannelBytesWrittenLow = new ApplOpenChannelBytesWrittenLowEnt(mib, this);
                            this.applOpenChannelLastWriteTime = new ApplOpenChannelLastWriteTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applElmtOrSvc,
                                this.applElmtOrSvcId,
                                this.applOpenChannelIndex,
                                this.applOpenChannelOpenTime,
                                this.applOpenChannelReadRequests,
                                this.applOpenChannelReadRequestsLow,
                                this.applOpenChannelReadFailures,
                                this.applOpenChannelBytesRead,
                                this.applOpenChannelBytesReadLow,
                                this.applOpenChannelLastReadTime,
                                this.applOpenChannelWriteRequests,
                                this.applOpenChannelWriteRequestsLow,
                                this.applOpenChannelWriteFailures,
                                this.applOpenChannelBytesWritten,
                                this.applOpenChannelBytesWrittenLow,
                                this.applOpenChannelLastWriteTime
                            };
                        }
                        public static final class ApplElmtOrSvcEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplElmtOrSvcEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applElmtOrSvc", "1.3.6.1.2.1.62.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplElmtOrSvcIdEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplElmtOrSvcIdEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applElmtOrSvcId", "1.3.6.1.2.1.62.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenChannelIndexEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenChannelIndexEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenChannelIndex", "1.3.6.1.2.1.62.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenChannelOpenTimeEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenChannelOpenTimeEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenChannelOpenTime", "1.3.6.1.2.1.62.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenChannelReadRequestsEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenChannelReadRequestsEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenChannelReadRequests", "1.3.6.1.2.1.62.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenChannelReadRequestsLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenChannelReadRequestsLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenChannelReadRequestsLow", "1.3.6.1.2.1.62.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenChannelReadFailuresEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenChannelReadFailuresEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenChannelReadFailures", "1.3.6.1.2.1.62.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenChannelBytesReadEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenChannelBytesReadEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenChannelBytesRead", "1.3.6.1.2.1.62.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenChannelBytesReadLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenChannelBytesReadLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenChannelBytesReadLow", "1.3.6.1.2.1.62.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenChannelLastReadTimeEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenChannelLastReadTimeEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenChannelLastReadTime", "1.3.6.1.2.1.62.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenChannelWriteRequestsEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenChannelWriteRequestsEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenChannelWriteRequests", "1.3.6.1.2.1.62.1.2.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenChannelWriteRequestsLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenChannelWriteRequestsLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenChannelWriteRequestsLow", "1.3.6.1.2.1.62.1.2.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenChannelWriteFailuresEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenChannelWriteFailuresEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenChannelWriteFailures", "1.3.6.1.2.1.62.1.2.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenChannelBytesWrittenEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenChannelBytesWrittenEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenChannelBytesWritten", "1.3.6.1.2.1.62.1.2.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenChannelBytesWrittenLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenChannelBytesWrittenLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenChannelBytesWrittenLow", "1.3.6.1.2.1.62.1.2.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenChannelLastWriteTimeEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenChannelLastWriteTimeEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenChannelLastWriteTime", "1.3.6.1.2.1.62.1.2.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ApplOpenFileTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplOpenFileEntryEnt applOpenFileEntry;

                    private ApplOpenFileTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applOpenFileTable", "1.3.6.1.2.1.62.1.2.2", false, true, false, false);
                        this.applOpenFileEntry = new ApplOpenFileEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applOpenFileEntry
                        };
                    }
                    public static final class ApplOpenFileEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplOpenFileNameEnt applOpenFileName;

                        public final ApplOpenFileSizeHighEnt applOpenFileSizeHigh;

                        public final ApplOpenFileSizeLowEnt applOpenFileSizeLow;

                        public final ApplOpenFileModeEnt applOpenFileMode;

                        private ApplOpenFileEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applOpenFileEntry", "1.3.6.1.2.1.62.1.2.2.1", false, false, false, true);
                            this.applOpenFileName = new ApplOpenFileNameEnt(mib, this);
                            this.applOpenFileSizeHigh = new ApplOpenFileSizeHighEnt(mib, this);
                            this.applOpenFileSizeLow = new ApplOpenFileSizeLowEnt(mib, this);
                            this.applOpenFileMode = new ApplOpenFileModeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applOpenFileName,
                                this.applOpenFileSizeHigh,
                                this.applOpenFileSizeLow,
                                this.applOpenFileMode
                            };
                        }
                        public static final class ApplOpenFileNameEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenFileNameEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenFileName", "1.3.6.1.2.1.62.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenFileSizeHighEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenFileSizeHighEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenFileSizeHigh", "1.3.6.1.2.1.62.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenFileSizeLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenFileSizeLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenFileSizeLow", "1.3.6.1.2.1.62.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenFileModeEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenFileModeEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenFileMode", "1.3.6.1.2.1.62.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ApplOpenConnectionTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplOpenConnectionEntryEnt applOpenConnectionEntry;

                    private ApplOpenConnectionTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applOpenConnectionTable", "1.3.6.1.2.1.62.1.2.3", false, true, false, false);
                        this.applOpenConnectionEntry = new ApplOpenConnectionEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applOpenConnectionEntry
                        };
                    }
                    public static final class ApplOpenConnectionEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplOpenConnectionTransportEnt applOpenConnectionTransport;

                        public final ApplOpenConnectionNearEndAddrEnt applOpenConnectionNearEndAddr;

                        public final ApplOpenConnectionNearEndpointEnt applOpenConnectionNearEndpoint;

                        public final ApplOpenConnectionFarEndAddrEnt applOpenConnectionFarEndAddr;

                        public final ApplOpenConnectionFarEndpointEnt applOpenConnectionFarEndpoint;

                        public final ApplOpenConnectionApplicationEnt applOpenConnectionApplication;

                        private ApplOpenConnectionEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applOpenConnectionEntry", "1.3.6.1.2.1.62.1.2.3.1", false, false, false, true);
                            this.applOpenConnectionTransport = new ApplOpenConnectionTransportEnt(mib, this);
                            this.applOpenConnectionNearEndAddr = new ApplOpenConnectionNearEndAddrEnt(mib, this);
                            this.applOpenConnectionNearEndpoint = new ApplOpenConnectionNearEndpointEnt(mib, this);
                            this.applOpenConnectionFarEndAddr = new ApplOpenConnectionFarEndAddrEnt(mib, this);
                            this.applOpenConnectionFarEndpoint = new ApplOpenConnectionFarEndpointEnt(mib, this);
                            this.applOpenConnectionApplication = new ApplOpenConnectionApplicationEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applOpenConnectionTransport,
                                this.applOpenConnectionNearEndAddr,
                                this.applOpenConnectionNearEndpoint,
                                this.applOpenConnectionFarEndAddr,
                                this.applOpenConnectionFarEndpoint,
                                this.applOpenConnectionApplication
                            };
                        }
                        public static final class ApplOpenConnectionTransportEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenConnectionTransportEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenConnectionTransport", "1.3.6.1.2.1.62.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenConnectionNearEndAddrEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenConnectionNearEndAddrEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenConnectionNearEndAddr", "1.3.6.1.2.1.62.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenConnectionNearEndpointEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenConnectionNearEndpointEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenConnectionNearEndpoint", "1.3.6.1.2.1.62.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenConnectionFarEndAddrEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenConnectionFarEndAddrEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenConnectionFarEndAddr", "1.3.6.1.2.1.62.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenConnectionFarEndpointEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenConnectionFarEndpointEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenConnectionFarEndpoint", "1.3.6.1.2.1.62.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplOpenConnectionApplicationEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplOpenConnectionApplicationEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applOpenConnectionApplication", "1.3.6.1.2.1.62.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ApplTransactionStreamTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplTransactionStreamEntryEnt applTransactionStreamEntry;

                    private ApplTransactionStreamTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applTransactionStreamTable", "1.3.6.1.2.1.62.1.2.4", false, true, false, false);
                        this.applTransactionStreamEntry = new ApplTransactionStreamEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applTransactionStreamEntry
                        };
                    }
                    public static final class ApplTransactionStreamEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplTransactStreamDescrEnt applTransactStreamDescr;

                        public final ApplTransactStreamUnitOfWorkEnt applTransactStreamUnitOfWork;

                        public final ApplTransactStreamInvokesEnt applTransactStreamInvokes;

                        public final ApplTransactStreamInvokesLowEnt applTransactStreamInvokesLow;

                        public final ApplTransactStreamInvCumTimesEnt applTransactStreamInvCumTimes;

                        public final ApplTransactStreamInvRspTimesEnt applTransactStreamInvRspTimes;

                        public final ApplTransactStreamPerformsEnt applTransactStreamPerforms;

                        public final ApplTransactStreamPerformsLowEnt applTransactStreamPerformsLow;

                        public final ApplTransactStreamPrfCumTimesEnt applTransactStreamPrfCumTimes;

                        public final ApplTransactStreamPrfRspTimesEnt applTransactStreamPrfRspTimes;

                        private ApplTransactionStreamEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applTransactionStreamEntry", "1.3.6.1.2.1.62.1.2.4.1", false, false, false, true);
                            this.applTransactStreamDescr = new ApplTransactStreamDescrEnt(mib, this);
                            this.applTransactStreamUnitOfWork = new ApplTransactStreamUnitOfWorkEnt(mib, this);
                            this.applTransactStreamInvokes = new ApplTransactStreamInvokesEnt(mib, this);
                            this.applTransactStreamInvokesLow = new ApplTransactStreamInvokesLowEnt(mib, this);
                            this.applTransactStreamInvCumTimes = new ApplTransactStreamInvCumTimesEnt(mib, this);
                            this.applTransactStreamInvRspTimes = new ApplTransactStreamInvRspTimesEnt(mib, this);
                            this.applTransactStreamPerforms = new ApplTransactStreamPerformsEnt(mib, this);
                            this.applTransactStreamPerformsLow = new ApplTransactStreamPerformsLowEnt(mib, this);
                            this.applTransactStreamPrfCumTimes = new ApplTransactStreamPrfCumTimesEnt(mib, this);
                            this.applTransactStreamPrfRspTimes = new ApplTransactStreamPrfRspTimesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applTransactStreamDescr,
                                this.applTransactStreamUnitOfWork,
                                this.applTransactStreamInvokes,
                                this.applTransactStreamInvokesLow,
                                this.applTransactStreamInvCumTimes,
                                this.applTransactStreamInvRspTimes,
                                this.applTransactStreamPerforms,
                                this.applTransactStreamPerformsLow,
                                this.applTransactStreamPrfCumTimes,
                                this.applTransactStreamPrfRspTimes
                            };
                        }
                        public static final class ApplTransactStreamDescrEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactStreamDescrEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactStreamDescr", "1.3.6.1.2.1.62.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactStreamUnitOfWorkEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactStreamUnitOfWorkEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactStreamUnitOfWork", "1.3.6.1.2.1.62.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactStreamInvokesEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactStreamInvokesEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactStreamInvokes", "1.3.6.1.2.1.62.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactStreamInvokesLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactStreamInvokesLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactStreamInvokesLow", "1.3.6.1.2.1.62.1.2.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactStreamInvCumTimesEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactStreamInvCumTimesEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactStreamInvCumTimes", "1.3.6.1.2.1.62.1.2.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactStreamInvRspTimesEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactStreamInvRspTimesEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactStreamInvRspTimes", "1.3.6.1.2.1.62.1.2.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactStreamPerformsEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactStreamPerformsEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactStreamPerforms", "1.3.6.1.2.1.62.1.2.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactStreamPerformsLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactStreamPerformsLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactStreamPerformsLow", "1.3.6.1.2.1.62.1.2.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactStreamPrfCumTimesEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactStreamPrfCumTimesEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactStreamPrfCumTimes", "1.3.6.1.2.1.62.1.2.4.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactStreamPrfRspTimesEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactStreamPrfRspTimesEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactStreamPrfRspTimes", "1.3.6.1.2.1.62.1.2.4.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ApplTransactFlowTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplTransactFlowEntryEnt applTransactFlowEntry;

                    private ApplTransactFlowTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applTransactFlowTable", "1.3.6.1.2.1.62.1.2.5", false, true, false, false);
                        this.applTransactFlowEntry = new ApplTransactFlowEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applTransactFlowEntry
                        };
                    }
                    public static final class ApplTransactFlowEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplTransactFlowDirectionEnt applTransactFlowDirection;

                        public final ApplTransactFlowReqRspEnt applTransactFlowReqRsp;

                        public final ApplTransactFlowTransEnt applTransactFlowTrans;

                        public final ApplTransactFlowTransLowEnt applTransactFlowTransLow;

                        public final ApplTransactFlowBytesEnt applTransactFlowBytes;

                        public final ApplTransactFlowBytesLowEnt applTransactFlowBytesLow;

                        public final ApplTransactFlowTimeEnt applTransactFlowTime;

                        private ApplTransactFlowEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applTransactFlowEntry", "1.3.6.1.2.1.62.1.2.5.1", false, false, false, true);
                            this.applTransactFlowDirection = new ApplTransactFlowDirectionEnt(mib, this);
                            this.applTransactFlowReqRsp = new ApplTransactFlowReqRspEnt(mib, this);
                            this.applTransactFlowTrans = new ApplTransactFlowTransEnt(mib, this);
                            this.applTransactFlowTransLow = new ApplTransactFlowTransLowEnt(mib, this);
                            this.applTransactFlowBytes = new ApplTransactFlowBytesEnt(mib, this);
                            this.applTransactFlowBytesLow = new ApplTransactFlowBytesLowEnt(mib, this);
                            this.applTransactFlowTime = new ApplTransactFlowTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applTransactFlowDirection,
                                this.applTransactFlowReqRsp,
                                this.applTransactFlowTrans,
                                this.applTransactFlowTransLow,
                                this.applTransactFlowBytes,
                                this.applTransactFlowBytesLow,
                                this.applTransactFlowTime
                            };
                        }
                        public static final class ApplTransactFlowDirectionEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactFlowDirectionEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactFlowDirection", "1.3.6.1.2.1.62.1.2.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactFlowReqRspEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactFlowReqRspEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactFlowReqRsp", "1.3.6.1.2.1.62.1.2.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactFlowTransEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactFlowTransEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactFlowTrans", "1.3.6.1.2.1.62.1.2.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactFlowTransLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactFlowTransLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactFlowTransLow", "1.3.6.1.2.1.62.1.2.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactFlowBytesEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactFlowBytesEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactFlowBytes", "1.3.6.1.2.1.62.1.2.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactFlowBytesLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactFlowBytesLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactFlowBytesLow", "1.3.6.1.2.1.62.1.2.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactFlowTimeEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactFlowTimeEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactFlowTime", "1.3.6.1.2.1.62.1.2.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ApplTransactKindTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplTransactKindEntryEnt applTransactKindEntry;

                    private ApplTransactKindTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applTransactKindTable", "1.3.6.1.2.1.62.1.2.6", false, true, false, false);
                        this.applTransactKindEntry = new ApplTransactKindEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applTransactKindEntry
                        };
                    }
                    public static final class ApplTransactKindEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplTransactKindEnt applTransactKind;

                        public final ApplTransactKindTransEnt applTransactKindTrans;

                        public final ApplTransactKindTransLowEnt applTransactKindTransLow;

                        public final ApplTransactKindBytesEnt applTransactKindBytes;

                        public final ApplTransactKindBytesLowEnt applTransactKindBytesLow;

                        public final ApplTransactKindTimeEnt applTransactKindTime;

                        private ApplTransactKindEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applTransactKindEntry", "1.3.6.1.2.1.62.1.2.6.1", false, false, false, true);
                            this.applTransactKind = new ApplTransactKindEnt(mib, this);
                            this.applTransactKindTrans = new ApplTransactKindTransEnt(mib, this);
                            this.applTransactKindTransLow = new ApplTransactKindTransLowEnt(mib, this);
                            this.applTransactKindBytes = new ApplTransactKindBytesEnt(mib, this);
                            this.applTransactKindBytesLow = new ApplTransactKindBytesLowEnt(mib, this);
                            this.applTransactKindTime = new ApplTransactKindTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applTransactKind,
                                this.applTransactKindTrans,
                                this.applTransactKindTransLow,
                                this.applTransactKindBytes,
                                this.applTransactKindBytesLow,
                                this.applTransactKindTime
                            };
                        }
                        public static final class ApplTransactKindEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactKindEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactKind", "1.3.6.1.2.1.62.1.2.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactKindTransEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactKindTransEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactKindTrans", "1.3.6.1.2.1.62.1.2.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactKindTransLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactKindTransLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactKindTransLow", "1.3.6.1.2.1.62.1.2.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactKindBytesEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactKindBytesEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactKindBytes", "1.3.6.1.2.1.62.1.2.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactKindBytesLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactKindBytesLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactKindBytesLow", "1.3.6.1.2.1.62.1.2.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplTransactKindTimeEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplTransactKindTimeEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applTransactKindTime", "1.3.6.1.2.1.62.1.2.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class ApplPastChannelGroupEnt extends MIBEntry<APPLICATIONMIBDef>
            {
                /** ****************************************************************applPastChannelGroup - logged information on former channels.These tables control the collection of channel historyinformation and represent the accumulated historical data.*****************************************************************/
                public final ApplPastChannelControlTableEnt applPastChannelControlTable;

                /** ****************************************************************applPastChannelTable - Table of former channels*****************************************************************/
                public final ApplPastChannelTableEnt applPastChannelTable;

                /** ****************************************************************applPastFileTable - information specific to former files*****************************************************************/
                public final ApplPastFileTableEnt applPastFileTable;

                /** ****************************************************************applPastConTable - information specific to former connections*****************************************************************/
                public final ApplPastConTableEnt applPastConTable;

                /** ****************************************************************applPastTransStreamTable - historicalinformation for transaction stream monitoring*****************************************************************/
                public final ApplPastTransStreamTableEnt applPastTransStreamTable;

                /** ****************************************************************applPastTransFlowTable*****************************************************************/
                public final ApplPastTransFlowTableEnt applPastTransFlowTable;

                /** ****************************************************************applPastTransKindTable - transaction statistics broken downaccording to the kinds of transactions in each directionfor a transaction stream.*****************************************************************/
                public final ApplPastTransKindTableEnt applPastTransKindTable;

                private ApplPastChannelGroupEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                {
                    super(mib, parent, "applPastChannelGroup", "1.3.6.1.2.1.62.1.3", false, false, false, false);
                    this.applPastChannelControlTable = new ApplPastChannelControlTableEnt(mib, this);
                    this.applPastChannelTable = new ApplPastChannelTableEnt(mib, this);
                    this.applPastFileTable = new ApplPastFileTableEnt(mib, this);
                    this.applPastConTable = new ApplPastConTableEnt(mib, this);
                    this.applPastTransStreamTable = new ApplPastTransStreamTableEnt(mib, this);
                    this.applPastTransFlowTable = new ApplPastTransFlowTableEnt(mib, this);
                    this.applPastTransKindTable = new ApplPastTransKindTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.applPastChannelControlTable,
                        this.applPastChannelTable,
                        this.applPastFileTable,
                        this.applPastConTable,
                        this.applPastTransStreamTable,
                        this.applPastTransFlowTable,
                        this.applPastTransKindTable
                    };
                }
                public static final class ApplPastChannelControlTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplPastChannelControlEntryEnt applPastChannelControlEntry;

                    private ApplPastChannelControlTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applPastChannelControlTable", "1.3.6.1.2.1.62.1.3.1", false, true, false, false);
                        this.applPastChannelControlEntry = new ApplPastChannelControlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applPastChannelControlEntry
                        };
                    }
                    public static final class ApplPastChannelControlEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplPastChannelControlCollectEnt applPastChannelControlCollect;

                        public final ApplPastChannelControlMaxRowsEnt applPastChannelControlMaxRows;

                        public final ApplPastChannelControlTimeLimitEnt applPastChannelControlTimeLimit;

                        public final ApplPastChannelControlRemItemsEnt applPastChannelControlRemItems;

                        private ApplPastChannelControlEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applPastChannelControlEntry", "1.3.6.1.2.1.62.1.3.1.1", false, false, false, true);
                            this.applPastChannelControlCollect = new ApplPastChannelControlCollectEnt(mib, this);
                            this.applPastChannelControlMaxRows = new ApplPastChannelControlMaxRowsEnt(mib, this);
                            this.applPastChannelControlTimeLimit = new ApplPastChannelControlTimeLimitEnt(mib, this);
                            this.applPastChannelControlRemItems = new ApplPastChannelControlRemItemsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applPastChannelControlCollect,
                                this.applPastChannelControlMaxRows,
                                this.applPastChannelControlTimeLimit,
                                this.applPastChannelControlRemItems
                            };
                        }
                        public static final class ApplPastChannelControlCollectEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelControlCollectEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelControlCollect", "1.3.6.1.2.1.62.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastChannelControlMaxRowsEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelControlMaxRowsEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelControlMaxRows", "1.3.6.1.2.1.62.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastChannelControlTimeLimitEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelControlTimeLimitEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelControlTimeLimit", "1.3.6.1.2.1.62.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastChannelControlRemItemsEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelControlRemItemsEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelControlRemItems", "1.3.6.1.2.1.62.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ApplPastChannelTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplPastChannelEntryEnt applPastChannelEntry;

                    private ApplPastChannelTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applPastChannelTable", "1.3.6.1.2.1.62.1.3.2", false, true, false, false);
                        this.applPastChannelEntry = new ApplPastChannelEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applPastChannelEntry
                        };
                    }
                    public static final class ApplPastChannelEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplPastChannelIndexEnt applPastChannelIndex;

                        public final ApplPastChannelOpenTimeEnt applPastChannelOpenTime;

                        public final ApplPastChannelCloseTimeEnt applPastChannelCloseTime;

                        public final ApplPastChannelReadRequestsEnt applPastChannelReadRequests;

                        public final ApplPastChannelReadReqsLowEnt applPastChannelReadReqsLow;

                        public final ApplPastChannelReadFailuresEnt applPastChannelReadFailures;

                        public final ApplPastChannelBytesReadEnt applPastChannelBytesRead;

                        public final ApplPastChannelBytesReadLowEnt applPastChannelBytesReadLow;

                        public final ApplPastChannelLastReadTimeEnt applPastChannelLastReadTime;

                        public final ApplPastChannelWriteRequestsEnt applPastChannelWriteRequests;

                        public final ApplPastChannelWriteReqsLowEnt applPastChannelWriteReqsLow;

                        public final ApplPastChannelWriteFailuresEnt applPastChannelWriteFailures;

                        public final ApplPastChannelBytesWrittenEnt applPastChannelBytesWritten;

                        public final ApplPastChannelBytesWritLowEnt applPastChannelBytesWritLow;

                        public final ApplPastChannelLastWriteTimeEnt applPastChannelLastWriteTime;

                        private ApplPastChannelEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applPastChannelEntry", "1.3.6.1.2.1.62.1.3.2.1", false, false, false, true);
                            this.applPastChannelIndex = new ApplPastChannelIndexEnt(mib, this);
                            this.applPastChannelOpenTime = new ApplPastChannelOpenTimeEnt(mib, this);
                            this.applPastChannelCloseTime = new ApplPastChannelCloseTimeEnt(mib, this);
                            this.applPastChannelReadRequests = new ApplPastChannelReadRequestsEnt(mib, this);
                            this.applPastChannelReadReqsLow = new ApplPastChannelReadReqsLowEnt(mib, this);
                            this.applPastChannelReadFailures = new ApplPastChannelReadFailuresEnt(mib, this);
                            this.applPastChannelBytesRead = new ApplPastChannelBytesReadEnt(mib, this);
                            this.applPastChannelBytesReadLow = new ApplPastChannelBytesReadLowEnt(mib, this);
                            this.applPastChannelLastReadTime = new ApplPastChannelLastReadTimeEnt(mib, this);
                            this.applPastChannelWriteRequests = new ApplPastChannelWriteRequestsEnt(mib, this);
                            this.applPastChannelWriteReqsLow = new ApplPastChannelWriteReqsLowEnt(mib, this);
                            this.applPastChannelWriteFailures = new ApplPastChannelWriteFailuresEnt(mib, this);
                            this.applPastChannelBytesWritten = new ApplPastChannelBytesWrittenEnt(mib, this);
                            this.applPastChannelBytesWritLow = new ApplPastChannelBytesWritLowEnt(mib, this);
                            this.applPastChannelLastWriteTime = new ApplPastChannelLastWriteTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applPastChannelIndex,
                                this.applPastChannelOpenTime,
                                this.applPastChannelCloseTime,
                                this.applPastChannelReadRequests,
                                this.applPastChannelReadReqsLow,
                                this.applPastChannelReadFailures,
                                this.applPastChannelBytesRead,
                                this.applPastChannelBytesReadLow,
                                this.applPastChannelLastReadTime,
                                this.applPastChannelWriteRequests,
                                this.applPastChannelWriteReqsLow,
                                this.applPastChannelWriteFailures,
                                this.applPastChannelBytesWritten,
                                this.applPastChannelBytesWritLow,
                                this.applPastChannelLastWriteTime
                            };
                        }
                        public static final class ApplPastChannelIndexEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelIndexEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelIndex", "1.3.6.1.2.1.62.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastChannelOpenTimeEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelOpenTimeEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelOpenTime", "1.3.6.1.2.1.62.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastChannelCloseTimeEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelCloseTimeEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelCloseTime", "1.3.6.1.2.1.62.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastChannelReadRequestsEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelReadRequestsEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelReadRequests", "1.3.6.1.2.1.62.1.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastChannelReadReqsLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelReadReqsLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelReadReqsLow", "1.3.6.1.2.1.62.1.3.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastChannelReadFailuresEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelReadFailuresEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelReadFailures", "1.3.6.1.2.1.62.1.3.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastChannelBytesReadEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelBytesReadEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelBytesRead", "1.3.6.1.2.1.62.1.3.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastChannelBytesReadLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelBytesReadLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelBytesReadLow", "1.3.6.1.2.1.62.1.3.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastChannelLastReadTimeEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelLastReadTimeEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelLastReadTime", "1.3.6.1.2.1.62.1.3.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastChannelWriteRequestsEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelWriteRequestsEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelWriteRequests", "1.3.6.1.2.1.62.1.3.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastChannelWriteReqsLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelWriteReqsLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelWriteReqsLow", "1.3.6.1.2.1.62.1.3.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastChannelWriteFailuresEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelWriteFailuresEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelWriteFailures", "1.3.6.1.2.1.62.1.3.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastChannelBytesWrittenEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelBytesWrittenEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelBytesWritten", "1.3.6.1.2.1.62.1.3.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastChannelBytesWritLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelBytesWritLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelBytesWritLow", "1.3.6.1.2.1.62.1.3.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastChannelLastWriteTimeEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastChannelLastWriteTimeEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastChannelLastWriteTime", "1.3.6.1.2.1.62.1.3.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ApplPastFileTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplPastFileEntryEnt applPastFileEntry;

                    private ApplPastFileTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applPastFileTable", "1.3.6.1.2.1.62.1.3.3", false, true, false, false);
                        this.applPastFileEntry = new ApplPastFileEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applPastFileEntry
                        };
                    }
                    public static final class ApplPastFileEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplPastFileNameEnt applPastFileName;

                        public final ApplPastFileSizeHighEnt applPastFileSizeHigh;

                        public final ApplPastFileSizeLowEnt applPastFileSizeLow;

                        public final ApplPastFileModeEnt applPastFileMode;

                        private ApplPastFileEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applPastFileEntry", "1.3.6.1.2.1.62.1.3.3.1", false, false, false, true);
                            this.applPastFileName = new ApplPastFileNameEnt(mib, this);
                            this.applPastFileSizeHigh = new ApplPastFileSizeHighEnt(mib, this);
                            this.applPastFileSizeLow = new ApplPastFileSizeLowEnt(mib, this);
                            this.applPastFileMode = new ApplPastFileModeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applPastFileName,
                                this.applPastFileSizeHigh,
                                this.applPastFileSizeLow,
                                this.applPastFileMode
                            };
                        }
                        public static final class ApplPastFileNameEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastFileNameEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastFileName", "1.3.6.1.2.1.62.1.3.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastFileSizeHighEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastFileSizeHighEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastFileSizeHigh", "1.3.6.1.2.1.62.1.3.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastFileSizeLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastFileSizeLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastFileSizeLow", "1.3.6.1.2.1.62.1.3.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastFileModeEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastFileModeEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastFileMode", "1.3.6.1.2.1.62.1.3.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ApplPastConTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplPastConEntryEnt applPastConEntry;

                    private ApplPastConTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applPastConTable", "1.3.6.1.2.1.62.1.3.4", false, true, false, false);
                        this.applPastConEntry = new ApplPastConEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applPastConEntry
                        };
                    }
                    public static final class ApplPastConEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplPastConTransportEnt applPastConTransport;

                        public final ApplPastConNearEndAddrEnt applPastConNearEndAddr;

                        public final ApplPastConNearEndpointEnt applPastConNearEndpoint;

                        public final ApplPastConFarEndAddrEnt applPastConFarEndAddr;

                        public final ApplPastConFarEndpointEnt applPastConFarEndpoint;

                        public final ApplPastConApplicationEnt applPastConApplication;

                        private ApplPastConEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applPastConEntry", "1.3.6.1.2.1.62.1.3.4.1", false, false, false, true);
                            this.applPastConTransport = new ApplPastConTransportEnt(mib, this);
                            this.applPastConNearEndAddr = new ApplPastConNearEndAddrEnt(mib, this);
                            this.applPastConNearEndpoint = new ApplPastConNearEndpointEnt(mib, this);
                            this.applPastConFarEndAddr = new ApplPastConFarEndAddrEnt(mib, this);
                            this.applPastConFarEndpoint = new ApplPastConFarEndpointEnt(mib, this);
                            this.applPastConApplication = new ApplPastConApplicationEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applPastConTransport,
                                this.applPastConNearEndAddr,
                                this.applPastConNearEndpoint,
                                this.applPastConFarEndAddr,
                                this.applPastConFarEndpoint,
                                this.applPastConApplication
                            };
                        }
                        public static final class ApplPastConTransportEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastConTransportEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastConTransport", "1.3.6.1.2.1.62.1.3.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastConNearEndAddrEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastConNearEndAddrEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastConNearEndAddr", "1.3.6.1.2.1.62.1.3.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastConNearEndpointEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastConNearEndpointEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastConNearEndpoint", "1.3.6.1.2.1.62.1.3.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastConFarEndAddrEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastConFarEndAddrEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastConFarEndAddr", "1.3.6.1.2.1.62.1.3.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastConFarEndpointEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastConFarEndpointEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastConFarEndpoint", "1.3.6.1.2.1.62.1.3.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastConApplicationEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastConApplicationEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastConApplication", "1.3.6.1.2.1.62.1.3.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ApplPastTransStreamTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplPastTransStreamEntryEnt applPastTransStreamEntry;

                    private ApplPastTransStreamTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applPastTransStreamTable", "1.3.6.1.2.1.62.1.3.5", false, true, false, false);
                        this.applPastTransStreamEntry = new ApplPastTransStreamEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applPastTransStreamEntry
                        };
                    }
                    public static final class ApplPastTransStreamEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplPastTransStreamDescrEnt applPastTransStreamDescr;

                        public final ApplPastTransStreamUnitOfWorkEnt applPastTransStreamUnitOfWork;

                        public final ApplPastTransStreamInvokesEnt applPastTransStreamInvokes;

                        public final ApplPastTransStreamInvokesLowEnt applPastTransStreamInvokesLow;

                        public final ApplPastTransStreamInvCumTimesEnt applPastTransStreamInvCumTimes;

                        public final ApplPastTransStreamInvRspTimesEnt applPastTransStreamInvRspTimes;

                        public final ApplPastTransStreamPerformsEnt applPastTransStreamPerforms;

                        public final ApplPastTransStreamPerformsLowEnt applPastTransStreamPerformsLow;

                        public final ApplPastTransStreamPrfCumTimesEnt applPastTransStreamPrfCumTimes;

                        public final ApplPastTransStreamPrfRspTimesEnt applPastTransStreamPrfRspTimes;

                        private ApplPastTransStreamEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applPastTransStreamEntry", "1.3.6.1.2.1.62.1.3.5.1", false, false, false, true);
                            this.applPastTransStreamDescr = new ApplPastTransStreamDescrEnt(mib, this);
                            this.applPastTransStreamUnitOfWork = new ApplPastTransStreamUnitOfWorkEnt(mib, this);
                            this.applPastTransStreamInvokes = new ApplPastTransStreamInvokesEnt(mib, this);
                            this.applPastTransStreamInvokesLow = new ApplPastTransStreamInvokesLowEnt(mib, this);
                            this.applPastTransStreamInvCumTimes = new ApplPastTransStreamInvCumTimesEnt(mib, this);
                            this.applPastTransStreamInvRspTimes = new ApplPastTransStreamInvRspTimesEnt(mib, this);
                            this.applPastTransStreamPerforms = new ApplPastTransStreamPerformsEnt(mib, this);
                            this.applPastTransStreamPerformsLow = new ApplPastTransStreamPerformsLowEnt(mib, this);
                            this.applPastTransStreamPrfCumTimes = new ApplPastTransStreamPrfCumTimesEnt(mib, this);
                            this.applPastTransStreamPrfRspTimes = new ApplPastTransStreamPrfRspTimesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applPastTransStreamDescr,
                                this.applPastTransStreamUnitOfWork,
                                this.applPastTransStreamInvokes,
                                this.applPastTransStreamInvokesLow,
                                this.applPastTransStreamInvCumTimes,
                                this.applPastTransStreamInvRspTimes,
                                this.applPastTransStreamPerforms,
                                this.applPastTransStreamPerformsLow,
                                this.applPastTransStreamPrfCumTimes,
                                this.applPastTransStreamPrfRspTimes
                            };
                        }
                        public static final class ApplPastTransStreamDescrEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransStreamDescrEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransStreamDescr", "1.3.6.1.2.1.62.1.3.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransStreamUnitOfWorkEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransStreamUnitOfWorkEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransStreamUnitOfWork", "1.3.6.1.2.1.62.1.3.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransStreamInvokesEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransStreamInvokesEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransStreamInvokes", "1.3.6.1.2.1.62.1.3.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransStreamInvokesLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransStreamInvokesLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransStreamInvokesLow", "1.3.6.1.2.1.62.1.3.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransStreamInvCumTimesEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransStreamInvCumTimesEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransStreamInvCumTimes", "1.3.6.1.2.1.62.1.3.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransStreamInvRspTimesEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransStreamInvRspTimesEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransStreamInvRspTimes", "1.3.6.1.2.1.62.1.3.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransStreamPerformsEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransStreamPerformsEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransStreamPerforms", "1.3.6.1.2.1.62.1.3.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransStreamPerformsLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransStreamPerformsLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransStreamPerformsLow", "1.3.6.1.2.1.62.1.3.5.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransStreamPrfCumTimesEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransStreamPrfCumTimesEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransStreamPrfCumTimes", "1.3.6.1.2.1.62.1.3.5.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransStreamPrfRspTimesEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransStreamPrfRspTimesEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransStreamPrfRspTimes", "1.3.6.1.2.1.62.1.3.5.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ApplPastTransFlowTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplPastTransFlowEntryEnt applPastTransFlowEntry;

                    private ApplPastTransFlowTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applPastTransFlowTable", "1.3.6.1.2.1.62.1.3.6", false, true, false, false);
                        this.applPastTransFlowEntry = new ApplPastTransFlowEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applPastTransFlowEntry
                        };
                    }
                    public static final class ApplPastTransFlowEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplPastTransFlowDirectionEnt applPastTransFlowDirection;

                        public final ApplPastTransFlowReqRspEnt applPastTransFlowReqRsp;

                        public final ApplPastTransFlowTransEnt applPastTransFlowTrans;

                        public final ApplPastTransFlowTransLowEnt applPastTransFlowTransLow;

                        public final ApplPastTransFlowBytesEnt applPastTransFlowBytes;

                        public final ApplPastTransFlowBytesLowEnt applPastTransFlowBytesLow;

                        public final ApplPastTransFlowTimeEnt applPastTransFlowTime;

                        private ApplPastTransFlowEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applPastTransFlowEntry", "1.3.6.1.2.1.62.1.3.6.1", false, false, false, true);
                            this.applPastTransFlowDirection = new ApplPastTransFlowDirectionEnt(mib, this);
                            this.applPastTransFlowReqRsp = new ApplPastTransFlowReqRspEnt(mib, this);
                            this.applPastTransFlowTrans = new ApplPastTransFlowTransEnt(mib, this);
                            this.applPastTransFlowTransLow = new ApplPastTransFlowTransLowEnt(mib, this);
                            this.applPastTransFlowBytes = new ApplPastTransFlowBytesEnt(mib, this);
                            this.applPastTransFlowBytesLow = new ApplPastTransFlowBytesLowEnt(mib, this);
                            this.applPastTransFlowTime = new ApplPastTransFlowTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applPastTransFlowDirection,
                                this.applPastTransFlowReqRsp,
                                this.applPastTransFlowTrans,
                                this.applPastTransFlowTransLow,
                                this.applPastTransFlowBytes,
                                this.applPastTransFlowBytesLow,
                                this.applPastTransFlowTime
                            };
                        }
                        public static final class ApplPastTransFlowDirectionEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransFlowDirectionEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransFlowDirection", "1.3.6.1.2.1.62.1.3.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransFlowReqRspEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransFlowReqRspEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransFlowReqRsp", "1.3.6.1.2.1.62.1.3.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransFlowTransEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransFlowTransEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransFlowTrans", "1.3.6.1.2.1.62.1.3.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransFlowTransLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransFlowTransLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransFlowTransLow", "1.3.6.1.2.1.62.1.3.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransFlowBytesEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransFlowBytesEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransFlowBytes", "1.3.6.1.2.1.62.1.3.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransFlowBytesLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransFlowBytesLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransFlowBytesLow", "1.3.6.1.2.1.62.1.3.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransFlowTimeEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransFlowTimeEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransFlowTime", "1.3.6.1.2.1.62.1.3.6.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ApplPastTransKindTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplPastTransKindEntryEnt applPastTransKindEntry;

                    private ApplPastTransKindTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applPastTransKindTable", "1.3.6.1.2.1.62.1.3.7", false, true, false, false);
                        this.applPastTransKindEntry = new ApplPastTransKindEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applPastTransKindEntry
                        };
                    }
                    public static final class ApplPastTransKindEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplPastTransKindEnt applPastTransKind;

                        public final ApplPastTransKindTransEnt applPastTransKindTrans;

                        public final ApplPastTransKindTransLowEnt applPastTransKindTransLow;

                        public final ApplPastTransKindBytesEnt applPastTransKindBytes;

                        public final ApplPastTransKindBytesLowEnt applPastTransKindBytesLow;

                        public final ApplPastTransKindTimeEnt applPastTransKindTime;

                        private ApplPastTransKindEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applPastTransKindEntry", "1.3.6.1.2.1.62.1.3.7.1", false, false, false, true);
                            this.applPastTransKind = new ApplPastTransKindEnt(mib, this);
                            this.applPastTransKindTrans = new ApplPastTransKindTransEnt(mib, this);
                            this.applPastTransKindTransLow = new ApplPastTransKindTransLowEnt(mib, this);
                            this.applPastTransKindBytes = new ApplPastTransKindBytesEnt(mib, this);
                            this.applPastTransKindBytesLow = new ApplPastTransKindBytesLowEnt(mib, this);
                            this.applPastTransKindTime = new ApplPastTransKindTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applPastTransKind,
                                this.applPastTransKindTrans,
                                this.applPastTransKindTransLow,
                                this.applPastTransKindBytes,
                                this.applPastTransKindBytesLow,
                                this.applPastTransKindTime
                            };
                        }
                        public static final class ApplPastTransKindEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransKindEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransKind", "1.3.6.1.2.1.62.1.3.7.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransKindTransEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransKindTransEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransKindTrans", "1.3.6.1.2.1.62.1.3.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransKindTransLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransKindTransLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransKindTransLow", "1.3.6.1.2.1.62.1.3.7.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransKindBytesEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransKindBytesEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransKindBytes", "1.3.6.1.2.1.62.1.3.7.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransKindBytesLowEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransKindBytesLowEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransKindBytesLow", "1.3.6.1.2.1.62.1.3.7.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplPastTransKindTimeEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplPastTransKindTimeEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applPastTransKindTime", "1.3.6.1.2.1.62.1.3.7.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class ApplElmtRunControlGroupEnt extends MIBEntry<APPLICATIONMIBDef>
            {
                /** ****************************************************************applElmtRunControlGroup - monitor and control runningapplication elements*****************************************************************/
                public final ApplElmtRunStatusTableEnt applElmtRunStatusTable;

                /** ****************************************************************applElmtRunControlTable - control running applicationelements*****************************************************************/
                public final ApplElmtRunControlTableEnt applElmtRunControlTable;

                private ApplElmtRunControlGroupEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                {
                    super(mib, parent, "applElmtRunControlGroup", "1.3.6.1.2.1.62.1.4", false, false, false, false);
                    this.applElmtRunStatusTable = new ApplElmtRunStatusTableEnt(mib, this);
                    this.applElmtRunControlTable = new ApplElmtRunControlTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.applElmtRunStatusTable,
                        this.applElmtRunControlTable
                    };
                }
                public static final class ApplElmtRunStatusTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplElmtRunStatusEntryEnt applElmtRunStatusEntry;

                    private ApplElmtRunStatusTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applElmtRunStatusTable", "1.3.6.1.2.1.62.1.4.1", false, true, false, false);
                        this.applElmtRunStatusEntry = new ApplElmtRunStatusEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applElmtRunStatusEntry
                        };
                    }
                    public static final class ApplElmtRunStatusEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplElmtRunStatusSuspendedEnt applElmtRunStatusSuspended;

                        public final ApplElmtRunStatusHeapUsageEnt applElmtRunStatusHeapUsage;

                        public final ApplElmtRunStatusOpenConnectionsEnt applElmtRunStatusOpenConnections;

                        public final ApplElmtRunStatusOpenFilesEnt applElmtRunStatusOpenFiles;

                        public final ApplElmtRunStatusLastErrorMsgEnt applElmtRunStatusLastErrorMsg;

                        public final ApplElmtRunStatusLastErrorTimeEnt applElmtRunStatusLastErrorTime;

                        private ApplElmtRunStatusEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applElmtRunStatusEntry", "1.3.6.1.2.1.62.1.4.1.1", false, false, false, true);
                            this.applElmtRunStatusSuspended = new ApplElmtRunStatusSuspendedEnt(mib, this);
                            this.applElmtRunStatusHeapUsage = new ApplElmtRunStatusHeapUsageEnt(mib, this);
                            this.applElmtRunStatusOpenConnections = new ApplElmtRunStatusOpenConnectionsEnt(mib, this);
                            this.applElmtRunStatusOpenFiles = new ApplElmtRunStatusOpenFilesEnt(mib, this);
                            this.applElmtRunStatusLastErrorMsg = new ApplElmtRunStatusLastErrorMsgEnt(mib, this);
                            this.applElmtRunStatusLastErrorTime = new ApplElmtRunStatusLastErrorTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applElmtRunStatusSuspended,
                                this.applElmtRunStatusHeapUsage,
                                this.applElmtRunStatusOpenConnections,
                                this.applElmtRunStatusOpenFiles,
                                this.applElmtRunStatusLastErrorMsg,
                                this.applElmtRunStatusLastErrorTime
                            };
                        }
                        public static final class ApplElmtRunStatusSuspendedEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplElmtRunStatusSuspendedEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applElmtRunStatusSuspended", "1.3.6.1.2.1.62.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplElmtRunStatusHeapUsageEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplElmtRunStatusHeapUsageEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applElmtRunStatusHeapUsage", "1.3.6.1.2.1.62.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplElmtRunStatusOpenConnectionsEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplElmtRunStatusOpenConnectionsEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applElmtRunStatusOpenConnections", "1.3.6.1.2.1.62.1.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplElmtRunStatusOpenFilesEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplElmtRunStatusOpenFilesEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applElmtRunStatusOpenFiles", "1.3.6.1.2.1.62.1.4.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplElmtRunStatusLastErrorMsgEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplElmtRunStatusLastErrorMsgEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applElmtRunStatusLastErrorMsg", "1.3.6.1.2.1.62.1.4.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplElmtRunStatusLastErrorTimeEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplElmtRunStatusLastErrorTimeEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applElmtRunStatusLastErrorTime", "1.3.6.1.2.1.62.1.4.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ApplElmtRunControlTableEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    public final ApplElmtRunControlEntryEnt applElmtRunControlEntry;

                    private ApplElmtRunControlTableEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applElmtRunControlTable", "1.3.6.1.2.1.62.1.4.2", false, true, false, false);
                        this.applElmtRunControlEntry = new ApplElmtRunControlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.applElmtRunControlEntry
                        };
                    }
                    public static final class ApplElmtRunControlEntryEnt extends MIBEntry<APPLICATIONMIBDef>
                    {
                        public final ApplElmtRunControlSuspendEnt applElmtRunControlSuspend;

                        public final ApplElmtRunControlReconfigureEnt applElmtRunControlReconfigure;

                        public final ApplElmtRunControlTerminateEnt applElmtRunControlTerminate;

                        private ApplElmtRunControlEntryEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                        {
                            super(mib, parent, "applElmtRunControlEntry", "1.3.6.1.2.1.62.1.4.2.1", false, false, false, true);
                            this.applElmtRunControlSuspend = new ApplElmtRunControlSuspendEnt(mib, this);
                            this.applElmtRunControlReconfigure = new ApplElmtRunControlReconfigureEnt(mib, this);
                            this.applElmtRunControlTerminate = new ApplElmtRunControlTerminateEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.applElmtRunControlSuspend,
                                this.applElmtRunControlReconfigure,
                                this.applElmtRunControlTerminate
                            };
                        }
                        public static final class ApplElmtRunControlSuspendEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplElmtRunControlSuspendEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applElmtRunControlSuspend", "1.3.6.1.2.1.62.1.4.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplElmtRunControlReconfigureEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplElmtRunControlReconfigureEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applElmtRunControlReconfigure", "1.3.6.1.2.1.62.1.4.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ApplElmtRunControlTerminateEnt extends MIBEntry<APPLICATIONMIBDef>
                        {
                            private ApplElmtRunControlTerminateEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                            {
                                super(mib, parent, "applElmtRunControlTerminate", "1.3.6.1.2.1.62.1.4.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class ApplicationMibConformanceEnt extends MIBEntry<APPLICATIONMIBDef>
        {
            /** ****************************************************************Conformance requirements*****************************************************************/
            public final ApplicationMibGroupsEnt applicationMibGroups;

            public final ApplicationMibComplianceEnt applicationMibCompliance;

            private ApplicationMibConformanceEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
            {
                super(mib, parent, "applicationMibConformance", "1.3.6.1.2.1.62.2", false, false, false, false);
                this.applicationMibGroups = new ApplicationMibGroupsEnt(mib, this);
                this.applicationMibCompliance = new ApplicationMibComplianceEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.applicationMibGroups,
                    this.applicationMibCompliance
                };
            }
            public static final class ApplicationMibGroupsEnt extends MIBEntry<APPLICATIONMIBDef>
            {
                public final ApplicationMonitorGroupEnt applicationMonitorGroup;

                public final ApplicationFastMonitorGroupEnt applicationFastMonitorGroup;

                public final ApplicationTransactGroupEnt applicationTransactGroup;

                public final ApplicationFastTransactGroupEnt applicationFastTransactGroup;

                public final ApplicationHistoryGroupEnt applicationHistoryGroup;

                public final ApplicationFastHistoryGroupEnt applicationFastHistoryGroup;

                public final ApplicationTransHistoryGroupEnt applicationTransHistoryGroup;

                public final ApplicationFastTransHistoryGroupEnt applicationFastTransHistoryGroup;

                public final ApplicationRunGroupEnt applicationRunGroup;

                private ApplicationMibGroupsEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                {
                    super(mib, parent, "applicationMibGroups", "1.3.6.1.2.1.62.2.1", false, false, false, false);
                    this.applicationMonitorGroup = new ApplicationMonitorGroupEnt(mib, this);
                    this.applicationFastMonitorGroup = new ApplicationFastMonitorGroupEnt(mib, this);
                    this.applicationTransactGroup = new ApplicationTransactGroupEnt(mib, this);
                    this.applicationFastTransactGroup = new ApplicationFastTransactGroupEnt(mib, this);
                    this.applicationHistoryGroup = new ApplicationHistoryGroupEnt(mib, this);
                    this.applicationFastHistoryGroup = new ApplicationFastHistoryGroupEnt(mib, this);
                    this.applicationTransHistoryGroup = new ApplicationTransHistoryGroupEnt(mib, this);
                    this.applicationFastTransHistoryGroup = new ApplicationFastTransHistoryGroupEnt(mib, this);
                    this.applicationRunGroup = new ApplicationRunGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.applicationMonitorGroup,
                        this.applicationFastMonitorGroup,
                        this.applicationTransactGroup,
                        this.applicationFastTransactGroup,
                        this.applicationHistoryGroup,
                        this.applicationFastHistoryGroup,
                        this.applicationTransHistoryGroup,
                        this.applicationFastTransHistoryGroup,
                        this.applicationRunGroup
                    };
                }
                public static final class ApplicationMonitorGroupEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    private ApplicationMonitorGroupEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applicationMonitorGroup", "1.3.6.1.2.1.62.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplicationFastMonitorGroupEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    private ApplicationFastMonitorGroupEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applicationFastMonitorGroup", "1.3.6.1.2.1.62.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplicationTransactGroupEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    private ApplicationTransactGroupEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applicationTransactGroup", "1.3.6.1.2.1.62.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplicationFastTransactGroupEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    private ApplicationFastTransactGroupEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applicationFastTransactGroup", "1.3.6.1.2.1.62.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplicationHistoryGroupEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    private ApplicationHistoryGroupEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applicationHistoryGroup", "1.3.6.1.2.1.62.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplicationFastHistoryGroupEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    private ApplicationFastHistoryGroupEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applicationFastHistoryGroup", "1.3.6.1.2.1.62.2.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplicationTransHistoryGroupEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    private ApplicationTransHistoryGroupEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applicationTransHistoryGroup", "1.3.6.1.2.1.62.2.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplicationFastTransHistoryGroupEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    private ApplicationFastTransHistoryGroupEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applicationFastTransHistoryGroup", "1.3.6.1.2.1.62.2.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ApplicationRunGroupEnt extends MIBEntry<APPLICATIONMIBDef>
                {
                    private ApplicationRunGroupEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                    {
                        super(mib, parent, "applicationRunGroup", "1.3.6.1.2.1.62.2.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class ApplicationMibComplianceEnt extends MIBEntry<APPLICATIONMIBDef>
            {
                private ApplicationMibComplianceEnt(APPLICATIONMIBDef mib, MIBEntry<APPLICATIONMIBDef> parent)
                {
                    super(mib, parent, "applicationMibCompliance", "1.3.6.1.2.1.62.2.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
