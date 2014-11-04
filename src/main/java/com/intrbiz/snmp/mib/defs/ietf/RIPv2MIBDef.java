package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class RIPv2MIBDef extends MIB
{
    public static final RIPv2MIBDef RIPv2MIB = new RIPv2MIBDef();

    static { MIBs.getInstance().registerMIB(RIPv2MIBDef.RIPv2MIB); }

    /** This MIB module uses the extended OBJECT-TYPE macro asdefined in [9].

Wed Jul 27 22:53:04 PDT 1994*/
    public final Rip2Ent rip2;

    private RIPv2MIBDef()
    {
        super("RIPv2-MIB");
        this.rip2 = new Rip2Ent(this, null);
        this.entries = new MIBEntry<?>[] {
            this.rip2
        };
    }

    public static final class Rip2Ent extends MIBEntry<RIPv2MIBDef>
    {
        /** 4.1 Global Counters
The RIP-2 Globals Group.Implementation of this group is mandatory for systemswhich implement RIP-2.
These counters are intended to facilitate debugging quicklychanging routes or failing neighbors*/
        public final Rip2GlobalsEnt rip2Globals;

        /** 4.2 RIP Interface Tables
RIP Interfaces GroupsImplementation of these Groups is mandatory for systemswhich implement RIP-2.
The RIP Interface Status Table.*/
        public final Rip2IfStatTableEnt rip2IfStatTable;

        /** The RIP Interface Configuration Table.*/
        public final Rip2IfConfTableEnt rip2IfConfTable;

        /** 4.3 Peer Table
Peer Table
The RIP Peer GroupImplementation of this Group is Optional
This group provides information about active peerrelationships intended to assist in debugging.  Anactive peer is a router from which a valid RIPupdated has been heard in the last 180 seconds.*/
        public final Rip2PeerTableEnt rip2PeerTable;

        /** conformance information*/
        public final Rip2ConformanceEnt rip2Conformance;

        private Rip2Ent(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
        {
            super(mib, parent, "rip2", "1.3.6.1.2.1.23", false, false, false, false);
            this.rip2Globals = new Rip2GlobalsEnt(mib, this);
            this.rip2IfStatTable = new Rip2IfStatTableEnt(mib, this);
            this.rip2IfConfTable = new Rip2IfConfTableEnt(mib, this);
            this.rip2PeerTable = new Rip2PeerTableEnt(mib, this);
            this.rip2Conformance = new Rip2ConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.rip2Globals,
                this.rip2IfStatTable,
                this.rip2IfConfTable,
                this.rip2PeerTable,
                this.rip2Conformance
            };
        }
        public static final class Rip2GlobalsEnt extends MIBEntry<RIPv2MIBDef>
        {
            public final Rip2GlobalRouteChangesEnt rip2GlobalRouteChanges;

            public final Rip2GlobalQueriesEnt rip2GlobalQueries;

            private Rip2GlobalsEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
            {
                super(mib, parent, "rip2Globals", "1.3.6.1.2.1.23.1", false, false, false, false);
                this.rip2GlobalRouteChanges = new Rip2GlobalRouteChangesEnt(mib, this);
                this.rip2GlobalQueries = new Rip2GlobalQueriesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rip2GlobalRouteChanges,
                    this.rip2GlobalQueries
                };
            }
            public static final class Rip2GlobalRouteChangesEnt extends MIBEntry<RIPv2MIBDef>
            {
                private Rip2GlobalRouteChangesEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                {
                    super(mib, parent, "rip2GlobalRouteChanges", "1.3.6.1.2.1.23.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Rip2GlobalQueriesEnt extends MIBEntry<RIPv2MIBDef>
            {
                private Rip2GlobalQueriesEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                {
                    super(mib, parent, "rip2GlobalQueries", "1.3.6.1.2.1.23.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Rip2IfStatTableEnt extends MIBEntry<RIPv2MIBDef>
        {
            public final Rip2IfStatEntryEnt rip2IfStatEntry;

            private Rip2IfStatTableEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
            {
                super(mib, parent, "rip2IfStatTable", "1.3.6.1.2.1.23.2", false, true, false, false);
                this.rip2IfStatEntry = new Rip2IfStatEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rip2IfStatEntry
                };
            }
            public static final class Rip2IfStatEntryEnt extends MIBEntry<RIPv2MIBDef>
            {
                public final Rip2IfStatAddressEnt rip2IfStatAddress;

                public final Rip2IfStatRcvBadPacketsEnt rip2IfStatRcvBadPackets;

                public final Rip2IfStatRcvBadRoutesEnt rip2IfStatRcvBadRoutes;

                public final Rip2IfStatSentUpdatesEnt rip2IfStatSentUpdates;

                public final Rip2IfStatStatusEnt rip2IfStatStatus;

                private Rip2IfStatEntryEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                {
                    super(mib, parent, "rip2IfStatEntry", "1.3.6.1.2.1.23.2.1", false, false, false, true);
                    this.rip2IfStatAddress = new Rip2IfStatAddressEnt(mib, this);
                    this.rip2IfStatRcvBadPackets = new Rip2IfStatRcvBadPacketsEnt(mib, this);
                    this.rip2IfStatRcvBadRoutes = new Rip2IfStatRcvBadRoutesEnt(mib, this);
                    this.rip2IfStatSentUpdates = new Rip2IfStatSentUpdatesEnt(mib, this);
                    this.rip2IfStatStatus = new Rip2IfStatStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rip2IfStatAddress,
                        this.rip2IfStatRcvBadPackets,
                        this.rip2IfStatRcvBadRoutes,
                        this.rip2IfStatSentUpdates,
                        this.rip2IfStatStatus
                    };
                }
                public static final class Rip2IfStatAddressEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2IfStatAddressEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2IfStatAddress", "1.3.6.1.2.1.23.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2IfStatRcvBadPacketsEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2IfStatRcvBadPacketsEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2IfStatRcvBadPackets", "1.3.6.1.2.1.23.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2IfStatRcvBadRoutesEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2IfStatRcvBadRoutesEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2IfStatRcvBadRoutes", "1.3.6.1.2.1.23.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2IfStatSentUpdatesEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2IfStatSentUpdatesEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2IfStatSentUpdates", "1.3.6.1.2.1.23.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2IfStatStatusEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2IfStatStatusEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2IfStatStatus", "1.3.6.1.2.1.23.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Rip2IfConfTableEnt extends MIBEntry<RIPv2MIBDef>
        {
            public final Rip2IfConfEntryEnt rip2IfConfEntry;

            private Rip2IfConfTableEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
            {
                super(mib, parent, "rip2IfConfTable", "1.3.6.1.2.1.23.3", false, true, false, false);
                this.rip2IfConfEntry = new Rip2IfConfEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rip2IfConfEntry
                };
            }
            public static final class Rip2IfConfEntryEnt extends MIBEntry<RIPv2MIBDef>
            {
                public final Rip2IfConfAddressEnt rip2IfConfAddress;

                public final Rip2IfConfDomainEnt rip2IfConfDomain;

                public final Rip2IfConfAuthTypeEnt rip2IfConfAuthType;

                public final Rip2IfConfAuthKeyEnt rip2IfConfAuthKey;

                public final Rip2IfConfSendEnt rip2IfConfSend;

                public final Rip2IfConfReceiveEnt rip2IfConfReceive;

                public final Rip2IfConfDefaultMetricEnt rip2IfConfDefaultMetric;

                public final Rip2IfConfStatusEnt rip2IfConfStatus;

                public final Rip2IfConfSrcAddressEnt rip2IfConfSrcAddress;

                private Rip2IfConfEntryEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                {
                    super(mib, parent, "rip2IfConfEntry", "1.3.6.1.2.1.23.3.1", false, false, false, true);
                    this.rip2IfConfAddress = new Rip2IfConfAddressEnt(mib, this);
                    this.rip2IfConfDomain = new Rip2IfConfDomainEnt(mib, this);
                    this.rip2IfConfAuthType = new Rip2IfConfAuthTypeEnt(mib, this);
                    this.rip2IfConfAuthKey = new Rip2IfConfAuthKeyEnt(mib, this);
                    this.rip2IfConfSend = new Rip2IfConfSendEnt(mib, this);
                    this.rip2IfConfReceive = new Rip2IfConfReceiveEnt(mib, this);
                    this.rip2IfConfDefaultMetric = new Rip2IfConfDefaultMetricEnt(mib, this);
                    this.rip2IfConfStatus = new Rip2IfConfStatusEnt(mib, this);
                    this.rip2IfConfSrcAddress = new Rip2IfConfSrcAddressEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rip2IfConfAddress,
                        this.rip2IfConfDomain,
                        this.rip2IfConfAuthType,
                        this.rip2IfConfAuthKey,
                        this.rip2IfConfSend,
                        this.rip2IfConfReceive,
                        this.rip2IfConfDefaultMetric,
                        this.rip2IfConfStatus,
                        this.rip2IfConfSrcAddress
                    };
                }
                public static final class Rip2IfConfAddressEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2IfConfAddressEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2IfConfAddress", "1.3.6.1.2.1.23.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2IfConfDomainEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2IfConfDomainEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2IfConfDomain", "1.3.6.1.2.1.23.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2IfConfAuthTypeEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2IfConfAuthTypeEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2IfConfAuthType", "1.3.6.1.2.1.23.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2IfConfAuthKeyEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2IfConfAuthKeyEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2IfConfAuthKey", "1.3.6.1.2.1.23.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2IfConfSendEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2IfConfSendEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2IfConfSend", "1.3.6.1.2.1.23.3.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2IfConfReceiveEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2IfConfReceiveEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2IfConfReceive", "1.3.6.1.2.1.23.3.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2IfConfDefaultMetricEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2IfConfDefaultMetricEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2IfConfDefaultMetric", "1.3.6.1.2.1.23.3.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2IfConfStatusEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2IfConfStatusEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2IfConfStatus", "1.3.6.1.2.1.23.3.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2IfConfSrcAddressEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2IfConfSrcAddressEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2IfConfSrcAddress", "1.3.6.1.2.1.23.3.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Rip2PeerTableEnt extends MIBEntry<RIPv2MIBDef>
        {
            public final Rip2PeerEntryEnt rip2PeerEntry;

            private Rip2PeerTableEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
            {
                super(mib, parent, "rip2PeerTable", "1.3.6.1.2.1.23.4", false, true, false, false);
                this.rip2PeerEntry = new Rip2PeerEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rip2PeerEntry
                };
            }
            public static final class Rip2PeerEntryEnt extends MIBEntry<RIPv2MIBDef>
            {
                public final Rip2PeerAddressEnt rip2PeerAddress;

                public final Rip2PeerDomainEnt rip2PeerDomain;

                public final Rip2PeerLastUpdateEnt rip2PeerLastUpdate;

                public final Rip2PeerVersionEnt rip2PeerVersion;

                public final Rip2PeerRcvBadPacketsEnt rip2PeerRcvBadPackets;

                public final Rip2PeerRcvBadRoutesEnt rip2PeerRcvBadRoutes;

                private Rip2PeerEntryEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                {
                    super(mib, parent, "rip2PeerEntry", "1.3.6.1.2.1.23.4.1", false, false, false, true);
                    this.rip2PeerAddress = new Rip2PeerAddressEnt(mib, this);
                    this.rip2PeerDomain = new Rip2PeerDomainEnt(mib, this);
                    this.rip2PeerLastUpdate = new Rip2PeerLastUpdateEnt(mib, this);
                    this.rip2PeerVersion = new Rip2PeerVersionEnt(mib, this);
                    this.rip2PeerRcvBadPackets = new Rip2PeerRcvBadPacketsEnt(mib, this);
                    this.rip2PeerRcvBadRoutes = new Rip2PeerRcvBadRoutesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rip2PeerAddress,
                        this.rip2PeerDomain,
                        this.rip2PeerLastUpdate,
                        this.rip2PeerVersion,
                        this.rip2PeerRcvBadPackets,
                        this.rip2PeerRcvBadRoutes
                    };
                }
                public static final class Rip2PeerAddressEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2PeerAddressEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2PeerAddress", "1.3.6.1.2.1.23.4.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2PeerDomainEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2PeerDomainEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2PeerDomain", "1.3.6.1.2.1.23.4.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2PeerLastUpdateEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2PeerLastUpdateEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2PeerLastUpdate", "1.3.6.1.2.1.23.4.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2PeerVersionEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2PeerVersionEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2PeerVersion", "1.3.6.1.2.1.23.4.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2PeerRcvBadPacketsEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2PeerRcvBadPacketsEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2PeerRcvBadPackets", "1.3.6.1.2.1.23.4.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2PeerRcvBadRoutesEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2PeerRcvBadRoutesEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2PeerRcvBadRoutes", "1.3.6.1.2.1.23.4.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Rip2ConformanceEnt extends MIBEntry<RIPv2MIBDef>
        {
            public final Rip2GroupsEnt rip2Groups;

            public final Rip2CompliancesEnt rip2Compliances;

            private Rip2ConformanceEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
            {
                super(mib, parent, "rip2Conformance", "1.3.6.1.2.1.23.5", false, false, false, false);
                this.rip2Groups = new Rip2GroupsEnt(mib, this);
                this.rip2Compliances = new Rip2CompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rip2Groups,
                    this.rip2Compliances
                };
            }
            public static final class Rip2GroupsEnt extends MIBEntry<RIPv2MIBDef>
            {
                /** units of conformance*/
                public final Rip2GlobalGroupEnt rip2GlobalGroup;

                public final Rip2IfStatGroupEnt rip2IfStatGroup;

                public final Rip2IfConfGroupEnt rip2IfConfGroup;

                public final Rip2PeerGroupEnt rip2PeerGroup;

                private Rip2GroupsEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                {
                    super(mib, parent, "rip2Groups", "1.3.6.1.2.1.23.5.1", false, false, false, false);
                    this.rip2GlobalGroup = new Rip2GlobalGroupEnt(mib, this);
                    this.rip2IfStatGroup = new Rip2IfStatGroupEnt(mib, this);
                    this.rip2IfConfGroup = new Rip2IfConfGroupEnt(mib, this);
                    this.rip2PeerGroup = new Rip2PeerGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rip2GlobalGroup,
                        this.rip2IfStatGroup,
                        this.rip2IfConfGroup,
                        this.rip2PeerGroup
                    };
                }
                public static final class Rip2GlobalGroupEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2GlobalGroupEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2GlobalGroup", "1.3.6.1.2.1.23.5.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2IfStatGroupEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2IfStatGroupEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2IfStatGroup", "1.3.6.1.2.1.23.5.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2IfConfGroupEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2IfConfGroupEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2IfConfGroup", "1.3.6.1.2.1.23.5.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Rip2PeerGroupEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2PeerGroupEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2PeerGroup", "1.3.6.1.2.1.23.5.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Rip2CompliancesEnt extends MIBEntry<RIPv2MIBDef>
            {
                /** compliance statements*/
                public final Rip2ComplianceEnt rip2Compliance;

                private Rip2CompliancesEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                {
                    super(mib, parent, "rip2Compliances", "1.3.6.1.2.1.23.5.2", false, false, false, false);
                    this.rip2Compliance = new Rip2ComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rip2Compliance
                    };
                }
                public static final class Rip2ComplianceEnt extends MIBEntry<RIPv2MIBDef>
                {
                    private Rip2ComplianceEnt(RIPv2MIBDef mib, MIBEntry<RIPv2MIBDef> parent)
                    {
                        super(mib, parent, "rip2Compliance", "1.3.6.1.2.1.23.5.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
