package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class WWWMIBDef extends MIB
{
    public static final WWWMIBDef WWWMIB = new WWWMIBDef();

    public final WwwMIBEnt wwwMIB;

    private WWWMIBDef()
    {
        super("WWW-MIB");
        this.wwwMIB = new WwwMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.wwwMIB
        };
    }

    public static final class WwwMIBEnt extends MIBEntry<WWWMIBDef>
    {
        /** Object Identifier Assignments*/
        public final WwwMIBObjectsEnt wwwMIBObjects;

        public final WwwMIBConformanceEnt wwwMIBConformance;

        private WwwMIBEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
        {
            super(mib, parent, "wwwMIB", "1.3.6.1.2.1.65", false, false, false, false);
            this.wwwMIBObjects = new WwwMIBObjectsEnt(mib, this);
            this.wwwMIBConformance = new WwwMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.wwwMIBObjects,
                this.wwwMIBConformance
            };
        }
        public static final class WwwMIBObjectsEnt extends MIBEntry<WWWMIBDef>
        {
            /** The WWW Service Information GroupThe WWW service information group contains information aboutthe WWW services known by the SNMP agent.*/
            public final WwwServiceEnt wwwService;

            /** The WWW Protocol Statistics GroupThe WWW protocol statistics group contains statistics aboutthe DTP requests and responses sent or received.*/
            public final WwwProtocolStatisticsEnt wwwProtocolStatistics;

            /** The WWW Document Statistics GroupThe WWW document statistics group contains statistics aboutdocument read attempts.*/
            public final WwwDocumentStatisticsEnt wwwDocumentStatistics;

            private WwwMIBObjectsEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
            {
                super(mib, parent, "wwwMIBObjects", "1.3.6.1.2.1.65.1", false, false, false, false);
                this.wwwService = new WwwServiceEnt(mib, this);
                this.wwwProtocolStatistics = new WwwProtocolStatisticsEnt(mib, this);
                this.wwwDocumentStatistics = new WwwDocumentStatisticsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.wwwService,
                    this.wwwProtocolStatistics,
                    this.wwwDocumentStatistics
                };
            }
            public static final class WwwServiceEnt extends MIBEntry<WWWMIBDef>
            {
                public final WwwServiceTableEnt wwwServiceTable;

                private WwwServiceEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                {
                    super(mib, parent, "wwwService", "1.3.6.1.2.1.65.1.1", false, false, false, false);
                    this.wwwServiceTable = new WwwServiceTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.wwwServiceTable
                    };
                }
                public static final class WwwServiceTableEnt extends MIBEntry<WWWMIBDef>
                {
                    public final WwwServiceEntryEnt wwwServiceEntry;

                    private WwwServiceTableEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwServiceTable", "1.3.6.1.2.1.65.1.1.1", false, true, false, false);
                        this.wwwServiceEntry = new WwwServiceEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.wwwServiceEntry
                        };
                    }
                    public static final class WwwServiceEntryEnt extends MIBEntry<WWWMIBDef>
                    {
                        public final WwwServiceIndexEnt wwwServiceIndex;

                        public final WwwServiceDescriptionEnt wwwServiceDescription;

                        public final WwwServiceContactEnt wwwServiceContact;

                        public final WwwServiceProtocolEnt wwwServiceProtocol;

                        public final WwwServiceNameEnt wwwServiceName;

                        public final WwwServiceTypeEnt wwwServiceType;

                        public final WwwServiceStartTimeEnt wwwServiceStartTime;

                        public final WwwServiceOperStatusEnt wwwServiceOperStatus;

                        public final WwwServiceLastChangeEnt wwwServiceLastChange;

                        private WwwServiceEntryEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                        {
                            super(mib, parent, "wwwServiceEntry", "1.3.6.1.2.1.65.1.1.1.1", false, false, false, true);
                            this.wwwServiceIndex = new WwwServiceIndexEnt(mib, this);
                            this.wwwServiceDescription = new WwwServiceDescriptionEnt(mib, this);
                            this.wwwServiceContact = new WwwServiceContactEnt(mib, this);
                            this.wwwServiceProtocol = new WwwServiceProtocolEnt(mib, this);
                            this.wwwServiceName = new WwwServiceNameEnt(mib, this);
                            this.wwwServiceType = new WwwServiceTypeEnt(mib, this);
                            this.wwwServiceStartTime = new WwwServiceStartTimeEnt(mib, this);
                            this.wwwServiceOperStatus = new WwwServiceOperStatusEnt(mib, this);
                            this.wwwServiceLastChange = new WwwServiceLastChangeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.wwwServiceIndex,
                                this.wwwServiceDescription,
                                this.wwwServiceContact,
                                this.wwwServiceProtocol,
                                this.wwwServiceName,
                                this.wwwServiceType,
                                this.wwwServiceStartTime,
                                this.wwwServiceOperStatus,
                                this.wwwServiceLastChange
                            };
                        }
                        public static final class WwwServiceIndexEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwServiceIndexEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwServiceIndex", "1.3.6.1.2.1.65.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwServiceDescriptionEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwServiceDescriptionEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwServiceDescription", "1.3.6.1.2.1.65.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwServiceContactEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwServiceContactEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwServiceContact", "1.3.6.1.2.1.65.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwServiceProtocolEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwServiceProtocolEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwServiceProtocol", "1.3.6.1.2.1.65.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwServiceNameEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwServiceNameEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwServiceName", "1.3.6.1.2.1.65.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwServiceTypeEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwServiceTypeEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwServiceType", "1.3.6.1.2.1.65.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwServiceStartTimeEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwServiceStartTimeEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwServiceStartTime", "1.3.6.1.2.1.65.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwServiceOperStatusEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwServiceOperStatusEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwServiceOperStatus", "1.3.6.1.2.1.65.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwServiceLastChangeEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwServiceLastChangeEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwServiceLastChange", "1.3.6.1.2.1.65.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class WwwProtocolStatisticsEnt extends MIBEntry<WWWMIBDef>
            {
                public final WwwSummaryTableEnt wwwSummaryTable;

                /** The WWW request tables contain detailed information aboutrequests send or received by WWW services.*/
                public final WwwRequestInTableEnt wwwRequestInTable;

                public final WwwRequestOutTableEnt wwwRequestOutTable;

                /** The WWW response tables contain detailed information aboutresponses sent or received by WWW services.*/
                public final WwwResponseInTableEnt wwwResponseInTable;

                public final WwwResponseOutTableEnt wwwResponseOutTable;

                private WwwProtocolStatisticsEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                {
                    super(mib, parent, "wwwProtocolStatistics", "1.3.6.1.2.1.65.1.2", false, false, false, false);
                    this.wwwSummaryTable = new WwwSummaryTableEnt(mib, this);
                    this.wwwRequestInTable = new WwwRequestInTableEnt(mib, this);
                    this.wwwRequestOutTable = new WwwRequestOutTableEnt(mib, this);
                    this.wwwResponseInTable = new WwwResponseInTableEnt(mib, this);
                    this.wwwResponseOutTable = new WwwResponseOutTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.wwwSummaryTable,
                        this.wwwRequestInTable,
                        this.wwwRequestOutTable,
                        this.wwwResponseInTable,
                        this.wwwResponseOutTable
                    };
                }
                public static final class WwwSummaryTableEnt extends MIBEntry<WWWMIBDef>
                {
                    public final WwwSummaryEntryEnt wwwSummaryEntry;

                    private WwwSummaryTableEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwSummaryTable", "1.3.6.1.2.1.65.1.2.1", false, true, false, false);
                        this.wwwSummaryEntry = new WwwSummaryEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.wwwSummaryEntry
                        };
                    }
                    public static final class WwwSummaryEntryEnt extends MIBEntry<WWWMIBDef>
                    {
                        public final WwwSummaryInRequestsEnt wwwSummaryInRequests;

                        public final WwwSummaryOutRequestsEnt wwwSummaryOutRequests;

                        public final WwwSummaryInResponsesEnt wwwSummaryInResponses;

                        public final WwwSummaryOutResponsesEnt wwwSummaryOutResponses;

                        public final WwwSummaryInBytesEnt wwwSummaryInBytes;

                        public final WwwSummaryInLowBytesEnt wwwSummaryInLowBytes;

                        public final WwwSummaryOutBytesEnt wwwSummaryOutBytes;

                        public final WwwSummaryOutLowBytesEnt wwwSummaryOutLowBytes;

                        private WwwSummaryEntryEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                        {
                            super(mib, parent, "wwwSummaryEntry", "1.3.6.1.2.1.65.1.2.1.1", false, false, false, true);
                            this.wwwSummaryInRequests = new WwwSummaryInRequestsEnt(mib, this);
                            this.wwwSummaryOutRequests = new WwwSummaryOutRequestsEnt(mib, this);
                            this.wwwSummaryInResponses = new WwwSummaryInResponsesEnt(mib, this);
                            this.wwwSummaryOutResponses = new WwwSummaryOutResponsesEnt(mib, this);
                            this.wwwSummaryInBytes = new WwwSummaryInBytesEnt(mib, this);
                            this.wwwSummaryInLowBytes = new WwwSummaryInLowBytesEnt(mib, this);
                            this.wwwSummaryOutBytes = new WwwSummaryOutBytesEnt(mib, this);
                            this.wwwSummaryOutLowBytes = new WwwSummaryOutLowBytesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.wwwSummaryInRequests,
                                this.wwwSummaryOutRequests,
                                this.wwwSummaryInResponses,
                                this.wwwSummaryOutResponses,
                                this.wwwSummaryInBytes,
                                this.wwwSummaryInLowBytes,
                                this.wwwSummaryOutBytes,
                                this.wwwSummaryOutLowBytes
                            };
                        }
                        public static final class WwwSummaryInRequestsEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwSummaryInRequestsEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwSummaryInRequests", "1.3.6.1.2.1.65.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwSummaryOutRequestsEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwSummaryOutRequestsEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwSummaryOutRequests", "1.3.6.1.2.1.65.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwSummaryInResponsesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwSummaryInResponsesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwSummaryInResponses", "1.3.6.1.2.1.65.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwSummaryOutResponsesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwSummaryOutResponsesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwSummaryOutResponses", "1.3.6.1.2.1.65.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwSummaryInBytesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwSummaryInBytesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwSummaryInBytes", "1.3.6.1.2.1.65.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwSummaryInLowBytesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwSummaryInLowBytesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwSummaryInLowBytes", "1.3.6.1.2.1.65.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwSummaryOutBytesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwSummaryOutBytesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwSummaryOutBytes", "1.3.6.1.2.1.65.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwSummaryOutLowBytesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwSummaryOutLowBytesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwSummaryOutLowBytes", "1.3.6.1.2.1.65.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class WwwRequestInTableEnt extends MIBEntry<WWWMIBDef>
                {
                    public final WwwRequestInEntryEnt wwwRequestInEntry;

                    private WwwRequestInTableEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwRequestInTable", "1.3.6.1.2.1.65.1.2.2", false, true, false, false);
                        this.wwwRequestInEntry = new WwwRequestInEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.wwwRequestInEntry
                        };
                    }
                    public static final class WwwRequestInEntryEnt extends MIBEntry<WWWMIBDef>
                    {
                        public final WwwRequestInIndexEnt wwwRequestInIndex;

                        public final WwwRequestInRequestsEnt wwwRequestInRequests;

                        public final WwwRequestInBytesEnt wwwRequestInBytes;

                        public final WwwRequestInLastTimeEnt wwwRequestInLastTime;

                        private WwwRequestInEntryEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                        {
                            super(mib, parent, "wwwRequestInEntry", "1.3.6.1.2.1.65.1.2.2.1", false, false, false, true);
                            this.wwwRequestInIndex = new WwwRequestInIndexEnt(mib, this);
                            this.wwwRequestInRequests = new WwwRequestInRequestsEnt(mib, this);
                            this.wwwRequestInBytes = new WwwRequestInBytesEnt(mib, this);
                            this.wwwRequestInLastTime = new WwwRequestInLastTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.wwwRequestInIndex,
                                this.wwwRequestInRequests,
                                this.wwwRequestInBytes,
                                this.wwwRequestInLastTime
                            };
                        }
                        public static final class WwwRequestInIndexEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwRequestInIndexEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwRequestInIndex", "1.3.6.1.2.1.65.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwRequestInRequestsEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwRequestInRequestsEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwRequestInRequests", "1.3.6.1.2.1.65.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwRequestInBytesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwRequestInBytesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwRequestInBytes", "1.3.6.1.2.1.65.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwRequestInLastTimeEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwRequestInLastTimeEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwRequestInLastTime", "1.3.6.1.2.1.65.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class WwwRequestOutTableEnt extends MIBEntry<WWWMIBDef>
                {
                    public final WwwRequestOutEntryEnt wwwRequestOutEntry;

                    private WwwRequestOutTableEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwRequestOutTable", "1.3.6.1.2.1.65.1.2.3", false, true, false, false);
                        this.wwwRequestOutEntry = new WwwRequestOutEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.wwwRequestOutEntry
                        };
                    }
                    public static final class WwwRequestOutEntryEnt extends MIBEntry<WWWMIBDef>
                    {
                        public final WwwRequestOutIndexEnt wwwRequestOutIndex;

                        public final WwwRequestOutRequestsEnt wwwRequestOutRequests;

                        public final WwwRequestOutBytesEnt wwwRequestOutBytes;

                        public final WwwRequestOutLastTimeEnt wwwRequestOutLastTime;

                        private WwwRequestOutEntryEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                        {
                            super(mib, parent, "wwwRequestOutEntry", "1.3.6.1.2.1.65.1.2.3.1", false, false, false, true);
                            this.wwwRequestOutIndex = new WwwRequestOutIndexEnt(mib, this);
                            this.wwwRequestOutRequests = new WwwRequestOutRequestsEnt(mib, this);
                            this.wwwRequestOutBytes = new WwwRequestOutBytesEnt(mib, this);
                            this.wwwRequestOutLastTime = new WwwRequestOutLastTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.wwwRequestOutIndex,
                                this.wwwRequestOutRequests,
                                this.wwwRequestOutBytes,
                                this.wwwRequestOutLastTime
                            };
                        }
                        public static final class WwwRequestOutIndexEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwRequestOutIndexEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwRequestOutIndex", "1.3.6.1.2.1.65.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwRequestOutRequestsEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwRequestOutRequestsEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwRequestOutRequests", "1.3.6.1.2.1.65.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwRequestOutBytesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwRequestOutBytesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwRequestOutBytes", "1.3.6.1.2.1.65.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwRequestOutLastTimeEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwRequestOutLastTimeEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwRequestOutLastTime", "1.3.6.1.2.1.65.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class WwwResponseInTableEnt extends MIBEntry<WWWMIBDef>
                {
                    public final WwwResponseInEntryEnt wwwResponseInEntry;

                    private WwwResponseInTableEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwResponseInTable", "1.3.6.1.2.1.65.1.2.4", false, true, false, false);
                        this.wwwResponseInEntry = new WwwResponseInEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.wwwResponseInEntry
                        };
                    }
                    public static final class WwwResponseInEntryEnt extends MIBEntry<WWWMIBDef>
                    {
                        public final WwwResponseInIndexEnt wwwResponseInIndex;

                        public final WwwResponseInResponsesEnt wwwResponseInResponses;

                        public final WwwResponseInBytesEnt wwwResponseInBytes;

                        public final WwwResponseInLastTimeEnt wwwResponseInLastTime;

                        private WwwResponseInEntryEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                        {
                            super(mib, parent, "wwwResponseInEntry", "1.3.6.1.2.1.65.1.2.4.1", false, false, false, true);
                            this.wwwResponseInIndex = new WwwResponseInIndexEnt(mib, this);
                            this.wwwResponseInResponses = new WwwResponseInResponsesEnt(mib, this);
                            this.wwwResponseInBytes = new WwwResponseInBytesEnt(mib, this);
                            this.wwwResponseInLastTime = new WwwResponseInLastTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.wwwResponseInIndex,
                                this.wwwResponseInResponses,
                                this.wwwResponseInBytes,
                                this.wwwResponseInLastTime
                            };
                        }
                        public static final class WwwResponseInIndexEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwResponseInIndexEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwResponseInIndex", "1.3.6.1.2.1.65.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwResponseInResponsesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwResponseInResponsesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwResponseInResponses", "1.3.6.1.2.1.65.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwResponseInBytesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwResponseInBytesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwResponseInBytes", "1.3.6.1.2.1.65.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwResponseInLastTimeEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwResponseInLastTimeEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwResponseInLastTime", "1.3.6.1.2.1.65.1.2.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class WwwResponseOutTableEnt extends MIBEntry<WWWMIBDef>
                {
                    public final WwwResponseOutEntryEnt wwwResponseOutEntry;

                    private WwwResponseOutTableEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwResponseOutTable", "1.3.6.1.2.1.65.1.2.5", false, true, false, false);
                        this.wwwResponseOutEntry = new WwwResponseOutEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.wwwResponseOutEntry
                        };
                    }
                    public static final class WwwResponseOutEntryEnt extends MIBEntry<WWWMIBDef>
                    {
                        public final WwwResponseOutIndexEnt wwwResponseOutIndex;

                        public final WwwResponseOutResponsesEnt wwwResponseOutResponses;

                        public final WwwResponseOutBytesEnt wwwResponseOutBytes;

                        public final WwwResponseOutLastTimeEnt wwwResponseOutLastTime;

                        private WwwResponseOutEntryEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                        {
                            super(mib, parent, "wwwResponseOutEntry", "1.3.6.1.2.1.65.1.2.5.1", false, false, false, true);
                            this.wwwResponseOutIndex = new WwwResponseOutIndexEnt(mib, this);
                            this.wwwResponseOutResponses = new WwwResponseOutResponsesEnt(mib, this);
                            this.wwwResponseOutBytes = new WwwResponseOutBytesEnt(mib, this);
                            this.wwwResponseOutLastTime = new WwwResponseOutLastTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.wwwResponseOutIndex,
                                this.wwwResponseOutResponses,
                                this.wwwResponseOutBytes,
                                this.wwwResponseOutLastTime
                            };
                        }
                        public static final class WwwResponseOutIndexEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwResponseOutIndexEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwResponseOutIndex", "1.3.6.1.2.1.65.1.2.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwResponseOutResponsesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwResponseOutResponsesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwResponseOutResponses", "1.3.6.1.2.1.65.1.2.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwResponseOutBytesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwResponseOutBytesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwResponseOutBytes", "1.3.6.1.2.1.65.1.2.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwResponseOutLastTimeEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwResponseOutLastTimeEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwResponseOutLastTime", "1.3.6.1.2.1.65.1.2.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class WwwDocumentStatisticsEnt extends MIBEntry<WWWMIBDef>
            {
                public final WwwDocCtrlTableEnt wwwDocCtrlTable;

                public final WwwDocLastNTableEnt wwwDocLastNTable;

                public final WwwDocBucketTableEnt wwwDocBucketTable;

                public final WwwDocAccessTopNTableEnt wwwDocAccessTopNTable;

                public final WwwDocBytesTopNTableEnt wwwDocBytesTopNTable;

                private WwwDocumentStatisticsEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                {
                    super(mib, parent, "wwwDocumentStatistics", "1.3.6.1.2.1.65.1.3", false, false, false, false);
                    this.wwwDocCtrlTable = new WwwDocCtrlTableEnt(mib, this);
                    this.wwwDocLastNTable = new WwwDocLastNTableEnt(mib, this);
                    this.wwwDocBucketTable = new WwwDocBucketTableEnt(mib, this);
                    this.wwwDocAccessTopNTable = new WwwDocAccessTopNTableEnt(mib, this);
                    this.wwwDocBytesTopNTable = new WwwDocBytesTopNTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.wwwDocCtrlTable,
                        this.wwwDocLastNTable,
                        this.wwwDocBucketTable,
                        this.wwwDocAccessTopNTable,
                        this.wwwDocBytesTopNTable
                    };
                }
                public static final class WwwDocCtrlTableEnt extends MIBEntry<WWWMIBDef>
                {
                    public final WwwDocCtrlEntryEnt wwwDocCtrlEntry;

                    private WwwDocCtrlTableEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwDocCtrlTable", "1.3.6.1.2.1.65.1.3.1", false, true, false, false);
                        this.wwwDocCtrlEntry = new WwwDocCtrlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.wwwDocCtrlEntry
                        };
                    }
                    public static final class WwwDocCtrlEntryEnt extends MIBEntry<WWWMIBDef>
                    {
                        public final WwwDocCtrlLastNSizeEnt wwwDocCtrlLastNSize;

                        public final WwwDocCtrlLastNLockEnt wwwDocCtrlLastNLock;

                        /** 4 buckets times 15 minutes = 1 hour*/
                        public final WwwDocCtrlBucketsEnt wwwDocCtrlBuckets;

                        /** 15 minutes (resolution .01 s)*/
                        public final WwwDocCtrlBucketTimeIntervalEnt wwwDocCtrlBucketTimeInterval;

                        public final WwwDocCtrlTopNSizeEnt wwwDocCtrlTopNSize;

                        private WwwDocCtrlEntryEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                        {
                            super(mib, parent, "wwwDocCtrlEntry", "1.3.6.1.2.1.65.1.3.1.1", false, false, false, true);
                            this.wwwDocCtrlLastNSize = new WwwDocCtrlLastNSizeEnt(mib, this);
                            this.wwwDocCtrlLastNLock = new WwwDocCtrlLastNLockEnt(mib, this);
                            this.wwwDocCtrlBuckets = new WwwDocCtrlBucketsEnt(mib, this);
                            this.wwwDocCtrlBucketTimeInterval = new WwwDocCtrlBucketTimeIntervalEnt(mib, this);
                            this.wwwDocCtrlTopNSize = new WwwDocCtrlTopNSizeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.wwwDocCtrlLastNSize,
                                this.wwwDocCtrlLastNLock,
                                this.wwwDocCtrlBuckets,
                                this.wwwDocCtrlBucketTimeInterval,
                                this.wwwDocCtrlTopNSize
                            };
                        }
                        public static final class WwwDocCtrlLastNSizeEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocCtrlLastNSizeEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocCtrlLastNSize", "1.3.6.1.2.1.65.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocCtrlLastNLockEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocCtrlLastNLockEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocCtrlLastNLock", "1.3.6.1.2.1.65.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocCtrlBucketsEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocCtrlBucketsEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocCtrlBuckets", "1.3.6.1.2.1.65.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocCtrlBucketTimeIntervalEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocCtrlBucketTimeIntervalEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocCtrlBucketTimeInterval", "1.3.6.1.2.1.65.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocCtrlTopNSizeEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocCtrlTopNSizeEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocCtrlTopNSize", "1.3.6.1.2.1.65.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class WwwDocLastNTableEnt extends MIBEntry<WWWMIBDef>
                {
                    public final WwwDocLastNEntryEnt wwwDocLastNEntry;

                    private WwwDocLastNTableEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwDocLastNTable", "1.3.6.1.2.1.65.1.3.2", false, true, false, false);
                        this.wwwDocLastNEntry = new WwwDocLastNEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.wwwDocLastNEntry
                        };
                    }
                    public static final class WwwDocLastNEntryEnt extends MIBEntry<WWWMIBDef>
                    {
                        public final WwwDocLastNIndexEnt wwwDocLastNIndex;

                        public final WwwDocLastNNameEnt wwwDocLastNName;

                        public final WwwDocLastNTimeStampEnt wwwDocLastNTimeStamp;

                        public final WwwDocLastNRequestTypeEnt wwwDocLastNRequestType;

                        public final WwwDocLastNResponseTypeEnt wwwDocLastNResponseType;

                        public final WwwDocLastNStatusMsgEnt wwwDocLastNStatusMsg;

                        public final WwwDocLastNBytesEnt wwwDocLastNBytes;

                        private WwwDocLastNEntryEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                        {
                            super(mib, parent, "wwwDocLastNEntry", "1.3.6.1.2.1.65.1.3.2.1", false, false, false, true);
                            this.wwwDocLastNIndex = new WwwDocLastNIndexEnt(mib, this);
                            this.wwwDocLastNName = new WwwDocLastNNameEnt(mib, this);
                            this.wwwDocLastNTimeStamp = new WwwDocLastNTimeStampEnt(mib, this);
                            this.wwwDocLastNRequestType = new WwwDocLastNRequestTypeEnt(mib, this);
                            this.wwwDocLastNResponseType = new WwwDocLastNResponseTypeEnt(mib, this);
                            this.wwwDocLastNStatusMsg = new WwwDocLastNStatusMsgEnt(mib, this);
                            this.wwwDocLastNBytes = new WwwDocLastNBytesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.wwwDocLastNIndex,
                                this.wwwDocLastNName,
                                this.wwwDocLastNTimeStamp,
                                this.wwwDocLastNRequestType,
                                this.wwwDocLastNResponseType,
                                this.wwwDocLastNStatusMsg,
                                this.wwwDocLastNBytes
                            };
                        }
                        public static final class WwwDocLastNIndexEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocLastNIndexEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocLastNIndex", "1.3.6.1.2.1.65.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocLastNNameEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocLastNNameEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocLastNName", "1.3.6.1.2.1.65.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocLastNTimeStampEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocLastNTimeStampEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocLastNTimeStamp", "1.3.6.1.2.1.65.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocLastNRequestTypeEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocLastNRequestTypeEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocLastNRequestType", "1.3.6.1.2.1.65.1.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocLastNResponseTypeEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocLastNResponseTypeEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocLastNResponseType", "1.3.6.1.2.1.65.1.3.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocLastNStatusMsgEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocLastNStatusMsgEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocLastNStatusMsg", "1.3.6.1.2.1.65.1.3.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocLastNBytesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocLastNBytesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocLastNBytes", "1.3.6.1.2.1.65.1.3.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class WwwDocBucketTableEnt extends MIBEntry<WWWMIBDef>
                {
                    public final WwwDocBucketEntryEnt wwwDocBucketEntry;

                    private WwwDocBucketTableEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwDocBucketTable", "1.3.6.1.2.1.65.1.3.3", false, true, false, false);
                        this.wwwDocBucketEntry = new WwwDocBucketEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.wwwDocBucketEntry
                        };
                    }
                    public static final class WwwDocBucketEntryEnt extends MIBEntry<WWWMIBDef>
                    {
                        public final WwwDocBucketIndexEnt wwwDocBucketIndex;

                        public final WwwDocBucketTimeStampEnt wwwDocBucketTimeStamp;

                        public final WwwDocBucketAccessesEnt wwwDocBucketAccesses;

                        public final WwwDocBucketDocumentsEnt wwwDocBucketDocuments;

                        public final WwwDocBucketBytesEnt wwwDocBucketBytes;

                        private WwwDocBucketEntryEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                        {
                            super(mib, parent, "wwwDocBucketEntry", "1.3.6.1.2.1.65.1.3.3.1", false, false, false, true);
                            this.wwwDocBucketIndex = new WwwDocBucketIndexEnt(mib, this);
                            this.wwwDocBucketTimeStamp = new WwwDocBucketTimeStampEnt(mib, this);
                            this.wwwDocBucketAccesses = new WwwDocBucketAccessesEnt(mib, this);
                            this.wwwDocBucketDocuments = new WwwDocBucketDocumentsEnt(mib, this);
                            this.wwwDocBucketBytes = new WwwDocBucketBytesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.wwwDocBucketIndex,
                                this.wwwDocBucketTimeStamp,
                                this.wwwDocBucketAccesses,
                                this.wwwDocBucketDocuments,
                                this.wwwDocBucketBytes
                            };
                        }
                        public static final class WwwDocBucketIndexEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocBucketIndexEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocBucketIndex", "1.3.6.1.2.1.65.1.3.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocBucketTimeStampEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocBucketTimeStampEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocBucketTimeStamp", "1.3.6.1.2.1.65.1.3.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocBucketAccessesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocBucketAccessesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocBucketAccesses", "1.3.6.1.2.1.65.1.3.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocBucketDocumentsEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocBucketDocumentsEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocBucketDocuments", "1.3.6.1.2.1.65.1.3.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocBucketBytesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocBucketBytesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocBucketBytes", "1.3.6.1.2.1.65.1.3.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class WwwDocAccessTopNTableEnt extends MIBEntry<WWWMIBDef>
                {
                    public final WwwDocAccessTopNEntryEnt wwwDocAccessTopNEntry;

                    private WwwDocAccessTopNTableEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwDocAccessTopNTable", "1.3.6.1.2.1.65.1.3.4", false, true, false, false);
                        this.wwwDocAccessTopNEntry = new WwwDocAccessTopNEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.wwwDocAccessTopNEntry
                        };
                    }
                    public static final class WwwDocAccessTopNEntryEnt extends MIBEntry<WWWMIBDef>
                    {
                        public final WwwDocAccessTopNIndexEnt wwwDocAccessTopNIndex;

                        public final WwwDocAccessTopNNameEnt wwwDocAccessTopNName;

                        public final WwwDocAccessTopNAccessesEnt wwwDocAccessTopNAccesses;

                        public final WwwDocAccessTopNBytesEnt wwwDocAccessTopNBytes;

                        public final WwwDocAccessTopNLastResponseTypeEnt wwwDocAccessTopNLastResponseType;

                        private WwwDocAccessTopNEntryEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                        {
                            super(mib, parent, "wwwDocAccessTopNEntry", "1.3.6.1.2.1.65.1.3.4.1", false, false, false, true);
                            this.wwwDocAccessTopNIndex = new WwwDocAccessTopNIndexEnt(mib, this);
                            this.wwwDocAccessTopNName = new WwwDocAccessTopNNameEnt(mib, this);
                            this.wwwDocAccessTopNAccesses = new WwwDocAccessTopNAccessesEnt(mib, this);
                            this.wwwDocAccessTopNBytes = new WwwDocAccessTopNBytesEnt(mib, this);
                            this.wwwDocAccessTopNLastResponseType = new WwwDocAccessTopNLastResponseTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.wwwDocAccessTopNIndex,
                                this.wwwDocAccessTopNName,
                                this.wwwDocAccessTopNAccesses,
                                this.wwwDocAccessTopNBytes,
                                this.wwwDocAccessTopNLastResponseType
                            };
                        }
                        public static final class WwwDocAccessTopNIndexEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocAccessTopNIndexEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocAccessTopNIndex", "1.3.6.1.2.1.65.1.3.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocAccessTopNNameEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocAccessTopNNameEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocAccessTopNName", "1.3.6.1.2.1.65.1.3.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocAccessTopNAccessesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocAccessTopNAccessesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocAccessTopNAccesses", "1.3.6.1.2.1.65.1.3.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocAccessTopNBytesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocAccessTopNBytesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocAccessTopNBytes", "1.3.6.1.2.1.65.1.3.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocAccessTopNLastResponseTypeEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocAccessTopNLastResponseTypeEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocAccessTopNLastResponseType", "1.3.6.1.2.1.65.1.3.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class WwwDocBytesTopNTableEnt extends MIBEntry<WWWMIBDef>
                {
                    public final WwwDocBytesTopNEntryEnt wwwDocBytesTopNEntry;

                    private WwwDocBytesTopNTableEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwDocBytesTopNTable", "1.3.6.1.2.1.65.1.3.5", false, true, false, false);
                        this.wwwDocBytesTopNEntry = new WwwDocBytesTopNEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.wwwDocBytesTopNEntry
                        };
                    }
                    public static final class WwwDocBytesTopNEntryEnt extends MIBEntry<WWWMIBDef>
                    {
                        public final WwwDocBytesTopNIndexEnt wwwDocBytesTopNIndex;

                        public final WwwDocBytesTopNNameEnt wwwDocBytesTopNName;

                        public final WwwDocBytesTopNAccessesEnt wwwDocBytesTopNAccesses;

                        public final WwwDocBytesTopNBytesEnt wwwDocBytesTopNBytes;

                        public final WwwDocBytesTopNLastResponseTypeEnt wwwDocBytesTopNLastResponseType;

                        private WwwDocBytesTopNEntryEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                        {
                            super(mib, parent, "wwwDocBytesTopNEntry", "1.3.6.1.2.1.65.1.3.5.1", false, false, false, true);
                            this.wwwDocBytesTopNIndex = new WwwDocBytesTopNIndexEnt(mib, this);
                            this.wwwDocBytesTopNName = new WwwDocBytesTopNNameEnt(mib, this);
                            this.wwwDocBytesTopNAccesses = new WwwDocBytesTopNAccessesEnt(mib, this);
                            this.wwwDocBytesTopNBytes = new WwwDocBytesTopNBytesEnt(mib, this);
                            this.wwwDocBytesTopNLastResponseType = new WwwDocBytesTopNLastResponseTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.wwwDocBytesTopNIndex,
                                this.wwwDocBytesTopNName,
                                this.wwwDocBytesTopNAccesses,
                                this.wwwDocBytesTopNBytes,
                                this.wwwDocBytesTopNLastResponseType
                            };
                        }
                        public static final class WwwDocBytesTopNIndexEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocBytesTopNIndexEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocBytesTopNIndex", "1.3.6.1.2.1.65.1.3.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocBytesTopNNameEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocBytesTopNNameEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocBytesTopNName", "1.3.6.1.2.1.65.1.3.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocBytesTopNAccessesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocBytesTopNAccessesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocBytesTopNAccesses", "1.3.6.1.2.1.65.1.3.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocBytesTopNBytesEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocBytesTopNBytesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocBytesTopNBytes", "1.3.6.1.2.1.65.1.3.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class WwwDocBytesTopNLastResponseTypeEnt extends MIBEntry<WWWMIBDef>
                        {
                            private WwwDocBytesTopNLastResponseTypeEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                            {
                                super(mib, parent, "wwwDocBytesTopNLastResponseType", "1.3.6.1.2.1.65.1.3.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class WwwMIBConformanceEnt extends MIBEntry<WWWMIBDef>
        {
            /** Conformance Definitions*/
            public final WwwMIBCompliancesEnt wwwMIBCompliances;

            public final WwwMIBGroupsEnt wwwMIBGroups;

            private WwwMIBConformanceEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
            {
                super(mib, parent, "wwwMIBConformance", "1.3.6.1.2.1.65.2", false, false, false, false);
                this.wwwMIBCompliances = new WwwMIBCompliancesEnt(mib, this);
                this.wwwMIBGroups = new WwwMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.wwwMIBCompliances,
                    this.wwwMIBGroups
                };
            }
            public static final class WwwMIBCompliancesEnt extends MIBEntry<WWWMIBDef>
            {
                public final WwwMinimalComplianceEnt wwwMinimalCompliance;

                public final WwwFullComplianceEnt wwwFullCompliance;

                private WwwMIBCompliancesEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                {
                    super(mib, parent, "wwwMIBCompliances", "1.3.6.1.2.1.65.2.1", false, false, false, false);
                    this.wwwMinimalCompliance = new WwwMinimalComplianceEnt(mib, this);
                    this.wwwFullCompliance = new WwwFullComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.wwwMinimalCompliance,
                        this.wwwFullCompliance
                    };
                }
                public static final class WwwMinimalComplianceEnt extends MIBEntry<WWWMIBDef>
                {
                    private WwwMinimalComplianceEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwMinimalCompliance", "1.3.6.1.2.1.65.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class WwwFullComplianceEnt extends MIBEntry<WWWMIBDef>
                {
                    private WwwFullComplianceEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwFullCompliance", "1.3.6.1.2.1.65.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class WwwMIBGroupsEnt extends MIBEntry<WWWMIBDef>
            {
                public final WwwServiceGroupEnt wwwServiceGroup;

                public final WwwSummaryGroupEnt wwwSummaryGroup;

                public final WwwRequestInGroupEnt wwwRequestInGroup;

                public final WwwRequestOutGroupEnt wwwRequestOutGroup;

                public final WwwResponseInGroupEnt wwwResponseInGroup;

                public final WwwResponseOutGroupEnt wwwResponseOutGroup;

                public final WwwDocumentGroupEnt wwwDocumentGroup;

                private WwwMIBGroupsEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                {
                    super(mib, parent, "wwwMIBGroups", "1.3.6.1.2.1.65.2.2", false, false, false, false);
                    this.wwwServiceGroup = new WwwServiceGroupEnt(mib, this);
                    this.wwwSummaryGroup = new WwwSummaryGroupEnt(mib, this);
                    this.wwwRequestInGroup = new WwwRequestInGroupEnt(mib, this);
                    this.wwwRequestOutGroup = new WwwRequestOutGroupEnt(mib, this);
                    this.wwwResponseInGroup = new WwwResponseInGroupEnt(mib, this);
                    this.wwwResponseOutGroup = new WwwResponseOutGroupEnt(mib, this);
                    this.wwwDocumentGroup = new WwwDocumentGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.wwwServiceGroup,
                        this.wwwSummaryGroup,
                        this.wwwRequestInGroup,
                        this.wwwRequestOutGroup,
                        this.wwwResponseInGroup,
                        this.wwwResponseOutGroup,
                        this.wwwDocumentGroup
                    };
                }
                public static final class WwwServiceGroupEnt extends MIBEntry<WWWMIBDef>
                {
                    private WwwServiceGroupEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwServiceGroup", "1.3.6.1.2.1.65.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class WwwSummaryGroupEnt extends MIBEntry<WWWMIBDef>
                {
                    private WwwSummaryGroupEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwSummaryGroup", "1.3.6.1.2.1.65.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class WwwRequestInGroupEnt extends MIBEntry<WWWMIBDef>
                {
                    private WwwRequestInGroupEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwRequestInGroup", "1.3.6.1.2.1.65.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class WwwRequestOutGroupEnt extends MIBEntry<WWWMIBDef>
                {
                    private WwwRequestOutGroupEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwRequestOutGroup", "1.3.6.1.2.1.65.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class WwwResponseInGroupEnt extends MIBEntry<WWWMIBDef>
                {
                    private WwwResponseInGroupEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwResponseInGroup", "1.3.6.1.2.1.65.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class WwwResponseOutGroupEnt extends MIBEntry<WWWMIBDef>
                {
                    private WwwResponseOutGroupEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwResponseOutGroup", "1.3.6.1.2.1.65.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class WwwDocumentGroupEnt extends MIBEntry<WWWMIBDef>
                {
                    private WwwDocumentGroupEnt(WWWMIBDef mib, MIBEntry<WWWMIBDef> parent)
                    {
                        super(mib, parent, "wwwDocumentGroup", "1.3.6.1.2.1.65.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
