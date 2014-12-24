package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class DIALCONTROLMIBDef extends MIB
{
    public static final DIALCONTROLMIBDef DIALCONTROLMIB = new DIALCONTROLMIBDef();

    /** Sep 23, 1996*/
    public final DialControlMibEnt dialControlMib;

    private DIALCONTROLMIBDef()
    {
        super("DIAL-CONTROL-MIB");
        this.dialControlMib = new DialControlMibEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dialControlMib
        };
    }

    public static final class DialControlMibEnt extends MIBEntry<DIALCONTROLMIBDef>
    {
        /** Dial Control Mib objects definitions*/
        public final DialControlMibObjectsEnt dialControlMibObjects;

        /** Traps related to Connection management*/
        public final DialControlMibTrapPrefixEnt dialControlMibTrapPrefix;

        /** conformance information*/
        public final DialControlMibConformanceEnt dialControlMibConformance;

        private DialControlMibEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
        {
            super(mib, parent, "dialControlMib", "1.3.6.1.2.1.10.21", false, false, false, false);
            this.dialControlMibObjects = new DialControlMibObjectsEnt(mib, this);
            this.dialControlMibTrapPrefix = new DialControlMibTrapPrefixEnt(mib, this);
            this.dialControlMibConformance = new DialControlMibConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dialControlMibObjects,
                this.dialControlMibTrapPrefix,
                this.dialControlMibConformance
            };
        }
        public static final class DialControlMibObjectsEnt extends MIBEntry<DIALCONTROLMIBDef>
        {
            /** General configuration group*/
            public final DialCtlConfigurationEnt dialCtlConfiguration;

            /** Peer group*/
            public final DialCtlPeerEnt dialCtlPeer;

            /** the active call group*/
            public final CallActiveEnt callActive;

            /** the call history group*/
            public final CallHistoryEnt callHistory;

            private DialControlMibObjectsEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
            {
                super(mib, parent, "dialControlMibObjects", "1.3.6.1.2.1.10.21.1", false, false, false, false);
                this.dialCtlConfiguration = new DialCtlConfigurationEnt(mib, this);
                this.dialCtlPeer = new DialCtlPeerEnt(mib, this);
                this.callActive = new CallActiveEnt(mib, this);
                this.callHistory = new CallHistoryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dialCtlConfiguration,
                    this.dialCtlPeer,
                    this.callActive,
                    this.callHistory
                };
            }
            public static final class DialCtlConfigurationEnt extends MIBEntry<DIALCONTROLMIBDef>
            {
                /** general configuration data/parameters*/
                public final DialCtlAcceptModeEnt dialCtlAcceptMode;

                public final DialCtlTrapEnableEnt dialCtlTrapEnable;

                private DialCtlConfigurationEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                {
                    super(mib, parent, "dialCtlConfiguration", "1.3.6.1.2.1.10.21.1.1", false, false, false, false);
                    this.dialCtlAcceptMode = new DialCtlAcceptModeEnt(mib, this);
                    this.dialCtlTrapEnable = new DialCtlTrapEnableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dialCtlAcceptMode,
                        this.dialCtlTrapEnable
                    };
                }
                public static final class DialCtlAcceptModeEnt extends MIBEntry<DIALCONTROLMIBDef>
                {
                    private DialCtlAcceptModeEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "dialCtlAcceptMode", "1.3.6.1.2.1.10.21.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DialCtlTrapEnableEnt extends MIBEntry<DIALCONTROLMIBDef>
                {
                    private DialCtlTrapEnableEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "dialCtlTrapEnable", "1.3.6.1.2.1.10.21.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DialCtlPeerEnt extends MIBEntry<DIALCONTROLMIBDef>
            {
                /** peer configuration table*/
                public final DialCtlPeerCfgTableEnt dialCtlPeerCfgTable;

                /** Peer statistics table*/
                public final DialCtlPeerStatsTableEnt dialCtlPeerStatsTable;

                private DialCtlPeerEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                {
                    super(mib, parent, "dialCtlPeer", "1.3.6.1.2.1.10.21.1.2", false, false, false, false);
                    this.dialCtlPeerCfgTable = new DialCtlPeerCfgTableEnt(mib, this);
                    this.dialCtlPeerStatsTable = new DialCtlPeerStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dialCtlPeerCfgTable,
                        this.dialCtlPeerStatsTable
                    };
                }
                public static final class DialCtlPeerCfgTableEnt extends MIBEntry<DIALCONTROLMIBDef>
                {
                    public final DialCtlPeerCfgEntryEnt dialCtlPeerCfgEntry;

                    private DialCtlPeerCfgTableEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "dialCtlPeerCfgTable", "1.3.6.1.2.1.10.21.1.2.1", false, true, false, false);
                        this.dialCtlPeerCfgEntry = new DialCtlPeerCfgEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dialCtlPeerCfgEntry
                        };
                    }
                    public static final class DialCtlPeerCfgEntryEnt extends MIBEntry<DIALCONTROLMIBDef>
                    {
                        public final DialCtlPeerCfgIdEnt dialCtlPeerCfgId;

                        public final DialCtlPeerCfgIfTypeEnt dialCtlPeerCfgIfType;

                        public final DialCtlPeerCfgLowerIfEnt dialCtlPeerCfgLowerIf;

                        public final DialCtlPeerCfgOriginateAddressEnt dialCtlPeerCfgOriginateAddress;

                        public final DialCtlPeerCfgAnswerAddressEnt dialCtlPeerCfgAnswerAddress;

                        public final DialCtlPeerCfgSubAddressEnt dialCtlPeerCfgSubAddress;

                        public final DialCtlPeerCfgClosedUserGroupEnt dialCtlPeerCfgClosedUserGroup;

                        public final DialCtlPeerCfgSpeedEnt dialCtlPeerCfgSpeed;

                        public final DialCtlPeerCfgInfoTypeEnt dialCtlPeerCfgInfoType;

                        public final DialCtlPeerCfgPermissionEnt dialCtlPeerCfgPermission;

                        public final DialCtlPeerCfgInactivityTimerEnt dialCtlPeerCfgInactivityTimer;

                        public final DialCtlPeerCfgMinDurationEnt dialCtlPeerCfgMinDuration;

                        public final DialCtlPeerCfgMaxDurationEnt dialCtlPeerCfgMaxDuration;

                        public final DialCtlPeerCfgCarrierDelayEnt dialCtlPeerCfgCarrierDelay;

                        public final DialCtlPeerCfgCallRetriesEnt dialCtlPeerCfgCallRetries;

                        public final DialCtlPeerCfgRetryDelayEnt dialCtlPeerCfgRetryDelay;

                        public final DialCtlPeerCfgFailureDelayEnt dialCtlPeerCfgFailureDelay;

                        public final DialCtlPeerCfgTrapEnableEnt dialCtlPeerCfgTrapEnable;

                        public final DialCtlPeerCfgStatusEnt dialCtlPeerCfgStatus;

                        private DialCtlPeerCfgEntryEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                        {
                            super(mib, parent, "dialCtlPeerCfgEntry", "1.3.6.1.2.1.10.21.1.2.1.1", false, false, false, true);
                            this.dialCtlPeerCfgId = new DialCtlPeerCfgIdEnt(mib, this);
                            this.dialCtlPeerCfgIfType = new DialCtlPeerCfgIfTypeEnt(mib, this);
                            this.dialCtlPeerCfgLowerIf = new DialCtlPeerCfgLowerIfEnt(mib, this);
                            this.dialCtlPeerCfgOriginateAddress = new DialCtlPeerCfgOriginateAddressEnt(mib, this);
                            this.dialCtlPeerCfgAnswerAddress = new DialCtlPeerCfgAnswerAddressEnt(mib, this);
                            this.dialCtlPeerCfgSubAddress = new DialCtlPeerCfgSubAddressEnt(mib, this);
                            this.dialCtlPeerCfgClosedUserGroup = new DialCtlPeerCfgClosedUserGroupEnt(mib, this);
                            this.dialCtlPeerCfgSpeed = new DialCtlPeerCfgSpeedEnt(mib, this);
                            this.dialCtlPeerCfgInfoType = new DialCtlPeerCfgInfoTypeEnt(mib, this);
                            this.dialCtlPeerCfgPermission = new DialCtlPeerCfgPermissionEnt(mib, this);
                            this.dialCtlPeerCfgInactivityTimer = new DialCtlPeerCfgInactivityTimerEnt(mib, this);
                            this.dialCtlPeerCfgMinDuration = new DialCtlPeerCfgMinDurationEnt(mib, this);
                            this.dialCtlPeerCfgMaxDuration = new DialCtlPeerCfgMaxDurationEnt(mib, this);
                            this.dialCtlPeerCfgCarrierDelay = new DialCtlPeerCfgCarrierDelayEnt(mib, this);
                            this.dialCtlPeerCfgCallRetries = new DialCtlPeerCfgCallRetriesEnt(mib, this);
                            this.dialCtlPeerCfgRetryDelay = new DialCtlPeerCfgRetryDelayEnt(mib, this);
                            this.dialCtlPeerCfgFailureDelay = new DialCtlPeerCfgFailureDelayEnt(mib, this);
                            this.dialCtlPeerCfgTrapEnable = new DialCtlPeerCfgTrapEnableEnt(mib, this);
                            this.dialCtlPeerCfgStatus = new DialCtlPeerCfgStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dialCtlPeerCfgId,
                                this.dialCtlPeerCfgIfType,
                                this.dialCtlPeerCfgLowerIf,
                                this.dialCtlPeerCfgOriginateAddress,
                                this.dialCtlPeerCfgAnswerAddress,
                                this.dialCtlPeerCfgSubAddress,
                                this.dialCtlPeerCfgClosedUserGroup,
                                this.dialCtlPeerCfgSpeed,
                                this.dialCtlPeerCfgInfoType,
                                this.dialCtlPeerCfgPermission,
                                this.dialCtlPeerCfgInactivityTimer,
                                this.dialCtlPeerCfgMinDuration,
                                this.dialCtlPeerCfgMaxDuration,
                                this.dialCtlPeerCfgCarrierDelay,
                                this.dialCtlPeerCfgCallRetries,
                                this.dialCtlPeerCfgRetryDelay,
                                this.dialCtlPeerCfgFailureDelay,
                                this.dialCtlPeerCfgTrapEnable,
                                this.dialCtlPeerCfgStatus
                            };
                        }
                        public static final class DialCtlPeerCfgIdEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgIdEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgId", "1.3.6.1.2.1.10.21.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgIfTypeEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgIfTypeEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgIfType", "1.3.6.1.2.1.10.21.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgLowerIfEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgLowerIfEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgLowerIf", "1.3.6.1.2.1.10.21.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgOriginateAddressEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgOriginateAddressEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgOriginateAddress", "1.3.6.1.2.1.10.21.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgAnswerAddressEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgAnswerAddressEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgAnswerAddress", "1.3.6.1.2.1.10.21.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgSubAddressEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgSubAddressEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgSubAddress", "1.3.6.1.2.1.10.21.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgClosedUserGroupEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgClosedUserGroupEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgClosedUserGroup", "1.3.6.1.2.1.10.21.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgSpeedEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgSpeedEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgSpeed", "1.3.6.1.2.1.10.21.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgInfoTypeEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgInfoTypeEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgInfoType", "1.3.6.1.2.1.10.21.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgPermissionEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgPermissionEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgPermission", "1.3.6.1.2.1.10.21.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgInactivityTimerEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgInactivityTimerEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgInactivityTimer", "1.3.6.1.2.1.10.21.1.2.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgMinDurationEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgMinDurationEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgMinDuration", "1.3.6.1.2.1.10.21.1.2.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgMaxDurationEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgMaxDurationEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgMaxDuration", "1.3.6.1.2.1.10.21.1.2.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgCarrierDelayEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgCarrierDelayEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgCarrierDelay", "1.3.6.1.2.1.10.21.1.2.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgCallRetriesEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgCallRetriesEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgCallRetries", "1.3.6.1.2.1.10.21.1.2.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgRetryDelayEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgRetryDelayEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgRetryDelay", "1.3.6.1.2.1.10.21.1.2.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgFailureDelayEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgFailureDelayEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgFailureDelay", "1.3.6.1.2.1.10.21.1.2.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgTrapEnableEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgTrapEnableEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgTrapEnable", "1.3.6.1.2.1.10.21.1.2.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerCfgStatusEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerCfgStatusEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerCfgStatus", "1.3.6.1.2.1.10.21.1.2.1.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DialCtlPeerStatsTableEnt extends MIBEntry<DIALCONTROLMIBDef>
                {
                    public final DialCtlPeerStatsEntryEnt dialCtlPeerStatsEntry;

                    private DialCtlPeerStatsTableEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "dialCtlPeerStatsTable", "1.3.6.1.2.1.10.21.1.2.2", false, true, false, false);
                        this.dialCtlPeerStatsEntry = new DialCtlPeerStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dialCtlPeerStatsEntry
                        };
                    }
                    public static final class DialCtlPeerStatsEntryEnt extends MIBEntry<DIALCONTROLMIBDef>
                    {
                        public final DialCtlPeerStatsConnectTimeEnt dialCtlPeerStatsConnectTime;

                        public final DialCtlPeerStatsChargedUnitsEnt dialCtlPeerStatsChargedUnits;

                        public final DialCtlPeerStatsSuccessCallsEnt dialCtlPeerStatsSuccessCalls;

                        public final DialCtlPeerStatsFailCallsEnt dialCtlPeerStatsFailCalls;

                        public final DialCtlPeerStatsAcceptCallsEnt dialCtlPeerStatsAcceptCalls;

                        public final DialCtlPeerStatsRefuseCallsEnt dialCtlPeerStatsRefuseCalls;

                        public final DialCtlPeerStatsLastDisconnectCauseEnt dialCtlPeerStatsLastDisconnectCause;

                        public final DialCtlPeerStatsLastDisconnectTextEnt dialCtlPeerStatsLastDisconnectText;

                        public final DialCtlPeerStatsLastSetupTimeEnt dialCtlPeerStatsLastSetupTime;

                        private DialCtlPeerStatsEntryEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                        {
                            super(mib, parent, "dialCtlPeerStatsEntry", "1.3.6.1.2.1.10.21.1.2.2.1", false, false, false, true);
                            this.dialCtlPeerStatsConnectTime = new DialCtlPeerStatsConnectTimeEnt(mib, this);
                            this.dialCtlPeerStatsChargedUnits = new DialCtlPeerStatsChargedUnitsEnt(mib, this);
                            this.dialCtlPeerStatsSuccessCalls = new DialCtlPeerStatsSuccessCallsEnt(mib, this);
                            this.dialCtlPeerStatsFailCalls = new DialCtlPeerStatsFailCallsEnt(mib, this);
                            this.dialCtlPeerStatsAcceptCalls = new DialCtlPeerStatsAcceptCallsEnt(mib, this);
                            this.dialCtlPeerStatsRefuseCalls = new DialCtlPeerStatsRefuseCallsEnt(mib, this);
                            this.dialCtlPeerStatsLastDisconnectCause = new DialCtlPeerStatsLastDisconnectCauseEnt(mib, this);
                            this.dialCtlPeerStatsLastDisconnectText = new DialCtlPeerStatsLastDisconnectTextEnt(mib, this);
                            this.dialCtlPeerStatsLastSetupTime = new DialCtlPeerStatsLastSetupTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dialCtlPeerStatsConnectTime,
                                this.dialCtlPeerStatsChargedUnits,
                                this.dialCtlPeerStatsSuccessCalls,
                                this.dialCtlPeerStatsFailCalls,
                                this.dialCtlPeerStatsAcceptCalls,
                                this.dialCtlPeerStatsRefuseCalls,
                                this.dialCtlPeerStatsLastDisconnectCause,
                                this.dialCtlPeerStatsLastDisconnectText,
                                this.dialCtlPeerStatsLastSetupTime
                            };
                        }
                        public static final class DialCtlPeerStatsConnectTimeEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerStatsConnectTimeEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerStatsConnectTime", "1.3.6.1.2.1.10.21.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerStatsChargedUnitsEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerStatsChargedUnitsEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerStatsChargedUnits", "1.3.6.1.2.1.10.21.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerStatsSuccessCallsEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerStatsSuccessCallsEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerStatsSuccessCalls", "1.3.6.1.2.1.10.21.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerStatsFailCallsEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerStatsFailCallsEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerStatsFailCalls", "1.3.6.1.2.1.10.21.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerStatsAcceptCallsEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerStatsAcceptCallsEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerStatsAcceptCalls", "1.3.6.1.2.1.10.21.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerStatsRefuseCallsEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerStatsRefuseCallsEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerStatsRefuseCalls", "1.3.6.1.2.1.10.21.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerStatsLastDisconnectCauseEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerStatsLastDisconnectCauseEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerStatsLastDisconnectCause", "1.3.6.1.2.1.10.21.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerStatsLastDisconnectTextEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerStatsLastDisconnectTextEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerStatsLastDisconnectText", "1.3.6.1.2.1.10.21.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DialCtlPeerStatsLastSetupTimeEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private DialCtlPeerStatsLastSetupTimeEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "dialCtlPeerStatsLastSetupTime", "1.3.6.1.2.1.10.21.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class CallActiveEnt extends MIBEntry<DIALCONTROLMIBDef>
            {
                /** callActiveTableTable to store active call information.These calls could be circuit switched or they couldbe virtual circuits.An entry will be created when a call is started and deletedwhen a call is cleared.*/
                public final CallActiveTableEnt callActiveTable;

                private CallActiveEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                {
                    super(mib, parent, "callActive", "1.3.6.1.2.1.10.21.1.3", false, false, false, false);
                    this.callActiveTable = new CallActiveTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.callActiveTable
                    };
                }
                public static final class CallActiveTableEnt extends MIBEntry<DIALCONTROLMIBDef>
                {
                    public final CallActiveEntryEnt callActiveEntry;

                    private CallActiveTableEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "callActiveTable", "1.3.6.1.2.1.10.21.1.3.1", false, true, false, false);
                        this.callActiveEntry = new CallActiveEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.callActiveEntry
                        };
                    }
                    public static final class CallActiveEntryEnt extends MIBEntry<DIALCONTROLMIBDef>
                    {
                        public final CallActiveSetupTimeEnt callActiveSetupTime;

                        public final CallActiveIndexEnt callActiveIndex;

                        public final CallActivePeerAddressEnt callActivePeerAddress;

                        public final CallActivePeerSubAddressEnt callActivePeerSubAddress;

                        public final CallActivePeerIdEnt callActivePeerId;

                        public final CallActivePeerIfIndexEnt callActivePeerIfIndex;

                        public final CallActiveLogicalIfIndexEnt callActiveLogicalIfIndex;

                        public final CallActiveConnectTimeEnt callActiveConnectTime;

                        public final CallActiveCallStateEnt callActiveCallState;

                        public final CallActiveCallOriginEnt callActiveCallOrigin;

                        public final CallActiveChargedUnitsEnt callActiveChargedUnits;

                        public final CallActiveInfoTypeEnt callActiveInfoType;

                        public final CallActiveTransmitPacketsEnt callActiveTransmitPackets;

                        public final CallActiveTransmitBytesEnt callActiveTransmitBytes;

                        public final CallActiveReceivePacketsEnt callActiveReceivePackets;

                        public final CallActiveReceiveBytesEnt callActiveReceiveBytes;

                        private CallActiveEntryEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                        {
                            super(mib, parent, "callActiveEntry", "1.3.6.1.2.1.10.21.1.3.1.1", false, false, false, true);
                            this.callActiveSetupTime = new CallActiveSetupTimeEnt(mib, this);
                            this.callActiveIndex = new CallActiveIndexEnt(mib, this);
                            this.callActivePeerAddress = new CallActivePeerAddressEnt(mib, this);
                            this.callActivePeerSubAddress = new CallActivePeerSubAddressEnt(mib, this);
                            this.callActivePeerId = new CallActivePeerIdEnt(mib, this);
                            this.callActivePeerIfIndex = new CallActivePeerIfIndexEnt(mib, this);
                            this.callActiveLogicalIfIndex = new CallActiveLogicalIfIndexEnt(mib, this);
                            this.callActiveConnectTime = new CallActiveConnectTimeEnt(mib, this);
                            this.callActiveCallState = new CallActiveCallStateEnt(mib, this);
                            this.callActiveCallOrigin = new CallActiveCallOriginEnt(mib, this);
                            this.callActiveChargedUnits = new CallActiveChargedUnitsEnt(mib, this);
                            this.callActiveInfoType = new CallActiveInfoTypeEnt(mib, this);
                            this.callActiveTransmitPackets = new CallActiveTransmitPacketsEnt(mib, this);
                            this.callActiveTransmitBytes = new CallActiveTransmitBytesEnt(mib, this);
                            this.callActiveReceivePackets = new CallActiveReceivePacketsEnt(mib, this);
                            this.callActiveReceiveBytes = new CallActiveReceiveBytesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.callActiveSetupTime,
                                this.callActiveIndex,
                                this.callActivePeerAddress,
                                this.callActivePeerSubAddress,
                                this.callActivePeerId,
                                this.callActivePeerIfIndex,
                                this.callActiveLogicalIfIndex,
                                this.callActiveConnectTime,
                                this.callActiveCallState,
                                this.callActiveCallOrigin,
                                this.callActiveChargedUnits,
                                this.callActiveInfoType,
                                this.callActiveTransmitPackets,
                                this.callActiveTransmitBytes,
                                this.callActiveReceivePackets,
                                this.callActiveReceiveBytes
                            };
                        }
                        public static final class CallActiveSetupTimeEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallActiveSetupTimeEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callActiveSetupTime", "1.3.6.1.2.1.10.21.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallActiveIndexEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallActiveIndexEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callActiveIndex", "1.3.6.1.2.1.10.21.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallActivePeerAddressEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallActivePeerAddressEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callActivePeerAddress", "1.3.6.1.2.1.10.21.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallActivePeerSubAddressEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallActivePeerSubAddressEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callActivePeerSubAddress", "1.3.6.1.2.1.10.21.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallActivePeerIdEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallActivePeerIdEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callActivePeerId", "1.3.6.1.2.1.10.21.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallActivePeerIfIndexEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallActivePeerIfIndexEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callActivePeerIfIndex", "1.3.6.1.2.1.10.21.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallActiveLogicalIfIndexEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallActiveLogicalIfIndexEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callActiveLogicalIfIndex", "1.3.6.1.2.1.10.21.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallActiveConnectTimeEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallActiveConnectTimeEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callActiveConnectTime", "1.3.6.1.2.1.10.21.1.3.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallActiveCallStateEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallActiveCallStateEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callActiveCallState", "1.3.6.1.2.1.10.21.1.3.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallActiveCallOriginEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallActiveCallOriginEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callActiveCallOrigin", "1.3.6.1.2.1.10.21.1.3.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallActiveChargedUnitsEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallActiveChargedUnitsEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callActiveChargedUnits", "1.3.6.1.2.1.10.21.1.3.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallActiveInfoTypeEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallActiveInfoTypeEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callActiveInfoType", "1.3.6.1.2.1.10.21.1.3.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallActiveTransmitPacketsEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallActiveTransmitPacketsEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callActiveTransmitPackets", "1.3.6.1.2.1.10.21.1.3.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallActiveTransmitBytesEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallActiveTransmitBytesEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callActiveTransmitBytes", "1.3.6.1.2.1.10.21.1.3.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallActiveReceivePacketsEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallActiveReceivePacketsEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callActiveReceivePackets", "1.3.6.1.2.1.10.21.1.3.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallActiveReceiveBytesEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallActiveReceiveBytesEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callActiveReceiveBytes", "1.3.6.1.2.1.10.21.1.3.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class CallHistoryEnt extends MIBEntry<DIALCONTROLMIBDef>
            {
                public final CallHistoryTableMaxLengthEnt callHistoryTableMaxLength;

                public final CallHistoryRetainTimerEnt callHistoryRetainTimer;

                /** callHistoryTableTable to store the past call information. The Destination numberand the call connect and disconnect time, the disconnection causeare stored. These calls could be circuit switched or they couldbe virtual circuits. History of each and every call is stored,of successful calls as well as of unsuccessful and rejected calls.An entry will be created when a call is cleared.*/
                public final CallHistoryTableEnt callHistoryTable;

                private CallHistoryEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                {
                    super(mib, parent, "callHistory", "1.3.6.1.2.1.10.21.1.4", false, false, false, false);
                    this.callHistoryTableMaxLength = new CallHistoryTableMaxLengthEnt(mib, this);
                    this.callHistoryRetainTimer = new CallHistoryRetainTimerEnt(mib, this);
                    this.callHistoryTable = new CallHistoryTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.callHistoryTableMaxLength,
                        this.callHistoryRetainTimer,
                        this.callHistoryTable
                    };
                }
                public static final class CallHistoryTableMaxLengthEnt extends MIBEntry<DIALCONTROLMIBDef>
                {
                    private CallHistoryTableMaxLengthEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "callHistoryTableMaxLength", "1.3.6.1.2.1.10.21.1.4.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CallHistoryRetainTimerEnt extends MIBEntry<DIALCONTROLMIBDef>
                {
                    private CallHistoryRetainTimerEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "callHistoryRetainTimer", "1.3.6.1.2.1.10.21.1.4.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CallHistoryTableEnt extends MIBEntry<DIALCONTROLMIBDef>
                {
                    public final CallHistoryEntryEnt callHistoryEntry;

                    private CallHistoryTableEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "callHistoryTable", "1.3.6.1.2.1.10.21.1.4.3", false, true, false, false);
                        this.callHistoryEntry = new CallHistoryEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.callHistoryEntry
                        };
                    }
                    public static final class CallHistoryEntryEnt extends MIBEntry<DIALCONTROLMIBDef>
                    {
                        public final CallHistoryPeerAddressEnt callHistoryPeerAddress;

                        public final CallHistoryPeerSubAddressEnt callHistoryPeerSubAddress;

                        public final CallHistoryPeerIdEnt callHistoryPeerId;

                        public final CallHistoryPeerIfIndexEnt callHistoryPeerIfIndex;

                        public final CallHistoryLogicalIfIndexEnt callHistoryLogicalIfIndex;

                        public final CallHistoryDisconnectCauseEnt callHistoryDisconnectCause;

                        public final CallHistoryDisconnectTextEnt callHistoryDisconnectText;

                        public final CallHistoryConnectTimeEnt callHistoryConnectTime;

                        public final CallHistoryDisconnectTimeEnt callHistoryDisconnectTime;

                        public final CallHistoryCallOriginEnt callHistoryCallOrigin;

                        public final CallHistoryChargedUnitsEnt callHistoryChargedUnits;

                        public final CallHistoryInfoTypeEnt callHistoryInfoType;

                        public final CallHistoryTransmitPacketsEnt callHistoryTransmitPackets;

                        public final CallHistoryTransmitBytesEnt callHistoryTransmitBytes;

                        public final CallHistoryReceivePacketsEnt callHistoryReceivePackets;

                        public final CallHistoryReceiveBytesEnt callHistoryReceiveBytes;

                        private CallHistoryEntryEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                        {
                            super(mib, parent, "callHistoryEntry", "1.3.6.1.2.1.10.21.1.4.3.1", false, false, false, true);
                            this.callHistoryPeerAddress = new CallHistoryPeerAddressEnt(mib, this);
                            this.callHistoryPeerSubAddress = new CallHistoryPeerSubAddressEnt(mib, this);
                            this.callHistoryPeerId = new CallHistoryPeerIdEnt(mib, this);
                            this.callHistoryPeerIfIndex = new CallHistoryPeerIfIndexEnt(mib, this);
                            this.callHistoryLogicalIfIndex = new CallHistoryLogicalIfIndexEnt(mib, this);
                            this.callHistoryDisconnectCause = new CallHistoryDisconnectCauseEnt(mib, this);
                            this.callHistoryDisconnectText = new CallHistoryDisconnectTextEnt(mib, this);
                            this.callHistoryConnectTime = new CallHistoryConnectTimeEnt(mib, this);
                            this.callHistoryDisconnectTime = new CallHistoryDisconnectTimeEnt(mib, this);
                            this.callHistoryCallOrigin = new CallHistoryCallOriginEnt(mib, this);
                            this.callHistoryChargedUnits = new CallHistoryChargedUnitsEnt(mib, this);
                            this.callHistoryInfoType = new CallHistoryInfoTypeEnt(mib, this);
                            this.callHistoryTransmitPackets = new CallHistoryTransmitPacketsEnt(mib, this);
                            this.callHistoryTransmitBytes = new CallHistoryTransmitBytesEnt(mib, this);
                            this.callHistoryReceivePackets = new CallHistoryReceivePacketsEnt(mib, this);
                            this.callHistoryReceiveBytes = new CallHistoryReceiveBytesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.callHistoryPeerAddress,
                                this.callHistoryPeerSubAddress,
                                this.callHistoryPeerId,
                                this.callHistoryPeerIfIndex,
                                this.callHistoryLogicalIfIndex,
                                this.callHistoryDisconnectCause,
                                this.callHistoryDisconnectText,
                                this.callHistoryConnectTime,
                                this.callHistoryDisconnectTime,
                                this.callHistoryCallOrigin,
                                this.callHistoryChargedUnits,
                                this.callHistoryInfoType,
                                this.callHistoryTransmitPackets,
                                this.callHistoryTransmitBytes,
                                this.callHistoryReceivePackets,
                                this.callHistoryReceiveBytes
                            };
                        }
                        public static final class CallHistoryPeerAddressEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallHistoryPeerAddressEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callHistoryPeerAddress", "1.3.6.1.2.1.10.21.1.4.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallHistoryPeerSubAddressEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallHistoryPeerSubAddressEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callHistoryPeerSubAddress", "1.3.6.1.2.1.10.21.1.4.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallHistoryPeerIdEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallHistoryPeerIdEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callHistoryPeerId", "1.3.6.1.2.1.10.21.1.4.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallHistoryPeerIfIndexEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallHistoryPeerIfIndexEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callHistoryPeerIfIndex", "1.3.6.1.2.1.10.21.1.4.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallHistoryLogicalIfIndexEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallHistoryLogicalIfIndexEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callHistoryLogicalIfIndex", "1.3.6.1.2.1.10.21.1.4.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallHistoryDisconnectCauseEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallHistoryDisconnectCauseEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callHistoryDisconnectCause", "1.3.6.1.2.1.10.21.1.4.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallHistoryDisconnectTextEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallHistoryDisconnectTextEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callHistoryDisconnectText", "1.3.6.1.2.1.10.21.1.4.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallHistoryConnectTimeEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallHistoryConnectTimeEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callHistoryConnectTime", "1.3.6.1.2.1.10.21.1.4.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallHistoryDisconnectTimeEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallHistoryDisconnectTimeEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callHistoryDisconnectTime", "1.3.6.1.2.1.10.21.1.4.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallHistoryCallOriginEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallHistoryCallOriginEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callHistoryCallOrigin", "1.3.6.1.2.1.10.21.1.4.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallHistoryChargedUnitsEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallHistoryChargedUnitsEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callHistoryChargedUnits", "1.3.6.1.2.1.10.21.1.4.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallHistoryInfoTypeEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallHistoryInfoTypeEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callHistoryInfoType", "1.3.6.1.2.1.10.21.1.4.3.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallHistoryTransmitPacketsEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallHistoryTransmitPacketsEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callHistoryTransmitPackets", "1.3.6.1.2.1.10.21.1.4.3.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallHistoryTransmitBytesEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallHistoryTransmitBytesEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callHistoryTransmitBytes", "1.3.6.1.2.1.10.21.1.4.3.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallHistoryReceivePacketsEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallHistoryReceivePacketsEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callHistoryReceivePackets", "1.3.6.1.2.1.10.21.1.4.3.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CallHistoryReceiveBytesEnt extends MIBEntry<DIALCONTROLMIBDef>
                        {
                            private CallHistoryReceiveBytesEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "callHistoryReceiveBytes", "1.3.6.1.2.1.10.21.1.4.3.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class DialControlMibTrapPrefixEnt extends MIBEntry<DIALCONTROLMIBDef>
        {
            public final DialControlMibTrapsEnt dialControlMibTraps;

            private DialControlMibTrapPrefixEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
            {
                super(mib, parent, "dialControlMibTrapPrefix", "1.3.6.1.2.1.10.21.2", false, false, false, false);
                this.dialControlMibTraps = new DialControlMibTrapsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dialControlMibTraps
                };
            }
            public static final class DialControlMibTrapsEnt extends MIBEntry<DIALCONTROLMIBDef>
            {
                public final DialCtlPeerCallInformationEnt dialCtlPeerCallInformation;

                public final DialCtlPeerCallSetupEnt dialCtlPeerCallSetup;

                private DialControlMibTrapsEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                {
                    super(mib, parent, "dialControlMibTraps", "1.3.6.1.2.1.10.21.2.0", false, false, false, false);
                    this.dialCtlPeerCallInformation = new DialCtlPeerCallInformationEnt(mib, this);
                    this.dialCtlPeerCallSetup = new DialCtlPeerCallSetupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dialCtlPeerCallInformation,
                        this.dialCtlPeerCallSetup
                    };
                }
                public static final class DialCtlPeerCallInformationEnt extends MIBEntry<DIALCONTROLMIBDef>
                {
                    private DialCtlPeerCallInformationEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "dialCtlPeerCallInformation", "1.3.6.1.2.1.10.21.2.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DialCtlPeerCallSetupEnt extends MIBEntry<DIALCONTROLMIBDef>
                {
                    private DialCtlPeerCallSetupEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "dialCtlPeerCallSetup", "1.3.6.1.2.1.10.21.2.0.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class DialControlMibConformanceEnt extends MIBEntry<DIALCONTROLMIBDef>
        {
            public final DialControlMibCompliancesEnt dialControlMibCompliances;

            public final DialControlMibGroupsEnt dialControlMibGroups;

            private DialControlMibConformanceEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
            {
                super(mib, parent, "dialControlMibConformance", "1.3.6.1.2.1.10.21.3", false, false, false, false);
                this.dialControlMibCompliances = new DialControlMibCompliancesEnt(mib, this);
                this.dialControlMibGroups = new DialControlMibGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dialControlMibCompliances,
                    this.dialControlMibGroups
                };
            }
            public static final class DialControlMibCompliancesEnt extends MIBEntry<DIALCONTROLMIBDef>
            {
                /** compliance statements*/
                public final DialControlMibComplianceEnt dialControlMibCompliance;

                private DialControlMibCompliancesEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                {
                    super(mib, parent, "dialControlMibCompliances", "1.3.6.1.2.1.10.21.3.1", false, false, false, false);
                    this.dialControlMibCompliance = new DialControlMibComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dialControlMibCompliance
                    };
                }
                public static final class DialControlMibComplianceEnt extends MIBEntry<DIALCONTROLMIBDef>
                {
                    private DialControlMibComplianceEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "dialControlMibCompliance", "1.3.6.1.2.1.10.21.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DialControlMibGroupsEnt extends MIBEntry<DIALCONTROLMIBDef>
            {
                /** units of conformance*/
                public final DialControlGroupEnt dialControlGroup;

                public final CallActiveGroupEnt callActiveGroup;

                public final CallHistoryGroupEnt callHistoryGroup;

                public final CallNotificationsGroupEnt callNotificationsGroup;

                private DialControlMibGroupsEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                {
                    super(mib, parent, "dialControlMibGroups", "1.3.6.1.2.1.10.21.3.2", false, false, false, false);
                    this.dialControlGroup = new DialControlGroupEnt(mib, this);
                    this.callActiveGroup = new CallActiveGroupEnt(mib, this);
                    this.callHistoryGroup = new CallHistoryGroupEnt(mib, this);
                    this.callNotificationsGroup = new CallNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dialControlGroup,
                        this.callActiveGroup,
                        this.callHistoryGroup,
                        this.callNotificationsGroup
                    };
                }
                public static final class DialControlGroupEnt extends MIBEntry<DIALCONTROLMIBDef>
                {
                    private DialControlGroupEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "dialControlGroup", "1.3.6.1.2.1.10.21.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CallActiveGroupEnt extends MIBEntry<DIALCONTROLMIBDef>
                {
                    private CallActiveGroupEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "callActiveGroup", "1.3.6.1.2.1.10.21.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CallHistoryGroupEnt extends MIBEntry<DIALCONTROLMIBDef>
                {
                    private CallHistoryGroupEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "callHistoryGroup", "1.3.6.1.2.1.10.21.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CallNotificationsGroupEnt extends MIBEntry<DIALCONTROLMIBDef>
                {
                    private CallNotificationsGroupEnt(DIALCONTROLMIBDef mib, MIBEntry<DIALCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "callNotificationsGroup", "1.3.6.1.2.1.10.21.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
