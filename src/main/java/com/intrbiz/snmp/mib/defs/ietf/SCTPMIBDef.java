package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2579]
[RFC2580]*/
public final class SCTPMIBDef extends MIB
{
    public static final SCTPMIBDef SCTPMIB = new SCTPMIBDef();

    static { MIBs.getInstance().registerMIB(SCTPMIBDef.SCTPMIB); }

    /** [RFC3291]

2nd September 2004*/
    public final SctpMIBEnt sctpMIB;

    private SCTPMIBDef()
    {
        super("SCTP-MIB");
        this.sctpMIB = new SctpMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.sctpMIB
        };
    }

    public static final class SctpMIBEnt extends MIBEntry<SCTPMIBDef>
    {
        /** the SCTP base variables group*/
        public final SctpObjectsEnt sctpObjects;

        /** 4.1 Conformance Information*/
        public final SctpMibConformanceEnt sctpMibConformance;

        private SctpMIBEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
        {
            super(mib, parent, "sctpMIB", "1.3.6.1.2.1.104", false, false, false, false);
            this.sctpObjects = new SctpObjectsEnt(mib, this);
            this.sctpMibConformance = new SctpMibConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.sctpObjects,
                this.sctpMibConformance
            };
        }
        public static final class SctpObjectsEnt extends MIBEntry<SCTPMIBDef>
        {
            public final SctpStatsEnt sctpStats;

            public final SctpParamsEnt sctpParams;

            /** TABLES******
the SCTP Association TABLE
The SCTP association table contains information about eachassociation in which the local endpoint is involved.*/
            public final SctpAssocTableEnt sctpAssocTable;

            /** Expanded tables: Including Multi-home feature
Local Address TABLE********************/
            public final SctpAssocLocalAddrTableEnt sctpAssocLocalAddrTable;

            /** Remote Addresses TABLE***********************/
            public final SctpAssocRemAddrTableEnt sctpAssocRemAddrTable;

            /** ASSOCIATION INVERSE TABLE*************************
BY LOCAL PORT*/
            public final SctpLookupLocalPortTableEnt sctpLookupLocalPortTable;

            /** BY REMOTE PORT*/
            public final SctpLookupRemPortTableEnt sctpLookupRemPortTable;

            /** BY REMOTE HOST NAME*/
            public final SctpLookupRemHostNameTableEnt sctpLookupRemHostNameTable;

            /** BY REMOTE PRIMARY IP ADDRESS*/
            public final SctpLookupRemPrimIPAddrTableEnt sctpLookupRemPrimIPAddrTable;

            /** BY REMOTE IP ADDRESS*/
            public final SctpLookupRemIPAddrTableEnt sctpLookupRemIPAddrTable;

            private SctpObjectsEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
            {
                super(mib, parent, "sctpObjects", "1.3.6.1.2.1.104.1", false, false, false, false);
                this.sctpStats = new SctpStatsEnt(mib, this);
                this.sctpParams = new SctpParamsEnt(mib, this);
                this.sctpAssocTable = new SctpAssocTableEnt(mib, this);
                this.sctpAssocLocalAddrTable = new SctpAssocLocalAddrTableEnt(mib, this);
                this.sctpAssocRemAddrTable = new SctpAssocRemAddrTableEnt(mib, this);
                this.sctpLookupLocalPortTable = new SctpLookupLocalPortTableEnt(mib, this);
                this.sctpLookupRemPortTable = new SctpLookupRemPortTableEnt(mib, this);
                this.sctpLookupRemHostNameTable = new SctpLookupRemHostNameTableEnt(mib, this);
                this.sctpLookupRemPrimIPAddrTable = new SctpLookupRemPrimIPAddrTableEnt(mib, this);
                this.sctpLookupRemIPAddrTable = new SctpLookupRemIPAddrTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sctpStats,
                    this.sctpParams,
                    this.sctpAssocTable,
                    this.sctpAssocLocalAddrTable,
                    this.sctpAssocRemAddrTable,
                    this.sctpLookupLocalPortTable,
                    this.sctpLookupRemPortTable,
                    this.sctpLookupRemHostNameTable,
                    this.sctpLookupRemPrimIPAddrTable,
                    this.sctpLookupRemIPAddrTable
                };
            }
            public static final class SctpStatsEnt extends MIBEntry<SCTPMIBDef>
            {
                /** STATISTICS**********
STATE-RELATED STATISTICS*/
                public final SctpCurrEstabEnt sctpCurrEstab;

                public final SctpActiveEstabsEnt sctpActiveEstabs;

                public final SctpPassiveEstabsEnt sctpPassiveEstabs;

                public final SctpAbortedsEnt sctpAborteds;

                public final SctpShutdownsEnt sctpShutdowns;

                /** OTHER LAYER STATISTICS*/
                public final SctpOutOfBluesEnt sctpOutOfBlues;

                public final SctpChecksumErrorsEnt sctpChecksumErrors;

                public final SctpOutCtrlChunksEnt sctpOutCtrlChunks;

                public final SctpOutOrderChunksEnt sctpOutOrderChunks;

                public final SctpOutUnorderChunksEnt sctpOutUnorderChunks;

                public final SctpInCtrlChunksEnt sctpInCtrlChunks;

                public final SctpInOrderChunksEnt sctpInOrderChunks;

                public final SctpInUnorderChunksEnt sctpInUnorderChunks;

                public final SctpFragUsrMsgsEnt sctpFragUsrMsgs;

                public final SctpReasmUsrMsgsEnt sctpReasmUsrMsgs;

                public final SctpOutSCTPPacksEnt sctpOutSCTPPacks;

                public final SctpInSCTPPacksEnt sctpInSCTPPacks;

                public final SctpDiscontinuityTimeEnt sctpDiscontinuityTime;

                private SctpStatsEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                {
                    super(mib, parent, "sctpStats", "1.3.6.1.2.1.104.1.1", false, false, false, false);
                    this.sctpCurrEstab = new SctpCurrEstabEnt(mib, this);
                    this.sctpActiveEstabs = new SctpActiveEstabsEnt(mib, this);
                    this.sctpPassiveEstabs = new SctpPassiveEstabsEnt(mib, this);
                    this.sctpAborteds = new SctpAbortedsEnt(mib, this);
                    this.sctpShutdowns = new SctpShutdownsEnt(mib, this);
                    this.sctpOutOfBlues = new SctpOutOfBluesEnt(mib, this);
                    this.sctpChecksumErrors = new SctpChecksumErrorsEnt(mib, this);
                    this.sctpOutCtrlChunks = new SctpOutCtrlChunksEnt(mib, this);
                    this.sctpOutOrderChunks = new SctpOutOrderChunksEnt(mib, this);
                    this.sctpOutUnorderChunks = new SctpOutUnorderChunksEnt(mib, this);
                    this.sctpInCtrlChunks = new SctpInCtrlChunksEnt(mib, this);
                    this.sctpInOrderChunks = new SctpInOrderChunksEnt(mib, this);
                    this.sctpInUnorderChunks = new SctpInUnorderChunksEnt(mib, this);
                    this.sctpFragUsrMsgs = new SctpFragUsrMsgsEnt(mib, this);
                    this.sctpReasmUsrMsgs = new SctpReasmUsrMsgsEnt(mib, this);
                    this.sctpOutSCTPPacks = new SctpOutSCTPPacksEnt(mib, this);
                    this.sctpInSCTPPacks = new SctpInSCTPPacksEnt(mib, this);
                    this.sctpDiscontinuityTime = new SctpDiscontinuityTimeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sctpCurrEstab,
                        this.sctpActiveEstabs,
                        this.sctpPassiveEstabs,
                        this.sctpAborteds,
                        this.sctpShutdowns,
                        this.sctpOutOfBlues,
                        this.sctpChecksumErrors,
                        this.sctpOutCtrlChunks,
                        this.sctpOutOrderChunks,
                        this.sctpOutUnorderChunks,
                        this.sctpInCtrlChunks,
                        this.sctpInOrderChunks,
                        this.sctpInUnorderChunks,
                        this.sctpFragUsrMsgs,
                        this.sctpReasmUsrMsgs,
                        this.sctpOutSCTPPacks,
                        this.sctpInSCTPPacks,
                        this.sctpDiscontinuityTime
                    };
                }
                public static final class SctpCurrEstabEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpCurrEstabEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpCurrEstab", "1.3.6.1.2.1.104.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpActiveEstabsEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpActiveEstabsEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpActiveEstabs", "1.3.6.1.2.1.104.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpPassiveEstabsEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpPassiveEstabsEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpPassiveEstabs", "1.3.6.1.2.1.104.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpAbortedsEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpAbortedsEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpAborteds", "1.3.6.1.2.1.104.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpShutdownsEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpShutdownsEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpShutdowns", "1.3.6.1.2.1.104.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpOutOfBluesEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpOutOfBluesEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpOutOfBlues", "1.3.6.1.2.1.104.1.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpChecksumErrorsEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpChecksumErrorsEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpChecksumErrors", "1.3.6.1.2.1.104.1.1.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpOutCtrlChunksEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpOutCtrlChunksEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpOutCtrlChunks", "1.3.6.1.2.1.104.1.1.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpOutOrderChunksEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpOutOrderChunksEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpOutOrderChunks", "1.3.6.1.2.1.104.1.1.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpOutUnorderChunksEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpOutUnorderChunksEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpOutUnorderChunks", "1.3.6.1.2.1.104.1.1.10", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpInCtrlChunksEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpInCtrlChunksEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpInCtrlChunks", "1.3.6.1.2.1.104.1.1.11", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpInOrderChunksEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpInOrderChunksEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpInOrderChunks", "1.3.6.1.2.1.104.1.1.12", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpInUnorderChunksEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpInUnorderChunksEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpInUnorderChunks", "1.3.6.1.2.1.104.1.1.13", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpFragUsrMsgsEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpFragUsrMsgsEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpFragUsrMsgs", "1.3.6.1.2.1.104.1.1.14", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpReasmUsrMsgsEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpReasmUsrMsgsEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpReasmUsrMsgs", "1.3.6.1.2.1.104.1.1.15", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpOutSCTPPacksEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpOutSCTPPacksEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpOutSCTPPacks", "1.3.6.1.2.1.104.1.1.16", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpInSCTPPacksEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpInSCTPPacksEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpInSCTPPacks", "1.3.6.1.2.1.104.1.1.17", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpDiscontinuityTimeEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpDiscontinuityTimeEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpDiscontinuityTime", "1.3.6.1.2.1.104.1.1.18", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SctpParamsEnt extends MIBEntry<SCTPMIBDef>
            {
                /** PROTOCOL GENERAL VARIABLES**************************

vanj(2)*/
                public final SctpRtoAlgorithmEnt sctpRtoAlgorithm;

                /** milliseconds*/
                public final SctpRtoMinEnt sctpRtoMin;

                /** milliseconds*/
                public final SctpRtoMaxEnt sctpRtoMax;

                /** milliseconds*/
                public final SctpRtoInitialEnt sctpRtoInitial;

                public final SctpMaxAssocsEnt sctpMaxAssocs;

                /** milliseconds*/
                public final SctpValCookieLifeEnt sctpValCookieLife;

                /** number of attempts*/
                public final SctpMaxInitRetrEnt sctpMaxInitRetr;

                private SctpParamsEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                {
                    super(mib, parent, "sctpParams", "1.3.6.1.2.1.104.1.2", false, false, false, false);
                    this.sctpRtoAlgorithm = new SctpRtoAlgorithmEnt(mib, this);
                    this.sctpRtoMin = new SctpRtoMinEnt(mib, this);
                    this.sctpRtoMax = new SctpRtoMaxEnt(mib, this);
                    this.sctpRtoInitial = new SctpRtoInitialEnt(mib, this);
                    this.sctpMaxAssocs = new SctpMaxAssocsEnt(mib, this);
                    this.sctpValCookieLife = new SctpValCookieLifeEnt(mib, this);
                    this.sctpMaxInitRetr = new SctpMaxInitRetrEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sctpRtoAlgorithm,
                        this.sctpRtoMin,
                        this.sctpRtoMax,
                        this.sctpRtoInitial,
                        this.sctpMaxAssocs,
                        this.sctpValCookieLife,
                        this.sctpMaxInitRetr
                    };
                }
                public static final class SctpRtoAlgorithmEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpRtoAlgorithmEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpRtoAlgorithm", "1.3.6.1.2.1.104.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpRtoMinEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpRtoMinEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpRtoMin", "1.3.6.1.2.1.104.1.2.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpRtoMaxEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpRtoMaxEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpRtoMax", "1.3.6.1.2.1.104.1.2.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpRtoInitialEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpRtoInitialEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpRtoInitial", "1.3.6.1.2.1.104.1.2.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpMaxAssocsEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpMaxAssocsEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpMaxAssocs", "1.3.6.1.2.1.104.1.2.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpValCookieLifeEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpValCookieLifeEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpValCookieLife", "1.3.6.1.2.1.104.1.2.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpMaxInitRetrEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpMaxInitRetrEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpMaxInitRetr", "1.3.6.1.2.1.104.1.2.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SctpAssocTableEnt extends MIBEntry<SCTPMIBDef>
            {
                public final SctpAssocEntryEnt sctpAssocEntry;

                private SctpAssocTableEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                {
                    super(mib, parent, "sctpAssocTable", "1.3.6.1.2.1.104.1.3", false, true, false, false);
                    this.sctpAssocEntry = new SctpAssocEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sctpAssocEntry
                    };
                }
                public static final class SctpAssocEntryEnt extends MIBEntry<SCTPMIBDef>
                {
                    public final SctpAssocIdEnt sctpAssocId;

                    public final SctpAssocRemHostNameEnt sctpAssocRemHostName;

                    public final SctpAssocLocalPortEnt sctpAssocLocalPort;

                    public final SctpAssocRemPortEnt sctpAssocRemPort;

                    public final SctpAssocRemPrimAddrTypeEnt sctpAssocRemPrimAddrType;

                    public final SctpAssocRemPrimAddrEnt sctpAssocRemPrimAddr;

                    /** milliseconds*/
                    public final SctpAssocHeartBeatIntervalEnt sctpAssocHeartBeatInterval;

                    public final SctpAssocStateEnt sctpAssocState;

                    public final SctpAssocInStreamsEnt sctpAssocInStreams;

                    public final SctpAssocOutStreamsEnt sctpAssocOutStreams;

                    /** number of attempts*/
                    public final SctpAssocMaxRetrEnt sctpAssocMaxRetr;

                    public final SctpAssocPrimProcessEnt sctpAssocPrimProcess;

                    /** Association Statistics*/
                    public final SctpAssocT1expiredsEnt sctpAssocT1expireds;

                    public final SctpAssocT2expiredsEnt sctpAssocT2expireds;

                    public final SctpAssocRtxChunksEnt sctpAssocRtxChunks;

                    public final SctpAssocStartTimeEnt sctpAssocStartTime;

                    public final SctpAssocDiscontinuityTimeEnt sctpAssocDiscontinuityTime;

                    private SctpAssocEntryEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpAssocEntry", "1.3.6.1.2.1.104.1.3.1", false, false, false, true);
                        this.sctpAssocId = new SctpAssocIdEnt(mib, this);
                        this.sctpAssocRemHostName = new SctpAssocRemHostNameEnt(mib, this);
                        this.sctpAssocLocalPort = new SctpAssocLocalPortEnt(mib, this);
                        this.sctpAssocRemPort = new SctpAssocRemPortEnt(mib, this);
                        this.sctpAssocRemPrimAddrType = new SctpAssocRemPrimAddrTypeEnt(mib, this);
                        this.sctpAssocRemPrimAddr = new SctpAssocRemPrimAddrEnt(mib, this);
                        this.sctpAssocHeartBeatInterval = new SctpAssocHeartBeatIntervalEnt(mib, this);
                        this.sctpAssocState = new SctpAssocStateEnt(mib, this);
                        this.sctpAssocInStreams = new SctpAssocInStreamsEnt(mib, this);
                        this.sctpAssocOutStreams = new SctpAssocOutStreamsEnt(mib, this);
                        this.sctpAssocMaxRetr = new SctpAssocMaxRetrEnt(mib, this);
                        this.sctpAssocPrimProcess = new SctpAssocPrimProcessEnt(mib, this);
                        this.sctpAssocT1expireds = new SctpAssocT1expiredsEnt(mib, this);
                        this.sctpAssocT2expireds = new SctpAssocT2expiredsEnt(mib, this);
                        this.sctpAssocRtxChunks = new SctpAssocRtxChunksEnt(mib, this);
                        this.sctpAssocStartTime = new SctpAssocStartTimeEnt(mib, this);
                        this.sctpAssocDiscontinuityTime = new SctpAssocDiscontinuityTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sctpAssocId,
                            this.sctpAssocRemHostName,
                            this.sctpAssocLocalPort,
                            this.sctpAssocRemPort,
                            this.sctpAssocRemPrimAddrType,
                            this.sctpAssocRemPrimAddr,
                            this.sctpAssocHeartBeatInterval,
                            this.sctpAssocState,
                            this.sctpAssocInStreams,
                            this.sctpAssocOutStreams,
                            this.sctpAssocMaxRetr,
                            this.sctpAssocPrimProcess,
                            this.sctpAssocT1expireds,
                            this.sctpAssocT2expireds,
                            this.sctpAssocRtxChunks,
                            this.sctpAssocStartTime,
                            this.sctpAssocDiscontinuityTime
                        };
                    }
                    public static final class SctpAssocIdEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocIdEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocId", "1.3.6.1.2.1.104.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocRemHostNameEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocRemHostNameEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocRemHostName", "1.3.6.1.2.1.104.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocLocalPortEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocLocalPortEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocLocalPort", "1.3.6.1.2.1.104.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocRemPortEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocRemPortEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocRemPort", "1.3.6.1.2.1.104.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocRemPrimAddrTypeEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocRemPrimAddrTypeEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocRemPrimAddrType", "1.3.6.1.2.1.104.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocRemPrimAddrEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocRemPrimAddrEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocRemPrimAddr", "1.3.6.1.2.1.104.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocHeartBeatIntervalEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocHeartBeatIntervalEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocHeartBeatInterval", "1.3.6.1.2.1.104.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocStateEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocStateEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocState", "1.3.6.1.2.1.104.1.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocInStreamsEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocInStreamsEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocInStreams", "1.3.6.1.2.1.104.1.3.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocOutStreamsEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocOutStreamsEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocOutStreams", "1.3.6.1.2.1.104.1.3.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocMaxRetrEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocMaxRetrEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocMaxRetr", "1.3.6.1.2.1.104.1.3.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocPrimProcessEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocPrimProcessEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocPrimProcess", "1.3.6.1.2.1.104.1.3.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocT1expiredsEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocT1expiredsEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocT1expireds", "1.3.6.1.2.1.104.1.3.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocT2expiredsEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocT2expiredsEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocT2expireds", "1.3.6.1.2.1.104.1.3.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocRtxChunksEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocRtxChunksEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocRtxChunks", "1.3.6.1.2.1.104.1.3.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocStartTimeEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocStartTimeEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocStartTime", "1.3.6.1.2.1.104.1.3.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocDiscontinuityTimeEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocDiscontinuityTimeEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocDiscontinuityTime", "1.3.6.1.2.1.104.1.3.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SctpAssocLocalAddrTableEnt extends MIBEntry<SCTPMIBDef>
            {
                /** shared index*/
                public final SctpAssocLocalAddrEntryEnt sctpAssocLocalAddrEntry;

                private SctpAssocLocalAddrTableEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                {
                    super(mib, parent, "sctpAssocLocalAddrTable", "1.3.6.1.2.1.104.1.4", false, true, false, false);
                    this.sctpAssocLocalAddrEntry = new SctpAssocLocalAddrEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sctpAssocLocalAddrEntry
                    };
                }
                public static final class SctpAssocLocalAddrEntryEnt extends MIBEntry<SCTPMIBDef>
                {
                    public final SctpAssocLocalAddrTypeEnt sctpAssocLocalAddrType;

                    public final SctpAssocLocalAddrEnt sctpAssocLocalAddr;

                    public final SctpAssocLocalAddrStartTimeEnt sctpAssocLocalAddrStartTime;

                    private SctpAssocLocalAddrEntryEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpAssocLocalAddrEntry", "1.3.6.1.2.1.104.1.4.1", false, false, false, true);
                        this.sctpAssocLocalAddrType = new SctpAssocLocalAddrTypeEnt(mib, this);
                        this.sctpAssocLocalAddr = new SctpAssocLocalAddrEnt(mib, this);
                        this.sctpAssocLocalAddrStartTime = new SctpAssocLocalAddrStartTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sctpAssocLocalAddrType,
                            this.sctpAssocLocalAddr,
                            this.sctpAssocLocalAddrStartTime
                        };
                    }
                    public static final class SctpAssocLocalAddrTypeEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocLocalAddrTypeEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocLocalAddrType", "1.3.6.1.2.1.104.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocLocalAddrEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocLocalAddrEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocLocalAddr", "1.3.6.1.2.1.104.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocLocalAddrStartTimeEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocLocalAddrStartTimeEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocLocalAddrStartTime", "1.3.6.1.2.1.104.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SctpAssocRemAddrTableEnt extends MIBEntry<SCTPMIBDef>
            {
                /** shared index*/
                public final SctpAssocRemAddrEntryEnt sctpAssocRemAddrEntry;

                private SctpAssocRemAddrTableEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                {
                    super(mib, parent, "sctpAssocRemAddrTable", "1.3.6.1.2.1.104.1.5", false, true, false, false);
                    this.sctpAssocRemAddrEntry = new SctpAssocRemAddrEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sctpAssocRemAddrEntry
                    };
                }
                public static final class SctpAssocRemAddrEntryEnt extends MIBEntry<SCTPMIBDef>
                {
                    public final SctpAssocRemAddrTypeEnt sctpAssocRemAddrType;

                    public final SctpAssocRemAddrEnt sctpAssocRemAddr;

                    public final SctpAssocRemAddrActiveEnt sctpAssocRemAddrActive;

                    public final SctpAssocRemAddrHBActiveEnt sctpAssocRemAddrHBActive;

                    public final SctpAssocRemAddrRTOEnt sctpAssocRemAddrRTO;

                    /** number of attempts*/
                    public final SctpAssocRemAddrMaxPathRtxEnt sctpAssocRemAddrMaxPathRtx;

                    /** Remote Address Statistic*/
                    public final SctpAssocRemAddrRtxEnt sctpAssocRemAddrRtx;

                    public final SctpAssocRemAddrStartTimeEnt sctpAssocRemAddrStartTime;

                    private SctpAssocRemAddrEntryEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpAssocRemAddrEntry", "1.3.6.1.2.1.104.1.5.1", false, false, false, true);
                        this.sctpAssocRemAddrType = new SctpAssocRemAddrTypeEnt(mib, this);
                        this.sctpAssocRemAddr = new SctpAssocRemAddrEnt(mib, this);
                        this.sctpAssocRemAddrActive = new SctpAssocRemAddrActiveEnt(mib, this);
                        this.sctpAssocRemAddrHBActive = new SctpAssocRemAddrHBActiveEnt(mib, this);
                        this.sctpAssocRemAddrRTO = new SctpAssocRemAddrRTOEnt(mib, this);
                        this.sctpAssocRemAddrMaxPathRtx = new SctpAssocRemAddrMaxPathRtxEnt(mib, this);
                        this.sctpAssocRemAddrRtx = new SctpAssocRemAddrRtxEnt(mib, this);
                        this.sctpAssocRemAddrStartTime = new SctpAssocRemAddrStartTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sctpAssocRemAddrType,
                            this.sctpAssocRemAddr,
                            this.sctpAssocRemAddrActive,
                            this.sctpAssocRemAddrHBActive,
                            this.sctpAssocRemAddrRTO,
                            this.sctpAssocRemAddrMaxPathRtx,
                            this.sctpAssocRemAddrRtx,
                            this.sctpAssocRemAddrStartTime
                        };
                    }
                    public static final class SctpAssocRemAddrTypeEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocRemAddrTypeEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocRemAddrType", "1.3.6.1.2.1.104.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocRemAddrEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocRemAddrEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocRemAddr", "1.3.6.1.2.1.104.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocRemAddrActiveEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocRemAddrActiveEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocRemAddrActive", "1.3.6.1.2.1.104.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocRemAddrHBActiveEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocRemAddrHBActiveEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocRemAddrHBActive", "1.3.6.1.2.1.104.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocRemAddrRTOEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocRemAddrRTOEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocRemAddrRTO", "1.3.6.1.2.1.104.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocRemAddrMaxPathRtxEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocRemAddrMaxPathRtxEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocRemAddrMaxPathRtx", "1.3.6.1.2.1.104.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocRemAddrRtxEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocRemAddrRtxEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocRemAddrRtx", "1.3.6.1.2.1.104.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SctpAssocRemAddrStartTimeEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpAssocRemAddrStartTimeEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpAssocRemAddrStartTime", "1.3.6.1.2.1.104.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SctpLookupLocalPortTableEnt extends MIBEntry<SCTPMIBDef>
            {
                public final SctpLookupLocalPortEntryEnt sctpLookupLocalPortEntry;

                private SctpLookupLocalPortTableEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                {
                    super(mib, parent, "sctpLookupLocalPortTable", "1.3.6.1.2.1.104.1.6", false, true, false, false);
                    this.sctpLookupLocalPortEntry = new SctpLookupLocalPortEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sctpLookupLocalPortEntry
                    };
                }
                public static final class SctpLookupLocalPortEntryEnt extends MIBEntry<SCTPMIBDef>
                {
                    public final SctpLookupLocalPortStartTimeEnt sctpLookupLocalPortStartTime;

                    private SctpLookupLocalPortEntryEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpLookupLocalPortEntry", "1.3.6.1.2.1.104.1.6.1", false, false, false, true);
                        this.sctpLookupLocalPortStartTime = new SctpLookupLocalPortStartTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sctpLookupLocalPortStartTime
                        };
                    }
                    public static final class SctpLookupLocalPortStartTimeEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpLookupLocalPortStartTimeEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpLookupLocalPortStartTime", "1.3.6.1.2.1.104.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SctpLookupRemPortTableEnt extends MIBEntry<SCTPMIBDef>
            {
                public final SctpLookupRemPortEntryEnt sctpLookupRemPortEntry;

                private SctpLookupRemPortTableEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                {
                    super(mib, parent, "sctpLookupRemPortTable", "1.3.6.1.2.1.104.1.7", false, true, false, false);
                    this.sctpLookupRemPortEntry = new SctpLookupRemPortEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sctpLookupRemPortEntry
                    };
                }
                public static final class SctpLookupRemPortEntryEnt extends MIBEntry<SCTPMIBDef>
                {
                    public final SctpLookupRemPortStartTimeEnt sctpLookupRemPortStartTime;

                    private SctpLookupRemPortEntryEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpLookupRemPortEntry", "1.3.6.1.2.1.104.1.7.1", false, false, false, true);
                        this.sctpLookupRemPortStartTime = new SctpLookupRemPortStartTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sctpLookupRemPortStartTime
                        };
                    }
                    public static final class SctpLookupRemPortStartTimeEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpLookupRemPortStartTimeEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpLookupRemPortStartTime", "1.3.6.1.2.1.104.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SctpLookupRemHostNameTableEnt extends MIBEntry<SCTPMIBDef>
            {
                public final SctpLookupRemHostNameEntryEnt sctpLookupRemHostNameEntry;

                private SctpLookupRemHostNameTableEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                {
                    super(mib, parent, "sctpLookupRemHostNameTable", "1.3.6.1.2.1.104.1.8", false, true, false, false);
                    this.sctpLookupRemHostNameEntry = new SctpLookupRemHostNameEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sctpLookupRemHostNameEntry
                    };
                }
                public static final class SctpLookupRemHostNameEntryEnt extends MIBEntry<SCTPMIBDef>
                {
                    public final SctpLookupRemHostNameStartTimeEnt sctpLookupRemHostNameStartTime;

                    private SctpLookupRemHostNameEntryEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpLookupRemHostNameEntry", "1.3.6.1.2.1.104.1.8.1", false, false, false, true);
                        this.sctpLookupRemHostNameStartTime = new SctpLookupRemHostNameStartTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sctpLookupRemHostNameStartTime
                        };
                    }
                    public static final class SctpLookupRemHostNameStartTimeEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpLookupRemHostNameStartTimeEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpLookupRemHostNameStartTime", "1.3.6.1.2.1.104.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SctpLookupRemPrimIPAddrTableEnt extends MIBEntry<SCTPMIBDef>
            {
                public final SctpLookupRemPrimIPAddrEntryEnt sctpLookupRemPrimIPAddrEntry;

                private SctpLookupRemPrimIPAddrTableEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                {
                    super(mib, parent, "sctpLookupRemPrimIPAddrTable", "1.3.6.1.2.1.104.1.9", false, true, false, false);
                    this.sctpLookupRemPrimIPAddrEntry = new SctpLookupRemPrimIPAddrEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sctpLookupRemPrimIPAddrEntry
                    };
                }
                public static final class SctpLookupRemPrimIPAddrEntryEnt extends MIBEntry<SCTPMIBDef>
                {
                    public final SctpLookupRemPrimIPAddrStartTimeEnt sctpLookupRemPrimIPAddrStartTime;

                    private SctpLookupRemPrimIPAddrEntryEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpLookupRemPrimIPAddrEntry", "1.3.6.1.2.1.104.1.9.1", false, false, false, true);
                        this.sctpLookupRemPrimIPAddrStartTime = new SctpLookupRemPrimIPAddrStartTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sctpLookupRemPrimIPAddrStartTime
                        };
                    }
                    public static final class SctpLookupRemPrimIPAddrStartTimeEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpLookupRemPrimIPAddrStartTimeEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpLookupRemPrimIPAddrStartTime", "1.3.6.1.2.1.104.1.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SctpLookupRemIPAddrTableEnt extends MIBEntry<SCTPMIBDef>
            {
                public final SctpLookupRemIPAddrEntryEnt sctpLookupRemIPAddrEntry;

                private SctpLookupRemIPAddrTableEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                {
                    super(mib, parent, "sctpLookupRemIPAddrTable", "1.3.6.1.2.1.104.1.10", false, true, false, false);
                    this.sctpLookupRemIPAddrEntry = new SctpLookupRemIPAddrEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sctpLookupRemIPAddrEntry
                    };
                }
                public static final class SctpLookupRemIPAddrEntryEnt extends MIBEntry<SCTPMIBDef>
                {
                    public final SctpLookupRemIPAddrStartTimeEnt sctpLookupRemIPAddrStartTime;

                    private SctpLookupRemIPAddrEntryEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpLookupRemIPAddrEntry", "1.3.6.1.2.1.104.1.10.1", false, false, false, true);
                        this.sctpLookupRemIPAddrStartTime = new SctpLookupRemIPAddrStartTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sctpLookupRemIPAddrStartTime
                        };
                    }
                    public static final class SctpLookupRemIPAddrStartTimeEnt extends MIBEntry<SCTPMIBDef>
                    {
                        private SctpLookupRemIPAddrStartTimeEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                        {
                            super(mib, parent, "sctpLookupRemIPAddrStartTime", "1.3.6.1.2.1.104.1.10.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class SctpMibConformanceEnt extends MIBEntry<SCTPMIBDef>
        {
            public final SctpMibCompliancesEnt sctpMibCompliances;

            public final SctpMibGroupsEnt sctpMibGroups;

            private SctpMibConformanceEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
            {
                super(mib, parent, "sctpMibConformance", "1.3.6.1.2.1.104.2", false, false, false, false);
                this.sctpMibCompliances = new SctpMibCompliancesEnt(mib, this);
                this.sctpMibGroups = new SctpMibGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sctpMibCompliances,
                    this.sctpMibGroups
                };
            }
            public static final class SctpMibCompliancesEnt extends MIBEntry<SCTPMIBDef>
            {
                /** 4.1.2 Compliance Statements
MODULE COMPLIANCES*/
                public final SctpMibComplianceEnt sctpMibCompliance;

                private SctpMibCompliancesEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                {
                    super(mib, parent, "sctpMibCompliances", "1.3.6.1.2.1.104.2.1", false, false, false, false);
                    this.sctpMibCompliance = new SctpMibComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sctpMibCompliance
                    };
                }
                public static final class SctpMibComplianceEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpMibComplianceEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpMibCompliance", "1.3.6.1.2.1.104.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SctpMibGroupsEnt extends MIBEntry<SCTPMIBDef>
            {
                /** 4.1.1 Units of conformance
MODULE GROUPS*/
                public final SctpLayerParamsGroupEnt sctpLayerParamsGroup;

                public final SctpStatsGroupEnt sctpStatsGroup;

                public final SctpPerAssocParamsGroupEnt sctpPerAssocParamsGroup;

                public final SctpPerAssocStatsGroupEnt sctpPerAssocStatsGroup;

                public final SctpInverseGroupEnt sctpInverseGroup;

                private SctpMibGroupsEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                {
                    super(mib, parent, "sctpMibGroups", "1.3.6.1.2.1.104.2.2", false, false, false, false);
                    this.sctpLayerParamsGroup = new SctpLayerParamsGroupEnt(mib, this);
                    this.sctpStatsGroup = new SctpStatsGroupEnt(mib, this);
                    this.sctpPerAssocParamsGroup = new SctpPerAssocParamsGroupEnt(mib, this);
                    this.sctpPerAssocStatsGroup = new SctpPerAssocStatsGroupEnt(mib, this);
                    this.sctpInverseGroup = new SctpInverseGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sctpLayerParamsGroup,
                        this.sctpStatsGroup,
                        this.sctpPerAssocParamsGroup,
                        this.sctpPerAssocStatsGroup,
                        this.sctpInverseGroup
                    };
                }
                public static final class SctpLayerParamsGroupEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpLayerParamsGroupEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpLayerParamsGroup", "1.3.6.1.2.1.104.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpStatsGroupEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpStatsGroupEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpStatsGroup", "1.3.6.1.2.1.104.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpPerAssocParamsGroupEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpPerAssocParamsGroupEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpPerAssocParamsGroup", "1.3.6.1.2.1.104.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpPerAssocStatsGroupEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpPerAssocStatsGroupEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpPerAssocStatsGroup", "1.3.6.1.2.1.104.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SctpInverseGroupEnt extends MIBEntry<SCTPMIBDef>
                {
                    private SctpInverseGroupEnt(SCTPMIBDef mib, MIBEntry<SCTPMIBDef> parent)
                    {
                        super(mib, parent, "sctpInverseGroup", "1.3.6.1.2.1.104.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
