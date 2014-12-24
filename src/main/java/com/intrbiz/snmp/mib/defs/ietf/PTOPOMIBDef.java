package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class PTOPOMIBDef extends MIB
{
    public static final PTOPOMIBDef PTOPOMIB = new PTOPOMIBDef();

    public final PtopoMIBEnt ptopoMIB;

    private PTOPOMIBDef()
    {
        super("PTOPO-MIB");
        this.ptopoMIB = new PtopoMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ptopoMIB
        };
    }

    public static final class PtopoMIBEnt extends MIBEntry<PTOPOMIBDef>
    {
        public final PtopoMIBObjectsEnt ptopoMIBObjects;

        /** PTOPO MIB Notification Definitions*/
        public final PtopoMIBNotificationsEnt ptopoMIBNotifications;

        /** PTOPO Registration Points*/
        public final PtopoRegistrationPointsEnt ptopoRegistrationPoints;

        /** conformance information*/
        public final PtopoConformanceEnt ptopoConformance;

        private PtopoMIBEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
        {
            super(mib, parent, "ptopoMIB", "1.3.6.1.2.1.79", false, false, false, false);
            this.ptopoMIBObjects = new PtopoMIBObjectsEnt(mib, this);
            this.ptopoMIBNotifications = new PtopoMIBNotificationsEnt(mib, this);
            this.ptopoRegistrationPoints = new PtopoRegistrationPointsEnt(mib, this);
            this.ptopoConformance = new PtopoConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ptopoMIBObjects,
                this.ptopoMIBNotifications,
                this.ptopoRegistrationPoints,
                this.ptopoConformance
            };
        }
        public static final class PtopoMIBObjectsEnt extends MIBEntry<PTOPOMIBDef>
        {
            /** MIB groups*/
            public final PtopoDataEnt ptopoData;

            public final PtopoGeneralEnt ptopoGeneral;

            public final PtopoConfigEnt ptopoConfig;

            private PtopoMIBObjectsEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
            {
                super(mib, parent, "ptopoMIBObjects", "1.3.6.1.2.1.79.1", false, false, false, false);
                this.ptopoData = new PtopoDataEnt(mib, this);
                this.ptopoGeneral = new PtopoGeneralEnt(mib, this);
                this.ptopoConfig = new PtopoConfigEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ptopoData,
                    this.ptopoGeneral,
                    this.ptopoConfig
                };
            }
            public static final class PtopoDataEnt extends MIBEntry<PTOPOMIBDef>
            {
                /** ***********************************************************P T O P O    D A T A     G R O U P***********************************************************
Connection Table*/
                public final PtopoConnTableEnt ptopoConnTable;

                private PtopoDataEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                {
                    super(mib, parent, "ptopoData", "1.3.6.1.2.1.79.1.1", false, false, false, false);
                    this.ptopoConnTable = new PtopoConnTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ptopoConnTable
                    };
                }
                public static final class PtopoConnTableEnt extends MIBEntry<PTOPOMIBDef>
                {
                    public final PtopoConnEntryEnt ptopoConnEntry;

                    private PtopoConnTableEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                    {
                        super(mib, parent, "ptopoConnTable", "1.3.6.1.2.1.79.1.1.1", false, true, false, false);
                        this.ptopoConnEntry = new PtopoConnEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ptopoConnEntry
                        };
                    }
                    public static final class PtopoConnEntryEnt extends MIBEntry<PTOPOMIBDef>
                    {
                        public final PtopoConnTimeMarkEnt ptopoConnTimeMark;

                        public final PtopoConnLocalChassisEnt ptopoConnLocalChassis;

                        public final PtopoConnLocalPortEnt ptopoConnLocalPort;

                        public final PtopoConnIndexEnt ptopoConnIndex;

                        public final PtopoConnRemoteChassisTypeEnt ptopoConnRemoteChassisType;

                        public final PtopoConnRemoteChassisEnt ptopoConnRemoteChassis;

                        public final PtopoConnRemotePortTypeEnt ptopoConnRemotePortType;

                        public final PtopoConnRemotePortEnt ptopoConnRemotePort;

                        public final PtopoConnDiscAlgorithmEnt ptopoConnDiscAlgorithm;

                        public final PtopoConnAgentNetAddrTypeEnt ptopoConnAgentNetAddrType;

                        public final PtopoConnAgentNetAddrEnt ptopoConnAgentNetAddr;

                        public final PtopoConnMultiMacSASeenEnt ptopoConnMultiMacSASeen;

                        public final PtopoConnMultiNetSASeenEnt ptopoConnMultiNetSASeen;

                        public final PtopoConnIsStaticEnt ptopoConnIsStatic;

                        public final PtopoConnLastVerifyTimeEnt ptopoConnLastVerifyTime;

                        public final PtopoConnRowStatusEnt ptopoConnRowStatus;

                        private PtopoConnEntryEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                        {
                            super(mib, parent, "ptopoConnEntry", "1.3.6.1.2.1.79.1.1.1.1", false, false, false, true);
                            this.ptopoConnTimeMark = new PtopoConnTimeMarkEnt(mib, this);
                            this.ptopoConnLocalChassis = new PtopoConnLocalChassisEnt(mib, this);
                            this.ptopoConnLocalPort = new PtopoConnLocalPortEnt(mib, this);
                            this.ptopoConnIndex = new PtopoConnIndexEnt(mib, this);
                            this.ptopoConnRemoteChassisType = new PtopoConnRemoteChassisTypeEnt(mib, this);
                            this.ptopoConnRemoteChassis = new PtopoConnRemoteChassisEnt(mib, this);
                            this.ptopoConnRemotePortType = new PtopoConnRemotePortTypeEnt(mib, this);
                            this.ptopoConnRemotePort = new PtopoConnRemotePortEnt(mib, this);
                            this.ptopoConnDiscAlgorithm = new PtopoConnDiscAlgorithmEnt(mib, this);
                            this.ptopoConnAgentNetAddrType = new PtopoConnAgentNetAddrTypeEnt(mib, this);
                            this.ptopoConnAgentNetAddr = new PtopoConnAgentNetAddrEnt(mib, this);
                            this.ptopoConnMultiMacSASeen = new PtopoConnMultiMacSASeenEnt(mib, this);
                            this.ptopoConnMultiNetSASeen = new PtopoConnMultiNetSASeenEnt(mib, this);
                            this.ptopoConnIsStatic = new PtopoConnIsStaticEnt(mib, this);
                            this.ptopoConnLastVerifyTime = new PtopoConnLastVerifyTimeEnt(mib, this);
                            this.ptopoConnRowStatus = new PtopoConnRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ptopoConnTimeMark,
                                this.ptopoConnLocalChassis,
                                this.ptopoConnLocalPort,
                                this.ptopoConnIndex,
                                this.ptopoConnRemoteChassisType,
                                this.ptopoConnRemoteChassis,
                                this.ptopoConnRemotePortType,
                                this.ptopoConnRemotePort,
                                this.ptopoConnDiscAlgorithm,
                                this.ptopoConnAgentNetAddrType,
                                this.ptopoConnAgentNetAddr,
                                this.ptopoConnMultiMacSASeen,
                                this.ptopoConnMultiNetSASeen,
                                this.ptopoConnIsStatic,
                                this.ptopoConnLastVerifyTime,
                                this.ptopoConnRowStatus
                            };
                        }
                        public static final class PtopoConnTimeMarkEnt extends MIBEntry<PTOPOMIBDef>
                        {
                            private PtopoConnTimeMarkEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                            {
                                super(mib, parent, "ptopoConnTimeMark", "1.3.6.1.2.1.79.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PtopoConnLocalChassisEnt extends MIBEntry<PTOPOMIBDef>
                        {
                            private PtopoConnLocalChassisEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                            {
                                super(mib, parent, "ptopoConnLocalChassis", "1.3.6.1.2.1.79.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PtopoConnLocalPortEnt extends MIBEntry<PTOPOMIBDef>
                        {
                            private PtopoConnLocalPortEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                            {
                                super(mib, parent, "ptopoConnLocalPort", "1.3.6.1.2.1.79.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PtopoConnIndexEnt extends MIBEntry<PTOPOMIBDef>
                        {
                            private PtopoConnIndexEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                            {
                                super(mib, parent, "ptopoConnIndex", "1.3.6.1.2.1.79.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PtopoConnRemoteChassisTypeEnt extends MIBEntry<PTOPOMIBDef>
                        {
                            private PtopoConnRemoteChassisTypeEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                            {
                                super(mib, parent, "ptopoConnRemoteChassisType", "1.3.6.1.2.1.79.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PtopoConnRemoteChassisEnt extends MIBEntry<PTOPOMIBDef>
                        {
                            private PtopoConnRemoteChassisEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                            {
                                super(mib, parent, "ptopoConnRemoteChassis", "1.3.6.1.2.1.79.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PtopoConnRemotePortTypeEnt extends MIBEntry<PTOPOMIBDef>
                        {
                            private PtopoConnRemotePortTypeEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                            {
                                super(mib, parent, "ptopoConnRemotePortType", "1.3.6.1.2.1.79.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PtopoConnRemotePortEnt extends MIBEntry<PTOPOMIBDef>
                        {
                            private PtopoConnRemotePortEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                            {
                                super(mib, parent, "ptopoConnRemotePort", "1.3.6.1.2.1.79.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PtopoConnDiscAlgorithmEnt extends MIBEntry<PTOPOMIBDef>
                        {
                            private PtopoConnDiscAlgorithmEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                            {
                                super(mib, parent, "ptopoConnDiscAlgorithm", "1.3.6.1.2.1.79.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PtopoConnAgentNetAddrTypeEnt extends MIBEntry<PTOPOMIBDef>
                        {
                            private PtopoConnAgentNetAddrTypeEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                            {
                                super(mib, parent, "ptopoConnAgentNetAddrType", "1.3.6.1.2.1.79.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PtopoConnAgentNetAddrEnt extends MIBEntry<PTOPOMIBDef>
                        {
                            private PtopoConnAgentNetAddrEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                            {
                                super(mib, parent, "ptopoConnAgentNetAddr", "1.3.6.1.2.1.79.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PtopoConnMultiMacSASeenEnt extends MIBEntry<PTOPOMIBDef>
                        {
                            private PtopoConnMultiMacSASeenEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                            {
                                super(mib, parent, "ptopoConnMultiMacSASeen", "1.3.6.1.2.1.79.1.1.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PtopoConnMultiNetSASeenEnt extends MIBEntry<PTOPOMIBDef>
                        {
                            private PtopoConnMultiNetSASeenEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                            {
                                super(mib, parent, "ptopoConnMultiNetSASeen", "1.3.6.1.2.1.79.1.1.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PtopoConnIsStaticEnt extends MIBEntry<PTOPOMIBDef>
                        {
                            private PtopoConnIsStaticEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                            {
                                super(mib, parent, "ptopoConnIsStatic", "1.3.6.1.2.1.79.1.1.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PtopoConnLastVerifyTimeEnt extends MIBEntry<PTOPOMIBDef>
                        {
                            private PtopoConnLastVerifyTimeEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                            {
                                super(mib, parent, "ptopoConnLastVerifyTime", "1.3.6.1.2.1.79.1.1.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PtopoConnRowStatusEnt extends MIBEntry<PTOPOMIBDef>
                        {
                            private PtopoConnRowStatusEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                            {
                                super(mib, parent, "ptopoConnRowStatus", "1.3.6.1.2.1.79.1.1.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class PtopoGeneralEnt extends MIBEntry<PTOPOMIBDef>
            {
                /** ***********************************************************P T O P O    G E N E R A L     G R O U P***********************************************************
last change time stamp for the whole MIB*/
                public final PtopoLastChangeTimeEnt ptopoLastChangeTime;

                public final PtopoConnTabInsertsEnt ptopoConnTabInserts;

                public final PtopoConnTabDeletesEnt ptopoConnTabDeletes;

                public final PtopoConnTabDropsEnt ptopoConnTabDrops;

                public final PtopoConnTabAgeoutsEnt ptopoConnTabAgeouts;

                private PtopoGeneralEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                {
                    super(mib, parent, "ptopoGeneral", "1.3.6.1.2.1.79.1.2", false, false, false, false);
                    this.ptopoLastChangeTime = new PtopoLastChangeTimeEnt(mib, this);
                    this.ptopoConnTabInserts = new PtopoConnTabInsertsEnt(mib, this);
                    this.ptopoConnTabDeletes = new PtopoConnTabDeletesEnt(mib, this);
                    this.ptopoConnTabDrops = new PtopoConnTabDropsEnt(mib, this);
                    this.ptopoConnTabAgeouts = new PtopoConnTabAgeoutsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ptopoLastChangeTime,
                        this.ptopoConnTabInserts,
                        this.ptopoConnTabDeletes,
                        this.ptopoConnTabDrops,
                        this.ptopoConnTabAgeouts
                    };
                }
                public static final class PtopoLastChangeTimeEnt extends MIBEntry<PTOPOMIBDef>
                {
                    private PtopoLastChangeTimeEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                    {
                        super(mib, parent, "ptopoLastChangeTime", "1.3.6.1.2.1.79.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PtopoConnTabInsertsEnt extends MIBEntry<PTOPOMIBDef>
                {
                    private PtopoConnTabInsertsEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                    {
                        super(mib, parent, "ptopoConnTabInserts", "1.3.6.1.2.1.79.1.2.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PtopoConnTabDeletesEnt extends MIBEntry<PTOPOMIBDef>
                {
                    private PtopoConnTabDeletesEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                    {
                        super(mib, parent, "ptopoConnTabDeletes", "1.3.6.1.2.1.79.1.2.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PtopoConnTabDropsEnt extends MIBEntry<PTOPOMIBDef>
                {
                    private PtopoConnTabDropsEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                    {
                        super(mib, parent, "ptopoConnTabDrops", "1.3.6.1.2.1.79.1.2.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PtopoConnTabAgeoutsEnt extends MIBEntry<PTOPOMIBDef>
                {
                    private PtopoConnTabAgeoutsEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                    {
                        super(mib, parent, "ptopoConnTabAgeouts", "1.3.6.1.2.1.79.1.2.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class PtopoConfigEnt extends MIBEntry<PTOPOMIBDef>
            {
                /** ***********************************************************P T O P O    C O N F I G     G R O U P************************************************************/
                public final PtopoConfigTrapIntervalEnt ptopoConfigTrapInterval;

                public final PtopoConfigMaxHoldTimeEnt ptopoConfigMaxHoldTime;

                private PtopoConfigEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                {
                    super(mib, parent, "ptopoConfig", "1.3.6.1.2.1.79.1.3", false, false, false, false);
                    this.ptopoConfigTrapInterval = new PtopoConfigTrapIntervalEnt(mib, this);
                    this.ptopoConfigMaxHoldTime = new PtopoConfigMaxHoldTimeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ptopoConfigTrapInterval,
                        this.ptopoConfigMaxHoldTime
                    };
                }
                public static final class PtopoConfigTrapIntervalEnt extends MIBEntry<PTOPOMIBDef>
                {
                    private PtopoConfigTrapIntervalEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                    {
                        super(mib, parent, "ptopoConfigTrapInterval", "1.3.6.1.2.1.79.1.3.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PtopoConfigMaxHoldTimeEnt extends MIBEntry<PTOPOMIBDef>
                {
                    private PtopoConfigMaxHoldTimeEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                    {
                        super(mib, parent, "ptopoConfigMaxHoldTime", "1.3.6.1.2.1.79.1.3.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PtopoMIBNotificationsEnt extends MIBEntry<PTOPOMIBDef>
        {
            public final PtopoMIBTrapPrefixEnt ptopoMIBTrapPrefix;

            private PtopoMIBNotificationsEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
            {
                super(mib, parent, "ptopoMIBNotifications", "1.3.6.1.2.1.79.2", false, false, false, false);
                this.ptopoMIBTrapPrefix = new PtopoMIBTrapPrefixEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ptopoMIBTrapPrefix
                };
            }
            public static final class PtopoMIBTrapPrefixEnt extends MIBEntry<PTOPOMIBDef>
            {
                public final PtopoConfigChangeEnt ptopoConfigChange;

                private PtopoMIBTrapPrefixEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                {
                    super(mib, parent, "ptopoMIBTrapPrefix", "1.3.6.1.2.1.79.2.0", false, false, false, false);
                    this.ptopoConfigChange = new PtopoConfigChangeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ptopoConfigChange
                    };
                }
                public static final class PtopoConfigChangeEnt extends MIBEntry<PTOPOMIBDef>
                {
                    private PtopoConfigChangeEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                    {
                        super(mib, parent, "ptopoConfigChange", "1.3.6.1.2.1.79.2.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PtopoRegistrationPointsEnt extends MIBEntry<PTOPOMIBDef>
        {
            /** values used with ptopoConnDiscAlgorithm object*/
            public final PtopoDiscoveryMechanismsEnt ptopoDiscoveryMechanisms;

            private PtopoRegistrationPointsEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
            {
                super(mib, parent, "ptopoRegistrationPoints", "1.3.6.1.2.1.79.3", false, false, false, false);
                this.ptopoDiscoveryMechanisms = new PtopoDiscoveryMechanismsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ptopoDiscoveryMechanisms
                };
            }
            public static final class PtopoDiscoveryMechanismsEnt extends MIBEntry<PTOPOMIBDef>
            {
                public final PtopoDiscoveryLocalEnt ptopoDiscoveryLocal;

                private PtopoDiscoveryMechanismsEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                {
                    super(mib, parent, "ptopoDiscoveryMechanisms", "1.3.6.1.2.1.79.3.1", false, false, false, false);
                    this.ptopoDiscoveryLocal = new PtopoDiscoveryLocalEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ptopoDiscoveryLocal
                    };
                }
                public static final class PtopoDiscoveryLocalEnt extends MIBEntry<PTOPOMIBDef>
                {
                    private PtopoDiscoveryLocalEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                    {
                        super(mib, parent, "ptopoDiscoveryLocal", "1.3.6.1.2.1.79.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PtopoConformanceEnt extends MIBEntry<PTOPOMIBDef>
        {
            public final PtopoCompliancesEnt ptopoCompliances;

            public final PtopoGroupsEnt ptopoGroups;

            private PtopoConformanceEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
            {
                super(mib, parent, "ptopoConformance", "1.3.6.1.2.1.79.4", false, false, false, false);
                this.ptopoCompliances = new PtopoCompliancesEnt(mib, this);
                this.ptopoGroups = new PtopoGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ptopoCompliances,
                    this.ptopoGroups
                };
            }
            public static final class PtopoCompliancesEnt extends MIBEntry<PTOPOMIBDef>
            {
                /** compliance statements*/
                public final PtopoComplianceEnt ptopoCompliance;

                private PtopoCompliancesEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                {
                    super(mib, parent, "ptopoCompliances", "1.3.6.1.2.1.79.4.1", false, false, false, false);
                    this.ptopoCompliance = new PtopoComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ptopoCompliance
                    };
                }
                public static final class PtopoComplianceEnt extends MIBEntry<PTOPOMIBDef>
                {
                    private PtopoComplianceEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                    {
                        super(mib, parent, "ptopoCompliance", "1.3.6.1.2.1.79.4.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class PtopoGroupsEnt extends MIBEntry<PTOPOMIBDef>
            {
                /** MIB groupings*/
                public final PtopoDataGroupEnt ptopoDataGroup;

                public final PtopoGeneralGroupEnt ptopoGeneralGroup;

                public final PtopoConfigGroupEnt ptopoConfigGroup;

                public final PtopoNotificationsGroupEnt ptopoNotificationsGroup;

                private PtopoGroupsEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                {
                    super(mib, parent, "ptopoGroups", "1.3.6.1.2.1.79.4.2", false, false, false, false);
                    this.ptopoDataGroup = new PtopoDataGroupEnt(mib, this);
                    this.ptopoGeneralGroup = new PtopoGeneralGroupEnt(mib, this);
                    this.ptopoConfigGroup = new PtopoConfigGroupEnt(mib, this);
                    this.ptopoNotificationsGroup = new PtopoNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ptopoDataGroup,
                        this.ptopoGeneralGroup,
                        this.ptopoConfigGroup,
                        this.ptopoNotificationsGroup
                    };
                }
                public static final class PtopoDataGroupEnt extends MIBEntry<PTOPOMIBDef>
                {
                    private PtopoDataGroupEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                    {
                        super(mib, parent, "ptopoDataGroup", "1.3.6.1.2.1.79.4.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PtopoGeneralGroupEnt extends MIBEntry<PTOPOMIBDef>
                {
                    private PtopoGeneralGroupEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                    {
                        super(mib, parent, "ptopoGeneralGroup", "1.3.6.1.2.1.79.4.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PtopoConfigGroupEnt extends MIBEntry<PTOPOMIBDef>
                {
                    private PtopoConfigGroupEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                    {
                        super(mib, parent, "ptopoConfigGroup", "1.3.6.1.2.1.79.4.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PtopoNotificationsGroupEnt extends MIBEntry<PTOPOMIBDef>
                {
                    private PtopoNotificationsGroupEnt(PTOPOMIBDef mib, MIBEntry<PTOPOMIBDef> parent)
                    {
                        super(mib, parent, "ptopoNotificationsGroup", "1.3.6.1.2.1.79.4.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
