package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class DS0BUNDLEMIBDef extends MIB
{
    public static final DS0BUNDLEMIBDef DS0BUNDLEMIB = new DS0BUNDLEMIBDef();

    static { MIBs.getInstance().registerMIB(DS0BUNDLEMIBDef.DS0BUNDLEMIB); }

    /** This is the MIB module for the DS0Bundle Interfaceobjects.*/
    public final Ds0BundleEnt ds0Bundle;

    private DS0BUNDLEMIBDef()
    {
        super("DS0BUNDLE-MIB");
        this.ds0Bundle = new Ds0BundleEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ds0Bundle
        };
    }

    public static final class Ds0BundleEnt extends MIBEntry<DS0BUNDLEMIBDef>
    {
        /** The DS0 Bundle Config GroupImplementation of this group is mandatory for allsystems that use a DS0Bundle Interface.The DS0 Bundle Config Group consists of one table:DS0 Bundle Table
The DS0 Bundle Table*/
        public final Dsx0BundleNextIndexEnt dsx0BundleNextIndex;

        public final Dsx0BundleTableEnt dsx0BundleTable;

        /** The DS0 Bonding Group
Implementation of this group is optional for allsystems that use a DS0Bundle Interface.
The DS0 Bonding Group consists of one table:DS0 Bonding Table
The DS0 Bonding Table*/
        public final Dsx0BondingTableEnt dsx0BondingTable;

        /** conformance information*/
        public final Ds0BundleConformanceEnt ds0BundleConformance;

        private Ds0BundleEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
        {
            super(mib, parent, "ds0Bundle", "1.3.6.1.2.1.10.82", false, false, false, false);
            this.dsx0BundleNextIndex = new Dsx0BundleNextIndexEnt(mib, this);
            this.dsx0BundleTable = new Dsx0BundleTableEnt(mib, this);
            this.dsx0BondingTable = new Dsx0BondingTableEnt(mib, this);
            this.ds0BundleConformance = new Ds0BundleConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dsx0BundleNextIndex,
                this.dsx0BundleTable,
                this.dsx0BondingTable,
                this.ds0BundleConformance
            };
        }
        public static final class Dsx0BundleNextIndexEnt extends MIBEntry<DS0BUNDLEMIBDef>
        {
            private Dsx0BundleNextIndexEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
            {
                super(mib, parent, "dsx0BundleNextIndex", "1.3.6.1.2.1.10.82.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dsx0BundleTableEnt extends MIBEntry<DS0BUNDLEMIBDef>
        {
            public final Dsx0BundleEntryEnt dsx0BundleEntry;

            private Dsx0BundleTableEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
            {
                super(mib, parent, "dsx0BundleTable", "1.3.6.1.2.1.10.82.3", false, true, false, false);
                this.dsx0BundleEntry = new Dsx0BundleEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx0BundleEntry
                };
            }
            public static final class Dsx0BundleEntryEnt extends MIBEntry<DS0BUNDLEMIBDef>
            {
                public final Dsx0BundleIndexEnt dsx0BundleIndex;

                public final Dsx0BundleIfIndexEnt dsx0BundleIfIndex;

                public final Dsx0BundleCircuitIdentifierEnt dsx0BundleCircuitIdentifier;

                public final Dsx0BundleRowStatusEnt dsx0BundleRowStatus;

                private Dsx0BundleEntryEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
                {
                    super(mib, parent, "dsx0BundleEntry", "1.3.6.1.2.1.10.82.3.1", false, false, false, true);
                    this.dsx0BundleIndex = new Dsx0BundleIndexEnt(mib, this);
                    this.dsx0BundleIfIndex = new Dsx0BundleIfIndexEnt(mib, this);
                    this.dsx0BundleCircuitIdentifier = new Dsx0BundleCircuitIdentifierEnt(mib, this);
                    this.dsx0BundleRowStatus = new Dsx0BundleRowStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx0BundleIndex,
                        this.dsx0BundleIfIndex,
                        this.dsx0BundleCircuitIdentifier,
                        this.dsx0BundleRowStatus
                    };
                }
                public static final class Dsx0BundleIndexEnt extends MIBEntry<DS0BUNDLEMIBDef>
                {
                    private Dsx0BundleIndexEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
                    {
                        super(mib, parent, "dsx0BundleIndex", "1.3.6.1.2.1.10.82.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx0BundleIfIndexEnt extends MIBEntry<DS0BUNDLEMIBDef>
                {
                    private Dsx0BundleIfIndexEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
                    {
                        super(mib, parent, "dsx0BundleIfIndex", "1.3.6.1.2.1.10.82.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx0BundleCircuitIdentifierEnt extends MIBEntry<DS0BUNDLEMIBDef>
                {
                    private Dsx0BundleCircuitIdentifierEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
                    {
                        super(mib, parent, "dsx0BundleCircuitIdentifier", "1.3.6.1.2.1.10.82.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx0BundleRowStatusEnt extends MIBEntry<DS0BUNDLEMIBDef>
                {
                    private Dsx0BundleRowStatusEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
                    {
                        super(mib, parent, "dsx0BundleRowStatus", "1.3.6.1.2.1.10.82.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Dsx0BondingTableEnt extends MIBEntry<DS0BUNDLEMIBDef>
        {
            public final Dsx0BondingEntryEnt dsx0BondingEntry;

            private Dsx0BondingTableEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
            {
                super(mib, parent, "dsx0BondingTable", "1.3.6.1.2.1.10.82.1", false, true, false, false);
                this.dsx0BondingEntry = new Dsx0BondingEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsx0BondingEntry
                };
            }
            public static final class Dsx0BondingEntryEnt extends MIBEntry<DS0BUNDLEMIBDef>
            {
                public final Dsx0BondModeEnt dsx0BondMode;

                public final Dsx0BondStatusEnt dsx0BondStatus;

                public final Dsx0BondRowStatusEnt dsx0BondRowStatus;

                private Dsx0BondingEntryEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
                {
                    super(mib, parent, "dsx0BondingEntry", "1.3.6.1.2.1.10.82.1.1", false, false, false, true);
                    this.dsx0BondMode = new Dsx0BondModeEnt(mib, this);
                    this.dsx0BondStatus = new Dsx0BondStatusEnt(mib, this);
                    this.dsx0BondRowStatus = new Dsx0BondRowStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsx0BondMode,
                        this.dsx0BondStatus,
                        this.dsx0BondRowStatus
                    };
                }
                public static final class Dsx0BondModeEnt extends MIBEntry<DS0BUNDLEMIBDef>
                {
                    private Dsx0BondModeEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
                    {
                        super(mib, parent, "dsx0BondMode", "1.3.6.1.2.1.10.82.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx0BondStatusEnt extends MIBEntry<DS0BUNDLEMIBDef>
                {
                    private Dsx0BondStatusEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
                    {
                        super(mib, parent, "dsx0BondStatus", "1.3.6.1.2.1.10.82.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dsx0BondRowStatusEnt extends MIBEntry<DS0BUNDLEMIBDef>
                {
                    private Dsx0BondRowStatusEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
                    {
                        super(mib, parent, "dsx0BondRowStatus", "1.3.6.1.2.1.10.82.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Ds0BundleConformanceEnt extends MIBEntry<DS0BUNDLEMIBDef>
        {
            public final Ds0BundleGroupsEnt ds0BundleGroups;

            public final Ds0BundleCompliancesEnt ds0BundleCompliances;

            private Ds0BundleConformanceEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
            {
                super(mib, parent, "ds0BundleConformance", "1.3.6.1.2.1.10.82.4", false, false, false, false);
                this.ds0BundleGroups = new Ds0BundleGroupsEnt(mib, this);
                this.ds0BundleCompliances = new Ds0BundleCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ds0BundleGroups,
                    this.ds0BundleCompliances
                };
            }
            public static final class Ds0BundleGroupsEnt extends MIBEntry<DS0BUNDLEMIBDef>
            {
                /** units of conformance*/
                public final Ds0BondingGroupEnt ds0BondingGroup;

                public final Ds0BundleConfigGroupEnt ds0BundleConfigGroup;

                private Ds0BundleGroupsEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
                {
                    super(mib, parent, "ds0BundleGroups", "1.3.6.1.2.1.10.82.4.1", false, false, false, false);
                    this.ds0BondingGroup = new Ds0BondingGroupEnt(mib, this);
                    this.ds0BundleConfigGroup = new Ds0BundleConfigGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ds0BondingGroup,
                        this.ds0BundleConfigGroup
                    };
                }
                public static final class Ds0BondingGroupEnt extends MIBEntry<DS0BUNDLEMIBDef>
                {
                    private Ds0BondingGroupEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
                    {
                        super(mib, parent, "ds0BondingGroup", "1.3.6.1.2.1.10.82.4.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ds0BundleConfigGroupEnt extends MIBEntry<DS0BUNDLEMIBDef>
                {
                    private Ds0BundleConfigGroupEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
                    {
                        super(mib, parent, "ds0BundleConfigGroup", "1.3.6.1.2.1.10.82.4.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Ds0BundleCompliancesEnt extends MIBEntry<DS0BUNDLEMIBDef>
            {
                /** compliance statements*/
                public final Ds0BundleComplianceEnt ds0BundleCompliance;

                private Ds0BundleCompliancesEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
                {
                    super(mib, parent, "ds0BundleCompliances", "1.3.6.1.2.1.10.82.4.2", false, false, false, false);
                    this.ds0BundleCompliance = new Ds0BundleComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ds0BundleCompliance
                    };
                }
                public static final class Ds0BundleComplianceEnt extends MIBEntry<DS0BUNDLEMIBDef>
                {
                    private Ds0BundleComplianceEnt(DS0BUNDLEMIBDef mib, MIBEntry<DS0BUNDLEMIBDef> parent)
                    {
                        super(mib, parent, "ds0BundleCompliance", "1.3.6.1.2.1.10.82.4.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
