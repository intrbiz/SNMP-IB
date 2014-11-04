package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class RTPMIBDef extends MIB
{
    public static final RTPMIBDef RTPMIB = new RTPMIBDef();

    static { MIBs.getInstance().registerMIB(RTPMIBDef.RTPMIB); }

    /** 2 October 2000*/
    public final RtpMIBEnt rtpMIB;

    private RTPMIBDef()
    {
        super("RTP-MIB");
        this.rtpMIB = new RtpMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.rtpMIB
        };
    }

    public static final class RtpMIBEnt extends MIBEntry<RTPMIBDef>
    {
        /** OBJECTS*/
        public final RtpMIBObjectsEnt rtpMIBObjects;

        public final RtpConformanceEnt rtpConformance;

        private RtpMIBEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
        {
            super(mib, parent, "rtpMIB", "1.3.6.1.2.1.87", false, false, false, false);
            this.rtpMIBObjects = new RtpMIBObjectsEnt(mib, this);
            this.rtpConformance = new RtpConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.rtpMIBObjects,
                this.rtpConformance
            };
        }
        public static final class RtpMIBObjectsEnt extends MIBEntry<RTPMIBDef>
        {
            /** SESSION NEW INDEX*/
            public final RtpSessionNewIndexEnt rtpSessionNewIndex;

            /** SESSION INVERSE TABLE*/
            public final RtpSessionInverseTableEnt rtpSessionInverseTable;

            /** SESSION TABLE*/
            public final RtpSessionTableEnt rtpSessionTable;

            /** SENDER INVERSE TABLE*/
            public final RtpSenderInverseTableEnt rtpSenderInverseTable;

            /** SENDERS TABLE*/
            public final RtpSenderTableEnt rtpSenderTable;

            /** RECEIVER INVERSE TABLE*/
            public final RtpRcvrInverseTableEnt rtpRcvrInverseTable;

            /** RECEIVERS TABLE*/
            public final RtpRcvrTableEnt rtpRcvrTable;

            private RtpMIBObjectsEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
            {
                super(mib, parent, "rtpMIBObjects", "1.3.6.1.2.1.87.1", false, false, false, false);
                this.rtpSessionNewIndex = new RtpSessionNewIndexEnt(mib, this);
                this.rtpSessionInverseTable = new RtpSessionInverseTableEnt(mib, this);
                this.rtpSessionTable = new RtpSessionTableEnt(mib, this);
                this.rtpSenderInverseTable = new RtpSenderInverseTableEnt(mib, this);
                this.rtpSenderTable = new RtpSenderTableEnt(mib, this);
                this.rtpRcvrInverseTable = new RtpRcvrInverseTableEnt(mib, this);
                this.rtpRcvrTable = new RtpRcvrTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rtpSessionNewIndex,
                    this.rtpSessionInverseTable,
                    this.rtpSessionTable,
                    this.rtpSenderInverseTable,
                    this.rtpSenderTable,
                    this.rtpRcvrInverseTable,
                    this.rtpRcvrTable
                };
            }
            public static final class RtpSessionNewIndexEnt extends MIBEntry<RTPMIBDef>
            {
                private RtpSessionNewIndexEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                {
                    super(mib, parent, "rtpSessionNewIndex", "1.3.6.1.2.1.87.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RtpSessionInverseTableEnt extends MIBEntry<RTPMIBDef>
            {
                public final RtpSessionInverseEntryEnt rtpSessionInverseEntry;

                private RtpSessionInverseTableEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                {
                    super(mib, parent, "rtpSessionInverseTable", "1.3.6.1.2.1.87.1.2", false, true, false, false);
                    this.rtpSessionInverseEntry = new RtpSessionInverseEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rtpSessionInverseEntry
                    };
                }
                public static final class RtpSessionInverseEntryEnt extends MIBEntry<RTPMIBDef>
                {
                    public final RtpSessionInverseStartTimeEnt rtpSessionInverseStartTime;

                    private RtpSessionInverseEntryEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                    {
                        super(mib, parent, "rtpSessionInverseEntry", "1.3.6.1.2.1.87.1.2.1", false, false, false, true);
                        this.rtpSessionInverseStartTime = new RtpSessionInverseStartTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rtpSessionInverseStartTime
                        };
                    }
                    public static final class RtpSessionInverseStartTimeEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSessionInverseStartTimeEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSessionInverseStartTime", "1.3.6.1.2.1.87.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RtpSessionTableEnt extends MIBEntry<RTPMIBDef>
            {
                public final RtpSessionEntryEnt rtpSessionEntry;

                private RtpSessionTableEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                {
                    super(mib, parent, "rtpSessionTable", "1.3.6.1.2.1.87.1.3", false, true, false, false);
                    this.rtpSessionEntry = new RtpSessionEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rtpSessionEntry
                    };
                }
                public static final class RtpSessionEntryEnt extends MIBEntry<RTPMIBDef>
                {
                    public final RtpSessionIndexEnt rtpSessionIndex;

                    public final RtpSessionDomainEnt rtpSessionDomain;

                    public final RtpSessionRemAddrEnt rtpSessionRemAddr;

                    public final RtpSessionLocAddrEnt rtpSessionLocAddr;

                    public final RtpSessionIfIndexEnt rtpSessionIfIndex;

                    public final RtpSessionSenderJoinsEnt rtpSessionSenderJoins;

                    public final RtpSessionReceiverJoinsEnt rtpSessionReceiverJoins;

                    public final RtpSessionByesEnt rtpSessionByes;

                    public final RtpSessionStartTimeEnt rtpSessionStartTime;

                    public final RtpSessionMonitorEnt rtpSessionMonitor;

                    public final RtpSessionRowStatusEnt rtpSessionRowStatus;

                    private RtpSessionEntryEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                    {
                        super(mib, parent, "rtpSessionEntry", "1.3.6.1.2.1.87.1.3.1", false, false, false, true);
                        this.rtpSessionIndex = new RtpSessionIndexEnt(mib, this);
                        this.rtpSessionDomain = new RtpSessionDomainEnt(mib, this);
                        this.rtpSessionRemAddr = new RtpSessionRemAddrEnt(mib, this);
                        this.rtpSessionLocAddr = new RtpSessionLocAddrEnt(mib, this);
                        this.rtpSessionIfIndex = new RtpSessionIfIndexEnt(mib, this);
                        this.rtpSessionSenderJoins = new RtpSessionSenderJoinsEnt(mib, this);
                        this.rtpSessionReceiverJoins = new RtpSessionReceiverJoinsEnt(mib, this);
                        this.rtpSessionByes = new RtpSessionByesEnt(mib, this);
                        this.rtpSessionStartTime = new RtpSessionStartTimeEnt(mib, this);
                        this.rtpSessionMonitor = new RtpSessionMonitorEnt(mib, this);
                        this.rtpSessionRowStatus = new RtpSessionRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rtpSessionIndex,
                            this.rtpSessionDomain,
                            this.rtpSessionRemAddr,
                            this.rtpSessionLocAddr,
                            this.rtpSessionIfIndex,
                            this.rtpSessionSenderJoins,
                            this.rtpSessionReceiverJoins,
                            this.rtpSessionByes,
                            this.rtpSessionStartTime,
                            this.rtpSessionMonitor,
                            this.rtpSessionRowStatus
                        };
                    }
                    public static final class RtpSessionIndexEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSessionIndexEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSessionIndex", "1.3.6.1.2.1.87.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSessionDomainEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSessionDomainEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSessionDomain", "1.3.6.1.2.1.87.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSessionRemAddrEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSessionRemAddrEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSessionRemAddr", "1.3.6.1.2.1.87.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSessionLocAddrEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSessionLocAddrEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSessionLocAddr", "1.3.6.1.2.1.87.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSessionIfIndexEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSessionIfIndexEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSessionIfIndex", "1.3.6.1.2.1.87.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSessionSenderJoinsEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSessionSenderJoinsEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSessionSenderJoins", "1.3.6.1.2.1.87.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSessionReceiverJoinsEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSessionReceiverJoinsEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSessionReceiverJoins", "1.3.6.1.2.1.87.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSessionByesEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSessionByesEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSessionByes", "1.3.6.1.2.1.87.1.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSessionStartTimeEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSessionStartTimeEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSessionStartTime", "1.3.6.1.2.1.87.1.3.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSessionMonitorEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSessionMonitorEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSessionMonitor", "1.3.6.1.2.1.87.1.3.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSessionRowStatusEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSessionRowStatusEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSessionRowStatus", "1.3.6.1.2.1.87.1.3.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RtpSenderInverseTableEnt extends MIBEntry<RTPMIBDef>
            {
                public final RtpSenderInverseEntryEnt rtpSenderInverseEntry;

                private RtpSenderInverseTableEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                {
                    super(mib, parent, "rtpSenderInverseTable", "1.3.6.1.2.1.87.1.4", false, true, false, false);
                    this.rtpSenderInverseEntry = new RtpSenderInverseEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rtpSenderInverseEntry
                    };
                }
                public static final class RtpSenderInverseEntryEnt extends MIBEntry<RTPMIBDef>
                {
                    public final RtpSenderInverseStartTimeEnt rtpSenderInverseStartTime;

                    private RtpSenderInverseEntryEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                    {
                        super(mib, parent, "rtpSenderInverseEntry", "1.3.6.1.2.1.87.1.4.1", false, false, false, true);
                        this.rtpSenderInverseStartTime = new RtpSenderInverseStartTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rtpSenderInverseStartTime
                        };
                    }
                    public static final class RtpSenderInverseStartTimeEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSenderInverseStartTimeEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSenderInverseStartTime", "1.3.6.1.2.1.87.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RtpSenderTableEnt extends MIBEntry<RTPMIBDef>
            {
                public final RtpSenderEntryEnt rtpSenderEntry;

                private RtpSenderTableEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                {
                    super(mib, parent, "rtpSenderTable", "1.3.6.1.2.1.87.1.5", false, true, false, false);
                    this.rtpSenderEntry = new RtpSenderEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rtpSenderEntry
                    };
                }
                public static final class RtpSenderEntryEnt extends MIBEntry<RTPMIBDef>
                {
                    public final RtpSenderSSRCEnt rtpSenderSSRC;

                    public final RtpSenderCNAMEEnt rtpSenderCNAME;

                    public final RtpSenderAddrEnt rtpSenderAddr;

                    public final RtpSenderPacketsEnt rtpSenderPackets;

                    public final RtpSenderOctetsEnt rtpSenderOctets;

                    public final RtpSenderToolEnt rtpSenderTool;

                    public final RtpSenderSRsEnt rtpSenderSRs;

                    public final RtpSenderSRTimeEnt rtpSenderSRTime;

                    public final RtpSenderPTEnt rtpSenderPT;

                    public final RtpSenderStartTimeEnt rtpSenderStartTime;

                    private RtpSenderEntryEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                    {
                        super(mib, parent, "rtpSenderEntry", "1.3.6.1.2.1.87.1.5.1", false, false, false, true);
                        this.rtpSenderSSRC = new RtpSenderSSRCEnt(mib, this);
                        this.rtpSenderCNAME = new RtpSenderCNAMEEnt(mib, this);
                        this.rtpSenderAddr = new RtpSenderAddrEnt(mib, this);
                        this.rtpSenderPackets = new RtpSenderPacketsEnt(mib, this);
                        this.rtpSenderOctets = new RtpSenderOctetsEnt(mib, this);
                        this.rtpSenderTool = new RtpSenderToolEnt(mib, this);
                        this.rtpSenderSRs = new RtpSenderSRsEnt(mib, this);
                        this.rtpSenderSRTime = new RtpSenderSRTimeEnt(mib, this);
                        this.rtpSenderPT = new RtpSenderPTEnt(mib, this);
                        this.rtpSenderStartTime = new RtpSenderStartTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rtpSenderSSRC,
                            this.rtpSenderCNAME,
                            this.rtpSenderAddr,
                            this.rtpSenderPackets,
                            this.rtpSenderOctets,
                            this.rtpSenderTool,
                            this.rtpSenderSRs,
                            this.rtpSenderSRTime,
                            this.rtpSenderPT,
                            this.rtpSenderStartTime
                        };
                    }
                    public static final class RtpSenderSSRCEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSenderSSRCEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSenderSSRC", "1.3.6.1.2.1.87.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSenderCNAMEEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSenderCNAMEEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSenderCNAME", "1.3.6.1.2.1.87.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSenderAddrEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSenderAddrEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSenderAddr", "1.3.6.1.2.1.87.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSenderPacketsEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSenderPacketsEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSenderPackets", "1.3.6.1.2.1.87.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSenderOctetsEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSenderOctetsEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSenderOctets", "1.3.6.1.2.1.87.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSenderToolEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSenderToolEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSenderTool", "1.3.6.1.2.1.87.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSenderSRsEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSenderSRsEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSenderSRs", "1.3.6.1.2.1.87.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSenderSRTimeEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSenderSRTimeEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSenderSRTime", "1.3.6.1.2.1.87.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSenderPTEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSenderPTEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSenderPT", "1.3.6.1.2.1.87.1.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpSenderStartTimeEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpSenderStartTimeEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpSenderStartTime", "1.3.6.1.2.1.87.1.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RtpRcvrInverseTableEnt extends MIBEntry<RTPMIBDef>
            {
                public final RtpRcvrInverseEntryEnt rtpRcvrInverseEntry;

                private RtpRcvrInverseTableEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                {
                    super(mib, parent, "rtpRcvrInverseTable", "1.3.6.1.2.1.87.1.6", false, true, false, false);
                    this.rtpRcvrInverseEntry = new RtpRcvrInverseEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rtpRcvrInverseEntry
                    };
                }
                public static final class RtpRcvrInverseEntryEnt extends MIBEntry<RTPMIBDef>
                {
                    public final RtpRcvrInverseStartTimeEnt rtpRcvrInverseStartTime;

                    private RtpRcvrInverseEntryEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                    {
                        super(mib, parent, "rtpRcvrInverseEntry", "1.3.6.1.2.1.87.1.6.1", false, false, false, true);
                        this.rtpRcvrInverseStartTime = new RtpRcvrInverseStartTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rtpRcvrInverseStartTime
                        };
                    }
                    public static final class RtpRcvrInverseStartTimeEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpRcvrInverseStartTimeEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpRcvrInverseStartTime", "1.3.6.1.2.1.87.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RtpRcvrTableEnt extends MIBEntry<RTPMIBDef>
            {
                public final RtpRcvrEntryEnt rtpRcvrEntry;

                private RtpRcvrTableEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                {
                    super(mib, parent, "rtpRcvrTable", "1.3.6.1.2.1.87.1.7", false, true, false, false);
                    this.rtpRcvrEntry = new RtpRcvrEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rtpRcvrEntry
                    };
                }
                public static final class RtpRcvrEntryEnt extends MIBEntry<RTPMIBDef>
                {
                    public final RtpRcvrSRCSSRCEnt rtpRcvrSRCSSRC;

                    public final RtpRcvrSSRCEnt rtpRcvrSSRC;

                    public final RtpRcvrCNAMEEnt rtpRcvrCNAME;

                    public final RtpRcvrAddrEnt rtpRcvrAddr;

                    public final RtpRcvrRTTEnt rtpRcvrRTT;

                    public final RtpRcvrLostPacketsEnt rtpRcvrLostPackets;

                    public final RtpRcvrJitterEnt rtpRcvrJitter;

                    public final RtpRcvrToolEnt rtpRcvrTool;

                    public final RtpRcvrRRsEnt rtpRcvrRRs;

                    public final RtpRcvrRRTimeEnt rtpRcvrRRTime;

                    public final RtpRcvrPTEnt rtpRcvrPT;

                    public final RtpRcvrPacketsEnt rtpRcvrPackets;

                    public final RtpRcvrOctetsEnt rtpRcvrOctets;

                    public final RtpRcvrStartTimeEnt rtpRcvrStartTime;

                    private RtpRcvrEntryEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                    {
                        super(mib, parent, "rtpRcvrEntry", "1.3.6.1.2.1.87.1.7.1", false, false, false, true);
                        this.rtpRcvrSRCSSRC = new RtpRcvrSRCSSRCEnt(mib, this);
                        this.rtpRcvrSSRC = new RtpRcvrSSRCEnt(mib, this);
                        this.rtpRcvrCNAME = new RtpRcvrCNAMEEnt(mib, this);
                        this.rtpRcvrAddr = new RtpRcvrAddrEnt(mib, this);
                        this.rtpRcvrRTT = new RtpRcvrRTTEnt(mib, this);
                        this.rtpRcvrLostPackets = new RtpRcvrLostPacketsEnt(mib, this);
                        this.rtpRcvrJitter = new RtpRcvrJitterEnt(mib, this);
                        this.rtpRcvrTool = new RtpRcvrToolEnt(mib, this);
                        this.rtpRcvrRRs = new RtpRcvrRRsEnt(mib, this);
                        this.rtpRcvrRRTime = new RtpRcvrRRTimeEnt(mib, this);
                        this.rtpRcvrPT = new RtpRcvrPTEnt(mib, this);
                        this.rtpRcvrPackets = new RtpRcvrPacketsEnt(mib, this);
                        this.rtpRcvrOctets = new RtpRcvrOctetsEnt(mib, this);
                        this.rtpRcvrStartTime = new RtpRcvrStartTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rtpRcvrSRCSSRC,
                            this.rtpRcvrSSRC,
                            this.rtpRcvrCNAME,
                            this.rtpRcvrAddr,
                            this.rtpRcvrRTT,
                            this.rtpRcvrLostPackets,
                            this.rtpRcvrJitter,
                            this.rtpRcvrTool,
                            this.rtpRcvrRRs,
                            this.rtpRcvrRRTime,
                            this.rtpRcvrPT,
                            this.rtpRcvrPackets,
                            this.rtpRcvrOctets,
                            this.rtpRcvrStartTime
                        };
                    }
                    public static final class RtpRcvrSRCSSRCEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpRcvrSRCSSRCEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpRcvrSRCSSRC", "1.3.6.1.2.1.87.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpRcvrSSRCEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpRcvrSSRCEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpRcvrSSRC", "1.3.6.1.2.1.87.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpRcvrCNAMEEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpRcvrCNAMEEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpRcvrCNAME", "1.3.6.1.2.1.87.1.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpRcvrAddrEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpRcvrAddrEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpRcvrAddr", "1.3.6.1.2.1.87.1.7.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpRcvrRTTEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpRcvrRTTEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpRcvrRTT", "1.3.6.1.2.1.87.1.7.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpRcvrLostPacketsEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpRcvrLostPacketsEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpRcvrLostPackets", "1.3.6.1.2.1.87.1.7.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpRcvrJitterEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpRcvrJitterEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpRcvrJitter", "1.3.6.1.2.1.87.1.7.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpRcvrToolEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpRcvrToolEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpRcvrTool", "1.3.6.1.2.1.87.1.7.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpRcvrRRsEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpRcvrRRsEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpRcvrRRs", "1.3.6.1.2.1.87.1.7.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpRcvrRRTimeEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpRcvrRRTimeEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpRcvrRRTime", "1.3.6.1.2.1.87.1.7.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpRcvrPTEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpRcvrPTEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpRcvrPT", "1.3.6.1.2.1.87.1.7.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpRcvrPacketsEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpRcvrPacketsEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpRcvrPackets", "1.3.6.1.2.1.87.1.7.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpRcvrOctetsEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpRcvrOctetsEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpRcvrOctets", "1.3.6.1.2.1.87.1.7.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RtpRcvrStartTimeEnt extends MIBEntry<RTPMIBDef>
                    {
                        private RtpRcvrStartTimeEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                        {
                            super(mib, parent, "rtpRcvrStartTime", "1.3.6.1.2.1.87.1.7.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class RtpConformanceEnt extends MIBEntry<RTPMIBDef>
        {
            /** MODULE GROUPSThere are two types of RTP Systems, RTP hosts and RTP Monitors.Thus there are three kinds of objects: 1) Objects common to bothkinds of systems, 2) Objects unique to RTP Hosts and 3) Objectsunique to RTP Monitors.  There is a fourth group, 4) Objects thatSHOULD be implemented by Multicast hosts and RTP Monitors*/
            public final RtpGroupsEnt rtpGroups;

            /** Compliance*/
            public final RtpCompliancesEnt rtpCompliances;

            private RtpConformanceEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
            {
                super(mib, parent, "rtpConformance", "1.3.6.1.2.1.87.2", false, false, false, false);
                this.rtpGroups = new RtpGroupsEnt(mib, this);
                this.rtpCompliances = new RtpCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rtpGroups,
                    this.rtpCompliances
                };
            }
            public static final class RtpGroupsEnt extends MIBEntry<RTPMIBDef>
            {
                public final RtpSystemGroupEnt rtpSystemGroup;

                public final RtpHostGroupEnt rtpHostGroup;

                public final RtpMonitorGroupEnt rtpMonitorGroup;

                public final RtpInverseGroupEnt rtpInverseGroup;

                private RtpGroupsEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                {
                    super(mib, parent, "rtpGroups", "1.3.6.1.2.1.87.2.1", false, false, false, false);
                    this.rtpSystemGroup = new RtpSystemGroupEnt(mib, this);
                    this.rtpHostGroup = new RtpHostGroupEnt(mib, this);
                    this.rtpMonitorGroup = new RtpMonitorGroupEnt(mib, this);
                    this.rtpInverseGroup = new RtpInverseGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rtpSystemGroup,
                        this.rtpHostGroup,
                        this.rtpMonitorGroup,
                        this.rtpInverseGroup
                    };
                }
                public static final class RtpSystemGroupEnt extends MIBEntry<RTPMIBDef>
                {
                    private RtpSystemGroupEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                    {
                        super(mib, parent, "rtpSystemGroup", "1.3.6.1.2.1.87.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RtpHostGroupEnt extends MIBEntry<RTPMIBDef>
                {
                    private RtpHostGroupEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                    {
                        super(mib, parent, "rtpHostGroup", "1.3.6.1.2.1.87.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RtpMonitorGroupEnt extends MIBEntry<RTPMIBDef>
                {
                    private RtpMonitorGroupEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                    {
                        super(mib, parent, "rtpMonitorGroup", "1.3.6.1.2.1.87.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RtpInverseGroupEnt extends MIBEntry<RTPMIBDef>
                {
                    private RtpInverseGroupEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                    {
                        super(mib, parent, "rtpInverseGroup", "1.3.6.1.2.1.87.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class RtpCompliancesEnt extends MIBEntry<RTPMIBDef>
            {
                public final RtpHostComplianceEnt rtpHostCompliance;

                public final RtpMonitorComplianceEnt rtpMonitorCompliance;

                private RtpCompliancesEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                {
                    super(mib, parent, "rtpCompliances", "1.3.6.1.2.1.87.2.2", false, false, false, false);
                    this.rtpHostCompliance = new RtpHostComplianceEnt(mib, this);
                    this.rtpMonitorCompliance = new RtpMonitorComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rtpHostCompliance,
                        this.rtpMonitorCompliance
                    };
                }
                public static final class RtpHostComplianceEnt extends MIBEntry<RTPMIBDef>
                {
                    private RtpHostComplianceEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                    {
                        super(mib, parent, "rtpHostCompliance", "1.3.6.1.2.1.87.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RtpMonitorComplianceEnt extends MIBEntry<RTPMIBDef>
                {
                    private RtpMonitorComplianceEnt(RTPMIBDef mib, MIBEntry<RTPMIBDef> parent)
                    {
                        super(mib, parent, "rtpMonitorCompliance", "1.3.6.1.2.1.87.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
