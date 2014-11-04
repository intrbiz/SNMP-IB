package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2579]
[RFC2580]*/
public final class DIFFSERVCONFIGMIBDef extends MIB
{
    public static final DIFFSERVCONFIGMIBDef DIFFSERVCONFIGMIB = new DIFFSERVCONFIGMIBDef();

    static { MIBs.getInstance().registerMIB(DIFFSERVCONFIGMIBDef.DIFFSERVCONFIGMIB); }

    /** [RFC3411]

22 January 2004*/
    public final DiffServConfigMibEnt diffServConfigMib;

    private DIFFSERVCONFIGMIBDef()
    {
        super("DIFFSERV-CONFIG-MIB");
        this.diffServConfigMib = new DiffServConfigMibEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.diffServConfigMib
        };
    }

    public static final class DiffServConfigMibEnt extends MIBEntry<DIFFSERVCONFIGMIBDef>
    {
        public final DiffServConfigMIBObjectsEnt diffServConfigMIBObjects;

        public final DiffServConfigMIBConformanceEnt diffServConfigMIBConformance;

        private DiffServConfigMibEnt(DIFFSERVCONFIGMIBDef mib, MIBEntry<DIFFSERVCONFIGMIBDef> parent)
        {
            super(mib, parent, "diffServConfigMib", "1.3.6.1.2.1.108", false, false, false, false);
            this.diffServConfigMIBObjects = new DiffServConfigMIBObjectsEnt(mib, this);
            this.diffServConfigMIBConformance = new DiffServConfigMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.diffServConfigMIBObjects,
                this.diffServConfigMIBConformance
            };
        }
        public static final class DiffServConfigMIBObjectsEnt extends MIBEntry<DIFFSERVCONFIGMIBDef>
        {
            /** The Differentiated Services configuration objects*/
            public final DiffServConfigTableEnt diffServConfigTable;

            private DiffServConfigMIBObjectsEnt(DIFFSERVCONFIGMIBDef mib, MIBEntry<DIFFSERVCONFIGMIBDef> parent)
            {
                super(mib, parent, "diffServConfigMIBObjects", "1.3.6.1.2.1.108.1", false, false, false, false);
                this.diffServConfigTable = new DiffServConfigTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.diffServConfigTable
                };
            }
            public static final class DiffServConfigTableEnt extends MIBEntry<DIFFSERVCONFIGMIBDef>
            {
                public final DiffServConfigEntryEnt diffServConfigEntry;

                private DiffServConfigTableEnt(DIFFSERVCONFIGMIBDef mib, MIBEntry<DIFFSERVCONFIGMIBDef> parent)
                {
                    super(mib, parent, "diffServConfigTable", "1.3.6.1.2.1.108.1.2", false, true, false, false);
                    this.diffServConfigEntry = new DiffServConfigEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.diffServConfigEntry
                    };
                }
                public static final class DiffServConfigEntryEnt extends MIBEntry<DIFFSERVCONFIGMIBDef>
                {
                    public final DiffServConfigIdEnt diffServConfigId;

                    public final DiffServConfigDescrEnt diffServConfigDescr;

                    public final DiffServConfigOwnerEnt diffServConfigOwner;

                    public final DiffServConfigLastChangeEnt diffServConfigLastChange;

                    public final DiffServConfigStartEnt diffServConfigStart;

                    public final DiffServConfigStorageEnt diffServConfigStorage;

                    public final DiffServConfigStatusEnt diffServConfigStatus;

                    private DiffServConfigEntryEnt(DIFFSERVCONFIGMIBDef mib, MIBEntry<DIFFSERVCONFIGMIBDef> parent)
                    {
                        super(mib, parent, "diffServConfigEntry", "1.3.6.1.2.1.108.1.2.1", false, false, false, true);
                        this.diffServConfigId = new DiffServConfigIdEnt(mib, this);
                        this.diffServConfigDescr = new DiffServConfigDescrEnt(mib, this);
                        this.diffServConfigOwner = new DiffServConfigOwnerEnt(mib, this);
                        this.diffServConfigLastChange = new DiffServConfigLastChangeEnt(mib, this);
                        this.diffServConfigStart = new DiffServConfigStartEnt(mib, this);
                        this.diffServConfigStorage = new DiffServConfigStorageEnt(mib, this);
                        this.diffServConfigStatus = new DiffServConfigStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.diffServConfigId,
                            this.diffServConfigDescr,
                            this.diffServConfigOwner,
                            this.diffServConfigLastChange,
                            this.diffServConfigStart,
                            this.diffServConfigStorage,
                            this.diffServConfigStatus
                        };
                    }
                    public static final class DiffServConfigIdEnt extends MIBEntry<DIFFSERVCONFIGMIBDef>
                    {
                        private DiffServConfigIdEnt(DIFFSERVCONFIGMIBDef mib, MIBEntry<DIFFSERVCONFIGMIBDef> parent)
                        {
                            super(mib, parent, "diffServConfigId", "1.3.6.1.2.1.108.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DiffServConfigDescrEnt extends MIBEntry<DIFFSERVCONFIGMIBDef>
                    {
                        private DiffServConfigDescrEnt(DIFFSERVCONFIGMIBDef mib, MIBEntry<DIFFSERVCONFIGMIBDef> parent)
                        {
                            super(mib, parent, "diffServConfigDescr", "1.3.6.1.2.1.108.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DiffServConfigOwnerEnt extends MIBEntry<DIFFSERVCONFIGMIBDef>
                    {
                        private DiffServConfigOwnerEnt(DIFFSERVCONFIGMIBDef mib, MIBEntry<DIFFSERVCONFIGMIBDef> parent)
                        {
                            super(mib, parent, "diffServConfigOwner", "1.3.6.1.2.1.108.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DiffServConfigLastChangeEnt extends MIBEntry<DIFFSERVCONFIGMIBDef>
                    {
                        private DiffServConfigLastChangeEnt(DIFFSERVCONFIGMIBDef mib, MIBEntry<DIFFSERVCONFIGMIBDef> parent)
                        {
                            super(mib, parent, "diffServConfigLastChange", "1.3.6.1.2.1.108.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DiffServConfigStartEnt extends MIBEntry<DIFFSERVCONFIGMIBDef>
                    {
                        private DiffServConfigStartEnt(DIFFSERVCONFIGMIBDef mib, MIBEntry<DIFFSERVCONFIGMIBDef> parent)
                        {
                            super(mib, parent, "diffServConfigStart", "1.3.6.1.2.1.108.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DiffServConfigStorageEnt extends MIBEntry<DIFFSERVCONFIGMIBDef>
                    {
                        private DiffServConfigStorageEnt(DIFFSERVCONFIGMIBDef mib, MIBEntry<DIFFSERVCONFIGMIBDef> parent)
                        {
                            super(mib, parent, "diffServConfigStorage", "1.3.6.1.2.1.108.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DiffServConfigStatusEnt extends MIBEntry<DIFFSERVCONFIGMIBDef>
                    {
                        private DiffServConfigStatusEnt(DIFFSERVCONFIGMIBDef mib, MIBEntry<DIFFSERVCONFIGMIBDef> parent)
                        {
                            super(mib, parent, "diffServConfigStatus", "1.3.6.1.2.1.108.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class DiffServConfigMIBConformanceEnt extends MIBEntry<DIFFSERVCONFIGMIBDef>
        {
            /** MIB Compliance statements.*/
            public final DiffServConfigMIBCompliancesEnt diffServConfigMIBCompliances;

            public final DiffServConfigMIBGroupsEnt diffServConfigMIBGroups;

            private DiffServConfigMIBConformanceEnt(DIFFSERVCONFIGMIBDef mib, MIBEntry<DIFFSERVCONFIGMIBDef> parent)
            {
                super(mib, parent, "diffServConfigMIBConformance", "1.3.6.1.2.1.108.2", false, false, false, false);
                this.diffServConfigMIBCompliances = new DiffServConfigMIBCompliancesEnt(mib, this);
                this.diffServConfigMIBGroups = new DiffServConfigMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.diffServConfigMIBCompliances,
                    this.diffServConfigMIBGroups
                };
            }
            public static final class DiffServConfigMIBCompliancesEnt extends MIBEntry<DIFFSERVCONFIGMIBDef>
            {
                public final DiffServConfigMIBFullComplianceEnt diffServConfigMIBFullCompliance;

                private DiffServConfigMIBCompliancesEnt(DIFFSERVCONFIGMIBDef mib, MIBEntry<DIFFSERVCONFIGMIBDef> parent)
                {
                    super(mib, parent, "diffServConfigMIBCompliances", "1.3.6.1.2.1.108.2.1", false, false, false, false);
                    this.diffServConfigMIBFullCompliance = new DiffServConfigMIBFullComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.diffServConfigMIBFullCompliance
                    };
                }
                public static final class DiffServConfigMIBFullComplianceEnt extends MIBEntry<DIFFSERVCONFIGMIBDef>
                {
                    private DiffServConfigMIBFullComplianceEnt(DIFFSERVCONFIGMIBDef mib, MIBEntry<DIFFSERVCONFIGMIBDef> parent)
                    {
                        super(mib, parent, "diffServConfigMIBFullCompliance", "1.3.6.1.2.1.108.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DiffServConfigMIBGroupsEnt extends MIBEntry<DIFFSERVCONFIGMIBDef>
            {
                public final DiffServConfigMIBConfigGroupEnt diffServConfigMIBConfigGroup;

                private DiffServConfigMIBGroupsEnt(DIFFSERVCONFIGMIBDef mib, MIBEntry<DIFFSERVCONFIGMIBDef> parent)
                {
                    super(mib, parent, "diffServConfigMIBGroups", "1.3.6.1.2.1.108.2.2", false, false, false, false);
                    this.diffServConfigMIBConfigGroup = new DiffServConfigMIBConfigGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.diffServConfigMIBConfigGroup
                    };
                }
                public static final class DiffServConfigMIBConfigGroupEnt extends MIBEntry<DIFFSERVCONFIGMIBDef>
                {
                    private DiffServConfigMIBConfigGroupEnt(DIFFSERVCONFIGMIBDef mib, MIBEntry<DIFFSERVCONFIGMIBDef> parent)
                    {
                        super(mib, parent, "diffServConfigMIBConfigGroup", "1.3.6.1.2.1.108.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
