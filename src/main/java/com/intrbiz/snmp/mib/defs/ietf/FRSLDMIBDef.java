package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class FRSLDMIBDef extends MIB
{
    public static final FRSLDMIBDef FRSLDMIB = new FRSLDMIBDef();

    /** January 3, 2002*/
    public final FrsldMIBEnt frsldMIB;

    private FRSLDMIBDef()
    {
        super("FRSLD-MIB");
        this.frsldMIB = new FrsldMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.frsldMIB
        };
    }

    public static final class FrsldMIBEnt extends MIBEntry<FRSLDMIBDef>
    {
        /** Base Objects-*/
        public final FrsldObjectsEnt frsldObjects;

        public final FrsldCapabilitiesEnt frsldCapabilities;

        public final FrsldConformanceEnt frsldConformance;

        private FrsldMIBEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
        {
            super(mib, parent, "frsldMIB", "1.3.6.1.2.1.95", false, false, false, false);
            this.frsldObjects = new FrsldObjectsEnt(mib, this);
            this.frsldCapabilities = new FrsldCapabilitiesEnt(mib, this);
            this.frsldConformance = new FrsldConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.frsldObjects,
                this.frsldCapabilities,
                this.frsldConformance
            };
        }
        public static final class FrsldObjectsEnt extends MIBEntry<FRSLDMIBDef>
        {
            /** The Frame Relay Service Level Definitions PVC Control TableThis table is used to define and display the parameters ofservice level definitions on individual PVCs.*/
            public final FrsldPvcCtrlTableEnt frsldPvcCtrlTable;

            /** The Frame Relay Service Level Definitions Sampling ControlTable

This table is used to define the sample control parametersof service level definitions on individual PVCs.*/
            public final FrsldSmplCtrlTableEnt frsldSmplCtrlTable;

            /** The Frame Relay Service Level Definitions PVC Data TableThis table contains the accumulated values ofthe collected data.  This table is the table that shouldbe referenced by external polling mechanisms if timebased polling be desired.*/
            public final FrsldPvcDataTableEnt frsldPvcDataTable;

            /** The Frame Relay Service Level Definitions PVC Sample TableThis table contains the sampled delay, delivery andavailability information.*/
            public final FrsldPvcSampleTableEnt frsldPvcSampleTable;

            private FrsldObjectsEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
            {
                super(mib, parent, "frsldObjects", "1.3.6.1.2.1.95.1", false, false, false, false);
                this.frsldPvcCtrlTable = new FrsldPvcCtrlTableEnt(mib, this);
                this.frsldSmplCtrlTable = new FrsldSmplCtrlTableEnt(mib, this);
                this.frsldPvcDataTable = new FrsldPvcDataTableEnt(mib, this);
                this.frsldPvcSampleTable = new FrsldPvcSampleTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frsldPvcCtrlTable,
                    this.frsldSmplCtrlTable,
                    this.frsldPvcDataTable,
                    this.frsldPvcSampleTable
                };
            }
            public static final class FrsldPvcCtrlTableEnt extends MIBEntry<FRSLDMIBDef>
            {
                public final FrsldPvcCtrlEntryEnt frsldPvcCtrlEntry;

                private FrsldPvcCtrlTableEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                {
                    super(mib, parent, "frsldPvcCtrlTable", "1.3.6.1.2.1.95.1.1", false, true, false, false);
                    this.frsldPvcCtrlEntry = new FrsldPvcCtrlEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frsldPvcCtrlEntry
                    };
                }
                public static final class FrsldPvcCtrlEntryEnt extends MIBEntry<FRSLDMIBDef>
                {
                    public final FrsldPvcCtrlDlciEnt frsldPvcCtrlDlci;

                    public final FrsldPvcCtrlTransmitRPEnt frsldPvcCtrlTransmitRP;

                    public final FrsldPvcCtrlReceiveRPEnt frsldPvcCtrlReceiveRP;

                    public final FrsldPvcCtrlStatusEnt frsldPvcCtrlStatus;

                    public final FrsldPvcCtrlPacketFreqEnt frsldPvcCtrlPacketFreq;

                    public final FrsldPvcCtrlDelayFrSizeEnt frsldPvcCtrlDelayFrSize;

                    public final FrsldPvcCtrlDelayTypeEnt frsldPvcCtrlDelayType;

                    public final FrsldPvcCtrlDelayTimeOutEnt frsldPvcCtrlDelayTimeOut;

                    public final FrsldPvcCtrlPurgeEnt frsldPvcCtrlPurge;

                    public final FrsldPvcCtrlDeleteOnPurgeEnt frsldPvcCtrlDeleteOnPurge;

                    public final FrsldPvcCtrlLastPurgeTimeEnt frsldPvcCtrlLastPurgeTime;

                    private FrsldPvcCtrlEntryEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldPvcCtrlEntry", "1.3.6.1.2.1.95.1.1.1", false, false, false, true);
                        this.frsldPvcCtrlDlci = new FrsldPvcCtrlDlciEnt(mib, this);
                        this.frsldPvcCtrlTransmitRP = new FrsldPvcCtrlTransmitRPEnt(mib, this);
                        this.frsldPvcCtrlReceiveRP = new FrsldPvcCtrlReceiveRPEnt(mib, this);
                        this.frsldPvcCtrlStatus = new FrsldPvcCtrlStatusEnt(mib, this);
                        this.frsldPvcCtrlPacketFreq = new FrsldPvcCtrlPacketFreqEnt(mib, this);
                        this.frsldPvcCtrlDelayFrSize = new FrsldPvcCtrlDelayFrSizeEnt(mib, this);
                        this.frsldPvcCtrlDelayType = new FrsldPvcCtrlDelayTypeEnt(mib, this);
                        this.frsldPvcCtrlDelayTimeOut = new FrsldPvcCtrlDelayTimeOutEnt(mib, this);
                        this.frsldPvcCtrlPurge = new FrsldPvcCtrlPurgeEnt(mib, this);
                        this.frsldPvcCtrlDeleteOnPurge = new FrsldPvcCtrlDeleteOnPurgeEnt(mib, this);
                        this.frsldPvcCtrlLastPurgeTime = new FrsldPvcCtrlLastPurgeTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.frsldPvcCtrlDlci,
                            this.frsldPvcCtrlTransmitRP,
                            this.frsldPvcCtrlReceiveRP,
                            this.frsldPvcCtrlStatus,
                            this.frsldPvcCtrlPacketFreq,
                            this.frsldPvcCtrlDelayFrSize,
                            this.frsldPvcCtrlDelayType,
                            this.frsldPvcCtrlDelayTimeOut,
                            this.frsldPvcCtrlPurge,
                            this.frsldPvcCtrlDeleteOnPurge,
                            this.frsldPvcCtrlLastPurgeTime
                        };
                    }
                    public static final class FrsldPvcCtrlDlciEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcCtrlDlciEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcCtrlDlci", "1.3.6.1.2.1.95.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcCtrlTransmitRPEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcCtrlTransmitRPEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcCtrlTransmitRP", "1.3.6.1.2.1.95.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcCtrlReceiveRPEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcCtrlReceiveRPEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcCtrlReceiveRP", "1.3.6.1.2.1.95.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcCtrlStatusEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcCtrlStatusEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcCtrlStatus", "1.3.6.1.2.1.95.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcCtrlPacketFreqEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcCtrlPacketFreqEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcCtrlPacketFreq", "1.3.6.1.2.1.95.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcCtrlDelayFrSizeEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcCtrlDelayFrSizeEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcCtrlDelayFrSize", "1.3.6.1.2.1.95.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcCtrlDelayTypeEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcCtrlDelayTypeEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcCtrlDelayType", "1.3.6.1.2.1.95.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcCtrlDelayTimeOutEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcCtrlDelayTimeOutEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcCtrlDelayTimeOut", "1.3.6.1.2.1.95.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcCtrlPurgeEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcCtrlPurgeEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcCtrlPurge", "1.3.6.1.2.1.95.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcCtrlDeleteOnPurgeEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcCtrlDeleteOnPurgeEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcCtrlDeleteOnPurge", "1.3.6.1.2.1.95.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcCtrlLastPurgeTimeEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcCtrlLastPurgeTimeEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcCtrlLastPurgeTime", "1.3.6.1.2.1.95.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FrsldSmplCtrlTableEnt extends MIBEntry<FRSLDMIBDef>
            {
                public final FrsldSmplCtrlEntryEnt frsldSmplCtrlEntry;

                private FrsldSmplCtrlTableEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                {
                    super(mib, parent, "frsldSmplCtrlTable", "1.3.6.1.2.1.95.1.2", false, true, false, false);
                    this.frsldSmplCtrlEntry = new FrsldSmplCtrlEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frsldSmplCtrlEntry
                    };
                }
                public static final class FrsldSmplCtrlEntryEnt extends MIBEntry<FRSLDMIBDef>
                {
                    public final FrsldSmplCtrlIdxEnt frsldSmplCtrlIdx;

                    public final FrsldSmplCtrlStatusEnt frsldSmplCtrlStatus;

                    public final FrsldSmplCtrlColPeriodEnt frsldSmplCtrlColPeriod;

                    public final FrsldSmplCtrlBucketsEnt frsldSmplCtrlBuckets;

                    public final FrsldSmplCtrlBucketsGrantedEnt frsldSmplCtrlBucketsGranted;

                    private FrsldSmplCtrlEntryEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldSmplCtrlEntry", "1.3.6.1.2.1.95.1.2.1", false, false, false, true);
                        this.frsldSmplCtrlIdx = new FrsldSmplCtrlIdxEnt(mib, this);
                        this.frsldSmplCtrlStatus = new FrsldSmplCtrlStatusEnt(mib, this);
                        this.frsldSmplCtrlColPeriod = new FrsldSmplCtrlColPeriodEnt(mib, this);
                        this.frsldSmplCtrlBuckets = new FrsldSmplCtrlBucketsEnt(mib, this);
                        this.frsldSmplCtrlBucketsGranted = new FrsldSmplCtrlBucketsGrantedEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.frsldSmplCtrlIdx,
                            this.frsldSmplCtrlStatus,
                            this.frsldSmplCtrlColPeriod,
                            this.frsldSmplCtrlBuckets,
                            this.frsldSmplCtrlBucketsGranted
                        };
                    }
                    public static final class FrsldSmplCtrlIdxEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldSmplCtrlIdxEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldSmplCtrlIdx", "1.3.6.1.2.1.95.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldSmplCtrlStatusEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldSmplCtrlStatusEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldSmplCtrlStatus", "1.3.6.1.2.1.95.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldSmplCtrlColPeriodEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldSmplCtrlColPeriodEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldSmplCtrlColPeriod", "1.3.6.1.2.1.95.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldSmplCtrlBucketsEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldSmplCtrlBucketsEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldSmplCtrlBuckets", "1.3.6.1.2.1.95.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldSmplCtrlBucketsGrantedEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldSmplCtrlBucketsGrantedEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldSmplCtrlBucketsGranted", "1.3.6.1.2.1.95.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FrsldPvcDataTableEnt extends MIBEntry<FRSLDMIBDef>
            {
                public final FrsldPvcDataEntryEnt frsldPvcDataEntry;

                private FrsldPvcDataTableEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                {
                    super(mib, parent, "frsldPvcDataTable", "1.3.6.1.2.1.95.1.3", false, true, false, false);
                    this.frsldPvcDataEntry = new FrsldPvcDataEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frsldPvcDataEntry
                    };
                }
                public static final class FrsldPvcDataEntryEnt extends MIBEntry<FRSLDMIBDef>
                {
                    public final FrsldPvcDataMissedPollsEnt frsldPvcDataMissedPolls;

                    public final FrsldPvcDataFrDeliveredCEnt frsldPvcDataFrDeliveredC;

                    public final FrsldPvcDataFrDeliveredEEnt frsldPvcDataFrDeliveredE;

                    public final FrsldPvcDataFrOfferedCEnt frsldPvcDataFrOfferedC;

                    public final FrsldPvcDataFrOfferedEEnt frsldPvcDataFrOfferedE;

                    public final FrsldPvcDataDataDeliveredCEnt frsldPvcDataDataDeliveredC;

                    public final FrsldPvcDataDataDeliveredEEnt frsldPvcDataDataDeliveredE;

                    public final FrsldPvcDataDataOfferedCEnt frsldPvcDataDataOfferedC;

                    public final FrsldPvcDataDataOfferedEEnt frsldPvcDataDataOfferedE;

                    public final FrsldPvcDataHCFrDeliveredCEnt frsldPvcDataHCFrDeliveredC;

                    public final FrsldPvcDataHCFrDeliveredEEnt frsldPvcDataHCFrDeliveredE;

                    public final FrsldPvcDataHCFrOfferedCEnt frsldPvcDataHCFrOfferedC;

                    public final FrsldPvcDataHCFrOfferedEEnt frsldPvcDataHCFrOfferedE;

                    public final FrsldPvcDataHCDataDeliveredCEnt frsldPvcDataHCDataDeliveredC;

                    public final FrsldPvcDataHCDataDeliveredEEnt frsldPvcDataHCDataDeliveredE;

                    public final FrsldPvcDataHCDataOfferedCEnt frsldPvcDataHCDataOfferedC;

                    public final FrsldPvcDataHCDataOfferedEEnt frsldPvcDataHCDataOfferedE;

                    public final FrsldPvcDataUnavailableTimeEnt frsldPvcDataUnavailableTime;

                    public final FrsldPvcDataUnavailablesEnt frsldPvcDataUnavailables;

                    private FrsldPvcDataEntryEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldPvcDataEntry", "1.3.6.1.2.1.95.1.3.1", false, false, false, true);
                        this.frsldPvcDataMissedPolls = new FrsldPvcDataMissedPollsEnt(mib, this);
                        this.frsldPvcDataFrDeliveredC = new FrsldPvcDataFrDeliveredCEnt(mib, this);
                        this.frsldPvcDataFrDeliveredE = new FrsldPvcDataFrDeliveredEEnt(mib, this);
                        this.frsldPvcDataFrOfferedC = new FrsldPvcDataFrOfferedCEnt(mib, this);
                        this.frsldPvcDataFrOfferedE = new FrsldPvcDataFrOfferedEEnt(mib, this);
                        this.frsldPvcDataDataDeliveredC = new FrsldPvcDataDataDeliveredCEnt(mib, this);
                        this.frsldPvcDataDataDeliveredE = new FrsldPvcDataDataDeliveredEEnt(mib, this);
                        this.frsldPvcDataDataOfferedC = new FrsldPvcDataDataOfferedCEnt(mib, this);
                        this.frsldPvcDataDataOfferedE = new FrsldPvcDataDataOfferedEEnt(mib, this);
                        this.frsldPvcDataHCFrDeliveredC = new FrsldPvcDataHCFrDeliveredCEnt(mib, this);
                        this.frsldPvcDataHCFrDeliveredE = new FrsldPvcDataHCFrDeliveredEEnt(mib, this);
                        this.frsldPvcDataHCFrOfferedC = new FrsldPvcDataHCFrOfferedCEnt(mib, this);
                        this.frsldPvcDataHCFrOfferedE = new FrsldPvcDataHCFrOfferedEEnt(mib, this);
                        this.frsldPvcDataHCDataDeliveredC = new FrsldPvcDataHCDataDeliveredCEnt(mib, this);
                        this.frsldPvcDataHCDataDeliveredE = new FrsldPvcDataHCDataDeliveredEEnt(mib, this);
                        this.frsldPvcDataHCDataOfferedC = new FrsldPvcDataHCDataOfferedCEnt(mib, this);
                        this.frsldPvcDataHCDataOfferedE = new FrsldPvcDataHCDataOfferedEEnt(mib, this);
                        this.frsldPvcDataUnavailableTime = new FrsldPvcDataUnavailableTimeEnt(mib, this);
                        this.frsldPvcDataUnavailables = new FrsldPvcDataUnavailablesEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.frsldPvcDataMissedPolls,
                            this.frsldPvcDataFrDeliveredC,
                            this.frsldPvcDataFrDeliveredE,
                            this.frsldPvcDataFrOfferedC,
                            this.frsldPvcDataFrOfferedE,
                            this.frsldPvcDataDataDeliveredC,
                            this.frsldPvcDataDataDeliveredE,
                            this.frsldPvcDataDataOfferedC,
                            this.frsldPvcDataDataOfferedE,
                            this.frsldPvcDataHCFrDeliveredC,
                            this.frsldPvcDataHCFrDeliveredE,
                            this.frsldPvcDataHCFrOfferedC,
                            this.frsldPvcDataHCFrOfferedE,
                            this.frsldPvcDataHCDataDeliveredC,
                            this.frsldPvcDataHCDataDeliveredE,
                            this.frsldPvcDataHCDataOfferedC,
                            this.frsldPvcDataHCDataOfferedE,
                            this.frsldPvcDataUnavailableTime,
                            this.frsldPvcDataUnavailables
                        };
                    }
                    public static final class FrsldPvcDataMissedPollsEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataMissedPollsEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataMissedPolls", "1.3.6.1.2.1.95.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataFrDeliveredCEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataFrDeliveredCEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataFrDeliveredC", "1.3.6.1.2.1.95.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataFrDeliveredEEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataFrDeliveredEEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataFrDeliveredE", "1.3.6.1.2.1.95.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataFrOfferedCEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataFrOfferedCEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataFrOfferedC", "1.3.6.1.2.1.95.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataFrOfferedEEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataFrOfferedEEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataFrOfferedE", "1.3.6.1.2.1.95.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataDataDeliveredCEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataDataDeliveredCEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataDataDeliveredC", "1.3.6.1.2.1.95.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataDataDeliveredEEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataDataDeliveredEEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataDataDeliveredE", "1.3.6.1.2.1.95.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataDataOfferedCEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataDataOfferedCEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataDataOfferedC", "1.3.6.1.2.1.95.1.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataDataOfferedEEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataDataOfferedEEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataDataOfferedE", "1.3.6.1.2.1.95.1.3.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataHCFrDeliveredCEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataHCFrDeliveredCEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataHCFrDeliveredC", "1.3.6.1.2.1.95.1.3.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataHCFrDeliveredEEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataHCFrDeliveredEEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataHCFrDeliveredE", "1.3.6.1.2.1.95.1.3.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataHCFrOfferedCEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataHCFrOfferedCEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataHCFrOfferedC", "1.3.6.1.2.1.95.1.3.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataHCFrOfferedEEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataHCFrOfferedEEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataHCFrOfferedE", "1.3.6.1.2.1.95.1.3.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataHCDataDeliveredCEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataHCDataDeliveredCEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataHCDataDeliveredC", "1.3.6.1.2.1.95.1.3.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataHCDataDeliveredEEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataHCDataDeliveredEEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataHCDataDeliveredE", "1.3.6.1.2.1.95.1.3.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataHCDataOfferedCEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataHCDataOfferedCEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataHCDataOfferedC", "1.3.6.1.2.1.95.1.3.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataHCDataOfferedEEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataHCDataOfferedEEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataHCDataOfferedE", "1.3.6.1.2.1.95.1.3.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataUnavailableTimeEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataUnavailableTimeEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataUnavailableTime", "1.3.6.1.2.1.95.1.3.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcDataUnavailablesEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcDataUnavailablesEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcDataUnavailables", "1.3.6.1.2.1.95.1.3.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FrsldPvcSampleTableEnt extends MIBEntry<FRSLDMIBDef>
            {
                public final FrsldPvcSampleEntryEnt frsldPvcSampleEntry;

                private FrsldPvcSampleTableEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                {
                    super(mib, parent, "frsldPvcSampleTable", "1.3.6.1.2.1.95.1.4", false, true, false, false);
                    this.frsldPvcSampleEntry = new FrsldPvcSampleEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frsldPvcSampleEntry
                    };
                }
                public static final class FrsldPvcSampleEntryEnt extends MIBEntry<FRSLDMIBDef>
                {
                    public final FrsldPvcSmplIdxEnt frsldPvcSmplIdx;

                    public final FrsldPvcSmplDelayMinEnt frsldPvcSmplDelayMin;

                    public final FrsldPvcSmplDelayMaxEnt frsldPvcSmplDelayMax;

                    public final FrsldPvcSmplDelayAvgEnt frsldPvcSmplDelayAvg;

                    public final FrsldPvcSmplMissedPollsEnt frsldPvcSmplMissedPolls;

                    public final FrsldPvcSmplFrDeliveredCEnt frsldPvcSmplFrDeliveredC;

                    public final FrsldPvcSmplFrDeliveredEEnt frsldPvcSmplFrDeliveredE;

                    public final FrsldPvcSmplFrOfferedCEnt frsldPvcSmplFrOfferedC;

                    public final FrsldPvcSmplFrOfferedEEnt frsldPvcSmplFrOfferedE;

                    public final FrsldPvcSmplDataDeliveredCEnt frsldPvcSmplDataDeliveredC;

                    public final FrsldPvcSmplDataDeliveredEEnt frsldPvcSmplDataDeliveredE;

                    public final FrsldPvcSmplDataOfferedCEnt frsldPvcSmplDataOfferedC;

                    public final FrsldPvcSmplDataOfferedEEnt frsldPvcSmplDataOfferedE;

                    public final FrsldPvcSmplHCFrDeliveredCEnt frsldPvcSmplHCFrDeliveredC;

                    public final FrsldPvcSmplHCFrDeliveredEEnt frsldPvcSmplHCFrDeliveredE;

                    public final FrsldPvcSmplHCFrOfferedCEnt frsldPvcSmplHCFrOfferedC;

                    public final FrsldPvcSmplHCFrOfferedEEnt frsldPvcSmplHCFrOfferedE;

                    public final FrsldPvcSmplHCDataDeliveredCEnt frsldPvcSmplHCDataDeliveredC;

                    public final FrsldPvcSmplHCDataDeliveredEEnt frsldPvcSmplHCDataDeliveredE;

                    public final FrsldPvcSmplHCDataOfferedCEnt frsldPvcSmplHCDataOfferedC;

                    public final FrsldPvcSmplHCDataOfferedEEnt frsldPvcSmplHCDataOfferedE;

                    public final FrsldPvcSmplUnavailableTimeEnt frsldPvcSmplUnavailableTime;

                    public final FrsldPvcSmplUnavailablesEnt frsldPvcSmplUnavailables;

                    public final FrsldPvcSmplStartTimeEnt frsldPvcSmplStartTime;

                    public final FrsldPvcSmplEndTimeEnt frsldPvcSmplEndTime;

                    private FrsldPvcSampleEntryEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldPvcSampleEntry", "1.3.6.1.2.1.95.1.4.1", false, false, false, true);
                        this.frsldPvcSmplIdx = new FrsldPvcSmplIdxEnt(mib, this);
                        this.frsldPvcSmplDelayMin = new FrsldPvcSmplDelayMinEnt(mib, this);
                        this.frsldPvcSmplDelayMax = new FrsldPvcSmplDelayMaxEnt(mib, this);
                        this.frsldPvcSmplDelayAvg = new FrsldPvcSmplDelayAvgEnt(mib, this);
                        this.frsldPvcSmplMissedPolls = new FrsldPvcSmplMissedPollsEnt(mib, this);
                        this.frsldPvcSmplFrDeliveredC = new FrsldPvcSmplFrDeliveredCEnt(mib, this);
                        this.frsldPvcSmplFrDeliveredE = new FrsldPvcSmplFrDeliveredEEnt(mib, this);
                        this.frsldPvcSmplFrOfferedC = new FrsldPvcSmplFrOfferedCEnt(mib, this);
                        this.frsldPvcSmplFrOfferedE = new FrsldPvcSmplFrOfferedEEnt(mib, this);
                        this.frsldPvcSmplDataDeliveredC = new FrsldPvcSmplDataDeliveredCEnt(mib, this);
                        this.frsldPvcSmplDataDeliveredE = new FrsldPvcSmplDataDeliveredEEnt(mib, this);
                        this.frsldPvcSmplDataOfferedC = new FrsldPvcSmplDataOfferedCEnt(mib, this);
                        this.frsldPvcSmplDataOfferedE = new FrsldPvcSmplDataOfferedEEnt(mib, this);
                        this.frsldPvcSmplHCFrDeliveredC = new FrsldPvcSmplHCFrDeliveredCEnt(mib, this);
                        this.frsldPvcSmplHCFrDeliveredE = new FrsldPvcSmplHCFrDeliveredEEnt(mib, this);
                        this.frsldPvcSmplHCFrOfferedC = new FrsldPvcSmplHCFrOfferedCEnt(mib, this);
                        this.frsldPvcSmplHCFrOfferedE = new FrsldPvcSmplHCFrOfferedEEnt(mib, this);
                        this.frsldPvcSmplHCDataDeliveredC = new FrsldPvcSmplHCDataDeliveredCEnt(mib, this);
                        this.frsldPvcSmplHCDataDeliveredE = new FrsldPvcSmplHCDataDeliveredEEnt(mib, this);
                        this.frsldPvcSmplHCDataOfferedC = new FrsldPvcSmplHCDataOfferedCEnt(mib, this);
                        this.frsldPvcSmplHCDataOfferedE = new FrsldPvcSmplHCDataOfferedEEnt(mib, this);
                        this.frsldPvcSmplUnavailableTime = new FrsldPvcSmplUnavailableTimeEnt(mib, this);
                        this.frsldPvcSmplUnavailables = new FrsldPvcSmplUnavailablesEnt(mib, this);
                        this.frsldPvcSmplStartTime = new FrsldPvcSmplStartTimeEnt(mib, this);
                        this.frsldPvcSmplEndTime = new FrsldPvcSmplEndTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.frsldPvcSmplIdx,
                            this.frsldPvcSmplDelayMin,
                            this.frsldPvcSmplDelayMax,
                            this.frsldPvcSmplDelayAvg,
                            this.frsldPvcSmplMissedPolls,
                            this.frsldPvcSmplFrDeliveredC,
                            this.frsldPvcSmplFrDeliveredE,
                            this.frsldPvcSmplFrOfferedC,
                            this.frsldPvcSmplFrOfferedE,
                            this.frsldPvcSmplDataDeliveredC,
                            this.frsldPvcSmplDataDeliveredE,
                            this.frsldPvcSmplDataOfferedC,
                            this.frsldPvcSmplDataOfferedE,
                            this.frsldPvcSmplHCFrDeliveredC,
                            this.frsldPvcSmplHCFrDeliveredE,
                            this.frsldPvcSmplHCFrOfferedC,
                            this.frsldPvcSmplHCFrOfferedE,
                            this.frsldPvcSmplHCDataDeliveredC,
                            this.frsldPvcSmplHCDataDeliveredE,
                            this.frsldPvcSmplHCDataOfferedC,
                            this.frsldPvcSmplHCDataOfferedE,
                            this.frsldPvcSmplUnavailableTime,
                            this.frsldPvcSmplUnavailables,
                            this.frsldPvcSmplStartTime,
                            this.frsldPvcSmplEndTime
                        };
                    }
                    public static final class FrsldPvcSmplIdxEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplIdxEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplIdx", "1.3.6.1.2.1.95.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplDelayMinEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplDelayMinEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplDelayMin", "1.3.6.1.2.1.95.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplDelayMaxEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplDelayMaxEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplDelayMax", "1.3.6.1.2.1.95.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplDelayAvgEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplDelayAvgEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplDelayAvg", "1.3.6.1.2.1.95.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplMissedPollsEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplMissedPollsEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplMissedPolls", "1.3.6.1.2.1.95.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplFrDeliveredCEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplFrDeliveredCEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplFrDeliveredC", "1.3.6.1.2.1.95.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplFrDeliveredEEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplFrDeliveredEEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplFrDeliveredE", "1.3.6.1.2.1.95.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplFrOfferedCEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplFrOfferedCEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplFrOfferedC", "1.3.6.1.2.1.95.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplFrOfferedEEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplFrOfferedEEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplFrOfferedE", "1.3.6.1.2.1.95.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplDataDeliveredCEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplDataDeliveredCEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplDataDeliveredC", "1.3.6.1.2.1.95.1.4.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplDataDeliveredEEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplDataDeliveredEEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplDataDeliveredE", "1.3.6.1.2.1.95.1.4.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplDataOfferedCEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplDataOfferedCEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplDataOfferedC", "1.3.6.1.2.1.95.1.4.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplDataOfferedEEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplDataOfferedEEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplDataOfferedE", "1.3.6.1.2.1.95.1.4.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplHCFrDeliveredCEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplHCFrDeliveredCEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplHCFrDeliveredC", "1.3.6.1.2.1.95.1.4.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplHCFrDeliveredEEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplHCFrDeliveredEEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplHCFrDeliveredE", "1.3.6.1.2.1.95.1.4.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplHCFrOfferedCEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplHCFrOfferedCEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplHCFrOfferedC", "1.3.6.1.2.1.95.1.4.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplHCFrOfferedEEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplHCFrOfferedEEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplHCFrOfferedE", "1.3.6.1.2.1.95.1.4.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplHCDataDeliveredCEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplHCDataDeliveredCEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplHCDataDeliveredC", "1.3.6.1.2.1.95.1.4.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplHCDataDeliveredEEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplHCDataDeliveredEEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplHCDataDeliveredE", "1.3.6.1.2.1.95.1.4.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplHCDataOfferedCEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplHCDataOfferedCEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplHCDataOfferedC", "1.3.6.1.2.1.95.1.4.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplHCDataOfferedEEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplHCDataOfferedEEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplHCDataOfferedE", "1.3.6.1.2.1.95.1.4.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplUnavailableTimeEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplUnavailableTimeEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplUnavailableTime", "1.3.6.1.2.1.95.1.4.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplUnavailablesEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplUnavailablesEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplUnavailables", "1.3.6.1.2.1.95.1.4.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplStartTimeEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplStartTimeEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplStartTime", "1.3.6.1.2.1.95.1.4.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrsldPvcSmplEndTimeEnt extends MIBEntry<FRSLDMIBDef>
                    {
                        private FrsldPvcSmplEndTimeEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                        {
                            super(mib, parent, "frsldPvcSmplEndTime", "1.3.6.1.2.1.95.1.4.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class FrsldCapabilitiesEnt extends MIBEntry<FRSLDMIBDef>
        {
            /** Capabilities GroupThis group provides capabilities objects for the tablesthat control configuration.*/
            public final FrsldPvcCtrlWriteCapsEnt frsldPvcCtrlWriteCaps;

            public final FrsldSmplCtrlWriteCapsEnt frsldSmplCtrlWriteCaps;

            public final FrsldRPCapsEnt frsldRPCaps;

            public final FrsldMaxPvcCtrlsEnt frsldMaxPvcCtrls;

            public final FrsldNumPvcCtrlsEnt frsldNumPvcCtrls;

            public final FrsldMaxSmplCtrlsEnt frsldMaxSmplCtrls;

            public final FrsldNumSmplCtrlsEnt frsldNumSmplCtrls;

            private FrsldCapabilitiesEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
            {
                super(mib, parent, "frsldCapabilities", "1.3.6.1.2.1.95.2", false, false, false, false);
                this.frsldPvcCtrlWriteCaps = new FrsldPvcCtrlWriteCapsEnt(mib, this);
                this.frsldSmplCtrlWriteCaps = new FrsldSmplCtrlWriteCapsEnt(mib, this);
                this.frsldRPCaps = new FrsldRPCapsEnt(mib, this);
                this.frsldMaxPvcCtrls = new FrsldMaxPvcCtrlsEnt(mib, this);
                this.frsldNumPvcCtrls = new FrsldNumPvcCtrlsEnt(mib, this);
                this.frsldMaxSmplCtrls = new FrsldMaxSmplCtrlsEnt(mib, this);
                this.frsldNumSmplCtrls = new FrsldNumSmplCtrlsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frsldPvcCtrlWriteCaps,
                    this.frsldSmplCtrlWriteCaps,
                    this.frsldRPCaps,
                    this.frsldMaxPvcCtrls,
                    this.frsldNumPvcCtrls,
                    this.frsldMaxSmplCtrls,
                    this.frsldNumSmplCtrls
                };
            }
            public static final class FrsldPvcCtrlWriteCapsEnt extends MIBEntry<FRSLDMIBDef>
            {
                private FrsldPvcCtrlWriteCapsEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                {
                    super(mib, parent, "frsldPvcCtrlWriteCaps", "1.3.6.1.2.1.95.2.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class FrsldSmplCtrlWriteCapsEnt extends MIBEntry<FRSLDMIBDef>
            {
                private FrsldSmplCtrlWriteCapsEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                {
                    super(mib, parent, "frsldSmplCtrlWriteCaps", "1.3.6.1.2.1.95.2.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class FrsldRPCapsEnt extends MIBEntry<FRSLDMIBDef>
            {
                private FrsldRPCapsEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                {
                    super(mib, parent, "frsldRPCaps", "1.3.6.1.2.1.95.2.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class FrsldMaxPvcCtrlsEnt extends MIBEntry<FRSLDMIBDef>
            {
                private FrsldMaxPvcCtrlsEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                {
                    super(mib, parent, "frsldMaxPvcCtrls", "1.3.6.1.2.1.95.2.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class FrsldNumPvcCtrlsEnt extends MIBEntry<FRSLDMIBDef>
            {
                private FrsldNumPvcCtrlsEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                {
                    super(mib, parent, "frsldNumPvcCtrls", "1.3.6.1.2.1.95.2.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class FrsldMaxSmplCtrlsEnt extends MIBEntry<FRSLDMIBDef>
            {
                private FrsldMaxSmplCtrlsEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                {
                    super(mib, parent, "frsldMaxSmplCtrls", "1.3.6.1.2.1.95.2.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class FrsldNumSmplCtrlsEnt extends MIBEntry<FRSLDMIBDef>
            {
                private FrsldNumSmplCtrlsEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                {
                    super(mib, parent, "frsldNumSmplCtrls", "1.3.6.1.2.1.95.2.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class FrsldConformanceEnt extends MIBEntry<FRSLDMIBDef>
        {
            /** Conformance Information*/
            public final FrsldMIBGroupsEnt frsldMIBGroups;

            public final FrsldMIBCompliancesEnt frsldMIBCompliances;

            private FrsldConformanceEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
            {
                super(mib, parent, "frsldConformance", "1.3.6.1.2.1.95.3", false, false, false, false);
                this.frsldMIBGroups = new FrsldMIBGroupsEnt(mib, this);
                this.frsldMIBCompliances = new FrsldMIBCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frsldMIBGroups,
                    this.frsldMIBCompliances
                };
            }
            public static final class FrsldMIBGroupsEnt extends MIBEntry<FRSLDMIBDef>
            {
                /** Units of Conformance*/
                public final FrsldPvcReqCtrlGroupEnt frsldPvcReqCtrlGroup;

                public final FrsldPvcPacketGroupEnt frsldPvcPacketGroup;

                public final FrsldPvcDelayCtrlGroupEnt frsldPvcDelayCtrlGroup;

                public final FrsldPvcSampleCtrlGroupEnt frsldPvcSampleCtrlGroup;

                public final FrsldPvcReqDataGroupEnt frsldPvcReqDataGroup;

                public final FrsldPvcDelayDataGroupEnt frsldPvcDelayDataGroup;

                public final FrsldPvcHCFrameDataGroupEnt frsldPvcHCFrameDataGroup;

                public final FrsldPvcHCOctetDataGroupEnt frsldPvcHCOctetDataGroup;

                public final FrsldPvcSampleDelayGroupEnt frsldPvcSampleDelayGroup;

                public final FrsldPvcSampleDataGroupEnt frsldPvcSampleDataGroup;

                public final FrsldPvcSampleHCFrameGroupEnt frsldPvcSampleHCFrameGroup;

                public final FrsldPvcSampleHCDataGroupEnt frsldPvcSampleHCDataGroup;

                public final FrsldPvcSampleAvailGroupEnt frsldPvcSampleAvailGroup;

                public final FrsldPvcSampleGeneralGroupEnt frsldPvcSampleGeneralGroup;

                public final FrsldCapabilitiesGroupEnt frsldCapabilitiesGroup;

                private FrsldMIBGroupsEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                {
                    super(mib, parent, "frsldMIBGroups", "1.3.6.1.2.1.95.3.1", false, false, false, false);
                    this.frsldPvcReqCtrlGroup = new FrsldPvcReqCtrlGroupEnt(mib, this);
                    this.frsldPvcPacketGroup = new FrsldPvcPacketGroupEnt(mib, this);
                    this.frsldPvcDelayCtrlGroup = new FrsldPvcDelayCtrlGroupEnt(mib, this);
                    this.frsldPvcSampleCtrlGroup = new FrsldPvcSampleCtrlGroupEnt(mib, this);
                    this.frsldPvcReqDataGroup = new FrsldPvcReqDataGroupEnt(mib, this);
                    this.frsldPvcDelayDataGroup = new FrsldPvcDelayDataGroupEnt(mib, this);
                    this.frsldPvcHCFrameDataGroup = new FrsldPvcHCFrameDataGroupEnt(mib, this);
                    this.frsldPvcHCOctetDataGroup = new FrsldPvcHCOctetDataGroupEnt(mib, this);
                    this.frsldPvcSampleDelayGroup = new FrsldPvcSampleDelayGroupEnt(mib, this);
                    this.frsldPvcSampleDataGroup = new FrsldPvcSampleDataGroupEnt(mib, this);
                    this.frsldPvcSampleHCFrameGroup = new FrsldPvcSampleHCFrameGroupEnt(mib, this);
                    this.frsldPvcSampleHCDataGroup = new FrsldPvcSampleHCDataGroupEnt(mib, this);
                    this.frsldPvcSampleAvailGroup = new FrsldPvcSampleAvailGroupEnt(mib, this);
                    this.frsldPvcSampleGeneralGroup = new FrsldPvcSampleGeneralGroupEnt(mib, this);
                    this.frsldCapabilitiesGroup = new FrsldCapabilitiesGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frsldPvcReqCtrlGroup,
                        this.frsldPvcPacketGroup,
                        this.frsldPvcDelayCtrlGroup,
                        this.frsldPvcSampleCtrlGroup,
                        this.frsldPvcReqDataGroup,
                        this.frsldPvcDelayDataGroup,
                        this.frsldPvcHCFrameDataGroup,
                        this.frsldPvcHCOctetDataGroup,
                        this.frsldPvcSampleDelayGroup,
                        this.frsldPvcSampleDataGroup,
                        this.frsldPvcSampleHCFrameGroup,
                        this.frsldPvcSampleHCDataGroup,
                        this.frsldPvcSampleAvailGroup,
                        this.frsldPvcSampleGeneralGroup,
                        this.frsldCapabilitiesGroup
                    };
                }
                public static final class FrsldPvcReqCtrlGroupEnt extends MIBEntry<FRSLDMIBDef>
                {
                    private FrsldPvcReqCtrlGroupEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldPvcReqCtrlGroup", "1.3.6.1.2.1.95.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrsldPvcPacketGroupEnt extends MIBEntry<FRSLDMIBDef>
                {
                    private FrsldPvcPacketGroupEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldPvcPacketGroup", "1.3.6.1.2.1.95.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrsldPvcDelayCtrlGroupEnt extends MIBEntry<FRSLDMIBDef>
                {
                    private FrsldPvcDelayCtrlGroupEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldPvcDelayCtrlGroup", "1.3.6.1.2.1.95.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrsldPvcSampleCtrlGroupEnt extends MIBEntry<FRSLDMIBDef>
                {
                    private FrsldPvcSampleCtrlGroupEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldPvcSampleCtrlGroup", "1.3.6.1.2.1.95.3.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrsldPvcReqDataGroupEnt extends MIBEntry<FRSLDMIBDef>
                {
                    private FrsldPvcReqDataGroupEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldPvcReqDataGroup", "1.3.6.1.2.1.95.3.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrsldPvcDelayDataGroupEnt extends MIBEntry<FRSLDMIBDef>
                {
                    private FrsldPvcDelayDataGroupEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldPvcDelayDataGroup", "1.3.6.1.2.1.95.3.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrsldPvcHCFrameDataGroupEnt extends MIBEntry<FRSLDMIBDef>
                {
                    private FrsldPvcHCFrameDataGroupEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldPvcHCFrameDataGroup", "1.3.6.1.2.1.95.3.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrsldPvcHCOctetDataGroupEnt extends MIBEntry<FRSLDMIBDef>
                {
                    private FrsldPvcHCOctetDataGroupEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldPvcHCOctetDataGroup", "1.3.6.1.2.1.95.3.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrsldPvcSampleDelayGroupEnt extends MIBEntry<FRSLDMIBDef>
                {
                    private FrsldPvcSampleDelayGroupEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldPvcSampleDelayGroup", "1.3.6.1.2.1.95.3.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrsldPvcSampleDataGroupEnt extends MIBEntry<FRSLDMIBDef>
                {
                    private FrsldPvcSampleDataGroupEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldPvcSampleDataGroup", "1.3.6.1.2.1.95.3.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrsldPvcSampleHCFrameGroupEnt extends MIBEntry<FRSLDMIBDef>
                {
                    private FrsldPvcSampleHCFrameGroupEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldPvcSampleHCFrameGroup", "1.3.6.1.2.1.95.3.1.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrsldPvcSampleHCDataGroupEnt extends MIBEntry<FRSLDMIBDef>
                {
                    private FrsldPvcSampleHCDataGroupEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldPvcSampleHCDataGroup", "1.3.6.1.2.1.95.3.1.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrsldPvcSampleAvailGroupEnt extends MIBEntry<FRSLDMIBDef>
                {
                    private FrsldPvcSampleAvailGroupEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldPvcSampleAvailGroup", "1.3.6.1.2.1.95.3.1.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrsldPvcSampleGeneralGroupEnt extends MIBEntry<FRSLDMIBDef>
                {
                    private FrsldPvcSampleGeneralGroupEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldPvcSampleGeneralGroup", "1.3.6.1.2.1.95.3.1.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrsldCapabilitiesGroupEnt extends MIBEntry<FRSLDMIBDef>
                {
                    private FrsldCapabilitiesGroupEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldCapabilitiesGroup", "1.3.6.1.2.1.95.3.1.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class FrsldMIBCompliancesEnt extends MIBEntry<FRSLDMIBDef>
            {
                /** Compliance Statements*/
                public final FrsldComplianceEnt frsldCompliance;

                private FrsldMIBCompliancesEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                {
                    super(mib, parent, "frsldMIBCompliances", "1.3.6.1.2.1.95.3.2", false, false, false, false);
                    this.frsldCompliance = new FrsldComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frsldCompliance
                    };
                }
                public static final class FrsldComplianceEnt extends MIBEntry<FRSLDMIBDef>
                {
                    private FrsldComplianceEnt(FRSLDMIBDef mib, MIBEntry<FRSLDMIBDef> parent)
                    {
                        super(mib, parent, "frsldCompliance", "1.3.6.1.2.1.95.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
