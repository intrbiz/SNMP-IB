package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class AGGREGATEMIBDef extends MIB
{
    public static final AGGREGATEMIBDef AGGREGATEMIB = new AGGREGATEMIBDef();

    /** 27th April, 2006*/
    public final AggrMIBEnt aggrMIB;

    private AGGREGATEMIBDef()
    {
        super("AGGREGATE-MIB");
        this.aggrMIB = new AggrMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.aggrMIB
        };
    }

    public static final class AggrMIBEnt extends MIBEntry<AGGREGATEMIBDef>
    {
        /** The aggregation control tableThere will be a row for each aggregate MO*/
        public final AggrCtlTableEnt aggrCtlTable;

        /** The Table of primary(simple) MOs*/
        public final AggrMOTableEnt aggrMOTable;

        /** aggrDataTable: The Table of Data.  Each row represents a Data


set.  aggrCtlEntryID is the key to the table.It is used to identify instances of theaggregated MO that are present in the table.*/
        public final AggrDataTableEnt aggrDataTable;

        /** Conformance information*/
        public final AggrConformanceEnt aggrConformance;

        private AggrMIBEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
        {
            super(mib, parent, "aggrMIB", "1.3.6.1.3.123", false, false, false, false);
            this.aggrCtlTable = new AggrCtlTableEnt(mib, this);
            this.aggrMOTable = new AggrMOTableEnt(mib, this);
            this.aggrDataTable = new AggrDataTableEnt(mib, this);
            this.aggrConformance = new AggrConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.aggrCtlTable,
                this.aggrMOTable,
                this.aggrDataTable,
                this.aggrConformance
            };
        }
        public static final class AggrCtlTableEnt extends MIBEntry<AGGREGATEMIBDef>
        {
            public final AggrCtlEntryEnt aggrCtlEntry;

            private AggrCtlTableEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
            {
                super(mib, parent, "aggrCtlTable", "1.3.6.1.3.123.1", false, true, false, false);
                this.aggrCtlEntry = new AggrCtlEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.aggrCtlEntry
                };
            }
            public static final class AggrCtlEntryEnt extends MIBEntry<AGGREGATEMIBDef>
            {
                public final AggrCtlEntryIDEnt aggrCtlEntryID;

                public final AggrCtlMOIndexEnt aggrCtlMOIndex;

                public final AggrCtlMODescrEnt aggrCtlMODescr;

                /** only one compression algorithm is defined as of now.*/
                public final AggrCtlCompressionAlgorithmEnt aggrCtlCompressionAlgorithm;

                public final AggrCtlEntryOwnerEnt aggrCtlEntryOwner;

                public final AggrCtlEntryStorageTypeEnt aggrCtlEntryStorageType;

                public final AggrCtlEntryStatusEnt aggrCtlEntryStatus;

                private AggrCtlEntryEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                {
                    super(mib, parent, "aggrCtlEntry", "1.3.6.1.3.123.1.1", false, false, false, true);
                    this.aggrCtlEntryID = new AggrCtlEntryIDEnt(mib, this);
                    this.aggrCtlMOIndex = new AggrCtlMOIndexEnt(mib, this);
                    this.aggrCtlMODescr = new AggrCtlMODescrEnt(mib, this);
                    this.aggrCtlCompressionAlgorithm = new AggrCtlCompressionAlgorithmEnt(mib, this);
                    this.aggrCtlEntryOwner = new AggrCtlEntryOwnerEnt(mib, this);
                    this.aggrCtlEntryStorageType = new AggrCtlEntryStorageTypeEnt(mib, this);
                    this.aggrCtlEntryStatus = new AggrCtlEntryStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.aggrCtlEntryID,
                        this.aggrCtlMOIndex,
                        this.aggrCtlMODescr,
                        this.aggrCtlCompressionAlgorithm,
                        this.aggrCtlEntryOwner,
                        this.aggrCtlEntryStorageType,
                        this.aggrCtlEntryStatus
                    };
                }
                public static final class AggrCtlEntryIDEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrCtlEntryIDEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrCtlEntryID", "1.3.6.1.3.123.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AggrCtlMOIndexEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrCtlMOIndexEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrCtlMOIndex", "1.3.6.1.3.123.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AggrCtlMODescrEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrCtlMODescrEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrCtlMODescr", "1.3.6.1.3.123.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AggrCtlCompressionAlgorithmEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrCtlCompressionAlgorithmEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrCtlCompressionAlgorithm", "1.3.6.1.3.123.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AggrCtlEntryOwnerEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrCtlEntryOwnerEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrCtlEntryOwner", "1.3.6.1.3.123.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AggrCtlEntryStorageTypeEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrCtlEntryStorageTypeEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrCtlEntryStorageType", "1.3.6.1.3.123.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AggrCtlEntryStatusEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrCtlEntryStatusEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrCtlEntryStatus", "1.3.6.1.3.123.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class AggrMOTableEnt extends MIBEntry<AGGREGATEMIBDef>
        {
            public final AggrMOEntryEnt aggrMOEntry;

            private AggrMOTableEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
            {
                super(mib, parent, "aggrMOTable", "1.3.6.1.3.123.2", false, true, false, false);
                this.aggrMOEntry = new AggrMOEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.aggrMOEntry
                };
            }
            public static final class AggrMOEntryEnt extends MIBEntry<AGGREGATEMIBDef>
            {
                public final AggrMOEntryIDEnt aggrMOEntryID;

                public final AggrMOEntryMOIDEnt aggrMOEntryMOID;

                public final AggrMOInstanceEnt aggrMOInstance;

                public final AggrMODescrEnt aggrMODescr;

                public final AggrMOEntryStorageTypeEnt aggrMOEntryStorageType;

                public final AggrMOEntryStatusEnt aggrMOEntryStatus;

                private AggrMOEntryEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                {
                    super(mib, parent, "aggrMOEntry", "1.3.6.1.3.123.2.1", false, false, false, true);
                    this.aggrMOEntryID = new AggrMOEntryIDEnt(mib, this);
                    this.aggrMOEntryMOID = new AggrMOEntryMOIDEnt(mib, this);
                    this.aggrMOInstance = new AggrMOInstanceEnt(mib, this);
                    this.aggrMODescr = new AggrMODescrEnt(mib, this);
                    this.aggrMOEntryStorageType = new AggrMOEntryStorageTypeEnt(mib, this);
                    this.aggrMOEntryStatus = new AggrMOEntryStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.aggrMOEntryID,
                        this.aggrMOEntryMOID,
                        this.aggrMOInstance,
                        this.aggrMODescr,
                        this.aggrMOEntryStorageType,
                        this.aggrMOEntryStatus
                    };
                }
                public static final class AggrMOEntryIDEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrMOEntryIDEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrMOEntryID", "1.3.6.1.3.123.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AggrMOEntryMOIDEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrMOEntryMOIDEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrMOEntryMOID", "1.3.6.1.3.123.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AggrMOInstanceEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrMOInstanceEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrMOInstance", "1.3.6.1.3.123.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AggrMODescrEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrMODescrEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrMODescr", "1.3.6.1.3.123.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AggrMOEntryStorageTypeEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrMOEntryStorageTypeEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrMOEntryStorageType", "1.3.6.1.3.123.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AggrMOEntryStatusEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrMOEntryStatusEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrMOEntryStatus", "1.3.6.1.3.123.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class AggrDataTableEnt extends MIBEntry<AGGREGATEMIBDef>
        {
            public final AggrDataEntryEnt aggrDataEntry;

            private AggrDataTableEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
            {
                super(mib, parent, "aggrDataTable", "1.3.6.1.3.123.3", false, true, false, false);
                this.aggrDataEntry = new AggrDataEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.aggrDataEntry
                };
            }
            public static final class AggrDataEntryEnt extends MIBEntry<AGGREGATEMIBDef>
            {
                public final AggrDataRecordEnt aggrDataRecord;

                public final AggrDataRecordCompressedEnt aggrDataRecordCompressed;

                public final AggrDataErrorRecordEnt aggrDataErrorRecord;

                private AggrDataEntryEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                {
                    super(mib, parent, "aggrDataEntry", "1.3.6.1.3.123.3.1", false, false, false, true);
                    this.aggrDataRecord = new AggrDataRecordEnt(mib, this);
                    this.aggrDataRecordCompressed = new AggrDataRecordCompressedEnt(mib, this);
                    this.aggrDataErrorRecord = new AggrDataErrorRecordEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.aggrDataRecord,
                        this.aggrDataRecordCompressed,
                        this.aggrDataErrorRecord
                    };
                }
                public static final class AggrDataRecordEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrDataRecordEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrDataRecord", "1.3.6.1.3.123.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AggrDataRecordCompressedEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrDataRecordCompressedEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrDataRecordCompressed", "1.3.6.1.3.123.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AggrDataErrorRecordEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrDataErrorRecordEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrDataErrorRecord", "1.3.6.1.3.123.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class AggrConformanceEnt extends MIBEntry<AGGREGATEMIBDef>
        {
            public final AggrGroupsEnt aggrGroups;

            public final AggrCompliancesEnt aggrCompliances;

            private AggrConformanceEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
            {
                super(mib, parent, "aggrConformance", "1.3.6.1.3.123.4", false, false, false, false);
                this.aggrGroups = new AggrGroupsEnt(mib, this);
                this.aggrCompliances = new AggrCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.aggrGroups,
                    this.aggrCompliances
                };
            }
            public static final class AggrGroupsEnt extends MIBEntry<AGGREGATEMIBDef>
            {
                /** Units of conformance*/
                public final AggrMibBasicGroupEnt aggrMibBasicGroup;

                private AggrGroupsEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                {
                    super(mib, parent, "aggrGroups", "1.3.6.1.3.123.4.1", false, false, false, false);
                    this.aggrMibBasicGroup = new AggrMibBasicGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.aggrMibBasicGroup
                    };
                }
                public static final class AggrMibBasicGroupEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrMibBasicGroupEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrMibBasicGroup", "1.3.6.1.3.123.4.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class AggrCompliancesEnt extends MIBEntry<AGGREGATEMIBDef>
            {
                /** Compliance statements*/
                public final AggrMibComplianceEnt aggrMibCompliance;

                private AggrCompliancesEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                {
                    super(mib, parent, "aggrCompliances", "1.3.6.1.3.123.4.2", false, false, false, false);
                    this.aggrMibCompliance = new AggrMibComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.aggrMibCompliance
                    };
                }
                public static final class AggrMibComplianceEnt extends MIBEntry<AGGREGATEMIBDef>
                {
                    private AggrMibComplianceEnt(AGGREGATEMIBDef mib, MIBEntry<AGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "aggrMibCompliance", "1.3.6.1.3.123.4.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
