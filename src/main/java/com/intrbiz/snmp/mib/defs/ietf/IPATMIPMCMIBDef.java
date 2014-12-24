package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class IPATMIPMCMIBDef extends MIB
{
    public static final IPATMIPMCMIBDef IPATMIPMCMIB = new IPATMIPMCMIBDef();

    /** 15 April 1998*/
    public final MarsMIBEnt marsMIB;

    private IPATMIPMCMIBDef()
    {
        super("IPATM-IPMC-MIB");
        this.marsMIB = new MarsMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.marsMIB
        };
    }

    public static final class MarsMIBEnt extends MIBEntry<IPATMIPMCMIBDef>
    {
        /** ***************************************************************IP ATM MARS Client Object Definitions****************************************************************/
        public final MarsClientObjectsEnt marsClientObjects;

        /** ***************************************************************IP ATM MARS Object Definitions****************************************************************/
        public final MarsObjectsEnt marsObjects;

        /** ***************************************************************IP ATM MARS MCS Object Definitions****************************************************************/
        public final MarsMcsObjectsEnt marsMcsObjects;

        /** ***************************************************************IP ATM MARS Notification Definitions****************************************************************/
        public final MarsTrapInfoEnt marsTrapInfo;

        /** ***************************************************************IP ATM MARS Conformance Definitions****************************************************************/
        public final MarsConformanceEnt marsConformance;

        private MarsMIBEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
        {
            super(mib, parent, "marsMIB", "1.3.6.1.6.3.17", false, false, false, false);
            this.marsClientObjects = new MarsClientObjectsEnt(mib, this);
            this.marsObjects = new MarsObjectsEnt(mib, this);
            this.marsMcsObjects = new MarsMcsObjectsEnt(mib, this);
            this.marsTrapInfo = new MarsTrapInfoEnt(mib, this);
            this.marsConformance = new MarsConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.marsClientObjects,
                this.marsObjects,
                this.marsMcsObjects,
                this.marsTrapInfo,
                this.marsConformance
            };
        }
        public static final class MarsClientObjectsEnt extends MIBEntry<IPATMIPMCMIBDef>
        {
            public final MarsClientTableEnt marsClientTable;

            /** ****************************************************************IP ATM MARS Client Multicast Group Address Object Definitions*****************************************************************/
            public final MarsClientMcGrpTableEnt marsClientMcGrpTable;

            /** ****************************************************************IP ATM MARS Client Backup MARS Object Definitions*****************************************************************/
            public final MarsClientBackupMarsTableEnt marsClientBackupMarsTable;

            /** ***************************************************************IP ATM MARS Client VC Object Definition Table****************************************************************/
            public final MarsClientVcTableEnt marsClientVcTable;

            /** ***************************************************************IP ATM MARS Client Statistic Object Definition Table****************************************************************/
            public final MarsClientStatTableEnt marsClientStatTable;

            private MarsClientObjectsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
            {
                super(mib, parent, "marsClientObjects", "1.3.6.1.6.3.17.1", false, false, false, false);
                this.marsClientTable = new MarsClientTableEnt(mib, this);
                this.marsClientMcGrpTable = new MarsClientMcGrpTableEnt(mib, this);
                this.marsClientBackupMarsTable = new MarsClientBackupMarsTableEnt(mib, this);
                this.marsClientVcTable = new MarsClientVcTableEnt(mib, this);
                this.marsClientStatTable = new MarsClientStatTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.marsClientTable,
                    this.marsClientMcGrpTable,
                    this.marsClientBackupMarsTable,
                    this.marsClientVcTable,
                    this.marsClientStatTable
                };
            }
            public static final class MarsClientTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsClientEntryEnt marsClientEntry;

                private MarsClientTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsClientTable", "1.3.6.1.6.3.17.1.1", false, true, false, false);
                    this.marsClientEntry = new MarsClientEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsClientEntry
                    };
                }
                public static final class MarsClientEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsClientIndexEnt marsClientIndex;

                    public final MarsClientAddrEnt marsClientAddr;

                    public final MarsClientDefaultMarsAddrEnt marsClientDefaultMarsAddr;

                    public final MarsClientHsnEnt marsClientHsn;

                    public final MarsClientRegistrationEnt marsClientRegistration;

                    public final MarsClientCmiEnt marsClientCmi;

                    public final MarsClientDefaultMtuEnt marsClientDefaultMtu;

                    public final MarsClientFailureTimerEnt marsClientFailureTimer;

                    public final MarsClientRetranDelayTimerEnt marsClientRetranDelayTimer;

                    public final MarsClientRdmMulReqAddRetrTimerEnt marsClientRdmMulReqAddRetrTimer;

                    public final MarsClientRdmVcRevalidateTimerEnt marsClientRdmVcRevalidateTimer;

                    public final MarsClientJoinLeaveRetrIntervalEnt marsClientJoinLeaveRetrInterval;

                    public final MarsClientJoinLeaveRetrLimitEnt marsClientJoinLeaveRetrLimit;

                    public final MarsClientRegWithMarsRdmTimerEnt marsClientRegWithMarsRdmTimer;

                    public final MarsClientForceWaitTimerEnt marsClientForceWaitTimer;

                    public final MarsClientLmtToMissRedirMapTimerEnt marsClientLmtToMissRedirMapTimer;

                    public final MarsClientIdleTimerEnt marsClientIdleTimer;

                    public final MarsClientRowStatusEnt marsClientRowStatus;

                    private MarsClientEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsClientEntry", "1.3.6.1.6.3.17.1.1.1", false, false, false, true);
                        this.marsClientIndex = new MarsClientIndexEnt(mib, this);
                        this.marsClientAddr = new MarsClientAddrEnt(mib, this);
                        this.marsClientDefaultMarsAddr = new MarsClientDefaultMarsAddrEnt(mib, this);
                        this.marsClientHsn = new MarsClientHsnEnt(mib, this);
                        this.marsClientRegistration = new MarsClientRegistrationEnt(mib, this);
                        this.marsClientCmi = new MarsClientCmiEnt(mib, this);
                        this.marsClientDefaultMtu = new MarsClientDefaultMtuEnt(mib, this);
                        this.marsClientFailureTimer = new MarsClientFailureTimerEnt(mib, this);
                        this.marsClientRetranDelayTimer = new MarsClientRetranDelayTimerEnt(mib, this);
                        this.marsClientRdmMulReqAddRetrTimer = new MarsClientRdmMulReqAddRetrTimerEnt(mib, this);
                        this.marsClientRdmVcRevalidateTimer = new MarsClientRdmVcRevalidateTimerEnt(mib, this);
                        this.marsClientJoinLeaveRetrInterval = new MarsClientJoinLeaveRetrIntervalEnt(mib, this);
                        this.marsClientJoinLeaveRetrLimit = new MarsClientJoinLeaveRetrLimitEnt(mib, this);
                        this.marsClientRegWithMarsRdmTimer = new MarsClientRegWithMarsRdmTimerEnt(mib, this);
                        this.marsClientForceWaitTimer = new MarsClientForceWaitTimerEnt(mib, this);
                        this.marsClientLmtToMissRedirMapTimer = new MarsClientLmtToMissRedirMapTimerEnt(mib, this);
                        this.marsClientIdleTimer = new MarsClientIdleTimerEnt(mib, this);
                        this.marsClientRowStatus = new MarsClientRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsClientIndex,
                            this.marsClientAddr,
                            this.marsClientDefaultMarsAddr,
                            this.marsClientHsn,
                            this.marsClientRegistration,
                            this.marsClientCmi,
                            this.marsClientDefaultMtu,
                            this.marsClientFailureTimer,
                            this.marsClientRetranDelayTimer,
                            this.marsClientRdmMulReqAddRetrTimer,
                            this.marsClientRdmVcRevalidateTimer,
                            this.marsClientJoinLeaveRetrInterval,
                            this.marsClientJoinLeaveRetrLimit,
                            this.marsClientRegWithMarsRdmTimer,
                            this.marsClientForceWaitTimer,
                            this.marsClientLmtToMissRedirMapTimer,
                            this.marsClientIdleTimer,
                            this.marsClientRowStatus
                        };
                    }
                    public static final class MarsClientIndexEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientIndexEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientIndex", "1.3.6.1.6.3.17.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientAddr", "1.3.6.1.6.3.17.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientDefaultMarsAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientDefaultMarsAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientDefaultMarsAddr", "1.3.6.1.6.3.17.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientHsnEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientHsnEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientHsn", "1.3.6.1.6.3.17.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientRegistrationEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientRegistrationEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientRegistration", "1.3.6.1.6.3.17.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientCmiEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientCmiEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientCmi", "1.3.6.1.6.3.17.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientDefaultMtuEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientDefaultMtuEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientDefaultMtu", "1.3.6.1.6.3.17.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientFailureTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientFailureTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientFailureTimer", "1.3.6.1.6.3.17.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientRetranDelayTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientRetranDelayTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientRetranDelayTimer", "1.3.6.1.6.3.17.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientRdmMulReqAddRetrTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientRdmMulReqAddRetrTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientRdmMulReqAddRetrTimer", "1.3.6.1.6.3.17.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientRdmVcRevalidateTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientRdmVcRevalidateTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientRdmVcRevalidateTimer", "1.3.6.1.6.3.17.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientJoinLeaveRetrIntervalEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientJoinLeaveRetrIntervalEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientJoinLeaveRetrInterval", "1.3.6.1.6.3.17.1.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientJoinLeaveRetrLimitEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientJoinLeaveRetrLimitEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientJoinLeaveRetrLimit", "1.3.6.1.6.3.17.1.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientRegWithMarsRdmTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientRegWithMarsRdmTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientRegWithMarsRdmTimer", "1.3.6.1.6.3.17.1.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientForceWaitTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientForceWaitTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientForceWaitTimer", "1.3.6.1.6.3.17.1.1.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientLmtToMissRedirMapTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientLmtToMissRedirMapTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientLmtToMissRedirMapTimer", "1.3.6.1.6.3.17.1.1.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientIdleTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientIdleTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientIdleTimer", "1.3.6.1.6.3.17.1.1.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientRowStatusEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientRowStatusEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientRowStatus", "1.3.6.1.6.3.17.1.1.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MarsClientMcGrpTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsClientMcGrpEntryEnt marsClientMcGrpEntry;

                private MarsClientMcGrpTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsClientMcGrpTable", "1.3.6.1.6.3.17.1.2", false, true, false, false);
                    this.marsClientMcGrpEntry = new MarsClientMcGrpEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsClientMcGrpEntry
                    };
                }
                public static final class MarsClientMcGrpEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsClientMcMinGrpAddrEnt marsClientMcMinGrpAddr;

                    public final MarsClientMcMaxGrpAddrEnt marsClientMcMaxGrpAddr;

                    public final MarsClientMcGrpRowStatusEnt marsClientMcGrpRowStatus;

                    private MarsClientMcGrpEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsClientMcGrpEntry", "1.3.6.1.6.3.17.1.2.1", false, false, false, true);
                        this.marsClientMcMinGrpAddr = new MarsClientMcMinGrpAddrEnt(mib, this);
                        this.marsClientMcMaxGrpAddr = new MarsClientMcMaxGrpAddrEnt(mib, this);
                        this.marsClientMcGrpRowStatus = new MarsClientMcGrpRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsClientMcMinGrpAddr,
                            this.marsClientMcMaxGrpAddr,
                            this.marsClientMcGrpRowStatus
                        };
                    }
                    public static final class MarsClientMcMinGrpAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientMcMinGrpAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientMcMinGrpAddr", "1.3.6.1.6.3.17.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientMcMaxGrpAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientMcMaxGrpAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientMcMaxGrpAddr", "1.3.6.1.6.3.17.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientMcGrpRowStatusEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientMcGrpRowStatusEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientMcGrpRowStatus", "1.3.6.1.6.3.17.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MarsClientBackupMarsTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsClientBackupMarsEntryEnt marsClientBackupMarsEntry;

                private MarsClientBackupMarsTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsClientBackupMarsTable", "1.3.6.1.6.3.17.1.3", false, true, false, false);
                    this.marsClientBackupMarsEntry = new MarsClientBackupMarsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsClientBackupMarsEntry
                    };
                }
                public static final class MarsClientBackupMarsEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsClientBackupMarsPriorityEnt marsClientBackupMarsPriority;

                    public final MarsClientBackupMarsAddrEnt marsClientBackupMarsAddr;

                    public final MarsClientBackupMarsRowStatusEnt marsClientBackupMarsRowStatus;

                    private MarsClientBackupMarsEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsClientBackupMarsEntry", "1.3.6.1.6.3.17.1.3.1", false, false, false, true);
                        this.marsClientBackupMarsPriority = new MarsClientBackupMarsPriorityEnt(mib, this);
                        this.marsClientBackupMarsAddr = new MarsClientBackupMarsAddrEnt(mib, this);
                        this.marsClientBackupMarsRowStatus = new MarsClientBackupMarsRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsClientBackupMarsPriority,
                            this.marsClientBackupMarsAddr,
                            this.marsClientBackupMarsRowStatus
                        };
                    }
                    public static final class MarsClientBackupMarsPriorityEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientBackupMarsPriorityEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientBackupMarsPriority", "1.3.6.1.6.3.17.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientBackupMarsAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientBackupMarsAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientBackupMarsAddr", "1.3.6.1.6.3.17.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientBackupMarsRowStatusEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientBackupMarsRowStatusEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientBackupMarsRowStatus", "1.3.6.1.6.3.17.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MarsClientVcTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsClientVcEntryEnt marsClientVcEntry;

                private MarsClientVcTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsClientVcTable", "1.3.6.1.6.3.17.1.4", false, true, false, false);
                    this.marsClientVcEntry = new MarsClientVcEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsClientVcEntry
                    };
                }
                public static final class MarsClientVcEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsClientVcVpiEnt marsClientVcVpi;

                    public final MarsClientVcVciEnt marsClientVcVci;

                    public final MarsClientVcMinGrpAddrEnt marsClientVcMinGrpAddr;

                    public final MarsClientVcMaxGrpAddrEnt marsClientVcMaxGrpAddr;

                    public final MarsClientVcPartyAddrEnt marsClientVcPartyAddr;

                    public final MarsClientVcPartyAddrTypeEnt marsClientVcPartyAddrType;

                    public final MarsClientVcTypeEnt marsClientVcType;

                    public final MarsClientVcCtrlTypeEnt marsClientVcCtrlType;

                    public final MarsClientVcIdleTimerEnt marsClientVcIdleTimer;

                    public final MarsClientVcRevalidateEnt marsClientVcRevalidate;

                    public final MarsClientVcEncapsTypeEnt marsClientVcEncapsType;

                    public final MarsClientVcNegotiatedMtuEnt marsClientVcNegotiatedMtu;

                    public final MarsClientVcRowStatusEnt marsClientVcRowStatus;

                    private MarsClientVcEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsClientVcEntry", "1.3.6.1.6.3.17.1.4.1", false, false, false, true);
                        this.marsClientVcVpi = new MarsClientVcVpiEnt(mib, this);
                        this.marsClientVcVci = new MarsClientVcVciEnt(mib, this);
                        this.marsClientVcMinGrpAddr = new MarsClientVcMinGrpAddrEnt(mib, this);
                        this.marsClientVcMaxGrpAddr = new MarsClientVcMaxGrpAddrEnt(mib, this);
                        this.marsClientVcPartyAddr = new MarsClientVcPartyAddrEnt(mib, this);
                        this.marsClientVcPartyAddrType = new MarsClientVcPartyAddrTypeEnt(mib, this);
                        this.marsClientVcType = new MarsClientVcTypeEnt(mib, this);
                        this.marsClientVcCtrlType = new MarsClientVcCtrlTypeEnt(mib, this);
                        this.marsClientVcIdleTimer = new MarsClientVcIdleTimerEnt(mib, this);
                        this.marsClientVcRevalidate = new MarsClientVcRevalidateEnt(mib, this);
                        this.marsClientVcEncapsType = new MarsClientVcEncapsTypeEnt(mib, this);
                        this.marsClientVcNegotiatedMtu = new MarsClientVcNegotiatedMtuEnt(mib, this);
                        this.marsClientVcRowStatus = new MarsClientVcRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsClientVcVpi,
                            this.marsClientVcVci,
                            this.marsClientVcMinGrpAddr,
                            this.marsClientVcMaxGrpAddr,
                            this.marsClientVcPartyAddr,
                            this.marsClientVcPartyAddrType,
                            this.marsClientVcType,
                            this.marsClientVcCtrlType,
                            this.marsClientVcIdleTimer,
                            this.marsClientVcRevalidate,
                            this.marsClientVcEncapsType,
                            this.marsClientVcNegotiatedMtu,
                            this.marsClientVcRowStatus
                        };
                    }
                    public static final class MarsClientVcVpiEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientVcVpiEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientVcVpi", "1.3.6.1.6.3.17.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientVcVciEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientVcVciEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientVcVci", "1.3.6.1.6.3.17.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientVcMinGrpAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientVcMinGrpAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientVcMinGrpAddr", "1.3.6.1.6.3.17.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientVcMaxGrpAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientVcMaxGrpAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientVcMaxGrpAddr", "1.3.6.1.6.3.17.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientVcPartyAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientVcPartyAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientVcPartyAddr", "1.3.6.1.6.3.17.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientVcPartyAddrTypeEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientVcPartyAddrTypeEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientVcPartyAddrType", "1.3.6.1.6.3.17.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientVcTypeEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientVcTypeEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientVcType", "1.3.6.1.6.3.17.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientVcCtrlTypeEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientVcCtrlTypeEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientVcCtrlType", "1.3.6.1.6.3.17.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientVcIdleTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientVcIdleTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientVcIdleTimer", "1.3.6.1.6.3.17.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientVcRevalidateEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientVcRevalidateEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientVcRevalidate", "1.3.6.1.6.3.17.1.4.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientVcEncapsTypeEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientVcEncapsTypeEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientVcEncapsType", "1.3.6.1.6.3.17.1.4.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientVcNegotiatedMtuEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientVcNegotiatedMtuEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientVcNegotiatedMtu", "1.3.6.1.6.3.17.1.4.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientVcRowStatusEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientVcRowStatusEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientVcRowStatus", "1.3.6.1.6.3.17.1.4.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MarsClientStatTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsClientStatEntryEnt marsClientStatEntry;

                private MarsClientStatTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsClientStatTable", "1.3.6.1.6.3.17.1.5", false, true, false, false);
                    this.marsClientStatEntry = new MarsClientStatEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsClientStatEntry
                    };
                }
                public static final class MarsClientStatEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsClientStatTxReqMsgsEnt marsClientStatTxReqMsgs;

                    public final MarsClientStatTxJoinMsgsEnt marsClientStatTxJoinMsgs;

                    public final MarsClientStatTxLeaveMsgsEnt marsClientStatTxLeaveMsgs;

                    public final MarsClientStatTxGrpLstReqMsgsEnt marsClientStatTxGrpLstReqMsgs;

                    public final MarsClientStatRxJoinMsgsEnt marsClientStatRxJoinMsgs;

                    public final MarsClientStatRxLeaveMsgsEnt marsClientStatRxLeaveMsgs;

                    public final MarsClientStatRxMultiMsgsEnt marsClientStatRxMultiMsgs;

                    public final MarsClientStatRxNakMsgsEnt marsClientStatRxNakMsgs;

                    public final MarsClientStatRxMigrateMsgsEnt marsClientStatRxMigrateMsgs;

                    public final MarsClientStatRxGrpLstRplyMsgsEnt marsClientStatRxGrpLstRplyMsgs;

                    public final MarsClientStatFailMultiMsgsEnt marsClientStatFailMultiMsgs;

                    private MarsClientStatEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsClientStatEntry", "1.3.6.1.6.3.17.1.5.1", false, false, false, true);
                        this.marsClientStatTxReqMsgs = new MarsClientStatTxReqMsgsEnt(mib, this);
                        this.marsClientStatTxJoinMsgs = new MarsClientStatTxJoinMsgsEnt(mib, this);
                        this.marsClientStatTxLeaveMsgs = new MarsClientStatTxLeaveMsgsEnt(mib, this);
                        this.marsClientStatTxGrpLstReqMsgs = new MarsClientStatTxGrpLstReqMsgsEnt(mib, this);
                        this.marsClientStatRxJoinMsgs = new MarsClientStatRxJoinMsgsEnt(mib, this);
                        this.marsClientStatRxLeaveMsgs = new MarsClientStatRxLeaveMsgsEnt(mib, this);
                        this.marsClientStatRxMultiMsgs = new MarsClientStatRxMultiMsgsEnt(mib, this);
                        this.marsClientStatRxNakMsgs = new MarsClientStatRxNakMsgsEnt(mib, this);
                        this.marsClientStatRxMigrateMsgs = new MarsClientStatRxMigrateMsgsEnt(mib, this);
                        this.marsClientStatRxGrpLstRplyMsgs = new MarsClientStatRxGrpLstRplyMsgsEnt(mib, this);
                        this.marsClientStatFailMultiMsgs = new MarsClientStatFailMultiMsgsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsClientStatTxReqMsgs,
                            this.marsClientStatTxJoinMsgs,
                            this.marsClientStatTxLeaveMsgs,
                            this.marsClientStatTxGrpLstReqMsgs,
                            this.marsClientStatRxJoinMsgs,
                            this.marsClientStatRxLeaveMsgs,
                            this.marsClientStatRxMultiMsgs,
                            this.marsClientStatRxNakMsgs,
                            this.marsClientStatRxMigrateMsgs,
                            this.marsClientStatRxGrpLstRplyMsgs,
                            this.marsClientStatFailMultiMsgs
                        };
                    }
                    public static final class MarsClientStatTxReqMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientStatTxReqMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientStatTxReqMsgs", "1.3.6.1.6.3.17.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientStatTxJoinMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientStatTxJoinMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientStatTxJoinMsgs", "1.3.6.1.6.3.17.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientStatTxLeaveMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientStatTxLeaveMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientStatTxLeaveMsgs", "1.3.6.1.6.3.17.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientStatTxGrpLstReqMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientStatTxGrpLstReqMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientStatTxGrpLstReqMsgs", "1.3.6.1.6.3.17.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientStatRxJoinMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientStatRxJoinMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientStatRxJoinMsgs", "1.3.6.1.6.3.17.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientStatRxLeaveMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientStatRxLeaveMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientStatRxLeaveMsgs", "1.3.6.1.6.3.17.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientStatRxMultiMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientStatRxMultiMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientStatRxMultiMsgs", "1.3.6.1.6.3.17.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientStatRxNakMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientStatRxNakMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientStatRxNakMsgs", "1.3.6.1.6.3.17.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientStatRxMigrateMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientStatRxMigrateMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientStatRxMigrateMsgs", "1.3.6.1.6.3.17.1.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientStatRxGrpLstRplyMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientStatRxGrpLstRplyMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientStatRxGrpLstRplyMsgs", "1.3.6.1.6.3.17.1.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsClientStatFailMultiMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientStatFailMultiMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientStatFailMultiMsgs", "1.3.6.1.6.3.17.1.5.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class MarsObjectsEnt extends MIBEntry<IPATMIPMCMIBDef>
        {
            public final MarsTableEnt marsTable;

            /** ****************************************************************IP ATM MARS Multicast Group Address Object Definitions*****************************************************************/
            public final MarsMcGrpTableEnt marsMcGrpTable;

            /** ***************************************************************IP ATM MARS Host Map Object Definitions****************************************************************/
            public final MarsHostMapTableEnt marsHostMapTable;

            /** ***************************************************************IP ATM MARS Server Map Object Definitions****************************************************************/
            public final MarsServerMapTableEnt marsServerMapTable;

            /** ***************************************************************IP ATM MARS VC Object Definition Table****************************************************************/
            public final MarsVcTableEnt marsVcTable;

            /** ***************************************************************IP ATM MARS Registered Cluster Member List Table****************************************************************/
            public final MarsRegClientTableEnt marsRegClientTable;

            /** ***************************************************************IP ATM MARS Registered Server Member List Table****************************************************************/
            public final MarsRegMcsTableEnt marsRegMcsTable;

            /** ***************************************************************IP ATM MARS Statistics Object Definition Table****************************************************************/
            public final MarsStatTableEnt marsStatTable;

            private MarsObjectsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
            {
                super(mib, parent, "marsObjects", "1.3.6.1.6.3.17.2", false, false, false, false);
                this.marsTable = new MarsTableEnt(mib, this);
                this.marsMcGrpTable = new MarsMcGrpTableEnt(mib, this);
                this.marsHostMapTable = new MarsHostMapTableEnt(mib, this);
                this.marsServerMapTable = new MarsServerMapTableEnt(mib, this);
                this.marsVcTable = new MarsVcTableEnt(mib, this);
                this.marsRegClientTable = new MarsRegClientTableEnt(mib, this);
                this.marsRegMcsTable = new MarsRegMcsTableEnt(mib, this);
                this.marsStatTable = new MarsStatTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.marsTable,
                    this.marsMcGrpTable,
                    this.marsHostMapTable,
                    this.marsServerMapTable,
                    this.marsVcTable,
                    this.marsRegClientTable,
                    this.marsRegMcsTable,
                    this.marsStatTable
                };
            }
            public static final class MarsTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsEntryEnt marsEntry;

                private MarsTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsTable", "1.3.6.1.6.3.17.2.1", false, true, false, false);
                    this.marsEntry = new MarsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsEntry
                    };
                }
                public static final class MarsEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsIndexEnt marsIndex;

                    public final MarsIfIndexEnt marsIfIndex;

                    public final MarsAddrEnt marsAddr;

                    public final MarsLocalEnt marsLocal;

                    public final MarsServStatusEnt marsServStatus;

                    public final MarsServTypeEnt marsServType;

                    public final MarsServPriorityEnt marsServPriority;

                    public final MarsRedirMapMsgTimerEnt marsRedirMapMsgTimer;

                    public final MarsCsnEnt marsCsn;

                    public final MarsSsnEnt marsSsn;

                    public final MarsRowStatusEnt marsRowStatus;

                    private MarsEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsEntry", "1.3.6.1.6.3.17.2.1.1", false, false, false, true);
                        this.marsIndex = new MarsIndexEnt(mib, this);
                        this.marsIfIndex = new MarsIfIndexEnt(mib, this);
                        this.marsAddr = new MarsAddrEnt(mib, this);
                        this.marsLocal = new MarsLocalEnt(mib, this);
                        this.marsServStatus = new MarsServStatusEnt(mib, this);
                        this.marsServType = new MarsServTypeEnt(mib, this);
                        this.marsServPriority = new MarsServPriorityEnt(mib, this);
                        this.marsRedirMapMsgTimer = new MarsRedirMapMsgTimerEnt(mib, this);
                        this.marsCsn = new MarsCsnEnt(mib, this);
                        this.marsSsn = new MarsSsnEnt(mib, this);
                        this.marsRowStatus = new MarsRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsIndex,
                            this.marsIfIndex,
                            this.marsAddr,
                            this.marsLocal,
                            this.marsServStatus,
                            this.marsServType,
                            this.marsServPriority,
                            this.marsRedirMapMsgTimer,
                            this.marsCsn,
                            this.marsSsn,
                            this.marsRowStatus
                        };
                    }
                    public static final class MarsIndexEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsIndexEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsIndex", "1.3.6.1.6.3.17.2.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsIfIndexEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsIfIndexEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsIfIndex", "1.3.6.1.6.3.17.2.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsAddr", "1.3.6.1.6.3.17.2.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsLocalEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsLocalEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsLocal", "1.3.6.1.6.3.17.2.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsServStatusEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsServStatusEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsServStatus", "1.3.6.1.6.3.17.2.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsServTypeEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsServTypeEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsServType", "1.3.6.1.6.3.17.2.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsServPriorityEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsServPriorityEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsServPriority", "1.3.6.1.6.3.17.2.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsRedirMapMsgTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsRedirMapMsgTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsRedirMapMsgTimer", "1.3.6.1.6.3.17.2.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsCsnEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsCsnEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsCsn", "1.3.6.1.6.3.17.2.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsSsnEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsSsnEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsSsn", "1.3.6.1.6.3.17.2.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsRowStatusEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsRowStatusEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsRowStatus", "1.3.6.1.6.3.17.2.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MarsMcGrpTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsMcGrpEntryEnt marsMcGrpEntry;

                private MarsMcGrpTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsMcGrpTable", "1.3.6.1.6.3.17.2.2", false, true, false, false);
                    this.marsMcGrpEntry = new MarsMcGrpEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsMcGrpEntry
                    };
                }
                public static final class MarsMcGrpEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsMcMinGrpAddrEnt marsMcMinGrpAddr;

                    public final MarsMcMaxGrpAddrEnt marsMcMaxGrpAddr;

                    public final MarsMcGrpAddrUsageEnt marsMcGrpAddrUsage;

                    public final MarsMcGrpRxLayer3GrpSetsEnt marsMcGrpRxLayer3GrpSets;

                    public final MarsMcGrpRxLayer3GrpResetsEnt marsMcGrpRxLayer3GrpResets;

                    public final MarsMcGrpRowStatusEnt marsMcGrpRowStatus;

                    private MarsMcGrpEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsMcGrpEntry", "1.3.6.1.6.3.17.2.2.1", false, false, false, true);
                        this.marsMcMinGrpAddr = new MarsMcMinGrpAddrEnt(mib, this);
                        this.marsMcMaxGrpAddr = new MarsMcMaxGrpAddrEnt(mib, this);
                        this.marsMcGrpAddrUsage = new MarsMcGrpAddrUsageEnt(mib, this);
                        this.marsMcGrpRxLayer3GrpSets = new MarsMcGrpRxLayer3GrpSetsEnt(mib, this);
                        this.marsMcGrpRxLayer3GrpResets = new MarsMcGrpRxLayer3GrpResetsEnt(mib, this);
                        this.marsMcGrpRowStatus = new MarsMcGrpRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsMcMinGrpAddr,
                            this.marsMcMaxGrpAddr,
                            this.marsMcGrpAddrUsage,
                            this.marsMcGrpRxLayer3GrpSets,
                            this.marsMcGrpRxLayer3GrpResets,
                            this.marsMcGrpRowStatus
                        };
                    }
                    public static final class MarsMcMinGrpAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcMinGrpAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcMinGrpAddr", "1.3.6.1.6.3.17.2.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcMaxGrpAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcMaxGrpAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcMaxGrpAddr", "1.3.6.1.6.3.17.2.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcGrpAddrUsageEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcGrpAddrUsageEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcGrpAddrUsage", "1.3.6.1.6.3.17.2.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcGrpRxLayer3GrpSetsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcGrpRxLayer3GrpSetsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcGrpRxLayer3GrpSets", "1.3.6.1.6.3.17.2.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcGrpRxLayer3GrpResetsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcGrpRxLayer3GrpResetsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcGrpRxLayer3GrpResets", "1.3.6.1.6.3.17.2.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcGrpRowStatusEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcGrpRowStatusEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcGrpRowStatus", "1.3.6.1.6.3.17.2.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MarsHostMapTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsHostMapEntryEnt marsHostMapEntry;

                private MarsHostMapTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsHostMapTable", "1.3.6.1.6.3.17.2.3", false, true, false, false);
                    this.marsHostMapEntry = new MarsHostMapEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsHostMapEntry
                    };
                }
                public static final class MarsHostMapEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsHostMapAtmAddrEnt marsHostMapAtmAddr;

                    public final MarsHostMapRowTypeEnt marsHostMapRowType;

                    public final MarsHostMapRowStatusEnt marsHostMapRowStatus;

                    private MarsHostMapEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsHostMapEntry", "1.3.6.1.6.3.17.2.3.1", false, false, false, true);
                        this.marsHostMapAtmAddr = new MarsHostMapAtmAddrEnt(mib, this);
                        this.marsHostMapRowType = new MarsHostMapRowTypeEnt(mib, this);
                        this.marsHostMapRowStatus = new MarsHostMapRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsHostMapAtmAddr,
                            this.marsHostMapRowType,
                            this.marsHostMapRowStatus
                        };
                    }
                    public static final class MarsHostMapAtmAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsHostMapAtmAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsHostMapAtmAddr", "1.3.6.1.6.3.17.2.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsHostMapRowTypeEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsHostMapRowTypeEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsHostMapRowType", "1.3.6.1.6.3.17.2.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsHostMapRowStatusEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsHostMapRowStatusEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsHostMapRowStatus", "1.3.6.1.6.3.17.2.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MarsServerMapTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsServerMapEntryEnt marsServerMapEntry;

                private MarsServerMapTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsServerMapTable", "1.3.6.1.6.3.17.2.4", false, true, false, false);
                    this.marsServerMapEntry = new MarsServerMapEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsServerMapEntry
                    };
                }
                public static final class MarsServerMapEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsServerMapAtmAddrEnt marsServerMapAtmAddr;

                    public final MarsServerMapRowTypeEnt marsServerMapRowType;

                    public final MarsServerMapRowStatusEnt marsServerMapRowStatus;

                    private MarsServerMapEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsServerMapEntry", "1.3.6.1.6.3.17.2.4.1", false, false, false, true);
                        this.marsServerMapAtmAddr = new MarsServerMapAtmAddrEnt(mib, this);
                        this.marsServerMapRowType = new MarsServerMapRowTypeEnt(mib, this);
                        this.marsServerMapRowStatus = new MarsServerMapRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsServerMapAtmAddr,
                            this.marsServerMapRowType,
                            this.marsServerMapRowStatus
                        };
                    }
                    public static final class MarsServerMapAtmAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsServerMapAtmAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsServerMapAtmAddr", "1.3.6.1.6.3.17.2.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsServerMapRowTypeEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsServerMapRowTypeEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsServerMapRowType", "1.3.6.1.6.3.17.2.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsServerMapRowStatusEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsServerMapRowStatusEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsServerMapRowStatus", "1.3.6.1.6.3.17.2.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MarsVcTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsVcEntryEnt marsVcEntry;

                private MarsVcTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsVcTable", "1.3.6.1.6.3.17.2.5", false, true, false, false);
                    this.marsVcEntry = new MarsVcEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsVcEntry
                    };
                }
                public static final class MarsVcEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsVcVpiEnt marsVcVpi;

                    public final MarsVcVciEnt marsVcVci;

                    public final MarsVcPartyAddrEnt marsVcPartyAddr;

                    public final MarsVcPartyAddrTypeEnt marsVcPartyAddrType;

                    public final MarsVcTypeEnt marsVcType;

                    public final MarsVcCtrlTypeEnt marsVcCtrlType;

                    public final MarsVcIdleTimerEnt marsVcIdleTimer;

                    public final MarsVcCmiEnt marsVcCmi;

                    public final MarsVcEncapsTypeEnt marsVcEncapsType;

                    public final MarsVcNegotiatedMtuEnt marsVcNegotiatedMtu;

                    public final MarsVcRowStatusEnt marsVcRowStatus;

                    private MarsVcEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsVcEntry", "1.3.6.1.6.3.17.2.5.1", false, false, false, true);
                        this.marsVcVpi = new MarsVcVpiEnt(mib, this);
                        this.marsVcVci = new MarsVcVciEnt(mib, this);
                        this.marsVcPartyAddr = new MarsVcPartyAddrEnt(mib, this);
                        this.marsVcPartyAddrType = new MarsVcPartyAddrTypeEnt(mib, this);
                        this.marsVcType = new MarsVcTypeEnt(mib, this);
                        this.marsVcCtrlType = new MarsVcCtrlTypeEnt(mib, this);
                        this.marsVcIdleTimer = new MarsVcIdleTimerEnt(mib, this);
                        this.marsVcCmi = new MarsVcCmiEnt(mib, this);
                        this.marsVcEncapsType = new MarsVcEncapsTypeEnt(mib, this);
                        this.marsVcNegotiatedMtu = new MarsVcNegotiatedMtuEnt(mib, this);
                        this.marsVcRowStatus = new MarsVcRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsVcVpi,
                            this.marsVcVci,
                            this.marsVcPartyAddr,
                            this.marsVcPartyAddrType,
                            this.marsVcType,
                            this.marsVcCtrlType,
                            this.marsVcIdleTimer,
                            this.marsVcCmi,
                            this.marsVcEncapsType,
                            this.marsVcNegotiatedMtu,
                            this.marsVcRowStatus
                        };
                    }
                    public static final class MarsVcVpiEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsVcVpiEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsVcVpi", "1.3.6.1.6.3.17.2.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsVcVciEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsVcVciEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsVcVci", "1.3.6.1.6.3.17.2.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsVcPartyAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsVcPartyAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsVcPartyAddr", "1.3.6.1.6.3.17.2.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsVcPartyAddrTypeEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsVcPartyAddrTypeEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsVcPartyAddrType", "1.3.6.1.6.3.17.2.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsVcTypeEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsVcTypeEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsVcType", "1.3.6.1.6.3.17.2.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsVcCtrlTypeEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsVcCtrlTypeEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsVcCtrlType", "1.3.6.1.6.3.17.2.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsVcIdleTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsVcIdleTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsVcIdleTimer", "1.3.6.1.6.3.17.2.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsVcCmiEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsVcCmiEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsVcCmi", "1.3.6.1.6.3.17.2.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsVcEncapsTypeEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsVcEncapsTypeEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsVcEncapsType", "1.3.6.1.6.3.17.2.5.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsVcNegotiatedMtuEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsVcNegotiatedMtuEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsVcNegotiatedMtu", "1.3.6.1.6.3.17.2.5.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsVcRowStatusEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsVcRowStatusEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsVcRowStatus", "1.3.6.1.6.3.17.2.5.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MarsRegClientTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsRegClientEntryEnt marsRegClientEntry;

                private MarsRegClientTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsRegClientTable", "1.3.6.1.6.3.17.2.6", false, true, false, false);
                    this.marsRegClientEntry = new MarsRegClientEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsRegClientEntry
                    };
                }
                public static final class MarsRegClientEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsRegClientCmiEnt marsRegClientCmi;

                    public final MarsRegClientAtmAddrEnt marsRegClientAtmAddr;

                    private MarsRegClientEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsRegClientEntry", "1.3.6.1.6.3.17.2.6.1", false, false, false, true);
                        this.marsRegClientCmi = new MarsRegClientCmiEnt(mib, this);
                        this.marsRegClientAtmAddr = new MarsRegClientAtmAddrEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsRegClientCmi,
                            this.marsRegClientAtmAddr
                        };
                    }
                    public static final class MarsRegClientCmiEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsRegClientCmiEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsRegClientCmi", "1.3.6.1.6.3.17.2.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsRegClientAtmAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsRegClientAtmAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsRegClientAtmAddr", "1.3.6.1.6.3.17.2.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MarsRegMcsTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsRegMcsEntryEnt marsRegMcsEntry;

                private MarsRegMcsTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsRegMcsTable", "1.3.6.1.6.3.17.2.7", false, true, false, false);
                    this.marsRegMcsEntry = new MarsRegMcsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsRegMcsEntry
                    };
                }
                public static final class MarsRegMcsEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsRegMcsAtmAddrEnt marsRegMcsAtmAddr;

                    private MarsRegMcsEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsRegMcsEntry", "1.3.6.1.6.3.17.2.7.1", false, false, false, true);
                        this.marsRegMcsAtmAddr = new MarsRegMcsAtmAddrEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsRegMcsAtmAddr
                        };
                    }
                    public static final class MarsRegMcsAtmAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsRegMcsAtmAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsRegMcsAtmAddr", "1.3.6.1.6.3.17.2.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MarsStatTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsStatEntryEnt marsStatEntry;

                private MarsStatTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsStatTable", "1.3.6.1.6.3.17.2.8", false, true, false, false);
                    this.marsStatEntry = new MarsStatEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsStatEntry
                    };
                }
                public static final class MarsStatEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsStatTxMultiMsgsEnt marsStatTxMultiMsgs;

                    public final MarsStatTxGrpLstRplyMsgsEnt marsStatTxGrpLstRplyMsgs;

                    public final MarsStatTxRedirectMapMsgsEnt marsStatTxRedirectMapMsgs;

                    public final MarsStatTxMigrateMsgsEnt marsStatTxMigrateMsgs;

                    public final MarsStatTxNakMsgsEnt marsStatTxNakMsgs;

                    public final MarsStatTxJoinMsgsEnt marsStatTxJoinMsgs;

                    public final MarsStatTxLeaveMsgsEnt marsStatTxLeaveMsgs;

                    public final MarsStatTxSjoinMsgsEnt marsStatTxSjoinMsgs;

                    public final MarsStatTxSleaveMsgsEnt marsStatTxSleaveMsgs;

                    public final MarsStatTxMservMsgsEnt marsStatTxMservMsgs;

                    public final MarsStatTxUnservMsgsEnt marsStatTxUnservMsgs;

                    public final MarsStatRxReqMsgsEnt marsStatRxReqMsgs;

                    public final MarsStatRxGrpLstReqMsgsEnt marsStatRxGrpLstReqMsgs;

                    public final MarsStatRxJoinMsgsEnt marsStatRxJoinMsgs;

                    public final MarsStatRxLeaveMsgsEnt marsStatRxLeaveMsgs;

                    public final MarsStatRxMservMsgsEnt marsStatRxMservMsgs;

                    public final MarsStatRxUnservMsgsEnt marsStatRxUnservMsgs;

                    public final MarsStatRxBlkJoinMsgsEnt marsStatRxBlkJoinMsgs;

                    public final MarsStatRegMemGroupsEnt marsStatRegMemGroups;

                    public final MarsStatRegMcsGroupsEnt marsStatRegMcsGroups;

                    private MarsStatEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsStatEntry", "1.3.6.1.6.3.17.2.8.1", false, false, false, true);
                        this.marsStatTxMultiMsgs = new MarsStatTxMultiMsgsEnt(mib, this);
                        this.marsStatTxGrpLstRplyMsgs = new MarsStatTxGrpLstRplyMsgsEnt(mib, this);
                        this.marsStatTxRedirectMapMsgs = new MarsStatTxRedirectMapMsgsEnt(mib, this);
                        this.marsStatTxMigrateMsgs = new MarsStatTxMigrateMsgsEnt(mib, this);
                        this.marsStatTxNakMsgs = new MarsStatTxNakMsgsEnt(mib, this);
                        this.marsStatTxJoinMsgs = new MarsStatTxJoinMsgsEnt(mib, this);
                        this.marsStatTxLeaveMsgs = new MarsStatTxLeaveMsgsEnt(mib, this);
                        this.marsStatTxSjoinMsgs = new MarsStatTxSjoinMsgsEnt(mib, this);
                        this.marsStatTxSleaveMsgs = new MarsStatTxSleaveMsgsEnt(mib, this);
                        this.marsStatTxMservMsgs = new MarsStatTxMservMsgsEnt(mib, this);
                        this.marsStatTxUnservMsgs = new MarsStatTxUnservMsgsEnt(mib, this);
                        this.marsStatRxReqMsgs = new MarsStatRxReqMsgsEnt(mib, this);
                        this.marsStatRxGrpLstReqMsgs = new MarsStatRxGrpLstReqMsgsEnt(mib, this);
                        this.marsStatRxJoinMsgs = new MarsStatRxJoinMsgsEnt(mib, this);
                        this.marsStatRxLeaveMsgs = new MarsStatRxLeaveMsgsEnt(mib, this);
                        this.marsStatRxMservMsgs = new MarsStatRxMservMsgsEnt(mib, this);
                        this.marsStatRxUnservMsgs = new MarsStatRxUnservMsgsEnt(mib, this);
                        this.marsStatRxBlkJoinMsgs = new MarsStatRxBlkJoinMsgsEnt(mib, this);
                        this.marsStatRegMemGroups = new MarsStatRegMemGroupsEnt(mib, this);
                        this.marsStatRegMcsGroups = new MarsStatRegMcsGroupsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsStatTxMultiMsgs,
                            this.marsStatTxGrpLstRplyMsgs,
                            this.marsStatTxRedirectMapMsgs,
                            this.marsStatTxMigrateMsgs,
                            this.marsStatTxNakMsgs,
                            this.marsStatTxJoinMsgs,
                            this.marsStatTxLeaveMsgs,
                            this.marsStatTxSjoinMsgs,
                            this.marsStatTxSleaveMsgs,
                            this.marsStatTxMservMsgs,
                            this.marsStatTxUnservMsgs,
                            this.marsStatRxReqMsgs,
                            this.marsStatRxGrpLstReqMsgs,
                            this.marsStatRxJoinMsgs,
                            this.marsStatRxLeaveMsgs,
                            this.marsStatRxMservMsgs,
                            this.marsStatRxUnservMsgs,
                            this.marsStatRxBlkJoinMsgs,
                            this.marsStatRegMemGroups,
                            this.marsStatRegMcsGroups
                        };
                    }
                    public static final class MarsStatTxMultiMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatTxMultiMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatTxMultiMsgs", "1.3.6.1.6.3.17.2.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatTxGrpLstRplyMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatTxGrpLstRplyMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatTxGrpLstRplyMsgs", "1.3.6.1.6.3.17.2.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatTxRedirectMapMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatTxRedirectMapMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatTxRedirectMapMsgs", "1.3.6.1.6.3.17.2.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatTxMigrateMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatTxMigrateMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatTxMigrateMsgs", "1.3.6.1.6.3.17.2.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatTxNakMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatTxNakMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatTxNakMsgs", "1.3.6.1.6.3.17.2.8.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatTxJoinMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatTxJoinMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatTxJoinMsgs", "1.3.6.1.6.3.17.2.8.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatTxLeaveMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatTxLeaveMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatTxLeaveMsgs", "1.3.6.1.6.3.17.2.8.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatTxSjoinMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatTxSjoinMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatTxSjoinMsgs", "1.3.6.1.6.3.17.2.8.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatTxSleaveMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatTxSleaveMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatTxSleaveMsgs", "1.3.6.1.6.3.17.2.8.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatTxMservMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatTxMservMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatTxMservMsgs", "1.3.6.1.6.3.17.2.8.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatTxUnservMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatTxUnservMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatTxUnservMsgs", "1.3.6.1.6.3.17.2.8.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatRxReqMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatRxReqMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatRxReqMsgs", "1.3.6.1.6.3.17.2.8.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatRxGrpLstReqMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatRxGrpLstReqMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatRxGrpLstReqMsgs", "1.3.6.1.6.3.17.2.8.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatRxJoinMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatRxJoinMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatRxJoinMsgs", "1.3.6.1.6.3.17.2.8.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatRxLeaveMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatRxLeaveMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatRxLeaveMsgs", "1.3.6.1.6.3.17.2.8.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatRxMservMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatRxMservMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatRxMservMsgs", "1.3.6.1.6.3.17.2.8.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatRxUnservMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatRxUnservMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatRxUnservMsgs", "1.3.6.1.6.3.17.2.8.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatRxBlkJoinMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatRxBlkJoinMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatRxBlkJoinMsgs", "1.3.6.1.6.3.17.2.8.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatRegMemGroupsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatRegMemGroupsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatRegMemGroups", "1.3.6.1.6.3.17.2.8.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsStatRegMcsGroupsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsStatRegMcsGroupsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsStatRegMcsGroups", "1.3.6.1.6.3.17.2.8.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class MarsMcsObjectsEnt extends MIBEntry<IPATMIPMCMIBDef>
        {
            public final MarsMcsTableEnt marsMcsTable;

            /** ****************************************************************IP ATM MARS MCS Multicast Group Address Object Definitions*****************************************************************/
            public final MarsMcsMcGrpTableEnt marsMcsMcGrpTable;

            /** ****************************************************************IP ATM MARS MCS Backup MARS Object Definitions*****************************************************************/
            public final MarsMcsBackupMarsTableEnt marsMcsBackupMarsTable;

            /** ***************************************************************IP ATM MARS MCS VC Object Definition Table****************************************************************/
            public final MarsMcsVcTableEnt marsMcsVcTable;

            /** ***************************************************************IP ATM MARS MCS Statistics Definition Table****************************************************************/
            public final MarsMcsStatTableEnt marsMcsStatTable;

            private MarsMcsObjectsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
            {
                super(mib, parent, "marsMcsObjects", "1.3.6.1.6.3.17.3", false, false, false, false);
                this.marsMcsTable = new MarsMcsTableEnt(mib, this);
                this.marsMcsMcGrpTable = new MarsMcsMcGrpTableEnt(mib, this);
                this.marsMcsBackupMarsTable = new MarsMcsBackupMarsTableEnt(mib, this);
                this.marsMcsVcTable = new MarsMcsVcTableEnt(mib, this);
                this.marsMcsStatTable = new MarsMcsStatTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.marsMcsTable,
                    this.marsMcsMcGrpTable,
                    this.marsMcsBackupMarsTable,
                    this.marsMcsVcTable,
                    this.marsMcsStatTable
                };
            }
            public static final class MarsMcsTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsMcsEntryEnt marsMcsEntry;

                private MarsMcsTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsMcsTable", "1.3.6.1.6.3.17.3.1", false, true, false, false);
                    this.marsMcsEntry = new MarsMcsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsMcsEntry
                    };
                }
                public static final class MarsMcsEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsMcsIndexEnt marsMcsIndex;

                    public final MarsMcsIfIndexEnt marsMcsIfIndex;

                    public final MarsMcsAddrEnt marsMcsAddr;

                    public final MarsMcsDefaultMarsAddrEnt marsMcsDefaultMarsAddr;

                    public final MarsMcsRegistrationEnt marsMcsRegistration;

                    public final MarsMcsSsnEnt marsMcsSsn;

                    public final MarsMcsDefaultMtuEnt marsMcsDefaultMtu;

                    public final MarsMcsFailureTimerEnt marsMcsFailureTimer;

                    public final MarsMcsRetranDelayTimerEnt marsMcsRetranDelayTimer;

                    public final MarsMcsRdmMulReqAddRetrTimerEnt marsMcsRdmMulReqAddRetrTimer;

                    public final MarsMcsRdmVcRevalidateTimerEnt marsMcsRdmVcRevalidateTimer;

                    public final MarsMcsRegisterRetrIntervalEnt marsMcsRegisterRetrInterval;

                    public final MarsMcsRegisterRetrLimitEnt marsMcsRegisterRetrLimit;

                    public final MarsMcsRegWithMarsRdmTimerEnt marsMcsRegWithMarsRdmTimer;

                    public final MarsMcsForceWaitTimerEnt marsMcsForceWaitTimer;

                    public final MarsMcsLmtToMissRedirMapTimerEnt marsMcsLmtToMissRedirMapTimer;

                    public final MarsMcsIdleTimerEnt marsMcsIdleTimer;

                    public final MarsMcsRowStatusEnt marsMcsRowStatus;

                    private MarsMcsEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsMcsEntry", "1.3.6.1.6.3.17.3.1.1", false, false, false, true);
                        this.marsMcsIndex = new MarsMcsIndexEnt(mib, this);
                        this.marsMcsIfIndex = new MarsMcsIfIndexEnt(mib, this);
                        this.marsMcsAddr = new MarsMcsAddrEnt(mib, this);
                        this.marsMcsDefaultMarsAddr = new MarsMcsDefaultMarsAddrEnt(mib, this);
                        this.marsMcsRegistration = new MarsMcsRegistrationEnt(mib, this);
                        this.marsMcsSsn = new MarsMcsSsnEnt(mib, this);
                        this.marsMcsDefaultMtu = new MarsMcsDefaultMtuEnt(mib, this);
                        this.marsMcsFailureTimer = new MarsMcsFailureTimerEnt(mib, this);
                        this.marsMcsRetranDelayTimer = new MarsMcsRetranDelayTimerEnt(mib, this);
                        this.marsMcsRdmMulReqAddRetrTimer = new MarsMcsRdmMulReqAddRetrTimerEnt(mib, this);
                        this.marsMcsRdmVcRevalidateTimer = new MarsMcsRdmVcRevalidateTimerEnt(mib, this);
                        this.marsMcsRegisterRetrInterval = new MarsMcsRegisterRetrIntervalEnt(mib, this);
                        this.marsMcsRegisterRetrLimit = new MarsMcsRegisterRetrLimitEnt(mib, this);
                        this.marsMcsRegWithMarsRdmTimer = new MarsMcsRegWithMarsRdmTimerEnt(mib, this);
                        this.marsMcsForceWaitTimer = new MarsMcsForceWaitTimerEnt(mib, this);
                        this.marsMcsLmtToMissRedirMapTimer = new MarsMcsLmtToMissRedirMapTimerEnt(mib, this);
                        this.marsMcsIdleTimer = new MarsMcsIdleTimerEnt(mib, this);
                        this.marsMcsRowStatus = new MarsMcsRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsMcsIndex,
                            this.marsMcsIfIndex,
                            this.marsMcsAddr,
                            this.marsMcsDefaultMarsAddr,
                            this.marsMcsRegistration,
                            this.marsMcsSsn,
                            this.marsMcsDefaultMtu,
                            this.marsMcsFailureTimer,
                            this.marsMcsRetranDelayTimer,
                            this.marsMcsRdmMulReqAddRetrTimer,
                            this.marsMcsRdmVcRevalidateTimer,
                            this.marsMcsRegisterRetrInterval,
                            this.marsMcsRegisterRetrLimit,
                            this.marsMcsRegWithMarsRdmTimer,
                            this.marsMcsForceWaitTimer,
                            this.marsMcsLmtToMissRedirMapTimer,
                            this.marsMcsIdleTimer,
                            this.marsMcsRowStatus
                        };
                    }
                    public static final class MarsMcsIndexEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsIndexEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsIndex", "1.3.6.1.6.3.17.3.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsIfIndexEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsIfIndexEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsIfIndex", "1.3.6.1.6.3.17.3.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsAddr", "1.3.6.1.6.3.17.3.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsDefaultMarsAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsDefaultMarsAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsDefaultMarsAddr", "1.3.6.1.6.3.17.3.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsRegistrationEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsRegistrationEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsRegistration", "1.3.6.1.6.3.17.3.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsSsnEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsSsnEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsSsn", "1.3.6.1.6.3.17.3.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsDefaultMtuEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsDefaultMtuEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsDefaultMtu", "1.3.6.1.6.3.17.3.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsFailureTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsFailureTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsFailureTimer", "1.3.6.1.6.3.17.3.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsRetranDelayTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsRetranDelayTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsRetranDelayTimer", "1.3.6.1.6.3.17.3.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsRdmMulReqAddRetrTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsRdmMulReqAddRetrTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsRdmMulReqAddRetrTimer", "1.3.6.1.6.3.17.3.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsRdmVcRevalidateTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsRdmVcRevalidateTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsRdmVcRevalidateTimer", "1.3.6.1.6.3.17.3.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsRegisterRetrIntervalEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsRegisterRetrIntervalEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsRegisterRetrInterval", "1.3.6.1.6.3.17.3.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsRegisterRetrLimitEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsRegisterRetrLimitEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsRegisterRetrLimit", "1.3.6.1.6.3.17.3.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsRegWithMarsRdmTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsRegWithMarsRdmTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsRegWithMarsRdmTimer", "1.3.6.1.6.3.17.3.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsForceWaitTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsForceWaitTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsForceWaitTimer", "1.3.6.1.6.3.17.3.1.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsLmtToMissRedirMapTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsLmtToMissRedirMapTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsLmtToMissRedirMapTimer", "1.3.6.1.6.3.17.3.1.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsIdleTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsIdleTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsIdleTimer", "1.3.6.1.6.3.17.3.1.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsRowStatusEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsRowStatusEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsRowStatus", "1.3.6.1.6.3.17.3.1.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MarsMcsMcGrpTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsMcsMcGrpEntryEnt marsMcsMcGrpEntry;

                private MarsMcsMcGrpTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsMcsMcGrpTable", "1.3.6.1.6.3.17.3.2", false, true, false, false);
                    this.marsMcsMcGrpEntry = new MarsMcsMcGrpEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsMcsMcGrpEntry
                    };
                }
                public static final class MarsMcsMcGrpEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsMcsMcMinGrpAddrEnt marsMcsMcMinGrpAddr;

                    public final MarsMcsMcMaxGrpAddrEnt marsMcsMcMaxGrpAddr;

                    public final MarsMcsMcGrpRowStatusEnt marsMcsMcGrpRowStatus;

                    private MarsMcsMcGrpEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsMcsMcGrpEntry", "1.3.6.1.6.3.17.3.2.1", false, false, false, true);
                        this.marsMcsMcMinGrpAddr = new MarsMcsMcMinGrpAddrEnt(mib, this);
                        this.marsMcsMcMaxGrpAddr = new MarsMcsMcMaxGrpAddrEnt(mib, this);
                        this.marsMcsMcGrpRowStatus = new MarsMcsMcGrpRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsMcsMcMinGrpAddr,
                            this.marsMcsMcMaxGrpAddr,
                            this.marsMcsMcGrpRowStatus
                        };
                    }
                    public static final class MarsMcsMcMinGrpAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsMcMinGrpAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsMcMinGrpAddr", "1.3.6.1.6.3.17.3.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsMcMaxGrpAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsMcMaxGrpAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsMcMaxGrpAddr", "1.3.6.1.6.3.17.3.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsMcGrpRowStatusEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsMcGrpRowStatusEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsMcGrpRowStatus", "1.3.6.1.6.3.17.3.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MarsMcsBackupMarsTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsMcsBackupMarsEntryEnt marsMcsBackupMarsEntry;

                private MarsMcsBackupMarsTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsMcsBackupMarsTable", "1.3.6.1.6.3.17.3.3", false, true, false, false);
                    this.marsMcsBackupMarsEntry = new MarsMcsBackupMarsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsMcsBackupMarsEntry
                    };
                }
                public static final class MarsMcsBackupMarsEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsMcsBackupMarsPriorityEnt marsMcsBackupMarsPriority;

                    public final MarsMcsBackupMarsAddrEnt marsMcsBackupMarsAddr;

                    public final MarsMcsBackupMarsRowStatusEnt marsMcsBackupMarsRowStatus;

                    private MarsMcsBackupMarsEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsMcsBackupMarsEntry", "1.3.6.1.6.3.17.3.3.1", false, false, false, true);
                        this.marsMcsBackupMarsPriority = new MarsMcsBackupMarsPriorityEnt(mib, this);
                        this.marsMcsBackupMarsAddr = new MarsMcsBackupMarsAddrEnt(mib, this);
                        this.marsMcsBackupMarsRowStatus = new MarsMcsBackupMarsRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsMcsBackupMarsPriority,
                            this.marsMcsBackupMarsAddr,
                            this.marsMcsBackupMarsRowStatus
                        };
                    }
                    public static final class MarsMcsBackupMarsPriorityEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsBackupMarsPriorityEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsBackupMarsPriority", "1.3.6.1.6.3.17.3.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsBackupMarsAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsBackupMarsAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsBackupMarsAddr", "1.3.6.1.6.3.17.3.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsBackupMarsRowStatusEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsBackupMarsRowStatusEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsBackupMarsRowStatus", "1.3.6.1.6.3.17.3.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MarsMcsVcTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsMcsVcEntryEnt marsMcsVcEntry;

                private MarsMcsVcTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsMcsVcTable", "1.3.6.1.6.3.17.3.4", false, true, false, false);
                    this.marsMcsVcEntry = new MarsMcsVcEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsMcsVcEntry
                    };
                }
                public static final class MarsMcsVcEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsMcsVcVpiEnt marsMcsVcVpi;

                    public final MarsMcsVcVciEnt marsMcsVcVci;

                    public final MarsMcsVcMinGrpAddrEnt marsMcsVcMinGrpAddr;

                    public final MarsMcsVcMaxGrpAddrEnt marsMcsVcMaxGrpAddr;

                    public final MarsMcsVcPartyAddrEnt marsMcsVcPartyAddr;

                    public final MarsMcsVcPartyAddrTypeEnt marsMcsVcPartyAddrType;

                    public final MarsMcsVcTypeEnt marsMcsVcType;

                    public final MarsMcsVcCtrlTypeEnt marsMcsVcCtrlType;

                    public final MarsMcsVcIdleTimerEnt marsMcsVcIdleTimer;

                    public final MarsMcsVcRevalidateEnt marsMcsVcRevalidate;

                    public final MarsMcsVcEncapsTypeEnt marsMcsVcEncapsType;

                    public final MarsMcsVcNegotiatedMtuEnt marsMcsVcNegotiatedMtu;

                    public final MarsMcsVcRowStatusEnt marsMcsVcRowStatus;

                    private MarsMcsVcEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsMcsVcEntry", "1.3.6.1.6.3.17.3.4.1", false, false, false, true);
                        this.marsMcsVcVpi = new MarsMcsVcVpiEnt(mib, this);
                        this.marsMcsVcVci = new MarsMcsVcVciEnt(mib, this);
                        this.marsMcsVcMinGrpAddr = new MarsMcsVcMinGrpAddrEnt(mib, this);
                        this.marsMcsVcMaxGrpAddr = new MarsMcsVcMaxGrpAddrEnt(mib, this);
                        this.marsMcsVcPartyAddr = new MarsMcsVcPartyAddrEnt(mib, this);
                        this.marsMcsVcPartyAddrType = new MarsMcsVcPartyAddrTypeEnt(mib, this);
                        this.marsMcsVcType = new MarsMcsVcTypeEnt(mib, this);
                        this.marsMcsVcCtrlType = new MarsMcsVcCtrlTypeEnt(mib, this);
                        this.marsMcsVcIdleTimer = new MarsMcsVcIdleTimerEnt(mib, this);
                        this.marsMcsVcRevalidate = new MarsMcsVcRevalidateEnt(mib, this);
                        this.marsMcsVcEncapsType = new MarsMcsVcEncapsTypeEnt(mib, this);
                        this.marsMcsVcNegotiatedMtu = new MarsMcsVcNegotiatedMtuEnt(mib, this);
                        this.marsMcsVcRowStatus = new MarsMcsVcRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsMcsVcVpi,
                            this.marsMcsVcVci,
                            this.marsMcsVcMinGrpAddr,
                            this.marsMcsVcMaxGrpAddr,
                            this.marsMcsVcPartyAddr,
                            this.marsMcsVcPartyAddrType,
                            this.marsMcsVcType,
                            this.marsMcsVcCtrlType,
                            this.marsMcsVcIdleTimer,
                            this.marsMcsVcRevalidate,
                            this.marsMcsVcEncapsType,
                            this.marsMcsVcNegotiatedMtu,
                            this.marsMcsVcRowStatus
                        };
                    }
                    public static final class MarsMcsVcVpiEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsVcVpiEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsVcVpi", "1.3.6.1.6.3.17.3.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsVcVciEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsVcVciEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsVcVci", "1.3.6.1.6.3.17.3.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsVcMinGrpAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsVcMinGrpAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsVcMinGrpAddr", "1.3.6.1.6.3.17.3.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsVcMaxGrpAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsVcMaxGrpAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsVcMaxGrpAddr", "1.3.6.1.6.3.17.3.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsVcPartyAddrEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsVcPartyAddrEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsVcPartyAddr", "1.3.6.1.6.3.17.3.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsVcPartyAddrTypeEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsVcPartyAddrTypeEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsVcPartyAddrType", "1.3.6.1.6.3.17.3.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsVcTypeEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsVcTypeEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsVcType", "1.3.6.1.6.3.17.3.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsVcCtrlTypeEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsVcCtrlTypeEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsVcCtrlType", "1.3.6.1.6.3.17.3.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsVcIdleTimerEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsVcIdleTimerEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsVcIdleTimer", "1.3.6.1.6.3.17.3.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsVcRevalidateEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsVcRevalidateEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsVcRevalidate", "1.3.6.1.6.3.17.3.4.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsVcEncapsTypeEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsVcEncapsTypeEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsVcEncapsType", "1.3.6.1.6.3.17.3.4.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsVcNegotiatedMtuEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsVcNegotiatedMtuEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsVcNegotiatedMtu", "1.3.6.1.6.3.17.3.4.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsVcRowStatusEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsVcRowStatusEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsVcRowStatus", "1.3.6.1.6.3.17.3.4.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MarsMcsStatTableEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsMcsStatEntryEnt marsMcsStatEntry;

                private MarsMcsStatTableEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsMcsStatTable", "1.3.6.1.6.3.17.3.5", false, true, false, false);
                    this.marsMcsStatEntry = new MarsMcsStatEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsMcsStatEntry
                    };
                }
                public static final class MarsMcsStatEntryEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsMcsStatTxReqMsgsEnt marsMcsStatTxReqMsgs;

                    public final MarsMcsStatTxMservMsgsEnt marsMcsStatTxMservMsgs;

                    public final MarsMcsStatTxUnservMsgsEnt marsMcsStatTxUnservMsgs;

                    public final MarsMcsStatRxMultiMsgsEnt marsMcsStatRxMultiMsgs;

                    public final MarsMcsStatRxSjoinMsgsEnt marsMcsStatRxSjoinMsgs;

                    public final MarsMcsStatRxSleaveMsgsEnt marsMcsStatRxSleaveMsgs;

                    public final MarsMcsStatRxNakMsgsEnt marsMcsStatRxNakMsgs;

                    public final MarsMcsStatRxMigrateMsgsEnt marsMcsStatRxMigrateMsgs;

                    public final MarsMcsStatFailMultiMsgsEnt marsMcsStatFailMultiMsgs;

                    private MarsMcsStatEntryEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsMcsStatEntry", "1.3.6.1.6.3.17.3.5.1", false, false, false, true);
                        this.marsMcsStatTxReqMsgs = new MarsMcsStatTxReqMsgsEnt(mib, this);
                        this.marsMcsStatTxMservMsgs = new MarsMcsStatTxMservMsgsEnt(mib, this);
                        this.marsMcsStatTxUnservMsgs = new MarsMcsStatTxUnservMsgsEnt(mib, this);
                        this.marsMcsStatRxMultiMsgs = new MarsMcsStatRxMultiMsgsEnt(mib, this);
                        this.marsMcsStatRxSjoinMsgs = new MarsMcsStatRxSjoinMsgsEnt(mib, this);
                        this.marsMcsStatRxSleaveMsgs = new MarsMcsStatRxSleaveMsgsEnt(mib, this);
                        this.marsMcsStatRxNakMsgs = new MarsMcsStatRxNakMsgsEnt(mib, this);
                        this.marsMcsStatRxMigrateMsgs = new MarsMcsStatRxMigrateMsgsEnt(mib, this);
                        this.marsMcsStatFailMultiMsgs = new MarsMcsStatFailMultiMsgsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsMcsStatTxReqMsgs,
                            this.marsMcsStatTxMservMsgs,
                            this.marsMcsStatTxUnservMsgs,
                            this.marsMcsStatRxMultiMsgs,
                            this.marsMcsStatRxSjoinMsgs,
                            this.marsMcsStatRxSleaveMsgs,
                            this.marsMcsStatRxNakMsgs,
                            this.marsMcsStatRxMigrateMsgs,
                            this.marsMcsStatFailMultiMsgs
                        };
                    }
                    public static final class MarsMcsStatTxReqMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsStatTxReqMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsStatTxReqMsgs", "1.3.6.1.6.3.17.3.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsStatTxMservMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsStatTxMservMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsStatTxMservMsgs", "1.3.6.1.6.3.17.3.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsStatTxUnservMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsStatTxUnservMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsStatTxUnservMsgs", "1.3.6.1.6.3.17.3.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsStatRxMultiMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsStatRxMultiMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsStatRxMultiMsgs", "1.3.6.1.6.3.17.3.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsStatRxSjoinMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsStatRxSjoinMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsStatRxSjoinMsgs", "1.3.6.1.6.3.17.3.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsStatRxSleaveMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsStatRxSleaveMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsStatRxSleaveMsgs", "1.3.6.1.6.3.17.3.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsStatRxNakMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsStatRxNakMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsStatRxNakMsgs", "1.3.6.1.6.3.17.3.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsStatRxMigrateMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsStatRxMigrateMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsStatRxMigrateMsgs", "1.3.6.1.6.3.17.3.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsMcsStatFailMultiMsgsEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsStatFailMultiMsgsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsStatFailMultiMsgs", "1.3.6.1.6.3.17.3.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class MarsTrapInfoEnt extends MIBEntry<IPATMIPMCMIBDef>
        {
            public final MarsFaultTrapEnt marsFaultTrap;

            private MarsTrapInfoEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
            {
                super(mib, parent, "marsTrapInfo", "1.3.6.1.6.3.17.0", false, false, false, false);
                this.marsFaultTrap = new MarsFaultTrapEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.marsFaultTrap
                };
            }
            public static final class MarsFaultTrapEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                private MarsFaultTrapEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsFaultTrap", "1.3.6.1.6.3.17.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class MarsConformanceEnt extends MIBEntry<IPATMIPMCMIBDef>
        {
            public final MarsClientConformanceEnt marsClientConformance;

            public final MarsServerConformanceEnt marsServerConformance;

            public final MarsMcsConformanceEnt marsMcsConformance;

            private MarsConformanceEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
            {
                super(mib, parent, "marsConformance", "1.3.6.1.6.3.17.4", false, false, false, false);
                this.marsClientConformance = new MarsClientConformanceEnt(mib, this);
                this.marsServerConformance = new MarsServerConformanceEnt(mib, this);
                this.marsMcsConformance = new MarsMcsConformanceEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.marsClientConformance,
                    this.marsServerConformance,
                    this.marsMcsConformance
                };
            }
            public static final class MarsClientConformanceEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsClientCompliancesEnt marsClientCompliances;

                public final MarsClientGroupsEnt marsClientGroups;

                private MarsClientConformanceEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsClientConformance", "1.3.6.1.6.3.17.4.1", false, false, false, false);
                    this.marsClientCompliances = new MarsClientCompliancesEnt(mib, this);
                    this.marsClientGroups = new MarsClientGroupsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsClientCompliances,
                        this.marsClientGroups
                    };
                }
                public static final class MarsClientCompliancesEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    /** ***************************************************************MARS Client Compliance Statements****************************************************************/
                    public final MarsClientComplianceEnt marsClientCompliance;

                    private MarsClientCompliancesEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsClientCompliances", "1.3.6.1.6.3.17.4.1.1", false, false, false, false);
                        this.marsClientCompliance = new MarsClientComplianceEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsClientCompliance
                        };
                    }
                    public static final class MarsClientComplianceEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientComplianceEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientCompliance", "1.3.6.1.6.3.17.4.1.1.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class MarsClientGroupsEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsClientGroupEnt marsClientGroup;

                    private MarsClientGroupsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsClientGroups", "1.3.6.1.6.3.17.4.1.2", false, false, false, false);
                        this.marsClientGroup = new MarsClientGroupEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsClientGroup
                        };
                    }
                    public static final class MarsClientGroupEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsClientGroupEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsClientGroup", "1.3.6.1.6.3.17.4.1.2.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MarsServerConformanceEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsServerCompliancesEnt marsServerCompliances;

                public final MarsServerGroupsEnt marsServerGroups;

                private MarsServerConformanceEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsServerConformance", "1.3.6.1.6.3.17.4.2", false, false, false, false);
                    this.marsServerCompliances = new MarsServerCompliancesEnt(mib, this);
                    this.marsServerGroups = new MarsServerGroupsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsServerCompliances,
                        this.marsServerGroups
                    };
                }
                public static final class MarsServerCompliancesEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    /** ***************************************************************MARS Server Compliance Statements****************************************************************/
                    public final MarsServerComplianceEnt marsServerCompliance;

                    private MarsServerCompliancesEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsServerCompliances", "1.3.6.1.6.3.17.4.2.1", false, false, false, false);
                        this.marsServerCompliance = new MarsServerComplianceEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsServerCompliance
                        };
                    }
                    public static final class MarsServerComplianceEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsServerComplianceEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsServerCompliance", "1.3.6.1.6.3.17.4.2.1.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class MarsServerGroupsEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsServerGroupEnt marsServerGroup;

                    public final MarsServerEventGroupEnt marsServerEventGroup;

                    private MarsServerGroupsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsServerGroups", "1.3.6.1.6.3.17.4.2.2", false, false, false, false);
                        this.marsServerGroup = new MarsServerGroupEnt(mib, this);
                        this.marsServerEventGroup = new MarsServerEventGroupEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsServerGroup,
                            this.marsServerEventGroup
                        };
                    }
                    public static final class MarsServerGroupEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsServerGroupEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsServerGroup", "1.3.6.1.6.3.17.4.2.2.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MarsServerEventGroupEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsServerEventGroupEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsServerEventGroup", "1.3.6.1.6.3.17.4.2.2.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MarsMcsConformanceEnt extends MIBEntry<IPATMIPMCMIBDef>
            {
                public final MarsMcsCompliancesEnt marsMcsCompliances;

                public final MarsMcsGroupsEnt marsMcsGroups;

                private MarsMcsConformanceEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                {
                    super(mib, parent, "marsMcsConformance", "1.3.6.1.6.3.17.4.3", false, false, false, false);
                    this.marsMcsCompliances = new MarsMcsCompliancesEnt(mib, this);
                    this.marsMcsGroups = new MarsMcsGroupsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.marsMcsCompliances,
                        this.marsMcsGroups
                    };
                }
                public static final class MarsMcsCompliancesEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    /** ***************************************************************MARS Multicast Server (MCS) Compliance Statements****************************************************************/
                    public final MarsMcsComplianceEnt marsMcsCompliance;

                    private MarsMcsCompliancesEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsMcsCompliances", "1.3.6.1.6.3.17.4.3.1", false, false, false, false);
                        this.marsMcsCompliance = new MarsMcsComplianceEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsMcsCompliance
                        };
                    }
                    public static final class MarsMcsComplianceEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsComplianceEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsCompliance", "1.3.6.1.6.3.17.4.3.1.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class MarsMcsGroupsEnt extends MIBEntry<IPATMIPMCMIBDef>
                {
                    public final MarsMcsGroupEnt marsMcsGroup;

                    private MarsMcsGroupsEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                    {
                        super(mib, parent, "marsMcsGroups", "1.3.6.1.6.3.17.4.3.2", false, false, false, false);
                        this.marsMcsGroup = new MarsMcsGroupEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.marsMcsGroup
                        };
                    }
                    public static final class MarsMcsGroupEnt extends MIBEntry<IPATMIPMCMIBDef>
                    {
                        private MarsMcsGroupEnt(IPATMIPMCMIBDef mib, MIBEntry<IPATMIPMCMIBDef> parent)
                        {
                            super(mib, parent, "marsMcsGroup", "1.3.6.1.6.3.17.4.3.2.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

}
