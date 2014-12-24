package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2856]
[RFC2579]
[RFC3705]
[RFC2580]
[RFC2863]*/
public final class VDSLLINEMIBDef extends MIB
{
    public static final VDSLLINEMIBDef VDSLLINEMIB = new VDSLLINEMIBDef();

    /** [RFC3411]

February 19, 2004*/
    public final VdslMIBEnt vdslMIB;

    private VDSLLINEMIBDef()
    {
        super("VDSL-LINE-MIB");
        this.vdslMIB = new VdslMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.vdslMIB
        };
    }

    public static final class VdslMIBEnt extends MIBEntry<VDSLLINEMIBDef>
    {
        public final VdslLineMibEnt vdslLineMib;

        private VdslMIBEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
        {
            super(mib, parent, "vdslMIB", "1.3.6.1.2.1.10.97", false, false, false, false);
            this.vdslLineMib = new VdslLineMibEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.vdslLineMib
            };
        }
        public static final class VdslLineMibEnt extends MIBEntry<VDSLLINEMIBDef>
        {
            public final VdslMibObjectsEnt vdslMibObjects;

            /** Notification definitions*/
            public final VdslNotificationsEnt vdslNotifications;

            /** conformance information*/
            public final VdslConformanceEnt vdslConformance;

            private VdslLineMibEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
            {
                super(mib, parent, "vdslLineMib", "1.3.6.1.2.1.10.97.1", false, false, false, false);
                this.vdslMibObjects = new VdslMibObjectsEnt(mib, this);
                this.vdslNotifications = new VdslNotificationsEnt(mib, this);
                this.vdslConformance = new VdslConformanceEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.vdslMibObjects,
                    this.vdslNotifications,
                    this.vdslConformance
                };
            }
            public static final class VdslMibObjectsEnt extends MIBEntry<VDSLLINEMIBDef>
            {
                /** objects*/
                public final VdslLineTableEnt vdslLineTable;

                public final VdslPhysTableEnt vdslPhysTable;

                public final VdslChanTableEnt vdslChanTable;

                public final VdslPerfDataTableEnt vdslPerfDataTable;

                public final VdslPerfIntervalTableEnt vdslPerfIntervalTable;

                public final VdslPerf1DayIntervalTableEnt vdslPerf1DayIntervalTable;

                public final VdslChanPerfDataTableEnt vdslChanPerfDataTable;

                public final VdslChanIntervalTableEnt vdslChanIntervalTable;

                public final VdslChan1DayIntervalTableEnt vdslChan1DayIntervalTable;

                /** profile tables*/
                public final VdslLineConfProfileTableEnt vdslLineConfProfileTable;

                /** Alarm configuration profile table*/
                public final VdslLineAlarmConfProfileTableEnt vdslLineAlarmConfProfileTable;

                private VdslMibObjectsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "vdslMibObjects", "1.3.6.1.2.1.10.97.1.1", false, false, false, false);
                    this.vdslLineTable = new VdslLineTableEnt(mib, this);
                    this.vdslPhysTable = new VdslPhysTableEnt(mib, this);
                    this.vdslChanTable = new VdslChanTableEnt(mib, this);
                    this.vdslPerfDataTable = new VdslPerfDataTableEnt(mib, this);
                    this.vdslPerfIntervalTable = new VdslPerfIntervalTableEnt(mib, this);
                    this.vdslPerf1DayIntervalTable = new VdslPerf1DayIntervalTableEnt(mib, this);
                    this.vdslChanPerfDataTable = new VdslChanPerfDataTableEnt(mib, this);
                    this.vdslChanIntervalTable = new VdslChanIntervalTableEnt(mib, this);
                    this.vdslChan1DayIntervalTable = new VdslChan1DayIntervalTableEnt(mib, this);
                    this.vdslLineConfProfileTable = new VdslLineConfProfileTableEnt(mib, this);
                    this.vdslLineAlarmConfProfileTable = new VdslLineAlarmConfProfileTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vdslLineTable,
                        this.vdslPhysTable,
                        this.vdslChanTable,
                        this.vdslPerfDataTable,
                        this.vdslPerfIntervalTable,
                        this.vdslPerf1DayIntervalTable,
                        this.vdslChanPerfDataTable,
                        this.vdslChanIntervalTable,
                        this.vdslChan1DayIntervalTable,
                        this.vdslLineConfProfileTable,
                        this.vdslLineAlarmConfProfileTable
                    };
                }
                public static final class VdslLineTableEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    public final VdslLineEntryEnt vdslLineEntry;

                    private VdslLineTableEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslLineTable", "1.3.6.1.2.1.10.97.1.1.1", false, true, false, false);
                        this.vdslLineEntry = new VdslLineEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslLineEntry
                        };
                    }
                    public static final class VdslLineEntryEnt extends MIBEntry<VDSLLINEMIBDef>
                    {
                        public final VdslLineCodingEnt vdslLineCoding;

                        public final VdslLineTypeEnt vdslLineType;

                        public final VdslLineConfProfileEnt vdslLineConfProfile;

                        public final VdslLineAlarmConfProfileEnt vdslLineAlarmConfProfile;

                        private VdslLineEntryEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "vdslLineEntry", "1.3.6.1.2.1.10.97.1.1.1.1", false, false, false, true);
                            this.vdslLineCoding = new VdslLineCodingEnt(mib, this);
                            this.vdslLineType = new VdslLineTypeEnt(mib, this);
                            this.vdslLineConfProfile = new VdslLineConfProfileEnt(mib, this);
                            this.vdslLineAlarmConfProfile = new VdslLineAlarmConfProfileEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslLineCoding,
                                this.vdslLineType,
                                this.vdslLineConfProfile,
                                this.vdslLineAlarmConfProfile
                            };
                        }
                        public static final class VdslLineCodingEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineCodingEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineCoding", "1.3.6.1.2.1.10.97.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineTypeEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineTypeEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineType", "1.3.6.1.2.1.10.97.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfProfileEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfProfileEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfProfile", "1.3.6.1.2.1.10.97.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineAlarmConfProfileEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineAlarmConfProfileEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineAlarmConfProfile", "1.3.6.1.2.1.10.97.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class VdslPhysTableEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    public final VdslPhysEntryEnt vdslPhysEntry;

                    private VdslPhysTableEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslPhysTable", "1.3.6.1.2.1.10.97.1.1.2", false, true, false, false);
                        this.vdslPhysEntry = new VdslPhysEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslPhysEntry
                        };
                    }
                    public static final class VdslPhysEntryEnt extends MIBEntry<VDSLLINEMIBDef>
                    {
                        public final VdslPhysSideEnt vdslPhysSide;

                        public final VdslPhysInvSerialNumberEnt vdslPhysInvSerialNumber;

                        public final VdslPhysInvVendorIDEnt vdslPhysInvVendorID;

                        public final VdslPhysInvVersionNumberEnt vdslPhysInvVersionNumber;

                        public final VdslPhysCurrSnrMgnEnt vdslPhysCurrSnrMgn;

                        public final VdslPhysCurrAtnEnt vdslPhysCurrAtn;

                        public final VdslPhysCurrStatusEnt vdslPhysCurrStatus;

                        public final VdslPhysCurrOutputPwrEnt vdslPhysCurrOutputPwr;

                        public final VdslPhysCurrAttainableRateEnt vdslPhysCurrAttainableRate;

                        public final VdslPhysCurrLineRateEnt vdslPhysCurrLineRate;

                        private VdslPhysEntryEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "vdslPhysEntry", "1.3.6.1.2.1.10.97.1.1.2.1", false, false, false, true);
                            this.vdslPhysSide = new VdslPhysSideEnt(mib, this);
                            this.vdslPhysInvSerialNumber = new VdslPhysInvSerialNumberEnt(mib, this);
                            this.vdslPhysInvVendorID = new VdslPhysInvVendorIDEnt(mib, this);
                            this.vdslPhysInvVersionNumber = new VdslPhysInvVersionNumberEnt(mib, this);
                            this.vdslPhysCurrSnrMgn = new VdslPhysCurrSnrMgnEnt(mib, this);
                            this.vdslPhysCurrAtn = new VdslPhysCurrAtnEnt(mib, this);
                            this.vdslPhysCurrStatus = new VdslPhysCurrStatusEnt(mib, this);
                            this.vdslPhysCurrOutputPwr = new VdslPhysCurrOutputPwrEnt(mib, this);
                            this.vdslPhysCurrAttainableRate = new VdslPhysCurrAttainableRateEnt(mib, this);
                            this.vdslPhysCurrLineRate = new VdslPhysCurrLineRateEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslPhysSide,
                                this.vdslPhysInvSerialNumber,
                                this.vdslPhysInvVendorID,
                                this.vdslPhysInvVersionNumber,
                                this.vdslPhysCurrSnrMgn,
                                this.vdslPhysCurrAtn,
                                this.vdslPhysCurrStatus,
                                this.vdslPhysCurrOutputPwr,
                                this.vdslPhysCurrAttainableRate,
                                this.vdslPhysCurrLineRate
                            };
                        }
                        public static final class VdslPhysSideEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPhysSideEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPhysSide", "1.3.6.1.2.1.10.97.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPhysInvSerialNumberEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPhysInvSerialNumberEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPhysInvSerialNumber", "1.3.6.1.2.1.10.97.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPhysInvVendorIDEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPhysInvVendorIDEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPhysInvVendorID", "1.3.6.1.2.1.10.97.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPhysInvVersionNumberEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPhysInvVersionNumberEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPhysInvVersionNumber", "1.3.6.1.2.1.10.97.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPhysCurrSnrMgnEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPhysCurrSnrMgnEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPhysCurrSnrMgn", "1.3.6.1.2.1.10.97.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPhysCurrAtnEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPhysCurrAtnEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPhysCurrAtn", "1.3.6.1.2.1.10.97.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPhysCurrStatusEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPhysCurrStatusEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPhysCurrStatus", "1.3.6.1.2.1.10.97.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPhysCurrOutputPwrEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPhysCurrOutputPwrEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPhysCurrOutputPwr", "1.3.6.1.2.1.10.97.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPhysCurrAttainableRateEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPhysCurrAttainableRateEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPhysCurrAttainableRate", "1.3.6.1.2.1.10.97.1.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPhysCurrLineRateEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPhysCurrLineRateEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPhysCurrLineRate", "1.3.6.1.2.1.10.97.1.1.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class VdslChanTableEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    public final VdslChanEntryEnt vdslChanEntry;

                    private VdslChanTableEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslChanTable", "1.3.6.1.2.1.10.97.1.1.3", false, true, false, false);
                        this.vdslChanEntry = new VdslChanEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslChanEntry
                        };
                    }
                    public static final class VdslChanEntryEnt extends MIBEntry<VDSLLINEMIBDef>
                    {
                        public final VdslChanInterleaveDelayEnt vdslChanInterleaveDelay;

                        public final VdslChanCrcBlockLengthEnt vdslChanCrcBlockLength;

                        public final VdslChanCurrTxRateEnt vdslChanCurrTxRate;

                        public final VdslChanCurrTxSlowBurstProtectEnt vdslChanCurrTxSlowBurstProtect;

                        public final VdslChanCurrTxFastFecEnt vdslChanCurrTxFastFec;

                        private VdslChanEntryEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "vdslChanEntry", "1.3.6.1.2.1.10.97.1.1.3.1", false, false, false, true);
                            this.vdslChanInterleaveDelay = new VdslChanInterleaveDelayEnt(mib, this);
                            this.vdslChanCrcBlockLength = new VdslChanCrcBlockLengthEnt(mib, this);
                            this.vdslChanCurrTxRate = new VdslChanCurrTxRateEnt(mib, this);
                            this.vdslChanCurrTxSlowBurstProtect = new VdslChanCurrTxSlowBurstProtectEnt(mib, this);
                            this.vdslChanCurrTxFastFec = new VdslChanCurrTxFastFecEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslChanInterleaveDelay,
                                this.vdslChanCrcBlockLength,
                                this.vdslChanCurrTxRate,
                                this.vdslChanCurrTxSlowBurstProtect,
                                this.vdslChanCurrTxFastFec
                            };
                        }
                        public static final class VdslChanInterleaveDelayEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanInterleaveDelayEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanInterleaveDelay", "1.3.6.1.2.1.10.97.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChanCrcBlockLengthEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanCrcBlockLengthEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanCrcBlockLength", "1.3.6.1.2.1.10.97.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChanCurrTxRateEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanCurrTxRateEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanCurrTxRate", "1.3.6.1.2.1.10.97.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChanCurrTxSlowBurstProtectEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanCurrTxSlowBurstProtectEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanCurrTxSlowBurstProtect", "1.3.6.1.2.1.10.97.1.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChanCurrTxFastFecEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanCurrTxFastFecEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanCurrTxFastFec", "1.3.6.1.2.1.10.97.1.1.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class VdslPerfDataTableEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    public final VdslPerfDataEntryEnt vdslPerfDataEntry;

                    private VdslPerfDataTableEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslPerfDataTable", "1.3.6.1.2.1.10.97.1.1.4", false, true, false, false);
                        this.vdslPerfDataEntry = new VdslPerfDataEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslPerfDataEntry
                        };
                    }
                    public static final class VdslPerfDataEntryEnt extends MIBEntry<VDSLLINEMIBDef>
                    {
                        public final VdslPerfDataValidIntervalsEnt vdslPerfDataValidIntervals;

                        public final VdslPerfDataInvalidIntervalsEnt vdslPerfDataInvalidIntervals;

                        public final VdslPerfDataLofsEnt vdslPerfDataLofs;

                        public final VdslPerfDataLossEnt vdslPerfDataLoss;

                        public final VdslPerfDataLprsEnt vdslPerfDataLprs;

                        public final VdslPerfDataLolsEnt vdslPerfDataLols;

                        public final VdslPerfDataESsEnt vdslPerfDataESs;

                        public final VdslPerfDataSESsEnt vdslPerfDataSESs;

                        public final VdslPerfDataUASsEnt vdslPerfDataUASs;

                        public final VdslPerfDataInitsEnt vdslPerfDataInits;

                        public final VdslPerfDataCurr15MinTimeElapsedEnt vdslPerfDataCurr15MinTimeElapsed;

                        public final VdslPerfDataCurr15MinLofsEnt vdslPerfDataCurr15MinLofs;

                        public final VdslPerfDataCurr15MinLossEnt vdslPerfDataCurr15MinLoss;

                        public final VdslPerfDataCurr15MinLprsEnt vdslPerfDataCurr15MinLprs;

                        public final VdslPerfDataCurr15MinLolsEnt vdslPerfDataCurr15MinLols;

                        public final VdslPerfDataCurr15MinESsEnt vdslPerfDataCurr15MinESs;

                        public final VdslPerfDataCurr15MinSESsEnt vdslPerfDataCurr15MinSESs;

                        public final VdslPerfDataCurr15MinUASsEnt vdslPerfDataCurr15MinUASs;

                        public final VdslPerfDataCurr15MinInitsEnt vdslPerfDataCurr15MinInits;

                        public final VdslPerfData1DayValidIntervalsEnt vdslPerfData1DayValidIntervals;

                        public final VdslPerfData1DayInvalidIntervalsEnt vdslPerfData1DayInvalidIntervals;

                        public final VdslPerfDataCurr1DayTimeElapsedEnt vdslPerfDataCurr1DayTimeElapsed;

                        public final VdslPerfDataCurr1DayLofsEnt vdslPerfDataCurr1DayLofs;

                        public final VdslPerfDataCurr1DayLossEnt vdslPerfDataCurr1DayLoss;

                        public final VdslPerfDataCurr1DayLprsEnt vdslPerfDataCurr1DayLprs;

                        public final VdslPerfDataCurr1DayLolsEnt vdslPerfDataCurr1DayLols;

                        public final VdslPerfDataCurr1DayESsEnt vdslPerfDataCurr1DayESs;

                        public final VdslPerfDataCurr1DaySESsEnt vdslPerfDataCurr1DaySESs;

                        public final VdslPerfDataCurr1DayUASsEnt vdslPerfDataCurr1DayUASs;

                        public final VdslPerfDataCurr1DayInitsEnt vdslPerfDataCurr1DayInits;

                        private VdslPerfDataEntryEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "vdslPerfDataEntry", "1.3.6.1.2.1.10.97.1.1.4.1", false, false, false, true);
                            this.vdslPerfDataValidIntervals = new VdslPerfDataValidIntervalsEnt(mib, this);
                            this.vdslPerfDataInvalidIntervals = new VdslPerfDataInvalidIntervalsEnt(mib, this);
                            this.vdslPerfDataLofs = new VdslPerfDataLofsEnt(mib, this);
                            this.vdslPerfDataLoss = new VdslPerfDataLossEnt(mib, this);
                            this.vdslPerfDataLprs = new VdslPerfDataLprsEnt(mib, this);
                            this.vdslPerfDataLols = new VdslPerfDataLolsEnt(mib, this);
                            this.vdslPerfDataESs = new VdslPerfDataESsEnt(mib, this);
                            this.vdslPerfDataSESs = new VdslPerfDataSESsEnt(mib, this);
                            this.vdslPerfDataUASs = new VdslPerfDataUASsEnt(mib, this);
                            this.vdslPerfDataInits = new VdslPerfDataInitsEnt(mib, this);
                            this.vdslPerfDataCurr15MinTimeElapsed = new VdslPerfDataCurr15MinTimeElapsedEnt(mib, this);
                            this.vdslPerfDataCurr15MinLofs = new VdslPerfDataCurr15MinLofsEnt(mib, this);
                            this.vdslPerfDataCurr15MinLoss = new VdslPerfDataCurr15MinLossEnt(mib, this);
                            this.vdslPerfDataCurr15MinLprs = new VdslPerfDataCurr15MinLprsEnt(mib, this);
                            this.vdslPerfDataCurr15MinLols = new VdslPerfDataCurr15MinLolsEnt(mib, this);
                            this.vdslPerfDataCurr15MinESs = new VdslPerfDataCurr15MinESsEnt(mib, this);
                            this.vdslPerfDataCurr15MinSESs = new VdslPerfDataCurr15MinSESsEnt(mib, this);
                            this.vdslPerfDataCurr15MinUASs = new VdslPerfDataCurr15MinUASsEnt(mib, this);
                            this.vdslPerfDataCurr15MinInits = new VdslPerfDataCurr15MinInitsEnt(mib, this);
                            this.vdslPerfData1DayValidIntervals = new VdslPerfData1DayValidIntervalsEnt(mib, this);
                            this.vdslPerfData1DayInvalidIntervals = new VdslPerfData1DayInvalidIntervalsEnt(mib, this);
                            this.vdslPerfDataCurr1DayTimeElapsed = new VdslPerfDataCurr1DayTimeElapsedEnt(mib, this);
                            this.vdslPerfDataCurr1DayLofs = new VdslPerfDataCurr1DayLofsEnt(mib, this);
                            this.vdslPerfDataCurr1DayLoss = new VdslPerfDataCurr1DayLossEnt(mib, this);
                            this.vdslPerfDataCurr1DayLprs = new VdslPerfDataCurr1DayLprsEnt(mib, this);
                            this.vdslPerfDataCurr1DayLols = new VdslPerfDataCurr1DayLolsEnt(mib, this);
                            this.vdslPerfDataCurr1DayESs = new VdslPerfDataCurr1DayESsEnt(mib, this);
                            this.vdslPerfDataCurr1DaySESs = new VdslPerfDataCurr1DaySESsEnt(mib, this);
                            this.vdslPerfDataCurr1DayUASs = new VdslPerfDataCurr1DayUASsEnt(mib, this);
                            this.vdslPerfDataCurr1DayInits = new VdslPerfDataCurr1DayInitsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslPerfDataValidIntervals,
                                this.vdslPerfDataInvalidIntervals,
                                this.vdslPerfDataLofs,
                                this.vdslPerfDataLoss,
                                this.vdslPerfDataLprs,
                                this.vdslPerfDataLols,
                                this.vdslPerfDataESs,
                                this.vdslPerfDataSESs,
                                this.vdslPerfDataUASs,
                                this.vdslPerfDataInits,
                                this.vdslPerfDataCurr15MinTimeElapsed,
                                this.vdslPerfDataCurr15MinLofs,
                                this.vdslPerfDataCurr15MinLoss,
                                this.vdslPerfDataCurr15MinLprs,
                                this.vdslPerfDataCurr15MinLols,
                                this.vdslPerfDataCurr15MinESs,
                                this.vdslPerfDataCurr15MinSESs,
                                this.vdslPerfDataCurr15MinUASs,
                                this.vdslPerfDataCurr15MinInits,
                                this.vdslPerfData1DayValidIntervals,
                                this.vdslPerfData1DayInvalidIntervals,
                                this.vdslPerfDataCurr1DayTimeElapsed,
                                this.vdslPerfDataCurr1DayLofs,
                                this.vdslPerfDataCurr1DayLoss,
                                this.vdslPerfDataCurr1DayLprs,
                                this.vdslPerfDataCurr1DayLols,
                                this.vdslPerfDataCurr1DayESs,
                                this.vdslPerfDataCurr1DaySESs,
                                this.vdslPerfDataCurr1DayUASs,
                                this.vdslPerfDataCurr1DayInits
                            };
                        }
                        public static final class VdslPerfDataValidIntervalsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataValidIntervalsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataValidIntervals", "1.3.6.1.2.1.10.97.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataInvalidIntervalsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataInvalidIntervalsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataInvalidIntervals", "1.3.6.1.2.1.10.97.1.1.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataLofsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataLofsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataLofs", "1.3.6.1.2.1.10.97.1.1.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataLossEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataLossEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataLoss", "1.3.6.1.2.1.10.97.1.1.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataLprsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataLprsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataLprs", "1.3.6.1.2.1.10.97.1.1.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataLolsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataLolsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataLols", "1.3.6.1.2.1.10.97.1.1.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataESsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataESsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataESs", "1.3.6.1.2.1.10.97.1.1.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataSESsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataSESsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataSESs", "1.3.6.1.2.1.10.97.1.1.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataUASsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataUASsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataUASs", "1.3.6.1.2.1.10.97.1.1.4.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataInitsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataInitsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataInits", "1.3.6.1.2.1.10.97.1.1.4.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr15MinTimeElapsedEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr15MinTimeElapsedEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr15MinTimeElapsed", "1.3.6.1.2.1.10.97.1.1.4.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr15MinLofsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr15MinLofsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr15MinLofs", "1.3.6.1.2.1.10.97.1.1.4.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr15MinLossEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr15MinLossEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr15MinLoss", "1.3.6.1.2.1.10.97.1.1.4.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr15MinLprsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr15MinLprsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr15MinLprs", "1.3.6.1.2.1.10.97.1.1.4.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr15MinLolsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr15MinLolsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr15MinLols", "1.3.6.1.2.1.10.97.1.1.4.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr15MinESsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr15MinESsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr15MinESs", "1.3.6.1.2.1.10.97.1.1.4.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr15MinSESsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr15MinSESsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr15MinSESs", "1.3.6.1.2.1.10.97.1.1.4.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr15MinUASsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr15MinUASsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr15MinUASs", "1.3.6.1.2.1.10.97.1.1.4.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr15MinInitsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr15MinInitsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr15MinInits", "1.3.6.1.2.1.10.97.1.1.4.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfData1DayValidIntervalsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfData1DayValidIntervalsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfData1DayValidIntervals", "1.3.6.1.2.1.10.97.1.1.4.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfData1DayInvalidIntervalsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfData1DayInvalidIntervalsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfData1DayInvalidIntervals", "1.3.6.1.2.1.10.97.1.1.4.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr1DayTimeElapsedEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr1DayTimeElapsedEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr1DayTimeElapsed", "1.3.6.1.2.1.10.97.1.1.4.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr1DayLofsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr1DayLofsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr1DayLofs", "1.3.6.1.2.1.10.97.1.1.4.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr1DayLossEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr1DayLossEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr1DayLoss", "1.3.6.1.2.1.10.97.1.1.4.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr1DayLprsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr1DayLprsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr1DayLprs", "1.3.6.1.2.1.10.97.1.1.4.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr1DayLolsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr1DayLolsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr1DayLols", "1.3.6.1.2.1.10.97.1.1.4.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr1DayESsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr1DayESsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr1DayESs", "1.3.6.1.2.1.10.97.1.1.4.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr1DaySESsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr1DaySESsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr1DaySESs", "1.3.6.1.2.1.10.97.1.1.4.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr1DayUASsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr1DayUASsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr1DayUASs", "1.3.6.1.2.1.10.97.1.1.4.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfDataCurr1DayInitsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfDataCurr1DayInitsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfDataCurr1DayInits", "1.3.6.1.2.1.10.97.1.1.4.1.30", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class VdslPerfIntervalTableEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    public final VdslPerfIntervalEntryEnt vdslPerfIntervalEntry;

                    private VdslPerfIntervalTableEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslPerfIntervalTable", "1.3.6.1.2.1.10.97.1.1.5", false, true, false, false);
                        this.vdslPerfIntervalEntry = new VdslPerfIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslPerfIntervalEntry
                        };
                    }
                    public static final class VdslPerfIntervalEntryEnt extends MIBEntry<VDSLLINEMIBDef>
                    {
                        public final VdslPerfIntervalNumberEnt vdslPerfIntervalNumber;

                        public final VdslPerfIntervalLofsEnt vdslPerfIntervalLofs;

                        public final VdslPerfIntervalLossEnt vdslPerfIntervalLoss;

                        public final VdslPerfIntervalLprsEnt vdslPerfIntervalLprs;

                        public final VdslPerfIntervalLolsEnt vdslPerfIntervalLols;

                        public final VdslPerfIntervalESsEnt vdslPerfIntervalESs;

                        public final VdslPerfIntervalSESsEnt vdslPerfIntervalSESs;

                        public final VdslPerfIntervalUASsEnt vdslPerfIntervalUASs;

                        public final VdslPerfIntervalInitsEnt vdslPerfIntervalInits;

                        private VdslPerfIntervalEntryEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "vdslPerfIntervalEntry", "1.3.6.1.2.1.10.97.1.1.5.1", false, false, false, true);
                            this.vdslPerfIntervalNumber = new VdslPerfIntervalNumberEnt(mib, this);
                            this.vdslPerfIntervalLofs = new VdslPerfIntervalLofsEnt(mib, this);
                            this.vdslPerfIntervalLoss = new VdslPerfIntervalLossEnt(mib, this);
                            this.vdslPerfIntervalLprs = new VdslPerfIntervalLprsEnt(mib, this);
                            this.vdslPerfIntervalLols = new VdslPerfIntervalLolsEnt(mib, this);
                            this.vdslPerfIntervalESs = new VdslPerfIntervalESsEnt(mib, this);
                            this.vdslPerfIntervalSESs = new VdslPerfIntervalSESsEnt(mib, this);
                            this.vdslPerfIntervalUASs = new VdslPerfIntervalUASsEnt(mib, this);
                            this.vdslPerfIntervalInits = new VdslPerfIntervalInitsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslPerfIntervalNumber,
                                this.vdslPerfIntervalLofs,
                                this.vdslPerfIntervalLoss,
                                this.vdslPerfIntervalLprs,
                                this.vdslPerfIntervalLols,
                                this.vdslPerfIntervalESs,
                                this.vdslPerfIntervalSESs,
                                this.vdslPerfIntervalUASs,
                                this.vdslPerfIntervalInits
                            };
                        }
                        public static final class VdslPerfIntervalNumberEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfIntervalNumberEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfIntervalNumber", "1.3.6.1.2.1.10.97.1.1.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfIntervalLofsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfIntervalLofsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfIntervalLofs", "1.3.6.1.2.1.10.97.1.1.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfIntervalLossEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfIntervalLossEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfIntervalLoss", "1.3.6.1.2.1.10.97.1.1.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfIntervalLprsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfIntervalLprsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfIntervalLprs", "1.3.6.1.2.1.10.97.1.1.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfIntervalLolsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfIntervalLolsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfIntervalLols", "1.3.6.1.2.1.10.97.1.1.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfIntervalESsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfIntervalESsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfIntervalESs", "1.3.6.1.2.1.10.97.1.1.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfIntervalSESsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfIntervalSESsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfIntervalSESs", "1.3.6.1.2.1.10.97.1.1.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfIntervalUASsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfIntervalUASsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfIntervalUASs", "1.3.6.1.2.1.10.97.1.1.5.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerfIntervalInitsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerfIntervalInitsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerfIntervalInits", "1.3.6.1.2.1.10.97.1.1.5.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class VdslPerf1DayIntervalTableEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    public final VdslPerf1DayIntervalEntryEnt vdslPerf1DayIntervalEntry;

                    private VdslPerf1DayIntervalTableEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslPerf1DayIntervalTable", "1.3.6.1.2.1.10.97.1.1.6", false, true, false, false);
                        this.vdslPerf1DayIntervalEntry = new VdslPerf1DayIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslPerf1DayIntervalEntry
                        };
                    }
                    public static final class VdslPerf1DayIntervalEntryEnt extends MIBEntry<VDSLLINEMIBDef>
                    {
                        public final VdslPerf1DayIntervalNumberEnt vdslPerf1DayIntervalNumber;

                        public final VdslPerf1DayIntervalMoniSecsEnt vdslPerf1DayIntervalMoniSecs;

                        public final VdslPerf1DayIntervalLofsEnt vdslPerf1DayIntervalLofs;

                        public final VdslPerf1DayIntervalLossEnt vdslPerf1DayIntervalLoss;

                        public final VdslPerf1DayIntervalLprsEnt vdslPerf1DayIntervalLprs;

                        public final VdslPerf1DayIntervalLolsEnt vdslPerf1DayIntervalLols;

                        public final VdslPerf1DayIntervalESsEnt vdslPerf1DayIntervalESs;

                        public final VdslPerf1DayIntervalSESsEnt vdslPerf1DayIntervalSESs;

                        public final VdslPerf1DayIntervalUASsEnt vdslPerf1DayIntervalUASs;

                        public final VdslPerf1DayIntervalInitsEnt vdslPerf1DayIntervalInits;

                        private VdslPerf1DayIntervalEntryEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "vdslPerf1DayIntervalEntry", "1.3.6.1.2.1.10.97.1.1.6.1", false, false, false, true);
                            this.vdslPerf1DayIntervalNumber = new VdslPerf1DayIntervalNumberEnt(mib, this);
                            this.vdslPerf1DayIntervalMoniSecs = new VdslPerf1DayIntervalMoniSecsEnt(mib, this);
                            this.vdslPerf1DayIntervalLofs = new VdslPerf1DayIntervalLofsEnt(mib, this);
                            this.vdslPerf1DayIntervalLoss = new VdslPerf1DayIntervalLossEnt(mib, this);
                            this.vdslPerf1DayIntervalLprs = new VdslPerf1DayIntervalLprsEnt(mib, this);
                            this.vdslPerf1DayIntervalLols = new VdslPerf1DayIntervalLolsEnt(mib, this);
                            this.vdslPerf1DayIntervalESs = new VdslPerf1DayIntervalESsEnt(mib, this);
                            this.vdslPerf1DayIntervalSESs = new VdslPerf1DayIntervalSESsEnt(mib, this);
                            this.vdslPerf1DayIntervalUASs = new VdslPerf1DayIntervalUASsEnt(mib, this);
                            this.vdslPerf1DayIntervalInits = new VdslPerf1DayIntervalInitsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslPerf1DayIntervalNumber,
                                this.vdslPerf1DayIntervalMoniSecs,
                                this.vdslPerf1DayIntervalLofs,
                                this.vdslPerf1DayIntervalLoss,
                                this.vdslPerf1DayIntervalLprs,
                                this.vdslPerf1DayIntervalLols,
                                this.vdslPerf1DayIntervalESs,
                                this.vdslPerf1DayIntervalSESs,
                                this.vdslPerf1DayIntervalUASs,
                                this.vdslPerf1DayIntervalInits
                            };
                        }
                        public static final class VdslPerf1DayIntervalNumberEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerf1DayIntervalNumberEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerf1DayIntervalNumber", "1.3.6.1.2.1.10.97.1.1.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerf1DayIntervalMoniSecsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerf1DayIntervalMoniSecsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerf1DayIntervalMoniSecs", "1.3.6.1.2.1.10.97.1.1.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerf1DayIntervalLofsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerf1DayIntervalLofsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerf1DayIntervalLofs", "1.3.6.1.2.1.10.97.1.1.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerf1DayIntervalLossEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerf1DayIntervalLossEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerf1DayIntervalLoss", "1.3.6.1.2.1.10.97.1.1.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerf1DayIntervalLprsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerf1DayIntervalLprsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerf1DayIntervalLprs", "1.3.6.1.2.1.10.97.1.1.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerf1DayIntervalLolsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerf1DayIntervalLolsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerf1DayIntervalLols", "1.3.6.1.2.1.10.97.1.1.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerf1DayIntervalESsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerf1DayIntervalESsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerf1DayIntervalESs", "1.3.6.1.2.1.10.97.1.1.6.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerf1DayIntervalSESsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerf1DayIntervalSESsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerf1DayIntervalSESs", "1.3.6.1.2.1.10.97.1.1.6.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerf1DayIntervalUASsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerf1DayIntervalUASsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerf1DayIntervalUASs", "1.3.6.1.2.1.10.97.1.1.6.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslPerf1DayIntervalInitsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslPerf1DayIntervalInitsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslPerf1DayIntervalInits", "1.3.6.1.2.1.10.97.1.1.6.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class VdslChanPerfDataTableEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    public final VdslChanPerfDataEntryEnt vdslChanPerfDataEntry;

                    private VdslChanPerfDataTableEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslChanPerfDataTable", "1.3.6.1.2.1.10.97.1.1.7", false, true, false, false);
                        this.vdslChanPerfDataEntry = new VdslChanPerfDataEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslChanPerfDataEntry
                        };
                    }
                    public static final class VdslChanPerfDataEntryEnt extends MIBEntry<VDSLLINEMIBDef>
                    {
                        public final VdslChanValidIntervalsEnt vdslChanValidIntervals;

                        public final VdslChanInvalidIntervalsEnt vdslChanInvalidIntervals;

                        public final VdslChanFixedOctetsEnt vdslChanFixedOctets;

                        public final VdslChanBadBlksEnt vdslChanBadBlks;

                        public final VdslChanCurr15MinTimeElapsedEnt vdslChanCurr15MinTimeElapsed;

                        public final VdslChanCurr15MinFixedOctetsEnt vdslChanCurr15MinFixedOctets;

                        public final VdslChanCurr15MinBadBlksEnt vdslChanCurr15MinBadBlks;

                        public final VdslChan1DayValidIntervalsEnt vdslChan1DayValidIntervals;

                        public final VdslChan1DayInvalidIntervalsEnt vdslChan1DayInvalidIntervals;

                        public final VdslChanCurr1DayTimeElapsedEnt vdslChanCurr1DayTimeElapsed;

                        public final VdslChanCurr1DayFixedOctetsEnt vdslChanCurr1DayFixedOctets;

                        public final VdslChanCurr1DayBadBlksEnt vdslChanCurr1DayBadBlks;

                        private VdslChanPerfDataEntryEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "vdslChanPerfDataEntry", "1.3.6.1.2.1.10.97.1.1.7.1", false, false, false, true);
                            this.vdslChanValidIntervals = new VdslChanValidIntervalsEnt(mib, this);
                            this.vdslChanInvalidIntervals = new VdslChanInvalidIntervalsEnt(mib, this);
                            this.vdslChanFixedOctets = new VdslChanFixedOctetsEnt(mib, this);
                            this.vdslChanBadBlks = new VdslChanBadBlksEnt(mib, this);
                            this.vdslChanCurr15MinTimeElapsed = new VdslChanCurr15MinTimeElapsedEnt(mib, this);
                            this.vdslChanCurr15MinFixedOctets = new VdslChanCurr15MinFixedOctetsEnt(mib, this);
                            this.vdslChanCurr15MinBadBlks = new VdslChanCurr15MinBadBlksEnt(mib, this);
                            this.vdslChan1DayValidIntervals = new VdslChan1DayValidIntervalsEnt(mib, this);
                            this.vdslChan1DayInvalidIntervals = new VdslChan1DayInvalidIntervalsEnt(mib, this);
                            this.vdslChanCurr1DayTimeElapsed = new VdslChanCurr1DayTimeElapsedEnt(mib, this);
                            this.vdslChanCurr1DayFixedOctets = new VdslChanCurr1DayFixedOctetsEnt(mib, this);
                            this.vdslChanCurr1DayBadBlks = new VdslChanCurr1DayBadBlksEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslChanValidIntervals,
                                this.vdslChanInvalidIntervals,
                                this.vdslChanFixedOctets,
                                this.vdslChanBadBlks,
                                this.vdslChanCurr15MinTimeElapsed,
                                this.vdslChanCurr15MinFixedOctets,
                                this.vdslChanCurr15MinBadBlks,
                                this.vdslChan1DayValidIntervals,
                                this.vdslChan1DayInvalidIntervals,
                                this.vdslChanCurr1DayTimeElapsed,
                                this.vdslChanCurr1DayFixedOctets,
                                this.vdslChanCurr1DayBadBlks
                            };
                        }
                        public static final class VdslChanValidIntervalsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanValidIntervalsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanValidIntervals", "1.3.6.1.2.1.10.97.1.1.7.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChanInvalidIntervalsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanInvalidIntervalsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanInvalidIntervals", "1.3.6.1.2.1.10.97.1.1.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChanFixedOctetsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanFixedOctetsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanFixedOctets", "1.3.6.1.2.1.10.97.1.1.7.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChanBadBlksEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanBadBlksEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanBadBlks", "1.3.6.1.2.1.10.97.1.1.7.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChanCurr15MinTimeElapsedEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanCurr15MinTimeElapsedEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanCurr15MinTimeElapsed", "1.3.6.1.2.1.10.97.1.1.7.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChanCurr15MinFixedOctetsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanCurr15MinFixedOctetsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanCurr15MinFixedOctets", "1.3.6.1.2.1.10.97.1.1.7.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChanCurr15MinBadBlksEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanCurr15MinBadBlksEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanCurr15MinBadBlks", "1.3.6.1.2.1.10.97.1.1.7.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChan1DayValidIntervalsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChan1DayValidIntervalsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChan1DayValidIntervals", "1.3.6.1.2.1.10.97.1.1.7.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChan1DayInvalidIntervalsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChan1DayInvalidIntervalsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChan1DayInvalidIntervals", "1.3.6.1.2.1.10.97.1.1.7.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChanCurr1DayTimeElapsedEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanCurr1DayTimeElapsedEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanCurr1DayTimeElapsed", "1.3.6.1.2.1.10.97.1.1.7.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChanCurr1DayFixedOctetsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanCurr1DayFixedOctetsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanCurr1DayFixedOctets", "1.3.6.1.2.1.10.97.1.1.7.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChanCurr1DayBadBlksEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanCurr1DayBadBlksEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanCurr1DayBadBlks", "1.3.6.1.2.1.10.97.1.1.7.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class VdslChanIntervalTableEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    public final VdslChanIntervalEntryEnt vdslChanIntervalEntry;

                    private VdslChanIntervalTableEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslChanIntervalTable", "1.3.6.1.2.1.10.97.1.1.8", false, true, false, false);
                        this.vdslChanIntervalEntry = new VdslChanIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslChanIntervalEntry
                        };
                    }
                    public static final class VdslChanIntervalEntryEnt extends MIBEntry<VDSLLINEMIBDef>
                    {
                        public final VdslChanIntervalNumberEnt vdslChanIntervalNumber;

                        public final VdslChanIntervalFixedOctetsEnt vdslChanIntervalFixedOctets;

                        public final VdslChanIntervalBadBlksEnt vdslChanIntervalBadBlks;

                        private VdslChanIntervalEntryEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "vdslChanIntervalEntry", "1.3.6.1.2.1.10.97.1.1.8.1", false, false, false, true);
                            this.vdslChanIntervalNumber = new VdslChanIntervalNumberEnt(mib, this);
                            this.vdslChanIntervalFixedOctets = new VdslChanIntervalFixedOctetsEnt(mib, this);
                            this.vdslChanIntervalBadBlks = new VdslChanIntervalBadBlksEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslChanIntervalNumber,
                                this.vdslChanIntervalFixedOctets,
                                this.vdslChanIntervalBadBlks
                            };
                        }
                        public static final class VdslChanIntervalNumberEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanIntervalNumberEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanIntervalNumber", "1.3.6.1.2.1.10.97.1.1.8.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChanIntervalFixedOctetsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanIntervalFixedOctetsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanIntervalFixedOctets", "1.3.6.1.2.1.10.97.1.1.8.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChanIntervalBadBlksEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChanIntervalBadBlksEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChanIntervalBadBlks", "1.3.6.1.2.1.10.97.1.1.8.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class VdslChan1DayIntervalTableEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    public final VdslChan1DayIntervalEntryEnt vdslChan1DayIntervalEntry;

                    private VdslChan1DayIntervalTableEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslChan1DayIntervalTable", "1.3.6.1.2.1.10.97.1.1.9", false, true, false, false);
                        this.vdslChan1DayIntervalEntry = new VdslChan1DayIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslChan1DayIntervalEntry
                        };
                    }
                    public static final class VdslChan1DayIntervalEntryEnt extends MIBEntry<VDSLLINEMIBDef>
                    {
                        public final VdslChan1DayIntervalNumberEnt vdslChan1DayIntervalNumber;

                        public final VdslChan1DayIntervalMoniSecsEnt vdslChan1DayIntervalMoniSecs;

                        public final VdslChan1DayIntervalFixedOctetsEnt vdslChan1DayIntervalFixedOctets;

                        public final VdslChan1DayIntervalBadBlksEnt vdslChan1DayIntervalBadBlks;

                        private VdslChan1DayIntervalEntryEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "vdslChan1DayIntervalEntry", "1.3.6.1.2.1.10.97.1.1.9.1", false, false, false, true);
                            this.vdslChan1DayIntervalNumber = new VdslChan1DayIntervalNumberEnt(mib, this);
                            this.vdslChan1DayIntervalMoniSecs = new VdslChan1DayIntervalMoniSecsEnt(mib, this);
                            this.vdslChan1DayIntervalFixedOctets = new VdslChan1DayIntervalFixedOctetsEnt(mib, this);
                            this.vdslChan1DayIntervalBadBlks = new VdslChan1DayIntervalBadBlksEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslChan1DayIntervalNumber,
                                this.vdslChan1DayIntervalMoniSecs,
                                this.vdslChan1DayIntervalFixedOctets,
                                this.vdslChan1DayIntervalBadBlks
                            };
                        }
                        public static final class VdslChan1DayIntervalNumberEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChan1DayIntervalNumberEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChan1DayIntervalNumber", "1.3.6.1.2.1.10.97.1.1.9.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChan1DayIntervalMoniSecsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChan1DayIntervalMoniSecsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChan1DayIntervalMoniSecs", "1.3.6.1.2.1.10.97.1.1.9.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChan1DayIntervalFixedOctetsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChan1DayIntervalFixedOctetsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChan1DayIntervalFixedOctets", "1.3.6.1.2.1.10.97.1.1.9.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslChan1DayIntervalBadBlksEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslChan1DayIntervalBadBlksEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslChan1DayIntervalBadBlks", "1.3.6.1.2.1.10.97.1.1.9.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class VdslLineConfProfileTableEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    public final VdslLineConfProfileEntryEnt vdslLineConfProfileEntry;

                    private VdslLineConfProfileTableEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslLineConfProfileTable", "1.3.6.1.2.1.10.97.1.1.11", false, true, false, false);
                        this.vdslLineConfProfileEntry = new VdslLineConfProfileEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslLineConfProfileEntry
                        };
                    }
                    public static final class VdslLineConfProfileEntryEnt extends MIBEntry<VDSLLINEMIBDef>
                    {
                        public final VdslLineConfProfileNameEnt vdslLineConfProfileName;

                        public final VdslLineConfDownRateModeEnt vdslLineConfDownRateMode;

                        public final VdslLineConfUpRateModeEnt vdslLineConfUpRateMode;

                        public final VdslLineConfDownMaxPwrEnt vdslLineConfDownMaxPwr;

                        public final VdslLineConfUpMaxPwrEnt vdslLineConfUpMaxPwr;

                        public final VdslLineConfDownMaxSnrMgnEnt vdslLineConfDownMaxSnrMgn;

                        public final VdslLineConfDownMinSnrMgnEnt vdslLineConfDownMinSnrMgn;

                        public final VdslLineConfDownTargetSnrMgnEnt vdslLineConfDownTargetSnrMgn;

                        public final VdslLineConfUpMaxSnrMgnEnt vdslLineConfUpMaxSnrMgn;

                        public final VdslLineConfUpMinSnrMgnEnt vdslLineConfUpMinSnrMgn;

                        public final VdslLineConfUpTargetSnrMgnEnt vdslLineConfUpTargetSnrMgn;

                        public final VdslLineConfDownFastMaxDataRateEnt vdslLineConfDownFastMaxDataRate;

                        public final VdslLineConfDownFastMinDataRateEnt vdslLineConfDownFastMinDataRate;

                        public final VdslLineConfDownSlowMaxDataRateEnt vdslLineConfDownSlowMaxDataRate;

                        public final VdslLineConfDownSlowMinDataRateEnt vdslLineConfDownSlowMinDataRate;

                        public final VdslLineConfUpFastMaxDataRateEnt vdslLineConfUpFastMaxDataRate;

                        public final VdslLineConfUpFastMinDataRateEnt vdslLineConfUpFastMinDataRate;

                        public final VdslLineConfUpSlowMaxDataRateEnt vdslLineConfUpSlowMaxDataRate;

                        public final VdslLineConfUpSlowMinDataRateEnt vdslLineConfUpSlowMinDataRate;

                        public final VdslLineConfDownRateRatioEnt vdslLineConfDownRateRatio;

                        public final VdslLineConfUpRateRatioEnt vdslLineConfUpRateRatio;

                        public final VdslLineConfDownMaxInterDelayEnt vdslLineConfDownMaxInterDelay;

                        public final VdslLineConfUpMaxInterDelayEnt vdslLineConfUpMaxInterDelay;

                        public final VdslLineConfDownPboControlEnt vdslLineConfDownPboControl;

                        public final VdslLineConfUpPboControlEnt vdslLineConfUpPboControl;

                        public final VdslLineConfDownPboLevelEnt vdslLineConfDownPboLevel;

                        public final VdslLineConfUpPboLevelEnt vdslLineConfUpPboLevel;

                        public final VdslLineConfDeploymentScenarioEnt vdslLineConfDeploymentScenario;

                        public final VdslLineConfAdslPresenceEnt vdslLineConfAdslPresence;

                        public final VdslLineConfApplicableStandardEnt vdslLineConfApplicableStandard;

                        public final VdslLineConfBandPlanEnt vdslLineConfBandPlan;

                        public final VdslLineConfBandPlanFxEnt vdslLineConfBandPlanFx;

                        public final VdslLineConfBandOptUsageEnt vdslLineConfBandOptUsage;

                        public final VdslLineConfUpPsdTemplateEnt vdslLineConfUpPsdTemplate;

                        public final VdslLineConfDownPsdTemplateEnt vdslLineConfDownPsdTemplate;

                        public final VdslLineConfHamBandMaskEnt vdslLineConfHamBandMask;

                        public final VdslLineConfCustomNotch1StartEnt vdslLineConfCustomNotch1Start;

                        public final VdslLineConfCustomNotch1StopEnt vdslLineConfCustomNotch1Stop;

                        public final VdslLineConfCustomNotch2StartEnt vdslLineConfCustomNotch2Start;

                        public final VdslLineConfCustomNotch2StopEnt vdslLineConfCustomNotch2Stop;

                        public final VdslLineConfDownTargetSlowBurstEnt vdslLineConfDownTargetSlowBurst;

                        public final VdslLineConfUpTargetSlowBurstEnt vdslLineConfUpTargetSlowBurst;

                        public final VdslLineConfDownMaxFastFecEnt vdslLineConfDownMaxFastFec;

                        public final VdslLineConfUpMaxFastFecEnt vdslLineConfUpMaxFastFec;

                        public final VdslLineConfLineTypeEnt vdslLineConfLineType;

                        public final VdslLineConfProfRowStatusEnt vdslLineConfProfRowStatus;

                        private VdslLineConfProfileEntryEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "vdslLineConfProfileEntry", "1.3.6.1.2.1.10.97.1.1.11.1", false, false, false, true);
                            this.vdslLineConfProfileName = new VdslLineConfProfileNameEnt(mib, this);
                            this.vdslLineConfDownRateMode = new VdslLineConfDownRateModeEnt(mib, this);
                            this.vdslLineConfUpRateMode = new VdslLineConfUpRateModeEnt(mib, this);
                            this.vdslLineConfDownMaxPwr = new VdslLineConfDownMaxPwrEnt(mib, this);
                            this.vdslLineConfUpMaxPwr = new VdslLineConfUpMaxPwrEnt(mib, this);
                            this.vdslLineConfDownMaxSnrMgn = new VdslLineConfDownMaxSnrMgnEnt(mib, this);
                            this.vdslLineConfDownMinSnrMgn = new VdslLineConfDownMinSnrMgnEnt(mib, this);
                            this.vdslLineConfDownTargetSnrMgn = new VdslLineConfDownTargetSnrMgnEnt(mib, this);
                            this.vdslLineConfUpMaxSnrMgn = new VdslLineConfUpMaxSnrMgnEnt(mib, this);
                            this.vdslLineConfUpMinSnrMgn = new VdslLineConfUpMinSnrMgnEnt(mib, this);
                            this.vdslLineConfUpTargetSnrMgn = new VdslLineConfUpTargetSnrMgnEnt(mib, this);
                            this.vdslLineConfDownFastMaxDataRate = new VdslLineConfDownFastMaxDataRateEnt(mib, this);
                            this.vdslLineConfDownFastMinDataRate = new VdslLineConfDownFastMinDataRateEnt(mib, this);
                            this.vdslLineConfDownSlowMaxDataRate = new VdslLineConfDownSlowMaxDataRateEnt(mib, this);
                            this.vdslLineConfDownSlowMinDataRate = new VdslLineConfDownSlowMinDataRateEnt(mib, this);
                            this.vdslLineConfUpFastMaxDataRate = new VdslLineConfUpFastMaxDataRateEnt(mib, this);
                            this.vdslLineConfUpFastMinDataRate = new VdslLineConfUpFastMinDataRateEnt(mib, this);
                            this.vdslLineConfUpSlowMaxDataRate = new VdslLineConfUpSlowMaxDataRateEnt(mib, this);
                            this.vdslLineConfUpSlowMinDataRate = new VdslLineConfUpSlowMinDataRateEnt(mib, this);
                            this.vdslLineConfDownRateRatio = new VdslLineConfDownRateRatioEnt(mib, this);
                            this.vdslLineConfUpRateRatio = new VdslLineConfUpRateRatioEnt(mib, this);
                            this.vdslLineConfDownMaxInterDelay = new VdslLineConfDownMaxInterDelayEnt(mib, this);
                            this.vdslLineConfUpMaxInterDelay = new VdslLineConfUpMaxInterDelayEnt(mib, this);
                            this.vdslLineConfDownPboControl = new VdslLineConfDownPboControlEnt(mib, this);
                            this.vdslLineConfUpPboControl = new VdslLineConfUpPboControlEnt(mib, this);
                            this.vdslLineConfDownPboLevel = new VdslLineConfDownPboLevelEnt(mib, this);
                            this.vdslLineConfUpPboLevel = new VdslLineConfUpPboLevelEnt(mib, this);
                            this.vdslLineConfDeploymentScenario = new VdslLineConfDeploymentScenarioEnt(mib, this);
                            this.vdslLineConfAdslPresence = new VdslLineConfAdslPresenceEnt(mib, this);
                            this.vdslLineConfApplicableStandard = new VdslLineConfApplicableStandardEnt(mib, this);
                            this.vdslLineConfBandPlan = new VdslLineConfBandPlanEnt(mib, this);
                            this.vdslLineConfBandPlanFx = new VdslLineConfBandPlanFxEnt(mib, this);
                            this.vdslLineConfBandOptUsage = new VdslLineConfBandOptUsageEnt(mib, this);
                            this.vdslLineConfUpPsdTemplate = new VdslLineConfUpPsdTemplateEnt(mib, this);
                            this.vdslLineConfDownPsdTemplate = new VdslLineConfDownPsdTemplateEnt(mib, this);
                            this.vdslLineConfHamBandMask = new VdslLineConfHamBandMaskEnt(mib, this);
                            this.vdslLineConfCustomNotch1Start = new VdslLineConfCustomNotch1StartEnt(mib, this);
                            this.vdslLineConfCustomNotch1Stop = new VdslLineConfCustomNotch1StopEnt(mib, this);
                            this.vdslLineConfCustomNotch2Start = new VdslLineConfCustomNotch2StartEnt(mib, this);
                            this.vdslLineConfCustomNotch2Stop = new VdslLineConfCustomNotch2StopEnt(mib, this);
                            this.vdslLineConfDownTargetSlowBurst = new VdslLineConfDownTargetSlowBurstEnt(mib, this);
                            this.vdslLineConfUpTargetSlowBurst = new VdslLineConfUpTargetSlowBurstEnt(mib, this);
                            this.vdslLineConfDownMaxFastFec = new VdslLineConfDownMaxFastFecEnt(mib, this);
                            this.vdslLineConfUpMaxFastFec = new VdslLineConfUpMaxFastFecEnt(mib, this);
                            this.vdslLineConfLineType = new VdslLineConfLineTypeEnt(mib, this);
                            this.vdslLineConfProfRowStatus = new VdslLineConfProfRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslLineConfProfileName,
                                this.vdslLineConfDownRateMode,
                                this.vdslLineConfUpRateMode,
                                this.vdslLineConfDownMaxPwr,
                                this.vdslLineConfUpMaxPwr,
                                this.vdslLineConfDownMaxSnrMgn,
                                this.vdslLineConfDownMinSnrMgn,
                                this.vdslLineConfDownTargetSnrMgn,
                                this.vdslLineConfUpMaxSnrMgn,
                                this.vdslLineConfUpMinSnrMgn,
                                this.vdslLineConfUpTargetSnrMgn,
                                this.vdslLineConfDownFastMaxDataRate,
                                this.vdslLineConfDownFastMinDataRate,
                                this.vdslLineConfDownSlowMaxDataRate,
                                this.vdslLineConfDownSlowMinDataRate,
                                this.vdslLineConfUpFastMaxDataRate,
                                this.vdslLineConfUpFastMinDataRate,
                                this.vdslLineConfUpSlowMaxDataRate,
                                this.vdslLineConfUpSlowMinDataRate,
                                this.vdslLineConfDownRateRatio,
                                this.vdslLineConfUpRateRatio,
                                this.vdslLineConfDownMaxInterDelay,
                                this.vdslLineConfUpMaxInterDelay,
                                this.vdslLineConfDownPboControl,
                                this.vdslLineConfUpPboControl,
                                this.vdslLineConfDownPboLevel,
                                this.vdslLineConfUpPboLevel,
                                this.vdslLineConfDeploymentScenario,
                                this.vdslLineConfAdslPresence,
                                this.vdslLineConfApplicableStandard,
                                this.vdslLineConfBandPlan,
                                this.vdslLineConfBandPlanFx,
                                this.vdslLineConfBandOptUsage,
                                this.vdslLineConfUpPsdTemplate,
                                this.vdslLineConfDownPsdTemplate,
                                this.vdslLineConfHamBandMask,
                                this.vdslLineConfCustomNotch1Start,
                                this.vdslLineConfCustomNotch1Stop,
                                this.vdslLineConfCustomNotch2Start,
                                this.vdslLineConfCustomNotch2Stop,
                                this.vdslLineConfDownTargetSlowBurst,
                                this.vdslLineConfUpTargetSlowBurst,
                                this.vdslLineConfDownMaxFastFec,
                                this.vdslLineConfUpMaxFastFec,
                                this.vdslLineConfLineType,
                                this.vdslLineConfProfRowStatus
                            };
                        }
                        public static final class VdslLineConfProfileNameEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfProfileNameEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfProfileName", "1.3.6.1.2.1.10.97.1.1.11.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfDownRateModeEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfDownRateModeEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfDownRateMode", "1.3.6.1.2.1.10.97.1.1.11.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfUpRateModeEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfUpRateModeEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfUpRateMode", "1.3.6.1.2.1.10.97.1.1.11.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfDownMaxPwrEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfDownMaxPwrEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfDownMaxPwr", "1.3.6.1.2.1.10.97.1.1.11.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfUpMaxPwrEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfUpMaxPwrEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfUpMaxPwr", "1.3.6.1.2.1.10.97.1.1.11.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfDownMaxSnrMgnEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfDownMaxSnrMgnEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfDownMaxSnrMgn", "1.3.6.1.2.1.10.97.1.1.11.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfDownMinSnrMgnEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfDownMinSnrMgnEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfDownMinSnrMgn", "1.3.6.1.2.1.10.97.1.1.11.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfDownTargetSnrMgnEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfDownTargetSnrMgnEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfDownTargetSnrMgn", "1.3.6.1.2.1.10.97.1.1.11.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfUpMaxSnrMgnEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfUpMaxSnrMgnEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfUpMaxSnrMgn", "1.3.6.1.2.1.10.97.1.1.11.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfUpMinSnrMgnEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfUpMinSnrMgnEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfUpMinSnrMgn", "1.3.6.1.2.1.10.97.1.1.11.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfUpTargetSnrMgnEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfUpTargetSnrMgnEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfUpTargetSnrMgn", "1.3.6.1.2.1.10.97.1.1.11.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfDownFastMaxDataRateEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfDownFastMaxDataRateEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfDownFastMaxDataRate", "1.3.6.1.2.1.10.97.1.1.11.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfDownFastMinDataRateEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfDownFastMinDataRateEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfDownFastMinDataRate", "1.3.6.1.2.1.10.97.1.1.11.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfDownSlowMaxDataRateEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfDownSlowMaxDataRateEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfDownSlowMaxDataRate", "1.3.6.1.2.1.10.97.1.1.11.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfDownSlowMinDataRateEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfDownSlowMinDataRateEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfDownSlowMinDataRate", "1.3.6.1.2.1.10.97.1.1.11.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfUpFastMaxDataRateEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfUpFastMaxDataRateEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfUpFastMaxDataRate", "1.3.6.1.2.1.10.97.1.1.11.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfUpFastMinDataRateEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfUpFastMinDataRateEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfUpFastMinDataRate", "1.3.6.1.2.1.10.97.1.1.11.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfUpSlowMaxDataRateEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfUpSlowMaxDataRateEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfUpSlowMaxDataRate", "1.3.6.1.2.1.10.97.1.1.11.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfUpSlowMinDataRateEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfUpSlowMinDataRateEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfUpSlowMinDataRate", "1.3.6.1.2.1.10.97.1.1.11.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfDownRateRatioEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfDownRateRatioEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfDownRateRatio", "1.3.6.1.2.1.10.97.1.1.11.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfUpRateRatioEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfUpRateRatioEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfUpRateRatio", "1.3.6.1.2.1.10.97.1.1.11.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfDownMaxInterDelayEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfDownMaxInterDelayEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfDownMaxInterDelay", "1.3.6.1.2.1.10.97.1.1.11.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfUpMaxInterDelayEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfUpMaxInterDelayEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfUpMaxInterDelay", "1.3.6.1.2.1.10.97.1.1.11.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfDownPboControlEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfDownPboControlEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfDownPboControl", "1.3.6.1.2.1.10.97.1.1.11.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfUpPboControlEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfUpPboControlEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfUpPboControl", "1.3.6.1.2.1.10.97.1.1.11.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfDownPboLevelEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfDownPboLevelEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfDownPboLevel", "1.3.6.1.2.1.10.97.1.1.11.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfUpPboLevelEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfUpPboLevelEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfUpPboLevel", "1.3.6.1.2.1.10.97.1.1.11.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfDeploymentScenarioEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfDeploymentScenarioEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfDeploymentScenario", "1.3.6.1.2.1.10.97.1.1.11.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfAdslPresenceEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfAdslPresenceEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfAdslPresence", "1.3.6.1.2.1.10.97.1.1.11.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfApplicableStandardEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfApplicableStandardEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfApplicableStandard", "1.3.6.1.2.1.10.97.1.1.11.1.30", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfBandPlanEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfBandPlanEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfBandPlan", "1.3.6.1.2.1.10.97.1.1.11.1.31", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfBandPlanFxEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfBandPlanFxEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfBandPlanFx", "1.3.6.1.2.1.10.97.1.1.11.1.32", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfBandOptUsageEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfBandOptUsageEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfBandOptUsage", "1.3.6.1.2.1.10.97.1.1.11.1.33", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfUpPsdTemplateEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfUpPsdTemplateEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfUpPsdTemplate", "1.3.6.1.2.1.10.97.1.1.11.1.34", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfDownPsdTemplateEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfDownPsdTemplateEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfDownPsdTemplate", "1.3.6.1.2.1.10.97.1.1.11.1.35", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfHamBandMaskEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfHamBandMaskEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfHamBandMask", "1.3.6.1.2.1.10.97.1.1.11.1.36", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfCustomNotch1StartEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfCustomNotch1StartEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfCustomNotch1Start", "1.3.6.1.2.1.10.97.1.1.11.1.37", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfCustomNotch1StopEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfCustomNotch1StopEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfCustomNotch1Stop", "1.3.6.1.2.1.10.97.1.1.11.1.38", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfCustomNotch2StartEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfCustomNotch2StartEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfCustomNotch2Start", "1.3.6.1.2.1.10.97.1.1.11.1.39", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfCustomNotch2StopEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfCustomNotch2StopEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfCustomNotch2Stop", "1.3.6.1.2.1.10.97.1.1.11.1.40", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfDownTargetSlowBurstEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfDownTargetSlowBurstEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfDownTargetSlowBurst", "1.3.6.1.2.1.10.97.1.1.11.1.41", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfUpTargetSlowBurstEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfUpTargetSlowBurstEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfUpTargetSlowBurst", "1.3.6.1.2.1.10.97.1.1.11.1.42", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfDownMaxFastFecEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfDownMaxFastFecEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfDownMaxFastFec", "1.3.6.1.2.1.10.97.1.1.11.1.43", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfUpMaxFastFecEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfUpMaxFastFecEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfUpMaxFastFec", "1.3.6.1.2.1.10.97.1.1.11.1.44", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfLineTypeEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfLineTypeEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfLineType", "1.3.6.1.2.1.10.97.1.1.11.1.45", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineConfProfRowStatusEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineConfProfRowStatusEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineConfProfRowStatus", "1.3.6.1.2.1.10.97.1.1.11.1.46", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class VdslLineAlarmConfProfileTableEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    public final VdslLineAlarmConfProfileEntryEnt vdslLineAlarmConfProfileEntry;

                    private VdslLineAlarmConfProfileTableEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslLineAlarmConfProfileTable", "1.3.6.1.2.1.10.97.1.1.20", false, true, false, false);
                        this.vdslLineAlarmConfProfileEntry = new VdslLineAlarmConfProfileEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslLineAlarmConfProfileEntry
                        };
                    }
                    public static final class VdslLineAlarmConfProfileEntryEnt extends MIBEntry<VDSLLINEMIBDef>
                    {
                        public final VdslLineAlarmConfProfileNameEnt vdslLineAlarmConfProfileName;

                        public final VdslLineAlarmConfThresh15MinLofsEnt vdslLineAlarmConfThresh15MinLofs;

                        public final VdslLineAlarmConfThresh15MinLossEnt vdslLineAlarmConfThresh15MinLoss;

                        public final VdslLineAlarmConfThresh15MinLprsEnt vdslLineAlarmConfThresh15MinLprs;

                        public final VdslLineAlarmConfThresh15MinLolsEnt vdslLineAlarmConfThresh15MinLols;

                        public final VdslLineAlarmConfThresh15MinESsEnt vdslLineAlarmConfThresh15MinESs;

                        public final VdslLineAlarmConfThresh15MinSESsEnt vdslLineAlarmConfThresh15MinSESs;

                        public final VdslLineAlarmConfThresh15MinUASsEnt vdslLineAlarmConfThresh15MinUASs;

                        public final VdslLineAlarmConfInitFailureEnt vdslLineAlarmConfInitFailure;

                        public final VdslLineAlarmConfProfRowStatusEnt vdslLineAlarmConfProfRowStatus;

                        private VdslLineAlarmConfProfileEntryEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "vdslLineAlarmConfProfileEntry", "1.3.6.1.2.1.10.97.1.1.20.1", false, false, false, true);
                            this.vdslLineAlarmConfProfileName = new VdslLineAlarmConfProfileNameEnt(mib, this);
                            this.vdslLineAlarmConfThresh15MinLofs = new VdslLineAlarmConfThresh15MinLofsEnt(mib, this);
                            this.vdslLineAlarmConfThresh15MinLoss = new VdslLineAlarmConfThresh15MinLossEnt(mib, this);
                            this.vdslLineAlarmConfThresh15MinLprs = new VdslLineAlarmConfThresh15MinLprsEnt(mib, this);
                            this.vdslLineAlarmConfThresh15MinLols = new VdslLineAlarmConfThresh15MinLolsEnt(mib, this);
                            this.vdslLineAlarmConfThresh15MinESs = new VdslLineAlarmConfThresh15MinESsEnt(mib, this);
                            this.vdslLineAlarmConfThresh15MinSESs = new VdslLineAlarmConfThresh15MinSESsEnt(mib, this);
                            this.vdslLineAlarmConfThresh15MinUASs = new VdslLineAlarmConfThresh15MinUASsEnt(mib, this);
                            this.vdslLineAlarmConfInitFailure = new VdslLineAlarmConfInitFailureEnt(mib, this);
                            this.vdslLineAlarmConfProfRowStatus = new VdslLineAlarmConfProfRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslLineAlarmConfProfileName,
                                this.vdslLineAlarmConfThresh15MinLofs,
                                this.vdslLineAlarmConfThresh15MinLoss,
                                this.vdslLineAlarmConfThresh15MinLprs,
                                this.vdslLineAlarmConfThresh15MinLols,
                                this.vdslLineAlarmConfThresh15MinESs,
                                this.vdslLineAlarmConfThresh15MinSESs,
                                this.vdslLineAlarmConfThresh15MinUASs,
                                this.vdslLineAlarmConfInitFailure,
                                this.vdslLineAlarmConfProfRowStatus
                            };
                        }
                        public static final class VdslLineAlarmConfProfileNameEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineAlarmConfProfileNameEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineAlarmConfProfileName", "1.3.6.1.2.1.10.97.1.1.20.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineAlarmConfThresh15MinLofsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineAlarmConfThresh15MinLofsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineAlarmConfThresh15MinLofs", "1.3.6.1.2.1.10.97.1.1.20.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineAlarmConfThresh15MinLossEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineAlarmConfThresh15MinLossEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineAlarmConfThresh15MinLoss", "1.3.6.1.2.1.10.97.1.1.20.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineAlarmConfThresh15MinLprsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineAlarmConfThresh15MinLprsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineAlarmConfThresh15MinLprs", "1.3.6.1.2.1.10.97.1.1.20.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineAlarmConfThresh15MinLolsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineAlarmConfThresh15MinLolsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineAlarmConfThresh15MinLols", "1.3.6.1.2.1.10.97.1.1.20.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineAlarmConfThresh15MinESsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineAlarmConfThresh15MinESsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineAlarmConfThresh15MinESs", "1.3.6.1.2.1.10.97.1.1.20.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineAlarmConfThresh15MinSESsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineAlarmConfThresh15MinSESsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineAlarmConfThresh15MinSESs", "1.3.6.1.2.1.10.97.1.1.20.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineAlarmConfThresh15MinUASsEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineAlarmConfThresh15MinUASsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineAlarmConfThresh15MinUASs", "1.3.6.1.2.1.10.97.1.1.20.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineAlarmConfInitFailureEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineAlarmConfInitFailureEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineAlarmConfInitFailure", "1.3.6.1.2.1.10.97.1.1.20.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineAlarmConfProfRowStatusEnt extends MIBEntry<VDSLLINEMIBDef>
                        {
                            private VdslLineAlarmConfProfRowStatusEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineAlarmConfProfRowStatus", "1.3.6.1.2.1.10.97.1.1.20.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class VdslNotificationsEnt extends MIBEntry<VDSLLINEMIBDef>
            {
                public final VdslPerfLofsThreshNotificationEnt vdslPerfLofsThreshNotification;

                public final VdslPerfLossThreshNotificationEnt vdslPerfLossThreshNotification;

                public final VdslPerfLprsThreshNotificationEnt vdslPerfLprsThreshNotification;

                public final VdslPerfLolsThreshNotificationEnt vdslPerfLolsThreshNotification;

                public final VdslPerfESsThreshNotificationEnt vdslPerfESsThreshNotification;

                public final VdslPerfSESsThreshNotificationEnt vdslPerfSESsThreshNotification;

                public final VdslPerfUASsThreshNotificationEnt vdslPerfUASsThreshNotification;

                public final VdslDownMaxSnrMgnNotificationEnt vdslDownMaxSnrMgnNotification;

                public final VdslDownMinSnrMgnNotificationEnt vdslDownMinSnrMgnNotification;

                public final VdslUpMaxSnrMgnNotificationEnt vdslUpMaxSnrMgnNotification;

                public final VdslUpMinSnrMgnNotificationEnt vdslUpMinSnrMgnNotification;

                public final VdslInitFailureNotificationEnt vdslInitFailureNotification;

                private VdslNotificationsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "vdslNotifications", "1.3.6.1.2.1.10.97.1.0", false, false, false, false);
                    this.vdslPerfLofsThreshNotification = new VdslPerfLofsThreshNotificationEnt(mib, this);
                    this.vdslPerfLossThreshNotification = new VdslPerfLossThreshNotificationEnt(mib, this);
                    this.vdslPerfLprsThreshNotification = new VdslPerfLprsThreshNotificationEnt(mib, this);
                    this.vdslPerfLolsThreshNotification = new VdslPerfLolsThreshNotificationEnt(mib, this);
                    this.vdslPerfESsThreshNotification = new VdslPerfESsThreshNotificationEnt(mib, this);
                    this.vdslPerfSESsThreshNotification = new VdslPerfSESsThreshNotificationEnt(mib, this);
                    this.vdslPerfUASsThreshNotification = new VdslPerfUASsThreshNotificationEnt(mib, this);
                    this.vdslDownMaxSnrMgnNotification = new VdslDownMaxSnrMgnNotificationEnt(mib, this);
                    this.vdslDownMinSnrMgnNotification = new VdslDownMinSnrMgnNotificationEnt(mib, this);
                    this.vdslUpMaxSnrMgnNotification = new VdslUpMaxSnrMgnNotificationEnt(mib, this);
                    this.vdslUpMinSnrMgnNotification = new VdslUpMinSnrMgnNotificationEnt(mib, this);
                    this.vdslInitFailureNotification = new VdslInitFailureNotificationEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vdslPerfLofsThreshNotification,
                        this.vdslPerfLossThreshNotification,
                        this.vdslPerfLprsThreshNotification,
                        this.vdslPerfLolsThreshNotification,
                        this.vdslPerfESsThreshNotification,
                        this.vdslPerfSESsThreshNotification,
                        this.vdslPerfUASsThreshNotification,
                        this.vdslDownMaxSnrMgnNotification,
                        this.vdslDownMinSnrMgnNotification,
                        this.vdslUpMaxSnrMgnNotification,
                        this.vdslUpMinSnrMgnNotification,
                        this.vdslInitFailureNotification
                    };
                }
                public static final class VdslPerfLofsThreshNotificationEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    private VdslPerfLofsThreshNotificationEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslPerfLofsThreshNotification", "1.3.6.1.2.1.10.97.1.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VdslPerfLossThreshNotificationEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    private VdslPerfLossThreshNotificationEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslPerfLossThreshNotification", "1.3.6.1.2.1.10.97.1.0.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VdslPerfLprsThreshNotificationEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    private VdslPerfLprsThreshNotificationEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslPerfLprsThreshNotification", "1.3.6.1.2.1.10.97.1.0.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VdslPerfLolsThreshNotificationEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    private VdslPerfLolsThreshNotificationEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslPerfLolsThreshNotification", "1.3.6.1.2.1.10.97.1.0.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VdslPerfESsThreshNotificationEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    private VdslPerfESsThreshNotificationEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslPerfESsThreshNotification", "1.3.6.1.2.1.10.97.1.0.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VdslPerfSESsThreshNotificationEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    private VdslPerfSESsThreshNotificationEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslPerfSESsThreshNotification", "1.3.6.1.2.1.10.97.1.0.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VdslPerfUASsThreshNotificationEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    private VdslPerfUASsThreshNotificationEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslPerfUASsThreshNotification", "1.3.6.1.2.1.10.97.1.0.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VdslDownMaxSnrMgnNotificationEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    private VdslDownMaxSnrMgnNotificationEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslDownMaxSnrMgnNotification", "1.3.6.1.2.1.10.97.1.0.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VdslDownMinSnrMgnNotificationEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    private VdslDownMinSnrMgnNotificationEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslDownMinSnrMgnNotification", "1.3.6.1.2.1.10.97.1.0.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VdslUpMaxSnrMgnNotificationEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    private VdslUpMaxSnrMgnNotificationEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslUpMaxSnrMgnNotification", "1.3.6.1.2.1.10.97.1.0.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VdslUpMinSnrMgnNotificationEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    private VdslUpMinSnrMgnNotificationEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslUpMinSnrMgnNotification", "1.3.6.1.2.1.10.97.1.0.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VdslInitFailureNotificationEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    private VdslInitFailureNotificationEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslInitFailureNotification", "1.3.6.1.2.1.10.97.1.0.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class VdslConformanceEnt extends MIBEntry<VDSLLINEMIBDef>
            {
                public final VdslGroupsEnt vdslGroups;

                public final VdslCompliancesEnt vdslCompliances;

                private VdslConformanceEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "vdslConformance", "1.3.6.1.2.1.10.97.1.3", false, false, false, false);
                    this.vdslGroups = new VdslGroupsEnt(mib, this);
                    this.vdslCompliances = new VdslCompliancesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vdslGroups,
                        this.vdslCompliances
                    };
                }
                public static final class VdslGroupsEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    /** units of conformance*/
                    public final VdslGroupEnt vdslGroup;

                    public final VdslNotificationGroupEnt vdslNotificationGroup;

                    private VdslGroupsEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslGroups", "1.3.6.1.2.1.10.97.1.3.1", false, false, false, false);
                        this.vdslGroup = new VdslGroupEnt(mib, this);
                        this.vdslNotificationGroup = new VdslNotificationGroupEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslGroup,
                            this.vdslNotificationGroup
                        };
                    }
                    public static final class VdslGroupEnt extends MIBEntry<VDSLLINEMIBDef>
                    {
                        private VdslGroupEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "vdslGroup", "1.3.6.1.2.1.10.97.1.3.1.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class VdslNotificationGroupEnt extends MIBEntry<VDSLLINEMIBDef>
                    {
                        private VdslNotificationGroupEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "vdslNotificationGroup", "1.3.6.1.2.1.10.97.1.3.1.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class VdslCompliancesEnt extends MIBEntry<VDSLLINEMIBDef>
                {
                    public final VdslLineMibComplianceEnt vdslLineMibCompliance;

                    private VdslCompliancesEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "vdslCompliances", "1.3.6.1.2.1.10.97.1.3.2", false, false, false, false);
                        this.vdslLineMibCompliance = new VdslLineMibComplianceEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslLineMibCompliance
                        };
                    }
                    public static final class VdslLineMibComplianceEnt extends MIBEntry<VDSLLINEMIBDef>
                    {
                        private VdslLineMibComplianceEnt(VDSLLINEMIBDef mib, MIBEntry<VDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "vdslLineMibCompliance", "1.3.6.1.2.1.10.97.1.3.2.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

}
