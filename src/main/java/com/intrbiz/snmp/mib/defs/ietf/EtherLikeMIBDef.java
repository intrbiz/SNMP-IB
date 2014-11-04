package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class EtherLikeMIBDef extends MIB
{
    public static final EtherLikeMIBDef EtherLikeMIB = new EtherLikeMIBDef();

    static { MIBs.getInstance().registerMIB(EtherLikeMIBDef.EtherLikeMIB); }

    /** September 19, 2003*/
    public final EtherMIBEnt etherMIB;

    public final Dot3Ent dot3;

    private EtherLikeMIBDef()
    {
        super("EtherLike-MIB");
        this.etherMIB = new EtherMIBEnt(this, null);
        this.dot3 = new Dot3Ent(this, null);
        this.entries = new MIBEntry<?>[] {
            this.etherMIB,
            this.dot3
        };
    }

    public static final class EtherMIBEnt extends MIBEntry<EtherLikeMIBDef>
    {
        public final EtherMIBObjectsEnt etherMIBObjects;

        /** { dot3 8 }, the dot3ChipSets tree, is defined in [RFC2666]
conformance information*/
        public final EtherConformanceEnt etherConformance;

        private EtherMIBEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
        {
            super(mib, parent, "etherMIB", "1.3.6.1.2.1.35", false, false, false, false);
            this.etherMIBObjects = new EtherMIBObjectsEnt(mib, this);
            this.etherConformance = new EtherConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.etherMIBObjects,
                this.etherConformance
            };
        }
        public static final class EtherMIBObjectsEnt extends MIBEntry<EtherLikeMIBDef>
        {
            private EtherMIBObjectsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
            {
                super(mib, parent, "etherMIBObjects", "1.3.6.1.2.1.35.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class EtherConformanceEnt extends MIBEntry<EtherLikeMIBDef>
        {
            public final EtherGroupsEnt etherGroups;

            public final EtherCompliancesEnt etherCompliances;

            private EtherConformanceEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
            {
                super(mib, parent, "etherConformance", "1.3.6.1.2.1.35.2", false, false, false, false);
                this.etherGroups = new EtherGroupsEnt(mib, this);
                this.etherCompliances = new EtherCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.etherGroups,
                    this.etherCompliances
                };
            }
            public static final class EtherGroupsEnt extends MIBEntry<EtherLikeMIBDef>
            {
                /** units of conformance*/
                public final EtherStatsGroupEnt etherStatsGroup;

                public final EtherCollisionTableGroupEnt etherCollisionTableGroup;

                public final EtherStats100MbsGroupEnt etherStats100MbsGroup;

                public final EtherStatsBaseGroupEnt etherStatsBaseGroup;

                public final EtherStatsLowSpeedGroupEnt etherStatsLowSpeedGroup;

                public final EtherStatsHighSpeedGroupEnt etherStatsHighSpeedGroup;

                public final EtherDuplexGroupEnt etherDuplexGroup;

                public final EtherControlGroupEnt etherControlGroup;

                public final EtherControlPauseGroupEnt etherControlPauseGroup;

                public final EtherStatsBaseGroup2Ent etherStatsBaseGroup2;

                public final EtherStatsHalfDuplexGroupEnt etherStatsHalfDuplexGroup;

                public final EtherHCStatsGroupEnt etherHCStatsGroup;

                public final EtherHCControlGroupEnt etherHCControlGroup;

                public final EtherHCControlPauseGroupEnt etherHCControlPauseGroup;

                public final EtherRateControlGroupEnt etherRateControlGroup;

                private EtherGroupsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                {
                    super(mib, parent, "etherGroups", "1.3.6.1.2.1.35.2.1", false, false, false, false);
                    this.etherStatsGroup = new EtherStatsGroupEnt(mib, this);
                    this.etherCollisionTableGroup = new EtherCollisionTableGroupEnt(mib, this);
                    this.etherStats100MbsGroup = new EtherStats100MbsGroupEnt(mib, this);
                    this.etherStatsBaseGroup = new EtherStatsBaseGroupEnt(mib, this);
                    this.etherStatsLowSpeedGroup = new EtherStatsLowSpeedGroupEnt(mib, this);
                    this.etherStatsHighSpeedGroup = new EtherStatsHighSpeedGroupEnt(mib, this);
                    this.etherDuplexGroup = new EtherDuplexGroupEnt(mib, this);
                    this.etherControlGroup = new EtherControlGroupEnt(mib, this);
                    this.etherControlPauseGroup = new EtherControlPauseGroupEnt(mib, this);
                    this.etherStatsBaseGroup2 = new EtherStatsBaseGroup2Ent(mib, this);
                    this.etherStatsHalfDuplexGroup = new EtherStatsHalfDuplexGroupEnt(mib, this);
                    this.etherHCStatsGroup = new EtherHCStatsGroupEnt(mib, this);
                    this.etherHCControlGroup = new EtherHCControlGroupEnt(mib, this);
                    this.etherHCControlPauseGroup = new EtherHCControlPauseGroupEnt(mib, this);
                    this.etherRateControlGroup = new EtherRateControlGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.etherStatsGroup,
                        this.etherCollisionTableGroup,
                        this.etherStats100MbsGroup,
                        this.etherStatsBaseGroup,
                        this.etherStatsLowSpeedGroup,
                        this.etherStatsHighSpeedGroup,
                        this.etherDuplexGroup,
                        this.etherControlGroup,
                        this.etherControlPauseGroup,
                        this.etherStatsBaseGroup2,
                        this.etherStatsHalfDuplexGroup,
                        this.etherHCStatsGroup,
                        this.etherHCControlGroup,
                        this.etherHCControlPauseGroup,
                        this.etherRateControlGroup
                    };
                }
                public static final class EtherStatsGroupEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private EtherStatsGroupEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "etherStatsGroup", "1.3.6.1.2.1.35.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherCollisionTableGroupEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private EtherCollisionTableGroupEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "etherCollisionTableGroup", "1.3.6.1.2.1.35.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherStats100MbsGroupEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private EtherStats100MbsGroupEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "etherStats100MbsGroup", "1.3.6.1.2.1.35.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherStatsBaseGroupEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private EtherStatsBaseGroupEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "etherStatsBaseGroup", "1.3.6.1.2.1.35.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherStatsLowSpeedGroupEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private EtherStatsLowSpeedGroupEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "etherStatsLowSpeedGroup", "1.3.6.1.2.1.35.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherStatsHighSpeedGroupEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private EtherStatsHighSpeedGroupEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "etherStatsHighSpeedGroup", "1.3.6.1.2.1.35.2.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherDuplexGroupEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private EtherDuplexGroupEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "etherDuplexGroup", "1.3.6.1.2.1.35.2.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherControlGroupEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private EtherControlGroupEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "etherControlGroup", "1.3.6.1.2.1.35.2.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherControlPauseGroupEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private EtherControlPauseGroupEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "etherControlPauseGroup", "1.3.6.1.2.1.35.2.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherStatsBaseGroup2Ent extends MIBEntry<EtherLikeMIBDef>
                {
                    private EtherStatsBaseGroup2Ent(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "etherStatsBaseGroup2", "1.3.6.1.2.1.35.2.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherStatsHalfDuplexGroupEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private EtherStatsHalfDuplexGroupEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "etherStatsHalfDuplexGroup", "1.3.6.1.2.1.35.2.1.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherHCStatsGroupEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private EtherHCStatsGroupEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "etherHCStatsGroup", "1.3.6.1.2.1.35.2.1.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherHCControlGroupEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private EtherHCControlGroupEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "etherHCControlGroup", "1.3.6.1.2.1.35.2.1.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherHCControlPauseGroupEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private EtherHCControlPauseGroupEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "etherHCControlPauseGroup", "1.3.6.1.2.1.35.2.1.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherRateControlGroupEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private EtherRateControlGroupEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "etherRateControlGroup", "1.3.6.1.2.1.35.2.1.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class EtherCompliancesEnt extends MIBEntry<EtherLikeMIBDef>
            {
                /** compliance statements*/
                public final EtherComplianceEnt etherCompliance;

                public final Ether100MbsComplianceEnt ether100MbsCompliance;

                public final Dot3ComplianceEnt dot3Compliance;

                public final Dot3Compliance2Ent dot3Compliance2;

                private EtherCompliancesEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                {
                    super(mib, parent, "etherCompliances", "1.3.6.1.2.1.35.2.2", false, false, false, false);
                    this.etherCompliance = new EtherComplianceEnt(mib, this);
                    this.ether100MbsCompliance = new Ether100MbsComplianceEnt(mib, this);
                    this.dot3Compliance = new Dot3ComplianceEnt(mib, this);
                    this.dot3Compliance2 = new Dot3Compliance2Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.etherCompliance,
                        this.ether100MbsCompliance,
                        this.dot3Compliance,
                        this.dot3Compliance2
                    };
                }
                public static final class EtherComplianceEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private EtherComplianceEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "etherCompliance", "1.3.6.1.2.1.35.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ether100MbsComplianceEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Ether100MbsComplianceEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "ether100MbsCompliance", "1.3.6.1.2.1.35.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3ComplianceEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3ComplianceEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3Compliance", "1.3.6.1.2.1.35.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3Compliance2Ent extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3Compliance2Ent(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3Compliance2", "1.3.6.1.2.1.35.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class Dot3Ent extends MIBEntry<EtherLikeMIBDef>
    {
        /** the Ethernet-like Statistics group*/
        public final Dot3StatsTableEnt dot3StatsTable;

        /** the Ethernet-like Collision Statistics group
Implementation of this group is optional; it is appropriatefor all systems which have the necessary metering*/
        public final Dot3CollTableEnt dot3CollTable;

        public final Dot3ControlTableEnt dot3ControlTable;

        public final Dot3PauseTableEnt dot3PauseTable;

        public final Dot3HCStatsTableEnt dot3HCStatsTable;

        /** 802.3 Tests*/
        public final Dot3TestsEnt dot3Tests;

        public final Dot3ErrorsEnt dot3Errors;

        private Dot3Ent(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
        {
            super(mib, parent, "dot3", "1.3.6.1.2.1.10.7", false, false, false, false);
            this.dot3StatsTable = new Dot3StatsTableEnt(mib, this);
            this.dot3CollTable = new Dot3CollTableEnt(mib, this);
            this.dot3ControlTable = new Dot3ControlTableEnt(mib, this);
            this.dot3PauseTable = new Dot3PauseTableEnt(mib, this);
            this.dot3HCStatsTable = new Dot3HCStatsTableEnt(mib, this);
            this.dot3Tests = new Dot3TestsEnt(mib, this);
            this.dot3Errors = new Dot3ErrorsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dot3StatsTable,
                this.dot3CollTable,
                this.dot3ControlTable,
                this.dot3PauseTable,
                this.dot3HCStatsTable,
                this.dot3Tests,
                this.dot3Errors
            };
        }
        public static final class Dot3StatsTableEnt extends MIBEntry<EtherLikeMIBDef>
        {
            public final Dot3StatsEntryEnt dot3StatsEntry;

            private Dot3StatsTableEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
            {
                super(mib, parent, "dot3StatsTable", "1.3.6.1.2.1.10.7.2", false, true, false, false);
                this.dot3StatsEntry = new Dot3StatsEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3StatsEntry
                };
            }
            public static final class Dot3StatsEntryEnt extends MIBEntry<EtherLikeMIBDef>
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

                public final Dot3StatsEtherChipSetEnt dot3StatsEtherChipSet;

                public final Dot3StatsSymbolErrorsEnt dot3StatsSymbolErrors;

                public final Dot3StatsDuplexStatusEnt dot3StatsDuplexStatus;

                public final Dot3StatsRateControlAbilityEnt dot3StatsRateControlAbility;

                public final Dot3StatsRateControlStatusEnt dot3StatsRateControlStatus;

                private Dot3StatsEntryEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
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
                    this.dot3StatsEtherChipSet = new Dot3StatsEtherChipSetEnt(mib, this);
                    this.dot3StatsSymbolErrors = new Dot3StatsSymbolErrorsEnt(mib, this);
                    this.dot3StatsDuplexStatus = new Dot3StatsDuplexStatusEnt(mib, this);
                    this.dot3StatsRateControlAbility = new Dot3StatsRateControlAbilityEnt(mib, this);
                    this.dot3StatsRateControlStatus = new Dot3StatsRateControlStatusEnt(mib, this);
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
                        this.dot3StatsInternalMacReceiveErrors,
                        this.dot3StatsEtherChipSet,
                        this.dot3StatsSymbolErrors,
                        this.dot3StatsDuplexStatus,
                        this.dot3StatsRateControlAbility,
                        this.dot3StatsRateControlStatus
                    };
                }
                public static final class Dot3StatsIndexEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsIndexEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsIndex", "1.3.6.1.2.1.10.7.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsAlignmentErrorsEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsAlignmentErrorsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsAlignmentErrors", "1.3.6.1.2.1.10.7.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsFCSErrorsEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsFCSErrorsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsFCSErrors", "1.3.6.1.2.1.10.7.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsSingleCollisionFramesEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsSingleCollisionFramesEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsSingleCollisionFrames", "1.3.6.1.2.1.10.7.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsMultipleCollisionFramesEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsMultipleCollisionFramesEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsMultipleCollisionFrames", "1.3.6.1.2.1.10.7.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsSQETestErrorsEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsSQETestErrorsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsSQETestErrors", "1.3.6.1.2.1.10.7.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsDeferredTransmissionsEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsDeferredTransmissionsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsDeferredTransmissions", "1.3.6.1.2.1.10.7.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsLateCollisionsEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsLateCollisionsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsLateCollisions", "1.3.6.1.2.1.10.7.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsExcessiveCollisionsEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsExcessiveCollisionsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsExcessiveCollisions", "1.3.6.1.2.1.10.7.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsInternalMacTransmitErrorsEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsInternalMacTransmitErrorsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsInternalMacTransmitErrors", "1.3.6.1.2.1.10.7.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsCarrierSenseErrorsEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsCarrierSenseErrorsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsCarrierSenseErrors", "1.3.6.1.2.1.10.7.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsFrameTooLongsEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsFrameTooLongsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsFrameTooLongs", "1.3.6.1.2.1.10.7.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsInternalMacReceiveErrorsEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsInternalMacReceiveErrorsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsInternalMacReceiveErrors", "1.3.6.1.2.1.10.7.2.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsEtherChipSetEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsEtherChipSetEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsEtherChipSet", "1.3.6.1.2.1.10.7.2.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsSymbolErrorsEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsSymbolErrorsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsSymbolErrors", "1.3.6.1.2.1.10.7.2.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsDuplexStatusEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsDuplexStatusEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsDuplexStatus", "1.3.6.1.2.1.10.7.2.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsRateControlAbilityEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsRateControlAbilityEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsRateControlAbility", "1.3.6.1.2.1.10.7.2.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3StatsRateControlStatusEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3StatsRateControlStatusEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3StatsRateControlStatus", "1.3.6.1.2.1.10.7.2.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dot3CollTableEnt extends MIBEntry<EtherLikeMIBDef>
        {
            public final Dot3CollEntryEnt dot3CollEntry;

            private Dot3CollTableEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
            {
                super(mib, parent, "dot3CollTable", "1.3.6.1.2.1.10.7.5", false, true, false, false);
                this.dot3CollEntry = new Dot3CollEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3CollEntry
                };
            }
            public static final class Dot3CollEntryEnt extends MIBEntry<EtherLikeMIBDef>
            {
                /** { dot3CollEntry 1 } is no longer in use*/
                public final Dot3CollCountEnt dot3CollCount;

                public final Dot3CollFrequenciesEnt dot3CollFrequencies;

                private Dot3CollEntryEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                {
                    super(mib, parent, "dot3CollEntry", "1.3.6.1.2.1.10.7.5.1", false, false, false, true);
                    this.dot3CollCount = new Dot3CollCountEnt(mib, this);
                    this.dot3CollFrequencies = new Dot3CollFrequenciesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3CollCount,
                        this.dot3CollFrequencies
                    };
                }
                public static final class Dot3CollCountEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3CollCountEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3CollCount", "1.3.6.1.2.1.10.7.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3CollFrequenciesEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3CollFrequenciesEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3CollFrequencies", "1.3.6.1.2.1.10.7.5.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dot3ControlTableEnt extends MIBEntry<EtherLikeMIBDef>
        {
            public final Dot3ControlEntryEnt dot3ControlEntry;

            private Dot3ControlTableEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
            {
                super(mib, parent, "dot3ControlTable", "1.3.6.1.2.1.10.7.9", false, true, false, false);
                this.dot3ControlEntry = new Dot3ControlEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ControlEntry
                };
            }
            public static final class Dot3ControlEntryEnt extends MIBEntry<EtherLikeMIBDef>
            {
                public final Dot3ControlFunctionsSupportedEnt dot3ControlFunctionsSupported;

                public final Dot3ControlInUnknownOpcodesEnt dot3ControlInUnknownOpcodes;

                public final Dot3HCControlInUnknownOpcodesEnt dot3HCControlInUnknownOpcodes;

                private Dot3ControlEntryEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                {
                    super(mib, parent, "dot3ControlEntry", "1.3.6.1.2.1.10.7.9.1", false, false, false, true);
                    this.dot3ControlFunctionsSupported = new Dot3ControlFunctionsSupportedEnt(mib, this);
                    this.dot3ControlInUnknownOpcodes = new Dot3ControlInUnknownOpcodesEnt(mib, this);
                    this.dot3HCControlInUnknownOpcodes = new Dot3HCControlInUnknownOpcodesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3ControlFunctionsSupported,
                        this.dot3ControlInUnknownOpcodes,
                        this.dot3HCControlInUnknownOpcodes
                    };
                }
                public static final class Dot3ControlFunctionsSupportedEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3ControlFunctionsSupportedEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3ControlFunctionsSupported", "1.3.6.1.2.1.10.7.9.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3ControlInUnknownOpcodesEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3ControlInUnknownOpcodesEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3ControlInUnknownOpcodes", "1.3.6.1.2.1.10.7.9.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3HCControlInUnknownOpcodesEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3HCControlInUnknownOpcodesEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3HCControlInUnknownOpcodes", "1.3.6.1.2.1.10.7.9.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dot3PauseTableEnt extends MIBEntry<EtherLikeMIBDef>
        {
            public final Dot3PauseEntryEnt dot3PauseEntry;

            private Dot3PauseTableEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
            {
                super(mib, parent, "dot3PauseTable", "1.3.6.1.2.1.10.7.10", false, true, false, false);
                this.dot3PauseEntry = new Dot3PauseEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3PauseEntry
                };
            }
            public static final class Dot3PauseEntryEnt extends MIBEntry<EtherLikeMIBDef>
            {
                public final Dot3PauseAdminModeEnt dot3PauseAdminMode;

                public final Dot3PauseOperModeEnt dot3PauseOperMode;

                public final Dot3InPauseFramesEnt dot3InPauseFrames;

                public final Dot3OutPauseFramesEnt dot3OutPauseFrames;

                public final Dot3HCInPauseFramesEnt dot3HCInPauseFrames;

                public final Dot3HCOutPauseFramesEnt dot3HCOutPauseFrames;

                private Dot3PauseEntryEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                {
                    super(mib, parent, "dot3PauseEntry", "1.3.6.1.2.1.10.7.10.1", false, false, false, true);
                    this.dot3PauseAdminMode = new Dot3PauseAdminModeEnt(mib, this);
                    this.dot3PauseOperMode = new Dot3PauseOperModeEnt(mib, this);
                    this.dot3InPauseFrames = new Dot3InPauseFramesEnt(mib, this);
                    this.dot3OutPauseFrames = new Dot3OutPauseFramesEnt(mib, this);
                    this.dot3HCInPauseFrames = new Dot3HCInPauseFramesEnt(mib, this);
                    this.dot3HCOutPauseFrames = new Dot3HCOutPauseFramesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3PauseAdminMode,
                        this.dot3PauseOperMode,
                        this.dot3InPauseFrames,
                        this.dot3OutPauseFrames,
                        this.dot3HCInPauseFrames,
                        this.dot3HCOutPauseFrames
                    };
                }
                public static final class Dot3PauseAdminModeEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3PauseAdminModeEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3PauseAdminMode", "1.3.6.1.2.1.10.7.10.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3PauseOperModeEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3PauseOperModeEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3PauseOperMode", "1.3.6.1.2.1.10.7.10.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3InPauseFramesEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3InPauseFramesEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3InPauseFrames", "1.3.6.1.2.1.10.7.10.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3OutPauseFramesEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3OutPauseFramesEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3OutPauseFrames", "1.3.6.1.2.1.10.7.10.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3HCInPauseFramesEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3HCInPauseFramesEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3HCInPauseFrames", "1.3.6.1.2.1.10.7.10.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3HCOutPauseFramesEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3HCOutPauseFramesEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3HCOutPauseFrames", "1.3.6.1.2.1.10.7.10.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dot3HCStatsTableEnt extends MIBEntry<EtherLikeMIBDef>
        {
            public final Dot3HCStatsEntryEnt dot3HCStatsEntry;

            private Dot3HCStatsTableEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
            {
                super(mib, parent, "dot3HCStatsTable", "1.3.6.1.2.1.10.7.11", false, true, false, false);
                this.dot3HCStatsEntry = new Dot3HCStatsEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3HCStatsEntry
                };
            }
            public static final class Dot3HCStatsEntryEnt extends MIBEntry<EtherLikeMIBDef>
            {
                public final Dot3HCStatsAlignmentErrorsEnt dot3HCStatsAlignmentErrors;

                public final Dot3HCStatsFCSErrorsEnt dot3HCStatsFCSErrors;

                public final Dot3HCStatsInternalMacTransmitErrorsEnt dot3HCStatsInternalMacTransmitErrors;

                public final Dot3HCStatsFrameTooLongsEnt dot3HCStatsFrameTooLongs;

                public final Dot3HCStatsInternalMacReceiveErrorsEnt dot3HCStatsInternalMacReceiveErrors;

                public final Dot3HCStatsSymbolErrorsEnt dot3HCStatsSymbolErrors;

                private Dot3HCStatsEntryEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                {
                    super(mib, parent, "dot3HCStatsEntry", "1.3.6.1.2.1.10.7.11.1", false, false, false, true);
                    this.dot3HCStatsAlignmentErrors = new Dot3HCStatsAlignmentErrorsEnt(mib, this);
                    this.dot3HCStatsFCSErrors = new Dot3HCStatsFCSErrorsEnt(mib, this);
                    this.dot3HCStatsInternalMacTransmitErrors = new Dot3HCStatsInternalMacTransmitErrorsEnt(mib, this);
                    this.dot3HCStatsFrameTooLongs = new Dot3HCStatsFrameTooLongsEnt(mib, this);
                    this.dot3HCStatsInternalMacReceiveErrors = new Dot3HCStatsInternalMacReceiveErrorsEnt(mib, this);
                    this.dot3HCStatsSymbolErrors = new Dot3HCStatsSymbolErrorsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3HCStatsAlignmentErrors,
                        this.dot3HCStatsFCSErrors,
                        this.dot3HCStatsInternalMacTransmitErrors,
                        this.dot3HCStatsFrameTooLongs,
                        this.dot3HCStatsInternalMacReceiveErrors,
                        this.dot3HCStatsSymbolErrors
                    };
                }
                public static final class Dot3HCStatsAlignmentErrorsEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3HCStatsAlignmentErrorsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3HCStatsAlignmentErrors", "1.3.6.1.2.1.10.7.11.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3HCStatsFCSErrorsEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3HCStatsFCSErrorsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3HCStatsFCSErrors", "1.3.6.1.2.1.10.7.11.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3HCStatsInternalMacTransmitErrorsEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3HCStatsInternalMacTransmitErrorsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3HCStatsInternalMacTransmitErrors", "1.3.6.1.2.1.10.7.11.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3HCStatsFrameTooLongsEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3HCStatsFrameTooLongsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3HCStatsFrameTooLongs", "1.3.6.1.2.1.10.7.11.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3HCStatsInternalMacReceiveErrorsEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3HCStatsInternalMacReceiveErrorsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3HCStatsInternalMacReceiveErrors", "1.3.6.1.2.1.10.7.11.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3HCStatsSymbolErrorsEnt extends MIBEntry<EtherLikeMIBDef>
                {
                    private Dot3HCStatsSymbolErrorsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                    {
                        super(mib, parent, "dot3HCStatsSymbolErrors", "1.3.6.1.2.1.10.7.11.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dot3TestsEnt extends MIBEntry<EtherLikeMIBDef>
        {
            /** TDR Test*/
            public final Dot3TestTdrEnt dot3TestTdr;

            /** Loopback Test*/
            public final Dot3TestLoopBackEnt dot3TestLoopBack;

            private Dot3TestsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
            {
                super(mib, parent, "dot3Tests", "1.3.6.1.2.1.10.7.6", false, false, false, false);
                this.dot3TestTdr = new Dot3TestTdrEnt(mib, this);
                this.dot3TestLoopBack = new Dot3TestLoopBackEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3TestTdr,
                    this.dot3TestLoopBack
                };
            }
            public static final class Dot3TestTdrEnt extends MIBEntry<EtherLikeMIBDef>
            {
                private Dot3TestTdrEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                {
                    super(mib, parent, "dot3TestTdr", "1.3.6.1.2.1.10.7.6.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3TestLoopBackEnt extends MIBEntry<EtherLikeMIBDef>
            {
                private Dot3TestLoopBackEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                {
                    super(mib, parent, "dot3TestLoopBack", "1.3.6.1.2.1.10.7.6.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3ErrorsEnt extends MIBEntry<EtherLikeMIBDef>
        {
            public final Dot3ErrorInitErrorEnt dot3ErrorInitError;

            public final Dot3ErrorLoopbackErrorEnt dot3ErrorLoopbackError;

            private Dot3ErrorsEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
            {
                super(mib, parent, "dot3Errors", "1.3.6.1.2.1.10.7.7", false, false, false, false);
                this.dot3ErrorInitError = new Dot3ErrorInitErrorEnt(mib, this);
                this.dot3ErrorLoopbackError = new Dot3ErrorLoopbackErrorEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3ErrorInitError,
                    this.dot3ErrorLoopbackError
                };
            }
            public static final class Dot3ErrorInitErrorEnt extends MIBEntry<EtherLikeMIBDef>
            {
                private Dot3ErrorInitErrorEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                {
                    super(mib, parent, "dot3ErrorInitError", "1.3.6.1.2.1.10.7.7.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3ErrorLoopbackErrorEnt extends MIBEntry<EtherLikeMIBDef>
            {
                private Dot3ErrorLoopbackErrorEnt(EtherLikeMIBDef mib, MIBEntry<EtherLikeMIBDef> parent)
                {
                    super(mib, parent, "dot3ErrorLoopbackError", "1.3.6.1.2.1.10.7.7.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
