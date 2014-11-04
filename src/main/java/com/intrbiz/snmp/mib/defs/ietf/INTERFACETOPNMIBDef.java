package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class INTERFACETOPNMIBDef extends MIB
{
    public static final INTERFACETOPNMIBDef INTERFACETOPNMIB = new INTERFACETOPNMIBDef();

    static { MIBs.getInstance().registerMIB(INTERFACETOPNMIBDef.INTERFACETOPNMIB); }

    public final InterfaceTopNMIBEnt interfaceTopNMIB;

    private INTERFACETOPNMIBDef()
    {
        super("INTERFACETOPN-MIB");
        this.interfaceTopNMIB = new InterfaceTopNMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.interfaceTopNMIB
        };
    }

    public static final class InterfaceTopNMIBEnt extends MIBEntry<INTERFACETOPNMIBDef>
    {
        public final InterfaceTopNObjectsEnt interfaceTopNObjects;

        public final InterfaceTopNNotificationsEnt interfaceTopNNotifications;

        public final InterfaceTopNConformanceEnt interfaceTopNConformance;

        private InterfaceTopNMIBEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
        {
            super(mib, parent, "interfaceTopNMIB", "1.3.6.1.2.1.16.27", false, false, false, false);
            this.interfaceTopNObjects = new InterfaceTopNObjectsEnt(mib, this);
            this.interfaceTopNNotifications = new InterfaceTopNNotificationsEnt(mib, this);
            this.interfaceTopNConformance = new InterfaceTopNConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.interfaceTopNObjects,
                this.interfaceTopNNotifications,
                this.interfaceTopNConformance
            };
        }
        public static final class InterfaceTopNObjectsEnt extends MIBEntry<INTERFACETOPNMIBDef>
        {
            /** The Interface Top N group is used to prepare reports thatdescribe a list of interfaces (data sources)ordered by the values of oneof the objects that apply to the interfaces of the respective device.Those objects are defined by standard MIBs. The exact objects thatare supported by the agent are described by interfaceTopNCapsThe objects must be elements in tables indexed only by anInterfaceIndex object.The objects  chosen by the

management station may be sampled over a managementstation-specified time interval, making the report rate based.The management station also specifies the number of interfacesthat are reported.The interfaceTopNControlTable is used to initiate the generationof a report.  The management station may select the parametersof such a report, such as which object, howmany interfaces, and the start & stop times of the sampling.  Whenthe report is prepared, entries are created in theinterfaceTopNTable associated with the relevantinterfaceTopNControlEntry.  These entries are static foreach report after it has been prepared.*/
            public final InterfaceTopNCapsEnt interfaceTopNCaps;

            public final InterfaceTopNControlTableEnt interfaceTopNControlTable;

            /** Interface Top "N" reports*/
            public final InterfaceTopNTableEnt interfaceTopNTable;

            private InterfaceTopNObjectsEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
            {
                super(mib, parent, "interfaceTopNObjects", "1.3.6.1.2.1.16.27.1", false, false, false, false);
                this.interfaceTopNCaps = new InterfaceTopNCapsEnt(mib, this);
                this.interfaceTopNControlTable = new InterfaceTopNControlTableEnt(mib, this);
                this.interfaceTopNTable = new InterfaceTopNTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.interfaceTopNCaps,
                    this.interfaceTopNControlTable,
                    this.interfaceTopNTable
                };
            }
            public static final class InterfaceTopNCapsEnt extends MIBEntry<INTERFACETOPNMIBDef>
            {
                private InterfaceTopNCapsEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                {
                    super(mib, parent, "interfaceTopNCaps", "1.3.6.1.2.1.16.27.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class InterfaceTopNControlTableEnt extends MIBEntry<INTERFACETOPNMIBDef>
            {
                public final InterfaceTopNControlEntryEnt interfaceTopNControlEntry;

                private InterfaceTopNControlTableEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                {
                    super(mib, parent, "interfaceTopNControlTable", "1.3.6.1.2.1.16.27.1.2", false, true, false, false);
                    this.interfaceTopNControlEntry = new InterfaceTopNControlEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.interfaceTopNControlEntry
                    };
                }
                public static final class InterfaceTopNControlEntryEnt extends MIBEntry<INTERFACETOPNMIBDef>
                {
                    public final InterfaceTopNControlIndexEnt interfaceTopNControlIndex;

                    public final InterfaceTopNObjectVariableEnt interfaceTopNObjectVariable;

                    public final InterfaceTopNObjectSampleTypeEnt interfaceTopNObjectSampleType;

                    public final InterfaceTopNNormalizationReqEnt interfaceTopNNormalizationReq;

                    public final InterfaceTopNNormalizationFactorEnt interfaceTopNNormalizationFactor;

                    public final InterfaceTopNTimeRemainingEnt interfaceTopNTimeRemaining;

                    public final InterfaceTopNDurationEnt interfaceTopNDuration;

                    public final InterfaceTopNRequestedSizeEnt interfaceTopNRequestedSize;

                    public final InterfaceTopNGrantedSizeEnt interfaceTopNGrantedSize;

                    public final InterfaceTopNStartTimeEnt interfaceTopNStartTime;

                    public final InterfaceTopNOwnerEnt interfaceTopNOwner;

                    public final InterfaceTopNLastCompletionTimeEnt interfaceTopNLastCompletionTime;

                    public final InterfaceTopNRowStatusEnt interfaceTopNRowStatus;

                    private InterfaceTopNControlEntryEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                    {
                        super(mib, parent, "interfaceTopNControlEntry", "1.3.6.1.2.1.16.27.1.2.1", false, false, false, true);
                        this.interfaceTopNControlIndex = new InterfaceTopNControlIndexEnt(mib, this);
                        this.interfaceTopNObjectVariable = new InterfaceTopNObjectVariableEnt(mib, this);
                        this.interfaceTopNObjectSampleType = new InterfaceTopNObjectSampleTypeEnt(mib, this);
                        this.interfaceTopNNormalizationReq = new InterfaceTopNNormalizationReqEnt(mib, this);
                        this.interfaceTopNNormalizationFactor = new InterfaceTopNNormalizationFactorEnt(mib, this);
                        this.interfaceTopNTimeRemaining = new InterfaceTopNTimeRemainingEnt(mib, this);
                        this.interfaceTopNDuration = new InterfaceTopNDurationEnt(mib, this);
                        this.interfaceTopNRequestedSize = new InterfaceTopNRequestedSizeEnt(mib, this);
                        this.interfaceTopNGrantedSize = new InterfaceTopNGrantedSizeEnt(mib, this);
                        this.interfaceTopNStartTime = new InterfaceTopNStartTimeEnt(mib, this);
                        this.interfaceTopNOwner = new InterfaceTopNOwnerEnt(mib, this);
                        this.interfaceTopNLastCompletionTime = new InterfaceTopNLastCompletionTimeEnt(mib, this);
                        this.interfaceTopNRowStatus = new InterfaceTopNRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.interfaceTopNControlIndex,
                            this.interfaceTopNObjectVariable,
                            this.interfaceTopNObjectSampleType,
                            this.interfaceTopNNormalizationReq,
                            this.interfaceTopNNormalizationFactor,
                            this.interfaceTopNTimeRemaining,
                            this.interfaceTopNDuration,
                            this.interfaceTopNRequestedSize,
                            this.interfaceTopNGrantedSize,
                            this.interfaceTopNStartTime,
                            this.interfaceTopNOwner,
                            this.interfaceTopNLastCompletionTime,
                            this.interfaceTopNRowStatus
                        };
                    }
                    public static final class InterfaceTopNControlIndexEnt extends MIBEntry<INTERFACETOPNMIBDef>
                    {
                        private InterfaceTopNControlIndexEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                        {
                            super(mib, parent, "interfaceTopNControlIndex", "1.3.6.1.2.1.16.27.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class InterfaceTopNObjectVariableEnt extends MIBEntry<INTERFACETOPNMIBDef>
                    {
                        private InterfaceTopNObjectVariableEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                        {
                            super(mib, parent, "interfaceTopNObjectVariable", "1.3.6.1.2.1.16.27.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class InterfaceTopNObjectSampleTypeEnt extends MIBEntry<INTERFACETOPNMIBDef>
                    {
                        private InterfaceTopNObjectSampleTypeEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                        {
                            super(mib, parent, "interfaceTopNObjectSampleType", "1.3.6.1.2.1.16.27.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class InterfaceTopNNormalizationReqEnt extends MIBEntry<INTERFACETOPNMIBDef>
                    {
                        private InterfaceTopNNormalizationReqEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                        {
                            super(mib, parent, "interfaceTopNNormalizationReq", "1.3.6.1.2.1.16.27.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class InterfaceTopNNormalizationFactorEnt extends MIBEntry<INTERFACETOPNMIBDef>
                    {
                        private InterfaceTopNNormalizationFactorEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                        {
                            super(mib, parent, "interfaceTopNNormalizationFactor", "1.3.6.1.2.1.16.27.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class InterfaceTopNTimeRemainingEnt extends MIBEntry<INTERFACETOPNMIBDef>
                    {
                        private InterfaceTopNTimeRemainingEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                        {
                            super(mib, parent, "interfaceTopNTimeRemaining", "1.3.6.1.2.1.16.27.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class InterfaceTopNDurationEnt extends MIBEntry<INTERFACETOPNMIBDef>
                    {
                        private InterfaceTopNDurationEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                        {
                            super(mib, parent, "interfaceTopNDuration", "1.3.6.1.2.1.16.27.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class InterfaceTopNRequestedSizeEnt extends MIBEntry<INTERFACETOPNMIBDef>
                    {
                        private InterfaceTopNRequestedSizeEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                        {
                            super(mib, parent, "interfaceTopNRequestedSize", "1.3.6.1.2.1.16.27.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class InterfaceTopNGrantedSizeEnt extends MIBEntry<INTERFACETOPNMIBDef>
                    {
                        private InterfaceTopNGrantedSizeEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                        {
                            super(mib, parent, "interfaceTopNGrantedSize", "1.3.6.1.2.1.16.27.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class InterfaceTopNStartTimeEnt extends MIBEntry<INTERFACETOPNMIBDef>
                    {
                        private InterfaceTopNStartTimeEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                        {
                            super(mib, parent, "interfaceTopNStartTime", "1.3.6.1.2.1.16.27.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class InterfaceTopNOwnerEnt extends MIBEntry<INTERFACETOPNMIBDef>
                    {
                        private InterfaceTopNOwnerEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                        {
                            super(mib, parent, "interfaceTopNOwner", "1.3.6.1.2.1.16.27.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class InterfaceTopNLastCompletionTimeEnt extends MIBEntry<INTERFACETOPNMIBDef>
                    {
                        private InterfaceTopNLastCompletionTimeEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                        {
                            super(mib, parent, "interfaceTopNLastCompletionTime", "1.3.6.1.2.1.16.27.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class InterfaceTopNRowStatusEnt extends MIBEntry<INTERFACETOPNMIBDef>
                    {
                        private InterfaceTopNRowStatusEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                        {
                            super(mib, parent, "interfaceTopNRowStatus", "1.3.6.1.2.1.16.27.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class InterfaceTopNTableEnt extends MIBEntry<INTERFACETOPNMIBDef>
            {
                public final InterfaceTopNEntryEnt interfaceTopNEntry;

                private InterfaceTopNTableEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                {
                    super(mib, parent, "interfaceTopNTable", "1.3.6.1.2.1.16.27.1.3", false, true, false, false);
                    this.interfaceTopNEntry = new InterfaceTopNEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.interfaceTopNEntry
                    };
                }
                public static final class InterfaceTopNEntryEnt extends MIBEntry<INTERFACETOPNMIBDef>
                {
                    public final InterfaceTopNIndexEnt interfaceTopNIndex;

                    public final InterfaceTopNDataSourceIndexEnt interfaceTopNDataSourceIndex;

                    public final InterfaceTopNValueEnt interfaceTopNValue;

                    public final InterfaceTopNValue64Ent interfaceTopNValue64;

                    private InterfaceTopNEntryEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                    {
                        super(mib, parent, "interfaceTopNEntry", "1.3.6.1.2.1.16.27.1.3.1", false, false, false, true);
                        this.interfaceTopNIndex = new InterfaceTopNIndexEnt(mib, this);
                        this.interfaceTopNDataSourceIndex = new InterfaceTopNDataSourceIndexEnt(mib, this);
                        this.interfaceTopNValue = new InterfaceTopNValueEnt(mib, this);
                        this.interfaceTopNValue64 = new InterfaceTopNValue64Ent(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.interfaceTopNIndex,
                            this.interfaceTopNDataSourceIndex,
                            this.interfaceTopNValue,
                            this.interfaceTopNValue64
                        };
                    }
                    public static final class InterfaceTopNIndexEnt extends MIBEntry<INTERFACETOPNMIBDef>
                    {
                        private InterfaceTopNIndexEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                        {
                            super(mib, parent, "interfaceTopNIndex", "1.3.6.1.2.1.16.27.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class InterfaceTopNDataSourceIndexEnt extends MIBEntry<INTERFACETOPNMIBDef>
                    {
                        private InterfaceTopNDataSourceIndexEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                        {
                            super(mib, parent, "interfaceTopNDataSourceIndex", "1.3.6.1.2.1.16.27.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class InterfaceTopNValueEnt extends MIBEntry<INTERFACETOPNMIBDef>
                    {
                        private InterfaceTopNValueEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                        {
                            super(mib, parent, "interfaceTopNValue", "1.3.6.1.2.1.16.27.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class InterfaceTopNValue64Ent extends MIBEntry<INTERFACETOPNMIBDef>
                    {
                        private InterfaceTopNValue64Ent(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                        {
                            super(mib, parent, "interfaceTopNValue64", "1.3.6.1.2.1.16.27.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class InterfaceTopNNotificationsEnt extends MIBEntry<INTERFACETOPNMIBDef>
        {
            private InterfaceTopNNotificationsEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
            {
                super(mib, parent, "interfaceTopNNotifications", "1.3.6.1.2.1.16.27.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class InterfaceTopNConformanceEnt extends MIBEntry<INTERFACETOPNMIBDef>
        {
            /** Notifications Section(none defined)
Conformance Section*/
            public final InterfaceTopNCompliancesEnt interfaceTopNCompliances;

            public final InterfaceTopNGroupsEnt interfaceTopNGroups;

            private InterfaceTopNConformanceEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
            {
                super(mib, parent, "interfaceTopNConformance", "1.3.6.1.2.1.16.27.3", false, false, false, false);
                this.interfaceTopNCompliances = new InterfaceTopNCompliancesEnt(mib, this);
                this.interfaceTopNGroups = new InterfaceTopNGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.interfaceTopNCompliances,
                    this.interfaceTopNGroups
                };
            }
            public static final class InterfaceTopNCompliancesEnt extends MIBEntry<INTERFACETOPNMIBDef>
            {
                public final InterfaceTopNComplianceEnt interfaceTopNCompliance;

                private InterfaceTopNCompliancesEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                {
                    super(mib, parent, "interfaceTopNCompliances", "1.3.6.1.2.1.16.27.3.1", false, false, false, false);
                    this.interfaceTopNCompliance = new InterfaceTopNComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.interfaceTopNCompliance
                    };
                }
                public static final class InterfaceTopNComplianceEnt extends MIBEntry<INTERFACETOPNMIBDef>
                {
                    private InterfaceTopNComplianceEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                    {
                        super(mib, parent, "interfaceTopNCompliance", "1.3.6.1.2.1.16.27.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class InterfaceTopNGroupsEnt extends MIBEntry<INTERFACETOPNMIBDef>
            {
                public final InterfaceTopNGroupEnt interfaceTopNGroup;

                private InterfaceTopNGroupsEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                {
                    super(mib, parent, "interfaceTopNGroups", "1.3.6.1.2.1.16.27.3.2", false, false, false, false);
                    this.interfaceTopNGroup = new InterfaceTopNGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.interfaceTopNGroup
                    };
                }
                public static final class InterfaceTopNGroupEnt extends MIBEntry<INTERFACETOPNMIBDef>
                {
                    private InterfaceTopNGroupEnt(INTERFACETOPNMIBDef mib, MIBEntry<INTERFACETOPNMIBDef> parent)
                    {
                        super(mib, parent, "interfaceTopNGroup", "1.3.6.1.2.1.16.27.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
