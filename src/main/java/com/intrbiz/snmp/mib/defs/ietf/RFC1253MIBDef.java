package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class RFC1253MIBDef extends MIB
{
    public static final RFC1253MIBDef RFC1253MIB = new RFC1253MIBDef();

    static { MIBs.getInstance().registerMIB(RFC1253MIBDef.RFC1253MIB); }

    /** November 10, 2006 00:00:00 EST*/
    public final OspfEnt ospf;

    private RFC1253MIBDef()
    {
        super("RFC1253-MIB");
        this.ospf = new OspfEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ospf
        };
    }

    public static final class OspfEnt extends MIBEntry<RFC1253MIBDef>
    {
        /** OSPF General Variables
Note: These parameters apply globally to the Router'sOSPF Process.*/
        public final OspfGeneralGroupEnt ospfGeneralGroup;

        /** OSPF Area TableThe OSPF Area Table contains informationregarding the various areas.*/
        public final OspfAreaTableEnt ospfAreaTable;

        /** OSPF Area Default Metric Table*/
        public final OspfStubAreaTableEnt ospfStubAreaTable;

        /** OSPF Link State Database*/
        public final OspfLsdbTableEnt ospfLsdbTable;

        /** Address Range Table*/
        public final OspfAreaRangeTableEnt ospfAreaRangeTable;

        /** OSPF Host Table*/
        public final OspfHostTableEnt ospfHostTable;

        /** OSPF Interface Table*/
        public final OspfIfTableEnt ospfIfTable;

        /** OSPF Interface Metric Table*/
        public final OspfIfMetricTableEnt ospfIfMetricTable;

        /** OSPF Virtual Interface Table*/
        public final OspfVirtIfTableEnt ospfVirtIfTable;

        /** OSPF Neighbor Table*/
        public final OspfNbrTableEnt ospfNbrTable;

        /** OSPF Virtual Neighbor Table*/
        public final OspfVirtNbrTableEnt ospfVirtNbrTable;

        private OspfEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
        {
            super(mib, parent, "ospf", "1.3.6.1.2.1.14", false, false, false, false);
            this.ospfGeneralGroup = new OspfGeneralGroupEnt(mib, this);
            this.ospfAreaTable = new OspfAreaTableEnt(mib, this);
            this.ospfStubAreaTable = new OspfStubAreaTableEnt(mib, this);
            this.ospfLsdbTable = new OspfLsdbTableEnt(mib, this);
            this.ospfAreaRangeTable = new OspfAreaRangeTableEnt(mib, this);
            this.ospfHostTable = new OspfHostTableEnt(mib, this);
            this.ospfIfTable = new OspfIfTableEnt(mib, this);
            this.ospfIfMetricTable = new OspfIfMetricTableEnt(mib, this);
            this.ospfVirtIfTable = new OspfVirtIfTableEnt(mib, this);
            this.ospfNbrTable = new OspfNbrTableEnt(mib, this);
            this.ospfVirtNbrTable = new OspfVirtNbrTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ospfGeneralGroup,
                this.ospfAreaTable,
                this.ospfStubAreaTable,
                this.ospfLsdbTable,
                this.ospfAreaRangeTable,
                this.ospfHostTable,
                this.ospfIfTable,
                this.ospfIfMetricTable,
                this.ospfVirtIfTable,
                this.ospfNbrTable,
                this.ospfVirtNbrTable
            };
        }
        public static final class OspfGeneralGroupEnt extends MIBEntry<RFC1253MIBDef>
        {
            public final OspfRouterIdEnt ospfRouterId;

            public final OspfAdminStatEnt ospfAdminStat;

            public final OspfVersionNumberEnt ospfVersionNumber;

            public final OspfAreaBdrRtrStatusEnt ospfAreaBdrRtrStatus;

            public final OspfASBdrRtrStatusEnt ospfASBdrRtrStatus;

            public final OspfExternLsaCountEnt ospfExternLsaCount;

            public final OspfExternLsaCksumSumEnt ospfExternLsaCksumSum;

            public final OspfTOSSupportEnt ospfTOSSupport;

            public final OspfOriginateNewLsasEnt ospfOriginateNewLsas;

            public final OspfRxNewLsasEnt ospfRxNewLsas;

            private OspfGeneralGroupEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
            {
                super(mib, parent, "ospfGeneralGroup", "1.3.6.1.2.1.14.1", false, false, false, false);
                this.ospfRouterId = new OspfRouterIdEnt(mib, this);
                this.ospfAdminStat = new OspfAdminStatEnt(mib, this);
                this.ospfVersionNumber = new OspfVersionNumberEnt(mib, this);
                this.ospfAreaBdrRtrStatus = new OspfAreaBdrRtrStatusEnt(mib, this);
                this.ospfASBdrRtrStatus = new OspfASBdrRtrStatusEnt(mib, this);
                this.ospfExternLsaCount = new OspfExternLsaCountEnt(mib, this);
                this.ospfExternLsaCksumSum = new OspfExternLsaCksumSumEnt(mib, this);
                this.ospfTOSSupport = new OspfTOSSupportEnt(mib, this);
                this.ospfOriginateNewLsas = new OspfOriginateNewLsasEnt(mib, this);
                this.ospfRxNewLsas = new OspfRxNewLsasEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfRouterId,
                    this.ospfAdminStat,
                    this.ospfVersionNumber,
                    this.ospfAreaBdrRtrStatus,
                    this.ospfASBdrRtrStatus,
                    this.ospfExternLsaCount,
                    this.ospfExternLsaCksumSum,
                    this.ospfTOSSupport,
                    this.ospfOriginateNewLsas,
                    this.ospfRxNewLsas
                };
            }
            public static final class OspfRouterIdEnt extends MIBEntry<RFC1253MIBDef>
            {
                private OspfRouterIdEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfRouterId", "1.3.6.1.2.1.14.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfAdminStatEnt extends MIBEntry<RFC1253MIBDef>
            {
                private OspfAdminStatEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfAdminStat", "1.3.6.1.2.1.14.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfVersionNumberEnt extends MIBEntry<RFC1253MIBDef>
            {
                private OspfVersionNumberEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfVersionNumber", "1.3.6.1.2.1.14.1.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfAreaBdrRtrStatusEnt extends MIBEntry<RFC1253MIBDef>
            {
                private OspfAreaBdrRtrStatusEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfAreaBdrRtrStatus", "1.3.6.1.2.1.14.1.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfASBdrRtrStatusEnt extends MIBEntry<RFC1253MIBDef>
            {
                private OspfASBdrRtrStatusEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfASBdrRtrStatus", "1.3.6.1.2.1.14.1.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfExternLsaCountEnt extends MIBEntry<RFC1253MIBDef>
            {
                private OspfExternLsaCountEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfExternLsaCount", "1.3.6.1.2.1.14.1.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfExternLsaCksumSumEnt extends MIBEntry<RFC1253MIBDef>
            {
                private OspfExternLsaCksumSumEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfExternLsaCksumSum", "1.3.6.1.2.1.14.1.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfTOSSupportEnt extends MIBEntry<RFC1253MIBDef>
            {
                private OspfTOSSupportEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfTOSSupport", "1.3.6.1.2.1.14.1.8", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfOriginateNewLsasEnt extends MIBEntry<RFC1253MIBDef>
            {
                private OspfOriginateNewLsasEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfOriginateNewLsas", "1.3.6.1.2.1.14.1.9", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfRxNewLsasEnt extends MIBEntry<RFC1253MIBDef>
            {
                private OspfRxNewLsasEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfRxNewLsas", "1.3.6.1.2.1.14.1.10", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class OspfAreaTableEnt extends MIBEntry<RFC1253MIBDef>
        {
            public final OspfAreaEntryEnt ospfAreaEntry;

            private OspfAreaTableEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
            {
                super(mib, parent, "ospfAreaTable", "1.3.6.1.2.1.14.2", false, true, false, false);
                this.ospfAreaEntry = new OspfAreaEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfAreaEntry
                };
            }
            public static final class OspfAreaEntryEnt extends MIBEntry<RFC1253MIBDef>
            {
                /** read-only since originally
an SMIv1 index*/
                public final OspfAreaIdEnt ospfAreaId;

                /** no authentication, by default*/
                public final OspfAuthTypeEnt ospfAuthType;

                public final OspfImportAsExternEnt ospfImportAsExtern;

                public final OspfSpfRunsEnt ospfSpfRuns;

                public final OspfAreaBdrRtrCountEnt ospfAreaBdrRtrCount;

                public final OspfAsBdrRtrCountEnt ospfAsBdrRtrCount;

                public final OspfAreaLsaCountEnt ospfAreaLsaCount;

                public final OspfAreaLsaCksumSumEnt ospfAreaLsaCksumSum;

                private OspfAreaEntryEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfAreaEntry", "1.3.6.1.2.1.14.2.1", false, false, false, true);
                    this.ospfAreaId = new OspfAreaIdEnt(mib, this);
                    this.ospfAuthType = new OspfAuthTypeEnt(mib, this);
                    this.ospfImportAsExtern = new OspfImportAsExternEnt(mib, this);
                    this.ospfSpfRuns = new OspfSpfRunsEnt(mib, this);
                    this.ospfAreaBdrRtrCount = new OspfAreaBdrRtrCountEnt(mib, this);
                    this.ospfAsBdrRtrCount = new OspfAsBdrRtrCountEnt(mib, this);
                    this.ospfAreaLsaCount = new OspfAreaLsaCountEnt(mib, this);
                    this.ospfAreaLsaCksumSum = new OspfAreaLsaCksumSumEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfAreaId,
                        this.ospfAuthType,
                        this.ospfImportAsExtern,
                        this.ospfSpfRuns,
                        this.ospfAreaBdrRtrCount,
                        this.ospfAsBdrRtrCount,
                        this.ospfAreaLsaCount,
                        this.ospfAreaLsaCksumSum
                    };
                }
                public static final class OspfAreaIdEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfAreaIdEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaId", "1.3.6.1.2.1.14.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAuthTypeEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfAuthTypeEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfAuthType", "1.3.6.1.2.1.14.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfImportAsExternEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfImportAsExternEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfImportAsExtern", "1.3.6.1.2.1.14.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfSpfRunsEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfSpfRunsEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfSpfRuns", "1.3.6.1.2.1.14.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaBdrRtrCountEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfAreaBdrRtrCountEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaBdrRtrCount", "1.3.6.1.2.1.14.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAsBdrRtrCountEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfAsBdrRtrCountEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfAsBdrRtrCount", "1.3.6.1.2.1.14.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaLsaCountEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfAreaLsaCountEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaLsaCount", "1.3.6.1.2.1.14.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaLsaCksumSumEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfAreaLsaCksumSumEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaLsaCksumSum", "1.3.6.1.2.1.14.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfStubAreaTableEnt extends MIBEntry<RFC1253MIBDef>
        {
            public final OspfStubAreaEntryEnt ospfStubAreaEntry;

            private OspfStubAreaTableEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
            {
                super(mib, parent, "ospfStubAreaTable", "1.3.6.1.2.1.14.3", false, true, false, false);
                this.ospfStubAreaEntry = new OspfStubAreaEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfStubAreaEntry
                };
            }
            public static final class OspfStubAreaEntryEnt extends MIBEntry<RFC1253MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final OspfStubAreaIdEnt ospfStubAreaId;

                /** read-only since originally an
SMIv1 index*/
                public final OspfStubTOSEnt ospfStubTOS;

                public final OspfStubMetricEnt ospfStubMetric;

                public final OspfStubStatusEnt ospfStubStatus;

                private OspfStubAreaEntryEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfStubAreaEntry", "1.3.6.1.2.1.14.3.1", false, false, false, true);
                    this.ospfStubAreaId = new OspfStubAreaIdEnt(mib, this);
                    this.ospfStubTOS = new OspfStubTOSEnt(mib, this);
                    this.ospfStubMetric = new OspfStubMetricEnt(mib, this);
                    this.ospfStubStatus = new OspfStubStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfStubAreaId,
                        this.ospfStubTOS,
                        this.ospfStubMetric,
                        this.ospfStubStatus
                    };
                }
                public static final class OspfStubAreaIdEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfStubAreaIdEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfStubAreaId", "1.3.6.1.2.1.14.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfStubTOSEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfStubTOSEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfStubTOS", "1.3.6.1.2.1.14.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfStubMetricEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfStubMetricEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfStubMetric", "1.3.6.1.2.1.14.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfStubStatusEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfStubStatusEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfStubStatus", "1.3.6.1.2.1.14.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfLsdbTableEnt extends MIBEntry<RFC1253MIBDef>
        {
            public final OspfLsdbEntryEnt ospfLsdbEntry;

            private OspfLsdbTableEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
            {
                super(mib, parent, "ospfLsdbTable", "1.3.6.1.2.1.14.4", false, true, false, false);
                this.ospfLsdbEntry = new OspfLsdbEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfLsdbEntry
                };
            }
            public static final class OspfLsdbEntryEnt extends MIBEntry<RFC1253MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final OspfLsdbAreaIdEnt ospfLsdbAreaId;

                /** read-only since originally an
SMIv1 index*/
                public final OspfLsdbTypeEnt ospfLsdbType;

                /** read-only since originally an
SMIv1 index*/
                public final OspfLsdbLsidEnt ospfLsdbLsid;

                /** read-only since originally an
SMIv1 index*/
                public final OspfLsdbRouterIdEnt ospfLsdbRouterId;

                public final OspfLsdbSequenceEnt ospfLsdbSequence;

                public final OspfLsdbAgeEnt ospfLsdbAge;

                public final OspfLsdbChecksumEnt ospfLsdbChecksum;

                public final OspfLsdbAdvertisementEnt ospfLsdbAdvertisement;

                private OspfLsdbEntryEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfLsdbEntry", "1.3.6.1.2.1.14.4.1", false, false, false, true);
                    this.ospfLsdbAreaId = new OspfLsdbAreaIdEnt(mib, this);
                    this.ospfLsdbType = new OspfLsdbTypeEnt(mib, this);
                    this.ospfLsdbLsid = new OspfLsdbLsidEnt(mib, this);
                    this.ospfLsdbRouterId = new OspfLsdbRouterIdEnt(mib, this);
                    this.ospfLsdbSequence = new OspfLsdbSequenceEnt(mib, this);
                    this.ospfLsdbAge = new OspfLsdbAgeEnt(mib, this);
                    this.ospfLsdbChecksum = new OspfLsdbChecksumEnt(mib, this);
                    this.ospfLsdbAdvertisement = new OspfLsdbAdvertisementEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfLsdbAreaId,
                        this.ospfLsdbType,
                        this.ospfLsdbLsid,
                        this.ospfLsdbRouterId,
                        this.ospfLsdbSequence,
                        this.ospfLsdbAge,
                        this.ospfLsdbChecksum,
                        this.ospfLsdbAdvertisement
                    };
                }
                public static final class OspfLsdbAreaIdEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfLsdbAreaIdEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfLsdbAreaId", "1.3.6.1.2.1.14.4.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLsdbTypeEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfLsdbTypeEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfLsdbType", "1.3.6.1.2.1.14.4.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLsdbLsidEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfLsdbLsidEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfLsdbLsid", "1.3.6.1.2.1.14.4.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLsdbRouterIdEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfLsdbRouterIdEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfLsdbRouterId", "1.3.6.1.2.1.14.4.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLsdbSequenceEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfLsdbSequenceEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfLsdbSequence", "1.3.6.1.2.1.14.4.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLsdbAgeEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfLsdbAgeEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfLsdbAge", "1.3.6.1.2.1.14.4.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLsdbChecksumEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfLsdbChecksumEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfLsdbChecksum", "1.3.6.1.2.1.14.4.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLsdbAdvertisementEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfLsdbAdvertisementEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfLsdbAdvertisement", "1.3.6.1.2.1.14.4.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfAreaRangeTableEnt extends MIBEntry<RFC1253MIBDef>
        {
            public final OspfAreaRangeEntryEnt ospfAreaRangeEntry;

            private OspfAreaRangeTableEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
            {
                super(mib, parent, "ospfAreaRangeTable", "1.3.6.1.2.1.14.5", false, true, false, false);
                this.ospfAreaRangeEntry = new OspfAreaRangeEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfAreaRangeEntry
                };
            }
            public static final class OspfAreaRangeEntryEnt extends MIBEntry<RFC1253MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final OspfAreaRangeAreaIdEnt ospfAreaRangeAreaId;

                /** read-only since originally an
SMIv1 index*/
                public final OspfAreaRangeNetEnt ospfAreaRangeNet;

                public final OspfAreaRangeMaskEnt ospfAreaRangeMask;

                public final OspfAreaRangeStatusEnt ospfAreaRangeStatus;

                private OspfAreaRangeEntryEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfAreaRangeEntry", "1.3.6.1.2.1.14.5.1", false, false, false, true);
                    this.ospfAreaRangeAreaId = new OspfAreaRangeAreaIdEnt(mib, this);
                    this.ospfAreaRangeNet = new OspfAreaRangeNetEnt(mib, this);
                    this.ospfAreaRangeMask = new OspfAreaRangeMaskEnt(mib, this);
                    this.ospfAreaRangeStatus = new OspfAreaRangeStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfAreaRangeAreaId,
                        this.ospfAreaRangeNet,
                        this.ospfAreaRangeMask,
                        this.ospfAreaRangeStatus
                    };
                }
                public static final class OspfAreaRangeAreaIdEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfAreaRangeAreaIdEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaRangeAreaId", "1.3.6.1.2.1.14.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaRangeNetEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfAreaRangeNetEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaRangeNet", "1.3.6.1.2.1.14.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaRangeMaskEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfAreaRangeMaskEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaRangeMask", "1.3.6.1.2.1.14.5.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaRangeStatusEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfAreaRangeStatusEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaRangeStatus", "1.3.6.1.2.1.14.5.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfHostTableEnt extends MIBEntry<RFC1253MIBDef>
        {
            public final OspfHostEntryEnt ospfHostEntry;

            private OspfHostTableEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
            {
                super(mib, parent, "ospfHostTable", "1.3.6.1.2.1.14.6", false, true, false, false);
                this.ospfHostEntry = new OspfHostEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfHostEntry
                };
            }
            public static final class OspfHostEntryEnt extends MIBEntry<RFC1253MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final OspfHostIpAddressEnt ospfHostIpAddress;

                /** read-only since originally an
SMIv1 index*/
                public final OspfHostTOSEnt ospfHostTOS;

                public final OspfHostMetricEnt ospfHostMetric;

                public final OspfHostStatusEnt ospfHostStatus;

                private OspfHostEntryEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfHostEntry", "1.3.6.1.2.1.14.6.1", false, false, false, true);
                    this.ospfHostIpAddress = new OspfHostIpAddressEnt(mib, this);
                    this.ospfHostTOS = new OspfHostTOSEnt(mib, this);
                    this.ospfHostMetric = new OspfHostMetricEnt(mib, this);
                    this.ospfHostStatus = new OspfHostStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfHostIpAddress,
                        this.ospfHostTOS,
                        this.ospfHostMetric,
                        this.ospfHostStatus
                    };
                }
                public static final class OspfHostIpAddressEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfHostIpAddressEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfHostIpAddress", "1.3.6.1.2.1.14.6.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfHostTOSEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfHostTOSEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfHostTOS", "1.3.6.1.2.1.14.6.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfHostMetricEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfHostMetricEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfHostMetric", "1.3.6.1.2.1.14.6.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfHostStatusEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfHostStatusEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfHostStatus", "1.3.6.1.2.1.14.6.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfIfTableEnt extends MIBEntry<RFC1253MIBDef>
        {
            public final OspfIfEntryEnt ospfIfEntry;

            private OspfIfTableEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
            {
                super(mib, parent, "ospfIfTable", "1.3.6.1.2.1.14.7", false, true, false, false);
                this.ospfIfEntry = new OspfIfEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfIfEntry
                };
            }
            public static final class OspfIfEntryEnt extends MIBEntry<RFC1253MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final OspfIfIpAddressEnt ospfIfIpAddress;

                /** read-only since originally an
SMIv1 index*/
                public final OspfAddressLessIfEnt ospfAddressLessIf;

                /** 0.0.0.0*/
                public final OspfIfAreaIdEnt ospfIfAreaId;

                public final OspfIfTypeEnt ospfIfType;

                public final OspfIfAdminStatEnt ospfIfAdminStat;

                public final OspfIfRtrPriorityEnt ospfIfRtrPriority;

                public final OspfIfTransitDelayEnt ospfIfTransitDelay;

                public final OspfIfRetransIntervalEnt ospfIfRetransInterval;

                public final OspfIfHelloIntervalEnt ospfIfHelloInterval;

                public final OspfIfRtrDeadIntervalEnt ospfIfRtrDeadInterval;

                public final OspfIfPollIntervalEnt ospfIfPollInterval;

                public final OspfIfStateEnt ospfIfState;

                /** 0.0.0.0*/
                public final OspfIfDesignatedRouterEnt ospfIfDesignatedRouter;

                /** 0.0.0.0*/
                public final OspfIfBackupDesignatedRouterEnt ospfIfBackupDesignatedRouter;

                public final OspfIfEventsEnt ospfIfEvents;

                /** 0.0.0.0.0.0.0.0*/
                public final OspfIfAuthKeyEnt ospfIfAuthKey;

                private OspfIfEntryEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfIfEntry", "1.3.6.1.2.1.14.7.1", false, false, false, true);
                    this.ospfIfIpAddress = new OspfIfIpAddressEnt(mib, this);
                    this.ospfAddressLessIf = new OspfAddressLessIfEnt(mib, this);
                    this.ospfIfAreaId = new OspfIfAreaIdEnt(mib, this);
                    this.ospfIfType = new OspfIfTypeEnt(mib, this);
                    this.ospfIfAdminStat = new OspfIfAdminStatEnt(mib, this);
                    this.ospfIfRtrPriority = new OspfIfRtrPriorityEnt(mib, this);
                    this.ospfIfTransitDelay = new OspfIfTransitDelayEnt(mib, this);
                    this.ospfIfRetransInterval = new OspfIfRetransIntervalEnt(mib, this);
                    this.ospfIfHelloInterval = new OspfIfHelloIntervalEnt(mib, this);
                    this.ospfIfRtrDeadInterval = new OspfIfRtrDeadIntervalEnt(mib, this);
                    this.ospfIfPollInterval = new OspfIfPollIntervalEnt(mib, this);
                    this.ospfIfState = new OspfIfStateEnt(mib, this);
                    this.ospfIfDesignatedRouter = new OspfIfDesignatedRouterEnt(mib, this);
                    this.ospfIfBackupDesignatedRouter = new OspfIfBackupDesignatedRouterEnt(mib, this);
                    this.ospfIfEvents = new OspfIfEventsEnt(mib, this);
                    this.ospfIfAuthKey = new OspfIfAuthKeyEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfIfIpAddress,
                        this.ospfAddressLessIf,
                        this.ospfIfAreaId,
                        this.ospfIfType,
                        this.ospfIfAdminStat,
                        this.ospfIfRtrPriority,
                        this.ospfIfTransitDelay,
                        this.ospfIfRetransInterval,
                        this.ospfIfHelloInterval,
                        this.ospfIfRtrDeadInterval,
                        this.ospfIfPollInterval,
                        this.ospfIfState,
                        this.ospfIfDesignatedRouter,
                        this.ospfIfBackupDesignatedRouter,
                        this.ospfIfEvents,
                        this.ospfIfAuthKey
                    };
                }
                public static final class OspfIfIpAddressEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfIpAddressEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfIpAddress", "1.3.6.1.2.1.14.7.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAddressLessIfEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfAddressLessIfEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfAddressLessIf", "1.3.6.1.2.1.14.7.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfAreaIdEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfAreaIdEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfAreaId", "1.3.6.1.2.1.14.7.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfTypeEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfTypeEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfType", "1.3.6.1.2.1.14.7.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfAdminStatEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfAdminStatEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfAdminStat", "1.3.6.1.2.1.14.7.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfRtrPriorityEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfRtrPriorityEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfRtrPriority", "1.3.6.1.2.1.14.7.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfTransitDelayEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfTransitDelayEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfTransitDelay", "1.3.6.1.2.1.14.7.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfRetransIntervalEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfRetransIntervalEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfRetransInterval", "1.3.6.1.2.1.14.7.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfHelloIntervalEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfHelloIntervalEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfHelloInterval", "1.3.6.1.2.1.14.7.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfRtrDeadIntervalEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfRtrDeadIntervalEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfRtrDeadInterval", "1.3.6.1.2.1.14.7.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfPollIntervalEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfPollIntervalEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfPollInterval", "1.3.6.1.2.1.14.7.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfStateEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfStateEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfState", "1.3.6.1.2.1.14.7.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfDesignatedRouterEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfDesignatedRouterEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfDesignatedRouter", "1.3.6.1.2.1.14.7.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfBackupDesignatedRouterEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfBackupDesignatedRouterEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfBackupDesignatedRouter", "1.3.6.1.2.1.14.7.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfEventsEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfEventsEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfEvents", "1.3.6.1.2.1.14.7.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfAuthKeyEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfAuthKeyEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfAuthKey", "1.3.6.1.2.1.14.7.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfIfMetricTableEnt extends MIBEntry<RFC1253MIBDef>
        {
            public final OspfIfMetricEntryEnt ospfIfMetricEntry;

            private OspfIfMetricTableEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
            {
                super(mib, parent, "ospfIfMetricTable", "1.3.6.1.2.1.14.8", false, true, false, false);
                this.ospfIfMetricEntry = new OspfIfMetricEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfIfMetricEntry
                };
            }
            public static final class OspfIfMetricEntryEnt extends MIBEntry<RFC1253MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final OspfIfMetricIpAddressEnt ospfIfMetricIpAddress;

                /** read-only since originally an
SMIv1 index*/
                public final OspfIfMetricAddressLessIfEnt ospfIfMetricAddressLessIf;

                /** read-only since originally an
SMIv1 index*/
                public final OspfIfMetricTOSEnt ospfIfMetricTOS;

                public final OspfIfMetricValueEnt ospfIfMetricValue;

                public final OspfIfMetricStatusEnt ospfIfMetricStatus;

                private OspfIfMetricEntryEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfIfMetricEntry", "1.3.6.1.2.1.14.8.1", false, false, false, true);
                    this.ospfIfMetricIpAddress = new OspfIfMetricIpAddressEnt(mib, this);
                    this.ospfIfMetricAddressLessIf = new OspfIfMetricAddressLessIfEnt(mib, this);
                    this.ospfIfMetricTOS = new OspfIfMetricTOSEnt(mib, this);
                    this.ospfIfMetricValue = new OspfIfMetricValueEnt(mib, this);
                    this.ospfIfMetricStatus = new OspfIfMetricStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfIfMetricIpAddress,
                        this.ospfIfMetricAddressLessIf,
                        this.ospfIfMetricTOS,
                        this.ospfIfMetricValue,
                        this.ospfIfMetricStatus
                    };
                }
                public static final class OspfIfMetricIpAddressEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfMetricIpAddressEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfMetricIpAddress", "1.3.6.1.2.1.14.8.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfMetricAddressLessIfEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfMetricAddressLessIfEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfMetricAddressLessIf", "1.3.6.1.2.1.14.8.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfMetricTOSEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfMetricTOSEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfMetricTOS", "1.3.6.1.2.1.14.8.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfMetricValueEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfMetricValueEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfMetricValue", "1.3.6.1.2.1.14.8.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfMetricStatusEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfIfMetricStatusEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfIfMetricStatus", "1.3.6.1.2.1.14.8.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfVirtIfTableEnt extends MIBEntry<RFC1253MIBDef>
        {
            public final OspfVirtIfEntryEnt ospfVirtIfEntry;

            private OspfVirtIfTableEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
            {
                super(mib, parent, "ospfVirtIfTable", "1.3.6.1.2.1.14.9", false, true, false, false);
                this.ospfVirtIfEntry = new OspfVirtIfEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfVirtIfEntry
                };
            }
            public static final class OspfVirtIfEntryEnt extends MIBEntry<RFC1253MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final OspfVirtIfAreaIdEnt ospfVirtIfAreaId;

                /** read-only since originally an
SMIv1 index*/
                public final OspfVirtIfNeighborEnt ospfVirtIfNeighbor;

                public final OspfVirtIfTransitDelayEnt ospfVirtIfTransitDelay;

                public final OspfVirtIfRetransIntervalEnt ospfVirtIfRetransInterval;

                public final OspfVirtIfHelloIntervalEnt ospfVirtIfHelloInterval;

                public final OspfVirtIfRtrDeadIntervalEnt ospfVirtIfRtrDeadInterval;

                public final OspfVirtIfStateEnt ospfVirtIfState;

                public final OspfVirtIfEventsEnt ospfVirtIfEvents;

                /** 0.0.0.0.0.0.0.0*/
                public final OspfVirtIfAuthKeyEnt ospfVirtIfAuthKey;

                public final OspfVirtIfStatusEnt ospfVirtIfStatus;

                private OspfVirtIfEntryEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfVirtIfEntry", "1.3.6.1.2.1.14.9.1", false, false, false, true);
                    this.ospfVirtIfAreaId = new OspfVirtIfAreaIdEnt(mib, this);
                    this.ospfVirtIfNeighbor = new OspfVirtIfNeighborEnt(mib, this);
                    this.ospfVirtIfTransitDelay = new OspfVirtIfTransitDelayEnt(mib, this);
                    this.ospfVirtIfRetransInterval = new OspfVirtIfRetransIntervalEnt(mib, this);
                    this.ospfVirtIfHelloInterval = new OspfVirtIfHelloIntervalEnt(mib, this);
                    this.ospfVirtIfRtrDeadInterval = new OspfVirtIfRtrDeadIntervalEnt(mib, this);
                    this.ospfVirtIfState = new OspfVirtIfStateEnt(mib, this);
                    this.ospfVirtIfEvents = new OspfVirtIfEventsEnt(mib, this);
                    this.ospfVirtIfAuthKey = new OspfVirtIfAuthKeyEnt(mib, this);
                    this.ospfVirtIfStatus = new OspfVirtIfStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfVirtIfAreaId,
                        this.ospfVirtIfNeighbor,
                        this.ospfVirtIfTransitDelay,
                        this.ospfVirtIfRetransInterval,
                        this.ospfVirtIfHelloInterval,
                        this.ospfVirtIfRtrDeadInterval,
                        this.ospfVirtIfState,
                        this.ospfVirtIfEvents,
                        this.ospfVirtIfAuthKey,
                        this.ospfVirtIfStatus
                    };
                }
                public static final class OspfVirtIfAreaIdEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfVirtIfAreaIdEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfAreaId", "1.3.6.1.2.1.14.9.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfNeighborEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfVirtIfNeighborEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfNeighbor", "1.3.6.1.2.1.14.9.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfTransitDelayEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfVirtIfTransitDelayEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfTransitDelay", "1.3.6.1.2.1.14.9.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfRetransIntervalEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfVirtIfRetransIntervalEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfRetransInterval", "1.3.6.1.2.1.14.9.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfHelloIntervalEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfVirtIfHelloIntervalEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfHelloInterval", "1.3.6.1.2.1.14.9.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfRtrDeadIntervalEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfVirtIfRtrDeadIntervalEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfRtrDeadInterval", "1.3.6.1.2.1.14.9.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfStateEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfVirtIfStateEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfState", "1.3.6.1.2.1.14.9.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfEventsEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfVirtIfEventsEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfEvents", "1.3.6.1.2.1.14.9.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfAuthKeyEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfVirtIfAuthKeyEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfAuthKey", "1.3.6.1.2.1.14.9.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfStatusEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfVirtIfStatusEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfStatus", "1.3.6.1.2.1.14.9.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfNbrTableEnt extends MIBEntry<RFC1253MIBDef>
        {
            public final OspfNbrEntryEnt ospfNbrEntry;

            private OspfNbrTableEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
            {
                super(mib, parent, "ospfNbrTable", "1.3.6.1.2.1.14.10", false, true, false, false);
                this.ospfNbrEntry = new OspfNbrEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfNbrEntry
                };
            }
            public static final class OspfNbrEntryEnt extends MIBEntry<RFC1253MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final OspfNbrIpAddrEnt ospfNbrIpAddr;

                /** read-only since originally an
SMIv1 index*/
                public final OspfNbrAddressLessIndexEnt ospfNbrAddressLessIndex;

                /** 0.0.0.0*/
                public final OspfNbrRtrIdEnt ospfNbrRtrId;

                public final OspfNbrOptionsEnt ospfNbrOptions;

                public final OspfNbrPriorityEnt ospfNbrPriority;

                public final OspfNbrStateEnt ospfNbrState;

                public final OspfNbrEventsEnt ospfNbrEvents;

                public final OspfNbrLsRetransQLenEnt ospfNbrLsRetransQLen;

                public final OspfNbmaNbrStatusEnt ospfNbmaNbrStatus;

                private OspfNbrEntryEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfNbrEntry", "1.3.6.1.2.1.14.10.1", false, false, false, true);
                    this.ospfNbrIpAddr = new OspfNbrIpAddrEnt(mib, this);
                    this.ospfNbrAddressLessIndex = new OspfNbrAddressLessIndexEnt(mib, this);
                    this.ospfNbrRtrId = new OspfNbrRtrIdEnt(mib, this);
                    this.ospfNbrOptions = new OspfNbrOptionsEnt(mib, this);
                    this.ospfNbrPriority = new OspfNbrPriorityEnt(mib, this);
                    this.ospfNbrState = new OspfNbrStateEnt(mib, this);
                    this.ospfNbrEvents = new OspfNbrEventsEnt(mib, this);
                    this.ospfNbrLsRetransQLen = new OspfNbrLsRetransQLenEnt(mib, this);
                    this.ospfNbmaNbrStatus = new OspfNbmaNbrStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfNbrIpAddr,
                        this.ospfNbrAddressLessIndex,
                        this.ospfNbrRtrId,
                        this.ospfNbrOptions,
                        this.ospfNbrPriority,
                        this.ospfNbrState,
                        this.ospfNbrEvents,
                        this.ospfNbrLsRetransQLen,
                        this.ospfNbmaNbrStatus
                    };
                }
                public static final class OspfNbrIpAddrEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfNbrIpAddrEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrIpAddr", "1.3.6.1.2.1.14.10.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrAddressLessIndexEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfNbrAddressLessIndexEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrAddressLessIndex", "1.3.6.1.2.1.14.10.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrRtrIdEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfNbrRtrIdEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrRtrId", "1.3.6.1.2.1.14.10.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrOptionsEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfNbrOptionsEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrOptions", "1.3.6.1.2.1.14.10.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrPriorityEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfNbrPriorityEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrPriority", "1.3.6.1.2.1.14.10.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrStateEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfNbrStateEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrState", "1.3.6.1.2.1.14.10.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrEventsEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfNbrEventsEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrEvents", "1.3.6.1.2.1.14.10.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrLsRetransQLenEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfNbrLsRetransQLenEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrLsRetransQLen", "1.3.6.1.2.1.14.10.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbmaNbrStatusEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfNbmaNbrStatusEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfNbmaNbrStatus", "1.3.6.1.2.1.14.10.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfVirtNbrTableEnt extends MIBEntry<RFC1253MIBDef>
        {
            public final OspfVirtNbrEntryEnt ospfVirtNbrEntry;

            private OspfVirtNbrTableEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
            {
                super(mib, parent, "ospfVirtNbrTable", "1.3.6.1.2.1.14.11", false, true, false, false);
                this.ospfVirtNbrEntry = new OspfVirtNbrEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfVirtNbrEntry
                };
            }
            public static final class OspfVirtNbrEntryEnt extends MIBEntry<RFC1253MIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final OspfVirtNbrAreaEnt ospfVirtNbrArea;

                /** read-only since originally an
SMIv1 index*/
                public final OspfVirtNbrRtrIdEnt ospfVirtNbrRtrId;

                public final OspfVirtNbrIpAddrEnt ospfVirtNbrIpAddr;

                public final OspfVirtNbrOptionsEnt ospfVirtNbrOptions;

                public final OspfVirtNbrStateEnt ospfVirtNbrState;

                public final OspfVirtNbrEventsEnt ospfVirtNbrEvents;

                public final OspfVirtNbrLsRetransQLenEnt ospfVirtNbrLsRetransQLen;

                private OspfVirtNbrEntryEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                {
                    super(mib, parent, "ospfVirtNbrEntry", "1.3.6.1.2.1.14.11.1", false, false, false, true);
                    this.ospfVirtNbrArea = new OspfVirtNbrAreaEnt(mib, this);
                    this.ospfVirtNbrRtrId = new OspfVirtNbrRtrIdEnt(mib, this);
                    this.ospfVirtNbrIpAddr = new OspfVirtNbrIpAddrEnt(mib, this);
                    this.ospfVirtNbrOptions = new OspfVirtNbrOptionsEnt(mib, this);
                    this.ospfVirtNbrState = new OspfVirtNbrStateEnt(mib, this);
                    this.ospfVirtNbrEvents = new OspfVirtNbrEventsEnt(mib, this);
                    this.ospfVirtNbrLsRetransQLen = new OspfVirtNbrLsRetransQLenEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfVirtNbrArea,
                        this.ospfVirtNbrRtrId,
                        this.ospfVirtNbrIpAddr,
                        this.ospfVirtNbrOptions,
                        this.ospfVirtNbrState,
                        this.ospfVirtNbrEvents,
                        this.ospfVirtNbrLsRetransQLen
                    };
                }
                public static final class OspfVirtNbrAreaEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfVirtNbrAreaEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrArea", "1.3.6.1.2.1.14.11.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrRtrIdEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfVirtNbrRtrIdEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrRtrId", "1.3.6.1.2.1.14.11.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrIpAddrEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfVirtNbrIpAddrEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrIpAddr", "1.3.6.1.2.1.14.11.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrOptionsEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfVirtNbrOptionsEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrOptions", "1.3.6.1.2.1.14.11.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrStateEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfVirtNbrStateEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrState", "1.3.6.1.2.1.14.11.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrEventsEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfVirtNbrEventsEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrEvents", "1.3.6.1.2.1.14.11.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrLsRetransQLenEnt extends MIBEntry<RFC1253MIBDef>
                {
                    private OspfVirtNbrLsRetransQLenEnt(RFC1253MIBDef mib, MIBEntry<RFC1253MIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrLsRetransQLen", "1.3.6.1.2.1.14.11.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
