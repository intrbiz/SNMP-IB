package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class POLICYBASEDMANAGEMENTMIBDef extends MIB
{
    public static final POLICYBASEDMANAGEMENTMIBDef POLICYBASEDMANAGEMENTMIB = new POLICYBASEDMANAGEMENTMIBDef();

    static { MIBs.getInstance().registerMIB(POLICYBASEDMANAGEMENTMIBDef.POLICYBASEDMANAGEMENTMIB); }

    /** Policy-Based Management MIB

February 7, 2005*/
    public final PmMibEnt pmMib;

    private POLICYBASEDMANAGEMENTMIBDef()
    {
        super("POLICY-BASED-MANAGEMENT-MIB");
        this.pmMib = new PmMibEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.pmMib
        };
    }

    public static final class PmMibEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
    {
        /** The policy table*/
        public final PmPolicyTableEnt pmPolicyTable;

        /** Policy Code Table*/
        public final PmPolicyCodeTableEnt pmPolicyCodeTable;

        /** Element Type Registration Table*/
        public final PmElementTypeRegTableEnt pmElementTypeRegTable;

        /** Role Table*/
        public final PmRoleTableEnt pmRoleTable;

        /** Capabilities table*/
        public final PmCapabilitiesTableEnt pmCapabilitiesTable;

        /** Capabilities override table*/
        public final PmCapabilitiesOverrideTableEnt pmCapabilitiesOverrideTable;

        /** The Schedule Group*/
        public final PmSchedLocalTimeEnt pmSchedLocalTime;

        /** The schedule table that controls the scheduler.*/
        public final PmSchedTableEnt pmSchedTable;

        /** Policy Tracking
The "policy to element" (PE) table and the "element to policy" (EP)table track the status of execution contexts grouped by policy andelement respectively.*/
        public final PmTrackingPETableEnt pmTrackingPETable;

        /** Element to Policy Table*/
        public final PmTrackingEPTableEnt pmTrackingEPTable;

        /** Policy Debugging Table*/
        public final PmDebuggingTableEnt pmDebuggingTable;

        /** Notifications*/
        public final PmNotificationsEnt pmNotifications;

        /** Compliance Statements*/
        public final PmConformanceEnt pmConformance;

        private PmMibEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
        {
            super(mib, parent, "pmMib", "1.3.6.1.2.1.124", false, false, false, false);
            this.pmPolicyTable = new PmPolicyTableEnt(mib, this);
            this.pmPolicyCodeTable = new PmPolicyCodeTableEnt(mib, this);
            this.pmElementTypeRegTable = new PmElementTypeRegTableEnt(mib, this);
            this.pmRoleTable = new PmRoleTableEnt(mib, this);
            this.pmCapabilitiesTable = new PmCapabilitiesTableEnt(mib, this);
            this.pmCapabilitiesOverrideTable = new PmCapabilitiesOverrideTableEnt(mib, this);
            this.pmSchedLocalTime = new PmSchedLocalTimeEnt(mib, this);
            this.pmSchedTable = new PmSchedTableEnt(mib, this);
            this.pmTrackingPETable = new PmTrackingPETableEnt(mib, this);
            this.pmTrackingEPTable = new PmTrackingEPTableEnt(mib, this);
            this.pmDebuggingTable = new PmDebuggingTableEnt(mib, this);
            this.pmNotifications = new PmNotificationsEnt(mib, this);
            this.pmConformance = new PmConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.pmPolicyTable,
                this.pmPolicyCodeTable,
                this.pmElementTypeRegTable,
                this.pmRoleTable,
                this.pmCapabilitiesTable,
                this.pmCapabilitiesOverrideTable,
                this.pmSchedLocalTime,
                this.pmSchedTable,
                this.pmTrackingPETable,
                this.pmTrackingEPTable,
                this.pmDebuggingTable,
                this.pmNotifications,
                this.pmConformance
            };
        }
        public static final class PmPolicyTableEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
        {
            public final PmPolicyEntryEnt pmPolicyEntry;

            private PmPolicyTableEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
            {
                super(mib, parent, "pmPolicyTable", "1.3.6.1.2.1.124.1", false, true, false, false);
                this.pmPolicyEntry = new PmPolicyEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pmPolicyEntry
                };
            }
            public static final class PmPolicyEntryEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
            {
                public final PmPolicyAdminGroupEnt pmPolicyAdminGroup;

                public final PmPolicyIndexEnt pmPolicyIndex;

                public final PmPolicyPrecedenceGroupEnt pmPolicyPrecedenceGroup;

                public final PmPolicyPrecedenceEnt pmPolicyPrecedence;

                public final PmPolicyScheduleEnt pmPolicySchedule;

                public final PmPolicyElementTypeFilterEnt pmPolicyElementTypeFilter;

                public final PmPolicyConditionScriptIndexEnt pmPolicyConditionScriptIndex;

                public final PmPolicyActionScriptIndexEnt pmPolicyActionScriptIndex;

                public final PmPolicyParametersEnt pmPolicyParameters;

                public final PmPolicyConditionMaxLatencyEnt pmPolicyConditionMaxLatency;

                public final PmPolicyActionMaxLatencyEnt pmPolicyActionMaxLatency;

                public final PmPolicyMaxIterationsEnt pmPolicyMaxIterations;

                public final PmPolicyDescriptionEnt pmPolicyDescription;

                public final PmPolicyMatchesEnt pmPolicyMatches;

                public final PmPolicyAbnormalTerminationsEnt pmPolicyAbnormalTerminations;

                public final PmPolicyExecutionErrorsEnt pmPolicyExecutionErrors;

                public final PmPolicyDebuggingEnt pmPolicyDebugging;

                public final PmPolicyAdminStatusEnt pmPolicyAdminStatus;

                public final PmPolicyStorageTypeEnt pmPolicyStorageType;

                public final PmPolicyRowStatusEnt pmPolicyRowStatus;

                private PmPolicyEntryEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                {
                    super(mib, parent, "pmPolicyEntry", "1.3.6.1.2.1.124.1.1", false, false, false, true);
                    this.pmPolicyAdminGroup = new PmPolicyAdminGroupEnt(mib, this);
                    this.pmPolicyIndex = new PmPolicyIndexEnt(mib, this);
                    this.pmPolicyPrecedenceGroup = new PmPolicyPrecedenceGroupEnt(mib, this);
                    this.pmPolicyPrecedence = new PmPolicyPrecedenceEnt(mib, this);
                    this.pmPolicySchedule = new PmPolicyScheduleEnt(mib, this);
                    this.pmPolicyElementTypeFilter = new PmPolicyElementTypeFilterEnt(mib, this);
                    this.pmPolicyConditionScriptIndex = new PmPolicyConditionScriptIndexEnt(mib, this);
                    this.pmPolicyActionScriptIndex = new PmPolicyActionScriptIndexEnt(mib, this);
                    this.pmPolicyParameters = new PmPolicyParametersEnt(mib, this);
                    this.pmPolicyConditionMaxLatency = new PmPolicyConditionMaxLatencyEnt(mib, this);
                    this.pmPolicyActionMaxLatency = new PmPolicyActionMaxLatencyEnt(mib, this);
                    this.pmPolicyMaxIterations = new PmPolicyMaxIterationsEnt(mib, this);
                    this.pmPolicyDescription = new PmPolicyDescriptionEnt(mib, this);
                    this.pmPolicyMatches = new PmPolicyMatchesEnt(mib, this);
                    this.pmPolicyAbnormalTerminations = new PmPolicyAbnormalTerminationsEnt(mib, this);
                    this.pmPolicyExecutionErrors = new PmPolicyExecutionErrorsEnt(mib, this);
                    this.pmPolicyDebugging = new PmPolicyDebuggingEnt(mib, this);
                    this.pmPolicyAdminStatus = new PmPolicyAdminStatusEnt(mib, this);
                    this.pmPolicyStorageType = new PmPolicyStorageTypeEnt(mib, this);
                    this.pmPolicyRowStatus = new PmPolicyRowStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pmPolicyAdminGroup,
                        this.pmPolicyIndex,
                        this.pmPolicyPrecedenceGroup,
                        this.pmPolicyPrecedence,
                        this.pmPolicySchedule,
                        this.pmPolicyElementTypeFilter,
                        this.pmPolicyConditionScriptIndex,
                        this.pmPolicyActionScriptIndex,
                        this.pmPolicyParameters,
                        this.pmPolicyConditionMaxLatency,
                        this.pmPolicyActionMaxLatency,
                        this.pmPolicyMaxIterations,
                        this.pmPolicyDescription,
                        this.pmPolicyMatches,
                        this.pmPolicyAbnormalTerminations,
                        this.pmPolicyExecutionErrors,
                        this.pmPolicyDebugging,
                        this.pmPolicyAdminStatus,
                        this.pmPolicyStorageType,
                        this.pmPolicyRowStatus
                    };
                }
                public static final class PmPolicyAdminGroupEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyAdminGroupEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyAdminGroup", "1.3.6.1.2.1.124.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyIndexEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyIndexEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyIndex", "1.3.6.1.2.1.124.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyPrecedenceGroupEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyPrecedenceGroupEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyPrecedenceGroup", "1.3.6.1.2.1.124.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyPrecedenceEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyPrecedenceEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyPrecedence", "1.3.6.1.2.1.124.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyScheduleEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyScheduleEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicySchedule", "1.3.6.1.2.1.124.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyElementTypeFilterEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyElementTypeFilterEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyElementTypeFilter", "1.3.6.1.2.1.124.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyConditionScriptIndexEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyConditionScriptIndexEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyConditionScriptIndex", "1.3.6.1.2.1.124.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyActionScriptIndexEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyActionScriptIndexEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyActionScriptIndex", "1.3.6.1.2.1.124.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyParametersEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyParametersEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyParameters", "1.3.6.1.2.1.124.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyConditionMaxLatencyEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyConditionMaxLatencyEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyConditionMaxLatency", "1.3.6.1.2.1.124.1.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyActionMaxLatencyEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyActionMaxLatencyEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyActionMaxLatency", "1.3.6.1.2.1.124.1.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyMaxIterationsEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyMaxIterationsEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyMaxIterations", "1.3.6.1.2.1.124.1.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyDescriptionEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyDescriptionEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyDescription", "1.3.6.1.2.1.124.1.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyMatchesEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyMatchesEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyMatches", "1.3.6.1.2.1.124.1.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyAbnormalTerminationsEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyAbnormalTerminationsEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyAbnormalTerminations", "1.3.6.1.2.1.124.1.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyExecutionErrorsEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyExecutionErrorsEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyExecutionErrors", "1.3.6.1.2.1.124.1.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyDebuggingEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyDebuggingEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyDebugging", "1.3.6.1.2.1.124.1.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyAdminStatusEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyAdminStatusEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyAdminStatus", "1.3.6.1.2.1.124.1.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyStorageTypeEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyStorageTypeEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyStorageType", "1.3.6.1.2.1.124.1.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyRowStatusEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyRowStatusEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyRowStatus", "1.3.6.1.2.1.124.1.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PmPolicyCodeTableEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
        {
            public final PmPolicyCodeEntryEnt pmPolicyCodeEntry;

            private PmPolicyCodeTableEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
            {
                super(mib, parent, "pmPolicyCodeTable", "1.3.6.1.2.1.124.2", false, true, false, false);
                this.pmPolicyCodeEntry = new PmPolicyCodeEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pmPolicyCodeEntry
                };
            }
            public static final class PmPolicyCodeEntryEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
            {
                public final PmPolicyCodeScriptIndexEnt pmPolicyCodeScriptIndex;

                public final PmPolicyCodeSegmentEnt pmPolicyCodeSegment;

                public final PmPolicyCodeTextEnt pmPolicyCodeText;

                public final PmPolicyCodeStatusEnt pmPolicyCodeStatus;

                private PmPolicyCodeEntryEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                {
                    super(mib, parent, "pmPolicyCodeEntry", "1.3.6.1.2.1.124.2.1", false, false, false, true);
                    this.pmPolicyCodeScriptIndex = new PmPolicyCodeScriptIndexEnt(mib, this);
                    this.pmPolicyCodeSegment = new PmPolicyCodeSegmentEnt(mib, this);
                    this.pmPolicyCodeText = new PmPolicyCodeTextEnt(mib, this);
                    this.pmPolicyCodeStatus = new PmPolicyCodeStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pmPolicyCodeScriptIndex,
                        this.pmPolicyCodeSegment,
                        this.pmPolicyCodeText,
                        this.pmPolicyCodeStatus
                    };
                }
                public static final class PmPolicyCodeScriptIndexEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyCodeScriptIndexEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyCodeScriptIndex", "1.3.6.1.2.1.124.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyCodeSegmentEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyCodeSegmentEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyCodeSegment", "1.3.6.1.2.1.124.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyCodeTextEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyCodeTextEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyCodeText", "1.3.6.1.2.1.124.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmPolicyCodeStatusEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyCodeStatusEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyCodeStatus", "1.3.6.1.2.1.124.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PmElementTypeRegTableEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
        {
            public final PmElementTypeRegEntryEnt pmElementTypeRegEntry;

            private PmElementTypeRegTableEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
            {
                super(mib, parent, "pmElementTypeRegTable", "1.3.6.1.2.1.124.3", false, true, false, false);
                this.pmElementTypeRegEntry = new PmElementTypeRegEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pmElementTypeRegEntry
                };
            }
            public static final class PmElementTypeRegEntryEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
            {
                public final PmElementTypeRegOIDPrefixEnt pmElementTypeRegOIDPrefix;

                public final PmElementTypeRegMaxLatencyEnt pmElementTypeRegMaxLatency;

                public final PmElementTypeRegDescriptionEnt pmElementTypeRegDescription;

                public final PmElementTypeRegStorageTypeEnt pmElementTypeRegStorageType;

                public final PmElementTypeRegRowStatusEnt pmElementTypeRegRowStatus;

                private PmElementTypeRegEntryEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                {
                    super(mib, parent, "pmElementTypeRegEntry", "1.3.6.1.2.1.124.3.1", false, false, false, true);
                    this.pmElementTypeRegOIDPrefix = new PmElementTypeRegOIDPrefixEnt(mib, this);
                    this.pmElementTypeRegMaxLatency = new PmElementTypeRegMaxLatencyEnt(mib, this);
                    this.pmElementTypeRegDescription = new PmElementTypeRegDescriptionEnt(mib, this);
                    this.pmElementTypeRegStorageType = new PmElementTypeRegStorageTypeEnt(mib, this);
                    this.pmElementTypeRegRowStatus = new PmElementTypeRegRowStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pmElementTypeRegOIDPrefix,
                        this.pmElementTypeRegMaxLatency,
                        this.pmElementTypeRegDescription,
                        this.pmElementTypeRegStorageType,
                        this.pmElementTypeRegRowStatus
                    };
                }
                public static final class PmElementTypeRegOIDPrefixEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmElementTypeRegOIDPrefixEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmElementTypeRegOIDPrefix", "1.3.6.1.2.1.124.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmElementTypeRegMaxLatencyEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmElementTypeRegMaxLatencyEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmElementTypeRegMaxLatency", "1.3.6.1.2.1.124.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmElementTypeRegDescriptionEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmElementTypeRegDescriptionEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmElementTypeRegDescription", "1.3.6.1.2.1.124.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmElementTypeRegStorageTypeEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmElementTypeRegStorageTypeEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmElementTypeRegStorageType", "1.3.6.1.2.1.124.3.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmElementTypeRegRowStatusEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmElementTypeRegRowStatusEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmElementTypeRegRowStatus", "1.3.6.1.2.1.124.3.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PmRoleTableEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
        {
            public final PmRoleEntryEnt pmRoleEntry;

            private PmRoleTableEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
            {
                super(mib, parent, "pmRoleTable", "1.3.6.1.2.1.124.4", false, true, false, false);
                this.pmRoleEntry = new PmRoleEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pmRoleEntry
                };
            }
            public static final class PmRoleEntryEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
            {
                public final PmRoleElementEnt pmRoleElement;

                public final PmRoleContextNameEnt pmRoleContextName;

                public final PmRoleContextEngineIDEnt pmRoleContextEngineID;

                public final PmRoleStringEnt pmRoleString;

                public final PmRoleStatusEnt pmRoleStatus;

                private PmRoleEntryEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                {
                    super(mib, parent, "pmRoleEntry", "1.3.6.1.2.1.124.4.1", false, false, false, true);
                    this.pmRoleElement = new PmRoleElementEnt(mib, this);
                    this.pmRoleContextName = new PmRoleContextNameEnt(mib, this);
                    this.pmRoleContextEngineID = new PmRoleContextEngineIDEnt(mib, this);
                    this.pmRoleString = new PmRoleStringEnt(mib, this);
                    this.pmRoleStatus = new PmRoleStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pmRoleElement,
                        this.pmRoleContextName,
                        this.pmRoleContextEngineID,
                        this.pmRoleString,
                        this.pmRoleStatus
                    };
                }
                public static final class PmRoleElementEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmRoleElementEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmRoleElement", "1.3.6.1.2.1.124.4.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmRoleContextNameEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmRoleContextNameEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmRoleContextName", "1.3.6.1.2.1.124.4.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmRoleContextEngineIDEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmRoleContextEngineIDEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmRoleContextEngineID", "1.3.6.1.2.1.124.4.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmRoleStringEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmRoleStringEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmRoleString", "1.3.6.1.2.1.124.4.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmRoleStatusEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmRoleStatusEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmRoleStatus", "1.3.6.1.2.1.124.4.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PmCapabilitiesTableEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
        {
            public final PmCapabilitiesEntryEnt pmCapabilitiesEntry;

            private PmCapabilitiesTableEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
            {
                super(mib, parent, "pmCapabilitiesTable", "1.3.6.1.2.1.124.5", false, true, false, false);
                this.pmCapabilitiesEntry = new PmCapabilitiesEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pmCapabilitiesEntry
                };
            }
            public static final class PmCapabilitiesEntryEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
            {
                public final PmCapabilitiesTypeEnt pmCapabilitiesType;

                private PmCapabilitiesEntryEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                {
                    super(mib, parent, "pmCapabilitiesEntry", "1.3.6.1.2.1.124.5.1", false, false, false, true);
                    this.pmCapabilitiesType = new PmCapabilitiesTypeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pmCapabilitiesType
                    };
                }
                public static final class PmCapabilitiesTypeEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmCapabilitiesTypeEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmCapabilitiesType", "1.3.6.1.2.1.124.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PmCapabilitiesOverrideTableEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
        {
            public final PmCapabilitiesOverrideEntryEnt pmCapabilitiesOverrideEntry;

            private PmCapabilitiesOverrideTableEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
            {
                super(mib, parent, "pmCapabilitiesOverrideTable", "1.3.6.1.2.1.124.6", false, true, false, false);
                this.pmCapabilitiesOverrideEntry = new PmCapabilitiesOverrideEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pmCapabilitiesOverrideEntry
                };
            }
            public static final class PmCapabilitiesOverrideEntryEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
            {
                public final PmCapabilitiesOverrideTypeEnt pmCapabilitiesOverrideType;

                public final PmCapabilitiesOverrideStateEnt pmCapabilitiesOverrideState;

                public final PmCapabilitiesOverrideRowStatusEnt pmCapabilitiesOverrideRowStatus;

                private PmCapabilitiesOverrideEntryEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                {
                    super(mib, parent, "pmCapabilitiesOverrideEntry", "1.3.6.1.2.1.124.6.1", false, false, false, true);
                    this.pmCapabilitiesOverrideType = new PmCapabilitiesOverrideTypeEnt(mib, this);
                    this.pmCapabilitiesOverrideState = new PmCapabilitiesOverrideStateEnt(mib, this);
                    this.pmCapabilitiesOverrideRowStatus = new PmCapabilitiesOverrideRowStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pmCapabilitiesOverrideType,
                        this.pmCapabilitiesOverrideState,
                        this.pmCapabilitiesOverrideRowStatus
                    };
                }
                public static final class PmCapabilitiesOverrideTypeEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmCapabilitiesOverrideTypeEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmCapabilitiesOverrideType", "1.3.6.1.2.1.124.6.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmCapabilitiesOverrideStateEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmCapabilitiesOverrideStateEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmCapabilitiesOverrideState", "1.3.6.1.2.1.124.6.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmCapabilitiesOverrideRowStatusEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmCapabilitiesOverrideRowStatusEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmCapabilitiesOverrideRowStatus", "1.3.6.1.2.1.124.6.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PmSchedLocalTimeEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
        {
            private PmSchedLocalTimeEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
            {
                super(mib, parent, "pmSchedLocalTime", "1.3.6.1.2.1.124.7", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class PmSchedTableEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
        {
            public final PmSchedEntryEnt pmSchedEntry;

            private PmSchedTableEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
            {
                super(mib, parent, "pmSchedTable", "1.3.6.1.2.1.124.8", false, true, false, false);
                this.pmSchedEntry = new PmSchedEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pmSchedEntry
                };
            }
            public static final class PmSchedEntryEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
            {
                public final PmSchedIndexEnt pmSchedIndex;

                public final PmSchedGroupIndexEnt pmSchedGroupIndex;

                public final PmSchedDescrEnt pmSchedDescr;

                public final PmSchedTimePeriodEnt pmSchedTimePeriod;

                public final PmSchedMonthEnt pmSchedMonth;

                public final PmSchedDayEnt pmSchedDay;

                public final PmSchedWeekDayEnt pmSchedWeekDay;

                /** T000000/T235959*/
                public final PmSchedTimeOfDayEnt pmSchedTimeOfDay;

                public final PmSchedLocalOrUtcEnt pmSchedLocalOrUtc;

                public final PmSchedStorageTypeEnt pmSchedStorageType;

                public final PmSchedRowStatusEnt pmSchedRowStatus;

                private PmSchedEntryEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                {
                    super(mib, parent, "pmSchedEntry", "1.3.6.1.2.1.124.8.1", false, false, false, true);
                    this.pmSchedIndex = new PmSchedIndexEnt(mib, this);
                    this.pmSchedGroupIndex = new PmSchedGroupIndexEnt(mib, this);
                    this.pmSchedDescr = new PmSchedDescrEnt(mib, this);
                    this.pmSchedTimePeriod = new PmSchedTimePeriodEnt(mib, this);
                    this.pmSchedMonth = new PmSchedMonthEnt(mib, this);
                    this.pmSchedDay = new PmSchedDayEnt(mib, this);
                    this.pmSchedWeekDay = new PmSchedWeekDayEnt(mib, this);
                    this.pmSchedTimeOfDay = new PmSchedTimeOfDayEnt(mib, this);
                    this.pmSchedLocalOrUtc = new PmSchedLocalOrUtcEnt(mib, this);
                    this.pmSchedStorageType = new PmSchedStorageTypeEnt(mib, this);
                    this.pmSchedRowStatus = new PmSchedRowStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pmSchedIndex,
                        this.pmSchedGroupIndex,
                        this.pmSchedDescr,
                        this.pmSchedTimePeriod,
                        this.pmSchedMonth,
                        this.pmSchedDay,
                        this.pmSchedWeekDay,
                        this.pmSchedTimeOfDay,
                        this.pmSchedLocalOrUtc,
                        this.pmSchedStorageType,
                        this.pmSchedRowStatus
                    };
                }
                public static final class PmSchedIndexEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmSchedIndexEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmSchedIndex", "1.3.6.1.2.1.124.8.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmSchedGroupIndexEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmSchedGroupIndexEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmSchedGroupIndex", "1.3.6.1.2.1.124.8.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmSchedDescrEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmSchedDescrEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmSchedDescr", "1.3.6.1.2.1.124.8.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmSchedTimePeriodEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmSchedTimePeriodEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmSchedTimePeriod", "1.3.6.1.2.1.124.8.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmSchedMonthEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmSchedMonthEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmSchedMonth", "1.3.6.1.2.1.124.8.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmSchedDayEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmSchedDayEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmSchedDay", "1.3.6.1.2.1.124.8.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmSchedWeekDayEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmSchedWeekDayEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmSchedWeekDay", "1.3.6.1.2.1.124.8.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmSchedTimeOfDayEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmSchedTimeOfDayEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmSchedTimeOfDay", "1.3.6.1.2.1.124.8.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmSchedLocalOrUtcEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmSchedLocalOrUtcEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmSchedLocalOrUtc", "1.3.6.1.2.1.124.8.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmSchedStorageTypeEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmSchedStorageTypeEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmSchedStorageType", "1.3.6.1.2.1.124.8.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmSchedRowStatusEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmSchedRowStatusEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmSchedRowStatus", "1.3.6.1.2.1.124.8.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PmTrackingPETableEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
        {
            public final PmTrackingPEEntryEnt pmTrackingPEEntry;

            private PmTrackingPETableEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
            {
                super(mib, parent, "pmTrackingPETable", "1.3.6.1.2.1.124.9", false, true, false, false);
                this.pmTrackingPEEntry = new PmTrackingPEEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pmTrackingPEEntry
                };
            }
            public static final class PmTrackingPEEntryEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
            {
                public final PmTrackingPEElementEnt pmTrackingPEElement;

                public final PmTrackingPEContextNameEnt pmTrackingPEContextName;

                public final PmTrackingPEContextEngineIDEnt pmTrackingPEContextEngineID;

                public final PmTrackingPEInfoEnt pmTrackingPEInfo;

                private PmTrackingPEEntryEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                {
                    super(mib, parent, "pmTrackingPEEntry", "1.3.6.1.2.1.124.9.1", false, false, false, true);
                    this.pmTrackingPEElement = new PmTrackingPEElementEnt(mib, this);
                    this.pmTrackingPEContextName = new PmTrackingPEContextNameEnt(mib, this);
                    this.pmTrackingPEContextEngineID = new PmTrackingPEContextEngineIDEnt(mib, this);
                    this.pmTrackingPEInfo = new PmTrackingPEInfoEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pmTrackingPEElement,
                        this.pmTrackingPEContextName,
                        this.pmTrackingPEContextEngineID,
                        this.pmTrackingPEInfo
                    };
                }
                public static final class PmTrackingPEElementEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmTrackingPEElementEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmTrackingPEElement", "1.3.6.1.2.1.124.9.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmTrackingPEContextNameEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmTrackingPEContextNameEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmTrackingPEContextName", "1.3.6.1.2.1.124.9.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmTrackingPEContextEngineIDEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmTrackingPEContextEngineIDEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmTrackingPEContextEngineID", "1.3.6.1.2.1.124.9.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmTrackingPEInfoEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmTrackingPEInfoEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmTrackingPEInfo", "1.3.6.1.2.1.124.9.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PmTrackingEPTableEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
        {
            public final PmTrackingEPEntryEnt pmTrackingEPEntry;

            private PmTrackingEPTableEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
            {
                super(mib, parent, "pmTrackingEPTable", "1.3.6.1.2.1.124.10", false, true, false, false);
                this.pmTrackingEPEntry = new PmTrackingEPEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pmTrackingEPEntry
                };
            }
            public static final class PmTrackingEPEntryEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
            {
                public final PmTrackingEPElementEnt pmTrackingEPElement;

                public final PmTrackingEPContextNameEnt pmTrackingEPContextName;

                public final PmTrackingEPContextEngineIDEnt pmTrackingEPContextEngineID;

                public final PmTrackingEPStatusEnt pmTrackingEPStatus;

                private PmTrackingEPEntryEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                {
                    super(mib, parent, "pmTrackingEPEntry", "1.3.6.1.2.1.124.10.1", false, false, false, true);
                    this.pmTrackingEPElement = new PmTrackingEPElementEnt(mib, this);
                    this.pmTrackingEPContextName = new PmTrackingEPContextNameEnt(mib, this);
                    this.pmTrackingEPContextEngineID = new PmTrackingEPContextEngineIDEnt(mib, this);
                    this.pmTrackingEPStatus = new PmTrackingEPStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pmTrackingEPElement,
                        this.pmTrackingEPContextName,
                        this.pmTrackingEPContextEngineID,
                        this.pmTrackingEPStatus
                    };
                }
                public static final class PmTrackingEPElementEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmTrackingEPElementEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmTrackingEPElement", "1.3.6.1.2.1.124.10.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmTrackingEPContextNameEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmTrackingEPContextNameEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmTrackingEPContextName", "1.3.6.1.2.1.124.10.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmTrackingEPContextEngineIDEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmTrackingEPContextEngineIDEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmTrackingEPContextEngineID", "1.3.6.1.2.1.124.10.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmTrackingEPStatusEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmTrackingEPStatusEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmTrackingEPStatus", "1.3.6.1.2.1.124.10.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PmDebuggingTableEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
        {
            public final PmDebuggingEntryEnt pmDebuggingEntry;

            private PmDebuggingTableEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
            {
                super(mib, parent, "pmDebuggingTable", "1.3.6.1.2.1.124.11", false, true, false, false);
                this.pmDebuggingEntry = new PmDebuggingEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pmDebuggingEntry
                };
            }
            public static final class PmDebuggingEntryEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
            {
                public final PmDebuggingElementEnt pmDebuggingElement;

                public final PmDebuggingContextNameEnt pmDebuggingContextName;

                public final PmDebuggingContextEngineIDEnt pmDebuggingContextEngineID;

                public final PmDebuggingLogIndexEnt pmDebuggingLogIndex;

                public final PmDebuggingMessageEnt pmDebuggingMessage;

                private PmDebuggingEntryEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                {
                    super(mib, parent, "pmDebuggingEntry", "1.3.6.1.2.1.124.11.1", false, false, false, true);
                    this.pmDebuggingElement = new PmDebuggingElementEnt(mib, this);
                    this.pmDebuggingContextName = new PmDebuggingContextNameEnt(mib, this);
                    this.pmDebuggingContextEngineID = new PmDebuggingContextEngineIDEnt(mib, this);
                    this.pmDebuggingLogIndex = new PmDebuggingLogIndexEnt(mib, this);
                    this.pmDebuggingMessage = new PmDebuggingMessageEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pmDebuggingElement,
                        this.pmDebuggingContextName,
                        this.pmDebuggingContextEngineID,
                        this.pmDebuggingLogIndex,
                        this.pmDebuggingMessage
                    };
                }
                public static final class PmDebuggingElementEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmDebuggingElementEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmDebuggingElement", "1.3.6.1.2.1.124.11.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmDebuggingContextNameEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmDebuggingContextNameEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmDebuggingContextName", "1.3.6.1.2.1.124.11.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmDebuggingContextEngineIDEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmDebuggingContextEngineIDEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmDebuggingContextEngineID", "1.3.6.1.2.1.124.11.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmDebuggingLogIndexEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmDebuggingLogIndexEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmDebuggingLogIndex", "1.3.6.1.2.1.124.11.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmDebuggingMessageEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmDebuggingMessageEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmDebuggingMessage", "1.3.6.1.2.1.124.11.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PmNotificationsEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
        {
            public final PmNewRoleNotificationEnt pmNewRoleNotification;

            public final PmNewCapabilityNotificationEnt pmNewCapabilityNotification;

            public final PmAbnormalTermNotificationEnt pmAbnormalTermNotification;

            private PmNotificationsEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
            {
                super(mib, parent, "pmNotifications", "1.3.6.1.2.1.124.0", false, false, false, false);
                this.pmNewRoleNotification = new PmNewRoleNotificationEnt(mib, this);
                this.pmNewCapabilityNotification = new PmNewCapabilityNotificationEnt(mib, this);
                this.pmAbnormalTermNotification = new PmAbnormalTermNotificationEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pmNewRoleNotification,
                    this.pmNewCapabilityNotification,
                    this.pmAbnormalTermNotification
                };
            }
            public static final class PmNewRoleNotificationEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
            {
                private PmNewRoleNotificationEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                {
                    super(mib, parent, "pmNewRoleNotification", "1.3.6.1.2.1.124.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PmNewCapabilityNotificationEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
            {
                private PmNewCapabilityNotificationEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                {
                    super(mib, parent, "pmNewCapabilityNotification", "1.3.6.1.2.1.124.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PmAbnormalTermNotificationEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
            {
                private PmAbnormalTermNotificationEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                {
                    super(mib, parent, "pmAbnormalTermNotification", "1.3.6.1.2.1.124.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class PmConformanceEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
        {
            public final PmCompliancesEnt pmCompliances;

            public final PmGroupsEnt pmGroups;

            private PmConformanceEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
            {
                super(mib, parent, "pmConformance", "1.3.6.1.2.1.124.12", false, false, false, false);
                this.pmCompliances = new PmCompliancesEnt(mib, this);
                this.pmGroups = new PmGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pmCompliances,
                    this.pmGroups
                };
            }
            public static final class PmCompliancesEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
            {
                public final PmComplianceEnt pmCompliance;

                private PmCompliancesEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                {
                    super(mib, parent, "pmCompliances", "1.3.6.1.2.1.124.12.1", false, false, false, false);
                    this.pmCompliance = new PmComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pmCompliance
                    };
                }
                public static final class PmComplianceEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmComplianceEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmCompliance", "1.3.6.1.2.1.124.12.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class PmGroupsEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
            {
                public final PmPolicyManagementGroupEnt pmPolicyManagementGroup;

                public final PmSchedGroupEnt pmSchedGroup;

                public final PmNotificationGroupEnt pmNotificationGroup;

                public final PmBaseFunctionLibraryEnt pmBaseFunctionLibrary;

                private PmGroupsEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                {
                    super(mib, parent, "pmGroups", "1.3.6.1.2.1.124.12.2", false, false, false, false);
                    this.pmPolicyManagementGroup = new PmPolicyManagementGroupEnt(mib, this);
                    this.pmSchedGroup = new PmSchedGroupEnt(mib, this);
                    this.pmNotificationGroup = new PmNotificationGroupEnt(mib, this);
                    this.pmBaseFunctionLibrary = new PmBaseFunctionLibraryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pmPolicyManagementGroup,
                        this.pmSchedGroup,
                        this.pmNotificationGroup,
                        this.pmBaseFunctionLibrary
                    };
                }
                public static final class PmPolicyManagementGroupEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmPolicyManagementGroupEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmPolicyManagementGroup", "1.3.6.1.2.1.124.12.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmSchedGroupEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmSchedGroupEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmSchedGroup", "1.3.6.1.2.1.124.12.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmNotificationGroupEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmNotificationGroupEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmNotificationGroup", "1.3.6.1.2.1.124.12.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PmBaseFunctionLibraryEnt extends MIBEntry<POLICYBASEDMANAGEMENTMIBDef>
                {
                    private PmBaseFunctionLibraryEnt(POLICYBASEDMANAGEMENTMIBDef mib, MIBEntry<POLICYBASEDMANAGEMENTMIBDef> parent)
                    {
                        super(mib, parent, "pmBaseFunctionLibrary", "1.3.6.1.2.1.124.12.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
