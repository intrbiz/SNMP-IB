package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class DISMANEXPRESSIONMIBDef extends MIB
{
    public static final DISMANEXPRESSIONMIBDef DISMANEXPRESSIONMIB = new DISMANEXPRESSIONMIBDef();

    static { MIBs.getInstance().registerMIB(DISMANEXPRESSIONMIBDef.DISMANEXPRESSIONMIB); }

    /** 16 October 2000*/
    public final DismanExpressionMIBEnt dismanExpressionMIB;

    public final SysUpTimeInstanceEnt sysUpTimeInstance;

    private DISMANEXPRESSIONMIBDef()
    {
        super("DISMAN-EXPRESSION-MIB");
        this.dismanExpressionMIB = new DismanExpressionMIBEnt(this, null);
        this.sysUpTimeInstance = new SysUpTimeInstanceEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dismanExpressionMIB,
            this.sysUpTimeInstance
        };
    }

    public static final class DismanExpressionMIBEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
    {
        public final DismanExpressionMIBObjectsEnt dismanExpressionMIBObjects;

        /** Conformance*/
        public final DismanExpressionMIBConformanceEnt dismanExpressionMIBConformance;

        private DismanExpressionMIBEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
        {
            super(mib, parent, "dismanExpressionMIB", "1.3.6.1.2.1.90", false, false, false, false);
            this.dismanExpressionMIBObjects = new DismanExpressionMIBObjectsEnt(mib, this);
            this.dismanExpressionMIBConformance = new DismanExpressionMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dismanExpressionMIBObjects,
                this.dismanExpressionMIBConformance
            };
        }
        public static final class DismanExpressionMIBObjectsEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
        {
            public final ExpResourceEnt expResource;

            public final ExpDefineEnt expDefine;

            public final ExpValueEnt expValue;

            private DismanExpressionMIBObjectsEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
            {
                super(mib, parent, "dismanExpressionMIBObjects", "1.3.6.1.2.1.90.1", false, false, false, false);
                this.expResource = new ExpResourceEnt(mib, this);
                this.expDefine = new ExpDefineEnt(mib, this);
                this.expValue = new ExpValueEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.expResource,
                    this.expDefine,
                    this.expValue
                };
            }
            public static final class ExpResourceEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
            {
                /** Resource Control*/
                public final ExpResourceDeltaMinimumEnt expResourceDeltaMinimum;

                public final ExpResourceDeltaWildcardInstanceMaximumEnt expResourceDeltaWildcardInstanceMaximum;

                public final ExpResourceDeltaWildcardInstancesEnt expResourceDeltaWildcardInstances;

                public final ExpResourceDeltaWildcardInstancesHighEnt expResourceDeltaWildcardInstancesHigh;

                public final ExpResourceDeltaWildcardInstanceResourceLacksEnt expResourceDeltaWildcardInstanceResourceLacks;

                private ExpResourceEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                {
                    super(mib, parent, "expResource", "1.3.6.1.2.1.90.1.1", false, false, false, false);
                    this.expResourceDeltaMinimum = new ExpResourceDeltaMinimumEnt(mib, this);
                    this.expResourceDeltaWildcardInstanceMaximum = new ExpResourceDeltaWildcardInstanceMaximumEnt(mib, this);
                    this.expResourceDeltaWildcardInstances = new ExpResourceDeltaWildcardInstancesEnt(mib, this);
                    this.expResourceDeltaWildcardInstancesHigh = new ExpResourceDeltaWildcardInstancesHighEnt(mib, this);
                    this.expResourceDeltaWildcardInstanceResourceLacks = new ExpResourceDeltaWildcardInstanceResourceLacksEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.expResourceDeltaMinimum,
                        this.expResourceDeltaWildcardInstanceMaximum,
                        this.expResourceDeltaWildcardInstances,
                        this.expResourceDeltaWildcardInstancesHigh,
                        this.expResourceDeltaWildcardInstanceResourceLacks
                    };
                }
                public static final class ExpResourceDeltaMinimumEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                {
                    private ExpResourceDeltaMinimumEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                    {
                        super(mib, parent, "expResourceDeltaMinimum", "1.3.6.1.2.1.90.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ExpResourceDeltaWildcardInstanceMaximumEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                {
                    private ExpResourceDeltaWildcardInstanceMaximumEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                    {
                        super(mib, parent, "expResourceDeltaWildcardInstanceMaximum", "1.3.6.1.2.1.90.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ExpResourceDeltaWildcardInstancesEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                {
                    private ExpResourceDeltaWildcardInstancesEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                    {
                        super(mib, parent, "expResourceDeltaWildcardInstances", "1.3.6.1.2.1.90.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ExpResourceDeltaWildcardInstancesHighEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                {
                    private ExpResourceDeltaWildcardInstancesHighEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                    {
                        super(mib, parent, "expResourceDeltaWildcardInstancesHigh", "1.3.6.1.2.1.90.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ExpResourceDeltaWildcardInstanceResourceLacksEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                {
                    private ExpResourceDeltaWildcardInstanceResourceLacksEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                    {
                        super(mib, parent, "expResourceDeltaWildcardInstanceResourceLacks", "1.3.6.1.2.1.90.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class ExpDefineEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
            {
                /** DefinitionExpression Definition Table*/
                public final ExpExpressionTableEnt expExpressionTable;

                /** Expression Error Table*/
                public final ExpErrorTableEnt expErrorTable;

                /** Object Table*/
                public final ExpObjectTableEnt expObjectTable;

                private ExpDefineEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                {
                    super(mib, parent, "expDefine", "1.3.6.1.2.1.90.1.2", false, false, false, false);
                    this.expExpressionTable = new ExpExpressionTableEnt(mib, this);
                    this.expErrorTable = new ExpErrorTableEnt(mib, this);
                    this.expObjectTable = new ExpObjectTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.expExpressionTable,
                        this.expErrorTable,
                        this.expObjectTable
                    };
                }
                public static final class ExpExpressionTableEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                {
                    public final ExpExpressionEntryEnt expExpressionEntry;

                    private ExpExpressionTableEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                    {
                        super(mib, parent, "expExpressionTable", "1.3.6.1.2.1.90.1.2.1", false, true, false, false);
                        this.expExpressionEntry = new ExpExpressionEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.expExpressionEntry
                        };
                    }
                    public static final class ExpExpressionEntryEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                    {
                        public final ExpExpressionOwnerEnt expExpressionOwner;

                        public final ExpExpressionNameEnt expExpressionName;

                        public final ExpExpressionEnt expExpression;

                        public final ExpExpressionValueTypeEnt expExpressionValueType;

                        public final ExpExpressionCommentEnt expExpressionComment;

                        public final ExpExpressionDeltaIntervalEnt expExpressionDeltaInterval;

                        public final ExpExpressionPrefixEnt expExpressionPrefix;

                        public final ExpExpressionErrorsEnt expExpressionErrors;

                        public final ExpExpressionEntryStatusEnt expExpressionEntryStatus;

                        private ExpExpressionEntryEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                        {
                            super(mib, parent, "expExpressionEntry", "1.3.6.1.2.1.90.1.2.1.1", false, false, false, true);
                            this.expExpressionOwner = new ExpExpressionOwnerEnt(mib, this);
                            this.expExpressionName = new ExpExpressionNameEnt(mib, this);
                            this.expExpression = new ExpExpressionEnt(mib, this);
                            this.expExpressionValueType = new ExpExpressionValueTypeEnt(mib, this);
                            this.expExpressionComment = new ExpExpressionCommentEnt(mib, this);
                            this.expExpressionDeltaInterval = new ExpExpressionDeltaIntervalEnt(mib, this);
                            this.expExpressionPrefix = new ExpExpressionPrefixEnt(mib, this);
                            this.expExpressionErrors = new ExpExpressionErrorsEnt(mib, this);
                            this.expExpressionEntryStatus = new ExpExpressionEntryStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.expExpressionOwner,
                                this.expExpressionName,
                                this.expExpression,
                                this.expExpressionValueType,
                                this.expExpressionComment,
                                this.expExpressionDeltaInterval,
                                this.expExpressionPrefix,
                                this.expExpressionErrors,
                                this.expExpressionEntryStatus
                            };
                        }
                        public static final class ExpExpressionOwnerEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpExpressionOwnerEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expExpressionOwner", "1.3.6.1.2.1.90.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpExpressionNameEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpExpressionNameEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expExpressionName", "1.3.6.1.2.1.90.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpExpressionEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpExpressionEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expExpression", "1.3.6.1.2.1.90.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpExpressionValueTypeEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpExpressionValueTypeEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expExpressionValueType", "1.3.6.1.2.1.90.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpExpressionCommentEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpExpressionCommentEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expExpressionComment", "1.3.6.1.2.1.90.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpExpressionDeltaIntervalEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpExpressionDeltaIntervalEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expExpressionDeltaInterval", "1.3.6.1.2.1.90.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpExpressionPrefixEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpExpressionPrefixEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expExpressionPrefix", "1.3.6.1.2.1.90.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpExpressionErrorsEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpExpressionErrorsEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expExpressionErrors", "1.3.6.1.2.1.90.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpExpressionEntryStatusEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpExpressionEntryStatusEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expExpressionEntryStatus", "1.3.6.1.2.1.90.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ExpErrorTableEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                {
                    public final ExpErrorEntryEnt expErrorEntry;

                    private ExpErrorTableEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                    {
                        super(mib, parent, "expErrorTable", "1.3.6.1.2.1.90.1.2.2", false, true, false, false);
                        this.expErrorEntry = new ExpErrorEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.expErrorEntry
                        };
                    }
                    public static final class ExpErrorEntryEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                    {
                        public final ExpErrorTimeEnt expErrorTime;

                        public final ExpErrorIndexEnt expErrorIndex;

                        public final ExpErrorCodeEnt expErrorCode;

                        public final ExpErrorInstanceEnt expErrorInstance;

                        private ExpErrorEntryEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                        {
                            super(mib, parent, "expErrorEntry", "1.3.6.1.2.1.90.1.2.2.1", false, false, false, true);
                            this.expErrorTime = new ExpErrorTimeEnt(mib, this);
                            this.expErrorIndex = new ExpErrorIndexEnt(mib, this);
                            this.expErrorCode = new ExpErrorCodeEnt(mib, this);
                            this.expErrorInstance = new ExpErrorInstanceEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.expErrorTime,
                                this.expErrorIndex,
                                this.expErrorCode,
                                this.expErrorInstance
                            };
                        }
                        public static final class ExpErrorTimeEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpErrorTimeEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expErrorTime", "1.3.6.1.2.1.90.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpErrorIndexEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpErrorIndexEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expErrorIndex", "1.3.6.1.2.1.90.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpErrorCodeEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpErrorCodeEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expErrorCode", "1.3.6.1.2.1.90.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpErrorInstanceEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpErrorInstanceEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expErrorInstance", "1.3.6.1.2.1.90.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ExpObjectTableEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                {
                    public final ExpObjectEntryEnt expObjectEntry;

                    private ExpObjectTableEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                    {
                        super(mib, parent, "expObjectTable", "1.3.6.1.2.1.90.1.2.3", false, true, false, false);
                        this.expObjectEntry = new ExpObjectEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.expObjectEntry
                        };
                    }
                    public static final class ExpObjectEntryEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                    {
                        public final ExpObjectIndexEnt expObjectIndex;

                        public final ExpObjectIDEnt expObjectID;

                        public final ExpObjectIDWildcardEnt expObjectIDWildcard;

                        public final ExpObjectSampleTypeEnt expObjectSampleType;

                        public final ExpObjectDeltaDiscontinuityIDEnt expObjectDeltaDiscontinuityID;

                        public final ExpObjectDiscontinuityIDWildcardEnt expObjectDiscontinuityIDWildcard;

                        public final ExpObjectDiscontinuityIDTypeEnt expObjectDiscontinuityIDType;

                        public final ExpObjectConditionalEnt expObjectConditional;

                        public final ExpObjectConditionalWildcardEnt expObjectConditionalWildcard;

                        public final ExpObjectEntryStatusEnt expObjectEntryStatus;

                        private ExpObjectEntryEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                        {
                            super(mib, parent, "expObjectEntry", "1.3.6.1.2.1.90.1.2.3.1", false, false, false, true);
                            this.expObjectIndex = new ExpObjectIndexEnt(mib, this);
                            this.expObjectID = new ExpObjectIDEnt(mib, this);
                            this.expObjectIDWildcard = new ExpObjectIDWildcardEnt(mib, this);
                            this.expObjectSampleType = new ExpObjectSampleTypeEnt(mib, this);
                            this.expObjectDeltaDiscontinuityID = new ExpObjectDeltaDiscontinuityIDEnt(mib, this);
                            this.expObjectDiscontinuityIDWildcard = new ExpObjectDiscontinuityIDWildcardEnt(mib, this);
                            this.expObjectDiscontinuityIDType = new ExpObjectDiscontinuityIDTypeEnt(mib, this);
                            this.expObjectConditional = new ExpObjectConditionalEnt(mib, this);
                            this.expObjectConditionalWildcard = new ExpObjectConditionalWildcardEnt(mib, this);
                            this.expObjectEntryStatus = new ExpObjectEntryStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.expObjectIndex,
                                this.expObjectID,
                                this.expObjectIDWildcard,
                                this.expObjectSampleType,
                                this.expObjectDeltaDiscontinuityID,
                                this.expObjectDiscontinuityIDWildcard,
                                this.expObjectDiscontinuityIDType,
                                this.expObjectConditional,
                                this.expObjectConditionalWildcard,
                                this.expObjectEntryStatus
                            };
                        }
                        public static final class ExpObjectIndexEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpObjectIndexEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expObjectIndex", "1.3.6.1.2.1.90.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpObjectIDEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpObjectIDEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expObjectID", "1.3.6.1.2.1.90.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpObjectIDWildcardEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpObjectIDWildcardEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expObjectIDWildcard", "1.3.6.1.2.1.90.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpObjectSampleTypeEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpObjectSampleTypeEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expObjectSampleType", "1.3.6.1.2.1.90.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpObjectDeltaDiscontinuityIDEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpObjectDeltaDiscontinuityIDEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expObjectDeltaDiscontinuityID", "1.3.6.1.2.1.90.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpObjectDiscontinuityIDWildcardEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpObjectDiscontinuityIDWildcardEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expObjectDiscontinuityIDWildcard", "1.3.6.1.2.1.90.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpObjectDiscontinuityIDTypeEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpObjectDiscontinuityIDTypeEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expObjectDiscontinuityIDType", "1.3.6.1.2.1.90.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpObjectConditionalEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpObjectConditionalEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expObjectConditional", "1.3.6.1.2.1.90.1.2.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpObjectConditionalWildcardEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpObjectConditionalWildcardEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expObjectConditionalWildcard", "1.3.6.1.2.1.90.1.2.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpObjectEntryStatusEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpObjectEntryStatusEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expObjectEntryStatus", "1.3.6.1.2.1.90.1.2.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class ExpValueEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
            {
                /** Expression Value Table*/
                public final ExpValueTableEnt expValueTable;

                private ExpValueEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                {
                    super(mib, parent, "expValue", "1.3.6.1.2.1.90.1.3", false, false, false, false);
                    this.expValueTable = new ExpValueTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.expValueTable
                    };
                }
                public static final class ExpValueTableEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                {
                    public final ExpValueEntryEnt expValueEntry;

                    private ExpValueTableEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                    {
                        super(mib, parent, "expValueTable", "1.3.6.1.2.1.90.1.3.1", false, true, false, false);
                        this.expValueEntry = new ExpValueEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.expValueEntry
                        };
                    }
                    public static final class ExpValueEntryEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                    {
                        public final ExpValueInstanceEnt expValueInstance;

                        public final ExpValueCounter32ValEnt expValueCounter32Val;

                        public final ExpValueUnsigned32ValEnt expValueUnsigned32Val;

                        public final ExpValueTimeTicksValEnt expValueTimeTicksVal;

                        public final ExpValueInteger32ValEnt expValueInteger32Val;

                        public final ExpValueIpAddressValEnt expValueIpAddressVal;

                        public final ExpValueOctetStringValEnt expValueOctetStringVal;

                        public final ExpValueOidValEnt expValueOidVal;

                        public final ExpValueCounter64ValEnt expValueCounter64Val;

                        private ExpValueEntryEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                        {
                            super(mib, parent, "expValueEntry", "1.3.6.1.2.1.90.1.3.1.1", false, false, false, true);
                            this.expValueInstance = new ExpValueInstanceEnt(mib, this);
                            this.expValueCounter32Val = new ExpValueCounter32ValEnt(mib, this);
                            this.expValueUnsigned32Val = new ExpValueUnsigned32ValEnt(mib, this);
                            this.expValueTimeTicksVal = new ExpValueTimeTicksValEnt(mib, this);
                            this.expValueInteger32Val = new ExpValueInteger32ValEnt(mib, this);
                            this.expValueIpAddressVal = new ExpValueIpAddressValEnt(mib, this);
                            this.expValueOctetStringVal = new ExpValueOctetStringValEnt(mib, this);
                            this.expValueOidVal = new ExpValueOidValEnt(mib, this);
                            this.expValueCounter64Val = new ExpValueCounter64ValEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.expValueInstance,
                                this.expValueCounter32Val,
                                this.expValueUnsigned32Val,
                                this.expValueTimeTicksVal,
                                this.expValueInteger32Val,
                                this.expValueIpAddressVal,
                                this.expValueOctetStringVal,
                                this.expValueOidVal,
                                this.expValueCounter64Val
                            };
                        }
                        public static final class ExpValueInstanceEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpValueInstanceEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expValueInstance", "1.3.6.1.2.1.90.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpValueCounter32ValEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpValueCounter32ValEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expValueCounter32Val", "1.3.6.1.2.1.90.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpValueUnsigned32ValEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpValueUnsigned32ValEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expValueUnsigned32Val", "1.3.6.1.2.1.90.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpValueTimeTicksValEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpValueTimeTicksValEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expValueTimeTicksVal", "1.3.6.1.2.1.90.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpValueInteger32ValEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpValueInteger32ValEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expValueInteger32Val", "1.3.6.1.2.1.90.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpValueIpAddressValEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpValueIpAddressValEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expValueIpAddressVal", "1.3.6.1.2.1.90.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpValueOctetStringValEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpValueOctetStringValEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expValueOctetStringVal", "1.3.6.1.2.1.90.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpValueOidValEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpValueOidValEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expValueOidVal", "1.3.6.1.2.1.90.1.3.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ExpValueCounter64ValEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                        {
                            private ExpValueCounter64ValEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                            {
                                super(mib, parent, "expValueCounter64Val", "1.3.6.1.2.1.90.1.3.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class DismanExpressionMIBConformanceEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
        {
            public final DismanExpressionMIBCompliancesEnt dismanExpressionMIBCompliances;

            public final DismanExpressionMIBGroupsEnt dismanExpressionMIBGroups;

            private DismanExpressionMIBConformanceEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
            {
                super(mib, parent, "dismanExpressionMIBConformance", "1.3.6.1.2.1.90.3", false, false, false, false);
                this.dismanExpressionMIBCompliances = new DismanExpressionMIBCompliancesEnt(mib, this);
                this.dismanExpressionMIBGroups = new DismanExpressionMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dismanExpressionMIBCompliances,
                    this.dismanExpressionMIBGroups
                };
            }
            public static final class DismanExpressionMIBCompliancesEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
            {
                /** Compliance*/
                public final DismanExpressionMIBComplianceEnt dismanExpressionMIBCompliance;

                private DismanExpressionMIBCompliancesEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                {
                    super(mib, parent, "dismanExpressionMIBCompliances", "1.3.6.1.2.1.90.3.1", false, false, false, false);
                    this.dismanExpressionMIBCompliance = new DismanExpressionMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dismanExpressionMIBCompliance
                    };
                }
                public static final class DismanExpressionMIBComplianceEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                {
                    private DismanExpressionMIBComplianceEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                    {
                        super(mib, parent, "dismanExpressionMIBCompliance", "1.3.6.1.2.1.90.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DismanExpressionMIBGroupsEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
            {
                /** Units of Conformance*/
                public final DismanExpressionResourceGroupEnt dismanExpressionResourceGroup;

                public final DismanExpressionDefinitionGroupEnt dismanExpressionDefinitionGroup;

                public final DismanExpressionValueGroupEnt dismanExpressionValueGroup;

                private DismanExpressionMIBGroupsEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                {
                    super(mib, parent, "dismanExpressionMIBGroups", "1.3.6.1.2.1.90.3.2", false, false, false, false);
                    this.dismanExpressionResourceGroup = new DismanExpressionResourceGroupEnt(mib, this);
                    this.dismanExpressionDefinitionGroup = new DismanExpressionDefinitionGroupEnt(mib, this);
                    this.dismanExpressionValueGroup = new DismanExpressionValueGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dismanExpressionResourceGroup,
                        this.dismanExpressionDefinitionGroup,
                        this.dismanExpressionValueGroup
                    };
                }
                public static final class DismanExpressionResourceGroupEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                {
                    private DismanExpressionResourceGroupEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                    {
                        super(mib, parent, "dismanExpressionResourceGroup", "1.3.6.1.2.1.90.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DismanExpressionDefinitionGroupEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                {
                    private DismanExpressionDefinitionGroupEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                    {
                        super(mib, parent, "dismanExpressionDefinitionGroup", "1.3.6.1.2.1.90.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DismanExpressionValueGroupEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
                {
                    private DismanExpressionValueGroupEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
                    {
                        super(mib, parent, "dismanExpressionValueGroup", "1.3.6.1.2.1.90.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class SysUpTimeInstanceEnt extends MIBEntry<DISMANEXPRESSIONMIBDef>
    {
        private SysUpTimeInstanceEnt(DISMANEXPRESSIONMIBDef mib, MIBEntry<DISMANEXPRESSIONMIBDef> parent)
        {
            super(mib, parent, "sysUpTimeInstance", "1.3.6.1.2.1.1.3.0", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
