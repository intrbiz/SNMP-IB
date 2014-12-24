package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class SONETMIBDef extends MIB
{
    public static final SONETMIBDef SONETMIB = new SONETMIBDef();

    /** This is the MIB module for the SONET/SDH Interface objects.*/
    public final SonetMIBEnt sonetMIB;

    private SONETMIBDef()
    {
        super("SONET-MIB");
        this.sonetMIB = new SonetMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.sonetMIB
        };
    }

    public static final class SonetMIBEnt extends MIBEntry<SONETMIBDef>
    {
        /** This is the MIB module for the SONET/SDH objects*/
        public final SonetObjectsEnt sonetObjects;

        public final SonetObjectsPathEnt sonetObjectsPath;

        public final SonetObjectsVTEnt sonetObjectsVT;

        /** conformance information*/
        public final SonetConformanceEnt sonetConformance;

        private SonetMIBEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
        {
            super(mib, parent, "sonetMIB", "1.3.6.1.2.1.10.39", false, false, false, false);
            this.sonetObjects = new SonetObjectsEnt(mib, this);
            this.sonetObjectsPath = new SonetObjectsPathEnt(mib, this);
            this.sonetObjectsVT = new SonetObjectsVTEnt(mib, this);
            this.sonetConformance = new SonetConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.sonetObjects,
                this.sonetObjectsPath,
                this.sonetObjectsVT,
                this.sonetConformance
            };
        }
        public static final class SonetObjectsEnt extends MIBEntry<SONETMIBDef>
        {
            /** groups in the SONET/SDH MIB module*/
            public final SonetMediumEnt sonetMedium;

            public final SonetSectionEnt sonetSection;

            public final SonetLineEnt sonetLine;

            public final SonetFarEndLineEnt sonetFarEndLine;

            private SonetObjectsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
            {
                super(mib, parent, "sonetObjects", "1.3.6.1.2.1.10.39.1", false, false, false, false);
                this.sonetMedium = new SonetMediumEnt(mib, this);
                this.sonetSection = new SonetSectionEnt(mib, this);
                this.sonetLine = new SonetLineEnt(mib, this);
                this.sonetFarEndLine = new SonetFarEndLineEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sonetMedium,
                    this.sonetSection,
                    this.sonetLine,
                    this.sonetFarEndLine
                };
            }
            public static final class SonetMediumEnt extends MIBEntry<SONETMIBDef>
            {
                /** the SONET/SDH Medium group
SONET/SDH interfaces for some applications may be electricalinterfaces and not optical interfaces.  This group handlesthe configuration information for both optical SONET/SDHinterfaces and electrical SONET/SDH interfaces.*/
                public final SonetMediumTableEnt sonetMediumTable;

                public final SonetSESthresholdSetEnt sonetSESthresholdSet;

                private SonetMediumEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                {
                    super(mib, parent, "sonetMedium", "1.3.6.1.2.1.10.39.1.1", false, false, false, false);
                    this.sonetMediumTable = new SonetMediumTableEnt(mib, this);
                    this.sonetSESthresholdSet = new SonetSESthresholdSetEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sonetMediumTable,
                        this.sonetSESthresholdSet
                    };
                }
                public static final class SonetMediumTableEnt extends MIBEntry<SONETMIBDef>
                {
                    public final SonetMediumEntryEnt sonetMediumEntry;

                    private SonetMediumTableEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetMediumTable", "1.3.6.1.2.1.10.39.1.1.1", false, true, false, false);
                        this.sonetMediumEntry = new SonetMediumEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sonetMediumEntry
                        };
                    }
                    public static final class SonetMediumEntryEnt extends MIBEntry<SONETMIBDef>
                    {
                        public final SonetMediumTypeEnt sonetMediumType;

                        public final SonetMediumTimeElapsedEnt sonetMediumTimeElapsed;

                        public final SonetMediumValidIntervalsEnt sonetMediumValidIntervals;

                        public final SonetMediumLineCodingEnt sonetMediumLineCoding;

                        public final SonetMediumLineTypeEnt sonetMediumLineType;

                        public final SonetMediumCircuitIdentifierEnt sonetMediumCircuitIdentifier;

                        public final SonetMediumInvalidIntervalsEnt sonetMediumInvalidIntervals;

                        public final SonetMediumLoopbackConfigEnt sonetMediumLoopbackConfig;

                        private SonetMediumEntryEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                        {
                            super(mib, parent, "sonetMediumEntry", "1.3.6.1.2.1.10.39.1.1.1.1", false, false, false, true);
                            this.sonetMediumType = new SonetMediumTypeEnt(mib, this);
                            this.sonetMediumTimeElapsed = new SonetMediumTimeElapsedEnt(mib, this);
                            this.sonetMediumValidIntervals = new SonetMediumValidIntervalsEnt(mib, this);
                            this.sonetMediumLineCoding = new SonetMediumLineCodingEnt(mib, this);
                            this.sonetMediumLineType = new SonetMediumLineTypeEnt(mib, this);
                            this.sonetMediumCircuitIdentifier = new SonetMediumCircuitIdentifierEnt(mib, this);
                            this.sonetMediumInvalidIntervals = new SonetMediumInvalidIntervalsEnt(mib, this);
                            this.sonetMediumLoopbackConfig = new SonetMediumLoopbackConfigEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sonetMediumType,
                                this.sonetMediumTimeElapsed,
                                this.sonetMediumValidIntervals,
                                this.sonetMediumLineCoding,
                                this.sonetMediumLineType,
                                this.sonetMediumCircuitIdentifier,
                                this.sonetMediumInvalidIntervals,
                                this.sonetMediumLoopbackConfig
                            };
                        }
                        public static final class SonetMediumTypeEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetMediumTypeEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetMediumType", "1.3.6.1.2.1.10.39.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetMediumTimeElapsedEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetMediumTimeElapsedEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetMediumTimeElapsed", "1.3.6.1.2.1.10.39.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetMediumValidIntervalsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetMediumValidIntervalsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetMediumValidIntervals", "1.3.6.1.2.1.10.39.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetMediumLineCodingEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetMediumLineCodingEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetMediumLineCoding", "1.3.6.1.2.1.10.39.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetMediumLineTypeEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetMediumLineTypeEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetMediumLineType", "1.3.6.1.2.1.10.39.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetMediumCircuitIdentifierEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetMediumCircuitIdentifierEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetMediumCircuitIdentifier", "1.3.6.1.2.1.10.39.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetMediumInvalidIntervalsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetMediumInvalidIntervalsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetMediumInvalidIntervals", "1.3.6.1.2.1.10.39.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetMediumLoopbackConfigEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetMediumLoopbackConfigEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetMediumLoopbackConfig", "1.3.6.1.2.1.10.39.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SonetSESthresholdSetEnt extends MIBEntry<SONETMIBDef>
                {
                    private SonetSESthresholdSetEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetSESthresholdSet", "1.3.6.1.2.1.10.39.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SonetSectionEnt extends MIBEntry<SONETMIBDef>
            {
                /** the SONET/SDH Section group
this group consists of 2 tables:- the SONET/SDH Section Current Table- the SONET/SDH Section Interval Table
the SONET/SDH Section Current Table
The SONET/SDH Sectioncurrent table contains various statisticsbeing collected for the current 15 minute interval.*/
                public final SonetSectionCurrentTableEnt sonetSectionCurrentTable;

                /** the SONET/SDH Section Interval Table
The SONET/SDH Section Interval Tablecontains various statisticscollected by each system over a maximumof the previous 24 hours of


operation.  The past 24 hours may be broken into 96completed 15 minute intervals.A system is required to store atleast 4 completed 15 minute interval.The default value is 32 intervals.*/
                public final SonetSectionIntervalTableEnt sonetSectionIntervalTable;

                private SonetSectionEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                {
                    super(mib, parent, "sonetSection", "1.3.6.1.2.1.10.39.1.2", false, false, false, false);
                    this.sonetSectionCurrentTable = new SonetSectionCurrentTableEnt(mib, this);
                    this.sonetSectionIntervalTable = new SonetSectionIntervalTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sonetSectionCurrentTable,
                        this.sonetSectionIntervalTable
                    };
                }
                public static final class SonetSectionCurrentTableEnt extends MIBEntry<SONETMIBDef>
                {
                    public final SonetSectionCurrentEntryEnt sonetSectionCurrentEntry;

                    private SonetSectionCurrentTableEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetSectionCurrentTable", "1.3.6.1.2.1.10.39.1.2.1", false, true, false, false);
                        this.sonetSectionCurrentEntry = new SonetSectionCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sonetSectionCurrentEntry
                        };
                    }
                    public static final class SonetSectionCurrentEntryEnt extends MIBEntry<SONETMIBDef>
                    {
                        public final SonetSectionCurrentStatusEnt sonetSectionCurrentStatus;

                        public final SonetSectionCurrentESsEnt sonetSectionCurrentESs;

                        public final SonetSectionCurrentSESsEnt sonetSectionCurrentSESs;

                        public final SonetSectionCurrentSEFSsEnt sonetSectionCurrentSEFSs;

                        public final SonetSectionCurrentCVsEnt sonetSectionCurrentCVs;

                        private SonetSectionCurrentEntryEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                        {
                            super(mib, parent, "sonetSectionCurrentEntry", "1.3.6.1.2.1.10.39.1.2.1.1", false, false, false, true);
                            this.sonetSectionCurrentStatus = new SonetSectionCurrentStatusEnt(mib, this);
                            this.sonetSectionCurrentESs = new SonetSectionCurrentESsEnt(mib, this);
                            this.sonetSectionCurrentSESs = new SonetSectionCurrentSESsEnt(mib, this);
                            this.sonetSectionCurrentSEFSs = new SonetSectionCurrentSEFSsEnt(mib, this);
                            this.sonetSectionCurrentCVs = new SonetSectionCurrentCVsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sonetSectionCurrentStatus,
                                this.sonetSectionCurrentESs,
                                this.sonetSectionCurrentSESs,
                                this.sonetSectionCurrentSEFSs,
                                this.sonetSectionCurrentCVs
                            };
                        }
                        public static final class SonetSectionCurrentStatusEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetSectionCurrentStatusEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetSectionCurrentStatus", "1.3.6.1.2.1.10.39.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetSectionCurrentESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetSectionCurrentESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetSectionCurrentESs", "1.3.6.1.2.1.10.39.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetSectionCurrentSESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetSectionCurrentSESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetSectionCurrentSESs", "1.3.6.1.2.1.10.39.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetSectionCurrentSEFSsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetSectionCurrentSEFSsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetSectionCurrentSEFSs", "1.3.6.1.2.1.10.39.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetSectionCurrentCVsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetSectionCurrentCVsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetSectionCurrentCVs", "1.3.6.1.2.1.10.39.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SonetSectionIntervalTableEnt extends MIBEntry<SONETMIBDef>
                {
                    public final SonetSectionIntervalEntryEnt sonetSectionIntervalEntry;

                    private SonetSectionIntervalTableEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetSectionIntervalTable", "1.3.6.1.2.1.10.39.1.2.2", false, true, false, false);
                        this.sonetSectionIntervalEntry = new SonetSectionIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sonetSectionIntervalEntry
                        };
                    }
                    public static final class SonetSectionIntervalEntryEnt extends MIBEntry<SONETMIBDef>
                    {
                        public final SonetSectionIntervalNumberEnt sonetSectionIntervalNumber;

                        public final SonetSectionIntervalESsEnt sonetSectionIntervalESs;

                        public final SonetSectionIntervalSESsEnt sonetSectionIntervalSESs;

                        public final SonetSectionIntervalSEFSsEnt sonetSectionIntervalSEFSs;

                        public final SonetSectionIntervalCVsEnt sonetSectionIntervalCVs;

                        public final SonetSectionIntervalValidDataEnt sonetSectionIntervalValidData;

                        private SonetSectionIntervalEntryEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                        {
                            super(mib, parent, "sonetSectionIntervalEntry", "1.3.6.1.2.1.10.39.1.2.2.1", false, false, false, true);
                            this.sonetSectionIntervalNumber = new SonetSectionIntervalNumberEnt(mib, this);
                            this.sonetSectionIntervalESs = new SonetSectionIntervalESsEnt(mib, this);
                            this.sonetSectionIntervalSESs = new SonetSectionIntervalSESsEnt(mib, this);
                            this.sonetSectionIntervalSEFSs = new SonetSectionIntervalSEFSsEnt(mib, this);
                            this.sonetSectionIntervalCVs = new SonetSectionIntervalCVsEnt(mib, this);
                            this.sonetSectionIntervalValidData = new SonetSectionIntervalValidDataEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sonetSectionIntervalNumber,
                                this.sonetSectionIntervalESs,
                                this.sonetSectionIntervalSESs,
                                this.sonetSectionIntervalSEFSs,
                                this.sonetSectionIntervalCVs,
                                this.sonetSectionIntervalValidData
                            };
                        }
                        public static final class SonetSectionIntervalNumberEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetSectionIntervalNumberEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetSectionIntervalNumber", "1.3.6.1.2.1.10.39.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetSectionIntervalESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetSectionIntervalESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetSectionIntervalESs", "1.3.6.1.2.1.10.39.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetSectionIntervalSESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetSectionIntervalSESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetSectionIntervalSESs", "1.3.6.1.2.1.10.39.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetSectionIntervalSEFSsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetSectionIntervalSEFSsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetSectionIntervalSEFSs", "1.3.6.1.2.1.10.39.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetSectionIntervalCVsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetSectionIntervalCVsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetSectionIntervalCVs", "1.3.6.1.2.1.10.39.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetSectionIntervalValidDataEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetSectionIntervalValidDataEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetSectionIntervalValidData", "1.3.6.1.2.1.10.39.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SonetLineEnt extends MIBEntry<SONETMIBDef>
            {
                /** the SONET/SDH Line group
this group consists of 2 tables:- the SONET/SDH Line Current Table- the SONET/SDH Line Interval Table
the SONET/SDH Line Current Table
The SONET/SDH Linecurrent table contains various statisticsbeing collected for the current 15 minute interval.*/
                public final SonetLineCurrentTableEnt sonetLineCurrentTable;

                /** the SONET/SDH Line Interval Table
The SONET/SDH Line Interval Tablecontains various statisticscollected by each system over a maximumof the previous 24 hours ofoperation.  The past 24 hours may be broken into 96completed 15 minute intervals.A system is required to store atleast 4 completed 15 minute interval.The default value is 32 intervals.*/
                public final SonetLineIntervalTableEnt sonetLineIntervalTable;

                private SonetLineEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                {
                    super(mib, parent, "sonetLine", "1.3.6.1.2.1.10.39.1.3", false, false, false, false);
                    this.sonetLineCurrentTable = new SonetLineCurrentTableEnt(mib, this);
                    this.sonetLineIntervalTable = new SonetLineIntervalTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sonetLineCurrentTable,
                        this.sonetLineIntervalTable
                    };
                }
                public static final class SonetLineCurrentTableEnt extends MIBEntry<SONETMIBDef>
                {
                    public final SonetLineCurrentEntryEnt sonetLineCurrentEntry;

                    private SonetLineCurrentTableEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetLineCurrentTable", "1.3.6.1.2.1.10.39.1.3.1", false, true, false, false);
                        this.sonetLineCurrentEntry = new SonetLineCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sonetLineCurrentEntry
                        };
                    }
                    public static final class SonetLineCurrentEntryEnt extends MIBEntry<SONETMIBDef>
                    {
                        public final SonetLineCurrentStatusEnt sonetLineCurrentStatus;

                        public final SonetLineCurrentESsEnt sonetLineCurrentESs;

                        public final SonetLineCurrentSESsEnt sonetLineCurrentSESs;

                        public final SonetLineCurrentCVsEnt sonetLineCurrentCVs;

                        public final SonetLineCurrentUASsEnt sonetLineCurrentUASs;

                        private SonetLineCurrentEntryEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                        {
                            super(mib, parent, "sonetLineCurrentEntry", "1.3.6.1.2.1.10.39.1.3.1.1", false, false, false, true);
                            this.sonetLineCurrentStatus = new SonetLineCurrentStatusEnt(mib, this);
                            this.sonetLineCurrentESs = new SonetLineCurrentESsEnt(mib, this);
                            this.sonetLineCurrentSESs = new SonetLineCurrentSESsEnt(mib, this);
                            this.sonetLineCurrentCVs = new SonetLineCurrentCVsEnt(mib, this);
                            this.sonetLineCurrentUASs = new SonetLineCurrentUASsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sonetLineCurrentStatus,
                                this.sonetLineCurrentESs,
                                this.sonetLineCurrentSESs,
                                this.sonetLineCurrentCVs,
                                this.sonetLineCurrentUASs
                            };
                        }
                        public static final class SonetLineCurrentStatusEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetLineCurrentStatusEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetLineCurrentStatus", "1.3.6.1.2.1.10.39.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetLineCurrentESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetLineCurrentESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetLineCurrentESs", "1.3.6.1.2.1.10.39.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetLineCurrentSESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetLineCurrentSESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetLineCurrentSESs", "1.3.6.1.2.1.10.39.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetLineCurrentCVsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetLineCurrentCVsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetLineCurrentCVs", "1.3.6.1.2.1.10.39.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetLineCurrentUASsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetLineCurrentUASsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetLineCurrentUASs", "1.3.6.1.2.1.10.39.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SonetLineIntervalTableEnt extends MIBEntry<SONETMIBDef>
                {
                    public final SonetLineIntervalEntryEnt sonetLineIntervalEntry;

                    private SonetLineIntervalTableEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetLineIntervalTable", "1.3.6.1.2.1.10.39.1.3.2", false, true, false, false);
                        this.sonetLineIntervalEntry = new SonetLineIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sonetLineIntervalEntry
                        };
                    }
                    public static final class SonetLineIntervalEntryEnt extends MIBEntry<SONETMIBDef>
                    {
                        public final SonetLineIntervalNumberEnt sonetLineIntervalNumber;

                        public final SonetLineIntervalESsEnt sonetLineIntervalESs;

                        public final SonetLineIntervalSESsEnt sonetLineIntervalSESs;

                        public final SonetLineIntervalCVsEnt sonetLineIntervalCVs;

                        public final SonetLineIntervalUASsEnt sonetLineIntervalUASs;

                        public final SonetLineIntervalValidDataEnt sonetLineIntervalValidData;

                        private SonetLineIntervalEntryEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                        {
                            super(mib, parent, "sonetLineIntervalEntry", "1.3.6.1.2.1.10.39.1.3.2.1", false, false, false, true);
                            this.sonetLineIntervalNumber = new SonetLineIntervalNumberEnt(mib, this);
                            this.sonetLineIntervalESs = new SonetLineIntervalESsEnt(mib, this);
                            this.sonetLineIntervalSESs = new SonetLineIntervalSESsEnt(mib, this);
                            this.sonetLineIntervalCVs = new SonetLineIntervalCVsEnt(mib, this);
                            this.sonetLineIntervalUASs = new SonetLineIntervalUASsEnt(mib, this);
                            this.sonetLineIntervalValidData = new SonetLineIntervalValidDataEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sonetLineIntervalNumber,
                                this.sonetLineIntervalESs,
                                this.sonetLineIntervalSESs,
                                this.sonetLineIntervalCVs,
                                this.sonetLineIntervalUASs,
                                this.sonetLineIntervalValidData
                            };
                        }
                        public static final class SonetLineIntervalNumberEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetLineIntervalNumberEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetLineIntervalNumber", "1.3.6.1.2.1.10.39.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetLineIntervalESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetLineIntervalESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetLineIntervalESs", "1.3.6.1.2.1.10.39.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetLineIntervalSESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetLineIntervalSESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetLineIntervalSESs", "1.3.6.1.2.1.10.39.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetLineIntervalCVsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetLineIntervalCVsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetLineIntervalCVs", "1.3.6.1.2.1.10.39.1.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetLineIntervalUASsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetLineIntervalUASsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetLineIntervalUASs", "1.3.6.1.2.1.10.39.1.3.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetLineIntervalValidDataEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetLineIntervalValidDataEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetLineIntervalValidData", "1.3.6.1.2.1.10.39.1.3.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SonetFarEndLineEnt extends MIBEntry<SONETMIBDef>
            {
                /** The SONET/SDH Far End Line group.This group may only be implemented by SONET/SDH (LTEs)systems that provide for a far end block error (FEBE)information at the SONET/SDH Line Layer.
This group consists of two tables:SONET/SDH Far End Line Current TableSONET/SDH Far End Line Interval Table
The SONET/SDH Far End Line Current Table
The SONET/SDH Far End Line Current table containsvarious statistics beingcollected for the current 15 minute interval.The statistics are collected from the far end


block error code (FEBE)within the third Z2 byte of the Line Overheadin Broadband ISDN applications.The definitions are the same as described forthe near-end information.*/
                public final SonetFarEndLineCurrentTableEnt sonetFarEndLineCurrentTable;

                /** The SONET/SDH Far End Line Interval Table
The SONET/SDH Far End Line Interval Tablecontains various statisticscollected by each system over a maximumof the previous 24 hours ofoperation.  The past 24 hours may be broken into 96completed 15 minute intervals.A system is required to store atleast 4 completed 15 minute interval.The default value is 32 intervals.*/
                public final SonetFarEndLineIntervalTableEnt sonetFarEndLineIntervalTable;

                private SonetFarEndLineEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                {
                    super(mib, parent, "sonetFarEndLine", "1.3.6.1.2.1.10.39.1.4", false, false, false, false);
                    this.sonetFarEndLineCurrentTable = new SonetFarEndLineCurrentTableEnt(mib, this);
                    this.sonetFarEndLineIntervalTable = new SonetFarEndLineIntervalTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sonetFarEndLineCurrentTable,
                        this.sonetFarEndLineIntervalTable
                    };
                }
                public static final class SonetFarEndLineCurrentTableEnt extends MIBEntry<SONETMIBDef>
                {
                    public final SonetFarEndLineCurrentEntryEnt sonetFarEndLineCurrentEntry;

                    private SonetFarEndLineCurrentTableEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetFarEndLineCurrentTable", "1.3.6.1.2.1.10.39.1.4.1", false, true, false, false);
                        this.sonetFarEndLineCurrentEntry = new SonetFarEndLineCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sonetFarEndLineCurrentEntry
                        };
                    }
                    public static final class SonetFarEndLineCurrentEntryEnt extends MIBEntry<SONETMIBDef>
                    {
                        public final SonetFarEndLineCurrentESsEnt sonetFarEndLineCurrentESs;

                        public final SonetFarEndLineCurrentSESsEnt sonetFarEndLineCurrentSESs;

                        public final SonetFarEndLineCurrentCVsEnt sonetFarEndLineCurrentCVs;

                        public final SonetFarEndLineCurrentUASsEnt sonetFarEndLineCurrentUASs;

                        private SonetFarEndLineCurrentEntryEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                        {
                            super(mib, parent, "sonetFarEndLineCurrentEntry", "1.3.6.1.2.1.10.39.1.4.1.1", false, false, false, true);
                            this.sonetFarEndLineCurrentESs = new SonetFarEndLineCurrentESsEnt(mib, this);
                            this.sonetFarEndLineCurrentSESs = new SonetFarEndLineCurrentSESsEnt(mib, this);
                            this.sonetFarEndLineCurrentCVs = new SonetFarEndLineCurrentCVsEnt(mib, this);
                            this.sonetFarEndLineCurrentUASs = new SonetFarEndLineCurrentUASsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sonetFarEndLineCurrentESs,
                                this.sonetFarEndLineCurrentSESs,
                                this.sonetFarEndLineCurrentCVs,
                                this.sonetFarEndLineCurrentUASs
                            };
                        }
                        public static final class SonetFarEndLineCurrentESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndLineCurrentESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndLineCurrentESs", "1.3.6.1.2.1.10.39.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndLineCurrentSESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndLineCurrentSESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndLineCurrentSESs", "1.3.6.1.2.1.10.39.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndLineCurrentCVsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndLineCurrentCVsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndLineCurrentCVs", "1.3.6.1.2.1.10.39.1.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndLineCurrentUASsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndLineCurrentUASsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndLineCurrentUASs", "1.3.6.1.2.1.10.39.1.4.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SonetFarEndLineIntervalTableEnt extends MIBEntry<SONETMIBDef>
                {
                    public final SonetFarEndLineIntervalEntryEnt sonetFarEndLineIntervalEntry;

                    private SonetFarEndLineIntervalTableEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetFarEndLineIntervalTable", "1.3.6.1.2.1.10.39.1.4.2", false, true, false, false);
                        this.sonetFarEndLineIntervalEntry = new SonetFarEndLineIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sonetFarEndLineIntervalEntry
                        };
                    }
                    public static final class SonetFarEndLineIntervalEntryEnt extends MIBEntry<SONETMIBDef>
                    {
                        public final SonetFarEndLineIntervalNumberEnt sonetFarEndLineIntervalNumber;

                        public final SonetFarEndLineIntervalESsEnt sonetFarEndLineIntervalESs;

                        public final SonetFarEndLineIntervalSESsEnt sonetFarEndLineIntervalSESs;

                        public final SonetFarEndLineIntervalCVsEnt sonetFarEndLineIntervalCVs;

                        public final SonetFarEndLineIntervalUASsEnt sonetFarEndLineIntervalUASs;

                        public final SonetFarEndLineIntervalValidDataEnt sonetFarEndLineIntervalValidData;

                        private SonetFarEndLineIntervalEntryEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                        {
                            super(mib, parent, "sonetFarEndLineIntervalEntry", "1.3.6.1.2.1.10.39.1.4.2.1", false, false, false, true);
                            this.sonetFarEndLineIntervalNumber = new SonetFarEndLineIntervalNumberEnt(mib, this);
                            this.sonetFarEndLineIntervalESs = new SonetFarEndLineIntervalESsEnt(mib, this);
                            this.sonetFarEndLineIntervalSESs = new SonetFarEndLineIntervalSESsEnt(mib, this);
                            this.sonetFarEndLineIntervalCVs = new SonetFarEndLineIntervalCVsEnt(mib, this);
                            this.sonetFarEndLineIntervalUASs = new SonetFarEndLineIntervalUASsEnt(mib, this);
                            this.sonetFarEndLineIntervalValidData = new SonetFarEndLineIntervalValidDataEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sonetFarEndLineIntervalNumber,
                                this.sonetFarEndLineIntervalESs,
                                this.sonetFarEndLineIntervalSESs,
                                this.sonetFarEndLineIntervalCVs,
                                this.sonetFarEndLineIntervalUASs,
                                this.sonetFarEndLineIntervalValidData
                            };
                        }
                        public static final class SonetFarEndLineIntervalNumberEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndLineIntervalNumberEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndLineIntervalNumber", "1.3.6.1.2.1.10.39.1.4.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndLineIntervalESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndLineIntervalESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndLineIntervalESs", "1.3.6.1.2.1.10.39.1.4.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndLineIntervalSESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndLineIntervalSESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndLineIntervalSESs", "1.3.6.1.2.1.10.39.1.4.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndLineIntervalCVsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndLineIntervalCVsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndLineIntervalCVs", "1.3.6.1.2.1.10.39.1.4.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndLineIntervalUASsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndLineIntervalUASsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndLineIntervalUASs", "1.3.6.1.2.1.10.39.1.4.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndLineIntervalValidDataEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndLineIntervalValidDataEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndLineIntervalValidData", "1.3.6.1.2.1.10.39.1.4.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class SonetObjectsPathEnt extends MIBEntry<SONETMIBDef>
        {
            public final SonetPathEnt sonetPath;

            public final SonetFarEndPathEnt sonetFarEndPath;

            private SonetObjectsPathEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
            {
                super(mib, parent, "sonetObjectsPath", "1.3.6.1.2.1.10.39.2", false, false, false, false);
                this.sonetPath = new SonetPathEnt(mib, this);
                this.sonetFarEndPath = new SonetFarEndPathEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sonetPath,
                    this.sonetFarEndPath
                };
            }
            public static final class SonetPathEnt extends MIBEntry<SONETMIBDef>
            {
                /** the SONET/SDH Path group
this group consists of 2 tables:- the SONET/SDH Path Current Table- the SONET/SDH Path Interval Table
the SONET/SDH Path Current Table
The SONET/SDH Pathcurrent table contains various statisticsbeing collected for the current 15 minute interval.*/
                public final SonetPathCurrentTableEnt sonetPathCurrentTable;

                /** the SONET/SDH Path Interval Table
The SONET/SDH Path Interval Tablecontains various statisticscollected by each system over a maximumof the previous 24 hours ofoperation.  The past 24 hours may be broken into 96completed 15 minute intervals.A system is required to store atleast 4 completed 15 minute interval.The default value is 32 intervals.*/
                public final SonetPathIntervalTableEnt sonetPathIntervalTable;

                private SonetPathEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                {
                    super(mib, parent, "sonetPath", "1.3.6.1.2.1.10.39.2.1", false, false, false, false);
                    this.sonetPathCurrentTable = new SonetPathCurrentTableEnt(mib, this);
                    this.sonetPathIntervalTable = new SonetPathIntervalTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sonetPathCurrentTable,
                        this.sonetPathIntervalTable
                    };
                }
                public static final class SonetPathCurrentTableEnt extends MIBEntry<SONETMIBDef>
                {
                    public final SonetPathCurrentEntryEnt sonetPathCurrentEntry;

                    private SonetPathCurrentTableEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetPathCurrentTable", "1.3.6.1.2.1.10.39.2.1.1", false, true, false, false);
                        this.sonetPathCurrentEntry = new SonetPathCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sonetPathCurrentEntry
                        };
                    }
                    public static final class SonetPathCurrentEntryEnt extends MIBEntry<SONETMIBDef>
                    {
                        public final SonetPathCurrentWidthEnt sonetPathCurrentWidth;

                        public final SonetPathCurrentStatusEnt sonetPathCurrentStatus;

                        public final SonetPathCurrentESsEnt sonetPathCurrentESs;

                        public final SonetPathCurrentSESsEnt sonetPathCurrentSESs;

                        public final SonetPathCurrentCVsEnt sonetPathCurrentCVs;

                        public final SonetPathCurrentUASsEnt sonetPathCurrentUASs;

                        private SonetPathCurrentEntryEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                        {
                            super(mib, parent, "sonetPathCurrentEntry", "1.3.6.1.2.1.10.39.2.1.1.1", false, false, false, true);
                            this.sonetPathCurrentWidth = new SonetPathCurrentWidthEnt(mib, this);
                            this.sonetPathCurrentStatus = new SonetPathCurrentStatusEnt(mib, this);
                            this.sonetPathCurrentESs = new SonetPathCurrentESsEnt(mib, this);
                            this.sonetPathCurrentSESs = new SonetPathCurrentSESsEnt(mib, this);
                            this.sonetPathCurrentCVs = new SonetPathCurrentCVsEnt(mib, this);
                            this.sonetPathCurrentUASs = new SonetPathCurrentUASsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sonetPathCurrentWidth,
                                this.sonetPathCurrentStatus,
                                this.sonetPathCurrentESs,
                                this.sonetPathCurrentSESs,
                                this.sonetPathCurrentCVs,
                                this.sonetPathCurrentUASs
                            };
                        }
                        public static final class SonetPathCurrentWidthEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetPathCurrentWidthEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetPathCurrentWidth", "1.3.6.1.2.1.10.39.2.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetPathCurrentStatusEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetPathCurrentStatusEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetPathCurrentStatus", "1.3.6.1.2.1.10.39.2.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetPathCurrentESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetPathCurrentESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetPathCurrentESs", "1.3.6.1.2.1.10.39.2.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetPathCurrentSESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetPathCurrentSESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetPathCurrentSESs", "1.3.6.1.2.1.10.39.2.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetPathCurrentCVsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetPathCurrentCVsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetPathCurrentCVs", "1.3.6.1.2.1.10.39.2.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetPathCurrentUASsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetPathCurrentUASsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetPathCurrentUASs", "1.3.6.1.2.1.10.39.2.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SonetPathIntervalTableEnt extends MIBEntry<SONETMIBDef>
                {
                    public final SonetPathIntervalEntryEnt sonetPathIntervalEntry;

                    private SonetPathIntervalTableEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetPathIntervalTable", "1.3.6.1.2.1.10.39.2.1.2", false, true, false, false);
                        this.sonetPathIntervalEntry = new SonetPathIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sonetPathIntervalEntry
                        };
                    }
                    public static final class SonetPathIntervalEntryEnt extends MIBEntry<SONETMIBDef>
                    {
                        public final SonetPathIntervalNumberEnt sonetPathIntervalNumber;

                        public final SonetPathIntervalESsEnt sonetPathIntervalESs;

                        public final SonetPathIntervalSESsEnt sonetPathIntervalSESs;

                        public final SonetPathIntervalCVsEnt sonetPathIntervalCVs;

                        public final SonetPathIntervalUASsEnt sonetPathIntervalUASs;

                        public final SonetPathIntervalValidDataEnt sonetPathIntervalValidData;

                        private SonetPathIntervalEntryEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                        {
                            super(mib, parent, "sonetPathIntervalEntry", "1.3.6.1.2.1.10.39.2.1.2.1", false, false, false, true);
                            this.sonetPathIntervalNumber = new SonetPathIntervalNumberEnt(mib, this);
                            this.sonetPathIntervalESs = new SonetPathIntervalESsEnt(mib, this);
                            this.sonetPathIntervalSESs = new SonetPathIntervalSESsEnt(mib, this);
                            this.sonetPathIntervalCVs = new SonetPathIntervalCVsEnt(mib, this);
                            this.sonetPathIntervalUASs = new SonetPathIntervalUASsEnt(mib, this);
                            this.sonetPathIntervalValidData = new SonetPathIntervalValidDataEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sonetPathIntervalNumber,
                                this.sonetPathIntervalESs,
                                this.sonetPathIntervalSESs,
                                this.sonetPathIntervalCVs,
                                this.sonetPathIntervalUASs,
                                this.sonetPathIntervalValidData
                            };
                        }
                        public static final class SonetPathIntervalNumberEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetPathIntervalNumberEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetPathIntervalNumber", "1.3.6.1.2.1.10.39.2.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetPathIntervalESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetPathIntervalESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetPathIntervalESs", "1.3.6.1.2.1.10.39.2.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetPathIntervalSESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetPathIntervalSESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetPathIntervalSESs", "1.3.6.1.2.1.10.39.2.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetPathIntervalCVsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetPathIntervalCVsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetPathIntervalCVs", "1.3.6.1.2.1.10.39.2.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetPathIntervalUASsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetPathIntervalUASsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetPathIntervalUASs", "1.3.6.1.2.1.10.39.2.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetPathIntervalValidDataEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetPathIntervalValidDataEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetPathIntervalValidData", "1.3.6.1.2.1.10.39.2.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SonetFarEndPathEnt extends MIBEntry<SONETMIBDef>
            {
                /** The SONET/SDH Far End Path group
This group consists of two tables:- SONET/SDH Far End Path Current Table- SONET/SDH Far End Path Interval Table
The SONET/SDH Far End Path Current Table
The SONET/SDH Far End Path Current tablecontains various statisticsbeing collected for the current 15 minute interval.The statistics are collected fromthe far end block error code(FEBE) within the G1 byte of the Path Overhead.The definitions are the same as described forthe near-end information.*/
                public final SonetFarEndPathCurrentTableEnt sonetFarEndPathCurrentTable;

                /** The SONET/SDH Far End Path Interval Table
The SONET/SDH Far End Path Interval Tablecontains various statisticscollected by each system over a maximumof the previous 24 hours ofoperation.  The past 24 hours may be broken into 96completed 15 minute intervals.A system is required to store atleast 4 completed 15 minute interval.The default value is 32 intervals.*/
                public final SonetFarEndPathIntervalTableEnt sonetFarEndPathIntervalTable;

                private SonetFarEndPathEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                {
                    super(mib, parent, "sonetFarEndPath", "1.3.6.1.2.1.10.39.2.2", false, false, false, false);
                    this.sonetFarEndPathCurrentTable = new SonetFarEndPathCurrentTableEnt(mib, this);
                    this.sonetFarEndPathIntervalTable = new SonetFarEndPathIntervalTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sonetFarEndPathCurrentTable,
                        this.sonetFarEndPathIntervalTable
                    };
                }
                public static final class SonetFarEndPathCurrentTableEnt extends MIBEntry<SONETMIBDef>
                {
                    public final SonetFarEndPathCurrentEntryEnt sonetFarEndPathCurrentEntry;

                    private SonetFarEndPathCurrentTableEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetFarEndPathCurrentTable", "1.3.6.1.2.1.10.39.2.2.1", false, true, false, false);
                        this.sonetFarEndPathCurrentEntry = new SonetFarEndPathCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sonetFarEndPathCurrentEntry
                        };
                    }
                    public static final class SonetFarEndPathCurrentEntryEnt extends MIBEntry<SONETMIBDef>
                    {
                        public final SonetFarEndPathCurrentESsEnt sonetFarEndPathCurrentESs;

                        public final SonetFarEndPathCurrentSESsEnt sonetFarEndPathCurrentSESs;

                        public final SonetFarEndPathCurrentCVsEnt sonetFarEndPathCurrentCVs;

                        public final SonetFarEndPathCurrentUASsEnt sonetFarEndPathCurrentUASs;

                        private SonetFarEndPathCurrentEntryEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                        {
                            super(mib, parent, "sonetFarEndPathCurrentEntry", "1.3.6.1.2.1.10.39.2.2.1.1", false, false, false, true);
                            this.sonetFarEndPathCurrentESs = new SonetFarEndPathCurrentESsEnt(mib, this);
                            this.sonetFarEndPathCurrentSESs = new SonetFarEndPathCurrentSESsEnt(mib, this);
                            this.sonetFarEndPathCurrentCVs = new SonetFarEndPathCurrentCVsEnt(mib, this);
                            this.sonetFarEndPathCurrentUASs = new SonetFarEndPathCurrentUASsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sonetFarEndPathCurrentESs,
                                this.sonetFarEndPathCurrentSESs,
                                this.sonetFarEndPathCurrentCVs,
                                this.sonetFarEndPathCurrentUASs
                            };
                        }
                        public static final class SonetFarEndPathCurrentESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndPathCurrentESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndPathCurrentESs", "1.3.6.1.2.1.10.39.2.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndPathCurrentSESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndPathCurrentSESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndPathCurrentSESs", "1.3.6.1.2.1.10.39.2.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndPathCurrentCVsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndPathCurrentCVsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndPathCurrentCVs", "1.3.6.1.2.1.10.39.2.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndPathCurrentUASsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndPathCurrentUASsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndPathCurrentUASs", "1.3.6.1.2.1.10.39.2.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SonetFarEndPathIntervalTableEnt extends MIBEntry<SONETMIBDef>
                {
                    public final SonetFarEndPathIntervalEntryEnt sonetFarEndPathIntervalEntry;

                    private SonetFarEndPathIntervalTableEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetFarEndPathIntervalTable", "1.3.6.1.2.1.10.39.2.2.2", false, true, false, false);
                        this.sonetFarEndPathIntervalEntry = new SonetFarEndPathIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sonetFarEndPathIntervalEntry
                        };
                    }
                    public static final class SonetFarEndPathIntervalEntryEnt extends MIBEntry<SONETMIBDef>
                    {
                        public final SonetFarEndPathIntervalNumberEnt sonetFarEndPathIntervalNumber;

                        public final SonetFarEndPathIntervalESsEnt sonetFarEndPathIntervalESs;

                        public final SonetFarEndPathIntervalSESsEnt sonetFarEndPathIntervalSESs;

                        public final SonetFarEndPathIntervalCVsEnt sonetFarEndPathIntervalCVs;

                        public final SonetFarEndPathIntervalUASsEnt sonetFarEndPathIntervalUASs;

                        public final SonetFarEndPathIntervalValidDataEnt sonetFarEndPathIntervalValidData;

                        private SonetFarEndPathIntervalEntryEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                        {
                            super(mib, parent, "sonetFarEndPathIntervalEntry", "1.3.6.1.2.1.10.39.2.2.2.1", false, false, false, true);
                            this.sonetFarEndPathIntervalNumber = new SonetFarEndPathIntervalNumberEnt(mib, this);
                            this.sonetFarEndPathIntervalESs = new SonetFarEndPathIntervalESsEnt(mib, this);
                            this.sonetFarEndPathIntervalSESs = new SonetFarEndPathIntervalSESsEnt(mib, this);
                            this.sonetFarEndPathIntervalCVs = new SonetFarEndPathIntervalCVsEnt(mib, this);
                            this.sonetFarEndPathIntervalUASs = new SonetFarEndPathIntervalUASsEnt(mib, this);
                            this.sonetFarEndPathIntervalValidData = new SonetFarEndPathIntervalValidDataEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sonetFarEndPathIntervalNumber,
                                this.sonetFarEndPathIntervalESs,
                                this.sonetFarEndPathIntervalSESs,
                                this.sonetFarEndPathIntervalCVs,
                                this.sonetFarEndPathIntervalUASs,
                                this.sonetFarEndPathIntervalValidData
                            };
                        }
                        public static final class SonetFarEndPathIntervalNumberEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndPathIntervalNumberEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndPathIntervalNumber", "1.3.6.1.2.1.10.39.2.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndPathIntervalESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndPathIntervalESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndPathIntervalESs", "1.3.6.1.2.1.10.39.2.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndPathIntervalSESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndPathIntervalSESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndPathIntervalSESs", "1.3.6.1.2.1.10.39.2.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndPathIntervalCVsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndPathIntervalCVsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndPathIntervalCVs", "1.3.6.1.2.1.10.39.2.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndPathIntervalUASsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndPathIntervalUASsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndPathIntervalUASs", "1.3.6.1.2.1.10.39.2.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndPathIntervalValidDataEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndPathIntervalValidDataEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndPathIntervalValidData", "1.3.6.1.2.1.10.39.2.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class SonetObjectsVTEnt extends MIBEntry<SONETMIBDef>
        {
            public final SonetVTEnt sonetVT;

            public final SonetFarEndVTEnt sonetFarEndVT;

            private SonetObjectsVTEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
            {
                super(mib, parent, "sonetObjectsVT", "1.3.6.1.2.1.10.39.3", false, false, false, false);
                this.sonetVT = new SonetVTEnt(mib, this);
                this.sonetFarEndVT = new SonetFarEndVTEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sonetVT,
                    this.sonetFarEndVT
                };
            }
            public static final class SonetVTEnt extends MIBEntry<SONETMIBDef>
            {
                /** the SONET/SDH Virtual Tributary group
this group consists of 2 tables:- the SONET/SDH VT Current Table- the SONET/SDH VT Interval Table
Corresponding SDH signals for SONET VTs areas follows:
A VT1.5 = TU11A VT2 = TU12A VT3 = nonenone  = TU3A VT6 = TU2
the SONET/SDH VT Current Table
The SONET/SDH VT current tablecontains various statisticsbeing collected for thecurrent 15 minute interval.*/
                public final SonetVTCurrentTableEnt sonetVTCurrentTable;

                /** the SONET/SDH VT Interval Table
The SONET/SDH VT Interval Tablecontains various statisticscollected by each system over a maximumof the previous 24 hours ofoperation.  The past 24 hours may be broken into 96completed 15 minute intervals.A system is required to store atleast 4 completed 15 minute interval.The default value is 32 intervals.*/
                public final SonetVTIntervalTableEnt sonetVTIntervalTable;

                private SonetVTEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                {
                    super(mib, parent, "sonetVT", "1.3.6.1.2.1.10.39.3.1", false, false, false, false);
                    this.sonetVTCurrentTable = new SonetVTCurrentTableEnt(mib, this);
                    this.sonetVTIntervalTable = new SonetVTIntervalTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sonetVTCurrentTable,
                        this.sonetVTIntervalTable
                    };
                }
                public static final class SonetVTCurrentTableEnt extends MIBEntry<SONETMIBDef>
                {
                    public final SonetVTCurrentEntryEnt sonetVTCurrentEntry;

                    private SonetVTCurrentTableEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetVTCurrentTable", "1.3.6.1.2.1.10.39.3.1.1", false, true, false, false);
                        this.sonetVTCurrentEntry = new SonetVTCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sonetVTCurrentEntry
                        };
                    }
                    public static final class SonetVTCurrentEntryEnt extends MIBEntry<SONETMIBDef>
                    {
                        public final SonetVTCurrentWidthEnt sonetVTCurrentWidth;

                        public final SonetVTCurrentStatusEnt sonetVTCurrentStatus;

                        public final SonetVTCurrentESsEnt sonetVTCurrentESs;

                        public final SonetVTCurrentSESsEnt sonetVTCurrentSESs;

                        public final SonetVTCurrentCVsEnt sonetVTCurrentCVs;

                        public final SonetVTCurrentUASsEnt sonetVTCurrentUASs;

                        private SonetVTCurrentEntryEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                        {
                            super(mib, parent, "sonetVTCurrentEntry", "1.3.6.1.2.1.10.39.3.1.1.1", false, false, false, true);
                            this.sonetVTCurrentWidth = new SonetVTCurrentWidthEnt(mib, this);
                            this.sonetVTCurrentStatus = new SonetVTCurrentStatusEnt(mib, this);
                            this.sonetVTCurrentESs = new SonetVTCurrentESsEnt(mib, this);
                            this.sonetVTCurrentSESs = new SonetVTCurrentSESsEnt(mib, this);
                            this.sonetVTCurrentCVs = new SonetVTCurrentCVsEnt(mib, this);
                            this.sonetVTCurrentUASs = new SonetVTCurrentUASsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sonetVTCurrentWidth,
                                this.sonetVTCurrentStatus,
                                this.sonetVTCurrentESs,
                                this.sonetVTCurrentSESs,
                                this.sonetVTCurrentCVs,
                                this.sonetVTCurrentUASs
                            };
                        }
                        public static final class SonetVTCurrentWidthEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetVTCurrentWidthEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetVTCurrentWidth", "1.3.6.1.2.1.10.39.3.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetVTCurrentStatusEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetVTCurrentStatusEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetVTCurrentStatus", "1.3.6.1.2.1.10.39.3.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetVTCurrentESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetVTCurrentESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetVTCurrentESs", "1.3.6.1.2.1.10.39.3.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetVTCurrentSESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetVTCurrentSESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetVTCurrentSESs", "1.3.6.1.2.1.10.39.3.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetVTCurrentCVsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetVTCurrentCVsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetVTCurrentCVs", "1.3.6.1.2.1.10.39.3.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetVTCurrentUASsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetVTCurrentUASsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetVTCurrentUASs", "1.3.6.1.2.1.10.39.3.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SonetVTIntervalTableEnt extends MIBEntry<SONETMIBDef>
                {
                    public final SonetVTIntervalEntryEnt sonetVTIntervalEntry;

                    private SonetVTIntervalTableEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetVTIntervalTable", "1.3.6.1.2.1.10.39.3.1.2", false, true, false, false);
                        this.sonetVTIntervalEntry = new SonetVTIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sonetVTIntervalEntry
                        };
                    }
                    public static final class SonetVTIntervalEntryEnt extends MIBEntry<SONETMIBDef>
                    {
                        public final SonetVTIntervalNumberEnt sonetVTIntervalNumber;

                        public final SonetVTIntervalESsEnt sonetVTIntervalESs;

                        public final SonetVTIntervalSESsEnt sonetVTIntervalSESs;

                        public final SonetVTIntervalCVsEnt sonetVTIntervalCVs;

                        public final SonetVTIntervalUASsEnt sonetVTIntervalUASs;

                        public final SonetVTIntervalValidDataEnt sonetVTIntervalValidData;

                        private SonetVTIntervalEntryEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                        {
                            super(mib, parent, "sonetVTIntervalEntry", "1.3.6.1.2.1.10.39.3.1.2.1", false, false, false, true);
                            this.sonetVTIntervalNumber = new SonetVTIntervalNumberEnt(mib, this);
                            this.sonetVTIntervalESs = new SonetVTIntervalESsEnt(mib, this);
                            this.sonetVTIntervalSESs = new SonetVTIntervalSESsEnt(mib, this);
                            this.sonetVTIntervalCVs = new SonetVTIntervalCVsEnt(mib, this);
                            this.sonetVTIntervalUASs = new SonetVTIntervalUASsEnt(mib, this);
                            this.sonetVTIntervalValidData = new SonetVTIntervalValidDataEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sonetVTIntervalNumber,
                                this.sonetVTIntervalESs,
                                this.sonetVTIntervalSESs,
                                this.sonetVTIntervalCVs,
                                this.sonetVTIntervalUASs,
                                this.sonetVTIntervalValidData
                            };
                        }
                        public static final class SonetVTIntervalNumberEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetVTIntervalNumberEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetVTIntervalNumber", "1.3.6.1.2.1.10.39.3.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetVTIntervalESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetVTIntervalESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetVTIntervalESs", "1.3.6.1.2.1.10.39.3.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetVTIntervalSESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetVTIntervalSESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetVTIntervalSESs", "1.3.6.1.2.1.10.39.3.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetVTIntervalCVsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetVTIntervalCVsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetVTIntervalCVs", "1.3.6.1.2.1.10.39.3.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetVTIntervalUASsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetVTIntervalUASsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetVTIntervalUASs", "1.3.6.1.2.1.10.39.3.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetVTIntervalValidDataEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetVTIntervalValidDataEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetVTIntervalValidData", "1.3.6.1.2.1.10.39.3.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SonetFarEndVTEnt extends MIBEntry<SONETMIBDef>
            {
                /** The SONET/SDH Far End VT group
This group consists of two tables:SONET/SDH Far End VT Current TableSONET/SDH Far End VT Interval Table
The SONET/SDH Far End VT Current
The SONET/SDH Far End VT Current tablecontains various statisticsbeing collected for the current 15 minute interval.The statistics are collected fromthe far end block error code(FEBE) within the G1 byte of the VT Overhead.


The definitions are the same as described forthe near-end information.*/
                public final SonetFarEndVTCurrentTableEnt sonetFarEndVTCurrentTable;

                /** The SONET/SDH Far End VT Interval Table
The SONET/SDH Far End VT Interval Tablecontains various statisticscollected by each system over a maximumof the previous 24 hours ofoperation.  The past 24 hours may be broken into 96completed 15 minute intervals.A system is required to store atleast 4 completed 15 minute interval.The default value is 32 intervals.*/
                public final SonetFarEndVTIntervalTableEnt sonetFarEndVTIntervalTable;

                private SonetFarEndVTEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                {
                    super(mib, parent, "sonetFarEndVT", "1.3.6.1.2.1.10.39.3.2", false, false, false, false);
                    this.sonetFarEndVTCurrentTable = new SonetFarEndVTCurrentTableEnt(mib, this);
                    this.sonetFarEndVTIntervalTable = new SonetFarEndVTIntervalTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sonetFarEndVTCurrentTable,
                        this.sonetFarEndVTIntervalTable
                    };
                }
                public static final class SonetFarEndVTCurrentTableEnt extends MIBEntry<SONETMIBDef>
                {
                    public final SonetFarEndVTCurrentEntryEnt sonetFarEndVTCurrentEntry;

                    private SonetFarEndVTCurrentTableEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetFarEndVTCurrentTable", "1.3.6.1.2.1.10.39.3.2.1", false, true, false, false);
                        this.sonetFarEndVTCurrentEntry = new SonetFarEndVTCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sonetFarEndVTCurrentEntry
                        };
                    }
                    public static final class SonetFarEndVTCurrentEntryEnt extends MIBEntry<SONETMIBDef>
                    {
                        public final SonetFarEndVTCurrentESsEnt sonetFarEndVTCurrentESs;

                        public final SonetFarEndVTCurrentSESsEnt sonetFarEndVTCurrentSESs;

                        public final SonetFarEndVTCurrentCVsEnt sonetFarEndVTCurrentCVs;

                        public final SonetFarEndVTCurrentUASsEnt sonetFarEndVTCurrentUASs;

                        private SonetFarEndVTCurrentEntryEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                        {
                            super(mib, parent, "sonetFarEndVTCurrentEntry", "1.3.6.1.2.1.10.39.3.2.1.1", false, false, false, true);
                            this.sonetFarEndVTCurrentESs = new SonetFarEndVTCurrentESsEnt(mib, this);
                            this.sonetFarEndVTCurrentSESs = new SonetFarEndVTCurrentSESsEnt(mib, this);
                            this.sonetFarEndVTCurrentCVs = new SonetFarEndVTCurrentCVsEnt(mib, this);
                            this.sonetFarEndVTCurrentUASs = new SonetFarEndVTCurrentUASsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sonetFarEndVTCurrentESs,
                                this.sonetFarEndVTCurrentSESs,
                                this.sonetFarEndVTCurrentCVs,
                                this.sonetFarEndVTCurrentUASs
                            };
                        }
                        public static final class SonetFarEndVTCurrentESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndVTCurrentESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndVTCurrentESs", "1.3.6.1.2.1.10.39.3.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndVTCurrentSESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndVTCurrentSESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndVTCurrentSESs", "1.3.6.1.2.1.10.39.3.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndVTCurrentCVsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndVTCurrentCVsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndVTCurrentCVs", "1.3.6.1.2.1.10.39.3.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndVTCurrentUASsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndVTCurrentUASsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndVTCurrentUASs", "1.3.6.1.2.1.10.39.3.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SonetFarEndVTIntervalTableEnt extends MIBEntry<SONETMIBDef>
                {
                    public final SonetFarEndVTIntervalEntryEnt sonetFarEndVTIntervalEntry;

                    private SonetFarEndVTIntervalTableEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetFarEndVTIntervalTable", "1.3.6.1.2.1.10.39.3.2.2", false, true, false, false);
                        this.sonetFarEndVTIntervalEntry = new SonetFarEndVTIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sonetFarEndVTIntervalEntry
                        };
                    }
                    public static final class SonetFarEndVTIntervalEntryEnt extends MIBEntry<SONETMIBDef>
                    {
                        public final SonetFarEndVTIntervalNumberEnt sonetFarEndVTIntervalNumber;

                        public final SonetFarEndVTIntervalESsEnt sonetFarEndVTIntervalESs;

                        public final SonetFarEndVTIntervalSESsEnt sonetFarEndVTIntervalSESs;

                        public final SonetFarEndVTIntervalCVsEnt sonetFarEndVTIntervalCVs;

                        public final SonetFarEndVTIntervalUASsEnt sonetFarEndVTIntervalUASs;

                        public final SonetFarEndVTIntervalValidDataEnt sonetFarEndVTIntervalValidData;

                        private SonetFarEndVTIntervalEntryEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                        {
                            super(mib, parent, "sonetFarEndVTIntervalEntry", "1.3.6.1.2.1.10.39.3.2.2.1", false, false, false, true);
                            this.sonetFarEndVTIntervalNumber = new SonetFarEndVTIntervalNumberEnt(mib, this);
                            this.sonetFarEndVTIntervalESs = new SonetFarEndVTIntervalESsEnt(mib, this);
                            this.sonetFarEndVTIntervalSESs = new SonetFarEndVTIntervalSESsEnt(mib, this);
                            this.sonetFarEndVTIntervalCVs = new SonetFarEndVTIntervalCVsEnt(mib, this);
                            this.sonetFarEndVTIntervalUASs = new SonetFarEndVTIntervalUASsEnt(mib, this);
                            this.sonetFarEndVTIntervalValidData = new SonetFarEndVTIntervalValidDataEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sonetFarEndVTIntervalNumber,
                                this.sonetFarEndVTIntervalESs,
                                this.sonetFarEndVTIntervalSESs,
                                this.sonetFarEndVTIntervalCVs,
                                this.sonetFarEndVTIntervalUASs,
                                this.sonetFarEndVTIntervalValidData
                            };
                        }
                        public static final class SonetFarEndVTIntervalNumberEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndVTIntervalNumberEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndVTIntervalNumber", "1.3.6.1.2.1.10.39.3.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndVTIntervalESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndVTIntervalESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndVTIntervalESs", "1.3.6.1.2.1.10.39.3.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndVTIntervalSESsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndVTIntervalSESsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndVTIntervalSESs", "1.3.6.1.2.1.10.39.3.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndVTIntervalCVsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndVTIntervalCVsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndVTIntervalCVs", "1.3.6.1.2.1.10.39.3.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndVTIntervalUASsEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndVTIntervalUASsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndVTIntervalUASs", "1.3.6.1.2.1.10.39.3.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SonetFarEndVTIntervalValidDataEnt extends MIBEntry<SONETMIBDef>
                        {
                            private SonetFarEndVTIntervalValidDataEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                            {
                                super(mib, parent, "sonetFarEndVTIntervalValidData", "1.3.6.1.2.1.10.39.3.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class SonetConformanceEnt extends MIBEntry<SONETMIBDef>
        {
            public final SonetGroupsEnt sonetGroups;

            public final SonetCompliancesEnt sonetCompliances;

            private SonetConformanceEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
            {
                super(mib, parent, "sonetConformance", "1.3.6.1.2.1.10.39.4", false, false, false, false);
                this.sonetGroups = new SonetGroupsEnt(mib, this);
                this.sonetCompliances = new SonetCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sonetGroups,
                    this.sonetCompliances
                };
            }
            public static final class SonetGroupsEnt extends MIBEntry<SONETMIBDef>
            {
                /** units of conformance
deprecated groups*/
                public final SonetMediumStuffEnt sonetMediumStuff;

                public final SonetSectionStuffEnt sonetSectionStuff;

                public final SonetLineStuffEnt sonetLineStuff;

                public final SonetFarEndLineStuffEnt sonetFarEndLineStuff;

                public final SonetPathStuffEnt sonetPathStuff;

                public final SonetFarEndPathStuffEnt sonetFarEndPathStuff;

                public final SonetVTStuffEnt sonetVTStuff;

                public final SonetFarEndVTStuffEnt sonetFarEndVTStuff;

                /** current groups*/
                public final SonetMediumStuff2Ent sonetMediumStuff2;

                public final SonetSectionStuff2Ent sonetSectionStuff2;

                public final SonetLineStuff2Ent sonetLineStuff2;

                public final SonetPathStuff2Ent sonetPathStuff2;

                public final SonetVTStuff2Ent sonetVTStuff2;

                public final SonetFarEndLineStuff2Ent sonetFarEndLineStuff2;

                public final SonetFarEndPathStuff2Ent sonetFarEndPathStuff2;

                public final SonetFarEndVTStuff2Ent sonetFarEndVTStuff2;

                private SonetGroupsEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                {
                    super(mib, parent, "sonetGroups", "1.3.6.1.2.1.10.39.4.1", false, false, false, false);
                    this.sonetMediumStuff = new SonetMediumStuffEnt(mib, this);
                    this.sonetSectionStuff = new SonetSectionStuffEnt(mib, this);
                    this.sonetLineStuff = new SonetLineStuffEnt(mib, this);
                    this.sonetFarEndLineStuff = new SonetFarEndLineStuffEnt(mib, this);
                    this.sonetPathStuff = new SonetPathStuffEnt(mib, this);
                    this.sonetFarEndPathStuff = new SonetFarEndPathStuffEnt(mib, this);
                    this.sonetVTStuff = new SonetVTStuffEnt(mib, this);
                    this.sonetFarEndVTStuff = new SonetFarEndVTStuffEnt(mib, this);
                    this.sonetMediumStuff2 = new SonetMediumStuff2Ent(mib, this);
                    this.sonetSectionStuff2 = new SonetSectionStuff2Ent(mib, this);
                    this.sonetLineStuff2 = new SonetLineStuff2Ent(mib, this);
                    this.sonetPathStuff2 = new SonetPathStuff2Ent(mib, this);
                    this.sonetVTStuff2 = new SonetVTStuff2Ent(mib, this);
                    this.sonetFarEndLineStuff2 = new SonetFarEndLineStuff2Ent(mib, this);
                    this.sonetFarEndPathStuff2 = new SonetFarEndPathStuff2Ent(mib, this);
                    this.sonetFarEndVTStuff2 = new SonetFarEndVTStuff2Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sonetMediumStuff,
                        this.sonetSectionStuff,
                        this.sonetLineStuff,
                        this.sonetFarEndLineStuff,
                        this.sonetPathStuff,
                        this.sonetFarEndPathStuff,
                        this.sonetVTStuff,
                        this.sonetFarEndVTStuff,
                        this.sonetMediumStuff2,
                        this.sonetSectionStuff2,
                        this.sonetLineStuff2,
                        this.sonetPathStuff2,
                        this.sonetVTStuff2,
                        this.sonetFarEndLineStuff2,
                        this.sonetFarEndPathStuff2,
                        this.sonetFarEndVTStuff2
                    };
                }
                public static final class SonetMediumStuffEnt extends MIBEntry<SONETMIBDef>
                {
                    private SonetMediumStuffEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetMediumStuff", "1.3.6.1.2.1.10.39.4.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SonetSectionStuffEnt extends MIBEntry<SONETMIBDef>
                {
                    private SonetSectionStuffEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetSectionStuff", "1.3.6.1.2.1.10.39.4.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SonetLineStuffEnt extends MIBEntry<SONETMIBDef>
                {
                    private SonetLineStuffEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetLineStuff", "1.3.6.1.2.1.10.39.4.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SonetFarEndLineStuffEnt extends MIBEntry<SONETMIBDef>
                {
                    private SonetFarEndLineStuffEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetFarEndLineStuff", "1.3.6.1.2.1.10.39.4.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SonetPathStuffEnt extends MIBEntry<SONETMIBDef>
                {
                    private SonetPathStuffEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetPathStuff", "1.3.6.1.2.1.10.39.4.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SonetFarEndPathStuffEnt extends MIBEntry<SONETMIBDef>
                {
                    private SonetFarEndPathStuffEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetFarEndPathStuff", "1.3.6.1.2.1.10.39.4.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SonetVTStuffEnt extends MIBEntry<SONETMIBDef>
                {
                    private SonetVTStuffEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetVTStuff", "1.3.6.1.2.1.10.39.4.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SonetFarEndVTStuffEnt extends MIBEntry<SONETMIBDef>
                {
                    private SonetFarEndVTStuffEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetFarEndVTStuff", "1.3.6.1.2.1.10.39.4.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SonetMediumStuff2Ent extends MIBEntry<SONETMIBDef>
                {
                    private SonetMediumStuff2Ent(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetMediumStuff2", "1.3.6.1.2.1.10.39.4.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SonetSectionStuff2Ent extends MIBEntry<SONETMIBDef>
                {
                    private SonetSectionStuff2Ent(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetSectionStuff2", "1.3.6.1.2.1.10.39.4.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SonetLineStuff2Ent extends MIBEntry<SONETMIBDef>
                {
                    private SonetLineStuff2Ent(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetLineStuff2", "1.3.6.1.2.1.10.39.4.1.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SonetPathStuff2Ent extends MIBEntry<SONETMIBDef>
                {
                    private SonetPathStuff2Ent(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetPathStuff2", "1.3.6.1.2.1.10.39.4.1.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SonetVTStuff2Ent extends MIBEntry<SONETMIBDef>
                {
                    private SonetVTStuff2Ent(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetVTStuff2", "1.3.6.1.2.1.10.39.4.1.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SonetFarEndLineStuff2Ent extends MIBEntry<SONETMIBDef>
                {
                    private SonetFarEndLineStuff2Ent(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetFarEndLineStuff2", "1.3.6.1.2.1.10.39.4.1.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SonetFarEndPathStuff2Ent extends MIBEntry<SONETMIBDef>
                {
                    private SonetFarEndPathStuff2Ent(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetFarEndPathStuff2", "1.3.6.1.2.1.10.39.4.1.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SonetFarEndVTStuff2Ent extends MIBEntry<SONETMIBDef>
                {
                    private SonetFarEndVTStuff2Ent(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetFarEndVTStuff2", "1.3.6.1.2.1.10.39.4.1.16", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SonetCompliancesEnt extends MIBEntry<SONETMIBDef>
            {
                /** deprecated compliance statement*/
                public final SonetComplianceEnt sonetCompliance;

                /** current compliance statements*/
                public final SonetCompliance2Ent sonetCompliance2;

                private SonetCompliancesEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                {
                    super(mib, parent, "sonetCompliances", "1.3.6.1.2.1.10.39.4.2", false, false, false, false);
                    this.sonetCompliance = new SonetComplianceEnt(mib, this);
                    this.sonetCompliance2 = new SonetCompliance2Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sonetCompliance,
                        this.sonetCompliance2
                    };
                }
                public static final class SonetComplianceEnt extends MIBEntry<SONETMIBDef>
                {
                    private SonetComplianceEnt(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetCompliance", "1.3.6.1.2.1.10.39.4.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SonetCompliance2Ent extends MIBEntry<SONETMIBDef>
                {
                    private SonetCompliance2Ent(SONETMIBDef mib, MIBEntry<SONETMIBDef> parent)
                    {
                        super(mib, parent, "sonetCompliance2", "1.3.6.1.2.1.10.39.4.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
