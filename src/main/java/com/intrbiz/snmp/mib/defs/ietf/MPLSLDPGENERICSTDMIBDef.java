package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2580]
[RFC2579]
[RFC2020]
[RFC3811]
[RFC3813]*/
public final class MPLSLDPGENERICSTDMIBDef extends MIB
{
    public static final MPLSLDPGENERICSTDMIBDef MPLSLDPGENERICSTDMIB = new MPLSLDPGENERICSTDMIBDef();

    /** June 6, 2004*/
    public final MplsLdpGenericStdMIBEnt mplsLdpGenericStdMIB;

    private MPLSLDPGENERICSTDMIBDef()
    {
        super("MPLS-LDP-GENERIC-STD-MIB");
        this.mplsLdpGenericStdMIB = new MplsLdpGenericStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mplsLdpGenericStdMIB
        };
    }

    public static final class MplsLdpGenericStdMIBEnt extends MIBEntry<MPLSLDPGENERICSTDMIBDef>
    {
        /** *****************************************************************/
        public final MplsLdpGenericObjectsEnt mplsLdpGenericObjects;

        public final MplsLdpGenericConformanceEnt mplsLdpGenericConformance;

        private MplsLdpGenericStdMIBEnt(MPLSLDPGENERICSTDMIBDef mib, MIBEntry<MPLSLDPGENERICSTDMIBDef> parent)
        {
            super(mib, parent, "mplsLdpGenericStdMIB", "1.3.6.1.2.1.10.166.7", false, false, false, false);
            this.mplsLdpGenericObjects = new MplsLdpGenericObjectsEnt(mib, this);
            this.mplsLdpGenericConformance = new MplsLdpGenericConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mplsLdpGenericObjects,
                this.mplsLdpGenericConformance
            };
        }
        public static final class MplsLdpGenericObjectsEnt extends MIBEntry<MPLSLDPGENERICSTDMIBDef>
        {
            /** ****************************************************************MPLS LDP GENERIC Objects****************************************************************
Ldp Entity Objects for Generic Labels*/
            public final MplsLdpEntityGenericObjectsEnt mplsLdpEntityGenericObjects;

            private MplsLdpGenericObjectsEnt(MPLSLDPGENERICSTDMIBDef mib, MIBEntry<MPLSLDPGENERICSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLdpGenericObjects", "1.3.6.1.2.1.10.166.7.1", false, false, false, false);
                this.mplsLdpEntityGenericObjects = new MplsLdpEntityGenericObjectsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsLdpEntityGenericObjects
                };
            }
            public static final class MplsLdpEntityGenericObjectsEnt extends MIBEntry<MPLSLDPGENERICSTDMIBDef>
            {
                /** The MPLS LDP Entity Generic Label Range Table*/
                public final MplsLdpEntityGenericLRTableEnt mplsLdpEntityGenericLRTable;

                private MplsLdpEntityGenericObjectsEnt(MPLSLDPGENERICSTDMIBDef mib, MIBEntry<MPLSLDPGENERICSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpEntityGenericObjects", "1.3.6.1.2.1.10.166.7.1.1", false, false, false, false);
                    this.mplsLdpEntityGenericLRTable = new MplsLdpEntityGenericLRTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLdpEntityGenericLRTable
                    };
                }
                public static final class MplsLdpEntityGenericLRTableEnt extends MIBEntry<MPLSLDPGENERICSTDMIBDef>
                {
                    public final MplsLdpEntityGenericLREntryEnt mplsLdpEntityGenericLREntry;

                    private MplsLdpEntityGenericLRTableEnt(MPLSLDPGENERICSTDMIBDef mib, MIBEntry<MPLSLDPGENERICSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpEntityGenericLRTable", "1.3.6.1.2.1.10.166.7.1.1.1", false, true, false, false);
                        this.mplsLdpEntityGenericLREntry = new MplsLdpEntityGenericLREntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLdpEntityGenericLREntry
                        };
                    }
                    public static final class MplsLdpEntityGenericLREntryEnt extends MIBEntry<MPLSLDPGENERICSTDMIBDef>
                    {
                        public final MplsLdpEntityGenericLRMinEnt mplsLdpEntityGenericLRMin;

                        public final MplsLdpEntityGenericLRMaxEnt mplsLdpEntityGenericLRMax;

                        public final MplsLdpEntityGenericLabelSpaceEnt mplsLdpEntityGenericLabelSpace;

                        public final MplsLdpEntityGenericIfIndexOrZeroEnt mplsLdpEntityGenericIfIndexOrZero;

                        public final MplsLdpEntityGenericLRStorageTypeEnt mplsLdpEntityGenericLRStorageType;

                        public final MplsLdpEntityGenericLRRowStatusEnt mplsLdpEntityGenericLRRowStatus;

                        private MplsLdpEntityGenericLREntryEnt(MPLSLDPGENERICSTDMIBDef mib, MIBEntry<MPLSLDPGENERICSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLdpEntityGenericLREntry", "1.3.6.1.2.1.10.166.7.1.1.1.1", false, false, false, true);
                            this.mplsLdpEntityGenericLRMin = new MplsLdpEntityGenericLRMinEnt(mib, this);
                            this.mplsLdpEntityGenericLRMax = new MplsLdpEntityGenericLRMaxEnt(mib, this);
                            this.mplsLdpEntityGenericLabelSpace = new MplsLdpEntityGenericLabelSpaceEnt(mib, this);
                            this.mplsLdpEntityGenericIfIndexOrZero = new MplsLdpEntityGenericIfIndexOrZeroEnt(mib, this);
                            this.mplsLdpEntityGenericLRStorageType = new MplsLdpEntityGenericLRStorageTypeEnt(mib, this);
                            this.mplsLdpEntityGenericLRRowStatus = new MplsLdpEntityGenericLRRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsLdpEntityGenericLRMin,
                                this.mplsLdpEntityGenericLRMax,
                                this.mplsLdpEntityGenericLabelSpace,
                                this.mplsLdpEntityGenericIfIndexOrZero,
                                this.mplsLdpEntityGenericLRStorageType,
                                this.mplsLdpEntityGenericLRRowStatus
                            };
                        }
                        public static final class MplsLdpEntityGenericLRMinEnt extends MIBEntry<MPLSLDPGENERICSTDMIBDef>
                        {
                            private MplsLdpEntityGenericLRMinEnt(MPLSLDPGENERICSTDMIBDef mib, MIBEntry<MPLSLDPGENERICSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityGenericLRMin", "1.3.6.1.2.1.10.166.7.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityGenericLRMaxEnt extends MIBEntry<MPLSLDPGENERICSTDMIBDef>
                        {
                            private MplsLdpEntityGenericLRMaxEnt(MPLSLDPGENERICSTDMIBDef mib, MIBEntry<MPLSLDPGENERICSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityGenericLRMax", "1.3.6.1.2.1.10.166.7.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityGenericLabelSpaceEnt extends MIBEntry<MPLSLDPGENERICSTDMIBDef>
                        {
                            private MplsLdpEntityGenericLabelSpaceEnt(MPLSLDPGENERICSTDMIBDef mib, MIBEntry<MPLSLDPGENERICSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityGenericLabelSpace", "1.3.6.1.2.1.10.166.7.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityGenericIfIndexOrZeroEnt extends MIBEntry<MPLSLDPGENERICSTDMIBDef>
                        {
                            private MplsLdpEntityGenericIfIndexOrZeroEnt(MPLSLDPGENERICSTDMIBDef mib, MIBEntry<MPLSLDPGENERICSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityGenericIfIndexOrZero", "1.3.6.1.2.1.10.166.7.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityGenericLRStorageTypeEnt extends MIBEntry<MPLSLDPGENERICSTDMIBDef>
                        {
                            private MplsLdpEntityGenericLRStorageTypeEnt(MPLSLDPGENERICSTDMIBDef mib, MIBEntry<MPLSLDPGENERICSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityGenericLRStorageType", "1.3.6.1.2.1.10.166.7.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityGenericLRRowStatusEnt extends MIBEntry<MPLSLDPGENERICSTDMIBDef>
                        {
                            private MplsLdpEntityGenericLRRowStatusEnt(MPLSLDPGENERICSTDMIBDef mib, MIBEntry<MPLSLDPGENERICSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityGenericLRRowStatus", "1.3.6.1.2.1.10.166.7.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class MplsLdpGenericConformanceEnt extends MIBEntry<MPLSLDPGENERICSTDMIBDef>
        {
            /** ****************************************************************Module Conformance Statement*****************************************************************/
            public final MplsLdpGenericGroupsEnt mplsLdpGenericGroups;

            public final MplsLdpGenericCompliancesEnt mplsLdpGenericCompliances;

            private MplsLdpGenericConformanceEnt(MPLSLDPGENERICSTDMIBDef mib, MIBEntry<MPLSLDPGENERICSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLdpGenericConformance", "1.3.6.1.2.1.10.166.7.2", false, false, false, false);
                this.mplsLdpGenericGroups = new MplsLdpGenericGroupsEnt(mib, this);
                this.mplsLdpGenericCompliances = new MplsLdpGenericCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsLdpGenericGroups,
                    this.mplsLdpGenericCompliances
                };
            }
            public static final class MplsLdpGenericGroupsEnt extends MIBEntry<MPLSLDPGENERICSTDMIBDef>
            {
                /** units of conformance*/
                public final MplsLdpGenericGroupEnt mplsLdpGenericGroup;

                private MplsLdpGenericGroupsEnt(MPLSLDPGENERICSTDMIBDef mib, MIBEntry<MPLSLDPGENERICSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpGenericGroups", "1.3.6.1.2.1.10.166.7.2.1", false, false, false, false);
                    this.mplsLdpGenericGroup = new MplsLdpGenericGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLdpGenericGroup
                    };
                }
                public static final class MplsLdpGenericGroupEnt extends MIBEntry<MPLSLDPGENERICSTDMIBDef>
                {
                    private MplsLdpGenericGroupEnt(MPLSLDPGENERICSTDMIBDef mib, MIBEntry<MPLSLDPGENERICSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpGenericGroup", "1.3.6.1.2.1.10.166.7.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MplsLdpGenericCompliancesEnt extends MIBEntry<MPLSLDPGENERICSTDMIBDef>
            {
                /** Full Compliance*/
                public final MplsLdpGenericModuleFullComplianceEnt mplsLdpGenericModuleFullCompliance;

                /** Read-Only Compliance*/
                public final MplsLdpGenericModuleReadOnlyComplianceEnt mplsLdpGenericModuleReadOnlyCompliance;

                private MplsLdpGenericCompliancesEnt(MPLSLDPGENERICSTDMIBDef mib, MIBEntry<MPLSLDPGENERICSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpGenericCompliances", "1.3.6.1.2.1.10.166.7.2.2", false, false, false, false);
                    this.mplsLdpGenericModuleFullCompliance = new MplsLdpGenericModuleFullComplianceEnt(mib, this);
                    this.mplsLdpGenericModuleReadOnlyCompliance = new MplsLdpGenericModuleReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLdpGenericModuleFullCompliance,
                        this.mplsLdpGenericModuleReadOnlyCompliance
                    };
                }
                public static final class MplsLdpGenericModuleFullComplianceEnt extends MIBEntry<MPLSLDPGENERICSTDMIBDef>
                {
                    private MplsLdpGenericModuleFullComplianceEnt(MPLSLDPGENERICSTDMIBDef mib, MIBEntry<MPLSLDPGENERICSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpGenericModuleFullCompliance", "1.3.6.1.2.1.10.166.7.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsLdpGenericModuleReadOnlyComplianceEnt extends MIBEntry<MPLSLDPGENERICSTDMIBDef>
                {
                    private MplsLdpGenericModuleReadOnlyComplianceEnt(MPLSLDPGENERICSTDMIBDef mib, MIBEntry<MPLSLDPGENERICSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpGenericModuleReadOnlyCompliance", "1.3.6.1.2.1.10.166.7.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
