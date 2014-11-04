package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class IPMIBDef extends MIB
{
    public static final IPMIBDef IPMIB = new IPMIBDef();

    static { MIBs.getInstance().registerMIB(IPMIBDef.IPMIB); }

    public final IpMIBEnt ipMIB;

    public final IpEnt ip;

    /** the IPv6 general groupSome objects that affect all of IPv6*/
    public final Ipv6IpForwardingEnt ipv6IpForwarding;

    public final Ipv6IpDefaultHopLimitEnt ipv6IpDefaultHopLimit;

    /** IPv4 Interface Table*/
    public final Ipv4InterfaceTableLastChangeEnt ipv4InterfaceTableLastChange;

    public final Ipv4InterfaceTableEnt ipv4InterfaceTable;

    /** v6 interface table*/
    public final Ipv6InterfaceTableLastChangeEnt ipv6InterfaceTableLastChange;

    public final Ipv6InterfaceTableEnt ipv6InterfaceTable;

    /** Per-Interface or System-Wide IP statistics.The following two tables, ipSystemStatsTable and ipIfStatsTable,are intended to provide the same counters at different granularities.The ipSystemStatsTable provides system wide counters aggregatingthe traffic counters for all interfaces for a given address type.The ipIfStatsTable provides the same counters but for specificinterfaces rather than as an aggregate.Note well: If a system provides both system-wide and interface-specific values, the system-wide value may not be equal to the sumof the interface-specific values across all interfaces due to e.g.,dynamic interface creation/deletion.Note well: Both of these tables contain some items that are


represented by two objects, representing the value in either 32or 64 bits.  For those objects, the 32-bit value MUST be the loworder 32 bits of the 64-bit value.  Also note that the 32-bitcounters must be included when the 64-bit counters are included.*/
    public final IpTrafficStatsEnt ipTrafficStats;

    /** Internet Address Prefix table*/
    public final IpAddressPrefixTableEnt ipAddressPrefixTable;

    /** Internet Address Table*/
    public final IpAddressSpinLockEnt ipAddressSpinLock;

    public final IpAddressTableEnt ipAddressTable;

    /** the Internet Address Translation table*/
    public final IpNetToPhysicalTableEnt ipNetToPhysicalTable;

    /** The IPv6 Scope Zone Index Table.*/
    public final Ipv6ScopeZoneIndexTableEnt ipv6ScopeZoneIndexTable;

    /** The Default Router TableThis table simply lists the default routers; for more informationabout routing tables, see the routing MIBs*/
    public final IpDefaultRouterTableEnt ipDefaultRouterTable;

    /** Configuration information for constructing router advertisements*/
    public final Ipv6RouterAdvertSpinLockEnt ipv6RouterAdvertSpinLock;

    public final Ipv6RouterAdvertTableEnt ipv6RouterAdvertTable;

    public final IcmpEnt icmp;

    /** ICMP non-message-specific counters
These object IDs are reserved, as they were used in earlierversions of the MIB module.  In theory, OIDs are not assigneduntil the specification is released as an RFC; however, as somecompanies may have shipped code based on earlier versions ofthe MIB, it seems best to reserve these OIDs.::= { icmp 27 }::= { icmp 28 }*/
    public final IcmpStatsTableEnt icmpStatsTable;

    /** per-version, per-message type ICMP counters*/
    public final IcmpMsgStatsTableEnt icmpMsgStatsTable;

    private IPMIBDef()
    {
        super("IP-MIB");
        this.ipMIB = new IpMIBEnt(this, null);
        this.ip = new IpEnt(this, null);
        this.ipv6IpForwarding = new Ipv6IpForwardingEnt(this, null);
        this.ipv6IpDefaultHopLimit = new Ipv6IpDefaultHopLimitEnt(this, null);
        this.ipv4InterfaceTableLastChange = new Ipv4InterfaceTableLastChangeEnt(this, null);
        this.ipv4InterfaceTable = new Ipv4InterfaceTableEnt(this, null);
        this.ipv6InterfaceTableLastChange = new Ipv6InterfaceTableLastChangeEnt(this, null);
        this.ipv6InterfaceTable = new Ipv6InterfaceTableEnt(this, null);
        this.ipTrafficStats = new IpTrafficStatsEnt(this, null);
        this.ipAddressPrefixTable = new IpAddressPrefixTableEnt(this, null);
        this.ipAddressSpinLock = new IpAddressSpinLockEnt(this, null);
        this.ipAddressTable = new IpAddressTableEnt(this, null);
        this.ipNetToPhysicalTable = new IpNetToPhysicalTableEnt(this, null);
        this.ipv6ScopeZoneIndexTable = new Ipv6ScopeZoneIndexTableEnt(this, null);
        this.ipDefaultRouterTable = new IpDefaultRouterTableEnt(this, null);
        this.ipv6RouterAdvertSpinLock = new Ipv6RouterAdvertSpinLockEnt(this, null);
        this.ipv6RouterAdvertTable = new Ipv6RouterAdvertTableEnt(this, null);
        this.icmp = new IcmpEnt(this, null);
        this.icmpStatsTable = new IcmpStatsTableEnt(this, null);
        this.icmpMsgStatsTable = new IcmpMsgStatsTableEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ipMIB,
            this.ip,
            this.ipv6IpForwarding,
            this.ipv6IpDefaultHopLimit,
            this.ipv4InterfaceTableLastChange,
            this.ipv4InterfaceTable,
            this.ipv6InterfaceTableLastChange,
            this.ipv6InterfaceTable,
            this.ipTrafficStats,
            this.ipAddressPrefixTable,
            this.ipAddressSpinLock,
            this.ipAddressTable,
            this.ipNetToPhysicalTable,
            this.ipv6ScopeZoneIndexTable,
            this.ipDefaultRouterTable,
            this.ipv6RouterAdvertSpinLock,
            this.ipv6RouterAdvertTable,
            this.icmp,
            this.icmpStatsTable,
            this.icmpMsgStatsTable
        };
    }

    public static final class IpMIBEnt extends MIBEntry<IPMIBDef>
    {
        /** conformance information*/
        public final IpMIBConformanceEnt ipMIBConformance;

        private IpMIBEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "ipMIB", "1.3.6.1.2.1.48", false, false, false, false);
            this.ipMIBConformance = new IpMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipMIBConformance
            };
        }
        public static final class IpMIBConformanceEnt extends MIBEntry<IPMIBDef>
        {
            public final IpMIBCompliancesEnt ipMIBCompliances;

            public final IpMIBGroupsEnt ipMIBGroups;

            private IpMIBConformanceEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipMIBConformance", "1.3.6.1.2.1.48.2", false, false, false, false);
                this.ipMIBCompliances = new IpMIBCompliancesEnt(mib, this);
                this.ipMIBGroups = new IpMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipMIBCompliances,
                    this.ipMIBGroups
                };
            }
            public static final class IpMIBCompliancesEnt extends MIBEntry<IPMIBDef>
            {
                /** compliance statements*/
                public final IpMIBCompliance2Ent ipMIBCompliance2;

                /** deprecated conformance informationdeprecated compliance statements*/
                public final IpMIBComplianceEnt ipMIBCompliance;

                private IpMIBCompliancesEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipMIBCompliances", "1.3.6.1.2.1.48.2.1", false, false, false, false);
                    this.ipMIBCompliance2 = new IpMIBCompliance2Ent(mib, this);
                    this.ipMIBCompliance = new IpMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipMIBCompliance2,
                        this.ipMIBCompliance
                    };
                }
                public static final class IpMIBCompliance2Ent extends MIBEntry<IPMIBDef>
                {
                    private IpMIBCompliance2Ent(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipMIBCompliance2", "1.3.6.1.2.1.48.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpMIBComplianceEnt extends MIBEntry<IPMIBDef>
                {
                    private IpMIBComplianceEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipMIBCompliance", "1.3.6.1.2.1.48.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class IpMIBGroupsEnt extends MIBEntry<IPMIBDef>
            {
                /** units of conformance*/
                public final Ipv4GeneralGroupEnt ipv4GeneralGroup;

                public final Ipv4IfGroupEnt ipv4IfGroup;

                public final Ipv6GeneralGroup2Ent ipv6GeneralGroup2;

                public final Ipv6IfGroupEnt ipv6IfGroup;

                public final IpLastChangeGroupEnt ipLastChangeGroup;

                public final IpSystemStatsGroupEnt ipSystemStatsGroup;

                public final Ipv4SystemStatsGroupEnt ipv4SystemStatsGroup;

                public final IpSystemStatsHCOctetGroupEnt ipSystemStatsHCOctetGroup;

                public final IpSystemStatsHCPacketGroupEnt ipSystemStatsHCPacketGroup;

                public final Ipv4SystemStatsHCPacketGroupEnt ipv4SystemStatsHCPacketGroup;

                public final IpIfStatsGroupEnt ipIfStatsGroup;

                public final Ipv4IfStatsGroupEnt ipv4IfStatsGroup;

                public final IpIfStatsHCOctetGroupEnt ipIfStatsHCOctetGroup;

                public final IpIfStatsHCPacketGroupEnt ipIfStatsHCPacketGroup;

                public final Ipv4IfStatsHCPacketGroupEnt ipv4IfStatsHCPacketGroup;

                public final IpAddressPrefixGroupEnt ipAddressPrefixGroup;

                public final IpAddressGroupEnt ipAddressGroup;

                public final IpNetToPhysicalGroupEnt ipNetToPhysicalGroup;

                public final Ipv6ScopeGroupEnt ipv6ScopeGroup;

                public final IpDefaultRouterGroupEnt ipDefaultRouterGroup;

                public final Ipv6RouterAdvertGroupEnt ipv6RouterAdvertGroup;

                public final IcmpStatsGroupEnt icmpStatsGroup;

                /** deprecated units of conformance*/
                public final IpGroupEnt ipGroup;

                public final IcmpGroupEnt icmpGroup;

                private IpMIBGroupsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipMIBGroups", "1.3.6.1.2.1.48.2.2", false, false, false, false);
                    this.ipv4GeneralGroup = new Ipv4GeneralGroupEnt(mib, this);
                    this.ipv4IfGroup = new Ipv4IfGroupEnt(mib, this);
                    this.ipv6GeneralGroup2 = new Ipv6GeneralGroup2Ent(mib, this);
                    this.ipv6IfGroup = new Ipv6IfGroupEnt(mib, this);
                    this.ipLastChangeGroup = new IpLastChangeGroupEnt(mib, this);
                    this.ipSystemStatsGroup = new IpSystemStatsGroupEnt(mib, this);
                    this.ipv4SystemStatsGroup = new Ipv4SystemStatsGroupEnt(mib, this);
                    this.ipSystemStatsHCOctetGroup = new IpSystemStatsHCOctetGroupEnt(mib, this);
                    this.ipSystemStatsHCPacketGroup = new IpSystemStatsHCPacketGroupEnt(mib, this);
                    this.ipv4SystemStatsHCPacketGroup = new Ipv4SystemStatsHCPacketGroupEnt(mib, this);
                    this.ipIfStatsGroup = new IpIfStatsGroupEnt(mib, this);
                    this.ipv4IfStatsGroup = new Ipv4IfStatsGroupEnt(mib, this);
                    this.ipIfStatsHCOctetGroup = new IpIfStatsHCOctetGroupEnt(mib, this);
                    this.ipIfStatsHCPacketGroup = new IpIfStatsHCPacketGroupEnt(mib, this);
                    this.ipv4IfStatsHCPacketGroup = new Ipv4IfStatsHCPacketGroupEnt(mib, this);
                    this.ipAddressPrefixGroup = new IpAddressPrefixGroupEnt(mib, this);
                    this.ipAddressGroup = new IpAddressGroupEnt(mib, this);
                    this.ipNetToPhysicalGroup = new IpNetToPhysicalGroupEnt(mib, this);
                    this.ipv6ScopeGroup = new Ipv6ScopeGroupEnt(mib, this);
                    this.ipDefaultRouterGroup = new IpDefaultRouterGroupEnt(mib, this);
                    this.ipv6RouterAdvertGroup = new Ipv6RouterAdvertGroupEnt(mib, this);
                    this.icmpStatsGroup = new IcmpStatsGroupEnt(mib, this);
                    this.ipGroup = new IpGroupEnt(mib, this);
                    this.icmpGroup = new IcmpGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipv4GeneralGroup,
                        this.ipv4IfGroup,
                        this.ipv6GeneralGroup2,
                        this.ipv6IfGroup,
                        this.ipLastChangeGroup,
                        this.ipSystemStatsGroup,
                        this.ipv4SystemStatsGroup,
                        this.ipSystemStatsHCOctetGroup,
                        this.ipSystemStatsHCPacketGroup,
                        this.ipv4SystemStatsHCPacketGroup,
                        this.ipIfStatsGroup,
                        this.ipv4IfStatsGroup,
                        this.ipIfStatsHCOctetGroup,
                        this.ipIfStatsHCPacketGroup,
                        this.ipv4IfStatsHCPacketGroup,
                        this.ipAddressPrefixGroup,
                        this.ipAddressGroup,
                        this.ipNetToPhysicalGroup,
                        this.ipv6ScopeGroup,
                        this.ipDefaultRouterGroup,
                        this.ipv6RouterAdvertGroup,
                        this.icmpStatsGroup,
                        this.ipGroup,
                        this.icmpGroup
                    };
                }
                public static final class Ipv4GeneralGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private Ipv4GeneralGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipv4GeneralGroup", "1.3.6.1.2.1.48.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ipv4IfGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private Ipv4IfGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipv4IfGroup", "1.3.6.1.2.1.48.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ipv6GeneralGroup2Ent extends MIBEntry<IPMIBDef>
                {
                    private Ipv6GeneralGroup2Ent(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipv6GeneralGroup2", "1.3.6.1.2.1.48.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ipv6IfGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private Ipv6IfGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipv6IfGroup", "1.3.6.1.2.1.48.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpLastChangeGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private IpLastChangeGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipLastChangeGroup", "1.3.6.1.2.1.48.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsGroup", "1.3.6.1.2.1.48.2.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ipv4SystemStatsGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private Ipv4SystemStatsGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipv4SystemStatsGroup", "1.3.6.1.2.1.48.2.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsHCOctetGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsHCOctetGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsHCOctetGroup", "1.3.6.1.2.1.48.2.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsHCPacketGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsHCPacketGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsHCPacketGroup", "1.3.6.1.2.1.48.2.2.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ipv4SystemStatsHCPacketGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private Ipv4SystemStatsHCPacketGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipv4SystemStatsHCPacketGroup", "1.3.6.1.2.1.48.2.2.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsGroup", "1.3.6.1.2.1.48.2.2.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ipv4IfStatsGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private Ipv4IfStatsGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipv4IfStatsGroup", "1.3.6.1.2.1.48.2.2.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsHCOctetGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsHCOctetGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsHCOctetGroup", "1.3.6.1.2.1.48.2.2.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsHCPacketGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsHCPacketGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsHCPacketGroup", "1.3.6.1.2.1.48.2.2.16", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ipv4IfStatsHCPacketGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private Ipv4IfStatsHCPacketGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipv4IfStatsHCPacketGroup", "1.3.6.1.2.1.48.2.2.17", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpAddressPrefixGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private IpAddressPrefixGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipAddressPrefixGroup", "1.3.6.1.2.1.48.2.2.18", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpAddressGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private IpAddressGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipAddressGroup", "1.3.6.1.2.1.48.2.2.19", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpNetToPhysicalGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private IpNetToPhysicalGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipNetToPhysicalGroup", "1.3.6.1.2.1.48.2.2.20", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ipv6ScopeGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private Ipv6ScopeGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipv6ScopeGroup", "1.3.6.1.2.1.48.2.2.21", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpDefaultRouterGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private IpDefaultRouterGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipDefaultRouterGroup", "1.3.6.1.2.1.48.2.2.22", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Ipv6RouterAdvertGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private Ipv6RouterAdvertGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipv6RouterAdvertGroup", "1.3.6.1.2.1.48.2.2.23", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IcmpStatsGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private IcmpStatsGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "icmpStatsGroup", "1.3.6.1.2.1.48.2.2.24", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private IpGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipGroup", "1.3.6.1.2.1.48.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IcmpGroupEnt extends MIBEntry<IPMIBDef>
                {
                    private IcmpGroupEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "icmpGroup", "1.3.6.1.2.1.48.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class IpEnt extends MIBEntry<IPMIBDef>
    {
        /** the IP group
Implementation of the IP group is mandatory for allsystems.*/
        public final IpForwardingEnt ipForwarding;

        public final IpDefaultTTLEnt ipDefaultTTL;

        public final IpReasmTimeoutEnt ipReasmTimeout;

        public final IpInReceivesEnt ipInReceives;

        public final IpInHdrErrorsEnt ipInHdrErrors;

        public final IpInAddrErrorsEnt ipInAddrErrors;

        public final IpForwDatagramsEnt ipForwDatagrams;

        public final IpInUnknownProtosEnt ipInUnknownProtos;

        public final IpInDiscardsEnt ipInDiscards;

        public final IpInDeliversEnt ipInDelivers;

        public final IpOutRequestsEnt ipOutRequests;

        public final IpOutDiscardsEnt ipOutDiscards;

        public final IpOutNoRoutesEnt ipOutNoRoutes;

        public final IpReasmReqdsEnt ipReasmReqds;

        public final IpReasmOKsEnt ipReasmOKs;

        public final IpReasmFailsEnt ipReasmFails;

        public final IpFragOKsEnt ipFragOKs;

        public final IpFragFailsEnt ipFragFails;

        public final IpFragCreatesEnt ipFragCreates;

        /** additional IP objects*/
        public final IpRoutingDiscardsEnt ipRoutingDiscards;

        /** the IP address table
The IP address table contains this entity's IP addressinginformation.*/
        public final IpAddrTableEnt ipAddrTable;

        /** the IP Address Translation table
The IP address translation table contain the IpAddress to`physical' address equivalences.  Some interfaces do notuse translation tables for determining addressequivalences (e.g., DDN-X.25 has an algorithmic method);if all interfaces are of this type, then the AddressTranslation table is empty, i.e., has zero entries.*/
        public final IpNetToMediaTableEnt ipNetToMediaTable;

        private IpEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "ip", "1.3.6.1.2.1.4", false, false, false, false);
            this.ipForwarding = new IpForwardingEnt(mib, this);
            this.ipDefaultTTL = new IpDefaultTTLEnt(mib, this);
            this.ipReasmTimeout = new IpReasmTimeoutEnt(mib, this);
            this.ipInReceives = new IpInReceivesEnt(mib, this);
            this.ipInHdrErrors = new IpInHdrErrorsEnt(mib, this);
            this.ipInAddrErrors = new IpInAddrErrorsEnt(mib, this);
            this.ipForwDatagrams = new IpForwDatagramsEnt(mib, this);
            this.ipInUnknownProtos = new IpInUnknownProtosEnt(mib, this);
            this.ipInDiscards = new IpInDiscardsEnt(mib, this);
            this.ipInDelivers = new IpInDeliversEnt(mib, this);
            this.ipOutRequests = new IpOutRequestsEnt(mib, this);
            this.ipOutDiscards = new IpOutDiscardsEnt(mib, this);
            this.ipOutNoRoutes = new IpOutNoRoutesEnt(mib, this);
            this.ipReasmReqds = new IpReasmReqdsEnt(mib, this);
            this.ipReasmOKs = new IpReasmOKsEnt(mib, this);
            this.ipReasmFails = new IpReasmFailsEnt(mib, this);
            this.ipFragOKs = new IpFragOKsEnt(mib, this);
            this.ipFragFails = new IpFragFailsEnt(mib, this);
            this.ipFragCreates = new IpFragCreatesEnt(mib, this);
            this.ipRoutingDiscards = new IpRoutingDiscardsEnt(mib, this);
            this.ipAddrTable = new IpAddrTableEnt(mib, this);
            this.ipNetToMediaTable = new IpNetToMediaTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipForwarding,
                this.ipDefaultTTL,
                this.ipReasmTimeout,
                this.ipInReceives,
                this.ipInHdrErrors,
                this.ipInAddrErrors,
                this.ipForwDatagrams,
                this.ipInUnknownProtos,
                this.ipInDiscards,
                this.ipInDelivers,
                this.ipOutRequests,
                this.ipOutDiscards,
                this.ipOutNoRoutes,
                this.ipReasmReqds,
                this.ipReasmOKs,
                this.ipReasmFails,
                this.ipFragOKs,
                this.ipFragFails,
                this.ipFragCreates,
                this.ipRoutingDiscards,
                this.ipAddrTable,
                this.ipNetToMediaTable
            };
        }
        public static final class IpForwardingEnt extends MIBEntry<IPMIBDef>
        {
            private IpForwardingEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipForwarding", "1.3.6.1.2.1.4.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpDefaultTTLEnt extends MIBEntry<IPMIBDef>
        {
            private IpDefaultTTLEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipDefaultTTL", "1.3.6.1.2.1.4.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpReasmTimeoutEnt extends MIBEntry<IPMIBDef>
        {
            private IpReasmTimeoutEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipReasmTimeout", "1.3.6.1.2.1.4.13", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpInReceivesEnt extends MIBEntry<IPMIBDef>
        {
            private IpInReceivesEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipInReceives", "1.3.6.1.2.1.4.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpInHdrErrorsEnt extends MIBEntry<IPMIBDef>
        {
            private IpInHdrErrorsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipInHdrErrors", "1.3.6.1.2.1.4.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpInAddrErrorsEnt extends MIBEntry<IPMIBDef>
        {
            private IpInAddrErrorsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipInAddrErrors", "1.3.6.1.2.1.4.5", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpForwDatagramsEnt extends MIBEntry<IPMIBDef>
        {
            private IpForwDatagramsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipForwDatagrams", "1.3.6.1.2.1.4.6", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpInUnknownProtosEnt extends MIBEntry<IPMIBDef>
        {
            private IpInUnknownProtosEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipInUnknownProtos", "1.3.6.1.2.1.4.7", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpInDiscardsEnt extends MIBEntry<IPMIBDef>
        {
            private IpInDiscardsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipInDiscards", "1.3.6.1.2.1.4.8", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpInDeliversEnt extends MIBEntry<IPMIBDef>
        {
            private IpInDeliversEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipInDelivers", "1.3.6.1.2.1.4.9", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpOutRequestsEnt extends MIBEntry<IPMIBDef>
        {
            private IpOutRequestsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipOutRequests", "1.3.6.1.2.1.4.10", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpOutDiscardsEnt extends MIBEntry<IPMIBDef>
        {
            private IpOutDiscardsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipOutDiscards", "1.3.6.1.2.1.4.11", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpOutNoRoutesEnt extends MIBEntry<IPMIBDef>
        {
            private IpOutNoRoutesEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipOutNoRoutes", "1.3.6.1.2.1.4.12", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpReasmReqdsEnt extends MIBEntry<IPMIBDef>
        {
            private IpReasmReqdsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipReasmReqds", "1.3.6.1.2.1.4.14", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpReasmOKsEnt extends MIBEntry<IPMIBDef>
        {
            private IpReasmOKsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipReasmOKs", "1.3.6.1.2.1.4.15", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpReasmFailsEnt extends MIBEntry<IPMIBDef>
        {
            private IpReasmFailsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipReasmFails", "1.3.6.1.2.1.4.16", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpFragOKsEnt extends MIBEntry<IPMIBDef>
        {
            private IpFragOKsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipFragOKs", "1.3.6.1.2.1.4.17", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpFragFailsEnt extends MIBEntry<IPMIBDef>
        {
            private IpFragFailsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipFragFails", "1.3.6.1.2.1.4.18", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpFragCreatesEnt extends MIBEntry<IPMIBDef>
        {
            private IpFragCreatesEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipFragCreates", "1.3.6.1.2.1.4.19", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpRoutingDiscardsEnt extends MIBEntry<IPMIBDef>
        {
            private IpRoutingDiscardsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipRoutingDiscards", "1.3.6.1.2.1.4.23", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpAddrTableEnt extends MIBEntry<IPMIBDef>
        {
            public final IpAddrEntryEnt ipAddrEntry;

            private IpAddrTableEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipAddrTable", "1.3.6.1.2.1.4.20", false, true, false, false);
                this.ipAddrEntry = new IpAddrEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipAddrEntry
                };
            }
            public static final class IpAddrEntryEnt extends MIBEntry<IPMIBDef>
            {
                public final IpAdEntAddrEnt ipAdEntAddr;

                public final IpAdEntIfIndexEnt ipAdEntIfIndex;

                public final IpAdEntNetMaskEnt ipAdEntNetMask;

                public final IpAdEntBcastAddrEnt ipAdEntBcastAddr;

                public final IpAdEntReasmMaxSizeEnt ipAdEntReasmMaxSize;

                private IpAddrEntryEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddrEntry", "1.3.6.1.2.1.4.20.1", false, false, false, true);
                    this.ipAdEntAddr = new IpAdEntAddrEnt(mib, this);
                    this.ipAdEntIfIndex = new IpAdEntIfIndexEnt(mib, this);
                    this.ipAdEntNetMask = new IpAdEntNetMaskEnt(mib, this);
                    this.ipAdEntBcastAddr = new IpAdEntBcastAddrEnt(mib, this);
                    this.ipAdEntReasmMaxSize = new IpAdEntReasmMaxSizeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipAdEntAddr,
                        this.ipAdEntIfIndex,
                        this.ipAdEntNetMask,
                        this.ipAdEntBcastAddr,
                        this.ipAdEntReasmMaxSize
                    };
                }
                public static final class IpAdEntAddrEnt extends MIBEntry<IPMIBDef>
                {
                    private IpAdEntAddrEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipAdEntAddr", "1.3.6.1.2.1.4.20.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpAdEntIfIndexEnt extends MIBEntry<IPMIBDef>
                {
                    private IpAdEntIfIndexEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipAdEntIfIndex", "1.3.6.1.2.1.4.20.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpAdEntNetMaskEnt extends MIBEntry<IPMIBDef>
                {
                    private IpAdEntNetMaskEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipAdEntNetMask", "1.3.6.1.2.1.4.20.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpAdEntBcastAddrEnt extends MIBEntry<IPMIBDef>
                {
                    private IpAdEntBcastAddrEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipAdEntBcastAddr", "1.3.6.1.2.1.4.20.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpAdEntReasmMaxSizeEnt extends MIBEntry<IPMIBDef>
                {
                    private IpAdEntReasmMaxSizeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipAdEntReasmMaxSize", "1.3.6.1.2.1.4.20.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class IpNetToMediaTableEnt extends MIBEntry<IPMIBDef>
        {
            public final IpNetToMediaEntryEnt ipNetToMediaEntry;

            private IpNetToMediaTableEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipNetToMediaTable", "1.3.6.1.2.1.4.22", false, true, false, false);
                this.ipNetToMediaEntry = new IpNetToMediaEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipNetToMediaEntry
                };
            }
            public static final class IpNetToMediaEntryEnt extends MIBEntry<IPMIBDef>
            {
                public final IpNetToMediaIfIndexEnt ipNetToMediaIfIndex;

                public final IpNetToMediaPhysAddressEnt ipNetToMediaPhysAddress;

                public final IpNetToMediaNetAddressEnt ipNetToMediaNetAddress;

                public final IpNetToMediaTypeEnt ipNetToMediaType;

                private IpNetToMediaEntryEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipNetToMediaEntry", "1.3.6.1.2.1.4.22.1", false, false, false, true);
                    this.ipNetToMediaIfIndex = new IpNetToMediaIfIndexEnt(mib, this);
                    this.ipNetToMediaPhysAddress = new IpNetToMediaPhysAddressEnt(mib, this);
                    this.ipNetToMediaNetAddress = new IpNetToMediaNetAddressEnt(mib, this);
                    this.ipNetToMediaType = new IpNetToMediaTypeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipNetToMediaIfIndex,
                        this.ipNetToMediaPhysAddress,
                        this.ipNetToMediaNetAddress,
                        this.ipNetToMediaType
                    };
                }
                public static final class IpNetToMediaIfIndexEnt extends MIBEntry<IPMIBDef>
                {
                    private IpNetToMediaIfIndexEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipNetToMediaIfIndex", "1.3.6.1.2.1.4.22.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpNetToMediaPhysAddressEnt extends MIBEntry<IPMIBDef>
                {
                    private IpNetToMediaPhysAddressEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipNetToMediaPhysAddress", "1.3.6.1.2.1.4.22.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpNetToMediaNetAddressEnt extends MIBEntry<IPMIBDef>
                {
                    private IpNetToMediaNetAddressEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipNetToMediaNetAddress", "1.3.6.1.2.1.4.22.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpNetToMediaTypeEnt extends MIBEntry<IPMIBDef>
                {
                    private IpNetToMediaTypeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipNetToMediaType", "1.3.6.1.2.1.4.22.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class Ipv6IpForwardingEnt extends MIBEntry<IPMIBDef>
    {
        private Ipv6IpForwardingEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "ipv6IpForwarding", "1.3.6.1.2.1.4.25", true, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class Ipv6IpDefaultHopLimitEnt extends MIBEntry<IPMIBDef>
    {
        private Ipv6IpDefaultHopLimitEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "ipv6IpDefaultHopLimit", "1.3.6.1.2.1.4.26", true, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class Ipv4InterfaceTableLastChangeEnt extends MIBEntry<IPMIBDef>
    {
        private Ipv4InterfaceTableLastChangeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "ipv4InterfaceTableLastChange", "1.3.6.1.2.1.4.27", true, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class Ipv4InterfaceTableEnt extends MIBEntry<IPMIBDef>
    {
        public final Ipv4InterfaceEntryEnt ipv4InterfaceEntry;

        private Ipv4InterfaceTableEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "ipv4InterfaceTable", "1.3.6.1.2.1.4.28", false, true, false, false);
            this.ipv4InterfaceEntry = new Ipv4InterfaceEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipv4InterfaceEntry
            };
        }
        public static final class Ipv4InterfaceEntryEnt extends MIBEntry<IPMIBDef>
        {
            public final Ipv4InterfaceIfIndexEnt ipv4InterfaceIfIndex;

            public final Ipv4InterfaceReasmMaxSizeEnt ipv4InterfaceReasmMaxSize;

            public final Ipv4InterfaceEnableStatusEnt ipv4InterfaceEnableStatus;

            public final Ipv4InterfaceRetransmitTimeEnt ipv4InterfaceRetransmitTime;

            private Ipv4InterfaceEntryEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipv4InterfaceEntry", "1.3.6.1.2.1.4.28.1", false, false, false, true);
                this.ipv4InterfaceIfIndex = new Ipv4InterfaceIfIndexEnt(mib, this);
                this.ipv4InterfaceReasmMaxSize = new Ipv4InterfaceReasmMaxSizeEnt(mib, this);
                this.ipv4InterfaceEnableStatus = new Ipv4InterfaceEnableStatusEnt(mib, this);
                this.ipv4InterfaceRetransmitTime = new Ipv4InterfaceRetransmitTimeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipv4InterfaceIfIndex,
                    this.ipv4InterfaceReasmMaxSize,
                    this.ipv4InterfaceEnableStatus,
                    this.ipv4InterfaceRetransmitTime
                };
            }
            public static final class Ipv4InterfaceIfIndexEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv4InterfaceIfIndexEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv4InterfaceIfIndex", "1.3.6.1.2.1.4.28.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv4InterfaceReasmMaxSizeEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv4InterfaceReasmMaxSizeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv4InterfaceReasmMaxSize", "1.3.6.1.2.1.4.28.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv4InterfaceEnableStatusEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv4InterfaceEnableStatusEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv4InterfaceEnableStatus", "1.3.6.1.2.1.4.28.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv4InterfaceRetransmitTimeEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv4InterfaceRetransmitTimeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv4InterfaceRetransmitTime", "1.3.6.1.2.1.4.28.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class Ipv6InterfaceTableLastChangeEnt extends MIBEntry<IPMIBDef>
    {
        private Ipv6InterfaceTableLastChangeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "ipv6InterfaceTableLastChange", "1.3.6.1.2.1.4.29", true, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class Ipv6InterfaceTableEnt extends MIBEntry<IPMIBDef>
    {
        public final Ipv6InterfaceEntryEnt ipv6InterfaceEntry;

        private Ipv6InterfaceTableEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "ipv6InterfaceTable", "1.3.6.1.2.1.4.30", false, true, false, false);
            this.ipv6InterfaceEntry = new Ipv6InterfaceEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipv6InterfaceEntry
            };
        }
        public static final class Ipv6InterfaceEntryEnt extends MIBEntry<IPMIBDef>
        {
            public final Ipv6InterfaceIfIndexEnt ipv6InterfaceIfIndex;

            public final Ipv6InterfaceReasmMaxSizeEnt ipv6InterfaceReasmMaxSize;

            public final Ipv6InterfaceIdentifierEnt ipv6InterfaceIdentifier;

            /** This object ID is reserved as it was used in earlier versions ofthe MIB module.  In theory, OIDs are not assigned until thespecification is released as an RFC; however, as some companiesmay have shipped code based on earlier versions of the MIB, itseems best to reserve this OID.  This OID had beenipv6InterfacePhysicalAddress.::= { ipv6InterfaceEntry 4}*/
            public final Ipv6InterfaceEnableStatusEnt ipv6InterfaceEnableStatus;

            public final Ipv6InterfaceReachableTimeEnt ipv6InterfaceReachableTime;

            public final Ipv6InterfaceRetransmitTimeEnt ipv6InterfaceRetransmitTime;

            public final Ipv6InterfaceForwardingEnt ipv6InterfaceForwarding;

            private Ipv6InterfaceEntryEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipv6InterfaceEntry", "1.3.6.1.2.1.4.30.1", false, false, false, true);
                this.ipv6InterfaceIfIndex = new Ipv6InterfaceIfIndexEnt(mib, this);
                this.ipv6InterfaceReasmMaxSize = new Ipv6InterfaceReasmMaxSizeEnt(mib, this);
                this.ipv6InterfaceIdentifier = new Ipv6InterfaceIdentifierEnt(mib, this);
                this.ipv6InterfaceEnableStatus = new Ipv6InterfaceEnableStatusEnt(mib, this);
                this.ipv6InterfaceReachableTime = new Ipv6InterfaceReachableTimeEnt(mib, this);
                this.ipv6InterfaceRetransmitTime = new Ipv6InterfaceRetransmitTimeEnt(mib, this);
                this.ipv6InterfaceForwarding = new Ipv6InterfaceForwardingEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipv6InterfaceIfIndex,
                    this.ipv6InterfaceReasmMaxSize,
                    this.ipv6InterfaceIdentifier,
                    this.ipv6InterfaceEnableStatus,
                    this.ipv6InterfaceReachableTime,
                    this.ipv6InterfaceRetransmitTime,
                    this.ipv6InterfaceForwarding
                };
            }
            public static final class Ipv6InterfaceIfIndexEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6InterfaceIfIndexEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6InterfaceIfIndex", "1.3.6.1.2.1.4.30.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6InterfaceReasmMaxSizeEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6InterfaceReasmMaxSizeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6InterfaceReasmMaxSize", "1.3.6.1.2.1.4.30.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6InterfaceIdentifierEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6InterfaceIdentifierEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6InterfaceIdentifier", "1.3.6.1.2.1.4.30.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6InterfaceEnableStatusEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6InterfaceEnableStatusEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6InterfaceEnableStatus", "1.3.6.1.2.1.4.30.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6InterfaceReachableTimeEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6InterfaceReachableTimeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6InterfaceReachableTime", "1.3.6.1.2.1.4.30.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6InterfaceRetransmitTimeEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6InterfaceRetransmitTimeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6InterfaceRetransmitTime", "1.3.6.1.2.1.4.30.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6InterfaceForwardingEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6InterfaceForwardingEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6InterfaceForwarding", "1.3.6.1.2.1.4.30.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class IpTrafficStatsEnt extends MIBEntry<IPMIBDef>
    {
        public final IpSystemStatsTableEnt ipSystemStatsTable;

        public final IpIfStatsTableLastChangeEnt ipIfStatsTableLastChange;

        public final IpIfStatsTableEnt ipIfStatsTable;

        private IpTrafficStatsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "ipTrafficStats", "1.3.6.1.2.1.4.31", false, false, false, false);
            this.ipSystemStatsTable = new IpSystemStatsTableEnt(mib, this);
            this.ipIfStatsTableLastChange = new IpIfStatsTableLastChangeEnt(mib, this);
            this.ipIfStatsTable = new IpIfStatsTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipSystemStatsTable,
                this.ipIfStatsTableLastChange,
                this.ipIfStatsTable
            };
        }
        public static final class IpSystemStatsTableEnt extends MIBEntry<IPMIBDef>
        {
            public final IpSystemStatsEntryEnt ipSystemStatsEntry;

            private IpSystemStatsTableEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipSystemStatsTable", "1.3.6.1.2.1.4.31.1", false, true, false, false);
                this.ipSystemStatsEntry = new IpSystemStatsEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipSystemStatsEntry
                };
            }
            public static final class IpSystemStatsEntryEnt extends MIBEntry<IPMIBDef>
            {
                public final IpSystemStatsIPVersionEnt ipSystemStatsIPVersion;

                /** This object ID is reserved to allow the IDs for this table's objectsto align with the objects in the ipIfStatsTable.::= { ipSystemStatsEntry 2 }*/
                public final IpSystemStatsInReceivesEnt ipSystemStatsInReceives;

                public final IpSystemStatsHCInReceivesEnt ipSystemStatsHCInReceives;

                public final IpSystemStatsInOctetsEnt ipSystemStatsInOctets;

                public final IpSystemStatsHCInOctetsEnt ipSystemStatsHCInOctets;

                public final IpSystemStatsInHdrErrorsEnt ipSystemStatsInHdrErrors;

                public final IpSystemStatsInNoRoutesEnt ipSystemStatsInNoRoutes;

                public final IpSystemStatsInAddrErrorsEnt ipSystemStatsInAddrErrors;

                public final IpSystemStatsInUnknownProtosEnt ipSystemStatsInUnknownProtos;

                public final IpSystemStatsInTruncatedPktsEnt ipSystemStatsInTruncatedPkts;

                public final IpSystemStatsInForwDatagramsEnt ipSystemStatsInForwDatagrams;

                public final IpSystemStatsHCInForwDatagramsEnt ipSystemStatsHCInForwDatagrams;

                public final IpSystemStatsReasmReqdsEnt ipSystemStatsReasmReqds;

                public final IpSystemStatsReasmOKsEnt ipSystemStatsReasmOKs;

                public final IpSystemStatsReasmFailsEnt ipSystemStatsReasmFails;

                public final IpSystemStatsInDiscardsEnt ipSystemStatsInDiscards;

                public final IpSystemStatsInDeliversEnt ipSystemStatsInDelivers;

                public final IpSystemStatsHCInDeliversEnt ipSystemStatsHCInDelivers;

                public final IpSystemStatsOutRequestsEnt ipSystemStatsOutRequests;

                public final IpSystemStatsHCOutRequestsEnt ipSystemStatsHCOutRequests;

                public final IpSystemStatsOutNoRoutesEnt ipSystemStatsOutNoRoutes;

                public final IpSystemStatsOutForwDatagramsEnt ipSystemStatsOutForwDatagrams;

                public final IpSystemStatsHCOutForwDatagramsEnt ipSystemStatsHCOutForwDatagrams;

                public final IpSystemStatsOutDiscardsEnt ipSystemStatsOutDiscards;

                public final IpSystemStatsOutFragReqdsEnt ipSystemStatsOutFragReqds;

                public final IpSystemStatsOutFragOKsEnt ipSystemStatsOutFragOKs;

                public final IpSystemStatsOutFragFailsEnt ipSystemStatsOutFragFails;

                public final IpSystemStatsOutFragCreatesEnt ipSystemStatsOutFragCreates;

                public final IpSystemStatsOutTransmitsEnt ipSystemStatsOutTransmits;

                public final IpSystemStatsHCOutTransmitsEnt ipSystemStatsHCOutTransmits;

                public final IpSystemStatsOutOctetsEnt ipSystemStatsOutOctets;

                public final IpSystemStatsHCOutOctetsEnt ipSystemStatsHCOutOctets;

                public final IpSystemStatsInMcastPktsEnt ipSystemStatsInMcastPkts;

                public final IpSystemStatsHCInMcastPktsEnt ipSystemStatsHCInMcastPkts;

                public final IpSystemStatsInMcastOctetsEnt ipSystemStatsInMcastOctets;

                public final IpSystemStatsHCInMcastOctetsEnt ipSystemStatsHCInMcastOctets;

                public final IpSystemStatsOutMcastPktsEnt ipSystemStatsOutMcastPkts;

                public final IpSystemStatsHCOutMcastPktsEnt ipSystemStatsHCOutMcastPkts;

                public final IpSystemStatsOutMcastOctetsEnt ipSystemStatsOutMcastOctets;

                public final IpSystemStatsHCOutMcastOctetsEnt ipSystemStatsHCOutMcastOctets;

                public final IpSystemStatsInBcastPktsEnt ipSystemStatsInBcastPkts;

                public final IpSystemStatsHCInBcastPktsEnt ipSystemStatsHCInBcastPkts;

                public final IpSystemStatsOutBcastPktsEnt ipSystemStatsOutBcastPkts;

                public final IpSystemStatsHCOutBcastPktsEnt ipSystemStatsHCOutBcastPkts;

                public final IpSystemStatsDiscontinuityTimeEnt ipSystemStatsDiscontinuityTime;

                public final IpSystemStatsRefreshRateEnt ipSystemStatsRefreshRate;

                private IpSystemStatsEntryEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipSystemStatsEntry", "1.3.6.1.2.1.4.31.1.1", false, false, false, true);
                    this.ipSystemStatsIPVersion = new IpSystemStatsIPVersionEnt(mib, this);
                    this.ipSystemStatsInReceives = new IpSystemStatsInReceivesEnt(mib, this);
                    this.ipSystemStatsHCInReceives = new IpSystemStatsHCInReceivesEnt(mib, this);
                    this.ipSystemStatsInOctets = new IpSystemStatsInOctetsEnt(mib, this);
                    this.ipSystemStatsHCInOctets = new IpSystemStatsHCInOctetsEnt(mib, this);
                    this.ipSystemStatsInHdrErrors = new IpSystemStatsInHdrErrorsEnt(mib, this);
                    this.ipSystemStatsInNoRoutes = new IpSystemStatsInNoRoutesEnt(mib, this);
                    this.ipSystemStatsInAddrErrors = new IpSystemStatsInAddrErrorsEnt(mib, this);
                    this.ipSystemStatsInUnknownProtos = new IpSystemStatsInUnknownProtosEnt(mib, this);
                    this.ipSystemStatsInTruncatedPkts = new IpSystemStatsInTruncatedPktsEnt(mib, this);
                    this.ipSystemStatsInForwDatagrams = new IpSystemStatsInForwDatagramsEnt(mib, this);
                    this.ipSystemStatsHCInForwDatagrams = new IpSystemStatsHCInForwDatagramsEnt(mib, this);
                    this.ipSystemStatsReasmReqds = new IpSystemStatsReasmReqdsEnt(mib, this);
                    this.ipSystemStatsReasmOKs = new IpSystemStatsReasmOKsEnt(mib, this);
                    this.ipSystemStatsReasmFails = new IpSystemStatsReasmFailsEnt(mib, this);
                    this.ipSystemStatsInDiscards = new IpSystemStatsInDiscardsEnt(mib, this);
                    this.ipSystemStatsInDelivers = new IpSystemStatsInDeliversEnt(mib, this);
                    this.ipSystemStatsHCInDelivers = new IpSystemStatsHCInDeliversEnt(mib, this);
                    this.ipSystemStatsOutRequests = new IpSystemStatsOutRequestsEnt(mib, this);
                    this.ipSystemStatsHCOutRequests = new IpSystemStatsHCOutRequestsEnt(mib, this);
                    this.ipSystemStatsOutNoRoutes = new IpSystemStatsOutNoRoutesEnt(mib, this);
                    this.ipSystemStatsOutForwDatagrams = new IpSystemStatsOutForwDatagramsEnt(mib, this);
                    this.ipSystemStatsHCOutForwDatagrams = new IpSystemStatsHCOutForwDatagramsEnt(mib, this);
                    this.ipSystemStatsOutDiscards = new IpSystemStatsOutDiscardsEnt(mib, this);
                    this.ipSystemStatsOutFragReqds = new IpSystemStatsOutFragReqdsEnt(mib, this);
                    this.ipSystemStatsOutFragOKs = new IpSystemStatsOutFragOKsEnt(mib, this);
                    this.ipSystemStatsOutFragFails = new IpSystemStatsOutFragFailsEnt(mib, this);
                    this.ipSystemStatsOutFragCreates = new IpSystemStatsOutFragCreatesEnt(mib, this);
                    this.ipSystemStatsOutTransmits = new IpSystemStatsOutTransmitsEnt(mib, this);
                    this.ipSystemStatsHCOutTransmits = new IpSystemStatsHCOutTransmitsEnt(mib, this);
                    this.ipSystemStatsOutOctets = new IpSystemStatsOutOctetsEnt(mib, this);
                    this.ipSystemStatsHCOutOctets = new IpSystemStatsHCOutOctetsEnt(mib, this);
                    this.ipSystemStatsInMcastPkts = new IpSystemStatsInMcastPktsEnt(mib, this);
                    this.ipSystemStatsHCInMcastPkts = new IpSystemStatsHCInMcastPktsEnt(mib, this);
                    this.ipSystemStatsInMcastOctets = new IpSystemStatsInMcastOctetsEnt(mib, this);
                    this.ipSystemStatsHCInMcastOctets = new IpSystemStatsHCInMcastOctetsEnt(mib, this);
                    this.ipSystemStatsOutMcastPkts = new IpSystemStatsOutMcastPktsEnt(mib, this);
                    this.ipSystemStatsHCOutMcastPkts = new IpSystemStatsHCOutMcastPktsEnt(mib, this);
                    this.ipSystemStatsOutMcastOctets = new IpSystemStatsOutMcastOctetsEnt(mib, this);
                    this.ipSystemStatsHCOutMcastOctets = new IpSystemStatsHCOutMcastOctetsEnt(mib, this);
                    this.ipSystemStatsInBcastPkts = new IpSystemStatsInBcastPktsEnt(mib, this);
                    this.ipSystemStatsHCInBcastPkts = new IpSystemStatsHCInBcastPktsEnt(mib, this);
                    this.ipSystemStatsOutBcastPkts = new IpSystemStatsOutBcastPktsEnt(mib, this);
                    this.ipSystemStatsHCOutBcastPkts = new IpSystemStatsHCOutBcastPktsEnt(mib, this);
                    this.ipSystemStatsDiscontinuityTime = new IpSystemStatsDiscontinuityTimeEnt(mib, this);
                    this.ipSystemStatsRefreshRate = new IpSystemStatsRefreshRateEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipSystemStatsIPVersion,
                        this.ipSystemStatsInReceives,
                        this.ipSystemStatsHCInReceives,
                        this.ipSystemStatsInOctets,
                        this.ipSystemStatsHCInOctets,
                        this.ipSystemStatsInHdrErrors,
                        this.ipSystemStatsInNoRoutes,
                        this.ipSystemStatsInAddrErrors,
                        this.ipSystemStatsInUnknownProtos,
                        this.ipSystemStatsInTruncatedPkts,
                        this.ipSystemStatsInForwDatagrams,
                        this.ipSystemStatsHCInForwDatagrams,
                        this.ipSystemStatsReasmReqds,
                        this.ipSystemStatsReasmOKs,
                        this.ipSystemStatsReasmFails,
                        this.ipSystemStatsInDiscards,
                        this.ipSystemStatsInDelivers,
                        this.ipSystemStatsHCInDelivers,
                        this.ipSystemStatsOutRequests,
                        this.ipSystemStatsHCOutRequests,
                        this.ipSystemStatsOutNoRoutes,
                        this.ipSystemStatsOutForwDatagrams,
                        this.ipSystemStatsHCOutForwDatagrams,
                        this.ipSystemStatsOutDiscards,
                        this.ipSystemStatsOutFragReqds,
                        this.ipSystemStatsOutFragOKs,
                        this.ipSystemStatsOutFragFails,
                        this.ipSystemStatsOutFragCreates,
                        this.ipSystemStatsOutTransmits,
                        this.ipSystemStatsHCOutTransmits,
                        this.ipSystemStatsOutOctets,
                        this.ipSystemStatsHCOutOctets,
                        this.ipSystemStatsInMcastPkts,
                        this.ipSystemStatsHCInMcastPkts,
                        this.ipSystemStatsInMcastOctets,
                        this.ipSystemStatsHCInMcastOctets,
                        this.ipSystemStatsOutMcastPkts,
                        this.ipSystemStatsHCOutMcastPkts,
                        this.ipSystemStatsOutMcastOctets,
                        this.ipSystemStatsHCOutMcastOctets,
                        this.ipSystemStatsInBcastPkts,
                        this.ipSystemStatsHCInBcastPkts,
                        this.ipSystemStatsOutBcastPkts,
                        this.ipSystemStatsHCOutBcastPkts,
                        this.ipSystemStatsDiscontinuityTime,
                        this.ipSystemStatsRefreshRate
                    };
                }
                public static final class IpSystemStatsIPVersionEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsIPVersionEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsIPVersion", "1.3.6.1.2.1.4.31.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsInReceivesEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsInReceivesEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsInReceives", "1.3.6.1.2.1.4.31.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsHCInReceivesEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsHCInReceivesEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsHCInReceives", "1.3.6.1.2.1.4.31.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsInOctetsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsInOctetsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsInOctets", "1.3.6.1.2.1.4.31.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsHCInOctetsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsHCInOctetsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsHCInOctets", "1.3.6.1.2.1.4.31.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsInHdrErrorsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsInHdrErrorsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsInHdrErrors", "1.3.6.1.2.1.4.31.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsInNoRoutesEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsInNoRoutesEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsInNoRoutes", "1.3.6.1.2.1.4.31.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsInAddrErrorsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsInAddrErrorsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsInAddrErrors", "1.3.6.1.2.1.4.31.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsInUnknownProtosEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsInUnknownProtosEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsInUnknownProtos", "1.3.6.1.2.1.4.31.1.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsInTruncatedPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsInTruncatedPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsInTruncatedPkts", "1.3.6.1.2.1.4.31.1.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsInForwDatagramsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsInForwDatagramsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsInForwDatagrams", "1.3.6.1.2.1.4.31.1.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsHCInForwDatagramsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsHCInForwDatagramsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsHCInForwDatagrams", "1.3.6.1.2.1.4.31.1.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsReasmReqdsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsReasmReqdsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsReasmReqds", "1.3.6.1.2.1.4.31.1.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsReasmOKsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsReasmOKsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsReasmOKs", "1.3.6.1.2.1.4.31.1.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsReasmFailsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsReasmFailsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsReasmFails", "1.3.6.1.2.1.4.31.1.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsInDiscardsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsInDiscardsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsInDiscards", "1.3.6.1.2.1.4.31.1.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsInDeliversEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsInDeliversEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsInDelivers", "1.3.6.1.2.1.4.31.1.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsHCInDeliversEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsHCInDeliversEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsHCInDelivers", "1.3.6.1.2.1.4.31.1.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsOutRequestsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsOutRequestsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsOutRequests", "1.3.6.1.2.1.4.31.1.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsHCOutRequestsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsHCOutRequestsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsHCOutRequests", "1.3.6.1.2.1.4.31.1.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsOutNoRoutesEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsOutNoRoutesEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsOutNoRoutes", "1.3.6.1.2.1.4.31.1.1.22", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsOutForwDatagramsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsOutForwDatagramsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsOutForwDatagrams", "1.3.6.1.2.1.4.31.1.1.23", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsHCOutForwDatagramsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsHCOutForwDatagramsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsHCOutForwDatagrams", "1.3.6.1.2.1.4.31.1.1.24", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsOutDiscardsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsOutDiscardsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsOutDiscards", "1.3.6.1.2.1.4.31.1.1.25", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsOutFragReqdsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsOutFragReqdsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsOutFragReqds", "1.3.6.1.2.1.4.31.1.1.26", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsOutFragOKsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsOutFragOKsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsOutFragOKs", "1.3.6.1.2.1.4.31.1.1.27", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsOutFragFailsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsOutFragFailsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsOutFragFails", "1.3.6.1.2.1.4.31.1.1.28", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsOutFragCreatesEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsOutFragCreatesEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsOutFragCreates", "1.3.6.1.2.1.4.31.1.1.29", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsOutTransmitsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsOutTransmitsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsOutTransmits", "1.3.6.1.2.1.4.31.1.1.30", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsHCOutTransmitsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsHCOutTransmitsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsHCOutTransmits", "1.3.6.1.2.1.4.31.1.1.31", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsOutOctetsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsOutOctetsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsOutOctets", "1.3.6.1.2.1.4.31.1.1.32", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsHCOutOctetsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsHCOutOctetsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsHCOutOctets", "1.3.6.1.2.1.4.31.1.1.33", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsInMcastPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsInMcastPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsInMcastPkts", "1.3.6.1.2.1.4.31.1.1.34", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsHCInMcastPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsHCInMcastPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsHCInMcastPkts", "1.3.6.1.2.1.4.31.1.1.35", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsInMcastOctetsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsInMcastOctetsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsInMcastOctets", "1.3.6.1.2.1.4.31.1.1.36", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsHCInMcastOctetsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsHCInMcastOctetsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsHCInMcastOctets", "1.3.6.1.2.1.4.31.1.1.37", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsOutMcastPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsOutMcastPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsOutMcastPkts", "1.3.6.1.2.1.4.31.1.1.38", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsHCOutMcastPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsHCOutMcastPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsHCOutMcastPkts", "1.3.6.1.2.1.4.31.1.1.39", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsOutMcastOctetsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsOutMcastOctetsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsOutMcastOctets", "1.3.6.1.2.1.4.31.1.1.40", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsHCOutMcastOctetsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsHCOutMcastOctetsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsHCOutMcastOctets", "1.3.6.1.2.1.4.31.1.1.41", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsInBcastPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsInBcastPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsInBcastPkts", "1.3.6.1.2.1.4.31.1.1.42", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsHCInBcastPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsHCInBcastPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsHCInBcastPkts", "1.3.6.1.2.1.4.31.1.1.43", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsOutBcastPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsOutBcastPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsOutBcastPkts", "1.3.6.1.2.1.4.31.1.1.44", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsHCOutBcastPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsHCOutBcastPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsHCOutBcastPkts", "1.3.6.1.2.1.4.31.1.1.45", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsDiscontinuityTimeEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsDiscontinuityTimeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsDiscontinuityTime", "1.3.6.1.2.1.4.31.1.1.46", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpSystemStatsRefreshRateEnt extends MIBEntry<IPMIBDef>
                {
                    private IpSystemStatsRefreshRateEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipSystemStatsRefreshRate", "1.3.6.1.2.1.4.31.1.1.47", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class IpIfStatsTableLastChangeEnt extends MIBEntry<IPMIBDef>
        {
            private IpIfStatsTableLastChangeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipIfStatsTableLastChange", "1.3.6.1.2.1.4.31.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpIfStatsTableEnt extends MIBEntry<IPMIBDef>
        {
            public final IpIfStatsEntryEnt ipIfStatsEntry;

            private IpIfStatsTableEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipIfStatsTable", "1.3.6.1.2.1.4.31.3", false, true, false, false);
                this.ipIfStatsEntry = new IpIfStatsEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipIfStatsEntry
                };
            }
            public static final class IpIfStatsEntryEnt extends MIBEntry<IPMIBDef>
            {
                public final IpIfStatsIPVersionEnt ipIfStatsIPVersion;

                public final IpIfStatsIfIndexEnt ipIfStatsIfIndex;

                public final IpIfStatsInReceivesEnt ipIfStatsInReceives;

                public final IpIfStatsHCInReceivesEnt ipIfStatsHCInReceives;

                public final IpIfStatsInOctetsEnt ipIfStatsInOctets;

                public final IpIfStatsHCInOctetsEnt ipIfStatsHCInOctets;

                public final IpIfStatsInHdrErrorsEnt ipIfStatsInHdrErrors;

                public final IpIfStatsInNoRoutesEnt ipIfStatsInNoRoutes;

                public final IpIfStatsInAddrErrorsEnt ipIfStatsInAddrErrors;

                public final IpIfStatsInUnknownProtosEnt ipIfStatsInUnknownProtos;

                public final IpIfStatsInTruncatedPktsEnt ipIfStatsInTruncatedPkts;

                public final IpIfStatsInForwDatagramsEnt ipIfStatsInForwDatagrams;

                public final IpIfStatsHCInForwDatagramsEnt ipIfStatsHCInForwDatagrams;

                public final IpIfStatsReasmReqdsEnt ipIfStatsReasmReqds;

                public final IpIfStatsReasmOKsEnt ipIfStatsReasmOKs;

                public final IpIfStatsReasmFailsEnt ipIfStatsReasmFails;

                public final IpIfStatsInDiscardsEnt ipIfStatsInDiscards;

                public final IpIfStatsInDeliversEnt ipIfStatsInDelivers;

                public final IpIfStatsHCInDeliversEnt ipIfStatsHCInDelivers;

                public final IpIfStatsOutRequestsEnt ipIfStatsOutRequests;

                public final IpIfStatsHCOutRequestsEnt ipIfStatsHCOutRequests;

                /** This object ID is reserved to allow the IDs for this table's objectsto align with the objects in the ipSystemStatsTable.::= {ipIfStatsEntry 22}*/
                public final IpIfStatsOutForwDatagramsEnt ipIfStatsOutForwDatagrams;

                public final IpIfStatsHCOutForwDatagramsEnt ipIfStatsHCOutForwDatagrams;

                public final IpIfStatsOutDiscardsEnt ipIfStatsOutDiscards;

                public final IpIfStatsOutFragReqdsEnt ipIfStatsOutFragReqds;

                public final IpIfStatsOutFragOKsEnt ipIfStatsOutFragOKs;

                public final IpIfStatsOutFragFailsEnt ipIfStatsOutFragFails;

                public final IpIfStatsOutFragCreatesEnt ipIfStatsOutFragCreates;

                public final IpIfStatsOutTransmitsEnt ipIfStatsOutTransmits;

                public final IpIfStatsHCOutTransmitsEnt ipIfStatsHCOutTransmits;

                public final IpIfStatsOutOctetsEnt ipIfStatsOutOctets;

                public final IpIfStatsHCOutOctetsEnt ipIfStatsHCOutOctets;

                public final IpIfStatsInMcastPktsEnt ipIfStatsInMcastPkts;

                public final IpIfStatsHCInMcastPktsEnt ipIfStatsHCInMcastPkts;

                public final IpIfStatsInMcastOctetsEnt ipIfStatsInMcastOctets;

                public final IpIfStatsHCInMcastOctetsEnt ipIfStatsHCInMcastOctets;

                public final IpIfStatsOutMcastPktsEnt ipIfStatsOutMcastPkts;

                public final IpIfStatsHCOutMcastPktsEnt ipIfStatsHCOutMcastPkts;

                public final IpIfStatsOutMcastOctetsEnt ipIfStatsOutMcastOctets;

                public final IpIfStatsHCOutMcastOctetsEnt ipIfStatsHCOutMcastOctets;

                public final IpIfStatsInBcastPktsEnt ipIfStatsInBcastPkts;

                public final IpIfStatsHCInBcastPktsEnt ipIfStatsHCInBcastPkts;

                public final IpIfStatsOutBcastPktsEnt ipIfStatsOutBcastPkts;

                public final IpIfStatsHCOutBcastPktsEnt ipIfStatsHCOutBcastPkts;

                public final IpIfStatsDiscontinuityTimeEnt ipIfStatsDiscontinuityTime;

                public final IpIfStatsRefreshRateEnt ipIfStatsRefreshRate;

                private IpIfStatsEntryEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipIfStatsEntry", "1.3.6.1.2.1.4.31.3.1", false, false, false, true);
                    this.ipIfStatsIPVersion = new IpIfStatsIPVersionEnt(mib, this);
                    this.ipIfStatsIfIndex = new IpIfStatsIfIndexEnt(mib, this);
                    this.ipIfStatsInReceives = new IpIfStatsInReceivesEnt(mib, this);
                    this.ipIfStatsHCInReceives = new IpIfStatsHCInReceivesEnt(mib, this);
                    this.ipIfStatsInOctets = new IpIfStatsInOctetsEnt(mib, this);
                    this.ipIfStatsHCInOctets = new IpIfStatsHCInOctetsEnt(mib, this);
                    this.ipIfStatsInHdrErrors = new IpIfStatsInHdrErrorsEnt(mib, this);
                    this.ipIfStatsInNoRoutes = new IpIfStatsInNoRoutesEnt(mib, this);
                    this.ipIfStatsInAddrErrors = new IpIfStatsInAddrErrorsEnt(mib, this);
                    this.ipIfStatsInUnknownProtos = new IpIfStatsInUnknownProtosEnt(mib, this);
                    this.ipIfStatsInTruncatedPkts = new IpIfStatsInTruncatedPktsEnt(mib, this);
                    this.ipIfStatsInForwDatagrams = new IpIfStatsInForwDatagramsEnt(mib, this);
                    this.ipIfStatsHCInForwDatagrams = new IpIfStatsHCInForwDatagramsEnt(mib, this);
                    this.ipIfStatsReasmReqds = new IpIfStatsReasmReqdsEnt(mib, this);
                    this.ipIfStatsReasmOKs = new IpIfStatsReasmOKsEnt(mib, this);
                    this.ipIfStatsReasmFails = new IpIfStatsReasmFailsEnt(mib, this);
                    this.ipIfStatsInDiscards = new IpIfStatsInDiscardsEnt(mib, this);
                    this.ipIfStatsInDelivers = new IpIfStatsInDeliversEnt(mib, this);
                    this.ipIfStatsHCInDelivers = new IpIfStatsHCInDeliversEnt(mib, this);
                    this.ipIfStatsOutRequests = new IpIfStatsOutRequestsEnt(mib, this);
                    this.ipIfStatsHCOutRequests = new IpIfStatsHCOutRequestsEnt(mib, this);
                    this.ipIfStatsOutForwDatagrams = new IpIfStatsOutForwDatagramsEnt(mib, this);
                    this.ipIfStatsHCOutForwDatagrams = new IpIfStatsHCOutForwDatagramsEnt(mib, this);
                    this.ipIfStatsOutDiscards = new IpIfStatsOutDiscardsEnt(mib, this);
                    this.ipIfStatsOutFragReqds = new IpIfStatsOutFragReqdsEnt(mib, this);
                    this.ipIfStatsOutFragOKs = new IpIfStatsOutFragOKsEnt(mib, this);
                    this.ipIfStatsOutFragFails = new IpIfStatsOutFragFailsEnt(mib, this);
                    this.ipIfStatsOutFragCreates = new IpIfStatsOutFragCreatesEnt(mib, this);
                    this.ipIfStatsOutTransmits = new IpIfStatsOutTransmitsEnt(mib, this);
                    this.ipIfStatsHCOutTransmits = new IpIfStatsHCOutTransmitsEnt(mib, this);
                    this.ipIfStatsOutOctets = new IpIfStatsOutOctetsEnt(mib, this);
                    this.ipIfStatsHCOutOctets = new IpIfStatsHCOutOctetsEnt(mib, this);
                    this.ipIfStatsInMcastPkts = new IpIfStatsInMcastPktsEnt(mib, this);
                    this.ipIfStatsHCInMcastPkts = new IpIfStatsHCInMcastPktsEnt(mib, this);
                    this.ipIfStatsInMcastOctets = new IpIfStatsInMcastOctetsEnt(mib, this);
                    this.ipIfStatsHCInMcastOctets = new IpIfStatsHCInMcastOctetsEnt(mib, this);
                    this.ipIfStatsOutMcastPkts = new IpIfStatsOutMcastPktsEnt(mib, this);
                    this.ipIfStatsHCOutMcastPkts = new IpIfStatsHCOutMcastPktsEnt(mib, this);
                    this.ipIfStatsOutMcastOctets = new IpIfStatsOutMcastOctetsEnt(mib, this);
                    this.ipIfStatsHCOutMcastOctets = new IpIfStatsHCOutMcastOctetsEnt(mib, this);
                    this.ipIfStatsInBcastPkts = new IpIfStatsInBcastPktsEnt(mib, this);
                    this.ipIfStatsHCInBcastPkts = new IpIfStatsHCInBcastPktsEnt(mib, this);
                    this.ipIfStatsOutBcastPkts = new IpIfStatsOutBcastPktsEnt(mib, this);
                    this.ipIfStatsHCOutBcastPkts = new IpIfStatsHCOutBcastPktsEnt(mib, this);
                    this.ipIfStatsDiscontinuityTime = new IpIfStatsDiscontinuityTimeEnt(mib, this);
                    this.ipIfStatsRefreshRate = new IpIfStatsRefreshRateEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipIfStatsIPVersion,
                        this.ipIfStatsIfIndex,
                        this.ipIfStatsInReceives,
                        this.ipIfStatsHCInReceives,
                        this.ipIfStatsInOctets,
                        this.ipIfStatsHCInOctets,
                        this.ipIfStatsInHdrErrors,
                        this.ipIfStatsInNoRoutes,
                        this.ipIfStatsInAddrErrors,
                        this.ipIfStatsInUnknownProtos,
                        this.ipIfStatsInTruncatedPkts,
                        this.ipIfStatsInForwDatagrams,
                        this.ipIfStatsHCInForwDatagrams,
                        this.ipIfStatsReasmReqds,
                        this.ipIfStatsReasmOKs,
                        this.ipIfStatsReasmFails,
                        this.ipIfStatsInDiscards,
                        this.ipIfStatsInDelivers,
                        this.ipIfStatsHCInDelivers,
                        this.ipIfStatsOutRequests,
                        this.ipIfStatsHCOutRequests,
                        this.ipIfStatsOutForwDatagrams,
                        this.ipIfStatsHCOutForwDatagrams,
                        this.ipIfStatsOutDiscards,
                        this.ipIfStatsOutFragReqds,
                        this.ipIfStatsOutFragOKs,
                        this.ipIfStatsOutFragFails,
                        this.ipIfStatsOutFragCreates,
                        this.ipIfStatsOutTransmits,
                        this.ipIfStatsHCOutTransmits,
                        this.ipIfStatsOutOctets,
                        this.ipIfStatsHCOutOctets,
                        this.ipIfStatsInMcastPkts,
                        this.ipIfStatsHCInMcastPkts,
                        this.ipIfStatsInMcastOctets,
                        this.ipIfStatsHCInMcastOctets,
                        this.ipIfStatsOutMcastPkts,
                        this.ipIfStatsHCOutMcastPkts,
                        this.ipIfStatsOutMcastOctets,
                        this.ipIfStatsHCOutMcastOctets,
                        this.ipIfStatsInBcastPkts,
                        this.ipIfStatsHCInBcastPkts,
                        this.ipIfStatsOutBcastPkts,
                        this.ipIfStatsHCOutBcastPkts,
                        this.ipIfStatsDiscontinuityTime,
                        this.ipIfStatsRefreshRate
                    };
                }
                public static final class IpIfStatsIPVersionEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsIPVersionEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsIPVersion", "1.3.6.1.2.1.4.31.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsIfIndexEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsIfIndexEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsIfIndex", "1.3.6.1.2.1.4.31.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsInReceivesEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsInReceivesEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsInReceives", "1.3.6.1.2.1.4.31.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsHCInReceivesEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsHCInReceivesEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsHCInReceives", "1.3.6.1.2.1.4.31.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsInOctetsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsInOctetsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsInOctets", "1.3.6.1.2.1.4.31.3.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsHCInOctetsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsHCInOctetsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsHCInOctets", "1.3.6.1.2.1.4.31.3.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsInHdrErrorsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsInHdrErrorsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsInHdrErrors", "1.3.6.1.2.1.4.31.3.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsInNoRoutesEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsInNoRoutesEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsInNoRoutes", "1.3.6.1.2.1.4.31.3.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsInAddrErrorsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsInAddrErrorsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsInAddrErrors", "1.3.6.1.2.1.4.31.3.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsInUnknownProtosEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsInUnknownProtosEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsInUnknownProtos", "1.3.6.1.2.1.4.31.3.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsInTruncatedPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsInTruncatedPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsInTruncatedPkts", "1.3.6.1.2.1.4.31.3.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsInForwDatagramsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsInForwDatagramsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsInForwDatagrams", "1.3.6.1.2.1.4.31.3.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsHCInForwDatagramsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsHCInForwDatagramsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsHCInForwDatagrams", "1.3.6.1.2.1.4.31.3.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsReasmReqdsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsReasmReqdsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsReasmReqds", "1.3.6.1.2.1.4.31.3.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsReasmOKsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsReasmOKsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsReasmOKs", "1.3.6.1.2.1.4.31.3.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsReasmFailsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsReasmFailsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsReasmFails", "1.3.6.1.2.1.4.31.3.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsInDiscardsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsInDiscardsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsInDiscards", "1.3.6.1.2.1.4.31.3.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsInDeliversEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsInDeliversEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsInDelivers", "1.3.6.1.2.1.4.31.3.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsHCInDeliversEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsHCInDeliversEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsHCInDelivers", "1.3.6.1.2.1.4.31.3.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsOutRequestsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsOutRequestsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsOutRequests", "1.3.6.1.2.1.4.31.3.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsHCOutRequestsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsHCOutRequestsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsHCOutRequests", "1.3.6.1.2.1.4.31.3.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsOutForwDatagramsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsOutForwDatagramsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsOutForwDatagrams", "1.3.6.1.2.1.4.31.3.1.23", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsHCOutForwDatagramsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsHCOutForwDatagramsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsHCOutForwDatagrams", "1.3.6.1.2.1.4.31.3.1.24", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsOutDiscardsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsOutDiscardsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsOutDiscards", "1.3.6.1.2.1.4.31.3.1.25", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsOutFragReqdsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsOutFragReqdsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsOutFragReqds", "1.3.6.1.2.1.4.31.3.1.26", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsOutFragOKsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsOutFragOKsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsOutFragOKs", "1.3.6.1.2.1.4.31.3.1.27", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsOutFragFailsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsOutFragFailsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsOutFragFails", "1.3.6.1.2.1.4.31.3.1.28", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsOutFragCreatesEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsOutFragCreatesEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsOutFragCreates", "1.3.6.1.2.1.4.31.3.1.29", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsOutTransmitsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsOutTransmitsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsOutTransmits", "1.3.6.1.2.1.4.31.3.1.30", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsHCOutTransmitsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsHCOutTransmitsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsHCOutTransmits", "1.3.6.1.2.1.4.31.3.1.31", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsOutOctetsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsOutOctetsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsOutOctets", "1.3.6.1.2.1.4.31.3.1.32", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsHCOutOctetsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsHCOutOctetsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsHCOutOctets", "1.3.6.1.2.1.4.31.3.1.33", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsInMcastPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsInMcastPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsInMcastPkts", "1.3.6.1.2.1.4.31.3.1.34", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsHCInMcastPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsHCInMcastPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsHCInMcastPkts", "1.3.6.1.2.1.4.31.3.1.35", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsInMcastOctetsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsInMcastOctetsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsInMcastOctets", "1.3.6.1.2.1.4.31.3.1.36", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsHCInMcastOctetsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsHCInMcastOctetsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsHCInMcastOctets", "1.3.6.1.2.1.4.31.3.1.37", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsOutMcastPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsOutMcastPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsOutMcastPkts", "1.3.6.1.2.1.4.31.3.1.38", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsHCOutMcastPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsHCOutMcastPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsHCOutMcastPkts", "1.3.6.1.2.1.4.31.3.1.39", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsOutMcastOctetsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsOutMcastOctetsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsOutMcastOctets", "1.3.6.1.2.1.4.31.3.1.40", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsHCOutMcastOctetsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsHCOutMcastOctetsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsHCOutMcastOctets", "1.3.6.1.2.1.4.31.3.1.41", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsInBcastPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsInBcastPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsInBcastPkts", "1.3.6.1.2.1.4.31.3.1.42", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsHCInBcastPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsHCInBcastPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsHCInBcastPkts", "1.3.6.1.2.1.4.31.3.1.43", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsOutBcastPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsOutBcastPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsOutBcastPkts", "1.3.6.1.2.1.4.31.3.1.44", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsHCOutBcastPktsEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsHCOutBcastPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsHCOutBcastPkts", "1.3.6.1.2.1.4.31.3.1.45", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsDiscontinuityTimeEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsDiscontinuityTimeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsDiscontinuityTime", "1.3.6.1.2.1.4.31.3.1.46", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpIfStatsRefreshRateEnt extends MIBEntry<IPMIBDef>
                {
                    private IpIfStatsRefreshRateEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                    {
                        super(mib, parent, "ipIfStatsRefreshRate", "1.3.6.1.2.1.4.31.3.1.47", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class IpAddressPrefixTableEnt extends MIBEntry<IPMIBDef>
    {
        public final IpAddressPrefixEntryEnt ipAddressPrefixEntry;

        private IpAddressPrefixTableEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "ipAddressPrefixTable", "1.3.6.1.2.1.4.32", false, true, false, false);
            this.ipAddressPrefixEntry = new IpAddressPrefixEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipAddressPrefixEntry
            };
        }
        public static final class IpAddressPrefixEntryEnt extends MIBEntry<IPMIBDef>
        {
            public final IpAddressPrefixIfIndexEnt ipAddressPrefixIfIndex;

            public final IpAddressPrefixTypeEnt ipAddressPrefixType;

            public final IpAddressPrefixPrefixEnt ipAddressPrefixPrefix;

            public final IpAddressPrefixLengthEnt ipAddressPrefixLength;

            public final IpAddressPrefixOriginEnt ipAddressPrefixOrigin;

            public final IpAddressPrefixOnLinkFlagEnt ipAddressPrefixOnLinkFlag;

            public final IpAddressPrefixAutonomousFlagEnt ipAddressPrefixAutonomousFlag;

            public final IpAddressPrefixAdvPreferredLifetimeEnt ipAddressPrefixAdvPreferredLifetime;

            public final IpAddressPrefixAdvValidLifetimeEnt ipAddressPrefixAdvValidLifetime;

            private IpAddressPrefixEntryEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipAddressPrefixEntry", "1.3.6.1.2.1.4.32.1", false, false, false, true);
                this.ipAddressPrefixIfIndex = new IpAddressPrefixIfIndexEnt(mib, this);
                this.ipAddressPrefixType = new IpAddressPrefixTypeEnt(mib, this);
                this.ipAddressPrefixPrefix = new IpAddressPrefixPrefixEnt(mib, this);
                this.ipAddressPrefixLength = new IpAddressPrefixLengthEnt(mib, this);
                this.ipAddressPrefixOrigin = new IpAddressPrefixOriginEnt(mib, this);
                this.ipAddressPrefixOnLinkFlag = new IpAddressPrefixOnLinkFlagEnt(mib, this);
                this.ipAddressPrefixAutonomousFlag = new IpAddressPrefixAutonomousFlagEnt(mib, this);
                this.ipAddressPrefixAdvPreferredLifetime = new IpAddressPrefixAdvPreferredLifetimeEnt(mib, this);
                this.ipAddressPrefixAdvValidLifetime = new IpAddressPrefixAdvValidLifetimeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipAddressPrefixIfIndex,
                    this.ipAddressPrefixType,
                    this.ipAddressPrefixPrefix,
                    this.ipAddressPrefixLength,
                    this.ipAddressPrefixOrigin,
                    this.ipAddressPrefixOnLinkFlag,
                    this.ipAddressPrefixAutonomousFlag,
                    this.ipAddressPrefixAdvPreferredLifetime,
                    this.ipAddressPrefixAdvValidLifetime
                };
            }
            public static final class IpAddressPrefixIfIndexEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressPrefixIfIndexEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressPrefixIfIndex", "1.3.6.1.2.1.4.32.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressPrefixTypeEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressPrefixTypeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressPrefixType", "1.3.6.1.2.1.4.32.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressPrefixPrefixEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressPrefixPrefixEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressPrefixPrefix", "1.3.6.1.2.1.4.32.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressPrefixLengthEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressPrefixLengthEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressPrefixLength", "1.3.6.1.2.1.4.32.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressPrefixOriginEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressPrefixOriginEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressPrefixOrigin", "1.3.6.1.2.1.4.32.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressPrefixOnLinkFlagEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressPrefixOnLinkFlagEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressPrefixOnLinkFlag", "1.3.6.1.2.1.4.32.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressPrefixAutonomousFlagEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressPrefixAutonomousFlagEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressPrefixAutonomousFlag", "1.3.6.1.2.1.4.32.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressPrefixAdvPreferredLifetimeEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressPrefixAdvPreferredLifetimeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressPrefixAdvPreferredLifetime", "1.3.6.1.2.1.4.32.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressPrefixAdvValidLifetimeEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressPrefixAdvValidLifetimeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressPrefixAdvValidLifetime", "1.3.6.1.2.1.4.32.1.9", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class IpAddressSpinLockEnt extends MIBEntry<IPMIBDef>
    {
        private IpAddressSpinLockEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "ipAddressSpinLock", "1.3.6.1.2.1.4.33", true, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class IpAddressTableEnt extends MIBEntry<IPMIBDef>
    {
        public final IpAddressEntryEnt ipAddressEntry;

        private IpAddressTableEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "ipAddressTable", "1.3.6.1.2.1.4.34", false, true, false, false);
            this.ipAddressEntry = new IpAddressEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipAddressEntry
            };
        }
        public static final class IpAddressEntryEnt extends MIBEntry<IPMIBDef>
        {
            public final IpAddressAddrTypeEnt ipAddressAddrType;

            public final IpAddressAddrEnt ipAddressAddr;

            public final IpAddressIfIndexEnt ipAddressIfIndex;

            public final IpAddressTypeEnt ipAddressType;

            public final IpAddressPrefixEnt ipAddressPrefix;

            public final IpAddressOriginEnt ipAddressOrigin;

            public final IpAddressStatusEnt ipAddressStatus;

            public final IpAddressCreatedEnt ipAddressCreated;

            public final IpAddressLastChangedEnt ipAddressLastChanged;

            public final IpAddressRowStatusEnt ipAddressRowStatus;

            public final IpAddressStorageTypeEnt ipAddressStorageType;

            private IpAddressEntryEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipAddressEntry", "1.3.6.1.2.1.4.34.1", false, false, false, true);
                this.ipAddressAddrType = new IpAddressAddrTypeEnt(mib, this);
                this.ipAddressAddr = new IpAddressAddrEnt(mib, this);
                this.ipAddressIfIndex = new IpAddressIfIndexEnt(mib, this);
                this.ipAddressType = new IpAddressTypeEnt(mib, this);
                this.ipAddressPrefix = new IpAddressPrefixEnt(mib, this);
                this.ipAddressOrigin = new IpAddressOriginEnt(mib, this);
                this.ipAddressStatus = new IpAddressStatusEnt(mib, this);
                this.ipAddressCreated = new IpAddressCreatedEnt(mib, this);
                this.ipAddressLastChanged = new IpAddressLastChangedEnt(mib, this);
                this.ipAddressRowStatus = new IpAddressRowStatusEnt(mib, this);
                this.ipAddressStorageType = new IpAddressStorageTypeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipAddressAddrType,
                    this.ipAddressAddr,
                    this.ipAddressIfIndex,
                    this.ipAddressType,
                    this.ipAddressPrefix,
                    this.ipAddressOrigin,
                    this.ipAddressStatus,
                    this.ipAddressCreated,
                    this.ipAddressLastChanged,
                    this.ipAddressRowStatus,
                    this.ipAddressStorageType
                };
            }
            public static final class IpAddressAddrTypeEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressAddrTypeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressAddrType", "1.3.6.1.2.1.4.34.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressAddrEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressAddrEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressAddr", "1.3.6.1.2.1.4.34.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressIfIndexEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressIfIndexEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressIfIndex", "1.3.6.1.2.1.4.34.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressTypeEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressTypeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressType", "1.3.6.1.2.1.4.34.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressPrefixEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressPrefixEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressPrefix", "1.3.6.1.2.1.4.34.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressOriginEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressOriginEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressOrigin", "1.3.6.1.2.1.4.34.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressStatusEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressStatusEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressStatus", "1.3.6.1.2.1.4.34.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressCreatedEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressCreatedEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressCreated", "1.3.6.1.2.1.4.34.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressLastChangedEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressLastChangedEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressLastChanged", "1.3.6.1.2.1.4.34.1.9", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressRowStatusEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressRowStatusEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressRowStatus", "1.3.6.1.2.1.4.34.1.10", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpAddressStorageTypeEnt extends MIBEntry<IPMIBDef>
            {
                private IpAddressStorageTypeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipAddressStorageType", "1.3.6.1.2.1.4.34.1.11", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class IpNetToPhysicalTableEnt extends MIBEntry<IPMIBDef>
    {
        public final IpNetToPhysicalEntryEnt ipNetToPhysicalEntry;

        private IpNetToPhysicalTableEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "ipNetToPhysicalTable", "1.3.6.1.2.1.4.35", false, true, false, false);
            this.ipNetToPhysicalEntry = new IpNetToPhysicalEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipNetToPhysicalEntry
            };
        }
        public static final class IpNetToPhysicalEntryEnt extends MIBEntry<IPMIBDef>
        {
            public final IpNetToPhysicalIfIndexEnt ipNetToPhysicalIfIndex;

            public final IpNetToPhysicalNetAddressTypeEnt ipNetToPhysicalNetAddressType;

            public final IpNetToPhysicalNetAddressEnt ipNetToPhysicalNetAddress;

            public final IpNetToPhysicalPhysAddressEnt ipNetToPhysicalPhysAddress;

            public final IpNetToPhysicalLastUpdatedEnt ipNetToPhysicalLastUpdated;

            public final IpNetToPhysicalTypeEnt ipNetToPhysicalType;

            public final IpNetToPhysicalStateEnt ipNetToPhysicalState;

            public final IpNetToPhysicalRowStatusEnt ipNetToPhysicalRowStatus;

            private IpNetToPhysicalEntryEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipNetToPhysicalEntry", "1.3.6.1.2.1.4.35.1", false, false, false, true);
                this.ipNetToPhysicalIfIndex = new IpNetToPhysicalIfIndexEnt(mib, this);
                this.ipNetToPhysicalNetAddressType = new IpNetToPhysicalNetAddressTypeEnt(mib, this);
                this.ipNetToPhysicalNetAddress = new IpNetToPhysicalNetAddressEnt(mib, this);
                this.ipNetToPhysicalPhysAddress = new IpNetToPhysicalPhysAddressEnt(mib, this);
                this.ipNetToPhysicalLastUpdated = new IpNetToPhysicalLastUpdatedEnt(mib, this);
                this.ipNetToPhysicalType = new IpNetToPhysicalTypeEnt(mib, this);
                this.ipNetToPhysicalState = new IpNetToPhysicalStateEnt(mib, this);
                this.ipNetToPhysicalRowStatus = new IpNetToPhysicalRowStatusEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipNetToPhysicalIfIndex,
                    this.ipNetToPhysicalNetAddressType,
                    this.ipNetToPhysicalNetAddress,
                    this.ipNetToPhysicalPhysAddress,
                    this.ipNetToPhysicalLastUpdated,
                    this.ipNetToPhysicalType,
                    this.ipNetToPhysicalState,
                    this.ipNetToPhysicalRowStatus
                };
            }
            public static final class IpNetToPhysicalIfIndexEnt extends MIBEntry<IPMIBDef>
            {
                private IpNetToPhysicalIfIndexEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipNetToPhysicalIfIndex", "1.3.6.1.2.1.4.35.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpNetToPhysicalNetAddressTypeEnt extends MIBEntry<IPMIBDef>
            {
                private IpNetToPhysicalNetAddressTypeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipNetToPhysicalNetAddressType", "1.3.6.1.2.1.4.35.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpNetToPhysicalNetAddressEnt extends MIBEntry<IPMIBDef>
            {
                private IpNetToPhysicalNetAddressEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipNetToPhysicalNetAddress", "1.3.6.1.2.1.4.35.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpNetToPhysicalPhysAddressEnt extends MIBEntry<IPMIBDef>
            {
                private IpNetToPhysicalPhysAddressEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipNetToPhysicalPhysAddress", "1.3.6.1.2.1.4.35.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpNetToPhysicalLastUpdatedEnt extends MIBEntry<IPMIBDef>
            {
                private IpNetToPhysicalLastUpdatedEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipNetToPhysicalLastUpdated", "1.3.6.1.2.1.4.35.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpNetToPhysicalTypeEnt extends MIBEntry<IPMIBDef>
            {
                private IpNetToPhysicalTypeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipNetToPhysicalType", "1.3.6.1.2.1.4.35.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpNetToPhysicalStateEnt extends MIBEntry<IPMIBDef>
            {
                private IpNetToPhysicalStateEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipNetToPhysicalState", "1.3.6.1.2.1.4.35.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpNetToPhysicalRowStatusEnt extends MIBEntry<IPMIBDef>
            {
                private IpNetToPhysicalRowStatusEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipNetToPhysicalRowStatus", "1.3.6.1.2.1.4.35.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class Ipv6ScopeZoneIndexTableEnt extends MIBEntry<IPMIBDef>
    {
        public final Ipv6ScopeZoneIndexEntryEnt ipv6ScopeZoneIndexEntry;

        private Ipv6ScopeZoneIndexTableEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "ipv6ScopeZoneIndexTable", "1.3.6.1.2.1.4.36", false, true, false, false);
            this.ipv6ScopeZoneIndexEntry = new Ipv6ScopeZoneIndexEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipv6ScopeZoneIndexEntry
            };
        }
        public static final class Ipv6ScopeZoneIndexEntryEnt extends MIBEntry<IPMIBDef>
        {
            public final Ipv6ScopeZoneIndexIfIndexEnt ipv6ScopeZoneIndexIfIndex;

            public final Ipv6ScopeZoneIndexLinkLocalEnt ipv6ScopeZoneIndexLinkLocal;

            public final Ipv6ScopeZoneIndex3Ent ipv6ScopeZoneIndex3;

            public final Ipv6ScopeZoneIndexAdminLocalEnt ipv6ScopeZoneIndexAdminLocal;

            public final Ipv6ScopeZoneIndexSiteLocalEnt ipv6ScopeZoneIndexSiteLocal;

            public final Ipv6ScopeZoneIndex6Ent ipv6ScopeZoneIndex6;

            public final Ipv6ScopeZoneIndex7Ent ipv6ScopeZoneIndex7;

            public final Ipv6ScopeZoneIndexOrganizationLocalEnt ipv6ScopeZoneIndexOrganizationLocal;

            public final Ipv6ScopeZoneIndex9Ent ipv6ScopeZoneIndex9;

            public final Ipv6ScopeZoneIndexAEnt ipv6ScopeZoneIndexA;

            public final Ipv6ScopeZoneIndexBEnt ipv6ScopeZoneIndexB;

            public final Ipv6ScopeZoneIndexCEnt ipv6ScopeZoneIndexC;

            public final Ipv6ScopeZoneIndexDEnt ipv6ScopeZoneIndexD;

            private Ipv6ScopeZoneIndexEntryEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipv6ScopeZoneIndexEntry", "1.3.6.1.2.1.4.36.1", false, false, false, true);
                this.ipv6ScopeZoneIndexIfIndex = new Ipv6ScopeZoneIndexIfIndexEnt(mib, this);
                this.ipv6ScopeZoneIndexLinkLocal = new Ipv6ScopeZoneIndexLinkLocalEnt(mib, this);
                this.ipv6ScopeZoneIndex3 = new Ipv6ScopeZoneIndex3Ent(mib, this);
                this.ipv6ScopeZoneIndexAdminLocal = new Ipv6ScopeZoneIndexAdminLocalEnt(mib, this);
                this.ipv6ScopeZoneIndexSiteLocal = new Ipv6ScopeZoneIndexSiteLocalEnt(mib, this);
                this.ipv6ScopeZoneIndex6 = new Ipv6ScopeZoneIndex6Ent(mib, this);
                this.ipv6ScopeZoneIndex7 = new Ipv6ScopeZoneIndex7Ent(mib, this);
                this.ipv6ScopeZoneIndexOrganizationLocal = new Ipv6ScopeZoneIndexOrganizationLocalEnt(mib, this);
                this.ipv6ScopeZoneIndex9 = new Ipv6ScopeZoneIndex9Ent(mib, this);
                this.ipv6ScopeZoneIndexA = new Ipv6ScopeZoneIndexAEnt(mib, this);
                this.ipv6ScopeZoneIndexB = new Ipv6ScopeZoneIndexBEnt(mib, this);
                this.ipv6ScopeZoneIndexC = new Ipv6ScopeZoneIndexCEnt(mib, this);
                this.ipv6ScopeZoneIndexD = new Ipv6ScopeZoneIndexDEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipv6ScopeZoneIndexIfIndex,
                    this.ipv6ScopeZoneIndexLinkLocal,
                    this.ipv6ScopeZoneIndex3,
                    this.ipv6ScopeZoneIndexAdminLocal,
                    this.ipv6ScopeZoneIndexSiteLocal,
                    this.ipv6ScopeZoneIndex6,
                    this.ipv6ScopeZoneIndex7,
                    this.ipv6ScopeZoneIndexOrganizationLocal,
                    this.ipv6ScopeZoneIndex9,
                    this.ipv6ScopeZoneIndexA,
                    this.ipv6ScopeZoneIndexB,
                    this.ipv6ScopeZoneIndexC,
                    this.ipv6ScopeZoneIndexD
                };
            }
            public static final class Ipv6ScopeZoneIndexIfIndexEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6ScopeZoneIndexIfIndexEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6ScopeZoneIndexIfIndex", "1.3.6.1.2.1.4.36.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6ScopeZoneIndexLinkLocalEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6ScopeZoneIndexLinkLocalEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6ScopeZoneIndexLinkLocal", "1.3.6.1.2.1.4.36.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6ScopeZoneIndex3Ent extends MIBEntry<IPMIBDef>
            {
                private Ipv6ScopeZoneIndex3Ent(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6ScopeZoneIndex3", "1.3.6.1.2.1.4.36.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6ScopeZoneIndexAdminLocalEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6ScopeZoneIndexAdminLocalEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6ScopeZoneIndexAdminLocal", "1.3.6.1.2.1.4.36.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6ScopeZoneIndexSiteLocalEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6ScopeZoneIndexSiteLocalEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6ScopeZoneIndexSiteLocal", "1.3.6.1.2.1.4.36.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6ScopeZoneIndex6Ent extends MIBEntry<IPMIBDef>
            {
                private Ipv6ScopeZoneIndex6Ent(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6ScopeZoneIndex6", "1.3.6.1.2.1.4.36.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6ScopeZoneIndex7Ent extends MIBEntry<IPMIBDef>
            {
                private Ipv6ScopeZoneIndex7Ent(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6ScopeZoneIndex7", "1.3.6.1.2.1.4.36.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6ScopeZoneIndexOrganizationLocalEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6ScopeZoneIndexOrganizationLocalEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6ScopeZoneIndexOrganizationLocal", "1.3.6.1.2.1.4.36.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6ScopeZoneIndex9Ent extends MIBEntry<IPMIBDef>
            {
                private Ipv6ScopeZoneIndex9Ent(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6ScopeZoneIndex9", "1.3.6.1.2.1.4.36.1.9", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6ScopeZoneIndexAEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6ScopeZoneIndexAEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6ScopeZoneIndexA", "1.3.6.1.2.1.4.36.1.10", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6ScopeZoneIndexBEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6ScopeZoneIndexBEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6ScopeZoneIndexB", "1.3.6.1.2.1.4.36.1.11", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6ScopeZoneIndexCEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6ScopeZoneIndexCEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6ScopeZoneIndexC", "1.3.6.1.2.1.4.36.1.12", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6ScopeZoneIndexDEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6ScopeZoneIndexDEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6ScopeZoneIndexD", "1.3.6.1.2.1.4.36.1.13", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class IpDefaultRouterTableEnt extends MIBEntry<IPMIBDef>
    {
        public final IpDefaultRouterEntryEnt ipDefaultRouterEntry;

        private IpDefaultRouterTableEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "ipDefaultRouterTable", "1.3.6.1.2.1.4.37", false, true, false, false);
            this.ipDefaultRouterEntry = new IpDefaultRouterEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipDefaultRouterEntry
            };
        }
        public static final class IpDefaultRouterEntryEnt extends MIBEntry<IPMIBDef>
        {
            public final IpDefaultRouterAddressTypeEnt ipDefaultRouterAddressType;

            public final IpDefaultRouterAddressEnt ipDefaultRouterAddress;

            public final IpDefaultRouterIfIndexEnt ipDefaultRouterIfIndex;

            public final IpDefaultRouterLifetimeEnt ipDefaultRouterLifetime;

            public final IpDefaultRouterPreferenceEnt ipDefaultRouterPreference;

            private IpDefaultRouterEntryEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipDefaultRouterEntry", "1.3.6.1.2.1.4.37.1", false, false, false, true);
                this.ipDefaultRouterAddressType = new IpDefaultRouterAddressTypeEnt(mib, this);
                this.ipDefaultRouterAddress = new IpDefaultRouterAddressEnt(mib, this);
                this.ipDefaultRouterIfIndex = new IpDefaultRouterIfIndexEnt(mib, this);
                this.ipDefaultRouterLifetime = new IpDefaultRouterLifetimeEnt(mib, this);
                this.ipDefaultRouterPreference = new IpDefaultRouterPreferenceEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipDefaultRouterAddressType,
                    this.ipDefaultRouterAddress,
                    this.ipDefaultRouterIfIndex,
                    this.ipDefaultRouterLifetime,
                    this.ipDefaultRouterPreference
                };
            }
            public static final class IpDefaultRouterAddressTypeEnt extends MIBEntry<IPMIBDef>
            {
                private IpDefaultRouterAddressTypeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipDefaultRouterAddressType", "1.3.6.1.2.1.4.37.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpDefaultRouterAddressEnt extends MIBEntry<IPMIBDef>
            {
                private IpDefaultRouterAddressEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipDefaultRouterAddress", "1.3.6.1.2.1.4.37.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpDefaultRouterIfIndexEnt extends MIBEntry<IPMIBDef>
            {
                private IpDefaultRouterIfIndexEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipDefaultRouterIfIndex", "1.3.6.1.2.1.4.37.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpDefaultRouterLifetimeEnt extends MIBEntry<IPMIBDef>
            {
                private IpDefaultRouterLifetimeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipDefaultRouterLifetime", "1.3.6.1.2.1.4.37.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IpDefaultRouterPreferenceEnt extends MIBEntry<IPMIBDef>
            {
                private IpDefaultRouterPreferenceEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipDefaultRouterPreference", "1.3.6.1.2.1.4.37.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class Ipv6RouterAdvertSpinLockEnt extends MIBEntry<IPMIBDef>
    {
        private Ipv6RouterAdvertSpinLockEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "ipv6RouterAdvertSpinLock", "1.3.6.1.2.1.4.38", true, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class Ipv6RouterAdvertTableEnt extends MIBEntry<IPMIBDef>
    {
        public final Ipv6RouterAdvertEntryEnt ipv6RouterAdvertEntry;

        private Ipv6RouterAdvertTableEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "ipv6RouterAdvertTable", "1.3.6.1.2.1.4.39", false, true, false, false);
            this.ipv6RouterAdvertEntry = new Ipv6RouterAdvertEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipv6RouterAdvertEntry
            };
        }
        public static final class Ipv6RouterAdvertEntryEnt extends MIBEntry<IPMIBDef>
        {
            public final Ipv6RouterAdvertIfIndexEnt ipv6RouterAdvertIfIndex;

            public final Ipv6RouterAdvertSendAdvertsEnt ipv6RouterAdvertSendAdverts;

            public final Ipv6RouterAdvertMaxIntervalEnt ipv6RouterAdvertMaxInterval;

            public final Ipv6RouterAdvertMinIntervalEnt ipv6RouterAdvertMinInterval;

            public final Ipv6RouterAdvertManagedFlagEnt ipv6RouterAdvertManagedFlag;

            public final Ipv6RouterAdvertOtherConfigFlagEnt ipv6RouterAdvertOtherConfigFlag;

            public final Ipv6RouterAdvertLinkMTUEnt ipv6RouterAdvertLinkMTU;

            public final Ipv6RouterAdvertReachableTimeEnt ipv6RouterAdvertReachableTime;

            public final Ipv6RouterAdvertRetransmitTimeEnt ipv6RouterAdvertRetransmitTime;

            public final Ipv6RouterAdvertCurHopLimitEnt ipv6RouterAdvertCurHopLimit;

            public final Ipv6RouterAdvertDefaultLifetimeEnt ipv6RouterAdvertDefaultLifetime;

            public final Ipv6RouterAdvertRowStatusEnt ipv6RouterAdvertRowStatus;

            private Ipv6RouterAdvertEntryEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "ipv6RouterAdvertEntry", "1.3.6.1.2.1.4.39.1", false, false, false, true);
                this.ipv6RouterAdvertIfIndex = new Ipv6RouterAdvertIfIndexEnt(mib, this);
                this.ipv6RouterAdvertSendAdverts = new Ipv6RouterAdvertSendAdvertsEnt(mib, this);
                this.ipv6RouterAdvertMaxInterval = new Ipv6RouterAdvertMaxIntervalEnt(mib, this);
                this.ipv6RouterAdvertMinInterval = new Ipv6RouterAdvertMinIntervalEnt(mib, this);
                this.ipv6RouterAdvertManagedFlag = new Ipv6RouterAdvertManagedFlagEnt(mib, this);
                this.ipv6RouterAdvertOtherConfigFlag = new Ipv6RouterAdvertOtherConfigFlagEnt(mib, this);
                this.ipv6RouterAdvertLinkMTU = new Ipv6RouterAdvertLinkMTUEnt(mib, this);
                this.ipv6RouterAdvertReachableTime = new Ipv6RouterAdvertReachableTimeEnt(mib, this);
                this.ipv6RouterAdvertRetransmitTime = new Ipv6RouterAdvertRetransmitTimeEnt(mib, this);
                this.ipv6RouterAdvertCurHopLimit = new Ipv6RouterAdvertCurHopLimitEnt(mib, this);
                this.ipv6RouterAdvertDefaultLifetime = new Ipv6RouterAdvertDefaultLifetimeEnt(mib, this);
                this.ipv6RouterAdvertRowStatus = new Ipv6RouterAdvertRowStatusEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipv6RouterAdvertIfIndex,
                    this.ipv6RouterAdvertSendAdverts,
                    this.ipv6RouterAdvertMaxInterval,
                    this.ipv6RouterAdvertMinInterval,
                    this.ipv6RouterAdvertManagedFlag,
                    this.ipv6RouterAdvertOtherConfigFlag,
                    this.ipv6RouterAdvertLinkMTU,
                    this.ipv6RouterAdvertReachableTime,
                    this.ipv6RouterAdvertRetransmitTime,
                    this.ipv6RouterAdvertCurHopLimit,
                    this.ipv6RouterAdvertDefaultLifetime,
                    this.ipv6RouterAdvertRowStatus
                };
            }
            public static final class Ipv6RouterAdvertIfIndexEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6RouterAdvertIfIndexEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6RouterAdvertIfIndex", "1.3.6.1.2.1.4.39.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6RouterAdvertSendAdvertsEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6RouterAdvertSendAdvertsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6RouterAdvertSendAdverts", "1.3.6.1.2.1.4.39.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6RouterAdvertMaxIntervalEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6RouterAdvertMaxIntervalEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6RouterAdvertMaxInterval", "1.3.6.1.2.1.4.39.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6RouterAdvertMinIntervalEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6RouterAdvertMinIntervalEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6RouterAdvertMinInterval", "1.3.6.1.2.1.4.39.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6RouterAdvertManagedFlagEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6RouterAdvertManagedFlagEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6RouterAdvertManagedFlag", "1.3.6.1.2.1.4.39.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6RouterAdvertOtherConfigFlagEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6RouterAdvertOtherConfigFlagEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6RouterAdvertOtherConfigFlag", "1.3.6.1.2.1.4.39.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6RouterAdvertLinkMTUEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6RouterAdvertLinkMTUEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6RouterAdvertLinkMTU", "1.3.6.1.2.1.4.39.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6RouterAdvertReachableTimeEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6RouterAdvertReachableTimeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6RouterAdvertReachableTime", "1.3.6.1.2.1.4.39.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6RouterAdvertRetransmitTimeEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6RouterAdvertRetransmitTimeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6RouterAdvertRetransmitTime", "1.3.6.1.2.1.4.39.1.9", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6RouterAdvertCurHopLimitEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6RouterAdvertCurHopLimitEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6RouterAdvertCurHopLimit", "1.3.6.1.2.1.4.39.1.10", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6RouterAdvertDefaultLifetimeEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6RouterAdvertDefaultLifetimeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6RouterAdvertDefaultLifetime", "1.3.6.1.2.1.4.39.1.11", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Ipv6RouterAdvertRowStatusEnt extends MIBEntry<IPMIBDef>
            {
                private Ipv6RouterAdvertRowStatusEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "ipv6RouterAdvertRowStatus", "1.3.6.1.2.1.4.39.1.12", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class IcmpEnt extends MIBEntry<IPMIBDef>
    {
        /** the ICMP group
Implementation of the ICMP group is mandatory for allsystems.*/
        public final IcmpInMsgsEnt icmpInMsgs;

        public final IcmpInErrorsEnt icmpInErrors;

        public final IcmpInDestUnreachsEnt icmpInDestUnreachs;

        public final IcmpInTimeExcdsEnt icmpInTimeExcds;

        public final IcmpInParmProbsEnt icmpInParmProbs;

        public final IcmpInSrcQuenchsEnt icmpInSrcQuenchs;

        public final IcmpInRedirectsEnt icmpInRedirects;

        public final IcmpInEchosEnt icmpInEchos;

        public final IcmpInEchoRepsEnt icmpInEchoReps;

        public final IcmpInTimestampsEnt icmpInTimestamps;

        public final IcmpInTimestampRepsEnt icmpInTimestampReps;

        public final IcmpInAddrMasksEnt icmpInAddrMasks;

        public final IcmpInAddrMaskRepsEnt icmpInAddrMaskReps;

        public final IcmpOutMsgsEnt icmpOutMsgs;

        public final IcmpOutErrorsEnt icmpOutErrors;

        public final IcmpOutDestUnreachsEnt icmpOutDestUnreachs;

        public final IcmpOutTimeExcdsEnt icmpOutTimeExcds;

        public final IcmpOutParmProbsEnt icmpOutParmProbs;

        public final IcmpOutSrcQuenchsEnt icmpOutSrcQuenchs;

        public final IcmpOutRedirectsEnt icmpOutRedirects;

        public final IcmpOutEchosEnt icmpOutEchos;

        public final IcmpOutEchoRepsEnt icmpOutEchoReps;

        public final IcmpOutTimestampsEnt icmpOutTimestamps;

        public final IcmpOutTimestampRepsEnt icmpOutTimestampReps;

        public final IcmpOutAddrMasksEnt icmpOutAddrMasks;

        public final IcmpOutAddrMaskRepsEnt icmpOutAddrMaskReps;

        private IcmpEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "icmp", "1.3.6.1.2.1.5", false, false, false, false);
            this.icmpInMsgs = new IcmpInMsgsEnt(mib, this);
            this.icmpInErrors = new IcmpInErrorsEnt(mib, this);
            this.icmpInDestUnreachs = new IcmpInDestUnreachsEnt(mib, this);
            this.icmpInTimeExcds = new IcmpInTimeExcdsEnt(mib, this);
            this.icmpInParmProbs = new IcmpInParmProbsEnt(mib, this);
            this.icmpInSrcQuenchs = new IcmpInSrcQuenchsEnt(mib, this);
            this.icmpInRedirects = new IcmpInRedirectsEnt(mib, this);
            this.icmpInEchos = new IcmpInEchosEnt(mib, this);
            this.icmpInEchoReps = new IcmpInEchoRepsEnt(mib, this);
            this.icmpInTimestamps = new IcmpInTimestampsEnt(mib, this);
            this.icmpInTimestampReps = new IcmpInTimestampRepsEnt(mib, this);
            this.icmpInAddrMasks = new IcmpInAddrMasksEnt(mib, this);
            this.icmpInAddrMaskReps = new IcmpInAddrMaskRepsEnt(mib, this);
            this.icmpOutMsgs = new IcmpOutMsgsEnt(mib, this);
            this.icmpOutErrors = new IcmpOutErrorsEnt(mib, this);
            this.icmpOutDestUnreachs = new IcmpOutDestUnreachsEnt(mib, this);
            this.icmpOutTimeExcds = new IcmpOutTimeExcdsEnt(mib, this);
            this.icmpOutParmProbs = new IcmpOutParmProbsEnt(mib, this);
            this.icmpOutSrcQuenchs = new IcmpOutSrcQuenchsEnt(mib, this);
            this.icmpOutRedirects = new IcmpOutRedirectsEnt(mib, this);
            this.icmpOutEchos = new IcmpOutEchosEnt(mib, this);
            this.icmpOutEchoReps = new IcmpOutEchoRepsEnt(mib, this);
            this.icmpOutTimestamps = new IcmpOutTimestampsEnt(mib, this);
            this.icmpOutTimestampReps = new IcmpOutTimestampRepsEnt(mib, this);
            this.icmpOutAddrMasks = new IcmpOutAddrMasksEnt(mib, this);
            this.icmpOutAddrMaskReps = new IcmpOutAddrMaskRepsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.icmpInMsgs,
                this.icmpInErrors,
                this.icmpInDestUnreachs,
                this.icmpInTimeExcds,
                this.icmpInParmProbs,
                this.icmpInSrcQuenchs,
                this.icmpInRedirects,
                this.icmpInEchos,
                this.icmpInEchoReps,
                this.icmpInTimestamps,
                this.icmpInTimestampReps,
                this.icmpInAddrMasks,
                this.icmpInAddrMaskReps,
                this.icmpOutMsgs,
                this.icmpOutErrors,
                this.icmpOutDestUnreachs,
                this.icmpOutTimeExcds,
                this.icmpOutParmProbs,
                this.icmpOutSrcQuenchs,
                this.icmpOutRedirects,
                this.icmpOutEchos,
                this.icmpOutEchoReps,
                this.icmpOutTimestamps,
                this.icmpOutTimestampReps,
                this.icmpOutAddrMasks,
                this.icmpOutAddrMaskReps
            };
        }
        public static final class IcmpInMsgsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpInMsgsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpInMsgs", "1.3.6.1.2.1.5.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInErrorsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpInErrorsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpInErrors", "1.3.6.1.2.1.5.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInDestUnreachsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpInDestUnreachsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpInDestUnreachs", "1.3.6.1.2.1.5.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInTimeExcdsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpInTimeExcdsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpInTimeExcds", "1.3.6.1.2.1.5.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInParmProbsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpInParmProbsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpInParmProbs", "1.3.6.1.2.1.5.5", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInSrcQuenchsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpInSrcQuenchsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpInSrcQuenchs", "1.3.6.1.2.1.5.6", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInRedirectsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpInRedirectsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpInRedirects", "1.3.6.1.2.1.5.7", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInEchosEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpInEchosEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpInEchos", "1.3.6.1.2.1.5.8", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInEchoRepsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpInEchoRepsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpInEchoReps", "1.3.6.1.2.1.5.9", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInTimestampsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpInTimestampsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpInTimestamps", "1.3.6.1.2.1.5.10", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInTimestampRepsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpInTimestampRepsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpInTimestampReps", "1.3.6.1.2.1.5.11", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInAddrMasksEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpInAddrMasksEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpInAddrMasks", "1.3.6.1.2.1.5.12", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInAddrMaskRepsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpInAddrMaskRepsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpInAddrMaskReps", "1.3.6.1.2.1.5.13", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutMsgsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpOutMsgsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpOutMsgs", "1.3.6.1.2.1.5.14", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutErrorsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpOutErrorsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpOutErrors", "1.3.6.1.2.1.5.15", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutDestUnreachsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpOutDestUnreachsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpOutDestUnreachs", "1.3.6.1.2.1.5.16", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutTimeExcdsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpOutTimeExcdsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpOutTimeExcds", "1.3.6.1.2.1.5.17", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutParmProbsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpOutParmProbsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpOutParmProbs", "1.3.6.1.2.1.5.18", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutSrcQuenchsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpOutSrcQuenchsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpOutSrcQuenchs", "1.3.6.1.2.1.5.19", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutRedirectsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpOutRedirectsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpOutRedirects", "1.3.6.1.2.1.5.20", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutEchosEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpOutEchosEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpOutEchos", "1.3.6.1.2.1.5.21", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutEchoRepsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpOutEchoRepsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpOutEchoReps", "1.3.6.1.2.1.5.22", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutTimestampsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpOutTimestampsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpOutTimestamps", "1.3.6.1.2.1.5.23", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutTimestampRepsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpOutTimestampRepsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpOutTimestampReps", "1.3.6.1.2.1.5.24", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutAddrMasksEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpOutAddrMasksEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpOutAddrMasks", "1.3.6.1.2.1.5.25", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutAddrMaskRepsEnt extends MIBEntry<IPMIBDef>
        {
            private IcmpOutAddrMaskRepsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpOutAddrMaskReps", "1.3.6.1.2.1.5.26", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

    public static final class IcmpStatsTableEnt extends MIBEntry<IPMIBDef>
    {
        public final IcmpStatsEntryEnt icmpStatsEntry;

        private IcmpStatsTableEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "icmpStatsTable", "1.3.6.1.2.1.5.29", false, true, false, false);
            this.icmpStatsEntry = new IcmpStatsEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.icmpStatsEntry
            };
        }
        public static final class IcmpStatsEntryEnt extends MIBEntry<IPMIBDef>
        {
            public final IcmpStatsIPVersionEnt icmpStatsIPVersion;

            public final IcmpStatsInMsgsEnt icmpStatsInMsgs;

            public final IcmpStatsInErrorsEnt icmpStatsInErrors;

            public final IcmpStatsOutMsgsEnt icmpStatsOutMsgs;

            public final IcmpStatsOutErrorsEnt icmpStatsOutErrors;

            private IcmpStatsEntryEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpStatsEntry", "1.3.6.1.2.1.5.29.1", false, false, false, true);
                this.icmpStatsIPVersion = new IcmpStatsIPVersionEnt(mib, this);
                this.icmpStatsInMsgs = new IcmpStatsInMsgsEnt(mib, this);
                this.icmpStatsInErrors = new IcmpStatsInErrorsEnt(mib, this);
                this.icmpStatsOutMsgs = new IcmpStatsOutMsgsEnt(mib, this);
                this.icmpStatsOutErrors = new IcmpStatsOutErrorsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.icmpStatsIPVersion,
                    this.icmpStatsInMsgs,
                    this.icmpStatsInErrors,
                    this.icmpStatsOutMsgs,
                    this.icmpStatsOutErrors
                };
            }
            public static final class IcmpStatsIPVersionEnt extends MIBEntry<IPMIBDef>
            {
                private IcmpStatsIPVersionEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "icmpStatsIPVersion", "1.3.6.1.2.1.5.29.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IcmpStatsInMsgsEnt extends MIBEntry<IPMIBDef>
            {
                private IcmpStatsInMsgsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "icmpStatsInMsgs", "1.3.6.1.2.1.5.29.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IcmpStatsInErrorsEnt extends MIBEntry<IPMIBDef>
            {
                private IcmpStatsInErrorsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "icmpStatsInErrors", "1.3.6.1.2.1.5.29.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IcmpStatsOutMsgsEnt extends MIBEntry<IPMIBDef>
            {
                private IcmpStatsOutMsgsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "icmpStatsOutMsgs", "1.3.6.1.2.1.5.29.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IcmpStatsOutErrorsEnt extends MIBEntry<IPMIBDef>
            {
                private IcmpStatsOutErrorsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "icmpStatsOutErrors", "1.3.6.1.2.1.5.29.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class IcmpMsgStatsTableEnt extends MIBEntry<IPMIBDef>
    {
        public final IcmpMsgStatsEntryEnt icmpMsgStatsEntry;

        private IcmpMsgStatsTableEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
        {
            super(mib, parent, "icmpMsgStatsTable", "1.3.6.1.2.1.5.30", false, true, false, false);
            this.icmpMsgStatsEntry = new IcmpMsgStatsEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.icmpMsgStatsEntry
            };
        }
        public static final class IcmpMsgStatsEntryEnt extends MIBEntry<IPMIBDef>
        {
            public final IcmpMsgStatsIPVersionEnt icmpMsgStatsIPVersion;

            public final IcmpMsgStatsTypeEnt icmpMsgStatsType;

            public final IcmpMsgStatsInPktsEnt icmpMsgStatsInPkts;

            public final IcmpMsgStatsOutPktsEnt icmpMsgStatsOutPkts;

            private IcmpMsgStatsEntryEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
            {
                super(mib, parent, "icmpMsgStatsEntry", "1.3.6.1.2.1.5.30.1", false, false, false, true);
                this.icmpMsgStatsIPVersion = new IcmpMsgStatsIPVersionEnt(mib, this);
                this.icmpMsgStatsType = new IcmpMsgStatsTypeEnt(mib, this);
                this.icmpMsgStatsInPkts = new IcmpMsgStatsInPktsEnt(mib, this);
                this.icmpMsgStatsOutPkts = new IcmpMsgStatsOutPktsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.icmpMsgStatsIPVersion,
                    this.icmpMsgStatsType,
                    this.icmpMsgStatsInPkts,
                    this.icmpMsgStatsOutPkts
                };
            }
            public static final class IcmpMsgStatsIPVersionEnt extends MIBEntry<IPMIBDef>
            {
                private IcmpMsgStatsIPVersionEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "icmpMsgStatsIPVersion", "1.3.6.1.2.1.5.30.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IcmpMsgStatsTypeEnt extends MIBEntry<IPMIBDef>
            {
                private IcmpMsgStatsTypeEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "icmpMsgStatsType", "1.3.6.1.2.1.5.30.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IcmpMsgStatsInPktsEnt extends MIBEntry<IPMIBDef>
            {
                private IcmpMsgStatsInPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "icmpMsgStatsInPkts", "1.3.6.1.2.1.5.30.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IcmpMsgStatsOutPktsEnt extends MIBEntry<IPMIBDef>
            {
                private IcmpMsgStatsOutPktsEnt(IPMIBDef mib, MIBEntry<IPMIBDef> parent)
                {
                    super(mib, parent, "icmpMsgStatsOutPkts", "1.3.6.1.2.1.5.30.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
