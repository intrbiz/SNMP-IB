package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class IFINVERTEDSTACKMIBDef extends MIB
{
    public static final IFINVERTEDSTACKMIBDef IFINVERTEDSTACKMIB = new IFINVERTEDSTACKMIBDef();

    static { MIBs.getInstance().registerMIB(IFINVERTEDSTACKMIBDef.IFINVERTEDSTACKMIB); }

    public final IfInvertedStackMIBEnt ifInvertedStackMIB;

    private IFINVERTEDSTACKMIBDef()
    {
        super("IF-INVERTED-STACK-MIB");
        this.ifInvertedStackMIB = new IfInvertedStackMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ifInvertedStackMIB
        };
    }

    public static final class IfInvertedStackMIBEnt extends MIBEntry<IFINVERTEDSTACKMIBDef>
    {
        public final IfInvMIBObjectsEnt ifInvMIBObjects;

        private IfInvertedStackMIBEnt(IFINVERTEDSTACKMIBDef mib, MIBEntry<IFINVERTEDSTACKMIBDef> parent)
        {
            super(mib, parent, "ifInvertedStackMIB", "1.3.6.1.2.1.77", false, false, false, false);
            this.ifInvMIBObjects = new IfInvMIBObjectsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ifInvMIBObjects
            };
        }
        public static final class IfInvMIBObjectsEnt extends MIBEntry<IFINVERTEDSTACKMIBDef>
        {
            /** The Inverted Interface Stack Group*/
            public final IfInvStackTableEnt ifInvStackTable;

            /** conformance information*/
            public final IfInvConformanceEnt ifInvConformance;

            private IfInvMIBObjectsEnt(IFINVERTEDSTACKMIBDef mib, MIBEntry<IFINVERTEDSTACKMIBDef> parent)
            {
                super(mib, parent, "ifInvMIBObjects", "1.3.6.1.2.1.77.1", false, false, false, false);
                this.ifInvStackTable = new IfInvStackTableEnt(mib, this);
                this.ifInvConformance = new IfInvConformanceEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ifInvStackTable,
                    this.ifInvConformance
                };
            }
            public static final class IfInvStackTableEnt extends MIBEntry<IFINVERTEDSTACKMIBDef>
            {
                public final IfInvStackEntryEnt ifInvStackEntry;

                private IfInvStackTableEnt(IFINVERTEDSTACKMIBDef mib, MIBEntry<IFINVERTEDSTACKMIBDef> parent)
                {
                    super(mib, parent, "ifInvStackTable", "1.3.6.1.2.1.77.1.1", false, true, false, false);
                    this.ifInvStackEntry = new IfInvStackEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifInvStackEntry
                    };
                }
                public static final class IfInvStackEntryEnt extends MIBEntry<IFINVERTEDSTACKMIBDef>
                {
                    public final IfInvStackStatusEnt ifInvStackStatus;

                    private IfInvStackEntryEnt(IFINVERTEDSTACKMIBDef mib, MIBEntry<IFINVERTEDSTACKMIBDef> parent)
                    {
                        super(mib, parent, "ifInvStackEntry", "1.3.6.1.2.1.77.1.1.1", false, false, false, true);
                        this.ifInvStackStatus = new IfInvStackStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ifInvStackStatus
                        };
                    }
                    public static final class IfInvStackStatusEnt extends MIBEntry<IFINVERTEDSTACKMIBDef>
                    {
                        private IfInvStackStatusEnt(IFINVERTEDSTACKMIBDef mib, MIBEntry<IFINVERTEDSTACKMIBDef> parent)
                        {
                            super(mib, parent, "ifInvStackStatus", "1.3.6.1.2.1.77.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IfInvConformanceEnt extends MIBEntry<IFINVERTEDSTACKMIBDef>
            {
                public final IfInvGroupsEnt ifInvGroups;

                public final IfInvCompliancesEnt ifInvCompliances;

                private IfInvConformanceEnt(IFINVERTEDSTACKMIBDef mib, MIBEntry<IFINVERTEDSTACKMIBDef> parent)
                {
                    super(mib, parent, "ifInvConformance", "1.3.6.1.2.1.77.1.2", false, false, false, false);
                    this.ifInvGroups = new IfInvGroupsEnt(mib, this);
                    this.ifInvCompliances = new IfInvCompliancesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifInvGroups,
                        this.ifInvCompliances
                    };
                }
                public static final class IfInvGroupsEnt extends MIBEntry<IFINVERTEDSTACKMIBDef>
                {
                    /** units of conformance*/
                    public final IfInvStackGroupEnt ifInvStackGroup;

                    private IfInvGroupsEnt(IFINVERTEDSTACKMIBDef mib, MIBEntry<IFINVERTEDSTACKMIBDef> parent)
                    {
                        super(mib, parent, "ifInvGroups", "1.3.6.1.2.1.77.1.2.1", false, false, false, false);
                        this.ifInvStackGroup = new IfInvStackGroupEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ifInvStackGroup
                        };
                    }
                    public static final class IfInvStackGroupEnt extends MIBEntry<IFINVERTEDSTACKMIBDef>
                    {
                        private IfInvStackGroupEnt(IFINVERTEDSTACKMIBDef mib, MIBEntry<IFINVERTEDSTACKMIBDef> parent)
                        {
                            super(mib, parent, "ifInvStackGroup", "1.3.6.1.2.1.77.1.2.1.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class IfInvCompliancesEnt extends MIBEntry<IFINVERTEDSTACKMIBDef>
                {
                    /** compliance statements*/
                    public final IfInvComplianceEnt ifInvCompliance;

                    private IfInvCompliancesEnt(IFINVERTEDSTACKMIBDef mib, MIBEntry<IFINVERTEDSTACKMIBDef> parent)
                    {
                        super(mib, parent, "ifInvCompliances", "1.3.6.1.2.1.77.1.2.2", false, false, false, false);
                        this.ifInvCompliance = new IfInvComplianceEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ifInvCompliance
                        };
                    }
                    public static final class IfInvComplianceEnt extends MIBEntry<IFINVERTEDSTACKMIBDef>
                    {
                        private IfInvComplianceEnt(IFINVERTEDSTACKMIBDef mib, MIBEntry<IFINVERTEDSTACKMIBDef> parent)
                        {
                            super(mib, parent, "ifInvCompliance", "1.3.6.1.2.1.77.1.2.2.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

}
