package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class TOKENRINGSTATIONSRMIBDef extends MIB
{
    public static final TOKENRINGSTATIONSRMIBDef TOKENRINGSTATIONSRMIB = new TOKENRINGSTATIONSRMIBDef();

    static { MIBs.getInstance().registerMIB(TOKENRINGSTATIONSRMIBDef.TOKENRINGSTATIONSRMIB); }

    public final Dot5SrMIBEnt dot5SrMIB;

    private TOKENRINGSTATIONSRMIBDef()
    {
        super("TOKENRING-STATION-SR-MIB");
        this.dot5SrMIB = new Dot5SrMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dot5SrMIB
        };
    }

    public static final class Dot5SrMIBEnt extends MIBEntry<TOKENRINGSTATIONSRMIBDef>
    {
        public final Dot5SrMIBObjectsEnt dot5SrMIBObjects;

        /** conformance information*/
        public final Dot5SrConformanceEnt dot5SrConformance;

        private Dot5SrMIBEnt(TOKENRINGSTATIONSRMIBDef mib, MIBEntry<TOKENRINGSTATIONSRMIBDef> parent)
        {
            super(mib, parent, "dot5SrMIB", "1.3.6.1.2.1.42", false, false, false, false);
            this.dot5SrMIBObjects = new Dot5SrMIBObjectsEnt(mib, this);
            this.dot5SrConformance = new Dot5SrConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dot5SrMIBObjects,
                this.dot5SrConformance
            };
        }
        public static final class Dot5SrMIBObjectsEnt extends MIBEntry<TOKENRINGSTATIONSRMIBDef>
        {
            /** The 802.5 Station Source Route Table*/
            public final Dot5SrRouteTableEnt dot5SrRouteTable;

            private Dot5SrMIBObjectsEnt(TOKENRINGSTATIONSRMIBDef mib, MIBEntry<TOKENRINGSTATIONSRMIBDef> parent)
            {
                super(mib, parent, "dot5SrMIBObjects", "1.3.6.1.2.1.42.1", false, false, false, false);
                this.dot5SrRouteTable = new Dot5SrRouteTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot5SrRouteTable
                };
            }
            public static final class Dot5SrRouteTableEnt extends MIBEntry<TOKENRINGSTATIONSRMIBDef>
            {
                public final Dot5SrRouteEntryEnt dot5SrRouteEntry;

                private Dot5SrRouteTableEnt(TOKENRINGSTATIONSRMIBDef mib, MIBEntry<TOKENRINGSTATIONSRMIBDef> parent)
                {
                    super(mib, parent, "dot5SrRouteTable", "1.3.6.1.2.1.42.1.1", false, true, false, false);
                    this.dot5SrRouteEntry = new Dot5SrRouteEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot5SrRouteEntry
                    };
                }
                public static final class Dot5SrRouteEntryEnt extends MIBEntry<TOKENRINGSTATIONSRMIBDef>
                {
                    public final Dot5SrRouteDestinationEnt dot5SrRouteDestination;

                    public final Dot5SrRouteControlEnt dot5SrRouteControl;

                    public final Dot5SrRouteDescrEnt dot5SrRouteDescr;

                    public final Dot5SrRouteStatusEnt dot5SrRouteStatus;

                    private Dot5SrRouteEntryEnt(TOKENRINGSTATIONSRMIBDef mib, MIBEntry<TOKENRINGSTATIONSRMIBDef> parent)
                    {
                        super(mib, parent, "dot5SrRouteEntry", "1.3.6.1.2.1.42.1.1.1", false, false, false, true);
                        this.dot5SrRouteDestination = new Dot5SrRouteDestinationEnt(mib, this);
                        this.dot5SrRouteControl = new Dot5SrRouteControlEnt(mib, this);
                        this.dot5SrRouteDescr = new Dot5SrRouteDescrEnt(mib, this);
                        this.dot5SrRouteStatus = new Dot5SrRouteStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot5SrRouteDestination,
                            this.dot5SrRouteControl,
                            this.dot5SrRouteDescr,
                            this.dot5SrRouteStatus
                        };
                    }
                    public static final class Dot5SrRouteDestinationEnt extends MIBEntry<TOKENRINGSTATIONSRMIBDef>
                    {
                        private Dot5SrRouteDestinationEnt(TOKENRINGSTATIONSRMIBDef mib, MIBEntry<TOKENRINGSTATIONSRMIBDef> parent)
                        {
                            super(mib, parent, "dot5SrRouteDestination", "1.3.6.1.2.1.42.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot5SrRouteControlEnt extends MIBEntry<TOKENRINGSTATIONSRMIBDef>
                    {
                        private Dot5SrRouteControlEnt(TOKENRINGSTATIONSRMIBDef mib, MIBEntry<TOKENRINGSTATIONSRMIBDef> parent)
                        {
                            super(mib, parent, "dot5SrRouteControl", "1.3.6.1.2.1.42.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot5SrRouteDescrEnt extends MIBEntry<TOKENRINGSTATIONSRMIBDef>
                    {
                        private Dot5SrRouteDescrEnt(TOKENRINGSTATIONSRMIBDef mib, MIBEntry<TOKENRINGSTATIONSRMIBDef> parent)
                        {
                            super(mib, parent, "dot5SrRouteDescr", "1.3.6.1.2.1.42.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot5SrRouteStatusEnt extends MIBEntry<TOKENRINGSTATIONSRMIBDef>
                    {
                        private Dot5SrRouteStatusEnt(TOKENRINGSTATIONSRMIBDef mib, MIBEntry<TOKENRINGSTATIONSRMIBDef> parent)
                        {
                            super(mib, parent, "dot5SrRouteStatus", "1.3.6.1.2.1.42.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class Dot5SrConformanceEnt extends MIBEntry<TOKENRINGSTATIONSRMIBDef>
        {
            public final Dot5SrGroupsEnt dot5SrGroups;

            public final Dot5SrCompliancesEnt dot5SrCompliances;

            private Dot5SrConformanceEnt(TOKENRINGSTATIONSRMIBDef mib, MIBEntry<TOKENRINGSTATIONSRMIBDef> parent)
            {
                super(mib, parent, "dot5SrConformance", "1.3.6.1.2.1.42.2", false, false, false, false);
                this.dot5SrGroups = new Dot5SrGroupsEnt(mib, this);
                this.dot5SrCompliances = new Dot5SrCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot5SrGroups,
                    this.dot5SrCompliances
                };
            }
            public static final class Dot5SrGroupsEnt extends MIBEntry<TOKENRINGSTATIONSRMIBDef>
            {
                /** units of conformance*/
                public final Dot5SrRouteGroupEnt dot5SrRouteGroup;

                private Dot5SrGroupsEnt(TOKENRINGSTATIONSRMIBDef mib, MIBEntry<TOKENRINGSTATIONSRMIBDef> parent)
                {
                    super(mib, parent, "dot5SrGroups", "1.3.6.1.2.1.42.2.1", false, false, false, false);
                    this.dot5SrRouteGroup = new Dot5SrRouteGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot5SrRouteGroup
                    };
                }
                public static final class Dot5SrRouteGroupEnt extends MIBEntry<TOKENRINGSTATIONSRMIBDef>
                {
                    private Dot5SrRouteGroupEnt(TOKENRINGSTATIONSRMIBDef mib, MIBEntry<TOKENRINGSTATIONSRMIBDef> parent)
                    {
                        super(mib, parent, "dot5SrRouteGroup", "1.3.6.1.2.1.42.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Dot5SrCompliancesEnt extends MIBEntry<TOKENRINGSTATIONSRMIBDef>
            {
                /** compliance statements*/
                public final Dot5SrComplianceEnt dot5SrCompliance;

                private Dot5SrCompliancesEnt(TOKENRINGSTATIONSRMIBDef mib, MIBEntry<TOKENRINGSTATIONSRMIBDef> parent)
                {
                    super(mib, parent, "dot5SrCompliances", "1.3.6.1.2.1.42.2.2", false, false, false, false);
                    this.dot5SrCompliance = new Dot5SrComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot5SrCompliance
                    };
                }
                public static final class Dot5SrComplianceEnt extends MIBEntry<TOKENRINGSTATIONSRMIBDef>
                {
                    private Dot5SrComplianceEnt(TOKENRINGSTATIONSRMIBDef mib, MIBEntry<TOKENRINGSTATIONSRMIBDef> parent)
                    {
                        super(mib, parent, "dot5SrCompliance", "1.3.6.1.2.1.42.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
