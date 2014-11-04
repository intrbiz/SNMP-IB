package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**end of conformance statement*/
public final class HPRMIBDef extends MIB
{
    public static final HPRMIBDef HPRMIB = new HPRMIBDef();

    static { MIBs.getInstance().registerMIB(HPRMIBDef.HPRMIB); }

    public final HprMIBEnt hprMIB;

    private HPRMIBDef()
    {
        super("HPR-MIB");
        this.hprMIB = new HprMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.hprMIB
        };
    }

    public static final class HprMIBEnt extends MIBEntry<HPRMIBDef>
    {
        /** **********************************************************************/
        public final HprObjectsEnt hprObjects;

        /** ***************************************************************Conformance information****************************************************************/
        public final HprConformanceEnt hprConformance;

        private HprMIBEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
        {
            super(mib, parent, "hprMIB", "1.3.6.1.2.1.34.6", false, false, false, false);
            this.hprObjects = new HprObjectsEnt(mib, this);
            this.hprConformance = new HprConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.hprObjects,
                this.hprConformance
            };
        }
        public static final class HprObjectsEnt extends MIBEntry<HPRMIBDef>
        {
            /** *********************************************************************
**********************************************************************/
            public final HprGlobalEnt hprGlobal;

            /** **********************************************************************/
            public final HprAnrRoutingEnt hprAnrRouting;

            /** **********************************************************************/
            public final HprTransportUserEnt hprTransportUser;

            /** **********************************************************************/
            public final HprRtpEnt hprRtp;

            private HprObjectsEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
            {
                super(mib, parent, "hprObjects", "1.3.6.1.2.1.34.6.1", false, false, false, false);
                this.hprGlobal = new HprGlobalEnt(mib, this);
                this.hprAnrRouting = new HprAnrRoutingEnt(mib, this);
                this.hprTransportUser = new HprTransportUserEnt(mib, this);
                this.hprRtp = new HprRtpEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hprGlobal,
                    this.hprAnrRouting,
                    this.hprTransportUser,
                    this.hprRtp
                };
            }
            public static final class HprGlobalEnt extends MIBEntry<HPRMIBDef>
            {
                /** *********************************************************************The hprGlobal group applies to both intermediate and end nodes.**********************************************************************/
                public final HprNodeCpNameEnt hprNodeCpName;

                public final HprOperatorPathSwitchSupportEnt hprOperatorPathSwitchSupport;

                private HprGlobalEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                {
                    super(mib, parent, "hprGlobal", "1.3.6.1.2.1.34.6.1.1", false, false, false, false);
                    this.hprNodeCpName = new HprNodeCpNameEnt(mib, this);
                    this.hprOperatorPathSwitchSupport = new HprOperatorPathSwitchSupportEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hprNodeCpName,
                        this.hprOperatorPathSwitchSupport
                    };
                }
                public static final class HprNodeCpNameEnt extends MIBEntry<HPRMIBDef>
                {
                    private HprNodeCpNameEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                    {
                        super(mib, parent, "hprNodeCpName", "1.3.6.1.2.1.34.6.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HprOperatorPathSwitchSupportEnt extends MIBEntry<HPRMIBDef>
                {
                    private HprOperatorPathSwitchSupportEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                    {
                        super(mib, parent, "hprOperatorPathSwitchSupport", "1.3.6.1.2.1.34.6.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class HprAnrRoutingEnt extends MIBEntry<HPRMIBDef>
            {
                /** **********************************************************************/
                public final HprAnrsAssignedEnt hprAnrsAssigned;

                public final HprAnrCounterStateEnt hprAnrCounterState;

                public final HprAnrCounterStateTimeEnt hprAnrCounterStateTime;

                public final HprAnrRoutingTableEnt hprAnrRoutingTable;

                private HprAnrRoutingEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                {
                    super(mib, parent, "hprAnrRouting", "1.3.6.1.2.1.34.6.1.2", false, false, false, false);
                    this.hprAnrsAssigned = new HprAnrsAssignedEnt(mib, this);
                    this.hprAnrCounterState = new HprAnrCounterStateEnt(mib, this);
                    this.hprAnrCounterStateTime = new HprAnrCounterStateTimeEnt(mib, this);
                    this.hprAnrRoutingTable = new HprAnrRoutingTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hprAnrsAssigned,
                        this.hprAnrCounterState,
                        this.hprAnrCounterStateTime,
                        this.hprAnrRoutingTable
                    };
                }
                public static final class HprAnrsAssignedEnt extends MIBEntry<HPRMIBDef>
                {
                    private HprAnrsAssignedEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                    {
                        super(mib, parent, "hprAnrsAssigned", "1.3.6.1.2.1.34.6.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HprAnrCounterStateEnt extends MIBEntry<HPRMIBDef>
                {
                    private HprAnrCounterStateEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                    {
                        super(mib, parent, "hprAnrCounterState", "1.3.6.1.2.1.34.6.1.2.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HprAnrCounterStateTimeEnt extends MIBEntry<HPRMIBDef>
                {
                    private HprAnrCounterStateTimeEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                    {
                        super(mib, parent, "hprAnrCounterStateTime", "1.3.6.1.2.1.34.6.1.2.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HprAnrRoutingTableEnt extends MIBEntry<HPRMIBDef>
                {
                    public final HprAnrRoutingEntryEnt hprAnrRoutingEntry;

                    private HprAnrRoutingTableEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                    {
                        super(mib, parent, "hprAnrRoutingTable", "1.3.6.1.2.1.34.6.1.2.4", false, true, false, false);
                        this.hprAnrRoutingEntry = new HprAnrRoutingEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hprAnrRoutingEntry
                        };
                    }
                    public static final class HprAnrRoutingEntryEnt extends MIBEntry<HPRMIBDef>
                    {
                        public final HprAnrLabelEnt hprAnrLabel;

                        public final HprAnrTypeEnt hprAnrType;

                        public final HprAnrOutTgDestEnt hprAnrOutTgDest;

                        public final HprAnrOutTgNumEnt hprAnrOutTgNum;

                        public final HprAnrPacketsReceivedEnt hprAnrPacketsReceived;

                        public final HprAnrCounterDisconTimeEnt hprAnrCounterDisconTime;

                        private HprAnrRoutingEntryEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                        {
                            super(mib, parent, "hprAnrRoutingEntry", "1.3.6.1.2.1.34.6.1.2.4.1", false, false, false, true);
                            this.hprAnrLabel = new HprAnrLabelEnt(mib, this);
                            this.hprAnrType = new HprAnrTypeEnt(mib, this);
                            this.hprAnrOutTgDest = new HprAnrOutTgDestEnt(mib, this);
                            this.hprAnrOutTgNum = new HprAnrOutTgNumEnt(mib, this);
                            this.hprAnrPacketsReceived = new HprAnrPacketsReceivedEnt(mib, this);
                            this.hprAnrCounterDisconTime = new HprAnrCounterDisconTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.hprAnrLabel,
                                this.hprAnrType,
                                this.hprAnrOutTgDest,
                                this.hprAnrOutTgNum,
                                this.hprAnrPacketsReceived,
                                this.hprAnrCounterDisconTime
                            };
                        }
                        public static final class HprAnrLabelEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprAnrLabelEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprAnrLabel", "1.3.6.1.2.1.34.6.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprAnrTypeEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprAnrTypeEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprAnrType", "1.3.6.1.2.1.34.6.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprAnrOutTgDestEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprAnrOutTgDestEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprAnrOutTgDest", "1.3.6.1.2.1.34.6.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprAnrOutTgNumEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprAnrOutTgNumEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprAnrOutTgNum", "1.3.6.1.2.1.34.6.1.2.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprAnrPacketsReceivedEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprAnrPacketsReceivedEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprAnrPacketsReceived", "1.3.6.1.2.1.34.6.1.2.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprAnrCounterDisconTimeEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprAnrCounterDisconTimeEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprAnrCounterDisconTime", "1.3.6.1.2.1.34.6.1.2.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class HprTransportUserEnt extends MIBEntry<HPRMIBDef>
            {
                /** *********************************************************************Transport Service User (TU) Table: (RTP Connection Users)There will be several users of the HPR transport and each HPR nodeshall maintain a table of these users.**********************************************************************/
                public final HprNceTableEnt hprNceTable;

                private HprTransportUserEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                {
                    super(mib, parent, "hprTransportUser", "1.3.6.1.2.1.34.6.1.3", false, false, false, false);
                    this.hprNceTable = new HprNceTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hprNceTable
                    };
                }
                public static final class HprNceTableEnt extends MIBEntry<HPRMIBDef>
                {
                    public final HprNceEntryEnt hprNceEntry;

                    private HprNceTableEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                    {
                        super(mib, parent, "hprNceTable", "1.3.6.1.2.1.34.6.1.3.1", false, true, false, false);
                        this.hprNceEntry = new HprNceEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hprNceEntry
                        };
                    }
                    public static final class HprNceEntryEnt extends MIBEntry<HPRMIBDef>
                    {
                        public final HprNceIdEnt hprNceId;

                        public final HprNceTypeEnt hprNceType;

                        public final HprNceDefaultEnt hprNceDefault;

                        public final HprNceInstanceIdEnt hprNceInstanceId;

                        private HprNceEntryEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                        {
                            super(mib, parent, "hprNceEntry", "1.3.6.1.2.1.34.6.1.3.1.1", false, false, false, true);
                            this.hprNceId = new HprNceIdEnt(mib, this);
                            this.hprNceType = new HprNceTypeEnt(mib, this);
                            this.hprNceDefault = new HprNceDefaultEnt(mib, this);
                            this.hprNceInstanceId = new HprNceInstanceIdEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.hprNceId,
                                this.hprNceType,
                                this.hprNceDefault,
                                this.hprNceInstanceId
                            };
                        }
                        public static final class HprNceIdEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprNceIdEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprNceId", "1.3.6.1.2.1.34.6.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprNceTypeEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprNceTypeEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprNceType", "1.3.6.1.2.1.34.6.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprNceDefaultEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprNceDefaultEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprNceDefault", "1.3.6.1.2.1.34.6.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprNceInstanceIdEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprNceInstanceIdEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprNceInstanceId", "1.3.6.1.2.1.34.6.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class HprRtpEnt extends MIBEntry<HPRMIBDef>
            {
                /** ******************************************************************************************************************************************The RTP group is implemented by all managed nodes supporting theHPR Transport Tower.  The group contains several scalars (simpleobjects) and a table.*********************************************************************
**********************************************************************/
                public final HprRtpGlobeEnt hprRtpGlobe;

                /** *********************************************************************The RTP Connection TableThere may be many RTP connections on a node supporting the functionsspecified in the RTP option set.  Each node implementing this optionset shall maintain a table of these RTP connections.**********************************************************************/
                public final HprRtpTableEnt hprRtpTable;

                /** *********************************************************************The RTP Connection Status TableThis table contains statistics and historical information related toboth successful and unsuccessful RTP path switches.  Thisinformation can be important for both trend analysis and problemdetermination.Note the terminology here:  when RTP is triggered to find a new pathfor a connection, this initiates a 'path switch,' which will end upbeing either successful or unsuccessful.  During this path switch,RTP will make one or more 'path switch attempts,' which are attemptsto find a new path for the connection and switch the connection toit.  This 'new' path may be the same path that the connection wasusing before the path switch.It is an implementation option how many entries to keep in thistable, and how long to retain any individual entry.**********************************************************************/
                public final HprRtpStatusTableEnt hprRtpStatusTable;

                private HprRtpEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                {
                    super(mib, parent, "hprRtp", "1.3.6.1.2.1.34.6.1.4", false, false, false, false);
                    this.hprRtpGlobe = new HprRtpGlobeEnt(mib, this);
                    this.hprRtpTable = new HprRtpTableEnt(mib, this);
                    this.hprRtpStatusTable = new HprRtpStatusTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hprRtpGlobe,
                        this.hprRtpTable,
                        this.hprRtpStatusTable
                    };
                }
                public static final class HprRtpGlobeEnt extends MIBEntry<HPRMIBDef>
                {
                    /** **********************************************************************/
                    public final HprRtpGlobeConnSetupsEnt hprRtpGlobeConnSetups;

                    public final HprRtpGlobeCtrStateEnt hprRtpGlobeCtrState;

                    public final HprRtpGlobeCtrStateTimeEnt hprRtpGlobeCtrStateTime;

                    private HprRtpGlobeEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                    {
                        super(mib, parent, "hprRtpGlobe", "1.3.6.1.2.1.34.6.1.4.1", false, false, false, false);
                        this.hprRtpGlobeConnSetups = new HprRtpGlobeConnSetupsEnt(mib, this);
                        this.hprRtpGlobeCtrState = new HprRtpGlobeCtrStateEnt(mib, this);
                        this.hprRtpGlobeCtrStateTime = new HprRtpGlobeCtrStateTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hprRtpGlobeConnSetups,
                            this.hprRtpGlobeCtrState,
                            this.hprRtpGlobeCtrStateTime
                        };
                    }
                    public static final class HprRtpGlobeConnSetupsEnt extends MIBEntry<HPRMIBDef>
                    {
                        private HprRtpGlobeConnSetupsEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                        {
                            super(mib, parent, "hprRtpGlobeConnSetups", "1.3.6.1.2.1.34.6.1.4.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HprRtpGlobeCtrStateEnt extends MIBEntry<HPRMIBDef>
                    {
                        private HprRtpGlobeCtrStateEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                        {
                            super(mib, parent, "hprRtpGlobeCtrState", "1.3.6.1.2.1.34.6.1.4.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HprRtpGlobeCtrStateTimeEnt extends MIBEntry<HPRMIBDef>
                    {
                        private HprRtpGlobeCtrStateTimeEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                        {
                            super(mib, parent, "hprRtpGlobeCtrStateTime", "1.3.6.1.2.1.34.6.1.4.1.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class HprRtpTableEnt extends MIBEntry<HPRMIBDef>
                {
                    public final HprRtpEntryEnt hprRtpEntry;

                    private HprRtpTableEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                    {
                        super(mib, parent, "hprRtpTable", "1.3.6.1.2.1.34.6.1.4.2", false, true, false, false);
                        this.hprRtpEntry = new HprRtpEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hprRtpEntry
                        };
                    }
                    public static final class HprRtpEntryEnt extends MIBEntry<HPRMIBDef>
                    {
                        public final HprRtpLocNceIdEnt hprRtpLocNceId;

                        public final HprRtpLocTcidEnt hprRtpLocTcid;

                        public final HprRtpRemCpNameEnt hprRtpRemCpName;

                        public final HprRtpRemNceIdEnt hprRtpRemNceId;

                        public final HprRtpRemTcidEnt hprRtpRemTcid;

                        public final HprRtpPathSwitchTriggerEnt hprRtpPathSwitchTrigger;

                        public final HprRtpRscvEnt hprRtpRscv;

                        public final HprRtpTopicEnt hprRtpTopic;

                        public final HprRtpStateEnt hprRtpState;

                        public final HprRtpUpTimeEnt hprRtpUpTime;

                        public final HprRtpLivenessTimerEnt hprRtpLivenessTimer;

                        public final HprRtpShortReqTimerEnt hprRtpShortReqTimer;

                        public final HprRtpPathSwTimerEnt hprRtpPathSwTimer;

                        public final HprRtpLivenessTimeoutsEnt hprRtpLivenessTimeouts;

                        public final HprRtpShortReqTimeoutsEnt hprRtpShortReqTimeouts;

                        public final HprRtpMaxSendRateEnt hprRtpMaxSendRate;

                        public final HprRtpMinSendRateEnt hprRtpMinSendRate;

                        public final HprRtpCurSendRateEnt hprRtpCurSendRate;

                        public final HprRtpSmRdTripDelayEnt hprRtpSmRdTripDelay;

                        public final HprRtpSendPacketsEnt hprRtpSendPackets;

                        public final HprRtpRecvPacketsEnt hprRtpRecvPackets;

                        public final HprRtpSendBytesEnt hprRtpSendBytes;

                        public final HprRtpRecvBytesEnt hprRtpRecvBytes;

                        public final HprRtpRetrPacketsEnt hprRtpRetrPackets;

                        public final HprRtpPacketsDiscardedEnt hprRtpPacketsDiscarded;

                        public final HprRtpDetectGapsEnt hprRtpDetectGaps;

                        public final HprRtpRateReqSendsEnt hprRtpRateReqSends;

                        public final HprRtpOkErrPathSwsEnt hprRtpOkErrPathSws;

                        public final HprRtpBadErrPathSwsEnt hprRtpBadErrPathSws;

                        public final HprRtpOkOpPathSwsEnt hprRtpOkOpPathSws;

                        public final HprRtpBadOpPathSwsEnt hprRtpBadOpPathSws;

                        public final HprRtpCounterDisconTimeEnt hprRtpCounterDisconTime;

                        private HprRtpEntryEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                        {
                            super(mib, parent, "hprRtpEntry", "1.3.6.1.2.1.34.6.1.4.2.1", false, false, false, true);
                            this.hprRtpLocNceId = new HprRtpLocNceIdEnt(mib, this);
                            this.hprRtpLocTcid = new HprRtpLocTcidEnt(mib, this);
                            this.hprRtpRemCpName = new HprRtpRemCpNameEnt(mib, this);
                            this.hprRtpRemNceId = new HprRtpRemNceIdEnt(mib, this);
                            this.hprRtpRemTcid = new HprRtpRemTcidEnt(mib, this);
                            this.hprRtpPathSwitchTrigger = new HprRtpPathSwitchTriggerEnt(mib, this);
                            this.hprRtpRscv = new HprRtpRscvEnt(mib, this);
                            this.hprRtpTopic = new HprRtpTopicEnt(mib, this);
                            this.hprRtpState = new HprRtpStateEnt(mib, this);
                            this.hprRtpUpTime = new HprRtpUpTimeEnt(mib, this);
                            this.hprRtpLivenessTimer = new HprRtpLivenessTimerEnt(mib, this);
                            this.hprRtpShortReqTimer = new HprRtpShortReqTimerEnt(mib, this);
                            this.hprRtpPathSwTimer = new HprRtpPathSwTimerEnt(mib, this);
                            this.hprRtpLivenessTimeouts = new HprRtpLivenessTimeoutsEnt(mib, this);
                            this.hprRtpShortReqTimeouts = new HprRtpShortReqTimeoutsEnt(mib, this);
                            this.hprRtpMaxSendRate = new HprRtpMaxSendRateEnt(mib, this);
                            this.hprRtpMinSendRate = new HprRtpMinSendRateEnt(mib, this);
                            this.hprRtpCurSendRate = new HprRtpCurSendRateEnt(mib, this);
                            this.hprRtpSmRdTripDelay = new HprRtpSmRdTripDelayEnt(mib, this);
                            this.hprRtpSendPackets = new HprRtpSendPacketsEnt(mib, this);
                            this.hprRtpRecvPackets = new HprRtpRecvPacketsEnt(mib, this);
                            this.hprRtpSendBytes = new HprRtpSendBytesEnt(mib, this);
                            this.hprRtpRecvBytes = new HprRtpRecvBytesEnt(mib, this);
                            this.hprRtpRetrPackets = new HprRtpRetrPacketsEnt(mib, this);
                            this.hprRtpPacketsDiscarded = new HprRtpPacketsDiscardedEnt(mib, this);
                            this.hprRtpDetectGaps = new HprRtpDetectGapsEnt(mib, this);
                            this.hprRtpRateReqSends = new HprRtpRateReqSendsEnt(mib, this);
                            this.hprRtpOkErrPathSws = new HprRtpOkErrPathSwsEnt(mib, this);
                            this.hprRtpBadErrPathSws = new HprRtpBadErrPathSwsEnt(mib, this);
                            this.hprRtpOkOpPathSws = new HprRtpOkOpPathSwsEnt(mib, this);
                            this.hprRtpBadOpPathSws = new HprRtpBadOpPathSwsEnt(mib, this);
                            this.hprRtpCounterDisconTime = new HprRtpCounterDisconTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.hprRtpLocNceId,
                                this.hprRtpLocTcid,
                                this.hprRtpRemCpName,
                                this.hprRtpRemNceId,
                                this.hprRtpRemTcid,
                                this.hprRtpPathSwitchTrigger,
                                this.hprRtpRscv,
                                this.hprRtpTopic,
                                this.hprRtpState,
                                this.hprRtpUpTime,
                                this.hprRtpLivenessTimer,
                                this.hprRtpShortReqTimer,
                                this.hprRtpPathSwTimer,
                                this.hprRtpLivenessTimeouts,
                                this.hprRtpShortReqTimeouts,
                                this.hprRtpMaxSendRate,
                                this.hprRtpMinSendRate,
                                this.hprRtpCurSendRate,
                                this.hprRtpSmRdTripDelay,
                                this.hprRtpSendPackets,
                                this.hprRtpRecvPackets,
                                this.hprRtpSendBytes,
                                this.hprRtpRecvBytes,
                                this.hprRtpRetrPackets,
                                this.hprRtpPacketsDiscarded,
                                this.hprRtpDetectGaps,
                                this.hprRtpRateReqSends,
                                this.hprRtpOkErrPathSws,
                                this.hprRtpBadErrPathSws,
                                this.hprRtpOkOpPathSws,
                                this.hprRtpBadOpPathSws,
                                this.hprRtpCounterDisconTime
                            };
                        }
                        public static final class HprRtpLocNceIdEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpLocNceIdEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpLocNceId", "1.3.6.1.2.1.34.6.1.4.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpLocTcidEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpLocTcidEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpLocTcid", "1.3.6.1.2.1.34.6.1.4.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpRemCpNameEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpRemCpNameEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpRemCpName", "1.3.6.1.2.1.34.6.1.4.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpRemNceIdEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpRemNceIdEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpRemNceId", "1.3.6.1.2.1.34.6.1.4.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpRemTcidEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpRemTcidEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpRemTcid", "1.3.6.1.2.1.34.6.1.4.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpPathSwitchTriggerEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpPathSwitchTriggerEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpPathSwitchTrigger", "1.3.6.1.2.1.34.6.1.4.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpRscvEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpRscvEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpRscv", "1.3.6.1.2.1.34.6.1.4.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpTopicEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpTopicEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpTopic", "1.3.6.1.2.1.34.6.1.4.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpStateEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpStateEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpState", "1.3.6.1.2.1.34.6.1.4.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpUpTimeEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpUpTimeEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpUpTime", "1.3.6.1.2.1.34.6.1.4.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpLivenessTimerEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpLivenessTimerEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpLivenessTimer", "1.3.6.1.2.1.34.6.1.4.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpShortReqTimerEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpShortReqTimerEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpShortReqTimer", "1.3.6.1.2.1.34.6.1.4.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpPathSwTimerEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpPathSwTimerEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpPathSwTimer", "1.3.6.1.2.1.34.6.1.4.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpLivenessTimeoutsEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpLivenessTimeoutsEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpLivenessTimeouts", "1.3.6.1.2.1.34.6.1.4.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpShortReqTimeoutsEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpShortReqTimeoutsEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpShortReqTimeouts", "1.3.6.1.2.1.34.6.1.4.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpMaxSendRateEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpMaxSendRateEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpMaxSendRate", "1.3.6.1.2.1.34.6.1.4.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpMinSendRateEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpMinSendRateEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpMinSendRate", "1.3.6.1.2.1.34.6.1.4.2.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpCurSendRateEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpCurSendRateEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpCurSendRate", "1.3.6.1.2.1.34.6.1.4.2.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpSmRdTripDelayEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpSmRdTripDelayEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpSmRdTripDelay", "1.3.6.1.2.1.34.6.1.4.2.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpSendPacketsEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpSendPacketsEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpSendPackets", "1.3.6.1.2.1.34.6.1.4.2.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpRecvPacketsEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpRecvPacketsEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpRecvPackets", "1.3.6.1.2.1.34.6.1.4.2.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpSendBytesEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpSendBytesEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpSendBytes", "1.3.6.1.2.1.34.6.1.4.2.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpRecvBytesEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpRecvBytesEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpRecvBytes", "1.3.6.1.2.1.34.6.1.4.2.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpRetrPacketsEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpRetrPacketsEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpRetrPackets", "1.3.6.1.2.1.34.6.1.4.2.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpPacketsDiscardedEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpPacketsDiscardedEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpPacketsDiscarded", "1.3.6.1.2.1.34.6.1.4.2.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpDetectGapsEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpDetectGapsEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpDetectGaps", "1.3.6.1.2.1.34.6.1.4.2.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpRateReqSendsEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpRateReqSendsEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpRateReqSends", "1.3.6.1.2.1.34.6.1.4.2.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpOkErrPathSwsEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpOkErrPathSwsEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpOkErrPathSws", "1.3.6.1.2.1.34.6.1.4.2.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpBadErrPathSwsEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpBadErrPathSwsEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpBadErrPathSws", "1.3.6.1.2.1.34.6.1.4.2.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpOkOpPathSwsEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpOkOpPathSwsEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpOkOpPathSws", "1.3.6.1.2.1.34.6.1.4.2.1.30", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpBadOpPathSwsEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpBadOpPathSwsEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpBadOpPathSws", "1.3.6.1.2.1.34.6.1.4.2.1.31", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpCounterDisconTimeEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpCounterDisconTimeEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpCounterDisconTime", "1.3.6.1.2.1.34.6.1.4.2.1.32", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class HprRtpStatusTableEnt extends MIBEntry<HPRMIBDef>
                {
                    public final HprRtpStatusEntryEnt hprRtpStatusEntry;

                    private HprRtpStatusTableEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                    {
                        super(mib, parent, "hprRtpStatusTable", "1.3.6.1.2.1.34.6.1.4.3", false, true, false, false);
                        this.hprRtpStatusEntry = new HprRtpStatusEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hprRtpStatusEntry
                        };
                    }
                    public static final class HprRtpStatusEntryEnt extends MIBEntry<HPRMIBDef>
                    {
                        public final HprRtpStatusLocNceIdEnt hprRtpStatusLocNceId;

                        public final HprRtpStatusLocTcidEnt hprRtpStatusLocTcid;

                        public final HprRtpStatusIndexEnt hprRtpStatusIndex;

                        public final HprRtpStatusStartTimeEnt hprRtpStatusStartTime;

                        public final HprRtpStatusEndTimeEnt hprRtpStatusEndTime;

                        public final HprRtpStatusRemCpNameEnt hprRtpStatusRemCpName;

                        public final HprRtpStatusRemNceIdEnt hprRtpStatusRemNceId;

                        public final HprRtpStatusRemTcidEnt hprRtpStatusRemTcid;

                        public final HprRtpStatusNewRscvEnt hprRtpStatusNewRscv;

                        public final HprRtpStatusOldRscvEnt hprRtpStatusOldRscv;

                        public final HprRtpStatusCauseEnt hprRtpStatusCause;

                        public final HprRtpStatusLastAttemptResultEnt hprRtpStatusLastAttemptResult;

                        private HprRtpStatusEntryEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                        {
                            super(mib, parent, "hprRtpStatusEntry", "1.3.6.1.2.1.34.6.1.4.3.1", false, false, false, true);
                            this.hprRtpStatusLocNceId = new HprRtpStatusLocNceIdEnt(mib, this);
                            this.hprRtpStatusLocTcid = new HprRtpStatusLocTcidEnt(mib, this);
                            this.hprRtpStatusIndex = new HprRtpStatusIndexEnt(mib, this);
                            this.hprRtpStatusStartTime = new HprRtpStatusStartTimeEnt(mib, this);
                            this.hprRtpStatusEndTime = new HprRtpStatusEndTimeEnt(mib, this);
                            this.hprRtpStatusRemCpName = new HprRtpStatusRemCpNameEnt(mib, this);
                            this.hprRtpStatusRemNceId = new HprRtpStatusRemNceIdEnt(mib, this);
                            this.hprRtpStatusRemTcid = new HprRtpStatusRemTcidEnt(mib, this);
                            this.hprRtpStatusNewRscv = new HprRtpStatusNewRscvEnt(mib, this);
                            this.hprRtpStatusOldRscv = new HprRtpStatusOldRscvEnt(mib, this);
                            this.hprRtpStatusCause = new HprRtpStatusCauseEnt(mib, this);
                            this.hprRtpStatusLastAttemptResult = new HprRtpStatusLastAttemptResultEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.hprRtpStatusLocNceId,
                                this.hprRtpStatusLocTcid,
                                this.hprRtpStatusIndex,
                                this.hprRtpStatusStartTime,
                                this.hprRtpStatusEndTime,
                                this.hprRtpStatusRemCpName,
                                this.hprRtpStatusRemNceId,
                                this.hprRtpStatusRemTcid,
                                this.hprRtpStatusNewRscv,
                                this.hprRtpStatusOldRscv,
                                this.hprRtpStatusCause,
                                this.hprRtpStatusLastAttemptResult
                            };
                        }
                        public static final class HprRtpStatusLocNceIdEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpStatusLocNceIdEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpStatusLocNceId", "1.3.6.1.2.1.34.6.1.4.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpStatusLocTcidEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpStatusLocTcidEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpStatusLocTcid", "1.3.6.1.2.1.34.6.1.4.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpStatusIndexEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpStatusIndexEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpStatusIndex", "1.3.6.1.2.1.34.6.1.4.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpStatusStartTimeEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpStatusStartTimeEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpStatusStartTime", "1.3.6.1.2.1.34.6.1.4.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpStatusEndTimeEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpStatusEndTimeEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpStatusEndTime", "1.3.6.1.2.1.34.6.1.4.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpStatusRemCpNameEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpStatusRemCpNameEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpStatusRemCpName", "1.3.6.1.2.1.34.6.1.4.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpStatusRemNceIdEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpStatusRemNceIdEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpStatusRemNceId", "1.3.6.1.2.1.34.6.1.4.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpStatusRemTcidEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpStatusRemTcidEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpStatusRemTcid", "1.3.6.1.2.1.34.6.1.4.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpStatusNewRscvEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpStatusNewRscvEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpStatusNewRscv", "1.3.6.1.2.1.34.6.1.4.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpStatusOldRscvEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpStatusOldRscvEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpStatusOldRscv", "1.3.6.1.2.1.34.6.1.4.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpStatusCauseEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpStatusCauseEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpStatusCause", "1.3.6.1.2.1.34.6.1.4.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HprRtpStatusLastAttemptResultEnt extends MIBEntry<HPRMIBDef>
                        {
                            private HprRtpStatusLastAttemptResultEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                            {
                                super(mib, parent, "hprRtpStatusLastAttemptResult", "1.3.6.1.2.1.34.6.1.4.3.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class HprConformanceEnt extends MIBEntry<HPRMIBDef>
        {
            public final HprCompliancesEnt hprCompliances;

            public final HprGroupsEnt hprGroups;

            private HprConformanceEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
            {
                super(mib, parent, "hprConformance", "1.3.6.1.2.1.34.6.2", false, false, false, false);
                this.hprCompliances = new HprCompliancesEnt(mib, this);
                this.hprGroups = new HprGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hprCompliances,
                    this.hprGroups
                };
            }
            public static final class HprCompliancesEnt extends MIBEntry<HPRMIBDef>
            {
                /** Compliance statements*/
                public final HprComplianceEnt hprCompliance;

                private HprCompliancesEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                {
                    super(mib, parent, "hprCompliances", "1.3.6.1.2.1.34.6.2.1", false, false, false, false);
                    this.hprCompliance = new HprComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hprCompliance
                    };
                }
                public static final class HprComplianceEnt extends MIBEntry<HPRMIBDef>
                {
                    private HprComplianceEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                    {
                        super(mib, parent, "hprCompliance", "1.3.6.1.2.1.34.6.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class HprGroupsEnt extends MIBEntry<HPRMIBDef>
            {
                /** Units of conformance*/
                public final HprGlobalConfGroupEnt hprGlobalConfGroup;

                public final HprAnrRoutingConfGroupEnt hprAnrRoutingConfGroup;

                public final HprTransportUserConfGroupEnt hprTransportUserConfGroup;

                public final HprRtpConfGroupEnt hprRtpConfGroup;

                private HprGroupsEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                {
                    super(mib, parent, "hprGroups", "1.3.6.1.2.1.34.6.2.2", false, false, false, false);
                    this.hprGlobalConfGroup = new HprGlobalConfGroupEnt(mib, this);
                    this.hprAnrRoutingConfGroup = new HprAnrRoutingConfGroupEnt(mib, this);
                    this.hprTransportUserConfGroup = new HprTransportUserConfGroupEnt(mib, this);
                    this.hprRtpConfGroup = new HprRtpConfGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hprGlobalConfGroup,
                        this.hprAnrRoutingConfGroup,
                        this.hprTransportUserConfGroup,
                        this.hprRtpConfGroup
                    };
                }
                public static final class HprGlobalConfGroupEnt extends MIBEntry<HPRMIBDef>
                {
                    private HprGlobalConfGroupEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                    {
                        super(mib, parent, "hprGlobalConfGroup", "1.3.6.1.2.1.34.6.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HprAnrRoutingConfGroupEnt extends MIBEntry<HPRMIBDef>
                {
                    private HprAnrRoutingConfGroupEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                    {
                        super(mib, parent, "hprAnrRoutingConfGroup", "1.3.6.1.2.1.34.6.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HprTransportUserConfGroupEnt extends MIBEntry<HPRMIBDef>
                {
                    private HprTransportUserConfGroupEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                    {
                        super(mib, parent, "hprTransportUserConfGroup", "1.3.6.1.2.1.34.6.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HprRtpConfGroupEnt extends MIBEntry<HPRMIBDef>
                {
                    private HprRtpConfGroupEnt(HPRMIBDef mib, MIBEntry<HPRMIBDef> parent)
                    {
                        super(mib, parent, "hprRtpConfGroup", "1.3.6.1.2.1.34.6.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
