package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**IEEE 802.5 Token Ring MIB
FIX: added additional import (Counter)*/
public final class RFC1231MIBDef extends MIB
{
    public static final RFC1231MIBDef RFC1231MIB = new RFC1231MIBDef();

    static { MIBs.getInstance().registerMIB(RFC1231MIBDef.RFC1231MIB); }

    /** This MIB Module uses the extended OBJECT-TYPE macro asdefined in [9].*/
    public final Dot5Ent dot5;

    private RFC1231MIBDef()
    {
        super("RFC1231-MIB");
        this.dot5 = new Dot5Ent(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dot5
        };
    }

    public static final class Dot5Ent extends MIBEntry<RFC1231MIBDef>
    {
        /** a 6 octetaddress in the"canonical" orderdefined by IEEE 802.1a, i.e., as if it were transmittedleast significant bit first, even though 802.5 (incontrast to other 802.x protocols) requires MAC addressesto be transmitted most significant bit first.16-bit addresses, if needed, are represented by settingtheir upper 4 octets to all 0's, i.e., AAFF would berepresented as 00000000AAFF.


The Interface Table
This table contains state and parameter information whichis specific to 802.5 interfaces.  It is mandatory thatsystems having 802.5 interfaces implement this table inaddition to the generic interfaces table [4,6] and itsgeneric extensions [11].*/
        public final Dot5TableEnt dot5Table;

        /** The Statistics Table
This table contains statistics and error counter which arespecific to 802.5 interfaces.  It is mandatory that systemshaving 802.5 interfaces implement this table.*/
        public final Dot5StatsTableEnt dot5StatsTable;

        /** The Timer Table
This group contains the values of the timers defined in[10] for 802.5 interfaces.  It is optional that systemshaving 802.5 interfaces implement this group.*/
        public final Dot5TimerTableEnt dot5TimerTable;

        /** 802.5 Interface Tests*/
        public final Dot5TestsEnt dot5Tests;

        /** Invoking this test causes the station to test the insertring logic of the hardware if the station's lobe mediacable is connected to a wiring concentrator.  Note thatthis command inserts the station into the network, andthus, could cause problems if the station is connectedto a operational network.
802.5 Hardware Chip Sets*/
        public final Dot5ChipSetsEnt dot5ChipSets;

        private Dot5Ent(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
        {
            super(mib, parent, "dot5", "1.3.6.1.3.4", false, false, false, false);
            this.dot5Table = new Dot5TableEnt(mib, this);
            this.dot5StatsTable = new Dot5StatsTableEnt(mib, this);
            this.dot5TimerTable = new Dot5TimerTableEnt(mib, this);
            this.dot5Tests = new Dot5TestsEnt(mib, this);
            this.dot5ChipSets = new Dot5ChipSetsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dot5Table,
                this.dot5StatsTable,
                this.dot5TimerTable,
                this.dot5Tests,
                this.dot5ChipSets
            };
        }
        public static final class Dot5TableEnt extends MIBEntry<RFC1231MIBDef>
        {
            public final Dot5EntryEnt dot5Entry;

            private Dot5TableEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
            {
                super(mib, parent, "dot5Table", "1.3.6.1.3.4.1", false, true, false, false);
                this.dot5Entry = new Dot5EntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot5Entry
                };
            }
            public static final class Dot5EntryEnt extends MIBEntry<RFC1231MIBDef>
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

                private Dot5EntryEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                {
                    super(mib, parent, "dot5Entry", "1.3.6.1.3.4.1.1", false, false, false, true);
                    this.dot5IfIndex = new Dot5IfIndexEnt(mib, this);
                    this.dot5Commands = new Dot5CommandsEnt(mib, this);
                    this.dot5RingStatus = new Dot5RingStatusEnt(mib, this);
                    this.dot5RingState = new Dot5RingStateEnt(mib, this);
                    this.dot5RingOpenStatus = new Dot5RingOpenStatusEnt(mib, this);
                    this.dot5RingSpeed = new Dot5RingSpeedEnt(mib, this);
                    this.dot5UpStream = new Dot5UpStreamEnt(mib, this);
                    this.dot5ActMonParticipate = new Dot5ActMonParticipateEnt(mib, this);
                    this.dot5Functional = new Dot5FunctionalEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot5IfIndex,
                        this.dot5Commands,
                        this.dot5RingStatus,
                        this.dot5RingState,
                        this.dot5RingOpenStatus,
                        this.dot5RingSpeed,
                        this.dot5UpStream,
                        this.dot5ActMonParticipate,
                        this.dot5Functional
                    };
                }
                public static final class Dot5IfIndexEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5IfIndexEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5IfIndex", "1.3.6.1.3.4.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5CommandsEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5CommandsEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5Commands", "1.3.6.1.3.4.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5RingStatusEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5RingStatusEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5RingStatus", "1.3.6.1.3.4.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5RingStateEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5RingStateEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5RingState", "1.3.6.1.3.4.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5RingOpenStatusEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5RingOpenStatusEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5RingOpenStatus", "1.3.6.1.3.4.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5RingSpeedEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5RingSpeedEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5RingSpeed", "1.3.6.1.3.4.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5UpStreamEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5UpStreamEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5UpStream", "1.3.6.1.3.4.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5ActMonParticipateEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5ActMonParticipateEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5ActMonParticipate", "1.3.6.1.3.4.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5FunctionalEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5FunctionalEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5Functional", "1.3.6.1.3.4.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dot5StatsTableEnt extends MIBEntry<RFC1231MIBDef>
        {
            public final Dot5StatsEntryEnt dot5StatsEntry;

