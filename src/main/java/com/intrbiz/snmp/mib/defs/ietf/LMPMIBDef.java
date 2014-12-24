package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**RFC 2578
RFC 2580
RFC 2579
RFC 2863
RFC 4001
End of LMP-MIB*/
public final class LMPMIBDef extends MIB
{
    public static final LMPMIBDef LMPMIB = new LMPMIBDef();

    /** RFC 4220

14 August 2006*/
    public final LmpMIBEnt lmpMIB;

    private LMPMIBDef()
    {
        super("LMP-MIB");
        this.lmpMIB = new LmpMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.lmpMIB
        };
    }

    public static final class LmpMIBEnt extends MIBEntry<LMPMIBDef>
    {
        /** Top level components of this MIB
Notifications*/
        public final LmpNotificationsEnt lmpNotifications;

        /** Tables, Scalars*/
        public final LmpObjectsEnt lmpObjects;

        /** Conformance*/
        public final LmpConformanceEnt lmpConformance;

        private LmpMIBEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
        {
            super(mib, parent, "lmpMIB", "1.3.6.1.2.1.10.227", false, false, false, false);
            this.lmpNotifications = new LmpNotificationsEnt(mib, this);
            this.lmpObjects = new LmpObjectsEnt(mib, this);
            this.lmpConformance = new LmpConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.lmpNotifications,
                this.lmpObjects,
                this.lmpConformance
            };
        }
        public static final class LmpNotificationsEnt extends MIBEntry<LMPMIBDef>
        {
            /** Notifications
Link Property Mismatch Notifications*/
            public final LmpTeLinkPropertyMismatchEnt lmpTeLinkPropertyMismatch;

            public final LmpDataLinkPropertyMismatchEnt lmpDataLinkPropertyMismatch;

            /** Neighbor Notification*/
            public final LmpUnprotectedEnt lmpUnprotected;

            /** Control Channel Notifications*/
            public final LmpControlChannelUpEnt lmpControlChannelUp;

            public final LmpControlChannelDownEnt lmpControlChannelDown;

            /** TE Link Notification*/
            public final LmpTeLinkDegradedEnt lmpTeLinkDegraded;

            public final LmpTeLinkNotDegradedEnt lmpTeLinkNotDegraded;

            /** Data-bearing Link Notification*/
            public final LmpDataLinkVerificationFailureEnt lmpDataLinkVerificationFailure;

            private LmpNotificationsEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
            {
                super(mib, parent, "lmpNotifications", "1.3.6.1.2.1.10.227.0", false, false, false, false);
                this.lmpTeLinkPropertyMismatch = new LmpTeLinkPropertyMismatchEnt(mib, this);
                this.lmpDataLinkPropertyMismatch = new LmpDataLinkPropertyMismatchEnt(mib, this);
                this.lmpUnprotected = new LmpUnprotectedEnt(mib, this);
                this.lmpControlChannelUp = new LmpControlChannelUpEnt(mib, this);
                this.lmpControlChannelDown = new LmpControlChannelDownEnt(mib, this);
                this.lmpTeLinkDegraded = new LmpTeLinkDegradedEnt(mib, this);
                this.lmpTeLinkNotDegraded = new LmpTeLinkNotDegradedEnt(mib, this);
                this.lmpDataLinkVerificationFailure = new LmpDataLinkVerificationFailureEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.lmpTeLinkPropertyMismatch,
                    this.lmpDataLinkPropertyMismatch,
                    this.lmpUnprotected,
                    this.lmpControlChannelUp,
                    this.lmpControlChannelDown,
                    this.lmpTeLinkDegraded,
                    this.lmpTeLinkNotDegraded,
                    this.lmpDataLinkVerificationFailure
                };
            }
            public static final class LmpTeLinkPropertyMismatchEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpTeLinkPropertyMismatchEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpTeLinkPropertyMismatch", "1.3.6.1.2.1.10.227.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpDataLinkPropertyMismatchEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpDataLinkPropertyMismatchEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpDataLinkPropertyMismatch", "1.3.6.1.2.1.10.227.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpUnprotectedEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpUnprotectedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpUnprotected", "1.3.6.1.2.1.10.227.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpControlChannelUpEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpControlChannelUpEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpControlChannelUp", "1.3.6.1.2.1.10.227.0.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpControlChannelDownEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpControlChannelDownEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpControlChannelDown", "1.3.6.1.2.1.10.227.0.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpTeLinkDegradedEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpTeLinkDegradedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpTeLinkDegraded", "1.3.6.1.2.1.10.227.0.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpTeLinkNotDegradedEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpTeLinkNotDegradedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpTeLinkNotDegraded", "1.3.6.1.2.1.10.227.0.7", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpDataLinkVerificationFailureEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpDataLinkVerificationFailureEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpDataLinkVerificationFailure", "1.3.6.1.2.1.10.227.0.8", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class LmpObjectsEnt extends MIBEntry<LMPMIBDef>
        {
            public final LmpAdminStatusEnt lmpAdminStatus;

            public final LmpOperStatusEnt lmpOperStatus;

            /** LMP Neighbor Table*/
            public final LmpNbrTableEnt lmpNbrTable;

            /** End of lmpNbrTable*/
            public final LmpCcHelloIntervalDefaultEnt lmpCcHelloIntervalDefault;

            public final LmpCcHelloIntervalDefaultMinEnt lmpCcHelloIntervalDefaultMin;

            public final LmpCcHelloIntervalDefaultMaxEnt lmpCcHelloIntervalDefaultMax;

            public final LmpCcHelloDeadIntervalDefaultEnt lmpCcHelloDeadIntervalDefault;

            public final LmpCcHelloDeadIntervalDefaultMinEnt lmpCcHelloDeadIntervalDefaultMin;

            public final LmpCcHelloDeadIntervalDefaultMaxEnt lmpCcHelloDeadIntervalDefaultMax;

            /** LMP Control Channel Table*/
            public final LmpControlChannelTableEnt lmpControlChannelTable;

            /** End of lmpControlChannelTable

LMP Control Channel Performance Table*/
            public final LmpControlChannelPerfTableEnt lmpControlChannelPerfTable;

            /** End of lmpControlChannelPerfTable
LMP TE Link Table*/
            public final LmpTeLinkTableEnt lmpTeLinkTable;

            /** End of lmpTeLinkTable*/
            public final LmpGlobalLinkVerificationIntervalEnt lmpGlobalLinkVerificationInterval;

            /** LMP Link Verification Table*/
            public final LmpLinkVerificationTableEnt lmpLinkVerificationTable;

            /** End of lmpLinkVerificationTable

LMP TE Link Performance Table*/
            public final LmpTeLinkPerfTableEnt lmpTeLinkPerfTable;

            /** End of lmpTeLinkPerfTable

LMP Data Link Table*/
            public final LmpDataLinkTableEnt lmpDataLinkTable;

            /** End of lmpDataLinkTable

LMP Data Link Performance Table*/
            public final LmpDataLinkPerfTableEnt lmpDataLinkPerfTable;

            /** End of lmpDataLinkPerfTable

Notification Configuration*/
            public final LmpNotificationMaxRateEnt lmpNotificationMaxRate;

            public final LmpLinkPropertyNotificationsEnabledEnt lmpLinkPropertyNotificationsEnabled;

            public final LmpUnprotectedNotificationsEnabledEnt lmpUnprotectedNotificationsEnabled;

            public final LmpCcUpDownNotificationsEnabledEnt lmpCcUpDownNotificationsEnabled;

            public final LmpTeLinkNotificationsEnabledEnt lmpTeLinkNotificationsEnabled;

            public final LmpDataLinkNotificationsEnabledEnt lmpDataLinkNotificationsEnabled;

            private LmpObjectsEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
            {
                super(mib, parent, "lmpObjects", "1.3.6.1.2.1.10.227.1", false, false, false, false);
                this.lmpAdminStatus = new LmpAdminStatusEnt(mib, this);
                this.lmpOperStatus = new LmpOperStatusEnt(mib, this);
                this.lmpNbrTable = new LmpNbrTableEnt(mib, this);
                this.lmpCcHelloIntervalDefault = new LmpCcHelloIntervalDefaultEnt(mib, this);
                this.lmpCcHelloIntervalDefaultMin = new LmpCcHelloIntervalDefaultMinEnt(mib, this);
                this.lmpCcHelloIntervalDefaultMax = new LmpCcHelloIntervalDefaultMaxEnt(mib, this);
                this.lmpCcHelloDeadIntervalDefault = new LmpCcHelloDeadIntervalDefaultEnt(mib, this);
                this.lmpCcHelloDeadIntervalDefaultMin = new LmpCcHelloDeadIntervalDefaultMinEnt(mib, this);
                this.lmpCcHelloDeadIntervalDefaultMax = new LmpCcHelloDeadIntervalDefaultMaxEnt(mib, this);
                this.lmpControlChannelTable = new LmpControlChannelTableEnt(mib, this);
                this.lmpControlChannelPerfTable = new LmpControlChannelPerfTableEnt(mib, this);
                this.lmpTeLinkTable = new LmpTeLinkTableEnt(mib, this);
                this.lmpGlobalLinkVerificationInterval = new LmpGlobalLinkVerificationIntervalEnt(mib, this);
                this.lmpLinkVerificationTable = new LmpLinkVerificationTableEnt(mib, this);
                this.lmpTeLinkPerfTable = new LmpTeLinkPerfTableEnt(mib, this);
                this.lmpDataLinkTable = new LmpDataLinkTableEnt(mib, this);
                this.lmpDataLinkPerfTable = new LmpDataLinkPerfTableEnt(mib, this);
                this.lmpNotificationMaxRate = new LmpNotificationMaxRateEnt(mib, this);
                this.lmpLinkPropertyNotificationsEnabled = new LmpLinkPropertyNotificationsEnabledEnt(mib, this);
                this.lmpUnprotectedNotificationsEnabled = new LmpUnprotectedNotificationsEnabledEnt(mib, this);
                this.lmpCcUpDownNotificationsEnabled = new LmpCcUpDownNotificationsEnabledEnt(mib, this);
                this.lmpTeLinkNotificationsEnabled = new LmpTeLinkNotificationsEnabledEnt(mib, this);
                this.lmpDataLinkNotificationsEnabled = new LmpDataLinkNotificationsEnabledEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.lmpAdminStatus,
                    this.lmpOperStatus,
                    this.lmpNbrTable,
                    this.lmpCcHelloIntervalDefault,
                    this.lmpCcHelloIntervalDefaultMin,
                    this.lmpCcHelloIntervalDefaultMax,
                    this.lmpCcHelloDeadIntervalDefault,
                    this.lmpCcHelloDeadIntervalDefaultMin,
                    this.lmpCcHelloDeadIntervalDefaultMax,
                    this.lmpControlChannelTable,
                    this.lmpControlChannelPerfTable,
                    this.lmpTeLinkTable,
                    this.lmpGlobalLinkVerificationInterval,
                    this.lmpLinkVerificationTable,
                    this.lmpTeLinkPerfTable,
                    this.lmpDataLinkTable,
                    this.lmpDataLinkPerfTable,
                    this.lmpNotificationMaxRate,
                    this.lmpLinkPropertyNotificationsEnabled,
                    this.lmpUnprotectedNotificationsEnabled,
                    this.lmpCcUpDownNotificationsEnabled,
                    this.lmpTeLinkNotificationsEnabled,
                    this.lmpDataLinkNotificationsEnabled
                };
            }
            public static final class LmpAdminStatusEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpAdminStatusEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpAdminStatus", "1.3.6.1.2.1.10.227.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpOperStatusEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpOperStatusEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpOperStatus", "1.3.6.1.2.1.10.227.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpNbrTableEnt extends MIBEntry<LMPMIBDef>
            {
                public final LmpNbrEntryEnt lmpNbrEntry;

                private LmpNbrTableEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpNbrTable", "1.3.6.1.2.1.10.227.1.3", false, true, false, false);
                    this.lmpNbrEntry = new LmpNbrEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lmpNbrEntry
                    };
                }
                public static final class LmpNbrEntryEnt extends MIBEntry<LMPMIBDef>
                {
                    public final LmpNbrNodeIdEnt lmpNbrNodeId;

                    public final LmpNbrRetransmitIntervalEnt lmpNbrRetransmitInterval;

                    public final LmpNbrRetryLimitEnt lmpNbrRetryLimit;

                    public final LmpNbrRetransmitDeltaEnt lmpNbrRetransmitDelta;

                    public final LmpNbrAdminStatusEnt lmpNbrAdminStatus;

                    public final LmpNbrOperStatusEnt lmpNbrOperStatus;

                    public final LmpNbrRowStatusEnt lmpNbrRowStatus;

                    public final LmpNbrStorageTypeEnt lmpNbrStorageType;

                    private LmpNbrEntryEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpNbrEntry", "1.3.6.1.2.1.10.227.1.3.1", false, false, false, true);
                        this.lmpNbrNodeId = new LmpNbrNodeIdEnt(mib, this);
                        this.lmpNbrRetransmitInterval = new LmpNbrRetransmitIntervalEnt(mib, this);
                        this.lmpNbrRetryLimit = new LmpNbrRetryLimitEnt(mib, this);
                        this.lmpNbrRetransmitDelta = new LmpNbrRetransmitDeltaEnt(mib, this);
                        this.lmpNbrAdminStatus = new LmpNbrAdminStatusEnt(mib, this);
                        this.lmpNbrOperStatus = new LmpNbrOperStatusEnt(mib, this);
                        this.lmpNbrRowStatus = new LmpNbrRowStatusEnt(mib, this);
                        this.lmpNbrStorageType = new LmpNbrStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.lmpNbrNodeId,
                            this.lmpNbrRetransmitInterval,
                            this.lmpNbrRetryLimit,
                            this.lmpNbrRetransmitDelta,
                            this.lmpNbrAdminStatus,
                            this.lmpNbrOperStatus,
                            this.lmpNbrRowStatus,
                            this.lmpNbrStorageType
                        };
                    }
                    public static final class LmpNbrNodeIdEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpNbrNodeIdEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpNbrNodeId", "1.3.6.1.2.1.10.227.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpNbrRetransmitIntervalEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpNbrRetransmitIntervalEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpNbrRetransmitInterval", "1.3.6.1.2.1.10.227.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpNbrRetryLimitEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpNbrRetryLimitEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpNbrRetryLimit", "1.3.6.1.2.1.10.227.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpNbrRetransmitDeltaEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpNbrRetransmitDeltaEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpNbrRetransmitDelta", "1.3.6.1.2.1.10.227.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpNbrAdminStatusEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpNbrAdminStatusEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpNbrAdminStatus", "1.3.6.1.2.1.10.227.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpNbrOperStatusEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpNbrOperStatusEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpNbrOperStatus", "1.3.6.1.2.1.10.227.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpNbrRowStatusEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpNbrRowStatusEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpNbrRowStatus", "1.3.6.1.2.1.10.227.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpNbrStorageTypeEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpNbrStorageTypeEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpNbrStorageType", "1.3.6.1.2.1.10.227.1.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class LmpCcHelloIntervalDefaultEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpCcHelloIntervalDefaultEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpCcHelloIntervalDefault", "1.3.6.1.2.1.10.227.1.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpCcHelloIntervalDefaultMinEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpCcHelloIntervalDefaultMinEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpCcHelloIntervalDefaultMin", "1.3.6.1.2.1.10.227.1.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpCcHelloIntervalDefaultMaxEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpCcHelloIntervalDefaultMaxEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpCcHelloIntervalDefaultMax", "1.3.6.1.2.1.10.227.1.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpCcHelloDeadIntervalDefaultEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpCcHelloDeadIntervalDefaultEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpCcHelloDeadIntervalDefault", "1.3.6.1.2.1.10.227.1.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpCcHelloDeadIntervalDefaultMinEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpCcHelloDeadIntervalDefaultMinEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpCcHelloDeadIntervalDefaultMin", "1.3.6.1.2.1.10.227.1.8", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpCcHelloDeadIntervalDefaultMaxEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpCcHelloDeadIntervalDefaultMaxEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpCcHelloDeadIntervalDefaultMax", "1.3.6.1.2.1.10.227.1.9", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpControlChannelTableEnt extends MIBEntry<LMPMIBDef>
            {
                public final LmpControlChannelEntryEnt lmpControlChannelEntry;

                private LmpControlChannelTableEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpControlChannelTable", "1.3.6.1.2.1.10.227.1.10", false, true, false, false);
                    this.lmpControlChannelEntry = new LmpControlChannelEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lmpControlChannelEntry
                    };
                }
                public static final class LmpControlChannelEntryEnt extends MIBEntry<LMPMIBDef>
                {
                    public final LmpCcIdEnt lmpCcId;

                    public final LmpCcUnderlyingIfIndexEnt lmpCcUnderlyingIfIndex;

                    public final LmpCcIsIfEnt lmpCcIsIf;

                    public final LmpCcNbrNodeIdEnt lmpCcNbrNodeId;

                    public final LmpCcRemoteIdEnt lmpCcRemoteId;

                    public final LmpCcRemoteAddressTypeEnt lmpCcRemoteAddressType;

                    public final LmpCcRemoteIpAddrEnt lmpCcRemoteIpAddr;

                    public final LmpCcSetupRoleEnt lmpCcSetupRole;

                    public final LmpCcAuthenticationEnt lmpCcAuthentication;

                    public final LmpCcHelloIntervalEnt lmpCcHelloInterval;

                    public final LmpCcHelloIntervalMinEnt lmpCcHelloIntervalMin;

                    public final LmpCcHelloIntervalMaxEnt lmpCcHelloIntervalMax;

                    public final LmpCcHelloIntervalNegotiatedEnt lmpCcHelloIntervalNegotiated;

                    public final LmpCcHelloDeadIntervalEnt lmpCcHelloDeadInterval;

                    public final LmpCcHelloDeadIntervalMinEnt lmpCcHelloDeadIntervalMin;

                    public final LmpCcHelloDeadIntervalMaxEnt lmpCcHelloDeadIntervalMax;

                    public final LmpCcHelloDeadIntervalNegotiatedEnt lmpCcHelloDeadIntervalNegotiated;

                    public final LmpCcLastChangeEnt lmpCcLastChange;

                    public final LmpCcAdminStatusEnt lmpCcAdminStatus;

                    public final LmpCcOperStatusEnt lmpCcOperStatus;

                    public final LmpCcRowStatusEnt lmpCcRowStatus;

                    public final LmpCcStorageTypeEnt lmpCcStorageType;

                    private LmpControlChannelEntryEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpControlChannelEntry", "1.3.6.1.2.1.10.227.1.10.1", false, false, false, true);
                        this.lmpCcId = new LmpCcIdEnt(mib, this);
                        this.lmpCcUnderlyingIfIndex = new LmpCcUnderlyingIfIndexEnt(mib, this);
                        this.lmpCcIsIf = new LmpCcIsIfEnt(mib, this);
                        this.lmpCcNbrNodeId = new LmpCcNbrNodeIdEnt(mib, this);
                        this.lmpCcRemoteId = new LmpCcRemoteIdEnt(mib, this);
                        this.lmpCcRemoteAddressType = new LmpCcRemoteAddressTypeEnt(mib, this);
                        this.lmpCcRemoteIpAddr = new LmpCcRemoteIpAddrEnt(mib, this);
                        this.lmpCcSetupRole = new LmpCcSetupRoleEnt(mib, this);
                        this.lmpCcAuthentication = new LmpCcAuthenticationEnt(mib, this);
                        this.lmpCcHelloInterval = new LmpCcHelloIntervalEnt(mib, this);
                        this.lmpCcHelloIntervalMin = new LmpCcHelloIntervalMinEnt(mib, this);
                        this.lmpCcHelloIntervalMax = new LmpCcHelloIntervalMaxEnt(mib, this);
                        this.lmpCcHelloIntervalNegotiated = new LmpCcHelloIntervalNegotiatedEnt(mib, this);
                        this.lmpCcHelloDeadInterval = new LmpCcHelloDeadIntervalEnt(mib, this);
                        this.lmpCcHelloDeadIntervalMin = new LmpCcHelloDeadIntervalMinEnt(mib, this);
                        this.lmpCcHelloDeadIntervalMax = new LmpCcHelloDeadIntervalMaxEnt(mib, this);
                        this.lmpCcHelloDeadIntervalNegotiated = new LmpCcHelloDeadIntervalNegotiatedEnt(mib, this);
                        this.lmpCcLastChange = new LmpCcLastChangeEnt(mib, this);
                        this.lmpCcAdminStatus = new LmpCcAdminStatusEnt(mib, this);
                        this.lmpCcOperStatus = new LmpCcOperStatusEnt(mib, this);
                        this.lmpCcRowStatus = new LmpCcRowStatusEnt(mib, this);
                        this.lmpCcStorageType = new LmpCcStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.lmpCcId,
                            this.lmpCcUnderlyingIfIndex,
                            this.lmpCcIsIf,
                            this.lmpCcNbrNodeId,
                            this.lmpCcRemoteId,
                            this.lmpCcRemoteAddressType,
                            this.lmpCcRemoteIpAddr,
                            this.lmpCcSetupRole,
                            this.lmpCcAuthentication,
                            this.lmpCcHelloInterval,
                            this.lmpCcHelloIntervalMin,
                            this.lmpCcHelloIntervalMax,
                            this.lmpCcHelloIntervalNegotiated,
                            this.lmpCcHelloDeadInterval,
                            this.lmpCcHelloDeadIntervalMin,
                            this.lmpCcHelloDeadIntervalMax,
                            this.lmpCcHelloDeadIntervalNegotiated,
                            this.lmpCcLastChange,
                            this.lmpCcAdminStatus,
                            this.lmpCcOperStatus,
                            this.lmpCcRowStatus,
                            this.lmpCcStorageType
                        };
                    }
                    public static final class LmpCcIdEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcIdEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcId", "1.3.6.1.2.1.10.227.1.10.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcUnderlyingIfIndexEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcUnderlyingIfIndexEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcUnderlyingIfIndex", "1.3.6.1.2.1.10.227.1.10.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcIsIfEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcIsIfEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcIsIf", "1.3.6.1.2.1.10.227.1.10.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcNbrNodeIdEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcNbrNodeIdEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcNbrNodeId", "1.3.6.1.2.1.10.227.1.10.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcRemoteIdEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcRemoteIdEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcRemoteId", "1.3.6.1.2.1.10.227.1.10.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcRemoteAddressTypeEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcRemoteAddressTypeEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcRemoteAddressType", "1.3.6.1.2.1.10.227.1.10.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcRemoteIpAddrEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcRemoteIpAddrEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcRemoteIpAddr", "1.3.6.1.2.1.10.227.1.10.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcSetupRoleEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcSetupRoleEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcSetupRole", "1.3.6.1.2.1.10.227.1.10.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcAuthenticationEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcAuthenticationEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcAuthentication", "1.3.6.1.2.1.10.227.1.10.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcHelloIntervalEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcHelloIntervalEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcHelloInterval", "1.3.6.1.2.1.10.227.1.10.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcHelloIntervalMinEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcHelloIntervalMinEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcHelloIntervalMin", "1.3.6.1.2.1.10.227.1.10.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcHelloIntervalMaxEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcHelloIntervalMaxEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcHelloIntervalMax", "1.3.6.1.2.1.10.227.1.10.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcHelloIntervalNegotiatedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcHelloIntervalNegotiatedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcHelloIntervalNegotiated", "1.3.6.1.2.1.10.227.1.10.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcHelloDeadIntervalEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcHelloDeadIntervalEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcHelloDeadInterval", "1.3.6.1.2.1.10.227.1.10.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcHelloDeadIntervalMinEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcHelloDeadIntervalMinEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcHelloDeadIntervalMin", "1.3.6.1.2.1.10.227.1.10.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcHelloDeadIntervalMaxEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcHelloDeadIntervalMaxEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcHelloDeadIntervalMax", "1.3.6.1.2.1.10.227.1.10.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcHelloDeadIntervalNegotiatedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcHelloDeadIntervalNegotiatedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcHelloDeadIntervalNegotiated", "1.3.6.1.2.1.10.227.1.10.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcLastChangeEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcLastChangeEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcLastChange", "1.3.6.1.2.1.10.227.1.10.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcAdminStatusEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcAdminStatusEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcAdminStatus", "1.3.6.1.2.1.10.227.1.10.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcOperStatusEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcOperStatusEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcOperStatus", "1.3.6.1.2.1.10.227.1.10.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcRowStatusEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcRowStatusEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcRowStatus", "1.3.6.1.2.1.10.227.1.10.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcStorageTypeEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcStorageTypeEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcStorageType", "1.3.6.1.2.1.10.227.1.10.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class LmpControlChannelPerfTableEnt extends MIBEntry<LMPMIBDef>
            {
                public final LmpControlChannelPerfEntryEnt lmpControlChannelPerfEntry;

                private LmpControlChannelPerfTableEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpControlChannelPerfTable", "1.3.6.1.2.1.10.227.1.11", false, true, false, false);
                    this.lmpControlChannelPerfEntry = new LmpControlChannelPerfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lmpControlChannelPerfEntry
                    };
                }
                public static final class LmpControlChannelPerfEntryEnt extends MIBEntry<LMPMIBDef>
                {
                    public final LmpCcInOctetsEnt lmpCcInOctets;

                    public final LmpCcInDiscardsEnt lmpCcInDiscards;

                    public final LmpCcInErrorsEnt lmpCcInErrors;

                    public final LmpCcOutOctetsEnt lmpCcOutOctets;

                    public final LmpCcOutDiscardsEnt lmpCcOutDiscards;

                    public final LmpCcOutErrorsEnt lmpCcOutErrors;

                    public final LmpCcConfigReceivedEnt lmpCcConfigReceived;

                    public final LmpCcConfigSentEnt lmpCcConfigSent;

                    public final LmpCcConfigRetransmitEnt lmpCcConfigRetransmit;

                    public final LmpCcConfigAckReceivedEnt lmpCcConfigAckReceived;

                    public final LmpCcConfigAckSentEnt lmpCcConfigAckSent;

                    public final LmpCcConfigNackReceivedEnt lmpCcConfigNackReceived;

                    public final LmpCcConfigNackSentEnt lmpCcConfigNackSent;

                    public final LmpCcHelloReceivedEnt lmpCcHelloReceived;

                    public final LmpCcHelloSentEnt lmpCcHelloSent;

                    public final LmpCcBeginVerifyReceivedEnt lmpCcBeginVerifyReceived;

                    public final LmpCcBeginVerifySentEnt lmpCcBeginVerifySent;

                    public final LmpCcBeginVerifyRetransmitEnt lmpCcBeginVerifyRetransmit;

                    public final LmpCcBeginVerifyAckReceivedEnt lmpCcBeginVerifyAckReceived;

                    public final LmpCcBeginVerifyAckSentEnt lmpCcBeginVerifyAckSent;

                    public final LmpCcBeginVerifyNackReceivedEnt lmpCcBeginVerifyNackReceived;

                    public final LmpCcBeginVerifyNackSentEnt lmpCcBeginVerifyNackSent;

                    public final LmpCcEndVerifyReceivedEnt lmpCcEndVerifyReceived;

                    public final LmpCcEndVerifySentEnt lmpCcEndVerifySent;

                    public final LmpCcEndVerifyRetransmitEnt lmpCcEndVerifyRetransmit;

                    public final LmpCcEndVerifyAckReceivedEnt lmpCcEndVerifyAckReceived;

                    public final LmpCcEndVerifyAckSentEnt lmpCcEndVerifyAckSent;

                    public final LmpCcTestStatusSuccessReceivedEnt lmpCcTestStatusSuccessReceived;

                    public final LmpCcTestStatusSuccessSentEnt lmpCcTestStatusSuccessSent;

                    public final LmpCcTestStatusSuccessRetransmitEnt lmpCcTestStatusSuccessRetransmit;

                    public final LmpCcTestStatusFailureReceivedEnt lmpCcTestStatusFailureReceived;

                    public final LmpCcTestStatusFailureSentEnt lmpCcTestStatusFailureSent;

                    public final LmpCcTestStatusFailureRetransmitEnt lmpCcTestStatusFailureRetransmit;

                    public final LmpCcTestStatusAckReceivedEnt lmpCcTestStatusAckReceived;

                    public final LmpCcTestStatusAckSentEnt lmpCcTestStatusAckSent;

                    public final LmpCcLinkSummaryReceivedEnt lmpCcLinkSummaryReceived;

                    public final LmpCcLinkSummarySentEnt lmpCcLinkSummarySent;

                    public final LmpCcLinkSummaryRetransmitEnt lmpCcLinkSummaryRetransmit;

                    public final LmpCcLinkSummaryAckReceivedEnt lmpCcLinkSummaryAckReceived;

                    public final LmpCcLinkSummaryAckSentEnt lmpCcLinkSummaryAckSent;

                    public final LmpCcLinkSummaryNackReceivedEnt lmpCcLinkSummaryNackReceived;

                    public final LmpCcLinkSummaryNackSentEnt lmpCcLinkSummaryNackSent;

                    public final LmpCcChannelStatusReceivedEnt lmpCcChannelStatusReceived;

                    public final LmpCcChannelStatusSentEnt lmpCcChannelStatusSent;

                    public final LmpCcChannelStatusRetransmitEnt lmpCcChannelStatusRetransmit;

                    public final LmpCcChannelStatusAckReceivedEnt lmpCcChannelStatusAckReceived;

                    public final LmpCcChannelStatusAckSentEnt lmpCcChannelStatusAckSent;

                    public final LmpCcChannelStatusReqReceivedEnt lmpCcChannelStatusReqReceived;

                    public final LmpCcChannelStatusReqSentEnt lmpCcChannelStatusReqSent;

                    public final LmpCcChannelStatusReqRetransmitEnt lmpCcChannelStatusReqRetransmit;

                    public final LmpCcChannelStatusRspReceivedEnt lmpCcChannelStatusRspReceived;

                    public final LmpCcChannelStatusRspSentEnt lmpCcChannelStatusRspSent;

                    public final LmpCcCounterDiscontinuityTimeEnt lmpCcCounterDiscontinuityTime;

                    private LmpControlChannelPerfEntryEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpControlChannelPerfEntry", "1.3.6.1.2.1.10.227.1.11.1", false, false, false, true);
                        this.lmpCcInOctets = new LmpCcInOctetsEnt(mib, this);
                        this.lmpCcInDiscards = new LmpCcInDiscardsEnt(mib, this);
                        this.lmpCcInErrors = new LmpCcInErrorsEnt(mib, this);
                        this.lmpCcOutOctets = new LmpCcOutOctetsEnt(mib, this);
                        this.lmpCcOutDiscards = new LmpCcOutDiscardsEnt(mib, this);
                        this.lmpCcOutErrors = new LmpCcOutErrorsEnt(mib, this);
                        this.lmpCcConfigReceived = new LmpCcConfigReceivedEnt(mib, this);
                        this.lmpCcConfigSent = new LmpCcConfigSentEnt(mib, this);
                        this.lmpCcConfigRetransmit = new LmpCcConfigRetransmitEnt(mib, this);
                        this.lmpCcConfigAckReceived = new LmpCcConfigAckReceivedEnt(mib, this);
                        this.lmpCcConfigAckSent = new LmpCcConfigAckSentEnt(mib, this);
                        this.lmpCcConfigNackReceived = new LmpCcConfigNackReceivedEnt(mib, this);
                        this.lmpCcConfigNackSent = new LmpCcConfigNackSentEnt(mib, this);
                        this.lmpCcHelloReceived = new LmpCcHelloReceivedEnt(mib, this);
                        this.lmpCcHelloSent = new LmpCcHelloSentEnt(mib, this);
                        this.lmpCcBeginVerifyReceived = new LmpCcBeginVerifyReceivedEnt(mib, this);
                        this.lmpCcBeginVerifySent = new LmpCcBeginVerifySentEnt(mib, this);
                        this.lmpCcBeginVerifyRetransmit = new LmpCcBeginVerifyRetransmitEnt(mib, this);
                        this.lmpCcBeginVerifyAckReceived = new LmpCcBeginVerifyAckReceivedEnt(mib, this);
                        this.lmpCcBeginVerifyAckSent = new LmpCcBeginVerifyAckSentEnt(mib, this);
                        this.lmpCcBeginVerifyNackReceived = new LmpCcBeginVerifyNackReceivedEnt(mib, this);
                        this.lmpCcBeginVerifyNackSent = new LmpCcBeginVerifyNackSentEnt(mib, this);
                        this.lmpCcEndVerifyReceived = new LmpCcEndVerifyReceivedEnt(mib, this);
                        this.lmpCcEndVerifySent = new LmpCcEndVerifySentEnt(mib, this);
                        this.lmpCcEndVerifyRetransmit = new LmpCcEndVerifyRetransmitEnt(mib, this);
                        this.lmpCcEndVerifyAckReceived = new LmpCcEndVerifyAckReceivedEnt(mib, this);
                        this.lmpCcEndVerifyAckSent = new LmpCcEndVerifyAckSentEnt(mib, this);
                        this.lmpCcTestStatusSuccessReceived = new LmpCcTestStatusSuccessReceivedEnt(mib, this);
                        this.lmpCcTestStatusSuccessSent = new LmpCcTestStatusSuccessSentEnt(mib, this);
                        this.lmpCcTestStatusSuccessRetransmit = new LmpCcTestStatusSuccessRetransmitEnt(mib, this);
                        this.lmpCcTestStatusFailureReceived = new LmpCcTestStatusFailureReceivedEnt(mib, this);
                        this.lmpCcTestStatusFailureSent = new LmpCcTestStatusFailureSentEnt(mib, this);
                        this.lmpCcTestStatusFailureRetransmit = new LmpCcTestStatusFailureRetransmitEnt(mib, this);
                        this.lmpCcTestStatusAckReceived = new LmpCcTestStatusAckReceivedEnt(mib, this);
                        this.lmpCcTestStatusAckSent = new LmpCcTestStatusAckSentEnt(mib, this);
                        this.lmpCcLinkSummaryReceived = new LmpCcLinkSummaryReceivedEnt(mib, this);
                        this.lmpCcLinkSummarySent = new LmpCcLinkSummarySentEnt(mib, this);
                        this.lmpCcLinkSummaryRetransmit = new LmpCcLinkSummaryRetransmitEnt(mib, this);
                        this.lmpCcLinkSummaryAckReceived = new LmpCcLinkSummaryAckReceivedEnt(mib, this);
                        this.lmpCcLinkSummaryAckSent = new LmpCcLinkSummaryAckSentEnt(mib, this);
                        this.lmpCcLinkSummaryNackReceived = new LmpCcLinkSummaryNackReceivedEnt(mib, this);
                        this.lmpCcLinkSummaryNackSent = new LmpCcLinkSummaryNackSentEnt(mib, this);
                        this.lmpCcChannelStatusReceived = new LmpCcChannelStatusReceivedEnt(mib, this);
                        this.lmpCcChannelStatusSent = new LmpCcChannelStatusSentEnt(mib, this);
                        this.lmpCcChannelStatusRetransmit = new LmpCcChannelStatusRetransmitEnt(mib, this);
                        this.lmpCcChannelStatusAckReceived = new LmpCcChannelStatusAckReceivedEnt(mib, this);
                        this.lmpCcChannelStatusAckSent = new LmpCcChannelStatusAckSentEnt(mib, this);
                        this.lmpCcChannelStatusReqReceived = new LmpCcChannelStatusReqReceivedEnt(mib, this);
                        this.lmpCcChannelStatusReqSent = new LmpCcChannelStatusReqSentEnt(mib, this);
                        this.lmpCcChannelStatusReqRetransmit = new LmpCcChannelStatusReqRetransmitEnt(mib, this);
                        this.lmpCcChannelStatusRspReceived = new LmpCcChannelStatusRspReceivedEnt(mib, this);
                        this.lmpCcChannelStatusRspSent = new LmpCcChannelStatusRspSentEnt(mib, this);
                        this.lmpCcCounterDiscontinuityTime = new LmpCcCounterDiscontinuityTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.lmpCcInOctets,
                            this.lmpCcInDiscards,
                            this.lmpCcInErrors,
                            this.lmpCcOutOctets,
                            this.lmpCcOutDiscards,
                            this.lmpCcOutErrors,
                            this.lmpCcConfigReceived,
                            this.lmpCcConfigSent,
                            this.lmpCcConfigRetransmit,
                            this.lmpCcConfigAckReceived,
                            this.lmpCcConfigAckSent,
                            this.lmpCcConfigNackReceived,
                            this.lmpCcConfigNackSent,
                            this.lmpCcHelloReceived,
                            this.lmpCcHelloSent,
                            this.lmpCcBeginVerifyReceived,
                            this.lmpCcBeginVerifySent,
                            this.lmpCcBeginVerifyRetransmit,
                            this.lmpCcBeginVerifyAckReceived,
                            this.lmpCcBeginVerifyAckSent,
                            this.lmpCcBeginVerifyNackReceived,
                            this.lmpCcBeginVerifyNackSent,
                            this.lmpCcEndVerifyReceived,
                            this.lmpCcEndVerifySent,
                            this.lmpCcEndVerifyRetransmit,
                            this.lmpCcEndVerifyAckReceived,
                            this.lmpCcEndVerifyAckSent,
                            this.lmpCcTestStatusSuccessReceived,
                            this.lmpCcTestStatusSuccessSent,
                            this.lmpCcTestStatusSuccessRetransmit,
                            this.lmpCcTestStatusFailureReceived,
                            this.lmpCcTestStatusFailureSent,
                            this.lmpCcTestStatusFailureRetransmit,
                            this.lmpCcTestStatusAckReceived,
                            this.lmpCcTestStatusAckSent,
                            this.lmpCcLinkSummaryReceived,
                            this.lmpCcLinkSummarySent,
                            this.lmpCcLinkSummaryRetransmit,
                            this.lmpCcLinkSummaryAckReceived,
                            this.lmpCcLinkSummaryAckSent,
                            this.lmpCcLinkSummaryNackReceived,
                            this.lmpCcLinkSummaryNackSent,
                            this.lmpCcChannelStatusReceived,
                            this.lmpCcChannelStatusSent,
                            this.lmpCcChannelStatusRetransmit,
                            this.lmpCcChannelStatusAckReceived,
                            this.lmpCcChannelStatusAckSent,
                            this.lmpCcChannelStatusReqReceived,
                            this.lmpCcChannelStatusReqSent,
                            this.lmpCcChannelStatusReqRetransmit,
                            this.lmpCcChannelStatusRspReceived,
                            this.lmpCcChannelStatusRspSent,
                            this.lmpCcCounterDiscontinuityTime
                        };
                    }
                    public static final class LmpCcInOctetsEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcInOctetsEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcInOctets", "1.3.6.1.2.1.10.227.1.11.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcInDiscardsEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcInDiscardsEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcInDiscards", "1.3.6.1.2.1.10.227.1.11.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcInErrorsEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcInErrorsEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcInErrors", "1.3.6.1.2.1.10.227.1.11.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcOutOctetsEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcOutOctetsEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcOutOctets", "1.3.6.1.2.1.10.227.1.11.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcOutDiscardsEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcOutDiscardsEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcOutDiscards", "1.3.6.1.2.1.10.227.1.11.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcOutErrorsEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcOutErrorsEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcOutErrors", "1.3.6.1.2.1.10.227.1.11.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcConfigReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcConfigReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcConfigReceived", "1.3.6.1.2.1.10.227.1.11.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcConfigSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcConfigSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcConfigSent", "1.3.6.1.2.1.10.227.1.11.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcConfigRetransmitEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcConfigRetransmitEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcConfigRetransmit", "1.3.6.1.2.1.10.227.1.11.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcConfigAckReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcConfigAckReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcConfigAckReceived", "1.3.6.1.2.1.10.227.1.11.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcConfigAckSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcConfigAckSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcConfigAckSent", "1.3.6.1.2.1.10.227.1.11.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcConfigNackReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcConfigNackReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcConfigNackReceived", "1.3.6.1.2.1.10.227.1.11.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcConfigNackSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcConfigNackSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcConfigNackSent", "1.3.6.1.2.1.10.227.1.11.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcHelloReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcHelloReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcHelloReceived", "1.3.6.1.2.1.10.227.1.11.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcHelloSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcHelloSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcHelloSent", "1.3.6.1.2.1.10.227.1.11.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcBeginVerifyReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcBeginVerifyReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcBeginVerifyReceived", "1.3.6.1.2.1.10.227.1.11.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcBeginVerifySentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcBeginVerifySentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcBeginVerifySent", "1.3.6.1.2.1.10.227.1.11.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcBeginVerifyRetransmitEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcBeginVerifyRetransmitEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcBeginVerifyRetransmit", "1.3.6.1.2.1.10.227.1.11.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcBeginVerifyAckReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcBeginVerifyAckReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcBeginVerifyAckReceived", "1.3.6.1.2.1.10.227.1.11.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcBeginVerifyAckSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcBeginVerifyAckSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcBeginVerifyAckSent", "1.3.6.1.2.1.10.227.1.11.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcBeginVerifyNackReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcBeginVerifyNackReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcBeginVerifyNackReceived", "1.3.6.1.2.1.10.227.1.11.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcBeginVerifyNackSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcBeginVerifyNackSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcBeginVerifyNackSent", "1.3.6.1.2.1.10.227.1.11.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcEndVerifyReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcEndVerifyReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcEndVerifyReceived", "1.3.6.1.2.1.10.227.1.11.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcEndVerifySentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcEndVerifySentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcEndVerifySent", "1.3.6.1.2.1.10.227.1.11.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcEndVerifyRetransmitEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcEndVerifyRetransmitEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcEndVerifyRetransmit", "1.3.6.1.2.1.10.227.1.11.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcEndVerifyAckReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcEndVerifyAckReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcEndVerifyAckReceived", "1.3.6.1.2.1.10.227.1.11.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcEndVerifyAckSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcEndVerifyAckSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcEndVerifyAckSent", "1.3.6.1.2.1.10.227.1.11.1.27", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcTestStatusSuccessReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcTestStatusSuccessReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcTestStatusSuccessReceived", "1.3.6.1.2.1.10.227.1.11.1.28", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcTestStatusSuccessSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcTestStatusSuccessSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcTestStatusSuccessSent", "1.3.6.1.2.1.10.227.1.11.1.29", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcTestStatusSuccessRetransmitEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcTestStatusSuccessRetransmitEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcTestStatusSuccessRetransmit", "1.3.6.1.2.1.10.227.1.11.1.30", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcTestStatusFailureReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcTestStatusFailureReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcTestStatusFailureReceived", "1.3.6.1.2.1.10.227.1.11.1.31", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcTestStatusFailureSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcTestStatusFailureSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcTestStatusFailureSent", "1.3.6.1.2.1.10.227.1.11.1.32", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcTestStatusFailureRetransmitEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcTestStatusFailureRetransmitEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcTestStatusFailureRetransmit", "1.3.6.1.2.1.10.227.1.11.1.33", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcTestStatusAckReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcTestStatusAckReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcTestStatusAckReceived", "1.3.6.1.2.1.10.227.1.11.1.34", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcTestStatusAckSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcTestStatusAckSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcTestStatusAckSent", "1.3.6.1.2.1.10.227.1.11.1.35", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcLinkSummaryReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcLinkSummaryReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcLinkSummaryReceived", "1.3.6.1.2.1.10.227.1.11.1.36", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcLinkSummarySentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcLinkSummarySentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcLinkSummarySent", "1.3.6.1.2.1.10.227.1.11.1.37", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcLinkSummaryRetransmitEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcLinkSummaryRetransmitEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcLinkSummaryRetransmit", "1.3.6.1.2.1.10.227.1.11.1.38", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcLinkSummaryAckReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcLinkSummaryAckReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcLinkSummaryAckReceived", "1.3.6.1.2.1.10.227.1.11.1.39", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcLinkSummaryAckSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcLinkSummaryAckSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcLinkSummaryAckSent", "1.3.6.1.2.1.10.227.1.11.1.40", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcLinkSummaryNackReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcLinkSummaryNackReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcLinkSummaryNackReceived", "1.3.6.1.2.1.10.227.1.11.1.41", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcLinkSummaryNackSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcLinkSummaryNackSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcLinkSummaryNackSent", "1.3.6.1.2.1.10.227.1.11.1.42", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcChannelStatusReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcChannelStatusReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcChannelStatusReceived", "1.3.6.1.2.1.10.227.1.11.1.43", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcChannelStatusSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcChannelStatusSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcChannelStatusSent", "1.3.6.1.2.1.10.227.1.11.1.44", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcChannelStatusRetransmitEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcChannelStatusRetransmitEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcChannelStatusRetransmit", "1.3.6.1.2.1.10.227.1.11.1.45", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcChannelStatusAckReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcChannelStatusAckReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcChannelStatusAckReceived", "1.3.6.1.2.1.10.227.1.11.1.46", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcChannelStatusAckSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcChannelStatusAckSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcChannelStatusAckSent", "1.3.6.1.2.1.10.227.1.11.1.47", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcChannelStatusReqReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcChannelStatusReqReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcChannelStatusReqReceived", "1.3.6.1.2.1.10.227.1.11.1.48", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcChannelStatusReqSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcChannelStatusReqSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcChannelStatusReqSent", "1.3.6.1.2.1.10.227.1.11.1.49", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcChannelStatusReqRetransmitEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcChannelStatusReqRetransmitEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcChannelStatusReqRetransmit", "1.3.6.1.2.1.10.227.1.11.1.50", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcChannelStatusRspReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcChannelStatusRspReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcChannelStatusRspReceived", "1.3.6.1.2.1.10.227.1.11.1.51", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcChannelStatusRspSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcChannelStatusRspSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcChannelStatusRspSent", "1.3.6.1.2.1.10.227.1.11.1.52", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpCcCounterDiscontinuityTimeEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpCcCounterDiscontinuityTimeEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpCcCounterDiscontinuityTime", "1.3.6.1.2.1.10.227.1.11.1.53", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class LmpTeLinkTableEnt extends MIBEntry<LMPMIBDef>
            {
                public final LmpTeLinkEntryEnt lmpTeLinkEntry;

                private LmpTeLinkTableEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpTeLinkTable", "1.3.6.1.2.1.10.227.1.12", false, true, false, false);
                    this.lmpTeLinkEntry = new LmpTeLinkEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lmpTeLinkEntry
                    };
                }
                public static final class LmpTeLinkEntryEnt extends MIBEntry<LMPMIBDef>
                {
                    public final LmpTeLinkNbrRemoteNodeIdEnt lmpTeLinkNbrRemoteNodeId;

                    public final LmpTeLinkVerificationEnt lmpTeLinkVerification;

                    public final LmpTeLinkFaultManagementEnt lmpTeLinkFaultManagement;

                    public final LmpTeLinkDwdmEnt lmpTeLinkDwdm;

                    public final LmpTeLinkOperStatusEnt lmpTeLinkOperStatus;

                    public final LmpTeLinkRowStatusEnt lmpTeLinkRowStatus;

                    public final LmpTeLinkStorageTypeEnt lmpTeLinkStorageType;

                    private LmpTeLinkEntryEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpTeLinkEntry", "1.3.6.1.2.1.10.227.1.12.1", false, false, false, true);
                        this.lmpTeLinkNbrRemoteNodeId = new LmpTeLinkNbrRemoteNodeIdEnt(mib, this);
                        this.lmpTeLinkVerification = new LmpTeLinkVerificationEnt(mib, this);
                        this.lmpTeLinkFaultManagement = new LmpTeLinkFaultManagementEnt(mib, this);
                        this.lmpTeLinkDwdm = new LmpTeLinkDwdmEnt(mib, this);
                        this.lmpTeLinkOperStatus = new LmpTeLinkOperStatusEnt(mib, this);
                        this.lmpTeLinkRowStatus = new LmpTeLinkRowStatusEnt(mib, this);
                        this.lmpTeLinkStorageType = new LmpTeLinkStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.lmpTeLinkNbrRemoteNodeId,
                            this.lmpTeLinkVerification,
                            this.lmpTeLinkFaultManagement,
                            this.lmpTeLinkDwdm,
                            this.lmpTeLinkOperStatus,
                            this.lmpTeLinkRowStatus,
                            this.lmpTeLinkStorageType
                        };
                    }
                    public static final class LmpTeLinkNbrRemoteNodeIdEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeLinkNbrRemoteNodeIdEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeLinkNbrRemoteNodeId", "1.3.6.1.2.1.10.227.1.12.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeLinkVerificationEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeLinkVerificationEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeLinkVerification", "1.3.6.1.2.1.10.227.1.12.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeLinkFaultManagementEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeLinkFaultManagementEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeLinkFaultManagement", "1.3.6.1.2.1.10.227.1.12.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeLinkDwdmEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeLinkDwdmEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeLinkDwdm", "1.3.6.1.2.1.10.227.1.12.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeLinkOperStatusEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeLinkOperStatusEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeLinkOperStatus", "1.3.6.1.2.1.10.227.1.12.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeLinkRowStatusEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeLinkRowStatusEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeLinkRowStatus", "1.3.6.1.2.1.10.227.1.12.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeLinkStorageTypeEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeLinkStorageTypeEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeLinkStorageType", "1.3.6.1.2.1.10.227.1.12.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class LmpGlobalLinkVerificationIntervalEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpGlobalLinkVerificationIntervalEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpGlobalLinkVerificationInterval", "1.3.6.1.2.1.10.227.1.13", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpLinkVerificationTableEnt extends MIBEntry<LMPMIBDef>
            {
                public final LmpLinkVerificationEntryEnt lmpLinkVerificationEntry;

                private LmpLinkVerificationTableEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpLinkVerificationTable", "1.3.6.1.2.1.10.227.1.14", false, true, false, false);
                    this.lmpLinkVerificationEntry = new LmpLinkVerificationEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lmpLinkVerificationEntry
                    };
                }
                public static final class LmpLinkVerificationEntryEnt extends MIBEntry<LMPMIBDef>
                {
                    public final LmpLinkVerifyIntervalEnt lmpLinkVerifyInterval;

                    public final LmpLinkVerifyDeadIntervalEnt lmpLinkVerifyDeadInterval;

                    public final LmpLinkVerifyTransportMechanismEnt lmpLinkVerifyTransportMechanism;

                    public final LmpLinkVerifyAllLinksEnt lmpLinkVerifyAllLinks;

                    public final LmpLinkVerifyTransmissionRateEnt lmpLinkVerifyTransmissionRate;

                    public final LmpLinkVerifyWavelengthEnt lmpLinkVerifyWavelength;

                    public final LmpLinkVerifyRowStatusEnt lmpLinkVerifyRowStatus;

                    public final LmpLinkVerifyStorageTypeEnt lmpLinkVerifyStorageType;

                    private LmpLinkVerificationEntryEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpLinkVerificationEntry", "1.3.6.1.2.1.10.227.1.14.1", false, false, false, true);
                        this.lmpLinkVerifyInterval = new LmpLinkVerifyIntervalEnt(mib, this);
                        this.lmpLinkVerifyDeadInterval = new LmpLinkVerifyDeadIntervalEnt(mib, this);
                        this.lmpLinkVerifyTransportMechanism = new LmpLinkVerifyTransportMechanismEnt(mib, this);
                        this.lmpLinkVerifyAllLinks = new LmpLinkVerifyAllLinksEnt(mib, this);
                        this.lmpLinkVerifyTransmissionRate = new LmpLinkVerifyTransmissionRateEnt(mib, this);
                        this.lmpLinkVerifyWavelength = new LmpLinkVerifyWavelengthEnt(mib, this);
                        this.lmpLinkVerifyRowStatus = new LmpLinkVerifyRowStatusEnt(mib, this);
                        this.lmpLinkVerifyStorageType = new LmpLinkVerifyStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.lmpLinkVerifyInterval,
                            this.lmpLinkVerifyDeadInterval,
                            this.lmpLinkVerifyTransportMechanism,
                            this.lmpLinkVerifyAllLinks,
                            this.lmpLinkVerifyTransmissionRate,
                            this.lmpLinkVerifyWavelength,
                            this.lmpLinkVerifyRowStatus,
                            this.lmpLinkVerifyStorageType
                        };
                    }
                    public static final class LmpLinkVerifyIntervalEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpLinkVerifyIntervalEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpLinkVerifyInterval", "1.3.6.1.2.1.10.227.1.14.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpLinkVerifyDeadIntervalEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpLinkVerifyDeadIntervalEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpLinkVerifyDeadInterval", "1.3.6.1.2.1.10.227.1.14.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpLinkVerifyTransportMechanismEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpLinkVerifyTransportMechanismEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpLinkVerifyTransportMechanism", "1.3.6.1.2.1.10.227.1.14.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpLinkVerifyAllLinksEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpLinkVerifyAllLinksEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpLinkVerifyAllLinks", "1.3.6.1.2.1.10.227.1.14.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpLinkVerifyTransmissionRateEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpLinkVerifyTransmissionRateEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpLinkVerifyTransmissionRate", "1.3.6.1.2.1.10.227.1.14.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpLinkVerifyWavelengthEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpLinkVerifyWavelengthEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpLinkVerifyWavelength", "1.3.6.1.2.1.10.227.1.14.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpLinkVerifyRowStatusEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpLinkVerifyRowStatusEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpLinkVerifyRowStatus", "1.3.6.1.2.1.10.227.1.14.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpLinkVerifyStorageTypeEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpLinkVerifyStorageTypeEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpLinkVerifyStorageType", "1.3.6.1.2.1.10.227.1.14.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class LmpTeLinkPerfTableEnt extends MIBEntry<LMPMIBDef>
            {
                public final LmpTeLinkPerfEntryEnt lmpTeLinkPerfEntry;

                private LmpTeLinkPerfTableEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpTeLinkPerfTable", "1.3.6.1.2.1.10.227.1.15", false, true, false, false);
                    this.lmpTeLinkPerfEntry = new LmpTeLinkPerfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lmpTeLinkPerfEntry
                    };
                }
                public static final class LmpTeLinkPerfEntryEnt extends MIBEntry<LMPMIBDef>
                {
                    public final LmpTeInOctetsEnt lmpTeInOctets;

                    public final LmpTeOutOctetsEnt lmpTeOutOctets;

                    public final LmpTeBeginVerifyReceivedEnt lmpTeBeginVerifyReceived;

                    public final LmpTeBeginVerifySentEnt lmpTeBeginVerifySent;

                    public final LmpTeBeginVerifyRetransmitEnt lmpTeBeginVerifyRetransmit;

                    public final LmpTeBeginVerifyAckReceivedEnt lmpTeBeginVerifyAckReceived;

                    public final LmpTeBeginVerifyAckSentEnt lmpTeBeginVerifyAckSent;

                    public final LmpTeBeginVerifyNackReceivedEnt lmpTeBeginVerifyNackReceived;

                    public final LmpTeBeginVerifyNackSentEnt lmpTeBeginVerifyNackSent;

                    public final LmpTeEndVerifyReceivedEnt lmpTeEndVerifyReceived;

                    public final LmpTeEndVerifySentEnt lmpTeEndVerifySent;

                    public final LmpTeEndVerifyRetransmitEnt lmpTeEndVerifyRetransmit;

                    public final LmpTeEndVerifyAckReceivedEnt lmpTeEndVerifyAckReceived;

                    public final LmpTeEndVerifyAckSentEnt lmpTeEndVerifyAckSent;

                    public final LmpTeTestStatusSuccessReceivedEnt lmpTeTestStatusSuccessReceived;

                    public final LmpTeTestStatusSuccessSentEnt lmpTeTestStatusSuccessSent;

                    public final LmpTeTestStatusSuccessRetransmitEnt lmpTeTestStatusSuccessRetransmit;

                    public final LmpTeTestStatusFailureReceivedEnt lmpTeTestStatusFailureReceived;

                    public final LmpTeTestStatusFailureSentEnt lmpTeTestStatusFailureSent;

                    public final LmpTeTestStatusFailureRetransmitEnt lmpTeTestStatusFailureRetransmit;

                    public final LmpTeTestStatusAckReceivedEnt lmpTeTestStatusAckReceived;

                    public final LmpTeTestStatusAckSentEnt lmpTeTestStatusAckSent;

                    public final LmpTeLinkSummaryReceivedEnt lmpTeLinkSummaryReceived;

                    public final LmpTeLinkSummarySentEnt lmpTeLinkSummarySent;

                    public final LmpTeLinkSummaryRetransmitEnt lmpTeLinkSummaryRetransmit;

                    public final LmpTeLinkSummaryAckReceivedEnt lmpTeLinkSummaryAckReceived;

                    public final LmpTeLinkSummaryAckSentEnt lmpTeLinkSummaryAckSent;

                    public final LmpTeLinkSummaryNackReceivedEnt lmpTeLinkSummaryNackReceived;

                    public final LmpTeLinkSummaryNackSentEnt lmpTeLinkSummaryNackSent;

                    public final LmpTeChannelStatusReceivedEnt lmpTeChannelStatusReceived;

                    public final LmpTeChannelStatusSentEnt lmpTeChannelStatusSent;

                    public final LmpTeChannelStatusRetransmitEnt lmpTeChannelStatusRetransmit;

                    public final LmpTeChannelStatusAckReceivedEnt lmpTeChannelStatusAckReceived;

                    public final LmpTeChannelStatusAckSentEnt lmpTeChannelStatusAckSent;

                    public final LmpTeChannelStatusReqReceivedEnt lmpTeChannelStatusReqReceived;

                    public final LmpTeChannelStatusReqSentEnt lmpTeChannelStatusReqSent;

                    public final LmpTeChannelStatusReqRetransmitEnt lmpTeChannelStatusReqRetransmit;

                    public final LmpTeChannelStatusRspReceivedEnt lmpTeChannelStatusRspReceived;

                    public final LmpTeChannelStatusRspSentEnt lmpTeChannelStatusRspSent;

                    public final LmpTeCounterDiscontinuityTimeEnt lmpTeCounterDiscontinuityTime;

                    private LmpTeLinkPerfEntryEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpTeLinkPerfEntry", "1.3.6.1.2.1.10.227.1.15.1", false, false, false, true);
                        this.lmpTeInOctets = new LmpTeInOctetsEnt(mib, this);
                        this.lmpTeOutOctets = new LmpTeOutOctetsEnt(mib, this);
                        this.lmpTeBeginVerifyReceived = new LmpTeBeginVerifyReceivedEnt(mib, this);
                        this.lmpTeBeginVerifySent = new LmpTeBeginVerifySentEnt(mib, this);
                        this.lmpTeBeginVerifyRetransmit = new LmpTeBeginVerifyRetransmitEnt(mib, this);
                        this.lmpTeBeginVerifyAckReceived = new LmpTeBeginVerifyAckReceivedEnt(mib, this);
                        this.lmpTeBeginVerifyAckSent = new LmpTeBeginVerifyAckSentEnt(mib, this);
                        this.lmpTeBeginVerifyNackReceived = new LmpTeBeginVerifyNackReceivedEnt(mib, this);
                        this.lmpTeBeginVerifyNackSent = new LmpTeBeginVerifyNackSentEnt(mib, this);
                        this.lmpTeEndVerifyReceived = new LmpTeEndVerifyReceivedEnt(mib, this);
                        this.lmpTeEndVerifySent = new LmpTeEndVerifySentEnt(mib, this);
                        this.lmpTeEndVerifyRetransmit = new LmpTeEndVerifyRetransmitEnt(mib, this);
                        this.lmpTeEndVerifyAckReceived = new LmpTeEndVerifyAckReceivedEnt(mib, this);
                        this.lmpTeEndVerifyAckSent = new LmpTeEndVerifyAckSentEnt(mib, this);
                        this.lmpTeTestStatusSuccessReceived = new LmpTeTestStatusSuccessReceivedEnt(mib, this);
                        this.lmpTeTestStatusSuccessSent = new LmpTeTestStatusSuccessSentEnt(mib, this);
                        this.lmpTeTestStatusSuccessRetransmit = new LmpTeTestStatusSuccessRetransmitEnt(mib, this);
                        this.lmpTeTestStatusFailureReceived = new LmpTeTestStatusFailureReceivedEnt(mib, this);
                        this.lmpTeTestStatusFailureSent = new LmpTeTestStatusFailureSentEnt(mib, this);
                        this.lmpTeTestStatusFailureRetransmit = new LmpTeTestStatusFailureRetransmitEnt(mib, this);
                        this.lmpTeTestStatusAckReceived = new LmpTeTestStatusAckReceivedEnt(mib, this);
                        this.lmpTeTestStatusAckSent = new LmpTeTestStatusAckSentEnt(mib, this);
                        this.lmpTeLinkSummaryReceived = new LmpTeLinkSummaryReceivedEnt(mib, this);
                        this.lmpTeLinkSummarySent = new LmpTeLinkSummarySentEnt(mib, this);
                        this.lmpTeLinkSummaryRetransmit = new LmpTeLinkSummaryRetransmitEnt(mib, this);
                        this.lmpTeLinkSummaryAckReceived = new LmpTeLinkSummaryAckReceivedEnt(mib, this);
                        this.lmpTeLinkSummaryAckSent = new LmpTeLinkSummaryAckSentEnt(mib, this);
                        this.lmpTeLinkSummaryNackReceived = new LmpTeLinkSummaryNackReceivedEnt(mib, this);
                        this.lmpTeLinkSummaryNackSent = new LmpTeLinkSummaryNackSentEnt(mib, this);
                        this.lmpTeChannelStatusReceived = new LmpTeChannelStatusReceivedEnt(mib, this);
                        this.lmpTeChannelStatusSent = new LmpTeChannelStatusSentEnt(mib, this);
                        this.lmpTeChannelStatusRetransmit = new LmpTeChannelStatusRetransmitEnt(mib, this);
                        this.lmpTeChannelStatusAckReceived = new LmpTeChannelStatusAckReceivedEnt(mib, this);
                        this.lmpTeChannelStatusAckSent = new LmpTeChannelStatusAckSentEnt(mib, this);
                        this.lmpTeChannelStatusReqReceived = new LmpTeChannelStatusReqReceivedEnt(mib, this);
                        this.lmpTeChannelStatusReqSent = new LmpTeChannelStatusReqSentEnt(mib, this);
                        this.lmpTeChannelStatusReqRetransmit = new LmpTeChannelStatusReqRetransmitEnt(mib, this);
                        this.lmpTeChannelStatusRspReceived = new LmpTeChannelStatusRspReceivedEnt(mib, this);
                        this.lmpTeChannelStatusRspSent = new LmpTeChannelStatusRspSentEnt(mib, this);
                        this.lmpTeCounterDiscontinuityTime = new LmpTeCounterDiscontinuityTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.lmpTeInOctets,
                            this.lmpTeOutOctets,
                            this.lmpTeBeginVerifyReceived,
                            this.lmpTeBeginVerifySent,
                            this.lmpTeBeginVerifyRetransmit,
                            this.lmpTeBeginVerifyAckReceived,
                            this.lmpTeBeginVerifyAckSent,
                            this.lmpTeBeginVerifyNackReceived,
                            this.lmpTeBeginVerifyNackSent,
                            this.lmpTeEndVerifyReceived,
                            this.lmpTeEndVerifySent,
                            this.lmpTeEndVerifyRetransmit,
                            this.lmpTeEndVerifyAckReceived,
                            this.lmpTeEndVerifyAckSent,
                            this.lmpTeTestStatusSuccessReceived,
                            this.lmpTeTestStatusSuccessSent,
                            this.lmpTeTestStatusSuccessRetransmit,
                            this.lmpTeTestStatusFailureReceived,
                            this.lmpTeTestStatusFailureSent,
                            this.lmpTeTestStatusFailureRetransmit,
                            this.lmpTeTestStatusAckReceived,
                            this.lmpTeTestStatusAckSent,
                            this.lmpTeLinkSummaryReceived,
                            this.lmpTeLinkSummarySent,
                            this.lmpTeLinkSummaryRetransmit,
                            this.lmpTeLinkSummaryAckReceived,
                            this.lmpTeLinkSummaryAckSent,
                            this.lmpTeLinkSummaryNackReceived,
                            this.lmpTeLinkSummaryNackSent,
                            this.lmpTeChannelStatusReceived,
                            this.lmpTeChannelStatusSent,
                            this.lmpTeChannelStatusRetransmit,
                            this.lmpTeChannelStatusAckReceived,
                            this.lmpTeChannelStatusAckSent,
                            this.lmpTeChannelStatusReqReceived,
                            this.lmpTeChannelStatusReqSent,
                            this.lmpTeChannelStatusReqRetransmit,
                            this.lmpTeChannelStatusRspReceived,
                            this.lmpTeChannelStatusRspSent,
                            this.lmpTeCounterDiscontinuityTime
                        };
                    }
                    public static final class LmpTeInOctetsEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeInOctetsEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeInOctets", "1.3.6.1.2.1.10.227.1.15.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeOutOctetsEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeOutOctetsEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeOutOctets", "1.3.6.1.2.1.10.227.1.15.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeBeginVerifyReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeBeginVerifyReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeBeginVerifyReceived", "1.3.6.1.2.1.10.227.1.15.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeBeginVerifySentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeBeginVerifySentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeBeginVerifySent", "1.3.6.1.2.1.10.227.1.15.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeBeginVerifyRetransmitEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeBeginVerifyRetransmitEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeBeginVerifyRetransmit", "1.3.6.1.2.1.10.227.1.15.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeBeginVerifyAckReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeBeginVerifyAckReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeBeginVerifyAckReceived", "1.3.6.1.2.1.10.227.1.15.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeBeginVerifyAckSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeBeginVerifyAckSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeBeginVerifyAckSent", "1.3.6.1.2.1.10.227.1.15.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeBeginVerifyNackReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeBeginVerifyNackReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeBeginVerifyNackReceived", "1.3.6.1.2.1.10.227.1.15.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeBeginVerifyNackSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeBeginVerifyNackSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeBeginVerifyNackSent", "1.3.6.1.2.1.10.227.1.15.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeEndVerifyReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeEndVerifyReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeEndVerifyReceived", "1.3.6.1.2.1.10.227.1.15.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeEndVerifySentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeEndVerifySentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeEndVerifySent", "1.3.6.1.2.1.10.227.1.15.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeEndVerifyRetransmitEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeEndVerifyRetransmitEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeEndVerifyRetransmit", "1.3.6.1.2.1.10.227.1.15.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeEndVerifyAckReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeEndVerifyAckReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeEndVerifyAckReceived", "1.3.6.1.2.1.10.227.1.15.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeEndVerifyAckSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeEndVerifyAckSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeEndVerifyAckSent", "1.3.6.1.2.1.10.227.1.15.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeTestStatusSuccessReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeTestStatusSuccessReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeTestStatusSuccessReceived", "1.3.6.1.2.1.10.227.1.15.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeTestStatusSuccessSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeTestStatusSuccessSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeTestStatusSuccessSent", "1.3.6.1.2.1.10.227.1.15.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeTestStatusSuccessRetransmitEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeTestStatusSuccessRetransmitEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeTestStatusSuccessRetransmit", "1.3.6.1.2.1.10.227.1.15.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeTestStatusFailureReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeTestStatusFailureReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeTestStatusFailureReceived", "1.3.6.1.2.1.10.227.1.15.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeTestStatusFailureSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeTestStatusFailureSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeTestStatusFailureSent", "1.3.6.1.2.1.10.227.1.15.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeTestStatusFailureRetransmitEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeTestStatusFailureRetransmitEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeTestStatusFailureRetransmit", "1.3.6.1.2.1.10.227.1.15.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeTestStatusAckReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeTestStatusAckReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeTestStatusAckReceived", "1.3.6.1.2.1.10.227.1.15.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeTestStatusAckSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeTestStatusAckSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeTestStatusAckSent", "1.3.6.1.2.1.10.227.1.15.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeLinkSummaryReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeLinkSummaryReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeLinkSummaryReceived", "1.3.6.1.2.1.10.227.1.15.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeLinkSummarySentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeLinkSummarySentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeLinkSummarySent", "1.3.6.1.2.1.10.227.1.15.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeLinkSummaryRetransmitEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeLinkSummaryRetransmitEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeLinkSummaryRetransmit", "1.3.6.1.2.1.10.227.1.15.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeLinkSummaryAckReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeLinkSummaryAckReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeLinkSummaryAckReceived", "1.3.6.1.2.1.10.227.1.15.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeLinkSummaryAckSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeLinkSummaryAckSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeLinkSummaryAckSent", "1.3.6.1.2.1.10.227.1.15.1.27", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeLinkSummaryNackReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeLinkSummaryNackReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeLinkSummaryNackReceived", "1.3.6.1.2.1.10.227.1.15.1.28", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeLinkSummaryNackSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeLinkSummaryNackSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeLinkSummaryNackSent", "1.3.6.1.2.1.10.227.1.15.1.29", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeChannelStatusReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeChannelStatusReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeChannelStatusReceived", "1.3.6.1.2.1.10.227.1.15.1.30", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeChannelStatusSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeChannelStatusSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeChannelStatusSent", "1.3.6.1.2.1.10.227.1.15.1.31", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeChannelStatusRetransmitEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeChannelStatusRetransmitEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeChannelStatusRetransmit", "1.3.6.1.2.1.10.227.1.15.1.32", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeChannelStatusAckReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeChannelStatusAckReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeChannelStatusAckReceived", "1.3.6.1.2.1.10.227.1.15.1.33", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeChannelStatusAckSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeChannelStatusAckSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeChannelStatusAckSent", "1.3.6.1.2.1.10.227.1.15.1.34", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeChannelStatusReqReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeChannelStatusReqReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeChannelStatusReqReceived", "1.3.6.1.2.1.10.227.1.15.1.35", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeChannelStatusReqSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeChannelStatusReqSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeChannelStatusReqSent", "1.3.6.1.2.1.10.227.1.15.1.36", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeChannelStatusReqRetransmitEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeChannelStatusReqRetransmitEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeChannelStatusReqRetransmit", "1.3.6.1.2.1.10.227.1.15.1.37", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeChannelStatusRspReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeChannelStatusRspReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeChannelStatusRspReceived", "1.3.6.1.2.1.10.227.1.15.1.38", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeChannelStatusRspSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeChannelStatusRspSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeChannelStatusRspSent", "1.3.6.1.2.1.10.227.1.15.1.39", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpTeCounterDiscontinuityTimeEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpTeCounterDiscontinuityTimeEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpTeCounterDiscontinuityTime", "1.3.6.1.2.1.10.227.1.15.1.40", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class LmpDataLinkTableEnt extends MIBEntry<LMPMIBDef>
            {
                public final LmpDataLinkEntryEnt lmpDataLinkEntry;

                private LmpDataLinkTableEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpDataLinkTable", "1.3.6.1.2.1.10.227.1.16", false, true, false, false);
                    this.lmpDataLinkEntry = new LmpDataLinkEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lmpDataLinkEntry
                    };
                }
                public static final class LmpDataLinkEntryEnt extends MIBEntry<LMPMIBDef>
                {
                    public final LmpDataLinkTypeEnt lmpDataLinkType;

                    public final LmpDataLinkAddressTypeEnt lmpDataLinkAddressType;

                    public final LmpDataLinkIpAddrEnt lmpDataLinkIpAddr;

                    public final LmpDataLinkRemoteIpAddressEnt lmpDataLinkRemoteIpAddress;

                    public final LmpDataLinkRemoteIfIdEnt lmpDataLinkRemoteIfId;

                    public final LmpDataLinkEncodingTypeEnt lmpDataLinkEncodingType;

                    public final LmpDataLinkActiveOperStatusEnt lmpDataLinkActiveOperStatus;

                    public final LmpDataLinkPassiveOperStatusEnt lmpDataLinkPassiveOperStatus;

                    public final LmpDataLinkRowStatusEnt lmpDataLinkRowStatus;

                    public final LmpDataLinkStorageTypeEnt lmpDataLinkStorageType;

                    private LmpDataLinkEntryEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpDataLinkEntry", "1.3.6.1.2.1.10.227.1.16.1", false, false, false, true);
                        this.lmpDataLinkType = new LmpDataLinkTypeEnt(mib, this);
                        this.lmpDataLinkAddressType = new LmpDataLinkAddressTypeEnt(mib, this);
                        this.lmpDataLinkIpAddr = new LmpDataLinkIpAddrEnt(mib, this);
                        this.lmpDataLinkRemoteIpAddress = new LmpDataLinkRemoteIpAddressEnt(mib, this);
                        this.lmpDataLinkRemoteIfId = new LmpDataLinkRemoteIfIdEnt(mib, this);
                        this.lmpDataLinkEncodingType = new LmpDataLinkEncodingTypeEnt(mib, this);
                        this.lmpDataLinkActiveOperStatus = new LmpDataLinkActiveOperStatusEnt(mib, this);
                        this.lmpDataLinkPassiveOperStatus = new LmpDataLinkPassiveOperStatusEnt(mib, this);
                        this.lmpDataLinkRowStatus = new LmpDataLinkRowStatusEnt(mib, this);
                        this.lmpDataLinkStorageType = new LmpDataLinkStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.lmpDataLinkType,
                            this.lmpDataLinkAddressType,
                            this.lmpDataLinkIpAddr,
                            this.lmpDataLinkRemoteIpAddress,
                            this.lmpDataLinkRemoteIfId,
                            this.lmpDataLinkEncodingType,
                            this.lmpDataLinkActiveOperStatus,
                            this.lmpDataLinkPassiveOperStatus,
                            this.lmpDataLinkRowStatus,
                            this.lmpDataLinkStorageType
                        };
                    }
                    public static final class LmpDataLinkTypeEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpDataLinkTypeEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpDataLinkType", "1.3.6.1.2.1.10.227.1.16.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpDataLinkAddressTypeEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpDataLinkAddressTypeEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpDataLinkAddressType", "1.3.6.1.2.1.10.227.1.16.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpDataLinkIpAddrEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpDataLinkIpAddrEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpDataLinkIpAddr", "1.3.6.1.2.1.10.227.1.16.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpDataLinkRemoteIpAddressEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpDataLinkRemoteIpAddressEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpDataLinkRemoteIpAddress", "1.3.6.1.2.1.10.227.1.16.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpDataLinkRemoteIfIdEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpDataLinkRemoteIfIdEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpDataLinkRemoteIfId", "1.3.6.1.2.1.10.227.1.16.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpDataLinkEncodingTypeEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpDataLinkEncodingTypeEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpDataLinkEncodingType", "1.3.6.1.2.1.10.227.1.16.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpDataLinkActiveOperStatusEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpDataLinkActiveOperStatusEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpDataLinkActiveOperStatus", "1.3.6.1.2.1.10.227.1.16.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpDataLinkPassiveOperStatusEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpDataLinkPassiveOperStatusEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpDataLinkPassiveOperStatus", "1.3.6.1.2.1.10.227.1.16.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpDataLinkRowStatusEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpDataLinkRowStatusEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpDataLinkRowStatus", "1.3.6.1.2.1.10.227.1.16.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpDataLinkStorageTypeEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpDataLinkStorageTypeEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpDataLinkStorageType", "1.3.6.1.2.1.10.227.1.16.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class LmpDataLinkPerfTableEnt extends MIBEntry<LMPMIBDef>
            {
                public final LmpDataLinkPerfEntryEnt lmpDataLinkPerfEntry;

                private LmpDataLinkPerfTableEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpDataLinkPerfTable", "1.3.6.1.2.1.10.227.1.17", false, true, false, false);
                    this.lmpDataLinkPerfEntry = new LmpDataLinkPerfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lmpDataLinkPerfEntry
                    };
                }
                public static final class LmpDataLinkPerfEntryEnt extends MIBEntry<LMPMIBDef>
                {
                    public final LmpDataLinkTestReceivedEnt lmpDataLinkTestReceived;

                    public final LmpDataLinkTestSentEnt lmpDataLinkTestSent;

                    public final LmpDataLinkActiveTestSuccessEnt lmpDataLinkActiveTestSuccess;

                    public final LmpDataLinkActiveTestFailureEnt lmpDataLinkActiveTestFailure;

                    public final LmpDataLinkPassiveTestSuccessEnt lmpDataLinkPassiveTestSuccess;

                    public final LmpDataLinkPassiveTestFailureEnt lmpDataLinkPassiveTestFailure;

                    public final LmpDataLinkDiscontinuityTimeEnt lmpDataLinkDiscontinuityTime;

                    private LmpDataLinkPerfEntryEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpDataLinkPerfEntry", "1.3.6.1.2.1.10.227.1.17.1", false, false, false, true);
                        this.lmpDataLinkTestReceived = new LmpDataLinkTestReceivedEnt(mib, this);
                        this.lmpDataLinkTestSent = new LmpDataLinkTestSentEnt(mib, this);
                        this.lmpDataLinkActiveTestSuccess = new LmpDataLinkActiveTestSuccessEnt(mib, this);
                        this.lmpDataLinkActiveTestFailure = new LmpDataLinkActiveTestFailureEnt(mib, this);
                        this.lmpDataLinkPassiveTestSuccess = new LmpDataLinkPassiveTestSuccessEnt(mib, this);
                        this.lmpDataLinkPassiveTestFailure = new LmpDataLinkPassiveTestFailureEnt(mib, this);
                        this.lmpDataLinkDiscontinuityTime = new LmpDataLinkDiscontinuityTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.lmpDataLinkTestReceived,
                            this.lmpDataLinkTestSent,
                            this.lmpDataLinkActiveTestSuccess,
                            this.lmpDataLinkActiveTestFailure,
                            this.lmpDataLinkPassiveTestSuccess,
                            this.lmpDataLinkPassiveTestFailure,
                            this.lmpDataLinkDiscontinuityTime
                        };
                    }
                    public static final class LmpDataLinkTestReceivedEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpDataLinkTestReceivedEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpDataLinkTestReceived", "1.3.6.1.2.1.10.227.1.17.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpDataLinkTestSentEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpDataLinkTestSentEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpDataLinkTestSent", "1.3.6.1.2.1.10.227.1.17.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpDataLinkActiveTestSuccessEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpDataLinkActiveTestSuccessEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpDataLinkActiveTestSuccess", "1.3.6.1.2.1.10.227.1.17.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpDataLinkActiveTestFailureEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpDataLinkActiveTestFailureEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpDataLinkActiveTestFailure", "1.3.6.1.2.1.10.227.1.17.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpDataLinkPassiveTestSuccessEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpDataLinkPassiveTestSuccessEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpDataLinkPassiveTestSuccess", "1.3.6.1.2.1.10.227.1.17.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpDataLinkPassiveTestFailureEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpDataLinkPassiveTestFailureEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpDataLinkPassiveTestFailure", "1.3.6.1.2.1.10.227.1.17.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LmpDataLinkDiscontinuityTimeEnt extends MIBEntry<LMPMIBDef>
                    {
                        private LmpDataLinkDiscontinuityTimeEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                        {
                            super(mib, parent, "lmpDataLinkDiscontinuityTime", "1.3.6.1.2.1.10.227.1.17.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class LmpNotificationMaxRateEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpNotificationMaxRateEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpNotificationMaxRate", "1.3.6.1.2.1.10.227.1.18", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpLinkPropertyNotificationsEnabledEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpLinkPropertyNotificationsEnabledEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpLinkPropertyNotificationsEnabled", "1.3.6.1.2.1.10.227.1.19", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpUnprotectedNotificationsEnabledEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpUnprotectedNotificationsEnabledEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpUnprotectedNotificationsEnabled", "1.3.6.1.2.1.10.227.1.20", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpCcUpDownNotificationsEnabledEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpCcUpDownNotificationsEnabledEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpCcUpDownNotificationsEnabled", "1.3.6.1.2.1.10.227.1.21", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpTeLinkNotificationsEnabledEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpTeLinkNotificationsEnabledEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpTeLinkNotificationsEnabled", "1.3.6.1.2.1.10.227.1.22", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LmpDataLinkNotificationsEnabledEnt extends MIBEntry<LMPMIBDef>
            {
                private LmpDataLinkNotificationsEnabledEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpDataLinkNotificationsEnabled", "1.3.6.1.2.1.10.227.1.23", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class LmpConformanceEnt extends MIBEntry<LMPMIBDef>
        {
            /** End of notifications



Module compliance*/
            public final LmpCompliancesEnt lmpCompliances;

            public final LmpGroupsEnt lmpGroups;

            private LmpConformanceEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
            {
                super(mib, parent, "lmpConformance", "1.3.6.1.2.1.10.227.2", false, false, false, false);
                this.lmpCompliances = new LmpCompliancesEnt(mib, this);
                this.lmpGroups = new LmpGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.lmpCompliances,
                    this.lmpGroups
                };
            }
            public static final class LmpCompliancesEnt extends MIBEntry<LMPMIBDef>
            {
                public final LmpModuleFullComplianceEnt lmpModuleFullCompliance;

                public final LmpModuleReadOnlyComplianceEnt lmpModuleReadOnlyCompliance;

                private LmpCompliancesEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpCompliances", "1.3.6.1.2.1.10.227.2.1", false, false, false, false);
                    this.lmpModuleFullCompliance = new LmpModuleFullComplianceEnt(mib, this);
                    this.lmpModuleReadOnlyCompliance = new LmpModuleReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lmpModuleFullCompliance,
                        this.lmpModuleReadOnlyCompliance
                    };
                }
                public static final class LmpModuleFullComplianceEnt extends MIBEntry<LMPMIBDef>
                {
                    private LmpModuleFullComplianceEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpModuleFullCompliance", "1.3.6.1.2.1.10.227.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LmpModuleReadOnlyComplianceEnt extends MIBEntry<LMPMIBDef>
                {
                    private LmpModuleReadOnlyComplianceEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpModuleReadOnlyCompliance", "1.3.6.1.2.1.10.227.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class LmpGroupsEnt extends MIBEntry<LMPMIBDef>
            {
                /** Units of conformance*/
                public final LmpNodeGroupEnt lmpNodeGroup;

                public final LmpControlChannelGroupEnt lmpControlChannelGroup;

                public final LmpCcIsInterfaceGroupEnt lmpCcIsInterfaceGroup;

                public final LmpCcIsNotInterfaceGroupEnt lmpCcIsNotInterfaceGroup;

                public final LmpLinkPropertyCorrelationGroupEnt lmpLinkPropertyCorrelationGroup;

                public final LmpLinkVerificationGroupEnt lmpLinkVerificationGroup;

                public final LmpPerfGroupEnt lmpPerfGroup;

                public final LmpTeLinkGroupEnt lmpTeLinkGroup;

                public final LmpDataLinkGroupEnt lmpDataLinkGroup;

                public final LmpNotificationGroupEnt lmpNotificationGroup;

                private LmpGroupsEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                {
                    super(mib, parent, "lmpGroups", "1.3.6.1.2.1.10.227.2.2", false, false, false, false);
                    this.lmpNodeGroup = new LmpNodeGroupEnt(mib, this);
                    this.lmpControlChannelGroup = new LmpControlChannelGroupEnt(mib, this);
                    this.lmpCcIsInterfaceGroup = new LmpCcIsInterfaceGroupEnt(mib, this);
                    this.lmpCcIsNotInterfaceGroup = new LmpCcIsNotInterfaceGroupEnt(mib, this);
                    this.lmpLinkPropertyCorrelationGroup = new LmpLinkPropertyCorrelationGroupEnt(mib, this);
                    this.lmpLinkVerificationGroup = new LmpLinkVerificationGroupEnt(mib, this);
                    this.lmpPerfGroup = new LmpPerfGroupEnt(mib, this);
                    this.lmpTeLinkGroup = new LmpTeLinkGroupEnt(mib, this);
                    this.lmpDataLinkGroup = new LmpDataLinkGroupEnt(mib, this);
                    this.lmpNotificationGroup = new LmpNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lmpNodeGroup,
                        this.lmpControlChannelGroup,
                        this.lmpCcIsInterfaceGroup,
                        this.lmpCcIsNotInterfaceGroup,
                        this.lmpLinkPropertyCorrelationGroup,
                        this.lmpLinkVerificationGroup,
                        this.lmpPerfGroup,
                        this.lmpTeLinkGroup,
                        this.lmpDataLinkGroup,
                        this.lmpNotificationGroup
                    };
                }
                public static final class LmpNodeGroupEnt extends MIBEntry<LMPMIBDef>
                {
                    private LmpNodeGroupEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpNodeGroup", "1.3.6.1.2.1.10.227.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LmpControlChannelGroupEnt extends MIBEntry<LMPMIBDef>
                {
                    private LmpControlChannelGroupEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpControlChannelGroup", "1.3.6.1.2.1.10.227.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LmpCcIsInterfaceGroupEnt extends MIBEntry<LMPMIBDef>
                {
                    private LmpCcIsInterfaceGroupEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpCcIsInterfaceGroup", "1.3.6.1.2.1.10.227.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LmpCcIsNotInterfaceGroupEnt extends MIBEntry<LMPMIBDef>
                {
                    private LmpCcIsNotInterfaceGroupEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpCcIsNotInterfaceGroup", "1.3.6.1.2.1.10.227.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LmpLinkPropertyCorrelationGroupEnt extends MIBEntry<LMPMIBDef>
                {
                    private LmpLinkPropertyCorrelationGroupEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpLinkPropertyCorrelationGroup", "1.3.6.1.2.1.10.227.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LmpLinkVerificationGroupEnt extends MIBEntry<LMPMIBDef>
                {
                    private LmpLinkVerificationGroupEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpLinkVerificationGroup", "1.3.6.1.2.1.10.227.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LmpPerfGroupEnt extends MIBEntry<LMPMIBDef>
                {
                    private LmpPerfGroupEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpPerfGroup", "1.3.6.1.2.1.10.227.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LmpTeLinkGroupEnt extends MIBEntry<LMPMIBDef>
                {
                    private LmpTeLinkGroupEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpTeLinkGroup", "1.3.6.1.2.1.10.227.2.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LmpDataLinkGroupEnt extends MIBEntry<LMPMIBDef>
                {
                    private LmpDataLinkGroupEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpDataLinkGroup", "1.3.6.1.2.1.10.227.2.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LmpNotificationGroupEnt extends MIBEntry<LMPMIBDef>
                {
                    private LmpNotificationGroupEnt(LMPMIBDef mib, MIBEntry<LMPMIBDef> parent)
                    {
                        super(mib, parent, "lmpNotificationGroup", "1.3.6.1.2.1.10.227.2.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
