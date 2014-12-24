package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class ISDNMIBDef extends MIB
{
    public static final ISDNMIBDef ISDNMIB = new ISDNMIBDef();

    /** Sep 23, 1996*/
    public final IsdnMibEnt isdnMib;

    private ISDNMIBDef()
    {
        super("ISDN-MIB");
        this.isdnMib = new IsdnMibEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.isdnMib
        };
    }

    public static final class IsdnMibEnt extends MIBEntry<ISDNMIBDef>
    {
        /** Isdn Mib objects definitions*/
        public final IsdnMibObjectsEnt isdnMibObjects;

        /** Traps*/
        public final IsdnMibTrapPrefixEnt isdnMibTrapPrefix;

        private IsdnMibEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
        {
            super(mib, parent, "isdnMib", "1.3.6.1.2.1.10.20", false, false, false, false);
            this.isdnMibObjects = new IsdnMibObjectsEnt(mib, this);
            this.isdnMibTrapPrefix = new IsdnMibTrapPrefixEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.isdnMibObjects,
                this.isdnMibTrapPrefix
            };
        }
        public static final class IsdnMibObjectsEnt extends MIBEntry<ISDNMIBDef>
        {
            /** ISDN physical interface group
This group describes physical basic rate interfaces.*/
            public final IsdnBasicRateGroupEnt isdnBasicRateGroup;

            /** The B channel (bearer channel) group
Note that disconnects can explicitely be handled using theifStack table. If a connection is to be disconnected,the according ifStack entry has to be removed.More specifically, the ifStackTable entry which binds the high-layerifTable entry (and related dialCtlNbrCfgTable entry) to theB channel ifTable entry (and related isdnBearerTable entry)during an active call has to be removed.*/
            public final IsdnBearerGroupEnt isdnBearerGroup;

            /** ISDN signaling group*/
            public final IsdnSignalingGroupEnt isdnSignalingGroup;

            /** Optional groups follow here.
The Terminal Endpoint group and table
This table is required only if TEI values or SPID numbershave to be entered.The ifIndex values for this table are identical to those ofthe isdnSignalingChannel table.*/
            public final IsdnEndpointGroupEnt isdnEndpointGroup;

            /** The Directory Number group*/
            public final IsdnDirectoryGroupEnt isdnDirectoryGroup;

            private IsdnMibObjectsEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
            {
                super(mib, parent, "isdnMibObjects", "1.3.6.1.2.1.10.20.1", false, false, false, false);
                this.isdnBasicRateGroup = new IsdnBasicRateGroupEnt(mib, this);
                this.isdnBearerGroup = new IsdnBearerGroupEnt(mib, this);
                this.isdnSignalingGroup = new IsdnSignalingGroupEnt(mib, this);
                this.isdnEndpointGroup = new IsdnEndpointGroupEnt(mib, this);
                this.isdnDirectoryGroup = new IsdnDirectoryGroupEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.isdnBasicRateGroup,
                    this.isdnBearerGroup,
                    this.isdnSignalingGroup,
                    this.isdnEndpointGroup,
                    this.isdnDirectoryGroup
                };
            }
            public static final class IsdnBasicRateGroupEnt extends MIBEntry<ISDNMIBDef>
            {
                public final IsdnBasicRateTableEnt isdnBasicRateTable;

                private IsdnBasicRateGroupEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                {
                    super(mib, parent, "isdnBasicRateGroup", "1.3.6.1.2.1.10.20.1.1", false, false, false, false);
                    this.isdnBasicRateTable = new IsdnBasicRateTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isdnBasicRateTable
                    };
                }
                public static final class IsdnBasicRateTableEnt extends MIBEntry<ISDNMIBDef>
                {
                    public final IsdnBasicRateEntryEnt isdnBasicRateEntry;

                    private IsdnBasicRateTableEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                    {
                        super(mib, parent, "isdnBasicRateTable", "1.3.6.1.2.1.10.20.1.1.1", false, true, false, false);
                        this.isdnBasicRateEntry = new IsdnBasicRateEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isdnBasicRateEntry
                        };
                    }
                    public static final class IsdnBasicRateEntryEnt extends MIBEntry<ISDNMIBDef>
                    {
                        public final IsdnBasicRateIfTypeEnt isdnBasicRateIfType;

                        public final IsdnBasicRateLineTopologyEnt isdnBasicRateLineTopology;

                        public final IsdnBasicRateIfModeEnt isdnBasicRateIfMode;

                        public final IsdnBasicRateSignalModeEnt isdnBasicRateSignalMode;

                        private IsdnBasicRateEntryEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                        {
                            super(mib, parent, "isdnBasicRateEntry", "1.3.6.1.2.1.10.20.1.1.1.1", false, false, false, true);
                            this.isdnBasicRateIfType = new IsdnBasicRateIfTypeEnt(mib, this);
                            this.isdnBasicRateLineTopology = new IsdnBasicRateLineTopologyEnt(mib, this);
                            this.isdnBasicRateIfMode = new IsdnBasicRateIfModeEnt(mib, this);
                            this.isdnBasicRateSignalMode = new IsdnBasicRateSignalModeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isdnBasicRateIfType,
                                this.isdnBasicRateLineTopology,
                                this.isdnBasicRateIfMode,
                                this.isdnBasicRateSignalMode
                            };
                        }
                        public static final class IsdnBasicRateIfTypeEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnBasicRateIfTypeEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnBasicRateIfType", "1.3.6.1.2.1.10.20.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnBasicRateLineTopologyEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnBasicRateLineTopologyEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnBasicRateLineTopology", "1.3.6.1.2.1.10.20.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnBasicRateIfModeEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnBasicRateIfModeEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnBasicRateIfMode", "1.3.6.1.2.1.10.20.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnBasicRateSignalModeEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnBasicRateSignalModeEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnBasicRateSignalMode", "1.3.6.1.2.1.10.20.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IsdnBearerGroupEnt extends MIBEntry<ISDNMIBDef>
            {
                public final IsdnBearerTableEnt isdnBearerTable;

                private IsdnBearerGroupEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                {
                    super(mib, parent, "isdnBearerGroup", "1.3.6.1.2.1.10.20.1.2", false, false, false, false);
                    this.isdnBearerTable = new IsdnBearerTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isdnBearerTable
                    };
                }
                public static final class IsdnBearerTableEnt extends MIBEntry<ISDNMIBDef>
                {
                    public final IsdnBearerEntryEnt isdnBearerEntry;

                    private IsdnBearerTableEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                    {
                        super(mib, parent, "isdnBearerTable", "1.3.6.1.2.1.10.20.1.2.1", false, true, false, false);
                        this.isdnBearerEntry = new IsdnBearerEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isdnBearerEntry
                        };
                    }
                    public static final class IsdnBearerEntryEnt extends MIBEntry<ISDNMIBDef>
                    {
                        public final IsdnBearerChannelTypeEnt isdnBearerChannelType;

                        public final IsdnBearerOperStatusEnt isdnBearerOperStatus;

                        public final IsdnBearerChannelNumberEnt isdnBearerChannelNumber;

                        public final IsdnBearerPeerAddressEnt isdnBearerPeerAddress;

                        public final IsdnBearerPeerSubAddressEnt isdnBearerPeerSubAddress;

                        public final IsdnBearerCallOriginEnt isdnBearerCallOrigin;

                        public final IsdnBearerInfoTypeEnt isdnBearerInfoType;

                        public final IsdnBearerMultirateEnt isdnBearerMultirate;

                        public final IsdnBearerCallSetupTimeEnt isdnBearerCallSetupTime;

                        public final IsdnBearerCallConnectTimeEnt isdnBearerCallConnectTime;

                        public final IsdnBearerChargedUnitsEnt isdnBearerChargedUnits;

                        private IsdnBearerEntryEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                        {
                            super(mib, parent, "isdnBearerEntry", "1.3.6.1.2.1.10.20.1.2.1.1", false, false, false, true);
                            this.isdnBearerChannelType = new IsdnBearerChannelTypeEnt(mib, this);
                            this.isdnBearerOperStatus = new IsdnBearerOperStatusEnt(mib, this);
                            this.isdnBearerChannelNumber = new IsdnBearerChannelNumberEnt(mib, this);
                            this.isdnBearerPeerAddress = new IsdnBearerPeerAddressEnt(mib, this);
                            this.isdnBearerPeerSubAddress = new IsdnBearerPeerSubAddressEnt(mib, this);
                            this.isdnBearerCallOrigin = new IsdnBearerCallOriginEnt(mib, this);
                            this.isdnBearerInfoType = new IsdnBearerInfoTypeEnt(mib, this);
                            this.isdnBearerMultirate = new IsdnBearerMultirateEnt(mib, this);
                            this.isdnBearerCallSetupTime = new IsdnBearerCallSetupTimeEnt(mib, this);
                            this.isdnBearerCallConnectTime = new IsdnBearerCallConnectTimeEnt(mib, this);
                            this.isdnBearerChargedUnits = new IsdnBearerChargedUnitsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isdnBearerChannelType,
                                this.isdnBearerOperStatus,
                                this.isdnBearerChannelNumber,
                                this.isdnBearerPeerAddress,
                                this.isdnBearerPeerSubAddress,
                                this.isdnBearerCallOrigin,
                                this.isdnBearerInfoType,
                                this.isdnBearerMultirate,
                                this.isdnBearerCallSetupTime,
                                this.isdnBearerCallConnectTime,
                                this.isdnBearerChargedUnits
                            };
                        }
                        public static final class IsdnBearerChannelTypeEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnBearerChannelTypeEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnBearerChannelType", "1.3.6.1.2.1.10.20.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnBearerOperStatusEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnBearerOperStatusEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnBearerOperStatus", "1.3.6.1.2.1.10.20.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnBearerChannelNumberEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnBearerChannelNumberEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnBearerChannelNumber", "1.3.6.1.2.1.10.20.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnBearerPeerAddressEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnBearerPeerAddressEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnBearerPeerAddress", "1.3.6.1.2.1.10.20.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnBearerPeerSubAddressEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnBearerPeerSubAddressEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnBearerPeerSubAddress", "1.3.6.1.2.1.10.20.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnBearerCallOriginEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnBearerCallOriginEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnBearerCallOrigin", "1.3.6.1.2.1.10.20.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnBearerInfoTypeEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnBearerInfoTypeEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnBearerInfoType", "1.3.6.1.2.1.10.20.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnBearerMultirateEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnBearerMultirateEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnBearerMultirate", "1.3.6.1.2.1.10.20.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnBearerCallSetupTimeEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnBearerCallSetupTimeEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnBearerCallSetupTime", "1.3.6.1.2.1.10.20.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnBearerCallConnectTimeEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnBearerCallConnectTimeEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnBearerCallConnectTime", "1.3.6.1.2.1.10.20.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnBearerChargedUnitsEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnBearerChargedUnitsEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnBearerChargedUnits", "1.3.6.1.2.1.10.20.1.2.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IsdnSignalingGroupEnt extends MIBEntry<ISDNMIBDef>
            {
                /** signaling channel configuration tableThere is one entry in this table for each Terminal Endpoint(link layer connection to the switch).Usually, there is one endpoint per D channel. In somecases, however, there can be multiple endpoints.Thus, entries in this table can be created and deleted.This also means the creation of an associated ifEntry.D channel backup and NFAS trunks are handled using theifStack table.In case of D channel backup, there are multipleData Link Layer (LAPD) interfaces. Only one interface isactive; all others are dormant(5).In case of NFAS trunks, one lower interface is theLAPD interface, while the other lower interfaces are physicalinterfaces.
If directory number and calling address differ from each otheror multiple directory numbers are being used,the isdnDirectoryTable has to be used to enter suchdirectory numbers.*/
                public final IsdnSignalingGetIndexEnt isdnSignalingGetIndex;

                public final IsdnSignalingTableEnt isdnSignalingTable;

                /** Signaling channel statistics tableThere is one entry for each signaling connectionin this table.Note that the ifEntry also has some statistics information.*/
                public final IsdnSignalingStatsTableEnt isdnSignalingStatsTable;

                /** The LAPD table*/
                public final IsdnLapdTableEnt isdnLapdTable;

                private IsdnSignalingGroupEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                {
                    super(mib, parent, "isdnSignalingGroup", "1.3.6.1.2.1.10.20.1.3", false, false, false, false);
                    this.isdnSignalingGetIndex = new IsdnSignalingGetIndexEnt(mib, this);
                    this.isdnSignalingTable = new IsdnSignalingTableEnt(mib, this);
                    this.isdnSignalingStatsTable = new IsdnSignalingStatsTableEnt(mib, this);
                    this.isdnLapdTable = new IsdnLapdTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isdnSignalingGetIndex,
                        this.isdnSignalingTable,
                        this.isdnSignalingStatsTable,
                        this.isdnLapdTable
                    };
                }
                public static final class IsdnSignalingGetIndexEnt extends MIBEntry<ISDNMIBDef>
                {
                    private IsdnSignalingGetIndexEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                    {
                        super(mib, parent, "isdnSignalingGetIndex", "1.3.6.1.2.1.10.20.1.3.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsdnSignalingTableEnt extends MIBEntry<ISDNMIBDef>
                {
                    public final IsdnSignalingEntryEnt isdnSignalingEntry;

                    private IsdnSignalingTableEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                    {
                        super(mib, parent, "isdnSignalingTable", "1.3.6.1.2.1.10.20.1.3.2", false, true, false, false);
                        this.isdnSignalingEntry = new IsdnSignalingEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isdnSignalingEntry
                        };
                    }
                    public static final class IsdnSignalingEntryEnt extends MIBEntry<ISDNMIBDef>
                    {
                        public final IsdnSignalingIndexEnt isdnSignalingIndex;

                        public final IsdnSignalingIfIndexEnt isdnSignalingIfIndex;

                        public final IsdnSignalingProtocolEnt isdnSignalingProtocol;

                        public final IsdnSignalingCallingAddressEnt isdnSignalingCallingAddress;

                        public final IsdnSignalingSubAddressEnt isdnSignalingSubAddress;

                        public final IsdnSignalingBchannelCountEnt isdnSignalingBchannelCount;

                        public final IsdnSignalingInfoTrapEnableEnt isdnSignalingInfoTrapEnable;

                        public final IsdnSignalingStatusEnt isdnSignalingStatus;

                        private IsdnSignalingEntryEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                        {
                            super(mib, parent, "isdnSignalingEntry", "1.3.6.1.2.1.10.20.1.3.2.1", false, false, false, true);
                            this.isdnSignalingIndex = new IsdnSignalingIndexEnt(mib, this);
                            this.isdnSignalingIfIndex = new IsdnSignalingIfIndexEnt(mib, this);
                            this.isdnSignalingProtocol = new IsdnSignalingProtocolEnt(mib, this);
                            this.isdnSignalingCallingAddress = new IsdnSignalingCallingAddressEnt(mib, this);
                            this.isdnSignalingSubAddress = new IsdnSignalingSubAddressEnt(mib, this);
                            this.isdnSignalingBchannelCount = new IsdnSignalingBchannelCountEnt(mib, this);
                            this.isdnSignalingInfoTrapEnable = new IsdnSignalingInfoTrapEnableEnt(mib, this);
                            this.isdnSignalingStatus = new IsdnSignalingStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isdnSignalingIndex,
                                this.isdnSignalingIfIndex,
                                this.isdnSignalingProtocol,
                                this.isdnSignalingCallingAddress,
                                this.isdnSignalingSubAddress,
                                this.isdnSignalingBchannelCount,
                                this.isdnSignalingInfoTrapEnable,
                                this.isdnSignalingStatus
                            };
                        }
                        public static final class IsdnSignalingIndexEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnSignalingIndexEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnSignalingIndex", "1.3.6.1.2.1.10.20.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnSignalingIfIndexEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnSignalingIfIndexEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnSignalingIfIndex", "1.3.6.1.2.1.10.20.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnSignalingProtocolEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnSignalingProtocolEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnSignalingProtocol", "1.3.6.1.2.1.10.20.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnSignalingCallingAddressEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnSignalingCallingAddressEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnSignalingCallingAddress", "1.3.6.1.2.1.10.20.1.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnSignalingSubAddressEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnSignalingSubAddressEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnSignalingSubAddress", "1.3.6.1.2.1.10.20.1.3.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnSignalingBchannelCountEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnSignalingBchannelCountEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnSignalingBchannelCount", "1.3.6.1.2.1.10.20.1.3.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnSignalingInfoTrapEnableEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnSignalingInfoTrapEnableEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnSignalingInfoTrapEnable", "1.3.6.1.2.1.10.20.1.3.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnSignalingStatusEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnSignalingStatusEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnSignalingStatus", "1.3.6.1.2.1.10.20.1.3.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IsdnSignalingStatsTableEnt extends MIBEntry<ISDNMIBDef>
                {
                    public final IsdnSignalingStatsEntryEnt isdnSignalingStatsEntry;

                    private IsdnSignalingStatsTableEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                    {
                        super(mib, parent, "isdnSignalingStatsTable", "1.3.6.1.2.1.10.20.1.3.3", false, true, false, false);
                        this.isdnSignalingStatsEntry = new IsdnSignalingStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isdnSignalingStatsEntry
                        };
                    }
                    public static final class IsdnSignalingStatsEntryEnt extends MIBEntry<ISDNMIBDef>
                    {
                        public final IsdnSigStatsInCallsEnt isdnSigStatsInCalls;

                        public final IsdnSigStatsInConnectedEnt isdnSigStatsInConnected;

                        public final IsdnSigStatsOutCallsEnt isdnSigStatsOutCalls;

                        public final IsdnSigStatsOutConnectedEnt isdnSigStatsOutConnected;

                        public final IsdnSigStatsChargedUnitsEnt isdnSigStatsChargedUnits;

                        private IsdnSignalingStatsEntryEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                        {
                            super(mib, parent, "isdnSignalingStatsEntry", "1.3.6.1.2.1.10.20.1.3.3.1", false, false, false, true);
                            this.isdnSigStatsInCalls = new IsdnSigStatsInCallsEnt(mib, this);
                            this.isdnSigStatsInConnected = new IsdnSigStatsInConnectedEnt(mib, this);
                            this.isdnSigStatsOutCalls = new IsdnSigStatsOutCallsEnt(mib, this);
                            this.isdnSigStatsOutConnected = new IsdnSigStatsOutConnectedEnt(mib, this);
                            this.isdnSigStatsChargedUnits = new IsdnSigStatsChargedUnitsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isdnSigStatsInCalls,
                                this.isdnSigStatsInConnected,
                                this.isdnSigStatsOutCalls,
                                this.isdnSigStatsOutConnected,
                                this.isdnSigStatsChargedUnits
                            };
                        }
                        public static final class IsdnSigStatsInCallsEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnSigStatsInCallsEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnSigStatsInCalls", "1.3.6.1.2.1.10.20.1.3.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnSigStatsInConnectedEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnSigStatsInConnectedEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnSigStatsInConnected", "1.3.6.1.2.1.10.20.1.3.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnSigStatsOutCallsEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnSigStatsOutCallsEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnSigStatsOutCalls", "1.3.6.1.2.1.10.20.1.3.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnSigStatsOutConnectedEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnSigStatsOutConnectedEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnSigStatsOutConnected", "1.3.6.1.2.1.10.20.1.3.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnSigStatsChargedUnitsEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnSigStatsChargedUnitsEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnSigStatsChargedUnits", "1.3.6.1.2.1.10.20.1.3.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IsdnLapdTableEnt extends MIBEntry<ISDNMIBDef>
                {
                    public final IsdnLapdEntryEnt isdnLapdEntry;

                    private IsdnLapdTableEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                    {
                        super(mib, parent, "isdnLapdTable", "1.3.6.1.2.1.10.20.1.3.4", false, true, false, false);
                        this.isdnLapdEntry = new IsdnLapdEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isdnLapdEntry
                        };
                    }
                    public static final class IsdnLapdEntryEnt extends MIBEntry<ISDNMIBDef>
                    {
                        public final IsdnLapdPrimaryChannelEnt isdnLapdPrimaryChannel;

                        public final IsdnLapdOperStatusEnt isdnLapdOperStatus;

                        public final IsdnLapdPeerSabmeEnt isdnLapdPeerSabme;

                        public final IsdnLapdRecvdFrmrEnt isdnLapdRecvdFrmr;

                        private IsdnLapdEntryEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                        {
                            super(mib, parent, "isdnLapdEntry", "1.3.6.1.2.1.10.20.1.3.4.1", false, false, false, true);
                            this.isdnLapdPrimaryChannel = new IsdnLapdPrimaryChannelEnt(mib, this);
                            this.isdnLapdOperStatus = new IsdnLapdOperStatusEnt(mib, this);
                            this.isdnLapdPeerSabme = new IsdnLapdPeerSabmeEnt(mib, this);
                            this.isdnLapdRecvdFrmr = new IsdnLapdRecvdFrmrEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isdnLapdPrimaryChannel,
                                this.isdnLapdOperStatus,
                                this.isdnLapdPeerSabme,
                                this.isdnLapdRecvdFrmr
                            };
                        }
                        public static final class IsdnLapdPrimaryChannelEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnLapdPrimaryChannelEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnLapdPrimaryChannel", "1.3.6.1.2.1.10.20.1.3.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnLapdOperStatusEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnLapdOperStatusEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnLapdOperStatus", "1.3.6.1.2.1.10.20.1.3.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnLapdPeerSabmeEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnLapdPeerSabmeEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnLapdPeerSabme", "1.3.6.1.2.1.10.20.1.3.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnLapdRecvdFrmrEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnLapdRecvdFrmrEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnLapdRecvdFrmr", "1.3.6.1.2.1.10.20.1.3.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IsdnEndpointGroupEnt extends MIBEntry<ISDNMIBDef>
            {
                public final IsdnEndpointGetIndexEnt isdnEndpointGetIndex;

                public final IsdnEndpointTableEnt isdnEndpointTable;

                private IsdnEndpointGroupEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                {
                    super(mib, parent, "isdnEndpointGroup", "1.3.6.1.2.1.10.20.1.4", false, false, false, false);
                    this.isdnEndpointGetIndex = new IsdnEndpointGetIndexEnt(mib, this);
                    this.isdnEndpointTable = new IsdnEndpointTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isdnEndpointGetIndex,
                        this.isdnEndpointTable
                    };
                }
                public static final class IsdnEndpointGetIndexEnt extends MIBEntry<ISDNMIBDef>
                {
                    private IsdnEndpointGetIndexEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                    {
                        super(mib, parent, "isdnEndpointGetIndex", "1.3.6.1.2.1.10.20.1.4.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsdnEndpointTableEnt extends MIBEntry<ISDNMIBDef>
                {
                    public final IsdnEndpointEntryEnt isdnEndpointEntry;

                    private IsdnEndpointTableEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                    {
                        super(mib, parent, "isdnEndpointTable", "1.3.6.1.2.1.10.20.1.4.2", false, true, false, false);
                        this.isdnEndpointEntry = new IsdnEndpointEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isdnEndpointEntry
                        };
                    }
                    public static final class IsdnEndpointEntryEnt extends MIBEntry<ISDNMIBDef>
                    {
                        public final IsdnEndpointIndexEnt isdnEndpointIndex;

                        public final IsdnEndpointIfIndexEnt isdnEndpointIfIndex;

                        public final IsdnEndpointIfTypeEnt isdnEndpointIfType;

                        public final IsdnEndpointTeiTypeEnt isdnEndpointTeiType;

                        public final IsdnEndpointTeiValueEnt isdnEndpointTeiValue;

                        public final IsdnEndpointSpidEnt isdnEndpointSpid;

                        public final IsdnEndpointStatusEnt isdnEndpointStatus;

                        private IsdnEndpointEntryEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                        {
                            super(mib, parent, "isdnEndpointEntry", "1.3.6.1.2.1.10.20.1.4.2.1", false, false, false, true);
                            this.isdnEndpointIndex = new IsdnEndpointIndexEnt(mib, this);
                            this.isdnEndpointIfIndex = new IsdnEndpointIfIndexEnt(mib, this);
                            this.isdnEndpointIfType = new IsdnEndpointIfTypeEnt(mib, this);
                            this.isdnEndpointTeiType = new IsdnEndpointTeiTypeEnt(mib, this);
                            this.isdnEndpointTeiValue = new IsdnEndpointTeiValueEnt(mib, this);
                            this.isdnEndpointSpid = new IsdnEndpointSpidEnt(mib, this);
                            this.isdnEndpointStatus = new IsdnEndpointStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isdnEndpointIndex,
                                this.isdnEndpointIfIndex,
                                this.isdnEndpointIfType,
                                this.isdnEndpointTeiType,
                                this.isdnEndpointTeiValue,
                                this.isdnEndpointSpid,
                                this.isdnEndpointStatus
                            };
                        }
                        public static final class IsdnEndpointIndexEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnEndpointIndexEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnEndpointIndex", "1.3.6.1.2.1.10.20.1.4.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnEndpointIfIndexEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnEndpointIfIndexEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnEndpointIfIndex", "1.3.6.1.2.1.10.20.1.4.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnEndpointIfTypeEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnEndpointIfTypeEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnEndpointIfType", "1.3.6.1.2.1.10.20.1.4.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnEndpointTeiTypeEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnEndpointTeiTypeEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnEndpointTeiType", "1.3.6.1.2.1.10.20.1.4.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnEndpointTeiValueEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnEndpointTeiValueEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnEndpointTeiValue", "1.3.6.1.2.1.10.20.1.4.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnEndpointSpidEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnEndpointSpidEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnEndpointSpid", "1.3.6.1.2.1.10.20.1.4.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnEndpointStatusEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnEndpointStatusEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnEndpointStatus", "1.3.6.1.2.1.10.20.1.4.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IsdnDirectoryGroupEnt extends MIBEntry<ISDNMIBDef>
            {
                public final IsdnDirectoryTableEnt isdnDirectoryTable;

                private IsdnDirectoryGroupEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                {
                    super(mib, parent, "isdnDirectoryGroup", "1.3.6.1.2.1.10.20.1.5", false, false, false, false);
                    this.isdnDirectoryTable = new IsdnDirectoryTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isdnDirectoryTable
                    };
                }
                public static final class IsdnDirectoryTableEnt extends MIBEntry<ISDNMIBDef>
                {
                    public final IsdnDirectoryEntryEnt isdnDirectoryEntry;

                    private IsdnDirectoryTableEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                    {
                        super(mib, parent, "isdnDirectoryTable", "1.3.6.1.2.1.10.20.1.5.1", false, true, false, false);
                        this.isdnDirectoryEntry = new IsdnDirectoryEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isdnDirectoryEntry
                        };
                    }
                    public static final class IsdnDirectoryEntryEnt extends MIBEntry<ISDNMIBDef>
                    {
                        public final IsdnDirectoryIndexEnt isdnDirectoryIndex;

                        public final IsdnDirectoryNumberEnt isdnDirectoryNumber;

                        public final IsdnDirectorySigIndexEnt isdnDirectorySigIndex;

                        public final IsdnDirectoryStatusEnt isdnDirectoryStatus;

                        private IsdnDirectoryEntryEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                        {
                            super(mib, parent, "isdnDirectoryEntry", "1.3.6.1.2.1.10.20.1.5.1.1", false, false, false, true);
                            this.isdnDirectoryIndex = new IsdnDirectoryIndexEnt(mib, this);
                            this.isdnDirectoryNumber = new IsdnDirectoryNumberEnt(mib, this);
                            this.isdnDirectorySigIndex = new IsdnDirectorySigIndexEnt(mib, this);
                            this.isdnDirectoryStatus = new IsdnDirectoryStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isdnDirectoryIndex,
                                this.isdnDirectoryNumber,
                                this.isdnDirectorySigIndex,
                                this.isdnDirectoryStatus
                            };
                        }
                        public static final class IsdnDirectoryIndexEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnDirectoryIndexEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnDirectoryIndex", "1.3.6.1.2.1.10.20.1.5.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnDirectoryNumberEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnDirectoryNumberEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnDirectoryNumber", "1.3.6.1.2.1.10.20.1.5.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnDirectorySigIndexEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnDirectorySigIndexEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnDirectorySigIndex", "1.3.6.1.2.1.10.20.1.5.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsdnDirectoryStatusEnt extends MIBEntry<ISDNMIBDef>
                        {
                            private IsdnDirectoryStatusEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                            {
                                super(mib, parent, "isdnDirectoryStatus", "1.3.6.1.2.1.10.20.1.5.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class IsdnMibTrapPrefixEnt extends MIBEntry<ISDNMIBDef>
        {
            public final IsdnMibTrapsEnt isdnMibTraps;

            public final IsdnMibCompliancesEnt isdnMibCompliances;

            public final IsdnMibGroupsEnt isdnMibGroups;

            private IsdnMibTrapPrefixEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
            {
                super(mib, parent, "isdnMibTrapPrefix", "1.3.6.1.2.1.10.20.2", false, false, false, false);
                this.isdnMibTraps = new IsdnMibTrapsEnt(mib, this);
                this.isdnMibCompliances = new IsdnMibCompliancesEnt(mib, this);
                this.isdnMibGroups = new IsdnMibGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.isdnMibTraps,
                    this.isdnMibCompliances,
                    this.isdnMibGroups
                };
            }
            public static final class IsdnMibTrapsEnt extends MIBEntry<ISDNMIBDef>
            {
                /** isdnBearerTable ifIndex*/
                public final IsdnMibCallInformationEnt isdnMibCallInformation;

                private IsdnMibTrapsEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                {
                    super(mib, parent, "isdnMibTraps", "1.3.6.1.2.1.10.20.2.0", false, false, false, false);
                    this.isdnMibCallInformation = new IsdnMibCallInformationEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isdnMibCallInformation
                    };
                }
                public static final class IsdnMibCallInformationEnt extends MIBEntry<ISDNMIBDef>
                {
                    private IsdnMibCallInformationEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                    {
                        super(mib, parent, "isdnMibCallInformation", "1.3.6.1.2.1.10.20.2.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class IsdnMibCompliancesEnt extends MIBEntry<ISDNMIBDef>
            {
                /** compliance statements*/
                public final IsdnMibComplianceEnt isdnMibCompliance;

                private IsdnMibCompliancesEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                {
                    super(mib, parent, "isdnMibCompliances", "1.3.6.1.2.1.10.20.2.1", false, false, false, false);
                    this.isdnMibCompliance = new IsdnMibComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isdnMibCompliance
                    };
                }
                public static final class IsdnMibComplianceEnt extends MIBEntry<ISDNMIBDef>
                {
                    private IsdnMibComplianceEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                    {
                        super(mib, parent, "isdnMibCompliance", "1.3.6.1.2.1.10.20.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class IsdnMibGroupsEnt extends MIBEntry<ISDNMIBDef>
            {
                /** units of conformance*/
                public final IsdnMibBasicRateGroupEnt isdnMibBasicRateGroup;

                public final IsdnMibBearerGroupEnt isdnMibBearerGroup;

                public final IsdnMibSignalingGroupEnt isdnMibSignalingGroup;

                public final IsdnMibEndpointGroupEnt isdnMibEndpointGroup;

                public final IsdnMibDirectoryGroupEnt isdnMibDirectoryGroup;

                public final IsdnMibNotificationsGroupEnt isdnMibNotificationsGroup;

                private IsdnMibGroupsEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                {
                    super(mib, parent, "isdnMibGroups", "1.3.6.1.2.1.10.20.2.2", false, false, false, false);
                    this.isdnMibBasicRateGroup = new IsdnMibBasicRateGroupEnt(mib, this);
                    this.isdnMibBearerGroup = new IsdnMibBearerGroupEnt(mib, this);
                    this.isdnMibSignalingGroup = new IsdnMibSignalingGroupEnt(mib, this);
                    this.isdnMibEndpointGroup = new IsdnMibEndpointGroupEnt(mib, this);
                    this.isdnMibDirectoryGroup = new IsdnMibDirectoryGroupEnt(mib, this);
                    this.isdnMibNotificationsGroup = new IsdnMibNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isdnMibBasicRateGroup,
                        this.isdnMibBearerGroup,
                        this.isdnMibSignalingGroup,
                        this.isdnMibEndpointGroup,
                        this.isdnMibDirectoryGroup,
                        this.isdnMibNotificationsGroup
                    };
                }
                public static final class IsdnMibBasicRateGroupEnt extends MIBEntry<ISDNMIBDef>
                {
                    private IsdnMibBasicRateGroupEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                    {
                        super(mib, parent, "isdnMibBasicRateGroup", "1.3.6.1.2.1.10.20.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsdnMibBearerGroupEnt extends MIBEntry<ISDNMIBDef>
                {
                    private IsdnMibBearerGroupEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                    {
                        super(mib, parent, "isdnMibBearerGroup", "1.3.6.1.2.1.10.20.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsdnMibSignalingGroupEnt extends MIBEntry<ISDNMIBDef>
                {
                    private IsdnMibSignalingGroupEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                    {
                        super(mib, parent, "isdnMibSignalingGroup", "1.3.6.1.2.1.10.20.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsdnMibEndpointGroupEnt extends MIBEntry<ISDNMIBDef>
                {
                    private IsdnMibEndpointGroupEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                    {
                        super(mib, parent, "isdnMibEndpointGroup", "1.3.6.1.2.1.10.20.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsdnMibDirectoryGroupEnt extends MIBEntry<ISDNMIBDef>
                {
                    private IsdnMibDirectoryGroupEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                    {
                        super(mib, parent, "isdnMibDirectoryGroup", "1.3.6.1.2.1.10.20.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsdnMibNotificationsGroupEnt extends MIBEntry<ISDNMIBDef>
                {
                    private IsdnMibNotificationsGroupEnt(ISDNMIBDef mib, MIBEntry<ISDNMIBDef> parent)
                    {
                        super(mib, parent, "isdnMibNotificationsGroup", "1.3.6.1.2.1.10.20.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
