package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**From RFC 2021
From RFC 2856
From RFC 2863
From RFC 3411
From RFC 4001
From RFC 4044
From RFC 4133*/
public final class IFCPMGMTMIBDef extends MIB
{
    public static final IFCPMGMTMIBDef IFCPMGMTMIB = new IFCPMGMTMIBDef();

    static { MIBs.getInstance().registerMIB(IFCPMGMTMIBDef.IFCPMGMTMIB); }

    public final IfcpMgmtMIBEnt ifcpMgmtMIB;

    private IFCPMGMTMIBDef()
    {
        super("IFCP-MGMT-MIB");
        this.ifcpMgmtMIB = new IfcpMgmtMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ifcpMgmtMIB
        };
    }

    public static final class IfcpMgmtMIBEnt extends MIBEntry<IFCPMGMTMIBDef>
    {
        /** Internet Fibre Channel Protocol (iFCP)*/
        public final IfcpGatewayObjectsEnt ifcpGatewayObjects;

        public final IfcpGatewayConformanceEnt ifcpGatewayConformance;

        private IfcpMgmtMIBEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
        {
            super(mib, parent, "ifcpMgmtMIB", "1.3.6.1.2.1.10.230", false, false, false, false);
            this.ifcpGatewayObjects = new IfcpGatewayObjectsEnt(mib, this);
            this.ifcpGatewayConformance = new IfcpGatewayConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ifcpGatewayObjects,
                this.ifcpGatewayConformance
            };
        }
        public static final class IfcpGatewayObjectsEnt extends MIBEntry<IFCPMGMTMIBDef>
        {
            /** Local iFCP Gateway Instance Information ==================*/
            public final IfcpLclGatewayInfoEnt ifcpLclGatewayInfo;

            /** iFCP N Port Session Information ============================*/
            public final IfcpNportSessionInfoEnt ifcpNportSessionInfo;

            private IfcpGatewayObjectsEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
            {
                super(mib, parent, "ifcpGatewayObjects", "1.3.6.1.2.1.10.230.1", false, false, false, false);
                this.ifcpLclGatewayInfo = new IfcpLclGatewayInfoEnt(mib, this);
                this.ifcpNportSessionInfo = new IfcpNportSessionInfoEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ifcpLclGatewayInfo,
                    this.ifcpNportSessionInfo
                };
            }
            public static final class IfcpLclGatewayInfoEnt extends MIBEntry<IFCPMGMTMIBDef>
            {
                public final IfcpLclGtwyInstTableEnt ifcpLclGtwyInstTable;

                private IfcpLclGatewayInfoEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                {
                    super(mib, parent, "ifcpLclGatewayInfo", "1.3.6.1.2.1.10.230.1.1", false, false, false, false);
                    this.ifcpLclGtwyInstTable = new IfcpLclGtwyInstTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifcpLclGtwyInstTable
                    };
                }
                public static final class IfcpLclGtwyInstTableEnt extends MIBEntry<IFCPMGMTMIBDef>
                {
                    public final IfcpLclGtwyInstEntryEnt ifcpLclGtwyInstEntry;

                    private IfcpLclGtwyInstTableEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "ifcpLclGtwyInstTable", "1.3.6.1.2.1.10.230.1.1.1", false, true, false, false);
                        this.ifcpLclGtwyInstEntry = new IfcpLclGtwyInstEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ifcpLclGtwyInstEntry
                        };
                    }
                    public static final class IfcpLclGtwyInstEntryEnt extends MIBEntry<IFCPMGMTMIBDef>
                    {
                        public final IfcpLclGtwyInstIndexEnt ifcpLclGtwyInstIndex;

                        public final IfcpLclGtwyInstPhyIndexEnt ifcpLclGtwyInstPhyIndex;

                        public final IfcpLclGtwyInstVersionMinEnt ifcpLclGtwyInstVersionMin;

                        public final IfcpLclGtwyInstVersionMaxEnt ifcpLclGtwyInstVersionMax;

                        public final IfcpLclGtwyInstAddrTransModeEnt ifcpLclGtwyInstAddrTransMode;

                        public final IfcpLclGtwyInstFcBrdcstSupportEnt ifcpLclGtwyInstFcBrdcstSupport;

                        public final IfcpLclGtwyInstDefaultIpTOVEnt ifcpLclGtwyInstDefaultIpTOV;

                        public final IfcpLclGtwyInstDefaultLTIntervalEnt ifcpLclGtwyInstDefaultLTInterval;

                        public final IfcpLclGtwyInstDescrEnt ifcpLclGtwyInstDescr;

                        public final IfcpLclGtwyInstNumActiveSessionsEnt ifcpLclGtwyInstNumActiveSessions;

                        public final IfcpLclGtwyInstStorageTypeEnt ifcpLclGtwyInstStorageType;

                        private IfcpLclGtwyInstEntryEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                        {
                            super(mib, parent, "ifcpLclGtwyInstEntry", "1.3.6.1.2.1.10.230.1.1.1.1", false, false, false, true);
                            this.ifcpLclGtwyInstIndex = new IfcpLclGtwyInstIndexEnt(mib, this);
                            this.ifcpLclGtwyInstPhyIndex = new IfcpLclGtwyInstPhyIndexEnt(mib, this);
                            this.ifcpLclGtwyInstVersionMin = new IfcpLclGtwyInstVersionMinEnt(mib, this);
                            this.ifcpLclGtwyInstVersionMax = new IfcpLclGtwyInstVersionMaxEnt(mib, this);
                            this.ifcpLclGtwyInstAddrTransMode = new IfcpLclGtwyInstAddrTransModeEnt(mib, this);
                            this.ifcpLclGtwyInstFcBrdcstSupport = new IfcpLclGtwyInstFcBrdcstSupportEnt(mib, this);
                            this.ifcpLclGtwyInstDefaultIpTOV = new IfcpLclGtwyInstDefaultIpTOVEnt(mib, this);
                            this.ifcpLclGtwyInstDefaultLTInterval = new IfcpLclGtwyInstDefaultLTIntervalEnt(mib, this);
                            this.ifcpLclGtwyInstDescr = new IfcpLclGtwyInstDescrEnt(mib, this);
                            this.ifcpLclGtwyInstNumActiveSessions = new IfcpLclGtwyInstNumActiveSessionsEnt(mib, this);
                            this.ifcpLclGtwyInstStorageType = new IfcpLclGtwyInstStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ifcpLclGtwyInstIndex,
                                this.ifcpLclGtwyInstPhyIndex,
                                this.ifcpLclGtwyInstVersionMin,
                                this.ifcpLclGtwyInstVersionMax,
                                this.ifcpLclGtwyInstAddrTransMode,
                                this.ifcpLclGtwyInstFcBrdcstSupport,
                                this.ifcpLclGtwyInstDefaultIpTOV,
                                this.ifcpLclGtwyInstDefaultLTInterval,
                                this.ifcpLclGtwyInstDescr,
                                this.ifcpLclGtwyInstNumActiveSessions,
                                this.ifcpLclGtwyInstStorageType
                            };
                        }
                        public static final class IfcpLclGtwyInstIndexEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpLclGtwyInstIndexEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpLclGtwyInstIndex", "1.3.6.1.2.1.10.230.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpLclGtwyInstPhyIndexEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpLclGtwyInstPhyIndexEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpLclGtwyInstPhyIndex", "1.3.6.1.2.1.10.230.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpLclGtwyInstVersionMinEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpLclGtwyInstVersionMinEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpLclGtwyInstVersionMin", "1.3.6.1.2.1.10.230.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpLclGtwyInstVersionMaxEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpLclGtwyInstVersionMaxEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpLclGtwyInstVersionMax", "1.3.6.1.2.1.10.230.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpLclGtwyInstAddrTransModeEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpLclGtwyInstAddrTransModeEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpLclGtwyInstAddrTransMode", "1.3.6.1.2.1.10.230.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpLclGtwyInstFcBrdcstSupportEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpLclGtwyInstFcBrdcstSupportEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpLclGtwyInstFcBrdcstSupport", "1.3.6.1.2.1.10.230.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpLclGtwyInstDefaultIpTOVEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpLclGtwyInstDefaultIpTOVEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpLclGtwyInstDefaultIpTOV", "1.3.6.1.2.1.10.230.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpLclGtwyInstDefaultLTIntervalEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpLclGtwyInstDefaultLTIntervalEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpLclGtwyInstDefaultLTInterval", "1.3.6.1.2.1.10.230.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpLclGtwyInstDescrEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpLclGtwyInstDescrEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpLclGtwyInstDescr", "1.3.6.1.2.1.10.230.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpLclGtwyInstNumActiveSessionsEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpLclGtwyInstNumActiveSessionsEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpLclGtwyInstNumActiveSessions", "1.3.6.1.2.1.10.230.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpLclGtwyInstStorageTypeEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpLclGtwyInstStorageTypeEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpLclGtwyInstStorageType", "1.3.6.1.2.1.10.230.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IfcpNportSessionInfoEnt extends MIBEntry<IFCPMGMTMIBDef>
            {
                public final IfcpSessionAttributesTableEnt ifcpSessionAttributesTable;

                /** Local iFCP Gateway Instance Session Statistics =============*/
                public final IfcpSessionStatsTableEnt ifcpSessionStatsTable;

                /** Low Capacity Statistics*/
                public final IfcpSessionLcStatsTableEnt ifcpSessionLcStatsTable;

                private IfcpNportSessionInfoEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                {
                    super(mib, parent, "ifcpNportSessionInfo", "1.3.6.1.2.1.10.230.1.2", false, false, false, false);
                    this.ifcpSessionAttributesTable = new IfcpSessionAttributesTableEnt(mib, this);
                    this.ifcpSessionStatsTable = new IfcpSessionStatsTableEnt(mib, this);
                    this.ifcpSessionLcStatsTable = new IfcpSessionLcStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifcpSessionAttributesTable,
                        this.ifcpSessionStatsTable,
                        this.ifcpSessionLcStatsTable
                    };
                }
                public static final class IfcpSessionAttributesTableEnt extends MIBEntry<IFCPMGMTMIBDef>
                {
                    public final IfcpSessionAttributesEntryEnt ifcpSessionAttributesEntry;

                    private IfcpSessionAttributesTableEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "ifcpSessionAttributesTable", "1.3.6.1.2.1.10.230.1.2.1", false, true, false, false);
                        this.ifcpSessionAttributesEntry = new IfcpSessionAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ifcpSessionAttributesEntry
                        };
                    }
                    public static final class IfcpSessionAttributesEntryEnt extends MIBEntry<IFCPMGMTMIBDef>
                    {
                        public final IfcpSessionIndexEnt ifcpSessionIndex;

                        public final IfcpSessionLclPrtlIfIndexEnt ifcpSessionLclPrtlIfIndex;

                        public final IfcpSessionLclPrtlAddrTypeEnt ifcpSessionLclPrtlAddrType;

                        public final IfcpSessionLclPrtlAddrEnt ifcpSessionLclPrtlAddr;

                        public final IfcpSessionLclPrtlTcpPortEnt ifcpSessionLclPrtlTcpPort;

                        public final IfcpSessionLclNpWwunEnt ifcpSessionLclNpWwun;

                        public final IfcpSessionLclNpFcidEnt ifcpSessionLclNpFcid;

                        public final IfcpSessionRmtNpWwunEnt ifcpSessionRmtNpWwun;

                        public final IfcpSessionRmtPrtlIfAddrTypeEnt ifcpSessionRmtPrtlIfAddrType;

                        public final IfcpSessionRmtPrtlIfAddrEnt ifcpSessionRmtPrtlIfAddr;

                        public final IfcpSessionRmtPrtlTcpPortEnt ifcpSessionRmtPrtlTcpPort;

                        public final IfcpSessionRmtNpFcidEnt ifcpSessionRmtNpFcid;

                        public final IfcpSessionRmtNpFcidAliasEnt ifcpSessionRmtNpFcidAlias;

                        public final IfcpSessionIpTOVEnt ifcpSessionIpTOV;

                        public final IfcpSessionLclLTIntvlEnt ifcpSessionLclLTIntvl;

                        public final IfcpSessionRmtLTIntvlEnt ifcpSessionRmtLTIntvl;

                        public final IfcpSessionBoundEnt ifcpSessionBound;

                        public final IfcpSessionStorageTypeEnt ifcpSessionStorageType;

                        private IfcpSessionAttributesEntryEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                        {
                            super(mib, parent, "ifcpSessionAttributesEntry", "1.3.6.1.2.1.10.230.1.2.1.1", false, false, false, true);
                            this.ifcpSessionIndex = new IfcpSessionIndexEnt(mib, this);
                            this.ifcpSessionLclPrtlIfIndex = new IfcpSessionLclPrtlIfIndexEnt(mib, this);
                            this.ifcpSessionLclPrtlAddrType = new IfcpSessionLclPrtlAddrTypeEnt(mib, this);
                            this.ifcpSessionLclPrtlAddr = new IfcpSessionLclPrtlAddrEnt(mib, this);
                            this.ifcpSessionLclPrtlTcpPort = new IfcpSessionLclPrtlTcpPortEnt(mib, this);
                            this.ifcpSessionLclNpWwun = new IfcpSessionLclNpWwunEnt(mib, this);
                            this.ifcpSessionLclNpFcid = new IfcpSessionLclNpFcidEnt(mib, this);
                            this.ifcpSessionRmtNpWwun = new IfcpSessionRmtNpWwunEnt(mib, this);
                            this.ifcpSessionRmtPrtlIfAddrType = new IfcpSessionRmtPrtlIfAddrTypeEnt(mib, this);
                            this.ifcpSessionRmtPrtlIfAddr = new IfcpSessionRmtPrtlIfAddrEnt(mib, this);
                            this.ifcpSessionRmtPrtlTcpPort = new IfcpSessionRmtPrtlTcpPortEnt(mib, this);
                            this.ifcpSessionRmtNpFcid = new IfcpSessionRmtNpFcidEnt(mib, this);
                            this.ifcpSessionRmtNpFcidAlias = new IfcpSessionRmtNpFcidAliasEnt(mib, this);
                            this.ifcpSessionIpTOV = new IfcpSessionIpTOVEnt(mib, this);
                            this.ifcpSessionLclLTIntvl = new IfcpSessionLclLTIntvlEnt(mib, this);
                            this.ifcpSessionRmtLTIntvl = new IfcpSessionRmtLTIntvlEnt(mib, this);
                            this.ifcpSessionBound = new IfcpSessionBoundEnt(mib, this);
                            this.ifcpSessionStorageType = new IfcpSessionStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ifcpSessionIndex,
                                this.ifcpSessionLclPrtlIfIndex,
                                this.ifcpSessionLclPrtlAddrType,
                                this.ifcpSessionLclPrtlAddr,
                                this.ifcpSessionLclPrtlTcpPort,
                                this.ifcpSessionLclNpWwun,
                                this.ifcpSessionLclNpFcid,
                                this.ifcpSessionRmtNpWwun,
                                this.ifcpSessionRmtPrtlIfAddrType,
                                this.ifcpSessionRmtPrtlIfAddr,
                                this.ifcpSessionRmtPrtlTcpPort,
                                this.ifcpSessionRmtNpFcid,
                                this.ifcpSessionRmtNpFcidAlias,
                                this.ifcpSessionIpTOV,
                                this.ifcpSessionLclLTIntvl,
                                this.ifcpSessionRmtLTIntvl,
                                this.ifcpSessionBound,
                                this.ifcpSessionStorageType
                            };
                        }
                        public static final class IfcpSessionIndexEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionIndexEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionIndex", "1.3.6.1.2.1.10.230.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionLclPrtlIfIndexEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionLclPrtlIfIndexEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionLclPrtlIfIndex", "1.3.6.1.2.1.10.230.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionLclPrtlAddrTypeEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionLclPrtlAddrTypeEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionLclPrtlAddrType", "1.3.6.1.2.1.10.230.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionLclPrtlAddrEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionLclPrtlAddrEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionLclPrtlAddr", "1.3.6.1.2.1.10.230.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionLclPrtlTcpPortEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionLclPrtlTcpPortEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionLclPrtlTcpPort", "1.3.6.1.2.1.10.230.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionLclNpWwunEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionLclNpWwunEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionLclNpWwun", "1.3.6.1.2.1.10.230.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionLclNpFcidEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionLclNpFcidEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionLclNpFcid", "1.3.6.1.2.1.10.230.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionRmtNpWwunEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionRmtNpWwunEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionRmtNpWwun", "1.3.6.1.2.1.10.230.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionRmtPrtlIfAddrTypeEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionRmtPrtlIfAddrTypeEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionRmtPrtlIfAddrType", "1.3.6.1.2.1.10.230.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionRmtPrtlIfAddrEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionRmtPrtlIfAddrEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionRmtPrtlIfAddr", "1.3.6.1.2.1.10.230.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionRmtPrtlTcpPortEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionRmtPrtlTcpPortEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionRmtPrtlTcpPort", "1.3.6.1.2.1.10.230.1.2.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionRmtNpFcidEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionRmtNpFcidEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionRmtNpFcid", "1.3.6.1.2.1.10.230.1.2.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionRmtNpFcidAliasEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionRmtNpFcidAliasEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionRmtNpFcidAlias", "1.3.6.1.2.1.10.230.1.2.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionIpTOVEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionIpTOVEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionIpTOV", "1.3.6.1.2.1.10.230.1.2.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionLclLTIntvlEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionLclLTIntvlEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionLclLTIntvl", "1.3.6.1.2.1.10.230.1.2.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionRmtLTIntvlEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionRmtLTIntvlEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionRmtLTIntvl", "1.3.6.1.2.1.10.230.1.2.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionBoundEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionBoundEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionBound", "1.3.6.1.2.1.10.230.1.2.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionStorageTypeEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionStorageTypeEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionStorageType", "1.3.6.1.2.1.10.230.1.2.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IfcpSessionStatsTableEnt extends MIBEntry<IFCPMGMTMIBDef>
                {
                    public final IfcpSessionStatsEntryEnt ifcpSessionStatsEntry;

                    private IfcpSessionStatsTableEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "ifcpSessionStatsTable", "1.3.6.1.2.1.10.230.1.2.2", false, true, false, false);
                        this.ifcpSessionStatsEntry = new IfcpSessionStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ifcpSessionStatsEntry
                        };
                    }
                    public static final class IfcpSessionStatsEntryEnt extends MIBEntry<IFCPMGMTMIBDef>
                    {
                        public final IfcpSessionStateEnt ifcpSessionState;

                        public final IfcpSessionDurationEnt ifcpSessionDuration;

                        public final IfcpSessionTxOctetsEnt ifcpSessionTxOctets;

                        public final IfcpSessionRxOctetsEnt ifcpSessionRxOctets;

                        public final IfcpSessionTxFramesEnt ifcpSessionTxFrames;

                        public final IfcpSessionRxFramesEnt ifcpSessionRxFrames;

                        public final IfcpSessionStaleFramesEnt ifcpSessionStaleFrames;

                        public final IfcpSessionHeaderCRCErrorsEnt ifcpSessionHeaderCRCErrors;

                        public final IfcpSessionFcPayloadCRCErrorsEnt ifcpSessionFcPayloadCRCErrors;

                        public final IfcpSessionOtherErrorsEnt ifcpSessionOtherErrors;

                        public final IfcpSessionDiscontinuityTimeEnt ifcpSessionDiscontinuityTime;

                        private IfcpSessionStatsEntryEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                        {
                            super(mib, parent, "ifcpSessionStatsEntry", "1.3.6.1.2.1.10.230.1.2.2.1", false, false, false, true);
                            this.ifcpSessionState = new IfcpSessionStateEnt(mib, this);
                            this.ifcpSessionDuration = new IfcpSessionDurationEnt(mib, this);
                            this.ifcpSessionTxOctets = new IfcpSessionTxOctetsEnt(mib, this);
                            this.ifcpSessionRxOctets = new IfcpSessionRxOctetsEnt(mib, this);
                            this.ifcpSessionTxFrames = new IfcpSessionTxFramesEnt(mib, this);
                            this.ifcpSessionRxFrames = new IfcpSessionRxFramesEnt(mib, this);
                            this.ifcpSessionStaleFrames = new IfcpSessionStaleFramesEnt(mib, this);
                            this.ifcpSessionHeaderCRCErrors = new IfcpSessionHeaderCRCErrorsEnt(mib, this);
                            this.ifcpSessionFcPayloadCRCErrors = new IfcpSessionFcPayloadCRCErrorsEnt(mib, this);
                            this.ifcpSessionOtherErrors = new IfcpSessionOtherErrorsEnt(mib, this);
                            this.ifcpSessionDiscontinuityTime = new IfcpSessionDiscontinuityTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ifcpSessionState,
                                this.ifcpSessionDuration,
                                this.ifcpSessionTxOctets,
                                this.ifcpSessionRxOctets,
                                this.ifcpSessionTxFrames,
                                this.ifcpSessionRxFrames,
                                this.ifcpSessionStaleFrames,
                                this.ifcpSessionHeaderCRCErrors,
                                this.ifcpSessionFcPayloadCRCErrors,
                                this.ifcpSessionOtherErrors,
                                this.ifcpSessionDiscontinuityTime
                            };
                        }
                        public static final class IfcpSessionStateEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionStateEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionState", "1.3.6.1.2.1.10.230.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionDurationEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionDurationEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionDuration", "1.3.6.1.2.1.10.230.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionTxOctetsEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionTxOctetsEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionTxOctets", "1.3.6.1.2.1.10.230.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionRxOctetsEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionRxOctetsEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionRxOctets", "1.3.6.1.2.1.10.230.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionTxFramesEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionTxFramesEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionTxFrames", "1.3.6.1.2.1.10.230.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionRxFramesEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionRxFramesEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionRxFrames", "1.3.6.1.2.1.10.230.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionStaleFramesEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionStaleFramesEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionStaleFrames", "1.3.6.1.2.1.10.230.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionHeaderCRCErrorsEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionHeaderCRCErrorsEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionHeaderCRCErrors", "1.3.6.1.2.1.10.230.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionFcPayloadCRCErrorsEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionFcPayloadCRCErrorsEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionFcPayloadCRCErrors", "1.3.6.1.2.1.10.230.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionOtherErrorsEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionOtherErrorsEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionOtherErrors", "1.3.6.1.2.1.10.230.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionDiscontinuityTimeEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionDiscontinuityTimeEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionDiscontinuityTime", "1.3.6.1.2.1.10.230.1.2.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IfcpSessionLcStatsTableEnt extends MIBEntry<IFCPMGMTMIBDef>
                {
                    public final IfcpSessionLcStatsEntryEnt ifcpSessionLcStatsEntry;

                    private IfcpSessionLcStatsTableEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "ifcpSessionLcStatsTable", "1.3.6.1.2.1.10.230.1.2.3", false, true, false, false);
                        this.ifcpSessionLcStatsEntry = new IfcpSessionLcStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ifcpSessionLcStatsEntry
                        };
                    }
                    public static final class IfcpSessionLcStatsEntryEnt extends MIBEntry<IFCPMGMTMIBDef>
                    {
                        public final IfcpSessionLcTxOctetsEnt ifcpSessionLcTxOctets;

                        public final IfcpSessionLcRxOctetsEnt ifcpSessionLcRxOctets;

                        public final IfcpSessionLcTxFramesEnt ifcpSessionLcTxFrames;

                        public final IfcpSessionLcRxFramesEnt ifcpSessionLcRxFrames;

                        public final IfcpSessionLcStaleFramesEnt ifcpSessionLcStaleFrames;

                        public final IfcpSessionLcHeaderCRCErrorsEnt ifcpSessionLcHeaderCRCErrors;

                        public final IfcpSessionLcFcPayloadCRCErrorsEnt ifcpSessionLcFcPayloadCRCErrors;

                        public final IfcpSessionLcOtherErrorsEnt ifcpSessionLcOtherErrors;

                        private IfcpSessionLcStatsEntryEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                        {
                            super(mib, parent, "ifcpSessionLcStatsEntry", "1.3.6.1.2.1.10.230.1.2.3.1", false, false, false, true);
                            this.ifcpSessionLcTxOctets = new IfcpSessionLcTxOctetsEnt(mib, this);
                            this.ifcpSessionLcRxOctets = new IfcpSessionLcRxOctetsEnt(mib, this);
                            this.ifcpSessionLcTxFrames = new IfcpSessionLcTxFramesEnt(mib, this);
                            this.ifcpSessionLcRxFrames = new IfcpSessionLcRxFramesEnt(mib, this);
                            this.ifcpSessionLcStaleFrames = new IfcpSessionLcStaleFramesEnt(mib, this);
                            this.ifcpSessionLcHeaderCRCErrors = new IfcpSessionLcHeaderCRCErrorsEnt(mib, this);
                            this.ifcpSessionLcFcPayloadCRCErrors = new IfcpSessionLcFcPayloadCRCErrorsEnt(mib, this);
                            this.ifcpSessionLcOtherErrors = new IfcpSessionLcOtherErrorsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ifcpSessionLcTxOctets,
                                this.ifcpSessionLcRxOctets,
                                this.ifcpSessionLcTxFrames,
                                this.ifcpSessionLcRxFrames,
                                this.ifcpSessionLcStaleFrames,
                                this.ifcpSessionLcHeaderCRCErrors,
                                this.ifcpSessionLcFcPayloadCRCErrors,
                                this.ifcpSessionLcOtherErrors
                            };
                        }
                        public static final class IfcpSessionLcTxOctetsEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionLcTxOctetsEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionLcTxOctets", "1.3.6.1.2.1.10.230.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionLcRxOctetsEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionLcRxOctetsEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionLcRxOctets", "1.3.6.1.2.1.10.230.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionLcTxFramesEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionLcTxFramesEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionLcTxFrames", "1.3.6.1.2.1.10.230.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionLcRxFramesEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionLcRxFramesEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionLcRxFrames", "1.3.6.1.2.1.10.230.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionLcStaleFramesEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionLcStaleFramesEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionLcStaleFrames", "1.3.6.1.2.1.10.230.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionLcHeaderCRCErrorsEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionLcHeaderCRCErrorsEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionLcHeaderCRCErrors", "1.3.6.1.2.1.10.230.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionLcFcPayloadCRCErrorsEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionLcFcPayloadCRCErrorsEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionLcFcPayloadCRCErrors", "1.3.6.1.2.1.10.230.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IfcpSessionLcOtherErrorsEnt extends MIBEntry<IFCPMGMTMIBDef>
                        {
                            private IfcpSessionLcOtherErrorsEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "ifcpSessionLcOtherErrors", "1.3.6.1.2.1.10.230.1.2.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class IfcpGatewayConformanceEnt extends MIBEntry<IFCPMGMTMIBDef>
        {
            /** ==========================================================*/
            public final IfcpCompliancesEnt ifcpCompliances;

            public final IfcpGroupsEnt ifcpGroups;

            private IfcpGatewayConformanceEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
            {
                super(mib, parent, "ifcpGatewayConformance", "1.3.6.1.2.1.10.230.2", false, false, false, false);
                this.ifcpCompliances = new IfcpCompliancesEnt(mib, this);
                this.ifcpGroups = new IfcpGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ifcpCompliances,
                    this.ifcpGroups
                };
            }
            public static final class IfcpCompliancesEnt extends MIBEntry<IFCPMGMTMIBDef>
            {
                public final IfcpGatewayComplianceEnt ifcpGatewayCompliance;

                private IfcpCompliancesEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                {
                    super(mib, parent, "ifcpCompliances", "1.3.6.1.2.1.10.230.2.1", false, false, false, false);
                    this.ifcpGatewayCompliance = new IfcpGatewayComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifcpGatewayCompliance
                    };
                }
                public static final class IfcpGatewayComplianceEnt extends MIBEntry<IFCPMGMTMIBDef>
                {
                    private IfcpGatewayComplianceEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "ifcpGatewayCompliance", "1.3.6.1.2.1.10.230.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class IfcpGroupsEnt extends MIBEntry<IFCPMGMTMIBDef>
            {
                public final IfcpLclGatewayGroupEnt ifcpLclGatewayGroup;

                public final IfcpLclGatewaySessionGroupEnt ifcpLclGatewaySessionGroup;

                public final IfcpLclGatewaySessionStatsGroupEnt ifcpLclGatewaySessionStatsGroup;

                public final IfcpLclGatewaySessionLcStatsGroupEnt ifcpLclGatewaySessionLcStatsGroup;

                private IfcpGroupsEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                {
                    super(mib, parent, "ifcpGroups", "1.3.6.1.2.1.10.230.2.2", false, false, false, false);
                    this.ifcpLclGatewayGroup = new IfcpLclGatewayGroupEnt(mib, this);
                    this.ifcpLclGatewaySessionGroup = new IfcpLclGatewaySessionGroupEnt(mib, this);
                    this.ifcpLclGatewaySessionStatsGroup = new IfcpLclGatewaySessionStatsGroupEnt(mib, this);
                    this.ifcpLclGatewaySessionLcStatsGroup = new IfcpLclGatewaySessionLcStatsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifcpLclGatewayGroup,
                        this.ifcpLclGatewaySessionGroup,
                        this.ifcpLclGatewaySessionStatsGroup,
                        this.ifcpLclGatewaySessionLcStatsGroup
                    };
                }
                public static final class IfcpLclGatewayGroupEnt extends MIBEntry<IFCPMGMTMIBDef>
                {
                    private IfcpLclGatewayGroupEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "ifcpLclGatewayGroup", "1.3.6.1.2.1.10.230.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfcpLclGatewaySessionGroupEnt extends MIBEntry<IFCPMGMTMIBDef>
                {
                    private IfcpLclGatewaySessionGroupEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "ifcpLclGatewaySessionGroup", "1.3.6.1.2.1.10.230.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfcpLclGatewaySessionStatsGroupEnt extends MIBEntry<IFCPMGMTMIBDef>
                {
                    private IfcpLclGatewaySessionStatsGroupEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "ifcpLclGatewaySessionStatsGroup", "1.3.6.1.2.1.10.230.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfcpLclGatewaySessionLcStatsGroupEnt extends MIBEntry<IFCPMGMTMIBDef>
                {
                    private IfcpLclGatewaySessionLcStatsGroupEnt(IFCPMGMTMIBDef mib, MIBEntry<IFCPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "ifcpLclGatewaySessionLcStatsGroup", "1.3.6.1.2.1.10.230.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
