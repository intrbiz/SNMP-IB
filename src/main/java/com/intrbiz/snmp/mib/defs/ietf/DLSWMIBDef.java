package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class DLSWMIBDef extends MIB
{
    public static final DLSWMIBDef DLSWMIB = new DLSWMIBDef();

    public final DlswEnt dlsw;

    /** definitions of administrative identifiers*/
    public final ZeroDotZeroEnt zeroDotZero;

    private DLSWMIBDef()
    {
        super("DLSW-MIB");
        this.dlsw = new DlswEnt(this, null);
        this.zeroDotZero = new ZeroDotZeroEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dlsw,
            this.zeroDotZero
        };
    }

    public static final class DlswEnt extends MIBEntry<DLSWMIBDef>
    {
        public final DlswMIBEnt dlswMIB;

        public final DlswDomainsEnt dlswDomains;

        /** *******************************************************************CONFORMANCE INFORMATION********************************************************************/
        public final DlswConformanceEnt dlswConformance;

        private DlswEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
        {
            super(mib, parent, "dlsw", "1.3.6.1.2.1.46", false, false, false, false);
            this.dlswMIB = new DlswMIBEnt(mib, this);
            this.dlswDomains = new DlswDomainsEnt(mib, this);
            this.dlswConformance = new DlswConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dlswMIB,
                this.dlswDomains,
                this.dlswConformance
            };
        }
        public static final class DlswMIBEnt extends MIBEntry<DLSWMIBDef>
        {
            /** *******************************************************************DLSw MIB Definition*******************************************************************
The DLSw MIB module contains an object part and a conformance part.Object part is organized in the following groups:(1) dlswNode      -  information about this DLSw(2) dlswTConn     -  about adjacent DLSw partners(3) dlswInterface -  about which interfaces DLSw is active on(4) dlswDirectory -  about any directory of local/remote resources(5) dlswCircuit   -  about established circuits.(6) dlswSdlc      -  about SDLC data link switched devices*/
            public final DlswNodeEnt dlswNode;

            public final DlswTConnEnt dlswTConn;

            public final DlswInterfaceEnt dlswInterface;

            public final DlswDirectoryEnt dlswDirectory;

            public final DlswCircuitEnt dlswCircuit;

            public final DlswSdlcEnt dlswSdlc;

            /** *******************************************************************NOTIFICATIONS, i.e., TRAP DEFINITIONS********************************************************************/
            public final DlswTrapsEnt dlswTraps;

            private DlswMIBEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
            {
                super(mib, parent, "dlswMIB", "1.3.6.1.2.1.46.1", false, false, false, false);
                this.dlswNode = new DlswNodeEnt(mib, this);
                this.dlswTConn = new DlswTConnEnt(mib, this);
                this.dlswInterface = new DlswInterfaceEnt(mib, this);
                this.dlswDirectory = new DlswDirectoryEnt(mib, this);
                this.dlswCircuit = new DlswCircuitEnt(mib, this);
                this.dlswSdlc = new DlswSdlcEnt(mib, this);
                this.dlswTraps = new DlswTrapsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dlswNode,
                    this.dlswTConn,
                    this.dlswInterface,
                    this.dlswDirectory,
                    this.dlswCircuit,
                    this.dlswSdlc,
                    this.dlswTraps
                };
            }
            public static final class DlswNodeEnt extends MIBEntry<DLSWMIBDef>
            {
                /** SDLC
*******************************************************************THE NODE GROUP*******************************************************************
----------------------------------
DLSw Node Identity----------------------------------*/
                public final DlswNodeVersionEnt dlswNodeVersion;

                public final DlswNodeVendorIDEnt dlswNodeVendorID;

                public final DlswNodeVersionStringEnt dlswNodeVersionString;

                /** ----------------------------------
DLSw Code Capability----------------------------------*/
                public final DlswNodeStdPacingSupportEnt dlswNodeStdPacingSupport;

                /** ----------------------------------
DLSw Node Operational Objects----------------------------------*/
                public final DlswNodeStatusEnt dlswNodeStatus;

                public final DlswNodeUpTimeEnt dlswNodeUpTime;

                public final DlswNodeVirtualSegmentLFSizeEnt dlswNodeVirtualSegmentLFSize;

                /** ...................................................................NETBIOS Resources...................................................................*/
                public final DlswNodeResourceNBExclusivityEnt dlswNodeResourceNBExclusivity;

                /** ...................................................................MAC Address List...................................................................*/
                public final DlswNodeResourceMacExclusivityEnt dlswNodeResourceMacExclusivity;

                /** *******************************************************************TRAP GENERATION CONTROL********************************************************************/
                public final DlswTrapControlEnt dlswTrapControl;

                private DlswNodeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                {
                    super(mib, parent, "dlswNode", "1.3.6.1.2.1.46.1.1", false, false, false, false);
                    this.dlswNodeVersion = new DlswNodeVersionEnt(mib, this);
                    this.dlswNodeVendorID = new DlswNodeVendorIDEnt(mib, this);
                    this.dlswNodeVersionString = new DlswNodeVersionStringEnt(mib, this);
                    this.dlswNodeStdPacingSupport = new DlswNodeStdPacingSupportEnt(mib, this);
                    this.dlswNodeStatus = new DlswNodeStatusEnt(mib, this);
                    this.dlswNodeUpTime = new DlswNodeUpTimeEnt(mib, this);
                    this.dlswNodeVirtualSegmentLFSize = new DlswNodeVirtualSegmentLFSizeEnt(mib, this);
                    this.dlswNodeResourceNBExclusivity = new DlswNodeResourceNBExclusivityEnt(mib, this);
                    this.dlswNodeResourceMacExclusivity = new DlswNodeResourceMacExclusivityEnt(mib, this);
                    this.dlswTrapControl = new DlswTrapControlEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dlswNodeVersion,
                        this.dlswNodeVendorID,
                        this.dlswNodeVersionString,
                        this.dlswNodeStdPacingSupport,
                        this.dlswNodeStatus,
                        this.dlswNodeUpTime,
                        this.dlswNodeVirtualSegmentLFSize,
                        this.dlswNodeResourceNBExclusivity,
                        this.dlswNodeResourceMacExclusivity,
                        this.dlswTrapControl
                    };
                }
                public static final class DlswNodeVersionEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswNodeVersionEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswNodeVersion", "1.3.6.1.2.1.46.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswNodeVendorIDEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswNodeVendorIDEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswNodeVendorID", "1.3.6.1.2.1.46.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswNodeVersionStringEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswNodeVersionStringEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswNodeVersionString", "1.3.6.1.2.1.46.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswNodeStdPacingSupportEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswNodeStdPacingSupportEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswNodeStdPacingSupport", "1.3.6.1.2.1.46.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswNodeStatusEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswNodeStatusEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswNodeStatus", "1.3.6.1.2.1.46.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswNodeUpTimeEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswNodeUpTimeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswNodeUpTime", "1.3.6.1.2.1.46.1.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswNodeVirtualSegmentLFSizeEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswNodeVirtualSegmentLFSizeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswNodeVirtualSegmentLFSize", "1.3.6.1.2.1.46.1.1.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswNodeResourceNBExclusivityEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswNodeResourceNBExclusivityEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswNodeResourceNBExclusivity", "1.3.6.1.2.1.46.1.1.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswNodeResourceMacExclusivityEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswNodeResourceMacExclusivityEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswNodeResourceMacExclusivity", "1.3.6.1.2.1.46.1.1.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswTrapControlEnt extends MIBEntry<DLSWMIBDef>
                {
                    public final DlswTrapCntlTConnPartnerRejectEnt dlswTrapCntlTConnPartnerReject;

                    public final DlswTrapCntlTConnProtViolationEnt dlswTrapCntlTConnProtViolation;

                    public final DlswTrapCntlTConnEnt dlswTrapCntlTConn;

                    public final DlswTrapCntlCircuitEnt dlswTrapCntlCircuit;

                    private DlswTrapControlEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTrapControl", "1.3.6.1.2.1.46.1.1.10", false, false, false, false);
                        this.dlswTrapCntlTConnPartnerReject = new DlswTrapCntlTConnPartnerRejectEnt(mib, this);
                        this.dlswTrapCntlTConnProtViolation = new DlswTrapCntlTConnProtViolationEnt(mib, this);
                        this.dlswTrapCntlTConn = new DlswTrapCntlTConnEnt(mib, this);
                        this.dlswTrapCntlCircuit = new DlswTrapCntlCircuitEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dlswTrapCntlTConnPartnerReject,
                            this.dlswTrapCntlTConnProtViolation,
                            this.dlswTrapCntlTConn,
                            this.dlswTrapCntlCircuit
                        };
                    }
                    public static final class DlswTrapCntlTConnPartnerRejectEnt extends MIBEntry<DLSWMIBDef>
                    {
                        private DlswTrapCntlTConnPartnerRejectEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswTrapCntlTConnPartnerReject", "1.3.6.1.2.1.46.1.1.10.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlswTrapCntlTConnProtViolationEnt extends MIBEntry<DLSWMIBDef>
                    {
                        private DlswTrapCntlTConnProtViolationEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswTrapCntlTConnProtViolation", "1.3.6.1.2.1.46.1.1.10.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlswTrapCntlTConnEnt extends MIBEntry<DLSWMIBDef>
                    {
                        private DlswTrapCntlTConnEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswTrapCntlTConn", "1.3.6.1.2.1.46.1.1.10.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlswTrapCntlCircuitEnt extends MIBEntry<DLSWMIBDef>
                    {
                        private DlswTrapCntlCircuitEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswTrapCntlCircuit", "1.3.6.1.2.1.46.1.1.10.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class DlswTConnEnt extends MIBEntry<DLSWMIBDef>
            {
                /** *******************************************************************TRANSPORT CONNECTION (aka: PARTNER DLSW)*******************************************************************
----------------------------------

Transport Connection Statistics Objects----------------------------------*/
                public final DlswTConnStatEnt dlswTConnStat;

                /** ----------------------------------
Transport Connection Configuration Table----------------------------------*/
                public final DlswTConnConfigTableEnt dlswTConnConfigTable;

                /** ----------------------------------
Transport Connection Operation Table----------------------------------
(1) At most one transport connection can be connected betweenthis DLSw and one of its DLSw partners at a given time.(2) Multiple transport types are supported.(3) Since the entries may be reused, dlswTConnOperEntryTimeneeds to be consulted for the possibility of counter reset.----------------------------------*/
                public final DlswTConnOperTableEnt dlswTConnOperTable;

                /** ----------------------------------
Transport Connection Specific----------------------------------*/
                public final DlswTConnSpecificEnt dlswTConnSpecific;

                private DlswTConnEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                {
                    super(mib, parent, "dlswTConn", "1.3.6.1.2.1.46.1.2", false, false, false, false);
                    this.dlswTConnStat = new DlswTConnStatEnt(mib, this);
                    this.dlswTConnConfigTable = new DlswTConnConfigTableEnt(mib, this);
                    this.dlswTConnOperTable = new DlswTConnOperTableEnt(mib, this);
                    this.dlswTConnSpecific = new DlswTConnSpecificEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dlswTConnStat,
                        this.dlswTConnConfigTable,
                        this.dlswTConnOperTable,
                        this.dlswTConnSpecific
                    };
                }
                public static final class DlswTConnStatEnt extends MIBEntry<DLSWMIBDef>
                {
                    public final DlswTConnStatActiveConnectionsEnt dlswTConnStatActiveConnections;

                    public final DlswTConnStatCloseIdlesEnt dlswTConnStatCloseIdles;

                    public final DlswTConnStatCloseBusysEnt dlswTConnStatCloseBusys;

                    private DlswTConnStatEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTConnStat", "1.3.6.1.2.1.46.1.2.1", false, false, false, false);
                        this.dlswTConnStatActiveConnections = new DlswTConnStatActiveConnectionsEnt(mib, this);
                        this.dlswTConnStatCloseIdles = new DlswTConnStatCloseIdlesEnt(mib, this);
                        this.dlswTConnStatCloseBusys = new DlswTConnStatCloseBusysEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dlswTConnStatActiveConnections,
                            this.dlswTConnStatCloseIdles,
                            this.dlswTConnStatCloseBusys
                        };
                    }
                    public static final class DlswTConnStatActiveConnectionsEnt extends MIBEntry<DLSWMIBDef>
                    {
                        private DlswTConnStatActiveConnectionsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswTConnStatActiveConnections", "1.3.6.1.2.1.46.1.2.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlswTConnStatCloseIdlesEnt extends MIBEntry<DLSWMIBDef>
                    {
                        private DlswTConnStatCloseIdlesEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswTConnStatCloseIdles", "1.3.6.1.2.1.46.1.2.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlswTConnStatCloseBusysEnt extends MIBEntry<DLSWMIBDef>
                    {
                        private DlswTConnStatCloseBusysEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswTConnStatCloseBusys", "1.3.6.1.2.1.46.1.2.1.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class DlswTConnConfigTableEnt extends MIBEntry<DLSWMIBDef>
                {
                    public final DlswTConnConfigEntryEnt dlswTConnConfigEntry;

                    private DlswTConnConfigTableEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTConnConfigTable", "1.3.6.1.2.1.46.1.2.2", false, true, false, false);
                        this.dlswTConnConfigEntry = new DlswTConnConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dlswTConnConfigEntry
                        };
                    }
                    public static final class DlswTConnConfigEntryEnt extends MIBEntry<DLSWMIBDef>
                    {
                        public final DlswTConnConfigIndexEnt dlswTConnConfigIndex;

                        public final DlswTConnConfigTDomainEnt dlswTConnConfigTDomain;

                        public final DlswTConnConfigLocalTAddrEnt dlswTConnConfigLocalTAddr;

                        public final DlswTConnConfigRemoteTAddrEnt dlswTConnConfigRemoteTAddr;

                        public final DlswTConnConfigLastModifyTimeEnt dlswTConnConfigLastModifyTime;

                        public final DlswTConnConfigEntryTypeEnt dlswTConnConfigEntryType;

                        public final DlswTConnConfigGroupDefinitionEnt dlswTConnConfigGroupDefinition;

                        public final DlswTConnConfigSetupTypeEnt dlswTConnConfigSetupType;

                        public final DlswTConnConfigSapListEnt dlswTConnConfigSapList;

                        public final DlswTConnConfigAdvertiseMacNBEnt dlswTConnConfigAdvertiseMacNB;

                        public final DlswTConnConfigInitCirRecvWndwEnt dlswTConnConfigInitCirRecvWndw;

                        public final DlswTConnConfigOpensEnt dlswTConnConfigOpens;

                        public final DlswTConnConfigRowStatusEnt dlswTConnConfigRowStatus;

                        private DlswTConnConfigEntryEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswTConnConfigEntry", "1.3.6.1.2.1.46.1.2.2.1", false, false, false, true);
                            this.dlswTConnConfigIndex = new DlswTConnConfigIndexEnt(mib, this);
                            this.dlswTConnConfigTDomain = new DlswTConnConfigTDomainEnt(mib, this);
                            this.dlswTConnConfigLocalTAddr = new DlswTConnConfigLocalTAddrEnt(mib, this);
                            this.dlswTConnConfigRemoteTAddr = new DlswTConnConfigRemoteTAddrEnt(mib, this);
                            this.dlswTConnConfigLastModifyTime = new DlswTConnConfigLastModifyTimeEnt(mib, this);
                            this.dlswTConnConfigEntryType = new DlswTConnConfigEntryTypeEnt(mib, this);
                            this.dlswTConnConfigGroupDefinition = new DlswTConnConfigGroupDefinitionEnt(mib, this);
                            this.dlswTConnConfigSetupType = new DlswTConnConfigSetupTypeEnt(mib, this);
                            this.dlswTConnConfigSapList = new DlswTConnConfigSapListEnt(mib, this);
                            this.dlswTConnConfigAdvertiseMacNB = new DlswTConnConfigAdvertiseMacNBEnt(mib, this);
                            this.dlswTConnConfigInitCirRecvWndw = new DlswTConnConfigInitCirRecvWndwEnt(mib, this);
                            this.dlswTConnConfigOpens = new DlswTConnConfigOpensEnt(mib, this);
                            this.dlswTConnConfigRowStatus = new DlswTConnConfigRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dlswTConnConfigIndex,
                                this.dlswTConnConfigTDomain,
                                this.dlswTConnConfigLocalTAddr,
                                this.dlswTConnConfigRemoteTAddr,
                                this.dlswTConnConfigLastModifyTime,
                                this.dlswTConnConfigEntryType,
                                this.dlswTConnConfigGroupDefinition,
                                this.dlswTConnConfigSetupType,
                                this.dlswTConnConfigSapList,
                                this.dlswTConnConfigAdvertiseMacNB,
                                this.dlswTConnConfigInitCirRecvWndw,
                                this.dlswTConnConfigOpens,
                                this.dlswTConnConfigRowStatus
                            };
                        }
                        public static final class DlswTConnConfigIndexEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnConfigIndexEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnConfigIndex", "1.3.6.1.2.1.46.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnConfigTDomainEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnConfigTDomainEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnConfigTDomain", "1.3.6.1.2.1.46.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnConfigLocalTAddrEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnConfigLocalTAddrEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnConfigLocalTAddr", "1.3.6.1.2.1.46.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnConfigRemoteTAddrEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnConfigRemoteTAddrEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnConfigRemoteTAddr", "1.3.6.1.2.1.46.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnConfigLastModifyTimeEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnConfigLastModifyTimeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnConfigLastModifyTime", "1.3.6.1.2.1.46.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnConfigEntryTypeEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnConfigEntryTypeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnConfigEntryType", "1.3.6.1.2.1.46.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnConfigGroupDefinitionEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnConfigGroupDefinitionEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnConfigGroupDefinition", "1.3.6.1.2.1.46.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnConfigSetupTypeEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnConfigSetupTypeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnConfigSetupType", "1.3.6.1.2.1.46.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnConfigSapListEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnConfigSapListEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnConfigSapList", "1.3.6.1.2.1.46.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnConfigAdvertiseMacNBEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnConfigAdvertiseMacNBEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnConfigAdvertiseMacNB", "1.3.6.1.2.1.46.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnConfigInitCirRecvWndwEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnConfigInitCirRecvWndwEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnConfigInitCirRecvWndw", "1.3.6.1.2.1.46.1.2.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnConfigOpensEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnConfigOpensEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnConfigOpens", "1.3.6.1.2.1.46.1.2.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnConfigRowStatusEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnConfigRowStatusEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnConfigRowStatus", "1.3.6.1.2.1.46.1.2.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DlswTConnOperTableEnt extends MIBEntry<DLSWMIBDef>
                {
                    public final DlswTConnOperEntryEnt dlswTConnOperEntry;

                    private DlswTConnOperTableEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTConnOperTable", "1.3.6.1.2.1.46.1.2.3", false, true, false, false);
                        this.dlswTConnOperEntry = new DlswTConnOperEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dlswTConnOperEntry
                        };
                    }
                    public static final class DlswTConnOperEntryEnt extends MIBEntry<DLSWMIBDef>
                    {
                        public final DlswTConnOperTDomainEnt dlswTConnOperTDomain;

                        public final DlswTConnOperLocalTAddrEnt dlswTConnOperLocalTAddr;

                        public final DlswTConnOperRemoteTAddrEnt dlswTConnOperRemoteTAddr;

                        public final DlswTConnOperEntryTimeEnt dlswTConnOperEntryTime;

                        /** ...................................................................DLSw Transport Connection Operational Objects...................................................................*/
                        public final DlswTConnOperConnectTimeEnt dlswTConnOperConnectTime;

                        public final DlswTConnOperStateEnt dlswTConnOperState;

                        public final DlswTConnOperConfigIndexEnt dlswTConnOperConfigIndex;

                        /** ...................................................................Transport Connection Characteristics...................................................................*/
                        public final DlswTConnOperFlowCntlModeEnt dlswTConnOperFlowCntlMode;

                        /** ...................................................................*/
                        public final DlswTConnOperPartnerVersionEnt dlswTConnOperPartnerVersion;

                        public final DlswTConnOperPartnerVendorIDEnt dlswTConnOperPartnerVendorID;

                        public final DlswTConnOperPartnerVersionStrEnt dlswTConnOperPartnerVersionStr;

                        public final DlswTConnOperPartnerInitPacingWndwEnt dlswTConnOperPartnerInitPacingWndw;

                        /** ...................................................................*/
                        public final DlswTConnOperPartnerSapListEnt dlswTConnOperPartnerSapList;

                        public final DlswTConnOperPartnerNBExclEnt dlswTConnOperPartnerNBExcl;

                        public final DlswTConnOperPartnerMacExclEnt dlswTConnOperPartnerMacExcl;

                        public final DlswTConnOperPartnerNBInfoEnt dlswTConnOperPartnerNBInfo;

                        public final DlswTConnOperPartnerMacInfoEnt dlswTConnOperPartnerMacInfo;

                        /** ...................................................................Information about the last disconnect of this transport connection.These objects make sense only for implementations that keeptransport connection information around after disconnection....................................................................*/
                        public final DlswTConnOperDiscTimeEnt dlswTConnOperDiscTime;

                        public final DlswTConnOperDiscReasonEnt dlswTConnOperDiscReason;

                        public final DlswTConnOperDiscActiveCirEnt dlswTConnOperDiscActiveCir;

                        /** ...................................................................Transport Connection Statistics(1) Traffic counts...................................................................*/
                        public final DlswTConnOperInDataPktsEnt dlswTConnOperInDataPkts;

                        public final DlswTConnOperOutDataPktsEnt dlswTConnOperOutDataPkts;

                        public final DlswTConnOperInDataOctetsEnt dlswTConnOperInDataOctets;

                        public final DlswTConnOperOutDataOctetsEnt dlswTConnOperOutDataOctets;

                        public final DlswTConnOperInCntlPktsEnt dlswTConnOperInCntlPkts;

                        public final DlswTConnOperOutCntlPktsEnt dlswTConnOperOutCntlPkts;

                        /** ...................................................................(2) Directory activities (Explorer messages)...................................................................*/
                        public final DlswTConnOperCURexSentsEnt dlswTConnOperCURexSents;

                        public final DlswTConnOperICRexRcvdsEnt dlswTConnOperICRexRcvds;

                        public final DlswTConnOperCURexRcvdsEnt dlswTConnOperCURexRcvds;

                        public final DlswTConnOperICRexSentsEnt dlswTConnOperICRexSents;

                        /** ...................................................................*/
                        public final DlswTConnOperNQexSentsEnt dlswTConnOperNQexSents;

                        public final DlswTConnOperNRexRcvdsEnt dlswTConnOperNRexRcvds;

                        public final DlswTConnOperNQexRcvdsEnt dlswTConnOperNQexRcvds;

                        public final DlswTConnOperNRexSentsEnt dlswTConnOperNRexSents;

                        /** ...................................................................(3) Circuit activities on each transport connection...................................................................*/
                        public final DlswTConnOperCirCreatesEnt dlswTConnOperCirCreates;

                        public final DlswTConnOperCircuitsEnt dlswTConnOperCircuits;

                        private DlswTConnOperEntryEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswTConnOperEntry", "1.3.6.1.2.1.46.1.2.3.1", false, false, false, true);
                            this.dlswTConnOperTDomain = new DlswTConnOperTDomainEnt(mib, this);
                            this.dlswTConnOperLocalTAddr = new DlswTConnOperLocalTAddrEnt(mib, this);
                            this.dlswTConnOperRemoteTAddr = new DlswTConnOperRemoteTAddrEnt(mib, this);
                            this.dlswTConnOperEntryTime = new DlswTConnOperEntryTimeEnt(mib, this);
                            this.dlswTConnOperConnectTime = new DlswTConnOperConnectTimeEnt(mib, this);
                            this.dlswTConnOperState = new DlswTConnOperStateEnt(mib, this);
                            this.dlswTConnOperConfigIndex = new DlswTConnOperConfigIndexEnt(mib, this);
                            this.dlswTConnOperFlowCntlMode = new DlswTConnOperFlowCntlModeEnt(mib, this);
                            this.dlswTConnOperPartnerVersion = new DlswTConnOperPartnerVersionEnt(mib, this);
                            this.dlswTConnOperPartnerVendorID = new DlswTConnOperPartnerVendorIDEnt(mib, this);
                            this.dlswTConnOperPartnerVersionStr = new DlswTConnOperPartnerVersionStrEnt(mib, this);
                            this.dlswTConnOperPartnerInitPacingWndw = new DlswTConnOperPartnerInitPacingWndwEnt(mib, this);
                            this.dlswTConnOperPartnerSapList = new DlswTConnOperPartnerSapListEnt(mib, this);
                            this.dlswTConnOperPartnerNBExcl = new DlswTConnOperPartnerNBExclEnt(mib, this);
                            this.dlswTConnOperPartnerMacExcl = new DlswTConnOperPartnerMacExclEnt(mib, this);
                            this.dlswTConnOperPartnerNBInfo = new DlswTConnOperPartnerNBInfoEnt(mib, this);
                            this.dlswTConnOperPartnerMacInfo = new DlswTConnOperPartnerMacInfoEnt(mib, this);
                            this.dlswTConnOperDiscTime = new DlswTConnOperDiscTimeEnt(mib, this);
                            this.dlswTConnOperDiscReason = new DlswTConnOperDiscReasonEnt(mib, this);
                            this.dlswTConnOperDiscActiveCir = new DlswTConnOperDiscActiveCirEnt(mib, this);
                            this.dlswTConnOperInDataPkts = new DlswTConnOperInDataPktsEnt(mib, this);
                            this.dlswTConnOperOutDataPkts = new DlswTConnOperOutDataPktsEnt(mib, this);
                            this.dlswTConnOperInDataOctets = new DlswTConnOperInDataOctetsEnt(mib, this);
                            this.dlswTConnOperOutDataOctets = new DlswTConnOperOutDataOctetsEnt(mib, this);
                            this.dlswTConnOperInCntlPkts = new DlswTConnOperInCntlPktsEnt(mib, this);
                            this.dlswTConnOperOutCntlPkts = new DlswTConnOperOutCntlPktsEnt(mib, this);
                            this.dlswTConnOperCURexSents = new DlswTConnOperCURexSentsEnt(mib, this);
                            this.dlswTConnOperICRexRcvds = new DlswTConnOperICRexRcvdsEnt(mib, this);
                            this.dlswTConnOperCURexRcvds = new DlswTConnOperCURexRcvdsEnt(mib, this);
                            this.dlswTConnOperICRexSents = new DlswTConnOperICRexSentsEnt(mib, this);
                            this.dlswTConnOperNQexSents = new DlswTConnOperNQexSentsEnt(mib, this);
                            this.dlswTConnOperNRexRcvds = new DlswTConnOperNRexRcvdsEnt(mib, this);
                            this.dlswTConnOperNQexRcvds = new DlswTConnOperNQexRcvdsEnt(mib, this);
                            this.dlswTConnOperNRexSents = new DlswTConnOperNRexSentsEnt(mib, this);
                            this.dlswTConnOperCirCreates = new DlswTConnOperCirCreatesEnt(mib, this);
                            this.dlswTConnOperCircuits = new DlswTConnOperCircuitsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dlswTConnOperTDomain,
                                this.dlswTConnOperLocalTAddr,
                                this.dlswTConnOperRemoteTAddr,
                                this.dlswTConnOperEntryTime,
                                this.dlswTConnOperConnectTime,
                                this.dlswTConnOperState,
                                this.dlswTConnOperConfigIndex,
                                this.dlswTConnOperFlowCntlMode,
                                this.dlswTConnOperPartnerVersion,
                                this.dlswTConnOperPartnerVendorID,
                                this.dlswTConnOperPartnerVersionStr,
                                this.dlswTConnOperPartnerInitPacingWndw,
                                this.dlswTConnOperPartnerSapList,
                                this.dlswTConnOperPartnerNBExcl,
                                this.dlswTConnOperPartnerMacExcl,
                                this.dlswTConnOperPartnerNBInfo,
                                this.dlswTConnOperPartnerMacInfo,
                                this.dlswTConnOperDiscTime,
                                this.dlswTConnOperDiscReason,
                                this.dlswTConnOperDiscActiveCir,
                                this.dlswTConnOperInDataPkts,
                                this.dlswTConnOperOutDataPkts,
                                this.dlswTConnOperInDataOctets,
                                this.dlswTConnOperOutDataOctets,
                                this.dlswTConnOperInCntlPkts,
                                this.dlswTConnOperOutCntlPkts,
                                this.dlswTConnOperCURexSents,
                                this.dlswTConnOperICRexRcvds,
                                this.dlswTConnOperCURexRcvds,
                                this.dlswTConnOperICRexSents,
                                this.dlswTConnOperNQexSents,
                                this.dlswTConnOperNRexRcvds,
                                this.dlswTConnOperNQexRcvds,
                                this.dlswTConnOperNRexSents,
                                this.dlswTConnOperCirCreates,
                                this.dlswTConnOperCircuits
                            };
                        }
                        public static final class DlswTConnOperTDomainEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperTDomainEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperTDomain", "1.3.6.1.2.1.46.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperLocalTAddrEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperLocalTAddrEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperLocalTAddr", "1.3.6.1.2.1.46.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperRemoteTAddrEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperRemoteTAddrEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperRemoteTAddr", "1.3.6.1.2.1.46.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperEntryTimeEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperEntryTimeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperEntryTime", "1.3.6.1.2.1.46.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperConnectTimeEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperConnectTimeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperConnectTime", "1.3.6.1.2.1.46.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperStateEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperStateEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperState", "1.3.6.1.2.1.46.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperConfigIndexEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperConfigIndexEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperConfigIndex", "1.3.6.1.2.1.46.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperFlowCntlModeEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperFlowCntlModeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperFlowCntlMode", "1.3.6.1.2.1.46.1.2.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperPartnerVersionEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperPartnerVersionEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperPartnerVersion", "1.3.6.1.2.1.46.1.2.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperPartnerVendorIDEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperPartnerVendorIDEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperPartnerVendorID", "1.3.6.1.2.1.46.1.2.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperPartnerVersionStrEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperPartnerVersionStrEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperPartnerVersionStr", "1.3.6.1.2.1.46.1.2.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperPartnerInitPacingWndwEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperPartnerInitPacingWndwEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperPartnerInitPacingWndw", "1.3.6.1.2.1.46.1.2.3.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperPartnerSapListEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperPartnerSapListEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperPartnerSapList", "1.3.6.1.2.1.46.1.2.3.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperPartnerNBExclEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperPartnerNBExclEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperPartnerNBExcl", "1.3.6.1.2.1.46.1.2.3.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperPartnerMacExclEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperPartnerMacExclEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperPartnerMacExcl", "1.3.6.1.2.1.46.1.2.3.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperPartnerNBInfoEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperPartnerNBInfoEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperPartnerNBInfo", "1.3.6.1.2.1.46.1.2.3.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperPartnerMacInfoEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperPartnerMacInfoEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperPartnerMacInfo", "1.3.6.1.2.1.46.1.2.3.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperDiscTimeEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperDiscTimeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperDiscTime", "1.3.6.1.2.1.46.1.2.3.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperDiscReasonEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperDiscReasonEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperDiscReason", "1.3.6.1.2.1.46.1.2.3.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperDiscActiveCirEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperDiscActiveCirEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperDiscActiveCir", "1.3.6.1.2.1.46.1.2.3.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperInDataPktsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperInDataPktsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperInDataPkts", "1.3.6.1.2.1.46.1.2.3.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperOutDataPktsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperOutDataPktsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperOutDataPkts", "1.3.6.1.2.1.46.1.2.3.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperInDataOctetsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperInDataOctetsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperInDataOctets", "1.3.6.1.2.1.46.1.2.3.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperOutDataOctetsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperOutDataOctetsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperOutDataOctets", "1.3.6.1.2.1.46.1.2.3.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperInCntlPktsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperInCntlPktsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperInCntlPkts", "1.3.6.1.2.1.46.1.2.3.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperOutCntlPktsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperOutCntlPktsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperOutCntlPkts", "1.3.6.1.2.1.46.1.2.3.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperCURexSentsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperCURexSentsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperCURexSents", "1.3.6.1.2.1.46.1.2.3.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperICRexRcvdsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperICRexRcvdsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperICRexRcvds", "1.3.6.1.2.1.46.1.2.3.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperCURexRcvdsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperCURexRcvdsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperCURexRcvds", "1.3.6.1.2.1.46.1.2.3.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperICRexSentsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperICRexSentsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperICRexSents", "1.3.6.1.2.1.46.1.2.3.1.30", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperNQexSentsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperNQexSentsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperNQexSents", "1.3.6.1.2.1.46.1.2.3.1.31", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperNRexRcvdsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperNRexRcvdsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperNRexRcvds", "1.3.6.1.2.1.46.1.2.3.1.32", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperNQexRcvdsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperNQexRcvdsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperNQexRcvds", "1.3.6.1.2.1.46.1.2.3.1.33", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperNRexSentsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperNRexSentsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperNRexSents", "1.3.6.1.2.1.46.1.2.3.1.34", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperCirCreatesEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperCirCreatesEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperCirCreates", "1.3.6.1.2.1.46.1.2.3.1.35", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswTConnOperCircuitsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswTConnOperCircuitsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnOperCircuits", "1.3.6.1.2.1.46.1.2.3.1.36", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DlswTConnSpecificEnt extends MIBEntry<DLSWMIBDef>
                {
                    public final DlswTConnTcpEnt dlswTConnTcp;

                    private DlswTConnSpecificEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTConnSpecific", "1.3.6.1.2.1.46.1.2.4", false, false, false, false);
                        this.dlswTConnTcp = new DlswTConnTcpEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dlswTConnTcp
                        };
                    }
                    public static final class DlswTConnTcpEnt extends MIBEntry<DLSWMIBDef>
                    {
                        /** ...................................................................TCP Transport Connection Specific -  Configuration...................................................................*/
                        public final DlswTConnTcpConfigTableEnt dlswTConnTcpConfigTable;

                        /** ...................................................................TCP Transport Connection Specific -  Operation...................................................................*/
                        public final DlswTConnTcpOperTableEnt dlswTConnTcpOperTable;

                        private DlswTConnTcpEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswTConnTcp", "1.3.6.1.2.1.46.1.2.4.1", false, false, false, false);
                            this.dlswTConnTcpConfigTable = new DlswTConnTcpConfigTableEnt(mib, this);
                            this.dlswTConnTcpOperTable = new DlswTConnTcpOperTableEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dlswTConnTcpConfigTable,
                                this.dlswTConnTcpOperTable
                            };
                        }
                        public static final class DlswTConnTcpConfigTableEnt extends MIBEntry<DLSWMIBDef>
                        {
                            public final DlswTConnTcpConfigEntryEnt dlswTConnTcpConfigEntry;

                            private DlswTConnTcpConfigTableEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnTcpConfigTable", "1.3.6.1.2.1.46.1.2.4.1.1", false, true, false, false);
                                this.dlswTConnTcpConfigEntry = new DlswTConnTcpConfigEntryEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.dlswTConnTcpConfigEntry
                                };
                            }
                            public static final class DlswTConnTcpConfigEntryEnt extends MIBEntry<DLSWMIBDef>
                            {
                                public final DlswTConnTcpConfigKeepAliveIntEnt dlswTConnTcpConfigKeepAliveInt;

                                public final DlswTConnTcpConfigTcpConnectionsEnt dlswTConnTcpConfigTcpConnections;

                                public final DlswTConnTcpConfigMaxSegmentSizeEnt dlswTConnTcpConfigMaxSegmentSize;

                                private DlswTConnTcpConfigEntryEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswTConnTcpConfigEntry", "1.3.6.1.2.1.46.1.2.4.1.1.1", false, false, false, true);
                                    this.dlswTConnTcpConfigKeepAliveInt = new DlswTConnTcpConfigKeepAliveIntEnt(mib, this);
                                    this.dlswTConnTcpConfigTcpConnections = new DlswTConnTcpConfigTcpConnectionsEnt(mib, this);
                                    this.dlswTConnTcpConfigMaxSegmentSize = new DlswTConnTcpConfigMaxSegmentSizeEnt(mib, this);
                                    this.entries = new MIBEntry<?>[] {
                                        this.dlswTConnTcpConfigKeepAliveInt,
                                        this.dlswTConnTcpConfigTcpConnections,
                                        this.dlswTConnTcpConfigMaxSegmentSize
                                    };
                                }
                                public static final class DlswTConnTcpConfigKeepAliveIntEnt extends MIBEntry<DLSWMIBDef>
                                {
                                    private DlswTConnTcpConfigKeepAliveIntEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                    {
                                        super(mib, parent, "dlswTConnTcpConfigKeepAliveInt", "1.3.6.1.2.1.46.1.2.4.1.1.1.1", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class DlswTConnTcpConfigTcpConnectionsEnt extends MIBEntry<DLSWMIBDef>
                                {
                                    private DlswTConnTcpConfigTcpConnectionsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                    {
                                        super(mib, parent, "dlswTConnTcpConfigTcpConnections", "1.3.6.1.2.1.46.1.2.4.1.1.1.2", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class DlswTConnTcpConfigMaxSegmentSizeEnt extends MIBEntry<DLSWMIBDef>
                                {
                                    private DlswTConnTcpConfigMaxSegmentSizeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                    {
                                        super(mib, parent, "dlswTConnTcpConfigMaxSegmentSize", "1.3.6.1.2.1.46.1.2.4.1.1.1.3", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                            }

                        }

                        public static final class DlswTConnTcpOperTableEnt extends MIBEntry<DLSWMIBDef>
                        {
                            public final DlswTConnTcpOperEntryEnt dlswTConnTcpOperEntry;

                            private DlswTConnTcpOperTableEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswTConnTcpOperTable", "1.3.6.1.2.1.46.1.2.4.1.2", false, true, false, false);
                                this.dlswTConnTcpOperEntry = new DlswTConnTcpOperEntryEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.dlswTConnTcpOperEntry
                                };
                            }
                            public static final class DlswTConnTcpOperEntryEnt extends MIBEntry<DLSWMIBDef>
                            {
                                public final DlswTConnTcpOperKeepAliveIntEnt dlswTConnTcpOperKeepAliveInt;

                                public final DlswTConnTcpOperPrefTcpConnectionsEnt dlswTConnTcpOperPrefTcpConnections;

                                public final DlswTConnTcpOperTcpConnectionsEnt dlswTConnTcpOperTcpConnections;

                                private DlswTConnTcpOperEntryEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswTConnTcpOperEntry", "1.3.6.1.2.1.46.1.2.4.1.2.1", false, false, false, true);
                                    this.dlswTConnTcpOperKeepAliveInt = new DlswTConnTcpOperKeepAliveIntEnt(mib, this);
                                    this.dlswTConnTcpOperPrefTcpConnections = new DlswTConnTcpOperPrefTcpConnectionsEnt(mib, this);
                                    this.dlswTConnTcpOperTcpConnections = new DlswTConnTcpOperTcpConnectionsEnt(mib, this);
                                    this.entries = new MIBEntry<?>[] {
                                        this.dlswTConnTcpOperKeepAliveInt,
                                        this.dlswTConnTcpOperPrefTcpConnections,
                                        this.dlswTConnTcpOperTcpConnections
                                    };
                                }
                                public static final class DlswTConnTcpOperKeepAliveIntEnt extends MIBEntry<DLSWMIBDef>
                                {
                                    private DlswTConnTcpOperKeepAliveIntEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                    {
                                        super(mib, parent, "dlswTConnTcpOperKeepAliveInt", "1.3.6.1.2.1.46.1.2.4.1.2.1.1", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class DlswTConnTcpOperPrefTcpConnectionsEnt extends MIBEntry<DLSWMIBDef>
                                {
                                    private DlswTConnTcpOperPrefTcpConnectionsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                    {
                                        super(mib, parent, "dlswTConnTcpOperPrefTcpConnections", "1.3.6.1.2.1.46.1.2.4.1.2.1.2", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class DlswTConnTcpOperTcpConnectionsEnt extends MIBEntry<DLSWMIBDef>
                                {
                                    private DlswTConnTcpOperTcpConnectionsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                    {
                                        super(mib, parent, "dlswTConnTcpOperTcpConnections", "1.3.6.1.2.1.46.1.2.4.1.2.1.3", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                            }

                        }

                    }

                }

            }

            public static final class DlswInterfaceEnt extends MIBEntry<DLSWMIBDef>
            {
                /** *******************************************************************DLSW INTERFACE GROUP********************************************************************/
                public final DlswIfTableEnt dlswIfTable;

                private DlswInterfaceEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                {
                    super(mib, parent, "dlswInterface", "1.3.6.1.2.1.46.1.3", false, false, false, false);
                    this.dlswIfTable = new DlswIfTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dlswIfTable
                    };
                }
                public static final class DlswIfTableEnt extends MIBEntry<DLSWMIBDef>
                {
                    public final DlswIfEntryEnt dlswIfEntry;

                    private DlswIfTableEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswIfTable", "1.3.6.1.2.1.46.1.3.1", false, true, false, false);
                        this.dlswIfEntry = new DlswIfEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dlswIfEntry
                        };
                    }
                    public static final class DlswIfEntryEnt extends MIBEntry<DLSWMIBDef>
                    {
                        public final DlswIfRowStatusEnt dlswIfRowStatus;

                        public final DlswIfVirtualSegmentEnt dlswIfVirtualSegment;

                        public final DlswIfSapListEnt dlswIfSapList;

                        private DlswIfEntryEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswIfEntry", "1.3.6.1.2.1.46.1.3.1.1", false, false, false, true);
                            this.dlswIfRowStatus = new DlswIfRowStatusEnt(mib, this);
                            this.dlswIfVirtualSegment = new DlswIfVirtualSegmentEnt(mib, this);
                            this.dlswIfSapList = new DlswIfSapListEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dlswIfRowStatus,
                                this.dlswIfVirtualSegment,
                                this.dlswIfSapList
                            };
                        }
                        public static final class DlswIfRowStatusEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswIfRowStatusEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswIfRowStatus", "1.3.6.1.2.1.46.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswIfVirtualSegmentEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswIfVirtualSegmentEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswIfVirtualSegment", "1.3.6.1.2.1.46.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswIfSapListEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswIfSapListEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswIfSapList", "1.3.6.1.2.1.46.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DlswDirectoryEnt extends MIBEntry<DLSWMIBDef>
            {
                /** *******************************************************************DIRECTORYDirectory services caches the locations of MAC addressesand NetBIOS names.  For resources which are attached vialocal interfaces, the ifIndex may be cached, and forresources which are reachable via a DLSw partner, thetransport address of the DLSw partner is cached.*******************************************************************
----------------------------------
Directory Related Statistical Objects----------------------------------*/
                public final DlswDirStatEnt dlswDirStat;

                /** ----------------------------------
Directory Cache----------------------------------*/
                public final DlswDirCacheEnt dlswDirCache;

                /** ----------------------------------
Resource Locations----------------------------------*/
                public final DlswDirLocateEnt dlswDirLocate;

                private DlswDirectoryEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                {
                    super(mib, parent, "dlswDirectory", "1.3.6.1.2.1.46.1.4", false, false, false, false);
                    this.dlswDirStat = new DlswDirStatEnt(mib, this);
                    this.dlswDirCache = new DlswDirCacheEnt(mib, this);
                    this.dlswDirLocate = new DlswDirLocateEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dlswDirStat,
                        this.dlswDirCache,
                        this.dlswDirLocate
                    };
                }
                public static final class DlswDirStatEnt extends MIBEntry<DLSWMIBDef>
                {
                    public final DlswDirMacEntriesEnt dlswDirMacEntries;

                    public final DlswDirMacCacheHitsEnt dlswDirMacCacheHits;

                    public final DlswDirMacCacheMissesEnt dlswDirMacCacheMisses;

                    public final DlswDirMacCacheNextIndexEnt dlswDirMacCacheNextIndex;

                    public final DlswDirNBEntriesEnt dlswDirNBEntries;

                    public final DlswDirNBCacheHitsEnt dlswDirNBCacheHits;

                    public final DlswDirNBCacheMissesEnt dlswDirNBCacheMisses;

                    public final DlswDirNBCacheNextIndexEnt dlswDirNBCacheNextIndex;

                    private DlswDirStatEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswDirStat", "1.3.6.1.2.1.46.1.4.1", false, false, false, false);
                        this.dlswDirMacEntries = new DlswDirMacEntriesEnt(mib, this);
                        this.dlswDirMacCacheHits = new DlswDirMacCacheHitsEnt(mib, this);
                        this.dlswDirMacCacheMisses = new DlswDirMacCacheMissesEnt(mib, this);
                        this.dlswDirMacCacheNextIndex = new DlswDirMacCacheNextIndexEnt(mib, this);
                        this.dlswDirNBEntries = new DlswDirNBEntriesEnt(mib, this);
                        this.dlswDirNBCacheHits = new DlswDirNBCacheHitsEnt(mib, this);
                        this.dlswDirNBCacheMisses = new DlswDirNBCacheMissesEnt(mib, this);
                        this.dlswDirNBCacheNextIndex = new DlswDirNBCacheNextIndexEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dlswDirMacEntries,
                            this.dlswDirMacCacheHits,
                            this.dlswDirMacCacheMisses,
                            this.dlswDirMacCacheNextIndex,
                            this.dlswDirNBEntries,
                            this.dlswDirNBCacheHits,
                            this.dlswDirNBCacheMisses,
                            this.dlswDirNBCacheNextIndex
                        };
                    }
                    public static final class DlswDirMacEntriesEnt extends MIBEntry<DLSWMIBDef>
                    {
                        private DlswDirMacEntriesEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswDirMacEntries", "1.3.6.1.2.1.46.1.4.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlswDirMacCacheHitsEnt extends MIBEntry<DLSWMIBDef>
                    {
                        private DlswDirMacCacheHitsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswDirMacCacheHits", "1.3.6.1.2.1.46.1.4.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlswDirMacCacheMissesEnt extends MIBEntry<DLSWMIBDef>
                    {
                        private DlswDirMacCacheMissesEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswDirMacCacheMisses", "1.3.6.1.2.1.46.1.4.1.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlswDirMacCacheNextIndexEnt extends MIBEntry<DLSWMIBDef>
                    {
                        private DlswDirMacCacheNextIndexEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswDirMacCacheNextIndex", "1.3.6.1.2.1.46.1.4.1.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlswDirNBEntriesEnt extends MIBEntry<DLSWMIBDef>
                    {
                        private DlswDirNBEntriesEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswDirNBEntries", "1.3.6.1.2.1.46.1.4.1.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlswDirNBCacheHitsEnt extends MIBEntry<DLSWMIBDef>
                    {
                        private DlswDirNBCacheHitsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswDirNBCacheHits", "1.3.6.1.2.1.46.1.4.1.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlswDirNBCacheMissesEnt extends MIBEntry<DLSWMIBDef>
                    {
                        private DlswDirNBCacheMissesEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswDirNBCacheMisses", "1.3.6.1.2.1.46.1.4.1.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlswDirNBCacheNextIndexEnt extends MIBEntry<DLSWMIBDef>
                    {
                        private DlswDirNBCacheNextIndexEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswDirNBCacheNextIndex", "1.3.6.1.2.1.46.1.4.1.8", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class DlswDirCacheEnt extends MIBEntry<DLSWMIBDef>
                {
                    /** ...................................................................Directory for MAC Addresses.All Possible combinations of values of these objects.EntryType   LocationType       Location        Status------------------------------
userConfigured    local     ifEntry or 0.0     reachable, ornotReachable, orunknownuserConfigured    remote    TConnConfigEntry   reachable, ornotReachable, orunknownpartnerCapExMsg   remote    TConnOperEntry     unknowndynamic           local     ifEntry or 0.0     reachabledynamic           remote    TConnOperEntry     reachable...................................................................*/
                    public final DlswDirMacTableEnt dlswDirMacTable;

                    /** ...................................................................Directory for NetBIOS NamesAll Possible combinations of values of these objects.EntryType   LocationType       Location        Status------------------------------
userConfigured    local     ifEntry or 0.0     reachable, ornotReachable, orunknownuserConfigured    remote    TConnConfigEntry   reachable, ornotReachable, orunknownpartnerCapExMsg   remote    TConnOperEntry     unknowndynamic           local     ifEntry or 0.0     reachabledynamic           remote    TConnOperEntry     reachable...................................................................*/
                    public final DlswDirNBTableEnt dlswDirNBTable;

                    private DlswDirCacheEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswDirCache", "1.3.6.1.2.1.46.1.4.2", false, false, false, false);
                        this.dlswDirMacTable = new DlswDirMacTableEnt(mib, this);
                        this.dlswDirNBTable = new DlswDirNBTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dlswDirMacTable,
                            this.dlswDirNBTable
                        };
                    }
                    public static final class DlswDirMacTableEnt extends MIBEntry<DLSWMIBDef>
                    {
                        public final DlswDirMacEntryEnt dlswDirMacEntry;

                        private DlswDirMacTableEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswDirMacTable", "1.3.6.1.2.1.46.1.4.2.1", false, true, false, false);
                            this.dlswDirMacEntry = new DlswDirMacEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dlswDirMacEntry
                            };
                        }
                        public static final class DlswDirMacEntryEnt extends MIBEntry<DLSWMIBDef>
                        {
                            public final DlswDirMacIndexEnt dlswDirMacIndex;

                            public final DlswDirMacMacEnt dlswDirMacMac;

                            public final DlswDirMacMaskEnt dlswDirMacMask;

                            public final DlswDirMacEntryTypeEnt dlswDirMacEntryType;

                            public final DlswDirMacLocationTypeEnt dlswDirMacLocationType;

                            public final DlswDirMacLocationEnt dlswDirMacLocation;

                            public final DlswDirMacStatusEnt dlswDirMacStatus;

                            public final DlswDirMacLFSizeEnt dlswDirMacLFSize;

                            public final DlswDirMacRowStatusEnt dlswDirMacRowStatus;

                            private DlswDirMacEntryEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswDirMacEntry", "1.3.6.1.2.1.46.1.4.2.1.1", false, false, false, true);
                                this.dlswDirMacIndex = new DlswDirMacIndexEnt(mib, this);
                                this.dlswDirMacMac = new DlswDirMacMacEnt(mib, this);
                                this.dlswDirMacMask = new DlswDirMacMaskEnt(mib, this);
                                this.dlswDirMacEntryType = new DlswDirMacEntryTypeEnt(mib, this);
                                this.dlswDirMacLocationType = new DlswDirMacLocationTypeEnt(mib, this);
                                this.dlswDirMacLocation = new DlswDirMacLocationEnt(mib, this);
                                this.dlswDirMacStatus = new DlswDirMacStatusEnt(mib, this);
                                this.dlswDirMacLFSize = new DlswDirMacLFSizeEnt(mib, this);
                                this.dlswDirMacRowStatus = new DlswDirMacRowStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.dlswDirMacIndex,
                                    this.dlswDirMacMac,
                                    this.dlswDirMacMask,
                                    this.dlswDirMacEntryType,
                                    this.dlswDirMacLocationType,
                                    this.dlswDirMacLocation,
                                    this.dlswDirMacStatus,
                                    this.dlswDirMacLFSize,
                                    this.dlswDirMacRowStatus
                                };
                            }
                            public static final class DlswDirMacIndexEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirMacIndexEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirMacIndex", "1.3.6.1.2.1.46.1.4.2.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirMacMacEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirMacMacEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirMacMac", "1.3.6.1.2.1.46.1.4.2.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirMacMaskEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirMacMaskEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirMacMask", "1.3.6.1.2.1.46.1.4.2.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirMacEntryTypeEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirMacEntryTypeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirMacEntryType", "1.3.6.1.2.1.46.1.4.2.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirMacLocationTypeEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirMacLocationTypeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirMacLocationType", "1.3.6.1.2.1.46.1.4.2.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirMacLocationEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirMacLocationEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirMacLocation", "1.3.6.1.2.1.46.1.4.2.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirMacStatusEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirMacStatusEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirMacStatus", "1.3.6.1.2.1.46.1.4.2.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirMacLFSizeEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirMacLFSizeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirMacLFSize", "1.3.6.1.2.1.46.1.4.2.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirMacRowStatusEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirMacRowStatusEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirMacRowStatus", "1.3.6.1.2.1.46.1.4.2.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class DlswDirNBTableEnt extends MIBEntry<DLSWMIBDef>
                    {
                        public final DlswDirNBEntryEnt dlswDirNBEntry;

                        private DlswDirNBTableEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswDirNBTable", "1.3.6.1.2.1.46.1.4.2.2", false, true, false, false);
                            this.dlswDirNBEntry = new DlswDirNBEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dlswDirNBEntry
                            };
                        }
                        public static final class DlswDirNBEntryEnt extends MIBEntry<DLSWMIBDef>
                        {
                            public final DlswDirNBIndexEnt dlswDirNBIndex;

                            public final DlswDirNBNameEnt dlswDirNBName;

                            public final DlswDirNBNameTypeEnt dlswDirNBNameType;

                            public final DlswDirNBEntryTypeEnt dlswDirNBEntryType;

                            public final DlswDirNBLocationTypeEnt dlswDirNBLocationType;

                            public final DlswDirNBLocationEnt dlswDirNBLocation;

                            public final DlswDirNBStatusEnt dlswDirNBStatus;

                            public final DlswDirNBLFSizeEnt dlswDirNBLFSize;

                            public final DlswDirNBRowStatusEnt dlswDirNBRowStatus;

                            private DlswDirNBEntryEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswDirNBEntry", "1.3.6.1.2.1.46.1.4.2.2.1", false, false, false, true);
                                this.dlswDirNBIndex = new DlswDirNBIndexEnt(mib, this);
                                this.dlswDirNBName = new DlswDirNBNameEnt(mib, this);
                                this.dlswDirNBNameType = new DlswDirNBNameTypeEnt(mib, this);
                                this.dlswDirNBEntryType = new DlswDirNBEntryTypeEnt(mib, this);
                                this.dlswDirNBLocationType = new DlswDirNBLocationTypeEnt(mib, this);
                                this.dlswDirNBLocation = new DlswDirNBLocationEnt(mib, this);
                                this.dlswDirNBStatus = new DlswDirNBStatusEnt(mib, this);
                                this.dlswDirNBLFSize = new DlswDirNBLFSizeEnt(mib, this);
                                this.dlswDirNBRowStatus = new DlswDirNBRowStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.dlswDirNBIndex,
                                    this.dlswDirNBName,
                                    this.dlswDirNBNameType,
                                    this.dlswDirNBEntryType,
                                    this.dlswDirNBLocationType,
                                    this.dlswDirNBLocation,
                                    this.dlswDirNBStatus,
                                    this.dlswDirNBLFSize,
                                    this.dlswDirNBRowStatus
                                };
                            }
                            public static final class DlswDirNBIndexEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirNBIndexEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirNBIndex", "1.3.6.1.2.1.46.1.4.2.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirNBNameEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirNBNameEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirNBName", "1.3.6.1.2.1.46.1.4.2.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirNBNameTypeEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirNBNameTypeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirNBNameType", "1.3.6.1.2.1.46.1.4.2.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirNBEntryTypeEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirNBEntryTypeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirNBEntryType", "1.3.6.1.2.1.46.1.4.2.2.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirNBLocationTypeEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirNBLocationTypeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirNBLocationType", "1.3.6.1.2.1.46.1.4.2.2.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirNBLocationEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirNBLocationEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirNBLocation", "1.3.6.1.2.1.46.1.4.2.2.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirNBStatusEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirNBStatusEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirNBStatus", "1.3.6.1.2.1.46.1.4.2.2.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirNBLFSizeEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirNBLFSizeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirNBLFSize", "1.3.6.1.2.1.46.1.4.2.2.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirNBRowStatusEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirNBRowStatusEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirNBRowStatus", "1.3.6.1.2.1.46.1.4.2.2.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class DlswDirLocateEnt extends MIBEntry<DLSWMIBDef>
                {
                    /** ...................................................................Locate Entries in the dlswDirMacTable for a given MAC address...................................................................*/
                    public final DlswDirLocateMacTableEnt dlswDirLocateMacTable;

                    /** ...................................................................Locate Entries in the dlswDirNBTable for a given NetBIOS name...................................................................*/
                    public final DlswDirLocateNBTableEnt dlswDirLocateNBTable;

                    private DlswDirLocateEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswDirLocate", "1.3.6.1.2.1.46.1.4.3", false, false, false, false);
                        this.dlswDirLocateMacTable = new DlswDirLocateMacTableEnt(mib, this);
                        this.dlswDirLocateNBTable = new DlswDirLocateNBTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dlswDirLocateMacTable,
                            this.dlswDirLocateNBTable
                        };
                    }
                    public static final class DlswDirLocateMacTableEnt extends MIBEntry<DLSWMIBDef>
                    {
                        public final DlswDirLocateMacEntryEnt dlswDirLocateMacEntry;

                        private DlswDirLocateMacTableEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswDirLocateMacTable", "1.3.6.1.2.1.46.1.4.3.1", false, true, false, false);
                            this.dlswDirLocateMacEntry = new DlswDirLocateMacEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dlswDirLocateMacEntry
                            };
                        }
                        public static final class DlswDirLocateMacEntryEnt extends MIBEntry<DLSWMIBDef>
                        {
                            public final DlswDirLocateMacMacEnt dlswDirLocateMacMac;

                            public final DlswDirLocateMacMatchEnt dlswDirLocateMacMatch;

                            public final DlswDirLocateMacLocationEnt dlswDirLocateMacLocation;

                            private DlswDirLocateMacEntryEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswDirLocateMacEntry", "1.3.6.1.2.1.46.1.4.3.1.1", false, false, false, true);
                                this.dlswDirLocateMacMac = new DlswDirLocateMacMacEnt(mib, this);
                                this.dlswDirLocateMacMatch = new DlswDirLocateMacMatchEnt(mib, this);
                                this.dlswDirLocateMacLocation = new DlswDirLocateMacLocationEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.dlswDirLocateMacMac,
                                    this.dlswDirLocateMacMatch,
                                    this.dlswDirLocateMacLocation
                                };
                            }
                            public static final class DlswDirLocateMacMacEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirLocateMacMacEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirLocateMacMac", "1.3.6.1.2.1.46.1.4.3.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirLocateMacMatchEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirLocateMacMatchEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirLocateMacMatch", "1.3.6.1.2.1.46.1.4.3.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirLocateMacLocationEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirLocateMacLocationEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirLocateMacLocation", "1.3.6.1.2.1.46.1.4.3.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class DlswDirLocateNBTableEnt extends MIBEntry<DLSWMIBDef>
                    {
                        public final DlswDirLocateNBEntryEnt dlswDirLocateNBEntry;

                        private DlswDirLocateNBTableEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswDirLocateNBTable", "1.3.6.1.2.1.46.1.4.3.2", false, true, false, false);
                            this.dlswDirLocateNBEntry = new DlswDirLocateNBEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dlswDirLocateNBEntry
                            };
                        }
                        public static final class DlswDirLocateNBEntryEnt extends MIBEntry<DLSWMIBDef>
                        {
                            public final DlswDirLocateNBNameEnt dlswDirLocateNBName;

                            public final DlswDirLocateNBMatchEnt dlswDirLocateNBMatch;

                            public final DlswDirLocateNBLocationEnt dlswDirLocateNBLocation;

                            private DlswDirLocateNBEntryEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswDirLocateNBEntry", "1.3.6.1.2.1.46.1.4.3.2.1", false, false, false, true);
                                this.dlswDirLocateNBName = new DlswDirLocateNBNameEnt(mib, this);
                                this.dlswDirLocateNBMatch = new DlswDirLocateNBMatchEnt(mib, this);
                                this.dlswDirLocateNBLocation = new DlswDirLocateNBLocationEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.dlswDirLocateNBName,
                                    this.dlswDirLocateNBMatch,
                                    this.dlswDirLocateNBLocation
                                };
                            }
                            public static final class DlswDirLocateNBNameEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirLocateNBNameEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirLocateNBName", "1.3.6.1.2.1.46.1.4.3.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirLocateNBMatchEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirLocateNBMatchEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirLocateNBMatch", "1.3.6.1.2.1.46.1.4.3.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DlswDirLocateNBLocationEnt extends MIBEntry<DLSWMIBDef>
                            {
                                private DlswDirLocateNBLocationEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                                {
                                    super(mib, parent, "dlswDirLocateNBLocation", "1.3.6.1.2.1.46.1.4.3.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

            public static final class DlswCircuitEnt extends MIBEntry<DLSWMIBDef>
            {
                /** *******************************************************************CIRCUITA circuit is the end-to-end association of two DLSw entitiesthrough one or two DLSw nodes.  It is the concatenation oftwo "data links", optionally with an intervening transportconnection. The origin of the circuit is the end station thatinitiates the circuit.  The target of the circuit is the endstation that receives the initiation.*******************************************************************
----------------------------------
Statistics Related to Circuits----------------------------------*/
                public final DlswCircuitStatEnt dlswCircuitStat;

                /** ----------------------------------
Circuit TableThis table is the DLSw entity's view of circuits.  There will bea conceptual row in the table associated with each data link.The chart below lists the various possible combinations oforigin and target MAC locations and the number of entries inthis Circuit Table:number of       |    Origin End Station Locationentries in the    |--------------------
Circuit Table     |  internal     local       remote----------- |--------------------
Target    |  internal |     NA          2           1End       |  local    |     2           2           1Station   |  remote   |     1           1           NALocation  |           |NA: Not applicableNote:(a) IfIndex and RouteInfo are applied only if location is local.(b) TDomain and TAddr are applied only if location is remote.Most of statistics related to circuits can be collectedfrom LLC-2 Link Station Table.----------------------------------*/
                public final DlswCircuitTableEnt dlswCircuitTable;

                private DlswCircuitEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                {
                    super(mib, parent, "dlswCircuit", "1.3.6.1.2.1.46.1.5", false, false, false, false);
                    this.dlswCircuitStat = new DlswCircuitStatEnt(mib, this);
                    this.dlswCircuitTable = new DlswCircuitTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dlswCircuitStat,
                        this.dlswCircuitTable
                    };
                }
                public static final class DlswCircuitStatEnt extends MIBEntry<DLSWMIBDef>
                {
                    public final DlswCircuitStatActivesEnt dlswCircuitStatActives;

                    public final DlswCircuitStatCreatesEnt dlswCircuitStatCreates;

                    private DlswCircuitStatEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswCircuitStat", "1.3.6.1.2.1.46.1.5.1", false, false, false, false);
                        this.dlswCircuitStatActives = new DlswCircuitStatActivesEnt(mib, this);
                        this.dlswCircuitStatCreates = new DlswCircuitStatCreatesEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dlswCircuitStatActives,
                            this.dlswCircuitStatCreates
                        };
                    }
                    public static final class DlswCircuitStatActivesEnt extends MIBEntry<DLSWMIBDef>
                    {
                        private DlswCircuitStatActivesEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswCircuitStatActives", "1.3.6.1.2.1.46.1.5.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlswCircuitStatCreatesEnt extends MIBEntry<DLSWMIBDef>
                    {
                        private DlswCircuitStatCreatesEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswCircuitStatCreates", "1.3.6.1.2.1.46.1.5.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class DlswCircuitTableEnt extends MIBEntry<DLSWMIBDef>
                {
                    public final DlswCircuitEntryEnt dlswCircuitEntry;

                    private DlswCircuitTableEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswCircuitTable", "1.3.6.1.2.1.46.1.5.2", false, true, false, false);
                        this.dlswCircuitEntry = new DlswCircuitEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dlswCircuitEntry
                        };
                    }
                    public static final class DlswCircuitEntryEnt extends MIBEntry<DLSWMIBDef>
                    {
                        /** ...................................................................Information related to the End Station 1 (S1)....................................................................*/
                        public final DlswCircuitS1MacEnt dlswCircuitS1Mac;

                        public final DlswCircuitS1SapEnt dlswCircuitS1Sap;

                        public final DlswCircuitS1IfIndexEnt dlswCircuitS1IfIndex;

                        public final DlswCircuitS1DlcTypeEnt dlswCircuitS1DlcType;

                        public final DlswCircuitS1RouteInfoEnt dlswCircuitS1RouteInfo;

                        public final DlswCircuitS1CircuitIdEnt dlswCircuitS1CircuitId;

                        public final DlswCircuitS1DlcEnt dlswCircuitS1Dlc;

                        /** ...................................................................Information related to the End Station 2 (S2)....................................................................*/
                        public final DlswCircuitS2MacEnt dlswCircuitS2Mac;

                        public final DlswCircuitS2SapEnt dlswCircuitS2Sap;

                        public final DlswCircuitS2LocationEnt dlswCircuitS2Location;

                        public final DlswCircuitS2TDomainEnt dlswCircuitS2TDomain;

                        public final DlswCircuitS2TAddressEnt dlswCircuitS2TAddress;

                        public final DlswCircuitS2CircuitIdEnt dlswCircuitS2CircuitId;

                        /** ...................................................................*/
                        public final DlswCircuitOriginEnt dlswCircuitOrigin;

                        /** ...................................................................Operational information related to this circuit....................................................................*/
                        public final DlswCircuitEntryTimeEnt dlswCircuitEntryTime;

                        public final DlswCircuitStateTimeEnt dlswCircuitStateTime;

                        public final DlswCircuitStateEnt dlswCircuitState;

                        public final DlswCircuitPriorityEnt dlswCircuitPriority;

                        /** ...................................................................Pacing Objects:These objects are applicable if DLSw is using the SSP circuitpacing protocol to control the flow between the two data linksin this circuit....................................................................*/
                        public final DlswCircuitFCSendGrantedUnitsEnt dlswCircuitFCSendGrantedUnits;

                        public final DlswCircuitFCSendCurrentWndwEnt dlswCircuitFCSendCurrentWndw;

                        public final DlswCircuitFCRecvGrantedUnitsEnt dlswCircuitFCRecvGrantedUnits;

                        public final DlswCircuitFCRecvCurrentWndwEnt dlswCircuitFCRecvCurrentWndw;

                        public final DlswCircuitFCLargestRecvGrantedEnt dlswCircuitFCLargestRecvGranted;

                        public final DlswCircuitFCLargestSendGrantedEnt dlswCircuitFCLargestSendGranted;

                        public final DlswCircuitFCHalveWndwSentsEnt dlswCircuitFCHalveWndwSents;

                        public final DlswCircuitFCResetOpSentsEnt dlswCircuitFCResetOpSents;

                        public final DlswCircuitFCHalveWndwRcvdsEnt dlswCircuitFCHalveWndwRcvds;

                        public final DlswCircuitFCResetOpRcvdsEnt dlswCircuitFCResetOpRcvds;

                        /** ...................................................................Information about the circuit disconnection...................................................................*/
                        public final DlswCircuitDiscReasonLocalEnt dlswCircuitDiscReasonLocal;

                        public final DlswCircuitDiscReasonRemoteEnt dlswCircuitDiscReasonRemote;

                        public final DlswCircuitDiscReasonRemoteDataEnt dlswCircuitDiscReasonRemoteData;

                        private DlswCircuitEntryEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswCircuitEntry", "1.3.6.1.2.1.46.1.5.2.1", false, false, false, true);
                            this.dlswCircuitS1Mac = new DlswCircuitS1MacEnt(mib, this);
                            this.dlswCircuitS1Sap = new DlswCircuitS1SapEnt(mib, this);
                            this.dlswCircuitS1IfIndex = new DlswCircuitS1IfIndexEnt(mib, this);
                            this.dlswCircuitS1DlcType = new DlswCircuitS1DlcTypeEnt(mib, this);
                            this.dlswCircuitS1RouteInfo = new DlswCircuitS1RouteInfoEnt(mib, this);
                            this.dlswCircuitS1CircuitId = new DlswCircuitS1CircuitIdEnt(mib, this);
                            this.dlswCircuitS1Dlc = new DlswCircuitS1DlcEnt(mib, this);
                            this.dlswCircuitS2Mac = new DlswCircuitS2MacEnt(mib, this);
                            this.dlswCircuitS2Sap = new DlswCircuitS2SapEnt(mib, this);
                            this.dlswCircuitS2Location = new DlswCircuitS2LocationEnt(mib, this);
                            this.dlswCircuitS2TDomain = new DlswCircuitS2TDomainEnt(mib, this);
                            this.dlswCircuitS2TAddress = new DlswCircuitS2TAddressEnt(mib, this);
                            this.dlswCircuitS2CircuitId = new DlswCircuitS2CircuitIdEnt(mib, this);
                            this.dlswCircuitOrigin = new DlswCircuitOriginEnt(mib, this);
                            this.dlswCircuitEntryTime = new DlswCircuitEntryTimeEnt(mib, this);
                            this.dlswCircuitStateTime = new DlswCircuitStateTimeEnt(mib, this);
                            this.dlswCircuitState = new DlswCircuitStateEnt(mib, this);
                            this.dlswCircuitPriority = new DlswCircuitPriorityEnt(mib, this);
                            this.dlswCircuitFCSendGrantedUnits = new DlswCircuitFCSendGrantedUnitsEnt(mib, this);
                            this.dlswCircuitFCSendCurrentWndw = new DlswCircuitFCSendCurrentWndwEnt(mib, this);
                            this.dlswCircuitFCRecvGrantedUnits = new DlswCircuitFCRecvGrantedUnitsEnt(mib, this);
                            this.dlswCircuitFCRecvCurrentWndw = new DlswCircuitFCRecvCurrentWndwEnt(mib, this);
                            this.dlswCircuitFCLargestRecvGranted = new DlswCircuitFCLargestRecvGrantedEnt(mib, this);
                            this.dlswCircuitFCLargestSendGranted = new DlswCircuitFCLargestSendGrantedEnt(mib, this);
                            this.dlswCircuitFCHalveWndwSents = new DlswCircuitFCHalveWndwSentsEnt(mib, this);
                            this.dlswCircuitFCResetOpSents = new DlswCircuitFCResetOpSentsEnt(mib, this);
                            this.dlswCircuitFCHalveWndwRcvds = new DlswCircuitFCHalveWndwRcvdsEnt(mib, this);
                            this.dlswCircuitFCResetOpRcvds = new DlswCircuitFCResetOpRcvdsEnt(mib, this);
                            this.dlswCircuitDiscReasonLocal = new DlswCircuitDiscReasonLocalEnt(mib, this);
                            this.dlswCircuitDiscReasonRemote = new DlswCircuitDiscReasonRemoteEnt(mib, this);
                            this.dlswCircuitDiscReasonRemoteData = new DlswCircuitDiscReasonRemoteDataEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dlswCircuitS1Mac,
                                this.dlswCircuitS1Sap,
                                this.dlswCircuitS1IfIndex,
                                this.dlswCircuitS1DlcType,
                                this.dlswCircuitS1RouteInfo,
                                this.dlswCircuitS1CircuitId,
                                this.dlswCircuitS1Dlc,
                                this.dlswCircuitS2Mac,
                                this.dlswCircuitS2Sap,
                                this.dlswCircuitS2Location,
                                this.dlswCircuitS2TDomain,
                                this.dlswCircuitS2TAddress,
                                this.dlswCircuitS2CircuitId,
                                this.dlswCircuitOrigin,
                                this.dlswCircuitEntryTime,
                                this.dlswCircuitStateTime,
                                this.dlswCircuitState,
                                this.dlswCircuitPriority,
                                this.dlswCircuitFCSendGrantedUnits,
                                this.dlswCircuitFCSendCurrentWndw,
                                this.dlswCircuitFCRecvGrantedUnits,
                                this.dlswCircuitFCRecvCurrentWndw,
                                this.dlswCircuitFCLargestRecvGranted,
                                this.dlswCircuitFCLargestSendGranted,
                                this.dlswCircuitFCHalveWndwSents,
                                this.dlswCircuitFCResetOpSents,
                                this.dlswCircuitFCHalveWndwRcvds,
                                this.dlswCircuitFCResetOpRcvds,
                                this.dlswCircuitDiscReasonLocal,
                                this.dlswCircuitDiscReasonRemote,
                                this.dlswCircuitDiscReasonRemoteData
                            };
                        }
                        public static final class DlswCircuitS1MacEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitS1MacEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitS1Mac", "1.3.6.1.2.1.46.1.5.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitS1SapEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitS1SapEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitS1Sap", "1.3.6.1.2.1.46.1.5.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitS1IfIndexEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitS1IfIndexEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitS1IfIndex", "1.3.6.1.2.1.46.1.5.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitS1DlcTypeEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitS1DlcTypeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitS1DlcType", "1.3.6.1.2.1.46.1.5.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitS1RouteInfoEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitS1RouteInfoEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitS1RouteInfo", "1.3.6.1.2.1.46.1.5.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitS1CircuitIdEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitS1CircuitIdEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitS1CircuitId", "1.3.6.1.2.1.46.1.5.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitS1DlcEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitS1DlcEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitS1Dlc", "1.3.6.1.2.1.46.1.5.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitS2MacEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitS2MacEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitS2Mac", "1.3.6.1.2.1.46.1.5.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitS2SapEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitS2SapEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitS2Sap", "1.3.6.1.2.1.46.1.5.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitS2LocationEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitS2LocationEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitS2Location", "1.3.6.1.2.1.46.1.5.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitS2TDomainEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitS2TDomainEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitS2TDomain", "1.3.6.1.2.1.46.1.5.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitS2TAddressEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitS2TAddressEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitS2TAddress", "1.3.6.1.2.1.46.1.5.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitS2CircuitIdEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitS2CircuitIdEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitS2CircuitId", "1.3.6.1.2.1.46.1.5.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitOriginEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitOriginEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitOrigin", "1.3.6.1.2.1.46.1.5.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitEntryTimeEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitEntryTimeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitEntryTime", "1.3.6.1.2.1.46.1.5.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitStateTimeEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitStateTimeEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitStateTime", "1.3.6.1.2.1.46.1.5.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitStateEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitStateEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitState", "1.3.6.1.2.1.46.1.5.2.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitPriorityEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitPriorityEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitPriority", "1.3.6.1.2.1.46.1.5.2.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitFCSendGrantedUnitsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitFCSendGrantedUnitsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitFCSendGrantedUnits", "1.3.6.1.2.1.46.1.5.2.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitFCSendCurrentWndwEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitFCSendCurrentWndwEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitFCSendCurrentWndw", "1.3.6.1.2.1.46.1.5.2.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitFCRecvGrantedUnitsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitFCRecvGrantedUnitsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitFCRecvGrantedUnits", "1.3.6.1.2.1.46.1.5.2.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitFCRecvCurrentWndwEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitFCRecvCurrentWndwEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitFCRecvCurrentWndw", "1.3.6.1.2.1.46.1.5.2.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitFCLargestRecvGrantedEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitFCLargestRecvGrantedEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitFCLargestRecvGranted", "1.3.6.1.2.1.46.1.5.2.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitFCLargestSendGrantedEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitFCLargestSendGrantedEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitFCLargestSendGranted", "1.3.6.1.2.1.46.1.5.2.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitFCHalveWndwSentsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitFCHalveWndwSentsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitFCHalveWndwSents", "1.3.6.1.2.1.46.1.5.2.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitFCResetOpSentsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitFCResetOpSentsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitFCResetOpSents", "1.3.6.1.2.1.46.1.5.2.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitFCHalveWndwRcvdsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitFCHalveWndwRcvdsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitFCHalveWndwRcvds", "1.3.6.1.2.1.46.1.5.2.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitFCResetOpRcvdsEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitFCResetOpRcvdsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitFCResetOpRcvds", "1.3.6.1.2.1.46.1.5.2.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitDiscReasonLocalEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitDiscReasonLocalEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitDiscReasonLocal", "1.3.6.1.2.1.46.1.5.2.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitDiscReasonRemoteEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitDiscReasonRemoteEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitDiscReasonRemote", "1.3.6.1.2.1.46.1.5.2.1.30", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswCircuitDiscReasonRemoteDataEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswCircuitDiscReasonRemoteDataEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswCircuitDiscReasonRemoteData", "1.3.6.1.2.1.46.1.5.2.1.31", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DlswSdlcEnt extends MIBEntry<DLSWMIBDef>
            {
                /** ...................................................................Statistics related to this circuit.All statistics are in LLC-2 Link Station Statistical Table.All SDLC statistics are in SDLC MIB...................................................................

*******************************************************************DLSW SDLC EXTENSION********************************************************************/
                public final DlswSdlcLsEntriesEnt dlswSdlcLsEntries;

                /** ...................................................................*/
                public final DlswSdlcLsTableEnt dlswSdlcLsTable;

                private DlswSdlcEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                {
                    super(mib, parent, "dlswSdlc", "1.3.6.1.2.1.46.1.6", false, false, false, false);
                    this.dlswSdlcLsEntries = new DlswSdlcLsEntriesEnt(mib, this);
                    this.dlswSdlcLsTable = new DlswSdlcLsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dlswSdlcLsEntries,
                        this.dlswSdlcLsTable
                    };
                }
                public static final class DlswSdlcLsEntriesEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswSdlcLsEntriesEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswSdlcLsEntries", "1.3.6.1.2.1.46.1.6.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswSdlcLsTableEnt extends MIBEntry<DLSWMIBDef>
                {
                    public final DlswSdlcLsEntryEnt dlswSdlcLsEntry;

                    private DlswSdlcLsTableEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswSdlcLsTable", "1.3.6.1.2.1.46.1.6.2", false, true, false, false);
                        this.dlswSdlcLsEntry = new DlswSdlcLsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dlswSdlcLsEntry
                        };
                    }
                    public static final class DlswSdlcLsEntryEnt extends MIBEntry<DLSWMIBDef>
                    {
                        public final DlswSdlcLsLocalMacEnt dlswSdlcLsLocalMac;

                        public final DlswSdlcLsLocalSapEnt dlswSdlcLsLocalSap;

                        public final DlswSdlcLsLocalIdBlockEnt dlswSdlcLsLocalIdBlock;

                        public final DlswSdlcLsLocalIdNumEnt dlswSdlcLsLocalIdNum;

                        public final DlswSdlcLsRemoteMacEnt dlswSdlcLsRemoteMac;

                        public final DlswSdlcLsRemoteSapEnt dlswSdlcLsRemoteSap;

                        public final DlswSdlcLsRowStatusEnt dlswSdlcLsRowStatus;

                        private DlswSdlcLsEntryEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                        {
                            super(mib, parent, "dlswSdlcLsEntry", "1.3.6.1.2.1.46.1.6.2.1", false, false, false, true);
                            this.dlswSdlcLsLocalMac = new DlswSdlcLsLocalMacEnt(mib, this);
                            this.dlswSdlcLsLocalSap = new DlswSdlcLsLocalSapEnt(mib, this);
                            this.dlswSdlcLsLocalIdBlock = new DlswSdlcLsLocalIdBlockEnt(mib, this);
                            this.dlswSdlcLsLocalIdNum = new DlswSdlcLsLocalIdNumEnt(mib, this);
                            this.dlswSdlcLsRemoteMac = new DlswSdlcLsRemoteMacEnt(mib, this);
                            this.dlswSdlcLsRemoteSap = new DlswSdlcLsRemoteSapEnt(mib, this);
                            this.dlswSdlcLsRowStatus = new DlswSdlcLsRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dlswSdlcLsLocalMac,
                                this.dlswSdlcLsLocalSap,
                                this.dlswSdlcLsLocalIdBlock,
                                this.dlswSdlcLsLocalIdNum,
                                this.dlswSdlcLsRemoteMac,
                                this.dlswSdlcLsRemoteSap,
                                this.dlswSdlcLsRowStatus
                            };
                        }
                        public static final class DlswSdlcLsLocalMacEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswSdlcLsLocalMacEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswSdlcLsLocalMac", "1.3.6.1.2.1.46.1.6.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswSdlcLsLocalSapEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswSdlcLsLocalSapEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswSdlcLsLocalSap", "1.3.6.1.2.1.46.1.6.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswSdlcLsLocalIdBlockEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswSdlcLsLocalIdBlockEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswSdlcLsLocalIdBlock", "1.3.6.1.2.1.46.1.6.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswSdlcLsLocalIdNumEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswSdlcLsLocalIdNumEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswSdlcLsLocalIdNum", "1.3.6.1.2.1.46.1.6.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswSdlcLsRemoteMacEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswSdlcLsRemoteMacEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswSdlcLsRemoteMac", "1.3.6.1.2.1.46.1.6.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswSdlcLsRemoteSapEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswSdlcLsRemoteSapEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswSdlcLsRemoteSap", "1.3.6.1.2.1.46.1.6.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlswSdlcLsRowStatusEnt extends MIBEntry<DLSWMIBDef>
                        {
                            private DlswSdlcLsRowStatusEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                            {
                                super(mib, parent, "dlswSdlcLsRowStatus", "1.3.6.1.2.1.46.1.6.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DlswTrapsEnt extends MIBEntry<DLSWMIBDef>
            {
                /** ----------------------------------
This section defines the well-known notifications sent byDLSW agents.Care must be taken to insure that no particular notificationis sent to a single receiving entity more often than onceevery five seconds.Traps includes:(1) Partner rejected (capEx rejection, not in partner list, etc.)(2) DLSw protocol violation (e.g., window size violation, etc.)(3) Transport connection up/down
(4) Circuit up/down----------------------------------*/
                public final DlswTrapTConnPartnerRejectEnt dlswTrapTConnPartnerReject;

                public final DlswTrapTConnProtViolationEnt dlswTrapTConnProtViolation;

                public final DlswTrapTConnUpEnt dlswTrapTConnUp;

                public final DlswTrapTConnDownEnt dlswTrapTConnDown;

                public final DlswTrapCircuitUpEnt dlswTrapCircuitUp;

                public final DlswTrapCircuitDownEnt dlswTrapCircuitDown;

                private DlswTrapsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                {
                    super(mib, parent, "dlswTraps", "1.3.6.1.2.1.46.1.0", false, false, false, false);
                    this.dlswTrapTConnPartnerReject = new DlswTrapTConnPartnerRejectEnt(mib, this);
                    this.dlswTrapTConnProtViolation = new DlswTrapTConnProtViolationEnt(mib, this);
                    this.dlswTrapTConnUp = new DlswTrapTConnUpEnt(mib, this);
                    this.dlswTrapTConnDown = new DlswTrapTConnDownEnt(mib, this);
                    this.dlswTrapCircuitUp = new DlswTrapCircuitUpEnt(mib, this);
                    this.dlswTrapCircuitDown = new DlswTrapCircuitDownEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dlswTrapTConnPartnerReject,
                        this.dlswTrapTConnProtViolation,
                        this.dlswTrapTConnUp,
                        this.dlswTrapTConnDown,
                        this.dlswTrapCircuitUp,
                        this.dlswTrapCircuitDown
                    };
                }
                public static final class DlswTrapTConnPartnerRejectEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswTrapTConnPartnerRejectEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTrapTConnPartnerReject", "1.3.6.1.2.1.46.1.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswTrapTConnProtViolationEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswTrapTConnProtViolationEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTrapTConnProtViolation", "1.3.6.1.2.1.46.1.0.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswTrapTConnUpEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswTrapTConnUpEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTrapTConnUp", "1.3.6.1.2.1.46.1.0.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswTrapTConnDownEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswTrapTConnDownEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTrapTConnDown", "1.3.6.1.2.1.46.1.0.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswTrapCircuitUpEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswTrapCircuitUpEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTrapCircuitUp", "1.3.6.1.2.1.46.1.0.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswTrapCircuitDownEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswTrapCircuitDownEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTrapCircuitDown", "1.3.6.1.2.1.46.1.0.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class DlswDomainsEnt extends MIBEntry<DLSWMIBDef>
        {
            /** *******************************************************************DLSw Transport Domain definitions*******************************************************************
DLSw over TCP*/
            public final DlswTCPDomainEnt dlswTCPDomain;

            private DlswDomainsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
            {
                super(mib, parent, "dlswDomains", "1.3.6.1.2.1.46.2", false, false, false, false);
                this.dlswTCPDomain = new DlswTCPDomainEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dlswTCPDomain
                };
            }
            public static final class DlswTCPDomainEnt extends MIBEntry<DLSWMIBDef>
            {
                private DlswTCPDomainEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                {
                    super(mib, parent, "dlswTCPDomain", "1.3.6.1.2.1.46.2.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class DlswConformanceEnt extends MIBEntry<DLSWMIBDef>
        {
            public final DlswCompliancesEnt dlswCompliances;

            public final DlswGroupsEnt dlswGroups;

            private DlswConformanceEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
            {
                super(mib, parent, "dlswConformance", "1.3.6.1.2.1.46.3", false, false, false, false);
                this.dlswCompliances = new DlswCompliancesEnt(mib, this);
                this.dlswGroups = new DlswGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dlswCompliances,
                    this.dlswGroups
                };
            }
            public static final class DlswCompliancesEnt extends MIBEntry<DLSWMIBDef>
            {
                /** ----------------------------------
COMPLIANCE STATEMENTS----------------------------------

...................................................................Core compliance for all DLSw entities...................................................................*/
                public final DlswCoreComplianceEnt dlswCoreCompliance;

                /** ...................................................................Compliance for all DLSw entities that provide TCP transport....................................................................*/
                public final DlswTConnTcpComplianceEnt dlswTConnTcpCompliance;

                /** ...................................................................Compliance for all DLSw Entities that implement a directory...................................................................*/
                public final DlswDirComplianceEnt dlswDirCompliance;

                /** ...................................................................Compliance for all DLSw entities that provide an orderedlist of directory entries that match a resource...................................................................*/
                public final DlswDirLocateComplianceEnt dlswDirLocateCompliance;

                /** ...................................................................Compliance for all DLSw entities that support SDLC end stations...................................................................*/
                public final DlswSdlcComplianceEnt dlswSdlcCompliance;

                private DlswCompliancesEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                {
                    super(mib, parent, "dlswCompliances", "1.3.6.1.2.1.46.3.1", false, false, false, false);
                    this.dlswCoreCompliance = new DlswCoreComplianceEnt(mib, this);
                    this.dlswTConnTcpCompliance = new DlswTConnTcpComplianceEnt(mib, this);
                    this.dlswDirCompliance = new DlswDirComplianceEnt(mib, this);
                    this.dlswDirLocateCompliance = new DlswDirLocateComplianceEnt(mib, this);
                    this.dlswSdlcCompliance = new DlswSdlcComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dlswCoreCompliance,
                        this.dlswTConnTcpCompliance,
                        this.dlswDirCompliance,
                        this.dlswDirLocateCompliance,
                        this.dlswSdlcCompliance
                    };
                }
                public static final class DlswCoreComplianceEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswCoreComplianceEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswCoreCompliance", "1.3.6.1.2.1.46.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswTConnTcpComplianceEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswTConnTcpComplianceEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTConnTcpCompliance", "1.3.6.1.2.1.46.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswDirComplianceEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswDirComplianceEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswDirCompliance", "1.3.6.1.2.1.46.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswDirLocateComplianceEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswDirLocateComplianceEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswDirLocateCompliance", "1.3.6.1.2.1.46.3.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswSdlcComplianceEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswSdlcComplianceEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswSdlcCompliance", "1.3.6.1.2.1.46.3.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DlswGroupsEnt extends MIBEntry<DLSWMIBDef>
            {
                /** ----------------------------------
CONFORMANCE GROUPS----------------------------------

...................................................................Node Conformance Group...................................................................*/
                public final DlswNodeGroupEnt dlswNodeGroup;

                /** ...................................................................*/
                public final DlswNodeNBGroupEnt dlswNodeNBGroup;

                /** ...................................................................*/
                public final DlswTConnStatGroupEnt dlswTConnStatGroup;

                /** ...................................................................*/
                public final DlswTConnConfigGroupEnt dlswTConnConfigGroup;

                /** ...................................................................*/
                public final DlswTConnOperGroupEnt dlswTConnOperGroup;

                /** ...................................................................*/
                public final DlswTConnNBGroupEnt dlswTConnNBGroup;

                /** ...................................................................*/
                public final DlswTConnTcpConfigGroupEnt dlswTConnTcpConfigGroup;

                /** ...................................................................*/
                public final DlswTConnTcpOperGroupEnt dlswTConnTcpOperGroup;

                /** ...................................................................*/
                public final DlswInterfaceGroupEnt dlswInterfaceGroup;

                /** ...................................................................*/
                public final DlswDirGroupEnt dlswDirGroup;

                /** ...................................................................*/
                public final DlswDirNBGroupEnt dlswDirNBGroup;

                /** ...................................................................*/
                public final DlswDirLocateGroupEnt dlswDirLocateGroup;

                /** ...................................................................*/
                public final DlswDirLocateNBGroupEnt dlswDirLocateNBGroup;

                /** ...................................................................*/
                public final DlswCircuitStatGroupEnt dlswCircuitStatGroup;

                /** ...................................................................*/
                public final DlswCircuitGroupEnt dlswCircuitGroup;

                /** ...................................................................*/
                public final DlswSdlcGroupEnt dlswSdlcGroup;

                /** ...................................................................*/
                public final DlswNotificationGroupEnt dlswNotificationGroup;

                private DlswGroupsEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                {
                    super(mib, parent, "dlswGroups", "1.3.6.1.2.1.46.3.2", false, false, false, false);
                    this.dlswNodeGroup = new DlswNodeGroupEnt(mib, this);
                    this.dlswNodeNBGroup = new DlswNodeNBGroupEnt(mib, this);
                    this.dlswTConnStatGroup = new DlswTConnStatGroupEnt(mib, this);
                    this.dlswTConnConfigGroup = new DlswTConnConfigGroupEnt(mib, this);
                    this.dlswTConnOperGroup = new DlswTConnOperGroupEnt(mib, this);
                    this.dlswTConnNBGroup = new DlswTConnNBGroupEnt(mib, this);
                    this.dlswTConnTcpConfigGroup = new DlswTConnTcpConfigGroupEnt(mib, this);
                    this.dlswTConnTcpOperGroup = new DlswTConnTcpOperGroupEnt(mib, this);
                    this.dlswInterfaceGroup = new DlswInterfaceGroupEnt(mib, this);
                    this.dlswDirGroup = new DlswDirGroupEnt(mib, this);
                    this.dlswDirNBGroup = new DlswDirNBGroupEnt(mib, this);
                    this.dlswDirLocateGroup = new DlswDirLocateGroupEnt(mib, this);
                    this.dlswDirLocateNBGroup = new DlswDirLocateNBGroupEnt(mib, this);
                    this.dlswCircuitStatGroup = new DlswCircuitStatGroupEnt(mib, this);
                    this.dlswCircuitGroup = new DlswCircuitGroupEnt(mib, this);
                    this.dlswSdlcGroup = new DlswSdlcGroupEnt(mib, this);
                    this.dlswNotificationGroup = new DlswNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dlswNodeGroup,
                        this.dlswNodeNBGroup,
                        this.dlswTConnStatGroup,
                        this.dlswTConnConfigGroup,
                        this.dlswTConnOperGroup,
                        this.dlswTConnNBGroup,
                        this.dlswTConnTcpConfigGroup,
                        this.dlswTConnTcpOperGroup,
                        this.dlswInterfaceGroup,
                        this.dlswDirGroup,
                        this.dlswDirNBGroup,
                        this.dlswDirLocateGroup,
                        this.dlswDirLocateNBGroup,
                        this.dlswCircuitStatGroup,
                        this.dlswCircuitGroup,
                        this.dlswSdlcGroup,
                        this.dlswNotificationGroup
                    };
                }
                public static final class DlswNodeGroupEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswNodeGroupEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswNodeGroup", "1.3.6.1.2.1.46.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswNodeNBGroupEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswNodeNBGroupEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswNodeNBGroup", "1.3.6.1.2.1.46.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswTConnStatGroupEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswTConnStatGroupEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTConnStatGroup", "1.3.6.1.2.1.46.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswTConnConfigGroupEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswTConnConfigGroupEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTConnConfigGroup", "1.3.6.1.2.1.46.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswTConnOperGroupEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswTConnOperGroupEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTConnOperGroup", "1.3.6.1.2.1.46.3.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswTConnNBGroupEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswTConnNBGroupEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTConnNBGroup", "1.3.6.1.2.1.46.3.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswTConnTcpConfigGroupEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswTConnTcpConfigGroupEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTConnTcpConfigGroup", "1.3.6.1.2.1.46.3.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswTConnTcpOperGroupEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswTConnTcpOperGroupEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswTConnTcpOperGroup", "1.3.6.1.2.1.46.3.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswInterfaceGroupEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswInterfaceGroupEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswInterfaceGroup", "1.3.6.1.2.1.46.3.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswDirGroupEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswDirGroupEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswDirGroup", "1.3.6.1.2.1.46.3.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswDirNBGroupEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswDirNBGroupEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswDirNBGroup", "1.3.6.1.2.1.46.3.2.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswDirLocateGroupEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswDirLocateGroupEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswDirLocateGroup", "1.3.6.1.2.1.46.3.2.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswDirLocateNBGroupEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswDirLocateNBGroupEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswDirLocateNBGroup", "1.3.6.1.2.1.46.3.2.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswCircuitStatGroupEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswCircuitStatGroupEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswCircuitStatGroup", "1.3.6.1.2.1.46.3.2.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswCircuitGroupEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswCircuitGroupEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswCircuitGroup", "1.3.6.1.2.1.46.3.2.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswSdlcGroupEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswSdlcGroupEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswSdlcGroup", "1.3.6.1.2.1.46.3.2.16", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DlswNotificationGroupEnt extends MIBEntry<DLSWMIBDef>
                {
                    private DlswNotificationGroupEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
                    {
                        super(mib, parent, "dlswNotificationGroup", "1.3.6.1.2.1.46.3.2.17", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class ZeroDotZeroEnt extends MIBEntry<DLSWMIBDef>
    {
        private ZeroDotZeroEnt(DLSWMIBDef mib, MIBEntry<DLSWMIBDef> parent)
        {
            super(mib, parent, "zeroDotZero", "0.0", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
