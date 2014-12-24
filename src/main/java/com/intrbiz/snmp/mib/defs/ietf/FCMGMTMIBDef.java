package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class FCMGMTMIBDef extends MIB
{
    public static final FCMGMTMIBDef FCMGMTMIB = new FCMGMTMIBDef();

    /** 26 April 2005*/
    public final FcMgmtMIBEnt fcMgmtMIB;

    private FCMGMTMIBDef()
    {
        super("FC-MGMT-MIB");
        this.fcMgmtMIB = new FcMgmtMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.fcMgmtMIB
        };
    }

    public static final class FcMgmtMIBEnt extends MIBEntry<FCMGMTMIBDef>
    {
        public final FcmgmtObjectsEnt fcmgmtObjects;

        public final FcmgmtNotificationsEnt fcmgmtNotifications;

        public final FcmgmtConformanceEnt fcmgmtConformance;

        private FcMgmtMIBEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
        {
            super(mib, parent, "fcMgmtMIB", "1.3.6.1.2.1.10.56", false, false, false, false);
            this.fcmgmtObjects = new FcmgmtObjectsEnt(mib, this);
            this.fcmgmtNotifications = new FcmgmtNotificationsEnt(mib, this);
            this.fcmgmtConformance = new FcmgmtConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.fcmgmtObjects,
                this.fcmgmtNotifications,
                this.fcmgmtConformance
            };
        }
        public static final class FcmgmtObjectsEnt extends MIBEntry<FCMGMTMIBDef>
        {
            /** ********************************MIB object definitions*/
            public final FcmInstanceTableEnt fcmInstanceTable;

            /** ********************************The Fibre Channel Switch Table*/
            public final FcmSwitchTableEnt fcmSwitchTable;

            /** ********************************The Fibre Channel Port Table*/
            public final FcmPortTableEnt fcmPortTable;

            /** ********************************Port Statistics*/
            public final FcmPortStatsTableEnt fcmPortStatsTable;

            /** ********************************Port Low-capacity Statisticsthese are Counter32 "low-capacity" counters for systemsthat do not support Counter64's*/
            public final FcmPortLcStatsTableEnt fcmPortLcStatsTable;

            /** ********************************Port Error Counters*/
            public final FcmPortErrorsTableEnt fcmPortErrorsTable;

            /** ********************************The Fibre Channel Fx_Port Table*/
            public final FcmFxPortTableEnt fcmFxPortTable;

            /** ********************************The Fibre Channel Inter-Switch Port Table*/
            public final FcmISPortTableEnt fcmISPortTable;

            /** ********************************The Fabric Login tableThis table contains the information held by FC switchesabout the Nx_Ports that are logged-in/attached to theirFx_Ports*/
            public final FcmFLoginTableEnt fcmFLoginTable;

            /** ********************************The Link tableThis table is intended to assist management applicationsin determining the topology of the network.  The tablecontains any recent information the known to the agentabout Fibre Channel links, not only those that terminate ata local port but also any others for which informationis known.*/
            public final FcmLinkTableEnt fcmLinkTable;

            private FcmgmtObjectsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
            {
                super(mib, parent, "fcmgmtObjects", "1.3.6.1.2.1.10.56.1", false, false, false, false);
                this.fcmInstanceTable = new FcmInstanceTableEnt(mib, this);
                this.fcmSwitchTable = new FcmSwitchTableEnt(mib, this);
                this.fcmPortTable = new FcmPortTableEnt(mib, this);
                this.fcmPortStatsTable = new FcmPortStatsTableEnt(mib, this);
                this.fcmPortLcStatsTable = new FcmPortLcStatsTableEnt(mib, this);
                this.fcmPortErrorsTable = new FcmPortErrorsTableEnt(mib, this);
                this.fcmFxPortTable = new FcmFxPortTableEnt(mib, this);
                this.fcmISPortTable = new FcmISPortTableEnt(mib, this);
                this.fcmFLoginTable = new FcmFLoginTableEnt(mib, this);
                this.fcmLinkTable = new FcmLinkTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.fcmInstanceTable,
                    this.fcmSwitchTable,
                    this.fcmPortTable,
                    this.fcmPortStatsTable,
                    this.fcmPortLcStatsTable,
                    this.fcmPortErrorsTable,
                    this.fcmFxPortTable,
                    this.fcmISPortTable,
                    this.fcmFLoginTable,
                    this.fcmLinkTable
                };
            }
            public static final class FcmInstanceTableEnt extends MIBEntry<FCMGMTMIBDef>
            {
                public final FcmInstanceEntryEnt fcmInstanceEntry;

                private FcmInstanceTableEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                {
                    super(mib, parent, "fcmInstanceTable", "1.3.6.1.2.1.10.56.1.1", false, true, false, false);
                    this.fcmInstanceEntry = new FcmInstanceEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcmInstanceEntry
                    };
                }
                public static final class FcmInstanceEntryEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    public final FcmInstanceIndexEnt fcmInstanceIndex;

                    public final FcmInstanceWwnEnt fcmInstanceWwn;

                    public final FcmInstanceFunctionsEnt fcmInstanceFunctions;

                    public final FcmInstancePhysicalIndexEnt fcmInstancePhysicalIndex;

                    public final FcmInstanceSoftwareIndexEnt fcmInstanceSoftwareIndex;

                    public final FcmInstanceStatusEnt fcmInstanceStatus;

                    public final FcmInstanceTextNameEnt fcmInstanceTextName;

                    public final FcmInstanceDescrEnt fcmInstanceDescr;

                    public final FcmInstanceFabricIdEnt fcmInstanceFabricId;

                    private FcmInstanceEntryEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmInstanceEntry", "1.3.6.1.2.1.10.56.1.1.1", false, false, false, true);
                        this.fcmInstanceIndex = new FcmInstanceIndexEnt(mib, this);
                        this.fcmInstanceWwn = new FcmInstanceWwnEnt(mib, this);
                        this.fcmInstanceFunctions = new FcmInstanceFunctionsEnt(mib, this);
                        this.fcmInstancePhysicalIndex = new FcmInstancePhysicalIndexEnt(mib, this);
                        this.fcmInstanceSoftwareIndex = new FcmInstanceSoftwareIndexEnt(mib, this);
                        this.fcmInstanceStatus = new FcmInstanceStatusEnt(mib, this);
                        this.fcmInstanceTextName = new FcmInstanceTextNameEnt(mib, this);
                        this.fcmInstanceDescr = new FcmInstanceDescrEnt(mib, this);
                        this.fcmInstanceFabricId = new FcmInstanceFabricIdEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcmInstanceIndex,
                            this.fcmInstanceWwn,
                            this.fcmInstanceFunctions,
                            this.fcmInstancePhysicalIndex,
                            this.fcmInstanceSoftwareIndex,
                            this.fcmInstanceStatus,
                            this.fcmInstanceTextName,
                            this.fcmInstanceDescr,
                            this.fcmInstanceFabricId
                        };
                    }
                    public static final class FcmInstanceIndexEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmInstanceIndexEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmInstanceIndex", "1.3.6.1.2.1.10.56.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmInstanceWwnEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmInstanceWwnEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmInstanceWwn", "1.3.6.1.2.1.10.56.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmInstanceFunctionsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmInstanceFunctionsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmInstanceFunctions", "1.3.6.1.2.1.10.56.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmInstancePhysicalIndexEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmInstancePhysicalIndexEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmInstancePhysicalIndex", "1.3.6.1.2.1.10.56.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmInstanceSoftwareIndexEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmInstanceSoftwareIndexEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmInstanceSoftwareIndex", "1.3.6.1.2.1.10.56.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmInstanceStatusEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmInstanceStatusEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmInstanceStatus", "1.3.6.1.2.1.10.56.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmInstanceTextNameEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmInstanceTextNameEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmInstanceTextName", "1.3.6.1.2.1.10.56.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmInstanceDescrEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmInstanceDescrEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmInstanceDescr", "1.3.6.1.2.1.10.56.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmInstanceFabricIdEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmInstanceFabricIdEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmInstanceFabricId", "1.3.6.1.2.1.10.56.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FcmSwitchTableEnt extends MIBEntry<FCMGMTMIBDef>
            {
                public final FcmSwitchEntryEnt fcmSwitchEntry;

                private FcmSwitchTableEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                {
                    super(mib, parent, "fcmSwitchTable", "1.3.6.1.2.1.10.56.1.2", false, true, false, false);
                    this.fcmSwitchEntry = new FcmSwitchEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcmSwitchEntry
                    };
                }
                public static final class FcmSwitchEntryEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    public final FcmSwitchIndexEnt fcmSwitchIndex;

                    public final FcmSwitchDomainIdEnt fcmSwitchDomainId;

                    public final FcmSwitchPrincipalEnt fcmSwitchPrincipal;

                    public final FcmSwitchWWNEnt fcmSwitchWWN;

                    private FcmSwitchEntryEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmSwitchEntry", "1.3.6.1.2.1.10.56.1.2.1", false, false, false, true);
                        this.fcmSwitchIndex = new FcmSwitchIndexEnt(mib, this);
                        this.fcmSwitchDomainId = new FcmSwitchDomainIdEnt(mib, this);
                        this.fcmSwitchPrincipal = new FcmSwitchPrincipalEnt(mib, this);
                        this.fcmSwitchWWN = new FcmSwitchWWNEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcmSwitchIndex,
                            this.fcmSwitchDomainId,
                            this.fcmSwitchPrincipal,
                            this.fcmSwitchWWN
                        };
                    }
                    public static final class FcmSwitchIndexEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmSwitchIndexEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmSwitchIndex", "1.3.6.1.2.1.10.56.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmSwitchDomainIdEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmSwitchDomainIdEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmSwitchDomainId", "1.3.6.1.2.1.10.56.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmSwitchPrincipalEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmSwitchPrincipalEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmSwitchPrincipal", "1.3.6.1.2.1.10.56.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmSwitchWWNEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmSwitchWWNEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmSwitchWWN", "1.3.6.1.2.1.10.56.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FcmPortTableEnt extends MIBEntry<FCMGMTMIBDef>
            {
                public final FcmPortEntryEnt fcmPortEntry;

                private FcmPortTableEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                {
                    super(mib, parent, "fcmPortTable", "1.3.6.1.2.1.10.56.1.3", false, true, false, false);
                    this.fcmPortEntry = new FcmPortEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcmPortEntry
                    };
                }
                public static final class FcmPortEntryEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    public final FcmPortInstanceIndexEnt fcmPortInstanceIndex;

                    public final FcmPortWwnEnt fcmPortWwn;

                    public final FcmPortNodeWwnEnt fcmPortNodeWwn;

                    public final FcmPortAdminTypeEnt fcmPortAdminType;

                    public final FcmPortOperTypeEnt fcmPortOperType;

                    public final FcmPortFcCapClassEnt fcmPortFcCapClass;

                    public final FcmPortFcOperClassEnt fcmPortFcOperClass;

                    public final FcmPortTransmitterTypeEnt fcmPortTransmitterType;

                    public final FcmPortConnectorTypeEnt fcmPortConnectorType;

                    public final FcmPortSerialNumberEnt fcmPortSerialNumber;

                    public final FcmPortPhysicalNumberEnt fcmPortPhysicalNumber;

                    public final FcmPortAdminSpeedEnt fcmPortAdminSpeed;

                    public final FcmPortCapProtocolsEnt fcmPortCapProtocols;

                    public final FcmPortOperProtocolsEnt fcmPortOperProtocols;

                    private FcmPortEntryEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmPortEntry", "1.3.6.1.2.1.10.56.1.3.1", false, false, false, true);
                        this.fcmPortInstanceIndex = new FcmPortInstanceIndexEnt(mib, this);
                        this.fcmPortWwn = new FcmPortWwnEnt(mib, this);
                        this.fcmPortNodeWwn = new FcmPortNodeWwnEnt(mib, this);
                        this.fcmPortAdminType = new FcmPortAdminTypeEnt(mib, this);
                        this.fcmPortOperType = new FcmPortOperTypeEnt(mib, this);
                        this.fcmPortFcCapClass = new FcmPortFcCapClassEnt(mib, this);
                        this.fcmPortFcOperClass = new FcmPortFcOperClassEnt(mib, this);
                        this.fcmPortTransmitterType = new FcmPortTransmitterTypeEnt(mib, this);
                        this.fcmPortConnectorType = new FcmPortConnectorTypeEnt(mib, this);
                        this.fcmPortSerialNumber = new FcmPortSerialNumberEnt(mib, this);
                        this.fcmPortPhysicalNumber = new FcmPortPhysicalNumberEnt(mib, this);
                        this.fcmPortAdminSpeed = new FcmPortAdminSpeedEnt(mib, this);
                        this.fcmPortCapProtocols = new FcmPortCapProtocolsEnt(mib, this);
                        this.fcmPortOperProtocols = new FcmPortOperProtocolsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcmPortInstanceIndex,
                            this.fcmPortWwn,
                            this.fcmPortNodeWwn,
                            this.fcmPortAdminType,
                            this.fcmPortOperType,
                            this.fcmPortFcCapClass,
                            this.fcmPortFcOperClass,
                            this.fcmPortTransmitterType,
                            this.fcmPortConnectorType,
                            this.fcmPortSerialNumber,
                            this.fcmPortPhysicalNumber,
                            this.fcmPortAdminSpeed,
                            this.fcmPortCapProtocols,
                            this.fcmPortOperProtocols
                        };
                    }
                    public static final class FcmPortInstanceIndexEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortInstanceIndexEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortInstanceIndex", "1.3.6.1.2.1.10.56.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortWwnEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortWwnEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortWwn", "1.3.6.1.2.1.10.56.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortNodeWwnEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortNodeWwnEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortNodeWwn", "1.3.6.1.2.1.10.56.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortAdminTypeEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortAdminTypeEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortAdminType", "1.3.6.1.2.1.10.56.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortOperTypeEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortOperTypeEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortOperType", "1.3.6.1.2.1.10.56.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortFcCapClassEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortFcCapClassEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortFcCapClass", "1.3.6.1.2.1.10.56.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortFcOperClassEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortFcOperClassEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortFcOperClass", "1.3.6.1.2.1.10.56.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortTransmitterTypeEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortTransmitterTypeEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortTransmitterType", "1.3.6.1.2.1.10.56.1.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortConnectorTypeEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortConnectorTypeEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortConnectorType", "1.3.6.1.2.1.10.56.1.3.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortSerialNumberEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortSerialNumberEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortSerialNumber", "1.3.6.1.2.1.10.56.1.3.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortPhysicalNumberEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortPhysicalNumberEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortPhysicalNumber", "1.3.6.1.2.1.10.56.1.3.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortAdminSpeedEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortAdminSpeedEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortAdminSpeed", "1.3.6.1.2.1.10.56.1.3.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortCapProtocolsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortCapProtocolsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortCapProtocols", "1.3.6.1.2.1.10.56.1.3.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortOperProtocolsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortOperProtocolsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortOperProtocols", "1.3.6.1.2.1.10.56.1.3.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FcmPortStatsTableEnt extends MIBEntry<FCMGMTMIBDef>
            {
                public final FcmPortStatsEntryEnt fcmPortStatsEntry;

                private FcmPortStatsTableEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                {
                    super(mib, parent, "fcmPortStatsTable", "1.3.6.1.2.1.10.56.1.4", false, true, false, false);
                    this.fcmPortStatsEntry = new FcmPortStatsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcmPortStatsEntry
                    };
                }
                public static final class FcmPortStatsEntryEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    public final FcmPortBBCreditZerosEnt fcmPortBBCreditZeros;

                    public final FcmPortFullInputBuffersEnt fcmPortFullInputBuffers;

                    public final FcmPortClass2RxFramesEnt fcmPortClass2RxFrames;

                    public final FcmPortClass2RxOctetsEnt fcmPortClass2RxOctets;

                    public final FcmPortClass2TxFramesEnt fcmPortClass2TxFrames;

                    public final FcmPortClass2TxOctetsEnt fcmPortClass2TxOctets;

                    public final FcmPortClass2DiscardsEnt fcmPortClass2Discards;

                    public final FcmPortClass2RxFbsyFramesEnt fcmPortClass2RxFbsyFrames;

                    public final FcmPortClass2RxPbsyFramesEnt fcmPortClass2RxPbsyFrames;

                    public final FcmPortClass2RxFrjtFramesEnt fcmPortClass2RxFrjtFrames;

                    public final FcmPortClass2RxPrjtFramesEnt fcmPortClass2RxPrjtFrames;

                    public final FcmPortClass2TxFbsyFramesEnt fcmPortClass2TxFbsyFrames;

                    public final FcmPortClass2TxPbsyFramesEnt fcmPortClass2TxPbsyFrames;

                    public final FcmPortClass2TxFrjtFramesEnt fcmPortClass2TxFrjtFrames;

                    public final FcmPortClass2TxPrjtFramesEnt fcmPortClass2TxPrjtFrames;

                    public final FcmPortClass3RxFramesEnt fcmPortClass3RxFrames;

                    public final FcmPortClass3RxOctetsEnt fcmPortClass3RxOctets;

                    public final FcmPortClass3TxFramesEnt fcmPortClass3TxFrames;

                    public final FcmPortClass3TxOctetsEnt fcmPortClass3TxOctets;

                    public final FcmPortClass3DiscardsEnt fcmPortClass3Discards;

                    public final FcmPortClassFRxFramesEnt fcmPortClassFRxFrames;

                    public final FcmPortClassFRxOctetsEnt fcmPortClassFRxOctets;

                    public final FcmPortClassFTxFramesEnt fcmPortClassFTxFrames;

                    public final FcmPortClassFTxOctetsEnt fcmPortClassFTxOctets;

                    public final FcmPortClassFDiscardsEnt fcmPortClassFDiscards;

                    private FcmPortStatsEntryEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmPortStatsEntry", "1.3.6.1.2.1.10.56.1.4.1", false, false, false, true);
                        this.fcmPortBBCreditZeros = new FcmPortBBCreditZerosEnt(mib, this);
                        this.fcmPortFullInputBuffers = new FcmPortFullInputBuffersEnt(mib, this);
                        this.fcmPortClass2RxFrames = new FcmPortClass2RxFramesEnt(mib, this);
                        this.fcmPortClass2RxOctets = new FcmPortClass2RxOctetsEnt(mib, this);
                        this.fcmPortClass2TxFrames = new FcmPortClass2TxFramesEnt(mib, this);
                        this.fcmPortClass2TxOctets = new FcmPortClass2TxOctetsEnt(mib, this);
                        this.fcmPortClass2Discards = new FcmPortClass2DiscardsEnt(mib, this);
                        this.fcmPortClass2RxFbsyFrames = new FcmPortClass2RxFbsyFramesEnt(mib, this);
                        this.fcmPortClass2RxPbsyFrames = new FcmPortClass2RxPbsyFramesEnt(mib, this);
                        this.fcmPortClass2RxFrjtFrames = new FcmPortClass2RxFrjtFramesEnt(mib, this);
                        this.fcmPortClass2RxPrjtFrames = new FcmPortClass2RxPrjtFramesEnt(mib, this);
                        this.fcmPortClass2TxFbsyFrames = new FcmPortClass2TxFbsyFramesEnt(mib, this);
                        this.fcmPortClass2TxPbsyFrames = new FcmPortClass2TxPbsyFramesEnt(mib, this);
                        this.fcmPortClass2TxFrjtFrames = new FcmPortClass2TxFrjtFramesEnt(mib, this);
                        this.fcmPortClass2TxPrjtFrames = new FcmPortClass2TxPrjtFramesEnt(mib, this);
                        this.fcmPortClass3RxFrames = new FcmPortClass3RxFramesEnt(mib, this);
                        this.fcmPortClass3RxOctets = new FcmPortClass3RxOctetsEnt(mib, this);
                        this.fcmPortClass3TxFrames = new FcmPortClass3TxFramesEnt(mib, this);
                        this.fcmPortClass3TxOctets = new FcmPortClass3TxOctetsEnt(mib, this);
                        this.fcmPortClass3Discards = new FcmPortClass3DiscardsEnt(mib, this);
                        this.fcmPortClassFRxFrames = new FcmPortClassFRxFramesEnt(mib, this);
                        this.fcmPortClassFRxOctets = new FcmPortClassFRxOctetsEnt(mib, this);
                        this.fcmPortClassFTxFrames = new FcmPortClassFTxFramesEnt(mib, this);
                        this.fcmPortClassFTxOctets = new FcmPortClassFTxOctetsEnt(mib, this);
                        this.fcmPortClassFDiscards = new FcmPortClassFDiscardsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcmPortBBCreditZeros,
                            this.fcmPortFullInputBuffers,
                            this.fcmPortClass2RxFrames,
                            this.fcmPortClass2RxOctets,
                            this.fcmPortClass2TxFrames,
                            this.fcmPortClass2TxOctets,
                            this.fcmPortClass2Discards,
                            this.fcmPortClass2RxFbsyFrames,
                            this.fcmPortClass2RxPbsyFrames,
                            this.fcmPortClass2RxFrjtFrames,
                            this.fcmPortClass2RxPrjtFrames,
                            this.fcmPortClass2TxFbsyFrames,
                            this.fcmPortClass2TxPbsyFrames,
                            this.fcmPortClass2TxFrjtFrames,
                            this.fcmPortClass2TxPrjtFrames,
                            this.fcmPortClass3RxFrames,
                            this.fcmPortClass3RxOctets,
                            this.fcmPortClass3TxFrames,
                            this.fcmPortClass3TxOctets,
                            this.fcmPortClass3Discards,
                            this.fcmPortClassFRxFrames,
                            this.fcmPortClassFRxOctets,
                            this.fcmPortClassFTxFrames,
                            this.fcmPortClassFTxOctets,
                            this.fcmPortClassFDiscards
                        };
                    }
                    public static final class FcmPortBBCreditZerosEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortBBCreditZerosEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortBBCreditZeros", "1.3.6.1.2.1.10.56.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortFullInputBuffersEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortFullInputBuffersEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortFullInputBuffers", "1.3.6.1.2.1.10.56.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass2RxFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass2RxFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass2RxFrames", "1.3.6.1.2.1.10.56.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass2RxOctetsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass2RxOctetsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass2RxOctets", "1.3.6.1.2.1.10.56.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass2TxFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass2TxFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass2TxFrames", "1.3.6.1.2.1.10.56.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass2TxOctetsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass2TxOctetsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass2TxOctets", "1.3.6.1.2.1.10.56.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass2DiscardsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass2DiscardsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass2Discards", "1.3.6.1.2.1.10.56.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass2RxFbsyFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass2RxFbsyFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass2RxFbsyFrames", "1.3.6.1.2.1.10.56.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass2RxPbsyFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass2RxPbsyFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass2RxPbsyFrames", "1.3.6.1.2.1.10.56.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass2RxFrjtFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass2RxFrjtFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass2RxFrjtFrames", "1.3.6.1.2.1.10.56.1.4.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass2RxPrjtFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass2RxPrjtFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass2RxPrjtFrames", "1.3.6.1.2.1.10.56.1.4.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass2TxFbsyFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass2TxFbsyFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass2TxFbsyFrames", "1.3.6.1.2.1.10.56.1.4.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass2TxPbsyFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass2TxPbsyFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass2TxPbsyFrames", "1.3.6.1.2.1.10.56.1.4.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass2TxFrjtFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass2TxFrjtFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass2TxFrjtFrames", "1.3.6.1.2.1.10.56.1.4.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass2TxPrjtFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass2TxPrjtFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass2TxPrjtFrames", "1.3.6.1.2.1.10.56.1.4.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass3RxFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass3RxFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass3RxFrames", "1.3.6.1.2.1.10.56.1.4.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass3RxOctetsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass3RxOctetsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass3RxOctets", "1.3.6.1.2.1.10.56.1.4.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass3TxFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass3TxFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass3TxFrames", "1.3.6.1.2.1.10.56.1.4.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass3TxOctetsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass3TxOctetsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass3TxOctets", "1.3.6.1.2.1.10.56.1.4.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClass3DiscardsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClass3DiscardsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClass3Discards", "1.3.6.1.2.1.10.56.1.4.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClassFRxFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClassFRxFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClassFRxFrames", "1.3.6.1.2.1.10.56.1.4.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClassFRxOctetsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClassFRxOctetsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClassFRxOctets", "1.3.6.1.2.1.10.56.1.4.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClassFTxFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClassFTxFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClassFTxFrames", "1.3.6.1.2.1.10.56.1.4.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClassFTxOctetsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClassFTxOctetsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClassFTxOctets", "1.3.6.1.2.1.10.56.1.4.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortClassFDiscardsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortClassFDiscardsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortClassFDiscards", "1.3.6.1.2.1.10.56.1.4.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FcmPortLcStatsTableEnt extends MIBEntry<FCMGMTMIBDef>
            {
                public final FcmPortLcStatsEntryEnt fcmPortLcStatsEntry;

                private FcmPortLcStatsTableEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                {
                    super(mib, parent, "fcmPortLcStatsTable", "1.3.6.1.2.1.10.56.1.5", false, true, false, false);
                    this.fcmPortLcStatsEntry = new FcmPortLcStatsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcmPortLcStatsEntry
                    };
                }
                public static final class FcmPortLcStatsEntryEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    public final FcmPortLcBBCreditZerosEnt fcmPortLcBBCreditZeros;

                    public final FcmPortLcFullInputBuffersEnt fcmPortLcFullInputBuffers;

                    public final FcmPortLcClass2RxFramesEnt fcmPortLcClass2RxFrames;

                    public final FcmPortLcClass2RxOctetsEnt fcmPortLcClass2RxOctets;

                    public final FcmPortLcClass2TxFramesEnt fcmPortLcClass2TxFrames;

                    public final FcmPortLcClass2TxOctetsEnt fcmPortLcClass2TxOctets;

                    public final FcmPortLcClass2DiscardsEnt fcmPortLcClass2Discards;

                    public final FcmPortLcClass2RxFbsyFramesEnt fcmPortLcClass2RxFbsyFrames;

                    public final FcmPortLcClass2RxPbsyFramesEnt fcmPortLcClass2RxPbsyFrames;

                    public final FcmPortLcClass2RxFrjtFramesEnt fcmPortLcClass2RxFrjtFrames;

                    public final FcmPortLcClass2RxPrjtFramesEnt fcmPortLcClass2RxPrjtFrames;

                    public final FcmPortLcClass2TxFbsyFramesEnt fcmPortLcClass2TxFbsyFrames;

                    public final FcmPortLcClass2TxPbsyFramesEnt fcmPortLcClass2TxPbsyFrames;

                    public final FcmPortLcClass2TxFrjtFramesEnt fcmPortLcClass2TxFrjtFrames;

                    public final FcmPortLcClass2TxPrjtFramesEnt fcmPortLcClass2TxPrjtFrames;

                    public final FcmPortLcClass3RxFramesEnt fcmPortLcClass3RxFrames;

                    public final FcmPortLcClass3RxOctetsEnt fcmPortLcClass3RxOctets;

                    public final FcmPortLcClass3TxFramesEnt fcmPortLcClass3TxFrames;

                    public final FcmPortLcClass3TxOctetsEnt fcmPortLcClass3TxOctets;

                    public final FcmPortLcClass3DiscardsEnt fcmPortLcClass3Discards;

                    private FcmPortLcStatsEntryEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmPortLcStatsEntry", "1.3.6.1.2.1.10.56.1.5.1", false, false, false, true);
                        this.fcmPortLcBBCreditZeros = new FcmPortLcBBCreditZerosEnt(mib, this);
                        this.fcmPortLcFullInputBuffers = new FcmPortLcFullInputBuffersEnt(mib, this);
                        this.fcmPortLcClass2RxFrames = new FcmPortLcClass2RxFramesEnt(mib, this);
                        this.fcmPortLcClass2RxOctets = new FcmPortLcClass2RxOctetsEnt(mib, this);
                        this.fcmPortLcClass2TxFrames = new FcmPortLcClass2TxFramesEnt(mib, this);
                        this.fcmPortLcClass2TxOctets = new FcmPortLcClass2TxOctetsEnt(mib, this);
                        this.fcmPortLcClass2Discards = new FcmPortLcClass2DiscardsEnt(mib, this);
                        this.fcmPortLcClass2RxFbsyFrames = new FcmPortLcClass2RxFbsyFramesEnt(mib, this);
                        this.fcmPortLcClass2RxPbsyFrames = new FcmPortLcClass2RxPbsyFramesEnt(mib, this);
                        this.fcmPortLcClass2RxFrjtFrames = new FcmPortLcClass2RxFrjtFramesEnt(mib, this);
                        this.fcmPortLcClass2RxPrjtFrames = new FcmPortLcClass2RxPrjtFramesEnt(mib, this);
                        this.fcmPortLcClass2TxFbsyFrames = new FcmPortLcClass2TxFbsyFramesEnt(mib, this);
                        this.fcmPortLcClass2TxPbsyFrames = new FcmPortLcClass2TxPbsyFramesEnt(mib, this);
                        this.fcmPortLcClass2TxFrjtFrames = new FcmPortLcClass2TxFrjtFramesEnt(mib, this);
                        this.fcmPortLcClass2TxPrjtFrames = new FcmPortLcClass2TxPrjtFramesEnt(mib, this);
                        this.fcmPortLcClass3RxFrames = new FcmPortLcClass3RxFramesEnt(mib, this);
                        this.fcmPortLcClass3RxOctets = new FcmPortLcClass3RxOctetsEnt(mib, this);
                        this.fcmPortLcClass3TxFrames = new FcmPortLcClass3TxFramesEnt(mib, this);
                        this.fcmPortLcClass3TxOctets = new FcmPortLcClass3TxOctetsEnt(mib, this);
                        this.fcmPortLcClass3Discards = new FcmPortLcClass3DiscardsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcmPortLcBBCreditZeros,
                            this.fcmPortLcFullInputBuffers,
                            this.fcmPortLcClass2RxFrames,
                            this.fcmPortLcClass2RxOctets,
                            this.fcmPortLcClass2TxFrames,
                            this.fcmPortLcClass2TxOctets,
                            this.fcmPortLcClass2Discards,
                            this.fcmPortLcClass2RxFbsyFrames,
                            this.fcmPortLcClass2RxPbsyFrames,
                            this.fcmPortLcClass2RxFrjtFrames,
                            this.fcmPortLcClass2RxPrjtFrames,
                            this.fcmPortLcClass2TxFbsyFrames,
                            this.fcmPortLcClass2TxPbsyFrames,
                            this.fcmPortLcClass2TxFrjtFrames,
                            this.fcmPortLcClass2TxPrjtFrames,
                            this.fcmPortLcClass3RxFrames,
                            this.fcmPortLcClass3RxOctets,
                            this.fcmPortLcClass3TxFrames,
                            this.fcmPortLcClass3TxOctets,
                            this.fcmPortLcClass3Discards
                        };
                    }
                    public static final class FcmPortLcBBCreditZerosEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcBBCreditZerosEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcBBCreditZeros", "1.3.6.1.2.1.10.56.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcFullInputBuffersEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcFullInputBuffersEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcFullInputBuffers", "1.3.6.1.2.1.10.56.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass2RxFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass2RxFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass2RxFrames", "1.3.6.1.2.1.10.56.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass2RxOctetsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass2RxOctetsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass2RxOctets", "1.3.6.1.2.1.10.56.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass2TxFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass2TxFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass2TxFrames", "1.3.6.1.2.1.10.56.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass2TxOctetsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass2TxOctetsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass2TxOctets", "1.3.6.1.2.1.10.56.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass2DiscardsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass2DiscardsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass2Discards", "1.3.6.1.2.1.10.56.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass2RxFbsyFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass2RxFbsyFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass2RxFbsyFrames", "1.3.6.1.2.1.10.56.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass2RxPbsyFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass2RxPbsyFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass2RxPbsyFrames", "1.3.6.1.2.1.10.56.1.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass2RxFrjtFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass2RxFrjtFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass2RxFrjtFrames", "1.3.6.1.2.1.10.56.1.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass2RxPrjtFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass2RxPrjtFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass2RxPrjtFrames", "1.3.6.1.2.1.10.56.1.5.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass2TxFbsyFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass2TxFbsyFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass2TxFbsyFrames", "1.3.6.1.2.1.10.56.1.5.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass2TxPbsyFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass2TxPbsyFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass2TxPbsyFrames", "1.3.6.1.2.1.10.56.1.5.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass2TxFrjtFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass2TxFrjtFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass2TxFrjtFrames", "1.3.6.1.2.1.10.56.1.5.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass2TxPrjtFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass2TxPrjtFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass2TxPrjtFrames", "1.3.6.1.2.1.10.56.1.5.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass3RxFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass3RxFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass3RxFrames", "1.3.6.1.2.1.10.56.1.5.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass3RxOctetsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass3RxOctetsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass3RxOctets", "1.3.6.1.2.1.10.56.1.5.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass3TxFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass3TxFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass3TxFrames", "1.3.6.1.2.1.10.56.1.5.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass3TxOctetsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass3TxOctetsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass3TxOctets", "1.3.6.1.2.1.10.56.1.5.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLcClass3DiscardsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLcClass3DiscardsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLcClass3Discards", "1.3.6.1.2.1.10.56.1.5.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FcmPortErrorsTableEnt extends MIBEntry<FCMGMTMIBDef>
            {
                public final FcmPortErrorsEntryEnt fcmPortErrorsEntry;

                private FcmPortErrorsTableEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                {
                    super(mib, parent, "fcmPortErrorsTable", "1.3.6.1.2.1.10.56.1.6", false, true, false, false);
                    this.fcmPortErrorsEntry = new FcmPortErrorsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcmPortErrorsEntry
                    };
                }
                public static final class FcmPortErrorsEntryEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    public final FcmPortRxLinkResetsEnt fcmPortRxLinkResets;

                    public final FcmPortTxLinkResetsEnt fcmPortTxLinkResets;

                    public final FcmPortLinkResetsEnt fcmPortLinkResets;

                    public final FcmPortRxOfflineSequencesEnt fcmPortRxOfflineSequences;

                    public final FcmPortTxOfflineSequencesEnt fcmPortTxOfflineSequences;

                    public final FcmPortLinkFailuresEnt fcmPortLinkFailures;

                    public final FcmPortLossofSynchsEnt fcmPortLossofSynchs;

                    public final FcmPortLossofSignalsEnt fcmPortLossofSignals;

                    public final FcmPortPrimSeqProtocolErrorsEnt fcmPortPrimSeqProtocolErrors;

                    public final FcmPortInvalidTxWordsEnt fcmPortInvalidTxWords;

                    public final FcmPortInvalidCRCsEnt fcmPortInvalidCRCs;

                    public final FcmPortInvalidOrderedSetsEnt fcmPortInvalidOrderedSets;

                    public final FcmPortFrameTooLongsEnt fcmPortFrameTooLongs;

                    public final FcmPortTruncatedFramesEnt fcmPortTruncatedFrames;

                    public final FcmPortAddressErrorsEnt fcmPortAddressErrors;

                    public final FcmPortDelimiterErrorsEnt fcmPortDelimiterErrors;

                    public final FcmPortEncodingDisparityErrorsEnt fcmPortEncodingDisparityErrors;

                    public final FcmPortOtherErrorsEnt fcmPortOtherErrors;

                    private FcmPortErrorsEntryEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmPortErrorsEntry", "1.3.6.1.2.1.10.56.1.6.1", false, false, false, true);
                        this.fcmPortRxLinkResets = new FcmPortRxLinkResetsEnt(mib, this);
                        this.fcmPortTxLinkResets = new FcmPortTxLinkResetsEnt(mib, this);
                        this.fcmPortLinkResets = new FcmPortLinkResetsEnt(mib, this);
                        this.fcmPortRxOfflineSequences = new FcmPortRxOfflineSequencesEnt(mib, this);
                        this.fcmPortTxOfflineSequences = new FcmPortTxOfflineSequencesEnt(mib, this);
                        this.fcmPortLinkFailures = new FcmPortLinkFailuresEnt(mib, this);
                        this.fcmPortLossofSynchs = new FcmPortLossofSynchsEnt(mib, this);
                        this.fcmPortLossofSignals = new FcmPortLossofSignalsEnt(mib, this);
                        this.fcmPortPrimSeqProtocolErrors = new FcmPortPrimSeqProtocolErrorsEnt(mib, this);
                        this.fcmPortInvalidTxWords = new FcmPortInvalidTxWordsEnt(mib, this);
                        this.fcmPortInvalidCRCs = new FcmPortInvalidCRCsEnt(mib, this);
                        this.fcmPortInvalidOrderedSets = new FcmPortInvalidOrderedSetsEnt(mib, this);
                        this.fcmPortFrameTooLongs = new FcmPortFrameTooLongsEnt(mib, this);
                        this.fcmPortTruncatedFrames = new FcmPortTruncatedFramesEnt(mib, this);
                        this.fcmPortAddressErrors = new FcmPortAddressErrorsEnt(mib, this);
                        this.fcmPortDelimiterErrors = new FcmPortDelimiterErrorsEnt(mib, this);
                        this.fcmPortEncodingDisparityErrors = new FcmPortEncodingDisparityErrorsEnt(mib, this);
                        this.fcmPortOtherErrors = new FcmPortOtherErrorsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcmPortRxLinkResets,
                            this.fcmPortTxLinkResets,
                            this.fcmPortLinkResets,
                            this.fcmPortRxOfflineSequences,
                            this.fcmPortTxOfflineSequences,
                            this.fcmPortLinkFailures,
                            this.fcmPortLossofSynchs,
                            this.fcmPortLossofSignals,
                            this.fcmPortPrimSeqProtocolErrors,
                            this.fcmPortInvalidTxWords,
                            this.fcmPortInvalidCRCs,
                            this.fcmPortInvalidOrderedSets,
                            this.fcmPortFrameTooLongs,
                            this.fcmPortTruncatedFrames,
                            this.fcmPortAddressErrors,
                            this.fcmPortDelimiterErrors,
                            this.fcmPortEncodingDisparityErrors,
                            this.fcmPortOtherErrors
                        };
                    }
                    public static final class FcmPortRxLinkResetsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortRxLinkResetsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortRxLinkResets", "1.3.6.1.2.1.10.56.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortTxLinkResetsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortTxLinkResetsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortTxLinkResets", "1.3.6.1.2.1.10.56.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLinkResetsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLinkResetsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLinkResets", "1.3.6.1.2.1.10.56.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortRxOfflineSequencesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortRxOfflineSequencesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortRxOfflineSequences", "1.3.6.1.2.1.10.56.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortTxOfflineSequencesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortTxOfflineSequencesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortTxOfflineSequences", "1.3.6.1.2.1.10.56.1.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLinkFailuresEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLinkFailuresEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLinkFailures", "1.3.6.1.2.1.10.56.1.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLossofSynchsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLossofSynchsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLossofSynchs", "1.3.6.1.2.1.10.56.1.6.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortLossofSignalsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortLossofSignalsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortLossofSignals", "1.3.6.1.2.1.10.56.1.6.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortPrimSeqProtocolErrorsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortPrimSeqProtocolErrorsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortPrimSeqProtocolErrors", "1.3.6.1.2.1.10.56.1.6.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortInvalidTxWordsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortInvalidTxWordsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortInvalidTxWords", "1.3.6.1.2.1.10.56.1.6.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortInvalidCRCsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortInvalidCRCsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortInvalidCRCs", "1.3.6.1.2.1.10.56.1.6.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortInvalidOrderedSetsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortInvalidOrderedSetsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortInvalidOrderedSets", "1.3.6.1.2.1.10.56.1.6.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortFrameTooLongsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortFrameTooLongsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortFrameTooLongs", "1.3.6.1.2.1.10.56.1.6.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortTruncatedFramesEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortTruncatedFramesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortTruncatedFrames", "1.3.6.1.2.1.10.56.1.6.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortAddressErrorsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortAddressErrorsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortAddressErrors", "1.3.6.1.2.1.10.56.1.6.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortDelimiterErrorsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortDelimiterErrorsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortDelimiterErrors", "1.3.6.1.2.1.10.56.1.6.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortEncodingDisparityErrorsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortEncodingDisparityErrorsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortEncodingDisparityErrors", "1.3.6.1.2.1.10.56.1.6.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmPortOtherErrorsEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmPortOtherErrorsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmPortOtherErrors", "1.3.6.1.2.1.10.56.1.6.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FcmFxPortTableEnt extends MIBEntry<FCMGMTMIBDef>
            {
                public final FcmFxPortEntryEnt fcmFxPortEntry;

                private FcmFxPortTableEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                {
                    super(mib, parent, "fcmFxPortTable", "1.3.6.1.2.1.10.56.1.7", false, true, false, false);
                    this.fcmFxPortEntry = new FcmFxPortEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcmFxPortEntry
                    };
                }
                public static final class FcmFxPortEntryEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    public final FcmFxPortRatovEnt fcmFxPortRatov;

                    public final FcmFxPortEdtovEnt fcmFxPortEdtov;

                    public final FcmFxPortRttovEnt fcmFxPortRttov;

                    public final FcmFxPortHoldTimeEnt fcmFxPortHoldTime;

                    public final FcmFxPortCapBbCreditMaxEnt fcmFxPortCapBbCreditMax;

                    public final FcmFxPortCapBbCreditMinEnt fcmFxPortCapBbCreditMin;

                    public final FcmFxPortCapDataFieldSizeMaxEnt fcmFxPortCapDataFieldSizeMax;

                    public final FcmFxPortCapDataFieldSizeMinEnt fcmFxPortCapDataFieldSizeMin;

                    public final FcmFxPortCapClass2SeqDelivEnt fcmFxPortCapClass2SeqDeliv;

                    public final FcmFxPortCapClass3SeqDelivEnt fcmFxPortCapClass3SeqDeliv;

                    public final FcmFxPortCapHoldTimeMaxEnt fcmFxPortCapHoldTimeMax;

                    public final FcmFxPortCapHoldTimeMinEnt fcmFxPortCapHoldTimeMin;

                    private FcmFxPortEntryEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmFxPortEntry", "1.3.6.1.2.1.10.56.1.7.1", false, false, false, true);
                        this.fcmFxPortRatov = new FcmFxPortRatovEnt(mib, this);
                        this.fcmFxPortEdtov = new FcmFxPortEdtovEnt(mib, this);
                        this.fcmFxPortRttov = new FcmFxPortRttovEnt(mib, this);
                        this.fcmFxPortHoldTime = new FcmFxPortHoldTimeEnt(mib, this);
                        this.fcmFxPortCapBbCreditMax = new FcmFxPortCapBbCreditMaxEnt(mib, this);
                        this.fcmFxPortCapBbCreditMin = new FcmFxPortCapBbCreditMinEnt(mib, this);
                        this.fcmFxPortCapDataFieldSizeMax = new FcmFxPortCapDataFieldSizeMaxEnt(mib, this);
                        this.fcmFxPortCapDataFieldSizeMin = new FcmFxPortCapDataFieldSizeMinEnt(mib, this);
                        this.fcmFxPortCapClass2SeqDeliv = new FcmFxPortCapClass2SeqDelivEnt(mib, this);
                        this.fcmFxPortCapClass3SeqDeliv = new FcmFxPortCapClass3SeqDelivEnt(mib, this);
                        this.fcmFxPortCapHoldTimeMax = new FcmFxPortCapHoldTimeMaxEnt(mib, this);
                        this.fcmFxPortCapHoldTimeMin = new FcmFxPortCapHoldTimeMinEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcmFxPortRatov,
                            this.fcmFxPortEdtov,
                            this.fcmFxPortRttov,
                            this.fcmFxPortHoldTime,
                            this.fcmFxPortCapBbCreditMax,
                            this.fcmFxPortCapBbCreditMin,
                            this.fcmFxPortCapDataFieldSizeMax,
                            this.fcmFxPortCapDataFieldSizeMin,
                            this.fcmFxPortCapClass2SeqDeliv,
                            this.fcmFxPortCapClass3SeqDeliv,
                            this.fcmFxPortCapHoldTimeMax,
                            this.fcmFxPortCapHoldTimeMin
                        };
                    }
                    public static final class FcmFxPortRatovEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFxPortRatovEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFxPortRatov", "1.3.6.1.2.1.10.56.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFxPortEdtovEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFxPortEdtovEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFxPortEdtov", "1.3.6.1.2.1.10.56.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFxPortRttovEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFxPortRttovEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFxPortRttov", "1.3.6.1.2.1.10.56.1.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFxPortHoldTimeEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFxPortHoldTimeEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFxPortHoldTime", "1.3.6.1.2.1.10.56.1.7.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFxPortCapBbCreditMaxEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFxPortCapBbCreditMaxEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFxPortCapBbCreditMax", "1.3.6.1.2.1.10.56.1.7.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFxPortCapBbCreditMinEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFxPortCapBbCreditMinEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFxPortCapBbCreditMin", "1.3.6.1.2.1.10.56.1.7.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFxPortCapDataFieldSizeMaxEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFxPortCapDataFieldSizeMaxEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFxPortCapDataFieldSizeMax", "1.3.6.1.2.1.10.56.1.7.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFxPortCapDataFieldSizeMinEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFxPortCapDataFieldSizeMinEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFxPortCapDataFieldSizeMin", "1.3.6.1.2.1.10.56.1.7.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFxPortCapClass2SeqDelivEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFxPortCapClass2SeqDelivEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFxPortCapClass2SeqDeliv", "1.3.6.1.2.1.10.56.1.7.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFxPortCapClass3SeqDelivEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFxPortCapClass3SeqDelivEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFxPortCapClass3SeqDeliv", "1.3.6.1.2.1.10.56.1.7.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFxPortCapHoldTimeMaxEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFxPortCapHoldTimeMaxEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFxPortCapHoldTimeMax", "1.3.6.1.2.1.10.56.1.7.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFxPortCapHoldTimeMinEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFxPortCapHoldTimeMinEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFxPortCapHoldTimeMin", "1.3.6.1.2.1.10.56.1.7.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FcmISPortTableEnt extends MIBEntry<FCMGMTMIBDef>
            {
                public final FcmISPortEntryEnt fcmISPortEntry;

                private FcmISPortTableEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                {
                    super(mib, parent, "fcmISPortTable", "1.3.6.1.2.1.10.56.1.8", false, true, false, false);
                    this.fcmISPortEntry = new FcmISPortEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcmISPortEntry
                    };
                }
                public static final class FcmISPortEntryEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    public final FcmISPortClassFCreditEnt fcmISPortClassFCredit;

                    public final FcmISPortClassFDataFieldSizeEnt fcmISPortClassFDataFieldSize;

                    private FcmISPortEntryEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmISPortEntry", "1.3.6.1.2.1.10.56.1.8.1", false, false, false, true);
                        this.fcmISPortClassFCredit = new FcmISPortClassFCreditEnt(mib, this);
                        this.fcmISPortClassFDataFieldSize = new FcmISPortClassFDataFieldSizeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcmISPortClassFCredit,
                            this.fcmISPortClassFDataFieldSize
                        };
                    }
                    public static final class FcmISPortClassFCreditEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmISPortClassFCreditEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmISPortClassFCredit", "1.3.6.1.2.1.10.56.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmISPortClassFDataFieldSizeEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmISPortClassFDataFieldSizeEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmISPortClassFDataFieldSize", "1.3.6.1.2.1.10.56.1.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FcmFLoginTableEnt extends MIBEntry<FCMGMTMIBDef>
            {
                public final FcmFLoginEntryEnt fcmFLoginEntry;

                private FcmFLoginTableEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                {
                    super(mib, parent, "fcmFLoginTable", "1.3.6.1.2.1.10.56.1.9", false, true, false, false);
                    this.fcmFLoginEntry = new FcmFLoginEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcmFLoginEntry
                    };
                }
                public static final class FcmFLoginEntryEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    public final FcmFLoginNxPortIndexEnt fcmFLoginNxPortIndex;

                    public final FcmFLoginPortWwnEnt fcmFLoginPortWwn;

                    public final FcmFLoginNodeWwnEnt fcmFLoginNodeWwn;

                    public final FcmFLoginBbCreditModelEnt fcmFLoginBbCreditModel;

                    public final FcmFLoginBbCreditEnt fcmFLoginBbCredit;

                    public final FcmFLoginClassesAgreedEnt fcmFLoginClassesAgreed;

                    public final FcmFLoginClass2SeqDelivAgreedEnt fcmFLoginClass2SeqDelivAgreed;

                    public final FcmFLoginClass2DataFieldSizeEnt fcmFLoginClass2DataFieldSize;

                    public final FcmFLoginClass3SeqDelivAgreedEnt fcmFLoginClass3SeqDelivAgreed;

                    public final FcmFLoginClass3DataFieldSizeEnt fcmFLoginClass3DataFieldSize;

                    private FcmFLoginEntryEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmFLoginEntry", "1.3.6.1.2.1.10.56.1.9.1", false, false, false, true);
                        this.fcmFLoginNxPortIndex = new FcmFLoginNxPortIndexEnt(mib, this);
                        this.fcmFLoginPortWwn = new FcmFLoginPortWwnEnt(mib, this);
                        this.fcmFLoginNodeWwn = new FcmFLoginNodeWwnEnt(mib, this);
                        this.fcmFLoginBbCreditModel = new FcmFLoginBbCreditModelEnt(mib, this);
                        this.fcmFLoginBbCredit = new FcmFLoginBbCreditEnt(mib, this);
                        this.fcmFLoginClassesAgreed = new FcmFLoginClassesAgreedEnt(mib, this);
                        this.fcmFLoginClass2SeqDelivAgreed = new FcmFLoginClass2SeqDelivAgreedEnt(mib, this);
                        this.fcmFLoginClass2DataFieldSize = new FcmFLoginClass2DataFieldSizeEnt(mib, this);
                        this.fcmFLoginClass3SeqDelivAgreed = new FcmFLoginClass3SeqDelivAgreedEnt(mib, this);
                        this.fcmFLoginClass3DataFieldSize = new FcmFLoginClass3DataFieldSizeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcmFLoginNxPortIndex,
                            this.fcmFLoginPortWwn,
                            this.fcmFLoginNodeWwn,
                            this.fcmFLoginBbCreditModel,
                            this.fcmFLoginBbCredit,
                            this.fcmFLoginClassesAgreed,
                            this.fcmFLoginClass2SeqDelivAgreed,
                            this.fcmFLoginClass2DataFieldSize,
                            this.fcmFLoginClass3SeqDelivAgreed,
                            this.fcmFLoginClass3DataFieldSize
                        };
                    }
                    public static final class FcmFLoginNxPortIndexEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFLoginNxPortIndexEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFLoginNxPortIndex", "1.3.6.1.2.1.10.56.1.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFLoginPortWwnEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFLoginPortWwnEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFLoginPortWwn", "1.3.6.1.2.1.10.56.1.9.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFLoginNodeWwnEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFLoginNodeWwnEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFLoginNodeWwn", "1.3.6.1.2.1.10.56.1.9.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFLoginBbCreditModelEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFLoginBbCreditModelEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFLoginBbCreditModel", "1.3.6.1.2.1.10.56.1.9.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFLoginBbCreditEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFLoginBbCreditEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFLoginBbCredit", "1.3.6.1.2.1.10.56.1.9.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFLoginClassesAgreedEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFLoginClassesAgreedEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFLoginClassesAgreed", "1.3.6.1.2.1.10.56.1.9.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFLoginClass2SeqDelivAgreedEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFLoginClass2SeqDelivAgreedEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFLoginClass2SeqDelivAgreed", "1.3.6.1.2.1.10.56.1.9.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFLoginClass2DataFieldSizeEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFLoginClass2DataFieldSizeEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFLoginClass2DataFieldSize", "1.3.6.1.2.1.10.56.1.9.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFLoginClass3SeqDelivAgreedEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFLoginClass3SeqDelivAgreedEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFLoginClass3SeqDelivAgreed", "1.3.6.1.2.1.10.56.1.9.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmFLoginClass3DataFieldSizeEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmFLoginClass3DataFieldSizeEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmFLoginClass3DataFieldSize", "1.3.6.1.2.1.10.56.1.9.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FcmLinkTableEnt extends MIBEntry<FCMGMTMIBDef>
            {
                public final FcmLinkEntryEnt fcmLinkEntry;

                private FcmLinkTableEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                {
                    super(mib, parent, "fcmLinkTable", "1.3.6.1.2.1.10.56.1.10", false, true, false, false);
                    this.fcmLinkEntry = new FcmLinkEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcmLinkEntry
                    };
                }
                public static final class FcmLinkEntryEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    public final FcmLinkIndexEnt fcmLinkIndex;

                    public final FcmLinkEnd1NodeWwnEnt fcmLinkEnd1NodeWwn;

                    public final FcmLinkEnd1PhysPortNumberEnt fcmLinkEnd1PhysPortNumber;

                    public final FcmLinkEnd1PortWwnEnt fcmLinkEnd1PortWwn;

                    public final FcmLinkEnd2NodeWwnEnt fcmLinkEnd2NodeWwn;

                    public final FcmLinkEnd2PhysPortNumberEnt fcmLinkEnd2PhysPortNumber;

                    public final FcmLinkEnd2PortWwnEnt fcmLinkEnd2PortWwn;

                    public final FcmLinkEnd2AgentAddressEnt fcmLinkEnd2AgentAddress;

                    public final FcmLinkEnd2PortTypeEnt fcmLinkEnd2PortType;

                    public final FcmLinkEnd2UnitTypeEnt fcmLinkEnd2UnitType;

                    public final FcmLinkEnd2FcAddressIdEnt fcmLinkEnd2FcAddressId;

                    private FcmLinkEntryEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmLinkEntry", "1.3.6.1.2.1.10.56.1.10.1", false, false, false, true);
                        this.fcmLinkIndex = new FcmLinkIndexEnt(mib, this);
                        this.fcmLinkEnd1NodeWwn = new FcmLinkEnd1NodeWwnEnt(mib, this);
                        this.fcmLinkEnd1PhysPortNumber = new FcmLinkEnd1PhysPortNumberEnt(mib, this);
                        this.fcmLinkEnd1PortWwn = new FcmLinkEnd1PortWwnEnt(mib, this);
                        this.fcmLinkEnd2NodeWwn = new FcmLinkEnd2NodeWwnEnt(mib, this);
                        this.fcmLinkEnd2PhysPortNumber = new FcmLinkEnd2PhysPortNumberEnt(mib, this);
                        this.fcmLinkEnd2PortWwn = new FcmLinkEnd2PortWwnEnt(mib, this);
                        this.fcmLinkEnd2AgentAddress = new FcmLinkEnd2AgentAddressEnt(mib, this);
                        this.fcmLinkEnd2PortType = new FcmLinkEnd2PortTypeEnt(mib, this);
                        this.fcmLinkEnd2UnitType = new FcmLinkEnd2UnitTypeEnt(mib, this);
                        this.fcmLinkEnd2FcAddressId = new FcmLinkEnd2FcAddressIdEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcmLinkIndex,
                            this.fcmLinkEnd1NodeWwn,
                            this.fcmLinkEnd1PhysPortNumber,
                            this.fcmLinkEnd1PortWwn,
                            this.fcmLinkEnd2NodeWwn,
                            this.fcmLinkEnd2PhysPortNumber,
                            this.fcmLinkEnd2PortWwn,
                            this.fcmLinkEnd2AgentAddress,
                            this.fcmLinkEnd2PortType,
                            this.fcmLinkEnd2UnitType,
                            this.fcmLinkEnd2FcAddressId
                        };
                    }
                    public static final class FcmLinkIndexEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmLinkIndexEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmLinkIndex", "1.3.6.1.2.1.10.56.1.10.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmLinkEnd1NodeWwnEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmLinkEnd1NodeWwnEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmLinkEnd1NodeWwn", "1.3.6.1.2.1.10.56.1.10.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmLinkEnd1PhysPortNumberEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmLinkEnd1PhysPortNumberEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmLinkEnd1PhysPortNumber", "1.3.6.1.2.1.10.56.1.10.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmLinkEnd1PortWwnEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmLinkEnd1PortWwnEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmLinkEnd1PortWwn", "1.3.6.1.2.1.10.56.1.10.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmLinkEnd2NodeWwnEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmLinkEnd2NodeWwnEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmLinkEnd2NodeWwn", "1.3.6.1.2.1.10.56.1.10.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmLinkEnd2PhysPortNumberEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmLinkEnd2PhysPortNumberEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmLinkEnd2PhysPortNumber", "1.3.6.1.2.1.10.56.1.10.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmLinkEnd2PortWwnEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmLinkEnd2PortWwnEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmLinkEnd2PortWwn", "1.3.6.1.2.1.10.56.1.10.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmLinkEnd2AgentAddressEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmLinkEnd2AgentAddressEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmLinkEnd2AgentAddress", "1.3.6.1.2.1.10.56.1.10.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmLinkEnd2PortTypeEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmLinkEnd2PortTypeEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmLinkEnd2PortType", "1.3.6.1.2.1.10.56.1.10.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmLinkEnd2UnitTypeEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmLinkEnd2UnitTypeEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmLinkEnd2UnitType", "1.3.6.1.2.1.10.56.1.10.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FcmLinkEnd2FcAddressIdEnt extends MIBEntry<FCMGMTMIBDef>
                    {
                        private FcmLinkEnd2FcAddressIdEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                        {
                            super(mib, parent, "fcmLinkEnd2FcAddressId", "1.3.6.1.2.1.10.56.1.10.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class FcmgmtNotificationsEnt extends MIBEntry<FCMGMTMIBDef>
        {
            public final FcmgmtNotifPrefixEnt fcmgmtNotifPrefix;

            private FcmgmtNotificationsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
            {
                super(mib, parent, "fcmgmtNotifications", "1.3.6.1.2.1.10.56.2", false, false, false, false);
                this.fcmgmtNotifPrefix = new FcmgmtNotifPrefixEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.fcmgmtNotifPrefix
                };
            }
            public static final class FcmgmtNotifPrefixEnt extends MIBEntry<FCMGMTMIBDef>
            {
                private FcmgmtNotifPrefixEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                {
                    super(mib, parent, "fcmgmtNotifPrefix", "1.3.6.1.2.1.10.56.2.0", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class FcmgmtConformanceEnt extends MIBEntry<FCMGMTMIBDef>
        {
            /** ********************************Conformance Section*/
            public final FcmgmtCompliancesEnt fcmgmtCompliances;

            public final FcmgmtGroupsEnt fcmgmtGroups;

            private FcmgmtConformanceEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
            {
                super(mib, parent, "fcmgmtConformance", "1.3.6.1.2.1.10.56.3", false, false, false, false);
                this.fcmgmtCompliances = new FcmgmtCompliancesEnt(mib, this);
                this.fcmgmtGroups = new FcmgmtGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.fcmgmtCompliances,
                    this.fcmgmtGroups
                };
            }
            public static final class FcmgmtCompliancesEnt extends MIBEntry<FCMGMTMIBDef>
            {
                public final FcmgmtComplianceEnt fcmgmtCompliance;

                private FcmgmtCompliancesEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                {
                    super(mib, parent, "fcmgmtCompliances", "1.3.6.1.2.1.10.56.3.1", false, false, false, false);
                    this.fcmgmtCompliance = new FcmgmtComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcmgmtCompliance
                    };
                }
                public static final class FcmgmtComplianceEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    private FcmgmtComplianceEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmgmtCompliance", "1.3.6.1.2.1.10.56.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class FcmgmtGroupsEnt extends MIBEntry<FCMGMTMIBDef>
            {
                /** ********************************Object Groups*/
                public final FcmInstanceBasicGroupEnt fcmInstanceBasicGroup;

                public final FcmSwitchBasicGroupEnt fcmSwitchBasicGroup;

                public final FcmPortBasicGroupEnt fcmPortBasicGroup;

                public final FcmPortStatsGroupEnt fcmPortStatsGroup;

                public final FcmPortClass23StatsGroupEnt fcmPortClass23StatsGroup;

                public final FcmPortClassFStatsGroupEnt fcmPortClassFStatsGroup;

                public final FcmPortLcStatsGroupEnt fcmPortLcStatsGroup;

                public final FcmPortErrorsGroupEnt fcmPortErrorsGroup;

                public final FcmSwitchPortGroupEnt fcmSwitchPortGroup;

                public final FcmSwitchLoginGroupEnt fcmSwitchLoginGroup;

                public final FcmLinkBasicGroupEnt fcmLinkBasicGroup;

                private FcmgmtGroupsEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                {
                    super(mib, parent, "fcmgmtGroups", "1.3.6.1.2.1.10.56.3.2", false, false, false, false);
                    this.fcmInstanceBasicGroup = new FcmInstanceBasicGroupEnt(mib, this);
                    this.fcmSwitchBasicGroup = new FcmSwitchBasicGroupEnt(mib, this);
                    this.fcmPortBasicGroup = new FcmPortBasicGroupEnt(mib, this);
                    this.fcmPortStatsGroup = new FcmPortStatsGroupEnt(mib, this);
                    this.fcmPortClass23StatsGroup = new FcmPortClass23StatsGroupEnt(mib, this);
                    this.fcmPortClassFStatsGroup = new FcmPortClassFStatsGroupEnt(mib, this);
                    this.fcmPortLcStatsGroup = new FcmPortLcStatsGroupEnt(mib, this);
                    this.fcmPortErrorsGroup = new FcmPortErrorsGroupEnt(mib, this);
                    this.fcmSwitchPortGroup = new FcmSwitchPortGroupEnt(mib, this);
                    this.fcmSwitchLoginGroup = new FcmSwitchLoginGroupEnt(mib, this);
                    this.fcmLinkBasicGroup = new FcmLinkBasicGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcmInstanceBasicGroup,
                        this.fcmSwitchBasicGroup,
                        this.fcmPortBasicGroup,
                        this.fcmPortStatsGroup,
                        this.fcmPortClass23StatsGroup,
                        this.fcmPortClassFStatsGroup,
                        this.fcmPortLcStatsGroup,
                        this.fcmPortErrorsGroup,
                        this.fcmSwitchPortGroup,
                        this.fcmSwitchLoginGroup,
                        this.fcmLinkBasicGroup
                    };
                }
                public static final class FcmInstanceBasicGroupEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    private FcmInstanceBasicGroupEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmInstanceBasicGroup", "1.3.6.1.2.1.10.56.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcmSwitchBasicGroupEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    private FcmSwitchBasicGroupEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmSwitchBasicGroup", "1.3.6.1.2.1.10.56.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcmPortBasicGroupEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    private FcmPortBasicGroupEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmPortBasicGroup", "1.3.6.1.2.1.10.56.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcmPortStatsGroupEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    private FcmPortStatsGroupEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmPortStatsGroup", "1.3.6.1.2.1.10.56.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcmPortClass23StatsGroupEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    private FcmPortClass23StatsGroupEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmPortClass23StatsGroup", "1.3.6.1.2.1.10.56.3.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcmPortClassFStatsGroupEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    private FcmPortClassFStatsGroupEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmPortClassFStatsGroup", "1.3.6.1.2.1.10.56.3.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcmPortLcStatsGroupEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    private FcmPortLcStatsGroupEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmPortLcStatsGroup", "1.3.6.1.2.1.10.56.3.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcmPortErrorsGroupEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    private FcmPortErrorsGroupEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmPortErrorsGroup", "1.3.6.1.2.1.10.56.3.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcmSwitchPortGroupEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    private FcmSwitchPortGroupEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmSwitchPortGroup", "1.3.6.1.2.1.10.56.3.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcmSwitchLoginGroupEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    private FcmSwitchLoginGroupEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmSwitchLoginGroup", "1.3.6.1.2.1.10.56.3.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcmLinkBasicGroupEnt extends MIBEntry<FCMGMTMIBDef>
                {
                    private FcmLinkBasicGroupEnt(FCMGMTMIBDef mib, MIBEntry<FCMGMTMIBDef> parent)
                    {
                        super(mib, parent, "fcmLinkBasicGroup", "1.3.6.1.2.1.10.56.3.2.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
