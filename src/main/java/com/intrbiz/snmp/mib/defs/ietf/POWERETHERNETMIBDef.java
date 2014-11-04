package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class POWERETHERNETMIBDef extends MIB
{
    public static final POWERETHERNETMIBDef POWERETHERNETMIB = new POWERETHERNETMIBDef();

    static { MIBs.getInstance().registerMIB(POWERETHERNETMIBDef.POWERETHERNETMIB); }

    /** November 24, 2003*/
    public final PowerEthernetMIBEnt powerEthernetMIB;

    private POWERETHERNETMIBDef()
    {
        super("POWER-ETHERNET-MIB");
        this.powerEthernetMIB = new PowerEthernetMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.powerEthernetMIB
        };
    }

    public static final class PowerEthernetMIBEnt extends MIBEntry<POWERETHERNETMIBDef>
    {
        public final PethNotificationsEnt pethNotifications;

        public final PethObjectsEnt pethObjects;

        public final PethConformanceEnt pethConformance;

        private PowerEthernetMIBEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
        {
            super(mib, parent, "powerEthernetMIB", "1.3.6.1.2.1.105", false, false, false, false);
            this.pethNotifications = new PethNotificationsEnt(mib, this);
            this.pethObjects = new PethObjectsEnt(mib, this);
            this.pethConformance = new PethConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.pethNotifications,
                this.pethObjects,
                this.pethConformance
            };
        }
        public static final class PethNotificationsEnt extends MIBEntry<POWERETHERNETMIBDef>
        {
            /** Notifications Section*/
            public final PethPsePortOnOffNotificationEnt pethPsePortOnOffNotification;

            public final PethMainPowerUsageOnNotificationEnt pethMainPowerUsageOnNotification;

            public final PethMainPowerUsageOffNotificationEnt pethMainPowerUsageOffNotification;

            private PethNotificationsEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
            {
                super(mib, parent, "pethNotifications", "1.3.6.1.2.1.105.0", false, false, false, false);
                this.pethPsePortOnOffNotification = new PethPsePortOnOffNotificationEnt(mib, this);
                this.pethMainPowerUsageOnNotification = new PethMainPowerUsageOnNotificationEnt(mib, this);
                this.pethMainPowerUsageOffNotification = new PethMainPowerUsageOffNotificationEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pethPsePortOnOffNotification,
                    this.pethMainPowerUsageOnNotification,
                    this.pethMainPowerUsageOffNotification
                };
            }
            public static final class PethPsePortOnOffNotificationEnt extends MIBEntry<POWERETHERNETMIBDef>
            {
                private PethPsePortOnOffNotificationEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                {
                    super(mib, parent, "pethPsePortOnOffNotification", "1.3.6.1.2.1.105.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PethMainPowerUsageOnNotificationEnt extends MIBEntry<POWERETHERNETMIBDef>
            {
                private PethMainPowerUsageOnNotificationEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                {
                    super(mib, parent, "pethMainPowerUsageOnNotification", "1.3.6.1.2.1.105.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PethMainPowerUsageOffNotificationEnt extends MIBEntry<POWERETHERNETMIBDef>
            {
                private PethMainPowerUsageOffNotificationEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                {
                    super(mib, parent, "pethMainPowerUsageOffNotification", "1.3.6.1.2.1.105.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class PethObjectsEnt extends MIBEntry<POWERETHERNETMIBDef>
        {
            /** PSE Objects*/
            public final PethPsePortTableEnt pethPsePortTable;

            /** Main PSE Objects*/
            public final PethMainPseObjectsEnt pethMainPseObjects;

            /** Notification  Control  Objects*/
            public final PethNotificationControlEnt pethNotificationControl;

            private PethObjectsEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
            {
                super(mib, parent, "pethObjects", "1.3.6.1.2.1.105.1", false, false, false, false);
                this.pethPsePortTable = new PethPsePortTableEnt(mib, this);
                this.pethMainPseObjects = new PethMainPseObjectsEnt(mib, this);
                this.pethNotificationControl = new PethNotificationControlEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pethPsePortTable,
                    this.pethMainPseObjects,
                    this.pethNotificationControl
                };
            }
            public static final class PethPsePortTableEnt extends MIBEntry<POWERETHERNETMIBDef>
            {
                public final PethPsePortEntryEnt pethPsePortEntry;

                private PethPsePortTableEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                {
                    super(mib, parent, "pethPsePortTable", "1.3.6.1.2.1.105.1.1", false, true, false, false);
                    this.pethPsePortEntry = new PethPsePortEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pethPsePortEntry
                    };
                }
                public static final class PethPsePortEntryEnt extends MIBEntry<POWERETHERNETMIBDef>
                {
                    public final PethPsePortGroupIndexEnt pethPsePortGroupIndex;

                    public final PethPsePortIndexEnt pethPsePortIndex;

                    public final PethPsePortAdminEnableEnt pethPsePortAdminEnable;

                    public final PethPsePortPowerPairsControlAbilityEnt pethPsePortPowerPairsControlAbility;

                    public final PethPsePortPowerPairsEnt pethPsePortPowerPairs;

                    public final PethPsePortDetectionStatusEnt pethPsePortDetectionStatus;

                    public final PethPsePortPowerPriorityEnt pethPsePortPowerPriority;

                    public final PethPsePortMPSAbsentCounterEnt pethPsePortMPSAbsentCounter;

                    public final PethPsePortTypeEnt pethPsePortType;

                    public final PethPsePortPowerClassificationsEnt pethPsePortPowerClassifications;

                    public final PethPsePortInvalidSignatureCounterEnt pethPsePortInvalidSignatureCounter;

                    public final PethPsePortPowerDeniedCounterEnt pethPsePortPowerDeniedCounter;

                    public final PethPsePortOverLoadCounterEnt pethPsePortOverLoadCounter;

                    public final PethPsePortShortCounterEnt pethPsePortShortCounter;

                    private PethPsePortEntryEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                    {
                        super(mib, parent, "pethPsePortEntry", "1.3.6.1.2.1.105.1.1.1", false, false, false, true);
                        this.pethPsePortGroupIndex = new PethPsePortGroupIndexEnt(mib, this);
                        this.pethPsePortIndex = new PethPsePortIndexEnt(mib, this);
                        this.pethPsePortAdminEnable = new PethPsePortAdminEnableEnt(mib, this);
                        this.pethPsePortPowerPairsControlAbility = new PethPsePortPowerPairsControlAbilityEnt(mib, this);
                        this.pethPsePortPowerPairs = new PethPsePortPowerPairsEnt(mib, this);
                        this.pethPsePortDetectionStatus = new PethPsePortDetectionStatusEnt(mib, this);
                        this.pethPsePortPowerPriority = new PethPsePortPowerPriorityEnt(mib, this);
                        this.pethPsePortMPSAbsentCounter = new PethPsePortMPSAbsentCounterEnt(mib, this);
                        this.pethPsePortType = new PethPsePortTypeEnt(mib, this);
                        this.pethPsePortPowerClassifications = new PethPsePortPowerClassificationsEnt(mib, this);
                        this.pethPsePortInvalidSignatureCounter = new PethPsePortInvalidSignatureCounterEnt(mib, this);
                        this.pethPsePortPowerDeniedCounter = new PethPsePortPowerDeniedCounterEnt(mib, this);
                        this.pethPsePortOverLoadCounter = new PethPsePortOverLoadCounterEnt(mib, this);
                        this.pethPsePortShortCounter = new PethPsePortShortCounterEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pethPsePortGroupIndex,
                            this.pethPsePortIndex,
                            this.pethPsePortAdminEnable,
                            this.pethPsePortPowerPairsControlAbility,
                            this.pethPsePortPowerPairs,
                            this.pethPsePortDetectionStatus,
                            this.pethPsePortPowerPriority,
                            this.pethPsePortMPSAbsentCounter,
                            this.pethPsePortType,
                            this.pethPsePortPowerClassifications,
                            this.pethPsePortInvalidSignatureCounter,
                            this.pethPsePortPowerDeniedCounter,
                            this.pethPsePortOverLoadCounter,
                            this.pethPsePortShortCounter
                        };
                    }
                    public static final class PethPsePortGroupIndexEnt extends MIBEntry<POWERETHERNETMIBDef>
                    {
                        private PethPsePortGroupIndexEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                        {
                            super(mib, parent, "pethPsePortGroupIndex", "1.3.6.1.2.1.105.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PethPsePortIndexEnt extends MIBEntry<POWERETHERNETMIBDef>
                    {
                        private PethPsePortIndexEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                        {
                            super(mib, parent, "pethPsePortIndex", "1.3.6.1.2.1.105.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PethPsePortAdminEnableEnt extends MIBEntry<POWERETHERNETMIBDef>
                    {
                        private PethPsePortAdminEnableEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                        {
                            super(mib, parent, "pethPsePortAdminEnable", "1.3.6.1.2.1.105.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PethPsePortPowerPairsControlAbilityEnt extends MIBEntry<POWERETHERNETMIBDef>
                    {
                        private PethPsePortPowerPairsControlAbilityEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                        {
                            super(mib, parent, "pethPsePortPowerPairsControlAbility", "1.3.6.1.2.1.105.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PethPsePortPowerPairsEnt extends MIBEntry<POWERETHERNETMIBDef>
                    {
                        private PethPsePortPowerPairsEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                        {
                            super(mib, parent, "pethPsePortPowerPairs", "1.3.6.1.2.1.105.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PethPsePortDetectionStatusEnt extends MIBEntry<POWERETHERNETMIBDef>
                    {
                        private PethPsePortDetectionStatusEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                        {
                            super(mib, parent, "pethPsePortDetectionStatus", "1.3.6.1.2.1.105.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PethPsePortPowerPriorityEnt extends MIBEntry<POWERETHERNETMIBDef>
                    {
                        private PethPsePortPowerPriorityEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                        {
                            super(mib, parent, "pethPsePortPowerPriority", "1.3.6.1.2.1.105.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PethPsePortMPSAbsentCounterEnt extends MIBEntry<POWERETHERNETMIBDef>
                    {
                        private PethPsePortMPSAbsentCounterEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                        {
                            super(mib, parent, "pethPsePortMPSAbsentCounter", "1.3.6.1.2.1.105.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PethPsePortTypeEnt extends MIBEntry<POWERETHERNETMIBDef>
                    {
                        private PethPsePortTypeEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                        {
                            super(mib, parent, "pethPsePortType", "1.3.6.1.2.1.105.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PethPsePortPowerClassificationsEnt extends MIBEntry<POWERETHERNETMIBDef>
                    {
                        private PethPsePortPowerClassificationsEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                        {
                            super(mib, parent, "pethPsePortPowerClassifications", "1.3.6.1.2.1.105.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PethPsePortInvalidSignatureCounterEnt extends MIBEntry<POWERETHERNETMIBDef>
                    {
                        private PethPsePortInvalidSignatureCounterEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                        {
                            super(mib, parent, "pethPsePortInvalidSignatureCounter", "1.3.6.1.2.1.105.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PethPsePortPowerDeniedCounterEnt extends MIBEntry<POWERETHERNETMIBDef>
                    {
                        private PethPsePortPowerDeniedCounterEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                        {
                            super(mib, parent, "pethPsePortPowerDeniedCounter", "1.3.6.1.2.1.105.1.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PethPsePortOverLoadCounterEnt extends MIBEntry<POWERETHERNETMIBDef>
                    {
                        private PethPsePortOverLoadCounterEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                        {
                            super(mib, parent, "pethPsePortOverLoadCounter", "1.3.6.1.2.1.105.1.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PethPsePortShortCounterEnt extends MIBEntry<POWERETHERNETMIBDef>
                    {
                        private PethPsePortShortCounterEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                        {
                            super(mib, parent, "pethPsePortShortCounter", "1.3.6.1.2.1.105.1.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PethMainPseObjectsEnt extends MIBEntry<POWERETHERNETMIBDef>
            {
                public final PethMainPseTableEnt pethMainPseTable;

                private PethMainPseObjectsEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                {
                    super(mib, parent, "pethMainPseObjects", "1.3.6.1.2.1.105.1.3", false, false, false, false);
                    this.pethMainPseTable = new PethMainPseTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pethMainPseTable
                    };
                }
                public static final class PethMainPseTableEnt extends MIBEntry<POWERETHERNETMIBDef>
                {
                    public final PethMainPseEntryEnt pethMainPseEntry;

                    private PethMainPseTableEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                    {
                        super(mib, parent, "pethMainPseTable", "1.3.6.1.2.1.105.1.3.1", false, true, false, false);
                        this.pethMainPseEntry = new PethMainPseEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pethMainPseEntry
                        };
                    }
                    public static final class PethMainPseEntryEnt extends MIBEntry<POWERETHERNETMIBDef>
                    {
                        public final PethMainPseGroupIndexEnt pethMainPseGroupIndex;

                        public final PethMainPsePowerEnt pethMainPsePower;

                        public final PethMainPseOperStatusEnt pethMainPseOperStatus;

                        public final PethMainPseConsumptionPowerEnt pethMainPseConsumptionPower;

                        public final PethMainPseUsageThresholdEnt pethMainPseUsageThreshold;

                        private PethMainPseEntryEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                        {
                            super(mib, parent, "pethMainPseEntry", "1.3.6.1.2.1.105.1.3.1.1", false, false, false, true);
                            this.pethMainPseGroupIndex = new PethMainPseGroupIndexEnt(mib, this);
                            this.pethMainPsePower = new PethMainPsePowerEnt(mib, this);
                            this.pethMainPseOperStatus = new PethMainPseOperStatusEnt(mib, this);
                            this.pethMainPseConsumptionPower = new PethMainPseConsumptionPowerEnt(mib, this);
                            this.pethMainPseUsageThreshold = new PethMainPseUsageThresholdEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pethMainPseGroupIndex,
                                this.pethMainPsePower,
                                this.pethMainPseOperStatus,
                                this.pethMainPseConsumptionPower,
                                this.pethMainPseUsageThreshold
                            };
                        }
                        public static final class PethMainPseGroupIndexEnt extends MIBEntry<POWERETHERNETMIBDef>
                        {
                            private PethMainPseGroupIndexEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                            {
                                super(mib, parent, "pethMainPseGroupIndex", "1.3.6.1.2.1.105.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PethMainPsePowerEnt extends MIBEntry<POWERETHERNETMIBDef>
                        {
                            private PethMainPsePowerEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                            {
                                super(mib, parent, "pethMainPsePower", "1.3.6.1.2.1.105.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PethMainPseOperStatusEnt extends MIBEntry<POWERETHERNETMIBDef>
                        {
                            private PethMainPseOperStatusEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                            {
                                super(mib, parent, "pethMainPseOperStatus", "1.3.6.1.2.1.105.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PethMainPseConsumptionPowerEnt extends MIBEntry<POWERETHERNETMIBDef>
                        {
                            private PethMainPseConsumptionPowerEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                            {
                                super(mib, parent, "pethMainPseConsumptionPower", "1.3.6.1.2.1.105.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PethMainPseUsageThresholdEnt extends MIBEntry<POWERETHERNETMIBDef>
                        {
                            private PethMainPseUsageThresholdEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                            {
                                super(mib, parent, "pethMainPseUsageThreshold", "1.3.6.1.2.1.105.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class PethNotificationControlEnt extends MIBEntry<POWERETHERNETMIBDef>
            {
                public final PethNotificationControlTableEnt pethNotificationControlTable;

                private PethNotificationControlEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                {
                    super(mib, parent, "pethNotificationControl", "1.3.6.1.2.1.105.1.4", false, false, false, false);
                    this.pethNotificationControlTable = new PethNotificationControlTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pethNotificationControlTable
                    };
                }
                public static final class PethNotificationControlTableEnt extends MIBEntry<POWERETHERNETMIBDef>
                {
                    public final PethNotificationControlEntryEnt pethNotificationControlEntry;

                    private PethNotificationControlTableEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                    {
                        super(mib, parent, "pethNotificationControlTable", "1.3.6.1.2.1.105.1.4.1", false, true, false, false);
                        this.pethNotificationControlEntry = new PethNotificationControlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pethNotificationControlEntry
                        };
                    }
                    public static final class PethNotificationControlEntryEnt extends MIBEntry<POWERETHERNETMIBDef>
                    {
                        public final PethNotificationControlGroupIndexEnt pethNotificationControlGroupIndex;

                        public final PethNotificationControlEnableEnt pethNotificationControlEnable;

                        private PethNotificationControlEntryEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                        {
                            super(mib, parent, "pethNotificationControlEntry", "1.3.6.1.2.1.105.1.4.1.1", false, false, false, true);
                            this.pethNotificationControlGroupIndex = new PethNotificationControlGroupIndexEnt(mib, this);
                            this.pethNotificationControlEnable = new PethNotificationControlEnableEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pethNotificationControlGroupIndex,
                                this.pethNotificationControlEnable
                            };
                        }
                        public static final class PethNotificationControlGroupIndexEnt extends MIBEntry<POWERETHERNETMIBDef>
                        {
                            private PethNotificationControlGroupIndexEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                            {
                                super(mib, parent, "pethNotificationControlGroupIndex", "1.3.6.1.2.1.105.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PethNotificationControlEnableEnt extends MIBEntry<POWERETHERNETMIBDef>
                        {
                            private PethNotificationControlEnableEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                            {
                                super(mib, parent, "pethNotificationControlEnable", "1.3.6.1.2.1.105.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class PethConformanceEnt extends MIBEntry<POWERETHERNETMIBDef>
        {
            /** Conformance Section*/
            public final PethCompliancesEnt pethCompliances;

            public final PethGroupsEnt pethGroups;

            private PethConformanceEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
            {
                super(mib, parent, "pethConformance", "1.3.6.1.2.1.105.2", false, false, false, false);
                this.pethCompliances = new PethCompliancesEnt(mib, this);
                this.pethGroups = new PethGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pethCompliances,
                    this.pethGroups
                };
            }
            public static final class PethCompliancesEnt extends MIBEntry<POWERETHERNETMIBDef>
            {
                public final PethComplianceEnt pethCompliance;

                private PethCompliancesEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                {
                    super(mib, parent, "pethCompliances", "1.3.6.1.2.1.105.2.1", false, false, false, false);
                    this.pethCompliance = new PethComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pethCompliance
                    };
                }
                public static final class PethComplianceEnt extends MIBEntry<POWERETHERNETMIBDef>
                {
                    private PethComplianceEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                    {
                        super(mib, parent, "pethCompliance", "1.3.6.1.2.1.105.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class PethGroupsEnt extends MIBEntry<POWERETHERNETMIBDef>
            {
                public final PethPsePortGroupEnt pethPsePortGroup;

                public final PethMainPseGroupEnt pethMainPseGroup;

                public final PethNotificationControlGroupEnt pethNotificationControlGroup;

                public final PethPsePortNotificationGroupEnt pethPsePortNotificationGroup;

                public final PethMainPowerNotificationGroupEnt pethMainPowerNotificationGroup;

                private PethGroupsEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                {
                    super(mib, parent, "pethGroups", "1.3.6.1.2.1.105.2.2", false, false, false, false);
                    this.pethPsePortGroup = new PethPsePortGroupEnt(mib, this);
                    this.pethMainPseGroup = new PethMainPseGroupEnt(mib, this);
                    this.pethNotificationControlGroup = new PethNotificationControlGroupEnt(mib, this);
                    this.pethPsePortNotificationGroup = new PethPsePortNotificationGroupEnt(mib, this);
                    this.pethMainPowerNotificationGroup = new PethMainPowerNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pethPsePortGroup,
                        this.pethMainPseGroup,
                        this.pethNotificationControlGroup,
                        this.pethPsePortNotificationGroup,
                        this.pethMainPowerNotificationGroup
                    };
                }
                public static final class PethPsePortGroupEnt extends MIBEntry<POWERETHERNETMIBDef>
                {
                    private PethPsePortGroupEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                    {
                        super(mib, parent, "pethPsePortGroup", "1.3.6.1.2.1.105.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PethMainPseGroupEnt extends MIBEntry<POWERETHERNETMIBDef>
                {
                    private PethMainPseGroupEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                    {
                        super(mib, parent, "pethMainPseGroup", "1.3.6.1.2.1.105.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PethNotificationControlGroupEnt extends MIBEntry<POWERETHERNETMIBDef>
                {
                    private PethNotificationControlGroupEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                    {
                        super(mib, parent, "pethNotificationControlGroup", "1.3.6.1.2.1.105.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PethPsePortNotificationGroupEnt extends MIBEntry<POWERETHERNETMIBDef>
                {
                    private PethPsePortNotificationGroupEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                    {
                        super(mib, parent, "pethPsePortNotificationGroup", "1.3.6.1.2.1.105.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PethMainPowerNotificationGroupEnt extends MIBEntry<POWERETHERNETMIBDef>
                {
                    private PethMainPowerNotificationGroupEnt(POWERETHERNETMIBDef mib, MIBEntry<POWERETHERNETMIBDef> parent)
                    {
                        super(mib, parent, "pethMainPowerNotificationGroup", "1.3.6.1.2.1.105.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
