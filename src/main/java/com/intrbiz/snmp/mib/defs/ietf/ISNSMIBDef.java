package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**From RFC 2578
From RFC 2579
From RFC 2580
From RFC 3411
From RFC 4001
From RFC 4044
From RFC 4133*/
public final class ISNSMIBDef extends MIB
{
    public static final ISNSMIBDef ISNSMIB = new ISNSMIBDef();

    public final IsnsMIBEnt isnsMIB;

    private ISNSMIBDef()
    {
        super("ISNS-MIB");
        this.isnsMIB = new IsnsMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.isnsMIB
        };
    }

    public static final class IsnsMIBEnt extends MIBEntry<ISNSMIBDef>
    {
        /** Internet Storage Name Service Management*/
        public final IsnsNotificationsEnt isnsNotifications;

        public final IsnsObjectsEnt isnsObjects;

        public final IsnsConformanceEnt isnsConformance;

        private IsnsMIBEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
        {
            super(mib, parent, "isnsMIB", "1.3.6.1.2.1.163", false, false, false, false);
            this.isnsNotifications = new IsnsNotificationsEnt(mib, this);
            this.isnsObjects = new IsnsObjectsEnt(mib, this);
            this.isnsConformance = new IsnsConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.isnsNotifications,
                this.isnsObjects,
                this.isnsConformance
            };
        }
        public static final class IsnsNotificationsEnt extends MIBEntry<ISNSMIBDef>
        {
            /** iSNS Notification Block ---------*/
            public final IsnsServerStartEnt isnsServerStart;

            public final IsnsServerShutdownEnt isnsServerShutdown;

            private IsnsNotificationsEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
            {
                super(mib, parent, "isnsNotifications", "1.3.6.1.2.1.163.0", false, false, false, false);
                this.isnsServerStart = new IsnsServerStartEnt(mib, this);
                this.isnsServerShutdown = new IsnsServerShutdownEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.isnsServerStart,
                    this.isnsServerShutdown
                };
            }
            public static final class IsnsServerStartEnt extends MIBEntry<ISNSMIBDef>
            {
                private IsnsServerStartEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                {
                    super(mib, parent, "isnsServerStart", "1.3.6.1.2.1.163.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IsnsServerShutdownEnt extends MIBEntry<ISNSMIBDef>
            {
                private IsnsServerShutdownEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                {
                    super(mib, parent, "isnsServerShutdown", "1.3.6.1.2.1.163.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class IsnsObjectsEnt extends MIBEntry<ISNSMIBDef>
        {
            /** iSNS Server instance managed objects ----------*/
            public final IsnsServerInfoEnt isnsServerInfo;

            /** iSNS Notifications Information ---------*/
            public final IsnsNotificationsInfoEnt isnsNotificationsInfo;

            private IsnsObjectsEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
            {
                super(mib, parent, "isnsObjects", "1.3.6.1.2.1.163.1", false, false, false, false);
                this.isnsServerInfo = new IsnsServerInfoEnt(mib, this);
                this.isnsNotificationsInfo = new IsnsNotificationsInfoEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.isnsServerInfo,
                    this.isnsNotificationsInfo
                };
            }
            public static final class IsnsServerInfoEnt extends MIBEntry<ISNSMIBDef>
            {
                public final IsnsServerTableEnt isnsServerTable;

                /** Count of objects currently registered in a server instance*/
                public final IsnsNumObjectsTableEnt isnsNumObjectsTable;

                /** Control node information*/
                public final IsnsControlNodeInfoEnt isnsControlNodeInfo;

                /** Discovery Domain Set information*/
                public final IsnsDdsInfoEnt isnsDdsInfo;

                /** Discovery Domain information*/
                public final IsnsDdInfoEnt isnsDdInfo;

                /** Registered Device Information*/
                public final IsnsRegEnt isnsReg;

                private IsnsServerInfoEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                {
                    super(mib, parent, "isnsServerInfo", "1.3.6.1.2.1.163.1.1", false, false, false, false);
                    this.isnsServerTable = new IsnsServerTableEnt(mib, this);
                    this.isnsNumObjectsTable = new IsnsNumObjectsTableEnt(mib, this);
                    this.isnsControlNodeInfo = new IsnsControlNodeInfoEnt(mib, this);
                    this.isnsDdsInfo = new IsnsDdsInfoEnt(mib, this);
                    this.isnsDdInfo = new IsnsDdInfoEnt(mib, this);
                    this.isnsReg = new IsnsRegEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isnsServerTable,
                        this.isnsNumObjectsTable,
                        this.isnsControlNodeInfo,
                        this.isnsDdsInfo,
                        this.isnsDdInfo,
                        this.isnsReg
                    };
                }
                public static final class IsnsServerTableEnt extends MIBEntry<ISNSMIBDef>
                {
                    public final IsnsServerEntryEnt isnsServerEntry;

                    private IsnsServerTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsServerTable", "1.3.6.1.2.1.163.1.1.1", false, true, false, false);
                        this.isnsServerEntry = new IsnsServerEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isnsServerEntry
                        };
                    }
                    public static final class IsnsServerEntryEnt extends MIBEntry<ISNSMIBDef>
                    {
                        public final IsnsServerIndexEnt isnsServerIndex;

                        public final IsnsServerNameEnt isnsServerName;

                        public final IsnsServerIsnsVersionEnt isnsServerIsnsVersion;

                        public final IsnsServerVendorInfoEnt isnsServerVendorInfo;

                        public final IsnsServerPhysicalIndexEnt isnsServerPhysicalIndex;

                        public final IsnsServerTcpPortEnt isnsServerTcpPort;

                        public final IsnsServerUdpPortEnt isnsServerUdpPort;

                        public final IsnsServerDiscontinuityTimeEnt isnsServerDiscontinuityTime;

                        public final IsnsServerRoleEnt isnsServerRole;

                        public final IsnsServerDiscoveryMethodsEnabledEnt isnsServerDiscoveryMethodsEnabled;

                        public final IsnsServerDiscoveryMcGroupTypeEnt isnsServerDiscoveryMcGroupType;

                        public final IsnsServerDiscoveryMcGroupAddressEnt isnsServerDiscoveryMcGroupAddress;

                        public final IsnsServerEsiNonResponseThresholdEnt isnsServerEsiNonResponseThreshold;

                        public final IsnsServerEnableControlNodeMgtScnEnt isnsServerEnableControlNodeMgtScn;

                        public final IsnsServerDefaultDdDdsStatusEnt isnsServerDefaultDdDdsStatus;

                        public final IsnsServerUpdateDdDdsSupportedEnt isnsServerUpdateDdDdsSupported;

                        public final IsnsServerUpdateDdDdsEnabledEnt isnsServerUpdateDdDdsEnabled;

                        private IsnsServerEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                        {
                            super(mib, parent, "isnsServerEntry", "1.3.6.1.2.1.163.1.1.1.1", false, false, false, true);
                            this.isnsServerIndex = new IsnsServerIndexEnt(mib, this);
                            this.isnsServerName = new IsnsServerNameEnt(mib, this);
                            this.isnsServerIsnsVersion = new IsnsServerIsnsVersionEnt(mib, this);
                            this.isnsServerVendorInfo = new IsnsServerVendorInfoEnt(mib, this);
                            this.isnsServerPhysicalIndex = new IsnsServerPhysicalIndexEnt(mib, this);
                            this.isnsServerTcpPort = new IsnsServerTcpPortEnt(mib, this);
                            this.isnsServerUdpPort = new IsnsServerUdpPortEnt(mib, this);
                            this.isnsServerDiscontinuityTime = new IsnsServerDiscontinuityTimeEnt(mib, this);
                            this.isnsServerRole = new IsnsServerRoleEnt(mib, this);
                            this.isnsServerDiscoveryMethodsEnabled = new IsnsServerDiscoveryMethodsEnabledEnt(mib, this);
                            this.isnsServerDiscoveryMcGroupType = new IsnsServerDiscoveryMcGroupTypeEnt(mib, this);
                            this.isnsServerDiscoveryMcGroupAddress = new IsnsServerDiscoveryMcGroupAddressEnt(mib, this);
                            this.isnsServerEsiNonResponseThreshold = new IsnsServerEsiNonResponseThresholdEnt(mib, this);
                            this.isnsServerEnableControlNodeMgtScn = new IsnsServerEnableControlNodeMgtScnEnt(mib, this);
                            this.isnsServerDefaultDdDdsStatus = new IsnsServerDefaultDdDdsStatusEnt(mib, this);
                            this.isnsServerUpdateDdDdsSupported = new IsnsServerUpdateDdDdsSupportedEnt(mib, this);
                            this.isnsServerUpdateDdDdsEnabled = new IsnsServerUpdateDdDdsEnabledEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isnsServerIndex,
                                this.isnsServerName,
                                this.isnsServerIsnsVersion,
                                this.isnsServerVendorInfo,
                                this.isnsServerPhysicalIndex,
                                this.isnsServerTcpPort,
                                this.isnsServerUdpPort,
                                this.isnsServerDiscontinuityTime,
                                this.isnsServerRole,
                                this.isnsServerDiscoveryMethodsEnabled,
                                this.isnsServerDiscoveryMcGroupType,
                                this.isnsServerDiscoveryMcGroupAddress,
                                this.isnsServerEsiNonResponseThreshold,
                                this.isnsServerEnableControlNodeMgtScn,
                                this.isnsServerDefaultDdDdsStatus,
                                this.isnsServerUpdateDdDdsSupported,
                                this.isnsServerUpdateDdDdsEnabled
                            };
                        }
                        public static final class IsnsServerIndexEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsServerIndexEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsServerIndex", "1.3.6.1.2.1.163.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsServerNameEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsServerNameEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsServerName", "1.3.6.1.2.1.163.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsServerIsnsVersionEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsServerIsnsVersionEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsServerIsnsVersion", "1.3.6.1.2.1.163.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsServerVendorInfoEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsServerVendorInfoEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsServerVendorInfo", "1.3.6.1.2.1.163.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsServerPhysicalIndexEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsServerPhysicalIndexEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsServerPhysicalIndex", "1.3.6.1.2.1.163.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsServerTcpPortEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsServerTcpPortEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsServerTcpPort", "1.3.6.1.2.1.163.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsServerUdpPortEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsServerUdpPortEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsServerUdpPort", "1.3.6.1.2.1.163.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsServerDiscontinuityTimeEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsServerDiscontinuityTimeEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsServerDiscontinuityTime", "1.3.6.1.2.1.163.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsServerRoleEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsServerRoleEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsServerRole", "1.3.6.1.2.1.163.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsServerDiscoveryMethodsEnabledEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsServerDiscoveryMethodsEnabledEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsServerDiscoveryMethodsEnabled", "1.3.6.1.2.1.163.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsServerDiscoveryMcGroupTypeEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsServerDiscoveryMcGroupTypeEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsServerDiscoveryMcGroupType", "1.3.6.1.2.1.163.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsServerDiscoveryMcGroupAddressEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsServerDiscoveryMcGroupAddressEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsServerDiscoveryMcGroupAddress", "1.3.6.1.2.1.163.1.1.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsServerEsiNonResponseThresholdEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsServerEsiNonResponseThresholdEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsServerEsiNonResponseThreshold", "1.3.6.1.2.1.163.1.1.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsServerEnableControlNodeMgtScnEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsServerEnableControlNodeMgtScnEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsServerEnableControlNodeMgtScn", "1.3.6.1.2.1.163.1.1.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsServerDefaultDdDdsStatusEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsServerDefaultDdDdsStatusEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsServerDefaultDdDdsStatus", "1.3.6.1.2.1.163.1.1.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsServerUpdateDdDdsSupportedEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsServerUpdateDdDdsSupportedEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsServerUpdateDdDdsSupported", "1.3.6.1.2.1.163.1.1.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsServerUpdateDdDdsEnabledEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsServerUpdateDdDdsEnabledEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsServerUpdateDdDdsEnabled", "1.3.6.1.2.1.163.1.1.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IsnsNumObjectsTableEnt extends MIBEntry<ISNSMIBDef>
                {
                    public final IsnsNumObjectsEntryEnt isnsNumObjectsEntry;

                    private IsnsNumObjectsTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsNumObjectsTable", "1.3.6.1.2.1.163.1.1.2", false, true, false, false);
                        this.isnsNumObjectsEntry = new IsnsNumObjectsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isnsNumObjectsEntry
                        };
                    }
                    public static final class IsnsNumObjectsEntryEnt extends MIBEntry<ISNSMIBDef>
                    {
                        public final IsnsNumDdsEnt isnsNumDds;

                        public final IsnsNumDdEnt isnsNumDd;

                        public final IsnsNumEntitiesEnt isnsNumEntities;

                        public final IsnsNumPortalsEnt isnsNumPortals;

                        public final IsnsNumPortalGroupsEnt isnsNumPortalGroups;

                        public final IsnsNumIscsiNodesEnt isnsNumIscsiNodes;

                        public final IsnsNumFcPortsEnt isnsNumFcPorts;

                        public final IsnsNumFcNodesEnt isnsNumFcNodes;

                        private IsnsNumObjectsEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                        {
                            super(mib, parent, "isnsNumObjectsEntry", "1.3.6.1.2.1.163.1.1.2.1", false, false, false, true);
                            this.isnsNumDds = new IsnsNumDdsEnt(mib, this);
                            this.isnsNumDd = new IsnsNumDdEnt(mib, this);
                            this.isnsNumEntities = new IsnsNumEntitiesEnt(mib, this);
                            this.isnsNumPortals = new IsnsNumPortalsEnt(mib, this);
                            this.isnsNumPortalGroups = new IsnsNumPortalGroupsEnt(mib, this);
                            this.isnsNumIscsiNodes = new IsnsNumIscsiNodesEnt(mib, this);
                            this.isnsNumFcPorts = new IsnsNumFcPortsEnt(mib, this);
                            this.isnsNumFcNodes = new IsnsNumFcNodesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isnsNumDds,
                                this.isnsNumDd,
                                this.isnsNumEntities,
                                this.isnsNumPortals,
                                this.isnsNumPortalGroups,
                                this.isnsNumIscsiNodes,
                                this.isnsNumFcPorts,
                                this.isnsNumFcNodes
                            };
                        }
                        public static final class IsnsNumDdsEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsNumDdsEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsNumDds", "1.3.6.1.2.1.163.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsNumDdEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsNumDdEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsNumDd", "1.3.6.1.2.1.163.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsNumEntitiesEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsNumEntitiesEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsNumEntities", "1.3.6.1.2.1.163.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsNumPortalsEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsNumPortalsEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsNumPortals", "1.3.6.1.2.1.163.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsNumPortalGroupsEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsNumPortalGroupsEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsNumPortalGroups", "1.3.6.1.2.1.163.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsNumIscsiNodesEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsNumIscsiNodesEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsNumIscsiNodes", "1.3.6.1.2.1.163.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsNumFcPortsEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsNumFcPortsEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsNumFcPorts", "1.3.6.1.2.1.163.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IsnsNumFcNodesEnt extends MIBEntry<ISNSMIBDef>
                        {
                            private IsnsNumFcNodesEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsNumFcNodes", "1.3.6.1.2.1.163.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class IsnsControlNodeInfoEnt extends MIBEntry<ISNSMIBDef>
                {
                    /** Specific iSCSI Nodes authorized to register as ControlNodes*/
                    public final IsnsControlNodeIscsiTableEnt isnsControlNodeIscsiTable;

                    /** Specific FC Ports authorized to register as ControlNodes*/
                    public final IsnsControlNodeFcPortTableEnt isnsControlNodeFcPortTable;

                    private IsnsControlNodeInfoEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsControlNodeInfo", "1.3.6.1.2.1.163.1.1.3", false, false, false, false);
                        this.isnsControlNodeIscsiTable = new IsnsControlNodeIscsiTableEnt(mib, this);
                        this.isnsControlNodeFcPortTable = new IsnsControlNodeFcPortTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isnsControlNodeIscsiTable,
                            this.isnsControlNodeFcPortTable
                        };
                    }
                    public static final class IsnsControlNodeIscsiTableEnt extends MIBEntry<ISNSMIBDef>
                    {
                        public final IsnsControlNodeIscsiEntryEnt isnsControlNodeIscsiEntry;

                        private IsnsControlNodeIscsiTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                        {
                            super(mib, parent, "isnsControlNodeIscsiTable", "1.3.6.1.2.1.163.1.1.3.1", false, true, false, false);
                            this.isnsControlNodeIscsiEntry = new IsnsControlNodeIscsiEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isnsControlNodeIscsiEntry
                            };
                        }
                        public static final class IsnsControlNodeIscsiEntryEnt extends MIBEntry<ISNSMIBDef>
                        {
                            public final IsnsControlNodeIscsiNodeIndexEnt isnsControlNodeIscsiNodeIndex;

                            public final IsnsControlNodeIscsiNodeNameEnt isnsControlNodeIscsiNodeName;

                            public final IsnsControlNodeIscsiIsRegisteredEnt isnsControlNodeIscsiIsRegistered;

                            public final IsnsControlNodeIscsiRcvMgtSCNEnt isnsControlNodeIscsiRcvMgtSCN;

                            private IsnsControlNodeIscsiEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsControlNodeIscsiEntry", "1.3.6.1.2.1.163.1.1.3.1.1", false, false, false, true);
                                this.isnsControlNodeIscsiNodeIndex = new IsnsControlNodeIscsiNodeIndexEnt(mib, this);
                                this.isnsControlNodeIscsiNodeName = new IsnsControlNodeIscsiNodeNameEnt(mib, this);
                                this.isnsControlNodeIscsiIsRegistered = new IsnsControlNodeIscsiIsRegisteredEnt(mib, this);
                                this.isnsControlNodeIscsiRcvMgtSCN = new IsnsControlNodeIscsiRcvMgtSCNEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.isnsControlNodeIscsiNodeIndex,
                                    this.isnsControlNodeIscsiNodeName,
                                    this.isnsControlNodeIscsiIsRegistered,
                                    this.isnsControlNodeIscsiRcvMgtSCN
                                };
                            }
                            public static final class IsnsControlNodeIscsiNodeIndexEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsControlNodeIscsiNodeIndexEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsControlNodeIscsiNodeIndex", "1.3.6.1.2.1.163.1.1.3.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsControlNodeIscsiNodeNameEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsControlNodeIscsiNodeNameEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsControlNodeIscsiNodeName", "1.3.6.1.2.1.163.1.1.3.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsControlNodeIscsiIsRegisteredEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsControlNodeIscsiIsRegisteredEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsControlNodeIscsiIsRegistered", "1.3.6.1.2.1.163.1.1.3.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsControlNodeIscsiRcvMgtSCNEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsControlNodeIscsiRcvMgtSCNEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsControlNodeIscsiRcvMgtSCN", "1.3.6.1.2.1.163.1.1.3.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class IsnsControlNodeFcPortTableEnt extends MIBEntry<ISNSMIBDef>
                    {
                        public final IsnsControlNodeFcPortEntryEnt isnsControlNodeFcPortEntry;

                        private IsnsControlNodeFcPortTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                        {
                            super(mib, parent, "isnsControlNodeFcPortTable", "1.3.6.1.2.1.163.1.1.3.2", false, true, false, false);
                            this.isnsControlNodeFcPortEntry = new IsnsControlNodeFcPortEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isnsControlNodeFcPortEntry
                            };
                        }
                        public static final class IsnsControlNodeFcPortEntryEnt extends MIBEntry<ISNSMIBDef>
                        {
                            public final IsnsControlNodeFcPortWwpnEnt isnsControlNodeFcPortWwpn;

                            public final IsnsControlNodeFcPortIsRegisteredEnt isnsControlNodeFcPortIsRegistered;

                            public final IsnsControlNodeFcPortRcvMgtSCNEnt isnsControlNodeFcPortRcvMgtSCN;

                            private IsnsControlNodeFcPortEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsControlNodeFcPortEntry", "1.3.6.1.2.1.163.1.1.3.2.1", false, false, false, true);
                                this.isnsControlNodeFcPortWwpn = new IsnsControlNodeFcPortWwpnEnt(mib, this);
                                this.isnsControlNodeFcPortIsRegistered = new IsnsControlNodeFcPortIsRegisteredEnt(mib, this);
                                this.isnsControlNodeFcPortRcvMgtSCN = new IsnsControlNodeFcPortRcvMgtSCNEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.isnsControlNodeFcPortWwpn,
                                    this.isnsControlNodeFcPortIsRegistered,
                                    this.isnsControlNodeFcPortRcvMgtSCN
                                };
                            }
                            public static final class IsnsControlNodeFcPortWwpnEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsControlNodeFcPortWwpnEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsControlNodeFcPortWwpn", "1.3.6.1.2.1.163.1.1.3.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsControlNodeFcPortIsRegisteredEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsControlNodeFcPortIsRegisteredEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsControlNodeFcPortIsRegistered", "1.3.6.1.2.1.163.1.1.3.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsControlNodeFcPortRcvMgtSCNEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsControlNodeFcPortRcvMgtSCNEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsControlNodeFcPortRcvMgtSCN", "1.3.6.1.2.1.163.1.1.3.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class IsnsDdsInfoEnt extends MIBEntry<ISNSMIBDef>
                {
                    /** Discovery Domain Set Registrations ---------*/
                    public final IsnsDdsTableEnt isnsDdsTable;

                    /** Discovery Domain Set Members ----------
DDS Membership Assignment*/
                    public final IsnsDdsMemberTableEnt isnsDdsMemberTable;

                    private IsnsDdsInfoEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsDdsInfo", "1.3.6.1.2.1.163.1.1.4", false, false, false, false);
                        this.isnsDdsTable = new IsnsDdsTableEnt(mib, this);
                        this.isnsDdsMemberTable = new IsnsDdsMemberTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isnsDdsTable,
                            this.isnsDdsMemberTable
                        };
                    }
                    public static final class IsnsDdsTableEnt extends MIBEntry<ISNSMIBDef>
                    {
                        public final IsnsDdsEntryEnt isnsDdsEntry;

                        private IsnsDdsTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                        {
                            super(mib, parent, "isnsDdsTable", "1.3.6.1.2.1.163.1.1.4.1", false, true, false, false);
                            this.isnsDdsEntry = new IsnsDdsEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isnsDdsEntry
                            };
                        }
                        public static final class IsnsDdsEntryEnt extends MIBEntry<ISNSMIBDef>
                        {
                            public final IsnsDdsIdEnt isnsDdsId;

                            public final IsnsDdsSymbolicNameEnt isnsDdsSymbolicName;

                            public final IsnsDdsStatusEnt isnsDdsStatus;

                            private IsnsDdsEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsDdsEntry", "1.3.6.1.2.1.163.1.1.4.1.1", false, false, false, true);
                                this.isnsDdsId = new IsnsDdsIdEnt(mib, this);
                                this.isnsDdsSymbolicName = new IsnsDdsSymbolicNameEnt(mib, this);
                                this.isnsDdsStatus = new IsnsDdsStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.isnsDdsId,
                                    this.isnsDdsSymbolicName,
                                    this.isnsDdsStatus
                                };
                            }
                            public static final class IsnsDdsIdEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdsIdEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdsId", "1.3.6.1.2.1.163.1.1.4.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsDdsSymbolicNameEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdsSymbolicNameEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdsSymbolicName", "1.3.6.1.2.1.163.1.1.4.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsDdsStatusEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdsStatusEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdsStatus", "1.3.6.1.2.1.163.1.1.4.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class IsnsDdsMemberTableEnt extends MIBEntry<ISNSMIBDef>
                    {
                        public final IsnsDdsMemberEntryEnt isnsDdsMemberEntry;

                        private IsnsDdsMemberTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                        {
                            super(mib, parent, "isnsDdsMemberTable", "1.3.6.1.2.1.163.1.1.4.2", false, true, false, false);
                            this.isnsDdsMemberEntry = new IsnsDdsMemberEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isnsDdsMemberEntry
                            };
                        }
                        public static final class IsnsDdsMemberEntryEnt extends MIBEntry<ISNSMIBDef>
                        {
                            public final IsnsDdsMemberDdIdEnt isnsDdsMemberDdId;

                            public final IsnsDdsMemberSymbolicNameEnt isnsDdsMemberSymbolicName;

                            private IsnsDdsMemberEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsDdsMemberEntry", "1.3.6.1.2.1.163.1.1.4.2.1", false, false, false, true);
                                this.isnsDdsMemberDdId = new IsnsDdsMemberDdIdEnt(mib, this);
                                this.isnsDdsMemberSymbolicName = new IsnsDdsMemberSymbolicNameEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.isnsDdsMemberDdId,
                                    this.isnsDdsMemberSymbolicName
                                };
                            }
                            public static final class IsnsDdsMemberDdIdEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdsMemberDdIdEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdsMemberDdId", "1.3.6.1.2.1.163.1.1.4.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsDdsMemberSymbolicNameEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdsMemberSymbolicNameEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdsMemberSymbolicName", "1.3.6.1.2.1.163.1.1.4.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class IsnsDdInfoEnt extends MIBEntry<ISNSMIBDef>
                {
                    /** Discovery Domain Registrations ------------*/
                    public final IsnsDdTableEnt isnsDdTable;

                    /** Discovery Domain Members ----------
DD iSCSI Node Membership Assignment*/
                    public final IsnsDdIscsiMemberTableEnt isnsDdIscsiMemberTable;

                    /** DD Portal Membership Assignment*/
                    public final IsnsDdPortalMemberTableEnt isnsDdPortalMemberTable;

                    /** DD FC Port Membership Assignment*/
                    public final IsnsDdFcPortMemberTableEnt isnsDdFcPortMemberTable;

                    private IsnsDdInfoEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsDdInfo", "1.3.6.1.2.1.163.1.1.5", false, false, false, false);
                        this.isnsDdTable = new IsnsDdTableEnt(mib, this);
                        this.isnsDdIscsiMemberTable = new IsnsDdIscsiMemberTableEnt(mib, this);
                        this.isnsDdPortalMemberTable = new IsnsDdPortalMemberTableEnt(mib, this);
                        this.isnsDdFcPortMemberTable = new IsnsDdFcPortMemberTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isnsDdTable,
                            this.isnsDdIscsiMemberTable,
                            this.isnsDdPortalMemberTable,
                            this.isnsDdFcPortMemberTable
                        };
                    }
                    public static final class IsnsDdTableEnt extends MIBEntry<ISNSMIBDef>
                    {
                        public final IsnsDdEntryEnt isnsDdEntry;

                        private IsnsDdTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                        {
                            super(mib, parent, "isnsDdTable", "1.3.6.1.2.1.163.1.1.5.1", false, true, false, false);
                            this.isnsDdEntry = new IsnsDdEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isnsDdEntry
                            };
                        }
                        public static final class IsnsDdEntryEnt extends MIBEntry<ISNSMIBDef>
                        {
                            public final IsnsDdIdEnt isnsDdId;

                            public final IsnsDdSymbolicNameEnt isnsDdSymbolicName;

                            public final IsnsDdFeaturesEnt isnsDdFeatures;

                            private IsnsDdEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsDdEntry", "1.3.6.1.2.1.163.1.1.5.1.1", false, false, false, true);
                                this.isnsDdId = new IsnsDdIdEnt(mib, this);
                                this.isnsDdSymbolicName = new IsnsDdSymbolicNameEnt(mib, this);
                                this.isnsDdFeatures = new IsnsDdFeaturesEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.isnsDdId,
                                    this.isnsDdSymbolicName,
                                    this.isnsDdFeatures
                                };
                            }
                            public static final class IsnsDdIdEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdIdEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdId", "1.3.6.1.2.1.163.1.1.5.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsDdSymbolicNameEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdSymbolicNameEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdSymbolicName", "1.3.6.1.2.1.163.1.1.5.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsDdFeaturesEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdFeaturesEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdFeatures", "1.3.6.1.2.1.163.1.1.5.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class IsnsDdIscsiMemberTableEnt extends MIBEntry<ISNSMIBDef>
                    {
                        public final IsnsDdIscsiMemberEntryEnt isnsDdIscsiMemberEntry;

                        private IsnsDdIscsiMemberTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                        {
                            super(mib, parent, "isnsDdIscsiMemberTable", "1.3.6.1.2.1.163.1.1.5.2", false, true, false, false);
                            this.isnsDdIscsiMemberEntry = new IsnsDdIscsiMemberEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isnsDdIscsiMemberEntry
                            };
                        }
                        public static final class IsnsDdIscsiMemberEntryEnt extends MIBEntry<ISNSMIBDef>
                        {
                            public final IsnsDdIscsiMemberIndexEnt isnsDdIscsiMemberIndex;

                            public final IsnsDdIscsiMemberNameEnt isnsDdIscsiMemberName;

                            public final IsnsDdIscsiMemberIsRegisteredEnt isnsDdIscsiMemberIsRegistered;

                            private IsnsDdIscsiMemberEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsDdIscsiMemberEntry", "1.3.6.1.2.1.163.1.1.5.2.1", false, false, false, true);
                                this.isnsDdIscsiMemberIndex = new IsnsDdIscsiMemberIndexEnt(mib, this);
                                this.isnsDdIscsiMemberName = new IsnsDdIscsiMemberNameEnt(mib, this);
                                this.isnsDdIscsiMemberIsRegistered = new IsnsDdIscsiMemberIsRegisteredEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.isnsDdIscsiMemberIndex,
                                    this.isnsDdIscsiMemberName,
                                    this.isnsDdIscsiMemberIsRegistered
                                };
                            }
                            public static final class IsnsDdIscsiMemberIndexEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdIscsiMemberIndexEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdIscsiMemberIndex", "1.3.6.1.2.1.163.1.1.5.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsDdIscsiMemberNameEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdIscsiMemberNameEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdIscsiMemberName", "1.3.6.1.2.1.163.1.1.5.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsDdIscsiMemberIsRegisteredEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdIscsiMemberIsRegisteredEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdIscsiMemberIsRegistered", "1.3.6.1.2.1.163.1.1.5.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class IsnsDdPortalMemberTableEnt extends MIBEntry<ISNSMIBDef>
                    {
                        public final IsnsDdPortalMemberEntryEnt isnsDdPortalMemberEntry;

                        private IsnsDdPortalMemberTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                        {
                            super(mib, parent, "isnsDdPortalMemberTable", "1.3.6.1.2.1.163.1.1.5.3", false, true, false, false);
                            this.isnsDdPortalMemberEntry = new IsnsDdPortalMemberEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isnsDdPortalMemberEntry
                            };
                        }
                        public static final class IsnsDdPortalMemberEntryEnt extends MIBEntry<ISNSMIBDef>
                        {
                            public final IsnsDdPortalMemberIndexEnt isnsDdPortalMemberIndex;

                            public final IsnsDdPortalMemberAddressTypeEnt isnsDdPortalMemberAddressType;

                            public final IsnsDdPortalMemberAddressEnt isnsDdPortalMemberAddress;

                            public final IsnsDdPortalMemberPortTypeEnt isnsDdPortalMemberPortType;

                            public final IsnsDdPortalMemberPortEnt isnsDdPortalMemberPort;

                            public final IsnsDdPortalMemberIsRegisteredEnt isnsDdPortalMemberIsRegistered;

                            private IsnsDdPortalMemberEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsDdPortalMemberEntry", "1.3.6.1.2.1.163.1.1.5.3.1", false, false, false, true);
                                this.isnsDdPortalMemberIndex = new IsnsDdPortalMemberIndexEnt(mib, this);
                                this.isnsDdPortalMemberAddressType = new IsnsDdPortalMemberAddressTypeEnt(mib, this);
                                this.isnsDdPortalMemberAddress = new IsnsDdPortalMemberAddressEnt(mib, this);
                                this.isnsDdPortalMemberPortType = new IsnsDdPortalMemberPortTypeEnt(mib, this);
                                this.isnsDdPortalMemberPort = new IsnsDdPortalMemberPortEnt(mib, this);
                                this.isnsDdPortalMemberIsRegistered = new IsnsDdPortalMemberIsRegisteredEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.isnsDdPortalMemberIndex,
                                    this.isnsDdPortalMemberAddressType,
                                    this.isnsDdPortalMemberAddress,
                                    this.isnsDdPortalMemberPortType,
                                    this.isnsDdPortalMemberPort,
                                    this.isnsDdPortalMemberIsRegistered
                                };
                            }
                            public static final class IsnsDdPortalMemberIndexEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdPortalMemberIndexEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdPortalMemberIndex", "1.3.6.1.2.1.163.1.1.5.3.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsDdPortalMemberAddressTypeEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdPortalMemberAddressTypeEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdPortalMemberAddressType", "1.3.6.1.2.1.163.1.1.5.3.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsDdPortalMemberAddressEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdPortalMemberAddressEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdPortalMemberAddress", "1.3.6.1.2.1.163.1.1.5.3.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsDdPortalMemberPortTypeEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdPortalMemberPortTypeEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdPortalMemberPortType", "1.3.6.1.2.1.163.1.1.5.3.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsDdPortalMemberPortEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdPortalMemberPortEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdPortalMemberPort", "1.3.6.1.2.1.163.1.1.5.3.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsDdPortalMemberIsRegisteredEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdPortalMemberIsRegisteredEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdPortalMemberIsRegistered", "1.3.6.1.2.1.163.1.1.5.3.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class IsnsDdFcPortMemberTableEnt extends MIBEntry<ISNSMIBDef>
                    {
                        public final IsnsDdFcPortMemberEntryEnt isnsDdFcPortMemberEntry;

                        private IsnsDdFcPortMemberTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                        {
                            super(mib, parent, "isnsDdFcPortMemberTable", "1.3.6.1.2.1.163.1.1.5.4", false, true, false, false);
                            this.isnsDdFcPortMemberEntry = new IsnsDdFcPortMemberEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isnsDdFcPortMemberEntry
                            };
                        }
                        public static final class IsnsDdFcPortMemberEntryEnt extends MIBEntry<ISNSMIBDef>
                        {
                            public final IsnsDdFcPortMemberPortNameEnt isnsDdFcPortMemberPortName;

                            public final IsnsDdFcPortMemberIsRegisteredEnt isnsDdFcPortMemberIsRegistered;

                            private IsnsDdFcPortMemberEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsDdFcPortMemberEntry", "1.3.6.1.2.1.163.1.1.5.4.1", false, false, false, true);
                                this.isnsDdFcPortMemberPortName = new IsnsDdFcPortMemberPortNameEnt(mib, this);
                                this.isnsDdFcPortMemberIsRegistered = new IsnsDdFcPortMemberIsRegisteredEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.isnsDdFcPortMemberPortName,
                                    this.isnsDdFcPortMemberIsRegistered
                                };
                            }
                            public static final class IsnsDdFcPortMemberPortNameEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdFcPortMemberPortNameEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdFcPortMemberPortName", "1.3.6.1.2.1.163.1.1.5.4.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class IsnsDdFcPortMemberIsRegisteredEnt extends MIBEntry<ISNSMIBDef>
                            {
                                private IsnsDdFcPortMemberIsRegisteredEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsDdFcPortMemberIsRegistered", "1.3.6.1.2.1.163.1.1.5.4.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class IsnsRegEnt extends MIBEntry<ISNSMIBDef>
                {
                    public final IsnsRegEntityInfoEnt isnsRegEntityInfo;

                    /** iSNS Registered Portal Information*/
                    public final IsnsRegPortalInfoEnt isnsRegPortalInfo;

                    /** iSNS Registered Portal Group Information*/
                    public final IsnsRegPortalGroupInfoEnt isnsRegPortalGroupInfo;

                    /** iSNS Registered iSCSI Node Information*/
                    public final IsnsRegIscsiNodeInfoEnt isnsRegIscsiNodeInfo;

                    /** iSNS Registered FC Node Information*/
                    public final IsnsRegFcNodeInfoEnt isnsRegFcNodeInfo;

                    private IsnsRegEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsReg", "1.3.6.1.2.1.163.1.1.6", false, false, false, false);
                        this.isnsRegEntityInfo = new IsnsRegEntityInfoEnt(mib, this);
                        this.isnsRegPortalInfo = new IsnsRegPortalInfoEnt(mib, this);
                        this.isnsRegPortalGroupInfo = new IsnsRegPortalGroupInfoEnt(mib, this);
                        this.isnsRegIscsiNodeInfo = new IsnsRegIscsiNodeInfoEnt(mib, this);
                        this.isnsRegFcNodeInfo = new IsnsRegFcNodeInfoEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.isnsRegEntityInfo,
                            this.isnsRegPortalInfo,
                            this.isnsRegPortalGroupInfo,
                            this.isnsRegIscsiNodeInfo,
                            this.isnsRegFcNodeInfo
                        };
                    }
                    public static final class IsnsRegEntityInfoEnt extends MIBEntry<ISNSMIBDef>
                    {
                        /** iSNS Registered Entities Table*/
                        public final IsnsRegEntityTableEnt isnsRegEntityTable;

                        /** Registered Objects Associated With an Entity Information*/
                        public final IsnsRegEntityNumObjectsTableEnt isnsRegEntityNumObjectsTable;

                        private IsnsRegEntityInfoEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                        {
                            super(mib, parent, "isnsRegEntityInfo", "1.3.6.1.2.1.163.1.1.6.1", false, false, false, false);
                            this.isnsRegEntityTable = new IsnsRegEntityTableEnt(mib, this);
                            this.isnsRegEntityNumObjectsTable = new IsnsRegEntityNumObjectsTableEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isnsRegEntityTable,
                                this.isnsRegEntityNumObjectsTable
                            };
                        }
                        public static final class IsnsRegEntityTableEnt extends MIBEntry<ISNSMIBDef>
                        {
                            public final IsnsRegEntityEntryEnt isnsRegEntityEntry;

                            private IsnsRegEntityTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsRegEntityTable", "1.3.6.1.2.1.163.1.1.6.1.1", false, true, false, false);
                                this.isnsRegEntityEntry = new IsnsRegEntityEntryEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.isnsRegEntityEntry
                                };
                            }
                            public static final class IsnsRegEntityEntryEnt extends MIBEntry<ISNSMIBDef>
                            {
                                public final IsnsRegEntityIndexEnt isnsRegEntityIndex;

                                public final IsnsRegEntityEIDEnt isnsRegEntityEID;

                                public final IsnsRegEntityProtocolEnt isnsRegEntityProtocol;

                                public final IsnsRegEntityManagementAddressTypeEnt isnsRegEntityManagementAddressType;

                                public final IsnsRegEntityManagementAddressEnt isnsRegEntityManagementAddress;

                                public final IsnsRegEntityTimestampEnt isnsRegEntityTimestamp;

                                public final IsnsRegEntityVersionMinEnt isnsRegEntityVersionMin;

                                public final IsnsRegEntityVersionMaxEnt isnsRegEntityVersionMax;

                                public final IsnsRegEntityRegistrationPeriodEnt isnsRegEntityRegistrationPeriod;

                                private IsnsRegEntityEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsRegEntityEntry", "1.3.6.1.2.1.163.1.1.6.1.1.1", false, false, false, true);
                                    this.isnsRegEntityIndex = new IsnsRegEntityIndexEnt(mib, this);
                                    this.isnsRegEntityEID = new IsnsRegEntityEIDEnt(mib, this);
                                    this.isnsRegEntityProtocol = new IsnsRegEntityProtocolEnt(mib, this);
                                    this.isnsRegEntityManagementAddressType = new IsnsRegEntityManagementAddressTypeEnt(mib, this);
                                    this.isnsRegEntityManagementAddress = new IsnsRegEntityManagementAddressEnt(mib, this);
                                    this.isnsRegEntityTimestamp = new IsnsRegEntityTimestampEnt(mib, this);
                                    this.isnsRegEntityVersionMin = new IsnsRegEntityVersionMinEnt(mib, this);
                                    this.isnsRegEntityVersionMax = new IsnsRegEntityVersionMaxEnt(mib, this);
                                    this.isnsRegEntityRegistrationPeriod = new IsnsRegEntityRegistrationPeriodEnt(mib, this);
                                    this.entries = new MIBEntry<?>[] {
                                        this.isnsRegEntityIndex,
                                        this.isnsRegEntityEID,
                                        this.isnsRegEntityProtocol,
                                        this.isnsRegEntityManagementAddressType,
                                        this.isnsRegEntityManagementAddress,
                                        this.isnsRegEntityTimestamp,
                                        this.isnsRegEntityVersionMin,
                                        this.isnsRegEntityVersionMax,
                                        this.isnsRegEntityRegistrationPeriod
                                    };
                                }
                                public static final class IsnsRegEntityIndexEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegEntityIndexEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegEntityIndex", "1.3.6.1.2.1.163.1.1.6.1.1.1.1", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegEntityEIDEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegEntityEIDEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegEntityEID", "1.3.6.1.2.1.163.1.1.6.1.1.1.2", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegEntityProtocolEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegEntityProtocolEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegEntityProtocol", "1.3.6.1.2.1.163.1.1.6.1.1.1.3", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegEntityManagementAddressTypeEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegEntityManagementAddressTypeEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegEntityManagementAddressType", "1.3.6.1.2.1.163.1.1.6.1.1.1.4", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegEntityManagementAddressEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegEntityManagementAddressEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegEntityManagementAddress", "1.3.6.1.2.1.163.1.1.6.1.1.1.5", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegEntityTimestampEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegEntityTimestampEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegEntityTimestamp", "1.3.6.1.2.1.163.1.1.6.1.1.1.6", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegEntityVersionMinEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegEntityVersionMinEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegEntityVersionMin", "1.3.6.1.2.1.163.1.1.6.1.1.1.7", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegEntityVersionMaxEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegEntityVersionMaxEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegEntityVersionMax", "1.3.6.1.2.1.163.1.1.6.1.1.1.8", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegEntityRegistrationPeriodEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegEntityRegistrationPeriodEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegEntityRegistrationPeriod", "1.3.6.1.2.1.163.1.1.6.1.1.1.9", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                            }

                        }

                        public static final class IsnsRegEntityNumObjectsTableEnt extends MIBEntry<ISNSMIBDef>
                        {
                            public final IsnsRegEntityNumObjectsEntryEnt isnsRegEntityNumObjectsEntry;

                            private IsnsRegEntityNumObjectsTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsRegEntityNumObjectsTable", "1.3.6.1.2.1.163.1.1.6.1.2", false, true, false, false);
                                this.isnsRegEntityNumObjectsEntry = new IsnsRegEntityNumObjectsEntryEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.isnsRegEntityNumObjectsEntry
                                };
                            }
                            public static final class IsnsRegEntityNumObjectsEntryEnt extends MIBEntry<ISNSMIBDef>
                            {
                                public final IsnsRegEntityInfoNumPortalsEnt isnsRegEntityInfoNumPortals;

                                public final IsnsRegEntityInfoNumPortalGroupsEnt isnsRegEntityInfoNumPortalGroups;

                                public final IsnsRegEntityInfoNumIscsiNodesEnt isnsRegEntityInfoNumIscsiNodes;

                                public final IsnsRegEntityInfoNumFcPortsEnt isnsRegEntityInfoNumFcPorts;

                                public final IsnsRegEntityInfoNumFcNodesEnt isnsRegEntityInfoNumFcNodes;

                                private IsnsRegEntityNumObjectsEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsRegEntityNumObjectsEntry", "1.3.6.1.2.1.163.1.1.6.1.2.1", false, false, false, true);
                                    this.isnsRegEntityInfoNumPortals = new IsnsRegEntityInfoNumPortalsEnt(mib, this);
                                    this.isnsRegEntityInfoNumPortalGroups = new IsnsRegEntityInfoNumPortalGroupsEnt(mib, this);
                                    this.isnsRegEntityInfoNumIscsiNodes = new IsnsRegEntityInfoNumIscsiNodesEnt(mib, this);
                                    this.isnsRegEntityInfoNumFcPorts = new IsnsRegEntityInfoNumFcPortsEnt(mib, this);
                                    this.isnsRegEntityInfoNumFcNodes = new IsnsRegEntityInfoNumFcNodesEnt(mib, this);
                                    this.entries = new MIBEntry<?>[] {
                                        this.isnsRegEntityInfoNumPortals,
                                        this.isnsRegEntityInfoNumPortalGroups,
                                        this.isnsRegEntityInfoNumIscsiNodes,
                                        this.isnsRegEntityInfoNumFcPorts,
                                        this.isnsRegEntityInfoNumFcNodes
                                    };
                                }
                                public static final class IsnsRegEntityInfoNumPortalsEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegEntityInfoNumPortalsEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegEntityInfoNumPortals", "1.3.6.1.2.1.163.1.1.6.1.2.1.1", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegEntityInfoNumPortalGroupsEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegEntityInfoNumPortalGroupsEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegEntityInfoNumPortalGroups", "1.3.6.1.2.1.163.1.1.6.1.2.1.2", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegEntityInfoNumIscsiNodesEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegEntityInfoNumIscsiNodesEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegEntityInfoNumIscsiNodes", "1.3.6.1.2.1.163.1.1.6.1.2.1.3", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegEntityInfoNumFcPortsEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegEntityInfoNumFcPortsEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegEntityInfoNumFcPorts", "1.3.6.1.2.1.163.1.1.6.1.2.1.4", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegEntityInfoNumFcNodesEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegEntityInfoNumFcNodesEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegEntityInfoNumFcNodes", "1.3.6.1.2.1.163.1.1.6.1.2.1.5", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                            }

                        }

                    }

                    public static final class IsnsRegPortalInfoEnt extends MIBEntry<ISNSMIBDef>
                    {
                        /** iSNS Registered Portal Table*/
                        public final IsnsRegPortalTableEnt isnsRegPortalTable;

                        private IsnsRegPortalInfoEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                        {
                            super(mib, parent, "isnsRegPortalInfo", "1.3.6.1.2.1.163.1.1.6.2", false, false, false, false);
                            this.isnsRegPortalTable = new IsnsRegPortalTableEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isnsRegPortalTable
                            };
                        }
                        public static final class IsnsRegPortalTableEnt extends MIBEntry<ISNSMIBDef>
                        {
                            public final IsnsRegPortalEntryEnt isnsRegPortalEntry;

                            private IsnsRegPortalTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsRegPortalTable", "1.3.6.1.2.1.163.1.1.6.2.1", false, true, false, false);
                                this.isnsRegPortalEntry = new IsnsRegPortalEntryEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.isnsRegPortalEntry
                                };
                            }
                            public static final class IsnsRegPortalEntryEnt extends MIBEntry<ISNSMIBDef>
                            {
                                public final IsnsRegPortalPortalIndexEnt isnsRegPortalPortalIndex;

                                public final IsnsRegPortalAddressTypeEnt isnsRegPortalAddressType;

                                public final IsnsRegPortalAddressEnt isnsRegPortalAddress;

                                public final IsnsRegPortalPortTypeEnt isnsRegPortalPortType;

                                public final IsnsRegPortalPortEnt isnsRegPortalPort;

                                public final IsnsRegPortalSymbolicNameEnt isnsRegPortalSymbolicName;

                                public final IsnsRegPortalEsiIntervalEnt isnsRegPortalEsiInterval;

                                public final IsnsRegPortalEsiPortTypeEnt isnsRegPortalEsiPortType;

                                public final IsnsRegPortalEsiPortEnt isnsRegPortalEsiPort;

                                public final IsnsRegPortalScnPortTypeEnt isnsRegPortalScnPortType;

                                public final IsnsRegPortalScnPortEnt isnsRegPortalScnPort;

                                public final IsnsRegPortalSecurityInfoEnt isnsRegPortalSecurityInfo;

                                private IsnsRegPortalEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsRegPortalEntry", "1.3.6.1.2.1.163.1.1.6.2.1.1", false, false, false, true);
                                    this.isnsRegPortalPortalIndex = new IsnsRegPortalPortalIndexEnt(mib, this);
                                    this.isnsRegPortalAddressType = new IsnsRegPortalAddressTypeEnt(mib, this);
                                    this.isnsRegPortalAddress = new IsnsRegPortalAddressEnt(mib, this);
                                    this.isnsRegPortalPortType = new IsnsRegPortalPortTypeEnt(mib, this);
                                    this.isnsRegPortalPort = new IsnsRegPortalPortEnt(mib, this);
                                    this.isnsRegPortalSymbolicName = new IsnsRegPortalSymbolicNameEnt(mib, this);
                                    this.isnsRegPortalEsiInterval = new IsnsRegPortalEsiIntervalEnt(mib, this);
                                    this.isnsRegPortalEsiPortType = new IsnsRegPortalEsiPortTypeEnt(mib, this);
                                    this.isnsRegPortalEsiPort = new IsnsRegPortalEsiPortEnt(mib, this);
                                    this.isnsRegPortalScnPortType = new IsnsRegPortalScnPortTypeEnt(mib, this);
                                    this.isnsRegPortalScnPort = new IsnsRegPortalScnPortEnt(mib, this);
                                    this.isnsRegPortalSecurityInfo = new IsnsRegPortalSecurityInfoEnt(mib, this);
                                    this.entries = new MIBEntry<?>[] {
                                        this.isnsRegPortalPortalIndex,
                                        this.isnsRegPortalAddressType,
                                        this.isnsRegPortalAddress,
                                        this.isnsRegPortalPortType,
                                        this.isnsRegPortalPort,
                                        this.isnsRegPortalSymbolicName,
                                        this.isnsRegPortalEsiInterval,
                                        this.isnsRegPortalEsiPortType,
                                        this.isnsRegPortalEsiPort,
                                        this.isnsRegPortalScnPortType,
                                        this.isnsRegPortalScnPort,
                                        this.isnsRegPortalSecurityInfo
                                    };
                                }
                                public static final class IsnsRegPortalPortalIndexEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPortalPortalIndexEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPortalPortalIndex", "1.3.6.1.2.1.163.1.1.6.2.1.1.1", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPortalAddressTypeEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPortalAddressTypeEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPortalAddressType", "1.3.6.1.2.1.163.1.1.6.2.1.1.2", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPortalAddressEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPortalAddressEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPortalAddress", "1.3.6.1.2.1.163.1.1.6.2.1.1.3", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPortalPortTypeEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPortalPortTypeEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPortalPortType", "1.3.6.1.2.1.163.1.1.6.2.1.1.4", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPortalPortEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPortalPortEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPortalPort", "1.3.6.1.2.1.163.1.1.6.2.1.1.5", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPortalSymbolicNameEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPortalSymbolicNameEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPortalSymbolicName", "1.3.6.1.2.1.163.1.1.6.2.1.1.6", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPortalEsiIntervalEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPortalEsiIntervalEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPortalEsiInterval", "1.3.6.1.2.1.163.1.1.6.2.1.1.7", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPortalEsiPortTypeEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPortalEsiPortTypeEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPortalEsiPortType", "1.3.6.1.2.1.163.1.1.6.2.1.1.8", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPortalEsiPortEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPortalEsiPortEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPortalEsiPort", "1.3.6.1.2.1.163.1.1.6.2.1.1.9", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPortalScnPortTypeEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPortalScnPortTypeEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPortalScnPortType", "1.3.6.1.2.1.163.1.1.6.2.1.1.10", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPortalScnPortEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPortalScnPortEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPortalScnPort", "1.3.6.1.2.1.163.1.1.6.2.1.1.11", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPortalSecurityInfoEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPortalSecurityInfoEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPortalSecurityInfo", "1.3.6.1.2.1.163.1.1.6.2.1.1.12", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                            }

                        }

                    }

                    public static final class IsnsRegPortalGroupInfoEnt extends MIBEntry<ISNSMIBDef>
                    {
                        /** iSNS Registered Portal Group (PG) Table*/
                        public final IsnsRegPgTableEnt isnsRegPgTable;

                        private IsnsRegPortalGroupInfoEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                        {
                            super(mib, parent, "isnsRegPortalGroupInfo", "1.3.6.1.2.1.163.1.1.6.3", false, false, false, false);
                            this.isnsRegPgTable = new IsnsRegPgTableEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isnsRegPgTable
                            };
                        }
                        public static final class IsnsRegPgTableEnt extends MIBEntry<ISNSMIBDef>
                        {
                            public final IsnsRegPgEntryEnt isnsRegPgEntry;

                            private IsnsRegPgTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsRegPgTable", "1.3.6.1.2.1.163.1.1.6.3.1", false, true, false, false);
                                this.isnsRegPgEntry = new IsnsRegPgEntryEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.isnsRegPgEntry
                                };
                            }
                            public static final class IsnsRegPgEntryEnt extends MIBEntry<ISNSMIBDef>
                            {
                                public final IsnsRegPgIndexEnt isnsRegPgIndex;

                                public final IsnsRegPgIscsiNodeIndexEnt isnsRegPgIscsiNodeIndex;

                                public final IsnsRegPgIscsiNameEnt isnsRegPgIscsiName;

                                public final IsnsRegPgPortalPortalIndexEnt isnsRegPgPortalPortalIndex;

                                public final IsnsRegPgPortalAddressTypeEnt isnsRegPgPortalAddressType;

                                public final IsnsRegPgPortalAddressEnt isnsRegPgPortalAddress;

                                public final IsnsRegPgPortalPortTypeEnt isnsRegPgPortalPortType;

                                public final IsnsRegPgPortalPortEnt isnsRegPgPortalPort;

                                public final IsnsRegPgPGTEnt isnsRegPgPGT;

                                private IsnsRegPgEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsRegPgEntry", "1.3.6.1.2.1.163.1.1.6.3.1.1", false, false, false, true);
                                    this.isnsRegPgIndex = new IsnsRegPgIndexEnt(mib, this);
                                    this.isnsRegPgIscsiNodeIndex = new IsnsRegPgIscsiNodeIndexEnt(mib, this);
                                    this.isnsRegPgIscsiName = new IsnsRegPgIscsiNameEnt(mib, this);
                                    this.isnsRegPgPortalPortalIndex = new IsnsRegPgPortalPortalIndexEnt(mib, this);
                                    this.isnsRegPgPortalAddressType = new IsnsRegPgPortalAddressTypeEnt(mib, this);
                                    this.isnsRegPgPortalAddress = new IsnsRegPgPortalAddressEnt(mib, this);
                                    this.isnsRegPgPortalPortType = new IsnsRegPgPortalPortTypeEnt(mib, this);
                                    this.isnsRegPgPortalPort = new IsnsRegPgPortalPortEnt(mib, this);
                                    this.isnsRegPgPGT = new IsnsRegPgPGTEnt(mib, this);
                                    this.entries = new MIBEntry<?>[] {
                                        this.isnsRegPgIndex,
                                        this.isnsRegPgIscsiNodeIndex,
                                        this.isnsRegPgIscsiName,
                                        this.isnsRegPgPortalPortalIndex,
                                        this.isnsRegPgPortalAddressType,
                                        this.isnsRegPgPortalAddress,
                                        this.isnsRegPgPortalPortType,
                                        this.isnsRegPgPortalPort,
                                        this.isnsRegPgPGT
                                    };
                                }
                                public static final class IsnsRegPgIndexEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPgIndexEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPgIndex", "1.3.6.1.2.1.163.1.1.6.3.1.1.1", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPgIscsiNodeIndexEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPgIscsiNodeIndexEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPgIscsiNodeIndex", "1.3.6.1.2.1.163.1.1.6.3.1.1.2", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPgIscsiNameEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPgIscsiNameEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPgIscsiName", "1.3.6.1.2.1.163.1.1.6.3.1.1.3", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPgPortalPortalIndexEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPgPortalPortalIndexEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPgPortalPortalIndex", "1.3.6.1.2.1.163.1.1.6.3.1.1.4", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPgPortalAddressTypeEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPgPortalAddressTypeEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPgPortalAddressType", "1.3.6.1.2.1.163.1.1.6.3.1.1.5", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPgPortalAddressEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPgPortalAddressEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPgPortalAddress", "1.3.6.1.2.1.163.1.1.6.3.1.1.6", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPgPortalPortTypeEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPgPortalPortTypeEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPgPortalPortType", "1.3.6.1.2.1.163.1.1.6.3.1.1.7", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPgPortalPortEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPgPortalPortEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPgPortalPort", "1.3.6.1.2.1.163.1.1.6.3.1.1.8", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegPgPGTEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegPgPGTEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegPgPGT", "1.3.6.1.2.1.163.1.1.6.3.1.1.9", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                            }

                        }

                    }

                    public static final class IsnsRegIscsiNodeInfoEnt extends MIBEntry<ISNSMIBDef>
                    {
                        /** iSNS Registered iSCSI Node Table*/
                        public final IsnsRegIscsiNodeTableEnt isnsRegIscsiNodeTable;

                        private IsnsRegIscsiNodeInfoEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                        {
                            super(mib, parent, "isnsRegIscsiNodeInfo", "1.3.6.1.2.1.163.1.1.6.4", false, false, false, false);
                            this.isnsRegIscsiNodeTable = new IsnsRegIscsiNodeTableEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isnsRegIscsiNodeTable
                            };
                        }
                        public static final class IsnsRegIscsiNodeTableEnt extends MIBEntry<ISNSMIBDef>
                        {
                            public final IsnsRegIscsiNodeEntryEnt isnsRegIscsiNodeEntry;

                            private IsnsRegIscsiNodeTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsRegIscsiNodeTable", "1.3.6.1.2.1.163.1.1.6.4.1", false, true, false, false);
                                this.isnsRegIscsiNodeEntry = new IsnsRegIscsiNodeEntryEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.isnsRegIscsiNodeEntry
                                };
                            }
                            public static final class IsnsRegIscsiNodeEntryEnt extends MIBEntry<ISNSMIBDef>
                            {
                                public final IsnsRegIscsiNodeIndexEnt isnsRegIscsiNodeIndex;

                                public final IsnsRegIscsiNodeNameEnt isnsRegIscsiNodeName;

                                public final IsnsRegIscsiNodeTypeEnt isnsRegIscsiNodeType;

                                public final IsnsRegIscsiNodeAliasEnt isnsRegIscsiNodeAlias;

                                public final IsnsRegIscsiNodeScnTypesEnt isnsRegIscsiNodeScnTypes;

                                public final IsnsRegIscsiNodeWwnTokenEnt isnsRegIscsiNodeWwnToken;

                                public final IsnsRegIscsiNodeAuthMethodEnt isnsRegIscsiNodeAuthMethod;

                                private IsnsRegIscsiNodeEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsRegIscsiNodeEntry", "1.3.6.1.2.1.163.1.1.6.4.1.1", false, false, false, true);
                                    this.isnsRegIscsiNodeIndex = new IsnsRegIscsiNodeIndexEnt(mib, this);
                                    this.isnsRegIscsiNodeName = new IsnsRegIscsiNodeNameEnt(mib, this);
                                    this.isnsRegIscsiNodeType = new IsnsRegIscsiNodeTypeEnt(mib, this);
                                    this.isnsRegIscsiNodeAlias = new IsnsRegIscsiNodeAliasEnt(mib, this);
                                    this.isnsRegIscsiNodeScnTypes = new IsnsRegIscsiNodeScnTypesEnt(mib, this);
                                    this.isnsRegIscsiNodeWwnToken = new IsnsRegIscsiNodeWwnTokenEnt(mib, this);
                                    this.isnsRegIscsiNodeAuthMethod = new IsnsRegIscsiNodeAuthMethodEnt(mib, this);
                                    this.entries = new MIBEntry<?>[] {
                                        this.isnsRegIscsiNodeIndex,
                                        this.isnsRegIscsiNodeName,
                                        this.isnsRegIscsiNodeType,
                                        this.isnsRegIscsiNodeAlias,
                                        this.isnsRegIscsiNodeScnTypes,
                                        this.isnsRegIscsiNodeWwnToken,
                                        this.isnsRegIscsiNodeAuthMethod
                                    };
                                }
                                public static final class IsnsRegIscsiNodeIndexEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegIscsiNodeIndexEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegIscsiNodeIndex", "1.3.6.1.2.1.163.1.1.6.4.1.1.1", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegIscsiNodeNameEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegIscsiNodeNameEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegIscsiNodeName", "1.3.6.1.2.1.163.1.1.6.4.1.1.2", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegIscsiNodeTypeEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegIscsiNodeTypeEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegIscsiNodeType", "1.3.6.1.2.1.163.1.1.6.4.1.1.3", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegIscsiNodeAliasEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegIscsiNodeAliasEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegIscsiNodeAlias", "1.3.6.1.2.1.163.1.1.6.4.1.1.4", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegIscsiNodeScnTypesEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegIscsiNodeScnTypesEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegIscsiNodeScnTypes", "1.3.6.1.2.1.163.1.1.6.4.1.1.5", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegIscsiNodeWwnTokenEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegIscsiNodeWwnTokenEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegIscsiNodeWwnToken", "1.3.6.1.2.1.163.1.1.6.4.1.1.6", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegIscsiNodeAuthMethodEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegIscsiNodeAuthMethodEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegIscsiNodeAuthMethod", "1.3.6.1.2.1.163.1.1.6.4.1.1.7", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                            }

                        }

                    }

                    public static final class IsnsRegFcNodeInfoEnt extends MIBEntry<ISNSMIBDef>
                    {
                        /** iSNS Registered FC Node Table*/
                        public final IsnsRegFcNodeTableEnt isnsRegFcNodeTable;

                        /** iSNS Registered FC Port Table*/
                        public final IsnsRegFcPortTableEnt isnsRegFcPortTable;

                        /** Mapping from FC Node to Entity - FC Port*/
                        public final IsnsRegFcNodePortTableEnt isnsRegFcNodePortTable;

                        private IsnsRegFcNodeInfoEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                        {
                            super(mib, parent, "isnsRegFcNodeInfo", "1.3.6.1.2.1.163.1.1.6.5", false, false, false, false);
                            this.isnsRegFcNodeTable = new IsnsRegFcNodeTableEnt(mib, this);
                            this.isnsRegFcPortTable = new IsnsRegFcPortTableEnt(mib, this);
                            this.isnsRegFcNodePortTable = new IsnsRegFcNodePortTableEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.isnsRegFcNodeTable,
                                this.isnsRegFcPortTable,
                                this.isnsRegFcNodePortTable
                            };
                        }
                        public static final class IsnsRegFcNodeTableEnt extends MIBEntry<ISNSMIBDef>
                        {
                            public final IsnsRegFcNodeEntryEnt isnsRegFcNodeEntry;

                            private IsnsRegFcNodeTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsRegFcNodeTable", "1.3.6.1.2.1.163.1.1.6.5.1", false, true, false, false);
                                this.isnsRegFcNodeEntry = new IsnsRegFcNodeEntryEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.isnsRegFcNodeEntry
                                };
                            }
                            public static final class IsnsRegFcNodeEntryEnt extends MIBEntry<ISNSMIBDef>
                            {
                                public final IsnsRegFcNodeWwnnEnt isnsRegFcNodeWwnn;

                                public final IsnsRegFcNodeSymbolicNameEnt isnsRegFcNodeSymbolicName;

                                public final IsnsRegFcNodeAddressTypeEnt isnsRegFcNodeAddressType;

                                public final IsnsRegFcNodeAddressEnt isnsRegFcNodeAddress;

                                public final IsnsRegFcNodeIPAEnt isnsRegFcNodeIPA;

                                public final IsnsRegFcNodeProxyIscsiNameEnt isnsRegFcNodeProxyIscsiName;

                                public final IsnsRegFcNodeNumFcPortsEnt isnsRegFcNodeNumFcPorts;

                                private IsnsRegFcNodeEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsRegFcNodeEntry", "1.3.6.1.2.1.163.1.1.6.5.1.1", false, false, false, true);
                                    this.isnsRegFcNodeWwnn = new IsnsRegFcNodeWwnnEnt(mib, this);
                                    this.isnsRegFcNodeSymbolicName = new IsnsRegFcNodeSymbolicNameEnt(mib, this);
                                    this.isnsRegFcNodeAddressType = new IsnsRegFcNodeAddressTypeEnt(mib, this);
                                    this.isnsRegFcNodeAddress = new IsnsRegFcNodeAddressEnt(mib, this);
                                    this.isnsRegFcNodeIPA = new IsnsRegFcNodeIPAEnt(mib, this);
                                    this.isnsRegFcNodeProxyIscsiName = new IsnsRegFcNodeProxyIscsiNameEnt(mib, this);
                                    this.isnsRegFcNodeNumFcPorts = new IsnsRegFcNodeNumFcPortsEnt(mib, this);
                                    this.entries = new MIBEntry<?>[] {
                                        this.isnsRegFcNodeWwnn,
                                        this.isnsRegFcNodeSymbolicName,
                                        this.isnsRegFcNodeAddressType,
                                        this.isnsRegFcNodeAddress,
                                        this.isnsRegFcNodeIPA,
                                        this.isnsRegFcNodeProxyIscsiName,
                                        this.isnsRegFcNodeNumFcPorts
                                    };
                                }
                                public static final class IsnsRegFcNodeWwnnEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcNodeWwnnEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcNodeWwnn", "1.3.6.1.2.1.163.1.1.6.5.1.1.1", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcNodeSymbolicNameEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcNodeSymbolicNameEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcNodeSymbolicName", "1.3.6.1.2.1.163.1.1.6.5.1.1.2", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcNodeAddressTypeEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcNodeAddressTypeEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcNodeAddressType", "1.3.6.1.2.1.163.1.1.6.5.1.1.3", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcNodeAddressEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcNodeAddressEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcNodeAddress", "1.3.6.1.2.1.163.1.1.6.5.1.1.4", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcNodeIPAEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcNodeIPAEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcNodeIPA", "1.3.6.1.2.1.163.1.1.6.5.1.1.5", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcNodeProxyIscsiNameEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcNodeProxyIscsiNameEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcNodeProxyIscsiName", "1.3.6.1.2.1.163.1.1.6.5.1.1.6", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcNodeNumFcPortsEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcNodeNumFcPortsEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcNodeNumFcPorts", "1.3.6.1.2.1.163.1.1.6.5.1.1.7", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                            }

                        }

                        public static final class IsnsRegFcPortTableEnt extends MIBEntry<ISNSMIBDef>
                        {
                            public final IsnsRegFcPortEntryEnt isnsRegFcPortEntry;

                            private IsnsRegFcPortTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsRegFcPortTable", "1.3.6.1.2.1.163.1.1.6.5.2", false, true, false, false);
                                this.isnsRegFcPortEntry = new IsnsRegFcPortEntryEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.isnsRegFcPortEntry
                                };
                            }
                            public static final class IsnsRegFcPortEntryEnt extends MIBEntry<ISNSMIBDef>
                            {
                                public final IsnsRegFcPortWwpnEnt isnsRegFcPortWwpn;

                                public final IsnsRegFcPortIDEnt isnsRegFcPortID;

                                public final IsnsRegFcPortTypeEnt isnsRegFcPortType;

                                public final IsnsRegFcPortSymbolicNameEnt isnsRegFcPortSymbolicName;

                                public final IsnsRegFcPortFabricPortWwnEnt isnsRegFcPortFabricPortWwn;

                                public final IsnsRegFcPortHAEnt isnsRegFcPortHA;

                                public final IsnsRegFcPortAddressTypeEnt isnsRegFcPortAddressType;

                                public final IsnsRegFcPortAddressEnt isnsRegFcPortAddress;

                                public final IsnsRegFcPortFcCosEnt isnsRegFcPortFcCos;

                                public final IsnsRegFcPortFc4TypesEnt isnsRegFcPortFc4Types;

                                public final IsnsRegFcPortFc4DescrEnt isnsRegFcPortFc4Descr;

                                public final IsnsRegFcPortFc4FeaturesEnt isnsRegFcPortFc4Features;

                                public final IsnsRegFcPortScnTypesEnt isnsRegFcPortScnTypes;

                                public final IsnsRegFcPortRoleEnt isnsRegFcPortRole;

                                public final IsnsRegFcPortFcNodeWwnnEnt isnsRegFcPortFcNodeWwnn;

                                public final IsnsRegFcPortPpnWwnEnt isnsRegFcPortPpnWwn;

                                private IsnsRegFcPortEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsRegFcPortEntry", "1.3.6.1.2.1.163.1.1.6.5.2.1", false, false, false, true);
                                    this.isnsRegFcPortWwpn = new IsnsRegFcPortWwpnEnt(mib, this);
                                    this.isnsRegFcPortID = new IsnsRegFcPortIDEnt(mib, this);
                                    this.isnsRegFcPortType = new IsnsRegFcPortTypeEnt(mib, this);
                                    this.isnsRegFcPortSymbolicName = new IsnsRegFcPortSymbolicNameEnt(mib, this);
                                    this.isnsRegFcPortFabricPortWwn = new IsnsRegFcPortFabricPortWwnEnt(mib, this);
                                    this.isnsRegFcPortHA = new IsnsRegFcPortHAEnt(mib, this);
                                    this.isnsRegFcPortAddressType = new IsnsRegFcPortAddressTypeEnt(mib, this);
                                    this.isnsRegFcPortAddress = new IsnsRegFcPortAddressEnt(mib, this);
                                    this.isnsRegFcPortFcCos = new IsnsRegFcPortFcCosEnt(mib, this);
                                    this.isnsRegFcPortFc4Types = new IsnsRegFcPortFc4TypesEnt(mib, this);
                                    this.isnsRegFcPortFc4Descr = new IsnsRegFcPortFc4DescrEnt(mib, this);
                                    this.isnsRegFcPortFc4Features = new IsnsRegFcPortFc4FeaturesEnt(mib, this);
                                    this.isnsRegFcPortScnTypes = new IsnsRegFcPortScnTypesEnt(mib, this);
                                    this.isnsRegFcPortRole = new IsnsRegFcPortRoleEnt(mib, this);
                                    this.isnsRegFcPortFcNodeWwnn = new IsnsRegFcPortFcNodeWwnnEnt(mib, this);
                                    this.isnsRegFcPortPpnWwn = new IsnsRegFcPortPpnWwnEnt(mib, this);
                                    this.entries = new MIBEntry<?>[] {
                                        this.isnsRegFcPortWwpn,
                                        this.isnsRegFcPortID,
                                        this.isnsRegFcPortType,
                                        this.isnsRegFcPortSymbolicName,
                                        this.isnsRegFcPortFabricPortWwn,
                                        this.isnsRegFcPortHA,
                                        this.isnsRegFcPortAddressType,
                                        this.isnsRegFcPortAddress,
                                        this.isnsRegFcPortFcCos,
                                        this.isnsRegFcPortFc4Types,
                                        this.isnsRegFcPortFc4Descr,
                                        this.isnsRegFcPortFc4Features,
                                        this.isnsRegFcPortScnTypes,
                                        this.isnsRegFcPortRole,
                                        this.isnsRegFcPortFcNodeWwnn,
                                        this.isnsRegFcPortPpnWwn
                                    };
                                }
                                public static final class IsnsRegFcPortWwpnEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcPortWwpnEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcPortWwpn", "1.3.6.1.2.1.163.1.1.6.5.2.1.1", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcPortIDEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcPortIDEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcPortID", "1.3.6.1.2.1.163.1.1.6.5.2.1.2", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcPortTypeEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcPortTypeEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcPortType", "1.3.6.1.2.1.163.1.1.6.5.2.1.3", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcPortSymbolicNameEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcPortSymbolicNameEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcPortSymbolicName", "1.3.6.1.2.1.163.1.1.6.5.2.1.4", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcPortFabricPortWwnEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcPortFabricPortWwnEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcPortFabricPortWwn", "1.3.6.1.2.1.163.1.1.6.5.2.1.5", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcPortHAEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcPortHAEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcPortHA", "1.3.6.1.2.1.163.1.1.6.5.2.1.6", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcPortAddressTypeEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcPortAddressTypeEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcPortAddressType", "1.3.6.1.2.1.163.1.1.6.5.2.1.7", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcPortAddressEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcPortAddressEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcPortAddress", "1.3.6.1.2.1.163.1.1.6.5.2.1.8", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcPortFcCosEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcPortFcCosEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcPortFcCos", "1.3.6.1.2.1.163.1.1.6.5.2.1.9", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcPortFc4TypesEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcPortFc4TypesEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcPortFc4Types", "1.3.6.1.2.1.163.1.1.6.5.2.1.10", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcPortFc4DescrEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcPortFc4DescrEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcPortFc4Descr", "1.3.6.1.2.1.163.1.1.6.5.2.1.11", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcPortFc4FeaturesEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcPortFc4FeaturesEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcPortFc4Features", "1.3.6.1.2.1.163.1.1.6.5.2.1.12", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcPortScnTypesEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcPortScnTypesEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcPortScnTypes", "1.3.6.1.2.1.163.1.1.6.5.2.1.13", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcPortRoleEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcPortRoleEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcPortRole", "1.3.6.1.2.1.163.1.1.6.5.2.1.14", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcPortFcNodeWwnnEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcPortFcNodeWwnnEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcPortFcNodeWwnn", "1.3.6.1.2.1.163.1.1.6.5.2.1.15", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class IsnsRegFcPortPpnWwnEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcPortPpnWwnEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcPortPpnWwn", "1.3.6.1.2.1.163.1.1.6.5.2.1.16", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                            }

                        }

                        public static final class IsnsRegFcNodePortTableEnt extends MIBEntry<ISNSMIBDef>
                        {
                            public final IsnsRegFcNodePortEntryEnt isnsRegFcNodePortEntry;

                            private IsnsRegFcNodePortTableEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                            {
                                super(mib, parent, "isnsRegFcNodePortTable", "1.3.6.1.2.1.163.1.1.6.5.3", false, true, false, false);
                                this.isnsRegFcNodePortEntry = new IsnsRegFcNodePortEntryEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.isnsRegFcNodePortEntry
                                };
                            }
                            public static final class IsnsRegFcNodePortEntryEnt extends MIBEntry<ISNSMIBDef>
                            {
                                public final IsnsRegFcNodePortEntityIndexEnt isnsRegFcNodePortEntityIndex;

                                private IsnsRegFcNodePortEntryEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                {
                                    super(mib, parent, "isnsRegFcNodePortEntry", "1.3.6.1.2.1.163.1.1.6.5.3.1", false, false, false, true);
                                    this.isnsRegFcNodePortEntityIndex = new IsnsRegFcNodePortEntityIndexEnt(mib, this);
                                    this.entries = new MIBEntry<?>[] {
                                        this.isnsRegFcNodePortEntityIndex
                                    };
                                }
                                public static final class IsnsRegFcNodePortEntityIndexEnt extends MIBEntry<ISNSMIBDef>
                                {
                                    private IsnsRegFcNodePortEntityIndexEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                                    {
                                        super(mib, parent, "isnsRegFcNodePortEntityIndex", "1.3.6.1.2.1.163.1.1.6.5.3.1.1", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                            }

                        }

                    }

                }

            }

            public static final class IsnsNotificationsInfoEnt extends MIBEntry<ISNSMIBDef>
            {
                public final IsnsInstanceInfoEnt isnsInstanceInfo;

                public final IsnsAddressNotificationTypeEnt isnsAddressNotificationType;

                public final IsnsAddressNotificationEnt isnsAddressNotification;

                public final IsnsTcpPortNotificationEnt isnsTcpPortNotification;

                public final IsnsUdpPortNotificationEnt isnsUdpPortNotification;

                private IsnsNotificationsInfoEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                {
                    super(mib, parent, "isnsNotificationsInfo", "1.3.6.1.2.1.163.1.2", false, false, false, false);
                    this.isnsInstanceInfo = new IsnsInstanceInfoEnt(mib, this);
                    this.isnsAddressNotificationType = new IsnsAddressNotificationTypeEnt(mib, this);
                    this.isnsAddressNotification = new IsnsAddressNotificationEnt(mib, this);
                    this.isnsTcpPortNotification = new IsnsTcpPortNotificationEnt(mib, this);
                    this.isnsUdpPortNotification = new IsnsUdpPortNotificationEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isnsInstanceInfo,
                        this.isnsAddressNotificationType,
                        this.isnsAddressNotification,
                        this.isnsTcpPortNotification,
                        this.isnsUdpPortNotification
                    };
                }
                public static final class IsnsInstanceInfoEnt extends MIBEntry<ISNSMIBDef>
                {
                    private IsnsInstanceInfoEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsInstanceInfo", "1.3.6.1.2.1.163.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsnsAddressNotificationTypeEnt extends MIBEntry<ISNSMIBDef>
                {
                    private IsnsAddressNotificationTypeEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsAddressNotificationType", "1.3.6.1.2.1.163.1.2.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsnsAddressNotificationEnt extends MIBEntry<ISNSMIBDef>
                {
                    private IsnsAddressNotificationEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsAddressNotification", "1.3.6.1.2.1.163.1.2.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsnsTcpPortNotificationEnt extends MIBEntry<ISNSMIBDef>
                {
                    private IsnsTcpPortNotificationEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsTcpPortNotification", "1.3.6.1.2.1.163.1.2.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsnsUdpPortNotificationEnt extends MIBEntry<ISNSMIBDef>
                {
                    private IsnsUdpPortNotificationEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsUdpPortNotification", "1.3.6.1.2.1.163.1.2.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class IsnsConformanceEnt extends MIBEntry<ISNSMIBDef>
        {
            /** ------------------------------
Compliance Information*/
            public final IsnsCompliancesEnt isnsCompliances;

            public final IsnsGroupsEnt isnsGroups;

            private IsnsConformanceEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
            {
                super(mib, parent, "isnsConformance", "1.3.6.1.2.1.163.2", false, false, false, false);
                this.isnsCompliances = new IsnsCompliancesEnt(mib, this);
                this.isnsGroups = new IsnsGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.isnsCompliances,
                    this.isnsGroups
                };
            }
            public static final class IsnsCompliancesEnt extends MIBEntry<ISNSMIBDef>
            {
                public final IsnsIscsiServerComplianceEnt isnsIscsiServerCompliance;

                public final IsnsIfcpServerComplianceEnt isnsIfcpServerCompliance;

                private IsnsCompliancesEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                {
                    super(mib, parent, "isnsCompliances", "1.3.6.1.2.1.163.2.1", false, false, false, false);
                    this.isnsIscsiServerCompliance = new IsnsIscsiServerComplianceEnt(mib, this);
                    this.isnsIfcpServerCompliance = new IsnsIfcpServerComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isnsIscsiServerCompliance,
                        this.isnsIfcpServerCompliance
                    };
                }
                public static final class IsnsIscsiServerComplianceEnt extends MIBEntry<ISNSMIBDef>
                {
                    private IsnsIscsiServerComplianceEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsIscsiServerCompliance", "1.3.6.1.2.1.163.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsnsIfcpServerComplianceEnt extends MIBEntry<ISNSMIBDef>
                {
                    private IsnsIfcpServerComplianceEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsIfcpServerCompliance", "1.3.6.1.2.1.163.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class IsnsGroupsEnt extends MIBEntry<ISNSMIBDef>
            {
                public final IsnsServerAttributesGroupEnt isnsServerAttributesGroup;

                public final IsnsServerNumObjectsGroupEnt isnsServerNumObjectsGroup;

                public final IsnsServerIscsiControlNodeGroupEnt isnsServerIscsiControlNodeGroup;

                public final IsnsServerIfcpPortControlNodeGroupEnt isnsServerIfcpPortControlNodeGroup;

                public final IsnsServerIscsiDdsDdObjGroupEnt isnsServerIscsiDdsDdObjGroup;

                public final IsnsServerIfcpDdsDdObjGroupEnt isnsServerIfcpDdsDdObjGroup;

                public final IsnsServerRegIscsiObjGroupEnt isnsServerRegIscsiObjGroup;

                public final IsnsServerRegIfcpObjGroupEnt isnsServerRegIfcpObjGroup;

                public final IsnsNotificationsObjGroupEnt isnsNotificationsObjGroup;

                public final IsnsServerNotificationGroupEnt isnsServerNotificationGroup;

                private IsnsGroupsEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                {
                    super(mib, parent, "isnsGroups", "1.3.6.1.2.1.163.2.2", false, false, false, false);
                    this.isnsServerAttributesGroup = new IsnsServerAttributesGroupEnt(mib, this);
                    this.isnsServerNumObjectsGroup = new IsnsServerNumObjectsGroupEnt(mib, this);
                    this.isnsServerIscsiControlNodeGroup = new IsnsServerIscsiControlNodeGroupEnt(mib, this);
                    this.isnsServerIfcpPortControlNodeGroup = new IsnsServerIfcpPortControlNodeGroupEnt(mib, this);
                    this.isnsServerIscsiDdsDdObjGroup = new IsnsServerIscsiDdsDdObjGroupEnt(mib, this);
                    this.isnsServerIfcpDdsDdObjGroup = new IsnsServerIfcpDdsDdObjGroupEnt(mib, this);
                    this.isnsServerRegIscsiObjGroup = new IsnsServerRegIscsiObjGroupEnt(mib, this);
                    this.isnsServerRegIfcpObjGroup = new IsnsServerRegIfcpObjGroupEnt(mib, this);
                    this.isnsNotificationsObjGroup = new IsnsNotificationsObjGroupEnt(mib, this);
                    this.isnsServerNotificationGroup = new IsnsServerNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.isnsServerAttributesGroup,
                        this.isnsServerNumObjectsGroup,
                        this.isnsServerIscsiControlNodeGroup,
                        this.isnsServerIfcpPortControlNodeGroup,
                        this.isnsServerIscsiDdsDdObjGroup,
                        this.isnsServerIfcpDdsDdObjGroup,
                        this.isnsServerRegIscsiObjGroup,
                        this.isnsServerRegIfcpObjGroup,
                        this.isnsNotificationsObjGroup,
                        this.isnsServerNotificationGroup
                    };
                }
                public static final class IsnsServerAttributesGroupEnt extends MIBEntry<ISNSMIBDef>
                {
                    private IsnsServerAttributesGroupEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsServerAttributesGroup", "1.3.6.1.2.1.163.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsnsServerNumObjectsGroupEnt extends MIBEntry<ISNSMIBDef>
                {
                    private IsnsServerNumObjectsGroupEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsServerNumObjectsGroup", "1.3.6.1.2.1.163.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsnsServerIscsiControlNodeGroupEnt extends MIBEntry<ISNSMIBDef>
                {
                    private IsnsServerIscsiControlNodeGroupEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsServerIscsiControlNodeGroup", "1.3.6.1.2.1.163.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsnsServerIfcpPortControlNodeGroupEnt extends MIBEntry<ISNSMIBDef>
                {
                    private IsnsServerIfcpPortControlNodeGroupEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsServerIfcpPortControlNodeGroup", "1.3.6.1.2.1.163.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsnsServerIscsiDdsDdObjGroupEnt extends MIBEntry<ISNSMIBDef>
                {
                    private IsnsServerIscsiDdsDdObjGroupEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsServerIscsiDdsDdObjGroup", "1.3.6.1.2.1.163.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsnsServerIfcpDdsDdObjGroupEnt extends MIBEntry<ISNSMIBDef>
                {
                    private IsnsServerIfcpDdsDdObjGroupEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsServerIfcpDdsDdObjGroup", "1.3.6.1.2.1.163.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsnsServerRegIscsiObjGroupEnt extends MIBEntry<ISNSMIBDef>
                {
                    private IsnsServerRegIscsiObjGroupEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsServerRegIscsiObjGroup", "1.3.6.1.2.1.163.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsnsServerRegIfcpObjGroupEnt extends MIBEntry<ISNSMIBDef>
                {
                    private IsnsServerRegIfcpObjGroupEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsServerRegIfcpObjGroup", "1.3.6.1.2.1.163.2.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsnsNotificationsObjGroupEnt extends MIBEntry<ISNSMIBDef>
                {
                    private IsnsNotificationsObjGroupEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsNotificationsObjGroup", "1.3.6.1.2.1.163.2.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IsnsServerNotificationGroupEnt extends MIBEntry<ISNSMIBDef>
                {
                    private IsnsServerNotificationGroupEnt(ISNSMIBDef mib, MIBEntry<ISNSMIBDef> parent)
                    {
                        super(mib, parent, "isnsServerNotificationGroup", "1.3.6.1.2.1.163.2.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
