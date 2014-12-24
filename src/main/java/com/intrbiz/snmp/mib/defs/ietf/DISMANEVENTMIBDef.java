package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class DISMANEVENTMIBDef extends MIB
{
    public static final DISMANEVENTMIBDef DISMANEVENTMIB = new DISMANEVENTMIBDef();

    /** 16 October 2000*/
    public final DismanEventMIBEnt dismanEventMIB;

    public final SysUpTimeInstanceEnt sysUpTimeInstance;

    private DISMANEVENTMIBDef()
    {
        super("DISMAN-EVENT-MIB");
        this.dismanEventMIB = new DismanEventMIBEnt(this, null);
        this.sysUpTimeInstance = new SysUpTimeInstanceEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dismanEventMIB,
            this.sysUpTimeInstance
        };
    }

    public static final class DismanEventMIBEnt extends MIBEntry<DISMANEVENTMIBDef>
    {
        public final DismanEventMIBObjectsEnt dismanEventMIBObjects;

        /** Notifications*/
        public final DismanEventMIBNotificationPrefixEnt dismanEventMIBNotificationPrefix;

        /** Conformance*/
        public final DismanEventMIBConformanceEnt dismanEventMIBConformance;

        private DismanEventMIBEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
        {
            super(mib, parent, "dismanEventMIB", "1.3.6.1.2.1.88", false, false, false, false);
            this.dismanEventMIBObjects = new DismanEventMIBObjectsEnt(mib, this);
            this.dismanEventMIBNotificationPrefix = new DismanEventMIBNotificationPrefixEnt(mib, this);
            this.dismanEventMIBConformance = new DismanEventMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dismanEventMIBObjects,
                this.dismanEventMIBNotificationPrefix,
                this.dismanEventMIBConformance
            };
        }
        public static final class DismanEventMIBObjectsEnt extends MIBEntry<DISMANEVENTMIBDef>
        {
            /** Management Triggered Event (MTE) objects*/
            public final MteResourceEnt mteResource;

            public final MteTriggerEnt mteTrigger;

            public final MteObjectsEnt mteObjects;

            public final MteEventEnt mteEvent;

            private DismanEventMIBObjectsEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
            {
                super(mib, parent, "dismanEventMIBObjects", "1.3.6.1.2.1.88.1", false, false, false, false);
                this.mteResource = new MteResourceEnt(mib, this);
                this.mteTrigger = new MteTriggerEnt(mib, this);
                this.mteObjects = new MteObjectsEnt(mib, this);
                this.mteEvent = new MteEventEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mteResource,
                    this.mteTrigger,
                    this.mteObjects,
                    this.mteEvent
                };
            }
            public static final class MteResourceEnt extends MIBEntry<DISMANEVENTMIBDef>
            {
                /** Resource Control Section*/
                public final MteResourceSampleMinimumEnt mteResourceSampleMinimum;

                public final MteResourceSampleInstanceMaximumEnt mteResourceSampleInstanceMaximum;

                public final MteResourceSampleInstancesEnt mteResourceSampleInstances;

                public final MteResourceSampleInstancesHighEnt mteResourceSampleInstancesHigh;

                public final MteResourceSampleInstanceLacksEnt mteResourceSampleInstanceLacks;

                private MteResourceEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                {
                    super(mib, parent, "mteResource", "1.3.6.1.2.1.88.1.1", false, false, false, false);
                    this.mteResourceSampleMinimum = new MteResourceSampleMinimumEnt(mib, this);
                    this.mteResourceSampleInstanceMaximum = new MteResourceSampleInstanceMaximumEnt(mib, this);
                    this.mteResourceSampleInstances = new MteResourceSampleInstancesEnt(mib, this);
                    this.mteResourceSampleInstancesHigh = new MteResourceSampleInstancesHighEnt(mib, this);
                    this.mteResourceSampleInstanceLacks = new MteResourceSampleInstanceLacksEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mteResourceSampleMinimum,
                        this.mteResourceSampleInstanceMaximum,
                        this.mteResourceSampleInstances,
                        this.mteResourceSampleInstancesHigh,
                        this.mteResourceSampleInstanceLacks
                    };
                }
                public static final class MteResourceSampleMinimumEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteResourceSampleMinimumEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteResourceSampleMinimum", "1.3.6.1.2.1.88.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MteResourceSampleInstanceMaximumEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteResourceSampleInstanceMaximumEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteResourceSampleInstanceMaximum", "1.3.6.1.2.1.88.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MteResourceSampleInstancesEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteResourceSampleInstancesEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteResourceSampleInstances", "1.3.6.1.2.1.88.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MteResourceSampleInstancesHighEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteResourceSampleInstancesHighEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteResourceSampleInstancesHigh", "1.3.6.1.2.1.88.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MteResourceSampleInstanceLacksEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteResourceSampleInstanceLacksEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteResourceSampleInstanceLacks", "1.3.6.1.2.1.88.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MteTriggerEnt extends MIBEntry<DISMANEVENTMIBDef>
            {
                /** Trigger Section
Counters*/
                public final MteTriggerFailuresEnt mteTriggerFailures;

                /** Trigger Table*/
                public final MteTriggerTableEnt mteTriggerTable;

                /** Trigger Delta Table*/
                public final MteTriggerDeltaTableEnt mteTriggerDeltaTable;

                /** Trigger Existence Table*/
                public final MteTriggerExistenceTableEnt mteTriggerExistenceTable;

                /** Trigger Boolean Table*/
                public final MteTriggerBooleanTableEnt mteTriggerBooleanTable;

                /** Trigger Threshold Table*/
                public final MteTriggerThresholdTableEnt mteTriggerThresholdTable;

                private MteTriggerEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                {
                    super(mib, parent, "mteTrigger", "1.3.6.1.2.1.88.1.2", false, false, false, false);
                    this.mteTriggerFailures = new MteTriggerFailuresEnt(mib, this);
                    this.mteTriggerTable = new MteTriggerTableEnt(mib, this);
                    this.mteTriggerDeltaTable = new MteTriggerDeltaTableEnt(mib, this);
                    this.mteTriggerExistenceTable = new MteTriggerExistenceTableEnt(mib, this);
                    this.mteTriggerBooleanTable = new MteTriggerBooleanTableEnt(mib, this);
                    this.mteTriggerThresholdTable = new MteTriggerThresholdTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mteTriggerFailures,
                        this.mteTriggerTable,
                        this.mteTriggerDeltaTable,
                        this.mteTriggerExistenceTable,
                        this.mteTriggerBooleanTable,
                        this.mteTriggerThresholdTable
                    };
                }
                public static final class MteTriggerFailuresEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteTriggerFailuresEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteTriggerFailures", "1.3.6.1.2.1.88.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MteTriggerTableEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    public final MteTriggerEntryEnt mteTriggerEntry;

                    private MteTriggerTableEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteTriggerTable", "1.3.6.1.2.1.88.1.2.2", false, true, false, false);
                        this.mteTriggerEntry = new MteTriggerEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mteTriggerEntry
                        };
                    }
                    public static final class MteTriggerEntryEnt extends MIBEntry<DISMANEVENTMIBDef>
                    {
                        public final MteOwnerEnt mteOwner;

                        public final MteTriggerNameEnt mteTriggerName;

                        public final MteTriggerCommentEnt mteTriggerComment;

                        public final MteTriggerTestEnt mteTriggerTest;

                        public final MteTriggerSampleTypeEnt mteTriggerSampleType;

                        public final MteTriggerValueIDEnt mteTriggerValueID;

                        public final MteTriggerValueIDWildcardEnt mteTriggerValueIDWildcard;

                        public final MteTriggerTargetTagEnt mteTriggerTargetTag;

                        public final MteTriggerContextNameEnt mteTriggerContextName;

                        public final MteTriggerContextNameWildcardEnt mteTriggerContextNameWildcard;

                        public final MteTriggerFrequencyEnt mteTriggerFrequency;

                        public final MteTriggerObjectsOwnerEnt mteTriggerObjectsOwner;

                        public final MteTriggerObjectsEnt mteTriggerObjects;

                        public final MteTriggerEnabledEnt mteTriggerEnabled;

                        public final MteTriggerEntryStatusEnt mteTriggerEntryStatus;

                        private MteTriggerEntryEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                        {
                            super(mib, parent, "mteTriggerEntry", "1.3.6.1.2.1.88.1.2.2.1", false, false, false, true);
                            this.mteOwner = new MteOwnerEnt(mib, this);
                            this.mteTriggerName = new MteTriggerNameEnt(mib, this);
                            this.mteTriggerComment = new MteTriggerCommentEnt(mib, this);
                            this.mteTriggerTest = new MteTriggerTestEnt(mib, this);
                            this.mteTriggerSampleType = new MteTriggerSampleTypeEnt(mib, this);
                            this.mteTriggerValueID = new MteTriggerValueIDEnt(mib, this);
                            this.mteTriggerValueIDWildcard = new MteTriggerValueIDWildcardEnt(mib, this);
                            this.mteTriggerTargetTag = new MteTriggerTargetTagEnt(mib, this);
                            this.mteTriggerContextName = new MteTriggerContextNameEnt(mib, this);
                            this.mteTriggerContextNameWildcard = new MteTriggerContextNameWildcardEnt(mib, this);
                            this.mteTriggerFrequency = new MteTriggerFrequencyEnt(mib, this);
                            this.mteTriggerObjectsOwner = new MteTriggerObjectsOwnerEnt(mib, this);
                            this.mteTriggerObjects = new MteTriggerObjectsEnt(mib, this);
                            this.mteTriggerEnabled = new MteTriggerEnabledEnt(mib, this);
                            this.mteTriggerEntryStatus = new MteTriggerEntryStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mteOwner,
                                this.mteTriggerName,
                                this.mteTriggerComment,
                                this.mteTriggerTest,
                                this.mteTriggerSampleType,
                                this.mteTriggerValueID,
                                this.mteTriggerValueIDWildcard,
                                this.mteTriggerTargetTag,
                                this.mteTriggerContextName,
                                this.mteTriggerContextNameWildcard,
                                this.mteTriggerFrequency,
                                this.mteTriggerObjectsOwner,
                                this.mteTriggerObjects,
                                this.mteTriggerEnabled,
                                this.mteTriggerEntryStatus
                            };
                        }
                        public static final class MteOwnerEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteOwnerEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteOwner", "1.3.6.1.2.1.88.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerNameEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerNameEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerName", "1.3.6.1.2.1.88.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerCommentEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerCommentEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerComment", "1.3.6.1.2.1.88.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerTestEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerTestEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerTest", "1.3.6.1.2.1.88.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerSampleTypeEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerSampleTypeEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerSampleType", "1.3.6.1.2.1.88.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerValueIDEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerValueIDEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerValueID", "1.3.6.1.2.1.88.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerValueIDWildcardEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerValueIDWildcardEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerValueIDWildcard", "1.3.6.1.2.1.88.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerTargetTagEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerTargetTagEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerTargetTag", "1.3.6.1.2.1.88.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerContextNameEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerContextNameEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerContextName", "1.3.6.1.2.1.88.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerContextNameWildcardEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerContextNameWildcardEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerContextNameWildcard", "1.3.6.1.2.1.88.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerFrequencyEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerFrequencyEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerFrequency", "1.3.6.1.2.1.88.1.2.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerObjectsOwnerEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerObjectsOwnerEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerObjectsOwner", "1.3.6.1.2.1.88.1.2.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerObjectsEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerObjectsEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerObjects", "1.3.6.1.2.1.88.1.2.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerEnabledEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerEnabledEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerEnabled", "1.3.6.1.2.1.88.1.2.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerEntryStatusEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerEntryStatusEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerEntryStatus", "1.3.6.1.2.1.88.1.2.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MteTriggerDeltaTableEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    public final MteTriggerDeltaEntryEnt mteTriggerDeltaEntry;

                    private MteTriggerDeltaTableEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteTriggerDeltaTable", "1.3.6.1.2.1.88.1.2.3", false, true, false, false);
                        this.mteTriggerDeltaEntry = new MteTriggerDeltaEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mteTriggerDeltaEntry
                        };
                    }
                    public static final class MteTriggerDeltaEntryEnt extends MIBEntry<DISMANEVENTMIBDef>
                    {
                        public final MteTriggerDeltaDiscontinuityIDEnt mteTriggerDeltaDiscontinuityID;

                        public final MteTriggerDeltaDiscontinuityIDWildcardEnt mteTriggerDeltaDiscontinuityIDWildcard;

                        public final MteTriggerDeltaDiscontinuityIDTypeEnt mteTriggerDeltaDiscontinuityIDType;

                        private MteTriggerDeltaEntryEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                        {
                            super(mib, parent, "mteTriggerDeltaEntry", "1.3.6.1.2.1.88.1.2.3.1", false, false, false, true);
                            this.mteTriggerDeltaDiscontinuityID = new MteTriggerDeltaDiscontinuityIDEnt(mib, this);
                            this.mteTriggerDeltaDiscontinuityIDWildcard = new MteTriggerDeltaDiscontinuityIDWildcardEnt(mib, this);
                            this.mteTriggerDeltaDiscontinuityIDType = new MteTriggerDeltaDiscontinuityIDTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mteTriggerDeltaDiscontinuityID,
                                this.mteTriggerDeltaDiscontinuityIDWildcard,
                                this.mteTriggerDeltaDiscontinuityIDType
                            };
                        }
                        public static final class MteTriggerDeltaDiscontinuityIDEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerDeltaDiscontinuityIDEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerDeltaDiscontinuityID", "1.3.6.1.2.1.88.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerDeltaDiscontinuityIDWildcardEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerDeltaDiscontinuityIDWildcardEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerDeltaDiscontinuityIDWildcard", "1.3.6.1.2.1.88.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerDeltaDiscontinuityIDTypeEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerDeltaDiscontinuityIDTypeEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerDeltaDiscontinuityIDType", "1.3.6.1.2.1.88.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MteTriggerExistenceTableEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    public final MteTriggerExistenceEntryEnt mteTriggerExistenceEntry;

                    private MteTriggerExistenceTableEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteTriggerExistenceTable", "1.3.6.1.2.1.88.1.2.4", false, true, false, false);
                        this.mteTriggerExistenceEntry = new MteTriggerExistenceEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mteTriggerExistenceEntry
                        };
                    }
                    public static final class MteTriggerExistenceEntryEnt extends MIBEntry<DISMANEVENTMIBDef>
                    {
                        public final MteTriggerExistenceTestEnt mteTriggerExistenceTest;

                        public final MteTriggerExistenceStartupEnt mteTriggerExistenceStartup;

                        public final MteTriggerExistenceObjectsOwnerEnt mteTriggerExistenceObjectsOwner;

                        public final MteTriggerExistenceObjectsEnt mteTriggerExistenceObjects;

                        public final MteTriggerExistenceEventOwnerEnt mteTriggerExistenceEventOwner;

                        public final MteTriggerExistenceEventEnt mteTriggerExistenceEvent;

                        private MteTriggerExistenceEntryEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                        {
                            super(mib, parent, "mteTriggerExistenceEntry", "1.3.6.1.2.1.88.1.2.4.1", false, false, false, true);
                            this.mteTriggerExistenceTest = new MteTriggerExistenceTestEnt(mib, this);
                            this.mteTriggerExistenceStartup = new MteTriggerExistenceStartupEnt(mib, this);
                            this.mteTriggerExistenceObjectsOwner = new MteTriggerExistenceObjectsOwnerEnt(mib, this);
                            this.mteTriggerExistenceObjects = new MteTriggerExistenceObjectsEnt(mib, this);
                            this.mteTriggerExistenceEventOwner = new MteTriggerExistenceEventOwnerEnt(mib, this);
                            this.mteTriggerExistenceEvent = new MteTriggerExistenceEventEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mteTriggerExistenceTest,
                                this.mteTriggerExistenceStartup,
                                this.mteTriggerExistenceObjectsOwner,
                                this.mteTriggerExistenceObjects,
                                this.mteTriggerExistenceEventOwner,
                                this.mteTriggerExistenceEvent
                            };
                        }
                        public static final class MteTriggerExistenceTestEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerExistenceTestEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerExistenceTest", "1.3.6.1.2.1.88.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerExistenceStartupEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerExistenceStartupEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerExistenceStartup", "1.3.6.1.2.1.88.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerExistenceObjectsOwnerEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerExistenceObjectsOwnerEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerExistenceObjectsOwner", "1.3.6.1.2.1.88.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerExistenceObjectsEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerExistenceObjectsEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerExistenceObjects", "1.3.6.1.2.1.88.1.2.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerExistenceEventOwnerEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerExistenceEventOwnerEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerExistenceEventOwner", "1.3.6.1.2.1.88.1.2.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerExistenceEventEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerExistenceEventEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerExistenceEvent", "1.3.6.1.2.1.88.1.2.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MteTriggerBooleanTableEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    public final MteTriggerBooleanEntryEnt mteTriggerBooleanEntry;

                    private MteTriggerBooleanTableEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteTriggerBooleanTable", "1.3.6.1.2.1.88.1.2.5", false, true, false, false);
                        this.mteTriggerBooleanEntry = new MteTriggerBooleanEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mteTriggerBooleanEntry
                        };
                    }
                    public static final class MteTriggerBooleanEntryEnt extends MIBEntry<DISMANEVENTMIBDef>
                    {
                        public final MteTriggerBooleanComparisonEnt mteTriggerBooleanComparison;

                        public final MteTriggerBooleanValueEnt mteTriggerBooleanValue;

                        public final MteTriggerBooleanStartupEnt mteTriggerBooleanStartup;

                        public final MteTriggerBooleanObjectsOwnerEnt mteTriggerBooleanObjectsOwner;

                        public final MteTriggerBooleanObjectsEnt mteTriggerBooleanObjects;

                        public final MteTriggerBooleanEventOwnerEnt mteTriggerBooleanEventOwner;

                        public final MteTriggerBooleanEventEnt mteTriggerBooleanEvent;

                        private MteTriggerBooleanEntryEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                        {
                            super(mib, parent, "mteTriggerBooleanEntry", "1.3.6.1.2.1.88.1.2.5.1", false, false, false, true);
                            this.mteTriggerBooleanComparison = new MteTriggerBooleanComparisonEnt(mib, this);
                            this.mteTriggerBooleanValue = new MteTriggerBooleanValueEnt(mib, this);
                            this.mteTriggerBooleanStartup = new MteTriggerBooleanStartupEnt(mib, this);
                            this.mteTriggerBooleanObjectsOwner = new MteTriggerBooleanObjectsOwnerEnt(mib, this);
                            this.mteTriggerBooleanObjects = new MteTriggerBooleanObjectsEnt(mib, this);
                            this.mteTriggerBooleanEventOwner = new MteTriggerBooleanEventOwnerEnt(mib, this);
                            this.mteTriggerBooleanEvent = new MteTriggerBooleanEventEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mteTriggerBooleanComparison,
                                this.mteTriggerBooleanValue,
                                this.mteTriggerBooleanStartup,
                                this.mteTriggerBooleanObjectsOwner,
                                this.mteTriggerBooleanObjects,
                                this.mteTriggerBooleanEventOwner,
                                this.mteTriggerBooleanEvent
                            };
                        }
                        public static final class MteTriggerBooleanComparisonEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerBooleanComparisonEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerBooleanComparison", "1.3.6.1.2.1.88.1.2.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerBooleanValueEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerBooleanValueEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerBooleanValue", "1.3.6.1.2.1.88.1.2.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerBooleanStartupEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerBooleanStartupEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerBooleanStartup", "1.3.6.1.2.1.88.1.2.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerBooleanObjectsOwnerEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerBooleanObjectsOwnerEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerBooleanObjectsOwner", "1.3.6.1.2.1.88.1.2.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerBooleanObjectsEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerBooleanObjectsEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerBooleanObjects", "1.3.6.1.2.1.88.1.2.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerBooleanEventOwnerEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerBooleanEventOwnerEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerBooleanEventOwner", "1.3.6.1.2.1.88.1.2.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerBooleanEventEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerBooleanEventEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerBooleanEvent", "1.3.6.1.2.1.88.1.2.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MteTriggerThresholdTableEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    public final MteTriggerThresholdEntryEnt mteTriggerThresholdEntry;

                    private MteTriggerThresholdTableEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteTriggerThresholdTable", "1.3.6.1.2.1.88.1.2.6", false, true, false, false);
                        this.mteTriggerThresholdEntry = new MteTriggerThresholdEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mteTriggerThresholdEntry
                        };
                    }
                    public static final class MteTriggerThresholdEntryEnt extends MIBEntry<DISMANEVENTMIBDef>
                    {
                        public final MteTriggerThresholdStartupEnt mteTriggerThresholdStartup;

                        public final MteTriggerThresholdRisingEnt mteTriggerThresholdRising;

                        public final MteTriggerThresholdFallingEnt mteTriggerThresholdFalling;

                        public final MteTriggerThresholdDeltaRisingEnt mteTriggerThresholdDeltaRising;

                        public final MteTriggerThresholdDeltaFallingEnt mteTriggerThresholdDeltaFalling;

                        public final MteTriggerThresholdObjectsOwnerEnt mteTriggerThresholdObjectsOwner;

                        public final MteTriggerThresholdObjectsEnt mteTriggerThresholdObjects;

                        public final MteTriggerThresholdRisingEventOwnerEnt mteTriggerThresholdRisingEventOwner;

                        public final MteTriggerThresholdRisingEventEnt mteTriggerThresholdRisingEvent;

                        public final MteTriggerThresholdFallingEventOwnerEnt mteTriggerThresholdFallingEventOwner;

                        public final MteTriggerThresholdFallingEventEnt mteTriggerThresholdFallingEvent;

                        public final MteTriggerThresholdDeltaRisingEventOwnerEnt mteTriggerThresholdDeltaRisingEventOwner;

                        public final MteTriggerThresholdDeltaRisingEventEnt mteTriggerThresholdDeltaRisingEvent;

                        public final MteTriggerThresholdDeltaFallingEventOwnerEnt mteTriggerThresholdDeltaFallingEventOwner;

                        public final MteTriggerThresholdDeltaFallingEventEnt mteTriggerThresholdDeltaFallingEvent;

                        private MteTriggerThresholdEntryEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                        {
                            super(mib, parent, "mteTriggerThresholdEntry", "1.3.6.1.2.1.88.1.2.6.1", false, false, false, true);
                            this.mteTriggerThresholdStartup = new MteTriggerThresholdStartupEnt(mib, this);
                            this.mteTriggerThresholdRising = new MteTriggerThresholdRisingEnt(mib, this);
                            this.mteTriggerThresholdFalling = new MteTriggerThresholdFallingEnt(mib, this);
                            this.mteTriggerThresholdDeltaRising = new MteTriggerThresholdDeltaRisingEnt(mib, this);
                            this.mteTriggerThresholdDeltaFalling = new MteTriggerThresholdDeltaFallingEnt(mib, this);
                            this.mteTriggerThresholdObjectsOwner = new MteTriggerThresholdObjectsOwnerEnt(mib, this);
                            this.mteTriggerThresholdObjects = new MteTriggerThresholdObjectsEnt(mib, this);
                            this.mteTriggerThresholdRisingEventOwner = new MteTriggerThresholdRisingEventOwnerEnt(mib, this);
                            this.mteTriggerThresholdRisingEvent = new MteTriggerThresholdRisingEventEnt(mib, this);
                            this.mteTriggerThresholdFallingEventOwner = new MteTriggerThresholdFallingEventOwnerEnt(mib, this);
                            this.mteTriggerThresholdFallingEvent = new MteTriggerThresholdFallingEventEnt(mib, this);
                            this.mteTriggerThresholdDeltaRisingEventOwner = new MteTriggerThresholdDeltaRisingEventOwnerEnt(mib, this);
                            this.mteTriggerThresholdDeltaRisingEvent = new MteTriggerThresholdDeltaRisingEventEnt(mib, this);
                            this.mteTriggerThresholdDeltaFallingEventOwner = new MteTriggerThresholdDeltaFallingEventOwnerEnt(mib, this);
                            this.mteTriggerThresholdDeltaFallingEvent = new MteTriggerThresholdDeltaFallingEventEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mteTriggerThresholdStartup,
                                this.mteTriggerThresholdRising,
                                this.mteTriggerThresholdFalling,
                                this.mteTriggerThresholdDeltaRising,
                                this.mteTriggerThresholdDeltaFalling,
                                this.mteTriggerThresholdObjectsOwner,
                                this.mteTriggerThresholdObjects,
                                this.mteTriggerThresholdRisingEventOwner,
                                this.mteTriggerThresholdRisingEvent,
                                this.mteTriggerThresholdFallingEventOwner,
                                this.mteTriggerThresholdFallingEvent,
                                this.mteTriggerThresholdDeltaRisingEventOwner,
                                this.mteTriggerThresholdDeltaRisingEvent,
                                this.mteTriggerThresholdDeltaFallingEventOwner,
                                this.mteTriggerThresholdDeltaFallingEvent
                            };
                        }
                        public static final class MteTriggerThresholdStartupEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerThresholdStartupEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerThresholdStartup", "1.3.6.1.2.1.88.1.2.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerThresholdRisingEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerThresholdRisingEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerThresholdRising", "1.3.6.1.2.1.88.1.2.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerThresholdFallingEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerThresholdFallingEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerThresholdFalling", "1.3.6.1.2.1.88.1.2.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerThresholdDeltaRisingEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerThresholdDeltaRisingEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerThresholdDeltaRising", "1.3.6.1.2.1.88.1.2.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerThresholdDeltaFallingEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerThresholdDeltaFallingEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerThresholdDeltaFalling", "1.3.6.1.2.1.88.1.2.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerThresholdObjectsOwnerEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerThresholdObjectsOwnerEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerThresholdObjectsOwner", "1.3.6.1.2.1.88.1.2.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerThresholdObjectsEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerThresholdObjectsEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerThresholdObjects", "1.3.6.1.2.1.88.1.2.6.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerThresholdRisingEventOwnerEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerThresholdRisingEventOwnerEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerThresholdRisingEventOwner", "1.3.6.1.2.1.88.1.2.6.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerThresholdRisingEventEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerThresholdRisingEventEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerThresholdRisingEvent", "1.3.6.1.2.1.88.1.2.6.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerThresholdFallingEventOwnerEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerThresholdFallingEventOwnerEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerThresholdFallingEventOwner", "1.3.6.1.2.1.88.1.2.6.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerThresholdFallingEventEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerThresholdFallingEventEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerThresholdFallingEvent", "1.3.6.1.2.1.88.1.2.6.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerThresholdDeltaRisingEventOwnerEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerThresholdDeltaRisingEventOwnerEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerThresholdDeltaRisingEventOwner", "1.3.6.1.2.1.88.1.2.6.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerThresholdDeltaRisingEventEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerThresholdDeltaRisingEventEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerThresholdDeltaRisingEvent", "1.3.6.1.2.1.88.1.2.6.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerThresholdDeltaFallingEventOwnerEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerThresholdDeltaFallingEventOwnerEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerThresholdDeltaFallingEventOwner", "1.3.6.1.2.1.88.1.2.6.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteTriggerThresholdDeltaFallingEventEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteTriggerThresholdDeltaFallingEventEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteTriggerThresholdDeltaFallingEvent", "1.3.6.1.2.1.88.1.2.6.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class MteObjectsEnt extends MIBEntry<DISMANEVENTMIBDef>
            {
                /** Objects Table*/
                public final MteObjectsTableEnt mteObjectsTable;

                private MteObjectsEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                {
                    super(mib, parent, "mteObjects", "1.3.6.1.2.1.88.1.3", false, false, false, false);
                    this.mteObjectsTable = new MteObjectsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mteObjectsTable
                    };
                }
                public static final class MteObjectsTableEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    public final MteObjectsEntryEnt mteObjectsEntry;

                    private MteObjectsTableEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteObjectsTable", "1.3.6.1.2.1.88.1.3.1", false, true, false, false);
                        this.mteObjectsEntry = new MteObjectsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mteObjectsEntry
                        };
                    }
                    public static final class MteObjectsEntryEnt extends MIBEntry<DISMANEVENTMIBDef>
                    {
                        public final MteObjectsNameEnt mteObjectsName;

                        public final MteObjectsIndexEnt mteObjectsIndex;

                        public final MteObjectsIDEnt mteObjectsID;

                        public final MteObjectsIDWildcardEnt mteObjectsIDWildcard;

                        public final MteObjectsEntryStatusEnt mteObjectsEntryStatus;

                        private MteObjectsEntryEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                        {
                            super(mib, parent, "mteObjectsEntry", "1.3.6.1.2.1.88.1.3.1.1", false, false, false, true);
                            this.mteObjectsName = new MteObjectsNameEnt(mib, this);
                            this.mteObjectsIndex = new MteObjectsIndexEnt(mib, this);
                            this.mteObjectsID = new MteObjectsIDEnt(mib, this);
                            this.mteObjectsIDWildcard = new MteObjectsIDWildcardEnt(mib, this);
                            this.mteObjectsEntryStatus = new MteObjectsEntryStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mteObjectsName,
                                this.mteObjectsIndex,
                                this.mteObjectsID,
                                this.mteObjectsIDWildcard,
                                this.mteObjectsEntryStatus
                            };
                        }
                        public static final class MteObjectsNameEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteObjectsNameEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteObjectsName", "1.3.6.1.2.1.88.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteObjectsIndexEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteObjectsIndexEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteObjectsIndex", "1.3.6.1.2.1.88.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteObjectsIDEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteObjectsIDEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteObjectsID", "1.3.6.1.2.1.88.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteObjectsIDWildcardEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteObjectsIDWildcardEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteObjectsIDWildcard", "1.3.6.1.2.1.88.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteObjectsEntryStatusEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteObjectsEntryStatusEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteObjectsEntryStatus", "1.3.6.1.2.1.88.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class MteEventEnt extends MIBEntry<DISMANEVENTMIBDef>
            {
                /** Event Section
Counters*/
                public final MteEventFailuresEnt mteEventFailures;

                /** Event Table*/
                public final MteEventTableEnt mteEventTable;

                /** Event Notification Table*/
                public final MteEventNotificationTableEnt mteEventNotificationTable;

                /** Event Set Table*/
                public final MteEventSetTableEnt mteEventSetTable;

                private MteEventEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                {
                    super(mib, parent, "mteEvent", "1.3.6.1.2.1.88.1.4", false, false, false, false);
                    this.mteEventFailures = new MteEventFailuresEnt(mib, this);
                    this.mteEventTable = new MteEventTableEnt(mib, this);
                    this.mteEventNotificationTable = new MteEventNotificationTableEnt(mib, this);
                    this.mteEventSetTable = new MteEventSetTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mteEventFailures,
                        this.mteEventTable,
                        this.mteEventNotificationTable,
                        this.mteEventSetTable
                    };
                }
                public static final class MteEventFailuresEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteEventFailuresEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteEventFailures", "1.3.6.1.2.1.88.1.4.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MteEventTableEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    public final MteEventEntryEnt mteEventEntry;

                    private MteEventTableEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteEventTable", "1.3.6.1.2.1.88.1.4.2", false, true, false, false);
                        this.mteEventEntry = new MteEventEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mteEventEntry
                        };
                    }
                    public static final class MteEventEntryEnt extends MIBEntry<DISMANEVENTMIBDef>
                    {
                        public final MteEventNameEnt mteEventName;

                        public final MteEventCommentEnt mteEventComment;

                        /** No bits set.*/
                        public final MteEventActionsEnt mteEventActions;

                        public final MteEventEnabledEnt mteEventEnabled;

                        public final MteEventEntryStatusEnt mteEventEntryStatus;

                        private MteEventEntryEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                        {
                            super(mib, parent, "mteEventEntry", "1.3.6.1.2.1.88.1.4.2.1", false, false, false, true);
                            this.mteEventName = new MteEventNameEnt(mib, this);
                            this.mteEventComment = new MteEventCommentEnt(mib, this);
                            this.mteEventActions = new MteEventActionsEnt(mib, this);
                            this.mteEventEnabled = new MteEventEnabledEnt(mib, this);
                            this.mteEventEntryStatus = new MteEventEntryStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mteEventName,
                                this.mteEventComment,
                                this.mteEventActions,
                                this.mteEventEnabled,
                                this.mteEventEntryStatus
                            };
                        }
                        public static final class MteEventNameEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteEventNameEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteEventName", "1.3.6.1.2.1.88.1.4.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteEventCommentEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteEventCommentEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteEventComment", "1.3.6.1.2.1.88.1.4.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteEventActionsEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteEventActionsEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteEventActions", "1.3.6.1.2.1.88.1.4.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteEventEnabledEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteEventEnabledEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteEventEnabled", "1.3.6.1.2.1.88.1.4.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteEventEntryStatusEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteEventEntryStatusEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteEventEntryStatus", "1.3.6.1.2.1.88.1.4.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MteEventNotificationTableEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    public final MteEventNotificationEntryEnt mteEventNotificationEntry;

                    private MteEventNotificationTableEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteEventNotificationTable", "1.3.6.1.2.1.88.1.4.3", false, true, false, false);
                        this.mteEventNotificationEntry = new MteEventNotificationEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mteEventNotificationEntry
                        };
                    }
                    public static final class MteEventNotificationEntryEnt extends MIBEntry<DISMANEVENTMIBDef>
                    {
                        public final MteEventNotificationEnt mteEventNotification;

                        public final MteEventNotificationObjectsOwnerEnt mteEventNotificationObjectsOwner;

                        public final MteEventNotificationObjectsEnt mteEventNotificationObjects;

                        private MteEventNotificationEntryEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                        {
                            super(mib, parent, "mteEventNotificationEntry", "1.3.6.1.2.1.88.1.4.3.1", false, false, false, true);
                            this.mteEventNotification = new MteEventNotificationEnt(mib, this);
                            this.mteEventNotificationObjectsOwner = new MteEventNotificationObjectsOwnerEnt(mib, this);
                            this.mteEventNotificationObjects = new MteEventNotificationObjectsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mteEventNotification,
                                this.mteEventNotificationObjectsOwner,
                                this.mteEventNotificationObjects
                            };
                        }
                        public static final class MteEventNotificationEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteEventNotificationEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteEventNotification", "1.3.6.1.2.1.88.1.4.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteEventNotificationObjectsOwnerEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteEventNotificationObjectsOwnerEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteEventNotificationObjectsOwner", "1.3.6.1.2.1.88.1.4.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteEventNotificationObjectsEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteEventNotificationObjectsEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteEventNotificationObjects", "1.3.6.1.2.1.88.1.4.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MteEventSetTableEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    public final MteEventSetEntryEnt mteEventSetEntry;

                    private MteEventSetTableEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteEventSetTable", "1.3.6.1.2.1.88.1.4.4", false, true, false, false);
                        this.mteEventSetEntry = new MteEventSetEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mteEventSetEntry
                        };
                    }
                    public static final class MteEventSetEntryEnt extends MIBEntry<DISMANEVENTMIBDef>
                    {
                        public final MteEventSetObjectEnt mteEventSetObject;

                        public final MteEventSetObjectWildcardEnt mteEventSetObjectWildcard;

                        public final MteEventSetValueEnt mteEventSetValue;

                        public final MteEventSetTargetTagEnt mteEventSetTargetTag;

                        public final MteEventSetContextNameEnt mteEventSetContextName;

                        public final MteEventSetContextNameWildcardEnt mteEventSetContextNameWildcard;

                        private MteEventSetEntryEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                        {
                            super(mib, parent, "mteEventSetEntry", "1.3.6.1.2.1.88.1.4.4.1", false, false, false, true);
                            this.mteEventSetObject = new MteEventSetObjectEnt(mib, this);
                            this.mteEventSetObjectWildcard = new MteEventSetObjectWildcardEnt(mib, this);
                            this.mteEventSetValue = new MteEventSetValueEnt(mib, this);
                            this.mteEventSetTargetTag = new MteEventSetTargetTagEnt(mib, this);
                            this.mteEventSetContextName = new MteEventSetContextNameEnt(mib, this);
                            this.mteEventSetContextNameWildcard = new MteEventSetContextNameWildcardEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mteEventSetObject,
                                this.mteEventSetObjectWildcard,
                                this.mteEventSetValue,
                                this.mteEventSetTargetTag,
                                this.mteEventSetContextName,
                                this.mteEventSetContextNameWildcard
                            };
                        }
                        public static final class MteEventSetObjectEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteEventSetObjectEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteEventSetObject", "1.3.6.1.2.1.88.1.4.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteEventSetObjectWildcardEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteEventSetObjectWildcardEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteEventSetObjectWildcard", "1.3.6.1.2.1.88.1.4.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteEventSetValueEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteEventSetValueEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteEventSetValue", "1.3.6.1.2.1.88.1.4.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteEventSetTargetTagEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteEventSetTargetTagEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteEventSetTargetTag", "1.3.6.1.2.1.88.1.4.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteEventSetContextNameEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteEventSetContextNameEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteEventSetContextName", "1.3.6.1.2.1.88.1.4.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MteEventSetContextNameWildcardEnt extends MIBEntry<DISMANEVENTMIBDef>
                        {
                            private MteEventSetContextNameWildcardEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                            {
                                super(mib, parent, "mteEventSetContextNameWildcard", "1.3.6.1.2.1.88.1.4.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class DismanEventMIBNotificationPrefixEnt extends MIBEntry<DISMANEVENTMIBDef>
        {
            public final DismanEventMIBNotificationsEnt dismanEventMIBNotifications;

            public final DismanEventMIBNotificationObjectsEnt dismanEventMIBNotificationObjects;

            private DismanEventMIBNotificationPrefixEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
            {
                super(mib, parent, "dismanEventMIBNotificationPrefix", "1.3.6.1.2.1.88.2", false, false, false, false);
                this.dismanEventMIBNotifications = new DismanEventMIBNotificationsEnt(mib, this);
                this.dismanEventMIBNotificationObjects = new DismanEventMIBNotificationObjectsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dismanEventMIBNotifications,
                    this.dismanEventMIBNotificationObjects
                };
            }
            public static final class DismanEventMIBNotificationsEnt extends MIBEntry<DISMANEVENTMIBDef>
            {
                /** Notifications*/
                public final MteTriggerFiredEnt mteTriggerFired;

                public final MteTriggerRisingEnt mteTriggerRising;

                public final MteTriggerFallingEnt mteTriggerFalling;

                public final MteTriggerFailureEnt mteTriggerFailure;

                public final MteEventSetFailureEnt mteEventSetFailure;

                private DismanEventMIBNotificationsEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                {
                    super(mib, parent, "dismanEventMIBNotifications", "1.3.6.1.2.1.88.2.0", false, false, false, false);
                    this.mteTriggerFired = new MteTriggerFiredEnt(mib, this);
                    this.mteTriggerRising = new MteTriggerRisingEnt(mib, this);
                    this.mteTriggerFalling = new MteTriggerFallingEnt(mib, this);
                    this.mteTriggerFailure = new MteTriggerFailureEnt(mib, this);
                    this.mteEventSetFailure = new MteEventSetFailureEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mteTriggerFired,
                        this.mteTriggerRising,
                        this.mteTriggerFalling,
                        this.mteTriggerFailure,
                        this.mteEventSetFailure
                    };
                }
                public static final class MteTriggerFiredEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteTriggerFiredEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteTriggerFired", "1.3.6.1.2.1.88.2.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MteTriggerRisingEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteTriggerRisingEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteTriggerRising", "1.3.6.1.2.1.88.2.0.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MteTriggerFallingEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteTriggerFallingEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteTriggerFalling", "1.3.6.1.2.1.88.2.0.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MteTriggerFailureEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteTriggerFailureEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteTriggerFailure", "1.3.6.1.2.1.88.2.0.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MteEventSetFailureEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteEventSetFailureEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteEventSetFailure", "1.3.6.1.2.1.88.2.0.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DismanEventMIBNotificationObjectsEnt extends MIBEntry<DISMANEVENTMIBDef>
            {
                /** Notification Objects*/
                public final MteHotTriggerEnt mteHotTrigger;

                public final MteHotTargetNameEnt mteHotTargetName;

                public final MteHotContextNameEnt mteHotContextName;

                public final MteHotOIDEnt mteHotOID;

                public final MteHotValueEnt mteHotValue;

                public final MteFailedReasonEnt mteFailedReason;

                private DismanEventMIBNotificationObjectsEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                {
                    super(mib, parent, "dismanEventMIBNotificationObjects", "1.3.6.1.2.1.88.2.1", false, false, false, false);
                    this.mteHotTrigger = new MteHotTriggerEnt(mib, this);
                    this.mteHotTargetName = new MteHotTargetNameEnt(mib, this);
                    this.mteHotContextName = new MteHotContextNameEnt(mib, this);
                    this.mteHotOID = new MteHotOIDEnt(mib, this);
                    this.mteHotValue = new MteHotValueEnt(mib, this);
                    this.mteFailedReason = new MteFailedReasonEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mteHotTrigger,
                        this.mteHotTargetName,
                        this.mteHotContextName,
                        this.mteHotOID,
                        this.mteHotValue,
                        this.mteFailedReason
                    };
                }
                public static final class MteHotTriggerEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteHotTriggerEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteHotTrigger", "1.3.6.1.2.1.88.2.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MteHotTargetNameEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteHotTargetNameEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteHotTargetName", "1.3.6.1.2.1.88.2.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MteHotContextNameEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteHotContextNameEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteHotContextName", "1.3.6.1.2.1.88.2.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MteHotOIDEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteHotOIDEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteHotOID", "1.3.6.1.2.1.88.2.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MteHotValueEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteHotValueEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteHotValue", "1.3.6.1.2.1.88.2.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MteFailedReasonEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private MteFailedReasonEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "mteFailedReason", "1.3.6.1.2.1.88.2.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class DismanEventMIBConformanceEnt extends MIBEntry<DISMANEVENTMIBDef>
        {
            public final DismanEventMIBCompliancesEnt dismanEventMIBCompliances;

            public final DismanEventMIBGroupsEnt dismanEventMIBGroups;

            private DismanEventMIBConformanceEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
            {
                super(mib, parent, "dismanEventMIBConformance", "1.3.6.1.2.1.88.3", false, false, false, false);
                this.dismanEventMIBCompliances = new DismanEventMIBCompliancesEnt(mib, this);
                this.dismanEventMIBGroups = new DismanEventMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dismanEventMIBCompliances,
                    this.dismanEventMIBGroups
                };
            }
            public static final class DismanEventMIBCompliancesEnt extends MIBEntry<DISMANEVENTMIBDef>
            {
                /** Compliance*/
                public final DismanEventMIBComplianceEnt dismanEventMIBCompliance;

                private DismanEventMIBCompliancesEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                {
                    super(mib, parent, "dismanEventMIBCompliances", "1.3.6.1.2.1.88.3.1", false, false, false, false);
                    this.dismanEventMIBCompliance = new DismanEventMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dismanEventMIBCompliance
                    };
                }
                public static final class DismanEventMIBComplianceEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private DismanEventMIBComplianceEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "dismanEventMIBCompliance", "1.3.6.1.2.1.88.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DismanEventMIBGroupsEnt extends MIBEntry<DISMANEVENTMIBDef>
            {
                /** Units of Conformance*/
                public final DismanEventResourceGroupEnt dismanEventResourceGroup;

                public final DismanEventTriggerGroupEnt dismanEventTriggerGroup;

                public final DismanEventObjectsGroupEnt dismanEventObjectsGroup;

                public final DismanEventEventGroupEnt dismanEventEventGroup;

                public final DismanEventNotificationObjectGroupEnt dismanEventNotificationObjectGroup;

                public final DismanEventNotificationGroupEnt dismanEventNotificationGroup;

                private DismanEventMIBGroupsEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                {
                    super(mib, parent, "dismanEventMIBGroups", "1.3.6.1.2.1.88.3.2", false, false, false, false);
                    this.dismanEventResourceGroup = new DismanEventResourceGroupEnt(mib, this);
                    this.dismanEventTriggerGroup = new DismanEventTriggerGroupEnt(mib, this);
                    this.dismanEventObjectsGroup = new DismanEventObjectsGroupEnt(mib, this);
                    this.dismanEventEventGroup = new DismanEventEventGroupEnt(mib, this);
                    this.dismanEventNotificationObjectGroup = new DismanEventNotificationObjectGroupEnt(mib, this);
                    this.dismanEventNotificationGroup = new DismanEventNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dismanEventResourceGroup,
                        this.dismanEventTriggerGroup,
                        this.dismanEventObjectsGroup,
                        this.dismanEventEventGroup,
                        this.dismanEventNotificationObjectGroup,
                        this.dismanEventNotificationGroup
                    };
                }
                public static final class DismanEventResourceGroupEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private DismanEventResourceGroupEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "dismanEventResourceGroup", "1.3.6.1.2.1.88.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DismanEventTriggerGroupEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private DismanEventTriggerGroupEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "dismanEventTriggerGroup", "1.3.6.1.2.1.88.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DismanEventObjectsGroupEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private DismanEventObjectsGroupEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "dismanEventObjectsGroup", "1.3.6.1.2.1.88.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DismanEventEventGroupEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private DismanEventEventGroupEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "dismanEventEventGroup", "1.3.6.1.2.1.88.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DismanEventNotificationObjectGroupEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private DismanEventNotificationObjectGroupEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "dismanEventNotificationObjectGroup", "1.3.6.1.2.1.88.3.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DismanEventNotificationGroupEnt extends MIBEntry<DISMANEVENTMIBDef>
                {
                    private DismanEventNotificationGroupEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
                    {
                        super(mib, parent, "dismanEventNotificationGroup", "1.3.6.1.2.1.88.3.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class SysUpTimeInstanceEnt extends MIBEntry<DISMANEVENTMIBDef>
    {
        private SysUpTimeInstanceEnt(DISMANEVENTMIBDef mib, MIBEntry<DISMANEVENTMIBDef> parent)
        {
            super(mib, parent, "sysUpTimeInstance", "1.3.6.1.2.1.1.3.0", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
