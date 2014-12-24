package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**RFC2578
RFC2579
RFC2580
RFC3411*/
public final class DISMANNSLOOKUPMIBDef extends MIB
{
    public static final DISMANNSLOOKUPMIBDef DISMANNSLOOKUPMIB = new DISMANNSLOOKUPMIBDef();

    /** RFC4001

13 June 2006*/
    public final LookupMIBEnt lookupMIB;

    private DISMANNSLOOKUPMIBDef()
    {
        super("DISMAN-NSLOOKUP-MIB");
        this.lookupMIB = new LookupMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.lookupMIB
        };
    }

    public static final class LookupMIBEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
    {
        /** Top level structure of the MIB*/
        public final LookupObjectsEnt lookupObjects;

        public final LookupConformanceEnt lookupConformance;

        private LookupMIBEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
        {
            super(mib, parent, "lookupMIB", "1.3.6.1.2.1.82", false, false, false, false);
            this.lookupObjects = new LookupObjectsEnt(mib, this);
            this.lookupConformance = new LookupConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.lookupObjects,
                this.lookupConformance
            };
        }
        public static final class LookupObjectsEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
        {
            /** Simple Object Definitions*/
            public final LookupMaxConcurrentRequestsEnt lookupMaxConcurrentRequests;

            /** 15 minutes as default*/
            public final LookupPurgeTimeEnt lookupPurgeTime;

            /** Lookup Control Table*/
            public final LookupCtlTableEnt lookupCtlTable;

            /** Lookup Results Table*/
            public final LookupResultsTableEnt lookupResultsTable;

            private LookupObjectsEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
            {
                super(mib, parent, "lookupObjects", "1.3.6.1.2.1.82.1", false, false, false, false);
                this.lookupMaxConcurrentRequests = new LookupMaxConcurrentRequestsEnt(mib, this);
                this.lookupPurgeTime = new LookupPurgeTimeEnt(mib, this);
                this.lookupCtlTable = new LookupCtlTableEnt(mib, this);
                this.lookupResultsTable = new LookupResultsTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.lookupMaxConcurrentRequests,
                    this.lookupPurgeTime,
                    this.lookupCtlTable,
                    this.lookupResultsTable
                };
            }
            public static final class LookupMaxConcurrentRequestsEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
            {
                private LookupMaxConcurrentRequestsEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                {
                    super(mib, parent, "lookupMaxConcurrentRequests", "1.3.6.1.2.1.82.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LookupPurgeTimeEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
            {
                private LookupPurgeTimeEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                {
                    super(mib, parent, "lookupPurgeTime", "1.3.6.1.2.1.82.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LookupCtlTableEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
            {
                public final LookupCtlEntryEnt lookupCtlEntry;

                private LookupCtlTableEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                {
                    super(mib, parent, "lookupCtlTable", "1.3.6.1.2.1.82.1.3", false, true, false, false);
                    this.lookupCtlEntry = new LookupCtlEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lookupCtlEntry
                    };
                }
                public static final class LookupCtlEntryEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
                {
                    public final LookupCtlOwnerIndexEnt lookupCtlOwnerIndex;

                    public final LookupCtlOperationNameEnt lookupCtlOperationName;

                    public final LookupCtlTargetAddressTypeEnt lookupCtlTargetAddressType;

                    public final LookupCtlTargetAddressEnt lookupCtlTargetAddress;

                    public final LookupCtlOperStatusEnt lookupCtlOperStatus;

                    public final LookupCtlTimeEnt lookupCtlTime;

                    public final LookupCtlRcEnt lookupCtlRc;

                    public final LookupCtlRowStatusEnt lookupCtlRowStatus;

                    private LookupCtlEntryEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                    {
                        super(mib, parent, "lookupCtlEntry", "1.3.6.1.2.1.82.1.3.1", false, false, false, true);
                        this.lookupCtlOwnerIndex = new LookupCtlOwnerIndexEnt(mib, this);
                        this.lookupCtlOperationName = new LookupCtlOperationNameEnt(mib, this);
                        this.lookupCtlTargetAddressType = new LookupCtlTargetAddressTypeEnt(mib, this);
                        this.lookupCtlTargetAddress = new LookupCtlTargetAddressEnt(mib, this);
                        this.lookupCtlOperStatus = new LookupCtlOperStatusEnt(mib, this);
                        this.lookupCtlTime = new LookupCtlTimeEnt(mib, this);
                        this.lookupCtlRc = new LookupCtlRcEnt(mib, this);
                        this.lookupCtlRowStatus = new LookupCtlRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.lookupCtlOwnerIndex,
                            this.lookupCtlOperationName,
                            this.lookupCtlTargetAddressType,
                            this.lookupCtlTargetAddress,
                            this.lookupCtlOperStatus,
                            this.lookupCtlTime,
                            this.lookupCtlRc,
                            this.lookupCtlRowStatus
                        };
                    }
                    public static final class LookupCtlOwnerIndexEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
                    {
                        private LookupCtlOwnerIndexEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                        {
                            super(mib, parent, "lookupCtlOwnerIndex", "1.3.6.1.2.1.82.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LookupCtlOperationNameEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
                    {
                        private LookupCtlOperationNameEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                        {
                            super(mib, parent, "lookupCtlOperationName", "1.3.6.1.2.1.82.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LookupCtlTargetAddressTypeEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
                    {
                        private LookupCtlTargetAddressTypeEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                        {
                            super(mib, parent, "lookupCtlTargetAddressType", "1.3.6.1.2.1.82.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LookupCtlTargetAddressEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
                    {
                        private LookupCtlTargetAddressEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                        {
                            super(mib, parent, "lookupCtlTargetAddress", "1.3.6.1.2.1.82.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LookupCtlOperStatusEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
                    {
                        private LookupCtlOperStatusEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                        {
                            super(mib, parent, "lookupCtlOperStatus", "1.3.6.1.2.1.82.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LookupCtlTimeEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
                    {
                        private LookupCtlTimeEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                        {
                            super(mib, parent, "lookupCtlTime", "1.3.6.1.2.1.82.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LookupCtlRcEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
                    {
                        private LookupCtlRcEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                        {
                            super(mib, parent, "lookupCtlRc", "1.3.6.1.2.1.82.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LookupCtlRowStatusEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
                    {
                        private LookupCtlRowStatusEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                        {
                            super(mib, parent, "lookupCtlRowStatus", "1.3.6.1.2.1.82.1.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class LookupResultsTableEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
            {
                public final LookupResultsEntryEnt lookupResultsEntry;

                private LookupResultsTableEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                {
                    super(mib, parent, "lookupResultsTable", "1.3.6.1.2.1.82.1.4", false, true, false, false);
                    this.lookupResultsEntry = new LookupResultsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lookupResultsEntry
                    };
                }
                public static final class LookupResultsEntryEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
                {
                    public final LookupResultsIndexEnt lookupResultsIndex;

                    public final LookupResultsAddressTypeEnt lookupResultsAddressType;

                    public final LookupResultsAddressEnt lookupResultsAddress;

                    private LookupResultsEntryEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                    {
                        super(mib, parent, "lookupResultsEntry", "1.3.6.1.2.1.82.1.4.1", false, false, false, true);
                        this.lookupResultsIndex = new LookupResultsIndexEnt(mib, this);
                        this.lookupResultsAddressType = new LookupResultsAddressTypeEnt(mib, this);
                        this.lookupResultsAddress = new LookupResultsAddressEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.lookupResultsIndex,
                            this.lookupResultsAddressType,
                            this.lookupResultsAddress
                        };
                    }
                    public static final class LookupResultsIndexEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
                    {
                        private LookupResultsIndexEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                        {
                            super(mib, parent, "lookupResultsIndex", "1.3.6.1.2.1.82.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LookupResultsAddressTypeEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
                    {
                        private LookupResultsAddressTypeEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                        {
                            super(mib, parent, "lookupResultsAddressType", "1.3.6.1.2.1.82.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class LookupResultsAddressEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
                    {
                        private LookupResultsAddressEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                        {
                            super(mib, parent, "lookupResultsAddress", "1.3.6.1.2.1.82.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class LookupConformanceEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
        {
            /** Conformance informationCompliance statements*/
            public final LookupCompliancesEnt lookupCompliances;

            public final LookupGroupsEnt lookupGroups;

            private LookupConformanceEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
            {
                super(mib, parent, "lookupConformance", "1.3.6.1.2.1.82.2", false, false, false, false);
                this.lookupCompliances = new LookupCompliancesEnt(mib, this);
                this.lookupGroups = new LookupGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.lookupCompliances,
                    this.lookupGroups
                };
            }
            public static final class LookupCompliancesEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
            {
                /** Compliance statements*/
                public final LookupComplianceEnt lookupCompliance;

                public final LookupMinimumComplianceEnt lookupMinimumCompliance;

                private LookupCompliancesEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                {
                    super(mib, parent, "lookupCompliances", "1.3.6.1.2.1.82.2.1", false, false, false, false);
                    this.lookupCompliance = new LookupComplianceEnt(mib, this);
                    this.lookupMinimumCompliance = new LookupMinimumComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lookupCompliance,
                        this.lookupMinimumCompliance
                    };
                }
                public static final class LookupComplianceEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
                {
                    private LookupComplianceEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                    {
                        super(mib, parent, "lookupCompliance", "1.3.6.1.2.1.82.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LookupMinimumComplianceEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
                {
                    private LookupMinimumComplianceEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                    {
                        super(mib, parent, "lookupMinimumCompliance", "1.3.6.1.2.1.82.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class LookupGroupsEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
            {
                /** MIB groupings*/
                public final LookupGroupEnt lookupGroup;

                private LookupGroupsEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                {
                    super(mib, parent, "lookupGroups", "1.3.6.1.2.1.82.2.2", false, false, false, false);
                    this.lookupGroup = new LookupGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lookupGroup
                    };
                }
                public static final class LookupGroupEnt extends MIBEntry<DISMANNSLOOKUPMIBDef>
                {
                    private LookupGroupEnt(DISMANNSLOOKUPMIBDef mib, MIBEntry<DISMANNSLOOKUPMIBDef> parent)
                    {
                        super(mib, parent, "lookupGroup", "1.3.6.1.2.1.82.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
