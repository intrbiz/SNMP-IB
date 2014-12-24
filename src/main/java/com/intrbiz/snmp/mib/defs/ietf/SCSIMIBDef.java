package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class SCSIMIBDef extends MIB
{
    public static final SCSIMIBDef SCSIMIB = new SCSIMIBDef();

    /** 30th March 2006*/
    public final ScsiMIBEnt scsiMIB;

    private SCSIMIBDef()
    {
        super("SCSI-MIB");
        this.scsiMIB = new ScsiMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.scsiMIB
        };
    }

    public static final class ScsiMIBEnt extends MIBEntry<SCSIMIBDef>
    {
        /** ****************** Structure of the MIB ***************************/
        public final ScsiNotificationsEnt scsiNotifications;

        public final ScsiAdminEnt scsiAdmin;

        public final ScsiObjectsEnt scsiObjects;

        public final ScsiConformanceEnt scsiConformance;

        private ScsiMIBEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
        {
            super(mib, parent, "scsiMIB", "1.3.6.1.2.1.139", false, false, false, false);
            this.scsiNotifications = new ScsiNotificationsEnt(mib, this);
            this.scsiAdmin = new ScsiAdminEnt(mib, this);
            this.scsiObjects = new ScsiObjectsEnt(mib, this);
            this.scsiConformance = new ScsiConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.scsiNotifications,
                this.scsiAdmin,
                this.scsiObjects,
                this.scsiConformance
            };
        }
        public static final class ScsiNotificationsEnt extends MIBEntry<SCSIMIBDef>
        {
            /** ********************** Notifications ******************************scsiNotifications OBJECT IDENTIFIER ::= { scsiMIB  2 }*/
            public final ScsiNotificationsPrefixEnt scsiNotificationsPrefix;

            private ScsiNotificationsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
            {
                super(mib, parent, "scsiNotifications", "1.3.6.1.2.1.139.0", false, false, false, false);
                this.scsiNotificationsPrefix = new ScsiNotificationsPrefixEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.scsiNotificationsPrefix
                };
            }
            public static final class ScsiNotificationsPrefixEnt extends MIBEntry<SCSIMIBDef>
            {
                public final ScsiTgtDeviceStatusChangedEnt scsiTgtDeviceStatusChanged;

                public final ScsiLuStatusChangedEnt scsiLuStatusChanged;

                private ScsiNotificationsPrefixEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                {
                    super(mib, parent, "scsiNotificationsPrefix", "1.3.6.1.2.1.139.0.0", false, false, false, false);
                    this.scsiTgtDeviceStatusChanged = new ScsiTgtDeviceStatusChangedEnt(mib, this);
                    this.scsiLuStatusChanged = new ScsiLuStatusChangedEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.scsiTgtDeviceStatusChanged,
                        this.scsiLuStatusChanged
                    };
                }
                public static final class ScsiTgtDeviceStatusChangedEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiTgtDeviceStatusChangedEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiTgtDeviceStatusChanged", "1.3.6.1.2.1.139.0.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiLuStatusChangedEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiLuStatusChangedEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiLuStatusChanged", "1.3.6.1.2.1.139.0.0.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class ScsiAdminEnt extends MIBEntry<SCSIMIBDef>
        {
            public final ScsiTransportTypesEnt scsiTransportTypes;

            private ScsiAdminEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
            {
                super(mib, parent, "scsiAdmin", "1.3.6.1.2.1.139.1", false, false, false, false);
                this.scsiTransportTypes = new ScsiTransportTypesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.scsiTransportTypes
                };
            }
            public static final class ScsiTransportTypesEnt extends MIBEntry<SCSIMIBDef>
            {
                /** ****************** Transport Types *******************************The following object identifiers allow determining the differenttransports (service delivery subsystems) in use under the SCSIlayer.*/
                public final ScsiTransportOtherEnt scsiTransportOther;

                public final ScsiTransportSPIEnt scsiTransportSPI;

                public final ScsiTransportFCPEnt scsiTransportFCP;

                public final ScsiTransportSRPEnt scsiTransportSRP;

                public final ScsiTransportISCSIEnt scsiTransportISCSI;

                public final ScsiTransportSBPEnt scsiTransportSBP;

                public final ScsiTransportSASEnt scsiTransportSAS;

                private ScsiTransportTypesEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                {
                    super(mib, parent, "scsiTransportTypes", "1.3.6.1.2.1.139.1.1", false, false, false, false);
                    this.scsiTransportOther = new ScsiTransportOtherEnt(mib, this);
                    this.scsiTransportSPI = new ScsiTransportSPIEnt(mib, this);
                    this.scsiTransportFCP = new ScsiTransportFCPEnt(mib, this);
                    this.scsiTransportSRP = new ScsiTransportSRPEnt(mib, this);
                    this.scsiTransportISCSI = new ScsiTransportISCSIEnt(mib, this);
                    this.scsiTransportSBP = new ScsiTransportSBPEnt(mib, this);
                    this.scsiTransportSAS = new ScsiTransportSASEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.scsiTransportOther,
                        this.scsiTransportSPI,
                        this.scsiTransportFCP,
                        this.scsiTransportSRP,
                        this.scsiTransportISCSI,
                        this.scsiTransportSBP,
                        this.scsiTransportSAS
                    };
                }
                public static final class ScsiTransportOtherEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiTransportOtherEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiTransportOther", "1.3.6.1.2.1.139.1.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiTransportSPIEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiTransportSPIEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiTransportSPI", "1.3.6.1.2.1.139.1.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiTransportFCPEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiTransportFCPEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiTransportFCP", "1.3.6.1.2.1.139.1.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiTransportSRPEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiTransportSRPEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiTransportSRP", "1.3.6.1.2.1.139.1.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiTransportISCSIEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiTransportISCSIEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiTransportISCSI", "1.3.6.1.2.1.139.1.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiTransportSBPEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiTransportSBPEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiTransportSBP", "1.3.6.1.2.1.139.1.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiTransportSASEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiTransportSASEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiTransportSAS", "1.3.6.1.2.1.139.1.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class ScsiObjectsEnt extends MIBEntry<SCSIMIBDef>
        {
            public final ScsiGeneralEnt scsiGeneral;

            public final ScsiInitiatorDeviceEnt scsiInitiatorDevice;

            public final ScsiTargetDeviceEnt scsiTargetDevice;

            public final ScsiLogicalUnitEnt scsiLogicalUnit;

            private ScsiObjectsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
            {
                super(mib, parent, "scsiObjects", "1.3.6.1.2.1.139.2", false, false, false, false);
                this.scsiGeneral = new ScsiGeneralEnt(mib, this);
                this.scsiInitiatorDevice = new ScsiInitiatorDeviceEnt(mib, this);
                this.scsiTargetDevice = new ScsiTargetDeviceEnt(mib, this);
                this.scsiLogicalUnit = new ScsiLogicalUnitEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.scsiGeneral,
                    this.scsiInitiatorDevice,
                    this.scsiTargetDevice,
                    this.scsiLogicalUnit
                };
            }
            public static final class ScsiGeneralEnt extends MIBEntry<SCSIMIBDef>
            {
                /** ****************** Instance Table ******************************/
                public final ScsiInstanceTableEnt scsiInstanceTable;

                /** ******************** Device Table *********************************/
                public final ScsiDeviceTableEnt scsiDeviceTable;

                /** ****************** Port Table *************************************/
                public final ScsiPortTableEnt scsiPortTable;

                /** ******************** Table of supported transports ****************/
                public final ScsiTransportTableEnt scsiTransportTable;

                private ScsiGeneralEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                {
                    super(mib, parent, "scsiGeneral", "1.3.6.1.2.1.139.2.1", false, false, false, false);
                    this.scsiInstanceTable = new ScsiInstanceTableEnt(mib, this);
                    this.scsiDeviceTable = new ScsiDeviceTableEnt(mib, this);
                    this.scsiPortTable = new ScsiPortTableEnt(mib, this);
                    this.scsiTransportTable = new ScsiTransportTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.scsiInstanceTable,
                        this.scsiDeviceTable,
                        this.scsiPortTable,
                        this.scsiTransportTable
                    };
                }
                public static final class ScsiInstanceTableEnt extends MIBEntry<SCSIMIBDef>
                {
                    public final ScsiInstanceEntryEnt scsiInstanceEntry;

                    private ScsiInstanceTableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiInstanceTable", "1.3.6.1.2.1.139.2.1.1", false, true, false, false);
                        this.scsiInstanceEntry = new ScsiInstanceEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.scsiInstanceEntry
                        };
                    }
                    public static final class ScsiInstanceEntryEnt extends MIBEntry<SCSIMIBDef>
                    {
                        public final ScsiInstIndexEnt scsiInstIndex;

                        public final ScsiInstAliasEnt scsiInstAlias;

                        public final ScsiInstSoftwareIndexEnt scsiInstSoftwareIndex;

                        public final ScsiInstVendorVersionEnt scsiInstVendorVersion;

                        public final ScsiInstScsiNotificationsEnableEnt scsiInstScsiNotificationsEnable;

                        public final ScsiInstStorageTypeEnt scsiInstStorageType;

                        private ScsiInstanceEntryEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                        {
                            super(mib, parent, "scsiInstanceEntry", "1.3.6.1.2.1.139.2.1.1.1", false, false, false, true);
                            this.scsiInstIndex = new ScsiInstIndexEnt(mib, this);
                            this.scsiInstAlias = new ScsiInstAliasEnt(mib, this);
                            this.scsiInstSoftwareIndex = new ScsiInstSoftwareIndexEnt(mib, this);
                            this.scsiInstVendorVersion = new ScsiInstVendorVersionEnt(mib, this);
                            this.scsiInstScsiNotificationsEnable = new ScsiInstScsiNotificationsEnableEnt(mib, this);
                            this.scsiInstStorageType = new ScsiInstStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.scsiInstIndex,
                                this.scsiInstAlias,
                                this.scsiInstSoftwareIndex,
                                this.scsiInstVendorVersion,
                                this.scsiInstScsiNotificationsEnable,
                                this.scsiInstStorageType
                            };
                        }
                        public static final class ScsiInstIndexEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiInstIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiInstIndex", "1.3.6.1.2.1.139.2.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiInstAliasEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiInstAliasEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiInstAlias", "1.3.6.1.2.1.139.2.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiInstSoftwareIndexEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiInstSoftwareIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiInstSoftwareIndex", "1.3.6.1.2.1.139.2.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiInstVendorVersionEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiInstVendorVersionEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiInstVendorVersion", "1.3.6.1.2.1.139.2.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiInstScsiNotificationsEnableEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiInstScsiNotificationsEnableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiInstScsiNotificationsEnable", "1.3.6.1.2.1.139.2.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiInstStorageTypeEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiInstStorageTypeEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiInstStorageType", "1.3.6.1.2.1.139.2.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ScsiDeviceTableEnt extends MIBEntry<SCSIMIBDef>
                {
                    public final ScsiDeviceEntryEnt scsiDeviceEntry;

                    private ScsiDeviceTableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiDeviceTable", "1.3.6.1.2.1.139.2.1.2", false, true, false, false);
                        this.scsiDeviceEntry = new ScsiDeviceEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.scsiDeviceEntry
                        };
                    }
                    public static final class ScsiDeviceEntryEnt extends MIBEntry<SCSIMIBDef>
                    {
                        public final ScsiDeviceIndexEnt scsiDeviceIndex;

                        public final ScsiDeviceAliasEnt scsiDeviceAlias;

                        public final ScsiDeviceRoleEnt scsiDeviceRole;

                        public final ScsiDevicePortNumberEnt scsiDevicePortNumber;

                        private ScsiDeviceEntryEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                        {
                            super(mib, parent, "scsiDeviceEntry", "1.3.6.1.2.1.139.2.1.2.1", false, false, false, true);
                            this.scsiDeviceIndex = new ScsiDeviceIndexEnt(mib, this);
                            this.scsiDeviceAlias = new ScsiDeviceAliasEnt(mib, this);
                            this.scsiDeviceRole = new ScsiDeviceRoleEnt(mib, this);
                            this.scsiDevicePortNumber = new ScsiDevicePortNumberEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.scsiDeviceIndex,
                                this.scsiDeviceAlias,
                                this.scsiDeviceRole,
                                this.scsiDevicePortNumber
                            };
                        }
                        public static final class ScsiDeviceIndexEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiDeviceIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiDeviceIndex", "1.3.6.1.2.1.139.2.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiDeviceAliasEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiDeviceAliasEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiDeviceAlias", "1.3.6.1.2.1.139.2.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiDeviceRoleEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiDeviceRoleEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiDeviceRole", "1.3.6.1.2.1.139.2.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiDevicePortNumberEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiDevicePortNumberEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiDevicePortNumber", "1.3.6.1.2.1.139.2.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ScsiPortTableEnt extends MIBEntry<SCSIMIBDef>
                {
                    public final ScsiPortEntryEnt scsiPortEntry;

                    private ScsiPortTableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiPortTable", "1.3.6.1.2.1.139.2.1.3", false, true, false, false);
                        this.scsiPortEntry = new ScsiPortEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.scsiPortEntry
                        };
                    }
                    public static final class ScsiPortEntryEnt extends MIBEntry<SCSIMIBDef>
                    {
                        public final ScsiPortIndexEnt scsiPortIndex;

                        public final ScsiPortRoleEnt scsiPortRole;

                        public final ScsiPortTransportPtrEnt scsiPortTransportPtr;

                        public final ScsiPortBusyStatusesEnt scsiPortBusyStatuses;

                        private ScsiPortEntryEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                        {
                            super(mib, parent, "scsiPortEntry", "1.3.6.1.2.1.139.2.1.3.1", false, false, false, true);
                            this.scsiPortIndex = new ScsiPortIndexEnt(mib, this);
                            this.scsiPortRole = new ScsiPortRoleEnt(mib, this);
                            this.scsiPortTransportPtr = new ScsiPortTransportPtrEnt(mib, this);
                            this.scsiPortBusyStatuses = new ScsiPortBusyStatusesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.scsiPortIndex,
                                this.scsiPortRole,
                                this.scsiPortTransportPtr,
                                this.scsiPortBusyStatuses
                            };
                        }
                        public static final class ScsiPortIndexEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiPortIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiPortIndex", "1.3.6.1.2.1.139.2.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiPortRoleEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiPortRoleEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiPortRole", "1.3.6.1.2.1.139.2.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiPortTransportPtrEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiPortTransportPtrEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiPortTransportPtr", "1.3.6.1.2.1.139.2.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiPortBusyStatusesEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiPortBusyStatusesEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiPortBusyStatuses", "1.3.6.1.2.1.139.2.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ScsiTransportTableEnt extends MIBEntry<SCSIMIBDef>
                {
                    public final ScsiTransportEntryEnt scsiTransportEntry;

                    private ScsiTransportTableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiTransportTable", "1.3.6.1.2.1.139.2.1.5", false, true, false, false);
                        this.scsiTransportEntry = new ScsiTransportEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.scsiTransportEntry
                        };
                    }
                    public static final class ScsiTransportEntryEnt extends MIBEntry<SCSIMIBDef>
                    {
                        public final ScsiTransportIndexEnt scsiTransportIndex;

                        public final ScsiTransportTypeEnt scsiTransportType;

                        public final ScsiTransportPointerEnt scsiTransportPointer;

                        public final ScsiTransportDevNameEnt scsiTransportDevName;

                        private ScsiTransportEntryEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                        {
                            super(mib, parent, "scsiTransportEntry", "1.3.6.1.2.1.139.2.1.5.1", false, false, false, true);
                            this.scsiTransportIndex = new ScsiTransportIndexEnt(mib, this);
                            this.scsiTransportType = new ScsiTransportTypeEnt(mib, this);
                            this.scsiTransportPointer = new ScsiTransportPointerEnt(mib, this);
                            this.scsiTransportDevName = new ScsiTransportDevNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.scsiTransportIndex,
                                this.scsiTransportType,
                                this.scsiTransportPointer,
                                this.scsiTransportDevName
                            };
                        }
                        public static final class ScsiTransportIndexEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiTransportIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiTransportIndex", "1.3.6.1.2.1.139.2.1.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiTransportTypeEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiTransportTypeEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiTransportType", "1.3.6.1.2.1.139.2.1.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiTransportPointerEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiTransportPointerEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiTransportPointer", "1.3.6.1.2.1.139.2.1.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiTransportDevNameEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiTransportDevNameEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiTransportDevName", "1.3.6.1.2.1.139.2.1.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class ScsiInitiatorDeviceEnt extends MIBEntry<SCSIMIBDef>
            {
                /** ******************** SCSI Initiator Device Table ****************/
                public final ScsiIntrDevTableEnt scsiIntrDevTable;

                /** The following section describes managed objects related toSCSI initiator ports.*/
                public final ScsiIntrPortTableEnt scsiIntrPortTable;

                /** ******************** Discovered SCSI Target Device group *********/
                public final ScsiRemoteTgtDevEnt scsiRemoteTgtDev;

                private ScsiInitiatorDeviceEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                {
                    super(mib, parent, "scsiInitiatorDevice", "1.3.6.1.2.1.139.2.2", false, false, false, false);
                    this.scsiIntrDevTable = new ScsiIntrDevTableEnt(mib, this);
                    this.scsiIntrPortTable = new ScsiIntrPortTableEnt(mib, this);
                    this.scsiRemoteTgtDev = new ScsiRemoteTgtDevEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.scsiIntrDevTable,
                        this.scsiIntrPortTable,
                        this.scsiRemoteTgtDev
                    };
                }
                public static final class ScsiIntrDevTableEnt extends MIBEntry<SCSIMIBDef>
                {
                    public final ScsiIntrDevEntryEnt scsiIntrDevEntry;

                    private ScsiIntrDevTableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiIntrDevTable", "1.3.6.1.2.1.139.2.2.1", false, true, false, false);
                        this.scsiIntrDevEntry = new ScsiIntrDevEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.scsiIntrDevEntry
                        };
                    }
                    public static final class ScsiIntrDevEntryEnt extends MIBEntry<SCSIMIBDef>
                    {
                        public final ScsiIntrDevTgtAccessModeEnt scsiIntrDevTgtAccessMode;

                        public final ScsiIntrDevOutResetsEnt scsiIntrDevOutResets;

                        private ScsiIntrDevEntryEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                        {
                            super(mib, parent, "scsiIntrDevEntry", "1.3.6.1.2.1.139.2.2.1.1", false, false, false, true);
                            this.scsiIntrDevTgtAccessMode = new ScsiIntrDevTgtAccessModeEnt(mib, this);
                            this.scsiIntrDevOutResets = new ScsiIntrDevOutResetsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.scsiIntrDevTgtAccessMode,
                                this.scsiIntrDevOutResets
                            };
                        }
                        public static final class ScsiIntrDevTgtAccessModeEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiIntrDevTgtAccessModeEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiIntrDevTgtAccessMode", "1.3.6.1.2.1.139.2.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiIntrDevOutResetsEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiIntrDevOutResetsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiIntrDevOutResets", "1.3.6.1.2.1.139.2.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ScsiIntrPortTableEnt extends MIBEntry<SCSIMIBDef>
                {
                    public final ScsiIntrPortEntryEnt scsiIntrPortEntry;

                    private ScsiIntrPortTableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiIntrPortTable", "1.3.6.1.2.1.139.2.2.2", false, true, false, false);
                        this.scsiIntrPortEntry = new ScsiIntrPortEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.scsiIntrPortEntry
                        };
                    }
                    public static final class ScsiIntrPortEntryEnt extends MIBEntry<SCSIMIBDef>
                    {
                        public final ScsiIntrPortNameEnt scsiIntrPortName;

                        public final ScsiIntrPortIdentifierEnt scsiIntrPortIdentifier;

                        public final ScsiIntrPortOutCommandsEnt scsiIntrPortOutCommands;

                        public final ScsiIntrPortWrittenMegaBytesEnt scsiIntrPortWrittenMegaBytes;

                        public final ScsiIntrPortReadMegaBytesEnt scsiIntrPortReadMegaBytes;

                        public final ScsiIntrPortHSOutCommandsEnt scsiIntrPortHSOutCommands;

                        private ScsiIntrPortEntryEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                        {
                            super(mib, parent, "scsiIntrPortEntry", "1.3.6.1.2.1.139.2.2.2.1", false, false, false, true);
                            this.scsiIntrPortName = new ScsiIntrPortNameEnt(mib, this);
                            this.scsiIntrPortIdentifier = new ScsiIntrPortIdentifierEnt(mib, this);
                            this.scsiIntrPortOutCommands = new ScsiIntrPortOutCommandsEnt(mib, this);
                            this.scsiIntrPortWrittenMegaBytes = new ScsiIntrPortWrittenMegaBytesEnt(mib, this);
                            this.scsiIntrPortReadMegaBytes = new ScsiIntrPortReadMegaBytesEnt(mib, this);
                            this.scsiIntrPortHSOutCommands = new ScsiIntrPortHSOutCommandsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.scsiIntrPortName,
                                this.scsiIntrPortIdentifier,
                                this.scsiIntrPortOutCommands,
                                this.scsiIntrPortWrittenMegaBytes,
                                this.scsiIntrPortReadMegaBytes,
                                this.scsiIntrPortHSOutCommands
                            };
                        }
                        public static final class ScsiIntrPortNameEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiIntrPortNameEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiIntrPortName", "1.3.6.1.2.1.139.2.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiIntrPortIdentifierEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiIntrPortIdentifierEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiIntrPortIdentifier", "1.3.6.1.2.1.139.2.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiIntrPortOutCommandsEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiIntrPortOutCommandsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiIntrPortOutCommands", "1.3.6.1.2.1.139.2.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiIntrPortWrittenMegaBytesEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiIntrPortWrittenMegaBytesEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiIntrPortWrittenMegaBytes", "1.3.6.1.2.1.139.2.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiIntrPortReadMegaBytesEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiIntrPortReadMegaBytesEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiIntrPortReadMegaBytes", "1.3.6.1.2.1.139.2.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiIntrPortHSOutCommandsEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiIntrPortHSOutCommandsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiIntrPortHSOutCommands", "1.3.6.1.2.1.139.2.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ScsiRemoteTgtDevEnt extends MIBEntry<SCSIMIBDef>
                {
                    /** SCSI target device discovered or authorized to attach each of theSCSI initiator ports of each SCSI initiator device of eachinstance.*/
                    public final ScsiDscTgtTableEnt scsiDscTgtTable;

                    /** ********************** LUNs discovered ****************************/
                    public final ScsiDscLunTableEnt scsiDscLunTable;

                    /** ******************** LU Identifiers discovered ********************/
                    public final ScsiDscLunIdTableEnt scsiDscLunIdTable;

                    /** ***** Table of SCSI Target Device Attached to local SCSI***** Initiator Ports*/
                    public final ScsiAttTgtPortTableEnt scsiAttTgtPortTable;

                    private ScsiRemoteTgtDevEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiRemoteTgtDev", "1.3.6.1.2.1.139.2.2.3", false, false, false, false);
                        this.scsiDscTgtTable = new ScsiDscTgtTableEnt(mib, this);
                        this.scsiDscLunTable = new ScsiDscLunTableEnt(mib, this);
                        this.scsiDscLunIdTable = new ScsiDscLunIdTableEnt(mib, this);
                        this.scsiAttTgtPortTable = new ScsiAttTgtPortTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.scsiDscTgtTable,
                            this.scsiDscLunTable,
                            this.scsiDscLunIdTable,
                            this.scsiAttTgtPortTable
                        };
                    }
                    public static final class ScsiDscTgtTableEnt extends MIBEntry<SCSIMIBDef>
                    {
                        public final ScsiDscTgtEntryEnt scsiDscTgtEntry;

                        private ScsiDscTgtTableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                        {
                            super(mib, parent, "scsiDscTgtTable", "1.3.6.1.2.1.139.2.2.3.1", false, true, false, false);
                            this.scsiDscTgtEntry = new ScsiDscTgtEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.scsiDscTgtEntry
                            };
                        }
                        public static final class ScsiDscTgtEntryEnt extends MIBEntry<SCSIMIBDef>
                        {
                            public final ScsiDscTgtIntrPortIndexEnt scsiDscTgtIntrPortIndex;

                            public final ScsiDscTgtIndexEnt scsiDscTgtIndex;

                            public final ScsiDscTgtDevOrPortEnt scsiDscTgtDevOrPort;

                            public final ScsiDscTgtNameEnt scsiDscTgtName;

                            public final ScsiDscTgtConfiguredEnt scsiDscTgtConfigured;

                            public final ScsiDscTgtDiscoveredEnt scsiDscTgtDiscovered;

                            public final ScsiDscTgtInCommandsEnt scsiDscTgtInCommands;

                            public final ScsiDscTgtWrittenMegaBytesEnt scsiDscTgtWrittenMegaBytes;

                            public final ScsiDscTgtReadMegaBytesEnt scsiDscTgtReadMegaBytes;

                            public final ScsiDscTgtHSInCommandsEnt scsiDscTgtHSInCommands;

                            public final ScsiDscTgtLastCreationEnt scsiDscTgtLastCreation;

                            public final ScsiDscTgtRowStatusEnt scsiDscTgtRowStatus;

                            private ScsiDscTgtEntryEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiDscTgtEntry", "1.3.6.1.2.1.139.2.2.3.1.1", false, false, false, true);
                                this.scsiDscTgtIntrPortIndex = new ScsiDscTgtIntrPortIndexEnt(mib, this);
                                this.scsiDscTgtIndex = new ScsiDscTgtIndexEnt(mib, this);
                                this.scsiDscTgtDevOrPort = new ScsiDscTgtDevOrPortEnt(mib, this);
                                this.scsiDscTgtName = new ScsiDscTgtNameEnt(mib, this);
                                this.scsiDscTgtConfigured = new ScsiDscTgtConfiguredEnt(mib, this);
                                this.scsiDscTgtDiscovered = new ScsiDscTgtDiscoveredEnt(mib, this);
                                this.scsiDscTgtInCommands = new ScsiDscTgtInCommandsEnt(mib, this);
                                this.scsiDscTgtWrittenMegaBytes = new ScsiDscTgtWrittenMegaBytesEnt(mib, this);
                                this.scsiDscTgtReadMegaBytes = new ScsiDscTgtReadMegaBytesEnt(mib, this);
                                this.scsiDscTgtHSInCommands = new ScsiDscTgtHSInCommandsEnt(mib, this);
                                this.scsiDscTgtLastCreation = new ScsiDscTgtLastCreationEnt(mib, this);
                                this.scsiDscTgtRowStatus = new ScsiDscTgtRowStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.scsiDscTgtIntrPortIndex,
                                    this.scsiDscTgtIndex,
                                    this.scsiDscTgtDevOrPort,
                                    this.scsiDscTgtName,
                                    this.scsiDscTgtConfigured,
                                    this.scsiDscTgtDiscovered,
                                    this.scsiDscTgtInCommands,
                                    this.scsiDscTgtWrittenMegaBytes,
                                    this.scsiDscTgtReadMegaBytes,
                                    this.scsiDscTgtHSInCommands,
                                    this.scsiDscTgtLastCreation,
                                    this.scsiDscTgtRowStatus
                                };
                            }
                            public static final class ScsiDscTgtIntrPortIndexEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscTgtIntrPortIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscTgtIntrPortIndex", "1.3.6.1.2.1.139.2.2.3.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiDscTgtIndexEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscTgtIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscTgtIndex", "1.3.6.1.2.1.139.2.2.3.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiDscTgtDevOrPortEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscTgtDevOrPortEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscTgtDevOrPort", "1.3.6.1.2.1.139.2.2.3.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiDscTgtNameEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscTgtNameEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscTgtName", "1.3.6.1.2.1.139.2.2.3.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiDscTgtConfiguredEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscTgtConfiguredEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscTgtConfigured", "1.3.6.1.2.1.139.2.2.3.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiDscTgtDiscoveredEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscTgtDiscoveredEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscTgtDiscovered", "1.3.6.1.2.1.139.2.2.3.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiDscTgtInCommandsEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscTgtInCommandsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscTgtInCommands", "1.3.6.1.2.1.139.2.2.3.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiDscTgtWrittenMegaBytesEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscTgtWrittenMegaBytesEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscTgtWrittenMegaBytes", "1.3.6.1.2.1.139.2.2.3.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiDscTgtReadMegaBytesEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscTgtReadMegaBytesEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscTgtReadMegaBytes", "1.3.6.1.2.1.139.2.2.3.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiDscTgtHSInCommandsEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscTgtHSInCommandsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscTgtHSInCommands", "1.3.6.1.2.1.139.2.2.3.1.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiDscTgtLastCreationEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscTgtLastCreationEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscTgtLastCreation", "1.3.6.1.2.1.139.2.2.3.1.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiDscTgtRowStatusEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscTgtRowStatusEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscTgtRowStatus", "1.3.6.1.2.1.139.2.2.3.1.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class ScsiDscLunTableEnt extends MIBEntry<SCSIMIBDef>
                    {
                        public final ScsiDscLunEntryEnt scsiDscLunEntry;

                        private ScsiDscLunTableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                        {
                            super(mib, parent, "scsiDscLunTable", "1.3.6.1.2.1.139.2.2.3.2", false, true, false, false);
                            this.scsiDscLunEntry = new ScsiDscLunEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.scsiDscLunEntry
                            };
                        }
                        public static final class ScsiDscLunEntryEnt extends MIBEntry<SCSIMIBDef>
                        {
                            public final ScsiDscLunIndexEnt scsiDscLunIndex;

                            public final ScsiDscLunLunEnt scsiDscLunLun;

                            private ScsiDscLunEntryEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiDscLunEntry", "1.3.6.1.2.1.139.2.2.3.2.1", false, false, false, true);
                                this.scsiDscLunIndex = new ScsiDscLunIndexEnt(mib, this);
                                this.scsiDscLunLun = new ScsiDscLunLunEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.scsiDscLunIndex,
                                    this.scsiDscLunLun
                                };
                            }
                            public static final class ScsiDscLunIndexEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscLunIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscLunIndex", "1.3.6.1.2.1.139.2.2.3.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiDscLunLunEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscLunLunEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscLunLun", "1.3.6.1.2.1.139.2.2.3.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class ScsiDscLunIdTableEnt extends MIBEntry<SCSIMIBDef>
                    {
                        public final ScsiDscLunIdEntryEnt scsiDscLunIdEntry;

                        private ScsiDscLunIdTableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                        {
                            super(mib, parent, "scsiDscLunIdTable", "1.3.6.1.2.1.139.2.2.3.3", false, true, false, false);
                            this.scsiDscLunIdEntry = new ScsiDscLunIdEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.scsiDscLunIdEntry
                            };
                        }
                        public static final class ScsiDscLunIdEntryEnt extends MIBEntry<SCSIMIBDef>
                        {
                            public final ScsiDscLunIdIndexEnt scsiDscLunIdIndex;

                            public final ScsiDscLunIdCodeSetEnt scsiDscLunIdCodeSet;

                            public final ScsiDscLunIdAssociationEnt scsiDscLunIdAssociation;

                            public final ScsiDscLunIdTypeEnt scsiDscLunIdType;

                            public final ScsiDscLunIdValueEnt scsiDscLunIdValue;

                            private ScsiDscLunIdEntryEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiDscLunIdEntry", "1.3.6.1.2.1.139.2.2.3.3.1", false, false, false, true);
                                this.scsiDscLunIdIndex = new ScsiDscLunIdIndexEnt(mib, this);
                                this.scsiDscLunIdCodeSet = new ScsiDscLunIdCodeSetEnt(mib, this);
                                this.scsiDscLunIdAssociation = new ScsiDscLunIdAssociationEnt(mib, this);
                                this.scsiDscLunIdType = new ScsiDscLunIdTypeEnt(mib, this);
                                this.scsiDscLunIdValue = new ScsiDscLunIdValueEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.scsiDscLunIdIndex,
                                    this.scsiDscLunIdCodeSet,
                                    this.scsiDscLunIdAssociation,
                                    this.scsiDscLunIdType,
                                    this.scsiDscLunIdValue
                                };
                            }
                            public static final class ScsiDscLunIdIndexEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscLunIdIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscLunIdIndex", "1.3.6.1.2.1.139.2.2.3.3.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiDscLunIdCodeSetEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscLunIdCodeSetEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscLunIdCodeSet", "1.3.6.1.2.1.139.2.2.3.3.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiDscLunIdAssociationEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscLunIdAssociationEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscLunIdAssociation", "1.3.6.1.2.1.139.2.2.3.3.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiDscLunIdTypeEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscLunIdTypeEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscLunIdType", "1.3.6.1.2.1.139.2.2.3.3.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiDscLunIdValueEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiDscLunIdValueEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiDscLunIdValue", "1.3.6.1.2.1.139.2.2.3.3.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class ScsiAttTgtPortTableEnt extends MIBEntry<SCSIMIBDef>
                    {
                        public final ScsiAttTgtPortEntryEnt scsiAttTgtPortEntry;

                        private ScsiAttTgtPortTableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                        {
                            super(mib, parent, "scsiAttTgtPortTable", "1.3.6.1.2.1.139.2.2.3.4", false, true, false, false);
                            this.scsiAttTgtPortEntry = new ScsiAttTgtPortEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.scsiAttTgtPortEntry
                            };
                        }
                        public static final class ScsiAttTgtPortEntryEnt extends MIBEntry<SCSIMIBDef>
                        {
                            public final ScsiAttTgtPortIndexEnt scsiAttTgtPortIndex;

                            public final ScsiAttTgtPortDscTgtIdxEnt scsiAttTgtPortDscTgtIdx;

                            public final ScsiAttTgtPortNameEnt scsiAttTgtPortName;

                            public final ScsiAttTgtPortIdentifierEnt scsiAttTgtPortIdentifier;

                            private ScsiAttTgtPortEntryEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiAttTgtPortEntry", "1.3.6.1.2.1.139.2.2.3.4.1", false, false, false, true);
                                this.scsiAttTgtPortIndex = new ScsiAttTgtPortIndexEnt(mib, this);
                                this.scsiAttTgtPortDscTgtIdx = new ScsiAttTgtPortDscTgtIdxEnt(mib, this);
                                this.scsiAttTgtPortName = new ScsiAttTgtPortNameEnt(mib, this);
                                this.scsiAttTgtPortIdentifier = new ScsiAttTgtPortIdentifierEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.scsiAttTgtPortIndex,
                                    this.scsiAttTgtPortDscTgtIdx,
                                    this.scsiAttTgtPortName,
                                    this.scsiAttTgtPortIdentifier
                                };
                            }
                            public static final class ScsiAttTgtPortIndexEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAttTgtPortIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAttTgtPortIndex", "1.3.6.1.2.1.139.2.2.3.4.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiAttTgtPortDscTgtIdxEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAttTgtPortDscTgtIdxEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAttTgtPortDscTgtIdx", "1.3.6.1.2.1.139.2.2.3.4.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiAttTgtPortNameEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAttTgtPortNameEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAttTgtPortName", "1.3.6.1.2.1.139.2.2.3.4.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiAttTgtPortIdentifierEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAttTgtPortIdentifierEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAttTgtPortIdentifier", "1.3.6.1.2.1.139.2.2.3.4.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

            public static final class ScsiTargetDeviceEnt extends MIBEntry<SCSIMIBDef>
            {
                /** ********************************************************************** Table of SCSI Target devices*/
                public final ScsiTgtDevTableEnt scsiTgtDevTable;

                /** ******************** SCSI Target Port Table **********************/
                public final ScsiTgtPortTableEnt scsiTgtPortTable;

                public final ScsiRemoteIntrDevEnt scsiRemoteIntrDev;

                private ScsiTargetDeviceEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                {
                    super(mib, parent, "scsiTargetDevice", "1.3.6.1.2.1.139.2.3", false, false, false, false);
                    this.scsiTgtDevTable = new ScsiTgtDevTableEnt(mib, this);
                    this.scsiTgtPortTable = new ScsiTgtPortTableEnt(mib, this);
                    this.scsiRemoteIntrDev = new ScsiRemoteIntrDevEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.scsiTgtDevTable,
                        this.scsiTgtPortTable,
                        this.scsiRemoteIntrDev
                    };
                }
                public static final class ScsiTgtDevTableEnt extends MIBEntry<SCSIMIBDef>
                {
                    public final ScsiTgtDevEntryEnt scsiTgtDevEntry;

                    private ScsiTgtDevTableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiTgtDevTable", "1.3.6.1.2.1.139.2.3.1", false, true, false, false);
                        this.scsiTgtDevEntry = new ScsiTgtDevEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.scsiTgtDevEntry
                        };
                    }
                    public static final class ScsiTgtDevEntryEnt extends MIBEntry<SCSIMIBDef>
                    {
                        public final ScsiTgtDevNumberOfLUsEnt scsiTgtDevNumberOfLUs;

                        public final ScsiTgtDeviceStatusEnt scsiTgtDeviceStatus;

                        public final ScsiTgtDevNonAccessibleLUsEnt scsiTgtDevNonAccessibleLUs;

                        public final ScsiTgtDevResetsEnt scsiTgtDevResets;

                        private ScsiTgtDevEntryEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                        {
                            super(mib, parent, "scsiTgtDevEntry", "1.3.6.1.2.1.139.2.3.1.1", false, false, false, true);
                            this.scsiTgtDevNumberOfLUs = new ScsiTgtDevNumberOfLUsEnt(mib, this);
                            this.scsiTgtDeviceStatus = new ScsiTgtDeviceStatusEnt(mib, this);
                            this.scsiTgtDevNonAccessibleLUs = new ScsiTgtDevNonAccessibleLUsEnt(mib, this);
                            this.scsiTgtDevResets = new ScsiTgtDevResetsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.scsiTgtDevNumberOfLUs,
                                this.scsiTgtDeviceStatus,
                                this.scsiTgtDevNonAccessibleLUs,
                                this.scsiTgtDevResets
                            };
                        }
                        public static final class ScsiTgtDevNumberOfLUsEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiTgtDevNumberOfLUsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiTgtDevNumberOfLUs", "1.3.6.1.2.1.139.2.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiTgtDeviceStatusEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiTgtDeviceStatusEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiTgtDeviceStatus", "1.3.6.1.2.1.139.2.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiTgtDevNonAccessibleLUsEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiTgtDevNonAccessibleLUsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiTgtDevNonAccessibleLUs", "1.3.6.1.2.1.139.2.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiTgtDevResetsEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiTgtDevResetsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiTgtDevResets", "1.3.6.1.2.1.139.2.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ScsiTgtPortTableEnt extends MIBEntry<SCSIMIBDef>
                {
                    public final ScsiTgtPortEntryEnt scsiTgtPortEntry;

                    private ScsiTgtPortTableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiTgtPortTable", "1.3.6.1.2.1.139.2.3.2", false, true, false, false);
                        this.scsiTgtPortEntry = new ScsiTgtPortEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.scsiTgtPortEntry
                        };
                    }
                    public static final class ScsiTgtPortEntryEnt extends MIBEntry<SCSIMIBDef>
                    {
                        public final ScsiTgtPortNameEnt scsiTgtPortName;

                        public final ScsiTgtPortIdentifierEnt scsiTgtPortIdentifier;

                        public final ScsiTgtPortInCommandsEnt scsiTgtPortInCommands;

                        public final ScsiTgtPortWrittenMegaBytesEnt scsiTgtPortWrittenMegaBytes;

                        public final ScsiTgtPortReadMegaBytesEnt scsiTgtPortReadMegaBytes;

                        public final ScsiTgtPortHSInCommandsEnt scsiTgtPortHSInCommands;

                        private ScsiTgtPortEntryEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                        {
                            super(mib, parent, "scsiTgtPortEntry", "1.3.6.1.2.1.139.2.3.2.1", false, false, false, true);
                            this.scsiTgtPortName = new ScsiTgtPortNameEnt(mib, this);
                            this.scsiTgtPortIdentifier = new ScsiTgtPortIdentifierEnt(mib, this);
                            this.scsiTgtPortInCommands = new ScsiTgtPortInCommandsEnt(mib, this);
                            this.scsiTgtPortWrittenMegaBytes = new ScsiTgtPortWrittenMegaBytesEnt(mib, this);
                            this.scsiTgtPortReadMegaBytes = new ScsiTgtPortReadMegaBytesEnt(mib, this);
                            this.scsiTgtPortHSInCommands = new ScsiTgtPortHSInCommandsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.scsiTgtPortName,
                                this.scsiTgtPortIdentifier,
                                this.scsiTgtPortInCommands,
                                this.scsiTgtPortWrittenMegaBytes,
                                this.scsiTgtPortReadMegaBytes,
                                this.scsiTgtPortHSInCommands
                            };
                        }
                        public static final class ScsiTgtPortNameEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiTgtPortNameEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiTgtPortName", "1.3.6.1.2.1.139.2.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiTgtPortIdentifierEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiTgtPortIdentifierEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiTgtPortIdentifier", "1.3.6.1.2.1.139.2.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiTgtPortInCommandsEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiTgtPortInCommandsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiTgtPortInCommands", "1.3.6.1.2.1.139.2.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiTgtPortWrittenMegaBytesEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiTgtPortWrittenMegaBytesEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiTgtPortWrittenMegaBytes", "1.3.6.1.2.1.139.2.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiTgtPortReadMegaBytesEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiTgtPortReadMegaBytesEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiTgtPortReadMegaBytes", "1.3.6.1.2.1.139.2.3.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiTgtPortHSInCommandsEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiTgtPortHSInCommandsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiTgtPortHSInCommands", "1.3.6.1.2.1.139.2.3.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ScsiRemoteIntrDevEnt extends MIBEntry<SCSIMIBDef>
                {
                    /** The scsiAuthorizedIntrTable contains the list of remote initiatorports that are authorized to be attached to specific SCSI targetports and on which an administrator would like to keep permanentinformation and long term statistics even when not currentlyattached.*/
                    public final ScsiAuthorizedIntrTableEnt scsiAuthorizedIntrTable;

                    /** Table of SCSI initiator devices or ports attached to localSCSI target ports*/
                    public final ScsiAttIntrPortTableEnt scsiAttIntrPortTable;

                    private ScsiRemoteIntrDevEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiRemoteIntrDev", "1.3.6.1.2.1.139.2.3.3", false, false, false, false);
                        this.scsiAuthorizedIntrTable = new ScsiAuthorizedIntrTableEnt(mib, this);
                        this.scsiAttIntrPortTable = new ScsiAttIntrPortTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.scsiAuthorizedIntrTable,
                            this.scsiAttIntrPortTable
                        };
                    }
                    public static final class ScsiAuthorizedIntrTableEnt extends MIBEntry<SCSIMIBDef>
                    {
                        public final ScsiAuthorizedIntrEntryEnt scsiAuthorizedIntrEntry;

                        private ScsiAuthorizedIntrTableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                        {
                            super(mib, parent, "scsiAuthorizedIntrTable", "1.3.6.1.2.1.139.2.3.3.1", false, true, false, false);
                            this.scsiAuthorizedIntrEntry = new ScsiAuthorizedIntrEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.scsiAuthorizedIntrEntry
                            };
                        }
                        public static final class ScsiAuthorizedIntrEntryEnt extends MIBEntry<SCSIMIBDef>
                        {
                            public final ScsiAuthIntrTgtPortIndexEnt scsiAuthIntrTgtPortIndex;

                            public final ScsiAuthIntrIndexEnt scsiAuthIntrIndex;

                            public final ScsiAuthIntrDevOrPortEnt scsiAuthIntrDevOrPort;

                            public final ScsiAuthIntrNameEnt scsiAuthIntrName;

                            public final ScsiAuthIntrLunMapIndexEnt scsiAuthIntrLunMapIndex;

                            public final ScsiAuthIntrAttachedTimesEnt scsiAuthIntrAttachedTimes;

                            public final ScsiAuthIntrOutCommandsEnt scsiAuthIntrOutCommands;

                            public final ScsiAuthIntrReadMegaBytesEnt scsiAuthIntrReadMegaBytes;

                            public final ScsiAuthIntrWrittenMegaBytesEnt scsiAuthIntrWrittenMegaBytes;

                            public final ScsiAuthIntrHSOutCommandsEnt scsiAuthIntrHSOutCommands;

                            public final ScsiAuthIntrLastCreationEnt scsiAuthIntrLastCreation;

                            public final ScsiAuthIntrRowStatusEnt scsiAuthIntrRowStatus;

                            private ScsiAuthorizedIntrEntryEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiAuthorizedIntrEntry", "1.3.6.1.2.1.139.2.3.3.1.1", false, false, false, true);
                                this.scsiAuthIntrTgtPortIndex = new ScsiAuthIntrTgtPortIndexEnt(mib, this);
                                this.scsiAuthIntrIndex = new ScsiAuthIntrIndexEnt(mib, this);
                                this.scsiAuthIntrDevOrPort = new ScsiAuthIntrDevOrPortEnt(mib, this);
                                this.scsiAuthIntrName = new ScsiAuthIntrNameEnt(mib, this);
                                this.scsiAuthIntrLunMapIndex = new ScsiAuthIntrLunMapIndexEnt(mib, this);
                                this.scsiAuthIntrAttachedTimes = new ScsiAuthIntrAttachedTimesEnt(mib, this);
                                this.scsiAuthIntrOutCommands = new ScsiAuthIntrOutCommandsEnt(mib, this);
                                this.scsiAuthIntrReadMegaBytes = new ScsiAuthIntrReadMegaBytesEnt(mib, this);
                                this.scsiAuthIntrWrittenMegaBytes = new ScsiAuthIntrWrittenMegaBytesEnt(mib, this);
                                this.scsiAuthIntrHSOutCommands = new ScsiAuthIntrHSOutCommandsEnt(mib, this);
                                this.scsiAuthIntrLastCreation = new ScsiAuthIntrLastCreationEnt(mib, this);
                                this.scsiAuthIntrRowStatus = new ScsiAuthIntrRowStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.scsiAuthIntrTgtPortIndex,
                                    this.scsiAuthIntrIndex,
                                    this.scsiAuthIntrDevOrPort,
                                    this.scsiAuthIntrName,
                                    this.scsiAuthIntrLunMapIndex,
                                    this.scsiAuthIntrAttachedTimes,
                                    this.scsiAuthIntrOutCommands,
                                    this.scsiAuthIntrReadMegaBytes,
                                    this.scsiAuthIntrWrittenMegaBytes,
                                    this.scsiAuthIntrHSOutCommands,
                                    this.scsiAuthIntrLastCreation,
                                    this.scsiAuthIntrRowStatus
                                };
                            }
                            public static final class ScsiAuthIntrTgtPortIndexEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAuthIntrTgtPortIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAuthIntrTgtPortIndex", "1.3.6.1.2.1.139.2.3.3.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiAuthIntrIndexEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAuthIntrIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAuthIntrIndex", "1.3.6.1.2.1.139.2.3.3.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiAuthIntrDevOrPortEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAuthIntrDevOrPortEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAuthIntrDevOrPort", "1.3.6.1.2.1.139.2.3.3.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiAuthIntrNameEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAuthIntrNameEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAuthIntrName", "1.3.6.1.2.1.139.2.3.3.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiAuthIntrLunMapIndexEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAuthIntrLunMapIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAuthIntrLunMapIndex", "1.3.6.1.2.1.139.2.3.3.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiAuthIntrAttachedTimesEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAuthIntrAttachedTimesEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAuthIntrAttachedTimes", "1.3.6.1.2.1.139.2.3.3.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiAuthIntrOutCommandsEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAuthIntrOutCommandsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAuthIntrOutCommands", "1.3.6.1.2.1.139.2.3.3.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiAuthIntrReadMegaBytesEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAuthIntrReadMegaBytesEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAuthIntrReadMegaBytes", "1.3.6.1.2.1.139.2.3.3.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiAuthIntrWrittenMegaBytesEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAuthIntrWrittenMegaBytesEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAuthIntrWrittenMegaBytes", "1.3.6.1.2.1.139.2.3.3.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiAuthIntrHSOutCommandsEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAuthIntrHSOutCommandsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAuthIntrHSOutCommands", "1.3.6.1.2.1.139.2.3.3.1.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiAuthIntrLastCreationEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAuthIntrLastCreationEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAuthIntrLastCreation", "1.3.6.1.2.1.139.2.3.3.1.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiAuthIntrRowStatusEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAuthIntrRowStatusEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAuthIntrRowStatus", "1.3.6.1.2.1.139.2.3.3.1.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class ScsiAttIntrPortTableEnt extends MIBEntry<SCSIMIBDef>
                    {
                        public final ScsiAttIntrPortEntryEnt scsiAttIntrPortEntry;

                        private ScsiAttIntrPortTableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                        {
                            super(mib, parent, "scsiAttIntrPortTable", "1.3.6.1.2.1.139.2.3.3.2", false, true, false, false);
                            this.scsiAttIntrPortEntry = new ScsiAttIntrPortEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.scsiAttIntrPortEntry
                            };
                        }
                        public static final class ScsiAttIntrPortEntryEnt extends MIBEntry<SCSIMIBDef>
                        {
                            public final ScsiAttIntrPortIndexEnt scsiAttIntrPortIndex;

                            public final ScsiAttIntrPortAuthIntrIdxEnt scsiAttIntrPortAuthIntrIdx;

                            public final ScsiAttIntrPortNameEnt scsiAttIntrPortName;

                            public final ScsiAttIntrPortIdentifierEnt scsiAttIntrPortIdentifier;

                            private ScsiAttIntrPortEntryEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiAttIntrPortEntry", "1.3.6.1.2.1.139.2.3.3.2.1", false, false, false, true);
                                this.scsiAttIntrPortIndex = new ScsiAttIntrPortIndexEnt(mib, this);
                                this.scsiAttIntrPortAuthIntrIdx = new ScsiAttIntrPortAuthIntrIdxEnt(mib, this);
                                this.scsiAttIntrPortName = new ScsiAttIntrPortNameEnt(mib, this);
                                this.scsiAttIntrPortIdentifier = new ScsiAttIntrPortIdentifierEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.scsiAttIntrPortIndex,
                                    this.scsiAttIntrPortAuthIntrIdx,
                                    this.scsiAttIntrPortName,
                                    this.scsiAttIntrPortIdentifier
                                };
                            }
                            public static final class ScsiAttIntrPortIndexEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAttIntrPortIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAttIntrPortIndex", "1.3.6.1.2.1.139.2.3.3.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiAttIntrPortAuthIntrIdxEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAttIntrPortAuthIntrIdxEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAttIntrPortAuthIntrIdx", "1.3.6.1.2.1.139.2.3.3.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiAttIntrPortNameEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAttIntrPortNameEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAttIntrPortName", "1.3.6.1.2.1.139.2.3.3.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class ScsiAttIntrPortIdentifierEnt extends MIBEntry<SCSIMIBDef>
                            {
                                private ScsiAttIntrPortIdentifierEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                                {
                                    super(mib, parent, "scsiAttIntrPortIdentifier", "1.3.6.1.2.1.139.2.3.3.2.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

            public static final class ScsiLogicalUnitEnt extends MIBEntry<SCSIMIBDef>
            {
                /** ****************** Managed Objects regarding logical units ********/
                public final ScsiLuTableEnt scsiLuTable;

                /** ****************** Logical Unit Identifier Table ******************/
                public final ScsiLuIdTableEnt scsiLuIdTable;

                /** ******************* The LUN Map Table *****************************/
                public final ScsiLunMapTableEnt scsiLunMapTable;

                private ScsiLogicalUnitEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                {
                    super(mib, parent, "scsiLogicalUnit", "1.3.6.1.2.1.139.2.4", false, false, false, false);
                    this.scsiLuTable = new ScsiLuTableEnt(mib, this);
                    this.scsiLuIdTable = new ScsiLuIdTableEnt(mib, this);
                    this.scsiLunMapTable = new ScsiLunMapTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.scsiLuTable,
                        this.scsiLuIdTable,
                        this.scsiLunMapTable
                    };
                }
                public static final class ScsiLuTableEnt extends MIBEntry<SCSIMIBDef>
                {
                    public final ScsiLuEntryEnt scsiLuEntry;

                    private ScsiLuTableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiLuTable", "1.3.6.1.2.1.139.2.4.1", false, true, false, false);
                        this.scsiLuEntry = new ScsiLuEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.scsiLuEntry
                        };
                    }
                    public static final class ScsiLuEntryEnt extends MIBEntry<SCSIMIBDef>
                    {
                        public final ScsiLuIndexEnt scsiLuIndex;

                        public final ScsiLuDefaultLunEnt scsiLuDefaultLun;

                        public final ScsiLuWwnNameEnt scsiLuWwnName;

                        public final ScsiLuVendorIdEnt scsiLuVendorId;

                        public final ScsiLuProductIdEnt scsiLuProductId;

                        public final ScsiLuRevisionIdEnt scsiLuRevisionId;

                        public final ScsiLuPeripheralTypeEnt scsiLuPeripheralType;

                        public final ScsiLuStatusEnt scsiLuStatus;

                        public final ScsiLuStateEnt scsiLuState;

                        public final ScsiLuInCommandsEnt scsiLuInCommands;

                        public final ScsiLuReadMegaBytesEnt scsiLuReadMegaBytes;

                        public final ScsiLuWrittenMegaBytesEnt scsiLuWrittenMegaBytes;

                        public final ScsiLuInResetsEnt scsiLuInResets;

                        public final ScsiLuOutTaskSetFullStatusEnt scsiLuOutTaskSetFullStatus;

                        public final ScsiLuHSInCommandsEnt scsiLuHSInCommands;

                        public final ScsiLuLastCreationEnt scsiLuLastCreation;

                        private ScsiLuEntryEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                        {
                            super(mib, parent, "scsiLuEntry", "1.3.6.1.2.1.139.2.4.1.1", false, false, false, true);
                            this.scsiLuIndex = new ScsiLuIndexEnt(mib, this);
                            this.scsiLuDefaultLun = new ScsiLuDefaultLunEnt(mib, this);
                            this.scsiLuWwnName = new ScsiLuWwnNameEnt(mib, this);
                            this.scsiLuVendorId = new ScsiLuVendorIdEnt(mib, this);
                            this.scsiLuProductId = new ScsiLuProductIdEnt(mib, this);
                            this.scsiLuRevisionId = new ScsiLuRevisionIdEnt(mib, this);
                            this.scsiLuPeripheralType = new ScsiLuPeripheralTypeEnt(mib, this);
                            this.scsiLuStatus = new ScsiLuStatusEnt(mib, this);
                            this.scsiLuState = new ScsiLuStateEnt(mib, this);
                            this.scsiLuInCommands = new ScsiLuInCommandsEnt(mib, this);
                            this.scsiLuReadMegaBytes = new ScsiLuReadMegaBytesEnt(mib, this);
                            this.scsiLuWrittenMegaBytes = new ScsiLuWrittenMegaBytesEnt(mib, this);
                            this.scsiLuInResets = new ScsiLuInResetsEnt(mib, this);
                            this.scsiLuOutTaskSetFullStatus = new ScsiLuOutTaskSetFullStatusEnt(mib, this);
                            this.scsiLuHSInCommands = new ScsiLuHSInCommandsEnt(mib, this);
                            this.scsiLuLastCreation = new ScsiLuLastCreationEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.scsiLuIndex,
                                this.scsiLuDefaultLun,
                                this.scsiLuWwnName,
                                this.scsiLuVendorId,
                                this.scsiLuProductId,
                                this.scsiLuRevisionId,
                                this.scsiLuPeripheralType,
                                this.scsiLuStatus,
                                this.scsiLuState,
                                this.scsiLuInCommands,
                                this.scsiLuReadMegaBytes,
                                this.scsiLuWrittenMegaBytes,
                                this.scsiLuInResets,
                                this.scsiLuOutTaskSetFullStatus,
                                this.scsiLuHSInCommands,
                                this.scsiLuLastCreation
                            };
                        }
                        public static final class ScsiLuIndexEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuIndex", "1.3.6.1.2.1.139.2.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuDefaultLunEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuDefaultLunEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuDefaultLun", "1.3.6.1.2.1.139.2.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuWwnNameEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuWwnNameEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuWwnName", "1.3.6.1.2.1.139.2.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuVendorIdEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuVendorIdEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuVendorId", "1.3.6.1.2.1.139.2.4.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuProductIdEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuProductIdEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuProductId", "1.3.6.1.2.1.139.2.4.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuRevisionIdEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuRevisionIdEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuRevisionId", "1.3.6.1.2.1.139.2.4.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuPeripheralTypeEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuPeripheralTypeEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuPeripheralType", "1.3.6.1.2.1.139.2.4.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuStatusEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuStatusEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuStatus", "1.3.6.1.2.1.139.2.4.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuStateEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuStateEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuState", "1.3.6.1.2.1.139.2.4.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuInCommandsEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuInCommandsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuInCommands", "1.3.6.1.2.1.139.2.4.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuReadMegaBytesEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuReadMegaBytesEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuReadMegaBytes", "1.3.6.1.2.1.139.2.4.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuWrittenMegaBytesEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuWrittenMegaBytesEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuWrittenMegaBytes", "1.3.6.1.2.1.139.2.4.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuInResetsEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuInResetsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuInResets", "1.3.6.1.2.1.139.2.4.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuOutTaskSetFullStatusEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuOutTaskSetFullStatusEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuOutTaskSetFullStatus", "1.3.6.1.2.1.139.2.4.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuHSInCommandsEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuHSInCommandsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuHSInCommands", "1.3.6.1.2.1.139.2.4.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuLastCreationEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuLastCreationEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuLastCreation", "1.3.6.1.2.1.139.2.4.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ScsiLuIdTableEnt extends MIBEntry<SCSIMIBDef>
                {
                    public final ScsiLuIdEntryEnt scsiLuIdEntry;

                    private ScsiLuIdTableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiLuIdTable", "1.3.6.1.2.1.139.2.4.2", false, true, false, false);
                        this.scsiLuIdEntry = new ScsiLuIdEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.scsiLuIdEntry
                        };
                    }
                    public static final class ScsiLuIdEntryEnt extends MIBEntry<SCSIMIBDef>
                    {
                        public final ScsiLuIdIndexEnt scsiLuIdIndex;

                        public final ScsiLuIdCodeSetEnt scsiLuIdCodeSet;

                        public final ScsiLuIdAssociationEnt scsiLuIdAssociation;

                        public final ScsiLuIdTypeEnt scsiLuIdType;

                        public final ScsiLuIdValueEnt scsiLuIdValue;

                        private ScsiLuIdEntryEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                        {
                            super(mib, parent, "scsiLuIdEntry", "1.3.6.1.2.1.139.2.4.2.1", false, false, false, true);
                            this.scsiLuIdIndex = new ScsiLuIdIndexEnt(mib, this);
                            this.scsiLuIdCodeSet = new ScsiLuIdCodeSetEnt(mib, this);
                            this.scsiLuIdAssociation = new ScsiLuIdAssociationEnt(mib, this);
                            this.scsiLuIdType = new ScsiLuIdTypeEnt(mib, this);
                            this.scsiLuIdValue = new ScsiLuIdValueEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.scsiLuIdIndex,
                                this.scsiLuIdCodeSet,
                                this.scsiLuIdAssociation,
                                this.scsiLuIdType,
                                this.scsiLuIdValue
                            };
                        }
                        public static final class ScsiLuIdIndexEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuIdIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuIdIndex", "1.3.6.1.2.1.139.2.4.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuIdCodeSetEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuIdCodeSetEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuIdCodeSet", "1.3.6.1.2.1.139.2.4.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuIdAssociationEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuIdAssociationEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuIdAssociation", "1.3.6.1.2.1.139.2.4.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuIdTypeEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuIdTypeEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuIdType", "1.3.6.1.2.1.139.2.4.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLuIdValueEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLuIdValueEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLuIdValue", "1.3.6.1.2.1.139.2.4.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ScsiLunMapTableEnt extends MIBEntry<SCSIMIBDef>
                {
                    public final ScsiLunMapEntryEnt scsiLunMapEntry;

                    private ScsiLunMapTableEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiLunMapTable", "1.3.6.1.2.1.139.2.4.3", false, true, false, false);
                        this.scsiLunMapEntry = new ScsiLunMapEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.scsiLunMapEntry
                        };
                    }
                    public static final class ScsiLunMapEntryEnt extends MIBEntry<SCSIMIBDef>
                    {
                        public final ScsiLunMapIndexEnt scsiLunMapIndex;

                        public final ScsiLunMapLunEnt scsiLunMapLun;

                        public final ScsiLunMapLuIndexEnt scsiLunMapLuIndex;

                        public final ScsiLunMapRowStatusEnt scsiLunMapRowStatus;

                        private ScsiLunMapEntryEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                        {
                            super(mib, parent, "scsiLunMapEntry", "1.3.6.1.2.1.139.2.4.3.1", false, false, false, true);
                            this.scsiLunMapIndex = new ScsiLunMapIndexEnt(mib, this);
                            this.scsiLunMapLun = new ScsiLunMapLunEnt(mib, this);
                            this.scsiLunMapLuIndex = new ScsiLunMapLuIndexEnt(mib, this);
                            this.scsiLunMapRowStatus = new ScsiLunMapRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.scsiLunMapIndex,
                                this.scsiLunMapLun,
                                this.scsiLunMapLuIndex,
                                this.scsiLunMapRowStatus
                            };
                        }
                        public static final class ScsiLunMapIndexEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLunMapIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLunMapIndex", "1.3.6.1.2.1.139.2.4.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLunMapLunEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLunMapLunEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLunMapLun", "1.3.6.1.2.1.139.2.4.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLunMapLuIndexEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLunMapLuIndexEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLunMapLuIndex", "1.3.6.1.2.1.139.2.4.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class ScsiLunMapRowStatusEnt extends MIBEntry<SCSIMIBDef>
                        {
                            private ScsiLunMapRowStatusEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                            {
                                super(mib, parent, "scsiLunMapRowStatus", "1.3.6.1.2.1.139.2.4.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class ScsiConformanceEnt extends MIBEntry<SCSIMIBDef>
        {
            /** ******************************************************************The next part defines the conformance groups in usefor SCSI MIB module.*/
            public final ScsiCompliancesEnt scsiCompliances;

            public final ScsiGroupsEnt scsiGroups;

            private ScsiConformanceEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
            {
                super(mib, parent, "scsiConformance", "1.3.6.1.2.1.139.3", false, false, false, false);
                this.scsiCompliances = new ScsiCompliancesEnt(mib, this);
                this.scsiGroups = new ScsiGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.scsiCompliances,
                    this.scsiGroups
                };
            }
            public static final class ScsiCompliancesEnt extends MIBEntry<SCSIMIBDef>
            {
                public final ScsiComplianceEnt scsiCompliance;

                private ScsiCompliancesEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                {
                    super(mib, parent, "scsiCompliances", "1.3.6.1.2.1.139.3.1", false, false, false, false);
                    this.scsiCompliance = new ScsiComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.scsiCompliance
                    };
                }
                public static final class ScsiComplianceEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiComplianceEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiCompliance", "1.3.6.1.2.1.139.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class ScsiGroupsEnt extends MIBEntry<SCSIMIBDef>
            {
                public final ScsiDeviceGroupEnt scsiDeviceGroup;

                public final ScsiInitiatorDeviceGroupEnt scsiInitiatorDeviceGroup;

                public final ScsiDiscoveryGroupEnt scsiDiscoveryGroup;

                public final ScsiTargetDeviceGroupEnt scsiTargetDeviceGroup;

                public final ScsiLunMapGroupEnt scsiLunMapGroup;

                public final ScsiTargetDevStatsGroupEnt scsiTargetDevStatsGroup;

                public final ScsiTargetDevHSStatsGroupEnt scsiTargetDevHSStatsGroup;

                public final ScsiLunMapStatsGroupEnt scsiLunMapStatsGroup;

                public final ScsiLunMapHSStatsGroupEnt scsiLunMapHSStatsGroup;

                public final ScsiInitiatorDevStatsGroupEnt scsiInitiatorDevStatsGroup;

                public final ScsiInitiatorDevHSStatsGroupEnt scsiInitiatorDevHSStatsGroup;

                public final ScsiDiscoveryStatsGroupEnt scsiDiscoveryStatsGroup;

                public final ScsiDiscoveryHSStatsGroupEnt scsiDiscoveryHSStatsGroup;

                public final ScsiDeviceStatGroupEnt scsiDeviceStatGroup;

                public final ScsiTgtDevLuNotificationsGroupEnt scsiTgtDevLuNotificationsGroup;

                private ScsiGroupsEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                {
                    super(mib, parent, "scsiGroups", "1.3.6.1.2.1.139.3.2", false, false, false, false);
                    this.scsiDeviceGroup = new ScsiDeviceGroupEnt(mib, this);
                    this.scsiInitiatorDeviceGroup = new ScsiInitiatorDeviceGroupEnt(mib, this);
                    this.scsiDiscoveryGroup = new ScsiDiscoveryGroupEnt(mib, this);
                    this.scsiTargetDeviceGroup = new ScsiTargetDeviceGroupEnt(mib, this);
                    this.scsiLunMapGroup = new ScsiLunMapGroupEnt(mib, this);
                    this.scsiTargetDevStatsGroup = new ScsiTargetDevStatsGroupEnt(mib, this);
                    this.scsiTargetDevHSStatsGroup = new ScsiTargetDevHSStatsGroupEnt(mib, this);
                    this.scsiLunMapStatsGroup = new ScsiLunMapStatsGroupEnt(mib, this);
                    this.scsiLunMapHSStatsGroup = new ScsiLunMapHSStatsGroupEnt(mib, this);
                    this.scsiInitiatorDevStatsGroup = new ScsiInitiatorDevStatsGroupEnt(mib, this);
                    this.scsiInitiatorDevHSStatsGroup = new ScsiInitiatorDevHSStatsGroupEnt(mib, this);
                    this.scsiDiscoveryStatsGroup = new ScsiDiscoveryStatsGroupEnt(mib, this);
                    this.scsiDiscoveryHSStatsGroup = new ScsiDiscoveryHSStatsGroupEnt(mib, this);
                    this.scsiDeviceStatGroup = new ScsiDeviceStatGroupEnt(mib, this);
                    this.scsiTgtDevLuNotificationsGroup = new ScsiTgtDevLuNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.scsiDeviceGroup,
                        this.scsiInitiatorDeviceGroup,
                        this.scsiDiscoveryGroup,
                        this.scsiTargetDeviceGroup,
                        this.scsiLunMapGroup,
                        this.scsiTargetDevStatsGroup,
                        this.scsiTargetDevHSStatsGroup,
                        this.scsiLunMapStatsGroup,
                        this.scsiLunMapHSStatsGroup,
                        this.scsiInitiatorDevStatsGroup,
                        this.scsiInitiatorDevHSStatsGroup,
                        this.scsiDiscoveryStatsGroup,
                        this.scsiDiscoveryHSStatsGroup,
                        this.scsiDeviceStatGroup,
                        this.scsiTgtDevLuNotificationsGroup
                    };
                }
                public static final class ScsiDeviceGroupEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiDeviceGroupEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiDeviceGroup", "1.3.6.1.2.1.139.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiInitiatorDeviceGroupEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiInitiatorDeviceGroupEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiInitiatorDeviceGroup", "1.3.6.1.2.1.139.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiDiscoveryGroupEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiDiscoveryGroupEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiDiscoveryGroup", "1.3.6.1.2.1.139.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiTargetDeviceGroupEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiTargetDeviceGroupEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiTargetDeviceGroup", "1.3.6.1.2.1.139.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiLunMapGroupEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiLunMapGroupEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiLunMapGroup", "1.3.6.1.2.1.139.3.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiTargetDevStatsGroupEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiTargetDevStatsGroupEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiTargetDevStatsGroup", "1.3.6.1.2.1.139.3.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiTargetDevHSStatsGroupEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiTargetDevHSStatsGroupEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiTargetDevHSStatsGroup", "1.3.6.1.2.1.139.3.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiLunMapStatsGroupEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiLunMapStatsGroupEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiLunMapStatsGroup", "1.3.6.1.2.1.139.3.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiLunMapHSStatsGroupEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiLunMapHSStatsGroupEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiLunMapHSStatsGroup", "1.3.6.1.2.1.139.3.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiInitiatorDevStatsGroupEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiInitiatorDevStatsGroupEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiInitiatorDevStatsGroup", "1.3.6.1.2.1.139.3.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiInitiatorDevHSStatsGroupEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiInitiatorDevHSStatsGroupEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiInitiatorDevHSStatsGroup", "1.3.6.1.2.1.139.3.2.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiDiscoveryStatsGroupEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiDiscoveryStatsGroupEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiDiscoveryStatsGroup", "1.3.6.1.2.1.139.3.2.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiDiscoveryHSStatsGroupEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiDiscoveryHSStatsGroupEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiDiscoveryHSStatsGroup", "1.3.6.1.2.1.139.3.2.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiDeviceStatGroupEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiDeviceStatGroupEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiDeviceStatGroup", "1.3.6.1.2.1.139.3.2.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ScsiTgtDevLuNotificationsGroupEnt extends MIBEntry<SCSIMIBDef>
                {
                    private ScsiTgtDevLuNotificationsGroupEnt(SCSIMIBDef mib, MIBEntry<SCSIMIBDef> parent)
                    {
                        super(mib, parent, "scsiTgtDevLuNotificationsGroup", "1.3.6.1.2.1.139.3.2.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
