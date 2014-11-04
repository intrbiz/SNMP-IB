package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class VRRPMIBDef extends MIB
{
    public static final VRRPMIBDef VRRPMIB = new VRRPMIBDef();

    static { MIBs.getInstance().registerMIB(VRRPMIBDef.VRRPMIB); }

    public final VrrpMIBEnt vrrpMIB;

    private VRRPMIBDef()
    {
        super("VRRP-MIB");
        this.vrrpMIB = new VrrpMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.vrrpMIB
        };
    }

    public static final class VrrpMIBEnt extends MIBEntry<VRRPMIBDef>
    {
        /** *******************************************************************VRRP MIB Groups********************************************************************/
        public final VrrpOperationsEnt vrrpOperations;

        public final VrrpStatisticsEnt vrrpStatistics;

        public final VrrpConformanceEnt vrrpConformance;

        /** *******************************************************************Trap Definitions********************************************************************/
        public final VrrpNotificationsEnt vrrpNotifications;

        private VrrpMIBEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
        {
            super(mib, parent, "vrrpMIB", "1.3.6.1.2.1.68", false, false, false, false);
            this.vrrpOperations = new VrrpOperationsEnt(mib, this);
            this.vrrpStatistics = new VrrpStatisticsEnt(mib, this);
            this.vrrpConformance = new VrrpConformanceEnt(mib, this);
            this.vrrpNotifications = new VrrpNotificationsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.vrrpOperations,
                this.vrrpStatistics,
                this.vrrpConformance,
                this.vrrpNotifications
            };
        }
        public static final class VrrpOperationsEnt extends MIBEntry<VRRPMIBDef>
        {
            /** *******************************************************************Start of MIB objects********************************************************************/
            public final VrrpNodeVersionEnt vrrpNodeVersion;

            public final VrrpNotificationCntlEnt vrrpNotificationCntl;

            /** *******************************************************************VRRP Operations Table********************************************************************/
            public final VrrpOperTableEnt vrrpOperTable;

            /** *******************************************************************VRRP Associated IP Address Table********************************************************************/
            public final VrrpAssoIpAddrTableEnt vrrpAssoIpAddrTable;

            public final VrrpTrapPacketSrcEnt vrrpTrapPacketSrc;

            public final VrrpTrapAuthErrorTypeEnt vrrpTrapAuthErrorType;

            private VrrpOperationsEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
            {
                super(mib, parent, "vrrpOperations", "1.3.6.1.2.1.68.1", false, false, false, false);
                this.vrrpNodeVersion = new VrrpNodeVersionEnt(mib, this);
                this.vrrpNotificationCntl = new VrrpNotificationCntlEnt(mib, this);
                this.vrrpOperTable = new VrrpOperTableEnt(mib, this);
                this.vrrpAssoIpAddrTable = new VrrpAssoIpAddrTableEnt(mib, this);
                this.vrrpTrapPacketSrc = new VrrpTrapPacketSrcEnt(mib, this);
                this.vrrpTrapAuthErrorType = new VrrpTrapAuthErrorTypeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.vrrpNodeVersion,
                    this.vrrpNotificationCntl,
                    this.vrrpOperTable,
                    this.vrrpAssoIpAddrTable,
                    this.vrrpTrapPacketSrc,
                    this.vrrpTrapAuthErrorType
                };
            }
            public static final class VrrpNodeVersionEnt extends MIBEntry<VRRPMIBDef>
            {
                private VrrpNodeVersionEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                {
                    super(mib, parent, "vrrpNodeVersion", "1.3.6.1.2.1.68.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class VrrpNotificationCntlEnt extends MIBEntry<VRRPMIBDef>
            {
                private VrrpNotificationCntlEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                {
                    super(mib, parent, "vrrpNotificationCntl", "1.3.6.1.2.1.68.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class VrrpOperTableEnt extends MIBEntry<VRRPMIBDef>
            {
                public final VrrpOperEntryEnt vrrpOperEntry;

                private VrrpOperTableEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                {
                    super(mib, parent, "vrrpOperTable", "1.3.6.1.2.1.68.1.3", false, true, false, false);
                    this.vrrpOperEntry = new VrrpOperEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vrrpOperEntry
                    };
                }
                public static final class VrrpOperEntryEnt extends MIBEntry<VRRPMIBDef>
                {
                    public final VrrpOperVrIdEnt vrrpOperVrId;

                    public final VrrpOperVirtualMacAddrEnt vrrpOperVirtualMacAddr;

                    public final VrrpOperStateEnt vrrpOperState;

                    public final VrrpOperAdminStateEnt vrrpOperAdminState;

                    public final VrrpOperPriorityEnt vrrpOperPriority;

                    public final VrrpOperIpAddrCountEnt vrrpOperIpAddrCount;

                    public final VrrpOperMasterIpAddrEnt vrrpOperMasterIpAddr;

                    /** 0.0.0.0*/
                    public final VrrpOperPrimaryIpAddrEnt vrrpOperPrimaryIpAddr;

                    public final VrrpOperAuthTypeEnt vrrpOperAuthType;

                    public final VrrpOperAuthKeyEnt vrrpOperAuthKey;

                    public final VrrpOperAdvertisementIntervalEnt vrrpOperAdvertisementInterval;

                    public final VrrpOperPreemptModeEnt vrrpOperPreemptMode;

                    public final VrrpOperVirtualRouterUpTimeEnt vrrpOperVirtualRouterUpTime;

                    public final VrrpOperProtocolEnt vrrpOperProtocol;

                    public final VrrpOperRowStatusEnt vrrpOperRowStatus;

                    private VrrpOperEntryEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                    {
                        super(mib, parent, "vrrpOperEntry", "1.3.6.1.2.1.68.1.3.1", false, false, false, true);
                        this.vrrpOperVrId = new VrrpOperVrIdEnt(mib, this);
                        this.vrrpOperVirtualMacAddr = new VrrpOperVirtualMacAddrEnt(mib, this);
                        this.vrrpOperState = new VrrpOperStateEnt(mib, this);
                        this.vrrpOperAdminState = new VrrpOperAdminStateEnt(mib, this);
                        this.vrrpOperPriority = new VrrpOperPriorityEnt(mib, this);
                        this.vrrpOperIpAddrCount = new VrrpOperIpAddrCountEnt(mib, this);
                        this.vrrpOperMasterIpAddr = new VrrpOperMasterIpAddrEnt(mib, this);
                        this.vrrpOperPrimaryIpAddr = new VrrpOperPrimaryIpAddrEnt(mib, this);
                        this.vrrpOperAuthType = new VrrpOperAuthTypeEnt(mib, this);
                        this.vrrpOperAuthKey = new VrrpOperAuthKeyEnt(mib, this);
                        this.vrrpOperAdvertisementInterval = new VrrpOperAdvertisementIntervalEnt(mib, this);
                        this.vrrpOperPreemptMode = new VrrpOperPreemptModeEnt(mib, this);
                        this.vrrpOperVirtualRouterUpTime = new VrrpOperVirtualRouterUpTimeEnt(mib, this);
                        this.vrrpOperProtocol = new VrrpOperProtocolEnt(mib, this);
                        this.vrrpOperRowStatus = new VrrpOperRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vrrpOperVrId,
                            this.vrrpOperVirtualMacAddr,
                            this.vrrpOperState,
                            this.vrrpOperAdminState,
                            this.vrrpOperPriority,
                            this.vrrpOperIpAddrCount,
                            this.vrrpOperMasterIpAddr,
                            this.vrrpOperPrimaryIpAddr,
                            this.vrrpOperAuthType,
                            this.vrrpOperAuthKey,
                            this.vrrpOperAdvertisementInterval,
                            this.vrrpOperPreemptMode,
                            this.vrrpOperVirtualRouterUpTime,
                            this.vrrpOperProtocol,
                            this.vrrpOperRowStatus
                        };
                    }
                    public static final class VrrpOperVrIdEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpOperVrIdEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpOperVrId", "1.3.6.1.2.1.68.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpOperVirtualMacAddrEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpOperVirtualMacAddrEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpOperVirtualMacAddr", "1.3.6.1.2.1.68.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpOperStateEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpOperStateEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpOperState", "1.3.6.1.2.1.68.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpOperAdminStateEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpOperAdminStateEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpOperAdminState", "1.3.6.1.2.1.68.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpOperPriorityEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpOperPriorityEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpOperPriority", "1.3.6.1.2.1.68.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpOperIpAddrCountEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpOperIpAddrCountEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpOperIpAddrCount", "1.3.6.1.2.1.68.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpOperMasterIpAddrEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpOperMasterIpAddrEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpOperMasterIpAddr", "1.3.6.1.2.1.68.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpOperPrimaryIpAddrEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpOperPrimaryIpAddrEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpOperPrimaryIpAddr", "1.3.6.1.2.1.68.1.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpOperAuthTypeEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpOperAuthTypeEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpOperAuthType", "1.3.6.1.2.1.68.1.3.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpOperAuthKeyEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpOperAuthKeyEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpOperAuthKey", "1.3.6.1.2.1.68.1.3.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpOperAdvertisementIntervalEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpOperAdvertisementIntervalEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpOperAdvertisementInterval", "1.3.6.1.2.1.68.1.3.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpOperPreemptModeEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpOperPreemptModeEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpOperPreemptMode", "1.3.6.1.2.1.68.1.3.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpOperVirtualRouterUpTimeEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpOperVirtualRouterUpTimeEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpOperVirtualRouterUpTime", "1.3.6.1.2.1.68.1.3.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpOperProtocolEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpOperProtocolEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpOperProtocol", "1.3.6.1.2.1.68.1.3.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpOperRowStatusEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpOperRowStatusEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpOperRowStatus", "1.3.6.1.2.1.68.1.3.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class VrrpAssoIpAddrTableEnt extends MIBEntry<VRRPMIBDef>
            {
                public final VrrpAssoIpAddrEntryEnt vrrpAssoIpAddrEntry;

                private VrrpAssoIpAddrTableEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                {
                    super(mib, parent, "vrrpAssoIpAddrTable", "1.3.6.1.2.1.68.1.4", false, true, false, false);
                    this.vrrpAssoIpAddrEntry = new VrrpAssoIpAddrEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vrrpAssoIpAddrEntry
                    };
                }
                public static final class VrrpAssoIpAddrEntryEnt extends MIBEntry<VRRPMIBDef>
                {
                    public final VrrpAssoIpAddrEnt vrrpAssoIpAddr;

                    public final VrrpAssoIpAddrRowStatusEnt vrrpAssoIpAddrRowStatus;

                    private VrrpAssoIpAddrEntryEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                    {
                        super(mib, parent, "vrrpAssoIpAddrEntry", "1.3.6.1.2.1.68.1.4.1", false, false, false, true);
                        this.vrrpAssoIpAddr = new VrrpAssoIpAddrEnt(mib, this);
                        this.vrrpAssoIpAddrRowStatus = new VrrpAssoIpAddrRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vrrpAssoIpAddr,
                            this.vrrpAssoIpAddrRowStatus
                        };
                    }
                    public static final class VrrpAssoIpAddrEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpAssoIpAddrEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpAssoIpAddr", "1.3.6.1.2.1.68.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpAssoIpAddrRowStatusEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpAssoIpAddrRowStatusEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpAssoIpAddrRowStatus", "1.3.6.1.2.1.68.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class VrrpTrapPacketSrcEnt extends MIBEntry<VRRPMIBDef>
            {
                private VrrpTrapPacketSrcEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                {
                    super(mib, parent, "vrrpTrapPacketSrc", "1.3.6.1.2.1.68.1.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class VrrpTrapAuthErrorTypeEnt extends MIBEntry<VRRPMIBDef>
            {
                private VrrpTrapAuthErrorTypeEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                {
                    super(mib, parent, "vrrpTrapAuthErrorType", "1.3.6.1.2.1.68.1.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class VrrpStatisticsEnt extends MIBEntry<VRRPMIBDef>
        {
            /** *******************************************************************VRRP Router Statistics********************************************************************/
            public final VrrpRouterChecksumErrorsEnt vrrpRouterChecksumErrors;

            public final VrrpRouterVersionErrorsEnt vrrpRouterVersionErrors;

            public final VrrpRouterVrIdErrorsEnt vrrpRouterVrIdErrors;

            /** *******************************************************************VRRP Router Statistics Table********************************************************************/
            public final VrrpRouterStatsTableEnt vrrpRouterStatsTable;

            private VrrpStatisticsEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
            {
                super(mib, parent, "vrrpStatistics", "1.3.6.1.2.1.68.2", false, false, false, false);
                this.vrrpRouterChecksumErrors = new VrrpRouterChecksumErrorsEnt(mib, this);
                this.vrrpRouterVersionErrors = new VrrpRouterVersionErrorsEnt(mib, this);
                this.vrrpRouterVrIdErrors = new VrrpRouterVrIdErrorsEnt(mib, this);
                this.vrrpRouterStatsTable = new VrrpRouterStatsTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.vrrpRouterChecksumErrors,
                    this.vrrpRouterVersionErrors,
                    this.vrrpRouterVrIdErrors,
                    this.vrrpRouterStatsTable
                };
            }
            public static final class VrrpRouterChecksumErrorsEnt extends MIBEntry<VRRPMIBDef>
            {
                private VrrpRouterChecksumErrorsEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                {
                    super(mib, parent, "vrrpRouterChecksumErrors", "1.3.6.1.2.1.68.2.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class VrrpRouterVersionErrorsEnt extends MIBEntry<VRRPMIBDef>
            {
                private VrrpRouterVersionErrorsEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                {
                    super(mib, parent, "vrrpRouterVersionErrors", "1.3.6.1.2.1.68.2.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class VrrpRouterVrIdErrorsEnt extends MIBEntry<VRRPMIBDef>
            {
                private VrrpRouterVrIdErrorsEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                {
                    super(mib, parent, "vrrpRouterVrIdErrors", "1.3.6.1.2.1.68.2.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class VrrpRouterStatsTableEnt extends MIBEntry<VRRPMIBDef>
            {
                public final VrrpRouterStatsEntryEnt vrrpRouterStatsEntry;

                private VrrpRouterStatsTableEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                {
                    super(mib, parent, "vrrpRouterStatsTable", "1.3.6.1.2.1.68.2.4", false, true, false, false);
                    this.vrrpRouterStatsEntry = new VrrpRouterStatsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vrrpRouterStatsEntry
                    };
                }
                public static final class VrrpRouterStatsEntryEnt extends MIBEntry<VRRPMIBDef>
                {
                    public final VrrpStatsBecomeMasterEnt vrrpStatsBecomeMaster;

                    public final VrrpStatsAdvertiseRcvdEnt vrrpStatsAdvertiseRcvd;

                    public final VrrpStatsAdvertiseIntervalErrorsEnt vrrpStatsAdvertiseIntervalErrors;

                    public final VrrpStatsAuthFailuresEnt vrrpStatsAuthFailures;

                    public final VrrpStatsIpTtlErrorsEnt vrrpStatsIpTtlErrors;

                    public final VrrpStatsPriorityZeroPktsRcvdEnt vrrpStatsPriorityZeroPktsRcvd;

                    public final VrrpStatsPriorityZeroPktsSentEnt vrrpStatsPriorityZeroPktsSent;

                    public final VrrpStatsInvalidTypePktsRcvdEnt vrrpStatsInvalidTypePktsRcvd;

                    public final VrrpStatsAddressListErrorsEnt vrrpStatsAddressListErrors;

                    public final VrrpStatsInvalidAuthTypeEnt vrrpStatsInvalidAuthType;

                    public final VrrpStatsAuthTypeMismatchEnt vrrpStatsAuthTypeMismatch;

                    public final VrrpStatsPacketLengthErrorsEnt vrrpStatsPacketLengthErrors;

                    private VrrpRouterStatsEntryEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                    {
                        super(mib, parent, "vrrpRouterStatsEntry", "1.3.6.1.2.1.68.2.4.1", false, false, false, true);
                        this.vrrpStatsBecomeMaster = new VrrpStatsBecomeMasterEnt(mib, this);
                        this.vrrpStatsAdvertiseRcvd = new VrrpStatsAdvertiseRcvdEnt(mib, this);
                        this.vrrpStatsAdvertiseIntervalErrors = new VrrpStatsAdvertiseIntervalErrorsEnt(mib, this);
                        this.vrrpStatsAuthFailures = new VrrpStatsAuthFailuresEnt(mib, this);
                        this.vrrpStatsIpTtlErrors = new VrrpStatsIpTtlErrorsEnt(mib, this);
                        this.vrrpStatsPriorityZeroPktsRcvd = new VrrpStatsPriorityZeroPktsRcvdEnt(mib, this);
                        this.vrrpStatsPriorityZeroPktsSent = new VrrpStatsPriorityZeroPktsSentEnt(mib, this);
                        this.vrrpStatsInvalidTypePktsRcvd = new VrrpStatsInvalidTypePktsRcvdEnt(mib, this);
                        this.vrrpStatsAddressListErrors = new VrrpStatsAddressListErrorsEnt(mib, this);
                        this.vrrpStatsInvalidAuthType = new VrrpStatsInvalidAuthTypeEnt(mib, this);
                        this.vrrpStatsAuthTypeMismatch = new VrrpStatsAuthTypeMismatchEnt(mib, this);
                        this.vrrpStatsPacketLengthErrors = new VrrpStatsPacketLengthErrorsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vrrpStatsBecomeMaster,
                            this.vrrpStatsAdvertiseRcvd,
                            this.vrrpStatsAdvertiseIntervalErrors,
                            this.vrrpStatsAuthFailures,
                            this.vrrpStatsIpTtlErrors,
                            this.vrrpStatsPriorityZeroPktsRcvd,
                            this.vrrpStatsPriorityZeroPktsSent,
                            this.vrrpStatsInvalidTypePktsRcvd,
                            this.vrrpStatsAddressListErrors,
                            this.vrrpStatsInvalidAuthType,
                            this.vrrpStatsAuthTypeMismatch,
                            this.vrrpStatsPacketLengthErrors
                        };
                    }
                    public static final class VrrpStatsBecomeMasterEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpStatsBecomeMasterEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpStatsBecomeMaster", "1.3.6.1.2.1.68.2.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpStatsAdvertiseRcvdEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpStatsAdvertiseRcvdEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpStatsAdvertiseRcvd", "1.3.6.1.2.1.68.2.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpStatsAdvertiseIntervalErrorsEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpStatsAdvertiseIntervalErrorsEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpStatsAdvertiseIntervalErrors", "1.3.6.1.2.1.68.2.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpStatsAuthFailuresEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpStatsAuthFailuresEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpStatsAuthFailures", "1.3.6.1.2.1.68.2.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpStatsIpTtlErrorsEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpStatsIpTtlErrorsEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpStatsIpTtlErrors", "1.3.6.1.2.1.68.2.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpStatsPriorityZeroPktsRcvdEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpStatsPriorityZeroPktsRcvdEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpStatsPriorityZeroPktsRcvd", "1.3.6.1.2.1.68.2.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpStatsPriorityZeroPktsSentEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpStatsPriorityZeroPktsSentEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpStatsPriorityZeroPktsSent", "1.3.6.1.2.1.68.2.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpStatsInvalidTypePktsRcvdEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpStatsInvalidTypePktsRcvdEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpStatsInvalidTypePktsRcvd", "1.3.6.1.2.1.68.2.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpStatsAddressListErrorsEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpStatsAddressListErrorsEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpStatsAddressListErrors", "1.3.6.1.2.1.68.2.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpStatsInvalidAuthTypeEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpStatsInvalidAuthTypeEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpStatsInvalidAuthType", "1.3.6.1.2.1.68.2.4.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpStatsAuthTypeMismatchEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpStatsAuthTypeMismatchEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpStatsAuthTypeMismatch", "1.3.6.1.2.1.68.2.4.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VrrpStatsPacketLengthErrorsEnt extends MIBEntry<VRRPMIBDef>
                    {
                        private VrrpStatsPacketLengthErrorsEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                        {
                            super(mib, parent, "vrrpStatsPacketLengthErrors", "1.3.6.1.2.1.68.2.4.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class VrrpConformanceEnt extends MIBEntry<VRRPMIBDef>
        {
            /** *******************************************************************Conformance Information********************************************************************/
            public final VrrpMIBCompliancesEnt vrrpMIBCompliances;

            public final VrrpMIBGroupsEnt vrrpMIBGroups;

            private VrrpConformanceEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
            {
                super(mib, parent, "vrrpConformance", "1.3.6.1.2.1.68.3", false, false, false, false);
                this.vrrpMIBCompliances = new VrrpMIBCompliancesEnt(mib, this);
                this.vrrpMIBGroups = new VrrpMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.vrrpMIBCompliances,
                    this.vrrpMIBGroups
                };
            }
            public static final class VrrpMIBCompliancesEnt extends MIBEntry<VRRPMIBDef>
            {
                /** ...................................................................Compliance Statements...................................................................*/
                public final VrrpMIBComplianceEnt vrrpMIBCompliance;

                private VrrpMIBCompliancesEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                {
                    super(mib, parent, "vrrpMIBCompliances", "1.3.6.1.2.1.68.3.1", false, false, false, false);
                    this.vrrpMIBCompliance = new VrrpMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vrrpMIBCompliance
                    };
                }
                public static final class VrrpMIBComplianceEnt extends MIBEntry<VRRPMIBDef>
                {
                    private VrrpMIBComplianceEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                    {
                        super(mib, parent, "vrrpMIBCompliance", "1.3.6.1.2.1.68.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class VrrpMIBGroupsEnt extends MIBEntry<VRRPMIBDef>
            {
                /** ...................................................................Conformance Groups...................................................................*/
                public final VrrpOperGroupEnt vrrpOperGroup;

                public final VrrpStatsGroupEnt vrrpStatsGroup;

                public final VrrpTrapGroupEnt vrrpTrapGroup;

                public final VrrpNotificationGroupEnt vrrpNotificationGroup;

                private VrrpMIBGroupsEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                {
                    super(mib, parent, "vrrpMIBGroups", "1.3.6.1.2.1.68.3.2", false, false, false, false);
                    this.vrrpOperGroup = new VrrpOperGroupEnt(mib, this);
                    this.vrrpStatsGroup = new VrrpStatsGroupEnt(mib, this);
                    this.vrrpTrapGroup = new VrrpTrapGroupEnt(mib, this);
                    this.vrrpNotificationGroup = new VrrpNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vrrpOperGroup,
                        this.vrrpStatsGroup,
                        this.vrrpTrapGroup,
                        this.vrrpNotificationGroup
                    };
                }
                public static final class VrrpOperGroupEnt extends MIBEntry<VRRPMIBDef>
                {
                    private VrrpOperGroupEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                    {
                        super(mib, parent, "vrrpOperGroup", "1.3.6.1.2.1.68.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VrrpStatsGroupEnt extends MIBEntry<VRRPMIBDef>
                {
                    private VrrpStatsGroupEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                    {
                        super(mib, parent, "vrrpStatsGroup", "1.3.6.1.2.1.68.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VrrpTrapGroupEnt extends MIBEntry<VRRPMIBDef>
                {
                    private VrrpTrapGroupEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                    {
                        super(mib, parent, "vrrpTrapGroup", "1.3.6.1.2.1.68.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VrrpNotificationGroupEnt extends MIBEntry<VRRPMIBDef>
                {
                    private VrrpNotificationGroupEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                    {
                        super(mib, parent, "vrrpNotificationGroup", "1.3.6.1.2.1.68.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class VrrpNotificationsEnt extends MIBEntry<VRRPMIBDef>
        {
            public final VrrpTrapNewMasterEnt vrrpTrapNewMaster;

            public final VrrpTrapAuthFailureEnt vrrpTrapAuthFailure;

            private VrrpNotificationsEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
            {
                super(mib, parent, "vrrpNotifications", "1.3.6.1.2.1.68.0", false, false, false, false);
                this.vrrpTrapNewMaster = new VrrpTrapNewMasterEnt(mib, this);
                this.vrrpTrapAuthFailure = new VrrpTrapAuthFailureEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.vrrpTrapNewMaster,
                    this.vrrpTrapAuthFailure
                };
            }
            public static final class VrrpTrapNewMasterEnt extends MIBEntry<VRRPMIBDef>
            {
                private VrrpTrapNewMasterEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                {
                    super(mib, parent, "vrrpTrapNewMaster", "1.3.6.1.2.1.68.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class VrrpTrapAuthFailureEnt extends MIBEntry<VRRPMIBDef>
            {
                private VrrpTrapAuthFailureEnt(VRRPMIBDef mib, MIBEntry<VRRPMIBDef> parent)
                {
                    super(mib, parent, "vrrpTrapAuthFailure", "1.3.6.1.2.1.68.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
