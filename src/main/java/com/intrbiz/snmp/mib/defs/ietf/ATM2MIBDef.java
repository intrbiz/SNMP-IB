package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class ATM2MIBDef extends MIB
{
    public static final ATM2MIBDef ATM2MIB = new ATM2MIBDef();

    public final Atm2MIBEnt atm2MIB;

    private ATM2MIBDef()
    {
        super("ATM2-MIB");
        this.atm2MIB = new Atm2MIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.atm2MIB
        };
    }

    public static final class Atm2MIBEnt extends MIBEntry<ATM2MIBDef>
    {
        public final Atm2MIBObjectsEnt atm2MIBObjects;

        public final Atm2MIBTrapsEnt atm2MIBTraps;

        /** Conformance Information*/
        public final Atm2MIBConformanceEnt atm2MIBConformance;

        private Atm2MIBEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
        {
            super(mib, parent, "atm2MIB", "1.3.6.1.2.1.37.1.14", false, false, false, false);
            this.atm2MIBObjects = new Atm2MIBObjectsEnt(mib, this);
            this.atm2MIBTraps = new Atm2MIBTrapsEnt(mib, this);
            this.atm2MIBConformance = new Atm2MIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.atm2MIBObjects,
                this.atm2MIBTraps,
                this.atm2MIBConformance
            };
        }
        public static final class Atm2MIBObjectsEnt extends MIBEntry<ATM2MIBDef>
        {
            /** This ATM2-MIB Module consists of the following tables,plus ATM trap support:1. atmSvcVpCrossConnectTable2. atmSvcVcCrossConnectTable3. atmSigStatTable4. atmSigSupportTable5. atmSigDescrParamTable6. atmIfRegisteredAddrTable7. atmVclAddrTable8. atmAddrVclTable9. atmVplStatTable10. atmVplLogicalPortTable11. atmVclStatTable12. atmAal5VclStatTable13. atmVclGenTable14. atmInterfaceExtTable15. atmIlmiSrvcRegTable16. atmIlmiNetworkPrefixTable17. atmSwitchAddressTable18. atmVpCrossConnectXTable19. atmVcCrossConnectXTable20. atmCurrentlyFailingPVplTable21. atmCurrentlyFailingPVclTable
1. ATM VPL SVC Cross-Connect Table*/
            public final AtmSvcVpCrossConnectTableEnt atmSvcVpCrossConnectTable;

            /** 2. ATM VCL SVC Cross-Connect Table*/
            public final AtmSvcVcCrossConnectTableEnt atmSvcVcCrossConnectTable;

            /** 3. ATM Interface Signalling Statistics Table --*/
            public final AtmSigStatTableEnt atmSigStatTable;

            /** 4. ATM Interface Signalling Support TableThis table provides information to supportthe signalling process which is used to establishATM Switched Virtual Connections (SVCs).*/
            public final AtmSigSupportTableEnt atmSigSupportTable;

            /** 5. ATM Signalling Descriptor Parameter Table*/
            public final AtmSigDescrParamTableEnt atmSigDescrParamTable;

            /** 6. ATM Interface Registered Address Table --*/
            public final AtmIfRegisteredAddrTableEnt atmIfRegisteredAddrTable;

            /** 7. ATM VPI/VCI to Address Mapping Table*/
            public final AtmVclAddrTableEnt atmVclAddrTable;

            /** 8. ATM Address to VPI/VCI Mapping TableThis table provides an alternative way to accessa row in the atmVclAddrTable by usingan ATM address as an index, instead ofthe ifIndex*/
            public final AtmAddrVclTableEnt atmAddrVclTable;

            /** 9. ATM VPL Statistics Table*/
            public final AtmVplStatTableEnt atmVplStatTable;

            /** 10. ATM Logical Port Configuration Table*/
            public final AtmVplLogicalPortTableEnt atmVplLogicalPortTable;

            /** 11. ATM VCL Statistics Table*/
            public final AtmVclStatTableEnt atmVclStatTable;

            /** 12. ATM AAL5 per-VCC Statistics Table*/
            public final AtmAal5VclStatTableEnt atmAal5VclStatTable;

            /** 13. ATM VC General Information Table*/
            public final AtmVclGenTableEnt atmVclGenTable;

            /** 14. ATM Interface Configuration Extension Table*/
            public final AtmInterfaceExtTableEnt atmInterfaceExtTable;

            /** 15. ATM ILMI Service Registry Table*/
            public final AtmIlmiSrvcRegTableEnt atmIlmiSrvcRegTable;

            /** 16. ILMI Network Prefix Table*/
            public final AtmIlmiNetworkPrefixTableEnt atmIlmiNetworkPrefixTable;

            /** 17. ATM Switch Address Table*/
            public final AtmSwitchAddressTableEnt atmSwitchAddressTable;

            /** 18. ATM VP Cross-Connect Extension Table*/
            public final AtmVpCrossConnectXTableEnt atmVpCrossConnectXTable;

            /** 19. ATM VC Cross-Connect Extension Table*/
            public final AtmVcCrossConnectXTableEnt atmVcCrossConnectXTable;

            /** 20. Currently Failing PVPL Table*/
            public final AtmCurrentlyFailingPVplTableEnt atmCurrentlyFailingPVplTable;

            /** 21. Currently Failing PVCL Table*/
            public final AtmCurrentlyFailingPVclTableEnt atmCurrentlyFailingPVclTable;

            private Atm2MIBObjectsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
            {
                super(mib, parent, "atm2MIBObjects", "1.3.6.1.2.1.37.1.14.1", false, false, false, false);
                this.atmSvcVpCrossConnectTable = new AtmSvcVpCrossConnectTableEnt(mib, this);
                this.atmSvcVcCrossConnectTable = new AtmSvcVcCrossConnectTableEnt(mib, this);
                this.atmSigStatTable = new AtmSigStatTableEnt(mib, this);
                this.atmSigSupportTable = new AtmSigSupportTableEnt(mib, this);
                this.atmSigDescrParamTable = new AtmSigDescrParamTableEnt(mib, this);
                this.atmIfRegisteredAddrTable = new AtmIfRegisteredAddrTableEnt(mib, this);
                this.atmVclAddrTable = new AtmVclAddrTableEnt(mib, this);
                this.atmAddrVclTable = new AtmAddrVclTableEnt(mib, this);
                this.atmVplStatTable = new AtmVplStatTableEnt(mib, this);
                this.atmVplLogicalPortTable = new AtmVplLogicalPortTableEnt(mib, this);
                this.atmVclStatTable = new AtmVclStatTableEnt(mib, this);
                this.atmAal5VclStatTable = new AtmAal5VclStatTableEnt(mib, this);
                this.atmVclGenTable = new AtmVclGenTableEnt(mib, this);
                this.atmInterfaceExtTable = new AtmInterfaceExtTableEnt(mib, this);
                this.atmIlmiSrvcRegTable = new AtmIlmiSrvcRegTableEnt(mib, this);
                this.atmIlmiNetworkPrefixTable = new AtmIlmiNetworkPrefixTableEnt(mib, this);
                this.atmSwitchAddressTable = new AtmSwitchAddressTableEnt(mib, this);
                this.atmVpCrossConnectXTable = new AtmVpCrossConnectXTableEnt(mib, this);
                this.atmVcCrossConnectXTable = new AtmVcCrossConnectXTableEnt(mib, this);
                this.atmCurrentlyFailingPVplTable = new AtmCurrentlyFailingPVplTableEnt(mib, this);
                this.atmCurrentlyFailingPVclTable = new AtmCurrentlyFailingPVclTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.atmSvcVpCrossConnectTable,
                    this.atmSvcVcCrossConnectTable,
                    this.atmSigStatTable,
                    this.atmSigSupportTable,
                    this.atmSigDescrParamTable,
                    this.atmIfRegisteredAddrTable,
                    this.atmVclAddrTable,
                    this.atmAddrVclTable,
                    this.atmVplStatTable,
                    this.atmVplLogicalPortTable,
                    this.atmVclStatTable,
                    this.atmAal5VclStatTable,
                    this.atmVclGenTable,
                    this.atmInterfaceExtTable,
                    this.atmIlmiSrvcRegTable,
                    this.atmIlmiNetworkPrefixTable,
                    this.atmSwitchAddressTable,
                    this.atmVpCrossConnectXTable,
                    this.atmVcCrossConnectXTable,
                    this.atmCurrentlyFailingPVplTable,
                    this.atmCurrentlyFailingPVclTable
                };
            }
            public static final class AtmSvcVpCrossConnectTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmSvcVpCrossConnectEntryEnt atmSvcVpCrossConnectEntry;

                private AtmSvcVpCrossConnectTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmSvcVpCrossConnectTable", "1.3.6.1.2.1.37.1.14.1.1", false, true, false, false);
                    this.atmSvcVpCrossConnectEntry = new AtmSvcVpCrossConnectEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmSvcVpCrossConnectEntry
                    };
                }
                public static final class AtmSvcVpCrossConnectEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmSvcVpCrossConnectIndexEnt atmSvcVpCrossConnectIndex;

                    public final AtmSvcVpCrossConnectLowIfIndexEnt atmSvcVpCrossConnectLowIfIndex;

                    public final AtmSvcVpCrossConnectLowVpiEnt atmSvcVpCrossConnectLowVpi;

                    public final AtmSvcVpCrossConnectHighIfIndexEnt atmSvcVpCrossConnectHighIfIndex;

                    public final AtmSvcVpCrossConnectHighVpiEnt atmSvcVpCrossConnectHighVpi;

                    public final AtmSvcVpCrossConnectCreationTimeEnt atmSvcVpCrossConnectCreationTime;

                    public final AtmSvcVpCrossConnectRowStatusEnt atmSvcVpCrossConnectRowStatus;

                    private AtmSvcVpCrossConnectEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmSvcVpCrossConnectEntry", "1.3.6.1.2.1.37.1.14.1.1.1", false, false, false, true);
                        this.atmSvcVpCrossConnectIndex = new AtmSvcVpCrossConnectIndexEnt(mib, this);
                        this.atmSvcVpCrossConnectLowIfIndex = new AtmSvcVpCrossConnectLowIfIndexEnt(mib, this);
                        this.atmSvcVpCrossConnectLowVpi = new AtmSvcVpCrossConnectLowVpiEnt(mib, this);
                        this.atmSvcVpCrossConnectHighIfIndex = new AtmSvcVpCrossConnectHighIfIndexEnt(mib, this);
                        this.atmSvcVpCrossConnectHighVpi = new AtmSvcVpCrossConnectHighVpiEnt(mib, this);
                        this.atmSvcVpCrossConnectCreationTime = new AtmSvcVpCrossConnectCreationTimeEnt(mib, this);
                        this.atmSvcVpCrossConnectRowStatus = new AtmSvcVpCrossConnectRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmSvcVpCrossConnectIndex,
                            this.atmSvcVpCrossConnectLowIfIndex,
                            this.atmSvcVpCrossConnectLowVpi,
                            this.atmSvcVpCrossConnectHighIfIndex,
                            this.atmSvcVpCrossConnectHighVpi,
                            this.atmSvcVpCrossConnectCreationTime,
                            this.atmSvcVpCrossConnectRowStatus
                        };
                    }
                    public static final class AtmSvcVpCrossConnectIndexEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSvcVpCrossConnectIndexEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSvcVpCrossConnectIndex", "1.3.6.1.2.1.37.1.14.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSvcVpCrossConnectLowIfIndexEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSvcVpCrossConnectLowIfIndexEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSvcVpCrossConnectLowIfIndex", "1.3.6.1.2.1.37.1.14.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSvcVpCrossConnectLowVpiEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSvcVpCrossConnectLowVpiEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSvcVpCrossConnectLowVpi", "1.3.6.1.2.1.37.1.14.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSvcVpCrossConnectHighIfIndexEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSvcVpCrossConnectHighIfIndexEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSvcVpCrossConnectHighIfIndex", "1.3.6.1.2.1.37.1.14.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSvcVpCrossConnectHighVpiEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSvcVpCrossConnectHighVpiEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSvcVpCrossConnectHighVpi", "1.3.6.1.2.1.37.1.14.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSvcVpCrossConnectCreationTimeEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSvcVpCrossConnectCreationTimeEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSvcVpCrossConnectCreationTime", "1.3.6.1.2.1.37.1.14.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSvcVpCrossConnectRowStatusEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSvcVpCrossConnectRowStatusEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSvcVpCrossConnectRowStatus", "1.3.6.1.2.1.37.1.14.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmSvcVcCrossConnectTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmSvcVcCrossConnectEntryEnt atmSvcVcCrossConnectEntry;

                private AtmSvcVcCrossConnectTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmSvcVcCrossConnectTable", "1.3.6.1.2.1.37.1.14.1.2", false, true, false, false);
                    this.atmSvcVcCrossConnectEntry = new AtmSvcVcCrossConnectEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmSvcVcCrossConnectEntry
                    };
                }
                public static final class AtmSvcVcCrossConnectEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmSvcVcCrossConnectIndexEnt atmSvcVcCrossConnectIndex;

                    public final AtmSvcVcCrossConnectLowIfIndexEnt atmSvcVcCrossConnectLowIfIndex;

                    public final AtmSvcVcCrossConnectLowVpiEnt atmSvcVcCrossConnectLowVpi;

                    public final AtmSvcVcCrossConnectLowVciEnt atmSvcVcCrossConnectLowVci;

                    public final AtmSvcVcCrossConnectHighIfIndexEnt atmSvcVcCrossConnectHighIfIndex;

                    public final AtmSvcVcCrossConnectHighVpiEnt atmSvcVcCrossConnectHighVpi;

                    public final AtmSvcVcCrossConnectHighVciEnt atmSvcVcCrossConnectHighVci;

                    public final AtmSvcVcCrossConnectCreationTimeEnt atmSvcVcCrossConnectCreationTime;

                    public final AtmSvcVcCrossConnectRowStatusEnt atmSvcVcCrossConnectRowStatus;

                    private AtmSvcVcCrossConnectEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmSvcVcCrossConnectEntry", "1.3.6.1.2.1.37.1.14.1.2.1", false, false, false, true);
                        this.atmSvcVcCrossConnectIndex = new AtmSvcVcCrossConnectIndexEnt(mib, this);
                        this.atmSvcVcCrossConnectLowIfIndex = new AtmSvcVcCrossConnectLowIfIndexEnt(mib, this);
                        this.atmSvcVcCrossConnectLowVpi = new AtmSvcVcCrossConnectLowVpiEnt(mib, this);
                        this.atmSvcVcCrossConnectLowVci = new AtmSvcVcCrossConnectLowVciEnt(mib, this);
                        this.atmSvcVcCrossConnectHighIfIndex = new AtmSvcVcCrossConnectHighIfIndexEnt(mib, this);
                        this.atmSvcVcCrossConnectHighVpi = new AtmSvcVcCrossConnectHighVpiEnt(mib, this);
                        this.atmSvcVcCrossConnectHighVci = new AtmSvcVcCrossConnectHighVciEnt(mib, this);
                        this.atmSvcVcCrossConnectCreationTime = new AtmSvcVcCrossConnectCreationTimeEnt(mib, this);
                        this.atmSvcVcCrossConnectRowStatus = new AtmSvcVcCrossConnectRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmSvcVcCrossConnectIndex,
                            this.atmSvcVcCrossConnectLowIfIndex,
                            this.atmSvcVcCrossConnectLowVpi,
                            this.atmSvcVcCrossConnectLowVci,
                            this.atmSvcVcCrossConnectHighIfIndex,
                            this.atmSvcVcCrossConnectHighVpi,
                            this.atmSvcVcCrossConnectHighVci,
                            this.atmSvcVcCrossConnectCreationTime,
                            this.atmSvcVcCrossConnectRowStatus
                        };
                    }
                    public static final class AtmSvcVcCrossConnectIndexEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSvcVcCrossConnectIndexEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSvcVcCrossConnectIndex", "1.3.6.1.2.1.37.1.14.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSvcVcCrossConnectLowIfIndexEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSvcVcCrossConnectLowIfIndexEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSvcVcCrossConnectLowIfIndex", "1.3.6.1.2.1.37.1.14.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSvcVcCrossConnectLowVpiEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSvcVcCrossConnectLowVpiEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSvcVcCrossConnectLowVpi", "1.3.6.1.2.1.37.1.14.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSvcVcCrossConnectLowVciEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSvcVcCrossConnectLowVciEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSvcVcCrossConnectLowVci", "1.3.6.1.2.1.37.1.14.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSvcVcCrossConnectHighIfIndexEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSvcVcCrossConnectHighIfIndexEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSvcVcCrossConnectHighIfIndex", "1.3.6.1.2.1.37.1.14.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSvcVcCrossConnectHighVpiEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSvcVcCrossConnectHighVpiEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSvcVcCrossConnectHighVpi", "1.3.6.1.2.1.37.1.14.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSvcVcCrossConnectHighVciEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSvcVcCrossConnectHighVciEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSvcVcCrossConnectHighVci", "1.3.6.1.2.1.37.1.14.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSvcVcCrossConnectCreationTimeEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSvcVcCrossConnectCreationTimeEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSvcVcCrossConnectCreationTime", "1.3.6.1.2.1.37.1.14.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSvcVcCrossConnectRowStatusEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSvcVcCrossConnectRowStatusEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSvcVcCrossConnectRowStatus", "1.3.6.1.2.1.37.1.14.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmSigStatTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmSigStatEntryEnt atmSigStatEntry;

                private AtmSigStatTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmSigStatTable", "1.3.6.1.2.1.37.1.14.1.3", false, true, false, false);
                    this.atmSigStatEntry = new AtmSigStatEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmSigStatEntry
                    };
                }
                public static final class AtmSigStatEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmSigSSCOPConEventsEnt atmSigSSCOPConEvents;

                    public final AtmSigSSCOPErrdPdusEnt atmSigSSCOPErrdPdus;

                    public final AtmSigDetectSetupAttemptsEnt atmSigDetectSetupAttempts;

                    public final AtmSigEmitSetupAttemptsEnt atmSigEmitSetupAttempts;

                    public final AtmSigDetectUnavailRoutesEnt atmSigDetectUnavailRoutes;

                    public final AtmSigEmitUnavailRoutesEnt atmSigEmitUnavailRoutes;

                    public final AtmSigDetectUnavailResrcsEnt atmSigDetectUnavailResrcs;

                    public final AtmSigEmitUnavailResrcsEnt atmSigEmitUnavailResrcs;

                    public final AtmSigDetectCldPtyEventsEnt atmSigDetectCldPtyEvents;

                    public final AtmSigEmitCldPtyEventsEnt atmSigEmitCldPtyEvents;

                    public final AtmSigDetectMsgErrorsEnt atmSigDetectMsgErrors;

                    public final AtmSigEmitMsgErrorsEnt atmSigEmitMsgErrors;

                    public final AtmSigDetectClgPtyEventsEnt atmSigDetectClgPtyEvents;

                    public final AtmSigEmitClgPtyEventsEnt atmSigEmitClgPtyEvents;

                    public final AtmSigDetectTimerExpiredsEnt atmSigDetectTimerExpireds;

                    public final AtmSigEmitTimerExpiredsEnt atmSigEmitTimerExpireds;

                    public final AtmSigDetectRestartsEnt atmSigDetectRestarts;

                    public final AtmSigEmitRestartsEnt atmSigEmitRestarts;

                    public final AtmSigInEstablsEnt atmSigInEstabls;

                    public final AtmSigOutEstablsEnt atmSigOutEstabls;

                    private AtmSigStatEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmSigStatEntry", "1.3.6.1.2.1.37.1.14.1.3.1", false, false, false, true);
                        this.atmSigSSCOPConEvents = new AtmSigSSCOPConEventsEnt(mib, this);
                        this.atmSigSSCOPErrdPdus = new AtmSigSSCOPErrdPdusEnt(mib, this);
                        this.atmSigDetectSetupAttempts = new AtmSigDetectSetupAttemptsEnt(mib, this);
                        this.atmSigEmitSetupAttempts = new AtmSigEmitSetupAttemptsEnt(mib, this);
                        this.atmSigDetectUnavailRoutes = new AtmSigDetectUnavailRoutesEnt(mib, this);
                        this.atmSigEmitUnavailRoutes = new AtmSigEmitUnavailRoutesEnt(mib, this);
                        this.atmSigDetectUnavailResrcs = new AtmSigDetectUnavailResrcsEnt(mib, this);
                        this.atmSigEmitUnavailResrcs = new AtmSigEmitUnavailResrcsEnt(mib, this);
                        this.atmSigDetectCldPtyEvents = new AtmSigDetectCldPtyEventsEnt(mib, this);
                        this.atmSigEmitCldPtyEvents = new AtmSigEmitCldPtyEventsEnt(mib, this);
                        this.atmSigDetectMsgErrors = new AtmSigDetectMsgErrorsEnt(mib, this);
                        this.atmSigEmitMsgErrors = new AtmSigEmitMsgErrorsEnt(mib, this);
                        this.atmSigDetectClgPtyEvents = new AtmSigDetectClgPtyEventsEnt(mib, this);
                        this.atmSigEmitClgPtyEvents = new AtmSigEmitClgPtyEventsEnt(mib, this);
                        this.atmSigDetectTimerExpireds = new AtmSigDetectTimerExpiredsEnt(mib, this);
                        this.atmSigEmitTimerExpireds = new AtmSigEmitTimerExpiredsEnt(mib, this);
                        this.atmSigDetectRestarts = new AtmSigDetectRestartsEnt(mib, this);
                        this.atmSigEmitRestarts = new AtmSigEmitRestartsEnt(mib, this);
                        this.atmSigInEstabls = new AtmSigInEstablsEnt(mib, this);
                        this.atmSigOutEstabls = new AtmSigOutEstablsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmSigSSCOPConEvents,
                            this.atmSigSSCOPErrdPdus,
                            this.atmSigDetectSetupAttempts,
                            this.atmSigEmitSetupAttempts,
                            this.atmSigDetectUnavailRoutes,
                            this.atmSigEmitUnavailRoutes,
                            this.atmSigDetectUnavailResrcs,
                            this.atmSigEmitUnavailResrcs,
                            this.atmSigDetectCldPtyEvents,
                            this.atmSigEmitCldPtyEvents,
                            this.atmSigDetectMsgErrors,
                            this.atmSigEmitMsgErrors,
                            this.atmSigDetectClgPtyEvents,
                            this.atmSigEmitClgPtyEvents,
                            this.atmSigDetectTimerExpireds,
                            this.atmSigEmitTimerExpireds,
                            this.atmSigDetectRestarts,
                            this.atmSigEmitRestarts,
                            this.atmSigInEstabls,
                            this.atmSigOutEstabls
                        };
                    }
                    public static final class AtmSigSSCOPConEventsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigSSCOPConEventsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigSSCOPConEvents", "1.3.6.1.2.1.37.1.14.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigSSCOPErrdPdusEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigSSCOPErrdPdusEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigSSCOPErrdPdus", "1.3.6.1.2.1.37.1.14.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDetectSetupAttemptsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDetectSetupAttemptsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDetectSetupAttempts", "1.3.6.1.2.1.37.1.14.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigEmitSetupAttemptsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigEmitSetupAttemptsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigEmitSetupAttempts", "1.3.6.1.2.1.37.1.14.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDetectUnavailRoutesEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDetectUnavailRoutesEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDetectUnavailRoutes", "1.3.6.1.2.1.37.1.14.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigEmitUnavailRoutesEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigEmitUnavailRoutesEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigEmitUnavailRoutes", "1.3.6.1.2.1.37.1.14.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDetectUnavailResrcsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDetectUnavailResrcsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDetectUnavailResrcs", "1.3.6.1.2.1.37.1.14.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigEmitUnavailResrcsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigEmitUnavailResrcsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigEmitUnavailResrcs", "1.3.6.1.2.1.37.1.14.1.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDetectCldPtyEventsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDetectCldPtyEventsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDetectCldPtyEvents", "1.3.6.1.2.1.37.1.14.1.3.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigEmitCldPtyEventsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigEmitCldPtyEventsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigEmitCldPtyEvents", "1.3.6.1.2.1.37.1.14.1.3.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDetectMsgErrorsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDetectMsgErrorsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDetectMsgErrors", "1.3.6.1.2.1.37.1.14.1.3.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigEmitMsgErrorsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigEmitMsgErrorsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigEmitMsgErrors", "1.3.6.1.2.1.37.1.14.1.3.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDetectClgPtyEventsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDetectClgPtyEventsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDetectClgPtyEvents", "1.3.6.1.2.1.37.1.14.1.3.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigEmitClgPtyEventsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigEmitClgPtyEventsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigEmitClgPtyEvents", "1.3.6.1.2.1.37.1.14.1.3.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDetectTimerExpiredsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDetectTimerExpiredsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDetectTimerExpireds", "1.3.6.1.2.1.37.1.14.1.3.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigEmitTimerExpiredsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigEmitTimerExpiredsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigEmitTimerExpireds", "1.3.6.1.2.1.37.1.14.1.3.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDetectRestartsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDetectRestartsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDetectRestarts", "1.3.6.1.2.1.37.1.14.1.3.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigEmitRestartsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigEmitRestartsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigEmitRestarts", "1.3.6.1.2.1.37.1.14.1.3.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigInEstablsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigInEstablsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigInEstabls", "1.3.6.1.2.1.37.1.14.1.3.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigOutEstablsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigOutEstablsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigOutEstabls", "1.3.6.1.2.1.37.1.14.1.3.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmSigSupportTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmSigSupportEntryEnt atmSigSupportEntry;

                private AtmSigSupportTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmSigSupportTable", "1.3.6.1.2.1.37.1.14.1.4", false, true, false, false);
                    this.atmSigSupportEntry = new AtmSigSupportEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmSigSupportEntry
                    };
                }
                public static final class AtmSigSupportEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmSigSupportClgPtyNumDelEnt atmSigSupportClgPtyNumDel;

                    public final AtmSigSupportClgPtySubAddrEnt atmSigSupportClgPtySubAddr;

                    public final AtmSigSupportCldPtySubAddrEnt atmSigSupportCldPtySubAddr;

                    public final AtmSigSupportHiLyrInfoEnt atmSigSupportHiLyrInfo;

                    public final AtmSigSupportLoLyrInfoEnt atmSigSupportLoLyrInfo;

                    public final AtmSigSupportBlliRepeatIndEnt atmSigSupportBlliRepeatInd;

                    public final AtmSigSupportAALInfoEnt atmSigSupportAALInfo;

                    public final AtmSigSupportPrefCarrierEnt atmSigSupportPrefCarrier;

                    private AtmSigSupportEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmSigSupportEntry", "1.3.6.1.2.1.37.1.14.1.4.1", false, false, false, true);
                        this.atmSigSupportClgPtyNumDel = new AtmSigSupportClgPtyNumDelEnt(mib, this);
                        this.atmSigSupportClgPtySubAddr = new AtmSigSupportClgPtySubAddrEnt(mib, this);
                        this.atmSigSupportCldPtySubAddr = new AtmSigSupportCldPtySubAddrEnt(mib, this);
                        this.atmSigSupportHiLyrInfo = new AtmSigSupportHiLyrInfoEnt(mib, this);
                        this.atmSigSupportLoLyrInfo = new AtmSigSupportLoLyrInfoEnt(mib, this);
                        this.atmSigSupportBlliRepeatInd = new AtmSigSupportBlliRepeatIndEnt(mib, this);
                        this.atmSigSupportAALInfo = new AtmSigSupportAALInfoEnt(mib, this);
                        this.atmSigSupportPrefCarrier = new AtmSigSupportPrefCarrierEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmSigSupportClgPtyNumDel,
                            this.atmSigSupportClgPtySubAddr,
                            this.atmSigSupportCldPtySubAddr,
                            this.atmSigSupportHiLyrInfo,
                            this.atmSigSupportLoLyrInfo,
                            this.atmSigSupportBlliRepeatInd,
                            this.atmSigSupportAALInfo,
                            this.atmSigSupportPrefCarrier
                        };
                    }
                    public static final class AtmSigSupportClgPtyNumDelEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigSupportClgPtyNumDelEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigSupportClgPtyNumDel", "1.3.6.1.2.1.37.1.14.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigSupportClgPtySubAddrEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigSupportClgPtySubAddrEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigSupportClgPtySubAddr", "1.3.6.1.2.1.37.1.14.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigSupportCldPtySubAddrEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigSupportCldPtySubAddrEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigSupportCldPtySubAddr", "1.3.6.1.2.1.37.1.14.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigSupportHiLyrInfoEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigSupportHiLyrInfoEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigSupportHiLyrInfo", "1.3.6.1.2.1.37.1.14.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigSupportLoLyrInfoEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigSupportLoLyrInfoEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigSupportLoLyrInfo", "1.3.6.1.2.1.37.1.14.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigSupportBlliRepeatIndEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigSupportBlliRepeatIndEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigSupportBlliRepeatInd", "1.3.6.1.2.1.37.1.14.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigSupportAALInfoEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigSupportAALInfoEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigSupportAALInfo", "1.3.6.1.2.1.37.1.14.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigSupportPrefCarrierEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigSupportPrefCarrierEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigSupportPrefCarrier", "1.3.6.1.2.1.37.1.14.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmSigDescrParamTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmSigDescrParamEntryEnt atmSigDescrParamEntry;

                private AtmSigDescrParamTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmSigDescrParamTable", "1.3.6.1.2.1.37.1.14.1.5", false, true, false, false);
                    this.atmSigDescrParamEntry = new AtmSigDescrParamEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmSigDescrParamEntry
                    };
                }
                public static final class AtmSigDescrParamEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmSigDescrParamIndexEnt atmSigDescrParamIndex;

                    public final AtmSigDescrParamAalTypeEnt atmSigDescrParamAalType;

                    public final AtmSigDescrParamAalSscsTypeEnt atmSigDescrParamAalSscsType;

                    public final AtmSigDescrParamBhliTypeEnt atmSigDescrParamBhliType;

                    public final AtmSigDescrParamBhliInfoEnt atmSigDescrParamBhliInfo;

                    public final AtmSigDescrParamBbcConnConfEnt atmSigDescrParamBbcConnConf;

                    public final AtmSigDescrParamBlliLayer2Ent atmSigDescrParamBlliLayer2;

                    public final AtmSigDescrParamBlliLayer3Ent atmSigDescrParamBlliLayer3;

                    public final AtmSigDescrParamBlliPktSizeEnt atmSigDescrParamBlliPktSize;

                    public final AtmSigDescrParamBlliSnapIdEnt atmSigDescrParamBlliSnapId;

                    public final AtmSigDescrParamBlliOuiPidEnt atmSigDescrParamBlliOuiPid;

                    public final AtmSigDescrParamRowStatusEnt atmSigDescrParamRowStatus;

                    private AtmSigDescrParamEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmSigDescrParamEntry", "1.3.6.1.2.1.37.1.14.1.5.1", false, false, false, true);
                        this.atmSigDescrParamIndex = new AtmSigDescrParamIndexEnt(mib, this);
                        this.atmSigDescrParamAalType = new AtmSigDescrParamAalTypeEnt(mib, this);
                        this.atmSigDescrParamAalSscsType = new AtmSigDescrParamAalSscsTypeEnt(mib, this);
                        this.atmSigDescrParamBhliType = new AtmSigDescrParamBhliTypeEnt(mib, this);
                        this.atmSigDescrParamBhliInfo = new AtmSigDescrParamBhliInfoEnt(mib, this);
                        this.atmSigDescrParamBbcConnConf = new AtmSigDescrParamBbcConnConfEnt(mib, this);
                        this.atmSigDescrParamBlliLayer2 = new AtmSigDescrParamBlliLayer2Ent(mib, this);
                        this.atmSigDescrParamBlliLayer3 = new AtmSigDescrParamBlliLayer3Ent(mib, this);
                        this.atmSigDescrParamBlliPktSize = new AtmSigDescrParamBlliPktSizeEnt(mib, this);
                        this.atmSigDescrParamBlliSnapId = new AtmSigDescrParamBlliSnapIdEnt(mib, this);
                        this.atmSigDescrParamBlliOuiPid = new AtmSigDescrParamBlliOuiPidEnt(mib, this);
                        this.atmSigDescrParamRowStatus = new AtmSigDescrParamRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmSigDescrParamIndex,
                            this.atmSigDescrParamAalType,
                            this.atmSigDescrParamAalSscsType,
                            this.atmSigDescrParamBhliType,
                            this.atmSigDescrParamBhliInfo,
                            this.atmSigDescrParamBbcConnConf,
                            this.atmSigDescrParamBlliLayer2,
                            this.atmSigDescrParamBlliLayer3,
                            this.atmSigDescrParamBlliPktSize,
                            this.atmSigDescrParamBlliSnapId,
                            this.atmSigDescrParamBlliOuiPid,
                            this.atmSigDescrParamRowStatus
                        };
                    }
                    public static final class AtmSigDescrParamIndexEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDescrParamIndexEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDescrParamIndex", "1.3.6.1.2.1.37.1.14.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDescrParamAalTypeEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDescrParamAalTypeEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDescrParamAalType", "1.3.6.1.2.1.37.1.14.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDescrParamAalSscsTypeEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDescrParamAalSscsTypeEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDescrParamAalSscsType", "1.3.6.1.2.1.37.1.14.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDescrParamBhliTypeEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDescrParamBhliTypeEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDescrParamBhliType", "1.3.6.1.2.1.37.1.14.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDescrParamBhliInfoEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDescrParamBhliInfoEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDescrParamBhliInfo", "1.3.6.1.2.1.37.1.14.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDescrParamBbcConnConfEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDescrParamBbcConnConfEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDescrParamBbcConnConf", "1.3.6.1.2.1.37.1.14.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDescrParamBlliLayer2Ent extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDescrParamBlliLayer2Ent(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDescrParamBlliLayer2", "1.3.6.1.2.1.37.1.14.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDescrParamBlliLayer3Ent extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDescrParamBlliLayer3Ent(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDescrParamBlliLayer3", "1.3.6.1.2.1.37.1.14.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDescrParamBlliPktSizeEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDescrParamBlliPktSizeEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDescrParamBlliPktSize", "1.3.6.1.2.1.37.1.14.1.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDescrParamBlliSnapIdEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDescrParamBlliSnapIdEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDescrParamBlliSnapId", "1.3.6.1.2.1.37.1.14.1.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDescrParamBlliOuiPidEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDescrParamBlliOuiPidEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDescrParamBlliOuiPid", "1.3.6.1.2.1.37.1.14.1.5.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSigDescrParamRowStatusEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSigDescrParamRowStatusEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSigDescrParamRowStatus", "1.3.6.1.2.1.37.1.14.1.5.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmIfRegisteredAddrTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmIfRegisteredAddrEntryEnt atmIfRegisteredAddrEntry;

                private AtmIfRegisteredAddrTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmIfRegisteredAddrTable", "1.3.6.1.2.1.37.1.14.1.6", false, true, false, false);
                    this.atmIfRegisteredAddrEntry = new AtmIfRegisteredAddrEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmIfRegisteredAddrEntry
                    };
                }
                public static final class AtmIfRegisteredAddrEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmIfRegAddrAddressEnt atmIfRegAddrAddress;

                    public final AtmIfRegAddrAddressSourceEnt atmIfRegAddrAddressSource;

                    public final AtmIfRegAddrOrgScopeEnt atmIfRegAddrOrgScope;

                    public final AtmIfRegAddrRowStatusEnt atmIfRegAddrRowStatus;

                    private AtmIfRegisteredAddrEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmIfRegisteredAddrEntry", "1.3.6.1.2.1.37.1.14.1.6.1", false, false, false, true);
                        this.atmIfRegAddrAddress = new AtmIfRegAddrAddressEnt(mib, this);
                        this.atmIfRegAddrAddressSource = new AtmIfRegAddrAddressSourceEnt(mib, this);
                        this.atmIfRegAddrOrgScope = new AtmIfRegAddrOrgScopeEnt(mib, this);
                        this.atmIfRegAddrRowStatus = new AtmIfRegAddrRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmIfRegAddrAddress,
                            this.atmIfRegAddrAddressSource,
                            this.atmIfRegAddrOrgScope,
                            this.atmIfRegAddrRowStatus
                        };
                    }
                    public static final class AtmIfRegAddrAddressEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIfRegAddrAddressEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIfRegAddrAddress", "1.3.6.1.2.1.37.1.14.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIfRegAddrAddressSourceEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIfRegAddrAddressSourceEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIfRegAddrAddressSource", "1.3.6.1.2.1.37.1.14.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIfRegAddrOrgScopeEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIfRegAddrOrgScopeEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIfRegAddrOrgScope", "1.3.6.1.2.1.37.1.14.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIfRegAddrRowStatusEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIfRegAddrRowStatusEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIfRegAddrRowStatus", "1.3.6.1.2.1.37.1.14.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmVclAddrTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmVclAddrEntryEnt atmVclAddrEntry;

                private AtmVclAddrTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmVclAddrTable", "1.3.6.1.2.1.37.1.14.1.7", false, true, false, false);
                    this.atmVclAddrEntry = new AtmVclAddrEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmVclAddrEntry
                    };
                }
                public static final class AtmVclAddrEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmVclAddrAddrEnt atmVclAddrAddr;

                    public final AtmVclAddrTypeEnt atmVclAddrType;

                    public final AtmVclAddrRowStatusEnt atmVclAddrRowStatus;

                    private AtmVclAddrEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmVclAddrEntry", "1.3.6.1.2.1.37.1.14.1.7.1", false, false, false, true);
                        this.atmVclAddrAddr = new AtmVclAddrAddrEnt(mib, this);
                        this.atmVclAddrType = new AtmVclAddrTypeEnt(mib, this);
                        this.atmVclAddrRowStatus = new AtmVclAddrRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmVclAddrAddr,
                            this.atmVclAddrType,
                            this.atmVclAddrRowStatus
                        };
                    }
                    public static final class AtmVclAddrAddrEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVclAddrAddrEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVclAddrAddr", "1.3.6.1.2.1.37.1.14.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclAddrTypeEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVclAddrTypeEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVclAddrType", "1.3.6.1.2.1.37.1.14.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclAddrRowStatusEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVclAddrRowStatusEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVclAddrRowStatus", "1.3.6.1.2.1.37.1.14.1.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmAddrVclTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmAddrVclEntryEnt atmAddrVclEntry;

                private AtmAddrVclTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmAddrVclTable", "1.3.6.1.2.1.37.1.14.1.8", false, true, false, false);
                    this.atmAddrVclEntry = new AtmAddrVclEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmAddrVclEntry
                    };
                }
                public static final class AtmAddrVclEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmAddrVclAtmIfIndexEnt atmAddrVclAtmIfIndex;

                    public final AtmAddrVclVpiEnt atmAddrVclVpi;

                    public final AtmAddrVclVciEnt atmAddrVclVci;

                    public final AtmAddrVclAddrTypeEnt atmAddrVclAddrType;

                    private AtmAddrVclEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmAddrVclEntry", "1.3.6.1.2.1.37.1.14.1.8.1", false, false, false, true);
                        this.atmAddrVclAtmIfIndex = new AtmAddrVclAtmIfIndexEnt(mib, this);
                        this.atmAddrVclVpi = new AtmAddrVclVpiEnt(mib, this);
                        this.atmAddrVclVci = new AtmAddrVclVciEnt(mib, this);
                        this.atmAddrVclAddrType = new AtmAddrVclAddrTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmAddrVclAtmIfIndex,
                            this.atmAddrVclVpi,
                            this.atmAddrVclVci,
                            this.atmAddrVclAddrType
                        };
                    }
                    public static final class AtmAddrVclAtmIfIndexEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmAddrVclAtmIfIndexEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmAddrVclAtmIfIndex", "1.3.6.1.2.1.37.1.14.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmAddrVclVpiEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmAddrVclVpiEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmAddrVclVpi", "1.3.6.1.2.1.37.1.14.1.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmAddrVclVciEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmAddrVclVciEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmAddrVclVci", "1.3.6.1.2.1.37.1.14.1.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmAddrVclAddrTypeEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmAddrVclAddrTypeEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmAddrVclAddrType", "1.3.6.1.2.1.37.1.14.1.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmVplStatTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmVplStatEntryEnt atmVplStatEntry;

                private AtmVplStatTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmVplStatTable", "1.3.6.1.2.1.37.1.14.1.9", false, true, false, false);
                    this.atmVplStatEntry = new AtmVplStatEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmVplStatEntry
                    };
                }
                public static final class AtmVplStatEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmVplStatTotalCellInsEnt atmVplStatTotalCellIns;

                    public final AtmVplStatClp0CellInsEnt atmVplStatClp0CellIns;

                    public final AtmVplStatTotalDiscardsEnt atmVplStatTotalDiscards;

                    public final AtmVplStatClp0DiscardsEnt atmVplStatClp0Discards;

                    public final AtmVplStatTotalCellOutsEnt atmVplStatTotalCellOuts;

                    public final AtmVplStatClp0CellOutsEnt atmVplStatClp0CellOuts;

                    public final AtmVplStatClp0TaggedEnt atmVplStatClp0Tagged;

                    private AtmVplStatEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmVplStatEntry", "1.3.6.1.2.1.37.1.14.1.9.1", false, false, false, true);
                        this.atmVplStatTotalCellIns = new AtmVplStatTotalCellInsEnt(mib, this);
                        this.atmVplStatClp0CellIns = new AtmVplStatClp0CellInsEnt(mib, this);
                        this.atmVplStatTotalDiscards = new AtmVplStatTotalDiscardsEnt(mib, this);
                        this.atmVplStatClp0Discards = new AtmVplStatClp0DiscardsEnt(mib, this);
                        this.atmVplStatTotalCellOuts = new AtmVplStatTotalCellOutsEnt(mib, this);
                        this.atmVplStatClp0CellOuts = new AtmVplStatClp0CellOutsEnt(mib, this);
                        this.atmVplStatClp0Tagged = new AtmVplStatClp0TaggedEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmVplStatTotalCellIns,
                            this.atmVplStatClp0CellIns,
                            this.atmVplStatTotalDiscards,
                            this.atmVplStatClp0Discards,
                            this.atmVplStatTotalCellOuts,
                            this.atmVplStatClp0CellOuts,
                            this.atmVplStatClp0Tagged
                        };
                    }
                    public static final class AtmVplStatTotalCellInsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVplStatTotalCellInsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVplStatTotalCellIns", "1.3.6.1.2.1.37.1.14.1.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVplStatClp0CellInsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVplStatClp0CellInsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVplStatClp0CellIns", "1.3.6.1.2.1.37.1.14.1.9.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVplStatTotalDiscardsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVplStatTotalDiscardsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVplStatTotalDiscards", "1.3.6.1.2.1.37.1.14.1.9.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVplStatClp0DiscardsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVplStatClp0DiscardsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVplStatClp0Discards", "1.3.6.1.2.1.37.1.14.1.9.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVplStatTotalCellOutsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVplStatTotalCellOutsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVplStatTotalCellOuts", "1.3.6.1.2.1.37.1.14.1.9.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVplStatClp0CellOutsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVplStatClp0CellOutsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVplStatClp0CellOuts", "1.3.6.1.2.1.37.1.14.1.9.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVplStatClp0TaggedEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVplStatClp0TaggedEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVplStatClp0Tagged", "1.3.6.1.2.1.37.1.14.1.9.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmVplLogicalPortTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmVplLogicalPortEntryEnt atmVplLogicalPortEntry;

                private AtmVplLogicalPortTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmVplLogicalPortTable", "1.3.6.1.2.1.37.1.14.1.10", false, true, false, false);
                    this.atmVplLogicalPortEntry = new AtmVplLogicalPortEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmVplLogicalPortEntry
                    };
                }
                public static final class AtmVplLogicalPortEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmVplLogicalPortDefEnt atmVplLogicalPortDef;

                    public final AtmVplLogicalPortIndexEnt atmVplLogicalPortIndex;

                    private AtmVplLogicalPortEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmVplLogicalPortEntry", "1.3.6.1.2.1.37.1.14.1.10.1", false, false, false, true);
                        this.atmVplLogicalPortDef = new AtmVplLogicalPortDefEnt(mib, this);
                        this.atmVplLogicalPortIndex = new AtmVplLogicalPortIndexEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmVplLogicalPortDef,
                            this.atmVplLogicalPortIndex
                        };
                    }
                    public static final class AtmVplLogicalPortDefEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVplLogicalPortDefEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVplLogicalPortDef", "1.3.6.1.2.1.37.1.14.1.10.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVplLogicalPortIndexEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVplLogicalPortIndexEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVplLogicalPortIndex", "1.3.6.1.2.1.37.1.14.1.10.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmVclStatTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmVclStatEntryEnt atmVclStatEntry;

                private AtmVclStatTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmVclStatTable", "1.3.6.1.2.1.37.1.14.1.11", false, true, false, false);
                    this.atmVclStatEntry = new AtmVclStatEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmVclStatEntry
                    };
                }
                public static final class AtmVclStatEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmVclStatTotalCellInsEnt atmVclStatTotalCellIns;

                    public final AtmVclStatClp0CellInsEnt atmVclStatClp0CellIns;

                    public final AtmVclStatTotalDiscardsEnt atmVclStatTotalDiscards;

                    public final AtmVclStatClp0DiscardsEnt atmVclStatClp0Discards;

                    public final AtmVclStatTotalCellOutsEnt atmVclStatTotalCellOuts;

                    public final AtmVclStatClp0CellOutsEnt atmVclStatClp0CellOuts;

                    public final AtmVclStatClp0TaggedEnt atmVclStatClp0Tagged;

                    private AtmVclStatEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmVclStatEntry", "1.3.6.1.2.1.37.1.14.1.11.1", false, false, false, true);
                        this.atmVclStatTotalCellIns = new AtmVclStatTotalCellInsEnt(mib, this);
                        this.atmVclStatClp0CellIns = new AtmVclStatClp0CellInsEnt(mib, this);
                        this.atmVclStatTotalDiscards = new AtmVclStatTotalDiscardsEnt(mib, this);
                        this.atmVclStatClp0Discards = new AtmVclStatClp0DiscardsEnt(mib, this);
                        this.atmVclStatTotalCellOuts = new AtmVclStatTotalCellOutsEnt(mib, this);
                        this.atmVclStatClp0CellOuts = new AtmVclStatClp0CellOutsEnt(mib, this);
                        this.atmVclStatClp0Tagged = new AtmVclStatClp0TaggedEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmVclStatTotalCellIns,
                            this.atmVclStatClp0CellIns,
                            this.atmVclStatTotalDiscards,
                            this.atmVclStatClp0Discards,
                            this.atmVclStatTotalCellOuts,
                            this.atmVclStatClp0CellOuts,
                            this.atmVclStatClp0Tagged
                        };
                    }
                    public static final class AtmVclStatTotalCellInsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVclStatTotalCellInsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVclStatTotalCellIns", "1.3.6.1.2.1.37.1.14.1.11.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclStatClp0CellInsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVclStatClp0CellInsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVclStatClp0CellIns", "1.3.6.1.2.1.37.1.14.1.11.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclStatTotalDiscardsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVclStatTotalDiscardsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVclStatTotalDiscards", "1.3.6.1.2.1.37.1.14.1.11.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclStatClp0DiscardsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVclStatClp0DiscardsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVclStatClp0Discards", "1.3.6.1.2.1.37.1.14.1.11.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclStatTotalCellOutsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVclStatTotalCellOutsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVclStatTotalCellOuts", "1.3.6.1.2.1.37.1.14.1.11.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclStatClp0CellOutsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVclStatClp0CellOutsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVclStatClp0CellOuts", "1.3.6.1.2.1.37.1.14.1.11.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVclStatClp0TaggedEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVclStatClp0TaggedEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVclStatClp0Tagged", "1.3.6.1.2.1.37.1.14.1.11.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmAal5VclStatTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmAal5VclStatEntryEnt atmAal5VclStatEntry;

                private AtmAal5VclStatTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmAal5VclStatTable", "1.3.6.1.2.1.37.1.14.1.12", false, true, false, false);
                    this.atmAal5VclStatEntry = new AtmAal5VclStatEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmAal5VclStatEntry
                    };
                }
                public static final class AtmAal5VclStatEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmAal5VclInPktsEnt atmAal5VclInPkts;

                    public final AtmAal5VclOutPktsEnt atmAal5VclOutPkts;

                    public final AtmAal5VclInOctetsEnt atmAal5VclInOctets;

                    public final AtmAal5VclOutOctetsEnt atmAal5VclOutOctets;

                    private AtmAal5VclStatEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmAal5VclStatEntry", "1.3.6.1.2.1.37.1.14.1.12.1", false, false, false, true);
                        this.atmAal5VclInPkts = new AtmAal5VclInPktsEnt(mib, this);
                        this.atmAal5VclOutPkts = new AtmAal5VclOutPktsEnt(mib, this);
                        this.atmAal5VclInOctets = new AtmAal5VclInOctetsEnt(mib, this);
                        this.atmAal5VclOutOctets = new AtmAal5VclOutOctetsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmAal5VclInPkts,
                            this.atmAal5VclOutPkts,
                            this.atmAal5VclInOctets,
                            this.atmAal5VclOutOctets
                        };
                    }
                    public static final class AtmAal5VclInPktsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmAal5VclInPktsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmAal5VclInPkts", "1.3.6.1.2.1.37.1.14.1.12.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmAal5VclOutPktsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmAal5VclOutPktsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmAal5VclOutPkts", "1.3.6.1.2.1.37.1.14.1.12.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmAal5VclInOctetsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmAal5VclInOctetsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmAal5VclInOctets", "1.3.6.1.2.1.37.1.14.1.12.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmAal5VclOutOctetsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmAal5VclOutOctetsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmAal5VclOutOctets", "1.3.6.1.2.1.37.1.14.1.12.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmVclGenTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmVclGenEntryEnt atmVclGenEntry;

                private AtmVclGenTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmVclGenTable", "1.3.6.1.2.1.37.1.14.1.13", false, true, false, false);
                    this.atmVclGenEntry = new AtmVclGenEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmVclGenEntry
                    };
                }
                public static final class AtmVclGenEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmVclGenSigDescrIndexEnt atmVclGenSigDescrIndex;

                    private AtmVclGenEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmVclGenEntry", "1.3.6.1.2.1.37.1.14.1.13.1", false, false, false, true);
                        this.atmVclGenSigDescrIndex = new AtmVclGenSigDescrIndexEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmVclGenSigDescrIndex
                        };
                    }
                    public static final class AtmVclGenSigDescrIndexEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVclGenSigDescrIndexEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVclGenSigDescrIndex", "1.3.6.1.2.1.37.1.14.1.13.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmInterfaceExtTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmInterfaceExtEntryEnt atmInterfaceExtEntry;

                private AtmInterfaceExtTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmInterfaceExtTable", "1.3.6.1.2.1.37.1.14.1.14", false, true, false, false);
                    this.atmInterfaceExtEntry = new AtmInterfaceExtEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmInterfaceExtEntry
                    };
                }
                public static final class AtmInterfaceExtEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmIntfConfigTypeEnt atmIntfConfigType;

                    public final AtmIntfActualTypeEnt atmIntfActualType;

                    public final AtmIntfConfigSideEnt atmIntfConfigSide;

                    public final AtmIntfActualSideEnt atmIntfActualSide;

                    public final AtmIntfIlmiAdminStatusEnt atmIntfIlmiAdminStatus;

                    public final AtmIntfIlmiOperStatusEnt atmIntfIlmiOperStatus;

                    public final AtmIntfIlmiFsmStateEnt atmIntfIlmiFsmState;

                    public final AtmIntfIlmiEstablishConPollIntvlEnt atmIntfIlmiEstablishConPollIntvl;

                    public final AtmIntfIlmiCheckConPollIntvlEnt atmIntfIlmiCheckConPollIntvl;

                    public final AtmIntfIlmiConPollInactFactorEnt atmIntfIlmiConPollInactFactor;

                    public final AtmIntfIlmiPublicPrivateIndctrEnt atmIntfIlmiPublicPrivateIndctr;

                    public final AtmInterfaceConfMaxSvpcVpiEnt atmInterfaceConfMaxSvpcVpi;

                    public final AtmInterfaceCurrentMaxSvpcVpiEnt atmInterfaceCurrentMaxSvpcVpi;

                    public final AtmInterfaceConfMaxSvccVpiEnt atmInterfaceConfMaxSvccVpi;

                    public final AtmInterfaceCurrentMaxSvccVpiEnt atmInterfaceCurrentMaxSvccVpi;

                    public final AtmInterfaceConfMinSvccVciEnt atmInterfaceConfMinSvccVci;

                    public final AtmInterfaceCurrentMinSvccVciEnt atmInterfaceCurrentMinSvccVci;

                    public final AtmIntfSigVccRxTrafficDescrIndexEnt atmIntfSigVccRxTrafficDescrIndex;

                    public final AtmIntfSigVccTxTrafficDescrIndexEnt atmIntfSigVccTxTrafficDescrIndex;

                    public final AtmIntfPvcFailuresEnt atmIntfPvcFailures;

                    public final AtmIntfCurrentlyFailingPVplsEnt atmIntfCurrentlyFailingPVpls;

                    public final AtmIntfCurrentlyFailingPVclsEnt atmIntfCurrentlyFailingPVcls;

                    public final AtmIntfPvcFailuresTrapEnableEnt atmIntfPvcFailuresTrapEnable;

                    public final AtmIntfPvcNotificationIntervalEnt atmIntfPvcNotificationInterval;

                    public final AtmIntfLeafSetupFailuresEnt atmIntfLeafSetupFailures;

                    public final AtmIntfLeafSetupRequestsEnt atmIntfLeafSetupRequests;

                    private AtmInterfaceExtEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmInterfaceExtEntry", "1.3.6.1.2.1.37.1.14.1.14.1", false, false, false, true);
                        this.atmIntfConfigType = new AtmIntfConfigTypeEnt(mib, this);
                        this.atmIntfActualType = new AtmIntfActualTypeEnt(mib, this);
                        this.atmIntfConfigSide = new AtmIntfConfigSideEnt(mib, this);
                        this.atmIntfActualSide = new AtmIntfActualSideEnt(mib, this);
                        this.atmIntfIlmiAdminStatus = new AtmIntfIlmiAdminStatusEnt(mib, this);
                        this.atmIntfIlmiOperStatus = new AtmIntfIlmiOperStatusEnt(mib, this);
                        this.atmIntfIlmiFsmState = new AtmIntfIlmiFsmStateEnt(mib, this);
                        this.atmIntfIlmiEstablishConPollIntvl = new AtmIntfIlmiEstablishConPollIntvlEnt(mib, this);
                        this.atmIntfIlmiCheckConPollIntvl = new AtmIntfIlmiCheckConPollIntvlEnt(mib, this);
                        this.atmIntfIlmiConPollInactFactor = new AtmIntfIlmiConPollInactFactorEnt(mib, this);
                        this.atmIntfIlmiPublicPrivateIndctr = new AtmIntfIlmiPublicPrivateIndctrEnt(mib, this);
                        this.atmInterfaceConfMaxSvpcVpi = new AtmInterfaceConfMaxSvpcVpiEnt(mib, this);
                        this.atmInterfaceCurrentMaxSvpcVpi = new AtmInterfaceCurrentMaxSvpcVpiEnt(mib, this);
                        this.atmInterfaceConfMaxSvccVpi = new AtmInterfaceConfMaxSvccVpiEnt(mib, this);
                        this.atmInterfaceCurrentMaxSvccVpi = new AtmInterfaceCurrentMaxSvccVpiEnt(mib, this);
                        this.atmInterfaceConfMinSvccVci = new AtmInterfaceConfMinSvccVciEnt(mib, this);
                        this.atmInterfaceCurrentMinSvccVci = new AtmInterfaceCurrentMinSvccVciEnt(mib, this);
                        this.atmIntfSigVccRxTrafficDescrIndex = new AtmIntfSigVccRxTrafficDescrIndexEnt(mib, this);
                        this.atmIntfSigVccTxTrafficDescrIndex = new AtmIntfSigVccTxTrafficDescrIndexEnt(mib, this);
                        this.atmIntfPvcFailures = new AtmIntfPvcFailuresEnt(mib, this);
                        this.atmIntfCurrentlyFailingPVpls = new AtmIntfCurrentlyFailingPVplsEnt(mib, this);
                        this.atmIntfCurrentlyFailingPVcls = new AtmIntfCurrentlyFailingPVclsEnt(mib, this);
                        this.atmIntfPvcFailuresTrapEnable = new AtmIntfPvcFailuresTrapEnableEnt(mib, this);
                        this.atmIntfPvcNotificationInterval = new AtmIntfPvcNotificationIntervalEnt(mib, this);
                        this.atmIntfLeafSetupFailures = new AtmIntfLeafSetupFailuresEnt(mib, this);
                        this.atmIntfLeafSetupRequests = new AtmIntfLeafSetupRequestsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmIntfConfigType,
                            this.atmIntfActualType,
                            this.atmIntfConfigSide,
                            this.atmIntfActualSide,
                            this.atmIntfIlmiAdminStatus,
                            this.atmIntfIlmiOperStatus,
                            this.atmIntfIlmiFsmState,
                            this.atmIntfIlmiEstablishConPollIntvl,
                            this.atmIntfIlmiCheckConPollIntvl,
                            this.atmIntfIlmiConPollInactFactor,
                            this.atmIntfIlmiPublicPrivateIndctr,
                            this.atmInterfaceConfMaxSvpcVpi,
                            this.atmInterfaceCurrentMaxSvpcVpi,
                            this.atmInterfaceConfMaxSvccVpi,
                            this.atmInterfaceCurrentMaxSvccVpi,
                            this.atmInterfaceConfMinSvccVci,
                            this.atmInterfaceCurrentMinSvccVci,
                            this.atmIntfSigVccRxTrafficDescrIndex,
                            this.atmIntfSigVccTxTrafficDescrIndex,
                            this.atmIntfPvcFailures,
                            this.atmIntfCurrentlyFailingPVpls,
                            this.atmIntfCurrentlyFailingPVcls,
                            this.atmIntfPvcFailuresTrapEnable,
                            this.atmIntfPvcNotificationInterval,
                            this.atmIntfLeafSetupFailures,
                            this.atmIntfLeafSetupRequests
                        };
                    }
                    public static final class AtmIntfConfigTypeEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfConfigTypeEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfConfigType", "1.3.6.1.2.1.37.1.14.1.14.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfActualTypeEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfActualTypeEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfActualType", "1.3.6.1.2.1.37.1.14.1.14.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfConfigSideEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfConfigSideEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfConfigSide", "1.3.6.1.2.1.37.1.14.1.14.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfActualSideEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfActualSideEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfActualSide", "1.3.6.1.2.1.37.1.14.1.14.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfIlmiAdminStatusEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfIlmiAdminStatusEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfIlmiAdminStatus", "1.3.6.1.2.1.37.1.14.1.14.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfIlmiOperStatusEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfIlmiOperStatusEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfIlmiOperStatus", "1.3.6.1.2.1.37.1.14.1.14.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfIlmiFsmStateEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfIlmiFsmStateEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfIlmiFsmState", "1.3.6.1.2.1.37.1.14.1.14.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfIlmiEstablishConPollIntvlEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfIlmiEstablishConPollIntvlEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfIlmiEstablishConPollIntvl", "1.3.6.1.2.1.37.1.14.1.14.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfIlmiCheckConPollIntvlEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfIlmiCheckConPollIntvlEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfIlmiCheckConPollIntvl", "1.3.6.1.2.1.37.1.14.1.14.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfIlmiConPollInactFactorEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfIlmiConPollInactFactorEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfIlmiConPollInactFactor", "1.3.6.1.2.1.37.1.14.1.14.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfIlmiPublicPrivateIndctrEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfIlmiPublicPrivateIndctrEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfIlmiPublicPrivateIndctr", "1.3.6.1.2.1.37.1.14.1.14.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceConfMaxSvpcVpiEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmInterfaceConfMaxSvpcVpiEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceConfMaxSvpcVpi", "1.3.6.1.2.1.37.1.14.1.14.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceCurrentMaxSvpcVpiEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmInterfaceCurrentMaxSvpcVpiEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceCurrentMaxSvpcVpi", "1.3.6.1.2.1.37.1.14.1.14.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceConfMaxSvccVpiEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmInterfaceConfMaxSvccVpiEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceConfMaxSvccVpi", "1.3.6.1.2.1.37.1.14.1.14.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceCurrentMaxSvccVpiEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmInterfaceCurrentMaxSvccVpiEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceCurrentMaxSvccVpi", "1.3.6.1.2.1.37.1.14.1.14.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceConfMinSvccVciEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmInterfaceConfMinSvccVciEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceConfMinSvccVci", "1.3.6.1.2.1.37.1.14.1.14.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmInterfaceCurrentMinSvccVciEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmInterfaceCurrentMinSvccVciEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmInterfaceCurrentMinSvccVci", "1.3.6.1.2.1.37.1.14.1.14.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfSigVccRxTrafficDescrIndexEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfSigVccRxTrafficDescrIndexEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfSigVccRxTrafficDescrIndex", "1.3.6.1.2.1.37.1.14.1.14.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfSigVccTxTrafficDescrIndexEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfSigVccTxTrafficDescrIndexEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfSigVccTxTrafficDescrIndex", "1.3.6.1.2.1.37.1.14.1.14.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfPvcFailuresEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfPvcFailuresEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfPvcFailures", "1.3.6.1.2.1.37.1.14.1.14.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfCurrentlyFailingPVplsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfCurrentlyFailingPVplsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfCurrentlyFailingPVpls", "1.3.6.1.2.1.37.1.14.1.14.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfCurrentlyFailingPVclsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfCurrentlyFailingPVclsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfCurrentlyFailingPVcls", "1.3.6.1.2.1.37.1.14.1.14.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfPvcFailuresTrapEnableEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfPvcFailuresTrapEnableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfPvcFailuresTrapEnable", "1.3.6.1.2.1.37.1.14.1.14.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfPvcNotificationIntervalEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfPvcNotificationIntervalEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfPvcNotificationInterval", "1.3.6.1.2.1.37.1.14.1.14.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfLeafSetupFailuresEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfLeafSetupFailuresEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfLeafSetupFailures", "1.3.6.1.2.1.37.1.14.1.14.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIntfLeafSetupRequestsEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfLeafSetupRequestsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfLeafSetupRequests", "1.3.6.1.2.1.37.1.14.1.14.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmIlmiSrvcRegTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmIlmiSrvcRegEntryEnt atmIlmiSrvcRegEntry;

                private AtmIlmiSrvcRegTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmIlmiSrvcRegTable", "1.3.6.1.2.1.37.1.14.1.15", false, true, false, false);
                    this.atmIlmiSrvcRegEntry = new AtmIlmiSrvcRegEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmIlmiSrvcRegEntry
                    };
                }
                public static final class AtmIlmiSrvcRegEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmIlmiSrvcRegIndexEnt atmIlmiSrvcRegIndex;

                    public final AtmIlmiSrvcRegServiceIDEnt atmIlmiSrvcRegServiceID;

                    public final AtmIlmiSrvcRegAddressIndexEnt atmIlmiSrvcRegAddressIndex;

                    public final AtmIlmiSrvcRegATMAddressEnt atmIlmiSrvcRegATMAddress;

                    public final AtmIlmiSrvcRegParm1Ent atmIlmiSrvcRegParm1;

                    public final AtmIlmiSrvcRegRowStatusEnt atmIlmiSrvcRegRowStatus;

                    private AtmIlmiSrvcRegEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmIlmiSrvcRegEntry", "1.3.6.1.2.1.37.1.14.1.15.1", false, false, false, true);
                        this.atmIlmiSrvcRegIndex = new AtmIlmiSrvcRegIndexEnt(mib, this);
                        this.atmIlmiSrvcRegServiceID = new AtmIlmiSrvcRegServiceIDEnt(mib, this);
                        this.atmIlmiSrvcRegAddressIndex = new AtmIlmiSrvcRegAddressIndexEnt(mib, this);
                        this.atmIlmiSrvcRegATMAddress = new AtmIlmiSrvcRegATMAddressEnt(mib, this);
                        this.atmIlmiSrvcRegParm1 = new AtmIlmiSrvcRegParm1Ent(mib, this);
                        this.atmIlmiSrvcRegRowStatus = new AtmIlmiSrvcRegRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmIlmiSrvcRegIndex,
                            this.atmIlmiSrvcRegServiceID,
                            this.atmIlmiSrvcRegAddressIndex,
                            this.atmIlmiSrvcRegATMAddress,
                            this.atmIlmiSrvcRegParm1,
                            this.atmIlmiSrvcRegRowStatus
                        };
                    }
                    public static final class AtmIlmiSrvcRegIndexEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIlmiSrvcRegIndexEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIlmiSrvcRegIndex", "1.3.6.1.2.1.37.1.14.1.15.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIlmiSrvcRegServiceIDEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIlmiSrvcRegServiceIDEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIlmiSrvcRegServiceID", "1.3.6.1.2.1.37.1.14.1.15.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIlmiSrvcRegAddressIndexEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIlmiSrvcRegAddressIndexEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIlmiSrvcRegAddressIndex", "1.3.6.1.2.1.37.1.14.1.15.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIlmiSrvcRegATMAddressEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIlmiSrvcRegATMAddressEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIlmiSrvcRegATMAddress", "1.3.6.1.2.1.37.1.14.1.15.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIlmiSrvcRegParm1Ent extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIlmiSrvcRegParm1Ent(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIlmiSrvcRegParm1", "1.3.6.1.2.1.37.1.14.1.15.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIlmiSrvcRegRowStatusEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIlmiSrvcRegRowStatusEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIlmiSrvcRegRowStatus", "1.3.6.1.2.1.37.1.14.1.15.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmIlmiNetworkPrefixTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmIlmiNetworkPrefixEntryEnt atmIlmiNetworkPrefixEntry;

                private AtmIlmiNetworkPrefixTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmIlmiNetworkPrefixTable", "1.3.6.1.2.1.37.1.14.1.16", false, true, false, false);
                    this.atmIlmiNetworkPrefixEntry = new AtmIlmiNetworkPrefixEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmIlmiNetworkPrefixEntry
                    };
                }
                public static final class AtmIlmiNetworkPrefixEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmIlmiNetPrefixPrefixEnt atmIlmiNetPrefixPrefix;

                    public final AtmIlmiNetPrefixRowStatusEnt atmIlmiNetPrefixRowStatus;

                    private AtmIlmiNetworkPrefixEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmIlmiNetworkPrefixEntry", "1.3.6.1.2.1.37.1.14.1.16.1", false, false, false, true);
                        this.atmIlmiNetPrefixPrefix = new AtmIlmiNetPrefixPrefixEnt(mib, this);
                        this.atmIlmiNetPrefixRowStatus = new AtmIlmiNetPrefixRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmIlmiNetPrefixPrefix,
                            this.atmIlmiNetPrefixRowStatus
                        };
                    }
                    public static final class AtmIlmiNetPrefixPrefixEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIlmiNetPrefixPrefixEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIlmiNetPrefixPrefix", "1.3.6.1.2.1.37.1.14.1.16.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmIlmiNetPrefixRowStatusEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIlmiNetPrefixRowStatusEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIlmiNetPrefixRowStatus", "1.3.6.1.2.1.37.1.14.1.16.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmSwitchAddressTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmSwitchAddressEntryEnt atmSwitchAddressEntry;

                private AtmSwitchAddressTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmSwitchAddressTable", "1.3.6.1.2.1.37.1.14.1.17", false, true, false, false);
                    this.atmSwitchAddressEntry = new AtmSwitchAddressEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmSwitchAddressEntry
                    };
                }
                public static final class AtmSwitchAddressEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmSwitchAddressIndexEnt atmSwitchAddressIndex;

                    public final AtmSwitchAddressAddressEnt atmSwitchAddressAddress;

                    public final AtmSwitchAddressRowStatusEnt atmSwitchAddressRowStatus;

                    private AtmSwitchAddressEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmSwitchAddressEntry", "1.3.6.1.2.1.37.1.14.1.17.1", false, false, false, true);
                        this.atmSwitchAddressIndex = new AtmSwitchAddressIndexEnt(mib, this);
                        this.atmSwitchAddressAddress = new AtmSwitchAddressAddressEnt(mib, this);
                        this.atmSwitchAddressRowStatus = new AtmSwitchAddressRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmSwitchAddressIndex,
                            this.atmSwitchAddressAddress,
                            this.atmSwitchAddressRowStatus
                        };
                    }
                    public static final class AtmSwitchAddressIndexEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSwitchAddressIndexEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSwitchAddressIndex", "1.3.6.1.2.1.37.1.14.1.17.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSwitchAddressAddressEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSwitchAddressAddressEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSwitchAddressAddress", "1.3.6.1.2.1.37.1.14.1.17.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmSwitchAddressRowStatusEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmSwitchAddressRowStatusEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmSwitchAddressRowStatus", "1.3.6.1.2.1.37.1.14.1.17.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmVpCrossConnectXTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmVpCrossConnectXEntryEnt atmVpCrossConnectXEntry;

                private AtmVpCrossConnectXTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmVpCrossConnectXTable", "1.3.6.1.2.1.37.1.14.1.18", false, true, false, false);
                    this.atmVpCrossConnectXEntry = new AtmVpCrossConnectXEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmVpCrossConnectXEntry
                    };
                }
                public static final class AtmVpCrossConnectXEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmVpCrossConnectUserNameEnt atmVpCrossConnectUserName;

                    public final AtmVpCrossConnectProviderNameEnt atmVpCrossConnectProviderName;

                    private AtmVpCrossConnectXEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmVpCrossConnectXEntry", "1.3.6.1.2.1.37.1.14.1.18.1", false, false, false, true);
                        this.atmVpCrossConnectUserName = new AtmVpCrossConnectUserNameEnt(mib, this);
                        this.atmVpCrossConnectProviderName = new AtmVpCrossConnectProviderNameEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmVpCrossConnectUserName,
                            this.atmVpCrossConnectProviderName
                        };
                    }
                    public static final class AtmVpCrossConnectUserNameEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVpCrossConnectUserNameEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVpCrossConnectUserName", "1.3.6.1.2.1.37.1.14.1.18.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVpCrossConnectProviderNameEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVpCrossConnectProviderNameEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVpCrossConnectProviderName", "1.3.6.1.2.1.37.1.14.1.18.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmVcCrossConnectXTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmVcCrossConnectXEntryEnt atmVcCrossConnectXEntry;

                private AtmVcCrossConnectXTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmVcCrossConnectXTable", "1.3.6.1.2.1.37.1.14.1.19", false, true, false, false);
                    this.atmVcCrossConnectXEntry = new AtmVcCrossConnectXEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmVcCrossConnectXEntry
                    };
                }
                public static final class AtmVcCrossConnectXEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmVcCrossConnectUserNameEnt atmVcCrossConnectUserName;

                    public final AtmVcCrossConnectProviderNameEnt atmVcCrossConnectProviderName;

                    private AtmVcCrossConnectXEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmVcCrossConnectXEntry", "1.3.6.1.2.1.37.1.14.1.19.1", false, false, false, true);
                        this.atmVcCrossConnectUserName = new AtmVcCrossConnectUserNameEnt(mib, this);
                        this.atmVcCrossConnectProviderName = new AtmVcCrossConnectProviderNameEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmVcCrossConnectUserName,
                            this.atmVcCrossConnectProviderName
                        };
                    }
                    public static final class AtmVcCrossConnectUserNameEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVcCrossConnectUserNameEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVcCrossConnectUserName", "1.3.6.1.2.1.37.1.14.1.19.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class AtmVcCrossConnectProviderNameEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmVcCrossConnectProviderNameEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmVcCrossConnectProviderName", "1.3.6.1.2.1.37.1.14.1.19.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmCurrentlyFailingPVplTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmCurrentlyFailingPVplEntryEnt atmCurrentlyFailingPVplEntry;

                private AtmCurrentlyFailingPVplTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmCurrentlyFailingPVplTable", "1.3.6.1.2.1.37.1.14.1.20", false, true, false, false);
                    this.atmCurrentlyFailingPVplEntry = new AtmCurrentlyFailingPVplEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmCurrentlyFailingPVplEntry
                    };
                }
                public static final class AtmCurrentlyFailingPVplEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmCurrentlyFailingPVplTimeStampEnt atmCurrentlyFailingPVplTimeStamp;

                    private AtmCurrentlyFailingPVplEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmCurrentlyFailingPVplEntry", "1.3.6.1.2.1.37.1.14.1.20.1", false, false, false, true);
                        this.atmCurrentlyFailingPVplTimeStamp = new AtmCurrentlyFailingPVplTimeStampEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmCurrentlyFailingPVplTimeStamp
                        };
                    }
                    public static final class AtmCurrentlyFailingPVplTimeStampEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmCurrentlyFailingPVplTimeStampEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmCurrentlyFailingPVplTimeStamp", "1.3.6.1.2.1.37.1.14.1.20.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class AtmCurrentlyFailingPVclTableEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmCurrentlyFailingPVclEntryEnt atmCurrentlyFailingPVclEntry;

                private AtmCurrentlyFailingPVclTableEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmCurrentlyFailingPVclTable", "1.3.6.1.2.1.37.1.14.1.21", false, true, false, false);
                    this.atmCurrentlyFailingPVclEntry = new AtmCurrentlyFailingPVclEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmCurrentlyFailingPVclEntry
                    };
                }
                public static final class AtmCurrentlyFailingPVclEntryEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmCurrentlyFailingPVclTimeStampEnt atmCurrentlyFailingPVclTimeStamp;

                    private AtmCurrentlyFailingPVclEntryEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmCurrentlyFailingPVclEntry", "1.3.6.1.2.1.37.1.14.1.21.1", false, false, false, true);
                        this.atmCurrentlyFailingPVclTimeStamp = new AtmCurrentlyFailingPVclTimeStampEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmCurrentlyFailingPVclTimeStamp
                        };
                    }
                    public static final class AtmCurrentlyFailingPVclTimeStampEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmCurrentlyFailingPVclTimeStampEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmCurrentlyFailingPVclTimeStamp", "1.3.6.1.2.1.37.1.14.1.21.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class Atm2MIBTrapsEnt extends MIBEntry<ATM2MIBDef>
        {
            /** ATM PVC Traps*/
            public final AtmPvcTrapsEnt atmPvcTraps;

            private Atm2MIBTrapsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
            {
                super(mib, parent, "atm2MIBTraps", "1.3.6.1.2.1.37.1.14.2", false, false, false, false);
                this.atmPvcTraps = new AtmPvcTrapsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.atmPvcTraps
                };
            }
            public static final class AtmPvcTrapsEnt extends MIBEntry<ATM2MIBDef>
            {
                public final AtmPvcTrapsPrefixEnt atmPvcTrapsPrefix;

                private AtmPvcTrapsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atmPvcTraps", "1.3.6.1.2.1.37.1.14.2.1", false, false, false, false);
                    this.atmPvcTrapsPrefix = new AtmPvcTrapsPrefixEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmPvcTrapsPrefix
                    };
                }
                public static final class AtmPvcTrapsPrefixEnt extends MIBEntry<ATM2MIBDef>
                {
                    public final AtmIntfPvcFailuresTrapEnt atmIntfPvcFailuresTrap;

                    private AtmPvcTrapsPrefixEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmPvcTrapsPrefix", "1.3.6.1.2.1.37.1.14.2.1.0", false, false, false, false);
                        this.atmIntfPvcFailuresTrap = new AtmIntfPvcFailuresTrapEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.atmIntfPvcFailuresTrap
                        };
                    }
                    public static final class AtmIntfPvcFailuresTrapEnt extends MIBEntry<ATM2MIBDef>
                    {
                        private AtmIntfPvcFailuresTrapEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                        {
                            super(mib, parent, "atmIntfPvcFailuresTrap", "1.3.6.1.2.1.37.1.14.2.1.0.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class Atm2MIBConformanceEnt extends MIBEntry<ATM2MIBDef>
        {
            public final Atm2MIBGroupsEnt atm2MIBGroups;

            public final Atm2MIBCompliancesEnt atm2MIBCompliances;

            private Atm2MIBConformanceEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
            {
                super(mib, parent, "atm2MIBConformance", "1.3.6.1.2.1.37.1.14.3", false, false, false, false);
                this.atm2MIBGroups = new Atm2MIBGroupsEnt(mib, this);
                this.atm2MIBCompliances = new Atm2MIBCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.atm2MIBGroups,
                    this.atm2MIBCompliances
                };
            }
            public static final class Atm2MIBGroupsEnt extends MIBEntry<ATM2MIBDef>
            {
                /** **********************************************
Units of ConformanceMandatory for ATM hosts and switch/service providers*/
                public final AtmCommonGroupEnt atmCommonGroup;

                public final AtmCommonStatsGroupEnt atmCommonStatsGroup;

                public final AtmSwitchServcGroupEnt atmSwitchServcGroup;

                public final AtmSwitchServcSigGroupEnt atmSwitchServcSigGroup;

                public final AtmSwitchServcNotifGroupEnt atmSwitchServcNotifGroup;

                public final AtmSwitchGroupEnt atmSwitchGroup;

                public final AtmServcGroupEnt atmServcGroup;

                public final AtmHostGroupEnt atmHostGroup;

                public final AtmHostSigDescrGroupEnt atmHostSigDescrGroup;

                private Atm2MIBGroupsEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atm2MIBGroups", "1.3.6.1.2.1.37.1.14.3.1", false, false, false, false);
                    this.atmCommonGroup = new AtmCommonGroupEnt(mib, this);
                    this.atmCommonStatsGroup = new AtmCommonStatsGroupEnt(mib, this);
                    this.atmSwitchServcGroup = new AtmSwitchServcGroupEnt(mib, this);
                    this.atmSwitchServcSigGroup = new AtmSwitchServcSigGroupEnt(mib, this);
                    this.atmSwitchServcNotifGroup = new AtmSwitchServcNotifGroupEnt(mib, this);
                    this.atmSwitchGroup = new AtmSwitchGroupEnt(mib, this);
                    this.atmServcGroup = new AtmServcGroupEnt(mib, this);
                    this.atmHostGroup = new AtmHostGroupEnt(mib, this);
                    this.atmHostSigDescrGroup = new AtmHostSigDescrGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atmCommonGroup,
                        this.atmCommonStatsGroup,
                        this.atmSwitchServcGroup,
                        this.atmSwitchServcSigGroup,
                        this.atmSwitchServcNotifGroup,
                        this.atmSwitchGroup,
                        this.atmServcGroup,
                        this.atmHostGroup,
                        this.atmHostSigDescrGroup
                    };
                }
                public static final class AtmCommonGroupEnt extends MIBEntry<ATM2MIBDef>
                {
                    private AtmCommonGroupEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmCommonGroup", "1.3.6.1.2.1.37.1.14.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmCommonStatsGroupEnt extends MIBEntry<ATM2MIBDef>
                {
                    private AtmCommonStatsGroupEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmCommonStatsGroup", "1.3.6.1.2.1.37.1.14.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmSwitchServcGroupEnt extends MIBEntry<ATM2MIBDef>
                {
                    private AtmSwitchServcGroupEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmSwitchServcGroup", "1.3.6.1.2.1.37.1.14.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmSwitchServcSigGroupEnt extends MIBEntry<ATM2MIBDef>
                {
                    private AtmSwitchServcSigGroupEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmSwitchServcSigGroup", "1.3.6.1.2.1.37.1.14.3.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmSwitchServcNotifGroupEnt extends MIBEntry<ATM2MIBDef>
                {
                    private AtmSwitchServcNotifGroupEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmSwitchServcNotifGroup", "1.3.6.1.2.1.37.1.14.3.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmSwitchGroupEnt extends MIBEntry<ATM2MIBDef>
                {
                    private AtmSwitchGroupEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmSwitchGroup", "1.3.6.1.2.1.37.1.14.3.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmServcGroupEnt extends MIBEntry<ATM2MIBDef>
                {
                    private AtmServcGroupEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmServcGroup", "1.3.6.1.2.1.37.1.14.3.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmHostGroupEnt extends MIBEntry<ATM2MIBDef>
                {
                    private AtmHostGroupEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmHostGroup", "1.3.6.1.2.1.37.1.14.3.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtmHostSigDescrGroupEnt extends MIBEntry<ATM2MIBDef>
                {
                    private AtmHostSigDescrGroupEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atmHostSigDescrGroup", "1.3.6.1.2.1.37.1.14.3.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Atm2MIBCompliancesEnt extends MIBEntry<ATM2MIBDef>
            {
                /** Compliance Statements*/
                public final Atm2MIBComplianceEnt atm2MIBCompliance;

                private Atm2MIBCompliancesEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                {
                    super(mib, parent, "atm2MIBCompliances", "1.3.6.1.2.1.37.1.14.3.2", false, false, false, false);
                    this.atm2MIBCompliance = new Atm2MIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atm2MIBCompliance
                    };
                }
                public static final class Atm2MIBComplianceEnt extends MIBEntry<ATM2MIBDef>
                {
                    private Atm2MIBComplianceEnt(ATM2MIBDef mib, MIBEntry<ATM2MIBDef> parent)
                    {
                        super(mib, parent, "atm2MIBCompliance", "1.3.6.1.2.1.37.1.14.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
