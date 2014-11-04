package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class TOKENRINGMIBDef extends MIB
{
    public static final TOKENRINGMIBDef TOKENRINGMIB = new TOKENRINGMIBDef();

    static { MIBs.getInstance().registerMIB(TOKENRINGMIBDef.TOKENRINGMIB); }

    public final Dot5Ent dot5;

    private TOKENRINGMIBDef()
    {
        super("TOKENRING-MIB");
        this.dot5 = new Dot5Ent(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dot5
        };
    }

    public static final class Dot5Ent extends MIBEntry<TOKENRINGMIBDef>
    {
        /** The 802.5 Interface Table
This table contains state and parameter information whichis specific to 802.5 interfaces.  It is mandatory thatsystems having 802.5 interfaces implement this table inaddition to the ifTable (see RFCs 1213 and 1573).*/
        public final Dot5TableEnt dot5Table;

        /** The 802.5 Statistics Table
This table contains statistics and error counter which arespecific to 802.5 interfaces.  It is mandatory that systemshaving 802.5 interfaces implement this table.*/
        public final Dot5StatsTableEnt dot5StatsTable;

        /** The Timer Table
This group contains the values of timers for 802.5interfaces.  This table is obsolete, but its definitionis retained here for backwards compatibility.*/
        public final Dot5TimerTableEnt dot5TimerTable;

        /** 802.5 Interface Tests*/
        public final Dot5TestsEnt dot5Tests;

        /** 802.5 Hardware Chip Sets
RFC 1229 specified an object, ifExtnsChipSet, with thesyntax of OBJECT IDENTIFIER, to identify the hardwarechip set in use by an interface.  RFC 1573 obsoletesthe use of ifExtnsChipSet.  However, the followingdefinitions are retained for backwards compatibility.*/
        public final Dot5ChipSetsEnt dot5ChipSets;

        /** conformance information*/
        public final Dot5ConformanceEnt dot5Conformance;

        private Dot5Ent(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
        {
            super(mib, parent, "dot5", "1.3.6.1.2.1.10.9", false, false, false, false);
            this.dot5Table = new Dot5TableEnt(mib, this);
            this.dot5StatsTable = new Dot5StatsTableEnt(mib, this);
            this.dot5TimerTable = new Dot5TimerTableEnt(mib, this);
            this.dot5Tests = new Dot5TestsEnt(mib, this);
            this.dot5ChipSets = new Dot5ChipSetsEnt(mib, this);
            this.dot5Conformance = new Dot5ConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dot5Table,
                this.dot5StatsTable,
                this.dot5TimerTable,
                this.dot5Tests,
                this.dot5ChipSets,
                this.dot5Conformance
            };
        }
        public static final class Dot5TableEnt extends MIBEntry<TOKENRINGMIBDef>
        {
            public final Dot5EntryEnt dot5Entry;

            private Dot5TableEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
            {
                super(mib, parent, "dot5Table", "1.3.6.1.2.1.10.9.1", false, true, false, false);
                this.dot5Entry = new Dot5EntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot5Entry
                };
            }
            public static final class Dot5EntryEnt extends MIBEntry<TOKENRINGMIBDef>
            {
                public final Dot5IfIndexEnt dot5IfIndex;

                public final Dot5CommandsEnt dot5Commands;

                public final Dot5RingStatusEnt dot5RingStatus;

                public final Dot5RingStateEnt dot5RingState;

                public final Dot5RingOpenStatusEnt dot5RingOpenStatus;

                public final Dot5RingSpeedEnt dot5RingSpeed;

                public final Dot5UpStreamEnt dot5UpStream;

                public final Dot5ActMonParticipateEnt dot5ActMonParticipate;

                public final Dot5FunctionalEnt dot5Functional;

                public final Dot5LastBeaconSentEnt dot5LastBeaconSent;

                private Dot5EntryEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                {
                    super(mib, parent, "dot5Entry", "1.3.6.1.2.1.10.9.1.1", false, false, false, true);
                    this.dot5IfIndex = new Dot5IfIndexEnt(mib, this);
                    this.dot5Commands = new Dot5CommandsEnt(mib, this);
                    this.dot5RingStatus = new Dot5RingStatusEnt(mib, this);
                    this.dot5RingState = new Dot5RingStateEnt(mib, this);
                    this.dot5RingOpenStatus = new Dot5RingOpenStatusEnt(mib, this);
                    this.dot5RingSpeed = new Dot5RingSpeedEnt(mib, this);
                    this.dot5UpStream = new Dot5UpStreamEnt(mib, this);
                    this.dot5ActMonParticipate = new Dot5ActMonParticipateEnt(mib, this);
                    this.dot5Functional = new Dot5FunctionalEnt(mib, this);
                    this.dot5LastBeaconSent = new Dot5LastBeaconSentEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot5IfIndex,
                        this.dot5Commands,
                        this.dot5RingStatus,
                        this.dot5RingState,
                        this.dot5RingOpenStatus,
                        this.dot5RingSpeed,
                        this.dot5UpStream,
                        this.dot5ActMonParticipate,
                        this.dot5Functional,
                        this.dot5LastBeaconSent
                    };
                }
                public static final class Dot5IfIndexEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5IfIndexEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5IfIndex", "1.3.6.1.2.1.10.9.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5CommandsEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5CommandsEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5Commands", "1.3.6.1.2.1.10.9.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5RingStatusEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5RingStatusEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5RingStatus", "1.3.6.1.2.1.10.9.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5RingStateEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5RingStateEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5RingState", "1.3.6.1.2.1.10.9.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5RingOpenStatusEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5RingOpenStatusEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5RingOpenStatus", "1.3.6.1.2.1.10.9.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5RingSpeedEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5RingSpeedEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5RingSpeed", "1.3.6.1.2.1.10.9.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5UpStreamEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5UpStreamEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5UpStream", "1.3.6.1.2.1.10.9.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5ActMonParticipateEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5ActMonParticipateEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5ActMonParticipate", "1.3.6.1.2.1.10.9.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5FunctionalEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5FunctionalEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5Functional", "1.3.6.1.2.1.10.9.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5LastBeaconSentEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5LastBeaconSentEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5LastBeaconSent", "1.3.6.1.2.1.10.9.1.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dot5StatsTableEnt extends MIBEntry<TOKENRINGMIBDef>
        {
            public final Dot5StatsEntryEnt dot5StatsEntry;

            private Dot5StatsTableEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
            {
                super(mib, parent, "dot5StatsTable", "1.3.6.1.2.1.10.9.2", false, true, false, false);
                this.dot5StatsEntry = new Dot5StatsEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot5StatsEntry
                };
            }
            public static final class Dot5StatsEntryEnt extends MIBEntry<TOKENRINGMIBDef>
            {
                public final Dot5StatsIfIndexEnt dot5StatsIfIndex;

                public final Dot5StatsLineErrorsEnt dot5StatsLineErrors;

                public final Dot5StatsBurstErrorsEnt dot5StatsBurstErrors;

                public final Dot5StatsACErrorsEnt dot5StatsACErrors;

                public final Dot5StatsAbortTransErrorsEnt dot5StatsAbortTransErrors;

                public final Dot5StatsInternalErrorsEnt dot5StatsInternalErrors;

                public final Dot5StatsLostFrameErrorsEnt dot5StatsLostFrameErrors;

                public final Dot5StatsReceiveCongestionsEnt dot5StatsReceiveCongestions;

                public final Dot5StatsFrameCopiedErrorsEnt dot5StatsFrameCopiedErrors;

                public final Dot5StatsTokenErrorsEnt dot5StatsTokenErrors;

                public final Dot5StatsSoftErrorsEnt dot5StatsSoftErrors;

                public final Dot5StatsHardErrorsEnt dot5StatsHardErrors;

                public final Dot5StatsSignalLossEnt dot5StatsSignalLoss;

                public final Dot5StatsTransmitBeaconsEnt dot5StatsTransmitBeacons;

                public final Dot5StatsRecoverysEnt dot5StatsRecoverys;

                public final Dot5StatsLobeWiresEnt dot5StatsLobeWires;

                public final Dot5StatsRemovesEnt dot5StatsRemoves;

                public final Dot5StatsSinglesEnt dot5StatsSingles;

                public final Dot5StatsFreqErrorsEnt dot5StatsFreqErrors;

                private Dot5StatsEntryEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                {
                    super(mib, parent, "dot5StatsEntry", "1.3.6.1.2.1.10.9.2.1", false, false, false, true);
                    this.dot5StatsIfIndex = new Dot5StatsIfIndexEnt(mib, this);
                    this.dot5StatsLineErrors = new Dot5StatsLineErrorsEnt(mib, this);
                    this.dot5StatsBurstErrors = new Dot5StatsBurstErrorsEnt(mib, this);
                    this.dot5StatsACErrors = new Dot5StatsACErrorsEnt(mib, this);
                    this.dot5StatsAbortTransErrors = new Dot5StatsAbortTransErrorsEnt(mib, this);
                    this.dot5StatsInternalErrors = new Dot5StatsInternalErrorsEnt(mib, this);
                    this.dot5StatsLostFrameErrors = new Dot5StatsLostFrameErrorsEnt(mib, this);
                    this.dot5StatsReceiveCongestions = new Dot5StatsReceiveCongestionsEnt(mib, this);
                    this.dot5StatsFrameCopiedErrors = new Dot5StatsFrameCopiedErrorsEnt(mib, this);
                    this.dot5StatsTokenErrors = new Dot5StatsTokenErrorsEnt(mib, this);
                    this.dot5StatsSoftErrors = new Dot5StatsSoftErrorsEnt(mib, this);
                    this.dot5StatsHardErrors = new Dot5StatsHardErrorsEnt(mib, this);
                    this.dot5StatsSignalLoss = new Dot5StatsSignalLossEnt(mib, this);
                    this.dot5StatsTransmitBeacons = new Dot5StatsTransmitBeaconsEnt(mib, this);
                    this.dot5StatsRecoverys = new Dot5StatsRecoverysEnt(mib, this);
                    this.dot5StatsLobeWires = new Dot5StatsLobeWiresEnt(mib, this);
                    this.dot5StatsRemoves = new Dot5StatsRemovesEnt(mib, this);
                    this.dot5StatsSingles = new Dot5StatsSinglesEnt(mib, this);
                    this.dot5StatsFreqErrors = new Dot5StatsFreqErrorsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot5StatsIfIndex,
                        this.dot5StatsLineErrors,
                        this.dot5StatsBurstErrors,
                        this.dot5StatsACErrors,
                        this.dot5StatsAbortTransErrors,
                        this.dot5StatsInternalErrors,
                        this.dot5StatsLostFrameErrors,
                        this.dot5StatsReceiveCongestions,
                        this.dot5StatsFrameCopiedErrors,
                        this.dot5StatsTokenErrors,
                        this.dot5StatsSoftErrors,
                        this.dot5StatsHardErrors,
                        this.dot5StatsSignalLoss,
                        this.dot5StatsTransmitBeacons,
                        this.dot5StatsRecoverys,
                        this.dot5StatsLobeWires,
                        this.dot5StatsRemoves,
                        this.dot5StatsSingles,
                        this.dot5StatsFreqErrors
                    };
                }
                public static final class Dot5StatsIfIndexEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsIfIndexEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsIfIndex", "1.3.6.1.2.1.10.9.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsLineErrorsEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsLineErrorsEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsLineErrors", "1.3.6.1.2.1.10.9.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsBurstErrorsEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsBurstErrorsEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsBurstErrors", "1.3.6.1.2.1.10.9.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsACErrorsEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsACErrorsEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsACErrors", "1.3.6.1.2.1.10.9.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsAbortTransErrorsEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsAbortTransErrorsEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsAbortTransErrors", "1.3.6.1.2.1.10.9.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsInternalErrorsEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsInternalErrorsEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsInternalErrors", "1.3.6.1.2.1.10.9.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsLostFrameErrorsEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsLostFrameErrorsEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsLostFrameErrors", "1.3.6.1.2.1.10.9.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsReceiveCongestionsEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsReceiveCongestionsEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsReceiveCongestions", "1.3.6.1.2.1.10.9.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsFrameCopiedErrorsEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsFrameCopiedErrorsEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsFrameCopiedErrors", "1.3.6.1.2.1.10.9.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsTokenErrorsEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsTokenErrorsEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsTokenErrors", "1.3.6.1.2.1.10.9.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsSoftErrorsEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsSoftErrorsEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsSoftErrors", "1.3.6.1.2.1.10.9.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsHardErrorsEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsHardErrorsEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsHardErrors", "1.3.6.1.2.1.10.9.2.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsSignalLossEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsSignalLossEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsSignalLoss", "1.3.6.1.2.1.10.9.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsTransmitBeaconsEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsTransmitBeaconsEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsTransmitBeacons", "1.3.6.1.2.1.10.9.2.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsRecoverysEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsRecoverysEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsRecoverys", "1.3.6.1.2.1.10.9.2.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsLobeWiresEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsLobeWiresEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsLobeWires", "1.3.6.1.2.1.10.9.2.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsRemovesEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsRemovesEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsRemoves", "1.3.6.1.2.1.10.9.2.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsSinglesEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsSinglesEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsSingles", "1.3.6.1.2.1.10.9.2.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsFreqErrorsEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsFreqErrorsEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsFreqErrors", "1.3.6.1.2.1.10.9.2.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dot5TimerTableEnt extends MIBEntry<TOKENRINGMIBDef>
        {
            public final Dot5TimerEntryEnt dot5TimerEntry;

            private Dot5TimerTableEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
            {
                super(mib, parent, "dot5TimerTable", "1.3.6.1.2.1.10.9.5", false, true, false, false);
                this.dot5TimerEntry = new Dot5TimerEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot5TimerEntry
                };
            }
            public static final class Dot5TimerEntryEnt extends MIBEntry<TOKENRINGMIBDef>
            {
                public final Dot5TimerIfIndexEnt dot5TimerIfIndex;

                public final Dot5TimerReturnRepeatEnt dot5TimerReturnRepeat;

                public final Dot5TimerHoldingEnt dot5TimerHolding;

                public final Dot5TimerQueuePDUEnt dot5TimerQueuePDU;

                public final Dot5TimerValidTransmitEnt dot5TimerValidTransmit;

                public final Dot5TimerNoTokenEnt dot5TimerNoToken;

                public final Dot5TimerActiveMonEnt dot5TimerActiveMon;

                public final Dot5TimerStandbyMonEnt dot5TimerStandbyMon;

                public final Dot5TimerErrorReportEnt dot5TimerErrorReport;

                public final Dot5TimerBeaconTransmitEnt dot5TimerBeaconTransmit;

                public final Dot5TimerBeaconReceiveEnt dot5TimerBeaconReceive;

                private Dot5TimerEntryEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                {
                    super(mib, parent, "dot5TimerEntry", "1.3.6.1.2.1.10.9.5.1", false, false, false, true);
                    this.dot5TimerIfIndex = new Dot5TimerIfIndexEnt(mib, this);
                    this.dot5TimerReturnRepeat = new Dot5TimerReturnRepeatEnt(mib, this);
                    this.dot5TimerHolding = new Dot5TimerHoldingEnt(mib, this);
                    this.dot5TimerQueuePDU = new Dot5TimerQueuePDUEnt(mib, this);
                    this.dot5TimerValidTransmit = new Dot5TimerValidTransmitEnt(mib, this);
                    this.dot5TimerNoToken = new Dot5TimerNoTokenEnt(mib, this);
                    this.dot5TimerActiveMon = new Dot5TimerActiveMonEnt(mib, this);
                    this.dot5TimerStandbyMon = new Dot5TimerStandbyMonEnt(mib, this);
                    this.dot5TimerErrorReport = new Dot5TimerErrorReportEnt(mib, this);
                    this.dot5TimerBeaconTransmit = new Dot5TimerBeaconTransmitEnt(mib, this);
                    this.dot5TimerBeaconReceive = new Dot5TimerBeaconReceiveEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot5TimerIfIndex,
                        this.dot5TimerReturnRepeat,
                        this.dot5TimerHolding,
                        this.dot5TimerQueuePDU,
                        this.dot5TimerValidTransmit,
                        this.dot5TimerNoToken,
                        this.dot5TimerActiveMon,
                        this.dot5TimerStandbyMon,
                        this.dot5TimerErrorReport,
                        this.dot5TimerBeaconTransmit,
                        this.dot5TimerBeaconReceive
                    };
                }
                public static final class Dot5TimerIfIndexEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5TimerIfIndexEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerIfIndex", "1.3.6.1.2.1.10.9.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerReturnRepeatEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5TimerReturnRepeatEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerReturnRepeat", "1.3.6.1.2.1.10.9.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerHoldingEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5TimerHoldingEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerHolding", "1.3.6.1.2.1.10.9.5.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerQueuePDUEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5TimerQueuePDUEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerQueuePDU", "1.3.6.1.2.1.10.9.5.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerValidTransmitEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5TimerValidTransmitEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerValidTransmit", "1.3.6.1.2.1.10.9.5.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerNoTokenEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5TimerNoTokenEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerNoToken", "1.3.6.1.2.1.10.9.5.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerActiveMonEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5TimerActiveMonEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerActiveMon", "1.3.6.1.2.1.10.9.5.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerStandbyMonEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5TimerStandbyMonEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerStandbyMon", "1.3.6.1.2.1.10.9.5.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerErrorReportEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5TimerErrorReportEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerErrorReport", "1.3.6.1.2.1.10.9.5.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerBeaconTransmitEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5TimerBeaconTransmitEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerBeaconTransmit", "1.3.6.1.2.1.10.9.5.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerBeaconReceiveEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5TimerBeaconReceiveEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerBeaconReceive", "1.3.6.1.2.1.10.9.5.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dot5TestsEnt extends MIBEntry<TOKENRINGMIBDef>
        {
            /** RFC 1573 defines the ifTestTable, through which anetwork manager can instruct an agent to test an interfacefor various faults.  A test to be performed is identifiedas an OBJECT IDENTIFIER.
The Insert Function test*/
            public final Dot5TestInsertFuncEnt dot5TestInsertFunc;

            /** The Full-Duplex Loop Back test*/
            public final Dot5TestFullDuplexLoopBackEnt dot5TestFullDuplexLoopBack;

            private Dot5TestsEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
            {
                super(mib, parent, "dot5Tests", "1.3.6.1.2.1.10.9.3", false, false, false, false);
                this.dot5TestInsertFunc = new Dot5TestInsertFuncEnt(mib, this);
                this.dot5TestFullDuplexLoopBack = new Dot5TestFullDuplexLoopBackEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot5TestInsertFunc,
                    this.dot5TestFullDuplexLoopBack
                };
            }
            public static final class Dot5TestInsertFuncEnt extends MIBEntry<TOKENRINGMIBDef>
            {
                private Dot5TestInsertFuncEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                {
                    super(mib, parent, "dot5TestInsertFunc", "1.3.6.1.2.1.10.9.3.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot5TestFullDuplexLoopBackEnt extends MIBEntry<TOKENRINGMIBDef>
            {
                private Dot5TestFullDuplexLoopBackEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                {
                    super(mib, parent, "dot5TestFullDuplexLoopBack", "1.3.6.1.2.1.10.9.3.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot5ChipSetsEnt extends MIBEntry<TOKENRINGMIBDef>
        {
            public final Dot5ChipSetIBM16Ent dot5ChipSetIBM16;

            public final Dot5ChipSetTItms380Ent dot5ChipSetTItms380;

            public final Dot5ChipSetTItms380c16Ent dot5ChipSetTItms380c16;

            private Dot5ChipSetsEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
            {
                super(mib, parent, "dot5ChipSets", "1.3.6.1.2.1.10.9.4", false, false, false, false);
                this.dot5ChipSetIBM16 = new Dot5ChipSetIBM16Ent(mib, this);
                this.dot5ChipSetTItms380 = new Dot5ChipSetTItms380Ent(mib, this);
                this.dot5ChipSetTItms380c16 = new Dot5ChipSetTItms380c16Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot5ChipSetIBM16,
                    this.dot5ChipSetTItms380,
                    this.dot5ChipSetTItms380c16
                };
            }
            public static final class Dot5ChipSetIBM16Ent extends MIBEntry<TOKENRINGMIBDef>
            {
                private Dot5ChipSetIBM16Ent(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                {
                    super(mib, parent, "dot5ChipSetIBM16", "1.3.6.1.2.1.10.9.4.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot5ChipSetTItms380Ent extends MIBEntry<TOKENRINGMIBDef>
            {
                private Dot5ChipSetTItms380Ent(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                {
                    super(mib, parent, "dot5ChipSetTItms380", "1.3.6.1.2.1.10.9.4.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot5ChipSetTItms380c16Ent extends MIBEntry<TOKENRINGMIBDef>
            {
                private Dot5ChipSetTItms380c16Ent(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                {
                    super(mib, parent, "dot5ChipSetTItms380c16", "1.3.6.1.2.1.10.9.4.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot5ConformanceEnt extends MIBEntry<TOKENRINGMIBDef>
        {
            public final Dot5GroupsEnt dot5Groups;

            public final Dot5CompliancesEnt dot5Compliances;

            private Dot5ConformanceEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
            {
                super(mib, parent, "dot5Conformance", "1.3.6.1.2.1.10.9.6", false, false, false, false);
                this.dot5Groups = new Dot5GroupsEnt(mib, this);
                this.dot5Compliances = new Dot5CompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot5Groups,
                    this.dot5Compliances
                };
            }
            public static final class Dot5GroupsEnt extends MIBEntry<TOKENRINGMIBDef>
            {
                /** units of conformance*/
                public final Dot5StateGroupEnt dot5StateGroup;

                public final Dot5StatsGroupEnt dot5StatsGroup;

                private Dot5GroupsEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                {
                    super(mib, parent, "dot5Groups", "1.3.6.1.2.1.10.9.6.1", false, false, false, false);
                    this.dot5StateGroup = new Dot5StateGroupEnt(mib, this);
                    this.dot5StatsGroup = new Dot5StatsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot5StateGroup,
                        this.dot5StatsGroup
                    };
                }
                public static final class Dot5StateGroupEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StateGroupEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StateGroup", "1.3.6.1.2.1.10.9.6.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsGroupEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5StatsGroupEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsGroup", "1.3.6.1.2.1.10.9.6.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Dot5CompliancesEnt extends MIBEntry<TOKENRINGMIBDef>
            {
                /** compliance statements*/
                public final Dot5ComplianceEnt dot5Compliance;

                private Dot5CompliancesEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                {
                    super(mib, parent, "dot5Compliances", "1.3.6.1.2.1.10.9.6.2", false, false, false, false);
                    this.dot5Compliance = new Dot5ComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot5Compliance
                    };
                }
                public static final class Dot5ComplianceEnt extends MIBEntry<TOKENRINGMIBDef>
                {
                    private Dot5ComplianceEnt(TOKENRINGMIBDef mib, MIBEntry<TOKENRINGMIBDef> parent)
                    {
                        super(mib, parent, "dot5Compliance", "1.3.6.1.2.1.10.9.6.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
