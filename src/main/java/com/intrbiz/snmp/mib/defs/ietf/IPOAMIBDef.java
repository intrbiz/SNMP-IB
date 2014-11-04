package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**The following textual conventions are defined locally within
this MIB module.  They have been prefixed with 'Ipoa' to
distinguish them from their counterparts in the ATM-TC-MIB.
This was done so that the IPOA-MIB could be advanced as
a standards-based MIB without waiting for the ATM-TC-MIB.
AtmConnKind, AtmAddr
FROM ATM-TC-MIB*/
public final class IPOAMIBDef extends MIB
{
    public static final IPOAMIBDef IPOAMIB = new IPOAMIBDef();

    static { MIBs.getInstance().registerMIB(IPOAMIBDef.IPOAMIB); }

    /** February 9, 1998*/
    public final IpoaMIBEnt ipoaMIB;

    private IPOAMIBDef()
    {
        super("IPOA-MIB");
        this.ipoaMIB = new IpoaMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ipoaMIB
        };
    }

    public static final class IpoaMIBEnt extends MIBEntry<IPOAMIBDef>
    {
        /** Top-level structure of the MIB*/
        public final IpoaObjectsEnt ipoaObjects;

        public final IpoaNotificationsEnt ipoaNotifications;

        public final IpoaConformanceEnt ipoaConformance;

        private IpoaMIBEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
        {
            super(mib, parent, "ipoaMIB", "1.3.6.1.2.1.10.46", false, false, false, false);
            this.ipoaObjects = new IpoaObjectsEnt(mib, this);
            this.ipoaNotifications = new IpoaNotificationsEnt(mib, this);
            this.ipoaConformance = new IpoaConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipoaObjects,
                this.ipoaNotifications,
                this.ipoaConformance
            };
        }
        public static final class IpoaObjectsEnt extends MIBEntry<IPOAMIBDef>
        {
            /** MIB Objects*/
            public final IpoaLisTrapEnableEnt ipoaLisTrapEnable;

            /** The ATM Logical IP Subnet (LIS) Table*/
            public final IpoaLisTableEnt ipoaLisTable;

            /** The ATM Logical IP Subnet Interface Mapping Table*/
            public final IpoaLisIfMappingTableEnt ipoaLisIfMappingTable;

            /** The ATMARP Client Table*/
            public final IpoaArpClientTableEnt ipoaArpClientTable;

            /** The ATMARP Server Table*/
            public final IpoaArpSrvrTableEnt ipoaArpSrvrTable;

            /** The Remote ATMARP Server Table*/
            public final IpoaArpRemoteSrvrTableEnt ipoaArpRemoteSrvrTable;

            /** The ATM VC Table*/
            public final IpoaVcTableEnt ipoaVcTable;

            /** The ATM Config PVC Table*/
            public final IpoaConfigPvcTableEnt ipoaConfigPvcTable;

            private IpoaObjectsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
            {
                super(mib, parent, "ipoaObjects", "1.3.6.1.2.1.10.46.1", false, false, false, false);
                this.ipoaLisTrapEnable = new IpoaLisTrapEnableEnt(mib, this);
                this.ipoaLisTable = new IpoaLisTableEnt(mib, this);
                this.ipoaLisIfMappingTable = new IpoaLisIfMappingTableEnt(mib, this);
                this.ipoaArpClientTable = new IpoaArpClientTableEnt(mib, this);
                this.ipoaArpSrvrTable = new IpoaArpSrvrTableEnt(mib, this);
                this.ipoaArpRemoteSrvrTable = new IpoaArpRemoteSrvrTableEnt(mib, this);
                this.ipoaVcTable = new IpoaVcTableEnt(mib, this);
                this.ipoaConfigPvcTable = new IpoaConfigPvcTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipoaLisTrapEnable,
                    this.ipoaLisTable,
                    this.ipoaLisIfMappingTable,
                    this.ipoaArpClientTable,
                    this.ipoaArpSrvrTable,
                    this.ipoaArpRemoteSrvrTable,
                    this.ipoaVcTable,
                    this.ipoaConfigPvcTable
                };
            }
            public static final class IpoaLisTrapEnableEnt extends MIBEntry<IPOAMIBDef>
            {
                private IpoaLisTrapEnableEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                {
                    super(mib, parent, "ipoaLisTrapEnable", "1.3.6.1.2.1.10.46.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpoaLisTableEnt extends MIBEntry<IPOAMIBDef>
            {
                public final IpoaLisEntryEnt ipoaLisEntry;

                private IpoaLisTableEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                {
                    super(mib, parent, "ipoaLisTable", "1.3.6.1.2.1.10.46.1.2", false, true, false, false);
                    this.ipoaLisEntry = new IpoaLisEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipoaLisEntry
                    };
                }
                public static final class IpoaLisEntryEnt extends MIBEntry<IPOAMIBDef>
                {
                    public final IpoaLisSubnetAddrEnt ipoaLisSubnetAddr;

                    public final IpoaLisDefaultMtuEnt ipoaLisDefaultMtu;

                    public final IpoaLisDefaultEncapsTypeEnt ipoaLisDefaultEncapsType;

                    public final IpoaLisInactivityTimerEnt ipoaLisInactivityTimer;

                    public final IpoaLisMinHoldingTimeEnt ipoaLisMinHoldingTime;

                    public final IpoaLisQDepthEnt ipoaLisQDepth;

                    public final IpoaLisMaxCallsEnt ipoaLisMaxCalls;

                    public final IpoaLisCacheEntryAgeEnt ipoaLisCacheEntryAge;

                    public final IpoaLisRetriesEnt ipoaLisRetries;

                    public final IpoaLisTimeoutEnt ipoaLisTimeout;

                    public final IpoaLisDefaultPeakCellRateEnt ipoaLisDefaultPeakCellRate;

                    public final IpoaLisActiveVcsEnt ipoaLisActiveVcs;

                    public final IpoaLisRowStatusEnt ipoaLisRowStatus;

                    private IpoaLisEntryEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaLisEntry", "1.3.6.1.2.1.10.46.1.2.1", false, false, false, true);
                        this.ipoaLisSubnetAddr = new IpoaLisSubnetAddrEnt(mib, this);
                        this.ipoaLisDefaultMtu = new IpoaLisDefaultMtuEnt(mib, this);
                        this.ipoaLisDefaultEncapsType = new IpoaLisDefaultEncapsTypeEnt(mib, this);
                        this.ipoaLisInactivityTimer = new IpoaLisInactivityTimerEnt(mib, this);
                        this.ipoaLisMinHoldingTime = new IpoaLisMinHoldingTimeEnt(mib, this);
                        this.ipoaLisQDepth = new IpoaLisQDepthEnt(mib, this);
                        this.ipoaLisMaxCalls = new IpoaLisMaxCallsEnt(mib, this);
                        this.ipoaLisCacheEntryAge = new IpoaLisCacheEntryAgeEnt(mib, this);
                        this.ipoaLisRetries = new IpoaLisRetriesEnt(mib, this);
                        this.ipoaLisTimeout = new IpoaLisTimeoutEnt(mib, this);
                        this.ipoaLisDefaultPeakCellRate = new IpoaLisDefaultPeakCellRateEnt(mib, this);
                        this.ipoaLisActiveVcs = new IpoaLisActiveVcsEnt(mib, this);
                        this.ipoaLisRowStatus = new IpoaLisRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipoaLisSubnetAddr,
                            this.ipoaLisDefaultMtu,
                            this.ipoaLisDefaultEncapsType,
                            this.ipoaLisInactivityTimer,
                            this.ipoaLisMinHoldingTime,
                            this.ipoaLisQDepth,
                            this.ipoaLisMaxCalls,
                            this.ipoaLisCacheEntryAge,
                            this.ipoaLisRetries,
                            this.ipoaLisTimeout,
                            this.ipoaLisDefaultPeakCellRate,
                            this.ipoaLisActiveVcs,
                            this.ipoaLisRowStatus
                        };
                    }
                    public static final class IpoaLisSubnetAddrEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaLisSubnetAddrEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaLisSubnetAddr", "1.3.6.1.2.1.10.46.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaLisDefaultMtuEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaLisDefaultMtuEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaLisDefaultMtu", "1.3.6.1.2.1.10.46.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaLisDefaultEncapsTypeEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaLisDefaultEncapsTypeEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaLisDefaultEncapsType", "1.3.6.1.2.1.10.46.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaLisInactivityTimerEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaLisInactivityTimerEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaLisInactivityTimer", "1.3.6.1.2.1.10.46.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaLisMinHoldingTimeEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaLisMinHoldingTimeEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaLisMinHoldingTime", "1.3.6.1.2.1.10.46.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaLisQDepthEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaLisQDepthEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaLisQDepth", "1.3.6.1.2.1.10.46.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaLisMaxCallsEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaLisMaxCallsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaLisMaxCalls", "1.3.6.1.2.1.10.46.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaLisCacheEntryAgeEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaLisCacheEntryAgeEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaLisCacheEntryAge", "1.3.6.1.2.1.10.46.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaLisRetriesEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaLisRetriesEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaLisRetries", "1.3.6.1.2.1.10.46.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaLisTimeoutEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaLisTimeoutEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaLisTimeout", "1.3.6.1.2.1.10.46.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaLisDefaultPeakCellRateEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaLisDefaultPeakCellRateEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaLisDefaultPeakCellRate", "1.3.6.1.2.1.10.46.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaLisActiveVcsEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaLisActiveVcsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaLisActiveVcs", "1.3.6.1.2.1.10.46.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaLisRowStatusEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaLisRowStatusEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaLisRowStatus", "1.3.6.1.2.1.10.46.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IpoaLisIfMappingTableEnt extends MIBEntry<IPOAMIBDef>
            {
                public final IpoaLisIfMappingEntryEnt ipoaLisIfMappingEntry;

                private IpoaLisIfMappingTableEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                {
                    super(mib, parent, "ipoaLisIfMappingTable", "1.3.6.1.2.1.10.46.1.3", false, true, false, false);
                    this.ipoaLisIfMappingEntry = new IpoaLisIfMappingEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipoaLisIfMappingEntry
                    };
                }
                public static final class IpoaLisIfMappingEntryEnt extends MIBEntry<IPOAMIBDef>
                {
                    public final IpoaLisIfMappingIfIndexEnt ipoaLisIfMappingIfIndex;

                    public final IpoaLisIfMappingRowStatusEnt ipoaLisIfMappingRowStatus;

                    private IpoaLisIfMappingEntryEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaLisIfMappingEntry", "1.3.6.1.2.1.10.46.1.3.1", false, false, false, true);
                        this.ipoaLisIfMappingIfIndex = new IpoaLisIfMappingIfIndexEnt(mib, this);
                        this.ipoaLisIfMappingRowStatus = new IpoaLisIfMappingRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipoaLisIfMappingIfIndex,
                            this.ipoaLisIfMappingRowStatus
                        };
                    }
                    public static final class IpoaLisIfMappingIfIndexEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaLisIfMappingIfIndexEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaLisIfMappingIfIndex", "1.3.6.1.2.1.10.46.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaLisIfMappingRowStatusEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaLisIfMappingRowStatusEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaLisIfMappingRowStatus", "1.3.6.1.2.1.10.46.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IpoaArpClientTableEnt extends MIBEntry<IPOAMIBDef>
            {
                public final IpoaArpClientEntryEnt ipoaArpClientEntry;

                private IpoaArpClientTableEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                {
                    super(mib, parent, "ipoaArpClientTable", "1.3.6.1.2.1.10.46.1.4", false, true, false, false);
                    this.ipoaArpClientEntry = new IpoaArpClientEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipoaArpClientEntry
                    };
                }
                public static final class IpoaArpClientEntryEnt extends MIBEntry<IPOAMIBDef>
                {
                    public final IpoaArpClientAtmAddrEnt ipoaArpClientAtmAddr;

                    public final IpoaArpClientSrvrInUseEnt ipoaArpClientSrvrInUse;

                    public final IpoaArpClientInArpInReqsEnt ipoaArpClientInArpInReqs;

                    public final IpoaArpClientInArpOutReqsEnt ipoaArpClientInArpOutReqs;

                    public final IpoaArpClientInArpInRepliesEnt ipoaArpClientInArpInReplies;

                    public final IpoaArpClientInArpOutRepliesEnt ipoaArpClientInArpOutReplies;

                    public final IpoaArpClientInArpInvalidInReqsEnt ipoaArpClientInArpInvalidInReqs;

                    public final IpoaArpClientInArpInvalidOutReqsEnt ipoaArpClientInArpInvalidOutReqs;

                    public final IpoaArpClientArpInReqsEnt ipoaArpClientArpInReqs;

                    public final IpoaArpClientArpOutReqsEnt ipoaArpClientArpOutReqs;

                    public final IpoaArpClientArpInRepliesEnt ipoaArpClientArpInReplies;

                    public final IpoaArpClientArpOutRepliesEnt ipoaArpClientArpOutReplies;

                    public final IpoaArpClientArpInNaksEnt ipoaArpClientArpInNaks;

                    public final IpoaArpClientArpOutNaksEnt ipoaArpClientArpOutNaks;

                    public final IpoaArpClientArpUnknownOpsEnt ipoaArpClientArpUnknownOps;

                    public final IpoaArpClientArpNoSrvrRespsEnt ipoaArpClientArpNoSrvrResps;

                    public final IpoaArpClientRowStatusEnt ipoaArpClientRowStatus;

                    private IpoaArpClientEntryEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaArpClientEntry", "1.3.6.1.2.1.10.46.1.4.1", false, false, false, true);
                        this.ipoaArpClientAtmAddr = new IpoaArpClientAtmAddrEnt(mib, this);
                        this.ipoaArpClientSrvrInUse = new IpoaArpClientSrvrInUseEnt(mib, this);
                        this.ipoaArpClientInArpInReqs = new IpoaArpClientInArpInReqsEnt(mib, this);
                        this.ipoaArpClientInArpOutReqs = new IpoaArpClientInArpOutReqsEnt(mib, this);
                        this.ipoaArpClientInArpInReplies = new IpoaArpClientInArpInRepliesEnt(mib, this);
                        this.ipoaArpClientInArpOutReplies = new IpoaArpClientInArpOutRepliesEnt(mib, this);
                        this.ipoaArpClientInArpInvalidInReqs = new IpoaArpClientInArpInvalidInReqsEnt(mib, this);
                        this.ipoaArpClientInArpInvalidOutReqs = new IpoaArpClientInArpInvalidOutReqsEnt(mib, this);
                        this.ipoaArpClientArpInReqs = new IpoaArpClientArpInReqsEnt(mib, this);
                        this.ipoaArpClientArpOutReqs = new IpoaArpClientArpOutReqsEnt(mib, this);
                        this.ipoaArpClientArpInReplies = new IpoaArpClientArpInRepliesEnt(mib, this);
                        this.ipoaArpClientArpOutReplies = new IpoaArpClientArpOutRepliesEnt(mib, this);
                        this.ipoaArpClientArpInNaks = new IpoaArpClientArpInNaksEnt(mib, this);
                        this.ipoaArpClientArpOutNaks = new IpoaArpClientArpOutNaksEnt(mib, this);
                        this.ipoaArpClientArpUnknownOps = new IpoaArpClientArpUnknownOpsEnt(mib, this);
                        this.ipoaArpClientArpNoSrvrResps = new IpoaArpClientArpNoSrvrRespsEnt(mib, this);
                        this.ipoaArpClientRowStatus = new IpoaArpClientRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipoaArpClientAtmAddr,
                            this.ipoaArpClientSrvrInUse,
                            this.ipoaArpClientInArpInReqs,
                            this.ipoaArpClientInArpOutReqs,
                            this.ipoaArpClientInArpInReplies,
                            this.ipoaArpClientInArpOutReplies,
                            this.ipoaArpClientInArpInvalidInReqs,
                            this.ipoaArpClientInArpInvalidOutReqs,
                            this.ipoaArpClientArpInReqs,
                            this.ipoaArpClientArpOutReqs,
                            this.ipoaArpClientArpInReplies,
                            this.ipoaArpClientArpOutReplies,
                            this.ipoaArpClientArpInNaks,
                            this.ipoaArpClientArpOutNaks,
                            this.ipoaArpClientArpUnknownOps,
                            this.ipoaArpClientArpNoSrvrResps,
                            this.ipoaArpClientRowStatus
                        };
                    }
                    public static final class IpoaArpClientAtmAddrEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpClientAtmAddrEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpClientAtmAddr", "1.3.6.1.2.1.10.46.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpClientSrvrInUseEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpClientSrvrInUseEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpClientSrvrInUse", "1.3.6.1.2.1.10.46.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpClientInArpInReqsEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpClientInArpInReqsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpClientInArpInReqs", "1.3.6.1.2.1.10.46.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpClientInArpOutReqsEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpClientInArpOutReqsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpClientInArpOutReqs", "1.3.6.1.2.1.10.46.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpClientInArpInRepliesEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpClientInArpInRepliesEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpClientInArpInReplies", "1.3.6.1.2.1.10.46.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpClientInArpOutRepliesEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpClientInArpOutRepliesEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpClientInArpOutReplies", "1.3.6.1.2.1.10.46.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpClientInArpInvalidInReqsEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpClientInArpInvalidInReqsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpClientInArpInvalidInReqs", "1.3.6.1.2.1.10.46.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpClientInArpInvalidOutReqsEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpClientInArpInvalidOutReqsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpClientInArpInvalidOutReqs", "1.3.6.1.2.1.10.46.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpClientArpInReqsEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpClientArpInReqsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpClientArpInReqs", "1.3.6.1.2.1.10.46.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpClientArpOutReqsEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpClientArpOutReqsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpClientArpOutReqs", "1.3.6.1.2.1.10.46.1.4.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpClientArpInRepliesEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpClientArpInRepliesEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpClientArpInReplies", "1.3.6.1.2.1.10.46.1.4.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpClientArpOutRepliesEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpClientArpOutRepliesEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpClientArpOutReplies", "1.3.6.1.2.1.10.46.1.4.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpClientArpInNaksEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpClientArpInNaksEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpClientArpInNaks", "1.3.6.1.2.1.10.46.1.4.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpClientArpOutNaksEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpClientArpOutNaksEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpClientArpOutNaks", "1.3.6.1.2.1.10.46.1.4.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpClientArpUnknownOpsEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpClientArpUnknownOpsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpClientArpUnknownOps", "1.3.6.1.2.1.10.46.1.4.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpClientArpNoSrvrRespsEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpClientArpNoSrvrRespsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpClientArpNoSrvrResps", "1.3.6.1.2.1.10.46.1.4.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpClientRowStatusEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpClientRowStatusEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpClientRowStatus", "1.3.6.1.2.1.10.46.1.4.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IpoaArpSrvrTableEnt extends MIBEntry<IPOAMIBDef>
            {
                public final IpoaArpSrvrEntryEnt ipoaArpSrvrEntry;

                private IpoaArpSrvrTableEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                {
                    super(mib, parent, "ipoaArpSrvrTable", "1.3.6.1.2.1.10.46.1.5", false, true, false, false);
                    this.ipoaArpSrvrEntry = new IpoaArpSrvrEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipoaArpSrvrEntry
                    };
                }
                public static final class IpoaArpSrvrEntryEnt extends MIBEntry<IPOAMIBDef>
                {
                    public final IpoaArpSrvrAddrEnt ipoaArpSrvrAddr;

                    public final IpoaArpSrvrLisEnt ipoaArpSrvrLis;

                    public final IpoaArpSrvrInArpInReqsEnt ipoaArpSrvrInArpInReqs;

                    public final IpoaArpSrvrInArpOutReqsEnt ipoaArpSrvrInArpOutReqs;

                    public final IpoaArpSrvrInArpInRepliesEnt ipoaArpSrvrInArpInReplies;

                    public final IpoaArpSrvrInArpOutRepliesEnt ipoaArpSrvrInArpOutReplies;

                    public final IpoaArpSrvrInArpInvalidInReqsEnt ipoaArpSrvrInArpInvalidInReqs;

                    public final IpoaArpSrvrInArpInvalidOutReqsEnt ipoaArpSrvrInArpInvalidOutReqs;

                    public final IpoaArpSrvrArpInReqsEnt ipoaArpSrvrArpInReqs;

                    public final IpoaArpSrvrArpOutRepliesEnt ipoaArpSrvrArpOutReplies;

                    public final IpoaArpSrvrArpOutNaksEnt ipoaArpSrvrArpOutNaks;

                    public final IpoaArpSrvrArpDupIpAddrsEnt ipoaArpSrvrArpDupIpAddrs;

                    public final IpoaArpSrvrArpUnknownOpsEnt ipoaArpSrvrArpUnknownOps;

                    public final IpoaArpSrvrRowStatusEnt ipoaArpSrvrRowStatus;

                    private IpoaArpSrvrEntryEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaArpSrvrEntry", "1.3.6.1.2.1.10.46.1.5.1", false, false, false, true);
                        this.ipoaArpSrvrAddr = new IpoaArpSrvrAddrEnt(mib, this);
                        this.ipoaArpSrvrLis = new IpoaArpSrvrLisEnt(mib, this);
                        this.ipoaArpSrvrInArpInReqs = new IpoaArpSrvrInArpInReqsEnt(mib, this);
                        this.ipoaArpSrvrInArpOutReqs = new IpoaArpSrvrInArpOutReqsEnt(mib, this);
                        this.ipoaArpSrvrInArpInReplies = new IpoaArpSrvrInArpInRepliesEnt(mib, this);
                        this.ipoaArpSrvrInArpOutReplies = new IpoaArpSrvrInArpOutRepliesEnt(mib, this);
                        this.ipoaArpSrvrInArpInvalidInReqs = new IpoaArpSrvrInArpInvalidInReqsEnt(mib, this);
                        this.ipoaArpSrvrInArpInvalidOutReqs = new IpoaArpSrvrInArpInvalidOutReqsEnt(mib, this);
                        this.ipoaArpSrvrArpInReqs = new IpoaArpSrvrArpInReqsEnt(mib, this);
                        this.ipoaArpSrvrArpOutReplies = new IpoaArpSrvrArpOutRepliesEnt(mib, this);
                        this.ipoaArpSrvrArpOutNaks = new IpoaArpSrvrArpOutNaksEnt(mib, this);
                        this.ipoaArpSrvrArpDupIpAddrs = new IpoaArpSrvrArpDupIpAddrsEnt(mib, this);
                        this.ipoaArpSrvrArpUnknownOps = new IpoaArpSrvrArpUnknownOpsEnt(mib, this);
                        this.ipoaArpSrvrRowStatus = new IpoaArpSrvrRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipoaArpSrvrAddr,
                            this.ipoaArpSrvrLis,
                            this.ipoaArpSrvrInArpInReqs,
                            this.ipoaArpSrvrInArpOutReqs,
                            this.ipoaArpSrvrInArpInReplies,
                            this.ipoaArpSrvrInArpOutReplies,
                            this.ipoaArpSrvrInArpInvalidInReqs,
                            this.ipoaArpSrvrInArpInvalidOutReqs,
                            this.ipoaArpSrvrArpInReqs,
                            this.ipoaArpSrvrArpOutReplies,
                            this.ipoaArpSrvrArpOutNaks,
                            this.ipoaArpSrvrArpDupIpAddrs,
                            this.ipoaArpSrvrArpUnknownOps,
                            this.ipoaArpSrvrRowStatus
                        };
                    }
                    public static final class IpoaArpSrvrAddrEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpSrvrAddrEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpSrvrAddr", "1.3.6.1.2.1.10.46.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpSrvrLisEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpSrvrLisEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpSrvrLis", "1.3.6.1.2.1.10.46.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpSrvrInArpInReqsEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpSrvrInArpInReqsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpSrvrInArpInReqs", "1.3.6.1.2.1.10.46.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpSrvrInArpOutReqsEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpSrvrInArpOutReqsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpSrvrInArpOutReqs", "1.3.6.1.2.1.10.46.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpSrvrInArpInRepliesEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpSrvrInArpInRepliesEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpSrvrInArpInReplies", "1.3.6.1.2.1.10.46.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpSrvrInArpOutRepliesEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpSrvrInArpOutRepliesEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpSrvrInArpOutReplies", "1.3.6.1.2.1.10.46.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpSrvrInArpInvalidInReqsEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpSrvrInArpInvalidInReqsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpSrvrInArpInvalidInReqs", "1.3.6.1.2.1.10.46.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpSrvrInArpInvalidOutReqsEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpSrvrInArpInvalidOutReqsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpSrvrInArpInvalidOutReqs", "1.3.6.1.2.1.10.46.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpSrvrArpInReqsEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpSrvrArpInReqsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpSrvrArpInReqs", "1.3.6.1.2.1.10.46.1.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpSrvrArpOutRepliesEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpSrvrArpOutRepliesEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpSrvrArpOutReplies", "1.3.6.1.2.1.10.46.1.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpSrvrArpOutNaksEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpSrvrArpOutNaksEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpSrvrArpOutNaks", "1.3.6.1.2.1.10.46.1.5.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpSrvrArpDupIpAddrsEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpSrvrArpDupIpAddrsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpSrvrArpDupIpAddrs", "1.3.6.1.2.1.10.46.1.5.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpSrvrArpUnknownOpsEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpSrvrArpUnknownOpsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpSrvrArpUnknownOps", "1.3.6.1.2.1.10.46.1.5.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpSrvrRowStatusEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpSrvrRowStatusEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpSrvrRowStatus", "1.3.6.1.2.1.10.46.1.5.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IpoaArpRemoteSrvrTableEnt extends MIBEntry<IPOAMIBDef>
            {
                public final IpoaArpRemoteSrvrEntryEnt ipoaArpRemoteSrvrEntry;

                private IpoaArpRemoteSrvrTableEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                {
                    super(mib, parent, "ipoaArpRemoteSrvrTable", "1.3.6.1.2.1.10.46.1.6", false, true, false, false);
                    this.ipoaArpRemoteSrvrEntry = new IpoaArpRemoteSrvrEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipoaArpRemoteSrvrEntry
                    };
                }
                public static final class IpoaArpRemoteSrvrEntryEnt extends MIBEntry<IPOAMIBDef>
                {
                    public final IpoaArpRemoteSrvrAtmAddrEnt ipoaArpRemoteSrvrAtmAddr;

                    public final IpoaArpRemoteSrvrRowStatusEnt ipoaArpRemoteSrvrRowStatus;

                    public final IpoaArpRemoteSrvrIfIndexEnt ipoaArpRemoteSrvrIfIndex;

                    public final IpoaArpRemoteSrvrIpAddrEnt ipoaArpRemoteSrvrIpAddr;

                    public final IpoaArpRemoteSrvrAdminStatusEnt ipoaArpRemoteSrvrAdminStatus;

                    public final IpoaArpRemoteSrvrOperStatusEnt ipoaArpRemoteSrvrOperStatus;

                    private IpoaArpRemoteSrvrEntryEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaArpRemoteSrvrEntry", "1.3.6.1.2.1.10.46.1.6.1", false, false, false, true);
                        this.ipoaArpRemoteSrvrAtmAddr = new IpoaArpRemoteSrvrAtmAddrEnt(mib, this);
                        this.ipoaArpRemoteSrvrRowStatus = new IpoaArpRemoteSrvrRowStatusEnt(mib, this);
                        this.ipoaArpRemoteSrvrIfIndex = new IpoaArpRemoteSrvrIfIndexEnt(mib, this);
                        this.ipoaArpRemoteSrvrIpAddr = new IpoaArpRemoteSrvrIpAddrEnt(mib, this);
                        this.ipoaArpRemoteSrvrAdminStatus = new IpoaArpRemoteSrvrAdminStatusEnt(mib, this);
                        this.ipoaArpRemoteSrvrOperStatus = new IpoaArpRemoteSrvrOperStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipoaArpRemoteSrvrAtmAddr,
                            this.ipoaArpRemoteSrvrRowStatus,
                            this.ipoaArpRemoteSrvrIfIndex,
                            this.ipoaArpRemoteSrvrIpAddr,
                            this.ipoaArpRemoteSrvrAdminStatus,
                            this.ipoaArpRemoteSrvrOperStatus
                        };
                    }
                    public static final class IpoaArpRemoteSrvrAtmAddrEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpRemoteSrvrAtmAddrEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpRemoteSrvrAtmAddr", "1.3.6.1.2.1.10.46.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpRemoteSrvrRowStatusEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpRemoteSrvrRowStatusEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpRemoteSrvrRowStatus", "1.3.6.1.2.1.10.46.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpRemoteSrvrIfIndexEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpRemoteSrvrIfIndexEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpRemoteSrvrIfIndex", "1.3.6.1.2.1.10.46.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpRemoteSrvrIpAddrEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpRemoteSrvrIpAddrEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpRemoteSrvrIpAddr", "1.3.6.1.2.1.10.46.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpRemoteSrvrAdminStatusEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpRemoteSrvrAdminStatusEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpRemoteSrvrAdminStatus", "1.3.6.1.2.1.10.46.1.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaArpRemoteSrvrOperStatusEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaArpRemoteSrvrOperStatusEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaArpRemoteSrvrOperStatus", "1.3.6.1.2.1.10.46.1.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IpoaVcTableEnt extends MIBEntry<IPOAMIBDef>
            {
                public final IpoaVcEntryEnt ipoaVcEntry;

                private IpoaVcTableEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                {
                    super(mib, parent, "ipoaVcTable", "1.3.6.1.2.1.10.46.1.7", false, true, false, false);
                    this.ipoaVcEntry = new IpoaVcEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipoaVcEntry
                    };
                }
                public static final class IpoaVcEntryEnt extends MIBEntry<IPOAMIBDef>
                {
                    public final IpoaVcVpiEnt ipoaVcVpi;

                    public final IpoaVcVciEnt ipoaVcVci;

                    public final IpoaVcTypeEnt ipoaVcType;

                    public final IpoaVcNegotiatedEncapsTypeEnt ipoaVcNegotiatedEncapsType;

                    public final IpoaVcNegotiatedMtuEnt ipoaVcNegotiatedMtu;

                    private IpoaVcEntryEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaVcEntry", "1.3.6.1.2.1.10.46.1.7.1", false, false, false, true);
                        this.ipoaVcVpi = new IpoaVcVpiEnt(mib, this);
                        this.ipoaVcVci = new IpoaVcVciEnt(mib, this);
                        this.ipoaVcType = new IpoaVcTypeEnt(mib, this);
                        this.ipoaVcNegotiatedEncapsType = new IpoaVcNegotiatedEncapsTypeEnt(mib, this);
                        this.ipoaVcNegotiatedMtu = new IpoaVcNegotiatedMtuEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipoaVcVpi,
                            this.ipoaVcVci,
                            this.ipoaVcType,
                            this.ipoaVcNegotiatedEncapsType,
                            this.ipoaVcNegotiatedMtu
                        };
                    }
                    public static final class IpoaVcVpiEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaVcVpiEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaVcVpi", "1.3.6.1.2.1.10.46.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaVcVciEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaVcVciEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaVcVci", "1.3.6.1.2.1.10.46.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaVcTypeEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaVcTypeEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaVcType", "1.3.6.1.2.1.10.46.1.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaVcNegotiatedEncapsTypeEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaVcNegotiatedEncapsTypeEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaVcNegotiatedEncapsType", "1.3.6.1.2.1.10.46.1.7.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaVcNegotiatedMtuEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaVcNegotiatedMtuEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaVcNegotiatedMtu", "1.3.6.1.2.1.10.46.1.7.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IpoaConfigPvcTableEnt extends MIBEntry<IPOAMIBDef>
            {
                public final IpoaConfigPvcEntryEnt ipoaConfigPvcEntry;

                private IpoaConfigPvcTableEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                {
                    super(mib, parent, "ipoaConfigPvcTable", "1.3.6.1.2.1.10.46.1.8", false, true, false, false);
                    this.ipoaConfigPvcEntry = new IpoaConfigPvcEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipoaConfigPvcEntry
                    };
                }
                public static final class IpoaConfigPvcEntryEnt extends MIBEntry<IPOAMIBDef>
                {
                    public final IpoaConfigPvcIfIndexEnt ipoaConfigPvcIfIndex;

                    public final IpoaConfigPvcVpiEnt ipoaConfigPvcVpi;

                    public final IpoaConfigPvcVciEnt ipoaConfigPvcVci;

                    public final IpoaConfigPvcDefaultMtuEnt ipoaConfigPvcDefaultMtu;

                    public final IpoaConfigPvcRowStatusEnt ipoaConfigPvcRowStatus;

                    private IpoaConfigPvcEntryEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaConfigPvcEntry", "1.3.6.1.2.1.10.46.1.8.1", false, false, false, true);
                        this.ipoaConfigPvcIfIndex = new IpoaConfigPvcIfIndexEnt(mib, this);
                        this.ipoaConfigPvcVpi = new IpoaConfigPvcVpiEnt(mib, this);
                        this.ipoaConfigPvcVci = new IpoaConfigPvcVciEnt(mib, this);
                        this.ipoaConfigPvcDefaultMtu = new IpoaConfigPvcDefaultMtuEnt(mib, this);
                        this.ipoaConfigPvcRowStatus = new IpoaConfigPvcRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipoaConfigPvcIfIndex,
                            this.ipoaConfigPvcVpi,
                            this.ipoaConfigPvcVci,
                            this.ipoaConfigPvcDefaultMtu,
                            this.ipoaConfigPvcRowStatus
                        };
                    }
                    public static final class IpoaConfigPvcIfIndexEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaConfigPvcIfIndexEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaConfigPvcIfIndex", "1.3.6.1.2.1.10.46.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaConfigPvcVpiEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaConfigPvcVpiEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaConfigPvcVpi", "1.3.6.1.2.1.10.46.1.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaConfigPvcVciEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaConfigPvcVciEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaConfigPvcVci", "1.3.6.1.2.1.10.46.1.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaConfigPvcDefaultMtuEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaConfigPvcDefaultMtuEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaConfigPvcDefaultMtu", "1.3.6.1.2.1.10.46.1.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpoaConfigPvcRowStatusEnt extends MIBEntry<IPOAMIBDef>
                    {
                        private IpoaConfigPvcRowStatusEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                        {
                            super(mib, parent, "ipoaConfigPvcRowStatus", "1.3.6.1.2.1.10.46.1.8.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class IpoaNotificationsEnt extends MIBEntry<IPOAMIBDef>
        {
            /** Notifications*/
            public final IpoaTrapPrefixEnt ipoaTrapPrefix;

            private IpoaNotificationsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
            {
                super(mib, parent, "ipoaNotifications", "1.3.6.1.2.1.10.46.2", false, false, false, false);
                this.ipoaTrapPrefix = new IpoaTrapPrefixEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipoaTrapPrefix
                };
            }
            public static final class IpoaTrapPrefixEnt extends MIBEntry<IPOAMIBDef>
            {
                public final IpoaMtuExceededEnt ipoaMtuExceeded;

                public final IpoaDuplicateIpAddressEnt ipoaDuplicateIpAddress;

                public final IpoaLisCreateEnt ipoaLisCreate;

                public final IpoaLisDeleteEnt ipoaLisDelete;

                private IpoaTrapPrefixEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                {
                    super(mib, parent, "ipoaTrapPrefix", "1.3.6.1.2.1.10.46.2.0", false, false, false, false);
                    this.ipoaMtuExceeded = new IpoaMtuExceededEnt(mib, this);
                    this.ipoaDuplicateIpAddress = new IpoaDuplicateIpAddressEnt(mib, this);
                    this.ipoaLisCreate = new IpoaLisCreateEnt(mib, this);
                    this.ipoaLisDelete = new IpoaLisDeleteEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipoaMtuExceeded,
                        this.ipoaDuplicateIpAddress,
                        this.ipoaLisCreate,
                        this.ipoaLisDelete
                    };
                }
                public static final class IpoaMtuExceededEnt extends MIBEntry<IPOAMIBDef>
                {
                    private IpoaMtuExceededEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaMtuExceeded", "1.3.6.1.2.1.10.46.2.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpoaDuplicateIpAddressEnt extends MIBEntry<IPOAMIBDef>
                {
                    private IpoaDuplicateIpAddressEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaDuplicateIpAddress", "1.3.6.1.2.1.10.46.2.0.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpoaLisCreateEnt extends MIBEntry<IPOAMIBDef>
                {
                    private IpoaLisCreateEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaLisCreate", "1.3.6.1.2.1.10.46.2.0.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpoaLisDeleteEnt extends MIBEntry<IPOAMIBDef>
                {
                    private IpoaLisDeleteEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaLisDelete", "1.3.6.1.2.1.10.46.2.0.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class IpoaConformanceEnt extends MIBEntry<IPOAMIBDef>
        {
            /** Conformance Definitions*/
            public final IpoaGroupsEnt ipoaGroups;

            public final IpoaCompliancesEnt ipoaCompliances;

            private IpoaConformanceEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
            {
                super(mib, parent, "ipoaConformance", "1.3.6.1.2.1.10.46.3", false, false, false, false);
                this.ipoaGroups = new IpoaGroupsEnt(mib, this);
                this.ipoaCompliances = new IpoaCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipoaGroups,
                    this.ipoaCompliances
                };
            }
            public static final class IpoaGroupsEnt extends MIBEntry<IPOAMIBDef>
            {
                /** units of conformance*/
                public final IpoaGeneralGroupEnt ipoaGeneralGroup;

                public final IpoaClientGroupEnt ipoaClientGroup;

                public final IpoaSrvrGroupEnt ipoaSrvrGroup;

                public final IpoaBasicNotificationsGroupEnt ipoaBasicNotificationsGroup;

                public final IpoaSrvrNotificationsGroupEnt ipoaSrvrNotificationsGroup;

                public final IpoaLisNotificationsGroupEnt ipoaLisNotificationsGroup;

                public final IpoaLisTableGroupEnt ipoaLisTableGroup;

                private IpoaGroupsEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                {
                    super(mib, parent, "ipoaGroups", "1.3.6.1.2.1.10.46.3.1", false, false, false, false);
                    this.ipoaGeneralGroup = new IpoaGeneralGroupEnt(mib, this);
                    this.ipoaClientGroup = new IpoaClientGroupEnt(mib, this);
                    this.ipoaSrvrGroup = new IpoaSrvrGroupEnt(mib, this);
                    this.ipoaBasicNotificationsGroup = new IpoaBasicNotificationsGroupEnt(mib, this);
                    this.ipoaSrvrNotificationsGroup = new IpoaSrvrNotificationsGroupEnt(mib, this);
                    this.ipoaLisNotificationsGroup = new IpoaLisNotificationsGroupEnt(mib, this);
                    this.ipoaLisTableGroup = new IpoaLisTableGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipoaGeneralGroup,
                        this.ipoaClientGroup,
                        this.ipoaSrvrGroup,
                        this.ipoaBasicNotificationsGroup,
                        this.ipoaSrvrNotificationsGroup,
                        this.ipoaLisNotificationsGroup,
                        this.ipoaLisTableGroup
                    };
                }
                public static final class IpoaGeneralGroupEnt extends MIBEntry<IPOAMIBDef>
                {
                    private IpoaGeneralGroupEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaGeneralGroup", "1.3.6.1.2.1.10.46.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpoaClientGroupEnt extends MIBEntry<IPOAMIBDef>
                {
                    private IpoaClientGroupEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaClientGroup", "1.3.6.1.2.1.10.46.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpoaSrvrGroupEnt extends MIBEntry<IPOAMIBDef>
                {
                    private IpoaSrvrGroupEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaSrvrGroup", "1.3.6.1.2.1.10.46.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpoaBasicNotificationsGroupEnt extends MIBEntry<IPOAMIBDef>
                {
                    private IpoaBasicNotificationsGroupEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaBasicNotificationsGroup", "1.3.6.1.2.1.10.46.3.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpoaSrvrNotificationsGroupEnt extends MIBEntry<IPOAMIBDef>
                {
                    private IpoaSrvrNotificationsGroupEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaSrvrNotificationsGroup", "1.3.6.1.2.1.10.46.3.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpoaLisNotificationsGroupEnt extends MIBEntry<IPOAMIBDef>
                {
                    private IpoaLisNotificationsGroupEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaLisNotificationsGroup", "1.3.6.1.2.1.10.46.3.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpoaLisTableGroupEnt extends MIBEntry<IPOAMIBDef>
                {
                    private IpoaLisTableGroupEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaLisTableGroup", "1.3.6.1.2.1.10.46.3.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class IpoaCompliancesEnt extends MIBEntry<IPOAMIBDef>
            {
                /** compliance statements*/
                public final IpoaComplianceEnt ipoaCompliance;

                private IpoaCompliancesEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                {
                    super(mib, parent, "ipoaCompliances", "1.3.6.1.2.1.10.46.3.2", false, false, false, false);
                    this.ipoaCompliance = new IpoaComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipoaCompliance
                    };
                }
                public static final class IpoaComplianceEnt extends MIBEntry<IPOAMIBDef>
                {
                    private IpoaComplianceEnt(IPOAMIBDef mib, MIBEntry<IPOAMIBDef> parent)
                    {
                        super(mib, parent, "ipoaCompliance", "1.3.6.1.2.1.10.46.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
