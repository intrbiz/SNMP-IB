package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class PINTMIBDef extends MIB
{
    public static final PINTMIBDef PINTMIB = new PINTMIBDef();

    /** RFC 2571 [2]

1 Feb 2001*/
    public final PintMibEnt pintMib;

    private PINTMIBDef()
    {
        super("PINT-MIB");
        this.pintMib = new PintMibEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.pintMib
        };
    }

    public static final class PintMibEnt extends MIBEntry<PINTMIBDef>
    {
        public final PintServerConfigEnt pintServerConfig;

        public final PintServerMonitorEnt pintServerMonitor;

        public final PintMibConformanceEnt pintMibConformance;

        private PintMibEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
        {
            super(mib, parent, "pintMib", "1.3.6.1.2.1.93", false, false, false, false);
            this.pintServerConfig = new PintServerConfigEnt(mib, this);
            this.pintServerMonitor = new PintServerMonitorEnt(mib, this);
            this.pintMibConformance = new PintMibConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.pintServerConfig,
                this.pintServerMonitor,
                this.pintMibConformance
            };
        }
        public static final class PintServerConfigEnt extends MIBEntry<PINTMIBDef>
        {
            /** pintServerConfig - PINT configuration MIB variables*/
            public final PintReleaseNumberEnt pintReleaseNumber;

            public final PintSysContactEnt pintSysContact;

            public final PintApplInstallPkgTableEnt pintApplInstallPkgTable;

            public final PintRegisteredGatewayTableEnt pintRegisteredGatewayTable;

            private PintServerConfigEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
            {
                super(mib, parent, "pintServerConfig", "1.3.6.1.2.1.93.1", false, false, false, false);
                this.pintReleaseNumber = new PintReleaseNumberEnt(mib, this);
                this.pintSysContact = new PintSysContactEnt(mib, this);
                this.pintApplInstallPkgTable = new PintApplInstallPkgTableEnt(mib, this);
                this.pintRegisteredGatewayTable = new PintRegisteredGatewayTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pintReleaseNumber,
                    this.pintSysContact,
                    this.pintApplInstallPkgTable,
                    this.pintRegisteredGatewayTable
                };
            }
            public static final class PintReleaseNumberEnt extends MIBEntry<PINTMIBDef>
            {
                private PintReleaseNumberEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                {
                    super(mib, parent, "pintReleaseNumber", "1.3.6.1.2.1.93.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PintSysContactEnt extends MIBEntry<PINTMIBDef>
            {
                private PintSysContactEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                {
                    super(mib, parent, "pintSysContact", "1.3.6.1.2.1.93.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PintApplInstallPkgTableEnt extends MIBEntry<PINTMIBDef>
            {
                public final PintApplInstallPkgEntryEnt pintApplInstallPkgEntry;

                private PintApplInstallPkgTableEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                {
                    super(mib, parent, "pintApplInstallPkgTable", "1.3.6.1.2.1.93.1.3", false, true, false, false);
                    this.pintApplInstallPkgEntry = new PintApplInstallPkgEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pintApplInstallPkgEntry
                    };
                }
                public static final class PintApplInstallPkgEntryEnt extends MIBEntry<PINTMIBDef>
                {
                    public final PintApplInstallPkgDescriptionEnt pintApplInstallPkgDescription;

                    private PintApplInstallPkgEntryEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                    {
                        super(mib, parent, "pintApplInstallPkgEntry", "1.3.6.1.2.1.93.1.3.1", false, false, false, true);
                        this.pintApplInstallPkgDescription = new PintApplInstallPkgDescriptionEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pintApplInstallPkgDescription
                        };
                    }
                    public static final class PintApplInstallPkgDescriptionEnt extends MIBEntry<PINTMIBDef>
                    {
                        private PintApplInstallPkgDescriptionEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                        {
                            super(mib, parent, "pintApplInstallPkgDescription", "1.3.6.1.2.1.93.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PintRegisteredGatewayTableEnt extends MIBEntry<PINTMIBDef>
            {
                public final PintRegisteredGatewayEntryEnt pintRegisteredGatewayEntry;

                private PintRegisteredGatewayTableEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                {
                    super(mib, parent, "pintRegisteredGatewayTable", "1.3.6.1.2.1.93.1.4", false, true, false, false);
                    this.pintRegisteredGatewayEntry = new PintRegisteredGatewayEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pintRegisteredGatewayEntry
                    };
                }
                public static final class PintRegisteredGatewayEntryEnt extends MIBEntry<PINTMIBDef>
                {
                    public final PintRegisteredGatewayNameEnt pintRegisteredGatewayName;

                    public final PintRegisteredGatewayDescriptionEnt pintRegisteredGatewayDescription;

                    private PintRegisteredGatewayEntryEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                    {
                        super(mib, parent, "pintRegisteredGatewayEntry", "1.3.6.1.2.1.93.1.4.1", false, false, false, true);
                        this.pintRegisteredGatewayName = new PintRegisteredGatewayNameEnt(mib, this);
                        this.pintRegisteredGatewayDescription = new PintRegisteredGatewayDescriptionEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pintRegisteredGatewayName,
                            this.pintRegisteredGatewayDescription
                        };
                    }
                    public static final class PintRegisteredGatewayNameEnt extends MIBEntry<PINTMIBDef>
                    {
                        private PintRegisteredGatewayNameEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                        {
                            super(mib, parent, "pintRegisteredGatewayName", "1.3.6.1.2.1.93.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PintRegisteredGatewayDescriptionEnt extends MIBEntry<PINTMIBDef>
                    {
                        private PintRegisteredGatewayDescriptionEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                        {
                            super(mib, parent, "pintRegisteredGatewayDescription", "1.3.6.1.2.1.93.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PintServerMonitorEnt extends MIBEntry<PINTMIBDef>
        {
            /** pintServerMonitor - PINT monitoring statistics MIB variables*/
            public final PintServerGlobalPerfEnt pintServerGlobalPerf;

            public final PintServerClientPerfEnt pintServerClientPerf;

            public final PintServerUserIdPerfEnt pintServerUserIdPerf;

            public final PintServerGatewayPerfEnt pintServerGatewayPerf;

            private PintServerMonitorEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
            {
                super(mib, parent, "pintServerMonitor", "1.3.6.1.2.1.93.2", false, false, false, false);
                this.pintServerGlobalPerf = new PintServerGlobalPerfEnt(mib, this);
                this.pintServerClientPerf = new PintServerClientPerfEnt(mib, this);
                this.pintServerUserIdPerf = new PintServerUserIdPerfEnt(mib, this);
                this.pintServerGatewayPerf = new PintServerGatewayPerfEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pintServerGlobalPerf,
                    this.pintServerClientPerf,
                    this.pintServerUserIdPerf,
                    this.pintServerGatewayPerf
                };
            }
            public static final class PintServerGlobalPerfEnt extends MIBEntry<PINTMIBDef>
            {
                public final PintServerGlobalStatsTableEnt pintServerGlobalStatsTable;

                private PintServerGlobalPerfEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                {
                    super(mib, parent, "pintServerGlobalPerf", "1.3.6.1.2.1.93.2.1", false, false, false, false);
                    this.pintServerGlobalStatsTable = new PintServerGlobalStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pintServerGlobalStatsTable
                    };
                }
                public static final class PintServerGlobalStatsTableEnt extends MIBEntry<PINTMIBDef>
                {
                    public final PintServerGlobalStatsEntryEnt pintServerGlobalStatsEntry;

                    private PintServerGlobalStatsTableEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                    {
                        super(mib, parent, "pintServerGlobalStatsTable", "1.3.6.1.2.1.93.2.1.1", false, true, false, false);
                        this.pintServerGlobalStatsEntry = new PintServerGlobalStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pintServerGlobalStatsEntry
                        };
                    }
                    public static final class PintServerGlobalStatsEntryEnt extends MIBEntry<PINTMIBDef>
                    {
                        public final PintServerServiceTypeIndexEnt pintServerServiceTypeIndex;

                        public final PintServerPerfStatPeriodIndexEnt pintServerPerfStatPeriodIndex;

                        public final PintServerGlobalCallsReceivedEnt pintServerGlobalCallsReceived;

                        public final PintServerGlobalSuccessfulCallsEnt pintServerGlobalSuccessfulCalls;

                        public final PintServerGlobalDisconnectedCallsEnt pintServerGlobalDisconnectedCalls;

                        public final PintServerGlobalDisCUAutFCallsEnt pintServerGlobalDisCUAutFCalls;

                        public final PintServerGlobalDisServProbCallsEnt pintServerGlobalDisServProbCalls;

                        public final PintServerGlobalDisGatProbCallsEnt pintServerGlobalDisGatProbCalls;

                        private PintServerGlobalStatsEntryEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                        {
                            super(mib, parent, "pintServerGlobalStatsEntry", "1.3.6.1.2.1.93.2.1.1.1", false, false, false, true);
                            this.pintServerServiceTypeIndex = new PintServerServiceTypeIndexEnt(mib, this);
                            this.pintServerPerfStatPeriodIndex = new PintServerPerfStatPeriodIndexEnt(mib, this);
                            this.pintServerGlobalCallsReceived = new PintServerGlobalCallsReceivedEnt(mib, this);
                            this.pintServerGlobalSuccessfulCalls = new PintServerGlobalSuccessfulCallsEnt(mib, this);
                            this.pintServerGlobalDisconnectedCalls = new PintServerGlobalDisconnectedCallsEnt(mib, this);
                            this.pintServerGlobalDisCUAutFCalls = new PintServerGlobalDisCUAutFCallsEnt(mib, this);
                            this.pintServerGlobalDisServProbCalls = new PintServerGlobalDisServProbCallsEnt(mib, this);
                            this.pintServerGlobalDisGatProbCalls = new PintServerGlobalDisGatProbCallsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pintServerServiceTypeIndex,
                                this.pintServerPerfStatPeriodIndex,
                                this.pintServerGlobalCallsReceived,
                                this.pintServerGlobalSuccessfulCalls,
                                this.pintServerGlobalDisconnectedCalls,
                                this.pintServerGlobalDisCUAutFCalls,
                                this.pintServerGlobalDisServProbCalls,
                                this.pintServerGlobalDisGatProbCalls
                            };
                        }
                        public static final class PintServerServiceTypeIndexEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerServiceTypeIndexEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerServiceTypeIndex", "1.3.6.1.2.1.93.2.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerPerfStatPeriodIndexEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerPerfStatPeriodIndexEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerPerfStatPeriodIndex", "1.3.6.1.2.1.93.2.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerGlobalCallsReceivedEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerGlobalCallsReceivedEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerGlobalCallsReceived", "1.3.6.1.2.1.93.2.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerGlobalSuccessfulCallsEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerGlobalSuccessfulCallsEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerGlobalSuccessfulCalls", "1.3.6.1.2.1.93.2.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerGlobalDisconnectedCallsEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerGlobalDisconnectedCallsEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerGlobalDisconnectedCalls", "1.3.6.1.2.1.93.2.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerGlobalDisCUAutFCallsEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerGlobalDisCUAutFCallsEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerGlobalDisCUAutFCalls", "1.3.6.1.2.1.93.2.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerGlobalDisServProbCallsEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerGlobalDisServProbCallsEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerGlobalDisServProbCalls", "1.3.6.1.2.1.93.2.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerGlobalDisGatProbCallsEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerGlobalDisGatProbCallsEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerGlobalDisGatProbCalls", "1.3.6.1.2.1.93.2.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class PintServerClientPerfEnt extends MIBEntry<PINTMIBDef>
            {
                public final PintServerClientStatsTableEnt pintServerClientStatsTable;

                private PintServerClientPerfEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                {
                    super(mib, parent, "pintServerClientPerf", "1.3.6.1.2.1.93.2.2", false, false, false, false);
                    this.pintServerClientStatsTable = new PintServerClientStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pintServerClientStatsTable
                    };
                }
                public static final class PintServerClientStatsTableEnt extends MIBEntry<PINTMIBDef>
                {
                    public final PintServerClientStatsEntryEnt pintServerClientStatsEntry;

                    private PintServerClientStatsTableEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                    {
                        super(mib, parent, "pintServerClientStatsTable", "1.3.6.1.2.1.93.2.2.1", false, true, false, false);
                        this.pintServerClientStatsEntry = new PintServerClientStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pintServerClientStatsEntry
                        };
                    }
                    public static final class PintServerClientStatsEntryEnt extends MIBEntry<PINTMIBDef>
                    {
                        public final PintServerClientAddressEnt pintServerClientAddress;

                        public final PintServerClientCallsReceivedEnt pintServerClientCallsReceived;

                        public final PintServerClientSuccessfulCallsEnt pintServerClientSuccessfulCalls;

                        public final PintServerClientDisconnectedCallsEnt pintServerClientDisconnectedCalls;

                        public final PintServerClientDisCAutFCallsEnt pintServerClientDisCAutFCalls;

                        public final PintServerClientDisEFProbCallsEnt pintServerClientDisEFProbCalls;

                        private PintServerClientStatsEntryEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                        {
                            super(mib, parent, "pintServerClientStatsEntry", "1.3.6.1.2.1.93.2.2.1.1", false, false, false, true);
                            this.pintServerClientAddress = new PintServerClientAddressEnt(mib, this);
                            this.pintServerClientCallsReceived = new PintServerClientCallsReceivedEnt(mib, this);
                            this.pintServerClientSuccessfulCalls = new PintServerClientSuccessfulCallsEnt(mib, this);
                            this.pintServerClientDisconnectedCalls = new PintServerClientDisconnectedCallsEnt(mib, this);
                            this.pintServerClientDisCAutFCalls = new PintServerClientDisCAutFCallsEnt(mib, this);
                            this.pintServerClientDisEFProbCalls = new PintServerClientDisEFProbCallsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pintServerClientAddress,
                                this.pintServerClientCallsReceived,
                                this.pintServerClientSuccessfulCalls,
                                this.pintServerClientDisconnectedCalls,
                                this.pintServerClientDisCAutFCalls,
                                this.pintServerClientDisEFProbCalls
                            };
                        }
                        public static final class PintServerClientAddressEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerClientAddressEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerClientAddress", "1.3.6.1.2.1.93.2.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerClientCallsReceivedEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerClientCallsReceivedEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerClientCallsReceived", "1.3.6.1.2.1.93.2.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerClientSuccessfulCallsEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerClientSuccessfulCallsEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerClientSuccessfulCalls", "1.3.6.1.2.1.93.2.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerClientDisconnectedCallsEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerClientDisconnectedCallsEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerClientDisconnectedCalls", "1.3.6.1.2.1.93.2.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerClientDisCAutFCallsEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerClientDisCAutFCallsEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerClientDisCAutFCalls", "1.3.6.1.2.1.93.2.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerClientDisEFProbCallsEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerClientDisEFProbCallsEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerClientDisEFProbCalls", "1.3.6.1.2.1.93.2.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class PintServerUserIdPerfEnt extends MIBEntry<PINTMIBDef>
            {
                public final PintServerUserIdStatsTableEnt pintServerUserIdStatsTable;

                private PintServerUserIdPerfEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                {
                    super(mib, parent, "pintServerUserIdPerf", "1.3.6.1.2.1.93.2.3", false, false, false, false);
                    this.pintServerUserIdStatsTable = new PintServerUserIdStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pintServerUserIdStatsTable
                    };
                }
                public static final class PintServerUserIdStatsTableEnt extends MIBEntry<PINTMIBDef>
                {
                    public final PintServerUserIdStatsEntryEnt pintServerUserIdStatsEntry;

                    private PintServerUserIdStatsTableEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                    {
                        super(mib, parent, "pintServerUserIdStatsTable", "1.3.6.1.2.1.93.2.3.1", false, true, false, false);
                        this.pintServerUserIdStatsEntry = new PintServerUserIdStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pintServerUserIdStatsEntry
                        };
                    }
                    public static final class PintServerUserIdStatsEntryEnt extends MIBEntry<PINTMIBDef>
                    {
                        public final PintServerUserIdNameEnt pintServerUserIdName;

                        public final PintServerUserIdCallsReceivedEnt pintServerUserIdCallsReceived;

                        public final PintServerUserIdSuccessfulCallsEnt pintServerUserIdSuccessfulCalls;

                        public final PintServerUserIdDisconnectedCallsEnt pintServerUserIdDisconnectedCalls;

                        public final PintServerUserIdDiscUIdAFailCallsEnt pintServerUserIdDiscUIdAFailCalls;

                        public final PintServerUserIdEFProbCallsEnt pintServerUserIdEFProbCalls;

                        private PintServerUserIdStatsEntryEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                        {
                            super(mib, parent, "pintServerUserIdStatsEntry", "1.3.6.1.2.1.93.2.3.1.1", false, false, false, true);
                            this.pintServerUserIdName = new PintServerUserIdNameEnt(mib, this);
                            this.pintServerUserIdCallsReceived = new PintServerUserIdCallsReceivedEnt(mib, this);
                            this.pintServerUserIdSuccessfulCalls = new PintServerUserIdSuccessfulCallsEnt(mib, this);
                            this.pintServerUserIdDisconnectedCalls = new PintServerUserIdDisconnectedCallsEnt(mib, this);
                            this.pintServerUserIdDiscUIdAFailCalls = new PintServerUserIdDiscUIdAFailCallsEnt(mib, this);
                            this.pintServerUserIdEFProbCalls = new PintServerUserIdEFProbCallsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pintServerUserIdName,
                                this.pintServerUserIdCallsReceived,
                                this.pintServerUserIdSuccessfulCalls,
                                this.pintServerUserIdDisconnectedCalls,
                                this.pintServerUserIdDiscUIdAFailCalls,
                                this.pintServerUserIdEFProbCalls
                            };
                        }
                        public static final class PintServerUserIdNameEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerUserIdNameEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerUserIdName", "1.3.6.1.2.1.93.2.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerUserIdCallsReceivedEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerUserIdCallsReceivedEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerUserIdCallsReceived", "1.3.6.1.2.1.93.2.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerUserIdSuccessfulCallsEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerUserIdSuccessfulCallsEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerUserIdSuccessfulCalls", "1.3.6.1.2.1.93.2.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerUserIdDisconnectedCallsEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerUserIdDisconnectedCallsEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerUserIdDisconnectedCalls", "1.3.6.1.2.1.93.2.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerUserIdDiscUIdAFailCallsEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerUserIdDiscUIdAFailCallsEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerUserIdDiscUIdAFailCalls", "1.3.6.1.2.1.93.2.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerUserIdEFProbCallsEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerUserIdEFProbCallsEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerUserIdEFProbCalls", "1.3.6.1.2.1.93.2.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class PintServerGatewayPerfEnt extends MIBEntry<PINTMIBDef>
            {
                public final PintServerGatewayStatsTableEnt pintServerGatewayStatsTable;

                private PintServerGatewayPerfEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                {
                    super(mib, parent, "pintServerGatewayPerf", "1.3.6.1.2.1.93.2.4", false, false, false, false);
                    this.pintServerGatewayStatsTable = new PintServerGatewayStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pintServerGatewayStatsTable
                    };
                }
                public static final class PintServerGatewayStatsTableEnt extends MIBEntry<PINTMIBDef>
                {
                    public final PintServerGatewayStatsEntryEnt pintServerGatewayStatsEntry;

                    private PintServerGatewayStatsTableEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                    {
                        super(mib, parent, "pintServerGatewayStatsTable", "1.3.6.1.2.1.93.2.4.1", false, true, false, false);
                        this.pintServerGatewayStatsEntry = new PintServerGatewayStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pintServerGatewayStatsEntry
                        };
                    }
                    public static final class PintServerGatewayStatsEntryEnt extends MIBEntry<PINTMIBDef>
                    {
                        public final PintServerGatewayCallsReceivedEnt pintServerGatewayCallsReceived;

                        public final PintServerGatewaySuccessfulCallsEnt pintServerGatewaySuccessfulCalls;

                        public final PintServerGatewayDisconnectedCallsEnt pintServerGatewayDisconnectedCalls;

                        private PintServerGatewayStatsEntryEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                        {
                            super(mib, parent, "pintServerGatewayStatsEntry", "1.3.6.1.2.1.93.2.4.1.1", false, false, false, true);
                            this.pintServerGatewayCallsReceived = new PintServerGatewayCallsReceivedEnt(mib, this);
                            this.pintServerGatewaySuccessfulCalls = new PintServerGatewaySuccessfulCallsEnt(mib, this);
                            this.pintServerGatewayDisconnectedCalls = new PintServerGatewayDisconnectedCallsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pintServerGatewayCallsReceived,
                                this.pintServerGatewaySuccessfulCalls,
                                this.pintServerGatewayDisconnectedCalls
                            };
                        }
                        public static final class PintServerGatewayCallsReceivedEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerGatewayCallsReceivedEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerGatewayCallsReceived", "1.3.6.1.2.1.93.2.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerGatewaySuccessfulCallsEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerGatewaySuccessfulCallsEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerGatewaySuccessfulCalls", "1.3.6.1.2.1.93.2.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PintServerGatewayDisconnectedCallsEnt extends MIBEntry<PINTMIBDef>
                        {
                            private PintServerGatewayDisconnectedCallsEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                            {
                                super(mib, parent, "pintServerGatewayDisconnectedCalls", "1.3.6.1.2.1.93.2.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class PintMibConformanceEnt extends MIBEntry<PINTMIBDef>
        {
            /** Notifications Section(none defined)
Conformance Section*/
            public final PintMibCompliancesEnt pintMibCompliances;

            public final PintMibGroupsEnt pintMibGroups;

            private PintMibConformanceEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
            {
                super(mib, parent, "pintMibConformance", "1.3.6.1.2.1.93.3", false, false, false, false);
                this.pintMibCompliances = new PintMibCompliancesEnt(mib, this);
                this.pintMibGroups = new PintMibGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pintMibCompliances,
                    this.pintMibGroups
                };
            }
            public static final class PintMibCompliancesEnt extends MIBEntry<PINTMIBDef>
            {
                public final PintMibComplianceEnt pintMibCompliance;

                private PintMibCompliancesEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                {
                    super(mib, parent, "pintMibCompliances", "1.3.6.1.2.1.93.3.1", false, false, false, false);
                    this.pintMibCompliance = new PintMibComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pintMibCompliance
                    };
                }
                public static final class PintMibComplianceEnt extends MIBEntry<PINTMIBDef>
                {
                    private PintMibComplianceEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                    {
                        super(mib, parent, "pintMibCompliance", "1.3.6.1.2.1.93.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class PintMibGroupsEnt extends MIBEntry<PINTMIBDef>
            {
                public final PintMibConfigGroupEnt pintMibConfigGroup;

                /** pintServerUserIdName,*/
                public final PintMibMonitorGroupEnt pintMibMonitorGroup;

                private PintMibGroupsEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                {
                    super(mib, parent, "pintMibGroups", "1.3.6.1.2.1.93.3.2", false, false, false, false);
                    this.pintMibConfigGroup = new PintMibConfigGroupEnt(mib, this);
                    this.pintMibMonitorGroup = new PintMibMonitorGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pintMibConfigGroup,
                        this.pintMibMonitorGroup
                    };
                }
                public static final class PintMibConfigGroupEnt extends MIBEntry<PINTMIBDef>
                {
                    private PintMibConfigGroupEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                    {
                        super(mib, parent, "pintMibConfigGroup", "1.3.6.1.2.1.93.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PintMibMonitorGroupEnt extends MIBEntry<PINTMIBDef>
                {
                    private PintMibMonitorGroupEnt(PINTMIBDef mib, MIBEntry<PINTMIBDef> parent)
                    {
                        super(mib, parent, "pintMibMonitorGroup", "1.3.6.1.2.1.93.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
