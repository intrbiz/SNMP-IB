package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**For those chipsets not represented above, OBJECT IDENTIFIER
assignment is required in other documentation, e.g., assignment
within that part of the registration tree delegated to
individual enterprises (see RFC 1155).*/
public final class RFC1398MIBDef extends MIB
{
    public static final RFC1398MIBDef RFC1398MIB = new RFC1398MIBDef();

    static { MIBs.getInstance().registerMIB(RFC1398MIBDef.RFC1398MIB); }

    public final Dot3Ent dot3;

    public final Dot3CollIndexEnt dot3CollIndex;

    public final Dot3ChipSetsEnt dot3ChipSets;

    private RFC1398MIBDef()
    {
        super("RFC1398-MIB");
        this.dot3 = new Dot3Ent(this, null);
        this.dot3CollIndex = new Dot3CollIndexEnt(this, null);
        this.dot3ChipSets = new Dot3ChipSetsEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dot3,
            this.dot3CollIndex,
            this.dot3ChipSets
        };
    }

    public static final class Dot3Ent extends MIBEntry<RFC1398MIBDef>
    {
        /** the Ethernet-like Statistics group*/
        public final Dot3StatsTableEnt dot3StatsTable;

        /** the Ethernet-like Collision Statistics group
Implementation of this group is optional; it is appropriatefor all systems which have the necessary metering*/
        public final Dot3CollTableEnt dot3CollTable;

        public final Dot3ErrorsEnt dot3Errors;

        /** 802.3 Tests*/
        public final Dot3TestsEnt dot3Tests;

        private Dot3Ent(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
        {
            super(mib, parent, "dot3", "1.3.6.1.2.1.10.7", false, false, false, false);
            this.dot3StatsTable = new Dot3StatsTableEnt(mib, this);
            this.dot3CollTable = new Dot3CollTableEnt(mib, this);
            this.dot3Errors = new Dot3ErrorsEnt(mib, this);
            this.dot3Tests = new Dot3TestsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dot3StatsTable,
                this.dot3CollTable,
                this.dot3Errors,
                this.dot3Tests
            };
        }
        public static final class Dot3StatsTableEnt extends MIBEntry<RFC1398MIBDef>
        {
            public final Dot3StatsEntryEnt dot3StatsEntry;

            private Dot3StatsTableEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
            {
                super(mib, parent, "dot3StatsTable", "1.3.6.1.2.1.10.7.2", false, true, false, false);
                this.dot3StatsEntry = new Dot3StatsEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3StatsEntry
                };
            }
            public static final class Dot3StatsEntryEnt extends MIBEntry<RFC1398MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final Dot3StatsIndexEnt dot3StatsIndex;

                public final Dot3StatsAlignmentErrorsEnt dot3StatsAlignmentErrors;

                public final Dot3StatsFCSErrorsEnt dot3StatsFCSErrors;

                public final Dot3StatsSingleCollisionFramesEnt dot3StatsSingleCollisionFrames;

                public final Dot3StatsMultipleCollisionFramesEnt dot3StatsMultipleCollisionFrames;

                public final Dot3StatsSQETestErrorsEnt dot3StatsSQETestErrors;

                public final Dot3StatsDeferredTransmissionsEnt dot3StatsDeferredTransmissions;

                public final Dot3StatsLateCollisionsEnt dot3StatsLateCollisions;

                public final Dot3StatsExcessiveCollisionsEnt dot3StatsExcessiveCollisions;

                public final Dot3StatsInternalMacTransmitErrorsEnt dot3StatsInternalMacTransmitErrors;

                public final Dot3StatsCarrierSenseErrorsEnt dot3StatsCarrierSenseErrors;

                /** { dot3StatsEntry 12 } is not assigned*/
                public final Dot3StatsFrameTooLongsEnt dot3StatsFrameTooLongs;

                /** { dot3StatsEntry 14 } is not assigned
{ dot3StatsEntry 15 } is not assigned*/
                public final Dot3StatsInternalMacReceiveErrorsEnt dot3StatsInternalMacReceiveErrors;

                private Dot3StatsEntryEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                {
                    super(mib, parent, "dot3StatsEntry", "1.3.6.1.2.1.10.7.2.1", false, false, false, true);
                    this.dot3StatsIndex = new Dot3StatsIndexEnt(mib, this);
                    this.dot3StatsAlignmentErrors = new Dot3StatsAlignmentErrorsEnt(mib, this);
                    this.dot3StatsFCSErrors = new Dot3StatsFCSErrorsEnt(mib, this);
                    this.dot3StatsSingleCollisionFrames = new Dot3StatsSingleCollisionFramesEnt(mib, this);
                    this.dot3StatsMultipleCollisionFrames = new Dot3StatsMultipleCollisionFramesEnt(mib, this);
                    this.dot3StatsSQETestErrors = new Dot3StatsSQETestErrorsEnt(mib, this);
                    this.dot3StatsDeferredTransmissions = new Dot3StatsDeferredTransmissionsEnt(mib, this);
                    this.dot3StatsLateCollisions = new Dot3StatsLateCollisionsEnt(mib, this);
                    this.dot3StatsExcessiveCollisions = new Dot3StatsExcessiveCollisionsEnt(mib, this);
                    this.dot3StatsInternalMacTransmitErrors = new Dot3StatsInternalMacTransmitErrorsEnt(mib, this);
                    this.dot3StatsCarrierSenseErrors = new Dot3StatsCarrierSenseErrorsEnt(mib, this);
                    this.dot3StatsFrameTooLongs = new Dot3StatsFrameTooLongsEnt(mib, this);
                    this.dot3StatsInternalMacReceiveErrors = new Dot3StatsInternalMacReceiveErrorsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3StatsIndex,
                        this.dot3StatsAlignmentErrors,
                        this.dot3StatsFCSErrors,
                        this.dot3StatsSingleCollisionFrames,
                        this.dot3StatsMultipleCollisionFrames,
                        this.dot3StatsSQETestErrors,
                        this.dot3StatsDeferredTransmissions,
                        this.dot3StatsLateCollisions,
                        this.dot3StatsExcessiveCollisions,
                        this.dot3StatsInternalMacTransmitErrors,
                        this.dot3StatsCarrierSenseErrors,
                        this.dot3StatsFrameTooLongs,
                        this.dot3StatsInternalMacReceiveErrors
                    };
                }
                public static final class Dot3StatsIndexEnt extends MIBEntry<RFC1398MIBDef>
                {
                    private Dot3StatsIndexEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsIndex", "1.3.6.1.2.1.10.7.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsAlignmentErrorsEnt extends MIBEntry<RFC1398MIBDef>
                {
                    private Dot3StatsAlignmentErrorsEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsAlignmentErrors", "1.3.6.1.2.1.10.7.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsFCSErrorsEnt extends MIBEntry<RFC1398MIBDef>
                {
                    private Dot3StatsFCSErrorsEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsFCSErrors", "1.3.6.1.2.1.10.7.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsSingleCollisionFramesEnt extends MIBEntry<RFC1398MIBDef>
                {
                    private Dot3StatsSingleCollisionFramesEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsSingleCollisionFrames", "1.3.6.1.2.1.10.7.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsMultipleCollisionFramesEnt extends MIBEntry<RFC1398MIBDef>
                {
                    private Dot3StatsMultipleCollisionFramesEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsMultipleCollisionFrames", "1.3.6.1.2.1.10.7.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsSQETestErrorsEnt extends MIBEntry<RFC1398MIBDef>
                {
                    private Dot3StatsSQETestErrorsEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsSQETestErrors", "1.3.6.1.2.1.10.7.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsDeferredTransmissionsEnt extends MIBEntry<RFC1398MIBDef>
                {
                    private Dot3StatsDeferredTransmissionsEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsDeferredTransmissions", "1.3.6.1.2.1.10.7.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsLateCollisionsEnt extends MIBEntry<RFC1398MIBDef>
                {
                    private Dot3StatsLateCollisionsEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsLateCollisions", "1.3.6.1.2.1.10.7.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsExcessiveCollisionsEnt extends MIBEntry<RFC1398MIBDef>
                {
                    private Dot3StatsExcessiveCollisionsEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsExcessiveCollisions", "1.3.6.1.2.1.10.7.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsInternalMacTransmitErrorsEnt extends MIBEntry<RFC1398MIBDef>
                {
                    private Dot3StatsInternalMacTransmitErrorsEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsInternalMacTransmitErrors", "1.3.6.1.2.1.10.7.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsCarrierSenseErrorsEnt extends MIBEntry<RFC1398MIBDef>
                {
                    private Dot3StatsCarrierSenseErrorsEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsCarrierSenseErrors", "1.3.6.1.2.1.10.7.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsFrameTooLongsEnt extends MIBEntry<RFC1398MIBDef>
                {
                    private Dot3StatsFrameTooLongsEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsFrameTooLongs", "1.3.6.1.2.1.10.7.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsInternalMacReceiveErrorsEnt extends MIBEntry<RFC1398MIBDef>
                {
                    private Dot3StatsInternalMacReceiveErrorsEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsInternalMacReceiveErrors", "1.3.6.1.2.1.10.7.2.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dot3CollTableEnt extends MIBEntry<RFC1398MIBDef>
        {
            public final Dot3CollEntryEnt dot3CollEntry;

            private Dot3CollTableEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
            {
                super(mib, parent, "dot3CollTable", "1.3.6.1.2.1.10.7.5", false, true, false, false);
                this.dot3CollEntry = new Dot3CollEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3CollEntry
                };
            }
            public static final class Dot3CollEntryEnt extends MIBEntry<RFC1398MIBDef>
            {
                /** { dot3CollEntry 1 } is no longer in use*/
                public final Dot3CollCountEnt dot3CollCount;

                public final Dot3CollFrequenciesEnt dot3CollFrequencies;

                private Dot3CollEntryEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                {
                    super(mib, parent, "dot3CollEntry", "1.3.6.1.2.1.10.7.5.1", false, false, false, true);
                    this.dot3CollCount = new Dot3CollCountEnt(mib, this);
                    this.dot3CollFrequencies = new Dot3CollFrequenciesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3CollCount,
                        this.dot3CollFrequencies
                    };
                }
                public static final class Dot3CollCountEnt extends MIBEntry<RFC1398MIBDef>
                {
                    private Dot3CollCountEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                    {
                        super(mib, parent, "dot3CollCount", "1.3.6.1.2.1.10.7.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3CollFrequenciesEnt extends MIBEntry<RFC1398MIBDef>
                {
                    private Dot3CollFrequenciesEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                    {
                        super(mib, parent, "dot3CollFrequencies", "1.3.6.1.2.1.10.7.5.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dot3ErrorsEnt extends MIBEntry<RFC1398MIBDef>
        {
            public final Dot3ErrorInitErrorEnt dot3ErrorInitError;

            public final Dot3ErrorLoopbackErrorEnt dot3ErrorLoopbackError;

            private Dot3ErrorsEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
            {
                super(mib, parent, "dot3Errors", "1.3.6.1.2.1.10.7.7", false, false, false, false);
                this.dot3ErrorInitError = new Dot3ErrorInitErrorEnt(mib, this);
                this.dot3ErrorLoopbackError = new Dot3ErrorLoopbackErrorEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ErrorInitError,
                    this.dot3ErrorLoopbackError
                };
            }
            public static final class Dot3ErrorInitErrorEnt extends MIBEntry<RFC1398MIBDef>
            {
                private Dot3ErrorInitErrorEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                {
                    super(mib, parent, "dot3ErrorInitError", "1.3.6.1.2.1.10.7.7.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ErrorLoopbackErrorEnt extends MIBEntry<RFC1398MIBDef>
            {
                private Dot3ErrorLoopbackErrorEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                {
                    super(mib, parent, "dot3ErrorLoopbackError", "1.3.6.1.2.1.10.7.7.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3TestsEnt extends MIBEntry<RFC1398MIBDef>
        {
            /** TDR Test*/
            public final Dot3TestTdrEnt dot3TestTdr;

            private Dot3TestsEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
            {
                super(mib, parent, "dot3Tests", "1.3.6.1.2.1.10.7.6", false, false, false, false);
                this.dot3TestTdr = new Dot3TestTdrEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3TestTdr
                };
            }
            public static final class Dot3TestTdrEnt extends MIBEntry<RFC1398MIBDef>
            {
                private Dot3TestTdrEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                {
                    super(mib, parent, "dot3TestTdr", "1.3.6.1.2.1.10.7.6.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class Dot3CollIndexEnt extends MIBEntry<RFC1398MIBDef>
    {
        private Dot3CollIndexEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
        {
            super(mib, parent, "dot3CollIndex", "1.3.6.1.2.1.10.7.5.1.1", false, false, true, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class Dot3ChipSetsEnt extends MIBEntry<RFC1398MIBDef>
    {
        public final Dot3ChipSetAMDEnt dot3ChipSetAMD;

        public final Dot3ChipSetIntelEnt dot3ChipSetIntel;

        public final Dot3ChipSetSeeqEnt dot3ChipSetSeeq;

        public final Dot3ChipSetNationalEnt dot3ChipSetNational;

        public final Dot3ChipSetFujitsuEnt dot3ChipSetFujitsu;

        private Dot3ChipSetsEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
        {
            super(mib, parent, "dot3ChipSets", "1.3.6.1.2.1.10.7.8", false, false, false, false);
            this.dot3ChipSetAMD = new Dot3ChipSetAMDEnt(mib, this);
            this.dot3ChipSetIntel = new Dot3ChipSetIntelEnt(mib, this);
            this.dot3ChipSetSeeq = new Dot3ChipSetSeeqEnt(mib, this);
            this.dot3ChipSetNational = new Dot3ChipSetNationalEnt(mib, this);
            this.dot3ChipSetFujitsu = new Dot3ChipSetFujitsuEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dot3ChipSetAMD,
                this.dot3ChipSetIntel,
                this.dot3ChipSetSeeq,
                this.dot3ChipSetNational,
                this.dot3ChipSetFujitsu
            };
        }
        public static final class Dot3ChipSetAMDEnt extends MIBEntry<RFC1398MIBDef>
        {
            public final Dot3ChipSetAMD7990Ent dot3ChipSetAMD7990;

            public final Dot3ChipSetAMD79900Ent dot3ChipSetAMD79900;

            private Dot3ChipSetAMDEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
            {
                super(mib, parent, "dot3ChipSetAMD", "1.3.6.1.2.1.10.7.8.1", false, false, false, false);
                this.dot3ChipSetAMD7990 = new Dot3ChipSetAMD7990Ent(mib, this);
                this.dot3ChipSetAMD79900 = new Dot3ChipSetAMD79900Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ChipSetAMD7990,
                    this.dot3ChipSetAMD79900
                };
            }
            public static final class Dot3ChipSetAMD7990Ent extends MIBEntry<RFC1398MIBDef>
            {
                private Dot3ChipSetAMD7990Ent(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetAMD7990", "1.3.6.1.2.1.10.7.8.1.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetAMD79900Ent extends MIBEntry<RFC1398MIBDef>
            {
                private Dot3ChipSetAMD79900Ent(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetAMD79900", "1.3.6.1.2.1.10.7.8.1.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3ChipSetIntelEnt extends MIBEntry<RFC1398MIBDef>
        {
            public final Dot3ChipSetIntel82586Ent dot3ChipSetIntel82586;

            public final Dot3ChipSetIntel82596Ent dot3ChipSetIntel82596;

            private Dot3ChipSetIntelEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
            {
                super(mib, parent, "dot3ChipSetIntel", "1.3.6.1.2.1.10.7.8.2", false, false, false, false);
                this.dot3ChipSetIntel82586 = new Dot3ChipSetIntel82586Ent(mib, this);
                this.dot3ChipSetIntel82596 = new Dot3ChipSetIntel82596Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ChipSetIntel82586,
                    this.dot3ChipSetIntel82596
                };
            }
            public static final class Dot3ChipSetIntel82586Ent extends MIBEntry<RFC1398MIBDef>
            {
                private Dot3ChipSetIntel82586Ent(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetIntel82586", "1.3.6.1.2.1.10.7.8.2.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetIntel82596Ent extends MIBEntry<RFC1398MIBDef>
            {
                private Dot3ChipSetIntel82596Ent(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetIntel82596", "1.3.6.1.2.1.10.7.8.2.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3ChipSetSeeqEnt extends MIBEntry<RFC1398MIBDef>
        {
            public final Dot3ChipSetSeeq8003Ent dot3ChipSetSeeq8003;

            private Dot3ChipSetSeeqEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
            {
                super(mib, parent, "dot3ChipSetSeeq", "1.3.6.1.2.1.10.7.8.3", false, false, false, false);
                this.dot3ChipSetSeeq8003 = new Dot3ChipSetSeeq8003Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ChipSetSeeq8003
                };
            }
            public static final class Dot3ChipSetSeeq8003Ent extends MIBEntry<RFC1398MIBDef>
            {
                private Dot3ChipSetSeeq8003Ent(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetSeeq8003", "1.3.6.1.2.1.10.7.8.3.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3ChipSetNationalEnt extends MIBEntry<RFC1398MIBDef>
        {
            public final Dot3ChipSetNational8390Ent dot3ChipSetNational8390;

            public final Dot3ChipSetNationalSonicEnt dot3ChipSetNationalSonic;

            private Dot3ChipSetNationalEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
            {
                super(mib, parent, "dot3ChipSetNational", "1.3.6.1.2.1.10.7.8.4", false, false, false, false);
                this.dot3ChipSetNational8390 = new Dot3ChipSetNational8390Ent(mib, this);
                this.dot3ChipSetNationalSonic = new Dot3ChipSetNationalSonicEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ChipSetNational8390,
                    this.dot3ChipSetNationalSonic
                };
            }
            public static final class Dot3ChipSetNational8390Ent extends MIBEntry<RFC1398MIBDef>
            {
                private Dot3ChipSetNational8390Ent(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetNational8390", "1.3.6.1.2.1.10.7.8.4.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetNationalSonicEnt extends MIBEntry<RFC1398MIBDef>
            {
                private Dot3ChipSetNationalSonicEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetNationalSonic", "1.3.6.1.2.1.10.7.8.4.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3ChipSetFujitsuEnt extends MIBEntry<RFC1398MIBDef>
        {
            public final Dot3ChipSetFujitsu86950Ent dot3ChipSetFujitsu86950;

            public final Dot3ChipSetFujitsu86960Ent dot3ChipSetFujitsu86960;

            private Dot3ChipSetFujitsuEnt(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
            {
                super(mib, parent, "dot3ChipSetFujitsu", "1.3.6.1.2.1.10.7.8.5", false, false, false, false);
                this.dot3ChipSetFujitsu86950 = new Dot3ChipSetFujitsu86950Ent(mib, this);
                this.dot3ChipSetFujitsu86960 = new Dot3ChipSetFujitsu86960Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ChipSetFujitsu86950,
                    this.dot3ChipSetFujitsu86960
                };
            }
            public static final class Dot3ChipSetFujitsu86950Ent extends MIBEntry<RFC1398MIBDef>
            {
                private Dot3ChipSetFujitsu86950Ent(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetFujitsu86950", "1.3.6.1.2.1.10.7.8.5.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ChipSetFujitsu86960Ent extends MIBEntry<RFC1398MIBDef>
            {
                private Dot3ChipSetFujitsu86960Ent(RFC1398MIBDef mib, MIBEntry<RFC1398MIBDef> parent)
                {
                    super(mib, parent, "dot3ChipSetFujitsu86960", "1.3.6.1.2.1.10.7.8.5.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
