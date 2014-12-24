package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class DECNETPHIVMIBDef extends MIB
{
    public static final DECNETPHIVMIBDef DECNETPHIVMIB = new DECNETPHIVMIBDef();

    /** DECNet Phase-IV MIB*/
    public final PhivEnt phiv;

    private DECNETPHIVMIBDef()
    {
        super("DECNET-PHIV-MIB");
        this.phiv = new PhivEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.phiv
        };
    }

    public static final class PhivEnt extends MIBEntry<DECNETPHIVMIBDef>
    {
        /** The range of ifIndex, i.e., (1..2147483647)

groups in the decnetiv mib*/
        public final PhivSystemEnt phivSystem;

        public final PhivManagementEnt phivManagement;

        public final SessionEnt session;

        public final EndEnt end;

        public final RoutingEnt routing;

        public final CircuitEnt circuit;

        public final DdcmpEnt ddcmp;

        public final ControlEnt control;

        public final EthernetEnt ethernet;

        public final CountersEnt counters;

        public final AdjacencyEnt adjacency;

        public final LineEnt line;

        public final NonBroadcastLineEnt nonBroadcastLine;

        public final AreaEnt area;

        private PhivEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
        {
            super(mib, parent, "phiv", "1.3.6.1.2.1.18", false, false, false, false);
            this.phivSystem = new PhivSystemEnt(mib, this);
            this.phivManagement = new PhivManagementEnt(mib, this);
            this.session = new SessionEnt(mib, this);
            this.end = new EndEnt(mib, this);
            this.routing = new RoutingEnt(mib, this);
            this.circuit = new CircuitEnt(mib, this);
            this.ddcmp = new DdcmpEnt(mib, this);
            this.control = new ControlEnt(mib, this);
            this.ethernet = new EthernetEnt(mib, this);
            this.counters = new CountersEnt(mib, this);
            this.adjacency = new AdjacencyEnt(mib, this);
            this.line = new LineEnt(mib, this);
            this.nonBroadcastLine = new NonBroadcastLineEnt(mib, this);
            this.area = new AreaEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.phivSystem,
                this.phivManagement,
                this.session,
                this.end,
                this.routing,
                this.circuit,
                this.ddcmp,
                this.control,
                this.ethernet,
                this.counters,
                this.adjacency,
                this.line,
                this.nonBroadcastLine,
                this.area
            };
        }
        public static final class PhivSystemEnt extends MIBEntry<DECNETPHIVMIBDef>
        {
            /** System Group
The implementation of the System Group is mandatory forall systems.*/
            public final PhivSystemStateEnt phivSystemState;

            public final PhivExecIdentEnt phivExecIdent;

            private PhivSystemEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
            {
                super(mib, parent, "phivSystem", "1.3.6.1.2.1.18.1", false, false, false, false);
                this.phivSystemState = new PhivSystemStateEnt(mib, this);
                this.phivExecIdent = new PhivExecIdentEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.phivSystemState,
                    this.phivExecIdent
                };
            }
            public static final class PhivSystemStateEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivSystemStateEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivSystemState", "1.3.6.1.2.1.18.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivExecIdentEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivExecIdentEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivExecIdent", "1.3.6.1.2.1.18.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class PhivManagementEnt extends MIBEntry<DECNETPHIVMIBDef>
        {
            /** Network Management Group
The implementation of the Network Management Group ismandatory for all systems which contain a DECnet-stylemanagement version.*/
            public final PhivMgmtMgmtVersEnt phivMgmtMgmtVers;

            private PhivManagementEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
            {
                super(mib, parent, "phivManagement", "1.3.6.1.2.1.18.2", false, false, false, false);
                this.phivMgmtMgmtVers = new PhivMgmtMgmtVersEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.phivMgmtMgmtVers
                };
            }
            public static final class PhivMgmtMgmtVersEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivMgmtMgmtVersEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivMgmtMgmtVers", "1.3.6.1.2.1.18.2.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class SessionEnt extends MIBEntry<DECNETPHIVMIBDef>
        {
            /** Session Layer Group
The implementation of the Session Layer Group is optional.A system can be said to implement this group if and only ifall objects in this group are implemented.*/
            public final PhivSessionSystemNameEnt phivSessionSystemName;

            public final PhivSessionInTimerEnt phivSessionInTimer;

            public final PhivSessionOutTimerEnt phivSessionOutTimer;

            private SessionEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
            {
                super(mib, parent, "session", "1.3.6.1.2.1.18.3", false, false, false, false);
                this.phivSessionSystemName = new PhivSessionSystemNameEnt(mib, this);
                this.phivSessionInTimer = new PhivSessionInTimerEnt(mib, this);
                this.phivSessionOutTimer = new PhivSessionOutTimerEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.phivSessionSystemName,
                    this.phivSessionInTimer,
                    this.phivSessionOutTimer
                };
            }
            public static final class PhivSessionSystemNameEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivSessionSystemNameEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivSessionSystemName", "1.3.6.1.2.1.18.3.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivSessionInTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivSessionInTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivSessionInTimer", "1.3.6.1.2.1.18.3.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivSessionOutTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivSessionOutTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivSessionOutTimer", "1.3.6.1.2.1.18.3.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class EndEnt extends MIBEntry<DECNETPHIVMIBDef>
        {
            /** End Communication Layer Group
The implementation of the End Communication Layer Group is optional.A system can be said to implement this group if and only ifall objects in this group are implemented.
Remote State Table*/
            public final PhivEndRemoteTableEnt phivEndRemoteTable;

            /** End System Counter Table*/
            public final PhivEndCountTableEnt phivEndCountTable;

            /** additional End System objects*/
            public final PhivEndMaxLinksEnt phivEndMaxLinks;

            public final PhivEndNSPVersEnt phivEndNSPVers;

            public final PhivEndRetransmitFactorEnt phivEndRetransmitFactor;

            public final PhivEndDelayFactEnt phivEndDelayFact;

            public final PhivEndDelayWeightEnt phivEndDelayWeight;

            public final PhivEndInactivityTimerEnt phivEndInactivityTimer;

            public final PhivEndCountZeroCountEnt phivEndCountZeroCount;

            public final PhivEndMaxLinksActiveEnt phivEndMaxLinksActive;

            private EndEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
            {
                super(mib, parent, "end", "1.3.6.1.2.1.18.4", false, false, false, false);
                this.phivEndRemoteTable = new PhivEndRemoteTableEnt(mib, this);
                this.phivEndCountTable = new PhivEndCountTableEnt(mib, this);
                this.phivEndMaxLinks = new PhivEndMaxLinksEnt(mib, this);
                this.phivEndNSPVers = new PhivEndNSPVersEnt(mib, this);
                this.phivEndRetransmitFactor = new PhivEndRetransmitFactorEnt(mib, this);
                this.phivEndDelayFact = new PhivEndDelayFactEnt(mib, this);
                this.phivEndDelayWeight = new PhivEndDelayWeightEnt(mib, this);
                this.phivEndInactivityTimer = new PhivEndInactivityTimerEnt(mib, this);
                this.phivEndCountZeroCount = new PhivEndCountZeroCountEnt(mib, this);
                this.phivEndMaxLinksActive = new PhivEndMaxLinksActiveEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.phivEndRemoteTable,
                    this.phivEndCountTable,
                    this.phivEndMaxLinks,
                    this.phivEndNSPVers,
                    this.phivEndRetransmitFactor,
                    this.phivEndDelayFact,
                    this.phivEndDelayWeight,
                    this.phivEndInactivityTimer,
                    this.phivEndCountZeroCount,
                    this.phivEndMaxLinksActive
                };
            }
            public static final class PhivEndRemoteTableEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                public final PhivEndRemoteEntryEnt phivEndRemoteEntry;

                private PhivEndRemoteTableEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivEndRemoteTable", "1.3.6.1.2.1.18.4.1", false, true, false, false);
                    this.phivEndRemoteEntry = new PhivEndRemoteEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.phivEndRemoteEntry
                    };
                }
                public static final class PhivEndRemoteEntryEnt extends MIBEntry<DECNETPHIVMIBDef>
                {
                    public final PhivEndRemoteHostNodeIDEnt phivEndRemoteHostNodeID;

                    public final PhivEndRemoteStateEnt phivEndRemoteState;

                    public final PhivEndCircuitIndexEnt phivEndCircuitIndex;

                    public final PhivEndActiveLinksEnt phivEndActiveLinks;

                    public final PhivEndDelayEnt phivEndDelay;

                    private PhivEndRemoteEntryEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                    {
                        super(mib, parent, "phivEndRemoteEntry", "1.3.6.1.2.1.18.4.1.1", false, false, false, true);
                        this.phivEndRemoteHostNodeID = new PhivEndRemoteHostNodeIDEnt(mib, this);
                        this.phivEndRemoteState = new PhivEndRemoteStateEnt(mib, this);
                        this.phivEndCircuitIndex = new PhivEndCircuitIndexEnt(mib, this);
                        this.phivEndActiveLinks = new PhivEndActiveLinksEnt(mib, this);
                        this.phivEndDelay = new PhivEndDelayEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.phivEndRemoteHostNodeID,
                            this.phivEndRemoteState,
                            this.phivEndCircuitIndex,
                            this.phivEndActiveLinks,
                            this.phivEndDelay
                        };
                    }
                    public static final class PhivEndRemoteHostNodeIDEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndRemoteHostNodeIDEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndRemoteHostNodeID", "1.3.6.1.2.1.18.4.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEndRemoteStateEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndRemoteStateEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndRemoteState", "1.3.6.1.2.1.18.4.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEndCircuitIndexEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndCircuitIndexEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndCircuitIndex", "1.3.6.1.2.1.18.4.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEndActiveLinksEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndActiveLinksEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndActiveLinks", "1.3.6.1.2.1.18.4.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEndDelayEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndDelayEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndDelay", "1.3.6.1.2.1.18.4.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PhivEndCountTableEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                public final PhivEndCountEntryEnt phivEndCountEntry;

                private PhivEndCountTableEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivEndCountTable", "1.3.6.1.2.1.18.4.2", false, true, false, false);
                    this.phivEndCountEntry = new PhivEndCountEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.phivEndCountEntry
                    };
                }
                public static final class PhivEndCountEntryEnt extends MIBEntry<DECNETPHIVMIBDef>
                {
                    public final PhivEndCountHostNodeIDEnt phivEndCountHostNodeID;

                    public final PhivEndCountSecsLastZeroedEnt phivEndCountSecsLastZeroed;

                    public final PhivEndCountUsrBytesRecEnt phivEndCountUsrBytesRec;

                    public final PhivEndCountUsrBytesSentEnt phivEndCountUsrBytesSent;

                    public final PhivEndUCountUsrMessRecEnt phivEndUCountUsrMessRec;

                    public final PhivEndCountUsrMessSentEnt phivEndCountUsrMessSent;

                    public final PhivEndCountTotalBytesRecEnt phivEndCountTotalBytesRec;

                    public final PhivEndCountTotalBytesSentEnt phivEndCountTotalBytesSent;

                    public final PhivEndCountTotalMessRecEnt phivEndCountTotalMessRec;

                    public final PhivEndCountTotalMessSentEnt phivEndCountTotalMessSent;

                    public final PhivEndCountConnectsRecdEnt phivEndCountConnectsRecd;

                    public final PhivEndCountConnectsSentEnt phivEndCountConnectsSent;

                    public final PhivEndCountReponseTimeoutsEnt phivEndCountReponseTimeouts;

                    public final PhivEndCountRecdConnectResErrsEnt phivEndCountRecdConnectResErrs;

                    private PhivEndCountEntryEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                    {
                        super(mib, parent, "phivEndCountEntry", "1.3.6.1.2.1.18.4.2.1", false, false, false, true);
                        this.phivEndCountHostNodeID = new PhivEndCountHostNodeIDEnt(mib, this);
                        this.phivEndCountSecsLastZeroed = new PhivEndCountSecsLastZeroedEnt(mib, this);
                        this.phivEndCountUsrBytesRec = new PhivEndCountUsrBytesRecEnt(mib, this);
                        this.phivEndCountUsrBytesSent = new PhivEndCountUsrBytesSentEnt(mib, this);
                        this.phivEndUCountUsrMessRec = new PhivEndUCountUsrMessRecEnt(mib, this);
                        this.phivEndCountUsrMessSent = new PhivEndCountUsrMessSentEnt(mib, this);
                        this.phivEndCountTotalBytesRec = new PhivEndCountTotalBytesRecEnt(mib, this);
                        this.phivEndCountTotalBytesSent = new PhivEndCountTotalBytesSentEnt(mib, this);
                        this.phivEndCountTotalMessRec = new PhivEndCountTotalMessRecEnt(mib, this);
                        this.phivEndCountTotalMessSent = new PhivEndCountTotalMessSentEnt(mib, this);
                        this.phivEndCountConnectsRecd = new PhivEndCountConnectsRecdEnt(mib, this);
                        this.phivEndCountConnectsSent = new PhivEndCountConnectsSentEnt(mib, this);
                        this.phivEndCountReponseTimeouts = new PhivEndCountReponseTimeoutsEnt(mib, this);
                        this.phivEndCountRecdConnectResErrs = new PhivEndCountRecdConnectResErrsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.phivEndCountHostNodeID,
                            this.phivEndCountSecsLastZeroed,
                            this.phivEndCountUsrBytesRec,
                            this.phivEndCountUsrBytesSent,
                            this.phivEndUCountUsrMessRec,
                            this.phivEndCountUsrMessSent,
                            this.phivEndCountTotalBytesRec,
                            this.phivEndCountTotalBytesSent,
                            this.phivEndCountTotalMessRec,
                            this.phivEndCountTotalMessSent,
                            this.phivEndCountConnectsRecd,
                            this.phivEndCountConnectsSent,
                            this.phivEndCountReponseTimeouts,
                            this.phivEndCountRecdConnectResErrs
                        };
                    }
                    public static final class PhivEndCountHostNodeIDEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndCountHostNodeIDEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndCountHostNodeID", "1.3.6.1.2.1.18.4.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEndCountSecsLastZeroedEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndCountSecsLastZeroedEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndCountSecsLastZeroed", "1.3.6.1.2.1.18.4.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEndCountUsrBytesRecEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndCountUsrBytesRecEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndCountUsrBytesRec", "1.3.6.1.2.1.18.4.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEndCountUsrBytesSentEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndCountUsrBytesSentEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndCountUsrBytesSent", "1.3.6.1.2.1.18.4.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEndUCountUsrMessRecEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndUCountUsrMessRecEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndUCountUsrMessRec", "1.3.6.1.2.1.18.4.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEndCountUsrMessSentEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndCountUsrMessSentEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndCountUsrMessSent", "1.3.6.1.2.1.18.4.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEndCountTotalBytesRecEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndCountTotalBytesRecEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndCountTotalBytesRec", "1.3.6.1.2.1.18.4.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEndCountTotalBytesSentEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndCountTotalBytesSentEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndCountTotalBytesSent", "1.3.6.1.2.1.18.4.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEndCountTotalMessRecEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndCountTotalMessRecEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndCountTotalMessRec", "1.3.6.1.2.1.18.4.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEndCountTotalMessSentEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndCountTotalMessSentEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndCountTotalMessSent", "1.3.6.1.2.1.18.4.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEndCountConnectsRecdEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndCountConnectsRecdEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndCountConnectsRecd", "1.3.6.1.2.1.18.4.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEndCountConnectsSentEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndCountConnectsSentEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndCountConnectsSent", "1.3.6.1.2.1.18.4.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEndCountReponseTimeoutsEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndCountReponseTimeoutsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndCountReponseTimeouts", "1.3.6.1.2.1.18.4.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEndCountRecdConnectResErrsEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEndCountRecdConnectResErrsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEndCountRecdConnectResErrs", "1.3.6.1.2.1.18.4.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PhivEndMaxLinksEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivEndMaxLinksEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivEndMaxLinks", "1.3.6.1.2.1.18.4.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivEndNSPVersEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivEndNSPVersEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivEndNSPVers", "1.3.6.1.2.1.18.4.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivEndRetransmitFactorEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivEndRetransmitFactorEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivEndRetransmitFactor", "1.3.6.1.2.1.18.4.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivEndDelayFactEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivEndDelayFactEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivEndDelayFact", "1.3.6.1.2.1.18.4.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivEndDelayWeightEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivEndDelayWeightEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivEndDelayWeight", "1.3.6.1.2.1.18.4.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivEndInactivityTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivEndInactivityTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivEndInactivityTimer", "1.3.6.1.2.1.18.4.8", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivEndCountZeroCountEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivEndCountZeroCountEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivEndCountZeroCount", "1.3.6.1.2.1.18.4.9", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivEndMaxLinksActiveEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivEndMaxLinksActiveEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivEndMaxLinksActive", "1.3.6.1.2.1.18.4.10", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class RoutingEnt extends MIBEntry<DECNETPHIVMIBDef>
        {
            /** Routing Layer Group
The implementation of the Routing Layer Group is mandatory forall systems that implement level 1 routing layercommunications.*/
            public final PhivRouteBroadcastRouteTimerEnt phivRouteBroadcastRouteTimer;

            public final PhivRouteBuffSizeEnt phivRouteBuffSize;

            public final PhivRouteRoutingVersEnt phivRouteRoutingVers;

            public final PhivRouteMaxAddrEnt phivRouteMaxAddr;

            public final PhivRouteMaxBdcastNonRoutersEnt phivRouteMaxBdcastNonRouters;

            public final PhivRouteMaxBdcastRoutersEnt phivRouteMaxBdcastRouters;

            public final PhivRouteMaxBuffsEnt phivRouteMaxBuffs;

            public final PhivRouteMaxCircuitsEnt phivRouteMaxCircuits;

            public final PhivRouteMaxCostEnt phivRouteMaxCost;

            public final PhivRouteMaxHopsEnt phivRouteMaxHops;

            public final PhivRouteMaxVisitsEnt phivRouteMaxVisits;

            public final PhivRouteRoutingTimerEnt phivRouteRoutingTimer;

            public final PhivRouteSegBuffSizeEnt phivRouteSegBuffSize;

            public final PhivRouteTypeEnt phivRouteType;

            public final PhivRouteCountAgedPktLossEnt phivRouteCountAgedPktLoss;

            public final PhivRouteCountNodeUnrPktLossEnt phivRouteCountNodeUnrPktLoss;

            public final PhivRouteCountOutRngePktLossEnt phivRouteCountOutRngePktLoss;

            public final PhivRouteCountOverSzePktLossEnt phivRouteCountOverSzePktLoss;

            public final PhivRouteCountPacketFmtErrEnt phivRouteCountPacketFmtErr;

            public final PhivRouteCountPtlRteUpdtLossEnt phivRouteCountPtlRteUpdtLoss;

            public final PhivRouteCountVerifRejectEnt phivRouteCountVerifReject;

            /** Level 1 Routing Table*/
            public final PhivLevel1RouteTableEnt phivLevel1RouteTable;

            /** Additional routing parameters*/
            public final PhivRouteCountZeroCountEnt phivRouteCountZeroCount;

            public final PhivRouteSystemAddrEnt phivRouteSystemAddr;

            public final PhivRouteRoutingTypeEnt phivRouteRoutingType;

            public final PhivRouteSystemAddressEnt phivRouteSystemAddress;

            private RoutingEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
            {
                super(mib, parent, "routing", "1.3.6.1.2.1.18.5", false, false, false, false);
                this.phivRouteBroadcastRouteTimer = new PhivRouteBroadcastRouteTimerEnt(mib, this);
                this.phivRouteBuffSize = new PhivRouteBuffSizeEnt(mib, this);
                this.phivRouteRoutingVers = new PhivRouteRoutingVersEnt(mib, this);
                this.phivRouteMaxAddr = new PhivRouteMaxAddrEnt(mib, this);
                this.phivRouteMaxBdcastNonRouters = new PhivRouteMaxBdcastNonRoutersEnt(mib, this);
                this.phivRouteMaxBdcastRouters = new PhivRouteMaxBdcastRoutersEnt(mib, this);
                this.phivRouteMaxBuffs = new PhivRouteMaxBuffsEnt(mib, this);
                this.phivRouteMaxCircuits = new PhivRouteMaxCircuitsEnt(mib, this);
                this.phivRouteMaxCost = new PhivRouteMaxCostEnt(mib, this);
                this.phivRouteMaxHops = new PhivRouteMaxHopsEnt(mib, this);
                this.phivRouteMaxVisits = new PhivRouteMaxVisitsEnt(mib, this);
                this.phivRouteRoutingTimer = new PhivRouteRoutingTimerEnt(mib, this);
                this.phivRouteSegBuffSize = new PhivRouteSegBuffSizeEnt(mib, this);
                this.phivRouteType = new PhivRouteTypeEnt(mib, this);
                this.phivRouteCountAgedPktLoss = new PhivRouteCountAgedPktLossEnt(mib, this);
                this.phivRouteCountNodeUnrPktLoss = new PhivRouteCountNodeUnrPktLossEnt(mib, this);
                this.phivRouteCountOutRngePktLoss = new PhivRouteCountOutRngePktLossEnt(mib, this);
                this.phivRouteCountOverSzePktLoss = new PhivRouteCountOverSzePktLossEnt(mib, this);
                this.phivRouteCountPacketFmtErr = new PhivRouteCountPacketFmtErrEnt(mib, this);
                this.phivRouteCountPtlRteUpdtLoss = new PhivRouteCountPtlRteUpdtLossEnt(mib, this);
                this.phivRouteCountVerifReject = new PhivRouteCountVerifRejectEnt(mib, this);
                this.phivLevel1RouteTable = new PhivLevel1RouteTableEnt(mib, this);
                this.phivRouteCountZeroCount = new PhivRouteCountZeroCountEnt(mib, this);
                this.phivRouteSystemAddr = new PhivRouteSystemAddrEnt(mib, this);
                this.phivRouteRoutingType = new PhivRouteRoutingTypeEnt(mib, this);
                this.phivRouteSystemAddress = new PhivRouteSystemAddressEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.phivRouteBroadcastRouteTimer,
                    this.phivRouteBuffSize,
                    this.phivRouteRoutingVers,
                    this.phivRouteMaxAddr,
                    this.phivRouteMaxBdcastNonRouters,
                    this.phivRouteMaxBdcastRouters,
                    this.phivRouteMaxBuffs,
                    this.phivRouteMaxCircuits,
                    this.phivRouteMaxCost,
                    this.phivRouteMaxHops,
                    this.phivRouteMaxVisits,
                    this.phivRouteRoutingTimer,
                    this.phivRouteSegBuffSize,
                    this.phivRouteType,
                    this.phivRouteCountAgedPktLoss,
                    this.phivRouteCountNodeUnrPktLoss,
                    this.phivRouteCountOutRngePktLoss,
                    this.phivRouteCountOverSzePktLoss,
                    this.phivRouteCountPacketFmtErr,
                    this.phivRouteCountPtlRteUpdtLoss,
                    this.phivRouteCountVerifReject,
                    this.phivLevel1RouteTable,
                    this.phivRouteCountZeroCount,
                    this.phivRouteSystemAddr,
                    this.phivRouteRoutingType,
                    this.phivRouteSystemAddress
                };
            }
            public static final class PhivRouteBroadcastRouteTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteBroadcastRouteTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteBroadcastRouteTimer", "1.3.6.1.2.1.18.5.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteBuffSizeEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteBuffSizeEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteBuffSize", "1.3.6.1.2.1.18.5.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteRoutingVersEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteRoutingVersEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteRoutingVers", "1.3.6.1.2.1.18.5.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteMaxAddrEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteMaxAddrEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteMaxAddr", "1.3.6.1.2.1.18.5.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteMaxBdcastNonRoutersEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteMaxBdcastNonRoutersEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteMaxBdcastNonRouters", "1.3.6.1.2.1.18.5.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteMaxBdcastRoutersEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteMaxBdcastRoutersEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteMaxBdcastRouters", "1.3.6.1.2.1.18.5.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteMaxBuffsEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteMaxBuffsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteMaxBuffs", "1.3.6.1.2.1.18.5.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteMaxCircuitsEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteMaxCircuitsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteMaxCircuits", "1.3.6.1.2.1.18.5.8", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteMaxCostEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteMaxCostEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteMaxCost", "1.3.6.1.2.1.18.5.9", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteMaxHopsEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteMaxHopsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteMaxHops", "1.3.6.1.2.1.18.5.10", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteMaxVisitsEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteMaxVisitsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteMaxVisits", "1.3.6.1.2.1.18.5.11", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteRoutingTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteRoutingTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteRoutingTimer", "1.3.6.1.2.1.18.5.12", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteSegBuffSizeEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteSegBuffSizeEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteSegBuffSize", "1.3.6.1.2.1.18.5.13", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteTypeEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteTypeEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteType", "1.3.6.1.2.1.18.5.14", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteCountAgedPktLossEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteCountAgedPktLossEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteCountAgedPktLoss", "1.3.6.1.2.1.18.5.15", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteCountNodeUnrPktLossEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteCountNodeUnrPktLossEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteCountNodeUnrPktLoss", "1.3.6.1.2.1.18.5.16", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteCountOutRngePktLossEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteCountOutRngePktLossEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteCountOutRngePktLoss", "1.3.6.1.2.1.18.5.17", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteCountOverSzePktLossEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteCountOverSzePktLossEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteCountOverSzePktLoss", "1.3.6.1.2.1.18.5.18", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteCountPacketFmtErrEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteCountPacketFmtErrEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteCountPacketFmtErr", "1.3.6.1.2.1.18.5.19", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteCountPtlRteUpdtLossEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteCountPtlRteUpdtLossEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteCountPtlRteUpdtLoss", "1.3.6.1.2.1.18.5.20", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteCountVerifRejectEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteCountVerifRejectEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteCountVerifReject", "1.3.6.1.2.1.18.5.21", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivLevel1RouteTableEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                public final PhivLevel1RouteEntryEnt phivLevel1RouteEntry;

                private PhivLevel1RouteTableEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivLevel1RouteTable", "1.3.6.1.2.1.18.5.22", false, true, false, false);
                    this.phivLevel1RouteEntry = new PhivLevel1RouteEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.phivLevel1RouteEntry
                    };
                }
                public static final class PhivLevel1RouteEntryEnt extends MIBEntry<DECNETPHIVMIBDef>
                {
                    public final PhivLevel1RouteNodeAddrEnt phivLevel1RouteNodeAddr;

                    public final PhivLevel1RouteCircuitIndexEnt phivLevel1RouteCircuitIndex;

                    public final PhivLevel1RouteCostEnt phivLevel1RouteCost;

                    public final PhivLevel1RouteHopsEnt phivLevel1RouteHops;

                    public final PhivLevel1RouteNextNodeEnt phivLevel1RouteNextNode;

                    private PhivLevel1RouteEntryEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                    {
                        super(mib, parent, "phivLevel1RouteEntry", "1.3.6.1.2.1.18.5.22.1", false, false, false, true);
                        this.phivLevel1RouteNodeAddr = new PhivLevel1RouteNodeAddrEnt(mib, this);
                        this.phivLevel1RouteCircuitIndex = new PhivLevel1RouteCircuitIndexEnt(mib, this);
                        this.phivLevel1RouteCost = new PhivLevel1RouteCostEnt(mib, this);
                        this.phivLevel1RouteHops = new PhivLevel1RouteHopsEnt(mib, this);
                        this.phivLevel1RouteNextNode = new PhivLevel1RouteNextNodeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.phivLevel1RouteNodeAddr,
                            this.phivLevel1RouteCircuitIndex,
                            this.phivLevel1RouteCost,
                            this.phivLevel1RouteHops,
                            this.phivLevel1RouteNextNode
                        };
                    }
                    public static final class PhivLevel1RouteNodeAddrEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivLevel1RouteNodeAddrEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivLevel1RouteNodeAddr", "1.3.6.1.2.1.18.5.22.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivLevel1RouteCircuitIndexEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivLevel1RouteCircuitIndexEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivLevel1RouteCircuitIndex", "1.3.6.1.2.1.18.5.22.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivLevel1RouteCostEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivLevel1RouteCostEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivLevel1RouteCost", "1.3.6.1.2.1.18.5.22.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivLevel1RouteHopsEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivLevel1RouteHopsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivLevel1RouteHops", "1.3.6.1.2.1.18.5.22.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivLevel1RouteNextNodeEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivLevel1RouteNextNodeEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivLevel1RouteNextNode", "1.3.6.1.2.1.18.5.22.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PhivRouteCountZeroCountEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteCountZeroCountEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteCountZeroCount", "1.3.6.1.2.1.18.5.23", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteSystemAddrEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteSystemAddrEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteSystemAddr", "1.3.6.1.2.1.18.5.24", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteRoutingTypeEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteRoutingTypeEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteRoutingType", "1.3.6.1.2.1.18.5.25", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteSystemAddressEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteSystemAddressEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteSystemAddress", "1.3.6.1.2.1.18.5.26", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class CircuitEnt extends MIBEntry<DECNETPHIVMIBDef>
        {
            /** Circuit Group
The implementation of the Circuit Group is mandatory forall systems.
Circuit Parameters Table*/
            public final PhivCircuitParametersTableEnt phivCircuitParametersTable;

            /** Circuit Counters Table*/
            public final PhivCircuitCountTableEnt phivCircuitCountTable;

            /** Additional Circuit Parameters*/
            public final PhivCircuitOrigQueueLimitEnt phivCircuitOrigQueueLimit;

            public final PhivCircuitCountZeroCountEnt phivCircuitCountZeroCount;

            private CircuitEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
            {
                super(mib, parent, "circuit", "1.3.6.1.2.1.18.6", false, false, false, false);
                this.phivCircuitParametersTable = new PhivCircuitParametersTableEnt(mib, this);
                this.phivCircuitCountTable = new PhivCircuitCountTableEnt(mib, this);
                this.phivCircuitOrigQueueLimit = new PhivCircuitOrigQueueLimitEnt(mib, this);
                this.phivCircuitCountZeroCount = new PhivCircuitCountZeroCountEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.phivCircuitParametersTable,
                    this.phivCircuitCountTable,
                    this.phivCircuitOrigQueueLimit,
                    this.phivCircuitCountZeroCount
                };
            }
            public static final class PhivCircuitParametersTableEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                public final PhivCircuitParametersEntryEnt phivCircuitParametersEntry;

                private PhivCircuitParametersTableEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivCircuitParametersTable", "1.3.6.1.2.1.18.6.1", false, true, false, false);
                    this.phivCircuitParametersEntry = new PhivCircuitParametersEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.phivCircuitParametersEntry
                    };
                }
                public static final class PhivCircuitParametersEntryEnt extends MIBEntry<DECNETPHIVMIBDef>
                {
                    public final PhivCircuitIndexEnt phivCircuitIndex;

                    public final PhivCircuitLineIndexEnt phivCircuitLineIndex;

                    public final PhivCircuitCommonStateEnt phivCircuitCommonState;

                    public final PhivCircuitCommonSubStateEnt phivCircuitCommonSubState;

                    public final PhivCircuitCommonNameEnt phivCircuitCommonName;

                    public final PhivCircuitExecRecallTimerEnt phivCircuitExecRecallTimer;

                    public final PhivCircuitCommonTypeEnt phivCircuitCommonType;

                    public final PhivCircuitServiceEnt phivCircuitService;

                    public final PhivCircuitExecCostEnt phivCircuitExecCost;

                    public final PhivCircuitExecHelloTimerEnt phivCircuitExecHelloTimer;

                    private PhivCircuitParametersEntryEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                    {
                        super(mib, parent, "phivCircuitParametersEntry", "1.3.6.1.2.1.18.6.1.1", false, false, false, true);
                        this.phivCircuitIndex = new PhivCircuitIndexEnt(mib, this);
                        this.phivCircuitLineIndex = new PhivCircuitLineIndexEnt(mib, this);
                        this.phivCircuitCommonState = new PhivCircuitCommonStateEnt(mib, this);
                        this.phivCircuitCommonSubState = new PhivCircuitCommonSubStateEnt(mib, this);
                        this.phivCircuitCommonName = new PhivCircuitCommonNameEnt(mib, this);
                        this.phivCircuitExecRecallTimer = new PhivCircuitExecRecallTimerEnt(mib, this);
                        this.phivCircuitCommonType = new PhivCircuitCommonTypeEnt(mib, this);
                        this.phivCircuitService = new PhivCircuitServiceEnt(mib, this);
                        this.phivCircuitExecCost = new PhivCircuitExecCostEnt(mib, this);
                        this.phivCircuitExecHelloTimer = new PhivCircuitExecHelloTimerEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.phivCircuitIndex,
                            this.phivCircuitLineIndex,
                            this.phivCircuitCommonState,
                            this.phivCircuitCommonSubState,
                            this.phivCircuitCommonName,
                            this.phivCircuitExecRecallTimer,
                            this.phivCircuitCommonType,
                            this.phivCircuitService,
                            this.phivCircuitExecCost,
                            this.phivCircuitExecHelloTimer
                        };
                    }
                    public static final class PhivCircuitIndexEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitIndexEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitIndex", "1.3.6.1.2.1.18.6.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitLineIndexEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitLineIndexEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitLineIndex", "1.3.6.1.2.1.18.6.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCommonStateEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCommonStateEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCommonState", "1.3.6.1.2.1.18.6.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCommonSubStateEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCommonSubStateEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCommonSubState", "1.3.6.1.2.1.18.6.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCommonNameEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCommonNameEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCommonName", "1.3.6.1.2.1.18.6.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitExecRecallTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitExecRecallTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitExecRecallTimer", "1.3.6.1.2.1.18.6.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCommonTypeEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCommonTypeEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCommonType", "1.3.6.1.2.1.18.6.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitServiceEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitServiceEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitService", "1.3.6.1.2.1.18.6.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitExecCostEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitExecCostEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitExecCost", "1.3.6.1.2.1.18.6.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitExecHelloTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitExecHelloTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitExecHelloTimer", "1.3.6.1.2.1.18.6.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PhivCircuitCountTableEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                public final PhivCircuitCountEntryEnt phivCircuitCountEntry;

                private PhivCircuitCountTableEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivCircuitCountTable", "1.3.6.1.2.1.18.6.2", false, true, false, false);
                    this.phivCircuitCountEntry = new PhivCircuitCountEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.phivCircuitCountEntry
                    };
                }
                public static final class PhivCircuitCountEntryEnt extends MIBEntry<DECNETPHIVMIBDef>
                {
                    public final PhivCircuitCountSecLastZeroedEnt phivCircuitCountSecLastZeroed;

                    public final PhivCircuitCountTermPacketsRecdEnt phivCircuitCountTermPacketsRecd;

                    public final PhivCircuitCountOriginPackSentEnt phivCircuitCountOriginPackSent;

                    public final PhivCircuitCountTermCongLossEnt phivCircuitCountTermCongLoss;

                    public final PhivCircuitCountCorruptLossEnt phivCircuitCountCorruptLoss;

                    public final PhivCircuitCountTransitPksRecdEnt phivCircuitCountTransitPksRecd;

                    public final PhivCircuitCountTransitPkSentEnt phivCircuitCountTransitPkSent;

                    public final PhivCircuitCountTransitCongestLossEnt phivCircuitCountTransitCongestLoss;

                    public final PhivCircuitCountCircuitDownEnt phivCircuitCountCircuitDown;

                    public final PhivCircuitCountInitFailureEnt phivCircuitCountInitFailure;

                    public final PhivCircuitCountAdjDownEnt phivCircuitCountAdjDown;

                    public final PhivCircuitCountPeakAdjEnt phivCircuitCountPeakAdj;

                    public final PhivCircuitCountBytesRecdEnt phivCircuitCountBytesRecd;

                    public final PhivCircuitCountBytesSentEnt phivCircuitCountBytesSent;

                    public final PhivCircuitCountDataBlocksRecdEnt phivCircuitCountDataBlocksRecd;

                    public final PhivCircuitCountDataBlocksSentEnt phivCircuitCountDataBlocksSent;

                    public final PhivCircuitCountUsrBuffUnavEnt phivCircuitCountUsrBuffUnav;

                    private PhivCircuitCountEntryEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                    {
                        super(mib, parent, "phivCircuitCountEntry", "1.3.6.1.2.1.18.6.2.1", false, false, false, true);
                        this.phivCircuitCountSecLastZeroed = new PhivCircuitCountSecLastZeroedEnt(mib, this);
                        this.phivCircuitCountTermPacketsRecd = new PhivCircuitCountTermPacketsRecdEnt(mib, this);
                        this.phivCircuitCountOriginPackSent = new PhivCircuitCountOriginPackSentEnt(mib, this);
                        this.phivCircuitCountTermCongLoss = new PhivCircuitCountTermCongLossEnt(mib, this);
                        this.phivCircuitCountCorruptLoss = new PhivCircuitCountCorruptLossEnt(mib, this);
                        this.phivCircuitCountTransitPksRecd = new PhivCircuitCountTransitPksRecdEnt(mib, this);
                        this.phivCircuitCountTransitPkSent = new PhivCircuitCountTransitPkSentEnt(mib, this);
                        this.phivCircuitCountTransitCongestLoss = new PhivCircuitCountTransitCongestLossEnt(mib, this);
                        this.phivCircuitCountCircuitDown = new PhivCircuitCountCircuitDownEnt(mib, this);
                        this.phivCircuitCountInitFailure = new PhivCircuitCountInitFailureEnt(mib, this);
                        this.phivCircuitCountAdjDown = new PhivCircuitCountAdjDownEnt(mib, this);
                        this.phivCircuitCountPeakAdj = new PhivCircuitCountPeakAdjEnt(mib, this);
                        this.phivCircuitCountBytesRecd = new PhivCircuitCountBytesRecdEnt(mib, this);
                        this.phivCircuitCountBytesSent = new PhivCircuitCountBytesSentEnt(mib, this);
                        this.phivCircuitCountDataBlocksRecd = new PhivCircuitCountDataBlocksRecdEnt(mib, this);
                        this.phivCircuitCountDataBlocksSent = new PhivCircuitCountDataBlocksSentEnt(mib, this);
                        this.phivCircuitCountUsrBuffUnav = new PhivCircuitCountUsrBuffUnavEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.phivCircuitCountSecLastZeroed,
                            this.phivCircuitCountTermPacketsRecd,
                            this.phivCircuitCountOriginPackSent,
                            this.phivCircuitCountTermCongLoss,
                            this.phivCircuitCountCorruptLoss,
                            this.phivCircuitCountTransitPksRecd,
                            this.phivCircuitCountTransitPkSent,
                            this.phivCircuitCountTransitCongestLoss,
                            this.phivCircuitCountCircuitDown,
                            this.phivCircuitCountInitFailure,
                            this.phivCircuitCountAdjDown,
                            this.phivCircuitCountPeakAdj,
                            this.phivCircuitCountBytesRecd,
                            this.phivCircuitCountBytesSent,
                            this.phivCircuitCountDataBlocksRecd,
                            this.phivCircuitCountDataBlocksSent,
                            this.phivCircuitCountUsrBuffUnav
                        };
                    }
                    public static final class PhivCircuitCountSecLastZeroedEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCountSecLastZeroedEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCountSecLastZeroed", "1.3.6.1.2.1.18.6.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCountTermPacketsRecdEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCountTermPacketsRecdEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCountTermPacketsRecd", "1.3.6.1.2.1.18.6.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCountOriginPackSentEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCountOriginPackSentEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCountOriginPackSent", "1.3.6.1.2.1.18.6.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCountTermCongLossEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCountTermCongLossEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCountTermCongLoss", "1.3.6.1.2.1.18.6.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCountCorruptLossEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCountCorruptLossEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCountCorruptLoss", "1.3.6.1.2.1.18.6.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCountTransitPksRecdEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCountTransitPksRecdEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCountTransitPksRecd", "1.3.6.1.2.1.18.6.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCountTransitPkSentEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCountTransitPkSentEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCountTransitPkSent", "1.3.6.1.2.1.18.6.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCountTransitCongestLossEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCountTransitCongestLossEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCountTransitCongestLoss", "1.3.6.1.2.1.18.6.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCountCircuitDownEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCountCircuitDownEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCountCircuitDown", "1.3.6.1.2.1.18.6.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCountInitFailureEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCountInitFailureEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCountInitFailure", "1.3.6.1.2.1.18.6.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCountAdjDownEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCountAdjDownEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCountAdjDown", "1.3.6.1.2.1.18.6.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCountPeakAdjEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCountPeakAdjEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCountPeakAdj", "1.3.6.1.2.1.18.6.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCountBytesRecdEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCountBytesRecdEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCountBytesRecd", "1.3.6.1.2.1.18.6.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCountBytesSentEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCountBytesSentEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCountBytesSent", "1.3.6.1.2.1.18.6.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCountDataBlocksRecdEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCountDataBlocksRecdEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCountDataBlocksRecd", "1.3.6.1.2.1.18.6.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCountDataBlocksSentEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCountDataBlocksSentEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCountDataBlocksSent", "1.3.6.1.2.1.18.6.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCircuitCountUsrBuffUnavEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCircuitCountUsrBuffUnavEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCircuitCountUsrBuffUnav", "1.3.6.1.2.1.18.6.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PhivCircuitOrigQueueLimitEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivCircuitOrigQueueLimitEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivCircuitOrigQueueLimit", "1.3.6.1.2.1.18.6.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivCircuitCountZeroCountEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivCircuitCountZeroCountEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivCircuitCountZeroCount", "1.3.6.1.2.1.18.6.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class DdcmpEnt extends MIBEntry<DECNETPHIVMIBDef>
        {
            /** DDCMP Circuit Group
The implementation of the DDCMP Circuit Group is optional.A system can be said to implement this group if and only ifall objects in this group are implemented.
DDCMP Parameters Table*/
            public final PhivDDCMPCircuitParametersTableEnt phivDDCMPCircuitParametersTable;

            /** DDCMP Circuit Counter Table*/
            public final PhivDDCMPCircuitCountTableEnt phivDDCMPCircuitCountTable;

            /** DDCMP Line Count Table*/
            public final PhivDDCMPLineCountTableEnt phivDDCMPLineCountTable;

            private DdcmpEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
            {
                super(mib, parent, "ddcmp", "1.3.6.1.2.1.18.7", false, false, false, false);
                this.phivDDCMPCircuitParametersTable = new PhivDDCMPCircuitParametersTableEnt(mib, this);
                this.phivDDCMPCircuitCountTable = new PhivDDCMPCircuitCountTableEnt(mib, this);
                this.phivDDCMPLineCountTable = new PhivDDCMPLineCountTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.phivDDCMPCircuitParametersTable,
                    this.phivDDCMPCircuitCountTable,
                    this.phivDDCMPLineCountTable
                };
            }
            public static final class PhivDDCMPCircuitParametersTableEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                public final PhivDDCMPCircuitParametersEntryEnt phivDDCMPCircuitParametersEntry;

                private PhivDDCMPCircuitParametersTableEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivDDCMPCircuitParametersTable", "1.3.6.1.2.1.18.7.1", false, true, false, false);
                    this.phivDDCMPCircuitParametersEntry = new PhivDDCMPCircuitParametersEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.phivDDCMPCircuitParametersEntry
                    };
                }
                public static final class PhivDDCMPCircuitParametersEntryEnt extends MIBEntry<DECNETPHIVMIBDef>
                {
                    public final PhivDDCMPCircuitIndexEnt phivDDCMPCircuitIndex;

                    public final PhivDDCMPCircuitAdjNodeAddrEnt phivDDCMPCircuitAdjNodeAddr;

                    public final PhivDDCMPCircuitTributaryEnt phivDDCMPCircuitTributary;

                    private PhivDDCMPCircuitParametersEntryEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                    {
                        super(mib, parent, "phivDDCMPCircuitParametersEntry", "1.3.6.1.2.1.18.7.1.1", false, false, false, true);
                        this.phivDDCMPCircuitIndex = new PhivDDCMPCircuitIndexEnt(mib, this);
                        this.phivDDCMPCircuitAdjNodeAddr = new PhivDDCMPCircuitAdjNodeAddrEnt(mib, this);
                        this.phivDDCMPCircuitTributary = new PhivDDCMPCircuitTributaryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.phivDDCMPCircuitIndex,
                            this.phivDDCMPCircuitAdjNodeAddr,
                            this.phivDDCMPCircuitTributary
                        };
                    }
                    public static final class PhivDDCMPCircuitIndexEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivDDCMPCircuitIndexEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivDDCMPCircuitIndex", "1.3.6.1.2.1.18.7.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivDDCMPCircuitAdjNodeAddrEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivDDCMPCircuitAdjNodeAddrEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivDDCMPCircuitAdjNodeAddr", "1.3.6.1.2.1.18.7.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivDDCMPCircuitTributaryEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivDDCMPCircuitTributaryEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivDDCMPCircuitTributary", "1.3.6.1.2.1.18.7.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PhivDDCMPCircuitCountTableEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                public final PhivDDCMPCircuitCountEntryEnt phivDDCMPCircuitCountEntry;

                private PhivDDCMPCircuitCountTableEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivDDCMPCircuitCountTable", "1.3.6.1.2.1.18.7.2", false, true, false, false);
                    this.phivDDCMPCircuitCountEntry = new PhivDDCMPCircuitCountEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.phivDDCMPCircuitCountEntry
                    };
                }
                public static final class PhivDDCMPCircuitCountEntryEnt extends MIBEntry<DECNETPHIVMIBDef>
                {
                    public final PhivDDCMPCircuitErrorsInbdEnt phivDDCMPCircuitErrorsInbd;

                    public final PhivDDCMPCircuitErrorsOutbdEnt phivDDCMPCircuitErrorsOutbd;

                    public final PhivDDCMPCircuitRmteReplyTimeoutsEnt phivDDCMPCircuitRmteReplyTimeouts;

                    public final PhivDDCMPCircuitLocalReplyTimeoutsEnt phivDDCMPCircuitLocalReplyTimeouts;

                    public final PhivDDCMPCircuitRmteBuffErrorsEnt phivDDCMPCircuitRmteBuffErrors;

                    public final PhivDDCMPCircuitLocalBuffErrorsEnt phivDDCMPCircuitLocalBuffErrors;

                    public final PhivDDCMPCircuitSelectIntervalsElapEnt phivDDCMPCircuitSelectIntervalsElap;

                    public final PhivDDCMPCircuitSelectTimeoutsEnt phivDDCMPCircuitSelectTimeouts;

                    private PhivDDCMPCircuitCountEntryEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                    {
                        super(mib, parent, "phivDDCMPCircuitCountEntry", "1.3.6.1.2.1.18.7.2.1", false, false, false, true);
                        this.phivDDCMPCircuitErrorsInbd = new PhivDDCMPCircuitErrorsInbdEnt(mib, this);
                        this.phivDDCMPCircuitErrorsOutbd = new PhivDDCMPCircuitErrorsOutbdEnt(mib, this);
                        this.phivDDCMPCircuitRmteReplyTimeouts = new PhivDDCMPCircuitRmteReplyTimeoutsEnt(mib, this);
                        this.phivDDCMPCircuitLocalReplyTimeouts = new PhivDDCMPCircuitLocalReplyTimeoutsEnt(mib, this);
                        this.phivDDCMPCircuitRmteBuffErrors = new PhivDDCMPCircuitRmteBuffErrorsEnt(mib, this);
                        this.phivDDCMPCircuitLocalBuffErrors = new PhivDDCMPCircuitLocalBuffErrorsEnt(mib, this);
                        this.phivDDCMPCircuitSelectIntervalsElap = new PhivDDCMPCircuitSelectIntervalsElapEnt(mib, this);
                        this.phivDDCMPCircuitSelectTimeouts = new PhivDDCMPCircuitSelectTimeoutsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.phivDDCMPCircuitErrorsInbd,
                            this.phivDDCMPCircuitErrorsOutbd,
                            this.phivDDCMPCircuitRmteReplyTimeouts,
                            this.phivDDCMPCircuitLocalReplyTimeouts,
                            this.phivDDCMPCircuitRmteBuffErrors,
                            this.phivDDCMPCircuitLocalBuffErrors,
                            this.phivDDCMPCircuitSelectIntervalsElap,
                            this.phivDDCMPCircuitSelectTimeouts
                        };
                    }
                    public static final class PhivDDCMPCircuitErrorsInbdEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivDDCMPCircuitErrorsInbdEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivDDCMPCircuitErrorsInbd", "1.3.6.1.2.1.18.7.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivDDCMPCircuitErrorsOutbdEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivDDCMPCircuitErrorsOutbdEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivDDCMPCircuitErrorsOutbd", "1.3.6.1.2.1.18.7.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivDDCMPCircuitRmteReplyTimeoutsEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivDDCMPCircuitRmteReplyTimeoutsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivDDCMPCircuitRmteReplyTimeouts", "1.3.6.1.2.1.18.7.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivDDCMPCircuitLocalReplyTimeoutsEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivDDCMPCircuitLocalReplyTimeoutsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivDDCMPCircuitLocalReplyTimeouts", "1.3.6.1.2.1.18.7.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivDDCMPCircuitRmteBuffErrorsEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivDDCMPCircuitRmteBuffErrorsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivDDCMPCircuitRmteBuffErrors", "1.3.6.1.2.1.18.7.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivDDCMPCircuitLocalBuffErrorsEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivDDCMPCircuitLocalBuffErrorsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivDDCMPCircuitLocalBuffErrors", "1.3.6.1.2.1.18.7.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivDDCMPCircuitSelectIntervalsElapEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivDDCMPCircuitSelectIntervalsElapEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivDDCMPCircuitSelectIntervalsElap", "1.3.6.1.2.1.18.7.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivDDCMPCircuitSelectTimeoutsEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivDDCMPCircuitSelectTimeoutsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivDDCMPCircuitSelectTimeouts", "1.3.6.1.2.1.18.7.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PhivDDCMPLineCountTableEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                public final PhivDDCMPLineCountEntryEnt phivDDCMPLineCountEntry;

                private PhivDDCMPLineCountTableEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivDDCMPLineCountTable", "1.3.6.1.2.1.18.7.3", false, true, false, false);
                    this.phivDDCMPLineCountEntry = new PhivDDCMPLineCountEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.phivDDCMPLineCountEntry
                    };
                }
                public static final class PhivDDCMPLineCountEntryEnt extends MIBEntry<DECNETPHIVMIBDef>
                {
                    public final PhivDDCMPLineCountIndexEnt phivDDCMPLineCountIndex;

                    public final PhivDDCMPLineCountDataErrsInEnt phivDDCMPLineCountDataErrsIn;

                    public final PhivDDCMPLineCountRmteStationErrsEnt phivDDCMPLineCountRmteStationErrs;

                    public final PhivDDCMPLineCountLocalStationErrsEnt phivDDCMPLineCountLocalStationErrs;

                    private PhivDDCMPLineCountEntryEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                    {
                        super(mib, parent, "phivDDCMPLineCountEntry", "1.3.6.1.2.1.18.7.3.1", false, false, false, true);
                        this.phivDDCMPLineCountIndex = new PhivDDCMPLineCountIndexEnt(mib, this);
                        this.phivDDCMPLineCountDataErrsIn = new PhivDDCMPLineCountDataErrsInEnt(mib, this);
                        this.phivDDCMPLineCountRmteStationErrs = new PhivDDCMPLineCountRmteStationErrsEnt(mib, this);
                        this.phivDDCMPLineCountLocalStationErrs = new PhivDDCMPLineCountLocalStationErrsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.phivDDCMPLineCountIndex,
                            this.phivDDCMPLineCountDataErrsIn,
                            this.phivDDCMPLineCountRmteStationErrs,
                            this.phivDDCMPLineCountLocalStationErrs
                        };
                    }
                    public static final class PhivDDCMPLineCountIndexEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivDDCMPLineCountIndexEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivDDCMPLineCountIndex", "1.3.6.1.2.1.18.7.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivDDCMPLineCountDataErrsInEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivDDCMPLineCountDataErrsInEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivDDCMPLineCountDataErrsIn", "1.3.6.1.2.1.18.7.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivDDCMPLineCountRmteStationErrsEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivDDCMPLineCountRmteStationErrsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivDDCMPLineCountRmteStationErrs", "1.3.6.1.2.1.18.7.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivDDCMPLineCountLocalStationErrsEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivDDCMPLineCountLocalStationErrsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivDDCMPLineCountLocalStationErrs", "1.3.6.1.2.1.18.7.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class ControlEnt extends MIBEntry<DECNETPHIVMIBDef>
        {
            /** DDCMP Multipoint Circuit Control Group
The implementation of the DDCMP Multipoint Circuit ControlGroup is optional.  A system can be said to implement this groupif and only if all objects in this group are implemented.*/
            public final PhivControlSchedTimerEnt phivControlSchedTimer;

            public final PhivControlDeadTimerEnt phivControlDeadTimer;

            public final PhivControlDelayTimerEnt phivControlDelayTimer;

            public final PhivControlStreamTimerEnt phivControlStreamTimer;

            /** DDCMP Multipoint Circuit Control Parameters Table*/
            public final PhivControlParametersTableEnt phivControlParametersTable;

            private ControlEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
            {
                super(mib, parent, "control", "1.3.6.1.2.1.18.8", false, false, false, false);
                this.phivControlSchedTimer = new PhivControlSchedTimerEnt(mib, this);
                this.phivControlDeadTimer = new PhivControlDeadTimerEnt(mib, this);
                this.phivControlDelayTimer = new PhivControlDelayTimerEnt(mib, this);
                this.phivControlStreamTimer = new PhivControlStreamTimerEnt(mib, this);
                this.phivControlParametersTable = new PhivControlParametersTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.phivControlSchedTimer,
                    this.phivControlDeadTimer,
                    this.phivControlDelayTimer,
                    this.phivControlStreamTimer,
                    this.phivControlParametersTable
                };
            }
            public static final class PhivControlSchedTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivControlSchedTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivControlSchedTimer", "1.3.6.1.2.1.18.8.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivControlDeadTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivControlDeadTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivControlDeadTimer", "1.3.6.1.2.1.18.8.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivControlDelayTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivControlDelayTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivControlDelayTimer", "1.3.6.1.2.1.18.8.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivControlStreamTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivControlStreamTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivControlStreamTimer", "1.3.6.1.2.1.18.8.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivControlParametersTableEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                public final PhivControlParametersEntryEnt phivControlParametersEntry;

                private PhivControlParametersTableEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivControlParametersTable", "1.3.6.1.2.1.18.8.5", false, true, false, false);
                    this.phivControlParametersEntry = new PhivControlParametersEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.phivControlParametersEntry
                    };
                }
                public static final class PhivControlParametersEntryEnt extends MIBEntry<DECNETPHIVMIBDef>
                {
                    public final PhivControlCircuitIndexEnt phivControlCircuitIndex;

                    public final PhivControlBabbleTimerEnt phivControlBabbleTimer;

                    public final PhivControlMaxBuffsEnt phivControlMaxBuffs;

                    public final PhivControlMaxTransmitsEnt phivControlMaxTransmits;

                    public final PhivControlDyingBaseEnt phivControlDyingBase;

                    public final PhivControlDyingIncrementEnt phivControlDyingIncrement;

                    public final PhivControlDeadThresholdEnt phivControlDeadThreshold;

                    public final PhivControlDyingThresholdEnt phivControlDyingThreshold;

                    public final PhivControlInactTresholdEnt phivControlInactTreshold;

                    public final PhivControlPollingStateEnt phivControlPollingState;

                    public final PhivControlPollingSubStateEnt phivControlPollingSubState;

                    public final PhivControlTransTimerEnt phivControlTransTimer;

                    private PhivControlParametersEntryEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                    {
                        super(mib, parent, "phivControlParametersEntry", "1.3.6.1.2.1.18.8.5.1", false, false, false, true);
                        this.phivControlCircuitIndex = new PhivControlCircuitIndexEnt(mib, this);
                        this.phivControlBabbleTimer = new PhivControlBabbleTimerEnt(mib, this);
                        this.phivControlMaxBuffs = new PhivControlMaxBuffsEnt(mib, this);
                        this.phivControlMaxTransmits = new PhivControlMaxTransmitsEnt(mib, this);
                        this.phivControlDyingBase = new PhivControlDyingBaseEnt(mib, this);
                        this.phivControlDyingIncrement = new PhivControlDyingIncrementEnt(mib, this);
                        this.phivControlDeadThreshold = new PhivControlDeadThresholdEnt(mib, this);
                        this.phivControlDyingThreshold = new PhivControlDyingThresholdEnt(mib, this);
                        this.phivControlInactTreshold = new PhivControlInactTresholdEnt(mib, this);
                        this.phivControlPollingState = new PhivControlPollingStateEnt(mib, this);
                        this.phivControlPollingSubState = new PhivControlPollingSubStateEnt(mib, this);
                        this.phivControlTransTimer = new PhivControlTransTimerEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.phivControlCircuitIndex,
                            this.phivControlBabbleTimer,
                            this.phivControlMaxBuffs,
                            this.phivControlMaxTransmits,
                            this.phivControlDyingBase,
                            this.phivControlDyingIncrement,
                            this.phivControlDeadThreshold,
                            this.phivControlDyingThreshold,
                            this.phivControlInactTreshold,
                            this.phivControlPollingState,
                            this.phivControlPollingSubState,
                            this.phivControlTransTimer
                        };
                    }
                    public static final class PhivControlCircuitIndexEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivControlCircuitIndexEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivControlCircuitIndex", "1.3.6.1.2.1.18.8.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivControlBabbleTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivControlBabbleTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivControlBabbleTimer", "1.3.6.1.2.1.18.8.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivControlMaxBuffsEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivControlMaxBuffsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivControlMaxBuffs", "1.3.6.1.2.1.18.8.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivControlMaxTransmitsEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivControlMaxTransmitsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivControlMaxTransmits", "1.3.6.1.2.1.18.8.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivControlDyingBaseEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivControlDyingBaseEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivControlDyingBase", "1.3.6.1.2.1.18.8.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivControlDyingIncrementEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivControlDyingIncrementEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivControlDyingIncrement", "1.3.6.1.2.1.18.8.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivControlDeadThresholdEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivControlDeadThresholdEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivControlDeadThreshold", "1.3.6.1.2.1.18.8.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivControlDyingThresholdEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivControlDyingThresholdEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivControlDyingThreshold", "1.3.6.1.2.1.18.8.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivControlInactTresholdEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivControlInactTresholdEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivControlInactTreshold", "1.3.6.1.2.1.18.8.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivControlPollingStateEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivControlPollingStateEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivControlPollingState", "1.3.6.1.2.1.18.8.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivControlPollingSubStateEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivControlPollingSubStateEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivControlPollingSubState", "1.3.6.1.2.1.18.8.5.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivControlTransTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivControlTransTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivControlTransTimer", "1.3.6.1.2.1.18.8.5.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class EthernetEnt extends MIBEntry<DECNETPHIVMIBDef>
        {
            /** Ethernet Group
The implementation of the Ethernet Group is mandatoryfor all systems which support ethernet links.
Ethernet Parameters Table*/
            public final PhivEthLinkParametersTableEnt phivEthLinkParametersTable;

            private EthernetEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
            {
                super(mib, parent, "ethernet", "1.3.6.1.2.1.18.9", false, false, false, false);
                this.phivEthLinkParametersTable = new PhivEthLinkParametersTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.phivEthLinkParametersTable
                };
            }
            public static final class PhivEthLinkParametersTableEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                public final PhivEthLinkParametersEntryEnt phivEthLinkParametersEntry;

                private PhivEthLinkParametersTableEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivEthLinkParametersTable", "1.3.6.1.2.1.18.9.1", false, true, false, false);
                    this.phivEthLinkParametersEntry = new PhivEthLinkParametersEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.phivEthLinkParametersEntry
                    };
                }
                public static final class PhivEthLinkParametersEntryEnt extends MIBEntry<DECNETPHIVMIBDef>
                {
                    public final PhivEthLinkIndexEnt phivEthLinkIndex;

                    public final PhivEthDesigRouterNodeAddrEnt phivEthDesigRouterNodeAddr;

                    public final PhivEthMaxRoutersEnt phivEthMaxRouters;

                    public final PhivEthRouterPriEnt phivEthRouterPri;

                    public final PhivEthHardwareAddrEnt phivEthHardwareAddr;

                    private PhivEthLinkParametersEntryEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                    {
                        super(mib, parent, "phivEthLinkParametersEntry", "1.3.6.1.2.1.18.9.1.1", false, false, false, true);
                        this.phivEthLinkIndex = new PhivEthLinkIndexEnt(mib, this);
                        this.phivEthDesigRouterNodeAddr = new PhivEthDesigRouterNodeAddrEnt(mib, this);
                        this.phivEthMaxRouters = new PhivEthMaxRoutersEnt(mib, this);
                        this.phivEthRouterPri = new PhivEthRouterPriEnt(mib, this);
                        this.phivEthHardwareAddr = new PhivEthHardwareAddrEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.phivEthLinkIndex,
                            this.phivEthDesigRouterNodeAddr,
                            this.phivEthMaxRouters,
                            this.phivEthRouterPri,
                            this.phivEthHardwareAddr
                        };
                    }
                    public static final class PhivEthLinkIndexEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEthLinkIndexEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEthLinkIndex", "1.3.6.1.2.1.18.9.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEthDesigRouterNodeAddrEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEthDesigRouterNodeAddrEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEthDesigRouterNodeAddr", "1.3.6.1.2.1.18.9.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEthMaxRoutersEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEthMaxRoutersEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEthMaxRouters", "1.3.6.1.2.1.18.9.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEthRouterPriEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEthRouterPriEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEthRouterPri", "1.3.6.1.2.1.18.9.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivEthHardwareAddrEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivEthHardwareAddrEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivEthHardwareAddr", "1.3.6.1.2.1.18.9.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class CountersEnt extends MIBEntry<DECNETPHIVMIBDef>
        {
            /** Counters Group
The implementation of the Counters Group is optional.A system can be said to implement this group if and only ifall objects in this group are implemented.
Counters Table*/
            public final PhivCountersCountTableEnt phivCountersCountTable;

            private CountersEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
            {
                super(mib, parent, "counters", "1.3.6.1.2.1.18.10", false, false, false, false);
                this.phivCountersCountTable = new PhivCountersCountTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.phivCountersCountTable
                };
            }
            public static final class PhivCountersCountTableEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                public final PhivCountersCountEntryEnt phivCountersCountEntry;

                private PhivCountersCountTableEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivCountersCountTable", "1.3.6.1.2.1.18.10.1", false, true, false, false);
                    this.phivCountersCountEntry = new PhivCountersCountEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.phivCountersCountEntry
                    };
                }
                public static final class PhivCountersCountEntryEnt extends MIBEntry<DECNETPHIVMIBDef>
                {
                    public final PhivCountersIndexEnt phivCountersIndex;

                    public final PhivCountersCountBytesRecdEnt phivCountersCountBytesRecd;

                    public final PhivCountersCountBytesSentEnt phivCountersCountBytesSent;

                    public final PhivCountersCountDataBlocksRecdEnt phivCountersCountDataBlocksRecd;

                    public final PhivCountersCountDataBlocksSentEnt phivCountersCountDataBlocksSent;

                    public final PhivCountersCountEthUsrBuffUnavEnt phivCountersCountEthUsrBuffUnav;

                    public final PhivCountersCountMcastBytesRecdEnt phivCountersCountMcastBytesRecd;

                    public final PhivCountersCountDataBlksRecdEnt phivCountersCountDataBlksRecd;

                    public final PhivCountersCountDataBlksSentEnt phivCountersCountDataBlksSent;

                    public final PhivCountersCountMcastBlksRecdEnt phivCountersCountMcastBlksRecd;

                    public final PhivCountersCountBlksSentDefEnt phivCountersCountBlksSentDef;

                    public final PhivCountersCountBlksSentSingleColEnt phivCountersCountBlksSentSingleCol;

                    public final PhivCountersCountBlksSentMultColEnt phivCountersCountBlksSentMultCol;

                    public final PhivCountersCountSendFailureEnt phivCountersCountSendFailure;

                    public final PhivCountersCountCollDetectFailureEnt phivCountersCountCollDetectFailure;

                    public final PhivCountersCountReceiveFailureEnt phivCountersCountReceiveFailure;

                    public final PhivCountersCountUnrecFrameDestEnt phivCountersCountUnrecFrameDest;

                    public final PhivCountersCountDataOverEnt phivCountersCountDataOver;

                    public final PhivCountersCountSysBuffUnavEnt phivCountersCountSysBuffUnav;

                    public final PhivCountersCountUsrBuffUnavEnt phivCountersCountUsrBuffUnav;

                    private PhivCountersCountEntryEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                    {
                        super(mib, parent, "phivCountersCountEntry", "1.3.6.1.2.1.18.10.1.1", false, false, false, true);
                        this.phivCountersIndex = new PhivCountersIndexEnt(mib, this);
                        this.phivCountersCountBytesRecd = new PhivCountersCountBytesRecdEnt(mib, this);
                        this.phivCountersCountBytesSent = new PhivCountersCountBytesSentEnt(mib, this);
                        this.phivCountersCountDataBlocksRecd = new PhivCountersCountDataBlocksRecdEnt(mib, this);
                        this.phivCountersCountDataBlocksSent = new PhivCountersCountDataBlocksSentEnt(mib, this);
                        this.phivCountersCountEthUsrBuffUnav = new PhivCountersCountEthUsrBuffUnavEnt(mib, this);
                        this.phivCountersCountMcastBytesRecd = new PhivCountersCountMcastBytesRecdEnt(mib, this);
                        this.phivCountersCountDataBlksRecd = new PhivCountersCountDataBlksRecdEnt(mib, this);
                        this.phivCountersCountDataBlksSent = new PhivCountersCountDataBlksSentEnt(mib, this);
                        this.phivCountersCountMcastBlksRecd = new PhivCountersCountMcastBlksRecdEnt(mib, this);
                        this.phivCountersCountBlksSentDef = new PhivCountersCountBlksSentDefEnt(mib, this);
                        this.phivCountersCountBlksSentSingleCol = new PhivCountersCountBlksSentSingleColEnt(mib, this);
                        this.phivCountersCountBlksSentMultCol = new PhivCountersCountBlksSentMultColEnt(mib, this);
                        this.phivCountersCountSendFailure = new PhivCountersCountSendFailureEnt(mib, this);
                        this.phivCountersCountCollDetectFailure = new PhivCountersCountCollDetectFailureEnt(mib, this);
                        this.phivCountersCountReceiveFailure = new PhivCountersCountReceiveFailureEnt(mib, this);
                        this.phivCountersCountUnrecFrameDest = new PhivCountersCountUnrecFrameDestEnt(mib, this);
                        this.phivCountersCountDataOver = new PhivCountersCountDataOverEnt(mib, this);
                        this.phivCountersCountSysBuffUnav = new PhivCountersCountSysBuffUnavEnt(mib, this);
                        this.phivCountersCountUsrBuffUnav = new PhivCountersCountUsrBuffUnavEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.phivCountersIndex,
                            this.phivCountersCountBytesRecd,
                            this.phivCountersCountBytesSent,
                            this.phivCountersCountDataBlocksRecd,
                            this.phivCountersCountDataBlocksSent,
                            this.phivCountersCountEthUsrBuffUnav,
                            this.phivCountersCountMcastBytesRecd,
                            this.phivCountersCountDataBlksRecd,
                            this.phivCountersCountDataBlksSent,
                            this.phivCountersCountMcastBlksRecd,
                            this.phivCountersCountBlksSentDef,
                            this.phivCountersCountBlksSentSingleCol,
                            this.phivCountersCountBlksSentMultCol,
                            this.phivCountersCountSendFailure,
                            this.phivCountersCountCollDetectFailure,
                            this.phivCountersCountReceiveFailure,
                            this.phivCountersCountUnrecFrameDest,
                            this.phivCountersCountDataOver,
                            this.phivCountersCountSysBuffUnav,
                            this.phivCountersCountUsrBuffUnav
                        };
                    }
                    public static final class PhivCountersIndexEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersIndexEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersIndex", "1.3.6.1.2.1.18.10.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountBytesRecdEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountBytesRecdEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountBytesRecd", "1.3.6.1.2.1.18.10.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountBytesSentEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountBytesSentEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountBytesSent", "1.3.6.1.2.1.18.10.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountDataBlocksRecdEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountDataBlocksRecdEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountDataBlocksRecd", "1.3.6.1.2.1.18.10.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountDataBlocksSentEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountDataBlocksSentEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountDataBlocksSent", "1.3.6.1.2.1.18.10.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountEthUsrBuffUnavEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountEthUsrBuffUnavEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountEthUsrBuffUnav", "1.3.6.1.2.1.18.10.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountMcastBytesRecdEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountMcastBytesRecdEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountMcastBytesRecd", "1.3.6.1.2.1.18.10.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountDataBlksRecdEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountDataBlksRecdEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountDataBlksRecd", "1.3.6.1.2.1.18.10.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountDataBlksSentEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountDataBlksSentEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountDataBlksSent", "1.3.6.1.2.1.18.10.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountMcastBlksRecdEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountMcastBlksRecdEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountMcastBlksRecd", "1.3.6.1.2.1.18.10.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountBlksSentDefEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountBlksSentDefEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountBlksSentDef", "1.3.6.1.2.1.18.10.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountBlksSentSingleColEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountBlksSentSingleColEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountBlksSentSingleCol", "1.3.6.1.2.1.18.10.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountBlksSentMultColEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountBlksSentMultColEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountBlksSentMultCol", "1.3.6.1.2.1.18.10.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountSendFailureEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountSendFailureEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountSendFailure", "1.3.6.1.2.1.18.10.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountCollDetectFailureEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountCollDetectFailureEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountCollDetectFailure", "1.3.6.1.2.1.18.10.1.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountReceiveFailureEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountReceiveFailureEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountReceiveFailure", "1.3.6.1.2.1.18.10.1.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountUnrecFrameDestEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountUnrecFrameDestEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountUnrecFrameDest", "1.3.6.1.2.1.18.10.1.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountDataOverEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountDataOverEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountDataOver", "1.3.6.1.2.1.18.10.1.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountSysBuffUnavEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountSysBuffUnavEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountSysBuffUnav", "1.3.6.1.2.1.18.10.1.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivCountersCountUsrBuffUnavEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivCountersCountUsrBuffUnavEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivCountersCountUsrBuffUnav", "1.3.6.1.2.1.18.10.1.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class AdjacencyEnt extends MIBEntry<DECNETPHIVMIBDef>
        {
            /** Adjacency Group
The implementation of the Adjacency Group is mandatory for allconformant implementations of this memo.
The phivAdjTable has been made obsolete it has been replaced withthe phivAdjNodeTable.*/
            public final PhivAdjTableEnt phivAdjTable;

            /** New Adjacency Table this replaces the phivAdjTable.*/
            public final PhivAdjNodeTableEnt phivAdjNodeTable;

            private AdjacencyEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
            {
                super(mib, parent, "adjacency", "1.3.6.1.2.1.18.11", false, false, false, false);
                this.phivAdjTable = new PhivAdjTableEnt(mib, this);
                this.phivAdjNodeTable = new PhivAdjNodeTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.phivAdjTable,
                    this.phivAdjNodeTable
                };
            }
            public static final class PhivAdjTableEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                public final PhivAdjEntryEnt phivAdjEntry;

                private PhivAdjTableEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivAdjTable", "1.3.6.1.2.1.18.11.1", false, true, false, false);
                    this.phivAdjEntry = new PhivAdjEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.phivAdjEntry
                    };
                }
                public static final class PhivAdjEntryEnt extends MIBEntry<DECNETPHIVMIBDef>
                {
                    public final PhivAdjCircuitIndexEnt phivAdjCircuitIndex;

                    public final PhivAdjNodeAddrEnt phivAdjNodeAddr;

                    public final PhivAdjBlockSizeEnt phivAdjBlockSize;

                    public final PhivAdjListenTimerEnt phivAdjListenTimer;

                    public final PhivAdjCircuitEtherServPhysAddrEnt phivAdjCircuitEtherServPhysAddr;

                    public final PhivAdjTypeEnt phivAdjType;

                    public final PhivAdjStateEnt phivAdjState;

                    public final PhivAdjPriorityEnt phivAdjPriority;

                    public final PhivAdjExecListenTimerEnt phivAdjExecListenTimer;

                    private PhivAdjEntryEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                    {
                        super(mib, parent, "phivAdjEntry", "1.3.6.1.2.1.18.11.1.1", false, false, false, true);
                        this.phivAdjCircuitIndex = new PhivAdjCircuitIndexEnt(mib, this);
                        this.phivAdjNodeAddr = new PhivAdjNodeAddrEnt(mib, this);
                        this.phivAdjBlockSize = new PhivAdjBlockSizeEnt(mib, this);
                        this.phivAdjListenTimer = new PhivAdjListenTimerEnt(mib, this);
                        this.phivAdjCircuitEtherServPhysAddr = new PhivAdjCircuitEtherServPhysAddrEnt(mib, this);
                        this.phivAdjType = new PhivAdjTypeEnt(mib, this);
                        this.phivAdjState = new PhivAdjStateEnt(mib, this);
                        this.phivAdjPriority = new PhivAdjPriorityEnt(mib, this);
                        this.phivAdjExecListenTimer = new PhivAdjExecListenTimerEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.phivAdjCircuitIndex,
                            this.phivAdjNodeAddr,
                            this.phivAdjBlockSize,
                            this.phivAdjListenTimer,
                            this.phivAdjCircuitEtherServPhysAddr,
                            this.phivAdjType,
                            this.phivAdjState,
                            this.phivAdjPriority,
                            this.phivAdjExecListenTimer
                        };
                    }
                    public static final class PhivAdjCircuitIndexEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAdjCircuitIndexEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAdjCircuitIndex", "1.3.6.1.2.1.18.11.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAdjNodeAddrEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAdjNodeAddrEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAdjNodeAddr", "1.3.6.1.2.1.18.11.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAdjBlockSizeEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAdjBlockSizeEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAdjBlockSize", "1.3.6.1.2.1.18.11.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAdjListenTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAdjListenTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAdjListenTimer", "1.3.6.1.2.1.18.11.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAdjCircuitEtherServPhysAddrEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAdjCircuitEtherServPhysAddrEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAdjCircuitEtherServPhysAddr", "1.3.6.1.2.1.18.11.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAdjTypeEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAdjTypeEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAdjType", "1.3.6.1.2.1.18.11.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAdjStateEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAdjStateEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAdjState", "1.3.6.1.2.1.18.11.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAdjPriorityEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAdjPriorityEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAdjPriority", "1.3.6.1.2.1.18.11.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAdjExecListenTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAdjExecListenTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAdjExecListenTimer", "1.3.6.1.2.1.18.11.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PhivAdjNodeTableEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                public final PhivAdjNodeEntryEnt phivAdjNodeEntry;

                private PhivAdjNodeTableEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivAdjNodeTable", "1.3.6.1.2.1.18.11.2", false, true, false, false);
                    this.phivAdjNodeEntry = new PhivAdjNodeEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.phivAdjNodeEntry
                    };
                }
                public static final class PhivAdjNodeEntryEnt extends MIBEntry<DECNETPHIVMIBDef>
                {
                    public final PhivAdjNodeCircuitIndexEnt phivAdjNodeCircuitIndex;

                    public final PhivAdjAddrEnt phivAdjAddr;

                    public final PhivAdjNodeBlockSizeEnt phivAdjNodeBlockSize;

                    public final PhivAdjNodeListenTimerEnt phivAdjNodeListenTimer;

                    public final PhivAdjNodeCircuitEtherServPhysAddrEnt phivAdjNodeCircuitEtherServPhysAddr;

                    public final PhivAdjNodeTypeEnt phivAdjNodeType;

                    public final PhivAdjNodeStateEnt phivAdjNodeState;

                    public final PhivAdjNodePriorityEnt phivAdjNodePriority;

                    private PhivAdjNodeEntryEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                    {
                        super(mib, parent, "phivAdjNodeEntry", "1.3.6.1.2.1.18.11.2.1", false, false, false, true);
                        this.phivAdjNodeCircuitIndex = new PhivAdjNodeCircuitIndexEnt(mib, this);
                        this.phivAdjAddr = new PhivAdjAddrEnt(mib, this);
                        this.phivAdjNodeBlockSize = new PhivAdjNodeBlockSizeEnt(mib, this);
                        this.phivAdjNodeListenTimer = new PhivAdjNodeListenTimerEnt(mib, this);
                        this.phivAdjNodeCircuitEtherServPhysAddr = new PhivAdjNodeCircuitEtherServPhysAddrEnt(mib, this);
                        this.phivAdjNodeType = new PhivAdjNodeTypeEnt(mib, this);
                        this.phivAdjNodeState = new PhivAdjNodeStateEnt(mib, this);
                        this.phivAdjNodePriority = new PhivAdjNodePriorityEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.phivAdjNodeCircuitIndex,
                            this.phivAdjAddr,
                            this.phivAdjNodeBlockSize,
                            this.phivAdjNodeListenTimer,
                            this.phivAdjNodeCircuitEtherServPhysAddr,
                            this.phivAdjNodeType,
                            this.phivAdjNodeState,
                            this.phivAdjNodePriority
                        };
                    }
                    public static final class PhivAdjNodeCircuitIndexEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAdjNodeCircuitIndexEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAdjNodeCircuitIndex", "1.3.6.1.2.1.18.11.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAdjAddrEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAdjAddrEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAdjAddr", "1.3.6.1.2.1.18.11.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAdjNodeBlockSizeEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAdjNodeBlockSizeEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAdjNodeBlockSize", "1.3.6.1.2.1.18.11.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAdjNodeListenTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAdjNodeListenTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAdjNodeListenTimer", "1.3.6.1.2.1.18.11.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAdjNodeCircuitEtherServPhysAddrEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAdjNodeCircuitEtherServPhysAddrEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAdjNodeCircuitEtherServPhysAddr", "1.3.6.1.2.1.18.11.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAdjNodeTypeEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAdjNodeTypeEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAdjNodeType", "1.3.6.1.2.1.18.11.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAdjNodeStateEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAdjNodeStateEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAdjNodeState", "1.3.6.1.2.1.18.11.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAdjNodePriorityEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAdjNodePriorityEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAdjNodePriority", "1.3.6.1.2.1.18.11.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class LineEnt extends MIBEntry<DECNETPHIVMIBDef>
        {
            /** Line Group
The implementation of the Line Group is mandatory for allconformant implementations of this memo.*/
            public final PhivLineTableEnt phivLineTable;

            private LineEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
            {
                super(mib, parent, "line", "1.3.6.1.2.1.18.12", false, false, false, false);
                this.phivLineTable = new PhivLineTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.phivLineTable
                };
            }
            public static final class PhivLineTableEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                public final PhivLineEntryEnt phivLineEntry;

                private PhivLineTableEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivLineTable", "1.3.6.1.2.1.18.12.1", false, true, false, false);
                    this.phivLineEntry = new PhivLineEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.phivLineEntry
                    };
                }
                public static final class PhivLineEntryEnt extends MIBEntry<DECNETPHIVMIBDef>
                {
                    public final PhivLineIndexEnt phivLineIndex;

                    public final PhivLineNameEnt phivLineName;

                    public final PhivLineStateEnt phivLineState;

                    public final PhivLineSubstateEnt phivLineSubstate;

                    public final PhivLineServiceEnt phivLineService;

                    public final PhivLineDeviceEnt phivLineDevice;

                    public final PhivLineReceiveBuffsEnt phivLineReceiveBuffs;

                    public final PhivLineProtocolEnt phivLineProtocol;

                    public final PhivLineServiceTimerEnt phivLineServiceTimer;

                    public final PhivLineMaxBlockEnt phivLineMaxBlock;

                    private PhivLineEntryEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                    {
                        super(mib, parent, "phivLineEntry", "1.3.6.1.2.1.18.12.1.1", false, false, false, true);
                        this.phivLineIndex = new PhivLineIndexEnt(mib, this);
                        this.phivLineName = new PhivLineNameEnt(mib, this);
                        this.phivLineState = new PhivLineStateEnt(mib, this);
                        this.phivLineSubstate = new PhivLineSubstateEnt(mib, this);
                        this.phivLineService = new PhivLineServiceEnt(mib, this);
                        this.phivLineDevice = new PhivLineDeviceEnt(mib, this);
                        this.phivLineReceiveBuffs = new PhivLineReceiveBuffsEnt(mib, this);
                        this.phivLineProtocol = new PhivLineProtocolEnt(mib, this);
                        this.phivLineServiceTimer = new PhivLineServiceTimerEnt(mib, this);
                        this.phivLineMaxBlock = new PhivLineMaxBlockEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.phivLineIndex,
                            this.phivLineName,
                            this.phivLineState,
                            this.phivLineSubstate,
                            this.phivLineService,
                            this.phivLineDevice,
                            this.phivLineReceiveBuffs,
                            this.phivLineProtocol,
                            this.phivLineServiceTimer,
                            this.phivLineMaxBlock
                        };
                    }
                    public static final class PhivLineIndexEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivLineIndexEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivLineIndex", "1.3.6.1.2.1.18.12.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivLineNameEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivLineNameEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivLineName", "1.3.6.1.2.1.18.12.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivLineStateEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivLineStateEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivLineState", "1.3.6.1.2.1.18.12.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivLineSubstateEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivLineSubstateEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivLineSubstate", "1.3.6.1.2.1.18.12.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivLineServiceEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivLineServiceEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivLineService", "1.3.6.1.2.1.18.12.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivLineDeviceEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivLineDeviceEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivLineDevice", "1.3.6.1.2.1.18.12.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivLineReceiveBuffsEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivLineReceiveBuffsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivLineReceiveBuffs", "1.3.6.1.2.1.18.12.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivLineProtocolEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivLineProtocolEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivLineProtocol", "1.3.6.1.2.1.18.12.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivLineServiceTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivLineServiceTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivLineServiceTimer", "1.3.6.1.2.1.18.12.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivLineMaxBlockEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivLineMaxBlockEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivLineMaxBlock", "1.3.6.1.2.1.18.12.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class NonBroadcastLineEnt extends MIBEntry<DECNETPHIVMIBDef>
        {
            /** Non Broadcast Line Group
The implementation of the Non Broadcast Line Group is optional.A system can be said to implement this group if and only ifall objects in this group are implemented.*/
            public final PhivNonBroadcastTableEnt phivNonBroadcastTable;

            private NonBroadcastLineEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
            {
                super(mib, parent, "nonBroadcastLine", "1.3.6.1.2.1.18.14", false, false, false, false);
                this.phivNonBroadcastTable = new PhivNonBroadcastTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.phivNonBroadcastTable
                };
            }
            public static final class PhivNonBroadcastTableEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                public final PhivNonBroadcastEntryEnt phivNonBroadcastEntry;

                private PhivNonBroadcastTableEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivNonBroadcastTable", "1.3.6.1.2.1.18.14.1", false, true, false, false);
                    this.phivNonBroadcastEntry = new PhivNonBroadcastEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.phivNonBroadcastEntry
                    };
                }
                public static final class PhivNonBroadcastEntryEnt extends MIBEntry<DECNETPHIVMIBDef>
                {
                    public final PhivNonBroadcastIndexEnt phivNonBroadcastIndex;

                    public final PhivNonBroadcastControllerEnt phivNonBroadcastController;

                    public final PhivNonBroadcastDuplexEnt phivNonBroadcastDuplex;

                    public final PhivNonBroadcastClockEnt phivNonBroadcastClock;

                    public final PhivNonBroadcastRetransmitTimerEnt phivNonBroadcastRetransmitTimer;

                    private PhivNonBroadcastEntryEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                    {
                        super(mib, parent, "phivNonBroadcastEntry", "1.3.6.1.2.1.18.14.1.1", false, false, false, true);
                        this.phivNonBroadcastIndex = new PhivNonBroadcastIndexEnt(mib, this);
                        this.phivNonBroadcastController = new PhivNonBroadcastControllerEnt(mib, this);
                        this.phivNonBroadcastDuplex = new PhivNonBroadcastDuplexEnt(mib, this);
                        this.phivNonBroadcastClock = new PhivNonBroadcastClockEnt(mib, this);
                        this.phivNonBroadcastRetransmitTimer = new PhivNonBroadcastRetransmitTimerEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.phivNonBroadcastIndex,
                            this.phivNonBroadcastController,
                            this.phivNonBroadcastDuplex,
                            this.phivNonBroadcastClock,
                            this.phivNonBroadcastRetransmitTimer
                        };
                    }
                    public static final class PhivNonBroadcastIndexEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivNonBroadcastIndexEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivNonBroadcastIndex", "1.3.6.1.2.1.18.14.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivNonBroadcastControllerEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivNonBroadcastControllerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivNonBroadcastController", "1.3.6.1.2.1.18.14.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivNonBroadcastDuplexEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivNonBroadcastDuplexEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivNonBroadcastDuplex", "1.3.6.1.2.1.18.14.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivNonBroadcastClockEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivNonBroadcastClockEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivNonBroadcastClock", "1.3.6.1.2.1.18.14.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivNonBroadcastRetransmitTimerEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivNonBroadcastRetransmitTimerEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivNonBroadcastRetransmitTimer", "1.3.6.1.2.1.18.14.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class AreaEnt extends MIBEntry<DECNETPHIVMIBDef>
        {
            /** Area Parameters Group
The implementation of the Area Parameters Group is mandatoryfor all systems which implement level 2 routing.*/
            public final PhivAreaTableEnt phivAreaTable;

            /** Additional Area Parameters*/
            public final PhivAreaMaxCostEnt phivAreaMaxCost;

            public final PhivAreaMaxHopsEnt phivAreaMaxHops;

            public final PhivRouteMaxAreaEnt phivRouteMaxArea;

            private AreaEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
            {
                super(mib, parent, "area", "1.3.6.1.2.1.18.15", false, false, false, false);
                this.phivAreaTable = new PhivAreaTableEnt(mib, this);
                this.phivAreaMaxCost = new PhivAreaMaxCostEnt(mib, this);
                this.phivAreaMaxHops = new PhivAreaMaxHopsEnt(mib, this);
                this.phivRouteMaxArea = new PhivRouteMaxAreaEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.phivAreaTable,
                    this.phivAreaMaxCost,
                    this.phivAreaMaxHops,
                    this.phivRouteMaxArea
                };
            }
            public static final class PhivAreaTableEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                public final PhivAreaEntryEnt phivAreaEntry;

                private PhivAreaTableEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivAreaTable", "1.3.6.1.2.1.18.15.1", false, true, false, false);
                    this.phivAreaEntry = new PhivAreaEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.phivAreaEntry
                    };
                }
                public static final class PhivAreaEntryEnt extends MIBEntry<DECNETPHIVMIBDef>
                {
                    public final PhivAreaNumEnt phivAreaNum;

                    public final PhivAreaStateEnt phivAreaState;

                    public final PhivAreaCostEnt phivAreaCost;

                    public final PhivAreaHopsEnt phivAreaHops;

                    public final PhivAreaNextNodeEnt phivAreaNextNode;

                    public final PhivAreaCircuitIndexEnt phivAreaCircuitIndex;

                    private PhivAreaEntryEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                    {
                        super(mib, parent, "phivAreaEntry", "1.3.6.1.2.1.18.15.1.1", false, false, false, true);
                        this.phivAreaNum = new PhivAreaNumEnt(mib, this);
                        this.phivAreaState = new PhivAreaStateEnt(mib, this);
                        this.phivAreaCost = new PhivAreaCostEnt(mib, this);
                        this.phivAreaHops = new PhivAreaHopsEnt(mib, this);
                        this.phivAreaNextNode = new PhivAreaNextNodeEnt(mib, this);
                        this.phivAreaCircuitIndex = new PhivAreaCircuitIndexEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.phivAreaNum,
                            this.phivAreaState,
                            this.phivAreaCost,
                            this.phivAreaHops,
                            this.phivAreaNextNode,
                            this.phivAreaCircuitIndex
                        };
                    }
                    public static final class PhivAreaNumEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAreaNumEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAreaNum", "1.3.6.1.2.1.18.15.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAreaStateEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAreaStateEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAreaState", "1.3.6.1.2.1.18.15.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAreaCostEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAreaCostEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAreaCost", "1.3.6.1.2.1.18.15.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAreaHopsEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAreaHopsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAreaHops", "1.3.6.1.2.1.18.15.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAreaNextNodeEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAreaNextNodeEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAreaNextNode", "1.3.6.1.2.1.18.15.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PhivAreaCircuitIndexEnt extends MIBEntry<DECNETPHIVMIBDef>
                    {
                        private PhivAreaCircuitIndexEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                        {
                            super(mib, parent, "phivAreaCircuitIndex", "1.3.6.1.2.1.18.15.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PhivAreaMaxCostEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivAreaMaxCostEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivAreaMaxCost", "1.3.6.1.2.1.18.15.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivAreaMaxHopsEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivAreaMaxHopsEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivAreaMaxHops", "1.3.6.1.2.1.18.15.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PhivRouteMaxAreaEnt extends MIBEntry<DECNETPHIVMIBDef>
            {
                private PhivRouteMaxAreaEnt(DECNETPHIVMIBDef mib, MIBEntry<DECNETPHIVMIBDef> parent)
                {
                    super(mib, parent, "phivRouteMaxArea", "1.3.6.1.2.1.18.15.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
