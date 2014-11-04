package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2579]
[RFC2580]
[RFC2863]
[RFC2864]*/
public final class IFCAPSTACKMIBDef extends MIB
{
    public static final IFCAPSTACKMIBDef IFCAPSTACKMIB = new IFCAPSTACKMIBDef();

    static { MIBs.getInstance().registerMIB(IFCAPSTACKMIBDef.IFCAPSTACKMIB); }

    /** November 07, 2007*/
    public final IfCapStackMIBEnt ifCapStackMIB;

    private IFCAPSTACKMIBDef()
    {
        super("IF-CAP-STACK-MIB");
        this.ifCapStackMIB = new IfCapStackMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ifCapStackMIB
        };
    }

    public static final class IfCapStackMIBEnt extends MIBEntry<IFCAPSTACKMIBDef>
    {
        /** Sections of the moduleStructured as recommended by [RFC4181], seeAppendix D: Suggested OID Layout*/
        public final IfCapStackObjectsEnt ifCapStackObjects;

        public final IfCapStackConformanceEnt ifCapStackConformance;

        private IfCapStackMIBEnt(IFCAPSTACKMIBDef mib, MIBEntry<IFCAPSTACKMIBDef> parent)
        {
            super(mib, parent, "ifCapStackMIB", "1.3.6.1.2.1.166", false, false, false, false);
            this.ifCapStackObjects = new IfCapStackObjectsEnt(mib, this);
            this.ifCapStackConformance = new IfCapStackConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ifCapStackObjects,
                this.ifCapStackConformance
            };
        }
        public static final class IfCapStackObjectsEnt extends MIBEntry<IFCAPSTACKMIBDef>
        {
            /** Groups in the module
ifCapStackTable group*/
            public final IfCapStackTableEnt ifCapStackTable;

            public final IfInvCapStackTableEnt ifInvCapStackTable;

            private IfCapStackObjectsEnt(IFCAPSTACKMIBDef mib, MIBEntry<IFCAPSTACKMIBDef> parent)
            {
                super(mib, parent, "ifCapStackObjects", "1.3.6.1.2.1.166.1", false, false, false, false);
                this.ifCapStackTable = new IfCapStackTableEnt(mib, this);
                this.ifInvCapStackTable = new IfInvCapStackTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ifCapStackTable,
                    this.ifInvCapStackTable
                };
            }
            public static final class IfCapStackTableEnt extends MIBEntry<IFCAPSTACKMIBDef>
            {
                public final IfCapStackEntryEnt ifCapStackEntry;

                private IfCapStackTableEnt(IFCAPSTACKMIBDef mib, MIBEntry<IFCAPSTACKMIBDef> parent)
                {
                    super(mib, parent, "ifCapStackTable", "1.3.6.1.2.1.166.1.1", false, true, false, false);
                    this.ifCapStackEntry = new IfCapStackEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifCapStackEntry
                    };
                }
                public static final class IfCapStackEntryEnt extends MIBEntry<IFCAPSTACKMIBDef>
                {
                    public final IfCapStackStatusEnt ifCapStackStatus;

                    private IfCapStackEntryEnt(IFCAPSTACKMIBDef mib, MIBEntry<IFCAPSTACKMIBDef> parent)
                    {
                        super(mib, parent, "ifCapStackEntry", "1.3.6.1.2.1.166.1.1.1", false, false, false, true);
                        this.ifCapStackStatus = new IfCapStackStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ifCapStackStatus
                        };
                    }
                    public static final class IfCapStackStatusEnt extends MIBEntry<IFCAPSTACKMIBDef>
                    {
                        private IfCapStackStatusEnt(IFCAPSTACKMIBDef mib, MIBEntry<IFCAPSTACKMIBDef> parent)
                        {
                            super(mib, parent, "ifCapStackStatus", "1.3.6.1.2.1.166.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IfInvCapStackTableEnt extends MIBEntry<IFCAPSTACKMIBDef>
            {
                public final IfInvCapStackEntryEnt ifInvCapStackEntry;

                private IfInvCapStackTableEnt(IFCAPSTACKMIBDef mib, MIBEntry<IFCAPSTACKMIBDef> parent)
                {
                    super(mib, parent, "ifInvCapStackTable", "1.3.6.1.2.1.166.1.2", false, true, false, false);
                    this.ifInvCapStackEntry = new IfInvCapStackEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifInvCapStackEntry
                    };
                }
                public static final class IfInvCapStackEntryEnt extends MIBEntry<IFCAPSTACKMIBDef>
                {
                    public final IfInvCapStackStatusEnt ifInvCapStackStatus;

                    private IfInvCapStackEntryEnt(IFCAPSTACKMIBDef mib, MIBEntry<IFCAPSTACKMIBDef> parent)
                    {
                        super(mib, parent, "ifInvCapStackEntry", "1.3.6.1.2.1.166.1.2.1", false, false, false, true);
                        this.ifInvCapStackStatus = new IfInvCapStackStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ifInvCapStackStatus
                        };
                    }
                    public static final class IfInvCapStackStatusEnt extends MIBEntry<IFCAPSTACKMIBDef>
                    {
                        private IfInvCapStackStatusEnt(IFCAPSTACKMIBDef mib, MIBEntry<IFCAPSTACKMIBDef> parent)
                        {
                            super(mib, parent, "ifInvCapStackStatus", "1.3.6.1.2.1.166.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class IfCapStackConformanceEnt extends MIBEntry<IFCAPSTACKMIBDef>
        {
            /** Conformance Statements*/
            public final IfCapStackGroupsEnt ifCapStackGroups;

            public final IfCapStackCompliancesEnt ifCapStackCompliances;

            private IfCapStackConformanceEnt(IFCAPSTACKMIBDef mib, MIBEntry<IFCAPSTACKMIBDef> parent)
            {
                super(mib, parent, "ifCapStackConformance", "1.3.6.1.2.1.166.2", false, false, false, false);
                this.ifCapStackGroups = new IfCapStackGroupsEnt(mib, this);
                this.ifCapStackCompliances = new IfCapStackCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ifCapStackGroups,
                    this.ifCapStackCompliances
                };
            }
            public static final class IfCapStackGroupsEnt extends MIBEntry<IFCAPSTACKMIBDef>
            {
                /** Units of Conformance*/
                public final IfCapStackGroupEnt ifCapStackGroup;

                private IfCapStackGroupsEnt(IFCAPSTACKMIBDef mib, MIBEntry<IFCAPSTACKMIBDef> parent)
                {
                    super(mib, parent, "ifCapStackGroups", "1.3.6.1.2.1.166.2.1", false, false, false, false);
                    this.ifCapStackGroup = new IfCapStackGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifCapStackGroup
                    };
                }
                public static final class IfCapStackGroupEnt extends MIBEntry<IFCAPSTACKMIBDef>
                {
                    private IfCapStackGroupEnt(IFCAPSTACKMIBDef mib, MIBEntry<IFCAPSTACKMIBDef> parent)
                    {
                        super(mib, parent, "ifCapStackGroup", "1.3.6.1.2.1.166.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class IfCapStackCompliancesEnt extends MIBEntry<IFCAPSTACKMIBDef>
            {
                /** Compliance Statements*/
                public final IfCapStackComplianceEnt ifCapStackCompliance;

                private IfCapStackCompliancesEnt(IFCAPSTACKMIBDef mib, MIBEntry<IFCAPSTACKMIBDef> parent)
                {
                    super(mib, parent, "ifCapStackCompliances", "1.3.6.1.2.1.166.2.2", false, false, false, false);
                    this.ifCapStackCompliance = new IfCapStackComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifCapStackCompliance
                    };
                }
                public static final class IfCapStackComplianceEnt extends MIBEntry<IFCAPSTACKMIBDef>
                {
                    private IfCapStackComplianceEnt(IFCAPSTACKMIBDef mib, MIBEntry<IFCAPSTACKMIBDef> parent)
                    {
                        super(mib, parent, "ifCapStackCompliance", "1.3.6.1.2.1.166.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
