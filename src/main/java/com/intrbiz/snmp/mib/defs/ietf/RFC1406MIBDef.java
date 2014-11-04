package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class RFC1406MIBDef extends MIB
{
    public static final RFC1406MIBDef RFC1406MIB = new RFC1406MIBDef();

    static { MIBs.getInstance().registerMIB(RFC1406MIBDef.RFC1406MIB); }

    /** [RFC3593]*/
    public final Ds1Ent ds1;

    private RFC1406MIBDef()
    {
        super("RFC1406-MIB");
        this.ds1 = new Ds1Ent(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ds1
        };
    }

    public static final class Ds1Ent extends MIBEntry<RFC1406MIBDef>
    {
        /** note that this subsumes cept(19) and g703at2mb(67)there is no separate CEPT or G703AT2MB MIBThe DS1 Near End Group
The DS1 Near End Group consists of five tables:DS1 ConfigurationDS1 CurrentDS1 IntervalDS1 TotalDS1 Channel Table
The DS1 Configuration Table*/
        public final Dsx1ConfigTableEnt dsx1ConfigTable;

        /** The DS1 Current Table*/
        public final Dsx1CurrentTableEnt dsx1CurrentTable;

        /** The DS1 Interval Table*/
        public final Dsx1IntervalTableEnt dsx1IntervalTable;

        /** The DS1 Total Table*/
        public final Dsx1TotalTableEnt dsx1TotalTable;

        /** The DS1 Far End Current Table*/
        public final Dsx1FarEndCurrentTableEnt dsx1FarEndCurrentTable;

        /** The DS1 Far End Interval Table*/
        public final Dsx1FarEndIntervalTableEnt dsx1FarEndIntervalTable;

        /** The DS1 Far End Total Table*/
        public final Dsx1FarEndTotalTableEnt dsx1FarEndTotalTable;

        /** The DS1 Fractional Table*/
        public final Dsx1FracTableEnt dsx1FracTable;

        private Ds1Ent(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
        {
            super(mib, parent, "ds1", "1.3.6.1.2.1.10.18", false, false, false, false);
            this.dsx1ConfigTable = new Dsx1ConfigTableEnt(mib, this);
            this.dsx1CurrentTable = new Dsx1CurrentTableEnt(mib, this);
            this.dsx1IntervalTable = new Dsx1IntervalTableEnt(mib, this);
            this.dsx1TotalTable = new Dsx1TotalTableEnt(mib, this);
            this.dsx1FarEndCurrentTable = new Dsx1FarEndCurrentTableEnt(mib, this);
            this.dsx1FarEndIntervalTable = new Dsx1FarEndIntervalTableEnt(mib, this);
            this.dsx1FarEndTotalTable = new Dsx1FarEndTotalTableEnt(mib, this);
            this.dsx1FracTable = new Dsx1FracTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dsx1ConfigTable,
                this.dsx1CurrentTable,
                this.dsx1IntervalTable,
                this.dsx1TotalTable,
                this.dsx1FarEndCurrentTable,
                this.dsx1FarEndIntervalTable,
                this.dsx1FarEndTotalTable,
                this.dsx1FracTable
            };
        }
        public static final class Dsx1ConfigTableEnt extends MIBEntry<RFC1406MIBDef>
        {
            public final Dsx1ConfigEntryEnt dsx1ConfigEntry;

            private Dsx1ConfigTableEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
            {
                super(mib, parent, "dsx1ConfigTable", "1.3.6.1.2.1.10.18.6", false, true, false, false);
                this.dsx1ConfigEntry = new Dsx1ConfigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx1ConfigEntry
                };
            }
            public static final class Dsx1ConfigEntryEnt extends MIBEntry<RFC1406MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx1LineIndexEnt dsx1LineIndex;

                public final Dsx1IfIndexEnt dsx1IfIndex;

                public final Dsx1TimeElapsedEnt dsx1TimeElapsed;

                public final Dsx1ValidIntervalsEnt dsx1ValidIntervals;

                public final Dsx1LineTypeEnt dsx1LineType;

                public final Dsx1LineCodingEnt dsx1LineCoding;

                public final Dsx1SendCodeEnt dsx1SendCode;

                public final Dsx1CircuitIdentifierEnt dsx1CircuitIdentifier;

                public final Dsx1LoopbackConfigEnt dsx1LoopbackConfig;

                public final Dsx1LineStatusEnt dsx1LineStatus;

                public final Dsx1SignalModeEnt dsx1SignalMode;

                public final Dsx1TransmitClockSourceEnt dsx1TransmitClockSource;

                public final Dsx1FdlEnt dsx1Fdl;

                private Dsx1ConfigEntryEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                {
                    super(mib, parent, "dsx1ConfigEntry", "1.3.6.1.2.1.10.18.6.1", false, false, false, true);
                    this.dsx1LineIndex = new Dsx1LineIndexEnt(mib, this);
                    this.dsx1IfIndex = new Dsx1IfIndexEnt(mib, this);
                    this.dsx1TimeElapsed = new Dsx1TimeElapsedEnt(mib, this);
                    this.dsx1ValidIntervals = new Dsx1ValidIntervalsEnt(mib, this);
                    this.dsx1LineType = new Dsx1LineTypeEnt(mib, this);
                    this.dsx1LineCoding = new Dsx1LineCodingEnt(mib, this);
                    this.dsx1SendCode = new Dsx1SendCodeEnt(mib, this);
                    this.dsx1CircuitIdentifier = new Dsx1CircuitIdentifierEnt(mib, this);
                    this.dsx1LoopbackConfig = new Dsx1LoopbackConfigEnt(mib, this);
                    this.dsx1LineStatus = new Dsx1LineStatusEnt(mib, this);
                    this.dsx1SignalMode = new Dsx1SignalModeEnt(mib, this);
                    this.dsx1TransmitClockSource = new Dsx1TransmitClockSourceEnt(mib, this);
                    this.dsx1Fdl = new Dsx1FdlEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx1LineIndex,
                        this.dsx1IfIndex,
                        this.dsx1TimeElapsed,
                        this.dsx1ValidIntervals,
                        this.dsx1LineType,
                        this.dsx1LineCoding,
                        this.dsx1SendCode,
                        this.dsx1CircuitIdentifier,
                        this.dsx1LoopbackConfig,
                        this.dsx1LineStatus,
                        this.dsx1SignalMode,
                        this.dsx1TransmitClockSource,
                        this.dsx1Fdl
                    };
                }
                public static final class Dsx1LineIndexEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1LineIndexEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1LineIndex", "1.3.6.1.2.1.10.18.6.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IfIndexEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1IfIndexEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IfIndex", "1.3.6.1.2.1.10.18.6.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TimeElapsedEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1TimeElapsedEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TimeElapsed", "1.3.6.1.2.1.10.18.6.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1ValidIntervalsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1ValidIntervalsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1ValidIntervals", "1.3.6.1.2.1.10.18.6.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1LineTypeEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1LineTypeEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1LineType", "1.3.6.1.2.1.10.18.6.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1LineCodingEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1LineCodingEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1LineCoding", "1.3.6.1.2.1.10.18.6.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1SendCodeEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1SendCodeEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1SendCode", "1.3.6.1.2.1.10.18.6.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CircuitIdentifierEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1CircuitIdentifierEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CircuitIdentifier", "1.3.6.1.2.1.10.18.6.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1LoopbackConfigEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1LoopbackConfigEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1LoopbackConfig", "1.3.6.1.2.1.10.18.6.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1LineStatusEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1LineStatusEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1LineStatus", "1.3.6.1.2.1.10.18.6.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1SignalModeEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1SignalModeEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1SignalMode", "1.3.6.1.2.1.10.18.6.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TransmitClockSourceEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1TransmitClockSourceEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TransmitClockSource", "1.3.6.1.2.1.10.18.6.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FdlEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FdlEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1Fdl", "1.3.6.1.2.1.10.18.6.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx1CurrentTableEnt extends MIBEntry<RFC1406MIBDef>
        {
            public final Dsx1CurrentEntryEnt dsx1CurrentEntry;

            private Dsx1CurrentTableEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
            {
                super(mib, parent, "dsx1CurrentTable", "1.3.6.1.2.1.10.18.7", false, true, false, false);
                this.dsx1CurrentEntry = new Dsx1CurrentEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx1CurrentEntry
                };
            }
            public static final class Dsx1CurrentEntryEnt extends MIBEntry<RFC1406MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx1CurrentIndexEnt dsx1CurrentIndex;

                public final Dsx1CurrentESsEnt dsx1CurrentESs;

                public final Dsx1CurrentSESsEnt dsx1CurrentSESs;

                public final Dsx1CurrentSEFSsEnt dsx1CurrentSEFSs;

                public final Dsx1CurrentUASsEnt dsx1CurrentUASs;

                public final Dsx1CurrentCSSsEnt dsx1CurrentCSSs;

                public final Dsx1CurrentPCVsEnt dsx1CurrentPCVs;

                public final Dsx1CurrentLESsEnt dsx1CurrentLESs;

                public final Dsx1CurrentBESsEnt dsx1CurrentBESs;

                public final Dsx1CurrentDMsEnt dsx1CurrentDMs;

                public final Dsx1CurrentLCVsEnt dsx1CurrentLCVs;

                private Dsx1CurrentEntryEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                {
                    super(mib, parent, "dsx1CurrentEntry", "1.3.6.1.2.1.10.18.7.1", false, false, false, true);
                    this.dsx1CurrentIndex = new Dsx1CurrentIndexEnt(mib, this);
                    this.dsx1CurrentESs = new Dsx1CurrentESsEnt(mib, this);
                    this.dsx1CurrentSESs = new Dsx1CurrentSESsEnt(mib, this);
                    this.dsx1CurrentSEFSs = new Dsx1CurrentSEFSsEnt(mib, this);
                    this.dsx1CurrentUASs = new Dsx1CurrentUASsEnt(mib, this);
                    this.dsx1CurrentCSSs = new Dsx1CurrentCSSsEnt(mib, this);
                    this.dsx1CurrentPCVs = new Dsx1CurrentPCVsEnt(mib, this);
                    this.dsx1CurrentLESs = new Dsx1CurrentLESsEnt(mib, this);
                    this.dsx1CurrentBESs = new Dsx1CurrentBESsEnt(mib, this);
                    this.dsx1CurrentDMs = new Dsx1CurrentDMsEnt(mib, this);
                    this.dsx1CurrentLCVs = new Dsx1CurrentLCVsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx1CurrentIndex,
                        this.dsx1CurrentESs,
                        this.dsx1CurrentSESs,
                        this.dsx1CurrentSEFSs,
                        this.dsx1CurrentUASs,
                        this.dsx1CurrentCSSs,
                        this.dsx1CurrentPCVs,
                        this.dsx1CurrentLESs,
                        this.dsx1CurrentBESs,
                        this.dsx1CurrentDMs,
                        this.dsx1CurrentLCVs
                    };
                }
                public static final class Dsx1CurrentIndexEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1CurrentIndexEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentIndex", "1.3.6.1.2.1.10.18.7.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1CurrentESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentESs", "1.3.6.1.2.1.10.18.7.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentSESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1CurrentSESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentSESs", "1.3.6.1.2.1.10.18.7.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentSEFSsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1CurrentSEFSsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentSEFSs", "1.3.6.1.2.1.10.18.7.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentUASsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1CurrentUASsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentUASs", "1.3.6.1.2.1.10.18.7.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentCSSsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1CurrentCSSsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentCSSs", "1.3.6.1.2.1.10.18.7.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentPCVsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1CurrentPCVsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentPCVs", "1.3.6.1.2.1.10.18.7.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentLESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1CurrentLESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentLESs", "1.3.6.1.2.1.10.18.7.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentBESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1CurrentBESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentBESs", "1.3.6.1.2.1.10.18.7.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentDMsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1CurrentDMsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentDMs", "1.3.6.1.2.1.10.18.7.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentLCVsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1CurrentLCVsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentLCVs", "1.3.6.1.2.1.10.18.7.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx1IntervalTableEnt extends MIBEntry<RFC1406MIBDef>
        {
            public final Dsx1IntervalEntryEnt dsx1IntervalEntry;

            private Dsx1IntervalTableEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
            {
                super(mib, parent, "dsx1IntervalTable", "1.3.6.1.2.1.10.18.8", false, true, false, false);
                this.dsx1IntervalEntry = new Dsx1IntervalEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx1IntervalEntry
                };
            }
            public static final class Dsx1IntervalEntryEnt extends MIBEntry<RFC1406MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx1IntervalIndexEnt dsx1IntervalIndex;

                /** read-only since originally an
SMIv1 index*/
                public final Dsx1IntervalNumberEnt dsx1IntervalNumber;

                public final Dsx1IntervalESsEnt dsx1IntervalESs;

                public final Dsx1IntervalSESsEnt dsx1IntervalSESs;

                public final Dsx1IntervalSEFSsEnt dsx1IntervalSEFSs;

                public final Dsx1IntervalUASsEnt dsx1IntervalUASs;

                public final Dsx1IntervalCSSsEnt dsx1IntervalCSSs;

                public final Dsx1IntervalPCVsEnt dsx1IntervalPCVs;

                public final Dsx1IntervalLESsEnt dsx1IntervalLESs;

                public final Dsx1IntervalBESsEnt dsx1IntervalBESs;

                public final Dsx1IntervalDMsEnt dsx1IntervalDMs;

                public final Dsx1IntervalLCVsEnt dsx1IntervalLCVs;

                private Dsx1IntervalEntryEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                {
                    super(mib, parent, "dsx1IntervalEntry", "1.3.6.1.2.1.10.18.8.1", false, false, false, true);
                    this.dsx1IntervalIndex = new Dsx1IntervalIndexEnt(mib, this);
                    this.dsx1IntervalNumber = new Dsx1IntervalNumberEnt(mib, this);
                    this.dsx1IntervalESs = new Dsx1IntervalESsEnt(mib, this);
                    this.dsx1IntervalSESs = new Dsx1IntervalSESsEnt(mib, this);
                    this.dsx1IntervalSEFSs = new Dsx1IntervalSEFSsEnt(mib, this);
                    this.dsx1IntervalUASs = new Dsx1IntervalUASsEnt(mib, this);
                    this.dsx1IntervalCSSs = new Dsx1IntervalCSSsEnt(mib, this);
                    this.dsx1IntervalPCVs = new Dsx1IntervalPCVsEnt(mib, this);
                    this.dsx1IntervalLESs = new Dsx1IntervalLESsEnt(mib, this);
                    this.dsx1IntervalBESs = new Dsx1IntervalBESsEnt(mib, this);
                    this.dsx1IntervalDMs = new Dsx1IntervalDMsEnt(mib, this);
                    this.dsx1IntervalLCVs = new Dsx1IntervalLCVsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx1IntervalIndex,
                        this.dsx1IntervalNumber,
                        this.dsx1IntervalESs,
                        this.dsx1IntervalSESs,
                        this.dsx1IntervalSEFSs,
                        this.dsx1IntervalUASs,
                        this.dsx1IntervalCSSs,
                        this.dsx1IntervalPCVs,
                        this.dsx1IntervalLESs,
                        this.dsx1IntervalBESs,
                        this.dsx1IntervalDMs,
                        this.dsx1IntervalLCVs
                    };
                }
                public static final class Dsx1IntervalIndexEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1IntervalIndexEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalIndex", "1.3.6.1.2.1.10.18.8.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalNumberEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1IntervalNumberEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalNumber", "1.3.6.1.2.1.10.18.8.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1IntervalESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalESs", "1.3.6.1.2.1.10.18.8.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalSESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1IntervalSESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalSESs", "1.3.6.1.2.1.10.18.8.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalSEFSsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1IntervalSEFSsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalSEFSs", "1.3.6.1.2.1.10.18.8.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalUASsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1IntervalUASsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalUASs", "1.3.6.1.2.1.10.18.8.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalCSSsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1IntervalCSSsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalCSSs", "1.3.6.1.2.1.10.18.8.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalPCVsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1IntervalPCVsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalPCVs", "1.3.6.1.2.1.10.18.8.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalLESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1IntervalLESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalLESs", "1.3.6.1.2.1.10.18.8.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalBESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1IntervalBESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalBESs", "1.3.6.1.2.1.10.18.8.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalDMsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1IntervalDMsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalDMs", "1.3.6.1.2.1.10.18.8.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalLCVsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1IntervalLCVsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalLCVs", "1.3.6.1.2.1.10.18.8.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx1TotalTableEnt extends MIBEntry<RFC1406MIBDef>
        {
            public final Dsx1TotalEntryEnt dsx1TotalEntry;

            private Dsx1TotalTableEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
            {
                super(mib, parent, "dsx1TotalTable", "1.3.6.1.2.1.10.18.9", false, true, false, false);
                this.dsx1TotalEntry = new Dsx1TotalEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx1TotalEntry
                };
            }
            public static final class Dsx1TotalEntryEnt extends MIBEntry<RFC1406MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx1TotalIndexEnt dsx1TotalIndex;

                public final Dsx1TotalESsEnt dsx1TotalESs;

                public final Dsx1TotalSESsEnt dsx1TotalSESs;

                public final Dsx1TotalSEFSsEnt dsx1TotalSEFSs;

                public final Dsx1TotalUASsEnt dsx1TotalUASs;

                public final Dsx1TotalCSSsEnt dsx1TotalCSSs;

                public final Dsx1TotalPCVsEnt dsx1TotalPCVs;

                public final Dsx1TotalLESsEnt dsx1TotalLESs;

                public final Dsx1TotalBESsEnt dsx1TotalBESs;

                public final Dsx1TotalDMsEnt dsx1TotalDMs;

                public final Dsx1TotalLCVsEnt dsx1TotalLCVs;

                private Dsx1TotalEntryEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                {
                    super(mib, parent, "dsx1TotalEntry", "1.3.6.1.2.1.10.18.9.1", false, false, false, true);
                    this.dsx1TotalIndex = new Dsx1TotalIndexEnt(mib, this);
                    this.dsx1TotalESs = new Dsx1TotalESsEnt(mib, this);
                    this.dsx1TotalSESs = new Dsx1TotalSESsEnt(mib, this);
                    this.dsx1TotalSEFSs = new Dsx1TotalSEFSsEnt(mib, this);
                    this.dsx1TotalUASs = new Dsx1TotalUASsEnt(mib, this);
                    this.dsx1TotalCSSs = new Dsx1TotalCSSsEnt(mib, this);
                    this.dsx1TotalPCVs = new Dsx1TotalPCVsEnt(mib, this);
                    this.dsx1TotalLESs = new Dsx1TotalLESsEnt(mib, this);
                    this.dsx1TotalBESs = new Dsx1TotalBESsEnt(mib, this);
                    this.dsx1TotalDMs = new Dsx1TotalDMsEnt(mib, this);
                    this.dsx1TotalLCVs = new Dsx1TotalLCVsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx1TotalIndex,
                        this.dsx1TotalESs,
                        this.dsx1TotalSESs,
                        this.dsx1TotalSEFSs,
                        this.dsx1TotalUASs,
                        this.dsx1TotalCSSs,
                        this.dsx1TotalPCVs,
                        this.dsx1TotalLESs,
                        this.dsx1TotalBESs,
                        this.dsx1TotalDMs,
                        this.dsx1TotalLCVs
                    };
                }
                public static final class Dsx1TotalIndexEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1TotalIndexEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalIndex", "1.3.6.1.2.1.10.18.9.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1TotalESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalESs", "1.3.6.1.2.1.10.18.9.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalSESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1TotalSESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalSESs", "1.3.6.1.2.1.10.18.9.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalSEFSsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1TotalSEFSsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalSEFSs", "1.3.6.1.2.1.10.18.9.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalUASsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1TotalUASsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalUASs", "1.3.6.1.2.1.10.18.9.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalCSSsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1TotalCSSsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalCSSs", "1.3.6.1.2.1.10.18.9.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalPCVsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1TotalPCVsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalPCVs", "1.3.6.1.2.1.10.18.9.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalLESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1TotalLESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalLESs", "1.3.6.1.2.1.10.18.9.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalBESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1TotalBESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalBESs", "1.3.6.1.2.1.10.18.9.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalDMsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1TotalDMsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalDMs", "1.3.6.1.2.1.10.18.9.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalLCVsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1TotalLCVsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalLCVs", "1.3.6.1.2.1.10.18.9.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx1FarEndCurrentTableEnt extends MIBEntry<RFC1406MIBDef>
        {
            public final Dsx1FarEndCurrentEntryEnt dsx1FarEndCurrentEntry;

            private Dsx1FarEndCurrentTableEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
            {
                super(mib, parent, "dsx1FarEndCurrentTable", "1.3.6.1.2.1.10.18.10", false, true, false, false);
                this.dsx1FarEndCurrentEntry = new Dsx1FarEndCurrentEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx1FarEndCurrentEntry
                };
            }
            public static final class Dsx1FarEndCurrentEntryEnt extends MIBEntry<RFC1406MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx1FarEndCurrentIndexEnt dsx1FarEndCurrentIndex;

                public final Dsx1FarEndTimeElapsedEnt dsx1FarEndTimeElapsed;

                public final Dsx1FarEndValidIntervalsEnt dsx1FarEndValidIntervals;

                public final Dsx1FarEndCurrentESsEnt dsx1FarEndCurrentESs;

                public final Dsx1FarEndCurrentSESsEnt dsx1FarEndCurrentSESs;

                public final Dsx1FarEndCurrentSEFSsEnt dsx1FarEndCurrentSEFSs;

                public final Dsx1FarEndCurrentUASsEnt dsx1FarEndCurrentUASs;

                public final Dsx1FarEndCurrentCSSsEnt dsx1FarEndCurrentCSSs;

                public final Dsx1FarEndCurrentLESsEnt dsx1FarEndCurrentLESs;

                public final Dsx1FarEndCurrentPCVsEnt dsx1FarEndCurrentPCVs;

                public final Dsx1FarEndCurrentBESsEnt dsx1FarEndCurrentBESs;

                public final Dsx1FarEndCurrentDMsEnt dsx1FarEndCurrentDMs;

                private Dsx1FarEndCurrentEntryEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                {
                    super(mib, parent, "dsx1FarEndCurrentEntry", "1.3.6.1.2.1.10.18.10.1", false, false, false, true);
                    this.dsx1FarEndCurrentIndex = new Dsx1FarEndCurrentIndexEnt(mib, this);
                    this.dsx1FarEndTimeElapsed = new Dsx1FarEndTimeElapsedEnt(mib, this);
                    this.dsx1FarEndValidIntervals = new Dsx1FarEndValidIntervalsEnt(mib, this);
                    this.dsx1FarEndCurrentESs = new Dsx1FarEndCurrentESsEnt(mib, this);
                    this.dsx1FarEndCurrentSESs = new Dsx1FarEndCurrentSESsEnt(mib, this);
                    this.dsx1FarEndCurrentSEFSs = new Dsx1FarEndCurrentSEFSsEnt(mib, this);
                    this.dsx1FarEndCurrentUASs = new Dsx1FarEndCurrentUASsEnt(mib, this);
                    this.dsx1FarEndCurrentCSSs = new Dsx1FarEndCurrentCSSsEnt(mib, this);
                    this.dsx1FarEndCurrentLESs = new Dsx1FarEndCurrentLESsEnt(mib, this);
                    this.dsx1FarEndCurrentPCVs = new Dsx1FarEndCurrentPCVsEnt(mib, this);
                    this.dsx1FarEndCurrentBESs = new Dsx1FarEndCurrentBESsEnt(mib, this);
                    this.dsx1FarEndCurrentDMs = new Dsx1FarEndCurrentDMsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx1FarEndCurrentIndex,
                        this.dsx1FarEndTimeElapsed,
                        this.dsx1FarEndValidIntervals,
                        this.dsx1FarEndCurrentESs,
                        this.dsx1FarEndCurrentSESs,
                        this.dsx1FarEndCurrentSEFSs,
                        this.dsx1FarEndCurrentUASs,
                        this.dsx1FarEndCurrentCSSs,
                        this.dsx1FarEndCurrentLESs,
                        this.dsx1FarEndCurrentPCVs,
                        this.dsx1FarEndCurrentBESs,
                        this.dsx1FarEndCurrentDMs
                    };
                }
                public static final class Dsx1FarEndCurrentIndexEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndCurrentIndexEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentIndex", "1.3.6.1.2.1.10.18.10.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTimeElapsedEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndTimeElapsedEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTimeElapsed", "1.3.6.1.2.1.10.18.10.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndValidIntervalsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndValidIntervalsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndValidIntervals", "1.3.6.1.2.1.10.18.10.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndCurrentESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentESs", "1.3.6.1.2.1.10.18.10.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentSESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndCurrentSESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentSESs", "1.3.6.1.2.1.10.18.10.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentSEFSsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndCurrentSEFSsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentSEFSs", "1.3.6.1.2.1.10.18.10.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentUASsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndCurrentUASsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentUASs", "1.3.6.1.2.1.10.18.10.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentCSSsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndCurrentCSSsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentCSSs", "1.3.6.1.2.1.10.18.10.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentLESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndCurrentLESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentLESs", "1.3.6.1.2.1.10.18.10.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentPCVsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndCurrentPCVsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentPCVs", "1.3.6.1.2.1.10.18.10.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentBESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndCurrentBESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentBESs", "1.3.6.1.2.1.10.18.10.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentDMsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndCurrentDMsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentDMs", "1.3.6.1.2.1.10.18.10.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx1FarEndIntervalTableEnt extends MIBEntry<RFC1406MIBDef>
        {
            public final Dsx1FarEndIntervalEntryEnt dsx1FarEndIntervalEntry;

            private Dsx1FarEndIntervalTableEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
            {
                super(mib, parent, "dsx1FarEndIntervalTable", "1.3.6.1.2.1.10.18.11", false, true, false, false);
                this.dsx1FarEndIntervalEntry = new Dsx1FarEndIntervalEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx1FarEndIntervalEntry
                };
            }
            public static final class Dsx1FarEndIntervalEntryEnt extends MIBEntry<RFC1406MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx1FarEndIntervalIndexEnt dsx1FarEndIntervalIndex;

                /** read-only since originally an
SMIv1 index*/
                public final Dsx1FarEndIntervalNumberEnt dsx1FarEndIntervalNumber;

                public final Dsx1FarEndIntervalESsEnt dsx1FarEndIntervalESs;

                public final Dsx1FarEndIntervalSESsEnt dsx1FarEndIntervalSESs;

                public final Dsx1FarEndIntervalSEFSsEnt dsx1FarEndIntervalSEFSs;

                public final Dsx1FarEndIntervalUASsEnt dsx1FarEndIntervalUASs;

                public final Dsx1FarEndIntervalCSSsEnt dsx1FarEndIntervalCSSs;

                public final Dsx1FarEndIntervalLESsEnt dsx1FarEndIntervalLESs;

                public final Dsx1FarEndIntervalPCVsEnt dsx1FarEndIntervalPCVs;

                public final Dsx1FarEndIntervalBESsEnt dsx1FarEndIntervalBESs;

                public final Dsx1FarEndIntervalDMsEnt dsx1FarEndIntervalDMs;

                private Dsx1FarEndIntervalEntryEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                {
                    super(mib, parent, "dsx1FarEndIntervalEntry", "1.3.6.1.2.1.10.18.11.1", false, false, false, true);
                    this.dsx1FarEndIntervalIndex = new Dsx1FarEndIntervalIndexEnt(mib, this);
                    this.dsx1FarEndIntervalNumber = new Dsx1FarEndIntervalNumberEnt(mib, this);
                    this.dsx1FarEndIntervalESs = new Dsx1FarEndIntervalESsEnt(mib, this);
                    this.dsx1FarEndIntervalSESs = new Dsx1FarEndIntervalSESsEnt(mib, this);
                    this.dsx1FarEndIntervalSEFSs = new Dsx1FarEndIntervalSEFSsEnt(mib, this);
                    this.dsx1FarEndIntervalUASs = new Dsx1FarEndIntervalUASsEnt(mib, this);
                    this.dsx1FarEndIntervalCSSs = new Dsx1FarEndIntervalCSSsEnt(mib, this);
                    this.dsx1FarEndIntervalLESs = new Dsx1FarEndIntervalLESsEnt(mib, this);
                    this.dsx1FarEndIntervalPCVs = new Dsx1FarEndIntervalPCVsEnt(mib, this);
                    this.dsx1FarEndIntervalBESs = new Dsx1FarEndIntervalBESsEnt(mib, this);
                    this.dsx1FarEndIntervalDMs = new Dsx1FarEndIntervalDMsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx1FarEndIntervalIndex,
                        this.dsx1FarEndIntervalNumber,
                        this.dsx1FarEndIntervalESs,
                        this.dsx1FarEndIntervalSESs,
                        this.dsx1FarEndIntervalSEFSs,
                        this.dsx1FarEndIntervalUASs,
                        this.dsx1FarEndIntervalCSSs,
                        this.dsx1FarEndIntervalLESs,
                        this.dsx1FarEndIntervalPCVs,
                        this.dsx1FarEndIntervalBESs,
                        this.dsx1FarEndIntervalDMs
                    };
                }
                public static final class Dsx1FarEndIntervalIndexEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndIntervalIndexEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalIndex", "1.3.6.1.2.1.10.18.11.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalNumberEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndIntervalNumberEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalNumber", "1.3.6.1.2.1.10.18.11.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndIntervalESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalESs", "1.3.6.1.2.1.10.18.11.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalSESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndIntervalSESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalSESs", "1.3.6.1.2.1.10.18.11.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalSEFSsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndIntervalSEFSsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalSEFSs", "1.3.6.1.2.1.10.18.11.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalUASsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndIntervalUASsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalUASs", "1.3.6.1.2.1.10.18.11.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalCSSsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndIntervalCSSsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalCSSs", "1.3.6.1.2.1.10.18.11.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalLESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndIntervalLESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalLESs", "1.3.6.1.2.1.10.18.11.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalPCVsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndIntervalPCVsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalPCVs", "1.3.6.1.2.1.10.18.11.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalBESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndIntervalBESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalBESs", "1.3.6.1.2.1.10.18.11.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalDMsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndIntervalDMsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalDMs", "1.3.6.1.2.1.10.18.11.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx1FarEndTotalTableEnt extends MIBEntry<RFC1406MIBDef>
        {
            public final Dsx1FarEndTotalEntryEnt dsx1FarEndTotalEntry;

            private Dsx1FarEndTotalTableEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
            {
                super(mib, parent, "dsx1FarEndTotalTable", "1.3.6.1.2.1.10.18.12", false, true, false, false);
                this.dsx1FarEndTotalEntry = new Dsx1FarEndTotalEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx1FarEndTotalEntry
                };
            }
            public static final class Dsx1FarEndTotalEntryEnt extends MIBEntry<RFC1406MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx1FarEndTotalIndexEnt dsx1FarEndTotalIndex;

                public final Dsx1FarEndTotalESsEnt dsx1FarEndTotalESs;

                public final Dsx1FarEndTotalSESsEnt dsx1FarEndTotalSESs;

                public final Dsx1FarEndTotalSEFSsEnt dsx1FarEndTotalSEFSs;

                public final Dsx1FarEndTotalUASsEnt dsx1FarEndTotalUASs;

                public final Dsx1FarEndTotalCSSsEnt dsx1FarEndTotalCSSs;

                public final Dsx1FarEndTotalLESsEnt dsx1FarEndTotalLESs;

                public final Dsx1FarEndTotalPCVsEnt dsx1FarEndTotalPCVs;

                public final Dsx1FarEndTotalBESsEnt dsx1FarEndTotalBESs;

                public final Dsx1FarEndTotalDMsEnt dsx1FarEndTotalDMs;

                private Dsx1FarEndTotalEntryEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                {
                    super(mib, parent, "dsx1FarEndTotalEntry", "1.3.6.1.2.1.10.18.12.1", false, false, false, true);
                    this.dsx1FarEndTotalIndex = new Dsx1FarEndTotalIndexEnt(mib, this);
                    this.dsx1FarEndTotalESs = new Dsx1FarEndTotalESsEnt(mib, this);
                    this.dsx1FarEndTotalSESs = new Dsx1FarEndTotalSESsEnt(mib, this);
                    this.dsx1FarEndTotalSEFSs = new Dsx1FarEndTotalSEFSsEnt(mib, this);
                    this.dsx1FarEndTotalUASs = new Dsx1FarEndTotalUASsEnt(mib, this);
                    this.dsx1FarEndTotalCSSs = new Dsx1FarEndTotalCSSsEnt(mib, this);
                    this.dsx1FarEndTotalLESs = new Dsx1FarEndTotalLESsEnt(mib, this);
                    this.dsx1FarEndTotalPCVs = new Dsx1FarEndTotalPCVsEnt(mib, this);
                    this.dsx1FarEndTotalBESs = new Dsx1FarEndTotalBESsEnt(mib, this);
                    this.dsx1FarEndTotalDMs = new Dsx1FarEndTotalDMsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx1FarEndTotalIndex,
                        this.dsx1FarEndTotalESs,
                        this.dsx1FarEndTotalSESs,
                        this.dsx1FarEndTotalSEFSs,
                        this.dsx1FarEndTotalUASs,
                        this.dsx1FarEndTotalCSSs,
                        this.dsx1FarEndTotalLESs,
                        this.dsx1FarEndTotalPCVs,
                        this.dsx1FarEndTotalBESs,
                        this.dsx1FarEndTotalDMs
                    };
                }
                public static final class Dsx1FarEndTotalIndexEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndTotalIndexEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalIndex", "1.3.6.1.2.1.10.18.12.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndTotalESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalESs", "1.3.6.1.2.1.10.18.12.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalSESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndTotalSESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalSESs", "1.3.6.1.2.1.10.18.12.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalSEFSsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndTotalSEFSsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalSEFSs", "1.3.6.1.2.1.10.18.12.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalUASsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndTotalUASsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalUASs", "1.3.6.1.2.1.10.18.12.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalCSSsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndTotalCSSsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalCSSs", "1.3.6.1.2.1.10.18.12.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalLESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndTotalLESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalLESs", "1.3.6.1.2.1.10.18.12.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalPCVsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndTotalPCVsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalPCVs", "1.3.6.1.2.1.10.18.12.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalBESsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndTotalBESsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalBESs", "1.3.6.1.2.1.10.18.12.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalDMsEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FarEndTotalDMsEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalDMs", "1.3.6.1.2.1.10.18.12.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx1FracTableEnt extends MIBEntry<RFC1406MIBDef>
        {
            public final Dsx1FracEntryEnt dsx1FracEntry;

            private Dsx1FracTableEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
            {
                super(mib, parent, "dsx1FracTable", "1.3.6.1.2.1.10.18.13", false, true, false, false);
                this.dsx1FracEntry = new Dsx1FracEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx1FracEntry
                };
            }
            public static final class Dsx1FracEntryEnt extends MIBEntry<RFC1406MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx1FracIndexEnt dsx1FracIndex;

                /** read-only since originally an
SMIv1 index*/
                public final Dsx1FracNumberEnt dsx1FracNumber;

                public final Dsx1FracIfIndexEnt dsx1FracIfIndex;

                private Dsx1FracEntryEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                {
                    super(mib, parent, "dsx1FracEntry", "1.3.6.1.2.1.10.18.13.1", false, false, false, true);
                    this.dsx1FracIndex = new Dsx1FracIndexEnt(mib, this);
                    this.dsx1FracNumber = new Dsx1FracNumberEnt(mib, this);
                    this.dsx1FracIfIndex = new Dsx1FracIfIndexEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx1FracIndex,
                        this.dsx1FracNumber,
                        this.dsx1FracIfIndex
                    };
                }
                public static final class Dsx1FracIndexEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FracIndexEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FracIndex", "1.3.6.1.2.1.10.18.13.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FracNumberEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FracNumberEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FracNumber", "1.3.6.1.2.1.10.18.13.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FracIfIndexEnt extends MIBEntry<RFC1406MIBDef>
                {
                    private Dsx1FracIfIndexEnt(RFC1406MIBDef mib, MIBEntry<RFC1406MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FracIfIndex", "1.3.6.1.2.1.10.18.13.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
