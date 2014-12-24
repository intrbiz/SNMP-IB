package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2579]
[RFC2580]*/
public final class ROHCRTPMIBDef extends MIB
{
    public static final ROHCRTPMIBDef ROHCRTPMIB = new ROHCRTPMIBDef();

    /** [RFC3816]

June 3, 2004*/
    public final RohcRtpMIBEnt rohcRtpMIB;

    private ROHCRTPMIBDef()
    {
        super("ROHC-RTP-MIB");
        this.rohcRtpMIB = new RohcRtpMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.rohcRtpMIB
        };
    }

    public static final class RohcRtpMIBEnt extends MIBEntry<ROHCRTPMIBDef>
    {
        /** The groups defined within this MIB module:*/
        public final RohcRtpObjectsEnt rohcRtpObjects;

        public final RohcRtpConformanceEnt rohcRtpConformance;

        private RohcRtpMIBEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
        {
            super(mib, parent, "rohcRtpMIB", "1.3.6.1.2.1.114", false, false, false, false);
            this.rohcRtpObjects = new RohcRtpObjectsEnt(mib, this);
            this.rohcRtpConformance = new RohcRtpConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.rohcRtpObjects,
                this.rohcRtpConformance
            };
        }
        public static final class RohcRtpObjectsEnt extends MIBEntry<ROHCRTPMIBDef>
        {
            /** Context TableThe rohcRtpContextTable lists all contexts per interfaceand instance.  It extends the rohcContextTable.*/
            public final RohcRtpContextTableEnt rohcRtpContextTable;

            /** Packet Sizes TableThe rohcPacketSizeTable lists allowed, preferred, and usedpacket sizes per compressor context.*/
            public final RohcRtpPacketSizeTableEnt rohcRtpPacketSizeTable;

            private RohcRtpObjectsEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
            {
                super(mib, parent, "rohcRtpObjects", "1.3.6.1.2.1.114.1", false, false, false, false);
                this.rohcRtpContextTable = new RohcRtpContextTableEnt(mib, this);
                this.rohcRtpPacketSizeTable = new RohcRtpPacketSizeTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rohcRtpContextTable,
                    this.rohcRtpPacketSizeTable
                };
            }
            public static final class RohcRtpContextTableEnt extends MIBEntry<ROHCRTPMIBDef>
            {
                public final RohcRtpContextEntryEnt rohcRtpContextEntry;

                private RohcRtpContextTableEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                {
                    super(mib, parent, "rohcRtpContextTable", "1.3.6.1.2.1.114.1.1", false, true, false, false);
                    this.rohcRtpContextEntry = new RohcRtpContextEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rohcRtpContextEntry
                    };
                }
                public static final class RohcRtpContextEntryEnt extends MIBEntry<ROHCRTPMIBDef>
                {
                    public final RohcRtpContextStateEnt rohcRtpContextState;

                    public final RohcRtpContextModeEnt rohcRtpContextMode;

                    public final RohcRtpContextAlwaysPadEnt rohcRtpContextAlwaysPad;

                    public final RohcRtpContextLargePktsAllowedEnt rohcRtpContextLargePktsAllowed;

                    public final RohcRtpContextVerifyPeriodEnt rohcRtpContextVerifyPeriod;

                    public final RohcRtpContextSizesAllowedEnt rohcRtpContextSizesAllowed;

                    public final RohcRtpContextSizesUsedEnt rohcRtpContextSizesUsed;

                    public final RohcRtpContextACKsEnt rohcRtpContextACKs;

                    public final RohcRtpContextNACKsEnt rohcRtpContextNACKs;

                    public final RohcRtpContextSNACKsEnt rohcRtpContextSNACKs;

                    public final RohcRtpContextNHPsEnt rohcRtpContextNHPs;

                    public final RohcRtpContextCSPsEnt rohcRtpContextCSPs;

                    public final RohcRtpContextCCPsEnt rohcRtpContextCCPs;

                    public final RohcRtpContextPktsLostPhysicalEnt rohcRtpContextPktsLostPhysical;

                    public final RohcRtpContextPktsLostPreLinkEnt rohcRtpContextPktsLostPreLink;

                    private RohcRtpContextEntryEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                    {
                        super(mib, parent, "rohcRtpContextEntry", "1.3.6.1.2.1.114.1.1.1", false, false, false, true);
                        this.rohcRtpContextState = new RohcRtpContextStateEnt(mib, this);
                        this.rohcRtpContextMode = new RohcRtpContextModeEnt(mib, this);
                        this.rohcRtpContextAlwaysPad = new RohcRtpContextAlwaysPadEnt(mib, this);
                        this.rohcRtpContextLargePktsAllowed = new RohcRtpContextLargePktsAllowedEnt(mib, this);
                        this.rohcRtpContextVerifyPeriod = new RohcRtpContextVerifyPeriodEnt(mib, this);
                        this.rohcRtpContextSizesAllowed = new RohcRtpContextSizesAllowedEnt(mib, this);
                        this.rohcRtpContextSizesUsed = new RohcRtpContextSizesUsedEnt(mib, this);
                        this.rohcRtpContextACKs = new RohcRtpContextACKsEnt(mib, this);
                        this.rohcRtpContextNACKs = new RohcRtpContextNACKsEnt(mib, this);
                        this.rohcRtpContextSNACKs = new RohcRtpContextSNACKsEnt(mib, this);
                        this.rohcRtpContextNHPs = new RohcRtpContextNHPsEnt(mib, this);
                        this.rohcRtpContextCSPs = new RohcRtpContextCSPsEnt(mib, this);
                        this.rohcRtpContextCCPs = new RohcRtpContextCCPsEnt(mib, this);
                        this.rohcRtpContextPktsLostPhysical = new RohcRtpContextPktsLostPhysicalEnt(mib, this);
                        this.rohcRtpContextPktsLostPreLink = new RohcRtpContextPktsLostPreLinkEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rohcRtpContextState,
                            this.rohcRtpContextMode,
                            this.rohcRtpContextAlwaysPad,
                            this.rohcRtpContextLargePktsAllowed,
                            this.rohcRtpContextVerifyPeriod,
                            this.rohcRtpContextSizesAllowed,
                            this.rohcRtpContextSizesUsed,
                            this.rohcRtpContextACKs,
                            this.rohcRtpContextNACKs,
                            this.rohcRtpContextSNACKs,
                            this.rohcRtpContextNHPs,
                            this.rohcRtpContextCSPs,
                            this.rohcRtpContextCCPs,
                            this.rohcRtpContextPktsLostPhysical,
                            this.rohcRtpContextPktsLostPreLink
                        };
                    }
                    public static final class RohcRtpContextStateEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpContextStateEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpContextState", "1.3.6.1.2.1.114.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcRtpContextModeEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpContextModeEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpContextMode", "1.3.6.1.2.1.114.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcRtpContextAlwaysPadEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpContextAlwaysPadEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpContextAlwaysPad", "1.3.6.1.2.1.114.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcRtpContextLargePktsAllowedEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpContextLargePktsAllowedEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpContextLargePktsAllowed", "1.3.6.1.2.1.114.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcRtpContextVerifyPeriodEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpContextVerifyPeriodEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpContextVerifyPeriod", "1.3.6.1.2.1.114.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcRtpContextSizesAllowedEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpContextSizesAllowedEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpContextSizesAllowed", "1.3.6.1.2.1.114.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcRtpContextSizesUsedEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpContextSizesUsedEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpContextSizesUsed", "1.3.6.1.2.1.114.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcRtpContextACKsEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpContextACKsEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpContextACKs", "1.3.6.1.2.1.114.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcRtpContextNACKsEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpContextNACKsEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpContextNACKs", "1.3.6.1.2.1.114.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcRtpContextSNACKsEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpContextSNACKsEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpContextSNACKs", "1.3.6.1.2.1.114.1.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcRtpContextNHPsEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpContextNHPsEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpContextNHPs", "1.3.6.1.2.1.114.1.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcRtpContextCSPsEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpContextCSPsEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpContextCSPs", "1.3.6.1.2.1.114.1.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcRtpContextCCPsEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpContextCCPsEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpContextCCPs", "1.3.6.1.2.1.114.1.1.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcRtpContextPktsLostPhysicalEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpContextPktsLostPhysicalEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpContextPktsLostPhysical", "1.3.6.1.2.1.114.1.1.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcRtpContextPktsLostPreLinkEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpContextPktsLostPreLinkEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpContextPktsLostPreLink", "1.3.6.1.2.1.114.1.1.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RohcRtpPacketSizeTableEnt extends MIBEntry<ROHCRTPMIBDef>
            {
                public final RohcRtpPacketSizeEntryEnt rohcRtpPacketSizeEntry;

                private RohcRtpPacketSizeTableEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                {
                    super(mib, parent, "rohcRtpPacketSizeTable", "1.3.6.1.2.1.114.1.2", false, true, false, false);
                    this.rohcRtpPacketSizeEntry = new RohcRtpPacketSizeEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rohcRtpPacketSizeEntry
                    };
                }
                public static final class RohcRtpPacketSizeEntryEnt extends MIBEntry<ROHCRTPMIBDef>
                {
                    public final RohcRtpPacketSizeEnt rohcRtpPacketSize;

                    public final RohcRtpPacketSizePreferredEnt rohcRtpPacketSizePreferred;

                    public final RohcRtpPacketSizeUsedEnt rohcRtpPacketSizeUsed;

                    public final RohcRtpPacketSizeRestrictedTypeEnt rohcRtpPacketSizeRestrictedType;

                    private RohcRtpPacketSizeEntryEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                    {
                        super(mib, parent, "rohcRtpPacketSizeEntry", "1.3.6.1.2.1.114.1.2.1", false, false, false, true);
                        this.rohcRtpPacketSize = new RohcRtpPacketSizeEnt(mib, this);
                        this.rohcRtpPacketSizePreferred = new RohcRtpPacketSizePreferredEnt(mib, this);
                        this.rohcRtpPacketSizeUsed = new RohcRtpPacketSizeUsedEnt(mib, this);
                        this.rohcRtpPacketSizeRestrictedType = new RohcRtpPacketSizeRestrictedTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rohcRtpPacketSize,
                            this.rohcRtpPacketSizePreferred,
                            this.rohcRtpPacketSizeUsed,
                            this.rohcRtpPacketSizeRestrictedType
                        };
                    }
                    public static final class RohcRtpPacketSizeEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpPacketSizeEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpPacketSize", "1.3.6.1.2.1.114.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcRtpPacketSizePreferredEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpPacketSizePreferredEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpPacketSizePreferred", "1.3.6.1.2.1.114.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcRtpPacketSizeUsedEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpPacketSizeUsedEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpPacketSizeUsed", "1.3.6.1.2.1.114.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcRtpPacketSizeRestrictedTypeEnt extends MIBEntry<ROHCRTPMIBDef>
                    {
                        private RohcRtpPacketSizeRestrictedTypeEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                        {
                            super(mib, parent, "rohcRtpPacketSizeRestrictedType", "1.3.6.1.2.1.114.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class RohcRtpConformanceEnt extends MIBEntry<ROHCRTPMIBDef>
        {
            /** conformance information*/
            public final RohcRtpCompliancesEnt rohcRtpCompliances;

            public final RohcRtpGroupsEnt rohcRtpGroups;

            private RohcRtpConformanceEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
            {
                super(mib, parent, "rohcRtpConformance", "1.3.6.1.2.1.114.2", false, false, false, false);
                this.rohcRtpCompliances = new RohcRtpCompliancesEnt(mib, this);
                this.rohcRtpGroups = new RohcRtpGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rohcRtpCompliances,
                    this.rohcRtpGroups
                };
            }
            public static final class RohcRtpCompliancesEnt extends MIBEntry<ROHCRTPMIBDef>
            {
                /** compliance statements*/
                public final RohcRtpComplianceEnt rohcRtpCompliance;

                private RohcRtpCompliancesEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                {
                    super(mib, parent, "rohcRtpCompliances", "1.3.6.1.2.1.114.2.1", false, false, false, false);
                    this.rohcRtpCompliance = new RohcRtpComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rohcRtpCompliance
                    };
                }
                public static final class RohcRtpComplianceEnt extends MIBEntry<ROHCRTPMIBDef>
                {
                    private RohcRtpComplianceEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                    {
                        super(mib, parent, "rohcRtpCompliance", "1.3.6.1.2.1.114.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class RohcRtpGroupsEnt extends MIBEntry<ROHCRTPMIBDef>
            {
                public final RohcRtpContextGroupEnt rohcRtpContextGroup;

                public final RohcRtpPacketSizesGroupEnt rohcRtpPacketSizesGroup;

                public final RohcRtpStatisticsGroupEnt rohcRtpStatisticsGroup;

                private RohcRtpGroupsEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                {
                    super(mib, parent, "rohcRtpGroups", "1.3.6.1.2.1.114.2.2", false, false, false, false);
                    this.rohcRtpContextGroup = new RohcRtpContextGroupEnt(mib, this);
                    this.rohcRtpPacketSizesGroup = new RohcRtpPacketSizesGroupEnt(mib, this);
                    this.rohcRtpStatisticsGroup = new RohcRtpStatisticsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rohcRtpContextGroup,
                        this.rohcRtpPacketSizesGroup,
                        this.rohcRtpStatisticsGroup
                    };
                }
                public static final class RohcRtpContextGroupEnt extends MIBEntry<ROHCRTPMIBDef>
                {
                    private RohcRtpContextGroupEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                    {
                        super(mib, parent, "rohcRtpContextGroup", "1.3.6.1.2.1.114.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RohcRtpPacketSizesGroupEnt extends MIBEntry<ROHCRTPMIBDef>
                {
                    private RohcRtpPacketSizesGroupEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                    {
                        super(mib, parent, "rohcRtpPacketSizesGroup", "1.3.6.1.2.1.114.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RohcRtpStatisticsGroupEnt extends MIBEntry<ROHCRTPMIBDef>
                {
                    private RohcRtpStatisticsGroupEnt(ROHCRTPMIBDef mib, MIBEntry<ROHCRTPMIBDef> parent)
                    {
                        super(mib, parent, "rohcRtpStatisticsGroup", "1.3.6.1.2.1.114.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
