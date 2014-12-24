package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**RFC 2578
RFC 2580
RFC 2579
RFC 2863
RFC 3289
RFC 3811
RFC 4801*/
public final class GMPLSLABELSTDMIBDef extends MIB
{
    public static final GMPLSLABELSTDMIBDef GMPLSLABELSTDMIB = new GMPLSLABELSTDMIBDef();

    /** 27 February 2007 00:00:00 GMT*/
    public final GmplsLabelStdMIBEnt gmplsLabelStdMIB;

    private GMPLSLABELSTDMIBDef()
    {
        super("GMPLS-LABEL-STD-MIB");
        this.gmplsLabelStdMIB = new GmplsLabelStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.gmplsLabelStdMIB
        };
    }

    public static final class GmplsLabelStdMIBEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
    {
        /** no notifications are currently defined.*/
        public final GmplsLabelObjectsEnt gmplsLabelObjects;

        public final GmplsLabelConformanceEnt gmplsLabelConformance;

        private GmplsLabelStdMIBEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
        {
            super(mib, parent, "gmplsLabelStdMIB", "1.3.6.1.2.1.10.166.16", false, false, false, false);
            this.gmplsLabelObjects = new GmplsLabelObjectsEnt(mib, this);
            this.gmplsLabelConformance = new GmplsLabelConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.gmplsLabelObjects,
                this.gmplsLabelConformance
            };
        }
        public static final class GmplsLabelObjectsEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
        {
            public final GmplsLabelIndexNextEnt gmplsLabelIndexNext;

            public final GmplsLabelTableEnt gmplsLabelTable;

            private GmplsLabelObjectsEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
            {
                super(mib, parent, "gmplsLabelObjects", "1.3.6.1.2.1.10.166.16.1", false, false, false, false);
                this.gmplsLabelIndexNext = new GmplsLabelIndexNextEnt(mib, this);
                this.gmplsLabelTable = new GmplsLabelTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.gmplsLabelIndexNext,
                    this.gmplsLabelTable
                };
            }
            public static final class GmplsLabelIndexNextEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
            {
                private GmplsLabelIndexNextEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsLabelIndexNext", "1.3.6.1.2.1.10.166.16.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class GmplsLabelTableEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
            {
                public final GmplsLabelEntryEnt gmplsLabelEntry;

                private GmplsLabelTableEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsLabelTable", "1.3.6.1.2.1.10.166.16.1.2", false, true, false, false);
                    this.gmplsLabelEntry = new GmplsLabelEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gmplsLabelEntry
                    };
                }
                public static final class GmplsLabelEntryEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                {
                    public final GmplsLabelInterfaceEnt gmplsLabelInterface;

                    public final GmplsLabelIndexEnt gmplsLabelIndex;

                    public final GmplsLabelSubindexEnt gmplsLabelSubindex;

                    public final GmplsLabelTypeEnt gmplsLabelType;

                    public final GmplsLabelMplsLabelEnt gmplsLabelMplsLabel;

                    public final GmplsLabelPortWavelengthEnt gmplsLabelPortWavelength;

                    public final GmplsLabelFreeformEnt gmplsLabelFreeform;

                    public final GmplsLabelSonetSdhSignalIndexEnt gmplsLabelSonetSdhSignalIndex;

                    public final GmplsLabelSdhVcEnt gmplsLabelSdhVc;

                    public final GmplsLabelSdhVcBranchEnt gmplsLabelSdhVcBranch;

                    public final GmplsLabelSonetSdhBranchEnt gmplsLabelSonetSdhBranch;

                    public final GmplsLabelSonetSdhGroupBranchEnt gmplsLabelSonetSdhGroupBranch;

                    public final GmplsLabelWavebandIdEnt gmplsLabelWavebandId;

                    public final GmplsLabelWavebandStartEnt gmplsLabelWavebandStart;

                    public final GmplsLabelWavebandEndEnt gmplsLabelWavebandEnd;

                    public final GmplsLabelStorageTypeEnt gmplsLabelStorageType;

                    public final GmplsLabelRowStatusEnt gmplsLabelRowStatus;

                    private GmplsLabelEntryEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsLabelEntry", "1.3.6.1.2.1.10.166.16.1.2.1", false, false, false, true);
                        this.gmplsLabelInterface = new GmplsLabelInterfaceEnt(mib, this);
                        this.gmplsLabelIndex = new GmplsLabelIndexEnt(mib, this);
                        this.gmplsLabelSubindex = new GmplsLabelSubindexEnt(mib, this);
                        this.gmplsLabelType = new GmplsLabelTypeEnt(mib, this);
                        this.gmplsLabelMplsLabel = new GmplsLabelMplsLabelEnt(mib, this);
                        this.gmplsLabelPortWavelength = new GmplsLabelPortWavelengthEnt(mib, this);
                        this.gmplsLabelFreeform = new GmplsLabelFreeformEnt(mib, this);
                        this.gmplsLabelSonetSdhSignalIndex = new GmplsLabelSonetSdhSignalIndexEnt(mib, this);
                        this.gmplsLabelSdhVc = new GmplsLabelSdhVcEnt(mib, this);
                        this.gmplsLabelSdhVcBranch = new GmplsLabelSdhVcBranchEnt(mib, this);
                        this.gmplsLabelSonetSdhBranch = new GmplsLabelSonetSdhBranchEnt(mib, this);
                        this.gmplsLabelSonetSdhGroupBranch = new GmplsLabelSonetSdhGroupBranchEnt(mib, this);
                        this.gmplsLabelWavebandId = new GmplsLabelWavebandIdEnt(mib, this);
                        this.gmplsLabelWavebandStart = new GmplsLabelWavebandStartEnt(mib, this);
                        this.gmplsLabelWavebandEnd = new GmplsLabelWavebandEndEnt(mib, this);
                        this.gmplsLabelStorageType = new GmplsLabelStorageTypeEnt(mib, this);
                        this.gmplsLabelRowStatus = new GmplsLabelRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.gmplsLabelInterface,
                            this.gmplsLabelIndex,
                            this.gmplsLabelSubindex,
                            this.gmplsLabelType,
                            this.gmplsLabelMplsLabel,
                            this.gmplsLabelPortWavelength,
                            this.gmplsLabelFreeform,
                            this.gmplsLabelSonetSdhSignalIndex,
                            this.gmplsLabelSdhVc,
                            this.gmplsLabelSdhVcBranch,
                            this.gmplsLabelSonetSdhBranch,
                            this.gmplsLabelSonetSdhGroupBranch,
                            this.gmplsLabelWavebandId,
                            this.gmplsLabelWavebandStart,
                            this.gmplsLabelWavebandEnd,
                            this.gmplsLabelStorageType,
                            this.gmplsLabelRowStatus
                        };
                    }
                    public static final class GmplsLabelInterfaceEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                    {
                        private GmplsLabelInterfaceEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsLabelInterface", "1.3.6.1.2.1.10.166.16.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsLabelIndexEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                    {
                        private GmplsLabelIndexEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsLabelIndex", "1.3.6.1.2.1.10.166.16.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsLabelSubindexEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                    {
                        private GmplsLabelSubindexEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsLabelSubindex", "1.3.6.1.2.1.10.166.16.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsLabelTypeEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                    {
                        private GmplsLabelTypeEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsLabelType", "1.3.6.1.2.1.10.166.16.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsLabelMplsLabelEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                    {
                        private GmplsLabelMplsLabelEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsLabelMplsLabel", "1.3.6.1.2.1.10.166.16.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsLabelPortWavelengthEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                    {
                        private GmplsLabelPortWavelengthEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsLabelPortWavelength", "1.3.6.1.2.1.10.166.16.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsLabelFreeformEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                    {
                        private GmplsLabelFreeformEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsLabelFreeform", "1.3.6.1.2.1.10.166.16.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsLabelSonetSdhSignalIndexEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                    {
                        private GmplsLabelSonetSdhSignalIndexEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsLabelSonetSdhSignalIndex", "1.3.6.1.2.1.10.166.16.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsLabelSdhVcEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                    {
                        private GmplsLabelSdhVcEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsLabelSdhVc", "1.3.6.1.2.1.10.166.16.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsLabelSdhVcBranchEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                    {
                        private GmplsLabelSdhVcBranchEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsLabelSdhVcBranch", "1.3.6.1.2.1.10.166.16.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsLabelSonetSdhBranchEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                    {
                        private GmplsLabelSonetSdhBranchEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsLabelSonetSdhBranch", "1.3.6.1.2.1.10.166.16.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsLabelSonetSdhGroupBranchEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                    {
                        private GmplsLabelSonetSdhGroupBranchEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsLabelSonetSdhGroupBranch", "1.3.6.1.2.1.10.166.16.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsLabelWavebandIdEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                    {
                        private GmplsLabelWavebandIdEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsLabelWavebandId", "1.3.6.1.2.1.10.166.16.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsLabelWavebandStartEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                    {
                        private GmplsLabelWavebandStartEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsLabelWavebandStart", "1.3.6.1.2.1.10.166.16.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsLabelWavebandEndEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                    {
                        private GmplsLabelWavebandEndEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsLabelWavebandEnd", "1.3.6.1.2.1.10.166.16.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsLabelStorageTypeEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                    {
                        private GmplsLabelStorageTypeEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsLabelStorageType", "1.3.6.1.2.1.10.166.16.1.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsLabelRowStatusEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                    {
                        private GmplsLabelRowStatusEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsLabelRowStatus", "1.3.6.1.2.1.10.166.16.1.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class GmplsLabelConformanceEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
        {
            public final GmplsLabelGroupsEnt gmplsLabelGroups;

            public final GmplsLabelCompliancesEnt gmplsLabelCompliances;

            private GmplsLabelConformanceEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
            {
                super(mib, parent, "gmplsLabelConformance", "1.3.6.1.2.1.10.166.16.2", false, false, false, false);
                this.gmplsLabelGroups = new GmplsLabelGroupsEnt(mib, this);
                this.gmplsLabelCompliances = new GmplsLabelCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.gmplsLabelGroups,
                    this.gmplsLabelCompliances
                };
            }
            public static final class GmplsLabelGroupsEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
            {
                public final GmplsLabelTableGroupEnt gmplsLabelTableGroup;

                public final GmplsLabelPacketGroupEnt gmplsLabelPacketGroup;

                public final GmplsLabelPortWavelengthGroupEnt gmplsLabelPortWavelengthGroup;

                public final GmplsLabelFreeformGroupEnt gmplsLabelFreeformGroup;

                public final GmplsLabelSonetSdhGroupEnt gmplsLabelSonetSdhGroup;

                public final GmplsLabelWavebandGroupEnt gmplsLabelWavebandGroup;

                private GmplsLabelGroupsEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsLabelGroups", "1.3.6.1.2.1.10.166.16.2.1", false, false, false, false);
                    this.gmplsLabelTableGroup = new GmplsLabelTableGroupEnt(mib, this);
                    this.gmplsLabelPacketGroup = new GmplsLabelPacketGroupEnt(mib, this);
                    this.gmplsLabelPortWavelengthGroup = new GmplsLabelPortWavelengthGroupEnt(mib, this);
                    this.gmplsLabelFreeformGroup = new GmplsLabelFreeformGroupEnt(mib, this);
                    this.gmplsLabelSonetSdhGroup = new GmplsLabelSonetSdhGroupEnt(mib, this);
                    this.gmplsLabelWavebandGroup = new GmplsLabelWavebandGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gmplsLabelTableGroup,
                        this.gmplsLabelPacketGroup,
                        this.gmplsLabelPortWavelengthGroup,
                        this.gmplsLabelFreeformGroup,
                        this.gmplsLabelSonetSdhGroup,
                        this.gmplsLabelWavebandGroup
                    };
                }
                public static final class GmplsLabelTableGroupEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                {
                    private GmplsLabelTableGroupEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsLabelTableGroup", "1.3.6.1.2.1.10.166.16.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GmplsLabelPacketGroupEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                {
                    private GmplsLabelPacketGroupEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsLabelPacketGroup", "1.3.6.1.2.1.10.166.16.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GmplsLabelPortWavelengthGroupEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                {
                    private GmplsLabelPortWavelengthGroupEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsLabelPortWavelengthGroup", "1.3.6.1.2.1.10.166.16.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GmplsLabelFreeformGroupEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                {
                    private GmplsLabelFreeformGroupEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsLabelFreeformGroup", "1.3.6.1.2.1.10.166.16.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GmplsLabelSonetSdhGroupEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                {
                    private GmplsLabelSonetSdhGroupEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsLabelSonetSdhGroup", "1.3.6.1.2.1.10.166.16.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GmplsLabelWavebandGroupEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                {
                    private GmplsLabelWavebandGroupEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsLabelWavebandGroup", "1.3.6.1.2.1.10.166.16.2.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class GmplsLabelCompliancesEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
            {
                public final GmplsLabelModuleReadOnlyComplianceEnt gmplsLabelModuleReadOnlyCompliance;

                public final GmplsLabelModuleFullComplianceEnt gmplsLabelModuleFullCompliance;

                private GmplsLabelCompliancesEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsLabelCompliances", "1.3.6.1.2.1.10.166.16.2.2", false, false, false, false);
                    this.gmplsLabelModuleReadOnlyCompliance = new GmplsLabelModuleReadOnlyComplianceEnt(mib, this);
                    this.gmplsLabelModuleFullCompliance = new GmplsLabelModuleFullComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gmplsLabelModuleReadOnlyCompliance,
                        this.gmplsLabelModuleFullCompliance
                    };
                }
                public static final class GmplsLabelModuleReadOnlyComplianceEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                {
                    private GmplsLabelModuleReadOnlyComplianceEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsLabelModuleReadOnlyCompliance", "1.3.6.1.2.1.10.166.16.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GmplsLabelModuleFullComplianceEnt extends MIBEntry<GMPLSLABELSTDMIBDef>
                {
                    private GmplsLabelModuleFullComplianceEnt(GMPLSLABELSTDMIBDef mib, MIBEntry<GMPLSLABELSTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsLabelModuleFullCompliance", "1.3.6.1.2.1.10.166.16.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
