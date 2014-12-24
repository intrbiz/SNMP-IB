package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class PARALLELMIBDef extends MIB
{
    public static final PARALLELMIBDef PARALLELMIB = new PARALLELMIBDef();

    public final ParaEnt para;

    private PARALLELMIBDef()
    {
        super("PARALLEL-MIB");
        this.para = new ParaEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.para
        };
    }

    public static final class ParaEnt extends MIBEntry<PARALLELMIBDef>
    {
        /** Generic Parallel-printer-like information*/
        public final ParaNumberEnt paraNumber;

        /** the Parallel-printer-like Port table*/
        public final ParaPortTableEnt paraPortTable;

        /** Parallel-printer-like Input Signal Table*/
        public final ParaInSigTableEnt paraInSigTable;

        /** Output Signal Table*/
        public final ParaOutSigTableEnt paraOutSigTable;

        /** conformance information*/
        public final ParaConformanceEnt paraConformance;

        private ParaEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
        {
            super(mib, parent, "para", "1.3.6.1.2.1.10.34", false, false, false, false);
            this.paraNumber = new ParaNumberEnt(mib, this);
            this.paraPortTable = new ParaPortTableEnt(mib, this);
            this.paraInSigTable = new ParaInSigTableEnt(mib, this);
            this.paraOutSigTable = new ParaOutSigTableEnt(mib, this);
            this.paraConformance = new ParaConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.paraNumber,
                this.paraPortTable,
                this.paraInSigTable,
                this.paraOutSigTable,
                this.paraConformance
            };
        }
        public static final class ParaNumberEnt extends MIBEntry<PARALLELMIBDef>
        {
            private ParaNumberEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
            {
                super(mib, parent, "paraNumber", "1.3.6.1.2.1.10.34.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class ParaPortTableEnt extends MIBEntry<PARALLELMIBDef>
        {
            public final ParaPortEntryEnt paraPortEntry;

            private ParaPortTableEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
            {
                super(mib, parent, "paraPortTable", "1.3.6.1.2.1.10.34.2", false, true, false, false);
                this.paraPortEntry = new ParaPortEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.paraPortEntry
                };
            }
            public static final class ParaPortEntryEnt extends MIBEntry<PARALLELMIBDef>
            {
                public final ParaPortIndexEnt paraPortIndex;

                public final ParaPortTypeEnt paraPortType;

                public final ParaPortInSigNumberEnt paraPortInSigNumber;

                public final ParaPortOutSigNumberEnt paraPortOutSigNumber;

                private ParaPortEntryEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                {
                    super(mib, parent, "paraPortEntry", "1.3.6.1.2.1.10.34.2.1", false, false, false, true);
                    this.paraPortIndex = new ParaPortIndexEnt(mib, this);
                    this.paraPortType = new ParaPortTypeEnt(mib, this);
                    this.paraPortInSigNumber = new ParaPortInSigNumberEnt(mib, this);
                    this.paraPortOutSigNumber = new ParaPortOutSigNumberEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.paraPortIndex,
                        this.paraPortType,
                        this.paraPortInSigNumber,
                        this.paraPortOutSigNumber
                    };
                }
                public static final class ParaPortIndexEnt extends MIBEntry<PARALLELMIBDef>
                {
                    private ParaPortIndexEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                    {
                        super(mib, parent, "paraPortIndex", "1.3.6.1.2.1.10.34.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ParaPortTypeEnt extends MIBEntry<PARALLELMIBDef>
                {
                    private ParaPortTypeEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                    {
                        super(mib, parent, "paraPortType", "1.3.6.1.2.1.10.34.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ParaPortInSigNumberEnt extends MIBEntry<PARALLELMIBDef>
                {
                    private ParaPortInSigNumberEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                    {
                        super(mib, parent, "paraPortInSigNumber", "1.3.6.1.2.1.10.34.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ParaPortOutSigNumberEnt extends MIBEntry<PARALLELMIBDef>
                {
                    private ParaPortOutSigNumberEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                    {
                        super(mib, parent, "paraPortOutSigNumber", "1.3.6.1.2.1.10.34.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class ParaInSigTableEnt extends MIBEntry<PARALLELMIBDef>
        {
            public final ParaInSigEntryEnt paraInSigEntry;

            private ParaInSigTableEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
            {
                super(mib, parent, "paraInSigTable", "1.3.6.1.2.1.10.34.3", false, true, false, false);
                this.paraInSigEntry = new ParaInSigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.paraInSigEntry
                };
            }
            public static final class ParaInSigEntryEnt extends MIBEntry<PARALLELMIBDef>
            {
                public final ParaInSigPortIndexEnt paraInSigPortIndex;

                public final ParaInSigNameEnt paraInSigName;

                public final ParaInSigStateEnt paraInSigState;

                public final ParaInSigChangesEnt paraInSigChanges;

                private ParaInSigEntryEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                {
                    super(mib, parent, "paraInSigEntry", "1.3.6.1.2.1.10.34.3.1", false, false, false, true);
                    this.paraInSigPortIndex = new ParaInSigPortIndexEnt(mib, this);
                    this.paraInSigName = new ParaInSigNameEnt(mib, this);
                    this.paraInSigState = new ParaInSigStateEnt(mib, this);
                    this.paraInSigChanges = new ParaInSigChangesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.paraInSigPortIndex,
                        this.paraInSigName,
                        this.paraInSigState,
                        this.paraInSigChanges
                    };
                }
                public static final class ParaInSigPortIndexEnt extends MIBEntry<PARALLELMIBDef>
                {
                    private ParaInSigPortIndexEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                    {
                        super(mib, parent, "paraInSigPortIndex", "1.3.6.1.2.1.10.34.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ParaInSigNameEnt extends MIBEntry<PARALLELMIBDef>
                {
                    private ParaInSigNameEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                    {
                        super(mib, parent, "paraInSigName", "1.3.6.1.2.1.10.34.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ParaInSigStateEnt extends MIBEntry<PARALLELMIBDef>
                {
                    private ParaInSigStateEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                    {
                        super(mib, parent, "paraInSigState", "1.3.6.1.2.1.10.34.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ParaInSigChangesEnt extends MIBEntry<PARALLELMIBDef>
                {
                    private ParaInSigChangesEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                    {
                        super(mib, parent, "paraInSigChanges", "1.3.6.1.2.1.10.34.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class ParaOutSigTableEnt extends MIBEntry<PARALLELMIBDef>
        {
            public final ParaOutSigEntryEnt paraOutSigEntry;

            private ParaOutSigTableEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
            {
                super(mib, parent, "paraOutSigTable", "1.3.6.1.2.1.10.34.4", false, true, false, false);
                this.paraOutSigEntry = new ParaOutSigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.paraOutSigEntry
                };
            }
            public static final class ParaOutSigEntryEnt extends MIBEntry<PARALLELMIBDef>
            {
                public final ParaOutSigPortIndexEnt paraOutSigPortIndex;

                public final ParaOutSigNameEnt paraOutSigName;

                public final ParaOutSigStateEnt paraOutSigState;

                public final ParaOutSigChangesEnt paraOutSigChanges;

                private ParaOutSigEntryEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                {
                    super(mib, parent, "paraOutSigEntry", "1.3.6.1.2.1.10.34.4.1", false, false, false, true);
                    this.paraOutSigPortIndex = new ParaOutSigPortIndexEnt(mib, this);
                    this.paraOutSigName = new ParaOutSigNameEnt(mib, this);
                    this.paraOutSigState = new ParaOutSigStateEnt(mib, this);
                    this.paraOutSigChanges = new ParaOutSigChangesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.paraOutSigPortIndex,
                        this.paraOutSigName,
                        this.paraOutSigState,
                        this.paraOutSigChanges
                    };
                }
                public static final class ParaOutSigPortIndexEnt extends MIBEntry<PARALLELMIBDef>
                {
                    private ParaOutSigPortIndexEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                    {
                        super(mib, parent, "paraOutSigPortIndex", "1.3.6.1.2.1.10.34.4.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ParaOutSigNameEnt extends MIBEntry<PARALLELMIBDef>
                {
                    private ParaOutSigNameEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                    {
                        super(mib, parent, "paraOutSigName", "1.3.6.1.2.1.10.34.4.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ParaOutSigStateEnt extends MIBEntry<PARALLELMIBDef>
                {
                    private ParaOutSigStateEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                    {
                        super(mib, parent, "paraOutSigState", "1.3.6.1.2.1.10.34.4.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ParaOutSigChangesEnt extends MIBEntry<PARALLELMIBDef>
                {
                    private ParaOutSigChangesEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                    {
                        super(mib, parent, "paraOutSigChanges", "1.3.6.1.2.1.10.34.4.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class ParaConformanceEnt extends MIBEntry<PARALLELMIBDef>
        {
            public final ParaGroupsEnt paraGroups;

            public final ParaCompliancesEnt paraCompliances;

            private ParaConformanceEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
            {
                super(mib, parent, "paraConformance", "1.3.6.1.2.1.10.34.5", false, false, false, false);
                this.paraGroups = new ParaGroupsEnt(mib, this);
                this.paraCompliances = new ParaCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.paraGroups,
                    this.paraCompliances
                };
            }
            public static final class ParaGroupsEnt extends MIBEntry<PARALLELMIBDef>
            {
                /** units of conformance*/
                public final ParaGroupEnt paraGroup;

                private ParaGroupsEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                {
                    super(mib, parent, "paraGroups", "1.3.6.1.2.1.10.34.5.1", false, false, false, false);
                    this.paraGroup = new ParaGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.paraGroup
                    };
                }
                public static final class ParaGroupEnt extends MIBEntry<PARALLELMIBDef>
                {
                    private ParaGroupEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                    {
                        super(mib, parent, "paraGroup", "1.3.6.1.2.1.10.34.5.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class ParaCompliancesEnt extends MIBEntry<PARALLELMIBDef>
            {
                /** compliance statements*/
                public final ParaComplianceEnt paraCompliance;

                private ParaCompliancesEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                {
                    super(mib, parent, "paraCompliances", "1.3.6.1.2.1.10.34.5.2", false, false, false, false);
                    this.paraCompliance = new ParaComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.paraCompliance
                    };
                }
                public static final class ParaComplianceEnt extends MIBEntry<PARALLELMIBDef>
                {
                    private ParaComplianceEnt(PARALLELMIBDef mib, MIBEntry<PARALLELMIBDef> parent)
                    {
                        super(mib, parent, "paraCompliance", "1.3.6.1.2.1.10.34.5.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
