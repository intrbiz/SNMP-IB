package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2579]
[RFC2580]
[RFC2863]*/
public final class DS1MIBDef extends MIB
{
    public static final DS1MIBDef DS1MIB = new DS1MIBDef();

    static { MIBs.getInstance().registerMIB(DS1MIBDef.DS1MIB); }

    /** [RFC3593]*/
    public final Ds1Ent ds1;

    public final Dsx1LineStatusChangeEnt dsx1LineStatusChange;

    private DS1MIBDef()
    {
        super("DS1-MIB");
        this.ds1 = new Ds1Ent(this, null);
        this.dsx1LineStatusChange = new Dsx1LineStatusChangeEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ds1,
            this.dsx1LineStatusChange
        };
    }

    public static final class Ds1Ent extends MIBEntry<DS1MIBDef>
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

        /** The DS1 Channel Table*/
        public final Dsx1ChanMappingTableEnt dsx1ChanMappingTable;

        /** The DS1 Far End Current Table*/
        public final Dsx1FarEndCurrentTableEnt dsx1FarEndCurrentTable;

        /** The DS1 Far End Interval Table*/
        public final Dsx1FarEndIntervalTableEnt dsx1FarEndIntervalTable;

        /** The DS1 Far End Total Table*/
        public final Dsx1FarEndTotalTableEnt dsx1FarEndTotalTable;

        /** The DS1 Fractional Table*/
        public final Dsx1FracTableEnt dsx1FracTable;

        /** DS1 TRAPS*/
        public final Ds1TrapsEnt ds1Traps;

        /** conformance information*/
        public final Ds1ConformanceEnt ds1Conformance;

        private Ds1Ent(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
        {
            super(mib, parent, "ds1", "1.3.6.1.2.1.10.18", false, false, false, false);
            this.dsx1ConfigTable = new Dsx1ConfigTableEnt(mib, this);
            this.dsx1CurrentTable = new Dsx1CurrentTableEnt(mib, this);
            this.dsx1IntervalTable = new Dsx1IntervalTableEnt(mib, this);
            this.dsx1TotalTable = new Dsx1TotalTableEnt(mib, this);
            this.dsx1ChanMappingTable = new Dsx1ChanMappingTableEnt(mib, this);
            this.dsx1FarEndCurrentTable = new Dsx1FarEndCurrentTableEnt(mib, this);
            this.dsx1FarEndIntervalTable = new Dsx1FarEndIntervalTableEnt(mib, this);
            this.dsx1FarEndTotalTable = new Dsx1FarEndTotalTableEnt(mib, this);
            this.dsx1FracTable = new Dsx1FracTableEnt(mib, this);
            this.ds1Traps = new Ds1TrapsEnt(mib, this);
            this.ds1Conformance = new Ds1ConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dsx1ConfigTable,
                this.dsx1CurrentTable,
                this.dsx1IntervalTable,
                this.dsx1TotalTable,
                this.dsx1ChanMappingTable,
                this.dsx1FarEndCurrentTable,
                this.dsx1FarEndIntervalTable,
                this.dsx1FarEndTotalTable,
                this.dsx1FracTable,
                this.ds1Traps,
                this.ds1Conformance
            };
        }
        public static final class Dsx1ConfigTableEnt extends MIBEntry<DS1MIBDef>
        {
            public final Dsx1ConfigEntryEnt dsx1ConfigEntry;

            private Dsx1ConfigTableEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
            {
                super(mib, parent, "dsx1ConfigTable", "1.3.6.1.2.1.10.18.6", false, true, false, false);
                this.dsx1ConfigEntry = new Dsx1ConfigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx1ConfigEntry
                };
            }
            public static final class Dsx1ConfigEntryEnt extends MIBEntry<DS1MIBDef>
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

                public final Dsx1InvalidIntervalsEnt dsx1InvalidIntervals;

                public final Dsx1LineLengthEnt dsx1LineLength;

                public final Dsx1LineStatusLastChangeEnt dsx1LineStatusLastChange;

                public final Dsx1LineStatusChangeTrapEnableEnt dsx1LineStatusChangeTrapEnable;

                public final Dsx1LoopbackStatusEnt dsx1LoopbackStatus;

                public final Dsx1Ds1ChannelNumberEnt dsx1Ds1ChannelNumber;

                public final Dsx1ChannelizationEnt dsx1Channelization;

                public final Dsx1LineModeEnt dsx1LineMode;

                public final Dsx1LineBuildOutEnt dsx1LineBuildOut;

                public final Dsx1LineImpedanceEnt dsx1LineImpedance;

                private Dsx1ConfigEntryEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
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
                    this.dsx1InvalidIntervals = new Dsx1InvalidIntervalsEnt(mib, this);
                    this.dsx1LineLength = new Dsx1LineLengthEnt(mib, this);
                    this.dsx1LineStatusLastChange = new Dsx1LineStatusLastChangeEnt(mib, this);
                    this.dsx1LineStatusChangeTrapEnable = new Dsx1LineStatusChangeTrapEnableEnt(mib, this);
                    this.dsx1LoopbackStatus = new Dsx1LoopbackStatusEnt(mib, this);
                    this.dsx1Ds1ChannelNumber = new Dsx1Ds1ChannelNumberEnt(mib, this);
                    this.dsx1Channelization = new Dsx1ChannelizationEnt(mib, this);
                    this.dsx1LineMode = new Dsx1LineModeEnt(mib, this);
                    this.dsx1LineBuildOut = new Dsx1LineBuildOutEnt(mib, this);
                    this.dsx1LineImpedance = new Dsx1LineImpedanceEnt(mib, this);
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
                        this.dsx1Fdl,
                        this.dsx1InvalidIntervals,
                        this.dsx1LineLength,
                        this.dsx1LineStatusLastChange,
                        this.dsx1LineStatusChangeTrapEnable,
                        this.dsx1LoopbackStatus,
                        this.dsx1Ds1ChannelNumber,
                        this.dsx1Channelization,
                        this.dsx1LineMode,
                        this.dsx1LineBuildOut,
                        this.dsx1LineImpedance
                    };
                }
                public static final class Dsx1LineIndexEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1LineIndexEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1LineIndex", "1.3.6.1.2.1.10.18.6.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IfIndexEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1IfIndexEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IfIndex", "1.3.6.1.2.1.10.18.6.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TimeElapsedEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1TimeElapsedEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TimeElapsed", "1.3.6.1.2.1.10.18.6.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1ValidIntervalsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1ValidIntervalsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1ValidIntervals", "1.3.6.1.2.1.10.18.6.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1LineTypeEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1LineTypeEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1LineType", "1.3.6.1.2.1.10.18.6.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1LineCodingEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1LineCodingEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1LineCoding", "1.3.6.1.2.1.10.18.6.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1SendCodeEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1SendCodeEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1SendCode", "1.3.6.1.2.1.10.18.6.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CircuitIdentifierEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1CircuitIdentifierEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CircuitIdentifier", "1.3.6.1.2.1.10.18.6.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1LoopbackConfigEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1LoopbackConfigEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1LoopbackConfig", "1.3.6.1.2.1.10.18.6.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1LineStatusEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1LineStatusEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1LineStatus", "1.3.6.1.2.1.10.18.6.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1SignalModeEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1SignalModeEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1SignalMode", "1.3.6.1.2.1.10.18.6.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TransmitClockSourceEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1TransmitClockSourceEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TransmitClockSource", "1.3.6.1.2.1.10.18.6.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FdlEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FdlEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1Fdl", "1.3.6.1.2.1.10.18.6.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1InvalidIntervalsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1InvalidIntervalsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1InvalidIntervals", "1.3.6.1.2.1.10.18.6.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1LineLengthEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1LineLengthEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1LineLength", "1.3.6.1.2.1.10.18.6.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1LineStatusLastChangeEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1LineStatusLastChangeEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1LineStatusLastChange", "1.3.6.1.2.1.10.18.6.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1LineStatusChangeTrapEnableEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1LineStatusChangeTrapEnableEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1LineStatusChangeTrapEnable", "1.3.6.1.2.1.10.18.6.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1LoopbackStatusEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1LoopbackStatusEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1LoopbackStatus", "1.3.6.1.2.1.10.18.6.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1Ds1ChannelNumberEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1Ds1ChannelNumberEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1Ds1ChannelNumber", "1.3.6.1.2.1.10.18.6.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1ChannelizationEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1ChannelizationEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1Channelization", "1.3.6.1.2.1.10.18.6.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1LineModeEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1LineModeEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1LineMode", "1.3.6.1.2.1.10.18.6.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1LineBuildOutEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1LineBuildOutEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1LineBuildOut", "1.3.6.1.2.1.10.18.6.1.22", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1LineImpedanceEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1LineImpedanceEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1LineImpedance", "1.3.6.1.2.1.10.18.6.1.23", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx1CurrentTableEnt extends MIBEntry<DS1MIBDef>
        {
            public final Dsx1CurrentEntryEnt dsx1CurrentEntry;

            private Dsx1CurrentTableEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
            {
                super(mib, parent, "dsx1CurrentTable", "1.3.6.1.2.1.10.18.7", false, true, false, false);
                this.dsx1CurrentEntry = new Dsx1CurrentEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx1CurrentEntry
                };
            }
            public static final class Dsx1CurrentEntryEnt extends MIBEntry<DS1MIBDef>
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

                private Dsx1CurrentEntryEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
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
                public static final class Dsx1CurrentIndexEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1CurrentIndexEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentIndex", "1.3.6.1.2.1.10.18.7.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1CurrentESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentESs", "1.3.6.1.2.1.10.18.7.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentSESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1CurrentSESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentSESs", "1.3.6.1.2.1.10.18.7.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentSEFSsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1CurrentSEFSsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentSEFSs", "1.3.6.1.2.1.10.18.7.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentUASsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1CurrentUASsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentUASs", "1.3.6.1.2.1.10.18.7.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentCSSsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1CurrentCSSsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentCSSs", "1.3.6.1.2.1.10.18.7.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentPCVsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1CurrentPCVsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentPCVs", "1.3.6.1.2.1.10.18.7.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentLESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1CurrentLESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentLESs", "1.3.6.1.2.1.10.18.7.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentBESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1CurrentBESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentBESs", "1.3.6.1.2.1.10.18.7.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentDMsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1CurrentDMsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentDMs", "1.3.6.1.2.1.10.18.7.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1CurrentLCVsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1CurrentLCVsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1CurrentLCVs", "1.3.6.1.2.1.10.18.7.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx1IntervalTableEnt extends MIBEntry<DS1MIBDef>
        {
            public final Dsx1IntervalEntryEnt dsx1IntervalEntry;

            private Dsx1IntervalTableEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
            {
                super(mib, parent, "dsx1IntervalTable", "1.3.6.1.2.1.10.18.8", false, true, false, false);
                this.dsx1IntervalEntry = new Dsx1IntervalEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx1IntervalEntry
                };
            }
            public static final class Dsx1IntervalEntryEnt extends MIBEntry<DS1MIBDef>
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

                public final Dsx1IntervalValidDataEnt dsx1IntervalValidData;

                private Dsx1IntervalEntryEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
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
                    this.dsx1IntervalValidData = new Dsx1IntervalValidDataEnt(mib, this);
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
                        this.dsx1IntervalLCVs,
                        this.dsx1IntervalValidData
                    };
                }
                public static final class Dsx1IntervalIndexEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1IntervalIndexEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalIndex", "1.3.6.1.2.1.10.18.8.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalNumberEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1IntervalNumberEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalNumber", "1.3.6.1.2.1.10.18.8.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1IntervalESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalESs", "1.3.6.1.2.1.10.18.8.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalSESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1IntervalSESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalSESs", "1.3.6.1.2.1.10.18.8.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalSEFSsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1IntervalSEFSsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalSEFSs", "1.3.6.1.2.1.10.18.8.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalUASsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1IntervalUASsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalUASs", "1.3.6.1.2.1.10.18.8.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalCSSsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1IntervalCSSsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalCSSs", "1.3.6.1.2.1.10.18.8.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalPCVsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1IntervalPCVsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalPCVs", "1.3.6.1.2.1.10.18.8.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalLESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1IntervalLESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalLESs", "1.3.6.1.2.1.10.18.8.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalBESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1IntervalBESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalBESs", "1.3.6.1.2.1.10.18.8.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalDMsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1IntervalDMsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalDMs", "1.3.6.1.2.1.10.18.8.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalLCVsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1IntervalLCVsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalLCVs", "1.3.6.1.2.1.10.18.8.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1IntervalValidDataEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1IntervalValidDataEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1IntervalValidData", "1.3.6.1.2.1.10.18.8.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx1TotalTableEnt extends MIBEntry<DS1MIBDef>
        {
            public final Dsx1TotalEntryEnt dsx1TotalEntry;

            private Dsx1TotalTableEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
            {
                super(mib, parent, "dsx1TotalTable", "1.3.6.1.2.1.10.18.9", false, true, false, false);
                this.dsx1TotalEntry = new Dsx1TotalEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx1TotalEntry
                };
            }
            public static final class Dsx1TotalEntryEnt extends MIBEntry<DS1MIBDef>
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

                private Dsx1TotalEntryEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
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
                public static final class Dsx1TotalIndexEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1TotalIndexEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalIndex", "1.3.6.1.2.1.10.18.9.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1TotalESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalESs", "1.3.6.1.2.1.10.18.9.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalSESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1TotalSESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalSESs", "1.3.6.1.2.1.10.18.9.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalSEFSsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1TotalSEFSsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalSEFSs", "1.3.6.1.2.1.10.18.9.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalUASsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1TotalUASsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalUASs", "1.3.6.1.2.1.10.18.9.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalCSSsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1TotalCSSsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalCSSs", "1.3.6.1.2.1.10.18.9.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalPCVsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1TotalPCVsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalPCVs", "1.3.6.1.2.1.10.18.9.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalLESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1TotalLESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalLESs", "1.3.6.1.2.1.10.18.9.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalBESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1TotalBESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalBESs", "1.3.6.1.2.1.10.18.9.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalDMsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1TotalDMsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalDMs", "1.3.6.1.2.1.10.18.9.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1TotalLCVsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1TotalLCVsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1TotalLCVs", "1.3.6.1.2.1.10.18.9.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx1ChanMappingTableEnt extends MIBEntry<DS1MIBDef>
        {
            public final Dsx1ChanMappingEntryEnt dsx1ChanMappingEntry;

            private Dsx1ChanMappingTableEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
            {
                super(mib, parent, "dsx1ChanMappingTable", "1.3.6.1.2.1.10.18.16", false, true, false, false);
                this.dsx1ChanMappingEntry = new Dsx1ChanMappingEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx1ChanMappingEntry
                };
            }
            public static final class Dsx1ChanMappingEntryEnt extends MIBEntry<DS1MIBDef>
            {
                public final Dsx1ChanMappedIfIndexEnt dsx1ChanMappedIfIndex;

                private Dsx1ChanMappingEntryEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                {
                    super(mib, parent, "dsx1ChanMappingEntry", "1.3.6.1.2.1.10.18.16.1", false, false, false, true);
                    this.dsx1ChanMappedIfIndex = new Dsx1ChanMappedIfIndexEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx1ChanMappedIfIndex
                    };
                }
                public static final class Dsx1ChanMappedIfIndexEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1ChanMappedIfIndexEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1ChanMappedIfIndex", "1.3.6.1.2.1.10.18.16.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx1FarEndCurrentTableEnt extends MIBEntry<DS1MIBDef>
        {
            public final Dsx1FarEndCurrentEntryEnt dsx1FarEndCurrentEntry;

            private Dsx1FarEndCurrentTableEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
            {
                super(mib, parent, "dsx1FarEndCurrentTable", "1.3.6.1.2.1.10.18.10", false, true, false, false);
                this.dsx1FarEndCurrentEntry = new Dsx1FarEndCurrentEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx1FarEndCurrentEntry
                };
            }
            public static final class Dsx1FarEndCurrentEntryEnt extends MIBEntry<DS1MIBDef>
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

                public final Dsx1FarEndInvalidIntervalsEnt dsx1FarEndInvalidIntervals;

                private Dsx1FarEndCurrentEntryEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
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
                    this.dsx1FarEndInvalidIntervals = new Dsx1FarEndInvalidIntervalsEnt(mib, this);
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
                        this.dsx1FarEndCurrentDMs,
                        this.dsx1FarEndInvalidIntervals
                    };
                }
                public static final class Dsx1FarEndCurrentIndexEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndCurrentIndexEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentIndex", "1.3.6.1.2.1.10.18.10.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTimeElapsedEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndTimeElapsedEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTimeElapsed", "1.3.6.1.2.1.10.18.10.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndValidIntervalsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndValidIntervalsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndValidIntervals", "1.3.6.1.2.1.10.18.10.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndCurrentESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentESs", "1.3.6.1.2.1.10.18.10.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentSESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndCurrentSESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentSESs", "1.3.6.1.2.1.10.18.10.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentSEFSsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndCurrentSEFSsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentSEFSs", "1.3.6.1.2.1.10.18.10.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentUASsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndCurrentUASsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentUASs", "1.3.6.1.2.1.10.18.10.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentCSSsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndCurrentCSSsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentCSSs", "1.3.6.1.2.1.10.18.10.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentLESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndCurrentLESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentLESs", "1.3.6.1.2.1.10.18.10.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentPCVsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndCurrentPCVsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentPCVs", "1.3.6.1.2.1.10.18.10.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentBESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndCurrentBESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentBESs", "1.3.6.1.2.1.10.18.10.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndCurrentDMsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndCurrentDMsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndCurrentDMs", "1.3.6.1.2.1.10.18.10.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndInvalidIntervalsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndInvalidIntervalsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndInvalidIntervals", "1.3.6.1.2.1.10.18.10.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx1FarEndIntervalTableEnt extends MIBEntry<DS1MIBDef>
        {
            public final Dsx1FarEndIntervalEntryEnt dsx1FarEndIntervalEntry;

            private Dsx1FarEndIntervalTableEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
            {
                super(mib, parent, "dsx1FarEndIntervalTable", "1.3.6.1.2.1.10.18.11", false, true, false, false);
                this.dsx1FarEndIntervalEntry = new Dsx1FarEndIntervalEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx1FarEndIntervalEntry
                };
            }
            public static final class Dsx1FarEndIntervalEntryEnt extends MIBEntry<DS1MIBDef>
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

                public final Dsx1FarEndIntervalValidDataEnt dsx1FarEndIntervalValidData;

                private Dsx1FarEndIntervalEntryEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
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
                    this.dsx1FarEndIntervalValidData = new Dsx1FarEndIntervalValidDataEnt(mib, this);
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
                        this.dsx1FarEndIntervalDMs,
                        this.dsx1FarEndIntervalValidData
                    };
                }
                public static final class Dsx1FarEndIntervalIndexEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndIntervalIndexEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalIndex", "1.3.6.1.2.1.10.18.11.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalNumberEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndIntervalNumberEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalNumber", "1.3.6.1.2.1.10.18.11.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndIntervalESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalESs", "1.3.6.1.2.1.10.18.11.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalSESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndIntervalSESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalSESs", "1.3.6.1.2.1.10.18.11.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalSEFSsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndIntervalSEFSsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalSEFSs", "1.3.6.1.2.1.10.18.11.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalUASsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndIntervalUASsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalUASs", "1.3.6.1.2.1.10.18.11.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalCSSsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndIntervalCSSsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalCSSs", "1.3.6.1.2.1.10.18.11.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalLESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndIntervalLESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalLESs", "1.3.6.1.2.1.10.18.11.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalPCVsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndIntervalPCVsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalPCVs", "1.3.6.1.2.1.10.18.11.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalBESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndIntervalBESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalBESs", "1.3.6.1.2.1.10.18.11.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalDMsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndIntervalDMsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalDMs", "1.3.6.1.2.1.10.18.11.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndIntervalValidDataEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndIntervalValidDataEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndIntervalValidData", "1.3.6.1.2.1.10.18.11.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx1FarEndTotalTableEnt extends MIBEntry<DS1MIBDef>
        {
            public final Dsx1FarEndTotalEntryEnt dsx1FarEndTotalEntry;

            private Dsx1FarEndTotalTableEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
            {
                super(mib, parent, "dsx1FarEndTotalTable", "1.3.6.1.2.1.10.18.12", false, true, false, false);
                this.dsx1FarEndTotalEntry = new Dsx1FarEndTotalEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx1FarEndTotalEntry
                };
            }
            public static final class Dsx1FarEndTotalEntryEnt extends MIBEntry<DS1MIBDef>
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

                private Dsx1FarEndTotalEntryEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
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
                public static final class Dsx1FarEndTotalIndexEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndTotalIndexEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalIndex", "1.3.6.1.2.1.10.18.12.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndTotalESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalESs", "1.3.6.1.2.1.10.18.12.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalSESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndTotalSESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalSESs", "1.3.6.1.2.1.10.18.12.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalSEFSsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndTotalSEFSsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalSEFSs", "1.3.6.1.2.1.10.18.12.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalUASsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndTotalUASsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalUASs", "1.3.6.1.2.1.10.18.12.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalCSSsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndTotalCSSsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalCSSs", "1.3.6.1.2.1.10.18.12.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalLESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndTotalLESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalLESs", "1.3.6.1.2.1.10.18.12.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalPCVsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndTotalPCVsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalPCVs", "1.3.6.1.2.1.10.18.12.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalBESsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndTotalBESsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalBESs", "1.3.6.1.2.1.10.18.12.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FarEndTotalDMsEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FarEndTotalDMsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FarEndTotalDMs", "1.3.6.1.2.1.10.18.12.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx1FracTableEnt extends MIBEntry<DS1MIBDef>
        {
            public final Dsx1FracEntryEnt dsx1FracEntry;

            private Dsx1FracTableEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
            {
                super(mib, parent, "dsx1FracTable", "1.3.6.1.2.1.10.18.13", false, true, false, false);
                this.dsx1FracEntry = new Dsx1FracEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx1FracEntry
                };
            }
            public static final class Dsx1FracEntryEnt extends MIBEntry<DS1MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dsx1FracIndexEnt dsx1FracIndex;

                /** read-only since originally an
SMIv1 index*/
                public final Dsx1FracNumberEnt dsx1FracNumber;

                public final Dsx1FracIfIndexEnt dsx1FracIfIndex;

                private Dsx1FracEntryEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
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
                public static final class Dsx1FracIndexEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FracIndexEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FracIndex", "1.3.6.1.2.1.10.18.13.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FracNumberEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FracNumberEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FracNumber", "1.3.6.1.2.1.10.18.13.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx1FracIfIndexEnt extends MIBEntry<DS1MIBDef>
                {
                    private Dsx1FracIfIndexEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "dsx1FracIfIndex", "1.3.6.1.2.1.10.18.13.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Ds1TrapsEnt extends MIBEntry<DS1MIBDef>
        {
            private Ds1TrapsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
            {
                super(mib, parent, "ds1Traps", "1.3.6.1.2.1.10.18.15", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Ds1ConformanceEnt extends MIBEntry<DS1MIBDef>
        {
            public final Ds1GroupsEnt ds1Groups;

            public final Ds1CompliancesEnt ds1Compliances;

            private Ds1ConformanceEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
            {
                super(mib, parent, "ds1Conformance", "1.3.6.1.2.1.10.18.14", false, false, false, false);
                this.ds1Groups = new Ds1GroupsEnt(mib, this);
                this.ds1Compliances = new Ds1CompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ds1Groups,
                    this.ds1Compliances
                };
            }
            public static final class Ds1GroupsEnt extends MIBEntry<DS1MIBDef>
            {
                /** units of conformance*/
                public final Ds1NearEndConfigGroupEnt ds1NearEndConfigGroup;

                public final Ds1NearEndStatisticsGroupEnt ds1NearEndStatisticsGroup;

                public final Ds1FarEndGroupEnt ds1FarEndGroup;

                public final Ds1DeprecatedGroupEnt ds1DeprecatedGroup;

                public final Ds1NearEndOptionalConfigGroupEnt ds1NearEndOptionalConfigGroup;

                public final Ds1DS2GroupEnt ds1DS2Group;

                public final Ds1TransStatsGroupEnt ds1TransStatsGroup;

                public final Ds1NearEndOptionalTrapGroupEnt ds1NearEndOptionalTrapGroup;

                public final Ds1ChanMappingGroupEnt ds1ChanMappingGroup;

                public final Ds1NearEndConfigurationGroupEnt ds1NearEndConfigurationGroup;

                public final Ds1NearEndCfgGroupEnt ds1NearEndCfgGroup;

                public final Ds1NearEndStatGroupEnt ds1NearEndStatGroup;

                public final Ds1FarEndNGroupEnt ds1FarEndNGroup;

                private Ds1GroupsEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                {
                    super(mib, parent, "ds1Groups", "1.3.6.1.2.1.10.18.14.1", false, false, false, false);
                    this.ds1NearEndConfigGroup = new Ds1NearEndConfigGroupEnt(mib, this);
                    this.ds1NearEndStatisticsGroup = new Ds1NearEndStatisticsGroupEnt(mib, this);
                    this.ds1FarEndGroup = new Ds1FarEndGroupEnt(mib, this);
                    this.ds1DeprecatedGroup = new Ds1DeprecatedGroupEnt(mib, this);
                    this.ds1NearEndOptionalConfigGroup = new Ds1NearEndOptionalConfigGroupEnt(mib, this);
                    this.ds1DS2Group = new Ds1DS2GroupEnt(mib, this);
                    this.ds1TransStatsGroup = new Ds1TransStatsGroupEnt(mib, this);
                    this.ds1NearEndOptionalTrapGroup = new Ds1NearEndOptionalTrapGroupEnt(mib, this);
                    this.ds1ChanMappingGroup = new Ds1ChanMappingGroupEnt(mib, this);
                    this.ds1NearEndConfigurationGroup = new Ds1NearEndConfigurationGroupEnt(mib, this);
                    this.ds1NearEndCfgGroup = new Ds1NearEndCfgGroupEnt(mib, this);
                    this.ds1NearEndStatGroup = new Ds1NearEndStatGroupEnt(mib, this);
                    this.ds1FarEndNGroup = new Ds1FarEndNGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ds1NearEndConfigGroup,
                        this.ds1NearEndStatisticsGroup,
                        this.ds1FarEndGroup,
                        this.ds1DeprecatedGroup,
                        this.ds1NearEndOptionalConfigGroup,
                        this.ds1DS2Group,
                        this.ds1TransStatsGroup,
                        this.ds1NearEndOptionalTrapGroup,
                        this.ds1ChanMappingGroup,
                        this.ds1NearEndConfigurationGroup,
                        this.ds1NearEndCfgGroup,
                        this.ds1NearEndStatGroup,
                        this.ds1FarEndNGroup
                    };
                }
                public static final class Ds1NearEndConfigGroupEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1NearEndConfigGroupEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1NearEndConfigGroup", "1.3.6.1.2.1.10.18.14.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1NearEndStatisticsGroupEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1NearEndStatisticsGroupEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1NearEndStatisticsGroup", "1.3.6.1.2.1.10.18.14.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1FarEndGroupEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1FarEndGroupEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1FarEndGroup", "1.3.6.1.2.1.10.18.14.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1DeprecatedGroupEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1DeprecatedGroupEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1DeprecatedGroup", "1.3.6.1.2.1.10.18.14.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1NearEndOptionalConfigGroupEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1NearEndOptionalConfigGroupEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1NearEndOptionalConfigGroup", "1.3.6.1.2.1.10.18.14.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1DS2GroupEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1DS2GroupEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1DS2Group", "1.3.6.1.2.1.10.18.14.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1TransStatsGroupEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1TransStatsGroupEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1TransStatsGroup", "1.3.6.1.2.1.10.18.14.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1NearEndOptionalTrapGroupEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1NearEndOptionalTrapGroupEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1NearEndOptionalTrapGroup", "1.3.6.1.2.1.10.18.14.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1ChanMappingGroupEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1ChanMappingGroupEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1ChanMappingGroup", "1.3.6.1.2.1.10.18.14.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1NearEndConfigurationGroupEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1NearEndConfigurationGroupEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1NearEndConfigurationGroup", "1.3.6.1.2.1.10.18.14.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1NearEndCfgGroupEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1NearEndCfgGroupEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1NearEndCfgGroup", "1.3.6.1.2.1.10.18.14.1.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1NearEndStatGroupEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1NearEndStatGroupEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1NearEndStatGroup", "1.3.6.1.2.1.10.18.14.1.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1FarEndNGroupEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1FarEndNGroupEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1FarEndNGroup", "1.3.6.1.2.1.10.18.14.1.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Ds1CompliancesEnt extends MIBEntry<DS1MIBDef>
            {
                /** compliance statements*/
                public final Ds1ComplianceEnt ds1Compliance;

                public final Ds1MibT1PriComplianceEnt ds1MibT1PriCompliance;

                public final Ds1MibE1PriComplianceEnt ds1MibE1PriCompliance;

                public final Ds1Ds2ComplianceEnt ds1Ds2Compliance;

                public final Ds1NComplianceEnt ds1NCompliance;

                public final Ds1MibT1PriNComplianceEnt ds1MibT1PriNCompliance;

                public final Ds1MibE1PriNComplianceEnt ds1MibE1PriNCompliance;

                public final Ds1J1ComplianceEnt ds1J1Compliance;

                public final Ds1NMibT1PriNComplianceEnt ds1NMibT1PriNCompliance;

                public final Ds1NMibE1PriNComplianceEnt ds1NMibE1PriNCompliance;

                private Ds1CompliancesEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                {
                    super(mib, parent, "ds1Compliances", "1.3.6.1.2.1.10.18.14.2", false, false, false, false);
                    this.ds1Compliance = new Ds1ComplianceEnt(mib, this);
                    this.ds1MibT1PriCompliance = new Ds1MibT1PriComplianceEnt(mib, this);
                    this.ds1MibE1PriCompliance = new Ds1MibE1PriComplianceEnt(mib, this);
                    this.ds1Ds2Compliance = new Ds1Ds2ComplianceEnt(mib, this);
                    this.ds1NCompliance = new Ds1NComplianceEnt(mib, this);
                    this.ds1MibT1PriNCompliance = new Ds1MibT1PriNComplianceEnt(mib, this);
                    this.ds1MibE1PriNCompliance = new Ds1MibE1PriNComplianceEnt(mib, this);
                    this.ds1J1Compliance = new Ds1J1ComplianceEnt(mib, this);
                    this.ds1NMibT1PriNCompliance = new Ds1NMibT1PriNComplianceEnt(mib, this);
                    this.ds1NMibE1PriNCompliance = new Ds1NMibE1PriNComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ds1Compliance,
                        this.ds1MibT1PriCompliance,
                        this.ds1MibE1PriCompliance,
                        this.ds1Ds2Compliance,
                        this.ds1NCompliance,
                        this.ds1MibT1PriNCompliance,
                        this.ds1MibE1PriNCompliance,
                        this.ds1J1Compliance,
                        this.ds1NMibT1PriNCompliance,
                        this.ds1NMibE1PriNCompliance
                    };
                }
                public static final class Ds1ComplianceEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1ComplianceEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1Compliance", "1.3.6.1.2.1.10.18.14.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1MibT1PriComplianceEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1MibT1PriComplianceEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1MibT1PriCompliance", "1.3.6.1.2.1.10.18.14.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1MibE1PriComplianceEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1MibE1PriComplianceEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1MibE1PriCompliance", "1.3.6.1.2.1.10.18.14.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1Ds2ComplianceEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1Ds2ComplianceEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1Ds2Compliance", "1.3.6.1.2.1.10.18.14.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1NComplianceEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1NComplianceEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1NCompliance", "1.3.6.1.2.1.10.18.14.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1MibT1PriNComplianceEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1MibT1PriNComplianceEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1MibT1PriNCompliance", "1.3.6.1.2.1.10.18.14.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1MibE1PriNComplianceEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1MibE1PriNComplianceEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1MibE1PriNCompliance", "1.3.6.1.2.1.10.18.14.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1J1ComplianceEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1J1ComplianceEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1J1Compliance", "1.3.6.1.2.1.10.18.14.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1NMibT1PriNComplianceEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1NMibT1PriNComplianceEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1NMibT1PriNCompliance", "1.3.6.1.2.1.10.18.14.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds1NMibE1PriNComplianceEnt extends MIBEntry<DS1MIBDef>
                {
                    private Ds1NMibE1PriNComplianceEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
                    {
                        super(mib, parent, "ds1NMibE1PriNCompliance", "1.3.6.1.2.1.10.18.14.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class Dsx1LineStatusChangeEnt extends MIBEntry<DS1MIBDef>
    {
        private Dsx1LineStatusChangeEnt(DS1MIBDef mib, MIBEntry<DS1MIBDef> parent)
        {
            super(mib, parent, "dsx1LineStatusChange", "1.3.6.1.2.1.10.18.15.0.1", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
