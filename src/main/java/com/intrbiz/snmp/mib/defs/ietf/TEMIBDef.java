package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class TEMIBDef extends MIB
{
    public static final TEMIBDef TEMIB = new TEMIBDef();

    /** 01 January 2005*/
    public final TeMIBEnt teMIB;

    private TEMIBDef()
    {
        super("TE-MIB");
        this.teMIB = new TeMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.teMIB
        };
    }

    public static final class TeMIBEnt extends MIBEntry<TEMIBDef>
    {
        /** Top level objects*/
        public final TeMIBNotificationsEnt teMIBNotifications;

        public final TeMIBObjectsEnt teMIBObjects;

        public final TeMIBConformanceEnt teMIBConformance;

        private TeMIBEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
        {
            super(mib, parent, "teMIB", "1.3.6.1.2.1.122", false, false, false, false);
            this.teMIBNotifications = new TeMIBNotificationsEnt(mib, this);
            this.teMIBObjects = new TeMIBObjectsEnt(mib, this);
            this.teMIBConformance = new TeMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.teMIBNotifications,
                this.teMIBObjects,
                this.teMIBConformance
            };
        }
        public static final class TeMIBNotificationsEnt extends MIBEntry<TEMIBDef>
        {
            /** ****************************************************************TE Notifications

TunnelPath*/
            public final TeTunnelUpEnt teTunnelUp;

            /** TunnelPath*/
            public final TeTunnelDownEnt teTunnelDown;

            /** toTunnelPath*/
            public final TeTunnelChangedEnt teTunnelChanged;

            /** toTunnelPath*/
            public final TeTunnelReroutedEnt teTunnelRerouted;

            private TeMIBNotificationsEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
            {
                super(mib, parent, "teMIBNotifications", "1.3.6.1.2.1.122.0", false, false, false, false);
                this.teTunnelUp = new TeTunnelUpEnt(mib, this);
                this.teTunnelDown = new TeTunnelDownEnt(mib, this);
                this.teTunnelChanged = new TeTunnelChangedEnt(mib, this);
                this.teTunnelRerouted = new TeTunnelReroutedEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.teTunnelUp,
                    this.teTunnelDown,
                    this.teTunnelChanged,
                    this.teTunnelRerouted
                };
            }
            public static final class TeTunnelUpEnt extends MIBEntry<TEMIBDef>
            {
                private TeTunnelUpEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                {
                    super(mib, parent, "teTunnelUp", "1.3.6.1.2.1.122.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TeTunnelDownEnt extends MIBEntry<TEMIBDef>
            {
                private TeTunnelDownEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                {
                    super(mib, parent, "teTunnelDown", "1.3.6.1.2.1.122.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TeTunnelChangedEnt extends MIBEntry<TEMIBDef>
            {
                private TeTunnelChangedEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                {
                    super(mib, parent, "teTunnelChanged", "1.3.6.1.2.1.122.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TeTunnelReroutedEnt extends MIBEntry<TEMIBDef>
            {
                private TeTunnelReroutedEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                {
                    super(mib, parent, "teTunnelRerouted", "1.3.6.1.2.1.122.0.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class TeMIBObjectsEnt extends MIBEntry<TEMIBDef>
        {
            /** ****************************************************************TE MIB Objects
TE Info*/
            public final TeInfoEnt teInfo;

            /** Tunnel Table*/
            public final TeTunnelTableEnt teTunnelTable;

            /** ****************************************************************Tunnel Path Table*/
            public final TePathTableEnt tePathTable;

            /** ****************************************************************Tunnel Path Hop Table*/
            public final TePathHopTableEnt tePathHopTable;

            private TeMIBObjectsEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
            {
                super(mib, parent, "teMIBObjects", "1.3.6.1.2.1.122.1", false, false, false, false);
                this.teInfo = new TeInfoEnt(mib, this);
                this.teTunnelTable = new TeTunnelTableEnt(mib, this);
                this.tePathTable = new TePathTableEnt(mib, this);
                this.tePathHopTable = new TePathHopTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.teInfo,
                    this.teTunnelTable,
                    this.tePathTable,
                    this.tePathHopTable
                };
            }
            public static final class TeInfoEnt extends MIBEntry<TEMIBDef>
            {
                public final TeDistProtocolEnt teDistProtocol;

                public final TeSignalingProtoEnt teSignalingProto;

                public final TeNotificationEnableEnt teNotificationEnable;

                public final TeNextTunnelIndexEnt teNextTunnelIndex;

                public final TeNextPathHopIndexEnt teNextPathHopIndex;

                public final TeConfiguredTunnelsEnt teConfiguredTunnels;

                public final TeActiveTunnelsEnt teActiveTunnels;

                public final TePrimaryTunnelsEnt tePrimaryTunnels;

                public final TeAdminGroupTableEnt teAdminGroupTable;

                private TeInfoEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                {
                    super(mib, parent, "teInfo", "1.3.6.1.2.1.122.1.1", false, false, false, false);
                    this.teDistProtocol = new TeDistProtocolEnt(mib, this);
                    this.teSignalingProto = new TeSignalingProtoEnt(mib, this);
                    this.teNotificationEnable = new TeNotificationEnableEnt(mib, this);
                    this.teNextTunnelIndex = new TeNextTunnelIndexEnt(mib, this);
                    this.teNextPathHopIndex = new TeNextPathHopIndexEnt(mib, this);
                    this.teConfiguredTunnels = new TeConfiguredTunnelsEnt(mib, this);
                    this.teActiveTunnels = new TeActiveTunnelsEnt(mib, this);
                    this.tePrimaryTunnels = new TePrimaryTunnelsEnt(mib, this);
                    this.teAdminGroupTable = new TeAdminGroupTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.teDistProtocol,
                        this.teSignalingProto,
                        this.teNotificationEnable,
                        this.teNextTunnelIndex,
                        this.teNextPathHopIndex,
                        this.teConfiguredTunnels,
                        this.teActiveTunnels,
                        this.tePrimaryTunnels,
                        this.teAdminGroupTable
                    };
                }
                public static final class TeDistProtocolEnt extends MIBEntry<TEMIBDef>
                {
                    private TeDistProtocolEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "teDistProtocol", "1.3.6.1.2.1.122.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TeSignalingProtoEnt extends MIBEntry<TEMIBDef>
                {
                    private TeSignalingProtoEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "teSignalingProto", "1.3.6.1.2.1.122.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TeNotificationEnableEnt extends MIBEntry<TEMIBDef>
                {
                    private TeNotificationEnableEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "teNotificationEnable", "1.3.6.1.2.1.122.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TeNextTunnelIndexEnt extends MIBEntry<TEMIBDef>
                {
                    private TeNextTunnelIndexEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "teNextTunnelIndex", "1.3.6.1.2.1.122.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TeNextPathHopIndexEnt extends MIBEntry<TEMIBDef>
                {
                    private TeNextPathHopIndexEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "teNextPathHopIndex", "1.3.6.1.2.1.122.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TeConfiguredTunnelsEnt extends MIBEntry<TEMIBDef>
                {
                    private TeConfiguredTunnelsEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "teConfiguredTunnels", "1.3.6.1.2.1.122.1.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TeActiveTunnelsEnt extends MIBEntry<TEMIBDef>
                {
                    private TeActiveTunnelsEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "teActiveTunnels", "1.3.6.1.2.1.122.1.1.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TePrimaryTunnelsEnt extends MIBEntry<TEMIBDef>
                {
                    private TePrimaryTunnelsEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "tePrimaryTunnels", "1.3.6.1.2.1.122.1.1.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TeAdminGroupTableEnt extends MIBEntry<TEMIBDef>
                {
                    public final TeAdminGroupEntryEnt teAdminGroupEntry;

                    private TeAdminGroupTableEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "teAdminGroupTable", "1.3.6.1.2.1.122.1.1.9", false, true, false, false);
                        this.teAdminGroupEntry = new TeAdminGroupEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.teAdminGroupEntry
                        };
                    }
                    public static final class TeAdminGroupEntryEnt extends MIBEntry<TEMIBDef>
                    {
                        public final TeAdminGroupNumberEnt teAdminGroupNumber;

                        public final TeAdminGroupNameEnt teAdminGroupName;

                        public final TeAdminGroupRowStatusEnt teAdminGroupRowStatus;

                        private TeAdminGroupEntryEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teAdminGroupEntry", "1.3.6.1.2.1.122.1.1.9.1", false, false, false, true);
                            this.teAdminGroupNumber = new TeAdminGroupNumberEnt(mib, this);
                            this.teAdminGroupName = new TeAdminGroupNameEnt(mib, this);
                            this.teAdminGroupRowStatus = new TeAdminGroupRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.teAdminGroupNumber,
                                this.teAdminGroupName,
                                this.teAdminGroupRowStatus
                            };
                        }
                        public static final class TeAdminGroupNumberEnt extends MIBEntry<TEMIBDef>
                        {
                            private TeAdminGroupNumberEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                            {
                                super(mib, parent, "teAdminGroupNumber", "1.3.6.1.2.1.122.1.1.9.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TeAdminGroupNameEnt extends MIBEntry<TEMIBDef>
                        {
                            private TeAdminGroupNameEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                            {
                                super(mib, parent, "teAdminGroupName", "1.3.6.1.2.1.122.1.1.9.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TeAdminGroupRowStatusEnt extends MIBEntry<TEMIBDef>
                        {
                            private TeAdminGroupRowStatusEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                            {
                                super(mib, parent, "teAdminGroupRowStatus", "1.3.6.1.2.1.122.1.1.9.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class TeTunnelTableEnt extends MIBEntry<TEMIBDef>
            {
                public final TeTunnelEntryEnt teTunnelEntry;

                private TeTunnelTableEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                {
                    super(mib, parent, "teTunnelTable", "1.3.6.1.2.1.122.1.2", false, true, false, false);
                    this.teTunnelEntry = new TeTunnelEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.teTunnelEntry
                    };
                }
                public static final class TeTunnelEntryEnt extends MIBEntry<TEMIBDef>
                {
                    public final TeTunnelIndexEnt teTunnelIndex;

                    public final TeTunnelNameEnt teTunnelName;

                    public final TeTunnelNextPathIndexEnt teTunnelNextPathIndex;

                    public final TeTunnelRowStatusEnt teTunnelRowStatus;

                    public final TeTunnelStorageTypeEnt teTunnelStorageType;

                    public final TeTunnelSourceAddressTypeEnt teTunnelSourceAddressType;

                    public final TeTunnelSourceAddressEnt teTunnelSourceAddress;

                    public final TeTunnelDestinationAddressTypeEnt teTunnelDestinationAddressType;

                    public final TeTunnelDestinationAddressEnt teTunnelDestinationAddress;

                    public final TeTunnelStateEnt teTunnelState;

                    public final TeTunnelDiscontinuityTimerEnt teTunnelDiscontinuityTimer;

                    public final TeTunnelOctetsEnt teTunnelOctets;

                    public final TeTunnelPacketsEnt teTunnelPackets;

                    public final TeTunnelLPOctetsEnt teTunnelLPOctets;

                    public final TeTunnelLPPacketsEnt teTunnelLPPackets;

                    public final TeTunnelAgeEnt teTunnelAge;

                    public final TeTunnelTimeUpEnt teTunnelTimeUp;

                    public final TeTunnelPrimaryTimeUpEnt teTunnelPrimaryTimeUp;

                    public final TeTunnelTransitionsEnt teTunnelTransitions;

                    public final TeTunnelLastTransitionEnt teTunnelLastTransition;

                    public final TeTunnelPathChangesEnt teTunnelPathChanges;

                    public final TeTunnelLastPathChangeEnt teTunnelLastPathChange;

                    public final TeTunnelConfiguredPathsEnt teTunnelConfiguredPaths;

                    public final TeTunnelStandbyPathsEnt teTunnelStandbyPaths;

                    public final TeTunnelOperationalPathsEnt teTunnelOperationalPaths;

                    private TeTunnelEntryEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "teTunnelEntry", "1.3.6.1.2.1.122.1.2.1", false, false, false, true);
                        this.teTunnelIndex = new TeTunnelIndexEnt(mib, this);
                        this.teTunnelName = new TeTunnelNameEnt(mib, this);
                        this.teTunnelNextPathIndex = new TeTunnelNextPathIndexEnt(mib, this);
                        this.teTunnelRowStatus = new TeTunnelRowStatusEnt(mib, this);
                        this.teTunnelStorageType = new TeTunnelStorageTypeEnt(mib, this);
                        this.teTunnelSourceAddressType = new TeTunnelSourceAddressTypeEnt(mib, this);
                        this.teTunnelSourceAddress = new TeTunnelSourceAddressEnt(mib, this);
                        this.teTunnelDestinationAddressType = new TeTunnelDestinationAddressTypeEnt(mib, this);
                        this.teTunnelDestinationAddress = new TeTunnelDestinationAddressEnt(mib, this);
                        this.teTunnelState = new TeTunnelStateEnt(mib, this);
                        this.teTunnelDiscontinuityTimer = new TeTunnelDiscontinuityTimerEnt(mib, this);
                        this.teTunnelOctets = new TeTunnelOctetsEnt(mib, this);
                        this.teTunnelPackets = new TeTunnelPacketsEnt(mib, this);
                        this.teTunnelLPOctets = new TeTunnelLPOctetsEnt(mib, this);
                        this.teTunnelLPPackets = new TeTunnelLPPacketsEnt(mib, this);
                        this.teTunnelAge = new TeTunnelAgeEnt(mib, this);
                        this.teTunnelTimeUp = new TeTunnelTimeUpEnt(mib, this);
                        this.teTunnelPrimaryTimeUp = new TeTunnelPrimaryTimeUpEnt(mib, this);
                        this.teTunnelTransitions = new TeTunnelTransitionsEnt(mib, this);
                        this.teTunnelLastTransition = new TeTunnelLastTransitionEnt(mib, this);
                        this.teTunnelPathChanges = new TeTunnelPathChangesEnt(mib, this);
                        this.teTunnelLastPathChange = new TeTunnelLastPathChangeEnt(mib, this);
                        this.teTunnelConfiguredPaths = new TeTunnelConfiguredPathsEnt(mib, this);
                        this.teTunnelStandbyPaths = new TeTunnelStandbyPathsEnt(mib, this);
                        this.teTunnelOperationalPaths = new TeTunnelOperationalPathsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.teTunnelIndex,
                            this.teTunnelName,
                            this.teTunnelNextPathIndex,
                            this.teTunnelRowStatus,
                            this.teTunnelStorageType,
                            this.teTunnelSourceAddressType,
                            this.teTunnelSourceAddress,
                            this.teTunnelDestinationAddressType,
                            this.teTunnelDestinationAddress,
                            this.teTunnelState,
                            this.teTunnelDiscontinuityTimer,
                            this.teTunnelOctets,
                            this.teTunnelPackets,
                            this.teTunnelLPOctets,
                            this.teTunnelLPPackets,
                            this.teTunnelAge,
                            this.teTunnelTimeUp,
                            this.teTunnelPrimaryTimeUp,
                            this.teTunnelTransitions,
                            this.teTunnelLastTransition,
                            this.teTunnelPathChanges,
                            this.teTunnelLastPathChange,
                            this.teTunnelConfiguredPaths,
                            this.teTunnelStandbyPaths,
                            this.teTunnelOperationalPaths
                        };
                    }
                    public static final class TeTunnelIndexEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelIndexEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelIndex", "1.3.6.1.2.1.122.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelNameEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelNameEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelName", "1.3.6.1.2.1.122.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelNextPathIndexEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelNextPathIndexEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelNextPathIndex", "1.3.6.1.2.1.122.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelRowStatusEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelRowStatusEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelRowStatus", "1.3.6.1.2.1.122.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelStorageTypeEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelStorageTypeEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelStorageType", "1.3.6.1.2.1.122.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelSourceAddressTypeEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelSourceAddressTypeEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelSourceAddressType", "1.3.6.1.2.1.122.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelSourceAddressEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelSourceAddressEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelSourceAddress", "1.3.6.1.2.1.122.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelDestinationAddressTypeEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelDestinationAddressTypeEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelDestinationAddressType", "1.3.6.1.2.1.122.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelDestinationAddressEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelDestinationAddressEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelDestinationAddress", "1.3.6.1.2.1.122.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelStateEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelStateEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelState", "1.3.6.1.2.1.122.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelDiscontinuityTimerEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelDiscontinuityTimerEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelDiscontinuityTimer", "1.3.6.1.2.1.122.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelOctetsEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelOctetsEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelOctets", "1.3.6.1.2.1.122.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelPacketsEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelPacketsEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelPackets", "1.3.6.1.2.1.122.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelLPOctetsEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelLPOctetsEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelLPOctets", "1.3.6.1.2.1.122.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelLPPacketsEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelLPPacketsEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelLPPackets", "1.3.6.1.2.1.122.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelAgeEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelAgeEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelAge", "1.3.6.1.2.1.122.1.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelTimeUpEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelTimeUpEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelTimeUp", "1.3.6.1.2.1.122.1.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelPrimaryTimeUpEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelPrimaryTimeUpEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelPrimaryTimeUp", "1.3.6.1.2.1.122.1.2.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelTransitionsEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelTransitionsEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelTransitions", "1.3.6.1.2.1.122.1.2.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelLastTransitionEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelLastTransitionEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelLastTransition", "1.3.6.1.2.1.122.1.2.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelPathChangesEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelPathChangesEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelPathChanges", "1.3.6.1.2.1.122.1.2.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelLastPathChangeEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelLastPathChangeEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelLastPathChange", "1.3.6.1.2.1.122.1.2.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelConfiguredPathsEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelConfiguredPathsEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelConfiguredPaths", "1.3.6.1.2.1.122.1.2.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelStandbyPathsEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelStandbyPathsEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelStandbyPaths", "1.3.6.1.2.1.122.1.2.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeTunnelOperationalPathsEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeTunnelOperationalPathsEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teTunnelOperationalPaths", "1.3.6.1.2.1.122.1.2.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class TePathTableEnt extends MIBEntry<TEMIBDef>
            {
                public final TePathEntryEnt tePathEntry;

                private TePathTableEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                {
                    super(mib, parent, "tePathTable", "1.3.6.1.2.1.122.1.3", false, true, false, false);
                    this.tePathEntry = new TePathEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tePathEntry
                    };
                }
                public static final class TePathEntryEnt extends MIBEntry<TEMIBDef>
                {
                    public final TePathIndexEnt tePathIndex;

                    public final TePathNameEnt tePathName;

                    public final TePathRowStatusEnt tePathRowStatus;

                    public final TePathStorageTypeEnt tePathStorageType;

                    public final TePathTypeEnt tePathType;

                    public final TePathConfiguredRouteEnt tePathConfiguredRoute;

                    public final TePathBandwidthEnt tePathBandwidth;

                    public final TePathIncludeAnyEnt tePathIncludeAny;

                    public final TePathIncludeAllEnt tePathIncludeAll;

                    public final TePathExcludeEnt tePathExclude;

                    public final TePathSetupPriorityEnt tePathSetupPriority;

                    public final TePathHoldPriorityEnt tePathHoldPriority;

                    public final TePathPropertiesEnt tePathProperties;

                    public final TePathOperStatusEnt tePathOperStatus;

                    public final TePathAdminStatusEnt tePathAdminStatus;

                    public final TePathComputedRouteEnt tePathComputedRoute;

                    public final TePathRecordedRouteEnt tePathRecordedRoute;

                    private TePathEntryEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "tePathEntry", "1.3.6.1.2.1.122.1.3.1", false, false, false, true);
                        this.tePathIndex = new TePathIndexEnt(mib, this);
                        this.tePathName = new TePathNameEnt(mib, this);
                        this.tePathRowStatus = new TePathRowStatusEnt(mib, this);
                        this.tePathStorageType = new TePathStorageTypeEnt(mib, this);
                        this.tePathType = new TePathTypeEnt(mib, this);
                        this.tePathConfiguredRoute = new TePathConfiguredRouteEnt(mib, this);
                        this.tePathBandwidth = new TePathBandwidthEnt(mib, this);
                        this.tePathIncludeAny = new TePathIncludeAnyEnt(mib, this);
                        this.tePathIncludeAll = new TePathIncludeAllEnt(mib, this);
                        this.tePathExclude = new TePathExcludeEnt(mib, this);
                        this.tePathSetupPriority = new TePathSetupPriorityEnt(mib, this);
                        this.tePathHoldPriority = new TePathHoldPriorityEnt(mib, this);
                        this.tePathProperties = new TePathPropertiesEnt(mib, this);
                        this.tePathOperStatus = new TePathOperStatusEnt(mib, this);
                        this.tePathAdminStatus = new TePathAdminStatusEnt(mib, this);
                        this.tePathComputedRoute = new TePathComputedRouteEnt(mib, this);
                        this.tePathRecordedRoute = new TePathRecordedRouteEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tePathIndex,
                            this.tePathName,
                            this.tePathRowStatus,
                            this.tePathStorageType,
                            this.tePathType,
                            this.tePathConfiguredRoute,
                            this.tePathBandwidth,
                            this.tePathIncludeAny,
                            this.tePathIncludeAll,
                            this.tePathExclude,
                            this.tePathSetupPriority,
                            this.tePathHoldPriority,
                            this.tePathProperties,
                            this.tePathOperStatus,
                            this.tePathAdminStatus,
                            this.tePathComputedRoute,
                            this.tePathRecordedRoute
                        };
                    }
                    public static final class TePathIndexEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathIndexEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathIndex", "1.3.6.1.2.1.122.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathNameEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathNameEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathName", "1.3.6.1.2.1.122.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathRowStatusEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathRowStatusEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathRowStatus", "1.3.6.1.2.1.122.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathStorageTypeEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathStorageTypeEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathStorageType", "1.3.6.1.2.1.122.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathTypeEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathTypeEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathType", "1.3.6.1.2.1.122.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathConfiguredRouteEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathConfiguredRouteEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathConfiguredRoute", "1.3.6.1.2.1.122.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathBandwidthEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathBandwidthEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathBandwidth", "1.3.6.1.2.1.122.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathIncludeAnyEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathIncludeAnyEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathIncludeAny", "1.3.6.1.2.1.122.1.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathIncludeAllEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathIncludeAllEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathIncludeAll", "1.3.6.1.2.1.122.1.3.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathExcludeEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathExcludeEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathExclude", "1.3.6.1.2.1.122.1.3.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathSetupPriorityEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathSetupPriorityEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathSetupPriority", "1.3.6.1.2.1.122.1.3.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathHoldPriorityEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathHoldPriorityEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathHoldPriority", "1.3.6.1.2.1.122.1.3.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathPropertiesEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathPropertiesEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathProperties", "1.3.6.1.2.1.122.1.3.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathOperStatusEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathOperStatusEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathOperStatus", "1.3.6.1.2.1.122.1.3.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathAdminStatusEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathAdminStatusEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathAdminStatus", "1.3.6.1.2.1.122.1.3.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathComputedRouteEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathComputedRouteEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathComputedRoute", "1.3.6.1.2.1.122.1.3.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathRecordedRouteEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathRecordedRouteEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathRecordedRoute", "1.3.6.1.2.1.122.1.3.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class TePathHopTableEnt extends MIBEntry<TEMIBDef>
            {
                public final TePathHopEntryEnt tePathHopEntry;

                private TePathHopTableEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                {
                    super(mib, parent, "tePathHopTable", "1.3.6.1.2.1.122.1.4", false, true, false, false);
                    this.tePathHopEntry = new TePathHopEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tePathHopEntry
                    };
                }
                public static final class TePathHopEntryEnt extends MIBEntry<TEMIBDef>
                {
                    public final TeHopListIndexEnt teHopListIndex;

                    public final TePathHopIndexEnt tePathHopIndex;

                    public final TePathHopRowStatusEnt tePathHopRowStatus;

                    public final TePathHopStorageTypeEnt tePathHopStorageType;

                    public final TePathHopAddrTypeEnt tePathHopAddrType;

                    public final TePathHopAddressEnt tePathHopAddress;

                    public final TePathHopTypeEnt tePathHopType;

                    private TePathHopEntryEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "tePathHopEntry", "1.3.6.1.2.1.122.1.4.1", false, false, false, true);
                        this.teHopListIndex = new TeHopListIndexEnt(mib, this);
                        this.tePathHopIndex = new TePathHopIndexEnt(mib, this);
                        this.tePathHopRowStatus = new TePathHopRowStatusEnt(mib, this);
                        this.tePathHopStorageType = new TePathHopStorageTypeEnt(mib, this);
                        this.tePathHopAddrType = new TePathHopAddrTypeEnt(mib, this);
                        this.tePathHopAddress = new TePathHopAddressEnt(mib, this);
                        this.tePathHopType = new TePathHopTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.teHopListIndex,
                            this.tePathHopIndex,
                            this.tePathHopRowStatus,
                            this.tePathHopStorageType,
                            this.tePathHopAddrType,
                            this.tePathHopAddress,
                            this.tePathHopType
                        };
                    }
                    public static final class TeHopListIndexEnt extends MIBEntry<TEMIBDef>
                    {
                        private TeHopListIndexEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "teHopListIndex", "1.3.6.1.2.1.122.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathHopIndexEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathHopIndexEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathHopIndex", "1.3.6.1.2.1.122.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathHopRowStatusEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathHopRowStatusEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathHopRowStatus", "1.3.6.1.2.1.122.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathHopStorageTypeEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathHopStorageTypeEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathHopStorageType", "1.3.6.1.2.1.122.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathHopAddrTypeEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathHopAddrTypeEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathHopAddrType", "1.3.6.1.2.1.122.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathHopAddressEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathHopAddressEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathHopAddress", "1.3.6.1.2.1.122.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TePathHopTypeEnt extends MIBEntry<TEMIBDef>
                    {
                        private TePathHopTypeEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                        {
                            super(mib, parent, "tePathHopType", "1.3.6.1.2.1.122.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class TeMIBConformanceEnt extends MIBEntry<TEMIBDef>
        {
            /** End of TE-MIB objects
****************************************************************TE Compliance Statements*/
            public final TeGroupsEnt teGroups;

            public final TeModuleComplianceEnt teModuleCompliance;

            private TeMIBConformanceEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
            {
                super(mib, parent, "teMIBConformance", "1.3.6.1.2.1.122.2", false, false, false, false);
                this.teGroups = new TeGroupsEnt(mib, this);
                this.teModuleCompliance = new TeModuleComplianceEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.teGroups,
                    this.teModuleCompliance
                };
            }
            public static final class TeGroupsEnt extends MIBEntry<TEMIBDef>
            {
                /** ****************************************************************TE object groups*/
                public final TeTrafficEngineeringGroupEnt teTrafficEngineeringGroup;

                public final TeNotificationGroupEnt teNotificationGroup;

                private TeGroupsEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                {
                    super(mib, parent, "teGroups", "1.3.6.1.2.1.122.2.1", false, false, false, false);
                    this.teTrafficEngineeringGroup = new TeTrafficEngineeringGroupEnt(mib, this);
                    this.teNotificationGroup = new TeNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.teTrafficEngineeringGroup,
                        this.teNotificationGroup
                    };
                }
                public static final class TeTrafficEngineeringGroupEnt extends MIBEntry<TEMIBDef>
                {
                    private TeTrafficEngineeringGroupEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "teTrafficEngineeringGroup", "1.3.6.1.2.1.122.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TeNotificationGroupEnt extends MIBEntry<TEMIBDef>
                {
                    private TeNotificationGroupEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "teNotificationGroup", "1.3.6.1.2.1.122.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class TeModuleComplianceEnt extends MIBEntry<TEMIBDef>
            {
                /** ****************************************************************TE compliance statementsThere are four compliance statements: read-only and full


compliance for regular TE devices, and read-only and fullcompliance for path computation servers.*/
                public final TeModuleReadOnlyComplianceEnt teModuleReadOnlyCompliance;

                public final TeModuleFullComplianceEnt teModuleFullCompliance;

                public final TeModuleServerReadOnlyComplianceEnt teModuleServerReadOnlyCompliance;

                public final TeModuleServerFullComplianceEnt teModuleServerFullCompliance;

                private TeModuleComplianceEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                {
                    super(mib, parent, "teModuleCompliance", "1.3.6.1.2.1.122.2.2", false, false, false, false);
                    this.teModuleReadOnlyCompliance = new TeModuleReadOnlyComplianceEnt(mib, this);
                    this.teModuleFullCompliance = new TeModuleFullComplianceEnt(mib, this);
                    this.teModuleServerReadOnlyCompliance = new TeModuleServerReadOnlyComplianceEnt(mib, this);
                    this.teModuleServerFullCompliance = new TeModuleServerFullComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.teModuleReadOnlyCompliance,
                        this.teModuleFullCompliance,
                        this.teModuleServerReadOnlyCompliance,
                        this.teModuleServerFullCompliance
                    };
                }
                public static final class TeModuleReadOnlyComplianceEnt extends MIBEntry<TEMIBDef>
                {
                    private TeModuleReadOnlyComplianceEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "teModuleReadOnlyCompliance", "1.3.6.1.2.1.122.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TeModuleFullComplianceEnt extends MIBEntry<TEMIBDef>
                {
                    private TeModuleFullComplianceEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "teModuleFullCompliance", "1.3.6.1.2.1.122.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TeModuleServerReadOnlyComplianceEnt extends MIBEntry<TEMIBDef>
                {
                    private TeModuleServerReadOnlyComplianceEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "teModuleServerReadOnlyCompliance", "1.3.6.1.2.1.122.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TeModuleServerFullComplianceEnt extends MIBEntry<TEMIBDef>
                {
                    private TeModuleServerFullComplianceEnt(TEMIBDef mib, MIBEntry<TEMIBDef> parent)
                    {
                        super(mib, parent, "teModuleServerFullCompliance", "1.3.6.1.2.1.122.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
