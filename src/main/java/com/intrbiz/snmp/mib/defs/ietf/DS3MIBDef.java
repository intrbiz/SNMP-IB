package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2579]
[RFC2580]
[RFC2863]*/
public final class DS3MIBDef extends MIB
{
    public static final DS3MIBDef DS3MIB = new DS3MIBDef();

    /** [RFC3593]

September 08, 2004*/
    public final Ds3Ent ds3;

    public final Dsx3LineStatusChangeEnt dsx3LineStatusChange;

    private DS3MIBDef()
    {
        super("DS3-MIB");
        this.ds3 = new Ds3Ent(this, null);
        this.dsx3LineStatusChange = new Dsx3LineStatusChangeEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ds3,
            this.dsx3LineStatusChange
        };
    }

    public static final class Ds3Ent extends MIBEntry<DS3MIBDef>
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

        /** DS3 TRAPS*/
        public final Ds3TrapsEnt ds3Traps;

        /** conformance information*/
        public final Ds3ConformanceEnt ds3Conformance;

        private Ds3Ent(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
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
            this.ds3Traps = new Ds3TrapsEnt(mib, this);
            this.ds3Conformance = new Ds3ConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dsx3ConfigTable,
                this.dsx3CurrentTable,
                this.dsx3IntervalTable,
                this.dsx3TotalTable,
                this.dsx3FarEndConfigTable,
                this.dsx3FarEndCurrentTable,
                this.dsx3FarEndIntervalTable,
                this.dsx3FarEndTotalTable,
                this.dsx3FracTable,
                this.ds3Traps,
                this.ds3Conformance
            };
        }
        public static final class Dsx3ConfigTableEnt extends MIBEntry<DS3MIBDef>
        {
            public final Dsx3ConfigEntryEnt dsx3ConfigEntry;

            private Dsx3ConfigTableEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
            {
                super(mib, parent, "dsx3ConfigTable", "1.3.6.1.2.1.10.30.5", false, true, false, false);
                this.dsx3ConfigEntry = new Dsx3ConfigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3ConfigEntry
                };
            }
            public static final class Dsx3ConfigEntryEnt extends MIBEntry<DS3MIBDef>
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

                public final Dsx3InvalidIntervalsEnt dsx3InvalidIntervals;

                public final Dsx3LineLengthEnt dsx3LineLength;

                public final Dsx3LineStatusLastChangeEnt dsx3LineStatusLastChange;

                public final Dsx3LineStatusChangeTrapEnableEnt dsx3LineStatusChangeTrapEnable;

                public final Dsx3LoopbackStatusEnt dsx3LoopbackStatus;

                public final Dsx3ChannelizationEnt dsx3Channelization;

                public final Dsx3Ds1ForRemoteLoopEnt dsx3Ds1ForRemoteLoop;

                private Dsx3ConfigEntryEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
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
                    this.dsx3InvalidIntervals = new Dsx3InvalidIntervalsEnt(mib, this);
                    this.dsx3LineLength = new Dsx3LineLengthEnt(mib, this);
                    this.dsx3LineStatusLastChange = new Dsx3LineStatusLastChangeEnt(mib, this);
                    this.dsx3LineStatusChangeTrapEnable = new Dsx3LineStatusChangeTrapEnableEnt(mib, this);
                    this.dsx3LoopbackStatus = new Dsx3LoopbackStatusEnt(mib, this);
                    this.dsx3Channelization = new Dsx3ChannelizationEnt(mib, this);
                    this.dsx3Ds1ForRemoteLoop = new Dsx3Ds1ForRemoteLoopEnt(mib, this);
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
                        this.dsx3TransmitClockSource,
                        this.dsx3InvalidIntervals,
                        this.dsx3LineLength,
                        this.dsx3LineStatusLastChange,
                        this.dsx3LineStatusChangeTrapEnable,
                        this.dsx3LoopbackStatus,
                        this.dsx3Channelization,
                        this.dsx3Ds1ForRemoteLoop
                    };
                }
                public static final class Dsx3LineIndexEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3LineIndexEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3LineIndex", "1.3.6.1.2.1.10.30.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IfIndexEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3IfIndexEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IfIndex", "1.3.6.1.2.1.10.30.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TimeElapsedEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3TimeElapsedEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TimeElapsed", "1.3.6.1.2.1.10.30.5.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3ValidIntervalsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3ValidIntervalsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3ValidIntervals", "1.3.6.1.2.1.10.30.5.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3LineTypeEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3LineTypeEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3LineType", "1.3.6.1.2.1.10.30.5.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3LineCodingEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3LineCodingEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3LineCoding", "1.3.6.1.2.1.10.30.5.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3SendCodeEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3SendCodeEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3SendCode", "1.3.6.1.2.1.10.30.5.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CircuitIdentifierEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3CircuitIdentifierEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CircuitIdentifier", "1.3.6.1.2.1.10.30.5.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3LoopbackConfigEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3LoopbackConfigEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3LoopbackConfig", "1.3.6.1.2.1.10.30.5.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3LineStatusEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3LineStatusEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3LineStatus", "1.3.6.1.2.1.10.30.5.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TransmitClockSourceEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3TransmitClockSourceEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TransmitClockSource", "1.3.6.1.2.1.10.30.5.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3InvalidIntervalsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3InvalidIntervalsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3InvalidIntervals", "1.3.6.1.2.1.10.30.5.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3LineLengthEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3LineLengthEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3LineLength", "1.3.6.1.2.1.10.30.5.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3LineStatusLastChangeEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3LineStatusLastChangeEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3LineStatusLastChange", "1.3.6.1.2.1.10.30.5.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3LineStatusChangeTrapEnableEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3LineStatusChangeTrapEnableEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3LineStatusChangeTrapEnable", "1.3.6.1.2.1.10.30.5.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3LoopbackStatusEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3LoopbackStatusEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3LoopbackStatus", "1.3.6.1.2.1.10.30.5.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3ChannelizationEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3ChannelizationEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3Channelization", "1.3.6.1.2.1.10.30.5.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3Ds1ForRemoteLoopEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3Ds1ForRemoteLoopEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3Ds1ForRemoteLoop", "1.3.6.1.2.1.10.30.5.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx3CurrentTableEnt extends MIBEntry<DS3MIBDef>
        {
            public final Dsx3CurrentEntryEnt dsx3CurrentEntry;

            private Dsx3CurrentTableEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
            {
                super(mib, parent, "dsx3CurrentTable", "1.3.6.1.2.1.10.30.6", false, true, false, false);
                this.dsx3CurrentEntry = new Dsx3CurrentEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3CurrentEntry
                };
            }
            public static final class Dsx3CurrentEntryEnt extends MIBEntry<DS3MIBDef>
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

                private Dsx3CurrentEntryEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
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
                public static final class Dsx3CurrentIndexEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3CurrentIndexEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentIndex", "1.3.6.1.2.1.10.30.6.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentPESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3CurrentPESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentPESs", "1.3.6.1.2.1.10.30.6.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentPSESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3CurrentPSESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentPSESs", "1.3.6.1.2.1.10.30.6.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentSEFSsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3CurrentSEFSsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentSEFSs", "1.3.6.1.2.1.10.30.6.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentUASsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3CurrentUASsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentUASs", "1.3.6.1.2.1.10.30.6.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentLCVsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3CurrentLCVsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentLCVs", "1.3.6.1.2.1.10.30.6.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentPCVsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3CurrentPCVsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentPCVs", "1.3.6.1.2.1.10.30.6.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentLESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3CurrentLESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentLESs", "1.3.6.1.2.1.10.30.6.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentCCVsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3CurrentCCVsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentCCVs", "1.3.6.1.2.1.10.30.6.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentCESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3CurrentCESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentCESs", "1.3.6.1.2.1.10.30.6.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3CurrentCSESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3CurrentCSESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3CurrentCSESs", "1.3.6.1.2.1.10.30.6.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx3IntervalTableEnt extends MIBEntry<DS3MIBDef>
        {
            public final Dsx3IntervalEntryEnt dsx3IntervalEntry;

            private Dsx3IntervalTableEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
            {
                super(mib, parent, "dsx3IntervalTable", "1.3.6.1.2.1.10.30.7", false, true, false, false);
                this.dsx3IntervalEntry = new Dsx3IntervalEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3IntervalEntry
                };
            }
            public static final class Dsx3IntervalEntryEnt extends MIBEntry<DS3MIBDef>
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

                public final Dsx3IntervalValidDataEnt dsx3IntervalValidData;

                private Dsx3IntervalEntryEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
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
                    this.dsx3IntervalValidData = new Dsx3IntervalValidDataEnt(mib, this);
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
                        this.dsx3IntervalCSESs,
                        this.dsx3IntervalValidData
                    };
                }
                public static final class Dsx3IntervalIndexEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3IntervalIndexEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalIndex", "1.3.6.1.2.1.10.30.7.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalNumberEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3IntervalNumberEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalNumber", "1.3.6.1.2.1.10.30.7.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalPESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3IntervalPESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalPESs", "1.3.6.1.2.1.10.30.7.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalPSESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3IntervalPSESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalPSESs", "1.3.6.1.2.1.10.30.7.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalSEFSsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3IntervalSEFSsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalSEFSs", "1.3.6.1.2.1.10.30.7.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalUASsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3IntervalUASsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalUASs", "1.3.6.1.2.1.10.30.7.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalLCVsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3IntervalLCVsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalLCVs", "1.3.6.1.2.1.10.30.7.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalPCVsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3IntervalPCVsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalPCVs", "1.3.6.1.2.1.10.30.7.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalLESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3IntervalLESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalLESs", "1.3.6.1.2.1.10.30.7.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalCCVsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3IntervalCCVsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalCCVs", "1.3.6.1.2.1.10.30.7.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalCESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3IntervalCESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalCESs", "1.3.6.1.2.1.10.30.7.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalCSESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3IntervalCSESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalCSESs", "1.3.6.1.2.1.10.30.7.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3IntervalValidDataEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3IntervalValidDataEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3IntervalValidData", "1.3.6.1.2.1.10.30.7.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx3TotalTableEnt extends MIBEntry<DS3MIBDef>
        {
            public final Dsx3TotalEntryEnt dsx3TotalEntry;

            private Dsx3TotalTableEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
            {
                super(mib, parent, "dsx3TotalTable", "1.3.6.1.2.1.10.30.8", false, true, false, false);
                this.dsx3TotalEntry = new Dsx3TotalEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3TotalEntry
                };
            }
            public static final class Dsx3TotalEntryEnt extends MIBEntry<DS3MIBDef>
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

                private Dsx3TotalEntryEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
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
                public static final class Dsx3TotalIndexEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3TotalIndexEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalIndex", "1.3.6.1.2.1.10.30.8.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalPESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3TotalPESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalPESs", "1.3.6.1.2.1.10.30.8.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalPSESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3TotalPSESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalPSESs", "1.3.6.1.2.1.10.30.8.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalSEFSsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3TotalSEFSsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalSEFSs", "1.3.6.1.2.1.10.30.8.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalUASsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3TotalUASsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalUASs", "1.3.6.1.2.1.10.30.8.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalLCVsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3TotalLCVsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalLCVs", "1.3.6.1.2.1.10.30.8.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalPCVsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3TotalPCVsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalPCVs", "1.3.6.1.2.1.10.30.8.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalLESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3TotalLESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalLESs", "1.3.6.1.2.1.10.30.8.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalCCVsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3TotalCCVsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalCCVs", "1.3.6.1.2.1.10.30.8.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalCESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3TotalCESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalCESs", "1.3.6.1.2.1.10.30.8.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3TotalCSESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3TotalCSESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3TotalCSESs", "1.3.6.1.2.1.10.30.8.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx3FarEndConfigTableEnt extends MIBEntry<DS3MIBDef>
        {
            public final Dsx3FarEndConfigEntryEnt dsx3FarEndConfigEntry;

            private Dsx3FarEndConfigTableEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
            {
                super(mib, parent, "dsx3FarEndConfigTable", "1.3.6.1.2.1.10.30.9", false, true, false, false);
                this.dsx3FarEndConfigEntry = new Dsx3FarEndConfigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3FarEndConfigEntry
                };
            }
            public static final class Dsx3FarEndConfigEntryEnt extends MIBEntry<DS3MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx3FarEndLineIndexEnt dsx3FarEndLineIndex;

                public final Dsx3FarEndEquipCodeEnt dsx3FarEndEquipCode;

                public final Dsx3FarEndLocationIDCodeEnt dsx3FarEndLocationIDCode;

                public final Dsx3FarEndFrameIDCodeEnt dsx3FarEndFrameIDCode;

                public final Dsx3FarEndUnitCodeEnt dsx3FarEndUnitCode;

                public final Dsx3FarEndFacilityIDCodeEnt dsx3FarEndFacilityIDCode;

                private Dsx3FarEndConfigEntryEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
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
                public static final class Dsx3FarEndLineIndexEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndLineIndexEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndLineIndex", "1.3.6.1.2.1.10.30.9.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndEquipCodeEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndEquipCodeEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndEquipCode", "1.3.6.1.2.1.10.30.9.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndLocationIDCodeEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndLocationIDCodeEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndLocationIDCode", "1.3.6.1.2.1.10.30.9.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndFrameIDCodeEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndFrameIDCodeEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndFrameIDCode", "1.3.6.1.2.1.10.30.9.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndUnitCodeEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndUnitCodeEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndUnitCode", "1.3.6.1.2.1.10.30.9.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndFacilityIDCodeEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndFacilityIDCodeEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndFacilityIDCode", "1.3.6.1.2.1.10.30.9.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx3FarEndCurrentTableEnt extends MIBEntry<DS3MIBDef>
        {
            public final Dsx3FarEndCurrentEntryEnt dsx3FarEndCurrentEntry;

            private Dsx3FarEndCurrentTableEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
            {
                super(mib, parent, "dsx3FarEndCurrentTable", "1.3.6.1.2.1.10.30.10", false, true, false, false);
                this.dsx3FarEndCurrentEntry = new Dsx3FarEndCurrentEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3FarEndCurrentEntry
                };
            }
            public static final class Dsx3FarEndCurrentEntryEnt extends MIBEntry<DS3MIBDef>
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

                public final Dsx3FarEndInvalidIntervalsEnt dsx3FarEndInvalidIntervals;

                private Dsx3FarEndCurrentEntryEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                {
                    super(mib, parent, "dsx3FarEndCurrentEntry", "1.3.6.1.2.1.10.30.10.1", false, false, false, true);
                    this.dsx3FarEndCurrentIndex = new Dsx3FarEndCurrentIndexEnt(mib, this);
                    this.dsx3FarEndTimeElapsed = new Dsx3FarEndTimeElapsedEnt(mib, this);
                    this.dsx3FarEndValidIntervals = new Dsx3FarEndValidIntervalsEnt(mib, this);
                    this.dsx3FarEndCurrentCESs = new Dsx3FarEndCurrentCESsEnt(mib, this);
                    this.dsx3FarEndCurrentCSESs = new Dsx3FarEndCurrentCSESsEnt(mib, this);
                    this.dsx3FarEndCurrentCCVs = new Dsx3FarEndCurrentCCVsEnt(mib, this);
                    this.dsx3FarEndCurrentUASs = new Dsx3FarEndCurrentUASsEnt(mib, this);
                    this.dsx3FarEndInvalidIntervals = new Dsx3FarEndInvalidIntervalsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx3FarEndCurrentIndex,
                        this.dsx3FarEndTimeElapsed,
                        this.dsx3FarEndValidIntervals,
                        this.dsx3FarEndCurrentCESs,
                        this.dsx3FarEndCurrentCSESs,
                        this.dsx3FarEndCurrentCCVs,
                        this.dsx3FarEndCurrentUASs,
                        this.dsx3FarEndInvalidIntervals
                    };
                }
                public static final class Dsx3FarEndCurrentIndexEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndCurrentIndexEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndCurrentIndex", "1.3.6.1.2.1.10.30.10.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndTimeElapsedEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndTimeElapsedEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndTimeElapsed", "1.3.6.1.2.1.10.30.10.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndValidIntervalsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndValidIntervalsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndValidIntervals", "1.3.6.1.2.1.10.30.10.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndCurrentCESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndCurrentCESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndCurrentCESs", "1.3.6.1.2.1.10.30.10.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndCurrentCSESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndCurrentCSESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndCurrentCSESs", "1.3.6.1.2.1.10.30.10.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndCurrentCCVsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndCurrentCCVsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndCurrentCCVs", "1.3.6.1.2.1.10.30.10.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndCurrentUASsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndCurrentUASsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndCurrentUASs", "1.3.6.1.2.1.10.30.10.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndInvalidIntervalsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndInvalidIntervalsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndInvalidIntervals", "1.3.6.1.2.1.10.30.10.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx3FarEndIntervalTableEnt extends MIBEntry<DS3MIBDef>
        {
            public final Dsx3FarEndIntervalEntryEnt dsx3FarEndIntervalEntry;

            private Dsx3FarEndIntervalTableEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
            {
                super(mib, parent, "dsx3FarEndIntervalTable", "1.3.6.1.2.1.10.30.11", false, true, false, false);
                this.dsx3FarEndIntervalEntry = new Dsx3FarEndIntervalEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3FarEndIntervalEntry
                };
            }
            public static final class Dsx3FarEndIntervalEntryEnt extends MIBEntry<DS3MIBDef>
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

                public final Dsx3FarEndIntervalValidDataEnt dsx3FarEndIntervalValidData;

                private Dsx3FarEndIntervalEntryEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                {
                    super(mib, parent, "dsx3FarEndIntervalEntry", "1.3.6.1.2.1.10.30.11.1", false, false, false, true);
                    this.dsx3FarEndIntervalIndex = new Dsx3FarEndIntervalIndexEnt(mib, this);
                    this.dsx3FarEndIntervalNumber = new Dsx3FarEndIntervalNumberEnt(mib, this);
                    this.dsx3FarEndIntervalCESs = new Dsx3FarEndIntervalCESsEnt(mib, this);
                    this.dsx3FarEndIntervalCSESs = new Dsx3FarEndIntervalCSESsEnt(mib, this);
                    this.dsx3FarEndIntervalCCVs = new Dsx3FarEndIntervalCCVsEnt(mib, this);
                    this.dsx3FarEndIntervalUASs = new Dsx3FarEndIntervalUASsEnt(mib, this);
                    this.dsx3FarEndIntervalValidData = new Dsx3FarEndIntervalValidDataEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx3FarEndIntervalIndex,
                        this.dsx3FarEndIntervalNumber,
                        this.dsx3FarEndIntervalCESs,
                        this.dsx3FarEndIntervalCSESs,
                        this.dsx3FarEndIntervalCCVs,
                        this.dsx3FarEndIntervalUASs,
                        this.dsx3FarEndIntervalValidData
                    };
                }
                public static final class Dsx3FarEndIntervalIndexEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndIntervalIndexEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndIntervalIndex", "1.3.6.1.2.1.10.30.11.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndIntervalNumberEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndIntervalNumberEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndIntervalNumber", "1.3.6.1.2.1.10.30.11.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndIntervalCESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndIntervalCESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndIntervalCESs", "1.3.6.1.2.1.10.30.11.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndIntervalCSESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndIntervalCSESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndIntervalCSESs", "1.3.6.1.2.1.10.30.11.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndIntervalCCVsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndIntervalCCVsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndIntervalCCVs", "1.3.6.1.2.1.10.30.11.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndIntervalUASsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndIntervalUASsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndIntervalUASs", "1.3.6.1.2.1.10.30.11.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndIntervalValidDataEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndIntervalValidDataEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndIntervalValidData", "1.3.6.1.2.1.10.30.11.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx3FarEndTotalTableEnt extends MIBEntry<DS3MIBDef>
        {
            public final Dsx3FarEndTotalEntryEnt dsx3FarEndTotalEntry;

            private Dsx3FarEndTotalTableEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
            {
                super(mib, parent, "dsx3FarEndTotalTable", "1.3.6.1.2.1.10.30.12", false, true, false, false);
                this.dsx3FarEndTotalEntry = new Dsx3FarEndTotalEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3FarEndTotalEntry
                };
            }
            public static final class Dsx3FarEndTotalEntryEnt extends MIBEntry<DS3MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx3FarEndTotalIndexEnt dsx3FarEndTotalIndex;

                public final Dsx3FarEndTotalCESsEnt dsx3FarEndTotalCESs;

                public final Dsx3FarEndTotalCSESsEnt dsx3FarEndTotalCSESs;

                public final Dsx3FarEndTotalCCVsEnt dsx3FarEndTotalCCVs;

                public final Dsx3FarEndTotalUASsEnt dsx3FarEndTotalUASs;

                private Dsx3FarEndTotalEntryEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
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
                public static final class Dsx3FarEndTotalIndexEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndTotalIndexEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndTotalIndex", "1.3.6.1.2.1.10.30.12.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndTotalCESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndTotalCESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndTotalCESs", "1.3.6.1.2.1.10.30.12.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndTotalCSESsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndTotalCSESsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndTotalCSESs", "1.3.6.1.2.1.10.30.12.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndTotalCCVsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndTotalCCVsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndTotalCCVs", "1.3.6.1.2.1.10.30.12.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FarEndTotalUASsEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FarEndTotalUASsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FarEndTotalUASs", "1.3.6.1.2.1.10.30.12.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx3FracTableEnt extends MIBEntry<DS3MIBDef>
        {
            public final Dsx3FracEntryEnt dsx3FracEntry;

            private Dsx3FracTableEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
            {
                super(mib, parent, "dsx3FracTable", "1.3.6.1.2.1.10.30.13", false, true, false, false);
                this.dsx3FracEntry = new Dsx3FracEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx3FracEntry
                };
            }
            public static final class Dsx3FracEntryEnt extends MIBEntry<DS3MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx3FracIndexEnt dsx3FracIndex;

                /** read-only since originally an
SMIv1 index*/
                public final Dsx3FracNumberEnt dsx3FracNumber;

                public final Dsx3FracIfIndexEnt dsx3FracIfIndex;

                private Dsx3FracEntryEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
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
                public static final class Dsx3FracIndexEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FracIndexEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FracIndex", "1.3.6.1.2.1.10.30.13.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FracNumberEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FracNumberEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FracNumber", "1.3.6.1.2.1.10.30.13.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx3FracIfIndexEnt extends MIBEntry<DS3MIBDef>
                {
                    private Dsx3FracIfIndexEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "dsx3FracIfIndex", "1.3.6.1.2.1.10.30.13.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Ds3TrapsEnt extends MIBEntry<DS3MIBDef>
        {
            private Ds3TrapsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
            {
                super(mib, parent, "ds3Traps", "1.3.6.1.2.1.10.30.15", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Ds3ConformanceEnt extends MIBEntry<DS3MIBDef>
        {
            public final Ds3GroupsEnt ds3Groups;

            public final Ds3CompliancesEnt ds3Compliances;

            private Ds3ConformanceEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
            {
                super(mib, parent, "ds3Conformance", "1.3.6.1.2.1.10.30.14", false, false, false, false);
                this.ds3Groups = new Ds3GroupsEnt(mib, this);
                this.ds3Compliances = new Ds3CompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ds3Groups,
                    this.ds3Compliances
                };
            }
            public static final class Ds3GroupsEnt extends MIBEntry<DS3MIBDef>
            {
                /** units of conformance*/
                public final Ds3NearEndConfigGroupEnt ds3NearEndConfigGroup;

                public final Ds3NearEndStatisticsGroupEnt ds3NearEndStatisticsGroup;

                public final Ds3FarEndGroupEnt ds3FarEndGroup;

                public final Ds3DeprecatedGroupEnt ds3DeprecatedGroup;

                public final Ds3NearEndOptionalConfigGroupEnt ds3NearEndOptionalConfigGroup;

                public final Ds3NearEndOptionalTrapGroupEnt ds3NearEndOptionalTrapGroup;

                private Ds3GroupsEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                {
                    super(mib, parent, "ds3Groups", "1.3.6.1.2.1.10.30.14.1", false, false, false, false);
                    this.ds3NearEndConfigGroup = new Ds3NearEndConfigGroupEnt(mib, this);
                    this.ds3NearEndStatisticsGroup = new Ds3NearEndStatisticsGroupEnt(mib, this);
                    this.ds3FarEndGroup = new Ds3FarEndGroupEnt(mib, this);
                    this.ds3DeprecatedGroup = new Ds3DeprecatedGroupEnt(mib, this);
                    this.ds3NearEndOptionalConfigGroup = new Ds3NearEndOptionalConfigGroupEnt(mib, this);
                    this.ds3NearEndOptionalTrapGroup = new Ds3NearEndOptionalTrapGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ds3NearEndConfigGroup,
                        this.ds3NearEndStatisticsGroup,
                        this.ds3FarEndGroup,
                        this.ds3DeprecatedGroup,
                        this.ds3NearEndOptionalConfigGroup,
                        this.ds3NearEndOptionalTrapGroup
                    };
                }
                public static final class Ds3NearEndConfigGroupEnt extends MIBEntry<DS3MIBDef>
                {
                    private Ds3NearEndConfigGroupEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "ds3NearEndConfigGroup", "1.3.6.1.2.1.10.30.14.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds3NearEndStatisticsGroupEnt extends MIBEntry<DS3MIBDef>
                {
                    private Ds3NearEndStatisticsGroupEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "ds3NearEndStatisticsGroup", "1.3.6.1.2.1.10.30.14.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds3FarEndGroupEnt extends MIBEntry<DS3MIBDef>
                {
                    private Ds3FarEndGroupEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "ds3FarEndGroup", "1.3.6.1.2.1.10.30.14.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds3DeprecatedGroupEnt extends MIBEntry<DS3MIBDef>
                {
                    private Ds3DeprecatedGroupEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "ds3DeprecatedGroup", "1.3.6.1.2.1.10.30.14.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds3NearEndOptionalConfigGroupEnt extends MIBEntry<DS3MIBDef>
                {
                    private Ds3NearEndOptionalConfigGroupEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "ds3NearEndOptionalConfigGroup", "1.3.6.1.2.1.10.30.14.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds3NearEndOptionalTrapGroupEnt extends MIBEntry<DS3MIBDef>
                {
                    private Ds3NearEndOptionalTrapGroupEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "ds3NearEndOptionalTrapGroup", "1.3.6.1.2.1.10.30.14.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Ds3CompliancesEnt extends MIBEntry<DS3MIBDef>
            {
                /** compliance statements*/
                public final Ds3ComplianceEnt ds3Compliance;

                private Ds3CompliancesEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                {
                    super(mib, parent, "ds3Compliances", "1.3.6.1.2.1.10.30.14.2", false, false, false, false);
                    this.ds3Compliance = new Ds3ComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ds3Compliance
                    };
                }
                public static final class Ds3ComplianceEnt extends MIBEntry<DS3MIBDef>
                {
                    private Ds3ComplianceEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
                    {
                        super(mib, parent, "ds3Compliance", "1.3.6.1.2.1.10.30.14.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class Dsx3LineStatusChangeEnt extends MIBEntry<DS3MIBDef>
    {
        private Dsx3LineStatusChangeEnt(DS3MIBDef mib, MIBEntry<DS3MIBDef> parent)
        {
            super(mib, parent, "dsx3LineStatusChange", "1.3.6.1.2.1.10.30.15.0.1", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
