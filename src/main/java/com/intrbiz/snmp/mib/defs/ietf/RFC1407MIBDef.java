package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class RFC1407MIBDef extends MIB
{
    public static final RFC1407MIBDef RFC1407MIB = new RFC1407MIBDef();

    static { MIBs.getInstance().registerMIB(RFC1407MIBDef.RFC1407MIB); }

    /** [RFC3593]

September 08, 2004*/
    public final Ds3Ent ds3;

    private RFC1407MIBDef()
    {
        super("RFC1407-MIB");
        this.ds3 = new Ds3Ent(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ds3
        };
    }

    public static final class Ds3Ent extends MIBEntry<RFC1407MIBDef>
    {
        /** The DS3/E3 Near End Group
The DS3/E3 Near End Group consists of four tables:DS3/E3 ConfigurationDS3/E3 CurrentDS3/E3 IntervalDS3/E3 Total
the DS3/E3 Configuration Table*/
        public final Dsx3ConfigTableEnt dsx3ConfigTable;

        /** the DS3/E3 Current Table*/
        public final Dsx3CurrentTableEnt dsx3CurrentTable;

        /** the DS3/E3 Interval Table*/
        public final Dsx3IntervalTableEnt dsx3IntervalTable;

        /** the DS3/E3 Total*/
        public final Dsx3TotalTableEnt dsx3TotalTable;

        /** The DS3 Far End Group
The DS3 Far End Group consists of four tables :DS3 Far End ConfigurationDS3 Far End CurrentDS3 Far End IntervalDS3 Far End Total
The DS3 Far End Configuration Table*/
        public final Dsx3FarEndConfigTableEnt dsx3FarEndConfigTable;

        /** The DS3 Far End Current*/
        public final Dsx3FarEndCurrentTableEnt dsx3FarEndCurrentTable;

        /** The DS3 Far End Interval Table*/
        public final Dsx3FarEndIntervalTableEnt dsx3FarEndIntervalTable;

        /** The DS3 Far End Total*/
        public final Dsx3FarEndTotalTableEnt dsx3FarEndTotalTable;

        /** the DS3/E3 Fractional Table
This table is deprecated.*/
        public final Dsx3FracTableEnt dsx3FracTable;

        private Ds3Ent(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
        {
            super(mib, parent, "ds3", "1.3.6.1.2.1.10.30", false, false, false, false);
            this.dsx3ConfigTable = new Dsx3ConfigTableEnt(mib, this);
            this.dsx3CurrentTable = new Dsx3CurrentTableEnt(mib, this);
            this.dsx3IntervalTable = new Dsx3IntervalTableEnt(mib, this);
            this.dsx3TotalTable = new Dsx3TotalTableEnt(mib, this);
            this.dsx3FarEndConfigTable = new Dsx3FarEndConfigTableEnt(mib, this);
            this.dsx3FarEndCurrentTable = new Dsx3FarEndCurrentTableEnt(mib, this);
            this.dsx3FarEndIntervalTable = new Dsx3FarEndIntervalTableEnt(mib, this);
            this.dsx3FarEndTotalTable = new Dsx3FarEndTotalTableEnt(mib, this);
            this.dsx3FracTable = new Dsx3FracTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dsx3ConfigTable,
                this.dsx3CurrentTable,
                this.dsx3IntervalTable,
                this.dsx3TotalTable,
                this.dsx3FarEndConfigTable,
                this.dsx3FarEndCurrentTable,
                this.dsx3FarEndIntervalTable,
                this.dsx3FarEndTotalTable,
                this.dsx3FracTable
            };
        }
        public static final class Dsx3ConfigTableEnt extends MIBEntry<RFC1407MIBDef>
        {
            public final Dsx3ConfigEntryEnt dsx3ConfigEntry;

            private Dsx3ConfigTableEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
            {
                super(mib, parent, "dsx3ConfigTable", "1.3.6.1.2.1.10.30.5", false, true, false, false);
                this.dsx3ConfigEntry = new Dsx3ConfigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3ConfigEntry
                };
            }
            public static final class Dsx3ConfigEntryEnt extends MIBEntry<RFC1407MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx3LineIndexEnt dsx3LineIndex;

                public final Dsx3IfIndexEnt dsx3IfIndex;

                public final Dsx3TimeElapsedEnt dsx3TimeElapsed;

                public final Dsx3ValidIntervalsEnt dsx3ValidIntervals;

                public final Dsx3LineTypeEnt dsx3LineType;

                public final Dsx3LineCodingEnt dsx3LineCoding;

                public final Dsx3SendCodeEnt dsx3SendCode;

                public final Dsx3CircuitIdentifierEnt dsx3CircuitIdentifier;

                public final Dsx3LoopbackConfigEnt dsx3LoopbackConfig;

                public final Dsx3LineStatusEnt dsx3LineStatus;

                public final Dsx3TransmitClockSourceEnt dsx3TransmitClockSource;

                private Dsx3ConfigEntryEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                {
                    super(mib, parent, "dsx3ConfigEntry", "1.3.6.1.2.1.10.30.5.1", false, false, false, true);
                    this.dsx3LineIndex = new Dsx3LineIndexEnt(mib, this);
                    this.dsx3IfIndex = new Dsx3IfIndexEnt(mib, this);
                    this.dsx3TimeElapsed = new Dsx3TimeElapsedEnt(mib, this);
                    this.dsx3ValidIntervals = new Dsx3ValidIntervalsEnt(mib, this);
                    this.dsx3LineType = new Dsx3LineTypeEnt(mib, this);
                    this.dsx3LineCoding = new Dsx3LineCodingEnt(mib, this);
                    this.dsx3SendCode = new Dsx3SendCodeEnt(mib, this);
                    this.dsx3CircuitIdentifier = new Dsx3CircuitIdentifierEnt(mib, this);
                    this.dsx3LoopbackConfig = new Dsx3LoopbackConfigEnt(mib, this);
                    this.dsx3LineStatus = new Dsx3LineStatusEnt(mib, this);
                    this.dsx3TransmitClockSource = new Dsx3TransmitClockSourceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx3LineIndex,
                        this.dsx3IfIndex,
                        this.dsx3TimeElapsed,
                        this.dsx3ValidIntervals,
                        this.dsx3LineType,
                        this.dsx3LineCoding,
                        this.dsx3SendCode,
                        this.dsx3CircuitIdentifier,
                        this.dsx3LoopbackConfig,
                        this.dsx3LineStatus,
                        this.dsx3TransmitClockSource
                    };
                }
                public static final class Dsx3LineIndexEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3LineIndexEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3LineIndex", "1.3.6.1.2.1.10.30.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IfIndexEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3IfIndexEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IfIndex", "1.3.6.1.2.1.10.30.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TimeElapsedEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3TimeElapsedEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TimeElapsed", "1.3.6.1.2.1.10.30.5.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3ValidIntervalsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3ValidIntervalsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3ValidIntervals", "1.3.6.1.2.1.10.30.5.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3LineTypeEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3LineTypeEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3LineType", "1.3.6.1.2.1.10.30.5.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3LineCodingEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3LineCodingEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3LineCoding", "1.3.6.1.2.1.10.30.5.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3SendCodeEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3SendCodeEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3SendCode", "1.3.6.1.2.1.10.30.5.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CircuitIdentifierEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3CircuitIdentifierEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CircuitIdentifier", "1.3.6.1.2.1.10.30.5.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3LoopbackConfigEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3LoopbackConfigEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3LoopbackConfig", "1.3.6.1.2.1.10.30.5.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3LineStatusEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3LineStatusEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3LineStatus", "1.3.6.1.2.1.10.30.5.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TransmitClockSourceEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3TransmitClockSourceEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TransmitClockSource", "1.3.6.1.2.1.10.30.5.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx3CurrentTableEnt extends MIBEntry<RFC1407MIBDef>
        {
            public final Dsx3CurrentEntryEnt dsx3CurrentEntry;

            private Dsx3CurrentTableEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
            {
                super(mib, parent, "dsx3CurrentTable", "1.3.6.1.2.1.10.30.6", false, true, false, false);
                this.dsx3CurrentEntry = new Dsx3CurrentEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3CurrentEntry
                };
            }
            public static final class Dsx3CurrentEntryEnt extends MIBEntry<RFC1407MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx3CurrentIndexEnt dsx3CurrentIndex;

                public final Dsx3CurrentPESsEnt dsx3CurrentPESs;

                public final Dsx3CurrentPSESsEnt dsx3CurrentPSESs;

                public final Dsx3CurrentSEFSsEnt dsx3CurrentSEFSs;

                public final Dsx3CurrentUASsEnt dsx3CurrentUASs;

                public final Dsx3CurrentLCVsEnt dsx3CurrentLCVs;

                public final Dsx3CurrentPCVsEnt dsx3CurrentPCVs;

                public final Dsx3CurrentLESsEnt dsx3CurrentLESs;

                public final Dsx3CurrentCCVsEnt dsx3CurrentCCVs;

                public final Dsx3CurrentCESsEnt dsx3CurrentCESs;

                public final Dsx3CurrentCSESsEnt dsx3CurrentCSESs;

                private Dsx3CurrentEntryEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                {
                    super(mib, parent, "dsx3CurrentEntry", "1.3.6.1.2.1.10.30.6.1", false, false, false, true);
                    this.dsx3CurrentIndex = new Dsx3CurrentIndexEnt(mib, this);
                    this.dsx3CurrentPESs = new Dsx3CurrentPESsEnt(mib, this);
                    this.dsx3CurrentPSESs = new Dsx3CurrentPSESsEnt(mib, this);
                    this.dsx3CurrentSEFSs = new Dsx3CurrentSEFSsEnt(mib, this);
                    this.dsx3CurrentUASs = new Dsx3CurrentUASsEnt(mib, this);
                    this.dsx3CurrentLCVs = new Dsx3CurrentLCVsEnt(mib, this);
                    this.dsx3CurrentPCVs = new Dsx3CurrentPCVsEnt(mib, this);
                    this.dsx3CurrentLESs = new Dsx3CurrentLESsEnt(mib, this);
                    this.dsx3CurrentCCVs = new Dsx3CurrentCCVsEnt(mib, this);
                    this.dsx3CurrentCESs = new Dsx3CurrentCESsEnt(mib, this);
                    this.dsx3CurrentCSESs = new Dsx3CurrentCSESsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx3CurrentIndex,
                        this.dsx3CurrentPESs,
                        this.dsx3CurrentPSESs,
                        this.dsx3CurrentSEFSs,
                        this.dsx3CurrentUASs,
                        this.dsx3CurrentLCVs,
                        this.dsx3CurrentPCVs,
                        this.dsx3CurrentLESs,
                        this.dsx3CurrentCCVs,
                        this.dsx3CurrentCESs,
                        this.dsx3CurrentCSESs
                    };
                }
                public static final class Dsx3CurrentIndexEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3CurrentIndexEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentIndex", "1.3.6.1.2.1.10.30.6.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentPESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3CurrentPESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentPESs", "1.3.6.1.2.1.10.30.6.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentPSESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3CurrentPSESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentPSESs", "1.3.6.1.2.1.10.30.6.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentSEFSsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3CurrentSEFSsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentSEFSs", "1.3.6.1.2.1.10.30.6.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentUASsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3CurrentUASsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentUASs", "1.3.6.1.2.1.10.30.6.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentLCVsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3CurrentLCVsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentLCVs", "1.3.6.1.2.1.10.30.6.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentPCVsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3CurrentPCVsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentPCVs", "1.3.6.1.2.1.10.30.6.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentLESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3CurrentLESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentLESs", "1.3.6.1.2.1.10.30.6.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentCCVsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3CurrentCCVsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentCCVs", "1.3.6.1.2.1.10.30.6.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentCESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3CurrentCESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentCESs", "1.3.6.1.2.1.10.30.6.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentCSESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3CurrentCSESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentCSESs", "1.3.6.1.2.1.10.30.6.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx3IntervalTableEnt extends MIBEntry<RFC1407MIBDef>
        {
            public final Dsx3IntervalEntryEnt dsx3IntervalEntry;

            private Dsx3IntervalTableEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
            {
                super(mib, parent, "dsx3IntervalTable", "1.3.6.1.2.1.10.30.7", false, true, false, false);
                this.dsx3IntervalEntry = new Dsx3IntervalEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3IntervalEntry
                };
            }
            public static final class Dsx3IntervalEntryEnt extends MIBEntry<RFC1407MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx3IntervalIndexEnt dsx3IntervalIndex;

                /** read-only since originally an
SMIv1 index*/
                public final Dsx3IntervalNumberEnt dsx3IntervalNumber;

                public final Dsx3IntervalPESsEnt dsx3IntervalPESs;

                public final Dsx3IntervalPSESsEnt dsx3IntervalPSESs;

                public final Dsx3IntervalSEFSsEnt dsx3IntervalSEFSs;

                public final Dsx3IntervalUASsEnt dsx3IntervalUASs;

                public final Dsx3IntervalLCVsEnt dsx3IntervalLCVs;

                public final Dsx3IntervalPCVsEnt dsx3IntervalPCVs;

                public final Dsx3IntervalLESsEnt dsx3IntervalLESs;

                public final Dsx3IntervalCCVsEnt dsx3IntervalCCVs;

                public final Dsx3IntervalCESsEnt dsx3IntervalCESs;

                public final Dsx3IntervalCSESsEnt dsx3IntervalCSESs;

                private Dsx3IntervalEntryEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                {
                    super(mib, parent, "dsx3IntervalEntry", "1.3.6.1.2.1.10.30.7.1", false, false, false, true);
                    this.dsx3IntervalIndex = new Dsx3IntervalIndexEnt(mib, this);
                    this.dsx3IntervalNumber = new Dsx3IntervalNumberEnt(mib, this);
                    this.dsx3IntervalPESs = new Dsx3IntervalPESsEnt(mib, this);
                    this.dsx3IntervalPSESs = new Dsx3IntervalPSESsEnt(mib, this);
                    this.dsx3IntervalSEFSs = new Dsx3IntervalSEFSsEnt(mib, this);
                    this.dsx3IntervalUASs = new Dsx3IntervalUASsEnt(mib, this);
                    this.dsx3IntervalLCVs = new Dsx3IntervalLCVsEnt(mib, this);
                    this.dsx3IntervalPCVs = new Dsx3IntervalPCVsEnt(mib, this);
                    this.dsx3IntervalLESs = new Dsx3IntervalLESsEnt(mib, this);
                    this.dsx3IntervalCCVs = new Dsx3IntervalCCVsEnt(mib, this);
                    this.dsx3IntervalCESs = new Dsx3IntervalCESsEnt(mib, this);
                    this.dsx3IntervalCSESs = new Dsx3IntervalCSESsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx3IntervalIndex,
                        this.dsx3IntervalNumber,
                        this.dsx3IntervalPESs,
                        this.dsx3IntervalPSESs,
                        this.dsx3IntervalSEFSs,
                        this.dsx3IntervalUASs,
                        this.dsx3IntervalLCVs,
                        this.dsx3IntervalPCVs,
                        this.dsx3IntervalLESs,
                        this.dsx3IntervalCCVs,
                        this.dsx3IntervalCESs,
                        this.dsx3IntervalCSESs
                    };
                }
                public static final class Dsx3IntervalIndexEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3IntervalIndexEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalIndex", "1.3.6.1.2.1.10.30.7.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalNumberEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3IntervalNumberEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalNumber", "1.3.6.1.2.1.10.30.7.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalPESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3IntervalPESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalPESs", "1.3.6.1.2.1.10.30.7.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalPSESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3IntervalPSESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalPSESs", "1.3.6.1.2.1.10.30.7.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalSEFSsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3IntervalSEFSsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalSEFSs", "1.3.6.1.2.1.10.30.7.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalUASsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3IntervalUASsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalUASs", "1.3.6.1.2.1.10.30.7.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalLCVsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3IntervalLCVsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalLCVs", "1.3.6.1.2.1.10.30.7.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalPCVsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3IntervalPCVsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalPCVs", "1.3.6.1.2.1.10.30.7.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalLESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3IntervalLESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalLESs", "1.3.6.1.2.1.10.30.7.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalCCVsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3IntervalCCVsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalCCVs", "1.3.6.1.2.1.10.30.7.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalCESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3IntervalCESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalCESs", "1.3.6.1.2.1.10.30.7.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalCSESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3IntervalCSESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalCSESs", "1.3.6.1.2.1.10.30.7.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx3TotalTableEnt extends MIBEntry<RFC1407MIBDef>
        {
            public final Dsx3TotalEntryEnt dsx3TotalEntry;

            private Dsx3TotalTableEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
            {
                super(mib, parent, "dsx3TotalTable", "1.3.6.1.2.1.10.30.8", false, true, false, false);
                this.dsx3TotalEntry = new Dsx3TotalEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3TotalEntry
                };
            }
            public static final class Dsx3TotalEntryEnt extends MIBEntry<RFC1407MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx3TotalIndexEnt dsx3TotalIndex;

                public final Dsx3TotalPESsEnt dsx3TotalPESs;

                public final Dsx3TotalPSESsEnt dsx3TotalPSESs;

                public final Dsx3TotalSEFSsEnt dsx3TotalSEFSs;

                public final Dsx3TotalUASsEnt dsx3TotalUASs;

                public final Dsx3TotalLCVsEnt dsx3TotalLCVs;

                public final Dsx3TotalPCVsEnt dsx3TotalPCVs;

                public final Dsx3TotalLESsEnt dsx3TotalLESs;

                public final Dsx3TotalCCVsEnt dsx3TotalCCVs;

                public final Dsx3TotalCESsEnt dsx3TotalCESs;

                public final Dsx3TotalCSESsEnt dsx3TotalCSESs;

                private Dsx3TotalEntryEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                {
                    super(mib, parent, "dsx3TotalEntry", "1.3.6.1.2.1.10.30.8.1", false, false, false, true);
                    this.dsx3TotalIndex = new Dsx3TotalIndexEnt(mib, this);
                    this.dsx3TotalPESs = new Dsx3TotalPESsEnt(mib, this);
                    this.dsx3TotalPSESs = new Dsx3TotalPSESsEnt(mib, this);
                    this.dsx3TotalSEFSs = new Dsx3TotalSEFSsEnt(mib, this);
                    this.dsx3TotalUASs = new Dsx3TotalUASsEnt(mib, this);
                    this.dsx3TotalLCVs = new Dsx3TotalLCVsEnt(mib, this);
                    this.dsx3TotalPCVs = new Dsx3TotalPCVsEnt(mib, this);
                    this.dsx3TotalLESs = new Dsx3TotalLESsEnt(mib, this);
                    this.dsx3TotalCCVs = new Dsx3TotalCCVsEnt(mib, this);
                    this.dsx3TotalCESs = new Dsx3TotalCESsEnt(mib, this);
                    this.dsx3TotalCSESs = new Dsx3TotalCSESsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx3TotalIndex,
                        this.dsx3TotalPESs,
                        this.dsx3TotalPSESs,
                        this.dsx3TotalSEFSs,
                        this.dsx3TotalUASs,
                        this.dsx3TotalLCVs,
                        this.dsx3TotalPCVs,
                        this.dsx3TotalLESs,
                        this.dsx3TotalCCVs,
                        this.dsx3TotalCESs,
                        this.dsx3TotalCSESs
                    };
                }
                public static final class Dsx3TotalIndexEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3TotalIndexEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalIndex", "1.3.6.1.2.1.10.30.8.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalPESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3TotalPESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalPESs", "1.3.6.1.2.1.10.30.8.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalPSESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3TotalPSESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalPSESs", "1.3.6.1.2.1.10.30.8.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalSEFSsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3TotalSEFSsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalSEFSs", "1.3.6.1.2.1.10.30.8.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalUASsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3TotalUASsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalUASs", "1.3.6.1.2.1.10.30.8.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalLCVsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3TotalLCVsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalLCVs", "1.3.6.1.2.1.10.30.8.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalPCVsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3TotalPCVsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalPCVs", "1.3.6.1.2.1.10.30.8.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalLESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3TotalLESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalLESs", "1.3.6.1.2.1.10.30.8.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalCCVsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3TotalCCVsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalCCVs", "1.3.6.1.2.1.10.30.8.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalCESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3TotalCESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalCESs", "1.3.6.1.2.1.10.30.8.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalCSESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3TotalCSESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalCSESs", "1.3.6.1.2.1.10.30.8.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx3FarEndConfigTableEnt extends MIBEntry<RFC1407MIBDef>
        {
            public final Dsx3FarEndConfigEntryEnt dsx3FarEndConfigEntry;

            private Dsx3FarEndConfigTableEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
            {
                super(mib, parent, "dsx3FarEndConfigTable", "1.3.6.1.2.1.10.30.9", false, true, false, false);
                this.dsx3FarEndConfigEntry = new Dsx3FarEndConfigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3FarEndConfigEntry
                };
            }
            public static final class Dsx3FarEndConfigEntryEnt extends MIBEntry<RFC1407MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx3FarEndLineIndexEnt dsx3FarEndLineIndex;

                public final Dsx3FarEndEquipCodeEnt dsx3FarEndEquipCode;

                public final Dsx3FarEndLocationIDCodeEnt dsx3FarEndLocationIDCode;

                public final Dsx3FarEndFrameIDCodeEnt dsx3FarEndFrameIDCode;

                public final Dsx3FarEndUnitCodeEnt dsx3FarEndUnitCode;

                public final Dsx3FarEndFacilityIDCodeEnt dsx3FarEndFacilityIDCode;

                private Dsx3FarEndConfigEntryEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                {
                    super(mib, parent, "dsx3FarEndConfigEntry", "1.3.6.1.2.1.10.30.9.1", false, false, false, true);
                    this.dsx3FarEndLineIndex = new Dsx3FarEndLineIndexEnt(mib, this);
                    this.dsx3FarEndEquipCode = new Dsx3FarEndEquipCodeEnt(mib, this);
                    this.dsx3FarEndLocationIDCode = new Dsx3FarEndLocationIDCodeEnt(mib, this);
                    this.dsx3FarEndFrameIDCode = new Dsx3FarEndFrameIDCodeEnt(mib, this);
                    this.dsx3FarEndUnitCode = new Dsx3FarEndUnitCodeEnt(mib, this);
                    this.dsx3FarEndFacilityIDCode = new Dsx3FarEndFacilityIDCodeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx3FarEndLineIndex,
                        this.dsx3FarEndEquipCode,
                        this.dsx3FarEndLocationIDCode,
                        this.dsx3FarEndFrameIDCode,
                        this.dsx3FarEndUnitCode,
                        this.dsx3FarEndFacilityIDCode
                    };
                }
                public static final class Dsx3FarEndLineIndexEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndLineIndexEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndLineIndex", "1.3.6.1.2.1.10.30.9.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndEquipCodeEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndEquipCodeEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndEquipCode", "1.3.6.1.2.1.10.30.9.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndLocationIDCodeEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndLocationIDCodeEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndLocationIDCode", "1.3.6.1.2.1.10.30.9.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndFrameIDCodeEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndFrameIDCodeEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndFrameIDCode", "1.3.6.1.2.1.10.30.9.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndUnitCodeEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndUnitCodeEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndUnitCode", "1.3.6.1.2.1.10.30.9.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndFacilityIDCodeEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndFacilityIDCodeEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndFacilityIDCode", "1.3.6.1.2.1.10.30.9.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx3FarEndCurrentTableEnt extends MIBEntry<RFC1407MIBDef>
        {
            public final Dsx3FarEndCurrentEntryEnt dsx3FarEndCurrentEntry;

            private Dsx3FarEndCurrentTableEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
            {
                super(mib, parent, "dsx3FarEndCurrentTable", "1.3.6.1.2.1.10.30.10", false, true, false, false);
                this.dsx3FarEndCurrentEntry = new Dsx3FarEndCurrentEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3FarEndCurrentEntry
                };
            }
            public static final class Dsx3FarEndCurrentEntryEnt extends MIBEntry<RFC1407MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx3FarEndCurrentIndexEnt dsx3FarEndCurrentIndex;

                public final Dsx3FarEndTimeElapsedEnt dsx3FarEndTimeElapsed;

                public final Dsx3FarEndValidIntervalsEnt dsx3FarEndValidIntervals;

                public final Dsx3FarEndCurrentCESsEnt dsx3FarEndCurrentCESs;

                public final Dsx3FarEndCurrentCSESsEnt dsx3FarEndCurrentCSESs;

                public final Dsx3FarEndCurrentCCVsEnt dsx3FarEndCurrentCCVs;

                public final Dsx3FarEndCurrentUASsEnt dsx3FarEndCurrentUASs;

                private Dsx3FarEndCurrentEntryEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                {
                    super(mib, parent, "dsx3FarEndCurrentEntry", "1.3.6.1.2.1.10.30.10.1", false, false, false, true);
                    this.dsx3FarEndCurrentIndex = new Dsx3FarEndCurrentIndexEnt(mib, this);
                    this.dsx3FarEndTimeElapsed = new Dsx3FarEndTimeElapsedEnt(mib, this);
                    this.dsx3FarEndValidIntervals = new Dsx3FarEndValidIntervalsEnt(mib, this);
                    this.dsx3FarEndCurrentCESs = new Dsx3FarEndCurrentCESsEnt(mib, this);
                    this.dsx3FarEndCurrentCSESs = new Dsx3FarEndCurrentCSESsEnt(mib, this);
                    this.dsx3FarEndCurrentCCVs = new Dsx3FarEndCurrentCCVsEnt(mib, this);
                    this.dsx3FarEndCurrentUASs = new Dsx3FarEndCurrentUASsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx3FarEndCurrentIndex,
                        this.dsx3FarEndTimeElapsed,
                        this.dsx3FarEndValidIntervals,
                        this.dsx3FarEndCurrentCESs,
                        this.dsx3FarEndCurrentCSESs,
                        this.dsx3FarEndCurrentCCVs,
                        this.dsx3FarEndCurrentUASs
                    };
                }
                public static final class Dsx3FarEndCurrentIndexEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndCurrentIndexEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndCurrentIndex", "1.3.6.1.2.1.10.30.10.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndTimeElapsedEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndTimeElapsedEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndTimeElapsed", "1.3.6.1.2.1.10.30.10.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndValidIntervalsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndValidIntervalsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndValidIntervals", "1.3.6.1.2.1.10.30.10.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndCurrentCESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndCurrentCESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndCurrentCESs", "1.3.6.1.2.1.10.30.10.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndCurrentCSESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndCurrentCSESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndCurrentCSESs", "1.3.6.1.2.1.10.30.10.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndCurrentCCVsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndCurrentCCVsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndCurrentCCVs", "1.3.6.1.2.1.10.30.10.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndCurrentUASsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndCurrentUASsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndCurrentUASs", "1.3.6.1.2.1.10.30.10.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx3FarEndIntervalTableEnt extends MIBEntry<RFC1407MIBDef>
        {
            public final Dsx3FarEndIntervalEntryEnt dsx3FarEndIntervalEntry;

            private Dsx3FarEndIntervalTableEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
            {
                super(mib, parent, "dsx3FarEndIntervalTable", "1.3.6.1.2.1.10.30.11", false, true, false, false);
                this.dsx3FarEndIntervalEntry = new Dsx3FarEndIntervalEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3FarEndIntervalEntry
                };
            }
            public static final class Dsx3FarEndIntervalEntryEnt extends MIBEntry<RFC1407MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx3FarEndIntervalIndexEnt dsx3FarEndIntervalIndex;

                /** read-only since originally an
SMIv1 index*/
                public final Dsx3FarEndIntervalNumberEnt dsx3FarEndIntervalNumber;

                public final Dsx3FarEndIntervalCESsEnt dsx3FarEndIntervalCESs;

                public final Dsx3FarEndIntervalCSESsEnt dsx3FarEndIntervalCSESs;

                public final Dsx3FarEndIntervalCCVsEnt dsx3FarEndIntervalCCVs;

                public final Dsx3FarEndIntervalUASsEnt dsx3FarEndIntervalUASs;

                private Dsx3FarEndIntervalEntryEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                {
                    super(mib, parent, "dsx3FarEndIntervalEntry", "1.3.6.1.2.1.10.30.11.1", false, false, false, true);
                    this.dsx3FarEndIntervalIndex = new Dsx3FarEndIntervalIndexEnt(mib, this);
                    this.dsx3FarEndIntervalNumber = new Dsx3FarEndIntervalNumberEnt(mib, this);
                    this.dsx3FarEndIntervalCESs = new Dsx3FarEndIntervalCESsEnt(mib, this);
                    this.dsx3FarEndIntervalCSESs = new Dsx3FarEndIntervalCSESsEnt(mib, this);
                    this.dsx3FarEndIntervalCCVs = new Dsx3FarEndIntervalCCVsEnt(mib, this);
                    this.dsx3FarEndIntervalUASs = new Dsx3FarEndIntervalUASsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx3FarEndIntervalIndex,
                        this.dsx3FarEndIntervalNumber,
                        this.dsx3FarEndIntervalCESs,
                        this.dsx3FarEndIntervalCSESs,
                        this.dsx3FarEndIntervalCCVs,
                        this.dsx3FarEndIntervalUASs
                    };
                }
                public static final class Dsx3FarEndIntervalIndexEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndIntervalIndexEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndIntervalIndex", "1.3.6.1.2.1.10.30.11.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndIntervalNumberEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndIntervalNumberEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndIntervalNumber", "1.3.6.1.2.1.10.30.11.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndIntervalCESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndIntervalCESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndIntervalCESs", "1.3.6.1.2.1.10.30.11.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndIntervalCSESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndIntervalCSESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndIntervalCSESs", "1.3.6.1.2.1.10.30.11.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndIntervalCCVsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndIntervalCCVsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndIntervalCCVs", "1.3.6.1.2.1.10.30.11.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndIntervalUASsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndIntervalUASsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndIntervalUASs", "1.3.6.1.2.1.10.30.11.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx3FarEndTotalTableEnt extends MIBEntry<RFC1407MIBDef>
        {
            public final Dsx3FarEndTotalEntryEnt dsx3FarEndTotalEntry;

            private Dsx3FarEndTotalTableEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
            {
                super(mib, parent, "dsx3FarEndTotalTable", "1.3.6.1.2.1.10.30.12", false, true, false, false);
                this.dsx3FarEndTotalEntry = new Dsx3FarEndTotalEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3FarEndTotalEntry
                };
            }
            public static final class Dsx3FarEndTotalEntryEnt extends MIBEntry<RFC1407MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx3FarEndTotalIndexEnt dsx3FarEndTotalIndex;

                public final Dsx3FarEndTotalCESsEnt dsx3FarEndTotalCESs;

                public final Dsx3FarEndTotalCSESsEnt dsx3FarEndTotalCSESs;

                public final Dsx3FarEndTotalCCVsEnt dsx3FarEndTotalCCVs;

                public final Dsx3FarEndTotalUASsEnt dsx3FarEndTotalUASs;

                private Dsx3FarEndTotalEntryEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                {
                    super(mib, parent, "dsx3FarEndTotalEntry", "1.3.6.1.2.1.10.30.12.1", false, false, false, true);
                    this.dsx3FarEndTotalIndex = new Dsx3FarEndTotalIndexEnt(mib, this);
                    this.dsx3FarEndTotalCESs = new Dsx3FarEndTotalCESsEnt(mib, this);
                    this.dsx3FarEndTotalCSESs = new Dsx3FarEndTotalCSESsEnt(mib, this);
                    this.dsx3FarEndTotalCCVs = new Dsx3FarEndTotalCCVsEnt(mib, this);
                    this.dsx3FarEndTotalUASs = new Dsx3FarEndTotalUASsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx3FarEndTotalIndex,
                        this.dsx3FarEndTotalCESs,
                        this.dsx3FarEndTotalCSESs,
                        this.dsx3FarEndTotalCCVs,
                        this.dsx3FarEndTotalUASs
                    };
                }
                public static final class Dsx3FarEndTotalIndexEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndTotalIndexEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndTotalIndex", "1.3.6.1.2.1.10.30.12.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndTotalCESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndTotalCESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndTotalCESs", "1.3.6.1.2.1.10.30.12.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndTotalCSESsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndTotalCSESsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndTotalCSESs", "1.3.6.1.2.1.10.30.12.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndTotalCCVsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndTotalCCVsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndTotalCCVs", "1.3.6.1.2.1.10.30.12.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndTotalUASsEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FarEndTotalUASsEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndTotalUASs", "1.3.6.1.2.1.10.30.12.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx3FracTableEnt extends MIBEntry<RFC1407MIBDef>
        {
            public final Dsx3FracEntryEnt dsx3FracEntry;

            private Dsx3FracTableEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
            {
                super(mib, parent, "dsx3FracTable", "1.3.6.1.2.1.10.30.13", false, true, false, false);
                this.dsx3FracEntry = new Dsx3FracEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3FracEntry
                };
            }
            public static final class Dsx3FracEntryEnt extends MIBEntry<RFC1407MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx3FracIndexEnt dsx3FracIndex;

                /** read-only since originally an
SMIv1 index*/
                public final Dsx3FracNumberEnt dsx3FracNumber;

                public final Dsx3FracIfIndexEnt dsx3FracIfIndex;

                private Dsx3FracEntryEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                {
                    super(mib, parent, "dsx3FracEntry", "1.3.6.1.2.1.10.30.13.1", false, false, false, true);
                    this.dsx3FracIndex = new Dsx3FracIndexEnt(mib, this);
                    this.dsx3FracNumber = new Dsx3FracNumberEnt(mib, this);
                    this.dsx3FracIfIndex = new Dsx3FracIfIndexEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx3FracIndex,
                        this.dsx3FracNumber,
                        this.dsx3FracIfIndex
                    };
                }
                public static final class Dsx3FracIndexEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FracIndexEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FracIndex", "1.3.6.1.2.1.10.30.13.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FracNumberEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FracNumberEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FracNumber", "1.3.6.1.2.1.10.30.13.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FracIfIndexEnt extends MIBEntry<RFC1407MIBDef>
                {
                    private Dsx3FracIfIndexEnt(RFC1407MIBDef mib, MIBEntry<RFC1407MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FracIfIndex", "1.3.6.1.2.1.10.30.13.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
