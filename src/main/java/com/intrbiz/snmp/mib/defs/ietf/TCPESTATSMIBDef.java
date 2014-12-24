package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2580]
[RFC4502]
[RFC2856]
[RFC2579]*/
public final class TCPESTATSMIBDef extends MIB
{
    public static final TCPESTATSMIBDef TCPESTATSMIB = new TCPESTATSMIBDef();

    /** [RFC4022]

18 May 2007*/
    public final TcpEStatsMIBEnt tcpEStatsMIB;

    private TCPESTATSMIBDef()
    {
        super("TCP-ESTATS-MIB");
        this.tcpEStatsMIB = new TcpEStatsMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.tcpEStatsMIB
        };
    }

    public static final class TcpEStatsMIBEnt extends MIBEntry<TCPESTATSMIBDef>
    {
        public final TcpEStatsNotificationsEnt tcpEStatsNotifications;

        public final TcpEStatsMIBObjectsEnt tcpEStatsMIBObjects;

        public final TcpEStatsConformanceEnt tcpEStatsConformance;

        private TcpEStatsMIBEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
        {
            super(mib, parent, "tcpEStatsMIB", "1.3.6.1.2.1.156", false, false, false, false);
            this.tcpEStatsNotifications = new TcpEStatsNotificationsEnt(mib, this);
            this.tcpEStatsMIBObjects = new TcpEStatsMIBObjectsEnt(mib, this);
            this.tcpEStatsConformance = new TcpEStatsConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.tcpEStatsNotifications,
                this.tcpEStatsMIBObjects,
                this.tcpEStatsConformance
            };
        }
        public static final class TcpEStatsNotificationsEnt extends MIBEntry<TCPESTATSMIBDef>
        {
            /** ================================================================TCP Extended Statistics Notifications Group*/
            public final TcpEStatsEstablishNotificationEnt tcpEStatsEstablishNotification;

            public final TcpEStatsCloseNotificationEnt tcpEStatsCloseNotification;

            private TcpEStatsNotificationsEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
            {
                super(mib, parent, "tcpEStatsNotifications", "1.3.6.1.2.1.156.0", false, false, false, false);
                this.tcpEStatsEstablishNotification = new TcpEStatsEstablishNotificationEnt(mib, this);
                this.tcpEStatsCloseNotification = new TcpEStatsCloseNotificationEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tcpEStatsEstablishNotification,
                    this.tcpEStatsCloseNotification
                };
            }
            public static final class TcpEStatsEstablishNotificationEnt extends MIBEntry<TCPESTATSMIBDef>
            {
                private TcpEStatsEstablishNotificationEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                {
                    super(mib, parent, "tcpEStatsEstablishNotification", "1.3.6.1.2.1.156.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TcpEStatsCloseNotificationEnt extends MIBEntry<TCPESTATSMIBDef>
            {
                private TcpEStatsCloseNotificationEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                {
                    super(mib, parent, "tcpEStatsCloseNotification", "1.3.6.1.2.1.156.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class TcpEStatsMIBObjectsEnt extends MIBEntry<TCPESTATSMIBDef>
        {
            public final TcpEStatsEnt tcpEStats;

            public final TcpEStatsControlEnt tcpEStatsControl;

            public final TcpEStatsScalarEnt tcpEStatsScalar;

            private TcpEStatsMIBObjectsEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
            {
                super(mib, parent, "tcpEStatsMIBObjects", "1.3.6.1.2.1.156.1", false, false, false, false);
                this.tcpEStats = new TcpEStatsEnt(mib, this);
                this.tcpEStatsControl = new TcpEStatsControlEnt(mib, this);
                this.tcpEStatsScalar = new TcpEStatsScalarEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tcpEStats,
                    this.tcpEStatsControl,
                    this.tcpEStatsScalar
                };
            }
            public static final class TcpEStatsEnt extends MIBEntry<TCPESTATSMIBDef>
            {
                /** ================================================================Listener Table*/
                public final TcpEStatsListenerTableEnt tcpEStatsListenerTable;

                /** ================================================================TCP Connection ID Table*/
                public final TcpEStatsConnectIdTableEnt tcpEStatsConnectIdTable;

                /** ================================================================Basic TCP Performance Statistics*/
                public final TcpEStatsPerfTableEnt tcpEStatsPerfTable;

                /** ================================================================Statistics for diagnosing path problems*/
                public final TcpEStatsPathTableEnt tcpEStatsPathTable;

                /** ================================================================Statistics for diagnosing stack algorithms*/
                public final TcpEStatsStackTableEnt tcpEStatsStackTable;

                /** ================================================================Statistics for diagnosing interactions betweenapplications and TCP.*/
                public final TcpEStatsAppTableEnt tcpEStatsAppTable;

                /** ================================================================Controls for Tuning TCP*/
                public final TcpEStatsTuneTableEnt tcpEStatsTuneTable;

                private TcpEStatsEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                {
                    super(mib, parent, "tcpEStats", "1.3.6.1.2.1.156.1.1", false, false, false, false);
                    this.tcpEStatsListenerTable = new TcpEStatsListenerTableEnt(mib, this);
                    this.tcpEStatsConnectIdTable = new TcpEStatsConnectIdTableEnt(mib, this);
                    this.tcpEStatsPerfTable = new TcpEStatsPerfTableEnt(mib, this);
                    this.tcpEStatsPathTable = new TcpEStatsPathTableEnt(mib, this);
                    this.tcpEStatsStackTable = new TcpEStatsStackTableEnt(mib, this);
                    this.tcpEStatsAppTable = new TcpEStatsAppTableEnt(mib, this);
                    this.tcpEStatsTuneTable = new TcpEStatsTuneTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tcpEStatsListenerTable,
                        this.tcpEStatsConnectIdTable,
                        this.tcpEStatsPerfTable,
                        this.tcpEStatsPathTable,
                        this.tcpEStatsStackTable,
                        this.tcpEStatsAppTable,
                        this.tcpEStatsTuneTable
                    };
                }
                public static final class TcpEStatsListenerTableEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    public final TcpEStatsListenerEntryEnt tcpEStatsListenerEntry;

                    private TcpEStatsListenerTableEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsListenerTable", "1.3.6.1.2.1.156.1.1.1", false, true, false, false);
                        this.tcpEStatsListenerEntry = new TcpEStatsListenerEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tcpEStatsListenerEntry
                        };
                    }
                    public static final class TcpEStatsListenerEntryEnt extends MIBEntry<TCPESTATSMIBDef>
                    {
                        public final TcpEStatsListenerStartTimeEnt tcpEStatsListenerStartTime;

                        public final TcpEStatsListenerSynRcvdEnt tcpEStatsListenerSynRcvd;

                        public final TcpEStatsListenerInitialEnt tcpEStatsListenerInitial;

                        public final TcpEStatsListenerEstablishedEnt tcpEStatsListenerEstablished;

                        public final TcpEStatsListenerAcceptedEnt tcpEStatsListenerAccepted;

                        public final TcpEStatsListenerExceedBacklogEnt tcpEStatsListenerExceedBacklog;

                        public final TcpEStatsListenerHCSynRcvdEnt tcpEStatsListenerHCSynRcvd;

                        public final TcpEStatsListenerHCInitialEnt tcpEStatsListenerHCInitial;

                        public final TcpEStatsListenerHCEstablishedEnt tcpEStatsListenerHCEstablished;

                        public final TcpEStatsListenerHCAcceptedEnt tcpEStatsListenerHCAccepted;

                        public final TcpEStatsListenerHCExceedBacklogEnt tcpEStatsListenerHCExceedBacklog;

                        public final TcpEStatsListenerCurConnsEnt tcpEStatsListenerCurConns;

                        public final TcpEStatsListenerMaxBacklogEnt tcpEStatsListenerMaxBacklog;

                        public final TcpEStatsListenerCurBacklogEnt tcpEStatsListenerCurBacklog;

                        public final TcpEStatsListenerCurEstabBacklogEnt tcpEStatsListenerCurEstabBacklog;

                        private TcpEStatsListenerEntryEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                        {
                            super(mib, parent, "tcpEStatsListenerEntry", "1.3.6.1.2.1.156.1.1.1.1", false, false, false, true);
                            this.tcpEStatsListenerStartTime = new TcpEStatsListenerStartTimeEnt(mib, this);
                            this.tcpEStatsListenerSynRcvd = new TcpEStatsListenerSynRcvdEnt(mib, this);
                            this.tcpEStatsListenerInitial = new TcpEStatsListenerInitialEnt(mib, this);
                            this.tcpEStatsListenerEstablished = new TcpEStatsListenerEstablishedEnt(mib, this);
                            this.tcpEStatsListenerAccepted = new TcpEStatsListenerAcceptedEnt(mib, this);
                            this.tcpEStatsListenerExceedBacklog = new TcpEStatsListenerExceedBacklogEnt(mib, this);
                            this.tcpEStatsListenerHCSynRcvd = new TcpEStatsListenerHCSynRcvdEnt(mib, this);
                            this.tcpEStatsListenerHCInitial = new TcpEStatsListenerHCInitialEnt(mib, this);
                            this.tcpEStatsListenerHCEstablished = new TcpEStatsListenerHCEstablishedEnt(mib, this);
                            this.tcpEStatsListenerHCAccepted = new TcpEStatsListenerHCAcceptedEnt(mib, this);
                            this.tcpEStatsListenerHCExceedBacklog = new TcpEStatsListenerHCExceedBacklogEnt(mib, this);
                            this.tcpEStatsListenerCurConns = new TcpEStatsListenerCurConnsEnt(mib, this);
                            this.tcpEStatsListenerMaxBacklog = new TcpEStatsListenerMaxBacklogEnt(mib, this);
                            this.tcpEStatsListenerCurBacklog = new TcpEStatsListenerCurBacklogEnt(mib, this);
                            this.tcpEStatsListenerCurEstabBacklog = new TcpEStatsListenerCurEstabBacklogEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.tcpEStatsListenerStartTime,
                                this.tcpEStatsListenerSynRcvd,
                                this.tcpEStatsListenerInitial,
                                this.tcpEStatsListenerEstablished,
                                this.tcpEStatsListenerAccepted,
                                this.tcpEStatsListenerExceedBacklog,
                                this.tcpEStatsListenerHCSynRcvd,
                                this.tcpEStatsListenerHCInitial,
                                this.tcpEStatsListenerHCEstablished,
                                this.tcpEStatsListenerHCAccepted,
                                this.tcpEStatsListenerHCExceedBacklog,
                                this.tcpEStatsListenerCurConns,
                                this.tcpEStatsListenerMaxBacklog,
                                this.tcpEStatsListenerCurBacklog,
                                this.tcpEStatsListenerCurEstabBacklog
                            };
                        }
                        public static final class TcpEStatsListenerStartTimeEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsListenerStartTimeEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsListenerStartTime", "1.3.6.1.2.1.156.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsListenerSynRcvdEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsListenerSynRcvdEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsListenerSynRcvd", "1.3.6.1.2.1.156.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsListenerInitialEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsListenerInitialEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsListenerInitial", "1.3.6.1.2.1.156.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsListenerEstablishedEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsListenerEstablishedEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsListenerEstablished", "1.3.6.1.2.1.156.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsListenerAcceptedEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsListenerAcceptedEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsListenerAccepted", "1.3.6.1.2.1.156.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsListenerExceedBacklogEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsListenerExceedBacklogEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsListenerExceedBacklog", "1.3.6.1.2.1.156.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsListenerHCSynRcvdEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsListenerHCSynRcvdEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsListenerHCSynRcvd", "1.3.6.1.2.1.156.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsListenerHCInitialEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsListenerHCInitialEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsListenerHCInitial", "1.3.6.1.2.1.156.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsListenerHCEstablishedEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsListenerHCEstablishedEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsListenerHCEstablished", "1.3.6.1.2.1.156.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsListenerHCAcceptedEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsListenerHCAcceptedEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsListenerHCAccepted", "1.3.6.1.2.1.156.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsListenerHCExceedBacklogEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsListenerHCExceedBacklogEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsListenerHCExceedBacklog", "1.3.6.1.2.1.156.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsListenerCurConnsEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsListenerCurConnsEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsListenerCurConns", "1.3.6.1.2.1.156.1.1.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsListenerMaxBacklogEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsListenerMaxBacklogEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsListenerMaxBacklog", "1.3.6.1.2.1.156.1.1.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsListenerCurBacklogEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsListenerCurBacklogEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsListenerCurBacklog", "1.3.6.1.2.1.156.1.1.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsListenerCurEstabBacklogEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsListenerCurEstabBacklogEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsListenerCurEstabBacklog", "1.3.6.1.2.1.156.1.1.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class TcpEStatsConnectIdTableEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    public final TcpEStatsConnectIdEntryEnt tcpEStatsConnectIdEntry;

                    private TcpEStatsConnectIdTableEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsConnectIdTable", "1.3.6.1.2.1.156.1.1.2", false, true, false, false);
                        this.tcpEStatsConnectIdEntry = new TcpEStatsConnectIdEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tcpEStatsConnectIdEntry
                        };
                    }
                    public static final class TcpEStatsConnectIdEntryEnt extends MIBEntry<TCPESTATSMIBDef>
                    {
                        public final TcpEStatsConnectIndexEnt tcpEStatsConnectIndex;

                        private TcpEStatsConnectIdEntryEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                        {
                            super(mib, parent, "tcpEStatsConnectIdEntry", "1.3.6.1.2.1.156.1.1.2.1", false, false, false, true);
                            this.tcpEStatsConnectIndex = new TcpEStatsConnectIndexEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.tcpEStatsConnectIndex
                            };
                        }
                        public static final class TcpEStatsConnectIndexEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsConnectIndexEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsConnectIndex", "1.3.6.1.2.1.156.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class TcpEStatsPerfTableEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    public final TcpEStatsPerfEntryEnt tcpEStatsPerfEntry;

                    private TcpEStatsPerfTableEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsPerfTable", "1.3.6.1.2.1.156.1.1.3", false, true, false, false);
                        this.tcpEStatsPerfEntry = new TcpEStatsPerfEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tcpEStatsPerfEntry
                        };
                    }
                    public static final class TcpEStatsPerfEntryEnt extends MIBEntry<TCPESTATSMIBDef>
                    {
                        /** The following objects provide statistics on aggregatesegments and data sent on a connection.  These provide adirect measure of the Internet capacity consumed by aconnection.*/
                        public final TcpEStatsPerfSegsOutEnt tcpEStatsPerfSegsOut;

                        public final TcpEStatsPerfDataSegsOutEnt tcpEStatsPerfDataSegsOut;

                        public final TcpEStatsPerfDataOctetsOutEnt tcpEStatsPerfDataOctetsOut;

                        public final TcpEStatsPerfHCDataOctetsOutEnt tcpEStatsPerfHCDataOctetsOut;

                        public final TcpEStatsPerfSegsRetransEnt tcpEStatsPerfSegsRetrans;

                        public final TcpEStatsPerfOctetsRetransEnt tcpEStatsPerfOctetsRetrans;

                        public final TcpEStatsPerfSegsInEnt tcpEStatsPerfSegsIn;

                        public final TcpEStatsPerfDataSegsInEnt tcpEStatsPerfDataSegsIn;

                        public final TcpEStatsPerfDataOctetsInEnt tcpEStatsPerfDataOctetsIn;

                        public final TcpEStatsPerfHCDataOctetsInEnt tcpEStatsPerfHCDataOctetsIn;

                        public final TcpEStatsPerfElapsedSecsEnt tcpEStatsPerfElapsedSecs;

                        public final TcpEStatsPerfElapsedMicroSecsEnt tcpEStatsPerfElapsedMicroSecs;

                        public final TcpEStatsPerfStartTimeStampEnt tcpEStatsPerfStartTimeStamp;

                        /** The following objects can be used to fit minimalperformance models to the TCP data rate.*/
                        public final TcpEStatsPerfCurMSSEnt tcpEStatsPerfCurMSS;

                        public final TcpEStatsPerfPipeSizeEnt tcpEStatsPerfPipeSize;

                        public final TcpEStatsPerfMaxPipeSizeEnt tcpEStatsPerfMaxPipeSize;

                        public final TcpEStatsPerfSmoothedRTTEnt tcpEStatsPerfSmoothedRTT;

                        public final TcpEStatsPerfCurRTOEnt tcpEStatsPerfCurRTO;

                        public final TcpEStatsPerfCongSignalsEnt tcpEStatsPerfCongSignals;

                        public final TcpEStatsPerfCurCwndEnt tcpEStatsPerfCurCwnd;

                        public final TcpEStatsPerfCurSsthreshEnt tcpEStatsPerfCurSsthresh;

                        public final TcpEStatsPerfTimeoutsEnt tcpEStatsPerfTimeouts;

                        /** The following objects instrument receiver window updatessent by the local receiver to the remote sender.  These canbe used to determine if the local receiver is exerting flowcontrol back pressure on the remote sender.*/
                        public final TcpEStatsPerfCurRwinSentEnt tcpEStatsPerfCurRwinSent;

                        public final TcpEStatsPerfMaxRwinSentEnt tcpEStatsPerfMaxRwinSent;

                        public final TcpEStatsPerfZeroRwinSentEnt tcpEStatsPerfZeroRwinSent;

                        /** The following objects instrument receiver window updatesfrom the far end-system to determine if the remote receiverhas sufficient buffer space or is exerting flow-controlback pressure on the local sender.*/
                        public final TcpEStatsPerfCurRwinRcvdEnt tcpEStatsPerfCurRwinRcvd;

                        public final TcpEStatsPerfMaxRwinRcvdEnt tcpEStatsPerfMaxRwinRcvd;

                        public final TcpEStatsPerfZeroRwinRcvdEnt tcpEStatsPerfZeroRwinRcvd;

                        /** The following optional objects can be used to quicklyidentify which subsystems are limiting TCP performance.There are three parallel pairs of instruments that measurethe extent to which TCP performance is limited by theannounced receiver window (indicating a receiverbottleneck), the current congestion window orretransmission timeout (indicating a path bottleneck) andall others events (indicating a sender bottleneck).These instruments SHOULD be updated every time the TCPoutput routine stops sending data.  The elapsed time sincethe previous stop is accumulated into the appropriateobject as determined by the previous stop reason (e.g.,stop state).  The current stop reason determines which timerwill be updated the next time TCP output stops.Since there is no explicit stop at the beginning of atimeout, it is necessary to retroactively reclassify theprevious stop as 'Congestion Limited'.*/
                        public final TcpEStatsPerfSndLimTransRwinEnt tcpEStatsPerfSndLimTransRwin;

                        public final TcpEStatsPerfSndLimTransCwndEnt tcpEStatsPerfSndLimTransCwnd;

                        public final TcpEStatsPerfSndLimTransSndEnt tcpEStatsPerfSndLimTransSnd;

                        public final TcpEStatsPerfSndLimTimeRwinEnt tcpEStatsPerfSndLimTimeRwin;

                        public final TcpEStatsPerfSndLimTimeCwndEnt tcpEStatsPerfSndLimTimeCwnd;

                        public final TcpEStatsPerfSndLimTimeSndEnt tcpEStatsPerfSndLimTimeSnd;

                        private TcpEStatsPerfEntryEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                        {
                            super(mib, parent, "tcpEStatsPerfEntry", "1.3.6.1.2.1.156.1.1.3.1", false, false, false, true);
                            this.tcpEStatsPerfSegsOut = new TcpEStatsPerfSegsOutEnt(mib, this);
                            this.tcpEStatsPerfDataSegsOut = new TcpEStatsPerfDataSegsOutEnt(mib, this);
                            this.tcpEStatsPerfDataOctetsOut = new TcpEStatsPerfDataOctetsOutEnt(mib, this);
                            this.tcpEStatsPerfHCDataOctetsOut = new TcpEStatsPerfHCDataOctetsOutEnt(mib, this);
                            this.tcpEStatsPerfSegsRetrans = new TcpEStatsPerfSegsRetransEnt(mib, this);
                            this.tcpEStatsPerfOctetsRetrans = new TcpEStatsPerfOctetsRetransEnt(mib, this);
                            this.tcpEStatsPerfSegsIn = new TcpEStatsPerfSegsInEnt(mib, this);
                            this.tcpEStatsPerfDataSegsIn = new TcpEStatsPerfDataSegsInEnt(mib, this);
                            this.tcpEStatsPerfDataOctetsIn = new TcpEStatsPerfDataOctetsInEnt(mib, this);
                            this.tcpEStatsPerfHCDataOctetsIn = new TcpEStatsPerfHCDataOctetsInEnt(mib, this);
                            this.tcpEStatsPerfElapsedSecs = new TcpEStatsPerfElapsedSecsEnt(mib, this);
                            this.tcpEStatsPerfElapsedMicroSecs = new TcpEStatsPerfElapsedMicroSecsEnt(mib, this);
                            this.tcpEStatsPerfStartTimeStamp = new TcpEStatsPerfStartTimeStampEnt(mib, this);
                            this.tcpEStatsPerfCurMSS = new TcpEStatsPerfCurMSSEnt(mib, this);
                            this.tcpEStatsPerfPipeSize = new TcpEStatsPerfPipeSizeEnt(mib, this);
                            this.tcpEStatsPerfMaxPipeSize = new TcpEStatsPerfMaxPipeSizeEnt(mib, this);
                            this.tcpEStatsPerfSmoothedRTT = new TcpEStatsPerfSmoothedRTTEnt(mib, this);
                            this.tcpEStatsPerfCurRTO = new TcpEStatsPerfCurRTOEnt(mib, this);
                            this.tcpEStatsPerfCongSignals = new TcpEStatsPerfCongSignalsEnt(mib, this);
                            this.tcpEStatsPerfCurCwnd = new TcpEStatsPerfCurCwndEnt(mib, this);
                            this.tcpEStatsPerfCurSsthresh = new TcpEStatsPerfCurSsthreshEnt(mib, this);
                            this.tcpEStatsPerfTimeouts = new TcpEStatsPerfTimeoutsEnt(mib, this);
                            this.tcpEStatsPerfCurRwinSent = new TcpEStatsPerfCurRwinSentEnt(mib, this);
                            this.tcpEStatsPerfMaxRwinSent = new TcpEStatsPerfMaxRwinSentEnt(mib, this);
                            this.tcpEStatsPerfZeroRwinSent = new TcpEStatsPerfZeroRwinSentEnt(mib, this);
                            this.tcpEStatsPerfCurRwinRcvd = new TcpEStatsPerfCurRwinRcvdEnt(mib, this);
                            this.tcpEStatsPerfMaxRwinRcvd = new TcpEStatsPerfMaxRwinRcvdEnt(mib, this);
                            this.tcpEStatsPerfZeroRwinRcvd = new TcpEStatsPerfZeroRwinRcvdEnt(mib, this);
                            this.tcpEStatsPerfSndLimTransRwin = new TcpEStatsPerfSndLimTransRwinEnt(mib, this);
                            this.tcpEStatsPerfSndLimTransCwnd = new TcpEStatsPerfSndLimTransCwndEnt(mib, this);
                            this.tcpEStatsPerfSndLimTransSnd = new TcpEStatsPerfSndLimTransSndEnt(mib, this);
                            this.tcpEStatsPerfSndLimTimeRwin = new TcpEStatsPerfSndLimTimeRwinEnt(mib, this);
                            this.tcpEStatsPerfSndLimTimeCwnd = new TcpEStatsPerfSndLimTimeCwndEnt(mib, this);
                            this.tcpEStatsPerfSndLimTimeSnd = new TcpEStatsPerfSndLimTimeSndEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.tcpEStatsPerfSegsOut,
                                this.tcpEStatsPerfDataSegsOut,
                                this.tcpEStatsPerfDataOctetsOut,
                                this.tcpEStatsPerfHCDataOctetsOut,
                                this.tcpEStatsPerfSegsRetrans,
                                this.tcpEStatsPerfOctetsRetrans,
                                this.tcpEStatsPerfSegsIn,
                                this.tcpEStatsPerfDataSegsIn,
                                this.tcpEStatsPerfDataOctetsIn,
                                this.tcpEStatsPerfHCDataOctetsIn,
                                this.tcpEStatsPerfElapsedSecs,
                                this.tcpEStatsPerfElapsedMicroSecs,
                                this.tcpEStatsPerfStartTimeStamp,
                                this.tcpEStatsPerfCurMSS,
                                this.tcpEStatsPerfPipeSize,
                                this.tcpEStatsPerfMaxPipeSize,
                                this.tcpEStatsPerfSmoothedRTT,
                                this.tcpEStatsPerfCurRTO,
                                this.tcpEStatsPerfCongSignals,
                                this.tcpEStatsPerfCurCwnd,
                                this.tcpEStatsPerfCurSsthresh,
                                this.tcpEStatsPerfTimeouts,
                                this.tcpEStatsPerfCurRwinSent,
                                this.tcpEStatsPerfMaxRwinSent,
                                this.tcpEStatsPerfZeroRwinSent,
                                this.tcpEStatsPerfCurRwinRcvd,
                                this.tcpEStatsPerfMaxRwinRcvd,
                                this.tcpEStatsPerfZeroRwinRcvd,
                                this.tcpEStatsPerfSndLimTransRwin,
                                this.tcpEStatsPerfSndLimTransCwnd,
                                this.tcpEStatsPerfSndLimTransSnd,
                                this.tcpEStatsPerfSndLimTimeRwin,
                                this.tcpEStatsPerfSndLimTimeCwnd,
                                this.tcpEStatsPerfSndLimTimeSnd
                            };
                        }
                        public static final class TcpEStatsPerfSegsOutEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfSegsOutEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfSegsOut", "1.3.6.1.2.1.156.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfDataSegsOutEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfDataSegsOutEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfDataSegsOut", "1.3.6.1.2.1.156.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfDataOctetsOutEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfDataOctetsOutEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfDataOctetsOut", "1.3.6.1.2.1.156.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfHCDataOctetsOutEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfHCDataOctetsOutEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfHCDataOctetsOut", "1.3.6.1.2.1.156.1.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfSegsRetransEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfSegsRetransEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfSegsRetrans", "1.3.6.1.2.1.156.1.1.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfOctetsRetransEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfOctetsRetransEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfOctetsRetrans", "1.3.6.1.2.1.156.1.1.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfSegsInEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfSegsInEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfSegsIn", "1.3.6.1.2.1.156.1.1.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfDataSegsInEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfDataSegsInEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfDataSegsIn", "1.3.6.1.2.1.156.1.1.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfDataOctetsInEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfDataOctetsInEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfDataOctetsIn", "1.3.6.1.2.1.156.1.1.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfHCDataOctetsInEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfHCDataOctetsInEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfHCDataOctetsIn", "1.3.6.1.2.1.156.1.1.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfElapsedSecsEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfElapsedSecsEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfElapsedSecs", "1.3.6.1.2.1.156.1.1.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfElapsedMicroSecsEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfElapsedMicroSecsEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfElapsedMicroSecs", "1.3.6.1.2.1.156.1.1.3.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfStartTimeStampEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfStartTimeStampEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfStartTimeStamp", "1.3.6.1.2.1.156.1.1.3.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfCurMSSEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfCurMSSEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfCurMSS", "1.3.6.1.2.1.156.1.1.3.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfPipeSizeEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfPipeSizeEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfPipeSize", "1.3.6.1.2.1.156.1.1.3.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfMaxPipeSizeEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfMaxPipeSizeEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfMaxPipeSize", "1.3.6.1.2.1.156.1.1.3.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfSmoothedRTTEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfSmoothedRTTEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfSmoothedRTT", "1.3.6.1.2.1.156.1.1.3.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfCurRTOEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfCurRTOEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfCurRTO", "1.3.6.1.2.1.156.1.1.3.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfCongSignalsEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfCongSignalsEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfCongSignals", "1.3.6.1.2.1.156.1.1.3.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfCurCwndEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfCurCwndEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfCurCwnd", "1.3.6.1.2.1.156.1.1.3.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfCurSsthreshEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfCurSsthreshEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfCurSsthresh", "1.3.6.1.2.1.156.1.1.3.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfTimeoutsEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfTimeoutsEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfTimeouts", "1.3.6.1.2.1.156.1.1.3.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfCurRwinSentEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfCurRwinSentEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfCurRwinSent", "1.3.6.1.2.1.156.1.1.3.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfMaxRwinSentEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfMaxRwinSentEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfMaxRwinSent", "1.3.6.1.2.1.156.1.1.3.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfZeroRwinSentEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfZeroRwinSentEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfZeroRwinSent", "1.3.6.1.2.1.156.1.1.3.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfCurRwinRcvdEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfCurRwinRcvdEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfCurRwinRcvd", "1.3.6.1.2.1.156.1.1.3.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfMaxRwinRcvdEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfMaxRwinRcvdEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfMaxRwinRcvd", "1.3.6.1.2.1.156.1.1.3.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfZeroRwinRcvdEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfZeroRwinRcvdEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfZeroRwinRcvd", "1.3.6.1.2.1.156.1.1.3.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfSndLimTransRwinEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfSndLimTransRwinEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfSndLimTransRwin", "1.3.6.1.2.1.156.1.1.3.1.31", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfSndLimTransCwndEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfSndLimTransCwndEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfSndLimTransCwnd", "1.3.6.1.2.1.156.1.1.3.1.32", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfSndLimTransSndEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfSndLimTransSndEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfSndLimTransSnd", "1.3.6.1.2.1.156.1.1.3.1.33", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfSndLimTimeRwinEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfSndLimTimeRwinEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfSndLimTimeRwin", "1.3.6.1.2.1.156.1.1.3.1.34", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfSndLimTimeCwndEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfSndLimTimeCwndEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfSndLimTimeCwnd", "1.3.6.1.2.1.156.1.1.3.1.35", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPerfSndLimTimeSndEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPerfSndLimTimeSndEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPerfSndLimTimeSnd", "1.3.6.1.2.1.156.1.1.3.1.36", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class TcpEStatsPathTableEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    public final TcpEStatsPathEntryEnt tcpEStatsPathEntry;

                    private TcpEStatsPathTableEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsPathTable", "1.3.6.1.2.1.156.1.1.4", false, true, false, false);
                        this.tcpEStatsPathEntry = new TcpEStatsPathEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tcpEStatsPathEntry
                        };
                    }
                    public static final class TcpEStatsPathEntryEnt extends MIBEntry<TCPESTATSMIBDef>
                    {
                        /** The following optional objects can be used to infer segmentreordering on the path from the local sender to the remotereceiver.*/
                        public final TcpEStatsPathRetranThreshEnt tcpEStatsPathRetranThresh;

                        public final TcpEStatsPathNonRecovDAEpisodesEnt tcpEStatsPathNonRecovDAEpisodes;

                        public final TcpEStatsPathSumOctetsReorderedEnt tcpEStatsPathSumOctetsReordered;

                        public final TcpEStatsPathNonRecovDAEnt tcpEStatsPathNonRecovDA;

                        /** The following optional objects instrument the round triptime estimator and the retransmission timeout timer.*/
                        public final TcpEStatsPathSampleRTTEnt tcpEStatsPathSampleRTT;

                        public final TcpEStatsPathRTTVarEnt tcpEStatsPathRTTVar;

                        public final TcpEStatsPathMaxRTTEnt tcpEStatsPathMaxRTT;

                        public final TcpEStatsPathMinRTTEnt tcpEStatsPathMinRTT;

                        public final TcpEStatsPathSumRTTEnt tcpEStatsPathSumRTT;

                        public final TcpEStatsPathHCSumRTTEnt tcpEStatsPathHCSumRTT;

                        public final TcpEStatsPathCountRTTEnt tcpEStatsPathCountRTT;

                        public final TcpEStatsPathMaxRTOEnt tcpEStatsPathMaxRTO;

                        public final TcpEStatsPathMinRTOEnt tcpEStatsPathMinRTO;

                        /** The following optional objects provide information abouthow TCP is using the IP layer.*/
                        public final TcpEStatsPathIpTtlEnt tcpEStatsPathIpTtl;

                        public final TcpEStatsPathIpTosInEnt tcpEStatsPathIpTosIn;

                        public final TcpEStatsPathIpTosOutEnt tcpEStatsPathIpTosOut;

                        /** The following optional objects characterize the congestionfeedback signals by collecting statistics on how thecongestion events are correlated to losses, changes in RTTand other protocol events.*/
                        public final TcpEStatsPathPreCongSumCwndEnt tcpEStatsPathPreCongSumCwnd;

                        public final TcpEStatsPathPreCongSumRTTEnt tcpEStatsPathPreCongSumRTT;

                        public final TcpEStatsPathPostCongSumRTTEnt tcpEStatsPathPostCongSumRTT;

                        public final TcpEStatsPathPostCongCountRTTEnt tcpEStatsPathPostCongCountRTT;

                        /** The following optional objects can be used to detect othertypes of non-loss congestion signals such as source quenchor ECN.*/
                        public final TcpEStatsPathECNsignalsEnt tcpEStatsPathECNsignals;

                        /** The following optional objects are receiver sideinstruments of the path from the sender to the receiver.  Ingeneral, the receiver has less information about the stateof the path because the receiver does not have a robustmechanism to infer the sender's actions.*/
                        public final TcpEStatsPathDupAckEpisodesEnt tcpEStatsPathDupAckEpisodes;

                        public final TcpEStatsPathRcvRTTEnt tcpEStatsPathRcvRTT;

                        public final TcpEStatsPathDupAcksOutEnt tcpEStatsPathDupAcksOut;

                        public final TcpEStatsPathCERcvdEnt tcpEStatsPathCERcvd;

                        public final TcpEStatsPathECESentEnt tcpEStatsPathECESent;

                        private TcpEStatsPathEntryEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                        {
                            super(mib, parent, "tcpEStatsPathEntry", "1.3.6.1.2.1.156.1.1.4.1", false, false, false, true);
                            this.tcpEStatsPathRetranThresh = new TcpEStatsPathRetranThreshEnt(mib, this);
                            this.tcpEStatsPathNonRecovDAEpisodes = new TcpEStatsPathNonRecovDAEpisodesEnt(mib, this);
                            this.tcpEStatsPathSumOctetsReordered = new TcpEStatsPathSumOctetsReorderedEnt(mib, this);
                            this.tcpEStatsPathNonRecovDA = new TcpEStatsPathNonRecovDAEnt(mib, this);
                            this.tcpEStatsPathSampleRTT = new TcpEStatsPathSampleRTTEnt(mib, this);
                            this.tcpEStatsPathRTTVar = new TcpEStatsPathRTTVarEnt(mib, this);
                            this.tcpEStatsPathMaxRTT = new TcpEStatsPathMaxRTTEnt(mib, this);
                            this.tcpEStatsPathMinRTT = new TcpEStatsPathMinRTTEnt(mib, this);
                            this.tcpEStatsPathSumRTT = new TcpEStatsPathSumRTTEnt(mib, this);
                            this.tcpEStatsPathHCSumRTT = new TcpEStatsPathHCSumRTTEnt(mib, this);
                            this.tcpEStatsPathCountRTT = new TcpEStatsPathCountRTTEnt(mib, this);
                            this.tcpEStatsPathMaxRTO = new TcpEStatsPathMaxRTOEnt(mib, this);
                            this.tcpEStatsPathMinRTO = new TcpEStatsPathMinRTOEnt(mib, this);
                            this.tcpEStatsPathIpTtl = new TcpEStatsPathIpTtlEnt(mib, this);
                            this.tcpEStatsPathIpTosIn = new TcpEStatsPathIpTosInEnt(mib, this);
                            this.tcpEStatsPathIpTosOut = new TcpEStatsPathIpTosOutEnt(mib, this);
                            this.tcpEStatsPathPreCongSumCwnd = new TcpEStatsPathPreCongSumCwndEnt(mib, this);
                            this.tcpEStatsPathPreCongSumRTT = new TcpEStatsPathPreCongSumRTTEnt(mib, this);
                            this.tcpEStatsPathPostCongSumRTT = new TcpEStatsPathPostCongSumRTTEnt(mib, this);
                            this.tcpEStatsPathPostCongCountRTT = new TcpEStatsPathPostCongCountRTTEnt(mib, this);
                            this.tcpEStatsPathECNsignals = new TcpEStatsPathECNsignalsEnt(mib, this);
                            this.tcpEStatsPathDupAckEpisodes = new TcpEStatsPathDupAckEpisodesEnt(mib, this);
                            this.tcpEStatsPathRcvRTT = new TcpEStatsPathRcvRTTEnt(mib, this);
                            this.tcpEStatsPathDupAcksOut = new TcpEStatsPathDupAcksOutEnt(mib, this);
                            this.tcpEStatsPathCERcvd = new TcpEStatsPathCERcvdEnt(mib, this);
                            this.tcpEStatsPathECESent = new TcpEStatsPathECESentEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.tcpEStatsPathRetranThresh,
                                this.tcpEStatsPathNonRecovDAEpisodes,
                                this.tcpEStatsPathSumOctetsReordered,
                                this.tcpEStatsPathNonRecovDA,
                                this.tcpEStatsPathSampleRTT,
                                this.tcpEStatsPathRTTVar,
                                this.tcpEStatsPathMaxRTT,
                                this.tcpEStatsPathMinRTT,
                                this.tcpEStatsPathSumRTT,
                                this.tcpEStatsPathHCSumRTT,
                                this.tcpEStatsPathCountRTT,
                                this.tcpEStatsPathMaxRTO,
                                this.tcpEStatsPathMinRTO,
                                this.tcpEStatsPathIpTtl,
                                this.tcpEStatsPathIpTosIn,
                                this.tcpEStatsPathIpTosOut,
                                this.tcpEStatsPathPreCongSumCwnd,
                                this.tcpEStatsPathPreCongSumRTT,
                                this.tcpEStatsPathPostCongSumRTT,
                                this.tcpEStatsPathPostCongCountRTT,
                                this.tcpEStatsPathECNsignals,
                                this.tcpEStatsPathDupAckEpisodes,
                                this.tcpEStatsPathRcvRTT,
                                this.tcpEStatsPathDupAcksOut,
                                this.tcpEStatsPathCERcvd,
                                this.tcpEStatsPathECESent
                            };
                        }
                        public static final class TcpEStatsPathRetranThreshEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathRetranThreshEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathRetranThresh", "1.3.6.1.2.1.156.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathNonRecovDAEpisodesEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathNonRecovDAEpisodesEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathNonRecovDAEpisodes", "1.3.6.1.2.1.156.1.1.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathSumOctetsReorderedEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathSumOctetsReorderedEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathSumOctetsReordered", "1.3.6.1.2.1.156.1.1.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathNonRecovDAEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathNonRecovDAEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathNonRecovDA", "1.3.6.1.2.1.156.1.1.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathSampleRTTEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathSampleRTTEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathSampleRTT", "1.3.6.1.2.1.156.1.1.4.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathRTTVarEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathRTTVarEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathRTTVar", "1.3.6.1.2.1.156.1.1.4.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathMaxRTTEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathMaxRTTEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathMaxRTT", "1.3.6.1.2.1.156.1.1.4.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathMinRTTEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathMinRTTEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathMinRTT", "1.3.6.1.2.1.156.1.1.4.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathSumRTTEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathSumRTTEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathSumRTT", "1.3.6.1.2.1.156.1.1.4.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathHCSumRTTEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathHCSumRTTEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathHCSumRTT", "1.3.6.1.2.1.156.1.1.4.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathCountRTTEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathCountRTTEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathCountRTT", "1.3.6.1.2.1.156.1.1.4.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathMaxRTOEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathMaxRTOEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathMaxRTO", "1.3.6.1.2.1.156.1.1.4.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathMinRTOEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathMinRTOEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathMinRTO", "1.3.6.1.2.1.156.1.1.4.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathIpTtlEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathIpTtlEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathIpTtl", "1.3.6.1.2.1.156.1.1.4.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathIpTosInEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathIpTosInEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathIpTosIn", "1.3.6.1.2.1.156.1.1.4.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathIpTosOutEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathIpTosOutEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathIpTosOut", "1.3.6.1.2.1.156.1.1.4.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathPreCongSumCwndEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathPreCongSumCwndEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathPreCongSumCwnd", "1.3.6.1.2.1.156.1.1.4.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathPreCongSumRTTEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathPreCongSumRTTEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathPreCongSumRTT", "1.3.6.1.2.1.156.1.1.4.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathPostCongSumRTTEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathPostCongSumRTTEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathPostCongSumRTT", "1.3.6.1.2.1.156.1.1.4.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathPostCongCountRTTEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathPostCongCountRTTEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathPostCongCountRTT", "1.3.6.1.2.1.156.1.1.4.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathECNsignalsEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathECNsignalsEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathECNsignals", "1.3.6.1.2.1.156.1.1.4.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathDupAckEpisodesEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathDupAckEpisodesEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathDupAckEpisodes", "1.3.6.1.2.1.156.1.1.4.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathRcvRTTEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathRcvRTTEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathRcvRTT", "1.3.6.1.2.1.156.1.1.4.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathDupAcksOutEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathDupAcksOutEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathDupAcksOut", "1.3.6.1.2.1.156.1.1.4.1.30", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathCERcvdEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathCERcvdEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathCERcvd", "1.3.6.1.2.1.156.1.1.4.1.31", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsPathECESentEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsPathECESentEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsPathECESent", "1.3.6.1.2.1.156.1.1.4.1.32", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class TcpEStatsStackTableEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    public final TcpEStatsStackEntryEnt tcpEStatsStackEntry;

                    private TcpEStatsStackTableEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsStackTable", "1.3.6.1.2.1.156.1.1.5", false, true, false, false);
                        this.tcpEStatsStackEntry = new TcpEStatsStackEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tcpEStatsStackEntry
                        };
                    }
                    public static final class TcpEStatsStackEntryEnt extends MIBEntry<TCPESTATSMIBDef>
                    {
                        /** The following objects reflect TCP options carried on theSYN or SYN-ACK.  These options are used to provideadditional protocol parameters or to enable variousoptional TCP features or algorithms.Except as noted, the TCP protocol does not permit theseoptions to change after the SYN exchange.*/
                        public final TcpEStatsStackActiveOpenEnt tcpEStatsStackActiveOpen;

                        public final TcpEStatsStackMSSSentEnt tcpEStatsStackMSSSent;

                        public final TcpEStatsStackMSSRcvdEnt tcpEStatsStackMSSRcvd;

                        public final TcpEStatsStackWinScaleSentEnt tcpEStatsStackWinScaleSent;

                        public final TcpEStatsStackWinScaleRcvdEnt tcpEStatsStackWinScaleRcvd;

                        public final TcpEStatsStackTimeStampsEnt tcpEStatsStackTimeStamps;

                        public final TcpEStatsStackECNEnt tcpEStatsStackECN;

                        public final TcpEStatsStackWillSendSACKEnt tcpEStatsStackWillSendSACK;

                        public final TcpEStatsStackWillUseSACKEnt tcpEStatsStackWillUseSACK;

                        /** The following two objects reflect the current state of theconnection.*/
                        public final TcpEStatsStackStateEnt tcpEStatsStackState;

                        public final TcpEStatsStackNagleEnt tcpEStatsStackNagle;

                        /** The following objects instrument the overall operation ofTCP congestion control and data retransmissions.  Theseinstruments are sufficient to fit the actual performance toan updated macroscopic performance model [RFC2581] [Mat97][Pad98].*/
                        public final TcpEStatsStackMaxSsCwndEnt tcpEStatsStackMaxSsCwnd;

                        public final TcpEStatsStackMaxCaCwndEnt tcpEStatsStackMaxCaCwnd;

                        public final TcpEStatsStackMaxSsthreshEnt tcpEStatsStackMaxSsthresh;

                        public final TcpEStatsStackMinSsthreshEnt tcpEStatsStackMinSsthresh;

                        public final TcpEStatsStackInRecoveryEnt tcpEStatsStackInRecovery;

                        public final TcpEStatsStackDupAcksInEnt tcpEStatsStackDupAcksIn;

                        public final TcpEStatsStackSpuriousFrDetectedEnt tcpEStatsStackSpuriousFrDetected;

                        public final TcpEStatsStackSpuriousRtoDetectedEnt tcpEStatsStackSpuriousRtoDetected;

                        /** The following optional objects instrument unusual protocolevents that probably indicate implementation problems inthe protocol or path.*/
                        public final TcpEStatsStackSoftErrorsEnt tcpEStatsStackSoftErrors;

                        public final TcpEStatsStackSoftErrorReasonEnt tcpEStatsStackSoftErrorReason;

                        /** The following optional objects expose the detailedoperation of the congestion control algorithms.*/
                        public final TcpEStatsStackSlowStartEnt tcpEStatsStackSlowStart;

                        public final TcpEStatsStackCongAvoidEnt tcpEStatsStackCongAvoid;

                        public final TcpEStatsStackOtherReductionsEnt tcpEStatsStackOtherReductions;

                        public final TcpEStatsStackCongOverCountEnt tcpEStatsStackCongOverCount;

                        public final TcpEStatsStackFastRetranEnt tcpEStatsStackFastRetran;

                        public final TcpEStatsStackSubsequentTimeoutsEnt tcpEStatsStackSubsequentTimeouts;

                        public final TcpEStatsStackCurTimeoutCountEnt tcpEStatsStackCurTimeoutCount;

                        public final TcpEStatsStackAbruptTimeoutsEnt tcpEStatsStackAbruptTimeouts;

                        public final TcpEStatsStackSACKsRcvdEnt tcpEStatsStackSACKsRcvd;

                        public final TcpEStatsStackSACKBlocksRcvdEnt tcpEStatsStackSACKBlocksRcvd;

                        public final TcpEStatsStackSendStallEnt tcpEStatsStackSendStall;

                        public final TcpEStatsStackDSACKDupsEnt tcpEStatsStackDSACKDups;

                        /** The following optional objects instrument path MTUdiscovery.*/
                        public final TcpEStatsStackMaxMSSEnt tcpEStatsStackMaxMSS;

                        public final TcpEStatsStackMinMSSEnt tcpEStatsStackMinMSS;

                        /** The following optional initial value objects are useful forconformance testing instruments on application progress andconsumed network resources.*/
                        public final TcpEStatsStackSndInitialEnt tcpEStatsStackSndInitial;

                        public final TcpEStatsStackRecInitialEnt tcpEStatsStackRecInitial;

                        /** The following optional objects instrument the sendersbuffer usage, including any buffering in the applicationinterface to TCP and the retransmit queue.  All 'buffermemory' instruments are assumed to include OS datastructure overhead.*/
                        public final TcpEStatsStackCurRetxQueueEnt tcpEStatsStackCurRetxQueue;

                        public final TcpEStatsStackMaxRetxQueueEnt tcpEStatsStackMaxRetxQueue;

                        public final TcpEStatsStackCurReasmQueueEnt tcpEStatsStackCurReasmQueue;

                        public final TcpEStatsStackMaxReasmQueueEnt tcpEStatsStackMaxReasmQueue;

                        private TcpEStatsStackEntryEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                        {
                            super(mib, parent, "tcpEStatsStackEntry", "1.3.6.1.2.1.156.1.1.5.1", false, false, false, true);
                            this.tcpEStatsStackActiveOpen = new TcpEStatsStackActiveOpenEnt(mib, this);
                            this.tcpEStatsStackMSSSent = new TcpEStatsStackMSSSentEnt(mib, this);
                            this.tcpEStatsStackMSSRcvd = new TcpEStatsStackMSSRcvdEnt(mib, this);
                            this.tcpEStatsStackWinScaleSent = new TcpEStatsStackWinScaleSentEnt(mib, this);
                            this.tcpEStatsStackWinScaleRcvd = new TcpEStatsStackWinScaleRcvdEnt(mib, this);
                            this.tcpEStatsStackTimeStamps = new TcpEStatsStackTimeStampsEnt(mib, this);
                            this.tcpEStatsStackECN = new TcpEStatsStackECNEnt(mib, this);
                            this.tcpEStatsStackWillSendSACK = new TcpEStatsStackWillSendSACKEnt(mib, this);
                            this.tcpEStatsStackWillUseSACK = new TcpEStatsStackWillUseSACKEnt(mib, this);
                            this.tcpEStatsStackState = new TcpEStatsStackStateEnt(mib, this);
                            this.tcpEStatsStackNagle = new TcpEStatsStackNagleEnt(mib, this);
                            this.tcpEStatsStackMaxSsCwnd = new TcpEStatsStackMaxSsCwndEnt(mib, this);
                            this.tcpEStatsStackMaxCaCwnd = new TcpEStatsStackMaxCaCwndEnt(mib, this);
                            this.tcpEStatsStackMaxSsthresh = new TcpEStatsStackMaxSsthreshEnt(mib, this);
                            this.tcpEStatsStackMinSsthresh = new TcpEStatsStackMinSsthreshEnt(mib, this);
                            this.tcpEStatsStackInRecovery = new TcpEStatsStackInRecoveryEnt(mib, this);
                            this.tcpEStatsStackDupAcksIn = new TcpEStatsStackDupAcksInEnt(mib, this);
                            this.tcpEStatsStackSpuriousFrDetected = new TcpEStatsStackSpuriousFrDetectedEnt(mib, this);
                            this.tcpEStatsStackSpuriousRtoDetected = new TcpEStatsStackSpuriousRtoDetectedEnt(mib, this);
                            this.tcpEStatsStackSoftErrors = new TcpEStatsStackSoftErrorsEnt(mib, this);
                            this.tcpEStatsStackSoftErrorReason = new TcpEStatsStackSoftErrorReasonEnt(mib, this);
                            this.tcpEStatsStackSlowStart = new TcpEStatsStackSlowStartEnt(mib, this);
                            this.tcpEStatsStackCongAvoid = new TcpEStatsStackCongAvoidEnt(mib, this);
                            this.tcpEStatsStackOtherReductions = new TcpEStatsStackOtherReductionsEnt(mib, this);
                            this.tcpEStatsStackCongOverCount = new TcpEStatsStackCongOverCountEnt(mib, this);
                            this.tcpEStatsStackFastRetran = new TcpEStatsStackFastRetranEnt(mib, this);
                            this.tcpEStatsStackSubsequentTimeouts = new TcpEStatsStackSubsequentTimeoutsEnt(mib, this);
                            this.tcpEStatsStackCurTimeoutCount = new TcpEStatsStackCurTimeoutCountEnt(mib, this);
                            this.tcpEStatsStackAbruptTimeouts = new TcpEStatsStackAbruptTimeoutsEnt(mib, this);
                            this.tcpEStatsStackSACKsRcvd = new TcpEStatsStackSACKsRcvdEnt(mib, this);
                            this.tcpEStatsStackSACKBlocksRcvd = new TcpEStatsStackSACKBlocksRcvdEnt(mib, this);
                            this.tcpEStatsStackSendStall = new TcpEStatsStackSendStallEnt(mib, this);
                            this.tcpEStatsStackDSACKDups = new TcpEStatsStackDSACKDupsEnt(mib, this);
                            this.tcpEStatsStackMaxMSS = new TcpEStatsStackMaxMSSEnt(mib, this);
                            this.tcpEStatsStackMinMSS = new TcpEStatsStackMinMSSEnt(mib, this);
                            this.tcpEStatsStackSndInitial = new TcpEStatsStackSndInitialEnt(mib, this);
                            this.tcpEStatsStackRecInitial = new TcpEStatsStackRecInitialEnt(mib, this);
                            this.tcpEStatsStackCurRetxQueue = new TcpEStatsStackCurRetxQueueEnt(mib, this);
                            this.tcpEStatsStackMaxRetxQueue = new TcpEStatsStackMaxRetxQueueEnt(mib, this);
                            this.tcpEStatsStackCurReasmQueue = new TcpEStatsStackCurReasmQueueEnt(mib, this);
                            this.tcpEStatsStackMaxReasmQueue = new TcpEStatsStackMaxReasmQueueEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.tcpEStatsStackActiveOpen,
                                this.tcpEStatsStackMSSSent,
                                this.tcpEStatsStackMSSRcvd,
                                this.tcpEStatsStackWinScaleSent,
                                this.tcpEStatsStackWinScaleRcvd,
                                this.tcpEStatsStackTimeStamps,
                                this.tcpEStatsStackECN,
                                this.tcpEStatsStackWillSendSACK,
                                this.tcpEStatsStackWillUseSACK,
                                this.tcpEStatsStackState,
                                this.tcpEStatsStackNagle,
                                this.tcpEStatsStackMaxSsCwnd,
                                this.tcpEStatsStackMaxCaCwnd,
                                this.tcpEStatsStackMaxSsthresh,
                                this.tcpEStatsStackMinSsthresh,
                                this.tcpEStatsStackInRecovery,
                                this.tcpEStatsStackDupAcksIn,
                                this.tcpEStatsStackSpuriousFrDetected,
                                this.tcpEStatsStackSpuriousRtoDetected,
                                this.tcpEStatsStackSoftErrors,
                                this.tcpEStatsStackSoftErrorReason,
                                this.tcpEStatsStackSlowStart,
                                this.tcpEStatsStackCongAvoid,
                                this.tcpEStatsStackOtherReductions,
                                this.tcpEStatsStackCongOverCount,
                                this.tcpEStatsStackFastRetran,
                                this.tcpEStatsStackSubsequentTimeouts,
                                this.tcpEStatsStackCurTimeoutCount,
                                this.tcpEStatsStackAbruptTimeouts,
                                this.tcpEStatsStackSACKsRcvd,
                                this.tcpEStatsStackSACKBlocksRcvd,
                                this.tcpEStatsStackSendStall,
                                this.tcpEStatsStackDSACKDups,
                                this.tcpEStatsStackMaxMSS,
                                this.tcpEStatsStackMinMSS,
                                this.tcpEStatsStackSndInitial,
                                this.tcpEStatsStackRecInitial,
                                this.tcpEStatsStackCurRetxQueue,
                                this.tcpEStatsStackMaxRetxQueue,
                                this.tcpEStatsStackCurReasmQueue,
                                this.tcpEStatsStackMaxReasmQueue
                            };
                        }
                        public static final class TcpEStatsStackActiveOpenEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackActiveOpenEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackActiveOpen", "1.3.6.1.2.1.156.1.1.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackMSSSentEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackMSSSentEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackMSSSent", "1.3.6.1.2.1.156.1.1.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackMSSRcvdEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackMSSRcvdEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackMSSRcvd", "1.3.6.1.2.1.156.1.1.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackWinScaleSentEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackWinScaleSentEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackWinScaleSent", "1.3.6.1.2.1.156.1.1.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackWinScaleRcvdEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackWinScaleRcvdEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackWinScaleRcvd", "1.3.6.1.2.1.156.1.1.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackTimeStampsEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackTimeStampsEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackTimeStamps", "1.3.6.1.2.1.156.1.1.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackECNEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackECNEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackECN", "1.3.6.1.2.1.156.1.1.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackWillSendSACKEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackWillSendSACKEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackWillSendSACK", "1.3.6.1.2.1.156.1.1.5.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackWillUseSACKEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackWillUseSACKEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackWillUseSACK", "1.3.6.1.2.1.156.1.1.5.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackStateEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackStateEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackState", "1.3.6.1.2.1.156.1.1.5.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackNagleEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackNagleEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackNagle", "1.3.6.1.2.1.156.1.1.5.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackMaxSsCwndEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackMaxSsCwndEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackMaxSsCwnd", "1.3.6.1.2.1.156.1.1.5.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackMaxCaCwndEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackMaxCaCwndEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackMaxCaCwnd", "1.3.6.1.2.1.156.1.1.5.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackMaxSsthreshEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackMaxSsthreshEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackMaxSsthresh", "1.3.6.1.2.1.156.1.1.5.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackMinSsthreshEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackMinSsthreshEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackMinSsthresh", "1.3.6.1.2.1.156.1.1.5.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackInRecoveryEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackInRecoveryEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackInRecovery", "1.3.6.1.2.1.156.1.1.5.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackDupAcksInEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackDupAcksInEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackDupAcksIn", "1.3.6.1.2.1.156.1.1.5.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackSpuriousFrDetectedEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackSpuriousFrDetectedEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackSpuriousFrDetected", "1.3.6.1.2.1.156.1.1.5.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackSpuriousRtoDetectedEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackSpuriousRtoDetectedEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackSpuriousRtoDetected", "1.3.6.1.2.1.156.1.1.5.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackSoftErrorsEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackSoftErrorsEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackSoftErrors", "1.3.6.1.2.1.156.1.1.5.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackSoftErrorReasonEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackSoftErrorReasonEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackSoftErrorReason", "1.3.6.1.2.1.156.1.1.5.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackSlowStartEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackSlowStartEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackSlowStart", "1.3.6.1.2.1.156.1.1.5.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackCongAvoidEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackCongAvoidEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackCongAvoid", "1.3.6.1.2.1.156.1.1.5.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackOtherReductionsEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackOtherReductionsEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackOtherReductions", "1.3.6.1.2.1.156.1.1.5.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackCongOverCountEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackCongOverCountEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackCongOverCount", "1.3.6.1.2.1.156.1.1.5.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackFastRetranEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackFastRetranEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackFastRetran", "1.3.6.1.2.1.156.1.1.5.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackSubsequentTimeoutsEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackSubsequentTimeoutsEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackSubsequentTimeouts", "1.3.6.1.2.1.156.1.1.5.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackCurTimeoutCountEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackCurTimeoutCountEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackCurTimeoutCount", "1.3.6.1.2.1.156.1.1.5.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackAbruptTimeoutsEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackAbruptTimeoutsEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackAbruptTimeouts", "1.3.6.1.2.1.156.1.1.5.1.30", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackSACKsRcvdEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackSACKsRcvdEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackSACKsRcvd", "1.3.6.1.2.1.156.1.1.5.1.31", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackSACKBlocksRcvdEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackSACKBlocksRcvdEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackSACKBlocksRcvd", "1.3.6.1.2.1.156.1.1.5.1.32", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackSendStallEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackSendStallEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackSendStall", "1.3.6.1.2.1.156.1.1.5.1.33", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackDSACKDupsEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackDSACKDupsEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackDSACKDups", "1.3.6.1.2.1.156.1.1.5.1.34", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackMaxMSSEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackMaxMSSEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackMaxMSS", "1.3.6.1.2.1.156.1.1.5.1.35", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackMinMSSEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackMinMSSEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackMinMSS", "1.3.6.1.2.1.156.1.1.5.1.36", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackSndInitialEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackSndInitialEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackSndInitial", "1.3.6.1.2.1.156.1.1.5.1.37", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackRecInitialEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackRecInitialEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackRecInitial", "1.3.6.1.2.1.156.1.1.5.1.38", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackCurRetxQueueEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackCurRetxQueueEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackCurRetxQueue", "1.3.6.1.2.1.156.1.1.5.1.39", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackMaxRetxQueueEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackMaxRetxQueueEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackMaxRetxQueue", "1.3.6.1.2.1.156.1.1.5.1.40", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackCurReasmQueueEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackCurReasmQueueEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackCurReasmQueue", "1.3.6.1.2.1.156.1.1.5.1.41", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsStackMaxReasmQueueEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsStackMaxReasmQueueEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsStackMaxReasmQueue", "1.3.6.1.2.1.156.1.1.5.1.42", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class TcpEStatsAppTableEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    public final TcpEStatsAppEntryEnt tcpEStatsAppEntry;

                    private TcpEStatsAppTableEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsAppTable", "1.3.6.1.2.1.156.1.1.6", false, true, false, false);
                        this.tcpEStatsAppEntry = new TcpEStatsAppEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tcpEStatsAppEntry
                        };
                    }
                    public static final class TcpEStatsAppEntryEnt extends MIBEntry<TCPESTATSMIBDef>
                    {
                        /** The following objects provide throughput statistics for theconnection including sequence numbers and elapsedapplication data.  These permit direct observation of theapplications progress, in terms of elapsed data deliveryand elapsed time.*/
                        public final TcpEStatsAppSndUnaEnt tcpEStatsAppSndUna;

                        public final TcpEStatsAppSndNxtEnt tcpEStatsAppSndNxt;

                        public final TcpEStatsAppSndMaxEnt tcpEStatsAppSndMax;

                        public final TcpEStatsAppThruOctetsAckedEnt tcpEStatsAppThruOctetsAcked;

                        public final TcpEStatsAppHCThruOctetsAckedEnt tcpEStatsAppHCThruOctetsAcked;

                        public final TcpEStatsAppRcvNxtEnt tcpEStatsAppRcvNxt;

                        public final TcpEStatsAppThruOctetsReceivedEnt tcpEStatsAppThruOctetsReceived;

                        public final TcpEStatsAppHCThruOctetsReceivedEnt tcpEStatsAppHCThruOctetsReceived;

                        public final TcpEStatsAppCurAppWQueueEnt tcpEStatsAppCurAppWQueue;

                        public final TcpEStatsAppMaxAppWQueueEnt tcpEStatsAppMaxAppWQueue;

                        public final TcpEStatsAppCurAppRQueueEnt tcpEStatsAppCurAppRQueue;

                        public final TcpEStatsAppMaxAppRQueueEnt tcpEStatsAppMaxAppRQueue;

                        private TcpEStatsAppEntryEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                        {
                            super(mib, parent, "tcpEStatsAppEntry", "1.3.6.1.2.1.156.1.1.6.1", false, false, false, true);
                            this.tcpEStatsAppSndUna = new TcpEStatsAppSndUnaEnt(mib, this);
                            this.tcpEStatsAppSndNxt = new TcpEStatsAppSndNxtEnt(mib, this);
                            this.tcpEStatsAppSndMax = new TcpEStatsAppSndMaxEnt(mib, this);
                            this.tcpEStatsAppThruOctetsAcked = new TcpEStatsAppThruOctetsAckedEnt(mib, this);
                            this.tcpEStatsAppHCThruOctetsAcked = new TcpEStatsAppHCThruOctetsAckedEnt(mib, this);
                            this.tcpEStatsAppRcvNxt = new TcpEStatsAppRcvNxtEnt(mib, this);
                            this.tcpEStatsAppThruOctetsReceived = new TcpEStatsAppThruOctetsReceivedEnt(mib, this);
                            this.tcpEStatsAppHCThruOctetsReceived = new TcpEStatsAppHCThruOctetsReceivedEnt(mib, this);
                            this.tcpEStatsAppCurAppWQueue = new TcpEStatsAppCurAppWQueueEnt(mib, this);
                            this.tcpEStatsAppMaxAppWQueue = new TcpEStatsAppMaxAppWQueueEnt(mib, this);
                            this.tcpEStatsAppCurAppRQueue = new TcpEStatsAppCurAppRQueueEnt(mib, this);
                            this.tcpEStatsAppMaxAppRQueue = new TcpEStatsAppMaxAppRQueueEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.tcpEStatsAppSndUna,
                                this.tcpEStatsAppSndNxt,
                                this.tcpEStatsAppSndMax,
                                this.tcpEStatsAppThruOctetsAcked,
                                this.tcpEStatsAppHCThruOctetsAcked,
                                this.tcpEStatsAppRcvNxt,
                                this.tcpEStatsAppThruOctetsReceived,
                                this.tcpEStatsAppHCThruOctetsReceived,
                                this.tcpEStatsAppCurAppWQueue,
                                this.tcpEStatsAppMaxAppWQueue,
                                this.tcpEStatsAppCurAppRQueue,
                                this.tcpEStatsAppMaxAppRQueue
                            };
                        }
                        public static final class TcpEStatsAppSndUnaEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsAppSndUnaEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsAppSndUna", "1.3.6.1.2.1.156.1.1.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsAppSndNxtEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsAppSndNxtEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsAppSndNxt", "1.3.6.1.2.1.156.1.1.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsAppSndMaxEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsAppSndMaxEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsAppSndMax", "1.3.6.1.2.1.156.1.1.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsAppThruOctetsAckedEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsAppThruOctetsAckedEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsAppThruOctetsAcked", "1.3.6.1.2.1.156.1.1.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsAppHCThruOctetsAckedEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsAppHCThruOctetsAckedEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsAppHCThruOctetsAcked", "1.3.6.1.2.1.156.1.1.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsAppRcvNxtEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsAppRcvNxtEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsAppRcvNxt", "1.3.6.1.2.1.156.1.1.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsAppThruOctetsReceivedEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsAppThruOctetsReceivedEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsAppThruOctetsReceived", "1.3.6.1.2.1.156.1.1.6.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsAppHCThruOctetsReceivedEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsAppHCThruOctetsReceivedEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsAppHCThruOctetsReceived", "1.3.6.1.2.1.156.1.1.6.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsAppCurAppWQueueEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsAppCurAppWQueueEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsAppCurAppWQueue", "1.3.6.1.2.1.156.1.1.6.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsAppMaxAppWQueueEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsAppMaxAppWQueueEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsAppMaxAppWQueue", "1.3.6.1.2.1.156.1.1.6.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsAppCurAppRQueueEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsAppCurAppRQueueEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsAppCurAppRQueue", "1.3.6.1.2.1.156.1.1.6.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsAppMaxAppRQueueEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsAppMaxAppRQueueEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsAppMaxAppRQueue", "1.3.6.1.2.1.156.1.1.6.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class TcpEStatsTuneTableEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    public final TcpEStatsTuneEntryEnt tcpEStatsTuneEntry;

                    private TcpEStatsTuneTableEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsTuneTable", "1.3.6.1.2.1.156.1.1.7", false, true, false, false);
                        this.tcpEStatsTuneEntry = new TcpEStatsTuneEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tcpEStatsTuneEntry
                        };
                    }
                    public static final class TcpEStatsTuneEntryEnt extends MIBEntry<TCPESTATSMIBDef>
                    {
                        public final TcpEStatsTuneLimCwndEnt tcpEStatsTuneLimCwnd;

                        public final TcpEStatsTuneLimSsthreshEnt tcpEStatsTuneLimSsthresh;

                        public final TcpEStatsTuneLimRwinEnt tcpEStatsTuneLimRwin;

                        public final TcpEStatsTuneLimMSSEnt tcpEStatsTuneLimMSS;

                        private TcpEStatsTuneEntryEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                        {
                            super(mib, parent, "tcpEStatsTuneEntry", "1.3.6.1.2.1.156.1.1.7.1", false, false, false, true);
                            this.tcpEStatsTuneLimCwnd = new TcpEStatsTuneLimCwndEnt(mib, this);
                            this.tcpEStatsTuneLimSsthresh = new TcpEStatsTuneLimSsthreshEnt(mib, this);
                            this.tcpEStatsTuneLimRwin = new TcpEStatsTuneLimRwinEnt(mib, this);
                            this.tcpEStatsTuneLimMSS = new TcpEStatsTuneLimMSSEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.tcpEStatsTuneLimCwnd,
                                this.tcpEStatsTuneLimSsthresh,
                                this.tcpEStatsTuneLimRwin,
                                this.tcpEStatsTuneLimMSS
                            };
                        }
                        public static final class TcpEStatsTuneLimCwndEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsTuneLimCwndEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsTuneLimCwnd", "1.3.6.1.2.1.156.1.1.7.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsTuneLimSsthreshEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsTuneLimSsthreshEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsTuneLimSsthresh", "1.3.6.1.2.1.156.1.1.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsTuneLimRwinEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsTuneLimRwinEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsTuneLimRwin", "1.3.6.1.2.1.156.1.1.7.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TcpEStatsTuneLimMSSEnt extends MIBEntry<TCPESTATSMIBDef>
                        {
                            private TcpEStatsTuneLimMSSEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                            {
                                super(mib, parent, "tcpEStatsTuneLimMSS", "1.3.6.1.2.1.156.1.1.7.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class TcpEStatsControlEnt extends MIBEntry<TCPESTATSMIBDef>
            {
                /** ================================================================The tcpEStatsControl Group
The scalar objects in this group are used to control theactivation and deactivation of the TCP Extended Statisticstables and notifications in this module.*/
                public final TcpEStatsControlPathEnt tcpEStatsControlPath;

                public final TcpEStatsControlStackEnt tcpEStatsControlStack;

                public final TcpEStatsControlAppEnt tcpEStatsControlApp;

                public final TcpEStatsControlTuneEnt tcpEStatsControlTune;

                public final TcpEStatsControlNotifyEnt tcpEStatsControlNotify;

                public final TcpEStatsConnTableLatencyEnt tcpEStatsConnTableLatency;

                private TcpEStatsControlEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                {
                    super(mib, parent, "tcpEStatsControl", "1.3.6.1.2.1.156.1.2", false, false, false, false);
                    this.tcpEStatsControlPath = new TcpEStatsControlPathEnt(mib, this);
                    this.tcpEStatsControlStack = new TcpEStatsControlStackEnt(mib, this);
                    this.tcpEStatsControlApp = new TcpEStatsControlAppEnt(mib, this);
                    this.tcpEStatsControlTune = new TcpEStatsControlTuneEnt(mib, this);
                    this.tcpEStatsControlNotify = new TcpEStatsControlNotifyEnt(mib, this);
                    this.tcpEStatsConnTableLatency = new TcpEStatsConnTableLatencyEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tcpEStatsControlPath,
                        this.tcpEStatsControlStack,
                        this.tcpEStatsControlApp,
                        this.tcpEStatsControlTune,
                        this.tcpEStatsControlNotify,
                        this.tcpEStatsConnTableLatency
                    };
                }
                public static final class TcpEStatsControlPathEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsControlPathEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsControlPath", "1.3.6.1.2.1.156.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsControlStackEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsControlStackEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsControlStack", "1.3.6.1.2.1.156.1.2.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsControlAppEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsControlAppEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsControlApp", "1.3.6.1.2.1.156.1.2.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsControlTuneEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsControlTuneEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsControlTune", "1.3.6.1.2.1.156.1.2.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsControlNotifyEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsControlNotifyEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsControlNotify", "1.3.6.1.2.1.156.1.2.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsConnTableLatencyEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsConnTableLatencyEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsConnTableLatency", "1.3.6.1.2.1.156.1.2.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class TcpEStatsScalarEnt extends MIBEntry<TCPESTATSMIBDef>
            {
                /** TCP Extended statistics scalars*/
                public final TcpEStatsListenerTableLastChangeEnt tcpEStatsListenerTableLastChange;

                private TcpEStatsScalarEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                {
                    super(mib, parent, "tcpEStatsScalar", "1.3.6.1.2.1.156.1.3", false, false, false, false);
                    this.tcpEStatsListenerTableLastChange = new TcpEStatsListenerTableLastChangeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tcpEStatsListenerTableLastChange
                    };
                }
                public static final class TcpEStatsListenerTableLastChangeEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsListenerTableLastChangeEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsListenerTableLastChange", "1.3.6.1.2.1.156.1.3.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class TcpEStatsConformanceEnt extends MIBEntry<TCPESTATSMIBDef>
        {
            /** ================================================================Conformance Definitions*/
            public final TcpEStatsCompliancesEnt tcpEStatsCompliances;

            public final TcpEStatsGroupsEnt tcpEStatsGroups;

            private TcpEStatsConformanceEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
            {
                super(mib, parent, "tcpEStatsConformance", "1.3.6.1.2.1.156.2", false, false, false, false);
                this.tcpEStatsCompliances = new TcpEStatsCompliancesEnt(mib, this);
                this.tcpEStatsGroups = new TcpEStatsGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tcpEStatsCompliances,
                    this.tcpEStatsGroups
                };
            }
            public static final class TcpEStatsCompliancesEnt extends MIBEntry<TCPESTATSMIBDef>
            {
                /** Compliance Statements*/
                public final TcpEStatsComplianceEnt tcpEStatsCompliance;

                private TcpEStatsCompliancesEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                {
                    super(mib, parent, "tcpEStatsCompliances", "1.3.6.1.2.1.156.2.1", false, false, false, false);
                    this.tcpEStatsCompliance = new TcpEStatsComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tcpEStatsCompliance
                    };
                }
                public static final class TcpEStatsComplianceEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsComplianceEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsCompliance", "1.3.6.1.2.1.156.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class TcpEStatsGroupsEnt extends MIBEntry<TCPESTATSMIBDef>
            {
                /** ================================================================Units of Conformance*/
                public final TcpEStatsListenerGroupEnt tcpEStatsListenerGroup;

                public final TcpEStatsListenerHCGroupEnt tcpEStatsListenerHCGroup;

                public final TcpEStatsConnectIdGroupEnt tcpEStatsConnectIdGroup;

                public final TcpEStatsPerfGroupEnt tcpEStatsPerfGroup;

                public final TcpEStatsPerfOptionalGroupEnt tcpEStatsPerfOptionalGroup;

                public final TcpEStatsPerfHCGroupEnt tcpEStatsPerfHCGroup;

                public final TcpEStatsPathGroupEnt tcpEStatsPathGroup;

                public final TcpEStatsPathOptionalGroupEnt tcpEStatsPathOptionalGroup;

                public final TcpEStatsPathHCGroupEnt tcpEStatsPathHCGroup;

                public final TcpEStatsStackGroupEnt tcpEStatsStackGroup;

                public final TcpEStatsStackOptionalGroupEnt tcpEStatsStackOptionalGroup;

                public final TcpEStatsAppGroupEnt tcpEStatsAppGroup;

                public final TcpEStatsAppHCGroupEnt tcpEStatsAppHCGroup;

                public final TcpEStatsAppOptionalGroupEnt tcpEStatsAppOptionalGroup;

                public final TcpEStatsTuneOptionalGroupEnt tcpEStatsTuneOptionalGroup;

                public final TcpEStatsNotificationsGroupEnt tcpEStatsNotificationsGroup;

                public final TcpEStatsNotificationsCtlGroupEnt tcpEStatsNotificationsCtlGroup;

                private TcpEStatsGroupsEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                {
                    super(mib, parent, "tcpEStatsGroups", "1.3.6.1.2.1.156.2.2", false, false, false, false);
                    this.tcpEStatsListenerGroup = new TcpEStatsListenerGroupEnt(mib, this);
                    this.tcpEStatsListenerHCGroup = new TcpEStatsListenerHCGroupEnt(mib, this);
                    this.tcpEStatsConnectIdGroup = new TcpEStatsConnectIdGroupEnt(mib, this);
                    this.tcpEStatsPerfGroup = new TcpEStatsPerfGroupEnt(mib, this);
                    this.tcpEStatsPerfOptionalGroup = new TcpEStatsPerfOptionalGroupEnt(mib, this);
                    this.tcpEStatsPerfHCGroup = new TcpEStatsPerfHCGroupEnt(mib, this);
                    this.tcpEStatsPathGroup = new TcpEStatsPathGroupEnt(mib, this);
                    this.tcpEStatsPathOptionalGroup = new TcpEStatsPathOptionalGroupEnt(mib, this);
                    this.tcpEStatsPathHCGroup = new TcpEStatsPathHCGroupEnt(mib, this);
                    this.tcpEStatsStackGroup = new TcpEStatsStackGroupEnt(mib, this);
                    this.tcpEStatsStackOptionalGroup = new TcpEStatsStackOptionalGroupEnt(mib, this);
                    this.tcpEStatsAppGroup = new TcpEStatsAppGroupEnt(mib, this);
                    this.tcpEStatsAppHCGroup = new TcpEStatsAppHCGroupEnt(mib, this);
                    this.tcpEStatsAppOptionalGroup = new TcpEStatsAppOptionalGroupEnt(mib, this);
                    this.tcpEStatsTuneOptionalGroup = new TcpEStatsTuneOptionalGroupEnt(mib, this);
                    this.tcpEStatsNotificationsGroup = new TcpEStatsNotificationsGroupEnt(mib, this);
                    this.tcpEStatsNotificationsCtlGroup = new TcpEStatsNotificationsCtlGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tcpEStatsListenerGroup,
                        this.tcpEStatsListenerHCGroup,
                        this.tcpEStatsConnectIdGroup,
                        this.tcpEStatsPerfGroup,
                        this.tcpEStatsPerfOptionalGroup,
                        this.tcpEStatsPerfHCGroup,
                        this.tcpEStatsPathGroup,
                        this.tcpEStatsPathOptionalGroup,
                        this.tcpEStatsPathHCGroup,
                        this.tcpEStatsStackGroup,
                        this.tcpEStatsStackOptionalGroup,
                        this.tcpEStatsAppGroup,
                        this.tcpEStatsAppHCGroup,
                        this.tcpEStatsAppOptionalGroup,
                        this.tcpEStatsTuneOptionalGroup,
                        this.tcpEStatsNotificationsGroup,
                        this.tcpEStatsNotificationsCtlGroup
                    };
                }
                public static final class TcpEStatsListenerGroupEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsListenerGroupEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsListenerGroup", "1.3.6.1.2.1.156.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsListenerHCGroupEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsListenerHCGroupEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsListenerHCGroup", "1.3.6.1.2.1.156.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsConnectIdGroupEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsConnectIdGroupEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsConnectIdGroup", "1.3.6.1.2.1.156.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsPerfGroupEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsPerfGroupEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsPerfGroup", "1.3.6.1.2.1.156.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsPerfOptionalGroupEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsPerfOptionalGroupEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsPerfOptionalGroup", "1.3.6.1.2.1.156.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsPerfHCGroupEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsPerfHCGroupEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsPerfHCGroup", "1.3.6.1.2.1.156.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsPathGroupEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsPathGroupEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsPathGroup", "1.3.6.1.2.1.156.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsPathOptionalGroupEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsPathOptionalGroupEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsPathOptionalGroup", "1.3.6.1.2.1.156.2.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsPathHCGroupEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsPathHCGroupEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsPathHCGroup", "1.3.6.1.2.1.156.2.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsStackGroupEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsStackGroupEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsStackGroup", "1.3.6.1.2.1.156.2.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsStackOptionalGroupEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsStackOptionalGroupEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsStackOptionalGroup", "1.3.6.1.2.1.156.2.2.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsAppGroupEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsAppGroupEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsAppGroup", "1.3.6.1.2.1.156.2.2.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsAppHCGroupEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsAppHCGroupEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsAppHCGroup", "1.3.6.1.2.1.156.2.2.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsAppOptionalGroupEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsAppOptionalGroupEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsAppOptionalGroup", "1.3.6.1.2.1.156.2.2.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsTuneOptionalGroupEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsTuneOptionalGroupEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsTuneOptionalGroup", "1.3.6.1.2.1.156.2.2.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsNotificationsGroupEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsNotificationsGroupEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsNotificationsGroup", "1.3.6.1.2.1.156.2.2.16", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpEStatsNotificationsCtlGroupEnt extends MIBEntry<TCPESTATSMIBDef>
                {
                    private TcpEStatsNotificationsCtlGroupEnt(TCPESTATSMIBDef mib, MIBEntry<TCPESTATSMIBDef> parent)
                    {
                        super(mib, parent, "tcpEStatsNotificationsCtlGroup", "1.3.6.1.2.1.156.2.2.17", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
