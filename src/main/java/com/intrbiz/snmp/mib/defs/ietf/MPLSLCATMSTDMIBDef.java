package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class MPLSLCATMSTDMIBDef extends MIB
{
    public static final MPLSLCATMSTDMIBDef MPLSLCATMSTDMIB = new MPLSLCATMSTDMIBDef();

    /** 12 January 2006*/
    public final MplsLcAtmStdMIBEnt mplsLcAtmStdMIB;

    private MPLSLCATMSTDMIBDef()
    {
        super("MPLS-LC-ATM-STD-MIB");
        this.mplsLcAtmStdMIB = new MplsLcAtmStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mplsLcAtmStdMIB
        };
    }

    public static final class MplsLcAtmStdMIBEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
    {
        /** Top level components of this MIB module.
Tables, Scalars, Notifications, Conformance*/
        public final MplsLcAtmStdNotificationsEnt mplsLcAtmStdNotifications;

        public final MplsLcAtmStdObjectsEnt mplsLcAtmStdObjects;

        public final MplsLcAtmStdConformanceEnt mplsLcAtmStdConformance;

        private MplsLcAtmStdMIBEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
        {
            super(mib, parent, "mplsLcAtmStdMIB", "1.3.6.1.2.1.10.166.9", false, false, false, false);
            this.mplsLcAtmStdNotifications = new MplsLcAtmStdNotificationsEnt(mib, this);
            this.mplsLcAtmStdObjects = new MplsLcAtmStdObjectsEnt(mib, this);
            this.mplsLcAtmStdConformance = new MplsLcAtmStdConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mplsLcAtmStdNotifications,
                this.mplsLcAtmStdObjects,
                this.mplsLcAtmStdConformance
            };
        }
        public static final class MplsLcAtmStdNotificationsEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
        {
            private MplsLcAtmStdNotificationsEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLcAtmStdNotifications", "1.3.6.1.2.1.10.166.9.0", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class MplsLcAtmStdObjectsEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
        {
            /** MPLS LC-ATM Interface Configuration Table.*/
            public final MplsLcAtmStdInterfaceConfTableEnt mplsLcAtmStdInterfaceConfTable;

            private MplsLcAtmStdObjectsEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLcAtmStdObjects", "1.3.6.1.2.1.10.166.9.1", false, false, false, false);
                this.mplsLcAtmStdInterfaceConfTable = new MplsLcAtmStdInterfaceConfTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsLcAtmStdInterfaceConfTable
                };
            }
            public static final class MplsLcAtmStdInterfaceConfTableEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
            {
                public final MplsLcAtmStdInterfaceConfEntryEnt mplsLcAtmStdInterfaceConfEntry;

                private MplsLcAtmStdInterfaceConfTableEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLcAtmStdInterfaceConfTable", "1.3.6.1.2.1.10.166.9.1.1", false, true, false, false);
                    this.mplsLcAtmStdInterfaceConfEntry = new MplsLcAtmStdInterfaceConfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLcAtmStdInterfaceConfEntry
                    };
                }
                public static final class MplsLcAtmStdInterfaceConfEntryEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
                {
                    public final MplsLcAtmStdCtrlVpiEnt mplsLcAtmStdCtrlVpi;

                    public final MplsLcAtmStdCtrlVciEnt mplsLcAtmStdCtrlVci;

                    public final MplsLcAtmStdUnlabTrafVpiEnt mplsLcAtmStdUnlabTrafVpi;

                    public final MplsLcAtmStdUnlabTrafVciEnt mplsLcAtmStdUnlabTrafVci;

                    public final MplsLcAtmStdVcMergeEnt mplsLcAtmStdVcMerge;

                    public final MplsLcAtmVcDirectlyConnectedEnt mplsLcAtmVcDirectlyConnected;

                    public final MplsLcAtmLcAtmVPIEnt mplsLcAtmLcAtmVPI;

                    public final MplsLcAtmStdIfConfRowStatusEnt mplsLcAtmStdIfConfRowStatus;

                    public final MplsLcAtmStdIfConfStorageTypeEnt mplsLcAtmStdIfConfStorageType;

                    private MplsLcAtmStdInterfaceConfEntryEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLcAtmStdInterfaceConfEntry", "1.3.6.1.2.1.10.166.9.1.1.1", false, false, false, true);
                        this.mplsLcAtmStdCtrlVpi = new MplsLcAtmStdCtrlVpiEnt(mib, this);
                        this.mplsLcAtmStdCtrlVci = new MplsLcAtmStdCtrlVciEnt(mib, this);
                        this.mplsLcAtmStdUnlabTrafVpi = new MplsLcAtmStdUnlabTrafVpiEnt(mib, this);
                        this.mplsLcAtmStdUnlabTrafVci = new MplsLcAtmStdUnlabTrafVciEnt(mib, this);
                        this.mplsLcAtmStdVcMerge = new MplsLcAtmStdVcMergeEnt(mib, this);
                        this.mplsLcAtmVcDirectlyConnected = new MplsLcAtmVcDirectlyConnectedEnt(mib, this);
                        this.mplsLcAtmLcAtmVPI = new MplsLcAtmLcAtmVPIEnt(mib, this);
                        this.mplsLcAtmStdIfConfRowStatus = new MplsLcAtmStdIfConfRowStatusEnt(mib, this);
                        this.mplsLcAtmStdIfConfStorageType = new MplsLcAtmStdIfConfStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLcAtmStdCtrlVpi,
                            this.mplsLcAtmStdCtrlVci,
                            this.mplsLcAtmStdUnlabTrafVpi,
                            this.mplsLcAtmStdUnlabTrafVci,
                            this.mplsLcAtmStdVcMerge,
                            this.mplsLcAtmVcDirectlyConnected,
                            this.mplsLcAtmLcAtmVPI,
                            this.mplsLcAtmStdIfConfRowStatus,
                            this.mplsLcAtmStdIfConfStorageType
                        };
                    }
                    public static final class MplsLcAtmStdCtrlVpiEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
                    {
                        private MplsLcAtmStdCtrlVpiEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLcAtmStdCtrlVpi", "1.3.6.1.2.1.10.166.9.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLcAtmStdCtrlVciEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
                    {
                        private MplsLcAtmStdCtrlVciEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLcAtmStdCtrlVci", "1.3.6.1.2.1.10.166.9.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLcAtmStdUnlabTrafVpiEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
                    {
                        private MplsLcAtmStdUnlabTrafVpiEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLcAtmStdUnlabTrafVpi", "1.3.6.1.2.1.10.166.9.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLcAtmStdUnlabTrafVciEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
                    {
                        private MplsLcAtmStdUnlabTrafVciEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLcAtmStdUnlabTrafVci", "1.3.6.1.2.1.10.166.9.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLcAtmStdVcMergeEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
                    {
                        private MplsLcAtmStdVcMergeEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLcAtmStdVcMerge", "1.3.6.1.2.1.10.166.9.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLcAtmVcDirectlyConnectedEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
                    {
                        private MplsLcAtmVcDirectlyConnectedEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLcAtmVcDirectlyConnected", "1.3.6.1.2.1.10.166.9.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLcAtmLcAtmVPIEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
                    {
                        private MplsLcAtmLcAtmVPIEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLcAtmLcAtmVPI", "1.3.6.1.2.1.10.166.9.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLcAtmStdIfConfRowStatusEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
                    {
                        private MplsLcAtmStdIfConfRowStatusEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLcAtmStdIfConfRowStatus", "1.3.6.1.2.1.10.166.9.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLcAtmStdIfConfStorageTypeEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
                    {
                        private MplsLcAtmStdIfConfStorageTypeEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLcAtmStdIfConfStorageType", "1.3.6.1.2.1.10.166.9.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class MplsLcAtmStdConformanceEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
        {
            /** End of mplsLcAtmStdInterfaceConfTable
Module compliance.*/
            public final MplsLcAtmStdCompliancesEnt mplsLcAtmStdCompliances;

            public final MplsLcAtmStdGroupsEnt mplsLcAtmStdGroups;

            private MplsLcAtmStdConformanceEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLcAtmStdConformance", "1.3.6.1.2.1.10.166.9.2", false, false, false, false);
                this.mplsLcAtmStdCompliances = new MplsLcAtmStdCompliancesEnt(mib, this);
                this.mplsLcAtmStdGroups = new MplsLcAtmStdGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsLcAtmStdCompliances,
                    this.mplsLcAtmStdGroups
                };
            }
            public static final class MplsLcAtmStdCompliancesEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
            {
                /** Compliance requirement for full compliance*/
                public final MplsLcAtmStdModuleFullComplianceEnt mplsLcAtmStdModuleFullCompliance;

                /** Compliance requirement for read-only implementations.*/
                public final MplsLcAtmStdModuleReadOnlyComplianceEnt mplsLcAtmStdModuleReadOnlyCompliance;

                private MplsLcAtmStdCompliancesEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLcAtmStdCompliances", "1.3.6.1.2.1.10.166.9.2.1", false, false, false, false);
                    this.mplsLcAtmStdModuleFullCompliance = new MplsLcAtmStdModuleFullComplianceEnt(mib, this);
                    this.mplsLcAtmStdModuleReadOnlyCompliance = new MplsLcAtmStdModuleReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLcAtmStdModuleFullCompliance,
                        this.mplsLcAtmStdModuleReadOnlyCompliance
                    };
                }
                public static final class MplsLcAtmStdModuleFullComplianceEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
                {
                    private MplsLcAtmStdModuleFullComplianceEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLcAtmStdModuleFullCompliance", "1.3.6.1.2.1.10.166.9.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsLcAtmStdModuleReadOnlyComplianceEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
                {
                    private MplsLcAtmStdModuleReadOnlyComplianceEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLcAtmStdModuleReadOnlyCompliance", "1.3.6.1.2.1.10.166.9.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MplsLcAtmStdGroupsEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
            {
                /** Units of conformance.*/
                public final MplsLcAtmStdIfGroupEnt mplsLcAtmStdIfGroup;

                private MplsLcAtmStdGroupsEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLcAtmStdGroups", "1.3.6.1.2.1.10.166.9.2.2", false, false, false, false);
                    this.mplsLcAtmStdIfGroup = new MplsLcAtmStdIfGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLcAtmStdIfGroup
                    };
                }
                public static final class MplsLcAtmStdIfGroupEnt extends MIBEntry<MPLSLCATMSTDMIBDef>
                {
                    private MplsLcAtmStdIfGroupEnt(MPLSLCATMSTDMIBDef mib, MIBEntry<MPLSLCATMSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLcAtmStdIfGroup", "1.3.6.1.2.1.10.166.9.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
