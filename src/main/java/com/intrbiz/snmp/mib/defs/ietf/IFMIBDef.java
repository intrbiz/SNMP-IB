package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class IFMIBDef extends MIB
{
    public static final IFMIBDef IFMIB = new IFMIBDef();

    public final IfMIBEnt ifMIB;

    public final InterfacesEnt interfaces;

    /** definition of interface-related traps.*/
    public final LinkDownEnt linkDown;

    public final LinkUpEnt linkUp;

    private IFMIBDef()
    {
        super("IF-MIB");
        this.ifMIB = new IfMIBEnt(this, null);
        this.interfaces = new InterfacesEnt(this, null);
        this.linkDown = new LinkDownEnt(this, null);
        this.linkUp = new LinkUpEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ifMIB,
            this.interfaces,
            this.linkDown,
            this.linkUp
        };
    }

    public static final class IfMIBEnt extends MIBEntry<IFMIBDef>
    {
        public final IfMIBObjectsEnt ifMIBObjects;

        /** conformance information*/
        public final IfConformanceEnt ifConformance;

        private IfMIBEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
        {
            super(mib, parent, "ifMIB", "1.3.6.1.2.1.31", false, false, false, false);
            this.ifMIBObjects = new IfMIBObjectsEnt(mib, this);
            this.ifConformance = new IfConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ifMIBObjects,
                this.ifConformance
            };
        }
        public static final class IfMIBObjectsEnt extends MIBEntry<IFMIBDef>
        {
            public final IfTableLastChangeEnt ifTableLastChange;

            /** Extension to the interface tableThis table replaces the ifExtnsTable table.*/
            public final IfXTableEnt ifXTable;

            /** The Interface Stack GroupImplementation of this group is optional, but strongly recommendedfor all systems*/
            public final IfStackTableEnt ifStackTable;

            public final IfStackLastChangeEnt ifStackLastChange;

            /** Generic Receive Address TableThis group of objects is mandatory for all types ofinterfaces which can receive packets/frames addressed tomore than one address.This table replaces the ifExtnsRcvAddr table.  The maindifference is that this table makes use of the RowStatustextual convention, while ifExtnsRcvAddr did not.*/
            public final IfRcvAddressTableEnt ifRcvAddressTable;

            /** Deprecated Definitions - Objects

The Interface Test TableThis group of objects is optional.  However, a media-specific

MIB may make implementation of this group mandatory.This table replaces the ifExtnsTestTable*/
            public final IfTestTableEnt ifTestTable;

            private IfMIBObjectsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
            {
                super(mib, parent, "ifMIBObjects", "1.3.6.1.2.1.31.1", false, false, false, false);
                this.ifTableLastChange = new IfTableLastChangeEnt(mib, this);
                this.ifXTable = new IfXTableEnt(mib, this);
                this.ifStackTable = new IfStackTableEnt(mib, this);
                this.ifStackLastChange = new IfStackLastChangeEnt(mib, this);
                this.ifRcvAddressTable = new IfRcvAddressTableEnt(mib, this);
                this.ifTestTable = new IfTestTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ifTableLastChange,
                    this.ifXTable,
                    this.ifStackTable,
                    this.ifStackLastChange,
                    this.ifRcvAddressTable,
                    this.ifTestTable
                };
            }
            public static final class IfTableLastChangeEnt extends MIBEntry<IFMIBDef>
            {
                private IfTableLastChangeEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                {
                    super(mib, parent, "ifTableLastChange", "1.3.6.1.2.1.31.1.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IfXTableEnt extends MIBEntry<IFMIBDef>
            {
                public final IfXEntryEnt ifXEntry;

                private IfXTableEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                {
                    super(mib, parent, "ifXTable", "1.3.6.1.2.1.31.1.1", false, true, false, false);
                    this.ifXEntry = new IfXEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifXEntry
                    };
                }
                public static final class IfXEntryEnt extends MIBEntry<IFMIBDef>
                {
                    public final IfNameEnt ifName;

                    public final IfInMulticastPktsEnt ifInMulticastPkts;

                    public final IfInBroadcastPktsEnt ifInBroadcastPkts;

                    public final IfOutMulticastPktsEnt ifOutMulticastPkts;

                    public final IfOutBroadcastPktsEnt ifOutBroadcastPkts;

                    /** High Capacity Counter objects.  These objects are all64 bit versions of the "basic" ifTable counters.  Theseobjects all have the same basic semantics as their 32-bitcounterparts, however, their syntax has been extendedto 64 bits.*/
                    public final IfHCInOctetsEnt ifHCInOctets;

                    public final IfHCInUcastPktsEnt ifHCInUcastPkts;

                    public final IfHCInMulticastPktsEnt ifHCInMulticastPkts;

                    public final IfHCInBroadcastPktsEnt ifHCInBroadcastPkts;

                    public final IfHCOutOctetsEnt ifHCOutOctets;

                    public final IfHCOutUcastPktsEnt ifHCOutUcastPkts;

                    public final IfHCOutMulticastPktsEnt ifHCOutMulticastPkts;

                    public final IfHCOutBroadcastPktsEnt ifHCOutBroadcastPkts;

                    public final IfLinkUpDownTrapEnableEnt ifLinkUpDownTrapEnable;

                    public final IfHighSpeedEnt ifHighSpeed;

                    public final IfPromiscuousModeEnt ifPromiscuousMode;

                    public final IfConnectorPresentEnt ifConnectorPresent;

                    public final IfAliasEnt ifAlias;

                    public final IfCounterDiscontinuityTimeEnt ifCounterDiscontinuityTime;

                    private IfXEntryEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifXEntry", "1.3.6.1.2.1.31.1.1.1", false, false, false, true);
                        this.ifName = new IfNameEnt(mib, this);
                        this.ifInMulticastPkts = new IfInMulticastPktsEnt(mib, this);
                        this.ifInBroadcastPkts = new IfInBroadcastPktsEnt(mib, this);
                        this.ifOutMulticastPkts = new IfOutMulticastPktsEnt(mib, this);
                        this.ifOutBroadcastPkts = new IfOutBroadcastPktsEnt(mib, this);
                        this.ifHCInOctets = new IfHCInOctetsEnt(mib, this);
                        this.ifHCInUcastPkts = new IfHCInUcastPktsEnt(mib, this);
                        this.ifHCInMulticastPkts = new IfHCInMulticastPktsEnt(mib, this);
                        this.ifHCInBroadcastPkts = new IfHCInBroadcastPktsEnt(mib, this);
                        this.ifHCOutOctets = new IfHCOutOctetsEnt(mib, this);
                        this.ifHCOutUcastPkts = new IfHCOutUcastPktsEnt(mib, this);
                        this.ifHCOutMulticastPkts = new IfHCOutMulticastPktsEnt(mib, this);
                        this.ifHCOutBroadcastPkts = new IfHCOutBroadcastPktsEnt(mib, this);
                        this.ifLinkUpDownTrapEnable = new IfLinkUpDownTrapEnableEnt(mib, this);
                        this.ifHighSpeed = new IfHighSpeedEnt(mib, this);
                        this.ifPromiscuousMode = new IfPromiscuousModeEnt(mib, this);
                        this.ifConnectorPresent = new IfConnectorPresentEnt(mib, this);
                        this.ifAlias = new IfAliasEnt(mib, this);
                        this.ifCounterDiscontinuityTime = new IfCounterDiscontinuityTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ifName,
                            this.ifInMulticastPkts,
                            this.ifInBroadcastPkts,
                            this.ifOutMulticastPkts,
                            this.ifOutBroadcastPkts,
                            this.ifHCInOctets,
                            this.ifHCInUcastPkts,
                            this.ifHCInMulticastPkts,
                            this.ifHCInBroadcastPkts,
                            this.ifHCOutOctets,
                            this.ifHCOutUcastPkts,
                            this.ifHCOutMulticastPkts,
                            this.ifHCOutBroadcastPkts,
                            this.ifLinkUpDownTrapEnable,
                            this.ifHighSpeed,
                            this.ifPromiscuousMode,
                            this.ifConnectorPresent,
                            this.ifAlias,
                            this.ifCounterDiscontinuityTime
                        };
                    }
                    public static final class IfNameEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfNameEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifName", "1.3.6.1.2.1.31.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfInMulticastPktsEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfInMulticastPktsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifInMulticastPkts", "1.3.6.1.2.1.31.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfInBroadcastPktsEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfInBroadcastPktsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifInBroadcastPkts", "1.3.6.1.2.1.31.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfOutMulticastPktsEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfOutMulticastPktsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifOutMulticastPkts", "1.3.6.1.2.1.31.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfOutBroadcastPktsEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfOutBroadcastPktsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifOutBroadcastPkts", "1.3.6.1.2.1.31.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfHCInOctetsEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfHCInOctetsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifHCInOctets", "1.3.6.1.2.1.31.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfHCInUcastPktsEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfHCInUcastPktsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifHCInUcastPkts", "1.3.6.1.2.1.31.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfHCInMulticastPktsEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfHCInMulticastPktsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifHCInMulticastPkts", "1.3.6.1.2.1.31.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfHCInBroadcastPktsEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfHCInBroadcastPktsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifHCInBroadcastPkts", "1.3.6.1.2.1.31.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfHCOutOctetsEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfHCOutOctetsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifHCOutOctets", "1.3.6.1.2.1.31.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfHCOutUcastPktsEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfHCOutUcastPktsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifHCOutUcastPkts", "1.3.6.1.2.1.31.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfHCOutMulticastPktsEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfHCOutMulticastPktsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifHCOutMulticastPkts", "1.3.6.1.2.1.31.1.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfHCOutBroadcastPktsEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfHCOutBroadcastPktsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifHCOutBroadcastPkts", "1.3.6.1.2.1.31.1.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfLinkUpDownTrapEnableEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfLinkUpDownTrapEnableEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifLinkUpDownTrapEnable", "1.3.6.1.2.1.31.1.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfHighSpeedEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfHighSpeedEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifHighSpeed", "1.3.6.1.2.1.31.1.1.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfPromiscuousModeEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfPromiscuousModeEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifPromiscuousMode", "1.3.6.1.2.1.31.1.1.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfConnectorPresentEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfConnectorPresentEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifConnectorPresent", "1.3.6.1.2.1.31.1.1.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfAliasEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfAliasEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifAlias", "1.3.6.1.2.1.31.1.1.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfCounterDiscontinuityTimeEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfCounterDiscontinuityTimeEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifCounterDiscontinuityTime", "1.3.6.1.2.1.31.1.1.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IfStackTableEnt extends MIBEntry<IFMIBDef>
            {
                public final IfStackEntryEnt ifStackEntry;

                private IfStackTableEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                {
                    super(mib, parent, "ifStackTable", "1.3.6.1.2.1.31.1.2", false, true, false, false);
                    this.ifStackEntry = new IfStackEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifStackEntry
                    };
                }
                public static final class IfStackEntryEnt extends MIBEntry<IFMIBDef>
                {
                    public final IfStackHigherLayerEnt ifStackHigherLayer;

                    public final IfStackLowerLayerEnt ifStackLowerLayer;

                    public final IfStackStatusEnt ifStackStatus;

                    private IfStackEntryEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifStackEntry", "1.3.6.1.2.1.31.1.2.1", false, false, false, true);
                        this.ifStackHigherLayer = new IfStackHigherLayerEnt(mib, this);
                        this.ifStackLowerLayer = new IfStackLowerLayerEnt(mib, this);
                        this.ifStackStatus = new IfStackStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ifStackHigherLayer,
                            this.ifStackLowerLayer,
                            this.ifStackStatus
                        };
                    }
                    public static final class IfStackHigherLayerEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfStackHigherLayerEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifStackHigherLayer", "1.3.6.1.2.1.31.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfStackLowerLayerEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfStackLowerLayerEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifStackLowerLayer", "1.3.6.1.2.1.31.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfStackStatusEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfStackStatusEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifStackStatus", "1.3.6.1.2.1.31.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IfStackLastChangeEnt extends MIBEntry<IFMIBDef>
            {
                private IfStackLastChangeEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                {
                    super(mib, parent, "ifStackLastChange", "1.3.6.1.2.1.31.1.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IfRcvAddressTableEnt extends MIBEntry<IFMIBDef>
            {
                public final IfRcvAddressEntryEnt ifRcvAddressEntry;

                private IfRcvAddressTableEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                {
                    super(mib, parent, "ifRcvAddressTable", "1.3.6.1.2.1.31.1.4", false, true, false, false);
                    this.ifRcvAddressEntry = new IfRcvAddressEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifRcvAddressEntry
                    };
                }
                public static final class IfRcvAddressEntryEnt extends MIBEntry<IFMIBDef>
                {
                    public final IfRcvAddressAddressEnt ifRcvAddressAddress;

                    public final IfRcvAddressStatusEnt ifRcvAddressStatus;

                    public final IfRcvAddressTypeEnt ifRcvAddressType;

                    private IfRcvAddressEntryEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifRcvAddressEntry", "1.3.6.1.2.1.31.1.4.1", false, false, false, true);
                        this.ifRcvAddressAddress = new IfRcvAddressAddressEnt(mib, this);
                        this.ifRcvAddressStatus = new IfRcvAddressStatusEnt(mib, this);
                        this.ifRcvAddressType = new IfRcvAddressTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ifRcvAddressAddress,
                            this.ifRcvAddressStatus,
                            this.ifRcvAddressType
                        };
                    }
                    public static final class IfRcvAddressAddressEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfRcvAddressAddressEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifRcvAddressAddress", "1.3.6.1.2.1.31.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfRcvAddressStatusEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfRcvAddressStatusEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifRcvAddressStatus", "1.3.6.1.2.1.31.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfRcvAddressTypeEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfRcvAddressTypeEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifRcvAddressType", "1.3.6.1.2.1.31.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IfTestTableEnt extends MIBEntry<IFMIBDef>
            {
                public final IfTestEntryEnt ifTestEntry;

                private IfTestTableEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                {
                    super(mib, parent, "ifTestTable", "1.3.6.1.2.1.31.1.3", false, true, false, false);
                    this.ifTestEntry = new IfTestEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifTestEntry
                    };
                }
                public static final class IfTestEntryEnt extends MIBEntry<IFMIBDef>
                {
                    public final IfTestIdEnt ifTestId;

                    public final IfTestStatusEnt ifTestStatus;

                    public final IfTestTypeEnt ifTestType;

                    public final IfTestResultEnt ifTestResult;

                    public final IfTestCodeEnt ifTestCode;

                    public final IfTestOwnerEnt ifTestOwner;

                    private IfTestEntryEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifTestEntry", "1.3.6.1.2.1.31.1.3.1", false, false, false, true);
                        this.ifTestId = new IfTestIdEnt(mib, this);
                        this.ifTestStatus = new IfTestStatusEnt(mib, this);
                        this.ifTestType = new IfTestTypeEnt(mib, this);
                        this.ifTestResult = new IfTestResultEnt(mib, this);
                        this.ifTestCode = new IfTestCodeEnt(mib, this);
                        this.ifTestOwner = new IfTestOwnerEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ifTestId,
                            this.ifTestStatus,
                            this.ifTestType,
                            this.ifTestResult,
                            this.ifTestCode,
                            this.ifTestOwner
                        };
                    }
                    public static final class IfTestIdEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfTestIdEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifTestId", "1.3.6.1.2.1.31.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfTestStatusEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfTestStatusEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifTestStatus", "1.3.6.1.2.1.31.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfTestTypeEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfTestTypeEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifTestType", "1.3.6.1.2.1.31.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfTestResultEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfTestResultEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifTestResult", "1.3.6.1.2.1.31.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfTestCodeEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfTestCodeEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifTestCode", "1.3.6.1.2.1.31.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfTestOwnerEnt extends MIBEntry<IFMIBDef>
                    {
                        private IfTestOwnerEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                        {
                            super(mib, parent, "ifTestOwner", "1.3.6.1.2.1.31.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class IfConformanceEnt extends MIBEntry<IFMIBDef>
        {
            public final IfGroupsEnt ifGroups;

            public final IfCompliancesEnt ifCompliances;

            private IfConformanceEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
            {
                super(mib, parent, "ifConformance", "1.3.6.1.2.1.31.2", false, false, false, false);
                this.ifGroups = new IfGroupsEnt(mib, this);
                this.ifCompliances = new IfCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ifGroups,
                    this.ifCompliances
                };
            }
            public static final class IfGroupsEnt extends MIBEntry<IFMIBDef>
            {
                /** units of conformance*/
                public final IfGeneralInformationGroupEnt ifGeneralInformationGroup;

                /** the following five groups are mutually exclusive; at mostone of these groups is implemented for any interface*/
                public final IfFixedLengthGroupEnt ifFixedLengthGroup;

                public final IfHCFixedLengthGroupEnt ifHCFixedLengthGroup;

                public final IfPacketGroupEnt ifPacketGroup;

                public final IfHCPacketGroupEnt ifHCPacketGroup;

                public final IfVHCPacketGroupEnt ifVHCPacketGroup;

                public final IfRcvAddressGroupEnt ifRcvAddressGroup;

                public final IfStackGroup2Ent ifStackGroup2;

                public final IfCounterDiscontinuityGroupEnt ifCounterDiscontinuityGroup;

                public final LinkUpDownNotificationsGroupEnt linkUpDownNotificationsGroup;

                /** Deprecated Definitions - Groups*/
                public final IfGeneralGroupEnt ifGeneralGroup;

                public final IfTestGroupEnt ifTestGroup;

                public final IfStackGroupEnt ifStackGroup;

                public final IfOldObjectsGroupEnt ifOldObjectsGroup;

                private IfGroupsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                {
                    super(mib, parent, "ifGroups", "1.3.6.1.2.1.31.2.1", false, false, false, false);
                    this.ifGeneralInformationGroup = new IfGeneralInformationGroupEnt(mib, this);
                    this.ifFixedLengthGroup = new IfFixedLengthGroupEnt(mib, this);
                    this.ifHCFixedLengthGroup = new IfHCFixedLengthGroupEnt(mib, this);
                    this.ifPacketGroup = new IfPacketGroupEnt(mib, this);
                    this.ifHCPacketGroup = new IfHCPacketGroupEnt(mib, this);
                    this.ifVHCPacketGroup = new IfVHCPacketGroupEnt(mib, this);
                    this.ifRcvAddressGroup = new IfRcvAddressGroupEnt(mib, this);
                    this.ifStackGroup2 = new IfStackGroup2Ent(mib, this);
                    this.ifCounterDiscontinuityGroup = new IfCounterDiscontinuityGroupEnt(mib, this);
                    this.linkUpDownNotificationsGroup = new LinkUpDownNotificationsGroupEnt(mib, this);
                    this.ifGeneralGroup = new IfGeneralGroupEnt(mib, this);
                    this.ifTestGroup = new IfTestGroupEnt(mib, this);
                    this.ifStackGroup = new IfStackGroupEnt(mib, this);
                    this.ifOldObjectsGroup = new IfOldObjectsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifGeneralInformationGroup,
                        this.ifFixedLengthGroup,
                        this.ifHCFixedLengthGroup,
                        this.ifPacketGroup,
                        this.ifHCPacketGroup,
                        this.ifVHCPacketGroup,
                        this.ifRcvAddressGroup,
                        this.ifStackGroup2,
                        this.ifCounterDiscontinuityGroup,
                        this.linkUpDownNotificationsGroup,
                        this.ifGeneralGroup,
                        this.ifTestGroup,
                        this.ifStackGroup,
                        this.ifOldObjectsGroup
                    };
                }
                public static final class IfGeneralInformationGroupEnt extends MIBEntry<IFMIBDef>
                {
                    private IfGeneralInformationGroupEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifGeneralInformationGroup", "1.3.6.1.2.1.31.2.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfFixedLengthGroupEnt extends MIBEntry<IFMIBDef>
                {
                    private IfFixedLengthGroupEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifFixedLengthGroup", "1.3.6.1.2.1.31.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfHCFixedLengthGroupEnt extends MIBEntry<IFMIBDef>
                {
                    private IfHCFixedLengthGroupEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifHCFixedLengthGroup", "1.3.6.1.2.1.31.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfPacketGroupEnt extends MIBEntry<IFMIBDef>
                {
                    private IfPacketGroupEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifPacketGroup", "1.3.6.1.2.1.31.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfHCPacketGroupEnt extends MIBEntry<IFMIBDef>
                {
                    private IfHCPacketGroupEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifHCPacketGroup", "1.3.6.1.2.1.31.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfVHCPacketGroupEnt extends MIBEntry<IFMIBDef>
                {
                    private IfVHCPacketGroupEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifVHCPacketGroup", "1.3.6.1.2.1.31.2.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfRcvAddressGroupEnt extends MIBEntry<IFMIBDef>
                {
                    private IfRcvAddressGroupEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifRcvAddressGroup", "1.3.6.1.2.1.31.2.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfStackGroup2Ent extends MIBEntry<IFMIBDef>
                {
                    private IfStackGroup2Ent(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifStackGroup2", "1.3.6.1.2.1.31.2.1.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfCounterDiscontinuityGroupEnt extends MIBEntry<IFMIBDef>
                {
                    private IfCounterDiscontinuityGroupEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifCounterDiscontinuityGroup", "1.3.6.1.2.1.31.2.1.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LinkUpDownNotificationsGroupEnt extends MIBEntry<IFMIBDef>
                {
                    private LinkUpDownNotificationsGroupEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "linkUpDownNotificationsGroup", "1.3.6.1.2.1.31.2.1.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfGeneralGroupEnt extends MIBEntry<IFMIBDef>
                {
                    private IfGeneralGroupEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifGeneralGroup", "1.3.6.1.2.1.31.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfTestGroupEnt extends MIBEntry<IFMIBDef>
                {
                    private IfTestGroupEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifTestGroup", "1.3.6.1.2.1.31.2.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfStackGroupEnt extends MIBEntry<IFMIBDef>
                {
                    private IfStackGroupEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifStackGroup", "1.3.6.1.2.1.31.2.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfOldObjectsGroupEnt extends MIBEntry<IFMIBDef>
                {
                    private IfOldObjectsGroupEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifOldObjectsGroup", "1.3.6.1.2.1.31.2.1.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class IfCompliancesEnt extends MIBEntry<IFMIBDef>
            {
                /** compliance statements*/
                public final IfCompliance3Ent ifCompliance3;

                /** Deprecated Definitions - Compliance*/
                public final IfComplianceEnt ifCompliance;

                public final IfCompliance2Ent ifCompliance2;

                private IfCompliancesEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                {
                    super(mib, parent, "ifCompliances", "1.3.6.1.2.1.31.2.2", false, false, false, false);
                    this.ifCompliance3 = new IfCompliance3Ent(mib, this);
                    this.ifCompliance = new IfComplianceEnt(mib, this);
                    this.ifCompliance2 = new IfCompliance2Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifCompliance3,
                        this.ifCompliance,
                        this.ifCompliance2
                    };
                }
                public static final class IfCompliance3Ent extends MIBEntry<IFMIBDef>
                {
                    private IfCompliance3Ent(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifCompliance3", "1.3.6.1.2.1.31.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfComplianceEnt extends MIBEntry<IFMIBDef>
                {
                    private IfComplianceEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifCompliance", "1.3.6.1.2.1.31.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfCompliance2Ent extends MIBEntry<IFMIBDef>
                {
                    private IfCompliance2Ent(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifCompliance2", "1.3.6.1.2.1.31.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class InterfacesEnt extends MIBEntry<IFMIBDef>
    {
        public final IfNumberEnt ifNumber;

        /** the Interfaces table
The Interfaces table contains information on the entity's

interfaces.  Each sub-layer below the internetwork-layerof a network interface is considered to be an interface.*/
        public final IfTableEnt ifTable;

        private InterfacesEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
        {
            super(mib, parent, "interfaces", "1.3.6.1.2.1.2", false, false, false, false);
            this.ifNumber = new IfNumberEnt(mib, this);
            this.ifTable = new IfTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ifNumber,
                this.ifTable
            };
        }
        public static final class IfNumberEnt extends MIBEntry<IFMIBDef>
        {
            private IfNumberEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
            {
                super(mib, parent, "ifNumber", "1.3.6.1.2.1.2.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IfTableEnt extends MIBEntry<IFMIBDef>
        {
            public final IfEntryEnt ifEntry;

            private IfTableEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
            {
                super(mib, parent, "ifTable", "1.3.6.1.2.1.2.2", false, true, false, false);
                this.ifEntry = new IfEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ifEntry
                };
            }
            public static final class IfEntryEnt extends MIBEntry<IFMIBDef>
            {
                public final IfIndexEnt ifIndex;

                public final IfDescrEnt ifDescr;

                public final IfTypeEnt ifType;

                public final IfMtuEnt ifMtu;

                public final IfSpeedEnt ifSpeed;

                public final IfPhysAddressEnt ifPhysAddress;

                public final IfAdminStatusEnt ifAdminStatus;

                public final IfOperStatusEnt ifOperStatus;

                public final IfLastChangeEnt ifLastChange;

                public final IfInOctetsEnt ifInOctets;

                public final IfInUcastPktsEnt ifInUcastPkts;

                public final IfInNUcastPktsEnt ifInNUcastPkts;

                public final IfInDiscardsEnt ifInDiscards;

                public final IfInErrorsEnt ifInErrors;

                public final IfInUnknownProtosEnt ifInUnknownProtos;

                public final IfOutOctetsEnt ifOutOctets;

                public final IfOutUcastPktsEnt ifOutUcastPkts;

                public final IfOutNUcastPktsEnt ifOutNUcastPkts;

                public final IfOutDiscardsEnt ifOutDiscards;

                public final IfOutErrorsEnt ifOutErrors;

                public final IfOutQLenEnt ifOutQLen;

                public final IfSpecificEnt ifSpecific;

                private IfEntryEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                {
                    super(mib, parent, "ifEntry", "1.3.6.1.2.1.2.2.1", false, false, false, true);
                    this.ifIndex = new IfIndexEnt(mib, this);
                    this.ifDescr = new IfDescrEnt(mib, this);
                    this.ifType = new IfTypeEnt(mib, this);
                    this.ifMtu = new IfMtuEnt(mib, this);
                    this.ifSpeed = new IfSpeedEnt(mib, this);
                    this.ifPhysAddress = new IfPhysAddressEnt(mib, this);
                    this.ifAdminStatus = new IfAdminStatusEnt(mib, this);
                    this.ifOperStatus = new IfOperStatusEnt(mib, this);
                    this.ifLastChange = new IfLastChangeEnt(mib, this);
                    this.ifInOctets = new IfInOctetsEnt(mib, this);
                    this.ifInUcastPkts = new IfInUcastPktsEnt(mib, this);
                    this.ifInNUcastPkts = new IfInNUcastPktsEnt(mib, this);
                    this.ifInDiscards = new IfInDiscardsEnt(mib, this);
                    this.ifInErrors = new IfInErrorsEnt(mib, this);
                    this.ifInUnknownProtos = new IfInUnknownProtosEnt(mib, this);
                    this.ifOutOctets = new IfOutOctetsEnt(mib, this);
                    this.ifOutUcastPkts = new IfOutUcastPktsEnt(mib, this);
                    this.ifOutNUcastPkts = new IfOutNUcastPktsEnt(mib, this);
                    this.ifOutDiscards = new IfOutDiscardsEnt(mib, this);
                    this.ifOutErrors = new IfOutErrorsEnt(mib, this);
                    this.ifOutQLen = new IfOutQLenEnt(mib, this);
                    this.ifSpecific = new IfSpecificEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifIndex,
                        this.ifDescr,
                        this.ifType,
                        this.ifMtu,
                        this.ifSpeed,
                        this.ifPhysAddress,
                        this.ifAdminStatus,
                        this.ifOperStatus,
                        this.ifLastChange,
                        this.ifInOctets,
                        this.ifInUcastPkts,
                        this.ifInNUcastPkts,
                        this.ifInDiscards,
                        this.ifInErrors,
                        this.ifInUnknownProtos,
                        this.ifOutOctets,
                        this.ifOutUcastPkts,
                        this.ifOutNUcastPkts,
                        this.ifOutDiscards,
                        this.ifOutErrors,
                        this.ifOutQLen,
                        this.ifSpecific
                    };
                }
                public static final class IfIndexEnt extends MIBEntry<IFMIBDef>
                {
                    private IfIndexEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifIndex", "1.3.6.1.2.1.2.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfDescrEnt extends MIBEntry<IFMIBDef>
                {
                    private IfDescrEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifDescr", "1.3.6.1.2.1.2.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfTypeEnt extends MIBEntry<IFMIBDef>
                {
                    private IfTypeEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifType", "1.3.6.1.2.1.2.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfMtuEnt extends MIBEntry<IFMIBDef>
                {
                    private IfMtuEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifMtu", "1.3.6.1.2.1.2.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfSpeedEnt extends MIBEntry<IFMIBDef>
                {
                    private IfSpeedEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifSpeed", "1.3.6.1.2.1.2.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfPhysAddressEnt extends MIBEntry<IFMIBDef>
                {
                    private IfPhysAddressEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifPhysAddress", "1.3.6.1.2.1.2.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfAdminStatusEnt extends MIBEntry<IFMIBDef>
                {
                    private IfAdminStatusEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifAdminStatus", "1.3.6.1.2.1.2.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfOperStatusEnt extends MIBEntry<IFMIBDef>
                {
                    private IfOperStatusEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifOperStatus", "1.3.6.1.2.1.2.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfLastChangeEnt extends MIBEntry<IFMIBDef>
                {
                    private IfLastChangeEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifLastChange", "1.3.6.1.2.1.2.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfInOctetsEnt extends MIBEntry<IFMIBDef>
                {
                    private IfInOctetsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifInOctets", "1.3.6.1.2.1.2.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfInUcastPktsEnt extends MIBEntry<IFMIBDef>
                {
                    private IfInUcastPktsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifInUcastPkts", "1.3.6.1.2.1.2.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfInNUcastPktsEnt extends MIBEntry<IFMIBDef>
                {
                    private IfInNUcastPktsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifInNUcastPkts", "1.3.6.1.2.1.2.2.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfInDiscardsEnt extends MIBEntry<IFMIBDef>
                {
                    private IfInDiscardsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifInDiscards", "1.3.6.1.2.1.2.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfInErrorsEnt extends MIBEntry<IFMIBDef>
                {
                    private IfInErrorsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifInErrors", "1.3.6.1.2.1.2.2.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfInUnknownProtosEnt extends MIBEntry<IFMIBDef>
                {
                    private IfInUnknownProtosEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifInUnknownProtos", "1.3.6.1.2.1.2.2.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfOutOctetsEnt extends MIBEntry<IFMIBDef>
                {
                    private IfOutOctetsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifOutOctets", "1.3.6.1.2.1.2.2.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfOutUcastPktsEnt extends MIBEntry<IFMIBDef>
                {
                    private IfOutUcastPktsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifOutUcastPkts", "1.3.6.1.2.1.2.2.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfOutNUcastPktsEnt extends MIBEntry<IFMIBDef>
                {
                    private IfOutNUcastPktsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifOutNUcastPkts", "1.3.6.1.2.1.2.2.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfOutDiscardsEnt extends MIBEntry<IFMIBDef>
                {
                    private IfOutDiscardsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifOutDiscards", "1.3.6.1.2.1.2.2.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfOutErrorsEnt extends MIBEntry<IFMIBDef>
                {
                    private IfOutErrorsEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifOutErrors", "1.3.6.1.2.1.2.2.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfOutQLenEnt extends MIBEntry<IFMIBDef>
                {
                    private IfOutQLenEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifOutQLen", "1.3.6.1.2.1.2.2.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfSpecificEnt extends MIBEntry<IFMIBDef>
                {
                    private IfSpecificEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
                    {
                        super(mib, parent, "ifSpecific", "1.3.6.1.2.1.2.2.1.22", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class LinkDownEnt extends MIBEntry<IFMIBDef>
    {
        private LinkDownEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
        {
            super(mib, parent, "linkDown", "1.3.6.1.6.3.1.1.5.3", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class LinkUpEnt extends MIBEntry<IFMIBDef>
    {
        private LinkUpEnt(IFMIBDef mib, MIBEntry<IFMIBDef> parent)
        {
            super(mib, parent, "linkUp", "1.3.6.1.6.3.1.1.5.4", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
