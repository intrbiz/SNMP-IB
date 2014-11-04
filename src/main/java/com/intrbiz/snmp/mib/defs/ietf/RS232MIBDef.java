package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class RS232MIBDef extends MIB
{
    public static final RS232MIBDef RS232MIB = new RS232MIBDef();

    static { MIBs.getInstance().registerMIB(RS232MIBDef.RS232MIB); }

    public final Rs232Ent rs232;

    private RS232MIBDef()
    {
        super("RS-232-MIB");
        this.rs232 = new Rs232Ent(this, null);
        this.entries = new MIBEntry<?>[] {
            this.rs232
        };
    }

    public static final class Rs232Ent extends MIBEntry<RS232MIBDef>
    {
        /** Generic RS-232-like information*/
        public final Rs232NumberEnt rs232Number;

        /** RS-232-like General Port Table*/
        public final Rs232PortTableEnt rs232PortTable;

        /** RS-232-like Asynchronous Port Table*/
        public final Rs232AsyncPortTableEnt rs232AsyncPortTable;

        /** RS-232-like Synchronous Port Table*/
        public final Rs232SyncPortTableEnt rs232SyncPortTable;

        /** Input Signal Table*/
        public final Rs232InSigTableEnt rs232InSigTable;

        /** Output Signal Table*/
        public final Rs232OutSigTableEnt rs232OutSigTable;

        /** conformance information*/
        public final Rs232ConformanceEnt rs232Conformance;

        private Rs232Ent(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
        {
            super(mib, parent, "rs232", "1.3.6.1.2.1.10.33", false, false, false, false);
            this.rs232Number = new Rs232NumberEnt(mib, this);
            this.rs232PortTable = new Rs232PortTableEnt(mib, this);
            this.rs232AsyncPortTable = new Rs232AsyncPortTableEnt(mib, this);
            this.rs232SyncPortTable = new Rs232SyncPortTableEnt(mib, this);
            this.rs232InSigTable = new Rs232InSigTableEnt(mib, this);
            this.rs232OutSigTable = new Rs232OutSigTableEnt(mib, this);
            this.rs232Conformance = new Rs232ConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.rs232Number,
                this.rs232PortTable,
                this.rs232AsyncPortTable,
                this.rs232SyncPortTable,
                this.rs232InSigTable,
                this.rs232OutSigTable,
                this.rs232Conformance
            };
        }
        public static final class Rs232NumberEnt extends MIBEntry<RS232MIBDef>
        {
            private Rs232NumberEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
            {
                super(mib, parent, "rs232Number", "1.3.6.1.2.1.10.33.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Rs232PortTableEnt extends MIBEntry<RS232MIBDef>
        {
            public final Rs232PortEntryEnt rs232PortEntry;

            private Rs232PortTableEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
            {
                super(mib, parent, "rs232PortTable", "1.3.6.1.2.1.10.33.2", false, true, false, false);
                this.rs232PortEntry = new Rs232PortEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rs232PortEntry
                };
            }
            public static final class Rs232PortEntryEnt extends MIBEntry<RS232MIBDef>
            {
                public final Rs232PortIndexEnt rs232PortIndex;

                public final Rs232PortTypeEnt rs232PortType;

                public final Rs232PortInSigNumberEnt rs232PortInSigNumber;

                public final Rs232PortOutSigNumberEnt rs232PortOutSigNumber;

                public final Rs232PortInSpeedEnt rs232PortInSpeed;

                public final Rs232PortOutSpeedEnt rs232PortOutSpeed;

                public final Rs232PortInFlowTypeEnt rs232PortInFlowType;

                public final Rs232PortOutFlowTypeEnt rs232PortOutFlowType;

                private Rs232PortEntryEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                {
                    super(mib, parent, "rs232PortEntry", "1.3.6.1.2.1.10.33.2.1", false, false, false, true);
                    this.rs232PortIndex = new Rs232PortIndexEnt(mib, this);
                    this.rs232PortType = new Rs232PortTypeEnt(mib, this);
                    this.rs232PortInSigNumber = new Rs232PortInSigNumberEnt(mib, this);
                    this.rs232PortOutSigNumber = new Rs232PortOutSigNumberEnt(mib, this);
                    this.rs232PortInSpeed = new Rs232PortInSpeedEnt(mib, this);
                    this.rs232PortOutSpeed = new Rs232PortOutSpeedEnt(mib, this);
                    this.rs232PortInFlowType = new Rs232PortInFlowTypeEnt(mib, this);
                    this.rs232PortOutFlowType = new Rs232PortOutFlowTypeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rs232PortIndex,
                        this.rs232PortType,
                        this.rs232PortInSigNumber,
                        this.rs232PortOutSigNumber,
                        this.rs232PortInSpeed,
                        this.rs232PortOutSpeed,
                        this.rs232PortInFlowType,
                        this.rs232PortOutFlowType
                    };
                }
                public static final class Rs232PortIndexEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232PortIndexEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232PortIndex", "1.3.6.1.2.1.10.33.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232PortTypeEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232PortTypeEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232PortType", "1.3.6.1.2.1.10.33.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232PortInSigNumberEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232PortInSigNumberEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232PortInSigNumber", "1.3.6.1.2.1.10.33.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232PortOutSigNumberEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232PortOutSigNumberEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232PortOutSigNumber", "1.3.6.1.2.1.10.33.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232PortInSpeedEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232PortInSpeedEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232PortInSpeed", "1.3.6.1.2.1.10.33.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232PortOutSpeedEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232PortOutSpeedEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232PortOutSpeed", "1.3.6.1.2.1.10.33.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232PortInFlowTypeEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232PortInFlowTypeEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232PortInFlowType", "1.3.6.1.2.1.10.33.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232PortOutFlowTypeEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232PortOutFlowTypeEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232PortOutFlowType", "1.3.6.1.2.1.10.33.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Rs232AsyncPortTableEnt extends MIBEntry<RS232MIBDef>
        {
            public final Rs232AsyncPortEntryEnt rs232AsyncPortEntry;

            private Rs232AsyncPortTableEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
            {
                super(mib, parent, "rs232AsyncPortTable", "1.3.6.1.2.1.10.33.3", false, true, false, false);
                this.rs232AsyncPortEntry = new Rs232AsyncPortEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rs232AsyncPortEntry
                };
            }
            public static final class Rs232AsyncPortEntryEnt extends MIBEntry<RS232MIBDef>
            {
                public final Rs232AsyncPortIndexEnt rs232AsyncPortIndex;

                public final Rs232AsyncPortBitsEnt rs232AsyncPortBits;

                public final Rs232AsyncPortStopBitsEnt rs232AsyncPortStopBits;

                public final Rs232AsyncPortParityEnt rs232AsyncPortParity;

                public final Rs232AsyncPortAutobaudEnt rs232AsyncPortAutobaud;

                public final Rs232AsyncPortParityErrsEnt rs232AsyncPortParityErrs;

                public final Rs232AsyncPortFramingErrsEnt rs232AsyncPortFramingErrs;

                public final Rs232AsyncPortOverrunErrsEnt rs232AsyncPortOverrunErrs;

                private Rs232AsyncPortEntryEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                {
                    super(mib, parent, "rs232AsyncPortEntry", "1.3.6.1.2.1.10.33.3.1", false, false, false, true);
                    this.rs232AsyncPortIndex = new Rs232AsyncPortIndexEnt(mib, this);
                    this.rs232AsyncPortBits = new Rs232AsyncPortBitsEnt(mib, this);
                    this.rs232AsyncPortStopBits = new Rs232AsyncPortStopBitsEnt(mib, this);
                    this.rs232AsyncPortParity = new Rs232AsyncPortParityEnt(mib, this);
                    this.rs232AsyncPortAutobaud = new Rs232AsyncPortAutobaudEnt(mib, this);
                    this.rs232AsyncPortParityErrs = new Rs232AsyncPortParityErrsEnt(mib, this);
                    this.rs232AsyncPortFramingErrs = new Rs232AsyncPortFramingErrsEnt(mib, this);
                    this.rs232AsyncPortOverrunErrs = new Rs232AsyncPortOverrunErrsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rs232AsyncPortIndex,
                        this.rs232AsyncPortBits,
                        this.rs232AsyncPortStopBits,
                        this.rs232AsyncPortParity,
                        this.rs232AsyncPortAutobaud,
                        this.rs232AsyncPortParityErrs,
                        this.rs232AsyncPortFramingErrs,
                        this.rs232AsyncPortOverrunErrs
                    };
                }
                public static final class Rs232AsyncPortIndexEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232AsyncPortIndexEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232AsyncPortIndex", "1.3.6.1.2.1.10.33.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232AsyncPortBitsEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232AsyncPortBitsEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232AsyncPortBits", "1.3.6.1.2.1.10.33.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232AsyncPortStopBitsEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232AsyncPortStopBitsEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232AsyncPortStopBits", "1.3.6.1.2.1.10.33.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232AsyncPortParityEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232AsyncPortParityEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232AsyncPortParity", "1.3.6.1.2.1.10.33.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232AsyncPortAutobaudEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232AsyncPortAutobaudEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232AsyncPortAutobaud", "1.3.6.1.2.1.10.33.3.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232AsyncPortParityErrsEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232AsyncPortParityErrsEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232AsyncPortParityErrs", "1.3.6.1.2.1.10.33.3.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232AsyncPortFramingErrsEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232AsyncPortFramingErrsEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232AsyncPortFramingErrs", "1.3.6.1.2.1.10.33.3.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232AsyncPortOverrunErrsEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232AsyncPortOverrunErrsEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232AsyncPortOverrunErrs", "1.3.6.1.2.1.10.33.3.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Rs232SyncPortTableEnt extends MIBEntry<RS232MIBDef>
        {
            public final Rs232SyncPortEntryEnt rs232SyncPortEntry;

            private Rs232SyncPortTableEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
            {
                super(mib, parent, "rs232SyncPortTable", "1.3.6.1.2.1.10.33.4", false, true, false, false);
                this.rs232SyncPortEntry = new Rs232SyncPortEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rs232SyncPortEntry
                };
            }
            public static final class Rs232SyncPortEntryEnt extends MIBEntry<RS232MIBDef>
            {
                public final Rs232SyncPortIndexEnt rs232SyncPortIndex;

                public final Rs232SyncPortClockSourceEnt rs232SyncPortClockSource;

                public final Rs232SyncPortFrameCheckErrsEnt rs232SyncPortFrameCheckErrs;

                public final Rs232SyncPortTransmitUnderrunErrsEnt rs232SyncPortTransmitUnderrunErrs;

                public final Rs232SyncPortReceiveOverrunErrsEnt rs232SyncPortReceiveOverrunErrs;

                public final Rs232SyncPortInterruptedFramesEnt rs232SyncPortInterruptedFrames;

                public final Rs232SyncPortAbortedFramesEnt rs232SyncPortAbortedFrames;

                public final Rs232SyncPortRoleEnt rs232SyncPortRole;

                public final Rs232SyncPortEncodingEnt rs232SyncPortEncoding;

                public final Rs232SyncPortRTSControlEnt rs232SyncPortRTSControl;

                public final Rs232SyncPortRTSCTSDelayEnt rs232SyncPortRTSCTSDelay;

                public final Rs232SyncPortModeEnt rs232SyncPortMode;

                public final Rs232SyncPortIdlePatternEnt rs232SyncPortIdlePattern;

                public final Rs232SyncPortMinFlagsEnt rs232SyncPortMinFlags;

                private Rs232SyncPortEntryEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                {
                    super(mib, parent, "rs232SyncPortEntry", "1.3.6.1.2.1.10.33.4.1", false, false, false, true);
                    this.rs232SyncPortIndex = new Rs232SyncPortIndexEnt(mib, this);
                    this.rs232SyncPortClockSource = new Rs232SyncPortClockSourceEnt(mib, this);
                    this.rs232SyncPortFrameCheckErrs = new Rs232SyncPortFrameCheckErrsEnt(mib, this);
                    this.rs232SyncPortTransmitUnderrunErrs = new Rs232SyncPortTransmitUnderrunErrsEnt(mib, this);
                    this.rs232SyncPortReceiveOverrunErrs = new Rs232SyncPortReceiveOverrunErrsEnt(mib, this);
                    this.rs232SyncPortInterruptedFrames = new Rs232SyncPortInterruptedFramesEnt(mib, this);
                    this.rs232SyncPortAbortedFrames = new Rs232SyncPortAbortedFramesEnt(mib, this);
                    this.rs232SyncPortRole = new Rs232SyncPortRoleEnt(mib, this);
                    this.rs232SyncPortEncoding = new Rs232SyncPortEncodingEnt(mib, this);
                    this.rs232SyncPortRTSControl = new Rs232SyncPortRTSControlEnt(mib, this);
                    this.rs232SyncPortRTSCTSDelay = new Rs232SyncPortRTSCTSDelayEnt(mib, this);
                    this.rs232SyncPortMode = new Rs232SyncPortModeEnt(mib, this);
                    this.rs232SyncPortIdlePattern = new Rs232SyncPortIdlePatternEnt(mib, this);
                    this.rs232SyncPortMinFlags = new Rs232SyncPortMinFlagsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rs232SyncPortIndex,
                        this.rs232SyncPortClockSource,
                        this.rs232SyncPortFrameCheckErrs,
                        this.rs232SyncPortTransmitUnderrunErrs,
                        this.rs232SyncPortReceiveOverrunErrs,
                        this.rs232SyncPortInterruptedFrames,
                        this.rs232SyncPortAbortedFrames,
                        this.rs232SyncPortRole,
                        this.rs232SyncPortEncoding,
                        this.rs232SyncPortRTSControl,
                        this.rs232SyncPortRTSCTSDelay,
                        this.rs232SyncPortMode,
                        this.rs232SyncPortIdlePattern,
                        this.rs232SyncPortMinFlags
                    };
                }
                public static final class Rs232SyncPortIndexEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232SyncPortIndexEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232SyncPortIndex", "1.3.6.1.2.1.10.33.4.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232SyncPortClockSourceEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232SyncPortClockSourceEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232SyncPortClockSource", "1.3.6.1.2.1.10.33.4.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232SyncPortFrameCheckErrsEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232SyncPortFrameCheckErrsEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232SyncPortFrameCheckErrs", "1.3.6.1.2.1.10.33.4.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232SyncPortTransmitUnderrunErrsEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232SyncPortTransmitUnderrunErrsEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232SyncPortTransmitUnderrunErrs", "1.3.6.1.2.1.10.33.4.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232SyncPortReceiveOverrunErrsEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232SyncPortReceiveOverrunErrsEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232SyncPortReceiveOverrunErrs", "1.3.6.1.2.1.10.33.4.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232SyncPortInterruptedFramesEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232SyncPortInterruptedFramesEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232SyncPortInterruptedFrames", "1.3.6.1.2.1.10.33.4.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232SyncPortAbortedFramesEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232SyncPortAbortedFramesEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232SyncPortAbortedFrames", "1.3.6.1.2.1.10.33.4.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232SyncPortRoleEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232SyncPortRoleEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232SyncPortRole", "1.3.6.1.2.1.10.33.4.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232SyncPortEncodingEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232SyncPortEncodingEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232SyncPortEncoding", "1.3.6.1.2.1.10.33.4.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232SyncPortRTSControlEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232SyncPortRTSControlEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232SyncPortRTSControl", "1.3.6.1.2.1.10.33.4.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232SyncPortRTSCTSDelayEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232SyncPortRTSCTSDelayEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232SyncPortRTSCTSDelay", "1.3.6.1.2.1.10.33.4.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232SyncPortModeEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232SyncPortModeEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232SyncPortMode", "1.3.6.1.2.1.10.33.4.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232SyncPortIdlePatternEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232SyncPortIdlePatternEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232SyncPortIdlePattern", "1.3.6.1.2.1.10.33.4.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232SyncPortMinFlagsEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232SyncPortMinFlagsEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232SyncPortMinFlags", "1.3.6.1.2.1.10.33.4.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Rs232InSigTableEnt extends MIBEntry<RS232MIBDef>
        {
            public final Rs232InSigEntryEnt rs232InSigEntry;

            private Rs232InSigTableEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
            {
                super(mib, parent, "rs232InSigTable", "1.3.6.1.2.1.10.33.5", false, true, false, false);
                this.rs232InSigEntry = new Rs232InSigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rs232InSigEntry
                };
            }
            public static final class Rs232InSigEntryEnt extends MIBEntry<RS232MIBDef>
            {
                public final Rs232InSigPortIndexEnt rs232InSigPortIndex;

                public final Rs232InSigNameEnt rs232InSigName;

                public final Rs232InSigStateEnt rs232InSigState;

                public final Rs232InSigChangesEnt rs232InSigChanges;

                private Rs232InSigEntryEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                {
                    super(mib, parent, "rs232InSigEntry", "1.3.6.1.2.1.10.33.5.1", false, false, false, true);
                    this.rs232InSigPortIndex = new Rs232InSigPortIndexEnt(mib, this);
                    this.rs232InSigName = new Rs232InSigNameEnt(mib, this);
                    this.rs232InSigState = new Rs232InSigStateEnt(mib, this);
                    this.rs232InSigChanges = new Rs232InSigChangesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rs232InSigPortIndex,
                        this.rs232InSigName,
                        this.rs232InSigState,
                        this.rs232InSigChanges
                    };
                }
                public static final class Rs232InSigPortIndexEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232InSigPortIndexEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232InSigPortIndex", "1.3.6.1.2.1.10.33.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232InSigNameEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232InSigNameEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232InSigName", "1.3.6.1.2.1.10.33.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232InSigStateEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232InSigStateEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232InSigState", "1.3.6.1.2.1.10.33.5.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232InSigChangesEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232InSigChangesEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232InSigChanges", "1.3.6.1.2.1.10.33.5.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Rs232OutSigTableEnt extends MIBEntry<RS232MIBDef>
        {
            public final Rs232OutSigEntryEnt rs232OutSigEntry;

            private Rs232OutSigTableEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
            {
                super(mib, parent, "rs232OutSigTable", "1.3.6.1.2.1.10.33.6", false, true, false, false);
                this.rs232OutSigEntry = new Rs232OutSigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rs232OutSigEntry
                };
            }
            public static final class Rs232OutSigEntryEnt extends MIBEntry<RS232MIBDef>
            {
                public final Rs232OutSigPortIndexEnt rs232OutSigPortIndex;

                public final Rs232OutSigNameEnt rs232OutSigName;

                public final Rs232OutSigStateEnt rs232OutSigState;

                public final Rs232OutSigChangesEnt rs232OutSigChanges;

                private Rs232OutSigEntryEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                {
                    super(mib, parent, "rs232OutSigEntry", "1.3.6.1.2.1.10.33.6.1", false, false, false, true);
                    this.rs232OutSigPortIndex = new Rs232OutSigPortIndexEnt(mib, this);
                    this.rs232OutSigName = new Rs232OutSigNameEnt(mib, this);
                    this.rs232OutSigState = new Rs232OutSigStateEnt(mib, this);
                    this.rs232OutSigChanges = new Rs232OutSigChangesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rs232OutSigPortIndex,
                        this.rs232OutSigName,
                        this.rs232OutSigState,
                        this.rs232OutSigChanges
                    };
                }
                public static final class Rs232OutSigPortIndexEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232OutSigPortIndexEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232OutSigPortIndex", "1.3.6.1.2.1.10.33.6.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232OutSigNameEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232OutSigNameEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232OutSigName", "1.3.6.1.2.1.10.33.6.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232OutSigStateEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232OutSigStateEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232OutSigState", "1.3.6.1.2.1.10.33.6.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232OutSigChangesEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232OutSigChangesEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232OutSigChanges", "1.3.6.1.2.1.10.33.6.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Rs232ConformanceEnt extends MIBEntry<RS232MIBDef>
        {
            public final Rs232GroupsEnt rs232Groups;

            public final Rs232CompliancesEnt rs232Compliances;

            private Rs232ConformanceEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
            {
                super(mib, parent, "rs232Conformance", "1.3.6.1.2.1.10.33.7", false, false, false, false);
                this.rs232Groups = new Rs232GroupsEnt(mib, this);
                this.rs232Compliances = new Rs232CompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rs232Groups,
                    this.rs232Compliances
                };
            }
            public static final class Rs232GroupsEnt extends MIBEntry<RS232MIBDef>
            {
                /** units of conformance*/
                public final Rs232GroupEnt rs232Group;

                public final Rs232AsyncGroupEnt rs232AsyncGroup;

                public final Rs232SyncGroupEnt rs232SyncGroup;

                public final Rs232SyncSDLCGroupEnt rs232SyncSDLCGroup;

                private Rs232GroupsEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                {
                    super(mib, parent, "rs232Groups", "1.3.6.1.2.1.10.33.7.1", false, false, false, false);
                    this.rs232Group = new Rs232GroupEnt(mib, this);
                    this.rs232AsyncGroup = new Rs232AsyncGroupEnt(mib, this);
                    this.rs232SyncGroup = new Rs232SyncGroupEnt(mib, this);
                    this.rs232SyncSDLCGroup = new Rs232SyncSDLCGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rs232Group,
                        this.rs232AsyncGroup,
                        this.rs232SyncGroup,
                        this.rs232SyncSDLCGroup
                    };
                }
                public static final class Rs232GroupEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232GroupEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232Group", "1.3.6.1.2.1.10.33.7.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232AsyncGroupEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232AsyncGroupEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232AsyncGroup", "1.3.6.1.2.1.10.33.7.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232SyncGroupEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232SyncGroupEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232SyncGroup", "1.3.6.1.2.1.10.33.7.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rs232SyncSDLCGroupEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232SyncSDLCGroupEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232SyncSDLCGroup", "1.3.6.1.2.1.10.33.7.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Rs232CompliancesEnt extends MIBEntry<RS232MIBDef>
            {
                /** compliance statements*/
                public final Rs232ComplianceEnt rs232Compliance;

                private Rs232CompliancesEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                {
                    super(mib, parent, "rs232Compliances", "1.3.6.1.2.1.10.33.7.2", false, false, false, false);
                    this.rs232Compliance = new Rs232ComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rs232Compliance
                    };
                }
                public static final class Rs232ComplianceEnt extends MIBEntry<RS232MIBDef>
                {
                    private Rs232ComplianceEnt(RS232MIBDef mib, MIBEntry<RS232MIBDef> parent)
                    {
                        super(mib, parent, "rs232Compliance", "1.3.6.1.2.1.10.33.7.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
