package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class MPLSLCFRSTDMIBDef extends MIB
{
    public static final MPLSLCFRSTDMIBDef MPLSLCFRSTDMIB = new MPLSLCFRSTDMIBDef();

    /** 12 January 2006*/
    public final MplsLcFrStdMIBEnt mplsLcFrStdMIB;

    private MPLSLCFRSTDMIBDef()
    {
        super("MPLS-LC-FR-STD-MIB");
        this.mplsLcFrStdMIB = new MplsLcFrStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mplsLcFrStdMIB
        };
    }

    public static final class MplsLcFrStdMIBEnt extends MIBEntry<MPLSLCFRSTDMIBDef>
    {
        /** Top level components of this MIB module.Tables, Scalars, Notifications, Conformance*/
        public final MplsLcFrStdNotificationsEnt mplsLcFrStdNotifications;

        public final MplsLcFrStdObjectsEnt mplsLcFrStdObjects;

        public final MplsLcFrStdConformanceEnt mplsLcFrStdConformance;

        private MplsLcFrStdMIBEnt(MPLSLCFRSTDMIBDef mib, MIBEntry<MPLSLCFRSTDMIBDef> parent)
        {
            super(mib, parent, "mplsLcFrStdMIB", "1.3.6.1.2.1.10.166.10", false, false, false, false);
            this.mplsLcFrStdNotifications = new MplsLcFrStdNotificationsEnt(mib, this);
            this.mplsLcFrStdObjects = new MplsLcFrStdObjectsEnt(mib, this);
            this.mplsLcFrStdConformance = new MplsLcFrStdConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mplsLcFrStdNotifications,
                this.mplsLcFrStdObjects,
                this.mplsLcFrStdConformance
            };
        }
        public static final class MplsLcFrStdNotificationsEnt extends MIBEntry<MPLSLCFRSTDMIBDef>
        {
            private MplsLcFrStdNotificationsEnt(MPLSLCFRSTDMIBDef mib, MIBEntry<MPLSLCFRSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLcFrStdNotifications", "1.3.6.1.2.1.10.166.10.0", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class MplsLcFrStdObjectsEnt extends MIBEntry<MPLSLCFRSTDMIBDef>
        {
            /** MPLS LC-FR Interface Configuration Table.*/
            public final MplsLcFrStdInterfaceConfTableEnt mplsLcFrStdInterfaceConfTable;

            private MplsLcFrStdObjectsEnt(MPLSLCFRSTDMIBDef mib, MIBEntry<MPLSLCFRSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLcFrStdObjects", "1.3.6.1.2.1.10.166.10.1", false, false, false, false);
                this.mplsLcFrStdInterfaceConfTable = new MplsLcFrStdInterfaceConfTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsLcFrStdInterfaceConfTable
                };
            }
            public static final class MplsLcFrStdInterfaceConfTableEnt extends MIBEntry<MPLSLCFRSTDMIBDef>
            {
                public final MplsLcFrStdInterfaceConfEntryEnt mplsLcFrStdInterfaceConfEntry;

                private MplsLcFrStdInterfaceConfTableEnt(MPLSLCFRSTDMIBDef mib, MIBEntry<MPLSLCFRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLcFrStdInterfaceConfTable", "1.3.6.1.2.1.10.166.10.1.1", false, true, false, false);
                    this.mplsLcFrStdInterfaceConfEntry = new MplsLcFrStdInterfaceConfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLcFrStdInterfaceConfEntry
                    };
                }
                public static final class MplsLcFrStdInterfaceConfEntryEnt extends MIBEntry<MPLSLCFRSTDMIBDef>
                {
                    public final MplsLcFrStdTrafficMinDlciEnt mplsLcFrStdTrafficMinDlci;

                    public final MplsLcFrStdTrafficMaxDlciEnt mplsLcFrStdTrafficMaxDlci;

                    public final MplsLcFrStdCtrlMinDlciEnt mplsLcFrStdCtrlMinDlci;

                    public final MplsLcFrStdCtrlMaxDlciEnt mplsLcFrStdCtrlMaxDlci;

                    public final MplsLcFrStdInterfaceConfRowStatusEnt mplsLcFrStdInterfaceConfRowStatus;

                    public final MplsLcFrStdInterfaceConfStorageTypeEnt mplsLcFrStdInterfaceConfStorageType;

                    private MplsLcFrStdInterfaceConfEntryEnt(MPLSLCFRSTDMIBDef mib, MIBEntry<MPLSLCFRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLcFrStdInterfaceConfEntry", "1.3.6.1.2.1.10.166.10.1.1.1", false, false, false, true);
                        this.mplsLcFrStdTrafficMinDlci = new MplsLcFrStdTrafficMinDlciEnt(mib, this);
                        this.mplsLcFrStdTrafficMaxDlci = new MplsLcFrStdTrafficMaxDlciEnt(mib, this);
                        this.mplsLcFrStdCtrlMinDlci = new MplsLcFrStdCtrlMinDlciEnt(mib, this);
                        this.mplsLcFrStdCtrlMaxDlci = new MplsLcFrStdCtrlMaxDlciEnt(mib, this);
                        this.mplsLcFrStdInterfaceConfRowStatus = new MplsLcFrStdInterfaceConfRowStatusEnt(mib, this);
                        this.mplsLcFrStdInterfaceConfStorageType = new MplsLcFrStdInterfaceConfStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLcFrStdTrafficMinDlci,
                            this.mplsLcFrStdTrafficMaxDlci,
                            this.mplsLcFrStdCtrlMinDlci,
                            this.mplsLcFrStdCtrlMaxDlci,
                            this.mplsLcFrStdInterfaceConfRowStatus,
                            this.mplsLcFrStdInterfaceConfStorageType
                        };
                    }
                    public static final class MplsLcFrStdTrafficMinDlciEnt extends MIBEntry<MPLSLCFRSTDMIBDef>
                    {
                        private MplsLcFrStdTrafficMinDlciEnt(MPLSLCFRSTDMIBDef mib, MIBEntry<MPLSLCFRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLcFrStdTrafficMinDlci", "1.3.6.1.2.1.10.166.10.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLcFrStdTrafficMaxDlciEnt extends MIBEntry<MPLSLCFRSTDMIBDef>
                    {
                        private MplsLcFrStdTrafficMaxDlciEnt(MPLSLCFRSTDMIBDef mib, MIBEntry<MPLSLCFRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLcFrStdTrafficMaxDlci", "1.3.6.1.2.1.10.166.10.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLcFrStdCtrlMinDlciEnt extends MIBEntry<MPLSLCFRSTDMIBDef>
                    {
                        private MplsLcFrStdCtrlMinDlciEnt(MPLSLCFRSTDMIBDef mib, MIBEntry<MPLSLCFRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLcFrStdCtrlMinDlci", "1.3.6.1.2.1.10.166.10.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLcFrStdCtrlMaxDlciEnt extends MIBEntry<MPLSLCFRSTDMIBDef>
                    {
                        private MplsLcFrStdCtrlMaxDlciEnt(MPLSLCFRSTDMIBDef mib, MIBEntry<MPLSLCFRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLcFrStdCtrlMaxDlci", "1.3.6.1.2.1.10.166.10.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLcFrStdInterfaceConfRowStatusEnt extends MIBEntry<MPLSLCFRSTDMIBDef>
                    {
                        private MplsLcFrStdInterfaceConfRowStatusEnt(MPLSLCFRSTDMIBDef mib, MIBEntry<MPLSLCFRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLcFrStdInterfaceConfRowStatus", "1.3.6.1.2.1.10.166.10.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLcFrStdInterfaceConfStorageTypeEnt extends MIBEntry<MPLSLCFRSTDMIBDef>
                    {
                        private MplsLcFrStdInterfaceConfStorageTypeEnt(MPLSLCFRSTDMIBDef mib, MIBEntry<MPLSLCFRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLcFrStdInterfaceConfStorageType", "1.3.6.1.2.1.10.166.10.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class MplsLcFrStdConformanceEnt extends MIBEntry<MPLSLCFRSTDMIBDef>
        {
            /** End of mplsLcFrStdInterfaceConfTable
Module compliance.*/
            public final MplsLcFrStdCompliancesEnt mplsLcFrStdCompliances;

            public final MplsLcFrStdGroupsEnt mplsLcFrStdGroups;

            private MplsLcFrStdConformanceEnt(MPLSLCFRSTDMIBDef mib, MIBEntry<MPLSLCFRSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLcFrStdConformance", "1.3.6.1.2.1.10.166.10.2", false, false, false, false);
                this.mplsLcFrStdCompliances = new MplsLcFrStdCompliancesEnt(mib, this);
                this.mplsLcFrStdGroups = new MplsLcFrStdGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsLcFrStdCompliances,
                    this.mplsLcFrStdGroups
                };
            }
            public static final class MplsLcFrStdCompliancesEnt extends MIBEntry<MPLSLCFRSTDMIBDef>
            {
                /** Compliance requirement for full compliance*/
                public final MplsLcFrStdModuleFullComplianceEnt mplsLcFrStdModuleFullCompliance;

                /** Compliance requirement for read-only implementations.*/
                public final MplsLcFrStdModuleReadOnlyComplianceEnt mplsLcFrStdModuleReadOnlyCompliance;

                private MplsLcFrStdCompliancesEnt(MPLSLCFRSTDMIBDef mib, MIBEntry<MPLSLCFRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLcFrStdCompliances", "1.3.6.1.2.1.10.166.10.2.1", false, false, false, false);
                    this.mplsLcFrStdModuleFullCompliance = new MplsLcFrStdModuleFullComplianceEnt(mib, this);
                    this.mplsLcFrStdModuleReadOnlyCompliance = new MplsLcFrStdModuleReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLcFrStdModuleFullCompliance,
                        this.mplsLcFrStdModuleReadOnlyCompliance
                    };
                }
                public static final class MplsLcFrStdModuleFullComplianceEnt extends MIBEntry<MPLSLCFRSTDMIBDef>
                {
                    private MplsLcFrStdModuleFullComplianceEnt(MPLSLCFRSTDMIBDef mib, MIBEntry<MPLSLCFRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLcFrStdModuleFullCompliance", "1.3.6.1.2.1.10.166.10.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsLcFrStdModuleReadOnlyComplianceEnt extends MIBEntry<MPLSLCFRSTDMIBDef>
                {
                    private MplsLcFrStdModuleReadOnlyComplianceEnt(MPLSLCFRSTDMIBDef mib, MIBEntry<MPLSLCFRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLcFrStdModuleReadOnlyCompliance", "1.3.6.1.2.1.10.166.10.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MplsLcFrStdGroupsEnt extends MIBEntry<MPLSLCFRSTDMIBDef>
            {
                /** Units of conformance.*/
                public final MplsLcFrStdIfGroupEnt mplsLcFrStdIfGroup;

                private MplsLcFrStdGroupsEnt(MPLSLCFRSTDMIBDef mib, MIBEntry<MPLSLCFRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLcFrStdGroups", "1.3.6.1.2.1.10.166.10.2.2", false, false, false, false);
                    this.mplsLcFrStdIfGroup = new MplsLcFrStdIfGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLcFrStdIfGroup
                    };
                }
                public static final class MplsLcFrStdIfGroupEnt extends MIBEntry<MPLSLCFRSTDMIBDef>
                {
                    private MplsLcFrStdIfGroupEnt(MPLSLCFRSTDMIBDef mib, MIBEntry<MPLSLCFRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLcFrStdIfGroup", "1.3.6.1.2.1.10.166.10.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
