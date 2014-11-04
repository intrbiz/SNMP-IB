package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class TIMEAGGREGATEMIBDef extends MIB
{
    public static final TIMEAGGREGATEMIBDef TIMEAGGREGATEMIB = new TIMEAGGREGATEMIBDef();

    static { MIBs.getInstance().registerMIB(TIMEAGGREGATEMIBDef.TIMEAGGREGATEMIB); }

    /** 27 April 2006*/
    public final TAggrMIBEnt tAggrMIB;

    private TIMEAGGREGATEMIBDef()
    {
        super("TIME-AGGREGATE-MIB");
        this.tAggrMIB = new TAggrMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.tAggrMIB
        };
    }

    public static final class TAggrMIBEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
    {
        /** The Time-Based aggregation control table*/
        public final TAggrCtlTableEnt tAggrCtlTable;

        /** tAggrDataTable: The data table.*/
        public final TAggrDataTableEnt tAggrDataTable;

        /** Conformance information*/
        public final TAggrConformanceEnt tAggrConformance;

        private TAggrMIBEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
        {
            super(mib, parent, "tAggrMIB", "1.3.6.1.3.124", false, false, false, false);
            this.tAggrCtlTable = new TAggrCtlTableEnt(mib, this);
            this.tAggrDataTable = new TAggrDataTableEnt(mib, this);
            this.tAggrConformance = new TAggrConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.tAggrCtlTable,
                this.tAggrDataTable,
                this.tAggrConformance
            };
        }
        public static final class TAggrCtlTableEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
        {
            public final TAggrCtlEntryEnt tAggrCtlEntry;

            private TAggrCtlTableEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
            {
                super(mib, parent, "tAggrCtlTable", "1.3.6.1.3.124.1", false, true, false, false);
                this.tAggrCtlEntry = new TAggrCtlEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tAggrCtlEntry
                };
            }
            public static final class TAggrCtlEntryEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
            {
                public final TAggrCtlEntryIDEnt tAggrCtlEntryID;

                public final TAggrCtlMOInstanceEnt tAggrCtlMOInstance;

                public final TAggrCtlAgMODescrEnt tAggrCtlAgMODescr;

                public final TAggrCtlIntervalEnt tAggrCtlInterval;

                public final TAggrCtlSamplesEnt tAggrCtlSamples;

                /** only one compression algorithm is defined as of now.*/
                public final TAggrCtlCompressionAlgorithmEnt tAggrCtlCompressionAlgorithm;

                public final TAggrCtlEntryOwnerEnt tAggrCtlEntryOwner;

                public final TAggrCtlEntryStorageTypeEnt tAggrCtlEntryStorageType;

                public final TAggrCtlEntryStatusEnt tAggrCtlEntryStatus;

                private TAggrCtlEntryEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                {
                    super(mib, parent, "tAggrCtlEntry", "1.3.6.1.3.124.1.1", false, false, false, true);
                    this.tAggrCtlEntryID = new TAggrCtlEntryIDEnt(mib, this);
                    this.tAggrCtlMOInstance = new TAggrCtlMOInstanceEnt(mib, this);
                    this.tAggrCtlAgMODescr = new TAggrCtlAgMODescrEnt(mib, this);
                    this.tAggrCtlInterval = new TAggrCtlIntervalEnt(mib, this);
                    this.tAggrCtlSamples = new TAggrCtlSamplesEnt(mib, this);
                    this.tAggrCtlCompressionAlgorithm = new TAggrCtlCompressionAlgorithmEnt(mib, this);
                    this.tAggrCtlEntryOwner = new TAggrCtlEntryOwnerEnt(mib, this);
                    this.tAggrCtlEntryStorageType = new TAggrCtlEntryStorageTypeEnt(mib, this);
                    this.tAggrCtlEntryStatus = new TAggrCtlEntryStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tAggrCtlEntryID,
                        this.tAggrCtlMOInstance,
                        this.tAggrCtlAgMODescr,
                        this.tAggrCtlInterval,
                        this.tAggrCtlSamples,
                        this.tAggrCtlCompressionAlgorithm,
                        this.tAggrCtlEntryOwner,
                        this.tAggrCtlEntryStorageType,
                        this.tAggrCtlEntryStatus
                    };
                }
                public static final class TAggrCtlEntryIDEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
                {
                    private TAggrCtlEntryIDEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "tAggrCtlEntryID", "1.3.6.1.3.124.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TAggrCtlMOInstanceEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
                {
                    private TAggrCtlMOInstanceEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "tAggrCtlMOInstance", "1.3.6.1.3.124.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TAggrCtlAgMODescrEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
                {
                    private TAggrCtlAgMODescrEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "tAggrCtlAgMODescr", "1.3.6.1.3.124.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TAggrCtlIntervalEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
                {
                    private TAggrCtlIntervalEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "tAggrCtlInterval", "1.3.6.1.3.124.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TAggrCtlSamplesEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
                {
                    private TAggrCtlSamplesEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "tAggrCtlSamples", "1.3.6.1.3.124.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TAggrCtlCompressionAlgorithmEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
                {
                    private TAggrCtlCompressionAlgorithmEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "tAggrCtlCompressionAlgorithm", "1.3.6.1.3.124.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TAggrCtlEntryOwnerEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
                {
                    private TAggrCtlEntryOwnerEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "tAggrCtlEntryOwner", "1.3.6.1.3.124.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TAggrCtlEntryStorageTypeEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
                {
                    private TAggrCtlEntryStorageTypeEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "tAggrCtlEntryStorageType", "1.3.6.1.3.124.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TAggrCtlEntryStatusEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
                {
                    private TAggrCtlEntryStatusEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "tAggrCtlEntryStatus", "1.3.6.1.3.124.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class TAggrDataTableEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
        {
            public final TAggrDataEntryEnt tAggrDataEntry;

            private TAggrDataTableEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
            {
                super(mib, parent, "tAggrDataTable", "1.3.6.1.3.124.2", false, true, false, false);
                this.tAggrDataEntry = new TAggrDataEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tAggrDataEntry
                };
            }
            public static final class TAggrDataEntryEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
            {
                public final TAggrDataRecordEnt tAggrDataRecord;

                public final TAggrDataRecordCompressedEnt tAggrDataRecordCompressed;

                public final TAggrDataErrorRecordEnt tAggrDataErrorRecord;

                private TAggrDataEntryEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                {
                    super(mib, parent, "tAggrDataEntry", "1.3.6.1.3.124.2.1", false, false, false, true);
                    this.tAggrDataRecord = new TAggrDataRecordEnt(mib, this);
                    this.tAggrDataRecordCompressed = new TAggrDataRecordCompressedEnt(mib, this);
                    this.tAggrDataErrorRecord = new TAggrDataErrorRecordEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tAggrDataRecord,
                        this.tAggrDataRecordCompressed,
                        this.tAggrDataErrorRecord
                    };
                }
                public static final class TAggrDataRecordEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
                {
                    private TAggrDataRecordEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "tAggrDataRecord", "1.3.6.1.3.124.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TAggrDataRecordCompressedEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
                {
                    private TAggrDataRecordCompressedEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "tAggrDataRecordCompressed", "1.3.6.1.3.124.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TAggrDataErrorRecordEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
                {
                    private TAggrDataErrorRecordEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "tAggrDataErrorRecord", "1.3.6.1.3.124.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class TAggrConformanceEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
        {
            public final TAggrGroupsEnt tAggrGroups;

            public final TAggrCompliancesEnt tAggrCompliances;

            private TAggrConformanceEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
            {
                super(mib, parent, "tAggrConformance", "1.3.6.1.3.124.3", false, false, false, false);
                this.tAggrGroups = new TAggrGroupsEnt(mib, this);
                this.tAggrCompliances = new TAggrCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tAggrGroups,
                    this.tAggrCompliances
                };
            }
            public static final class TAggrGroupsEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
            {
                /** Units of conformance*/
                public final TAggrMibBasicGroupEnt tAggrMibBasicGroup;

                private TAggrGroupsEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                {
                    super(mib, parent, "tAggrGroups", "1.3.6.1.3.124.3.1", false, false, false, false);
                    this.tAggrMibBasicGroup = new TAggrMibBasicGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tAggrMibBasicGroup
                    };
                }
                public static final class TAggrMibBasicGroupEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
                {
                    private TAggrMibBasicGroupEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "tAggrMibBasicGroup", "1.3.6.1.3.124.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class TAggrCompliancesEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
            {
                /** Compliance statements*/
                public final TAggrMibComplianceEnt tAggrMibCompliance;

                private TAggrCompliancesEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                {
                    super(mib, parent, "tAggrCompliances", "1.3.6.1.3.124.3.2", false, false, false, false);
                    this.tAggrMibCompliance = new TAggrMibComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tAggrMibCompliance
                    };
                }
                public static final class TAggrMibComplianceEnt extends MIBEntry<TIMEAGGREGATEMIBDef>
                {
                    private TAggrMibComplianceEnt(TIMEAGGREGATEMIBDef mib, MIBEntry<TIMEAGGREGATEMIBDef> parent)
                    {
                        super(mib, parent, "tAggrMibCompliance", "1.3.6.1.3.124.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
