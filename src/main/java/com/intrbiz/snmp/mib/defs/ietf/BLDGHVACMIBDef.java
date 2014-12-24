package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class BLDGHVACMIBDef extends MIB
{
    public static final BLDGHVACMIBDef BLDGHVACMIB = new BLDGHVACMIBDef();

    public final BldgHVACMIBEnt bldgHVACMIB;

    private BLDGHVACMIBDef()
    {
        super("BLDG-HVAC-MIB");
        this.bldgHVACMIB = new BldgHVACMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.bldgHVACMIB
        };
    }

    public static final class BldgHVACMIBEnt extends MIBEntry<BLDGHVACMIBDef>
    {
        public final BldgHVACObjectsEnt bldgHVACObjects;

        public final BldgConformanceEnt bldgConformance;

        private BldgHVACMIBEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
        {
            super(mib, parent, "bldgHVACMIB", "1.3.6.1.3.122", false, false, false, false);
            this.bldgHVACObjects = new BldgHVACObjectsEnt(mib, this);
            this.bldgConformance = new BldgConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.bldgHVACObjects,
                this.bldgConformance
            };
        }
        public static final class BldgHVACObjectsEnt extends MIBEntry<BLDGHVACMIBDef>
        {
            /** HVAC Objects Group*/
            public final BldgHVACTableEnt bldgHVACTable;

            /** HVAC Configuration Template Table*/
            public final BldgHVACCfgTemplateInfoTableEnt bldgHVACCfgTemplateInfoTable;

            /** HVAC Configuration Template Table*/
            public final BldgHVACCfgTemplateTableEnt bldgHVACCfgTemplateTable;

            private BldgHVACObjectsEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
            {
                super(mib, parent, "bldgHVACObjects", "1.3.6.1.3.122.1", false, false, false, false);
                this.bldgHVACTable = new BldgHVACTableEnt(mib, this);
                this.bldgHVACCfgTemplateInfoTable = new BldgHVACCfgTemplateInfoTableEnt(mib, this);
                this.bldgHVACCfgTemplateTable = new BldgHVACCfgTemplateTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.bldgHVACTable,
                    this.bldgHVACCfgTemplateInfoTable,
                    this.bldgHVACCfgTemplateTable
                };
            }
            public static final class BldgHVACTableEnt extends MIBEntry<BLDGHVACMIBDef>
            {
                public final BldgHVACEntryEnt bldgHVACEntry;

                private BldgHVACTableEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                {
                    super(mib, parent, "bldgHVACTable", "1.3.6.1.3.122.1.1", false, true, false, false);
                    this.bldgHVACEntry = new BldgHVACEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.bldgHVACEntry
                    };
                }
                public static final class BldgHVACEntryEnt extends MIBEntry<BLDGHVACMIBDef>
                {
                    public final BldgHVACFloorEnt bldgHVACFloor;

                    public final BldgHVACOfficeEnt bldgHVACOffice;

                    public final BldgHVACCfgTemplateEnt bldgHVACCfgTemplate;

                    public final BldgHVACFanSpeedEnt bldgHVACFanSpeed;

                    public final BldgHVACCurrentTempEnt bldgHVACCurrentTemp;

                    public final BldgHVACCoolOrHeatMinsEnt bldgHVACCoolOrHeatMins;

                    public final BldgHVACDiscontinuityTimeEnt bldgHVACDiscontinuityTime;

                    public final BldgHVACOwnerEnt bldgHVACOwner;

                    public final BldgHVACStorageTypeEnt bldgHVACStorageType;

                    public final BldgHVACStatusEnt bldgHVACStatus;

                    private BldgHVACEntryEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                    {
                        super(mib, parent, "bldgHVACEntry", "1.3.6.1.3.122.1.1.1", false, false, false, true);
                        this.bldgHVACFloor = new BldgHVACFloorEnt(mib, this);
                        this.bldgHVACOffice = new BldgHVACOfficeEnt(mib, this);
                        this.bldgHVACCfgTemplate = new BldgHVACCfgTemplateEnt(mib, this);
                        this.bldgHVACFanSpeed = new BldgHVACFanSpeedEnt(mib, this);
                        this.bldgHVACCurrentTemp = new BldgHVACCurrentTempEnt(mib, this);
                        this.bldgHVACCoolOrHeatMins = new BldgHVACCoolOrHeatMinsEnt(mib, this);
                        this.bldgHVACDiscontinuityTime = new BldgHVACDiscontinuityTimeEnt(mib, this);
                        this.bldgHVACOwner = new BldgHVACOwnerEnt(mib, this);
                        this.bldgHVACStorageType = new BldgHVACStorageTypeEnt(mib, this);
                        this.bldgHVACStatus = new BldgHVACStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.bldgHVACFloor,
                            this.bldgHVACOffice,
                            this.bldgHVACCfgTemplate,
                            this.bldgHVACFanSpeed,
                            this.bldgHVACCurrentTemp,
                            this.bldgHVACCoolOrHeatMins,
                            this.bldgHVACDiscontinuityTime,
                            this.bldgHVACOwner,
                            this.bldgHVACStorageType,
                            this.bldgHVACStatus
                        };
                    }
                    public static final class BldgHVACFloorEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACFloorEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACFloor", "1.3.6.1.3.122.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACOfficeEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACOfficeEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACOffice", "1.3.6.1.3.122.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACCfgTemplateEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACCfgTemplateEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACCfgTemplate", "1.3.6.1.3.122.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACFanSpeedEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACFanSpeedEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACFanSpeed", "1.3.6.1.3.122.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACCurrentTempEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACCurrentTempEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACCurrentTemp", "1.3.6.1.3.122.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACCoolOrHeatMinsEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACCoolOrHeatMinsEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACCoolOrHeatMins", "1.3.6.1.3.122.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACDiscontinuityTimeEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACDiscontinuityTimeEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACDiscontinuityTime", "1.3.6.1.3.122.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACOwnerEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACOwnerEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACOwner", "1.3.6.1.3.122.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACStorageTypeEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACStorageTypeEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACStorageType", "1.3.6.1.3.122.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACStatusEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACStatusEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACStatus", "1.3.6.1.3.122.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class BldgHVACCfgTemplateInfoTableEnt extends MIBEntry<BLDGHVACMIBDef>
            {
                public final BldgHVACCfgTemplateInfoEntryEnt bldgHVACCfgTemplateInfoEntry;

                private BldgHVACCfgTemplateInfoTableEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                {
                    super(mib, parent, "bldgHVACCfgTemplateInfoTable", "1.3.6.1.3.122.1.2", false, true, false, false);
                    this.bldgHVACCfgTemplateInfoEntry = new BldgHVACCfgTemplateInfoEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.bldgHVACCfgTemplateInfoEntry
                    };
                }
                public static final class BldgHVACCfgTemplateInfoEntryEnt extends MIBEntry<BLDGHVACMIBDef>
                {
                    public final BldgHVACCfgTemplateInfoIndexEnt bldgHVACCfgTemplateInfoIndex;

                    public final BldgHVACCfgTemplateInfoIDEnt bldgHVACCfgTemplateInfoID;

                    public final BldgHVACCfgTemplateInfoDescrEnt bldgHVACCfgTemplateInfoDescr;

                    public final BldgHVACCfgTemplateInfoOwnerEnt bldgHVACCfgTemplateInfoOwner;

                    public final BldgHVACCfgTemplateInfoStatusEnt bldgHVACCfgTemplateInfoStatus;

                    public final BldgHVACCfgTemplateInfoStorTypeEnt bldgHVACCfgTemplateInfoStorType;

                    private BldgHVACCfgTemplateInfoEntryEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                    {
                        super(mib, parent, "bldgHVACCfgTemplateInfoEntry", "1.3.6.1.3.122.1.2.1", false, false, false, true);
                        this.bldgHVACCfgTemplateInfoIndex = new BldgHVACCfgTemplateInfoIndexEnt(mib, this);
                        this.bldgHVACCfgTemplateInfoID = new BldgHVACCfgTemplateInfoIDEnt(mib, this);
                        this.bldgHVACCfgTemplateInfoDescr = new BldgHVACCfgTemplateInfoDescrEnt(mib, this);
                        this.bldgHVACCfgTemplateInfoOwner = new BldgHVACCfgTemplateInfoOwnerEnt(mib, this);
                        this.bldgHVACCfgTemplateInfoStatus = new BldgHVACCfgTemplateInfoStatusEnt(mib, this);
                        this.bldgHVACCfgTemplateInfoStorType = new BldgHVACCfgTemplateInfoStorTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.bldgHVACCfgTemplateInfoIndex,
                            this.bldgHVACCfgTemplateInfoID,
                            this.bldgHVACCfgTemplateInfoDescr,
                            this.bldgHVACCfgTemplateInfoOwner,
                            this.bldgHVACCfgTemplateInfoStatus,
                            this.bldgHVACCfgTemplateInfoStorType
                        };
                    }
                    public static final class BldgHVACCfgTemplateInfoIndexEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACCfgTemplateInfoIndexEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACCfgTemplateInfoIndex", "1.3.6.1.3.122.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACCfgTemplateInfoIDEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACCfgTemplateInfoIDEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACCfgTemplateInfoID", "1.3.6.1.3.122.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACCfgTemplateInfoDescrEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACCfgTemplateInfoDescrEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACCfgTemplateInfoDescr", "1.3.6.1.3.122.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACCfgTemplateInfoOwnerEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACCfgTemplateInfoOwnerEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACCfgTemplateInfoOwner", "1.3.6.1.3.122.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACCfgTemplateInfoStatusEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACCfgTemplateInfoStatusEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACCfgTemplateInfoStatus", "1.3.6.1.3.122.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACCfgTemplateInfoStorTypeEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACCfgTemplateInfoStorTypeEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACCfgTemplateInfoStorType", "1.3.6.1.3.122.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class BldgHVACCfgTemplateTableEnt extends MIBEntry<BLDGHVACMIBDef>
            {
                public final BldgHVACCfgTemplateEntryEnt bldgHVACCfgTemplateEntry;

                private BldgHVACCfgTemplateTableEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                {
                    super(mib, parent, "bldgHVACCfgTemplateTable", "1.3.6.1.3.122.1.3", false, true, false, false);
                    this.bldgHVACCfgTemplateEntry = new BldgHVACCfgTemplateEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.bldgHVACCfgTemplateEntry
                    };
                }
                public static final class BldgHVACCfgTemplateEntryEnt extends MIBEntry<BLDGHVACMIBDef>
                {
                    public final BldgHVACCfgTemplateIndexEnt bldgHVACCfgTemplateIndex;

                    public final BldgHVACCfgTemplateDesiredTempEnt bldgHVACCfgTemplateDesiredTemp;

                    public final BldgHVACCfgTemplateCoolOrHeatEnt bldgHVACCfgTemplateCoolOrHeat;

                    public final BldgHVACCfgTemplateInfoEnt bldgHVACCfgTemplateInfo;

                    public final BldgHVACCfgTemplateOwnerEnt bldgHVACCfgTemplateOwner;

                    public final BldgHVACCfgTemplateStorageEnt bldgHVACCfgTemplateStorage;

                    public final BldgHVACCfgTemplateStatusEnt bldgHVACCfgTemplateStatus;

                    private BldgHVACCfgTemplateEntryEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                    {
                        super(mib, parent, "bldgHVACCfgTemplateEntry", "1.3.6.1.3.122.1.3.1", false, false, false, true);
                        this.bldgHVACCfgTemplateIndex = new BldgHVACCfgTemplateIndexEnt(mib, this);
                        this.bldgHVACCfgTemplateDesiredTemp = new BldgHVACCfgTemplateDesiredTempEnt(mib, this);
                        this.bldgHVACCfgTemplateCoolOrHeat = new BldgHVACCfgTemplateCoolOrHeatEnt(mib, this);
                        this.bldgHVACCfgTemplateInfo = new BldgHVACCfgTemplateInfoEnt(mib, this);
                        this.bldgHVACCfgTemplateOwner = new BldgHVACCfgTemplateOwnerEnt(mib, this);
                        this.bldgHVACCfgTemplateStorage = new BldgHVACCfgTemplateStorageEnt(mib, this);
                        this.bldgHVACCfgTemplateStatus = new BldgHVACCfgTemplateStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.bldgHVACCfgTemplateIndex,
                            this.bldgHVACCfgTemplateDesiredTemp,
                            this.bldgHVACCfgTemplateCoolOrHeat,
                            this.bldgHVACCfgTemplateInfo,
                            this.bldgHVACCfgTemplateOwner,
                            this.bldgHVACCfgTemplateStorage,
                            this.bldgHVACCfgTemplateStatus
                        };
                    }
                    public static final class BldgHVACCfgTemplateIndexEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACCfgTemplateIndexEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACCfgTemplateIndex", "1.3.6.1.3.122.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACCfgTemplateDesiredTempEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACCfgTemplateDesiredTempEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACCfgTemplateDesiredTemp", "1.3.6.1.3.122.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACCfgTemplateCoolOrHeatEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACCfgTemplateCoolOrHeatEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACCfgTemplateCoolOrHeat", "1.3.6.1.3.122.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACCfgTemplateInfoEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACCfgTemplateInfoEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACCfgTemplateInfo", "1.3.6.1.3.122.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACCfgTemplateOwnerEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACCfgTemplateOwnerEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACCfgTemplateOwner", "1.3.6.1.3.122.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACCfgTemplateStorageEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACCfgTemplateStorageEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACCfgTemplateStorage", "1.3.6.1.3.122.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BldgHVACCfgTemplateStatusEnt extends MIBEntry<BLDGHVACMIBDef>
                    {
                        private BldgHVACCfgTemplateStatusEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                        {
                            super(mib, parent, "bldgHVACCfgTemplateStatus", "1.3.6.1.3.122.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class BldgConformanceEnt extends MIBEntry<BLDGHVACMIBDef>
        {
            /** Conformance Information*/
            public final BldgCompliancesEnt bldgCompliances;

            public final BldgGroupsEnt bldgGroups;

            private BldgConformanceEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
            {
                super(mib, parent, "bldgConformance", "1.3.6.1.3.122.2", false, false, false, false);
                this.bldgCompliances = new BldgCompliancesEnt(mib, this);
                this.bldgGroups = new BldgGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.bldgCompliances,
                    this.bldgGroups
                };
            }
            public static final class BldgCompliancesEnt extends MIBEntry<BLDGHVACMIBDef>
            {
                /** Compliance Statements*/
                public final BldgComplianceEnt bldgCompliance;

                private BldgCompliancesEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                {
                    super(mib, parent, "bldgCompliances", "1.3.6.1.3.122.2.1", false, false, false, false);
                    this.bldgCompliance = new BldgComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.bldgCompliance
                    };
                }
                public static final class BldgComplianceEnt extends MIBEntry<BLDGHVACMIBDef>
                {
                    private BldgComplianceEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                    {
                        super(mib, parent, "bldgCompliance", "1.3.6.1.3.122.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class BldgGroupsEnt extends MIBEntry<BLDGHVACMIBDef>
            {
                public final BldgHVACObjectsGroupEnt bldgHVACObjectsGroup;

                private BldgGroupsEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                {
                    super(mib, parent, "bldgGroups", "1.3.6.1.3.122.2.2", false, false, false, false);
                    this.bldgHVACObjectsGroup = new BldgHVACObjectsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.bldgHVACObjectsGroup
                    };
                }
                public static final class BldgHVACObjectsGroupEnt extends MIBEntry<BLDGHVACMIBDef>
                {
                    private BldgHVACObjectsGroupEnt(BLDGHVACMIBDef mib, MIBEntry<BLDGHVACMIBDef> parent)
                    {
                        super(mib, parent, "bldgHVACObjectsGroup", "1.3.6.1.3.122.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
