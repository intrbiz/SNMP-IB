package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**End of TE-LINK-STD-MIB*/
public final class TELINKSTDMIBDef extends MIB
{
    public static final TELINKSTDMIBDef TELINKSTDMIB = new TELINKSTDMIBDef();

    /** 11 October 2005*/
    public final TeLinkStdMIBEnt teLinkStdMIB;

    private TELINKSTDMIBDef()
    {
        super("TE-LINK-STD-MIB");
        this.teLinkStdMIB = new TeLinkStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.teLinkStdMIB
        };
    }

    public static final class TeLinkStdMIBEnt extends MIBEntry<TELINKSTDMIBDef>
    {
        /** Top level components of this MIB module
Notifications*/
        public final TeLinkNotificationsEnt teLinkNotifications;

        /** Tables, Scalars*/
        public final TeLinkObjectsEnt teLinkObjects;

        /** Conformance*/
        public final TeLinkConformanceEnt teLinkConformance;

        private TeLinkStdMIBEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
        {
            super(mib, parent, "teLinkStdMIB", "1.3.6.1.2.1.10.200", false, false, false, false);
            this.teLinkNotifications = new TeLinkNotificationsEnt(mib, this);
            this.teLinkObjects = new TeLinkObjectsEnt(mib, this);
            this.teLinkConformance = new TeLinkConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.teLinkNotifications,
                this.teLinkObjects,
                this.teLinkConformance
            };
        }
        public static final class TeLinkNotificationsEnt extends MIBEntry<TELINKSTDMIBDef>
        {
            private TeLinkNotificationsEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
            {
                super(mib, parent, "teLinkNotifications", "1.3.6.1.2.1.10.200.0", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TeLinkObjectsEnt extends MIBEntry<TELINKSTDMIBDef>
        {
            /** TE Link Table*/
            public final TeLinkTableEnt teLinkTable;

            /** End of teLinkTable

TE Link Descriptor Table*/
            public final TeLinkDescriptorTableEnt teLinkDescriptorTable;

            /** End of teLinkDescriptorTable

TE Link Shared Risk Link Group Table*/
            public final TeLinkSrlgTableEnt teLinkSrlgTable;

            /** End of teLinkSrlgTable

TE Link Bandwidth Table*/
            public final TeLinkBandwidthTableEnt teLinkBandwidthTable;

            /** End of teLinkBandwidthTable

Component Link Table*/
            public final ComponentLinkTableEnt componentLinkTable;

            /** End of componentLinkTable

Component Link Descriptor Table*/
            public final ComponentLinkDescriptorTableEnt componentLinkDescriptorTable;

            /** End of componentLinkDescriptorTable

Component Link Bandwidth Table*/
            public final ComponentLinkBandwidthTableEnt componentLinkBandwidthTable;

            private TeLinkObjectsEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
            {
                super(mib, parent, "teLinkObjects", "1.3.6.1.2.1.10.200.1", false, false, false, false);
                this.teLinkTable = new TeLinkTableEnt(mib, this);
                this.teLinkDescriptorTable = new TeLinkDescriptorTableEnt(mib, this);
                this.teLinkSrlgTable = new TeLinkSrlgTableEnt(mib, this);
                this.teLinkBandwidthTable = new TeLinkBandwidthTableEnt(mib, this);
                this.componentLinkTable = new ComponentLinkTableEnt(mib, this);
                this.componentLinkDescriptorTable = new ComponentLinkDescriptorTableEnt(mib, this);
                this.componentLinkBandwidthTable = new ComponentLinkBandwidthTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.teLinkTable,
                    this.teLinkDescriptorTable,
                    this.teLinkSrlgTable,
                    this.teLinkBandwidthTable,
                    this.componentLinkTable,
                    this.componentLinkDescriptorTable,
                    this.componentLinkBandwidthTable
                };
            }
            public static final class TeLinkTableEnt extends MIBEntry<TELINKSTDMIBDef>
            {
                public final TeLinkEntryEnt teLinkEntry;

                private TeLinkTableEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                {
                    super(mib, parent, "teLinkTable", "1.3.6.1.2.1.10.200.1.1", false, true, false, false);
                    this.teLinkEntry = new TeLinkEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.teLinkEntry
                    };
                }
                public static final class TeLinkEntryEnt extends MIBEntry<TELINKSTDMIBDef>
                {
                    public final TeLinkAddressTypeEnt teLinkAddressType;

                    public final TeLinkLocalIpAddrEnt teLinkLocalIpAddr;

                    public final TeLinkRemoteIpAddrEnt teLinkRemoteIpAddr;

                    public final TeLinkMetricEnt teLinkMetric;

                    public final TeLinkMaximumReservableBandwidthEnt teLinkMaximumReservableBandwidth;

                    public final TeLinkProtectionTypeEnt teLinkProtectionType;

                    public final TeLinkWorkingPriorityEnt teLinkWorkingPriority;

                    public final TeLinkResourceClassEnt teLinkResourceClass;

                    public final TeLinkIncomingIfIdEnt teLinkIncomingIfId;

                    public final TeLinkOutgoingIfIdEnt teLinkOutgoingIfId;

                    public final TeLinkRowStatusEnt teLinkRowStatus;

                    public final TeLinkStorageTypeEnt teLinkStorageType;

                    private TeLinkEntryEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                    {
                        super(mib, parent, "teLinkEntry", "1.3.6.1.2.1.10.200.1.1.1", false, false, false, true);
                        this.teLinkAddressType = new TeLinkAddressTypeEnt(mib, this);
                        this.teLinkLocalIpAddr = new TeLinkLocalIpAddrEnt(mib, this);
                        this.teLinkRemoteIpAddr = new TeLinkRemoteIpAddrEnt(mib, this);
                        this.teLinkMetric = new TeLinkMetricEnt(mib, this);
                        this.teLinkMaximumReservableBandwidth = new TeLinkMaximumReservableBandwidthEnt(mib, this);
                        this.teLinkProtectionType = new TeLinkProtectionTypeEnt(mib, this);
                        this.teLinkWorkingPriority = new TeLinkWorkingPriorityEnt(mib, this);
                        this.teLinkResourceClass = new TeLinkResourceClassEnt(mib, this);
                        this.teLinkIncomingIfId = new TeLinkIncomingIfIdEnt(mib, this);
                        this.teLinkOutgoingIfId = new TeLinkOutgoingIfIdEnt(mib, this);
                        this.teLinkRowStatus = new TeLinkRowStatusEnt(mib, this);
                        this.teLinkStorageType = new TeLinkStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.teLinkAddressType,
                            this.teLinkLocalIpAddr,
                            this.teLinkRemoteIpAddr,
                            this.teLinkMetric,
                            this.teLinkMaximumReservableBandwidth,
                            this.teLinkProtectionType,
                            this.teLinkWorkingPriority,
                            this.teLinkResourceClass,
                            this.teLinkIncomingIfId,
                            this.teLinkOutgoingIfId,
                            this.teLinkRowStatus,
                            this.teLinkStorageType
                        };
                    }
                    public static final class TeLinkAddressTypeEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkAddressTypeEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkAddressType", "1.3.6.1.2.1.10.200.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkLocalIpAddrEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkLocalIpAddrEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkLocalIpAddr", "1.3.6.1.2.1.10.200.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkRemoteIpAddrEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkRemoteIpAddrEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkRemoteIpAddr", "1.3.6.1.2.1.10.200.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkMetricEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkMetricEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkMetric", "1.3.6.1.2.1.10.200.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkMaximumReservableBandwidthEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkMaximumReservableBandwidthEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkMaximumReservableBandwidth", "1.3.6.1.2.1.10.200.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkProtectionTypeEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkProtectionTypeEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkProtectionType", "1.3.6.1.2.1.10.200.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkWorkingPriorityEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkWorkingPriorityEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkWorkingPriority", "1.3.6.1.2.1.10.200.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkResourceClassEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkResourceClassEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkResourceClass", "1.3.6.1.2.1.10.200.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkIncomingIfIdEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkIncomingIfIdEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkIncomingIfId", "1.3.6.1.2.1.10.200.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkOutgoingIfIdEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkOutgoingIfIdEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkOutgoingIfId", "1.3.6.1.2.1.10.200.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkRowStatusEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkRowStatusEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkRowStatus", "1.3.6.1.2.1.10.200.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkStorageTypeEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkStorageTypeEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkStorageType", "1.3.6.1.2.1.10.200.1.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class TeLinkDescriptorTableEnt extends MIBEntry<TELINKSTDMIBDef>
            {
                public final TeLinkDescriptorEntryEnt teLinkDescriptorEntry;

                private TeLinkDescriptorTableEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                {
                    super(mib, parent, "teLinkDescriptorTable", "1.3.6.1.2.1.10.200.1.2", false, true, false, false);
                    this.teLinkDescriptorEntry = new TeLinkDescriptorEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.teLinkDescriptorEntry
                    };
                }
                public static final class TeLinkDescriptorEntryEnt extends MIBEntry<TELINKSTDMIBDef>
                {
                    public final TeLinkDescriptorIdEnt teLinkDescriptorId;

                    public final TeLinkDescrSwitchingCapabilityEnt teLinkDescrSwitchingCapability;

                    public final TeLinkDescrEncodingTypeEnt teLinkDescrEncodingType;

                    public final TeLinkDescrMinLspBandwidthEnt teLinkDescrMinLspBandwidth;

                    public final TeLinkDescrMaxLspBandwidthPrio0Ent teLinkDescrMaxLspBandwidthPrio0;

                    public final TeLinkDescrMaxLspBandwidthPrio1Ent teLinkDescrMaxLspBandwidthPrio1;

                    public final TeLinkDescrMaxLspBandwidthPrio2Ent teLinkDescrMaxLspBandwidthPrio2;

                    public final TeLinkDescrMaxLspBandwidthPrio3Ent teLinkDescrMaxLspBandwidthPrio3;

                    public final TeLinkDescrMaxLspBandwidthPrio4Ent teLinkDescrMaxLspBandwidthPrio4;

                    public final TeLinkDescrMaxLspBandwidthPrio5Ent teLinkDescrMaxLspBandwidthPrio5;

                    public final TeLinkDescrMaxLspBandwidthPrio6Ent teLinkDescrMaxLspBandwidthPrio6;

                    public final TeLinkDescrMaxLspBandwidthPrio7Ent teLinkDescrMaxLspBandwidthPrio7;

                    public final TeLinkDescrInterfaceMtuEnt teLinkDescrInterfaceMtu;

                    public final TeLinkDescrIndicationEnt teLinkDescrIndication;

                    public final TeLinkDescrRowStatusEnt teLinkDescrRowStatus;

                    public final TeLinkDescrStorageTypeEnt teLinkDescrStorageType;

                    private TeLinkDescriptorEntryEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                    {
                        super(mib, parent, "teLinkDescriptorEntry", "1.3.6.1.2.1.10.200.1.2.1", false, false, false, true);
                        this.teLinkDescriptorId = new TeLinkDescriptorIdEnt(mib, this);
                        this.teLinkDescrSwitchingCapability = new TeLinkDescrSwitchingCapabilityEnt(mib, this);
                        this.teLinkDescrEncodingType = new TeLinkDescrEncodingTypeEnt(mib, this);
                        this.teLinkDescrMinLspBandwidth = new TeLinkDescrMinLspBandwidthEnt(mib, this);
                        this.teLinkDescrMaxLspBandwidthPrio0 = new TeLinkDescrMaxLspBandwidthPrio0Ent(mib, this);
                        this.teLinkDescrMaxLspBandwidthPrio1 = new TeLinkDescrMaxLspBandwidthPrio1Ent(mib, this);
                        this.teLinkDescrMaxLspBandwidthPrio2 = new TeLinkDescrMaxLspBandwidthPrio2Ent(mib, this);
                        this.teLinkDescrMaxLspBandwidthPrio3 = new TeLinkDescrMaxLspBandwidthPrio3Ent(mib, this);
                        this.teLinkDescrMaxLspBandwidthPrio4 = new TeLinkDescrMaxLspBandwidthPrio4Ent(mib, this);
                        this.teLinkDescrMaxLspBandwidthPrio5 = new TeLinkDescrMaxLspBandwidthPrio5Ent(mib, this);
                        this.teLinkDescrMaxLspBandwidthPrio6 = new TeLinkDescrMaxLspBandwidthPrio6Ent(mib, this);
                        this.teLinkDescrMaxLspBandwidthPrio7 = new TeLinkDescrMaxLspBandwidthPrio7Ent(mib, this);
                        this.teLinkDescrInterfaceMtu = new TeLinkDescrInterfaceMtuEnt(mib, this);
                        this.teLinkDescrIndication = new TeLinkDescrIndicationEnt(mib, this);
                        this.teLinkDescrRowStatus = new TeLinkDescrRowStatusEnt(mib, this);
                        this.teLinkDescrStorageType = new TeLinkDescrStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.teLinkDescriptorId,
                            this.teLinkDescrSwitchingCapability,
                            this.teLinkDescrEncodingType,
                            this.teLinkDescrMinLspBandwidth,
                            this.teLinkDescrMaxLspBandwidthPrio0,
                            this.teLinkDescrMaxLspBandwidthPrio1,
                            this.teLinkDescrMaxLspBandwidthPrio2,
                            this.teLinkDescrMaxLspBandwidthPrio3,
                            this.teLinkDescrMaxLspBandwidthPrio4,
                            this.teLinkDescrMaxLspBandwidthPrio5,
                            this.teLinkDescrMaxLspBandwidthPrio6,
                            this.teLinkDescrMaxLspBandwidthPrio7,
                            this.teLinkDescrInterfaceMtu,
                            this.teLinkDescrIndication,
                            this.teLinkDescrRowStatus,
                            this.teLinkDescrStorageType
                        };
                    }
                    public static final class TeLinkDescriptorIdEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkDescriptorIdEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkDescriptorId", "1.3.6.1.2.1.10.200.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkDescrSwitchingCapabilityEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkDescrSwitchingCapabilityEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkDescrSwitchingCapability", "1.3.6.1.2.1.10.200.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkDescrEncodingTypeEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkDescrEncodingTypeEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkDescrEncodingType", "1.3.6.1.2.1.10.200.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkDescrMinLspBandwidthEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkDescrMinLspBandwidthEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkDescrMinLspBandwidth", "1.3.6.1.2.1.10.200.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkDescrMaxLspBandwidthPrio0Ent extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkDescrMaxLspBandwidthPrio0Ent(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkDescrMaxLspBandwidthPrio0", "1.3.6.1.2.1.10.200.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkDescrMaxLspBandwidthPrio1Ent extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkDescrMaxLspBandwidthPrio1Ent(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkDescrMaxLspBandwidthPrio1", "1.3.6.1.2.1.10.200.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkDescrMaxLspBandwidthPrio2Ent extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkDescrMaxLspBandwidthPrio2Ent(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkDescrMaxLspBandwidthPrio2", "1.3.6.1.2.1.10.200.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkDescrMaxLspBandwidthPrio3Ent extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkDescrMaxLspBandwidthPrio3Ent(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkDescrMaxLspBandwidthPrio3", "1.3.6.1.2.1.10.200.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkDescrMaxLspBandwidthPrio4Ent extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkDescrMaxLspBandwidthPrio4Ent(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkDescrMaxLspBandwidthPrio4", "1.3.6.1.2.1.10.200.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkDescrMaxLspBandwidthPrio5Ent extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkDescrMaxLspBandwidthPrio5Ent(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkDescrMaxLspBandwidthPrio5", "1.3.6.1.2.1.10.200.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkDescrMaxLspBandwidthPrio6Ent extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkDescrMaxLspBandwidthPrio6Ent(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkDescrMaxLspBandwidthPrio6", "1.3.6.1.2.1.10.200.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkDescrMaxLspBandwidthPrio7Ent extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkDescrMaxLspBandwidthPrio7Ent(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkDescrMaxLspBandwidthPrio7", "1.3.6.1.2.1.10.200.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkDescrInterfaceMtuEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkDescrInterfaceMtuEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkDescrInterfaceMtu", "1.3.6.1.2.1.10.200.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkDescrIndicationEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkDescrIndicationEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkDescrIndication", "1.3.6.1.2.1.10.200.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkDescrRowStatusEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkDescrRowStatusEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkDescrRowStatus", "1.3.6.1.2.1.10.200.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkDescrStorageTypeEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkDescrStorageTypeEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkDescrStorageType", "1.3.6.1.2.1.10.200.1.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class TeLinkSrlgTableEnt extends MIBEntry<TELINKSTDMIBDef>
            {
                public final TeLinkSrlgEntryEnt teLinkSrlgEntry;

                private TeLinkSrlgTableEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                {
                    super(mib, parent, "teLinkSrlgTable", "1.3.6.1.2.1.10.200.1.3", false, true, false, false);
                    this.teLinkSrlgEntry = new TeLinkSrlgEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.teLinkSrlgEntry
                    };
                }
                public static final class TeLinkSrlgEntryEnt extends MIBEntry<TELINKSTDMIBDef>
                {
                    public final TeLinkSrlgEnt teLinkSrlg;

                    public final TeLinkSrlgRowStatusEnt teLinkSrlgRowStatus;

                    public final TeLinkSrlgStorageTypeEnt teLinkSrlgStorageType;

                    private TeLinkSrlgEntryEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                    {
                        super(mib, parent, "teLinkSrlgEntry", "1.3.6.1.2.1.10.200.1.3.1", false, false, false, true);
                        this.teLinkSrlg = new TeLinkSrlgEnt(mib, this);
                        this.teLinkSrlgRowStatus = new TeLinkSrlgRowStatusEnt(mib, this);
                        this.teLinkSrlgStorageType = new TeLinkSrlgStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.teLinkSrlg,
                            this.teLinkSrlgRowStatus,
                            this.teLinkSrlgStorageType
                        };
                    }
                    public static final class TeLinkSrlgEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkSrlgEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkSrlg", "1.3.6.1.2.1.10.200.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkSrlgRowStatusEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkSrlgRowStatusEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkSrlgRowStatus", "1.3.6.1.2.1.10.200.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkSrlgStorageTypeEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkSrlgStorageTypeEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkSrlgStorageType", "1.3.6.1.2.1.10.200.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class TeLinkBandwidthTableEnt extends MIBEntry<TELINKSTDMIBDef>
            {
                public final TeLinkBandwidthEntryEnt teLinkBandwidthEntry;

                private TeLinkBandwidthTableEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                {
                    super(mib, parent, "teLinkBandwidthTable", "1.3.6.1.2.1.10.200.1.4", false, true, false, false);
                    this.teLinkBandwidthEntry = new TeLinkBandwidthEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.teLinkBandwidthEntry
                    };
                }
                public static final class TeLinkBandwidthEntryEnt extends MIBEntry<TELINKSTDMIBDef>
                {
                    public final TeLinkBandwidthPriorityEnt teLinkBandwidthPriority;

                    public final TeLinkBandwidthUnreservedEnt teLinkBandwidthUnreserved;

                    public final TeLinkBandwidthRowStatusEnt teLinkBandwidthRowStatus;

                    public final TeLinkBandwidthStorageTypeEnt teLinkBandwidthStorageType;

                    private TeLinkBandwidthEntryEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                    {
                        super(mib, parent, "teLinkBandwidthEntry", "1.3.6.1.2.1.10.200.1.4.1", false, false, false, true);
                        this.teLinkBandwidthPriority = new TeLinkBandwidthPriorityEnt(mib, this);
                        this.teLinkBandwidthUnreserved = new TeLinkBandwidthUnreservedEnt(mib, this);
                        this.teLinkBandwidthRowStatus = new TeLinkBandwidthRowStatusEnt(mib, this);
                        this.teLinkBandwidthStorageType = new TeLinkBandwidthStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.teLinkBandwidthPriority,
                            this.teLinkBandwidthUnreserved,
                            this.teLinkBandwidthRowStatus,
                            this.teLinkBandwidthStorageType
                        };
                    }
                    public static final class TeLinkBandwidthPriorityEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkBandwidthPriorityEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkBandwidthPriority", "1.3.6.1.2.1.10.200.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkBandwidthUnreservedEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkBandwidthUnreservedEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkBandwidthUnreserved", "1.3.6.1.2.1.10.200.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkBandwidthRowStatusEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkBandwidthRowStatusEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkBandwidthRowStatus", "1.3.6.1.2.1.10.200.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class TeLinkBandwidthStorageTypeEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private TeLinkBandwidthStorageTypeEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "teLinkBandwidthStorageType", "1.3.6.1.2.1.10.200.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ComponentLinkTableEnt extends MIBEntry<TELINKSTDMIBDef>
            {
                public final ComponentLinkEntryEnt componentLinkEntry;

                private ComponentLinkTableEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                {
                    super(mib, parent, "componentLinkTable", "1.3.6.1.2.1.10.200.1.5", false, true, false, false);
                    this.componentLinkEntry = new ComponentLinkEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.componentLinkEntry
                    };
                }
                public static final class ComponentLinkEntryEnt extends MIBEntry<TELINKSTDMIBDef>
                {
                    public final ComponentLinkMaxResBandwidthEnt componentLinkMaxResBandwidth;

                    public final ComponentLinkPreferredProtectionEnt componentLinkPreferredProtection;

                    public final ComponentLinkCurrentProtectionEnt componentLinkCurrentProtection;

                    public final ComponentLinkRowStatusEnt componentLinkRowStatus;

                    public final ComponentLinkStorageTypeEnt componentLinkStorageType;

                    private ComponentLinkEntryEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                    {
                        super(mib, parent, "componentLinkEntry", "1.3.6.1.2.1.10.200.1.5.1", false, false, false, true);
                        this.componentLinkMaxResBandwidth = new ComponentLinkMaxResBandwidthEnt(mib, this);
                        this.componentLinkPreferredProtection = new ComponentLinkPreferredProtectionEnt(mib, this);
                        this.componentLinkCurrentProtection = new ComponentLinkCurrentProtectionEnt(mib, this);
                        this.componentLinkRowStatus = new ComponentLinkRowStatusEnt(mib, this);
                        this.componentLinkStorageType = new ComponentLinkStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.componentLinkMaxResBandwidth,
                            this.componentLinkPreferredProtection,
                            this.componentLinkCurrentProtection,
                            this.componentLinkRowStatus,
                            this.componentLinkStorageType
                        };
                    }
                    public static final class ComponentLinkMaxResBandwidthEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkMaxResBandwidthEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkMaxResBandwidth", "1.3.6.1.2.1.10.200.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkPreferredProtectionEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkPreferredProtectionEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkPreferredProtection", "1.3.6.1.2.1.10.200.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkCurrentProtectionEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkCurrentProtectionEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkCurrentProtection", "1.3.6.1.2.1.10.200.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkRowStatusEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkRowStatusEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkRowStatus", "1.3.6.1.2.1.10.200.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkStorageTypeEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkStorageTypeEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkStorageType", "1.3.6.1.2.1.10.200.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ComponentLinkDescriptorTableEnt extends MIBEntry<TELINKSTDMIBDef>
            {
                public final ComponentLinkDescriptorEntryEnt componentLinkDescriptorEntry;

                private ComponentLinkDescriptorTableEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                {
                    super(mib, parent, "componentLinkDescriptorTable", "1.3.6.1.2.1.10.200.1.6", false, true, false, false);
                    this.componentLinkDescriptorEntry = new ComponentLinkDescriptorEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.componentLinkDescriptorEntry
                    };
                }
                public static final class ComponentLinkDescriptorEntryEnt extends MIBEntry<TELINKSTDMIBDef>
                {
                    public final ComponentLinkDescrIdEnt componentLinkDescrId;

                    public final ComponentLinkDescrSwitchingCapabilityEnt componentLinkDescrSwitchingCapability;

                    public final ComponentLinkDescrEncodingTypeEnt componentLinkDescrEncodingType;

                    public final ComponentLinkDescrMinLspBandwidthEnt componentLinkDescrMinLspBandwidth;

                    public final ComponentLinkDescrMaxLspBandwidthPrio0Ent componentLinkDescrMaxLspBandwidthPrio0;

                    public final ComponentLinkDescrMaxLspBandwidthPrio1Ent componentLinkDescrMaxLspBandwidthPrio1;

                    public final ComponentLinkDescrMaxLspBandwidthPrio2Ent componentLinkDescrMaxLspBandwidthPrio2;

                    public final ComponentLinkDescrMaxLspBandwidthPrio3Ent componentLinkDescrMaxLspBandwidthPrio3;

                    public final ComponentLinkDescrMaxLspBandwidthPrio4Ent componentLinkDescrMaxLspBandwidthPrio4;

                    public final ComponentLinkDescrMaxLspBandwidthPrio5Ent componentLinkDescrMaxLspBandwidthPrio5;

                    public final ComponentLinkDescrMaxLspBandwidthPrio6Ent componentLinkDescrMaxLspBandwidthPrio6;

                    public final ComponentLinkDescrMaxLspBandwidthPrio7Ent componentLinkDescrMaxLspBandwidthPrio7;

                    public final ComponentLinkDescrInterfaceMtuEnt componentLinkDescrInterfaceMtu;

                    public final ComponentLinkDescrIndicationEnt componentLinkDescrIndication;

                    public final ComponentLinkDescrRowStatusEnt componentLinkDescrRowStatus;

                    public final ComponentLinkDescrStorageTypeEnt componentLinkDescrStorageType;

                    private ComponentLinkDescriptorEntryEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                    {
                        super(mib, parent, "componentLinkDescriptorEntry", "1.3.6.1.2.1.10.200.1.6.1", false, false, false, true);
                        this.componentLinkDescrId = new ComponentLinkDescrIdEnt(mib, this);
                        this.componentLinkDescrSwitchingCapability = new ComponentLinkDescrSwitchingCapabilityEnt(mib, this);
                        this.componentLinkDescrEncodingType = new ComponentLinkDescrEncodingTypeEnt(mib, this);
                        this.componentLinkDescrMinLspBandwidth = new ComponentLinkDescrMinLspBandwidthEnt(mib, this);
                        this.componentLinkDescrMaxLspBandwidthPrio0 = new ComponentLinkDescrMaxLspBandwidthPrio0Ent(mib, this);
                        this.componentLinkDescrMaxLspBandwidthPrio1 = new ComponentLinkDescrMaxLspBandwidthPrio1Ent(mib, this);
                        this.componentLinkDescrMaxLspBandwidthPrio2 = new ComponentLinkDescrMaxLspBandwidthPrio2Ent(mib, this);
                        this.componentLinkDescrMaxLspBandwidthPrio3 = new ComponentLinkDescrMaxLspBandwidthPrio3Ent(mib, this);
                        this.componentLinkDescrMaxLspBandwidthPrio4 = new ComponentLinkDescrMaxLspBandwidthPrio4Ent(mib, this);
                        this.componentLinkDescrMaxLspBandwidthPrio5 = new ComponentLinkDescrMaxLspBandwidthPrio5Ent(mib, this);
                        this.componentLinkDescrMaxLspBandwidthPrio6 = new ComponentLinkDescrMaxLspBandwidthPrio6Ent(mib, this);
                        this.componentLinkDescrMaxLspBandwidthPrio7 = new ComponentLinkDescrMaxLspBandwidthPrio7Ent(mib, this);
                        this.componentLinkDescrInterfaceMtu = new ComponentLinkDescrInterfaceMtuEnt(mib, this);
                        this.componentLinkDescrIndication = new ComponentLinkDescrIndicationEnt(mib, this);
                        this.componentLinkDescrRowStatus = new ComponentLinkDescrRowStatusEnt(mib, this);
                        this.componentLinkDescrStorageType = new ComponentLinkDescrStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.componentLinkDescrId,
                            this.componentLinkDescrSwitchingCapability,
                            this.componentLinkDescrEncodingType,
                            this.componentLinkDescrMinLspBandwidth,
                            this.componentLinkDescrMaxLspBandwidthPrio0,
                            this.componentLinkDescrMaxLspBandwidthPrio1,
                            this.componentLinkDescrMaxLspBandwidthPrio2,
                            this.componentLinkDescrMaxLspBandwidthPrio3,
                            this.componentLinkDescrMaxLspBandwidthPrio4,
                            this.componentLinkDescrMaxLspBandwidthPrio5,
                            this.componentLinkDescrMaxLspBandwidthPrio6,
                            this.componentLinkDescrMaxLspBandwidthPrio7,
                            this.componentLinkDescrInterfaceMtu,
                            this.componentLinkDescrIndication,
                            this.componentLinkDescrRowStatus,
                            this.componentLinkDescrStorageType
                        };
                    }
                    public static final class ComponentLinkDescrIdEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkDescrIdEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkDescrId", "1.3.6.1.2.1.10.200.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkDescrSwitchingCapabilityEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkDescrSwitchingCapabilityEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkDescrSwitchingCapability", "1.3.6.1.2.1.10.200.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkDescrEncodingTypeEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkDescrEncodingTypeEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkDescrEncodingType", "1.3.6.1.2.1.10.200.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkDescrMinLspBandwidthEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkDescrMinLspBandwidthEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkDescrMinLspBandwidth", "1.3.6.1.2.1.10.200.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkDescrMaxLspBandwidthPrio0Ent extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkDescrMaxLspBandwidthPrio0Ent(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkDescrMaxLspBandwidthPrio0", "1.3.6.1.2.1.10.200.1.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkDescrMaxLspBandwidthPrio1Ent extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkDescrMaxLspBandwidthPrio1Ent(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkDescrMaxLspBandwidthPrio1", "1.3.6.1.2.1.10.200.1.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkDescrMaxLspBandwidthPrio2Ent extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkDescrMaxLspBandwidthPrio2Ent(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkDescrMaxLspBandwidthPrio2", "1.3.6.1.2.1.10.200.1.6.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkDescrMaxLspBandwidthPrio3Ent extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkDescrMaxLspBandwidthPrio3Ent(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkDescrMaxLspBandwidthPrio3", "1.3.6.1.2.1.10.200.1.6.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkDescrMaxLspBandwidthPrio4Ent extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkDescrMaxLspBandwidthPrio4Ent(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkDescrMaxLspBandwidthPrio4", "1.3.6.1.2.1.10.200.1.6.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkDescrMaxLspBandwidthPrio5Ent extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkDescrMaxLspBandwidthPrio5Ent(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkDescrMaxLspBandwidthPrio5", "1.3.6.1.2.1.10.200.1.6.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkDescrMaxLspBandwidthPrio6Ent extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkDescrMaxLspBandwidthPrio6Ent(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkDescrMaxLspBandwidthPrio6", "1.3.6.1.2.1.10.200.1.6.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkDescrMaxLspBandwidthPrio7Ent extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkDescrMaxLspBandwidthPrio7Ent(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkDescrMaxLspBandwidthPrio7", "1.3.6.1.2.1.10.200.1.6.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkDescrInterfaceMtuEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkDescrInterfaceMtuEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkDescrInterfaceMtu", "1.3.6.1.2.1.10.200.1.6.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkDescrIndicationEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkDescrIndicationEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkDescrIndication", "1.3.6.1.2.1.10.200.1.6.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkDescrRowStatusEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkDescrRowStatusEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkDescrRowStatus", "1.3.6.1.2.1.10.200.1.6.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkDescrStorageTypeEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkDescrStorageTypeEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkDescrStorageType", "1.3.6.1.2.1.10.200.1.6.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class ComponentLinkBandwidthTableEnt extends MIBEntry<TELINKSTDMIBDef>
            {
                public final ComponentLinkBandwidthEntryEnt componentLinkBandwidthEntry;

                private ComponentLinkBandwidthTableEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                {
                    super(mib, parent, "componentLinkBandwidthTable", "1.3.6.1.2.1.10.200.1.7", false, true, false, false);
                    this.componentLinkBandwidthEntry = new ComponentLinkBandwidthEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.componentLinkBandwidthEntry
                    };
                }
                public static final class ComponentLinkBandwidthEntryEnt extends MIBEntry<TELINKSTDMIBDef>
                {
                    public final ComponentLinkBandwidthPriorityEnt componentLinkBandwidthPriority;

                    public final ComponentLinkBandwidthUnreservedEnt componentLinkBandwidthUnreserved;

                    public final ComponentLinkBandwidthRowStatusEnt componentLinkBandwidthRowStatus;

                    public final ComponentLinkBandwidthStorageTypeEnt componentLinkBandwidthStorageType;

                    private ComponentLinkBandwidthEntryEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                    {
                        super(mib, parent, "componentLinkBandwidthEntry", "1.3.6.1.2.1.10.200.1.7.1", false, false, false, true);
                        this.componentLinkBandwidthPriority = new ComponentLinkBandwidthPriorityEnt(mib, this);
                        this.componentLinkBandwidthUnreserved = new ComponentLinkBandwidthUnreservedEnt(mib, this);
                        this.componentLinkBandwidthRowStatus = new ComponentLinkBandwidthRowStatusEnt(mib, this);
                        this.componentLinkBandwidthStorageType = new ComponentLinkBandwidthStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.componentLinkBandwidthPriority,
                            this.componentLinkBandwidthUnreserved,
                            this.componentLinkBandwidthRowStatus,
                            this.componentLinkBandwidthStorageType
                        };
                    }
                    public static final class ComponentLinkBandwidthPriorityEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkBandwidthPriorityEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkBandwidthPriority", "1.3.6.1.2.1.10.200.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkBandwidthUnreservedEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkBandwidthUnreservedEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkBandwidthUnreserved", "1.3.6.1.2.1.10.200.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkBandwidthRowStatusEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkBandwidthRowStatusEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkBandwidthRowStatus", "1.3.6.1.2.1.10.200.1.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class ComponentLinkBandwidthStorageTypeEnt extends MIBEntry<TELINKSTDMIBDef>
                    {
                        private ComponentLinkBandwidthStorageTypeEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                        {
                            super(mib, parent, "componentLinkBandwidthStorageType", "1.3.6.1.2.1.10.200.1.7.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class TeLinkConformanceEnt extends MIBEntry<TELINKSTDMIBDef>
        {
            /** End of componentLinkBandwidthTable

Module compliance*/
            public final TeLinkCompliancesEnt teLinkCompliances;

            public final TeLinkGroupsEnt teLinkGroups;

            private TeLinkConformanceEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
            {
                super(mib, parent, "teLinkConformance", "1.3.6.1.2.1.10.200.2", false, false, false, false);
                this.teLinkCompliances = new TeLinkCompliancesEnt(mib, this);
                this.teLinkGroups = new TeLinkGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.teLinkCompliances,
                    this.teLinkGroups
                };
            }
            public static final class TeLinkCompliancesEnt extends MIBEntry<TELINKSTDMIBDef>
            {
                public final TeLinkModuleFullComplianceEnt teLinkModuleFullCompliance;

                public final TeLinkModuleReadOnlyComplianceEnt teLinkModuleReadOnlyCompliance;

                private TeLinkCompliancesEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                {
                    super(mib, parent, "teLinkCompliances", "1.3.6.1.2.1.10.200.2.1", false, false, false, false);
                    this.teLinkModuleFullCompliance = new TeLinkModuleFullComplianceEnt(mib, this);
                    this.teLinkModuleReadOnlyCompliance = new TeLinkModuleReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.teLinkModuleFullCompliance,
                        this.teLinkModuleReadOnlyCompliance
                    };
                }
                public static final class TeLinkModuleFullComplianceEnt extends MIBEntry<TELINKSTDMIBDef>
                {
                    private TeLinkModuleFullComplianceEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                    {
                        super(mib, parent, "teLinkModuleFullCompliance", "1.3.6.1.2.1.10.200.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TeLinkModuleReadOnlyComplianceEnt extends MIBEntry<TELINKSTDMIBDef>
                {
                    private TeLinkModuleReadOnlyComplianceEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                    {
                        super(mib, parent, "teLinkModuleReadOnlyCompliance", "1.3.6.1.2.1.10.200.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class TeLinkGroupsEnt extends MIBEntry<TELINKSTDMIBDef>
            {
                /** Units of conformance*/
                public final TeLinkGroupEnt teLinkGroup;

                public final TeLinkSrlgGroupEnt teLinkSrlgGroup;

                public final TeLinkBandwidthGroupEnt teLinkBandwidthGroup;

                public final ComponentLinkBandwidthGroupEnt componentLinkBandwidthGroup;

                public final TeLinkPscGroupEnt teLinkPscGroup;

                public final TeLinkTdmGroupEnt teLinkTdmGroup;

                private TeLinkGroupsEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                {
                    super(mib, parent, "teLinkGroups", "1.3.6.1.2.1.10.200.2.2", false, false, false, false);
                    this.teLinkGroup = new TeLinkGroupEnt(mib, this);
                    this.teLinkSrlgGroup = new TeLinkSrlgGroupEnt(mib, this);
                    this.teLinkBandwidthGroup = new TeLinkBandwidthGroupEnt(mib, this);
                    this.componentLinkBandwidthGroup = new ComponentLinkBandwidthGroupEnt(mib, this);
                    this.teLinkPscGroup = new TeLinkPscGroupEnt(mib, this);
                    this.teLinkTdmGroup = new TeLinkTdmGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.teLinkGroup,
                        this.teLinkSrlgGroup,
                        this.teLinkBandwidthGroup,
                        this.componentLinkBandwidthGroup,
                        this.teLinkPscGroup,
                        this.teLinkTdmGroup
                    };
                }
                public static final class TeLinkGroupEnt extends MIBEntry<TELINKSTDMIBDef>
                {
                    private TeLinkGroupEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                    {
                        super(mib, parent, "teLinkGroup", "1.3.6.1.2.1.10.200.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TeLinkSrlgGroupEnt extends MIBEntry<TELINKSTDMIBDef>
                {
                    private TeLinkSrlgGroupEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                    {
                        super(mib, parent, "teLinkSrlgGroup", "1.3.6.1.2.1.10.200.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TeLinkBandwidthGroupEnt extends MIBEntry<TELINKSTDMIBDef>
                {
                    private TeLinkBandwidthGroupEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                    {
                        super(mib, parent, "teLinkBandwidthGroup", "1.3.6.1.2.1.10.200.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ComponentLinkBandwidthGroupEnt extends MIBEntry<TELINKSTDMIBDef>
                {
                    private ComponentLinkBandwidthGroupEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                    {
                        super(mib, parent, "componentLinkBandwidthGroup", "1.3.6.1.2.1.10.200.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TeLinkPscGroupEnt extends MIBEntry<TELINKSTDMIBDef>
                {
                    private TeLinkPscGroupEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                    {
                        super(mib, parent, "teLinkPscGroup", "1.3.6.1.2.1.10.200.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TeLinkTdmGroupEnt extends MIBEntry<TELINKSTDMIBDef>
                {
                    private TeLinkTdmGroupEnt(TELINKSTDMIBDef mib, MIBEntry<TELINKSTDMIBDef> parent)
                    {
                        super(mib, parent, "teLinkTdmGroup", "1.3.6.1.2.1.10.200.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
