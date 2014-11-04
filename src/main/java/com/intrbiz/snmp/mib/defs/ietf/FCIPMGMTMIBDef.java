package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class FCIPMGMTMIBDef extends MIB
{
    public static final FCIPMGMTMIBDef FCIPMGMTMIB = new FCIPMGMTMIBDef();

    static { MIBs.getInstance().registerMIB(FCIPMGMTMIBDef.FCIPMGMTMIB); }

    public final FcipMIBEnt fcipMIB;

    private FCIPMGMTMIBDef()
    {
        super("FCIP-MGMT-MIB");
        this.fcipMIB = new FcipMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.fcipMIB
        };
    }

    public static final class FcipMIBEnt extends MIBEntry<FCIPMGMTMIBDef>
    {
        public final FcipObjectsEnt fcipObjects;

        public final FcipConformanceEnt fcipConformance;

        private FcipMIBEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
        {
            super(mib, parent, "fcipMIB", "1.3.6.1.2.1.224", false, false, false, false);
            this.fcipObjects = new FcipObjectsEnt(mib, this);
            this.fcipConformance = new FcipConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.fcipObjects,
                this.fcipConformance
            };
        }
        public static final class FcipObjectsEnt extends MIBEntry<FCIPMGMTMIBDef>
        {
            public final FcipConfigEnt fcipConfig;

            private FcipObjectsEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
            {
                super(mib, parent, "fcipObjects", "1.3.6.1.2.1.224.1", false, false, false, false);
                this.fcipConfig = new FcipConfigEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.fcipConfig
                };
            }
            public static final class FcipConfigEnt extends MIBEntry<FCIPMGMTMIBDef>
            {
                /** ******************************************************************The FCIP groupThis group defines the global scalar objects applicable to FCIPdevices only*/
                public final FcipDynIpConfTypeEnt fcipDynIpConfType;

                public final FcipDeviceWWNEnt fcipDeviceWWN;

                public final FcipEntitySACKOptionEnt fcipEntitySACKOption;

                /** ******************************************************************The FCIP Entity Table*/
                public final FcipEntityInstanceTableEnt fcipEntityInstanceTable;

                /** ******************************************************************The FCIP Link Table*/
                public final FcipLinkTableEnt fcipLinkTable;

                /** ******************************************************************The TCP Connection Table*/
                public final FcipTcpConnTableEnt fcipTcpConnTable;

                /** ******************************************************************The Dynamic Route Table*/
                public final FcipDynamicRouteTableEnt fcipDynamicRouteTable;

                /** ******************************************************************The Static Route Table*/
                public final FcipStaticRouteTableEnt fcipStaticRouteTable;

                /** ******************************************************************The FCIP Discovery Domain Table*/
                public final FcipDiscoveryDomainTableEnt fcipDiscoveryDomainTable;

                /** ******************************************************************The FCIP Link Errors*/
                public final FcipLinkErrorsTableEnt fcipLinkErrorsTable;

                private FcipConfigEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                {
                    super(mib, parent, "fcipConfig", "1.3.6.1.2.1.224.1.1", false, false, false, false);
                    this.fcipDynIpConfType = new FcipDynIpConfTypeEnt(mib, this);
                    this.fcipDeviceWWN = new FcipDeviceWWNEnt(mib, this);
                    this.fcipEntitySACKOption = new FcipEntitySACKOptionEnt(mib, this);
                    this.fcipEntityInstanceTable = new FcipEntityInstanceTableEnt(mib, this);
                    this.fcipLinkTable = new FcipLinkTableEnt(mib, this);
                    this.fcipTcpConnTable = new FcipTcpConnTableEnt(mib, this);
                    this.fcipDynamicRouteTable = new FcipDynamicRouteTableEnt(mib, this);
                    this.fcipStaticRouteTable = new FcipStaticRouteTableEnt(mib, this);
                    this.fcipDiscoveryDomainTable = new FcipDiscoveryDomainTableEnt(mib, this);
                    this.fcipLinkErrorsTable = new FcipLinkErrorsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcipDynIpConfType,
                        this.fcipDeviceWWN,
                        this.fcipEntitySACKOption,
                        this.fcipEntityInstanceTable,
                        this.fcipLinkTable,
                        this.fcipTcpConnTable,
                        this.fcipDynamicRouteTable,
                        this.fcipStaticRouteTable,
                        this.fcipDiscoveryDomainTable,
                        this.fcipLinkErrorsTable
                    };
                }
                public static final class FcipDynIpConfTypeEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    private FcipDynIpConfTypeEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipDynIpConfType", "1.3.6.1.2.1.224.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcipDeviceWWNEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    private FcipDeviceWWNEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipDeviceWWN", "1.3.6.1.2.1.224.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcipEntitySACKOptionEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    private FcipEntitySACKOptionEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipEntitySACKOption", "1.3.6.1.2.1.224.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcipEntityInstanceTableEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    public final FcipEntityInstanceEntryEnt fcipEntityInstanceEntry;

                    private FcipEntityInstanceTableEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipEntityInstanceTable", "1.3.6.1.2.1.224.1.1.4", false, true, false, false);
                        this.fcipEntityInstanceEntry = new FcipEntityInstanceEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcipEntityInstanceEntry
                        };
                    }
                    public static final class FcipEntityInstanceEntryEnt extends MIBEntry<FCIPMGMTMIBDef>
                    {
                        public final FcipEntityIdEnt fcipEntityId;

                        public final FcipEntityNameEnt fcipEntityName;

                        public final FcipEntityAddressTypeEnt fcipEntityAddressType;

                        public final FcipEntityAddressEnt fcipEntityAddress;

                        public final FcipEntityTcpConnPortEnt fcipEntityTcpConnPort;

                        public final FcipEntitySeqNumWrapEnt fcipEntitySeqNumWrap;

                        public final FcipEntityPHBSupportEnt fcipEntityPHBSupport;

                        public final FcipEntityStatusEnt fcipEntityStatus;

                        private FcipEntityInstanceEntryEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcipEntityInstanceEntry", "1.3.6.1.2.1.224.1.1.4.1", false, false, false, true);
                            this.fcipEntityId = new FcipEntityIdEnt(mib, this);
                            this.fcipEntityName = new FcipEntityNameEnt(mib, this);
                            this.fcipEntityAddressType = new FcipEntityAddressTypeEnt(mib, this);
                            this.fcipEntityAddress = new FcipEntityAddressEnt(mib, this);
                            this.fcipEntityTcpConnPort = new FcipEntityTcpConnPortEnt(mib, this);
                            this.fcipEntitySeqNumWrap = new FcipEntitySeqNumWrapEnt(mib, this);
                            this.fcipEntityPHBSupport = new FcipEntityPHBSupportEnt(mib, this);
                            this.fcipEntityStatus = new FcipEntityStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fcipEntityId,
                                this.fcipEntityName,
                                this.fcipEntityAddressType,
                                this.fcipEntityAddress,
                                this.fcipEntityTcpConnPort,
                                this.fcipEntitySeqNumWrap,
                                this.fcipEntityPHBSupport,
                                this.fcipEntityStatus
                            };
                        }
                        public static final class FcipEntityIdEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipEntityIdEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipEntityId", "1.3.6.1.2.1.224.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipEntityNameEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipEntityNameEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipEntityName", "1.3.6.1.2.1.224.1.1.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipEntityAddressTypeEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipEntityAddressTypeEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipEntityAddressType", "1.3.6.1.2.1.224.1.1.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipEntityAddressEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipEntityAddressEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipEntityAddress", "1.3.6.1.2.1.224.1.1.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipEntityTcpConnPortEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipEntityTcpConnPortEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipEntityTcpConnPort", "1.3.6.1.2.1.224.1.1.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipEntitySeqNumWrapEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipEntitySeqNumWrapEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipEntitySeqNumWrap", "1.3.6.1.2.1.224.1.1.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipEntityPHBSupportEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipEntityPHBSupportEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipEntityPHBSupport", "1.3.6.1.2.1.224.1.1.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipEntityStatusEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipEntityStatusEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipEntityStatus", "1.3.6.1.2.1.224.1.1.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class FcipLinkTableEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    public final FcipLinkEntryEnt fcipLinkEntry;

                    private FcipLinkTableEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipLinkTable", "1.3.6.1.2.1.224.1.1.5", false, true, false, false);
                        this.fcipLinkEntry = new FcipLinkEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcipLinkEntry
                        };
                    }
                    public static final class FcipLinkEntryEnt extends MIBEntry<FCIPMGMTMIBDef>
                    {
                        public final FcipLinkIndexEnt fcipLinkIndex;

                        public final FcipLinkIfIndexEnt fcipLinkIfIndex;

                        public final FcipLinkCostEnt fcipLinkCost;

                        public final FcipLinkLocalFcipEntityModeEnt fcipLinkLocalFcipEntityMode;

                        public final FcipLinkLocalFcipEntityAddressTypeEnt fcipLinkLocalFcipEntityAddressType;

                        public final FcipLinkLocalFcipEntityAddressEnt fcipLinkLocalFcipEntityAddress;

                        public final FcipLinkRemFcipEntityWWNEnt fcipLinkRemFcipEntityWWN;

                        public final FcipLinkRemFcipEntityIdEnt fcipLinkRemFcipEntityId;

                        public final FcipLinkRemFcipEntityAddressTypeEnt fcipLinkRemFcipEntityAddressType;

                        public final FcipLinkRemFcipEntityAddressEnt fcipLinkRemFcipEntityAddress;

                        public final FcipLinkStatusEnt fcipLinkStatus;

                        public final FcipLinkCreateTimeEnt fcipLinkCreateTime;

                        private FcipLinkEntryEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcipLinkEntry", "1.3.6.1.2.1.224.1.1.5.1", false, false, false, true);
                            this.fcipLinkIndex = new FcipLinkIndexEnt(mib, this);
                            this.fcipLinkIfIndex = new FcipLinkIfIndexEnt(mib, this);
                            this.fcipLinkCost = new FcipLinkCostEnt(mib, this);
                            this.fcipLinkLocalFcipEntityMode = new FcipLinkLocalFcipEntityModeEnt(mib, this);
                            this.fcipLinkLocalFcipEntityAddressType = new FcipLinkLocalFcipEntityAddressTypeEnt(mib, this);
                            this.fcipLinkLocalFcipEntityAddress = new FcipLinkLocalFcipEntityAddressEnt(mib, this);
                            this.fcipLinkRemFcipEntityWWN = new FcipLinkRemFcipEntityWWNEnt(mib, this);
                            this.fcipLinkRemFcipEntityId = new FcipLinkRemFcipEntityIdEnt(mib, this);
                            this.fcipLinkRemFcipEntityAddressType = new FcipLinkRemFcipEntityAddressTypeEnt(mib, this);
                            this.fcipLinkRemFcipEntityAddress = new FcipLinkRemFcipEntityAddressEnt(mib, this);
                            this.fcipLinkStatus = new FcipLinkStatusEnt(mib, this);
                            this.fcipLinkCreateTime = new FcipLinkCreateTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fcipLinkIndex,
                                this.fcipLinkIfIndex,
                                this.fcipLinkCost,
                                this.fcipLinkLocalFcipEntityMode,
                                this.fcipLinkLocalFcipEntityAddressType,
                                this.fcipLinkLocalFcipEntityAddress,
                                this.fcipLinkRemFcipEntityWWN,
                                this.fcipLinkRemFcipEntityId,
                                this.fcipLinkRemFcipEntityAddressType,
                                this.fcipLinkRemFcipEntityAddress,
                                this.fcipLinkStatus,
                                this.fcipLinkCreateTime
                            };
                        }
                        public static final class FcipLinkIndexEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkIndexEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkIndex", "1.3.6.1.2.1.224.1.1.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkIfIndexEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkIfIndexEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkIfIndex", "1.3.6.1.2.1.224.1.1.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkCostEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkCostEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkCost", "1.3.6.1.2.1.224.1.1.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkLocalFcipEntityModeEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkLocalFcipEntityModeEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkLocalFcipEntityMode", "1.3.6.1.2.1.224.1.1.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkLocalFcipEntityAddressTypeEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkLocalFcipEntityAddressTypeEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkLocalFcipEntityAddressType", "1.3.6.1.2.1.224.1.1.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkLocalFcipEntityAddressEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkLocalFcipEntityAddressEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkLocalFcipEntityAddress", "1.3.6.1.2.1.224.1.1.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkRemFcipEntityWWNEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkRemFcipEntityWWNEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkRemFcipEntityWWN", "1.3.6.1.2.1.224.1.1.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkRemFcipEntityIdEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkRemFcipEntityIdEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkRemFcipEntityId", "1.3.6.1.2.1.224.1.1.5.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkRemFcipEntityAddressTypeEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkRemFcipEntityAddressTypeEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkRemFcipEntityAddressType", "1.3.6.1.2.1.224.1.1.5.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkRemFcipEntityAddressEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkRemFcipEntityAddressEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkRemFcipEntityAddress", "1.3.6.1.2.1.224.1.1.5.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkStatusEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkStatusEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkStatus", "1.3.6.1.2.1.224.1.1.5.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkCreateTimeEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkCreateTimeEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkCreateTime", "1.3.6.1.2.1.224.1.1.5.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class FcipTcpConnTableEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    public final FcipTcpConnEntryEnt fcipTcpConnEntry;

                    private FcipTcpConnTableEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipTcpConnTable", "1.3.6.1.2.1.224.1.1.6", false, true, false, false);
                        this.fcipTcpConnEntry = new FcipTcpConnEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcipTcpConnEntry
                        };
                    }
                    public static final class FcipTcpConnEntryEnt extends MIBEntry<FCIPMGMTMIBDef>
                    {
                        public final FcipTcpConnLocalPortEnt fcipTcpConnLocalPort;

                        public final FcipTcpConnRemPortEnt fcipTcpConnRemPort;

                        public final FcipTcpConnRWSizeEnt fcipTcpConnRWSize;

                        public final FcipTcpConnMSSEnt fcipTcpConnMSS;

                        private FcipTcpConnEntryEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcipTcpConnEntry", "1.3.6.1.2.1.224.1.1.6.1", false, false, false, true);
                            this.fcipTcpConnLocalPort = new FcipTcpConnLocalPortEnt(mib, this);
                            this.fcipTcpConnRemPort = new FcipTcpConnRemPortEnt(mib, this);
                            this.fcipTcpConnRWSize = new FcipTcpConnRWSizeEnt(mib, this);
                            this.fcipTcpConnMSS = new FcipTcpConnMSSEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fcipTcpConnLocalPort,
                                this.fcipTcpConnRemPort,
                                this.fcipTcpConnRWSize,
                                this.fcipTcpConnMSS
                            };
                        }
                        public static final class FcipTcpConnLocalPortEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipTcpConnLocalPortEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipTcpConnLocalPort", "1.3.6.1.2.1.224.1.1.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipTcpConnRemPortEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipTcpConnRemPortEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipTcpConnRemPort", "1.3.6.1.2.1.224.1.1.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipTcpConnRWSizeEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipTcpConnRWSizeEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipTcpConnRWSize", "1.3.6.1.2.1.224.1.1.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipTcpConnMSSEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipTcpConnMSSEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipTcpConnMSS", "1.3.6.1.2.1.224.1.1.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class FcipDynamicRouteTableEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    public final FcipDynamicRouteEntryEnt fcipDynamicRouteEntry;

                    private FcipDynamicRouteTableEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipDynamicRouteTable", "1.3.6.1.2.1.224.1.1.7", false, true, false, false);
                        this.fcipDynamicRouteEntry = new FcipDynamicRouteEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcipDynamicRouteEntry
                        };
                    }
                    public static final class FcipDynamicRouteEntryEnt extends MIBEntry<FCIPMGMTMIBDef>
                    {
                        public final FcipDynamicRouteDIDEnt fcipDynamicRouteDID;

                        public final FcipDynamicRouteLinkIndexEnt fcipDynamicRouteLinkIndex;

                        private FcipDynamicRouteEntryEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcipDynamicRouteEntry", "1.3.6.1.2.1.224.1.1.7.1", false, false, false, true);
                            this.fcipDynamicRouteDID = new FcipDynamicRouteDIDEnt(mib, this);
                            this.fcipDynamicRouteLinkIndex = new FcipDynamicRouteLinkIndexEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fcipDynamicRouteDID,
                                this.fcipDynamicRouteLinkIndex
                            };
                        }
                        public static final class FcipDynamicRouteDIDEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipDynamicRouteDIDEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipDynamicRouteDID", "1.3.6.1.2.1.224.1.1.7.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipDynamicRouteLinkIndexEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipDynamicRouteLinkIndexEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipDynamicRouteLinkIndex", "1.3.6.1.2.1.224.1.1.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class FcipStaticRouteTableEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    public final FcipStaticRouteEntryEnt fcipStaticRouteEntry;

                    private FcipStaticRouteTableEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipStaticRouteTable", "1.3.6.1.2.1.224.1.1.8", false, true, false, false);
                        this.fcipStaticRouteEntry = new FcipStaticRouteEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcipStaticRouteEntry
                        };
                    }
                    public static final class FcipStaticRouteEntryEnt extends MIBEntry<FCIPMGMTMIBDef>
                    {
                        public final FcipStaticRouteDIDEnt fcipStaticRouteDID;

                        public final FcipStaticRouteLinkIndexEnt fcipStaticRouteLinkIndex;

                        public final FcipStaticRouteStatusEnt fcipStaticRouteStatus;

                        private FcipStaticRouteEntryEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcipStaticRouteEntry", "1.3.6.1.2.1.224.1.1.8.1", false, false, false, true);
                            this.fcipStaticRouteDID = new FcipStaticRouteDIDEnt(mib, this);
                            this.fcipStaticRouteLinkIndex = new FcipStaticRouteLinkIndexEnt(mib, this);
                            this.fcipStaticRouteStatus = new FcipStaticRouteStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fcipStaticRouteDID,
                                this.fcipStaticRouteLinkIndex,
                                this.fcipStaticRouteStatus
                            };
                        }
                        public static final class FcipStaticRouteDIDEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipStaticRouteDIDEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipStaticRouteDID", "1.3.6.1.2.1.224.1.1.8.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipStaticRouteLinkIndexEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipStaticRouteLinkIndexEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipStaticRouteLinkIndex", "1.3.6.1.2.1.224.1.1.8.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipStaticRouteStatusEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipStaticRouteStatusEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipStaticRouteStatus", "1.3.6.1.2.1.224.1.1.8.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class FcipDiscoveryDomainTableEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    public final FcipDiscoveryDomainEntryEnt fcipDiscoveryDomainEntry;

                    private FcipDiscoveryDomainTableEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipDiscoveryDomainTable", "1.3.6.1.2.1.224.1.1.9", false, true, false, false);
                        this.fcipDiscoveryDomainEntry = new FcipDiscoveryDomainEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcipDiscoveryDomainEntry
                        };
                    }
                    public static final class FcipDiscoveryDomainEntryEnt extends MIBEntry<FCIPMGMTMIBDef>
                    {
                        public final FcipDiscoveryDomainIndexEnt fcipDiscoveryDomainIndex;

                        public final FcipDiscoveryDomainNameEnt fcipDiscoveryDomainName;

                        private FcipDiscoveryDomainEntryEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcipDiscoveryDomainEntry", "1.3.6.1.2.1.224.1.1.9.1", false, false, false, true);
                            this.fcipDiscoveryDomainIndex = new FcipDiscoveryDomainIndexEnt(mib, this);
                            this.fcipDiscoveryDomainName = new FcipDiscoveryDomainNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fcipDiscoveryDomainIndex,
                                this.fcipDiscoveryDomainName
                            };
                        }
                        public static final class FcipDiscoveryDomainIndexEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipDiscoveryDomainIndexEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipDiscoveryDomainIndex", "1.3.6.1.2.1.224.1.1.9.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipDiscoveryDomainNameEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipDiscoveryDomainNameEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipDiscoveryDomainName", "1.3.6.1.2.1.224.1.1.9.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class FcipLinkErrorsTableEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    public final FcipLinkErrorsEntryEnt fcipLinkErrorsEntry;

                    private FcipLinkErrorsTableEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipLinkErrorsTable", "1.3.6.1.2.1.224.1.1.10", false, true, false, false);
                        this.fcipLinkErrorsEntry = new FcipLinkErrorsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcipLinkErrorsEntry
                        };
                    }
                    public static final class FcipLinkErrorsEntryEnt extends MIBEntry<FCIPMGMTMIBDef>
                    {
                        public final FcipLinkFcipLossofFcSynchsEnt fcipLinkFcipLossofFcSynchs;

                        public final FcipLinkFcipEncapErrorsEnt fcipLinkFcipEncapErrors;

                        public final FcipLinkFcipNotReceivedSfRespsEnt fcipLinkFcipNotReceivedSfResps;

                        public final FcipLinkFcipSfRespMismatchesEnt fcipLinkFcipSfRespMismatches;

                        public final FcipLinkFcipSfInvalidNoncesEnt fcipLinkFcipSfInvalidNonces;

                        public final FcipLinkFcipReceivedSfDuplicatesEnt fcipLinkFcipReceivedSfDuplicates;

                        public final FcipLinkFcipSfInvalidWWNsEnt fcipLinkFcipSfInvalidWWNs;

                        public final FcipLinkFcipBB2LkaTimeOutsEnt fcipLinkFcipBB2LkaTimeOuts;

                        public final FcipLinkFcipSntpExpiredTimeStampsEnt fcipLinkFcipSntpExpiredTimeStamps;

                        public final FcipLinkTcpTooManyErrorsEnt fcipLinkTcpTooManyErrors;

                        public final FcipLinkTcpExcessiveDroppedDatagramsEnt fcipLinkTcpExcessiveDroppedDatagrams;

                        public final FcipLinkTcpSaParamMismatchesEnt fcipLinkTcpSaParamMismatches;

                        private FcipLinkErrorsEntryEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcipLinkErrorsEntry", "1.3.6.1.2.1.224.1.1.10.1", false, false, false, true);
                            this.fcipLinkFcipLossofFcSynchs = new FcipLinkFcipLossofFcSynchsEnt(mib, this);
                            this.fcipLinkFcipEncapErrors = new FcipLinkFcipEncapErrorsEnt(mib, this);
                            this.fcipLinkFcipNotReceivedSfResps = new FcipLinkFcipNotReceivedSfRespsEnt(mib, this);
                            this.fcipLinkFcipSfRespMismatches = new FcipLinkFcipSfRespMismatchesEnt(mib, this);
                            this.fcipLinkFcipSfInvalidNonces = new FcipLinkFcipSfInvalidNoncesEnt(mib, this);
                            this.fcipLinkFcipReceivedSfDuplicates = new FcipLinkFcipReceivedSfDuplicatesEnt(mib, this);
                            this.fcipLinkFcipSfInvalidWWNs = new FcipLinkFcipSfInvalidWWNsEnt(mib, this);
                            this.fcipLinkFcipBB2LkaTimeOuts = new FcipLinkFcipBB2LkaTimeOutsEnt(mib, this);
                            this.fcipLinkFcipSntpExpiredTimeStamps = new FcipLinkFcipSntpExpiredTimeStampsEnt(mib, this);
                            this.fcipLinkTcpTooManyErrors = new FcipLinkTcpTooManyErrorsEnt(mib, this);
                            this.fcipLinkTcpExcessiveDroppedDatagrams = new FcipLinkTcpExcessiveDroppedDatagramsEnt(mib, this);
                            this.fcipLinkTcpSaParamMismatches = new FcipLinkTcpSaParamMismatchesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fcipLinkFcipLossofFcSynchs,
                                this.fcipLinkFcipEncapErrors,
                                this.fcipLinkFcipNotReceivedSfResps,
                                this.fcipLinkFcipSfRespMismatches,
                                this.fcipLinkFcipSfInvalidNonces,
                                this.fcipLinkFcipReceivedSfDuplicates,
                                this.fcipLinkFcipSfInvalidWWNs,
                                this.fcipLinkFcipBB2LkaTimeOuts,
                                this.fcipLinkFcipSntpExpiredTimeStamps,
                                this.fcipLinkTcpTooManyErrors,
                                this.fcipLinkTcpExcessiveDroppedDatagrams,
                                this.fcipLinkTcpSaParamMismatches
                            };
                        }
                        public static final class FcipLinkFcipLossofFcSynchsEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkFcipLossofFcSynchsEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkFcipLossofFcSynchs", "1.3.6.1.2.1.224.1.1.10.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkFcipEncapErrorsEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkFcipEncapErrorsEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkFcipEncapErrors", "1.3.6.1.2.1.224.1.1.10.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkFcipNotReceivedSfRespsEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkFcipNotReceivedSfRespsEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkFcipNotReceivedSfResps", "1.3.6.1.2.1.224.1.1.10.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkFcipSfRespMismatchesEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkFcipSfRespMismatchesEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkFcipSfRespMismatches", "1.3.6.1.2.1.224.1.1.10.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkFcipSfInvalidNoncesEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkFcipSfInvalidNoncesEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkFcipSfInvalidNonces", "1.3.6.1.2.1.224.1.1.10.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkFcipReceivedSfDuplicatesEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkFcipReceivedSfDuplicatesEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkFcipReceivedSfDuplicates", "1.3.6.1.2.1.224.1.1.10.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkFcipSfInvalidWWNsEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkFcipSfInvalidWWNsEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkFcipSfInvalidWWNs", "1.3.6.1.2.1.224.1.1.10.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkFcipBB2LkaTimeOutsEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkFcipBB2LkaTimeOutsEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkFcipBB2LkaTimeOuts", "1.3.6.1.2.1.224.1.1.10.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkFcipSntpExpiredTimeStampsEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkFcipSntpExpiredTimeStampsEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkFcipSntpExpiredTimeStamps", "1.3.6.1.2.1.224.1.1.10.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkTcpTooManyErrorsEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkTcpTooManyErrorsEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkTcpTooManyErrors", "1.3.6.1.2.1.224.1.1.10.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkTcpExcessiveDroppedDatagramsEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkTcpExcessiveDroppedDatagramsEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkTcpExcessiveDroppedDatagrams", "1.3.6.1.2.1.224.1.1.10.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcipLinkTcpSaParamMismatchesEnt extends MIBEntry<FCIPMGMTMIBDef>
                        {
                            private FcipLinkTcpSaParamMismatchesEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                            {
                                super(mib, parent, "fcipLinkTcpSaParamMismatches", "1.3.6.1.2.1.224.1.1.10.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class FcipConformanceEnt extends MIBEntry<FCIPMGMTMIBDef>
        {
            /** ******************************************************************Conformance Statements*/
            public final FcipCompliancesEnt fcipCompliances;

            public final FcipGroupsEnt fcipGroups;

            private FcipConformanceEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
            {
                super(mib, parent, "fcipConformance", "1.3.6.1.2.1.224.2", false, false, false, false);
                this.fcipCompliances = new FcipCompliancesEnt(mib, this);
                this.fcipGroups = new FcipGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.fcipCompliances,
                    this.fcipGroups
                };
            }
            public static final class FcipCompliancesEnt extends MIBEntry<FCIPMGMTMIBDef>
            {
                public final FcipComplianceEnt fcipCompliance;

                private FcipCompliancesEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                {
                    super(mib, parent, "fcipCompliances", "1.3.6.1.2.1.224.2.1", false, false, false, false);
                    this.fcipCompliance = new FcipComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcipCompliance
                    };
                }
                public static final class FcipComplianceEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    private FcipComplianceEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipCompliance", "1.3.6.1.2.1.224.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class FcipGroupsEnt extends MIBEntry<FCIPMGMTMIBDef>
            {
                public final FcipEntityScalarGroupEnt fcipEntityScalarGroup;

                public final FcipEntityInstanceGroupEnt fcipEntityInstanceGroup;

                public final FcipLinkGroupEnt fcipLinkGroup;

                public final FcipTcpConnGroupEnt fcipTcpConnGroup;

                public final FcipDiscoveryDomainGroupEnt fcipDiscoveryDomainGroup;

                public final FcipLinkErrorsGroupEnt fcipLinkErrorsGroup;

                public final FcipDynamicRouteGroupEnt fcipDynamicRouteGroup;

                public final FcipStaticRouteGroupEnt fcipStaticRouteGroup;

                private FcipGroupsEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                {
                    super(mib, parent, "fcipGroups", "1.3.6.1.2.1.224.2.2", false, false, false, false);
                    this.fcipEntityScalarGroup = new FcipEntityScalarGroupEnt(mib, this);
                    this.fcipEntityInstanceGroup = new FcipEntityInstanceGroupEnt(mib, this);
                    this.fcipLinkGroup = new FcipLinkGroupEnt(mib, this);
                    this.fcipTcpConnGroup = new FcipTcpConnGroupEnt(mib, this);
                    this.fcipDiscoveryDomainGroup = new FcipDiscoveryDomainGroupEnt(mib, this);
                    this.fcipLinkErrorsGroup = new FcipLinkErrorsGroupEnt(mib, this);
                    this.fcipDynamicRouteGroup = new FcipDynamicRouteGroupEnt(mib, this);
                    this.fcipStaticRouteGroup = new FcipStaticRouteGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcipEntityScalarGroup,
                        this.fcipEntityInstanceGroup,
                        this.fcipLinkGroup,
                        this.fcipTcpConnGroup,
                        this.fcipDiscoveryDomainGroup,
                        this.fcipLinkErrorsGroup,
                        this.fcipDynamicRouteGroup,
                        this.fcipStaticRouteGroup
                    };
                }
                public static final class FcipEntityScalarGroupEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    private FcipEntityScalarGroupEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipEntityScalarGroup", "1.3.6.1.2.1.224.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcipEntityInstanceGroupEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    private FcipEntityInstanceGroupEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipEntityInstanceGroup", "1.3.6.1.2.1.224.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcipLinkGroupEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    private FcipLinkGroupEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipLinkGroup", "1.3.6.1.2.1.224.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcipTcpConnGroupEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    private FcipTcpConnGroupEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipTcpConnGroup", "1.3.6.1.2.1.224.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcipDiscoveryDomainGroupEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    private FcipDiscoveryDomainGroupEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipDiscoveryDomainGroup", "1.3.6.1.2.1.224.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcipLinkErrorsGroupEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    private FcipLinkErrorsGroupEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipLinkErrorsGroup", "1.3.6.1.2.1.224.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcipDynamicRouteGroupEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    private FcipDynamicRouteGroupEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipDynamicRouteGroup", "1.3.6.1.2.1.224.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcipStaticRouteGroupEnt extends MIBEntry<FCIPMGMTMIBDef>
                {
                    private FcipStaticRouteGroupEnt(FCIPMGMTMIBDef mib, MIBEntry<FCIPMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcipStaticRouteGroup", "1.3.6.1.2.1.224.2.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
