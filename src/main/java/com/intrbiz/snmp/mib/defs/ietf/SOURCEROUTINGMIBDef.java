package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class SOURCEROUTINGMIBDef extends MIB
{
    public static final SOURCEROUTINGMIBDef SOURCEROUTINGMIB = new SOURCEROUTINGMIBDef();

    /** groups in the SR MIB
dot1dSr is imported from the Bridge MIB*/
    public final Dot1dPortPairEnt dot1dPortPair;

    /** the dot1dSr group
this group is implemented by those bridges thatsupport the source route bridging mode, including SourceRouting and SRT bridges.*/
    public final Dot1dSrPortTableEnt dot1dSrPortTable;

    /** scalar object in dot1dSr*/
    public final Dot1dSrBridgeLfModeEnt dot1dSrBridgeLfMode;

    private SOURCEROUTINGMIBDef()
    {
        super("SOURCE-ROUTING-MIB");
        this.dot1dPortPair = new Dot1dPortPairEnt(this, null);
        this.dot1dSrPortTable = new Dot1dSrPortTableEnt(this, null);
        this.dot1dSrBridgeLfMode = new Dot1dSrBridgeLfModeEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dot1dPortPair,
            this.dot1dSrPortTable,
            this.dot1dSrBridgeLfMode
        };
    }

    public static final class Dot1dPortPairEnt extends MIBEntry<SOURCEROUTINGMIBDef>
    {
        /** The Port-Pair Database
Implementation of this group is optional.
This group is implemented by those bridges that supportthe direct multiport model of the source route bridgingmode as defined in the IEEE 802.5 SRT Addendum to802.1d.
Bridges implementing this group may report 65535 fordot1dSrPortBridgeNumber and dot1dSrPortTargetSegment,indicating that those objects are not applicable.*/
        public final Dot1dPortPairTableSizeEnt dot1dPortPairTableSize;

        /** the Bridge Port-Pair table
this table represents port pairs within a bridge forminga unique bridge path, as defined in the IEEE 802.5M SRTAddendum.*/
        public final Dot1dPortPairTableEnt dot1dPortPairTable;

        private Dot1dPortPairEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
        {
            super(mib, parent, "dot1dPortPair", "1.3.6.1.2.1.17.10", false, false, false, false);
            this.dot1dPortPairTableSize = new Dot1dPortPairTableSizeEnt(mib, this);
            this.dot1dPortPairTable = new Dot1dPortPairTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dot1dPortPairTableSize,
                this.dot1dPortPairTable
            };
        }
        public static final class Dot1dPortPairTableSizeEnt extends MIBEntry<SOURCEROUTINGMIBDef>
        {
            private Dot1dPortPairTableSizeEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
            {
                super(mib, parent, "dot1dPortPairTableSize", "1.3.6.1.2.1.17.10.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot1dPortPairTableEnt extends MIBEntry<SOURCEROUTINGMIBDef>
        {
            public final Dot1dPortPairEntryEnt dot1dPortPairEntry;

            private Dot1dPortPairTableEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
            {
                super(mib, parent, "dot1dPortPairTable", "1.3.6.1.2.1.17.10.2", false, true, false, false);
                this.dot1dPortPairEntry = new Dot1dPortPairEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot1dPortPairEntry
                };
            }
            public static final class Dot1dPortPairEntryEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                public final Dot1dPortPairLowPortEnt dot1dPortPairLowPort;

                public final Dot1dPortPairHighPortEnt dot1dPortPairHighPort;

                public final Dot1dPortPairBridgeNumEnt dot1dPortPairBridgeNum;

                public final Dot1dPortPairBridgeStateEnt dot1dPortPairBridgeState;

                private Dot1dPortPairEntryEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dPortPairEntry", "1.3.6.1.2.1.17.10.2.1", false, false, false, true);
                    this.dot1dPortPairLowPort = new Dot1dPortPairLowPortEnt(mib, this);
                    this.dot1dPortPairHighPort = new Dot1dPortPairHighPortEnt(mib, this);
                    this.dot1dPortPairBridgeNum = new Dot1dPortPairBridgeNumEnt(mib, this);
                    this.dot1dPortPairBridgeState = new Dot1dPortPairBridgeStateEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot1dPortPairLowPort,
                        this.dot1dPortPairHighPort,
                        this.dot1dPortPairBridgeNum,
                        this.dot1dPortPairBridgeState
                    };
                }
                public static final class Dot1dPortPairLowPortEnt extends MIBEntry<SOURCEROUTINGMIBDef>
                {
                    private Dot1dPortPairLowPortEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                    {
                        super(mib, parent, "dot1dPortPairLowPort", "1.3.6.1.2.1.17.10.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1dPortPairHighPortEnt extends MIBEntry<SOURCEROUTINGMIBDef>
                {
                    private Dot1dPortPairHighPortEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                    {
                        super(mib, parent, "dot1dPortPairHighPort", "1.3.6.1.2.1.17.10.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1dPortPairBridgeNumEnt extends MIBEntry<SOURCEROUTINGMIBDef>
                {
                    private Dot1dPortPairBridgeNumEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                    {
                        super(mib, parent, "dot1dPortPairBridgeNum", "1.3.6.1.2.1.17.10.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1dPortPairBridgeStateEnt extends MIBEntry<SOURCEROUTINGMIBDef>
                {
                    private Dot1dPortPairBridgeStateEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                    {
                        super(mib, parent, "dot1dPortPairBridgeState", "1.3.6.1.2.1.17.10.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class Dot1dSrPortTableEnt extends MIBEntry<SOURCEROUTINGMIBDef>
    {
        public final Dot1dSrPortEntryEnt dot1dSrPortEntry;

        private Dot1dSrPortTableEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
        {
            super(mib, parent, "dot1dSrPortTable", "1.3.6.1.2.1.17.3.1", false, true, false, false);
            this.dot1dSrPortEntry = new Dot1dSrPortEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dot1dSrPortEntry
            };
        }
        public static final class Dot1dSrPortEntryEnt extends MIBEntry<SOURCEROUTINGMIBDef>
        {
            public final Dot1dSrPortEnt dot1dSrPort;

            public final Dot1dSrPortHopCountEnt dot1dSrPortHopCount;

            public final Dot1dSrPortLocalSegmentEnt dot1dSrPortLocalSegment;

            public final Dot1dSrPortBridgeNumEnt dot1dSrPortBridgeNum;

            public final Dot1dSrPortTargetSegmentEnt dot1dSrPortTargetSegment;

            /** It would be nice if we could use ifMtu as the size of thelargest frame, but we can't because ifMtu is defined to bethe size that the (inter-)network layer can use which candiffer from the MAC layer (especially if several layers ofencapsulation are used).*/
            public final Dot1dSrPortLargestFrameEnt dot1dSrPortLargestFrame;

            public final Dot1dSrPortSTESpanModeEnt dot1dSrPortSTESpanMode;

            public final Dot1dSrPortSpecInFramesEnt dot1dSrPortSpecInFrames;

            public final Dot1dSrPortSpecOutFramesEnt dot1dSrPortSpecOutFrames;

            public final Dot1dSrPortApeInFramesEnt dot1dSrPortApeInFrames;

            public final Dot1dSrPortApeOutFramesEnt dot1dSrPortApeOutFrames;

            public final Dot1dSrPortSteInFramesEnt dot1dSrPortSteInFrames;

            public final Dot1dSrPortSteOutFramesEnt dot1dSrPortSteOutFrames;

            public final Dot1dSrPortSegmentMismatchDiscardsEnt dot1dSrPortSegmentMismatchDiscards;

            public final Dot1dSrPortDuplicateSegmentDiscardsEnt dot1dSrPortDuplicateSegmentDiscards;

            public final Dot1dSrPortHopCountExceededDiscardsEnt dot1dSrPortHopCountExceededDiscards;

            public final Dot1dSrPortDupLanIdOrTreeErrorsEnt dot1dSrPortDupLanIdOrTreeErrors;

            public final Dot1dSrPortLanIdMismatchesEnt dot1dSrPortLanIdMismatches;

            private Dot1dSrPortEntryEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
            {
                super(mib, parent, "dot1dSrPortEntry", "1.3.6.1.2.1.17.3.1.1", false, false, false, true);
                this.dot1dSrPort = new Dot1dSrPortEnt(mib, this);
                this.dot1dSrPortHopCount = new Dot1dSrPortHopCountEnt(mib, this);
                this.dot1dSrPortLocalSegment = new Dot1dSrPortLocalSegmentEnt(mib, this);
                this.dot1dSrPortBridgeNum = new Dot1dSrPortBridgeNumEnt(mib, this);
                this.dot1dSrPortTargetSegment = new Dot1dSrPortTargetSegmentEnt(mib, this);
                this.dot1dSrPortLargestFrame = new Dot1dSrPortLargestFrameEnt(mib, this);
                this.dot1dSrPortSTESpanMode = new Dot1dSrPortSTESpanModeEnt(mib, this);
                this.dot1dSrPortSpecInFrames = new Dot1dSrPortSpecInFramesEnt(mib, this);
                this.dot1dSrPortSpecOutFrames = new Dot1dSrPortSpecOutFramesEnt(mib, this);
                this.dot1dSrPortApeInFrames = new Dot1dSrPortApeInFramesEnt(mib, this);
                this.dot1dSrPortApeOutFrames = new Dot1dSrPortApeOutFramesEnt(mib, this);
                this.dot1dSrPortSteInFrames = new Dot1dSrPortSteInFramesEnt(mib, this);
                this.dot1dSrPortSteOutFrames = new Dot1dSrPortSteOutFramesEnt(mib, this);
                this.dot1dSrPortSegmentMismatchDiscards = new Dot1dSrPortSegmentMismatchDiscardsEnt(mib, this);
                this.dot1dSrPortDuplicateSegmentDiscards = new Dot1dSrPortDuplicateSegmentDiscardsEnt(mib, this);
                this.dot1dSrPortHopCountExceededDiscards = new Dot1dSrPortHopCountExceededDiscardsEnt(mib, this);
                this.dot1dSrPortDupLanIdOrTreeErrors = new Dot1dSrPortDupLanIdOrTreeErrorsEnt(mib, this);
                this.dot1dSrPortLanIdMismatches = new Dot1dSrPortLanIdMismatchesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot1dSrPort,
                    this.dot1dSrPortHopCount,
                    this.dot1dSrPortLocalSegment,
                    this.dot1dSrPortBridgeNum,
                    this.dot1dSrPortTargetSegment,
                    this.dot1dSrPortLargestFrame,
                    this.dot1dSrPortSTESpanMode,
                    this.dot1dSrPortSpecInFrames,
                    this.dot1dSrPortSpecOutFrames,
                    this.dot1dSrPortApeInFrames,
                    this.dot1dSrPortApeOutFrames,
                    this.dot1dSrPortSteInFrames,
                    this.dot1dSrPortSteOutFrames,
                    this.dot1dSrPortSegmentMismatchDiscards,
                    this.dot1dSrPortDuplicateSegmentDiscards,
                    this.dot1dSrPortHopCountExceededDiscards,
                    this.dot1dSrPortDupLanIdOrTreeErrors,
                    this.dot1dSrPortLanIdMismatches
                };
            }
            public static final class Dot1dSrPortEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPort", "1.3.6.1.2.1.17.3.1.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dSrPortHopCountEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortHopCountEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPortHopCount", "1.3.6.1.2.1.17.3.1.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dSrPortLocalSegmentEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortLocalSegmentEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPortLocalSegment", "1.3.6.1.2.1.17.3.1.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dSrPortBridgeNumEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortBridgeNumEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPortBridgeNum", "1.3.6.1.2.1.17.3.1.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dSrPortTargetSegmentEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortTargetSegmentEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPortTargetSegment", "1.3.6.1.2.1.17.3.1.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dSrPortLargestFrameEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortLargestFrameEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPortLargestFrame", "1.3.6.1.2.1.17.3.1.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dSrPortSTESpanModeEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortSTESpanModeEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPortSTESpanMode", "1.3.6.1.2.1.17.3.1.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dSrPortSpecInFramesEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortSpecInFramesEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPortSpecInFrames", "1.3.6.1.2.1.17.3.1.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dSrPortSpecOutFramesEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortSpecOutFramesEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPortSpecOutFrames", "1.3.6.1.2.1.17.3.1.1.9", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dSrPortApeInFramesEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortApeInFramesEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPortApeInFrames", "1.3.6.1.2.1.17.3.1.1.10", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dSrPortApeOutFramesEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortApeOutFramesEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPortApeOutFrames", "1.3.6.1.2.1.17.3.1.1.11", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dSrPortSteInFramesEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortSteInFramesEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPortSteInFrames", "1.3.6.1.2.1.17.3.1.1.12", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dSrPortSteOutFramesEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortSteOutFramesEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPortSteOutFrames", "1.3.6.1.2.1.17.3.1.1.13", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dSrPortSegmentMismatchDiscardsEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortSegmentMismatchDiscardsEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPortSegmentMismatchDiscards", "1.3.6.1.2.1.17.3.1.1.14", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dSrPortDuplicateSegmentDiscardsEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortDuplicateSegmentDiscardsEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPortDuplicateSegmentDiscards", "1.3.6.1.2.1.17.3.1.1.15", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dSrPortHopCountExceededDiscardsEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortHopCountExceededDiscardsEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPortHopCountExceededDiscards", "1.3.6.1.2.1.17.3.1.1.16", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dSrPortDupLanIdOrTreeErrorsEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortDupLanIdOrTreeErrorsEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPortDupLanIdOrTreeErrors", "1.3.6.1.2.1.17.3.1.1.17", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dSrPortLanIdMismatchesEnt extends MIBEntry<SOURCEROUTINGMIBDef>
            {
                private Dot1dSrPortLanIdMismatchesEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
                {
                    super(mib, parent, "dot1dSrPortLanIdMismatches", "1.3.6.1.2.1.17.3.1.1.18", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class Dot1dSrBridgeLfModeEnt extends MIBEntry<SOURCEROUTINGMIBDef>
    {
        private Dot1dSrBridgeLfModeEnt(SOURCEROUTINGMIBDef mib, MIBEntry<SOURCEROUTINGMIBDef> parent)
        {
            super(mib, parent, "dot1dSrBridgeLfMode", "1.3.6.1.2.1.17.3.2", true, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
