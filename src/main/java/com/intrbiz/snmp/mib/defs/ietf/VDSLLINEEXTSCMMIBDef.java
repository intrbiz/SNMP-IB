package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2579]
[RFC2580]
[RFC2863]*/
public final class VDSLLINEEXTSCMMIBDef extends MIB
{
    public static final VDSLLINEEXTSCMMIBDef VDSLLINEEXTSCMMIB = new VDSLLINEEXTSCMMIBDef();

    /** [RFC3728]

April 28, 2005*/
    public final VdslExtSCMMIBEnt vdslExtSCMMIB;

    private VDSLLINEEXTSCMMIBDef()
    {
        super("VDSL-LINE-EXT-SCM-MIB");
        this.vdslExtSCMMIB = new VdslExtSCMMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.vdslExtSCMMIB
        };
    }

    public static final class VdslExtSCMMIBEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
    {
        public final VdslLineExtSCMMibEnt vdslLineExtSCMMib;

        private VdslExtSCMMIBEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
        {
            super(mib, parent, "vdslExtSCMMIB", "1.3.6.1.2.1.10.228", false, false, false, false);
            this.vdslLineExtSCMMib = new VdslLineExtSCMMibEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.vdslLineExtSCMMib
            };
        }
        public static final class VdslLineExtSCMMibEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
        {
            public final VdslLineExtSCMMibObjectsEnt vdslLineExtSCMMibObjects;

            /** conformance information*/
            public final VdslLineExtSCMConformanceEnt vdslLineExtSCMConformance;

            private VdslLineExtSCMMibEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
            {
                super(mib, parent, "vdslLineExtSCMMib", "1.3.6.1.2.1.10.228.1", false, false, false, false);
                this.vdslLineExtSCMMibObjects = new VdslLineExtSCMMibObjectsEnt(mib, this);
                this.vdslLineExtSCMConformance = new VdslLineExtSCMConformanceEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.vdslLineExtSCMMibObjects,
                    this.vdslLineExtSCMConformance
                };
            }
            public static final class VdslLineExtSCMMibObjectsEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
            {
                /** Single carrier modulation (SCM) configuration profile tables*/
                public final VdslLineSCMConfProfileBandTableEnt vdslLineSCMConfProfileBandTable;

                /** SCM physical band*/
                public final VdslLineSCMPhysBandTableEnt vdslLineSCMPhysBandTable;

                private VdslLineExtSCMMibObjectsEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                {
                    super(mib, parent, "vdslLineExtSCMMibObjects", "1.3.6.1.2.1.10.228.1.1", false, false, false, false);
                    this.vdslLineSCMConfProfileBandTable = new VdslLineSCMConfProfileBandTableEnt(mib, this);
                    this.vdslLineSCMPhysBandTable = new VdslLineSCMPhysBandTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vdslLineSCMConfProfileBandTable,
                        this.vdslLineSCMPhysBandTable
                    };
                }
                public static final class VdslLineSCMConfProfileBandTableEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                {
                    public final VdslLineSCMConfProfileBandEntryEnt vdslLineSCMConfProfileBandEntry;

                    private VdslLineSCMConfProfileBandTableEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                    {
                        super(mib, parent, "vdslLineSCMConfProfileBandTable", "1.3.6.1.2.1.10.228.1.1.1", false, true, false, false);
                        this.vdslLineSCMConfProfileBandEntry = new VdslLineSCMConfProfileBandEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslLineSCMConfProfileBandEntry
                        };
                    }
                    public static final class VdslLineSCMConfProfileBandEntryEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                    {
                        public final VdslLineSCMConfProfileBandIdEnt vdslLineSCMConfProfileBandId;

                        public final VdslLineSCMConfProfileBandInUseEnt vdslLineSCMConfProfileBandInUse;

                        /** Part 2, SCM*/
                        public final VdslLineSCMConfProfileBandCenterFrequencyEnt vdslLineSCMConfProfileBandCenterFrequency;

                        /** Part 2, SCM*/
                        public final VdslLineSCMConfProfileBandSymbolRateEnt vdslLineSCMConfProfileBandSymbolRate;

                        /** Part 2, SCM*/
                        public final VdslLineSCMConfProfileBandConstellationSizeEnt vdslLineSCMConfProfileBandConstellationSize;

                        /** Part 2, SCM*/
                        public final VdslLineSCMConfProfileBandTransmitPSDLevelEnt vdslLineSCMConfProfileBandTransmitPSDLevel;

                        public final VdslLineSCMConfProfileBandRowStatusEnt vdslLineSCMConfProfileBandRowStatus;

                        private VdslLineSCMConfProfileBandEntryEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                        {
                            super(mib, parent, "vdslLineSCMConfProfileBandEntry", "1.3.6.1.2.1.10.228.1.1.1.1", false, false, false, true);
                            this.vdslLineSCMConfProfileBandId = new VdslLineSCMConfProfileBandIdEnt(mib, this);
                            this.vdslLineSCMConfProfileBandInUse = new VdslLineSCMConfProfileBandInUseEnt(mib, this);
                            this.vdslLineSCMConfProfileBandCenterFrequency = new VdslLineSCMConfProfileBandCenterFrequencyEnt(mib, this);
                            this.vdslLineSCMConfProfileBandSymbolRate = new VdslLineSCMConfProfileBandSymbolRateEnt(mib, this);
                            this.vdslLineSCMConfProfileBandConstellationSize = new VdslLineSCMConfProfileBandConstellationSizeEnt(mib, this);
                            this.vdslLineSCMConfProfileBandTransmitPSDLevel = new VdslLineSCMConfProfileBandTransmitPSDLevelEnt(mib, this);
                            this.vdslLineSCMConfProfileBandRowStatus = new VdslLineSCMConfProfileBandRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslLineSCMConfProfileBandId,
                                this.vdslLineSCMConfProfileBandInUse,
                                this.vdslLineSCMConfProfileBandCenterFrequency,
                                this.vdslLineSCMConfProfileBandSymbolRate,
                                this.vdslLineSCMConfProfileBandConstellationSize,
                                this.vdslLineSCMConfProfileBandTransmitPSDLevel,
                                this.vdslLineSCMConfProfileBandRowStatus
                            };
                        }
                        public static final class VdslLineSCMConfProfileBandIdEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                        {
                            private VdslLineSCMConfProfileBandIdEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineSCMConfProfileBandId", "1.3.6.1.2.1.10.228.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineSCMConfProfileBandInUseEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                        {
                            private VdslLineSCMConfProfileBandInUseEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineSCMConfProfileBandInUse", "1.3.6.1.2.1.10.228.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineSCMConfProfileBandCenterFrequencyEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                        {
                            private VdslLineSCMConfProfileBandCenterFrequencyEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineSCMConfProfileBandCenterFrequency", "1.3.6.1.2.1.10.228.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineSCMConfProfileBandSymbolRateEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                        {
                            private VdslLineSCMConfProfileBandSymbolRateEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineSCMConfProfileBandSymbolRate", "1.3.6.1.2.1.10.228.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineSCMConfProfileBandConstellationSizeEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                        {
                            private VdslLineSCMConfProfileBandConstellationSizeEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineSCMConfProfileBandConstellationSize", "1.3.6.1.2.1.10.228.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineSCMConfProfileBandTransmitPSDLevelEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                        {
                            private VdslLineSCMConfProfileBandTransmitPSDLevelEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineSCMConfProfileBandTransmitPSDLevel", "1.3.6.1.2.1.10.228.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineSCMConfProfileBandRowStatusEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                        {
                            private VdslLineSCMConfProfileBandRowStatusEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineSCMConfProfileBandRowStatus", "1.3.6.1.2.1.10.228.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class VdslLineSCMPhysBandTableEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                {
                    public final VdslLineSCMPhysBandEntryEnt vdslLineSCMPhysBandEntry;

                    private VdslLineSCMPhysBandTableEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                    {
                        super(mib, parent, "vdslLineSCMPhysBandTable", "1.3.6.1.2.1.10.228.1.1.2", false, true, false, false);
                        this.vdslLineSCMPhysBandEntry = new VdslLineSCMPhysBandEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslLineSCMPhysBandEntry
                        };
                    }
                    public static final class VdslLineSCMPhysBandEntryEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                    {
                        public final VdslLineSCMPhysBandIdEnt vdslLineSCMPhysBandId;

                        public final VdslLineSCMPhysBandInUseEnt vdslLineSCMPhysBandInUse;

                        /** Part 2, SCM*/
                        public final VdslLineSCMPhysBandCurrCenterFrequencyEnt vdslLineSCMPhysBandCurrCenterFrequency;

                        /** Part 2, SCM*/
                        public final VdslLineSCMPhysBandCurrSymbolRateEnt vdslLineSCMPhysBandCurrSymbolRate;

                        /** Part 2, SCM*/
                        public final VdslLineSCMPhysBandCurrConstellationSizeEnt vdslLineSCMPhysBandCurrConstellationSize;

                        /** Part 2, SCM*/
                        public final VdslLineSCMPhysBandCurrPSDLevelEnt vdslLineSCMPhysBandCurrPSDLevel;

                        public final VdslLineSCMPhysBandCurrSnrMgnEnt vdslLineSCMPhysBandCurrSnrMgn;

                        public final VdslLineSCMPhysBandCurrAtnEnt vdslLineSCMPhysBandCurrAtn;

                        private VdslLineSCMPhysBandEntryEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                        {
                            super(mib, parent, "vdslLineSCMPhysBandEntry", "1.3.6.1.2.1.10.228.1.1.2.1", false, false, false, true);
                            this.vdslLineSCMPhysBandId = new VdslLineSCMPhysBandIdEnt(mib, this);
                            this.vdslLineSCMPhysBandInUse = new VdslLineSCMPhysBandInUseEnt(mib, this);
                            this.vdslLineSCMPhysBandCurrCenterFrequency = new VdslLineSCMPhysBandCurrCenterFrequencyEnt(mib, this);
                            this.vdslLineSCMPhysBandCurrSymbolRate = new VdslLineSCMPhysBandCurrSymbolRateEnt(mib, this);
                            this.vdslLineSCMPhysBandCurrConstellationSize = new VdslLineSCMPhysBandCurrConstellationSizeEnt(mib, this);
                            this.vdslLineSCMPhysBandCurrPSDLevel = new VdslLineSCMPhysBandCurrPSDLevelEnt(mib, this);
                            this.vdslLineSCMPhysBandCurrSnrMgn = new VdslLineSCMPhysBandCurrSnrMgnEnt(mib, this);
                            this.vdslLineSCMPhysBandCurrAtn = new VdslLineSCMPhysBandCurrAtnEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslLineSCMPhysBandId,
                                this.vdslLineSCMPhysBandInUse,
                                this.vdslLineSCMPhysBandCurrCenterFrequency,
                                this.vdslLineSCMPhysBandCurrSymbolRate,
                                this.vdslLineSCMPhysBandCurrConstellationSize,
                                this.vdslLineSCMPhysBandCurrPSDLevel,
                                this.vdslLineSCMPhysBandCurrSnrMgn,
                                this.vdslLineSCMPhysBandCurrAtn
                            };
                        }
                        public static final class VdslLineSCMPhysBandIdEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                        {
                            private VdslLineSCMPhysBandIdEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineSCMPhysBandId", "1.3.6.1.2.1.10.228.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineSCMPhysBandInUseEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                        {
                            private VdslLineSCMPhysBandInUseEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineSCMPhysBandInUse", "1.3.6.1.2.1.10.228.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineSCMPhysBandCurrCenterFrequencyEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                        {
                            private VdslLineSCMPhysBandCurrCenterFrequencyEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineSCMPhysBandCurrCenterFrequency", "1.3.6.1.2.1.10.228.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineSCMPhysBandCurrSymbolRateEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                        {
                            private VdslLineSCMPhysBandCurrSymbolRateEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineSCMPhysBandCurrSymbolRate", "1.3.6.1.2.1.10.228.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineSCMPhysBandCurrConstellationSizeEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                        {
                            private VdslLineSCMPhysBandCurrConstellationSizeEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineSCMPhysBandCurrConstellationSize", "1.3.6.1.2.1.10.228.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineSCMPhysBandCurrPSDLevelEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                        {
                            private VdslLineSCMPhysBandCurrPSDLevelEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineSCMPhysBandCurrPSDLevel", "1.3.6.1.2.1.10.228.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineSCMPhysBandCurrSnrMgnEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                        {
                            private VdslLineSCMPhysBandCurrSnrMgnEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineSCMPhysBandCurrSnrMgn", "1.3.6.1.2.1.10.228.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineSCMPhysBandCurrAtnEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                        {
                            private VdslLineSCMPhysBandCurrAtnEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineSCMPhysBandCurrAtn", "1.3.6.1.2.1.10.228.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class VdslLineExtSCMConformanceEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
            {
                public final VdslLineExtSCMGroupsEnt vdslLineExtSCMGroups;

                public final VdslLineExtSCMCompliancesEnt vdslLineExtSCMCompliances;

                private VdslLineExtSCMConformanceEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                {
                    super(mib, parent, "vdslLineExtSCMConformance", "1.3.6.1.2.1.10.228.1.2", false, false, false, false);
                    this.vdslLineExtSCMGroups = new VdslLineExtSCMGroupsEnt(mib, this);
                    this.vdslLineExtSCMCompliances = new VdslLineExtSCMCompliancesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vdslLineExtSCMGroups,
                        this.vdslLineExtSCMCompliances
                    };
                }
                public static final class VdslLineExtSCMGroupsEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                {
                    /** units of conformance*/
                    public final VdslLineExtSCMGroupEnt vdslLineExtSCMGroup;

                    private VdslLineExtSCMGroupsEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                    {
                        super(mib, parent, "vdslLineExtSCMGroups", "1.3.6.1.2.1.10.228.1.2.1", false, false, false, false);
                        this.vdslLineExtSCMGroup = new VdslLineExtSCMGroupEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslLineExtSCMGroup
                        };
                    }
                    public static final class VdslLineExtSCMGroupEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                    {
                        private VdslLineExtSCMGroupEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                        {
                            super(mib, parent, "vdslLineExtSCMGroup", "1.3.6.1.2.1.10.228.1.2.1.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class VdslLineExtSCMCompliancesEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                {
                    public final VdslLineExtSCMMibComplianceEnt vdslLineExtSCMMibCompliance;

                    private VdslLineExtSCMCompliancesEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                    {
                        super(mib, parent, "vdslLineExtSCMCompliances", "1.3.6.1.2.1.10.228.1.2.2", false, false, false, false);
                        this.vdslLineExtSCMMibCompliance = new VdslLineExtSCMMibComplianceEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslLineExtSCMMibCompliance
                        };
                    }
                    public static final class VdslLineExtSCMMibComplianceEnt extends MIBEntry<VDSLLINEEXTSCMMIBDef>
                    {
                        private VdslLineExtSCMMibComplianceEnt(VDSLLINEEXTSCMMIBDef mib, MIBEntry<VDSLLINEEXTSCMMIBDef> parent)
                        {
                            super(mib, parent, "vdslLineExtSCMMibCompliance", "1.3.6.1.2.1.10.228.1.2.2.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

}
