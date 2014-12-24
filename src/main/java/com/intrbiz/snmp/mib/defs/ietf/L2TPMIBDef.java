package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class L2TPMIBDef extends MIB
{
    public static final L2TPMIBDef L2TPMIB = new L2TPMIBDef();

    /** 23 August 2002*/
    public final L2tpEnt l2tp;

    private L2TPMIBDef()
    {
        super("L2TP-MIB");
        this.l2tp = new L2tpEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.l2tp
        };
    }

    public static final class L2tpEnt extends MIBEntry<L2TPMIBDef>
    {
        /** Definitions of significant branches*/
        public final L2tpNotificationsEnt l2tpNotifications;

        public final L2tpObjectsEnt l2tpObjects;

        public final L2tpTransportsEnt l2tpTransports;

        public final L2tpConformanceEnt l2tpConformance;

        private L2tpEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
        {
            super(mib, parent, "l2tp", "1.3.6.1.2.1.10.95", false, false, false, false);
            this.l2tpNotifications = new L2tpNotificationsEnt(mib, this);
            this.l2tpObjects = new L2tpObjectsEnt(mib, this);
            this.l2tpTransports = new L2tpTransportsEnt(mib, this);
            this.l2tpConformance = new L2tpConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.l2tpNotifications,
                this.l2tpObjects,
                this.l2tpTransports,
                this.l2tpConformance
            };
        }
        public static final class L2tpNotificationsEnt extends MIBEntry<L2TPMIBDef>
        {
            /** Definition of generic L2TP notifications*/
            public final L2tpTunnelAuthFailureEnt l2tpTunnelAuthFailure;

            private L2tpNotificationsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
            {
                super(mib, parent, "l2tpNotifications", "1.3.6.1.2.1.10.95.0", false, false, false, false);
                this.l2tpTunnelAuthFailure = new L2tpTunnelAuthFailureEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.l2tpTunnelAuthFailure
                };
            }
            public static final class L2tpTunnelAuthFailureEnt extends MIBEntry<L2TPMIBDef>
            {
                private L2tpTunnelAuthFailureEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                {
                    super(mib, parent, "l2tpTunnelAuthFailure", "1.3.6.1.2.1.10.95.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class L2tpObjectsEnt extends MIBEntry<L2TPMIBDef>
        {
            /** Definitions of significant branches under l2tpObjects*/
            public final L2tpScalarEnt l2tpScalar;

            /** The L2TP Domain Configuration Table*/
            public final L2tpDomainConfigTableEnt l2tpDomainConfigTable;

            /** The L2TP Domain Status and Statistics Table*/
            public final L2tpDomainStatsTableEnt l2tpDomainStatsTable;

            /** The L2TP Tunnel Configuration Table*/
            public final L2tpTunnelConfigTableEnt l2tpTunnelConfigTable;

            /** The L2TP Tunnel Status and Statisticss Table*/
            public final L2tpTunnelStatsTableEnt l2tpTunnelStatsTable;

            /** { l2tpObjects 6 } reserved for future use
The L2TP Session Status and Statistics Table*/
            public final L2tpSessionStatsTableEnt l2tpSessionStatsTable;

            /** The L2TP Tunnel Mapping Table*/
            public final L2tpTunnelMapTableEnt l2tpTunnelMapTable;

            /** The L2TP Session Mapping Table*/
            public final L2tpSessionMapTableEnt l2tpSessionMapTable;

            private L2tpObjectsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
            {
                super(mib, parent, "l2tpObjects", "1.3.6.1.2.1.10.95.1", false, false, false, false);
                this.l2tpScalar = new L2tpScalarEnt(mib, this);
                this.l2tpDomainConfigTable = new L2tpDomainConfigTableEnt(mib, this);
                this.l2tpDomainStatsTable = new L2tpDomainStatsTableEnt(mib, this);
                this.l2tpTunnelConfigTable = new L2tpTunnelConfigTableEnt(mib, this);
                this.l2tpTunnelStatsTable = new L2tpTunnelStatsTableEnt(mib, this);
                this.l2tpSessionStatsTable = new L2tpSessionStatsTableEnt(mib, this);
                this.l2tpTunnelMapTable = new L2tpTunnelMapTableEnt(mib, this);
                this.l2tpSessionMapTable = new L2tpSessionMapTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.l2tpScalar,
                    this.l2tpDomainConfigTable,
                    this.l2tpDomainStatsTable,
                    this.l2tpTunnelConfigTable,
                    this.l2tpTunnelStatsTable,
                    this.l2tpSessionStatsTable,
                    this.l2tpTunnelMapTable,
                    this.l2tpSessionMapTable
                };
            }
            public static final class L2tpScalarEnt extends MIBEntry<L2TPMIBDef>
            {
                public final L2tpConfigEnt l2tpConfig;

                public final L2tpStatsEnt l2tpStats;

                private L2tpScalarEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                {
                    super(mib, parent, "l2tpScalar", "1.3.6.1.2.1.10.95.1.1", false, false, false, false);
                    this.l2tpConfig = new L2tpConfigEnt(mib, this);
                    this.l2tpStats = new L2tpStatsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.l2tpConfig,
                        this.l2tpStats
                    };
                }
                public static final class L2tpConfigEnt extends MIBEntry<L2TPMIBDef>
                {
                    /** The L2TP Scalar Configuration GroupThis group of objects is used to manage configurationof the L2TP protocol environment.*/
                    public final L2tpAdminStateEnt l2tpAdminState;

                    public final L2tpDrainTunnelsEnt l2tpDrainTunnels;

                    private L2tpConfigEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpConfig", "1.3.6.1.2.1.10.95.1.1.1", false, false, false, false);
                        this.l2tpAdminState = new L2tpAdminStateEnt(mib, this);
                        this.l2tpDrainTunnels = new L2tpDrainTunnelsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.l2tpAdminState,
                            this.l2tpDrainTunnels
                        };
                    }
                    public static final class L2tpAdminStateEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpAdminStateEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpAdminState", "1.3.6.1.2.1.10.95.1.1.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDrainTunnelsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDrainTunnelsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDrainTunnels", "1.3.6.1.2.1.10.95.1.1.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class L2tpStatsEnt extends MIBEntry<L2TPMIBDef>
                {
                    /** The L2TP Scalar Status and Statistics GroupThis group of objects describe the current state andstatistics of L2TP.*/
                    public final L2tpProtocolVersionsEnt l2tpProtocolVersions;

                    public final L2tpVendorNameEnt l2tpVendorName;

                    public final L2tpFirmwareRevEnt l2tpFirmwareRev;

                    public final L2tpDrainingTunnelsEnt l2tpDrainingTunnels;

                    private L2tpStatsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpStats", "1.3.6.1.2.1.10.95.1.1.2", false, false, false, false);
                        this.l2tpProtocolVersions = new L2tpProtocolVersionsEnt(mib, this);
                        this.l2tpVendorName = new L2tpVendorNameEnt(mib, this);
                        this.l2tpFirmwareRev = new L2tpFirmwareRevEnt(mib, this);
                        this.l2tpDrainingTunnels = new L2tpDrainingTunnelsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.l2tpProtocolVersions,
                            this.l2tpVendorName,
                            this.l2tpFirmwareRev,
                            this.l2tpDrainingTunnels
                        };
                    }
                    public static final class L2tpProtocolVersionsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpProtocolVersionsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpProtocolVersions", "1.3.6.1.2.1.10.95.1.1.2.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpVendorNameEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpVendorNameEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpVendorName", "1.3.6.1.2.1.10.95.1.1.2.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpFirmwareRevEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpFirmwareRevEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpFirmwareRev", "1.3.6.1.2.1.10.95.1.1.2.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDrainingTunnelsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDrainingTunnelsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDrainingTunnels", "1.3.6.1.2.1.10.95.1.1.2.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class L2tpDomainConfigTableEnt extends MIBEntry<L2TPMIBDef>
            {
                public final L2tpDomainConfigEntryEnt l2tpDomainConfigEntry;

                private L2tpDomainConfigTableEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                {
                    super(mib, parent, "l2tpDomainConfigTable", "1.3.6.1.2.1.10.95.1.2", false, true, false, false);
                    this.l2tpDomainConfigEntry = new L2tpDomainConfigEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.l2tpDomainConfigEntry
                    };
                }
                public static final class L2tpDomainConfigEntryEnt extends MIBEntry<L2TPMIBDef>
                {
                    public final L2tpDomainConfigIdEnt l2tpDomainConfigId;

                    public final L2tpDomainConfigAdminStateEnt l2tpDomainConfigAdminState;

                    public final L2tpDomainConfigDrainTunnelsEnt l2tpDomainConfigDrainTunnels;

                    public final L2tpDomainConfigAuthEnt l2tpDomainConfigAuth;

                    public final L2tpDomainConfigSecretEnt l2tpDomainConfigSecret;

                    public final L2tpDomainConfigTunnelSecurityEnt l2tpDomainConfigTunnelSecurity;

                    public final L2tpDomainConfigTunnelHelloIntEnt l2tpDomainConfigTunnelHelloInt;

                    public final L2tpDomainConfigTunnelIdleTOEnt l2tpDomainConfigTunnelIdleTO;

                    public final L2tpDomainConfigControlRWSEnt l2tpDomainConfigControlRWS;

                    public final L2tpDomainConfigControlMaxRetxEnt l2tpDomainConfigControlMaxRetx;

                    public final L2tpDomainConfigControlMaxRetxTOEnt l2tpDomainConfigControlMaxRetxTO;

                    public final L2tpDomainConfigPayloadSeqEnt l2tpDomainConfigPayloadSeq;

                    public final L2tpDomainConfigReassemblyTOEnt l2tpDomainConfigReassemblyTO;

                    public final L2tpDomainConfigProxyPPPAuthEnt l2tpDomainConfigProxyPPPAuth;

                    public final L2tpDomainConfigStorageTypeEnt l2tpDomainConfigStorageType;

                    public final L2tpDomainConfigStatusEnt l2tpDomainConfigStatus;

                    private L2tpDomainConfigEntryEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpDomainConfigEntry", "1.3.6.1.2.1.10.95.1.2.1", false, false, false, true);
                        this.l2tpDomainConfigId = new L2tpDomainConfigIdEnt(mib, this);
                        this.l2tpDomainConfigAdminState = new L2tpDomainConfigAdminStateEnt(mib, this);
                        this.l2tpDomainConfigDrainTunnels = new L2tpDomainConfigDrainTunnelsEnt(mib, this);
                        this.l2tpDomainConfigAuth = new L2tpDomainConfigAuthEnt(mib, this);
                        this.l2tpDomainConfigSecret = new L2tpDomainConfigSecretEnt(mib, this);
                        this.l2tpDomainConfigTunnelSecurity = new L2tpDomainConfigTunnelSecurityEnt(mib, this);
                        this.l2tpDomainConfigTunnelHelloInt = new L2tpDomainConfigTunnelHelloIntEnt(mib, this);
                        this.l2tpDomainConfigTunnelIdleTO = new L2tpDomainConfigTunnelIdleTOEnt(mib, this);
                        this.l2tpDomainConfigControlRWS = new L2tpDomainConfigControlRWSEnt(mib, this);
                        this.l2tpDomainConfigControlMaxRetx = new L2tpDomainConfigControlMaxRetxEnt(mib, this);
                        this.l2tpDomainConfigControlMaxRetxTO = new L2tpDomainConfigControlMaxRetxTOEnt(mib, this);
                        this.l2tpDomainConfigPayloadSeq = new L2tpDomainConfigPayloadSeqEnt(mib, this);
                        this.l2tpDomainConfigReassemblyTO = new L2tpDomainConfigReassemblyTOEnt(mib, this);
                        this.l2tpDomainConfigProxyPPPAuth = new L2tpDomainConfigProxyPPPAuthEnt(mib, this);
                        this.l2tpDomainConfigStorageType = new L2tpDomainConfigStorageTypeEnt(mib, this);
                        this.l2tpDomainConfigStatus = new L2tpDomainConfigStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.l2tpDomainConfigId,
                            this.l2tpDomainConfigAdminState,
                            this.l2tpDomainConfigDrainTunnels,
                            this.l2tpDomainConfigAuth,
                            this.l2tpDomainConfigSecret,
                            this.l2tpDomainConfigTunnelSecurity,
                            this.l2tpDomainConfigTunnelHelloInt,
                            this.l2tpDomainConfigTunnelIdleTO,
                            this.l2tpDomainConfigControlRWS,
                            this.l2tpDomainConfigControlMaxRetx,
                            this.l2tpDomainConfigControlMaxRetxTO,
                            this.l2tpDomainConfigPayloadSeq,
                            this.l2tpDomainConfigReassemblyTO,
                            this.l2tpDomainConfigProxyPPPAuth,
                            this.l2tpDomainConfigStorageType,
                            this.l2tpDomainConfigStatus
                        };
                    }
                    public static final class L2tpDomainConfigIdEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainConfigIdEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainConfigId", "1.3.6.1.2.1.10.95.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainConfigAdminStateEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainConfigAdminStateEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainConfigAdminState", "1.3.6.1.2.1.10.95.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainConfigDrainTunnelsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainConfigDrainTunnelsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainConfigDrainTunnels", "1.3.6.1.2.1.10.95.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainConfigAuthEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainConfigAuthEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainConfigAuth", "1.3.6.1.2.1.10.95.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainConfigSecretEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainConfigSecretEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainConfigSecret", "1.3.6.1.2.1.10.95.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainConfigTunnelSecurityEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainConfigTunnelSecurityEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainConfigTunnelSecurity", "1.3.6.1.2.1.10.95.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainConfigTunnelHelloIntEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainConfigTunnelHelloIntEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainConfigTunnelHelloInt", "1.3.6.1.2.1.10.95.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainConfigTunnelIdleTOEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainConfigTunnelIdleTOEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainConfigTunnelIdleTO", "1.3.6.1.2.1.10.95.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainConfigControlRWSEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainConfigControlRWSEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainConfigControlRWS", "1.3.6.1.2.1.10.95.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainConfigControlMaxRetxEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainConfigControlMaxRetxEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainConfigControlMaxRetx", "1.3.6.1.2.1.10.95.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainConfigControlMaxRetxTOEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainConfigControlMaxRetxTOEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainConfigControlMaxRetxTO", "1.3.6.1.2.1.10.95.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainConfigPayloadSeqEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainConfigPayloadSeqEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainConfigPayloadSeq", "1.3.6.1.2.1.10.95.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainConfigReassemblyTOEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainConfigReassemblyTOEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainConfigReassemblyTO", "1.3.6.1.2.1.10.95.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainConfigProxyPPPAuthEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainConfigProxyPPPAuthEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainConfigProxyPPPAuth", "1.3.6.1.2.1.10.95.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainConfigStorageTypeEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainConfigStorageTypeEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainConfigStorageType", "1.3.6.1.2.1.10.95.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainConfigStatusEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainConfigStatusEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainConfigStatus", "1.3.6.1.2.1.10.95.1.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class L2tpDomainStatsTableEnt extends MIBEntry<L2TPMIBDef>
            {
                public final L2tpDomainStatsEntryEnt l2tpDomainStatsEntry;

                private L2tpDomainStatsTableEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                {
                    super(mib, parent, "l2tpDomainStatsTable", "1.3.6.1.2.1.10.95.1.3", false, true, false, false);
                    this.l2tpDomainStatsEntry = new L2tpDomainStatsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.l2tpDomainStatsEntry
                    };
                }
                public static final class L2tpDomainStatsEntryEnt extends MIBEntry<L2TPMIBDef>
                {
                    public final L2tpDomainStatsTotalTunnelsEnt l2tpDomainStatsTotalTunnels;

                    public final L2tpDomainStatsFailedTunnelsEnt l2tpDomainStatsFailedTunnels;

                    public final L2tpDomainStatsFailedAuthsEnt l2tpDomainStatsFailedAuths;

                    public final L2tpDomainStatsActiveTunnelsEnt l2tpDomainStatsActiveTunnels;

                    public final L2tpDomainStatsTotalSessionsEnt l2tpDomainStatsTotalSessions;

                    public final L2tpDomainStatsFailedSessionsEnt l2tpDomainStatsFailedSessions;

                    public final L2tpDomainStatsActiveSessionsEnt l2tpDomainStatsActiveSessions;

                    public final L2tpDomainStatsDrainingTunnelsEnt l2tpDomainStatsDrainingTunnels;

                    public final L2tpDomainStatsControlRxOctetsEnt l2tpDomainStatsControlRxOctets;

                    public final L2tpDomainStatsControlRxPktsEnt l2tpDomainStatsControlRxPkts;

                    public final L2tpDomainStatsControlTxOctetsEnt l2tpDomainStatsControlTxOctets;

                    public final L2tpDomainStatsControlTxPktsEnt l2tpDomainStatsControlTxPkts;

                    public final L2tpDomainStatsPayloadRxOctetsEnt l2tpDomainStatsPayloadRxOctets;

                    public final L2tpDomainStatsPayloadRxPktsEnt l2tpDomainStatsPayloadRxPkts;

                    public final L2tpDomainStatsPayloadRxDiscsEnt l2tpDomainStatsPayloadRxDiscs;

                    public final L2tpDomainStatsPayloadTxOctetsEnt l2tpDomainStatsPayloadTxOctets;

                    public final L2tpDomainStatsPayloadTxPktsEnt l2tpDomainStatsPayloadTxPkts;

                    /** High Capacity Counter objects.  These objects are all64 bit versions of the above 32-bit counters.  Theseobjects all have the same basic semantics as their32-bit counterparts, however, their syntax has beenextended to 64 bits.*/
                    public final L2tpDomainStatsControlHCRxOctetsEnt l2tpDomainStatsControlHCRxOctets;

                    public final L2tpDomainStatsControlHCRxPktsEnt l2tpDomainStatsControlHCRxPkts;

                    public final L2tpDomainStatsControlHCTxOctetsEnt l2tpDomainStatsControlHCTxOctets;

                    public final L2tpDomainStatsControlHCTxPktsEnt l2tpDomainStatsControlHCTxPkts;

                    public final L2tpDomainStatsPayloadHCRxOctetsEnt l2tpDomainStatsPayloadHCRxOctets;

                    public final L2tpDomainStatsPayloadHCRxPktsEnt l2tpDomainStatsPayloadHCRxPkts;

                    public final L2tpDomainStatsPayloadHCRxDiscsEnt l2tpDomainStatsPayloadHCRxDiscs;

                    public final L2tpDomainStatsPayloadHCTxOctetsEnt l2tpDomainStatsPayloadHCTxOctets;

                    public final L2tpDomainStatsPayloadHCTxPktsEnt l2tpDomainStatsPayloadHCTxPkts;

                    private L2tpDomainStatsEntryEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpDomainStatsEntry", "1.3.6.1.2.1.10.95.1.3.1", false, false, false, true);
                        this.l2tpDomainStatsTotalTunnels = new L2tpDomainStatsTotalTunnelsEnt(mib, this);
                        this.l2tpDomainStatsFailedTunnels = new L2tpDomainStatsFailedTunnelsEnt(mib, this);
                        this.l2tpDomainStatsFailedAuths = new L2tpDomainStatsFailedAuthsEnt(mib, this);
                        this.l2tpDomainStatsActiveTunnels = new L2tpDomainStatsActiveTunnelsEnt(mib, this);
                        this.l2tpDomainStatsTotalSessions = new L2tpDomainStatsTotalSessionsEnt(mib, this);
                        this.l2tpDomainStatsFailedSessions = new L2tpDomainStatsFailedSessionsEnt(mib, this);
                        this.l2tpDomainStatsActiveSessions = new L2tpDomainStatsActiveSessionsEnt(mib, this);
                        this.l2tpDomainStatsDrainingTunnels = new L2tpDomainStatsDrainingTunnelsEnt(mib, this);
                        this.l2tpDomainStatsControlRxOctets = new L2tpDomainStatsControlRxOctetsEnt(mib, this);
                        this.l2tpDomainStatsControlRxPkts = new L2tpDomainStatsControlRxPktsEnt(mib, this);
                        this.l2tpDomainStatsControlTxOctets = new L2tpDomainStatsControlTxOctetsEnt(mib, this);
                        this.l2tpDomainStatsControlTxPkts = new L2tpDomainStatsControlTxPktsEnt(mib, this);
                        this.l2tpDomainStatsPayloadRxOctets = new L2tpDomainStatsPayloadRxOctetsEnt(mib, this);
                        this.l2tpDomainStatsPayloadRxPkts = new L2tpDomainStatsPayloadRxPktsEnt(mib, this);
                        this.l2tpDomainStatsPayloadRxDiscs = new L2tpDomainStatsPayloadRxDiscsEnt(mib, this);
                        this.l2tpDomainStatsPayloadTxOctets = new L2tpDomainStatsPayloadTxOctetsEnt(mib, this);
                        this.l2tpDomainStatsPayloadTxPkts = new L2tpDomainStatsPayloadTxPktsEnt(mib, this);
                        this.l2tpDomainStatsControlHCRxOctets = new L2tpDomainStatsControlHCRxOctetsEnt(mib, this);
                        this.l2tpDomainStatsControlHCRxPkts = new L2tpDomainStatsControlHCRxPktsEnt(mib, this);
                        this.l2tpDomainStatsControlHCTxOctets = new L2tpDomainStatsControlHCTxOctetsEnt(mib, this);
                        this.l2tpDomainStatsControlHCTxPkts = new L2tpDomainStatsControlHCTxPktsEnt(mib, this);
                        this.l2tpDomainStatsPayloadHCRxOctets = new L2tpDomainStatsPayloadHCRxOctetsEnt(mib, this);
                        this.l2tpDomainStatsPayloadHCRxPkts = new L2tpDomainStatsPayloadHCRxPktsEnt(mib, this);
                        this.l2tpDomainStatsPayloadHCRxDiscs = new L2tpDomainStatsPayloadHCRxDiscsEnt(mib, this);
                        this.l2tpDomainStatsPayloadHCTxOctets = new L2tpDomainStatsPayloadHCTxOctetsEnt(mib, this);
                        this.l2tpDomainStatsPayloadHCTxPkts = new L2tpDomainStatsPayloadHCTxPktsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.l2tpDomainStatsTotalTunnels,
                            this.l2tpDomainStatsFailedTunnels,
                            this.l2tpDomainStatsFailedAuths,
                            this.l2tpDomainStatsActiveTunnels,
                            this.l2tpDomainStatsTotalSessions,
                            this.l2tpDomainStatsFailedSessions,
                            this.l2tpDomainStatsActiveSessions,
                            this.l2tpDomainStatsDrainingTunnels,
                            this.l2tpDomainStatsControlRxOctets,
                            this.l2tpDomainStatsControlRxPkts,
                            this.l2tpDomainStatsControlTxOctets,
                            this.l2tpDomainStatsControlTxPkts,
                            this.l2tpDomainStatsPayloadRxOctets,
                            this.l2tpDomainStatsPayloadRxPkts,
                            this.l2tpDomainStatsPayloadRxDiscs,
                            this.l2tpDomainStatsPayloadTxOctets,
                            this.l2tpDomainStatsPayloadTxPkts,
                            this.l2tpDomainStatsControlHCRxOctets,
                            this.l2tpDomainStatsControlHCRxPkts,
                            this.l2tpDomainStatsControlHCTxOctets,
                            this.l2tpDomainStatsControlHCTxPkts,
                            this.l2tpDomainStatsPayloadHCRxOctets,
                            this.l2tpDomainStatsPayloadHCRxPkts,
                            this.l2tpDomainStatsPayloadHCRxDiscs,
                            this.l2tpDomainStatsPayloadHCTxOctets,
                            this.l2tpDomainStatsPayloadHCTxPkts
                        };
                    }
                    public static final class L2tpDomainStatsTotalTunnelsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsTotalTunnelsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsTotalTunnels", "1.3.6.1.2.1.10.95.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsFailedTunnelsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsFailedTunnelsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsFailedTunnels", "1.3.6.1.2.1.10.95.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsFailedAuthsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsFailedAuthsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsFailedAuths", "1.3.6.1.2.1.10.95.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsActiveTunnelsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsActiveTunnelsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsActiveTunnels", "1.3.6.1.2.1.10.95.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsTotalSessionsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsTotalSessionsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsTotalSessions", "1.3.6.1.2.1.10.95.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsFailedSessionsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsFailedSessionsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsFailedSessions", "1.3.6.1.2.1.10.95.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsActiveSessionsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsActiveSessionsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsActiveSessions", "1.3.6.1.2.1.10.95.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsDrainingTunnelsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsDrainingTunnelsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsDrainingTunnels", "1.3.6.1.2.1.10.95.1.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsControlRxOctetsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsControlRxOctetsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsControlRxOctets", "1.3.6.1.2.1.10.95.1.3.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsControlRxPktsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsControlRxPktsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsControlRxPkts", "1.3.6.1.2.1.10.95.1.3.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsControlTxOctetsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsControlTxOctetsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsControlTxOctets", "1.3.6.1.2.1.10.95.1.3.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsControlTxPktsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsControlTxPktsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsControlTxPkts", "1.3.6.1.2.1.10.95.1.3.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsPayloadRxOctetsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsPayloadRxOctetsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsPayloadRxOctets", "1.3.6.1.2.1.10.95.1.3.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsPayloadRxPktsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsPayloadRxPktsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsPayloadRxPkts", "1.3.6.1.2.1.10.95.1.3.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsPayloadRxDiscsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsPayloadRxDiscsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsPayloadRxDiscs", "1.3.6.1.2.1.10.95.1.3.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsPayloadTxOctetsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsPayloadTxOctetsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsPayloadTxOctets", "1.3.6.1.2.1.10.95.1.3.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsPayloadTxPktsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsPayloadTxPktsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsPayloadTxPkts", "1.3.6.1.2.1.10.95.1.3.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsControlHCRxOctetsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsControlHCRxOctetsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsControlHCRxOctets", "1.3.6.1.2.1.10.95.1.3.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsControlHCRxPktsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsControlHCRxPktsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsControlHCRxPkts", "1.3.6.1.2.1.10.95.1.3.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsControlHCTxOctetsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsControlHCTxOctetsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsControlHCTxOctets", "1.3.6.1.2.1.10.95.1.3.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsControlHCTxPktsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsControlHCTxPktsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsControlHCTxPkts", "1.3.6.1.2.1.10.95.1.3.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsPayloadHCRxOctetsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsPayloadHCRxOctetsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsPayloadHCRxOctets", "1.3.6.1.2.1.10.95.1.3.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsPayloadHCRxPktsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsPayloadHCRxPktsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsPayloadHCRxPkts", "1.3.6.1.2.1.10.95.1.3.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsPayloadHCRxDiscsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsPayloadHCRxDiscsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsPayloadHCRxDiscs", "1.3.6.1.2.1.10.95.1.3.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsPayloadHCTxOctetsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsPayloadHCTxOctetsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsPayloadHCTxOctets", "1.3.6.1.2.1.10.95.1.3.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpDomainStatsPayloadHCTxPktsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpDomainStatsPayloadHCTxPktsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpDomainStatsPayloadHCTxPkts", "1.3.6.1.2.1.10.95.1.3.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class L2tpTunnelConfigTableEnt extends MIBEntry<L2TPMIBDef>
            {
                public final L2tpTunnelConfigEntryEnt l2tpTunnelConfigEntry;

                private L2tpTunnelConfigTableEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                {
                    super(mib, parent, "l2tpTunnelConfigTable", "1.3.6.1.2.1.10.95.1.4", false, true, false, false);
                    this.l2tpTunnelConfigEntry = new L2tpTunnelConfigEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.l2tpTunnelConfigEntry
                    };
                }
                public static final class L2tpTunnelConfigEntryEnt extends MIBEntry<L2TPMIBDef>
                {
                    public final L2tpTunnelConfigIfIndexEnt l2tpTunnelConfigIfIndex;

                    public final L2tpTunnelConfigDomainIdEnt l2tpTunnelConfigDomainId;

                    public final L2tpTunnelConfigAuthEnt l2tpTunnelConfigAuth;

                    public final L2tpTunnelConfigSecretEnt l2tpTunnelConfigSecret;

                    public final L2tpTunnelConfigSecurityEnt l2tpTunnelConfigSecurity;

                    public final L2tpTunnelConfigHelloIntervalEnt l2tpTunnelConfigHelloInterval;

                    public final L2tpTunnelConfigIdleTimeoutEnt l2tpTunnelConfigIdleTimeout;

                    public final L2tpTunnelConfigControlRWSEnt l2tpTunnelConfigControlRWS;

                    public final L2tpTunnelConfigControlMaxRetxEnt l2tpTunnelConfigControlMaxRetx;

                    public final L2tpTunnelConfigControlMaxRetxTOEnt l2tpTunnelConfigControlMaxRetxTO;

                    public final L2tpTunnelConfigPayloadSeqEnt l2tpTunnelConfigPayloadSeq;

                    public final L2tpTunnelConfigReassemblyTOEnt l2tpTunnelConfigReassemblyTO;

                    public final L2tpTunnelConfigTransportEnt l2tpTunnelConfigTransport;

                    public final L2tpTunnelConfigDrainTunnelEnt l2tpTunnelConfigDrainTunnel;

                    public final L2tpTunnelConfigProxyPPPAuthEnt l2tpTunnelConfigProxyPPPAuth;

                    private L2tpTunnelConfigEntryEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpTunnelConfigEntry", "1.3.6.1.2.1.10.95.1.4.1", false, false, false, true);
                        this.l2tpTunnelConfigIfIndex = new L2tpTunnelConfigIfIndexEnt(mib, this);
                        this.l2tpTunnelConfigDomainId = new L2tpTunnelConfigDomainIdEnt(mib, this);
                        this.l2tpTunnelConfigAuth = new L2tpTunnelConfigAuthEnt(mib, this);
                        this.l2tpTunnelConfigSecret = new L2tpTunnelConfigSecretEnt(mib, this);
                        this.l2tpTunnelConfigSecurity = new L2tpTunnelConfigSecurityEnt(mib, this);
                        this.l2tpTunnelConfigHelloInterval = new L2tpTunnelConfigHelloIntervalEnt(mib, this);
                        this.l2tpTunnelConfigIdleTimeout = new L2tpTunnelConfigIdleTimeoutEnt(mib, this);
                        this.l2tpTunnelConfigControlRWS = new L2tpTunnelConfigControlRWSEnt(mib, this);
                        this.l2tpTunnelConfigControlMaxRetx = new L2tpTunnelConfigControlMaxRetxEnt(mib, this);
                        this.l2tpTunnelConfigControlMaxRetxTO = new L2tpTunnelConfigControlMaxRetxTOEnt(mib, this);
                        this.l2tpTunnelConfigPayloadSeq = new L2tpTunnelConfigPayloadSeqEnt(mib, this);
                        this.l2tpTunnelConfigReassemblyTO = new L2tpTunnelConfigReassemblyTOEnt(mib, this);
                        this.l2tpTunnelConfigTransport = new L2tpTunnelConfigTransportEnt(mib, this);
                        this.l2tpTunnelConfigDrainTunnel = new L2tpTunnelConfigDrainTunnelEnt(mib, this);
                        this.l2tpTunnelConfigProxyPPPAuth = new L2tpTunnelConfigProxyPPPAuthEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.l2tpTunnelConfigIfIndex,
                            this.l2tpTunnelConfigDomainId,
                            this.l2tpTunnelConfigAuth,
                            this.l2tpTunnelConfigSecret,
                            this.l2tpTunnelConfigSecurity,
                            this.l2tpTunnelConfigHelloInterval,
                            this.l2tpTunnelConfigIdleTimeout,
                            this.l2tpTunnelConfigControlRWS,
                            this.l2tpTunnelConfigControlMaxRetx,
                            this.l2tpTunnelConfigControlMaxRetxTO,
                            this.l2tpTunnelConfigPayloadSeq,
                            this.l2tpTunnelConfigReassemblyTO,
                            this.l2tpTunnelConfigTransport,
                            this.l2tpTunnelConfigDrainTunnel,
                            this.l2tpTunnelConfigProxyPPPAuth
                        };
                    }
                    public static final class L2tpTunnelConfigIfIndexEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelConfigIfIndexEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelConfigIfIndex", "1.3.6.1.2.1.10.95.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelConfigDomainIdEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelConfigDomainIdEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelConfigDomainId", "1.3.6.1.2.1.10.95.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelConfigAuthEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelConfigAuthEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelConfigAuth", "1.3.6.1.2.1.10.95.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelConfigSecretEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelConfigSecretEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelConfigSecret", "1.3.6.1.2.1.10.95.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelConfigSecurityEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelConfigSecurityEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelConfigSecurity", "1.3.6.1.2.1.10.95.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelConfigHelloIntervalEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelConfigHelloIntervalEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelConfigHelloInterval", "1.3.6.1.2.1.10.95.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelConfigIdleTimeoutEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelConfigIdleTimeoutEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelConfigIdleTimeout", "1.3.6.1.2.1.10.95.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelConfigControlRWSEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelConfigControlRWSEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelConfigControlRWS", "1.3.6.1.2.1.10.95.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelConfigControlMaxRetxEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelConfigControlMaxRetxEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelConfigControlMaxRetx", "1.3.6.1.2.1.10.95.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelConfigControlMaxRetxTOEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelConfigControlMaxRetxTOEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelConfigControlMaxRetxTO", "1.3.6.1.2.1.10.95.1.4.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelConfigPayloadSeqEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelConfigPayloadSeqEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelConfigPayloadSeq", "1.3.6.1.2.1.10.95.1.4.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelConfigReassemblyTOEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelConfigReassemblyTOEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelConfigReassemblyTO", "1.3.6.1.2.1.10.95.1.4.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelConfigTransportEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelConfigTransportEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelConfigTransport", "1.3.6.1.2.1.10.95.1.4.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelConfigDrainTunnelEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelConfigDrainTunnelEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelConfigDrainTunnel", "1.3.6.1.2.1.10.95.1.4.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelConfigProxyPPPAuthEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelConfigProxyPPPAuthEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelConfigProxyPPPAuth", "1.3.6.1.2.1.10.95.1.4.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class L2tpTunnelStatsTableEnt extends MIBEntry<L2TPMIBDef>
            {
                public final L2tpTunnelStatsEntryEnt l2tpTunnelStatsEntry;

                private L2tpTunnelStatsTableEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                {
                    super(mib, parent, "l2tpTunnelStatsTable", "1.3.6.1.2.1.10.95.1.5", false, true, false, false);
                    this.l2tpTunnelStatsEntry = new L2tpTunnelStatsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.l2tpTunnelStatsEntry
                    };
                }
                public static final class L2tpTunnelStatsEntryEnt extends MIBEntry<L2TPMIBDef>
                {
                    public final L2tpTunnelStatsLocalTIDEnt l2tpTunnelStatsLocalTID;

                    public final L2tpTunnelStatsRemoteTIDEnt l2tpTunnelStatsRemoteTID;

                    public final L2tpTunnelStatsStateEnt l2tpTunnelStatsState;

                    public final L2tpTunnelStatsInitiatedEnt l2tpTunnelStatsInitiated;

                    public final L2tpTunnelStatsRemoteHostNameEnt l2tpTunnelStatsRemoteHostName;

                    public final L2tpTunnelStatsRemoteVendorNameEnt l2tpTunnelStatsRemoteVendorName;

                    public final L2tpTunnelStatsRemoteFirmwareRevEnt l2tpTunnelStatsRemoteFirmwareRev;

                    public final L2tpTunnelStatsRemoteProtocolVerEnt l2tpTunnelStatsRemoteProtocolVer;

                    public final L2tpTunnelStatsInitialRemoteRWSEnt l2tpTunnelStatsInitialRemoteRWS;

                    public final L2tpTunnelStatsBearerCapsEnt l2tpTunnelStatsBearerCaps;

                    public final L2tpTunnelStatsFramingCapsEnt l2tpTunnelStatsFramingCaps;

                    public final L2tpTunnelStatsControlRxPktsEnt l2tpTunnelStatsControlRxPkts;

                    public final L2tpTunnelStatsControlRxZLBEnt l2tpTunnelStatsControlRxZLB;

                    public final L2tpTunnelStatsControlOutOfSeqEnt l2tpTunnelStatsControlOutOfSeq;

                    public final L2tpTunnelStatsControlOutOfWinEnt l2tpTunnelStatsControlOutOfWin;

                    public final L2tpTunnelStatsControlTxPktsEnt l2tpTunnelStatsControlTxPkts;

                    public final L2tpTunnelStatsControlTxZLBEnt l2tpTunnelStatsControlTxZLB;

                    public final L2tpTunnelStatsControlAckTOEnt l2tpTunnelStatsControlAckTO;

                    public final L2tpTunnelStatsCurrentRemoteRWSEnt l2tpTunnelStatsCurrentRemoteRWS;

                    public final L2tpTunnelStatsTxSeqEnt l2tpTunnelStatsTxSeq;

                    public final L2tpTunnelStatsTxSeqAckEnt l2tpTunnelStatsTxSeqAck;

                    public final L2tpTunnelStatsRxSeqEnt l2tpTunnelStatsRxSeq;

                    public final L2tpTunnelStatsRxSeqAckEnt l2tpTunnelStatsRxSeqAck;

                    public final L2tpTunnelStatsTotalSessionsEnt l2tpTunnelStatsTotalSessions;

                    public final L2tpTunnelStatsFailedSessionsEnt l2tpTunnelStatsFailedSessions;

                    public final L2tpTunnelStatsActiveSessionsEnt l2tpTunnelStatsActiveSessions;

                    public final L2tpTunnelStatsLastResultCodeEnt l2tpTunnelStatsLastResultCode;

                    public final L2tpTunnelStatsLastErrorCodeEnt l2tpTunnelStatsLastErrorCode;

                    public final L2tpTunnelStatsLastErrorMessageEnt l2tpTunnelStatsLastErrorMessage;

                    public final L2tpTunnelStatsDrainingTunnelEnt l2tpTunnelStatsDrainingTunnel;

                    private L2tpTunnelStatsEntryEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpTunnelStatsEntry", "1.3.6.1.2.1.10.95.1.5.1", false, false, false, true);
                        this.l2tpTunnelStatsLocalTID = new L2tpTunnelStatsLocalTIDEnt(mib, this);
                        this.l2tpTunnelStatsRemoteTID = new L2tpTunnelStatsRemoteTIDEnt(mib, this);
                        this.l2tpTunnelStatsState = new L2tpTunnelStatsStateEnt(mib, this);
                        this.l2tpTunnelStatsInitiated = new L2tpTunnelStatsInitiatedEnt(mib, this);
                        this.l2tpTunnelStatsRemoteHostName = new L2tpTunnelStatsRemoteHostNameEnt(mib, this);
                        this.l2tpTunnelStatsRemoteVendorName = new L2tpTunnelStatsRemoteVendorNameEnt(mib, this);
                        this.l2tpTunnelStatsRemoteFirmwareRev = new L2tpTunnelStatsRemoteFirmwareRevEnt(mib, this);
                        this.l2tpTunnelStatsRemoteProtocolVer = new L2tpTunnelStatsRemoteProtocolVerEnt(mib, this);
                        this.l2tpTunnelStatsInitialRemoteRWS = new L2tpTunnelStatsInitialRemoteRWSEnt(mib, this);
                        this.l2tpTunnelStatsBearerCaps = new L2tpTunnelStatsBearerCapsEnt(mib, this);
                        this.l2tpTunnelStatsFramingCaps = new L2tpTunnelStatsFramingCapsEnt(mib, this);
                        this.l2tpTunnelStatsControlRxPkts = new L2tpTunnelStatsControlRxPktsEnt(mib, this);
                        this.l2tpTunnelStatsControlRxZLB = new L2tpTunnelStatsControlRxZLBEnt(mib, this);
                        this.l2tpTunnelStatsControlOutOfSeq = new L2tpTunnelStatsControlOutOfSeqEnt(mib, this);
                        this.l2tpTunnelStatsControlOutOfWin = new L2tpTunnelStatsControlOutOfWinEnt(mib, this);
                        this.l2tpTunnelStatsControlTxPkts = new L2tpTunnelStatsControlTxPktsEnt(mib, this);
                        this.l2tpTunnelStatsControlTxZLB = new L2tpTunnelStatsControlTxZLBEnt(mib, this);
                        this.l2tpTunnelStatsControlAckTO = new L2tpTunnelStatsControlAckTOEnt(mib, this);
                        this.l2tpTunnelStatsCurrentRemoteRWS = new L2tpTunnelStatsCurrentRemoteRWSEnt(mib, this);
                        this.l2tpTunnelStatsTxSeq = new L2tpTunnelStatsTxSeqEnt(mib, this);
                        this.l2tpTunnelStatsTxSeqAck = new L2tpTunnelStatsTxSeqAckEnt(mib, this);
                        this.l2tpTunnelStatsRxSeq = new L2tpTunnelStatsRxSeqEnt(mib, this);
                        this.l2tpTunnelStatsRxSeqAck = new L2tpTunnelStatsRxSeqAckEnt(mib, this);
                        this.l2tpTunnelStatsTotalSessions = new L2tpTunnelStatsTotalSessionsEnt(mib, this);
                        this.l2tpTunnelStatsFailedSessions = new L2tpTunnelStatsFailedSessionsEnt(mib, this);
                        this.l2tpTunnelStatsActiveSessions = new L2tpTunnelStatsActiveSessionsEnt(mib, this);
                        this.l2tpTunnelStatsLastResultCode = new L2tpTunnelStatsLastResultCodeEnt(mib, this);
                        this.l2tpTunnelStatsLastErrorCode = new L2tpTunnelStatsLastErrorCodeEnt(mib, this);
                        this.l2tpTunnelStatsLastErrorMessage = new L2tpTunnelStatsLastErrorMessageEnt(mib, this);
                        this.l2tpTunnelStatsDrainingTunnel = new L2tpTunnelStatsDrainingTunnelEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.l2tpTunnelStatsLocalTID,
                            this.l2tpTunnelStatsRemoteTID,
                            this.l2tpTunnelStatsState,
                            this.l2tpTunnelStatsInitiated,
                            this.l2tpTunnelStatsRemoteHostName,
                            this.l2tpTunnelStatsRemoteVendorName,
                            this.l2tpTunnelStatsRemoteFirmwareRev,
                            this.l2tpTunnelStatsRemoteProtocolVer,
                            this.l2tpTunnelStatsInitialRemoteRWS,
                            this.l2tpTunnelStatsBearerCaps,
                            this.l2tpTunnelStatsFramingCaps,
                            this.l2tpTunnelStatsControlRxPkts,
                            this.l2tpTunnelStatsControlRxZLB,
                            this.l2tpTunnelStatsControlOutOfSeq,
                            this.l2tpTunnelStatsControlOutOfWin,
                            this.l2tpTunnelStatsControlTxPkts,
                            this.l2tpTunnelStatsControlTxZLB,
                            this.l2tpTunnelStatsControlAckTO,
                            this.l2tpTunnelStatsCurrentRemoteRWS,
                            this.l2tpTunnelStatsTxSeq,
                            this.l2tpTunnelStatsTxSeqAck,
                            this.l2tpTunnelStatsRxSeq,
                            this.l2tpTunnelStatsRxSeqAck,
                            this.l2tpTunnelStatsTotalSessions,
                            this.l2tpTunnelStatsFailedSessions,
                            this.l2tpTunnelStatsActiveSessions,
                            this.l2tpTunnelStatsLastResultCode,
                            this.l2tpTunnelStatsLastErrorCode,
                            this.l2tpTunnelStatsLastErrorMessage,
                            this.l2tpTunnelStatsDrainingTunnel
                        };
                    }
                    public static final class L2tpTunnelStatsLocalTIDEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsLocalTIDEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsLocalTID", "1.3.6.1.2.1.10.95.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsRemoteTIDEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsRemoteTIDEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsRemoteTID", "1.3.6.1.2.1.10.95.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsStateEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsStateEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsState", "1.3.6.1.2.1.10.95.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsInitiatedEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsInitiatedEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsInitiated", "1.3.6.1.2.1.10.95.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsRemoteHostNameEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsRemoteHostNameEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsRemoteHostName", "1.3.6.1.2.1.10.95.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsRemoteVendorNameEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsRemoteVendorNameEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsRemoteVendorName", "1.3.6.1.2.1.10.95.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsRemoteFirmwareRevEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsRemoteFirmwareRevEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsRemoteFirmwareRev", "1.3.6.1.2.1.10.95.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsRemoteProtocolVerEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsRemoteProtocolVerEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsRemoteProtocolVer", "1.3.6.1.2.1.10.95.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsInitialRemoteRWSEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsInitialRemoteRWSEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsInitialRemoteRWS", "1.3.6.1.2.1.10.95.1.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsBearerCapsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsBearerCapsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsBearerCaps", "1.3.6.1.2.1.10.95.1.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsFramingCapsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsFramingCapsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsFramingCaps", "1.3.6.1.2.1.10.95.1.5.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsControlRxPktsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsControlRxPktsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsControlRxPkts", "1.3.6.1.2.1.10.95.1.5.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsControlRxZLBEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsControlRxZLBEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsControlRxZLB", "1.3.6.1.2.1.10.95.1.5.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsControlOutOfSeqEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsControlOutOfSeqEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsControlOutOfSeq", "1.3.6.1.2.1.10.95.1.5.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsControlOutOfWinEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsControlOutOfWinEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsControlOutOfWin", "1.3.6.1.2.1.10.95.1.5.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsControlTxPktsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsControlTxPktsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsControlTxPkts", "1.3.6.1.2.1.10.95.1.5.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsControlTxZLBEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsControlTxZLBEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsControlTxZLB", "1.3.6.1.2.1.10.95.1.5.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsControlAckTOEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsControlAckTOEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsControlAckTO", "1.3.6.1.2.1.10.95.1.5.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsCurrentRemoteRWSEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsCurrentRemoteRWSEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsCurrentRemoteRWS", "1.3.6.1.2.1.10.95.1.5.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsTxSeqEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsTxSeqEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsTxSeq", "1.3.6.1.2.1.10.95.1.5.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsTxSeqAckEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsTxSeqAckEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsTxSeqAck", "1.3.6.1.2.1.10.95.1.5.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsRxSeqEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsRxSeqEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsRxSeq", "1.3.6.1.2.1.10.95.1.5.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsRxSeqAckEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsRxSeqAckEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsRxSeqAck", "1.3.6.1.2.1.10.95.1.5.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsTotalSessionsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsTotalSessionsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsTotalSessions", "1.3.6.1.2.1.10.95.1.5.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsFailedSessionsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsFailedSessionsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsFailedSessions", "1.3.6.1.2.1.10.95.1.5.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsActiveSessionsEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsActiveSessionsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsActiveSessions", "1.3.6.1.2.1.10.95.1.5.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsLastResultCodeEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsLastResultCodeEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsLastResultCode", "1.3.6.1.2.1.10.95.1.5.1.27", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsLastErrorCodeEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsLastErrorCodeEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsLastErrorCode", "1.3.6.1.2.1.10.95.1.5.1.28", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsLastErrorMessageEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsLastErrorMessageEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsLastErrorMessage", "1.3.6.1.2.1.10.95.1.5.1.29", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelStatsDrainingTunnelEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelStatsDrainingTunnelEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelStatsDrainingTunnel", "1.3.6.1.2.1.10.95.1.5.1.30", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class L2tpSessionStatsTableEnt extends MIBEntry<L2TPMIBDef>
            {
                public final L2tpSessionStatsEntryEnt l2tpSessionStatsEntry;

                private L2tpSessionStatsTableEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                {
                    super(mib, parent, "l2tpSessionStatsTable", "1.3.6.1.2.1.10.95.1.7", false, true, false, false);
                    this.l2tpSessionStatsEntry = new L2tpSessionStatsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.l2tpSessionStatsEntry
                    };
                }
                public static final class L2tpSessionStatsEntryEnt extends MIBEntry<L2TPMIBDef>
                {
                    public final L2tpSessionStatsTunnelIfIndexEnt l2tpSessionStatsTunnelIfIndex;

                    public final L2tpSessionStatsIfIndexEnt l2tpSessionStatsIfIndex;

                    public final L2tpSessionStatsLocalSIDEnt l2tpSessionStatsLocalSID;

                    public final L2tpSessionStatsRemoteSIDEnt l2tpSessionStatsRemoteSID;

                    public final L2tpSessionStatsUserNameEnt l2tpSessionStatsUserName;

                    public final L2tpSessionStatsStateEnt l2tpSessionStatsState;

                    public final L2tpSessionStatsCallTypeEnt l2tpSessionStatsCallType;

                    public final L2tpSessionStatsCallSerialNumberEnt l2tpSessionStatsCallSerialNumber;

                    public final L2tpSessionStatsTxConnectSpeedEnt l2tpSessionStatsTxConnectSpeed;

                    public final L2tpSessionStatsRxConnectSpeedEnt l2tpSessionStatsRxConnectSpeed;

                    public final L2tpSessionStatsCallBearerTypeEnt l2tpSessionStatsCallBearerType;

                    public final L2tpSessionStatsFramingTypeEnt l2tpSessionStatsFramingType;

                    public final L2tpSessionStatsPhysChanIdEnt l2tpSessionStatsPhysChanId;

                    public final L2tpSessionStatsDNISEnt l2tpSessionStatsDNIS;

                    public final L2tpSessionStatsCLIDEnt l2tpSessionStatsCLID;

                    public final L2tpSessionStatsSubAddressEnt l2tpSessionStatsSubAddress;

                    public final L2tpSessionStatsPrivateGroupIDEnt l2tpSessionStatsPrivateGroupID;

                    public final L2tpSessionStatsProxyLcpEnt l2tpSessionStatsProxyLcp;

                    public final L2tpSessionStatsAuthMethodEnt l2tpSessionStatsAuthMethod;

                    public final L2tpSessionStatsSequencingStateEnt l2tpSessionStatsSequencingState;

                    public final L2tpSessionStatsOutSequenceEnt l2tpSessionStatsOutSequence;

                    public final L2tpSessionStatsReassemblyTOEnt l2tpSessionStatsReassemblyTO;

                    public final L2tpSessionStatsTxSeqEnt l2tpSessionStatsTxSeq;

                    public final L2tpSessionStatsRxSeqEnt l2tpSessionStatsRxSeq;

                    private L2tpSessionStatsEntryEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpSessionStatsEntry", "1.3.6.1.2.1.10.95.1.7.1", false, false, false, true);
                        this.l2tpSessionStatsTunnelIfIndex = new L2tpSessionStatsTunnelIfIndexEnt(mib, this);
                        this.l2tpSessionStatsIfIndex = new L2tpSessionStatsIfIndexEnt(mib, this);
                        this.l2tpSessionStatsLocalSID = new L2tpSessionStatsLocalSIDEnt(mib, this);
                        this.l2tpSessionStatsRemoteSID = new L2tpSessionStatsRemoteSIDEnt(mib, this);
                        this.l2tpSessionStatsUserName = new L2tpSessionStatsUserNameEnt(mib, this);
                        this.l2tpSessionStatsState = new L2tpSessionStatsStateEnt(mib, this);
                        this.l2tpSessionStatsCallType = new L2tpSessionStatsCallTypeEnt(mib, this);
                        this.l2tpSessionStatsCallSerialNumber = new L2tpSessionStatsCallSerialNumberEnt(mib, this);
                        this.l2tpSessionStatsTxConnectSpeed = new L2tpSessionStatsTxConnectSpeedEnt(mib, this);
                        this.l2tpSessionStatsRxConnectSpeed = new L2tpSessionStatsRxConnectSpeedEnt(mib, this);
                        this.l2tpSessionStatsCallBearerType = new L2tpSessionStatsCallBearerTypeEnt(mib, this);
                        this.l2tpSessionStatsFramingType = new L2tpSessionStatsFramingTypeEnt(mib, this);
                        this.l2tpSessionStatsPhysChanId = new L2tpSessionStatsPhysChanIdEnt(mib, this);
                        this.l2tpSessionStatsDNIS = new L2tpSessionStatsDNISEnt(mib, this);
                        this.l2tpSessionStatsCLID = new L2tpSessionStatsCLIDEnt(mib, this);
                        this.l2tpSessionStatsSubAddress = new L2tpSessionStatsSubAddressEnt(mib, this);
                        this.l2tpSessionStatsPrivateGroupID = new L2tpSessionStatsPrivateGroupIDEnt(mib, this);
                        this.l2tpSessionStatsProxyLcp = new L2tpSessionStatsProxyLcpEnt(mib, this);
                        this.l2tpSessionStatsAuthMethod = new L2tpSessionStatsAuthMethodEnt(mib, this);
                        this.l2tpSessionStatsSequencingState = new L2tpSessionStatsSequencingStateEnt(mib, this);
                        this.l2tpSessionStatsOutSequence = new L2tpSessionStatsOutSequenceEnt(mib, this);
                        this.l2tpSessionStatsReassemblyTO = new L2tpSessionStatsReassemblyTOEnt(mib, this);
                        this.l2tpSessionStatsTxSeq = new L2tpSessionStatsTxSeqEnt(mib, this);
                        this.l2tpSessionStatsRxSeq = new L2tpSessionStatsRxSeqEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.l2tpSessionStatsTunnelIfIndex,
                            this.l2tpSessionStatsIfIndex,
                            this.l2tpSessionStatsLocalSID,
                            this.l2tpSessionStatsRemoteSID,
                            this.l2tpSessionStatsUserName,
                            this.l2tpSessionStatsState,
                            this.l2tpSessionStatsCallType,
                            this.l2tpSessionStatsCallSerialNumber,
                            this.l2tpSessionStatsTxConnectSpeed,
                            this.l2tpSessionStatsRxConnectSpeed,
                            this.l2tpSessionStatsCallBearerType,
                            this.l2tpSessionStatsFramingType,
                            this.l2tpSessionStatsPhysChanId,
                            this.l2tpSessionStatsDNIS,
                            this.l2tpSessionStatsCLID,
                            this.l2tpSessionStatsSubAddress,
                            this.l2tpSessionStatsPrivateGroupID,
                            this.l2tpSessionStatsProxyLcp,
                            this.l2tpSessionStatsAuthMethod,
                            this.l2tpSessionStatsSequencingState,
                            this.l2tpSessionStatsOutSequence,
                            this.l2tpSessionStatsReassemblyTO,
                            this.l2tpSessionStatsTxSeq,
                            this.l2tpSessionStatsRxSeq
                        };
                    }
                    public static final class L2tpSessionStatsTunnelIfIndexEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsTunnelIfIndexEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsTunnelIfIndex", "1.3.6.1.2.1.10.95.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsIfIndexEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsIfIndexEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsIfIndex", "1.3.6.1.2.1.10.95.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsLocalSIDEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsLocalSIDEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsLocalSID", "1.3.6.1.2.1.10.95.1.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsRemoteSIDEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsRemoteSIDEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsRemoteSID", "1.3.6.1.2.1.10.95.1.7.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsUserNameEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsUserNameEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsUserName", "1.3.6.1.2.1.10.95.1.7.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsStateEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsStateEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsState", "1.3.6.1.2.1.10.95.1.7.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsCallTypeEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsCallTypeEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsCallType", "1.3.6.1.2.1.10.95.1.7.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsCallSerialNumberEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsCallSerialNumberEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsCallSerialNumber", "1.3.6.1.2.1.10.95.1.7.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsTxConnectSpeedEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsTxConnectSpeedEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsTxConnectSpeed", "1.3.6.1.2.1.10.95.1.7.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsRxConnectSpeedEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsRxConnectSpeedEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsRxConnectSpeed", "1.3.6.1.2.1.10.95.1.7.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsCallBearerTypeEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsCallBearerTypeEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsCallBearerType", "1.3.6.1.2.1.10.95.1.7.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsFramingTypeEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsFramingTypeEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsFramingType", "1.3.6.1.2.1.10.95.1.7.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsPhysChanIdEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsPhysChanIdEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsPhysChanId", "1.3.6.1.2.1.10.95.1.7.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsDNISEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsDNISEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsDNIS", "1.3.6.1.2.1.10.95.1.7.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsCLIDEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsCLIDEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsCLID", "1.3.6.1.2.1.10.95.1.7.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsSubAddressEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsSubAddressEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsSubAddress", "1.3.6.1.2.1.10.95.1.7.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsPrivateGroupIDEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsPrivateGroupIDEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsPrivateGroupID", "1.3.6.1.2.1.10.95.1.7.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsProxyLcpEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsProxyLcpEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsProxyLcp", "1.3.6.1.2.1.10.95.1.7.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsAuthMethodEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsAuthMethodEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsAuthMethod", "1.3.6.1.2.1.10.95.1.7.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsSequencingStateEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsSequencingStateEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsSequencingState", "1.3.6.1.2.1.10.95.1.7.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsOutSequenceEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsOutSequenceEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsOutSequence", "1.3.6.1.2.1.10.95.1.7.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsReassemblyTOEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsReassemblyTOEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsReassemblyTO", "1.3.6.1.2.1.10.95.1.7.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsTxSeqEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsTxSeqEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsTxSeq", "1.3.6.1.2.1.10.95.1.7.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionStatsRxSeqEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionStatsRxSeqEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionStatsRxSeq", "1.3.6.1.2.1.10.95.1.7.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class L2tpTunnelMapTableEnt extends MIBEntry<L2TPMIBDef>
            {
                public final L2tpTunnelMapEntryEnt l2tpTunnelMapEntry;

                private L2tpTunnelMapTableEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                {
                    super(mib, parent, "l2tpTunnelMapTable", "1.3.6.1.2.1.10.95.1.8", false, true, false, false);
                    this.l2tpTunnelMapEntry = new L2tpTunnelMapEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.l2tpTunnelMapEntry
                    };
                }
                public static final class L2tpTunnelMapEntryEnt extends MIBEntry<L2TPMIBDef>
                {
                    public final L2tpTunnelMapLocalTIDEnt l2tpTunnelMapLocalTID;

                    public final L2tpTunnelMapIfIndexEnt l2tpTunnelMapIfIndex;

                    private L2tpTunnelMapEntryEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpTunnelMapEntry", "1.3.6.1.2.1.10.95.1.8.1", false, false, false, true);
                        this.l2tpTunnelMapLocalTID = new L2tpTunnelMapLocalTIDEnt(mib, this);
                        this.l2tpTunnelMapIfIndex = new L2tpTunnelMapIfIndexEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.l2tpTunnelMapLocalTID,
                            this.l2tpTunnelMapIfIndex
                        };
                    }
                    public static final class L2tpTunnelMapLocalTIDEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelMapLocalTIDEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelMapLocalTID", "1.3.6.1.2.1.10.95.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpTunnelMapIfIndexEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpTunnelMapIfIndexEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpTunnelMapIfIndex", "1.3.6.1.2.1.10.95.1.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class L2tpSessionMapTableEnt extends MIBEntry<L2TPMIBDef>
            {
                public final L2tpSessionMapEntryEnt l2tpSessionMapEntry;

                private L2tpSessionMapTableEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                {
                    super(mib, parent, "l2tpSessionMapTable", "1.3.6.1.2.1.10.95.1.9", false, true, false, false);
                    this.l2tpSessionMapEntry = new L2tpSessionMapEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.l2tpSessionMapEntry
                    };
                }
                public static final class L2tpSessionMapEntryEnt extends MIBEntry<L2TPMIBDef>
                {
                    public final L2tpSessionMapIfIndexEnt l2tpSessionMapIfIndex;

                    public final L2tpSessionMapTunnelIfIndexEnt l2tpSessionMapTunnelIfIndex;

                    public final L2tpSessionMapLocalSIDEnt l2tpSessionMapLocalSID;

                    public final L2tpSessionMapStatusEnt l2tpSessionMapStatus;

                    private L2tpSessionMapEntryEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpSessionMapEntry", "1.3.6.1.2.1.10.95.1.9.1", false, false, false, true);
                        this.l2tpSessionMapIfIndex = new L2tpSessionMapIfIndexEnt(mib, this);
                        this.l2tpSessionMapTunnelIfIndex = new L2tpSessionMapTunnelIfIndexEnt(mib, this);
                        this.l2tpSessionMapLocalSID = new L2tpSessionMapLocalSIDEnt(mib, this);
                        this.l2tpSessionMapStatus = new L2tpSessionMapStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.l2tpSessionMapIfIndex,
                            this.l2tpSessionMapTunnelIfIndex,
                            this.l2tpSessionMapLocalSID,
                            this.l2tpSessionMapStatus
                        };
                    }
                    public static final class L2tpSessionMapIfIndexEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionMapIfIndexEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionMapIfIndex", "1.3.6.1.2.1.10.95.1.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionMapTunnelIfIndexEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionMapTunnelIfIndexEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionMapTunnelIfIndex", "1.3.6.1.2.1.10.95.1.9.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionMapLocalSIDEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionMapLocalSIDEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionMapLocalSID", "1.3.6.1.2.1.10.95.1.9.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class L2tpSessionMapStatusEnt extends MIBEntry<L2TPMIBDef>
                    {
                        private L2tpSessionMapStatusEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpSessionMapStatus", "1.3.6.1.2.1.10.95.1.9.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class L2tpTransportsEnt extends MIBEntry<L2TPMIBDef>
        {
            /** Definitions of significant branches under l2tpTransportsNote that future transports of L2TP (e.g.: Frame relay)should create their own branch under l2tpTransports.*/
            public final L2tpTransportIpUdpEnt l2tpTransportIpUdp;

            private L2tpTransportsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
            {
                super(mib, parent, "l2tpTransports", "1.3.6.1.2.1.10.95.3", false, false, false, false);
                this.l2tpTransportIpUdp = new L2tpTransportIpUdpEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.l2tpTransportIpUdp
                };
            }
            public static final class L2tpTransportIpUdpEnt extends MIBEntry<L2TPMIBDef>
            {
                public final L2tpIpUdpObjectsEnt l2tpIpUdpObjects;

                public final L2tpIpUdpTrapsEnt l2tpIpUdpTraps;

                private L2tpTransportIpUdpEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                {
                    super(mib, parent, "l2tpTransportIpUdp", "1.3.6.1.2.1.10.95.3.1", false, false, false, false);
                    this.l2tpIpUdpObjects = new L2tpIpUdpObjectsEnt(mib, this);
                    this.l2tpIpUdpTraps = new L2tpIpUdpTrapsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.l2tpIpUdpObjects,
                        this.l2tpIpUdpTraps
                    };
                }
                public static final class L2tpIpUdpObjectsEnt extends MIBEntry<L2TPMIBDef>
                {
                    /** { l2tpIpUdpObjects 1 } reserved for future use


The L2TP UDP/IP Transport Status and Statistics Table*/
                    public final L2tpUdpStatsTableEnt l2tpUdpStatsTable;

                    private L2tpIpUdpObjectsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpIpUdpObjects", "1.3.6.1.2.1.10.95.3.1.1", false, false, false, false);
                        this.l2tpUdpStatsTable = new L2tpUdpStatsTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.l2tpUdpStatsTable
                        };
                    }
                    public static final class L2tpUdpStatsTableEnt extends MIBEntry<L2TPMIBDef>
                    {
                        public final L2tpUdpStatsEntryEnt l2tpUdpStatsEntry;

                        private L2tpUdpStatsTableEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                        {
                            super(mib, parent, "l2tpUdpStatsTable", "1.3.6.1.2.1.10.95.3.1.1.2", false, true, false, false);
                            this.l2tpUdpStatsEntry = new L2tpUdpStatsEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.l2tpUdpStatsEntry
                            };
                        }
                        public static final class L2tpUdpStatsEntryEnt extends MIBEntry<L2TPMIBDef>
                        {
                            public final L2tpUdpStatsIfIndexEnt l2tpUdpStatsIfIndex;

                            public final L2tpUdpStatsPeerPortEnt l2tpUdpStatsPeerPort;

                            public final L2tpUdpStatsLocalPortEnt l2tpUdpStatsLocalPort;

                            private L2tpUdpStatsEntryEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                            {
                                super(mib, parent, "l2tpUdpStatsEntry", "1.3.6.1.2.1.10.95.3.1.1.2.1", false, false, false, true);
                                this.l2tpUdpStatsIfIndex = new L2tpUdpStatsIfIndexEnt(mib, this);
                                this.l2tpUdpStatsPeerPort = new L2tpUdpStatsPeerPortEnt(mib, this);
                                this.l2tpUdpStatsLocalPort = new L2tpUdpStatsLocalPortEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.l2tpUdpStatsIfIndex,
                                    this.l2tpUdpStatsPeerPort,
                                    this.l2tpUdpStatsLocalPort
                                };
                            }
                            public static final class L2tpUdpStatsIfIndexEnt extends MIBEntry<L2TPMIBDef>
                            {
                                private L2tpUdpStatsIfIndexEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                                {
                                    super(mib, parent, "l2tpUdpStatsIfIndex", "1.3.6.1.2.1.10.95.3.1.1.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class L2tpUdpStatsPeerPortEnt extends MIBEntry<L2TPMIBDef>
                            {
                                private L2tpUdpStatsPeerPortEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                                {
                                    super(mib, parent, "l2tpUdpStatsPeerPort", "1.3.6.1.2.1.10.95.3.1.1.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class L2tpUdpStatsLocalPortEnt extends MIBEntry<L2TPMIBDef>
                            {
                                private L2tpUdpStatsLocalPortEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                                {
                                    super(mib, parent, "l2tpUdpStatsLocalPort", "1.3.6.1.2.1.10.95.3.1.1.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class L2tpIpUdpTrapsEnt extends MIBEntry<L2TPMIBDef>
                {
                    private L2tpIpUdpTrapsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpIpUdpTraps", "1.3.6.1.2.1.10.95.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class L2tpConformanceEnt extends MIBEntry<L2TPMIBDef>
        {
            /** conformance information*/
            public final L2tpGroupsEnt l2tpGroups;

            public final L2tpCompliancesEnt l2tpCompliances;

            private L2tpConformanceEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
            {
                super(mib, parent, "l2tpConformance", "1.3.6.1.2.1.10.95.4", false, false, false, false);
                this.l2tpGroups = new L2tpGroupsEnt(mib, this);
                this.l2tpCompliances = new L2tpCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.l2tpGroups,
                    this.l2tpCompliances
                };
            }
            public static final class L2tpGroupsEnt extends MIBEntry<L2TPMIBDef>
            {
                /** units of conformance*/
                public final L2tpConfigGroupEnt l2tpConfigGroup;

                public final L2tpStatsGroupEnt l2tpStatsGroup;

                public final L2tpIpUdpGroupEnt l2tpIpUdpGroup;

                public final L2tpDomainGroupEnt l2tpDomainGroup;

                public final L2tpMappingGroupEnt l2tpMappingGroup;

                public final L2tpSecurityGroupEnt l2tpSecurityGroup;

                public final L2tpTrapGroupEnt l2tpTrapGroup;

                public final L2tpHCPacketGroupEnt l2tpHCPacketGroup;

                private L2tpGroupsEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                {
                    super(mib, parent, "l2tpGroups", "1.3.6.1.2.1.10.95.4.1", false, false, false, false);
                    this.l2tpConfigGroup = new L2tpConfigGroupEnt(mib, this);
                    this.l2tpStatsGroup = new L2tpStatsGroupEnt(mib, this);
                    this.l2tpIpUdpGroup = new L2tpIpUdpGroupEnt(mib, this);
                    this.l2tpDomainGroup = new L2tpDomainGroupEnt(mib, this);
                    this.l2tpMappingGroup = new L2tpMappingGroupEnt(mib, this);
                    this.l2tpSecurityGroup = new L2tpSecurityGroupEnt(mib, this);
                    this.l2tpTrapGroup = new L2tpTrapGroupEnt(mib, this);
                    this.l2tpHCPacketGroup = new L2tpHCPacketGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.l2tpConfigGroup,
                        this.l2tpStatsGroup,
                        this.l2tpIpUdpGroup,
                        this.l2tpDomainGroup,
                        this.l2tpMappingGroup,
                        this.l2tpSecurityGroup,
                        this.l2tpTrapGroup,
                        this.l2tpHCPacketGroup
                    };
                }
                public static final class L2tpConfigGroupEnt extends MIBEntry<L2TPMIBDef>
                {
                    private L2tpConfigGroupEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpConfigGroup", "1.3.6.1.2.1.10.95.4.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class L2tpStatsGroupEnt extends MIBEntry<L2TPMIBDef>
                {
                    private L2tpStatsGroupEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpStatsGroup", "1.3.6.1.2.1.10.95.4.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class L2tpIpUdpGroupEnt extends MIBEntry<L2TPMIBDef>
                {
                    private L2tpIpUdpGroupEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpIpUdpGroup", "1.3.6.1.2.1.10.95.4.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class L2tpDomainGroupEnt extends MIBEntry<L2TPMIBDef>
                {
                    private L2tpDomainGroupEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpDomainGroup", "1.3.6.1.2.1.10.95.4.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class L2tpMappingGroupEnt extends MIBEntry<L2TPMIBDef>
                {
                    private L2tpMappingGroupEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpMappingGroup", "1.3.6.1.2.1.10.95.4.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class L2tpSecurityGroupEnt extends MIBEntry<L2TPMIBDef>
                {
                    private L2tpSecurityGroupEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpSecurityGroup", "1.3.6.1.2.1.10.95.4.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class L2tpTrapGroupEnt extends MIBEntry<L2TPMIBDef>
                {
                    private L2tpTrapGroupEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpTrapGroup", "1.3.6.1.2.1.10.95.4.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class L2tpHCPacketGroupEnt extends MIBEntry<L2TPMIBDef>
                {
                    private L2tpHCPacketGroupEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpHCPacketGroup", "1.3.6.1.2.1.10.95.4.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class L2tpCompliancesEnt extends MIBEntry<L2TPMIBDef>
            {
                /** compliance statements*/
                public final L2tpMIBFullComplianceEnt l2tpMIBFullCompliance;

                public final L2tpMIBReadOnlyComplianceEnt l2tpMIBReadOnlyCompliance;

                private L2tpCompliancesEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                {
                    super(mib, parent, "l2tpCompliances", "1.3.6.1.2.1.10.95.4.2", false, false, false, false);
                    this.l2tpMIBFullCompliance = new L2tpMIBFullComplianceEnt(mib, this);
                    this.l2tpMIBReadOnlyCompliance = new L2tpMIBReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.l2tpMIBFullCompliance,
                        this.l2tpMIBReadOnlyCompliance
                    };
                }
                public static final class L2tpMIBFullComplianceEnt extends MIBEntry<L2TPMIBDef>
                {
                    private L2tpMIBFullComplianceEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpMIBFullCompliance", "1.3.6.1.2.1.10.95.4.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class L2tpMIBReadOnlyComplianceEnt extends MIBEntry<L2TPMIBDef>
                {
                    private L2tpMIBReadOnlyComplianceEnt(L2TPMIBDef mib, MIBEntry<L2TPMIBDef> parent)
                    {
                        super(mib, parent, "l2tpMIBReadOnlyCompliance", "1.3.6.1.2.1.10.95.4.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
