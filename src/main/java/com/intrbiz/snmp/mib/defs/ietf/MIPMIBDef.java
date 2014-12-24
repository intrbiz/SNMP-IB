package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class MIPMIBDef extends MIB
{
    public static final MIPMIBDef MIPMIB = new MIPMIBDef();

    public final MipMIBEnt mipMIB;

    private MIPMIBDef()
    {
        super("MIP-MIB");
        this.mipMIB = new MipMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mipMIB
        };
    }

    public static final class MipMIBEnt extends MIBEntry<MIPMIBDef>
    {
        public final MipMIBObjectsEnt mipMIBObjects;

        public final MipMIBNotificationPrefixEnt mipMIBNotificationPrefix;

        public final MipMIBConformanceEnt mipMIBConformance;

        private MipMIBEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
        {
            super(mib, parent, "mipMIB", "1.3.6.1.2.1.44", false, false, false, false);
            this.mipMIBObjects = new MipMIBObjectsEnt(mib, this);
            this.mipMIBNotificationPrefix = new MipMIBNotificationPrefixEnt(mib, this);
            this.mipMIBConformance = new MipMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mipMIBObjects,
                this.mipMIBNotificationPrefix,
                this.mipMIBConformance
            };
        }
        public static final class MipMIBObjectsEnt extends MIBEntry<MIPMIBDef>
        {
            /** Groups under mipMIBObjects*/
            public final MipSystemEnt mipSystem;

            public final MipSecurityEnt mipSecurity;

            public final MipMNEnt mipMN;

            public final MipMAEnt mipMA;

            public final MipFAEnt mipFA;

            public final MipHAEnt mipHA;

            private MipMIBObjectsEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
            {
                super(mib, parent, "mipMIBObjects", "1.3.6.1.2.1.44.1", false, false, false, false);
                this.mipSystem = new MipSystemEnt(mib, this);
                this.mipSecurity = new MipSecurityEnt(mib, this);
                this.mipMN = new MipMNEnt(mib, this);
                this.mipMA = new MipMAEnt(mib, this);
                this.mipFA = new MipFAEnt(mib, this);
                this.mipHA = new MipHAEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mipSystem,
                    this.mipSecurity,
                    this.mipMN,
                    this.mipMA,
                    this.mipFA,
                    this.mipHA
                };
            }
            public static final class MipSystemEnt extends MIBEntry<MIPMIBDef>
            {
                /** mipSystem Group*/
                public final MipEntitiesEnt mipEntities;

                public final MipEnableEnt mipEnable;

                public final MipEncapsulationSupportedEnt mipEncapsulationSupported;

                private MipSystemEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                {
                    super(mib, parent, "mipSystem", "1.3.6.1.2.1.44.1.1", false, false, false, false);
                    this.mipEntities = new MipEntitiesEnt(mib, this);
                    this.mipEnable = new MipEnableEnt(mib, this);
                    this.mipEncapsulationSupported = new MipEncapsulationSupportedEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mipEntities,
                        this.mipEnable,
                        this.mipEncapsulationSupported
                    };
                }
                public static final class MipEntitiesEnt extends MIBEntry<MIPMIBDef>
                {
                    private MipEntitiesEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mipEntities", "1.3.6.1.2.1.44.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MipEnableEnt extends MIBEntry<MIPMIBDef>
                {
                    private MipEnableEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mipEnable", "1.3.6.1.2.1.44.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MipEncapsulationSupportedEnt extends MIBEntry<MIPMIBDef>
                {
                    private MipEncapsulationSupportedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mipEncapsulationSupported", "1.3.6.1.2.1.44.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MipSecurityEnt extends MIBEntry<MIPMIBDef>
            {
                /** mipSecurity Group*/
                public final MipSecAssocTableEnt mipSecAssocTable;

                /** Mobile IP security violation total counter*/
                public final MipSecTotalViolationsEnt mipSecTotalViolations;

                /** Mobile IP security violation table*/
                public final MipSecViolationTableEnt mipSecViolationTable;

                private MipSecurityEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                {
                    super(mib, parent, "mipSecurity", "1.3.6.1.2.1.44.1.2", false, false, false, false);
                    this.mipSecAssocTable = new MipSecAssocTableEnt(mib, this);
                    this.mipSecTotalViolations = new MipSecTotalViolationsEnt(mib, this);
                    this.mipSecViolationTable = new MipSecViolationTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mipSecAssocTable,
                        this.mipSecTotalViolations,
                        this.mipSecViolationTable
                    };
                }
                public static final class MipSecAssocTableEnt extends MIBEntry<MIPMIBDef>
                {
                    public final MipSecAssocEntryEnt mipSecAssocEntry;

                    private MipSecAssocTableEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mipSecAssocTable", "1.3.6.1.2.1.44.1.2.1", false, true, false, false);
                        this.mipSecAssocEntry = new MipSecAssocEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mipSecAssocEntry
                        };
                    }
                    public static final class MipSecAssocEntryEnt extends MIBEntry<MIPMIBDef>
                    {
                        public final MipSecPeerAddressEnt mipSecPeerAddress;

                        public final MipSecSPIEnt mipSecSPI;

                        public final MipSecAlgorithmTypeEnt mipSecAlgorithmType;

                        public final MipSecAlgorithmModeEnt mipSecAlgorithmMode;

                        public final MipSecKeyEnt mipSecKey;

                        public final MipSecReplayMethodEnt mipSecReplayMethod;

                        private MipSecAssocEntryEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mipSecAssocEntry", "1.3.6.1.2.1.44.1.2.1.1", false, false, false, true);
                            this.mipSecPeerAddress = new MipSecPeerAddressEnt(mib, this);
                            this.mipSecSPI = new MipSecSPIEnt(mib, this);
                            this.mipSecAlgorithmType = new MipSecAlgorithmTypeEnt(mib, this);
                            this.mipSecAlgorithmMode = new MipSecAlgorithmModeEnt(mib, this);
                            this.mipSecKey = new MipSecKeyEnt(mib, this);
                            this.mipSecReplayMethod = new MipSecReplayMethodEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mipSecPeerAddress,
                                this.mipSecSPI,
                                this.mipSecAlgorithmType,
                                this.mipSecAlgorithmMode,
                                this.mipSecKey,
                                this.mipSecReplayMethod
                            };
                        }
                        public static final class MipSecPeerAddressEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MipSecPeerAddressEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mipSecPeerAddress", "1.3.6.1.2.1.44.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MipSecSPIEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MipSecSPIEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mipSecSPI", "1.3.6.1.2.1.44.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MipSecAlgorithmTypeEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MipSecAlgorithmTypeEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mipSecAlgorithmType", "1.3.6.1.2.1.44.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MipSecAlgorithmModeEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MipSecAlgorithmModeEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mipSecAlgorithmMode", "1.3.6.1.2.1.44.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MipSecKeyEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MipSecKeyEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mipSecKey", "1.3.6.1.2.1.44.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MipSecReplayMethodEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MipSecReplayMethodEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mipSecReplayMethod", "1.3.6.1.2.1.44.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MipSecTotalViolationsEnt extends MIBEntry<MIPMIBDef>
                {
                    private MipSecTotalViolationsEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mipSecTotalViolations", "1.3.6.1.2.1.44.1.2.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MipSecViolationTableEnt extends MIBEntry<MIPMIBDef>
                {
                    public final MipSecViolationEntryEnt mipSecViolationEntry;

                    private MipSecViolationTableEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mipSecViolationTable", "1.3.6.1.2.1.44.1.2.3", false, true, false, false);
                        this.mipSecViolationEntry = new MipSecViolationEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mipSecViolationEntry
                        };
                    }
                    public static final class MipSecViolationEntryEnt extends MIBEntry<MIPMIBDef>
                    {
                        public final MipSecViolatorAddressEnt mipSecViolatorAddress;

                        public final MipSecViolationCounterEnt mipSecViolationCounter;

                        public final MipSecRecentViolationSPIEnt mipSecRecentViolationSPI;

                        public final MipSecRecentViolationTimeEnt mipSecRecentViolationTime;

                        public final MipSecRecentViolationIDLowEnt mipSecRecentViolationIDLow;

                        public final MipSecRecentViolationIDHighEnt mipSecRecentViolationIDHigh;

                        public final MipSecRecentViolationReasonEnt mipSecRecentViolationReason;

                        private MipSecViolationEntryEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mipSecViolationEntry", "1.3.6.1.2.1.44.1.2.3.1", false, false, false, true);
                            this.mipSecViolatorAddress = new MipSecViolatorAddressEnt(mib, this);
                            this.mipSecViolationCounter = new MipSecViolationCounterEnt(mib, this);
                            this.mipSecRecentViolationSPI = new MipSecRecentViolationSPIEnt(mib, this);
                            this.mipSecRecentViolationTime = new MipSecRecentViolationTimeEnt(mib, this);
                            this.mipSecRecentViolationIDLow = new MipSecRecentViolationIDLowEnt(mib, this);
                            this.mipSecRecentViolationIDHigh = new MipSecRecentViolationIDHighEnt(mib, this);
                            this.mipSecRecentViolationReason = new MipSecRecentViolationReasonEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mipSecViolatorAddress,
                                this.mipSecViolationCounter,
                                this.mipSecRecentViolationSPI,
                                this.mipSecRecentViolationTime,
                                this.mipSecRecentViolationIDLow,
                                this.mipSecRecentViolationIDHigh,
                                this.mipSecRecentViolationReason
                            };
                        }
                        public static final class MipSecViolatorAddressEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MipSecViolatorAddressEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mipSecViolatorAddress", "1.3.6.1.2.1.44.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MipSecViolationCounterEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MipSecViolationCounterEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mipSecViolationCounter", "1.3.6.1.2.1.44.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MipSecRecentViolationSPIEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MipSecRecentViolationSPIEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mipSecRecentViolationSPI", "1.3.6.1.2.1.44.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MipSecRecentViolationTimeEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MipSecRecentViolationTimeEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mipSecRecentViolationTime", "1.3.6.1.2.1.44.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MipSecRecentViolationIDLowEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MipSecRecentViolationIDLowEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mipSecRecentViolationIDLow", "1.3.6.1.2.1.44.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MipSecRecentViolationIDHighEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MipSecRecentViolationIDHighEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mipSecRecentViolationIDHigh", "1.3.6.1.2.1.44.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MipSecRecentViolationReasonEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MipSecRecentViolationReasonEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mipSecRecentViolationReason", "1.3.6.1.2.1.44.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class MipMNEnt extends MIBEntry<MIPMIBDef>
            {
                public final MnSystemEnt mnSystem;

                public final MnDiscoveryEnt mnDiscovery;

                public final MnRegistrationEnt mnRegistration;

                private MipMNEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                {
                    super(mib, parent, "mipMN", "1.3.6.1.2.1.44.1.3", false, false, false, false);
                    this.mnSystem = new MnSystemEnt(mib, this);
                    this.mnDiscovery = new MnDiscoveryEnt(mib, this);
                    this.mnRegistration = new MnRegistrationEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mnSystem,
                        this.mnDiscovery,
                        this.mnRegistration
                    };
                }
                public static final class MnSystemEnt extends MIBEntry<MIPMIBDef>
                {
                    /** mipMN GroupmipSystem Group*/
                    public final MnStateEnt mnState;

                    public final MnHomeAddressEnt mnHomeAddress;

                    /** Mobile node's home agent list*/
                    public final MnHATableEnt mnHATable;

                    private MnSystemEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mnSystem", "1.3.6.1.2.1.44.1.3.1", false, false, false, false);
                        this.mnState = new MnStateEnt(mib, this);
                        this.mnHomeAddress = new MnHomeAddressEnt(mib, this);
                        this.mnHATable = new MnHATableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mnState,
                            this.mnHomeAddress,
                            this.mnHATable
                        };
                    }
                    public static final class MnStateEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnStateEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnState", "1.3.6.1.2.1.44.1.3.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnHomeAddressEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnHomeAddressEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnHomeAddress", "1.3.6.1.2.1.44.1.3.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnHATableEnt extends MIBEntry<MIPMIBDef>
                    {
                        public final MnHAEntryEnt mnHAEntry;

                        private MnHATableEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnHATable", "1.3.6.1.2.1.44.1.3.1.3", false, true, false, false);
                            this.mnHAEntry = new MnHAEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mnHAEntry
                            };
                        }
                        public static final class MnHAEntryEnt extends MIBEntry<MIPMIBDef>
                        {
                            public final MnHAAddressEnt mnHAAddress;

                            public final MnCurrentHAEnt mnCurrentHA;

                            public final MnHAStatusEnt mnHAStatus;

                            private MnHAEntryEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mnHAEntry", "1.3.6.1.2.1.44.1.3.1.3.1", false, false, false, true);
                                this.mnHAAddress = new MnHAAddressEnt(mib, this);
                                this.mnCurrentHA = new MnCurrentHAEnt(mib, this);
                                this.mnHAStatus = new MnHAStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.mnHAAddress,
                                    this.mnCurrentHA,
                                    this.mnHAStatus
                                };
                            }
                            public static final class MnHAAddressEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MnHAAddressEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "mnHAAddress", "1.3.6.1.2.1.44.1.3.1.3.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MnCurrentHAEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MnCurrentHAEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "mnCurrentHA", "1.3.6.1.2.1.44.1.3.1.3.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MnHAStatusEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MnHAStatusEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "mnHAStatus", "1.3.6.1.2.1.44.1.3.1.3.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class MnDiscoveryEnt extends MIBEntry<MIPMIBDef>
                {
                    public final MnFATableEnt mnFATable;

                    /** Mobile node could store multiple agent advertisements, however,only the most recently received agent advertisement informationis required to be made available to the manager station.*/
                    public final MnRecentAdvReceivedEnt mnRecentAdvReceived;

                    /** Mobile Node Discovery Group Counter*/
                    public final MnSolicitationsSentEnt mnSolicitationsSent;

                    public final MnAdvertisementsReceivedEnt mnAdvertisementsReceived;

                    public final MnAdvsDroppedInvalidExtensionEnt mnAdvsDroppedInvalidExtension;

                    public final MnAdvsIgnoredUnknownExtensionEnt mnAdvsIgnoredUnknownExtension;

                    public final MnMoveFromHAToFAEnt mnMoveFromHAToFA;

                    public final MnMoveFromFAToFAEnt mnMoveFromFAToFA;

                    public final MnMoveFromFAToHAEnt mnMoveFromFAToHA;

                    public final MnGratuitousARPsSendEnt mnGratuitousARPsSend;

                    public final MnAgentRebootsDectectedEnt mnAgentRebootsDectected;

                    private MnDiscoveryEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mnDiscovery", "1.3.6.1.2.1.44.1.3.2", false, false, false, false);
                        this.mnFATable = new MnFATableEnt(mib, this);
                        this.mnRecentAdvReceived = new MnRecentAdvReceivedEnt(mib, this);
                        this.mnSolicitationsSent = new MnSolicitationsSentEnt(mib, this);
                        this.mnAdvertisementsReceived = new MnAdvertisementsReceivedEnt(mib, this);
                        this.mnAdvsDroppedInvalidExtension = new MnAdvsDroppedInvalidExtensionEnt(mib, this);
                        this.mnAdvsIgnoredUnknownExtension = new MnAdvsIgnoredUnknownExtensionEnt(mib, this);
                        this.mnMoveFromHAToFA = new MnMoveFromHAToFAEnt(mib, this);
                        this.mnMoveFromFAToFA = new MnMoveFromFAToFAEnt(mib, this);
                        this.mnMoveFromFAToHA = new MnMoveFromFAToHAEnt(mib, this);
                        this.mnGratuitousARPsSend = new MnGratuitousARPsSendEnt(mib, this);
                        this.mnAgentRebootsDectected = new MnAgentRebootsDectectedEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mnFATable,
                            this.mnRecentAdvReceived,
                            this.mnSolicitationsSent,
                            this.mnAdvertisementsReceived,
                            this.mnAdvsDroppedInvalidExtension,
                            this.mnAdvsIgnoredUnknownExtension,
                            this.mnMoveFromHAToFA,
                            this.mnMoveFromFAToFA,
                            this.mnMoveFromFAToHA,
                            this.mnGratuitousARPsSend,
                            this.mnAgentRebootsDectected
                        };
                    }
                    public static final class MnFATableEnt extends MIBEntry<MIPMIBDef>
                    {
                        public final MnFAEntryEnt mnFAEntry;

                        private MnFATableEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnFATable", "1.3.6.1.2.1.44.1.3.2.1", false, true, false, false);
                            this.mnFAEntry = new MnFAEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mnFAEntry
                            };
                        }
                        public static final class MnFAEntryEnt extends MIBEntry<MIPMIBDef>
                        {
                            public final MnFAAddressEnt mnFAAddress;

                            public final MnCOAEnt mnCOA;

                            private MnFAEntryEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mnFAEntry", "1.3.6.1.2.1.44.1.3.2.1.1", false, false, false, true);
                                this.mnFAAddress = new MnFAAddressEnt(mib, this);
                                this.mnCOA = new MnCOAEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.mnFAAddress,
                                    this.mnCOA
                                };
                            }
                            public static final class MnFAAddressEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MnFAAddressEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "mnFAAddress", "1.3.6.1.2.1.44.1.3.2.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MnCOAEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MnCOAEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "mnCOA", "1.3.6.1.2.1.44.1.3.2.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class MnRecentAdvReceivedEnt extends MIBEntry<MIPMIBDef>
                    {
                        public final MnAdvSourceAddressEnt mnAdvSourceAddress;

                        public final MnAdvSequenceEnt mnAdvSequence;

                        public final MnAdvFlagsEnt mnAdvFlags;

                        public final MnAdvMaxRegLifetimeEnt mnAdvMaxRegLifetime;

                        public final MnAdvMaxAdvLifetimeEnt mnAdvMaxAdvLifetime;

                        public final MnAdvTimeReceivedEnt mnAdvTimeReceived;

                        private MnRecentAdvReceivedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnRecentAdvReceived", "1.3.6.1.2.1.44.1.3.2.2", false, false, false, false);
                            this.mnAdvSourceAddress = new MnAdvSourceAddressEnt(mib, this);
                            this.mnAdvSequence = new MnAdvSequenceEnt(mib, this);
                            this.mnAdvFlags = new MnAdvFlagsEnt(mib, this);
                            this.mnAdvMaxRegLifetime = new MnAdvMaxRegLifetimeEnt(mib, this);
                            this.mnAdvMaxAdvLifetime = new MnAdvMaxAdvLifetimeEnt(mib, this);
                            this.mnAdvTimeReceived = new MnAdvTimeReceivedEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mnAdvSourceAddress,
                                this.mnAdvSequence,
                                this.mnAdvFlags,
                                this.mnAdvMaxRegLifetime,
                                this.mnAdvMaxAdvLifetime,
                                this.mnAdvTimeReceived
                            };
                        }
                        public static final class MnAdvSourceAddressEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MnAdvSourceAddressEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mnAdvSourceAddress", "1.3.6.1.2.1.44.1.3.2.2.1", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MnAdvSequenceEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MnAdvSequenceEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mnAdvSequence", "1.3.6.1.2.1.44.1.3.2.2.2", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MnAdvFlagsEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MnAdvFlagsEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mnAdvFlags", "1.3.6.1.2.1.44.1.3.2.2.3", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MnAdvMaxRegLifetimeEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MnAdvMaxRegLifetimeEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mnAdvMaxRegLifetime", "1.3.6.1.2.1.44.1.3.2.2.4", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MnAdvMaxAdvLifetimeEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MnAdvMaxAdvLifetimeEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mnAdvMaxAdvLifetime", "1.3.6.1.2.1.44.1.3.2.2.5", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MnAdvTimeReceivedEnt extends MIBEntry<MIPMIBDef>
                        {
                            private MnAdvTimeReceivedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mnAdvTimeReceived", "1.3.6.1.2.1.44.1.3.2.2.6", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                    public static final class MnSolicitationsSentEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnSolicitationsSentEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnSolicitationsSent", "1.3.6.1.2.1.44.1.3.2.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnAdvertisementsReceivedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnAdvertisementsReceivedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnAdvertisementsReceived", "1.3.6.1.2.1.44.1.3.2.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnAdvsDroppedInvalidExtensionEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnAdvsDroppedInvalidExtensionEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnAdvsDroppedInvalidExtension", "1.3.6.1.2.1.44.1.3.2.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnAdvsIgnoredUnknownExtensionEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnAdvsIgnoredUnknownExtensionEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnAdvsIgnoredUnknownExtension", "1.3.6.1.2.1.44.1.3.2.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnMoveFromHAToFAEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnMoveFromHAToFAEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnMoveFromHAToFA", "1.3.6.1.2.1.44.1.3.2.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnMoveFromFAToFAEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnMoveFromFAToFAEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnMoveFromFAToFA", "1.3.6.1.2.1.44.1.3.2.8", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnMoveFromFAToHAEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnMoveFromFAToHAEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnMoveFromFAToHA", "1.3.6.1.2.1.44.1.3.2.9", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnGratuitousARPsSendEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnGratuitousARPsSendEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnGratuitousARPsSend", "1.3.6.1.2.1.44.1.3.2.10", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnAgentRebootsDectectedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnAgentRebootsDectectedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnAgentRebootsDectected", "1.3.6.1.2.1.44.1.3.2.11", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class MnRegistrationEnt extends MIBEntry<MIPMIBDef>
                {
                    /** Mobile Node Registration Group
Registration table of mobile node*/
                    public final MnRegistrationTableEnt mnRegistrationTable;

                    /** Mobile Node Registration Group Counters*/
                    public final MnRegRequestsSentEnt mnRegRequestsSent;

                    public final MnDeRegRequestsSentEnt mnDeRegRequestsSent;

                    public final MnRegRepliesRecievedEnt mnRegRepliesRecieved;

                    public final MnDeRegRepliesRecievedEnt mnDeRegRepliesRecieved;

                    public final MnRepliesInvalidHomeAddressEnt mnRepliesInvalidHomeAddress;

                    public final MnRepliesUnknownHAEnt mnRepliesUnknownHA;

                    public final MnRepliesUnknownFAEnt mnRepliesUnknownFA;

                    public final MnRepliesInvalidIDEnt mnRepliesInvalidID;

                    public final MnRepliesDroppedInvalidExtensionEnt mnRepliesDroppedInvalidExtension;

                    public final MnRepliesIgnoredUnknownExtensionEnt mnRepliesIgnoredUnknownExtension;

                    public final MnRepliesHAAuthenticationFailureEnt mnRepliesHAAuthenticationFailure;

                    public final MnRepliesFAAuthenticationFailureEnt mnRepliesFAAuthenticationFailure;

                    public final MnRegRequestsAcceptedEnt mnRegRequestsAccepted;

                    public final MnRegRequestsDeniedByHAEnt mnRegRequestsDeniedByHA;

                    public final MnRegRequestsDeniedByFAEnt mnRegRequestsDeniedByFA;

                    public final MnRegRequestsDeniedByHADueToIDEnt mnRegRequestsDeniedByHADueToID;

                    public final MnRegRequestsWithDirectedBroadcastEnt mnRegRequestsWithDirectedBroadcast;

                    private MnRegistrationEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mnRegistration", "1.3.6.1.2.1.44.1.3.3", false, false, false, false);
                        this.mnRegistrationTable = new MnRegistrationTableEnt(mib, this);
                        this.mnRegRequestsSent = new MnRegRequestsSentEnt(mib, this);
                        this.mnDeRegRequestsSent = new MnDeRegRequestsSentEnt(mib, this);
                        this.mnRegRepliesRecieved = new MnRegRepliesRecievedEnt(mib, this);
                        this.mnDeRegRepliesRecieved = new MnDeRegRepliesRecievedEnt(mib, this);
                        this.mnRepliesInvalidHomeAddress = new MnRepliesInvalidHomeAddressEnt(mib, this);
                        this.mnRepliesUnknownHA = new MnRepliesUnknownHAEnt(mib, this);
                        this.mnRepliesUnknownFA = new MnRepliesUnknownFAEnt(mib, this);
                        this.mnRepliesInvalidID = new MnRepliesInvalidIDEnt(mib, this);
                        this.mnRepliesDroppedInvalidExtension = new MnRepliesDroppedInvalidExtensionEnt(mib, this);
                        this.mnRepliesIgnoredUnknownExtension = new MnRepliesIgnoredUnknownExtensionEnt(mib, this);
                        this.mnRepliesHAAuthenticationFailure = new MnRepliesHAAuthenticationFailureEnt(mib, this);
                        this.mnRepliesFAAuthenticationFailure = new MnRepliesFAAuthenticationFailureEnt(mib, this);
                        this.mnRegRequestsAccepted = new MnRegRequestsAcceptedEnt(mib, this);
                        this.mnRegRequestsDeniedByHA = new MnRegRequestsDeniedByHAEnt(mib, this);
                        this.mnRegRequestsDeniedByFA = new MnRegRequestsDeniedByFAEnt(mib, this);
                        this.mnRegRequestsDeniedByHADueToID = new MnRegRequestsDeniedByHADueToIDEnt(mib, this);
                        this.mnRegRequestsWithDirectedBroadcast = new MnRegRequestsWithDirectedBroadcastEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mnRegistrationTable,
                            this.mnRegRequestsSent,
                            this.mnDeRegRequestsSent,
                            this.mnRegRepliesRecieved,
                            this.mnDeRegRepliesRecieved,
                            this.mnRepliesInvalidHomeAddress,
                            this.mnRepliesUnknownHA,
                            this.mnRepliesUnknownFA,
                            this.mnRepliesInvalidID,
                            this.mnRepliesDroppedInvalidExtension,
                            this.mnRepliesIgnoredUnknownExtension,
                            this.mnRepliesHAAuthenticationFailure,
                            this.mnRepliesFAAuthenticationFailure,
                            this.mnRegRequestsAccepted,
                            this.mnRegRequestsDeniedByHA,
                            this.mnRegRequestsDeniedByFA,
                            this.mnRegRequestsDeniedByHADueToID,
                            this.mnRegRequestsWithDirectedBroadcast
                        };
                    }
                    public static final class MnRegistrationTableEnt extends MIBEntry<MIPMIBDef>
                    {
                        public final MnRegistrationEntryEnt mnRegistrationEntry;

                        private MnRegistrationTableEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnRegistrationTable", "1.3.6.1.2.1.44.1.3.3.1", false, true, false, false);
                            this.mnRegistrationEntry = new MnRegistrationEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mnRegistrationEntry
                            };
                        }
                        public static final class MnRegistrationEntryEnt extends MIBEntry<MIPMIBDef>
                        {
                            public final MnRegAgentAddressEnt mnRegAgentAddress;

                            public final MnRegCOAEnt mnRegCOA;

                            public final MnRegFlagsEnt mnRegFlags;

                            public final MnRegIDLowEnt mnRegIDLow;

                            public final MnRegIDHighEnt mnRegIDHigh;

                            public final MnRegTimeRequestedEnt mnRegTimeRequested;

                            public final MnRegTimeRemainingEnt mnRegTimeRemaining;

                            public final MnRegTimeSentEnt mnRegTimeSent;

                            public final MnRegIsAcceptedEnt mnRegIsAccepted;

                            public final MnCOAIsLocalEnt mnCOAIsLocal;

                            private MnRegistrationEntryEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "mnRegistrationEntry", "1.3.6.1.2.1.44.1.3.3.1.1", false, false, false, true);
                                this.mnRegAgentAddress = new MnRegAgentAddressEnt(mib, this);
                                this.mnRegCOA = new MnRegCOAEnt(mib, this);
                                this.mnRegFlags = new MnRegFlagsEnt(mib, this);
                                this.mnRegIDLow = new MnRegIDLowEnt(mib, this);
                                this.mnRegIDHigh = new MnRegIDHighEnt(mib, this);
                                this.mnRegTimeRequested = new MnRegTimeRequestedEnt(mib, this);
                                this.mnRegTimeRemaining = new MnRegTimeRemainingEnt(mib, this);
                                this.mnRegTimeSent = new MnRegTimeSentEnt(mib, this);
                                this.mnRegIsAccepted = new MnRegIsAcceptedEnt(mib, this);
                                this.mnCOAIsLocal = new MnCOAIsLocalEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.mnRegAgentAddress,
                                    this.mnRegCOA,
                                    this.mnRegFlags,
                                    this.mnRegIDLow,
                                    this.mnRegIDHigh,
                                    this.mnRegTimeRequested,
                                    this.mnRegTimeRemaining,
                                    this.mnRegTimeSent,
                                    this.mnRegIsAccepted,
                                    this.mnCOAIsLocal
                                };
                            }
                            public static final class MnRegAgentAddressEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MnRegAgentAddressEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "mnRegAgentAddress", "1.3.6.1.2.1.44.1.3.3.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MnRegCOAEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MnRegCOAEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "mnRegCOA", "1.3.6.1.2.1.44.1.3.3.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MnRegFlagsEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MnRegFlagsEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "mnRegFlags", "1.3.6.1.2.1.44.1.3.3.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MnRegIDLowEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MnRegIDLowEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "mnRegIDLow", "1.3.6.1.2.1.44.1.3.3.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MnRegIDHighEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MnRegIDHighEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "mnRegIDHigh", "1.3.6.1.2.1.44.1.3.3.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MnRegTimeRequestedEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MnRegTimeRequestedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "mnRegTimeRequested", "1.3.6.1.2.1.44.1.3.3.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MnRegTimeRemainingEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MnRegTimeRemainingEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "mnRegTimeRemaining", "1.3.6.1.2.1.44.1.3.3.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MnRegTimeSentEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MnRegTimeSentEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "mnRegTimeSent", "1.3.6.1.2.1.44.1.3.3.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MnRegIsAcceptedEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MnRegIsAcceptedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "mnRegIsAccepted", "1.3.6.1.2.1.44.1.3.3.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MnCOAIsLocalEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MnCOAIsLocalEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "mnCOAIsLocal", "1.3.6.1.2.1.44.1.3.3.1.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class MnRegRequestsSentEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnRegRequestsSentEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnRegRequestsSent", "1.3.6.1.2.1.44.1.3.3.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnDeRegRequestsSentEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnDeRegRequestsSentEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnDeRegRequestsSent", "1.3.6.1.2.1.44.1.3.3.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnRegRepliesRecievedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnRegRepliesRecievedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnRegRepliesRecieved", "1.3.6.1.2.1.44.1.3.3.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnDeRegRepliesRecievedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnDeRegRepliesRecievedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnDeRegRepliesRecieved", "1.3.6.1.2.1.44.1.3.3.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnRepliesInvalidHomeAddressEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnRepliesInvalidHomeAddressEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnRepliesInvalidHomeAddress", "1.3.6.1.2.1.44.1.3.3.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnRepliesUnknownHAEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnRepliesUnknownHAEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnRepliesUnknownHA", "1.3.6.1.2.1.44.1.3.3.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnRepliesUnknownFAEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnRepliesUnknownFAEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnRepliesUnknownFA", "1.3.6.1.2.1.44.1.3.3.8", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnRepliesInvalidIDEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnRepliesInvalidIDEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnRepliesInvalidID", "1.3.6.1.2.1.44.1.3.3.9", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnRepliesDroppedInvalidExtensionEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnRepliesDroppedInvalidExtensionEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnRepliesDroppedInvalidExtension", "1.3.6.1.2.1.44.1.3.3.10", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnRepliesIgnoredUnknownExtensionEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnRepliesIgnoredUnknownExtensionEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnRepliesIgnoredUnknownExtension", "1.3.6.1.2.1.44.1.3.3.11", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnRepliesHAAuthenticationFailureEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnRepliesHAAuthenticationFailureEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnRepliesHAAuthenticationFailure", "1.3.6.1.2.1.44.1.3.3.12", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnRepliesFAAuthenticationFailureEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnRepliesFAAuthenticationFailureEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnRepliesFAAuthenticationFailure", "1.3.6.1.2.1.44.1.3.3.13", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnRegRequestsAcceptedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnRegRequestsAcceptedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnRegRequestsAccepted", "1.3.6.1.2.1.44.1.3.3.14", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnRegRequestsDeniedByHAEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnRegRequestsDeniedByHAEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnRegRequestsDeniedByHA", "1.3.6.1.2.1.44.1.3.3.15", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnRegRequestsDeniedByFAEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnRegRequestsDeniedByFAEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnRegRequestsDeniedByFA", "1.3.6.1.2.1.44.1.3.3.16", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnRegRequestsDeniedByHADueToIDEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnRegRequestsDeniedByHADueToIDEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnRegRequestsDeniedByHADueToID", "1.3.6.1.2.1.44.1.3.3.17", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MnRegRequestsWithDirectedBroadcastEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MnRegRequestsWithDirectedBroadcastEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "mnRegRequestsWithDirectedBroadcast", "1.3.6.1.2.1.44.1.3.3.18", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MipMAEnt extends MIBEntry<MIPMIBDef>
            {
                public final MaAdvertisementEnt maAdvertisement;

                private MipMAEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                {
                    super(mib, parent, "mipMA", "1.3.6.1.2.1.44.1.4", false, false, false, false);
                    this.maAdvertisement = new MaAdvertisementEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.maAdvertisement
                    };
                }
                public static final class MaAdvertisementEnt extends MIBEntry<MIPMIBDef>
                {
                    /** MA Advertisement Group
Mobility agent advertisement configuration table*/
                    public final MaAdvConfigTableEnt maAdvConfigTable;

                    /** MA Advertisement Group Counters*/
                    public final MaAdvertisementsSentEnt maAdvertisementsSent;

                    public final MaAdvsSentForSolicitationEnt maAdvsSentForSolicitation;

                    public final MaSolicitationsReceivedEnt maSolicitationsReceived;

                    private MaAdvertisementEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "maAdvertisement", "1.3.6.1.2.1.44.1.4.2", false, false, false, false);
                        this.maAdvConfigTable = new MaAdvConfigTableEnt(mib, this);
                        this.maAdvertisementsSent = new MaAdvertisementsSentEnt(mib, this);
                        this.maAdvsSentForSolicitation = new MaAdvsSentForSolicitationEnt(mib, this);
                        this.maSolicitationsReceived = new MaSolicitationsReceivedEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.maAdvConfigTable,
                            this.maAdvertisementsSent,
                            this.maAdvsSentForSolicitation,
                            this.maSolicitationsReceived
                        };
                    }
                    public static final class MaAdvConfigTableEnt extends MIBEntry<MIPMIBDef>
                    {
                        public final MaAdvConfigEntryEnt maAdvConfigEntry;

                        private MaAdvConfigTableEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "maAdvConfigTable", "1.3.6.1.2.1.44.1.4.2.1", false, true, false, false);
                            this.maAdvConfigEntry = new MaAdvConfigEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.maAdvConfigEntry
                            };
                        }
                        public static final class MaAdvConfigEntryEnt extends MIBEntry<MIPMIBDef>
                        {
                            public final MaInterfaceAddressEnt maInterfaceAddress;

                            public final MaAdvMaxRegLifetimeEnt maAdvMaxRegLifetime;

                            public final MaAdvPrefixLengthInclusionEnt maAdvPrefixLengthInclusion;

                            public final MaAdvAddressEnt maAdvAddress;

                            public final MaAdvMaxIntervalEnt maAdvMaxInterval;

                            public final MaAdvMinIntervalEnt maAdvMinInterval;

                            public final MaAdvMaxAdvLifetimeEnt maAdvMaxAdvLifetime;

                            public final MaAdvResponseSolicitationOnlyEnt maAdvResponseSolicitationOnly;

                            public final MaAdvStatusEnt maAdvStatus;

                            private MaAdvConfigEntryEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "maAdvConfigEntry", "1.3.6.1.2.1.44.1.4.2.1.1", false, false, false, true);
                                this.maInterfaceAddress = new MaInterfaceAddressEnt(mib, this);
                                this.maAdvMaxRegLifetime = new MaAdvMaxRegLifetimeEnt(mib, this);
                                this.maAdvPrefixLengthInclusion = new MaAdvPrefixLengthInclusionEnt(mib, this);
                                this.maAdvAddress = new MaAdvAddressEnt(mib, this);
                                this.maAdvMaxInterval = new MaAdvMaxIntervalEnt(mib, this);
                                this.maAdvMinInterval = new MaAdvMinIntervalEnt(mib, this);
                                this.maAdvMaxAdvLifetime = new MaAdvMaxAdvLifetimeEnt(mib, this);
                                this.maAdvResponseSolicitationOnly = new MaAdvResponseSolicitationOnlyEnt(mib, this);
                                this.maAdvStatus = new MaAdvStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.maInterfaceAddress,
                                    this.maAdvMaxRegLifetime,
                                    this.maAdvPrefixLengthInclusion,
                                    this.maAdvAddress,
                                    this.maAdvMaxInterval,
                                    this.maAdvMinInterval,
                                    this.maAdvMaxAdvLifetime,
                                    this.maAdvResponseSolicitationOnly,
                                    this.maAdvStatus
                                };
                            }
                            public static final class MaInterfaceAddressEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MaInterfaceAddressEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "maInterfaceAddress", "1.3.6.1.2.1.44.1.4.2.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MaAdvMaxRegLifetimeEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MaAdvMaxRegLifetimeEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "maAdvMaxRegLifetime", "1.3.6.1.2.1.44.1.4.2.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MaAdvPrefixLengthInclusionEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MaAdvPrefixLengthInclusionEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "maAdvPrefixLengthInclusion", "1.3.6.1.2.1.44.1.4.2.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MaAdvAddressEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MaAdvAddressEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "maAdvAddress", "1.3.6.1.2.1.44.1.4.2.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MaAdvMaxIntervalEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MaAdvMaxIntervalEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "maAdvMaxInterval", "1.3.6.1.2.1.44.1.4.2.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MaAdvMinIntervalEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MaAdvMinIntervalEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "maAdvMinInterval", "1.3.6.1.2.1.44.1.4.2.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MaAdvMaxAdvLifetimeEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MaAdvMaxAdvLifetimeEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "maAdvMaxAdvLifetime", "1.3.6.1.2.1.44.1.4.2.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MaAdvResponseSolicitationOnlyEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MaAdvResponseSolicitationOnlyEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "maAdvResponseSolicitationOnly", "1.3.6.1.2.1.44.1.4.2.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class MaAdvStatusEnt extends MIBEntry<MIPMIBDef>
                            {
                                private MaAdvStatusEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "maAdvStatus", "1.3.6.1.2.1.44.1.4.2.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class MaAdvertisementsSentEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MaAdvertisementsSentEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "maAdvertisementsSent", "1.3.6.1.2.1.44.1.4.2.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MaAdvsSentForSolicitationEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MaAdvsSentForSolicitationEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "maAdvsSentForSolicitation", "1.3.6.1.2.1.44.1.4.2.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MaSolicitationsReceivedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private MaSolicitationsReceivedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "maSolicitationsReceived", "1.3.6.1.2.1.44.1.4.2.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MipFAEnt extends MIBEntry<MIPMIBDef>
            {
                public final FaSystemEnt faSystem;

                public final FaAdvertisementEnt faAdvertisement;

                public final FaRegistrationEnt faRegistration;

                private MipFAEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                {
                    super(mib, parent, "mipFA", "1.3.6.1.2.1.44.1.5", false, false, false, false);
                    this.faSystem = new FaSystemEnt(mib, this);
                    this.faAdvertisement = new FaAdvertisementEnt(mib, this);
                    this.faRegistration = new FaRegistrationEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.faSystem,
                        this.faAdvertisement,
                        this.faRegistration
                    };
                }
                public static final class FaSystemEnt extends MIBEntry<MIPMIBDef>
                {
                    /** Foreign Agent Group
Foreign Agent System Group*/
                    public final FaCOATableEnt faCOATable;

                    private FaSystemEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "faSystem", "1.3.6.1.2.1.44.1.5.1", false, false, false, false);
                        this.faCOATable = new FaCOATableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.faCOATable
                        };
                    }
                    public static final class FaCOATableEnt extends MIBEntry<MIPMIBDef>
                    {
                        public final FaCOAEntryEnt faCOAEntry;

                        private FaCOATableEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faCOATable", "1.3.6.1.2.1.44.1.5.1.1", false, true, false, false);
                            this.faCOAEntry = new FaCOAEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.faCOAEntry
                            };
                        }
                        public static final class FaCOAEntryEnt extends MIBEntry<MIPMIBDef>
                        {
                            public final FaSupportedCOAEnt faSupportedCOA;

                            public final FaCOAStatusEnt faCOAStatus;

                            private FaCOAEntryEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "faCOAEntry", "1.3.6.1.2.1.44.1.5.1.1.1", false, false, false, true);
                                this.faSupportedCOA = new FaSupportedCOAEnt(mib, this);
                                this.faCOAStatus = new FaCOAStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.faSupportedCOA,
                                    this.faCOAStatus
                                };
                            }
                            public static final class FaSupportedCOAEnt extends MIBEntry<MIPMIBDef>
                            {
                                private FaSupportedCOAEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "faSupportedCOA", "1.3.6.1.2.1.44.1.5.1.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class FaCOAStatusEnt extends MIBEntry<MIPMIBDef>
                            {
                                private FaCOAStatusEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "faCOAStatus", "1.3.6.1.2.1.44.1.5.1.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class FaAdvertisementEnt extends MIBEntry<MIPMIBDef>
                {
                    /** Foreign Agent Advertisement GroupFA needs to implement MA Advertisement Group plus that group*/
                    public final FaIsBusyEnt faIsBusy;

                    public final FaRegistrationRequiredEnt faRegistrationRequired;

                    private FaAdvertisementEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "faAdvertisement", "1.3.6.1.2.1.44.1.5.2", false, false, false, false);
                        this.faIsBusy = new FaIsBusyEnt(mib, this);
                        this.faRegistrationRequired = new FaRegistrationRequiredEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.faIsBusy,
                            this.faRegistrationRequired
                        };
                    }
                    public static final class FaIsBusyEnt extends MIBEntry<MIPMIBDef>
                    {
                        private FaIsBusyEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faIsBusy", "1.3.6.1.2.1.44.1.5.2.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FaRegistrationRequiredEnt extends MIBEntry<MIPMIBDef>
                    {
                        private FaRegistrationRequiredEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faRegistrationRequired", "1.3.6.1.2.1.44.1.5.2.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class FaRegistrationEnt extends MIBEntry<MIPMIBDef>
                {
                    /** Foreign Agent Registration Group
Foreign Agent Visitors List*/
                    public final FaVisitorTableEnt faVisitorTable;

                    /** Foreign Agent Registration Group Counters*/
                    public final FaRegRequestsReceivedEnt faRegRequestsReceived;

                    public final FaRegRequestsRelayedEnt faRegRequestsRelayed;

                    public final FaReasonUnspecifiedEnt faReasonUnspecified;

                    public final FaAdmProhibitedEnt faAdmProhibited;

                    public final FaInsufficientResourceEnt faInsufficientResource;

                    public final FaMNAuthenticationFailureEnt faMNAuthenticationFailure;

                    public final FaRegLifetimeTooLongEnt faRegLifetimeTooLong;

                    public final FaPoorlyFormedRequestsEnt faPoorlyFormedRequests;

                    public final FaEncapsulationUnavailableEnt faEncapsulationUnavailable;

                    public final FaVJCompressionUnavailableEnt faVJCompressionUnavailable;

                    public final FaHAUnreachableEnt faHAUnreachable;

                    public final FaRegRepliesRecievedEnt faRegRepliesRecieved;

                    public final FaRegRepliesRelayedEnt faRegRepliesRelayed;

                    public final FaHAAuthenticationFailureEnt faHAAuthenticationFailure;

                    public final FaPoorlyFormedRepliesEnt faPoorlyFormedReplies;

                    private FaRegistrationEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "faRegistration", "1.3.6.1.2.1.44.1.5.3", false, false, false, false);
                        this.faVisitorTable = new FaVisitorTableEnt(mib, this);
                        this.faRegRequestsReceived = new FaRegRequestsReceivedEnt(mib, this);
                        this.faRegRequestsRelayed = new FaRegRequestsRelayedEnt(mib, this);
                        this.faReasonUnspecified = new FaReasonUnspecifiedEnt(mib, this);
                        this.faAdmProhibited = new FaAdmProhibitedEnt(mib, this);
                        this.faInsufficientResource = new FaInsufficientResourceEnt(mib, this);
                        this.faMNAuthenticationFailure = new FaMNAuthenticationFailureEnt(mib, this);
                        this.faRegLifetimeTooLong = new FaRegLifetimeTooLongEnt(mib, this);
                        this.faPoorlyFormedRequests = new FaPoorlyFormedRequestsEnt(mib, this);
                        this.faEncapsulationUnavailable = new FaEncapsulationUnavailableEnt(mib, this);
                        this.faVJCompressionUnavailable = new FaVJCompressionUnavailableEnt(mib, this);
                        this.faHAUnreachable = new FaHAUnreachableEnt(mib, this);
                        this.faRegRepliesRecieved = new FaRegRepliesRecievedEnt(mib, this);
                        this.faRegRepliesRelayed = new FaRegRepliesRelayedEnt(mib, this);
                        this.faHAAuthenticationFailure = new FaHAAuthenticationFailureEnt(mib, this);
                        this.faPoorlyFormedReplies = new FaPoorlyFormedRepliesEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.faVisitorTable,
                            this.faRegRequestsReceived,
                            this.faRegRequestsRelayed,
                            this.faReasonUnspecified,
                            this.faAdmProhibited,
                            this.faInsufficientResource,
                            this.faMNAuthenticationFailure,
                            this.faRegLifetimeTooLong,
                            this.faPoorlyFormedRequests,
                            this.faEncapsulationUnavailable,
                            this.faVJCompressionUnavailable,
                            this.faHAUnreachable,
                            this.faRegRepliesRecieved,
                            this.faRegRepliesRelayed,
                            this.faHAAuthenticationFailure,
                            this.faPoorlyFormedReplies
                        };
                    }
                    public static final class FaVisitorTableEnt extends MIBEntry<MIPMIBDef>
                    {
                        public final FaVisitorEntryEnt faVisitorEntry;

                        private FaVisitorTableEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faVisitorTable", "1.3.6.1.2.1.44.1.5.3.1", false, true, false, false);
                            this.faVisitorEntry = new FaVisitorEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.faVisitorEntry
                            };
                        }
                        public static final class FaVisitorEntryEnt extends MIBEntry<MIPMIBDef>
                        {
                            public final FaVisitorIPAddressEnt faVisitorIPAddress;

                            public final FaVisitorHomeAddressEnt faVisitorHomeAddress;

                            public final FaVisitorHomeAgentAddressEnt faVisitorHomeAgentAddress;

                            public final FaVisitorTimeGrantedEnt faVisitorTimeGranted;

                            public final FaVisitorTimeRemainingEnt faVisitorTimeRemaining;

                            public final FaVisitorRegFlagsEnt faVisitorRegFlags;

                            public final FaVisitorRegIDLowEnt faVisitorRegIDLow;

                            public final FaVisitorRegIDHighEnt faVisitorRegIDHigh;

                            public final FaVisitorRegIsAcceptedEnt faVisitorRegIsAccepted;

                            private FaVisitorEntryEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "faVisitorEntry", "1.3.6.1.2.1.44.1.5.3.1.1", false, false, false, true);
                                this.faVisitorIPAddress = new FaVisitorIPAddressEnt(mib, this);
                                this.faVisitorHomeAddress = new FaVisitorHomeAddressEnt(mib, this);
                                this.faVisitorHomeAgentAddress = new FaVisitorHomeAgentAddressEnt(mib, this);
                                this.faVisitorTimeGranted = new FaVisitorTimeGrantedEnt(mib, this);
                                this.faVisitorTimeRemaining = new FaVisitorTimeRemainingEnt(mib, this);
                                this.faVisitorRegFlags = new FaVisitorRegFlagsEnt(mib, this);
                                this.faVisitorRegIDLow = new FaVisitorRegIDLowEnt(mib, this);
                                this.faVisitorRegIDHigh = new FaVisitorRegIDHighEnt(mib, this);
                                this.faVisitorRegIsAccepted = new FaVisitorRegIsAcceptedEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.faVisitorIPAddress,
                                    this.faVisitorHomeAddress,
                                    this.faVisitorHomeAgentAddress,
                                    this.faVisitorTimeGranted,
                                    this.faVisitorTimeRemaining,
                                    this.faVisitorRegFlags,
                                    this.faVisitorRegIDLow,
                                    this.faVisitorRegIDHigh,
                                    this.faVisitorRegIsAccepted
                                };
                            }
                            public static final class FaVisitorIPAddressEnt extends MIBEntry<MIPMIBDef>
                            {
                                private FaVisitorIPAddressEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "faVisitorIPAddress", "1.3.6.1.2.1.44.1.5.3.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class FaVisitorHomeAddressEnt extends MIBEntry<MIPMIBDef>
                            {
                                private FaVisitorHomeAddressEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "faVisitorHomeAddress", "1.3.6.1.2.1.44.1.5.3.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class FaVisitorHomeAgentAddressEnt extends MIBEntry<MIPMIBDef>
                            {
                                private FaVisitorHomeAgentAddressEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "faVisitorHomeAgentAddress", "1.3.6.1.2.1.44.1.5.3.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class FaVisitorTimeGrantedEnt extends MIBEntry<MIPMIBDef>
                            {
                                private FaVisitorTimeGrantedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "faVisitorTimeGranted", "1.3.6.1.2.1.44.1.5.3.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class FaVisitorTimeRemainingEnt extends MIBEntry<MIPMIBDef>
                            {
                                private FaVisitorTimeRemainingEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "faVisitorTimeRemaining", "1.3.6.1.2.1.44.1.5.3.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class FaVisitorRegFlagsEnt extends MIBEntry<MIPMIBDef>
                            {
                                private FaVisitorRegFlagsEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "faVisitorRegFlags", "1.3.6.1.2.1.44.1.5.3.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class FaVisitorRegIDLowEnt extends MIBEntry<MIPMIBDef>
                            {
                                private FaVisitorRegIDLowEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "faVisitorRegIDLow", "1.3.6.1.2.1.44.1.5.3.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class FaVisitorRegIDHighEnt extends MIBEntry<MIPMIBDef>
                            {
                                private FaVisitorRegIDHighEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "faVisitorRegIDHigh", "1.3.6.1.2.1.44.1.5.3.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class FaVisitorRegIsAcceptedEnt extends MIBEntry<MIPMIBDef>
                            {
                                private FaVisitorRegIsAcceptedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "faVisitorRegIsAccepted", "1.3.6.1.2.1.44.1.5.3.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class FaRegRequestsReceivedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private FaRegRequestsReceivedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faRegRequestsReceived", "1.3.6.1.2.1.44.1.5.3.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FaRegRequestsRelayedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private FaRegRequestsRelayedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faRegRequestsRelayed", "1.3.6.1.2.1.44.1.5.3.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FaReasonUnspecifiedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private FaReasonUnspecifiedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faReasonUnspecified", "1.3.6.1.2.1.44.1.5.3.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FaAdmProhibitedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private FaAdmProhibitedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faAdmProhibited", "1.3.6.1.2.1.44.1.5.3.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FaInsufficientResourceEnt extends MIBEntry<MIPMIBDef>
                    {
                        private FaInsufficientResourceEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faInsufficientResource", "1.3.6.1.2.1.44.1.5.3.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FaMNAuthenticationFailureEnt extends MIBEntry<MIPMIBDef>
                    {
                        private FaMNAuthenticationFailureEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faMNAuthenticationFailure", "1.3.6.1.2.1.44.1.5.3.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FaRegLifetimeTooLongEnt extends MIBEntry<MIPMIBDef>
                    {
                        private FaRegLifetimeTooLongEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faRegLifetimeTooLong", "1.3.6.1.2.1.44.1.5.3.8", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FaPoorlyFormedRequestsEnt extends MIBEntry<MIPMIBDef>
                    {
                        private FaPoorlyFormedRequestsEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faPoorlyFormedRequests", "1.3.6.1.2.1.44.1.5.3.9", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FaEncapsulationUnavailableEnt extends MIBEntry<MIPMIBDef>
                    {
                        private FaEncapsulationUnavailableEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faEncapsulationUnavailable", "1.3.6.1.2.1.44.1.5.3.10", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FaVJCompressionUnavailableEnt extends MIBEntry<MIPMIBDef>
                    {
                        private FaVJCompressionUnavailableEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faVJCompressionUnavailable", "1.3.6.1.2.1.44.1.5.3.11", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FaHAUnreachableEnt extends MIBEntry<MIPMIBDef>
                    {
                        private FaHAUnreachableEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faHAUnreachable", "1.3.6.1.2.1.44.1.5.3.12", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FaRegRepliesRecievedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private FaRegRepliesRecievedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faRegRepliesRecieved", "1.3.6.1.2.1.44.1.5.3.13", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FaRegRepliesRelayedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private FaRegRepliesRelayedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faRegRepliesRelayed", "1.3.6.1.2.1.44.1.5.3.14", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FaHAAuthenticationFailureEnt extends MIBEntry<MIPMIBDef>
                    {
                        private FaHAAuthenticationFailureEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faHAAuthenticationFailure", "1.3.6.1.2.1.44.1.5.3.15", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FaPoorlyFormedRepliesEnt extends MIBEntry<MIPMIBDef>
                    {
                        private FaPoorlyFormedRepliesEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "faPoorlyFormedReplies", "1.3.6.1.2.1.44.1.5.3.16", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MipHAEnt extends MIBEntry<MIPMIBDef>
            {
                public final HaRegistrationEnt haRegistration;

                private MipHAEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                {
                    super(mib, parent, "mipHA", "1.3.6.1.2.1.44.1.6", false, false, false, false);
                    this.haRegistration = new HaRegistrationEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.haRegistration
                    };
                }
                public static final class HaRegistrationEnt extends MIBEntry<MIPMIBDef>
                {
                    /** Home Agent Group
Home Agent Registration Group
Home agent mobility binding list*/
                    public final HaMobilityBindingTableEnt haMobilityBindingTable;

                    /** Home Agent Registration Group Counters
Home agent registration Counters per node*/
                    public final HaCounterTableEnt haCounterTable;

                    /** Home agent registration Counters for all mobile nodes.*/
                    public final HaRegistrationAcceptedEnt haRegistrationAccepted;

                    public final HaMultiBindingUnsupportedEnt haMultiBindingUnsupported;

                    public final HaReasonUnspecifiedEnt haReasonUnspecified;

                    public final HaAdmProhibitedEnt haAdmProhibited;

                    public final HaInsufficientResourceEnt haInsufficientResource;

                    public final HaMNAuthenticationFailureEnt haMNAuthenticationFailure;

                    public final HaFAAuthenticationFailureEnt haFAAuthenticationFailure;

                    public final HaIDMismatchEnt haIDMismatch;

                    public final HaPoorlyFormedRequestEnt haPoorlyFormedRequest;

                    public final HaTooManyBindingsEnt haTooManyBindings;

                    public final HaUnknownHAEnt haUnknownHA;

                    public final HaGratuitiousARPsSentEnt haGratuitiousARPsSent;

                    public final HaProxyARPsSentEnt haProxyARPsSent;

                    public final HaRegRequestsReceivedEnt haRegRequestsReceived;

                    public final HaDeRegRequestsReceivedEnt haDeRegRequestsReceived;

                    public final HaRegRepliesSentEnt haRegRepliesSent;

                    public final HaDeRegRepliesSentEnt haDeRegRepliesSent;

                    private HaRegistrationEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "haRegistration", "1.3.6.1.2.1.44.1.6.3", false, false, false, false);
                        this.haMobilityBindingTable = new HaMobilityBindingTableEnt(mib, this);
                        this.haCounterTable = new HaCounterTableEnt(mib, this);
                        this.haRegistrationAccepted = new HaRegistrationAcceptedEnt(mib, this);
                        this.haMultiBindingUnsupported = new HaMultiBindingUnsupportedEnt(mib, this);
                        this.haReasonUnspecified = new HaReasonUnspecifiedEnt(mib, this);
                        this.haAdmProhibited = new HaAdmProhibitedEnt(mib, this);
                        this.haInsufficientResource = new HaInsufficientResourceEnt(mib, this);
                        this.haMNAuthenticationFailure = new HaMNAuthenticationFailureEnt(mib, this);
                        this.haFAAuthenticationFailure = new HaFAAuthenticationFailureEnt(mib, this);
                        this.haIDMismatch = new HaIDMismatchEnt(mib, this);
                        this.haPoorlyFormedRequest = new HaPoorlyFormedRequestEnt(mib, this);
                        this.haTooManyBindings = new HaTooManyBindingsEnt(mib, this);
                        this.haUnknownHA = new HaUnknownHAEnt(mib, this);
                        this.haGratuitiousARPsSent = new HaGratuitiousARPsSentEnt(mib, this);
                        this.haProxyARPsSent = new HaProxyARPsSentEnt(mib, this);
                        this.haRegRequestsReceived = new HaRegRequestsReceivedEnt(mib, this);
                        this.haDeRegRequestsReceived = new HaDeRegRequestsReceivedEnt(mib, this);
                        this.haRegRepliesSent = new HaRegRepliesSentEnt(mib, this);
                        this.haDeRegRepliesSent = new HaDeRegRepliesSentEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.haMobilityBindingTable,
                            this.haCounterTable,
                            this.haRegistrationAccepted,
                            this.haMultiBindingUnsupported,
                            this.haReasonUnspecified,
                            this.haAdmProhibited,
                            this.haInsufficientResource,
                            this.haMNAuthenticationFailure,
                            this.haFAAuthenticationFailure,
                            this.haIDMismatch,
                            this.haPoorlyFormedRequest,
                            this.haTooManyBindings,
                            this.haUnknownHA,
                            this.haGratuitiousARPsSent,
                            this.haProxyARPsSent,
                            this.haRegRequestsReceived,
                            this.haDeRegRequestsReceived,
                            this.haRegRepliesSent,
                            this.haDeRegRepliesSent
                        };
                    }
                    public static final class HaMobilityBindingTableEnt extends MIBEntry<MIPMIBDef>
                    {
                        public final HaMobilityBindingEntryEnt haMobilityBindingEntry;

                        private HaMobilityBindingTableEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haMobilityBindingTable", "1.3.6.1.2.1.44.1.6.3.1", false, true, false, false);
                            this.haMobilityBindingEntry = new HaMobilityBindingEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.haMobilityBindingEntry
                            };
                        }
                        public static final class HaMobilityBindingEntryEnt extends MIBEntry<MIPMIBDef>
                        {
                            public final HaMobilityBindingMNEnt haMobilityBindingMN;

                            public final HaMobilityBindingCOAEnt haMobilityBindingCOA;

                            public final HaMobilityBindingSourceAddressEnt haMobilityBindingSourceAddress;

                            public final HaMobilityBindingRegFlagsEnt haMobilityBindingRegFlags;

                            public final HaMobilityBindingRegIDLowEnt haMobilityBindingRegIDLow;

                            public final HaMobilityBindingRegIDHighEnt haMobilityBindingRegIDHigh;

                            public final HaMobilityBindingTimeGrantedEnt haMobilityBindingTimeGranted;

                            public final HaMobilityBindingTimeRemainingEnt haMobilityBindingTimeRemaining;

                            private HaMobilityBindingEntryEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "haMobilityBindingEntry", "1.3.6.1.2.1.44.1.6.3.1.1", false, false, false, true);
                                this.haMobilityBindingMN = new HaMobilityBindingMNEnt(mib, this);
                                this.haMobilityBindingCOA = new HaMobilityBindingCOAEnt(mib, this);
                                this.haMobilityBindingSourceAddress = new HaMobilityBindingSourceAddressEnt(mib, this);
                                this.haMobilityBindingRegFlags = new HaMobilityBindingRegFlagsEnt(mib, this);
                                this.haMobilityBindingRegIDLow = new HaMobilityBindingRegIDLowEnt(mib, this);
                                this.haMobilityBindingRegIDHigh = new HaMobilityBindingRegIDHighEnt(mib, this);
                                this.haMobilityBindingTimeGranted = new HaMobilityBindingTimeGrantedEnt(mib, this);
                                this.haMobilityBindingTimeRemaining = new HaMobilityBindingTimeRemainingEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.haMobilityBindingMN,
                                    this.haMobilityBindingCOA,
                                    this.haMobilityBindingSourceAddress,
                                    this.haMobilityBindingRegFlags,
                                    this.haMobilityBindingRegIDLow,
                                    this.haMobilityBindingRegIDHigh,
                                    this.haMobilityBindingTimeGranted,
                                    this.haMobilityBindingTimeRemaining
                                };
                            }
                            public static final class HaMobilityBindingMNEnt extends MIBEntry<MIPMIBDef>
                            {
                                private HaMobilityBindingMNEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "haMobilityBindingMN", "1.3.6.1.2.1.44.1.6.3.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class HaMobilityBindingCOAEnt extends MIBEntry<MIPMIBDef>
                            {
                                private HaMobilityBindingCOAEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "haMobilityBindingCOA", "1.3.6.1.2.1.44.1.6.3.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class HaMobilityBindingSourceAddressEnt extends MIBEntry<MIPMIBDef>
                            {
                                private HaMobilityBindingSourceAddressEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "haMobilityBindingSourceAddress", "1.3.6.1.2.1.44.1.6.3.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class HaMobilityBindingRegFlagsEnt extends MIBEntry<MIPMIBDef>
                            {
                                private HaMobilityBindingRegFlagsEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "haMobilityBindingRegFlags", "1.3.6.1.2.1.44.1.6.3.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class HaMobilityBindingRegIDLowEnt extends MIBEntry<MIPMIBDef>
                            {
                                private HaMobilityBindingRegIDLowEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "haMobilityBindingRegIDLow", "1.3.6.1.2.1.44.1.6.3.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class HaMobilityBindingRegIDHighEnt extends MIBEntry<MIPMIBDef>
                            {
                                private HaMobilityBindingRegIDHighEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "haMobilityBindingRegIDHigh", "1.3.6.1.2.1.44.1.6.3.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class HaMobilityBindingTimeGrantedEnt extends MIBEntry<MIPMIBDef>
                            {
                                private HaMobilityBindingTimeGrantedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "haMobilityBindingTimeGranted", "1.3.6.1.2.1.44.1.6.3.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class HaMobilityBindingTimeRemainingEnt extends MIBEntry<MIPMIBDef>
                            {
                                private HaMobilityBindingTimeRemainingEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "haMobilityBindingTimeRemaining", "1.3.6.1.2.1.44.1.6.3.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class HaCounterTableEnt extends MIBEntry<MIPMIBDef>
                    {
                        public final HaCounterEntryEnt haCounterEntry;

                        private HaCounterTableEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haCounterTable", "1.3.6.1.2.1.44.1.6.3.2", false, true, false, false);
                            this.haCounterEntry = new HaCounterEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.haCounterEntry
                            };
                        }
                        public static final class HaCounterEntryEnt extends MIBEntry<MIPMIBDef>
                        {
                            public final HaServiceRequestsAcceptedEnt haServiceRequestsAccepted;

                            public final HaServiceRequestsDeniedEnt haServiceRequestsDenied;

                            public final HaOverallServiceTimeEnt haOverallServiceTime;

                            public final HaRecentServiceAcceptedTimeEnt haRecentServiceAcceptedTime;

                            public final HaRecentServiceDeniedTimeEnt haRecentServiceDeniedTime;

                            public final HaRecentServiceDeniedCodeEnt haRecentServiceDeniedCode;

                            private HaCounterEntryEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                            {
                                super(mib, parent, "haCounterEntry", "1.3.6.1.2.1.44.1.6.3.2.1", false, false, false, true);
                                this.haServiceRequestsAccepted = new HaServiceRequestsAcceptedEnt(mib, this);
                                this.haServiceRequestsDenied = new HaServiceRequestsDeniedEnt(mib, this);
                                this.haOverallServiceTime = new HaOverallServiceTimeEnt(mib, this);
                                this.haRecentServiceAcceptedTime = new HaRecentServiceAcceptedTimeEnt(mib, this);
                                this.haRecentServiceDeniedTime = new HaRecentServiceDeniedTimeEnt(mib, this);
                                this.haRecentServiceDeniedCode = new HaRecentServiceDeniedCodeEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.haServiceRequestsAccepted,
                                    this.haServiceRequestsDenied,
                                    this.haOverallServiceTime,
                                    this.haRecentServiceAcceptedTime,
                                    this.haRecentServiceDeniedTime,
                                    this.haRecentServiceDeniedCode
                                };
                            }
                            public static final class HaServiceRequestsAcceptedEnt extends MIBEntry<MIPMIBDef>
                            {
                                private HaServiceRequestsAcceptedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "haServiceRequestsAccepted", "1.3.6.1.2.1.44.1.6.3.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class HaServiceRequestsDeniedEnt extends MIBEntry<MIPMIBDef>
                            {
                                private HaServiceRequestsDeniedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "haServiceRequestsDenied", "1.3.6.1.2.1.44.1.6.3.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class HaOverallServiceTimeEnt extends MIBEntry<MIPMIBDef>
                            {
                                private HaOverallServiceTimeEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "haOverallServiceTime", "1.3.6.1.2.1.44.1.6.3.2.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class HaRecentServiceAcceptedTimeEnt extends MIBEntry<MIPMIBDef>
                            {
                                private HaRecentServiceAcceptedTimeEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "haRecentServiceAcceptedTime", "1.3.6.1.2.1.44.1.6.3.2.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class HaRecentServiceDeniedTimeEnt extends MIBEntry<MIPMIBDef>
                            {
                                private HaRecentServiceDeniedTimeEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "haRecentServiceDeniedTime", "1.3.6.1.2.1.44.1.6.3.2.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class HaRecentServiceDeniedCodeEnt extends MIBEntry<MIPMIBDef>
                            {
                                private HaRecentServiceDeniedCodeEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                                {
                                    super(mib, parent, "haRecentServiceDeniedCode", "1.3.6.1.2.1.44.1.6.3.2.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class HaRegistrationAcceptedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private HaRegistrationAcceptedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haRegistrationAccepted", "1.3.6.1.2.1.44.1.6.3.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HaMultiBindingUnsupportedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private HaMultiBindingUnsupportedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haMultiBindingUnsupported", "1.3.6.1.2.1.44.1.6.3.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HaReasonUnspecifiedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private HaReasonUnspecifiedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haReasonUnspecified", "1.3.6.1.2.1.44.1.6.3.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HaAdmProhibitedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private HaAdmProhibitedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haAdmProhibited", "1.3.6.1.2.1.44.1.6.3.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HaInsufficientResourceEnt extends MIBEntry<MIPMIBDef>
                    {
                        private HaInsufficientResourceEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haInsufficientResource", "1.3.6.1.2.1.44.1.6.3.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HaMNAuthenticationFailureEnt extends MIBEntry<MIPMIBDef>
                    {
                        private HaMNAuthenticationFailureEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haMNAuthenticationFailure", "1.3.6.1.2.1.44.1.6.3.8", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HaFAAuthenticationFailureEnt extends MIBEntry<MIPMIBDef>
                    {
                        private HaFAAuthenticationFailureEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haFAAuthenticationFailure", "1.3.6.1.2.1.44.1.6.3.9", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HaIDMismatchEnt extends MIBEntry<MIPMIBDef>
                    {
                        private HaIDMismatchEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haIDMismatch", "1.3.6.1.2.1.44.1.6.3.10", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HaPoorlyFormedRequestEnt extends MIBEntry<MIPMIBDef>
                    {
                        private HaPoorlyFormedRequestEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haPoorlyFormedRequest", "1.3.6.1.2.1.44.1.6.3.11", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HaTooManyBindingsEnt extends MIBEntry<MIPMIBDef>
                    {
                        private HaTooManyBindingsEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haTooManyBindings", "1.3.6.1.2.1.44.1.6.3.12", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HaUnknownHAEnt extends MIBEntry<MIPMIBDef>
                    {
                        private HaUnknownHAEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haUnknownHA", "1.3.6.1.2.1.44.1.6.3.13", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HaGratuitiousARPsSentEnt extends MIBEntry<MIPMIBDef>
                    {
                        private HaGratuitiousARPsSentEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haGratuitiousARPsSent", "1.3.6.1.2.1.44.1.6.3.14", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HaProxyARPsSentEnt extends MIBEntry<MIPMIBDef>
                    {
                        private HaProxyARPsSentEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haProxyARPsSent", "1.3.6.1.2.1.44.1.6.3.15", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HaRegRequestsReceivedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private HaRegRequestsReceivedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haRegRequestsReceived", "1.3.6.1.2.1.44.1.6.3.16", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HaDeRegRequestsReceivedEnt extends MIBEntry<MIPMIBDef>
                    {
                        private HaDeRegRequestsReceivedEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haDeRegRequestsReceived", "1.3.6.1.2.1.44.1.6.3.17", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HaRegRepliesSentEnt extends MIBEntry<MIPMIBDef>
                    {
                        private HaRegRepliesSentEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haRegRepliesSent", "1.3.6.1.2.1.44.1.6.3.18", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class HaDeRegRepliesSentEnt extends MIBEntry<MIPMIBDef>
                    {
                        private HaDeRegRepliesSentEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                        {
                            super(mib, parent, "haDeRegRepliesSent", "1.3.6.1.2.1.44.1.6.3.19", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class MipMIBNotificationPrefixEnt extends MIBEntry<MIPMIBDef>
        {
            public final MipMIBNotificationsEnt mipMIBNotifications;

            private MipMIBNotificationPrefixEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
            {
                super(mib, parent, "mipMIBNotificationPrefix", "1.3.6.1.2.1.44.2", false, false, false, false);
                this.mipMIBNotifications = new MipMIBNotificationsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mipMIBNotifications
                };
            }
            public static final class MipMIBNotificationsEnt extends MIBEntry<MIPMIBDef>
            {
                public final MipAuthFailureEnt mipAuthFailure;

                private MipMIBNotificationsEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                {
                    super(mib, parent, "mipMIBNotifications", "1.3.6.1.2.1.44.2.0", false, false, false, false);
                    this.mipAuthFailure = new MipAuthFailureEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mipAuthFailure
                    };
                }
                public static final class MipAuthFailureEnt extends MIBEntry<MIPMIBDef>
                {
                    private MipAuthFailureEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mipAuthFailure", "1.3.6.1.2.1.44.2.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class MipMIBConformanceEnt extends MIBEntry<MIPMIBDef>
        {
            public final MipGroupsEnt mipGroups;

            public final MipCompliancesEnt mipCompliances;

            private MipMIBConformanceEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
            {
                super(mib, parent, "mipMIBConformance", "1.3.6.1.2.1.44.3", false, false, false, false);
                this.mipGroups = new MipGroupsEnt(mib, this);
                this.mipCompliances = new MipCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mipGroups,
                    this.mipCompliances
                };
            }
            public static final class MipGroupsEnt extends MIBEntry<MIPMIBDef>
            {
                /** Units of conformance*/
                public final MipSystemGroupEnt mipSystemGroup;

                public final MipSecAssociationGroupEnt mipSecAssociationGroup;

                public final MipSecViolationGroupEnt mipSecViolationGroup;

                public final MnSystemGroupEnt mnSystemGroup;

                public final MnDiscoveryGroupEnt mnDiscoveryGroup;

                public final MnRegistrationGroupEnt mnRegistrationGroup;

                public final MaAdvertisementGroupEnt maAdvertisementGroup;

                public final FaSystemGroupEnt faSystemGroup;

                public final FaAdvertisementGroupEnt faAdvertisementGroup;

                public final FaRegistrationGroupEnt faRegistrationGroup;

                public final HaRegistrationGroupEnt haRegistrationGroup;

                public final HaRegNodeCountersGroupEnt haRegNodeCountersGroup;

                public final MipSecNotificationsGroupEnt mipSecNotificationsGroup;

                private MipGroupsEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                {
                    super(mib, parent, "mipGroups", "1.3.6.1.2.1.44.3.1", false, false, false, false);
                    this.mipSystemGroup = new MipSystemGroupEnt(mib, this);
                    this.mipSecAssociationGroup = new MipSecAssociationGroupEnt(mib, this);
                    this.mipSecViolationGroup = new MipSecViolationGroupEnt(mib, this);
                    this.mnSystemGroup = new MnSystemGroupEnt(mib, this);
                    this.mnDiscoveryGroup = new MnDiscoveryGroupEnt(mib, this);
                    this.mnRegistrationGroup = new MnRegistrationGroupEnt(mib, this);
                    this.maAdvertisementGroup = new MaAdvertisementGroupEnt(mib, this);
                    this.faSystemGroup = new FaSystemGroupEnt(mib, this);
                    this.faAdvertisementGroup = new FaAdvertisementGroupEnt(mib, this);
                    this.faRegistrationGroup = new FaRegistrationGroupEnt(mib, this);
                    this.haRegistrationGroup = new HaRegistrationGroupEnt(mib, this);
                    this.haRegNodeCountersGroup = new HaRegNodeCountersGroupEnt(mib, this);
                    this.mipSecNotificationsGroup = new MipSecNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mipSystemGroup,
                        this.mipSecAssociationGroup,
                        this.mipSecViolationGroup,
                        this.mnSystemGroup,
                        this.mnDiscoveryGroup,
                        this.mnRegistrationGroup,
                        this.maAdvertisementGroup,
                        this.faSystemGroup,
                        this.faAdvertisementGroup,
                        this.faRegistrationGroup,
                        this.haRegistrationGroup,
                        this.haRegNodeCountersGroup,
                        this.mipSecNotificationsGroup
                    };
                }
                public static final class MipSystemGroupEnt extends MIBEntry<MIPMIBDef>
                {
                    private MipSystemGroupEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mipSystemGroup", "1.3.6.1.2.1.44.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MipSecAssociationGroupEnt extends MIBEntry<MIPMIBDef>
                {
                    private MipSecAssociationGroupEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mipSecAssociationGroup", "1.3.6.1.2.1.44.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MipSecViolationGroupEnt extends MIBEntry<MIPMIBDef>
                {
                    private MipSecViolationGroupEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mipSecViolationGroup", "1.3.6.1.2.1.44.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MnSystemGroupEnt extends MIBEntry<MIPMIBDef>
                {
                    private MnSystemGroupEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mnSystemGroup", "1.3.6.1.2.1.44.3.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MnDiscoveryGroupEnt extends MIBEntry<MIPMIBDef>
                {
                    private MnDiscoveryGroupEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mnDiscoveryGroup", "1.3.6.1.2.1.44.3.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MnRegistrationGroupEnt extends MIBEntry<MIPMIBDef>
                {
                    private MnRegistrationGroupEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mnRegistrationGroup", "1.3.6.1.2.1.44.3.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MaAdvertisementGroupEnt extends MIBEntry<MIPMIBDef>
                {
                    private MaAdvertisementGroupEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "maAdvertisementGroup", "1.3.6.1.2.1.44.3.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FaSystemGroupEnt extends MIBEntry<MIPMIBDef>
                {
                    private FaSystemGroupEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "faSystemGroup", "1.3.6.1.2.1.44.3.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FaAdvertisementGroupEnt extends MIBEntry<MIPMIBDef>
                {
                    private FaAdvertisementGroupEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "faAdvertisementGroup", "1.3.6.1.2.1.44.3.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FaRegistrationGroupEnt extends MIBEntry<MIPMIBDef>
                {
                    private FaRegistrationGroupEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "faRegistrationGroup", "1.3.6.1.2.1.44.3.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HaRegistrationGroupEnt extends MIBEntry<MIPMIBDef>
                {
                    private HaRegistrationGroupEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "haRegistrationGroup", "1.3.6.1.2.1.44.3.1.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HaRegNodeCountersGroupEnt extends MIBEntry<MIPMIBDef>
                {
                    private HaRegNodeCountersGroupEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "haRegNodeCountersGroup", "1.3.6.1.2.1.44.3.1.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MipSecNotificationsGroupEnt extends MIBEntry<MIPMIBDef>
                {
                    private MipSecNotificationsGroupEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mipSecNotificationsGroup", "1.3.6.1.2.1.44.3.1.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MipCompliancesEnt extends MIBEntry<MIPMIBDef>
            {
                /** compliance statements*/
                public final MipComplianceEnt mipCompliance;

                private MipCompliancesEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                {
                    super(mib, parent, "mipCompliances", "1.3.6.1.2.1.44.3.2", false, false, false, false);
                    this.mipCompliance = new MipComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mipCompliance
                    };
                }
                public static final class MipComplianceEnt extends MIBEntry<MIPMIBDef>
                {
                    private MipComplianceEnt(MIPMIBDef mib, MIBEntry<MIPMIBDef> parent)
                    {
                        super(mib, parent, "mipCompliance", "1.3.6.1.2.1.44.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
