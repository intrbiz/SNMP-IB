package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2580]
[RFC2579]
[RFC2863]
[RFC3811]
[RFC3411]
[RFC3289]
[RFC3291]*/
public final class MPLSTESTDMIBDef extends MIB
{
    public static final MPLSTESTDMIBDef MPLSTESTDMIB = new MPLSTESTDMIBDef();

    static { MIBs.getInstance().registerMIB(MPLSTESTDMIBDef.MPLSTESTDMIB); }

    /** June 3, 2004*/
    public final MplsTeStdMIBEnt mplsTeStdMIB;

    private MPLSTESTDMIBDef()
    {
        super("MPLS-TE-STD-MIB");
        this.mplsTeStdMIB = new MplsTeStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mplsTeStdMIB
        };
    }

    public static final class MplsTeStdMIBEnt extends MIBEntry<MPLSTESTDMIBDef>
    {
        /** Top level components of this MIB module.
traps*/
        public final MplsTeNotificationsEnt mplsTeNotifications;

        /** tables, scalars*/
        public final MplsTeScalarsEnt mplsTeScalars;

        public final MplsTeObjectsEnt mplsTeObjects;

        /** conformance*/
        public final MplsTeConformanceEnt mplsTeConformance;

        private MplsTeStdMIBEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
        {
            super(mib, parent, "mplsTeStdMIB", "1.3.6.1.2.1.10.166.3", false, false, false, false);
            this.mplsTeNotifications = new MplsTeNotificationsEnt(mib, this);
            this.mplsTeScalars = new MplsTeScalarsEnt(mib, this);
            this.mplsTeObjects = new MplsTeObjectsEnt(mib, this);
            this.mplsTeConformance = new MplsTeConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mplsTeNotifications,
                this.mplsTeScalars,
                this.mplsTeObjects,
                this.mplsTeConformance
            };
        }
        public static final class MplsTeNotificationsEnt extends MIBEntry<MPLSTESTDMIBDef>
        {
            public final MplsTunnelUpEnt mplsTunnelUp;

            public final MplsTunnelDownEnt mplsTunnelDown;

            public final MplsTunnelReroutedEnt mplsTunnelRerouted;

            public final MplsTunnelReoptimizedEnt mplsTunnelReoptimized;

            private MplsTeNotificationsEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
            {
                super(mib, parent, "mplsTeNotifications", "1.3.6.1.2.1.10.166.3.0", false, false, false, false);
                this.mplsTunnelUp = new MplsTunnelUpEnt(mib, this);
                this.mplsTunnelDown = new MplsTunnelDownEnt(mib, this);
                this.mplsTunnelRerouted = new MplsTunnelReroutedEnt(mib, this);
                this.mplsTunnelReoptimized = new MplsTunnelReoptimizedEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsTunnelUp,
                    this.mplsTunnelDown,
                    this.mplsTunnelRerouted,
                    this.mplsTunnelReoptimized
                };
            }
            public static final class MplsTunnelUpEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                private MplsTunnelUpEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelUp", "1.3.6.1.2.1.10.166.3.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsTunnelDownEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                private MplsTunnelDownEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelDown", "1.3.6.1.2.1.10.166.3.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsTunnelReroutedEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                private MplsTunnelReroutedEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelRerouted", "1.3.6.1.2.1.10.166.3.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsTunnelReoptimizedEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                private MplsTunnelReoptimizedEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelReoptimized", "1.3.6.1.2.1.10.166.3.0.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class MplsTeScalarsEnt extends MIBEntry<MPLSTESTDMIBDef>
        {
            /** MPLS Tunnel scalars.*/
            public final MplsTunnelConfiguredEnt mplsTunnelConfigured;

            public final MplsTunnelActiveEnt mplsTunnelActive;

            public final MplsTunnelTEDistProtoEnt mplsTunnelTEDistProto;

            public final MplsTunnelMaxHopsEnt mplsTunnelMaxHops;

            public final MplsTunnelNotificationMaxRateEnt mplsTunnelNotificationMaxRate;

            private MplsTeScalarsEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
            {
                super(mib, parent, "mplsTeScalars", "1.3.6.1.2.1.10.166.3.1", false, false, false, false);
                this.mplsTunnelConfigured = new MplsTunnelConfiguredEnt(mib, this);
                this.mplsTunnelActive = new MplsTunnelActiveEnt(mib, this);
                this.mplsTunnelTEDistProto = new MplsTunnelTEDistProtoEnt(mib, this);
                this.mplsTunnelMaxHops = new MplsTunnelMaxHopsEnt(mib, this);
                this.mplsTunnelNotificationMaxRate = new MplsTunnelNotificationMaxRateEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsTunnelConfigured,
                    this.mplsTunnelActive,
                    this.mplsTunnelTEDistProto,
                    this.mplsTunnelMaxHops,
                    this.mplsTunnelNotificationMaxRate
                };
            }
            public static final class MplsTunnelConfiguredEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                private MplsTunnelConfiguredEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelConfigured", "1.3.6.1.2.1.10.166.3.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsTunnelActiveEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                private MplsTunnelActiveEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelActive", "1.3.6.1.2.1.10.166.3.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsTunnelTEDistProtoEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                private MplsTunnelTEDistProtoEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelTEDistProto", "1.3.6.1.2.1.10.166.3.1.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsTunnelMaxHopsEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                private MplsTunnelMaxHopsEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelMaxHops", "1.3.6.1.2.1.10.166.3.1.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsTunnelNotificationMaxRateEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                private MplsTunnelNotificationMaxRateEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelNotificationMaxRate", "1.3.6.1.2.1.10.166.3.1.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class MplsTeObjectsEnt extends MIBEntry<MPLSTESTDMIBDef>
        {
            /** End of MPLS Tunnel scalars.

MPLS tunnel table.*/
            public final MplsTunnelIndexNextEnt mplsTunnelIndexNext;

            public final MplsTunnelTableEnt mplsTunnelTable;

            /** End of mplsTunnelTable*/
            public final MplsTunnelHopListIndexNextEnt mplsTunnelHopListIndexNext;

            public final MplsTunnelHopTableEnt mplsTunnelHopTable;

            /** End of mplsTunnelHopTable
Begin of mplsTunnelResourceTable*/
            public final MplsTunnelResourceIndexNextEnt mplsTunnelResourceIndexNext;

            public final MplsTunnelResourceTableEnt mplsTunnelResourceTable;

            /** End mplsTunnelResourceTableTunnel Actual Route Hop table.*/
            public final MplsTunnelARHopTableEnt mplsTunnelARHopTable;

            /** End of mplsTunnelARHopTable




Tunnel Computed Hop table.*/
            public final MplsTunnelCHopTableEnt mplsTunnelCHopTable;

            /** End of mplsTunnelCHopTable

MPLS Tunnel Performance Table.*/
            public final MplsTunnelPerfTableEnt mplsTunnelPerfTable;

            /** End of mplsTunnelPerfTable

CR-LDP Tunnel Resource Table*/
            public final MplsTunnelCRLDPResTableEnt mplsTunnelCRLDPResTable;

            /** Notifications.*/
            public final MplsTunnelNotificationEnableEnt mplsTunnelNotificationEnable;

            private MplsTeObjectsEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
            {
                super(mib, parent, "mplsTeObjects", "1.3.6.1.2.1.10.166.3.2", false, false, false, false);
                this.mplsTunnelIndexNext = new MplsTunnelIndexNextEnt(mib, this);
                this.mplsTunnelTable = new MplsTunnelTableEnt(mib, this);
                this.mplsTunnelHopListIndexNext = new MplsTunnelHopListIndexNextEnt(mib, this);
                this.mplsTunnelHopTable = new MplsTunnelHopTableEnt(mib, this);
                this.mplsTunnelResourceIndexNext = new MplsTunnelResourceIndexNextEnt(mib, this);
                this.mplsTunnelResourceTable = new MplsTunnelResourceTableEnt(mib, this);
                this.mplsTunnelARHopTable = new MplsTunnelARHopTableEnt(mib, this);
                this.mplsTunnelCHopTable = new MplsTunnelCHopTableEnt(mib, this);
                this.mplsTunnelPerfTable = new MplsTunnelPerfTableEnt(mib, this);
                this.mplsTunnelCRLDPResTable = new MplsTunnelCRLDPResTableEnt(mib, this);
                this.mplsTunnelNotificationEnable = new MplsTunnelNotificationEnableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsTunnelIndexNext,
                    this.mplsTunnelTable,
                    this.mplsTunnelHopListIndexNext,
                    this.mplsTunnelHopTable,
                    this.mplsTunnelResourceIndexNext,
                    this.mplsTunnelResourceTable,
                    this.mplsTunnelARHopTable,
                    this.mplsTunnelCHopTable,
                    this.mplsTunnelPerfTable,
                    this.mplsTunnelCRLDPResTable,
                    this.mplsTunnelNotificationEnable
                };
            }
            public static final class MplsTunnelIndexNextEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                private MplsTunnelIndexNextEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelIndexNext", "1.3.6.1.2.1.10.166.3.2.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsTunnelTableEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                public final MplsTunnelEntryEnt mplsTunnelEntry;

                private MplsTunnelTableEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelTable", "1.3.6.1.2.1.10.166.3.2.2", false, true, false, false);
                    this.mplsTunnelEntry = new MplsTunnelEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsTunnelEntry
                    };
                }
                public static final class MplsTunnelEntryEnt extends MIBEntry<MPLSTESTDMIBDef>
                {
                    public final MplsTunnelIndexEnt mplsTunnelIndex;

                    public final MplsTunnelInstanceEnt mplsTunnelInstance;

                    public final MplsTunnelIngressLSRIdEnt mplsTunnelIngressLSRId;

                    public final MplsTunnelEgressLSRIdEnt mplsTunnelEgressLSRId;

                    public final MplsTunnelNameEnt mplsTunnelName;

                    public final MplsTunnelDescrEnt mplsTunnelDescr;

                    public final MplsTunnelIsIfEnt mplsTunnelIsIf;

                    public final MplsTunnelIfIndexEnt mplsTunnelIfIndex;

                    public final MplsTunnelOwnerEnt mplsTunnelOwner;

                    public final MplsTunnelRoleEnt mplsTunnelRole;

                    public final MplsTunnelXCPointerEnt mplsTunnelXCPointer;

                    public final MplsTunnelSignallingProtoEnt mplsTunnelSignallingProto;

                    public final MplsTunnelSetupPrioEnt mplsTunnelSetupPrio;

                    public final MplsTunnelHoldingPrioEnt mplsTunnelHoldingPrio;

                    public final MplsTunnelSessionAttributesEnt mplsTunnelSessionAttributes;

                    public final MplsTunnelLocalProtectInUseEnt mplsTunnelLocalProtectInUse;

                    public final MplsTunnelResourcePointerEnt mplsTunnelResourcePointer;

                    public final MplsTunnelPrimaryInstanceEnt mplsTunnelPrimaryInstance;

                    public final MplsTunnelInstancePriorityEnt mplsTunnelInstancePriority;

                    public final MplsTunnelHopTableIndexEnt mplsTunnelHopTableIndex;

                    public final MplsTunnelPathInUseEnt mplsTunnelPathInUse;

                    public final MplsTunnelARHopTableIndexEnt mplsTunnelARHopTableIndex;

                    public final MplsTunnelCHopTableIndexEnt mplsTunnelCHopTableIndex;

                    public final MplsTunnelIncludeAnyAffinityEnt mplsTunnelIncludeAnyAffinity;

                    public final MplsTunnelIncludeAllAffinityEnt mplsTunnelIncludeAllAffinity;

                    public final MplsTunnelExcludeAnyAffinityEnt mplsTunnelExcludeAnyAffinity;

                    public final MplsTunnelTotalUpTimeEnt mplsTunnelTotalUpTime;

                    public final MplsTunnelInstanceUpTimeEnt mplsTunnelInstanceUpTime;

                    public final MplsTunnelPrimaryUpTimeEnt mplsTunnelPrimaryUpTime;

                    public final MplsTunnelPathChangesEnt mplsTunnelPathChanges;

                    public final MplsTunnelLastPathChangeEnt mplsTunnelLastPathChange;

                    public final MplsTunnelCreationTimeEnt mplsTunnelCreationTime;

                    public final MplsTunnelStateTransitionsEnt mplsTunnelStateTransitions;

                    public final MplsTunnelAdminStatusEnt mplsTunnelAdminStatus;

                    public final MplsTunnelOperStatusEnt mplsTunnelOperStatus;

                    public final MplsTunnelRowStatusEnt mplsTunnelRowStatus;

                    public final MplsTunnelStorageTypeEnt mplsTunnelStorageType;

                    private MplsTunnelEntryEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsTunnelEntry", "1.3.6.1.2.1.10.166.3.2.2.1", false, false, false, true);
                        this.mplsTunnelIndex = new MplsTunnelIndexEnt(mib, this);
                        this.mplsTunnelInstance = new MplsTunnelInstanceEnt(mib, this);
                        this.mplsTunnelIngressLSRId = new MplsTunnelIngressLSRIdEnt(mib, this);
                        this.mplsTunnelEgressLSRId = new MplsTunnelEgressLSRIdEnt(mib, this);
                        this.mplsTunnelName = new MplsTunnelNameEnt(mib, this);
                        this.mplsTunnelDescr = new MplsTunnelDescrEnt(mib, this);
                        this.mplsTunnelIsIf = new MplsTunnelIsIfEnt(mib, this);
                        this.mplsTunnelIfIndex = new MplsTunnelIfIndexEnt(mib, this);
                        this.mplsTunnelOwner = new MplsTunnelOwnerEnt(mib, this);
                        this.mplsTunnelRole = new MplsTunnelRoleEnt(mib, this);
                        this.mplsTunnelXCPointer = new MplsTunnelXCPointerEnt(mib, this);
                        this.mplsTunnelSignallingProto = new MplsTunnelSignallingProtoEnt(mib, this);
                        this.mplsTunnelSetupPrio = new MplsTunnelSetupPrioEnt(mib, this);
                        this.mplsTunnelHoldingPrio = new MplsTunnelHoldingPrioEnt(mib, this);
                        this.mplsTunnelSessionAttributes = new MplsTunnelSessionAttributesEnt(mib, this);
                        this.mplsTunnelLocalProtectInUse = new MplsTunnelLocalProtectInUseEnt(mib, this);
                        this.mplsTunnelResourcePointer = new MplsTunnelResourcePointerEnt(mib, this);
                        this.mplsTunnelPrimaryInstance = new MplsTunnelPrimaryInstanceEnt(mib, this);
                        this.mplsTunnelInstancePriority = new MplsTunnelInstancePriorityEnt(mib, this);
                        this.mplsTunnelHopTableIndex = new MplsTunnelHopTableIndexEnt(mib, this);
                        this.mplsTunnelPathInUse = new MplsTunnelPathInUseEnt(mib, this);
                        this.mplsTunnelARHopTableIndex = new MplsTunnelARHopTableIndexEnt(mib, this);
                        this.mplsTunnelCHopTableIndex = new MplsTunnelCHopTableIndexEnt(mib, this);
                        this.mplsTunnelIncludeAnyAffinity = new MplsTunnelIncludeAnyAffinityEnt(mib, this);
                        this.mplsTunnelIncludeAllAffinity = new MplsTunnelIncludeAllAffinityEnt(mib, this);
                        this.mplsTunnelExcludeAnyAffinity = new MplsTunnelExcludeAnyAffinityEnt(mib, this);
                        this.mplsTunnelTotalUpTime = new MplsTunnelTotalUpTimeEnt(mib, this);
                        this.mplsTunnelInstanceUpTime = new MplsTunnelInstanceUpTimeEnt(mib, this);
                        this.mplsTunnelPrimaryUpTime = new MplsTunnelPrimaryUpTimeEnt(mib, this);
                        this.mplsTunnelPathChanges = new MplsTunnelPathChangesEnt(mib, this);
                        this.mplsTunnelLastPathChange = new MplsTunnelLastPathChangeEnt(mib, this);
                        this.mplsTunnelCreationTime = new MplsTunnelCreationTimeEnt(mib, this);
                        this.mplsTunnelStateTransitions = new MplsTunnelStateTransitionsEnt(mib, this);
                        this.mplsTunnelAdminStatus = new MplsTunnelAdminStatusEnt(mib, this);
                        this.mplsTunnelOperStatus = new MplsTunnelOperStatusEnt(mib, this);
                        this.mplsTunnelRowStatus = new MplsTunnelRowStatusEnt(mib, this);
                        this.mplsTunnelStorageType = new MplsTunnelStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsTunnelIndex,
                            this.mplsTunnelInstance,
                            this.mplsTunnelIngressLSRId,
                            this.mplsTunnelEgressLSRId,
                            this.mplsTunnelName,
                            this.mplsTunnelDescr,
                            this.mplsTunnelIsIf,
                            this.mplsTunnelIfIndex,
                            this.mplsTunnelOwner,
                            this.mplsTunnelRole,
                            this.mplsTunnelXCPointer,
                            this.mplsTunnelSignallingProto,
                            this.mplsTunnelSetupPrio,
                            this.mplsTunnelHoldingPrio,
                            this.mplsTunnelSessionAttributes,
                            this.mplsTunnelLocalProtectInUse,
                            this.mplsTunnelResourcePointer,
                            this.mplsTunnelPrimaryInstance,
                            this.mplsTunnelInstancePriority,
                            this.mplsTunnelHopTableIndex,
                            this.mplsTunnelPathInUse,
                            this.mplsTunnelARHopTableIndex,
                            this.mplsTunnelCHopTableIndex,
                            this.mplsTunnelIncludeAnyAffinity,
                            this.mplsTunnelIncludeAllAffinity,
                            this.mplsTunnelExcludeAnyAffinity,
                            this.mplsTunnelTotalUpTime,
                            this.mplsTunnelInstanceUpTime,
                            this.mplsTunnelPrimaryUpTime,
                            this.mplsTunnelPathChanges,
                            this.mplsTunnelLastPathChange,
                            this.mplsTunnelCreationTime,
                            this.mplsTunnelStateTransitions,
                            this.mplsTunnelAdminStatus,
                            this.mplsTunnelOperStatus,
                            this.mplsTunnelRowStatus,
                            this.mplsTunnelStorageType
                        };
                    }
                    public static final class MplsTunnelIndexEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelIndexEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelIndex", "1.3.6.1.2.1.10.166.3.2.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelInstanceEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelInstanceEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelInstance", "1.3.6.1.2.1.10.166.3.2.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelIngressLSRIdEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelIngressLSRIdEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelIngressLSRId", "1.3.6.1.2.1.10.166.3.2.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelEgressLSRIdEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelEgressLSRIdEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelEgressLSRId", "1.3.6.1.2.1.10.166.3.2.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelNameEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelNameEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelName", "1.3.6.1.2.1.10.166.3.2.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelDescrEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelDescrEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelDescr", "1.3.6.1.2.1.10.166.3.2.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelIsIfEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelIsIfEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelIsIf", "1.3.6.1.2.1.10.166.3.2.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelIfIndexEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelIfIndexEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelIfIndex", "1.3.6.1.2.1.10.166.3.2.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelOwnerEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelOwnerEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelOwner", "1.3.6.1.2.1.10.166.3.2.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelRoleEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelRoleEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelRole", "1.3.6.1.2.1.10.166.3.2.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelXCPointerEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelXCPointerEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelXCPointer", "1.3.6.1.2.1.10.166.3.2.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelSignallingProtoEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelSignallingProtoEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelSignallingProto", "1.3.6.1.2.1.10.166.3.2.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelSetupPrioEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelSetupPrioEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelSetupPrio", "1.3.6.1.2.1.10.166.3.2.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelHoldingPrioEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelHoldingPrioEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelHoldingPrio", "1.3.6.1.2.1.10.166.3.2.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelSessionAttributesEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelSessionAttributesEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelSessionAttributes", "1.3.6.1.2.1.10.166.3.2.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelLocalProtectInUseEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelLocalProtectInUseEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelLocalProtectInUse", "1.3.6.1.2.1.10.166.3.2.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelResourcePointerEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelResourcePointerEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelResourcePointer", "1.3.6.1.2.1.10.166.3.2.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelPrimaryInstanceEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelPrimaryInstanceEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelPrimaryInstance", "1.3.6.1.2.1.10.166.3.2.2.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelInstancePriorityEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelInstancePriorityEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelInstancePriority", "1.3.6.1.2.1.10.166.3.2.2.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelHopTableIndexEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelHopTableIndexEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelHopTableIndex", "1.3.6.1.2.1.10.166.3.2.2.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelPathInUseEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelPathInUseEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelPathInUse", "1.3.6.1.2.1.10.166.3.2.2.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelARHopTableIndexEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelARHopTableIndexEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelARHopTableIndex", "1.3.6.1.2.1.10.166.3.2.2.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelCHopTableIndexEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCHopTableIndexEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCHopTableIndex", "1.3.6.1.2.1.10.166.3.2.2.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelIncludeAnyAffinityEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelIncludeAnyAffinityEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelIncludeAnyAffinity", "1.3.6.1.2.1.10.166.3.2.2.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelIncludeAllAffinityEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelIncludeAllAffinityEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelIncludeAllAffinity", "1.3.6.1.2.1.10.166.3.2.2.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelExcludeAnyAffinityEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelExcludeAnyAffinityEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelExcludeAnyAffinity", "1.3.6.1.2.1.10.166.3.2.2.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelTotalUpTimeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelTotalUpTimeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelTotalUpTime", "1.3.6.1.2.1.10.166.3.2.2.1.27", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelInstanceUpTimeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelInstanceUpTimeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelInstanceUpTime", "1.3.6.1.2.1.10.166.3.2.2.1.28", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelPrimaryUpTimeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelPrimaryUpTimeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelPrimaryUpTime", "1.3.6.1.2.1.10.166.3.2.2.1.29", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelPathChangesEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelPathChangesEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelPathChanges", "1.3.6.1.2.1.10.166.3.2.2.1.30", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelLastPathChangeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelLastPathChangeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelLastPathChange", "1.3.6.1.2.1.10.166.3.2.2.1.31", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelCreationTimeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCreationTimeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCreationTime", "1.3.6.1.2.1.10.166.3.2.2.1.32", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelStateTransitionsEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelStateTransitionsEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelStateTransitions", "1.3.6.1.2.1.10.166.3.2.2.1.33", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelAdminStatusEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelAdminStatusEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelAdminStatus", "1.3.6.1.2.1.10.166.3.2.2.1.34", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelOperStatusEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelOperStatusEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelOperStatus", "1.3.6.1.2.1.10.166.3.2.2.1.35", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelRowStatusEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelRowStatusEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelRowStatus", "1.3.6.1.2.1.10.166.3.2.2.1.36", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelStorageTypeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelStorageTypeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelStorageType", "1.3.6.1.2.1.10.166.3.2.2.1.37", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsTunnelHopListIndexNextEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                private MplsTunnelHopListIndexNextEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelHopListIndexNext", "1.3.6.1.2.1.10.166.3.2.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsTunnelHopTableEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                public final MplsTunnelHopEntryEnt mplsTunnelHopEntry;

                private MplsTunnelHopTableEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelHopTable", "1.3.6.1.2.1.10.166.3.2.4", false, true, false, false);
                    this.mplsTunnelHopEntry = new MplsTunnelHopEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsTunnelHopEntry
                    };
                }
                public static final class MplsTunnelHopEntryEnt extends MIBEntry<MPLSTESTDMIBDef>
                {
                    public final MplsTunnelHopListIndexEnt mplsTunnelHopListIndex;

                    public final MplsTunnelHopPathOptionIndexEnt mplsTunnelHopPathOptionIndex;

                    public final MplsTunnelHopIndexEnt mplsTunnelHopIndex;

                    public final MplsTunnelHopAddrTypeEnt mplsTunnelHopAddrType;

                    /** IPv4 address 0.0.0.0*/
                    public final MplsTunnelHopIpAddrEnt mplsTunnelHopIpAddr;

                    public final MplsTunnelHopIpPrefixLenEnt mplsTunnelHopIpPrefixLen;

                    public final MplsTunnelHopAsNumberEnt mplsTunnelHopAsNumber;

                    public final MplsTunnelHopAddrUnnumEnt mplsTunnelHopAddrUnnum;

                    public final MplsTunnelHopLspIdEnt mplsTunnelHopLspId;

                    public final MplsTunnelHopTypeEnt mplsTunnelHopType;

                    public final MplsTunnelHopIncludeEnt mplsTunnelHopInclude;

                    public final MplsTunnelHopPathOptionNameEnt mplsTunnelHopPathOptionName;

                    public final MplsTunnelHopEntryPathCompEnt mplsTunnelHopEntryPathComp;

                    public final MplsTunnelHopRowStatusEnt mplsTunnelHopRowStatus;

                    public final MplsTunnelHopStorageTypeEnt mplsTunnelHopStorageType;

                    private MplsTunnelHopEntryEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsTunnelHopEntry", "1.3.6.1.2.1.10.166.3.2.4.1", false, false, false, true);
                        this.mplsTunnelHopListIndex = new MplsTunnelHopListIndexEnt(mib, this);
                        this.mplsTunnelHopPathOptionIndex = new MplsTunnelHopPathOptionIndexEnt(mib, this);
                        this.mplsTunnelHopIndex = new MplsTunnelHopIndexEnt(mib, this);
                        this.mplsTunnelHopAddrType = new MplsTunnelHopAddrTypeEnt(mib, this);
                        this.mplsTunnelHopIpAddr = new MplsTunnelHopIpAddrEnt(mib, this);
                        this.mplsTunnelHopIpPrefixLen = new MplsTunnelHopIpPrefixLenEnt(mib, this);
                        this.mplsTunnelHopAsNumber = new MplsTunnelHopAsNumberEnt(mib, this);
                        this.mplsTunnelHopAddrUnnum = new MplsTunnelHopAddrUnnumEnt(mib, this);
                        this.mplsTunnelHopLspId = new MplsTunnelHopLspIdEnt(mib, this);
                        this.mplsTunnelHopType = new MplsTunnelHopTypeEnt(mib, this);
                        this.mplsTunnelHopInclude = new MplsTunnelHopIncludeEnt(mib, this);
                        this.mplsTunnelHopPathOptionName = new MplsTunnelHopPathOptionNameEnt(mib, this);
                        this.mplsTunnelHopEntryPathComp = new MplsTunnelHopEntryPathCompEnt(mib, this);
                        this.mplsTunnelHopRowStatus = new MplsTunnelHopRowStatusEnt(mib, this);
                        this.mplsTunnelHopStorageType = new MplsTunnelHopStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsTunnelHopListIndex,
                            this.mplsTunnelHopPathOptionIndex,
                            this.mplsTunnelHopIndex,
                            this.mplsTunnelHopAddrType,
                            this.mplsTunnelHopIpAddr,
                            this.mplsTunnelHopIpPrefixLen,
                            this.mplsTunnelHopAsNumber,
                            this.mplsTunnelHopAddrUnnum,
                            this.mplsTunnelHopLspId,
                            this.mplsTunnelHopType,
                            this.mplsTunnelHopInclude,
                            this.mplsTunnelHopPathOptionName,
                            this.mplsTunnelHopEntryPathComp,
                            this.mplsTunnelHopRowStatus,
                            this.mplsTunnelHopStorageType
                        };
                    }
                    public static final class MplsTunnelHopListIndexEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelHopListIndexEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelHopListIndex", "1.3.6.1.2.1.10.166.3.2.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelHopPathOptionIndexEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelHopPathOptionIndexEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelHopPathOptionIndex", "1.3.6.1.2.1.10.166.3.2.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelHopIndexEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelHopIndexEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelHopIndex", "1.3.6.1.2.1.10.166.3.2.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelHopAddrTypeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelHopAddrTypeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelHopAddrType", "1.3.6.1.2.1.10.166.3.2.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelHopIpAddrEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelHopIpAddrEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelHopIpAddr", "1.3.6.1.2.1.10.166.3.2.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelHopIpPrefixLenEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelHopIpPrefixLenEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelHopIpPrefixLen", "1.3.6.1.2.1.10.166.3.2.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelHopAsNumberEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelHopAsNumberEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelHopAsNumber", "1.3.6.1.2.1.10.166.3.2.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelHopAddrUnnumEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelHopAddrUnnumEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelHopAddrUnnum", "1.3.6.1.2.1.10.166.3.2.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelHopLspIdEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelHopLspIdEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelHopLspId", "1.3.6.1.2.1.10.166.3.2.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelHopTypeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelHopTypeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelHopType", "1.3.6.1.2.1.10.166.3.2.4.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelHopIncludeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelHopIncludeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelHopInclude", "1.3.6.1.2.1.10.166.3.2.4.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelHopPathOptionNameEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelHopPathOptionNameEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelHopPathOptionName", "1.3.6.1.2.1.10.166.3.2.4.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelHopEntryPathCompEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelHopEntryPathCompEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelHopEntryPathComp", "1.3.6.1.2.1.10.166.3.2.4.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelHopRowStatusEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelHopRowStatusEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelHopRowStatus", "1.3.6.1.2.1.10.166.3.2.4.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelHopStorageTypeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelHopStorageTypeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelHopStorageType", "1.3.6.1.2.1.10.166.3.2.4.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsTunnelResourceIndexNextEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                private MplsTunnelResourceIndexNextEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelResourceIndexNext", "1.3.6.1.2.1.10.166.3.2.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsTunnelResourceTableEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                public final MplsTunnelResourceEntryEnt mplsTunnelResourceEntry;

                private MplsTunnelResourceTableEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelResourceTable", "1.3.6.1.2.1.10.166.3.2.6", false, true, false, false);
                    this.mplsTunnelResourceEntry = new MplsTunnelResourceEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsTunnelResourceEntry
                    };
                }
                public static final class MplsTunnelResourceEntryEnt extends MIBEntry<MPLSTESTDMIBDef>
                {
                    public final MplsTunnelResourceIndexEnt mplsTunnelResourceIndex;

                    public final MplsTunnelResourceMaxRateEnt mplsTunnelResourceMaxRate;

                    public final MplsTunnelResourceMeanRateEnt mplsTunnelResourceMeanRate;

                    public final MplsTunnelResourceMaxBurstSizeEnt mplsTunnelResourceMaxBurstSize;

                    public final MplsTunnelResourceMeanBurstSizeEnt mplsTunnelResourceMeanBurstSize;

                    public final MplsTunnelResourceExBurstSizeEnt mplsTunnelResourceExBurstSize;

                    public final MplsTunnelResourceFrequencyEnt mplsTunnelResourceFrequency;

                    public final MplsTunnelResourceWeightEnt mplsTunnelResourceWeight;

                    public final MplsTunnelResourceRowStatusEnt mplsTunnelResourceRowStatus;

                    public final MplsTunnelResourceStorageTypeEnt mplsTunnelResourceStorageType;

                    private MplsTunnelResourceEntryEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsTunnelResourceEntry", "1.3.6.1.2.1.10.166.3.2.6.1", false, false, false, true);
                        this.mplsTunnelResourceIndex = new MplsTunnelResourceIndexEnt(mib, this);
                        this.mplsTunnelResourceMaxRate = new MplsTunnelResourceMaxRateEnt(mib, this);
                        this.mplsTunnelResourceMeanRate = new MplsTunnelResourceMeanRateEnt(mib, this);
                        this.mplsTunnelResourceMaxBurstSize = new MplsTunnelResourceMaxBurstSizeEnt(mib, this);
                        this.mplsTunnelResourceMeanBurstSize = new MplsTunnelResourceMeanBurstSizeEnt(mib, this);
                        this.mplsTunnelResourceExBurstSize = new MplsTunnelResourceExBurstSizeEnt(mib, this);
                        this.mplsTunnelResourceFrequency = new MplsTunnelResourceFrequencyEnt(mib, this);
                        this.mplsTunnelResourceWeight = new MplsTunnelResourceWeightEnt(mib, this);
                        this.mplsTunnelResourceRowStatus = new MplsTunnelResourceRowStatusEnt(mib, this);
                        this.mplsTunnelResourceStorageType = new MplsTunnelResourceStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsTunnelResourceIndex,
                            this.mplsTunnelResourceMaxRate,
                            this.mplsTunnelResourceMeanRate,
                            this.mplsTunnelResourceMaxBurstSize,
                            this.mplsTunnelResourceMeanBurstSize,
                            this.mplsTunnelResourceExBurstSize,
                            this.mplsTunnelResourceFrequency,
                            this.mplsTunnelResourceWeight,
                            this.mplsTunnelResourceRowStatus,
                            this.mplsTunnelResourceStorageType
                        };
                    }
                    public static final class MplsTunnelResourceIndexEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelResourceIndexEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelResourceIndex", "1.3.6.1.2.1.10.166.3.2.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelResourceMaxRateEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelResourceMaxRateEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelResourceMaxRate", "1.3.6.1.2.1.10.166.3.2.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelResourceMeanRateEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelResourceMeanRateEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelResourceMeanRate", "1.3.6.1.2.1.10.166.3.2.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelResourceMaxBurstSizeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelResourceMaxBurstSizeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelResourceMaxBurstSize", "1.3.6.1.2.1.10.166.3.2.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelResourceMeanBurstSizeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelResourceMeanBurstSizeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelResourceMeanBurstSize", "1.3.6.1.2.1.10.166.3.2.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelResourceExBurstSizeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelResourceExBurstSizeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelResourceExBurstSize", "1.3.6.1.2.1.10.166.3.2.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelResourceFrequencyEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelResourceFrequencyEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelResourceFrequency", "1.3.6.1.2.1.10.166.3.2.6.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelResourceWeightEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelResourceWeightEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelResourceWeight", "1.3.6.1.2.1.10.166.3.2.6.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelResourceRowStatusEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelResourceRowStatusEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelResourceRowStatus", "1.3.6.1.2.1.10.166.3.2.6.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelResourceStorageTypeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelResourceStorageTypeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelResourceStorageType", "1.3.6.1.2.1.10.166.3.2.6.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsTunnelARHopTableEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                public final MplsTunnelARHopEntryEnt mplsTunnelARHopEntry;

                private MplsTunnelARHopTableEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelARHopTable", "1.3.6.1.2.1.10.166.3.2.7", false, true, false, false);
                    this.mplsTunnelARHopEntry = new MplsTunnelARHopEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsTunnelARHopEntry
                    };
                }
                public static final class MplsTunnelARHopEntryEnt extends MIBEntry<MPLSTESTDMIBDef>
                {
                    public final MplsTunnelARHopListIndexEnt mplsTunnelARHopListIndex;

                    public final MplsTunnelARHopIndexEnt mplsTunnelARHopIndex;

                    public final MplsTunnelARHopAddrTypeEnt mplsTunnelARHopAddrType;

                    /** IPv4 address 0.0.0.0*/
                    public final MplsTunnelARHopIpAddrEnt mplsTunnelARHopIpAddr;

                    public final MplsTunnelARHopAddrUnnumEnt mplsTunnelARHopAddrUnnum;

                    public final MplsTunnelARHopLspIdEnt mplsTunnelARHopLspId;

                    private MplsTunnelARHopEntryEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsTunnelARHopEntry", "1.3.6.1.2.1.10.166.3.2.7.1", false, false, false, true);
                        this.mplsTunnelARHopListIndex = new MplsTunnelARHopListIndexEnt(mib, this);
                        this.mplsTunnelARHopIndex = new MplsTunnelARHopIndexEnt(mib, this);
                        this.mplsTunnelARHopAddrType = new MplsTunnelARHopAddrTypeEnt(mib, this);
                        this.mplsTunnelARHopIpAddr = new MplsTunnelARHopIpAddrEnt(mib, this);
                        this.mplsTunnelARHopAddrUnnum = new MplsTunnelARHopAddrUnnumEnt(mib, this);
                        this.mplsTunnelARHopLspId = new MplsTunnelARHopLspIdEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsTunnelARHopListIndex,
                            this.mplsTunnelARHopIndex,
                            this.mplsTunnelARHopAddrType,
                            this.mplsTunnelARHopIpAddr,
                            this.mplsTunnelARHopAddrUnnum,
                            this.mplsTunnelARHopLspId
                        };
                    }
                    public static final class MplsTunnelARHopListIndexEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelARHopListIndexEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelARHopListIndex", "1.3.6.1.2.1.10.166.3.2.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelARHopIndexEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelARHopIndexEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelARHopIndex", "1.3.6.1.2.1.10.166.3.2.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelARHopAddrTypeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelARHopAddrTypeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelARHopAddrType", "1.3.6.1.2.1.10.166.3.2.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelARHopIpAddrEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelARHopIpAddrEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelARHopIpAddr", "1.3.6.1.2.1.10.166.3.2.7.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelARHopAddrUnnumEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelARHopAddrUnnumEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelARHopAddrUnnum", "1.3.6.1.2.1.10.166.3.2.7.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelARHopLspIdEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelARHopLspIdEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelARHopLspId", "1.3.6.1.2.1.10.166.3.2.7.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsTunnelCHopTableEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                public final MplsTunnelCHopEntryEnt mplsTunnelCHopEntry;

                private MplsTunnelCHopTableEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelCHopTable", "1.3.6.1.2.1.10.166.3.2.8", false, true, false, false);
                    this.mplsTunnelCHopEntry = new MplsTunnelCHopEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsTunnelCHopEntry
                    };
                }
                public static final class MplsTunnelCHopEntryEnt extends MIBEntry<MPLSTESTDMIBDef>
                {
                    public final MplsTunnelCHopListIndexEnt mplsTunnelCHopListIndex;

                    public final MplsTunnelCHopIndexEnt mplsTunnelCHopIndex;

                    public final MplsTunnelCHopAddrTypeEnt mplsTunnelCHopAddrType;

                    /** IPv4 address 0.0.0.0*/
                    public final MplsTunnelCHopIpAddrEnt mplsTunnelCHopIpAddr;

                    public final MplsTunnelCHopIpPrefixLenEnt mplsTunnelCHopIpPrefixLen;

                    public final MplsTunnelCHopAsNumberEnt mplsTunnelCHopAsNumber;

                    public final MplsTunnelCHopAddrUnnumEnt mplsTunnelCHopAddrUnnum;

                    public final MplsTunnelCHopLspIdEnt mplsTunnelCHopLspId;

                    public final MplsTunnelCHopTypeEnt mplsTunnelCHopType;

                    private MplsTunnelCHopEntryEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsTunnelCHopEntry", "1.3.6.1.2.1.10.166.3.2.8.1", false, false, false, true);
                        this.mplsTunnelCHopListIndex = new MplsTunnelCHopListIndexEnt(mib, this);
                        this.mplsTunnelCHopIndex = new MplsTunnelCHopIndexEnt(mib, this);
                        this.mplsTunnelCHopAddrType = new MplsTunnelCHopAddrTypeEnt(mib, this);
                        this.mplsTunnelCHopIpAddr = new MplsTunnelCHopIpAddrEnt(mib, this);
                        this.mplsTunnelCHopIpPrefixLen = new MplsTunnelCHopIpPrefixLenEnt(mib, this);
                        this.mplsTunnelCHopAsNumber = new MplsTunnelCHopAsNumberEnt(mib, this);
                        this.mplsTunnelCHopAddrUnnum = new MplsTunnelCHopAddrUnnumEnt(mib, this);
                        this.mplsTunnelCHopLspId = new MplsTunnelCHopLspIdEnt(mib, this);
                        this.mplsTunnelCHopType = new MplsTunnelCHopTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsTunnelCHopListIndex,
                            this.mplsTunnelCHopIndex,
                            this.mplsTunnelCHopAddrType,
                            this.mplsTunnelCHopIpAddr,
                            this.mplsTunnelCHopIpPrefixLen,
                            this.mplsTunnelCHopAsNumber,
                            this.mplsTunnelCHopAddrUnnum,
                            this.mplsTunnelCHopLspId,
                            this.mplsTunnelCHopType
                        };
                    }
                    public static final class MplsTunnelCHopListIndexEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCHopListIndexEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCHopListIndex", "1.3.6.1.2.1.10.166.3.2.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelCHopIndexEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCHopIndexEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCHopIndex", "1.3.6.1.2.1.10.166.3.2.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelCHopAddrTypeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCHopAddrTypeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCHopAddrType", "1.3.6.1.2.1.10.166.3.2.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelCHopIpAddrEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCHopIpAddrEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCHopIpAddr", "1.3.6.1.2.1.10.166.3.2.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelCHopIpPrefixLenEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCHopIpPrefixLenEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCHopIpPrefixLen", "1.3.6.1.2.1.10.166.3.2.8.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelCHopAsNumberEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCHopAsNumberEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCHopAsNumber", "1.3.6.1.2.1.10.166.3.2.8.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelCHopAddrUnnumEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCHopAddrUnnumEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCHopAddrUnnum", "1.3.6.1.2.1.10.166.3.2.8.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelCHopLspIdEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCHopLspIdEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCHopLspId", "1.3.6.1.2.1.10.166.3.2.8.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelCHopTypeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCHopTypeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCHopType", "1.3.6.1.2.1.10.166.3.2.8.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsTunnelPerfTableEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                public final MplsTunnelPerfEntryEnt mplsTunnelPerfEntry;

                private MplsTunnelPerfTableEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelPerfTable", "1.3.6.1.2.1.10.166.3.2.9", false, true, false, false);
                    this.mplsTunnelPerfEntry = new MplsTunnelPerfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsTunnelPerfEntry
                    };
                }
                public static final class MplsTunnelPerfEntryEnt extends MIBEntry<MPLSTESTDMIBDef>
                {
                    public final MplsTunnelPerfPacketsEnt mplsTunnelPerfPackets;

                    public final MplsTunnelPerfHCPacketsEnt mplsTunnelPerfHCPackets;

                    public final MplsTunnelPerfErrorsEnt mplsTunnelPerfErrors;

                    public final MplsTunnelPerfBytesEnt mplsTunnelPerfBytes;

                    public final MplsTunnelPerfHCBytesEnt mplsTunnelPerfHCBytes;

                    private MplsTunnelPerfEntryEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsTunnelPerfEntry", "1.3.6.1.2.1.10.166.3.2.9.1", false, false, false, true);
                        this.mplsTunnelPerfPackets = new MplsTunnelPerfPacketsEnt(mib, this);
                        this.mplsTunnelPerfHCPackets = new MplsTunnelPerfHCPacketsEnt(mib, this);
                        this.mplsTunnelPerfErrors = new MplsTunnelPerfErrorsEnt(mib, this);
                        this.mplsTunnelPerfBytes = new MplsTunnelPerfBytesEnt(mib, this);
                        this.mplsTunnelPerfHCBytes = new MplsTunnelPerfHCBytesEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsTunnelPerfPackets,
                            this.mplsTunnelPerfHCPackets,
                            this.mplsTunnelPerfErrors,
                            this.mplsTunnelPerfBytes,
                            this.mplsTunnelPerfHCBytes
                        };
                    }
                    public static final class MplsTunnelPerfPacketsEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelPerfPacketsEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelPerfPackets", "1.3.6.1.2.1.10.166.3.2.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelPerfHCPacketsEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelPerfHCPacketsEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelPerfHCPackets", "1.3.6.1.2.1.10.166.3.2.9.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelPerfErrorsEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelPerfErrorsEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelPerfErrors", "1.3.6.1.2.1.10.166.3.2.9.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelPerfBytesEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelPerfBytesEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelPerfBytes", "1.3.6.1.2.1.10.166.3.2.9.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelPerfHCBytesEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelPerfHCBytesEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelPerfHCBytes", "1.3.6.1.2.1.10.166.3.2.9.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsTunnelCRLDPResTableEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                public final MplsTunnelCRLDPResEntryEnt mplsTunnelCRLDPResEntry;

                private MplsTunnelCRLDPResTableEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelCRLDPResTable", "1.3.6.1.2.1.10.166.3.2.10", false, true, false, false);
                    this.mplsTunnelCRLDPResEntry = new MplsTunnelCRLDPResEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsTunnelCRLDPResEntry
                    };
                }
                public static final class MplsTunnelCRLDPResEntryEnt extends MIBEntry<MPLSTESTDMIBDef>
                {
                    public final MplsTunnelCRLDPResMeanBurstSizeEnt mplsTunnelCRLDPResMeanBurstSize;

                    public final MplsTunnelCRLDPResExBurstSizeEnt mplsTunnelCRLDPResExBurstSize;

                    public final MplsTunnelCRLDPResFrequencyEnt mplsTunnelCRLDPResFrequency;

                    public final MplsTunnelCRLDPResWeightEnt mplsTunnelCRLDPResWeight;

                    public final MplsTunnelCRLDPResFlagsEnt mplsTunnelCRLDPResFlags;

                    public final MplsTunnelCRLDPResRowStatusEnt mplsTunnelCRLDPResRowStatus;

                    public final MplsTunnelCRLDPResStorageTypeEnt mplsTunnelCRLDPResStorageType;

                    private MplsTunnelCRLDPResEntryEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsTunnelCRLDPResEntry", "1.3.6.1.2.1.10.166.3.2.10.1", false, false, false, true);
                        this.mplsTunnelCRLDPResMeanBurstSize = new MplsTunnelCRLDPResMeanBurstSizeEnt(mib, this);
                        this.mplsTunnelCRLDPResExBurstSize = new MplsTunnelCRLDPResExBurstSizeEnt(mib, this);
                        this.mplsTunnelCRLDPResFrequency = new MplsTunnelCRLDPResFrequencyEnt(mib, this);
                        this.mplsTunnelCRLDPResWeight = new MplsTunnelCRLDPResWeightEnt(mib, this);
                        this.mplsTunnelCRLDPResFlags = new MplsTunnelCRLDPResFlagsEnt(mib, this);
                        this.mplsTunnelCRLDPResRowStatus = new MplsTunnelCRLDPResRowStatusEnt(mib, this);
                        this.mplsTunnelCRLDPResStorageType = new MplsTunnelCRLDPResStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsTunnelCRLDPResMeanBurstSize,
                            this.mplsTunnelCRLDPResExBurstSize,
                            this.mplsTunnelCRLDPResFrequency,
                            this.mplsTunnelCRLDPResWeight,
                            this.mplsTunnelCRLDPResFlags,
                            this.mplsTunnelCRLDPResRowStatus,
                            this.mplsTunnelCRLDPResStorageType
                        };
                    }
                    public static final class MplsTunnelCRLDPResMeanBurstSizeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCRLDPResMeanBurstSizeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCRLDPResMeanBurstSize", "1.3.6.1.2.1.10.166.3.2.10.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelCRLDPResExBurstSizeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCRLDPResExBurstSizeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCRLDPResExBurstSize", "1.3.6.1.2.1.10.166.3.2.10.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelCRLDPResFrequencyEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCRLDPResFrequencyEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCRLDPResFrequency", "1.3.6.1.2.1.10.166.3.2.10.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelCRLDPResWeightEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCRLDPResWeightEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCRLDPResWeight", "1.3.6.1.2.1.10.166.3.2.10.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelCRLDPResFlagsEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCRLDPResFlagsEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCRLDPResFlags", "1.3.6.1.2.1.10.166.3.2.10.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelCRLDPResRowStatusEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCRLDPResRowStatusEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCRLDPResRowStatus", "1.3.6.1.2.1.10.166.3.2.10.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsTunnelCRLDPResStorageTypeEnt extends MIBEntry<MPLSTESTDMIBDef>
                    {
                        private MplsTunnelCRLDPResStorageTypeEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsTunnelCRLDPResStorageType", "1.3.6.1.2.1.10.166.3.2.10.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsTunnelNotificationEnableEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                private MplsTunnelNotificationEnableEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTunnelNotificationEnable", "1.3.6.1.2.1.10.166.3.2.11", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class MplsTeConformanceEnt extends MIBEntry<MPLSTESTDMIBDef>
        {
            /** End of notifications.


Module compliance.*/
            public final MplsTeGroupsEnt mplsTeGroups;

            public final MplsTeCompliancesEnt mplsTeCompliances;

            private MplsTeConformanceEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
            {
                super(mib, parent, "mplsTeConformance", "1.3.6.1.2.1.10.166.3.3", false, false, false, false);
                this.mplsTeGroups = new MplsTeGroupsEnt(mib, this);
                this.mplsTeCompliances = new MplsTeCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsTeGroups,
                    this.mplsTeCompliances
                };
            }
            public static final class MplsTeGroupsEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                /** Units of conformance.*/
                public final MplsTunnelGroupEnt mplsTunnelGroup;

                public final MplsTunnelManualGroupEnt mplsTunnelManualGroup;

                public final MplsTunnelSignaledGroupEnt mplsTunnelSignaledGroup;

                public final MplsTunnelScalarGroupEnt mplsTunnelScalarGroup;

                public final MplsTunnelIsIntfcGroupEnt mplsTunnelIsIntfcGroup;

                public final MplsTunnelIsNotIntfcGroupEnt mplsTunnelIsNotIntfcGroup;

                public final MplsTunnelCRLDPResOptionalGroupEnt mplsTunnelCRLDPResOptionalGroup;

                public final MplsTeNotificationGroupEnt mplsTeNotificationGroup;

                private MplsTeGroupsEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTeGroups", "1.3.6.1.2.1.10.166.3.3.1", false, false, false, false);
                    this.mplsTunnelGroup = new MplsTunnelGroupEnt(mib, this);
                    this.mplsTunnelManualGroup = new MplsTunnelManualGroupEnt(mib, this);
                    this.mplsTunnelSignaledGroup = new MplsTunnelSignaledGroupEnt(mib, this);
                    this.mplsTunnelScalarGroup = new MplsTunnelScalarGroupEnt(mib, this);
                    this.mplsTunnelIsIntfcGroup = new MplsTunnelIsIntfcGroupEnt(mib, this);
                    this.mplsTunnelIsNotIntfcGroup = new MplsTunnelIsNotIntfcGroupEnt(mib, this);
                    this.mplsTunnelCRLDPResOptionalGroup = new MplsTunnelCRLDPResOptionalGroupEnt(mib, this);
                    this.mplsTeNotificationGroup = new MplsTeNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsTunnelGroup,
                        this.mplsTunnelManualGroup,
                        this.mplsTunnelSignaledGroup,
                        this.mplsTunnelScalarGroup,
                        this.mplsTunnelIsIntfcGroup,
                        this.mplsTunnelIsNotIntfcGroup,
                        this.mplsTunnelCRLDPResOptionalGroup,
                        this.mplsTeNotificationGroup
                    };
                }
                public static final class MplsTunnelGroupEnt extends MIBEntry<MPLSTESTDMIBDef>
                {
                    private MplsTunnelGroupEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsTunnelGroup", "1.3.6.1.2.1.10.166.3.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsTunnelManualGroupEnt extends MIBEntry<MPLSTESTDMIBDef>
                {
                    private MplsTunnelManualGroupEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsTunnelManualGroup", "1.3.6.1.2.1.10.166.3.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsTunnelSignaledGroupEnt extends MIBEntry<MPLSTESTDMIBDef>
                {
                    private MplsTunnelSignaledGroupEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsTunnelSignaledGroup", "1.3.6.1.2.1.10.166.3.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsTunnelScalarGroupEnt extends MIBEntry<MPLSTESTDMIBDef>
                {
                    private MplsTunnelScalarGroupEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsTunnelScalarGroup", "1.3.6.1.2.1.10.166.3.3.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsTunnelIsIntfcGroupEnt extends MIBEntry<MPLSTESTDMIBDef>
                {
                    private MplsTunnelIsIntfcGroupEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsTunnelIsIntfcGroup", "1.3.6.1.2.1.10.166.3.3.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsTunnelIsNotIntfcGroupEnt extends MIBEntry<MPLSTESTDMIBDef>
                {
                    private MplsTunnelIsNotIntfcGroupEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsTunnelIsNotIntfcGroup", "1.3.6.1.2.1.10.166.3.3.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsTunnelCRLDPResOptionalGroupEnt extends MIBEntry<MPLSTESTDMIBDef>
                {
                    private MplsTunnelCRLDPResOptionalGroupEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsTunnelCRLDPResOptionalGroup", "1.3.6.1.2.1.10.166.3.3.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsTeNotificationGroupEnt extends MIBEntry<MPLSTESTDMIBDef>
                {
                    private MplsTeNotificationGroupEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsTeNotificationGroup", "1.3.6.1.2.1.10.166.3.3.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MplsTeCompliancesEnt extends MIBEntry<MPLSTESTDMIBDef>
            {
                /** Compliance requirement for fully compliant implementations.

The Interfaces Group MIB, RFC 2863.*/
                public final MplsTeModuleFullComplianceEnt mplsTeModuleFullCompliance;

                /** Compliance requirement for read-only implementations.*/
                public final MplsTeModuleReadOnlyComplianceEnt mplsTeModuleReadOnlyCompliance;

                private MplsTeCompliancesEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "mplsTeCompliances", "1.3.6.1.2.1.10.166.3.3.2", false, false, false, false);
                    this.mplsTeModuleFullCompliance = new MplsTeModuleFullComplianceEnt(mib, this);
                    this.mplsTeModuleReadOnlyCompliance = new MplsTeModuleReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsTeModuleFullCompliance,
                        this.mplsTeModuleReadOnlyCompliance
                    };
                }
                public static final class MplsTeModuleFullComplianceEnt extends MIBEntry<MPLSTESTDMIBDef>
                {
                    private MplsTeModuleFullComplianceEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsTeModuleFullCompliance", "1.3.6.1.2.1.10.166.3.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsTeModuleReadOnlyComplianceEnt extends MIBEntry<MPLSTESTDMIBDef>
                {
                    private MplsTeModuleReadOnlyComplianceEnt(MPLSTESTDMIBDef mib, MIBEntry<MPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsTeModuleReadOnlyCompliance", "1.3.6.1.2.1.10.166.3.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
