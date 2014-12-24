package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class FLOWMETERMIBDef extends MIB
{
    public static final FLOWMETERMIBDef FLOWMETERMIB = new FLOWMETERMIBDef();

    /** October 25, 1999*/
    public final FlowMIBEnt flowMIB;

    private FLOWMETERMIBDef()
    {
        super("FLOW-METER-MIB");
        this.flowMIB = new FlowMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.flowMIB
        };
    }

    public static final class FlowMIBEnt extends MIBEntry<FLOWMETERMIBDef>
    {
        public final FlowControlEnt flowControl;

        public final FlowDataEnt flowData;

        public final FlowRulesEnt flowRules;

        public final FlowMIBConformanceEnt flowMIBConformance;

        private FlowMIBEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
        {
            super(mib, parent, "flowMIB", "1.3.6.1.2.1.40", false, false, false, false);
            this.flowControl = new FlowControlEnt(mib, this);
            this.flowData = new FlowDataEnt(mib, this);
            this.flowRules = new FlowRulesEnt(mib, this);
            this.flowMIBConformance = new FlowMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.flowControl,
                this.flowData,
                this.flowRules,
                this.flowMIBConformance
            };
        }
        public static final class FlowControlEnt extends MIBEntry<FLOWMETERMIBDef>
        {
            /** Control Group:  RuleSet Info Table*/
            public final FlowRuleSetInfoTableEnt flowRuleSetInfoTable;

            /** Control Group:  Interface Info Table*/
            public final FlowInterfaceTableEnt flowInterfaceTable;

            /** Control Group:  Meter Reader Info Table
Any meter reader wishing to collect data reliably for flowsshould first create a row in this table.  It should write thatrow's flowReaderLastTime object each time it starts a collectionpass through the flow table.
If a meter reader (MR) does not create a row in this table, e.g.because its MIB view [RFC2575] did not allow MR create access toflowReaderStatus, collection can still proceed but the meter willnot be aware of meter reader MR.  This could lead the meter torecover flows before they have been collected by MR.*/
            public final FlowReaderInfoTableEnt flowReaderInfoTable;

            /** Control Group:  Manager Info Table
Any manager wishing to run a RuleSet must create a row in thistable.  Once it has a table row, the manager may set the controlvariables in its row so as to cause the meter to run any validRuleSet held by the meter.
A single manager may run several RuleSets; it must create a rowin this table for each of them.  In short, each row of this tabledescribes (and controls) a 'task' which the meter is executing.*/
            public final FlowManagerInfoTableEnt flowManagerInfoTable;

            /** Control Group:  General Meter Control Variables

Enabled by default.*/
            public final FlowFloodMarkEnt flowFloodMark;

            /** 10 minutes*/
            public final FlowInactivityTimeoutEnt flowInactivityTimeout;

            public final FlowActiveFlowsEnt flowActiveFlows;

            public final FlowMaxFlowsEnt flowMaxFlows;

            public final FlowFloodModeEnt flowFloodMode;

            private FlowControlEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
            {
                super(mib, parent, "flowControl", "1.3.6.1.2.1.40.1", false, false, false, false);
                this.flowRuleSetInfoTable = new FlowRuleSetInfoTableEnt(mib, this);
                this.flowInterfaceTable = new FlowInterfaceTableEnt(mib, this);
                this.flowReaderInfoTable = new FlowReaderInfoTableEnt(mib, this);
                this.flowManagerInfoTable = new FlowManagerInfoTableEnt(mib, this);
                this.flowFloodMark = new FlowFloodMarkEnt(mib, this);
                this.flowInactivityTimeout = new FlowInactivityTimeoutEnt(mib, this);
                this.flowActiveFlows = new FlowActiveFlowsEnt(mib, this);
                this.flowMaxFlows = new FlowMaxFlowsEnt(mib, this);
                this.flowFloodMode = new FlowFloodModeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.flowRuleSetInfoTable,
                    this.flowInterfaceTable,
                    this.flowReaderInfoTable,
                    this.flowManagerInfoTable,
                    this.flowFloodMark,
                    this.flowInactivityTimeout,
                    this.flowActiveFlows,
                    this.flowMaxFlows,
                    this.flowFloodMode
                };
            }
            public static final class FlowRuleSetInfoTableEnt extends MIBEntry<FLOWMETERMIBDef>
            {
                public final FlowRuleSetInfoEntryEnt flowRuleSetInfoEntry;

                private FlowRuleSetInfoTableEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                {
                    super(mib, parent, "flowRuleSetInfoTable", "1.3.6.1.2.1.40.1.1", false, true, false, false);
                    this.flowRuleSetInfoEntry = new FlowRuleSetInfoEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.flowRuleSetInfoEntry
                    };
                }
                public static final class FlowRuleSetInfoEntryEnt extends MIBEntry<FLOWMETERMIBDef>
                {
                    public final FlowRuleInfoIndexEnt flowRuleInfoIndex;

                    public final FlowRuleInfoSizeEnt flowRuleInfoSize;

                    public final FlowRuleInfoOwnerEnt flowRuleInfoOwner;

                    public final FlowRuleInfoTimeStampEnt flowRuleInfoTimeStamp;

                    public final FlowRuleInfoStatusEnt flowRuleInfoStatus;

                    public final FlowRuleInfoNameEnt flowRuleInfoName;

                    public final FlowRuleInfoRulesReadyEnt flowRuleInfoRulesReady;

                    public final FlowRuleInfoFlowRecordsEnt flowRuleInfoFlowRecords;

                    private FlowRuleSetInfoEntryEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowRuleSetInfoEntry", "1.3.6.1.2.1.40.1.1.1", false, false, false, true);
                        this.flowRuleInfoIndex = new FlowRuleInfoIndexEnt(mib, this);
                        this.flowRuleInfoSize = new FlowRuleInfoSizeEnt(mib, this);
                        this.flowRuleInfoOwner = new FlowRuleInfoOwnerEnt(mib, this);
                        this.flowRuleInfoTimeStamp = new FlowRuleInfoTimeStampEnt(mib, this);
                        this.flowRuleInfoStatus = new FlowRuleInfoStatusEnt(mib, this);
                        this.flowRuleInfoName = new FlowRuleInfoNameEnt(mib, this);
                        this.flowRuleInfoRulesReady = new FlowRuleInfoRulesReadyEnt(mib, this);
                        this.flowRuleInfoFlowRecords = new FlowRuleInfoFlowRecordsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.flowRuleInfoIndex,
                            this.flowRuleInfoSize,
                            this.flowRuleInfoOwner,
                            this.flowRuleInfoTimeStamp,
                            this.flowRuleInfoStatus,
                            this.flowRuleInfoName,
                            this.flowRuleInfoRulesReady,
                            this.flowRuleInfoFlowRecords
                        };
                    }
                    public static final class FlowRuleInfoIndexEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowRuleInfoIndexEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowRuleInfoIndex", "1.3.6.1.2.1.40.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowRuleInfoSizeEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowRuleInfoSizeEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowRuleInfoSize", "1.3.6.1.2.1.40.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowRuleInfoOwnerEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowRuleInfoOwnerEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowRuleInfoOwner", "1.3.6.1.2.1.40.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowRuleInfoTimeStampEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowRuleInfoTimeStampEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowRuleInfoTimeStamp", "1.3.6.1.2.1.40.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowRuleInfoStatusEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowRuleInfoStatusEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowRuleInfoStatus", "1.3.6.1.2.1.40.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowRuleInfoNameEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowRuleInfoNameEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowRuleInfoName", "1.3.6.1.2.1.40.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowRuleInfoRulesReadyEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowRuleInfoRulesReadyEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowRuleInfoRulesReady", "1.3.6.1.2.1.40.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowRuleInfoFlowRecordsEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowRuleInfoFlowRecordsEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowRuleInfoFlowRecords", "1.3.6.1.2.1.40.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FlowInterfaceTableEnt extends MIBEntry<FLOWMETERMIBDef>
            {
                public final FlowInterfaceEntryEnt flowInterfaceEntry;

                private FlowInterfaceTableEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                {
                    super(mib, parent, "flowInterfaceTable", "1.3.6.1.2.1.40.1.2", false, true, false, false);
                    this.flowInterfaceEntry = new FlowInterfaceEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.flowInterfaceEntry
                    };
                }
                public static final class FlowInterfaceEntryEnt extends MIBEntry<FLOWMETERMIBDef>
                {
                    public final FlowInterfaceSampleRateEnt flowInterfaceSampleRate;

                    public final FlowInterfaceLostPacketsEnt flowInterfaceLostPackets;

                    private FlowInterfaceEntryEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowInterfaceEntry", "1.3.6.1.2.1.40.1.2.1", false, false, false, true);
                        this.flowInterfaceSampleRate = new FlowInterfaceSampleRateEnt(mib, this);
                        this.flowInterfaceLostPackets = new FlowInterfaceLostPacketsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.flowInterfaceSampleRate,
                            this.flowInterfaceLostPackets
                        };
                    }
                    public static final class FlowInterfaceSampleRateEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowInterfaceSampleRateEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowInterfaceSampleRate", "1.3.6.1.2.1.40.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowInterfaceLostPacketsEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowInterfaceLostPacketsEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowInterfaceLostPackets", "1.3.6.1.2.1.40.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FlowReaderInfoTableEnt extends MIBEntry<FLOWMETERMIBDef>
            {
                public final FlowReaderInfoEntryEnt flowReaderInfoEntry;

                private FlowReaderInfoTableEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                {
                    super(mib, parent, "flowReaderInfoTable", "1.3.6.1.2.1.40.1.3", false, true, false, false);
                    this.flowReaderInfoEntry = new FlowReaderInfoEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.flowReaderInfoEntry
                    };
                }
                public static final class FlowReaderInfoEntryEnt extends MIBEntry<FLOWMETERMIBDef>
                {
                    public final FlowReaderIndexEnt flowReaderIndex;

                    public final FlowReaderTimeoutEnt flowReaderTimeout;

                    public final FlowReaderOwnerEnt flowReaderOwner;

                    public final FlowReaderLastTimeEnt flowReaderLastTime;

                    public final FlowReaderPreviousTimeEnt flowReaderPreviousTime;

                    public final FlowReaderStatusEnt flowReaderStatus;

                    public final FlowReaderRuleSetEnt flowReaderRuleSet;

                    private FlowReaderInfoEntryEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowReaderInfoEntry", "1.3.6.1.2.1.40.1.3.1", false, false, false, true);
                        this.flowReaderIndex = new FlowReaderIndexEnt(mib, this);
                        this.flowReaderTimeout = new FlowReaderTimeoutEnt(mib, this);
                        this.flowReaderOwner = new FlowReaderOwnerEnt(mib, this);
                        this.flowReaderLastTime = new FlowReaderLastTimeEnt(mib, this);
                        this.flowReaderPreviousTime = new FlowReaderPreviousTimeEnt(mib, this);
                        this.flowReaderStatus = new FlowReaderStatusEnt(mib, this);
                        this.flowReaderRuleSet = new FlowReaderRuleSetEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.flowReaderIndex,
                            this.flowReaderTimeout,
                            this.flowReaderOwner,
                            this.flowReaderLastTime,
                            this.flowReaderPreviousTime,
                            this.flowReaderStatus,
                            this.flowReaderRuleSet
                        };
                    }
                    public static final class FlowReaderIndexEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowReaderIndexEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowReaderIndex", "1.3.6.1.2.1.40.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowReaderTimeoutEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowReaderTimeoutEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowReaderTimeout", "1.3.6.1.2.1.40.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowReaderOwnerEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowReaderOwnerEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowReaderOwner", "1.3.6.1.2.1.40.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowReaderLastTimeEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowReaderLastTimeEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowReaderLastTime", "1.3.6.1.2.1.40.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowReaderPreviousTimeEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowReaderPreviousTimeEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowReaderPreviousTime", "1.3.6.1.2.1.40.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowReaderStatusEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowReaderStatusEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowReaderStatus", "1.3.6.1.2.1.40.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowReaderRuleSetEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowReaderRuleSetEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowReaderRuleSet", "1.3.6.1.2.1.40.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FlowManagerInfoTableEnt extends MIBEntry<FLOWMETERMIBDef>
            {
                public final FlowManagerInfoEntryEnt flowManagerInfoEntry;

                private FlowManagerInfoTableEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                {
                    super(mib, parent, "flowManagerInfoTable", "1.3.6.1.2.1.40.1.4", false, true, false, false);
                    this.flowManagerInfoEntry = new FlowManagerInfoEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.flowManagerInfoEntry
                    };
                }
                public static final class FlowManagerInfoEntryEnt extends MIBEntry<FLOWMETERMIBDef>
                {
                    public final FlowManagerIndexEnt flowManagerIndex;

                    public final FlowManagerCurrentRuleSetEnt flowManagerCurrentRuleSet;

                    /** No standby*/
                    public final FlowManagerStandbyRuleSetEnt flowManagerStandbyRuleSet;

                    public final FlowManagerHighWaterMarkEnt flowManagerHighWaterMark;

                    public final FlowManagerCounterWrapEnt flowManagerCounterWrap;

                    public final FlowManagerOwnerEnt flowManagerOwner;

                    public final FlowManagerTimeStampEnt flowManagerTimeStamp;

                    public final FlowManagerStatusEnt flowManagerStatus;

                    public final FlowManagerRunningStandbyEnt flowManagerRunningStandby;

                    private FlowManagerInfoEntryEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowManagerInfoEntry", "1.3.6.1.2.1.40.1.4.1", false, false, false, true);
                        this.flowManagerIndex = new FlowManagerIndexEnt(mib, this);
                        this.flowManagerCurrentRuleSet = new FlowManagerCurrentRuleSetEnt(mib, this);
                        this.flowManagerStandbyRuleSet = new FlowManagerStandbyRuleSetEnt(mib, this);
                        this.flowManagerHighWaterMark = new FlowManagerHighWaterMarkEnt(mib, this);
                        this.flowManagerCounterWrap = new FlowManagerCounterWrapEnt(mib, this);
                        this.flowManagerOwner = new FlowManagerOwnerEnt(mib, this);
                        this.flowManagerTimeStamp = new FlowManagerTimeStampEnt(mib, this);
                        this.flowManagerStatus = new FlowManagerStatusEnt(mib, this);
                        this.flowManagerRunningStandby = new FlowManagerRunningStandbyEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.flowManagerIndex,
                            this.flowManagerCurrentRuleSet,
                            this.flowManagerStandbyRuleSet,
                            this.flowManagerHighWaterMark,
                            this.flowManagerCounterWrap,
                            this.flowManagerOwner,
                            this.flowManagerTimeStamp,
                            this.flowManagerStatus,
                            this.flowManagerRunningStandby
                        };
                    }
                    public static final class FlowManagerIndexEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowManagerIndexEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowManagerIndex", "1.3.6.1.2.1.40.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowManagerCurrentRuleSetEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowManagerCurrentRuleSetEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowManagerCurrentRuleSet", "1.3.6.1.2.1.40.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowManagerStandbyRuleSetEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowManagerStandbyRuleSetEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowManagerStandbyRuleSet", "1.3.6.1.2.1.40.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowManagerHighWaterMarkEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowManagerHighWaterMarkEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowManagerHighWaterMark", "1.3.6.1.2.1.40.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowManagerCounterWrapEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowManagerCounterWrapEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowManagerCounterWrap", "1.3.6.1.2.1.40.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowManagerOwnerEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowManagerOwnerEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowManagerOwner", "1.3.6.1.2.1.40.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowManagerTimeStampEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowManagerTimeStampEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowManagerTimeStamp", "1.3.6.1.2.1.40.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowManagerStatusEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowManagerStatusEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowManagerStatus", "1.3.6.1.2.1.40.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowManagerRunningStandbyEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowManagerRunningStandbyEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowManagerRunningStandby", "1.3.6.1.2.1.40.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FlowFloodMarkEnt extends MIBEntry<FLOWMETERMIBDef>
            {
                private FlowFloodMarkEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                {
                    super(mib, parent, "flowFloodMark", "1.3.6.1.2.1.40.1.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class FlowInactivityTimeoutEnt extends MIBEntry<FLOWMETERMIBDef>
            {
                private FlowInactivityTimeoutEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                {
                    super(mib, parent, "flowInactivityTimeout", "1.3.6.1.2.1.40.1.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class FlowActiveFlowsEnt extends MIBEntry<FLOWMETERMIBDef>
            {
                private FlowActiveFlowsEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                {
                    super(mib, parent, "flowActiveFlows", "1.3.6.1.2.1.40.1.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class FlowMaxFlowsEnt extends MIBEntry<FLOWMETERMIBDef>
            {
                private FlowMaxFlowsEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                {
                    super(mib, parent, "flowMaxFlows", "1.3.6.1.2.1.40.1.8", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class FlowFloodModeEnt extends MIBEntry<FLOWMETERMIBDef>
            {
                private FlowFloodModeEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                {
                    super(mib, parent, "flowFloodMode", "1.3.6.1.2.1.40.1.9", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class FlowDataEnt extends MIBEntry<FLOWMETERMIBDef>
        {
            /** The Flow Table
This is a table kept by a meter, with one flow data entry for everyflow being measured.  Each flow data entry stores the attributevalues for a traffic flow.  Details of flows and their attributesare given in the 'Traffic Flow Measurement: Architecture'document [RTFM-ARC].
From time to time a meter reader may sweep the flow table so asto read counts.  This is most effectively achieved by using theTimeMark variable together with successive GetBulk requests toretrieve the values of the desired flow attribute variables.
This scheme allows multiple meter readers to independently use thesame meter; the meter readers do not have to be synchronised andthey may use different collection intervals.
If identical sets of counts are required from a meter, a managercould achieve this using two identical copies of a RuleSet in thatmeter and switching back and forth between them.  This is discussedfurther in the RTFM Architecture document [RTFM-ARC].*/
            public final FlowDataTableEnt flowDataTable;

            /** The Activity Column Table*/
            public final FlowColumnActivityTableEnt flowColumnActivityTable;

            /** The Data Package Table*/
            public final FlowDataPackageTableEnt flowDataPackageTable;

            private FlowDataEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
            {
                super(mib, parent, "flowData", "1.3.6.1.2.1.40.2", false, false, false, false);
                this.flowDataTable = new FlowDataTableEnt(mib, this);
                this.flowColumnActivityTable = new FlowColumnActivityTableEnt(mib, this);
                this.flowDataPackageTable = new FlowDataPackageTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.flowDataTable,
                    this.flowColumnActivityTable,
                    this.flowDataPackageTable
                };
            }
            public static final class FlowDataTableEnt extends MIBEntry<FLOWMETERMIBDef>
            {
                public final FlowDataEntryEnt flowDataEntry;

                private FlowDataTableEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                {
                    super(mib, parent, "flowDataTable", "1.3.6.1.2.1.40.2.1", false, true, false, false);
                    this.flowDataEntry = new FlowDataEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.flowDataEntry
                    };
                }
                public static final class FlowDataEntryEnt extends MIBEntry<FLOWMETERMIBDef>
                {
                    public final FlowDataIndexEnt flowDataIndex;

                    public final FlowDataTimeMarkEnt flowDataTimeMark;

                    public final FlowDataStatusEnt flowDataStatus;

                    public final FlowDataSourceInterfaceEnt flowDataSourceInterface;

                    public final FlowDataSourceAdjacentTypeEnt flowDataSourceAdjacentType;

                    public final FlowDataSourceAdjacentAddressEnt flowDataSourceAdjacentAddress;

                    public final FlowDataSourceAdjacentMaskEnt flowDataSourceAdjacentMask;

                    public final FlowDataSourcePeerTypeEnt flowDataSourcePeerType;

                    public final FlowDataSourcePeerAddressEnt flowDataSourcePeerAddress;

                    public final FlowDataSourcePeerMaskEnt flowDataSourcePeerMask;

                    public final FlowDataSourceTransTypeEnt flowDataSourceTransType;

                    public final FlowDataSourceTransAddressEnt flowDataSourceTransAddress;

                    public final FlowDataSourceTransMaskEnt flowDataSourceTransMask;

                    public final FlowDataDestInterfaceEnt flowDataDestInterface;

                    public final FlowDataDestAdjacentTypeEnt flowDataDestAdjacentType;

                    public final FlowDataDestAdjacentAddressEnt flowDataDestAdjacentAddress;

                    public final FlowDataDestAdjacentMaskEnt flowDataDestAdjacentMask;

                    public final FlowDataDestPeerTypeEnt flowDataDestPeerType;

                    public final FlowDataDestPeerAddressEnt flowDataDestPeerAddress;

                    public final FlowDataDestPeerMaskEnt flowDataDestPeerMask;

                    public final FlowDataDestTransTypeEnt flowDataDestTransType;

                    public final FlowDataDestTransAddressEnt flowDataDestTransAddress;

                    public final FlowDataDestTransMaskEnt flowDataDestTransMask;

                    public final FlowDataPDUScaleEnt flowDataPDUScale;

                    public final FlowDataOctetScaleEnt flowDataOctetScale;

                    public final FlowDataRuleSetEnt flowDataRuleSet;

                    public final FlowDataToOctetsEnt flowDataToOctets;

                    public final FlowDataToPDUsEnt flowDataToPDUs;

                    public final FlowDataFromOctetsEnt flowDataFromOctets;

                    public final FlowDataFromPDUsEnt flowDataFromPDUs;

                    public final FlowDataFirstTimeEnt flowDataFirstTime;

                    public final FlowDataLastActiveTimeEnt flowDataLastActiveTime;

                    public final FlowDataSourceSubscriberIDEnt flowDataSourceSubscriberID;

                    public final FlowDataDestSubscriberIDEnt flowDataDestSubscriberID;

                    public final FlowDataSessionIDEnt flowDataSessionID;

                    public final FlowDataSourceClassEnt flowDataSourceClass;

                    public final FlowDataDestClassEnt flowDataDestClass;

                    public final FlowDataClassEnt flowDataClass;

                    public final FlowDataSourceKindEnt flowDataSourceKind;

                    public final FlowDataDestKindEnt flowDataDestKind;

                    public final FlowDataKindEnt flowDataKind;

                    private FlowDataEntryEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowDataEntry", "1.3.6.1.2.1.40.2.1.1", false, false, false, true);
                        this.flowDataIndex = new FlowDataIndexEnt(mib, this);
                        this.flowDataTimeMark = new FlowDataTimeMarkEnt(mib, this);
                        this.flowDataStatus = new FlowDataStatusEnt(mib, this);
                        this.flowDataSourceInterface = new FlowDataSourceInterfaceEnt(mib, this);
                        this.flowDataSourceAdjacentType = new FlowDataSourceAdjacentTypeEnt(mib, this);
                        this.flowDataSourceAdjacentAddress = new FlowDataSourceAdjacentAddressEnt(mib, this);
                        this.flowDataSourceAdjacentMask = new FlowDataSourceAdjacentMaskEnt(mib, this);
                        this.flowDataSourcePeerType = new FlowDataSourcePeerTypeEnt(mib, this);
                        this.flowDataSourcePeerAddress = new FlowDataSourcePeerAddressEnt(mib, this);
                        this.flowDataSourcePeerMask = new FlowDataSourcePeerMaskEnt(mib, this);
                        this.flowDataSourceTransType = new FlowDataSourceTransTypeEnt(mib, this);
                        this.flowDataSourceTransAddress = new FlowDataSourceTransAddressEnt(mib, this);
                        this.flowDataSourceTransMask = new FlowDataSourceTransMaskEnt(mib, this);
                        this.flowDataDestInterface = new FlowDataDestInterfaceEnt(mib, this);
                        this.flowDataDestAdjacentType = new FlowDataDestAdjacentTypeEnt(mib, this);
                        this.flowDataDestAdjacentAddress = new FlowDataDestAdjacentAddressEnt(mib, this);
                        this.flowDataDestAdjacentMask = new FlowDataDestAdjacentMaskEnt(mib, this);
                        this.flowDataDestPeerType = new FlowDataDestPeerTypeEnt(mib, this);
                        this.flowDataDestPeerAddress = new FlowDataDestPeerAddressEnt(mib, this);
                        this.flowDataDestPeerMask = new FlowDataDestPeerMaskEnt(mib, this);
                        this.flowDataDestTransType = new FlowDataDestTransTypeEnt(mib, this);
                        this.flowDataDestTransAddress = new FlowDataDestTransAddressEnt(mib, this);
                        this.flowDataDestTransMask = new FlowDataDestTransMaskEnt(mib, this);
                        this.flowDataPDUScale = new FlowDataPDUScaleEnt(mib, this);
                        this.flowDataOctetScale = new FlowDataOctetScaleEnt(mib, this);
                        this.flowDataRuleSet = new FlowDataRuleSetEnt(mib, this);
                        this.flowDataToOctets = new FlowDataToOctetsEnt(mib, this);
                        this.flowDataToPDUs = new FlowDataToPDUsEnt(mib, this);
                        this.flowDataFromOctets = new FlowDataFromOctetsEnt(mib, this);
                        this.flowDataFromPDUs = new FlowDataFromPDUsEnt(mib, this);
                        this.flowDataFirstTime = new FlowDataFirstTimeEnt(mib, this);
                        this.flowDataLastActiveTime = new FlowDataLastActiveTimeEnt(mib, this);
                        this.flowDataSourceSubscriberID = new FlowDataSourceSubscriberIDEnt(mib, this);
                        this.flowDataDestSubscriberID = new FlowDataDestSubscriberIDEnt(mib, this);
                        this.flowDataSessionID = new FlowDataSessionIDEnt(mib, this);
                        this.flowDataSourceClass = new FlowDataSourceClassEnt(mib, this);
                        this.flowDataDestClass = new FlowDataDestClassEnt(mib, this);
                        this.flowDataClass = new FlowDataClassEnt(mib, this);
                        this.flowDataSourceKind = new FlowDataSourceKindEnt(mib, this);
                        this.flowDataDestKind = new FlowDataDestKindEnt(mib, this);
                        this.flowDataKind = new FlowDataKindEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.flowDataIndex,
                            this.flowDataTimeMark,
                            this.flowDataStatus,
                            this.flowDataSourceInterface,
                            this.flowDataSourceAdjacentType,
                            this.flowDataSourceAdjacentAddress,
                            this.flowDataSourceAdjacentMask,
                            this.flowDataSourcePeerType,
                            this.flowDataSourcePeerAddress,
                            this.flowDataSourcePeerMask,
                            this.flowDataSourceTransType,
                            this.flowDataSourceTransAddress,
                            this.flowDataSourceTransMask,
                            this.flowDataDestInterface,
                            this.flowDataDestAdjacentType,
                            this.flowDataDestAdjacentAddress,
                            this.flowDataDestAdjacentMask,
                            this.flowDataDestPeerType,
                            this.flowDataDestPeerAddress,
                            this.flowDataDestPeerMask,
                            this.flowDataDestTransType,
                            this.flowDataDestTransAddress,
                            this.flowDataDestTransMask,
                            this.flowDataPDUScale,
                            this.flowDataOctetScale,
                            this.flowDataRuleSet,
                            this.flowDataToOctets,
                            this.flowDataToPDUs,
                            this.flowDataFromOctets,
                            this.flowDataFromPDUs,
                            this.flowDataFirstTime,
                            this.flowDataLastActiveTime,
                            this.flowDataSourceSubscriberID,
                            this.flowDataDestSubscriberID,
                            this.flowDataSessionID,
                            this.flowDataSourceClass,
                            this.flowDataDestClass,
                            this.flowDataClass,
                            this.flowDataSourceKind,
                            this.flowDataDestKind,
                            this.flowDataKind
                        };
                    }
                    public static final class FlowDataIndexEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataIndexEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataIndex", "1.3.6.1.2.1.40.2.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataTimeMarkEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataTimeMarkEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataTimeMark", "1.3.6.1.2.1.40.2.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataStatusEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataStatusEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataStatus", "1.3.6.1.2.1.40.2.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataSourceInterfaceEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataSourceInterfaceEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataSourceInterface", "1.3.6.1.2.1.40.2.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataSourceAdjacentTypeEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataSourceAdjacentTypeEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataSourceAdjacentType", "1.3.6.1.2.1.40.2.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataSourceAdjacentAddressEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataSourceAdjacentAddressEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataSourceAdjacentAddress", "1.3.6.1.2.1.40.2.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataSourceAdjacentMaskEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataSourceAdjacentMaskEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataSourceAdjacentMask", "1.3.6.1.2.1.40.2.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataSourcePeerTypeEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataSourcePeerTypeEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataSourcePeerType", "1.3.6.1.2.1.40.2.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataSourcePeerAddressEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataSourcePeerAddressEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataSourcePeerAddress", "1.3.6.1.2.1.40.2.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataSourcePeerMaskEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataSourcePeerMaskEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataSourcePeerMask", "1.3.6.1.2.1.40.2.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataSourceTransTypeEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataSourceTransTypeEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataSourceTransType", "1.3.6.1.2.1.40.2.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataSourceTransAddressEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataSourceTransAddressEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataSourceTransAddress", "1.3.6.1.2.1.40.2.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataSourceTransMaskEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataSourceTransMaskEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataSourceTransMask", "1.3.6.1.2.1.40.2.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataDestInterfaceEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataDestInterfaceEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataDestInterface", "1.3.6.1.2.1.40.2.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataDestAdjacentTypeEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataDestAdjacentTypeEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataDestAdjacentType", "1.3.6.1.2.1.40.2.1.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataDestAdjacentAddressEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataDestAdjacentAddressEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataDestAdjacentAddress", "1.3.6.1.2.1.40.2.1.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataDestAdjacentMaskEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataDestAdjacentMaskEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataDestAdjacentMask", "1.3.6.1.2.1.40.2.1.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataDestPeerTypeEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataDestPeerTypeEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataDestPeerType", "1.3.6.1.2.1.40.2.1.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataDestPeerAddressEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataDestPeerAddressEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataDestPeerAddress", "1.3.6.1.2.1.40.2.1.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataDestPeerMaskEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataDestPeerMaskEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataDestPeerMask", "1.3.6.1.2.1.40.2.1.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataDestTransTypeEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataDestTransTypeEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataDestTransType", "1.3.6.1.2.1.40.2.1.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataDestTransAddressEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataDestTransAddressEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataDestTransAddress", "1.3.6.1.2.1.40.2.1.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataDestTransMaskEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataDestTransMaskEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataDestTransMask", "1.3.6.1.2.1.40.2.1.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataPDUScaleEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataPDUScaleEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataPDUScale", "1.3.6.1.2.1.40.2.1.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataOctetScaleEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataOctetScaleEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataOctetScale", "1.3.6.1.2.1.40.2.1.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataRuleSetEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataRuleSetEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataRuleSet", "1.3.6.1.2.1.40.2.1.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataToOctetsEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataToOctetsEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataToOctets", "1.3.6.1.2.1.40.2.1.1.27", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataToPDUsEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataToPDUsEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataToPDUs", "1.3.6.1.2.1.40.2.1.1.28", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataFromOctetsEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataFromOctetsEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataFromOctets", "1.3.6.1.2.1.40.2.1.1.29", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataFromPDUsEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataFromPDUsEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataFromPDUs", "1.3.6.1.2.1.40.2.1.1.30", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataFirstTimeEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataFirstTimeEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataFirstTime", "1.3.6.1.2.1.40.2.1.1.31", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataLastActiveTimeEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataLastActiveTimeEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataLastActiveTime", "1.3.6.1.2.1.40.2.1.1.32", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataSourceSubscriberIDEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataSourceSubscriberIDEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataSourceSubscriberID", "1.3.6.1.2.1.40.2.1.1.33", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataDestSubscriberIDEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataDestSubscriberIDEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataDestSubscriberID", "1.3.6.1.2.1.40.2.1.1.34", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataSessionIDEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataSessionIDEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataSessionID", "1.3.6.1.2.1.40.2.1.1.35", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataSourceClassEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataSourceClassEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataSourceClass", "1.3.6.1.2.1.40.2.1.1.36", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataDestClassEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataDestClassEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataDestClass", "1.3.6.1.2.1.40.2.1.1.37", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataClassEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataClassEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataClass", "1.3.6.1.2.1.40.2.1.1.38", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataSourceKindEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataSourceKindEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataSourceKind", "1.3.6.1.2.1.40.2.1.1.39", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataDestKindEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataDestKindEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataDestKind", "1.3.6.1.2.1.40.2.1.1.40", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowDataKindEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowDataKindEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowDataKind", "1.3.6.1.2.1.40.2.1.1.41", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FlowColumnActivityTableEnt extends MIBEntry<FLOWMETERMIBDef>
            {
                public final FlowColumnActivityEntryEnt flowColumnActivityEntry;

                private FlowColumnActivityTableEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                {
                    super(mib, parent, "flowColumnActivityTable", "1.3.6.1.2.1.40.2.2", false, true, false, false);
                    this.flowColumnActivityEntry = new FlowColumnActivityEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.flowColumnActivityEntry
                    };
                }
                public static final class FlowColumnActivityEntryEnt extends MIBEntry<FLOWMETERMIBDef>
                {
                    public final FlowColumnActivityAttributeEnt flowColumnActivityAttribute;

                    public final FlowColumnActivityTimeEnt flowColumnActivityTime;

                    public final FlowColumnActivityIndexEnt flowColumnActivityIndex;

                    public final FlowColumnActivityDataEnt flowColumnActivityData;

                    private FlowColumnActivityEntryEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowColumnActivityEntry", "1.3.6.1.2.1.40.2.2.1", false, false, false, true);
                        this.flowColumnActivityAttribute = new FlowColumnActivityAttributeEnt(mib, this);
                        this.flowColumnActivityTime = new FlowColumnActivityTimeEnt(mib, this);
                        this.flowColumnActivityIndex = new FlowColumnActivityIndexEnt(mib, this);
                        this.flowColumnActivityData = new FlowColumnActivityDataEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.flowColumnActivityAttribute,
                            this.flowColumnActivityTime,
                            this.flowColumnActivityIndex,
                            this.flowColumnActivityData
                        };
                    }
                    public static final class FlowColumnActivityAttributeEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowColumnActivityAttributeEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowColumnActivityAttribute", "1.3.6.1.2.1.40.2.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowColumnActivityTimeEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowColumnActivityTimeEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowColumnActivityTime", "1.3.6.1.2.1.40.2.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowColumnActivityIndexEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowColumnActivityIndexEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowColumnActivityIndex", "1.3.6.1.2.1.40.2.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowColumnActivityDataEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowColumnActivityDataEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowColumnActivityData", "1.3.6.1.2.1.40.2.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FlowDataPackageTableEnt extends MIBEntry<FLOWMETERMIBDef>
            {
                public final FlowDataPackageEntryEnt flowDataPackageEntry;

                private FlowDataPackageTableEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                {
                    super(mib, parent, "flowDataPackageTable", "1.3.6.1.2.1.40.2.3", false, true, false, false);
                    this.flowDataPackageEntry = new FlowDataPackageEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.flowDataPackageEntry
                    };
                }
                public static final class FlowDataPackageEntryEnt extends MIBEntry<FLOWMETERMIBDef>
                {
                    public final FlowPackageSelectorEnt flowPackageSelector;

                    public final FlowPackageRuleSetEnt flowPackageRuleSet;

                    public final FlowPackageTimeEnt flowPackageTime;

                    public final FlowPackageIndexEnt flowPackageIndex;

                    public final FlowPackageDataEnt flowPackageData;

                    private FlowDataPackageEntryEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowDataPackageEntry", "1.3.6.1.2.1.40.2.3.1", false, false, false, true);
                        this.flowPackageSelector = new FlowPackageSelectorEnt(mib, this);
                        this.flowPackageRuleSet = new FlowPackageRuleSetEnt(mib, this);
                        this.flowPackageTime = new FlowPackageTimeEnt(mib, this);
                        this.flowPackageIndex = new FlowPackageIndexEnt(mib, this);
                        this.flowPackageData = new FlowPackageDataEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.flowPackageSelector,
                            this.flowPackageRuleSet,
                            this.flowPackageTime,
                            this.flowPackageIndex,
                            this.flowPackageData
                        };
                    }
                    public static final class FlowPackageSelectorEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowPackageSelectorEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowPackageSelector", "1.3.6.1.2.1.40.2.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowPackageRuleSetEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowPackageRuleSetEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowPackageRuleSet", "1.3.6.1.2.1.40.2.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowPackageTimeEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowPackageTimeEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowPackageTime", "1.3.6.1.2.1.40.2.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowPackageIndexEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowPackageIndexEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowPackageIndex", "1.3.6.1.2.1.40.2.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowPackageDataEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowPackageDataEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowPackageData", "1.3.6.1.2.1.40.2.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class FlowRulesEnt extends MIBEntry<FLOWMETERMIBDef>
        {
            /** The Rule Table
This is an array of RuleSets; the 'running' ones are indicatedby the entries in the meter's flowManagerInfoTable.  SeveralRuleSets can be held in a meter so that the manager can change therunning RuleSets easily, for example with time of day.  Note thata manager may not change the rules in any RuleSet currentlyreferenced within the flowManagerInfoTable (either as 'current' or'standby')!  See the 'Traffic Flow Measurement: Architecture'document [RTFM-ARC] for details of rules and how they are used.
Space for a RuleSet is allocated by setting the value offlowRuleInfoSize in the rule table's flowRuleSetInfoTable row.Values for each row in the RuleSet (Selector, Mask, MatchedValue,Action and Parameter) can then be set by the meter.
Although an individual rule within a RuleSet could be modified,it is much safer to simply download a complete new RuleSet.*/
            public final FlowRuleTableEnt flowRuleTable;

            private FlowRulesEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
            {
                super(mib, parent, "flowRules", "1.3.6.1.2.1.40.3", false, false, false, false);
                this.flowRuleTable = new FlowRuleTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.flowRuleTable
                };
            }
            public static final class FlowRuleTableEnt extends MIBEntry<FLOWMETERMIBDef>
            {
                public final FlowRuleEntryEnt flowRuleEntry;

                private FlowRuleTableEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                {
                    super(mib, parent, "flowRuleTable", "1.3.6.1.2.1.40.3.1", false, true, false, false);
                    this.flowRuleEntry = new FlowRuleEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.flowRuleEntry
                    };
                }
                public static final class FlowRuleEntryEnt extends MIBEntry<FLOWMETERMIBDef>
                {
                    public final FlowRuleSetEnt flowRuleSet;

                    public final FlowRuleIndexEnt flowRuleIndex;

                    public final FlowRuleSelectorEnt flowRuleSelector;

                    public final FlowRuleMaskEnt flowRuleMask;

                    public final FlowRuleMatchedValueEnt flowRuleMatchedValue;

                    public final FlowRuleActionEnt flowRuleAction;

                    public final FlowRuleParameterEnt flowRuleParameter;

                    private FlowRuleEntryEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowRuleEntry", "1.3.6.1.2.1.40.3.1.1", false, false, false, true);
                        this.flowRuleSet = new FlowRuleSetEnt(mib, this);
                        this.flowRuleIndex = new FlowRuleIndexEnt(mib, this);
                        this.flowRuleSelector = new FlowRuleSelectorEnt(mib, this);
                        this.flowRuleMask = new FlowRuleMaskEnt(mib, this);
                        this.flowRuleMatchedValue = new FlowRuleMatchedValueEnt(mib, this);
                        this.flowRuleAction = new FlowRuleActionEnt(mib, this);
                        this.flowRuleParameter = new FlowRuleParameterEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.flowRuleSet,
                            this.flowRuleIndex,
                            this.flowRuleSelector,
                            this.flowRuleMask,
                            this.flowRuleMatchedValue,
                            this.flowRuleAction,
                            this.flowRuleParameter
                        };
                    }
                    public static final class FlowRuleSetEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowRuleSetEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowRuleSet", "1.3.6.1.2.1.40.3.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowRuleIndexEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowRuleIndexEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowRuleIndex", "1.3.6.1.2.1.40.3.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowRuleSelectorEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowRuleSelectorEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowRuleSelector", "1.3.6.1.2.1.40.3.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowRuleMaskEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowRuleMaskEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowRuleMask", "1.3.6.1.2.1.40.3.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowRuleMatchedValueEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowRuleMatchedValueEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowRuleMatchedValue", "1.3.6.1.2.1.40.3.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowRuleActionEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowRuleActionEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowRuleAction", "1.3.6.1.2.1.40.3.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FlowRuleParameterEnt extends MIBEntry<FLOWMETERMIBDef>
                    {
                        private FlowRuleParameterEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                        {
                            super(mib, parent, "flowRuleParameter", "1.3.6.1.2.1.40.3.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class FlowMIBConformanceEnt extends MIBEntry<FLOWMETERMIBDef>
        {
            /** Traffic Flow Meter conformance statement*/
            public final FlowMIBCompliancesEnt flowMIBCompliances;

            public final FlowMIBGroupsEnt flowMIBGroups;

            private FlowMIBConformanceEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
            {
                super(mib, parent, "flowMIBConformance", "1.3.6.1.2.1.40.4", false, false, false, false);
                this.flowMIBCompliances = new FlowMIBCompliancesEnt(mib, this);
                this.flowMIBGroups = new FlowMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.flowMIBCompliances,
                    this.flowMIBGroups
                };
            }
            public static final class FlowMIBCompliancesEnt extends MIBEntry<FLOWMETERMIBDef>
            {
                public final FlowMIBComplianceEnt flowMIBCompliance;

                private FlowMIBCompliancesEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                {
                    super(mib, parent, "flowMIBCompliances", "1.3.6.1.2.1.40.4.1", false, false, false, false);
                    this.flowMIBCompliance = new FlowMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.flowMIBCompliance
                    };
                }
                public static final class FlowMIBComplianceEnt extends MIBEntry<FLOWMETERMIBDef>
                {
                    private FlowMIBComplianceEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowMIBCompliance", "1.3.6.1.2.1.40.4.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class FlowMIBGroupsEnt extends MIBEntry<FLOWMETERMIBDef>
            {
                public final FlowControlGroupEnt flowControlGroup;

                /** flowDataIndex,                    <- INDEX, not-accessible
flowDataRuleSet,                  <- INDEX, not-accessible*/
                public final FlowDataTableGroupEnt flowDataTableGroup;

                public final FlowDataScaleGroupEnt flowDataScaleGroup;

                public final FlowDataSubscriberGroupEnt flowDataSubscriberGroup;

                public final FlowDataColumnTableGroupEnt flowDataColumnTableGroup;

                public final FlowDataPackageGroupEnt flowDataPackageGroup;

                public final FlowRuleTableGroupEnt flowRuleTableGroup;

                /** flowManagerCounterWrap,           <- Deprecated*/
                public final FlowDataScaleGroup2Ent flowDataScaleGroup2;

                /** flowRuleInfoRulesReady,       <- Deprecated
flowManagerCounterWrap,       <- Moved to DataScaleGroup*/
                public final FlowControlGroup2Ent flowControlGroup2;

                private FlowMIBGroupsEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                {
                    super(mib, parent, "flowMIBGroups", "1.3.6.1.2.1.40.4.2", false, false, false, false);
                    this.flowControlGroup = new FlowControlGroupEnt(mib, this);
                    this.flowDataTableGroup = new FlowDataTableGroupEnt(mib, this);
                    this.flowDataScaleGroup = new FlowDataScaleGroupEnt(mib, this);
                    this.flowDataSubscriberGroup = new FlowDataSubscriberGroupEnt(mib, this);
                    this.flowDataColumnTableGroup = new FlowDataColumnTableGroupEnt(mib, this);
                    this.flowDataPackageGroup = new FlowDataPackageGroupEnt(mib, this);
                    this.flowRuleTableGroup = new FlowRuleTableGroupEnt(mib, this);
                    this.flowDataScaleGroup2 = new FlowDataScaleGroup2Ent(mib, this);
                    this.flowControlGroup2 = new FlowControlGroup2Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.flowControlGroup,
                        this.flowDataTableGroup,
                        this.flowDataScaleGroup,
                        this.flowDataSubscriberGroup,
                        this.flowDataColumnTableGroup,
                        this.flowDataPackageGroup,
                        this.flowRuleTableGroup,
                        this.flowDataScaleGroup2,
                        this.flowControlGroup2
                    };
                }
                public static final class FlowControlGroupEnt extends MIBEntry<FLOWMETERMIBDef>
                {
                    private FlowControlGroupEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowControlGroup", "1.3.6.1.2.1.40.4.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FlowDataTableGroupEnt extends MIBEntry<FLOWMETERMIBDef>
                {
                    private FlowDataTableGroupEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowDataTableGroup", "1.3.6.1.2.1.40.4.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FlowDataScaleGroupEnt extends MIBEntry<FLOWMETERMIBDef>
                {
                    private FlowDataScaleGroupEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowDataScaleGroup", "1.3.6.1.2.1.40.4.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FlowDataSubscriberGroupEnt extends MIBEntry<FLOWMETERMIBDef>
                {
                    private FlowDataSubscriberGroupEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowDataSubscriberGroup", "1.3.6.1.2.1.40.4.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FlowDataColumnTableGroupEnt extends MIBEntry<FLOWMETERMIBDef>
                {
                    private FlowDataColumnTableGroupEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowDataColumnTableGroup", "1.3.6.1.2.1.40.4.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FlowDataPackageGroupEnt extends MIBEntry<FLOWMETERMIBDef>
                {
                    private FlowDataPackageGroupEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowDataPackageGroup", "1.3.6.1.2.1.40.4.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FlowRuleTableGroupEnt extends MIBEntry<FLOWMETERMIBDef>
                {
                    private FlowRuleTableGroupEnt(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowRuleTableGroup", "1.3.6.1.2.1.40.4.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FlowDataScaleGroup2Ent extends MIBEntry<FLOWMETERMIBDef>
                {
                    private FlowDataScaleGroup2Ent(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowDataScaleGroup2", "1.3.6.1.2.1.40.4.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FlowControlGroup2Ent extends MIBEntry<FLOWMETERMIBDef>
                {
                    private FlowControlGroup2Ent(FLOWMETERMIBDef mib, MIBEntry<FLOWMETERMIBDef> parent)
                    {
                        super(mib, parent, "flowControlGroup2", "1.3.6.1.2.1.40.4.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
