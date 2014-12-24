package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class IPV6MIBDef extends MIB
{
    public static final IPV6MIBDef IPV6MIB = new IPV6MIBDef();

    public final Ipv6MIBEnt ipv6MIB;

    private IPV6MIBDef()
    {
        super("IPV6-MIB");
        this.ipv6MIB = new Ipv6MIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ipv6MIB
        };
    }

    public static final class Ipv6MIBEnt extends MIBEntry<IPV6MIBDef>
    {
        /** the IPv6 general group*/
        public final Ipv6MIBObjectsEnt ipv6MIBObjects;

        /** definition of IPv6-related notifications.Note that we need ipv6NotificationPrefix with the 0sub-identifier to make this MIB to translate toan SNMPv1 format in a reversible way. For exampleit is needed for proxies that convert SNMPv1 trapsto SNMPv2 notifications without MIB knowledge.*/
        public final Ipv6NotificationsEnt ipv6Notifications;

        /** conformance information*/
        public final Ipv6ConformanceEnt ipv6Conformance;

        private Ipv6MIBEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
        {
            super(mib, parent, "ipv6MIB", "1.3.6.1.2.1.55", false, false, false, false);
            this.ipv6MIBObjects = new Ipv6MIBObjectsEnt(mib, this);
            this.ipv6Notifications = new Ipv6NotificationsEnt(mib, this);
            this.ipv6Conformance = new Ipv6ConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipv6MIBObjects,
                this.ipv6Notifications,
                this.ipv6Conformance
            };
        }
        public static final class Ipv6MIBObjectsEnt extends MIBEntry<IPV6MIBDef>
        {
            public final Ipv6ForwardingEnt ipv6Forwarding;

            public final Ipv6DefaultHopLimitEnt ipv6DefaultHopLimit;

            public final Ipv6InterfacesEnt ipv6Interfaces;

            public final Ipv6IfTableLastChangeEnt ipv6IfTableLastChange;

            /** the IPv6 Interfaces table*/
            public final Ipv6IfTableEnt ipv6IfTable;

            /** IPv6 Interface Statistics table*/
            public final Ipv6IfStatsTableEnt ipv6IfStatsTable;

            /** Address Prefix table
The IPv6 Address Prefix table contains information onthe entity's IPv6 Address Prefixes that are associatedwith IPv6 interfaces.*/
            public final Ipv6AddrPrefixTableEnt ipv6AddrPrefixTable;

            /** the IPv6 Address table
The IPv6 address table contains this node's IPv6addressing information.*/
            public final Ipv6AddrTableEnt ipv6AddrTable;

            /** IPv6 Routing objects*/
            public final Ipv6RouteNumberEnt ipv6RouteNumber;

            public final Ipv6DiscardedRoutesEnt ipv6DiscardedRoutes;

            /** IPv6 Routing table*/
            public final Ipv6RouteTableEnt ipv6RouteTable;

            /** IPv6 Address Translation table*/
            public final Ipv6NetToMediaTableEnt ipv6NetToMediaTable;

            private Ipv6MIBObjectsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
            {
                super(mib, parent, "ipv6MIBObjects", "1.3.6.1.2.1.55.1", false, false, false, false);
                this.ipv6Forwarding = new Ipv6ForwardingEnt(mib, this);
                this.ipv6DefaultHopLimit = new Ipv6DefaultHopLimitEnt(mib, this);
                this.ipv6Interfaces = new Ipv6InterfacesEnt(mib, this);
                this.ipv6IfTableLastChange = new Ipv6IfTableLastChangeEnt(mib, this);
                this.ipv6IfTable = new Ipv6IfTableEnt(mib, this);
                this.ipv6IfStatsTable = new Ipv6IfStatsTableEnt(mib, this);
                this.ipv6AddrPrefixTable = new Ipv6AddrPrefixTableEnt(mib, this);
                this.ipv6AddrTable = new Ipv6AddrTableEnt(mib, this);
                this.ipv6RouteNumber = new Ipv6RouteNumberEnt(mib, this);
                this.ipv6DiscardedRoutes = new Ipv6DiscardedRoutesEnt(mib, this);
                this.ipv6RouteTable = new Ipv6RouteTableEnt(mib, this);
                this.ipv6NetToMediaTable = new Ipv6NetToMediaTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipv6Forwarding,
                    this.ipv6DefaultHopLimit,
                    this.ipv6Interfaces,
                    this.ipv6IfTableLastChange,
                    this.ipv6IfTable,
                    this.ipv6IfStatsTable,
                    this.ipv6AddrPrefixTable,
                    this.ipv6AddrTable,
                    this.ipv6RouteNumber,
                    this.ipv6DiscardedRoutes,
                    this.ipv6RouteTable,
                    this.ipv6NetToMediaTable
                };
            }
            public static final class Ipv6ForwardingEnt extends MIBEntry<IPV6MIBDef>
            {
                private Ipv6ForwardingEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                {
                    super(mib, parent, "ipv6Forwarding", "1.3.6.1.2.1.55.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6DefaultHopLimitEnt extends MIBEntry<IPV6MIBDef>
            {
                private Ipv6DefaultHopLimitEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                {
                    super(mib, parent, "ipv6DefaultHopLimit", "1.3.6.1.2.1.55.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6InterfacesEnt extends MIBEntry<IPV6MIBDef>
            {
                private Ipv6InterfacesEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                {
                    super(mib, parent, "ipv6Interfaces", "1.3.6.1.2.1.55.1.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6IfTableLastChangeEnt extends MIBEntry<IPV6MIBDef>
            {
                private Ipv6IfTableLastChangeEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                {
                    super(mib, parent, "ipv6IfTableLastChange", "1.3.6.1.2.1.55.1.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6IfTableEnt extends MIBEntry<IPV6MIBDef>
            {
                public final Ipv6IfEntryEnt ipv6IfEntry;

                private Ipv6IfTableEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                {
                    super(mib, parent, "ipv6IfTable", "1.3.6.1.2.1.55.1.5", false, true, false, false);
                    this.ipv6IfEntry = new Ipv6IfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipv6IfEntry
                    };
                }
                public static final class Ipv6IfEntryEnt extends MIBEntry<IPV6MIBDef>
                {
                    public final Ipv6IfIndexEnt ipv6IfIndex;

                    public final Ipv6IfDescrEnt ipv6IfDescr;

                    public final Ipv6IfLowerLayerEnt ipv6IfLowerLayer;

                    public final Ipv6IfEffectiveMtuEnt ipv6IfEffectiveMtu;

                    public final Ipv6IfReasmMaxSizeEnt ipv6IfReasmMaxSize;

                    public final Ipv6IfIdentifierEnt ipv6IfIdentifier;

                    public final Ipv6IfIdentifierLengthEnt ipv6IfIdentifierLength;

                    public final Ipv6IfPhysicalAddressEnt ipv6IfPhysicalAddress;

                    public final Ipv6IfAdminStatusEnt ipv6IfAdminStatus;

                    public final Ipv6IfOperStatusEnt ipv6IfOperStatus;

                    public final Ipv6IfLastChangeEnt ipv6IfLastChange;

                    private Ipv6IfEntryEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                    {
                        super(mib, parent, "ipv6IfEntry", "1.3.6.1.2.1.55.1.5.1", false, false, false, true);
                        this.ipv6IfIndex = new Ipv6IfIndexEnt(mib, this);
                        this.ipv6IfDescr = new Ipv6IfDescrEnt(mib, this);
                        this.ipv6IfLowerLayer = new Ipv6IfLowerLayerEnt(mib, this);
                        this.ipv6IfEffectiveMtu = new Ipv6IfEffectiveMtuEnt(mib, this);
                        this.ipv6IfReasmMaxSize = new Ipv6IfReasmMaxSizeEnt(mib, this);
                        this.ipv6IfIdentifier = new Ipv6IfIdentifierEnt(mib, this);
                        this.ipv6IfIdentifierLength = new Ipv6IfIdentifierLengthEnt(mib, this);
                        this.ipv6IfPhysicalAddress = new Ipv6IfPhysicalAddressEnt(mib, this);
                        this.ipv6IfAdminStatus = new Ipv6IfAdminStatusEnt(mib, this);
                        this.ipv6IfOperStatus = new Ipv6IfOperStatusEnt(mib, this);
                        this.ipv6IfLastChange = new Ipv6IfLastChangeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipv6IfIndex,
                            this.ipv6IfDescr,
                            this.ipv6IfLowerLayer,
                            this.ipv6IfEffectiveMtu,
                            this.ipv6IfReasmMaxSize,
                            this.ipv6IfIdentifier,
                            this.ipv6IfIdentifierLength,
                            this.ipv6IfPhysicalAddress,
                            this.ipv6IfAdminStatus,
                            this.ipv6IfOperStatus,
                            this.ipv6IfLastChange
                        };
                    }
                    public static final class Ipv6IfIndexEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfIndexEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIndex", "1.3.6.1.2.1.55.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfDescrEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfDescrEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfDescr", "1.3.6.1.2.1.55.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfLowerLayerEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfLowerLayerEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfLowerLayer", "1.3.6.1.2.1.55.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfEffectiveMtuEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfEffectiveMtuEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfEffectiveMtu", "1.3.6.1.2.1.55.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfReasmMaxSizeEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfReasmMaxSizeEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfReasmMaxSize", "1.3.6.1.2.1.55.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIdentifierEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfIdentifierEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIdentifier", "1.3.6.1.2.1.55.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIdentifierLengthEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfIdentifierLengthEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIdentifierLength", "1.3.6.1.2.1.55.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfPhysicalAddressEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfPhysicalAddressEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfPhysicalAddress", "1.3.6.1.2.1.55.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfAdminStatusEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfAdminStatusEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfAdminStatus", "1.3.6.1.2.1.55.1.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfOperStatusEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfOperStatusEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfOperStatus", "1.3.6.1.2.1.55.1.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfLastChangeEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfLastChangeEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfLastChange", "1.3.6.1.2.1.55.1.5.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Ipv6IfStatsTableEnt extends MIBEntry<IPV6MIBDef>
            {
                public final Ipv6IfStatsEntryEnt ipv6IfStatsEntry;

                private Ipv6IfStatsTableEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                {
                    super(mib, parent, "ipv6IfStatsTable", "1.3.6.1.2.1.55.1.6", false, true, false, false);
                    this.ipv6IfStatsEntry = new Ipv6IfStatsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipv6IfStatsEntry
                    };
                }
                public static final class Ipv6IfStatsEntryEnt extends MIBEntry<IPV6MIBDef>
                {
                    public final Ipv6IfStatsInReceivesEnt ipv6IfStatsInReceives;

                    public final Ipv6IfStatsInHdrErrorsEnt ipv6IfStatsInHdrErrors;

                    public final Ipv6IfStatsInTooBigErrorsEnt ipv6IfStatsInTooBigErrors;

                    public final Ipv6IfStatsInNoRoutesEnt ipv6IfStatsInNoRoutes;

                    public final Ipv6IfStatsInAddrErrorsEnt ipv6IfStatsInAddrErrors;

                    public final Ipv6IfStatsInUnknownProtosEnt ipv6IfStatsInUnknownProtos;

                    public final Ipv6IfStatsInTruncatedPktsEnt ipv6IfStatsInTruncatedPkts;

                    public final Ipv6IfStatsInDiscardsEnt ipv6IfStatsInDiscards;

                    public final Ipv6IfStatsInDeliversEnt ipv6IfStatsInDelivers;

                    public final Ipv6IfStatsOutForwDatagramsEnt ipv6IfStatsOutForwDatagrams;

                    public final Ipv6IfStatsOutRequestsEnt ipv6IfStatsOutRequests;

                    public final Ipv6IfStatsOutDiscardsEnt ipv6IfStatsOutDiscards;

                    public final Ipv6IfStatsOutFragOKsEnt ipv6IfStatsOutFragOKs;

                    public final Ipv6IfStatsOutFragFailsEnt ipv6IfStatsOutFragFails;

                    public final Ipv6IfStatsOutFragCreatesEnt ipv6IfStatsOutFragCreates;

                    public final Ipv6IfStatsReasmReqdsEnt ipv6IfStatsReasmReqds;

                    public final Ipv6IfStatsReasmOKsEnt ipv6IfStatsReasmOKs;

                    public final Ipv6IfStatsReasmFailsEnt ipv6IfStatsReasmFails;

                    public final Ipv6IfStatsInMcastPktsEnt ipv6IfStatsInMcastPkts;

                    public final Ipv6IfStatsOutMcastPktsEnt ipv6IfStatsOutMcastPkts;

                    private Ipv6IfStatsEntryEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                    {
                        super(mib, parent, "ipv6IfStatsEntry", "1.3.6.1.2.1.55.1.6.1", false, false, false, true);
                        this.ipv6IfStatsInReceives = new Ipv6IfStatsInReceivesEnt(mib, this);
                        this.ipv6IfStatsInHdrErrors = new Ipv6IfStatsInHdrErrorsEnt(mib, this);
                        this.ipv6IfStatsInTooBigErrors = new Ipv6IfStatsInTooBigErrorsEnt(mib, this);
                        this.ipv6IfStatsInNoRoutes = new Ipv6IfStatsInNoRoutesEnt(mib, this);
                        this.ipv6IfStatsInAddrErrors = new Ipv6IfStatsInAddrErrorsEnt(mib, this);
                        this.ipv6IfStatsInUnknownProtos = new Ipv6IfStatsInUnknownProtosEnt(mib, this);
                        this.ipv6IfStatsInTruncatedPkts = new Ipv6IfStatsInTruncatedPktsEnt(mib, this);
                        this.ipv6IfStatsInDiscards = new Ipv6IfStatsInDiscardsEnt(mib, this);
                        this.ipv6IfStatsInDelivers = new Ipv6IfStatsInDeliversEnt(mib, this);
                        this.ipv6IfStatsOutForwDatagrams = new Ipv6IfStatsOutForwDatagramsEnt(mib, this);
                        this.ipv6IfStatsOutRequests = new Ipv6IfStatsOutRequestsEnt(mib, this);
                        this.ipv6IfStatsOutDiscards = new Ipv6IfStatsOutDiscardsEnt(mib, this);
                        this.ipv6IfStatsOutFragOKs = new Ipv6IfStatsOutFragOKsEnt(mib, this);
                        this.ipv6IfStatsOutFragFails = new Ipv6IfStatsOutFragFailsEnt(mib, this);
                        this.ipv6IfStatsOutFragCreates = new Ipv6IfStatsOutFragCreatesEnt(mib, this);
                        this.ipv6IfStatsReasmReqds = new Ipv6IfStatsReasmReqdsEnt(mib, this);
                        this.ipv6IfStatsReasmOKs = new Ipv6IfStatsReasmOKsEnt(mib, this);
                        this.ipv6IfStatsReasmFails = new Ipv6IfStatsReasmFailsEnt(mib, this);
                        this.ipv6IfStatsInMcastPkts = new Ipv6IfStatsInMcastPktsEnt(mib, this);
                        this.ipv6IfStatsOutMcastPkts = new Ipv6IfStatsOutMcastPktsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipv6IfStatsInReceives,
                            this.ipv6IfStatsInHdrErrors,
                            this.ipv6IfStatsInTooBigErrors,
                            this.ipv6IfStatsInNoRoutes,
                            this.ipv6IfStatsInAddrErrors,
                            this.ipv6IfStatsInUnknownProtos,
                            this.ipv6IfStatsInTruncatedPkts,
                            this.ipv6IfStatsInDiscards,
                            this.ipv6IfStatsInDelivers,
                            this.ipv6IfStatsOutForwDatagrams,
                            this.ipv6IfStatsOutRequests,
                            this.ipv6IfStatsOutDiscards,
                            this.ipv6IfStatsOutFragOKs,
                            this.ipv6IfStatsOutFragFails,
                            this.ipv6IfStatsOutFragCreates,
                            this.ipv6IfStatsReasmReqds,
                            this.ipv6IfStatsReasmOKs,
                            this.ipv6IfStatsReasmFails,
                            this.ipv6IfStatsInMcastPkts,
                            this.ipv6IfStatsOutMcastPkts
                        };
                    }
                    public static final class Ipv6IfStatsInReceivesEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsInReceivesEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsInReceives", "1.3.6.1.2.1.55.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsInHdrErrorsEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsInHdrErrorsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsInHdrErrors", "1.3.6.1.2.1.55.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsInTooBigErrorsEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsInTooBigErrorsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsInTooBigErrors", "1.3.6.1.2.1.55.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsInNoRoutesEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsInNoRoutesEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsInNoRoutes", "1.3.6.1.2.1.55.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsInAddrErrorsEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsInAddrErrorsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsInAddrErrors", "1.3.6.1.2.1.55.1.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsInUnknownProtosEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsInUnknownProtosEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsInUnknownProtos", "1.3.6.1.2.1.55.1.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsInTruncatedPktsEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsInTruncatedPktsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsInTruncatedPkts", "1.3.6.1.2.1.55.1.6.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsInDiscardsEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsInDiscardsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsInDiscards", "1.3.6.1.2.1.55.1.6.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsInDeliversEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsInDeliversEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsInDelivers", "1.3.6.1.2.1.55.1.6.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsOutForwDatagramsEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsOutForwDatagramsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsOutForwDatagrams", "1.3.6.1.2.1.55.1.6.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsOutRequestsEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsOutRequestsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsOutRequests", "1.3.6.1.2.1.55.1.6.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsOutDiscardsEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsOutDiscardsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsOutDiscards", "1.3.6.1.2.1.55.1.6.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsOutFragOKsEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsOutFragOKsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsOutFragOKs", "1.3.6.1.2.1.55.1.6.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsOutFragFailsEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsOutFragFailsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsOutFragFails", "1.3.6.1.2.1.55.1.6.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsOutFragCreatesEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsOutFragCreatesEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsOutFragCreates", "1.3.6.1.2.1.55.1.6.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsReasmReqdsEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsReasmReqdsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsReasmReqds", "1.3.6.1.2.1.55.1.6.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsReasmOKsEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsReasmOKsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsReasmOKs", "1.3.6.1.2.1.55.1.6.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsReasmFailsEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsReasmFailsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsReasmFails", "1.3.6.1.2.1.55.1.6.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsInMcastPktsEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsInMcastPktsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsInMcastPkts", "1.3.6.1.2.1.55.1.6.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfStatsOutMcastPktsEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfStatsOutMcastPktsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfStatsOutMcastPkts", "1.3.6.1.2.1.55.1.6.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Ipv6AddrPrefixTableEnt extends MIBEntry<IPV6MIBDef>
            {
                public final Ipv6AddrPrefixEntryEnt ipv6AddrPrefixEntry;

                private Ipv6AddrPrefixTableEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                {
                    super(mib, parent, "ipv6AddrPrefixTable", "1.3.6.1.2.1.55.1.7", false, true, false, false);
                    this.ipv6AddrPrefixEntry = new Ipv6AddrPrefixEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipv6AddrPrefixEntry
                    };
                }
                public static final class Ipv6AddrPrefixEntryEnt extends MIBEntry<IPV6MIBDef>
                {
                    public final Ipv6AddrPrefixEnt ipv6AddrPrefix;

                    public final Ipv6AddrPrefixLengthEnt ipv6AddrPrefixLength;

                    public final Ipv6AddrPrefixOnLinkFlagEnt ipv6AddrPrefixOnLinkFlag;

                    public final Ipv6AddrPrefixAutonomousFlagEnt ipv6AddrPrefixAutonomousFlag;

                    public final Ipv6AddrPrefixAdvPreferredLifetimeEnt ipv6AddrPrefixAdvPreferredLifetime;

                    public final Ipv6AddrPrefixAdvValidLifetimeEnt ipv6AddrPrefixAdvValidLifetime;

                    private Ipv6AddrPrefixEntryEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                    {
                        super(mib, parent, "ipv6AddrPrefixEntry", "1.3.6.1.2.1.55.1.7.1", false, false, false, true);
                        this.ipv6AddrPrefix = new Ipv6AddrPrefixEnt(mib, this);
                        this.ipv6AddrPrefixLength = new Ipv6AddrPrefixLengthEnt(mib, this);
                        this.ipv6AddrPrefixOnLinkFlag = new Ipv6AddrPrefixOnLinkFlagEnt(mib, this);
                        this.ipv6AddrPrefixAutonomousFlag = new Ipv6AddrPrefixAutonomousFlagEnt(mib, this);
                        this.ipv6AddrPrefixAdvPreferredLifetime = new Ipv6AddrPrefixAdvPreferredLifetimeEnt(mib, this);
                        this.ipv6AddrPrefixAdvValidLifetime = new Ipv6AddrPrefixAdvValidLifetimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipv6AddrPrefix,
                            this.ipv6AddrPrefixLength,
                            this.ipv6AddrPrefixOnLinkFlag,
                            this.ipv6AddrPrefixAutonomousFlag,
                            this.ipv6AddrPrefixAdvPreferredLifetime,
                            this.ipv6AddrPrefixAdvValidLifetime
                        };
                    }
                    public static final class Ipv6AddrPrefixEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6AddrPrefixEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6AddrPrefix", "1.3.6.1.2.1.55.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6AddrPrefixLengthEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6AddrPrefixLengthEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6AddrPrefixLength", "1.3.6.1.2.1.55.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6AddrPrefixOnLinkFlagEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6AddrPrefixOnLinkFlagEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6AddrPrefixOnLinkFlag", "1.3.6.1.2.1.55.1.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6AddrPrefixAutonomousFlagEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6AddrPrefixAutonomousFlagEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6AddrPrefixAutonomousFlag", "1.3.6.1.2.1.55.1.7.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6AddrPrefixAdvPreferredLifetimeEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6AddrPrefixAdvPreferredLifetimeEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6AddrPrefixAdvPreferredLifetime", "1.3.6.1.2.1.55.1.7.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6AddrPrefixAdvValidLifetimeEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6AddrPrefixAdvValidLifetimeEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6AddrPrefixAdvValidLifetime", "1.3.6.1.2.1.55.1.7.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Ipv6AddrTableEnt extends MIBEntry<IPV6MIBDef>
            {
                public final Ipv6AddrEntryEnt ipv6AddrEntry;

                private Ipv6AddrTableEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                {
                    super(mib, parent, "ipv6AddrTable", "1.3.6.1.2.1.55.1.8", false, true, false, false);
                    this.ipv6AddrEntry = new Ipv6AddrEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipv6AddrEntry
                    };
                }
                public static final class Ipv6AddrEntryEnt extends MIBEntry<IPV6MIBDef>
                {
                    public final Ipv6AddrAddressEnt ipv6AddrAddress;

                    public final Ipv6AddrPfxLengthEnt ipv6AddrPfxLength;

                    public final Ipv6AddrTypeEnt ipv6AddrType;

                    public final Ipv6AddrAnycastFlagEnt ipv6AddrAnycastFlag;

                    public final Ipv6AddrStatusEnt ipv6AddrStatus;

                    private Ipv6AddrEntryEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                    {
                        super(mib, parent, "ipv6AddrEntry", "1.3.6.1.2.1.55.1.8.1", false, false, false, true);
                        this.ipv6AddrAddress = new Ipv6AddrAddressEnt(mib, this);
                        this.ipv6AddrPfxLength = new Ipv6AddrPfxLengthEnt(mib, this);
                        this.ipv6AddrType = new Ipv6AddrTypeEnt(mib, this);
                        this.ipv6AddrAnycastFlag = new Ipv6AddrAnycastFlagEnt(mib, this);
                        this.ipv6AddrStatus = new Ipv6AddrStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipv6AddrAddress,
                            this.ipv6AddrPfxLength,
                            this.ipv6AddrType,
                            this.ipv6AddrAnycastFlag,
                            this.ipv6AddrStatus
                        };
                    }
                    public static final class Ipv6AddrAddressEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6AddrAddressEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6AddrAddress", "1.3.6.1.2.1.55.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6AddrPfxLengthEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6AddrPfxLengthEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6AddrPfxLength", "1.3.6.1.2.1.55.1.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6AddrTypeEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6AddrTypeEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6AddrType", "1.3.6.1.2.1.55.1.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6AddrAnycastFlagEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6AddrAnycastFlagEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6AddrAnycastFlag", "1.3.6.1.2.1.55.1.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6AddrStatusEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6AddrStatusEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6AddrStatus", "1.3.6.1.2.1.55.1.8.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Ipv6RouteNumberEnt extends MIBEntry<IPV6MIBDef>
            {
                private Ipv6RouteNumberEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                {
                    super(mib, parent, "ipv6RouteNumber", "1.3.6.1.2.1.55.1.9", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6DiscardedRoutesEnt extends MIBEntry<IPV6MIBDef>
            {
                private Ipv6DiscardedRoutesEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                {
                    super(mib, parent, "ipv6DiscardedRoutes", "1.3.6.1.2.1.55.1.10", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6RouteTableEnt extends MIBEntry<IPV6MIBDef>
            {
                public final Ipv6RouteEntryEnt ipv6RouteEntry;

                private Ipv6RouteTableEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                {
                    super(mib, parent, "ipv6RouteTable", "1.3.6.1.2.1.55.1.11", false, true, false, false);
                    this.ipv6RouteEntry = new Ipv6RouteEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipv6RouteEntry
                    };
                }
                public static final class Ipv6RouteEntryEnt extends MIBEntry<IPV6MIBDef>
                {
                    public final Ipv6RouteDestEnt ipv6RouteDest;

                    public final Ipv6RoutePfxLengthEnt ipv6RoutePfxLength;

                    public final Ipv6RouteIndexEnt ipv6RouteIndex;

                    public final Ipv6RouteIfIndexEnt ipv6RouteIfIndex;

                    public final Ipv6RouteNextHopEnt ipv6RouteNextHop;

                    public final Ipv6RouteTypeEnt ipv6RouteType;

                    public final Ipv6RouteProtocolEnt ipv6RouteProtocol;

                    public final Ipv6RoutePolicyEnt ipv6RoutePolicy;

                    public final Ipv6RouteAgeEnt ipv6RouteAge;

                    public final Ipv6RouteNextHopRDIEnt ipv6RouteNextHopRDI;

                    public final Ipv6RouteMetricEnt ipv6RouteMetric;

                    public final Ipv6RouteWeightEnt ipv6RouteWeight;

                    public final Ipv6RouteInfoEnt ipv6RouteInfo;

                    public final Ipv6RouteValidEnt ipv6RouteValid;

                    private Ipv6RouteEntryEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                    {
                        super(mib, parent, "ipv6RouteEntry", "1.3.6.1.2.1.55.1.11.1", false, false, false, true);
                        this.ipv6RouteDest = new Ipv6RouteDestEnt(mib, this);
                        this.ipv6RoutePfxLength = new Ipv6RoutePfxLengthEnt(mib, this);
                        this.ipv6RouteIndex = new Ipv6RouteIndexEnt(mib, this);
                        this.ipv6RouteIfIndex = new Ipv6RouteIfIndexEnt(mib, this);
                        this.ipv6RouteNextHop = new Ipv6RouteNextHopEnt(mib, this);
                        this.ipv6RouteType = new Ipv6RouteTypeEnt(mib, this);
                        this.ipv6RouteProtocol = new Ipv6RouteProtocolEnt(mib, this);
                        this.ipv6RoutePolicy = new Ipv6RoutePolicyEnt(mib, this);
                        this.ipv6RouteAge = new Ipv6RouteAgeEnt(mib, this);
                        this.ipv6RouteNextHopRDI = new Ipv6RouteNextHopRDIEnt(mib, this);
                        this.ipv6RouteMetric = new Ipv6RouteMetricEnt(mib, this);
                        this.ipv6RouteWeight = new Ipv6RouteWeightEnt(mib, this);
                        this.ipv6RouteInfo = new Ipv6RouteInfoEnt(mib, this);
                        this.ipv6RouteValid = new Ipv6RouteValidEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipv6RouteDest,
                            this.ipv6RoutePfxLength,
                            this.ipv6RouteIndex,
                            this.ipv6RouteIfIndex,
                            this.ipv6RouteNextHop,
                            this.ipv6RouteType,
                            this.ipv6RouteProtocol,
                            this.ipv6RoutePolicy,
                            this.ipv6RouteAge,
                            this.ipv6RouteNextHopRDI,
                            this.ipv6RouteMetric,
                            this.ipv6RouteWeight,
                            this.ipv6RouteInfo,
                            this.ipv6RouteValid
                        };
                    }
                    public static final class Ipv6RouteDestEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6RouteDestEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6RouteDest", "1.3.6.1.2.1.55.1.11.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6RoutePfxLengthEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6RoutePfxLengthEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6RoutePfxLength", "1.3.6.1.2.1.55.1.11.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6RouteIndexEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6RouteIndexEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6RouteIndex", "1.3.6.1.2.1.55.1.11.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6RouteIfIndexEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6RouteIfIndexEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6RouteIfIndex", "1.3.6.1.2.1.55.1.11.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6RouteNextHopEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6RouteNextHopEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6RouteNextHop", "1.3.6.1.2.1.55.1.11.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6RouteTypeEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6RouteTypeEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6RouteType", "1.3.6.1.2.1.55.1.11.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6RouteProtocolEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6RouteProtocolEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6RouteProtocol", "1.3.6.1.2.1.55.1.11.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6RoutePolicyEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6RoutePolicyEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6RoutePolicy", "1.3.6.1.2.1.55.1.11.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6RouteAgeEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6RouteAgeEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6RouteAge", "1.3.6.1.2.1.55.1.11.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6RouteNextHopRDIEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6RouteNextHopRDIEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6RouteNextHopRDI", "1.3.6.1.2.1.55.1.11.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6RouteMetricEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6RouteMetricEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6RouteMetric", "1.3.6.1.2.1.55.1.11.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6RouteWeightEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6RouteWeightEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6RouteWeight", "1.3.6.1.2.1.55.1.11.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6RouteInfoEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6RouteInfoEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6RouteInfo", "1.3.6.1.2.1.55.1.11.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6RouteValidEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6RouteValidEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6RouteValid", "1.3.6.1.2.1.55.1.11.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Ipv6NetToMediaTableEnt extends MIBEntry<IPV6MIBDef>
            {
                public final Ipv6NetToMediaEntryEnt ipv6NetToMediaEntry;

                private Ipv6NetToMediaTableEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                {
                    super(mib, parent, "ipv6NetToMediaTable", "1.3.6.1.2.1.55.1.12", false, true, false, false);
                    this.ipv6NetToMediaEntry = new Ipv6NetToMediaEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipv6NetToMediaEntry
                    };
                }
                public static final class Ipv6NetToMediaEntryEnt extends MIBEntry<IPV6MIBDef>
                {
                    public final Ipv6NetToMediaNetAddressEnt ipv6NetToMediaNetAddress;

                    public final Ipv6NetToMediaPhysAddressEnt ipv6NetToMediaPhysAddress;

                    public final Ipv6NetToMediaTypeEnt ipv6NetToMediaType;

                    public final Ipv6IfNetToMediaStateEnt ipv6IfNetToMediaState;

                    public final Ipv6IfNetToMediaLastUpdatedEnt ipv6IfNetToMediaLastUpdated;

                    public final Ipv6NetToMediaValidEnt ipv6NetToMediaValid;

                    private Ipv6NetToMediaEntryEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                    {
                        super(mib, parent, "ipv6NetToMediaEntry", "1.3.6.1.2.1.55.1.12.1", false, false, false, true);
                        this.ipv6NetToMediaNetAddress = new Ipv6NetToMediaNetAddressEnt(mib, this);
                        this.ipv6NetToMediaPhysAddress = new Ipv6NetToMediaPhysAddressEnt(mib, this);
                        this.ipv6NetToMediaType = new Ipv6NetToMediaTypeEnt(mib, this);
                        this.ipv6IfNetToMediaState = new Ipv6IfNetToMediaStateEnt(mib, this);
                        this.ipv6IfNetToMediaLastUpdated = new Ipv6IfNetToMediaLastUpdatedEnt(mib, this);
                        this.ipv6NetToMediaValid = new Ipv6NetToMediaValidEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipv6NetToMediaNetAddress,
                            this.ipv6NetToMediaPhysAddress,
                            this.ipv6NetToMediaType,
                            this.ipv6IfNetToMediaState,
                            this.ipv6IfNetToMediaLastUpdated,
                            this.ipv6NetToMediaValid
                        };
                    }
                    public static final class Ipv6NetToMediaNetAddressEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6NetToMediaNetAddressEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6NetToMediaNetAddress", "1.3.6.1.2.1.55.1.12.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6NetToMediaPhysAddressEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6NetToMediaPhysAddressEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6NetToMediaPhysAddress", "1.3.6.1.2.1.55.1.12.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6NetToMediaTypeEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6NetToMediaTypeEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6NetToMediaType", "1.3.6.1.2.1.55.1.12.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfNetToMediaStateEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfNetToMediaStateEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfNetToMediaState", "1.3.6.1.2.1.55.1.12.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfNetToMediaLastUpdatedEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6IfNetToMediaLastUpdatedEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfNetToMediaLastUpdated", "1.3.6.1.2.1.55.1.12.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6NetToMediaValidEnt extends MIBEntry<IPV6MIBDef>
                    {
                        private Ipv6NetToMediaValidEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                        {
                            super(mib, parent, "ipv6NetToMediaValid", "1.3.6.1.2.1.55.1.12.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class Ipv6NotificationsEnt extends MIBEntry<IPV6MIBDef>
        {
            public final Ipv6NotificationPrefixEnt ipv6NotificationPrefix;

            private Ipv6NotificationsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
            {
                super(mib, parent, "ipv6Notifications", "1.3.6.1.2.1.55.2", false, false, false, false);
                this.ipv6NotificationPrefix = new Ipv6NotificationPrefixEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipv6NotificationPrefix
                };
            }
            public static final class Ipv6NotificationPrefixEnt extends MIBEntry<IPV6MIBDef>
            {
                /** the new state of the If.*/
                public final Ipv6IfStateChangeEnt ipv6IfStateChange;

                private Ipv6NotificationPrefixEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                {
                    super(mib, parent, "ipv6NotificationPrefix", "1.3.6.1.2.1.55.2.0", false, false, false, false);
                    this.ipv6IfStateChange = new Ipv6IfStateChangeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipv6IfStateChange
                    };
                }
                public static final class Ipv6IfStateChangeEnt extends MIBEntry<IPV6MIBDef>
                {
                    private Ipv6IfStateChangeEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                    {
                        super(mib, parent, "ipv6IfStateChange", "1.3.6.1.2.1.55.2.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class Ipv6ConformanceEnt extends MIBEntry<IPV6MIBDef>
        {
            public final Ipv6CompliancesEnt ipv6Compliances;

            public final Ipv6GroupsEnt ipv6Groups;

            private Ipv6ConformanceEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
            {
                super(mib, parent, "ipv6Conformance", "1.3.6.1.2.1.55.3", false, false, false, false);
                this.ipv6Compliances = new Ipv6CompliancesEnt(mib, this);
                this.ipv6Groups = new Ipv6GroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipv6Compliances,
                    this.ipv6Groups
                };
            }
            public static final class Ipv6CompliancesEnt extends MIBEntry<IPV6MIBDef>
            {
                /** compliance statements*/
                public final Ipv6ComplianceEnt ipv6Compliance;

                private Ipv6CompliancesEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                {
                    super(mib, parent, "ipv6Compliances", "1.3.6.1.2.1.55.3.1", false, false, false, false);
                    this.ipv6Compliance = new Ipv6ComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipv6Compliance
                    };
                }
                public static final class Ipv6ComplianceEnt extends MIBEntry<IPV6MIBDef>
                {
                    private Ipv6ComplianceEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                    {
                        super(mib, parent, "ipv6Compliance", "1.3.6.1.2.1.55.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Ipv6GroupsEnt extends MIBEntry<IPV6MIBDef>
            {
                public final Ipv6GeneralGroupEnt ipv6GeneralGroup;

                public final Ipv6NotificationGroupEnt ipv6NotificationGroup;

                private Ipv6GroupsEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                {
                    super(mib, parent, "ipv6Groups", "1.3.6.1.2.1.55.3.2", false, false, false, false);
                    this.ipv6GeneralGroup = new Ipv6GeneralGroupEnt(mib, this);
                    this.ipv6NotificationGroup = new Ipv6NotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipv6GeneralGroup,
                        this.ipv6NotificationGroup
                    };
                }
                public static final class Ipv6GeneralGroupEnt extends MIBEntry<IPV6MIBDef>
                {
                    private Ipv6GeneralGroupEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                    {
                        super(mib, parent, "ipv6GeneralGroup", "1.3.6.1.2.1.55.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ipv6NotificationGroupEnt extends MIBEntry<IPV6MIBDef>
                {
                    private Ipv6NotificationGroupEnt(IPV6MIBDef mib, MIBEntry<IPV6MIBDef> parent)
                    {
                        super(mib, parent, "ipv6NotificationGroup", "1.3.6.1.2.1.55.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
