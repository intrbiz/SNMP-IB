package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class OSPFMIBDef extends MIB
{
    public static final OSPFMIBDef OSPFMIB = new OSPFMIBDef();

    /** November 10, 2006 00:00:00 EST*/
    public final OspfEnt ospf;

    private OSPFMIBDef()
    {
        super("OSPF-MIB");
        this.ospf = new OspfEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ospf
        };
    }

    public static final class OspfEnt extends MIBEntry<OSPFMIBDef>
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

        /** OSPF Link State Database, External*/
        public final OspfExtLsdbTableEnt ospfExtLsdbTable;

        /** OSPF Use of the CIDR Route Table*/
        public final OspfRouteGroupEnt ospfRouteGroup;

        /** ipCidrRouteMetric1 is, by definition, the primary routingmetric.  Therefore, it should be the metric that routeselection is based on.  For intra-area and inter-area routes,it is an OSPF metric.  For External Type 1 (comparable value)routes, it is an OSPF metric plus the External Metric.  Forexternal Type 2 (non-comparable value) routes, it is theexternal metric.
ipCidrRouteMetric2 is, by definition, a secondary routingmetric.  Therefore, it should be the metric that breaks a tieamong routes having equal metric1 values and the samecalculation rule.  For intra-area, inter-area routes, andExternal Type 1 (comparable value) routes, it is unused.  ForExternal Type 2 (non-comparable value) routes, it is the metricto the AS border router.
ipCidrRouteMetric3, ipCidrRouteMetric4, and ipCidrRouteMetric5are unused.
The OSPF Area Aggregate TableThis table replaces the OSPF Area Summary Table, being anextension of that for CIDR routers.*/
        public final OspfAreaAggregateTableEnt ospfAreaAggregateTable;

        /** OSPF Link State Database, link-local for non-virtual links*/
        public final OspfLocalLsdbTableEnt ospfLocalLsdbTable;

        /** OSPF Link State Database, link-local for virtual Links*/
        public final OspfVirtLocalLsdbTableEnt ospfVirtLocalLsdbTable;

        /** OSPF Link State Database, AS-scope*/
        public final OspfAsLsdbTableEnt ospfAsLsdbTable;

        /** OSPF Area LSA Counter Table*/
        public final OspfAreaLsaCountTableEnt ospfAreaLsaCountTable;

        /** conformance information*/
        public final OspfConformanceEnt ospfConformance;

        private OspfEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
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
            this.ospfExtLsdbTable = new OspfExtLsdbTableEnt(mib, this);
            this.ospfRouteGroup = new OspfRouteGroupEnt(mib, this);
            this.ospfAreaAggregateTable = new OspfAreaAggregateTableEnt(mib, this);
            this.ospfLocalLsdbTable = new OspfLocalLsdbTableEnt(mib, this);
            this.ospfVirtLocalLsdbTable = new OspfVirtLocalLsdbTableEnt(mib, this);
            this.ospfAsLsdbTable = new OspfAsLsdbTableEnt(mib, this);
            this.ospfAreaLsaCountTable = new OspfAreaLsaCountTableEnt(mib, this);
            this.ospfConformance = new OspfConformanceEnt(mib, this);
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
                this.ospfVirtNbrTable,
                this.ospfExtLsdbTable,
                this.ospfRouteGroup,
                this.ospfAreaAggregateTable,
                this.ospfLocalLsdbTable,
                this.ospfVirtLocalLsdbTable,
                this.ospfAsLsdbTable,
                this.ospfAreaLsaCountTable,
                this.ospfConformance
            };
        }
        public static final class OspfGeneralGroupEnt extends MIBEntry<OSPFMIBDef>
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

            public final OspfExtLsdbLimitEnt ospfExtLsdbLimit;

            public final OspfMulticastExtensionsEnt ospfMulticastExtensions;

            public final OspfExitOverflowIntervalEnt ospfExitOverflowInterval;

            public final OspfDemandExtensionsEnt ospfDemandExtensions;

            public final OspfRFC1583CompatibilityEnt ospfRFC1583Compatibility;

            public final OspfOpaqueLsaSupportEnt ospfOpaqueLsaSupport;

            public final OspfReferenceBandwidthEnt ospfReferenceBandwidth;

            public final OspfRestartSupportEnt ospfRestartSupport;

            public final OspfRestartIntervalEnt ospfRestartInterval;

            public final OspfRestartStrictLsaCheckingEnt ospfRestartStrictLsaChecking;

            public final OspfRestartStatusEnt ospfRestartStatus;

            public final OspfRestartAgeEnt ospfRestartAge;

            public final OspfRestartExitReasonEnt ospfRestartExitReason;

            public final OspfAsLsaCountEnt ospfAsLsaCount;

            public final OspfAsLsaCksumSumEnt ospfAsLsaCksumSum;

            public final OspfStubRouterSupportEnt ospfStubRouterSupport;

            public final OspfStubRouterAdvertisementEnt ospfStubRouterAdvertisement;

            public final OspfDiscontinuityTimeEnt ospfDiscontinuityTime;

            private OspfGeneralGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
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
                this.ospfExtLsdbLimit = new OspfExtLsdbLimitEnt(mib, this);
                this.ospfMulticastExtensions = new OspfMulticastExtensionsEnt(mib, this);
                this.ospfExitOverflowInterval = new OspfExitOverflowIntervalEnt(mib, this);
                this.ospfDemandExtensions = new OspfDemandExtensionsEnt(mib, this);
                this.ospfRFC1583Compatibility = new OspfRFC1583CompatibilityEnt(mib, this);
                this.ospfOpaqueLsaSupport = new OspfOpaqueLsaSupportEnt(mib, this);
                this.ospfReferenceBandwidth = new OspfReferenceBandwidthEnt(mib, this);
                this.ospfRestartSupport = new OspfRestartSupportEnt(mib, this);
                this.ospfRestartInterval = new OspfRestartIntervalEnt(mib, this);
                this.ospfRestartStrictLsaChecking = new OspfRestartStrictLsaCheckingEnt(mib, this);
                this.ospfRestartStatus = new OspfRestartStatusEnt(mib, this);
                this.ospfRestartAge = new OspfRestartAgeEnt(mib, this);
                this.ospfRestartExitReason = new OspfRestartExitReasonEnt(mib, this);
                this.ospfAsLsaCount = new OspfAsLsaCountEnt(mib, this);
                this.ospfAsLsaCksumSum = new OspfAsLsaCksumSumEnt(mib, this);
                this.ospfStubRouterSupport = new OspfStubRouterSupportEnt(mib, this);
                this.ospfStubRouterAdvertisement = new OspfStubRouterAdvertisementEnt(mib, this);
                this.ospfDiscontinuityTime = new OspfDiscontinuityTimeEnt(mib, this);
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
                    this.ospfRxNewLsas,
                    this.ospfExtLsdbLimit,
                    this.ospfMulticastExtensions,
                    this.ospfExitOverflowInterval,
                    this.ospfDemandExtensions,
                    this.ospfRFC1583Compatibility,
                    this.ospfOpaqueLsaSupport,
                    this.ospfReferenceBandwidth,
                    this.ospfRestartSupport,
                    this.ospfRestartInterval,
                    this.ospfRestartStrictLsaChecking,
                    this.ospfRestartStatus,
                    this.ospfRestartAge,
                    this.ospfRestartExitReason,
                    this.ospfAsLsaCount,
                    this.ospfAsLsaCksumSum,
                    this.ospfStubRouterSupport,
                    this.ospfStubRouterAdvertisement,
                    this.ospfDiscontinuityTime
                };
            }
            public static final class OspfRouterIdEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfRouterIdEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfRouterId", "1.3.6.1.2.1.14.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfAdminStatEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfAdminStatEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfAdminStat", "1.3.6.1.2.1.14.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfVersionNumberEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfVersionNumberEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfVersionNumber", "1.3.6.1.2.1.14.1.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfAreaBdrRtrStatusEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfAreaBdrRtrStatusEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfAreaBdrRtrStatus", "1.3.6.1.2.1.14.1.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfASBdrRtrStatusEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfASBdrRtrStatusEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfASBdrRtrStatus", "1.3.6.1.2.1.14.1.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfExternLsaCountEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfExternLsaCountEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfExternLsaCount", "1.3.6.1.2.1.14.1.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfExternLsaCksumSumEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfExternLsaCksumSumEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfExternLsaCksumSum", "1.3.6.1.2.1.14.1.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfTOSSupportEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfTOSSupportEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfTOSSupport", "1.3.6.1.2.1.14.1.8", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfOriginateNewLsasEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfOriginateNewLsasEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfOriginateNewLsas", "1.3.6.1.2.1.14.1.9", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfRxNewLsasEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfRxNewLsasEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfRxNewLsas", "1.3.6.1.2.1.14.1.10", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfExtLsdbLimitEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfExtLsdbLimitEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfExtLsdbLimit", "1.3.6.1.2.1.14.1.11", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfMulticastExtensionsEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfMulticastExtensionsEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfMulticastExtensions", "1.3.6.1.2.1.14.1.12", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfExitOverflowIntervalEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfExitOverflowIntervalEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfExitOverflowInterval", "1.3.6.1.2.1.14.1.13", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfDemandExtensionsEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfDemandExtensionsEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfDemandExtensions", "1.3.6.1.2.1.14.1.14", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfRFC1583CompatibilityEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfRFC1583CompatibilityEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfRFC1583Compatibility", "1.3.6.1.2.1.14.1.15", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfOpaqueLsaSupportEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfOpaqueLsaSupportEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfOpaqueLsaSupport", "1.3.6.1.2.1.14.1.16", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfReferenceBandwidthEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfReferenceBandwidthEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfReferenceBandwidth", "1.3.6.1.2.1.14.1.17", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfRestartSupportEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfRestartSupportEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfRestartSupport", "1.3.6.1.2.1.14.1.18", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfRestartIntervalEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfRestartIntervalEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfRestartInterval", "1.3.6.1.2.1.14.1.19", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfRestartStrictLsaCheckingEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfRestartStrictLsaCheckingEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfRestartStrictLsaChecking", "1.3.6.1.2.1.14.1.20", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfRestartStatusEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfRestartStatusEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfRestartStatus", "1.3.6.1.2.1.14.1.21", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfRestartAgeEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfRestartAgeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfRestartAge", "1.3.6.1.2.1.14.1.22", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfRestartExitReasonEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfRestartExitReasonEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfRestartExitReason", "1.3.6.1.2.1.14.1.23", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfAsLsaCountEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfAsLsaCountEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfAsLsaCount", "1.3.6.1.2.1.14.1.24", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfAsLsaCksumSumEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfAsLsaCksumSumEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfAsLsaCksumSum", "1.3.6.1.2.1.14.1.25", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfStubRouterSupportEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfStubRouterSupportEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfStubRouterSupport", "1.3.6.1.2.1.14.1.26", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfStubRouterAdvertisementEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfStubRouterAdvertisementEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfStubRouterAdvertisement", "1.3.6.1.2.1.14.1.27", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfDiscontinuityTimeEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfDiscontinuityTimeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfDiscontinuityTime", "1.3.6.1.2.1.14.1.28", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class OspfAreaTableEnt extends MIBEntry<OSPFMIBDef>
        {
            public final OspfAreaEntryEnt ospfAreaEntry;

            private OspfAreaTableEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfAreaTable", "1.3.6.1.2.1.14.2", false, true, false, false);
                this.ospfAreaEntry = new OspfAreaEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfAreaEntry
                };
            }
            public static final class OspfAreaEntryEnt extends MIBEntry<OSPFMIBDef>
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

                public final OspfAreaSummaryEnt ospfAreaSummary;

                public final OspfAreaStatusEnt ospfAreaStatus;

                public final OspfAreaNssaTranslatorRoleEnt ospfAreaNssaTranslatorRole;

                public final OspfAreaNssaTranslatorStateEnt ospfAreaNssaTranslatorState;

                public final OspfAreaNssaTranslatorStabilityIntervalEnt ospfAreaNssaTranslatorStabilityInterval;

                public final OspfAreaNssaTranslatorEventsEnt ospfAreaNssaTranslatorEvents;

                private OspfAreaEntryEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
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
                    this.ospfAreaSummary = new OspfAreaSummaryEnt(mib, this);
                    this.ospfAreaStatus = new OspfAreaStatusEnt(mib, this);
                    this.ospfAreaNssaTranslatorRole = new OspfAreaNssaTranslatorRoleEnt(mib, this);
                    this.ospfAreaNssaTranslatorState = new OspfAreaNssaTranslatorStateEnt(mib, this);
                    this.ospfAreaNssaTranslatorStabilityInterval = new OspfAreaNssaTranslatorStabilityIntervalEnt(mib, this);
                    this.ospfAreaNssaTranslatorEvents = new OspfAreaNssaTranslatorEventsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfAreaId,
                        this.ospfAuthType,
                        this.ospfImportAsExtern,
                        this.ospfSpfRuns,
                        this.ospfAreaBdrRtrCount,
                        this.ospfAsBdrRtrCount,
                        this.ospfAreaLsaCount,
                        this.ospfAreaLsaCksumSum,
                        this.ospfAreaSummary,
                        this.ospfAreaStatus,
                        this.ospfAreaNssaTranslatorRole,
                        this.ospfAreaNssaTranslatorState,
                        this.ospfAreaNssaTranslatorStabilityInterval,
                        this.ospfAreaNssaTranslatorEvents
                    };
                }
                public static final class OspfAreaIdEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaIdEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaId", "1.3.6.1.2.1.14.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAuthTypeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAuthTypeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAuthType", "1.3.6.1.2.1.14.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfImportAsExternEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfImportAsExternEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfImportAsExtern", "1.3.6.1.2.1.14.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfSpfRunsEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfSpfRunsEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfSpfRuns", "1.3.6.1.2.1.14.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaBdrRtrCountEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaBdrRtrCountEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaBdrRtrCount", "1.3.6.1.2.1.14.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAsBdrRtrCountEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAsBdrRtrCountEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAsBdrRtrCount", "1.3.6.1.2.1.14.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaLsaCountEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaLsaCountEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaLsaCount", "1.3.6.1.2.1.14.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaLsaCksumSumEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaLsaCksumSumEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaLsaCksumSum", "1.3.6.1.2.1.14.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaSummaryEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaSummaryEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaSummary", "1.3.6.1.2.1.14.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaStatusEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaStatusEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaStatus", "1.3.6.1.2.1.14.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaNssaTranslatorRoleEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaNssaTranslatorRoleEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaNssaTranslatorRole", "1.3.6.1.2.1.14.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaNssaTranslatorStateEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaNssaTranslatorStateEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaNssaTranslatorState", "1.3.6.1.2.1.14.2.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaNssaTranslatorStabilityIntervalEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaNssaTranslatorStabilityIntervalEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaNssaTranslatorStabilityInterval", "1.3.6.1.2.1.14.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaNssaTranslatorEventsEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaNssaTranslatorEventsEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaNssaTranslatorEvents", "1.3.6.1.2.1.14.2.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfStubAreaTableEnt extends MIBEntry<OSPFMIBDef>
        {
            public final OspfStubAreaEntryEnt ospfStubAreaEntry;

            private OspfStubAreaTableEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfStubAreaTable", "1.3.6.1.2.1.14.3", false, true, false, false);
                this.ospfStubAreaEntry = new OspfStubAreaEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfStubAreaEntry
                };
            }
            public static final class OspfStubAreaEntryEnt extends MIBEntry<OSPFMIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final OspfStubAreaIdEnt ospfStubAreaId;

                /** read-only since originally an
SMIv1 index*/
                public final OspfStubTOSEnt ospfStubTOS;

                public final OspfStubMetricEnt ospfStubMetric;

                public final OspfStubStatusEnt ospfStubStatus;

                public final OspfStubMetricTypeEnt ospfStubMetricType;

                private OspfStubAreaEntryEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfStubAreaEntry", "1.3.6.1.2.1.14.3.1", false, false, false, true);
                    this.ospfStubAreaId = new OspfStubAreaIdEnt(mib, this);
                    this.ospfStubTOS = new OspfStubTOSEnt(mib, this);
                    this.ospfStubMetric = new OspfStubMetricEnt(mib, this);
                    this.ospfStubStatus = new OspfStubStatusEnt(mib, this);
                    this.ospfStubMetricType = new OspfStubMetricTypeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfStubAreaId,
                        this.ospfStubTOS,
                        this.ospfStubMetric,
                        this.ospfStubStatus,
                        this.ospfStubMetricType
                    };
                }
                public static final class OspfStubAreaIdEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfStubAreaIdEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfStubAreaId", "1.3.6.1.2.1.14.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfStubTOSEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfStubTOSEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfStubTOS", "1.3.6.1.2.1.14.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfStubMetricEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfStubMetricEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfStubMetric", "1.3.6.1.2.1.14.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfStubStatusEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfStubStatusEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfStubStatus", "1.3.6.1.2.1.14.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfStubMetricTypeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfStubMetricTypeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfStubMetricType", "1.3.6.1.2.1.14.3.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfLsdbTableEnt extends MIBEntry<OSPFMIBDef>
        {
            public final OspfLsdbEntryEnt ospfLsdbEntry;

            private OspfLsdbTableEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfLsdbTable", "1.3.6.1.2.1.14.4", false, true, false, false);
                this.ospfLsdbEntry = new OspfLsdbEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfLsdbEntry
                };
            }
            public static final class OspfLsdbEntryEnt extends MIBEntry<OSPFMIBDef>
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

                private OspfLsdbEntryEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
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
                public static final class OspfLsdbAreaIdEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLsdbAreaIdEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLsdbAreaId", "1.3.6.1.2.1.14.4.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLsdbTypeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLsdbTypeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLsdbType", "1.3.6.1.2.1.14.4.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLsdbLsidEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLsdbLsidEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLsdbLsid", "1.3.6.1.2.1.14.4.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLsdbRouterIdEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLsdbRouterIdEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLsdbRouterId", "1.3.6.1.2.1.14.4.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLsdbSequenceEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLsdbSequenceEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLsdbSequence", "1.3.6.1.2.1.14.4.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLsdbAgeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLsdbAgeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLsdbAge", "1.3.6.1.2.1.14.4.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLsdbChecksumEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLsdbChecksumEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLsdbChecksum", "1.3.6.1.2.1.14.4.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLsdbAdvertisementEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLsdbAdvertisementEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLsdbAdvertisement", "1.3.6.1.2.1.14.4.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfAreaRangeTableEnt extends MIBEntry<OSPFMIBDef>
        {
            public final OspfAreaRangeEntryEnt ospfAreaRangeEntry;

            private OspfAreaRangeTableEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfAreaRangeTable", "1.3.6.1.2.1.14.5", false, true, false, false);
                this.ospfAreaRangeEntry = new OspfAreaRangeEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfAreaRangeEntry
                };
            }
            public static final class OspfAreaRangeEntryEnt extends MIBEntry<OSPFMIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final OspfAreaRangeAreaIdEnt ospfAreaRangeAreaId;

                /** read-only since originally an
SMIv1 index*/
                public final OspfAreaRangeNetEnt ospfAreaRangeNet;

                public final OspfAreaRangeMaskEnt ospfAreaRangeMask;

                public final OspfAreaRangeStatusEnt ospfAreaRangeStatus;

                public final OspfAreaRangeEffectEnt ospfAreaRangeEffect;

                private OspfAreaRangeEntryEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfAreaRangeEntry", "1.3.6.1.2.1.14.5.1", false, false, false, true);
                    this.ospfAreaRangeAreaId = new OspfAreaRangeAreaIdEnt(mib, this);
                    this.ospfAreaRangeNet = new OspfAreaRangeNetEnt(mib, this);
                    this.ospfAreaRangeMask = new OspfAreaRangeMaskEnt(mib, this);
                    this.ospfAreaRangeStatus = new OspfAreaRangeStatusEnt(mib, this);
                    this.ospfAreaRangeEffect = new OspfAreaRangeEffectEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfAreaRangeAreaId,
                        this.ospfAreaRangeNet,
                        this.ospfAreaRangeMask,
                        this.ospfAreaRangeStatus,
                        this.ospfAreaRangeEffect
                    };
                }
                public static final class OspfAreaRangeAreaIdEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaRangeAreaIdEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaRangeAreaId", "1.3.6.1.2.1.14.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaRangeNetEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaRangeNetEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaRangeNet", "1.3.6.1.2.1.14.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaRangeMaskEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaRangeMaskEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaRangeMask", "1.3.6.1.2.1.14.5.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaRangeStatusEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaRangeStatusEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaRangeStatus", "1.3.6.1.2.1.14.5.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaRangeEffectEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaRangeEffectEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaRangeEffect", "1.3.6.1.2.1.14.5.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfHostTableEnt extends MIBEntry<OSPFMIBDef>
        {
            public final OspfHostEntryEnt ospfHostEntry;

            private OspfHostTableEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfHostTable", "1.3.6.1.2.1.14.6", false, true, false, false);
                this.ospfHostEntry = new OspfHostEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfHostEntry
                };
            }
            public static final class OspfHostEntryEnt extends MIBEntry<OSPFMIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final OspfHostIpAddressEnt ospfHostIpAddress;

                /** read-only since originally an
SMIv1 index*/
                public final OspfHostTOSEnt ospfHostTOS;

                public final OspfHostMetricEnt ospfHostMetric;

                public final OspfHostStatusEnt ospfHostStatus;

                public final OspfHostAreaIDEnt ospfHostAreaID;

                public final OspfHostCfgAreaIDEnt ospfHostCfgAreaID;

                private OspfHostEntryEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfHostEntry", "1.3.6.1.2.1.14.6.1", false, false, false, true);
                    this.ospfHostIpAddress = new OspfHostIpAddressEnt(mib, this);
                    this.ospfHostTOS = new OspfHostTOSEnt(mib, this);
                    this.ospfHostMetric = new OspfHostMetricEnt(mib, this);
                    this.ospfHostStatus = new OspfHostStatusEnt(mib, this);
                    this.ospfHostAreaID = new OspfHostAreaIDEnt(mib, this);
                    this.ospfHostCfgAreaID = new OspfHostCfgAreaIDEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfHostIpAddress,
                        this.ospfHostTOS,
                        this.ospfHostMetric,
                        this.ospfHostStatus,
                        this.ospfHostAreaID,
                        this.ospfHostCfgAreaID
                    };
                }
                public static final class OspfHostIpAddressEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfHostIpAddressEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfHostIpAddress", "1.3.6.1.2.1.14.6.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfHostTOSEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfHostTOSEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfHostTOS", "1.3.6.1.2.1.14.6.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfHostMetricEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfHostMetricEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfHostMetric", "1.3.6.1.2.1.14.6.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfHostStatusEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfHostStatusEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfHostStatus", "1.3.6.1.2.1.14.6.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfHostAreaIDEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfHostAreaIDEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfHostAreaID", "1.3.6.1.2.1.14.6.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfHostCfgAreaIDEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfHostCfgAreaIDEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfHostCfgAreaID", "1.3.6.1.2.1.14.6.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfIfTableEnt extends MIBEntry<OSPFMIBDef>
        {
            public final OspfIfEntryEnt ospfIfEntry;

            private OspfIfTableEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfIfTable", "1.3.6.1.2.1.14.7", false, true, false, false);
                this.ospfIfEntry = new OspfIfEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfIfEntry
                };
            }
            public static final class OspfIfEntryEnt extends MIBEntry<OSPFMIBDef>
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

                public final OspfIfStatusEnt ospfIfStatus;

                public final OspfIfMulticastForwardingEnt ospfIfMulticastForwarding;

                public final OspfIfDemandEnt ospfIfDemand;

                /** no authentication, by default*/
                public final OspfIfAuthTypeEnt ospfIfAuthType;

                public final OspfIfLsaCountEnt ospfIfLsaCount;

                public final OspfIfLsaCksumSumEnt ospfIfLsaCksumSum;

                public final OspfIfDesignatedRouterIdEnt ospfIfDesignatedRouterId;

                public final OspfIfBackupDesignatedRouterIdEnt ospfIfBackupDesignatedRouterId;

                private OspfIfEntryEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
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
                    this.ospfIfStatus = new OspfIfStatusEnt(mib, this);
                    this.ospfIfMulticastForwarding = new OspfIfMulticastForwardingEnt(mib, this);
                    this.ospfIfDemand = new OspfIfDemandEnt(mib, this);
                    this.ospfIfAuthType = new OspfIfAuthTypeEnt(mib, this);
                    this.ospfIfLsaCount = new OspfIfLsaCountEnt(mib, this);
                    this.ospfIfLsaCksumSum = new OspfIfLsaCksumSumEnt(mib, this);
                    this.ospfIfDesignatedRouterId = new OspfIfDesignatedRouterIdEnt(mib, this);
                    this.ospfIfBackupDesignatedRouterId = new OspfIfBackupDesignatedRouterIdEnt(mib, this);
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
                        this.ospfIfAuthKey,
                        this.ospfIfStatus,
                        this.ospfIfMulticastForwarding,
                        this.ospfIfDemand,
                        this.ospfIfAuthType,
                        this.ospfIfLsaCount,
                        this.ospfIfLsaCksumSum,
                        this.ospfIfDesignatedRouterId,
                        this.ospfIfBackupDesignatedRouterId
                    };
                }
                public static final class OspfIfIpAddressEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfIpAddressEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfIpAddress", "1.3.6.1.2.1.14.7.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAddressLessIfEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAddressLessIfEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAddressLessIf", "1.3.6.1.2.1.14.7.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfAreaIdEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfAreaIdEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfAreaId", "1.3.6.1.2.1.14.7.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfTypeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfTypeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfType", "1.3.6.1.2.1.14.7.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfAdminStatEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfAdminStatEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfAdminStat", "1.3.6.1.2.1.14.7.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfRtrPriorityEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfRtrPriorityEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfRtrPriority", "1.3.6.1.2.1.14.7.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfTransitDelayEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfTransitDelayEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfTransitDelay", "1.3.6.1.2.1.14.7.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfRetransIntervalEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfRetransIntervalEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfRetransInterval", "1.3.6.1.2.1.14.7.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfHelloIntervalEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfHelloIntervalEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfHelloInterval", "1.3.6.1.2.1.14.7.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfRtrDeadIntervalEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfRtrDeadIntervalEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfRtrDeadInterval", "1.3.6.1.2.1.14.7.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfPollIntervalEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfPollIntervalEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfPollInterval", "1.3.6.1.2.1.14.7.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfStateEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfStateEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfState", "1.3.6.1.2.1.14.7.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfDesignatedRouterEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfDesignatedRouterEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfDesignatedRouter", "1.3.6.1.2.1.14.7.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfBackupDesignatedRouterEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfBackupDesignatedRouterEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfBackupDesignatedRouter", "1.3.6.1.2.1.14.7.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfEventsEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfEventsEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfEvents", "1.3.6.1.2.1.14.7.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfAuthKeyEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfAuthKeyEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfAuthKey", "1.3.6.1.2.1.14.7.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfStatusEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfStatusEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfStatus", "1.3.6.1.2.1.14.7.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfMulticastForwardingEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfMulticastForwardingEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfMulticastForwarding", "1.3.6.1.2.1.14.7.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfDemandEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfDemandEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfDemand", "1.3.6.1.2.1.14.7.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfAuthTypeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfAuthTypeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfAuthType", "1.3.6.1.2.1.14.7.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfLsaCountEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfLsaCountEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfLsaCount", "1.3.6.1.2.1.14.7.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfLsaCksumSumEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfLsaCksumSumEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfLsaCksumSum", "1.3.6.1.2.1.14.7.1.22", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfDesignatedRouterIdEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfDesignatedRouterIdEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfDesignatedRouterId", "1.3.6.1.2.1.14.7.1.23", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfBackupDesignatedRouterIdEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfBackupDesignatedRouterIdEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfBackupDesignatedRouterId", "1.3.6.1.2.1.14.7.1.24", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfIfMetricTableEnt extends MIBEntry<OSPFMIBDef>
        {
            public final OspfIfMetricEntryEnt ospfIfMetricEntry;

            private OspfIfMetricTableEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfIfMetricTable", "1.3.6.1.2.1.14.8", false, true, false, false);
                this.ospfIfMetricEntry = new OspfIfMetricEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfIfMetricEntry
                };
            }
            public static final class OspfIfMetricEntryEnt extends MIBEntry<OSPFMIBDef>
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

                private OspfIfMetricEntryEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
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
                public static final class OspfIfMetricIpAddressEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfMetricIpAddressEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfMetricIpAddress", "1.3.6.1.2.1.14.8.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfMetricAddressLessIfEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfMetricAddressLessIfEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfMetricAddressLessIf", "1.3.6.1.2.1.14.8.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfMetricTOSEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfMetricTOSEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfMetricTOS", "1.3.6.1.2.1.14.8.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfMetricValueEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfMetricValueEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfMetricValue", "1.3.6.1.2.1.14.8.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfMetricStatusEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfMetricStatusEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfMetricStatus", "1.3.6.1.2.1.14.8.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfVirtIfTableEnt extends MIBEntry<OSPFMIBDef>
        {
            public final OspfVirtIfEntryEnt ospfVirtIfEntry;

            private OspfVirtIfTableEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfVirtIfTable", "1.3.6.1.2.1.14.9", false, true, false, false);
                this.ospfVirtIfEntry = new OspfVirtIfEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfVirtIfEntry
                };
            }
            public static final class OspfVirtIfEntryEnt extends MIBEntry<OSPFMIBDef>
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

                /** no authentication, by default*/
                public final OspfVirtIfAuthTypeEnt ospfVirtIfAuthType;

                public final OspfVirtIfLsaCountEnt ospfVirtIfLsaCount;

                public final OspfVirtIfLsaCksumSumEnt ospfVirtIfLsaCksumSum;

                private OspfVirtIfEntryEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
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
                    this.ospfVirtIfAuthType = new OspfVirtIfAuthTypeEnt(mib, this);
                    this.ospfVirtIfLsaCount = new OspfVirtIfLsaCountEnt(mib, this);
                    this.ospfVirtIfLsaCksumSum = new OspfVirtIfLsaCksumSumEnt(mib, this);
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
                        this.ospfVirtIfStatus,
                        this.ospfVirtIfAuthType,
                        this.ospfVirtIfLsaCount,
                        this.ospfVirtIfLsaCksumSum
                    };
                }
                public static final class OspfVirtIfAreaIdEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtIfAreaIdEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfAreaId", "1.3.6.1.2.1.14.9.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfNeighborEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtIfNeighborEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfNeighbor", "1.3.6.1.2.1.14.9.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfTransitDelayEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtIfTransitDelayEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfTransitDelay", "1.3.6.1.2.1.14.9.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfRetransIntervalEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtIfRetransIntervalEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfRetransInterval", "1.3.6.1.2.1.14.9.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfHelloIntervalEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtIfHelloIntervalEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfHelloInterval", "1.3.6.1.2.1.14.9.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfRtrDeadIntervalEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtIfRtrDeadIntervalEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfRtrDeadInterval", "1.3.6.1.2.1.14.9.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfStateEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtIfStateEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfState", "1.3.6.1.2.1.14.9.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfEventsEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtIfEventsEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfEvents", "1.3.6.1.2.1.14.9.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfAuthKeyEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtIfAuthKeyEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfAuthKey", "1.3.6.1.2.1.14.9.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfStatusEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtIfStatusEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfStatus", "1.3.6.1.2.1.14.9.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfAuthTypeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtIfAuthTypeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfAuthType", "1.3.6.1.2.1.14.9.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfLsaCountEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtIfLsaCountEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfLsaCount", "1.3.6.1.2.1.14.9.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfLsaCksumSumEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtIfLsaCksumSumEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfLsaCksumSum", "1.3.6.1.2.1.14.9.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfNbrTableEnt extends MIBEntry<OSPFMIBDef>
        {
            public final OspfNbrEntryEnt ospfNbrEntry;

            private OspfNbrTableEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfNbrTable", "1.3.6.1.2.1.14.10", false, true, false, false);
                this.ospfNbrEntry = new OspfNbrEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfNbrEntry
                };
            }
            public static final class OspfNbrEntryEnt extends MIBEntry<OSPFMIBDef>
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

                public final OspfNbmaNbrPermanenceEnt ospfNbmaNbrPermanence;

                public final OspfNbrHelloSuppressedEnt ospfNbrHelloSuppressed;

                public final OspfNbrRestartHelperStatusEnt ospfNbrRestartHelperStatus;

                public final OspfNbrRestartHelperAgeEnt ospfNbrRestartHelperAge;

                public final OspfNbrRestartHelperExitReasonEnt ospfNbrRestartHelperExitReason;

                private OspfNbrEntryEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
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
                    this.ospfNbmaNbrPermanence = new OspfNbmaNbrPermanenceEnt(mib, this);
                    this.ospfNbrHelloSuppressed = new OspfNbrHelloSuppressedEnt(mib, this);
                    this.ospfNbrRestartHelperStatus = new OspfNbrRestartHelperStatusEnt(mib, this);
                    this.ospfNbrRestartHelperAge = new OspfNbrRestartHelperAgeEnt(mib, this);
                    this.ospfNbrRestartHelperExitReason = new OspfNbrRestartHelperExitReasonEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfNbrIpAddr,
                        this.ospfNbrAddressLessIndex,
                        this.ospfNbrRtrId,
                        this.ospfNbrOptions,
                        this.ospfNbrPriority,
                        this.ospfNbrState,
                        this.ospfNbrEvents,
                        this.ospfNbrLsRetransQLen,
                        this.ospfNbmaNbrStatus,
                        this.ospfNbmaNbrPermanence,
                        this.ospfNbrHelloSuppressed,
                        this.ospfNbrRestartHelperStatus,
                        this.ospfNbrRestartHelperAge,
                        this.ospfNbrRestartHelperExitReason
                    };
                }
                public static final class OspfNbrIpAddrEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfNbrIpAddrEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrIpAddr", "1.3.6.1.2.1.14.10.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrAddressLessIndexEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfNbrAddressLessIndexEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrAddressLessIndex", "1.3.6.1.2.1.14.10.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrRtrIdEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfNbrRtrIdEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrRtrId", "1.3.6.1.2.1.14.10.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrOptionsEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfNbrOptionsEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrOptions", "1.3.6.1.2.1.14.10.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrPriorityEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfNbrPriorityEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrPriority", "1.3.6.1.2.1.14.10.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrStateEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfNbrStateEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrState", "1.3.6.1.2.1.14.10.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrEventsEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfNbrEventsEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrEvents", "1.3.6.1.2.1.14.10.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrLsRetransQLenEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfNbrLsRetransQLenEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrLsRetransQLen", "1.3.6.1.2.1.14.10.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbmaNbrStatusEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfNbmaNbrStatusEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfNbmaNbrStatus", "1.3.6.1.2.1.14.10.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbmaNbrPermanenceEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfNbmaNbrPermanenceEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfNbmaNbrPermanence", "1.3.6.1.2.1.14.10.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrHelloSuppressedEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfNbrHelloSuppressedEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrHelloSuppressed", "1.3.6.1.2.1.14.10.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrRestartHelperStatusEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfNbrRestartHelperStatusEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrRestartHelperStatus", "1.3.6.1.2.1.14.10.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrRestartHelperAgeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfNbrRestartHelperAgeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrRestartHelperAge", "1.3.6.1.2.1.14.10.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrRestartHelperExitReasonEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfNbrRestartHelperExitReasonEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrRestartHelperExitReason", "1.3.6.1.2.1.14.10.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfVirtNbrTableEnt extends MIBEntry<OSPFMIBDef>
        {
            public final OspfVirtNbrEntryEnt ospfVirtNbrEntry;

            private OspfVirtNbrTableEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfVirtNbrTable", "1.3.6.1.2.1.14.11", false, true, false, false);
                this.ospfVirtNbrEntry = new OspfVirtNbrEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfVirtNbrEntry
                };
            }
            public static final class OspfVirtNbrEntryEnt extends MIBEntry<OSPFMIBDef>
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

                public final OspfVirtNbrHelloSuppressedEnt ospfVirtNbrHelloSuppressed;

                public final OspfVirtNbrRestartHelperStatusEnt ospfVirtNbrRestartHelperStatus;

                public final OspfVirtNbrRestartHelperAgeEnt ospfVirtNbrRestartHelperAge;

                public final OspfVirtNbrRestartHelperExitReasonEnt ospfVirtNbrRestartHelperExitReason;

                private OspfVirtNbrEntryEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfVirtNbrEntry", "1.3.6.1.2.1.14.11.1", false, false, false, true);
                    this.ospfVirtNbrArea = new OspfVirtNbrAreaEnt(mib, this);
                    this.ospfVirtNbrRtrId = new OspfVirtNbrRtrIdEnt(mib, this);
                    this.ospfVirtNbrIpAddr = new OspfVirtNbrIpAddrEnt(mib, this);
                    this.ospfVirtNbrOptions = new OspfVirtNbrOptionsEnt(mib, this);
                    this.ospfVirtNbrState = new OspfVirtNbrStateEnt(mib, this);
                    this.ospfVirtNbrEvents = new OspfVirtNbrEventsEnt(mib, this);
                    this.ospfVirtNbrLsRetransQLen = new OspfVirtNbrLsRetransQLenEnt(mib, this);
                    this.ospfVirtNbrHelloSuppressed = new OspfVirtNbrHelloSuppressedEnt(mib, this);
                    this.ospfVirtNbrRestartHelperStatus = new OspfVirtNbrRestartHelperStatusEnt(mib, this);
                    this.ospfVirtNbrRestartHelperAge = new OspfVirtNbrRestartHelperAgeEnt(mib, this);
                    this.ospfVirtNbrRestartHelperExitReason = new OspfVirtNbrRestartHelperExitReasonEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfVirtNbrArea,
                        this.ospfVirtNbrRtrId,
                        this.ospfVirtNbrIpAddr,
                        this.ospfVirtNbrOptions,
                        this.ospfVirtNbrState,
                        this.ospfVirtNbrEvents,
                        this.ospfVirtNbrLsRetransQLen,
                        this.ospfVirtNbrHelloSuppressed,
                        this.ospfVirtNbrRestartHelperStatus,
                        this.ospfVirtNbrRestartHelperAge,
                        this.ospfVirtNbrRestartHelperExitReason
                    };
                }
                public static final class OspfVirtNbrAreaEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtNbrAreaEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrArea", "1.3.6.1.2.1.14.11.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrRtrIdEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtNbrRtrIdEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrRtrId", "1.3.6.1.2.1.14.11.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrIpAddrEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtNbrIpAddrEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrIpAddr", "1.3.6.1.2.1.14.11.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrOptionsEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtNbrOptionsEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrOptions", "1.3.6.1.2.1.14.11.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrStateEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtNbrStateEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrState", "1.3.6.1.2.1.14.11.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrEventsEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtNbrEventsEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrEvents", "1.3.6.1.2.1.14.11.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrLsRetransQLenEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtNbrLsRetransQLenEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrLsRetransQLen", "1.3.6.1.2.1.14.11.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrHelloSuppressedEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtNbrHelloSuppressedEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrHelloSuppressed", "1.3.6.1.2.1.14.11.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrRestartHelperStatusEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtNbrRestartHelperStatusEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrRestartHelperStatus", "1.3.6.1.2.1.14.11.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrRestartHelperAgeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtNbrRestartHelperAgeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrRestartHelperAge", "1.3.6.1.2.1.14.11.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrRestartHelperExitReasonEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtNbrRestartHelperExitReasonEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrRestartHelperExitReason", "1.3.6.1.2.1.14.11.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfExtLsdbTableEnt extends MIBEntry<OSPFMIBDef>
        {
            public final OspfExtLsdbEntryEnt ospfExtLsdbEntry;

            private OspfExtLsdbTableEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfExtLsdbTable", "1.3.6.1.2.1.14.12", false, true, false, false);
                this.ospfExtLsdbEntry = new OspfExtLsdbEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfExtLsdbEntry
                };
            }
            public static final class OspfExtLsdbEntryEnt extends MIBEntry<OSPFMIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final OspfExtLsdbTypeEnt ospfExtLsdbType;

                /** read-only since originally an
SMIv1 index*/
                public final OspfExtLsdbLsidEnt ospfExtLsdbLsid;

                /** read-only since originally an
SMIv1 index*/
                public final OspfExtLsdbRouterIdEnt ospfExtLsdbRouterId;

                public final OspfExtLsdbSequenceEnt ospfExtLsdbSequence;

                public final OspfExtLsdbAgeEnt ospfExtLsdbAge;

                public final OspfExtLsdbChecksumEnt ospfExtLsdbChecksum;

                public final OspfExtLsdbAdvertisementEnt ospfExtLsdbAdvertisement;

                private OspfExtLsdbEntryEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfExtLsdbEntry", "1.3.6.1.2.1.14.12.1", false, false, false, true);
                    this.ospfExtLsdbType = new OspfExtLsdbTypeEnt(mib, this);
                    this.ospfExtLsdbLsid = new OspfExtLsdbLsidEnt(mib, this);
                    this.ospfExtLsdbRouterId = new OspfExtLsdbRouterIdEnt(mib, this);
                    this.ospfExtLsdbSequence = new OspfExtLsdbSequenceEnt(mib, this);
                    this.ospfExtLsdbAge = new OspfExtLsdbAgeEnt(mib, this);
                    this.ospfExtLsdbChecksum = new OspfExtLsdbChecksumEnt(mib, this);
                    this.ospfExtLsdbAdvertisement = new OspfExtLsdbAdvertisementEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfExtLsdbType,
                        this.ospfExtLsdbLsid,
                        this.ospfExtLsdbRouterId,
                        this.ospfExtLsdbSequence,
                        this.ospfExtLsdbAge,
                        this.ospfExtLsdbChecksum,
                        this.ospfExtLsdbAdvertisement
                    };
                }
                public static final class OspfExtLsdbTypeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfExtLsdbTypeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfExtLsdbType", "1.3.6.1.2.1.14.12.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfExtLsdbLsidEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfExtLsdbLsidEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfExtLsdbLsid", "1.3.6.1.2.1.14.12.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfExtLsdbRouterIdEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfExtLsdbRouterIdEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfExtLsdbRouterId", "1.3.6.1.2.1.14.12.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfExtLsdbSequenceEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfExtLsdbSequenceEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfExtLsdbSequence", "1.3.6.1.2.1.14.12.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfExtLsdbAgeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfExtLsdbAgeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfExtLsdbAge", "1.3.6.1.2.1.14.12.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfExtLsdbChecksumEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfExtLsdbChecksumEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfExtLsdbChecksum", "1.3.6.1.2.1.14.12.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfExtLsdbAdvertisementEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfExtLsdbAdvertisementEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfExtLsdbAdvertisement", "1.3.6.1.2.1.14.12.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfRouteGroupEnt extends MIBEntry<OSPFMIBDef>
        {
            /** The IP Forwarding Table defines a number of objects for use bythe routing protocol to externalize its information.  Most of


the variables (ipForwardDest, ipForwardMask, ipForwardPolicy,ipForwardNextHop, ipForwardIfIndex, ipForwardType,ipForwardProto, ipForwardAge, and ipForwardNextHopAS) aredefined there.
Those that leave some discretion are defined here.
ipCidrRouteProto is, of course, ospf (13).
ipCidrRouteAge is the time since the route was firstcalculated, as opposed to the time since the last SPF run.ipCidrRouteInfo is an OBJECT IDENTIFIER for use by the routingprotocol.  The following values shall be found there dependingon the way the route was calculated.*/
            public final OspfIntraAreaEnt ospfIntraArea;

            public final OspfInterAreaEnt ospfInterArea;

            public final OspfExternalType1Ent ospfExternalType1;

            public final OspfExternalType2Ent ospfExternalType2;

            private OspfRouteGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfRouteGroup", "1.3.6.1.2.1.14.13", false, false, false, false);
                this.ospfIntraArea = new OspfIntraAreaEnt(mib, this);
                this.ospfInterArea = new OspfInterAreaEnt(mib, this);
                this.ospfExternalType1 = new OspfExternalType1Ent(mib, this);
                this.ospfExternalType2 = new OspfExternalType2Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfIntraArea,
                    this.ospfInterArea,
                    this.ospfExternalType1,
                    this.ospfExternalType2
                };
            }
            public static final class OspfIntraAreaEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfIntraAreaEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfIntraArea", "1.3.6.1.2.1.14.13.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfInterAreaEnt extends MIBEntry<OSPFMIBDef>
            {
                private OspfInterAreaEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfInterArea", "1.3.6.1.2.1.14.13.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfExternalType1Ent extends MIBEntry<OSPFMIBDef>
            {
                private OspfExternalType1Ent(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfExternalType1", "1.3.6.1.2.1.14.13.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class OspfExternalType2Ent extends MIBEntry<OSPFMIBDef>
            {
                private OspfExternalType2Ent(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfExternalType2", "1.3.6.1.2.1.14.13.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class OspfAreaAggregateTableEnt extends MIBEntry<OSPFMIBDef>
        {
            public final OspfAreaAggregateEntryEnt ospfAreaAggregateEntry;

            private OspfAreaAggregateTableEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfAreaAggregateTable", "1.3.6.1.2.1.14.14", false, true, false, false);
                this.ospfAreaAggregateEntry = new OspfAreaAggregateEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfAreaAggregateEntry
                };
            }
            public static final class OspfAreaAggregateEntryEnt extends MIBEntry<OSPFMIBDef>
            {
                /** read-only since originally an
SMIv1 index*/
                public final OspfAreaAggregateAreaIDEnt ospfAreaAggregateAreaID;

                /** read-only since originally an
SMIv1 index*/
                public final OspfAreaAggregateLsdbTypeEnt ospfAreaAggregateLsdbType;

                /** read-only since originally an
SMIv1 index*/
                public final OspfAreaAggregateNetEnt ospfAreaAggregateNet;

                /** read-only since originally an
SMIv1 index*/
                public final OspfAreaAggregateMaskEnt ospfAreaAggregateMask;

                public final OspfAreaAggregateStatusEnt ospfAreaAggregateStatus;

                public final OspfAreaAggregateEffectEnt ospfAreaAggregateEffect;

                public final OspfAreaAggregateExtRouteTagEnt ospfAreaAggregateExtRouteTag;

                private OspfAreaAggregateEntryEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfAreaAggregateEntry", "1.3.6.1.2.1.14.14.1", false, false, false, true);
                    this.ospfAreaAggregateAreaID = new OspfAreaAggregateAreaIDEnt(mib, this);
                    this.ospfAreaAggregateLsdbType = new OspfAreaAggregateLsdbTypeEnt(mib, this);
                    this.ospfAreaAggregateNet = new OspfAreaAggregateNetEnt(mib, this);
                    this.ospfAreaAggregateMask = new OspfAreaAggregateMaskEnt(mib, this);
                    this.ospfAreaAggregateStatus = new OspfAreaAggregateStatusEnt(mib, this);
                    this.ospfAreaAggregateEffect = new OspfAreaAggregateEffectEnt(mib, this);
                    this.ospfAreaAggregateExtRouteTag = new OspfAreaAggregateExtRouteTagEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfAreaAggregateAreaID,
                        this.ospfAreaAggregateLsdbType,
                        this.ospfAreaAggregateNet,
                        this.ospfAreaAggregateMask,
                        this.ospfAreaAggregateStatus,
                        this.ospfAreaAggregateEffect,
                        this.ospfAreaAggregateExtRouteTag
                    };
                }
                public static final class OspfAreaAggregateAreaIDEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaAggregateAreaIDEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaAggregateAreaID", "1.3.6.1.2.1.14.14.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaAggregateLsdbTypeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaAggregateLsdbTypeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaAggregateLsdbType", "1.3.6.1.2.1.14.14.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaAggregateNetEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaAggregateNetEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaAggregateNet", "1.3.6.1.2.1.14.14.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaAggregateMaskEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaAggregateMaskEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaAggregateMask", "1.3.6.1.2.1.14.14.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaAggregateStatusEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaAggregateStatusEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaAggregateStatus", "1.3.6.1.2.1.14.14.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaAggregateEffectEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaAggregateEffectEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaAggregateEffect", "1.3.6.1.2.1.14.14.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaAggregateExtRouteTagEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaAggregateExtRouteTagEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaAggregateExtRouteTag", "1.3.6.1.2.1.14.14.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfLocalLsdbTableEnt extends MIBEntry<OSPFMIBDef>
        {
            public final OspfLocalLsdbEntryEnt ospfLocalLsdbEntry;

            private OspfLocalLsdbTableEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfLocalLsdbTable", "1.3.6.1.2.1.14.17", false, true, false, false);
                this.ospfLocalLsdbEntry = new OspfLocalLsdbEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfLocalLsdbEntry
                };
            }
            public static final class OspfLocalLsdbEntryEnt extends MIBEntry<OSPFMIBDef>
            {
                public final OspfLocalLsdbIpAddressEnt ospfLocalLsdbIpAddress;

                public final OspfLocalLsdbAddressLessIfEnt ospfLocalLsdbAddressLessIf;

                public final OspfLocalLsdbTypeEnt ospfLocalLsdbType;

                public final OspfLocalLsdbLsidEnt ospfLocalLsdbLsid;

                public final OspfLocalLsdbRouterIdEnt ospfLocalLsdbRouterId;

                public final OspfLocalLsdbSequenceEnt ospfLocalLsdbSequence;

                public final OspfLocalLsdbAgeEnt ospfLocalLsdbAge;

                public final OspfLocalLsdbChecksumEnt ospfLocalLsdbChecksum;

                public final OspfLocalLsdbAdvertisementEnt ospfLocalLsdbAdvertisement;

                private OspfLocalLsdbEntryEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfLocalLsdbEntry", "1.3.6.1.2.1.14.17.1", false, false, false, true);
                    this.ospfLocalLsdbIpAddress = new OspfLocalLsdbIpAddressEnt(mib, this);
                    this.ospfLocalLsdbAddressLessIf = new OspfLocalLsdbAddressLessIfEnt(mib, this);
                    this.ospfLocalLsdbType = new OspfLocalLsdbTypeEnt(mib, this);
                    this.ospfLocalLsdbLsid = new OspfLocalLsdbLsidEnt(mib, this);
                    this.ospfLocalLsdbRouterId = new OspfLocalLsdbRouterIdEnt(mib, this);
                    this.ospfLocalLsdbSequence = new OspfLocalLsdbSequenceEnt(mib, this);
                    this.ospfLocalLsdbAge = new OspfLocalLsdbAgeEnt(mib, this);
                    this.ospfLocalLsdbChecksum = new OspfLocalLsdbChecksumEnt(mib, this);
                    this.ospfLocalLsdbAdvertisement = new OspfLocalLsdbAdvertisementEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfLocalLsdbIpAddress,
                        this.ospfLocalLsdbAddressLessIf,
                        this.ospfLocalLsdbType,
                        this.ospfLocalLsdbLsid,
                        this.ospfLocalLsdbRouterId,
                        this.ospfLocalLsdbSequence,
                        this.ospfLocalLsdbAge,
                        this.ospfLocalLsdbChecksum,
                        this.ospfLocalLsdbAdvertisement
                    };
                }
                public static final class OspfLocalLsdbIpAddressEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLocalLsdbIpAddressEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLocalLsdbIpAddress", "1.3.6.1.2.1.14.17.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLocalLsdbAddressLessIfEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLocalLsdbAddressLessIfEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLocalLsdbAddressLessIf", "1.3.6.1.2.1.14.17.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLocalLsdbTypeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLocalLsdbTypeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLocalLsdbType", "1.3.6.1.2.1.14.17.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLocalLsdbLsidEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLocalLsdbLsidEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLocalLsdbLsid", "1.3.6.1.2.1.14.17.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLocalLsdbRouterIdEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLocalLsdbRouterIdEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLocalLsdbRouterId", "1.3.6.1.2.1.14.17.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLocalLsdbSequenceEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLocalLsdbSequenceEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLocalLsdbSequence", "1.3.6.1.2.1.14.17.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLocalLsdbAgeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLocalLsdbAgeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLocalLsdbAge", "1.3.6.1.2.1.14.17.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLocalLsdbChecksumEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLocalLsdbChecksumEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLocalLsdbChecksum", "1.3.6.1.2.1.14.17.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLocalLsdbAdvertisementEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLocalLsdbAdvertisementEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLocalLsdbAdvertisement", "1.3.6.1.2.1.14.17.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfVirtLocalLsdbTableEnt extends MIBEntry<OSPFMIBDef>
        {
            public final OspfVirtLocalLsdbEntryEnt ospfVirtLocalLsdbEntry;

            private OspfVirtLocalLsdbTableEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfVirtLocalLsdbTable", "1.3.6.1.2.1.14.18", false, true, false, false);
                this.ospfVirtLocalLsdbEntry = new OspfVirtLocalLsdbEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfVirtLocalLsdbEntry
                };
            }
            public static final class OspfVirtLocalLsdbEntryEnt extends MIBEntry<OSPFMIBDef>
            {
                public final OspfVirtLocalLsdbTransitAreaEnt ospfVirtLocalLsdbTransitArea;

                public final OspfVirtLocalLsdbNeighborEnt ospfVirtLocalLsdbNeighbor;

                public final OspfVirtLocalLsdbTypeEnt ospfVirtLocalLsdbType;

                public final OspfVirtLocalLsdbLsidEnt ospfVirtLocalLsdbLsid;

                public final OspfVirtLocalLsdbRouterIdEnt ospfVirtLocalLsdbRouterId;

                public final OspfVirtLocalLsdbSequenceEnt ospfVirtLocalLsdbSequence;

                public final OspfVirtLocalLsdbAgeEnt ospfVirtLocalLsdbAge;

                public final OspfVirtLocalLsdbChecksumEnt ospfVirtLocalLsdbChecksum;

                public final OspfVirtLocalLsdbAdvertisementEnt ospfVirtLocalLsdbAdvertisement;

                private OspfVirtLocalLsdbEntryEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfVirtLocalLsdbEntry", "1.3.6.1.2.1.14.18.1", false, false, false, true);
                    this.ospfVirtLocalLsdbTransitArea = new OspfVirtLocalLsdbTransitAreaEnt(mib, this);
                    this.ospfVirtLocalLsdbNeighbor = new OspfVirtLocalLsdbNeighborEnt(mib, this);
                    this.ospfVirtLocalLsdbType = new OspfVirtLocalLsdbTypeEnt(mib, this);
                    this.ospfVirtLocalLsdbLsid = new OspfVirtLocalLsdbLsidEnt(mib, this);
                    this.ospfVirtLocalLsdbRouterId = new OspfVirtLocalLsdbRouterIdEnt(mib, this);
                    this.ospfVirtLocalLsdbSequence = new OspfVirtLocalLsdbSequenceEnt(mib, this);
                    this.ospfVirtLocalLsdbAge = new OspfVirtLocalLsdbAgeEnt(mib, this);
                    this.ospfVirtLocalLsdbChecksum = new OspfVirtLocalLsdbChecksumEnt(mib, this);
                    this.ospfVirtLocalLsdbAdvertisement = new OspfVirtLocalLsdbAdvertisementEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfVirtLocalLsdbTransitArea,
                        this.ospfVirtLocalLsdbNeighbor,
                        this.ospfVirtLocalLsdbType,
                        this.ospfVirtLocalLsdbLsid,
                        this.ospfVirtLocalLsdbRouterId,
                        this.ospfVirtLocalLsdbSequence,
                        this.ospfVirtLocalLsdbAge,
                        this.ospfVirtLocalLsdbChecksum,
                        this.ospfVirtLocalLsdbAdvertisement
                    };
                }
                public static final class OspfVirtLocalLsdbTransitAreaEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtLocalLsdbTransitAreaEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtLocalLsdbTransitArea", "1.3.6.1.2.1.14.18.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtLocalLsdbNeighborEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtLocalLsdbNeighborEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtLocalLsdbNeighbor", "1.3.6.1.2.1.14.18.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtLocalLsdbTypeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtLocalLsdbTypeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtLocalLsdbType", "1.3.6.1.2.1.14.18.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtLocalLsdbLsidEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtLocalLsdbLsidEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtLocalLsdbLsid", "1.3.6.1.2.1.14.18.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtLocalLsdbRouterIdEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtLocalLsdbRouterIdEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtLocalLsdbRouterId", "1.3.6.1.2.1.14.18.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtLocalLsdbSequenceEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtLocalLsdbSequenceEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtLocalLsdbSequence", "1.3.6.1.2.1.14.18.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtLocalLsdbAgeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtLocalLsdbAgeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtLocalLsdbAge", "1.3.6.1.2.1.14.18.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtLocalLsdbChecksumEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtLocalLsdbChecksumEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtLocalLsdbChecksum", "1.3.6.1.2.1.14.18.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtLocalLsdbAdvertisementEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtLocalLsdbAdvertisementEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtLocalLsdbAdvertisement", "1.3.6.1.2.1.14.18.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfAsLsdbTableEnt extends MIBEntry<OSPFMIBDef>
        {
            public final OspfAsLsdbEntryEnt ospfAsLsdbEntry;

            private OspfAsLsdbTableEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfAsLsdbTable", "1.3.6.1.2.1.14.19", false, true, false, false);
                this.ospfAsLsdbEntry = new OspfAsLsdbEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfAsLsdbEntry
                };
            }
            public static final class OspfAsLsdbEntryEnt extends MIBEntry<OSPFMIBDef>
            {
                public final OspfAsLsdbTypeEnt ospfAsLsdbType;

                public final OspfAsLsdbLsidEnt ospfAsLsdbLsid;

                public final OspfAsLsdbRouterIdEnt ospfAsLsdbRouterId;

                public final OspfAsLsdbSequenceEnt ospfAsLsdbSequence;

                public final OspfAsLsdbAgeEnt ospfAsLsdbAge;

                public final OspfAsLsdbChecksumEnt ospfAsLsdbChecksum;

                public final OspfAsLsdbAdvertisementEnt ospfAsLsdbAdvertisement;

                private OspfAsLsdbEntryEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfAsLsdbEntry", "1.3.6.1.2.1.14.19.1", false, false, false, true);
                    this.ospfAsLsdbType = new OspfAsLsdbTypeEnt(mib, this);
                    this.ospfAsLsdbLsid = new OspfAsLsdbLsidEnt(mib, this);
                    this.ospfAsLsdbRouterId = new OspfAsLsdbRouterIdEnt(mib, this);
                    this.ospfAsLsdbSequence = new OspfAsLsdbSequenceEnt(mib, this);
                    this.ospfAsLsdbAge = new OspfAsLsdbAgeEnt(mib, this);
                    this.ospfAsLsdbChecksum = new OspfAsLsdbChecksumEnt(mib, this);
                    this.ospfAsLsdbAdvertisement = new OspfAsLsdbAdvertisementEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfAsLsdbType,
                        this.ospfAsLsdbLsid,
                        this.ospfAsLsdbRouterId,
                        this.ospfAsLsdbSequence,
                        this.ospfAsLsdbAge,
                        this.ospfAsLsdbChecksum,
                        this.ospfAsLsdbAdvertisement
                    };
                }
                public static final class OspfAsLsdbTypeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAsLsdbTypeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAsLsdbType", "1.3.6.1.2.1.14.19.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAsLsdbLsidEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAsLsdbLsidEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAsLsdbLsid", "1.3.6.1.2.1.14.19.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAsLsdbRouterIdEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAsLsdbRouterIdEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAsLsdbRouterId", "1.3.6.1.2.1.14.19.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAsLsdbSequenceEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAsLsdbSequenceEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAsLsdbSequence", "1.3.6.1.2.1.14.19.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAsLsdbAgeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAsLsdbAgeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAsLsdbAge", "1.3.6.1.2.1.14.19.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAsLsdbChecksumEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAsLsdbChecksumEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAsLsdbChecksum", "1.3.6.1.2.1.14.19.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAsLsdbAdvertisementEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAsLsdbAdvertisementEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAsLsdbAdvertisement", "1.3.6.1.2.1.14.19.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfAreaLsaCountTableEnt extends MIBEntry<OSPFMIBDef>
        {
            public final OspfAreaLsaCountEntryEnt ospfAreaLsaCountEntry;

            private OspfAreaLsaCountTableEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfAreaLsaCountTable", "1.3.6.1.2.1.14.20", false, true, false, false);
                this.ospfAreaLsaCountEntry = new OspfAreaLsaCountEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfAreaLsaCountEntry
                };
            }
            public static final class OspfAreaLsaCountEntryEnt extends MIBEntry<OSPFMIBDef>
            {
                public final OspfAreaLsaCountAreaIdEnt ospfAreaLsaCountAreaId;

                public final OspfAreaLsaCountLsaTypeEnt ospfAreaLsaCountLsaType;

                public final OspfAreaLsaCountNumberEnt ospfAreaLsaCountNumber;

                private OspfAreaLsaCountEntryEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfAreaLsaCountEntry", "1.3.6.1.2.1.14.20.1", false, false, false, true);
                    this.ospfAreaLsaCountAreaId = new OspfAreaLsaCountAreaIdEnt(mib, this);
                    this.ospfAreaLsaCountLsaType = new OspfAreaLsaCountLsaTypeEnt(mib, this);
                    this.ospfAreaLsaCountNumber = new OspfAreaLsaCountNumberEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfAreaLsaCountAreaId,
                        this.ospfAreaLsaCountLsaType,
                        this.ospfAreaLsaCountNumber
                    };
                }
                public static final class OspfAreaLsaCountAreaIdEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaLsaCountAreaIdEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaLsaCountAreaId", "1.3.6.1.2.1.14.20.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaLsaCountLsaTypeEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaLsaCountLsaTypeEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaLsaCountLsaType", "1.3.6.1.2.1.14.20.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaLsaCountNumberEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaLsaCountNumberEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaLsaCountNumber", "1.3.6.1.2.1.14.20.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class OspfConformanceEnt extends MIBEntry<OSPFMIBDef>
        {
            public final OspfGroupsEnt ospfGroups;

            public final OspfCompliancesEnt ospfCompliances;

            private OspfConformanceEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
            {
                super(mib, parent, "ospfConformance", "1.3.6.1.2.1.14.15", false, false, false, false);
                this.ospfGroups = new OspfGroupsEnt(mib, this);
                this.ospfCompliances = new OspfCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ospfGroups,
                    this.ospfCompliances
                };
            }
            public static final class OspfGroupsEnt extends MIBEntry<OSPFMIBDef>
            {
                /** units of conformance*/
                public final OspfBasicGroupEnt ospfBasicGroup;

                public final OspfAreaGroupEnt ospfAreaGroup;

                public final OspfStubAreaGroupEnt ospfStubAreaGroup;

                public final OspfLsdbGroupEnt ospfLsdbGroup;

                public final OspfAreaRangeGroupEnt ospfAreaRangeGroup;

                public final OspfHostGroupEnt ospfHostGroup;

                public final OspfIfGroupEnt ospfIfGroup;

                public final OspfIfMetricGroupEnt ospfIfMetricGroup;

                public final OspfVirtIfGroupEnt ospfVirtIfGroup;

                public final OspfNbrGroupEnt ospfNbrGroup;

                public final OspfVirtNbrGroupEnt ospfVirtNbrGroup;

                public final OspfExtLsdbGroupEnt ospfExtLsdbGroup;

                public final OspfAreaAggregateGroupEnt ospfAreaAggregateGroup;

                public final OspfLocalLsdbGroupEnt ospfLocalLsdbGroup;

                public final OspfVirtLocalLsdbGroupEnt ospfVirtLocalLsdbGroup;

                public final OspfAsLsdbGroupEnt ospfAsLsdbGroup;

                public final OspfBasicGroup2Ent ospfBasicGroup2;

                public final OspfAreaGroup2Ent ospfAreaGroup2;

                public final OspfIfGroup2Ent ospfIfGroup2;

                public final OspfVirtIfGroup2Ent ospfVirtIfGroup2;

                public final OspfNbrGroup2Ent ospfNbrGroup2;

                public final OspfVirtNbrGroup2Ent ospfVirtNbrGroup2;

                public final OspfAreaAggregateGroup2Ent ospfAreaAggregateGroup2;

                public final OspfAreaLsaCountGroupEnt ospfAreaLsaCountGroup;

                public final OspfHostGroup2Ent ospfHostGroup2;

                /** This object group is included for SMI conformance.  It is not a


mandatory group for compliance with this MIB*/
                public final OspfObsoleteGroupEnt ospfObsoleteGroup;

                private OspfGroupsEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfGroups", "1.3.6.1.2.1.14.15.1", false, false, false, false);
                    this.ospfBasicGroup = new OspfBasicGroupEnt(mib, this);
                    this.ospfAreaGroup = new OspfAreaGroupEnt(mib, this);
                    this.ospfStubAreaGroup = new OspfStubAreaGroupEnt(mib, this);
                    this.ospfLsdbGroup = new OspfLsdbGroupEnt(mib, this);
                    this.ospfAreaRangeGroup = new OspfAreaRangeGroupEnt(mib, this);
                    this.ospfHostGroup = new OspfHostGroupEnt(mib, this);
                    this.ospfIfGroup = new OspfIfGroupEnt(mib, this);
                    this.ospfIfMetricGroup = new OspfIfMetricGroupEnt(mib, this);
                    this.ospfVirtIfGroup = new OspfVirtIfGroupEnt(mib, this);
                    this.ospfNbrGroup = new OspfNbrGroupEnt(mib, this);
                    this.ospfVirtNbrGroup = new OspfVirtNbrGroupEnt(mib, this);
                    this.ospfExtLsdbGroup = new OspfExtLsdbGroupEnt(mib, this);
                    this.ospfAreaAggregateGroup = new OspfAreaAggregateGroupEnt(mib, this);
                    this.ospfLocalLsdbGroup = new OspfLocalLsdbGroupEnt(mib, this);
                    this.ospfVirtLocalLsdbGroup = new OspfVirtLocalLsdbGroupEnt(mib, this);
                    this.ospfAsLsdbGroup = new OspfAsLsdbGroupEnt(mib, this);
                    this.ospfBasicGroup2 = new OspfBasicGroup2Ent(mib, this);
                    this.ospfAreaGroup2 = new OspfAreaGroup2Ent(mib, this);
                    this.ospfIfGroup2 = new OspfIfGroup2Ent(mib, this);
                    this.ospfVirtIfGroup2 = new OspfVirtIfGroup2Ent(mib, this);
                    this.ospfNbrGroup2 = new OspfNbrGroup2Ent(mib, this);
                    this.ospfVirtNbrGroup2 = new OspfVirtNbrGroup2Ent(mib, this);
                    this.ospfAreaAggregateGroup2 = new OspfAreaAggregateGroup2Ent(mib, this);
                    this.ospfAreaLsaCountGroup = new OspfAreaLsaCountGroupEnt(mib, this);
                    this.ospfHostGroup2 = new OspfHostGroup2Ent(mib, this);
                    this.ospfObsoleteGroup = new OspfObsoleteGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfBasicGroup,
                        this.ospfAreaGroup,
                        this.ospfStubAreaGroup,
                        this.ospfLsdbGroup,
                        this.ospfAreaRangeGroup,
                        this.ospfHostGroup,
                        this.ospfIfGroup,
                        this.ospfIfMetricGroup,
                        this.ospfVirtIfGroup,
                        this.ospfNbrGroup,
                        this.ospfVirtNbrGroup,
                        this.ospfExtLsdbGroup,
                        this.ospfAreaAggregateGroup,
                        this.ospfLocalLsdbGroup,
                        this.ospfVirtLocalLsdbGroup,
                        this.ospfAsLsdbGroup,
                        this.ospfBasicGroup2,
                        this.ospfAreaGroup2,
                        this.ospfIfGroup2,
                        this.ospfVirtIfGroup2,
                        this.ospfNbrGroup2,
                        this.ospfVirtNbrGroup2,
                        this.ospfAreaAggregateGroup2,
                        this.ospfAreaLsaCountGroup,
                        this.ospfHostGroup2,
                        this.ospfObsoleteGroup
                    };
                }
                public static final class OspfBasicGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfBasicGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfBasicGroup", "1.3.6.1.2.1.14.15.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaGroup", "1.3.6.1.2.1.14.15.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfStubAreaGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfStubAreaGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfStubAreaGroup", "1.3.6.1.2.1.14.15.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLsdbGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLsdbGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLsdbGroup", "1.3.6.1.2.1.14.15.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaRangeGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaRangeGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaRangeGroup", "1.3.6.1.2.1.14.15.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfHostGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfHostGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfHostGroup", "1.3.6.1.2.1.14.15.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfGroup", "1.3.6.1.2.1.14.15.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfMetricGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfMetricGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfMetricGroup", "1.3.6.1.2.1.14.15.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtIfGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfGroup", "1.3.6.1.2.1.14.15.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfNbrGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrGroup", "1.3.6.1.2.1.14.15.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtNbrGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrGroup", "1.3.6.1.2.1.14.15.1.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfExtLsdbGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfExtLsdbGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfExtLsdbGroup", "1.3.6.1.2.1.14.15.1.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaAggregateGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaAggregateGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaAggregateGroup", "1.3.6.1.2.1.14.15.1.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfLocalLsdbGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfLocalLsdbGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfLocalLsdbGroup", "1.3.6.1.2.1.14.15.1.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtLocalLsdbGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtLocalLsdbGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtLocalLsdbGroup", "1.3.6.1.2.1.14.15.1.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAsLsdbGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAsLsdbGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAsLsdbGroup", "1.3.6.1.2.1.14.15.1.16", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfBasicGroup2Ent extends MIBEntry<OSPFMIBDef>
                {
                    private OspfBasicGroup2Ent(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfBasicGroup2", "1.3.6.1.2.1.14.15.1.17", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaGroup2Ent extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaGroup2Ent(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaGroup2", "1.3.6.1.2.1.14.15.1.18", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfIfGroup2Ent extends MIBEntry<OSPFMIBDef>
                {
                    private OspfIfGroup2Ent(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfIfGroup2", "1.3.6.1.2.1.14.15.1.19", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtIfGroup2Ent extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtIfGroup2Ent(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtIfGroup2", "1.3.6.1.2.1.14.15.1.20", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfNbrGroup2Ent extends MIBEntry<OSPFMIBDef>
                {
                    private OspfNbrGroup2Ent(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfNbrGroup2", "1.3.6.1.2.1.14.15.1.21", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfVirtNbrGroup2Ent extends MIBEntry<OSPFMIBDef>
                {
                    private OspfVirtNbrGroup2Ent(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfVirtNbrGroup2", "1.3.6.1.2.1.14.15.1.22", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaAggregateGroup2Ent extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaAggregateGroup2Ent(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaAggregateGroup2", "1.3.6.1.2.1.14.15.1.23", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfAreaLsaCountGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfAreaLsaCountGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfAreaLsaCountGroup", "1.3.6.1.2.1.14.15.1.24", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfHostGroup2Ent extends MIBEntry<OSPFMIBDef>
                {
                    private OspfHostGroup2Ent(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfHostGroup2", "1.3.6.1.2.1.14.15.1.25", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfObsoleteGroupEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfObsoleteGroupEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfObsoleteGroup", "1.3.6.1.2.1.14.15.1.26", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class OspfCompliancesEnt extends MIBEntry<OSPFMIBDef>
            {
                /** compliance statements*/
                public final OspfComplianceEnt ospfCompliance;

                public final OspfCompliance2Ent ospfCompliance2;

                public final OspfComplianceObsoleteEnt ospfComplianceObsolete;

                private OspfCompliancesEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                {
                    super(mib, parent, "ospfCompliances", "1.3.6.1.2.1.14.15.2", false, false, false, false);
                    this.ospfCompliance = new OspfComplianceEnt(mib, this);
                    this.ospfCompliance2 = new OspfCompliance2Ent(mib, this);
                    this.ospfComplianceObsolete = new OspfComplianceObsoleteEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ospfCompliance,
                        this.ospfCompliance2,
                        this.ospfComplianceObsolete
                    };
                }
                public static final class OspfComplianceEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfComplianceEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfCompliance", "1.3.6.1.2.1.14.15.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfCompliance2Ent extends MIBEntry<OSPFMIBDef>
                {
                    private OspfCompliance2Ent(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfCompliance2", "1.3.6.1.2.1.14.15.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class OspfComplianceObsoleteEnt extends MIBEntry<OSPFMIBDef>
                {
                    private OspfComplianceObsoleteEnt(OSPFMIBDef mib, MIBEntry<OSPFMIBDef> parent)
                    {
                        super(mib, parent, "ospfComplianceObsolete", "1.3.6.1.2.1.14.15.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
