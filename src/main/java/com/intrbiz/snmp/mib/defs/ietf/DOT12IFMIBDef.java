package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class DOT12IFMIBDef extends MIB
{
    public static final DOT12IFMIBDef DOT12IFMIB = new DOT12IFMIBDef();

    static { MIBs.getInstance().registerMIB(DOT12IFMIBDef.DOT12IFMIB); }

    /** February 22, 1996*/
    public final Dot12MIBEnt dot12MIB;

    private DOT12IFMIBDef()
    {
        super("DOT12-IF-MIB");
        this.dot12MIB = new Dot12MIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dot12MIB
        };
    }

    public static final class Dot12MIBEnt extends MIBEntry<DOT12IFMIBDef>
    {
        public final Dot12MIBObjectsEnt dot12MIBObjects;

        /** conformance information*/
        public final Dot12ConformanceEnt dot12Conformance;

        private Dot12MIBEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
        {
            super(mib, parent, "dot12MIB", "1.3.6.1.2.1.10.45", false, false, false, false);
            this.dot12MIBObjects = new Dot12MIBObjectsEnt(mib, this);
            this.dot12Conformance = new Dot12ConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dot12MIBObjects,
                this.dot12Conformance
            };
        }
        public static final class Dot12MIBObjectsEnt extends MIBEntry<DOT12IFMIBDef>
        {
            public final Dot12ConfigTableEnt dot12ConfigTable;

            public final Dot12StatTableEnt dot12StatTable;

            private Dot12MIBObjectsEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
            {
                super(mib, parent, "dot12MIBObjects", "1.3.6.1.2.1.10.45.1", false, false, false, false);
                this.dot12ConfigTable = new Dot12ConfigTableEnt(mib, this);
                this.dot12StatTable = new Dot12StatTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot12ConfigTable,
                    this.dot12StatTable
                };
            }
            public static final class Dot12ConfigTableEnt extends MIBEntry<DOT12IFMIBDef>
            {
                public final Dot12ConfigEntryEnt dot12ConfigEntry;

                private Dot12ConfigTableEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                {
                    super(mib, parent, "dot12ConfigTable", "1.3.6.1.2.1.10.45.1.1", false, true, false, false);
                    this.dot12ConfigEntry = new Dot12ConfigEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot12ConfigEntry
                    };
                }
                public static final class Dot12ConfigEntryEnt extends MIBEntry<DOT12IFMIBDef>
                {
                    public final Dot12CurrentFramingTypeEnt dot12CurrentFramingType;

                    public final Dot12DesiredFramingTypeEnt dot12DesiredFramingType;

                    public final Dot12FramingCapabilityEnt dot12FramingCapability;

                    public final Dot12DesiredPromiscStatusEnt dot12DesiredPromiscStatus;

                    public final Dot12TrainingVersionEnt dot12TrainingVersion;

                    public final Dot12LastTrainingConfigEnt dot12LastTrainingConfig;

                    public final Dot12CommandsEnt dot12Commands;

                    public final Dot12StatusEnt dot12Status;

                    public final Dot12ControlModeEnt dot12ControlMode;

                    private Dot12ConfigEntryEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                    {
                        super(mib, parent, "dot12ConfigEntry", "1.3.6.1.2.1.10.45.1.1.1", false, false, false, true);
                        this.dot12CurrentFramingType = new Dot12CurrentFramingTypeEnt(mib, this);
                        this.dot12DesiredFramingType = new Dot12DesiredFramingTypeEnt(mib, this);
                        this.dot12FramingCapability = new Dot12FramingCapabilityEnt(mib, this);
                        this.dot12DesiredPromiscStatus = new Dot12DesiredPromiscStatusEnt(mib, this);
                        this.dot12TrainingVersion = new Dot12TrainingVersionEnt(mib, this);
                        this.dot12LastTrainingConfig = new Dot12LastTrainingConfigEnt(mib, this);
                        this.dot12Commands = new Dot12CommandsEnt(mib, this);
                        this.dot12Status = new Dot12StatusEnt(mib, this);
                        this.dot12ControlMode = new Dot12ControlModeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot12CurrentFramingType,
                            this.dot12DesiredFramingType,
                            this.dot12FramingCapability,
                            this.dot12DesiredPromiscStatus,
                            this.dot12TrainingVersion,
                            this.dot12LastTrainingConfig,
                            this.dot12Commands,
                            this.dot12Status,
                            this.dot12ControlMode
                        };
                    }
                    public static final class Dot12CurrentFramingTypeEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12CurrentFramingTypeEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12CurrentFramingType", "1.3.6.1.2.1.10.45.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12DesiredFramingTypeEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12DesiredFramingTypeEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12DesiredFramingType", "1.3.6.1.2.1.10.45.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12FramingCapabilityEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12FramingCapabilityEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12FramingCapability", "1.3.6.1.2.1.10.45.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12DesiredPromiscStatusEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12DesiredPromiscStatusEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12DesiredPromiscStatus", "1.3.6.1.2.1.10.45.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12TrainingVersionEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12TrainingVersionEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12TrainingVersion", "1.3.6.1.2.1.10.45.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12LastTrainingConfigEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12LastTrainingConfigEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12LastTrainingConfig", "1.3.6.1.2.1.10.45.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12CommandsEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12CommandsEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12Commands", "1.3.6.1.2.1.10.45.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12StatusEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12StatusEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12Status", "1.3.6.1.2.1.10.45.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12ControlModeEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12ControlModeEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12ControlMode", "1.3.6.1.2.1.10.45.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Dot12StatTableEnt extends MIBEntry<DOT12IFMIBDef>
            {
                public final Dot12StatEntryEnt dot12StatEntry;

                private Dot12StatTableEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                {
                    super(mib, parent, "dot12StatTable", "1.3.6.1.2.1.10.45.1.2", false, true, false, false);
                    this.dot12StatEntry = new Dot12StatEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot12StatEntry
                    };
                }
                public static final class Dot12StatEntryEnt extends MIBEntry<DOT12IFMIBDef>
                {
                    public final Dot12InHighPriorityFramesEnt dot12InHighPriorityFrames;

                    public final Dot12InHighPriorityOctetsEnt dot12InHighPriorityOctets;

                    public final Dot12InNormPriorityFramesEnt dot12InNormPriorityFrames;

                    public final Dot12InNormPriorityOctetsEnt dot12InNormPriorityOctets;

                    public final Dot12InIPMErrorsEnt dot12InIPMErrors;

                    public final Dot12InOversizeFrameErrorsEnt dot12InOversizeFrameErrors;

                    public final Dot12InDataErrorsEnt dot12InDataErrors;

                    public final Dot12InNullAddressedFramesEnt dot12InNullAddressedFrames;

                    public final Dot12OutHighPriorityFramesEnt dot12OutHighPriorityFrames;

                    public final Dot12OutHighPriorityOctetsEnt dot12OutHighPriorityOctets;

                    public final Dot12TransitionIntoTrainingsEnt dot12TransitionIntoTrainings;

                    public final Dot12HCInHighPriorityOctetsEnt dot12HCInHighPriorityOctets;

                    public final Dot12HCInNormPriorityOctetsEnt dot12HCInNormPriorityOctets;

                    public final Dot12HCOutHighPriorityOctetsEnt dot12HCOutHighPriorityOctets;

                    private Dot12StatEntryEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                    {
                        super(mib, parent, "dot12StatEntry", "1.3.6.1.2.1.10.45.1.2.1", false, false, false, true);
                        this.dot12InHighPriorityFrames = new Dot12InHighPriorityFramesEnt(mib, this);
                        this.dot12InHighPriorityOctets = new Dot12InHighPriorityOctetsEnt(mib, this);
                        this.dot12InNormPriorityFrames = new Dot12InNormPriorityFramesEnt(mib, this);
                        this.dot12InNormPriorityOctets = new Dot12InNormPriorityOctetsEnt(mib, this);
                        this.dot12InIPMErrors = new Dot12InIPMErrorsEnt(mib, this);
                        this.dot12InOversizeFrameErrors = new Dot12InOversizeFrameErrorsEnt(mib, this);
                        this.dot12InDataErrors = new Dot12InDataErrorsEnt(mib, this);
                        this.dot12InNullAddressedFrames = new Dot12InNullAddressedFramesEnt(mib, this);
                        this.dot12OutHighPriorityFrames = new Dot12OutHighPriorityFramesEnt(mib, this);
                        this.dot12OutHighPriorityOctets = new Dot12OutHighPriorityOctetsEnt(mib, this);
                        this.dot12TransitionIntoTrainings = new Dot12TransitionIntoTrainingsEnt(mib, this);
                        this.dot12HCInHighPriorityOctets = new Dot12HCInHighPriorityOctetsEnt(mib, this);
                        this.dot12HCInNormPriorityOctets = new Dot12HCInNormPriorityOctetsEnt(mib, this);
                        this.dot12HCOutHighPriorityOctets = new Dot12HCOutHighPriorityOctetsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot12InHighPriorityFrames,
                            this.dot12InHighPriorityOctets,
                            this.dot12InNormPriorityFrames,
                            this.dot12InNormPriorityOctets,
                            this.dot12InIPMErrors,
                            this.dot12InOversizeFrameErrors,
                            this.dot12InDataErrors,
                            this.dot12InNullAddressedFrames,
                            this.dot12OutHighPriorityFrames,
                            this.dot12OutHighPriorityOctets,
                            this.dot12TransitionIntoTrainings,
                            this.dot12HCInHighPriorityOctets,
                            this.dot12HCInNormPriorityOctets,
                            this.dot12HCOutHighPriorityOctets
                        };
                    }
                    public static final class Dot12InHighPriorityFramesEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12InHighPriorityFramesEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12InHighPriorityFrames", "1.3.6.1.2.1.10.45.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12InHighPriorityOctetsEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12InHighPriorityOctetsEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12InHighPriorityOctets", "1.3.6.1.2.1.10.45.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12InNormPriorityFramesEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12InNormPriorityFramesEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12InNormPriorityFrames", "1.3.6.1.2.1.10.45.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12InNormPriorityOctetsEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12InNormPriorityOctetsEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12InNormPriorityOctets", "1.3.6.1.2.1.10.45.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12InIPMErrorsEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12InIPMErrorsEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12InIPMErrors", "1.3.6.1.2.1.10.45.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12InOversizeFrameErrorsEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12InOversizeFrameErrorsEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12InOversizeFrameErrors", "1.3.6.1.2.1.10.45.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12InDataErrorsEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12InDataErrorsEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12InDataErrors", "1.3.6.1.2.1.10.45.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12InNullAddressedFramesEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12InNullAddressedFramesEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12InNullAddressedFrames", "1.3.6.1.2.1.10.45.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12OutHighPriorityFramesEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12OutHighPriorityFramesEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12OutHighPriorityFrames", "1.3.6.1.2.1.10.45.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12OutHighPriorityOctetsEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12OutHighPriorityOctetsEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12OutHighPriorityOctets", "1.3.6.1.2.1.10.45.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12TransitionIntoTrainingsEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12TransitionIntoTrainingsEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12TransitionIntoTrainings", "1.3.6.1.2.1.10.45.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12HCInHighPriorityOctetsEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12HCInHighPriorityOctetsEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12HCInHighPriorityOctets", "1.3.6.1.2.1.10.45.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12HCInNormPriorityOctetsEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12HCInNormPriorityOctetsEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12HCInNormPriorityOctets", "1.3.6.1.2.1.10.45.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot12HCOutHighPriorityOctetsEnt extends MIBEntry<DOT12IFMIBDef>
                    {
                        private Dot12HCOutHighPriorityOctetsEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                        {
                            super(mib, parent, "dot12HCOutHighPriorityOctets", "1.3.6.1.2.1.10.45.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class Dot12ConformanceEnt extends MIBEntry<DOT12IFMIBDef>
        {
            public final Dot12CompliancesEnt dot12Compliances;

            public final Dot12GroupsEnt dot12Groups;

            private Dot12ConformanceEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
            {
                super(mib, parent, "dot12Conformance", "1.3.6.1.2.1.10.45.2", false, false, false, false);
                this.dot12Compliances = new Dot12CompliancesEnt(mib, this);
                this.dot12Groups = new Dot12GroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot12Compliances,
                    this.dot12Groups
                };
            }
            public static final class Dot12CompliancesEnt extends MIBEntry<DOT12IFMIBDef>
            {
                /** compliance statements*/
                public final Dot12ComplianceEnt dot12Compliance;

                private Dot12CompliancesEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                {
                    super(mib, parent, "dot12Compliances", "1.3.6.1.2.1.10.45.2.1", false, false, false, false);
                    this.dot12Compliance = new Dot12ComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot12Compliance
                    };
                }
                public static final class Dot12ComplianceEnt extends MIBEntry<DOT12IFMIBDef>
                {
                    private Dot12ComplianceEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                    {
                        super(mib, parent, "dot12Compliance", "1.3.6.1.2.1.10.45.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Dot12GroupsEnt extends MIBEntry<DOT12IFMIBDef>
            {
                /** units of conformance*/
                public final Dot12ConfigGroupEnt dot12ConfigGroup;

                public final Dot12StatsGroupEnt dot12StatsGroup;

                private Dot12GroupsEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                {
                    super(mib, parent, "dot12Groups", "1.3.6.1.2.1.10.45.2.2", false, false, false, false);
                    this.dot12ConfigGroup = new Dot12ConfigGroupEnt(mib, this);
                    this.dot12StatsGroup = new Dot12StatsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot12ConfigGroup,
                        this.dot12StatsGroup
                    };
                }
                public static final class Dot12ConfigGroupEnt extends MIBEntry<DOT12IFMIBDef>
                {
                    private Dot12ConfigGroupEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                    {
                        super(mib, parent, "dot12ConfigGroup", "1.3.6.1.2.1.10.45.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot12StatsGroupEnt extends MIBEntry<DOT12IFMIBDef>
                {
                    private Dot12StatsGroupEnt(DOT12IFMIBDef mib, MIBEntry<DOT12IFMIBDef> parent)
                    {
                        super(mib, parent, "dot12StatsGroup", "1.3.6.1.2.1.10.45.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
