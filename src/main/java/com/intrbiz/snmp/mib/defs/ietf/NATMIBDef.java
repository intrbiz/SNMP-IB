package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class NATMIBDef extends MIB
{
    public static final NATMIBDef NATMIB = new NATMIBDef();

    static { MIBs.getInstance().registerMIB(NATMIBDef.NATMIB); }

    public final NatMIBEnt natMIB;

    private NATMIBDef()
    {
        super("NAT-MIB");
        this.natMIB = new NatMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.natMIB
        };
    }

    public static final class NatMIBEnt extends MIBEntry<NATMIBDef>
    {
        public final NatMIBObjectsEnt natMIBObjects;

        /** Notifications section*/
        public final NatMIBNotificationsEnt natMIBNotifications;

        /** Conformance information.*/
        public final NatMIBConformanceEnt natMIBConformance;

        private NatMIBEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
        {
            super(mib, parent, "natMIB", "1.3.6.1.2.1.123", false, false, false, false);
            this.natMIBObjects = new NatMIBObjectsEnt(mib, this);
            this.natMIBNotifications = new NatMIBNotificationsEnt(mib, this);
            this.natMIBConformance = new NatMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.natMIBObjects,
                this.natMIBNotifications,
                this.natMIBConformance
            };
        }
        public static final class NatMIBObjectsEnt extends MIBEntry<NATMIBDef>
        {
            /** Default Values for the Bind and NAT Protocol Timers*/
            public final NatDefTimeoutsEnt natDefTimeouts;

            public final NatNotifCtrlEnt natNotifCtrl;

            /** The NAT Interface Table*/
            public final NatInterfaceTableEnt natInterfaceTable;

            /** The Address Map Table*/
            public final NatAddrMapTableEnt natAddrMapTable;

            /** Address Bind section*/
            public final NatAddrBindNumberOfEntriesEnt natAddrBindNumberOfEntries;

            /** The NAT Address BIND Table*/
            public final NatAddrBindTableEnt natAddrBindTable;

            /** Address Port Bind section*/
            public final NatAddrPortBindNumberOfEntriesEnt natAddrPortBindNumberOfEntries;

            /** The NAT Address Port Bind Table*/
            public final NatAddrPortBindTableEnt natAddrPortBindTable;

            /** The Session Table*/
            public final NatSessionTableEnt natSessionTable;

            /** The Protocol table*/
            public final NatProtocolTableEnt natProtocolTable;

            private NatMIBObjectsEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
            {
                super(mib, parent, "natMIBObjects", "1.3.6.1.2.1.123.1", false, false, false, false);
                this.natDefTimeouts = new NatDefTimeoutsEnt(mib, this);
                this.natNotifCtrl = new NatNotifCtrlEnt(mib, this);
                this.natInterfaceTable = new NatInterfaceTableEnt(mib, this);
                this.natAddrMapTable = new NatAddrMapTableEnt(mib, this);
                this.natAddrBindNumberOfEntries = new NatAddrBindNumberOfEntriesEnt(mib, this);
                this.natAddrBindTable = new NatAddrBindTableEnt(mib, this);
                this.natAddrPortBindNumberOfEntries = new NatAddrPortBindNumberOfEntriesEnt(mib, this);
                this.natAddrPortBindTable = new NatAddrPortBindTableEnt(mib, this);
                this.natSessionTable = new NatSessionTableEnt(mib, this);
                this.natProtocolTable = new NatProtocolTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.natDefTimeouts,
                    this.natNotifCtrl,
                    this.natInterfaceTable,
                    this.natAddrMapTable,
                    this.natAddrBindNumberOfEntries,
                    this.natAddrBindTable,
                    this.natAddrPortBindNumberOfEntries,
                    this.natAddrPortBindTable,
                    this.natSessionTable,
                    this.natProtocolTable
                };
            }
            public static final class NatDefTimeoutsEnt extends MIBEntry<NATMIBDef>
            {
                /** Address Bind and Port Bind related NAT configuration*/
                public final NatBindDefIdleTimeoutEnt natBindDefIdleTimeout;

                /** UDP related NAT configuration*/
                public final NatUdpDefIdleTimeoutEnt natUdpDefIdleTimeout;

                /** ICMP related NAT configuration*/
                public final NatIcmpDefIdleTimeoutEnt natIcmpDefIdleTimeout;

                /** Other protocol parameters*/
                public final NatOtherDefIdleTimeoutEnt natOtherDefIdleTimeout;

                /** TCP related NAT Timers*/
                public final NatTcpDefIdleTimeoutEnt natTcpDefIdleTimeout;

                public final NatTcpDefNegTimeoutEnt natTcpDefNegTimeout;

                private NatDefTimeoutsEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                {
                    super(mib, parent, "natDefTimeouts", "1.3.6.1.2.1.123.1.1", false, false, false, false);
                    this.natBindDefIdleTimeout = new NatBindDefIdleTimeoutEnt(mib, this);
                    this.natUdpDefIdleTimeout = new NatUdpDefIdleTimeoutEnt(mib, this);
                    this.natIcmpDefIdleTimeout = new NatIcmpDefIdleTimeoutEnt(mib, this);
                    this.natOtherDefIdleTimeout = new NatOtherDefIdleTimeoutEnt(mib, this);
                    this.natTcpDefIdleTimeout = new NatTcpDefIdleTimeoutEnt(mib, this);
                    this.natTcpDefNegTimeout = new NatTcpDefNegTimeoutEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.natBindDefIdleTimeout,
                        this.natUdpDefIdleTimeout,
                        this.natIcmpDefIdleTimeout,
                        this.natOtherDefIdleTimeout,
                        this.natTcpDefIdleTimeout,
                        this.natTcpDefNegTimeout
                    };
                }
                public static final class NatBindDefIdleTimeoutEnt extends MIBEntry<NATMIBDef>
                {
                    private NatBindDefIdleTimeoutEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natBindDefIdleTimeout", "1.3.6.1.2.1.123.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NatUdpDefIdleTimeoutEnt extends MIBEntry<NATMIBDef>
                {
                    private NatUdpDefIdleTimeoutEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natUdpDefIdleTimeout", "1.3.6.1.2.1.123.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NatIcmpDefIdleTimeoutEnt extends MIBEntry<NATMIBDef>
                {
                    private NatIcmpDefIdleTimeoutEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natIcmpDefIdleTimeout", "1.3.6.1.2.1.123.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NatOtherDefIdleTimeoutEnt extends MIBEntry<NATMIBDef>
                {
                    private NatOtherDefIdleTimeoutEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natOtherDefIdleTimeout", "1.3.6.1.2.1.123.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NatTcpDefIdleTimeoutEnt extends MIBEntry<NATMIBDef>
                {
                    private NatTcpDefIdleTimeoutEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natTcpDefIdleTimeout", "1.3.6.1.2.1.123.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NatTcpDefNegTimeoutEnt extends MIBEntry<NATMIBDef>
                {
                    private NatTcpDefNegTimeoutEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natTcpDefNegTimeout", "1.3.6.1.2.1.123.1.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class NatNotifCtrlEnt extends MIBEntry<NATMIBDef>
            {
                public final NatNotifThrottlingIntervalEnt natNotifThrottlingInterval;

                private NatNotifCtrlEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                {
                    super(mib, parent, "natNotifCtrl", "1.3.6.1.2.1.123.1.2", false, false, false, false);
                    this.natNotifThrottlingInterval = new NatNotifThrottlingIntervalEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.natNotifThrottlingInterval
                    };
                }
                public static final class NatNotifThrottlingIntervalEnt extends MIBEntry<NATMIBDef>
                {
                    private NatNotifThrottlingIntervalEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natNotifThrottlingInterval", "1.3.6.1.2.1.123.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class NatInterfaceTableEnt extends MIBEntry<NATMIBDef>
            {
                public final NatInterfaceEntryEnt natInterfaceEntry;

                private NatInterfaceTableEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                {
                    super(mib, parent, "natInterfaceTable", "1.3.6.1.2.1.123.1.3", false, true, false, false);
                    this.natInterfaceEntry = new NatInterfaceEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.natInterfaceEntry
                    };
                }
                public static final class NatInterfaceEntryEnt extends MIBEntry<NATMIBDef>
                {
                    public final NatInterfaceRealmEnt natInterfaceRealm;

                    public final NatInterfaceServiceTypeEnt natInterfaceServiceType;

                    public final NatInterfaceInTranslatesEnt natInterfaceInTranslates;

                    public final NatInterfaceOutTranslatesEnt natInterfaceOutTranslates;

                    public final NatInterfaceDiscardsEnt natInterfaceDiscards;

                    public final NatInterfaceStorageTypeEnt natInterfaceStorageType;

                    public final NatInterfaceRowStatusEnt natInterfaceRowStatus;

                    private NatInterfaceEntryEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natInterfaceEntry", "1.3.6.1.2.1.123.1.3.1", false, false, false, true);
                        this.natInterfaceRealm = new NatInterfaceRealmEnt(mib, this);
                        this.natInterfaceServiceType = new NatInterfaceServiceTypeEnt(mib, this);
                        this.natInterfaceInTranslates = new NatInterfaceInTranslatesEnt(mib, this);
                        this.natInterfaceOutTranslates = new NatInterfaceOutTranslatesEnt(mib, this);
                        this.natInterfaceDiscards = new NatInterfaceDiscardsEnt(mib, this);
                        this.natInterfaceStorageType = new NatInterfaceStorageTypeEnt(mib, this);
                        this.natInterfaceRowStatus = new NatInterfaceRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.natInterfaceRealm,
                            this.natInterfaceServiceType,
                            this.natInterfaceInTranslates,
                            this.natInterfaceOutTranslates,
                            this.natInterfaceDiscards,
                            this.natInterfaceStorageType,
                            this.natInterfaceRowStatus
                        };
                    }
                    public static final class NatInterfaceRealmEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatInterfaceRealmEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natInterfaceRealm", "1.3.6.1.2.1.123.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatInterfaceServiceTypeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatInterfaceServiceTypeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natInterfaceServiceType", "1.3.6.1.2.1.123.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatInterfaceInTranslatesEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatInterfaceInTranslatesEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natInterfaceInTranslates", "1.3.6.1.2.1.123.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatInterfaceOutTranslatesEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatInterfaceOutTranslatesEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natInterfaceOutTranslates", "1.3.6.1.2.1.123.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatInterfaceDiscardsEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatInterfaceDiscardsEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natInterfaceDiscards", "1.3.6.1.2.1.123.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatInterfaceStorageTypeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatInterfaceStorageTypeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natInterfaceStorageType", "1.3.6.1.2.1.123.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatInterfaceRowStatusEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatInterfaceRowStatusEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natInterfaceRowStatus", "1.3.6.1.2.1.123.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class NatAddrMapTableEnt extends MIBEntry<NATMIBDef>
            {
                public final NatAddrMapEntryEnt natAddrMapEntry;

                private NatAddrMapTableEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                {
                    super(mib, parent, "natAddrMapTable", "1.3.6.1.2.1.123.1.4", false, true, false, false);
                    this.natAddrMapEntry = new NatAddrMapEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.natAddrMapEntry
                    };
                }
                public static final class NatAddrMapEntryEnt extends MIBEntry<NATMIBDef>
                {
                    public final NatAddrMapIndexEnt natAddrMapIndex;

                    public final NatAddrMapNameEnt natAddrMapName;

                    public final NatAddrMapEntryTypeEnt natAddrMapEntryType;

                    public final NatAddrMapTranslationEntityEnt natAddrMapTranslationEntity;

                    public final NatAddrMapLocalAddrTypeEnt natAddrMapLocalAddrType;

                    public final NatAddrMapLocalAddrFromEnt natAddrMapLocalAddrFrom;

                    public final NatAddrMapLocalAddrToEnt natAddrMapLocalAddrTo;

                    public final NatAddrMapLocalPortFromEnt natAddrMapLocalPortFrom;

                    public final NatAddrMapLocalPortToEnt natAddrMapLocalPortTo;

                    public final NatAddrMapGlobalAddrTypeEnt natAddrMapGlobalAddrType;

                    public final NatAddrMapGlobalAddrFromEnt natAddrMapGlobalAddrFrom;

                    public final NatAddrMapGlobalAddrToEnt natAddrMapGlobalAddrTo;

                    public final NatAddrMapGlobalPortFromEnt natAddrMapGlobalPortFrom;

                    public final NatAddrMapGlobalPortToEnt natAddrMapGlobalPortTo;

                    public final NatAddrMapProtocolEnt natAddrMapProtocol;

                    public final NatAddrMapInTranslatesEnt natAddrMapInTranslates;

                    public final NatAddrMapOutTranslatesEnt natAddrMapOutTranslates;

                    public final NatAddrMapDiscardsEnt natAddrMapDiscards;

                    public final NatAddrMapAddrUsedEnt natAddrMapAddrUsed;

                    public final NatAddrMapStorageTypeEnt natAddrMapStorageType;

                    public final NatAddrMapRowStatusEnt natAddrMapRowStatus;

                    private NatAddrMapEntryEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natAddrMapEntry", "1.3.6.1.2.1.123.1.4.1", false, false, false, true);
                        this.natAddrMapIndex = new NatAddrMapIndexEnt(mib, this);
                        this.natAddrMapName = new NatAddrMapNameEnt(mib, this);
                        this.natAddrMapEntryType = new NatAddrMapEntryTypeEnt(mib, this);
                        this.natAddrMapTranslationEntity = new NatAddrMapTranslationEntityEnt(mib, this);
                        this.natAddrMapLocalAddrType = new NatAddrMapLocalAddrTypeEnt(mib, this);
                        this.natAddrMapLocalAddrFrom = new NatAddrMapLocalAddrFromEnt(mib, this);
                        this.natAddrMapLocalAddrTo = new NatAddrMapLocalAddrToEnt(mib, this);
                        this.natAddrMapLocalPortFrom = new NatAddrMapLocalPortFromEnt(mib, this);
                        this.natAddrMapLocalPortTo = new NatAddrMapLocalPortToEnt(mib, this);
                        this.natAddrMapGlobalAddrType = new NatAddrMapGlobalAddrTypeEnt(mib, this);
                        this.natAddrMapGlobalAddrFrom = new NatAddrMapGlobalAddrFromEnt(mib, this);
                        this.natAddrMapGlobalAddrTo = new NatAddrMapGlobalAddrToEnt(mib, this);
                        this.natAddrMapGlobalPortFrom = new NatAddrMapGlobalPortFromEnt(mib, this);
                        this.natAddrMapGlobalPortTo = new NatAddrMapGlobalPortToEnt(mib, this);
                        this.natAddrMapProtocol = new NatAddrMapProtocolEnt(mib, this);
                        this.natAddrMapInTranslates = new NatAddrMapInTranslatesEnt(mib, this);
                        this.natAddrMapOutTranslates = new NatAddrMapOutTranslatesEnt(mib, this);
                        this.natAddrMapDiscards = new NatAddrMapDiscardsEnt(mib, this);
                        this.natAddrMapAddrUsed = new NatAddrMapAddrUsedEnt(mib, this);
                        this.natAddrMapStorageType = new NatAddrMapStorageTypeEnt(mib, this);
                        this.natAddrMapRowStatus = new NatAddrMapRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.natAddrMapIndex,
                            this.natAddrMapName,
                            this.natAddrMapEntryType,
                            this.natAddrMapTranslationEntity,
                            this.natAddrMapLocalAddrType,
                            this.natAddrMapLocalAddrFrom,
                            this.natAddrMapLocalAddrTo,
                            this.natAddrMapLocalPortFrom,
                            this.natAddrMapLocalPortTo,
                            this.natAddrMapGlobalAddrType,
                            this.natAddrMapGlobalAddrFrom,
                            this.natAddrMapGlobalAddrTo,
                            this.natAddrMapGlobalPortFrom,
                            this.natAddrMapGlobalPortTo,
                            this.natAddrMapProtocol,
                            this.natAddrMapInTranslates,
                            this.natAddrMapOutTranslates,
                            this.natAddrMapDiscards,
                            this.natAddrMapAddrUsed,
                            this.natAddrMapStorageType,
                            this.natAddrMapRowStatus
                        };
                    }
                    public static final class NatAddrMapIndexEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapIndexEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapIndex", "1.3.6.1.2.1.123.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapNameEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapNameEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapName", "1.3.6.1.2.1.123.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapEntryTypeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapEntryTypeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapEntryType", "1.3.6.1.2.1.123.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapTranslationEntityEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapTranslationEntityEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapTranslationEntity", "1.3.6.1.2.1.123.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapLocalAddrTypeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapLocalAddrTypeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapLocalAddrType", "1.3.6.1.2.1.123.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapLocalAddrFromEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapLocalAddrFromEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapLocalAddrFrom", "1.3.6.1.2.1.123.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapLocalAddrToEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapLocalAddrToEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapLocalAddrTo", "1.3.6.1.2.1.123.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapLocalPortFromEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapLocalPortFromEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapLocalPortFrom", "1.3.6.1.2.1.123.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapLocalPortToEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapLocalPortToEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapLocalPortTo", "1.3.6.1.2.1.123.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapGlobalAddrTypeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapGlobalAddrTypeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapGlobalAddrType", "1.3.6.1.2.1.123.1.4.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapGlobalAddrFromEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapGlobalAddrFromEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapGlobalAddrFrom", "1.3.6.1.2.1.123.1.4.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapGlobalAddrToEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapGlobalAddrToEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapGlobalAddrTo", "1.3.6.1.2.1.123.1.4.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapGlobalPortFromEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapGlobalPortFromEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapGlobalPortFrom", "1.3.6.1.2.1.123.1.4.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapGlobalPortToEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapGlobalPortToEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapGlobalPortTo", "1.3.6.1.2.1.123.1.4.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapProtocolEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapProtocolEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapProtocol", "1.3.6.1.2.1.123.1.4.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapInTranslatesEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapInTranslatesEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapInTranslates", "1.3.6.1.2.1.123.1.4.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapOutTranslatesEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapOutTranslatesEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapOutTranslates", "1.3.6.1.2.1.123.1.4.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapDiscardsEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapDiscardsEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapDiscards", "1.3.6.1.2.1.123.1.4.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapAddrUsedEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapAddrUsedEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapAddrUsed", "1.3.6.1.2.1.123.1.4.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapStorageTypeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapStorageTypeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapStorageType", "1.3.6.1.2.1.123.1.4.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrMapRowStatusEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrMapRowStatusEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrMapRowStatus", "1.3.6.1.2.1.123.1.4.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class NatAddrBindNumberOfEntriesEnt extends MIBEntry<NATMIBDef>
            {
                private NatAddrBindNumberOfEntriesEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                {
                    super(mib, parent, "natAddrBindNumberOfEntries", "1.3.6.1.2.1.123.1.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NatAddrBindTableEnt extends MIBEntry<NATMIBDef>
            {
                public final NatAddrBindEntryEnt natAddrBindEntry;

                private NatAddrBindTableEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                {
                    super(mib, parent, "natAddrBindTable", "1.3.6.1.2.1.123.1.6", false, true, false, false);
                    this.natAddrBindEntry = new NatAddrBindEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.natAddrBindEntry
                    };
                }
                public static final class NatAddrBindEntryEnt extends MIBEntry<NATMIBDef>
                {
                    public final NatAddrBindLocalAddrTypeEnt natAddrBindLocalAddrType;

                    public final NatAddrBindLocalAddrEnt natAddrBindLocalAddr;

                    public final NatAddrBindGlobalAddrTypeEnt natAddrBindGlobalAddrType;

                    public final NatAddrBindGlobalAddrEnt natAddrBindGlobalAddr;

                    public final NatAddrBindIdEnt natAddrBindId;

                    public final NatAddrBindTranslationEntityEnt natAddrBindTranslationEntity;

                    public final NatAddrBindTypeEnt natAddrBindType;

                    public final NatAddrBindMapIndexEnt natAddrBindMapIndex;

                    public final NatAddrBindSessionsEnt natAddrBindSessions;

                    public final NatAddrBindMaxIdleTimeEnt natAddrBindMaxIdleTime;

                    public final NatAddrBindCurrentIdleTimeEnt natAddrBindCurrentIdleTime;

                    public final NatAddrBindInTranslatesEnt natAddrBindInTranslates;

                    public final NatAddrBindOutTranslatesEnt natAddrBindOutTranslates;

                    private NatAddrBindEntryEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natAddrBindEntry", "1.3.6.1.2.1.123.1.6.1", false, false, false, true);
                        this.natAddrBindLocalAddrType = new NatAddrBindLocalAddrTypeEnt(mib, this);
                        this.natAddrBindLocalAddr = new NatAddrBindLocalAddrEnt(mib, this);
                        this.natAddrBindGlobalAddrType = new NatAddrBindGlobalAddrTypeEnt(mib, this);
                        this.natAddrBindGlobalAddr = new NatAddrBindGlobalAddrEnt(mib, this);
                        this.natAddrBindId = new NatAddrBindIdEnt(mib, this);
                        this.natAddrBindTranslationEntity = new NatAddrBindTranslationEntityEnt(mib, this);
                        this.natAddrBindType = new NatAddrBindTypeEnt(mib, this);
                        this.natAddrBindMapIndex = new NatAddrBindMapIndexEnt(mib, this);
                        this.natAddrBindSessions = new NatAddrBindSessionsEnt(mib, this);
                        this.natAddrBindMaxIdleTime = new NatAddrBindMaxIdleTimeEnt(mib, this);
                        this.natAddrBindCurrentIdleTime = new NatAddrBindCurrentIdleTimeEnt(mib, this);
                        this.natAddrBindInTranslates = new NatAddrBindInTranslatesEnt(mib, this);
                        this.natAddrBindOutTranslates = new NatAddrBindOutTranslatesEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.natAddrBindLocalAddrType,
                            this.natAddrBindLocalAddr,
                            this.natAddrBindGlobalAddrType,
                            this.natAddrBindGlobalAddr,
                            this.natAddrBindId,
                            this.natAddrBindTranslationEntity,
                            this.natAddrBindType,
                            this.natAddrBindMapIndex,
                            this.natAddrBindSessions,
                            this.natAddrBindMaxIdleTime,
                            this.natAddrBindCurrentIdleTime,
                            this.natAddrBindInTranslates,
                            this.natAddrBindOutTranslates
                        };
                    }
                    public static final class NatAddrBindLocalAddrTypeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrBindLocalAddrTypeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrBindLocalAddrType", "1.3.6.1.2.1.123.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrBindLocalAddrEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrBindLocalAddrEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrBindLocalAddr", "1.3.6.1.2.1.123.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrBindGlobalAddrTypeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrBindGlobalAddrTypeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrBindGlobalAddrType", "1.3.6.1.2.1.123.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrBindGlobalAddrEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrBindGlobalAddrEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrBindGlobalAddr", "1.3.6.1.2.1.123.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrBindIdEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrBindIdEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrBindId", "1.3.6.1.2.1.123.1.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrBindTranslationEntityEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrBindTranslationEntityEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrBindTranslationEntity", "1.3.6.1.2.1.123.1.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrBindTypeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrBindTypeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrBindType", "1.3.6.1.2.1.123.1.6.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrBindMapIndexEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrBindMapIndexEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrBindMapIndex", "1.3.6.1.2.1.123.1.6.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrBindSessionsEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrBindSessionsEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrBindSessions", "1.3.6.1.2.1.123.1.6.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrBindMaxIdleTimeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrBindMaxIdleTimeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrBindMaxIdleTime", "1.3.6.1.2.1.123.1.6.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrBindCurrentIdleTimeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrBindCurrentIdleTimeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrBindCurrentIdleTime", "1.3.6.1.2.1.123.1.6.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrBindInTranslatesEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrBindInTranslatesEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrBindInTranslates", "1.3.6.1.2.1.123.1.6.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrBindOutTranslatesEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrBindOutTranslatesEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrBindOutTranslates", "1.3.6.1.2.1.123.1.6.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class NatAddrPortBindNumberOfEntriesEnt extends MIBEntry<NATMIBDef>
            {
                private NatAddrPortBindNumberOfEntriesEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                {
                    super(mib, parent, "natAddrPortBindNumberOfEntries", "1.3.6.1.2.1.123.1.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NatAddrPortBindTableEnt extends MIBEntry<NATMIBDef>
            {
                public final NatAddrPortBindEntryEnt natAddrPortBindEntry;

                private NatAddrPortBindTableEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                {
                    super(mib, parent, "natAddrPortBindTable", "1.3.6.1.2.1.123.1.8", false, true, false, false);
                    this.natAddrPortBindEntry = new NatAddrPortBindEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.natAddrPortBindEntry
                    };
                }
                public static final class NatAddrPortBindEntryEnt extends MIBEntry<NATMIBDef>
                {
                    public final NatAddrPortBindLocalAddrTypeEnt natAddrPortBindLocalAddrType;

                    public final NatAddrPortBindLocalAddrEnt natAddrPortBindLocalAddr;

                    public final NatAddrPortBindLocalPortEnt natAddrPortBindLocalPort;

                    public final NatAddrPortBindProtocolEnt natAddrPortBindProtocol;

                    public final NatAddrPortBindGlobalAddrTypeEnt natAddrPortBindGlobalAddrType;

                    public final NatAddrPortBindGlobalAddrEnt natAddrPortBindGlobalAddr;

                    public final NatAddrPortBindGlobalPortEnt natAddrPortBindGlobalPort;

                    public final NatAddrPortBindIdEnt natAddrPortBindId;

                    public final NatAddrPortBindTranslationEntityEnt natAddrPortBindTranslationEntity;

                    public final NatAddrPortBindTypeEnt natAddrPortBindType;

                    public final NatAddrPortBindMapIndexEnt natAddrPortBindMapIndex;

                    public final NatAddrPortBindSessionsEnt natAddrPortBindSessions;

                    public final NatAddrPortBindMaxIdleTimeEnt natAddrPortBindMaxIdleTime;

                    public final NatAddrPortBindCurrentIdleTimeEnt natAddrPortBindCurrentIdleTime;

                    public final NatAddrPortBindInTranslatesEnt natAddrPortBindInTranslates;

                    public final NatAddrPortBindOutTranslatesEnt natAddrPortBindOutTranslates;

                    private NatAddrPortBindEntryEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natAddrPortBindEntry", "1.3.6.1.2.1.123.1.8.1", false, false, false, true);
                        this.natAddrPortBindLocalAddrType = new NatAddrPortBindLocalAddrTypeEnt(mib, this);
                        this.natAddrPortBindLocalAddr = new NatAddrPortBindLocalAddrEnt(mib, this);
                        this.natAddrPortBindLocalPort = new NatAddrPortBindLocalPortEnt(mib, this);
                        this.natAddrPortBindProtocol = new NatAddrPortBindProtocolEnt(mib, this);
                        this.natAddrPortBindGlobalAddrType = new NatAddrPortBindGlobalAddrTypeEnt(mib, this);
                        this.natAddrPortBindGlobalAddr = new NatAddrPortBindGlobalAddrEnt(mib, this);
                        this.natAddrPortBindGlobalPort = new NatAddrPortBindGlobalPortEnt(mib, this);
                        this.natAddrPortBindId = new NatAddrPortBindIdEnt(mib, this);
                        this.natAddrPortBindTranslationEntity = new NatAddrPortBindTranslationEntityEnt(mib, this);
                        this.natAddrPortBindType = new NatAddrPortBindTypeEnt(mib, this);
                        this.natAddrPortBindMapIndex = new NatAddrPortBindMapIndexEnt(mib, this);
                        this.natAddrPortBindSessions = new NatAddrPortBindSessionsEnt(mib, this);
                        this.natAddrPortBindMaxIdleTime = new NatAddrPortBindMaxIdleTimeEnt(mib, this);
                        this.natAddrPortBindCurrentIdleTime = new NatAddrPortBindCurrentIdleTimeEnt(mib, this);
                        this.natAddrPortBindInTranslates = new NatAddrPortBindInTranslatesEnt(mib, this);
                        this.natAddrPortBindOutTranslates = new NatAddrPortBindOutTranslatesEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.natAddrPortBindLocalAddrType,
                            this.natAddrPortBindLocalAddr,
                            this.natAddrPortBindLocalPort,
                            this.natAddrPortBindProtocol,
                            this.natAddrPortBindGlobalAddrType,
                            this.natAddrPortBindGlobalAddr,
                            this.natAddrPortBindGlobalPort,
                            this.natAddrPortBindId,
                            this.natAddrPortBindTranslationEntity,
                            this.natAddrPortBindType,
                            this.natAddrPortBindMapIndex,
                            this.natAddrPortBindSessions,
                            this.natAddrPortBindMaxIdleTime,
                            this.natAddrPortBindCurrentIdleTime,
                            this.natAddrPortBindInTranslates,
                            this.natAddrPortBindOutTranslates
                        };
                    }
                    public static final class NatAddrPortBindLocalAddrTypeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrPortBindLocalAddrTypeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrPortBindLocalAddrType", "1.3.6.1.2.1.123.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrPortBindLocalAddrEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrPortBindLocalAddrEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrPortBindLocalAddr", "1.3.6.1.2.1.123.1.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrPortBindLocalPortEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrPortBindLocalPortEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrPortBindLocalPort", "1.3.6.1.2.1.123.1.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrPortBindProtocolEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrPortBindProtocolEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrPortBindProtocol", "1.3.6.1.2.1.123.1.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrPortBindGlobalAddrTypeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrPortBindGlobalAddrTypeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrPortBindGlobalAddrType", "1.3.6.1.2.1.123.1.8.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrPortBindGlobalAddrEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrPortBindGlobalAddrEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrPortBindGlobalAddr", "1.3.6.1.2.1.123.1.8.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrPortBindGlobalPortEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrPortBindGlobalPortEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrPortBindGlobalPort", "1.3.6.1.2.1.123.1.8.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrPortBindIdEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrPortBindIdEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrPortBindId", "1.3.6.1.2.1.123.1.8.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrPortBindTranslationEntityEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrPortBindTranslationEntityEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrPortBindTranslationEntity", "1.3.6.1.2.1.123.1.8.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrPortBindTypeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrPortBindTypeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrPortBindType", "1.3.6.1.2.1.123.1.8.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrPortBindMapIndexEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrPortBindMapIndexEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrPortBindMapIndex", "1.3.6.1.2.1.123.1.8.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrPortBindSessionsEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrPortBindSessionsEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrPortBindSessions", "1.3.6.1.2.1.123.1.8.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrPortBindMaxIdleTimeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrPortBindMaxIdleTimeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrPortBindMaxIdleTime", "1.3.6.1.2.1.123.1.8.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrPortBindCurrentIdleTimeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrPortBindCurrentIdleTimeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrPortBindCurrentIdleTime", "1.3.6.1.2.1.123.1.8.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrPortBindInTranslatesEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrPortBindInTranslatesEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrPortBindInTranslates", "1.3.6.1.2.1.123.1.8.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatAddrPortBindOutTranslatesEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatAddrPortBindOutTranslatesEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natAddrPortBindOutTranslates", "1.3.6.1.2.1.123.1.8.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class NatSessionTableEnt extends MIBEntry<NATMIBDef>
            {
                public final NatSessionEntryEnt natSessionEntry;

                private NatSessionTableEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                {
                    super(mib, parent, "natSessionTable", "1.3.6.1.2.1.123.1.9", false, true, false, false);
                    this.natSessionEntry = new NatSessionEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.natSessionEntry
                    };
                }
                public static final class NatSessionEntryEnt extends MIBEntry<NATMIBDef>
                {
                    public final NatSessionIndexEnt natSessionIndex;

                    public final NatSessionPrivateSrcEPBindIdEnt natSessionPrivateSrcEPBindId;

                    public final NatSessionPrivateSrcEPBindModeEnt natSessionPrivateSrcEPBindMode;

                    public final NatSessionPrivateDstEPBindIdEnt natSessionPrivateDstEPBindId;

                    public final NatSessionPrivateDstEPBindModeEnt natSessionPrivateDstEPBindMode;

                    public final NatSessionDirectionEnt natSessionDirection;

                    public final NatSessionUpTimeEnt natSessionUpTime;

                    public final NatSessionAddrMapIndexEnt natSessionAddrMapIndex;

                    public final NatSessionProtocolTypeEnt natSessionProtocolType;

                    public final NatSessionPrivateAddrTypeEnt natSessionPrivateAddrType;

                    public final NatSessionPrivateSrcAddrEnt natSessionPrivateSrcAddr;

                    public final NatSessionPrivateSrcPortEnt natSessionPrivateSrcPort;

                    public final NatSessionPrivateDstAddrEnt natSessionPrivateDstAddr;

                    public final NatSessionPrivateDstPortEnt natSessionPrivateDstPort;

                    public final NatSessionPublicAddrTypeEnt natSessionPublicAddrType;

                    public final NatSessionPublicSrcAddrEnt natSessionPublicSrcAddr;

                    public final NatSessionPublicSrcPortEnt natSessionPublicSrcPort;

                    public final NatSessionPublicDstAddrEnt natSessionPublicDstAddr;

                    public final NatSessionPublicDstPortEnt natSessionPublicDstPort;

                    public final NatSessionMaxIdleTimeEnt natSessionMaxIdleTime;

                    public final NatSessionCurrentIdleTimeEnt natSessionCurrentIdleTime;

                    public final NatSessionInTranslatesEnt natSessionInTranslates;

                    public final NatSessionOutTranslatesEnt natSessionOutTranslates;

                    private NatSessionEntryEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natSessionEntry", "1.3.6.1.2.1.123.1.9.1", false, false, false, true);
                        this.natSessionIndex = new NatSessionIndexEnt(mib, this);
                        this.natSessionPrivateSrcEPBindId = new NatSessionPrivateSrcEPBindIdEnt(mib, this);
                        this.natSessionPrivateSrcEPBindMode = new NatSessionPrivateSrcEPBindModeEnt(mib, this);
                        this.natSessionPrivateDstEPBindId = new NatSessionPrivateDstEPBindIdEnt(mib, this);
                        this.natSessionPrivateDstEPBindMode = new NatSessionPrivateDstEPBindModeEnt(mib, this);
                        this.natSessionDirection = new NatSessionDirectionEnt(mib, this);
                        this.natSessionUpTime = new NatSessionUpTimeEnt(mib, this);
                        this.natSessionAddrMapIndex = new NatSessionAddrMapIndexEnt(mib, this);
                        this.natSessionProtocolType = new NatSessionProtocolTypeEnt(mib, this);
                        this.natSessionPrivateAddrType = new NatSessionPrivateAddrTypeEnt(mib, this);
                        this.natSessionPrivateSrcAddr = new NatSessionPrivateSrcAddrEnt(mib, this);
                        this.natSessionPrivateSrcPort = new NatSessionPrivateSrcPortEnt(mib, this);
                        this.natSessionPrivateDstAddr = new NatSessionPrivateDstAddrEnt(mib, this);
                        this.natSessionPrivateDstPort = new NatSessionPrivateDstPortEnt(mib, this);
                        this.natSessionPublicAddrType = new NatSessionPublicAddrTypeEnt(mib, this);
                        this.natSessionPublicSrcAddr = new NatSessionPublicSrcAddrEnt(mib, this);
                        this.natSessionPublicSrcPort = new NatSessionPublicSrcPortEnt(mib, this);
                        this.natSessionPublicDstAddr = new NatSessionPublicDstAddrEnt(mib, this);
                        this.natSessionPublicDstPort = new NatSessionPublicDstPortEnt(mib, this);
                        this.natSessionMaxIdleTime = new NatSessionMaxIdleTimeEnt(mib, this);
                        this.natSessionCurrentIdleTime = new NatSessionCurrentIdleTimeEnt(mib, this);
                        this.natSessionInTranslates = new NatSessionInTranslatesEnt(mib, this);
                        this.natSessionOutTranslates = new NatSessionOutTranslatesEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.natSessionIndex,
                            this.natSessionPrivateSrcEPBindId,
                            this.natSessionPrivateSrcEPBindMode,
                            this.natSessionPrivateDstEPBindId,
                            this.natSessionPrivateDstEPBindMode,
                            this.natSessionDirection,
                            this.natSessionUpTime,
                            this.natSessionAddrMapIndex,
                            this.natSessionProtocolType,
                            this.natSessionPrivateAddrType,
                            this.natSessionPrivateSrcAddr,
                            this.natSessionPrivateSrcPort,
                            this.natSessionPrivateDstAddr,
                            this.natSessionPrivateDstPort,
                            this.natSessionPublicAddrType,
                            this.natSessionPublicSrcAddr,
                            this.natSessionPublicSrcPort,
                            this.natSessionPublicDstAddr,
                            this.natSessionPublicDstPort,
                            this.natSessionMaxIdleTime,
                            this.natSessionCurrentIdleTime,
                            this.natSessionInTranslates,
                            this.natSessionOutTranslates
                        };
                    }
                    public static final class NatSessionIndexEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionIndexEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionIndex", "1.3.6.1.2.1.123.1.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionPrivateSrcEPBindIdEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionPrivateSrcEPBindIdEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionPrivateSrcEPBindId", "1.3.6.1.2.1.123.1.9.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionPrivateSrcEPBindModeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionPrivateSrcEPBindModeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionPrivateSrcEPBindMode", "1.3.6.1.2.1.123.1.9.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionPrivateDstEPBindIdEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionPrivateDstEPBindIdEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionPrivateDstEPBindId", "1.3.6.1.2.1.123.1.9.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionPrivateDstEPBindModeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionPrivateDstEPBindModeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionPrivateDstEPBindMode", "1.3.6.1.2.1.123.1.9.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionDirectionEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionDirectionEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionDirection", "1.3.6.1.2.1.123.1.9.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionUpTimeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionUpTimeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionUpTime", "1.3.6.1.2.1.123.1.9.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionAddrMapIndexEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionAddrMapIndexEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionAddrMapIndex", "1.3.6.1.2.1.123.1.9.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionProtocolTypeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionProtocolTypeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionProtocolType", "1.3.6.1.2.1.123.1.9.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionPrivateAddrTypeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionPrivateAddrTypeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionPrivateAddrType", "1.3.6.1.2.1.123.1.9.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionPrivateSrcAddrEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionPrivateSrcAddrEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionPrivateSrcAddr", "1.3.6.1.2.1.123.1.9.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionPrivateSrcPortEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionPrivateSrcPortEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionPrivateSrcPort", "1.3.6.1.2.1.123.1.9.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionPrivateDstAddrEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionPrivateDstAddrEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionPrivateDstAddr", "1.3.6.1.2.1.123.1.9.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionPrivateDstPortEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionPrivateDstPortEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionPrivateDstPort", "1.3.6.1.2.1.123.1.9.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionPublicAddrTypeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionPublicAddrTypeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionPublicAddrType", "1.3.6.1.2.1.123.1.9.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionPublicSrcAddrEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionPublicSrcAddrEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionPublicSrcAddr", "1.3.6.1.2.1.123.1.9.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionPublicSrcPortEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionPublicSrcPortEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionPublicSrcPort", "1.3.6.1.2.1.123.1.9.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionPublicDstAddrEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionPublicDstAddrEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionPublicDstAddr", "1.3.6.1.2.1.123.1.9.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionPublicDstPortEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionPublicDstPortEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionPublicDstPort", "1.3.6.1.2.1.123.1.9.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionMaxIdleTimeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionMaxIdleTimeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionMaxIdleTime", "1.3.6.1.2.1.123.1.9.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionCurrentIdleTimeEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionCurrentIdleTimeEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionCurrentIdleTime", "1.3.6.1.2.1.123.1.9.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionInTranslatesEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionInTranslatesEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionInTranslates", "1.3.6.1.2.1.123.1.9.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatSessionOutTranslatesEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatSessionOutTranslatesEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natSessionOutTranslates", "1.3.6.1.2.1.123.1.9.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class NatProtocolTableEnt extends MIBEntry<NATMIBDef>
            {
                public final NatProtocolEntryEnt natProtocolEntry;

                private NatProtocolTableEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                {
                    super(mib, parent, "natProtocolTable", "1.3.6.1.2.1.123.1.10", false, true, false, false);
                    this.natProtocolEntry = new NatProtocolEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.natProtocolEntry
                    };
                }
                public static final class NatProtocolEntryEnt extends MIBEntry<NATMIBDef>
                {
                    public final NatProtocolEnt natProtocol;

                    public final NatProtocolInTranslatesEnt natProtocolInTranslates;

                    public final NatProtocolOutTranslatesEnt natProtocolOutTranslates;

                    public final NatProtocolDiscardsEnt natProtocolDiscards;

                    private NatProtocolEntryEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natProtocolEntry", "1.3.6.1.2.1.123.1.10.1", false, false, false, true);
                        this.natProtocol = new NatProtocolEnt(mib, this);
                        this.natProtocolInTranslates = new NatProtocolInTranslatesEnt(mib, this);
                        this.natProtocolOutTranslates = new NatProtocolOutTranslatesEnt(mib, this);
                        this.natProtocolDiscards = new NatProtocolDiscardsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.natProtocol,
                            this.natProtocolInTranslates,
                            this.natProtocolOutTranslates,
                            this.natProtocolDiscards
                        };
                    }
                    public static final class NatProtocolEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatProtocolEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natProtocol", "1.3.6.1.2.1.123.1.10.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatProtocolInTranslatesEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatProtocolInTranslatesEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natProtocolInTranslates", "1.3.6.1.2.1.123.1.10.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatProtocolOutTranslatesEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatProtocolOutTranslatesEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natProtocolOutTranslates", "1.3.6.1.2.1.123.1.10.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class NatProtocolDiscardsEnt extends MIBEntry<NATMIBDef>
                    {
                        private NatProtocolDiscardsEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                        {
                            super(mib, parent, "natProtocolDiscards", "1.3.6.1.2.1.123.1.10.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class NatMIBNotificationsEnt extends MIBEntry<NATMIBDef>
        {
            /** Notifications*/
            public final NatPacketDiscardEnt natPacketDiscard;

            private NatMIBNotificationsEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
            {
                super(mib, parent, "natMIBNotifications", "1.3.6.1.2.1.123.0", false, false, false, false);
                this.natPacketDiscard = new NatPacketDiscardEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.natPacketDiscard
                };
            }
            public static final class NatPacketDiscardEnt extends MIBEntry<NATMIBDef>
            {
                private NatPacketDiscardEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                {
                    super(mib, parent, "natPacketDiscard", "1.3.6.1.2.1.123.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class NatMIBConformanceEnt extends MIBEntry<NATMIBDef>
        {
            public final NatMIBGroupsEnt natMIBGroups;

            public final NatMIBCompliancesEnt natMIBCompliances;

            private NatMIBConformanceEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
            {
                super(mib, parent, "natMIBConformance", "1.3.6.1.2.1.123.2", false, false, false, false);
                this.natMIBGroups = new NatMIBGroupsEnt(mib, this);
                this.natMIBCompliances = new NatMIBCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.natMIBGroups,
                    this.natMIBCompliances
                };
            }
            public static final class NatMIBGroupsEnt extends MIBEntry<NATMIBDef>
            {
                /** Units of conformance*/
                public final NatConfigGroupEnt natConfigGroup;

                public final NatTranslationGroupEnt natTranslationGroup;

                public final NatStatsInterfaceGroupEnt natStatsInterfaceGroup;

                public final NatStatsProtocolGroupEnt natStatsProtocolGroup;

                public final NatStatsAddrMapGroupEnt natStatsAddrMapGroup;

                public final NatMIBNotificationGroupEnt natMIBNotificationGroup;

                private NatMIBGroupsEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                {
                    super(mib, parent, "natMIBGroups", "1.3.6.1.2.1.123.2.1", false, false, false, false);
                    this.natConfigGroup = new NatConfigGroupEnt(mib, this);
                    this.natTranslationGroup = new NatTranslationGroupEnt(mib, this);
                    this.natStatsInterfaceGroup = new NatStatsInterfaceGroupEnt(mib, this);
                    this.natStatsProtocolGroup = new NatStatsProtocolGroupEnt(mib, this);
                    this.natStatsAddrMapGroup = new NatStatsAddrMapGroupEnt(mib, this);
                    this.natMIBNotificationGroup = new NatMIBNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.natConfigGroup,
                        this.natTranslationGroup,
                        this.natStatsInterfaceGroup,
                        this.natStatsProtocolGroup,
                        this.natStatsAddrMapGroup,
                        this.natMIBNotificationGroup
                    };
                }
                public static final class NatConfigGroupEnt extends MIBEntry<NATMIBDef>
                {
                    private NatConfigGroupEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natConfigGroup", "1.3.6.1.2.1.123.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NatTranslationGroupEnt extends MIBEntry<NATMIBDef>
                {
                    private NatTranslationGroupEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natTranslationGroup", "1.3.6.1.2.1.123.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NatStatsInterfaceGroupEnt extends MIBEntry<NATMIBDef>
                {
                    private NatStatsInterfaceGroupEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natStatsInterfaceGroup", "1.3.6.1.2.1.123.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NatStatsProtocolGroupEnt extends MIBEntry<NATMIBDef>
                {
                    private NatStatsProtocolGroupEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natStatsProtocolGroup", "1.3.6.1.2.1.123.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NatStatsAddrMapGroupEnt extends MIBEntry<NATMIBDef>
                {
                    private NatStatsAddrMapGroupEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natStatsAddrMapGroup", "1.3.6.1.2.1.123.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NatMIBNotificationGroupEnt extends MIBEntry<NATMIBDef>
                {
                    private NatMIBNotificationGroupEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natMIBNotificationGroup", "1.3.6.1.2.1.123.2.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class NatMIBCompliancesEnt extends MIBEntry<NATMIBDef>
            {
                /** Compliance statements

The interfaces MIB, RFC2863*/
                public final NatMIBFullComplianceEnt natMIBFullCompliance;

                /** The interfaces MIB, RFC2863*/
                public final NatMIBReadOnlyComplianceEnt natMIBReadOnlyCompliance;

                private NatMIBCompliancesEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                {
                    super(mib, parent, "natMIBCompliances", "1.3.6.1.2.1.123.2.2", false, false, false, false);
                    this.natMIBFullCompliance = new NatMIBFullComplianceEnt(mib, this);
                    this.natMIBReadOnlyCompliance = new NatMIBReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.natMIBFullCompliance,
                        this.natMIBReadOnlyCompliance
                    };
                }
                public static final class NatMIBFullComplianceEnt extends MIBEntry<NATMIBDef>
                {
                    private NatMIBFullComplianceEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natMIBFullCompliance", "1.3.6.1.2.1.123.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NatMIBReadOnlyComplianceEnt extends MIBEntry<NATMIBDef>
                {
                    private NatMIBReadOnlyComplianceEnt(NATMIBDef mib, MIBEntry<NATMIBDef> parent)
                    {
                        super(mib, parent, "natMIBReadOnlyCompliance", "1.3.6.1.2.1.123.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
