package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**RFC2579
RFC2578
RFC2580
RFC2571
RFC3289
RFC2863*/
public final class ISISMIBDef extends MIB
{
    public static final ISISMIBDef ISISMIB = new ISISMIBDef();

    static { MIBs.getInstance().registerMIB(ISISMIBDef.ISISMIB); }

    /** RFC3291

April 4, 2006, midnight*/
    public final IsisMIBEnt isisMIB;

    private ISISMIBDef()
    {
        super("ISIS-MIB");
        this.isisMIB = new IsisMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.isisMIB
        };
    }

    public static final class IsisMIBEnt extends MIBEntry<ISISMIBDef>
    {
        /** Top-level structure of the MIB*/
        public final IsisNotificationsEnt isisNotifications;

        public final IsisObjectsEnt isisObjects;

        public final IsisConformanceEnt isisConformance;

        private IsisMIBEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
        {
            super(mib, parent, "isisMIB", "1.3.6.1.2.1.138", false, false, false, false);
            this.isisNotifications = new IsisNotificationsEnt(mib, this);
            this.isisObjects = new IsisObjectsEnt(mib, this);
            this.isisConformance = new IsisConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.isisNotifications,
                this.isisObjects,
                this.isisConformance
            };
        }
        public static final class IsisNotificationsEnt extends MIBEntry<ISISMIBDef>
        {
            /** Notification definitionsNote that notifications can be disabled by settingisisSysNotificationEnable false*/
            public final IsisDatabaseOverloadEnt isisDatabaseOverload;

            public final IsisManualAddressDropsEnt isisManualAddressDrops;

            public final IsisCorruptedLSPDetectedEnt isisCorruptedLSPDetected;

            public final IsisAttemptToExceedMaxSequenceEnt isisAttemptToExceedMaxSequence;

            public final IsisIDLenMismatchEnt isisIDLenMismatch;

            public final IsisMaxAreaAddressesMismatchEnt isisMaxAreaAddressesMismatch;

            public final IsisOwnLSPPurgeEnt isisOwnLSPPurge;

            public final IsisSequenceNumberSkipEnt isisSequenceNumberSkip;

            public final IsisAuthenticationTypeFailureEnt isisAuthenticationTypeFailure;

            public final IsisAuthenticationFailureEnt isisAuthenticationFailure;

            public final IsisVersionSkewEnt isisVersionSkew;

            public final IsisAreaMismatchEnt isisAreaMismatch;

            public final IsisRejectedAdjacencyEnt isisRejectedAdjacency;

            public final IsisLSPTooLargeToPropagateEnt isisLSPTooLargeToPropagate;

            public final IsisOrigLSPBuffSizeMismatchEnt isisOrigLSPBuffSizeMismatch;

            public final IsisProtocolsSupportedMismatchEnt isisProtocolsSupportedMismatch;

            public final IsisAdjacencyChangeEnt isisAdjacencyChange;

            public final IsisLSPErrorDetectedEnt isisLSPErrorDetected;

            private IsisNotificationsEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
            {
                super(mib, parent, "isisNotifications", "1.3.6.1.2.1.138.0", false, false, false, false);
                this.isisDatabaseOverload = new IsisDatabaseOverloadEnt(mib, this);
                this.isisManualAddressDrops = new IsisManualAddressDropsEnt(mib, this);
                this.isisCorruptedLSPDetected = new IsisCorruptedLSPDetectedEnt(mib, this);
                this.isisAttemptToExceedMaxSequence = new IsisAttemptToExceedMaxSequenceEnt(mib, this);
                this.isisIDLenMismatch = new IsisIDLenMismatchEnt(mib, this);
                this.isisMaxAreaAddressesMismatch = new IsisMaxAreaAddressesMismatchEnt(mib, this);
                this.isisOwnLSPPurge = new IsisOwnLSPPurgeEnt(mib, this);
                this.isisSequenceNumberSkip = new IsisSequenceNumberSkipEnt(mib, this);
                this.isisAuthenticationTypeFailure = new IsisAuthenticationTypeFailureEnt(mib, this);
                this.isisAuthenticationFailure = new IsisAuthenticationFailureEnt(mib, this);
                this.isisVersionSkew = new IsisVersionSkewEnt(mib, this);
                this.isisAreaMismatch = new IsisAreaMismatchEnt(mib, this);
                this.isisRejectedAdjacency = new IsisRejectedAdjacencyEnt(mib, this);
                this.isisLSPTooLargeToPropagate = new IsisLSPTooLargeToPropagateEnt(mib, this);
                this.isisOrigLSPBuffSizeMismatch = new IsisOrigLSPBuffSizeMismatchEnt(mib, this);
                this.isisProtocolsSupportedMismatch = new IsisProtocolsSupportedMismatchEnt(mib, this);
                this.isisAdjacencyChange = new IsisAdjacencyChangeEnt(mib, this);
                this.isisLSPErrorDetected = new IsisLSPErrorDetectedEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.isisDatabaseOverload,
                    this.isisManualAddressDrops,
                    this.isisCorruptedLSPDetected,
                    this.isisAttemptToExceedMaxSequence,
                    this.isisIDLenMismatch,
                    this.isisMaxAreaAddressesMismatch,
                    this.isisOwnLSPPurge,
                    this.isisSequenceNumberSkip,
                    this.isisAuthenticationTypeFailure,
                    this.isisAuthenticationFailure,
                    this.isisVersionSkew,
                    this.isisAreaMismatch,
                    this.isisRejectedAdjacency,
                    this.isisLSPTooLargeToPropagate,
                    this.isisOrigLSPBuffSizeMismatch,
                    this.isisProtocolsSupportedMismatch,
                    this.isisAdjacencyChange,
                    this.isisLSPErrorDetected
                };
            }
            public static final class IsisDatabaseOverloadEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisDatabaseOverloadEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisDatabaseOverload", "1.3.6.1.2.1.138.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsisManualAddressDropsEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisManualAddressDropsEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisManualAddressDrops", "1.3.6.1.2.1.138.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsisCorruptedLSPDetectedEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisCorruptedLSPDetectedEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisCorruptedLSPDetected", "1.3.6.1.2.1.138.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsisAttemptToExceedMaxSequenceEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisAttemptToExceedMaxSequenceEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisAttemptToExceedMaxSequence", "1.3.6.1.2.1.138.0.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsisIDLenMismatchEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisIDLenMismatchEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisIDLenMismatch", "1.3.6.1.2.1.138.0.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsisMaxAreaAddressesMismatchEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisMaxAreaAddressesMismatchEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisMaxAreaAddressesMismatch", "1.3.6.1.2.1.138.0.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsisOwnLSPPurgeEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisOwnLSPPurgeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisOwnLSPPurge", "1.3.6.1.2.1.138.0.7", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsisSequenceNumberSkipEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisSequenceNumberSkipEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisSequenceNumberSkip", "1.3.6.1.2.1.138.0.8", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsisAuthenticationTypeFailureEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisAuthenticationTypeFailureEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisAuthenticationTypeFailure", "1.3.6.1.2.1.138.0.9", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsisAuthenticationFailureEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisAuthenticationFailureEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisAuthenticationFailure", "1.3.6.1.2.1.138.0.10", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsisVersionSkewEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisVersionSkewEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisVersionSkew", "1.3.6.1.2.1.138.0.11", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsisAreaMismatchEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisAreaMismatchEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisAreaMismatch", "1.3.6.1.2.1.138.0.12", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsisRejectedAdjacencyEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisRejectedAdjacencyEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisRejectedAdjacency", "1.3.6.1.2.1.138.0.13", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsisLSPTooLargeToPropagateEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisLSPTooLargeToPropagateEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisLSPTooLargeToPropagate", "1.3.6.1.2.1.138.0.14", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsisOrigLSPBuffSizeMismatchEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisOrigLSPBuffSizeMismatchEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisOrigLSPBuffSizeMismatch", "1.3.6.1.2.1.138.0.15", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsisProtocolsSupportedMismatchEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisProtocolsSupportedMismatchEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisProtocolsSupportedMismatch", "1.3.6.1.2.1.138.0.16", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsisAdjacencyChangeEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisAdjacencyChangeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisAdjacencyChange", "1.3.6.1.2.1.138.0.17", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsisLSPErrorDetectedEnt extends MIBEntry<ISISMIBDef>
            {
                private IsisLSPErrorDetectedEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisLSPErrorDetected", "1.3.6.1.2.1.138.0.18", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class IsisObjectsEnt extends MIBEntry<ISISMIBDef>
        {
            /** OBJECT IDENTIFIER definitions
System wide attributes.*/
            public final IsisSystemEnt isisSystem;

            /** Attributes associated with the domain or with the area.*/
            public final IsisSysLevelEnt isisSysLevel;

            /** Attributes associated with one Circuit*/
            public final IsisCircEnt isisCirc;

            /** Attributes associated with area or domain relevant within a Circuit.*/
            public final IsisCircLevelValuesEnt isisCircLevelValues;

            /** System and circuit counters.*/
            public final IsisCountersEnt isisCounters;

            /** Attributes associated with an adjacent Protocol Peer.*/
            public final IsisISAdjEnt isisISAdj;

            /** Attributes associated with a configured address.*/
            public final IsisReachAddrEnt isisReachAddr;

            /** Attributes associated with IP routes learned byconfiguration or through another protocol.*/
            public final IsisIPReachAddrEnt isisIPReachAddr;

            /** The collection of Link State PDUs known to the Intermediate System*/
            public final IsisLSPDataBaseEnt isisLSPDataBase;

            /** Objects included in Notifications.*/
            public final IsisNotificationEnt isisNotification;

            private IsisObjectsEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
            {
                super(mib, parent, "isisObjects", "1.3.6.1.2.1.138.1", false, false, false, false);
                this.isisSystem = new IsisSystemEnt(mib, this);
                this.isisSysLevel = new IsisSysLevelEnt(mib, this);
                this.isisCirc = new IsisCircEnt(mib, this);
                this.isisCircLevelValues = new IsisCircLevelValuesEnt(mib, this);
                this.isisCounters = new IsisCountersEnt(mib, this);
                this.isisISAdj = new IsisISAdjEnt(mib, this);
                this.isisReachAddr = new IsisReachAddrEnt(mib, this);
                this.isisIPReachAddr = new IsisIPReachAddrEnt(mib, this);
                this.isisLSPDataBase = new IsisLSPDataBaseEnt(mib, this);
                this.isisNotification = new IsisNotificationEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.isisSystem,
                    this.isisSysLevel,
                    this.isisCirc,
                    this.isisCircLevelValues,
                    this.isisCounters,
                    this.isisISAdj,
                    this.isisReachAddr,
                    this.isisIPReachAddr,
                    this.isisLSPDataBase,
                    this.isisNotification
                };
            }
            public static final class IsisSystemEnt extends MIBEntry<ISISMIBDef>
            {
                /** Behavior Definitions
ResettingTimer behavior definition
"This behavior applies to objects that specify the intervalbetween events in the operation of the protocol state machine.If the value of such an object is set to a new value whilethe protocol state machine is in operation, the implementationshall take the necessary steps to ensure that for any timeinterval that was in progress when the value of thecorresponding object was changed, the next expiration of thatinterval takes place the specified time after the originalstart of that interval, or immediately, whichever is later.The precision with which this time shall be implemented shallbe the same as that associated with the basic operation ofthe timer object."
ReplaceOnlyWhileDisabled behavior definition"This behavior applies to objects that may not be modifiedwhile the corresponding table row's variable of typeIsisAdminState is in state on."
ManualOrAutomatic behavior definition"This behavior applies to objects that are read-writeif the object was created manually.  Objects that werecreated automatically that have this behavior areread-only.*/
                public final IsisSysObjectEnt isisSysObject;

                /** The Level 1 Manual Area Address Table*/
                public final IsisManAreaAddrTableEnt isisManAreaAddrTable;

                /** The Level 1 Area Address Table
The Level 1 Area Address Table contains theunion of the sets of relevant area addresses configuredor learned from Level 1 LSPs received by this Intermediate System.*/
                public final IsisAreaAddrTableEnt isisAreaAddrTable;

                /** The Summary Address Table
The Summary Address Table contains the set of summaryaddresses manually configured for the Intermediate System.This is used to control leaking L1 routes into L2.*/
                public final IsisSummAddrTableEnt isisSummAddrTable;

                /** The Redistribution table defines addresses that should beleaked from L2 to L1 if isisSysL2toL1Leaking is enabled.*/
                public final IsisRedistributeAddrTableEnt isisRedistributeAddrTable;

                /** The Router Table keeps track of hostnames and router IDsassociated with Intermediate Systems in the area and domain.*/
                public final IsisRouterTableEnt isisRouterTable;

                private IsisSystemEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisSystem", "1.3.6.1.2.1.138.1.1", false, false, false, false);
                    this.isisSysObject = new IsisSysObjectEnt(mib, this);
                    this.isisManAreaAddrTable = new IsisManAreaAddrTableEnt(mib, this);
                    this.isisAreaAddrTable = new IsisAreaAddrTableEnt(mib, this);
                    this.isisSummAddrTable = new IsisSummAddrTableEnt(mib, this);
                    this.isisRedistributeAddrTable = new IsisRedistributeAddrTableEnt(mib, this);
                    this.isisRouterTable = new IsisRouterTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isisSysObject,
                        this.isisManAreaAddrTable,
                        this.isisAreaAddrTable,
                        this.isisSummAddrTable,
                        this.isisRedistributeAddrTable,
                        this.isisRouterTable
                    };
                }
                public static final class IsisSysObjectEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisSysVersionEnt isisSysVersion;

                    public final IsisSysLevelTypeEnt isisSysLevelType;

                    public final IsisSysIDEnt isisSysID;

                    public final IsisSysMaxPathSplitsEnt isisSysMaxPathSplits;

                    public final IsisSysMaxLSPGenIntEnt isisSysMaxLSPGenInt;

                    public final IsisSysPollESHelloRateEnt isisSysPollESHelloRate;

                    public final IsisSysWaitTimeEnt isisSysWaitTime;

                    public final IsisSysAdminStateEnt isisSysAdminState;

                    public final IsisSysL2toL1LeakingEnt isisSysL2toL1Leaking;

                    public final IsisSysMaxAgeEnt isisSysMaxAge;

                    public final IsisSysReceiveLSPBufferSizeEnt isisSysReceiveLSPBufferSize;

                    public final IsisSysProtSupportedEnt isisSysProtSupported;

                    public final IsisSysNotificationEnableEnt isisSysNotificationEnable;

                    private IsisSysObjectEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisSysObject", "1.3.6.1.2.1.138.1.1.1", false, false, false, false);
                        this.isisSysVersion = new IsisSysVersionEnt(mib, this);
                        this.isisSysLevelType = new IsisSysLevelTypeEnt(mib, this);
                        this.isisSysID = new IsisSysIDEnt(mib, this);
                        this.isisSysMaxPathSplits = new IsisSysMaxPathSplitsEnt(mib, this);
                        this.isisSysMaxLSPGenInt = new IsisSysMaxLSPGenIntEnt(mib, this);
                        this.isisSysPollESHelloRate = new IsisSysPollESHelloRateEnt(mib, this);
                        this.isisSysWaitTime = new IsisSysWaitTimeEnt(mib, this);
                        this.isisSysAdminState = new IsisSysAdminStateEnt(mib, this);
                        this.isisSysL2toL1Leaking = new IsisSysL2toL1LeakingEnt(mib, this);
                        this.isisSysMaxAge = new IsisSysMaxAgeEnt(mib, this);
                        this.isisSysReceiveLSPBufferSize = new IsisSysReceiveLSPBufferSizeEnt(mib, this);
                        this.isisSysProtSupported = new IsisSysProtSupportedEnt(mib, this);
                        this.isisSysNotificationEnable = new IsisSysNotificationEnableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisSysVersion,
                            this.isisSysLevelType,
                            this.isisSysID,
                            this.isisSysMaxPathSplits,
                            this.isisSysMaxLSPGenInt,
                            this.isisSysPollESHelloRate,
                            this.isisSysWaitTime,
                            this.isisSysAdminState,
                            this.isisSysL2toL1Leaking,
                            this.isisSysMaxAge,
                            this.isisSysReceiveLSPBufferSize,
                            this.isisSysProtSupported,
                            this.isisSysNotificationEnable
                        };
                    }
                    public static final class IsisSysVersionEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisSysVersionEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisSysVersion", "1.3.6.1.2.1.138.1.1.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisSysLevelTypeEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisSysLevelTypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisSysLevelType", "1.3.6.1.2.1.138.1.1.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisSysIDEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisSysIDEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisSysID", "1.3.6.1.2.1.138.1.1.1.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisSysMaxPathSplitsEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisSysMaxPathSplitsEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisSysMaxPathSplits", "1.3.6.1.2.1.138.1.1.1.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisSysMaxLSPGenIntEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisSysMaxLSPGenIntEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisSysMaxLSPGenInt", "1.3.6.1.2.1.138.1.1.1.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisSysPollESHelloRateEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisSysPollESHelloRateEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisSysPollESHelloRate", "1.3.6.1.2.1.138.1.1.1.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisSysWaitTimeEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisSysWaitTimeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisSysWaitTime", "1.3.6.1.2.1.138.1.1.1.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisSysAdminStateEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisSysAdminStateEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisSysAdminState", "1.3.6.1.2.1.138.1.1.1.8", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisSysL2toL1LeakingEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisSysL2toL1LeakingEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisSysL2toL1Leaking", "1.3.6.1.2.1.138.1.1.1.9", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisSysMaxAgeEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisSysMaxAgeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisSysMaxAge", "1.3.6.1.2.1.138.1.1.1.10", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisSysReceiveLSPBufferSizeEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisSysReceiveLSPBufferSizeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisSysReceiveLSPBufferSize", "1.3.6.1.2.1.138.1.1.1.11", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisSysProtSupportedEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisSysProtSupportedEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisSysProtSupported", "1.3.6.1.2.1.138.1.1.1.12", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisSysNotificationEnableEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisSysNotificationEnableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisSysNotificationEnable", "1.3.6.1.2.1.138.1.1.1.13", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class IsisManAreaAddrTableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisManAreaAddrEntryEnt isisManAreaAddrEntry;

                    private IsisManAreaAddrTableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisManAreaAddrTable", "1.3.6.1.2.1.138.1.1.2", false, true, false, false);
                        this.isisManAreaAddrEntry = new IsisManAreaAddrEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisManAreaAddrEntry
                        };
                    }
                    public static final class IsisManAreaAddrEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisManAreaAddrEnt isisManAreaAddr;

                        public final IsisManAreaAddrExistStateEnt isisManAreaAddrExistState;

                        private IsisManAreaAddrEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisManAreaAddrEntry", "1.3.6.1.2.1.138.1.1.2.1", false, false, false, true);
                            this.isisManAreaAddr = new IsisManAreaAddrEnt(mib, this);
                            this.isisManAreaAddrExistState = new IsisManAreaAddrExistStateEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisManAreaAddr,
                                this.isisManAreaAddrExistState
                            };
                        }
                        public static final class IsisManAreaAddrEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisManAreaAddrEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisManAreaAddr", "1.3.6.1.2.1.138.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisManAreaAddrExistStateEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisManAreaAddrExistStateEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisManAreaAddrExistState", "1.3.6.1.2.1.138.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IsisAreaAddrTableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisAreaAddrEntryEnt isisAreaAddrEntry;

                    private IsisAreaAddrTableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisAreaAddrTable", "1.3.6.1.2.1.138.1.1.3", false, true, false, false);
                        this.isisAreaAddrEntry = new IsisAreaAddrEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisAreaAddrEntry
                        };
                    }
                    public static final class IsisAreaAddrEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisAreaAddrEnt isisAreaAddr;

                        private IsisAreaAddrEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisAreaAddrEntry", "1.3.6.1.2.1.138.1.1.3.1", false, false, false, true);
                            this.isisAreaAddr = new IsisAreaAddrEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisAreaAddr
                            };
                        }
                        public static final class IsisAreaAddrEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisAreaAddrEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisAreaAddr", "1.3.6.1.2.1.138.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IsisSummAddrTableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisSummAddrEntryEnt isisSummAddrEntry;

                    private IsisSummAddrTableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisSummAddrTable", "1.3.6.1.2.1.138.1.1.4", false, true, false, false);
                        this.isisSummAddrEntry = new IsisSummAddrEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisSummAddrEntry
                        };
                    }
                    public static final class IsisSummAddrEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisSummAddressTypeEnt isisSummAddressType;

                        public final IsisSummAddressEnt isisSummAddress;

                        public final IsisSummAddrPrefixLenEnt isisSummAddrPrefixLen;

                        public final IsisSummAddrExistStateEnt isisSummAddrExistState;

                        public final IsisSummAddrMetricEnt isisSummAddrMetric;

                        public final IsisSummAddrFullMetricEnt isisSummAddrFullMetric;

                        private IsisSummAddrEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisSummAddrEntry", "1.3.6.1.2.1.138.1.1.4.1", false, false, false, true);
                            this.isisSummAddressType = new IsisSummAddressTypeEnt(mib, this);
                            this.isisSummAddress = new IsisSummAddressEnt(mib, this);
                            this.isisSummAddrPrefixLen = new IsisSummAddrPrefixLenEnt(mib, this);
                            this.isisSummAddrExistState = new IsisSummAddrExistStateEnt(mib, this);
                            this.isisSummAddrMetric = new IsisSummAddrMetricEnt(mib, this);
                            this.isisSummAddrFullMetric = new IsisSummAddrFullMetricEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisSummAddressType,
                                this.isisSummAddress,
                                this.isisSummAddrPrefixLen,
                                this.isisSummAddrExistState,
                                this.isisSummAddrMetric,
                                this.isisSummAddrFullMetric
                            };
                        }
                        public static final class IsisSummAddressTypeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSummAddressTypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSummAddressType", "1.3.6.1.2.1.138.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSummAddressEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSummAddressEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSummAddress", "1.3.6.1.2.1.138.1.1.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSummAddrPrefixLenEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSummAddrPrefixLenEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSummAddrPrefixLen", "1.3.6.1.2.1.138.1.1.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSummAddrExistStateEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSummAddrExistStateEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSummAddrExistState", "1.3.6.1.2.1.138.1.1.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSummAddrMetricEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSummAddrMetricEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSummAddrMetric", "1.3.6.1.2.1.138.1.1.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSummAddrFullMetricEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSummAddrFullMetricEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSummAddrFullMetric", "1.3.6.1.2.1.138.1.1.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IsisRedistributeAddrTableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisRedistributeAddrEntryEnt isisRedistributeAddrEntry;

                    private IsisRedistributeAddrTableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisRedistributeAddrTable", "1.3.6.1.2.1.138.1.1.5", false, true, false, false);
                        this.isisRedistributeAddrEntry = new IsisRedistributeAddrEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisRedistributeAddrEntry
                        };
                    }
                    public static final class IsisRedistributeAddrEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisRedistributeAddrTypeEnt isisRedistributeAddrType;

                        public final IsisRedistributeAddrAddressEnt isisRedistributeAddrAddress;

                        public final IsisRedistributeAddrPrefixLenEnt isisRedistributeAddrPrefixLen;

                        public final IsisRedistributeAddrExistStateEnt isisRedistributeAddrExistState;

                        private IsisRedistributeAddrEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisRedistributeAddrEntry", "1.3.6.1.2.1.138.1.1.5.1", false, false, false, true);
                            this.isisRedistributeAddrType = new IsisRedistributeAddrTypeEnt(mib, this);
                            this.isisRedistributeAddrAddress = new IsisRedistributeAddrAddressEnt(mib, this);
                            this.isisRedistributeAddrPrefixLen = new IsisRedistributeAddrPrefixLenEnt(mib, this);
                            this.isisRedistributeAddrExistState = new IsisRedistributeAddrExistStateEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisRedistributeAddrType,
                                this.isisRedistributeAddrAddress,
                                this.isisRedistributeAddrPrefixLen,
                                this.isisRedistributeAddrExistState
                            };
                        }
                        public static final class IsisRedistributeAddrTypeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRedistributeAddrTypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRedistributeAddrType", "1.3.6.1.2.1.138.1.1.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisRedistributeAddrAddressEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRedistributeAddrAddressEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRedistributeAddrAddress", "1.3.6.1.2.1.138.1.1.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisRedistributeAddrPrefixLenEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRedistributeAddrPrefixLenEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRedistributeAddrPrefixLen", "1.3.6.1.2.1.138.1.1.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisRedistributeAddrExistStateEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRedistributeAddrExistStateEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRedistributeAddrExistState", "1.3.6.1.2.1.138.1.1.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IsisRouterTableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisRouterEntryEnt isisRouterEntry;

                    private IsisRouterTableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisRouterTable", "1.3.6.1.2.1.138.1.1.6", false, true, false, false);
                        this.isisRouterEntry = new IsisRouterEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisRouterEntry
                        };
                    }
                    public static final class IsisRouterEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisRouterSysIDEnt isisRouterSysID;

                        public final IsisRouterLevelEnt isisRouterLevel;

                        public final IsisRouterHostNameEnt isisRouterHostName;

                        public final IsisRouterIDEnt isisRouterID;

                        private IsisRouterEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisRouterEntry", "1.3.6.1.2.1.138.1.1.6.1", false, false, false, true);
                            this.isisRouterSysID = new IsisRouterSysIDEnt(mib, this);
                            this.isisRouterLevel = new IsisRouterLevelEnt(mib, this);
                            this.isisRouterHostName = new IsisRouterHostNameEnt(mib, this);
                            this.isisRouterID = new IsisRouterIDEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisRouterSysID,
                                this.isisRouterLevel,
                                this.isisRouterHostName,
                                this.isisRouterID
                            };
                        }
                        public static final class IsisRouterSysIDEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRouterSysIDEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRouterSysID", "1.3.6.1.2.1.138.1.1.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisRouterLevelEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRouterLevelEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRouterLevel", "1.3.6.1.2.1.138.1.1.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisRouterHostNameEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRouterHostNameEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRouterHostName", "1.3.6.1.2.1.138.1.1.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisRouterIDEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRouterIDEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRouterID", "1.3.6.1.2.1.138.1.1.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IsisSysLevelEnt extends MIBEntry<ISISMIBDef>
            {
                /** The System Level TableThis table captures level-specific information about the system*/
                public final IsisSysLevelTableEnt isisSysLevelTable;

                private IsisSysLevelEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisSysLevel", "1.3.6.1.2.1.138.1.2", false, false, false, false);
                    this.isisSysLevelTable = new IsisSysLevelTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isisSysLevelTable
                    };
                }
                public static final class IsisSysLevelTableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisSysLevelEntryEnt isisSysLevelEntry;

                    private IsisSysLevelTableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisSysLevelTable", "1.3.6.1.2.1.138.1.2.1", false, true, false, false);
                        this.isisSysLevelEntry = new IsisSysLevelEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisSysLevelEntry
                        };
                    }
                    public static final class IsisSysLevelEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisSysLevelIndexEnt isisSysLevelIndex;

                        public final IsisSysLevelOrigLSPBuffSizeEnt isisSysLevelOrigLSPBuffSize;

                        public final IsisSysLevelMinLSPGenIntEnt isisSysLevelMinLSPGenInt;

                        public final IsisSysLevelStateEnt isisSysLevelState;

                        public final IsisSysLevelSetOverloadEnt isisSysLevelSetOverload;

                        public final IsisSysLevelSetOverloadUntilEnt isisSysLevelSetOverloadUntil;

                        public final IsisSysLevelMetricStyleEnt isisSysLevelMetricStyle;

                        public final IsisSysLevelSPFConsidersEnt isisSysLevelSPFConsiders;

                        public final IsisSysLevelTEEnabledEnt isisSysLevelTEEnabled;

                        private IsisSysLevelEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisSysLevelEntry", "1.3.6.1.2.1.138.1.2.1.1", false, false, false, true);
                            this.isisSysLevelIndex = new IsisSysLevelIndexEnt(mib, this);
                            this.isisSysLevelOrigLSPBuffSize = new IsisSysLevelOrigLSPBuffSizeEnt(mib, this);
                            this.isisSysLevelMinLSPGenInt = new IsisSysLevelMinLSPGenIntEnt(mib, this);
                            this.isisSysLevelState = new IsisSysLevelStateEnt(mib, this);
                            this.isisSysLevelSetOverload = new IsisSysLevelSetOverloadEnt(mib, this);
                            this.isisSysLevelSetOverloadUntil = new IsisSysLevelSetOverloadUntilEnt(mib, this);
                            this.isisSysLevelMetricStyle = new IsisSysLevelMetricStyleEnt(mib, this);
                            this.isisSysLevelSPFConsiders = new IsisSysLevelSPFConsidersEnt(mib, this);
                            this.isisSysLevelTEEnabled = new IsisSysLevelTEEnabledEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisSysLevelIndex,
                                this.isisSysLevelOrigLSPBuffSize,
                                this.isisSysLevelMinLSPGenInt,
                                this.isisSysLevelState,
                                this.isisSysLevelSetOverload,
                                this.isisSysLevelSetOverloadUntil,
                                this.isisSysLevelMetricStyle,
                                this.isisSysLevelSPFConsiders,
                                this.isisSysLevelTEEnabled
                            };
                        }
                        public static final class IsisSysLevelIndexEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysLevelIndexEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysLevelIndex", "1.3.6.1.2.1.138.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysLevelOrigLSPBuffSizeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysLevelOrigLSPBuffSizeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysLevelOrigLSPBuffSize", "1.3.6.1.2.1.138.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysLevelMinLSPGenIntEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysLevelMinLSPGenIntEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysLevelMinLSPGenInt", "1.3.6.1.2.1.138.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysLevelStateEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysLevelStateEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysLevelState", "1.3.6.1.2.1.138.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysLevelSetOverloadEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysLevelSetOverloadEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysLevelSetOverload", "1.3.6.1.2.1.138.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysLevelSetOverloadUntilEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysLevelSetOverloadUntilEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysLevelSetOverloadUntil", "1.3.6.1.2.1.138.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysLevelMetricStyleEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysLevelMetricStyleEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysLevelMetricStyle", "1.3.6.1.2.1.138.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysLevelSPFConsidersEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysLevelSPFConsidersEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysLevelSPFConsiders", "1.3.6.1.2.1.138.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysLevelTEEnabledEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysLevelTEEnabledEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysLevelTEEnabled", "1.3.6.1.2.1.138.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IsisCircEnt extends MIBEntry<ISISMIBDef>
            {
                /** Static to provide next CircIndex*/
                public final IsisNextCircIndexEnt isisNextCircIndex;

                /** The Circuit TableEach broadcast or point-to-point interface on the systemcorresponds to one entry in the Circuit table.  However, theremay be multiple X.25 DA circuit entries in the Circuit tablefor a given X.25 interface.*/
                public final IsisCircTableEnt isisCircTable;

                private IsisCircEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisCirc", "1.3.6.1.2.1.138.1.3", false, false, false, false);
                    this.isisNextCircIndex = new IsisNextCircIndexEnt(mib, this);
                    this.isisCircTable = new IsisCircTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isisNextCircIndex,
                        this.isisCircTable
                    };
                }
                public static final class IsisNextCircIndexEnt extends MIBEntry<ISISMIBDef>
                {
                    private IsisNextCircIndexEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisNextCircIndex", "1.3.6.1.2.1.138.1.3.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsisCircTableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisCircEntryEnt isisCircEntry;

                    private IsisCircTableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisCircTable", "1.3.6.1.2.1.138.1.3.2", false, true, false, false);
                        this.isisCircEntry = new IsisCircEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisCircEntry
                        };
                    }
                    public static final class IsisCircEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisCircIndexEnt isisCircIndex;

                        public final IsisCircIfIndexEnt isisCircIfIndex;

                        public final IsisCircAdminStateEnt isisCircAdminState;

                        public final IsisCircExistStateEnt isisCircExistState;

                        public final IsisCircTypeEnt isisCircType;

                        public final IsisCircExtDomainEnt isisCircExtDomain;

                        public final IsisCircLevelTypeEnt isisCircLevelType;

                        public final IsisCircPassiveCircuitEnt isisCircPassiveCircuit;

                        public final IsisCircMeshGroupEnabledEnt isisCircMeshGroupEnabled;

                        public final IsisCircMeshGroupEnt isisCircMeshGroup;

                        public final IsisCircSmallHellosEnt isisCircSmallHellos;

                        public final IsisCircLastUpTimeEnt isisCircLastUpTime;

                        public final IsisCirc3WayEnabledEnt isisCirc3WayEnabled;

                        public final IsisCircExtendedCircIDEnt isisCircExtendedCircID;

                        private IsisCircEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisCircEntry", "1.3.6.1.2.1.138.1.3.2.1", false, false, false, true);
                            this.isisCircIndex = new IsisCircIndexEnt(mib, this);
                            this.isisCircIfIndex = new IsisCircIfIndexEnt(mib, this);
                            this.isisCircAdminState = new IsisCircAdminStateEnt(mib, this);
                            this.isisCircExistState = new IsisCircExistStateEnt(mib, this);
                            this.isisCircType = new IsisCircTypeEnt(mib, this);
                            this.isisCircExtDomain = new IsisCircExtDomainEnt(mib, this);
                            this.isisCircLevelType = new IsisCircLevelTypeEnt(mib, this);
                            this.isisCircPassiveCircuit = new IsisCircPassiveCircuitEnt(mib, this);
                            this.isisCircMeshGroupEnabled = new IsisCircMeshGroupEnabledEnt(mib, this);
                            this.isisCircMeshGroup = new IsisCircMeshGroupEnt(mib, this);
                            this.isisCircSmallHellos = new IsisCircSmallHellosEnt(mib, this);
                            this.isisCircLastUpTime = new IsisCircLastUpTimeEnt(mib, this);
                            this.isisCirc3WayEnabled = new IsisCirc3WayEnabledEnt(mib, this);
                            this.isisCircExtendedCircID = new IsisCircExtendedCircIDEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisCircIndex,
                                this.isisCircIfIndex,
                                this.isisCircAdminState,
                                this.isisCircExistState,
                                this.isisCircType,
                                this.isisCircExtDomain,
                                this.isisCircLevelType,
                                this.isisCircPassiveCircuit,
                                this.isisCircMeshGroupEnabled,
                                this.isisCircMeshGroup,
                                this.isisCircSmallHellos,
                                this.isisCircLastUpTime,
                                this.isisCirc3WayEnabled,
                                this.isisCircExtendedCircID
                            };
                        }
                        public static final class IsisCircIndexEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircIndexEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircIndex", "1.3.6.1.2.1.138.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircIfIndexEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircIfIndexEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircIfIndex", "1.3.6.1.2.1.138.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircAdminStateEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircAdminStateEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircAdminState", "1.3.6.1.2.1.138.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircExistStateEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircExistStateEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircExistState", "1.3.6.1.2.1.138.1.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircTypeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircTypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircType", "1.3.6.1.2.1.138.1.3.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircExtDomainEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircExtDomainEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircExtDomain", "1.3.6.1.2.1.138.1.3.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircLevelTypeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircLevelTypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircLevelType", "1.3.6.1.2.1.138.1.3.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircPassiveCircuitEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircPassiveCircuitEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircPassiveCircuit", "1.3.6.1.2.1.138.1.3.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircMeshGroupEnabledEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircMeshGroupEnabledEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircMeshGroupEnabled", "1.3.6.1.2.1.138.1.3.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircMeshGroupEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircMeshGroupEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircMeshGroup", "1.3.6.1.2.1.138.1.3.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircSmallHellosEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircSmallHellosEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircSmallHellos", "1.3.6.1.2.1.138.1.3.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircLastUpTimeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircLastUpTimeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircLastUpTime", "1.3.6.1.2.1.138.1.3.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCirc3WayEnabledEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCirc3WayEnabledEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCirc3WayEnabled", "1.3.6.1.2.1.138.1.3.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircExtendedCircIDEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircExtendedCircIDEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircExtendedCircID", "1.3.6.1.2.1.138.1.3.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IsisCircLevelValuesEnt extends MIBEntry<ISISMIBDef>
            {
                /** The Circuit Level TableThis table captures level-specific information about a circuit*/
                public final IsisCircLevelTableEnt isisCircLevelTable;

                private IsisCircLevelValuesEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisCircLevelValues", "1.3.6.1.2.1.138.1.4", false, false, false, false);
                    this.isisCircLevelTable = new IsisCircLevelTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isisCircLevelTable
                    };
                }
                public static final class IsisCircLevelTableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisCircLevelEntryEnt isisCircLevelEntry;

                    private IsisCircLevelTableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisCircLevelTable", "1.3.6.1.2.1.138.1.4.1", false, true, false, false);
                        this.isisCircLevelEntry = new IsisCircLevelEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisCircLevelEntry
                        };
                    }
                    public static final class IsisCircLevelEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisCircLevelIndexEnt isisCircLevelIndex;

                        public final IsisCircLevelMetricEnt isisCircLevelMetric;

                        public final IsisCircLevelWideMetricEnt isisCircLevelWideMetric;

                        public final IsisCircLevelISPriorityEnt isisCircLevelISPriority;

                        public final IsisCircLevelIDOctetEnt isisCircLevelIDOctet;

                        public final IsisCircLevelIDEnt isisCircLevelID;

                        public final IsisCircLevelDesISEnt isisCircLevelDesIS;

                        public final IsisCircLevelHelloMultiplierEnt isisCircLevelHelloMultiplier;

                        public final IsisCircLevelHelloTimerEnt isisCircLevelHelloTimer;

                        public final IsisCircLevelDRHelloTimerEnt isisCircLevelDRHelloTimer;

                        public final IsisCircLevelLSPThrottleEnt isisCircLevelLSPThrottle;

                        public final IsisCircLevelMinLSPRetransIntEnt isisCircLevelMinLSPRetransInt;

                        public final IsisCircLevelCSNPIntervalEnt isisCircLevelCSNPInterval;

                        public final IsisCircLevelPartSNPIntervalEnt isisCircLevelPartSNPInterval;

                        private IsisCircLevelEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisCircLevelEntry", "1.3.6.1.2.1.138.1.4.1.1", false, false, false, true);
                            this.isisCircLevelIndex = new IsisCircLevelIndexEnt(mib, this);
                            this.isisCircLevelMetric = new IsisCircLevelMetricEnt(mib, this);
                            this.isisCircLevelWideMetric = new IsisCircLevelWideMetricEnt(mib, this);
                            this.isisCircLevelISPriority = new IsisCircLevelISPriorityEnt(mib, this);
                            this.isisCircLevelIDOctet = new IsisCircLevelIDOctetEnt(mib, this);
                            this.isisCircLevelID = new IsisCircLevelIDEnt(mib, this);
                            this.isisCircLevelDesIS = new IsisCircLevelDesISEnt(mib, this);
                            this.isisCircLevelHelloMultiplier = new IsisCircLevelHelloMultiplierEnt(mib, this);
                            this.isisCircLevelHelloTimer = new IsisCircLevelHelloTimerEnt(mib, this);
                            this.isisCircLevelDRHelloTimer = new IsisCircLevelDRHelloTimerEnt(mib, this);
                            this.isisCircLevelLSPThrottle = new IsisCircLevelLSPThrottleEnt(mib, this);
                            this.isisCircLevelMinLSPRetransInt = new IsisCircLevelMinLSPRetransIntEnt(mib, this);
                            this.isisCircLevelCSNPInterval = new IsisCircLevelCSNPIntervalEnt(mib, this);
                            this.isisCircLevelPartSNPInterval = new IsisCircLevelPartSNPIntervalEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisCircLevelIndex,
                                this.isisCircLevelMetric,
                                this.isisCircLevelWideMetric,
                                this.isisCircLevelISPriority,
                                this.isisCircLevelIDOctet,
                                this.isisCircLevelID,
                                this.isisCircLevelDesIS,
                                this.isisCircLevelHelloMultiplier,
                                this.isisCircLevelHelloTimer,
                                this.isisCircLevelDRHelloTimer,
                                this.isisCircLevelLSPThrottle,
                                this.isisCircLevelMinLSPRetransInt,
                                this.isisCircLevelCSNPInterval,
                                this.isisCircLevelPartSNPInterval
                            };
                        }
                        public static final class IsisCircLevelIndexEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircLevelIndexEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircLevelIndex", "1.3.6.1.2.1.138.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircLevelMetricEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircLevelMetricEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircLevelMetric", "1.3.6.1.2.1.138.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircLevelWideMetricEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircLevelWideMetricEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircLevelWideMetric", "1.3.6.1.2.1.138.1.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircLevelISPriorityEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircLevelISPriorityEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircLevelISPriority", "1.3.6.1.2.1.138.1.4.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircLevelIDOctetEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircLevelIDOctetEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircLevelIDOctet", "1.3.6.1.2.1.138.1.4.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircLevelIDEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircLevelIDEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircLevelID", "1.3.6.1.2.1.138.1.4.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircLevelDesISEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircLevelDesISEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircLevelDesIS", "1.3.6.1.2.1.138.1.4.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircLevelHelloMultiplierEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircLevelHelloMultiplierEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircLevelHelloMultiplier", "1.3.6.1.2.1.138.1.4.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircLevelHelloTimerEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircLevelHelloTimerEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircLevelHelloTimer", "1.3.6.1.2.1.138.1.4.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircLevelDRHelloTimerEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircLevelDRHelloTimerEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircLevelDRHelloTimer", "1.3.6.1.2.1.138.1.4.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircLevelLSPThrottleEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircLevelLSPThrottleEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircLevelLSPThrottle", "1.3.6.1.2.1.138.1.4.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircLevelMinLSPRetransIntEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircLevelMinLSPRetransIntEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircLevelMinLSPRetransInt", "1.3.6.1.2.1.138.1.4.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircLevelCSNPIntervalEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircLevelCSNPIntervalEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircLevelCSNPInterval", "1.3.6.1.2.1.138.1.4.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircLevelPartSNPIntervalEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircLevelPartSNPIntervalEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircLevelPartSNPInterval", "1.3.6.1.2.1.138.1.4.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IsisCountersEnt extends MIBEntry<ISISMIBDef>
            {
                /** isisSystemCounterTable keeps track of system-wide events.*/
                public final IsisSystemCounterTableEnt isisSystemCounterTable;

                /** isisCircuitCounterTable keeps track of eventsspecific to a circuit and a level*/
                public final IsisCircuitCounterTableEnt isisCircuitCounterTable;

                /** isisPacketCounterTable keeps track of the number of IS-IScontrol packets sent and received at each level*/
                public final IsisPacketCounterTableEnt isisPacketCounterTable;

                private IsisCountersEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisCounters", "1.3.6.1.2.1.138.1.5", false, false, false, false);
                    this.isisSystemCounterTable = new IsisSystemCounterTableEnt(mib, this);
                    this.isisCircuitCounterTable = new IsisCircuitCounterTableEnt(mib, this);
                    this.isisPacketCounterTable = new IsisPacketCounterTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isisSystemCounterTable,
                        this.isisCircuitCounterTable,
                        this.isisPacketCounterTable
                    };
                }
                public static final class IsisSystemCounterTableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisSystemCounterEntryEnt isisSystemCounterEntry;

                    private IsisSystemCounterTableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisSystemCounterTable", "1.3.6.1.2.1.138.1.5.1", false, true, false, false);
                        this.isisSystemCounterEntry = new IsisSystemCounterEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisSystemCounterEntry
                        };
                    }
                    public static final class IsisSystemCounterEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisSysStatLevelEnt isisSysStatLevel;

                        public final IsisSysStatCorrLSPsEnt isisSysStatCorrLSPs;

                        public final IsisSysStatAuthTypeFailsEnt isisSysStatAuthTypeFails;

                        public final IsisSysStatAuthFailsEnt isisSysStatAuthFails;

                        public final IsisSysStatLSPDbaseOloadsEnt isisSysStatLSPDbaseOloads;

                        public final IsisSysStatManAddrDropFromAreasEnt isisSysStatManAddrDropFromAreas;

                        public final IsisSysStatAttmptToExMaxSeqNumsEnt isisSysStatAttmptToExMaxSeqNums;

                        public final IsisSysStatSeqNumSkipsEnt isisSysStatSeqNumSkips;

                        public final IsisSysStatOwnLSPPurgesEnt isisSysStatOwnLSPPurges;

                        public final IsisSysStatIDFieldLenMismatchesEnt isisSysStatIDFieldLenMismatches;

                        public final IsisSysStatPartChangesEnt isisSysStatPartChanges;

                        public final IsisSysStatSPFRunsEnt isisSysStatSPFRuns;

                        public final IsisSysStatLSPErrorsEnt isisSysStatLSPErrors;

                        private IsisSystemCounterEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisSystemCounterEntry", "1.3.6.1.2.1.138.1.5.1.1", false, false, false, true);
                            this.isisSysStatLevel = new IsisSysStatLevelEnt(mib, this);
                            this.isisSysStatCorrLSPs = new IsisSysStatCorrLSPsEnt(mib, this);
                            this.isisSysStatAuthTypeFails = new IsisSysStatAuthTypeFailsEnt(mib, this);
                            this.isisSysStatAuthFails = new IsisSysStatAuthFailsEnt(mib, this);
                            this.isisSysStatLSPDbaseOloads = new IsisSysStatLSPDbaseOloadsEnt(mib, this);
                            this.isisSysStatManAddrDropFromAreas = new IsisSysStatManAddrDropFromAreasEnt(mib, this);
                            this.isisSysStatAttmptToExMaxSeqNums = new IsisSysStatAttmptToExMaxSeqNumsEnt(mib, this);
                            this.isisSysStatSeqNumSkips = new IsisSysStatSeqNumSkipsEnt(mib, this);
                            this.isisSysStatOwnLSPPurges = new IsisSysStatOwnLSPPurgesEnt(mib, this);
                            this.isisSysStatIDFieldLenMismatches = new IsisSysStatIDFieldLenMismatchesEnt(mib, this);
                            this.isisSysStatPartChanges = new IsisSysStatPartChangesEnt(mib, this);
                            this.isisSysStatSPFRuns = new IsisSysStatSPFRunsEnt(mib, this);
                            this.isisSysStatLSPErrors = new IsisSysStatLSPErrorsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisSysStatLevel,
                                this.isisSysStatCorrLSPs,
                                this.isisSysStatAuthTypeFails,
                                this.isisSysStatAuthFails,
                                this.isisSysStatLSPDbaseOloads,
                                this.isisSysStatManAddrDropFromAreas,
                                this.isisSysStatAttmptToExMaxSeqNums,
                                this.isisSysStatSeqNumSkips,
                                this.isisSysStatOwnLSPPurges,
                                this.isisSysStatIDFieldLenMismatches,
                                this.isisSysStatPartChanges,
                                this.isisSysStatSPFRuns,
                                this.isisSysStatLSPErrors
                            };
                        }
                        public static final class IsisSysStatLevelEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysStatLevelEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysStatLevel", "1.3.6.1.2.1.138.1.5.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysStatCorrLSPsEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysStatCorrLSPsEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysStatCorrLSPs", "1.3.6.1.2.1.138.1.5.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysStatAuthTypeFailsEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysStatAuthTypeFailsEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysStatAuthTypeFails", "1.3.6.1.2.1.138.1.5.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysStatAuthFailsEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysStatAuthFailsEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysStatAuthFails", "1.3.6.1.2.1.138.1.5.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysStatLSPDbaseOloadsEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysStatLSPDbaseOloadsEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysStatLSPDbaseOloads", "1.3.6.1.2.1.138.1.5.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysStatManAddrDropFromAreasEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysStatManAddrDropFromAreasEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysStatManAddrDropFromAreas", "1.3.6.1.2.1.138.1.5.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysStatAttmptToExMaxSeqNumsEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysStatAttmptToExMaxSeqNumsEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysStatAttmptToExMaxSeqNums", "1.3.6.1.2.1.138.1.5.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysStatSeqNumSkipsEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysStatSeqNumSkipsEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysStatSeqNumSkips", "1.3.6.1.2.1.138.1.5.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysStatOwnLSPPurgesEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysStatOwnLSPPurgesEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysStatOwnLSPPurges", "1.3.6.1.2.1.138.1.5.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysStatIDFieldLenMismatchesEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysStatIDFieldLenMismatchesEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysStatIDFieldLenMismatches", "1.3.6.1.2.1.138.1.5.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysStatPartChangesEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysStatPartChangesEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysStatPartChanges", "1.3.6.1.2.1.138.1.5.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysStatSPFRunsEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysStatSPFRunsEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysStatSPFRuns", "1.3.6.1.2.1.138.1.5.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisSysStatLSPErrorsEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisSysStatLSPErrorsEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisSysStatLSPErrors", "1.3.6.1.2.1.138.1.5.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IsisCircuitCounterTableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisCircuitCounterEntryEnt isisCircuitCounterEntry;

                    private IsisCircuitCounterTableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisCircuitCounterTable", "1.3.6.1.2.1.138.1.5.2", false, true, false, false);
                        this.isisCircuitCounterEntry = new IsisCircuitCounterEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisCircuitCounterEntry
                        };
                    }
                    public static final class IsisCircuitCounterEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisCircuitTypeEnt isisCircuitType;

                        public final IsisCircAdjChangesEnt isisCircAdjChanges;

                        public final IsisCircNumAdjEnt isisCircNumAdj;

                        public final IsisCircInitFailsEnt isisCircInitFails;

                        public final IsisCircRejAdjsEnt isisCircRejAdjs;

                        public final IsisCircIDFieldLenMismatchesEnt isisCircIDFieldLenMismatches;

                        public final IsisCircMaxAreaAddrMismatchesEnt isisCircMaxAreaAddrMismatches;

                        public final IsisCircAuthTypeFailsEnt isisCircAuthTypeFails;

                        public final IsisCircAuthFailsEnt isisCircAuthFails;

                        public final IsisCircLANDesISChangesEnt isisCircLANDesISChanges;

                        private IsisCircuitCounterEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisCircuitCounterEntry", "1.3.6.1.2.1.138.1.5.2.1", false, false, false, true);
                            this.isisCircuitType = new IsisCircuitTypeEnt(mib, this);
                            this.isisCircAdjChanges = new IsisCircAdjChangesEnt(mib, this);
                            this.isisCircNumAdj = new IsisCircNumAdjEnt(mib, this);
                            this.isisCircInitFails = new IsisCircInitFailsEnt(mib, this);
                            this.isisCircRejAdjs = new IsisCircRejAdjsEnt(mib, this);
                            this.isisCircIDFieldLenMismatches = new IsisCircIDFieldLenMismatchesEnt(mib, this);
                            this.isisCircMaxAreaAddrMismatches = new IsisCircMaxAreaAddrMismatchesEnt(mib, this);
                            this.isisCircAuthTypeFails = new IsisCircAuthTypeFailsEnt(mib, this);
                            this.isisCircAuthFails = new IsisCircAuthFailsEnt(mib, this);
                            this.isisCircLANDesISChanges = new IsisCircLANDesISChangesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisCircuitType,
                                this.isisCircAdjChanges,
                                this.isisCircNumAdj,
                                this.isisCircInitFails,
                                this.isisCircRejAdjs,
                                this.isisCircIDFieldLenMismatches,
                                this.isisCircMaxAreaAddrMismatches,
                                this.isisCircAuthTypeFails,
                                this.isisCircAuthFails,
                                this.isisCircLANDesISChanges
                            };
                        }
                        public static final class IsisCircuitTypeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircuitTypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircuitType", "1.3.6.1.2.1.138.1.5.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircAdjChangesEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircAdjChangesEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircAdjChanges", "1.3.6.1.2.1.138.1.5.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircNumAdjEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircNumAdjEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircNumAdj", "1.3.6.1.2.1.138.1.5.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircInitFailsEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircInitFailsEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircInitFails", "1.3.6.1.2.1.138.1.5.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircRejAdjsEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircRejAdjsEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircRejAdjs", "1.3.6.1.2.1.138.1.5.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircIDFieldLenMismatchesEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircIDFieldLenMismatchesEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircIDFieldLenMismatches", "1.3.6.1.2.1.138.1.5.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircMaxAreaAddrMismatchesEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircMaxAreaAddrMismatchesEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircMaxAreaAddrMismatches", "1.3.6.1.2.1.138.1.5.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircAuthTypeFailsEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircAuthTypeFailsEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircAuthTypeFails", "1.3.6.1.2.1.138.1.5.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircAuthFailsEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircAuthFailsEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircAuthFails", "1.3.6.1.2.1.138.1.5.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisCircLANDesISChangesEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisCircLANDesISChangesEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisCircLANDesISChanges", "1.3.6.1.2.1.138.1.5.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IsisPacketCounterTableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisPacketCounterEntryEnt isisPacketCounterEntry;

                    private IsisPacketCounterTableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisPacketCounterTable", "1.3.6.1.2.1.138.1.5.3", false, true, false, false);
                        this.isisPacketCounterEntry = new IsisPacketCounterEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisPacketCounterEntry
                        };
                    }
                    public static final class IsisPacketCounterEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisPacketCountLevelEnt isisPacketCountLevel;

                        public final IsisPacketCountDirectionEnt isisPacketCountDirection;

                        public final IsisPacketCountIIHelloEnt isisPacketCountIIHello;

                        public final IsisPacketCountISHelloEnt isisPacketCountISHello;

                        public final IsisPacketCountESHelloEnt isisPacketCountESHello;

                        public final IsisPacketCountLSPEnt isisPacketCountLSP;

                        public final IsisPacketCountCSNPEnt isisPacketCountCSNP;

                        public final IsisPacketCountPSNPEnt isisPacketCountPSNP;

                        public final IsisPacketCountUnknownEnt isisPacketCountUnknown;

                        private IsisPacketCounterEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisPacketCounterEntry", "1.3.6.1.2.1.138.1.5.3.1", false, false, false, true);
                            this.isisPacketCountLevel = new IsisPacketCountLevelEnt(mib, this);
                            this.isisPacketCountDirection = new IsisPacketCountDirectionEnt(mib, this);
                            this.isisPacketCountIIHello = new IsisPacketCountIIHelloEnt(mib, this);
                            this.isisPacketCountISHello = new IsisPacketCountISHelloEnt(mib, this);
                            this.isisPacketCountESHello = new IsisPacketCountESHelloEnt(mib, this);
                            this.isisPacketCountLSP = new IsisPacketCountLSPEnt(mib, this);
                            this.isisPacketCountCSNP = new IsisPacketCountCSNPEnt(mib, this);
                            this.isisPacketCountPSNP = new IsisPacketCountPSNPEnt(mib, this);
                            this.isisPacketCountUnknown = new IsisPacketCountUnknownEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisPacketCountLevel,
                                this.isisPacketCountDirection,
                                this.isisPacketCountIIHello,
                                this.isisPacketCountISHello,
                                this.isisPacketCountESHello,
                                this.isisPacketCountLSP,
                                this.isisPacketCountCSNP,
                                this.isisPacketCountPSNP,
                                this.isisPacketCountUnknown
                            };
                        }
                        public static final class IsisPacketCountLevelEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisPacketCountLevelEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisPacketCountLevel", "1.3.6.1.2.1.138.1.5.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisPacketCountDirectionEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisPacketCountDirectionEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisPacketCountDirection", "1.3.6.1.2.1.138.1.5.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisPacketCountIIHelloEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisPacketCountIIHelloEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisPacketCountIIHello", "1.3.6.1.2.1.138.1.5.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisPacketCountISHelloEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisPacketCountISHelloEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisPacketCountISHello", "1.3.6.1.2.1.138.1.5.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisPacketCountESHelloEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisPacketCountESHelloEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisPacketCountESHello", "1.3.6.1.2.1.138.1.5.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisPacketCountLSPEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisPacketCountLSPEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisPacketCountLSP", "1.3.6.1.2.1.138.1.5.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisPacketCountCSNPEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisPacketCountCSNPEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisPacketCountCSNP", "1.3.6.1.2.1.138.1.5.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisPacketCountPSNPEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisPacketCountPSNPEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisPacketCountPSNP", "1.3.6.1.2.1.138.1.5.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisPacketCountUnknownEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisPacketCountUnknownEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisPacketCountUnknown", "1.3.6.1.2.1.138.1.5.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IsisISAdjEnt extends MIBEntry<ISISMIBDef>
            {
                /** The IS Adjacency TableEach adjacency to an IS corresponds to one entry in thistable.*/
                public final IsisISAdjTableEnt isisISAdjTable;

                /** The IS Adjacency Area Address Table
The IS Adjacency Area Address Table contains the set ofArea Addresses of neighboringIntermediate Systems as reported in IIH PDUs.*/
                public final IsisISAdjAreaAddrTableEnt isisISAdjAreaAddrTable;

                /** The IS Adjacency IP Address Table
The IS Adjacency IP Address Table contains theset of IP Addresses of neighboring Intermediate Systemsas reported in received IIH PDUs.*/
                public final IsisISAdjIPAddrTableEnt isisISAdjIPAddrTable;

                /** The IS Adjacency Protocol Supported TableThe IS Adjacency Protocol Supported Table contains the set ofprotocols supported by neighboringIntermediate Systems as reported in received IIH PDUs.*/
                public final IsisISAdjProtSuppTableEnt isisISAdjProtSuppTable;

                private IsisISAdjEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisISAdj", "1.3.6.1.2.1.138.1.6", false, false, false, false);
                    this.isisISAdjTable = new IsisISAdjTableEnt(mib, this);
                    this.isisISAdjAreaAddrTable = new IsisISAdjAreaAddrTableEnt(mib, this);
                    this.isisISAdjIPAddrTable = new IsisISAdjIPAddrTableEnt(mib, this);
                    this.isisISAdjProtSuppTable = new IsisISAdjProtSuppTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isisISAdjTable,
                        this.isisISAdjAreaAddrTable,
                        this.isisISAdjIPAddrTable,
                        this.isisISAdjProtSuppTable
                    };
                }
                public static final class IsisISAdjTableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisISAdjEntryEnt isisISAdjEntry;

                    private IsisISAdjTableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisISAdjTable", "1.3.6.1.2.1.138.1.6.1", false, true, false, false);
                        this.isisISAdjEntry = new IsisISAdjEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisISAdjEntry
                        };
                    }
                    public static final class IsisISAdjEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisISAdjIndexEnt isisISAdjIndex;

                        public final IsisISAdjStateEnt isisISAdjState;

                        public final IsisISAdj3WayStateEnt isisISAdj3WayState;

                        public final IsisISAdjNeighSNPAAddressEnt isisISAdjNeighSNPAAddress;

                        public final IsisISAdjNeighSysTypeEnt isisISAdjNeighSysType;

                        public final IsisISAdjNeighSysIDEnt isisISAdjNeighSysID;

                        public final IsisISAdjNbrExtendedCircIDEnt isisISAdjNbrExtendedCircID;

                        public final IsisISAdjUsageEnt isisISAdjUsage;

                        public final IsisISAdjHoldTimerEnt isisISAdjHoldTimer;

                        public final IsisISAdjNeighPriorityEnt isisISAdjNeighPriority;

                        public final IsisISAdjLastUpTimeEnt isisISAdjLastUpTime;

                        private IsisISAdjEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisISAdjEntry", "1.3.6.1.2.1.138.1.6.1.1", false, false, false, true);
                            this.isisISAdjIndex = new IsisISAdjIndexEnt(mib, this);
                            this.isisISAdjState = new IsisISAdjStateEnt(mib, this);
                            this.isisISAdj3WayState = new IsisISAdj3WayStateEnt(mib, this);
                            this.isisISAdjNeighSNPAAddress = new IsisISAdjNeighSNPAAddressEnt(mib, this);
                            this.isisISAdjNeighSysType = new IsisISAdjNeighSysTypeEnt(mib, this);
                            this.isisISAdjNeighSysID = new IsisISAdjNeighSysIDEnt(mib, this);
                            this.isisISAdjNbrExtendedCircID = new IsisISAdjNbrExtendedCircIDEnt(mib, this);
                            this.isisISAdjUsage = new IsisISAdjUsageEnt(mib, this);
                            this.isisISAdjHoldTimer = new IsisISAdjHoldTimerEnt(mib, this);
                            this.isisISAdjNeighPriority = new IsisISAdjNeighPriorityEnt(mib, this);
                            this.isisISAdjLastUpTime = new IsisISAdjLastUpTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisISAdjIndex,
                                this.isisISAdjState,
                                this.isisISAdj3WayState,
                                this.isisISAdjNeighSNPAAddress,
                                this.isisISAdjNeighSysType,
                                this.isisISAdjNeighSysID,
                                this.isisISAdjNbrExtendedCircID,
                                this.isisISAdjUsage,
                                this.isisISAdjHoldTimer,
                                this.isisISAdjNeighPriority,
                                this.isisISAdjLastUpTime
                            };
                        }
                        public static final class IsisISAdjIndexEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisISAdjIndexEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisISAdjIndex", "1.3.6.1.2.1.138.1.6.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisISAdjStateEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisISAdjStateEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisISAdjState", "1.3.6.1.2.1.138.1.6.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisISAdj3WayStateEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisISAdj3WayStateEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisISAdj3WayState", "1.3.6.1.2.1.138.1.6.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisISAdjNeighSNPAAddressEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisISAdjNeighSNPAAddressEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisISAdjNeighSNPAAddress", "1.3.6.1.2.1.138.1.6.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisISAdjNeighSysTypeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisISAdjNeighSysTypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisISAdjNeighSysType", "1.3.6.1.2.1.138.1.6.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisISAdjNeighSysIDEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisISAdjNeighSysIDEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisISAdjNeighSysID", "1.3.6.1.2.1.138.1.6.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisISAdjNbrExtendedCircIDEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisISAdjNbrExtendedCircIDEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisISAdjNbrExtendedCircID", "1.3.6.1.2.1.138.1.6.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisISAdjUsageEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisISAdjUsageEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisISAdjUsage", "1.3.6.1.2.1.138.1.6.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisISAdjHoldTimerEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisISAdjHoldTimerEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisISAdjHoldTimer", "1.3.6.1.2.1.138.1.6.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisISAdjNeighPriorityEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisISAdjNeighPriorityEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisISAdjNeighPriority", "1.3.6.1.2.1.138.1.6.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisISAdjLastUpTimeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisISAdjLastUpTimeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisISAdjLastUpTime", "1.3.6.1.2.1.138.1.6.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IsisISAdjAreaAddrTableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisISAdjAreaAddrEntryEnt isisISAdjAreaAddrEntry;

                    private IsisISAdjAreaAddrTableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisISAdjAreaAddrTable", "1.3.6.1.2.1.138.1.6.2", false, true, false, false);
                        this.isisISAdjAreaAddrEntry = new IsisISAdjAreaAddrEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisISAdjAreaAddrEntry
                        };
                    }
                    public static final class IsisISAdjAreaAddrEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisISAdjAreaAddrIndexEnt isisISAdjAreaAddrIndex;

                        public final IsisISAdjAreaAddressEnt isisISAdjAreaAddress;

                        private IsisISAdjAreaAddrEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisISAdjAreaAddrEntry", "1.3.6.1.2.1.138.1.6.2.1", false, false, false, true);
                            this.isisISAdjAreaAddrIndex = new IsisISAdjAreaAddrIndexEnt(mib, this);
                            this.isisISAdjAreaAddress = new IsisISAdjAreaAddressEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisISAdjAreaAddrIndex,
                                this.isisISAdjAreaAddress
                            };
                        }
                        public static final class IsisISAdjAreaAddrIndexEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisISAdjAreaAddrIndexEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisISAdjAreaAddrIndex", "1.3.6.1.2.1.138.1.6.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisISAdjAreaAddressEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisISAdjAreaAddressEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisISAdjAreaAddress", "1.3.6.1.2.1.138.1.6.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IsisISAdjIPAddrTableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisISAdjIPAddrEntryEnt isisISAdjIPAddrEntry;

                    private IsisISAdjIPAddrTableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisISAdjIPAddrTable", "1.3.6.1.2.1.138.1.6.3", false, true, false, false);
                        this.isisISAdjIPAddrEntry = new IsisISAdjIPAddrEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisISAdjIPAddrEntry
                        };
                    }
                    public static final class IsisISAdjIPAddrEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisISAdjIPAddrIndexEnt isisISAdjIPAddrIndex;

                        public final IsisISAdjIPAddrTypeEnt isisISAdjIPAddrType;

                        public final IsisISAdjIPAddrAddressEnt isisISAdjIPAddrAddress;

                        private IsisISAdjIPAddrEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisISAdjIPAddrEntry", "1.3.6.1.2.1.138.1.6.3.1", false, false, false, true);
                            this.isisISAdjIPAddrIndex = new IsisISAdjIPAddrIndexEnt(mib, this);
                            this.isisISAdjIPAddrType = new IsisISAdjIPAddrTypeEnt(mib, this);
                            this.isisISAdjIPAddrAddress = new IsisISAdjIPAddrAddressEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisISAdjIPAddrIndex,
                                this.isisISAdjIPAddrType,
                                this.isisISAdjIPAddrAddress
                            };
                        }
                        public static final class IsisISAdjIPAddrIndexEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisISAdjIPAddrIndexEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisISAdjIPAddrIndex", "1.3.6.1.2.1.138.1.6.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisISAdjIPAddrTypeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisISAdjIPAddrTypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisISAdjIPAddrType", "1.3.6.1.2.1.138.1.6.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisISAdjIPAddrAddressEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisISAdjIPAddrAddressEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisISAdjIPAddrAddress", "1.3.6.1.2.1.138.1.6.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IsisISAdjProtSuppTableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisISAdjProtSuppEntryEnt isisISAdjProtSuppEntry;

                    private IsisISAdjProtSuppTableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisISAdjProtSuppTable", "1.3.6.1.2.1.138.1.6.4", false, true, false, false);
                        this.isisISAdjProtSuppEntry = new IsisISAdjProtSuppEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisISAdjProtSuppEntry
                        };
                    }
                    public static final class IsisISAdjProtSuppEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisISAdjProtSuppProtocolEnt isisISAdjProtSuppProtocol;

                        private IsisISAdjProtSuppEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisISAdjProtSuppEntry", "1.3.6.1.2.1.138.1.6.4.1", false, false, false, true);
                            this.isisISAdjProtSuppProtocol = new IsisISAdjProtSuppProtocolEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisISAdjProtSuppProtocol
                            };
                        }
                        public static final class IsisISAdjProtSuppProtocolEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisISAdjProtSuppProtocolEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisISAdjProtSuppProtocol", "1.3.6.1.2.1.138.1.6.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IsisReachAddrEnt extends MIBEntry<ISISMIBDef>
            {
                /** The Reachable Address GroupThe Reachable Address TableEach entry records information about a reachable address(NSAP or address prefix) manually configured on the systemor learned through another protocol.*/
                public final IsisRATableEnt isisRATable;

                private IsisReachAddrEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisReachAddr", "1.3.6.1.2.1.138.1.7", false, false, false, false);
                    this.isisRATable = new IsisRATableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isisRATable
                    };
                }
                public static final class IsisRATableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisRAEntryEnt isisRAEntry;

                    private IsisRATableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisRATable", "1.3.6.1.2.1.138.1.7.1", false, true, false, false);
                        this.isisRAEntry = new IsisRAEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisRAEntry
                        };
                    }
                    public static final class IsisRAEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisRAIndexEnt isisRAIndex;

                        public final IsisRAExistStateEnt isisRAExistState;

                        public final IsisRAAdminStateEnt isisRAAdminState;

                        public final IsisRAAddrPrefixEnt isisRAAddrPrefix;

                        public final IsisRAMapTypeEnt isisRAMapType;

                        public final IsisRAMetricEnt isisRAMetric;

                        public final IsisRAMetricTypeEnt isisRAMetricType;

                        /** Note only one address may be specified per Reachable Address
in the MIB*/
                        public final IsisRASNPAAddressEnt isisRASNPAAddress;

                        public final IsisRASNPAMaskEnt isisRASNPAMask;

                        public final IsisRASNPAPrefixEnt isisRASNPAPrefix;

                        public final IsisRATypeEnt isisRAType;

                        private IsisRAEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisRAEntry", "1.3.6.1.2.1.138.1.7.1.1", false, false, false, true);
                            this.isisRAIndex = new IsisRAIndexEnt(mib, this);
                            this.isisRAExistState = new IsisRAExistStateEnt(mib, this);
                            this.isisRAAdminState = new IsisRAAdminStateEnt(mib, this);
                            this.isisRAAddrPrefix = new IsisRAAddrPrefixEnt(mib, this);
                            this.isisRAMapType = new IsisRAMapTypeEnt(mib, this);
                            this.isisRAMetric = new IsisRAMetricEnt(mib, this);
                            this.isisRAMetricType = new IsisRAMetricTypeEnt(mib, this);
                            this.isisRASNPAAddress = new IsisRASNPAAddressEnt(mib, this);
                            this.isisRASNPAMask = new IsisRASNPAMaskEnt(mib, this);
                            this.isisRASNPAPrefix = new IsisRASNPAPrefixEnt(mib, this);
                            this.isisRAType = new IsisRATypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisRAIndex,
                                this.isisRAExistState,
                                this.isisRAAdminState,
                                this.isisRAAddrPrefix,
                                this.isisRAMapType,
                                this.isisRAMetric,
                                this.isisRAMetricType,
                                this.isisRASNPAAddress,
                                this.isisRASNPAMask,
                                this.isisRASNPAPrefix,
                                this.isisRAType
                            };
                        }
                        public static final class IsisRAIndexEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRAIndexEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRAIndex", "1.3.6.1.2.1.138.1.7.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisRAExistStateEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRAExistStateEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRAExistState", "1.3.6.1.2.1.138.1.7.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisRAAdminStateEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRAAdminStateEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRAAdminState", "1.3.6.1.2.1.138.1.7.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisRAAddrPrefixEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRAAddrPrefixEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRAAddrPrefix", "1.3.6.1.2.1.138.1.7.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisRAMapTypeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRAMapTypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRAMapType", "1.3.6.1.2.1.138.1.7.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisRAMetricEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRAMetricEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRAMetric", "1.3.6.1.2.1.138.1.7.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisRAMetricTypeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRAMetricTypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRAMetricType", "1.3.6.1.2.1.138.1.7.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisRASNPAAddressEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRASNPAAddressEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRASNPAAddress", "1.3.6.1.2.1.138.1.7.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisRASNPAMaskEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRASNPAMaskEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRASNPAMask", "1.3.6.1.2.1.138.1.7.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisRASNPAPrefixEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRASNPAPrefixEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRASNPAPrefix", "1.3.6.1.2.1.138.1.7.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisRATypeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisRATypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisRAType", "1.3.6.1.2.1.138.1.7.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IsisIPReachAddrEnt extends MIBEntry<ISISMIBDef>
            {
                /** The IP Reachable Address Table
Each entry records information about one IP reachableaddress manually configured on this system or learned fromanother protocol.*/
                public final IsisIPRATableEnt isisIPRATable;

                private IsisIPReachAddrEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisIPReachAddr", "1.3.6.1.2.1.138.1.8", false, false, false, false);
                    this.isisIPRATable = new IsisIPRATableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isisIPRATable
                    };
                }
                public static final class IsisIPRATableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisIPRAEntryEnt isisIPRAEntry;

                    private IsisIPRATableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisIPRATable", "1.3.6.1.2.1.138.1.8.1", false, true, false, false);
                        this.isisIPRAEntry = new IsisIPRAEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisIPRAEntry
                        };
                    }
                    public static final class IsisIPRAEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisIPRADestTypeEnt isisIPRADestType;

                        public final IsisIPRADestEnt isisIPRADest;

                        public final IsisIPRADestPrefixLenEnt isisIPRADestPrefixLen;

                        public final IsisIPRANextHopIndexEnt isisIPRANextHopIndex;

                        public final IsisIPRANextHopTypeEnt isisIPRANextHopType;

                        public final IsisIPRANextHopEnt isisIPRANextHop;

                        public final IsisIPRATypeEnt isisIPRAType;

                        public final IsisIPRAExistStateEnt isisIPRAExistState;

                        public final IsisIPRAAdminStateEnt isisIPRAAdminState;

                        public final IsisIPRAMetricEnt isisIPRAMetric;

                        public final IsisIPRAMetricTypeEnt isisIPRAMetricType;

                        public final IsisIPRAFullMetricEnt isisIPRAFullMetric;

                        public final IsisIPRASNPAAddressEnt isisIPRASNPAAddress;

                        public final IsisIPRASourceTypeEnt isisIPRASourceType;

                        private IsisIPRAEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisIPRAEntry", "1.3.6.1.2.1.138.1.8.1.1", false, false, false, true);
                            this.isisIPRADestType = new IsisIPRADestTypeEnt(mib, this);
                            this.isisIPRADest = new IsisIPRADestEnt(mib, this);
                            this.isisIPRADestPrefixLen = new IsisIPRADestPrefixLenEnt(mib, this);
                            this.isisIPRANextHopIndex = new IsisIPRANextHopIndexEnt(mib, this);
                            this.isisIPRANextHopType = new IsisIPRANextHopTypeEnt(mib, this);
                            this.isisIPRANextHop = new IsisIPRANextHopEnt(mib, this);
                            this.isisIPRAType = new IsisIPRATypeEnt(mib, this);
                            this.isisIPRAExistState = new IsisIPRAExistStateEnt(mib, this);
                            this.isisIPRAAdminState = new IsisIPRAAdminStateEnt(mib, this);
                            this.isisIPRAMetric = new IsisIPRAMetricEnt(mib, this);
                            this.isisIPRAMetricType = new IsisIPRAMetricTypeEnt(mib, this);
                            this.isisIPRAFullMetric = new IsisIPRAFullMetricEnt(mib, this);
                            this.isisIPRASNPAAddress = new IsisIPRASNPAAddressEnt(mib, this);
                            this.isisIPRASourceType = new IsisIPRASourceTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisIPRADestType,
                                this.isisIPRADest,
                                this.isisIPRADestPrefixLen,
                                this.isisIPRANextHopIndex,
                                this.isisIPRANextHopType,
                                this.isisIPRANextHop,
                                this.isisIPRAType,
                                this.isisIPRAExistState,
                                this.isisIPRAAdminState,
                                this.isisIPRAMetric,
                                this.isisIPRAMetricType,
                                this.isisIPRAFullMetric,
                                this.isisIPRASNPAAddress,
                                this.isisIPRASourceType
                            };
                        }
                        public static final class IsisIPRADestTypeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisIPRADestTypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisIPRADestType", "1.3.6.1.2.1.138.1.8.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisIPRADestEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisIPRADestEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisIPRADest", "1.3.6.1.2.1.138.1.8.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisIPRADestPrefixLenEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisIPRADestPrefixLenEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisIPRADestPrefixLen", "1.3.6.1.2.1.138.1.8.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisIPRANextHopIndexEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisIPRANextHopIndexEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisIPRANextHopIndex", "1.3.6.1.2.1.138.1.8.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisIPRANextHopTypeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisIPRANextHopTypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisIPRANextHopType", "1.3.6.1.2.1.138.1.8.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisIPRANextHopEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisIPRANextHopEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisIPRANextHop", "1.3.6.1.2.1.138.1.8.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisIPRATypeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisIPRATypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisIPRAType", "1.3.6.1.2.1.138.1.8.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisIPRAExistStateEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisIPRAExistStateEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisIPRAExistState", "1.3.6.1.2.1.138.1.8.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisIPRAAdminStateEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisIPRAAdminStateEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisIPRAAdminState", "1.3.6.1.2.1.138.1.8.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisIPRAMetricEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisIPRAMetricEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisIPRAMetric", "1.3.6.1.2.1.138.1.8.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisIPRAMetricTypeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisIPRAMetricTypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisIPRAMetricType", "1.3.6.1.2.1.138.1.8.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisIPRAFullMetricEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisIPRAFullMetricEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisIPRAFullMetric", "1.3.6.1.2.1.138.1.8.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisIPRASNPAAddressEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisIPRASNPAAddressEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisIPRASNPAAddress", "1.3.6.1.2.1.138.1.8.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisIPRASourceTypeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisIPRASourceTypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisIPRASourceType", "1.3.6.1.2.1.138.1.8.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IsisLSPDataBaseEnt extends MIBEntry<ISISMIBDef>
            {
                /** The LSP Database TableThe first table provides Summary Information about LSPsThe next table provides a complete record*/
                public final IsisLSPSummaryTableEnt isisLSPSummaryTable;

                /** LSP TableThe full LSP as a sequence of {Type, Len, Value} tuplesSince the underlying LSP may have changed while downloadingTLVs, we provide the Sequence number and Checksum for eachLSP TLV, so the network manager may verify that they arestill working on the same version of the LSP.*/
                public final IsisLSPTLVTableEnt isisLSPTLVTable;

                private IsisLSPDataBaseEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisLSPDataBase", "1.3.6.1.2.1.138.1.9", false, false, false, false);
                    this.isisLSPSummaryTable = new IsisLSPSummaryTableEnt(mib, this);
                    this.isisLSPTLVTable = new IsisLSPTLVTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isisLSPSummaryTable,
                        this.isisLSPTLVTable
                    };
                }
                public static final class IsisLSPSummaryTableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisLSPSummaryEntryEnt isisLSPSummaryEntry;

                    private IsisLSPSummaryTableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisLSPSummaryTable", "1.3.6.1.2.1.138.1.9.1", false, true, false, false);
                        this.isisLSPSummaryEntry = new IsisLSPSummaryEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisLSPSummaryEntry
                        };
                    }
                    public static final class IsisLSPSummaryEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisLSPLevelEnt isisLSPLevel;

                        public final IsisLSPIDEnt isisLSPID;

                        public final IsisLSPSeqEnt isisLSPSeq;

                        public final IsisLSPZeroLifeEnt isisLSPZeroLife;

                        public final IsisLSPChecksumEnt isisLSPChecksum;

                        public final IsisLSPLifetimeRemainEnt isisLSPLifetimeRemain;

                        public final IsisLSPPDULengthEnt isisLSPPDULength;

                        public final IsisLSPAttributesEnt isisLSPAttributes;

                        private IsisLSPSummaryEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisLSPSummaryEntry", "1.3.6.1.2.1.138.1.9.1.1", false, false, false, true);
                            this.isisLSPLevel = new IsisLSPLevelEnt(mib, this);
                            this.isisLSPID = new IsisLSPIDEnt(mib, this);
                            this.isisLSPSeq = new IsisLSPSeqEnt(mib, this);
                            this.isisLSPZeroLife = new IsisLSPZeroLifeEnt(mib, this);
                            this.isisLSPChecksum = new IsisLSPChecksumEnt(mib, this);
                            this.isisLSPLifetimeRemain = new IsisLSPLifetimeRemainEnt(mib, this);
                            this.isisLSPPDULength = new IsisLSPPDULengthEnt(mib, this);
                            this.isisLSPAttributes = new IsisLSPAttributesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisLSPLevel,
                                this.isisLSPID,
                                this.isisLSPSeq,
                                this.isisLSPZeroLife,
                                this.isisLSPChecksum,
                                this.isisLSPLifetimeRemain,
                                this.isisLSPPDULength,
                                this.isisLSPAttributes
                            };
                        }
                        public static final class IsisLSPLevelEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisLSPLevelEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisLSPLevel", "1.3.6.1.2.1.138.1.9.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisLSPIDEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisLSPIDEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisLSPID", "1.3.6.1.2.1.138.1.9.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisLSPSeqEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisLSPSeqEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisLSPSeq", "1.3.6.1.2.1.138.1.9.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisLSPZeroLifeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisLSPZeroLifeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisLSPZeroLife", "1.3.6.1.2.1.138.1.9.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisLSPChecksumEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisLSPChecksumEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisLSPChecksum", "1.3.6.1.2.1.138.1.9.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisLSPLifetimeRemainEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisLSPLifetimeRemainEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisLSPLifetimeRemain", "1.3.6.1.2.1.138.1.9.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisLSPPDULengthEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisLSPPDULengthEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisLSPPDULength", "1.3.6.1.2.1.138.1.9.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisLSPAttributesEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisLSPAttributesEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisLSPAttributes", "1.3.6.1.2.1.138.1.9.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IsisLSPTLVTableEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisLSPTLVEntryEnt isisLSPTLVEntry;

                    private IsisLSPTLVTableEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisLSPTLVTable", "1.3.6.1.2.1.138.1.9.2", false, true, false, false);
                        this.isisLSPTLVEntry = new IsisLSPTLVEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisLSPTLVEntry
                        };
                    }
                    public static final class IsisLSPTLVEntryEnt extends MIBEntry<ISISMIBDef>
                    {
                        public final IsisLSPTLVIndexEnt isisLSPTLVIndex;

                        public final IsisLSPTLVSeqEnt isisLSPTLVSeq;

                        public final IsisLSPTLVChecksumEnt isisLSPTLVChecksum;

                        public final IsisLSPTLVTypeEnt isisLSPTLVType;

                        public final IsisLSPTLVLenEnt isisLSPTLVLen;

                        public final IsisLSPTLVValueEnt isisLSPTLVValue;

                        private IsisLSPTLVEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisLSPTLVEntry", "1.3.6.1.2.1.138.1.9.2.1", false, false, false, true);
                            this.isisLSPTLVIndex = new IsisLSPTLVIndexEnt(mib, this);
                            this.isisLSPTLVSeq = new IsisLSPTLVSeqEnt(mib, this);
                            this.isisLSPTLVChecksum = new IsisLSPTLVChecksumEnt(mib, this);
                            this.isisLSPTLVType = new IsisLSPTLVTypeEnt(mib, this);
                            this.isisLSPTLVLen = new IsisLSPTLVLenEnt(mib, this);
                            this.isisLSPTLVValue = new IsisLSPTLVValueEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isisLSPTLVIndex,
                                this.isisLSPTLVSeq,
                                this.isisLSPTLVChecksum,
                                this.isisLSPTLVType,
                                this.isisLSPTLVLen,
                                this.isisLSPTLVValue
                            };
                        }
                        public static final class IsisLSPTLVIndexEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisLSPTLVIndexEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisLSPTLVIndex", "1.3.6.1.2.1.138.1.9.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisLSPTLVSeqEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisLSPTLVSeqEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisLSPTLVSeq", "1.3.6.1.2.1.138.1.9.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisLSPTLVChecksumEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisLSPTLVChecksumEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisLSPTLVChecksum", "1.3.6.1.2.1.138.1.9.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisLSPTLVTypeEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisLSPTLVTypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisLSPTLVType", "1.3.6.1.2.1.138.1.9.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisLSPTLVLenEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisLSPTLVLenEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisLSPTLVLen", "1.3.6.1.2.1.138.1.9.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsisLSPTLVValueEnt extends MIBEntry<ISISMIBDef>
                        {
                            private IsisLSPTLVValueEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                            {
                                super(mib, parent, "isisLSPTLVValue", "1.3.6.1.2.1.138.1.9.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IsisNotificationEnt extends MIBEntry<ISISMIBDef>
            {
                /** The IS-IS Notification Table
The IS-IS Notification Table records fields that arerequired for notifications*/
                public final IsisNotificationEntryEnt isisNotificationEntry;

                private IsisNotificationEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisNotification", "1.3.6.1.2.1.138.1.10", false, false, false, false);
                    this.isisNotificationEntry = new IsisNotificationEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isisNotificationEntry
                    };
                }
                public static final class IsisNotificationEntryEnt extends MIBEntry<ISISMIBDef>
                {
                    public final IsisNotificationSysLevelIndexEnt isisNotificationSysLevelIndex;

                    public final IsisNotificationCircIfIndexEnt isisNotificationCircIfIndex;

                    public final IsisPduLspIdEnt isisPduLspId;

                    public final IsisPduFragmentEnt isisPduFragment;

                    public final IsisPduFieldLenEnt isisPduFieldLen;

                    public final IsisPduMaxAreaAddressEnt isisPduMaxAreaAddress;

                    public final IsisPduProtocolVersionEnt isisPduProtocolVersion;

                    public final IsisPduLspSizeEnt isisPduLspSize;

                    public final IsisPduOriginatingBufferSizeEnt isisPduOriginatingBufferSize;

                    public final IsisPduBufferSizeEnt isisPduBufferSize;

                    public final IsisPduProtocolsSupportedEnt isisPduProtocolsSupported;

                    public final IsisAdjStateEnt isisAdjState;

                    public final IsisErrorOffsetEnt isisErrorOffset;

                    public final IsisErrorTLVTypeEnt isisErrorTLVType;

                    public final IsisNotificationAreaAddressEnt isisNotificationAreaAddress;

                    private IsisNotificationEntryEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisNotificationEntry", "1.3.6.1.2.1.138.1.10.1", false, false, false, false);
                        this.isisNotificationSysLevelIndex = new IsisNotificationSysLevelIndexEnt(mib, this);
                        this.isisNotificationCircIfIndex = new IsisNotificationCircIfIndexEnt(mib, this);
                        this.isisPduLspId = new IsisPduLspIdEnt(mib, this);
                        this.isisPduFragment = new IsisPduFragmentEnt(mib, this);
                        this.isisPduFieldLen = new IsisPduFieldLenEnt(mib, this);
                        this.isisPduMaxAreaAddress = new IsisPduMaxAreaAddressEnt(mib, this);
                        this.isisPduProtocolVersion = new IsisPduProtocolVersionEnt(mib, this);
                        this.isisPduLspSize = new IsisPduLspSizeEnt(mib, this);
                        this.isisPduOriginatingBufferSize = new IsisPduOriginatingBufferSizeEnt(mib, this);
                        this.isisPduBufferSize = new IsisPduBufferSizeEnt(mib, this);
                        this.isisPduProtocolsSupported = new IsisPduProtocolsSupportedEnt(mib, this);
                        this.isisAdjState = new IsisAdjStateEnt(mib, this);
                        this.isisErrorOffset = new IsisErrorOffsetEnt(mib, this);
                        this.isisErrorTLVType = new IsisErrorTLVTypeEnt(mib, this);
                        this.isisNotificationAreaAddress = new IsisNotificationAreaAddressEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isisNotificationSysLevelIndex,
                            this.isisNotificationCircIfIndex,
                            this.isisPduLspId,
                            this.isisPduFragment,
                            this.isisPduFieldLen,
                            this.isisPduMaxAreaAddress,
                            this.isisPduProtocolVersion,
                            this.isisPduLspSize,
                            this.isisPduOriginatingBufferSize,
                            this.isisPduBufferSize,
                            this.isisPduProtocolsSupported,
                            this.isisAdjState,
                            this.isisErrorOffset,
                            this.isisErrorTLVType,
                            this.isisNotificationAreaAddress
                        };
                    }
                    public static final class IsisNotificationSysLevelIndexEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisNotificationSysLevelIndexEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisNotificationSysLevelIndex", "1.3.6.1.2.1.138.1.10.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisNotificationCircIfIndexEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisNotificationCircIfIndexEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisNotificationCircIfIndex", "1.3.6.1.2.1.138.1.10.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisPduLspIdEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisPduLspIdEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisPduLspId", "1.3.6.1.2.1.138.1.10.1.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisPduFragmentEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisPduFragmentEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisPduFragment", "1.3.6.1.2.1.138.1.10.1.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisPduFieldLenEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisPduFieldLenEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisPduFieldLen", "1.3.6.1.2.1.138.1.10.1.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisPduMaxAreaAddressEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisPduMaxAreaAddressEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisPduMaxAreaAddress", "1.3.6.1.2.1.138.1.10.1.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisPduProtocolVersionEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisPduProtocolVersionEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisPduProtocolVersion", "1.3.6.1.2.1.138.1.10.1.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisPduLspSizeEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisPduLspSizeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisPduLspSize", "1.3.6.1.2.1.138.1.10.1.8", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisPduOriginatingBufferSizeEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisPduOriginatingBufferSizeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisPduOriginatingBufferSize", "1.3.6.1.2.1.138.1.10.1.9", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisPduBufferSizeEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisPduBufferSizeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisPduBufferSize", "1.3.6.1.2.1.138.1.10.1.10", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisPduProtocolsSupportedEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisPduProtocolsSupportedEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisPduProtocolsSupported", "1.3.6.1.2.1.138.1.10.1.11", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisAdjStateEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisAdjStateEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisAdjState", "1.3.6.1.2.1.138.1.10.1.12", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisErrorOffsetEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisErrorOffsetEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisErrorOffset", "1.3.6.1.2.1.138.1.10.1.13", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisErrorTLVTypeEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisErrorTLVTypeEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisErrorTLVType", "1.3.6.1.2.1.138.1.10.1.14", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IsisNotificationAreaAddressEnt extends MIBEntry<ISISMIBDef>
                    {
                        private IsisNotificationAreaAddressEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                        {
                            super(mib, parent, "isisNotificationAreaAddress", "1.3.6.1.2.1.138.1.10.1.15", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class IsisConformanceEnt extends MIBEntry<ISISMIBDef>
        {
            /** Agent Conformance DefinitionsWe define the objects a conformant agent must define*/
            public final IsisCompliancesEnt isisCompliances;

            public final IsisGroupsEnt isisGroups;

            private IsisConformanceEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
            {
                super(mib, parent, "isisConformance", "1.3.6.1.2.1.138.2", false, false, false, false);
                this.isisCompliances = new IsisCompliancesEnt(mib, this);
                this.isisGroups = new IsisGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.isisCompliances,
                    this.isisGroups
                };
            }
            public static final class IsisCompliancesEnt extends MIBEntry<ISISMIBDef>
            {
                /** compliance statements*/
                public final IsisComplianceEnt isisCompliance;

                /** List of all groups, mandatory and optional*/
                public final IsisAdvancedComplianceEnt isisAdvancedCompliance;

                public final IsisReadOnlyComplianceEnt isisReadOnlyCompliance;

                private IsisCompliancesEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisCompliances", "1.3.6.1.2.1.138.2.1", false, false, false, false);
                    this.isisCompliance = new IsisComplianceEnt(mib, this);
                    this.isisAdvancedCompliance = new IsisAdvancedComplianceEnt(mib, this);
                    this.isisReadOnlyCompliance = new IsisReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isisCompliance,
                        this.isisAdvancedCompliance,
                        this.isisReadOnlyCompliance
                    };
                }
                public static final class IsisComplianceEnt extends MIBEntry<ISISMIBDef>
                {
                    private IsisComplianceEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisCompliance", "1.3.6.1.2.1.138.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsisAdvancedComplianceEnt extends MIBEntry<ISISMIBDef>
                {
                    private IsisAdvancedComplianceEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisAdvancedCompliance", "1.3.6.1.2.1.138.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsisReadOnlyComplianceEnt extends MIBEntry<ISISMIBDef>
                {
                    private IsisReadOnlyComplianceEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisReadOnlyCompliance", "1.3.6.1.2.1.138.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class IsisGroupsEnt extends MIBEntry<ISISMIBDef>
            {
                /** MIB Grouping*/
                public final IsisSystemGroupEnt isisSystemGroup;

                public final IsisCircuitGroupEnt isisCircuitGroup;

                public final IsisISAdjGroupEnt isisISAdjGroup;

                public final IsisNotificationObjectGroupEnt isisNotificationObjectGroup;

                public final IsisNotificationGroupEnt isisNotificationGroup;

                public final IsisISPDUCounterGroupEnt isisISPDUCounterGroup;

                public final IsisRATableGroupEnt isisRATableGroup;

                public final IsisISIPRADestGroupEnt isisISIPRADestGroup;

                public final IsisLSPGroupEnt isisLSPGroup;

                private IsisGroupsEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                {
                    super(mib, parent, "isisGroups", "1.3.6.1.2.1.138.2.2", false, false, false, false);
                    this.isisSystemGroup = new IsisSystemGroupEnt(mib, this);
                    this.isisCircuitGroup = new IsisCircuitGroupEnt(mib, this);
                    this.isisISAdjGroup = new IsisISAdjGroupEnt(mib, this);
                    this.isisNotificationObjectGroup = new IsisNotificationObjectGroupEnt(mib, this);
                    this.isisNotificationGroup = new IsisNotificationGroupEnt(mib, this);
                    this.isisISPDUCounterGroup = new IsisISPDUCounterGroupEnt(mib, this);
                    this.isisRATableGroup = new IsisRATableGroupEnt(mib, this);
                    this.isisISIPRADestGroup = new IsisISIPRADestGroupEnt(mib, this);
                    this.isisLSPGroup = new IsisLSPGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isisSystemGroup,
                        this.isisCircuitGroup,
                        this.isisISAdjGroup,
                        this.isisNotificationObjectGroup,
                        this.isisNotificationGroup,
                        this.isisISPDUCounterGroup,
                        this.isisRATableGroup,
                        this.isisISIPRADestGroup,
                        this.isisLSPGroup
                    };
                }
                public static final class IsisSystemGroupEnt extends MIBEntry<ISISMIBDef>
                {
                    private IsisSystemGroupEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisSystemGroup", "1.3.6.1.2.1.138.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsisCircuitGroupEnt extends MIBEntry<ISISMIBDef>
                {
                    private IsisCircuitGroupEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisCircuitGroup", "1.3.6.1.2.1.138.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsisISAdjGroupEnt extends MIBEntry<ISISMIBDef>
                {
                    private IsisISAdjGroupEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisISAdjGroup", "1.3.6.1.2.1.138.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsisNotificationObjectGroupEnt extends MIBEntry<ISISMIBDef>
                {
                    private IsisNotificationObjectGroupEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisNotificationObjectGroup", "1.3.6.1.2.1.138.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsisNotificationGroupEnt extends MIBEntry<ISISMIBDef>
                {
                    private IsisNotificationGroupEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisNotificationGroup", "1.3.6.1.2.1.138.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsisISPDUCounterGroupEnt extends MIBEntry<ISISMIBDef>
                {
                    private IsisISPDUCounterGroupEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisISPDUCounterGroup", "1.3.6.1.2.1.138.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsisRATableGroupEnt extends MIBEntry<ISISMIBDef>
                {
                    private IsisRATableGroupEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisRATableGroup", "1.3.6.1.2.1.138.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsisISIPRADestGroupEnt extends MIBEntry<ISISMIBDef>
                {
                    private IsisISIPRADestGroupEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisISIPRADestGroup", "1.3.6.1.2.1.138.2.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsisLSPGroupEnt extends MIBEntry<ISISMIBDef>
                {
                    private IsisLSPGroupEnt(ISISMIBDef mib, MIBEntry<ISISMIBDef> parent)
                    {
                        super(mib, parent, "isisLSPGroup", "1.3.6.1.2.1.138.2.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
