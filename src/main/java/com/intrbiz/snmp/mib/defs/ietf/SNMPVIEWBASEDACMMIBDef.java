package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class SNMPVIEWBASEDACMMIBDef extends MIB
{
    public static final SNMPVIEWBASEDACMMIBDef SNMPVIEWBASEDACMMIB = new SNMPVIEWBASEDACMMIBDef();

    static { MIBs.getInstance().registerMIB(SNMPVIEWBASEDACMMIBDef.SNMPVIEWBASEDACMMIB); }

    /** 16 Oct 2002, midnight*/
    public final SnmpVacmMIBEnt snmpVacmMIB;

    private SNMPVIEWBASEDACMMIBDef()
    {
        super("SNMP-VIEW-BASED-ACM-MIB");
        this.snmpVacmMIB = new SnmpVacmMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.snmpVacmMIB
        };
    }

    public static final class SnmpVacmMIBEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
    {
        /** Administrative assignments *****************************************/
        public final VacmMIBObjectsEnt vacmMIBObjects;

        public final VacmMIBConformanceEnt vacmMIBConformance;

        private SnmpVacmMIBEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
        {
            super(mib, parent, "snmpVacmMIB", "1.3.6.1.6.3.16", false, false, false, false);
            this.vacmMIBObjects = new VacmMIBObjectsEnt(mib, this);
            this.vacmMIBConformance = new VacmMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.vacmMIBObjects,
                this.vacmMIBConformance
            };
        }
        public static final class VacmMIBObjectsEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
        {
            /** Information about Local Contexts ***********************************/
            public final VacmContextTableEnt vacmContextTable;

            /** Information about Groups *******************************************/
            public final VacmSecurityToGroupTableEnt vacmSecurityToGroupTable;

            /** Information about Access Rights ************************************/
            public final VacmAccessTableEnt vacmAccessTable;

            /** Information about MIB views ***************************************


Support for instance-level granularity is optional.In some implementations, instance-level access controlgranularity may come at a high performance cost.  Managersshould avoid requesting such configurations unnecessarily.*/
            public final VacmMIBViewsEnt vacmMIBViews;

            private VacmMIBObjectsEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
            {
                super(mib, parent, "vacmMIBObjects", "1.3.6.1.6.3.16.1", false, false, false, false);
                this.vacmContextTable = new VacmContextTableEnt(mib, this);
                this.vacmSecurityToGroupTable = new VacmSecurityToGroupTableEnt(mib, this);
                this.vacmAccessTable = new VacmAccessTableEnt(mib, this);
                this.vacmMIBViews = new VacmMIBViewsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.vacmContextTable,
                    this.vacmSecurityToGroupTable,
                    this.vacmAccessTable,
                    this.vacmMIBViews
                };
            }
            public static final class VacmContextTableEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
            {
                public final VacmContextEntryEnt vacmContextEntry;

                private VacmContextTableEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                {
                    super(mib, parent, "vacmContextTable", "1.3.6.1.6.3.16.1.1", false, true, false, false);
                    this.vacmContextEntry = new VacmContextEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vacmContextEntry
                    };
                }
                public static final class VacmContextEntryEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                {
                    public final VacmContextNameEnt vacmContextName;

                    private VacmContextEntryEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                    {
                        super(mib, parent, "vacmContextEntry", "1.3.6.1.6.3.16.1.1.1", false, false, false, true);
                        this.vacmContextName = new VacmContextNameEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vacmContextName
                        };
                    }
                    public static final class VacmContextNameEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                    {
                        private VacmContextNameEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                        {
                            super(mib, parent, "vacmContextName", "1.3.6.1.6.3.16.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class VacmSecurityToGroupTableEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
            {
                public final VacmSecurityToGroupEntryEnt vacmSecurityToGroupEntry;

                private VacmSecurityToGroupTableEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                {
                    super(mib, parent, "vacmSecurityToGroupTable", "1.3.6.1.6.3.16.1.2", false, true, false, false);
                    this.vacmSecurityToGroupEntry = new VacmSecurityToGroupEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vacmSecurityToGroupEntry
                    };
                }
                public static final class VacmSecurityToGroupEntryEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                {
                    public final VacmSecurityModelEnt vacmSecurityModel;

                    public final VacmSecurityNameEnt vacmSecurityName;

                    public final VacmGroupNameEnt vacmGroupName;

                    public final VacmSecurityToGroupStorageTypeEnt vacmSecurityToGroupStorageType;

                    public final VacmSecurityToGroupStatusEnt vacmSecurityToGroupStatus;

                    private VacmSecurityToGroupEntryEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                    {
                        super(mib, parent, "vacmSecurityToGroupEntry", "1.3.6.1.6.3.16.1.2.1", false, false, false, true);
                        this.vacmSecurityModel = new VacmSecurityModelEnt(mib, this);
                        this.vacmSecurityName = new VacmSecurityNameEnt(mib, this);
                        this.vacmGroupName = new VacmGroupNameEnt(mib, this);
                        this.vacmSecurityToGroupStorageType = new VacmSecurityToGroupStorageTypeEnt(mib, this);
                        this.vacmSecurityToGroupStatus = new VacmSecurityToGroupStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vacmSecurityModel,
                            this.vacmSecurityName,
                            this.vacmGroupName,
                            this.vacmSecurityToGroupStorageType,
                            this.vacmSecurityToGroupStatus
                        };
                    }
                    public static final class VacmSecurityModelEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                    {
                        private VacmSecurityModelEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                        {
                            super(mib, parent, "vacmSecurityModel", "1.3.6.1.6.3.16.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VacmSecurityNameEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                    {
                        private VacmSecurityNameEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                        {
                            super(mib, parent, "vacmSecurityName", "1.3.6.1.6.3.16.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VacmGroupNameEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                    {
                        private VacmGroupNameEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                        {
                            super(mib, parent, "vacmGroupName", "1.3.6.1.6.3.16.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VacmSecurityToGroupStorageTypeEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                    {
                        private VacmSecurityToGroupStorageTypeEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                        {
                            super(mib, parent, "vacmSecurityToGroupStorageType", "1.3.6.1.6.3.16.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VacmSecurityToGroupStatusEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                    {
                        private VacmSecurityToGroupStatusEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                        {
                            super(mib, parent, "vacmSecurityToGroupStatus", "1.3.6.1.6.3.16.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class VacmAccessTableEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
            {
                public final VacmAccessEntryEnt vacmAccessEntry;

                private VacmAccessTableEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                {
                    super(mib, parent, "vacmAccessTable", "1.3.6.1.6.3.16.1.4", false, true, false, false);
                    this.vacmAccessEntry = new VacmAccessEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vacmAccessEntry
                    };
                }
                public static final class VacmAccessEntryEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                {
                    public final VacmAccessContextPrefixEnt vacmAccessContextPrefix;

                    public final VacmAccessSecurityModelEnt vacmAccessSecurityModel;

                    public final VacmAccessSecurityLevelEnt vacmAccessSecurityLevel;

                    public final VacmAccessContextMatchEnt vacmAccessContextMatch;

                    /** the empty string*/
                    public final VacmAccessReadViewNameEnt vacmAccessReadViewName;

                    /** the empty string*/
                    public final VacmAccessWriteViewNameEnt vacmAccessWriteViewName;

                    /** the empty string*/
                    public final VacmAccessNotifyViewNameEnt vacmAccessNotifyViewName;

                    public final VacmAccessStorageTypeEnt vacmAccessStorageType;

                    public final VacmAccessStatusEnt vacmAccessStatus;

                    private VacmAccessEntryEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                    {
                        super(mib, parent, "vacmAccessEntry", "1.3.6.1.6.3.16.1.4.1", false, false, false, true);
                        this.vacmAccessContextPrefix = new VacmAccessContextPrefixEnt(mib, this);
                        this.vacmAccessSecurityModel = new VacmAccessSecurityModelEnt(mib, this);
                        this.vacmAccessSecurityLevel = new VacmAccessSecurityLevelEnt(mib, this);
                        this.vacmAccessContextMatch = new VacmAccessContextMatchEnt(mib, this);
                        this.vacmAccessReadViewName = new VacmAccessReadViewNameEnt(mib, this);
                        this.vacmAccessWriteViewName = new VacmAccessWriteViewNameEnt(mib, this);
                        this.vacmAccessNotifyViewName = new VacmAccessNotifyViewNameEnt(mib, this);
                        this.vacmAccessStorageType = new VacmAccessStorageTypeEnt(mib, this);
                        this.vacmAccessStatus = new VacmAccessStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vacmAccessContextPrefix,
                            this.vacmAccessSecurityModel,
                            this.vacmAccessSecurityLevel,
                            this.vacmAccessContextMatch,
                            this.vacmAccessReadViewName,
                            this.vacmAccessWriteViewName,
                            this.vacmAccessNotifyViewName,
                            this.vacmAccessStorageType,
                            this.vacmAccessStatus
                        };
                    }
                    public static final class VacmAccessContextPrefixEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                    {
                        private VacmAccessContextPrefixEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                        {
                            super(mib, parent, "vacmAccessContextPrefix", "1.3.6.1.6.3.16.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VacmAccessSecurityModelEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                    {
                        private VacmAccessSecurityModelEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                        {
                            super(mib, parent, "vacmAccessSecurityModel", "1.3.6.1.6.3.16.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VacmAccessSecurityLevelEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                    {
                        private VacmAccessSecurityLevelEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                        {
                            super(mib, parent, "vacmAccessSecurityLevel", "1.3.6.1.6.3.16.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VacmAccessContextMatchEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                    {
                        private VacmAccessContextMatchEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                        {
                            super(mib, parent, "vacmAccessContextMatch", "1.3.6.1.6.3.16.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VacmAccessReadViewNameEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                    {
                        private VacmAccessReadViewNameEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                        {
                            super(mib, parent, "vacmAccessReadViewName", "1.3.6.1.6.3.16.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VacmAccessWriteViewNameEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                    {
                        private VacmAccessWriteViewNameEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                        {
                            super(mib, parent, "vacmAccessWriteViewName", "1.3.6.1.6.3.16.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VacmAccessNotifyViewNameEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                    {
                        private VacmAccessNotifyViewNameEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                        {
                            super(mib, parent, "vacmAccessNotifyViewName", "1.3.6.1.6.3.16.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VacmAccessStorageTypeEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                    {
                        private VacmAccessStorageTypeEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                        {
                            super(mib, parent, "vacmAccessStorageType", "1.3.6.1.6.3.16.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VacmAccessStatusEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                    {
                        private VacmAccessStatusEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                        {
                            super(mib, parent, "vacmAccessStatus", "1.3.6.1.6.3.16.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class VacmMIBViewsEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
            {
                public final VacmViewSpinLockEnt vacmViewSpinLock;

                public final VacmViewTreeFamilyTableEnt vacmViewTreeFamilyTable;

                private VacmMIBViewsEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                {
                    super(mib, parent, "vacmMIBViews", "1.3.6.1.6.3.16.1.5", false, false, false, false);
                    this.vacmViewSpinLock = new VacmViewSpinLockEnt(mib, this);
                    this.vacmViewTreeFamilyTable = new VacmViewTreeFamilyTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vacmViewSpinLock,
                        this.vacmViewTreeFamilyTable
                    };
                }
                public static final class VacmViewSpinLockEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                {
                    private VacmViewSpinLockEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                    {
                        super(mib, parent, "vacmViewSpinLock", "1.3.6.1.6.3.16.1.5.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VacmViewTreeFamilyTableEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                {
                    public final VacmViewTreeFamilyEntryEnt vacmViewTreeFamilyEntry;

                    private VacmViewTreeFamilyTableEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                    {
                        super(mib, parent, "vacmViewTreeFamilyTable", "1.3.6.1.6.3.16.1.5.2", false, true, false, false);
                        this.vacmViewTreeFamilyEntry = new VacmViewTreeFamilyEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vacmViewTreeFamilyEntry
                        };
                    }
                    public static final class VacmViewTreeFamilyEntryEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                    {
                        public final VacmViewTreeFamilyViewNameEnt vacmViewTreeFamilyViewName;

                        public final VacmViewTreeFamilySubtreeEnt vacmViewTreeFamilySubtree;

                        public final VacmViewTreeFamilyMaskEnt vacmViewTreeFamilyMask;

                        public final VacmViewTreeFamilyTypeEnt vacmViewTreeFamilyType;

                        public final VacmViewTreeFamilyStorageTypeEnt vacmViewTreeFamilyStorageType;

                        public final VacmViewTreeFamilyStatusEnt vacmViewTreeFamilyStatus;

                        private VacmViewTreeFamilyEntryEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                        {
                            super(mib, parent, "vacmViewTreeFamilyEntry", "1.3.6.1.6.3.16.1.5.2.1", false, false, false, true);
                            this.vacmViewTreeFamilyViewName = new VacmViewTreeFamilyViewNameEnt(mib, this);
                            this.vacmViewTreeFamilySubtree = new VacmViewTreeFamilySubtreeEnt(mib, this);
                            this.vacmViewTreeFamilyMask = new VacmViewTreeFamilyMaskEnt(mib, this);
                            this.vacmViewTreeFamilyType = new VacmViewTreeFamilyTypeEnt(mib, this);
                            this.vacmViewTreeFamilyStorageType = new VacmViewTreeFamilyStorageTypeEnt(mib, this);
                            this.vacmViewTreeFamilyStatus = new VacmViewTreeFamilyStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vacmViewTreeFamilyViewName,
                                this.vacmViewTreeFamilySubtree,
                                this.vacmViewTreeFamilyMask,
                                this.vacmViewTreeFamilyType,
                                this.vacmViewTreeFamilyStorageType,
                                this.vacmViewTreeFamilyStatus
                            };
                        }
                        public static final class VacmViewTreeFamilyViewNameEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                        {
                            private VacmViewTreeFamilyViewNameEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                            {
                                super(mib, parent, "vacmViewTreeFamilyViewName", "1.3.6.1.6.3.16.1.5.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VacmViewTreeFamilySubtreeEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                        {
                            private VacmViewTreeFamilySubtreeEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                            {
                                super(mib, parent, "vacmViewTreeFamilySubtree", "1.3.6.1.6.3.16.1.5.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VacmViewTreeFamilyMaskEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                        {
                            private VacmViewTreeFamilyMaskEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                            {
                                super(mib, parent, "vacmViewTreeFamilyMask", "1.3.6.1.6.3.16.1.5.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VacmViewTreeFamilyTypeEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                        {
                            private VacmViewTreeFamilyTypeEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                            {
                                super(mib, parent, "vacmViewTreeFamilyType", "1.3.6.1.6.3.16.1.5.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VacmViewTreeFamilyStorageTypeEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                        {
                            private VacmViewTreeFamilyStorageTypeEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                            {
                                super(mib, parent, "vacmViewTreeFamilyStorageType", "1.3.6.1.6.3.16.1.5.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VacmViewTreeFamilyStatusEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                        {
                            private VacmViewTreeFamilyStatusEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                            {
                                super(mib, parent, "vacmViewTreeFamilyStatus", "1.3.6.1.6.3.16.1.5.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class VacmMIBConformanceEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
        {
            /** Conformance information ********************************************/
            public final VacmMIBCompliancesEnt vacmMIBCompliances;

            public final VacmMIBGroupsEnt vacmMIBGroups;

            private VacmMIBConformanceEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
            {
                super(mib, parent, "vacmMIBConformance", "1.3.6.1.6.3.16.2", false, false, false, false);
                this.vacmMIBCompliances = new VacmMIBCompliancesEnt(mib, this);
                this.vacmMIBGroups = new VacmMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.vacmMIBCompliances,
                    this.vacmMIBGroups
                };
            }
            public static final class VacmMIBCompliancesEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
            {
                /** Compliance statements **********************************************/
                public final VacmMIBComplianceEnt vacmMIBCompliance;

                private VacmMIBCompliancesEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                {
                    super(mib, parent, "vacmMIBCompliances", "1.3.6.1.6.3.16.2.1", false, false, false, false);
                    this.vacmMIBCompliance = new VacmMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vacmMIBCompliance
                    };
                }
                public static final class VacmMIBComplianceEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                {
                    private VacmMIBComplianceEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                    {
                        super(mib, parent, "vacmMIBCompliance", "1.3.6.1.6.3.16.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class VacmMIBGroupsEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
            {
                /** Units of conformance ***********************************************/
                public final VacmBasicGroupEnt vacmBasicGroup;

                private VacmMIBGroupsEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                {
                    super(mib, parent, "vacmMIBGroups", "1.3.6.1.6.3.16.2.2", false, false, false, false);
                    this.vacmBasicGroup = new VacmBasicGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vacmBasicGroup
                    };
                }
                public static final class VacmBasicGroupEnt extends MIBEntry<SNMPVIEWBASEDACMMIBDef>
                {
                    private VacmBasicGroupEnt(SNMPVIEWBASEDACMMIBDef mib, MIBEntry<SNMPVIEWBASEDACMMIBDef> parent)
                    {
                        super(mib, parent, "vacmBasicGroup", "1.3.6.1.6.3.16.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
