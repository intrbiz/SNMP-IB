package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2580]
[RFC2579]
[RFC3291]
[RFC3289]
[RFC3811]*/
public final class MPLSLDPSTDMIBDef extends MIB
{
    public static final MPLSLDPSTDMIBDef MPLSLDPSTDMIB = new MPLSLDPSTDMIBDef();

    static { MIBs.getInstance().registerMIB(MPLSLDPSTDMIBDef.MPLSLDPSTDMIB); }

    /** [RFC3813]

June 3, 2004*/
    public final MplsLdpStdMIBEnt mplsLdpStdMIB;

    private MPLSLDPSTDMIBDef()
    {
        super("MPLS-LDP-STD-MIB");
        this.mplsLdpStdMIB = new MplsLdpStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mplsLdpStdMIB
        };
    }

    public static final class MplsLdpStdMIBEnt extends MIBEntry<MPLSLDPSTDMIBDef>
    {
        /** *****************************************************************/
        public final MplsLdpNotificationsEnt mplsLdpNotifications;

        public final MplsLdpObjectsEnt mplsLdpObjects;

        public final MplsLdpConformanceEnt mplsLdpConformance;

        private MplsLdpStdMIBEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
        {
            super(mib, parent, "mplsLdpStdMIB", "1.3.6.1.2.1.10.166.4", false, false, false, false);
            this.mplsLdpNotifications = new MplsLdpNotificationsEnt(mib, this);
            this.mplsLdpObjects = new MplsLdpObjectsEnt(mib, this);
            this.mplsLdpConformance = new MplsLdpConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mplsLdpNotifications,
                this.mplsLdpObjects,
                this.mplsLdpConformance
            };
        }
        public static final class MplsLdpNotificationsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
        {
            /** -- Notifications-*/
            public final MplsLdpInitSessionThresholdExceededEnt mplsLdpInitSessionThresholdExceeded;

            public final MplsLdpPathVectorLimitMismatchEnt mplsLdpPathVectorLimitMismatch;

            public final MplsLdpSessionUpEnt mplsLdpSessionUp;

            public final MplsLdpSessionDownEnt mplsLdpSessionDown;

            private MplsLdpNotificationsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLdpNotifications", "1.3.6.1.2.1.10.166.4.0", false, false, false, false);
                this.mplsLdpInitSessionThresholdExceeded = new MplsLdpInitSessionThresholdExceededEnt(mib, this);
                this.mplsLdpPathVectorLimitMismatch = new MplsLdpPathVectorLimitMismatchEnt(mib, this);
                this.mplsLdpSessionUp = new MplsLdpSessionUpEnt(mib, this);
                this.mplsLdpSessionDown = new MplsLdpSessionDownEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsLdpInitSessionThresholdExceeded,
                    this.mplsLdpPathVectorLimitMismatch,
                    this.mplsLdpSessionUp,
                    this.mplsLdpSessionDown
                };
            }
            public static final class MplsLdpInitSessionThresholdExceededEnt extends MIBEntry<MPLSLDPSTDMIBDef>
            {
                private MplsLdpInitSessionThresholdExceededEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpInitSessionThresholdExceeded", "1.3.6.1.2.1.10.166.4.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsLdpPathVectorLimitMismatchEnt extends MIBEntry<MPLSLDPSTDMIBDef>
            {
                private MplsLdpPathVectorLimitMismatchEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpPathVectorLimitMismatch", "1.3.6.1.2.1.10.166.4.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsLdpSessionUpEnt extends MIBEntry<MPLSLDPSTDMIBDef>
            {
                private MplsLdpSessionUpEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpSessionUp", "1.3.6.1.2.1.10.166.4.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsLdpSessionDownEnt extends MIBEntry<MPLSLDPSTDMIBDef>
            {
                private MplsLdpSessionDownEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpSessionDown", "1.3.6.1.2.1.10.166.4.0.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class MplsLdpObjectsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
        {
            /** ****************************************************************MPLS LDP Objects*****************************************************************/
            public final MplsLdpLsrObjectsEnt mplsLdpLsrObjects;

            public final MplsLdpEntityObjectsEnt mplsLdpEntityObjects;

            /** The MPLS LDP Peer Table*/
            public final MplsLdpSessionObjectsEnt mplsLdpSessionObjects;

            private MplsLdpObjectsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLdpObjects", "1.3.6.1.2.1.10.166.4.1", false, false, false, false);
                this.mplsLdpLsrObjects = new MplsLdpLsrObjectsEnt(mib, this);
                this.mplsLdpEntityObjects = new MplsLdpEntityObjectsEnt(mib, this);
                this.mplsLdpSessionObjects = new MplsLdpSessionObjectsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsLdpLsrObjects,
                    this.mplsLdpEntityObjects,
                    this.mplsLdpSessionObjects
                };
            }
            public static final class MplsLdpLsrObjectsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
            {
                /** The MPLS Label Distribution Protocol'sLabel Switching Router Objects*/
                public final MplsLdpLsrIdEnt mplsLdpLsrId;

                public final MplsLdpLsrLoopDetectionCapableEnt mplsLdpLsrLoopDetectionCapable;

                private MplsLdpLsrObjectsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpLsrObjects", "1.3.6.1.2.1.10.166.4.1.1", false, false, false, false);
                    this.mplsLdpLsrId = new MplsLdpLsrIdEnt(mib, this);
                    this.mplsLdpLsrLoopDetectionCapable = new MplsLdpLsrLoopDetectionCapableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLdpLsrId,
                        this.mplsLdpLsrLoopDetectionCapable
                    };
                }
                public static final class MplsLdpLsrIdEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    private MplsLdpLsrIdEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpLsrId", "1.3.6.1.2.1.10.166.4.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsLdpLsrLoopDetectionCapableEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    private MplsLdpLsrLoopDetectionCapableEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpLsrLoopDetectionCapable", "1.3.6.1.2.1.10.166.4.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MplsLdpEntityObjectsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
            {
                /** The MPLS Label Distribution Protocol Entity Objects*/
                public final MplsLdpEntityLastChangeEnt mplsLdpEntityLastChange;

                public final MplsLdpEntityIndexNextEnt mplsLdpEntityIndexNext;

                public final MplsLdpEntityTableEnt mplsLdpEntityTable;

                /** The MPLS LDP Entity Statistics Table*/
                public final MplsLdpEntityStatsTableEnt mplsLdpEntityStatsTable;

                private MplsLdpEntityObjectsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpEntityObjects", "1.3.6.1.2.1.10.166.4.1.2", false, false, false, false);
                    this.mplsLdpEntityLastChange = new MplsLdpEntityLastChangeEnt(mib, this);
                    this.mplsLdpEntityIndexNext = new MplsLdpEntityIndexNextEnt(mib, this);
                    this.mplsLdpEntityTable = new MplsLdpEntityTableEnt(mib, this);
                    this.mplsLdpEntityStatsTable = new MplsLdpEntityStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLdpEntityLastChange,
                        this.mplsLdpEntityIndexNext,
                        this.mplsLdpEntityTable,
                        this.mplsLdpEntityStatsTable
                    };
                }
                public static final class MplsLdpEntityLastChangeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    private MplsLdpEntityLastChangeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpEntityLastChange", "1.3.6.1.2.1.10.166.4.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsLdpEntityIndexNextEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    private MplsLdpEntityIndexNextEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpEntityIndexNext", "1.3.6.1.2.1.10.166.4.1.2.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsLdpEntityTableEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    public final MplsLdpEntityEntryEnt mplsLdpEntityEntry;

                    private MplsLdpEntityTableEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpEntityTable", "1.3.6.1.2.1.10.166.4.1.2.3", false, true, false, false);
                        this.mplsLdpEntityEntry = new MplsLdpEntityEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLdpEntityEntry
                        };
                    }
                    public static final class MplsLdpEntityEntryEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                    {
                        public final MplsLdpEntityLdpIdEnt mplsLdpEntityLdpId;

                        public final MplsLdpEntityIndexEnt mplsLdpEntityIndex;

                        public final MplsLdpEntityProtocolVersionEnt mplsLdpEntityProtocolVersion;

                        public final MplsLdpEntityAdminStatusEnt mplsLdpEntityAdminStatus;

                        public final MplsLdpEntityOperStatusEnt mplsLdpEntityOperStatus;

                        public final MplsLdpEntityTcpPortEnt mplsLdpEntityTcpPort;

                        public final MplsLdpEntityUdpDscPortEnt mplsLdpEntityUdpDscPort;

                        public final MplsLdpEntityMaxPduLengthEnt mplsLdpEntityMaxPduLength;

                        public final MplsLdpEntityKeepAliveHoldTimerEnt mplsLdpEntityKeepAliveHoldTimer;

                        public final MplsLdpEntityHelloHoldTimerEnt mplsLdpEntityHelloHoldTimer;

                        public final MplsLdpEntityInitSessionThresholdEnt mplsLdpEntityInitSessionThreshold;

                        public final MplsLdpEntityLabelDistMethodEnt mplsLdpEntityLabelDistMethod;

                        public final MplsLdpEntityLabelRetentionModeEnt mplsLdpEntityLabelRetentionMode;

                        public final MplsLdpEntityPathVectorLimitEnt mplsLdpEntityPathVectorLimit;

                        public final MplsLdpEntityHopCountLimitEnt mplsLdpEntityHopCountLimit;

                        public final MplsLdpEntityTransportAddrKindEnt mplsLdpEntityTransportAddrKind;

                        public final MplsLdpEntityTargetPeerEnt mplsLdpEntityTargetPeer;

                        public final MplsLdpEntityTargetPeerAddrTypeEnt mplsLdpEntityTargetPeerAddrType;

                        public final MplsLdpEntityTargetPeerAddrEnt mplsLdpEntityTargetPeerAddr;

                        public final MplsLdpEntityLabelTypeEnt mplsLdpEntityLabelType;

                        public final MplsLdpEntityDiscontinuityTimeEnt mplsLdpEntityDiscontinuityTime;

                        public final MplsLdpEntityStorageTypeEnt mplsLdpEntityStorageType;

                        public final MplsLdpEntityRowStatusEnt mplsLdpEntityRowStatus;

                        private MplsLdpEntityEntryEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLdpEntityEntry", "1.3.6.1.2.1.10.166.4.1.2.3.1", false, false, false, true);
                            this.mplsLdpEntityLdpId = new MplsLdpEntityLdpIdEnt(mib, this);
                            this.mplsLdpEntityIndex = new MplsLdpEntityIndexEnt(mib, this);
                            this.mplsLdpEntityProtocolVersion = new MplsLdpEntityProtocolVersionEnt(mib, this);
                            this.mplsLdpEntityAdminStatus = new MplsLdpEntityAdminStatusEnt(mib, this);
                            this.mplsLdpEntityOperStatus = new MplsLdpEntityOperStatusEnt(mib, this);
                            this.mplsLdpEntityTcpPort = new MplsLdpEntityTcpPortEnt(mib, this);
                            this.mplsLdpEntityUdpDscPort = new MplsLdpEntityUdpDscPortEnt(mib, this);
                            this.mplsLdpEntityMaxPduLength = new MplsLdpEntityMaxPduLengthEnt(mib, this);
                            this.mplsLdpEntityKeepAliveHoldTimer = new MplsLdpEntityKeepAliveHoldTimerEnt(mib, this);
                            this.mplsLdpEntityHelloHoldTimer = new MplsLdpEntityHelloHoldTimerEnt(mib, this);
                            this.mplsLdpEntityInitSessionThreshold = new MplsLdpEntityInitSessionThresholdEnt(mib, this);
                            this.mplsLdpEntityLabelDistMethod = new MplsLdpEntityLabelDistMethodEnt(mib, this);
                            this.mplsLdpEntityLabelRetentionMode = new MplsLdpEntityLabelRetentionModeEnt(mib, this);
                            this.mplsLdpEntityPathVectorLimit = new MplsLdpEntityPathVectorLimitEnt(mib, this);
                            this.mplsLdpEntityHopCountLimit = new MplsLdpEntityHopCountLimitEnt(mib, this);
                            this.mplsLdpEntityTransportAddrKind = new MplsLdpEntityTransportAddrKindEnt(mib, this);
                            this.mplsLdpEntityTargetPeer = new MplsLdpEntityTargetPeerEnt(mib, this);
                            this.mplsLdpEntityTargetPeerAddrType = new MplsLdpEntityTargetPeerAddrTypeEnt(mib, this);
                            this.mplsLdpEntityTargetPeerAddr = new MplsLdpEntityTargetPeerAddrEnt(mib, this);
                            this.mplsLdpEntityLabelType = new MplsLdpEntityLabelTypeEnt(mib, this);
                            this.mplsLdpEntityDiscontinuityTime = new MplsLdpEntityDiscontinuityTimeEnt(mib, this);
                            this.mplsLdpEntityStorageType = new MplsLdpEntityStorageTypeEnt(mib, this);
                            this.mplsLdpEntityRowStatus = new MplsLdpEntityRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsLdpEntityLdpId,
                                this.mplsLdpEntityIndex,
                                this.mplsLdpEntityProtocolVersion,
                                this.mplsLdpEntityAdminStatus,
                                this.mplsLdpEntityOperStatus,
                                this.mplsLdpEntityTcpPort,
                                this.mplsLdpEntityUdpDscPort,
                                this.mplsLdpEntityMaxPduLength,
                                this.mplsLdpEntityKeepAliveHoldTimer,
                                this.mplsLdpEntityHelloHoldTimer,
                                this.mplsLdpEntityInitSessionThreshold,
                                this.mplsLdpEntityLabelDistMethod,
                                this.mplsLdpEntityLabelRetentionMode,
                                this.mplsLdpEntityPathVectorLimit,
                                this.mplsLdpEntityHopCountLimit,
                                this.mplsLdpEntityTransportAddrKind,
                                this.mplsLdpEntityTargetPeer,
                                this.mplsLdpEntityTargetPeerAddrType,
                                this.mplsLdpEntityTargetPeerAddr,
                                this.mplsLdpEntityLabelType,
                                this.mplsLdpEntityDiscontinuityTime,
                                this.mplsLdpEntityStorageType,
                                this.mplsLdpEntityRowStatus
                            };
                        }
                        public static final class MplsLdpEntityLdpIdEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityLdpIdEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityLdpId", "1.3.6.1.2.1.10.166.4.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityIndexEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityIndexEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityIndex", "1.3.6.1.2.1.10.166.4.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityProtocolVersionEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityProtocolVersionEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityProtocolVersion", "1.3.6.1.2.1.10.166.4.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityAdminStatusEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityAdminStatusEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAdminStatus", "1.3.6.1.2.1.10.166.4.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityOperStatusEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityOperStatusEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityOperStatus", "1.3.6.1.2.1.10.166.4.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityTcpPortEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityTcpPortEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityTcpPort", "1.3.6.1.2.1.10.166.4.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityUdpDscPortEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityUdpDscPortEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityUdpDscPort", "1.3.6.1.2.1.10.166.4.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityMaxPduLengthEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityMaxPduLengthEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityMaxPduLength", "1.3.6.1.2.1.10.166.4.1.2.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityKeepAliveHoldTimerEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityKeepAliveHoldTimerEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityKeepAliveHoldTimer", "1.3.6.1.2.1.10.166.4.1.2.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityHelloHoldTimerEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityHelloHoldTimerEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityHelloHoldTimer", "1.3.6.1.2.1.10.166.4.1.2.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityInitSessionThresholdEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityInitSessionThresholdEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityInitSessionThreshold", "1.3.6.1.2.1.10.166.4.1.2.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityLabelDistMethodEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityLabelDistMethodEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityLabelDistMethod", "1.3.6.1.2.1.10.166.4.1.2.3.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityLabelRetentionModeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityLabelRetentionModeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityLabelRetentionMode", "1.3.6.1.2.1.10.166.4.1.2.3.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityPathVectorLimitEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityPathVectorLimitEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityPathVectorLimit", "1.3.6.1.2.1.10.166.4.1.2.3.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityHopCountLimitEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityHopCountLimitEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityHopCountLimit", "1.3.6.1.2.1.10.166.4.1.2.3.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityTransportAddrKindEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityTransportAddrKindEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityTransportAddrKind", "1.3.6.1.2.1.10.166.4.1.2.3.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityTargetPeerEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityTargetPeerEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityTargetPeer", "1.3.6.1.2.1.10.166.4.1.2.3.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityTargetPeerAddrTypeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityTargetPeerAddrTypeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityTargetPeerAddrType", "1.3.6.1.2.1.10.166.4.1.2.3.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityTargetPeerAddrEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityTargetPeerAddrEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityTargetPeerAddr", "1.3.6.1.2.1.10.166.4.1.2.3.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityLabelTypeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityLabelTypeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityLabelType", "1.3.6.1.2.1.10.166.4.1.2.3.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityDiscontinuityTimeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityDiscontinuityTimeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityDiscontinuityTime", "1.3.6.1.2.1.10.166.4.1.2.3.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityStorageTypeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityStorageTypeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityStorageType", "1.3.6.1.2.1.10.166.4.1.2.3.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityRowStatusEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityRowStatusEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityRowStatus", "1.3.6.1.2.1.10.166.4.1.2.3.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MplsLdpEntityStatsTableEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    public final MplsLdpEntityStatsEntryEnt mplsLdpEntityStatsEntry;

                    private MplsLdpEntityStatsTableEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpEntityStatsTable", "1.3.6.1.2.1.10.166.4.1.2.4", false, true, false, false);
                        this.mplsLdpEntityStatsEntry = new MplsLdpEntityStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLdpEntityStatsEntry
                        };
                    }
                    public static final class MplsLdpEntityStatsEntryEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                    {
                        public final MplsLdpEntityStatsSessionAttemptsEnt mplsLdpEntityStatsSessionAttempts;

                        public final MplsLdpEntityStatsSessionRejectedNoHelloErrorsEnt mplsLdpEntityStatsSessionRejectedNoHelloErrors;

                        public final MplsLdpEntityStatsSessionRejectedAdErrorsEnt mplsLdpEntityStatsSessionRejectedAdErrors;

                        public final MplsLdpEntityStatsSessionRejectedMaxPduErrorsEnt mplsLdpEntityStatsSessionRejectedMaxPduErrors;

                        public final MplsLdpEntityStatsSessionRejectedLRErrorsEnt mplsLdpEntityStatsSessionRejectedLRErrors;

                        public final MplsLdpEntityStatsBadLdpIdentifierErrorsEnt mplsLdpEntityStatsBadLdpIdentifierErrors;

                        public final MplsLdpEntityStatsBadPduLengthErrorsEnt mplsLdpEntityStatsBadPduLengthErrors;

                        public final MplsLdpEntityStatsBadMessageLengthErrorsEnt mplsLdpEntityStatsBadMessageLengthErrors;

                        public final MplsLdpEntityStatsBadTlvLengthErrorsEnt mplsLdpEntityStatsBadTlvLengthErrors;

                        public final MplsLdpEntityStatsMalformedTlvValueErrorsEnt mplsLdpEntityStatsMalformedTlvValueErrors;

                        public final MplsLdpEntityStatsKeepAliveTimerExpErrorsEnt mplsLdpEntityStatsKeepAliveTimerExpErrors;

                        public final MplsLdpEntityStatsShutdownReceivedNotificationsEnt mplsLdpEntityStatsShutdownReceivedNotifications;

                        public final MplsLdpEntityStatsShutdownSentNotificationsEnt mplsLdpEntityStatsShutdownSentNotifications;

                        private MplsLdpEntityStatsEntryEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLdpEntityStatsEntry", "1.3.6.1.2.1.10.166.4.1.2.4.1", false, false, false, true);
                            this.mplsLdpEntityStatsSessionAttempts = new MplsLdpEntityStatsSessionAttemptsEnt(mib, this);
                            this.mplsLdpEntityStatsSessionRejectedNoHelloErrors = new MplsLdpEntityStatsSessionRejectedNoHelloErrorsEnt(mib, this);
                            this.mplsLdpEntityStatsSessionRejectedAdErrors = new MplsLdpEntityStatsSessionRejectedAdErrorsEnt(mib, this);
                            this.mplsLdpEntityStatsSessionRejectedMaxPduErrors = new MplsLdpEntityStatsSessionRejectedMaxPduErrorsEnt(mib, this);
                            this.mplsLdpEntityStatsSessionRejectedLRErrors = new MplsLdpEntityStatsSessionRejectedLRErrorsEnt(mib, this);
                            this.mplsLdpEntityStatsBadLdpIdentifierErrors = new MplsLdpEntityStatsBadLdpIdentifierErrorsEnt(mib, this);
                            this.mplsLdpEntityStatsBadPduLengthErrors = new MplsLdpEntityStatsBadPduLengthErrorsEnt(mib, this);
                            this.mplsLdpEntityStatsBadMessageLengthErrors = new MplsLdpEntityStatsBadMessageLengthErrorsEnt(mib, this);
                            this.mplsLdpEntityStatsBadTlvLengthErrors = new MplsLdpEntityStatsBadTlvLengthErrorsEnt(mib, this);
                            this.mplsLdpEntityStatsMalformedTlvValueErrors = new MplsLdpEntityStatsMalformedTlvValueErrorsEnt(mib, this);
                            this.mplsLdpEntityStatsKeepAliveTimerExpErrors = new MplsLdpEntityStatsKeepAliveTimerExpErrorsEnt(mib, this);
                            this.mplsLdpEntityStatsShutdownReceivedNotifications = new MplsLdpEntityStatsShutdownReceivedNotificationsEnt(mib, this);
                            this.mplsLdpEntityStatsShutdownSentNotifications = new MplsLdpEntityStatsShutdownSentNotificationsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsLdpEntityStatsSessionAttempts,
                                this.mplsLdpEntityStatsSessionRejectedNoHelloErrors,
                                this.mplsLdpEntityStatsSessionRejectedAdErrors,
                                this.mplsLdpEntityStatsSessionRejectedMaxPduErrors,
                                this.mplsLdpEntityStatsSessionRejectedLRErrors,
                                this.mplsLdpEntityStatsBadLdpIdentifierErrors,
                                this.mplsLdpEntityStatsBadPduLengthErrors,
                                this.mplsLdpEntityStatsBadMessageLengthErrors,
                                this.mplsLdpEntityStatsBadTlvLengthErrors,
                                this.mplsLdpEntityStatsMalformedTlvValueErrors,
                                this.mplsLdpEntityStatsKeepAliveTimerExpErrors,
                                this.mplsLdpEntityStatsShutdownReceivedNotifications,
                                this.mplsLdpEntityStatsShutdownSentNotifications
                            };
                        }
                        public static final class MplsLdpEntityStatsSessionAttemptsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityStatsSessionAttemptsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityStatsSessionAttempts", "1.3.6.1.2.1.10.166.4.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityStatsSessionRejectedNoHelloErrorsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityStatsSessionRejectedNoHelloErrorsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityStatsSessionRejectedNoHelloErrors", "1.3.6.1.2.1.10.166.4.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityStatsSessionRejectedAdErrorsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityStatsSessionRejectedAdErrorsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityStatsSessionRejectedAdErrors", "1.3.6.1.2.1.10.166.4.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityStatsSessionRejectedMaxPduErrorsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityStatsSessionRejectedMaxPduErrorsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityStatsSessionRejectedMaxPduErrors", "1.3.6.1.2.1.10.166.4.1.2.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityStatsSessionRejectedLRErrorsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityStatsSessionRejectedLRErrorsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityStatsSessionRejectedLRErrors", "1.3.6.1.2.1.10.166.4.1.2.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityStatsBadLdpIdentifierErrorsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityStatsBadLdpIdentifierErrorsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityStatsBadLdpIdentifierErrors", "1.3.6.1.2.1.10.166.4.1.2.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityStatsBadPduLengthErrorsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityStatsBadPduLengthErrorsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityStatsBadPduLengthErrors", "1.3.6.1.2.1.10.166.4.1.2.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityStatsBadMessageLengthErrorsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityStatsBadMessageLengthErrorsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityStatsBadMessageLengthErrors", "1.3.6.1.2.1.10.166.4.1.2.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityStatsBadTlvLengthErrorsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityStatsBadTlvLengthErrorsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityStatsBadTlvLengthErrors", "1.3.6.1.2.1.10.166.4.1.2.4.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityStatsMalformedTlvValueErrorsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityStatsMalformedTlvValueErrorsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityStatsMalformedTlvValueErrors", "1.3.6.1.2.1.10.166.4.1.2.4.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityStatsKeepAliveTimerExpErrorsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityStatsKeepAliveTimerExpErrorsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityStatsKeepAliveTimerExpErrors", "1.3.6.1.2.1.10.166.4.1.2.4.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityStatsShutdownReceivedNotificationsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityStatsShutdownReceivedNotificationsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityStatsShutdownReceivedNotifications", "1.3.6.1.2.1.10.166.4.1.2.4.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityStatsShutdownSentNotificationsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpEntityStatsShutdownSentNotificationsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityStatsShutdownSentNotifications", "1.3.6.1.2.1.10.166.4.1.2.4.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class MplsLdpSessionObjectsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
            {
                public final MplsLdpPeerLastChangeEnt mplsLdpPeerLastChange;

                public final MplsLdpPeerTableEnt mplsLdpPeerTable;

                /** The MPLS LDP Sessions Table*/
                public final MplsLdpSessionTableEnt mplsLdpSessionTable;

                /** The MPLS LDP Session Statistics Table*/
                public final MplsLdpSessionStatsTableEnt mplsLdpSessionStatsTable;

                /** The MPLS LDP Hello Adjacency Table*/
                public final MplsLdpHelloAdjacencyObjectsEnt mplsLdpHelloAdjacencyObjects;

                /** Session Label (LSP) Mapping to LSR MIB'sIn Segment LIB Information.NOTE: the next 2 tables map to theMPLS-LSR-STD-MIB's MplsInSegmentTableand MplsOutSegmentTable.  Thecross-connect (XC) information is notrepresented here as it can be gleanedfrom the MPLS-LSR-STD-MIB.*/
                public final MplsInSegmentLdpLspTableEnt mplsInSegmentLdpLspTable;

                /** Session Label (LSP) Mapping to LSR MIB'sOut Segment LIB Information.*/
                public final MplsOutSegmentLdpLspTableEnt mplsOutSegmentLdpLspTable;

                /** Mpls FEC Table*/
                public final MplsFecObjectsEnt mplsFecObjects;

                /** LDP LSP FEC Table*/
                public final MplsLdpLspFecLastChangeEnt mplsLdpLspFecLastChange;

                public final MplsLdpLspFecTableEnt mplsLdpLspFecTable;

                /** Address Message/Address Withdraw Message InformationThis information is associated with a specific Sessionbecause Label Address Messages are sent after sessioninitialization has taken place.*/
                public final MplsLdpSessionPeerAddrTableEnt mplsLdpSessionPeerAddrTable;

                private MplsLdpSessionObjectsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpSessionObjects", "1.3.6.1.2.1.10.166.4.1.3", false, false, false, false);
                    this.mplsLdpPeerLastChange = new MplsLdpPeerLastChangeEnt(mib, this);
                    this.mplsLdpPeerTable = new MplsLdpPeerTableEnt(mib, this);
                    this.mplsLdpSessionTable = new MplsLdpSessionTableEnt(mib, this);
                    this.mplsLdpSessionStatsTable = new MplsLdpSessionStatsTableEnt(mib, this);
                    this.mplsLdpHelloAdjacencyObjects = new MplsLdpHelloAdjacencyObjectsEnt(mib, this);
                    this.mplsInSegmentLdpLspTable = new MplsInSegmentLdpLspTableEnt(mib, this);
                    this.mplsOutSegmentLdpLspTable = new MplsOutSegmentLdpLspTableEnt(mib, this);
                    this.mplsFecObjects = new MplsFecObjectsEnt(mib, this);
                    this.mplsLdpLspFecLastChange = new MplsLdpLspFecLastChangeEnt(mib, this);
                    this.mplsLdpLspFecTable = new MplsLdpLspFecTableEnt(mib, this);
                    this.mplsLdpSessionPeerAddrTable = new MplsLdpSessionPeerAddrTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLdpPeerLastChange,
                        this.mplsLdpPeerTable,
                        this.mplsLdpSessionTable,
                        this.mplsLdpSessionStatsTable,
                        this.mplsLdpHelloAdjacencyObjects,
                        this.mplsInSegmentLdpLspTable,
                        this.mplsOutSegmentLdpLspTable,
                        this.mplsFecObjects,
                        this.mplsLdpLspFecLastChange,
                        this.mplsLdpLspFecTable,
                        this.mplsLdpSessionPeerAddrTable
                    };
                }
                public static final class MplsLdpPeerLastChangeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    private MplsLdpPeerLastChangeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpPeerLastChange", "1.3.6.1.2.1.10.166.4.1.3.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsLdpPeerTableEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    public final MplsLdpPeerEntryEnt mplsLdpPeerEntry;

                    private MplsLdpPeerTableEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpPeerTable", "1.3.6.1.2.1.10.166.4.1.3.2", false, true, false, false);
                        this.mplsLdpPeerEntry = new MplsLdpPeerEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLdpPeerEntry
                        };
                    }
                    public static final class MplsLdpPeerEntryEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                    {
                        public final MplsLdpPeerLdpIdEnt mplsLdpPeerLdpId;

                        public final MplsLdpPeerLabelDistMethodEnt mplsLdpPeerLabelDistMethod;

                        public final MplsLdpPeerPathVectorLimitEnt mplsLdpPeerPathVectorLimit;

                        public final MplsLdpPeerTransportAddrTypeEnt mplsLdpPeerTransportAddrType;

                        public final MplsLdpPeerTransportAddrEnt mplsLdpPeerTransportAddr;

                        private MplsLdpPeerEntryEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLdpPeerEntry", "1.3.6.1.2.1.10.166.4.1.3.2.1", false, false, false, true);
                            this.mplsLdpPeerLdpId = new MplsLdpPeerLdpIdEnt(mib, this);
                            this.mplsLdpPeerLabelDistMethod = new MplsLdpPeerLabelDistMethodEnt(mib, this);
                            this.mplsLdpPeerPathVectorLimit = new MplsLdpPeerPathVectorLimitEnt(mib, this);
                            this.mplsLdpPeerTransportAddrType = new MplsLdpPeerTransportAddrTypeEnt(mib, this);
                            this.mplsLdpPeerTransportAddr = new MplsLdpPeerTransportAddrEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsLdpPeerLdpId,
                                this.mplsLdpPeerLabelDistMethod,
                                this.mplsLdpPeerPathVectorLimit,
                                this.mplsLdpPeerTransportAddrType,
                                this.mplsLdpPeerTransportAddr
                            };
                        }
                        public static final class MplsLdpPeerLdpIdEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpPeerLdpIdEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpPeerLdpId", "1.3.6.1.2.1.10.166.4.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpPeerLabelDistMethodEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpPeerLabelDistMethodEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpPeerLabelDistMethod", "1.3.6.1.2.1.10.166.4.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpPeerPathVectorLimitEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpPeerPathVectorLimitEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpPeerPathVectorLimit", "1.3.6.1.2.1.10.166.4.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpPeerTransportAddrTypeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpPeerTransportAddrTypeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpPeerTransportAddrType", "1.3.6.1.2.1.10.166.4.1.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpPeerTransportAddrEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpPeerTransportAddrEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpPeerTransportAddr", "1.3.6.1.2.1.10.166.4.1.3.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MplsLdpSessionTableEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    public final MplsLdpSessionEntryEnt mplsLdpSessionEntry;

                    private MplsLdpSessionTableEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpSessionTable", "1.3.6.1.2.1.10.166.4.1.3.3", false, true, false, false);
                        this.mplsLdpSessionEntry = new MplsLdpSessionEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLdpSessionEntry
                        };
                    }
                    public static final class MplsLdpSessionEntryEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                    {
                        public final MplsLdpSessionStateLastChangeEnt mplsLdpSessionStateLastChange;

                        public final MplsLdpSessionStateEnt mplsLdpSessionState;

                        public final MplsLdpSessionRoleEnt mplsLdpSessionRole;

                        public final MplsLdpSessionProtocolVersionEnt mplsLdpSessionProtocolVersion;

                        public final MplsLdpSessionKeepAliveHoldTimeRemEnt mplsLdpSessionKeepAliveHoldTimeRem;

                        public final MplsLdpSessionKeepAliveTimeEnt mplsLdpSessionKeepAliveTime;

                        public final MplsLdpSessionMaxPduLengthEnt mplsLdpSessionMaxPduLength;

                        public final MplsLdpSessionDiscontinuityTimeEnt mplsLdpSessionDiscontinuityTime;

                        private MplsLdpSessionEntryEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLdpSessionEntry", "1.3.6.1.2.1.10.166.4.1.3.3.1", false, false, false, true);
                            this.mplsLdpSessionStateLastChange = new MplsLdpSessionStateLastChangeEnt(mib, this);
                            this.mplsLdpSessionState = new MplsLdpSessionStateEnt(mib, this);
                            this.mplsLdpSessionRole = new MplsLdpSessionRoleEnt(mib, this);
                            this.mplsLdpSessionProtocolVersion = new MplsLdpSessionProtocolVersionEnt(mib, this);
                            this.mplsLdpSessionKeepAliveHoldTimeRem = new MplsLdpSessionKeepAliveHoldTimeRemEnt(mib, this);
                            this.mplsLdpSessionKeepAliveTime = new MplsLdpSessionKeepAliveTimeEnt(mib, this);
                            this.mplsLdpSessionMaxPduLength = new MplsLdpSessionMaxPduLengthEnt(mib, this);
                            this.mplsLdpSessionDiscontinuityTime = new MplsLdpSessionDiscontinuityTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsLdpSessionStateLastChange,
                                this.mplsLdpSessionState,
                                this.mplsLdpSessionRole,
                                this.mplsLdpSessionProtocolVersion,
                                this.mplsLdpSessionKeepAliveHoldTimeRem,
                                this.mplsLdpSessionKeepAliveTime,
                                this.mplsLdpSessionMaxPduLength,
                                this.mplsLdpSessionDiscontinuityTime
                            };
                        }
                        public static final class MplsLdpSessionStateLastChangeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpSessionStateLastChangeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpSessionStateLastChange", "1.3.6.1.2.1.10.166.4.1.3.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpSessionStateEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpSessionStateEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpSessionState", "1.3.6.1.2.1.10.166.4.1.3.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpSessionRoleEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpSessionRoleEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpSessionRole", "1.3.6.1.2.1.10.166.4.1.3.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpSessionProtocolVersionEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpSessionProtocolVersionEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpSessionProtocolVersion", "1.3.6.1.2.1.10.166.4.1.3.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpSessionKeepAliveHoldTimeRemEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpSessionKeepAliveHoldTimeRemEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpSessionKeepAliveHoldTimeRem", "1.3.6.1.2.1.10.166.4.1.3.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpSessionKeepAliveTimeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpSessionKeepAliveTimeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpSessionKeepAliveTime", "1.3.6.1.2.1.10.166.4.1.3.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpSessionMaxPduLengthEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpSessionMaxPduLengthEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpSessionMaxPduLength", "1.3.6.1.2.1.10.166.4.1.3.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpSessionDiscontinuityTimeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpSessionDiscontinuityTimeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpSessionDiscontinuityTime", "1.3.6.1.2.1.10.166.4.1.3.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MplsLdpSessionStatsTableEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    public final MplsLdpSessionStatsEntryEnt mplsLdpSessionStatsEntry;

                    private MplsLdpSessionStatsTableEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpSessionStatsTable", "1.3.6.1.2.1.10.166.4.1.3.4", false, true, false, false);
                        this.mplsLdpSessionStatsEntry = new MplsLdpSessionStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLdpSessionStatsEntry
                        };
                    }
                    public static final class MplsLdpSessionStatsEntryEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                    {
                        public final MplsLdpSessionStatsUnknownMesTypeErrorsEnt mplsLdpSessionStatsUnknownMesTypeErrors;

                        public final MplsLdpSessionStatsUnknownTlvErrorsEnt mplsLdpSessionStatsUnknownTlvErrors;

                        private MplsLdpSessionStatsEntryEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLdpSessionStatsEntry", "1.3.6.1.2.1.10.166.4.1.3.4.1", false, false, false, true);
                            this.mplsLdpSessionStatsUnknownMesTypeErrors = new MplsLdpSessionStatsUnknownMesTypeErrorsEnt(mib, this);
                            this.mplsLdpSessionStatsUnknownTlvErrors = new MplsLdpSessionStatsUnknownTlvErrorsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsLdpSessionStatsUnknownMesTypeErrors,
                                this.mplsLdpSessionStatsUnknownTlvErrors
                            };
                        }
                        public static final class MplsLdpSessionStatsUnknownMesTypeErrorsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpSessionStatsUnknownMesTypeErrorsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpSessionStatsUnknownMesTypeErrors", "1.3.6.1.2.1.10.166.4.1.3.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpSessionStatsUnknownTlvErrorsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpSessionStatsUnknownTlvErrorsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpSessionStatsUnknownTlvErrors", "1.3.6.1.2.1.10.166.4.1.3.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MplsLdpHelloAdjacencyObjectsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    public final MplsLdpHelloAdjacencyTableEnt mplsLdpHelloAdjacencyTable;

                    private MplsLdpHelloAdjacencyObjectsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpHelloAdjacencyObjects", "1.3.6.1.2.1.10.166.4.1.3.5", false, false, false, false);
                        this.mplsLdpHelloAdjacencyTable = new MplsLdpHelloAdjacencyTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLdpHelloAdjacencyTable
                        };
                    }
                    public static final class MplsLdpHelloAdjacencyTableEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                    {
                        public final MplsLdpHelloAdjacencyEntryEnt mplsLdpHelloAdjacencyEntry;

                        private MplsLdpHelloAdjacencyTableEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLdpHelloAdjacencyTable", "1.3.6.1.2.1.10.166.4.1.3.5.1", false, true, false, false);
                            this.mplsLdpHelloAdjacencyEntry = new MplsLdpHelloAdjacencyEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsLdpHelloAdjacencyEntry
                            };
                        }
                        public static final class MplsLdpHelloAdjacencyEntryEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            public final MplsLdpHelloAdjacencyIndexEnt mplsLdpHelloAdjacencyIndex;

                            public final MplsLdpHelloAdjacencyHoldTimeRemEnt mplsLdpHelloAdjacencyHoldTimeRem;

                            public final MplsLdpHelloAdjacencyHoldTimeEnt mplsLdpHelloAdjacencyHoldTime;

                            public final MplsLdpHelloAdjacencyTypeEnt mplsLdpHelloAdjacencyType;

                            private MplsLdpHelloAdjacencyEntryEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpHelloAdjacencyEntry", "1.3.6.1.2.1.10.166.4.1.3.5.1.1", false, false, false, true);
                                this.mplsLdpHelloAdjacencyIndex = new MplsLdpHelloAdjacencyIndexEnt(mib, this);
                                this.mplsLdpHelloAdjacencyHoldTimeRem = new MplsLdpHelloAdjacencyHoldTimeRemEnt(mib, this);
                                this.mplsLdpHelloAdjacencyHoldTime = new MplsLdpHelloAdjacencyHoldTimeEnt(mib, this);
                                this.mplsLdpHelloAdjacencyType = new MplsLdpHelloAdjacencyTypeEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.mplsLdpHelloAdjacencyIndex,
                                    this.mplsLdpHelloAdjacencyHoldTimeRem,
                                    this.mplsLdpHelloAdjacencyHoldTime,
                                    this.mplsLdpHelloAdjacencyType
                                };
                            }
                            public static final class MplsLdpHelloAdjacencyIndexEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                            {
                                private MplsLdpHelloAdjacencyIndexEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                                {
                                    super(mib, parent, "mplsLdpHelloAdjacencyIndex", "1.3.6.1.2.1.10.166.4.1.3.5.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MplsLdpHelloAdjacencyHoldTimeRemEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                            {
                                private MplsLdpHelloAdjacencyHoldTimeRemEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                                {
                                    super(mib, parent, "mplsLdpHelloAdjacencyHoldTimeRem", "1.3.6.1.2.1.10.166.4.1.3.5.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MplsLdpHelloAdjacencyHoldTimeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                            {
                                private MplsLdpHelloAdjacencyHoldTimeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                                {
                                    super(mib, parent, "mplsLdpHelloAdjacencyHoldTime", "1.3.6.1.2.1.10.166.4.1.3.5.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MplsLdpHelloAdjacencyTypeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                            {
                                private MplsLdpHelloAdjacencyTypeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                                {
                                    super(mib, parent, "mplsLdpHelloAdjacencyType", "1.3.6.1.2.1.10.166.4.1.3.5.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class MplsInSegmentLdpLspTableEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    public final MplsInSegmentLdpLspEntryEnt mplsInSegmentLdpLspEntry;

                    private MplsInSegmentLdpLspTableEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsInSegmentLdpLspTable", "1.3.6.1.2.1.10.166.4.1.3.6", false, true, false, false);
                        this.mplsInSegmentLdpLspEntry = new MplsInSegmentLdpLspEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsInSegmentLdpLspEntry
                        };
                    }
                    public static final class MplsInSegmentLdpLspEntryEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                    {
                        public final MplsInSegmentLdpLspIndexEnt mplsInSegmentLdpLspIndex;

                        public final MplsInSegmentLdpLspLabelTypeEnt mplsInSegmentLdpLspLabelType;

                        public final MplsInSegmentLdpLspTypeEnt mplsInSegmentLdpLspType;

                        private MplsInSegmentLdpLspEntryEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentLdpLspEntry", "1.3.6.1.2.1.10.166.4.1.3.6.1", false, false, false, true);
                            this.mplsInSegmentLdpLspIndex = new MplsInSegmentLdpLspIndexEnt(mib, this);
                            this.mplsInSegmentLdpLspLabelType = new MplsInSegmentLdpLspLabelTypeEnt(mib, this);
                            this.mplsInSegmentLdpLspType = new MplsInSegmentLdpLspTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsInSegmentLdpLspIndex,
                                this.mplsInSegmentLdpLspLabelType,
                                this.mplsInSegmentLdpLspType
                            };
                        }
                        public static final class MplsInSegmentLdpLspIndexEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsInSegmentLdpLspIndexEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsInSegmentLdpLspIndex", "1.3.6.1.2.1.10.166.4.1.3.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsInSegmentLdpLspLabelTypeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsInSegmentLdpLspLabelTypeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsInSegmentLdpLspLabelType", "1.3.6.1.2.1.10.166.4.1.3.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsInSegmentLdpLspTypeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsInSegmentLdpLspTypeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsInSegmentLdpLspType", "1.3.6.1.2.1.10.166.4.1.3.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MplsOutSegmentLdpLspTableEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    public final MplsOutSegmentLdpLspEntryEnt mplsOutSegmentLdpLspEntry;

                    private MplsOutSegmentLdpLspTableEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsOutSegmentLdpLspTable", "1.3.6.1.2.1.10.166.4.1.3.7", false, true, false, false);
                        this.mplsOutSegmentLdpLspEntry = new MplsOutSegmentLdpLspEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsOutSegmentLdpLspEntry
                        };
                    }
                    public static final class MplsOutSegmentLdpLspEntryEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                    {
                        public final MplsOutSegmentLdpLspIndexEnt mplsOutSegmentLdpLspIndex;

                        public final MplsOutSegmentLdpLspLabelTypeEnt mplsOutSegmentLdpLspLabelType;

                        public final MplsOutSegmentLdpLspTypeEnt mplsOutSegmentLdpLspType;

                        private MplsOutSegmentLdpLspEntryEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentLdpLspEntry", "1.3.6.1.2.1.10.166.4.1.3.7.1", false, false, false, true);
                            this.mplsOutSegmentLdpLspIndex = new MplsOutSegmentLdpLspIndexEnt(mib, this);
                            this.mplsOutSegmentLdpLspLabelType = new MplsOutSegmentLdpLspLabelTypeEnt(mib, this);
                            this.mplsOutSegmentLdpLspType = new MplsOutSegmentLdpLspTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsOutSegmentLdpLspIndex,
                                this.mplsOutSegmentLdpLspLabelType,
                                this.mplsOutSegmentLdpLspType
                            };
                        }
                        public static final class MplsOutSegmentLdpLspIndexEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsOutSegmentLdpLspIndexEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsOutSegmentLdpLspIndex", "1.3.6.1.2.1.10.166.4.1.3.7.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsOutSegmentLdpLspLabelTypeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsOutSegmentLdpLspLabelTypeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsOutSegmentLdpLspLabelType", "1.3.6.1.2.1.10.166.4.1.3.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsOutSegmentLdpLspTypeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsOutSegmentLdpLspTypeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsOutSegmentLdpLspType", "1.3.6.1.2.1.10.166.4.1.3.7.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MplsFecObjectsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    public final MplsFecLastChangeEnt mplsFecLastChange;

                    public final MplsFecIndexNextEnt mplsFecIndexNext;

                    public final MplsFecTableEnt mplsFecTable;

                    private MplsFecObjectsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsFecObjects", "1.3.6.1.2.1.10.166.4.1.3.8", false, false, false, false);
                        this.mplsFecLastChange = new MplsFecLastChangeEnt(mib, this);
                        this.mplsFecIndexNext = new MplsFecIndexNextEnt(mib, this);
                        this.mplsFecTable = new MplsFecTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsFecLastChange,
                            this.mplsFecIndexNext,
                            this.mplsFecTable
                        };
                    }
                    public static final class MplsFecLastChangeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                    {
                        private MplsFecLastChangeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFecLastChange", "1.3.6.1.2.1.10.166.4.1.3.8.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFecIndexNextEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                    {
                        private MplsFecIndexNextEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFecIndexNext", "1.3.6.1.2.1.10.166.4.1.3.8.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFecTableEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                    {
                        public final MplsFecEntryEnt mplsFecEntry;

                        private MplsFecTableEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFecTable", "1.3.6.1.2.1.10.166.4.1.3.8.3", false, true, false, false);
                            this.mplsFecEntry = new MplsFecEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsFecEntry
                            };
                        }
                        public static final class MplsFecEntryEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            public final MplsFecIndexEnt mplsFecIndex;

                            public final MplsFecTypeEnt mplsFecType;

                            public final MplsFecAddrTypeEnt mplsFecAddrType;

                            public final MplsFecAddrEnt mplsFecAddr;

                            public final MplsFecAddrPrefixLengthEnt mplsFecAddrPrefixLength;

                            public final MplsFecStorageTypeEnt mplsFecStorageType;

                            public final MplsFecRowStatusEnt mplsFecRowStatus;

                            private MplsFecEntryEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsFecEntry", "1.3.6.1.2.1.10.166.4.1.3.8.3.1", false, false, false, true);
                                this.mplsFecIndex = new MplsFecIndexEnt(mib, this);
                                this.mplsFecType = new MplsFecTypeEnt(mib, this);
                                this.mplsFecAddrType = new MplsFecAddrTypeEnt(mib, this);
                                this.mplsFecAddr = new MplsFecAddrEnt(mib, this);
                                this.mplsFecAddrPrefixLength = new MplsFecAddrPrefixLengthEnt(mib, this);
                                this.mplsFecStorageType = new MplsFecStorageTypeEnt(mib, this);
                                this.mplsFecRowStatus = new MplsFecRowStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.mplsFecIndex,
                                    this.mplsFecType,
                                    this.mplsFecAddrType,
                                    this.mplsFecAddr,
                                    this.mplsFecAddrPrefixLength,
                                    this.mplsFecStorageType,
                                    this.mplsFecRowStatus
                                };
                            }
                            public static final class MplsFecIndexEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                            {
                                private MplsFecIndexEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                                {
                                    super(mib, parent, "mplsFecIndex", "1.3.6.1.2.1.10.166.4.1.3.8.3.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MplsFecTypeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                            {
                                private MplsFecTypeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                                {
                                    super(mib, parent, "mplsFecType", "1.3.6.1.2.1.10.166.4.1.3.8.3.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MplsFecAddrTypeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                            {
                                private MplsFecAddrTypeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                                {
                                    super(mib, parent, "mplsFecAddrType", "1.3.6.1.2.1.10.166.4.1.3.8.3.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MplsFecAddrEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                            {
                                private MplsFecAddrEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                                {
                                    super(mib, parent, "mplsFecAddr", "1.3.6.1.2.1.10.166.4.1.3.8.3.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MplsFecAddrPrefixLengthEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                            {
                                private MplsFecAddrPrefixLengthEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                                {
                                    super(mib, parent, "mplsFecAddrPrefixLength", "1.3.6.1.2.1.10.166.4.1.3.8.3.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MplsFecStorageTypeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                            {
                                private MplsFecStorageTypeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                                {
                                    super(mib, parent, "mplsFecStorageType", "1.3.6.1.2.1.10.166.4.1.3.8.3.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MplsFecRowStatusEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                            {
                                private MplsFecRowStatusEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                                {
                                    super(mib, parent, "mplsFecRowStatus", "1.3.6.1.2.1.10.166.4.1.3.8.3.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class MplsLdpLspFecLastChangeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    private MplsLdpLspFecLastChangeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpLspFecLastChange", "1.3.6.1.2.1.10.166.4.1.3.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsLdpLspFecTableEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    public final MplsLdpLspFecEntryEnt mplsLdpLspFecEntry;

                    private MplsLdpLspFecTableEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpLspFecTable", "1.3.6.1.2.1.10.166.4.1.3.10", false, true, false, false);
                        this.mplsLdpLspFecEntry = new MplsLdpLspFecEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLdpLspFecEntry
                        };
                    }
                    public static final class MplsLdpLspFecEntryEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                    {
                        public final MplsLdpLspFecSegmentEnt mplsLdpLspFecSegment;

                        public final MplsLdpLspFecSegmentIndexEnt mplsLdpLspFecSegmentIndex;

                        public final MplsLdpLspFecIndexEnt mplsLdpLspFecIndex;

                        public final MplsLdpLspFecStorageTypeEnt mplsLdpLspFecStorageType;

                        public final MplsLdpLspFecRowStatusEnt mplsLdpLspFecRowStatus;

                        private MplsLdpLspFecEntryEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLdpLspFecEntry", "1.3.6.1.2.1.10.166.4.1.3.10.1", false, false, false, true);
                            this.mplsLdpLspFecSegment = new MplsLdpLspFecSegmentEnt(mib, this);
                            this.mplsLdpLspFecSegmentIndex = new MplsLdpLspFecSegmentIndexEnt(mib, this);
                            this.mplsLdpLspFecIndex = new MplsLdpLspFecIndexEnt(mib, this);
                            this.mplsLdpLspFecStorageType = new MplsLdpLspFecStorageTypeEnt(mib, this);
                            this.mplsLdpLspFecRowStatus = new MplsLdpLspFecRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsLdpLspFecSegment,
                                this.mplsLdpLspFecSegmentIndex,
                                this.mplsLdpLspFecIndex,
                                this.mplsLdpLspFecStorageType,
                                this.mplsLdpLspFecRowStatus
                            };
                        }
                        public static final class MplsLdpLspFecSegmentEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpLspFecSegmentEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpLspFecSegment", "1.3.6.1.2.1.10.166.4.1.3.10.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpLspFecSegmentIndexEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpLspFecSegmentIndexEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpLspFecSegmentIndex", "1.3.6.1.2.1.10.166.4.1.3.10.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpLspFecIndexEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpLspFecIndexEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpLspFecIndex", "1.3.6.1.2.1.10.166.4.1.3.10.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpLspFecStorageTypeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpLspFecStorageTypeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpLspFecStorageType", "1.3.6.1.2.1.10.166.4.1.3.10.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpLspFecRowStatusEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpLspFecRowStatusEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpLspFecRowStatus", "1.3.6.1.2.1.10.166.4.1.3.10.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MplsLdpSessionPeerAddrTableEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    public final MplsLdpSessionPeerAddrEntryEnt mplsLdpSessionPeerAddrEntry;

                    private MplsLdpSessionPeerAddrTableEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpSessionPeerAddrTable", "1.3.6.1.2.1.10.166.4.1.3.11", false, true, false, false);
                        this.mplsLdpSessionPeerAddrEntry = new MplsLdpSessionPeerAddrEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLdpSessionPeerAddrEntry
                        };
                    }
                    public static final class MplsLdpSessionPeerAddrEntryEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                    {
                        public final MplsLdpSessionPeerAddrIndexEnt mplsLdpSessionPeerAddrIndex;

                        public final MplsLdpSessionPeerNextHopAddrTypeEnt mplsLdpSessionPeerNextHopAddrType;

                        public final MplsLdpSessionPeerNextHopAddrEnt mplsLdpSessionPeerNextHopAddr;

                        private MplsLdpSessionPeerAddrEntryEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLdpSessionPeerAddrEntry", "1.3.6.1.2.1.10.166.4.1.3.11.1", false, false, false, true);
                            this.mplsLdpSessionPeerAddrIndex = new MplsLdpSessionPeerAddrIndexEnt(mib, this);
                            this.mplsLdpSessionPeerNextHopAddrType = new MplsLdpSessionPeerNextHopAddrTypeEnt(mib, this);
                            this.mplsLdpSessionPeerNextHopAddr = new MplsLdpSessionPeerNextHopAddrEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsLdpSessionPeerAddrIndex,
                                this.mplsLdpSessionPeerNextHopAddrType,
                                this.mplsLdpSessionPeerNextHopAddr
                            };
                        }
                        public static final class MplsLdpSessionPeerAddrIndexEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpSessionPeerAddrIndexEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpSessionPeerAddrIndex", "1.3.6.1.2.1.10.166.4.1.3.11.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpSessionPeerNextHopAddrTypeEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpSessionPeerNextHopAddrTypeEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpSessionPeerNextHopAddrType", "1.3.6.1.2.1.10.166.4.1.3.11.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpSessionPeerNextHopAddrEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                        {
                            private MplsLdpSessionPeerNextHopAddrEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpSessionPeerNextHopAddr", "1.3.6.1.2.1.10.166.4.1.3.11.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class MplsLdpConformanceEnt extends MIBEntry<MPLSLDPSTDMIBDef>
        {
            /** ****************************************************************Module Conformance Statement*****************************************************************/
            public final MplsLdpGroupsEnt mplsLdpGroups;

            public final MplsLdpCompliancesEnt mplsLdpCompliances;

            private MplsLdpConformanceEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLdpConformance", "1.3.6.1.2.1.10.166.4.2", false, false, false, false);
                this.mplsLdpGroups = new MplsLdpGroupsEnt(mib, this);
                this.mplsLdpCompliances = new MplsLdpCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsLdpGroups,
                    this.mplsLdpCompliances
                };
            }
            public static final class MplsLdpGroupsEnt extends MIBEntry<MPLSLDPSTDMIBDef>
            {
                /** units of conformance*/
                public final MplsLdpGeneralGroupEnt mplsLdpGeneralGroup;

                public final MplsLdpLspGroupEnt mplsLdpLspGroup;

                public final MplsLdpNotificationsGroupEnt mplsLdpNotificationsGroup;

                private MplsLdpGroupsEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpGroups", "1.3.6.1.2.1.10.166.4.2.1", false, false, false, false);
                    this.mplsLdpGeneralGroup = new MplsLdpGeneralGroupEnt(mib, this);
                    this.mplsLdpLspGroup = new MplsLdpLspGroupEnt(mib, this);
                    this.mplsLdpNotificationsGroup = new MplsLdpNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLdpGeneralGroup,
                        this.mplsLdpLspGroup,
                        this.mplsLdpNotificationsGroup
                    };
                }
                public static final class MplsLdpGeneralGroupEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    private MplsLdpGeneralGroupEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpGeneralGroup", "1.3.6.1.2.1.10.166.4.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsLdpLspGroupEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    private MplsLdpLspGroupEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpLspGroup", "1.3.6.1.2.1.10.166.4.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsLdpNotificationsGroupEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    private MplsLdpNotificationsGroupEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpNotificationsGroup", "1.3.6.1.2.1.10.166.4.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MplsLdpCompliancesEnt extends MIBEntry<MPLSLDPSTDMIBDef>
            {
                /** Full Compliance*/
                public final MplsLdpModuleFullComplianceEnt mplsLdpModuleFullCompliance;

                /** Read-Only Compliance*/
                public final MplsLdpModuleReadOnlyComplianceEnt mplsLdpModuleReadOnlyCompliance;

                private MplsLdpCompliancesEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpCompliances", "1.3.6.1.2.1.10.166.4.2.2", false, false, false, false);
                    this.mplsLdpModuleFullCompliance = new MplsLdpModuleFullComplianceEnt(mib, this);
                    this.mplsLdpModuleReadOnlyCompliance = new MplsLdpModuleReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLdpModuleFullCompliance,
                        this.mplsLdpModuleReadOnlyCompliance
                    };
                }
                public static final class MplsLdpModuleFullComplianceEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    private MplsLdpModuleFullComplianceEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpModuleFullCompliance", "1.3.6.1.2.1.10.166.4.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsLdpModuleReadOnlyComplianceEnt extends MIBEntry<MPLSLDPSTDMIBDef>
                {
                    private MplsLdpModuleReadOnlyComplianceEnt(MPLSLDPSTDMIBDef mib, MIBEntry<MPLSLDPSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpModuleReadOnlyCompliance", "1.3.6.1.2.1.10.166.4.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