            private Dot5StatsTableEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
            {
                super(mib, parent, "dot5StatsTable", "1.3.6.1.3.4.2", false, true, false, false);
                this.dot5StatsEntry = new Dot5StatsEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot5StatsEntry
                };
            }
            public static final class Dot5StatsEntryEnt extends MIBEntry<RFC1231MIBDef>
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

                private Dot5StatsEntryEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                {
                    super(mib, parent, "dot5StatsEntry", "1.3.6.1.3.4.2.1", false, false, false, true);
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
                public static final class Dot5StatsIfIndexEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsIfIndexEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsIfIndex", "1.3.6.1.3.4.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsLineErrorsEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsLineErrorsEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsLineErrors", "1.3.6.1.3.4.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsBurstErrorsEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsBurstErrorsEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsBurstErrors", "1.3.6.1.3.4.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsACErrorsEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsACErrorsEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsACErrors", "1.3.6.1.3.4.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsAbortTransErrorsEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsAbortTransErrorsEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsAbortTransErrors", "1.3.6.1.3.4.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsInternalErrorsEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsInternalErrorsEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsInternalErrors", "1.3.6.1.3.4.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsLostFrameErrorsEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsLostFrameErrorsEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsLostFrameErrors", "1.3.6.1.3.4.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsReceiveCongestionsEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsReceiveCongestionsEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsReceiveCongestions", "1.3.6.1.3.4.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsFrameCopiedErrorsEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsFrameCopiedErrorsEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsFrameCopiedErrors", "1.3.6.1.3.4.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsTokenErrorsEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsTokenErrorsEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsTokenErrors", "1.3.6.1.3.4.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsSoftErrorsEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsSoftErrorsEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsSoftErrors", "1.3.6.1.3.4.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsHardErrorsEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsHardErrorsEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsHardErrors", "1.3.6.1.3.4.2.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsSignalLossEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsSignalLossEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsSignalLoss", "1.3.6.1.3.4.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsTransmitBeaconsEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsTransmitBeaconsEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsTransmitBeacons", "1.3.6.1.3.4.2.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsRecoverysEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsRecoverysEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsRecoverys", "1.3.6.1.3.4.2.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsLobeWiresEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsLobeWiresEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsLobeWires", "1.3.6.1.3.4.2.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsRemovesEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsRemovesEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsRemoves", "1.3.6.1.3.4.2.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsSinglesEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsSinglesEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsSingles", "1.3.6.1.3.4.2.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5StatsFreqErrorsEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5StatsFreqErrorsEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5StatsFreqErrors", "1.3.6.1.3.4.2.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dot5TimerTableEnt extends MIBEntry<RFC1231MIBDef>
        {
            public final Dot5TimerEntryEnt dot5TimerEntry;

            private Dot5TimerTableEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
            {
                super(mib, parent, "dot5TimerTable", "1.3.6.1.3.4.5", false, true, false, false);
                this.dot5TimerEntry = new Dot5TimerEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot5TimerEntry
                };
            }
            public static final class Dot5TimerEntryEnt extends MIBEntry<RFC1231MIBDef>
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

                private Dot5TimerEntryEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                {
                    super(mib, parent, "dot5TimerEntry", "1.3.6.1.3.4.5.1", false, false, false, true);
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
                public static final class Dot5TimerIfIndexEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5TimerIfIndexEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerIfIndex", "1.3.6.1.3.4.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerReturnRepeatEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5TimerReturnRepeatEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerReturnRepeat", "1.3.6.1.3.4.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerHoldingEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5TimerHoldingEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerHolding", "1.3.6.1.3.4.5.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerQueuePDUEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5TimerQueuePDUEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerQueuePDU", "1.3.6.1.3.4.5.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerValidTransmitEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5TimerValidTransmitEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerValidTransmit", "1.3.6.1.3.4.5.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerNoTokenEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5TimerNoTokenEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerNoToken", "1.3.6.1.3.4.5.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerActiveMonEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5TimerActiveMonEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerActiveMon", "1.3.6.1.3.4.5.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerStandbyMonEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5TimerStandbyMonEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerStandbyMon", "1.3.6.1.3.4.5.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerErrorReportEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5TimerErrorReportEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerErrorReport", "1.3.6.1.3.4.5.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerBeaconTransmitEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5TimerBeaconTransmitEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerBeaconTransmit", "1.3.6.1.3.4.5.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot5TimerBeaconReceiveEnt extends MIBEntry<RFC1231MIBDef>
                {
                    private Dot5TimerBeaconReceiveEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                    {
                        super(mib, parent, "dot5TimerBeaconReceive", "1.3.6.1.3.4.5.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dot5TestsEnt extends MIBEntry<RFC1231MIBDef>
        {
            /** The extensions to the interfaces table proposed in [11]define a table object, ifExtnsTestTable, through which anetwork manager can instruct an agent to test an interfacefor various faults.  A test to be performed is identified(as the value of ifExtnsTestType) via an OBJECT IDENTIFIER.The Full-Duplex Loop Back Test is a common test, definedin [11] as:testFullDuplexLoopBackInvoking this test on a 802.5 interface causes theinterface to check the path from memory through thechip set's internal logic and back to memory, thuschecking the proper functioning of the systems'sinterface to the chip set.
The Insert Function test is defined by:*/
            public final TestInsertFuncEnt testInsertFunc;

            private Dot5TestsEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
            {
                super(mib, parent, "dot5Tests", "1.3.6.1.3.4.3", false, false, false, false);
                this.testInsertFunc = new TestInsertFuncEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.testInsertFunc
                };
            }
            public static final class TestInsertFuncEnt extends MIBEntry<RFC1231MIBDef>
            {
                private TestInsertFuncEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                {
                    super(mib, parent, "testInsertFunc", "1.3.6.1.3.4.3.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot5ChipSetsEnt extends MIBEntry<RFC1231MIBDef>
        {
            /** The extensions to the interfaces table proposed in [11]define an object, ifExtnsChipSet, with the syntax ofOBJECT IDENTIFIER, to identify the hardware chip set inuse by an interface.  That definition specifies justone applicable object identifier:unknownChipSetfor use as the value of ifExtnsChipSet when the specificchip set is unknown.This MIB defines the following for use as values ofifExtnsChipSet:
IBM 16/4 Mb/s*/
            public final ChipSetIBM16Ent chipSetIBM16;

            /** TI 4Mb/s*/
            public final ChipSetTItms380Ent chipSetTItms380;

            /** TI 16/4 Mb/s*/
            public final ChipSetTItms380c16Ent chipSetTItms380c16;

            private Dot5ChipSetsEnt(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
            {
                super(mib, parent, "dot5ChipSets", "1.3.6.1.3.4.4", false, false, false, false);
                this.chipSetIBM16 = new ChipSetIBM16Ent(mib, this);
                this.chipSetTItms380 = new ChipSetTItms380Ent(mib, this);
                this.chipSetTItms380c16 = new ChipSetTItms380c16Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.chipSetIBM16,
                    this.chipSetTItms380,
                    this.chipSetTItms380c16
                };
            }
            public static final class ChipSetIBM16Ent extends MIBEntry<RFC1231MIBDef>
            {
                private ChipSetIBM16Ent(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                {
                    super(mib, parent, "chipSetIBM16", "1.3.6.1.3.4.4.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ChipSetTItms380Ent extends MIBEntry<RFC1231MIBDef>
            {
                private ChipSetTItms380Ent(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                {
                    super(mib, parent, "chipSetTItms380", "1.3.6.1.3.4.4.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ChipSetTItms380c16Ent extends MIBEntry<RFC1231MIBDef>
            {
                private ChipSetTItms380c16Ent(RFC1231MIBDef mib, MIBEntry<RFC1231MIBDef> parent)
                {
                    super(mib, parent, "chipSetTItms380c16", "1.3.6.1.3.4.4.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
