package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class DOT12RPTRMIBDef extends MIB
{
    public static final DOT12RPTRMIBDef DOT12RPTRMIB = new DOT12RPTRMIBDef();

    /** May 19, 1997*/
    public final VgRptrMIBEnt vgRptrMIB;

    private DOT12RPTRMIBDef()
    {
        super("DOT12-RPTR-MIB");
        this.vgRptrMIB = new VgRptrMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.vgRptrMIB
        };
    }

    public static final class VgRptrMIBEnt extends MIBEntry<DOT12RPTRMIBDef>
    {
        public final VgRptrObjectsEnt vgRptrObjects;

        public final VgRptrTrapsEnt vgRptrTraps;

        /** conformance information*/
        public final VgRptrConformanceEnt vgRptrConformance;

        private VgRptrMIBEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
        {
            super(mib, parent, "vgRptrMIB", "1.3.6.1.2.1.53", false, false, false, false);
            this.vgRptrObjects = new VgRptrObjectsEnt(mib, this);
            this.vgRptrTraps = new VgRptrTrapsEnt(mib, this);
            this.vgRptrConformance = new VgRptrConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.vgRptrObjects,
                this.vgRptrTraps,
                this.vgRptrConformance
            };
        }
        public static final class VgRptrObjectsEnt extends MIBEntry<DOT12RPTRMIBDef>
        {
            public final VgRptrBasicEnt vgRptrBasic;

            public final VgRptrMonitorEnt vgRptrMonitor;

            public final VgRptrAddrTrackEnt vgRptrAddrTrack;

            private VgRptrObjectsEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
            {
                super(mib, parent, "vgRptrObjects", "1.3.6.1.2.1.53.1", false, false, false, false);
                this.vgRptrBasic = new VgRptrBasicEnt(mib, this);
                this.vgRptrMonitor = new VgRptrMonitorEnt(mib, this);
                this.vgRptrAddrTrack = new VgRptrAddrTrackEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.vgRptrBasic,
                    this.vgRptrMonitor,
                    this.vgRptrAddrTrack
                };
            }
            public static final class VgRptrBasicEnt extends MIBEntry<DOT12RPTRMIBDef>
            {
                public final VgRptrBasicRptrEnt vgRptrBasicRptr;

                public final VgRptrBasicGroupEnt vgRptrBasicGroup;

                public final VgRptrBasicPortEnt vgRptrBasicPort;

                private VgRptrBasicEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                {
                    super(mib, parent, "vgRptrBasic", "1.3.6.1.2.1.53.1.1", false, false, false, false);
                    this.vgRptrBasicRptr = new VgRptrBasicRptrEnt(mib, this);
                    this.vgRptrBasicGroup = new VgRptrBasicGroupEnt(mib, this);
                    this.vgRptrBasicPort = new VgRptrBasicPortEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vgRptrBasicRptr,
                        this.vgRptrBasicGroup,
                        this.vgRptrBasicPort
                    };
                }
                public static final class VgRptrBasicRptrEnt extends MIBEntry<DOT12RPTRMIBDef>
                {
                    public final VgRptrInfoTableEnt vgRptrInfoTable;

                    private VgRptrBasicRptrEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                    {
                        super(mib, parent, "vgRptrBasicRptr", "1.3.6.1.2.1.53.1.1.1", false, false, false, false);
                        this.vgRptrInfoTable = new VgRptrInfoTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vgRptrInfoTable
                        };
                    }
                    public static final class VgRptrInfoTableEnt extends MIBEntry<DOT12RPTRMIBDef>
                    {
                        public final VgRptrInfoEntryEnt vgRptrInfoEntry;

                        private VgRptrInfoTableEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                        {
                            super(mib, parent, "vgRptrInfoTable", "1.3.6.1.2.1.53.1.1.1.1", false, true, false, false);
                            this.vgRptrInfoEntry = new VgRptrInfoEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vgRptrInfoEntry
                            };
                        }
                        public static final class VgRptrInfoEntryEnt extends MIBEntry<DOT12RPTRMIBDef>
                        {
                            public final VgRptrInfoIndexEnt vgRptrInfoIndex;

                            public final VgRptrInfoMACAddressEnt vgRptrInfoMACAddress;

                            public final VgRptrInfoCurrentFramingTypeEnt vgRptrInfoCurrentFramingType;

                            public final VgRptrInfoDesiredFramingTypeEnt vgRptrInfoDesiredFramingType;

                            public final VgRptrInfoFramingCapabilityEnt vgRptrInfoFramingCapability;

                            public final VgRptrInfoTrainingVersionEnt vgRptrInfoTrainingVersion;

                            public final VgRptrInfoOperStatusEnt vgRptrInfoOperStatus;

                            public final VgRptrInfoResetEnt vgRptrInfoReset;

                            public final VgRptrInfoLastChangeEnt vgRptrInfoLastChange;

                            private VgRptrInfoEntryEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                            {
                                super(mib, parent, "vgRptrInfoEntry", "1.3.6.1.2.1.53.1.1.1.1.1", false, false, false, true);
                                this.vgRptrInfoIndex = new VgRptrInfoIndexEnt(mib, this);
                                this.vgRptrInfoMACAddress = new VgRptrInfoMACAddressEnt(mib, this);
                                this.vgRptrInfoCurrentFramingType = new VgRptrInfoCurrentFramingTypeEnt(mib, this);
                                this.vgRptrInfoDesiredFramingType = new VgRptrInfoDesiredFramingTypeEnt(mib, this);
                                this.vgRptrInfoFramingCapability = new VgRptrInfoFramingCapabilityEnt(mib, this);
                                this.vgRptrInfoTrainingVersion = new VgRptrInfoTrainingVersionEnt(mib, this);
                                this.vgRptrInfoOperStatus = new VgRptrInfoOperStatusEnt(mib, this);
                                this.vgRptrInfoReset = new VgRptrInfoResetEnt(mib, this);
                                this.vgRptrInfoLastChange = new VgRptrInfoLastChangeEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.vgRptrInfoIndex,
                                    this.vgRptrInfoMACAddress,
                                    this.vgRptrInfoCurrentFramingType,
                                    this.vgRptrInfoDesiredFramingType,
                                    this.vgRptrInfoFramingCapability,
                                    this.vgRptrInfoTrainingVersion,
                                    this.vgRptrInfoOperStatus,
                                    this.vgRptrInfoReset,
                                    this.vgRptrInfoLastChange
                                };
                            }
                            public static final class VgRptrInfoIndexEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrInfoIndexEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrInfoIndex", "1.3.6.1.2.1.53.1.1.1.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrInfoMACAddressEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrInfoMACAddressEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrInfoMACAddress", "1.3.6.1.2.1.53.1.1.1.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrInfoCurrentFramingTypeEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrInfoCurrentFramingTypeEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrInfoCurrentFramingType", "1.3.6.1.2.1.53.1.1.1.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrInfoDesiredFramingTypeEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrInfoDesiredFramingTypeEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrInfoDesiredFramingType", "1.3.6.1.2.1.53.1.1.1.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrInfoFramingCapabilityEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrInfoFramingCapabilityEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrInfoFramingCapability", "1.3.6.1.2.1.53.1.1.1.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrInfoTrainingVersionEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrInfoTrainingVersionEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrInfoTrainingVersion", "1.3.6.1.2.1.53.1.1.1.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrInfoOperStatusEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrInfoOperStatusEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrInfoOperStatus", "1.3.6.1.2.1.53.1.1.1.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrInfoResetEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrInfoResetEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrInfoReset", "1.3.6.1.2.1.53.1.1.1.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrInfoLastChangeEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrInfoLastChangeEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrInfoLastChange", "1.3.6.1.2.1.53.1.1.1.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class VgRptrBasicGroupEnt extends MIBEntry<DOT12RPTRMIBDef>
                {
                    public final VgRptrBasicGroupTableEnt vgRptrBasicGroupTable;

                    private VgRptrBasicGroupEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                    {
                        super(mib, parent, "vgRptrBasicGroup", "1.3.6.1.2.1.53.1.1.2", false, false, false, false);
                        this.vgRptrBasicGroupTable = new VgRptrBasicGroupTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vgRptrBasicGroupTable
                        };
                    }
                    public static final class VgRptrBasicGroupTableEnt extends MIBEntry<DOT12RPTRMIBDef>
                    {
                        public final VgRptrBasicGroupEntryEnt vgRptrBasicGroupEntry;

                        private VgRptrBasicGroupTableEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                        {
                            super(mib, parent, "vgRptrBasicGroupTable", "1.3.6.1.2.1.53.1.1.2.1", false, true, false, false);
                            this.vgRptrBasicGroupEntry = new VgRptrBasicGroupEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vgRptrBasicGroupEntry
                            };
                        }
                        public static final class VgRptrBasicGroupEntryEnt extends MIBEntry<DOT12RPTRMIBDef>
                        {
                            public final VgRptrGroupIndexEnt vgRptrGroupIndex;

                            public final VgRptrGroupObjectIDEnt vgRptrGroupObjectID;

                            public final VgRptrGroupOperStatusEnt vgRptrGroupOperStatus;

                            public final VgRptrGroupPortCapacityEnt vgRptrGroupPortCapacity;

                            public final VgRptrGroupCablesBundledEnt vgRptrGroupCablesBundled;

                            private VgRptrBasicGroupEntryEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                            {
                                super(mib, parent, "vgRptrBasicGroupEntry", "1.3.6.1.2.1.53.1.1.2.1.1", false, false, false, true);
                                this.vgRptrGroupIndex = new VgRptrGroupIndexEnt(mib, this);
                                this.vgRptrGroupObjectID = new VgRptrGroupObjectIDEnt(mib, this);
                                this.vgRptrGroupOperStatus = new VgRptrGroupOperStatusEnt(mib, this);
                                this.vgRptrGroupPortCapacity = new VgRptrGroupPortCapacityEnt(mib, this);
                                this.vgRptrGroupCablesBundled = new VgRptrGroupCablesBundledEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.vgRptrGroupIndex,
                                    this.vgRptrGroupObjectID,
                                    this.vgRptrGroupOperStatus,
                                    this.vgRptrGroupPortCapacity,
                                    this.vgRptrGroupCablesBundled
                                };
                            }
                            public static final class VgRptrGroupIndexEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrGroupIndexEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrGroupIndex", "1.3.6.1.2.1.53.1.1.2.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrGroupObjectIDEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrGroupObjectIDEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrGroupObjectID", "1.3.6.1.2.1.53.1.1.2.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrGroupOperStatusEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrGroupOperStatusEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrGroupOperStatus", "1.3.6.1.2.1.53.1.1.2.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrGroupPortCapacityEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrGroupPortCapacityEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrGroupPortCapacity", "1.3.6.1.2.1.53.1.1.2.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrGroupCablesBundledEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrGroupCablesBundledEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrGroupCablesBundled", "1.3.6.1.2.1.53.1.1.2.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class VgRptrBasicPortEnt extends MIBEntry<DOT12RPTRMIBDef>
                {
                    public final VgRptrBasicPortTableEnt vgRptrBasicPortTable;

                    private VgRptrBasicPortEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                    {
                        super(mib, parent, "vgRptrBasicPort", "1.3.6.1.2.1.53.1.1.3", false, false, false, false);
                        this.vgRptrBasicPortTable = new VgRptrBasicPortTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vgRptrBasicPortTable
                        };
                    }
                    public static final class VgRptrBasicPortTableEnt extends MIBEntry<DOT12RPTRMIBDef>
                    {
                        public final VgRptrBasicPortEntryEnt vgRptrBasicPortEntry;

                        private VgRptrBasicPortTableEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                        {
                            super(mib, parent, "vgRptrBasicPortTable", "1.3.6.1.2.1.53.1.1.3.1", false, true, false, false);
                            this.vgRptrBasicPortEntry = new VgRptrBasicPortEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vgRptrBasicPortEntry
                            };
                        }
                        public static final class VgRptrBasicPortEntryEnt extends MIBEntry<DOT12RPTRMIBDef>
                        {
                            public final VgRptrPortIndexEnt vgRptrPortIndex;

                            public final VgRptrPortTypeEnt vgRptrPortType;

                            public final VgRptrPortAdminStatusEnt vgRptrPortAdminStatus;

                            public final VgRptrPortOperStatusEnt vgRptrPortOperStatus;

                            public final VgRptrPortSupportedPromiscModeEnt vgRptrPortSupportedPromiscMode;

                            public final VgRptrPortSupportedCascadeModeEnt vgRptrPortSupportedCascadeMode;

                            public final VgRptrPortAllowedTrainTypeEnt vgRptrPortAllowedTrainType;

                            public final VgRptrPortLastTrainConfigEnt vgRptrPortLastTrainConfig;

                            public final VgRptrPortTrainingResultEnt vgRptrPortTrainingResult;

                            public final VgRptrPortPriorityEnableEnt vgRptrPortPriorityEnable;

                            public final VgRptrPortRptrInfoIndexEnt vgRptrPortRptrInfoIndex;

                            private VgRptrBasicPortEntryEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                            {
                                super(mib, parent, "vgRptrBasicPortEntry", "1.3.6.1.2.1.53.1.1.3.1.1", false, false, false, true);
                                this.vgRptrPortIndex = new VgRptrPortIndexEnt(mib, this);
                                this.vgRptrPortType = new VgRptrPortTypeEnt(mib, this);
                                this.vgRptrPortAdminStatus = new VgRptrPortAdminStatusEnt(mib, this);
                                this.vgRptrPortOperStatus = new VgRptrPortOperStatusEnt(mib, this);
                                this.vgRptrPortSupportedPromiscMode = new VgRptrPortSupportedPromiscModeEnt(mib, this);
                                this.vgRptrPortSupportedCascadeMode = new VgRptrPortSupportedCascadeModeEnt(mib, this);
                                this.vgRptrPortAllowedTrainType = new VgRptrPortAllowedTrainTypeEnt(mib, this);
                                this.vgRptrPortLastTrainConfig = new VgRptrPortLastTrainConfigEnt(mib, this);
                                this.vgRptrPortTrainingResult = new VgRptrPortTrainingResultEnt(mib, this);
                                this.vgRptrPortPriorityEnable = new VgRptrPortPriorityEnableEnt(mib, this);
                                this.vgRptrPortRptrInfoIndex = new VgRptrPortRptrInfoIndexEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.vgRptrPortIndex,
                                    this.vgRptrPortType,
                                    this.vgRptrPortAdminStatus,
                                    this.vgRptrPortOperStatus,
                                    this.vgRptrPortSupportedPromiscMode,
                                    this.vgRptrPortSupportedCascadeMode,
                                    this.vgRptrPortAllowedTrainType,
                                    this.vgRptrPortLastTrainConfig,
                                    this.vgRptrPortTrainingResult,
                                    this.vgRptrPortPriorityEnable,
                                    this.vgRptrPortRptrInfoIndex
                                };
                            }
                            public static final class VgRptrPortIndexEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortIndexEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortIndex", "1.3.6.1.2.1.53.1.1.3.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortTypeEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortTypeEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortType", "1.3.6.1.2.1.53.1.1.3.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortAdminStatusEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortAdminStatusEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortAdminStatus", "1.3.6.1.2.1.53.1.1.3.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortOperStatusEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortOperStatusEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortOperStatus", "1.3.6.1.2.1.53.1.1.3.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortSupportedPromiscModeEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortSupportedPromiscModeEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortSupportedPromiscMode", "1.3.6.1.2.1.53.1.1.3.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortSupportedCascadeModeEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortSupportedCascadeModeEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortSupportedCascadeMode", "1.3.6.1.2.1.53.1.1.3.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortAllowedTrainTypeEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortAllowedTrainTypeEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortAllowedTrainType", "1.3.6.1.2.1.53.1.1.3.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortLastTrainConfigEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortLastTrainConfigEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortLastTrainConfig", "1.3.6.1.2.1.53.1.1.3.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortTrainingResultEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortTrainingResultEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortTrainingResult", "1.3.6.1.2.1.53.1.1.3.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortPriorityEnableEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortPriorityEnableEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortPriorityEnable", "1.3.6.1.2.1.53.1.1.3.1.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortRptrInfoIndexEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortRptrInfoIndexEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortRptrInfoIndex", "1.3.6.1.2.1.53.1.1.3.1.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

            public static final class VgRptrMonitorEnt extends MIBEntry<DOT12RPTRMIBDef>
            {
                public final VgRptrMonRepeaterEnt vgRptrMonRepeater;

                public final VgRptrMonGroupEnt vgRptrMonGroup;

                /** Currently unused*/
                public final VgRptrMonPortEnt vgRptrMonPort;

                private VgRptrMonitorEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                {
                    super(mib, parent, "vgRptrMonitor", "1.3.6.1.2.1.53.1.2", false, false, false, false);
                    this.vgRptrMonRepeater = new VgRptrMonRepeaterEnt(mib, this);
                    this.vgRptrMonGroup = new VgRptrMonGroupEnt(mib, this);
                    this.vgRptrMonPort = new VgRptrMonPortEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vgRptrMonRepeater,
                        this.vgRptrMonGroup,
                        this.vgRptrMonPort
                    };
                }
                public static final class VgRptrMonRepeaterEnt extends MIBEntry<DOT12RPTRMIBDef>
                {
                    public final VgRptrMonitorTableEnt vgRptrMonitorTable;

                    private VgRptrMonRepeaterEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                    {
                        super(mib, parent, "vgRptrMonRepeater", "1.3.6.1.2.1.53.1.2.1", false, false, false, false);
                        this.vgRptrMonitorTable = new VgRptrMonitorTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vgRptrMonitorTable
                        };
                    }
                    public static final class VgRptrMonitorTableEnt extends MIBEntry<DOT12RPTRMIBDef>
                    {
                        public final VgRptrMonitorEntryEnt vgRptrMonitorEntry;

                        private VgRptrMonitorTableEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                        {
                            super(mib, parent, "vgRptrMonitorTable", "1.3.6.1.2.1.53.1.2.1.1", false, true, false, false);
                            this.vgRptrMonitorEntry = new VgRptrMonitorEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vgRptrMonitorEntry
                            };
                        }
                        public static final class VgRptrMonitorEntryEnt extends MIBEntry<DOT12RPTRMIBDef>
                        {
                            public final VgRptrMonTotalReadableFramesEnt vgRptrMonTotalReadableFrames;

                            public final VgRptrMonTotalReadableOctetsEnt vgRptrMonTotalReadableOctets;

                            public final VgRptrMonReadableOctetRolloversEnt vgRptrMonReadableOctetRollovers;

                            public final VgRptrMonHCTotalReadableOctetsEnt vgRptrMonHCTotalReadableOctets;

                            public final VgRptrMonTotalErrorsEnt vgRptrMonTotalErrors;

                            private VgRptrMonitorEntryEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                            {
                                super(mib, parent, "vgRptrMonitorEntry", "1.3.6.1.2.1.53.1.2.1.1.1", false, false, false, true);
                                this.vgRptrMonTotalReadableFrames = new VgRptrMonTotalReadableFramesEnt(mib, this);
                                this.vgRptrMonTotalReadableOctets = new VgRptrMonTotalReadableOctetsEnt(mib, this);
                                this.vgRptrMonReadableOctetRollovers = new VgRptrMonReadableOctetRolloversEnt(mib, this);
                                this.vgRptrMonHCTotalReadableOctets = new VgRptrMonHCTotalReadableOctetsEnt(mib, this);
                                this.vgRptrMonTotalErrors = new VgRptrMonTotalErrorsEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.vgRptrMonTotalReadableFrames,
                                    this.vgRptrMonTotalReadableOctets,
                                    this.vgRptrMonReadableOctetRollovers,
                                    this.vgRptrMonHCTotalReadableOctets,
                                    this.vgRptrMonTotalErrors
                                };
                            }
                            public static final class VgRptrMonTotalReadableFramesEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrMonTotalReadableFramesEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrMonTotalReadableFrames", "1.3.6.1.2.1.53.1.2.1.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrMonTotalReadableOctetsEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrMonTotalReadableOctetsEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrMonTotalReadableOctets", "1.3.6.1.2.1.53.1.2.1.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrMonReadableOctetRolloversEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrMonReadableOctetRolloversEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrMonReadableOctetRollovers", "1.3.6.1.2.1.53.1.2.1.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrMonHCTotalReadableOctetsEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrMonHCTotalReadableOctetsEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrMonHCTotalReadableOctets", "1.3.6.1.2.1.53.1.2.1.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrMonTotalErrorsEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrMonTotalErrorsEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrMonTotalErrors", "1.3.6.1.2.1.53.1.2.1.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class VgRptrMonGroupEnt extends MIBEntry<DOT12RPTRMIBDef>
                {
                    private VgRptrMonGroupEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                    {
                        super(mib, parent, "vgRptrMonGroup", "1.3.6.1.2.1.53.1.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VgRptrMonPortEnt extends MIBEntry<DOT12RPTRMIBDef>
                {
                    public final VgRptrMonPortTableEnt vgRptrMonPortTable;

                    private VgRptrMonPortEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                    {
                        super(mib, parent, "vgRptrMonPort", "1.3.6.1.2.1.53.1.2.3", false, false, false, false);
                        this.vgRptrMonPortTable = new VgRptrMonPortTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vgRptrMonPortTable
                        };
                    }
                    public static final class VgRptrMonPortTableEnt extends MIBEntry<DOT12RPTRMIBDef>
                    {
                        public final VgRptrMonPortEntryEnt vgRptrMonPortEntry;

                        private VgRptrMonPortTableEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                        {
                            super(mib, parent, "vgRptrMonPortTable", "1.3.6.1.2.1.53.1.2.3.1", false, true, false, false);
                            this.vgRptrMonPortEntry = new VgRptrMonPortEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vgRptrMonPortEntry
                            };
                        }
                        public static final class VgRptrMonPortEntryEnt extends MIBEntry<DOT12RPTRMIBDef>
                        {
                            public final VgRptrPortReadableFramesEnt vgRptrPortReadableFrames;

                            public final VgRptrPortReadableOctetsEnt vgRptrPortReadableOctets;

                            public final VgRptrPortReadOctetRolloversEnt vgRptrPortReadOctetRollovers;

                            public final VgRptrPortHCReadableOctetsEnt vgRptrPortHCReadableOctets;

                            public final VgRptrPortUnreadableOctetsEnt vgRptrPortUnreadableOctets;

                            public final VgRptrPortUnreadOctetRolloversEnt vgRptrPortUnreadOctetRollovers;

                            public final VgRptrPortHCUnreadableOctetsEnt vgRptrPortHCUnreadableOctets;

                            public final VgRptrPortHighPriorityFramesEnt vgRptrPortHighPriorityFrames;

                            public final VgRptrPortHighPriorityOctetsEnt vgRptrPortHighPriorityOctets;

                            public final VgRptrPortHighPriOctetRolloversEnt vgRptrPortHighPriOctetRollovers;

                            public final VgRptrPortHCHighPriorityOctetsEnt vgRptrPortHCHighPriorityOctets;

                            public final VgRptrPortNormPriorityFramesEnt vgRptrPortNormPriorityFrames;

                            public final VgRptrPortNormPriorityOctetsEnt vgRptrPortNormPriorityOctets;

                            public final VgRptrPortNormPriOctetRolloversEnt vgRptrPortNormPriOctetRollovers;

                            public final VgRptrPortHCNormPriorityOctetsEnt vgRptrPortHCNormPriorityOctets;

                            public final VgRptrPortBroadcastFramesEnt vgRptrPortBroadcastFrames;

                            public final VgRptrPortMulticastFramesEnt vgRptrPortMulticastFrames;

                            public final VgRptrPortNullAddressedFramesEnt vgRptrPortNullAddressedFrames;

                            public final VgRptrPortIPMFramesEnt vgRptrPortIPMFrames;

                            public final VgRptrPortOversizeFramesEnt vgRptrPortOversizeFrames;

                            public final VgRptrPortDataErrorFramesEnt vgRptrPortDataErrorFrames;

                            public final VgRptrPortPriorityPromotionsEnt vgRptrPortPriorityPromotions;

                            public final VgRptrPortTransitionToTrainingsEnt vgRptrPortTransitionToTrainings;

                            public final VgRptrPortLastChangeEnt vgRptrPortLastChange;

                            private VgRptrMonPortEntryEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                            {
                                super(mib, parent, "vgRptrMonPortEntry", "1.3.6.1.2.1.53.1.2.3.1.1", false, false, false, true);
                                this.vgRptrPortReadableFrames = new VgRptrPortReadableFramesEnt(mib, this);
                                this.vgRptrPortReadableOctets = new VgRptrPortReadableOctetsEnt(mib, this);
                                this.vgRptrPortReadOctetRollovers = new VgRptrPortReadOctetRolloversEnt(mib, this);
                                this.vgRptrPortHCReadableOctets = new VgRptrPortHCReadableOctetsEnt(mib, this);
                                this.vgRptrPortUnreadableOctets = new VgRptrPortUnreadableOctetsEnt(mib, this);
                                this.vgRptrPortUnreadOctetRollovers = new VgRptrPortUnreadOctetRolloversEnt(mib, this);
                                this.vgRptrPortHCUnreadableOctets = new VgRptrPortHCUnreadableOctetsEnt(mib, this);
                                this.vgRptrPortHighPriorityFrames = new VgRptrPortHighPriorityFramesEnt(mib, this);
                                this.vgRptrPortHighPriorityOctets = new VgRptrPortHighPriorityOctetsEnt(mib, this);
                                this.vgRptrPortHighPriOctetRollovers = new VgRptrPortHighPriOctetRolloversEnt(mib, this);
                                this.vgRptrPortHCHighPriorityOctets = new VgRptrPortHCHighPriorityOctetsEnt(mib, this);
                                this.vgRptrPortNormPriorityFrames = new VgRptrPortNormPriorityFramesEnt(mib, this);
                                this.vgRptrPortNormPriorityOctets = new VgRptrPortNormPriorityOctetsEnt(mib, this);
                                this.vgRptrPortNormPriOctetRollovers = new VgRptrPortNormPriOctetRolloversEnt(mib, this);
                                this.vgRptrPortHCNormPriorityOctets = new VgRptrPortHCNormPriorityOctetsEnt(mib, this);
                                this.vgRptrPortBroadcastFrames = new VgRptrPortBroadcastFramesEnt(mib, this);
                                this.vgRptrPortMulticastFrames = new VgRptrPortMulticastFramesEnt(mib, this);
                                this.vgRptrPortNullAddressedFrames = new VgRptrPortNullAddressedFramesEnt(mib, this);
                                this.vgRptrPortIPMFrames = new VgRptrPortIPMFramesEnt(mib, this);
                                this.vgRptrPortOversizeFrames = new VgRptrPortOversizeFramesEnt(mib, this);
                                this.vgRptrPortDataErrorFrames = new VgRptrPortDataErrorFramesEnt(mib, this);
                                this.vgRptrPortPriorityPromotions = new VgRptrPortPriorityPromotionsEnt(mib, this);
                                this.vgRptrPortTransitionToTrainings = new VgRptrPortTransitionToTrainingsEnt(mib, this);
                                this.vgRptrPortLastChange = new VgRptrPortLastChangeEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.vgRptrPortReadableFrames,
                                    this.vgRptrPortReadableOctets,
                                    this.vgRptrPortReadOctetRollovers,
                                    this.vgRptrPortHCReadableOctets,
                                    this.vgRptrPortUnreadableOctets,
                                    this.vgRptrPortUnreadOctetRollovers,
                                    this.vgRptrPortHCUnreadableOctets,
                                    this.vgRptrPortHighPriorityFrames,
                                    this.vgRptrPortHighPriorityOctets,
                                    this.vgRptrPortHighPriOctetRollovers,
                                    this.vgRptrPortHCHighPriorityOctets,
                                    this.vgRptrPortNormPriorityFrames,
                                    this.vgRptrPortNormPriorityOctets,
                                    this.vgRptrPortNormPriOctetRollovers,
                                    this.vgRptrPortHCNormPriorityOctets,
                                    this.vgRptrPortBroadcastFrames,
                                    this.vgRptrPortMulticastFrames,
                                    this.vgRptrPortNullAddressedFrames,
                                    this.vgRptrPortIPMFrames,
                                    this.vgRptrPortOversizeFrames,
                                    this.vgRptrPortDataErrorFrames,
                                    this.vgRptrPortPriorityPromotions,
                                    this.vgRptrPortTransitionToTrainings,
                                    this.vgRptrPortLastChange
                                };
                            }
                            public static final class VgRptrPortReadableFramesEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortReadableFramesEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortReadableFrames", "1.3.6.1.2.1.53.1.2.3.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortReadableOctetsEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortReadableOctetsEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortReadableOctets", "1.3.6.1.2.1.53.1.2.3.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortReadOctetRolloversEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortReadOctetRolloversEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortReadOctetRollovers", "1.3.6.1.2.1.53.1.2.3.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortHCReadableOctetsEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortHCReadableOctetsEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortHCReadableOctets", "1.3.6.1.2.1.53.1.2.3.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortUnreadableOctetsEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortUnreadableOctetsEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortUnreadableOctets", "1.3.6.1.2.1.53.1.2.3.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortUnreadOctetRolloversEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortUnreadOctetRolloversEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortUnreadOctetRollovers", "1.3.6.1.2.1.53.1.2.3.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortHCUnreadableOctetsEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortHCUnreadableOctetsEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortHCUnreadableOctets", "1.3.6.1.2.1.53.1.2.3.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortHighPriorityFramesEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortHighPriorityFramesEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortHighPriorityFrames", "1.3.6.1.2.1.53.1.2.3.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortHighPriorityOctetsEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortHighPriorityOctetsEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortHighPriorityOctets", "1.3.6.1.2.1.53.1.2.3.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortHighPriOctetRolloversEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortHighPriOctetRolloversEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortHighPriOctetRollovers", "1.3.6.1.2.1.53.1.2.3.1.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortHCHighPriorityOctetsEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortHCHighPriorityOctetsEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortHCHighPriorityOctets", "1.3.6.1.2.1.53.1.2.3.1.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortNormPriorityFramesEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortNormPriorityFramesEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortNormPriorityFrames", "1.3.6.1.2.1.53.1.2.3.1.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortNormPriorityOctetsEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortNormPriorityOctetsEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortNormPriorityOctets", "1.3.6.1.2.1.53.1.2.3.1.1.13", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortNormPriOctetRolloversEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortNormPriOctetRolloversEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortNormPriOctetRollovers", "1.3.6.1.2.1.53.1.2.3.1.1.14", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortHCNormPriorityOctetsEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortHCNormPriorityOctetsEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortHCNormPriorityOctets", "1.3.6.1.2.1.53.1.2.3.1.1.15", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortBroadcastFramesEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortBroadcastFramesEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortBroadcastFrames", "1.3.6.1.2.1.53.1.2.3.1.1.16", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortMulticastFramesEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortMulticastFramesEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortMulticastFrames", "1.3.6.1.2.1.53.1.2.3.1.1.17", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortNullAddressedFramesEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortNullAddressedFramesEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortNullAddressedFrames", "1.3.6.1.2.1.53.1.2.3.1.1.18", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortIPMFramesEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortIPMFramesEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortIPMFrames", "1.3.6.1.2.1.53.1.2.3.1.1.19", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortOversizeFramesEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortOversizeFramesEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortOversizeFrames", "1.3.6.1.2.1.53.1.2.3.1.1.20", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortDataErrorFramesEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortDataErrorFramesEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortDataErrorFrames", "1.3.6.1.2.1.53.1.2.3.1.1.21", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortPriorityPromotionsEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortPriorityPromotionsEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortPriorityPromotions", "1.3.6.1.2.1.53.1.2.3.1.1.22", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortTransitionToTrainingsEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortTransitionToTrainingsEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortTransitionToTrainings", "1.3.6.1.2.1.53.1.2.3.1.1.23", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrPortLastChangeEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrPortLastChangeEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrPortLastChange", "1.3.6.1.2.1.53.1.2.3.1.1.24", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

            public static final class VgRptrAddrTrackEnt extends MIBEntry<DOT12RPTRMIBDef>
            {
                public final VgRptrAddrTrackRptrEnt vgRptrAddrTrackRptr;

                /** Currently unused*/
                public final VgRptrAddrTrackGroupEnt vgRptrAddrTrackGroup;

                /** Currently unused*/
                public final VgRptrAddrTrackPortEnt vgRptrAddrTrackPort;

                private VgRptrAddrTrackEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                {
                    super(mib, parent, "vgRptrAddrTrack", "1.3.6.1.2.1.53.1.3", false, false, false, false);
                    this.vgRptrAddrTrackRptr = new VgRptrAddrTrackRptrEnt(mib, this);
                    this.vgRptrAddrTrackGroup = new VgRptrAddrTrackGroupEnt(mib, this);
                    this.vgRptrAddrTrackPort = new VgRptrAddrTrackPortEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vgRptrAddrTrackRptr,
                        this.vgRptrAddrTrackGroup,
                        this.vgRptrAddrTrackPort
                    };
                }
                public static final class VgRptrAddrTrackRptrEnt extends MIBEntry<DOT12RPTRMIBDef>
                {
                    private VgRptrAddrTrackRptrEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                    {
                        super(mib, parent, "vgRptrAddrTrackRptr", "1.3.6.1.2.1.53.1.3.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VgRptrAddrTrackGroupEnt extends MIBEntry<DOT12RPTRMIBDef>
                {
                    private VgRptrAddrTrackGroupEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                    {
                        super(mib, parent, "vgRptrAddrTrackGroup", "1.3.6.1.2.1.53.1.3.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VgRptrAddrTrackPortEnt extends MIBEntry<DOT12RPTRMIBDef>
                {
                    public final VgRptrAddrTrackTableEnt vgRptrAddrTrackTable;

                    private VgRptrAddrTrackPortEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                    {
                        super(mib, parent, "vgRptrAddrTrackPort", "1.3.6.1.2.1.53.1.3.3", false, false, false, false);
                        this.vgRptrAddrTrackTable = new VgRptrAddrTrackTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vgRptrAddrTrackTable
                        };
                    }
                    public static final class VgRptrAddrTrackTableEnt extends MIBEntry<DOT12RPTRMIBDef>
                    {
                        public final VgRptrAddrTrackEntryEnt vgRptrAddrTrackEntry;

                        private VgRptrAddrTrackTableEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                        {
                            super(mib, parent, "vgRptrAddrTrackTable", "1.3.6.1.2.1.53.1.3.3.1", false, true, false, false);
                            this.vgRptrAddrTrackEntry = new VgRptrAddrTrackEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vgRptrAddrTrackEntry
                            };
                        }
                        public static final class VgRptrAddrTrackEntryEnt extends MIBEntry<DOT12RPTRMIBDef>
                        {
                            public final VgRptrAddrLastTrainedAddressEnt vgRptrAddrLastTrainedAddress;

                            public final VgRptrAddrTrainedAddrChangesEnt vgRptrAddrTrainedAddrChanges;

                            public final VgRptrRptrDetectedDupAddressEnt vgRptrRptrDetectedDupAddress;

                            public final VgRptrMgrDetectedDupAddressEnt vgRptrMgrDetectedDupAddress;

                            private VgRptrAddrTrackEntryEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                            {
                                super(mib, parent, "vgRptrAddrTrackEntry", "1.3.6.1.2.1.53.1.3.3.1.1", false, false, false, true);
                                this.vgRptrAddrLastTrainedAddress = new VgRptrAddrLastTrainedAddressEnt(mib, this);
                                this.vgRptrAddrTrainedAddrChanges = new VgRptrAddrTrainedAddrChangesEnt(mib, this);
                                this.vgRptrRptrDetectedDupAddress = new VgRptrRptrDetectedDupAddressEnt(mib, this);
                                this.vgRptrMgrDetectedDupAddress = new VgRptrMgrDetectedDupAddressEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.vgRptrAddrLastTrainedAddress,
                                    this.vgRptrAddrTrainedAddrChanges,
                                    this.vgRptrRptrDetectedDupAddress,
                                    this.vgRptrMgrDetectedDupAddress
                                };
                            }
                            public static final class VgRptrAddrLastTrainedAddressEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrAddrLastTrainedAddressEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrAddrLastTrainedAddress", "1.3.6.1.2.1.53.1.3.3.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrAddrTrainedAddrChangesEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrAddrTrainedAddrChangesEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrAddrTrainedAddrChanges", "1.3.6.1.2.1.53.1.3.3.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrRptrDetectedDupAddressEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrRptrDetectedDupAddressEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrRptrDetectedDupAddress", "1.3.6.1.2.1.53.1.3.3.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class VgRptrMgrDetectedDupAddressEnt extends MIBEntry<DOT12RPTRMIBDef>
                            {
                                private VgRptrMgrDetectedDupAddressEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                                {
                                    super(mib, parent, "vgRptrMgrDetectedDupAddress", "1.3.6.1.2.1.53.1.3.3.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

        }

        public static final class VgRptrTrapsEnt extends MIBEntry<DOT12RPTRMIBDef>
        {
            public final VgRptrTrapPrefixEnt vgRptrTrapPrefix;

            private VgRptrTrapsEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
            {
                super(mib, parent, "vgRptrTraps", "1.3.6.1.2.1.53.2", false, false, false, false);
                this.vgRptrTrapPrefix = new VgRptrTrapPrefixEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.vgRptrTrapPrefix
                };
            }
            public static final class VgRptrTrapPrefixEnt extends MIBEntry<DOT12RPTRMIBDef>
            {
                public final VgRptrHealthEnt vgRptrHealth;

                public final VgRptrResetEventEnt vgRptrResetEvent;

                private VgRptrTrapPrefixEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                {
                    super(mib, parent, "vgRptrTrapPrefix", "1.3.6.1.2.1.53.2.0", false, false, false, false);
                    this.vgRptrHealth = new VgRptrHealthEnt(mib, this);
                    this.vgRptrResetEvent = new VgRptrResetEventEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vgRptrHealth,
                        this.vgRptrResetEvent
                    };
                }
                public static final class VgRptrHealthEnt extends MIBEntry<DOT12RPTRMIBDef>
                {
                    private VgRptrHealthEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                    {
                        super(mib, parent, "vgRptrHealth", "1.3.6.1.2.1.53.2.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VgRptrResetEventEnt extends MIBEntry<DOT12RPTRMIBDef>
                {
                    private VgRptrResetEventEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                    {
                        super(mib, parent, "vgRptrResetEvent", "1.3.6.1.2.1.53.2.0.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class VgRptrConformanceEnt extends MIBEntry<DOT12RPTRMIBDef>
        {
            public final VgRptrCompliancesEnt vgRptrCompliances;

            public final VgRptrGroupsEnt vgRptrGroups;

            private VgRptrConformanceEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
            {
                super(mib, parent, "vgRptrConformance", "1.3.6.1.2.1.53.3", false, false, false, false);
                this.vgRptrCompliances = new VgRptrCompliancesEnt(mib, this);
                this.vgRptrGroups = new VgRptrGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.vgRptrCompliances,
                    this.vgRptrGroups
                };
            }
            public static final class VgRptrCompliancesEnt extends MIBEntry<DOT12RPTRMIBDef>
            {
                /** compliance statements*/
                public final VgRptrComplianceEnt vgRptrCompliance;

                private VgRptrCompliancesEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                {
                    super(mib, parent, "vgRptrCompliances", "1.3.6.1.2.1.53.3.1", false, false, false, false);
                    this.vgRptrCompliance = new VgRptrComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vgRptrCompliance
                    };
                }
                public static final class VgRptrComplianceEnt extends MIBEntry<DOT12RPTRMIBDef>
                {
                    private VgRptrComplianceEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                    {
                        super(mib, parent, "vgRptrCompliance", "1.3.6.1.2.1.53.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class VgRptrGroupsEnt extends MIBEntry<DOT12RPTRMIBDef>
            {
                /** units of conformance*/
                public final VgRptrConfigGroupEnt vgRptrConfigGroup;

                public final VgRptrStatsGroupEnt vgRptrStatsGroup;

                public final VgRptrStats64GroupEnt vgRptrStats64Group;

                public final VgRptrAddrGroupEnt vgRptrAddrGroup;

                public final VgRptrNotificationsGroupEnt vgRptrNotificationsGroup;

                private VgRptrGroupsEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                {
                    super(mib, parent, "vgRptrGroups", "1.3.6.1.2.1.53.3.2", false, false, false, false);
                    this.vgRptrConfigGroup = new VgRptrConfigGroupEnt(mib, this);
                    this.vgRptrStatsGroup = new VgRptrStatsGroupEnt(mib, this);
                    this.vgRptrStats64Group = new VgRptrStats64GroupEnt(mib, this);
                    this.vgRptrAddrGroup = new VgRptrAddrGroupEnt(mib, this);
                    this.vgRptrNotificationsGroup = new VgRptrNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vgRptrConfigGroup,
                        this.vgRptrStatsGroup,
                        this.vgRptrStats64Group,
                        this.vgRptrAddrGroup,
                        this.vgRptrNotificationsGroup
                    };
                }
                public static final class VgRptrConfigGroupEnt extends MIBEntry<DOT12RPTRMIBDef>
                {
                    private VgRptrConfigGroupEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                    {
                        super(mib, parent, "vgRptrConfigGroup", "1.3.6.1.2.1.53.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VgRptrStatsGroupEnt extends MIBEntry<DOT12RPTRMIBDef>
                {
                    private VgRptrStatsGroupEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                    {
                        super(mib, parent, "vgRptrStatsGroup", "1.3.6.1.2.1.53.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VgRptrStats64GroupEnt extends MIBEntry<DOT12RPTRMIBDef>
                {
                    private VgRptrStats64GroupEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                    {
                        super(mib, parent, "vgRptrStats64Group", "1.3.6.1.2.1.53.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VgRptrAddrGroupEnt extends MIBEntry<DOT12RPTRMIBDef>
                {
                    private VgRptrAddrGroupEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                    {
                        super(mib, parent, "vgRptrAddrGroup", "1.3.6.1.2.1.53.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class VgRptrNotificationsGroupEnt extends MIBEntry<DOT12RPTRMIBDef>
                {
                    private VgRptrNotificationsGroupEnt(DOT12RPTRMIBDef mib, MIBEntry<DOT12RPTRMIBDef> parent)
                    {
                        super(mib, parent, "vgRptrNotificationsGroup", "1.3.6.1.2.1.53.3.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
