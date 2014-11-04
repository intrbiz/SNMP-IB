package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**RFC 2578
RFC 2579
RFC 4001
RFC 2580
RFC 3411
RFC 2863
RFC 4502*/
public final class DOCSCABLEDEVICEMIBDef extends MIB
{
    public static final DOCSCABLEDEVICEMIBDef DOCSCABLEDEVICEMIB = new DOCSCABLEDEVICEMIBDef();

    static { MIBs.getInstance().registerMIB(DOCSCABLEDEVICEMIBDef.DOCSCABLEDEVICEMIB); }

    /** RFC 3289

December 20, 2006*/
    public final DocsDevEnt docsDev;

    private DOCSCABLEDEVICEMIBDef()
    {
        super("DOCS-CABLE-DEVICE-MIB");
        this.docsDev = new DocsDevEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.docsDev
        };
    }

    public static final class DocsDevEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
    {
        public final DocsDevMIBObjectsEnt docsDevMIBObjects;

        /** Placeholder for notifications/traps.
erroneous, DO NOT USE docsDevNotification*/
        public final DocsDevNotificationEnt docsDevNotification;

        /** erroneous, DO NOT USE docsDevNotification*/
        public final DocsDevNotificationsEnt docsDevNotifications;

        /** RFC 2669 Conformance definitions*/
        public final DocsDevConformanceEnt docsDevConformance;

        private DocsDevEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
        {
            super(mib, parent, "docsDev", "1.3.6.1.2.1.69", false, false, false, false);
            this.docsDevMIBObjects = new DocsDevMIBObjectsEnt(mib, this);
            this.docsDevNotification = new DocsDevNotificationEnt(mib, this);
            this.docsDevNotifications = new DocsDevNotificationsEnt(mib, this);
            this.docsDevConformance = new DocsDevConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.docsDevMIBObjects,
                this.docsDevNotification,
                this.docsDevNotifications,
                this.docsDevConformance
            };
        }
        public static final class DocsDevMIBObjectsEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
        {
            public final DocsDevBaseEnt docsDevBase;

            /** The following table provides one level of security for accessto the device by network management stations.Note that access is also constrained by thecommunity strings and any vendor-specific security.*/
            public final DocsDevNmAccessTableEnt docsDevNmAccessTable;

            /** The following group describes control objects used for downloadingfirmware to a cable device.  Procedures for software download aredescribed in Section 3.2.1 of the RFC containing this MIB module.*/
            public final DocsDevSoftwareEnt docsDevSoftware;

            /** The following group describes server access and parameters usedfor initial provisioning and bootstrapping.*/
            public final DocsDevServerEnt docsDevServer;

            /** Event Reporting*/
            public final DocsDevEventEnt docsDevEvent;

            /** Link Level Control Filtering*/
            public final DocsDevFilterEnt docsDevFilter;

            /** CPE IP Management and anti-spoofing group.  Only implemented onCable Modems.*/
            public final DocsDevCpeEnt docsDevCpe;

            private DocsDevMIBObjectsEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
            {
                super(mib, parent, "docsDevMIBObjects", "1.3.6.1.2.1.69.1", false, false, false, false);
                this.docsDevBase = new DocsDevBaseEnt(mib, this);
                this.docsDevNmAccessTable = new DocsDevNmAccessTableEnt(mib, this);
                this.docsDevSoftware = new DocsDevSoftwareEnt(mib, this);
                this.docsDevServer = new DocsDevServerEnt(mib, this);
                this.docsDevEvent = new DocsDevEventEnt(mib, this);
                this.docsDevFilter = new DocsDevFilterEnt(mib, this);
                this.docsDevCpe = new DocsDevCpeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.docsDevBase,
                    this.docsDevNmAccessTable,
                    this.docsDevSoftware,
                    this.docsDevServer,
                    this.docsDevEvent,
                    this.docsDevFilter,
                    this.docsDevCpe
                };
            }
            public static final class DocsDevBaseEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
            {
                /** For the following object, there is no concept in theRFI specification corresponding to a backup CMTS.  Theenumeration is provided here in case someone is ableto define such a role or device.*/
                public final DocsDevRoleEnt docsDevRole;

                public final DocsDevDateTimeEnt docsDevDateTime;

                public final DocsDevResetNowEnt docsDevResetNow;

                public final DocsDevSerialNumberEnt docsDevSerialNumber;

                public final DocsDevSTPControlEnt docsDevSTPControl;

                public final DocsDevIgmpModeControlEnt docsDevIgmpModeControl;

                public final DocsDevMaxCpeEnt docsDevMaxCpe;

                private DocsDevBaseEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                {
                    super(mib, parent, "docsDevBase", "1.3.6.1.2.1.69.1.1", false, false, false, false);
                    this.docsDevRole = new DocsDevRoleEnt(mib, this);
                    this.docsDevDateTime = new DocsDevDateTimeEnt(mib, this);
                    this.docsDevResetNow = new DocsDevResetNowEnt(mib, this);
                    this.docsDevSerialNumber = new DocsDevSerialNumberEnt(mib, this);
                    this.docsDevSTPControl = new DocsDevSTPControlEnt(mib, this);
                    this.docsDevIgmpModeControl = new DocsDevIgmpModeControlEnt(mib, this);
                    this.docsDevMaxCpe = new DocsDevMaxCpeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsDevRole,
                        this.docsDevDateTime,
                        this.docsDevResetNow,
                        this.docsDevSerialNumber,
                        this.docsDevSTPControl,
                        this.docsDevIgmpModeControl,
                        this.docsDevMaxCpe
                    };
                }
                public static final class DocsDevRoleEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevRoleEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevRole", "1.3.6.1.2.1.69.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevDateTimeEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevDateTimeEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevDateTime", "1.3.6.1.2.1.69.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevResetNowEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevResetNowEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevResetNow", "1.3.6.1.2.1.69.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevSerialNumberEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevSerialNumberEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevSerialNumber", "1.3.6.1.2.1.69.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevSTPControlEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevSTPControlEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevSTPControl", "1.3.6.1.2.1.69.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevIgmpModeControlEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevIgmpModeControlEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevIgmpModeControl", "1.3.6.1.2.1.69.1.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevMaxCpeEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevMaxCpeEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevMaxCpe", "1.3.6.1.2.1.69.1.1.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DocsDevNmAccessTableEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
            {
                public final DocsDevNmAccessEntryEnt docsDevNmAccessEntry;

                private DocsDevNmAccessTableEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                {
                    super(mib, parent, "docsDevNmAccessTable", "1.3.6.1.2.1.69.1.2", false, true, false, false);
                    this.docsDevNmAccessEntry = new DocsDevNmAccessEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsDevNmAccessEntry
                    };
                }
                public static final class DocsDevNmAccessEntryEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    public final DocsDevNmAccessIndexEnt docsDevNmAccessIndex;

                    public final DocsDevNmAccessIpEnt docsDevNmAccessIp;

                    public final DocsDevNmAccessIpMaskEnt docsDevNmAccessIpMask;

                    public final DocsDevNmAccessCommunityEnt docsDevNmAccessCommunity;

                    public final DocsDevNmAccessControlEnt docsDevNmAccessControl;

                    /** The syntax of the following object was copied from RFC 1493,dot1dStaticAllowedToGoTo.*/
                    public final DocsDevNmAccessInterfacesEnt docsDevNmAccessInterfaces;

                    public final DocsDevNmAccessStatusEnt docsDevNmAccessStatus;

                    public final DocsDevNmAccessTrapVersionEnt docsDevNmAccessTrapVersion;

                    private DocsDevNmAccessEntryEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevNmAccessEntry", "1.3.6.1.2.1.69.1.2.1", false, false, false, true);
                        this.docsDevNmAccessIndex = new DocsDevNmAccessIndexEnt(mib, this);
                        this.docsDevNmAccessIp = new DocsDevNmAccessIpEnt(mib, this);
                        this.docsDevNmAccessIpMask = new DocsDevNmAccessIpMaskEnt(mib, this);
                        this.docsDevNmAccessCommunity = new DocsDevNmAccessCommunityEnt(mib, this);
                        this.docsDevNmAccessControl = new DocsDevNmAccessControlEnt(mib, this);
                        this.docsDevNmAccessInterfaces = new DocsDevNmAccessInterfacesEnt(mib, this);
                        this.docsDevNmAccessStatus = new DocsDevNmAccessStatusEnt(mib, this);
                        this.docsDevNmAccessTrapVersion = new DocsDevNmAccessTrapVersionEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsDevNmAccessIndex,
                            this.docsDevNmAccessIp,
                            this.docsDevNmAccessIpMask,
                            this.docsDevNmAccessCommunity,
                            this.docsDevNmAccessControl,
                            this.docsDevNmAccessInterfaces,
                            this.docsDevNmAccessStatus,
                            this.docsDevNmAccessTrapVersion
                        };
                    }
                    public static final class DocsDevNmAccessIndexEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                    {
                        private DocsDevNmAccessIndexEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                        {
                            super(mib, parent, "docsDevNmAccessIndex", "1.3.6.1.2.1.69.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsDevNmAccessIpEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                    {
                        private DocsDevNmAccessIpEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                        {
                            super(mib, parent, "docsDevNmAccessIp", "1.3.6.1.2.1.69.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsDevNmAccessIpMaskEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                    {
                        private DocsDevNmAccessIpMaskEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                        {
                            super(mib, parent, "docsDevNmAccessIpMask", "1.3.6.1.2.1.69.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsDevNmAccessCommunityEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                    {
                        private DocsDevNmAccessCommunityEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                        {
                            super(mib, parent, "docsDevNmAccessCommunity", "1.3.6.1.2.1.69.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsDevNmAccessControlEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                    {
                        private DocsDevNmAccessControlEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                        {
                            super(mib, parent, "docsDevNmAccessControl", "1.3.6.1.2.1.69.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsDevNmAccessInterfacesEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                    {
                        private DocsDevNmAccessInterfacesEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                        {
                            super(mib, parent, "docsDevNmAccessInterfaces", "1.3.6.1.2.1.69.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsDevNmAccessStatusEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                    {
                        private DocsDevNmAccessStatusEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                        {
                            super(mib, parent, "docsDevNmAccessStatus", "1.3.6.1.2.1.69.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsDevNmAccessTrapVersionEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                    {
                        private DocsDevNmAccessTrapVersionEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                        {
                            super(mib, parent, "docsDevNmAccessTrapVersion", "1.3.6.1.2.1.69.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class DocsDevSoftwareEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
            {
                public final DocsDevSwServerEnt docsDevSwServer;

                public final DocsDevSwFilenameEnt docsDevSwFilename;

                public final DocsDevSwAdminStatusEnt docsDevSwAdminStatus;

                public final DocsDevSwOperStatusEnt docsDevSwOperStatus;

                public final DocsDevSwCurrentVersEnt docsDevSwCurrentVers;

                public final DocsDevSwServerAddressTypeEnt docsDevSwServerAddressType;

                public final DocsDevSwServerAddressEnt docsDevSwServerAddress;

                public final DocsDevSwServerTransportProtocolEnt docsDevSwServerTransportProtocol;

                private DocsDevSoftwareEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                {
                    super(mib, parent, "docsDevSoftware", "1.3.6.1.2.1.69.1.3", false, false, false, false);
                    this.docsDevSwServer = new DocsDevSwServerEnt(mib, this);
                    this.docsDevSwFilename = new DocsDevSwFilenameEnt(mib, this);
                    this.docsDevSwAdminStatus = new DocsDevSwAdminStatusEnt(mib, this);
                    this.docsDevSwOperStatus = new DocsDevSwOperStatusEnt(mib, this);
                    this.docsDevSwCurrentVers = new DocsDevSwCurrentVersEnt(mib, this);
                    this.docsDevSwServerAddressType = new DocsDevSwServerAddressTypeEnt(mib, this);
                    this.docsDevSwServerAddress = new DocsDevSwServerAddressEnt(mib, this);
                    this.docsDevSwServerTransportProtocol = new DocsDevSwServerTransportProtocolEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsDevSwServer,
                        this.docsDevSwFilename,
                        this.docsDevSwAdminStatus,
                        this.docsDevSwOperStatus,
                        this.docsDevSwCurrentVers,
                        this.docsDevSwServerAddressType,
                        this.docsDevSwServerAddress,
                        this.docsDevSwServerTransportProtocol
                    };
                }
                public static final class DocsDevSwServerEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevSwServerEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevSwServer", "1.3.6.1.2.1.69.1.3.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevSwFilenameEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevSwFilenameEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevSwFilename", "1.3.6.1.2.1.69.1.3.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevSwAdminStatusEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevSwAdminStatusEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevSwAdminStatus", "1.3.6.1.2.1.69.1.3.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevSwOperStatusEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevSwOperStatusEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevSwOperStatus", "1.3.6.1.2.1.69.1.3.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevSwCurrentVersEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevSwCurrentVersEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevSwCurrentVers", "1.3.6.1.2.1.69.1.3.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevSwServerAddressTypeEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevSwServerAddressTypeEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevSwServerAddressType", "1.3.6.1.2.1.69.1.3.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevSwServerAddressEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevSwServerAddressEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevSwServerAddress", "1.3.6.1.2.1.69.1.3.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevSwServerTransportProtocolEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevSwServerTransportProtocolEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevSwServerTransportProtocol", "1.3.6.1.2.1.69.1.3.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DocsDevServerEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
            {
                public final DocsDevServerBootStateEnt docsDevServerBootState;

                public final DocsDevServerDhcpEnt docsDevServerDhcp;

                public final DocsDevServerTimeEnt docsDevServerTime;

                public final DocsDevServerTftpEnt docsDevServerTftp;

                public final DocsDevServerConfigFileEnt docsDevServerConfigFile;

                public final DocsDevServerDhcpAddressTypeEnt docsDevServerDhcpAddressType;

                public final DocsDevServerDhcpAddressEnt docsDevServerDhcpAddress;

                public final DocsDevServerTimeAddressTypeEnt docsDevServerTimeAddressType;

                public final DocsDevServerTimeAddressEnt docsDevServerTimeAddress;

                public final DocsDevServerConfigTftpAddressTypeEnt docsDevServerConfigTftpAddressType;

                public final DocsDevServerConfigTftpAddressEnt docsDevServerConfigTftpAddress;

                private DocsDevServerEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                {
                    super(mib, parent, "docsDevServer", "1.3.6.1.2.1.69.1.4", false, false, false, false);
                    this.docsDevServerBootState = new DocsDevServerBootStateEnt(mib, this);
                    this.docsDevServerDhcp = new DocsDevServerDhcpEnt(mib, this);
                    this.docsDevServerTime = new DocsDevServerTimeEnt(mib, this);
                    this.docsDevServerTftp = new DocsDevServerTftpEnt(mib, this);
                    this.docsDevServerConfigFile = new DocsDevServerConfigFileEnt(mib, this);
                    this.docsDevServerDhcpAddressType = new DocsDevServerDhcpAddressTypeEnt(mib, this);
                    this.docsDevServerDhcpAddress = new DocsDevServerDhcpAddressEnt(mib, this);
                    this.docsDevServerTimeAddressType = new DocsDevServerTimeAddressTypeEnt(mib, this);
                    this.docsDevServerTimeAddress = new DocsDevServerTimeAddressEnt(mib, this);
                    this.docsDevServerConfigTftpAddressType = new DocsDevServerConfigTftpAddressTypeEnt(mib, this);
                    this.docsDevServerConfigTftpAddress = new DocsDevServerConfigTftpAddressEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsDevServerBootState,
                        this.docsDevServerDhcp,
                        this.docsDevServerTime,
                        this.docsDevServerTftp,
                        this.docsDevServerConfigFile,
                        this.docsDevServerDhcpAddressType,
                        this.docsDevServerDhcpAddress,
                        this.docsDevServerTimeAddressType,
                        this.docsDevServerTimeAddress,
                        this.docsDevServerConfigTftpAddressType,
                        this.docsDevServerConfigTftpAddress
                    };
                }
                public static final class DocsDevServerBootStateEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevServerBootStateEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevServerBootState", "1.3.6.1.2.1.69.1.4.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevServerDhcpEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevServerDhcpEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevServerDhcp", "1.3.6.1.2.1.69.1.4.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevServerTimeEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevServerTimeEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevServerTime", "1.3.6.1.2.1.69.1.4.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevServerTftpEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevServerTftpEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevServerTftp", "1.3.6.1.2.1.69.1.4.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevServerConfigFileEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevServerConfigFileEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevServerConfigFile", "1.3.6.1.2.1.69.1.4.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevServerDhcpAddressTypeEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevServerDhcpAddressTypeEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevServerDhcpAddressType", "1.3.6.1.2.1.69.1.4.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevServerDhcpAddressEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevServerDhcpAddressEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevServerDhcpAddress", "1.3.6.1.2.1.69.1.4.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevServerTimeAddressTypeEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevServerTimeAddressTypeEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevServerTimeAddressType", "1.3.6.1.2.1.69.1.4.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevServerTimeAddressEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevServerTimeAddressEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevServerTimeAddress", "1.3.6.1.2.1.69.1.4.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevServerConfigTftpAddressTypeEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevServerConfigTftpAddressTypeEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevServerConfigTftpAddressType", "1.3.6.1.2.1.69.1.4.10", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevServerConfigTftpAddressEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevServerConfigTftpAddressEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevServerConfigTftpAddress", "1.3.6.1.2.1.69.1.4.11", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DocsDevEventEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
            {
                public final DocsDevEvControlEnt docsDevEvControl;

                public final DocsDevEvSyslogEnt docsDevEvSyslog;

                public final DocsDevEvThrottleAdminStatusEnt docsDevEvThrottleAdminStatus;

                public final DocsDevEvThrottleInhibitedEnt docsDevEvThrottleInhibited;

                public final DocsDevEvThrottleThresholdEnt docsDevEvThrottleThreshold;

                public final DocsDevEvThrottleIntervalEnt docsDevEvThrottleInterval;

                /** The following table controls the reporting of the various classesof events.*/
                public final DocsDevEvControlTableEnt docsDevEvControlTable;

                public final DocsDevEventTableEnt docsDevEventTable;

                public final DocsDevEvSyslogAddressTypeEnt docsDevEvSyslogAddressType;

                public final DocsDevEvSyslogAddressEnt docsDevEvSyslogAddress;

                public final DocsDevEvThrottleThresholdExceededEnt docsDevEvThrottleThresholdExceeded;

                private DocsDevEventEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                {
                    super(mib, parent, "docsDevEvent", "1.3.6.1.2.1.69.1.5", false, false, false, false);
                    this.docsDevEvControl = new DocsDevEvControlEnt(mib, this);
                    this.docsDevEvSyslog = new DocsDevEvSyslogEnt(mib, this);
                    this.docsDevEvThrottleAdminStatus = new DocsDevEvThrottleAdminStatusEnt(mib, this);
                    this.docsDevEvThrottleInhibited = new DocsDevEvThrottleInhibitedEnt(mib, this);
                    this.docsDevEvThrottleThreshold = new DocsDevEvThrottleThresholdEnt(mib, this);
                    this.docsDevEvThrottleInterval = new DocsDevEvThrottleIntervalEnt(mib, this);
                    this.docsDevEvControlTable = new DocsDevEvControlTableEnt(mib, this);
                    this.docsDevEventTable = new DocsDevEventTableEnt(mib, this);
                    this.docsDevEvSyslogAddressType = new DocsDevEvSyslogAddressTypeEnt(mib, this);
                    this.docsDevEvSyslogAddress = new DocsDevEvSyslogAddressEnt(mib, this);
                    this.docsDevEvThrottleThresholdExceeded = new DocsDevEvThrottleThresholdExceededEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsDevEvControl,
                        this.docsDevEvSyslog,
                        this.docsDevEvThrottleAdminStatus,
                        this.docsDevEvThrottleInhibited,
                        this.docsDevEvThrottleThreshold,
                        this.docsDevEvThrottleInterval,
                        this.docsDevEvControlTable,
                        this.docsDevEventTable,
                        this.docsDevEvSyslogAddressType,
                        this.docsDevEvSyslogAddress,
                        this.docsDevEvThrottleThresholdExceeded
                    };
                }
                public static final class DocsDevEvControlEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevEvControlEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevEvControl", "1.3.6.1.2.1.69.1.5.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevEvSyslogEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevEvSyslogEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevEvSyslog", "1.3.6.1.2.1.69.1.5.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevEvThrottleAdminStatusEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevEvThrottleAdminStatusEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevEvThrottleAdminStatus", "1.3.6.1.2.1.69.1.5.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevEvThrottleInhibitedEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevEvThrottleInhibitedEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevEvThrottleInhibited", "1.3.6.1.2.1.69.1.5.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevEvThrottleThresholdEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevEvThrottleThresholdEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevEvThrottleThreshold", "1.3.6.1.2.1.69.1.5.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevEvThrottleIntervalEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevEvThrottleIntervalEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevEvThrottleInterval", "1.3.6.1.2.1.69.1.5.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevEvControlTableEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    public final DocsDevEvControlEntryEnt docsDevEvControlEntry;

                    private DocsDevEvControlTableEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevEvControlTable", "1.3.6.1.2.1.69.1.5.7", false, true, false, false);
                        this.docsDevEvControlEntry = new DocsDevEvControlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsDevEvControlEntry
                        };
                    }
                    public static final class DocsDevEvControlEntryEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                    {
                        public final DocsDevEvPriorityEnt docsDevEvPriority;

                        public final DocsDevEvReportingEnt docsDevEvReporting;

                        private DocsDevEvControlEntryEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                        {
                            super(mib, parent, "docsDevEvControlEntry", "1.3.6.1.2.1.69.1.5.7.1", false, false, false, true);
                            this.docsDevEvPriority = new DocsDevEvPriorityEnt(mib, this);
                            this.docsDevEvReporting = new DocsDevEvReportingEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsDevEvPriority,
                                this.docsDevEvReporting
                            };
                        }
                        public static final class DocsDevEvPriorityEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevEvPriorityEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevEvPriority", "1.3.6.1.2.1.69.1.5.7.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevEvReportingEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevEvReportingEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevEvReporting", "1.3.6.1.2.1.69.1.5.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsDevEventTableEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    public final DocsDevEventEntryEnt docsDevEventEntry;

                    private DocsDevEventTableEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevEventTable", "1.3.6.1.2.1.69.1.5.8", false, true, false, false);
                        this.docsDevEventEntry = new DocsDevEventEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsDevEventEntry
                        };
                    }
                    public static final class DocsDevEventEntryEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                    {
                        public final DocsDevEvIndexEnt docsDevEvIndex;

                        public final DocsDevEvFirstTimeEnt docsDevEvFirstTime;

                        public final DocsDevEvLastTimeEnt docsDevEvLastTime;

                        /** This object was renamed from docsDevEvCount to meet namingrequirements for Counter32*/
                        public final DocsDevEvCountsEnt docsDevEvCounts;

                        public final DocsDevEvLevelEnt docsDevEvLevel;

                        /** It is strongly recommended that implementors follow the CableLabsenumerations for docsDevEvId, per the DOCSIS OSSIv1.1 specand follow-on specifications.*/
                        public final DocsDevEvIdEnt docsDevEvId;

                        public final DocsDevEvTextEnt docsDevEvText;

                        private DocsDevEventEntryEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                        {
                            super(mib, parent, "docsDevEventEntry", "1.3.6.1.2.1.69.1.5.8.1", false, false, false, true);
                            this.docsDevEvIndex = new DocsDevEvIndexEnt(mib, this);
                            this.docsDevEvFirstTime = new DocsDevEvFirstTimeEnt(mib, this);
                            this.docsDevEvLastTime = new DocsDevEvLastTimeEnt(mib, this);
                            this.docsDevEvCounts = new DocsDevEvCountsEnt(mib, this);
                            this.docsDevEvLevel = new DocsDevEvLevelEnt(mib, this);
                            this.docsDevEvId = new DocsDevEvIdEnt(mib, this);
                            this.docsDevEvText = new DocsDevEvTextEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsDevEvIndex,
                                this.docsDevEvFirstTime,
                                this.docsDevEvLastTime,
                                this.docsDevEvCounts,
                                this.docsDevEvLevel,
                                this.docsDevEvId,
                                this.docsDevEvText
                            };
                        }
                        public static final class DocsDevEvIndexEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevEvIndexEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevEvIndex", "1.3.6.1.2.1.69.1.5.8.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevEvFirstTimeEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevEvFirstTimeEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevEvFirstTime", "1.3.6.1.2.1.69.1.5.8.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevEvLastTimeEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevEvLastTimeEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevEvLastTime", "1.3.6.1.2.1.69.1.5.8.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevEvCountsEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevEvCountsEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevEvCounts", "1.3.6.1.2.1.69.1.5.8.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevEvLevelEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevEvLevelEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevEvLevel", "1.3.6.1.2.1.69.1.5.8.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevEvIdEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevEvIdEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevEvId", "1.3.6.1.2.1.69.1.5.8.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevEvTextEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevEvTextEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevEvText", "1.3.6.1.2.1.69.1.5.8.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsDevEvSyslogAddressTypeEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevEvSyslogAddressTypeEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevEvSyslogAddressType", "1.3.6.1.2.1.69.1.5.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevEvSyslogAddressEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevEvSyslogAddressEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevEvSyslogAddress", "1.3.6.1.2.1.69.1.5.10", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevEvThrottleThresholdExceededEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevEvThrottleThresholdExceededEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevEvThrottleThresholdExceeded", "1.3.6.1.2.1.69.1.5.11", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DocsDevFilterEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
            {
                public final DocsDevFilterLLCUnmatchedActionEnt docsDevFilterLLCUnmatchedAction;

                public final DocsDevFilterLLCTableEnt docsDevFilterLLCTable;

                /** IPv4 Filtering*/
                public final DocsDevFilterIpDefaultEnt docsDevFilterIpDefault;

                public final DocsDevFilterIpTableEnt docsDevFilterIpTable;

                /** Policy Mapping Table*/
                public final DocsDevFilterPolicyTableEnt docsDevFilterPolicyTable;

                /** TOS Policy action table*/
                public final DocsDevFilterTosTableEnt docsDevFilterTosTable;

                private DocsDevFilterEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                {
                    super(mib, parent, "docsDevFilter", "1.3.6.1.2.1.69.1.6", false, false, false, false);
                    this.docsDevFilterLLCUnmatchedAction = new DocsDevFilterLLCUnmatchedActionEnt(mib, this);
                    this.docsDevFilterLLCTable = new DocsDevFilterLLCTableEnt(mib, this);
                    this.docsDevFilterIpDefault = new DocsDevFilterIpDefaultEnt(mib, this);
                    this.docsDevFilterIpTable = new DocsDevFilterIpTableEnt(mib, this);
                    this.docsDevFilterPolicyTable = new DocsDevFilterPolicyTableEnt(mib, this);
                    this.docsDevFilterTosTable = new DocsDevFilterTosTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsDevFilterLLCUnmatchedAction,
                        this.docsDevFilterLLCTable,
                        this.docsDevFilterIpDefault,
                        this.docsDevFilterIpTable,
                        this.docsDevFilterPolicyTable,
                        this.docsDevFilterTosTable
                    };
                }
                public static final class DocsDevFilterLLCUnmatchedActionEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevFilterLLCUnmatchedActionEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevFilterLLCUnmatchedAction", "1.3.6.1.2.1.69.1.6.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevFilterLLCTableEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    public final DocsDevFilterLLCEntryEnt docsDevFilterLLCEntry;

                    private DocsDevFilterLLCTableEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevFilterLLCTable", "1.3.6.1.2.1.69.1.6.2", false, true, false, false);
                        this.docsDevFilterLLCEntry = new DocsDevFilterLLCEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsDevFilterLLCEntry
                        };
                    }
                    public static final class DocsDevFilterLLCEntryEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                    {
                        public final DocsDevFilterLLCIndexEnt docsDevFilterLLCIndex;

                        public final DocsDevFilterLLCStatusEnt docsDevFilterLLCStatus;

                        public final DocsDevFilterLLCIfIndexEnt docsDevFilterLLCIfIndex;

                        public final DocsDevFilterLLCProtocolTypeEnt docsDevFilterLLCProtocolType;

                        public final DocsDevFilterLLCProtocolEnt docsDevFilterLLCProtocol;

                        public final DocsDevFilterLLCMatchesEnt docsDevFilterLLCMatches;

                        private DocsDevFilterLLCEntryEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                        {
                            super(mib, parent, "docsDevFilterLLCEntry", "1.3.6.1.2.1.69.1.6.2.1", false, false, false, true);
                            this.docsDevFilterLLCIndex = new DocsDevFilterLLCIndexEnt(mib, this);
                            this.docsDevFilterLLCStatus = new DocsDevFilterLLCStatusEnt(mib, this);
                            this.docsDevFilterLLCIfIndex = new DocsDevFilterLLCIfIndexEnt(mib, this);
                            this.docsDevFilterLLCProtocolType = new DocsDevFilterLLCProtocolTypeEnt(mib, this);
                            this.docsDevFilterLLCProtocol = new DocsDevFilterLLCProtocolEnt(mib, this);
                            this.docsDevFilterLLCMatches = new DocsDevFilterLLCMatchesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsDevFilterLLCIndex,
                                this.docsDevFilterLLCStatus,
                                this.docsDevFilterLLCIfIndex,
                                this.docsDevFilterLLCProtocolType,
                                this.docsDevFilterLLCProtocol,
                                this.docsDevFilterLLCMatches
                            };
                        }
                        public static final class DocsDevFilterLLCIndexEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterLLCIndexEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterLLCIndex", "1.3.6.1.2.1.69.1.6.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterLLCStatusEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterLLCStatusEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterLLCStatus", "1.3.6.1.2.1.69.1.6.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterLLCIfIndexEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterLLCIfIndexEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterLLCIfIndex", "1.3.6.1.2.1.69.1.6.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterLLCProtocolTypeEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterLLCProtocolTypeEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterLLCProtocolType", "1.3.6.1.2.1.69.1.6.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterLLCProtocolEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterLLCProtocolEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterLLCProtocol", "1.3.6.1.2.1.69.1.6.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterLLCMatchesEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterLLCMatchesEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterLLCMatches", "1.3.6.1.2.1.69.1.6.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsDevFilterIpDefaultEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevFilterIpDefaultEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevFilterIpDefault", "1.3.6.1.2.1.69.1.6.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevFilterIpTableEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    public final DocsDevFilterIpEntryEnt docsDevFilterIpEntry;

                    private DocsDevFilterIpTableEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevFilterIpTable", "1.3.6.1.2.1.69.1.6.4", false, true, false, false);
                        this.docsDevFilterIpEntry = new DocsDevFilterIpEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsDevFilterIpEntry
                        };
                    }
                    public static final class DocsDevFilterIpEntryEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                    {
                        public final DocsDevFilterIpIndexEnt docsDevFilterIpIndex;

                        public final DocsDevFilterIpStatusEnt docsDevFilterIpStatus;

                        public final DocsDevFilterIpControlEnt docsDevFilterIpControl;

                        public final DocsDevFilterIpIfIndexEnt docsDevFilterIpIfIndex;

                        public final DocsDevFilterIpDirectionEnt docsDevFilterIpDirection;

                        public final DocsDevFilterIpBroadcastEnt docsDevFilterIpBroadcast;

                        public final DocsDevFilterIpSaddrEnt docsDevFilterIpSaddr;

                        public final DocsDevFilterIpSmaskEnt docsDevFilterIpSmask;

                        public final DocsDevFilterIpDaddrEnt docsDevFilterIpDaddr;

                        public final DocsDevFilterIpDmaskEnt docsDevFilterIpDmask;

                        public final DocsDevFilterIpProtocolEnt docsDevFilterIpProtocol;

                        public final DocsDevFilterIpSourcePortLowEnt docsDevFilterIpSourcePortLow;

                        public final DocsDevFilterIpSourcePortHighEnt docsDevFilterIpSourcePortHigh;

                        public final DocsDevFilterIpDestPortLowEnt docsDevFilterIpDestPortLow;

                        public final DocsDevFilterIpDestPortHighEnt docsDevFilterIpDestPortHigh;

                        public final DocsDevFilterIpMatchesEnt docsDevFilterIpMatches;

                        public final DocsDevFilterIpTosEnt docsDevFilterIpTos;

                        public final DocsDevFilterIpTosMaskEnt docsDevFilterIpTosMask;

                        public final DocsDevFilterIpContinueEnt docsDevFilterIpContinue;

                        public final DocsDevFilterIpPolicyIdEnt docsDevFilterIpPolicyId;

                        private DocsDevFilterIpEntryEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                        {
                            super(mib, parent, "docsDevFilterIpEntry", "1.3.6.1.2.1.69.1.6.4.1", false, false, false, true);
                            this.docsDevFilterIpIndex = new DocsDevFilterIpIndexEnt(mib, this);
                            this.docsDevFilterIpStatus = new DocsDevFilterIpStatusEnt(mib, this);
                            this.docsDevFilterIpControl = new DocsDevFilterIpControlEnt(mib, this);
                            this.docsDevFilterIpIfIndex = new DocsDevFilterIpIfIndexEnt(mib, this);
                            this.docsDevFilterIpDirection = new DocsDevFilterIpDirectionEnt(mib, this);
                            this.docsDevFilterIpBroadcast = new DocsDevFilterIpBroadcastEnt(mib, this);
                            this.docsDevFilterIpSaddr = new DocsDevFilterIpSaddrEnt(mib, this);
                            this.docsDevFilterIpSmask = new DocsDevFilterIpSmaskEnt(mib, this);
                            this.docsDevFilterIpDaddr = new DocsDevFilterIpDaddrEnt(mib, this);
                            this.docsDevFilterIpDmask = new DocsDevFilterIpDmaskEnt(mib, this);
                            this.docsDevFilterIpProtocol = new DocsDevFilterIpProtocolEnt(mib, this);
                            this.docsDevFilterIpSourcePortLow = new DocsDevFilterIpSourcePortLowEnt(mib, this);
                            this.docsDevFilterIpSourcePortHigh = new DocsDevFilterIpSourcePortHighEnt(mib, this);
                            this.docsDevFilterIpDestPortLow = new DocsDevFilterIpDestPortLowEnt(mib, this);
                            this.docsDevFilterIpDestPortHigh = new DocsDevFilterIpDestPortHighEnt(mib, this);
                            this.docsDevFilterIpMatches = new DocsDevFilterIpMatchesEnt(mib, this);
                            this.docsDevFilterIpTos = new DocsDevFilterIpTosEnt(mib, this);
                            this.docsDevFilterIpTosMask = new DocsDevFilterIpTosMaskEnt(mib, this);
                            this.docsDevFilterIpContinue = new DocsDevFilterIpContinueEnt(mib, this);
                            this.docsDevFilterIpPolicyId = new DocsDevFilterIpPolicyIdEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsDevFilterIpIndex,
                                this.docsDevFilterIpStatus,
                                this.docsDevFilterIpControl,
                                this.docsDevFilterIpIfIndex,
                                this.docsDevFilterIpDirection,
                                this.docsDevFilterIpBroadcast,
                                this.docsDevFilterIpSaddr,
                                this.docsDevFilterIpSmask,
                                this.docsDevFilterIpDaddr,
                                this.docsDevFilterIpDmask,
                                this.docsDevFilterIpProtocol,
                                this.docsDevFilterIpSourcePortLow,
                                this.docsDevFilterIpSourcePortHigh,
                                this.docsDevFilterIpDestPortLow,
                                this.docsDevFilterIpDestPortHigh,
                                this.docsDevFilterIpMatches,
                                this.docsDevFilterIpTos,
                                this.docsDevFilterIpTosMask,
                                this.docsDevFilterIpContinue,
                                this.docsDevFilterIpPolicyId
                            };
                        }
                        public static final class DocsDevFilterIpIndexEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpIndexEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpIndex", "1.3.6.1.2.1.69.1.6.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpStatusEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpStatusEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpStatus", "1.3.6.1.2.1.69.1.6.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpControlEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpControlEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpControl", "1.3.6.1.2.1.69.1.6.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpIfIndexEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpIfIndexEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpIfIndex", "1.3.6.1.2.1.69.1.6.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpDirectionEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpDirectionEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpDirection", "1.3.6.1.2.1.69.1.6.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpBroadcastEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpBroadcastEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpBroadcast", "1.3.6.1.2.1.69.1.6.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpSaddrEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpSaddrEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpSaddr", "1.3.6.1.2.1.69.1.6.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpSmaskEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpSmaskEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpSmask", "1.3.6.1.2.1.69.1.6.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpDaddrEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpDaddrEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpDaddr", "1.3.6.1.2.1.69.1.6.4.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpDmaskEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpDmaskEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpDmask", "1.3.6.1.2.1.69.1.6.4.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpProtocolEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpProtocolEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpProtocol", "1.3.6.1.2.1.69.1.6.4.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpSourcePortLowEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpSourcePortLowEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpSourcePortLow", "1.3.6.1.2.1.69.1.6.4.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpSourcePortHighEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpSourcePortHighEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpSourcePortHigh", "1.3.6.1.2.1.69.1.6.4.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpDestPortLowEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpDestPortLowEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpDestPortLow", "1.3.6.1.2.1.69.1.6.4.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpDestPortHighEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpDestPortHighEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpDestPortHigh", "1.3.6.1.2.1.69.1.6.4.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpMatchesEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpMatchesEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpMatches", "1.3.6.1.2.1.69.1.6.4.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpTosEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpTosEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpTos", "1.3.6.1.2.1.69.1.6.4.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpTosMaskEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpTosMaskEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpTosMask", "1.3.6.1.2.1.69.1.6.4.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpContinueEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpContinueEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpContinue", "1.3.6.1.2.1.69.1.6.4.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterIpPolicyIdEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterIpPolicyIdEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterIpPolicyId", "1.3.6.1.2.1.69.1.6.4.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsDevFilterPolicyTableEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    public final DocsDevFilterPolicyEntryEnt docsDevFilterPolicyEntry;

                    private DocsDevFilterPolicyTableEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevFilterPolicyTable", "1.3.6.1.2.1.69.1.6.5", false, true, false, false);
                        this.docsDevFilterPolicyEntry = new DocsDevFilterPolicyEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsDevFilterPolicyEntry
                        };
                    }
                    public static final class DocsDevFilterPolicyEntryEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                    {
                        public final DocsDevFilterPolicyIndexEnt docsDevFilterPolicyIndex;

                        public final DocsDevFilterPolicyIdEnt docsDevFilterPolicyId;

                        /** The following two objects were removed and never used; however,to preserve OID numbering, they are simply commented out toto ensure that they are not used again.docsDevFilterPolicyType ::= { docsDevFilterPolicyEntry 3 }docsDevFilterPolicyAction ::= { docsDevFilterPolicyEntry 4 }*/
                        public final DocsDevFilterPolicyStatusEnt docsDevFilterPolicyStatus;

                        public final DocsDevFilterPolicyPtrEnt docsDevFilterPolicyPtr;

                        private DocsDevFilterPolicyEntryEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                        {
                            super(mib, parent, "docsDevFilterPolicyEntry", "1.3.6.1.2.1.69.1.6.5.1", false, false, false, true);
                            this.docsDevFilterPolicyIndex = new DocsDevFilterPolicyIndexEnt(mib, this);
                            this.docsDevFilterPolicyId = new DocsDevFilterPolicyIdEnt(mib, this);
                            this.docsDevFilterPolicyStatus = new DocsDevFilterPolicyStatusEnt(mib, this);
                            this.docsDevFilterPolicyPtr = new DocsDevFilterPolicyPtrEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsDevFilterPolicyIndex,
                                this.docsDevFilterPolicyId,
                                this.docsDevFilterPolicyStatus,
                                this.docsDevFilterPolicyPtr
                            };
                        }
                        public static final class DocsDevFilterPolicyIndexEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterPolicyIndexEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterPolicyIndex", "1.3.6.1.2.1.69.1.6.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterPolicyIdEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterPolicyIdEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterPolicyId", "1.3.6.1.2.1.69.1.6.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterPolicyStatusEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterPolicyStatusEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterPolicyStatus", "1.3.6.1.2.1.69.1.6.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterPolicyPtrEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterPolicyPtrEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterPolicyPtr", "1.3.6.1.2.1.69.1.6.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsDevFilterTosTableEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    public final DocsDevFilterTosEntryEnt docsDevFilterTosEntry;

                    private DocsDevFilterTosTableEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevFilterTosTable", "1.3.6.1.2.1.69.1.6.6", false, true, false, false);
                        this.docsDevFilterTosEntry = new DocsDevFilterTosEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsDevFilterTosEntry
                        };
                    }
                    public static final class DocsDevFilterTosEntryEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                    {
                        public final DocsDevFilterTosIndexEnt docsDevFilterTosIndex;

                        public final DocsDevFilterTosStatusEnt docsDevFilterTosStatus;

                        public final DocsDevFilterTosAndMaskEnt docsDevFilterTosAndMask;

                        public final DocsDevFilterTosOrMaskEnt docsDevFilterTosOrMask;

                        private DocsDevFilterTosEntryEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                        {
                            super(mib, parent, "docsDevFilterTosEntry", "1.3.6.1.2.1.69.1.6.6.1", false, false, false, true);
                            this.docsDevFilterTosIndex = new DocsDevFilterTosIndexEnt(mib, this);
                            this.docsDevFilterTosStatus = new DocsDevFilterTosStatusEnt(mib, this);
                            this.docsDevFilterTosAndMask = new DocsDevFilterTosAndMaskEnt(mib, this);
                            this.docsDevFilterTosOrMask = new DocsDevFilterTosOrMaskEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsDevFilterTosIndex,
                                this.docsDevFilterTosStatus,
                                this.docsDevFilterTosAndMask,
                                this.docsDevFilterTosOrMask
                            };
                        }
                        public static final class DocsDevFilterTosIndexEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterTosIndexEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterTosIndex", "1.3.6.1.2.1.69.1.6.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterTosStatusEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterTosStatusEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterTosStatus", "1.3.6.1.2.1.69.1.6.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterTosAndMaskEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterTosAndMaskEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterTosAndMask", "1.3.6.1.2.1.69.1.6.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevFilterTosOrMaskEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevFilterTosOrMaskEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevFilterTosOrMask", "1.3.6.1.2.1.69.1.6.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DocsDevCpeEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
            {
                public final DocsDevCpeEnrollEnt docsDevCpeEnroll;

                public final DocsDevCpeIpMaxEnt docsDevCpeIpMax;

                public final DocsDevCpeTableEnt docsDevCpeTable;

                /** Internet CPE Management and anti spoofing group, for support ofnon-IPv4 CPEs.*/
                public final DocsDevCpeInetTableEnt docsDevCpeInetTable;

                private DocsDevCpeEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                {
                    super(mib, parent, "docsDevCpe", "1.3.6.1.2.1.69.1.7", false, false, false, false);
                    this.docsDevCpeEnroll = new DocsDevCpeEnrollEnt(mib, this);
                    this.docsDevCpeIpMax = new DocsDevCpeIpMaxEnt(mib, this);
                    this.docsDevCpeTable = new DocsDevCpeTableEnt(mib, this);
                    this.docsDevCpeInetTable = new DocsDevCpeInetTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsDevCpeEnroll,
                        this.docsDevCpeIpMax,
                        this.docsDevCpeTable,
                        this.docsDevCpeInetTable
                    };
                }
                public static final class DocsDevCpeEnrollEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevCpeEnrollEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevCpeEnroll", "1.3.6.1.2.1.69.1.7.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevCpeIpMaxEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevCpeIpMaxEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevCpeIpMax", "1.3.6.1.2.1.69.1.7.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevCpeTableEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    public final DocsDevCpeEntryEnt docsDevCpeEntry;

                    private DocsDevCpeTableEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevCpeTable", "1.3.6.1.2.1.69.1.7.3", false, true, false, false);
                        this.docsDevCpeEntry = new DocsDevCpeEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsDevCpeEntry
                        };
                    }
                    public static final class DocsDevCpeEntryEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                    {
                        public final DocsDevCpeIpEnt docsDevCpeIp;

                        public final DocsDevCpeSourceEnt docsDevCpeSource;

                        public final DocsDevCpeStatusEnt docsDevCpeStatus;

                        private DocsDevCpeEntryEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                        {
                            super(mib, parent, "docsDevCpeEntry", "1.3.6.1.2.1.69.1.7.3.1", false, false, false, true);
                            this.docsDevCpeIp = new DocsDevCpeIpEnt(mib, this);
                            this.docsDevCpeSource = new DocsDevCpeSourceEnt(mib, this);
                            this.docsDevCpeStatus = new DocsDevCpeStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsDevCpeIp,
                                this.docsDevCpeSource,
                                this.docsDevCpeStatus
                            };
                        }
                        public static final class DocsDevCpeIpEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevCpeIpEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevCpeIp", "1.3.6.1.2.1.69.1.7.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevCpeSourceEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevCpeSourceEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevCpeSource", "1.3.6.1.2.1.69.1.7.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevCpeStatusEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevCpeStatusEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevCpeStatus", "1.3.6.1.2.1.69.1.7.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsDevCpeInetTableEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    public final DocsDevCpeInetEntryEnt docsDevCpeInetEntry;

                    private DocsDevCpeInetTableEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevCpeInetTable", "1.3.6.1.2.1.69.1.7.4", false, true, false, false);
                        this.docsDevCpeInetEntry = new DocsDevCpeInetEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsDevCpeInetEntry
                        };
                    }
                    public static final class DocsDevCpeInetEntryEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                    {
                        public final DocsDevCpeInetTypeEnt docsDevCpeInetType;

                        public final DocsDevCpeInetAddrEnt docsDevCpeInetAddr;

                        public final DocsDevCpeInetSourceEnt docsDevCpeInetSource;

                        public final DocsDevCpeInetRowStatusEnt docsDevCpeInetRowStatus;

                        private DocsDevCpeInetEntryEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                        {
                            super(mib, parent, "docsDevCpeInetEntry", "1.3.6.1.2.1.69.1.7.4.1", false, false, false, true);
                            this.docsDevCpeInetType = new DocsDevCpeInetTypeEnt(mib, this);
                            this.docsDevCpeInetAddr = new DocsDevCpeInetAddrEnt(mib, this);
                            this.docsDevCpeInetSource = new DocsDevCpeInetSourceEnt(mib, this);
                            this.docsDevCpeInetRowStatus = new DocsDevCpeInetRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsDevCpeInetType,
                                this.docsDevCpeInetAddr,
                                this.docsDevCpeInetSource,
                                this.docsDevCpeInetRowStatus
                            };
                        }
                        public static final class DocsDevCpeInetTypeEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevCpeInetTypeEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevCpeInetType", "1.3.6.1.2.1.69.1.7.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevCpeInetAddrEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevCpeInetAddrEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevCpeInetAddr", "1.3.6.1.2.1.69.1.7.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevCpeInetSourceEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevCpeInetSourceEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevCpeInetSource", "1.3.6.1.2.1.69.1.7.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsDevCpeInetRowStatusEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                        {
                            private DocsDevCpeInetRowStatusEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                            {
                                super(mib, parent, "docsDevCpeInetRowStatus", "1.3.6.1.2.1.69.1.7.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class DocsDevNotificationEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
        {
            private DocsDevNotificationEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
            {
                super(mib, parent, "docsDevNotification", "1.3.6.1.2.1.69.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevNotificationsEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
        {
            private DocsDevNotificationsEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
            {
                super(mib, parent, "docsDevNotifications", "1.3.6.1.2.1.69.0", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevConformanceEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
        {
            public final DocsDevGroupsEnt docsDevGroups;

            public final DocsDevCompliancesEnt docsDevCompliances;

            /** RFC 4639 Conformance definitions*/
            public final DocsDevGroupsV2Ent docsDevGroupsV2;

            public final DocsDevCompliancesV2Ent docsDevCompliancesV2;

            private DocsDevConformanceEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
            {
                super(mib, parent, "docsDevConformance", "1.3.6.1.2.1.69.3", false, false, false, false);
                this.docsDevGroups = new DocsDevGroupsEnt(mib, this);
                this.docsDevCompliances = new DocsDevCompliancesEnt(mib, this);
                this.docsDevGroupsV2 = new DocsDevGroupsV2Ent(mib, this);
                this.docsDevCompliancesV2 = new DocsDevCompliancesV2Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.docsDevGroups,
                    this.docsDevCompliances,
                    this.docsDevGroupsV2,
                    this.docsDevCompliancesV2
                };
            }
            public static final class DocsDevGroupsEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
            {
                public final DocsDevBaseGroupEnt docsDevBaseGroup;

                public final DocsDevNmAccessGroupEnt docsDevNmAccessGroup;

                public final DocsDevSoftwareGroupEnt docsDevSoftwareGroup;

                public final DocsDevServerGroupEnt docsDevServerGroup;

                public final DocsDevEventGroupEnt docsDevEventGroup;

                public final DocsDevFilterGroupEnt docsDevFilterGroup;

                public final DocsDevCpeGroupEnt docsDevCpeGroup;

                private DocsDevGroupsEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                {
                    super(mib, parent, "docsDevGroups", "1.3.6.1.2.1.69.3.1", false, false, false, false);
                    this.docsDevBaseGroup = new DocsDevBaseGroupEnt(mib, this);
                    this.docsDevNmAccessGroup = new DocsDevNmAccessGroupEnt(mib, this);
                    this.docsDevSoftwareGroup = new DocsDevSoftwareGroupEnt(mib, this);
                    this.docsDevServerGroup = new DocsDevServerGroupEnt(mib, this);
                    this.docsDevEventGroup = new DocsDevEventGroupEnt(mib, this);
                    this.docsDevFilterGroup = new DocsDevFilterGroupEnt(mib, this);
                    this.docsDevCpeGroup = new DocsDevCpeGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsDevBaseGroup,
                        this.docsDevNmAccessGroup,
                        this.docsDevSoftwareGroup,
                        this.docsDevServerGroup,
                        this.docsDevEventGroup,
                        this.docsDevFilterGroup,
                        this.docsDevCpeGroup
                    };
                }
                public static final class DocsDevBaseGroupEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevBaseGroupEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevBaseGroup", "1.3.6.1.2.1.69.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevNmAccessGroupEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevNmAccessGroupEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevNmAccessGroup", "1.3.6.1.2.1.69.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevSoftwareGroupEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevSoftwareGroupEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevSoftwareGroup", "1.3.6.1.2.1.69.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevServerGroupEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevServerGroupEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevServerGroup", "1.3.6.1.2.1.69.3.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevEventGroupEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevEventGroupEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevEventGroup", "1.3.6.1.2.1.69.3.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevFilterGroupEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevFilterGroupEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevFilterGroup", "1.3.6.1.2.1.69.3.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevCpeGroupEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevCpeGroupEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevCpeGroup", "1.3.6.1.2.1.69.3.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DocsDevCompliancesEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
            {
                public final DocsDevBasicComplianceEnt docsDevBasicCompliance;

                private DocsDevCompliancesEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                {
                    super(mib, parent, "docsDevCompliances", "1.3.6.1.2.1.69.3.2", false, false, false, false);
                    this.docsDevBasicCompliance = new DocsDevBasicComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsDevBasicCompliance
                    };
                }
                public static final class DocsDevBasicComplianceEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevBasicComplianceEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevBasicCompliance", "1.3.6.1.2.1.69.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DocsDevGroupsV2Ent extends MIBEntry<DOCSCABLEDEVICEMIBDef>
            {
                public final DocsDevBaseIgmpGroupEnt docsDevBaseIgmpGroup;

                public final DocsDevBaseMaxCpeGroupEnt docsDevBaseMaxCpeGroup;

                public final DocsDevNmAccessExtGroupEnt docsDevNmAccessExtGroup;

                public final DocsDevSoftwareGroupV2Ent docsDevSoftwareGroupV2;

                public final DocsDevServerGroupV2Ent docsDevServerGroupV2;

                public final DocsDevEventGroupV2Ent docsDevEventGroupV2;

                public final DocsDevFilterLLCGroupEnt docsDevFilterLLCGroup;

                public final DocsDevInetCpeGroupEnt docsDevInetCpeGroup;

                private DocsDevGroupsV2Ent(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                {
                    super(mib, parent, "docsDevGroupsV2", "1.3.6.1.2.1.69.3.3", false, false, false, false);
                    this.docsDevBaseIgmpGroup = new DocsDevBaseIgmpGroupEnt(mib, this);
                    this.docsDevBaseMaxCpeGroup = new DocsDevBaseMaxCpeGroupEnt(mib, this);
                    this.docsDevNmAccessExtGroup = new DocsDevNmAccessExtGroupEnt(mib, this);
                    this.docsDevSoftwareGroupV2 = new DocsDevSoftwareGroupV2Ent(mib, this);
                    this.docsDevServerGroupV2 = new DocsDevServerGroupV2Ent(mib, this);
                    this.docsDevEventGroupV2 = new DocsDevEventGroupV2Ent(mib, this);
                    this.docsDevFilterLLCGroup = new DocsDevFilterLLCGroupEnt(mib, this);
                    this.docsDevInetCpeGroup = new DocsDevInetCpeGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsDevBaseIgmpGroup,
                        this.docsDevBaseMaxCpeGroup,
                        this.docsDevNmAccessExtGroup,
                        this.docsDevSoftwareGroupV2,
                        this.docsDevServerGroupV2,
                        this.docsDevEventGroupV2,
                        this.docsDevFilterLLCGroup,
                        this.docsDevInetCpeGroup
                    };
                }
                public static final class DocsDevBaseIgmpGroupEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevBaseIgmpGroupEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevBaseIgmpGroup", "1.3.6.1.2.1.69.3.3.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevBaseMaxCpeGroupEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevBaseMaxCpeGroupEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevBaseMaxCpeGroup", "1.3.6.1.2.1.69.3.3.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevNmAccessExtGroupEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevNmAccessExtGroupEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevNmAccessExtGroup", "1.3.6.1.2.1.69.3.3.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevSoftwareGroupV2Ent extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevSoftwareGroupV2Ent(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevSoftwareGroupV2", "1.3.6.1.2.1.69.3.3.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevServerGroupV2Ent extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevServerGroupV2Ent(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevServerGroupV2", "1.3.6.1.2.1.69.3.3.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevEventGroupV2Ent extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevEventGroupV2Ent(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevEventGroupV2", "1.3.6.1.2.1.69.3.3.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevFilterLLCGroupEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevFilterLLCGroupEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevFilterLLCGroup", "1.3.6.1.2.1.69.3.3.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevInetCpeGroupEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevInetCpeGroupEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevInetCpeGroup", "1.3.6.1.2.1.69.3.3.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DocsDevCompliancesV2Ent extends MIBEntry<DOCSCABLEDEVICEMIBDef>
            {
                /** RFC 3289*/
                public final DocsDevCmComplianceEnt docsDevCmCompliance;

                public final DocsDevCmtsComplianceEnt docsDevCmtsCompliance;

                private DocsDevCompliancesV2Ent(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                {
                    super(mib, parent, "docsDevCompliancesV2", "1.3.6.1.2.1.69.3.4", false, false, false, false);
                    this.docsDevCmCompliance = new DocsDevCmComplianceEnt(mib, this);
                    this.docsDevCmtsCompliance = new DocsDevCmtsComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsDevCmCompliance,
                        this.docsDevCmtsCompliance
                    };
                }
                public static final class DocsDevCmComplianceEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevCmComplianceEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevCmCompliance", "1.3.6.1.2.1.69.3.4.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevCmtsComplianceEnt extends MIBEntry<DOCSCABLEDEVICEMIBDef>
                {
                    private DocsDevCmtsComplianceEnt(DOCSCABLEDEVICEMIBDef mib, MIBEntry<DOCSCABLEDEVICEMIBDef> parent)
                    {
                        super(mib, parent, "docsDevCmtsCompliance", "1.3.6.1.2.1.69.3.4.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
