package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2579]
[RFC2580]
[RFC4001]
[RFC4044]
[RFC4438]*/
public final class T11FCFABRICLOCKMIBDef extends MIB
{
    public static final T11FCFABRICLOCKMIBDef T11FCFABRICLOCKMIB = new T11FCFABRICLOCKMIBDef();

    static { MIBs.getInstance().registerMIB(T11FCFABRICLOCKMIBDef.T11FCFABRICLOCKMIB); }

    /** [RFC4439]*/
    public final T11FabricLockMIBEnt t11FabricLockMIB;

    private T11FCFABRICLOCKMIBDef()
    {
        super("T11-FC-FABRIC-LOCK-MIB");
        this.t11FabricLockMIB = new T11FabricLockMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.t11FabricLockMIB
        };
    }

    public static final class T11FabricLockMIBEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
    {
        public final T11FLockMIBObjectsEnt t11FLockMIBObjects;

        public final T11FLockMIBConformanceEnt t11FLockMIBConformance;

        public final T11FLockMIBNotificationsEnt t11FLockMIBNotifications;

        private T11FabricLockMIBEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
        {
            super(mib, parent, "t11FabricLockMIB", "1.3.6.1.2.1.159", false, false, false, false);
            this.t11FLockMIBObjects = new T11FLockMIBObjectsEnt(mib, this);
            this.t11FLockMIBConformance = new T11FLockMIBConformanceEnt(mib, this);
            this.t11FLockMIBNotifications = new T11FLockMIBNotificationsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.t11FLockMIBObjects,
                this.t11FLockMIBConformance,
                this.t11FLockMIBNotifications
            };
        }
        public static final class T11FLockMIBObjectsEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
        {
            public final T11FLockConfigurationEnt t11FLockConfiguration;

            private T11FLockMIBObjectsEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
            {
                super(mib, parent, "t11FLockMIBObjects", "1.3.6.1.2.1.159.1", false, false, false, false);
                this.t11FLockConfiguration = new T11FLockConfigurationEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11FLockConfiguration
                };
            }
            public static final class T11FLockConfigurationEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
            {
                /** The table of Managing Switches and their Fabric Locks*/
                public final T11FLockTableEnt t11FLockTable;

                private T11FLockConfigurationEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                {
                    super(mib, parent, "t11FLockConfiguration", "1.3.6.1.2.1.159.1.1", false, false, false, false);
                    this.t11FLockTable = new T11FLockTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FLockTable
                    };
                }
                public static final class T11FLockTableEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
                {
                    public final T11FLockEntryEnt t11FLockEntry;

                    private T11FLockTableEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                    {
                        super(mib, parent, "t11FLockTable", "1.3.6.1.2.1.159.1.1.1", false, true, false, false);
                        this.t11FLockEntry = new T11FLockEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FLockEntry
                        };
                    }
                    public static final class T11FLockEntryEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
                    {
                        public final T11FLockFabricIndexEnt t11FLockFabricIndex;

                        public final T11FLockApplicationIDEnt t11FLockApplicationID;

                        public final T11FLockInitiatorTypeEnt t11FLockInitiatorType;

                        public final T11FLockInitiatorEnt t11FLockInitiator;

                        public final T11FLockInitiatorIpAddrTypeEnt t11FLockInitiatorIpAddrType;

                        public final T11FLockInitiatorIpAddrEnt t11FLockInitiatorIpAddr;

                        public final T11FLockStatusEnt t11FLockStatus;

                        public final T11FLockRejectReasonCodeEnt t11FLockRejectReasonCode;

                        public final T11FLockRejectReasonCodeExpEnt t11FLockRejectReasonCodeExp;

                        public final T11FLockRejectReasonVendorCodeEnt t11FLockRejectReasonVendorCode;

                        public final T11FLockRowStatusEnt t11FLockRowStatus;

                        private T11FLockEntryEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                        {
                            super(mib, parent, "t11FLockEntry", "1.3.6.1.2.1.159.1.1.1.1", false, false, false, true);
                            this.t11FLockFabricIndex = new T11FLockFabricIndexEnt(mib, this);
                            this.t11FLockApplicationID = new T11FLockApplicationIDEnt(mib, this);
                            this.t11FLockInitiatorType = new T11FLockInitiatorTypeEnt(mib, this);
                            this.t11FLockInitiator = new T11FLockInitiatorEnt(mib, this);
                            this.t11FLockInitiatorIpAddrType = new T11FLockInitiatorIpAddrTypeEnt(mib, this);
                            this.t11FLockInitiatorIpAddr = new T11FLockInitiatorIpAddrEnt(mib, this);
                            this.t11FLockStatus = new T11FLockStatusEnt(mib, this);
                            this.t11FLockRejectReasonCode = new T11FLockRejectReasonCodeEnt(mib, this);
                            this.t11FLockRejectReasonCodeExp = new T11FLockRejectReasonCodeExpEnt(mib, this);
                            this.t11FLockRejectReasonVendorCode = new T11FLockRejectReasonVendorCodeEnt(mib, this);
                            this.t11FLockRowStatus = new T11FLockRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FLockFabricIndex,
                                this.t11FLockApplicationID,
                                this.t11FLockInitiatorType,
                                this.t11FLockInitiator,
                                this.t11FLockInitiatorIpAddrType,
                                this.t11FLockInitiatorIpAddr,
                                this.t11FLockStatus,
                                this.t11FLockRejectReasonCode,
                                this.t11FLockRejectReasonCodeExp,
                                this.t11FLockRejectReasonVendorCode,
                                this.t11FLockRowStatus
                            };
                        }
                        public static final class T11FLockFabricIndexEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
                        {
                            private T11FLockFabricIndexEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                            {
                                super(mib, parent, "t11FLockFabricIndex", "1.3.6.1.2.1.159.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FLockApplicationIDEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
                        {
                            private T11FLockApplicationIDEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                            {
                                super(mib, parent, "t11FLockApplicationID", "1.3.6.1.2.1.159.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FLockInitiatorTypeEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
                        {
                            private T11FLockInitiatorTypeEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                            {
                                super(mib, parent, "t11FLockInitiatorType", "1.3.6.1.2.1.159.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FLockInitiatorEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
                        {
                            private T11FLockInitiatorEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                            {
                                super(mib, parent, "t11FLockInitiator", "1.3.6.1.2.1.159.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FLockInitiatorIpAddrTypeEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
                        {
                            private T11FLockInitiatorIpAddrTypeEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                            {
                                super(mib, parent, "t11FLockInitiatorIpAddrType", "1.3.6.1.2.1.159.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FLockInitiatorIpAddrEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
                        {
                            private T11FLockInitiatorIpAddrEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                            {
                                super(mib, parent, "t11FLockInitiatorIpAddr", "1.3.6.1.2.1.159.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FLockStatusEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
                        {
                            private T11FLockStatusEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                            {
                                super(mib, parent, "t11FLockStatus", "1.3.6.1.2.1.159.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FLockRejectReasonCodeEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
                        {
                            private T11FLockRejectReasonCodeEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                            {
                                super(mib, parent, "t11FLockRejectReasonCode", "1.3.6.1.2.1.159.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FLockRejectReasonCodeExpEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
                        {
                            private T11FLockRejectReasonCodeExpEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                            {
                                super(mib, parent, "t11FLockRejectReasonCodeExp", "1.3.6.1.2.1.159.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FLockRejectReasonVendorCodeEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
                        {
                            private T11FLockRejectReasonVendorCodeEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                            {
                                super(mib, parent, "t11FLockRejectReasonVendorCode", "1.3.6.1.2.1.159.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FLockRowStatusEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
                        {
                            private T11FLockRowStatusEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                            {
                                super(mib, parent, "t11FLockRowStatus", "1.3.6.1.2.1.159.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class T11FLockMIBConformanceEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
        {
            /** Conformance*/
            public final T11FLockMIBCompliancesEnt t11FLockMIBCompliances;

            public final T11FLockMIBGroupsEnt t11FLockMIBGroups;

            private T11FLockMIBConformanceEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
            {
                super(mib, parent, "t11FLockMIBConformance", "1.3.6.1.2.1.159.2", false, false, false, false);
                this.t11FLockMIBCompliances = new T11FLockMIBCompliancesEnt(mib, this);
                this.t11FLockMIBGroups = new T11FLockMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11FLockMIBCompliances,
                    this.t11FLockMIBGroups
                };
            }
            public static final class T11FLockMIBCompliancesEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
            {
                public final T11FLockMIBComplianceEnt t11FLockMIBCompliance;

                private T11FLockMIBCompliancesEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                {
                    super(mib, parent, "t11FLockMIBCompliances", "1.3.6.1.2.1.159.2.1", false, false, false, false);
                    this.t11FLockMIBCompliance = new T11FLockMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FLockMIBCompliance
                    };
                }
                public static final class T11FLockMIBComplianceEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
                {
                    private T11FLockMIBComplianceEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                    {
                        super(mib, parent, "t11FLockMIBCompliance", "1.3.6.1.2.1.159.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class T11FLockMIBGroupsEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
            {
                /** Units of Conformance*/
                public final T11FLockActiveGroupEnt t11FLockActiveGroup;

                private T11FLockMIBGroupsEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                {
                    super(mib, parent, "t11FLockMIBGroups", "1.3.6.1.2.1.159.2.2", false, false, false, false);
                    this.t11FLockActiveGroup = new T11FLockActiveGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FLockActiveGroup
                    };
                }
                public static final class T11FLockActiveGroupEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
                {
                    private T11FLockActiveGroupEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
                    {
                        super(mib, parent, "t11FLockActiveGroup", "1.3.6.1.2.1.159.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class T11FLockMIBNotificationsEnt extends MIBEntry<T11FCFABRICLOCKMIBDef>
        {
            private T11FLockMIBNotificationsEnt(T11FCFABRICLOCKMIBDef mib, MIBEntry<T11FCFABRICLOCKMIBDef> parent)
            {
                super(mib, parent, "t11FLockMIBNotifications", "1.3.6.1.2.1.159.0", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

}
