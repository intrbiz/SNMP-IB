package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class HDSL2SHDSLLINEMIBDef extends MIB
{
    public static final HDSL2SHDSLLINEMIBDef HDSL2SHDSLLINEMIB = new HDSL2SHDSLLINEMIBDef();

    /** December 7, 2005*/
    public final Hdsl2ShdslMIBEnt hdsl2ShdslMIB;

    private HDSL2SHDSLLINEMIBDef()
    {
        super("HDSL2-SHDSL-LINE-MIB");
        this.hdsl2ShdslMIB = new Hdsl2ShdslMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.hdsl2ShdslMIB
        };
    }

    public static final class Hdsl2ShdslMIBEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
    {
        public final Hdsl2ShdslMibObjectsEnt hdsl2ShdslMibObjects;

        /** Notifications Group*/
        public final Hdsl2ShdslNotificationsEnt hdsl2ShdslNotifications;

        /** conformance information*/
        public final Hdsl2ShdslConformanceEnt hdsl2ShdslConformance;

        private Hdsl2ShdslMIBEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
        {
            super(mib, parent, "hdsl2ShdslMIB", "1.3.6.1.2.1.10.48", false, false, false, false);
            this.hdsl2ShdslMibObjects = new Hdsl2ShdslMibObjectsEnt(mib, this);
            this.hdsl2ShdslNotifications = new Hdsl2ShdslNotificationsEnt(mib, this);
            this.hdsl2ShdslConformance = new Hdsl2ShdslConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.hdsl2ShdslMibObjects,
                this.hdsl2ShdslNotifications,
                this.hdsl2ShdslConformance
            };
        }
        public static final class Hdsl2ShdslMibObjectsEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
        {
            /** Span Configuration Group*/
            public final Hdsl2ShdslSpanConfTableEnt hdsl2ShdslSpanConfTable;

            /** Span Status Group*/
            public final Hdsl2ShdslSpanStatusTableEnt hdsl2ShdslSpanStatusTable;

            /** Unit Inventory Group*/
            public final Hdsl2ShdslInventoryTableEnt hdsl2ShdslInventoryTable;

            /** Segment Endpoint Configuration Group*/
            public final Hdsl2ShdslEndpointConfTableEnt hdsl2ShdslEndpointConfTable;

            /** Segment Endpoint Current Status/Performance Group*/
            public final Hdsl2ShdslEndpointCurrTableEnt hdsl2ShdslEndpointCurrTable;

            /** Segment Endpoint 15-Minute Interval Status/Performance Group*/
            public final Hdsl2Shdsl15MinIntervalTableEnt hdsl2Shdsl15MinIntervalTable;

            /** Segment Endpoint 1-Day Interval Status/Performance Group*/
            public final Hdsl2Shdsl1DayIntervalTableEnt hdsl2Shdsl1DayIntervalTable;

            /** Maintenance Group*/
            public final Hdsl2ShdslEndpointMaintTableEnt hdsl2ShdslEndpointMaintTable;

            public final Hdsl2ShdslUnitMaintTableEnt hdsl2ShdslUnitMaintTable;

            /** Span Configuration Profile Group*/
            public final Hdsl2ShdslSpanConfProfileTableEnt hdsl2ShdslSpanConfProfileTable;

            /** Segment Endpoint Alarm Configuration Profile group*/
            public final Hdsl2ShdslEndpointAlarmConfProfileTableEnt hdsl2ShdslEndpointAlarmConfProfileTable;

            private Hdsl2ShdslMibObjectsEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
            {
                super(mib, parent, "hdsl2ShdslMibObjects", "1.3.6.1.2.1.10.48.1", false, false, false, false);
                this.hdsl2ShdslSpanConfTable = new Hdsl2ShdslSpanConfTableEnt(mib, this);
                this.hdsl2ShdslSpanStatusTable = new Hdsl2ShdslSpanStatusTableEnt(mib, this);
                this.hdsl2ShdslInventoryTable = new Hdsl2ShdslInventoryTableEnt(mib, this);
                this.hdsl2ShdslEndpointConfTable = new Hdsl2ShdslEndpointConfTableEnt(mib, this);
                this.hdsl2ShdslEndpointCurrTable = new Hdsl2ShdslEndpointCurrTableEnt(mib, this);
                this.hdsl2Shdsl15MinIntervalTable = new Hdsl2Shdsl15MinIntervalTableEnt(mib, this);
                this.hdsl2Shdsl1DayIntervalTable = new Hdsl2Shdsl1DayIntervalTableEnt(mib, this);
                this.hdsl2ShdslEndpointMaintTable = new Hdsl2ShdslEndpointMaintTableEnt(mib, this);
                this.hdsl2ShdslUnitMaintTable = new Hdsl2ShdslUnitMaintTableEnt(mib, this);
                this.hdsl2ShdslSpanConfProfileTable = new Hdsl2ShdslSpanConfProfileTableEnt(mib, this);
                this.hdsl2ShdslEndpointAlarmConfProfileTable = new Hdsl2ShdslEndpointAlarmConfProfileTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hdsl2ShdslSpanConfTable,
                    this.hdsl2ShdslSpanStatusTable,
                    this.hdsl2ShdslInventoryTable,
                    this.hdsl2ShdslEndpointConfTable,
                    this.hdsl2ShdslEndpointCurrTable,
                    this.hdsl2Shdsl15MinIntervalTable,
                    this.hdsl2Shdsl1DayIntervalTable,
                    this.hdsl2ShdslEndpointMaintTable,
                    this.hdsl2ShdslUnitMaintTable,
                    this.hdsl2ShdslSpanConfProfileTable,
                    this.hdsl2ShdslEndpointAlarmConfProfileTable
                };
            }
            public static final class Hdsl2ShdslSpanConfTableEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                public final Hdsl2ShdslSpanConfEntryEnt hdsl2ShdslSpanConfEntry;

                private Hdsl2ShdslSpanConfTableEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslSpanConfTable", "1.3.6.1.2.1.10.48.1.1", false, true, false, false);
                    this.hdsl2ShdslSpanConfEntry = new Hdsl2ShdslSpanConfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hdsl2ShdslSpanConfEntry
                    };
                }
                public static final class Hdsl2ShdslSpanConfEntryEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    public final Hdsl2ShdslSpanConfNumRepeatersEnt hdsl2ShdslSpanConfNumRepeaters;

                    public final Hdsl2ShdslSpanConfProfileEnt hdsl2ShdslSpanConfProfile;

                    public final Hdsl2ShdslSpanConfAlarmProfileEnt hdsl2ShdslSpanConfAlarmProfile;

                    private Hdsl2ShdslSpanConfEntryEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslSpanConfEntry", "1.3.6.1.2.1.10.48.1.1.1", false, false, false, true);
                        this.hdsl2ShdslSpanConfNumRepeaters = new Hdsl2ShdslSpanConfNumRepeatersEnt(mib, this);
                        this.hdsl2ShdslSpanConfProfile = new Hdsl2ShdslSpanConfProfileEnt(mib, this);
                        this.hdsl2ShdslSpanConfAlarmProfile = new Hdsl2ShdslSpanConfAlarmProfileEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hdsl2ShdslSpanConfNumRepeaters,
                            this.hdsl2ShdslSpanConfProfile,
                            this.hdsl2ShdslSpanConfAlarmProfile
                        };
                    }
                    public static final class Hdsl2ShdslSpanConfNumRepeatersEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfNumRepeatersEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfNumRepeaters", "1.3.6.1.2.1.10.48.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslSpanConfProfileEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfProfileEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfProfile", "1.3.6.1.2.1.10.48.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslSpanConfAlarmProfileEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfAlarmProfileEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfAlarmProfile", "1.3.6.1.2.1.10.48.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Hdsl2ShdslSpanStatusTableEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                public final Hdsl2ShdslSpanStatusEntryEnt hdsl2ShdslSpanStatusEntry;

                private Hdsl2ShdslSpanStatusTableEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslSpanStatusTable", "1.3.6.1.2.1.10.48.1.2", false, true, false, false);
                    this.hdsl2ShdslSpanStatusEntry = new Hdsl2ShdslSpanStatusEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hdsl2ShdslSpanStatusEntry
                    };
                }
                public static final class Hdsl2ShdslSpanStatusEntryEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    public final Hdsl2ShdslStatusNumAvailRepeatersEnt hdsl2ShdslStatusNumAvailRepeaters;

                    public final Hdsl2ShdslStatusMaxAttainableLineRateEnt hdsl2ShdslStatusMaxAttainableLineRate;

                    public final Hdsl2ShdslStatusActualLineRateEnt hdsl2ShdslStatusActualLineRate;

                    public final Hdsl2ShdslStatusTransmissionModeCurrentEnt hdsl2ShdslStatusTransmissionModeCurrent;

                    public final Hdsl2ShdslStatusMaxAttainablePayloadRateEnt hdsl2ShdslStatusMaxAttainablePayloadRate;

                    public final Hdsl2ShdslStatusActualPayloadRateEnt hdsl2ShdslStatusActualPayloadRate;

                    private Hdsl2ShdslSpanStatusEntryEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslSpanStatusEntry", "1.3.6.1.2.1.10.48.1.2.1", false, false, false, true);
                        this.hdsl2ShdslStatusNumAvailRepeaters = new Hdsl2ShdslStatusNumAvailRepeatersEnt(mib, this);
                        this.hdsl2ShdslStatusMaxAttainableLineRate = new Hdsl2ShdslStatusMaxAttainableLineRateEnt(mib, this);
                        this.hdsl2ShdslStatusActualLineRate = new Hdsl2ShdslStatusActualLineRateEnt(mib, this);
                        this.hdsl2ShdslStatusTransmissionModeCurrent = new Hdsl2ShdslStatusTransmissionModeCurrentEnt(mib, this);
                        this.hdsl2ShdslStatusMaxAttainablePayloadRate = new Hdsl2ShdslStatusMaxAttainablePayloadRateEnt(mib, this);
                        this.hdsl2ShdslStatusActualPayloadRate = new Hdsl2ShdslStatusActualPayloadRateEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hdsl2ShdslStatusNumAvailRepeaters,
                            this.hdsl2ShdslStatusMaxAttainableLineRate,
                            this.hdsl2ShdslStatusActualLineRate,
                            this.hdsl2ShdslStatusTransmissionModeCurrent,
                            this.hdsl2ShdslStatusMaxAttainablePayloadRate,
                            this.hdsl2ShdslStatusActualPayloadRate
                        };
                    }
                    public static final class Hdsl2ShdslStatusNumAvailRepeatersEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslStatusNumAvailRepeatersEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslStatusNumAvailRepeaters", "1.3.6.1.2.1.10.48.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslStatusMaxAttainableLineRateEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslStatusMaxAttainableLineRateEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslStatusMaxAttainableLineRate", "1.3.6.1.2.1.10.48.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslStatusActualLineRateEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslStatusActualLineRateEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslStatusActualLineRate", "1.3.6.1.2.1.10.48.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslStatusTransmissionModeCurrentEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslStatusTransmissionModeCurrentEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslStatusTransmissionModeCurrent", "1.3.6.1.2.1.10.48.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslStatusMaxAttainablePayloadRateEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslStatusMaxAttainablePayloadRateEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslStatusMaxAttainablePayloadRate", "1.3.6.1.2.1.10.48.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslStatusActualPayloadRateEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslStatusActualPayloadRateEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslStatusActualPayloadRate", "1.3.6.1.2.1.10.48.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Hdsl2ShdslInventoryTableEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                public final Hdsl2ShdslInventoryEntryEnt hdsl2ShdslInventoryEntry;

                private Hdsl2ShdslInventoryTableEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslInventoryTable", "1.3.6.1.2.1.10.48.1.3", false, true, false, false);
                    this.hdsl2ShdslInventoryEntry = new Hdsl2ShdslInventoryEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hdsl2ShdslInventoryEntry
                    };
                }
                public static final class Hdsl2ShdslInventoryEntryEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    public final Hdsl2ShdslInvIndexEnt hdsl2ShdslInvIndex;

                    public final Hdsl2ShdslInvVendorIDEnt hdsl2ShdslInvVendorID;

                    public final Hdsl2ShdslInvVendorModelNumberEnt hdsl2ShdslInvVendorModelNumber;

                    public final Hdsl2ShdslInvVendorSerialNumberEnt hdsl2ShdslInvVendorSerialNumber;

                    public final Hdsl2ShdslInvVendorEOCSoftwareVersionEnt hdsl2ShdslInvVendorEOCSoftwareVersion;

                    public final Hdsl2ShdslInvStandardVersionEnt hdsl2ShdslInvStandardVersion;

                    public final Hdsl2ShdslInvVendorListNumberEnt hdsl2ShdslInvVendorListNumber;

                    public final Hdsl2ShdslInvVendorIssueNumberEnt hdsl2ShdslInvVendorIssueNumber;

                    public final Hdsl2ShdslInvVendorSoftwareVersionEnt hdsl2ShdslInvVendorSoftwareVersion;

                    public final Hdsl2ShdslInvEquipmentCodeEnt hdsl2ShdslInvEquipmentCode;

                    public final Hdsl2ShdslInvVendorOtherEnt hdsl2ShdslInvVendorOther;

                    public final Hdsl2ShdslInvTransmissionModeCapabilityEnt hdsl2ShdslInvTransmissionModeCapability;

                    private Hdsl2ShdslInventoryEntryEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslInventoryEntry", "1.3.6.1.2.1.10.48.1.3.1", false, false, false, true);
                        this.hdsl2ShdslInvIndex = new Hdsl2ShdslInvIndexEnt(mib, this);
                        this.hdsl2ShdslInvVendorID = new Hdsl2ShdslInvVendorIDEnt(mib, this);
                        this.hdsl2ShdslInvVendorModelNumber = new Hdsl2ShdslInvVendorModelNumberEnt(mib, this);
                        this.hdsl2ShdslInvVendorSerialNumber = new Hdsl2ShdslInvVendorSerialNumberEnt(mib, this);
                        this.hdsl2ShdslInvVendorEOCSoftwareVersion = new Hdsl2ShdslInvVendorEOCSoftwareVersionEnt(mib, this);
                        this.hdsl2ShdslInvStandardVersion = new Hdsl2ShdslInvStandardVersionEnt(mib, this);
                        this.hdsl2ShdslInvVendorListNumber = new Hdsl2ShdslInvVendorListNumberEnt(mib, this);
                        this.hdsl2ShdslInvVendorIssueNumber = new Hdsl2ShdslInvVendorIssueNumberEnt(mib, this);
                        this.hdsl2ShdslInvVendorSoftwareVersion = new Hdsl2ShdslInvVendorSoftwareVersionEnt(mib, this);
                        this.hdsl2ShdslInvEquipmentCode = new Hdsl2ShdslInvEquipmentCodeEnt(mib, this);
                        this.hdsl2ShdslInvVendorOther = new Hdsl2ShdslInvVendorOtherEnt(mib, this);
                        this.hdsl2ShdslInvTransmissionModeCapability = new Hdsl2ShdslInvTransmissionModeCapabilityEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hdsl2ShdslInvIndex,
                            this.hdsl2ShdslInvVendorID,
                            this.hdsl2ShdslInvVendorModelNumber,
                            this.hdsl2ShdslInvVendorSerialNumber,
                            this.hdsl2ShdslInvVendorEOCSoftwareVersion,
                            this.hdsl2ShdslInvStandardVersion,
                            this.hdsl2ShdslInvVendorListNumber,
                            this.hdsl2ShdslInvVendorIssueNumber,
                            this.hdsl2ShdslInvVendorSoftwareVersion,
                            this.hdsl2ShdslInvEquipmentCode,
                            this.hdsl2ShdslInvVendorOther,
                            this.hdsl2ShdslInvTransmissionModeCapability
                        };
                    }
                    public static final class Hdsl2ShdslInvIndexEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslInvIndexEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslInvIndex", "1.3.6.1.2.1.10.48.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslInvVendorIDEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslInvVendorIDEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslInvVendorID", "1.3.6.1.2.1.10.48.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslInvVendorModelNumberEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslInvVendorModelNumberEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslInvVendorModelNumber", "1.3.6.1.2.1.10.48.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslInvVendorSerialNumberEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslInvVendorSerialNumberEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslInvVendorSerialNumber", "1.3.6.1.2.1.10.48.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslInvVendorEOCSoftwareVersionEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslInvVendorEOCSoftwareVersionEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslInvVendorEOCSoftwareVersion", "1.3.6.1.2.1.10.48.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslInvStandardVersionEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslInvStandardVersionEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslInvStandardVersion", "1.3.6.1.2.1.10.48.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslInvVendorListNumberEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslInvVendorListNumberEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslInvVendorListNumber", "1.3.6.1.2.1.10.48.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslInvVendorIssueNumberEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslInvVendorIssueNumberEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslInvVendorIssueNumber", "1.3.6.1.2.1.10.48.1.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslInvVendorSoftwareVersionEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslInvVendorSoftwareVersionEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslInvVendorSoftwareVersion", "1.3.6.1.2.1.10.48.1.3.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslInvEquipmentCodeEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslInvEquipmentCodeEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslInvEquipmentCode", "1.3.6.1.2.1.10.48.1.3.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslInvVendorOtherEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslInvVendorOtherEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslInvVendorOther", "1.3.6.1.2.1.10.48.1.3.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslInvTransmissionModeCapabilityEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslInvTransmissionModeCapabilityEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslInvTransmissionModeCapability", "1.3.6.1.2.1.10.48.1.3.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Hdsl2ShdslEndpointConfTableEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                public final Hdsl2ShdslEndpointConfEntryEnt hdsl2ShdslEndpointConfEntry;

                private Hdsl2ShdslEndpointConfTableEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslEndpointConfTable", "1.3.6.1.2.1.10.48.1.4", false, true, false, false);
                    this.hdsl2ShdslEndpointConfEntry = new Hdsl2ShdslEndpointConfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hdsl2ShdslEndpointConfEntry
                    };
                }
                public static final class Hdsl2ShdslEndpointConfEntryEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    public final Hdsl2ShdslEndpointSideEnt hdsl2ShdslEndpointSide;

                    public final Hdsl2ShdslEndpointWirePairEnt hdsl2ShdslEndpointWirePair;

                    public final Hdsl2ShdslEndpointAlarmConfProfileEnt hdsl2ShdslEndpointAlarmConfProfile;

                    private Hdsl2ShdslEndpointConfEntryEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslEndpointConfEntry", "1.3.6.1.2.1.10.48.1.4.1", false, false, false, true);
                        this.hdsl2ShdslEndpointSide = new Hdsl2ShdslEndpointSideEnt(mib, this);
                        this.hdsl2ShdslEndpointWirePair = new Hdsl2ShdslEndpointWirePairEnt(mib, this);
                        this.hdsl2ShdslEndpointAlarmConfProfile = new Hdsl2ShdslEndpointAlarmConfProfileEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hdsl2ShdslEndpointSide,
                            this.hdsl2ShdslEndpointWirePair,
                            this.hdsl2ShdslEndpointAlarmConfProfile
                        };
                    }
                    public static final class Hdsl2ShdslEndpointSideEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointSideEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointSide", "1.3.6.1.2.1.10.48.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointWirePairEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointWirePairEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointWirePair", "1.3.6.1.2.1.10.48.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointAlarmConfProfileEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointAlarmConfProfileEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointAlarmConfProfile", "1.3.6.1.2.1.10.48.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Hdsl2ShdslEndpointCurrTableEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                public final Hdsl2ShdslEndpointCurrEntryEnt hdsl2ShdslEndpointCurrEntry;

                private Hdsl2ShdslEndpointCurrTableEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslEndpointCurrTable", "1.3.6.1.2.1.10.48.1.5", false, true, false, false);
                    this.hdsl2ShdslEndpointCurrEntry = new Hdsl2ShdslEndpointCurrEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hdsl2ShdslEndpointCurrEntry
                    };
                }
                public static final class Hdsl2ShdslEndpointCurrEntryEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    public final Hdsl2ShdslEndpointCurrAtnEnt hdsl2ShdslEndpointCurrAtn;

                    public final Hdsl2ShdslEndpointCurrSnrMgnEnt hdsl2ShdslEndpointCurrSnrMgn;

                    public final Hdsl2ShdslEndpointCurrStatusEnt hdsl2ShdslEndpointCurrStatus;

                    public final Hdsl2ShdslEndpointESEnt hdsl2ShdslEndpointES;

                    public final Hdsl2ShdslEndpointSESEnt hdsl2ShdslEndpointSES;

                    public final Hdsl2ShdslEndpointCRCanomaliesEnt hdsl2ShdslEndpointCRCanomalies;

                    public final Hdsl2ShdslEndpointLOSWSEnt hdsl2ShdslEndpointLOSWS;

                    public final Hdsl2ShdslEndpointUASEnt hdsl2ShdslEndpointUAS;

                    public final Hdsl2ShdslEndpointCurr15MinTimeElapsedEnt hdsl2ShdslEndpointCurr15MinTimeElapsed;

                    public final Hdsl2ShdslEndpointCurr15MinESEnt hdsl2ShdslEndpointCurr15MinES;

                    public final Hdsl2ShdslEndpointCurr15MinSESEnt hdsl2ShdslEndpointCurr15MinSES;

                    public final Hdsl2ShdslEndpointCurr15MinCRCanomaliesEnt hdsl2ShdslEndpointCurr15MinCRCanomalies;

                    public final Hdsl2ShdslEndpointCurr15MinLOSWSEnt hdsl2ShdslEndpointCurr15MinLOSWS;

                    public final Hdsl2ShdslEndpointCurr15MinUASEnt hdsl2ShdslEndpointCurr15MinUAS;

                    public final Hdsl2ShdslEndpointCurr1DayTimeElapsedEnt hdsl2ShdslEndpointCurr1DayTimeElapsed;

                    public final Hdsl2ShdslEndpointCurr1DayESEnt hdsl2ShdslEndpointCurr1DayES;

                    public final Hdsl2ShdslEndpointCurr1DaySESEnt hdsl2ShdslEndpointCurr1DaySES;

                    public final Hdsl2ShdslEndpointCurr1DayCRCanomaliesEnt hdsl2ShdslEndpointCurr1DayCRCanomalies;

                    public final Hdsl2ShdslEndpointCurr1DayLOSWSEnt hdsl2ShdslEndpointCurr1DayLOSWS;

                    public final Hdsl2ShdslEndpointCurr1DayUASEnt hdsl2ShdslEndpointCurr1DayUAS;

                    public final Hdsl2ShdslEndpointCurrTipRingReversalEnt hdsl2ShdslEndpointCurrTipRingReversal;

                    public final Hdsl2ShdslEndpointCurrActivationStateEnt hdsl2ShdslEndpointCurrActivationState;

                    private Hdsl2ShdslEndpointCurrEntryEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslEndpointCurrEntry", "1.3.6.1.2.1.10.48.1.5.1", false, false, false, true);
                        this.hdsl2ShdslEndpointCurrAtn = new Hdsl2ShdslEndpointCurrAtnEnt(mib, this);
                        this.hdsl2ShdslEndpointCurrSnrMgn = new Hdsl2ShdslEndpointCurrSnrMgnEnt(mib, this);
                        this.hdsl2ShdslEndpointCurrStatus = new Hdsl2ShdslEndpointCurrStatusEnt(mib, this);
                        this.hdsl2ShdslEndpointES = new Hdsl2ShdslEndpointESEnt(mib, this);
                        this.hdsl2ShdslEndpointSES = new Hdsl2ShdslEndpointSESEnt(mib, this);
                        this.hdsl2ShdslEndpointCRCanomalies = new Hdsl2ShdslEndpointCRCanomaliesEnt(mib, this);
                        this.hdsl2ShdslEndpointLOSWS = new Hdsl2ShdslEndpointLOSWSEnt(mib, this);
                        this.hdsl2ShdslEndpointUAS = new Hdsl2ShdslEndpointUASEnt(mib, this);
                        this.hdsl2ShdslEndpointCurr15MinTimeElapsed = new Hdsl2ShdslEndpointCurr15MinTimeElapsedEnt(mib, this);
                        this.hdsl2ShdslEndpointCurr15MinES = new Hdsl2ShdslEndpointCurr15MinESEnt(mib, this);
                        this.hdsl2ShdslEndpointCurr15MinSES = new Hdsl2ShdslEndpointCurr15MinSESEnt(mib, this);
                        this.hdsl2ShdslEndpointCurr15MinCRCanomalies = new Hdsl2ShdslEndpointCurr15MinCRCanomaliesEnt(mib, this);
                        this.hdsl2ShdslEndpointCurr15MinLOSWS = new Hdsl2ShdslEndpointCurr15MinLOSWSEnt(mib, this);
                        this.hdsl2ShdslEndpointCurr15MinUAS = new Hdsl2ShdslEndpointCurr15MinUASEnt(mib, this);
                        this.hdsl2ShdslEndpointCurr1DayTimeElapsed = new Hdsl2ShdslEndpointCurr1DayTimeElapsedEnt(mib, this);
                        this.hdsl2ShdslEndpointCurr1DayES = new Hdsl2ShdslEndpointCurr1DayESEnt(mib, this);
                        this.hdsl2ShdslEndpointCurr1DaySES = new Hdsl2ShdslEndpointCurr1DaySESEnt(mib, this);
                        this.hdsl2ShdslEndpointCurr1DayCRCanomalies = new Hdsl2ShdslEndpointCurr1DayCRCanomaliesEnt(mib, this);
                        this.hdsl2ShdslEndpointCurr1DayLOSWS = new Hdsl2ShdslEndpointCurr1DayLOSWSEnt(mib, this);
                        this.hdsl2ShdslEndpointCurr1DayUAS = new Hdsl2ShdslEndpointCurr1DayUASEnt(mib, this);
                        this.hdsl2ShdslEndpointCurrTipRingReversal = new Hdsl2ShdslEndpointCurrTipRingReversalEnt(mib, this);
                        this.hdsl2ShdslEndpointCurrActivationState = new Hdsl2ShdslEndpointCurrActivationStateEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hdsl2ShdslEndpointCurrAtn,
                            this.hdsl2ShdslEndpointCurrSnrMgn,
                            this.hdsl2ShdslEndpointCurrStatus,
                            this.hdsl2ShdslEndpointES,
                            this.hdsl2ShdslEndpointSES,
                            this.hdsl2ShdslEndpointCRCanomalies,
                            this.hdsl2ShdslEndpointLOSWS,
                            this.hdsl2ShdslEndpointUAS,
                            this.hdsl2ShdslEndpointCurr15MinTimeElapsed,
                            this.hdsl2ShdslEndpointCurr15MinES,
                            this.hdsl2ShdslEndpointCurr15MinSES,
                            this.hdsl2ShdslEndpointCurr15MinCRCanomalies,
                            this.hdsl2ShdslEndpointCurr15MinLOSWS,
                            this.hdsl2ShdslEndpointCurr15MinUAS,
                            this.hdsl2ShdslEndpointCurr1DayTimeElapsed,
                            this.hdsl2ShdslEndpointCurr1DayES,
                            this.hdsl2ShdslEndpointCurr1DaySES,
                            this.hdsl2ShdslEndpointCurr1DayCRCanomalies,
                            this.hdsl2ShdslEndpointCurr1DayLOSWS,
                            this.hdsl2ShdslEndpointCurr1DayUAS,
                            this.hdsl2ShdslEndpointCurrTipRingReversal,
                            this.hdsl2ShdslEndpointCurrActivationState
                        };
                    }
                    public static final class Hdsl2ShdslEndpointCurrAtnEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCurrAtnEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCurrAtn", "1.3.6.1.2.1.10.48.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointCurrSnrMgnEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCurrSnrMgnEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCurrSnrMgn", "1.3.6.1.2.1.10.48.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointCurrStatusEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCurrStatusEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCurrStatus", "1.3.6.1.2.1.10.48.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointESEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointESEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointES", "1.3.6.1.2.1.10.48.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointSESEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointSESEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointSES", "1.3.6.1.2.1.10.48.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointCRCanomaliesEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCRCanomaliesEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCRCanomalies", "1.3.6.1.2.1.10.48.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointLOSWSEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointLOSWSEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointLOSWS", "1.3.6.1.2.1.10.48.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointUASEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointUASEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointUAS", "1.3.6.1.2.1.10.48.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointCurr15MinTimeElapsedEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCurr15MinTimeElapsedEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCurr15MinTimeElapsed", "1.3.6.1.2.1.10.48.1.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointCurr15MinESEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCurr15MinESEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCurr15MinES", "1.3.6.1.2.1.10.48.1.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointCurr15MinSESEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCurr15MinSESEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCurr15MinSES", "1.3.6.1.2.1.10.48.1.5.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointCurr15MinCRCanomaliesEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCurr15MinCRCanomaliesEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCurr15MinCRCanomalies", "1.3.6.1.2.1.10.48.1.5.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointCurr15MinLOSWSEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCurr15MinLOSWSEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCurr15MinLOSWS", "1.3.6.1.2.1.10.48.1.5.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointCurr15MinUASEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCurr15MinUASEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCurr15MinUAS", "1.3.6.1.2.1.10.48.1.5.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointCurr1DayTimeElapsedEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCurr1DayTimeElapsedEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCurr1DayTimeElapsed", "1.3.6.1.2.1.10.48.1.5.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointCurr1DayESEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCurr1DayESEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCurr1DayES", "1.3.6.1.2.1.10.48.1.5.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointCurr1DaySESEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCurr1DaySESEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCurr1DaySES", "1.3.6.1.2.1.10.48.1.5.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointCurr1DayCRCanomaliesEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCurr1DayCRCanomaliesEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCurr1DayCRCanomalies", "1.3.6.1.2.1.10.48.1.5.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointCurr1DayLOSWSEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCurr1DayLOSWSEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCurr1DayLOSWS", "1.3.6.1.2.1.10.48.1.5.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointCurr1DayUASEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCurr1DayUASEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCurr1DayUAS", "1.3.6.1.2.1.10.48.1.5.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointCurrTipRingReversalEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCurrTipRingReversalEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCurrTipRingReversal", "1.3.6.1.2.1.10.48.1.5.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointCurrActivationStateEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointCurrActivationStateEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointCurrActivationState", "1.3.6.1.2.1.10.48.1.5.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Hdsl2Shdsl15MinIntervalTableEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                public final Hdsl2Shdsl15MinIntervalEntryEnt hdsl2Shdsl15MinIntervalEntry;

                private Hdsl2Shdsl15MinIntervalTableEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2Shdsl15MinIntervalTable", "1.3.6.1.2.1.10.48.1.6", false, true, false, false);
                    this.hdsl2Shdsl15MinIntervalEntry = new Hdsl2Shdsl15MinIntervalEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hdsl2Shdsl15MinIntervalEntry
                    };
                }
                public static final class Hdsl2Shdsl15MinIntervalEntryEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    public final Hdsl2Shdsl15MinIntervalNumberEnt hdsl2Shdsl15MinIntervalNumber;

                    public final Hdsl2Shdsl15MinIntervalESEnt hdsl2Shdsl15MinIntervalES;

                    public final Hdsl2Shdsl15MinIntervalSESEnt hdsl2Shdsl15MinIntervalSES;

                    public final Hdsl2Shdsl15MinIntervalCRCanomaliesEnt hdsl2Shdsl15MinIntervalCRCanomalies;

                    public final Hdsl2Shdsl15MinIntervalLOSWSEnt hdsl2Shdsl15MinIntervalLOSWS;

                    public final Hdsl2Shdsl15MinIntervalUASEnt hdsl2Shdsl15MinIntervalUAS;

                    private Hdsl2Shdsl15MinIntervalEntryEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2Shdsl15MinIntervalEntry", "1.3.6.1.2.1.10.48.1.6.1", false, false, false, true);
                        this.hdsl2Shdsl15MinIntervalNumber = new Hdsl2Shdsl15MinIntervalNumberEnt(mib, this);
                        this.hdsl2Shdsl15MinIntervalES = new Hdsl2Shdsl15MinIntervalESEnt(mib, this);
                        this.hdsl2Shdsl15MinIntervalSES = new Hdsl2Shdsl15MinIntervalSESEnt(mib, this);
                        this.hdsl2Shdsl15MinIntervalCRCanomalies = new Hdsl2Shdsl15MinIntervalCRCanomaliesEnt(mib, this);
                        this.hdsl2Shdsl15MinIntervalLOSWS = new Hdsl2Shdsl15MinIntervalLOSWSEnt(mib, this);
                        this.hdsl2Shdsl15MinIntervalUAS = new Hdsl2Shdsl15MinIntervalUASEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hdsl2Shdsl15MinIntervalNumber,
                            this.hdsl2Shdsl15MinIntervalES,
                            this.hdsl2Shdsl15MinIntervalSES,
                            this.hdsl2Shdsl15MinIntervalCRCanomalies,
                            this.hdsl2Shdsl15MinIntervalLOSWS,
                            this.hdsl2Shdsl15MinIntervalUAS
                        };
                    }
                    public static final class Hdsl2Shdsl15MinIntervalNumberEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2Shdsl15MinIntervalNumberEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2Shdsl15MinIntervalNumber", "1.3.6.1.2.1.10.48.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2Shdsl15MinIntervalESEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2Shdsl15MinIntervalESEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2Shdsl15MinIntervalES", "1.3.6.1.2.1.10.48.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2Shdsl15MinIntervalSESEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2Shdsl15MinIntervalSESEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2Shdsl15MinIntervalSES", "1.3.6.1.2.1.10.48.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2Shdsl15MinIntervalCRCanomaliesEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2Shdsl15MinIntervalCRCanomaliesEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2Shdsl15MinIntervalCRCanomalies", "1.3.6.1.2.1.10.48.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2Shdsl15MinIntervalLOSWSEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2Shdsl15MinIntervalLOSWSEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2Shdsl15MinIntervalLOSWS", "1.3.6.1.2.1.10.48.1.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2Shdsl15MinIntervalUASEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2Shdsl15MinIntervalUASEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2Shdsl15MinIntervalUAS", "1.3.6.1.2.1.10.48.1.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Hdsl2Shdsl1DayIntervalTableEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                public final Hdsl2Shdsl1DayIntervalEntryEnt hdsl2Shdsl1DayIntervalEntry;

                private Hdsl2Shdsl1DayIntervalTableEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2Shdsl1DayIntervalTable", "1.3.6.1.2.1.10.48.1.7", false, true, false, false);
                    this.hdsl2Shdsl1DayIntervalEntry = new Hdsl2Shdsl1DayIntervalEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hdsl2Shdsl1DayIntervalEntry
                    };
                }
                public static final class Hdsl2Shdsl1DayIntervalEntryEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    public final Hdsl2Shdsl1DayIntervalNumberEnt hdsl2Shdsl1DayIntervalNumber;

                    public final Hdsl2Shdsl1DayIntervalMoniSecsEnt hdsl2Shdsl1DayIntervalMoniSecs;

                    public final Hdsl2Shdsl1DayIntervalESEnt hdsl2Shdsl1DayIntervalES;

                    public final Hdsl2Shdsl1DayIntervalSESEnt hdsl2Shdsl1DayIntervalSES;

                    public final Hdsl2Shdsl1DayIntervalCRCanomaliesEnt hdsl2Shdsl1DayIntervalCRCanomalies;

                    public final Hdsl2Shdsl1DayIntervalLOSWSEnt hdsl2Shdsl1DayIntervalLOSWS;

                    public final Hdsl2Shdsl1DayIntervalUASEnt hdsl2Shdsl1DayIntervalUAS;

                    private Hdsl2Shdsl1DayIntervalEntryEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2Shdsl1DayIntervalEntry", "1.3.6.1.2.1.10.48.1.7.1", false, false, false, true);
                        this.hdsl2Shdsl1DayIntervalNumber = new Hdsl2Shdsl1DayIntervalNumberEnt(mib, this);
                        this.hdsl2Shdsl1DayIntervalMoniSecs = new Hdsl2Shdsl1DayIntervalMoniSecsEnt(mib, this);
                        this.hdsl2Shdsl1DayIntervalES = new Hdsl2Shdsl1DayIntervalESEnt(mib, this);
                        this.hdsl2Shdsl1DayIntervalSES = new Hdsl2Shdsl1DayIntervalSESEnt(mib, this);
                        this.hdsl2Shdsl1DayIntervalCRCanomalies = new Hdsl2Shdsl1DayIntervalCRCanomaliesEnt(mib, this);
                        this.hdsl2Shdsl1DayIntervalLOSWS = new Hdsl2Shdsl1DayIntervalLOSWSEnt(mib, this);
                        this.hdsl2Shdsl1DayIntervalUAS = new Hdsl2Shdsl1DayIntervalUASEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hdsl2Shdsl1DayIntervalNumber,
                            this.hdsl2Shdsl1DayIntervalMoniSecs,
                            this.hdsl2Shdsl1DayIntervalES,
                            this.hdsl2Shdsl1DayIntervalSES,
                            this.hdsl2Shdsl1DayIntervalCRCanomalies,
                            this.hdsl2Shdsl1DayIntervalLOSWS,
                            this.hdsl2Shdsl1DayIntervalUAS
                        };
                    }
                    public static final class Hdsl2Shdsl1DayIntervalNumberEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2Shdsl1DayIntervalNumberEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2Shdsl1DayIntervalNumber", "1.3.6.1.2.1.10.48.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2Shdsl1DayIntervalMoniSecsEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2Shdsl1DayIntervalMoniSecsEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2Shdsl1DayIntervalMoniSecs", "1.3.6.1.2.1.10.48.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2Shdsl1DayIntervalESEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2Shdsl1DayIntervalESEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2Shdsl1DayIntervalES", "1.3.6.1.2.1.10.48.1.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2Shdsl1DayIntervalSESEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2Shdsl1DayIntervalSESEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2Shdsl1DayIntervalSES", "1.3.6.1.2.1.10.48.1.7.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2Shdsl1DayIntervalCRCanomaliesEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2Shdsl1DayIntervalCRCanomaliesEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2Shdsl1DayIntervalCRCanomalies", "1.3.6.1.2.1.10.48.1.7.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2Shdsl1DayIntervalLOSWSEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2Shdsl1DayIntervalLOSWSEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2Shdsl1DayIntervalLOSWS", "1.3.6.1.2.1.10.48.1.7.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2Shdsl1DayIntervalUASEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2Shdsl1DayIntervalUASEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2Shdsl1DayIntervalUAS", "1.3.6.1.2.1.10.48.1.7.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Hdsl2ShdslEndpointMaintTableEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                public final Hdsl2ShdslEndpointMaintEntryEnt hdsl2ShdslEndpointMaintEntry;

                private Hdsl2ShdslEndpointMaintTableEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslEndpointMaintTable", "1.3.6.1.2.1.10.48.1.8", false, true, false, false);
                    this.hdsl2ShdslEndpointMaintEntry = new Hdsl2ShdslEndpointMaintEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hdsl2ShdslEndpointMaintEntry
                    };
                }
                public static final class Hdsl2ShdslEndpointMaintEntryEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    public final Hdsl2ShdslMaintLoopbackConfigEnt hdsl2ShdslMaintLoopbackConfig;

                    public final Hdsl2ShdslMaintTipRingReversalEnt hdsl2ShdslMaintTipRingReversal;

                    public final Hdsl2ShdslMaintPowerBackOffEnt hdsl2ShdslMaintPowerBackOff;

                    public final Hdsl2ShdslMaintSoftRestartEnt hdsl2ShdslMaintSoftRestart;

                    private Hdsl2ShdslEndpointMaintEntryEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslEndpointMaintEntry", "1.3.6.1.2.1.10.48.1.8.1", false, false, false, true);
                        this.hdsl2ShdslMaintLoopbackConfig = new Hdsl2ShdslMaintLoopbackConfigEnt(mib, this);
                        this.hdsl2ShdslMaintTipRingReversal = new Hdsl2ShdslMaintTipRingReversalEnt(mib, this);
                        this.hdsl2ShdslMaintPowerBackOff = new Hdsl2ShdslMaintPowerBackOffEnt(mib, this);
                        this.hdsl2ShdslMaintSoftRestart = new Hdsl2ShdslMaintSoftRestartEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hdsl2ShdslMaintLoopbackConfig,
                            this.hdsl2ShdslMaintTipRingReversal,
                            this.hdsl2ShdslMaintPowerBackOff,
                            this.hdsl2ShdslMaintSoftRestart
                        };
                    }
                    public static final class Hdsl2ShdslMaintLoopbackConfigEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslMaintLoopbackConfigEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslMaintLoopbackConfig", "1.3.6.1.2.1.10.48.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslMaintTipRingReversalEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslMaintTipRingReversalEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslMaintTipRingReversal", "1.3.6.1.2.1.10.48.1.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslMaintPowerBackOffEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslMaintPowerBackOffEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslMaintPowerBackOff", "1.3.6.1.2.1.10.48.1.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslMaintSoftRestartEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslMaintSoftRestartEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslMaintSoftRestart", "1.3.6.1.2.1.10.48.1.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Hdsl2ShdslUnitMaintTableEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                public final Hdsl2ShdslUnitMaintEntryEnt hdsl2ShdslUnitMaintEntry;

                private Hdsl2ShdslUnitMaintTableEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslUnitMaintTable", "1.3.6.1.2.1.10.48.1.9", false, true, false, false);
                    this.hdsl2ShdslUnitMaintEntry = new Hdsl2ShdslUnitMaintEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hdsl2ShdslUnitMaintEntry
                    };
                }
                public static final class Hdsl2ShdslUnitMaintEntryEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    public final Hdsl2ShdslMaintLoopbackTimeoutEnt hdsl2ShdslMaintLoopbackTimeout;

                    public final Hdsl2ShdslMaintUnitPowerSourceEnt hdsl2ShdslMaintUnitPowerSource;

                    private Hdsl2ShdslUnitMaintEntryEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslUnitMaintEntry", "1.3.6.1.2.1.10.48.1.9.1", false, false, false, true);
                        this.hdsl2ShdslMaintLoopbackTimeout = new Hdsl2ShdslMaintLoopbackTimeoutEnt(mib, this);
                        this.hdsl2ShdslMaintUnitPowerSource = new Hdsl2ShdslMaintUnitPowerSourceEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hdsl2ShdslMaintLoopbackTimeout,
                            this.hdsl2ShdslMaintUnitPowerSource
                        };
                    }
                    public static final class Hdsl2ShdslMaintLoopbackTimeoutEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslMaintLoopbackTimeoutEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslMaintLoopbackTimeout", "1.3.6.1.2.1.10.48.1.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslMaintUnitPowerSourceEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslMaintUnitPowerSourceEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslMaintUnitPowerSource", "1.3.6.1.2.1.10.48.1.9.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Hdsl2ShdslSpanConfProfileTableEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                public final Hdsl2ShdslSpanConfProfileEntryEnt hdsl2ShdslSpanConfProfileEntry;

                private Hdsl2ShdslSpanConfProfileTableEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslSpanConfProfileTable", "1.3.6.1.2.1.10.48.1.10", false, true, false, false);
                    this.hdsl2ShdslSpanConfProfileEntry = new Hdsl2ShdslSpanConfProfileEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hdsl2ShdslSpanConfProfileEntry
                    };
                }
                public static final class Hdsl2ShdslSpanConfProfileEntryEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    public final Hdsl2ShdslSpanConfProfileNameEnt hdsl2ShdslSpanConfProfileName;

                    public final Hdsl2ShdslSpanConfWireInterfaceEnt hdsl2ShdslSpanConfWireInterface;

                    public final Hdsl2ShdslSpanConfMinLineRateEnt hdsl2ShdslSpanConfMinLineRate;

                    public final Hdsl2ShdslSpanConfMaxLineRateEnt hdsl2ShdslSpanConfMaxLineRate;

                    public final Hdsl2ShdslSpanConfPSDEnt hdsl2ShdslSpanConfPSD;

                    public final Hdsl2ShdslSpanConfTransmissionModeEnt hdsl2ShdslSpanConfTransmissionMode;

                    public final Hdsl2ShdslSpanConfRemoteEnabledEnt hdsl2ShdslSpanConfRemoteEnabled;

                    public final Hdsl2ShdslSpanConfPowerFeedingEnt hdsl2ShdslSpanConfPowerFeeding;

                    public final Hdsl2ShdslSpanConfCurrCondTargetMarginDownEnt hdsl2ShdslSpanConfCurrCondTargetMarginDown;

                    public final Hdsl2ShdslSpanConfWorstCaseTargetMarginDownEnt hdsl2ShdslSpanConfWorstCaseTargetMarginDown;

                    public final Hdsl2ShdslSpanConfCurrCondTargetMarginUpEnt hdsl2ShdslSpanConfCurrCondTargetMarginUp;

                    public final Hdsl2ShdslSpanConfWorstCaseTargetMarginUpEnt hdsl2ShdslSpanConfWorstCaseTargetMarginUp;

                    public final Hdsl2ShdslSpanConfUsedTargetMarginsEnt hdsl2ShdslSpanConfUsedTargetMargins;

                    public final Hdsl2ShdslSpanConfReferenceClockEnt hdsl2ShdslSpanConfReferenceClock;

                    public final Hdsl2ShdslSpanConfLineProbeEnableEnt hdsl2ShdslSpanConfLineProbeEnable;

                    public final Hdsl2ShdslSpanConfProfileRowStatusEnt hdsl2ShdslSpanConfProfileRowStatus;

                    private Hdsl2ShdslSpanConfProfileEntryEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslSpanConfProfileEntry", "1.3.6.1.2.1.10.48.1.10.1", false, false, false, true);
                        this.hdsl2ShdslSpanConfProfileName = new Hdsl2ShdslSpanConfProfileNameEnt(mib, this);
                        this.hdsl2ShdslSpanConfWireInterface = new Hdsl2ShdslSpanConfWireInterfaceEnt(mib, this);
                        this.hdsl2ShdslSpanConfMinLineRate = new Hdsl2ShdslSpanConfMinLineRateEnt(mib, this);
                        this.hdsl2ShdslSpanConfMaxLineRate = new Hdsl2ShdslSpanConfMaxLineRateEnt(mib, this);
                        this.hdsl2ShdslSpanConfPSD = new Hdsl2ShdslSpanConfPSDEnt(mib, this);
                        this.hdsl2ShdslSpanConfTransmissionMode = new Hdsl2ShdslSpanConfTransmissionModeEnt(mib, this);
                        this.hdsl2ShdslSpanConfRemoteEnabled = new Hdsl2ShdslSpanConfRemoteEnabledEnt(mib, this);
                        this.hdsl2ShdslSpanConfPowerFeeding = new Hdsl2ShdslSpanConfPowerFeedingEnt(mib, this);
                        this.hdsl2ShdslSpanConfCurrCondTargetMarginDown = new Hdsl2ShdslSpanConfCurrCondTargetMarginDownEnt(mib, this);
                        this.hdsl2ShdslSpanConfWorstCaseTargetMarginDown = new Hdsl2ShdslSpanConfWorstCaseTargetMarginDownEnt(mib, this);
                        this.hdsl2ShdslSpanConfCurrCondTargetMarginUp = new Hdsl2ShdslSpanConfCurrCondTargetMarginUpEnt(mib, this);
                        this.hdsl2ShdslSpanConfWorstCaseTargetMarginUp = new Hdsl2ShdslSpanConfWorstCaseTargetMarginUpEnt(mib, this);
                        this.hdsl2ShdslSpanConfUsedTargetMargins = new Hdsl2ShdslSpanConfUsedTargetMarginsEnt(mib, this);
                        this.hdsl2ShdslSpanConfReferenceClock = new Hdsl2ShdslSpanConfReferenceClockEnt(mib, this);
                        this.hdsl2ShdslSpanConfLineProbeEnable = new Hdsl2ShdslSpanConfLineProbeEnableEnt(mib, this);
                        this.hdsl2ShdslSpanConfProfileRowStatus = new Hdsl2ShdslSpanConfProfileRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hdsl2ShdslSpanConfProfileName,
                            this.hdsl2ShdslSpanConfWireInterface,
                            this.hdsl2ShdslSpanConfMinLineRate,
                            this.hdsl2ShdslSpanConfMaxLineRate,
                            this.hdsl2ShdslSpanConfPSD,
                            this.hdsl2ShdslSpanConfTransmissionMode,
                            this.hdsl2ShdslSpanConfRemoteEnabled,
                            this.hdsl2ShdslSpanConfPowerFeeding,
                            this.hdsl2ShdslSpanConfCurrCondTargetMarginDown,
                            this.hdsl2ShdslSpanConfWorstCaseTargetMarginDown,
                            this.hdsl2ShdslSpanConfCurrCondTargetMarginUp,
                            this.hdsl2ShdslSpanConfWorstCaseTargetMarginUp,
                            this.hdsl2ShdslSpanConfUsedTargetMargins,
                            this.hdsl2ShdslSpanConfReferenceClock,
                            this.hdsl2ShdslSpanConfLineProbeEnable,
                            this.hdsl2ShdslSpanConfProfileRowStatus
                        };
                    }
                    public static final class Hdsl2ShdslSpanConfProfileNameEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfProfileNameEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfProfileName", "1.3.6.1.2.1.10.48.1.10.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslSpanConfWireInterfaceEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfWireInterfaceEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfWireInterface", "1.3.6.1.2.1.10.48.1.10.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslSpanConfMinLineRateEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfMinLineRateEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfMinLineRate", "1.3.6.1.2.1.10.48.1.10.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslSpanConfMaxLineRateEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfMaxLineRateEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfMaxLineRate", "1.3.6.1.2.1.10.48.1.10.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslSpanConfPSDEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfPSDEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfPSD", "1.3.6.1.2.1.10.48.1.10.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslSpanConfTransmissionModeEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfTransmissionModeEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfTransmissionMode", "1.3.6.1.2.1.10.48.1.10.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslSpanConfRemoteEnabledEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfRemoteEnabledEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfRemoteEnabled", "1.3.6.1.2.1.10.48.1.10.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslSpanConfPowerFeedingEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfPowerFeedingEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfPowerFeeding", "1.3.6.1.2.1.10.48.1.10.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslSpanConfCurrCondTargetMarginDownEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfCurrCondTargetMarginDownEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfCurrCondTargetMarginDown", "1.3.6.1.2.1.10.48.1.10.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslSpanConfWorstCaseTargetMarginDownEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfWorstCaseTargetMarginDownEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfWorstCaseTargetMarginDown", "1.3.6.1.2.1.10.48.1.10.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslSpanConfCurrCondTargetMarginUpEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfCurrCondTargetMarginUpEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfCurrCondTargetMarginUp", "1.3.6.1.2.1.10.48.1.10.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslSpanConfWorstCaseTargetMarginUpEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfWorstCaseTargetMarginUpEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfWorstCaseTargetMarginUp", "1.3.6.1.2.1.10.48.1.10.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslSpanConfUsedTargetMarginsEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfUsedTargetMarginsEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfUsedTargetMargins", "1.3.6.1.2.1.10.48.1.10.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslSpanConfReferenceClockEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfReferenceClockEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfReferenceClock", "1.3.6.1.2.1.10.48.1.10.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslSpanConfLineProbeEnableEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfLineProbeEnableEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfLineProbeEnable", "1.3.6.1.2.1.10.48.1.10.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslSpanConfProfileRowStatusEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslSpanConfProfileRowStatusEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslSpanConfProfileRowStatus", "1.3.6.1.2.1.10.48.1.10.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Hdsl2ShdslEndpointAlarmConfProfileTableEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                public final Hdsl2ShdslEndpointAlarmConfProfileEntryEnt hdsl2ShdslEndpointAlarmConfProfileEntry;

                private Hdsl2ShdslEndpointAlarmConfProfileTableEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslEndpointAlarmConfProfileTable", "1.3.6.1.2.1.10.48.1.11", false, true, false, false);
                    this.hdsl2ShdslEndpointAlarmConfProfileEntry = new Hdsl2ShdslEndpointAlarmConfProfileEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hdsl2ShdslEndpointAlarmConfProfileEntry
                    };
                }
                public static final class Hdsl2ShdslEndpointAlarmConfProfileEntryEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    public final Hdsl2ShdslEndpointAlarmConfProfileNameEnt hdsl2ShdslEndpointAlarmConfProfileName;

                    public final Hdsl2ShdslEndpointThreshLoopAttenuationEnt hdsl2ShdslEndpointThreshLoopAttenuation;

                    public final Hdsl2ShdslEndpointThreshSNRMarginEnt hdsl2ShdslEndpointThreshSNRMargin;

                    public final Hdsl2ShdslEndpointThreshESEnt hdsl2ShdslEndpointThreshES;

                    public final Hdsl2ShdslEndpointThreshSESEnt hdsl2ShdslEndpointThreshSES;

                    public final Hdsl2ShdslEndpointThreshCRCanomaliesEnt hdsl2ShdslEndpointThreshCRCanomalies;

                    public final Hdsl2ShdslEndpointThreshLOSWSEnt hdsl2ShdslEndpointThreshLOSWS;

                    public final Hdsl2ShdslEndpointThreshUASEnt hdsl2ShdslEndpointThreshUAS;

                    public final Hdsl2ShdslEndpointAlarmConfProfileRowStatusEnt hdsl2ShdslEndpointAlarmConfProfileRowStatus;

                    private Hdsl2ShdslEndpointAlarmConfProfileEntryEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslEndpointAlarmConfProfileEntry", "1.3.6.1.2.1.10.48.1.11.1", false, false, false, true);
                        this.hdsl2ShdslEndpointAlarmConfProfileName = new Hdsl2ShdslEndpointAlarmConfProfileNameEnt(mib, this);
                        this.hdsl2ShdslEndpointThreshLoopAttenuation = new Hdsl2ShdslEndpointThreshLoopAttenuationEnt(mib, this);
                        this.hdsl2ShdslEndpointThreshSNRMargin = new Hdsl2ShdslEndpointThreshSNRMarginEnt(mib, this);
                        this.hdsl2ShdslEndpointThreshES = new Hdsl2ShdslEndpointThreshESEnt(mib, this);
                        this.hdsl2ShdslEndpointThreshSES = new Hdsl2ShdslEndpointThreshSESEnt(mib, this);
                        this.hdsl2ShdslEndpointThreshCRCanomalies = new Hdsl2ShdslEndpointThreshCRCanomaliesEnt(mib, this);
                        this.hdsl2ShdslEndpointThreshLOSWS = new Hdsl2ShdslEndpointThreshLOSWSEnt(mib, this);
                        this.hdsl2ShdslEndpointThreshUAS = new Hdsl2ShdslEndpointThreshUASEnt(mib, this);
                        this.hdsl2ShdslEndpointAlarmConfProfileRowStatus = new Hdsl2ShdslEndpointAlarmConfProfileRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hdsl2ShdslEndpointAlarmConfProfileName,
                            this.hdsl2ShdslEndpointThreshLoopAttenuation,
                            this.hdsl2ShdslEndpointThreshSNRMargin,
                            this.hdsl2ShdslEndpointThreshES,
                            this.hdsl2ShdslEndpointThreshSES,
                            this.hdsl2ShdslEndpointThreshCRCanomalies,
                            this.hdsl2ShdslEndpointThreshLOSWS,
                            this.hdsl2ShdslEndpointThreshUAS,
                            this.hdsl2ShdslEndpointAlarmConfProfileRowStatus
                        };
                    }
                    public static final class Hdsl2ShdslEndpointAlarmConfProfileNameEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointAlarmConfProfileNameEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointAlarmConfProfileName", "1.3.6.1.2.1.10.48.1.11.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointThreshLoopAttenuationEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointThreshLoopAttenuationEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointThreshLoopAttenuation", "1.3.6.1.2.1.10.48.1.11.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointThreshSNRMarginEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointThreshSNRMarginEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointThreshSNRMargin", "1.3.6.1.2.1.10.48.1.11.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointThreshESEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointThreshESEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointThreshES", "1.3.6.1.2.1.10.48.1.11.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointThreshSESEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointThreshSESEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointThreshSES", "1.3.6.1.2.1.10.48.1.11.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointThreshCRCanomaliesEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointThreshCRCanomaliesEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointThreshCRCanomalies", "1.3.6.1.2.1.10.48.1.11.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointThreshLOSWSEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointThreshLOSWSEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointThreshLOSWS", "1.3.6.1.2.1.10.48.1.11.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointThreshUASEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointThreshUASEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointThreshUAS", "1.3.6.1.2.1.10.48.1.11.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Hdsl2ShdslEndpointAlarmConfProfileRowStatusEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                    {
                        private Hdsl2ShdslEndpointAlarmConfProfileRowStatusEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                        {
                            super(mib, parent, "hdsl2ShdslEndpointAlarmConfProfileRowStatus", "1.3.6.1.2.1.10.48.1.11.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class Hdsl2ShdslNotificationsEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
        {
            public final Hdsl2ShdslLoopAttenCrossingEnt hdsl2ShdslLoopAttenCrossing;

            public final Hdsl2ShdslSNRMarginCrossingEnt hdsl2ShdslSNRMarginCrossing;

            public final Hdsl2ShdslPerfESThreshEnt hdsl2ShdslPerfESThresh;

            public final Hdsl2ShdslPerfSESThreshEnt hdsl2ShdslPerfSESThresh;

            public final Hdsl2ShdslPerfCRCanomaliesThreshEnt hdsl2ShdslPerfCRCanomaliesThresh;

            public final Hdsl2ShdslPerfLOSWSThreshEnt hdsl2ShdslPerfLOSWSThresh;

            public final Hdsl2ShdslPerfUASThreshEnt hdsl2ShdslPerfUASThresh;

            public final Hdsl2ShdslSpanInvalidNumRepeatersEnt hdsl2ShdslSpanInvalidNumRepeaters;

            public final Hdsl2ShdslLoopbackFailureEnt hdsl2ShdslLoopbackFailure;

            public final Hdsl2ShdslpowerBackoffEnt hdsl2ShdslpowerBackoff;

            public final Hdsl2ShdsldeviceFaultEnt hdsl2ShdsldeviceFault;

            public final Hdsl2ShdsldcContinuityFaultEnt hdsl2ShdsldcContinuityFault;

            public final Hdsl2ShdslconfigInitFailureEnt hdsl2ShdslconfigInitFailure;

            public final Hdsl2ShdslprotocolInitFailureEnt hdsl2ShdslprotocolInitFailure;

            public final Hdsl2ShdslnoNeighborPresentEnt hdsl2ShdslnoNeighborPresent;

            public final Hdsl2ShdslLocalPowerLossEnt hdsl2ShdslLocalPowerLoss;

            private Hdsl2ShdslNotificationsEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
            {
                super(mib, parent, "hdsl2ShdslNotifications", "1.3.6.1.2.1.10.48.0", false, false, false, false);
                this.hdsl2ShdslLoopAttenCrossing = new Hdsl2ShdslLoopAttenCrossingEnt(mib, this);
                this.hdsl2ShdslSNRMarginCrossing = new Hdsl2ShdslSNRMarginCrossingEnt(mib, this);
                this.hdsl2ShdslPerfESThresh = new Hdsl2ShdslPerfESThreshEnt(mib, this);
                this.hdsl2ShdslPerfSESThresh = new Hdsl2ShdslPerfSESThreshEnt(mib, this);
                this.hdsl2ShdslPerfCRCanomaliesThresh = new Hdsl2ShdslPerfCRCanomaliesThreshEnt(mib, this);
                this.hdsl2ShdslPerfLOSWSThresh = new Hdsl2ShdslPerfLOSWSThreshEnt(mib, this);
                this.hdsl2ShdslPerfUASThresh = new Hdsl2ShdslPerfUASThreshEnt(mib, this);
                this.hdsl2ShdslSpanInvalidNumRepeaters = new Hdsl2ShdslSpanInvalidNumRepeatersEnt(mib, this);
                this.hdsl2ShdslLoopbackFailure = new Hdsl2ShdslLoopbackFailureEnt(mib, this);
                this.hdsl2ShdslpowerBackoff = new Hdsl2ShdslpowerBackoffEnt(mib, this);
                this.hdsl2ShdsldeviceFault = new Hdsl2ShdsldeviceFaultEnt(mib, this);
                this.hdsl2ShdsldcContinuityFault = new Hdsl2ShdsldcContinuityFaultEnt(mib, this);
                this.hdsl2ShdslconfigInitFailure = new Hdsl2ShdslconfigInitFailureEnt(mib, this);
                this.hdsl2ShdslprotocolInitFailure = new Hdsl2ShdslprotocolInitFailureEnt(mib, this);
                this.hdsl2ShdslnoNeighborPresent = new Hdsl2ShdslnoNeighborPresentEnt(mib, this);
                this.hdsl2ShdslLocalPowerLoss = new Hdsl2ShdslLocalPowerLossEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hdsl2ShdslLoopAttenCrossing,
                    this.hdsl2ShdslSNRMarginCrossing,
                    this.hdsl2ShdslPerfESThresh,
                    this.hdsl2ShdslPerfSESThresh,
                    this.hdsl2ShdslPerfCRCanomaliesThresh,
                    this.hdsl2ShdslPerfLOSWSThresh,
                    this.hdsl2ShdslPerfUASThresh,
                    this.hdsl2ShdslSpanInvalidNumRepeaters,
                    this.hdsl2ShdslLoopbackFailure,
                    this.hdsl2ShdslpowerBackoff,
                    this.hdsl2ShdsldeviceFault,
                    this.hdsl2ShdsldcContinuityFault,
                    this.hdsl2ShdslconfigInitFailure,
                    this.hdsl2ShdslprotocolInitFailure,
                    this.hdsl2ShdslnoNeighborPresent,
                    this.hdsl2ShdslLocalPowerLoss
                };
            }
            public static final class Hdsl2ShdslLoopAttenCrossingEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                private Hdsl2ShdslLoopAttenCrossingEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslLoopAttenCrossing", "1.3.6.1.2.1.10.48.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Hdsl2ShdslSNRMarginCrossingEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                private Hdsl2ShdslSNRMarginCrossingEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslSNRMarginCrossing", "1.3.6.1.2.1.10.48.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Hdsl2ShdslPerfESThreshEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                private Hdsl2ShdslPerfESThreshEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslPerfESThresh", "1.3.6.1.2.1.10.48.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Hdsl2ShdslPerfSESThreshEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                private Hdsl2ShdslPerfSESThreshEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslPerfSESThresh", "1.3.6.1.2.1.10.48.0.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Hdsl2ShdslPerfCRCanomaliesThreshEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                private Hdsl2ShdslPerfCRCanomaliesThreshEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslPerfCRCanomaliesThresh", "1.3.6.1.2.1.10.48.0.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Hdsl2ShdslPerfLOSWSThreshEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                private Hdsl2ShdslPerfLOSWSThreshEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslPerfLOSWSThresh", "1.3.6.1.2.1.10.48.0.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Hdsl2ShdslPerfUASThreshEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                private Hdsl2ShdslPerfUASThreshEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslPerfUASThresh", "1.3.6.1.2.1.10.48.0.7", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Hdsl2ShdslSpanInvalidNumRepeatersEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                private Hdsl2ShdslSpanInvalidNumRepeatersEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslSpanInvalidNumRepeaters", "1.3.6.1.2.1.10.48.0.8", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Hdsl2ShdslLoopbackFailureEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                private Hdsl2ShdslLoopbackFailureEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslLoopbackFailure", "1.3.6.1.2.1.10.48.0.9", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Hdsl2ShdslpowerBackoffEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                private Hdsl2ShdslpowerBackoffEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslpowerBackoff", "1.3.6.1.2.1.10.48.0.10", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Hdsl2ShdsldeviceFaultEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                private Hdsl2ShdsldeviceFaultEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdsldeviceFault", "1.3.6.1.2.1.10.48.0.11", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Hdsl2ShdsldcContinuityFaultEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                private Hdsl2ShdsldcContinuityFaultEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdsldcContinuityFault", "1.3.6.1.2.1.10.48.0.12", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Hdsl2ShdslconfigInitFailureEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                private Hdsl2ShdslconfigInitFailureEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslconfigInitFailure", "1.3.6.1.2.1.10.48.0.13", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Hdsl2ShdslprotocolInitFailureEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                private Hdsl2ShdslprotocolInitFailureEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslprotocolInitFailure", "1.3.6.1.2.1.10.48.0.14", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Hdsl2ShdslnoNeighborPresentEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                private Hdsl2ShdslnoNeighborPresentEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslnoNeighborPresent", "1.3.6.1.2.1.10.48.0.15", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Hdsl2ShdslLocalPowerLossEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                private Hdsl2ShdslLocalPowerLossEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslLocalPowerLoss", "1.3.6.1.2.1.10.48.0.16", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Hdsl2ShdslConformanceEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
        {
            public final Hdsl2ShdslGroupsEnt hdsl2ShdslGroups;

            public final Hdsl2ShdslCompliancesEnt hdsl2ShdslCompliances;

            private Hdsl2ShdslConformanceEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
            {
                super(mib, parent, "hdsl2ShdslConformance", "1.3.6.1.2.1.10.48.3", false, false, false, false);
                this.hdsl2ShdslGroups = new Hdsl2ShdslGroupsEnt(mib, this);
                this.hdsl2ShdslCompliances = new Hdsl2ShdslCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hdsl2ShdslGroups,
                    this.hdsl2ShdslCompliances
                };
            }
            public static final class Hdsl2ShdslGroupsEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                /** units of conformance*/
                public final Hdsl2ShdslSpanConfGroupEnt hdsl2ShdslSpanConfGroup;

                public final Hdsl2ShdslSpanStatusGroupEnt hdsl2ShdslSpanStatusGroup;

                public final Hdsl2ShdslInventoryShdslGroupEnt hdsl2ShdslInventoryShdslGroup;

                public final Hdsl2ShdslSpanShdslStatusGroupEnt hdsl2ShdslSpanShdslStatusGroup;

                public final Hdsl2ShdslInventoryGroupEnt hdsl2ShdslInventoryGroup;

                public final Hdsl2ShdslEndpointConfGroupEnt hdsl2ShdslEndpointConfGroup;

                public final Hdsl2ShdslEndpointCurrGroupEnt hdsl2ShdslEndpointCurrGroup;

                public final Hdsl2Shdsl15MinIntervalGroupEnt hdsl2Shdsl15MinIntervalGroup;

                public final Hdsl2Shdsl1DayIntervalGroupEnt hdsl2Shdsl1DayIntervalGroup;

                public final Hdsl2ShdslMaintenanceGroupEnt hdsl2ShdslMaintenanceGroup;

                public final Hdsl2ShdslEndpointAlarmConfGroupEnt hdsl2ShdslEndpointAlarmConfGroup;

                public final Hdsl2ShdslNotificationGroupEnt hdsl2ShdslNotificationGroup;

                public final Hdsl2ShdslSpanConfProfileGroupEnt hdsl2ShdslSpanConfProfileGroup;

                public final Hdsl2ShdslWirePairGroupEnt hdsl2ShdslWirePairGroup;

                public final Hdsl2ShdslPayloadRateGroupEnt hdsl2ShdslPayloadRateGroup;

                private Hdsl2ShdslGroupsEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslGroups", "1.3.6.1.2.1.10.48.3.1", false, false, false, false);
                    this.hdsl2ShdslSpanConfGroup = new Hdsl2ShdslSpanConfGroupEnt(mib, this);
                    this.hdsl2ShdslSpanStatusGroup = new Hdsl2ShdslSpanStatusGroupEnt(mib, this);
                    this.hdsl2ShdslInventoryShdslGroup = new Hdsl2ShdslInventoryShdslGroupEnt(mib, this);
                    this.hdsl2ShdslSpanShdslStatusGroup = new Hdsl2ShdslSpanShdslStatusGroupEnt(mib, this);
                    this.hdsl2ShdslInventoryGroup = new Hdsl2ShdslInventoryGroupEnt(mib, this);
                    this.hdsl2ShdslEndpointConfGroup = new Hdsl2ShdslEndpointConfGroupEnt(mib, this);
                    this.hdsl2ShdslEndpointCurrGroup = new Hdsl2ShdslEndpointCurrGroupEnt(mib, this);
                    this.hdsl2Shdsl15MinIntervalGroup = new Hdsl2Shdsl15MinIntervalGroupEnt(mib, this);
                    this.hdsl2Shdsl1DayIntervalGroup = new Hdsl2Shdsl1DayIntervalGroupEnt(mib, this);
                    this.hdsl2ShdslMaintenanceGroup = new Hdsl2ShdslMaintenanceGroupEnt(mib, this);
                    this.hdsl2ShdslEndpointAlarmConfGroup = new Hdsl2ShdslEndpointAlarmConfGroupEnt(mib, this);
                    this.hdsl2ShdslNotificationGroup = new Hdsl2ShdslNotificationGroupEnt(mib, this);
                    this.hdsl2ShdslSpanConfProfileGroup = new Hdsl2ShdslSpanConfProfileGroupEnt(mib, this);
                    this.hdsl2ShdslWirePairGroup = new Hdsl2ShdslWirePairGroupEnt(mib, this);
                    this.hdsl2ShdslPayloadRateGroup = new Hdsl2ShdslPayloadRateGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hdsl2ShdslSpanConfGroup,
                        this.hdsl2ShdslSpanStatusGroup,
                        this.hdsl2ShdslInventoryShdslGroup,
                        this.hdsl2ShdslSpanShdslStatusGroup,
                        this.hdsl2ShdslInventoryGroup,
                        this.hdsl2ShdslEndpointConfGroup,
                        this.hdsl2ShdslEndpointCurrGroup,
                        this.hdsl2Shdsl15MinIntervalGroup,
                        this.hdsl2Shdsl1DayIntervalGroup,
                        this.hdsl2ShdslMaintenanceGroup,
                        this.hdsl2ShdslEndpointAlarmConfGroup,
                        this.hdsl2ShdslNotificationGroup,
                        this.hdsl2ShdslSpanConfProfileGroup,
                        this.hdsl2ShdslWirePairGroup,
                        this.hdsl2ShdslPayloadRateGroup
                    };
                }
                public static final class Hdsl2ShdslSpanConfGroupEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    private Hdsl2ShdslSpanConfGroupEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslSpanConfGroup", "1.3.6.1.2.1.10.48.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Hdsl2ShdslSpanStatusGroupEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    private Hdsl2ShdslSpanStatusGroupEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslSpanStatusGroup", "1.3.6.1.2.1.10.48.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Hdsl2ShdslInventoryShdslGroupEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    private Hdsl2ShdslInventoryShdslGroupEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslInventoryShdslGroup", "1.3.6.1.2.1.10.48.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Hdsl2ShdslSpanShdslStatusGroupEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    private Hdsl2ShdslSpanShdslStatusGroupEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslSpanShdslStatusGroup", "1.3.6.1.2.1.10.48.3.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Hdsl2ShdslInventoryGroupEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    private Hdsl2ShdslInventoryGroupEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslInventoryGroup", "1.3.6.1.2.1.10.48.3.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Hdsl2ShdslEndpointConfGroupEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    private Hdsl2ShdslEndpointConfGroupEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslEndpointConfGroup", "1.3.6.1.2.1.10.48.3.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Hdsl2ShdslEndpointCurrGroupEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    private Hdsl2ShdslEndpointCurrGroupEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslEndpointCurrGroup", "1.3.6.1.2.1.10.48.3.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Hdsl2Shdsl15MinIntervalGroupEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    private Hdsl2Shdsl15MinIntervalGroupEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2Shdsl15MinIntervalGroup", "1.3.6.1.2.1.10.48.3.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Hdsl2Shdsl1DayIntervalGroupEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    private Hdsl2Shdsl1DayIntervalGroupEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2Shdsl1DayIntervalGroup", "1.3.6.1.2.1.10.48.3.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Hdsl2ShdslMaintenanceGroupEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    private Hdsl2ShdslMaintenanceGroupEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslMaintenanceGroup", "1.3.6.1.2.1.10.48.3.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Hdsl2ShdslEndpointAlarmConfGroupEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    private Hdsl2ShdslEndpointAlarmConfGroupEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslEndpointAlarmConfGroup", "1.3.6.1.2.1.10.48.3.1.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Hdsl2ShdslNotificationGroupEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    private Hdsl2ShdslNotificationGroupEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslNotificationGroup", "1.3.6.1.2.1.10.48.3.1.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Hdsl2ShdslSpanConfProfileGroupEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    private Hdsl2ShdslSpanConfProfileGroupEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslSpanConfProfileGroup", "1.3.6.1.2.1.10.48.3.1.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Hdsl2ShdslWirePairGroupEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    private Hdsl2ShdslWirePairGroupEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslWirePairGroup", "1.3.6.1.2.1.10.48.3.1.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Hdsl2ShdslPayloadRateGroupEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    private Hdsl2ShdslPayloadRateGroupEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslPayloadRateGroup", "1.3.6.1.2.1.10.48.3.1.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Hdsl2ShdslCompliancesEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
            {
                /** agent compliance statements*/
                public final Hdsl2ShdslLineMibComplianceEnt hdsl2ShdslLineMibCompliance;

                public final Hdsl2GshdslbisLineMibComplianceEnt hdsl2GshdslbisLineMibCompliance;

                private Hdsl2ShdslCompliancesEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                {
                    super(mib, parent, "hdsl2ShdslCompliances", "1.3.6.1.2.1.10.48.3.2", false, false, false, false);
                    this.hdsl2ShdslLineMibCompliance = new Hdsl2ShdslLineMibComplianceEnt(mib, this);
                    this.hdsl2GshdslbisLineMibCompliance = new Hdsl2GshdslbisLineMibComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hdsl2ShdslLineMibCompliance,
                        this.hdsl2GshdslbisLineMibCompliance
                    };
                }
                public static final class Hdsl2ShdslLineMibComplianceEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    private Hdsl2ShdslLineMibComplianceEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2ShdslLineMibCompliance", "1.3.6.1.2.1.10.48.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Hdsl2GshdslbisLineMibComplianceEnt extends MIBEntry<HDSL2SHDSLLINEMIBDef>
                {
                    private Hdsl2GshdslbisLineMibComplianceEnt(HDSL2SHDSLLINEMIBDef mib, MIBEntry<HDSL2SHDSLLINEMIBDef> parent)
                    {
                        super(mib, parent, "hdsl2GshdslbisLineMibCompliance", "1.3.6.1.2.1.10.48.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
