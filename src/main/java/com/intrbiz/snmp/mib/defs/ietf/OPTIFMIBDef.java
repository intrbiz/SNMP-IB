package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class OPTIFMIBDef extends MIB
{
    public static final OPTIFMIBDef OPTIFMIB = new OPTIFMIBDef();

    static { MIBs.getInstance().registerMIB(OPTIFMIBDef.OPTIFMIB); }

    /** This is the MIB module for the OTN Interface objects.*/
    public final OptIfMibModuleEnt optIfMibModule;

    private OPTIFMIBDef()
    {
        super("OPT-IF-MIB");
        this.optIfMibModule = new OptIfMibModuleEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.optIfMibModule
        };
    }

    public static final class OptIfMibModuleEnt extends MIBEntry<OPTIFMIBDef>
    {
        /** object groups*/
        public final OptIfObjectsEnt optIfObjects;

        public final OptIfConfsEnt optIfConfs;

        private OptIfMibModuleEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
        {
            super(mib, parent, "optIfMibModule", "1.3.6.1.2.1.10.133", false, false, false, false);
            this.optIfObjects = new OptIfObjectsEnt(mib, this);
            this.optIfConfs = new OptIfConfsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.optIfObjects,
                this.optIfConfs
            };
        }
        public static final class OptIfObjectsEnt extends MIBEntry<OPTIFMIBDef>
        {
            public final OptIfOTMnEnt optIfOTMn;

            public final OptIfPerfMonEnt optIfPerfMon;

            public final OptIfOTSnEnt optIfOTSn;

            public final OptIfOMSnEnt optIfOMSn;

            public final OptIfOChGroupEnt optIfOChGroup;

            public final OptIfOChEnt optIfOCh;

            public final OptIfOTUkEnt optIfOTUk;

            public final OptIfODUkEnt optIfODUk;

            public final OptIfODUkTEnt optIfODUkT;

            private OptIfObjectsEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
            {
                super(mib, parent, "optIfObjects", "1.3.6.1.2.1.10.133.1", false, false, false, false);
                this.optIfOTMn = new OptIfOTMnEnt(mib, this);
                this.optIfPerfMon = new OptIfPerfMonEnt(mib, this);
                this.optIfOTSn = new OptIfOTSnEnt(mib, this);
                this.optIfOMSn = new OptIfOMSnEnt(mib, this);
                this.optIfOChGroup = new OptIfOChGroupEnt(mib, this);
                this.optIfOCh = new OptIfOChEnt(mib, this);
                this.optIfOTUk = new OptIfOTUkEnt(mib, this);
                this.optIfODUk = new OptIfODUkEnt(mib, this);
                this.optIfODUkT = new OptIfODUkTEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.optIfOTMn,
                    this.optIfPerfMon,
                    this.optIfOTSn,
                    this.optIfOMSn,
                    this.optIfOChGroup,
                    this.optIfOCh,
                    this.optIfOTUk,
                    this.optIfODUk,
                    this.optIfODUkT
                };
            }
            public static final class OptIfOTMnEnt extends MIBEntry<OPTIFMIBDef>
            {
                /** the optIfOTMn groupThis group defines the OTM structure information of anoptical interface.
OTMn Table*/
                public final OptIfOTMnTableEnt optIfOTMnTable;

                private OptIfOTMnEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                {
                    super(mib, parent, "optIfOTMn", "1.3.6.1.2.1.10.133.1.1", false, false, false, false);
                    this.optIfOTMnTable = new OptIfOTMnTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.optIfOTMnTable
                    };
                }
                public static final class OptIfOTMnTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOTMnEntryEnt optIfOTMnEntry;

                    private OptIfOTMnTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTMnTable", "1.3.6.1.2.1.10.133.1.1.1", false, true, false, false);
                        this.optIfOTMnEntry = new OptIfOTMnEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOTMnEntry
                        };
                    }
                    public static final class OptIfOTMnEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOTMnOrderEnt optIfOTMnOrder;

                        public final OptIfOTMnReducedEnt optIfOTMnReduced;

                        public final OptIfOTMnBitRatesEnt optIfOTMnBitRates;

                        public final OptIfOTMnInterfaceTypeEnt optIfOTMnInterfaceType;

                        public final OptIfOTMnTcmMaxEnt optIfOTMnTcmMax;

                        public final OptIfOTMnOpticalReachEnt optIfOTMnOpticalReach;

                        private OptIfOTMnEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOTMnEntry", "1.3.6.1.2.1.10.133.1.1.1.1", false, false, false, true);
                            this.optIfOTMnOrder = new OptIfOTMnOrderEnt(mib, this);
                            this.optIfOTMnReduced = new OptIfOTMnReducedEnt(mib, this);
                            this.optIfOTMnBitRates = new OptIfOTMnBitRatesEnt(mib, this);
                            this.optIfOTMnInterfaceType = new OptIfOTMnInterfaceTypeEnt(mib, this);
                            this.optIfOTMnTcmMax = new OptIfOTMnTcmMaxEnt(mib, this);
                            this.optIfOTMnOpticalReach = new OptIfOTMnOpticalReachEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOTMnOrder,
                                this.optIfOTMnReduced,
                                this.optIfOTMnBitRates,
                                this.optIfOTMnInterfaceType,
                                this.optIfOTMnTcmMax,
                                this.optIfOTMnOpticalReach
                            };
                        }
                        public static final class OptIfOTMnOrderEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTMnOrderEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTMnOrder", "1.3.6.1.2.1.10.133.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTMnReducedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTMnReducedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTMnReduced", "1.3.6.1.2.1.10.133.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTMnBitRatesEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTMnBitRatesEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTMnBitRates", "1.3.6.1.2.1.10.133.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTMnInterfaceTypeEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTMnInterfaceTypeEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTMnInterfaceType", "1.3.6.1.2.1.10.133.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTMnTcmMaxEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTMnTcmMaxEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTMnTcmMax", "1.3.6.1.2.1.10.133.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTMnOpticalReachEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTMnOpticalReachEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTMnOpticalReach", "1.3.6.1.2.1.10.133.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class OptIfPerfMonEnt extends MIBEntry<OPTIFMIBDef>
            {
                /** the optIfPerfMon groupThis group defines performance monitoring objects for alllayers.
PM interval table*/
                public final OptIfPerfMonIntervalTableEnt optIfPerfMonIntervalTable;

                private OptIfPerfMonEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                {
                    super(mib, parent, "optIfPerfMon", "1.3.6.1.2.1.10.133.1.2", false, false, false, false);
                    this.optIfPerfMonIntervalTable = new OptIfPerfMonIntervalTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.optIfPerfMonIntervalTable
                    };
                }
                public static final class OptIfPerfMonIntervalTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfPerfMonIntervalEntryEnt optIfPerfMonIntervalEntry;

                    private OptIfPerfMonIntervalTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfPerfMonIntervalTable", "1.3.6.1.2.1.10.133.1.2.1", false, true, false, false);
                        this.optIfPerfMonIntervalEntry = new OptIfPerfMonIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfPerfMonIntervalEntry
                        };
                    }
                    public static final class OptIfPerfMonIntervalEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfPerfMonCurrentTimeElapsedEnt optIfPerfMonCurrentTimeElapsed;

                        public final OptIfPerfMonCurDayTimeElapsedEnt optIfPerfMonCurDayTimeElapsed;

                        public final OptIfPerfMonIntervalNumIntervalsEnt optIfPerfMonIntervalNumIntervals;

                        public final OptIfPerfMonIntervalNumInvalidIntervalsEnt optIfPerfMonIntervalNumInvalidIntervals;

                        private OptIfPerfMonIntervalEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfPerfMonIntervalEntry", "1.3.6.1.2.1.10.133.1.2.1.1", false, false, false, true);
                            this.optIfPerfMonCurrentTimeElapsed = new OptIfPerfMonCurrentTimeElapsedEnt(mib, this);
                            this.optIfPerfMonCurDayTimeElapsed = new OptIfPerfMonCurDayTimeElapsedEnt(mib, this);
                            this.optIfPerfMonIntervalNumIntervals = new OptIfPerfMonIntervalNumIntervalsEnt(mib, this);
                            this.optIfPerfMonIntervalNumInvalidIntervals = new OptIfPerfMonIntervalNumInvalidIntervalsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfPerfMonCurrentTimeElapsed,
                                this.optIfPerfMonCurDayTimeElapsed,
                                this.optIfPerfMonIntervalNumIntervals,
                                this.optIfPerfMonIntervalNumInvalidIntervals
                            };
                        }
                        public static final class OptIfPerfMonCurrentTimeElapsedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfPerfMonCurrentTimeElapsedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfPerfMonCurrentTimeElapsed", "1.3.6.1.2.1.10.133.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfPerfMonCurDayTimeElapsedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfPerfMonCurDayTimeElapsedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfPerfMonCurDayTimeElapsed", "1.3.6.1.2.1.10.133.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfPerfMonIntervalNumIntervalsEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfPerfMonIntervalNumIntervalsEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfPerfMonIntervalNumIntervals", "1.3.6.1.2.1.10.133.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfPerfMonIntervalNumInvalidIntervalsEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfPerfMonIntervalNumInvalidIntervalsEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfPerfMonIntervalNumInvalidIntervals", "1.3.6.1.2.1.10.133.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class OptIfOTSnEnt extends MIBEntry<OPTIFMIBDef>
            {
                /** the optIfOTSn groupThis group handles the configuration and performancemonitoring objects for OTS layers.
OTSn config table*/
                public final OptIfOTSnConfigTableEnt optIfOTSnConfigTable;

                /** OTSn sink current tableContains data for the current 15-minute performance monitoringinterval.*/
                public final OptIfOTSnSinkCurrentTableEnt optIfOTSnSinkCurrentTable;

                /** OTSn sink interval tableContains data for previous 15-minute performance monitoringintervals.*/
                public final OptIfOTSnSinkIntervalTableEnt optIfOTSnSinkIntervalTable;

                /** OTSn sink current day tableContains data for the current 24-hour performancemonitoring interval.*/
                public final OptIfOTSnSinkCurDayTableEnt optIfOTSnSinkCurDayTable;

                /** OTSn sink previous day tableContains data for the previous 24-hour performancemonitoring interval.*/
                public final OptIfOTSnSinkPrevDayTableEnt optIfOTSnSinkPrevDayTable;

                /** OTSn source current tableContains data for the current 15-minute performance monitoringinterval.*/
                public final OptIfOTSnSrcCurrentTableEnt optIfOTSnSrcCurrentTable;

                /** OTSn source interval tableContains data for previous 15-minute performance monitoringintervals.*/
                public final OptIfOTSnSrcIntervalTableEnt optIfOTSnSrcIntervalTable;

                /** OTSn source current day tableContains data for the current 24-hour performancemonitoring interval.*/
                public final OptIfOTSnSrcCurDayTableEnt optIfOTSnSrcCurDayTable;

                /** OTSn source previous day tableContains data for the previous 24-hour performancemonitoring interval.*/
                public final OptIfOTSnSrcPrevDayTableEnt optIfOTSnSrcPrevDayTable;

                private OptIfOTSnEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                {
                    super(mib, parent, "optIfOTSn", "1.3.6.1.2.1.10.133.1.3", false, false, false, false);
                    this.optIfOTSnConfigTable = new OptIfOTSnConfigTableEnt(mib, this);
                    this.optIfOTSnSinkCurrentTable = new OptIfOTSnSinkCurrentTableEnt(mib, this);
                    this.optIfOTSnSinkIntervalTable = new OptIfOTSnSinkIntervalTableEnt(mib, this);
                    this.optIfOTSnSinkCurDayTable = new OptIfOTSnSinkCurDayTableEnt(mib, this);
                    this.optIfOTSnSinkPrevDayTable = new OptIfOTSnSinkPrevDayTableEnt(mib, this);
                    this.optIfOTSnSrcCurrentTable = new OptIfOTSnSrcCurrentTableEnt(mib, this);
                    this.optIfOTSnSrcIntervalTable = new OptIfOTSnSrcIntervalTableEnt(mib, this);
                    this.optIfOTSnSrcCurDayTable = new OptIfOTSnSrcCurDayTableEnt(mib, this);
                    this.optIfOTSnSrcPrevDayTable = new OptIfOTSnSrcPrevDayTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.optIfOTSnConfigTable,
                        this.optIfOTSnSinkCurrentTable,
                        this.optIfOTSnSinkIntervalTable,
                        this.optIfOTSnSinkCurDayTable,
                        this.optIfOTSnSinkPrevDayTable,
                        this.optIfOTSnSrcCurrentTable,
                        this.optIfOTSnSrcIntervalTable,
                        this.optIfOTSnSrcCurDayTable,
                        this.optIfOTSnSrcPrevDayTable
                    };
                }
                public static final class OptIfOTSnConfigTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOTSnConfigEntryEnt optIfOTSnConfigEntry;

                    private OptIfOTSnConfigTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnConfigTable", "1.3.6.1.2.1.10.133.1.3.1", false, true, false, false);
                        this.optIfOTSnConfigEntry = new OptIfOTSnConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOTSnConfigEntry
                        };
                    }
                    public static final class OptIfOTSnConfigEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOTSnDirectionalityEnt optIfOTSnDirectionality;

                        public final OptIfOTSnAprStatusEnt optIfOTSnAprStatus;

                        public final OptIfOTSnAprControlEnt optIfOTSnAprControl;

                        public final OptIfOTSnTraceIdentifierTransmittedEnt optIfOTSnTraceIdentifierTransmitted;

                        public final OptIfOTSnDAPIExpectedEnt optIfOTSnDAPIExpected;

                        public final OptIfOTSnSAPIExpectedEnt optIfOTSnSAPIExpected;

                        public final OptIfOTSnTraceIdentifierAcceptedEnt optIfOTSnTraceIdentifierAccepted;

                        public final OptIfOTSnTIMDetModeEnt optIfOTSnTIMDetMode;

                        public final OptIfOTSnTIMActEnabledEnt optIfOTSnTIMActEnabled;

                        public final OptIfOTSnCurrentStatusEnt optIfOTSnCurrentStatus;

                        private OptIfOTSnConfigEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOTSnConfigEntry", "1.3.6.1.2.1.10.133.1.3.1.1", false, false, false, true);
                            this.optIfOTSnDirectionality = new OptIfOTSnDirectionalityEnt(mib, this);
                            this.optIfOTSnAprStatus = new OptIfOTSnAprStatusEnt(mib, this);
                            this.optIfOTSnAprControl = new OptIfOTSnAprControlEnt(mib, this);
                            this.optIfOTSnTraceIdentifierTransmitted = new OptIfOTSnTraceIdentifierTransmittedEnt(mib, this);
                            this.optIfOTSnDAPIExpected = new OptIfOTSnDAPIExpectedEnt(mib, this);
                            this.optIfOTSnSAPIExpected = new OptIfOTSnSAPIExpectedEnt(mib, this);
                            this.optIfOTSnTraceIdentifierAccepted = new OptIfOTSnTraceIdentifierAcceptedEnt(mib, this);
                            this.optIfOTSnTIMDetMode = new OptIfOTSnTIMDetModeEnt(mib, this);
                            this.optIfOTSnTIMActEnabled = new OptIfOTSnTIMActEnabledEnt(mib, this);
                            this.optIfOTSnCurrentStatus = new OptIfOTSnCurrentStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOTSnDirectionality,
                                this.optIfOTSnAprStatus,
                                this.optIfOTSnAprControl,
                                this.optIfOTSnTraceIdentifierTransmitted,
                                this.optIfOTSnDAPIExpected,
                                this.optIfOTSnSAPIExpected,
                                this.optIfOTSnTraceIdentifierAccepted,
                                this.optIfOTSnTIMDetMode,
                                this.optIfOTSnTIMActEnabled,
                                this.optIfOTSnCurrentStatus
                            };
                        }
                        public static final class OptIfOTSnDirectionalityEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnDirectionalityEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnDirectionality", "1.3.6.1.2.1.10.133.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnAprStatusEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnAprStatusEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnAprStatus", "1.3.6.1.2.1.10.133.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnAprControlEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnAprControlEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnAprControl", "1.3.6.1.2.1.10.133.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnTraceIdentifierTransmittedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnTraceIdentifierTransmittedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnTraceIdentifierTransmitted", "1.3.6.1.2.1.10.133.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnDAPIExpectedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnDAPIExpectedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnDAPIExpected", "1.3.6.1.2.1.10.133.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSAPIExpectedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSAPIExpectedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSAPIExpected", "1.3.6.1.2.1.10.133.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnTraceIdentifierAcceptedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnTraceIdentifierAcceptedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnTraceIdentifierAccepted", "1.3.6.1.2.1.10.133.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnTIMDetModeEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnTIMDetModeEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnTIMDetMode", "1.3.6.1.2.1.10.133.1.3.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnTIMActEnabledEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnTIMActEnabledEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnTIMActEnabled", "1.3.6.1.2.1.10.133.1.3.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnCurrentStatusEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnCurrentStatusEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnCurrentStatus", "1.3.6.1.2.1.10.133.1.3.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOTSnSinkCurrentTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOTSnSinkCurrentEntryEnt optIfOTSnSinkCurrentEntry;

                    private OptIfOTSnSinkCurrentTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnSinkCurrentTable", "1.3.6.1.2.1.10.133.1.3.2", false, true, false, false);
                        this.optIfOTSnSinkCurrentEntry = new OptIfOTSnSinkCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOTSnSinkCurrentEntry
                        };
                    }
                    public static final class OptIfOTSnSinkCurrentEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOTSnSinkCurrentSuspectedFlagEnt optIfOTSnSinkCurrentSuspectedFlag;

                        public final OptIfOTSnSinkCurrentInputPowerEnt optIfOTSnSinkCurrentInputPower;

                        public final OptIfOTSnSinkCurrentLowInputPowerEnt optIfOTSnSinkCurrentLowInputPower;

                        public final OptIfOTSnSinkCurrentHighInputPowerEnt optIfOTSnSinkCurrentHighInputPower;

                        public final OptIfOTSnSinkCurrentLowerInputPowerThresholdEnt optIfOTSnSinkCurrentLowerInputPowerThreshold;

                        public final OptIfOTSnSinkCurrentUpperInputPowerThresholdEnt optIfOTSnSinkCurrentUpperInputPowerThreshold;

                        public final OptIfOTSnSinkCurrentOutputPowerEnt optIfOTSnSinkCurrentOutputPower;

                        public final OptIfOTSnSinkCurrentLowOutputPowerEnt optIfOTSnSinkCurrentLowOutputPower;

                        public final OptIfOTSnSinkCurrentHighOutputPowerEnt optIfOTSnSinkCurrentHighOutputPower;

                        public final OptIfOTSnSinkCurrentLowerOutputPowerThresholdEnt optIfOTSnSinkCurrentLowerOutputPowerThreshold;

                        public final OptIfOTSnSinkCurrentUpperOutputPowerThresholdEnt optIfOTSnSinkCurrentUpperOutputPowerThreshold;

                        private OptIfOTSnSinkCurrentEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOTSnSinkCurrentEntry", "1.3.6.1.2.1.10.133.1.3.2.1", false, false, false, true);
                            this.optIfOTSnSinkCurrentSuspectedFlag = new OptIfOTSnSinkCurrentSuspectedFlagEnt(mib, this);
                            this.optIfOTSnSinkCurrentInputPower = new OptIfOTSnSinkCurrentInputPowerEnt(mib, this);
                            this.optIfOTSnSinkCurrentLowInputPower = new OptIfOTSnSinkCurrentLowInputPowerEnt(mib, this);
                            this.optIfOTSnSinkCurrentHighInputPower = new OptIfOTSnSinkCurrentHighInputPowerEnt(mib, this);
                            this.optIfOTSnSinkCurrentLowerInputPowerThreshold = new OptIfOTSnSinkCurrentLowerInputPowerThresholdEnt(mib, this);
                            this.optIfOTSnSinkCurrentUpperInputPowerThreshold = new OptIfOTSnSinkCurrentUpperInputPowerThresholdEnt(mib, this);
                            this.optIfOTSnSinkCurrentOutputPower = new OptIfOTSnSinkCurrentOutputPowerEnt(mib, this);
                            this.optIfOTSnSinkCurrentLowOutputPower = new OptIfOTSnSinkCurrentLowOutputPowerEnt(mib, this);
                            this.optIfOTSnSinkCurrentHighOutputPower = new OptIfOTSnSinkCurrentHighOutputPowerEnt(mib, this);
                            this.optIfOTSnSinkCurrentLowerOutputPowerThreshold = new OptIfOTSnSinkCurrentLowerOutputPowerThresholdEnt(mib, this);
                            this.optIfOTSnSinkCurrentUpperOutputPowerThreshold = new OptIfOTSnSinkCurrentUpperOutputPowerThresholdEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOTSnSinkCurrentSuspectedFlag,
                                this.optIfOTSnSinkCurrentInputPower,
                                this.optIfOTSnSinkCurrentLowInputPower,
                                this.optIfOTSnSinkCurrentHighInputPower,
                                this.optIfOTSnSinkCurrentLowerInputPowerThreshold,
                                this.optIfOTSnSinkCurrentUpperInputPowerThreshold,
                                this.optIfOTSnSinkCurrentOutputPower,
                                this.optIfOTSnSinkCurrentLowOutputPower,
                                this.optIfOTSnSinkCurrentHighOutputPower,
                                this.optIfOTSnSinkCurrentLowerOutputPowerThreshold,
                                this.optIfOTSnSinkCurrentUpperOutputPowerThreshold
                            };
                        }
                        public static final class OptIfOTSnSinkCurrentSuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkCurrentSuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkCurrentSuspectedFlag", "1.3.6.1.2.1.10.133.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkCurrentInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkCurrentInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkCurrentInputPower", "1.3.6.1.2.1.10.133.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkCurrentLowInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkCurrentLowInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkCurrentLowInputPower", "1.3.6.1.2.1.10.133.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkCurrentHighInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkCurrentHighInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkCurrentHighInputPower", "1.3.6.1.2.1.10.133.1.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkCurrentLowerInputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkCurrentLowerInputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkCurrentLowerInputPowerThreshold", "1.3.6.1.2.1.10.133.1.3.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkCurrentUpperInputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkCurrentUpperInputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkCurrentUpperInputPowerThreshold", "1.3.6.1.2.1.10.133.1.3.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkCurrentOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkCurrentOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkCurrentOutputPower", "1.3.6.1.2.1.10.133.1.3.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkCurrentLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkCurrentLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkCurrentLowOutputPower", "1.3.6.1.2.1.10.133.1.3.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkCurrentHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkCurrentHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkCurrentHighOutputPower", "1.3.6.1.2.1.10.133.1.3.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkCurrentLowerOutputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkCurrentLowerOutputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkCurrentLowerOutputPowerThreshold", "1.3.6.1.2.1.10.133.1.3.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkCurrentUpperOutputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkCurrentUpperOutputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkCurrentUpperOutputPowerThreshold", "1.3.6.1.2.1.10.133.1.3.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOTSnSinkIntervalTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOTSnSinkIntervalEntryEnt optIfOTSnSinkIntervalEntry;

                    private OptIfOTSnSinkIntervalTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnSinkIntervalTable", "1.3.6.1.2.1.10.133.1.3.3", false, true, false, false);
                        this.optIfOTSnSinkIntervalEntry = new OptIfOTSnSinkIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOTSnSinkIntervalEntry
                        };
                    }
                    public static final class OptIfOTSnSinkIntervalEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOTSnSinkIntervalNumberEnt optIfOTSnSinkIntervalNumber;

                        public final OptIfOTSnSinkIntervalSuspectedFlagEnt optIfOTSnSinkIntervalSuspectedFlag;

                        public final OptIfOTSnSinkIntervalLastInputPowerEnt optIfOTSnSinkIntervalLastInputPower;

                        public final OptIfOTSnSinkIntervalLowInputPowerEnt optIfOTSnSinkIntervalLowInputPower;

                        public final OptIfOTSnSinkIntervalHighInputPowerEnt optIfOTSnSinkIntervalHighInputPower;

                        public final OptIfOTSnSinkIntervalLastOutputPowerEnt optIfOTSnSinkIntervalLastOutputPower;

                        public final OptIfOTSnSinkIntervalLowOutputPowerEnt optIfOTSnSinkIntervalLowOutputPower;

                        public final OptIfOTSnSinkIntervalHighOutputPowerEnt optIfOTSnSinkIntervalHighOutputPower;

                        private OptIfOTSnSinkIntervalEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOTSnSinkIntervalEntry", "1.3.6.1.2.1.10.133.1.3.3.1", false, false, false, true);
                            this.optIfOTSnSinkIntervalNumber = new OptIfOTSnSinkIntervalNumberEnt(mib, this);
                            this.optIfOTSnSinkIntervalSuspectedFlag = new OptIfOTSnSinkIntervalSuspectedFlagEnt(mib, this);
                            this.optIfOTSnSinkIntervalLastInputPower = new OptIfOTSnSinkIntervalLastInputPowerEnt(mib, this);
                            this.optIfOTSnSinkIntervalLowInputPower = new OptIfOTSnSinkIntervalLowInputPowerEnt(mib, this);
                            this.optIfOTSnSinkIntervalHighInputPower = new OptIfOTSnSinkIntervalHighInputPowerEnt(mib, this);
                            this.optIfOTSnSinkIntervalLastOutputPower = new OptIfOTSnSinkIntervalLastOutputPowerEnt(mib, this);
                            this.optIfOTSnSinkIntervalLowOutputPower = new OptIfOTSnSinkIntervalLowOutputPowerEnt(mib, this);
                            this.optIfOTSnSinkIntervalHighOutputPower = new OptIfOTSnSinkIntervalHighOutputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOTSnSinkIntervalNumber,
                                this.optIfOTSnSinkIntervalSuspectedFlag,
                                this.optIfOTSnSinkIntervalLastInputPower,
                                this.optIfOTSnSinkIntervalLowInputPower,
                                this.optIfOTSnSinkIntervalHighInputPower,
                                this.optIfOTSnSinkIntervalLastOutputPower,
                                this.optIfOTSnSinkIntervalLowOutputPower,
                                this.optIfOTSnSinkIntervalHighOutputPower
                            };
                        }
                        public static final class OptIfOTSnSinkIntervalNumberEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkIntervalNumberEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkIntervalNumber", "1.3.6.1.2.1.10.133.1.3.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkIntervalSuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkIntervalSuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkIntervalSuspectedFlag", "1.3.6.1.2.1.10.133.1.3.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkIntervalLastInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkIntervalLastInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkIntervalLastInputPower", "1.3.6.1.2.1.10.133.1.3.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkIntervalLowInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkIntervalLowInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkIntervalLowInputPower", "1.3.6.1.2.1.10.133.1.3.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkIntervalHighInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkIntervalHighInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkIntervalHighInputPower", "1.3.6.1.2.1.10.133.1.3.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkIntervalLastOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkIntervalLastOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkIntervalLastOutputPower", "1.3.6.1.2.1.10.133.1.3.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkIntervalLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkIntervalLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkIntervalLowOutputPower", "1.3.6.1.2.1.10.133.1.3.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkIntervalHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkIntervalHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkIntervalHighOutputPower", "1.3.6.1.2.1.10.133.1.3.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOTSnSinkCurDayTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOTSnSinkCurDayEntryEnt optIfOTSnSinkCurDayEntry;

                    private OptIfOTSnSinkCurDayTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnSinkCurDayTable", "1.3.6.1.2.1.10.133.1.3.4", false, true, false, false);
                        this.optIfOTSnSinkCurDayEntry = new OptIfOTSnSinkCurDayEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOTSnSinkCurDayEntry
                        };
                    }
                    public static final class OptIfOTSnSinkCurDayEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOTSnSinkCurDaySuspectedFlagEnt optIfOTSnSinkCurDaySuspectedFlag;

                        public final OptIfOTSnSinkCurDayLowInputPowerEnt optIfOTSnSinkCurDayLowInputPower;

                        public final OptIfOTSnSinkCurDayHighInputPowerEnt optIfOTSnSinkCurDayHighInputPower;

                        public final OptIfOTSnSinkCurDayLowOutputPowerEnt optIfOTSnSinkCurDayLowOutputPower;

                        public final OptIfOTSnSinkCurDayHighOutputPowerEnt optIfOTSnSinkCurDayHighOutputPower;

                        private OptIfOTSnSinkCurDayEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOTSnSinkCurDayEntry", "1.3.6.1.2.1.10.133.1.3.4.1", false, false, false, true);
                            this.optIfOTSnSinkCurDaySuspectedFlag = new OptIfOTSnSinkCurDaySuspectedFlagEnt(mib, this);
                            this.optIfOTSnSinkCurDayLowInputPower = new OptIfOTSnSinkCurDayLowInputPowerEnt(mib, this);
                            this.optIfOTSnSinkCurDayHighInputPower = new OptIfOTSnSinkCurDayHighInputPowerEnt(mib, this);
                            this.optIfOTSnSinkCurDayLowOutputPower = new OptIfOTSnSinkCurDayLowOutputPowerEnt(mib, this);
                            this.optIfOTSnSinkCurDayHighOutputPower = new OptIfOTSnSinkCurDayHighOutputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOTSnSinkCurDaySuspectedFlag,
                                this.optIfOTSnSinkCurDayLowInputPower,
                                this.optIfOTSnSinkCurDayHighInputPower,
                                this.optIfOTSnSinkCurDayLowOutputPower,
                                this.optIfOTSnSinkCurDayHighOutputPower
                            };
                        }
                        public static final class OptIfOTSnSinkCurDaySuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkCurDaySuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkCurDaySuspectedFlag", "1.3.6.1.2.1.10.133.1.3.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkCurDayLowInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkCurDayLowInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkCurDayLowInputPower", "1.3.6.1.2.1.10.133.1.3.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkCurDayHighInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkCurDayHighInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkCurDayHighInputPower", "1.3.6.1.2.1.10.133.1.3.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkCurDayLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkCurDayLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkCurDayLowOutputPower", "1.3.6.1.2.1.10.133.1.3.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkCurDayHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkCurDayHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkCurDayHighOutputPower", "1.3.6.1.2.1.10.133.1.3.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOTSnSinkPrevDayTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOTSnSinkPrevDayEntryEnt optIfOTSnSinkPrevDayEntry;

                    private OptIfOTSnSinkPrevDayTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnSinkPrevDayTable", "1.3.6.1.2.1.10.133.1.3.5", false, true, false, false);
                        this.optIfOTSnSinkPrevDayEntry = new OptIfOTSnSinkPrevDayEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOTSnSinkPrevDayEntry
                        };
                    }
                    public static final class OptIfOTSnSinkPrevDayEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOTSnSinkPrevDaySuspectedFlagEnt optIfOTSnSinkPrevDaySuspectedFlag;

                        public final OptIfOTSnSinkPrevDayLastInputPowerEnt optIfOTSnSinkPrevDayLastInputPower;

                        public final OptIfOTSnSinkPrevDayLowInputPowerEnt optIfOTSnSinkPrevDayLowInputPower;

                        public final OptIfOTSnSinkPrevDayHighInputPowerEnt optIfOTSnSinkPrevDayHighInputPower;

                        public final OptIfOTSnSinkPrevDayLastOutputPowerEnt optIfOTSnSinkPrevDayLastOutputPower;

                        public final OptIfOTSnSinkPrevDayLowOutputPowerEnt optIfOTSnSinkPrevDayLowOutputPower;

                        public final OptIfOTSnSinkPrevDayHighOutputPowerEnt optIfOTSnSinkPrevDayHighOutputPower;

                        private OptIfOTSnSinkPrevDayEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOTSnSinkPrevDayEntry", "1.3.6.1.2.1.10.133.1.3.5.1", false, false, false, true);
                            this.optIfOTSnSinkPrevDaySuspectedFlag = new OptIfOTSnSinkPrevDaySuspectedFlagEnt(mib, this);
                            this.optIfOTSnSinkPrevDayLastInputPower = new OptIfOTSnSinkPrevDayLastInputPowerEnt(mib, this);
                            this.optIfOTSnSinkPrevDayLowInputPower = new OptIfOTSnSinkPrevDayLowInputPowerEnt(mib, this);
                            this.optIfOTSnSinkPrevDayHighInputPower = new OptIfOTSnSinkPrevDayHighInputPowerEnt(mib, this);
                            this.optIfOTSnSinkPrevDayLastOutputPower = new OptIfOTSnSinkPrevDayLastOutputPowerEnt(mib, this);
                            this.optIfOTSnSinkPrevDayLowOutputPower = new OptIfOTSnSinkPrevDayLowOutputPowerEnt(mib, this);
                            this.optIfOTSnSinkPrevDayHighOutputPower = new OptIfOTSnSinkPrevDayHighOutputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOTSnSinkPrevDaySuspectedFlag,
                                this.optIfOTSnSinkPrevDayLastInputPower,
                                this.optIfOTSnSinkPrevDayLowInputPower,
                                this.optIfOTSnSinkPrevDayHighInputPower,
                                this.optIfOTSnSinkPrevDayLastOutputPower,
                                this.optIfOTSnSinkPrevDayLowOutputPower,
                                this.optIfOTSnSinkPrevDayHighOutputPower
                            };
                        }
                        public static final class OptIfOTSnSinkPrevDaySuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkPrevDaySuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkPrevDaySuspectedFlag", "1.3.6.1.2.1.10.133.1.3.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkPrevDayLastInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkPrevDayLastInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkPrevDayLastInputPower", "1.3.6.1.2.1.10.133.1.3.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkPrevDayLowInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkPrevDayLowInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkPrevDayLowInputPower", "1.3.6.1.2.1.10.133.1.3.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkPrevDayHighInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkPrevDayHighInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkPrevDayHighInputPower", "1.3.6.1.2.1.10.133.1.3.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkPrevDayLastOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkPrevDayLastOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkPrevDayLastOutputPower", "1.3.6.1.2.1.10.133.1.3.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkPrevDayLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkPrevDayLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkPrevDayLowOutputPower", "1.3.6.1.2.1.10.133.1.3.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSinkPrevDayHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSinkPrevDayHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSinkPrevDayHighOutputPower", "1.3.6.1.2.1.10.133.1.3.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOTSnSrcCurrentTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOTSnSrcCurrentEntryEnt optIfOTSnSrcCurrentEntry;

                    private OptIfOTSnSrcCurrentTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnSrcCurrentTable", "1.3.6.1.2.1.10.133.1.3.6", false, true, false, false);
                        this.optIfOTSnSrcCurrentEntry = new OptIfOTSnSrcCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOTSnSrcCurrentEntry
                        };
                    }
                    public static final class OptIfOTSnSrcCurrentEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOTSnSrcCurrentSuspectedFlagEnt optIfOTSnSrcCurrentSuspectedFlag;

                        public final OptIfOTSnSrcCurrentOutputPowerEnt optIfOTSnSrcCurrentOutputPower;

                        public final OptIfOTSnSrcCurrentLowOutputPowerEnt optIfOTSnSrcCurrentLowOutputPower;

                        public final OptIfOTSnSrcCurrentHighOutputPowerEnt optIfOTSnSrcCurrentHighOutputPower;

                        public final OptIfOTSnSrcCurrentLowerOutputPowerThresholdEnt optIfOTSnSrcCurrentLowerOutputPowerThreshold;

                        public final OptIfOTSnSrcCurrentUpperOutputPowerThresholdEnt optIfOTSnSrcCurrentUpperOutputPowerThreshold;

                        public final OptIfOTSnSrcCurrentInputPowerEnt optIfOTSnSrcCurrentInputPower;

                        public final OptIfOTSnSrcCurrentLowInputPowerEnt optIfOTSnSrcCurrentLowInputPower;

                        public final OptIfOTSnSrcCurrentHighInputPowerEnt optIfOTSnSrcCurrentHighInputPower;

                        public final OptIfOTSnSrcCurrentLowerInputPowerThresholdEnt optIfOTSnSrcCurrentLowerInputPowerThreshold;

                        public final OptIfOTSnSrcCurrentUpperInputPowerThresholdEnt optIfOTSnSrcCurrentUpperInputPowerThreshold;

                        private OptIfOTSnSrcCurrentEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOTSnSrcCurrentEntry", "1.3.6.1.2.1.10.133.1.3.6.1", false, false, false, true);
                            this.optIfOTSnSrcCurrentSuspectedFlag = new OptIfOTSnSrcCurrentSuspectedFlagEnt(mib, this);
                            this.optIfOTSnSrcCurrentOutputPower = new OptIfOTSnSrcCurrentOutputPowerEnt(mib, this);
                            this.optIfOTSnSrcCurrentLowOutputPower = new OptIfOTSnSrcCurrentLowOutputPowerEnt(mib, this);
                            this.optIfOTSnSrcCurrentHighOutputPower = new OptIfOTSnSrcCurrentHighOutputPowerEnt(mib, this);
                            this.optIfOTSnSrcCurrentLowerOutputPowerThreshold = new OptIfOTSnSrcCurrentLowerOutputPowerThresholdEnt(mib, this);
                            this.optIfOTSnSrcCurrentUpperOutputPowerThreshold = new OptIfOTSnSrcCurrentUpperOutputPowerThresholdEnt(mib, this);
                            this.optIfOTSnSrcCurrentInputPower = new OptIfOTSnSrcCurrentInputPowerEnt(mib, this);
                            this.optIfOTSnSrcCurrentLowInputPower = new OptIfOTSnSrcCurrentLowInputPowerEnt(mib, this);
                            this.optIfOTSnSrcCurrentHighInputPower = new OptIfOTSnSrcCurrentHighInputPowerEnt(mib, this);
                            this.optIfOTSnSrcCurrentLowerInputPowerThreshold = new OptIfOTSnSrcCurrentLowerInputPowerThresholdEnt(mib, this);
                            this.optIfOTSnSrcCurrentUpperInputPowerThreshold = new OptIfOTSnSrcCurrentUpperInputPowerThresholdEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOTSnSrcCurrentSuspectedFlag,
                                this.optIfOTSnSrcCurrentOutputPower,
                                this.optIfOTSnSrcCurrentLowOutputPower,
                                this.optIfOTSnSrcCurrentHighOutputPower,
                                this.optIfOTSnSrcCurrentLowerOutputPowerThreshold,
                                this.optIfOTSnSrcCurrentUpperOutputPowerThreshold,
                                this.optIfOTSnSrcCurrentInputPower,
                                this.optIfOTSnSrcCurrentLowInputPower,
                                this.optIfOTSnSrcCurrentHighInputPower,
                                this.optIfOTSnSrcCurrentLowerInputPowerThreshold,
                                this.optIfOTSnSrcCurrentUpperInputPowerThreshold
                            };
                        }
                        public static final class OptIfOTSnSrcCurrentSuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcCurrentSuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcCurrentSuspectedFlag", "1.3.6.1.2.1.10.133.1.3.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcCurrentOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcCurrentOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcCurrentOutputPower", "1.3.6.1.2.1.10.133.1.3.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcCurrentLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcCurrentLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcCurrentLowOutputPower", "1.3.6.1.2.1.10.133.1.3.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcCurrentHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcCurrentHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcCurrentHighOutputPower", "1.3.6.1.2.1.10.133.1.3.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcCurrentLowerOutputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcCurrentLowerOutputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcCurrentLowerOutputPowerThreshold", "1.3.6.1.2.1.10.133.1.3.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcCurrentUpperOutputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcCurrentUpperOutputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcCurrentUpperOutputPowerThreshold", "1.3.6.1.2.1.10.133.1.3.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcCurrentInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcCurrentInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcCurrentInputPower", "1.3.6.1.2.1.10.133.1.3.6.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcCurrentLowInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcCurrentLowInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcCurrentLowInputPower", "1.3.6.1.2.1.10.133.1.3.6.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcCurrentHighInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcCurrentHighInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcCurrentHighInputPower", "1.3.6.1.2.1.10.133.1.3.6.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcCurrentLowerInputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcCurrentLowerInputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcCurrentLowerInputPowerThreshold", "1.3.6.1.2.1.10.133.1.3.6.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcCurrentUpperInputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcCurrentUpperInputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcCurrentUpperInputPowerThreshold", "1.3.6.1.2.1.10.133.1.3.6.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOTSnSrcIntervalTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOTSnSrcIntervalEntryEnt optIfOTSnSrcIntervalEntry;

                    private OptIfOTSnSrcIntervalTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnSrcIntervalTable", "1.3.6.1.2.1.10.133.1.3.7", false, true, false, false);
                        this.optIfOTSnSrcIntervalEntry = new OptIfOTSnSrcIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOTSnSrcIntervalEntry
                        };
                    }
                    public static final class OptIfOTSnSrcIntervalEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOTSnSrcIntervalNumberEnt optIfOTSnSrcIntervalNumber;

                        public final OptIfOTSnSrcIntervalSuspectedFlagEnt optIfOTSnSrcIntervalSuspectedFlag;

                        public final OptIfOTSnSrcIntervalLastOutputPowerEnt optIfOTSnSrcIntervalLastOutputPower;

                        public final OptIfOTSnSrcIntervalLowOutputPowerEnt optIfOTSnSrcIntervalLowOutputPower;

                        public final OptIfOTSnSrcIntervalHighOutputPowerEnt optIfOTSnSrcIntervalHighOutputPower;

                        public final OptIfOTSnSrcIntervalLastInputPowerEnt optIfOTSnSrcIntervalLastInputPower;

                        public final OptIfOTSnSrcIntervalLowInputPowerEnt optIfOTSnSrcIntervalLowInputPower;

                        public final OptIfOTSnSrcIntervalHighInputPowerEnt optIfOTSnSrcIntervalHighInputPower;

                        private OptIfOTSnSrcIntervalEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOTSnSrcIntervalEntry", "1.3.6.1.2.1.10.133.1.3.7.1", false, false, false, true);
                            this.optIfOTSnSrcIntervalNumber = new OptIfOTSnSrcIntervalNumberEnt(mib, this);
                            this.optIfOTSnSrcIntervalSuspectedFlag = new OptIfOTSnSrcIntervalSuspectedFlagEnt(mib, this);
                            this.optIfOTSnSrcIntervalLastOutputPower = new OptIfOTSnSrcIntervalLastOutputPowerEnt(mib, this);
                            this.optIfOTSnSrcIntervalLowOutputPower = new OptIfOTSnSrcIntervalLowOutputPowerEnt(mib, this);
                            this.optIfOTSnSrcIntervalHighOutputPower = new OptIfOTSnSrcIntervalHighOutputPowerEnt(mib, this);
                            this.optIfOTSnSrcIntervalLastInputPower = new OptIfOTSnSrcIntervalLastInputPowerEnt(mib, this);
                            this.optIfOTSnSrcIntervalLowInputPower = new OptIfOTSnSrcIntervalLowInputPowerEnt(mib, this);
                            this.optIfOTSnSrcIntervalHighInputPower = new OptIfOTSnSrcIntervalHighInputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOTSnSrcIntervalNumber,
                                this.optIfOTSnSrcIntervalSuspectedFlag,
                                this.optIfOTSnSrcIntervalLastOutputPower,
                                this.optIfOTSnSrcIntervalLowOutputPower,
                                this.optIfOTSnSrcIntervalHighOutputPower,
                                this.optIfOTSnSrcIntervalLastInputPower,
                                this.optIfOTSnSrcIntervalLowInputPower,
                                this.optIfOTSnSrcIntervalHighInputPower
                            };
                        }
                        public static final class OptIfOTSnSrcIntervalNumberEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcIntervalNumberEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcIntervalNumber", "1.3.6.1.2.1.10.133.1.3.7.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcIntervalSuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcIntervalSuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcIntervalSuspectedFlag", "1.3.6.1.2.1.10.133.1.3.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcIntervalLastOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcIntervalLastOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcIntervalLastOutputPower", "1.3.6.1.2.1.10.133.1.3.7.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcIntervalLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcIntervalLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcIntervalLowOutputPower", "1.3.6.1.2.1.10.133.1.3.7.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcIntervalHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcIntervalHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcIntervalHighOutputPower", "1.3.6.1.2.1.10.133.1.3.7.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcIntervalLastInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcIntervalLastInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcIntervalLastInputPower", "1.3.6.1.2.1.10.133.1.3.7.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcIntervalLowInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcIntervalLowInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcIntervalLowInputPower", "1.3.6.1.2.1.10.133.1.3.7.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcIntervalHighInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcIntervalHighInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcIntervalHighInputPower", "1.3.6.1.2.1.10.133.1.3.7.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOTSnSrcCurDayTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOTSnSrcCurDayEntryEnt optIfOTSnSrcCurDayEntry;

                    private OptIfOTSnSrcCurDayTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnSrcCurDayTable", "1.3.6.1.2.1.10.133.1.3.8", false, true, false, false);
                        this.optIfOTSnSrcCurDayEntry = new OptIfOTSnSrcCurDayEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOTSnSrcCurDayEntry
                        };
                    }
                    public static final class OptIfOTSnSrcCurDayEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOTSnSrcCurDaySuspectedFlagEnt optIfOTSnSrcCurDaySuspectedFlag;

                        public final OptIfOTSnSrcCurDayLowOutputPowerEnt optIfOTSnSrcCurDayLowOutputPower;

                        public final OptIfOTSnSrcCurDayHighOutputPowerEnt optIfOTSnSrcCurDayHighOutputPower;

                        public final OptIfOTSnSrcCurDayLowInputPowerEnt optIfOTSnSrcCurDayLowInputPower;

                        public final OptIfOTSnSrcCurDayHighInputPowerEnt optIfOTSnSrcCurDayHighInputPower;

                        private OptIfOTSnSrcCurDayEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOTSnSrcCurDayEntry", "1.3.6.1.2.1.10.133.1.3.8.1", false, false, false, true);
                            this.optIfOTSnSrcCurDaySuspectedFlag = new OptIfOTSnSrcCurDaySuspectedFlagEnt(mib, this);
                            this.optIfOTSnSrcCurDayLowOutputPower = new OptIfOTSnSrcCurDayLowOutputPowerEnt(mib, this);
                            this.optIfOTSnSrcCurDayHighOutputPower = new OptIfOTSnSrcCurDayHighOutputPowerEnt(mib, this);
                            this.optIfOTSnSrcCurDayLowInputPower = new OptIfOTSnSrcCurDayLowInputPowerEnt(mib, this);
                            this.optIfOTSnSrcCurDayHighInputPower = new OptIfOTSnSrcCurDayHighInputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOTSnSrcCurDaySuspectedFlag,
                                this.optIfOTSnSrcCurDayLowOutputPower,
                                this.optIfOTSnSrcCurDayHighOutputPower,
                                this.optIfOTSnSrcCurDayLowInputPower,
                                this.optIfOTSnSrcCurDayHighInputPower
                            };
                        }
                        public static final class OptIfOTSnSrcCurDaySuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcCurDaySuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcCurDaySuspectedFlag", "1.3.6.1.2.1.10.133.1.3.8.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcCurDayLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcCurDayLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcCurDayLowOutputPower", "1.3.6.1.2.1.10.133.1.3.8.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcCurDayHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcCurDayHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcCurDayHighOutputPower", "1.3.6.1.2.1.10.133.1.3.8.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcCurDayLowInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcCurDayLowInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcCurDayLowInputPower", "1.3.6.1.2.1.10.133.1.3.8.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcCurDayHighInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcCurDayHighInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcCurDayHighInputPower", "1.3.6.1.2.1.10.133.1.3.8.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOTSnSrcPrevDayTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOTSnSrcPrevDayEntryEnt optIfOTSnSrcPrevDayEntry;

                    private OptIfOTSnSrcPrevDayTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnSrcPrevDayTable", "1.3.6.1.2.1.10.133.1.3.9", false, true, false, false);
                        this.optIfOTSnSrcPrevDayEntry = new OptIfOTSnSrcPrevDayEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOTSnSrcPrevDayEntry
                        };
                    }
                    public static final class OptIfOTSnSrcPrevDayEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOTSnSrcPrevDaySuspectedFlagEnt optIfOTSnSrcPrevDaySuspectedFlag;

                        public final OptIfOTSnSrcPrevDayLastOutputPowerEnt optIfOTSnSrcPrevDayLastOutputPower;

                        public final OptIfOTSnSrcPrevDayLowOutputPowerEnt optIfOTSnSrcPrevDayLowOutputPower;

                        public final OptIfOTSnSrcPrevDayHighOutputPowerEnt optIfOTSnSrcPrevDayHighOutputPower;

                        public final OptIfOTSnSrcPrevDayLastInputPowerEnt optIfOTSnSrcPrevDayLastInputPower;

                        public final OptIfOTSnSrcPrevDayLowInputPowerEnt optIfOTSnSrcPrevDayLowInputPower;

                        public final OptIfOTSnSrcPrevDayHighInputPowerEnt optIfOTSnSrcPrevDayHighInputPower;

                        private OptIfOTSnSrcPrevDayEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOTSnSrcPrevDayEntry", "1.3.6.1.2.1.10.133.1.3.9.1", false, false, false, true);
                            this.optIfOTSnSrcPrevDaySuspectedFlag = new OptIfOTSnSrcPrevDaySuspectedFlagEnt(mib, this);
                            this.optIfOTSnSrcPrevDayLastOutputPower = new OptIfOTSnSrcPrevDayLastOutputPowerEnt(mib, this);
                            this.optIfOTSnSrcPrevDayLowOutputPower = new OptIfOTSnSrcPrevDayLowOutputPowerEnt(mib, this);
                            this.optIfOTSnSrcPrevDayHighOutputPower = new OptIfOTSnSrcPrevDayHighOutputPowerEnt(mib, this);
                            this.optIfOTSnSrcPrevDayLastInputPower = new OptIfOTSnSrcPrevDayLastInputPowerEnt(mib, this);
                            this.optIfOTSnSrcPrevDayLowInputPower = new OptIfOTSnSrcPrevDayLowInputPowerEnt(mib, this);
                            this.optIfOTSnSrcPrevDayHighInputPower = new OptIfOTSnSrcPrevDayHighInputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOTSnSrcPrevDaySuspectedFlag,
                                this.optIfOTSnSrcPrevDayLastOutputPower,
                                this.optIfOTSnSrcPrevDayLowOutputPower,
                                this.optIfOTSnSrcPrevDayHighOutputPower,
                                this.optIfOTSnSrcPrevDayLastInputPower,
                                this.optIfOTSnSrcPrevDayLowInputPower,
                                this.optIfOTSnSrcPrevDayHighInputPower
                            };
                        }
                        public static final class OptIfOTSnSrcPrevDaySuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcPrevDaySuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcPrevDaySuspectedFlag", "1.3.6.1.2.1.10.133.1.3.9.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcPrevDayLastOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcPrevDayLastOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcPrevDayLastOutputPower", "1.3.6.1.2.1.10.133.1.3.9.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcPrevDayLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcPrevDayLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcPrevDayLowOutputPower", "1.3.6.1.2.1.10.133.1.3.9.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcPrevDayHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcPrevDayHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcPrevDayHighOutputPower", "1.3.6.1.2.1.10.133.1.3.9.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcPrevDayLastInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcPrevDayLastInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcPrevDayLastInputPower", "1.3.6.1.2.1.10.133.1.3.9.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcPrevDayLowInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcPrevDayLowInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcPrevDayLowInputPower", "1.3.6.1.2.1.10.133.1.3.9.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTSnSrcPrevDayHighInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTSnSrcPrevDayHighInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTSnSrcPrevDayHighInputPower", "1.3.6.1.2.1.10.133.1.3.9.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class OptIfOMSnEnt extends MIBEntry<OPTIFMIBDef>
            {
                /** the optIfOMSn groupThis group handles the configuration and performance monitoringinformation for OMS layers.
OMSn config table*/
                public final OptIfOMSnConfigTableEnt optIfOMSnConfigTable;

                /** OMSn sink current tableContains data for the current 15-minute performance monitoringinterval.*/
                public final OptIfOMSnSinkCurrentTableEnt optIfOMSnSinkCurrentTable;

                /** OMSn sink interval tableContains data for previous 15-minute performance monitoringintervals.*/
                public final OptIfOMSnSinkIntervalTableEnt optIfOMSnSinkIntervalTable;

                /** OMSn sink current day tableContains data for the current 24-hour performancemonitoring interval.*/
                public final OptIfOMSnSinkCurDayTableEnt optIfOMSnSinkCurDayTable;

                /** OMSn sink previous day tableContains data for the previous 24-hour performancemonitoring interval.*/
                public final OptIfOMSnSinkPrevDayTableEnt optIfOMSnSinkPrevDayTable;

                /** OMSn source current tableContains data for the current 15-minute performance monitoringinterval.*/
                public final OptIfOMSnSrcCurrentTableEnt optIfOMSnSrcCurrentTable;

                /** OMSn source interval tableContains data for previous 15-minute performance monitoringintervals.*/
                public final OptIfOMSnSrcIntervalTableEnt optIfOMSnSrcIntervalTable;

                /** OMSn source current day tableContains data for the current 24-hour performancemonitoring interval.*/
                public final OptIfOMSnSrcCurDayTableEnt optIfOMSnSrcCurDayTable;

                /** OMSn source previous day tableContains data for the previous 24-hour performancemonitoring interval.*/
                public final OptIfOMSnSrcPrevDayTableEnt optIfOMSnSrcPrevDayTable;

                private OptIfOMSnEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                {
                    super(mib, parent, "optIfOMSn", "1.3.6.1.2.1.10.133.1.4", false, false, false, false);
                    this.optIfOMSnConfigTable = new OptIfOMSnConfigTableEnt(mib, this);
                    this.optIfOMSnSinkCurrentTable = new OptIfOMSnSinkCurrentTableEnt(mib, this);
                    this.optIfOMSnSinkIntervalTable = new OptIfOMSnSinkIntervalTableEnt(mib, this);
                    this.optIfOMSnSinkCurDayTable = new OptIfOMSnSinkCurDayTableEnt(mib, this);
                    this.optIfOMSnSinkPrevDayTable = new OptIfOMSnSinkPrevDayTableEnt(mib, this);
                    this.optIfOMSnSrcCurrentTable = new OptIfOMSnSrcCurrentTableEnt(mib, this);
                    this.optIfOMSnSrcIntervalTable = new OptIfOMSnSrcIntervalTableEnt(mib, this);
                    this.optIfOMSnSrcCurDayTable = new OptIfOMSnSrcCurDayTableEnt(mib, this);
                    this.optIfOMSnSrcPrevDayTable = new OptIfOMSnSrcPrevDayTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.optIfOMSnConfigTable,
                        this.optIfOMSnSinkCurrentTable,
                        this.optIfOMSnSinkIntervalTable,
                        this.optIfOMSnSinkCurDayTable,
                        this.optIfOMSnSinkPrevDayTable,
                        this.optIfOMSnSrcCurrentTable,
                        this.optIfOMSnSrcIntervalTable,
                        this.optIfOMSnSrcCurDayTable,
                        this.optIfOMSnSrcPrevDayTable
                    };
                }
                public static final class OptIfOMSnConfigTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOMSnConfigEntryEnt optIfOMSnConfigEntry;

                    private OptIfOMSnConfigTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOMSnConfigTable", "1.3.6.1.2.1.10.133.1.4.1", false, true, false, false);
                        this.optIfOMSnConfigEntry = new OptIfOMSnConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOMSnConfigEntry
                        };
                    }
                    public static final class OptIfOMSnConfigEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOMSnDirectionalityEnt optIfOMSnDirectionality;

                        public final OptIfOMSnCurrentStatusEnt optIfOMSnCurrentStatus;

                        private OptIfOMSnConfigEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOMSnConfigEntry", "1.3.6.1.2.1.10.133.1.4.1.1", false, false, false, true);
                            this.optIfOMSnDirectionality = new OptIfOMSnDirectionalityEnt(mib, this);
                            this.optIfOMSnCurrentStatus = new OptIfOMSnCurrentStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOMSnDirectionality,
                                this.optIfOMSnCurrentStatus
                            };
                        }
                        public static final class OptIfOMSnDirectionalityEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnDirectionalityEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnDirectionality", "1.3.6.1.2.1.10.133.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnCurrentStatusEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnCurrentStatusEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnCurrentStatus", "1.3.6.1.2.1.10.133.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOMSnSinkCurrentTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOMSnSinkCurrentEntryEnt optIfOMSnSinkCurrentEntry;

                    private OptIfOMSnSinkCurrentTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOMSnSinkCurrentTable", "1.3.6.1.2.1.10.133.1.4.2", false, true, false, false);
                        this.optIfOMSnSinkCurrentEntry = new OptIfOMSnSinkCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOMSnSinkCurrentEntry
                        };
                    }
                    public static final class OptIfOMSnSinkCurrentEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOMSnSinkCurrentSuspectedFlagEnt optIfOMSnSinkCurrentSuspectedFlag;

                        public final OptIfOMSnSinkCurrentAggregatedInputPowerEnt optIfOMSnSinkCurrentAggregatedInputPower;

                        public final OptIfOMSnSinkCurrentLowAggregatedInputPowerEnt optIfOMSnSinkCurrentLowAggregatedInputPower;

                        public final OptIfOMSnSinkCurrentHighAggregatedInputPowerEnt optIfOMSnSinkCurrentHighAggregatedInputPower;

                        public final OptIfOMSnSinkCurrentLowerInputPowerThresholdEnt optIfOMSnSinkCurrentLowerInputPowerThreshold;

                        public final OptIfOMSnSinkCurrentUpperInputPowerThresholdEnt optIfOMSnSinkCurrentUpperInputPowerThreshold;

                        public final OptIfOMSnSinkCurrentOutputPowerEnt optIfOMSnSinkCurrentOutputPower;

                        public final OptIfOMSnSinkCurrentLowOutputPowerEnt optIfOMSnSinkCurrentLowOutputPower;

                        public final OptIfOMSnSinkCurrentHighOutputPowerEnt optIfOMSnSinkCurrentHighOutputPower;

                        public final OptIfOMSnSinkCurrentLowerOutputPowerThresholdEnt optIfOMSnSinkCurrentLowerOutputPowerThreshold;

                        public final OptIfOMSnSinkCurrentUpperOutputPowerThresholdEnt optIfOMSnSinkCurrentUpperOutputPowerThreshold;

                        private OptIfOMSnSinkCurrentEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOMSnSinkCurrentEntry", "1.3.6.1.2.1.10.133.1.4.2.1", false, false, false, true);
                            this.optIfOMSnSinkCurrentSuspectedFlag = new OptIfOMSnSinkCurrentSuspectedFlagEnt(mib, this);
                            this.optIfOMSnSinkCurrentAggregatedInputPower = new OptIfOMSnSinkCurrentAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSinkCurrentLowAggregatedInputPower = new OptIfOMSnSinkCurrentLowAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSinkCurrentHighAggregatedInputPower = new OptIfOMSnSinkCurrentHighAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSinkCurrentLowerInputPowerThreshold = new OptIfOMSnSinkCurrentLowerInputPowerThresholdEnt(mib, this);
                            this.optIfOMSnSinkCurrentUpperInputPowerThreshold = new OptIfOMSnSinkCurrentUpperInputPowerThresholdEnt(mib, this);
                            this.optIfOMSnSinkCurrentOutputPower = new OptIfOMSnSinkCurrentOutputPowerEnt(mib, this);
                            this.optIfOMSnSinkCurrentLowOutputPower = new OptIfOMSnSinkCurrentLowOutputPowerEnt(mib, this);
                            this.optIfOMSnSinkCurrentHighOutputPower = new OptIfOMSnSinkCurrentHighOutputPowerEnt(mib, this);
                            this.optIfOMSnSinkCurrentLowerOutputPowerThreshold = new OptIfOMSnSinkCurrentLowerOutputPowerThresholdEnt(mib, this);
                            this.optIfOMSnSinkCurrentUpperOutputPowerThreshold = new OptIfOMSnSinkCurrentUpperOutputPowerThresholdEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOMSnSinkCurrentSuspectedFlag,
                                this.optIfOMSnSinkCurrentAggregatedInputPower,
                                this.optIfOMSnSinkCurrentLowAggregatedInputPower,
                                this.optIfOMSnSinkCurrentHighAggregatedInputPower,
                                this.optIfOMSnSinkCurrentLowerInputPowerThreshold,
                                this.optIfOMSnSinkCurrentUpperInputPowerThreshold,
                                this.optIfOMSnSinkCurrentOutputPower,
                                this.optIfOMSnSinkCurrentLowOutputPower,
                                this.optIfOMSnSinkCurrentHighOutputPower,
                                this.optIfOMSnSinkCurrentLowerOutputPowerThreshold,
                                this.optIfOMSnSinkCurrentUpperOutputPowerThreshold
                            };
                        }
                        public static final class OptIfOMSnSinkCurrentSuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkCurrentSuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkCurrentSuspectedFlag", "1.3.6.1.2.1.10.133.1.4.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkCurrentAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkCurrentAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkCurrentAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkCurrentLowAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkCurrentLowAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkCurrentLowAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkCurrentHighAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkCurrentHighAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkCurrentHighAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkCurrentLowerInputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkCurrentLowerInputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkCurrentLowerInputPowerThreshold", "1.3.6.1.2.1.10.133.1.4.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkCurrentUpperInputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkCurrentUpperInputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkCurrentUpperInputPowerThreshold", "1.3.6.1.2.1.10.133.1.4.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkCurrentOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkCurrentOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkCurrentOutputPower", "1.3.6.1.2.1.10.133.1.4.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkCurrentLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkCurrentLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkCurrentLowOutputPower", "1.3.6.1.2.1.10.133.1.4.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkCurrentHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkCurrentHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkCurrentHighOutputPower", "1.3.6.1.2.1.10.133.1.4.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkCurrentLowerOutputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkCurrentLowerOutputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkCurrentLowerOutputPowerThreshold", "1.3.6.1.2.1.10.133.1.4.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkCurrentUpperOutputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkCurrentUpperOutputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkCurrentUpperOutputPowerThreshold", "1.3.6.1.2.1.10.133.1.4.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOMSnSinkIntervalTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOMSnSinkIntervalEntryEnt optIfOMSnSinkIntervalEntry;

                    private OptIfOMSnSinkIntervalTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOMSnSinkIntervalTable", "1.3.6.1.2.1.10.133.1.4.3", false, true, false, false);
                        this.optIfOMSnSinkIntervalEntry = new OptIfOMSnSinkIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOMSnSinkIntervalEntry
                        };
                    }
                    public static final class OptIfOMSnSinkIntervalEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOMSnSinkIntervalNumberEnt optIfOMSnSinkIntervalNumber;

                        public final OptIfOMSnSinkIntervalSuspectedFlagEnt optIfOMSnSinkIntervalSuspectedFlag;

                        public final OptIfOMSnSinkIntervalLastAggregatedInputPowerEnt optIfOMSnSinkIntervalLastAggregatedInputPower;

                        public final OptIfOMSnSinkIntervalLowAggregatedInputPowerEnt optIfOMSnSinkIntervalLowAggregatedInputPower;

                        public final OptIfOMSnSinkIntervalHighAggregatedInputPowerEnt optIfOMSnSinkIntervalHighAggregatedInputPower;

                        public final OptIfOMSnSinkIntervalLastOutputPowerEnt optIfOMSnSinkIntervalLastOutputPower;

                        public final OptIfOMSnSinkIntervalLowOutputPowerEnt optIfOMSnSinkIntervalLowOutputPower;

                        public final OptIfOMSnSinkIntervalHighOutputPowerEnt optIfOMSnSinkIntervalHighOutputPower;

                        private OptIfOMSnSinkIntervalEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOMSnSinkIntervalEntry", "1.3.6.1.2.1.10.133.1.4.3.1", false, false, false, true);
                            this.optIfOMSnSinkIntervalNumber = new OptIfOMSnSinkIntervalNumberEnt(mib, this);
                            this.optIfOMSnSinkIntervalSuspectedFlag = new OptIfOMSnSinkIntervalSuspectedFlagEnt(mib, this);
                            this.optIfOMSnSinkIntervalLastAggregatedInputPower = new OptIfOMSnSinkIntervalLastAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSinkIntervalLowAggregatedInputPower = new OptIfOMSnSinkIntervalLowAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSinkIntervalHighAggregatedInputPower = new OptIfOMSnSinkIntervalHighAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSinkIntervalLastOutputPower = new OptIfOMSnSinkIntervalLastOutputPowerEnt(mib, this);
                            this.optIfOMSnSinkIntervalLowOutputPower = new OptIfOMSnSinkIntervalLowOutputPowerEnt(mib, this);
                            this.optIfOMSnSinkIntervalHighOutputPower = new OptIfOMSnSinkIntervalHighOutputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOMSnSinkIntervalNumber,
                                this.optIfOMSnSinkIntervalSuspectedFlag,
                                this.optIfOMSnSinkIntervalLastAggregatedInputPower,
                                this.optIfOMSnSinkIntervalLowAggregatedInputPower,
                                this.optIfOMSnSinkIntervalHighAggregatedInputPower,
                                this.optIfOMSnSinkIntervalLastOutputPower,
                                this.optIfOMSnSinkIntervalLowOutputPower,
                                this.optIfOMSnSinkIntervalHighOutputPower
                            };
                        }
                        public static final class OptIfOMSnSinkIntervalNumberEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkIntervalNumberEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkIntervalNumber", "1.3.6.1.2.1.10.133.1.4.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkIntervalSuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkIntervalSuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkIntervalSuspectedFlag", "1.3.6.1.2.1.10.133.1.4.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkIntervalLastAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkIntervalLastAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkIntervalLastAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkIntervalLowAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkIntervalLowAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkIntervalLowAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkIntervalHighAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkIntervalHighAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkIntervalHighAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkIntervalLastOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkIntervalLastOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkIntervalLastOutputPower", "1.3.6.1.2.1.10.133.1.4.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkIntervalLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkIntervalLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkIntervalLowOutputPower", "1.3.6.1.2.1.10.133.1.4.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkIntervalHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkIntervalHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkIntervalHighOutputPower", "1.3.6.1.2.1.10.133.1.4.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOMSnSinkCurDayTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOMSnSinkCurDayEntryEnt optIfOMSnSinkCurDayEntry;

                    private OptIfOMSnSinkCurDayTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOMSnSinkCurDayTable", "1.3.6.1.2.1.10.133.1.4.4", false, true, false, false);
                        this.optIfOMSnSinkCurDayEntry = new OptIfOMSnSinkCurDayEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOMSnSinkCurDayEntry
                        };
                    }
                    public static final class OptIfOMSnSinkCurDayEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOMSnSinkCurDaySuspectedFlagEnt optIfOMSnSinkCurDaySuspectedFlag;

                        public final OptIfOMSnSinkCurDayLowAggregatedInputPowerEnt optIfOMSnSinkCurDayLowAggregatedInputPower;

                        public final OptIfOMSnSinkCurDayHighAggregatedInputPowerEnt optIfOMSnSinkCurDayHighAggregatedInputPower;

                        public final OptIfOMSnSinkCurDayLowOutputPowerEnt optIfOMSnSinkCurDayLowOutputPower;

                        public final OptIfOMSnSinkCurDayHighOutputPowerEnt optIfOMSnSinkCurDayHighOutputPower;

                        private OptIfOMSnSinkCurDayEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOMSnSinkCurDayEntry", "1.3.6.1.2.1.10.133.1.4.4.1", false, false, false, true);
                            this.optIfOMSnSinkCurDaySuspectedFlag = new OptIfOMSnSinkCurDaySuspectedFlagEnt(mib, this);
                            this.optIfOMSnSinkCurDayLowAggregatedInputPower = new OptIfOMSnSinkCurDayLowAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSinkCurDayHighAggregatedInputPower = new OptIfOMSnSinkCurDayHighAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSinkCurDayLowOutputPower = new OptIfOMSnSinkCurDayLowOutputPowerEnt(mib, this);
                            this.optIfOMSnSinkCurDayHighOutputPower = new OptIfOMSnSinkCurDayHighOutputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOMSnSinkCurDaySuspectedFlag,
                                this.optIfOMSnSinkCurDayLowAggregatedInputPower,
                                this.optIfOMSnSinkCurDayHighAggregatedInputPower,
                                this.optIfOMSnSinkCurDayLowOutputPower,
                                this.optIfOMSnSinkCurDayHighOutputPower
                            };
                        }
                        public static final class OptIfOMSnSinkCurDaySuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkCurDaySuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkCurDaySuspectedFlag", "1.3.6.1.2.1.10.133.1.4.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkCurDayLowAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkCurDayLowAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkCurDayLowAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkCurDayHighAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkCurDayHighAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkCurDayHighAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkCurDayLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkCurDayLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkCurDayLowOutputPower", "1.3.6.1.2.1.10.133.1.4.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkCurDayHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkCurDayHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkCurDayHighOutputPower", "1.3.6.1.2.1.10.133.1.4.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOMSnSinkPrevDayTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOMSnSinkPrevDayEntryEnt optIfOMSnSinkPrevDayEntry;

                    private OptIfOMSnSinkPrevDayTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOMSnSinkPrevDayTable", "1.3.6.1.2.1.10.133.1.4.5", false, true, false, false);
                        this.optIfOMSnSinkPrevDayEntry = new OptIfOMSnSinkPrevDayEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOMSnSinkPrevDayEntry
                        };
                    }
                    public static final class OptIfOMSnSinkPrevDayEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOMSnSinkPrevDaySuspectedFlagEnt optIfOMSnSinkPrevDaySuspectedFlag;

                        public final OptIfOMSnSinkPrevDayLastAggregatedInputPowerEnt optIfOMSnSinkPrevDayLastAggregatedInputPower;

                        public final OptIfOMSnSinkPrevDayLowAggregatedInputPowerEnt optIfOMSnSinkPrevDayLowAggregatedInputPower;

                        public final OptIfOMSnSinkPrevDayHighAggregatedInputPowerEnt optIfOMSnSinkPrevDayHighAggregatedInputPower;

                        public final OptIfOMSnSinkPrevDayLastOutputPowerEnt optIfOMSnSinkPrevDayLastOutputPower;

                        public final OptIfOMSnSinkPrevDayLowOutputPowerEnt optIfOMSnSinkPrevDayLowOutputPower;

                        public final OptIfOMSnSinkPrevDayHighOutputPowerEnt optIfOMSnSinkPrevDayHighOutputPower;

                        private OptIfOMSnSinkPrevDayEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOMSnSinkPrevDayEntry", "1.3.6.1.2.1.10.133.1.4.5.1", false, false, false, true);
                            this.optIfOMSnSinkPrevDaySuspectedFlag = new OptIfOMSnSinkPrevDaySuspectedFlagEnt(mib, this);
                            this.optIfOMSnSinkPrevDayLastAggregatedInputPower = new OptIfOMSnSinkPrevDayLastAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSinkPrevDayLowAggregatedInputPower = new OptIfOMSnSinkPrevDayLowAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSinkPrevDayHighAggregatedInputPower = new OptIfOMSnSinkPrevDayHighAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSinkPrevDayLastOutputPower = new OptIfOMSnSinkPrevDayLastOutputPowerEnt(mib, this);
                            this.optIfOMSnSinkPrevDayLowOutputPower = new OptIfOMSnSinkPrevDayLowOutputPowerEnt(mib, this);
                            this.optIfOMSnSinkPrevDayHighOutputPower = new OptIfOMSnSinkPrevDayHighOutputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOMSnSinkPrevDaySuspectedFlag,
                                this.optIfOMSnSinkPrevDayLastAggregatedInputPower,
                                this.optIfOMSnSinkPrevDayLowAggregatedInputPower,
                                this.optIfOMSnSinkPrevDayHighAggregatedInputPower,
                                this.optIfOMSnSinkPrevDayLastOutputPower,
                                this.optIfOMSnSinkPrevDayLowOutputPower,
                                this.optIfOMSnSinkPrevDayHighOutputPower
                            };
                        }
                        public static final class OptIfOMSnSinkPrevDaySuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkPrevDaySuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkPrevDaySuspectedFlag", "1.3.6.1.2.1.10.133.1.4.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkPrevDayLastAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkPrevDayLastAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkPrevDayLastAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkPrevDayLowAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkPrevDayLowAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkPrevDayLowAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkPrevDayHighAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkPrevDayHighAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkPrevDayHighAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkPrevDayLastOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkPrevDayLastOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkPrevDayLastOutputPower", "1.3.6.1.2.1.10.133.1.4.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkPrevDayLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkPrevDayLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkPrevDayLowOutputPower", "1.3.6.1.2.1.10.133.1.4.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSinkPrevDayHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSinkPrevDayHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSinkPrevDayHighOutputPower", "1.3.6.1.2.1.10.133.1.4.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOMSnSrcCurrentTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOMSnSrcCurrentEntryEnt optIfOMSnSrcCurrentEntry;

                    private OptIfOMSnSrcCurrentTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOMSnSrcCurrentTable", "1.3.6.1.2.1.10.133.1.4.6", false, true, false, false);
                        this.optIfOMSnSrcCurrentEntry = new OptIfOMSnSrcCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOMSnSrcCurrentEntry
                        };
                    }
                    public static final class OptIfOMSnSrcCurrentEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOMSnSrcCurrentSuspectedFlagEnt optIfOMSnSrcCurrentSuspectedFlag;

                        public final OptIfOMSnSrcCurrentOutputPowerEnt optIfOMSnSrcCurrentOutputPower;

                        public final OptIfOMSnSrcCurrentLowOutputPowerEnt optIfOMSnSrcCurrentLowOutputPower;

                        public final OptIfOMSnSrcCurrentHighOutputPowerEnt optIfOMSnSrcCurrentHighOutputPower;

                        public final OptIfOMSnSrcCurrentLowerOutputPowerThresholdEnt optIfOMSnSrcCurrentLowerOutputPowerThreshold;

                        public final OptIfOMSnSrcCurrentUpperOutputPowerThresholdEnt optIfOMSnSrcCurrentUpperOutputPowerThreshold;

                        public final OptIfOMSnSrcCurrentAggregatedInputPowerEnt optIfOMSnSrcCurrentAggregatedInputPower;

                        public final OptIfOMSnSrcCurrentLowAggregatedInputPowerEnt optIfOMSnSrcCurrentLowAggregatedInputPower;

                        public final OptIfOMSnSrcCurrentHighAggregatedInputPowerEnt optIfOMSnSrcCurrentHighAggregatedInputPower;

                        public final OptIfOMSnSrcCurrentLowerInputPowerThresholdEnt optIfOMSnSrcCurrentLowerInputPowerThreshold;

                        public final OptIfOMSnSrcCurrentUpperInputPowerThresholdEnt optIfOMSnSrcCurrentUpperInputPowerThreshold;

                        private OptIfOMSnSrcCurrentEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOMSnSrcCurrentEntry", "1.3.6.1.2.1.10.133.1.4.6.1", false, false, false, true);
                            this.optIfOMSnSrcCurrentSuspectedFlag = new OptIfOMSnSrcCurrentSuspectedFlagEnt(mib, this);
                            this.optIfOMSnSrcCurrentOutputPower = new OptIfOMSnSrcCurrentOutputPowerEnt(mib, this);
                            this.optIfOMSnSrcCurrentLowOutputPower = new OptIfOMSnSrcCurrentLowOutputPowerEnt(mib, this);
                            this.optIfOMSnSrcCurrentHighOutputPower = new OptIfOMSnSrcCurrentHighOutputPowerEnt(mib, this);
                            this.optIfOMSnSrcCurrentLowerOutputPowerThreshold = new OptIfOMSnSrcCurrentLowerOutputPowerThresholdEnt(mib, this);
                            this.optIfOMSnSrcCurrentUpperOutputPowerThreshold = new OptIfOMSnSrcCurrentUpperOutputPowerThresholdEnt(mib, this);
                            this.optIfOMSnSrcCurrentAggregatedInputPower = new OptIfOMSnSrcCurrentAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSrcCurrentLowAggregatedInputPower = new OptIfOMSnSrcCurrentLowAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSrcCurrentHighAggregatedInputPower = new OptIfOMSnSrcCurrentHighAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSrcCurrentLowerInputPowerThreshold = new OptIfOMSnSrcCurrentLowerInputPowerThresholdEnt(mib, this);
                            this.optIfOMSnSrcCurrentUpperInputPowerThreshold = new OptIfOMSnSrcCurrentUpperInputPowerThresholdEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOMSnSrcCurrentSuspectedFlag,
                                this.optIfOMSnSrcCurrentOutputPower,
                                this.optIfOMSnSrcCurrentLowOutputPower,
                                this.optIfOMSnSrcCurrentHighOutputPower,
                                this.optIfOMSnSrcCurrentLowerOutputPowerThreshold,
                                this.optIfOMSnSrcCurrentUpperOutputPowerThreshold,
                                this.optIfOMSnSrcCurrentAggregatedInputPower,
                                this.optIfOMSnSrcCurrentLowAggregatedInputPower,
                                this.optIfOMSnSrcCurrentHighAggregatedInputPower,
                                this.optIfOMSnSrcCurrentLowerInputPowerThreshold,
                                this.optIfOMSnSrcCurrentUpperInputPowerThreshold
                            };
                        }
                        public static final class OptIfOMSnSrcCurrentSuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcCurrentSuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcCurrentSuspectedFlag", "1.3.6.1.2.1.10.133.1.4.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcCurrentOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcCurrentOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcCurrentOutputPower", "1.3.6.1.2.1.10.133.1.4.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcCurrentLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcCurrentLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcCurrentLowOutputPower", "1.3.6.1.2.1.10.133.1.4.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcCurrentHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcCurrentHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcCurrentHighOutputPower", "1.3.6.1.2.1.10.133.1.4.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcCurrentLowerOutputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcCurrentLowerOutputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcCurrentLowerOutputPowerThreshold", "1.3.6.1.2.1.10.133.1.4.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcCurrentUpperOutputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcCurrentUpperOutputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcCurrentUpperOutputPowerThreshold", "1.3.6.1.2.1.10.133.1.4.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcCurrentAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcCurrentAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcCurrentAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.6.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcCurrentLowAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcCurrentLowAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcCurrentLowAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.6.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcCurrentHighAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcCurrentHighAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcCurrentHighAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.6.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcCurrentLowerInputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcCurrentLowerInputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcCurrentLowerInputPowerThreshold", "1.3.6.1.2.1.10.133.1.4.6.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcCurrentUpperInputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcCurrentUpperInputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcCurrentUpperInputPowerThreshold", "1.3.6.1.2.1.10.133.1.4.6.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOMSnSrcIntervalTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOMSnSrcIntervalEntryEnt optIfOMSnSrcIntervalEntry;

                    private OptIfOMSnSrcIntervalTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOMSnSrcIntervalTable", "1.3.6.1.2.1.10.133.1.4.7", false, true, false, false);
                        this.optIfOMSnSrcIntervalEntry = new OptIfOMSnSrcIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOMSnSrcIntervalEntry
                        };
                    }
                    public static final class OptIfOMSnSrcIntervalEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOMSnSrcIntervalNumberEnt optIfOMSnSrcIntervalNumber;

                        public final OptIfOMSnSrcIntervalSuspectedFlagEnt optIfOMSnSrcIntervalSuspectedFlag;

                        public final OptIfOMSnSrcIntervalLastOutputPowerEnt optIfOMSnSrcIntervalLastOutputPower;

                        public final OptIfOMSnSrcIntervalLowOutputPowerEnt optIfOMSnSrcIntervalLowOutputPower;

                        public final OptIfOMSnSrcIntervalHighOutputPowerEnt optIfOMSnSrcIntervalHighOutputPower;

                        public final OptIfOMSnSrcIntervalLastAggregatedInputPowerEnt optIfOMSnSrcIntervalLastAggregatedInputPower;

                        public final OptIfOMSnSrcIntervalLowAggregatedInputPowerEnt optIfOMSnSrcIntervalLowAggregatedInputPower;

                        public final OptIfOMSnSrcIntervalHighAggregatedInputPowerEnt optIfOMSnSrcIntervalHighAggregatedInputPower;

                        private OptIfOMSnSrcIntervalEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOMSnSrcIntervalEntry", "1.3.6.1.2.1.10.133.1.4.7.1", false, false, false, true);
                            this.optIfOMSnSrcIntervalNumber = new OptIfOMSnSrcIntervalNumberEnt(mib, this);
                            this.optIfOMSnSrcIntervalSuspectedFlag = new OptIfOMSnSrcIntervalSuspectedFlagEnt(mib, this);
                            this.optIfOMSnSrcIntervalLastOutputPower = new OptIfOMSnSrcIntervalLastOutputPowerEnt(mib, this);
                            this.optIfOMSnSrcIntervalLowOutputPower = new OptIfOMSnSrcIntervalLowOutputPowerEnt(mib, this);
                            this.optIfOMSnSrcIntervalHighOutputPower = new OptIfOMSnSrcIntervalHighOutputPowerEnt(mib, this);
                            this.optIfOMSnSrcIntervalLastAggregatedInputPower = new OptIfOMSnSrcIntervalLastAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSrcIntervalLowAggregatedInputPower = new OptIfOMSnSrcIntervalLowAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSrcIntervalHighAggregatedInputPower = new OptIfOMSnSrcIntervalHighAggregatedInputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOMSnSrcIntervalNumber,
                                this.optIfOMSnSrcIntervalSuspectedFlag,
                                this.optIfOMSnSrcIntervalLastOutputPower,
                                this.optIfOMSnSrcIntervalLowOutputPower,
                                this.optIfOMSnSrcIntervalHighOutputPower,
                                this.optIfOMSnSrcIntervalLastAggregatedInputPower,
                                this.optIfOMSnSrcIntervalLowAggregatedInputPower,
                                this.optIfOMSnSrcIntervalHighAggregatedInputPower
                            };
                        }
                        public static final class OptIfOMSnSrcIntervalNumberEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcIntervalNumberEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcIntervalNumber", "1.3.6.1.2.1.10.133.1.4.7.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcIntervalSuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcIntervalSuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcIntervalSuspectedFlag", "1.3.6.1.2.1.10.133.1.4.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcIntervalLastOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcIntervalLastOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcIntervalLastOutputPower", "1.3.6.1.2.1.10.133.1.4.7.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcIntervalLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcIntervalLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcIntervalLowOutputPower", "1.3.6.1.2.1.10.133.1.4.7.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcIntervalHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcIntervalHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcIntervalHighOutputPower", "1.3.6.1.2.1.10.133.1.4.7.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcIntervalLastAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcIntervalLastAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcIntervalLastAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.7.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcIntervalLowAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcIntervalLowAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcIntervalLowAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.7.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcIntervalHighAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcIntervalHighAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcIntervalHighAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.7.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOMSnSrcCurDayTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOMSnSrcCurDayEntryEnt optIfOMSnSrcCurDayEntry;

                    private OptIfOMSnSrcCurDayTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOMSnSrcCurDayTable", "1.3.6.1.2.1.10.133.1.4.8", false, true, false, false);
                        this.optIfOMSnSrcCurDayEntry = new OptIfOMSnSrcCurDayEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOMSnSrcCurDayEntry
                        };
                    }
                    public static final class OptIfOMSnSrcCurDayEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOMSnSrcCurDaySuspectedFlagEnt optIfOMSnSrcCurDaySuspectedFlag;

                        public final OptIfOMSnSrcCurDayLowOutputPowerEnt optIfOMSnSrcCurDayLowOutputPower;

                        public final OptIfOMSnSrcCurDayHighOutputPowerEnt optIfOMSnSrcCurDayHighOutputPower;

                        public final OptIfOMSnSrcCurDayLowAggregatedInputPowerEnt optIfOMSnSrcCurDayLowAggregatedInputPower;

                        public final OptIfOMSnSrcCurDayHighAggregatedInputPowerEnt optIfOMSnSrcCurDayHighAggregatedInputPower;

                        private OptIfOMSnSrcCurDayEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOMSnSrcCurDayEntry", "1.3.6.1.2.1.10.133.1.4.8.1", false, false, false, true);
                            this.optIfOMSnSrcCurDaySuspectedFlag = new OptIfOMSnSrcCurDaySuspectedFlagEnt(mib, this);
                            this.optIfOMSnSrcCurDayLowOutputPower = new OptIfOMSnSrcCurDayLowOutputPowerEnt(mib, this);
                            this.optIfOMSnSrcCurDayHighOutputPower = new OptIfOMSnSrcCurDayHighOutputPowerEnt(mib, this);
                            this.optIfOMSnSrcCurDayLowAggregatedInputPower = new OptIfOMSnSrcCurDayLowAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSrcCurDayHighAggregatedInputPower = new OptIfOMSnSrcCurDayHighAggregatedInputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOMSnSrcCurDaySuspectedFlag,
                                this.optIfOMSnSrcCurDayLowOutputPower,
                                this.optIfOMSnSrcCurDayHighOutputPower,
                                this.optIfOMSnSrcCurDayLowAggregatedInputPower,
                                this.optIfOMSnSrcCurDayHighAggregatedInputPower
                            };
                        }
                        public static final class OptIfOMSnSrcCurDaySuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcCurDaySuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcCurDaySuspectedFlag", "1.3.6.1.2.1.10.133.1.4.8.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcCurDayLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcCurDayLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcCurDayLowOutputPower", "1.3.6.1.2.1.10.133.1.4.8.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcCurDayHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcCurDayHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcCurDayHighOutputPower", "1.3.6.1.2.1.10.133.1.4.8.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcCurDayLowAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcCurDayLowAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcCurDayLowAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.8.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcCurDayHighAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcCurDayHighAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcCurDayHighAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.8.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOMSnSrcPrevDayTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOMSnSrcPrevDayEntryEnt optIfOMSnSrcPrevDayEntry;

                    private OptIfOMSnSrcPrevDayTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOMSnSrcPrevDayTable", "1.3.6.1.2.1.10.133.1.4.9", false, true, false, false);
                        this.optIfOMSnSrcPrevDayEntry = new OptIfOMSnSrcPrevDayEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOMSnSrcPrevDayEntry
                        };
                    }
                    public static final class OptIfOMSnSrcPrevDayEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOMSnSrcPrevDaySuspectedFlagEnt optIfOMSnSrcPrevDaySuspectedFlag;

                        public final OptIfOMSnSrcPrevDayLastOutputPowerEnt optIfOMSnSrcPrevDayLastOutputPower;

                        public final OptIfOMSnSrcPrevDayLowOutputPowerEnt optIfOMSnSrcPrevDayLowOutputPower;

                        public final OptIfOMSnSrcPrevDayHighOutputPowerEnt optIfOMSnSrcPrevDayHighOutputPower;

                        public final OptIfOMSnSrcPrevDayLastAggregatedInputPowerEnt optIfOMSnSrcPrevDayLastAggregatedInputPower;

                        public final OptIfOMSnSrcPrevDayLowAggregatedInputPowerEnt optIfOMSnSrcPrevDayLowAggregatedInputPower;

                        public final OptIfOMSnSrcPrevDayHighAggregatedInputPowerEnt optIfOMSnSrcPrevDayHighAggregatedInputPower;

                        private OptIfOMSnSrcPrevDayEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOMSnSrcPrevDayEntry", "1.3.6.1.2.1.10.133.1.4.9.1", false, false, false, true);
                            this.optIfOMSnSrcPrevDaySuspectedFlag = new OptIfOMSnSrcPrevDaySuspectedFlagEnt(mib, this);
                            this.optIfOMSnSrcPrevDayLastOutputPower = new OptIfOMSnSrcPrevDayLastOutputPowerEnt(mib, this);
                            this.optIfOMSnSrcPrevDayLowOutputPower = new OptIfOMSnSrcPrevDayLowOutputPowerEnt(mib, this);
                            this.optIfOMSnSrcPrevDayHighOutputPower = new OptIfOMSnSrcPrevDayHighOutputPowerEnt(mib, this);
                            this.optIfOMSnSrcPrevDayLastAggregatedInputPower = new OptIfOMSnSrcPrevDayLastAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSrcPrevDayLowAggregatedInputPower = new OptIfOMSnSrcPrevDayLowAggregatedInputPowerEnt(mib, this);
                            this.optIfOMSnSrcPrevDayHighAggregatedInputPower = new OptIfOMSnSrcPrevDayHighAggregatedInputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOMSnSrcPrevDaySuspectedFlag,
                                this.optIfOMSnSrcPrevDayLastOutputPower,
                                this.optIfOMSnSrcPrevDayLowOutputPower,
                                this.optIfOMSnSrcPrevDayHighOutputPower,
                                this.optIfOMSnSrcPrevDayLastAggregatedInputPower,
                                this.optIfOMSnSrcPrevDayLowAggregatedInputPower,
                                this.optIfOMSnSrcPrevDayHighAggregatedInputPower
                            };
                        }
                        public static final class OptIfOMSnSrcPrevDaySuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcPrevDaySuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcPrevDaySuspectedFlag", "1.3.6.1.2.1.10.133.1.4.9.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcPrevDayLastOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcPrevDayLastOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcPrevDayLastOutputPower", "1.3.6.1.2.1.10.133.1.4.9.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcPrevDayLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcPrevDayLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcPrevDayLowOutputPower", "1.3.6.1.2.1.10.133.1.4.9.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcPrevDayHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcPrevDayHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcPrevDayHighOutputPower", "1.3.6.1.2.1.10.133.1.4.9.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcPrevDayLastAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcPrevDayLastAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcPrevDayLastAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.9.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcPrevDayLowAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcPrevDayLowAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcPrevDayLowAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.9.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOMSnSrcPrevDayHighAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOMSnSrcPrevDayHighAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOMSnSrcPrevDayHighAggregatedInputPower", "1.3.6.1.2.1.10.133.1.4.9.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class OptIfOChGroupEnt extends MIBEntry<OPTIFMIBDef>
            {
                /** the optIfOChGroup groupThis group handles the configuration and performance monitoringinformation for OChGroup layers.
OChGroup config table*/
                public final OptIfOChGroupConfigTableEnt optIfOChGroupConfigTable;

                /** OChGroup sink current tableContains data for the current 15-minute performance monitoringinterval.*/
                public final OptIfOChGroupSinkCurrentTableEnt optIfOChGroupSinkCurrentTable;

                /** OChGroup sink interval tableContains data for previous 15-minute performance monitoringintervals.*/
                public final OptIfOChGroupSinkIntervalTableEnt optIfOChGroupSinkIntervalTable;

                /** OChGroup sink current day tableContains data for the current 24-hour performancemonitoring interval.*/
                public final OptIfOChGroupSinkCurDayTableEnt optIfOChGroupSinkCurDayTable;

                /** OChGroup sink previous day tableContains data for the previous 24-hour performancemonitoring interval.*/
                public final OptIfOChGroupSinkPrevDayTableEnt optIfOChGroupSinkPrevDayTable;

                /** OChGroup source current tableContains data for the current 15-minute performance monitoringinterval.*/
                public final OptIfOChGroupSrcCurrentTableEnt optIfOChGroupSrcCurrentTable;

                /** OChGroup source interval tableContains data for previous 15-minute performance monitoringintervals.*/
                public final OptIfOChGroupSrcIntervalTableEnt optIfOChGroupSrcIntervalTable;

                /** OChGroup source current day tableContains data for the current 24-hour performancemonitoring interval.*/
                public final OptIfOChGroupSrcCurDayTableEnt optIfOChGroupSrcCurDayTable;

                /** OChGroup source previous day tableContains data for the previous 24-hour performancemonitoring interval.*/
                public final OptIfOChGroupSrcPrevDayTableEnt optIfOChGroupSrcPrevDayTable;

                private OptIfOChGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                {
                    super(mib, parent, "optIfOChGroup", "1.3.6.1.2.1.10.133.1.5", false, false, false, false);
                    this.optIfOChGroupConfigTable = new OptIfOChGroupConfigTableEnt(mib, this);
                    this.optIfOChGroupSinkCurrentTable = new OptIfOChGroupSinkCurrentTableEnt(mib, this);
                    this.optIfOChGroupSinkIntervalTable = new OptIfOChGroupSinkIntervalTableEnt(mib, this);
                    this.optIfOChGroupSinkCurDayTable = new OptIfOChGroupSinkCurDayTableEnt(mib, this);
                    this.optIfOChGroupSinkPrevDayTable = new OptIfOChGroupSinkPrevDayTableEnt(mib, this);
                    this.optIfOChGroupSrcCurrentTable = new OptIfOChGroupSrcCurrentTableEnt(mib, this);
                    this.optIfOChGroupSrcIntervalTable = new OptIfOChGroupSrcIntervalTableEnt(mib, this);
                    this.optIfOChGroupSrcCurDayTable = new OptIfOChGroupSrcCurDayTableEnt(mib, this);
                    this.optIfOChGroupSrcPrevDayTable = new OptIfOChGroupSrcPrevDayTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.optIfOChGroupConfigTable,
                        this.optIfOChGroupSinkCurrentTable,
                        this.optIfOChGroupSinkIntervalTable,
                        this.optIfOChGroupSinkCurDayTable,
                        this.optIfOChGroupSinkPrevDayTable,
                        this.optIfOChGroupSrcCurrentTable,
                        this.optIfOChGroupSrcIntervalTable,
                        this.optIfOChGroupSrcCurDayTable,
                        this.optIfOChGroupSrcPrevDayTable
                    };
                }
                public static final class OptIfOChGroupConfigTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChGroupConfigEntryEnt optIfOChGroupConfigEntry;

                    private OptIfOChGroupConfigTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChGroupConfigTable", "1.3.6.1.2.1.10.133.1.5.1", false, true, false, false);
                        this.optIfOChGroupConfigEntry = new OptIfOChGroupConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChGroupConfigEntry
                        };
                    }
                    public static final class OptIfOChGroupConfigEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChGroupDirectionalityEnt optIfOChGroupDirectionality;

                        private OptIfOChGroupConfigEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChGroupConfigEntry", "1.3.6.1.2.1.10.133.1.5.1.1", false, false, false, true);
                            this.optIfOChGroupDirectionality = new OptIfOChGroupDirectionalityEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChGroupDirectionality
                            };
                        }
                        public static final class OptIfOChGroupDirectionalityEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupDirectionalityEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupDirectionality", "1.3.6.1.2.1.10.133.1.5.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOChGroupSinkCurrentTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChGroupSinkCurrentEntryEnt optIfOChGroupSinkCurrentEntry;

                    private OptIfOChGroupSinkCurrentTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChGroupSinkCurrentTable", "1.3.6.1.2.1.10.133.1.5.2", false, true, false, false);
                        this.optIfOChGroupSinkCurrentEntry = new OptIfOChGroupSinkCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChGroupSinkCurrentEntry
                        };
                    }
                    public static final class OptIfOChGroupSinkCurrentEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChGroupSinkCurrentSuspectedFlagEnt optIfOChGroupSinkCurrentSuspectedFlag;

                        public final OptIfOChGroupSinkCurrentAggregatedInputPowerEnt optIfOChGroupSinkCurrentAggregatedInputPower;

                        public final OptIfOChGroupSinkCurrentLowAggregatedInputPowerEnt optIfOChGroupSinkCurrentLowAggregatedInputPower;

                        public final OptIfOChGroupSinkCurrentHighAggregatedInputPowerEnt optIfOChGroupSinkCurrentHighAggregatedInputPower;

                        public final OptIfOChGroupSinkCurrentLowerInputPowerThresholdEnt optIfOChGroupSinkCurrentLowerInputPowerThreshold;

                        public final OptIfOChGroupSinkCurrentUpperInputPowerThresholdEnt optIfOChGroupSinkCurrentUpperInputPowerThreshold;

                        public final OptIfOChGroupSinkCurrentOutputPowerEnt optIfOChGroupSinkCurrentOutputPower;

                        public final OptIfOChGroupSinkCurrentLowOutputPowerEnt optIfOChGroupSinkCurrentLowOutputPower;

                        public final OptIfOChGroupSinkCurrentHighOutputPowerEnt optIfOChGroupSinkCurrentHighOutputPower;

                        public final OptIfOChGroupSinkCurrentLowerOutputPowerThresholdEnt optIfOChGroupSinkCurrentLowerOutputPowerThreshold;

                        public final OptIfOChGroupSinkCurrentUpperOutputPowerThresholdEnt optIfOChGroupSinkCurrentUpperOutputPowerThreshold;

                        private OptIfOChGroupSinkCurrentEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChGroupSinkCurrentEntry", "1.3.6.1.2.1.10.133.1.5.2.1", false, false, false, true);
                            this.optIfOChGroupSinkCurrentSuspectedFlag = new OptIfOChGroupSinkCurrentSuspectedFlagEnt(mib, this);
                            this.optIfOChGroupSinkCurrentAggregatedInputPower = new OptIfOChGroupSinkCurrentAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSinkCurrentLowAggregatedInputPower = new OptIfOChGroupSinkCurrentLowAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSinkCurrentHighAggregatedInputPower = new OptIfOChGroupSinkCurrentHighAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSinkCurrentLowerInputPowerThreshold = new OptIfOChGroupSinkCurrentLowerInputPowerThresholdEnt(mib, this);
                            this.optIfOChGroupSinkCurrentUpperInputPowerThreshold = new OptIfOChGroupSinkCurrentUpperInputPowerThresholdEnt(mib, this);
                            this.optIfOChGroupSinkCurrentOutputPower = new OptIfOChGroupSinkCurrentOutputPowerEnt(mib, this);
                            this.optIfOChGroupSinkCurrentLowOutputPower = new OptIfOChGroupSinkCurrentLowOutputPowerEnt(mib, this);
                            this.optIfOChGroupSinkCurrentHighOutputPower = new OptIfOChGroupSinkCurrentHighOutputPowerEnt(mib, this);
                            this.optIfOChGroupSinkCurrentLowerOutputPowerThreshold = new OptIfOChGroupSinkCurrentLowerOutputPowerThresholdEnt(mib, this);
                            this.optIfOChGroupSinkCurrentUpperOutputPowerThreshold = new OptIfOChGroupSinkCurrentUpperOutputPowerThresholdEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChGroupSinkCurrentSuspectedFlag,
                                this.optIfOChGroupSinkCurrentAggregatedInputPower,
                                this.optIfOChGroupSinkCurrentLowAggregatedInputPower,
                                this.optIfOChGroupSinkCurrentHighAggregatedInputPower,
                                this.optIfOChGroupSinkCurrentLowerInputPowerThreshold,
                                this.optIfOChGroupSinkCurrentUpperInputPowerThreshold,
                                this.optIfOChGroupSinkCurrentOutputPower,
                                this.optIfOChGroupSinkCurrentLowOutputPower,
                                this.optIfOChGroupSinkCurrentHighOutputPower,
                                this.optIfOChGroupSinkCurrentLowerOutputPowerThreshold,
                                this.optIfOChGroupSinkCurrentUpperOutputPowerThreshold
                            };
                        }
                        public static final class OptIfOChGroupSinkCurrentSuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkCurrentSuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkCurrentSuspectedFlag", "1.3.6.1.2.1.10.133.1.5.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkCurrentAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkCurrentAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkCurrentAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkCurrentLowAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkCurrentLowAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkCurrentLowAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkCurrentHighAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkCurrentHighAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkCurrentHighAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkCurrentLowerInputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkCurrentLowerInputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkCurrentLowerInputPowerThreshold", "1.3.6.1.2.1.10.133.1.5.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkCurrentUpperInputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkCurrentUpperInputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkCurrentUpperInputPowerThreshold", "1.3.6.1.2.1.10.133.1.5.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkCurrentOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkCurrentOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkCurrentOutputPower", "1.3.6.1.2.1.10.133.1.5.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkCurrentLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkCurrentLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkCurrentLowOutputPower", "1.3.6.1.2.1.10.133.1.5.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkCurrentHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkCurrentHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkCurrentHighOutputPower", "1.3.6.1.2.1.10.133.1.5.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkCurrentLowerOutputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkCurrentLowerOutputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkCurrentLowerOutputPowerThreshold", "1.3.6.1.2.1.10.133.1.5.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkCurrentUpperOutputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkCurrentUpperOutputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkCurrentUpperOutputPowerThreshold", "1.3.6.1.2.1.10.133.1.5.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOChGroupSinkIntervalTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChGroupSinkIntervalEntryEnt optIfOChGroupSinkIntervalEntry;

                    private OptIfOChGroupSinkIntervalTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChGroupSinkIntervalTable", "1.3.6.1.2.1.10.133.1.5.3", false, true, false, false);
                        this.optIfOChGroupSinkIntervalEntry = new OptIfOChGroupSinkIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChGroupSinkIntervalEntry
                        };
                    }
                    public static final class OptIfOChGroupSinkIntervalEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChGroupSinkIntervalNumberEnt optIfOChGroupSinkIntervalNumber;

                        public final OptIfOChGroupSinkIntervalSuspectedFlagEnt optIfOChGroupSinkIntervalSuspectedFlag;

                        public final OptIfOChGroupSinkIntervalLastAggregatedInputPowerEnt optIfOChGroupSinkIntervalLastAggregatedInputPower;

                        public final OptIfOChGroupSinkIntervalLowAggregatedInputPowerEnt optIfOChGroupSinkIntervalLowAggregatedInputPower;

                        public final OptIfOChGroupSinkIntervalHighAggregatedInputPowerEnt optIfOChGroupSinkIntervalHighAggregatedInputPower;

                        public final OptIfOChGroupSinkIntervalLastOutputPowerEnt optIfOChGroupSinkIntervalLastOutputPower;

                        public final OptIfOChGroupSinkIntervalLowOutputPowerEnt optIfOChGroupSinkIntervalLowOutputPower;

                        public final OptIfOChGroupSinkIntervalHighOutputPowerEnt optIfOChGroupSinkIntervalHighOutputPower;

                        private OptIfOChGroupSinkIntervalEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChGroupSinkIntervalEntry", "1.3.6.1.2.1.10.133.1.5.3.1", false, false, false, true);
                            this.optIfOChGroupSinkIntervalNumber = new OptIfOChGroupSinkIntervalNumberEnt(mib, this);
                            this.optIfOChGroupSinkIntervalSuspectedFlag = new OptIfOChGroupSinkIntervalSuspectedFlagEnt(mib, this);
                            this.optIfOChGroupSinkIntervalLastAggregatedInputPower = new OptIfOChGroupSinkIntervalLastAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSinkIntervalLowAggregatedInputPower = new OptIfOChGroupSinkIntervalLowAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSinkIntervalHighAggregatedInputPower = new OptIfOChGroupSinkIntervalHighAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSinkIntervalLastOutputPower = new OptIfOChGroupSinkIntervalLastOutputPowerEnt(mib, this);
                            this.optIfOChGroupSinkIntervalLowOutputPower = new OptIfOChGroupSinkIntervalLowOutputPowerEnt(mib, this);
                            this.optIfOChGroupSinkIntervalHighOutputPower = new OptIfOChGroupSinkIntervalHighOutputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChGroupSinkIntervalNumber,
                                this.optIfOChGroupSinkIntervalSuspectedFlag,
                                this.optIfOChGroupSinkIntervalLastAggregatedInputPower,
                                this.optIfOChGroupSinkIntervalLowAggregatedInputPower,
                                this.optIfOChGroupSinkIntervalHighAggregatedInputPower,
                                this.optIfOChGroupSinkIntervalLastOutputPower,
                                this.optIfOChGroupSinkIntervalLowOutputPower,
                                this.optIfOChGroupSinkIntervalHighOutputPower
                            };
                        }
                        public static final class OptIfOChGroupSinkIntervalNumberEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkIntervalNumberEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkIntervalNumber", "1.3.6.1.2.1.10.133.1.5.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkIntervalSuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkIntervalSuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkIntervalSuspectedFlag", "1.3.6.1.2.1.10.133.1.5.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkIntervalLastAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkIntervalLastAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkIntervalLastAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkIntervalLowAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkIntervalLowAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkIntervalLowAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkIntervalHighAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkIntervalHighAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkIntervalHighAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkIntervalLastOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkIntervalLastOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkIntervalLastOutputPower", "1.3.6.1.2.1.10.133.1.5.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkIntervalLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkIntervalLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkIntervalLowOutputPower", "1.3.6.1.2.1.10.133.1.5.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkIntervalHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkIntervalHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkIntervalHighOutputPower", "1.3.6.1.2.1.10.133.1.5.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOChGroupSinkCurDayTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChGroupSinkCurDayEntryEnt optIfOChGroupSinkCurDayEntry;

                    private OptIfOChGroupSinkCurDayTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChGroupSinkCurDayTable", "1.3.6.1.2.1.10.133.1.5.4", false, true, false, false);
                        this.optIfOChGroupSinkCurDayEntry = new OptIfOChGroupSinkCurDayEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChGroupSinkCurDayEntry
                        };
                    }
                    public static final class OptIfOChGroupSinkCurDayEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChGroupSinkCurDaySuspectedFlagEnt optIfOChGroupSinkCurDaySuspectedFlag;

                        public final OptIfOChGroupSinkCurDayLowAggregatedInputPowerEnt optIfOChGroupSinkCurDayLowAggregatedInputPower;

                        public final OptIfOChGroupSinkCurDayHighAggregatedInputPowerEnt optIfOChGroupSinkCurDayHighAggregatedInputPower;

                        public final OptIfOChGroupSinkCurDayLowOutputPowerEnt optIfOChGroupSinkCurDayLowOutputPower;

                        public final OptIfOChGroupSinkCurDayHighOutputPowerEnt optIfOChGroupSinkCurDayHighOutputPower;

                        private OptIfOChGroupSinkCurDayEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChGroupSinkCurDayEntry", "1.3.6.1.2.1.10.133.1.5.4.1", false, false, false, true);
                            this.optIfOChGroupSinkCurDaySuspectedFlag = new OptIfOChGroupSinkCurDaySuspectedFlagEnt(mib, this);
                            this.optIfOChGroupSinkCurDayLowAggregatedInputPower = new OptIfOChGroupSinkCurDayLowAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSinkCurDayHighAggregatedInputPower = new OptIfOChGroupSinkCurDayHighAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSinkCurDayLowOutputPower = new OptIfOChGroupSinkCurDayLowOutputPowerEnt(mib, this);
                            this.optIfOChGroupSinkCurDayHighOutputPower = new OptIfOChGroupSinkCurDayHighOutputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChGroupSinkCurDaySuspectedFlag,
                                this.optIfOChGroupSinkCurDayLowAggregatedInputPower,
                                this.optIfOChGroupSinkCurDayHighAggregatedInputPower,
                                this.optIfOChGroupSinkCurDayLowOutputPower,
                                this.optIfOChGroupSinkCurDayHighOutputPower
                            };
                        }
                        public static final class OptIfOChGroupSinkCurDaySuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkCurDaySuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkCurDaySuspectedFlag", "1.3.6.1.2.1.10.133.1.5.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkCurDayLowAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkCurDayLowAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkCurDayLowAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkCurDayHighAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkCurDayHighAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkCurDayHighAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkCurDayLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkCurDayLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkCurDayLowOutputPower", "1.3.6.1.2.1.10.133.1.5.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkCurDayHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkCurDayHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkCurDayHighOutputPower", "1.3.6.1.2.1.10.133.1.5.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOChGroupSinkPrevDayTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChGroupSinkPrevDayEntryEnt optIfOChGroupSinkPrevDayEntry;

                    private OptIfOChGroupSinkPrevDayTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChGroupSinkPrevDayTable", "1.3.6.1.2.1.10.133.1.5.5", false, true, false, false);
                        this.optIfOChGroupSinkPrevDayEntry = new OptIfOChGroupSinkPrevDayEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChGroupSinkPrevDayEntry
                        };
                    }
                    public static final class OptIfOChGroupSinkPrevDayEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChGroupSinkPrevDaySuspectedFlagEnt optIfOChGroupSinkPrevDaySuspectedFlag;

                        public final OptIfOChGroupSinkPrevDayLastAggregatedInputPowerEnt optIfOChGroupSinkPrevDayLastAggregatedInputPower;

                        public final OptIfOChGroupSinkPrevDayLowAggregatedInputPowerEnt optIfOChGroupSinkPrevDayLowAggregatedInputPower;

                        public final OptIfOChGroupSinkPrevDayHighAggregatedInputPowerEnt optIfOChGroupSinkPrevDayHighAggregatedInputPower;

                        public final OptIfOChGroupSinkPrevDayLastOutputPowerEnt optIfOChGroupSinkPrevDayLastOutputPower;

                        public final OptIfOChGroupSinkPrevDayLowOutputPowerEnt optIfOChGroupSinkPrevDayLowOutputPower;

                        public final OptIfOChGroupSinkPrevDayHighOutputPowerEnt optIfOChGroupSinkPrevDayHighOutputPower;

                        private OptIfOChGroupSinkPrevDayEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChGroupSinkPrevDayEntry", "1.3.6.1.2.1.10.133.1.5.5.1", false, false, false, true);
                            this.optIfOChGroupSinkPrevDaySuspectedFlag = new OptIfOChGroupSinkPrevDaySuspectedFlagEnt(mib, this);
                            this.optIfOChGroupSinkPrevDayLastAggregatedInputPower = new OptIfOChGroupSinkPrevDayLastAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSinkPrevDayLowAggregatedInputPower = new OptIfOChGroupSinkPrevDayLowAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSinkPrevDayHighAggregatedInputPower = new OptIfOChGroupSinkPrevDayHighAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSinkPrevDayLastOutputPower = new OptIfOChGroupSinkPrevDayLastOutputPowerEnt(mib, this);
                            this.optIfOChGroupSinkPrevDayLowOutputPower = new OptIfOChGroupSinkPrevDayLowOutputPowerEnt(mib, this);
                            this.optIfOChGroupSinkPrevDayHighOutputPower = new OptIfOChGroupSinkPrevDayHighOutputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChGroupSinkPrevDaySuspectedFlag,
                                this.optIfOChGroupSinkPrevDayLastAggregatedInputPower,
                                this.optIfOChGroupSinkPrevDayLowAggregatedInputPower,
                                this.optIfOChGroupSinkPrevDayHighAggregatedInputPower,
                                this.optIfOChGroupSinkPrevDayLastOutputPower,
                                this.optIfOChGroupSinkPrevDayLowOutputPower,
                                this.optIfOChGroupSinkPrevDayHighOutputPower
                            };
                        }
                        public static final class OptIfOChGroupSinkPrevDaySuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkPrevDaySuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkPrevDaySuspectedFlag", "1.3.6.1.2.1.10.133.1.5.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkPrevDayLastAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkPrevDayLastAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkPrevDayLastAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkPrevDayLowAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkPrevDayLowAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkPrevDayLowAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkPrevDayHighAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkPrevDayHighAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkPrevDayHighAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkPrevDayLastOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkPrevDayLastOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkPrevDayLastOutputPower", "1.3.6.1.2.1.10.133.1.5.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkPrevDayLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkPrevDayLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkPrevDayLowOutputPower", "1.3.6.1.2.1.10.133.1.5.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSinkPrevDayHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSinkPrevDayHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSinkPrevDayHighOutputPower", "1.3.6.1.2.1.10.133.1.5.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOChGroupSrcCurrentTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChGroupSrcCurrentEntryEnt optIfOChGroupSrcCurrentEntry;

                    private OptIfOChGroupSrcCurrentTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChGroupSrcCurrentTable", "1.3.6.1.2.1.10.133.1.5.6", false, true, false, false);
                        this.optIfOChGroupSrcCurrentEntry = new OptIfOChGroupSrcCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChGroupSrcCurrentEntry
                        };
                    }
                    public static final class OptIfOChGroupSrcCurrentEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChGroupSrcCurrentSuspectedFlagEnt optIfOChGroupSrcCurrentSuspectedFlag;

                        public final OptIfOChGroupSrcCurrentOutputPowerEnt optIfOChGroupSrcCurrentOutputPower;

                        public final OptIfOChGroupSrcCurrentLowOutputPowerEnt optIfOChGroupSrcCurrentLowOutputPower;

                        public final OptIfOChGroupSrcCurrentHighOutputPowerEnt optIfOChGroupSrcCurrentHighOutputPower;

                        public final OptIfOChGroupSrcCurrentLowerOutputPowerThresholdEnt optIfOChGroupSrcCurrentLowerOutputPowerThreshold;

                        public final OptIfOChGroupSrcCurrentUpperOutputPowerThresholdEnt optIfOChGroupSrcCurrentUpperOutputPowerThreshold;

                        public final OptIfOChGroupSrcCurrentAggregatedInputPowerEnt optIfOChGroupSrcCurrentAggregatedInputPower;

                        public final OptIfOChGroupSrcCurrentLowAggregatedInputPowerEnt optIfOChGroupSrcCurrentLowAggregatedInputPower;

                        public final OptIfOChGroupSrcCurrentHighAggregatedInputPowerEnt optIfOChGroupSrcCurrentHighAggregatedInputPower;

                        public final OptIfOChGroupSrcCurrentLowerInputPowerThresholdEnt optIfOChGroupSrcCurrentLowerInputPowerThreshold;

                        public final OptIfOChGroupSrcCurrentUpperInputPowerThresholdEnt optIfOChGroupSrcCurrentUpperInputPowerThreshold;

                        private OptIfOChGroupSrcCurrentEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChGroupSrcCurrentEntry", "1.3.6.1.2.1.10.133.1.5.6.1", false, false, false, true);
                            this.optIfOChGroupSrcCurrentSuspectedFlag = new OptIfOChGroupSrcCurrentSuspectedFlagEnt(mib, this);
                            this.optIfOChGroupSrcCurrentOutputPower = new OptIfOChGroupSrcCurrentOutputPowerEnt(mib, this);
                            this.optIfOChGroupSrcCurrentLowOutputPower = new OptIfOChGroupSrcCurrentLowOutputPowerEnt(mib, this);
                            this.optIfOChGroupSrcCurrentHighOutputPower = new OptIfOChGroupSrcCurrentHighOutputPowerEnt(mib, this);
                            this.optIfOChGroupSrcCurrentLowerOutputPowerThreshold = new OptIfOChGroupSrcCurrentLowerOutputPowerThresholdEnt(mib, this);
                            this.optIfOChGroupSrcCurrentUpperOutputPowerThreshold = new OptIfOChGroupSrcCurrentUpperOutputPowerThresholdEnt(mib, this);
                            this.optIfOChGroupSrcCurrentAggregatedInputPower = new OptIfOChGroupSrcCurrentAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSrcCurrentLowAggregatedInputPower = new OptIfOChGroupSrcCurrentLowAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSrcCurrentHighAggregatedInputPower = new OptIfOChGroupSrcCurrentHighAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSrcCurrentLowerInputPowerThreshold = new OptIfOChGroupSrcCurrentLowerInputPowerThresholdEnt(mib, this);
                            this.optIfOChGroupSrcCurrentUpperInputPowerThreshold = new OptIfOChGroupSrcCurrentUpperInputPowerThresholdEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChGroupSrcCurrentSuspectedFlag,
                                this.optIfOChGroupSrcCurrentOutputPower,
                                this.optIfOChGroupSrcCurrentLowOutputPower,
                                this.optIfOChGroupSrcCurrentHighOutputPower,
                                this.optIfOChGroupSrcCurrentLowerOutputPowerThreshold,
                                this.optIfOChGroupSrcCurrentUpperOutputPowerThreshold,
                                this.optIfOChGroupSrcCurrentAggregatedInputPower,
                                this.optIfOChGroupSrcCurrentLowAggregatedInputPower,
                                this.optIfOChGroupSrcCurrentHighAggregatedInputPower,
                                this.optIfOChGroupSrcCurrentLowerInputPowerThreshold,
                                this.optIfOChGroupSrcCurrentUpperInputPowerThreshold
                            };
                        }
                        public static final class OptIfOChGroupSrcCurrentSuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcCurrentSuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcCurrentSuspectedFlag", "1.3.6.1.2.1.10.133.1.5.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcCurrentOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcCurrentOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcCurrentOutputPower", "1.3.6.1.2.1.10.133.1.5.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcCurrentLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcCurrentLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcCurrentLowOutputPower", "1.3.6.1.2.1.10.133.1.5.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcCurrentHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcCurrentHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcCurrentHighOutputPower", "1.3.6.1.2.1.10.133.1.5.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcCurrentLowerOutputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcCurrentLowerOutputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcCurrentLowerOutputPowerThreshold", "1.3.6.1.2.1.10.133.1.5.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcCurrentUpperOutputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcCurrentUpperOutputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcCurrentUpperOutputPowerThreshold", "1.3.6.1.2.1.10.133.1.5.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcCurrentAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcCurrentAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcCurrentAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.6.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcCurrentLowAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcCurrentLowAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcCurrentLowAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.6.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcCurrentHighAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcCurrentHighAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcCurrentHighAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.6.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcCurrentLowerInputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcCurrentLowerInputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcCurrentLowerInputPowerThreshold", "1.3.6.1.2.1.10.133.1.5.6.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcCurrentUpperInputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcCurrentUpperInputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcCurrentUpperInputPowerThreshold", "1.3.6.1.2.1.10.133.1.5.6.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOChGroupSrcIntervalTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChGroupSrcIntervalEntryEnt optIfOChGroupSrcIntervalEntry;

                    private OptIfOChGroupSrcIntervalTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChGroupSrcIntervalTable", "1.3.6.1.2.1.10.133.1.5.7", false, true, false, false);
                        this.optIfOChGroupSrcIntervalEntry = new OptIfOChGroupSrcIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChGroupSrcIntervalEntry
                        };
                    }
                    public static final class OptIfOChGroupSrcIntervalEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChGroupSrcIntervalNumberEnt optIfOChGroupSrcIntervalNumber;

                        public final OptIfOChGroupSrcIntervalSuspectedFlagEnt optIfOChGroupSrcIntervalSuspectedFlag;

                        public final OptIfOChGroupSrcIntervalLastOutputPowerEnt optIfOChGroupSrcIntervalLastOutputPower;

                        public final OptIfOChGroupSrcIntervalLowOutputPowerEnt optIfOChGroupSrcIntervalLowOutputPower;

                        public final OptIfOChGroupSrcIntervalHighOutputPowerEnt optIfOChGroupSrcIntervalHighOutputPower;

                        public final OptIfOChGroupSrcIntervalLastAggregatedInputPowerEnt optIfOChGroupSrcIntervalLastAggregatedInputPower;

                        public final OptIfOChGroupSrcIntervalLowAggregatedInputPowerEnt optIfOChGroupSrcIntervalLowAggregatedInputPower;

                        public final OptIfOChGroupSrcIntervalHighAggregatedInputPowerEnt optIfOChGroupSrcIntervalHighAggregatedInputPower;

                        private OptIfOChGroupSrcIntervalEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChGroupSrcIntervalEntry", "1.3.6.1.2.1.10.133.1.5.7.1", false, false, false, true);
                            this.optIfOChGroupSrcIntervalNumber = new OptIfOChGroupSrcIntervalNumberEnt(mib, this);
                            this.optIfOChGroupSrcIntervalSuspectedFlag = new OptIfOChGroupSrcIntervalSuspectedFlagEnt(mib, this);
                            this.optIfOChGroupSrcIntervalLastOutputPower = new OptIfOChGroupSrcIntervalLastOutputPowerEnt(mib, this);
                            this.optIfOChGroupSrcIntervalLowOutputPower = new OptIfOChGroupSrcIntervalLowOutputPowerEnt(mib, this);
                            this.optIfOChGroupSrcIntervalHighOutputPower = new OptIfOChGroupSrcIntervalHighOutputPowerEnt(mib, this);
                            this.optIfOChGroupSrcIntervalLastAggregatedInputPower = new OptIfOChGroupSrcIntervalLastAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSrcIntervalLowAggregatedInputPower = new OptIfOChGroupSrcIntervalLowAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSrcIntervalHighAggregatedInputPower = new OptIfOChGroupSrcIntervalHighAggregatedInputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChGroupSrcIntervalNumber,
                                this.optIfOChGroupSrcIntervalSuspectedFlag,
                                this.optIfOChGroupSrcIntervalLastOutputPower,
                                this.optIfOChGroupSrcIntervalLowOutputPower,
                                this.optIfOChGroupSrcIntervalHighOutputPower,
                                this.optIfOChGroupSrcIntervalLastAggregatedInputPower,
                                this.optIfOChGroupSrcIntervalLowAggregatedInputPower,
                                this.optIfOChGroupSrcIntervalHighAggregatedInputPower
                            };
                        }
                        public static final class OptIfOChGroupSrcIntervalNumberEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcIntervalNumberEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcIntervalNumber", "1.3.6.1.2.1.10.133.1.5.7.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcIntervalSuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcIntervalSuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcIntervalSuspectedFlag", "1.3.6.1.2.1.10.133.1.5.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcIntervalLastOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcIntervalLastOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcIntervalLastOutputPower", "1.3.6.1.2.1.10.133.1.5.7.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcIntervalLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcIntervalLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcIntervalLowOutputPower", "1.3.6.1.2.1.10.133.1.5.7.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcIntervalHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcIntervalHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcIntervalHighOutputPower", "1.3.6.1.2.1.10.133.1.5.7.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcIntervalLastAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcIntervalLastAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcIntervalLastAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.7.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcIntervalLowAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcIntervalLowAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcIntervalLowAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.7.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcIntervalHighAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcIntervalHighAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcIntervalHighAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.7.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOChGroupSrcCurDayTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChGroupSrcCurDayEntryEnt optIfOChGroupSrcCurDayEntry;

                    private OptIfOChGroupSrcCurDayTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChGroupSrcCurDayTable", "1.3.6.1.2.1.10.133.1.5.8", false, true, false, false);
                        this.optIfOChGroupSrcCurDayEntry = new OptIfOChGroupSrcCurDayEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChGroupSrcCurDayEntry
                        };
                    }
                    public static final class OptIfOChGroupSrcCurDayEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChGroupSrcCurDaySuspectedFlagEnt optIfOChGroupSrcCurDaySuspectedFlag;

                        public final OptIfOChGroupSrcCurDayLowOutputPowerEnt optIfOChGroupSrcCurDayLowOutputPower;

                        public final OptIfOChGroupSrcCurDayHighOutputPowerEnt optIfOChGroupSrcCurDayHighOutputPower;

                        public final OptIfOChGroupSrcCurDayLowAggregatedInputPowerEnt optIfOChGroupSrcCurDayLowAggregatedInputPower;

                        public final OptIfOChGroupSrcCurDayHighAggregatedInputPowerEnt optIfOChGroupSrcCurDayHighAggregatedInputPower;

                        private OptIfOChGroupSrcCurDayEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChGroupSrcCurDayEntry", "1.3.6.1.2.1.10.133.1.5.8.1", false, false, false, true);
                            this.optIfOChGroupSrcCurDaySuspectedFlag = new OptIfOChGroupSrcCurDaySuspectedFlagEnt(mib, this);
                            this.optIfOChGroupSrcCurDayLowOutputPower = new OptIfOChGroupSrcCurDayLowOutputPowerEnt(mib, this);
                            this.optIfOChGroupSrcCurDayHighOutputPower = new OptIfOChGroupSrcCurDayHighOutputPowerEnt(mib, this);
                            this.optIfOChGroupSrcCurDayLowAggregatedInputPower = new OptIfOChGroupSrcCurDayLowAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSrcCurDayHighAggregatedInputPower = new OptIfOChGroupSrcCurDayHighAggregatedInputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChGroupSrcCurDaySuspectedFlag,
                                this.optIfOChGroupSrcCurDayLowOutputPower,
                                this.optIfOChGroupSrcCurDayHighOutputPower,
                                this.optIfOChGroupSrcCurDayLowAggregatedInputPower,
                                this.optIfOChGroupSrcCurDayHighAggregatedInputPower
                            };
                        }
                        public static final class OptIfOChGroupSrcCurDaySuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcCurDaySuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcCurDaySuspectedFlag", "1.3.6.1.2.1.10.133.1.5.8.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcCurDayLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcCurDayLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcCurDayLowOutputPower", "1.3.6.1.2.1.10.133.1.5.8.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcCurDayHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcCurDayHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcCurDayHighOutputPower", "1.3.6.1.2.1.10.133.1.5.8.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcCurDayLowAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcCurDayLowAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcCurDayLowAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.8.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcCurDayHighAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcCurDayHighAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcCurDayHighAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.8.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOChGroupSrcPrevDayTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChGroupSrcPrevDayEntryEnt optIfOChGroupSrcPrevDayEntry;

                    private OptIfOChGroupSrcPrevDayTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChGroupSrcPrevDayTable", "1.3.6.1.2.1.10.133.1.5.9", false, true, false, false);
                        this.optIfOChGroupSrcPrevDayEntry = new OptIfOChGroupSrcPrevDayEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChGroupSrcPrevDayEntry
                        };
                    }
                    public static final class OptIfOChGroupSrcPrevDayEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChGroupSrcPrevDaySuspectedFlagEnt optIfOChGroupSrcPrevDaySuspectedFlag;

                        public final OptIfOChGroupSrcPrevDayLastOutputPowerEnt optIfOChGroupSrcPrevDayLastOutputPower;

                        public final OptIfOChGroupSrcPrevDayLowOutputPowerEnt optIfOChGroupSrcPrevDayLowOutputPower;

                        public final OptIfOChGroupSrcPrevDayHighOutputPowerEnt optIfOChGroupSrcPrevDayHighOutputPower;

                        public final OptIfOChGroupSrcPrevDayLastAggregatedInputPowerEnt optIfOChGroupSrcPrevDayLastAggregatedInputPower;

                        public final OptIfOChGroupSrcPrevDayLowAggregatedInputPowerEnt optIfOChGroupSrcPrevDayLowAggregatedInputPower;

                        public final OptIfOChGroupSrcPrevDayHighAggregatedInputPowerEnt optIfOChGroupSrcPrevDayHighAggregatedInputPower;

                        private OptIfOChGroupSrcPrevDayEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChGroupSrcPrevDayEntry", "1.3.6.1.2.1.10.133.1.5.9.1", false, false, false, true);
                            this.optIfOChGroupSrcPrevDaySuspectedFlag = new OptIfOChGroupSrcPrevDaySuspectedFlagEnt(mib, this);
                            this.optIfOChGroupSrcPrevDayLastOutputPower = new OptIfOChGroupSrcPrevDayLastOutputPowerEnt(mib, this);
                            this.optIfOChGroupSrcPrevDayLowOutputPower = new OptIfOChGroupSrcPrevDayLowOutputPowerEnt(mib, this);
                            this.optIfOChGroupSrcPrevDayHighOutputPower = new OptIfOChGroupSrcPrevDayHighOutputPowerEnt(mib, this);
                            this.optIfOChGroupSrcPrevDayLastAggregatedInputPower = new OptIfOChGroupSrcPrevDayLastAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSrcPrevDayLowAggregatedInputPower = new OptIfOChGroupSrcPrevDayLowAggregatedInputPowerEnt(mib, this);
                            this.optIfOChGroupSrcPrevDayHighAggregatedInputPower = new OptIfOChGroupSrcPrevDayHighAggregatedInputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChGroupSrcPrevDaySuspectedFlag,
                                this.optIfOChGroupSrcPrevDayLastOutputPower,
                                this.optIfOChGroupSrcPrevDayLowOutputPower,
                                this.optIfOChGroupSrcPrevDayHighOutputPower,
                                this.optIfOChGroupSrcPrevDayLastAggregatedInputPower,
                                this.optIfOChGroupSrcPrevDayLowAggregatedInputPower,
                                this.optIfOChGroupSrcPrevDayHighAggregatedInputPower
                            };
                        }
                        public static final class OptIfOChGroupSrcPrevDaySuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcPrevDaySuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcPrevDaySuspectedFlag", "1.3.6.1.2.1.10.133.1.5.9.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcPrevDayLastOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcPrevDayLastOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcPrevDayLastOutputPower", "1.3.6.1.2.1.10.133.1.5.9.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcPrevDayLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcPrevDayLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcPrevDayLowOutputPower", "1.3.6.1.2.1.10.133.1.5.9.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcPrevDayHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcPrevDayHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcPrevDayHighOutputPower", "1.3.6.1.2.1.10.133.1.5.9.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcPrevDayLastAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcPrevDayLastAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcPrevDayLastAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.9.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcPrevDayLowAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcPrevDayLowAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcPrevDayLowAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.9.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChGroupSrcPrevDayHighAggregatedInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChGroupSrcPrevDayHighAggregatedInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChGroupSrcPrevDayHighAggregatedInputPower", "1.3.6.1.2.1.10.133.1.5.9.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class OptIfOChEnt extends MIBEntry<OPTIFMIBDef>
            {
                /** the optIfOCh group


This group handles the configuration andperformance monitoring information for OCh layers.
OCh config table*/
                public final OptIfOChConfigTableEnt optIfOChConfigTable;

                /** OCh sink current tableContains data for the current 15-minute performance monitoringinterval.*/
                public final OptIfOChSinkCurrentTableEnt optIfOChSinkCurrentTable;

                /** OCh sink interval tableContains data for previous 15-minute performance monitoringintervals.*/
                public final OptIfOChSinkIntervalTableEnt optIfOChSinkIntervalTable;

                /** OCh sink current day tableContains data for the current 24-hour performancemonitoring interval.*/
                public final OptIfOChSinkCurDayTableEnt optIfOChSinkCurDayTable;

                /** OCh sink previous day tableContains data for the previous 24-hour performancemonitoring interval.*/
                public final OptIfOChSinkPrevDayTableEnt optIfOChSinkPrevDayTable;

                /** OCh source current tableContains data for the current 15-minute performance monitoringinterval.*/
                public final OptIfOChSrcCurrentTableEnt optIfOChSrcCurrentTable;

                /** OCh source interval tableContains data for previous 15-minute performance monitoringintervals.*/
                public final OptIfOChSrcIntervalTableEnt optIfOChSrcIntervalTable;

                /** OCh source current day tableContains data for the current 24-hour performancemonitoring interval.*/
                public final OptIfOChSrcCurDayTableEnt optIfOChSrcCurDayTable;

                /** OCh source previous day tableContains data for the previous 24-hour performancemonitoring interval.*/
                public final OptIfOChSrcPrevDayTableEnt optIfOChSrcPrevDayTable;

                private OptIfOChEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                {
                    super(mib, parent, "optIfOCh", "1.3.6.1.2.1.10.133.1.6", false, false, false, false);
                    this.optIfOChConfigTable = new OptIfOChConfigTableEnt(mib, this);
                    this.optIfOChSinkCurrentTable = new OptIfOChSinkCurrentTableEnt(mib, this);
                    this.optIfOChSinkIntervalTable = new OptIfOChSinkIntervalTableEnt(mib, this);
                    this.optIfOChSinkCurDayTable = new OptIfOChSinkCurDayTableEnt(mib, this);
                    this.optIfOChSinkPrevDayTable = new OptIfOChSinkPrevDayTableEnt(mib, this);
                    this.optIfOChSrcCurrentTable = new OptIfOChSrcCurrentTableEnt(mib, this);
                    this.optIfOChSrcIntervalTable = new OptIfOChSrcIntervalTableEnt(mib, this);
                    this.optIfOChSrcCurDayTable = new OptIfOChSrcCurDayTableEnt(mib, this);
                    this.optIfOChSrcPrevDayTable = new OptIfOChSrcPrevDayTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.optIfOChConfigTable,
                        this.optIfOChSinkCurrentTable,
                        this.optIfOChSinkIntervalTable,
                        this.optIfOChSinkCurDayTable,
                        this.optIfOChSinkPrevDayTable,
                        this.optIfOChSrcCurrentTable,
                        this.optIfOChSrcIntervalTable,
                        this.optIfOChSrcCurDayTable,
                        this.optIfOChSrcPrevDayTable
                    };
                }
                public static final class OptIfOChConfigTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChConfigEntryEnt optIfOChConfigEntry;

                    private OptIfOChConfigTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChConfigTable", "1.3.6.1.2.1.10.133.1.6.1", false, true, false, false);
                        this.optIfOChConfigEntry = new OptIfOChConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChConfigEntry
                        };
                    }
                    public static final class OptIfOChConfigEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChDirectionalityEnt optIfOChDirectionality;

                        public final OptIfOChCurrentStatusEnt optIfOChCurrentStatus;

                        private OptIfOChConfigEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChConfigEntry", "1.3.6.1.2.1.10.133.1.6.1.1", false, false, false, true);
                            this.optIfOChDirectionality = new OptIfOChDirectionalityEnt(mib, this);
                            this.optIfOChCurrentStatus = new OptIfOChCurrentStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChDirectionality,
                                this.optIfOChCurrentStatus
                            };
                        }
                        public static final class OptIfOChDirectionalityEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChDirectionalityEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChDirectionality", "1.3.6.1.2.1.10.133.1.6.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChCurrentStatusEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChCurrentStatusEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChCurrentStatus", "1.3.6.1.2.1.10.133.1.6.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOChSinkCurrentTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChSinkCurrentEntryEnt optIfOChSinkCurrentEntry;

                    private OptIfOChSinkCurrentTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChSinkCurrentTable", "1.3.6.1.2.1.10.133.1.6.2", false, true, false, false);
                        this.optIfOChSinkCurrentEntry = new OptIfOChSinkCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChSinkCurrentEntry
                        };
                    }
                    public static final class OptIfOChSinkCurrentEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChSinkCurrentSuspectedFlagEnt optIfOChSinkCurrentSuspectedFlag;

                        public final OptIfOChSinkCurrentInputPowerEnt optIfOChSinkCurrentInputPower;

                        public final OptIfOChSinkCurrentLowInputPowerEnt optIfOChSinkCurrentLowInputPower;

                        public final OptIfOChSinkCurrentHighInputPowerEnt optIfOChSinkCurrentHighInputPower;

                        public final OptIfOChSinkCurrentLowerInputPowerThresholdEnt optIfOChSinkCurrentLowerInputPowerThreshold;

                        public final OptIfOChSinkCurrentUpperInputPowerThresholdEnt optIfOChSinkCurrentUpperInputPowerThreshold;

                        private OptIfOChSinkCurrentEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChSinkCurrentEntry", "1.3.6.1.2.1.10.133.1.6.2.1", false, false, false, true);
                            this.optIfOChSinkCurrentSuspectedFlag = new OptIfOChSinkCurrentSuspectedFlagEnt(mib, this);
                            this.optIfOChSinkCurrentInputPower = new OptIfOChSinkCurrentInputPowerEnt(mib, this);
                            this.optIfOChSinkCurrentLowInputPower = new OptIfOChSinkCurrentLowInputPowerEnt(mib, this);
                            this.optIfOChSinkCurrentHighInputPower = new OptIfOChSinkCurrentHighInputPowerEnt(mib, this);
                            this.optIfOChSinkCurrentLowerInputPowerThreshold = new OptIfOChSinkCurrentLowerInputPowerThresholdEnt(mib, this);
                            this.optIfOChSinkCurrentUpperInputPowerThreshold = new OptIfOChSinkCurrentUpperInputPowerThresholdEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChSinkCurrentSuspectedFlag,
                                this.optIfOChSinkCurrentInputPower,
                                this.optIfOChSinkCurrentLowInputPower,
                                this.optIfOChSinkCurrentHighInputPower,
                                this.optIfOChSinkCurrentLowerInputPowerThreshold,
                                this.optIfOChSinkCurrentUpperInputPowerThreshold
                            };
                        }
                        public static final class OptIfOChSinkCurrentSuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkCurrentSuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkCurrentSuspectedFlag", "1.3.6.1.2.1.10.133.1.6.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSinkCurrentInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkCurrentInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkCurrentInputPower", "1.3.6.1.2.1.10.133.1.6.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSinkCurrentLowInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkCurrentLowInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkCurrentLowInputPower", "1.3.6.1.2.1.10.133.1.6.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSinkCurrentHighInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkCurrentHighInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkCurrentHighInputPower", "1.3.6.1.2.1.10.133.1.6.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSinkCurrentLowerInputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkCurrentLowerInputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkCurrentLowerInputPowerThreshold", "1.3.6.1.2.1.10.133.1.6.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSinkCurrentUpperInputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkCurrentUpperInputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkCurrentUpperInputPowerThreshold", "1.3.6.1.2.1.10.133.1.6.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOChSinkIntervalTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChSinkIntervalEntryEnt optIfOChSinkIntervalEntry;

                    private OptIfOChSinkIntervalTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChSinkIntervalTable", "1.3.6.1.2.1.10.133.1.6.3", false, true, false, false);
                        this.optIfOChSinkIntervalEntry = new OptIfOChSinkIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChSinkIntervalEntry
                        };
                    }
                    public static final class OptIfOChSinkIntervalEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChSinkIntervalNumberEnt optIfOChSinkIntervalNumber;

                        public final OptIfOChSinkIntervalSuspectedFlagEnt optIfOChSinkIntervalSuspectedFlag;

                        public final OptIfOChSinkIntervalLastInputPowerEnt optIfOChSinkIntervalLastInputPower;

                        public final OptIfOChSinkIntervalLowInputPowerEnt optIfOChSinkIntervalLowInputPower;

                        public final OptIfOChSinkIntervalHighInputPowerEnt optIfOChSinkIntervalHighInputPower;

                        private OptIfOChSinkIntervalEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChSinkIntervalEntry", "1.3.6.1.2.1.10.133.1.6.3.1", false, false, false, true);
                            this.optIfOChSinkIntervalNumber = new OptIfOChSinkIntervalNumberEnt(mib, this);
                            this.optIfOChSinkIntervalSuspectedFlag = new OptIfOChSinkIntervalSuspectedFlagEnt(mib, this);
                            this.optIfOChSinkIntervalLastInputPower = new OptIfOChSinkIntervalLastInputPowerEnt(mib, this);
                            this.optIfOChSinkIntervalLowInputPower = new OptIfOChSinkIntervalLowInputPowerEnt(mib, this);
                            this.optIfOChSinkIntervalHighInputPower = new OptIfOChSinkIntervalHighInputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChSinkIntervalNumber,
                                this.optIfOChSinkIntervalSuspectedFlag,
                                this.optIfOChSinkIntervalLastInputPower,
                                this.optIfOChSinkIntervalLowInputPower,
                                this.optIfOChSinkIntervalHighInputPower
                            };
                        }
                        public static final class OptIfOChSinkIntervalNumberEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkIntervalNumberEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkIntervalNumber", "1.3.6.1.2.1.10.133.1.6.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSinkIntervalSuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkIntervalSuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkIntervalSuspectedFlag", "1.3.6.1.2.1.10.133.1.6.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSinkIntervalLastInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkIntervalLastInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkIntervalLastInputPower", "1.3.6.1.2.1.10.133.1.6.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSinkIntervalLowInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkIntervalLowInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkIntervalLowInputPower", "1.3.6.1.2.1.10.133.1.6.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSinkIntervalHighInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkIntervalHighInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkIntervalHighInputPower", "1.3.6.1.2.1.10.133.1.6.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOChSinkCurDayTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChSinkCurDayEntryEnt optIfOChSinkCurDayEntry;

                    private OptIfOChSinkCurDayTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChSinkCurDayTable", "1.3.6.1.2.1.10.133.1.6.4", false, true, false, false);
                        this.optIfOChSinkCurDayEntry = new OptIfOChSinkCurDayEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChSinkCurDayEntry
                        };
                    }
                    public static final class OptIfOChSinkCurDayEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChSinkCurDaySuspectedFlagEnt optIfOChSinkCurDaySuspectedFlag;

                        public final OptIfOChSinkCurDayLowInputPowerEnt optIfOChSinkCurDayLowInputPower;

                        public final OptIfOChSinkCurDayHighInputPowerEnt optIfOChSinkCurDayHighInputPower;

                        private OptIfOChSinkCurDayEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChSinkCurDayEntry", "1.3.6.1.2.1.10.133.1.6.4.1", false, false, false, true);
                            this.optIfOChSinkCurDaySuspectedFlag = new OptIfOChSinkCurDaySuspectedFlagEnt(mib, this);
                            this.optIfOChSinkCurDayLowInputPower = new OptIfOChSinkCurDayLowInputPowerEnt(mib, this);
                            this.optIfOChSinkCurDayHighInputPower = new OptIfOChSinkCurDayHighInputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChSinkCurDaySuspectedFlag,
                                this.optIfOChSinkCurDayLowInputPower,
                                this.optIfOChSinkCurDayHighInputPower
                            };
                        }
                        public static final class OptIfOChSinkCurDaySuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkCurDaySuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkCurDaySuspectedFlag", "1.3.6.1.2.1.10.133.1.6.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSinkCurDayLowInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkCurDayLowInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkCurDayLowInputPower", "1.3.6.1.2.1.10.133.1.6.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSinkCurDayHighInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkCurDayHighInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkCurDayHighInputPower", "1.3.6.1.2.1.10.133.1.6.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOChSinkPrevDayTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChSinkPrevDayEntryEnt optIfOChSinkPrevDayEntry;

                    private OptIfOChSinkPrevDayTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChSinkPrevDayTable", "1.3.6.1.2.1.10.133.1.6.5", false, true, false, false);
                        this.optIfOChSinkPrevDayEntry = new OptIfOChSinkPrevDayEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChSinkPrevDayEntry
                        };
                    }
                    public static final class OptIfOChSinkPrevDayEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChSinkPrevDaySuspectedFlagEnt optIfOChSinkPrevDaySuspectedFlag;

                        public final OptIfOChSinkPrevDayLastInputPowerEnt optIfOChSinkPrevDayLastInputPower;

                        public final OptIfOChSinkPrevDayLowInputPowerEnt optIfOChSinkPrevDayLowInputPower;

                        public final OptIfOChSinkPrevDayHighInputPowerEnt optIfOChSinkPrevDayHighInputPower;

                        private OptIfOChSinkPrevDayEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChSinkPrevDayEntry", "1.3.6.1.2.1.10.133.1.6.5.1", false, false, false, true);
                            this.optIfOChSinkPrevDaySuspectedFlag = new OptIfOChSinkPrevDaySuspectedFlagEnt(mib, this);
                            this.optIfOChSinkPrevDayLastInputPower = new OptIfOChSinkPrevDayLastInputPowerEnt(mib, this);
                            this.optIfOChSinkPrevDayLowInputPower = new OptIfOChSinkPrevDayLowInputPowerEnt(mib, this);
                            this.optIfOChSinkPrevDayHighInputPower = new OptIfOChSinkPrevDayHighInputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChSinkPrevDaySuspectedFlag,
                                this.optIfOChSinkPrevDayLastInputPower,
                                this.optIfOChSinkPrevDayLowInputPower,
                                this.optIfOChSinkPrevDayHighInputPower
                            };
                        }
                        public static final class OptIfOChSinkPrevDaySuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkPrevDaySuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkPrevDaySuspectedFlag", "1.3.6.1.2.1.10.133.1.6.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSinkPrevDayLastInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkPrevDayLastInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkPrevDayLastInputPower", "1.3.6.1.2.1.10.133.1.6.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSinkPrevDayLowInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkPrevDayLowInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkPrevDayLowInputPower", "1.3.6.1.2.1.10.133.1.6.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSinkPrevDayHighInputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSinkPrevDayHighInputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSinkPrevDayHighInputPower", "1.3.6.1.2.1.10.133.1.6.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOChSrcCurrentTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChSrcCurrentEntryEnt optIfOChSrcCurrentEntry;

                    private OptIfOChSrcCurrentTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChSrcCurrentTable", "1.3.6.1.2.1.10.133.1.6.6", false, true, false, false);
                        this.optIfOChSrcCurrentEntry = new OptIfOChSrcCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChSrcCurrentEntry
                        };
                    }
                    public static final class OptIfOChSrcCurrentEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChSrcCurrentSuspectedFlagEnt optIfOChSrcCurrentSuspectedFlag;

                        public final OptIfOChSrcCurrentOutputPowerEnt optIfOChSrcCurrentOutputPower;

                        public final OptIfOChSrcCurrentLowOutputPowerEnt optIfOChSrcCurrentLowOutputPower;

                        public final OptIfOChSrcCurrentHighOutputPowerEnt optIfOChSrcCurrentHighOutputPower;

                        public final OptIfOChSrcCurrentLowerOutputPowerThresholdEnt optIfOChSrcCurrentLowerOutputPowerThreshold;

                        public final OptIfOChSrcCurrentUpperOutputPowerThresholdEnt optIfOChSrcCurrentUpperOutputPowerThreshold;

                        private OptIfOChSrcCurrentEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChSrcCurrentEntry", "1.3.6.1.2.1.10.133.1.6.6.1", false, false, false, true);
                            this.optIfOChSrcCurrentSuspectedFlag = new OptIfOChSrcCurrentSuspectedFlagEnt(mib, this);
                            this.optIfOChSrcCurrentOutputPower = new OptIfOChSrcCurrentOutputPowerEnt(mib, this);
                            this.optIfOChSrcCurrentLowOutputPower = new OptIfOChSrcCurrentLowOutputPowerEnt(mib, this);
                            this.optIfOChSrcCurrentHighOutputPower = new OptIfOChSrcCurrentHighOutputPowerEnt(mib, this);
                            this.optIfOChSrcCurrentLowerOutputPowerThreshold = new OptIfOChSrcCurrentLowerOutputPowerThresholdEnt(mib, this);
                            this.optIfOChSrcCurrentUpperOutputPowerThreshold = new OptIfOChSrcCurrentUpperOutputPowerThresholdEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChSrcCurrentSuspectedFlag,
                                this.optIfOChSrcCurrentOutputPower,
                                this.optIfOChSrcCurrentLowOutputPower,
                                this.optIfOChSrcCurrentHighOutputPower,
                                this.optIfOChSrcCurrentLowerOutputPowerThreshold,
                                this.optIfOChSrcCurrentUpperOutputPowerThreshold
                            };
                        }
                        public static final class OptIfOChSrcCurrentSuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcCurrentSuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcCurrentSuspectedFlag", "1.3.6.1.2.1.10.133.1.6.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSrcCurrentOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcCurrentOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcCurrentOutputPower", "1.3.6.1.2.1.10.133.1.6.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSrcCurrentLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcCurrentLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcCurrentLowOutputPower", "1.3.6.1.2.1.10.133.1.6.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSrcCurrentHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcCurrentHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcCurrentHighOutputPower", "1.3.6.1.2.1.10.133.1.6.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSrcCurrentLowerOutputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcCurrentLowerOutputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcCurrentLowerOutputPowerThreshold", "1.3.6.1.2.1.10.133.1.6.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSrcCurrentUpperOutputPowerThresholdEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcCurrentUpperOutputPowerThresholdEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcCurrentUpperOutputPowerThreshold", "1.3.6.1.2.1.10.133.1.6.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOChSrcIntervalTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChSrcIntervalEntryEnt optIfOChSrcIntervalEntry;

                    private OptIfOChSrcIntervalTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChSrcIntervalTable", "1.3.6.1.2.1.10.133.1.6.7", false, true, false, false);
                        this.optIfOChSrcIntervalEntry = new OptIfOChSrcIntervalEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChSrcIntervalEntry
                        };
                    }
                    public static final class OptIfOChSrcIntervalEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChSrcIntervalNumberEnt optIfOChSrcIntervalNumber;

                        public final OptIfOChSrcIntervalSuspectedFlagEnt optIfOChSrcIntervalSuspectedFlag;

                        public final OptIfOChSrcIntervalLastOutputPowerEnt optIfOChSrcIntervalLastOutputPower;

                        public final OptIfOChSrcIntervalLowOutputPowerEnt optIfOChSrcIntervalLowOutputPower;

                        public final OptIfOChSrcIntervalHighOutputPowerEnt optIfOChSrcIntervalHighOutputPower;

                        private OptIfOChSrcIntervalEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChSrcIntervalEntry", "1.3.6.1.2.1.10.133.1.6.7.1", false, false, false, true);
                            this.optIfOChSrcIntervalNumber = new OptIfOChSrcIntervalNumberEnt(mib, this);
                            this.optIfOChSrcIntervalSuspectedFlag = new OptIfOChSrcIntervalSuspectedFlagEnt(mib, this);
                            this.optIfOChSrcIntervalLastOutputPower = new OptIfOChSrcIntervalLastOutputPowerEnt(mib, this);
                            this.optIfOChSrcIntervalLowOutputPower = new OptIfOChSrcIntervalLowOutputPowerEnt(mib, this);
                            this.optIfOChSrcIntervalHighOutputPower = new OptIfOChSrcIntervalHighOutputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChSrcIntervalNumber,
                                this.optIfOChSrcIntervalSuspectedFlag,
                                this.optIfOChSrcIntervalLastOutputPower,
                                this.optIfOChSrcIntervalLowOutputPower,
                                this.optIfOChSrcIntervalHighOutputPower
                            };
                        }
                        public static final class OptIfOChSrcIntervalNumberEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcIntervalNumberEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcIntervalNumber", "1.3.6.1.2.1.10.133.1.6.7.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSrcIntervalSuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcIntervalSuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcIntervalSuspectedFlag", "1.3.6.1.2.1.10.133.1.6.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSrcIntervalLastOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcIntervalLastOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcIntervalLastOutputPower", "1.3.6.1.2.1.10.133.1.6.7.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSrcIntervalLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcIntervalLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcIntervalLowOutputPower", "1.3.6.1.2.1.10.133.1.6.7.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSrcIntervalHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcIntervalHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcIntervalHighOutputPower", "1.3.6.1.2.1.10.133.1.6.7.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOChSrcCurDayTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChSrcCurDayEntryEnt optIfOChSrcCurDayEntry;

                    private OptIfOChSrcCurDayTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChSrcCurDayTable", "1.3.6.1.2.1.10.133.1.6.8", false, true, false, false);
                        this.optIfOChSrcCurDayEntry = new OptIfOChSrcCurDayEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChSrcCurDayEntry
                        };
                    }
                    public static final class OptIfOChSrcCurDayEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChSrcCurDaySuspectedFlagEnt optIfOChSrcCurDaySuspectedFlag;

                        public final OptIfOChSrcCurDayLowOutputPowerEnt optIfOChSrcCurDayLowOutputPower;

                        public final OptIfOChSrcCurDayHighOutputPowerEnt optIfOChSrcCurDayHighOutputPower;

                        private OptIfOChSrcCurDayEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChSrcCurDayEntry", "1.3.6.1.2.1.10.133.1.6.8.1", false, false, false, true);
                            this.optIfOChSrcCurDaySuspectedFlag = new OptIfOChSrcCurDaySuspectedFlagEnt(mib, this);
                            this.optIfOChSrcCurDayLowOutputPower = new OptIfOChSrcCurDayLowOutputPowerEnt(mib, this);
                            this.optIfOChSrcCurDayHighOutputPower = new OptIfOChSrcCurDayHighOutputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChSrcCurDaySuspectedFlag,
                                this.optIfOChSrcCurDayLowOutputPower,
                                this.optIfOChSrcCurDayHighOutputPower
                            };
                        }
                        public static final class OptIfOChSrcCurDaySuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcCurDaySuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcCurDaySuspectedFlag", "1.3.6.1.2.1.10.133.1.6.8.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSrcCurDayLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcCurDayLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcCurDayLowOutputPower", "1.3.6.1.2.1.10.133.1.6.8.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSrcCurDayHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcCurDayHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcCurDayHighOutputPower", "1.3.6.1.2.1.10.133.1.6.8.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfOChSrcPrevDayTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOChSrcPrevDayEntryEnt optIfOChSrcPrevDayEntry;

                    private OptIfOChSrcPrevDayTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChSrcPrevDayTable", "1.3.6.1.2.1.10.133.1.6.9", false, true, false, false);
                        this.optIfOChSrcPrevDayEntry = new OptIfOChSrcPrevDayEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOChSrcPrevDayEntry
                        };
                    }
                    public static final class OptIfOChSrcPrevDayEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOChSrcPrevDaySuspectedFlagEnt optIfOChSrcPrevDaySuspectedFlag;

                        public final OptIfOChSrcPrevDayLastOutputPowerEnt optIfOChSrcPrevDayLastOutputPower;

                        public final OptIfOChSrcPrevDayLowOutputPowerEnt optIfOChSrcPrevDayLowOutputPower;

                        public final OptIfOChSrcPrevDayHighOutputPowerEnt optIfOChSrcPrevDayHighOutputPower;

                        private OptIfOChSrcPrevDayEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOChSrcPrevDayEntry", "1.3.6.1.2.1.10.133.1.6.9.1", false, false, false, true);
                            this.optIfOChSrcPrevDaySuspectedFlag = new OptIfOChSrcPrevDaySuspectedFlagEnt(mib, this);
                            this.optIfOChSrcPrevDayLastOutputPower = new OptIfOChSrcPrevDayLastOutputPowerEnt(mib, this);
                            this.optIfOChSrcPrevDayLowOutputPower = new OptIfOChSrcPrevDayLowOutputPowerEnt(mib, this);
                            this.optIfOChSrcPrevDayHighOutputPower = new OptIfOChSrcPrevDayHighOutputPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOChSrcPrevDaySuspectedFlag,
                                this.optIfOChSrcPrevDayLastOutputPower,
                                this.optIfOChSrcPrevDayLowOutputPower,
                                this.optIfOChSrcPrevDayHighOutputPower
                            };
                        }
                        public static final class OptIfOChSrcPrevDaySuspectedFlagEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcPrevDaySuspectedFlagEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcPrevDaySuspectedFlag", "1.3.6.1.2.1.10.133.1.6.9.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSrcPrevDayLastOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcPrevDayLastOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcPrevDayLastOutputPower", "1.3.6.1.2.1.10.133.1.6.9.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSrcPrevDayLowOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcPrevDayLowOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcPrevDayLowOutputPower", "1.3.6.1.2.1.10.133.1.6.9.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOChSrcPrevDayHighOutputPowerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOChSrcPrevDayHighOutputPowerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOChSrcPrevDayHighOutputPower", "1.3.6.1.2.1.10.133.1.6.9.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class OptIfOTUkEnt extends MIBEntry<OPTIFMIBDef>
            {
                /** the optIfOTUk groupThis group handles the configurationinformation for OTUk layers.
OTUk config table*/
                public final OptIfOTUkConfigTableEnt optIfOTUkConfigTable;

                /** GCC0 config table*/
                public final OptIfGCC0ConfigTableEnt optIfGCC0ConfigTable;

                private OptIfOTUkEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                {
                    super(mib, parent, "optIfOTUk", "1.3.6.1.2.1.10.133.1.7", false, false, false, false);
                    this.optIfOTUkConfigTable = new OptIfOTUkConfigTableEnt(mib, this);
                    this.optIfGCC0ConfigTable = new OptIfGCC0ConfigTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.optIfOTUkConfigTable,
                        this.optIfGCC0ConfigTable
                    };
                }
                public static final class OptIfOTUkConfigTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfOTUkConfigEntryEnt optIfOTUkConfigEntry;

                    private OptIfOTUkConfigTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTUkConfigTable", "1.3.6.1.2.1.10.133.1.7.1", false, true, false, false);
                        this.optIfOTUkConfigEntry = new OptIfOTUkConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfOTUkConfigEntry
                        };
                    }
                    public static final class OptIfOTUkConfigEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfOTUkDirectionalityEnt optIfOTUkDirectionality;

                        public final OptIfOTUkBitRateKEnt optIfOTUkBitRateK;

                        public final OptIfOTUkTraceIdentifierTransmittedEnt optIfOTUkTraceIdentifierTransmitted;

                        public final OptIfOTUkDAPIExpectedEnt optIfOTUkDAPIExpected;

                        public final OptIfOTUkSAPIExpectedEnt optIfOTUkSAPIExpected;

                        public final OptIfOTUkTraceIdentifierAcceptedEnt optIfOTUkTraceIdentifierAccepted;

                        public final OptIfOTUkTIMDetModeEnt optIfOTUkTIMDetMode;

                        public final OptIfOTUkTIMActEnabledEnt optIfOTUkTIMActEnabled;

                        public final OptIfOTUkDEGThrEnt optIfOTUkDEGThr;

                        public final OptIfOTUkDEGMEnt optIfOTUkDEGM;

                        public final OptIfOTUkSinkAdaptActiveEnt optIfOTUkSinkAdaptActive;

                        public final OptIfOTUkSourceAdaptActiveEnt optIfOTUkSourceAdaptActive;

                        public final OptIfOTUkSinkFECEnabledEnt optIfOTUkSinkFECEnabled;

                        public final OptIfOTUkCurrentStatusEnt optIfOTUkCurrentStatus;

                        private OptIfOTUkConfigEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfOTUkConfigEntry", "1.3.6.1.2.1.10.133.1.7.1.1", false, false, false, true);
                            this.optIfOTUkDirectionality = new OptIfOTUkDirectionalityEnt(mib, this);
                            this.optIfOTUkBitRateK = new OptIfOTUkBitRateKEnt(mib, this);
                            this.optIfOTUkTraceIdentifierTransmitted = new OptIfOTUkTraceIdentifierTransmittedEnt(mib, this);
                            this.optIfOTUkDAPIExpected = new OptIfOTUkDAPIExpectedEnt(mib, this);
                            this.optIfOTUkSAPIExpected = new OptIfOTUkSAPIExpectedEnt(mib, this);
                            this.optIfOTUkTraceIdentifierAccepted = new OptIfOTUkTraceIdentifierAcceptedEnt(mib, this);
                            this.optIfOTUkTIMDetMode = new OptIfOTUkTIMDetModeEnt(mib, this);
                            this.optIfOTUkTIMActEnabled = new OptIfOTUkTIMActEnabledEnt(mib, this);
                            this.optIfOTUkDEGThr = new OptIfOTUkDEGThrEnt(mib, this);
                            this.optIfOTUkDEGM = new OptIfOTUkDEGMEnt(mib, this);
                            this.optIfOTUkSinkAdaptActive = new OptIfOTUkSinkAdaptActiveEnt(mib, this);
                            this.optIfOTUkSourceAdaptActive = new OptIfOTUkSourceAdaptActiveEnt(mib, this);
                            this.optIfOTUkSinkFECEnabled = new OptIfOTUkSinkFECEnabledEnt(mib, this);
                            this.optIfOTUkCurrentStatus = new OptIfOTUkCurrentStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfOTUkDirectionality,
                                this.optIfOTUkBitRateK,
                                this.optIfOTUkTraceIdentifierTransmitted,
                                this.optIfOTUkDAPIExpected,
                                this.optIfOTUkSAPIExpected,
                                this.optIfOTUkTraceIdentifierAccepted,
                                this.optIfOTUkTIMDetMode,
                                this.optIfOTUkTIMActEnabled,
                                this.optIfOTUkDEGThr,
                                this.optIfOTUkDEGM,
                                this.optIfOTUkSinkAdaptActive,
                                this.optIfOTUkSourceAdaptActive,
                                this.optIfOTUkSinkFECEnabled,
                                this.optIfOTUkCurrentStatus
                            };
                        }
                        public static final class OptIfOTUkDirectionalityEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTUkDirectionalityEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTUkDirectionality", "1.3.6.1.2.1.10.133.1.7.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTUkBitRateKEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTUkBitRateKEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTUkBitRateK", "1.3.6.1.2.1.10.133.1.7.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTUkTraceIdentifierTransmittedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTUkTraceIdentifierTransmittedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTUkTraceIdentifierTransmitted", "1.3.6.1.2.1.10.133.1.7.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTUkDAPIExpectedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTUkDAPIExpectedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTUkDAPIExpected", "1.3.6.1.2.1.10.133.1.7.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTUkSAPIExpectedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTUkSAPIExpectedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTUkSAPIExpected", "1.3.6.1.2.1.10.133.1.7.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTUkTraceIdentifierAcceptedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTUkTraceIdentifierAcceptedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTUkTraceIdentifierAccepted", "1.3.6.1.2.1.10.133.1.7.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTUkTIMDetModeEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTUkTIMDetModeEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTUkTIMDetMode", "1.3.6.1.2.1.10.133.1.7.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTUkTIMActEnabledEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTUkTIMActEnabledEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTUkTIMActEnabled", "1.3.6.1.2.1.10.133.1.7.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTUkDEGThrEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTUkDEGThrEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTUkDEGThr", "1.3.6.1.2.1.10.133.1.7.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTUkDEGMEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTUkDEGMEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTUkDEGM", "1.3.6.1.2.1.10.133.1.7.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTUkSinkAdaptActiveEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTUkSinkAdaptActiveEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTUkSinkAdaptActive", "1.3.6.1.2.1.10.133.1.7.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTUkSourceAdaptActiveEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTUkSourceAdaptActiveEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTUkSourceAdaptActive", "1.3.6.1.2.1.10.133.1.7.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTUkSinkFECEnabledEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTUkSinkFECEnabledEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTUkSinkFECEnabled", "1.3.6.1.2.1.10.133.1.7.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfOTUkCurrentStatusEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfOTUkCurrentStatusEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfOTUkCurrentStatus", "1.3.6.1.2.1.10.133.1.7.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfGCC0ConfigTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfGCC0ConfigEntryEnt optIfGCC0ConfigEntry;

                    private OptIfGCC0ConfigTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfGCC0ConfigTable", "1.3.6.1.2.1.10.133.1.7.2", false, true, false, false);
                        this.optIfGCC0ConfigEntry = new OptIfGCC0ConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfGCC0ConfigEntry
                        };
                    }
                    public static final class OptIfGCC0ConfigEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfGCC0DirectionalityEnt optIfGCC0Directionality;

                        public final OptIfGCC0ApplicationEnt optIfGCC0Application;

                        public final OptIfGCC0RowStatusEnt optIfGCC0RowStatus;

                        private OptIfGCC0ConfigEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfGCC0ConfigEntry", "1.3.6.1.2.1.10.133.1.7.2.1", false, false, false, true);
                            this.optIfGCC0Directionality = new OptIfGCC0DirectionalityEnt(mib, this);
                            this.optIfGCC0Application = new OptIfGCC0ApplicationEnt(mib, this);
                            this.optIfGCC0RowStatus = new OptIfGCC0RowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfGCC0Directionality,
                                this.optIfGCC0Application,
                                this.optIfGCC0RowStatus
                            };
                        }
                        public static final class OptIfGCC0DirectionalityEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfGCC0DirectionalityEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfGCC0Directionality", "1.3.6.1.2.1.10.133.1.7.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfGCC0ApplicationEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfGCC0ApplicationEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfGCC0Application", "1.3.6.1.2.1.10.133.1.7.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfGCC0RowStatusEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfGCC0RowStatusEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfGCC0RowStatus", "1.3.6.1.2.1.10.133.1.7.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class OptIfODUkEnt extends MIBEntry<OPTIFMIBDef>
            {
                /** the optIfODUk groupThis group handles the configuration informationfor the ODUk layers.
ODUk config table*/
                public final OptIfODUkConfigTableEnt optIfODUkConfigTable;

                /** ODUk Trail Termination Point (TTP) config table*/
                public final OptIfODUkTtpConfigTableEnt optIfODUkTtpConfigTable;

                /** ODUk Position Sequence table*/
                public final OptIfODUkPositionSeqTableEnt optIfODUkPositionSeqTable;

                /** ODUk Non-intrusive monitoring (Nim) config table*/
                public final OptIfODUkNimConfigTableEnt optIfODUkNimConfigTable;

                /** GCC12 config table*/
                public final OptIfGCC12ConfigTableEnt optIfGCC12ConfigTable;

                private OptIfODUkEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                {
                    super(mib, parent, "optIfODUk", "1.3.6.1.2.1.10.133.1.8", false, false, false, false);
                    this.optIfODUkConfigTable = new OptIfODUkConfigTableEnt(mib, this);
                    this.optIfODUkTtpConfigTable = new OptIfODUkTtpConfigTableEnt(mib, this);
                    this.optIfODUkPositionSeqTable = new OptIfODUkPositionSeqTableEnt(mib, this);
                    this.optIfODUkNimConfigTable = new OptIfODUkNimConfigTableEnt(mib, this);
                    this.optIfGCC12ConfigTable = new OptIfGCC12ConfigTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.optIfODUkConfigTable,
                        this.optIfODUkTtpConfigTable,
                        this.optIfODUkPositionSeqTable,
                        this.optIfODUkNimConfigTable,
                        this.optIfGCC12ConfigTable
                    };
                }
                public static final class OptIfODUkConfigTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfODUkConfigEntryEnt optIfODUkConfigEntry;

                    private OptIfODUkConfigTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfODUkConfigTable", "1.3.6.1.2.1.10.133.1.8.1", false, true, false, false);
                        this.optIfODUkConfigEntry = new OptIfODUkConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfODUkConfigEntry
                        };
                    }
                    public static final class OptIfODUkConfigEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfODUkDirectionalityEnt optIfODUkDirectionality;

                        public final OptIfODUkBitRateKEnt optIfODUkBitRateK;

                        public final OptIfODUkTcmFieldsInUseEnt optIfODUkTcmFieldsInUse;

                        public final OptIfODUkPositionSeqCurrentSizeEnt optIfODUkPositionSeqCurrentSize;

                        public final OptIfODUkTtpPresentEnt optIfODUkTtpPresent;

                        private OptIfODUkConfigEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfODUkConfigEntry", "1.3.6.1.2.1.10.133.1.8.1.1", false, false, false, true);
                            this.optIfODUkDirectionality = new OptIfODUkDirectionalityEnt(mib, this);
                            this.optIfODUkBitRateK = new OptIfODUkBitRateKEnt(mib, this);
                            this.optIfODUkTcmFieldsInUse = new OptIfODUkTcmFieldsInUseEnt(mib, this);
                            this.optIfODUkPositionSeqCurrentSize = new OptIfODUkPositionSeqCurrentSizeEnt(mib, this);
                            this.optIfODUkTtpPresent = new OptIfODUkTtpPresentEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfODUkDirectionality,
                                this.optIfODUkBitRateK,
                                this.optIfODUkTcmFieldsInUse,
                                this.optIfODUkPositionSeqCurrentSize,
                                this.optIfODUkTtpPresent
                            };
                        }
                        public static final class OptIfODUkDirectionalityEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkDirectionalityEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkDirectionality", "1.3.6.1.2.1.10.133.1.8.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkBitRateKEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkBitRateKEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkBitRateK", "1.3.6.1.2.1.10.133.1.8.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTcmFieldsInUseEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTcmFieldsInUseEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTcmFieldsInUse", "1.3.6.1.2.1.10.133.1.8.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkPositionSeqCurrentSizeEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkPositionSeqCurrentSizeEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkPositionSeqCurrentSize", "1.3.6.1.2.1.10.133.1.8.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTtpPresentEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTtpPresentEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTtpPresent", "1.3.6.1.2.1.10.133.1.8.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfODUkTtpConfigTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfODUkTtpConfigEntryEnt optIfODUkTtpConfigEntry;

                    private OptIfODUkTtpConfigTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfODUkTtpConfigTable", "1.3.6.1.2.1.10.133.1.8.2", false, true, false, false);
                        this.optIfODUkTtpConfigEntry = new OptIfODUkTtpConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfODUkTtpConfigEntry
                        };
                    }
                    public static final class OptIfODUkTtpConfigEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfODUkTtpTraceIdentifierTransmittedEnt optIfODUkTtpTraceIdentifierTransmitted;

                        public final OptIfODUkTtpDAPIExpectedEnt optIfODUkTtpDAPIExpected;

                        public final OptIfODUkTtpSAPIExpectedEnt optIfODUkTtpSAPIExpected;

                        public final OptIfODUkTtpTraceIdentifierAcceptedEnt optIfODUkTtpTraceIdentifierAccepted;

                        public final OptIfODUkTtpTIMDetModeEnt optIfODUkTtpTIMDetMode;

                        public final OptIfODUkTtpTIMActEnabledEnt optIfODUkTtpTIMActEnabled;

                        public final OptIfODUkTtpDEGThrEnt optIfODUkTtpDEGThr;

                        public final OptIfODUkTtpDEGMEnt optIfODUkTtpDEGM;

                        public final OptIfODUkTtpCurrentStatusEnt optIfODUkTtpCurrentStatus;

                        private OptIfODUkTtpConfigEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfODUkTtpConfigEntry", "1.3.6.1.2.1.10.133.1.8.2.1", false, false, false, true);
                            this.optIfODUkTtpTraceIdentifierTransmitted = new OptIfODUkTtpTraceIdentifierTransmittedEnt(mib, this);
                            this.optIfODUkTtpDAPIExpected = new OptIfODUkTtpDAPIExpectedEnt(mib, this);
                            this.optIfODUkTtpSAPIExpected = new OptIfODUkTtpSAPIExpectedEnt(mib, this);
                            this.optIfODUkTtpTraceIdentifierAccepted = new OptIfODUkTtpTraceIdentifierAcceptedEnt(mib, this);
                            this.optIfODUkTtpTIMDetMode = new OptIfODUkTtpTIMDetModeEnt(mib, this);
                            this.optIfODUkTtpTIMActEnabled = new OptIfODUkTtpTIMActEnabledEnt(mib, this);
                            this.optIfODUkTtpDEGThr = new OptIfODUkTtpDEGThrEnt(mib, this);
                            this.optIfODUkTtpDEGM = new OptIfODUkTtpDEGMEnt(mib, this);
                            this.optIfODUkTtpCurrentStatus = new OptIfODUkTtpCurrentStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfODUkTtpTraceIdentifierTransmitted,
                                this.optIfODUkTtpDAPIExpected,
                                this.optIfODUkTtpSAPIExpected,
                                this.optIfODUkTtpTraceIdentifierAccepted,
                                this.optIfODUkTtpTIMDetMode,
                                this.optIfODUkTtpTIMActEnabled,
                                this.optIfODUkTtpDEGThr,
                                this.optIfODUkTtpDEGM,
                                this.optIfODUkTtpCurrentStatus
                            };
                        }
                        public static final class OptIfODUkTtpTraceIdentifierTransmittedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTtpTraceIdentifierTransmittedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTtpTraceIdentifierTransmitted", "1.3.6.1.2.1.10.133.1.8.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTtpDAPIExpectedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTtpDAPIExpectedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTtpDAPIExpected", "1.3.6.1.2.1.10.133.1.8.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTtpSAPIExpectedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTtpSAPIExpectedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTtpSAPIExpected", "1.3.6.1.2.1.10.133.1.8.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTtpTraceIdentifierAcceptedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTtpTraceIdentifierAcceptedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTtpTraceIdentifierAccepted", "1.3.6.1.2.1.10.133.1.8.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTtpTIMDetModeEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTtpTIMDetModeEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTtpTIMDetMode", "1.3.6.1.2.1.10.133.1.8.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTtpTIMActEnabledEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTtpTIMActEnabledEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTtpTIMActEnabled", "1.3.6.1.2.1.10.133.1.8.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTtpDEGThrEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTtpDEGThrEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTtpDEGThr", "1.3.6.1.2.1.10.133.1.8.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTtpDEGMEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTtpDEGMEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTtpDEGM", "1.3.6.1.2.1.10.133.1.8.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTtpCurrentStatusEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTtpCurrentStatusEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTtpCurrentStatus", "1.3.6.1.2.1.10.133.1.8.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfODUkPositionSeqTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfODUkPositionSeqEntryEnt optIfODUkPositionSeqEntry;

                    private OptIfODUkPositionSeqTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfODUkPositionSeqTable", "1.3.6.1.2.1.10.133.1.8.3", false, true, false, false);
                        this.optIfODUkPositionSeqEntry = new OptIfODUkPositionSeqEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfODUkPositionSeqEntry
                        };
                    }
                    public static final class OptIfODUkPositionSeqEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfODUkPositionSeqIndexEnt optIfODUkPositionSeqIndex;

                        public final OptIfODUkPositionSeqPositionEnt optIfODUkPositionSeqPosition;

                        public final OptIfODUkPositionSeqPointerEnt optIfODUkPositionSeqPointer;

                        private OptIfODUkPositionSeqEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfODUkPositionSeqEntry", "1.3.6.1.2.1.10.133.1.8.3.1", false, false, false, true);
                            this.optIfODUkPositionSeqIndex = new OptIfODUkPositionSeqIndexEnt(mib, this);
                            this.optIfODUkPositionSeqPosition = new OptIfODUkPositionSeqPositionEnt(mib, this);
                            this.optIfODUkPositionSeqPointer = new OptIfODUkPositionSeqPointerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfODUkPositionSeqIndex,
                                this.optIfODUkPositionSeqPosition,
                                this.optIfODUkPositionSeqPointer
                            };
                        }
                        public static final class OptIfODUkPositionSeqIndexEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkPositionSeqIndexEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkPositionSeqIndex", "1.3.6.1.2.1.10.133.1.8.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkPositionSeqPositionEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkPositionSeqPositionEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkPositionSeqPosition", "1.3.6.1.2.1.10.133.1.8.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkPositionSeqPointerEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkPositionSeqPointerEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkPositionSeqPointer", "1.3.6.1.2.1.10.133.1.8.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfODUkNimConfigTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfODUkNimConfigEntryEnt optIfODUkNimConfigEntry;

                    private OptIfODUkNimConfigTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfODUkNimConfigTable", "1.3.6.1.2.1.10.133.1.8.4", false, true, false, false);
                        this.optIfODUkNimConfigEntry = new OptIfODUkNimConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfODUkNimConfigEntry
                        };
                    }
                    public static final class OptIfODUkNimConfigEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfODUkNimDirectionalityEnt optIfODUkNimDirectionality;

                        public final OptIfODUkNimDAPIExpectedEnt optIfODUkNimDAPIExpected;

                        public final OptIfODUkNimSAPIExpectedEnt optIfODUkNimSAPIExpected;

                        public final OptIfODUkNimTraceIdentifierAcceptedEnt optIfODUkNimTraceIdentifierAccepted;

                        public final OptIfODUkNimTIMDetModeEnt optIfODUkNimTIMDetMode;

                        public final OptIfODUkNimTIMActEnabledEnt optIfODUkNimTIMActEnabled;

                        public final OptIfODUkNimDEGThrEnt optIfODUkNimDEGThr;

                        public final OptIfODUkNimDEGMEnt optIfODUkNimDEGM;

                        public final OptIfODUkNimCurrentStatusEnt optIfODUkNimCurrentStatus;

                        public final OptIfODUkNimRowStatusEnt optIfODUkNimRowStatus;

                        private OptIfODUkNimConfigEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfODUkNimConfigEntry", "1.3.6.1.2.1.10.133.1.8.4.1", false, false, false, true);
                            this.optIfODUkNimDirectionality = new OptIfODUkNimDirectionalityEnt(mib, this);
                            this.optIfODUkNimDAPIExpected = new OptIfODUkNimDAPIExpectedEnt(mib, this);
                            this.optIfODUkNimSAPIExpected = new OptIfODUkNimSAPIExpectedEnt(mib, this);
                            this.optIfODUkNimTraceIdentifierAccepted = new OptIfODUkNimTraceIdentifierAcceptedEnt(mib, this);
                            this.optIfODUkNimTIMDetMode = new OptIfODUkNimTIMDetModeEnt(mib, this);
                            this.optIfODUkNimTIMActEnabled = new OptIfODUkNimTIMActEnabledEnt(mib, this);
                            this.optIfODUkNimDEGThr = new OptIfODUkNimDEGThrEnt(mib, this);
                            this.optIfODUkNimDEGM = new OptIfODUkNimDEGMEnt(mib, this);
                            this.optIfODUkNimCurrentStatus = new OptIfODUkNimCurrentStatusEnt(mib, this);
                            this.optIfODUkNimRowStatus = new OptIfODUkNimRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfODUkNimDirectionality,
                                this.optIfODUkNimDAPIExpected,
                                this.optIfODUkNimSAPIExpected,
                                this.optIfODUkNimTraceIdentifierAccepted,
                                this.optIfODUkNimTIMDetMode,
                                this.optIfODUkNimTIMActEnabled,
                                this.optIfODUkNimDEGThr,
                                this.optIfODUkNimDEGM,
                                this.optIfODUkNimCurrentStatus,
                                this.optIfODUkNimRowStatus
                            };
                        }
                        public static final class OptIfODUkNimDirectionalityEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkNimDirectionalityEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkNimDirectionality", "1.3.6.1.2.1.10.133.1.8.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkNimDAPIExpectedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkNimDAPIExpectedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkNimDAPIExpected", "1.3.6.1.2.1.10.133.1.8.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkNimSAPIExpectedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkNimSAPIExpectedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkNimSAPIExpected", "1.3.6.1.2.1.10.133.1.8.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkNimTraceIdentifierAcceptedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkNimTraceIdentifierAcceptedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkNimTraceIdentifierAccepted", "1.3.6.1.2.1.10.133.1.8.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkNimTIMDetModeEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkNimTIMDetModeEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkNimTIMDetMode", "1.3.6.1.2.1.10.133.1.8.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkNimTIMActEnabledEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkNimTIMActEnabledEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkNimTIMActEnabled", "1.3.6.1.2.1.10.133.1.8.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkNimDEGThrEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkNimDEGThrEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkNimDEGThr", "1.3.6.1.2.1.10.133.1.8.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkNimDEGMEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkNimDEGMEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkNimDEGM", "1.3.6.1.2.1.10.133.1.8.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkNimCurrentStatusEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkNimCurrentStatusEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkNimCurrentStatus", "1.3.6.1.2.1.10.133.1.8.4.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkNimRowStatusEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkNimRowStatusEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkNimRowStatus", "1.3.6.1.2.1.10.133.1.8.4.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfGCC12ConfigTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfGCC12ConfigEntryEnt optIfGCC12ConfigEntry;

                    private OptIfGCC12ConfigTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfGCC12ConfigTable", "1.3.6.1.2.1.10.133.1.8.5", false, true, false, false);
                        this.optIfGCC12ConfigEntry = new OptIfGCC12ConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfGCC12ConfigEntry
                        };
                    }
                    public static final class OptIfGCC12ConfigEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfGCC12CodirectionalEnt optIfGCC12Codirectional;

                        public final OptIfGCC12GCCAccessEnt optIfGCC12GCCAccess;

                        public final OptIfGCC12GCCPassThroughEnt optIfGCC12GCCPassThrough;

                        public final OptIfGCC12ApplicationEnt optIfGCC12Application;

                        public final OptIfGCC12RowStatusEnt optIfGCC12RowStatus;

                        private OptIfGCC12ConfigEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfGCC12ConfigEntry", "1.3.6.1.2.1.10.133.1.8.5.1", false, false, false, true);
                            this.optIfGCC12Codirectional = new OptIfGCC12CodirectionalEnt(mib, this);
                            this.optIfGCC12GCCAccess = new OptIfGCC12GCCAccessEnt(mib, this);
                            this.optIfGCC12GCCPassThrough = new OptIfGCC12GCCPassThroughEnt(mib, this);
                            this.optIfGCC12Application = new OptIfGCC12ApplicationEnt(mib, this);
                            this.optIfGCC12RowStatus = new OptIfGCC12RowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfGCC12Codirectional,
                                this.optIfGCC12GCCAccess,
                                this.optIfGCC12GCCPassThrough,
                                this.optIfGCC12Application,
                                this.optIfGCC12RowStatus
                            };
                        }
                        public static final class OptIfGCC12CodirectionalEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfGCC12CodirectionalEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfGCC12Codirectional", "1.3.6.1.2.1.10.133.1.8.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfGCC12GCCAccessEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfGCC12GCCAccessEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfGCC12GCCAccess", "1.3.6.1.2.1.10.133.1.8.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfGCC12GCCPassThroughEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfGCC12GCCPassThroughEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfGCC12GCCPassThrough", "1.3.6.1.2.1.10.133.1.8.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfGCC12ApplicationEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfGCC12ApplicationEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfGCC12Application", "1.3.6.1.2.1.10.133.1.8.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfGCC12RowStatusEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfGCC12RowStatusEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfGCC12RowStatus", "1.3.6.1.2.1.10.133.1.8.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class OptIfODUkTEnt extends MIBEntry<OPTIFMIBDef>
            {
                /** the optIfODUkT groupThis group handles the configuration informationfor the ODUkT layers.
ODUkT config table*/
                public final OptIfODUkTConfigTableEnt optIfODUkTConfigTable;

                /** ODUkT Non-intrusive monitoring (Nim) config table*/
                public final OptIfODUkTNimConfigTableEnt optIfODUkTNimConfigTable;

                private OptIfODUkTEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                {
                    super(mib, parent, "optIfODUkT", "1.3.6.1.2.1.10.133.1.9", false, false, false, false);
                    this.optIfODUkTConfigTable = new OptIfODUkTConfigTableEnt(mib, this);
                    this.optIfODUkTNimConfigTable = new OptIfODUkTNimConfigTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.optIfODUkTConfigTable,
                        this.optIfODUkTNimConfigTable
                    };
                }
                public static final class OptIfODUkTConfigTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfODUkTConfigEntryEnt optIfODUkTConfigEntry;

                    private OptIfODUkTConfigTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfODUkTConfigTable", "1.3.6.1.2.1.10.133.1.9.1", false, true, false, false);
                        this.optIfODUkTConfigEntry = new OptIfODUkTConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfODUkTConfigEntry
                        };
                    }
                    public static final class OptIfODUkTConfigEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfODUkTTcmFieldEnt optIfODUkTTcmField;

                        public final OptIfODUkTCodirectionalEnt optIfODUkTCodirectional;

                        public final OptIfODUkTTraceIdentifierTransmittedEnt optIfODUkTTraceIdentifierTransmitted;

                        public final OptIfODUkTDAPIExpectedEnt optIfODUkTDAPIExpected;

                        public final OptIfODUkTSAPIExpectedEnt optIfODUkTSAPIExpected;

                        public final OptIfODUkTTraceIdentifierAcceptedEnt optIfODUkTTraceIdentifierAccepted;

                        public final OptIfODUkTTIMDetModeEnt optIfODUkTTIMDetMode;

                        public final OptIfODUkTTIMActEnabledEnt optIfODUkTTIMActEnabled;

                        public final OptIfODUkTDEGThrEnt optIfODUkTDEGThr;

                        public final OptIfODUkTDEGMEnt optIfODUkTDEGM;

                        public final OptIfODUkTSinkModeEnt optIfODUkTSinkMode;

                        public final OptIfODUkTSinkLockSignalAdminStateEnt optIfODUkTSinkLockSignalAdminState;

                        public final OptIfODUkTSourceLockSignalAdminStateEnt optIfODUkTSourceLockSignalAdminState;

                        public final OptIfODUkTCurrentStatusEnt optIfODUkTCurrentStatus;

                        public final OptIfODUkTRowStatusEnt optIfODUkTRowStatus;

                        private OptIfODUkTConfigEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfODUkTConfigEntry", "1.3.6.1.2.1.10.133.1.9.1.1", false, false, false, true);
                            this.optIfODUkTTcmField = new OptIfODUkTTcmFieldEnt(mib, this);
                            this.optIfODUkTCodirectional = new OptIfODUkTCodirectionalEnt(mib, this);
                            this.optIfODUkTTraceIdentifierTransmitted = new OptIfODUkTTraceIdentifierTransmittedEnt(mib, this);
                            this.optIfODUkTDAPIExpected = new OptIfODUkTDAPIExpectedEnt(mib, this);
                            this.optIfODUkTSAPIExpected = new OptIfODUkTSAPIExpectedEnt(mib, this);
                            this.optIfODUkTTraceIdentifierAccepted = new OptIfODUkTTraceIdentifierAcceptedEnt(mib, this);
                            this.optIfODUkTTIMDetMode = new OptIfODUkTTIMDetModeEnt(mib, this);
                            this.optIfODUkTTIMActEnabled = new OptIfODUkTTIMActEnabledEnt(mib, this);
                            this.optIfODUkTDEGThr = new OptIfODUkTDEGThrEnt(mib, this);
                            this.optIfODUkTDEGM = new OptIfODUkTDEGMEnt(mib, this);
                            this.optIfODUkTSinkMode = new OptIfODUkTSinkModeEnt(mib, this);
                            this.optIfODUkTSinkLockSignalAdminState = new OptIfODUkTSinkLockSignalAdminStateEnt(mib, this);
                            this.optIfODUkTSourceLockSignalAdminState = new OptIfODUkTSourceLockSignalAdminStateEnt(mib, this);
                            this.optIfODUkTCurrentStatus = new OptIfODUkTCurrentStatusEnt(mib, this);
                            this.optIfODUkTRowStatus = new OptIfODUkTRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfODUkTTcmField,
                                this.optIfODUkTCodirectional,
                                this.optIfODUkTTraceIdentifierTransmitted,
                                this.optIfODUkTDAPIExpected,
                                this.optIfODUkTSAPIExpected,
                                this.optIfODUkTTraceIdentifierAccepted,
                                this.optIfODUkTTIMDetMode,
                                this.optIfODUkTTIMActEnabled,
                                this.optIfODUkTDEGThr,
                                this.optIfODUkTDEGM,
                                this.optIfODUkTSinkMode,
                                this.optIfODUkTSinkLockSignalAdminState,
                                this.optIfODUkTSourceLockSignalAdminState,
                                this.optIfODUkTCurrentStatus,
                                this.optIfODUkTRowStatus
                            };
                        }
                        public static final class OptIfODUkTTcmFieldEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTTcmFieldEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTTcmField", "1.3.6.1.2.1.10.133.1.9.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTCodirectionalEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTCodirectionalEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTCodirectional", "1.3.6.1.2.1.10.133.1.9.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTTraceIdentifierTransmittedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTTraceIdentifierTransmittedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTTraceIdentifierTransmitted", "1.3.6.1.2.1.10.133.1.9.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTDAPIExpectedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTDAPIExpectedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTDAPIExpected", "1.3.6.1.2.1.10.133.1.9.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTSAPIExpectedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTSAPIExpectedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTSAPIExpected", "1.3.6.1.2.1.10.133.1.9.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTTraceIdentifierAcceptedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTTraceIdentifierAcceptedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTTraceIdentifierAccepted", "1.3.6.1.2.1.10.133.1.9.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTTIMDetModeEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTTIMDetModeEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTTIMDetMode", "1.3.6.1.2.1.10.133.1.9.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTTIMActEnabledEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTTIMActEnabledEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTTIMActEnabled", "1.3.6.1.2.1.10.133.1.9.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTDEGThrEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTDEGThrEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTDEGThr", "1.3.6.1.2.1.10.133.1.9.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTDEGMEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTDEGMEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTDEGM", "1.3.6.1.2.1.10.133.1.9.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTSinkModeEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTSinkModeEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTSinkMode", "1.3.6.1.2.1.10.133.1.9.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTSinkLockSignalAdminStateEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTSinkLockSignalAdminStateEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTSinkLockSignalAdminState", "1.3.6.1.2.1.10.133.1.9.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTSourceLockSignalAdminStateEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTSourceLockSignalAdminStateEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTSourceLockSignalAdminState", "1.3.6.1.2.1.10.133.1.9.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTCurrentStatusEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTCurrentStatusEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTCurrentStatus", "1.3.6.1.2.1.10.133.1.9.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTRowStatusEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTRowStatusEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTRowStatus", "1.3.6.1.2.1.10.133.1.9.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class OptIfODUkTNimConfigTableEnt extends MIBEntry<OPTIFMIBDef>
                {
                    public final OptIfODUkTNimConfigEntryEnt optIfODUkTNimConfigEntry;

                    private OptIfODUkTNimConfigTableEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfODUkTNimConfigTable", "1.3.6.1.2.1.10.133.1.9.2", false, true, false, false);
                        this.optIfODUkTNimConfigEntry = new OptIfODUkTNimConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.optIfODUkTNimConfigEntry
                        };
                    }
                    public static final class OptIfODUkTNimConfigEntryEnt extends MIBEntry<OPTIFMIBDef>
                    {
                        public final OptIfODUkTNimTcmFieldEnt optIfODUkTNimTcmField;

                        public final OptIfODUkTNimDirectionalityEnt optIfODUkTNimDirectionality;

                        public final OptIfODUkTNimDAPIExpectedEnt optIfODUkTNimDAPIExpected;

                        public final OptIfODUkTNimSAPIExpectedEnt optIfODUkTNimSAPIExpected;

                        public final OptIfODUkTNimTraceIdentifierAcceptedEnt optIfODUkTNimTraceIdentifierAccepted;

                        public final OptIfODUkTNimTIMDetModeEnt optIfODUkTNimTIMDetMode;

                        public final OptIfODUkTNimTIMActEnabledEnt optIfODUkTNimTIMActEnabled;

                        public final OptIfODUkTNimDEGThrEnt optIfODUkTNimDEGThr;

                        public final OptIfODUkTNimDEGMEnt optIfODUkTNimDEGM;

                        public final OptIfODUkTNimCurrentStatusEnt optIfODUkTNimCurrentStatus;

                        public final OptIfODUkTNimRowStatusEnt optIfODUkTNimRowStatus;

                        private OptIfODUkTNimConfigEntryEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                        {
                            super(mib, parent, "optIfODUkTNimConfigEntry", "1.3.6.1.2.1.10.133.1.9.2.1", false, false, false, true);
                            this.optIfODUkTNimTcmField = new OptIfODUkTNimTcmFieldEnt(mib, this);
                            this.optIfODUkTNimDirectionality = new OptIfODUkTNimDirectionalityEnt(mib, this);
                            this.optIfODUkTNimDAPIExpected = new OptIfODUkTNimDAPIExpectedEnt(mib, this);
                            this.optIfODUkTNimSAPIExpected = new OptIfODUkTNimSAPIExpectedEnt(mib, this);
                            this.optIfODUkTNimTraceIdentifierAccepted = new OptIfODUkTNimTraceIdentifierAcceptedEnt(mib, this);
                            this.optIfODUkTNimTIMDetMode = new OptIfODUkTNimTIMDetModeEnt(mib, this);
                            this.optIfODUkTNimTIMActEnabled = new OptIfODUkTNimTIMActEnabledEnt(mib, this);
                            this.optIfODUkTNimDEGThr = new OptIfODUkTNimDEGThrEnt(mib, this);
                            this.optIfODUkTNimDEGM = new OptIfODUkTNimDEGMEnt(mib, this);
                            this.optIfODUkTNimCurrentStatus = new OptIfODUkTNimCurrentStatusEnt(mib, this);
                            this.optIfODUkTNimRowStatus = new OptIfODUkTNimRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.optIfODUkTNimTcmField,
                                this.optIfODUkTNimDirectionality,
                                this.optIfODUkTNimDAPIExpected,
                                this.optIfODUkTNimSAPIExpected,
                                this.optIfODUkTNimTraceIdentifierAccepted,
                                this.optIfODUkTNimTIMDetMode,
                                this.optIfODUkTNimTIMActEnabled,
                                this.optIfODUkTNimDEGThr,
                                this.optIfODUkTNimDEGM,
                                this.optIfODUkTNimCurrentStatus,
                                this.optIfODUkTNimRowStatus
                            };
                        }
                        public static final class OptIfODUkTNimTcmFieldEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTNimTcmFieldEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTNimTcmField", "1.3.6.1.2.1.10.133.1.9.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTNimDirectionalityEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTNimDirectionalityEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTNimDirectionality", "1.3.6.1.2.1.10.133.1.9.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTNimDAPIExpectedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTNimDAPIExpectedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTNimDAPIExpected", "1.3.6.1.2.1.10.133.1.9.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTNimSAPIExpectedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTNimSAPIExpectedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTNimSAPIExpected", "1.3.6.1.2.1.10.133.1.9.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTNimTraceIdentifierAcceptedEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTNimTraceIdentifierAcceptedEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTNimTraceIdentifierAccepted", "1.3.6.1.2.1.10.133.1.9.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTNimTIMDetModeEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTNimTIMDetModeEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTNimTIMDetMode", "1.3.6.1.2.1.10.133.1.9.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTNimTIMActEnabledEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTNimTIMActEnabledEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTNimTIMActEnabled", "1.3.6.1.2.1.10.133.1.9.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTNimDEGThrEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTNimDEGThrEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTNimDEGThr", "1.3.6.1.2.1.10.133.1.9.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTNimDEGMEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTNimDEGMEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTNimDEGM", "1.3.6.1.2.1.10.133.1.9.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTNimCurrentStatusEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTNimCurrentStatusEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTNimCurrentStatus", "1.3.6.1.2.1.10.133.1.9.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class OptIfODUkTNimRowStatusEnt extends MIBEntry<OPTIFMIBDef>
                        {
                            private OptIfODUkTNimRowStatusEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                            {
                                super(mib, parent, "optIfODUkTNimRowStatus", "1.3.6.1.2.1.10.133.1.9.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class OptIfConfsEnt extends MIBEntry<OPTIFMIBDef>
        {
            public final OptIfGroupsEnt optIfGroups;

            public final OptIfComplEnt optIfCompl;

            private OptIfConfsEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
            {
                super(mib, parent, "optIfConfs", "1.3.6.1.2.1.10.133.2", false, false, false, false);
                this.optIfGroups = new OptIfGroupsEnt(mib, this);
                this.optIfCompl = new OptIfComplEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.optIfGroups,
                    this.optIfCompl
                };
            }
            public static final class OptIfGroupsEnt extends MIBEntry<OPTIFMIBDef>
            {
                /** units of conformance*/
                public final OptIfOTMnGroupEnt optIfOTMnGroup;

                public final OptIfPerfMonGroupEnt optIfPerfMonGroup;

                public final OptIfOTSnCommonGroupEnt optIfOTSnCommonGroup;

                public final OptIfOTSnSourceGroupFullEnt optIfOTSnSourceGroupFull;

                public final OptIfOTSnAPRStatusGroupEnt optIfOTSnAPRStatusGroup;

                public final OptIfOTSnAPRControlGroupEnt optIfOTSnAPRControlGroup;

                public final OptIfOTSnSinkGroupBasicEnt optIfOTSnSinkGroupBasic;

                public final OptIfOTSnSinkGroupFullEnt optIfOTSnSinkGroupFull;

                public final OptIfOTSnSinkPreOtnPMGroupEnt optIfOTSnSinkPreOtnPMGroup;

                public final OptIfOTSnSinkPreOtnPMThresholdGroupEnt optIfOTSnSinkPreOtnPMThresholdGroup;

                public final OptIfOTSnSourcePreOtnPMGroupEnt optIfOTSnSourcePreOtnPMGroup;

                public final OptIfOTSnSourcePreOtnPMThresholdGroupEnt optIfOTSnSourcePreOtnPMThresholdGroup;

                public final OptIfOMSnCommonGroupEnt optIfOMSnCommonGroup;

                public final OptIfOMSnSinkGroupBasicEnt optIfOMSnSinkGroupBasic;

                public final OptIfOMSnSinkPreOtnPMGroupEnt optIfOMSnSinkPreOtnPMGroup;

                public final OptIfOMSnSinkPreOtnPMThresholdGroupEnt optIfOMSnSinkPreOtnPMThresholdGroup;

                public final OptIfOMSnSourcePreOtnPMGroupEnt optIfOMSnSourcePreOtnPMGroup;

                public final OptIfOMSnSourcePreOtnPMThresholdGroupEnt optIfOMSnSourcePreOtnPMThresholdGroup;

                public final OptIfOChGroupCommonGroupEnt optIfOChGroupCommonGroup;

                public final OptIfOChGroupSinkPreOtnPMGroupEnt optIfOChGroupSinkPreOtnPMGroup;

                public final OptIfOChGroupSinkPreOtnPMThresholdGroupEnt optIfOChGroupSinkPreOtnPMThresholdGroup;

                public final OptIfOChGroupSourcePreOtnPMGroupEnt optIfOChGroupSourcePreOtnPMGroup;

                public final OptIfOChGroupSourcePreOtnPMThresholdGroupEnt optIfOChGroupSourcePreOtnPMThresholdGroup;

                public final OptIfOChCommonGroupEnt optIfOChCommonGroup;

                public final OptIfOChSinkGroupBasicEnt optIfOChSinkGroupBasic;

                public final OptIfOChSinkPreOtnPMGroupEnt optIfOChSinkPreOtnPMGroup;

                public final OptIfOChSinkPreOtnPMThresholdGroupEnt optIfOChSinkPreOtnPMThresholdGroup;

                public final OptIfOChSourcePreOtnPMGroupEnt optIfOChSourcePreOtnPMGroup;

                public final OptIfOChSourcePreOtnPMThresholdGroupEnt optIfOChSourcePreOtnPMThresholdGroup;

                public final OptIfOTUkCommonGroupEnt optIfOTUkCommonGroup;

                public final OptIfOTUkSourceGroupEnt optIfOTUkSourceGroup;

                public final OptIfOTUkSinkGroupEnt optIfOTUkSinkGroup;

                public final OptIfGCC0GroupEnt optIfGCC0Group;

                public final OptIfODUkGroupEnt optIfODUkGroup;

                public final OptIfODUkTtpSourceGroupEnt optIfODUkTtpSourceGroup;

                public final OptIfODUkTtpSinkGroupEnt optIfODUkTtpSinkGroup;

                public final OptIfODUkNimGroupEnt optIfODUkNimGroup;

                public final OptIfGCC12GroupEnt optIfGCC12Group;

                public final OptIfODUkTCommonGroupEnt optIfODUkTCommonGroup;

                public final OptIfODUkTSourceGroupEnt optIfODUkTSourceGroup;

                public final OptIfODUkTSinkGroupEnt optIfODUkTSinkGroup;

                public final OptIfODUkTSinkGroupCtpEnt optIfODUkTSinkGroupCtp;

                public final OptIfODUkTNimGroupEnt optIfODUkTNimGroup;

                private OptIfGroupsEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                {
                    super(mib, parent, "optIfGroups", "1.3.6.1.2.1.10.133.2.1", false, false, false, false);
                    this.optIfOTMnGroup = new OptIfOTMnGroupEnt(mib, this);
                    this.optIfPerfMonGroup = new OptIfPerfMonGroupEnt(mib, this);
                    this.optIfOTSnCommonGroup = new OptIfOTSnCommonGroupEnt(mib, this);
                    this.optIfOTSnSourceGroupFull = new OptIfOTSnSourceGroupFullEnt(mib, this);
                    this.optIfOTSnAPRStatusGroup = new OptIfOTSnAPRStatusGroupEnt(mib, this);
                    this.optIfOTSnAPRControlGroup = new OptIfOTSnAPRControlGroupEnt(mib, this);
                    this.optIfOTSnSinkGroupBasic = new OptIfOTSnSinkGroupBasicEnt(mib, this);
                    this.optIfOTSnSinkGroupFull = new OptIfOTSnSinkGroupFullEnt(mib, this);
                    this.optIfOTSnSinkPreOtnPMGroup = new OptIfOTSnSinkPreOtnPMGroupEnt(mib, this);
                    this.optIfOTSnSinkPreOtnPMThresholdGroup = new OptIfOTSnSinkPreOtnPMThresholdGroupEnt(mib, this);
                    this.optIfOTSnSourcePreOtnPMGroup = new OptIfOTSnSourcePreOtnPMGroupEnt(mib, this);
                    this.optIfOTSnSourcePreOtnPMThresholdGroup = new OptIfOTSnSourcePreOtnPMThresholdGroupEnt(mib, this);
                    this.optIfOMSnCommonGroup = new OptIfOMSnCommonGroupEnt(mib, this);
                    this.optIfOMSnSinkGroupBasic = new OptIfOMSnSinkGroupBasicEnt(mib, this);
                    this.optIfOMSnSinkPreOtnPMGroup = new OptIfOMSnSinkPreOtnPMGroupEnt(mib, this);
                    this.optIfOMSnSinkPreOtnPMThresholdGroup = new OptIfOMSnSinkPreOtnPMThresholdGroupEnt(mib, this);
                    this.optIfOMSnSourcePreOtnPMGroup = new OptIfOMSnSourcePreOtnPMGroupEnt(mib, this);
                    this.optIfOMSnSourcePreOtnPMThresholdGroup = new OptIfOMSnSourcePreOtnPMThresholdGroupEnt(mib, this);
                    this.optIfOChGroupCommonGroup = new OptIfOChGroupCommonGroupEnt(mib, this);
                    this.optIfOChGroupSinkPreOtnPMGroup = new OptIfOChGroupSinkPreOtnPMGroupEnt(mib, this);
                    this.optIfOChGroupSinkPreOtnPMThresholdGroup = new OptIfOChGroupSinkPreOtnPMThresholdGroupEnt(mib, this);
                    this.optIfOChGroupSourcePreOtnPMGroup = new OptIfOChGroupSourcePreOtnPMGroupEnt(mib, this);
                    this.optIfOChGroupSourcePreOtnPMThresholdGroup = new OptIfOChGroupSourcePreOtnPMThresholdGroupEnt(mib, this);
                    this.optIfOChCommonGroup = new OptIfOChCommonGroupEnt(mib, this);
                    this.optIfOChSinkGroupBasic = new OptIfOChSinkGroupBasicEnt(mib, this);
                    this.optIfOChSinkPreOtnPMGroup = new OptIfOChSinkPreOtnPMGroupEnt(mib, this);
                    this.optIfOChSinkPreOtnPMThresholdGroup = new OptIfOChSinkPreOtnPMThresholdGroupEnt(mib, this);
                    this.optIfOChSourcePreOtnPMGroup = new OptIfOChSourcePreOtnPMGroupEnt(mib, this);
                    this.optIfOChSourcePreOtnPMThresholdGroup = new OptIfOChSourcePreOtnPMThresholdGroupEnt(mib, this);
                    this.optIfOTUkCommonGroup = new OptIfOTUkCommonGroupEnt(mib, this);
                    this.optIfOTUkSourceGroup = new OptIfOTUkSourceGroupEnt(mib, this);
                    this.optIfOTUkSinkGroup = new OptIfOTUkSinkGroupEnt(mib, this);
                    this.optIfGCC0Group = new OptIfGCC0GroupEnt(mib, this);
                    this.optIfODUkGroup = new OptIfODUkGroupEnt(mib, this);
                    this.optIfODUkTtpSourceGroup = new OptIfODUkTtpSourceGroupEnt(mib, this);
                    this.optIfODUkTtpSinkGroup = new OptIfODUkTtpSinkGroupEnt(mib, this);
                    this.optIfODUkNimGroup = new OptIfODUkNimGroupEnt(mib, this);
                    this.optIfGCC12Group = new OptIfGCC12GroupEnt(mib, this);
                    this.optIfODUkTCommonGroup = new OptIfODUkTCommonGroupEnt(mib, this);
                    this.optIfODUkTSourceGroup = new OptIfODUkTSourceGroupEnt(mib, this);
                    this.optIfODUkTSinkGroup = new OptIfODUkTSinkGroupEnt(mib, this);
                    this.optIfODUkTSinkGroupCtp = new OptIfODUkTSinkGroupCtpEnt(mib, this);
                    this.optIfODUkTNimGroup = new OptIfODUkTNimGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.optIfOTMnGroup,
                        this.optIfPerfMonGroup,
                        this.optIfOTSnCommonGroup,
                        this.optIfOTSnSourceGroupFull,
                        this.optIfOTSnAPRStatusGroup,
                        this.optIfOTSnAPRControlGroup,
                        this.optIfOTSnSinkGroupBasic,
                        this.optIfOTSnSinkGroupFull,
                        this.optIfOTSnSinkPreOtnPMGroup,
                        this.optIfOTSnSinkPreOtnPMThresholdGroup,
                        this.optIfOTSnSourcePreOtnPMGroup,
                        this.optIfOTSnSourcePreOtnPMThresholdGroup,
                        this.optIfOMSnCommonGroup,
                        this.optIfOMSnSinkGroupBasic,
                        this.optIfOMSnSinkPreOtnPMGroup,
                        this.optIfOMSnSinkPreOtnPMThresholdGroup,
                        this.optIfOMSnSourcePreOtnPMGroup,
                        this.optIfOMSnSourcePreOtnPMThresholdGroup,
                        this.optIfOChGroupCommonGroup,
                        this.optIfOChGroupSinkPreOtnPMGroup,
                        this.optIfOChGroupSinkPreOtnPMThresholdGroup,
                        this.optIfOChGroupSourcePreOtnPMGroup,
                        this.optIfOChGroupSourcePreOtnPMThresholdGroup,
                        this.optIfOChCommonGroup,
                        this.optIfOChSinkGroupBasic,
                        this.optIfOChSinkPreOtnPMGroup,
                        this.optIfOChSinkPreOtnPMThresholdGroup,
                        this.optIfOChSourcePreOtnPMGroup,
                        this.optIfOChSourcePreOtnPMThresholdGroup,
                        this.optIfOTUkCommonGroup,
                        this.optIfOTUkSourceGroup,
                        this.optIfOTUkSinkGroup,
                        this.optIfGCC0Group,
                        this.optIfODUkGroup,
                        this.optIfODUkTtpSourceGroup,
                        this.optIfODUkTtpSinkGroup,
                        this.optIfODUkNimGroup,
                        this.optIfGCC12Group,
                        this.optIfODUkTCommonGroup,
                        this.optIfODUkTSourceGroup,
                        this.optIfODUkTSinkGroup,
                        this.optIfODUkTSinkGroupCtp,
                        this.optIfODUkTNimGroup
                    };
                }
                public static final class OptIfOTMnGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOTMnGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTMnGroup", "1.3.6.1.2.1.10.133.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfPerfMonGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfPerfMonGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfPerfMonGroup", "1.3.6.1.2.1.10.133.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOTSnCommonGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOTSnCommonGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnCommonGroup", "1.3.6.1.2.1.10.133.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOTSnSourceGroupFullEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOTSnSourceGroupFullEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnSourceGroupFull", "1.3.6.1.2.1.10.133.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOTSnAPRStatusGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOTSnAPRStatusGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnAPRStatusGroup", "1.3.6.1.2.1.10.133.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOTSnAPRControlGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOTSnAPRControlGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnAPRControlGroup", "1.3.6.1.2.1.10.133.2.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOTSnSinkGroupBasicEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOTSnSinkGroupBasicEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnSinkGroupBasic", "1.3.6.1.2.1.10.133.2.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOTSnSinkGroupFullEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOTSnSinkGroupFullEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnSinkGroupFull", "1.3.6.1.2.1.10.133.2.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOTSnSinkPreOtnPMGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOTSnSinkPreOtnPMGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnSinkPreOtnPMGroup", "1.3.6.1.2.1.10.133.2.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOTSnSinkPreOtnPMThresholdGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOTSnSinkPreOtnPMThresholdGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnSinkPreOtnPMThresholdGroup", "1.3.6.1.2.1.10.133.2.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOTSnSourcePreOtnPMGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOTSnSourcePreOtnPMGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnSourcePreOtnPMGroup", "1.3.6.1.2.1.10.133.2.1.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOTSnSourcePreOtnPMThresholdGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOTSnSourcePreOtnPMThresholdGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTSnSourcePreOtnPMThresholdGroup", "1.3.6.1.2.1.10.133.2.1.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOMSnCommonGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOMSnCommonGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOMSnCommonGroup", "1.3.6.1.2.1.10.133.2.1.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOMSnSinkGroupBasicEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOMSnSinkGroupBasicEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOMSnSinkGroupBasic", "1.3.6.1.2.1.10.133.2.1.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOMSnSinkPreOtnPMGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOMSnSinkPreOtnPMGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOMSnSinkPreOtnPMGroup", "1.3.6.1.2.1.10.133.2.1.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOMSnSinkPreOtnPMThresholdGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOMSnSinkPreOtnPMThresholdGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOMSnSinkPreOtnPMThresholdGroup", "1.3.6.1.2.1.10.133.2.1.16", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOMSnSourcePreOtnPMGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOMSnSourcePreOtnPMGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOMSnSourcePreOtnPMGroup", "1.3.6.1.2.1.10.133.2.1.17", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOMSnSourcePreOtnPMThresholdGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOMSnSourcePreOtnPMThresholdGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOMSnSourcePreOtnPMThresholdGroup", "1.3.6.1.2.1.10.133.2.1.18", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOChGroupCommonGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOChGroupCommonGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChGroupCommonGroup", "1.3.6.1.2.1.10.133.2.1.19", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOChGroupSinkPreOtnPMGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOChGroupSinkPreOtnPMGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChGroupSinkPreOtnPMGroup", "1.3.6.1.2.1.10.133.2.1.20", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOChGroupSinkPreOtnPMThresholdGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOChGroupSinkPreOtnPMThresholdGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChGroupSinkPreOtnPMThresholdGroup", "1.3.6.1.2.1.10.133.2.1.21", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOChGroupSourcePreOtnPMGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOChGroupSourcePreOtnPMGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChGroupSourcePreOtnPMGroup", "1.3.6.1.2.1.10.133.2.1.22", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOChGroupSourcePreOtnPMThresholdGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOChGroupSourcePreOtnPMThresholdGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChGroupSourcePreOtnPMThresholdGroup", "1.3.6.1.2.1.10.133.2.1.23", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOChCommonGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOChCommonGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChCommonGroup", "1.3.6.1.2.1.10.133.2.1.24", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOChSinkGroupBasicEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOChSinkGroupBasicEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChSinkGroupBasic", "1.3.6.1.2.1.10.133.2.1.25", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOChSinkPreOtnPMGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOChSinkPreOtnPMGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChSinkPreOtnPMGroup", "1.3.6.1.2.1.10.133.2.1.26", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOChSinkPreOtnPMThresholdGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOChSinkPreOtnPMThresholdGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChSinkPreOtnPMThresholdGroup", "1.3.6.1.2.1.10.133.2.1.27", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOChSourcePreOtnPMGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOChSourcePreOtnPMGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChSourcePreOtnPMGroup", "1.3.6.1.2.1.10.133.2.1.28", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOChSourcePreOtnPMThresholdGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOChSourcePreOtnPMThresholdGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOChSourcePreOtnPMThresholdGroup", "1.3.6.1.2.1.10.133.2.1.29", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOTUkCommonGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOTUkCommonGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTUkCommonGroup", "1.3.6.1.2.1.10.133.2.1.30", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOTUkSourceGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOTUkSourceGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTUkSourceGroup", "1.3.6.1.2.1.10.133.2.1.31", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfOTUkSinkGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOTUkSinkGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOTUkSinkGroup", "1.3.6.1.2.1.10.133.2.1.32", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfGCC0GroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfGCC0GroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfGCC0Group", "1.3.6.1.2.1.10.133.2.1.33", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfODUkGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfODUkGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfODUkGroup", "1.3.6.1.2.1.10.133.2.1.34", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfODUkTtpSourceGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfODUkTtpSourceGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfODUkTtpSourceGroup", "1.3.6.1.2.1.10.133.2.1.35", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfODUkTtpSinkGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfODUkTtpSinkGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfODUkTtpSinkGroup", "1.3.6.1.2.1.10.133.2.1.36", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfODUkNimGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfODUkNimGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfODUkNimGroup", "1.3.6.1.2.1.10.133.2.1.37", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfGCC12GroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfGCC12GroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfGCC12Group", "1.3.6.1.2.1.10.133.2.1.38", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfODUkTCommonGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfODUkTCommonGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfODUkTCommonGroup", "1.3.6.1.2.1.10.133.2.1.39", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfODUkTSourceGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfODUkTSourceGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfODUkTSourceGroup", "1.3.6.1.2.1.10.133.2.1.40", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfODUkTSinkGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfODUkTSinkGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfODUkTSinkGroup", "1.3.6.1.2.1.10.133.2.1.41", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfODUkTSinkGroupCtpEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfODUkTSinkGroupCtpEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfODUkTSinkGroupCtp", "1.3.6.1.2.1.10.133.2.1.42", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfODUkTNimGroupEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfODUkTNimGroupEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfODUkTNimGroup", "1.3.6.1.2.1.10.133.2.1.43", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class OptIfComplEnt extends MIBEntry<OPTIFMIBDef>
            {
                /** compliance specifications*/
                public final OptIfOtnConfigComplEnt optIfOtnConfigCompl;

                public final OptIfPreOtnPMComplEnt optIfPreOtnPMCompl;

                private OptIfComplEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                {
                    super(mib, parent, "optIfCompl", "1.3.6.1.2.1.10.133.2.2", false, false, false, false);
                    this.optIfOtnConfigCompl = new OptIfOtnConfigComplEnt(mib, this);
                    this.optIfPreOtnPMCompl = new OptIfPreOtnPMComplEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.optIfOtnConfigCompl,
                        this.optIfPreOtnPMCompl
                    };
                }
                public static final class OptIfOtnConfigComplEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfOtnConfigComplEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfOtnConfigCompl", "1.3.6.1.2.1.10.133.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OptIfPreOtnPMComplEnt extends MIBEntry<OPTIFMIBDef>
                {
                    private OptIfPreOtnPMComplEnt(OPTIFMIBDef mib, MIBEntry<OPTIFMIBDef> parent)
                    {
                        super(mib, parent, "optIfPreOtnPMCompl", "1.3.6.1.2.1.10.133.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
