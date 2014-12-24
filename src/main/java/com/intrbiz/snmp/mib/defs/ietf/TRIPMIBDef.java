package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2579]
[RFC2580]
[RFC3291]
[RFC2788]*/
public final class TRIPMIBDef extends MIB
{
    public static final TRIPMIBDef TRIPMIB = new TRIPMIBDef();

    /** [RFC3872]

Sep 02, 2004*/
    public final TripMIBEnt tripMIB;

    private TRIPMIBDef()
    {
        super("TRIP-MIB");
        this.tripMIB = new TripMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.tripMIB
        };
    }

    public static final class TripMIBEnt extends MIBEntry<TRIPMIBDef>
    {
        public final TripMIBNotificationsEnt tripMIBNotifications;

        public final TripMIBObjectsEnt tripMIBObjects;

        public final TripMIBConformanceEnt tripMIBConformance;

        public final TripMIBNotifObjectsEnt tripMIBNotifObjects;

        private TripMIBEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
        {
            super(mib, parent, "tripMIB", "1.3.6.1.2.1.116", false, false, false, false);
            this.tripMIBNotifications = new TripMIBNotificationsEnt(mib, this);
            this.tripMIBObjects = new TripMIBObjectsEnt(mib, this);
            this.tripMIBConformance = new TripMIBConformanceEnt(mib, this);
            this.tripMIBNotifObjects = new TripMIBNotifObjectsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.tripMIBNotifications,
                this.tripMIBObjects,
                this.tripMIBConformance,
                this.tripMIBNotifObjects
            };
        }
        public static final class TripMIBNotificationsEnt extends MIBEntry<TRIPMIBDef>
        {
            /** Notifications*/
            public final TripConnectionEstablishedEnt tripConnectionEstablished;

            public final TripConnectionDroppedEnt tripConnectionDropped;

            public final TripFSMEnt tripFSM;

            public final TripOpenMessageErrorEnt tripOpenMessageError;

            public final TripUpdateMessageErrorEnt tripUpdateMessageError;

            public final TripHoldTimerExpiredEnt tripHoldTimerExpired;

            public final TripConnectionCollisionEnt tripConnectionCollision;

            public final TripCeaseEnt tripCease;

            public final TripNotificationErrEnt tripNotificationErr;

            private TripMIBNotificationsEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
            {
                super(mib, parent, "tripMIBNotifications", "1.3.6.1.2.1.116.0", false, false, false, false);
                this.tripConnectionEstablished = new TripConnectionEstablishedEnt(mib, this);
                this.tripConnectionDropped = new TripConnectionDroppedEnt(mib, this);
                this.tripFSM = new TripFSMEnt(mib, this);
                this.tripOpenMessageError = new TripOpenMessageErrorEnt(mib, this);
                this.tripUpdateMessageError = new TripUpdateMessageErrorEnt(mib, this);
                this.tripHoldTimerExpired = new TripHoldTimerExpiredEnt(mib, this);
                this.tripConnectionCollision = new TripConnectionCollisionEnt(mib, this);
                this.tripCease = new TripCeaseEnt(mib, this);
                this.tripNotificationErr = new TripNotificationErrEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tripConnectionEstablished,
                    this.tripConnectionDropped,
                    this.tripFSM,
                    this.tripOpenMessageError,
                    this.tripUpdateMessageError,
                    this.tripHoldTimerExpired,
                    this.tripConnectionCollision,
                    this.tripCease,
                    this.tripNotificationErr
                };
            }
            public static final class TripConnectionEstablishedEnt extends MIBEntry<TRIPMIBDef>
            {
                private TripConnectionEstablishedEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripConnectionEstablished", "1.3.6.1.2.1.116.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TripConnectionDroppedEnt extends MIBEntry<TRIPMIBDef>
            {
                private TripConnectionDroppedEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripConnectionDropped", "1.3.6.1.2.1.116.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TripFSMEnt extends MIBEntry<TRIPMIBDef>
            {
                private TripFSMEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripFSM", "1.3.6.1.2.1.116.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TripOpenMessageErrorEnt extends MIBEntry<TRIPMIBDef>
            {
                private TripOpenMessageErrorEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripOpenMessageError", "1.3.6.1.2.1.116.0.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TripUpdateMessageErrorEnt extends MIBEntry<TRIPMIBDef>
            {
                private TripUpdateMessageErrorEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripUpdateMessageError", "1.3.6.1.2.1.116.0.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TripHoldTimerExpiredEnt extends MIBEntry<TRIPMIBDef>
            {
                private TripHoldTimerExpiredEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripHoldTimerExpired", "1.3.6.1.2.1.116.0.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TripConnectionCollisionEnt extends MIBEntry<TRIPMIBDef>
            {
                private TripConnectionCollisionEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripConnectionCollision", "1.3.6.1.2.1.116.0.7", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TripCeaseEnt extends MIBEntry<TRIPMIBDef>
            {
                private TripCeaseEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripCease", "1.3.6.1.2.1.116.0.8", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TripNotificationErrEnt extends MIBEntry<TRIPMIBDef>
            {
                private TripNotificationErrEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripNotificationErr", "1.3.6.1.2.1.116.0.9", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class TripMIBObjectsEnt extends MIBEntry<TRIPMIBDef>
        {
            /** tripCfgTable*/
            public final TripCfgTableEnt tripCfgTable;

            /** TripRouteTypeTable*/
            public final TripRouteTypeTableEnt tripRouteTypeTable;

            /** tripSupportedCommunityTable*/
            public final TripSupportedCommunityTableEnt tripSupportedCommunityTable;

            /** TripPeerTable*/
            public final TripPeerTableEnt tripPeerTable;

            /** TripPeerStatisticsTable*/
            public final TripPeerStatisticsTableEnt tripPeerStatisticsTable;

            /** TRIP Received Route Table.  This table containsall routes from all sources. Each entry consistsof a route and its associated path attributes.*/
            public final TripRouteTableEnt tripRouteTable;

            /** TRIP Received Route Community Table.*/
            public final TripRouteCommunityTableEnt tripRouteCommunityTable;

            /** tripItadTopologyTable*/
            public final TripItadTopologyTableEnt tripItadTopologyTable;

            /** tripItadTopologyIdTable*/
            public final TripItadTopologyIdTableEnt tripItadTopologyIdTable;

            private TripMIBObjectsEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
            {
                super(mib, parent, "tripMIBObjects", "1.3.6.1.2.1.116.1", false, false, false, false);
                this.tripCfgTable = new TripCfgTableEnt(mib, this);
                this.tripRouteTypeTable = new TripRouteTypeTableEnt(mib, this);
                this.tripSupportedCommunityTable = new TripSupportedCommunityTableEnt(mib, this);
                this.tripPeerTable = new TripPeerTableEnt(mib, this);
                this.tripPeerStatisticsTable = new TripPeerStatisticsTableEnt(mib, this);
                this.tripRouteTable = new TripRouteTableEnt(mib, this);
                this.tripRouteCommunityTable = new TripRouteCommunityTableEnt(mib, this);
                this.tripItadTopologyTable = new TripItadTopologyTableEnt(mib, this);
                this.tripItadTopologyIdTable = new TripItadTopologyIdTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tripCfgTable,
                    this.tripRouteTypeTable,
                    this.tripSupportedCommunityTable,
                    this.tripPeerTable,
                    this.tripPeerStatisticsTable,
                    this.tripRouteTable,
                    this.tripRouteCommunityTable,
                    this.tripItadTopologyTable,
                    this.tripItadTopologyIdTable
                };
            }
            public static final class TripCfgTableEnt extends MIBEntry<TRIPMIBDef>
            {
                public final TripCfgEntryEnt tripCfgEntry;

                private TripCfgTableEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripCfgTable", "1.3.6.1.2.1.116.1.1", false, true, false, false);
                    this.tripCfgEntry = new TripCfgEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tripCfgEntry
                    };
                }
                public static final class TripCfgEntryEnt extends MIBEntry<TRIPMIBDef>
                {
                    public final TripCfgProtocolVersionEnt tripCfgProtocolVersion;

                    public final TripCfgItadEnt tripCfgItad;

                    public final TripCfgIdentifierEnt tripCfgIdentifier;

                    public final TripCfgAdminStatusEnt tripCfgAdminStatus;

                    public final TripCfgOperStatusEnt tripCfgOperStatus;

                    public final TripCfgAddrIAddrTypeEnt tripCfgAddrIAddrType;

                    public final TripCfgAddrEnt tripCfgAddr;

                    public final TripCfgPortEnt tripCfgPort;

                    public final TripCfgMinItadOriginationIntervalEnt tripCfgMinItadOriginationInterval;

                    public final TripCfgMinRouteAdvertisementIntervalEnt tripCfgMinRouteAdvertisementInterval;

                    public final TripCfgMaxPurgeTimeEnt tripCfgMaxPurgeTime;

                    public final TripCfgDisableTimeEnt tripCfgDisableTime;

                    public final TripCfgSendReceiveModeEnt tripCfgSendReceiveMode;

                    public final TripCfgStorageEnt tripCfgStorage;

                    private TripCfgEntryEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripCfgEntry", "1.3.6.1.2.1.116.1.1.1", false, false, false, true);
                        this.tripCfgProtocolVersion = new TripCfgProtocolVersionEnt(mib, this);
                        this.tripCfgItad = new TripCfgItadEnt(mib, this);
                        this.tripCfgIdentifier = new TripCfgIdentifierEnt(mib, this);
                        this.tripCfgAdminStatus = new TripCfgAdminStatusEnt(mib, this);
                        this.tripCfgOperStatus = new TripCfgOperStatusEnt(mib, this);
                        this.tripCfgAddrIAddrType = new TripCfgAddrIAddrTypeEnt(mib, this);
                        this.tripCfgAddr = new TripCfgAddrEnt(mib, this);
                        this.tripCfgPort = new TripCfgPortEnt(mib, this);
                        this.tripCfgMinItadOriginationInterval = new TripCfgMinItadOriginationIntervalEnt(mib, this);
                        this.tripCfgMinRouteAdvertisementInterval = new TripCfgMinRouteAdvertisementIntervalEnt(mib, this);
                        this.tripCfgMaxPurgeTime = new TripCfgMaxPurgeTimeEnt(mib, this);
                        this.tripCfgDisableTime = new TripCfgDisableTimeEnt(mib, this);
                        this.tripCfgSendReceiveMode = new TripCfgSendReceiveModeEnt(mib, this);
                        this.tripCfgStorage = new TripCfgStorageEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tripCfgProtocolVersion,
                            this.tripCfgItad,
                            this.tripCfgIdentifier,
                            this.tripCfgAdminStatus,
                            this.tripCfgOperStatus,
                            this.tripCfgAddrIAddrType,
                            this.tripCfgAddr,
                            this.tripCfgPort,
                            this.tripCfgMinItadOriginationInterval,
                            this.tripCfgMinRouteAdvertisementInterval,
                            this.tripCfgMaxPurgeTime,
                            this.tripCfgDisableTime,
                            this.tripCfgSendReceiveMode,
                            this.tripCfgStorage
                        };
                    }
                    public static final class TripCfgProtocolVersionEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripCfgProtocolVersionEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripCfgProtocolVersion", "1.3.6.1.2.1.116.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripCfgItadEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripCfgItadEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripCfgItad", "1.3.6.1.2.1.116.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripCfgIdentifierEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripCfgIdentifierEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripCfgIdentifier", "1.3.6.1.2.1.116.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripCfgAdminStatusEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripCfgAdminStatusEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripCfgAdminStatus", "1.3.6.1.2.1.116.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripCfgOperStatusEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripCfgOperStatusEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripCfgOperStatus", "1.3.6.1.2.1.116.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripCfgAddrIAddrTypeEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripCfgAddrIAddrTypeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripCfgAddrIAddrType", "1.3.6.1.2.1.116.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripCfgAddrEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripCfgAddrEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripCfgAddr", "1.3.6.1.2.1.116.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripCfgPortEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripCfgPortEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripCfgPort", "1.3.6.1.2.1.116.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripCfgMinItadOriginationIntervalEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripCfgMinItadOriginationIntervalEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripCfgMinItadOriginationInterval", "1.3.6.1.2.1.116.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripCfgMinRouteAdvertisementIntervalEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripCfgMinRouteAdvertisementIntervalEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripCfgMinRouteAdvertisementInterval", "1.3.6.1.2.1.116.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripCfgMaxPurgeTimeEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripCfgMaxPurgeTimeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripCfgMaxPurgeTime", "1.3.6.1.2.1.116.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripCfgDisableTimeEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripCfgDisableTimeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripCfgDisableTime", "1.3.6.1.2.1.116.1.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripCfgSendReceiveModeEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripCfgSendReceiveModeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripCfgSendReceiveMode", "1.3.6.1.2.1.116.1.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripCfgStorageEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripCfgStorageEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripCfgStorage", "1.3.6.1.2.1.116.1.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class TripRouteTypeTableEnt extends MIBEntry<TRIPMIBDef>
            {
                public final TripRouteTypeEntryEnt tripRouteTypeEntry;

                private TripRouteTypeTableEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripRouteTypeTable", "1.3.6.1.2.1.116.1.2", false, true, false, false);
                    this.tripRouteTypeEntry = new TripRouteTypeEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tripRouteTypeEntry
                    };
                }
                public static final class TripRouteTypeEntryEnt extends MIBEntry<TRIPMIBDef>
                {
                    public final TripRouteTypeAddrInetTypeEnt tripRouteTypeAddrInetType;

                    public final TripRouteTypeAddrEnt tripRouteTypeAddr;

                    public final TripRouteTypePortEnt tripRouteTypePort;

                    public final TripRouteTypeProtocolIdEnt tripRouteTypeProtocolId;

                    public final TripRouteTypeAddrFamilyIdEnt tripRouteTypeAddrFamilyId;

                    public final TripRouteTypePeerEnt tripRouteTypePeer;

                    private TripRouteTypeEntryEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripRouteTypeEntry", "1.3.6.1.2.1.116.1.2.1", false, false, false, true);
                        this.tripRouteTypeAddrInetType = new TripRouteTypeAddrInetTypeEnt(mib, this);
                        this.tripRouteTypeAddr = new TripRouteTypeAddrEnt(mib, this);
                        this.tripRouteTypePort = new TripRouteTypePortEnt(mib, this);
                        this.tripRouteTypeProtocolId = new TripRouteTypeProtocolIdEnt(mib, this);
                        this.tripRouteTypeAddrFamilyId = new TripRouteTypeAddrFamilyIdEnt(mib, this);
                        this.tripRouteTypePeer = new TripRouteTypePeerEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tripRouteTypeAddrInetType,
                            this.tripRouteTypeAddr,
                            this.tripRouteTypePort,
                            this.tripRouteTypeProtocolId,
                            this.tripRouteTypeAddrFamilyId,
                            this.tripRouteTypePeer
                        };
                    }
                    public static final class TripRouteTypeAddrInetTypeEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteTypeAddrInetTypeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteTypeAddrInetType", "1.3.6.1.2.1.116.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteTypeAddrEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteTypeAddrEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteTypeAddr", "1.3.6.1.2.1.116.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteTypePortEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteTypePortEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteTypePort", "1.3.6.1.2.1.116.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteTypeProtocolIdEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteTypeProtocolIdEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteTypeProtocolId", "1.3.6.1.2.1.116.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteTypeAddrFamilyIdEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteTypeAddrFamilyIdEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteTypeAddrFamilyId", "1.3.6.1.2.1.116.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteTypePeerEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteTypePeerEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteTypePeer", "1.3.6.1.2.1.116.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class TripSupportedCommunityTableEnt extends MIBEntry<TRIPMIBDef>
            {
                public final TripSupportedCommunityEntryEnt tripSupportedCommunityEntry;

                private TripSupportedCommunityTableEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripSupportedCommunityTable", "1.3.6.1.2.1.116.1.3", false, true, false, false);
                    this.tripSupportedCommunityEntry = new TripSupportedCommunityEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tripSupportedCommunityEntry
                    };
                }
                public static final class TripSupportedCommunityEntryEnt extends MIBEntry<TRIPMIBDef>
                {
                    public final TripSupportedCommunityIdEnt tripSupportedCommunityId;

                    public final TripSupportedCommunityItadEnt tripSupportedCommunityItad;

                    public final TripSupportedCommunityStorageEnt tripSupportedCommunityStorage;

                    public final TripSupportedCommunityRowStatusEnt tripSupportedCommunityRowStatus;

                    private TripSupportedCommunityEntryEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripSupportedCommunityEntry", "1.3.6.1.2.1.116.1.3.1", false, false, false, true);
                        this.tripSupportedCommunityId = new TripSupportedCommunityIdEnt(mib, this);
                        this.tripSupportedCommunityItad = new TripSupportedCommunityItadEnt(mib, this);
                        this.tripSupportedCommunityStorage = new TripSupportedCommunityStorageEnt(mib, this);
                        this.tripSupportedCommunityRowStatus = new TripSupportedCommunityRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tripSupportedCommunityId,
                            this.tripSupportedCommunityItad,
                            this.tripSupportedCommunityStorage,
                            this.tripSupportedCommunityRowStatus
                        };
                    }
                    public static final class TripSupportedCommunityIdEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripSupportedCommunityIdEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripSupportedCommunityId", "1.3.6.1.2.1.116.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripSupportedCommunityItadEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripSupportedCommunityItadEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripSupportedCommunityItad", "1.3.6.1.2.1.116.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripSupportedCommunityStorageEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripSupportedCommunityStorageEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripSupportedCommunityStorage", "1.3.6.1.2.1.116.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripSupportedCommunityRowStatusEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripSupportedCommunityRowStatusEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripSupportedCommunityRowStatus", "1.3.6.1.2.1.116.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class TripPeerTableEnt extends MIBEntry<TRIPMIBDef>
            {
                public final TripPeerEntryEnt tripPeerEntry;

                private TripPeerTableEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripPeerTable", "1.3.6.1.2.1.116.1.4", false, true, false, false);
                    this.tripPeerEntry = new TripPeerEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tripPeerEntry
                    };
                }
                public static final class TripPeerEntryEnt extends MIBEntry<TRIPMIBDef>
                {
                    public final TripPeerRemoteAddrInetTypeEnt tripPeerRemoteAddrInetType;

                    public final TripPeerRemoteAddrEnt tripPeerRemoteAddr;

                    public final TripPeerRemotePortEnt tripPeerRemotePort;

                    public final TripPeerIdentifierEnt tripPeerIdentifier;

                    public final TripPeerStateEnt tripPeerState;

                    public final TripPeerAdminStatusEnt tripPeerAdminStatus;

                    public final TripPeerNegotiatedVersionEnt tripPeerNegotiatedVersion;

                    public final TripPeerSendReceiveModeEnt tripPeerSendReceiveMode;

                    public final TripPeerRemoteItadEnt tripPeerRemoteItad;

                    public final TripPeerConnectRetryIntervalEnt tripPeerConnectRetryInterval;

                    public final TripPeerMaxRetryIntervalEnt tripPeerMaxRetryInterval;

                    public final TripPeerHoldTimeEnt tripPeerHoldTime;

                    public final TripPeerKeepAliveEnt tripPeerKeepAlive;

                    public final TripPeerHoldTimeConfiguredEnt tripPeerHoldTimeConfigured;

                    public final TripPeerKeepAliveConfiguredEnt tripPeerKeepAliveConfigured;

                    public final TripPeerMaxPurgeTimeEnt tripPeerMaxPurgeTime;

                    public final TripPeerDisableTimeEnt tripPeerDisableTime;

                    public final TripPeerLearnedEnt tripPeerLearned;

                    public final TripPeerStorageEnt tripPeerStorage;

                    public final TripPeerRowStatusEnt tripPeerRowStatus;

                    private TripPeerEntryEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripPeerEntry", "1.3.6.1.2.1.116.1.4.1", false, false, false, true);
                        this.tripPeerRemoteAddrInetType = new TripPeerRemoteAddrInetTypeEnt(mib, this);
                        this.tripPeerRemoteAddr = new TripPeerRemoteAddrEnt(mib, this);
                        this.tripPeerRemotePort = new TripPeerRemotePortEnt(mib, this);
                        this.tripPeerIdentifier = new TripPeerIdentifierEnt(mib, this);
                        this.tripPeerState = new TripPeerStateEnt(mib, this);
                        this.tripPeerAdminStatus = new TripPeerAdminStatusEnt(mib, this);
                        this.tripPeerNegotiatedVersion = new TripPeerNegotiatedVersionEnt(mib, this);
                        this.tripPeerSendReceiveMode = new TripPeerSendReceiveModeEnt(mib, this);
                        this.tripPeerRemoteItad = new TripPeerRemoteItadEnt(mib, this);
                        this.tripPeerConnectRetryInterval = new TripPeerConnectRetryIntervalEnt(mib, this);
                        this.tripPeerMaxRetryInterval = new TripPeerMaxRetryIntervalEnt(mib, this);
                        this.tripPeerHoldTime = new TripPeerHoldTimeEnt(mib, this);
                        this.tripPeerKeepAlive = new TripPeerKeepAliveEnt(mib, this);
                        this.tripPeerHoldTimeConfigured = new TripPeerHoldTimeConfiguredEnt(mib, this);
                        this.tripPeerKeepAliveConfigured = new TripPeerKeepAliveConfiguredEnt(mib, this);
                        this.tripPeerMaxPurgeTime = new TripPeerMaxPurgeTimeEnt(mib, this);
                        this.tripPeerDisableTime = new TripPeerDisableTimeEnt(mib, this);
                        this.tripPeerLearned = new TripPeerLearnedEnt(mib, this);
                        this.tripPeerStorage = new TripPeerStorageEnt(mib, this);
                        this.tripPeerRowStatus = new TripPeerRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tripPeerRemoteAddrInetType,
                            this.tripPeerRemoteAddr,
                            this.tripPeerRemotePort,
                            this.tripPeerIdentifier,
                            this.tripPeerState,
                            this.tripPeerAdminStatus,
                            this.tripPeerNegotiatedVersion,
                            this.tripPeerSendReceiveMode,
                            this.tripPeerRemoteItad,
                            this.tripPeerConnectRetryInterval,
                            this.tripPeerMaxRetryInterval,
                            this.tripPeerHoldTime,
                            this.tripPeerKeepAlive,
                            this.tripPeerHoldTimeConfigured,
                            this.tripPeerKeepAliveConfigured,
                            this.tripPeerMaxPurgeTime,
                            this.tripPeerDisableTime,
                            this.tripPeerLearned,
                            this.tripPeerStorage,
                            this.tripPeerRowStatus
                        };
                    }
                    public static final class TripPeerRemoteAddrInetTypeEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerRemoteAddrInetTypeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerRemoteAddrInetType", "1.3.6.1.2.1.116.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerRemoteAddrEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerRemoteAddrEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerRemoteAddr", "1.3.6.1.2.1.116.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerRemotePortEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerRemotePortEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerRemotePort", "1.3.6.1.2.1.116.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerIdentifierEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerIdentifierEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerIdentifier", "1.3.6.1.2.1.116.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerStateEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerStateEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerState", "1.3.6.1.2.1.116.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerAdminStatusEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerAdminStatusEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerAdminStatus", "1.3.6.1.2.1.116.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerNegotiatedVersionEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerNegotiatedVersionEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerNegotiatedVersion", "1.3.6.1.2.1.116.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerSendReceiveModeEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerSendReceiveModeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerSendReceiveMode", "1.3.6.1.2.1.116.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerRemoteItadEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerRemoteItadEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerRemoteItad", "1.3.6.1.2.1.116.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerConnectRetryIntervalEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerConnectRetryIntervalEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerConnectRetryInterval", "1.3.6.1.2.1.116.1.4.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerMaxRetryIntervalEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerMaxRetryIntervalEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerMaxRetryInterval", "1.3.6.1.2.1.116.1.4.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerHoldTimeEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerHoldTimeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerHoldTime", "1.3.6.1.2.1.116.1.4.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerKeepAliveEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerKeepAliveEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerKeepAlive", "1.3.6.1.2.1.116.1.4.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerHoldTimeConfiguredEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerHoldTimeConfiguredEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerHoldTimeConfigured", "1.3.6.1.2.1.116.1.4.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerKeepAliveConfiguredEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerKeepAliveConfiguredEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerKeepAliveConfigured", "1.3.6.1.2.1.116.1.4.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerMaxPurgeTimeEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerMaxPurgeTimeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerMaxPurgeTime", "1.3.6.1.2.1.116.1.4.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerDisableTimeEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerDisableTimeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerDisableTime", "1.3.6.1.2.1.116.1.4.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerLearnedEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerLearnedEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerLearned", "1.3.6.1.2.1.116.1.4.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerStorageEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerStorageEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerStorage", "1.3.6.1.2.1.116.1.4.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerRowStatusEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerRowStatusEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerRowStatus", "1.3.6.1.2.1.116.1.4.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class TripPeerStatisticsTableEnt extends MIBEntry<TRIPMIBDef>
            {
                public final TripPeerStatisticsEntryEnt tripPeerStatisticsEntry;

                private TripPeerStatisticsTableEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripPeerStatisticsTable", "1.3.6.1.2.1.116.1.5", false, true, false, false);
                    this.tripPeerStatisticsEntry = new TripPeerStatisticsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tripPeerStatisticsEntry
                    };
                }
                public static final class TripPeerStatisticsEntryEnt extends MIBEntry<TRIPMIBDef>
                {
                    public final TripPeerInUpdatesEnt tripPeerInUpdates;

                    public final TripPeerOutUpdatesEnt tripPeerOutUpdates;

                    public final TripPeerInTotalMessagesEnt tripPeerInTotalMessages;

                    public final TripPeerOutTotalMessagesEnt tripPeerOutTotalMessages;

                    public final TripPeerFsmEstablishedTransitionsEnt tripPeerFsmEstablishedTransitions;

                    public final TripPeerFsmEstablishedTimeEnt tripPeerFsmEstablishedTime;

                    public final TripPeerInUpdateElapsedTimeEnt tripPeerInUpdateElapsedTime;

                    public final TripPeerStateChangeTimeEnt tripPeerStateChangeTime;

                    private TripPeerStatisticsEntryEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripPeerStatisticsEntry", "1.3.6.1.2.1.116.1.5.1", false, false, false, true);
                        this.tripPeerInUpdates = new TripPeerInUpdatesEnt(mib, this);
                        this.tripPeerOutUpdates = new TripPeerOutUpdatesEnt(mib, this);
                        this.tripPeerInTotalMessages = new TripPeerInTotalMessagesEnt(mib, this);
                        this.tripPeerOutTotalMessages = new TripPeerOutTotalMessagesEnt(mib, this);
                        this.tripPeerFsmEstablishedTransitions = new TripPeerFsmEstablishedTransitionsEnt(mib, this);
                        this.tripPeerFsmEstablishedTime = new TripPeerFsmEstablishedTimeEnt(mib, this);
                        this.tripPeerInUpdateElapsedTime = new TripPeerInUpdateElapsedTimeEnt(mib, this);
                        this.tripPeerStateChangeTime = new TripPeerStateChangeTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tripPeerInUpdates,
                            this.tripPeerOutUpdates,
                            this.tripPeerInTotalMessages,
                            this.tripPeerOutTotalMessages,
                            this.tripPeerFsmEstablishedTransitions,
                            this.tripPeerFsmEstablishedTime,
                            this.tripPeerInUpdateElapsedTime,
                            this.tripPeerStateChangeTime
                        };
                    }
                    public static final class TripPeerInUpdatesEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerInUpdatesEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerInUpdates", "1.3.6.1.2.1.116.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerOutUpdatesEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerOutUpdatesEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerOutUpdates", "1.3.6.1.2.1.116.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerInTotalMessagesEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerInTotalMessagesEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerInTotalMessages", "1.3.6.1.2.1.116.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerOutTotalMessagesEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerOutTotalMessagesEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerOutTotalMessages", "1.3.6.1.2.1.116.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerFsmEstablishedTransitionsEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerFsmEstablishedTransitionsEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerFsmEstablishedTransitions", "1.3.6.1.2.1.116.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerFsmEstablishedTimeEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerFsmEstablishedTimeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerFsmEstablishedTime", "1.3.6.1.2.1.116.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerInUpdateElapsedTimeEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerInUpdateElapsedTimeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerInUpdateElapsedTime", "1.3.6.1.2.1.116.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripPeerStateChangeTimeEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripPeerStateChangeTimeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripPeerStateChangeTime", "1.3.6.1.2.1.116.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class TripRouteTableEnt extends MIBEntry<TRIPMIBDef>
            {
                public final TripRouteEntryEnt tripRouteEntry;

                private TripRouteTableEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripRouteTable", "1.3.6.1.2.1.116.1.6", false, true, false, false);
                    this.tripRouteEntry = new TripRouteEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tripRouteEntry
                    };
                }
                public static final class TripRouteEntryEnt extends MIBEntry<TRIPMIBDef>
                {
                    public final TripRouteAppProtocolEnt tripRouteAppProtocol;

                    public final TripRouteAddressFamilyEnt tripRouteAddressFamily;

                    public final TripRouteAddressEnt tripRouteAddress;

                    public final TripRoutePeerEnt tripRoutePeer;

                    public final TripRouteTRIBMaskEnt tripRouteTRIBMask;

                    public final TripRouteAddressSequenceNumberEnt tripRouteAddressSequenceNumber;

                    public final TripRouteAddressOriginatorIdEnt tripRouteAddressOriginatorId;

                    public final TripRouteNextHopServerIAddrTypeEnt tripRouteNextHopServerIAddrType;

                    public final TripRouteNextHopServerEnt tripRouteNextHopServer;

                    public final TripRouteNextHopServerPortEnt tripRouteNextHopServerPort;

                    public final TripRouteNextHopServerItadEnt tripRouteNextHopServerItad;

                    public final TripRouteMultiExitDiscEnt tripRouteMultiExitDisc;

                    public final TripRouteLocalPrefEnt tripRouteLocalPref;

                    public final TripRouteAdvertisementPathEnt tripRouteAdvertisementPath;

                    public final TripRouteRoutedPathEnt tripRouteRoutedPath;

                    public final TripRouteAtomicAggregateEnt tripRouteAtomicAggregate;

                    public final TripRouteUnknownEnt tripRouteUnknown;

                    public final TripRouteWithdrawnEnt tripRouteWithdrawn;

                    public final TripRouteConvertedEnt tripRouteConverted;

                    public final TripRouteReceivedTimeEnt tripRouteReceivedTime;

                    private TripRouteEntryEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripRouteEntry", "1.3.6.1.2.1.116.1.6.1", false, false, false, true);
                        this.tripRouteAppProtocol = new TripRouteAppProtocolEnt(mib, this);
                        this.tripRouteAddressFamily = new TripRouteAddressFamilyEnt(mib, this);
                        this.tripRouteAddress = new TripRouteAddressEnt(mib, this);
                        this.tripRoutePeer = new TripRoutePeerEnt(mib, this);
                        this.tripRouteTRIBMask = new TripRouteTRIBMaskEnt(mib, this);
                        this.tripRouteAddressSequenceNumber = new TripRouteAddressSequenceNumberEnt(mib, this);
                        this.tripRouteAddressOriginatorId = new TripRouteAddressOriginatorIdEnt(mib, this);
                        this.tripRouteNextHopServerIAddrType = new TripRouteNextHopServerIAddrTypeEnt(mib, this);
                        this.tripRouteNextHopServer = new TripRouteNextHopServerEnt(mib, this);
                        this.tripRouteNextHopServerPort = new TripRouteNextHopServerPortEnt(mib, this);
                        this.tripRouteNextHopServerItad = new TripRouteNextHopServerItadEnt(mib, this);
                        this.tripRouteMultiExitDisc = new TripRouteMultiExitDiscEnt(mib, this);
                        this.tripRouteLocalPref = new TripRouteLocalPrefEnt(mib, this);
                        this.tripRouteAdvertisementPath = new TripRouteAdvertisementPathEnt(mib, this);
                        this.tripRouteRoutedPath = new TripRouteRoutedPathEnt(mib, this);
                        this.tripRouteAtomicAggregate = new TripRouteAtomicAggregateEnt(mib, this);
                        this.tripRouteUnknown = new TripRouteUnknownEnt(mib, this);
                        this.tripRouteWithdrawn = new TripRouteWithdrawnEnt(mib, this);
                        this.tripRouteConverted = new TripRouteConvertedEnt(mib, this);
                        this.tripRouteReceivedTime = new TripRouteReceivedTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tripRouteAppProtocol,
                            this.tripRouteAddressFamily,
                            this.tripRouteAddress,
                            this.tripRoutePeer,
                            this.tripRouteTRIBMask,
                            this.tripRouteAddressSequenceNumber,
                            this.tripRouteAddressOriginatorId,
                            this.tripRouteNextHopServerIAddrType,
                            this.tripRouteNextHopServer,
                            this.tripRouteNextHopServerPort,
                            this.tripRouteNextHopServerItad,
                            this.tripRouteMultiExitDisc,
                            this.tripRouteLocalPref,
                            this.tripRouteAdvertisementPath,
                            this.tripRouteRoutedPath,
                            this.tripRouteAtomicAggregate,
                            this.tripRouteUnknown,
                            this.tripRouteWithdrawn,
                            this.tripRouteConverted,
                            this.tripRouteReceivedTime
                        };
                    }
                    public static final class TripRouteAppProtocolEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteAppProtocolEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteAppProtocol", "1.3.6.1.2.1.116.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteAddressFamilyEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteAddressFamilyEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteAddressFamily", "1.3.6.1.2.1.116.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteAddressEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteAddressEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteAddress", "1.3.6.1.2.1.116.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRoutePeerEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRoutePeerEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRoutePeer", "1.3.6.1.2.1.116.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteTRIBMaskEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteTRIBMaskEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteTRIBMask", "1.3.6.1.2.1.116.1.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteAddressSequenceNumberEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteAddressSequenceNumberEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteAddressSequenceNumber", "1.3.6.1.2.1.116.1.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteAddressOriginatorIdEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteAddressOriginatorIdEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteAddressOriginatorId", "1.3.6.1.2.1.116.1.6.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteNextHopServerIAddrTypeEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteNextHopServerIAddrTypeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteNextHopServerIAddrType", "1.3.6.1.2.1.116.1.6.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteNextHopServerEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteNextHopServerEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteNextHopServer", "1.3.6.1.2.1.116.1.6.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteNextHopServerPortEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteNextHopServerPortEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteNextHopServerPort", "1.3.6.1.2.1.116.1.6.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteNextHopServerItadEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteNextHopServerItadEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteNextHopServerItad", "1.3.6.1.2.1.116.1.6.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteMultiExitDiscEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteMultiExitDiscEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteMultiExitDisc", "1.3.6.1.2.1.116.1.6.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteLocalPrefEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteLocalPrefEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteLocalPref", "1.3.6.1.2.1.116.1.6.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteAdvertisementPathEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteAdvertisementPathEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteAdvertisementPath", "1.3.6.1.2.1.116.1.6.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteRoutedPathEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteRoutedPathEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteRoutedPath", "1.3.6.1.2.1.116.1.6.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteAtomicAggregateEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteAtomicAggregateEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteAtomicAggregate", "1.3.6.1.2.1.116.1.6.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteUnknownEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteUnknownEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteUnknown", "1.3.6.1.2.1.116.1.6.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteWithdrawnEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteWithdrawnEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteWithdrawn", "1.3.6.1.2.1.116.1.6.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteConvertedEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteConvertedEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteConverted", "1.3.6.1.2.1.116.1.6.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteReceivedTimeEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteReceivedTimeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteReceivedTime", "1.3.6.1.2.1.116.1.6.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class TripRouteCommunityTableEnt extends MIBEntry<TRIPMIBDef>
            {
                public final TripRouteCommunityEntryEnt tripRouteCommunityEntry;

                private TripRouteCommunityTableEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripRouteCommunityTable", "1.3.6.1.2.1.116.1.7", false, true, false, false);
                    this.tripRouteCommunityEntry = new TripRouteCommunityEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tripRouteCommunityEntry
                    };
                }
                public static final class TripRouteCommunityEntryEnt extends MIBEntry<TRIPMIBDef>
                {
                    public final TripRouteCommunityIdEnt tripRouteCommunityId;

                    public final TripRouteCommunityItadEnt tripRouteCommunityItad;

                    private TripRouteCommunityEntryEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripRouteCommunityEntry", "1.3.6.1.2.1.116.1.7.1", false, false, false, true);
                        this.tripRouteCommunityId = new TripRouteCommunityIdEnt(mib, this);
                        this.tripRouteCommunityItad = new TripRouteCommunityItadEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tripRouteCommunityId,
                            this.tripRouteCommunityItad
                        };
                    }
                    public static final class TripRouteCommunityIdEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteCommunityIdEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteCommunityId", "1.3.6.1.2.1.116.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripRouteCommunityItadEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripRouteCommunityItadEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripRouteCommunityItad", "1.3.6.1.2.1.116.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class TripItadTopologyTableEnt extends MIBEntry<TRIPMIBDef>
            {
                public final TripItadTopologyEntryEnt tripItadTopologyEntry;

                private TripItadTopologyTableEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripItadTopologyTable", "1.3.6.1.2.1.116.1.8", false, true, false, false);
                    this.tripItadTopologyEntry = new TripItadTopologyEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tripItadTopologyEntry
                    };
                }
                public static final class TripItadTopologyEntryEnt extends MIBEntry<TRIPMIBDef>
                {
                    public final TripItadTopologyOrigIdEnt tripItadTopologyOrigId;

                    public final TripItadTopologySeqNumEnt tripItadTopologySeqNum;

                    private TripItadTopologyEntryEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripItadTopologyEntry", "1.3.6.1.2.1.116.1.8.1", false, false, false, true);
                        this.tripItadTopologyOrigId = new TripItadTopologyOrigIdEnt(mib, this);
                        this.tripItadTopologySeqNum = new TripItadTopologySeqNumEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tripItadTopologyOrigId,
                            this.tripItadTopologySeqNum
                        };
                    }
                    public static final class TripItadTopologyOrigIdEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripItadTopologyOrigIdEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripItadTopologyOrigId", "1.3.6.1.2.1.116.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TripItadTopologySeqNumEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripItadTopologySeqNumEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripItadTopologySeqNum", "1.3.6.1.2.1.116.1.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class TripItadTopologyIdTableEnt extends MIBEntry<TRIPMIBDef>
            {
                public final TripItadTopologyIdEntryEnt tripItadTopologyIdEntry;

                private TripItadTopologyIdTableEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripItadTopologyIdTable", "1.3.6.1.2.1.116.1.9", false, true, false, false);
                    this.tripItadTopologyIdEntry = new TripItadTopologyIdEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tripItadTopologyIdEntry
                    };
                }
                public static final class TripItadTopologyIdEntryEnt extends MIBEntry<TRIPMIBDef>
                {
                    public final TripItadTopologyIdEnt tripItadTopologyId;

                    private TripItadTopologyIdEntryEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripItadTopologyIdEntry", "1.3.6.1.2.1.116.1.9.1", false, false, false, true);
                        this.tripItadTopologyId = new TripItadTopologyIdEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tripItadTopologyId
                        };
                    }
                    public static final class TripItadTopologyIdEnt extends MIBEntry<TRIPMIBDef>
                    {
                        private TripItadTopologyIdEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                        {
                            super(mib, parent, "tripItadTopologyId", "1.3.6.1.2.1.116.1.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class TripMIBConformanceEnt extends MIBEntry<TRIPMIBDef>
        {
            public final TripMIBCompliancesEnt tripMIBCompliances;

            public final TripMIBGroupsEnt tripMIBGroups;

            private TripMIBConformanceEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
            {
                super(mib, parent, "tripMIBConformance", "1.3.6.1.2.1.116.2", false, false, false, false);
                this.tripMIBCompliances = new TripMIBCompliancesEnt(mib, this);
                this.tripMIBGroups = new TripMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tripMIBCompliances,
                    this.tripMIBGroups
                };
            }
            public static final class TripMIBCompliancesEnt extends MIBEntry<TRIPMIBDef>
            {
                /** Compliance Statements*/
                public final TripMIBFullComplianceEnt tripMIBFullCompliance;

                public final TripMIBReadOnlyComplianceEnt tripMIBReadOnlyCompliance;

                private TripMIBCompliancesEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripMIBCompliances", "1.3.6.1.2.1.116.2.1", false, false, false, false);
                    this.tripMIBFullCompliance = new TripMIBFullComplianceEnt(mib, this);
                    this.tripMIBReadOnlyCompliance = new TripMIBReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tripMIBFullCompliance,
                        this.tripMIBReadOnlyCompliance
                    };
                }
                public static final class TripMIBFullComplianceEnt extends MIBEntry<TRIPMIBDef>
                {
                    private TripMIBFullComplianceEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripMIBFullCompliance", "1.3.6.1.2.1.116.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TripMIBReadOnlyComplianceEnt extends MIBEntry<TRIPMIBDef>
                {
                    private TripMIBReadOnlyComplianceEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripMIBReadOnlyCompliance", "1.3.6.1.2.1.116.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class TripMIBGroupsEnt extends MIBEntry<TRIPMIBDef>
            {
                /** Object and event conformance groups*/
                public final TripConfigGroupEnt tripConfigGroup;

                public final TripPeerTableConfigGroupEnt tripPeerTableConfigGroup;

                public final TripPeerTableStatsGroupEnt tripPeerTableStatsGroup;

                public final TripRouteGroupEnt tripRouteGroup;

                public final TripItadTopologyGroupEnt tripItadTopologyGroup;

                public final TripNotificationGroupEnt tripNotificationGroup;

                public final TripNotifObjectGroupEnt tripNotifObjectGroup;

                private TripMIBGroupsEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripMIBGroups", "1.3.6.1.2.1.116.2.2", false, false, false, false);
                    this.tripConfigGroup = new TripConfigGroupEnt(mib, this);
                    this.tripPeerTableConfigGroup = new TripPeerTableConfigGroupEnt(mib, this);
                    this.tripPeerTableStatsGroup = new TripPeerTableStatsGroupEnt(mib, this);
                    this.tripRouteGroup = new TripRouteGroupEnt(mib, this);
                    this.tripItadTopologyGroup = new TripItadTopologyGroupEnt(mib, this);
                    this.tripNotificationGroup = new TripNotificationGroupEnt(mib, this);
                    this.tripNotifObjectGroup = new TripNotifObjectGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tripConfigGroup,
                        this.tripPeerTableConfigGroup,
                        this.tripPeerTableStatsGroup,
                        this.tripRouteGroup,
                        this.tripItadTopologyGroup,
                        this.tripNotificationGroup,
                        this.tripNotifObjectGroup
                    };
                }
                public static final class TripConfigGroupEnt extends MIBEntry<TRIPMIBDef>
                {
                    private TripConfigGroupEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripConfigGroup", "1.3.6.1.2.1.116.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TripPeerTableConfigGroupEnt extends MIBEntry<TRIPMIBDef>
                {
                    private TripPeerTableConfigGroupEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripPeerTableConfigGroup", "1.3.6.1.2.1.116.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TripPeerTableStatsGroupEnt extends MIBEntry<TRIPMIBDef>
                {
                    private TripPeerTableStatsGroupEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripPeerTableStatsGroup", "1.3.6.1.2.1.116.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TripRouteGroupEnt extends MIBEntry<TRIPMIBDef>
                {
                    private TripRouteGroupEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripRouteGroup", "1.3.6.1.2.1.116.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TripItadTopologyGroupEnt extends MIBEntry<TRIPMIBDef>
                {
                    private TripItadTopologyGroupEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripItadTopologyGroup", "1.3.6.1.2.1.116.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TripNotificationGroupEnt extends MIBEntry<TRIPMIBDef>
                {
                    private TripNotificationGroupEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripNotificationGroup", "1.3.6.1.2.1.116.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TripNotifObjectGroupEnt extends MIBEntry<TRIPMIBDef>
                {
                    private TripNotifObjectGroupEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                    {
                        super(mib, parent, "tripNotifObjectGroup", "1.3.6.1.2.1.116.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class TripMIBNotifObjectsEnt extends MIBEntry<TRIPMIBDef>
        {
            /** Notification objects*/
            public final TripNotifApplIndexEnt tripNotifApplIndex;

            public final TripNotifPeerAddrInetTypeEnt tripNotifPeerAddrInetType;

            public final TripNotifPeerAddrEnt tripNotifPeerAddr;

            public final TripNotifPeerErrCodeEnt tripNotifPeerErrCode;

            public final TripNotifPeerErrSubcodeEnt tripNotifPeerErrSubcode;

            private TripMIBNotifObjectsEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
            {
                super(mib, parent, "tripMIBNotifObjects", "1.3.6.1.2.1.116.3", false, false, false, false);
                this.tripNotifApplIndex = new TripNotifApplIndexEnt(mib, this);
                this.tripNotifPeerAddrInetType = new TripNotifPeerAddrInetTypeEnt(mib, this);
                this.tripNotifPeerAddr = new TripNotifPeerAddrEnt(mib, this);
                this.tripNotifPeerErrCode = new TripNotifPeerErrCodeEnt(mib, this);
                this.tripNotifPeerErrSubcode = new TripNotifPeerErrSubcodeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tripNotifApplIndex,
                    this.tripNotifPeerAddrInetType,
                    this.tripNotifPeerAddr,
                    this.tripNotifPeerErrCode,
                    this.tripNotifPeerErrSubcode
                };
            }
            public static final class TripNotifApplIndexEnt extends MIBEntry<TRIPMIBDef>
            {
                private TripNotifApplIndexEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripNotifApplIndex", "1.3.6.1.2.1.116.3.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TripNotifPeerAddrInetTypeEnt extends MIBEntry<TRIPMIBDef>
            {
                private TripNotifPeerAddrInetTypeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripNotifPeerAddrInetType", "1.3.6.1.2.1.116.3.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TripNotifPeerAddrEnt extends MIBEntry<TRIPMIBDef>
            {
                private TripNotifPeerAddrEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripNotifPeerAddr", "1.3.6.1.2.1.116.3.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TripNotifPeerErrCodeEnt extends MIBEntry<TRIPMIBDef>
            {
                private TripNotifPeerErrCodeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripNotifPeerErrCode", "1.3.6.1.2.1.116.3.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TripNotifPeerErrSubcodeEnt extends MIBEntry<TRIPMIBDef>
            {
                private TripNotifPeerErrSubcodeEnt(TRIPMIBDef mib, MIBEntry<TRIPMIBDef> parent)
                {
                    super(mib, parent, "tripNotifPeerErrSubcode", "1.3.6.1.2.1.116.3.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
