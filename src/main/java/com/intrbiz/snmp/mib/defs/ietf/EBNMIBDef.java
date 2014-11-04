package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**Because the characters allowed in an SNA control
point name come from a restricted character set,
these names are not subject to internationalization.*/
public final class EBNMIBDef extends MIB
{
    public static final EBNMIBDef EBNMIB = new EBNMIBDef();

    static { MIBs.getInstance().registerMIB(EBNMIBDef.EBNMIB); }

    /** April 28, 1998*/
    public final EbnMIBEnt ebnMIB;

    private EBNMIBDef()
    {
        super("EBN-MIB");
        this.ebnMIB = new EbnMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ebnMIB
        };
    }

    public static final class EbnMIBEnt extends MIBEntry<EBNMIBDef>
    {
        /** *******************************************************************/
        public final EbnObjectsEnt ebnObjects;

        /** *******************************************************************Conformance Statement********************************************************************/
        public final EbnConformanceEnt ebnConformance;

        private EbnMIBEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
        {
            super(mib, parent, "ebnMIB", "1.3.6.1.2.1.34.7", false, false, false, false);
            this.ebnObjects = new EbnObjectsEnt(mib, this);
            this.ebnConformance = new EbnConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ebnObjects,
                this.ebnConformance
            };
        }
        public static final class EbnObjectsEnt extends MIBEntry<EBNMIBDef>
        {
            /** ******************************************************************
******************************************************************EBN Directory GroupThe ebnDirTable is an extension to the appnDirTable.  It specifiesthe subnet affiliation for LUs in the EBN's directory.*******************************************************************/
            public final EbnDirEnt ebnDir;

            /** ******************************************************************EBN Intermediate Session RSCV GroupThis table is a sparse extension to the appnIsInTable.  Forsessions crossing ISTGs adjacent to the EBN, it contains the RSCVand COS used in the direction of the BIND destination.*******************************************************************/
            public final EbnIsRscvEnt ebnIsRscv;

            /** ******************************************************************EBN Directory Config GroupThe following simple objects provide information about EBNdirectory.*******************************************************************/
            public final EbnDirConfigEnt ebnDirConfig;

            /** ******************************************************************EBN COS Mapping GroupThe ebnCosMap Table specifies how non-native COS values are mappedto COS values defined in the native subnetwork.  The COS mappingsthat an EBN performs are determined by multiple factors, one ofwhich is a set of user-defined mappings.  This table returns theCOS mappings that the EBN is actually performing, rather thanthe user-defined mappings.*******************************************************************/
            public final EbnCOSEnt ebnCOS;

            /** ******************************************************************EBN Subnet Routing List GroupThe EBN Subnet Routing List indicates to which nodes an EBNforwards search request.  This group contains informationpertaining to the CONFIGURED Subnet Routing List at an EBN.  How aparticular search request is routed is determined by a transientlist that the EBN creates based on the configured list and otherfactors.********************************************************************/
            public final EbnSubnetRoutingListEnt ebnSubnetRoutingList;

            /** *******************************************************************HPR Extended Border Node Intermediate Session GroupThe hbnIsInTable is a sparse extension to the appnIsInTable.For sessions that use back-to-back RTP connections in an HBN,this table provides the network connection endpoint identifier(NceId) and the transport connection identifier (Tcid) for thesecond RTP connection.********************************************************************/
            public final HbnEnt hbn;

            private EbnObjectsEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
            {
                super(mib, parent, "ebnObjects", "1.3.6.1.2.1.34.7.1", false, false, false, false);
                this.ebnDir = new EbnDirEnt(mib, this);
                this.ebnIsRscv = new EbnIsRscvEnt(mib, this);
                this.ebnDirConfig = new EbnDirConfigEnt(mib, this);
                this.ebnCOS = new EbnCOSEnt(mib, this);
                this.ebnSubnetRoutingList = new EbnSubnetRoutingListEnt(mib, this);
                this.hbn = new HbnEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ebnDir,
                    this.ebnIsRscv,
                    this.ebnDirConfig,
                    this.ebnCOS,
                    this.ebnSubnetRoutingList,
                    this.hbn
                };
            }
            public static final class EbnDirEnt extends MIBEntry<EBNMIBDef>
            {
                public final EbnDirTableEnt ebnDirTable;

                private EbnDirEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                {
                    super(mib, parent, "ebnDir", "1.3.6.1.2.1.34.7.1.1", false, false, false, false);
                    this.ebnDirTable = new EbnDirTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ebnDirTable
                    };
                }
                public static final class EbnDirTableEnt extends MIBEntry<EBNMIBDef>
                {
                    public final EbnDirEntryEnt ebnDirEntry;

                    private EbnDirTableEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                    {
                        super(mib, parent, "ebnDirTable", "1.3.6.1.2.1.34.7.1.1.1", false, true, false, false);
                        this.ebnDirEntry = new EbnDirEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ebnDirEntry
                        };
                    }
                    public static final class EbnDirEntryEnt extends MIBEntry<EBNMIBDef>
                    {
                        public final EbnDirLuNameEnt ebnDirLuName;

                        public final EbnDirSubnetAffiliationEnt ebnDirSubnetAffiliation;

                        private EbnDirEntryEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                        {
                            super(mib, parent, "ebnDirEntry", "1.3.6.1.2.1.34.7.1.1.1.1", false, false, false, true);
                            this.ebnDirLuName = new EbnDirLuNameEnt(mib, this);
                            this.ebnDirSubnetAffiliation = new EbnDirSubnetAffiliationEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ebnDirLuName,
                                this.ebnDirSubnetAffiliation
                            };
                        }
                        public static final class EbnDirLuNameEnt extends MIBEntry<EBNMIBDef>
                        {
                            private EbnDirLuNameEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "ebnDirLuName", "1.3.6.1.2.1.34.7.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EbnDirSubnetAffiliationEnt extends MIBEntry<EBNMIBDef>
                        {
                            private EbnDirSubnetAffiliationEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "ebnDirSubnetAffiliation", "1.3.6.1.2.1.34.7.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class EbnIsRscvEnt extends MIBEntry<EBNMIBDef>
            {
                public final EbnIsRscvTableEnt ebnIsRscvTable;

                private EbnIsRscvEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                {
                    super(mib, parent, "ebnIsRscv", "1.3.6.1.2.1.34.7.1.2", false, false, false, false);
                    this.ebnIsRscvTable = new EbnIsRscvTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ebnIsRscvTable
                    };
                }
                public static final class EbnIsRscvTableEnt extends MIBEntry<EBNMIBDef>
                {
                    public final EbnIsRscvEntryEnt ebnIsRscvEntry;

                    private EbnIsRscvTableEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                    {
                        super(mib, parent, "ebnIsRscvTable", "1.3.6.1.2.1.34.7.1.2.1", false, true, false, false);
                        this.ebnIsRscvEntry = new EbnIsRscvEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ebnIsRscvEntry
                        };
                    }
                    public static final class EbnIsRscvEntryEnt extends MIBEntry<EBNMIBDef>
                    {
                        public final EbnIsRscvCpNameEnt ebnIsRscvCpName;

                        public final EbnIsRscvPcidEnt ebnIsRscvPcid;

                        public final EbnIsRscvDestinationRouteEnt ebnIsRscvDestinationRoute;

                        public final EbnIsRscvDestinationCosEnt ebnIsRscvDestinationCos;

                        private EbnIsRscvEntryEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                        {
                            super(mib, parent, "ebnIsRscvEntry", "1.3.6.1.2.1.34.7.1.2.1.1", false, false, false, true);
                            this.ebnIsRscvCpName = new EbnIsRscvCpNameEnt(mib, this);
                            this.ebnIsRscvPcid = new EbnIsRscvPcidEnt(mib, this);
                            this.ebnIsRscvDestinationRoute = new EbnIsRscvDestinationRouteEnt(mib, this);
                            this.ebnIsRscvDestinationCos = new EbnIsRscvDestinationCosEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ebnIsRscvCpName,
                                this.ebnIsRscvPcid,
                                this.ebnIsRscvDestinationRoute,
                                this.ebnIsRscvDestinationCos
                            };
                        }
                        public static final class EbnIsRscvCpNameEnt extends MIBEntry<EBNMIBDef>
                        {
                            private EbnIsRscvCpNameEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "ebnIsRscvCpName", "1.3.6.1.2.1.34.7.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EbnIsRscvPcidEnt extends MIBEntry<EBNMIBDef>
                        {
                            private EbnIsRscvPcidEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "ebnIsRscvPcid", "1.3.6.1.2.1.34.7.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EbnIsRscvDestinationRouteEnt extends MIBEntry<EBNMIBDef>
                        {
                            private EbnIsRscvDestinationRouteEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "ebnIsRscvDestinationRoute", "1.3.6.1.2.1.34.7.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EbnIsRscvDestinationCosEnt extends MIBEntry<EBNMIBDef>
                        {
                            private EbnIsRscvDestinationCosEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "ebnIsRscvDestinationCos", "1.3.6.1.2.1.34.7.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class EbnDirConfigEnt extends MIBEntry<EBNMIBDef>
            {
                public final EbnSearchCacheTimeEnt ebnSearchCacheTime;

                public final EbnMaxSearchCacheEnt ebnMaxSearchCache;

                public final EbnDefaultSubnetVisitCountEnt ebnDefaultSubnetVisitCount;

                private EbnDirConfigEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                {
                    super(mib, parent, "ebnDirConfig", "1.3.6.1.2.1.34.7.1.3", false, false, false, false);
                    this.ebnSearchCacheTime = new EbnSearchCacheTimeEnt(mib, this);
                    this.ebnMaxSearchCache = new EbnMaxSearchCacheEnt(mib, this);
                    this.ebnDefaultSubnetVisitCount = new EbnDefaultSubnetVisitCountEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ebnSearchCacheTime,
                        this.ebnMaxSearchCache,
                        this.ebnDefaultSubnetVisitCount
                    };
                }
                public static final class EbnSearchCacheTimeEnt extends MIBEntry<EBNMIBDef>
                {
                    private EbnSearchCacheTimeEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                    {
                        super(mib, parent, "ebnSearchCacheTime", "1.3.6.1.2.1.34.7.1.3.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EbnMaxSearchCacheEnt extends MIBEntry<EBNMIBDef>
                {
                    private EbnMaxSearchCacheEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                    {
                        super(mib, parent, "ebnMaxSearchCache", "1.3.6.1.2.1.34.7.1.3.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EbnDefaultSubnetVisitCountEnt extends MIBEntry<EBNMIBDef>
                {
                    private EbnDefaultSubnetVisitCountEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                    {
                        super(mib, parent, "ebnDefaultSubnetVisitCount", "1.3.6.1.2.1.34.7.1.3.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class EbnCOSEnt extends MIBEntry<EBNMIBDef>
            {
                public final EbnCosMapTableEnt ebnCosMapTable;

                private EbnCOSEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                {
                    super(mib, parent, "ebnCOS", "1.3.6.1.2.1.34.7.1.4", false, false, false, false);
                    this.ebnCosMapTable = new EbnCosMapTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ebnCosMapTable
                    };
                }
                public static final class EbnCosMapTableEnt extends MIBEntry<EBNMIBDef>
                {
                    public final EbnCosMapEntryEnt ebnCosMapEntry;

                    private EbnCosMapTableEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                    {
                        super(mib, parent, "ebnCosMapTable", "1.3.6.1.2.1.34.7.1.4.1", false, true, false, false);
                        this.ebnCosMapEntry = new EbnCosMapEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ebnCosMapEntry
                        };
                    }
                    public static final class EbnCosMapEntryEnt extends MIBEntry<EBNMIBDef>
                    {
                        public final EbnCosMapCpNameEnt ebnCosMapCpName;

                        public final EbnCosMapNonNativeCosEnt ebnCosMapNonNativeCos;

                        public final EbnCosMapNativeCosEnt ebnCosMapNativeCos;

                        private EbnCosMapEntryEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                        {
                            super(mib, parent, "ebnCosMapEntry", "1.3.6.1.2.1.34.7.1.4.1.1", false, false, false, true);
                            this.ebnCosMapCpName = new EbnCosMapCpNameEnt(mib, this);
                            this.ebnCosMapNonNativeCos = new EbnCosMapNonNativeCosEnt(mib, this);
                            this.ebnCosMapNativeCos = new EbnCosMapNativeCosEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ebnCosMapCpName,
                                this.ebnCosMapNonNativeCos,
                                this.ebnCosMapNativeCos
                            };
                        }
                        public static final class EbnCosMapCpNameEnt extends MIBEntry<EBNMIBDef>
                        {
                            private EbnCosMapCpNameEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "ebnCosMapCpName", "1.3.6.1.2.1.34.7.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EbnCosMapNonNativeCosEnt extends MIBEntry<EBNMIBDef>
                        {
                            private EbnCosMapNonNativeCosEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "ebnCosMapNonNativeCos", "1.3.6.1.2.1.34.7.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EbnCosMapNativeCosEnt extends MIBEntry<EBNMIBDef>
                        {
                            private EbnCosMapNativeCosEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "ebnCosMapNativeCos", "1.3.6.1.2.1.34.7.1.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class EbnSubnetRoutingListEnt extends MIBEntry<EBNMIBDef>
            {
                public final EbnSubnetSearchTableEnt ebnSubnetSearchTable;

                /** Border node search table*/
                public final EbnSearchTableEnt ebnSearchTable;

                private EbnSubnetRoutingListEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                {
                    super(mib, parent, "ebnSubnetRoutingList", "1.3.6.1.2.1.34.7.1.5", false, false, false, false);
                    this.ebnSubnetSearchTable = new EbnSubnetSearchTableEnt(mib, this);
                    this.ebnSearchTable = new EbnSearchTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ebnSubnetSearchTable,
                        this.ebnSearchTable
                    };
                }
                public static final class EbnSubnetSearchTableEnt extends MIBEntry<EBNMIBDef>
                {
                    public final EbnSubnetSearchEntryEnt ebnSubnetSearchEntry;

                    private EbnSubnetSearchTableEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                    {
                        super(mib, parent, "ebnSubnetSearchTable", "1.3.6.1.2.1.34.7.1.5.1", false, true, false, false);
                        this.ebnSubnetSearchEntry = new EbnSubnetSearchEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ebnSubnetSearchEntry
                        };
                    }
                    public static final class EbnSubnetSearchEntryEnt extends MIBEntry<EBNMIBDef>
                    {
                        public final EbnSubnetSearchLuNameEnt ebnSubnetSearchLuName;

                        public final EbnSubnetSearchDynamicsEnt ebnSubnetSearchDynamics;

                        public final EbnSubnetSearchOrderingEnt ebnSubnetSearchOrdering;

                        private EbnSubnetSearchEntryEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                        {
                            super(mib, parent, "ebnSubnetSearchEntry", "1.3.6.1.2.1.34.7.1.5.1.1", false, false, false, true);
                            this.ebnSubnetSearchLuName = new EbnSubnetSearchLuNameEnt(mib, this);
                            this.ebnSubnetSearchDynamics = new EbnSubnetSearchDynamicsEnt(mib, this);
                            this.ebnSubnetSearchOrdering = new EbnSubnetSearchOrderingEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ebnSubnetSearchLuName,
                                this.ebnSubnetSearchDynamics,
                                this.ebnSubnetSearchOrdering
                            };
                        }
                        public static final class EbnSubnetSearchLuNameEnt extends MIBEntry<EBNMIBDef>
                        {
                            private EbnSubnetSearchLuNameEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "ebnSubnetSearchLuName", "1.3.6.1.2.1.34.7.1.5.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EbnSubnetSearchDynamicsEnt extends MIBEntry<EBNMIBDef>
                        {
                            private EbnSubnetSearchDynamicsEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "ebnSubnetSearchDynamics", "1.3.6.1.2.1.34.7.1.5.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EbnSubnetSearchOrderingEnt extends MIBEntry<EBNMIBDef>
                        {
                            private EbnSubnetSearchOrderingEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "ebnSubnetSearchOrdering", "1.3.6.1.2.1.34.7.1.5.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class EbnSearchTableEnt extends MIBEntry<EBNMIBDef>
                {
                    public final EbnSearchEntryEnt ebnSearchEntry;

                    private EbnSearchTableEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                    {
                        super(mib, parent, "ebnSearchTable", "1.3.6.1.2.1.34.7.1.5.2", false, true, false, false);
                        this.ebnSearchEntry = new EbnSearchEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ebnSearchEntry
                        };
                    }
                    public static final class EbnSearchEntryEnt extends MIBEntry<EBNMIBDef>
                    {
                        public final EbnSearchLuNameEnt ebnSearchLuName;

                        public final EbnSearchIndexEnt ebnSearchIndex;

                        public final EbnSearchCpNameEnt ebnSearchCpName;

                        public final EbnSearchSNVCEnt ebnSearchSNVC;

                        private EbnSearchEntryEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                        {
                            super(mib, parent, "ebnSearchEntry", "1.3.6.1.2.1.34.7.1.5.2.1", false, false, false, true);
                            this.ebnSearchLuName = new EbnSearchLuNameEnt(mib, this);
                            this.ebnSearchIndex = new EbnSearchIndexEnt(mib, this);
                            this.ebnSearchCpName = new EbnSearchCpNameEnt(mib, this);
                            this.ebnSearchSNVC = new EbnSearchSNVCEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ebnSearchLuName,
                                this.ebnSearchIndex,
                                this.ebnSearchCpName,
                                this.ebnSearchSNVC
                            };
                        }
                        public static final class EbnSearchLuNameEnt extends MIBEntry<EBNMIBDef>
                        {
                            private EbnSearchLuNameEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "ebnSearchLuName", "1.3.6.1.2.1.34.7.1.5.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EbnSearchIndexEnt extends MIBEntry<EBNMIBDef>
                        {
                            private EbnSearchIndexEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "ebnSearchIndex", "1.3.6.1.2.1.34.7.1.5.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EbnSearchCpNameEnt extends MIBEntry<EBNMIBDef>
                        {
                            private EbnSearchCpNameEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "ebnSearchCpName", "1.3.6.1.2.1.34.7.1.5.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EbnSearchSNVCEnt extends MIBEntry<EBNMIBDef>
                        {
                            private EbnSearchSNVCEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "ebnSearchSNVC", "1.3.6.1.2.1.34.7.1.5.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class HbnEnt extends MIBEntry<EBNMIBDef>
            {
                public final HbnIsInTableEnt hbnIsInTable;

                private HbnEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                {
                    super(mib, parent, "hbn", "1.3.6.1.2.1.34.7.1.6", false, false, false, false);
                    this.hbnIsInTable = new HbnIsInTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hbnIsInTable
                    };
                }
                public static final class HbnIsInTableEnt extends MIBEntry<EBNMIBDef>
                {
                    public final HbnIsInEntryEnt hbnIsInEntry;

                    private HbnIsInTableEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                    {
                        super(mib, parent, "hbnIsInTable", "1.3.6.1.2.1.34.7.1.6.1", false, true, false, false);
                        this.hbnIsInEntry = new HbnIsInEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.hbnIsInEntry
                        };
                    }
                    public static final class HbnIsInEntryEnt extends MIBEntry<EBNMIBDef>
                    {
                        public final HbnIsInFqCpNameEnt hbnIsInFqCpName;

                        public final HbnIsInPcidEnt hbnIsInPcid;

                        public final HbnIsInRtpNceIdEnt hbnIsInRtpNceId;

                        public final HbnIsInRtpTcidEnt hbnIsInRtpTcid;

                        private HbnIsInEntryEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                        {
                            super(mib, parent, "hbnIsInEntry", "1.3.6.1.2.1.34.7.1.6.1.1", false, false, false, true);
                            this.hbnIsInFqCpName = new HbnIsInFqCpNameEnt(mib, this);
                            this.hbnIsInPcid = new HbnIsInPcidEnt(mib, this);
                            this.hbnIsInRtpNceId = new HbnIsInRtpNceIdEnt(mib, this);
                            this.hbnIsInRtpTcid = new HbnIsInRtpTcidEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.hbnIsInFqCpName,
                                this.hbnIsInPcid,
                                this.hbnIsInRtpNceId,
                                this.hbnIsInRtpTcid
                            };
                        }
                        public static final class HbnIsInFqCpNameEnt extends MIBEntry<EBNMIBDef>
                        {
                            private HbnIsInFqCpNameEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "hbnIsInFqCpName", "1.3.6.1.2.1.34.7.1.6.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HbnIsInPcidEnt extends MIBEntry<EBNMIBDef>
                        {
                            private HbnIsInPcidEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "hbnIsInPcid", "1.3.6.1.2.1.34.7.1.6.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HbnIsInRtpNceIdEnt extends MIBEntry<EBNMIBDef>
                        {
                            private HbnIsInRtpNceIdEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "hbnIsInRtpNceId", "1.3.6.1.2.1.34.7.1.6.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class HbnIsInRtpTcidEnt extends MIBEntry<EBNMIBDef>
                        {
                            private HbnIsInRtpTcidEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                            {
                                super(mib, parent, "hbnIsInRtpTcid", "1.3.6.1.2.1.34.7.1.6.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class EbnConformanceEnt extends MIBEntry<EBNMIBDef>
        {
            public final EbnCompliancesEnt ebnCompliances;

            public final EbnGroupsEnt ebnGroups;

            private EbnConformanceEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
            {
                super(mib, parent, "ebnConformance", "1.3.6.1.2.1.34.7.2", false, false, false, false);
                this.ebnCompliances = new EbnCompliancesEnt(mib, this);
                this.ebnGroups = new EbnGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ebnCompliances,
                    this.ebnGroups
                };
            }
            public static final class EbnCompliancesEnt extends MIBEntry<EBNMIBDef>
            {
                /** Compliance statements*/
                public final EbnComplianceEnt ebnCompliance;

                private EbnCompliancesEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                {
                    super(mib, parent, "ebnCompliances", "1.3.6.1.2.1.34.7.2.1", false, false, false, false);
                    this.ebnCompliance = new EbnComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ebnCompliance
                    };
                }
                public static final class EbnComplianceEnt extends MIBEntry<EBNMIBDef>
                {
                    private EbnComplianceEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                    {
                        super(mib, parent, "ebnCompliance", "1.3.6.1.2.1.34.7.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class EbnGroupsEnt extends MIBEntry<EBNMIBDef>
            {
                /** Group definitions*/
                public final EbnDirectoryGroupEnt ebnDirectoryGroup;

                public final EbnIsRscvGroupEnt ebnIsRscvGroup;

                public final EbnDirectoryConfigGroupEnt ebnDirectoryConfigGroup;

                public final EbnCosMappingGroupEnt ebnCosMappingGroup;

                public final EbnSubnetRoutingListGroupEnt ebnSubnetRoutingListGroup;

                public final HbnIsInGroupEnt hbnIsInGroup;

                private EbnGroupsEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                {
                    super(mib, parent, "ebnGroups", "1.3.6.1.2.1.34.7.2.2", false, false, false, false);
                    this.ebnDirectoryGroup = new EbnDirectoryGroupEnt(mib, this);
                    this.ebnIsRscvGroup = new EbnIsRscvGroupEnt(mib, this);
                    this.ebnDirectoryConfigGroup = new EbnDirectoryConfigGroupEnt(mib, this);
                    this.ebnCosMappingGroup = new EbnCosMappingGroupEnt(mib, this);
                    this.ebnSubnetRoutingListGroup = new EbnSubnetRoutingListGroupEnt(mib, this);
                    this.hbnIsInGroup = new HbnIsInGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ebnDirectoryGroup,
                        this.ebnIsRscvGroup,
                        this.ebnDirectoryConfigGroup,
                        this.ebnCosMappingGroup,
                        this.ebnSubnetRoutingListGroup,
                        this.hbnIsInGroup
                    };
                }
                public static final class EbnDirectoryGroupEnt extends MIBEntry<EBNMIBDef>
                {
                    private EbnDirectoryGroupEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                    {
                        super(mib, parent, "ebnDirectoryGroup", "1.3.6.1.2.1.34.7.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EbnIsRscvGroupEnt extends MIBEntry<EBNMIBDef>
                {
                    private EbnIsRscvGroupEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                    {
                        super(mib, parent, "ebnIsRscvGroup", "1.3.6.1.2.1.34.7.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EbnDirectoryConfigGroupEnt extends MIBEntry<EBNMIBDef>
                {
                    private EbnDirectoryConfigGroupEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                    {
                        super(mib, parent, "ebnDirectoryConfigGroup", "1.3.6.1.2.1.34.7.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EbnCosMappingGroupEnt extends MIBEntry<EBNMIBDef>
                {
                    private EbnCosMappingGroupEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                    {
                        super(mib, parent, "ebnCosMappingGroup", "1.3.6.1.2.1.34.7.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EbnSubnetRoutingListGroupEnt extends MIBEntry<EBNMIBDef>
                {
                    private EbnSubnetRoutingListGroupEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                    {
                        super(mib, parent, "ebnSubnetRoutingListGroup", "1.3.6.1.2.1.34.7.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HbnIsInGroupEnt extends MIBEntry<EBNMIBDef>
                {
                    private HbnIsInGroupEnt(EBNMIBDef mib, MIBEntry<EBNMIBDef> parent)
                    {
                        super(mib, parent, "hbnIsInGroup", "1.3.6.1.2.1.34.7.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
