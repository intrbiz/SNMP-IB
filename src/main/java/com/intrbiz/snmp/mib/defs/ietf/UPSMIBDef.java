package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class UPSMIBDef extends MIB
{
    public static final UPSMIBDef UPSMIB = new UPSMIBDef();

    public final UpsMIBEnt upsMIB;

    private UPSMIBDef()
    {
        super("UPS-MIB");
        this.upsMIB = new UpsMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.upsMIB
        };
    }

    public static final class UpsMIBEnt extends MIBEntry<UPSMIBDef>
    {
        public final UpsObjectsEnt upsObjects;

        /** notifications, i.e., traps*/
        public final UpsTrapsEnt upsTraps;

        /** conformance information*/
        public final UpsConformanceEnt upsConformance;

        private UpsMIBEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
        {
            super(mib, parent, "upsMIB", "1.3.6.1.2.1.33", false, false, false, false);
            this.upsObjects = new UpsObjectsEnt(mib, this);
            this.upsTraps = new UpsTrapsEnt(mib, this);
            this.upsConformance = new UpsConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.upsObjects,
                this.upsTraps,
                this.upsConformance
            };
        }
        public static final class UpsObjectsEnt extends MIBEntry<UPSMIBDef>
        {
            /** The Device Identification group.All objects in this group except for upsIdentName andupsIdentAttachedDevices are set at device initializationand remain static.*/
            public final UpsIdentEnt upsIdent;

            /** Battery Group*/
            public final UpsBatteryEnt upsBattery;

            /** Input Group*/
            public final UpsInputEnt upsInput;

            /** The Output group.*/
            public final UpsOutputEnt upsOutput;

            /** The Bypass group.*/
            public final UpsBypassEnt upsBypass;

            /** The Alarm group.*/
            public final UpsAlarmEnt upsAlarm;

            /** The Test Group*/
            public final UpsTestEnt upsTest;

            /** The Control group.*/
            public final UpsControlEnt upsControl;

            /** The Configuration group.*/
            public final UpsConfigEnt upsConfig;

            private UpsObjectsEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
            {
                super(mib, parent, "upsObjects", "1.3.6.1.2.1.33.1", false, false, false, false);
                this.upsIdent = new UpsIdentEnt(mib, this);
                this.upsBattery = new UpsBatteryEnt(mib, this);
                this.upsInput = new UpsInputEnt(mib, this);
                this.upsOutput = new UpsOutputEnt(mib, this);
                this.upsBypass = new UpsBypassEnt(mib, this);
                this.upsAlarm = new UpsAlarmEnt(mib, this);
                this.upsTest = new UpsTestEnt(mib, this);
                this.upsControl = new UpsControlEnt(mib, this);
                this.upsConfig = new UpsConfigEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.upsIdent,
                    this.upsBattery,
                    this.upsInput,
                    this.upsOutput,
                    this.upsBypass,
                    this.upsAlarm,
                    this.upsTest,
                    this.upsControl,
                    this.upsConfig
                };
            }
            public static final class UpsIdentEnt extends MIBEntry<UPSMIBDef>
            {
                public final UpsIdentManufacturerEnt upsIdentManufacturer;

                public final UpsIdentModelEnt upsIdentModel;

                public final UpsIdentUPSSoftwareVersionEnt upsIdentUPSSoftwareVersion;

                public final UpsIdentAgentSoftwareVersionEnt upsIdentAgentSoftwareVersion;

                public final UpsIdentNameEnt upsIdentName;

                public final UpsIdentAttachedDevicesEnt upsIdentAttachedDevices;

                private UpsIdentEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                {
                    super(mib, parent, "upsIdent", "1.3.6.1.2.1.33.1.1", false, false, false, false);
                    this.upsIdentManufacturer = new UpsIdentManufacturerEnt(mib, this);
                    this.upsIdentModel = new UpsIdentModelEnt(mib, this);
                    this.upsIdentUPSSoftwareVersion = new UpsIdentUPSSoftwareVersionEnt(mib, this);
                    this.upsIdentAgentSoftwareVersion = new UpsIdentAgentSoftwareVersionEnt(mib, this);
                    this.upsIdentName = new UpsIdentNameEnt(mib, this);
                    this.upsIdentAttachedDevices = new UpsIdentAttachedDevicesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.upsIdentManufacturer,
                        this.upsIdentModel,
                        this.upsIdentUPSSoftwareVersion,
                        this.upsIdentAgentSoftwareVersion,
                        this.upsIdentName,
                        this.upsIdentAttachedDevices
                    };
                }
                public static final class UpsIdentManufacturerEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsIdentManufacturerEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsIdentManufacturer", "1.3.6.1.2.1.33.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsIdentModelEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsIdentModelEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsIdentModel", "1.3.6.1.2.1.33.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsIdentUPSSoftwareVersionEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsIdentUPSSoftwareVersionEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsIdentUPSSoftwareVersion", "1.3.6.1.2.1.33.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsIdentAgentSoftwareVersionEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsIdentAgentSoftwareVersionEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsIdentAgentSoftwareVersion", "1.3.6.1.2.1.33.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsIdentNameEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsIdentNameEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsIdentName", "1.3.6.1.2.1.33.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsIdentAttachedDevicesEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsIdentAttachedDevicesEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsIdentAttachedDevices", "1.3.6.1.2.1.33.1.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class UpsBatteryEnt extends MIBEntry<UPSMIBDef>
            {
                public final UpsBatteryStatusEnt upsBatteryStatus;

                public final UpsSecondsOnBatteryEnt upsSecondsOnBattery;

                public final UpsEstimatedMinutesRemainingEnt upsEstimatedMinutesRemaining;

                public final UpsEstimatedChargeRemainingEnt upsEstimatedChargeRemaining;

                public final UpsBatteryVoltageEnt upsBatteryVoltage;

                public final UpsBatteryCurrentEnt upsBatteryCurrent;

                public final UpsBatteryTemperatureEnt upsBatteryTemperature;

                private UpsBatteryEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                {
                    super(mib, parent, "upsBattery", "1.3.6.1.2.1.33.1.2", false, false, false, false);
                    this.upsBatteryStatus = new UpsBatteryStatusEnt(mib, this);
                    this.upsSecondsOnBattery = new UpsSecondsOnBatteryEnt(mib, this);
                    this.upsEstimatedMinutesRemaining = new UpsEstimatedMinutesRemainingEnt(mib, this);
                    this.upsEstimatedChargeRemaining = new UpsEstimatedChargeRemainingEnt(mib, this);
                    this.upsBatteryVoltage = new UpsBatteryVoltageEnt(mib, this);
                    this.upsBatteryCurrent = new UpsBatteryCurrentEnt(mib, this);
                    this.upsBatteryTemperature = new UpsBatteryTemperatureEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.upsBatteryStatus,
                        this.upsSecondsOnBattery,
                        this.upsEstimatedMinutesRemaining,
                        this.upsEstimatedChargeRemaining,
                        this.upsBatteryVoltage,
                        this.upsBatteryCurrent,
                        this.upsBatteryTemperature
                    };
                }
                public static final class UpsBatteryStatusEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsBatteryStatusEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsBatteryStatus", "1.3.6.1.2.1.33.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsSecondsOnBatteryEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsSecondsOnBatteryEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsSecondsOnBattery", "1.3.6.1.2.1.33.1.2.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsEstimatedMinutesRemainingEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsEstimatedMinutesRemainingEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsEstimatedMinutesRemaining", "1.3.6.1.2.1.33.1.2.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsEstimatedChargeRemainingEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsEstimatedChargeRemainingEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsEstimatedChargeRemaining", "1.3.6.1.2.1.33.1.2.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsBatteryVoltageEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsBatteryVoltageEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsBatteryVoltage", "1.3.6.1.2.1.33.1.2.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsBatteryCurrentEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsBatteryCurrentEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsBatteryCurrent", "1.3.6.1.2.1.33.1.2.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsBatteryTemperatureEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsBatteryTemperatureEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsBatteryTemperature", "1.3.6.1.2.1.33.1.2.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class UpsInputEnt extends MIBEntry<UPSMIBDef>
            {
                public final UpsInputLineBadsEnt upsInputLineBads;

                public final UpsInputNumLinesEnt upsInputNumLines;

                public final UpsInputTableEnt upsInputTable;

                private UpsInputEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                {
                    super(mib, parent, "upsInput", "1.3.6.1.2.1.33.1.3", false, false, false, false);
                    this.upsInputLineBads = new UpsInputLineBadsEnt(mib, this);
                    this.upsInputNumLines = new UpsInputNumLinesEnt(mib, this);
                    this.upsInputTable = new UpsInputTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.upsInputLineBads,
                        this.upsInputNumLines,
                        this.upsInputTable
                    };
                }
                public static final class UpsInputLineBadsEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsInputLineBadsEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsInputLineBads", "1.3.6.1.2.1.33.1.3.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsInputNumLinesEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsInputNumLinesEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsInputNumLines", "1.3.6.1.2.1.33.1.3.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsInputTableEnt extends MIBEntry<UPSMIBDef>
                {
                    public final UpsInputEntryEnt upsInputEntry;

                    private UpsInputTableEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsInputTable", "1.3.6.1.2.1.33.1.3.3", false, true, false, false);
                        this.upsInputEntry = new UpsInputEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.upsInputEntry
                        };
                    }
                    public static final class UpsInputEntryEnt extends MIBEntry<UPSMIBDef>
                    {
                        public final UpsInputLineIndexEnt upsInputLineIndex;

                        public final UpsInputFrequencyEnt upsInputFrequency;

                        public final UpsInputVoltageEnt upsInputVoltage;

                        public final UpsInputCurrentEnt upsInputCurrent;

                        public final UpsInputTruePowerEnt upsInputTruePower;

                        private UpsInputEntryEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsInputEntry", "1.3.6.1.2.1.33.1.3.3.1", false, false, false, true);
                            this.upsInputLineIndex = new UpsInputLineIndexEnt(mib, this);
                            this.upsInputFrequency = new UpsInputFrequencyEnt(mib, this);
                            this.upsInputVoltage = new UpsInputVoltageEnt(mib, this);
                            this.upsInputCurrent = new UpsInputCurrentEnt(mib, this);
                            this.upsInputTruePower = new UpsInputTruePowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.upsInputLineIndex,
                                this.upsInputFrequency,
                                this.upsInputVoltage,
                                this.upsInputCurrent,
                                this.upsInputTruePower
                            };
                        }
                        public static final class UpsInputLineIndexEnt extends MIBEntry<UPSMIBDef>
                        {
                            private UpsInputLineIndexEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                            {
                                super(mib, parent, "upsInputLineIndex", "1.3.6.1.2.1.33.1.3.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UpsInputFrequencyEnt extends MIBEntry<UPSMIBDef>
                        {
                            private UpsInputFrequencyEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                            {
                                super(mib, parent, "upsInputFrequency", "1.3.6.1.2.1.33.1.3.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UpsInputVoltageEnt extends MIBEntry<UPSMIBDef>
                        {
                            private UpsInputVoltageEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                            {
                                super(mib, parent, "upsInputVoltage", "1.3.6.1.2.1.33.1.3.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UpsInputCurrentEnt extends MIBEntry<UPSMIBDef>
                        {
                            private UpsInputCurrentEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                            {
                                super(mib, parent, "upsInputCurrent", "1.3.6.1.2.1.33.1.3.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UpsInputTruePowerEnt extends MIBEntry<UPSMIBDef>
                        {
                            private UpsInputTruePowerEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                            {
                                super(mib, parent, "upsInputTruePower", "1.3.6.1.2.1.33.1.3.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class UpsOutputEnt extends MIBEntry<UPSMIBDef>
            {
                public final UpsOutputSourceEnt upsOutputSource;

                public final UpsOutputFrequencyEnt upsOutputFrequency;

                public final UpsOutputNumLinesEnt upsOutputNumLines;

                public final UpsOutputTableEnt upsOutputTable;

                private UpsOutputEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                {
                    super(mib, parent, "upsOutput", "1.3.6.1.2.1.33.1.4", false, false, false, false);
                    this.upsOutputSource = new UpsOutputSourceEnt(mib, this);
                    this.upsOutputFrequency = new UpsOutputFrequencyEnt(mib, this);
                    this.upsOutputNumLines = new UpsOutputNumLinesEnt(mib, this);
                    this.upsOutputTable = new UpsOutputTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.upsOutputSource,
                        this.upsOutputFrequency,
                        this.upsOutputNumLines,
                        this.upsOutputTable
                    };
                }
                public static final class UpsOutputSourceEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsOutputSourceEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsOutputSource", "1.3.6.1.2.1.33.1.4.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsOutputFrequencyEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsOutputFrequencyEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsOutputFrequency", "1.3.6.1.2.1.33.1.4.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsOutputNumLinesEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsOutputNumLinesEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsOutputNumLines", "1.3.6.1.2.1.33.1.4.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsOutputTableEnt extends MIBEntry<UPSMIBDef>
                {
                    public final UpsOutputEntryEnt upsOutputEntry;

                    private UpsOutputTableEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsOutputTable", "1.3.6.1.2.1.33.1.4.4", false, true, false, false);
                        this.upsOutputEntry = new UpsOutputEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.upsOutputEntry
                        };
                    }
                    public static final class UpsOutputEntryEnt extends MIBEntry<UPSMIBDef>
                    {
                        public final UpsOutputLineIndexEnt upsOutputLineIndex;

                        public final UpsOutputVoltageEnt upsOutputVoltage;

                        public final UpsOutputCurrentEnt upsOutputCurrent;

                        public final UpsOutputPowerEnt upsOutputPower;

                        public final UpsOutputPercentLoadEnt upsOutputPercentLoad;

                        private UpsOutputEntryEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsOutputEntry", "1.3.6.1.2.1.33.1.4.4.1", false, false, false, true);
                            this.upsOutputLineIndex = new UpsOutputLineIndexEnt(mib, this);
                            this.upsOutputVoltage = new UpsOutputVoltageEnt(mib, this);
                            this.upsOutputCurrent = new UpsOutputCurrentEnt(mib, this);
                            this.upsOutputPower = new UpsOutputPowerEnt(mib, this);
                            this.upsOutputPercentLoad = new UpsOutputPercentLoadEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.upsOutputLineIndex,
                                this.upsOutputVoltage,
                                this.upsOutputCurrent,
                                this.upsOutputPower,
                                this.upsOutputPercentLoad
                            };
                        }
                        public static final class UpsOutputLineIndexEnt extends MIBEntry<UPSMIBDef>
                        {
                            private UpsOutputLineIndexEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                            {
                                super(mib, parent, "upsOutputLineIndex", "1.3.6.1.2.1.33.1.4.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UpsOutputVoltageEnt extends MIBEntry<UPSMIBDef>
                        {
                            private UpsOutputVoltageEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                            {
                                super(mib, parent, "upsOutputVoltage", "1.3.6.1.2.1.33.1.4.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UpsOutputCurrentEnt extends MIBEntry<UPSMIBDef>
                        {
                            private UpsOutputCurrentEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                            {
                                super(mib, parent, "upsOutputCurrent", "1.3.6.1.2.1.33.1.4.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UpsOutputPowerEnt extends MIBEntry<UPSMIBDef>
                        {
                            private UpsOutputPowerEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                            {
                                super(mib, parent, "upsOutputPower", "1.3.6.1.2.1.33.1.4.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UpsOutputPercentLoadEnt extends MIBEntry<UPSMIBDef>
                        {
                            private UpsOutputPercentLoadEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                            {
                                super(mib, parent, "upsOutputPercentLoad", "1.3.6.1.2.1.33.1.4.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class UpsBypassEnt extends MIBEntry<UPSMIBDef>
            {
                public final UpsBypassFrequencyEnt upsBypassFrequency;

                public final UpsBypassNumLinesEnt upsBypassNumLines;

                public final UpsBypassTableEnt upsBypassTable;

                private UpsBypassEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                {
                    super(mib, parent, "upsBypass", "1.3.6.1.2.1.33.1.5", false, false, false, false);
                    this.upsBypassFrequency = new UpsBypassFrequencyEnt(mib, this);
                    this.upsBypassNumLines = new UpsBypassNumLinesEnt(mib, this);
                    this.upsBypassTable = new UpsBypassTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.upsBypassFrequency,
                        this.upsBypassNumLines,
                        this.upsBypassTable
                    };
                }
                public static final class UpsBypassFrequencyEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsBypassFrequencyEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsBypassFrequency", "1.3.6.1.2.1.33.1.5.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsBypassNumLinesEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsBypassNumLinesEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsBypassNumLines", "1.3.6.1.2.1.33.1.5.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsBypassTableEnt extends MIBEntry<UPSMIBDef>
                {
                    public final UpsBypassEntryEnt upsBypassEntry;

                    private UpsBypassTableEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsBypassTable", "1.3.6.1.2.1.33.1.5.3", false, true, false, false);
                        this.upsBypassEntry = new UpsBypassEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.upsBypassEntry
                        };
                    }
                    public static final class UpsBypassEntryEnt extends MIBEntry<UPSMIBDef>
                    {
                        public final UpsBypassLineIndexEnt upsBypassLineIndex;

                        public final UpsBypassVoltageEnt upsBypassVoltage;

                        public final UpsBypassCurrentEnt upsBypassCurrent;

                        public final UpsBypassPowerEnt upsBypassPower;

                        private UpsBypassEntryEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsBypassEntry", "1.3.6.1.2.1.33.1.5.3.1", false, false, false, true);
                            this.upsBypassLineIndex = new UpsBypassLineIndexEnt(mib, this);
                            this.upsBypassVoltage = new UpsBypassVoltageEnt(mib, this);
                            this.upsBypassCurrent = new UpsBypassCurrentEnt(mib, this);
                            this.upsBypassPower = new UpsBypassPowerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.upsBypassLineIndex,
                                this.upsBypassVoltage,
                                this.upsBypassCurrent,
                                this.upsBypassPower
                            };
                        }
                        public static final class UpsBypassLineIndexEnt extends MIBEntry<UPSMIBDef>
                        {
                            private UpsBypassLineIndexEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                            {
                                super(mib, parent, "upsBypassLineIndex", "1.3.6.1.2.1.33.1.5.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UpsBypassVoltageEnt extends MIBEntry<UPSMIBDef>
                        {
                            private UpsBypassVoltageEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                            {
                                super(mib, parent, "upsBypassVoltage", "1.3.6.1.2.1.33.1.5.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UpsBypassCurrentEnt extends MIBEntry<UPSMIBDef>
                        {
                            private UpsBypassCurrentEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                            {
                                super(mib, parent, "upsBypassCurrent", "1.3.6.1.2.1.33.1.5.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UpsBypassPowerEnt extends MIBEntry<UPSMIBDef>
                        {
                            private UpsBypassPowerEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                            {
                                super(mib, parent, "upsBypassPower", "1.3.6.1.2.1.33.1.5.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class UpsAlarmEnt extends MIBEntry<UPSMIBDef>
            {
                public final UpsAlarmsPresentEnt upsAlarmsPresent;

                public final UpsAlarmTableEnt upsAlarmTable;

                /** Well known alarm conditions.*/
                public final UpsWellKnownAlarmsEnt upsWellKnownAlarms;

                private UpsAlarmEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                {
                    super(mib, parent, "upsAlarm", "1.3.6.1.2.1.33.1.6", false, false, false, false);
                    this.upsAlarmsPresent = new UpsAlarmsPresentEnt(mib, this);
                    this.upsAlarmTable = new UpsAlarmTableEnt(mib, this);
                    this.upsWellKnownAlarms = new UpsWellKnownAlarmsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.upsAlarmsPresent,
                        this.upsAlarmTable,
                        this.upsWellKnownAlarms
                    };
                }
                public static final class UpsAlarmsPresentEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsAlarmsPresentEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsAlarmsPresent", "1.3.6.1.2.1.33.1.6.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsAlarmTableEnt extends MIBEntry<UPSMIBDef>
                {
                    public final UpsAlarmEntryEnt upsAlarmEntry;

                    private UpsAlarmTableEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsAlarmTable", "1.3.6.1.2.1.33.1.6.2", false, true, false, false);
                        this.upsAlarmEntry = new UpsAlarmEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.upsAlarmEntry
                        };
                    }
                    public static final class UpsAlarmEntryEnt extends MIBEntry<UPSMIBDef>
                    {
                        public final UpsAlarmIdEnt upsAlarmId;

                        public final UpsAlarmDescrEnt upsAlarmDescr;

                        public final UpsAlarmTimeEnt upsAlarmTime;

                        private UpsAlarmEntryEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmEntry", "1.3.6.1.2.1.33.1.6.2.1", false, false, false, true);
                            this.upsAlarmId = new UpsAlarmIdEnt(mib, this);
                            this.upsAlarmDescr = new UpsAlarmDescrEnt(mib, this);
                            this.upsAlarmTime = new UpsAlarmTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.upsAlarmId,
                                this.upsAlarmDescr,
                                this.upsAlarmTime
                            };
                        }
                        public static final class UpsAlarmIdEnt extends MIBEntry<UPSMIBDef>
                        {
                            private UpsAlarmIdEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                            {
                                super(mib, parent, "upsAlarmId", "1.3.6.1.2.1.33.1.6.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UpsAlarmDescrEnt extends MIBEntry<UPSMIBDef>
                        {
                            private UpsAlarmDescrEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                            {
                                super(mib, parent, "upsAlarmDescr", "1.3.6.1.2.1.33.1.6.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UpsAlarmTimeEnt extends MIBEntry<UPSMIBDef>
                        {
                            private UpsAlarmTimeEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                            {
                                super(mib, parent, "upsAlarmTime", "1.3.6.1.2.1.33.1.6.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class UpsWellKnownAlarmsEnt extends MIBEntry<UPSMIBDef>
                {
                    public final UpsAlarmBatteryBadEnt upsAlarmBatteryBad;

                    public final UpsAlarmOnBatteryEnt upsAlarmOnBattery;

                    public final UpsAlarmLowBatteryEnt upsAlarmLowBattery;

                    public final UpsAlarmDepletedBatteryEnt upsAlarmDepletedBattery;

                    public final UpsAlarmTempBadEnt upsAlarmTempBad;

                    public final UpsAlarmInputBadEnt upsAlarmInputBad;

                    public final UpsAlarmOutputBadEnt upsAlarmOutputBad;

                    public final UpsAlarmOutputOverloadEnt upsAlarmOutputOverload;

                    public final UpsAlarmOnBypassEnt upsAlarmOnBypass;

                    public final UpsAlarmBypassBadEnt upsAlarmBypassBad;

                    public final UpsAlarmOutputOffAsRequestedEnt upsAlarmOutputOffAsRequested;

                    public final UpsAlarmUpsOffAsRequestedEnt upsAlarmUpsOffAsRequested;

                    public final UpsAlarmChargerFailedEnt upsAlarmChargerFailed;

                    public final UpsAlarmUpsOutputOffEnt upsAlarmUpsOutputOff;

                    public final UpsAlarmUpsSystemOffEnt upsAlarmUpsSystemOff;

                    public final UpsAlarmFanFailureEnt upsAlarmFanFailure;

                    public final UpsAlarmFuseFailureEnt upsAlarmFuseFailure;

                    public final UpsAlarmGeneralFaultEnt upsAlarmGeneralFault;

                    public final UpsAlarmDiagnosticTestFailedEnt upsAlarmDiagnosticTestFailed;

                    public final UpsAlarmCommunicationsLostEnt upsAlarmCommunicationsLost;

                    public final UpsAlarmAwaitingPowerEnt upsAlarmAwaitingPower;

                    public final UpsAlarmShutdownPendingEnt upsAlarmShutdownPending;

                    public final UpsAlarmShutdownImminentEnt upsAlarmShutdownImminent;

                    public final UpsAlarmTestInProgressEnt upsAlarmTestInProgress;

                    private UpsWellKnownAlarmsEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsWellKnownAlarms", "1.3.6.1.2.1.33.1.6.3", false, false, false, false);
                        this.upsAlarmBatteryBad = new UpsAlarmBatteryBadEnt(mib, this);
                        this.upsAlarmOnBattery = new UpsAlarmOnBatteryEnt(mib, this);
                        this.upsAlarmLowBattery = new UpsAlarmLowBatteryEnt(mib, this);
                        this.upsAlarmDepletedBattery = new UpsAlarmDepletedBatteryEnt(mib, this);
                        this.upsAlarmTempBad = new UpsAlarmTempBadEnt(mib, this);
                        this.upsAlarmInputBad = new UpsAlarmInputBadEnt(mib, this);
                        this.upsAlarmOutputBad = new UpsAlarmOutputBadEnt(mib, this);
                        this.upsAlarmOutputOverload = new UpsAlarmOutputOverloadEnt(mib, this);
                        this.upsAlarmOnBypass = new UpsAlarmOnBypassEnt(mib, this);
                        this.upsAlarmBypassBad = new UpsAlarmBypassBadEnt(mib, this);
                        this.upsAlarmOutputOffAsRequested = new UpsAlarmOutputOffAsRequestedEnt(mib, this);
                        this.upsAlarmUpsOffAsRequested = new UpsAlarmUpsOffAsRequestedEnt(mib, this);
                        this.upsAlarmChargerFailed = new UpsAlarmChargerFailedEnt(mib, this);
                        this.upsAlarmUpsOutputOff = new UpsAlarmUpsOutputOffEnt(mib, this);
                        this.upsAlarmUpsSystemOff = new UpsAlarmUpsSystemOffEnt(mib, this);
                        this.upsAlarmFanFailure = new UpsAlarmFanFailureEnt(mib, this);
                        this.upsAlarmFuseFailure = new UpsAlarmFuseFailureEnt(mib, this);
                        this.upsAlarmGeneralFault = new UpsAlarmGeneralFaultEnt(mib, this);
                        this.upsAlarmDiagnosticTestFailed = new UpsAlarmDiagnosticTestFailedEnt(mib, this);
                        this.upsAlarmCommunicationsLost = new UpsAlarmCommunicationsLostEnt(mib, this);
                        this.upsAlarmAwaitingPower = new UpsAlarmAwaitingPowerEnt(mib, this);
                        this.upsAlarmShutdownPending = new UpsAlarmShutdownPendingEnt(mib, this);
                        this.upsAlarmShutdownImminent = new UpsAlarmShutdownImminentEnt(mib, this);
                        this.upsAlarmTestInProgress = new UpsAlarmTestInProgressEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.upsAlarmBatteryBad,
                            this.upsAlarmOnBattery,
                            this.upsAlarmLowBattery,
                            this.upsAlarmDepletedBattery,
                            this.upsAlarmTempBad,
                            this.upsAlarmInputBad,
                            this.upsAlarmOutputBad,
                            this.upsAlarmOutputOverload,
                            this.upsAlarmOnBypass,
                            this.upsAlarmBypassBad,
                            this.upsAlarmOutputOffAsRequested,
                            this.upsAlarmUpsOffAsRequested,
                            this.upsAlarmChargerFailed,
                            this.upsAlarmUpsOutputOff,
                            this.upsAlarmUpsSystemOff,
                            this.upsAlarmFanFailure,
                            this.upsAlarmFuseFailure,
                            this.upsAlarmGeneralFault,
                            this.upsAlarmDiagnosticTestFailed,
                            this.upsAlarmCommunicationsLost,
                            this.upsAlarmAwaitingPower,
                            this.upsAlarmShutdownPending,
                            this.upsAlarmShutdownImminent,
                            this.upsAlarmTestInProgress
                        };
                    }
                    public static final class UpsAlarmBatteryBadEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmBatteryBadEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmBatteryBad", "1.3.6.1.2.1.33.1.6.3.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmOnBatteryEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmOnBatteryEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmOnBattery", "1.3.6.1.2.1.33.1.6.3.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmLowBatteryEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmLowBatteryEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmLowBattery", "1.3.6.1.2.1.33.1.6.3.3", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmDepletedBatteryEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmDepletedBatteryEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmDepletedBattery", "1.3.6.1.2.1.33.1.6.3.4", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmTempBadEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmTempBadEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmTempBad", "1.3.6.1.2.1.33.1.6.3.5", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmInputBadEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmInputBadEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmInputBad", "1.3.6.1.2.1.33.1.6.3.6", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmOutputBadEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmOutputBadEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmOutputBad", "1.3.6.1.2.1.33.1.6.3.7", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmOutputOverloadEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmOutputOverloadEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmOutputOverload", "1.3.6.1.2.1.33.1.6.3.8", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmOnBypassEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmOnBypassEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmOnBypass", "1.3.6.1.2.1.33.1.6.3.9", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmBypassBadEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmBypassBadEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmBypassBad", "1.3.6.1.2.1.33.1.6.3.10", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmOutputOffAsRequestedEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmOutputOffAsRequestedEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmOutputOffAsRequested", "1.3.6.1.2.1.33.1.6.3.11", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmUpsOffAsRequestedEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmUpsOffAsRequestedEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmUpsOffAsRequested", "1.3.6.1.2.1.33.1.6.3.12", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmChargerFailedEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmChargerFailedEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmChargerFailed", "1.3.6.1.2.1.33.1.6.3.13", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmUpsOutputOffEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmUpsOutputOffEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmUpsOutputOff", "1.3.6.1.2.1.33.1.6.3.14", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmUpsSystemOffEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmUpsSystemOffEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmUpsSystemOff", "1.3.6.1.2.1.33.1.6.3.15", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmFanFailureEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmFanFailureEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmFanFailure", "1.3.6.1.2.1.33.1.6.3.16", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmFuseFailureEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmFuseFailureEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmFuseFailure", "1.3.6.1.2.1.33.1.6.3.17", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmGeneralFaultEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmGeneralFaultEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmGeneralFault", "1.3.6.1.2.1.33.1.6.3.18", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmDiagnosticTestFailedEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmDiagnosticTestFailedEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmDiagnosticTestFailed", "1.3.6.1.2.1.33.1.6.3.19", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmCommunicationsLostEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmCommunicationsLostEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmCommunicationsLost", "1.3.6.1.2.1.33.1.6.3.20", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmAwaitingPowerEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmAwaitingPowerEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmAwaitingPower", "1.3.6.1.2.1.33.1.6.3.21", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmShutdownPendingEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmShutdownPendingEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmShutdownPending", "1.3.6.1.2.1.33.1.6.3.22", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmShutdownImminentEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmShutdownImminentEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmShutdownImminent", "1.3.6.1.2.1.33.1.6.3.23", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsAlarmTestInProgressEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsAlarmTestInProgressEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsAlarmTestInProgress", "1.3.6.1.2.1.33.1.6.3.24", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class UpsTestEnt extends MIBEntry<UPSMIBDef>
            {
                public final UpsTestIdEnt upsTestId;

                /** see [6] for more information on the semantics of objects withsyntax of TestAndIncr*/
                public final UpsTestSpinLockEnt upsTestSpinLock;

                public final UpsTestResultsSummaryEnt upsTestResultsSummary;

                public final UpsTestResultsDetailEnt upsTestResultsDetail;

                public final UpsTestStartTimeEnt upsTestStartTime;

                public final UpsTestElapsedTimeEnt upsTestElapsedTime;

                /** Well known tests.*/
                public final UpsWellKnownTestsEnt upsWellKnownTests;

                private UpsTestEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                {
                    super(mib, parent, "upsTest", "1.3.6.1.2.1.33.1.7", false, false, false, false);
                    this.upsTestId = new UpsTestIdEnt(mib, this);
                    this.upsTestSpinLock = new UpsTestSpinLockEnt(mib, this);
                    this.upsTestResultsSummary = new UpsTestResultsSummaryEnt(mib, this);
                    this.upsTestResultsDetail = new UpsTestResultsDetailEnt(mib, this);
                    this.upsTestStartTime = new UpsTestStartTimeEnt(mib, this);
                    this.upsTestElapsedTime = new UpsTestElapsedTimeEnt(mib, this);
                    this.upsWellKnownTests = new UpsWellKnownTestsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.upsTestId,
                        this.upsTestSpinLock,
                        this.upsTestResultsSummary,
                        this.upsTestResultsDetail,
                        this.upsTestStartTime,
                        this.upsTestElapsedTime,
                        this.upsWellKnownTests
                    };
                }
                public static final class UpsTestIdEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsTestIdEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsTestId", "1.3.6.1.2.1.33.1.7.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsTestSpinLockEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsTestSpinLockEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsTestSpinLock", "1.3.6.1.2.1.33.1.7.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsTestResultsSummaryEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsTestResultsSummaryEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsTestResultsSummary", "1.3.6.1.2.1.33.1.7.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsTestResultsDetailEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsTestResultsDetailEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsTestResultsDetail", "1.3.6.1.2.1.33.1.7.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsTestStartTimeEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsTestStartTimeEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsTestStartTime", "1.3.6.1.2.1.33.1.7.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsTestElapsedTimeEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsTestElapsedTimeEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsTestElapsedTime", "1.3.6.1.2.1.33.1.7.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsWellKnownTestsEnt extends MIBEntry<UPSMIBDef>
                {
                    public final UpsTestNoTestsInitiatedEnt upsTestNoTestsInitiated;

                    public final UpsTestAbortTestInProgressEnt upsTestAbortTestInProgress;

                    public final UpsTestGeneralSystemsTestEnt upsTestGeneralSystemsTest;

                    public final UpsTestQuickBatteryTestEnt upsTestQuickBatteryTest;

                    public final UpsTestDeepBatteryCalibrationEnt upsTestDeepBatteryCalibration;

                    private UpsWellKnownTestsEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsWellKnownTests", "1.3.6.1.2.1.33.1.7.7", false, false, false, false);
                        this.upsTestNoTestsInitiated = new UpsTestNoTestsInitiatedEnt(mib, this);
                        this.upsTestAbortTestInProgress = new UpsTestAbortTestInProgressEnt(mib, this);
                        this.upsTestGeneralSystemsTest = new UpsTestGeneralSystemsTestEnt(mib, this);
                        this.upsTestQuickBatteryTest = new UpsTestQuickBatteryTestEnt(mib, this);
                        this.upsTestDeepBatteryCalibration = new UpsTestDeepBatteryCalibrationEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.upsTestNoTestsInitiated,
                            this.upsTestAbortTestInProgress,
                            this.upsTestGeneralSystemsTest,
                            this.upsTestQuickBatteryTest,
                            this.upsTestDeepBatteryCalibration
                        };
                    }
                    public static final class UpsTestNoTestsInitiatedEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsTestNoTestsInitiatedEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsTestNoTestsInitiated", "1.3.6.1.2.1.33.1.7.7.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsTestAbortTestInProgressEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsTestAbortTestInProgressEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsTestAbortTestInProgress", "1.3.6.1.2.1.33.1.7.7.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsTestGeneralSystemsTestEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsTestGeneralSystemsTestEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsTestGeneralSystemsTest", "1.3.6.1.2.1.33.1.7.7.3", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsTestQuickBatteryTestEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsTestQuickBatteryTestEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsTestQuickBatteryTest", "1.3.6.1.2.1.33.1.7.7.4", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsTestDeepBatteryCalibrationEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsTestDeepBatteryCalibrationEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsTestDeepBatteryCalibration", "1.3.6.1.2.1.33.1.7.7.5", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class UpsControlEnt extends MIBEntry<UPSMIBDef>
            {
                public final UpsShutdownTypeEnt upsShutdownType;

                public final UpsShutdownAfterDelayEnt upsShutdownAfterDelay;

                public final UpsStartupAfterDelayEnt upsStartupAfterDelay;

                public final UpsRebootWithDurationEnt upsRebootWithDuration;

                public final UpsAutoRestartEnt upsAutoRestart;

                private UpsControlEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                {
                    super(mib, parent, "upsControl", "1.3.6.1.2.1.33.1.8", false, false, false, false);
                    this.upsShutdownType = new UpsShutdownTypeEnt(mib, this);
                    this.upsShutdownAfterDelay = new UpsShutdownAfterDelayEnt(mib, this);
                    this.upsStartupAfterDelay = new UpsStartupAfterDelayEnt(mib, this);
                    this.upsRebootWithDuration = new UpsRebootWithDurationEnt(mib, this);
                    this.upsAutoRestart = new UpsAutoRestartEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.upsShutdownType,
                        this.upsShutdownAfterDelay,
                        this.upsStartupAfterDelay,
                        this.upsRebootWithDuration,
                        this.upsAutoRestart
                    };
                }
                public static final class UpsShutdownTypeEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsShutdownTypeEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsShutdownType", "1.3.6.1.2.1.33.1.8.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsShutdownAfterDelayEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsShutdownAfterDelayEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsShutdownAfterDelay", "1.3.6.1.2.1.33.1.8.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsStartupAfterDelayEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsStartupAfterDelayEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsStartupAfterDelay", "1.3.6.1.2.1.33.1.8.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsRebootWithDurationEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsRebootWithDurationEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsRebootWithDuration", "1.3.6.1.2.1.33.1.8.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsAutoRestartEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsAutoRestartEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsAutoRestart", "1.3.6.1.2.1.33.1.8.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class UpsConfigEnt extends MIBEntry<UPSMIBDef>
            {
                public final UpsConfigInputVoltageEnt upsConfigInputVoltage;

                public final UpsConfigInputFreqEnt upsConfigInputFreq;

                public final UpsConfigOutputVoltageEnt upsConfigOutputVoltage;

                public final UpsConfigOutputFreqEnt upsConfigOutputFreq;

                public final UpsConfigOutputVAEnt upsConfigOutputVA;

                public final UpsConfigOutputPowerEnt upsConfigOutputPower;

                public final UpsConfigLowBattTimeEnt upsConfigLowBattTime;

                public final UpsConfigAudibleStatusEnt upsConfigAudibleStatus;

                public final UpsConfigLowVoltageTransferPointEnt upsConfigLowVoltageTransferPoint;

                public final UpsConfigHighVoltageTransferPointEnt upsConfigHighVoltageTransferPoint;

                private UpsConfigEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                {
                    super(mib, parent, "upsConfig", "1.3.6.1.2.1.33.1.9", false, false, false, false);
                    this.upsConfigInputVoltage = new UpsConfigInputVoltageEnt(mib, this);
                    this.upsConfigInputFreq = new UpsConfigInputFreqEnt(mib, this);
                    this.upsConfigOutputVoltage = new UpsConfigOutputVoltageEnt(mib, this);
                    this.upsConfigOutputFreq = new UpsConfigOutputFreqEnt(mib, this);
                    this.upsConfigOutputVA = new UpsConfigOutputVAEnt(mib, this);
                    this.upsConfigOutputPower = new UpsConfigOutputPowerEnt(mib, this);
                    this.upsConfigLowBattTime = new UpsConfigLowBattTimeEnt(mib, this);
                    this.upsConfigAudibleStatus = new UpsConfigAudibleStatusEnt(mib, this);
                    this.upsConfigLowVoltageTransferPoint = new UpsConfigLowVoltageTransferPointEnt(mib, this);
                    this.upsConfigHighVoltageTransferPoint = new UpsConfigHighVoltageTransferPointEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.upsConfigInputVoltage,
                        this.upsConfigInputFreq,
                        this.upsConfigOutputVoltage,
                        this.upsConfigOutputFreq,
                        this.upsConfigOutputVA,
                        this.upsConfigOutputPower,
                        this.upsConfigLowBattTime,
                        this.upsConfigAudibleStatus,
                        this.upsConfigLowVoltageTransferPoint,
                        this.upsConfigHighVoltageTransferPoint
                    };
                }
                public static final class UpsConfigInputVoltageEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsConfigInputVoltageEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsConfigInputVoltage", "1.3.6.1.2.1.33.1.9.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsConfigInputFreqEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsConfigInputFreqEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsConfigInputFreq", "1.3.6.1.2.1.33.1.9.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsConfigOutputVoltageEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsConfigOutputVoltageEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsConfigOutputVoltage", "1.3.6.1.2.1.33.1.9.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsConfigOutputFreqEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsConfigOutputFreqEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsConfigOutputFreq", "1.3.6.1.2.1.33.1.9.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsConfigOutputVAEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsConfigOutputVAEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsConfigOutputVA", "1.3.6.1.2.1.33.1.9.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsConfigOutputPowerEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsConfigOutputPowerEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsConfigOutputPower", "1.3.6.1.2.1.33.1.9.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsConfigLowBattTimeEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsConfigLowBattTimeEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsConfigLowBattTime", "1.3.6.1.2.1.33.1.9.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsConfigAudibleStatusEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsConfigAudibleStatusEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsConfigAudibleStatus", "1.3.6.1.2.1.33.1.9.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsConfigLowVoltageTransferPointEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsConfigLowVoltageTransferPointEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsConfigLowVoltageTransferPoint", "1.3.6.1.2.1.33.1.9.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsConfigHighVoltageTransferPointEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsConfigHighVoltageTransferPointEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsConfigHighVoltageTransferPoint", "1.3.6.1.2.1.33.1.9.10", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class UpsTrapsEnt extends MIBEntry<UPSMIBDef>
        {
            /** This section defines the well-known notifications sent byUPS agents.Care must be taken to insure that no particular notificationis sent to a single receiving entity more often than onceevery five seconds.*/
            public final UpsTrapOnBatteryEnt upsTrapOnBattery;

            public final UpsTrapTestCompletedEnt upsTrapTestCompleted;

            public final UpsTrapAlarmEntryAddedEnt upsTrapAlarmEntryAdded;

            public final UpsTrapAlarmEntryRemovedEnt upsTrapAlarmEntryRemoved;

            private UpsTrapsEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
            {
                super(mib, parent, "upsTraps", "1.3.6.1.2.1.33.2", false, false, false, false);
                this.upsTrapOnBattery = new UpsTrapOnBatteryEnt(mib, this);
                this.upsTrapTestCompleted = new UpsTrapTestCompletedEnt(mib, this);
                this.upsTrapAlarmEntryAdded = new UpsTrapAlarmEntryAddedEnt(mib, this);
                this.upsTrapAlarmEntryRemoved = new UpsTrapAlarmEntryRemovedEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.upsTrapOnBattery,
                    this.upsTrapTestCompleted,
                    this.upsTrapAlarmEntryAdded,
                    this.upsTrapAlarmEntryRemoved
                };
            }
            public static final class UpsTrapOnBatteryEnt extends MIBEntry<UPSMIBDef>
            {
                private UpsTrapOnBatteryEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                {
                    super(mib, parent, "upsTrapOnBattery", "1.3.6.1.2.1.33.2.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UpsTrapTestCompletedEnt extends MIBEntry<UPSMIBDef>
            {
                private UpsTrapTestCompletedEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                {
                    super(mib, parent, "upsTrapTestCompleted", "1.3.6.1.2.1.33.2.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UpsTrapAlarmEntryAddedEnt extends MIBEntry<UPSMIBDef>
            {
                private UpsTrapAlarmEntryAddedEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                {
                    super(mib, parent, "upsTrapAlarmEntryAdded", "1.3.6.1.2.1.33.2.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UpsTrapAlarmEntryRemovedEnt extends MIBEntry<UPSMIBDef>
            {
                private UpsTrapAlarmEntryRemovedEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                {
                    super(mib, parent, "upsTrapAlarmEntryRemoved", "1.3.6.1.2.1.33.2.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class UpsConformanceEnt extends MIBEntry<UPSMIBDef>
        {
            public final UpsCompliancesEnt upsCompliances;

            /** units of conformance
summary at a glance:
subset  basic   advupsIdentManufacturer                  x       x       xupsIdentModel                         x       x       x
upsIdentUPSSoftwareVersion                    x       xupsIdentAgentSoftwareVersion          x       x       xupsIdentName                          x       x       xupsIdentAttachedDevices               x               xupsBatteryStatus                      x       x       x  notesupsSecondsOnBattery                   x       x       xupsEstimatedMinutesRemaining                          xupsEstimatedChargeRemaining                           xupsBatteryVoltageupsBatteryCurrentupsBatteryTemperatureupsInputLineBads                      x       x       xupsInputNumLines                              x       xupsInputFrequency                             x       xupsInputVoltage                               x       xupsInputCurrentupsInputTruePowerupsOutputSource                       x       x       x  notesupsOutputFrequency                            x       xupsOutputNumLines                             x       xupsOutputVoltage                              x       xupsOutputCurrent                                      xupsOutputPower                                        xupsOutputPercentLoad                                  xupsBypassFrequency                            x       x  notesupsBypassNumLines                             x       xupsBypassVoltage                              x       xupsBypassCurrentupsBypassPowerupsAlarmsPresent                      x       x       xupsAlarmDescr                         x       x       x  notesupsAlarmTime                          x       x       xupsTestId                                     x       x  notesupsTestSpinLock                               x       xupsTestResultsSummary                         x       xupsTestResultsDetail                          x       xupsTestStartTime                              x       xupsTestElapsedTime                            x       xupsShutdownType                       x       x       x  notes
upsShutdownAfterDelay                 x       x       xupsStartupAfterDelay                          x       xupsRebootWithDuration                         x       xupsAutoRestart                        x       x       x  notesupsConfigInputVoltage                 x       x       x  notesupsConfigInputFreq                    x       x       x  notesupsConfigOutputVoltage                x       x       x  notesupsConfigOutputFreq                   x       x       x  notesupsConfigOutputVA                     x       x       xupsConfigOutputPower                  x       x       xupsConfigLowBattTime                          x       x  notesupsConfigAudibleStatus                        x       xupsConfigLowVoltageTransferPointupsConfigHighVoltageTransferPoint

units of conformance*/
            public final UpsGroupsEnt upsGroups;

            private UpsConformanceEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
            {
                super(mib, parent, "upsConformance", "1.3.6.1.2.1.33.3", false, false, false, false);
                this.upsCompliances = new UpsCompliancesEnt(mib, this);
                this.upsGroups = new UpsGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.upsCompliances,
                    this.upsGroups
                };
            }
            public static final class UpsCompliancesEnt extends MIBEntry<UPSMIBDef>
            {
                /** compliance statements*/
                public final UpsSubsetComplianceEnt upsSubsetCompliance;

                public final UpsBasicComplianceEnt upsBasicCompliance;

                public final UpsFullComplianceEnt upsFullCompliance;

                private UpsCompliancesEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                {
                    super(mib, parent, "upsCompliances", "1.3.6.1.2.1.33.3.1", false, false, false, false);
                    this.upsSubsetCompliance = new UpsSubsetComplianceEnt(mib, this);
                    this.upsBasicCompliance = new UpsBasicComplianceEnt(mib, this);
                    this.upsFullCompliance = new UpsFullComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.upsSubsetCompliance,
                        this.upsBasicCompliance,
                        this.upsFullCompliance
                    };
                }
                public static final class UpsSubsetComplianceEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsSubsetComplianceEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsSubsetCompliance", "1.3.6.1.2.1.33.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsBasicComplianceEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsBasicComplianceEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsBasicCompliance", "1.3.6.1.2.1.33.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UpsFullComplianceEnt extends MIBEntry<UPSMIBDef>
                {
                    private UpsFullComplianceEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsFullCompliance", "1.3.6.1.2.1.33.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class UpsGroupsEnt extends MIBEntry<UPSMIBDef>
            {
                public final UpsSubsetGroupsEnt upsSubsetGroups;

                public final UpsBasicGroupsEnt upsBasicGroups;

                public final UpsFullGroupsEnt upsFullGroups;

                private UpsGroupsEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                {
                    super(mib, parent, "upsGroups", "1.3.6.1.2.1.33.3.2", false, false, false, false);
                    this.upsSubsetGroups = new UpsSubsetGroupsEnt(mib, this);
                    this.upsBasicGroups = new UpsBasicGroupsEnt(mib, this);
                    this.upsFullGroups = new UpsFullGroupsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.upsSubsetGroups,
                        this.upsBasicGroups,
                        this.upsFullGroups
                    };
                }
                public static final class UpsSubsetGroupsEnt extends MIBEntry<UPSMIBDef>
                {
                    public final UpsSubsetIdentGroupEnt upsSubsetIdentGroup;

                    public final UpsSubsetBatteryGroupEnt upsSubsetBatteryGroup;

                    public final UpsSubsetInputGroupEnt upsSubsetInputGroup;

                    public final UpsSubsetOutputGroupEnt upsSubsetOutputGroup;

                    /** { upsSubsetGroups 5 } is reserved forfuture use (upsSubsetBypassGroup)*/
                    public final UpsSubsetAlarmGroupEnt upsSubsetAlarmGroup;

                    /** { upsSubsetGroups 7 } is reserved forfuture use (upsSubsetTestGroup)*/
                    public final UpsSubsetControlGroupEnt upsSubsetControlGroup;

                    public final UpsSubsetConfigGroupEnt upsSubsetConfigGroup;

                    private UpsSubsetGroupsEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsSubsetGroups", "1.3.6.1.2.1.33.3.2.1", false, false, false, false);
                        this.upsSubsetIdentGroup = new UpsSubsetIdentGroupEnt(mib, this);
                        this.upsSubsetBatteryGroup = new UpsSubsetBatteryGroupEnt(mib, this);
                        this.upsSubsetInputGroup = new UpsSubsetInputGroupEnt(mib, this);
                        this.upsSubsetOutputGroup = new UpsSubsetOutputGroupEnt(mib, this);
                        this.upsSubsetAlarmGroup = new UpsSubsetAlarmGroupEnt(mib, this);
                        this.upsSubsetControlGroup = new UpsSubsetControlGroupEnt(mib, this);
                        this.upsSubsetConfigGroup = new UpsSubsetConfigGroupEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.upsSubsetIdentGroup,
                            this.upsSubsetBatteryGroup,
                            this.upsSubsetInputGroup,
                            this.upsSubsetOutputGroup,
                            this.upsSubsetAlarmGroup,
                            this.upsSubsetControlGroup,
                            this.upsSubsetConfigGroup
                        };
                    }
                    public static final class UpsSubsetIdentGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsSubsetIdentGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsSubsetIdentGroup", "1.3.6.1.2.1.33.3.2.1.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsSubsetBatteryGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsSubsetBatteryGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsSubsetBatteryGroup", "1.3.6.1.2.1.33.3.2.1.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsSubsetInputGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsSubsetInputGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsSubsetInputGroup", "1.3.6.1.2.1.33.3.2.1.3", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsSubsetOutputGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsSubsetOutputGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsSubsetOutputGroup", "1.3.6.1.2.1.33.3.2.1.4", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsSubsetAlarmGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsSubsetAlarmGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsSubsetAlarmGroup", "1.3.6.1.2.1.33.3.2.1.6", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsSubsetControlGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsSubsetControlGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsSubsetControlGroup", "1.3.6.1.2.1.33.3.2.1.8", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsSubsetConfigGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsSubsetConfigGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsSubsetConfigGroup", "1.3.6.1.2.1.33.3.2.1.9", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class UpsBasicGroupsEnt extends MIBEntry<UPSMIBDef>
                {
                    public final UpsBasicIdentGroupEnt upsBasicIdentGroup;

                    public final UpsBasicBatteryGroupEnt upsBasicBatteryGroup;

                    public final UpsBasicInputGroupEnt upsBasicInputGroup;

                    public final UpsBasicOutputGroupEnt upsBasicOutputGroup;

                    public final UpsBasicBypassGroupEnt upsBasicBypassGroup;

                    public final UpsBasicAlarmGroupEnt upsBasicAlarmGroup;

                    public final UpsBasicTestGroupEnt upsBasicTestGroup;

                    public final UpsBasicControlGroupEnt upsBasicControlGroup;

                    public final UpsBasicConfigGroupEnt upsBasicConfigGroup;

                    private UpsBasicGroupsEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsBasicGroups", "1.3.6.1.2.1.33.3.2.2", false, false, false, false);
                        this.upsBasicIdentGroup = new UpsBasicIdentGroupEnt(mib, this);
                        this.upsBasicBatteryGroup = new UpsBasicBatteryGroupEnt(mib, this);
                        this.upsBasicInputGroup = new UpsBasicInputGroupEnt(mib, this);
                        this.upsBasicOutputGroup = new UpsBasicOutputGroupEnt(mib, this);
                        this.upsBasicBypassGroup = new UpsBasicBypassGroupEnt(mib, this);
                        this.upsBasicAlarmGroup = new UpsBasicAlarmGroupEnt(mib, this);
                        this.upsBasicTestGroup = new UpsBasicTestGroupEnt(mib, this);
                        this.upsBasicControlGroup = new UpsBasicControlGroupEnt(mib, this);
                        this.upsBasicConfigGroup = new UpsBasicConfigGroupEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.upsBasicIdentGroup,
                            this.upsBasicBatteryGroup,
                            this.upsBasicInputGroup,
                            this.upsBasicOutputGroup,
                            this.upsBasicBypassGroup,
                            this.upsBasicAlarmGroup,
                            this.upsBasicTestGroup,
                            this.upsBasicControlGroup,
                            this.upsBasicConfigGroup
                        };
                    }
                    public static final class UpsBasicIdentGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsBasicIdentGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsBasicIdentGroup", "1.3.6.1.2.1.33.3.2.2.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsBasicBatteryGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsBasicBatteryGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsBasicBatteryGroup", "1.3.6.1.2.1.33.3.2.2.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsBasicInputGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsBasicInputGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsBasicInputGroup", "1.3.6.1.2.1.33.3.2.2.3", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsBasicOutputGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsBasicOutputGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsBasicOutputGroup", "1.3.6.1.2.1.33.3.2.2.4", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsBasicBypassGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsBasicBypassGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsBasicBypassGroup", "1.3.6.1.2.1.33.3.2.2.5", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsBasicAlarmGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsBasicAlarmGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsBasicAlarmGroup", "1.3.6.1.2.1.33.3.2.2.6", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsBasicTestGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsBasicTestGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsBasicTestGroup", "1.3.6.1.2.1.33.3.2.2.7", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsBasicControlGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsBasicControlGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsBasicControlGroup", "1.3.6.1.2.1.33.3.2.2.8", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsBasicConfigGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsBasicConfigGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsBasicConfigGroup", "1.3.6.1.2.1.33.3.2.2.9", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class UpsFullGroupsEnt extends MIBEntry<UPSMIBDef>
                {
                    public final UpsFullIdentGroupEnt upsFullIdentGroup;

                    public final UpsFullBatteryGroupEnt upsFullBatteryGroup;

                    public final UpsFullInputGroupEnt upsFullInputGroup;

                    public final UpsFullOutputGroupEnt upsFullOutputGroup;

                    public final UpsFullBypassGroupEnt upsFullBypassGroup;

                    public final UpsFullAlarmGroupEnt upsFullAlarmGroup;

                    public final UpsFullTestGroupEnt upsFullTestGroup;

                    public final UpsFullControlGroupEnt upsFullControlGroup;

                    public final UpsFullConfigGroupEnt upsFullConfigGroup;

                    private UpsFullGroupsEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                    {
                        super(mib, parent, "upsFullGroups", "1.3.6.1.2.1.33.3.2.3", false, false, false, false);
                        this.upsFullIdentGroup = new UpsFullIdentGroupEnt(mib, this);
                        this.upsFullBatteryGroup = new UpsFullBatteryGroupEnt(mib, this);
                        this.upsFullInputGroup = new UpsFullInputGroupEnt(mib, this);
                        this.upsFullOutputGroup = new UpsFullOutputGroupEnt(mib, this);
                        this.upsFullBypassGroup = new UpsFullBypassGroupEnt(mib, this);
                        this.upsFullAlarmGroup = new UpsFullAlarmGroupEnt(mib, this);
                        this.upsFullTestGroup = new UpsFullTestGroupEnt(mib, this);
                        this.upsFullControlGroup = new UpsFullControlGroupEnt(mib, this);
                        this.upsFullConfigGroup = new UpsFullConfigGroupEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.upsFullIdentGroup,
                            this.upsFullBatteryGroup,
                            this.upsFullInputGroup,
                            this.upsFullOutputGroup,
                            this.upsFullBypassGroup,
                            this.upsFullAlarmGroup,
                            this.upsFullTestGroup,
                            this.upsFullControlGroup,
                            this.upsFullConfigGroup
                        };
                    }
                    public static final class UpsFullIdentGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsFullIdentGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsFullIdentGroup", "1.3.6.1.2.1.33.3.2.3.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsFullBatteryGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsFullBatteryGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsFullBatteryGroup", "1.3.6.1.2.1.33.3.2.3.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsFullInputGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsFullInputGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsFullInputGroup", "1.3.6.1.2.1.33.3.2.3.3", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsFullOutputGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsFullOutputGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsFullOutputGroup", "1.3.6.1.2.1.33.3.2.3.4", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsFullBypassGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsFullBypassGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsFullBypassGroup", "1.3.6.1.2.1.33.3.2.3.5", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsFullAlarmGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsFullAlarmGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsFullAlarmGroup", "1.3.6.1.2.1.33.3.2.3.6", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsFullTestGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsFullTestGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsFullTestGroup", "1.3.6.1.2.1.33.3.2.3.7", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsFullControlGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsFullControlGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsFullControlGroup", "1.3.6.1.2.1.33.3.2.3.8", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UpsFullConfigGroupEnt extends MIBEntry<UPSMIBDef>
                    {
                        private UpsFullConfigGroupEnt(UPSMIBDef mib, MIBEntry<UPSMIBDef> parent)
                        {
                            super(mib, parent, "upsFullConfigGroup", "1.3.6.1.2.1.33.3.2.3.9", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

}
