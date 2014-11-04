package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2580]
[RFC2579]
[RFC2863]
[FC-MGMT]*/
public final class T11FCROUTEMIBDef extends MIB
{
    public static final T11FCROUTEMIBDef T11FCROUTEMIB = new T11FCROUTEMIBDef();

    static { MIBs.getInstance().registerMIB(T11FCROUTEMIBDef.T11FCROUTEMIB); }

    /** [RFC4439]*/
    public final T11FcRouteMIBEnt t11FcRouteMIB;

    private T11FCROUTEMIBDef()
    {
        super("T11-FC-ROUTE-MIB");
        this.t11FcRouteMIB = new T11FcRouteMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.t11FcRouteMIB
        };
    }

    public static final class T11FcRouteMIBEnt extends MIBEntry<T11FCROUTEMIBDef>
    {
        public final T11FcRouteNotificationsEnt t11FcRouteNotifications;

        public final T11FcRouteObjectsEnt t11FcRouteObjects;

        public final T11FcRouteConformanceEnt t11FcRouteConformance;

        private T11FcRouteMIBEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
        {
            super(mib, parent, "t11FcRouteMIB", "1.3.6.1.2.1.144", false, false, false, false);
            this.t11FcRouteNotifications = new T11FcRouteNotificationsEnt(mib, this);
            this.t11FcRouteObjects = new T11FcRouteObjectsEnt(mib, this);
            this.t11FcRouteConformance = new T11FcRouteConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.t11FcRouteNotifications,
                this.t11FcRouteObjects,
                this.t11FcRouteConformance
            };
        }
        public static final class T11FcRouteNotificationsEnt extends MIBEntry<T11FCROUTEMIBDef>
        {
            private T11FcRouteNotificationsEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
            {
                super(mib, parent, "t11FcRouteNotifications", "1.3.6.1.2.1.144.0", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class T11FcRouteObjectsEnt extends MIBEntry<T11FCROUTEMIBDef>
        {
            /** Per-Fabric routing information*/
            public final T11FcRouteFabricTableEnt t11FcRouteFabricTable;

            /** Fibre Channel Routing table*/
            public final T11FcRouteTableEnt t11FcRouteTable;

            private T11FcRouteObjectsEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
            {
                super(mib, parent, "t11FcRouteObjects", "1.3.6.1.2.1.144.1", false, false, false, false);
                this.t11FcRouteFabricTable = new T11FcRouteFabricTableEnt(mib, this);
                this.t11FcRouteTable = new T11FcRouteTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11FcRouteFabricTable,
                    this.t11FcRouteTable
                };
            }
            public static final class T11FcRouteFabricTableEnt extends MIBEntry<T11FCROUTEMIBDef>
            {
                public final T11FcRouteFabricEntryEnt t11FcRouteFabricEntry;

                private T11FcRouteFabricTableEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                {
                    super(mib, parent, "t11FcRouteFabricTable", "1.3.6.1.2.1.144.1.1", false, true, false, false);
                    this.t11FcRouteFabricEntry = new T11FcRouteFabricEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FcRouteFabricEntry
                    };
                }
                public static final class T11FcRouteFabricEntryEnt extends MIBEntry<T11FCROUTEMIBDef>
                {
                    public final T11FcRouteFabricIndexEnt t11FcRouteFabricIndex;

                    public final T11FcRouteFabricLastChangeEnt t11FcRouteFabricLastChange;

                    private T11FcRouteFabricEntryEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                    {
                        super(mib, parent, "t11FcRouteFabricEntry", "1.3.6.1.2.1.144.1.1.1", false, false, false, true);
                        this.t11FcRouteFabricIndex = new T11FcRouteFabricIndexEnt(mib, this);
                        this.t11FcRouteFabricLastChange = new T11FcRouteFabricLastChangeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FcRouteFabricIndex,
                            this.t11FcRouteFabricLastChange
                        };
                    }
                    public static final class T11FcRouteFabricIndexEnt extends MIBEntry<T11FCROUTEMIBDef>
                    {
                        private T11FcRouteFabricIndexEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRouteFabricIndex", "1.3.6.1.2.1.144.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11FcRouteFabricLastChangeEnt extends MIBEntry<T11FCROUTEMIBDef>
                    {
                        private T11FcRouteFabricLastChangeEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRouteFabricLastChange", "1.3.6.1.2.1.144.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class T11FcRouteTableEnt extends MIBEntry<T11FCROUTEMIBDef>
            {
                public final T11FcRouteEntryEnt t11FcRouteEntry;

                private T11FcRouteTableEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                {
                    super(mib, parent, "t11FcRouteTable", "1.3.6.1.2.1.144.1.2", false, true, false, false);
                    this.t11FcRouteEntry = new T11FcRouteEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FcRouteEntry
                    };
                }
                public static final class T11FcRouteEntryEnt extends MIBEntry<T11FCROUTEMIBDef>
                {
                    public final T11FcRouteDestAddrIdEnt t11FcRouteDestAddrId;

                    public final T11FcRouteDestMaskEnt t11FcRouteDestMask;

                    public final T11FcRouteSrcAddrIdEnt t11FcRouteSrcAddrId;

                    public final T11FcRouteSrcMaskEnt t11FcRouteSrcMask;

                    public final T11FcRouteInInterfaceEnt t11FcRouteInInterface;

                    public final T11FcRouteProtoEnt t11FcRouteProto;

                    public final T11FcRouteOutInterfaceEnt t11FcRouteOutInterface;

                    public final T11FcRouteDomainIdEnt t11FcRouteDomainId;

                    public final T11FcRouteMetricEnt t11FcRouteMetric;

                    public final T11FcRouteTypeEnt t11FcRouteType;

                    public final T11FcRouteIfDownEnt t11FcRouteIfDown;

                    public final T11FcRouteStorageTypeEnt t11FcRouteStorageType;

                    public final T11FcRouteRowStatusEnt t11FcRouteRowStatus;

                    private T11FcRouteEntryEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                    {
                        super(mib, parent, "t11FcRouteEntry", "1.3.6.1.2.1.144.1.2.1", false, false, false, true);
                        this.t11FcRouteDestAddrId = new T11FcRouteDestAddrIdEnt(mib, this);
                        this.t11FcRouteDestMask = new T11FcRouteDestMaskEnt(mib, this);
                        this.t11FcRouteSrcAddrId = new T11FcRouteSrcAddrIdEnt(mib, this);
                        this.t11FcRouteSrcMask = new T11FcRouteSrcMaskEnt(mib, this);
                        this.t11FcRouteInInterface = new T11FcRouteInInterfaceEnt(mib, this);
                        this.t11FcRouteProto = new T11FcRouteProtoEnt(mib, this);
                        this.t11FcRouteOutInterface = new T11FcRouteOutInterfaceEnt(mib, this);
                        this.t11FcRouteDomainId = new T11FcRouteDomainIdEnt(mib, this);
                        this.t11FcRouteMetric = new T11FcRouteMetricEnt(mib, this);
                        this.t11FcRouteType = new T11FcRouteTypeEnt(mib, this);
                        this.t11FcRouteIfDown = new T11FcRouteIfDownEnt(mib, this);
                        this.t11FcRouteStorageType = new T11FcRouteStorageTypeEnt(mib, this);
                        this.t11FcRouteRowStatus = new T11FcRouteRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FcRouteDestAddrId,
                            this.t11FcRouteDestMask,
                            this.t11FcRouteSrcAddrId,
                            this.t11FcRouteSrcMask,
                            this.t11FcRouteInInterface,
                            this.t11FcRouteProto,
                            this.t11FcRouteOutInterface,
                            this.t11FcRouteDomainId,
                            this.t11FcRouteMetric,
                            this.t11FcRouteType,
                            this.t11FcRouteIfDown,
                            this.t11FcRouteStorageType,
                            this.t11FcRouteRowStatus
                        };
                    }
                    public static final class T11FcRouteDestAddrIdEnt extends MIBEntry<T11FCROUTEMIBDef>
                    {
                        private T11FcRouteDestAddrIdEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRouteDestAddrId", "1.3.6.1.2.1.144.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11FcRouteDestMaskEnt extends MIBEntry<T11FCROUTEMIBDef>
                    {
                        private T11FcRouteDestMaskEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRouteDestMask", "1.3.6.1.2.1.144.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11FcRouteSrcAddrIdEnt extends MIBEntry<T11FCROUTEMIBDef>
                    {
                        private T11FcRouteSrcAddrIdEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRouteSrcAddrId", "1.3.6.1.2.1.144.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11FcRouteSrcMaskEnt extends MIBEntry<T11FCROUTEMIBDef>
                    {
                        private T11FcRouteSrcMaskEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRouteSrcMask", "1.3.6.1.2.1.144.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11FcRouteInInterfaceEnt extends MIBEntry<T11FCROUTEMIBDef>
                    {
                        private T11FcRouteInInterfaceEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRouteInInterface", "1.3.6.1.2.1.144.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11FcRouteProtoEnt extends MIBEntry<T11FCROUTEMIBDef>
                    {
                        private T11FcRouteProtoEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRouteProto", "1.3.6.1.2.1.144.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11FcRouteOutInterfaceEnt extends MIBEntry<T11FCROUTEMIBDef>
                    {
                        private T11FcRouteOutInterfaceEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRouteOutInterface", "1.3.6.1.2.1.144.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11FcRouteDomainIdEnt extends MIBEntry<T11FCROUTEMIBDef>
                    {
                        private T11FcRouteDomainIdEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRouteDomainId", "1.3.6.1.2.1.144.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11FcRouteMetricEnt extends MIBEntry<T11FCROUTEMIBDef>
                    {
                        private T11FcRouteMetricEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRouteMetric", "1.3.6.1.2.1.144.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11FcRouteTypeEnt extends MIBEntry<T11FCROUTEMIBDef>
                    {
                        private T11FcRouteTypeEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRouteType", "1.3.6.1.2.1.144.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11FcRouteIfDownEnt extends MIBEntry<T11FCROUTEMIBDef>
                    {
                        private T11FcRouteIfDownEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRouteIfDown", "1.3.6.1.2.1.144.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11FcRouteStorageTypeEnt extends MIBEntry<T11FCROUTEMIBDef>
                    {
                        private T11FcRouteStorageTypeEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRouteStorageType", "1.3.6.1.2.1.144.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class T11FcRouteRowStatusEnt extends MIBEntry<T11FCROUTEMIBDef>
                    {
                        private T11FcRouteRowStatusEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRouteRowStatus", "1.3.6.1.2.1.144.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class T11FcRouteConformanceEnt extends MIBEntry<T11FCROUTEMIBDef>
        {
            /** Conformance*/
            public final T11FcRouteCompliancesEnt t11FcRouteCompliances;

            public final T11FcRouteGroupsEnt t11FcRouteGroups;

            private T11FcRouteConformanceEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
            {
                super(mib, parent, "t11FcRouteConformance", "1.3.6.1.2.1.144.2", false, false, false, false);
                this.t11FcRouteCompliances = new T11FcRouteCompliancesEnt(mib, this);
                this.t11FcRouteGroups = new T11FcRouteGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11FcRouteCompliances,
                    this.t11FcRouteGroups
                };
            }
            public static final class T11FcRouteCompliancesEnt extends MIBEntry<T11FCROUTEMIBDef>
            {
                public final T11FcRouteComplianceEnt t11FcRouteCompliance;

                private T11FcRouteCompliancesEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                {
                    super(mib, parent, "t11FcRouteCompliances", "1.3.6.1.2.1.144.2.1", false, false, false, false);
                    this.t11FcRouteCompliance = new T11FcRouteComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FcRouteCompliance
                    };
                }
                public static final class T11FcRouteComplianceEnt extends MIBEntry<T11FCROUTEMIBDef>
                {
                    private T11FcRouteComplianceEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                    {
                        super(mib, parent, "t11FcRouteCompliance", "1.3.6.1.2.1.144.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class T11FcRouteGroupsEnt extends MIBEntry<T11FCROUTEMIBDef>
            {
                public final T11FcRouteGroupEnt t11FcRouteGroup;

                private T11FcRouteGroupsEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                {
                    super(mib, parent, "t11FcRouteGroups", "1.3.6.1.2.1.144.2.2", false, false, false, false);
                    this.t11FcRouteGroup = new T11FcRouteGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FcRouteGroup
                    };
                }
                public static final class T11FcRouteGroupEnt extends MIBEntry<T11FCROUTEMIBDef>
                {
                    private T11FcRouteGroupEnt(T11FCROUTEMIBDef mib, MIBEntry<T11FCROUTEMIBDef> parent)
                    {
                        super(mib, parent, "t11FcRouteGroup", "1.3.6.1.2.1.144.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
