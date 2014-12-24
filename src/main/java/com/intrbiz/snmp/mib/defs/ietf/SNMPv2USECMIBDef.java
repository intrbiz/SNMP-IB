package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class SNMPv2USECMIBDef extends MIB
{
    public static final SNMPv2USECMIBDef SNMPv2USECMIB = new SNMPv2USECMIBDef();

    public final UsecMIBEnt usecMIB;

    private SNMPv2USECMIBDef()
    {
        super("SNMPv2-USEC-MIB");
        this.usecMIB = new UsecMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.usecMIB
        };
    }

    public static final class UsecMIBEnt extends MIBEntry<SNMPv2USECMIBDef>
    {
        public final UsecMIBObjectsEnt usecMIBObjects;

        /** conformance information*/
        public final UsecMIBConformanceEnt usecMIBConformance;

        private UsecMIBEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
        {
            super(mib, parent, "usecMIB", "1.3.6.1.6.3.6", false, false, false, false);
            this.usecMIBObjects = new UsecMIBObjectsEnt(mib, this);
            this.usecMIBConformance = new UsecMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.usecMIBObjects,
                this.usecMIBConformance
            };
        }
        public static final class UsecMIBObjectsEnt extends MIBEntry<SNMPv2USECMIBDef>
        {
            /** the USEC Basic groupa collection of objects providing basic instrumentation ofthe SNMPv2 entity implementing the user-based security model*/
            public final UsecAgentEnt usecAgent;

            /** USEC statisticsa collection of objects providing basic instrumentation ofthe SNMPv2 entity implementing the user-based security model*/
            public final UsecStatsEnt usecStats;

            private UsecMIBObjectsEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
            {
                super(mib, parent, "usecMIBObjects", "1.3.6.1.6.3.6.1", false, false, false, false);
                this.usecAgent = new UsecAgentEnt(mib, this);
                this.usecStats = new UsecStatsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.usecAgent,
                    this.usecStats
                };
            }
            public static final class UsecAgentEnt extends MIBEntry<SNMPv2USECMIBDef>
            {
                public final AgentIDEnt agentID;

                public final AgentBootsEnt agentBoots;

                public final AgentTimeEnt agentTime;

                public final AgentSizeEnt agentSize;

                private UsecAgentEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                {
                    super(mib, parent, "usecAgent", "1.3.6.1.6.3.6.1.1", false, false, false, false);
                    this.agentID = new AgentIDEnt(mib, this);
                    this.agentBoots = new AgentBootsEnt(mib, this);
                    this.agentTime = new AgentTimeEnt(mib, this);
                    this.agentSize = new AgentSizeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.agentID,
                        this.agentBoots,
                        this.agentTime,
                        this.agentSize
                    };
                }
                public static final class AgentIDEnt extends MIBEntry<SNMPv2USECMIBDef>
                {
                    private AgentIDEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                    {
                        super(mib, parent, "agentID", "1.3.6.1.6.3.6.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AgentBootsEnt extends MIBEntry<SNMPv2USECMIBDef>
                {
                    private AgentBootsEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                    {
                        super(mib, parent, "agentBoots", "1.3.6.1.6.3.6.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AgentTimeEnt extends MIBEntry<SNMPv2USECMIBDef>
                {
                    private AgentTimeEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                    {
                        super(mib, parent, "agentTime", "1.3.6.1.6.3.6.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AgentSizeEnt extends MIBEntry<SNMPv2USECMIBDef>
                {
                    private AgentSizeEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                    {
                        super(mib, parent, "agentSize", "1.3.6.1.6.3.6.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class UsecStatsEnt extends MIBEntry<SNMPv2USECMIBDef>
            {
                public final UsecStatsUnsupportedQoSEnt usecStatsUnsupportedQoS;

                public final UsecStatsNotInWindowsEnt usecStatsNotInWindows;

                public final UsecStatsUnknownUserNamesEnt usecStatsUnknownUserNames;

                public final UsecStatsWrongDigestValuesEnt usecStatsWrongDigestValues;

                public final UsecStatsUnknownContextsEnt usecStatsUnknownContexts;

                public final UsecStatsBadParametersEnt usecStatsBadParameters;

                public final UsecStatsUnauthorizedOperationsEnt usecStatsUnauthorizedOperations;

                private UsecStatsEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                {
                    super(mib, parent, "usecStats", "1.3.6.1.6.3.6.1.2", false, false, false, false);
                    this.usecStatsUnsupportedQoS = new UsecStatsUnsupportedQoSEnt(mib, this);
                    this.usecStatsNotInWindows = new UsecStatsNotInWindowsEnt(mib, this);
                    this.usecStatsUnknownUserNames = new UsecStatsUnknownUserNamesEnt(mib, this);
                    this.usecStatsWrongDigestValues = new UsecStatsWrongDigestValuesEnt(mib, this);
                    this.usecStatsUnknownContexts = new UsecStatsUnknownContextsEnt(mib, this);
                    this.usecStatsBadParameters = new UsecStatsBadParametersEnt(mib, this);
                    this.usecStatsUnauthorizedOperations = new UsecStatsUnauthorizedOperationsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.usecStatsUnsupportedQoS,
                        this.usecStatsNotInWindows,
                        this.usecStatsUnknownUserNames,
                        this.usecStatsWrongDigestValues,
                        this.usecStatsUnknownContexts,
                        this.usecStatsBadParameters,
                        this.usecStatsUnauthorizedOperations
                    };
                }
                public static final class UsecStatsUnsupportedQoSEnt extends MIBEntry<SNMPv2USECMIBDef>
                {
                    private UsecStatsUnsupportedQoSEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                    {
                        super(mib, parent, "usecStatsUnsupportedQoS", "1.3.6.1.6.3.6.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsecStatsNotInWindowsEnt extends MIBEntry<SNMPv2USECMIBDef>
                {
                    private UsecStatsNotInWindowsEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                    {
                        super(mib, parent, "usecStatsNotInWindows", "1.3.6.1.6.3.6.1.2.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsecStatsUnknownUserNamesEnt extends MIBEntry<SNMPv2USECMIBDef>
                {
                    private UsecStatsUnknownUserNamesEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                    {
                        super(mib, parent, "usecStatsUnknownUserNames", "1.3.6.1.6.3.6.1.2.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsecStatsWrongDigestValuesEnt extends MIBEntry<SNMPv2USECMIBDef>
                {
                    private UsecStatsWrongDigestValuesEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                    {
                        super(mib, parent, "usecStatsWrongDigestValues", "1.3.6.1.6.3.6.1.2.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsecStatsUnknownContextsEnt extends MIBEntry<SNMPv2USECMIBDef>
                {
                    private UsecStatsUnknownContextsEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                    {
                        super(mib, parent, "usecStatsUnknownContexts", "1.3.6.1.6.3.6.1.2.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsecStatsBadParametersEnt extends MIBEntry<SNMPv2USECMIBDef>
                {
                    private UsecStatsBadParametersEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                    {
                        super(mib, parent, "usecStatsBadParameters", "1.3.6.1.6.3.6.1.2.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsecStatsUnauthorizedOperationsEnt extends MIBEntry<SNMPv2USECMIBDef>
                {
                    private UsecStatsUnauthorizedOperationsEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                    {
                        super(mib, parent, "usecStatsUnauthorizedOperations", "1.3.6.1.6.3.6.1.2.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class UsecMIBConformanceEnt extends MIBEntry<SNMPv2USECMIBDef>
        {
            public final UsecMIBCompliancesEnt usecMIBCompliances;

            public final UsecMIBGroupsEnt usecMIBGroups;

            private UsecMIBConformanceEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
            {
                super(mib, parent, "usecMIBConformance", "1.3.6.1.6.3.6.2", false, false, false, false);
                this.usecMIBCompliances = new UsecMIBCompliancesEnt(mib, this);
                this.usecMIBGroups = new UsecMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.usecMIBCompliances,
                    this.usecMIBGroups
                };
            }
            public static final class UsecMIBCompliancesEnt extends MIBEntry<SNMPv2USECMIBDef>
            {
                /** compliance statements*/
                public final UsecMIBComplianceEnt usecMIBCompliance;

                private UsecMIBCompliancesEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                {
                    super(mib, parent, "usecMIBCompliances", "1.3.6.1.6.3.6.2.1", false, false, false, false);
                    this.usecMIBCompliance = new UsecMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.usecMIBCompliance
                    };
                }
                public static final class UsecMIBComplianceEnt extends MIBEntry<SNMPv2USECMIBDef>
                {
                    private UsecMIBComplianceEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                    {
                        super(mib, parent, "usecMIBCompliance", "1.3.6.1.6.3.6.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class UsecMIBGroupsEnt extends MIBEntry<SNMPv2USECMIBDef>
            {
                /** units of conformance*/
                public final UsecBasicGroupEnt usecBasicGroup;

                public final UsecStatsGroupEnt usecStatsGroup;

                private UsecMIBGroupsEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                {
                    super(mib, parent, "usecMIBGroups", "1.3.6.1.6.3.6.2.2", false, false, false, false);
                    this.usecBasicGroup = new UsecBasicGroupEnt(mib, this);
                    this.usecStatsGroup = new UsecStatsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.usecBasicGroup,
                        this.usecStatsGroup
                    };
                }
                public static final class UsecBasicGroupEnt extends MIBEntry<SNMPv2USECMIBDef>
                {
                    private UsecBasicGroupEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                    {
                        super(mib, parent, "usecBasicGroup", "1.3.6.1.6.3.6.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsecStatsGroupEnt extends MIBEntry<SNMPv2USECMIBDef>
                {
                    private UsecStatsGroupEnt(SNMPv2USECMIBDef mib, MIBEntry<SNMPv2USECMIBDef> parent)
                    {
                        super(mib, parent, "usecStatsGroup", "1.3.6.1.6.3.6.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
