package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**RFC 2578
RFC 2580
RFC 2579
RFC 4801
RFC 3813
RFC 2863
RFC 3811*/
public final class GMPLSLSRSTDMIBDef extends MIB
{
    public static final GMPLSLSRSTDMIBDef GMPLSLSRSTDMIB = new GMPLSLSRSTDMIBDef();

    /** 27 February 2007 00:00:00 GMT*/
    public final GmplsLsrStdMIBEnt gmplsLsrStdMIB;

    private GMPLSLSRSTDMIBDef()
    {
        super("GMPLS-LSR-STD-MIB");
        this.gmplsLsrStdMIB = new GmplsLsrStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.gmplsLsrStdMIB
        };
    }

    public static final class GmplsLsrStdMIBEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
    {
        /** no notifications are currently defined.*/
        public final GmplsLsrObjectsEnt gmplsLsrObjects;

        public final GmplsLsrConformanceEnt gmplsLsrConformance;

        private GmplsLsrStdMIBEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
        {
            super(mib, parent, "gmplsLsrStdMIB", "1.3.6.1.2.1.10.166.15", false, false, false, false);
            this.gmplsLsrObjects = new GmplsLsrObjectsEnt(mib, this);
            this.gmplsLsrConformance = new GmplsLsrConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.gmplsLsrObjects,
                this.gmplsLsrConformance
            };
        }
        public static final class GmplsLsrObjectsEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
        {
            public final GmplsInterfaceTableEnt gmplsInterfaceTable;

            public final GmplsInSegmentTableEnt gmplsInSegmentTable;

            public final GmplsOutSegmentTableEnt gmplsOutSegmentTable;

            private GmplsLsrObjectsEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
            {
                super(mib, parent, "gmplsLsrObjects", "1.3.6.1.2.1.10.166.15.1", false, false, false, false);
                this.gmplsInterfaceTable = new GmplsInterfaceTableEnt(mib, this);
                this.gmplsInSegmentTable = new GmplsInSegmentTableEnt(mib, this);
                this.gmplsOutSegmentTable = new GmplsOutSegmentTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.gmplsInterfaceTable,
                    this.gmplsInSegmentTable,
                    this.gmplsOutSegmentTable
                };
            }
            public static final class GmplsInterfaceTableEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
            {
                public final GmplsInterfaceEntryEnt gmplsInterfaceEntry;

                private GmplsInterfaceTableEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsInterfaceTable", "1.3.6.1.2.1.10.166.15.1.1", false, true, false, false);
                    this.gmplsInterfaceEntry = new GmplsInterfaceEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gmplsInterfaceEntry
                    };
                }
                public static final class GmplsInterfaceEntryEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
                {
                    public final GmplsInterfaceSignalingCapsEnt gmplsInterfaceSignalingCaps;

                    public final GmplsInterfaceRsvpHelloPeriodEnt gmplsInterfaceRsvpHelloPeriod;

                    private GmplsInterfaceEntryEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsInterfaceEntry", "1.3.6.1.2.1.10.166.15.1.1.1", false, false, false, true);
                        this.gmplsInterfaceSignalingCaps = new GmplsInterfaceSignalingCapsEnt(mib, this);
                        this.gmplsInterfaceRsvpHelloPeriod = new GmplsInterfaceRsvpHelloPeriodEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.gmplsInterfaceSignalingCaps,
                            this.gmplsInterfaceRsvpHelloPeriod
                        };
                    }
                    public static final class GmplsInterfaceSignalingCapsEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
                    {
                        private GmplsInterfaceSignalingCapsEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsInterfaceSignalingCaps", "1.3.6.1.2.1.10.166.15.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsInterfaceRsvpHelloPeriodEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
                    {
                        private GmplsInterfaceRsvpHelloPeriodEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsInterfaceRsvpHelloPeriod", "1.3.6.1.2.1.10.166.15.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class GmplsInSegmentTableEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
            {
                public final GmplsInSegmentEntryEnt gmplsInSegmentEntry;

                private GmplsInSegmentTableEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsInSegmentTable", "1.3.6.1.2.1.10.166.15.1.2", false, true, false, false);
                    this.gmplsInSegmentEntry = new GmplsInSegmentEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gmplsInSegmentEntry
                    };
                }
                public static final class GmplsInSegmentEntryEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
                {
                    public final GmplsInSegmentDirectionEnt gmplsInSegmentDirection;

                    public final GmplsInSegmentExtraParamsPtrEnt gmplsInSegmentExtraParamsPtr;

                    private GmplsInSegmentEntryEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsInSegmentEntry", "1.3.6.1.2.1.10.166.15.1.2.1", false, false, false, true);
                        this.gmplsInSegmentDirection = new GmplsInSegmentDirectionEnt(mib, this);
                        this.gmplsInSegmentExtraParamsPtr = new GmplsInSegmentExtraParamsPtrEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.gmplsInSegmentDirection,
                            this.gmplsInSegmentExtraParamsPtr
                        };
                    }
                    public static final class GmplsInSegmentDirectionEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
                    {
                        private GmplsInSegmentDirectionEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsInSegmentDirection", "1.3.6.1.2.1.10.166.15.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsInSegmentExtraParamsPtrEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
                    {
                        private GmplsInSegmentExtraParamsPtrEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsInSegmentExtraParamsPtr", "1.3.6.1.2.1.10.166.15.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class GmplsOutSegmentTableEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
            {
                public final GmplsOutSegmentEntryEnt gmplsOutSegmentEntry;

                private GmplsOutSegmentTableEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsOutSegmentTable", "1.3.6.1.2.1.10.166.15.1.3", false, true, false, false);
                    this.gmplsOutSegmentEntry = new GmplsOutSegmentEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gmplsOutSegmentEntry
                    };
                }
                public static final class GmplsOutSegmentEntryEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
                {
                    public final GmplsOutSegmentDirectionEnt gmplsOutSegmentDirection;

                    public final GmplsOutSegmentTTLDecrementEnt gmplsOutSegmentTTLDecrement;

                    public final GmplsOutSegmentExtraParamsPtrEnt gmplsOutSegmentExtraParamsPtr;

                    private GmplsOutSegmentEntryEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsOutSegmentEntry", "1.3.6.1.2.1.10.166.15.1.3.1", false, false, false, true);
                        this.gmplsOutSegmentDirection = new GmplsOutSegmentDirectionEnt(mib, this);
                        this.gmplsOutSegmentTTLDecrement = new GmplsOutSegmentTTLDecrementEnt(mib, this);
                        this.gmplsOutSegmentExtraParamsPtr = new GmplsOutSegmentExtraParamsPtrEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.gmplsOutSegmentDirection,
                            this.gmplsOutSegmentTTLDecrement,
                            this.gmplsOutSegmentExtraParamsPtr
                        };
                    }
                    public static final class GmplsOutSegmentDirectionEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
                    {
                        private GmplsOutSegmentDirectionEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsOutSegmentDirection", "1.3.6.1.2.1.10.166.15.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsOutSegmentTTLDecrementEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
                    {
                        private GmplsOutSegmentTTLDecrementEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsOutSegmentTTLDecrement", "1.3.6.1.2.1.10.166.15.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsOutSegmentExtraParamsPtrEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
                    {
                        private GmplsOutSegmentExtraParamsPtrEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsOutSegmentExtraParamsPtr", "1.3.6.1.2.1.10.166.15.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class GmplsLsrConformanceEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
        {
            public final GmplsLsrGroupsEnt gmplsLsrGroups;

            public final GmplsLsrCompliancesEnt gmplsLsrCompliances;

            private GmplsLsrConformanceEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
            {
                super(mib, parent, "gmplsLsrConformance", "1.3.6.1.2.1.10.166.15.2", false, false, false, false);
                this.gmplsLsrGroups = new GmplsLsrGroupsEnt(mib, this);
                this.gmplsLsrCompliances = new GmplsLsrCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.gmplsLsrGroups,
                    this.gmplsLsrCompliances
                };
            }
            public static final class GmplsLsrGroupsEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
            {
                public final GmplsInterfaceGroupEnt gmplsInterfaceGroup;

                public final GmplsInSegmentGroupEnt gmplsInSegmentGroup;

                public final GmplsOutSegmentGroupEnt gmplsOutSegmentGroup;

                private GmplsLsrGroupsEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsLsrGroups", "1.3.6.1.2.1.10.166.15.2.1", false, false, false, false);
                    this.gmplsInterfaceGroup = new GmplsInterfaceGroupEnt(mib, this);
                    this.gmplsInSegmentGroup = new GmplsInSegmentGroupEnt(mib, this);
                    this.gmplsOutSegmentGroup = new GmplsOutSegmentGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gmplsInterfaceGroup,
                        this.gmplsInSegmentGroup,
                        this.gmplsOutSegmentGroup
                    };
                }
                public static final class GmplsInterfaceGroupEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
                {
                    private GmplsInterfaceGroupEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsInterfaceGroup", "1.3.6.1.2.1.10.166.15.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GmplsInSegmentGroupEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
                {
                    private GmplsInSegmentGroupEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsInSegmentGroup", "1.3.6.1.2.1.10.166.15.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GmplsOutSegmentGroupEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
                {
                    private GmplsOutSegmentGroupEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsOutSegmentGroup", "1.3.6.1.2.1.10.166.15.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class GmplsLsrCompliancesEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
            {
                /** Compliance requirement for fully compliant implementations.

The Interfaces Group MIB, RFC 2863.
The MPLS-LSR-STD-MIB, RFC3813*/
                public final GmplsLsrModuleFullComplianceEnt gmplsLsrModuleFullCompliance;

                /** Compliance requirement for implementations that provide read-onlyaccess.

The interfaces Group MIB, RFC 2863*/
                public final GmplsLsrModuleReadOnlyComplianceEnt gmplsLsrModuleReadOnlyCompliance;

                private GmplsLsrCompliancesEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsLsrCompliances", "1.3.6.1.2.1.10.166.15.2.2", false, false, false, false);
                    this.gmplsLsrModuleFullCompliance = new GmplsLsrModuleFullComplianceEnt(mib, this);
                    this.gmplsLsrModuleReadOnlyCompliance = new GmplsLsrModuleReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gmplsLsrModuleFullCompliance,
                        this.gmplsLsrModuleReadOnlyCompliance
                    };
                }
                public static final class GmplsLsrModuleFullComplianceEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
                {
                    private GmplsLsrModuleFullComplianceEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsLsrModuleFullCompliance", "1.3.6.1.2.1.10.166.15.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GmplsLsrModuleReadOnlyComplianceEnt extends MIBEntry<GMPLSLSRSTDMIBDef>
                {
                    private GmplsLsrModuleReadOnlyComplianceEnt(GMPLSLSRSTDMIBDef mib, MIBEntry<GMPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsLsrModuleReadOnlyCompliance", "1.3.6.1.2.1.10.166.15.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
