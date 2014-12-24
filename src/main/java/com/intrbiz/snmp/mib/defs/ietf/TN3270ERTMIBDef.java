package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class TN3270ERTMIBDef extends MIB
{
    public static final TN3270ERTMIBDef TN3270ERTMIB = new TN3270ERTMIBDef();

    /** July 27, 1998
RFC Editor to fill in*/
    public final Tn3270eRtMIBEnt tn3270eRtMIB;

    private TN3270ERTMIBDef()
    {
        super("TN3270E-RT-MIB");
        this.tn3270eRtMIB = new Tn3270eRtMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.tn3270eRtMIB
        };
    }

    public static final class Tn3270eRtMIBEnt extends MIBEntry<TN3270ERTMIBDef>
    {
        /** snanauMIB ::= { mib-2 34 }
Top level structure of the MIB*/
        public final Tn3270eRtNotificationsEnt tn3270eRtNotifications;

        public final Tn3270eRtObjectsEnt tn3270eRtObjects;

        public final Tn3270eRtConformanceEnt tn3270eRtConformance;

        private Tn3270eRtMIBEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
        {
            super(mib, parent, "tn3270eRtMIB", "1.3.6.1.2.1.34.9", false, false, false, false);
            this.tn3270eRtNotifications = new Tn3270eRtNotificationsEnt(mib, this);
            this.tn3270eRtObjects = new Tn3270eRtObjectsEnt(mib, this);
            this.tn3270eRtConformance = new Tn3270eRtConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.tn3270eRtNotifications,
                this.tn3270eRtObjects,
                this.tn3270eRtConformance
            };
        }
        public static final class Tn3270eRtNotificationsEnt extends MIBEntry<TN3270ERTMIBDef>
        {
            /** Notifications*/
            public final Tn3270eRtExceededEnt tn3270eRtExceeded;

            public final Tn3270eRtOkayEnt tn3270eRtOkay;

            /** type of collection
type of resource*/
            public final Tn3270eRtCollStartEnt tn3270eRtCollStart;

            public final Tn3270eRtCollEndEnt tn3270eRtCollEnd;

            private Tn3270eRtNotificationsEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
            {
                super(mib, parent, "tn3270eRtNotifications", "1.3.6.1.2.1.34.9.0", false, false, false, false);
                this.tn3270eRtExceeded = new Tn3270eRtExceededEnt(mib, this);
                this.tn3270eRtOkay = new Tn3270eRtOkayEnt(mib, this);
                this.tn3270eRtCollStart = new Tn3270eRtCollStartEnt(mib, this);
                this.tn3270eRtCollEnd = new Tn3270eRtCollEndEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tn3270eRtExceeded,
                    this.tn3270eRtOkay,
                    this.tn3270eRtCollStart,
                    this.tn3270eRtCollEnd
                };
            }
            public static final class Tn3270eRtExceededEnt extends MIBEntry<TN3270ERTMIBDef>
            {
                private Tn3270eRtExceededEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                {
                    super(mib, parent, "tn3270eRtExceeded", "1.3.6.1.2.1.34.9.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Tn3270eRtOkayEnt extends MIBEntry<TN3270ERTMIBDef>
            {
                private Tn3270eRtOkayEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                {
                    super(mib, parent, "tn3270eRtOkay", "1.3.6.1.2.1.34.9.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Tn3270eRtCollStartEnt extends MIBEntry<TN3270ERTMIBDef>
            {
                private Tn3270eRtCollStartEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                {
                    super(mib, parent, "tn3270eRtCollStart", "1.3.6.1.2.1.34.9.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Tn3270eRtCollEndEnt extends MIBEntry<TN3270ERTMIBDef>
            {
                private Tn3270eRtCollEndEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                {
                    super(mib, parent, "tn3270eRtCollEnd", "1.3.6.1.2.1.34.9.0.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Tn3270eRtObjectsEnt extends MIBEntry<TN3270ERTMIBDef>
        {
            /** MIB Objects
Response Time Control Table*/
            public final Tn3270eRtCollCtlTableEnt tn3270eRtCollCtlTable;

            /** TN3270E Response Time Data Table*/
            public final Tn3270eRtDataTableEnt tn3270eRtDataTable;

            public final Tn3270eRtSpinLockEnt tn3270eRtSpinLock;

            private Tn3270eRtObjectsEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
            {
                super(mib, parent, "tn3270eRtObjects", "1.3.6.1.2.1.34.9.1", false, false, false, false);
                this.tn3270eRtCollCtlTable = new Tn3270eRtCollCtlTableEnt(mib, this);
                this.tn3270eRtDataTable = new Tn3270eRtDataTableEnt(mib, this);
                this.tn3270eRtSpinLock = new Tn3270eRtSpinLockEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tn3270eRtCollCtlTable,
                    this.tn3270eRtDataTable,
                    this.tn3270eRtSpinLock
                };
            }
            public static final class Tn3270eRtCollCtlTableEnt extends MIBEntry<TN3270ERTMIBDef>
            {
                /** Server's index
What to collect on*/
                public final Tn3270eRtCollCtlEntryEnt tn3270eRtCollCtlEntry;

                private Tn3270eRtCollCtlTableEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                {
                    super(mib, parent, "tn3270eRtCollCtlTable", "1.3.6.1.2.1.34.9.1.1", false, true, false, false);
                    this.tn3270eRtCollCtlEntry = new Tn3270eRtCollCtlEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tn3270eRtCollCtlEntry
                    };
                }
                public static final class Tn3270eRtCollCtlEntryEnt extends MIBEntry<TN3270ERTMIBDef>
                {
                    /** The OID { tn3270eRtCollCtlEntry 1 } is not used*/
                    public final Tn3270eRtCollCtlTypeEnt tn3270eRtCollCtlType;

                    /** 20 seconds*/
                    public final Tn3270eRtCollCtlSPeriodEnt tn3270eRtCollCtlSPeriod;

                    /** yields an interval of 10 minutes when
used with the default SPeriod value*/
                    public final Tn3270eRtCollCtlSPMultEnt tn3270eRtCollCtlSPMult;

                    /** suppress notifications*/
                    public final Tn3270eRtCollCtlThreshHighEnt tn3270eRtCollCtlThreshHigh;

                    /** suppress notifications*/
                    public final Tn3270eRtCollCtlThreshLowEnt tn3270eRtCollCtlThreshLow;

                    public final Tn3270eRtCollCtlIdleCountEnt tn3270eRtCollCtlIdleCount;

                    public final Tn3270eRtCollCtlBucketBndry1Ent tn3270eRtCollCtlBucketBndry1;

                    public final Tn3270eRtCollCtlBucketBndry2Ent tn3270eRtCollCtlBucketBndry2;

                    public final Tn3270eRtCollCtlBucketBndry3Ent tn3270eRtCollCtlBucketBndry3;

                    public final Tn3270eRtCollCtlBucketBndry4Ent tn3270eRtCollCtlBucketBndry4;

                    public final Tn3270eRtCollCtlRowStatusEnt tn3270eRtCollCtlRowStatus;

                    private Tn3270eRtCollCtlEntryEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eRtCollCtlEntry", "1.3.6.1.2.1.34.9.1.1.1", false, false, false, true);
                        this.tn3270eRtCollCtlType = new Tn3270eRtCollCtlTypeEnt(mib, this);
                        this.tn3270eRtCollCtlSPeriod = new Tn3270eRtCollCtlSPeriodEnt(mib, this);
                        this.tn3270eRtCollCtlSPMult = new Tn3270eRtCollCtlSPMultEnt(mib, this);
                        this.tn3270eRtCollCtlThreshHigh = new Tn3270eRtCollCtlThreshHighEnt(mib, this);
                        this.tn3270eRtCollCtlThreshLow = new Tn3270eRtCollCtlThreshLowEnt(mib, this);
                        this.tn3270eRtCollCtlIdleCount = new Tn3270eRtCollCtlIdleCountEnt(mib, this);
                        this.tn3270eRtCollCtlBucketBndry1 = new Tn3270eRtCollCtlBucketBndry1Ent(mib, this);
                        this.tn3270eRtCollCtlBucketBndry2 = new Tn3270eRtCollCtlBucketBndry2Ent(mib, this);
                        this.tn3270eRtCollCtlBucketBndry3 = new Tn3270eRtCollCtlBucketBndry3Ent(mib, this);
                        this.tn3270eRtCollCtlBucketBndry4 = new Tn3270eRtCollCtlBucketBndry4Ent(mib, this);
                        this.tn3270eRtCollCtlRowStatus = new Tn3270eRtCollCtlRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tn3270eRtCollCtlType,
                            this.tn3270eRtCollCtlSPeriod,
                            this.tn3270eRtCollCtlSPMult,
                            this.tn3270eRtCollCtlThreshHigh,
                            this.tn3270eRtCollCtlThreshLow,
                            this.tn3270eRtCollCtlIdleCount,
                            this.tn3270eRtCollCtlBucketBndry1,
                            this.tn3270eRtCollCtlBucketBndry2,
                            this.tn3270eRtCollCtlBucketBndry3,
                            this.tn3270eRtCollCtlBucketBndry4,
                            this.tn3270eRtCollCtlRowStatus
                        };
                    }
                    public static final class Tn3270eRtCollCtlTypeEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtCollCtlTypeEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtCollCtlType", "1.3.6.1.2.1.34.9.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtCollCtlSPeriodEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtCollCtlSPeriodEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtCollCtlSPeriod", "1.3.6.1.2.1.34.9.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtCollCtlSPMultEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtCollCtlSPMultEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtCollCtlSPMult", "1.3.6.1.2.1.34.9.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtCollCtlThreshHighEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtCollCtlThreshHighEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtCollCtlThreshHigh", "1.3.6.1.2.1.34.9.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtCollCtlThreshLowEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtCollCtlThreshLowEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtCollCtlThreshLow", "1.3.6.1.2.1.34.9.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtCollCtlIdleCountEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtCollCtlIdleCountEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtCollCtlIdleCount", "1.3.6.1.2.1.34.9.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtCollCtlBucketBndry1Ent extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtCollCtlBucketBndry1Ent(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtCollCtlBucketBndry1", "1.3.6.1.2.1.34.9.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtCollCtlBucketBndry2Ent extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtCollCtlBucketBndry2Ent(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtCollCtlBucketBndry2", "1.3.6.1.2.1.34.9.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtCollCtlBucketBndry3Ent extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtCollCtlBucketBndry3Ent(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtCollCtlBucketBndry3", "1.3.6.1.2.1.34.9.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtCollCtlBucketBndry4Ent extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtCollCtlBucketBndry4Ent(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtCollCtlBucketBndry4", "1.3.6.1.2.1.34.9.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtCollCtlRowStatusEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtCollCtlRowStatusEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtCollCtlRowStatus", "1.3.6.1.2.1.34.9.1.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Tn3270eRtDataTableEnt extends MIBEntry<TN3270ERTMIBDef>
            {
                /** Server's local index
Collection target*/
                public final Tn3270eRtDataEntryEnt tn3270eRtDataEntry;

                private Tn3270eRtDataTableEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                {
                    super(mib, parent, "tn3270eRtDataTable", "1.3.6.1.2.1.34.9.1.2", false, true, false, false);
                    this.tn3270eRtDataEntry = new Tn3270eRtDataEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tn3270eRtDataEntry
                    };
                }
                public static final class Tn3270eRtDataEntryEnt extends MIBEntry<TN3270ERTMIBDef>
                {
                    public final Tn3270eRtDataClientAddrTypeEnt tn3270eRtDataClientAddrType;

                    public final Tn3270eRtDataClientAddressEnt tn3270eRtDataClientAddress;

                    public final Tn3270eRtDataClientPortEnt tn3270eRtDataClientPort;

                    public final Tn3270eRtDataAvgRtEnt tn3270eRtDataAvgRt;

                    public final Tn3270eRtDataAvgIpRtEnt tn3270eRtDataAvgIpRt;

                    public final Tn3270eRtDataAvgCountTransEnt tn3270eRtDataAvgCountTrans;

                    public final Tn3270eRtDataIntTimeStampEnt tn3270eRtDataIntTimeStamp;

                    public final Tn3270eRtDataTotalRtsEnt tn3270eRtDataTotalRts;

                    public final Tn3270eRtDataTotalIpRtsEnt tn3270eRtDataTotalIpRts;

                    public final Tn3270eRtDataCountTransEnt tn3270eRtDataCountTrans;

                    public final Tn3270eRtDataCountDrsEnt tn3270eRtDataCountDrs;

                    public final Tn3270eRtDataElapsRndTrpSqEnt tn3270eRtDataElapsRndTrpSq;

                    public final Tn3270eRtDataElapsIpRtSqEnt tn3270eRtDataElapsIpRtSq;

                    public final Tn3270eRtDataBucket1RtsEnt tn3270eRtDataBucket1Rts;

                    public final Tn3270eRtDataBucket2RtsEnt tn3270eRtDataBucket2Rts;

                    public final Tn3270eRtDataBucket3RtsEnt tn3270eRtDataBucket3Rts;

                    public final Tn3270eRtDataBucket4RtsEnt tn3270eRtDataBucket4Rts;

                    public final Tn3270eRtDataBucket5RtsEnt tn3270eRtDataBucket5Rts;

                    public final Tn3270eRtDataRtMethodEnt tn3270eRtDataRtMethod;

                    public final Tn3270eRtDataDiscontinuityTimeEnt tn3270eRtDataDiscontinuityTime;

                    private Tn3270eRtDataEntryEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eRtDataEntry", "1.3.6.1.2.1.34.9.1.2.1", false, false, false, true);
                        this.tn3270eRtDataClientAddrType = new Tn3270eRtDataClientAddrTypeEnt(mib, this);
                        this.tn3270eRtDataClientAddress = new Tn3270eRtDataClientAddressEnt(mib, this);
                        this.tn3270eRtDataClientPort = new Tn3270eRtDataClientPortEnt(mib, this);
                        this.tn3270eRtDataAvgRt = new Tn3270eRtDataAvgRtEnt(mib, this);
                        this.tn3270eRtDataAvgIpRt = new Tn3270eRtDataAvgIpRtEnt(mib, this);
                        this.tn3270eRtDataAvgCountTrans = new Tn3270eRtDataAvgCountTransEnt(mib, this);
                        this.tn3270eRtDataIntTimeStamp = new Tn3270eRtDataIntTimeStampEnt(mib, this);
                        this.tn3270eRtDataTotalRts = new Tn3270eRtDataTotalRtsEnt(mib, this);
                        this.tn3270eRtDataTotalIpRts = new Tn3270eRtDataTotalIpRtsEnt(mib, this);
                        this.tn3270eRtDataCountTrans = new Tn3270eRtDataCountTransEnt(mib, this);
                        this.tn3270eRtDataCountDrs = new Tn3270eRtDataCountDrsEnt(mib, this);
                        this.tn3270eRtDataElapsRndTrpSq = new Tn3270eRtDataElapsRndTrpSqEnt(mib, this);
                        this.tn3270eRtDataElapsIpRtSq = new Tn3270eRtDataElapsIpRtSqEnt(mib, this);
                        this.tn3270eRtDataBucket1Rts = new Tn3270eRtDataBucket1RtsEnt(mib, this);
                        this.tn3270eRtDataBucket2Rts = new Tn3270eRtDataBucket2RtsEnt(mib, this);
                        this.tn3270eRtDataBucket3Rts = new Tn3270eRtDataBucket3RtsEnt(mib, this);
                        this.tn3270eRtDataBucket4Rts = new Tn3270eRtDataBucket4RtsEnt(mib, this);
                        this.tn3270eRtDataBucket5Rts = new Tn3270eRtDataBucket5RtsEnt(mib, this);
                        this.tn3270eRtDataRtMethod = new Tn3270eRtDataRtMethodEnt(mib, this);
                        this.tn3270eRtDataDiscontinuityTime = new Tn3270eRtDataDiscontinuityTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tn3270eRtDataClientAddrType,
                            this.tn3270eRtDataClientAddress,
                            this.tn3270eRtDataClientPort,
                            this.tn3270eRtDataAvgRt,
                            this.tn3270eRtDataAvgIpRt,
                            this.tn3270eRtDataAvgCountTrans,
                            this.tn3270eRtDataIntTimeStamp,
                            this.tn3270eRtDataTotalRts,
                            this.tn3270eRtDataTotalIpRts,
                            this.tn3270eRtDataCountTrans,
                            this.tn3270eRtDataCountDrs,
                            this.tn3270eRtDataElapsRndTrpSq,
                            this.tn3270eRtDataElapsIpRtSq,
                            this.tn3270eRtDataBucket1Rts,
                            this.tn3270eRtDataBucket2Rts,
                            this.tn3270eRtDataBucket3Rts,
                            this.tn3270eRtDataBucket4Rts,
                            this.tn3270eRtDataBucket5Rts,
                            this.tn3270eRtDataRtMethod,
                            this.tn3270eRtDataDiscontinuityTime
                        };
                    }
                    public static final class Tn3270eRtDataClientAddrTypeEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataClientAddrTypeEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataClientAddrType", "1.3.6.1.2.1.34.9.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataClientAddressEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataClientAddressEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataClientAddress", "1.3.6.1.2.1.34.9.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataClientPortEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataClientPortEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataClientPort", "1.3.6.1.2.1.34.9.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataAvgRtEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataAvgRtEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataAvgRt", "1.3.6.1.2.1.34.9.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataAvgIpRtEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataAvgIpRtEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataAvgIpRt", "1.3.6.1.2.1.34.9.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataAvgCountTransEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataAvgCountTransEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataAvgCountTrans", "1.3.6.1.2.1.34.9.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataIntTimeStampEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataIntTimeStampEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataIntTimeStamp", "1.3.6.1.2.1.34.9.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataTotalRtsEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataTotalRtsEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataTotalRts", "1.3.6.1.2.1.34.9.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataTotalIpRtsEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataTotalIpRtsEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataTotalIpRts", "1.3.6.1.2.1.34.9.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataCountTransEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataCountTransEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataCountTrans", "1.3.6.1.2.1.34.9.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataCountDrsEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataCountDrsEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataCountDrs", "1.3.6.1.2.1.34.9.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataElapsRndTrpSqEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataElapsRndTrpSqEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataElapsRndTrpSq", "1.3.6.1.2.1.34.9.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataElapsIpRtSqEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataElapsIpRtSqEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataElapsIpRtSq", "1.3.6.1.2.1.34.9.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataBucket1RtsEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataBucket1RtsEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataBucket1Rts", "1.3.6.1.2.1.34.9.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataBucket2RtsEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataBucket2RtsEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataBucket2Rts", "1.3.6.1.2.1.34.9.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataBucket3RtsEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataBucket3RtsEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataBucket3Rts", "1.3.6.1.2.1.34.9.1.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataBucket4RtsEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataBucket4RtsEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataBucket4Rts", "1.3.6.1.2.1.34.9.1.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataBucket5RtsEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataBucket5RtsEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataBucket5Rts", "1.3.6.1.2.1.34.9.1.2.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataRtMethodEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataRtMethodEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataRtMethod", "1.3.6.1.2.1.34.9.1.2.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eRtDataDiscontinuityTimeEnt extends MIBEntry<TN3270ERTMIBDef>
                    {
                        private Tn3270eRtDataDiscontinuityTimeEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eRtDataDiscontinuityTime", "1.3.6.1.2.1.34.9.1.2.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Tn3270eRtSpinLockEnt extends MIBEntry<TN3270ERTMIBDef>
            {
                private Tn3270eRtSpinLockEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                {
                    super(mib, parent, "tn3270eRtSpinLock", "1.3.6.1.2.1.34.9.1.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Tn3270eRtConformanceEnt extends MIBEntry<TN3270ERTMIBDef>
        {
            /** Conformance Statement*/
            public final Tn3270eRtGroupsEnt tn3270eRtGroups;

            public final Tn3270eRtCompliancesEnt tn3270eRtCompliances;

            private Tn3270eRtConformanceEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
            {
                super(mib, parent, "tn3270eRtConformance", "1.3.6.1.2.1.34.9.3", false, false, false, false);
                this.tn3270eRtGroups = new Tn3270eRtGroupsEnt(mib, this);
                this.tn3270eRtCompliances = new Tn3270eRtCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tn3270eRtGroups,
                    this.tn3270eRtCompliances
                };
            }
            public static final class Tn3270eRtGroupsEnt extends MIBEntry<TN3270ERTMIBDef>
            {
                /** Group definitions*/
                public final Tn3270eRtGroupEnt tn3270eRtGroup;

                public final Tn3270eRtNotGroupEnt tn3270eRtNotGroup;

                private Tn3270eRtGroupsEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                {
                    super(mib, parent, "tn3270eRtGroups", "1.3.6.1.2.1.34.9.3.1", false, false, false, false);
                    this.tn3270eRtGroup = new Tn3270eRtGroupEnt(mib, this);
                    this.tn3270eRtNotGroup = new Tn3270eRtNotGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tn3270eRtGroup,
                        this.tn3270eRtNotGroup
                    };
                }
                public static final class Tn3270eRtGroupEnt extends MIBEntry<TN3270ERTMIBDef>
                {
                    private Tn3270eRtGroupEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eRtGroup", "1.3.6.1.2.1.34.9.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Tn3270eRtNotGroupEnt extends MIBEntry<TN3270ERTMIBDef>
                {
                    private Tn3270eRtNotGroupEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eRtNotGroup", "1.3.6.1.2.1.34.9.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Tn3270eRtCompliancesEnt extends MIBEntry<TN3270ERTMIBDef>
            {
                /** Compliance statements*/
                public final Tn3270eRtComplianceEnt tn3270eRtCompliance;

                private Tn3270eRtCompliancesEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                {
                    super(mib, parent, "tn3270eRtCompliances", "1.3.6.1.2.1.34.9.3.2", false, false, false, false);
                    this.tn3270eRtCompliance = new Tn3270eRtComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tn3270eRtCompliance
                    };
                }
                public static final class Tn3270eRtComplianceEnt extends MIBEntry<TN3270ERTMIBDef>
                {
                    private Tn3270eRtComplianceEnt(TN3270ERTMIBDef mib, MIBEntry<TN3270ERTMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eRtCompliance", "1.3.6.1.2.1.34.9.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
