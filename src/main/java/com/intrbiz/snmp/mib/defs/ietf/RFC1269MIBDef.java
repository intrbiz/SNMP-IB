package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class RFC1269MIBDef extends MIB
{
    public static final RFC1269MIBDef RFC1269MIB = new RFC1269MIBDef();

    public final BgpEnt bgp;

    private RFC1269MIBDef()
    {
        super("RFC1269-MIB");
        this.bgp = new BgpEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.bgp
        };
    }

    public static final class BgpEnt extends MIBEntry<RFC1269MIBDef>
    {
        public final BgpVersionEnt bgpVersion;

        public final BgpLocalAsEnt bgpLocalAs;

        /** BGP Peer table.  This table contains, one entry perBGP peer, information about the BGP peer.*/
        public final BgpPeerTableEnt bgpPeerTable;

        public final BgpIdentifierEnt bgpIdentifier;

        /** BGP Received Path Attribute Table.  This table containsone entry per path to a network, and path attributesreceived from all peers running BGP version 3 or less.This table is obsolete, having been replaced infunctionality by the bgp4PathAttrTable.*/
        public final BgpRcvdPathAttrTableEnt bgpRcvdPathAttrTable;

        private BgpEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
        {
            super(mib, parent, "bgp", "1.3.6.1.2.1.15", false, false, false, false);
            this.bgpVersion = new BgpVersionEnt(mib, this);
            this.bgpLocalAs = new BgpLocalAsEnt(mib, this);
            this.bgpPeerTable = new BgpPeerTableEnt(mib, this);
            this.bgpIdentifier = new BgpIdentifierEnt(mib, this);
            this.bgpRcvdPathAttrTable = new BgpRcvdPathAttrTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.bgpVersion,
                this.bgpLocalAs,
                this.bgpPeerTable,
                this.bgpIdentifier,
                this.bgpRcvdPathAttrTable
            };
        }
        public static final class BgpVersionEnt extends MIBEntry<RFC1269MIBDef>
        {
            private BgpVersionEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
            {
                super(mib, parent, "bgpVersion", "1.3.6.1.2.1.15.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class BgpLocalAsEnt extends MIBEntry<RFC1269MIBDef>
        {
            private BgpLocalAsEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
            {
                super(mib, parent, "bgpLocalAs", "1.3.6.1.2.1.15.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class BgpPeerTableEnt extends MIBEntry<RFC1269MIBDef>
        {
            public final BgpPeerEntryEnt bgpPeerEntry;

            private BgpPeerTableEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
            {
                super(mib, parent, "bgpPeerTable", "1.3.6.1.2.1.15.3", false, true, false, false);
                this.bgpPeerEntry = new BgpPeerEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.bgpPeerEntry
                };
            }
            public static final class BgpPeerEntryEnt extends MIBEntry<RFC1269MIBDef>
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

                private BgpPeerEntryEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
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
                        this.bgpPeerLastError
                    };
                }
                public static final class BgpPeerIdentifierEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPeerIdentifierEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerIdentifier", "1.3.6.1.2.1.15.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerStateEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPeerStateEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerState", "1.3.6.1.2.1.15.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerAdminStatusEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPeerAdminStatusEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerAdminStatus", "1.3.6.1.2.1.15.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerNegotiatedVersionEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPeerNegotiatedVersionEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerNegotiatedVersion", "1.3.6.1.2.1.15.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerLocalAddrEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPeerLocalAddrEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerLocalAddr", "1.3.6.1.2.1.15.3.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerLocalPortEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPeerLocalPortEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerLocalPort", "1.3.6.1.2.1.15.3.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerRemoteAddrEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPeerRemoteAddrEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerRemoteAddr", "1.3.6.1.2.1.15.3.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerRemotePortEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPeerRemotePortEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerRemotePort", "1.3.6.1.2.1.15.3.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerRemoteAsEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPeerRemoteAsEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerRemoteAs", "1.3.6.1.2.1.15.3.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerInUpdatesEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPeerInUpdatesEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerInUpdates", "1.3.6.1.2.1.15.3.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerOutUpdatesEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPeerOutUpdatesEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerOutUpdates", "1.3.6.1.2.1.15.3.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerInTotalMessagesEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPeerInTotalMessagesEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerInTotalMessages", "1.3.6.1.2.1.15.3.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerOutTotalMessagesEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPeerOutTotalMessagesEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerOutTotalMessages", "1.3.6.1.2.1.15.3.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPeerLastErrorEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPeerLastErrorEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPeerLastError", "1.3.6.1.2.1.15.3.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class BgpIdentifierEnt extends MIBEntry<RFC1269MIBDef>
        {
            private BgpIdentifierEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
            {
                super(mib, parent, "bgpIdentifier", "1.3.6.1.2.1.15.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class BgpRcvdPathAttrTableEnt extends MIBEntry<RFC1269MIBDef>
        {
            public final BgpPathAttrEntryEnt bgpPathAttrEntry;

            private BgpRcvdPathAttrTableEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
            {
                super(mib, parent, "bgpRcvdPathAttrTable", "1.3.6.1.2.1.15.5", false, true, false, false);
                this.bgpPathAttrEntry = new BgpPathAttrEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.bgpPathAttrEntry
                };
            }
            public static final class BgpPathAttrEntryEnt extends MIBEntry<RFC1269MIBDef>
            {
                public final BgpPathAttrPeerEnt bgpPathAttrPeer;

                public final BgpPathAttrDestNetworkEnt bgpPathAttrDestNetwork;

                public final BgpPathAttrOriginEnt bgpPathAttrOrigin;

                public final BgpPathAttrASPathEnt bgpPathAttrASPath;

                public final BgpPathAttrNextHopEnt bgpPathAttrNextHop;

                public final BgpPathAttrInterASMetricEnt bgpPathAttrInterASMetric;

                private BgpPathAttrEntryEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
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
                public static final class BgpPathAttrPeerEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPathAttrPeerEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPathAttrPeer", "1.3.6.1.2.1.15.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPathAttrDestNetworkEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPathAttrDestNetworkEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPathAttrDestNetwork", "1.3.6.1.2.1.15.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPathAttrOriginEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPathAttrOriginEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPathAttrOrigin", "1.3.6.1.2.1.15.5.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPathAttrASPathEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPathAttrASPathEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPathAttrASPath", "1.3.6.1.2.1.15.5.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPathAttrNextHopEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPathAttrNextHopEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPathAttrNextHop", "1.3.6.1.2.1.15.5.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BgpPathAttrInterASMetricEnt extends MIBEntry<RFC1269MIBDef>
                {
                    private BgpPathAttrInterASMetricEnt(RFC1269MIBDef mib, MIBEntry<RFC1269MIBDef> parent)
                    {
                        super(mib, parent, "bgpPathAttrInterASMetric", "1.3.6.1.2.1.15.5.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
