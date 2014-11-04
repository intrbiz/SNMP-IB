package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2580]*/
public final class ROHCUNCOMPRESSEDMIBDef extends MIB
{
    public static final ROHCUNCOMPRESSEDMIBDef ROHCUNCOMPRESSEDMIB = new ROHCUNCOMPRESSEDMIBDef();

    static { MIBs.getInstance().registerMIB(ROHCUNCOMPRESSEDMIBDef.ROHCUNCOMPRESSEDMIB); }

    /** June 3, 2004*/
    public final RohcUncmprMIBEnt rohcUncmprMIB;

    private ROHCUNCOMPRESSEDMIBDef()
    {
        super("ROHC-UNCOMPRESSED-MIB");
        this.rohcUncmprMIB = new RohcUncmprMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.rohcUncmprMIB
        };
    }

    public static final class RohcUncmprMIBEnt extends MIBEntry<ROHCUNCOMPRESSEDMIBDef>
    {
        /** The groups defined within this MIB module:*/
        public final RohcUncmprObjectsEnt rohcUncmprObjects;

        public final RohcUncmprConformanceEnt rohcUncmprConformance;

        private RohcUncmprMIBEnt(ROHCUNCOMPRESSEDMIBDef mib, MIBEntry<ROHCUNCOMPRESSEDMIBDef> parent)
        {
            super(mib, parent, "rohcUncmprMIB", "1.3.6.1.2.1.113", false, false, false, false);
            this.rohcUncmprObjects = new RohcUncmprObjectsEnt(mib, this);
            this.rohcUncmprConformance = new RohcUncmprConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.rohcUncmprObjects,
                this.rohcUncmprConformance
            };
        }
        public static final class RohcUncmprObjectsEnt extends MIBEntry<ROHCUNCOMPRESSEDMIBDef>
        {
            /** Context TableThe rohcUncmprContextTable lists all contexts per interface

and instance.  It extends the rohcContextTable.*/
            public final RohcUncmprContextTableEnt rohcUncmprContextTable;

            private RohcUncmprObjectsEnt(ROHCUNCOMPRESSEDMIBDef mib, MIBEntry<ROHCUNCOMPRESSEDMIBDef> parent)
            {
                super(mib, parent, "rohcUncmprObjects", "1.3.6.1.2.1.113.1", false, false, false, false);
                this.rohcUncmprContextTable = new RohcUncmprContextTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rohcUncmprContextTable
                };
            }
            public static final class RohcUncmprContextTableEnt extends MIBEntry<ROHCUNCOMPRESSEDMIBDef>
            {
                public final RohcUncmprContextEntryEnt rohcUncmprContextEntry;

                private RohcUncmprContextTableEnt(ROHCUNCOMPRESSEDMIBDef mib, MIBEntry<ROHCUNCOMPRESSEDMIBDef> parent)
                {
                    super(mib, parent, "rohcUncmprContextTable", "1.3.6.1.2.1.113.1.1", false, true, false, false);
                    this.rohcUncmprContextEntry = new RohcUncmprContextEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rohcUncmprContextEntry
                    };
                }
                public static final class RohcUncmprContextEntryEnt extends MIBEntry<ROHCUNCOMPRESSEDMIBDef>
                {
                    public final RohcUncmprContextStateEnt rohcUncmprContextState;

                    public final RohcUncmprContextModeEnt rohcUncmprContextMode;

                    public final RohcUncmprContextACKsEnt rohcUncmprContextACKs;

                    private RohcUncmprContextEntryEnt(ROHCUNCOMPRESSEDMIBDef mib, MIBEntry<ROHCUNCOMPRESSEDMIBDef> parent)
                    {
                        super(mib, parent, "rohcUncmprContextEntry", "1.3.6.1.2.1.113.1.1.1", false, false, false, true);
                        this.rohcUncmprContextState = new RohcUncmprContextStateEnt(mib, this);
                        this.rohcUncmprContextMode = new RohcUncmprContextModeEnt(mib, this);
                        this.rohcUncmprContextACKs = new RohcUncmprContextACKsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rohcUncmprContextState,
                            this.rohcUncmprContextMode,
                            this.rohcUncmprContextACKs
                        };
                    }
                    public static final class RohcUncmprContextStateEnt extends MIBEntry<ROHCUNCOMPRESSEDMIBDef>
                    {
                        private RohcUncmprContextStateEnt(ROHCUNCOMPRESSEDMIBDef mib, MIBEntry<ROHCUNCOMPRESSEDMIBDef> parent)
                        {
                            super(mib, parent, "rohcUncmprContextState", "1.3.6.1.2.1.113.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcUncmprContextModeEnt extends MIBEntry<ROHCUNCOMPRESSEDMIBDef>
                    {
                        private RohcUncmprContextModeEnt(ROHCUNCOMPRESSEDMIBDef mib, MIBEntry<ROHCUNCOMPRESSEDMIBDef> parent)
                        {
                            super(mib, parent, "rohcUncmprContextMode", "1.3.6.1.2.1.113.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcUncmprContextACKsEnt extends MIBEntry<ROHCUNCOMPRESSEDMIBDef>
                    {
                        private RohcUncmprContextACKsEnt(ROHCUNCOMPRESSEDMIBDef mib, MIBEntry<ROHCUNCOMPRESSEDMIBDef> parent)
                        {
                            super(mib, parent, "rohcUncmprContextACKs", "1.3.6.1.2.1.113.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class RohcUncmprConformanceEnt extends MIBEntry<ROHCUNCOMPRESSEDMIBDef>
        {
            /** conformance information*/
            public final RohcUncmprCompliancesEnt rohcUncmprCompliances;

            public final RohcUncmprGroupsEnt rohcUncmprGroups;

            private RohcUncmprConformanceEnt(ROHCUNCOMPRESSEDMIBDef mib, MIBEntry<ROHCUNCOMPRESSEDMIBDef> parent)
            {
                super(mib, parent, "rohcUncmprConformance", "1.3.6.1.2.1.113.2", false, false, false, false);
                this.rohcUncmprCompliances = new RohcUncmprCompliancesEnt(mib, this);
                this.rohcUncmprGroups = new RohcUncmprGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rohcUncmprCompliances,
                    this.rohcUncmprGroups
                };
            }
            public static final class RohcUncmprCompliancesEnt extends MIBEntry<ROHCUNCOMPRESSEDMIBDef>
            {
                /** compliance statements*/
                public final RohcUncmprComplianceEnt rohcUncmprCompliance;

                private RohcUncmprCompliancesEnt(ROHCUNCOMPRESSEDMIBDef mib, MIBEntry<ROHCUNCOMPRESSEDMIBDef> parent)
                {
                    super(mib, parent, "rohcUncmprCompliances", "1.3.6.1.2.1.113.2.1", false, false, false, false);
                    this.rohcUncmprCompliance = new RohcUncmprComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rohcUncmprCompliance
                    };
                }
                public static final class RohcUncmprComplianceEnt extends MIBEntry<ROHCUNCOMPRESSEDMIBDef>
                {
                    private RohcUncmprComplianceEnt(ROHCUNCOMPRESSEDMIBDef mib, MIBEntry<ROHCUNCOMPRESSEDMIBDef> parent)
                    {
                        super(mib, parent, "rohcUncmprCompliance", "1.3.6.1.2.1.113.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class RohcUncmprGroupsEnt extends MIBEntry<ROHCUNCOMPRESSEDMIBDef>
            {
                public final RohcUncmprContextGroupEnt rohcUncmprContextGroup;

                public final RohcUncmprStatisticsGroupEnt rohcUncmprStatisticsGroup;

                private RohcUncmprGroupsEnt(ROHCUNCOMPRESSEDMIBDef mib, MIBEntry<ROHCUNCOMPRESSEDMIBDef> parent)
                {
                    super(mib, parent, "rohcUncmprGroups", "1.3.6.1.2.1.113.2.2", false, false, false, false);
                    this.rohcUncmprContextGroup = new RohcUncmprContextGroupEnt(mib, this);
                    this.rohcUncmprStatisticsGroup = new RohcUncmprStatisticsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rohcUncmprContextGroup,
                        this.rohcUncmprStatisticsGroup
                    };
                }
                public static final class RohcUncmprContextGroupEnt extends MIBEntry<ROHCUNCOMPRESSEDMIBDef>
                {
                    private RohcUncmprContextGroupEnt(ROHCUNCOMPRESSEDMIBDef mib, MIBEntry<ROHCUNCOMPRESSEDMIBDef> parent)
                    {
                        super(mib, parent, "rohcUncmprContextGroup", "1.3.6.1.2.1.113.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RohcUncmprStatisticsGroupEnt extends MIBEntry<ROHCUNCOMPRESSEDMIBDef>
                {
                    private RohcUncmprStatisticsGroupEnt(ROHCUNCOMPRESSEDMIBDef mib, MIBEntry<ROHCUNCOMPRESSEDMIBDef> parent)
                    {
                        super(mib, parent, "rohcUncmprStatisticsGroup", "1.3.6.1.2.1.113.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
