package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class BGP4MIBDef extends MIB
{
    public static final BGP4MIBDef BGP4MIB = new BGP4MIBDef();

    public final BgpEnt bgp;

    private BGP4MIBDef()
    {
        super("BGP4-MIB");
        this.bgp = new BgpEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.bgp
        };
    }

    public static final class BgpEnt extends MIBEntry<BGP4MIBDef>
    {
        public final BgpVersionEnt bgpVersion;

        public final BgpLocalAsEnt bgpLocalAs;

        /** BGP Peer table.  This table contains, one entry perBGP peer, information about the BGP peer.*/
        public final BgpPeerTableEnt bgpPeerTable;

        public final BgpIdentifierEnt bgpIdentifier;

        /** BGP Received Path Attribute Table.  This table containsone entry per path to a network, and path attributesreceived from all peers running BGP version 3 or less.This table is obsolete, having been replaced infunctionality by the bgp4PathAttrTable.*/
        public final BgpRcvdPathAttrTableEnt bgpRcvdPathAttrTable;

        /** BGP-4 Received Path Attribute Table.  This tablecontains one entry per path to a network, and pathattributes received from all peers running BGP-4.*/
        public final Bgp4PathAttrTableEnt bgp4PathAttrTable;

        /** Traps.Note that in RFC 1657, bgpTraps was incorrectlyassigned a value of { bgp 7 } and each of thetraps had the bgpPeerRemoteAddr object inappropriately


removed from their OBJECTS clause.  The followingdefinitions restore the semantics of the traps asthey were initially defined in RFC 1269.*/
        public final BgpNotificationEnt bgpNotification;

        /** { bgp 7 } is deprecated.  Do not allocate new objects ornotifications underneath this branch.*/
        public final BgpTrapsEnt bgpTraps;

        /** Conformance information*/
        public final Bgp4MIBConformanceEnt bgp4MIBConformance;

        private BgpEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
        {
            super(mib, parent, "bgp", "1.3.6.1.2.1.15", false, false, false, false);
            this.bgpVersion = new BgpVersionEnt(mib, this);
            this.bgpLocalAs = new BgpLocalAsEnt(mib, this);
            this.bgpPeerTable = new BgpPeerTableEnt(mib, this);
            this.bgpIdentifier = new BgpIdentifierEnt(mib, this);
            this.bgpRcvdPathAttrTable = new BgpRcvdPathAttrTableEnt(mib, this);
            this.bgp4PathAttrTable = new Bgp4PathAttrTableEnt(mib, this);
            this.bgpNotification = new BgpNotificationEnt(mib, this);
            this.bgpTraps = new BgpTrapsEnt(mib, this);
            this.bgp4MIBConformance = new Bgp4MIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.bgpVersion,
                this.bgpLocalAs,
                this.bgpPeerTable,
                this.bgpIdentifier,
                this.bgpRcvdPathAttrTable,
                this.bgp4PathAttrTable,
                this.bgpNotification,
                this.bgpTraps,
                this.bgp4MIBConformance
            };
        }
        public static final class BgpVersionEnt extends MIBEntry<BGP4MIBDef>
        {
            private BgpVersionEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
            {
                super(mib, parent, "bgpVersion", "1.3.6.1.2.1.15.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class BgpLocalAsEnt extends MIBEntry<BGP4MIBDef>
        {
            private BgpLocalAsEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
            {
                super(mib, parent, "bgpLocalAs", "1.3.6.1.2.1.15.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class BgpPeerTableEnt extends MIBEntry<BGP4MIBDef>
        {
            public final BgpPeerEntryEnt bgpPeerEntry;

            private BgpPeerTableEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
            {
                super(mib, parent, "bgpPeerTable", "1.3.6.1.2.1.15.3", false, true, false, false);
                this.bgpPeerEntry = new BgpPeerEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.bgpPeerEntry
                };
            }
            public static final class BgpPeerEntryEnt extends MIBEntry<BGP4MIBDef>
            {
                public final BgpPeerIdentifierEnt bgpPeerIdentifier;

                public final BgpPeerStateEnt bgpPeerState;

                public final BgpPeerAdminStatusEnt bgpPeerAdminStatus;

                public final BgpPeerNegotiatedVersionEnt bgpPeerNegotiatedVersion;

                public final BgpPeerLocalAddrEnt bgpPeerLocalAddr;

                public final BgpPeerLocalPortEnt bgpPeerLocalPort;

                public final BgpPeerRemoteAddrEnt bgpPeerRemoteAddr;

                public final BgpPeerRemotePortEnt bgpPeerRemotePort;

                public final BgpPeerRemoteAsEnt bgpPeerRemoteAs;

                public final BgpPeerInUpdatesEnt bgpPeerInUpdates;

                public final BgpPeerOutUpdatesEnt bgpPeerOutUpdates;

                public final BgpPeerInTotalMessagesEnt bgpPeerInTotalMessages;

                public final BgpPeerOutTotalMessagesEnt bgpPeerOutTotalMessages;

                public final BgpPeerLastErrorEnt bgpPeerLastError;

                public final BgpPeerFsmEstablishedTransitionsEnt bgpPeerFsmEstablishedTransitions;

                public final BgpPeerFsmEstablishedTimeEnt bgpPeerFsmEstablishedTime;

                public final BgpPeerConnectRetryIntervalEnt bgpPeerConnectRetryInterval;

                public final BgpPeerHoldTimeEnt bgpPeerHoldTime;

                public final BgpPeerKeepAliveEnt bgpPeerKeepAlive;

                public final BgpPeerHoldTimeConfiguredEnt bgpPeerHoldTimeConfigured;

                public final BgpPeerKeepAliveConfiguredEnt bgpPeerKeepAliveConfigured;

                public final BgpPeerMinASOriginationIntervalEnt bgpPeerMinASOriginationInterval;

                public final BgpPeerMinRouteAdvertisementIntervalEnt bgpPeerMinRouteAdvertisementInterval;

                public final BgpPeerInUpdateElapsedTimeEnt bgpPeerInUpdateElapsedTime;

                private BgpPeerEntryEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                {
                    super(mib, parent, "bgpPeerEntry", "1.3.6.1.2.1.15.3.1", false, false, false, true);
                    this.bgpPeerIdentifier = new BgpPeerIdentifierEnt(mib, this);
                    this.bgpPeerState = new BgpPeerStateEnt(mib, this);
                    this.bgpPeerAdminStatus = new BgpPeerAdminStatusEnt(mib, this);
                    this.bgpPeerNegotiatedVersion = new BgpPeerNegotiatedVersionEnt(mib, this);
                    this.bgpPeerLocalAddr = new BgpPeerLocalAddrEnt(mib, this);
                    this.bgpPeerLocalPort = new BgpPeerLocalPortEnt(mib, this);
                    this.bgpPeerRemoteAddr = new BgpPeerRemoteAddrEnt(mib, this);
                    this.bgpPeerRemotePort = new BgpPeerRemotePortEnt(mib, this);
                    this.bgpPeerRemoteAs = new BgpPeerRemoteAsEnt(mib, this);
                    this.bgpPeerInUpdates = new BgpPeerInUpdatesEnt(mib, this);
                    this.bgpPeerOutUpdates = new BgpPeerOutUpdatesEnt(mib, this);
                    this.bgpPeerInTotalMessages = new BgpPeerInTotalMessagesEnt(mib, this);
                    this.bgpPeerOutTotalMessages = new BgpPeerOutTotalMessagesEnt(mib, this);
                    this.bgpPeerLastError = new BgpPeerLastErrorEnt(mib, this);
                    this.bgpPeerFsmEstablishedTransitions = new BgpPeerFsmEstablishedTransitionsEnt(mib, this);
                    this.bgpPeerFsmEstablishedTime = new BgpPeerFsmEstablishedTimeEnt(mib, this);
                    this.bgpPeerConnectRetryInterval = new BgpPeerConnectRetryIntervalEnt(mib, this);
                    this.bgpPeerHoldTime = new BgpPeerHoldTimeEnt(mib, this);
                    this.bgpPeerKeepAlive = new BgpPeerKeepAliveEnt(mib, this);
                    this.bgpPeerHoldTimeConfigured = new BgpPeerHoldTimeConfiguredEnt(mib, this);
                    this.bgpPeerKeepAliveConfigured = new BgpPeerKeepAliveConfiguredEnt(mib, this);
                    this.bgpPeerMinASOriginationInterval = new BgpPeerMinASOriginationIntervalEnt(mib, this);
                    this.bgpPeerMinRouteAdvertisementInterval = new BgpPeerMinRouteAdvertisementIntervalEnt(mib, this);
                    this.bgpPeerInUpdateElapsedTime = new BgpPeerInUpdateElapsedTimeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.bgpPeerIdentifier,
                        this.bgpPeerState,
                        this.bgpPeerAdminStatus,
                        this.bgpPeerNegotiatedVersion,
                        this.bgpPeerLocalAddr,
                        this.bgpPeerLocalPort,
                        this.bgpPeerRemoteAddr,
                        this.bgpPeerRemotePort,
                        this.bgpPeerRemoteAs,
                        this.bgpPeerInUpdates,
                        this.bgpPeerOutUpdates,
                        this.bgpPeerInTotalMessages,
                        this.bgpPeerOutTotalMessages,
                        this.bgpPeerLastError,
                        this.bgpPeerFsmEstablishedTransitions,
                        this.bgpPeerFsmEstablishedTime,
                        this.bgpPeerConnectRetryInterval,
                        this.bgpPeerHoldTime,
                        this.bgpPeerKeepAlive,
                        this.bgpPeerHoldTimeConfigured,
                        this.bgpPeerKeepAliveConfigured,
                        this.bgpPeerMinASOriginationInterval,
                        this.bgpPeerMinRouteAdvertisementInterval,
                        this.bgpPeerInUpdateElapsedTime
                    };
                }
                public static final class BgpPeerIdentifierEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerIdentifierEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerIdentifier", "1.3.6.1.2.1.15.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerStateEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerStateEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerState", "1.3.6.1.2.1.15.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerAdminStatusEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerAdminStatusEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerAdminStatus", "1.3.6.1.2.1.15.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerNegotiatedVersionEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerNegotiatedVersionEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerNegotiatedVersion", "1.3.6.1.2.1.15.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerLocalAddrEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerLocalAddrEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerLocalAddr", "1.3.6.1.2.1.15.3.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerLocalPortEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerLocalPortEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerLocalPort", "1.3.6.1.2.1.15.3.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerRemoteAddrEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerRemoteAddrEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerRemoteAddr", "1.3.6.1.2.1.15.3.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerRemotePortEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerRemotePortEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerRemotePort", "1.3.6.1.2.1.15.3.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerRemoteAsEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerRemoteAsEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerRemoteAs", "1.3.6.1.2.1.15.3.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerInUpdatesEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerInUpdatesEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerInUpdates", "1.3.6.1.2.1.15.3.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerOutUpdatesEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerOutUpdatesEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerOutUpdates", "1.3.6.1.2.1.15.3.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerInTotalMessagesEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerInTotalMessagesEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerInTotalMessages", "1.3.6.1.2.1.15.3.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerOutTotalMessagesEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerOutTotalMessagesEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerOutTotalMessages", "1.3.6.1.2.1.15.3.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerLastErrorEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerLastErrorEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerLastError", "1.3.6.1.2.1.15.3.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerFsmEstablishedTransitionsEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerFsmEstablishedTransitionsEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerFsmEstablishedTransitions", "1.3.6.1.2.1.15.3.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerFsmEstablishedTimeEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerFsmEstablishedTimeEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerFsmEstablishedTime", "1.3.6.1.2.1.15.3.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerConnectRetryIntervalEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerConnectRetryIntervalEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerConnectRetryInterval", "1.3.6.1.2.1.15.3.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerHoldTimeEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerHoldTimeEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerHoldTime", "1.3.6.1.2.1.15.3.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerKeepAliveEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerKeepAliveEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerKeepAlive", "1.3.6.1.2.1.15.3.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerHoldTimeConfiguredEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerHoldTimeConfiguredEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerHoldTimeConfigured", "1.3.6.1.2.1.15.3.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerKeepAliveConfiguredEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerKeepAliveConfiguredEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerKeepAliveConfigured", "1.3.6.1.2.1.15.3.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerMinASOriginationIntervalEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerMinASOriginationIntervalEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerMinASOriginationInterval", "1.3.6.1.2.1.15.3.1.22", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerMinRouteAdvertisementIntervalEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerMinRouteAdvertisementIntervalEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerMinRouteAdvertisementInterval", "1.3.6.1.2.1.15.3.1.23", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerInUpdateElapsedTimeEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPeerInUpdateElapsedTimeEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerInUpdateElapsedTime", "1.3.6.1.2.1.15.3.1.24", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class BgpIdentifierEnt extends MIBEntry<BGP4MIBDef>
        {
            private BgpIdentifierEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
            {
                super(mib, parent, "bgpIdentifier", "1.3.6.1.2.1.15.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class BgpRcvdPathAttrTableEnt extends MIBEntry<BGP4MIBDef>
        {
            public final BgpPathAttrEntryEnt bgpPathAttrEntry;

            private BgpRcvdPathAttrTableEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
            {
                super(mib, parent, "bgpRcvdPathAttrTable", "1.3.6.1.2.1.15.5", false, true, false, false);
                this.bgpPathAttrEntry = new BgpPathAttrEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.bgpPathAttrEntry
                };
            }
            public static final class BgpPathAttrEntryEnt extends MIBEntry<BGP4MIBDef>
            {
                public final BgpPathAttrPeerEnt bgpPathAttrPeer;

                public final BgpPathAttrDestNetworkEnt bgpPathAttrDestNetwork;

                public final BgpPathAttrOriginEnt bgpPathAttrOrigin;

                public final BgpPathAttrASPathEnt bgpPathAttrASPath;

                public final BgpPathAttrNextHopEnt bgpPathAttrNextHop;

                public final BgpPathAttrInterASMetricEnt bgpPathAttrInterASMetric;

                private BgpPathAttrEntryEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                {
                    super(mib, parent, "bgpPathAttrEntry", "1.3.6.1.2.1.15.5.1", false, false, false, true);
                    this.bgpPathAttrPeer = new BgpPathAttrPeerEnt(mib, this);
                    this.bgpPathAttrDestNetwork = new BgpPathAttrDestNetworkEnt(mib, this);
                    this.bgpPathAttrOrigin = new BgpPathAttrOriginEnt(mib, this);
                    this.bgpPathAttrASPath = new BgpPathAttrASPathEnt(mib, this);
                    this.bgpPathAttrNextHop = new BgpPathAttrNextHopEnt(mib, this);
                    this.bgpPathAttrInterASMetric = new BgpPathAttrInterASMetricEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.bgpPathAttrPeer,
                        this.bgpPathAttrDestNetwork,
                        this.bgpPathAttrOrigin,
                        this.bgpPathAttrASPath,
                        this.bgpPathAttrNextHop,
                        this.bgpPathAttrInterASMetric
                    };
                }
                public static final class BgpPathAttrPeerEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPathAttrPeerEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPathAttrPeer", "1.3.6.1.2.1.15.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPathAttrDestNetworkEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPathAttrDestNetworkEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPathAttrDestNetwork", "1.3.6.1.2.1.15.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPathAttrOriginEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPathAttrOriginEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPathAttrOrigin", "1.3.6.1.2.1.15.5.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPathAttrASPathEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPathAttrASPathEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPathAttrASPath", "1.3.6.1.2.1.15.5.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPathAttrNextHopEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPathAttrNextHopEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPathAttrNextHop", "1.3.6.1.2.1.15.5.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPathAttrInterASMetricEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpPathAttrInterASMetricEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpPathAttrInterASMetric", "1.3.6.1.2.1.15.5.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Bgp4PathAttrTableEnt extends MIBEntry<BGP4MIBDef>
        {
            public final Bgp4PathAttrEntryEnt bgp4PathAttrEntry;

            private Bgp4PathAttrTableEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
            {
                super(mib, parent, "bgp4PathAttrTable", "1.3.6.1.2.1.15.6", false, true, false, false);
                this.bgp4PathAttrEntry = new Bgp4PathAttrEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.bgp4PathAttrEntry
                };
            }
            public static final class Bgp4PathAttrEntryEnt extends MIBEntry<BGP4MIBDef>
            {
                public final Bgp4PathAttrPeerEnt bgp4PathAttrPeer;

                public final Bgp4PathAttrIpAddrPrefixLenEnt bgp4PathAttrIpAddrPrefixLen;

                public final Bgp4PathAttrIpAddrPrefixEnt bgp4PathAttrIpAddrPrefix;

                public final Bgp4PathAttrOriginEnt bgp4PathAttrOrigin;

                public final Bgp4PathAttrASPathSegmentEnt bgp4PathAttrASPathSegment;

                public final Bgp4PathAttrNextHopEnt bgp4PathAttrNextHop;

                public final Bgp4PathAttrMultiExitDiscEnt bgp4PathAttrMultiExitDisc;

                public final Bgp4PathAttrLocalPrefEnt bgp4PathAttrLocalPref;

                public final Bgp4PathAttrAtomicAggregateEnt bgp4PathAttrAtomicAggregate;

                public final Bgp4PathAttrAggregatorASEnt bgp4PathAttrAggregatorAS;

                public final Bgp4PathAttrAggregatorAddrEnt bgp4PathAttrAggregatorAddr;

                public final Bgp4PathAttrCalcLocalPrefEnt bgp4PathAttrCalcLocalPref;

                public final Bgp4PathAttrBestEnt bgp4PathAttrBest;

                public final Bgp4PathAttrUnknownEnt bgp4PathAttrUnknown;

                private Bgp4PathAttrEntryEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                {
                    super(mib, parent, "bgp4PathAttrEntry", "1.3.6.1.2.1.15.6.1", false, false, false, true);
                    this.bgp4PathAttrPeer = new Bgp4PathAttrPeerEnt(mib, this);
                    this.bgp4PathAttrIpAddrPrefixLen = new Bgp4PathAttrIpAddrPrefixLenEnt(mib, this);
                    this.bgp4PathAttrIpAddrPrefix = new Bgp4PathAttrIpAddrPrefixEnt(mib, this);
                    this.bgp4PathAttrOrigin = new Bgp4PathAttrOriginEnt(mib, this);
                    this.bgp4PathAttrASPathSegment = new Bgp4PathAttrASPathSegmentEnt(mib, this);
                    this.bgp4PathAttrNextHop = new Bgp4PathAttrNextHopEnt(mib, this);
                    this.bgp4PathAttrMultiExitDisc = new Bgp4PathAttrMultiExitDiscEnt(mib, this);
                    this.bgp4PathAttrLocalPref = new Bgp4PathAttrLocalPrefEnt(mib, this);
                    this.bgp4PathAttrAtomicAggregate = new Bgp4PathAttrAtomicAggregateEnt(mib, this);
                    this.bgp4PathAttrAggregatorAS = new Bgp4PathAttrAggregatorASEnt(mib, this);
                    this.bgp4PathAttrAggregatorAddr = new Bgp4PathAttrAggregatorAddrEnt(mib, this);
                    this.bgp4PathAttrCalcLocalPref = new Bgp4PathAttrCalcLocalPrefEnt(mib, this);
                    this.bgp4PathAttrBest = new Bgp4PathAttrBestEnt(mib, this);
                    this.bgp4PathAttrUnknown = new Bgp4PathAttrUnknownEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.bgp4PathAttrPeer,
                        this.bgp4PathAttrIpAddrPrefixLen,
                        this.bgp4PathAttrIpAddrPrefix,
                        this.bgp4PathAttrOrigin,
                        this.bgp4PathAttrASPathSegment,
                        this.bgp4PathAttrNextHop,
                        this.bgp4PathAttrMultiExitDisc,
                        this.bgp4PathAttrLocalPref,
                        this.bgp4PathAttrAtomicAggregate,
                        this.bgp4PathAttrAggregatorAS,
                        this.bgp4PathAttrAggregatorAddr,
                        this.bgp4PathAttrCalcLocalPref,
                        this.bgp4PathAttrBest,
                        this.bgp4PathAttrUnknown
                    };
                }
                public static final class Bgp4PathAttrPeerEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4PathAttrPeerEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4PathAttrPeer", "1.3.6.1.2.1.15.6.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4PathAttrIpAddrPrefixLenEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4PathAttrIpAddrPrefixLenEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4PathAttrIpAddrPrefixLen", "1.3.6.1.2.1.15.6.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4PathAttrIpAddrPrefixEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4PathAttrIpAddrPrefixEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4PathAttrIpAddrPrefix", "1.3.6.1.2.1.15.6.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4PathAttrOriginEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4PathAttrOriginEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4PathAttrOrigin", "1.3.6.1.2.1.15.6.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4PathAttrASPathSegmentEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4PathAttrASPathSegmentEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4PathAttrASPathSegment", "1.3.6.1.2.1.15.6.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4PathAttrNextHopEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4PathAttrNextHopEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4PathAttrNextHop", "1.3.6.1.2.1.15.6.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4PathAttrMultiExitDiscEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4PathAttrMultiExitDiscEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4PathAttrMultiExitDisc", "1.3.6.1.2.1.15.6.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4PathAttrLocalPrefEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4PathAttrLocalPrefEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4PathAttrLocalPref", "1.3.6.1.2.1.15.6.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4PathAttrAtomicAggregateEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4PathAttrAtomicAggregateEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4PathAttrAtomicAggregate", "1.3.6.1.2.1.15.6.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4PathAttrAggregatorASEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4PathAttrAggregatorASEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4PathAttrAggregatorAS", "1.3.6.1.2.1.15.6.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4PathAttrAggregatorAddrEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4PathAttrAggregatorAddrEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4PathAttrAggregatorAddr", "1.3.6.1.2.1.15.6.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4PathAttrCalcLocalPrefEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4PathAttrCalcLocalPrefEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4PathAttrCalcLocalPref", "1.3.6.1.2.1.15.6.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4PathAttrBestEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4PathAttrBestEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4PathAttrBest", "1.3.6.1.2.1.15.6.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4PathAttrUnknownEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4PathAttrUnknownEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4PathAttrUnknown", "1.3.6.1.2.1.15.6.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class BgpNotificationEnt extends MIBEntry<BGP4MIBDef>
        {
            public final BgpEstablishedNotificationEnt bgpEstablishedNotification;

            public final BgpBackwardTransNotificationEnt bgpBackwardTransNotification;

            private BgpNotificationEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
            {
                super(mib, parent, "bgpNotification", "1.3.6.1.2.1.15.0", false, false, false, false);
                this.bgpEstablishedNotification = new BgpEstablishedNotificationEnt(mib, this);
                this.bgpBackwardTransNotification = new BgpBackwardTransNotificationEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.bgpEstablishedNotification,
                    this.bgpBackwardTransNotification
                };
            }
            public static final class BgpEstablishedNotificationEnt extends MIBEntry<BGP4MIBDef>
            {
                private BgpEstablishedNotificationEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                {
                    super(mib, parent, "bgpEstablishedNotification", "1.3.6.1.2.1.15.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class BgpBackwardTransNotificationEnt extends MIBEntry<BGP4MIBDef>
            {
                private BgpBackwardTransNotificationEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                {
                    super(mib, parent, "bgpBackwardTransNotification", "1.3.6.1.2.1.15.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class BgpTrapsEnt extends MIBEntry<BGP4MIBDef>
        {
            /** deprecated*/
            public final BgpEstablishedEnt bgpEstablished;

            public final BgpBackwardTransitionEnt bgpBackwardTransition;

            private BgpTrapsEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
            {
                super(mib, parent, "bgpTraps", "1.3.6.1.2.1.15.7", false, false, false, false);
                this.bgpEstablished = new BgpEstablishedEnt(mib, this);
                this.bgpBackwardTransition = new BgpBackwardTransitionEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.bgpEstablished,
                    this.bgpBackwardTransition
                };
            }
            public static final class BgpEstablishedEnt extends MIBEntry<BGP4MIBDef>
            {
                private BgpEstablishedEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                {
                    super(mib, parent, "bgpEstablished", "1.3.6.1.2.1.15.7.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class BgpBackwardTransitionEnt extends MIBEntry<BGP4MIBDef>
            {
                private BgpBackwardTransitionEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                {
                    super(mib, parent, "bgpBackwardTransition", "1.3.6.1.2.1.15.7.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Bgp4MIBConformanceEnt extends MIBEntry<BGP4MIBDef>
        {
            public final Bgp4MIBCompliancesEnt bgp4MIBCompliances;

            public final Bgp4MIBGroupsEnt bgp4MIBGroups;

            private Bgp4MIBConformanceEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
            {
                super(mib, parent, "bgp4MIBConformance", "1.3.6.1.2.1.15.8", false, false, false, false);
                this.bgp4MIBCompliances = new Bgp4MIBCompliancesEnt(mib, this);
                this.bgp4MIBGroups = new Bgp4MIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.bgp4MIBCompliances,
                    this.bgp4MIBGroups
                };
            }
            public static final class Bgp4MIBCompliancesEnt extends MIBEntry<BGP4MIBDef>
            {
                /** Compliance statements*/
                public final Bgp4MIBComplianceEnt bgp4MIBCompliance;

                public final Bgp4MIBDeprecatedCompliancesEnt bgp4MIBDeprecatedCompliances;

                public final Bgp4MIBObsoleteCompliancesEnt bgp4MIBObsoleteCompliances;

                private Bgp4MIBCompliancesEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                {
                    super(mib, parent, "bgp4MIBCompliances", "1.3.6.1.2.1.15.8.1", false, false, false, false);
                    this.bgp4MIBCompliance = new Bgp4MIBComplianceEnt(mib, this);
                    this.bgp4MIBDeprecatedCompliances = new Bgp4MIBDeprecatedCompliancesEnt(mib, this);
                    this.bgp4MIBObsoleteCompliances = new Bgp4MIBObsoleteCompliancesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.bgp4MIBCompliance,
                        this.bgp4MIBDeprecatedCompliances,
                        this.bgp4MIBObsoleteCompliances
                    };
                }
                public static final class Bgp4MIBComplianceEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4MIBComplianceEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4MIBCompliance", "1.3.6.1.2.1.15.8.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4MIBDeprecatedCompliancesEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4MIBDeprecatedCompliancesEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4MIBDeprecatedCompliances", "1.3.6.1.2.1.15.8.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4MIBObsoleteCompliancesEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4MIBObsoleteCompliancesEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4MIBObsoleteCompliances", "1.3.6.1.2.1.15.8.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Bgp4MIBGroupsEnt extends MIBEntry<BGP4MIBDef>
            {
                /** Units of conformance*/
                public final Bgp4MIBGlobalsGroupEnt bgp4MIBGlobalsGroup;

                public final Bgp4MIBPeerGroupEnt bgp4MIBPeerGroup;

                public final BgpRcvdPathAttrGroupEnt bgpRcvdPathAttrGroup;

                public final Bgp4MIBPathAttrGroupEnt bgp4MIBPathAttrGroup;

                public final Bgp4MIBTrapGroupEnt bgp4MIBTrapGroup;

                public final Bgp4MIBNotificationGroupEnt bgp4MIBNotificationGroup;

                private Bgp4MIBGroupsEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                {
                    super(mib, parent, "bgp4MIBGroups", "1.3.6.1.2.1.15.8.2", false, false, false, false);
                    this.bgp4MIBGlobalsGroup = new Bgp4MIBGlobalsGroupEnt(mib, this);
                    this.bgp4MIBPeerGroup = new Bgp4MIBPeerGroupEnt(mib, this);
                    this.bgpRcvdPathAttrGroup = new BgpRcvdPathAttrGroupEnt(mib, this);
                    this.bgp4MIBPathAttrGroup = new Bgp4MIBPathAttrGroupEnt(mib, this);
                    this.bgp4MIBTrapGroup = new Bgp4MIBTrapGroupEnt(mib, this);
                    this.bgp4MIBNotificationGroup = new Bgp4MIBNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.bgp4MIBGlobalsGroup,
                        this.bgp4MIBPeerGroup,
                        this.bgpRcvdPathAttrGroup,
                        this.bgp4MIBPathAttrGroup,
                        this.bgp4MIBTrapGroup,
                        this.bgp4MIBNotificationGroup
                    };
                }
                public static final class Bgp4MIBGlobalsGroupEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4MIBGlobalsGroupEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4MIBGlobalsGroup", "1.3.6.1.2.1.15.8.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4MIBPeerGroupEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4MIBPeerGroupEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4MIBPeerGroup", "1.3.6.1.2.1.15.8.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpRcvdPathAttrGroupEnt extends MIBEntry<BGP4MIBDef>
                {
                    private BgpRcvdPathAttrGroupEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgpRcvdPathAttrGroup", "1.3.6.1.2.1.15.8.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4MIBPathAttrGroupEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4MIBPathAttrGroupEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4MIBPathAttrGroup", "1.3.6.1.2.1.15.8.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4MIBTrapGroupEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4MIBTrapGroupEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4MIBTrapGroup", "1.3.6.1.2.1.15.8.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Bgp4MIBNotificationGroupEnt extends MIBEntry<BGP4MIBDef>
                {
                    private Bgp4MIBNotificationGroupEnt(BGP4MIBDef mib, MIBEntry<BGP4MIBDef> parent)
                    {
                        super(mib, parent, "bgp4MIBNotificationGroup", "1.3.6.1.2.1.15.8.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
