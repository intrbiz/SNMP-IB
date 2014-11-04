package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class SNMPNOTIFICATIONMIBDef extends MIB
{
    public static final SNMPNOTIFICATIONMIBDef SNMPNOTIFICATIONMIB = new SNMPNOTIFICATIONMIBDef();

    static { MIBs.getInstance().registerMIB(SNMPNOTIFICATIONMIBDef.SNMPNOTIFICATIONMIB); }

    public final SnmpNotificationMIBEnt snmpNotificationMIB;

    private SNMPNOTIFICATIONMIBDef()
    {
        super("SNMP-NOTIFICATION-MIB");
        this.snmpNotificationMIB = new SnmpNotificationMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.snmpNotificationMIB
        };
    }

    public static final class SnmpNotificationMIBEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
    {
        public final SnmpNotifyObjectsEnt snmpNotifyObjects;

        public final SnmpNotifyConformanceEnt snmpNotifyConformance;

        private SnmpNotificationMIBEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
        {
            super(mib, parent, "snmpNotificationMIB", "1.3.6.1.6.3.13", false, false, false, false);
            this.snmpNotifyObjects = new SnmpNotifyObjectsEnt(mib, this);
            this.snmpNotifyConformance = new SnmpNotifyConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.snmpNotifyObjects,
                this.snmpNotifyConformance
            };
        }
        public static final class SnmpNotifyObjectsEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
        {
            /** The snmpNotifyObjects group*/
            public final SnmpNotifyTableEnt snmpNotifyTable;

            public final SnmpNotifyFilterProfileTableEnt snmpNotifyFilterProfileTable;

            public final SnmpNotifyFilterTableEnt snmpNotifyFilterTable;

            private SnmpNotifyObjectsEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "snmpNotifyObjects", "1.3.6.1.6.3.13.1", false, false, false, false);
                this.snmpNotifyTable = new SnmpNotifyTableEnt(mib, this);
                this.snmpNotifyFilterProfileTable = new SnmpNotifyFilterProfileTableEnt(mib, this);
                this.snmpNotifyFilterTable = new SnmpNotifyFilterTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpNotifyTable,
                    this.snmpNotifyFilterProfileTable,
                    this.snmpNotifyFilterTable
                };
            }
            public static final class SnmpNotifyTableEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
            {
                public final SnmpNotifyEntryEnt snmpNotifyEntry;

                private SnmpNotifyTableEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                {
                    super(mib, parent, "snmpNotifyTable", "1.3.6.1.6.3.13.1.1", false, true, false, false);
                    this.snmpNotifyEntry = new SnmpNotifyEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpNotifyEntry
                    };
                }
                public static final class SnmpNotifyEntryEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                {
                    public final SnmpNotifyNameEnt snmpNotifyName;

                    public final SnmpNotifyTagEnt snmpNotifyTag;

                    public final SnmpNotifyTypeEnt snmpNotifyType;

                    public final SnmpNotifyStorageTypeEnt snmpNotifyStorageType;

                    public final SnmpNotifyRowStatusEnt snmpNotifyRowStatus;

                    private SnmpNotifyEntryEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                    {
                        super(mib, parent, "snmpNotifyEntry", "1.3.6.1.6.3.13.1.1.1", false, false, false, true);
                        this.snmpNotifyName = new SnmpNotifyNameEnt(mib, this);
                        this.snmpNotifyTag = new SnmpNotifyTagEnt(mib, this);
                        this.snmpNotifyType = new SnmpNotifyTypeEnt(mib, this);
                        this.snmpNotifyStorageType = new SnmpNotifyStorageTypeEnt(mib, this);
                        this.snmpNotifyRowStatus = new SnmpNotifyRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snmpNotifyName,
                            this.snmpNotifyTag,
                            this.snmpNotifyType,
                            this.snmpNotifyStorageType,
                            this.snmpNotifyRowStatus
                        };
                    }
                    public static final class SnmpNotifyNameEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                    {
                        private SnmpNotifyNameEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                        {
                            super(mib, parent, "snmpNotifyName", "1.3.6.1.6.3.13.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpNotifyTagEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                    {
                        private SnmpNotifyTagEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                        {
                            super(mib, parent, "snmpNotifyTag", "1.3.6.1.6.3.13.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpNotifyTypeEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                    {
                        private SnmpNotifyTypeEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                        {
                            super(mib, parent, "snmpNotifyType", "1.3.6.1.6.3.13.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpNotifyStorageTypeEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                    {
                        private SnmpNotifyStorageTypeEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                        {
                            super(mib, parent, "snmpNotifyStorageType", "1.3.6.1.6.3.13.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpNotifyRowStatusEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                    {
                        private SnmpNotifyRowStatusEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                        {
                            super(mib, parent, "snmpNotifyRowStatus", "1.3.6.1.6.3.13.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SnmpNotifyFilterProfileTableEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
            {
                public final SnmpNotifyFilterProfileEntryEnt snmpNotifyFilterProfileEntry;

                private SnmpNotifyFilterProfileTableEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                {
                    super(mib, parent, "snmpNotifyFilterProfileTable", "1.3.6.1.6.3.13.1.2", false, true, false, false);
                    this.snmpNotifyFilterProfileEntry = new SnmpNotifyFilterProfileEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpNotifyFilterProfileEntry
                    };
                }
                public static final class SnmpNotifyFilterProfileEntryEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                {
                    public final SnmpNotifyFilterProfileNameEnt snmpNotifyFilterProfileName;

                    public final SnmpNotifyFilterProfileStorTypeEnt snmpNotifyFilterProfileStorType;

                    public final SnmpNotifyFilterProfileRowStatusEnt snmpNotifyFilterProfileRowStatus;

                    private SnmpNotifyFilterProfileEntryEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                    {
                        super(mib, parent, "snmpNotifyFilterProfileEntry", "1.3.6.1.6.3.13.1.2.1", false, false, false, true);
                        this.snmpNotifyFilterProfileName = new SnmpNotifyFilterProfileNameEnt(mib, this);
                        this.snmpNotifyFilterProfileStorType = new SnmpNotifyFilterProfileStorTypeEnt(mib, this);
                        this.snmpNotifyFilterProfileRowStatus = new SnmpNotifyFilterProfileRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snmpNotifyFilterProfileName,
                            this.snmpNotifyFilterProfileStorType,
                            this.snmpNotifyFilterProfileRowStatus
                        };
                    }
                    public static final class SnmpNotifyFilterProfileNameEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                    {
                        private SnmpNotifyFilterProfileNameEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                        {
                            super(mib, parent, "snmpNotifyFilterProfileName", "1.3.6.1.6.3.13.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpNotifyFilterProfileStorTypeEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                    {
                        private SnmpNotifyFilterProfileStorTypeEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                        {
                            super(mib, parent, "snmpNotifyFilterProfileStorType", "1.3.6.1.6.3.13.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpNotifyFilterProfileRowStatusEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                    {
                        private SnmpNotifyFilterProfileRowStatusEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                        {
                            super(mib, parent, "snmpNotifyFilterProfileRowStatus", "1.3.6.1.6.3.13.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SnmpNotifyFilterTableEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
            {
                public final SnmpNotifyFilterEntryEnt snmpNotifyFilterEntry;

                private SnmpNotifyFilterTableEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                {
                    super(mib, parent, "snmpNotifyFilterTable", "1.3.6.1.6.3.13.1.3", false, true, false, false);
                    this.snmpNotifyFilterEntry = new SnmpNotifyFilterEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpNotifyFilterEntry
                    };
                }
                public static final class SnmpNotifyFilterEntryEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                {
                    public final SnmpNotifyFilterSubtreeEnt snmpNotifyFilterSubtree;

                    public final SnmpNotifyFilterMaskEnt snmpNotifyFilterMask;

                    public final SnmpNotifyFilterTypeEnt snmpNotifyFilterType;

                    public final SnmpNotifyFilterStorageTypeEnt snmpNotifyFilterStorageType;

                    public final SnmpNotifyFilterRowStatusEnt snmpNotifyFilterRowStatus;

                    private SnmpNotifyFilterEntryEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                    {
                        super(mib, parent, "snmpNotifyFilterEntry", "1.3.6.1.6.3.13.1.3.1", false, false, false, true);
                        this.snmpNotifyFilterSubtree = new SnmpNotifyFilterSubtreeEnt(mib, this);
                        this.snmpNotifyFilterMask = new SnmpNotifyFilterMaskEnt(mib, this);
                        this.snmpNotifyFilterType = new SnmpNotifyFilterTypeEnt(mib, this);
                        this.snmpNotifyFilterStorageType = new SnmpNotifyFilterStorageTypeEnt(mib, this);
                        this.snmpNotifyFilterRowStatus = new SnmpNotifyFilterRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snmpNotifyFilterSubtree,
                            this.snmpNotifyFilterMask,
                            this.snmpNotifyFilterType,
                            this.snmpNotifyFilterStorageType,
                            this.snmpNotifyFilterRowStatus
                        };
                    }
                    public static final class SnmpNotifyFilterSubtreeEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                    {
                        private SnmpNotifyFilterSubtreeEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                        {
                            super(mib, parent, "snmpNotifyFilterSubtree", "1.3.6.1.6.3.13.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpNotifyFilterMaskEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                    {
                        private SnmpNotifyFilterMaskEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                        {
                            super(mib, parent, "snmpNotifyFilterMask", "1.3.6.1.6.3.13.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpNotifyFilterTypeEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                    {
                        private SnmpNotifyFilterTypeEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                        {
                            super(mib, parent, "snmpNotifyFilterType", "1.3.6.1.6.3.13.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpNotifyFilterStorageTypeEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                    {
                        private SnmpNotifyFilterStorageTypeEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                        {
                            super(mib, parent, "snmpNotifyFilterStorageType", "1.3.6.1.6.3.13.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpNotifyFilterRowStatusEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                    {
                        private SnmpNotifyFilterRowStatusEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                        {
                            super(mib, parent, "snmpNotifyFilterRowStatus", "1.3.6.1.6.3.13.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class SnmpNotifyConformanceEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
        {
            /** Conformance information*/
            public final SnmpNotifyCompliancesEnt snmpNotifyCompliances;

            public final SnmpNotifyGroupsEnt snmpNotifyGroups;

            private SnmpNotifyConformanceEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "snmpNotifyConformance", "1.3.6.1.6.3.13.3", false, false, false, false);
                this.snmpNotifyCompliances = new SnmpNotifyCompliancesEnt(mib, this);
                this.snmpNotifyGroups = new SnmpNotifyGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpNotifyCompliances,
                    this.snmpNotifyGroups
                };
            }
            public static final class SnmpNotifyCompliancesEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
            {
                /** Compliance statements*/
                public final SnmpNotifyBasicComplianceEnt snmpNotifyBasicCompliance;

                public final SnmpNotifyBasicFiltersComplianceEnt snmpNotifyBasicFiltersCompliance;

                public final SnmpNotifyFullComplianceEnt snmpNotifyFullCompliance;

                private SnmpNotifyCompliancesEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                {
                    super(mib, parent, "snmpNotifyCompliances", "1.3.6.1.6.3.13.3.1", false, false, false, false);
                    this.snmpNotifyBasicCompliance = new SnmpNotifyBasicComplianceEnt(mib, this);
                    this.snmpNotifyBasicFiltersCompliance = new SnmpNotifyBasicFiltersComplianceEnt(mib, this);
                    this.snmpNotifyFullCompliance = new SnmpNotifyFullComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpNotifyBasicCompliance,
                        this.snmpNotifyBasicFiltersCompliance,
                        this.snmpNotifyFullCompliance
                    };
                }
                public static final class SnmpNotifyBasicComplianceEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                {
                    private SnmpNotifyBasicComplianceEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                    {
                        super(mib, parent, "snmpNotifyBasicCompliance", "1.3.6.1.6.3.13.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpNotifyBasicFiltersComplianceEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                {
                    private SnmpNotifyBasicFiltersComplianceEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                    {
                        super(mib, parent, "snmpNotifyBasicFiltersCompliance", "1.3.6.1.6.3.13.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpNotifyFullComplianceEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                {
                    private SnmpNotifyFullComplianceEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                    {
                        super(mib, parent, "snmpNotifyFullCompliance", "1.3.6.1.6.3.13.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SnmpNotifyGroupsEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
            {
                public final SnmpNotifyGroupEnt snmpNotifyGroup;

                public final SnmpNotifyFilterGroupEnt snmpNotifyFilterGroup;

                private SnmpNotifyGroupsEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                {
                    super(mib, parent, "snmpNotifyGroups", "1.3.6.1.6.3.13.3.2", false, false, false, false);
                    this.snmpNotifyGroup = new SnmpNotifyGroupEnt(mib, this);
                    this.snmpNotifyFilterGroup = new SnmpNotifyFilterGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpNotifyGroup,
                        this.snmpNotifyFilterGroup
                    };
                }
                public static final class SnmpNotifyGroupEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                {
                    private SnmpNotifyGroupEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                    {
                        super(mib, parent, "snmpNotifyGroup", "1.3.6.1.6.3.13.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpNotifyFilterGroupEnt extends MIBEntry<SNMPNOTIFICATIONMIBDef>
                {
                    private SnmpNotifyFilterGroupEnt(SNMPNOTIFICATIONMIBDef mib, MIBEntry<SNMPNOTIFICATIONMIBDef> parent)
                    {
                        super(mib, parent, "snmpNotifyFilterGroup", "1.3.6.1.6.3.13.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
