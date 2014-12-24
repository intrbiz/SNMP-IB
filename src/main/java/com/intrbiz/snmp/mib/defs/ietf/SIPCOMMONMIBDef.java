package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**RFC 2578
RFC 2579
RFC 2580
RFC 3411
RFC 4780
RFC 2788*/
public final class SIPCOMMONMIBDef extends MIB
{
    public static final SIPCOMMONMIBDef SIPCOMMONMIB = new SIPCOMMONMIBDef();

    /** RFC 4001*/
    public final SipCommonMIBEnt sipCommonMIB;

    private SIPCOMMONMIBDef()
    {
        super("SIP-COMMON-MIB");
        this.sipCommonMIB = new SipCommonMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.sipCommonMIB
        };
    }

    public static final class SipCommonMIBEnt extends MIBEntry<SIPCOMMONMIBDef>
    {
        /** Top-Level Components of this MIB.*/
        public final SipCommonMIBNotificationsEnt sipCommonMIBNotifications;

        public final SipCommonMIBObjectsEnt sipCommonMIBObjects;

        public final SipCommonMIBConformanceEnt sipCommonMIBConformance;

        private SipCommonMIBEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
        {
            super(mib, parent, "sipCommonMIB", "1.3.6.1.2.1.149", false, false, false, false);
            this.sipCommonMIBNotifications = new SipCommonMIBNotificationsEnt(mib, this);
            this.sipCommonMIBObjects = new SipCommonMIBObjectsEnt(mib, this);
            this.sipCommonMIBConformance = new SipCommonMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.sipCommonMIBNotifications,
                this.sipCommonMIBObjects,
                this.sipCommonMIBConformance
            };
        }
        public static final class SipCommonMIBNotificationsEnt extends MIBEntry<SIPCOMMONMIBDef>
        {
            /** Notifications*/
            public final SipCommonStatusCodeNotifEnt sipCommonStatusCodeNotif;

            public final SipCommonStatusCodeThreshExceededInNotifEnt sipCommonStatusCodeThreshExceededInNotif;

            public final SipCommonStatusCodeThreshExceededOutNotifEnt sipCommonStatusCodeThreshExceededOutNotif;

            public final SipCommonServiceColdStartEnt sipCommonServiceColdStart;

            public final SipCommonServiceWarmStartEnt sipCommonServiceWarmStart;

            public final SipCommonServiceStatusChangedEnt sipCommonServiceStatusChanged;

            private SipCommonMIBNotificationsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
            {
                super(mib, parent, "sipCommonMIBNotifications", "1.3.6.1.2.1.149.0", false, false, false, false);
                this.sipCommonStatusCodeNotif = new SipCommonStatusCodeNotifEnt(mib, this);
                this.sipCommonStatusCodeThreshExceededInNotif = new SipCommonStatusCodeThreshExceededInNotifEnt(mib, this);
                this.sipCommonStatusCodeThreshExceededOutNotif = new SipCommonStatusCodeThreshExceededOutNotifEnt(mib, this);
                this.sipCommonServiceColdStart = new SipCommonServiceColdStartEnt(mib, this);
                this.sipCommonServiceWarmStart = new SipCommonServiceWarmStartEnt(mib, this);
                this.sipCommonServiceStatusChanged = new SipCommonServiceStatusChangedEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sipCommonStatusCodeNotif,
                    this.sipCommonStatusCodeThreshExceededInNotif,
                    this.sipCommonStatusCodeThreshExceededOutNotif,
                    this.sipCommonServiceColdStart,
                    this.sipCommonServiceWarmStart,
                    this.sipCommonServiceStatusChanged
                };
            }
            public static final class SipCommonStatusCodeNotifEnt extends MIBEntry<SIPCOMMONMIBDef>
            {
                private SipCommonStatusCodeNotifEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                {
                    super(mib, parent, "sipCommonStatusCodeNotif", "1.3.6.1.2.1.149.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SipCommonStatusCodeThreshExceededInNotifEnt extends MIBEntry<SIPCOMMONMIBDef>
            {
                private SipCommonStatusCodeThreshExceededInNotifEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                {
                    super(mib, parent, "sipCommonStatusCodeThreshExceededInNotif", "1.3.6.1.2.1.149.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SipCommonStatusCodeThreshExceededOutNotifEnt extends MIBEntry<SIPCOMMONMIBDef>
            {
                private SipCommonStatusCodeThreshExceededOutNotifEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                {
                    super(mib, parent, "sipCommonStatusCodeThreshExceededOutNotif", "1.3.6.1.2.1.149.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SipCommonServiceColdStartEnt extends MIBEntry<SIPCOMMONMIBDef>
            {
                private SipCommonServiceColdStartEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                {
                    super(mib, parent, "sipCommonServiceColdStart", "1.3.6.1.2.1.149.0.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SipCommonServiceWarmStartEnt extends MIBEntry<SIPCOMMONMIBDef>
            {
                private SipCommonServiceWarmStartEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                {
                    super(mib, parent, "sipCommonServiceWarmStart", "1.3.6.1.2.1.149.0.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SipCommonServiceStatusChangedEnt extends MIBEntry<SIPCOMMONMIBDef>
            {
                private SipCommonServiceStatusChangedEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                {
                    super(mib, parent, "sipCommonServiceStatusChanged", "1.3.6.1.2.1.149.0.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class SipCommonMIBObjectsEnt extends MIBEntry<SIPCOMMONMIBDef>
        {
            /** This MIB contains objects that are common to all SIP entities.
Common basic configuration*/
            public final SipCommonCfgBaseEnt sipCommonCfgBase;

            /** Protocol timer configuration*/
            public final SipCommonCfgTimerEnt sipCommonCfgTimer;

            /** SIP message summary statistics*/
            public final SipCommonSummaryStatsEnt sipCommonSummaryStats;

            /** Per method statistics*/
            public final SipCommonMethodStatsEnt sipCommonMethodStats;

            /** Per Status code or status code class statistics*/
            public final SipCommonStatusCodeEnt sipCommonStatusCode;

            /** Transaction statistics*/
            public final SipCommonStatsTransEnt sipCommonStatsTrans;

            /** Method retry statistics*/
            public final SipCommonStatsRetryEnt sipCommonStatsRetry;

            /** Other statistics*/
            public final SipCommonOtherStatsEnt sipCommonOtherStats;

            /** Accessible-for-notify objects*/
            public final SipCommonNotifObjectsEnt sipCommonNotifObjects;

            private SipCommonMIBObjectsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
            {
                super(mib, parent, "sipCommonMIBObjects", "1.3.6.1.2.1.149.1", false, false, false, false);
                this.sipCommonCfgBase = new SipCommonCfgBaseEnt(mib, this);
                this.sipCommonCfgTimer = new SipCommonCfgTimerEnt(mib, this);
                this.sipCommonSummaryStats = new SipCommonSummaryStatsEnt(mib, this);
                this.sipCommonMethodStats = new SipCommonMethodStatsEnt(mib, this);
                this.sipCommonStatusCode = new SipCommonStatusCodeEnt(mib, this);
                this.sipCommonStatsTrans = new SipCommonStatsTransEnt(mib, this);
                this.sipCommonStatsRetry = new SipCommonStatsRetryEnt(mib, this);
                this.sipCommonOtherStats = new SipCommonOtherStatsEnt(mib, this);
                this.sipCommonNotifObjects = new SipCommonNotifObjectsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sipCommonCfgBase,
                    this.sipCommonCfgTimer,
                    this.sipCommonSummaryStats,
                    this.sipCommonMethodStats,
                    this.sipCommonStatusCode,
                    this.sipCommonStatsTrans,
                    this.sipCommonStatsRetry,
                    this.sipCommonOtherStats,
                    this.sipCommonNotifObjects
                };
            }
            public static final class SipCommonCfgBaseEnt extends MIBEntry<SIPCOMMONMIBDef>
            {
                /** Common Configuration Objects*/
                public final SipCommonCfgTableEnt sipCommonCfgTable;

                /** Support for multiple ports*/
                public final SipCommonPortTableEnt sipCommonPortTable;

                /** Support for SIP option tags (SIP extensions).SIP extensions MAY be supported or required by SIP entities.*/
                public final SipCommonOptionTagTableEnt sipCommonOptionTagTable;

                /** Supported SIP Methods*/
                public final SipCommonMethodSupportedTableEnt sipCommonMethodSupportedTable;

                private SipCommonCfgBaseEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                {
                    super(mib, parent, "sipCommonCfgBase", "1.3.6.1.2.1.149.1.1", false, false, false, false);
                    this.sipCommonCfgTable = new SipCommonCfgTableEnt(mib, this);
                    this.sipCommonPortTable = new SipCommonPortTableEnt(mib, this);
                    this.sipCommonOptionTagTable = new SipCommonOptionTagTableEnt(mib, this);
                    this.sipCommonMethodSupportedTable = new SipCommonMethodSupportedTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipCommonCfgTable,
                        this.sipCommonPortTable,
                        this.sipCommonOptionTagTable,
                        this.sipCommonMethodSupportedTable
                    };
                }
                public static final class SipCommonCfgTableEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    public final SipCommonCfgEntryEnt sipCommonCfgEntry;

                    private SipCommonCfgTableEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonCfgTable", "1.3.6.1.2.1.149.1.1.1", false, true, false, false);
                        this.sipCommonCfgEntry = new SipCommonCfgEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipCommonCfgEntry
                        };
                    }
                    public static final class SipCommonCfgEntryEnt extends MIBEntry<SIPCOMMONMIBDef>
                    {
                        public final SipCommonCfgProtocolVersionEnt sipCommonCfgProtocolVersion;

                        public final SipCommonCfgServiceOperStatusEnt sipCommonCfgServiceOperStatus;

                        public final SipCommonCfgServiceStartTimeEnt sipCommonCfgServiceStartTime;

                        public final SipCommonCfgServiceLastChangeEnt sipCommonCfgServiceLastChange;

                        public final SipCommonCfgOrganizationEnt sipCommonCfgOrganization;

                        public final SipCommonCfgMaxTransactionsEnt sipCommonCfgMaxTransactions;

                        public final SipCommonCfgServiceNotifEnableEnt sipCommonCfgServiceNotifEnable;

                        public final SipCommonCfgEntityTypeEnt sipCommonCfgEntityType;

                        private SipCommonCfgEntryEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                        {
                            super(mib, parent, "sipCommonCfgEntry", "1.3.6.1.2.1.149.1.1.1.1", false, false, false, true);
                            this.sipCommonCfgProtocolVersion = new SipCommonCfgProtocolVersionEnt(mib, this);
                            this.sipCommonCfgServiceOperStatus = new SipCommonCfgServiceOperStatusEnt(mib, this);
                            this.sipCommonCfgServiceStartTime = new SipCommonCfgServiceStartTimeEnt(mib, this);
                            this.sipCommonCfgServiceLastChange = new SipCommonCfgServiceLastChangeEnt(mib, this);
                            this.sipCommonCfgOrganization = new SipCommonCfgOrganizationEnt(mib, this);
                            this.sipCommonCfgMaxTransactions = new SipCommonCfgMaxTransactionsEnt(mib, this);
                            this.sipCommonCfgServiceNotifEnable = new SipCommonCfgServiceNotifEnableEnt(mib, this);
                            this.sipCommonCfgEntityType = new SipCommonCfgEntityTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipCommonCfgProtocolVersion,
                                this.sipCommonCfgServiceOperStatus,
                                this.sipCommonCfgServiceStartTime,
                                this.sipCommonCfgServiceLastChange,
                                this.sipCommonCfgOrganization,
                                this.sipCommonCfgMaxTransactions,
                                this.sipCommonCfgServiceNotifEnable,
                                this.sipCommonCfgEntityType
                            };
                        }
                        public static final class SipCommonCfgProtocolVersionEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgProtocolVersionEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgProtocolVersion", "1.3.6.1.2.1.149.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgServiceOperStatusEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgServiceOperStatusEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgServiceOperStatus", "1.3.6.1.2.1.149.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgServiceStartTimeEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgServiceStartTimeEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgServiceStartTime", "1.3.6.1.2.1.149.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgServiceLastChangeEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgServiceLastChangeEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgServiceLastChange", "1.3.6.1.2.1.149.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgOrganizationEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgOrganizationEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgOrganization", "1.3.6.1.2.1.149.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgMaxTransactionsEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgMaxTransactionsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgMaxTransactions", "1.3.6.1.2.1.149.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgServiceNotifEnableEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgServiceNotifEnableEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgServiceNotifEnable", "1.3.6.1.2.1.149.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgEntityTypeEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgEntityTypeEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgEntityType", "1.3.6.1.2.1.149.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SipCommonPortTableEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    public final SipCommonPortEntryEnt sipCommonPortEntry;

                    private SipCommonPortTableEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonPortTable", "1.3.6.1.2.1.149.1.1.2", false, true, false, false);
                        this.sipCommonPortEntry = new SipCommonPortEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipCommonPortEntry
                        };
                    }
                    public static final class SipCommonPortEntryEnt extends MIBEntry<SIPCOMMONMIBDef>
                    {
                        public final SipCommonPortEnt sipCommonPort;

                        public final SipCommonPortTransportRcvEnt sipCommonPortTransportRcv;

                        private SipCommonPortEntryEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                        {
                            super(mib, parent, "sipCommonPortEntry", "1.3.6.1.2.1.149.1.1.2.1", false, false, false, true);
                            this.sipCommonPort = new SipCommonPortEnt(mib, this);
                            this.sipCommonPortTransportRcv = new SipCommonPortTransportRcvEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipCommonPort,
                                this.sipCommonPortTransportRcv
                            };
                        }
                        public static final class SipCommonPortEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonPortEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonPort", "1.3.6.1.2.1.149.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonPortTransportRcvEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonPortTransportRcvEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonPortTransportRcv", "1.3.6.1.2.1.149.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SipCommonOptionTagTableEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    public final SipCommonOptionTagEntryEnt sipCommonOptionTagEntry;

                    private SipCommonOptionTagTableEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonOptionTagTable", "1.3.6.1.2.1.149.1.1.3", false, true, false, false);
                        this.sipCommonOptionTagEntry = new SipCommonOptionTagEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipCommonOptionTagEntry
                        };
                    }
                    public static final class SipCommonOptionTagEntryEnt extends MIBEntry<SIPCOMMONMIBDef>
                    {
                        public final SipCommonOptionTagIndexEnt sipCommonOptionTagIndex;

                        public final SipCommonOptionTagEnt sipCommonOptionTag;

                        public final SipCommonOptionTagHeaderFieldEnt sipCommonOptionTagHeaderField;

                        private SipCommonOptionTagEntryEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                        {
                            super(mib, parent, "sipCommonOptionTagEntry", "1.3.6.1.2.1.149.1.1.3.1", false, false, false, true);
                            this.sipCommonOptionTagIndex = new SipCommonOptionTagIndexEnt(mib, this);
                            this.sipCommonOptionTag = new SipCommonOptionTagEnt(mib, this);
                            this.sipCommonOptionTagHeaderField = new SipCommonOptionTagHeaderFieldEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipCommonOptionTagIndex,
                                this.sipCommonOptionTag,
                                this.sipCommonOptionTagHeaderField
                            };
                        }
                        public static final class SipCommonOptionTagIndexEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonOptionTagIndexEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonOptionTagIndex", "1.3.6.1.2.1.149.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonOptionTagEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonOptionTagEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonOptionTag", "1.3.6.1.2.1.149.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonOptionTagHeaderFieldEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonOptionTagHeaderFieldEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonOptionTagHeaderField", "1.3.6.1.2.1.149.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SipCommonMethodSupportedTableEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    public final SipCommonMethodSupportedEntryEnt sipCommonMethodSupportedEntry;

                    private SipCommonMethodSupportedTableEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonMethodSupportedTable", "1.3.6.1.2.1.149.1.1.4", false, true, false, false);
                        this.sipCommonMethodSupportedEntry = new SipCommonMethodSupportedEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipCommonMethodSupportedEntry
                        };
                    }
                    public static final class SipCommonMethodSupportedEntryEnt extends MIBEntry<SIPCOMMONMIBDef>
                    {
                        public final SipCommonMethodSupportedIndexEnt sipCommonMethodSupportedIndex;

                        public final SipCommonMethodSupportedNameEnt sipCommonMethodSupportedName;

                        private SipCommonMethodSupportedEntryEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                        {
                            super(mib, parent, "sipCommonMethodSupportedEntry", "1.3.6.1.2.1.149.1.1.4.1", false, false, false, true);
                            this.sipCommonMethodSupportedIndex = new SipCommonMethodSupportedIndexEnt(mib, this);
                            this.sipCommonMethodSupportedName = new SipCommonMethodSupportedNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipCommonMethodSupportedIndex,
                                this.sipCommonMethodSupportedName
                            };
                        }
                        public static final class SipCommonMethodSupportedIndexEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonMethodSupportedIndexEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonMethodSupportedIndex", "1.3.6.1.2.1.149.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonMethodSupportedNameEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonMethodSupportedNameEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonMethodSupportedName", "1.3.6.1.2.1.149.1.1.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SipCommonCfgTimerEnt extends MIBEntry<SIPCOMMONMIBDef>
            {
                /** SIP Timer Configuration*/
                public final SipCommonCfgTimerTableEnt sipCommonCfgTimerTable;

                private SipCommonCfgTimerEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                {
                    super(mib, parent, "sipCommonCfgTimer", "1.3.6.1.2.1.149.1.2", false, false, false, false);
                    this.sipCommonCfgTimerTable = new SipCommonCfgTimerTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipCommonCfgTimerTable
                    };
                }
                public static final class SipCommonCfgTimerTableEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    public final SipCommonCfgTimerEntryEnt sipCommonCfgTimerEntry;

                    private SipCommonCfgTimerTableEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonCfgTimerTable", "1.3.6.1.2.1.149.1.2.1", false, true, false, false);
                        this.sipCommonCfgTimerEntry = new SipCommonCfgTimerEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipCommonCfgTimerEntry
                        };
                    }
                    public static final class SipCommonCfgTimerEntryEnt extends MIBEntry<SIPCOMMONMIBDef>
                    {
                        public final SipCommonCfgTimerAEnt sipCommonCfgTimerA;

                        public final SipCommonCfgTimerBEnt sipCommonCfgTimerB;

                        public final SipCommonCfgTimerCEnt sipCommonCfgTimerC;

                        public final SipCommonCfgTimerDEnt sipCommonCfgTimerD;

                        public final SipCommonCfgTimerEEnt sipCommonCfgTimerE;

                        public final SipCommonCfgTimerFEnt sipCommonCfgTimerF;

                        public final SipCommonCfgTimerGEnt sipCommonCfgTimerG;

                        public final SipCommonCfgTimerHEnt sipCommonCfgTimerH;

                        public final SipCommonCfgTimerIEnt sipCommonCfgTimerI;

                        public final SipCommonCfgTimerJEnt sipCommonCfgTimerJ;

                        public final SipCommonCfgTimerKEnt sipCommonCfgTimerK;

                        public final SipCommonCfgTimerT1Ent sipCommonCfgTimerT1;

                        public final SipCommonCfgTimerT2Ent sipCommonCfgTimerT2;

                        public final SipCommonCfgTimerT4Ent sipCommonCfgTimerT4;

                        private SipCommonCfgTimerEntryEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                        {
                            super(mib, parent, "sipCommonCfgTimerEntry", "1.3.6.1.2.1.149.1.2.1.1", false, false, false, true);
                            this.sipCommonCfgTimerA = new SipCommonCfgTimerAEnt(mib, this);
                            this.sipCommonCfgTimerB = new SipCommonCfgTimerBEnt(mib, this);
                            this.sipCommonCfgTimerC = new SipCommonCfgTimerCEnt(mib, this);
                            this.sipCommonCfgTimerD = new SipCommonCfgTimerDEnt(mib, this);
                            this.sipCommonCfgTimerE = new SipCommonCfgTimerEEnt(mib, this);
                            this.sipCommonCfgTimerF = new SipCommonCfgTimerFEnt(mib, this);
                            this.sipCommonCfgTimerG = new SipCommonCfgTimerGEnt(mib, this);
                            this.sipCommonCfgTimerH = new SipCommonCfgTimerHEnt(mib, this);
                            this.sipCommonCfgTimerI = new SipCommonCfgTimerIEnt(mib, this);
                            this.sipCommonCfgTimerJ = new SipCommonCfgTimerJEnt(mib, this);
                            this.sipCommonCfgTimerK = new SipCommonCfgTimerKEnt(mib, this);
                            this.sipCommonCfgTimerT1 = new SipCommonCfgTimerT1Ent(mib, this);
                            this.sipCommonCfgTimerT2 = new SipCommonCfgTimerT2Ent(mib, this);
                            this.sipCommonCfgTimerT4 = new SipCommonCfgTimerT4Ent(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipCommonCfgTimerA,
                                this.sipCommonCfgTimerB,
                                this.sipCommonCfgTimerC,
                                this.sipCommonCfgTimerD,
                                this.sipCommonCfgTimerE,
                                this.sipCommonCfgTimerF,
                                this.sipCommonCfgTimerG,
                                this.sipCommonCfgTimerH,
                                this.sipCommonCfgTimerI,
                                this.sipCommonCfgTimerJ,
                                this.sipCommonCfgTimerK,
                                this.sipCommonCfgTimerT1,
                                this.sipCommonCfgTimerT2,
                                this.sipCommonCfgTimerT4
                            };
                        }
                        public static final class SipCommonCfgTimerAEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgTimerAEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgTimerA", "1.3.6.1.2.1.149.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgTimerBEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgTimerBEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgTimerB", "1.3.6.1.2.1.149.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgTimerCEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgTimerCEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgTimerC", "1.3.6.1.2.1.149.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgTimerDEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgTimerDEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgTimerD", "1.3.6.1.2.1.149.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgTimerEEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgTimerEEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgTimerE", "1.3.6.1.2.1.149.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgTimerFEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgTimerFEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgTimerF", "1.3.6.1.2.1.149.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgTimerGEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgTimerGEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgTimerG", "1.3.6.1.2.1.149.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgTimerHEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgTimerHEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgTimerH", "1.3.6.1.2.1.149.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgTimerIEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgTimerIEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgTimerI", "1.3.6.1.2.1.149.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgTimerJEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgTimerJEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgTimerJ", "1.3.6.1.2.1.149.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgTimerKEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgTimerKEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgTimerK", "1.3.6.1.2.1.149.1.2.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgTimerT1Ent extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgTimerT1Ent(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgTimerT1", "1.3.6.1.2.1.149.1.2.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgTimerT2Ent extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgTimerT2Ent(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgTimerT2", "1.3.6.1.2.1.149.1.2.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonCfgTimerT4Ent extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonCfgTimerT4Ent(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonCfgTimerT4", "1.3.6.1.2.1.149.1.2.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SipCommonSummaryStatsEnt extends MIBEntry<SIPCOMMONMIBDef>
            {
                /** Common Statistics Objects
Summary Statistics*/
                public final SipCommonSummaryStatsTableEnt sipCommonSummaryStatsTable;

                private SipCommonSummaryStatsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                {
                    super(mib, parent, "sipCommonSummaryStats", "1.3.6.1.2.1.149.1.3", false, false, false, false);
                    this.sipCommonSummaryStatsTable = new SipCommonSummaryStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipCommonSummaryStatsTable
                    };
                }
                public static final class SipCommonSummaryStatsTableEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    public final SipCommonSummaryStatsEntryEnt sipCommonSummaryStatsEntry;

                    private SipCommonSummaryStatsTableEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonSummaryStatsTable", "1.3.6.1.2.1.149.1.3.1", false, true, false, false);
                        this.sipCommonSummaryStatsEntry = new SipCommonSummaryStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipCommonSummaryStatsEntry
                        };
                    }
                    public static final class SipCommonSummaryStatsEntryEnt extends MIBEntry<SIPCOMMONMIBDef>
                    {
                        public final SipCommonSummaryInRequestsEnt sipCommonSummaryInRequests;

                        public final SipCommonSummaryOutRequestsEnt sipCommonSummaryOutRequests;

                        public final SipCommonSummaryInResponsesEnt sipCommonSummaryInResponses;

                        public final SipCommonSummaryOutResponsesEnt sipCommonSummaryOutResponses;

                        public final SipCommonSummaryTotalTransactionsEnt sipCommonSummaryTotalTransactions;

                        public final SipCommonSummaryDisconTimeEnt sipCommonSummaryDisconTime;

                        private SipCommonSummaryStatsEntryEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                        {
                            super(mib, parent, "sipCommonSummaryStatsEntry", "1.3.6.1.2.1.149.1.3.1.1", false, false, false, true);
                            this.sipCommonSummaryInRequests = new SipCommonSummaryInRequestsEnt(mib, this);
                            this.sipCommonSummaryOutRequests = new SipCommonSummaryOutRequestsEnt(mib, this);
                            this.sipCommonSummaryInResponses = new SipCommonSummaryInResponsesEnt(mib, this);
                            this.sipCommonSummaryOutResponses = new SipCommonSummaryOutResponsesEnt(mib, this);
                            this.sipCommonSummaryTotalTransactions = new SipCommonSummaryTotalTransactionsEnt(mib, this);
                            this.sipCommonSummaryDisconTime = new SipCommonSummaryDisconTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipCommonSummaryInRequests,
                                this.sipCommonSummaryOutRequests,
                                this.sipCommonSummaryInResponses,
                                this.sipCommonSummaryOutResponses,
                                this.sipCommonSummaryTotalTransactions,
                                this.sipCommonSummaryDisconTime
                            };
                        }
                        public static final class SipCommonSummaryInRequestsEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonSummaryInRequestsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonSummaryInRequests", "1.3.6.1.2.1.149.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonSummaryOutRequestsEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonSummaryOutRequestsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonSummaryOutRequests", "1.3.6.1.2.1.149.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonSummaryInResponsesEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonSummaryInResponsesEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonSummaryInResponses", "1.3.6.1.2.1.149.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonSummaryOutResponsesEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonSummaryOutResponsesEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonSummaryOutResponses", "1.3.6.1.2.1.149.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonSummaryTotalTransactionsEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonSummaryTotalTransactionsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonSummaryTotalTransactions", "1.3.6.1.2.1.149.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonSummaryDisconTimeEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonSummaryDisconTimeEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonSummaryDisconTime", "1.3.6.1.2.1.149.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SipCommonMethodStatsEnt extends MIBEntry<SIPCOMMONMIBDef>
            {
                /** SIP Method StatisticsTotal counts for each SIP method.*/
                public final SipCommonMethodStatsTableEnt sipCommonMethodStatsTable;

                private SipCommonMethodStatsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                {
                    super(mib, parent, "sipCommonMethodStats", "1.3.6.1.2.1.149.1.4", false, false, false, false);
                    this.sipCommonMethodStatsTable = new SipCommonMethodStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipCommonMethodStatsTable
                    };
                }
                public static final class SipCommonMethodStatsTableEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    public final SipCommonMethodStatsEntryEnt sipCommonMethodStatsEntry;

                    private SipCommonMethodStatsTableEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonMethodStatsTable", "1.3.6.1.2.1.149.1.4.1", false, true, false, false);
                        this.sipCommonMethodStatsEntry = new SipCommonMethodStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipCommonMethodStatsEntry
                        };
                    }
                    public static final class SipCommonMethodStatsEntryEnt extends MIBEntry<SIPCOMMONMIBDef>
                    {
                        public final SipCommonMethodStatsNameEnt sipCommonMethodStatsName;

                        public final SipCommonMethodStatsOutboundsEnt sipCommonMethodStatsOutbounds;

                        public final SipCommonMethodStatsInboundsEnt sipCommonMethodStatsInbounds;

                        public final SipCommonMethodStatsDisconTimeEnt sipCommonMethodStatsDisconTime;

                        private SipCommonMethodStatsEntryEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                        {
                            super(mib, parent, "sipCommonMethodStatsEntry", "1.3.6.1.2.1.149.1.4.1.1", false, false, false, true);
                            this.sipCommonMethodStatsName = new SipCommonMethodStatsNameEnt(mib, this);
                            this.sipCommonMethodStatsOutbounds = new SipCommonMethodStatsOutboundsEnt(mib, this);
                            this.sipCommonMethodStatsInbounds = new SipCommonMethodStatsInboundsEnt(mib, this);
                            this.sipCommonMethodStatsDisconTime = new SipCommonMethodStatsDisconTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipCommonMethodStatsName,
                                this.sipCommonMethodStatsOutbounds,
                                this.sipCommonMethodStatsInbounds,
                                this.sipCommonMethodStatsDisconTime
                            };
                        }
                        public static final class SipCommonMethodStatsNameEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonMethodStatsNameEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonMethodStatsName", "1.3.6.1.2.1.149.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonMethodStatsOutboundsEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonMethodStatsOutboundsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonMethodStatsOutbounds", "1.3.6.1.2.1.149.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonMethodStatsInboundsEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonMethodStatsInboundsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonMethodStatsInbounds", "1.3.6.1.2.1.149.1.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonMethodStatsDisconTimeEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonMethodStatsDisconTimeEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonMethodStatsDisconTime", "1.3.6.1.2.1.149.1.4.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SipCommonStatusCodeEnt extends MIBEntry<SIPCOMMONMIBDef>
            {
                /** Support for specific status codes*/
                public final SipCommonStatusCodeTableEnt sipCommonStatusCodeTable;

                /** Support for specific status code notifications*/
                public final SipCommonStatusCodeNotifTableEnt sipCommonStatusCodeNotifTable;

                private SipCommonStatusCodeEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                {
                    super(mib, parent, "sipCommonStatusCode", "1.3.6.1.2.1.149.1.5", false, false, false, false);
                    this.sipCommonStatusCodeTable = new SipCommonStatusCodeTableEnt(mib, this);
                    this.sipCommonStatusCodeNotifTable = new SipCommonStatusCodeNotifTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipCommonStatusCodeTable,
                        this.sipCommonStatusCodeNotifTable
                    };
                }
                public static final class SipCommonStatusCodeTableEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    public final SipCommonStatusCodeEntryEnt sipCommonStatusCodeEntry;

                    private SipCommonStatusCodeTableEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonStatusCodeTable", "1.3.6.1.2.1.149.1.5.1", false, true, false, false);
                        this.sipCommonStatusCodeEntry = new SipCommonStatusCodeEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipCommonStatusCodeEntry
                        };
                    }
                    public static final class SipCommonStatusCodeEntryEnt extends MIBEntry<SIPCOMMONMIBDef>
                    {
                        public final SipCommonStatusCodeMethodEnt sipCommonStatusCodeMethod;

                        public final SipCommonStatusCodeValueEnt sipCommonStatusCodeValue;

                        public final SipCommonStatusCodeInsEnt sipCommonStatusCodeIns;

                        public final SipCommonStatusCodeOutsEnt sipCommonStatusCodeOuts;

                        public final SipCommonStatusCodeRowStatusEnt sipCommonStatusCodeRowStatus;

                        public final SipCommonStatusCodeDisconTimeEnt sipCommonStatusCodeDisconTime;

                        private SipCommonStatusCodeEntryEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                        {
                            super(mib, parent, "sipCommonStatusCodeEntry", "1.3.6.1.2.1.149.1.5.1.1", false, false, false, true);
                            this.sipCommonStatusCodeMethod = new SipCommonStatusCodeMethodEnt(mib, this);
                            this.sipCommonStatusCodeValue = new SipCommonStatusCodeValueEnt(mib, this);
                            this.sipCommonStatusCodeIns = new SipCommonStatusCodeInsEnt(mib, this);
                            this.sipCommonStatusCodeOuts = new SipCommonStatusCodeOutsEnt(mib, this);
                            this.sipCommonStatusCodeRowStatus = new SipCommonStatusCodeRowStatusEnt(mib, this);
                            this.sipCommonStatusCodeDisconTime = new SipCommonStatusCodeDisconTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipCommonStatusCodeMethod,
                                this.sipCommonStatusCodeValue,
                                this.sipCommonStatusCodeIns,
                                this.sipCommonStatusCodeOuts,
                                this.sipCommonStatusCodeRowStatus,
                                this.sipCommonStatusCodeDisconTime
                            };
                        }
                        public static final class SipCommonStatusCodeMethodEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonStatusCodeMethodEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonStatusCodeMethod", "1.3.6.1.2.1.149.1.5.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonStatusCodeValueEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonStatusCodeValueEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonStatusCodeValue", "1.3.6.1.2.1.149.1.5.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonStatusCodeInsEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonStatusCodeInsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonStatusCodeIns", "1.3.6.1.2.1.149.1.5.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonStatusCodeOutsEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonStatusCodeOutsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonStatusCodeOuts", "1.3.6.1.2.1.149.1.5.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonStatusCodeRowStatusEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonStatusCodeRowStatusEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonStatusCodeRowStatus", "1.3.6.1.2.1.149.1.5.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonStatusCodeDisconTimeEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonStatusCodeDisconTimeEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonStatusCodeDisconTime", "1.3.6.1.2.1.149.1.5.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SipCommonStatusCodeNotifTableEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    public final SipCommonStatusCodeNotifEntryEnt sipCommonStatusCodeNotifEntry;

                    private SipCommonStatusCodeNotifTableEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonStatusCodeNotifTable", "1.3.6.1.2.1.149.1.5.2", false, true, false, false);
                        this.sipCommonStatusCodeNotifEntry = new SipCommonStatusCodeNotifEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipCommonStatusCodeNotifEntry
                        };
                    }
                    public static final class SipCommonStatusCodeNotifEntryEnt extends MIBEntry<SIPCOMMONMIBDef>
                    {
                        public final SipCommonStatusCodeNotifSendEnt sipCommonStatusCodeNotifSend;

                        public final SipCommonStatusCodeNotifEmitModeEnt sipCommonStatusCodeNotifEmitMode;

                        public final SipCommonStatusCodeNotifThreshEnt sipCommonStatusCodeNotifThresh;

                        public final SipCommonStatusCodeNotifIntervalEnt sipCommonStatusCodeNotifInterval;

                        private SipCommonStatusCodeNotifEntryEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                        {
                            super(mib, parent, "sipCommonStatusCodeNotifEntry", "1.3.6.1.2.1.149.1.5.2.1", false, false, false, true);
                            this.sipCommonStatusCodeNotifSend = new SipCommonStatusCodeNotifSendEnt(mib, this);
                            this.sipCommonStatusCodeNotifEmitMode = new SipCommonStatusCodeNotifEmitModeEnt(mib, this);
                            this.sipCommonStatusCodeNotifThresh = new SipCommonStatusCodeNotifThreshEnt(mib, this);
                            this.sipCommonStatusCodeNotifInterval = new SipCommonStatusCodeNotifIntervalEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipCommonStatusCodeNotifSend,
                                this.sipCommonStatusCodeNotifEmitMode,
                                this.sipCommonStatusCodeNotifThresh,
                                this.sipCommonStatusCodeNotifInterval
                            };
                        }
                        public static final class SipCommonStatusCodeNotifSendEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonStatusCodeNotifSendEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonStatusCodeNotifSend", "1.3.6.1.2.1.149.1.5.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonStatusCodeNotifEmitModeEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonStatusCodeNotifEmitModeEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonStatusCodeNotifEmitMode", "1.3.6.1.2.1.149.1.5.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonStatusCodeNotifThreshEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonStatusCodeNotifThreshEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonStatusCodeNotifThresh", "1.3.6.1.2.1.149.1.5.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonStatusCodeNotifIntervalEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonStatusCodeNotifIntervalEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonStatusCodeNotifInterval", "1.3.6.1.2.1.149.1.5.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SipCommonStatsTransEnt extends MIBEntry<SIPCOMMONMIBDef>
            {
                /** Transaction Statistics*/
                public final SipCommonTransCurrentTableEnt sipCommonTransCurrentTable;

                private SipCommonStatsTransEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                {
                    super(mib, parent, "sipCommonStatsTrans", "1.3.6.1.2.1.149.1.6", false, false, false, false);
                    this.sipCommonTransCurrentTable = new SipCommonTransCurrentTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipCommonTransCurrentTable
                    };
                }
                public static final class SipCommonTransCurrentTableEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    public final SipCommonTransCurrentEntryEnt sipCommonTransCurrentEntry;

                    private SipCommonTransCurrentTableEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonTransCurrentTable", "1.3.6.1.2.1.149.1.6.1", false, true, false, false);
                        this.sipCommonTransCurrentEntry = new SipCommonTransCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipCommonTransCurrentEntry
                        };
                    }
                    public static final class SipCommonTransCurrentEntryEnt extends MIBEntry<SIPCOMMONMIBDef>
                    {
                        public final SipCommonTransCurrentactionsEnt sipCommonTransCurrentactions;

                        private SipCommonTransCurrentEntryEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                        {
                            super(mib, parent, "sipCommonTransCurrentEntry", "1.3.6.1.2.1.149.1.6.1.1", false, false, false, true);
                            this.sipCommonTransCurrentactions = new SipCommonTransCurrentactionsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipCommonTransCurrentactions
                            };
                        }
                        public static final class SipCommonTransCurrentactionsEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonTransCurrentactionsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonTransCurrentactions", "1.3.6.1.2.1.149.1.6.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SipCommonStatsRetryEnt extends MIBEntry<SIPCOMMONMIBDef>
            {
                /** SIP Retry StatisticsThis group contains various statistics objects aboutretransmission counts.*/
                public final SipCommonStatsRetryTableEnt sipCommonStatsRetryTable;

                private SipCommonStatsRetryEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                {
                    super(mib, parent, "sipCommonStatsRetry", "1.3.6.1.2.1.149.1.7", false, false, false, false);
                    this.sipCommonStatsRetryTable = new SipCommonStatsRetryTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipCommonStatsRetryTable
                    };
                }
                public static final class SipCommonStatsRetryTableEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    public final SipCommonStatsRetryEntryEnt sipCommonStatsRetryEntry;

                    private SipCommonStatsRetryTableEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonStatsRetryTable", "1.3.6.1.2.1.149.1.7.1", false, true, false, false);
                        this.sipCommonStatsRetryEntry = new SipCommonStatsRetryEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipCommonStatsRetryEntry
                        };
                    }
                    public static final class SipCommonStatsRetryEntryEnt extends MIBEntry<SIPCOMMONMIBDef>
                    {
                        public final SipCommonStatsRetryMethodEnt sipCommonStatsRetryMethod;

                        public final SipCommonStatsRetriesEnt sipCommonStatsRetries;

                        public final SipCommonStatsRetryFinalResponsesEnt sipCommonStatsRetryFinalResponses;

                        public final SipCommonStatsRetryNonFinalResponsesEnt sipCommonStatsRetryNonFinalResponses;

                        public final SipCommonStatsRetryDisconTimeEnt sipCommonStatsRetryDisconTime;

                        private SipCommonStatsRetryEntryEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                        {
                            super(mib, parent, "sipCommonStatsRetryEntry", "1.3.6.1.2.1.149.1.7.1.1", false, false, false, true);
                            this.sipCommonStatsRetryMethod = new SipCommonStatsRetryMethodEnt(mib, this);
                            this.sipCommonStatsRetries = new SipCommonStatsRetriesEnt(mib, this);
                            this.sipCommonStatsRetryFinalResponses = new SipCommonStatsRetryFinalResponsesEnt(mib, this);
                            this.sipCommonStatsRetryNonFinalResponses = new SipCommonStatsRetryNonFinalResponsesEnt(mib, this);
                            this.sipCommonStatsRetryDisconTime = new SipCommonStatsRetryDisconTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipCommonStatsRetryMethod,
                                this.sipCommonStatsRetries,
                                this.sipCommonStatsRetryFinalResponses,
                                this.sipCommonStatsRetryNonFinalResponses,
                                this.sipCommonStatsRetryDisconTime
                            };
                        }
                        public static final class SipCommonStatsRetryMethodEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonStatsRetryMethodEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonStatsRetryMethod", "1.3.6.1.2.1.149.1.7.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonStatsRetriesEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonStatsRetriesEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonStatsRetries", "1.3.6.1.2.1.149.1.7.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonStatsRetryFinalResponsesEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonStatsRetryFinalResponsesEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonStatsRetryFinalResponses", "1.3.6.1.2.1.149.1.7.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonStatsRetryNonFinalResponsesEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonStatsRetryNonFinalResponsesEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonStatsRetryNonFinalResponses", "1.3.6.1.2.1.149.1.7.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonStatsRetryDisconTimeEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonStatsRetryDisconTimeEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonStatsRetryDisconTime", "1.3.6.1.2.1.149.1.7.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SipCommonOtherStatsEnt extends MIBEntry<SIPCOMMONMIBDef>
            {
                /** Other Common Statistics*/
                public final SipCommonOtherStatsTableEnt sipCommonOtherStatsTable;

                private SipCommonOtherStatsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                {
                    super(mib, parent, "sipCommonOtherStats", "1.3.6.1.2.1.149.1.8", false, false, false, false);
                    this.sipCommonOtherStatsTable = new SipCommonOtherStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipCommonOtherStatsTable
                    };
                }
                public static final class SipCommonOtherStatsTableEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    public final SipCommonOtherStatsEntryEnt sipCommonOtherStatsEntry;

                    private SipCommonOtherStatsTableEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonOtherStatsTable", "1.3.6.1.2.1.149.1.8.1", false, true, false, false);
                        this.sipCommonOtherStatsEntry = new SipCommonOtherStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipCommonOtherStatsEntry
                        };
                    }
                    public static final class SipCommonOtherStatsEntryEnt extends MIBEntry<SIPCOMMONMIBDef>
                    {
                        public final SipCommonOtherStatsNumUnsupportedUrisEnt sipCommonOtherStatsNumUnsupportedUris;

                        public final SipCommonOtherStatsNumUnsupportedMethodsEnt sipCommonOtherStatsNumUnsupportedMethods;

                        public final SipCommonOtherStatsOtherwiseDiscardedMsgsEnt sipCommonOtherStatsOtherwiseDiscardedMsgs;

                        public final SipCommonOtherStatsDisconTimeEnt sipCommonOtherStatsDisconTime;

                        private SipCommonOtherStatsEntryEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                        {
                            super(mib, parent, "sipCommonOtherStatsEntry", "1.3.6.1.2.1.149.1.8.1.1", false, false, false, true);
                            this.sipCommonOtherStatsNumUnsupportedUris = new SipCommonOtherStatsNumUnsupportedUrisEnt(mib, this);
                            this.sipCommonOtherStatsNumUnsupportedMethods = new SipCommonOtherStatsNumUnsupportedMethodsEnt(mib, this);
                            this.sipCommonOtherStatsOtherwiseDiscardedMsgs = new SipCommonOtherStatsOtherwiseDiscardedMsgsEnt(mib, this);
                            this.sipCommonOtherStatsDisconTime = new SipCommonOtherStatsDisconTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipCommonOtherStatsNumUnsupportedUris,
                                this.sipCommonOtherStatsNumUnsupportedMethods,
                                this.sipCommonOtherStatsOtherwiseDiscardedMsgs,
                                this.sipCommonOtherStatsDisconTime
                            };
                        }
                        public static final class SipCommonOtherStatsNumUnsupportedUrisEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonOtherStatsNumUnsupportedUrisEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonOtherStatsNumUnsupportedUris", "1.3.6.1.2.1.149.1.8.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonOtherStatsNumUnsupportedMethodsEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonOtherStatsNumUnsupportedMethodsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonOtherStatsNumUnsupportedMethods", "1.3.6.1.2.1.149.1.8.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonOtherStatsOtherwiseDiscardedMsgsEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonOtherStatsOtherwiseDiscardedMsgsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonOtherStatsOtherwiseDiscardedMsgs", "1.3.6.1.2.1.149.1.8.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipCommonOtherStatsDisconTimeEnt extends MIBEntry<SIPCOMMONMIBDef>
                        {
                            private SipCommonOtherStatsDisconTimeEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                            {
                                super(mib, parent, "sipCommonOtherStatsDisconTime", "1.3.6.1.2.1.149.1.8.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SipCommonNotifObjectsEnt extends MIBEntry<SIPCOMMONMIBDef>
            {
                /** Notification related objects
Status code related notification objects.*/
                public final SipCommonStatusCodeNotifToEnt sipCommonStatusCodeNotifTo;

                public final SipCommonStatusCodeNotifFromEnt sipCommonStatusCodeNotifFrom;

                public final SipCommonStatusCodeNotifCallIdEnt sipCommonStatusCodeNotifCallId;

                public final SipCommonStatusCodeNotifCSeqEnt sipCommonStatusCodeNotifCSeq;

                /** General notification related objects.*/
                public final SipCommonNotifApplIndexEnt sipCommonNotifApplIndex;

                public final SipCommonNotifSequenceNumberEnt sipCommonNotifSequenceNumber;

                private SipCommonNotifObjectsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                {
                    super(mib, parent, "sipCommonNotifObjects", "1.3.6.1.2.1.149.1.9", false, false, false, false);
                    this.sipCommonStatusCodeNotifTo = new SipCommonStatusCodeNotifToEnt(mib, this);
                    this.sipCommonStatusCodeNotifFrom = new SipCommonStatusCodeNotifFromEnt(mib, this);
                    this.sipCommonStatusCodeNotifCallId = new SipCommonStatusCodeNotifCallIdEnt(mib, this);
                    this.sipCommonStatusCodeNotifCSeq = new SipCommonStatusCodeNotifCSeqEnt(mib, this);
                    this.sipCommonNotifApplIndex = new SipCommonNotifApplIndexEnt(mib, this);
                    this.sipCommonNotifSequenceNumber = new SipCommonNotifSequenceNumberEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipCommonStatusCodeNotifTo,
                        this.sipCommonStatusCodeNotifFrom,
                        this.sipCommonStatusCodeNotifCallId,
                        this.sipCommonStatusCodeNotifCSeq,
                        this.sipCommonNotifApplIndex,
                        this.sipCommonNotifSequenceNumber
                    };
                }
                public static final class SipCommonStatusCodeNotifToEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    private SipCommonStatusCodeNotifToEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonStatusCodeNotifTo", "1.3.6.1.2.1.149.1.9.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipCommonStatusCodeNotifFromEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    private SipCommonStatusCodeNotifFromEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonStatusCodeNotifFrom", "1.3.6.1.2.1.149.1.9.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipCommonStatusCodeNotifCallIdEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    private SipCommonStatusCodeNotifCallIdEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonStatusCodeNotifCallId", "1.3.6.1.2.1.149.1.9.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipCommonStatusCodeNotifCSeqEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    private SipCommonStatusCodeNotifCSeqEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonStatusCodeNotifCSeq", "1.3.6.1.2.1.149.1.9.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipCommonNotifApplIndexEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    private SipCommonNotifApplIndexEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonNotifApplIndex", "1.3.6.1.2.1.149.1.9.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipCommonNotifSequenceNumberEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    private SipCommonNotifSequenceNumberEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonNotifSequenceNumber", "1.3.6.1.2.1.149.1.9.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class SipCommonMIBConformanceEnt extends MIBEntry<SIPCOMMONMIBDef>
        {
            /** Conformance*/
            public final SipCommonMIBCompliancesEnt sipCommonMIBCompliances;

            public final SipCommonMIBGroupsEnt sipCommonMIBGroups;

            private SipCommonMIBConformanceEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
            {
                super(mib, parent, "sipCommonMIBConformance", "1.3.6.1.2.1.149.2", false, false, false, false);
                this.sipCommonMIBCompliances = new SipCommonMIBCompliancesEnt(mib, this);
                this.sipCommonMIBGroups = new SipCommonMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sipCommonMIBCompliances,
                    this.sipCommonMIBGroups
                };
            }
            public static final class SipCommonMIBCompliancesEnt extends MIBEntry<SIPCOMMONMIBDef>
            {
                /** Compliance Statements*/
                public final SipCommonComplianceEnt sipCommonCompliance;

                private SipCommonMIBCompliancesEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                {
                    super(mib, parent, "sipCommonMIBCompliances", "1.3.6.1.2.1.149.2.1", false, false, false, false);
                    this.sipCommonCompliance = new SipCommonComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipCommonCompliance
                    };
                }
                public static final class SipCommonComplianceEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    private SipCommonComplianceEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonCompliance", "1.3.6.1.2.1.149.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SipCommonMIBGroupsEnt extends MIBEntry<SIPCOMMONMIBDef>
            {
                /** Units of Conformance*/
                public final SipCommonConfigGroupEnt sipCommonConfigGroup;

                public final SipCommonInformationalGroupEnt sipCommonInformationalGroup;

                public final SipCommonConfigTimerGroupEnt sipCommonConfigTimerGroup;

                public final SipCommonStatsGroupEnt sipCommonStatsGroup;

                public final SipCommonStatsRetryGroupEnt sipCommonStatsRetryGroup;

                public final SipCommonNotifGroupEnt sipCommonNotifGroup;

                public final SipCommonStatusCodeNotifGroupEnt sipCommonStatusCodeNotifGroup;

                public final SipCommonNotifObjectsGroupEnt sipCommonNotifObjectsGroup;

                private SipCommonMIBGroupsEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                {
                    super(mib, parent, "sipCommonMIBGroups", "1.3.6.1.2.1.149.2.2", false, false, false, false);
                    this.sipCommonConfigGroup = new SipCommonConfigGroupEnt(mib, this);
                    this.sipCommonInformationalGroup = new SipCommonInformationalGroupEnt(mib, this);
                    this.sipCommonConfigTimerGroup = new SipCommonConfigTimerGroupEnt(mib, this);
                    this.sipCommonStatsGroup = new SipCommonStatsGroupEnt(mib, this);
                    this.sipCommonStatsRetryGroup = new SipCommonStatsRetryGroupEnt(mib, this);
                    this.sipCommonNotifGroup = new SipCommonNotifGroupEnt(mib, this);
                    this.sipCommonStatusCodeNotifGroup = new SipCommonStatusCodeNotifGroupEnt(mib, this);
                    this.sipCommonNotifObjectsGroup = new SipCommonNotifObjectsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipCommonConfigGroup,
                        this.sipCommonInformationalGroup,
                        this.sipCommonConfigTimerGroup,
                        this.sipCommonStatsGroup,
                        this.sipCommonStatsRetryGroup,
                        this.sipCommonNotifGroup,
                        this.sipCommonStatusCodeNotifGroup,
                        this.sipCommonNotifObjectsGroup
                    };
                }
                public static final class SipCommonConfigGroupEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    private SipCommonConfigGroupEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonConfigGroup", "1.3.6.1.2.1.149.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipCommonInformationalGroupEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    private SipCommonInformationalGroupEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonInformationalGroup", "1.3.6.1.2.1.149.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipCommonConfigTimerGroupEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    private SipCommonConfigTimerGroupEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonConfigTimerGroup", "1.3.6.1.2.1.149.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipCommonStatsGroupEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    private SipCommonStatsGroupEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonStatsGroup", "1.3.6.1.2.1.149.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipCommonStatsRetryGroupEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    private SipCommonStatsRetryGroupEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonStatsRetryGroup", "1.3.6.1.2.1.149.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipCommonNotifGroupEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    private SipCommonNotifGroupEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonNotifGroup", "1.3.6.1.2.1.149.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipCommonStatusCodeNotifGroupEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    private SipCommonStatusCodeNotifGroupEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonStatusCodeNotifGroup", "1.3.6.1.2.1.149.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipCommonNotifObjectsGroupEnt extends MIBEntry<SIPCOMMONMIBDef>
                {
                    private SipCommonNotifObjectsGroupEnt(SIPCOMMONMIBDef mib, MIBEntry<SIPCOMMONMIBDef> parent)
                    {
                        super(mib, parent, "sipCommonNotifObjectsGroup", "1.3.6.1.2.1.149.2.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
