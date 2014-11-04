package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**--
--
--
--
--
--
--
--
--
--
--
--
--
--
--
--*/
public final class RDBMSMIBDef extends MIB
{
    public static final RDBMSMIBDef RDBMSMIB = new RDBMSMIBDef();

    static { MIBs.getInstance().registerMIB(RDBMSMIBDef.RDBMSMIB); }

    public final RdbmsMIBEnt rdbmsMIB;

    private RDBMSMIBDef()
    {
        super("RDBMS-MIB");
        this.rdbmsMIB = new RdbmsMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.rdbmsMIB
        };
    }

    public static final class RdbmsMIBEnt extends MIBEntry<RDBMSMIBDef>
    {
        public final RdbmsObjectsEnt rdbmsObjects;

        /** --------------------------------*/
        public final RdbmsTrapsEnt rdbmsTraps;

        /** --------------------------------

compliance information*/
        public final RdbmsConformanceEnt rdbmsConformance;

        private RdbmsMIBEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
        {
            super(mib, parent, "rdbmsMIB", "1.3.6.1.2.1.39", false, false, false, false);
            this.rdbmsObjects = new RdbmsObjectsEnt(mib, this);
            this.rdbmsTraps = new RdbmsTrapsEnt(mib, this);
            this.rdbmsConformance = new RdbmsConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.rdbmsObjects,
                this.rdbmsTraps,
                this.rdbmsConformance
            };
        }
        public static final class RdbmsObjectsEnt extends MIBEntry<RDBMSMIBDef>
        {
            /** --------------------------------*/
            public final RdbmsDbTableEnt rdbmsDbTable;

            /** --------------------------------*/
            public final RdbmsDbInfoTableEnt rdbmsDbInfoTable;

            /** --------------------------------*/
            public final RdbmsDbParamTableEnt rdbmsDbParamTable;

            /** --------------------------------*/
            public final RdbmsDbLimitedResourceTableEnt rdbmsDbLimitedResourceTable;

            /** --------------------------------*/
            public final RdbmsSrvTableEnt rdbmsSrvTable;

            /** --------------------------------*/
            public final RdbmsSrvInfoTableEnt rdbmsSrvInfoTable;

            /** --------------------------------*/
            public final RdbmsSrvParamTableEnt rdbmsSrvParamTable;

            /** --------------------------------*/
            public final RdbmsSrvLimitedResourceTableEnt rdbmsSrvLimitedResourceTable;

            /** --------------------------------*/
            public final RdbmsRelTableEnt rdbmsRelTable;

            /** --------------------------------

Well known resources for which limits, high water marks,access or allocation failures, and current levels of useare possibly available in either the rdbmsDbLimitedResourcesor the rdbmsSrvLimitedResources tables.*/
            public final RdbmsWellKnownLimitedResourcesEnt rdbmsWellKnownLimitedResources;

            private RdbmsObjectsEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
            {
                super(mib, parent, "rdbmsObjects", "1.3.6.1.2.1.39.1", false, false, false, false);
                this.rdbmsDbTable = new RdbmsDbTableEnt(mib, this);
                this.rdbmsDbInfoTable = new RdbmsDbInfoTableEnt(mib, this);
                this.rdbmsDbParamTable = new RdbmsDbParamTableEnt(mib, this);
                this.rdbmsDbLimitedResourceTable = new RdbmsDbLimitedResourceTableEnt(mib, this);
                this.rdbmsSrvTable = new RdbmsSrvTableEnt(mib, this);
                this.rdbmsSrvInfoTable = new RdbmsSrvInfoTableEnt(mib, this);
                this.rdbmsSrvParamTable = new RdbmsSrvParamTableEnt(mib, this);
                this.rdbmsSrvLimitedResourceTable = new RdbmsSrvLimitedResourceTableEnt(mib, this);
                this.rdbmsRelTable = new RdbmsRelTableEnt(mib, this);
                this.rdbmsWellKnownLimitedResources = new RdbmsWellKnownLimitedResourcesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rdbmsDbTable,
                    this.rdbmsDbInfoTable,
                    this.rdbmsDbParamTable,
                    this.rdbmsDbLimitedResourceTable,
                    this.rdbmsSrvTable,
                    this.rdbmsSrvInfoTable,
                    this.rdbmsSrvParamTable,
                    this.rdbmsSrvLimitedResourceTable,
                    this.rdbmsRelTable,
                    this.rdbmsWellKnownLimitedResources
                };
            }
            public static final class RdbmsDbTableEnt extends MIBEntry<RDBMSMIBDef>
            {
                public final RdbmsDbEntryEnt rdbmsDbEntry;

                private RdbmsDbTableEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                {
                    super(mib, parent, "rdbmsDbTable", "1.3.6.1.2.1.39.1.1", false, true, false, false);
                    this.rdbmsDbEntry = new RdbmsDbEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rdbmsDbEntry
                    };
                }
                public static final class RdbmsDbEntryEnt extends MIBEntry<RDBMSMIBDef>
                {
                    public final RdbmsDbIndexEnt rdbmsDbIndex;

                    public final RdbmsDbPrivateMibOIDEnt rdbmsDbPrivateMibOID;

                    public final RdbmsDbVendorNameEnt rdbmsDbVendorName;

                    public final RdbmsDbNameEnt rdbmsDbName;

                    public final RdbmsDbContactEnt rdbmsDbContact;

                    private RdbmsDbEntryEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                    {
                        super(mib, parent, "rdbmsDbEntry", "1.3.6.1.2.1.39.1.1.1", false, false, false, true);
                        this.rdbmsDbIndex = new RdbmsDbIndexEnt(mib, this);
                        this.rdbmsDbPrivateMibOID = new RdbmsDbPrivateMibOIDEnt(mib, this);
                        this.rdbmsDbVendorName = new RdbmsDbVendorNameEnt(mib, this);
                        this.rdbmsDbName = new RdbmsDbNameEnt(mib, this);
                        this.rdbmsDbContact = new RdbmsDbContactEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rdbmsDbIndex,
                            this.rdbmsDbPrivateMibOID,
                            this.rdbmsDbVendorName,
                            this.rdbmsDbName,
                            this.rdbmsDbContact
                        };
                    }
                    public static final class RdbmsDbIndexEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbIndexEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbIndex", "1.3.6.1.2.1.39.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbPrivateMibOIDEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbPrivateMibOIDEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbPrivateMibOID", "1.3.6.1.2.1.39.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbVendorNameEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbVendorNameEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbVendorName", "1.3.6.1.2.1.39.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbNameEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbNameEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbName", "1.3.6.1.2.1.39.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbContactEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbContactEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbContact", "1.3.6.1.2.1.39.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RdbmsDbInfoTableEnt extends MIBEntry<RDBMSMIBDef>
            {
                public final RdbmsDbInfoEntryEnt rdbmsDbInfoEntry;

                private RdbmsDbInfoTableEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                {
                    super(mib, parent, "rdbmsDbInfoTable", "1.3.6.1.2.1.39.1.2", false, true, false, false);
                    this.rdbmsDbInfoEntry = new RdbmsDbInfoEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rdbmsDbInfoEntry
                    };
                }
                public static final class RdbmsDbInfoEntryEnt extends MIBEntry<RDBMSMIBDef>
                {
                    public final RdbmsDbInfoProductNameEnt rdbmsDbInfoProductName;

                    public final RdbmsDbInfoVersionEnt rdbmsDbInfoVersion;

                    public final RdbmsDbInfoSizeUnitsEnt rdbmsDbInfoSizeUnits;

                    /** Note:  computing SizeAllocated may be expensive, and SNMP
agents might cache the value to increase performance.*/
                    public final RdbmsDbInfoSizeAllocatedEnt rdbmsDbInfoSizeAllocated;

                    /** Note:  computing SizeUsed may be expensive, and SNMP
agents might cache the value to increase performance.*/
                    public final RdbmsDbInfoSizeUsedEnt rdbmsDbInfoSizeUsed;

                    public final RdbmsDbInfoLastBackupEnt rdbmsDbInfoLastBackup;

                    private RdbmsDbInfoEntryEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                    {
                        super(mib, parent, "rdbmsDbInfoEntry", "1.3.6.1.2.1.39.1.2.1", false, false, false, true);
                        this.rdbmsDbInfoProductName = new RdbmsDbInfoProductNameEnt(mib, this);
                        this.rdbmsDbInfoVersion = new RdbmsDbInfoVersionEnt(mib, this);
                        this.rdbmsDbInfoSizeUnits = new RdbmsDbInfoSizeUnitsEnt(mib, this);
                        this.rdbmsDbInfoSizeAllocated = new RdbmsDbInfoSizeAllocatedEnt(mib, this);
                        this.rdbmsDbInfoSizeUsed = new RdbmsDbInfoSizeUsedEnt(mib, this);
                        this.rdbmsDbInfoLastBackup = new RdbmsDbInfoLastBackupEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rdbmsDbInfoProductName,
                            this.rdbmsDbInfoVersion,
                            this.rdbmsDbInfoSizeUnits,
                            this.rdbmsDbInfoSizeAllocated,
                            this.rdbmsDbInfoSizeUsed,
                            this.rdbmsDbInfoLastBackup
                        };
                    }
                    public static final class RdbmsDbInfoProductNameEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbInfoProductNameEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbInfoProductName", "1.3.6.1.2.1.39.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbInfoVersionEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbInfoVersionEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbInfoVersion", "1.3.6.1.2.1.39.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbInfoSizeUnitsEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbInfoSizeUnitsEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbInfoSizeUnits", "1.3.6.1.2.1.39.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbInfoSizeAllocatedEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbInfoSizeAllocatedEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbInfoSizeAllocated", "1.3.6.1.2.1.39.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbInfoSizeUsedEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbInfoSizeUsedEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbInfoSizeUsed", "1.3.6.1.2.1.39.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbInfoLastBackupEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbInfoLastBackupEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbInfoLastBackup", "1.3.6.1.2.1.39.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RdbmsDbParamTableEnt extends MIBEntry<RDBMSMIBDef>
            {
                public final RdbmsDbParamEntryEnt rdbmsDbParamEntry;

                private RdbmsDbParamTableEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                {
                    super(mib, parent, "rdbmsDbParamTable", "1.3.6.1.2.1.39.1.3", false, true, false, false);
                    this.rdbmsDbParamEntry = new RdbmsDbParamEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rdbmsDbParamEntry
                    };
                }
                public static final class RdbmsDbParamEntryEnt extends MIBEntry<RDBMSMIBDef>
                {
                    public final RdbmsDbParamNameEnt rdbmsDbParamName;

                    public final RdbmsDbParamSubIndexEnt rdbmsDbParamSubIndex;

                    public final RdbmsDbParamIDEnt rdbmsDbParamID;

                    public final RdbmsDbParamCurrValueEnt rdbmsDbParamCurrValue;

                    public final RdbmsDbParamCommentEnt rdbmsDbParamComment;

                    private RdbmsDbParamEntryEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                    {
                        super(mib, parent, "rdbmsDbParamEntry", "1.3.6.1.2.1.39.1.3.1", false, false, false, true);
                        this.rdbmsDbParamName = new RdbmsDbParamNameEnt(mib, this);
                        this.rdbmsDbParamSubIndex = new RdbmsDbParamSubIndexEnt(mib, this);
                        this.rdbmsDbParamID = new RdbmsDbParamIDEnt(mib, this);
                        this.rdbmsDbParamCurrValue = new RdbmsDbParamCurrValueEnt(mib, this);
                        this.rdbmsDbParamComment = new RdbmsDbParamCommentEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rdbmsDbParamName,
                            this.rdbmsDbParamSubIndex,
                            this.rdbmsDbParamID,
                            this.rdbmsDbParamCurrValue,
                            this.rdbmsDbParamComment
                        };
                    }
                    public static final class RdbmsDbParamNameEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbParamNameEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbParamName", "1.3.6.1.2.1.39.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbParamSubIndexEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbParamSubIndexEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbParamSubIndex", "1.3.6.1.2.1.39.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbParamIDEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbParamIDEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbParamID", "1.3.6.1.2.1.39.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbParamCurrValueEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbParamCurrValueEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbParamCurrValue", "1.3.6.1.2.1.39.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbParamCommentEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbParamCommentEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbParamComment", "1.3.6.1.2.1.39.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RdbmsDbLimitedResourceTableEnt extends MIBEntry<RDBMSMIBDef>
            {
                public final RdbmsDbLimitedResourceEntryEnt rdbmsDbLimitedResourceEntry;

                private RdbmsDbLimitedResourceTableEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                {
                    super(mib, parent, "rdbmsDbLimitedResourceTable", "1.3.6.1.2.1.39.1.4", false, true, false, false);
                    this.rdbmsDbLimitedResourceEntry = new RdbmsDbLimitedResourceEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rdbmsDbLimitedResourceEntry
                    };
                }
                public static final class RdbmsDbLimitedResourceEntryEnt extends MIBEntry<RDBMSMIBDef>
                {
                    public final RdbmsDbLimitedResourceNameEnt rdbmsDbLimitedResourceName;

                    public final RdbmsDbLimitedResourceIDEnt rdbmsDbLimitedResourceID;

                    public final RdbmsDbLimitedResourceLimitEnt rdbmsDbLimitedResourceLimit;

                    public final RdbmsDbLimitedResourceCurrentEnt rdbmsDbLimitedResourceCurrent;

                    public final RdbmsDbLimitedResourceHighwaterEnt rdbmsDbLimitedResourceHighwater;

                    public final RdbmsDbLimitedResourceFailuresEnt rdbmsDbLimitedResourceFailures;

                    public final RdbmsDbLimitedResourceDescriptionEnt rdbmsDbLimitedResourceDescription;

                    private RdbmsDbLimitedResourceEntryEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                    {
                        super(mib, parent, "rdbmsDbLimitedResourceEntry", "1.3.6.1.2.1.39.1.4.1", false, false, false, true);
                        this.rdbmsDbLimitedResourceName = new RdbmsDbLimitedResourceNameEnt(mib, this);
                        this.rdbmsDbLimitedResourceID = new RdbmsDbLimitedResourceIDEnt(mib, this);
                        this.rdbmsDbLimitedResourceLimit = new RdbmsDbLimitedResourceLimitEnt(mib, this);
                        this.rdbmsDbLimitedResourceCurrent = new RdbmsDbLimitedResourceCurrentEnt(mib, this);
                        this.rdbmsDbLimitedResourceHighwater = new RdbmsDbLimitedResourceHighwaterEnt(mib, this);
                        this.rdbmsDbLimitedResourceFailures = new RdbmsDbLimitedResourceFailuresEnt(mib, this);
                        this.rdbmsDbLimitedResourceDescription = new RdbmsDbLimitedResourceDescriptionEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rdbmsDbLimitedResourceName,
                            this.rdbmsDbLimitedResourceID,
                            this.rdbmsDbLimitedResourceLimit,
                            this.rdbmsDbLimitedResourceCurrent,
                            this.rdbmsDbLimitedResourceHighwater,
                            this.rdbmsDbLimitedResourceFailures,
                            this.rdbmsDbLimitedResourceDescription
                        };
                    }
                    public static final class RdbmsDbLimitedResourceNameEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbLimitedResourceNameEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbLimitedResourceName", "1.3.6.1.2.1.39.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbLimitedResourceIDEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbLimitedResourceIDEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbLimitedResourceID", "1.3.6.1.2.1.39.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbLimitedResourceLimitEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbLimitedResourceLimitEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbLimitedResourceLimit", "1.3.6.1.2.1.39.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbLimitedResourceCurrentEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbLimitedResourceCurrentEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbLimitedResourceCurrent", "1.3.6.1.2.1.39.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbLimitedResourceHighwaterEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbLimitedResourceHighwaterEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbLimitedResourceHighwater", "1.3.6.1.2.1.39.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbLimitedResourceFailuresEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbLimitedResourceFailuresEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbLimitedResourceFailures", "1.3.6.1.2.1.39.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsDbLimitedResourceDescriptionEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsDbLimitedResourceDescriptionEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsDbLimitedResourceDescription", "1.3.6.1.2.1.39.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RdbmsSrvTableEnt extends MIBEntry<RDBMSMIBDef>
            {
                public final RdbmsSrvEntryEnt rdbmsSrvEntry;

                private RdbmsSrvTableEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                {
                    super(mib, parent, "rdbmsSrvTable", "1.3.6.1.2.1.39.1.5", false, true, false, false);
                    this.rdbmsSrvEntry = new RdbmsSrvEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rdbmsSrvEntry
                    };
                }
                public static final class RdbmsSrvEntryEnt extends MIBEntry<RDBMSMIBDef>
                {
                    public final RdbmsSrvPrivateMibOIDEnt rdbmsSrvPrivateMibOID;

                    public final RdbmsSrvVendorNameEnt rdbmsSrvVendorName;

                    public final RdbmsSrvProductNameEnt rdbmsSrvProductName;

                    public final RdbmsSrvContactEnt rdbmsSrvContact;

                    private RdbmsSrvEntryEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                    {
                        super(mib, parent, "rdbmsSrvEntry", "1.3.6.1.2.1.39.1.5.1", false, false, false, true);
                        this.rdbmsSrvPrivateMibOID = new RdbmsSrvPrivateMibOIDEnt(mib, this);
                        this.rdbmsSrvVendorName = new RdbmsSrvVendorNameEnt(mib, this);
                        this.rdbmsSrvProductName = new RdbmsSrvProductNameEnt(mib, this);
                        this.rdbmsSrvContact = new RdbmsSrvContactEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rdbmsSrvPrivateMibOID,
                            this.rdbmsSrvVendorName,
                            this.rdbmsSrvProductName,
                            this.rdbmsSrvContact
                        };
                    }
                    public static final class RdbmsSrvPrivateMibOIDEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvPrivateMibOIDEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvPrivateMibOID", "1.3.6.1.2.1.39.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvVendorNameEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvVendorNameEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvVendorName", "1.3.6.1.2.1.39.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvProductNameEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvProductNameEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvProductName", "1.3.6.1.2.1.39.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvContactEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvContactEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvContact", "1.3.6.1.2.1.39.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RdbmsSrvInfoTableEnt extends MIBEntry<RDBMSMIBDef>
            {
                public final RdbmsSrvInfoEntryEnt rdbmsSrvInfoEntry;

                private RdbmsSrvInfoTableEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                {
                    super(mib, parent, "rdbmsSrvInfoTable", "1.3.6.1.2.1.39.1.6", false, true, false, false);
                    this.rdbmsSrvInfoEntry = new RdbmsSrvInfoEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rdbmsSrvInfoEntry
                    };
                }
                public static final class RdbmsSrvInfoEntryEnt extends MIBEntry<RDBMSMIBDef>
                {
                    public final RdbmsSrvInfoStartupTimeEnt rdbmsSrvInfoStartupTime;

                    public final RdbmsSrvInfoFinishedTransactionsEnt rdbmsSrvInfoFinishedTransactions;

                    public final RdbmsSrvInfoDiskReadsEnt rdbmsSrvInfoDiskReads;

                    public final RdbmsSrvInfoLogicalReadsEnt rdbmsSrvInfoLogicalReads;

                    public final RdbmsSrvInfoDiskWritesEnt rdbmsSrvInfoDiskWrites;

                    public final RdbmsSrvInfoLogicalWritesEnt rdbmsSrvInfoLogicalWrites;

                    public final RdbmsSrvInfoPageReadsEnt rdbmsSrvInfoPageReads;

                    public final RdbmsSrvInfoPageWritesEnt rdbmsSrvInfoPageWrites;

                    public final RdbmsSrvInfoDiskOutOfSpacesEnt rdbmsSrvInfoDiskOutOfSpaces;

                    public final RdbmsSrvInfoHandledRequestsEnt rdbmsSrvInfoHandledRequests;

                    public final RdbmsSrvInfoRequestRecvsEnt rdbmsSrvInfoRequestRecvs;

                    public final RdbmsSrvInfoRequestSendsEnt rdbmsSrvInfoRequestSends;

                    public final RdbmsSrvInfoHighwaterInboundAssociationsEnt rdbmsSrvInfoHighwaterInboundAssociations;

                    public final RdbmsSrvInfoMaxInboundAssociationsEnt rdbmsSrvInfoMaxInboundAssociations;

                    private RdbmsSrvInfoEntryEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                    {
                        super(mib, parent, "rdbmsSrvInfoEntry", "1.3.6.1.2.1.39.1.6.1", false, false, false, true);
                        this.rdbmsSrvInfoStartupTime = new RdbmsSrvInfoStartupTimeEnt(mib, this);
                        this.rdbmsSrvInfoFinishedTransactions = new RdbmsSrvInfoFinishedTransactionsEnt(mib, this);
                        this.rdbmsSrvInfoDiskReads = new RdbmsSrvInfoDiskReadsEnt(mib, this);
                        this.rdbmsSrvInfoLogicalReads = new RdbmsSrvInfoLogicalReadsEnt(mib, this);
                        this.rdbmsSrvInfoDiskWrites = new RdbmsSrvInfoDiskWritesEnt(mib, this);
                        this.rdbmsSrvInfoLogicalWrites = new RdbmsSrvInfoLogicalWritesEnt(mib, this);
                        this.rdbmsSrvInfoPageReads = new RdbmsSrvInfoPageReadsEnt(mib, this);
                        this.rdbmsSrvInfoPageWrites = new RdbmsSrvInfoPageWritesEnt(mib, this);
                        this.rdbmsSrvInfoDiskOutOfSpaces = new RdbmsSrvInfoDiskOutOfSpacesEnt(mib, this);
                        this.rdbmsSrvInfoHandledRequests = new RdbmsSrvInfoHandledRequestsEnt(mib, this);
                        this.rdbmsSrvInfoRequestRecvs = new RdbmsSrvInfoRequestRecvsEnt(mib, this);
                        this.rdbmsSrvInfoRequestSends = new RdbmsSrvInfoRequestSendsEnt(mib, this);
                        this.rdbmsSrvInfoHighwaterInboundAssociations = new RdbmsSrvInfoHighwaterInboundAssociationsEnt(mib, this);
                        this.rdbmsSrvInfoMaxInboundAssociations = new RdbmsSrvInfoMaxInboundAssociationsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rdbmsSrvInfoStartupTime,
                            this.rdbmsSrvInfoFinishedTransactions,
                            this.rdbmsSrvInfoDiskReads,
                            this.rdbmsSrvInfoLogicalReads,
                            this.rdbmsSrvInfoDiskWrites,
                            this.rdbmsSrvInfoLogicalWrites,
                            this.rdbmsSrvInfoPageReads,
                            this.rdbmsSrvInfoPageWrites,
                            this.rdbmsSrvInfoDiskOutOfSpaces,
                            this.rdbmsSrvInfoHandledRequests,
                            this.rdbmsSrvInfoRequestRecvs,
                            this.rdbmsSrvInfoRequestSends,
                            this.rdbmsSrvInfoHighwaterInboundAssociations,
                            this.rdbmsSrvInfoMaxInboundAssociations
                        };
                    }
                    public static final class RdbmsSrvInfoStartupTimeEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvInfoStartupTimeEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvInfoStartupTime", "1.3.6.1.2.1.39.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvInfoFinishedTransactionsEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvInfoFinishedTransactionsEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvInfoFinishedTransactions", "1.3.6.1.2.1.39.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvInfoDiskReadsEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvInfoDiskReadsEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvInfoDiskReads", "1.3.6.1.2.1.39.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvInfoLogicalReadsEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvInfoLogicalReadsEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvInfoLogicalReads", "1.3.6.1.2.1.39.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvInfoDiskWritesEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvInfoDiskWritesEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvInfoDiskWrites", "1.3.6.1.2.1.39.1.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvInfoLogicalWritesEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvInfoLogicalWritesEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvInfoLogicalWrites", "1.3.6.1.2.1.39.1.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvInfoPageReadsEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvInfoPageReadsEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvInfoPageReads", "1.3.6.1.2.1.39.1.6.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvInfoPageWritesEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvInfoPageWritesEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvInfoPageWrites", "1.3.6.1.2.1.39.1.6.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvInfoDiskOutOfSpacesEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvInfoDiskOutOfSpacesEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvInfoDiskOutOfSpaces", "1.3.6.1.2.1.39.1.6.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvInfoHandledRequestsEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvInfoHandledRequestsEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvInfoHandledRequests", "1.3.6.1.2.1.39.1.6.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvInfoRequestRecvsEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvInfoRequestRecvsEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvInfoRequestRecvs", "1.3.6.1.2.1.39.1.6.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvInfoRequestSendsEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvInfoRequestSendsEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvInfoRequestSends", "1.3.6.1.2.1.39.1.6.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvInfoHighwaterInboundAssociationsEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvInfoHighwaterInboundAssociationsEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvInfoHighwaterInboundAssociations", "1.3.6.1.2.1.39.1.6.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvInfoMaxInboundAssociationsEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvInfoMaxInboundAssociationsEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvInfoMaxInboundAssociations", "1.3.6.1.2.1.39.1.6.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RdbmsSrvParamTableEnt extends MIBEntry<RDBMSMIBDef>
            {
                public final RdbmsSrvParamEntryEnt rdbmsSrvParamEntry;

                private RdbmsSrvParamTableEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                {
                    super(mib, parent, "rdbmsSrvParamTable", "1.3.6.1.2.1.39.1.7", false, true, false, false);
                    this.rdbmsSrvParamEntry = new RdbmsSrvParamEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rdbmsSrvParamEntry
                    };
                }
                public static final class RdbmsSrvParamEntryEnt extends MIBEntry<RDBMSMIBDef>
                {
                    public final RdbmsSrvParamNameEnt rdbmsSrvParamName;

                    public final RdbmsSrvParamSubIndexEnt rdbmsSrvParamSubIndex;

                    public final RdbmsSrvParamIDEnt rdbmsSrvParamID;

                    public final RdbmsSrvParamCurrValueEnt rdbmsSrvParamCurrValue;

                    public final RdbmsSrvParamCommentEnt rdbmsSrvParamComment;

                    private RdbmsSrvParamEntryEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                    {
                        super(mib, parent, "rdbmsSrvParamEntry", "1.3.6.1.2.1.39.1.7.1", false, false, false, true);
                        this.rdbmsSrvParamName = new RdbmsSrvParamNameEnt(mib, this);
                        this.rdbmsSrvParamSubIndex = new RdbmsSrvParamSubIndexEnt(mib, this);
                        this.rdbmsSrvParamID = new RdbmsSrvParamIDEnt(mib, this);
                        this.rdbmsSrvParamCurrValue = new RdbmsSrvParamCurrValueEnt(mib, this);
                        this.rdbmsSrvParamComment = new RdbmsSrvParamCommentEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rdbmsSrvParamName,
                            this.rdbmsSrvParamSubIndex,
                            this.rdbmsSrvParamID,
                            this.rdbmsSrvParamCurrValue,
                            this.rdbmsSrvParamComment
                        };
                    }
                    public static final class RdbmsSrvParamNameEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvParamNameEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvParamName", "1.3.6.1.2.1.39.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvParamSubIndexEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvParamSubIndexEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvParamSubIndex", "1.3.6.1.2.1.39.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvParamIDEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvParamIDEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvParamID", "1.3.6.1.2.1.39.1.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvParamCurrValueEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvParamCurrValueEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvParamCurrValue", "1.3.6.1.2.1.39.1.7.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvParamCommentEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvParamCommentEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvParamComment", "1.3.6.1.2.1.39.1.7.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RdbmsSrvLimitedResourceTableEnt extends MIBEntry<RDBMSMIBDef>
            {
                public final RdbmsSrvLimitedResourceEntryEnt rdbmsSrvLimitedResourceEntry;

                private RdbmsSrvLimitedResourceTableEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                {
                    super(mib, parent, "rdbmsSrvLimitedResourceTable", "1.3.6.1.2.1.39.1.8", false, true, false, false);
                    this.rdbmsSrvLimitedResourceEntry = new RdbmsSrvLimitedResourceEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rdbmsSrvLimitedResourceEntry
                    };
                }
                public static final class RdbmsSrvLimitedResourceEntryEnt extends MIBEntry<RDBMSMIBDef>
                {
                    public final RdbmsSrvLimitedResourceNameEnt rdbmsSrvLimitedResourceName;

                    public final RdbmsSrvLimitedResourceIDEnt rdbmsSrvLimitedResourceID;

                    public final RdbmsSrvLimitedResourceLimitEnt rdbmsSrvLimitedResourceLimit;

                    public final RdbmsSrvLimitedResourceCurrentEnt rdbmsSrvLimitedResourceCurrent;

                    public final RdbmsSrvLimitedResourceHighwaterEnt rdbmsSrvLimitedResourceHighwater;

                    public final RdbmsSrvLimitedResourceFailuresEnt rdbmsSrvLimitedResourceFailures;

                    public final RdbmsSrvLimitedResourceDescriptionEnt rdbmsSrvLimitedResourceDescription;

                    private RdbmsSrvLimitedResourceEntryEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                    {
                        super(mib, parent, "rdbmsSrvLimitedResourceEntry", "1.3.6.1.2.1.39.1.8.1", false, false, false, true);
                        this.rdbmsSrvLimitedResourceName = new RdbmsSrvLimitedResourceNameEnt(mib, this);
                        this.rdbmsSrvLimitedResourceID = new RdbmsSrvLimitedResourceIDEnt(mib, this);
                        this.rdbmsSrvLimitedResourceLimit = new RdbmsSrvLimitedResourceLimitEnt(mib, this);
                        this.rdbmsSrvLimitedResourceCurrent = new RdbmsSrvLimitedResourceCurrentEnt(mib, this);
                        this.rdbmsSrvLimitedResourceHighwater = new RdbmsSrvLimitedResourceHighwaterEnt(mib, this);
                        this.rdbmsSrvLimitedResourceFailures = new RdbmsSrvLimitedResourceFailuresEnt(mib, this);
                        this.rdbmsSrvLimitedResourceDescription = new RdbmsSrvLimitedResourceDescriptionEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rdbmsSrvLimitedResourceName,
                            this.rdbmsSrvLimitedResourceID,
                            this.rdbmsSrvLimitedResourceLimit,
                            this.rdbmsSrvLimitedResourceCurrent,
                            this.rdbmsSrvLimitedResourceHighwater,
                            this.rdbmsSrvLimitedResourceFailures,
                            this.rdbmsSrvLimitedResourceDescription
                        };
                    }
                    public static final class RdbmsSrvLimitedResourceNameEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvLimitedResourceNameEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvLimitedResourceName", "1.3.6.1.2.1.39.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvLimitedResourceIDEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvLimitedResourceIDEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvLimitedResourceID", "1.3.6.1.2.1.39.1.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvLimitedResourceLimitEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvLimitedResourceLimitEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvLimitedResourceLimit", "1.3.6.1.2.1.39.1.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvLimitedResourceCurrentEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvLimitedResourceCurrentEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvLimitedResourceCurrent", "1.3.6.1.2.1.39.1.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvLimitedResourceHighwaterEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvLimitedResourceHighwaterEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvLimitedResourceHighwater", "1.3.6.1.2.1.39.1.8.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvLimitedResourceFailuresEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvLimitedResourceFailuresEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvLimitedResourceFailures", "1.3.6.1.2.1.39.1.8.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsSrvLimitedResourceDescriptionEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsSrvLimitedResourceDescriptionEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsSrvLimitedResourceDescription", "1.3.6.1.2.1.39.1.8.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RdbmsRelTableEnt extends MIBEntry<RDBMSMIBDef>
            {
                public final RdbmsRelEntryEnt rdbmsRelEntry;

                private RdbmsRelTableEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                {
                    super(mib, parent, "rdbmsRelTable", "1.3.6.1.2.1.39.1.9", false, true, false, false);
                    this.rdbmsRelEntry = new RdbmsRelEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rdbmsRelEntry
                    };
                }
                public static final class RdbmsRelEntryEnt extends MIBEntry<RDBMSMIBDef>
                {
                    public final RdbmsRelStateEnt rdbmsRelState;

                    public final RdbmsRelActiveTimeEnt rdbmsRelActiveTime;

                    private RdbmsRelEntryEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                    {
                        super(mib, parent, "rdbmsRelEntry", "1.3.6.1.2.1.39.1.9.1", false, false, false, true);
                        this.rdbmsRelState = new RdbmsRelStateEnt(mib, this);
                        this.rdbmsRelActiveTime = new RdbmsRelActiveTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rdbmsRelState,
                            this.rdbmsRelActiveTime
                        };
                    }
                    public static final class RdbmsRelStateEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsRelStateEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsRelState", "1.3.6.1.2.1.39.1.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RdbmsRelActiveTimeEnt extends MIBEntry<RDBMSMIBDef>
                    {
                        private RdbmsRelActiveTimeEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                        {
                            super(mib, parent, "rdbmsRelActiveTime", "1.3.6.1.2.1.39.1.9.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RdbmsWellKnownLimitedResourcesEnt extends MIBEntry<RDBMSMIBDef>
            {
                public final RdbmsLogSpaceEnt rdbmsLogSpace;

                private RdbmsWellKnownLimitedResourcesEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                {
                    super(mib, parent, "rdbmsWellKnownLimitedResources", "1.3.6.1.2.1.39.1.10", false, false, false, false);
                    this.rdbmsLogSpace = new RdbmsLogSpaceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rdbmsLogSpace
                    };
                }
                public static final class RdbmsLogSpaceEnt extends MIBEntry<RDBMSMIBDef>
                {
                    private RdbmsLogSpaceEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                    {
                        super(mib, parent, "rdbmsLogSpace", "1.3.6.1.2.1.39.1.10.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class RdbmsTrapsEnt extends MIBEntry<RDBMSMIBDef>
        {
            public final RdbmsStateChangeEnt rdbmsStateChange;

            public final RdbmsOutOfSpaceEnt rdbmsOutOfSpace;

            private RdbmsTrapsEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
            {
                super(mib, parent, "rdbmsTraps", "1.3.6.1.2.1.39.2", false, false, false, false);
                this.rdbmsStateChange = new RdbmsStateChangeEnt(mib, this);
                this.rdbmsOutOfSpace = new RdbmsOutOfSpaceEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rdbmsStateChange,
                    this.rdbmsOutOfSpace
                };
            }
            public static final class RdbmsStateChangeEnt extends MIBEntry<RDBMSMIBDef>
            {
                private RdbmsStateChangeEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                {
                    super(mib, parent, "rdbmsStateChange", "1.3.6.1.2.1.39.2.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RdbmsOutOfSpaceEnt extends MIBEntry<RDBMSMIBDef>
            {
                private RdbmsOutOfSpaceEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                {
                    super(mib, parent, "rdbmsOutOfSpace", "1.3.6.1.2.1.39.2.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class RdbmsConformanceEnt extends MIBEntry<RDBMSMIBDef>
        {
            public final RdbmsCompliancesEnt rdbmsCompliances;

            public final RdbmsGroupsEnt rdbmsGroups;

            private RdbmsConformanceEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
            {
                super(mib, parent, "rdbmsConformance", "1.3.6.1.2.1.39.3", false, false, false, false);
                this.rdbmsCompliances = new RdbmsCompliancesEnt(mib, this);
                this.rdbmsGroups = new RdbmsGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rdbmsCompliances,
                    this.rdbmsGroups
                };
            }
            public static final class RdbmsCompliancesEnt extends MIBEntry<RDBMSMIBDef>
            {
                /** compliance statements*/
                public final RdbmsComplianceEnt rdbmsCompliance;

                private RdbmsCompliancesEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                {
                    super(mib, parent, "rdbmsCompliances", "1.3.6.1.2.1.39.3.1", false, false, false, false);
                    this.rdbmsCompliance = new RdbmsComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rdbmsCompliance
                    };
                }
                public static final class RdbmsComplianceEnt extends MIBEntry<RDBMSMIBDef>
                {
                    private RdbmsComplianceEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                    {
                        super(mib, parent, "rdbmsCompliance", "1.3.6.1.2.1.39.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class RdbmsGroupsEnt extends MIBEntry<RDBMSMIBDef>
            {
                /** units of conformance
rdbmsStateChange and rdbmsOutOfSpace traps are omittedintentionally.  They are not required or part of anyconformance group.*/
                public final RdbmsGroupEnt rdbmsGroup;

                private RdbmsGroupsEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                {
                    super(mib, parent, "rdbmsGroups", "1.3.6.1.2.1.39.3.2", false, false, false, false);
                    this.rdbmsGroup = new RdbmsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rdbmsGroup
                    };
                }
                public static final class RdbmsGroupEnt extends MIBEntry<RDBMSMIBDef>
                {
                    private RdbmsGroupEnt(RDBMSMIBDef mib, MIBEntry<RDBMSMIBDef> parent)
                    {
                        super(mib, parent, "rdbmsGroup", "1.3.6.1.2.1.39.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
