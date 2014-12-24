package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2579]
[RFC2580]
[RFC2863]
[RFC3289]
[RFC4001]
[RFC3411]*/
public final class IPSECSPDMIBDef extends MIB
{
    public static final IPSECSPDMIBDef IPSECSPDMIB = new IPSECSPDMIBDef();

    /** module identity

7 February 2007*/
    public final SpdMIBEnt spdMIB;

    private IPSECSPDMIBDef()
    {
        super("IPSEC-SPD-MIB");
        this.spdMIB = new SpdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.spdMIB
        };
    }

    public static final class SpdMIBEnt extends MIBEntry<IPSECSPDMIBDef>
    {
        /** groups of related objects*/
        public final SpdConfigObjectsEnt spdConfigObjects;

        public final SpdNotificationObjectsEnt spdNotificationObjects;

        public final SpdConformanceObjectsEnt spdConformanceObjects;

        public final SpdActionsEnt spdActions;

        private SpdMIBEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
        {
            super(mib, parent, "spdMIB", "1.3.6.1.2.1.153", false, false, false, false);
            this.spdConfigObjects = new SpdConfigObjectsEnt(mib, this);
            this.spdNotificationObjects = new SpdNotificationObjectsEnt(mib, this);
            this.spdConformanceObjects = new SpdConformanceObjectsEnt(mib, this);
            this.spdActions = new SpdActionsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.spdConfigObjects,
                this.spdNotificationObjects,
                this.spdConformanceObjects,
                this.spdActions
            };
        }
        public static final class SpdConfigObjectsEnt extends MIBEntry<IPSECSPDMIBDef>
        {
            /** Policy group definitions*/
            public final SpdLocalConfigObjectsEnt spdLocalConfigObjects;

            public final SpdEndpointToGroupTableEnt spdEndpointToGroupTable;

            /** policy group definition table*/
            public final SpdGroupContentsTableEnt spdGroupContentsTable;

            /** policy definition table*/
            public final SpdRuleDefinitionTableEnt spdRuleDefinitionTable;

            /** Policy compound filter definition table*/
            public final SpdCompoundFilterTableEnt spdCompoundFilterTable;

            /** Policy filters in a cf table*/
            public final SpdSubfiltersTableEnt spdSubfiltersTable;

            /** Static Filters*/
            public final SpdStaticFiltersEnt spdStaticFilters;

            /** Policy IP Offset filter definition table*/
            public final SpdIpOffsetFilterTableEnt spdIpOffsetFilterTable;

            /** Time/scheduling filter table*/
            public final SpdTimeFilterTableEnt spdTimeFilterTable;

            /** IPSO protection authority filtering*/
            public final SpdIpsoHeaderFilterTableEnt spdIpsoHeaderFilterTable;

            /** compound actions table*/
            public final SpdCompoundActionTableEnt spdCompoundActionTable;

            /** actions contained within a compound action*/
            public final SpdSubactionsTableEnt spdSubactionsTable;

            /** Static Actions
these are static actions that can be pointed to by thespdRuleDefAction or the spdSubActSubActionName objects todrop, accept, or reject packets.*/
            public final SpdStaticActionsEnt spdStaticActions;

            private SpdConfigObjectsEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
            {
                super(mib, parent, "spdConfigObjects", "1.3.6.1.2.1.153.1", false, false, false, false);
                this.spdLocalConfigObjects = new SpdLocalConfigObjectsEnt(mib, this);
                this.spdEndpointToGroupTable = new SpdEndpointToGroupTableEnt(mib, this);
                this.spdGroupContentsTable = new SpdGroupContentsTableEnt(mib, this);
                this.spdRuleDefinitionTable = new SpdRuleDefinitionTableEnt(mib, this);
                this.spdCompoundFilterTable = new SpdCompoundFilterTableEnt(mib, this);
                this.spdSubfiltersTable = new SpdSubfiltersTableEnt(mib, this);
                this.spdStaticFilters = new SpdStaticFiltersEnt(mib, this);
                this.spdIpOffsetFilterTable = new SpdIpOffsetFilterTableEnt(mib, this);
                this.spdTimeFilterTable = new SpdTimeFilterTableEnt(mib, this);
                this.spdIpsoHeaderFilterTable = new SpdIpsoHeaderFilterTableEnt(mib, this);
                this.spdCompoundActionTable = new SpdCompoundActionTableEnt(mib, this);
                this.spdSubactionsTable = new SpdSubactionsTableEnt(mib, this);
                this.spdStaticActions = new SpdStaticActionsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.spdLocalConfigObjects,
                    this.spdEndpointToGroupTable,
                    this.spdGroupContentsTable,
                    this.spdRuleDefinitionTable,
                    this.spdCompoundFilterTable,
                    this.spdSubfiltersTable,
                    this.spdStaticFilters,
                    this.spdIpOffsetFilterTable,
                    this.spdTimeFilterTable,
                    this.spdIpsoHeaderFilterTable,
                    this.spdCompoundActionTable,
                    this.spdSubactionsTable,
                    this.spdStaticActions
                };
            }
            public static final class SpdLocalConfigObjectsEnt extends MIBEntry<IPSECSPDMIBDef>
            {
                public final SpdIngressPolicyGroupNameEnt spdIngressPolicyGroupName;

                public final SpdEgressPolicyGroupNameEnt spdEgressPolicyGroupName;

                private SpdLocalConfigObjectsEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                {
                    super(mib, parent, "spdLocalConfigObjects", "1.3.6.1.2.1.153.1.1", false, false, false, false);
                    this.spdIngressPolicyGroupName = new SpdIngressPolicyGroupNameEnt(mib, this);
                    this.spdEgressPolicyGroupName = new SpdEgressPolicyGroupNameEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.spdIngressPolicyGroupName,
                        this.spdEgressPolicyGroupName
                    };
                }
                public static final class SpdIngressPolicyGroupNameEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdIngressPolicyGroupNameEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdIngressPolicyGroupName", "1.3.6.1.2.1.153.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdEgressPolicyGroupNameEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdEgressPolicyGroupNameEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdEgressPolicyGroupName", "1.3.6.1.2.1.153.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SpdEndpointToGroupTableEnt extends MIBEntry<IPSECSPDMIBDef>
            {
                public final SpdEndpointToGroupEntryEnt spdEndpointToGroupEntry;

                private SpdEndpointToGroupTableEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                {
                    super(mib, parent, "spdEndpointToGroupTable", "1.3.6.1.2.1.153.1.2", false, true, false, false);
                    this.spdEndpointToGroupEntry = new SpdEndpointToGroupEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.spdEndpointToGroupEntry
                    };
                }
                public static final class SpdEndpointToGroupEntryEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    public final SpdEndGroupDirectionEnt spdEndGroupDirection;

                    public final SpdEndGroupInterfaceEnt spdEndGroupInterface;

                    public final SpdEndGroupNameEnt spdEndGroupName;

                    public final SpdEndGroupLastChangedEnt spdEndGroupLastChanged;

                    public final SpdEndGroupStorageTypeEnt spdEndGroupStorageType;

                    public final SpdEndGroupRowStatusEnt spdEndGroupRowStatus;

                    private SpdEndpointToGroupEntryEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdEndpointToGroupEntry", "1.3.6.1.2.1.153.1.2.1", false, false, false, true);
                        this.spdEndGroupDirection = new SpdEndGroupDirectionEnt(mib, this);
                        this.spdEndGroupInterface = new SpdEndGroupInterfaceEnt(mib, this);
                        this.spdEndGroupName = new SpdEndGroupNameEnt(mib, this);
                        this.spdEndGroupLastChanged = new SpdEndGroupLastChangedEnt(mib, this);
                        this.spdEndGroupStorageType = new SpdEndGroupStorageTypeEnt(mib, this);
                        this.spdEndGroupRowStatus = new SpdEndGroupRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.spdEndGroupDirection,
                            this.spdEndGroupInterface,
                            this.spdEndGroupName,
                            this.spdEndGroupLastChanged,
                            this.spdEndGroupStorageType,
                            this.spdEndGroupRowStatus
                        };
                    }
                    public static final class SpdEndGroupDirectionEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdEndGroupDirectionEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdEndGroupDirection", "1.3.6.1.2.1.153.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdEndGroupInterfaceEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdEndGroupInterfaceEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdEndGroupInterface", "1.3.6.1.2.1.153.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdEndGroupNameEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdEndGroupNameEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdEndGroupName", "1.3.6.1.2.1.153.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdEndGroupLastChangedEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdEndGroupLastChangedEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdEndGroupLastChanged", "1.3.6.1.2.1.153.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdEndGroupStorageTypeEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdEndGroupStorageTypeEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdEndGroupStorageType", "1.3.6.1.2.1.153.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdEndGroupRowStatusEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdEndGroupRowStatusEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdEndGroupRowStatus", "1.3.6.1.2.1.153.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SpdGroupContentsTableEnt extends MIBEntry<IPSECSPDMIBDef>
            {
                public final SpdGroupContentsEntryEnt spdGroupContentsEntry;

                private SpdGroupContentsTableEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                {
                    super(mib, parent, "spdGroupContentsTable", "1.3.6.1.2.1.153.1.3", false, true, false, false);
                    this.spdGroupContentsEntry = new SpdGroupContentsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.spdGroupContentsEntry
                    };
                }
                public static final class SpdGroupContentsEntryEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    public final SpdGroupContNameEnt spdGroupContName;

                    public final SpdGroupContPriorityEnt spdGroupContPriority;

                    public final SpdGroupContFilterEnt spdGroupContFilter;

                    public final SpdGroupContComponentTypeEnt spdGroupContComponentType;

                    public final SpdGroupContComponentNameEnt spdGroupContComponentName;

                    public final SpdGroupContLastChangedEnt spdGroupContLastChanged;

                    public final SpdGroupContStorageTypeEnt spdGroupContStorageType;

                    public final SpdGroupContRowStatusEnt spdGroupContRowStatus;

                    private SpdGroupContentsEntryEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdGroupContentsEntry", "1.3.6.1.2.1.153.1.3.1", false, false, false, true);
                        this.spdGroupContName = new SpdGroupContNameEnt(mib, this);
                        this.spdGroupContPriority = new SpdGroupContPriorityEnt(mib, this);
                        this.spdGroupContFilter = new SpdGroupContFilterEnt(mib, this);
                        this.spdGroupContComponentType = new SpdGroupContComponentTypeEnt(mib, this);
                        this.spdGroupContComponentName = new SpdGroupContComponentNameEnt(mib, this);
                        this.spdGroupContLastChanged = new SpdGroupContLastChangedEnt(mib, this);
                        this.spdGroupContStorageType = new SpdGroupContStorageTypeEnt(mib, this);
                        this.spdGroupContRowStatus = new SpdGroupContRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.spdGroupContName,
                            this.spdGroupContPriority,
                            this.spdGroupContFilter,
                            this.spdGroupContComponentType,
                            this.spdGroupContComponentName,
                            this.spdGroupContLastChanged,
                            this.spdGroupContStorageType,
                            this.spdGroupContRowStatus
                        };
                    }
                    public static final class SpdGroupContNameEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdGroupContNameEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdGroupContName", "1.3.6.1.2.1.153.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdGroupContPriorityEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdGroupContPriorityEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdGroupContPriority", "1.3.6.1.2.1.153.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdGroupContFilterEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdGroupContFilterEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdGroupContFilter", "1.3.6.1.2.1.153.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdGroupContComponentTypeEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdGroupContComponentTypeEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdGroupContComponentType", "1.3.6.1.2.1.153.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdGroupContComponentNameEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdGroupContComponentNameEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdGroupContComponentName", "1.3.6.1.2.1.153.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdGroupContLastChangedEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdGroupContLastChangedEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdGroupContLastChanged", "1.3.6.1.2.1.153.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdGroupContStorageTypeEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdGroupContStorageTypeEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdGroupContStorageType", "1.3.6.1.2.1.153.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdGroupContRowStatusEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdGroupContRowStatusEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdGroupContRowStatus", "1.3.6.1.2.1.153.1.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SpdRuleDefinitionTableEnt extends MIBEntry<IPSECSPDMIBDef>
            {
                public final SpdRuleDefinitionEntryEnt spdRuleDefinitionEntry;

                private SpdRuleDefinitionTableEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                {
                    super(mib, parent, "spdRuleDefinitionTable", "1.3.6.1.2.1.153.1.4", false, true, false, false);
                    this.spdRuleDefinitionEntry = new SpdRuleDefinitionEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.spdRuleDefinitionEntry
                    };
                }
                public static final class SpdRuleDefinitionEntryEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    public final SpdRuleDefNameEnt spdRuleDefName;

                    public final SpdRuleDefDescriptionEnt spdRuleDefDescription;

                    public final SpdRuleDefFilterEnt spdRuleDefFilter;

                    public final SpdRuleDefFilterNegatedEnt spdRuleDefFilterNegated;

                    public final SpdRuleDefActionEnt spdRuleDefAction;

                    public final SpdRuleDefAdminStatusEnt spdRuleDefAdminStatus;

                    public final SpdRuleDefLastChangedEnt spdRuleDefLastChanged;

                    public final SpdRuleDefStorageTypeEnt spdRuleDefStorageType;

                    public final SpdRuleDefRowStatusEnt spdRuleDefRowStatus;

                    private SpdRuleDefinitionEntryEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdRuleDefinitionEntry", "1.3.6.1.2.1.153.1.4.1", false, false, false, true);
                        this.spdRuleDefName = new SpdRuleDefNameEnt(mib, this);
                        this.spdRuleDefDescription = new SpdRuleDefDescriptionEnt(mib, this);
                        this.spdRuleDefFilter = new SpdRuleDefFilterEnt(mib, this);
                        this.spdRuleDefFilterNegated = new SpdRuleDefFilterNegatedEnt(mib, this);
                        this.spdRuleDefAction = new SpdRuleDefActionEnt(mib, this);
                        this.spdRuleDefAdminStatus = new SpdRuleDefAdminStatusEnt(mib, this);
                        this.spdRuleDefLastChanged = new SpdRuleDefLastChangedEnt(mib, this);
                        this.spdRuleDefStorageType = new SpdRuleDefStorageTypeEnt(mib, this);
                        this.spdRuleDefRowStatus = new SpdRuleDefRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.spdRuleDefName,
                            this.spdRuleDefDescription,
                            this.spdRuleDefFilter,
                            this.spdRuleDefFilterNegated,
                            this.spdRuleDefAction,
                            this.spdRuleDefAdminStatus,
                            this.spdRuleDefLastChanged,
                            this.spdRuleDefStorageType,
                            this.spdRuleDefRowStatus
                        };
                    }
                    public static final class SpdRuleDefNameEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdRuleDefNameEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdRuleDefName", "1.3.6.1.2.1.153.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdRuleDefDescriptionEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdRuleDefDescriptionEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdRuleDefDescription", "1.3.6.1.2.1.153.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdRuleDefFilterEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdRuleDefFilterEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdRuleDefFilter", "1.3.6.1.2.1.153.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdRuleDefFilterNegatedEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdRuleDefFilterNegatedEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdRuleDefFilterNegated", "1.3.6.1.2.1.153.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdRuleDefActionEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdRuleDefActionEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdRuleDefAction", "1.3.6.1.2.1.153.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdRuleDefAdminStatusEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdRuleDefAdminStatusEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdRuleDefAdminStatus", "1.3.6.1.2.1.153.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdRuleDefLastChangedEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdRuleDefLastChangedEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdRuleDefLastChanged", "1.3.6.1.2.1.153.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdRuleDefStorageTypeEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdRuleDefStorageTypeEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdRuleDefStorageType", "1.3.6.1.2.1.153.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdRuleDefRowStatusEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdRuleDefRowStatusEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdRuleDefRowStatus", "1.3.6.1.2.1.153.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SpdCompoundFilterTableEnt extends MIBEntry<IPSECSPDMIBDef>
            {
                public final SpdCompoundFilterEntryEnt spdCompoundFilterEntry;

                private SpdCompoundFilterTableEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                {
                    super(mib, parent, "spdCompoundFilterTable", "1.3.6.1.2.1.153.1.5", false, true, false, false);
                    this.spdCompoundFilterEntry = new SpdCompoundFilterEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.spdCompoundFilterEntry
                    };
                }
                public static final class SpdCompoundFilterEntryEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    public final SpdCompFiltNameEnt spdCompFiltName;

                    public final SpdCompFiltDescriptionEnt spdCompFiltDescription;

                    public final SpdCompFiltLogicTypeEnt spdCompFiltLogicType;

                    public final SpdCompFiltLastChangedEnt spdCompFiltLastChanged;

                    public final SpdCompFiltStorageTypeEnt spdCompFiltStorageType;

                    public final SpdCompFiltRowStatusEnt spdCompFiltRowStatus;

                    private SpdCompoundFilterEntryEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdCompoundFilterEntry", "1.3.6.1.2.1.153.1.5.1", false, false, false, true);
                        this.spdCompFiltName = new SpdCompFiltNameEnt(mib, this);
                        this.spdCompFiltDescription = new SpdCompFiltDescriptionEnt(mib, this);
                        this.spdCompFiltLogicType = new SpdCompFiltLogicTypeEnt(mib, this);
                        this.spdCompFiltLastChanged = new SpdCompFiltLastChangedEnt(mib, this);
                        this.spdCompFiltStorageType = new SpdCompFiltStorageTypeEnt(mib, this);
                        this.spdCompFiltRowStatus = new SpdCompFiltRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.spdCompFiltName,
                            this.spdCompFiltDescription,
                            this.spdCompFiltLogicType,
                            this.spdCompFiltLastChanged,
                            this.spdCompFiltStorageType,
                            this.spdCompFiltRowStatus
                        };
                    }
                    public static final class SpdCompFiltNameEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdCompFiltNameEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdCompFiltName", "1.3.6.1.2.1.153.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdCompFiltDescriptionEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdCompFiltDescriptionEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdCompFiltDescription", "1.3.6.1.2.1.153.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdCompFiltLogicTypeEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdCompFiltLogicTypeEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdCompFiltLogicType", "1.3.6.1.2.1.153.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdCompFiltLastChangedEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdCompFiltLastChangedEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdCompFiltLastChanged", "1.3.6.1.2.1.153.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdCompFiltStorageTypeEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdCompFiltStorageTypeEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdCompFiltStorageType", "1.3.6.1.2.1.153.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdCompFiltRowStatusEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdCompFiltRowStatusEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdCompFiltRowStatus", "1.3.6.1.2.1.153.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SpdSubfiltersTableEnt extends MIBEntry<IPSECSPDMIBDef>
            {
                public final SpdSubfiltersEntryEnt spdSubfiltersEntry;

                private SpdSubfiltersTableEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                {
                    super(mib, parent, "spdSubfiltersTable", "1.3.6.1.2.1.153.1.6", false, true, false, false);
                    this.spdSubfiltersEntry = new SpdSubfiltersEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.spdSubfiltersEntry
                    };
                }
                public static final class SpdSubfiltersEntryEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    public final SpdSubFiltPriorityEnt spdSubFiltPriority;

                    public final SpdSubFiltSubfilterEnt spdSubFiltSubfilter;

                    public final SpdSubFiltSubfilterIsNegatedEnt spdSubFiltSubfilterIsNegated;

                    public final SpdSubFiltLastChangedEnt spdSubFiltLastChanged;

                    public final SpdSubFiltStorageTypeEnt spdSubFiltStorageType;

                    public final SpdSubFiltRowStatusEnt spdSubFiltRowStatus;

                    private SpdSubfiltersEntryEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdSubfiltersEntry", "1.3.6.1.2.1.153.1.6.1", false, false, false, true);
                        this.spdSubFiltPriority = new SpdSubFiltPriorityEnt(mib, this);
                        this.spdSubFiltSubfilter = new SpdSubFiltSubfilterEnt(mib, this);
                        this.spdSubFiltSubfilterIsNegated = new SpdSubFiltSubfilterIsNegatedEnt(mib, this);
                        this.spdSubFiltLastChanged = new SpdSubFiltLastChangedEnt(mib, this);
                        this.spdSubFiltStorageType = new SpdSubFiltStorageTypeEnt(mib, this);
                        this.spdSubFiltRowStatus = new SpdSubFiltRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.spdSubFiltPriority,
                            this.spdSubFiltSubfilter,
                            this.spdSubFiltSubfilterIsNegated,
                            this.spdSubFiltLastChanged,
                            this.spdSubFiltStorageType,
                            this.spdSubFiltRowStatus
                        };
                    }
                    public static final class SpdSubFiltPriorityEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdSubFiltPriorityEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdSubFiltPriority", "1.3.6.1.2.1.153.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdSubFiltSubfilterEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdSubFiltSubfilterEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdSubFiltSubfilter", "1.3.6.1.2.1.153.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdSubFiltSubfilterIsNegatedEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdSubFiltSubfilterIsNegatedEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdSubFiltSubfilterIsNegated", "1.3.6.1.2.1.153.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdSubFiltLastChangedEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdSubFiltLastChangedEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdSubFiltLastChanged", "1.3.6.1.2.1.153.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdSubFiltStorageTypeEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdSubFiltStorageTypeEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdSubFiltStorageType", "1.3.6.1.2.1.153.1.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdSubFiltRowStatusEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdSubFiltRowStatusEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdSubFiltRowStatus", "1.3.6.1.2.1.153.1.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SpdStaticFiltersEnt extends MIBEntry<IPSECSPDMIBDef>
            {
                public final SpdTrueFilterEnt spdTrueFilter;

                private SpdStaticFiltersEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                {
                    super(mib, parent, "spdStaticFilters", "1.3.6.1.2.1.153.1.7", false, false, false, false);
                    this.spdTrueFilter = new SpdTrueFilterEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.spdTrueFilter
                    };
                }
                public static final class SpdTrueFilterEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    public final SpdTrueFilterInstanceEnt spdTrueFilterInstance;

                    private SpdTrueFilterEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdTrueFilter", "1.3.6.1.2.1.153.1.7.1", true, false, false, false);
                        this.spdTrueFilterInstance = new SpdTrueFilterInstanceEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.spdTrueFilterInstance
                        };
                    }
                    public static final class SpdTrueFilterInstanceEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdTrueFilterInstanceEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdTrueFilterInstance", "1.3.6.1.2.1.153.1.7.1.0", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SpdIpOffsetFilterTableEnt extends MIBEntry<IPSECSPDMIBDef>
            {
                public final SpdIpOffsetFilterEntryEnt spdIpOffsetFilterEntry;

                private SpdIpOffsetFilterTableEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                {
                    super(mib, parent, "spdIpOffsetFilterTable", "1.3.6.1.2.1.153.1.8", false, true, false, false);
                    this.spdIpOffsetFilterEntry = new SpdIpOffsetFilterEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.spdIpOffsetFilterEntry
                    };
                }
                public static final class SpdIpOffsetFilterEntryEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    public final SpdIpOffFiltNameEnt spdIpOffFiltName;

                    public final SpdIpOffFiltOffsetEnt spdIpOffFiltOffset;

                    public final SpdIpOffFiltTypeEnt spdIpOffFiltType;

                    public final SpdIpOffFiltValueEnt spdIpOffFiltValue;

                    public final SpdIpOffFiltLastChangedEnt spdIpOffFiltLastChanged;

                    public final SpdIpOffFiltStorageTypeEnt spdIpOffFiltStorageType;

                    public final SpdIpOffFiltRowStatusEnt spdIpOffFiltRowStatus;

                    private SpdIpOffsetFilterEntryEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdIpOffsetFilterEntry", "1.3.6.1.2.1.153.1.8.1", false, false, false, true);
                        this.spdIpOffFiltName = new SpdIpOffFiltNameEnt(mib, this);
                        this.spdIpOffFiltOffset = new SpdIpOffFiltOffsetEnt(mib, this);
                        this.spdIpOffFiltType = new SpdIpOffFiltTypeEnt(mib, this);
                        this.spdIpOffFiltValue = new SpdIpOffFiltValueEnt(mib, this);
                        this.spdIpOffFiltLastChanged = new SpdIpOffFiltLastChangedEnt(mib, this);
                        this.spdIpOffFiltStorageType = new SpdIpOffFiltStorageTypeEnt(mib, this);
                        this.spdIpOffFiltRowStatus = new SpdIpOffFiltRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.spdIpOffFiltName,
                            this.spdIpOffFiltOffset,
                            this.spdIpOffFiltType,
                            this.spdIpOffFiltValue,
                            this.spdIpOffFiltLastChanged,
                            this.spdIpOffFiltStorageType,
                            this.spdIpOffFiltRowStatus
                        };
                    }
                    public static final class SpdIpOffFiltNameEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdIpOffFiltNameEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdIpOffFiltName", "1.3.6.1.2.1.153.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdIpOffFiltOffsetEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdIpOffFiltOffsetEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdIpOffFiltOffset", "1.3.6.1.2.1.153.1.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdIpOffFiltTypeEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdIpOffFiltTypeEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdIpOffFiltType", "1.3.6.1.2.1.153.1.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdIpOffFiltValueEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdIpOffFiltValueEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdIpOffFiltValue", "1.3.6.1.2.1.153.1.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdIpOffFiltLastChangedEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdIpOffFiltLastChangedEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdIpOffFiltLastChanged", "1.3.6.1.2.1.153.1.8.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdIpOffFiltStorageTypeEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdIpOffFiltStorageTypeEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdIpOffFiltStorageType", "1.3.6.1.2.1.153.1.8.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdIpOffFiltRowStatusEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdIpOffFiltRowStatusEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdIpOffFiltRowStatus", "1.3.6.1.2.1.153.1.8.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SpdTimeFilterTableEnt extends MIBEntry<IPSECSPDMIBDef>
            {
                public final SpdTimeFilterEntryEnt spdTimeFilterEntry;

                private SpdTimeFilterTableEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                {
                    super(mib, parent, "spdTimeFilterTable", "1.3.6.1.2.1.153.1.9", false, true, false, false);
                    this.spdTimeFilterEntry = new SpdTimeFilterEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.spdTimeFilterEntry
                    };
                }
                public static final class SpdTimeFilterEntryEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    public final SpdTimeFiltNameEnt spdTimeFiltName;

                    public final SpdTimeFiltPeriodEnt spdTimeFiltPeriod;

                    public final SpdTimeFiltMonthOfYearMaskEnt spdTimeFiltMonthOfYearMask;

                    public final SpdTimeFiltDayOfMonthMaskEnt spdTimeFiltDayOfMonthMask;

                    public final SpdTimeFiltDayOfWeekMaskEnt spdTimeFiltDayOfWeekMask;

                    public final SpdTimeFiltTimeOfDayMaskEnt spdTimeFiltTimeOfDayMask;

                    public final SpdTimeFiltLastChangedEnt spdTimeFiltLastChanged;

                    public final SpdTimeFiltStorageTypeEnt spdTimeFiltStorageType;

                    public final SpdTimeFiltRowStatusEnt spdTimeFiltRowStatus;

                    private SpdTimeFilterEntryEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdTimeFilterEntry", "1.3.6.1.2.1.153.1.9.1", false, false, false, true);
                        this.spdTimeFiltName = new SpdTimeFiltNameEnt(mib, this);
                        this.spdTimeFiltPeriod = new SpdTimeFiltPeriodEnt(mib, this);
                        this.spdTimeFiltMonthOfYearMask = new SpdTimeFiltMonthOfYearMaskEnt(mib, this);
                        this.spdTimeFiltDayOfMonthMask = new SpdTimeFiltDayOfMonthMaskEnt(mib, this);
                        this.spdTimeFiltDayOfWeekMask = new SpdTimeFiltDayOfWeekMaskEnt(mib, this);
                        this.spdTimeFiltTimeOfDayMask = new SpdTimeFiltTimeOfDayMaskEnt(mib, this);
                        this.spdTimeFiltLastChanged = new SpdTimeFiltLastChangedEnt(mib, this);
                        this.spdTimeFiltStorageType = new SpdTimeFiltStorageTypeEnt(mib, this);
                        this.spdTimeFiltRowStatus = new SpdTimeFiltRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.spdTimeFiltName,
                            this.spdTimeFiltPeriod,
                            this.spdTimeFiltMonthOfYearMask,
                            this.spdTimeFiltDayOfMonthMask,
                            this.spdTimeFiltDayOfWeekMask,
                            this.spdTimeFiltTimeOfDayMask,
                            this.spdTimeFiltLastChanged,
                            this.spdTimeFiltStorageType,
                            this.spdTimeFiltRowStatus
                        };
                    }
                    public static final class SpdTimeFiltNameEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdTimeFiltNameEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdTimeFiltName", "1.3.6.1.2.1.153.1.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdTimeFiltPeriodEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdTimeFiltPeriodEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdTimeFiltPeriod", "1.3.6.1.2.1.153.1.9.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdTimeFiltMonthOfYearMaskEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdTimeFiltMonthOfYearMaskEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdTimeFiltMonthOfYearMask", "1.3.6.1.2.1.153.1.9.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdTimeFiltDayOfMonthMaskEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdTimeFiltDayOfMonthMaskEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdTimeFiltDayOfMonthMask", "1.3.6.1.2.1.153.1.9.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdTimeFiltDayOfWeekMaskEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdTimeFiltDayOfWeekMaskEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdTimeFiltDayOfWeekMask", "1.3.6.1.2.1.153.1.9.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdTimeFiltTimeOfDayMaskEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdTimeFiltTimeOfDayMaskEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdTimeFiltTimeOfDayMask", "1.3.6.1.2.1.153.1.9.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdTimeFiltLastChangedEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdTimeFiltLastChangedEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdTimeFiltLastChanged", "1.3.6.1.2.1.153.1.9.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdTimeFiltStorageTypeEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdTimeFiltStorageTypeEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdTimeFiltStorageType", "1.3.6.1.2.1.153.1.9.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdTimeFiltRowStatusEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdTimeFiltRowStatusEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdTimeFiltRowStatus", "1.3.6.1.2.1.153.1.9.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SpdIpsoHeaderFilterTableEnt extends MIBEntry<IPSECSPDMIBDef>
            {
                public final SpdIpsoHeaderFilterEntryEnt spdIpsoHeaderFilterEntry;

                private SpdIpsoHeaderFilterTableEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                {
                    super(mib, parent, "spdIpsoHeaderFilterTable", "1.3.6.1.2.1.153.1.10", false, true, false, false);
                    this.spdIpsoHeaderFilterEntry = new SpdIpsoHeaderFilterEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.spdIpsoHeaderFilterEntry
                    };
                }
                public static final class SpdIpsoHeaderFilterEntryEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    public final SpdIpsoHeadFiltNameEnt spdIpsoHeadFiltName;

                    public final SpdIpsoHeadFiltTypeEnt spdIpsoHeadFiltType;

                    public final SpdIpsoHeadFiltClassificationEnt spdIpsoHeadFiltClassification;

                    public final SpdIpsoHeadFiltProtectionAuthEnt spdIpsoHeadFiltProtectionAuth;

                    public final SpdIpsoHeadFiltLastChangedEnt spdIpsoHeadFiltLastChanged;

                    public final SpdIpsoHeadFiltStorageTypeEnt spdIpsoHeadFiltStorageType;

                    public final SpdIpsoHeadFiltRowStatusEnt spdIpsoHeadFiltRowStatus;

                    private SpdIpsoHeaderFilterEntryEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdIpsoHeaderFilterEntry", "1.3.6.1.2.1.153.1.10.1", false, false, false, true);
                        this.spdIpsoHeadFiltName = new SpdIpsoHeadFiltNameEnt(mib, this);
                        this.spdIpsoHeadFiltType = new SpdIpsoHeadFiltTypeEnt(mib, this);
                        this.spdIpsoHeadFiltClassification = new SpdIpsoHeadFiltClassificationEnt(mib, this);
                        this.spdIpsoHeadFiltProtectionAuth = new SpdIpsoHeadFiltProtectionAuthEnt(mib, this);
                        this.spdIpsoHeadFiltLastChanged = new SpdIpsoHeadFiltLastChangedEnt(mib, this);
                        this.spdIpsoHeadFiltStorageType = new SpdIpsoHeadFiltStorageTypeEnt(mib, this);
                        this.spdIpsoHeadFiltRowStatus = new SpdIpsoHeadFiltRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.spdIpsoHeadFiltName,
                            this.spdIpsoHeadFiltType,
                            this.spdIpsoHeadFiltClassification,
                            this.spdIpsoHeadFiltProtectionAuth,
                            this.spdIpsoHeadFiltLastChanged,
                            this.spdIpsoHeadFiltStorageType,
                            this.spdIpsoHeadFiltRowStatus
                        };
                    }
                    public static final class SpdIpsoHeadFiltNameEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdIpsoHeadFiltNameEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdIpsoHeadFiltName", "1.3.6.1.2.1.153.1.10.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdIpsoHeadFiltTypeEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdIpsoHeadFiltTypeEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdIpsoHeadFiltType", "1.3.6.1.2.1.153.1.10.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdIpsoHeadFiltClassificationEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdIpsoHeadFiltClassificationEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdIpsoHeadFiltClassification", "1.3.6.1.2.1.153.1.10.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdIpsoHeadFiltProtectionAuthEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdIpsoHeadFiltProtectionAuthEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdIpsoHeadFiltProtectionAuth", "1.3.6.1.2.1.153.1.10.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdIpsoHeadFiltLastChangedEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdIpsoHeadFiltLastChangedEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdIpsoHeadFiltLastChanged", "1.3.6.1.2.1.153.1.10.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdIpsoHeadFiltStorageTypeEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdIpsoHeadFiltStorageTypeEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdIpsoHeadFiltStorageType", "1.3.6.1.2.1.153.1.10.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdIpsoHeadFiltRowStatusEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdIpsoHeadFiltRowStatusEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdIpsoHeadFiltRowStatus", "1.3.6.1.2.1.153.1.10.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SpdCompoundActionTableEnt extends MIBEntry<IPSECSPDMIBDef>
            {
                public final SpdCompoundActionEntryEnt spdCompoundActionEntry;

                private SpdCompoundActionTableEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                {
                    super(mib, parent, "spdCompoundActionTable", "1.3.6.1.2.1.153.1.11", false, true, false, false);
                    this.spdCompoundActionEntry = new SpdCompoundActionEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.spdCompoundActionEntry
                    };
                }
                public static final class SpdCompoundActionEntryEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    public final SpdCompActNameEnt spdCompActName;

                    public final SpdCompActExecutionStrategyEnt spdCompActExecutionStrategy;

                    public final SpdCompActLastChangedEnt spdCompActLastChanged;

                    public final SpdCompActStorageTypeEnt spdCompActStorageType;

                    public final SpdCompActRowStatusEnt spdCompActRowStatus;

                    private SpdCompoundActionEntryEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdCompoundActionEntry", "1.3.6.1.2.1.153.1.11.1", false, false, false, true);
                        this.spdCompActName = new SpdCompActNameEnt(mib, this);
                        this.spdCompActExecutionStrategy = new SpdCompActExecutionStrategyEnt(mib, this);
                        this.spdCompActLastChanged = new SpdCompActLastChangedEnt(mib, this);
                        this.spdCompActStorageType = new SpdCompActStorageTypeEnt(mib, this);
                        this.spdCompActRowStatus = new SpdCompActRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.spdCompActName,
                            this.spdCompActExecutionStrategy,
                            this.spdCompActLastChanged,
                            this.spdCompActStorageType,
                            this.spdCompActRowStatus
                        };
                    }
                    public static final class SpdCompActNameEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdCompActNameEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdCompActName", "1.3.6.1.2.1.153.1.11.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdCompActExecutionStrategyEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdCompActExecutionStrategyEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdCompActExecutionStrategy", "1.3.6.1.2.1.153.1.11.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdCompActLastChangedEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdCompActLastChangedEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdCompActLastChanged", "1.3.6.1.2.1.153.1.11.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdCompActStorageTypeEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdCompActStorageTypeEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdCompActStorageType", "1.3.6.1.2.1.153.1.11.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdCompActRowStatusEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdCompActRowStatusEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdCompActRowStatus", "1.3.6.1.2.1.153.1.11.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SpdSubactionsTableEnt extends MIBEntry<IPSECSPDMIBDef>
            {
                public final SpdSubactionsEntryEnt spdSubactionsEntry;

                private SpdSubactionsTableEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                {
                    super(mib, parent, "spdSubactionsTable", "1.3.6.1.2.1.153.1.12", false, true, false, false);
                    this.spdSubactionsEntry = new SpdSubactionsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.spdSubactionsEntry
                    };
                }
                public static final class SpdSubactionsEntryEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    public final SpdSubActPriorityEnt spdSubActPriority;

                    public final SpdSubActSubActionNameEnt spdSubActSubActionName;

                    public final SpdSubActLastChangedEnt spdSubActLastChanged;

                    public final SpdSubActStorageTypeEnt spdSubActStorageType;

                    public final SpdSubActRowStatusEnt spdSubActRowStatus;

                    private SpdSubactionsEntryEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdSubactionsEntry", "1.3.6.1.2.1.153.1.12.1", false, false, false, true);
                        this.spdSubActPriority = new SpdSubActPriorityEnt(mib, this);
                        this.spdSubActSubActionName = new SpdSubActSubActionNameEnt(mib, this);
                        this.spdSubActLastChanged = new SpdSubActLastChangedEnt(mib, this);
                        this.spdSubActStorageType = new SpdSubActStorageTypeEnt(mib, this);
                        this.spdSubActRowStatus = new SpdSubActRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.spdSubActPriority,
                            this.spdSubActSubActionName,
                            this.spdSubActLastChanged,
                            this.spdSubActStorageType,
                            this.spdSubActRowStatus
                        };
                    }
                    public static final class SpdSubActPriorityEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdSubActPriorityEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdSubActPriority", "1.3.6.1.2.1.153.1.12.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdSubActSubActionNameEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdSubActSubActionNameEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdSubActSubActionName", "1.3.6.1.2.1.153.1.12.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdSubActLastChangedEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdSubActLastChangedEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdSubActLastChanged", "1.3.6.1.2.1.153.1.12.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdSubActStorageTypeEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdSubActStorageTypeEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdSubActStorageType", "1.3.6.1.2.1.153.1.12.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SpdSubActRowStatusEnt extends MIBEntry<IPSECSPDMIBDef>
                    {
                        private SpdSubActRowStatusEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                        {
                            super(mib, parent, "spdSubActRowStatus", "1.3.6.1.2.1.153.1.12.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SpdStaticActionsEnt extends MIBEntry<IPSECSPDMIBDef>
            {
                public final SpdDropActionEnt spdDropAction;

                public final SpdDropActionLogEnt spdDropActionLog;

                public final SpdAcceptActionEnt spdAcceptAction;

                public final SpdAcceptActionLogEnt spdAcceptActionLog;

                private SpdStaticActionsEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                {
                    super(mib, parent, "spdStaticActions", "1.3.6.1.2.1.153.1.13", false, false, false, false);
                    this.spdDropAction = new SpdDropActionEnt(mib, this);
                    this.spdDropActionLog = new SpdDropActionLogEnt(mib, this);
                    this.spdAcceptAction = new SpdAcceptActionEnt(mib, this);
                    this.spdAcceptActionLog = new SpdAcceptActionLogEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.spdDropAction,
                        this.spdDropActionLog,
                        this.spdAcceptAction,
                        this.spdAcceptActionLog
                    };
                }
                public static final class SpdDropActionEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdDropActionEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdDropAction", "1.3.6.1.2.1.153.1.13.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdDropActionLogEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdDropActionLogEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdDropActionLog", "1.3.6.1.2.1.153.1.13.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdAcceptActionEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdAcceptActionEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdAcceptAction", "1.3.6.1.2.1.153.1.13.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdAcceptActionLogEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdAcceptActionLogEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdAcceptActionLog", "1.3.6.1.2.1.153.1.13.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class SpdNotificationObjectsEnt extends MIBEntry<IPSECSPDMIBDef>
        {
            /** Notification objects information*/
            public final SpdNotificationVariablesEnt spdNotificationVariables;

            public final SpdNotificationsEnt spdNotifications;

            private SpdNotificationObjectsEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
            {
                super(mib, parent, "spdNotificationObjects", "1.3.6.1.2.1.153.2", false, false, false, false);
                this.spdNotificationVariables = new SpdNotificationVariablesEnt(mib, this);
                this.spdNotifications = new SpdNotificationsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.spdNotificationVariables,
                    this.spdNotifications
                };
            }
            public static final class SpdNotificationVariablesEnt extends MIBEntry<IPSECSPDMIBDef>
            {
                public final SpdActionExecutedEnt spdActionExecuted;

                public final SpdIPEndpointAddTypeEnt spdIPEndpointAddType;

                public final SpdIPEndpointAddressEnt spdIPEndpointAddress;

                public final SpdIPSourceTypeEnt spdIPSourceType;

                public final SpdIPSourceAddressEnt spdIPSourceAddress;

                public final SpdIPDestinationTypeEnt spdIPDestinationType;

                public final SpdIPDestinationAddressEnt spdIPDestinationAddress;

                public final SpdPacketDirectionEnt spdPacketDirection;

                public final SpdPacketPartEnt spdPacketPart;

                private SpdNotificationVariablesEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                {
                    super(mib, parent, "spdNotificationVariables", "1.3.6.1.2.1.153.2.1", false, false, false, false);
                    this.spdActionExecuted = new SpdActionExecutedEnt(mib, this);
                    this.spdIPEndpointAddType = new SpdIPEndpointAddTypeEnt(mib, this);
                    this.spdIPEndpointAddress = new SpdIPEndpointAddressEnt(mib, this);
                    this.spdIPSourceType = new SpdIPSourceTypeEnt(mib, this);
                    this.spdIPSourceAddress = new SpdIPSourceAddressEnt(mib, this);
                    this.spdIPDestinationType = new SpdIPDestinationTypeEnt(mib, this);
                    this.spdIPDestinationAddress = new SpdIPDestinationAddressEnt(mib, this);
                    this.spdPacketDirection = new SpdPacketDirectionEnt(mib, this);
                    this.spdPacketPart = new SpdPacketPartEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.spdActionExecuted,
                        this.spdIPEndpointAddType,
                        this.spdIPEndpointAddress,
                        this.spdIPSourceType,
                        this.spdIPSourceAddress,
                        this.spdIPDestinationType,
                        this.spdIPDestinationAddress,
                        this.spdPacketDirection,
                        this.spdPacketPart
                    };
                }
                public static final class SpdActionExecutedEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdActionExecutedEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdActionExecuted", "1.3.6.1.2.1.153.2.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdIPEndpointAddTypeEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdIPEndpointAddTypeEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdIPEndpointAddType", "1.3.6.1.2.1.153.2.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdIPEndpointAddressEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdIPEndpointAddressEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdIPEndpointAddress", "1.3.6.1.2.1.153.2.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdIPSourceTypeEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdIPSourceTypeEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdIPSourceType", "1.3.6.1.2.1.153.2.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdIPSourceAddressEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdIPSourceAddressEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdIPSourceAddress", "1.3.6.1.2.1.153.2.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdIPDestinationTypeEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdIPDestinationTypeEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdIPDestinationType", "1.3.6.1.2.1.153.2.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdIPDestinationAddressEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdIPDestinationAddressEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdIPDestinationAddress", "1.3.6.1.2.1.153.2.1.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdPacketDirectionEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdPacketDirectionEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdPacketDirection", "1.3.6.1.2.1.153.2.1.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdPacketPartEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdPacketPartEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdPacketPart", "1.3.6.1.2.1.153.2.1.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SpdNotificationsEnt extends MIBEntry<IPSECSPDMIBDef>
            {
                public final SpdActionNotificationEnt spdActionNotification;

                public final SpdPacketNotificationEnt spdPacketNotification;

                private SpdNotificationsEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                {
                    super(mib, parent, "spdNotifications", "1.3.6.1.2.1.153.2.0", false, false, false, false);
                    this.spdActionNotification = new SpdActionNotificationEnt(mib, this);
                    this.spdPacketNotification = new SpdPacketNotificationEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.spdActionNotification,
                        this.spdPacketNotification
                    };
                }
                public static final class SpdActionNotificationEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdActionNotificationEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdActionNotification", "1.3.6.1.2.1.153.2.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdPacketNotificationEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdPacketNotificationEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdPacketNotification", "1.3.6.1.2.1.153.2.0.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class SpdConformanceObjectsEnt extends MIBEntry<IPSECSPDMIBDef>
        {
            /** Conformance information*/
            public final SpdCompliancesEnt spdCompliances;

            public final SpdGroupsEnt spdGroups;

            private SpdConformanceObjectsEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
            {
                super(mib, parent, "spdConformanceObjects", "1.3.6.1.2.1.153.3", false, false, false, false);
                this.spdCompliances = new SpdCompliancesEnt(mib, this);
                this.spdGroups = new SpdGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.spdCompliances,
                    this.spdGroups
                };
            }
            public static final class SpdCompliancesEnt extends MIBEntry<IPSECSPDMIBDef>
            {
                /** Compliance statements*/
                public final SpdRuleFilterFullComplianceEnt spdRuleFilterFullCompliance;

                public final SpdLoggingComplianceEnt spdLoggingCompliance;

                /** ReadOnly Compliances*/
                public final SpdRuleFilterReadOnlyComplianceEnt spdRuleFilterReadOnlyCompliance;

                private SpdCompliancesEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                {
                    super(mib, parent, "spdCompliances", "1.3.6.1.2.1.153.3.1", false, false, false, false);
                    this.spdRuleFilterFullCompliance = new SpdRuleFilterFullComplianceEnt(mib, this);
                    this.spdLoggingCompliance = new SpdLoggingComplianceEnt(mib, this);
                    this.spdRuleFilterReadOnlyCompliance = new SpdRuleFilterReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.spdRuleFilterFullCompliance,
                        this.spdLoggingCompliance,
                        this.spdRuleFilterReadOnlyCompliance
                    };
                }
                public static final class SpdRuleFilterFullComplianceEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdRuleFilterFullComplianceEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdRuleFilterFullCompliance", "1.3.6.1.2.1.153.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdLoggingComplianceEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdLoggingComplianceEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdLoggingCompliance", "1.3.6.1.2.1.153.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdRuleFilterReadOnlyComplianceEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdRuleFilterReadOnlyComplianceEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdRuleFilterReadOnlyCompliance", "1.3.6.1.2.1.153.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SpdGroupsEnt extends MIBEntry<IPSECSPDMIBDef>
            {
                /** Compliance Groups Definitions
Endpoint, Rule, Filter Compliance Groups*/
                public final SpdEndpointGroupEnt spdEndpointGroup;

                public final SpdGroupContentsGroupEnt spdGroupContentsGroup;

                public final SpdIpsecSystemPolicyNameGroupEnt spdIpsecSystemPolicyNameGroup;

                public final SpdRuleDefinitionGroupEnt spdRuleDefinitionGroup;

                public final SpdCompoundFilterGroupEnt spdCompoundFilterGroup;

                public final SpdStaticFilterGroupEnt spdStaticFilterGroup;

                public final SpdIPOffsetFilterGroupEnt spdIPOffsetFilterGroup;

                public final SpdTimeFilterGroupEnt spdTimeFilterGroup;

                public final SpdIpsoHeaderFilterGroupEnt spdIpsoHeaderFilterGroup;

                /** action compliance groups*/
                public final SpdStaticActionGroupEnt spdStaticActionGroup;

                public final SpdCompoundActionGroupEnt spdCompoundActionGroup;

                public final SpdActionLoggingObjectGroupEnt spdActionLoggingObjectGroup;

                public final SpdActionNotificationGroupEnt spdActionNotificationGroup;

                private SpdGroupsEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                {
                    super(mib, parent, "spdGroups", "1.3.6.1.2.1.153.3.2", false, false, false, false);
                    this.spdEndpointGroup = new SpdEndpointGroupEnt(mib, this);
                    this.spdGroupContentsGroup = new SpdGroupContentsGroupEnt(mib, this);
                    this.spdIpsecSystemPolicyNameGroup = new SpdIpsecSystemPolicyNameGroupEnt(mib, this);
                    this.spdRuleDefinitionGroup = new SpdRuleDefinitionGroupEnt(mib, this);
                    this.spdCompoundFilterGroup = new SpdCompoundFilterGroupEnt(mib, this);
                    this.spdStaticFilterGroup = new SpdStaticFilterGroupEnt(mib, this);
                    this.spdIPOffsetFilterGroup = new SpdIPOffsetFilterGroupEnt(mib, this);
                    this.spdTimeFilterGroup = new SpdTimeFilterGroupEnt(mib, this);
                    this.spdIpsoHeaderFilterGroup = new SpdIpsoHeaderFilterGroupEnt(mib, this);
                    this.spdStaticActionGroup = new SpdStaticActionGroupEnt(mib, this);
                    this.spdCompoundActionGroup = new SpdCompoundActionGroupEnt(mib, this);
                    this.spdActionLoggingObjectGroup = new SpdActionLoggingObjectGroupEnt(mib, this);
                    this.spdActionNotificationGroup = new SpdActionNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.spdEndpointGroup,
                        this.spdGroupContentsGroup,
                        this.spdIpsecSystemPolicyNameGroup,
                        this.spdRuleDefinitionGroup,
                        this.spdCompoundFilterGroup,
                        this.spdStaticFilterGroup,
                        this.spdIPOffsetFilterGroup,
                        this.spdTimeFilterGroup,
                        this.spdIpsoHeaderFilterGroup,
                        this.spdStaticActionGroup,
                        this.spdCompoundActionGroup,
                        this.spdActionLoggingObjectGroup,
                        this.spdActionNotificationGroup
                    };
                }
                public static final class SpdEndpointGroupEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdEndpointGroupEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdEndpointGroup", "1.3.6.1.2.1.153.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdGroupContentsGroupEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdGroupContentsGroupEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdGroupContentsGroup", "1.3.6.1.2.1.153.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdIpsecSystemPolicyNameGroupEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdIpsecSystemPolicyNameGroupEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdIpsecSystemPolicyNameGroup", "1.3.6.1.2.1.153.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdRuleDefinitionGroupEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdRuleDefinitionGroupEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdRuleDefinitionGroup", "1.3.6.1.2.1.153.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdCompoundFilterGroupEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdCompoundFilterGroupEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdCompoundFilterGroup", "1.3.6.1.2.1.153.3.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdStaticFilterGroupEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdStaticFilterGroupEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdStaticFilterGroup", "1.3.6.1.2.1.153.3.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdIPOffsetFilterGroupEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdIPOffsetFilterGroupEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdIPOffsetFilterGroup", "1.3.6.1.2.1.153.3.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdTimeFilterGroupEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdTimeFilterGroupEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdTimeFilterGroup", "1.3.6.1.2.1.153.3.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdIpsoHeaderFilterGroupEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdIpsoHeaderFilterGroupEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdIpsoHeaderFilterGroup", "1.3.6.1.2.1.153.3.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdStaticActionGroupEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdStaticActionGroupEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdStaticActionGroup", "1.3.6.1.2.1.153.3.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdCompoundActionGroupEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdCompoundActionGroupEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdCompoundActionGroup", "1.3.6.1.2.1.153.3.2.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdActionLoggingObjectGroupEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdActionLoggingObjectGroupEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdActionLoggingObjectGroup", "1.3.6.1.2.1.153.3.2.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SpdActionNotificationGroupEnt extends MIBEntry<IPSECSPDMIBDef>
                {
                    private SpdActionNotificationGroupEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
                    {
                        super(mib, parent, "spdActionNotificationGroup", "1.3.6.1.2.1.153.3.2.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class SpdActionsEnt extends MIBEntry<IPSECSPDMIBDef>
        {
            private SpdActionsEnt(IPSECSPDMIBDef mib, MIBEntry<IPSECSPDMIBDef> parent)
            {
                super(mib, parent, "spdActions", "1.3.6.1.2.1.153.4", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

}
