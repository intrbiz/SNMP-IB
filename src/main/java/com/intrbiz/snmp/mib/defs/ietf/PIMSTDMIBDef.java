package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2579]
[RFC2580]
[RFC2863]
[RFC4001]*/
public final class PIMSTDMIBDef extends MIB
{
    public static final PIMSTDMIBDef PIMSTDMIB = new PIMSTDMIBDef();

    /** [RTPROTO]

2 November 2007*/
    public final PimStdMIBEnt pimStdMIB;

    private PIMSTDMIBDef()
    {
        super("PIM-STD-MIB");
        this.pimStdMIB = new PimStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.pimStdMIB
        };
    }

    public static final class PimStdMIBEnt extends MIBEntry<PIMSTDMIBDef>
    {
        /** Top-level structure*/
        public final PimNotificationsEnt pimNotifications;

        public final PimEnt pim;

        /** Conformance Information*/
        public final PimMIBConformanceEnt pimMIBConformance;

        private PimStdMIBEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
        {
            super(mib, parent, "pimStdMIB", "1.3.6.1.2.1.157", false, false, false, false);
            this.pimNotifications = new PimNotificationsEnt(mib, this);
            this.pim = new PimEnt(mib, this);
            this.pimMIBConformance = new PimMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.pimNotifications,
                this.pim,
                this.pimMIBConformance
            };
        }
        public static final class PimNotificationsEnt extends MIBEntry<PIMSTDMIBDef>
        {
            /** PIM Notifications*/
            public final PimNeighborLossEnt pimNeighborLoss;

            public final PimInvalidRegisterEnt pimInvalidRegister;

            public final PimInvalidJoinPruneEnt pimInvalidJoinPrune;

            public final PimRPMappingChangeEnt pimRPMappingChange;

            public final PimInterfaceElectionEnt pimInterfaceElection;

            private PimNotificationsEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
            {
                super(mib, parent, "pimNotifications", "1.3.6.1.2.1.157.0", false, false, false, false);
                this.pimNeighborLoss = new PimNeighborLossEnt(mib, this);
                this.pimInvalidRegister = new PimInvalidRegisterEnt(mib, this);
                this.pimInvalidJoinPrune = new PimInvalidJoinPruneEnt(mib, this);
                this.pimRPMappingChange = new PimRPMappingChangeEnt(mib, this);
                this.pimInterfaceElection = new PimInterfaceElectionEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pimNeighborLoss,
                    this.pimInvalidRegister,
                    this.pimInvalidJoinPrune,
                    this.pimRPMappingChange,
                    this.pimInterfaceElection
                };
            }
            public static final class PimNeighborLossEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimNeighborLossEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimNeighborLoss", "1.3.6.1.2.1.157.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInvalidRegisterEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInvalidRegisterEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInvalidRegister", "1.3.6.1.2.1.157.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInvalidJoinPruneEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInvalidJoinPruneEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInvalidJoinPrune", "1.3.6.1.2.1.157.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimRPMappingChangeEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimRPMappingChangeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimRPMappingChange", "1.3.6.1.2.1.157.0.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInterfaceElectionEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInterfaceElectionEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInterfaceElection", "1.3.6.1.2.1.157.0.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class PimEnt extends MIBEntry<PIMSTDMIBDef>
        {
            public final PimKeepalivePeriodEnt pimKeepalivePeriod;

            public final PimRegisterSuppressionTimeEnt pimRegisterSuppressionTime;

            public final PimStarGEntriesEnt pimStarGEntries;

            public final PimStarGIEntriesEnt pimStarGIEntries;

            public final PimSGEntriesEnt pimSGEntries;

            public final PimSGIEntriesEnt pimSGIEntries;

            public final PimSGRptEntriesEnt pimSGRptEntries;

            public final PimSGRptIEntriesEnt pimSGRptIEntries;

            public final PimOutAssertsEnt pimOutAsserts;

            public final PimInAssertsEnt pimInAsserts;

            public final PimLastAssertInterfaceEnt pimLastAssertInterface;

            public final PimLastAssertGroupAddressTypeEnt pimLastAssertGroupAddressType;

            public final PimLastAssertGroupAddressEnt pimLastAssertGroupAddress;

            public final PimLastAssertSourceAddressTypeEnt pimLastAssertSourceAddressType;

            public final PimLastAssertSourceAddressEnt pimLastAssertSourceAddress;

            public final PimNeighborLossNotificationPeriodEnt pimNeighborLossNotificationPeriod;

            public final PimNeighborLossCountEnt pimNeighborLossCount;

            public final PimInvalidRegisterNotificationPeriodEnt pimInvalidRegisterNotificationPeriod;

            public final PimInvalidRegisterMsgsRcvdEnt pimInvalidRegisterMsgsRcvd;

            public final PimInvalidRegisterAddressTypeEnt pimInvalidRegisterAddressType;

            public final PimInvalidRegisterOriginEnt pimInvalidRegisterOrigin;

            public final PimInvalidRegisterGroupEnt pimInvalidRegisterGroup;

            public final PimInvalidRegisterRpEnt pimInvalidRegisterRp;

            public final PimInvalidJoinPruneNotificationPeriodEnt pimInvalidJoinPruneNotificationPeriod;

            public final PimInvalidJoinPruneMsgsRcvdEnt pimInvalidJoinPruneMsgsRcvd;

            public final PimInvalidJoinPruneAddressTypeEnt pimInvalidJoinPruneAddressType;

            public final PimInvalidJoinPruneOriginEnt pimInvalidJoinPruneOrigin;

            public final PimInvalidJoinPruneGroupEnt pimInvalidJoinPruneGroup;

            public final PimInvalidJoinPruneRpEnt pimInvalidJoinPruneRp;

            public final PimRPMappingNotificationPeriodEnt pimRPMappingNotificationPeriod;

            public final PimRPMappingChangeCountEnt pimRPMappingChangeCount;

            public final PimInterfaceElectionNotificationPeriodEnt pimInterfaceElectionNotificationPeriod;

            public final PimInterfaceElectionWinCountEnt pimInterfaceElectionWinCount;

            public final PimRefreshIntervalEnt pimRefreshInterval;

            public final PimDeviceConfigStorageTypeEnt pimDeviceConfigStorageType;

            /** The PIM Interface Table*/
            public final PimInterfaceTableEnt pimInterfaceTable;

            /** The PIM Neighbor Table*/
            public final PimNeighborTableEnt pimNeighborTable;

            /** The PIM Neighbor Secondary Address Table*/
            public final PimNbrSecAddressTableEnt pimNbrSecAddressTable;

            /** The PIM (*,G) State Table*/
            public final PimStarGTableEnt pimStarGTable;

            /** The PIM (*,G,I) State Table*/
            public final PimStarGITableEnt pimStarGITable;

            /** The PIM (S,G) State Table*/
            public final PimSGTableEnt pimSGTable;

            /** The PIM (S,G,I) State Table*/
            public final PimSGITableEnt pimSGITable;

            /** The PIM (S,G,rpt) State Table*/
            public final PimSGRptTableEnt pimSGRptTable;

            /** The PIM (S,G,rpt,I) State Table*/
            public final PimSGRptITableEnt pimSGRptITable;

            /** The PIM Bidir DF-Election Table*/
            public final PimBidirDFElectionTableEnt pimBidirDFElectionTable;

            /** The PIM Static RP Table*/
            public final PimStaticRPTableEnt pimStaticRPTable;

            /** The PIM Anycast-RP Set Table*/
            public final PimAnycastRPSetTableEnt pimAnycastRPSetTable;

            /** The PIM Group Mapping Table*/
            public final PimGroupMappingTableEnt pimGroupMappingTable;

            private PimEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
            {
                super(mib, parent, "pim", "1.3.6.1.2.1.157.1", false, false, false, false);
                this.pimKeepalivePeriod = new PimKeepalivePeriodEnt(mib, this);
                this.pimRegisterSuppressionTime = new PimRegisterSuppressionTimeEnt(mib, this);
                this.pimStarGEntries = new PimStarGEntriesEnt(mib, this);
                this.pimStarGIEntries = new PimStarGIEntriesEnt(mib, this);
                this.pimSGEntries = new PimSGEntriesEnt(mib, this);
                this.pimSGIEntries = new PimSGIEntriesEnt(mib, this);
                this.pimSGRptEntries = new PimSGRptEntriesEnt(mib, this);
                this.pimSGRptIEntries = new PimSGRptIEntriesEnt(mib, this);
                this.pimOutAsserts = new PimOutAssertsEnt(mib, this);
                this.pimInAsserts = new PimInAssertsEnt(mib, this);
                this.pimLastAssertInterface = new PimLastAssertInterfaceEnt(mib, this);
                this.pimLastAssertGroupAddressType = new PimLastAssertGroupAddressTypeEnt(mib, this);
                this.pimLastAssertGroupAddress = new PimLastAssertGroupAddressEnt(mib, this);
                this.pimLastAssertSourceAddressType = new PimLastAssertSourceAddressTypeEnt(mib, this);
                this.pimLastAssertSourceAddress = new PimLastAssertSourceAddressEnt(mib, this);
                this.pimNeighborLossNotificationPeriod = new PimNeighborLossNotificationPeriodEnt(mib, this);
                this.pimNeighborLossCount = new PimNeighborLossCountEnt(mib, this);
                this.pimInvalidRegisterNotificationPeriod = new PimInvalidRegisterNotificationPeriodEnt(mib, this);
                this.pimInvalidRegisterMsgsRcvd = new PimInvalidRegisterMsgsRcvdEnt(mib, this);
                this.pimInvalidRegisterAddressType = new PimInvalidRegisterAddressTypeEnt(mib, this);
                this.pimInvalidRegisterOrigin = new PimInvalidRegisterOriginEnt(mib, this);
                this.pimInvalidRegisterGroup = new PimInvalidRegisterGroupEnt(mib, this);
                this.pimInvalidRegisterRp = new PimInvalidRegisterRpEnt(mib, this);
                this.pimInvalidJoinPruneNotificationPeriod = new PimInvalidJoinPruneNotificationPeriodEnt(mib, this);
                this.pimInvalidJoinPruneMsgsRcvd = new PimInvalidJoinPruneMsgsRcvdEnt(mib, this);
                this.pimInvalidJoinPruneAddressType = new PimInvalidJoinPruneAddressTypeEnt(mib, this);
                this.pimInvalidJoinPruneOrigin = new PimInvalidJoinPruneOriginEnt(mib, this);
                this.pimInvalidJoinPruneGroup = new PimInvalidJoinPruneGroupEnt(mib, this);
                this.pimInvalidJoinPruneRp = new PimInvalidJoinPruneRpEnt(mib, this);
                this.pimRPMappingNotificationPeriod = new PimRPMappingNotificationPeriodEnt(mib, this);
                this.pimRPMappingChangeCount = new PimRPMappingChangeCountEnt(mib, this);
                this.pimInterfaceElectionNotificationPeriod = new PimInterfaceElectionNotificationPeriodEnt(mib, this);
                this.pimInterfaceElectionWinCount = new PimInterfaceElectionWinCountEnt(mib, this);
                this.pimRefreshInterval = new PimRefreshIntervalEnt(mib, this);
                this.pimDeviceConfigStorageType = new PimDeviceConfigStorageTypeEnt(mib, this);
                this.pimInterfaceTable = new PimInterfaceTableEnt(mib, this);
                this.pimNeighborTable = new PimNeighborTableEnt(mib, this);
                this.pimNbrSecAddressTable = new PimNbrSecAddressTableEnt(mib, this);
                this.pimStarGTable = new PimStarGTableEnt(mib, this);
                this.pimStarGITable = new PimStarGITableEnt(mib, this);
                this.pimSGTable = new PimSGTableEnt(mib, this);
                this.pimSGITable = new PimSGITableEnt(mib, this);
                this.pimSGRptTable = new PimSGRptTableEnt(mib, this);
                this.pimSGRptITable = new PimSGRptITableEnt(mib, this);
                this.pimBidirDFElectionTable = new PimBidirDFElectionTableEnt(mib, this);
                this.pimStaticRPTable = new PimStaticRPTableEnt(mib, this);
                this.pimAnycastRPSetTable = new PimAnycastRPSetTableEnt(mib, this);
                this.pimGroupMappingTable = new PimGroupMappingTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pimKeepalivePeriod,
                    this.pimRegisterSuppressionTime,
                    this.pimStarGEntries,
                    this.pimStarGIEntries,
                    this.pimSGEntries,
                    this.pimSGIEntries,
                    this.pimSGRptEntries,
                    this.pimSGRptIEntries,
                    this.pimOutAsserts,
                    this.pimInAsserts,
                    this.pimLastAssertInterface,
                    this.pimLastAssertGroupAddressType,
                    this.pimLastAssertGroupAddress,
                    this.pimLastAssertSourceAddressType,
                    this.pimLastAssertSourceAddress,
                    this.pimNeighborLossNotificationPeriod,
                    this.pimNeighborLossCount,
                    this.pimInvalidRegisterNotificationPeriod,
                    this.pimInvalidRegisterMsgsRcvd,
                    this.pimInvalidRegisterAddressType,
                    this.pimInvalidRegisterOrigin,
                    this.pimInvalidRegisterGroup,
                    this.pimInvalidRegisterRp,
                    this.pimInvalidJoinPruneNotificationPeriod,
                    this.pimInvalidJoinPruneMsgsRcvd,
                    this.pimInvalidJoinPruneAddressType,
                    this.pimInvalidJoinPruneOrigin,
                    this.pimInvalidJoinPruneGroup,
                    this.pimInvalidJoinPruneRp,
                    this.pimRPMappingNotificationPeriod,
                    this.pimRPMappingChangeCount,
                    this.pimInterfaceElectionNotificationPeriod,
                    this.pimInterfaceElectionWinCount,
                    this.pimRefreshInterval,
                    this.pimDeviceConfigStorageType,
                    this.pimInterfaceTable,
                    this.pimNeighborTable,
                    this.pimNbrSecAddressTable,
                    this.pimStarGTable,
                    this.pimStarGITable,
                    this.pimSGTable,
                    this.pimSGITable,
                    this.pimSGRptTable,
                    this.pimSGRptITable,
                    this.pimBidirDFElectionTable,
                    this.pimStaticRPTable,
                    this.pimAnycastRPSetTable,
                    this.pimGroupMappingTable
                };
            }
            public static final class PimKeepalivePeriodEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimKeepalivePeriodEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimKeepalivePeriod", "1.3.6.1.2.1.157.1.14", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimRegisterSuppressionTimeEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimRegisterSuppressionTimeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimRegisterSuppressionTime", "1.3.6.1.2.1.157.1.15", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimStarGEntriesEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimStarGEntriesEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimStarGEntries", "1.3.6.1.2.1.157.1.16", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimStarGIEntriesEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimStarGIEntriesEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimStarGIEntries", "1.3.6.1.2.1.157.1.17", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimSGEntriesEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimSGEntriesEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimSGEntries", "1.3.6.1.2.1.157.1.18", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimSGIEntriesEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimSGIEntriesEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimSGIEntries", "1.3.6.1.2.1.157.1.19", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimSGRptEntriesEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimSGRptEntriesEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimSGRptEntries", "1.3.6.1.2.1.157.1.20", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimSGRptIEntriesEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimSGRptIEntriesEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimSGRptIEntries", "1.3.6.1.2.1.157.1.21", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimOutAssertsEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimOutAssertsEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimOutAsserts", "1.3.6.1.2.1.157.1.22", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInAssertsEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInAssertsEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInAsserts", "1.3.6.1.2.1.157.1.23", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimLastAssertInterfaceEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimLastAssertInterfaceEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimLastAssertInterface", "1.3.6.1.2.1.157.1.24", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimLastAssertGroupAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimLastAssertGroupAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimLastAssertGroupAddressType", "1.3.6.1.2.1.157.1.25", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimLastAssertGroupAddressEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimLastAssertGroupAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimLastAssertGroupAddress", "1.3.6.1.2.1.157.1.26", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimLastAssertSourceAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimLastAssertSourceAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimLastAssertSourceAddressType", "1.3.6.1.2.1.157.1.27", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimLastAssertSourceAddressEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimLastAssertSourceAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimLastAssertSourceAddress", "1.3.6.1.2.1.157.1.28", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimNeighborLossNotificationPeriodEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimNeighborLossNotificationPeriodEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimNeighborLossNotificationPeriod", "1.3.6.1.2.1.157.1.29", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimNeighborLossCountEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimNeighborLossCountEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimNeighborLossCount", "1.3.6.1.2.1.157.1.30", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInvalidRegisterNotificationPeriodEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInvalidRegisterNotificationPeriodEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInvalidRegisterNotificationPeriod", "1.3.6.1.2.1.157.1.31", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInvalidRegisterMsgsRcvdEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInvalidRegisterMsgsRcvdEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInvalidRegisterMsgsRcvd", "1.3.6.1.2.1.157.1.32", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInvalidRegisterAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInvalidRegisterAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInvalidRegisterAddressType", "1.3.6.1.2.1.157.1.33", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInvalidRegisterOriginEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInvalidRegisterOriginEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInvalidRegisterOrigin", "1.3.6.1.2.1.157.1.34", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInvalidRegisterGroupEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInvalidRegisterGroupEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInvalidRegisterGroup", "1.3.6.1.2.1.157.1.35", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInvalidRegisterRpEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInvalidRegisterRpEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInvalidRegisterRp", "1.3.6.1.2.1.157.1.36", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInvalidJoinPruneNotificationPeriodEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInvalidJoinPruneNotificationPeriodEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInvalidJoinPruneNotificationPeriod", "1.3.6.1.2.1.157.1.37", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInvalidJoinPruneMsgsRcvdEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInvalidJoinPruneMsgsRcvdEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInvalidJoinPruneMsgsRcvd", "1.3.6.1.2.1.157.1.38", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInvalidJoinPruneAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInvalidJoinPruneAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInvalidJoinPruneAddressType", "1.3.6.1.2.1.157.1.39", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInvalidJoinPruneOriginEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInvalidJoinPruneOriginEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInvalidJoinPruneOrigin", "1.3.6.1.2.1.157.1.40", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInvalidJoinPruneGroupEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInvalidJoinPruneGroupEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInvalidJoinPruneGroup", "1.3.6.1.2.1.157.1.41", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInvalidJoinPruneRpEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInvalidJoinPruneRpEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInvalidJoinPruneRp", "1.3.6.1.2.1.157.1.42", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimRPMappingNotificationPeriodEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimRPMappingNotificationPeriodEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimRPMappingNotificationPeriod", "1.3.6.1.2.1.157.1.43", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimRPMappingChangeCountEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimRPMappingChangeCountEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimRPMappingChangeCount", "1.3.6.1.2.1.157.1.44", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInterfaceElectionNotificationPeriodEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInterfaceElectionNotificationPeriodEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInterfaceElectionNotificationPeriod", "1.3.6.1.2.1.157.1.45", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInterfaceElectionWinCountEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimInterfaceElectionWinCountEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInterfaceElectionWinCount", "1.3.6.1.2.1.157.1.46", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimRefreshIntervalEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimRefreshIntervalEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimRefreshInterval", "1.3.6.1.2.1.157.1.47", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimDeviceConfigStorageTypeEnt extends MIBEntry<PIMSTDMIBDef>
            {
                private PimDeviceConfigStorageTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimDeviceConfigStorageType", "1.3.6.1.2.1.157.1.48", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PimInterfaceTableEnt extends MIBEntry<PIMSTDMIBDef>
            {
                public final PimInterfaceEntryEnt pimInterfaceEntry;

                private PimInterfaceTableEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimInterfaceTable", "1.3.6.1.2.1.157.1.1", false, true, false, false);
                    this.pimInterfaceEntry = new PimInterfaceEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimInterfaceEntry
                    };
                }
                public static final class PimInterfaceEntryEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    public final PimInterfaceIfIndexEnt pimInterfaceIfIndex;

                    public final PimInterfaceIPVersionEnt pimInterfaceIPVersion;

                    public final PimInterfaceAddressTypeEnt pimInterfaceAddressType;

                    public final PimInterfaceAddressEnt pimInterfaceAddress;

                    public final PimInterfaceGenerationIDValueEnt pimInterfaceGenerationIDValue;

                    public final PimInterfaceDREnt pimInterfaceDR;

                    public final PimInterfaceDRPriorityEnt pimInterfaceDRPriority;

                    public final PimInterfaceDRPriorityEnabledEnt pimInterfaceDRPriorityEnabled;

                    public final PimInterfaceHelloIntervalEnt pimInterfaceHelloInterval;

                    public final PimInterfaceTrigHelloIntervalEnt pimInterfaceTrigHelloInterval;

                    public final PimInterfaceHelloHoldtimeEnt pimInterfaceHelloHoldtime;

                    public final PimInterfaceJoinPruneIntervalEnt pimInterfaceJoinPruneInterval;

                    public final PimInterfaceJoinPruneHoldtimeEnt pimInterfaceJoinPruneHoldtime;

                    public final PimInterfaceDFElectionRobustnessEnt pimInterfaceDFElectionRobustness;

                    public final PimInterfaceLanDelayEnabledEnt pimInterfaceLanDelayEnabled;

                    public final PimInterfacePropagationDelayEnt pimInterfacePropagationDelay;

                    public final PimInterfaceOverrideIntervalEnt pimInterfaceOverrideInterval;

                    public final PimInterfaceEffectPropagDelayEnt pimInterfaceEffectPropagDelay;

                    public final PimInterfaceEffectOverrideIvlEnt pimInterfaceEffectOverrideIvl;

                    public final PimInterfaceSuppressionEnabledEnt pimInterfaceSuppressionEnabled;

                    public final PimInterfaceBidirCapableEnt pimInterfaceBidirCapable;

                    public final PimInterfaceDomainBorderEnt pimInterfaceDomainBorder;

                    public final PimInterfaceStubInterfaceEnt pimInterfaceStubInterface;

                    public final PimInterfacePruneLimitIntervalEnt pimInterfacePruneLimitInterval;

                    public final PimInterfaceGraftRetryIntervalEnt pimInterfaceGraftRetryInterval;

                    public final PimInterfaceSRPriorityEnabledEnt pimInterfaceSRPriorityEnabled;

                    public final PimInterfaceStatusEnt pimInterfaceStatus;

                    public final PimInterfaceStorageTypeEnt pimInterfaceStorageType;

                    private PimInterfaceEntryEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimInterfaceEntry", "1.3.6.1.2.1.157.1.1.1", false, false, false, true);
                        this.pimInterfaceIfIndex = new PimInterfaceIfIndexEnt(mib, this);
                        this.pimInterfaceIPVersion = new PimInterfaceIPVersionEnt(mib, this);
                        this.pimInterfaceAddressType = new PimInterfaceAddressTypeEnt(mib, this);
                        this.pimInterfaceAddress = new PimInterfaceAddressEnt(mib, this);
                        this.pimInterfaceGenerationIDValue = new PimInterfaceGenerationIDValueEnt(mib, this);
                        this.pimInterfaceDR = new PimInterfaceDREnt(mib, this);
                        this.pimInterfaceDRPriority = new PimInterfaceDRPriorityEnt(mib, this);
                        this.pimInterfaceDRPriorityEnabled = new PimInterfaceDRPriorityEnabledEnt(mib, this);
                        this.pimInterfaceHelloInterval = new PimInterfaceHelloIntervalEnt(mib, this);
                        this.pimInterfaceTrigHelloInterval = new PimInterfaceTrigHelloIntervalEnt(mib, this);
                        this.pimInterfaceHelloHoldtime = new PimInterfaceHelloHoldtimeEnt(mib, this);
                        this.pimInterfaceJoinPruneInterval = new PimInterfaceJoinPruneIntervalEnt(mib, this);
                        this.pimInterfaceJoinPruneHoldtime = new PimInterfaceJoinPruneHoldtimeEnt(mib, this);
                        this.pimInterfaceDFElectionRobustness = new PimInterfaceDFElectionRobustnessEnt(mib, this);
                        this.pimInterfaceLanDelayEnabled = new PimInterfaceLanDelayEnabledEnt(mib, this);
                        this.pimInterfacePropagationDelay = new PimInterfacePropagationDelayEnt(mib, this);
                        this.pimInterfaceOverrideInterval = new PimInterfaceOverrideIntervalEnt(mib, this);
                        this.pimInterfaceEffectPropagDelay = new PimInterfaceEffectPropagDelayEnt(mib, this);
                        this.pimInterfaceEffectOverrideIvl = new PimInterfaceEffectOverrideIvlEnt(mib, this);
                        this.pimInterfaceSuppressionEnabled = new PimInterfaceSuppressionEnabledEnt(mib, this);
                        this.pimInterfaceBidirCapable = new PimInterfaceBidirCapableEnt(mib, this);
                        this.pimInterfaceDomainBorder = new PimInterfaceDomainBorderEnt(mib, this);
                        this.pimInterfaceStubInterface = new PimInterfaceStubInterfaceEnt(mib, this);
                        this.pimInterfacePruneLimitInterval = new PimInterfacePruneLimitIntervalEnt(mib, this);
                        this.pimInterfaceGraftRetryInterval = new PimInterfaceGraftRetryIntervalEnt(mib, this);
                        this.pimInterfaceSRPriorityEnabled = new PimInterfaceSRPriorityEnabledEnt(mib, this);
                        this.pimInterfaceStatus = new PimInterfaceStatusEnt(mib, this);
                        this.pimInterfaceStorageType = new PimInterfaceStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimInterfaceIfIndex,
                            this.pimInterfaceIPVersion,
                            this.pimInterfaceAddressType,
                            this.pimInterfaceAddress,
                            this.pimInterfaceGenerationIDValue,
                            this.pimInterfaceDR,
                            this.pimInterfaceDRPriority,
                            this.pimInterfaceDRPriorityEnabled,
                            this.pimInterfaceHelloInterval,
                            this.pimInterfaceTrigHelloInterval,
                            this.pimInterfaceHelloHoldtime,
                            this.pimInterfaceJoinPruneInterval,
                            this.pimInterfaceJoinPruneHoldtime,
                            this.pimInterfaceDFElectionRobustness,
                            this.pimInterfaceLanDelayEnabled,
                            this.pimInterfacePropagationDelay,
                            this.pimInterfaceOverrideInterval,
                            this.pimInterfaceEffectPropagDelay,
                            this.pimInterfaceEffectOverrideIvl,
                            this.pimInterfaceSuppressionEnabled,
                            this.pimInterfaceBidirCapable,
                            this.pimInterfaceDomainBorder,
                            this.pimInterfaceStubInterface,
                            this.pimInterfacePruneLimitInterval,
                            this.pimInterfaceGraftRetryInterval,
                            this.pimInterfaceSRPriorityEnabled,
                            this.pimInterfaceStatus,
                            this.pimInterfaceStorageType
                        };
                    }
                    public static final class PimInterfaceIfIndexEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceIfIndexEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceIfIndex", "1.3.6.1.2.1.157.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceIPVersionEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceIPVersionEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceIPVersion", "1.3.6.1.2.1.157.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceAddressType", "1.3.6.1.2.1.157.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceAddress", "1.3.6.1.2.1.157.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceGenerationIDValueEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceGenerationIDValueEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceGenerationIDValue", "1.3.6.1.2.1.157.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceDREnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceDREnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceDR", "1.3.6.1.2.1.157.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceDRPriorityEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceDRPriorityEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceDRPriority", "1.3.6.1.2.1.157.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceDRPriorityEnabledEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceDRPriorityEnabledEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceDRPriorityEnabled", "1.3.6.1.2.1.157.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceHelloIntervalEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceHelloIntervalEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceHelloInterval", "1.3.6.1.2.1.157.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceTrigHelloIntervalEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceTrigHelloIntervalEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceTrigHelloInterval", "1.3.6.1.2.1.157.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceHelloHoldtimeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceHelloHoldtimeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceHelloHoldtime", "1.3.6.1.2.1.157.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceJoinPruneIntervalEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceJoinPruneIntervalEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceJoinPruneInterval", "1.3.6.1.2.1.157.1.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceJoinPruneHoldtimeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceJoinPruneHoldtimeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceJoinPruneHoldtime", "1.3.6.1.2.1.157.1.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceDFElectionRobustnessEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceDFElectionRobustnessEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceDFElectionRobustness", "1.3.6.1.2.1.157.1.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceLanDelayEnabledEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceLanDelayEnabledEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceLanDelayEnabled", "1.3.6.1.2.1.157.1.1.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfacePropagationDelayEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfacePropagationDelayEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfacePropagationDelay", "1.3.6.1.2.1.157.1.1.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceOverrideIntervalEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceOverrideIntervalEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceOverrideInterval", "1.3.6.1.2.1.157.1.1.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceEffectPropagDelayEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceEffectPropagDelayEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceEffectPropagDelay", "1.3.6.1.2.1.157.1.1.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceEffectOverrideIvlEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceEffectOverrideIvlEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceEffectOverrideIvl", "1.3.6.1.2.1.157.1.1.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceSuppressionEnabledEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceSuppressionEnabledEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceSuppressionEnabled", "1.3.6.1.2.1.157.1.1.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceBidirCapableEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceBidirCapableEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceBidirCapable", "1.3.6.1.2.1.157.1.1.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceDomainBorderEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceDomainBorderEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceDomainBorder", "1.3.6.1.2.1.157.1.1.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceStubInterfaceEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceStubInterfaceEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceStubInterface", "1.3.6.1.2.1.157.1.1.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfacePruneLimitIntervalEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfacePruneLimitIntervalEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfacePruneLimitInterval", "1.3.6.1.2.1.157.1.1.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceGraftRetryIntervalEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceGraftRetryIntervalEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceGraftRetryInterval", "1.3.6.1.2.1.157.1.1.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceSRPriorityEnabledEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceSRPriorityEnabledEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceSRPriorityEnabled", "1.3.6.1.2.1.157.1.1.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceStatusEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceStatusEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceStatus", "1.3.6.1.2.1.157.1.1.1.27", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimInterfaceStorageTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimInterfaceStorageTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimInterfaceStorageType", "1.3.6.1.2.1.157.1.1.1.28", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PimNeighborTableEnt extends MIBEntry<PIMSTDMIBDef>
            {
                public final PimNeighborEntryEnt pimNeighborEntry;

                private PimNeighborTableEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimNeighborTable", "1.3.6.1.2.1.157.1.2", false, true, false, false);
                    this.pimNeighborEntry = new PimNeighborEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimNeighborEntry
                    };
                }
                public static final class PimNeighborEntryEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    public final PimNeighborIfIndexEnt pimNeighborIfIndex;

                    public final PimNeighborAddressTypeEnt pimNeighborAddressType;

                    public final PimNeighborAddressEnt pimNeighborAddress;

                    public final PimNeighborGenerationIDPresentEnt pimNeighborGenerationIDPresent;

                    public final PimNeighborGenerationIDValueEnt pimNeighborGenerationIDValue;

                    public final PimNeighborUpTimeEnt pimNeighborUpTime;

                    public final PimNeighborExpiryTimeEnt pimNeighborExpiryTime;

                    public final PimNeighborDRPriorityPresentEnt pimNeighborDRPriorityPresent;

                    public final PimNeighborDRPriorityEnt pimNeighborDRPriority;

                    public final PimNeighborLanPruneDelayPresentEnt pimNeighborLanPruneDelayPresent;

                    public final PimNeighborTBitEnt pimNeighborTBit;

                    public final PimNeighborPropagationDelayEnt pimNeighborPropagationDelay;

                    public final PimNeighborOverrideIntervalEnt pimNeighborOverrideInterval;

                    public final PimNeighborBidirCapableEnt pimNeighborBidirCapable;

                    public final PimNeighborSRCapableEnt pimNeighborSRCapable;

                    private PimNeighborEntryEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimNeighborEntry", "1.3.6.1.2.1.157.1.2.1", false, false, false, true);
                        this.pimNeighborIfIndex = new PimNeighborIfIndexEnt(mib, this);
                        this.pimNeighborAddressType = new PimNeighborAddressTypeEnt(mib, this);
                        this.pimNeighborAddress = new PimNeighborAddressEnt(mib, this);
                        this.pimNeighborGenerationIDPresent = new PimNeighborGenerationIDPresentEnt(mib, this);
                        this.pimNeighborGenerationIDValue = new PimNeighborGenerationIDValueEnt(mib, this);
                        this.pimNeighborUpTime = new PimNeighborUpTimeEnt(mib, this);
                        this.pimNeighborExpiryTime = new PimNeighborExpiryTimeEnt(mib, this);
                        this.pimNeighborDRPriorityPresent = new PimNeighborDRPriorityPresentEnt(mib, this);
                        this.pimNeighborDRPriority = new PimNeighborDRPriorityEnt(mib, this);
                        this.pimNeighborLanPruneDelayPresent = new PimNeighborLanPruneDelayPresentEnt(mib, this);
                        this.pimNeighborTBit = new PimNeighborTBitEnt(mib, this);
                        this.pimNeighborPropagationDelay = new PimNeighborPropagationDelayEnt(mib, this);
                        this.pimNeighborOverrideInterval = new PimNeighborOverrideIntervalEnt(mib, this);
                        this.pimNeighborBidirCapable = new PimNeighborBidirCapableEnt(mib, this);
                        this.pimNeighborSRCapable = new PimNeighborSRCapableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimNeighborIfIndex,
                            this.pimNeighborAddressType,
                            this.pimNeighborAddress,
                            this.pimNeighborGenerationIDPresent,
                            this.pimNeighborGenerationIDValue,
                            this.pimNeighborUpTime,
                            this.pimNeighborExpiryTime,
                            this.pimNeighborDRPriorityPresent,
                            this.pimNeighborDRPriority,
                            this.pimNeighborLanPruneDelayPresent,
                            this.pimNeighborTBit,
                            this.pimNeighborPropagationDelay,
                            this.pimNeighborOverrideInterval,
                            this.pimNeighborBidirCapable,
                            this.pimNeighborSRCapable
                        };
                    }
                    public static final class PimNeighborIfIndexEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNeighborIfIndexEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNeighborIfIndex", "1.3.6.1.2.1.157.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimNeighborAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNeighborAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNeighborAddressType", "1.3.6.1.2.1.157.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimNeighborAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNeighborAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNeighborAddress", "1.3.6.1.2.1.157.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimNeighborGenerationIDPresentEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNeighborGenerationIDPresentEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNeighborGenerationIDPresent", "1.3.6.1.2.1.157.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimNeighborGenerationIDValueEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNeighborGenerationIDValueEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNeighborGenerationIDValue", "1.3.6.1.2.1.157.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimNeighborUpTimeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNeighborUpTimeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNeighborUpTime", "1.3.6.1.2.1.157.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimNeighborExpiryTimeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNeighborExpiryTimeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNeighborExpiryTime", "1.3.6.1.2.1.157.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimNeighborDRPriorityPresentEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNeighborDRPriorityPresentEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNeighborDRPriorityPresent", "1.3.6.1.2.1.157.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimNeighborDRPriorityEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNeighborDRPriorityEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNeighborDRPriority", "1.3.6.1.2.1.157.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimNeighborLanPruneDelayPresentEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNeighborLanPruneDelayPresentEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNeighborLanPruneDelayPresent", "1.3.6.1.2.1.157.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimNeighborTBitEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNeighborTBitEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNeighborTBit", "1.3.6.1.2.1.157.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimNeighborPropagationDelayEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNeighborPropagationDelayEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNeighborPropagationDelay", "1.3.6.1.2.1.157.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimNeighborOverrideIntervalEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNeighborOverrideIntervalEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNeighborOverrideInterval", "1.3.6.1.2.1.157.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimNeighborBidirCapableEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNeighborBidirCapableEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNeighborBidirCapable", "1.3.6.1.2.1.157.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimNeighborSRCapableEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNeighborSRCapableEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNeighborSRCapable", "1.3.6.1.2.1.157.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PimNbrSecAddressTableEnt extends MIBEntry<PIMSTDMIBDef>
            {
                public final PimNbrSecAddressEntryEnt pimNbrSecAddressEntry;

                private PimNbrSecAddressTableEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimNbrSecAddressTable", "1.3.6.1.2.1.157.1.3", false, true, false, false);
                    this.pimNbrSecAddressEntry = new PimNbrSecAddressEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimNbrSecAddressEntry
                    };
                }
                public static final class PimNbrSecAddressEntryEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    public final PimNbrSecAddressIfIndexEnt pimNbrSecAddressIfIndex;

                    public final PimNbrSecAddressTypeEnt pimNbrSecAddressType;

                    public final PimNbrSecAddressPrimaryEnt pimNbrSecAddressPrimary;

                    public final PimNbrSecAddressEnt pimNbrSecAddress;

                    private PimNbrSecAddressEntryEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimNbrSecAddressEntry", "1.3.6.1.2.1.157.1.3.1", false, false, false, true);
                        this.pimNbrSecAddressIfIndex = new PimNbrSecAddressIfIndexEnt(mib, this);
                        this.pimNbrSecAddressType = new PimNbrSecAddressTypeEnt(mib, this);
                        this.pimNbrSecAddressPrimary = new PimNbrSecAddressPrimaryEnt(mib, this);
                        this.pimNbrSecAddress = new PimNbrSecAddressEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimNbrSecAddressIfIndex,
                            this.pimNbrSecAddressType,
                            this.pimNbrSecAddressPrimary,
                            this.pimNbrSecAddress
                        };
                    }
                    public static final class PimNbrSecAddressIfIndexEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNbrSecAddressIfIndexEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNbrSecAddressIfIndex", "1.3.6.1.2.1.157.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimNbrSecAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNbrSecAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNbrSecAddressType", "1.3.6.1.2.1.157.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimNbrSecAddressPrimaryEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNbrSecAddressPrimaryEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNbrSecAddressPrimary", "1.3.6.1.2.1.157.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimNbrSecAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimNbrSecAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimNbrSecAddress", "1.3.6.1.2.1.157.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PimStarGTableEnt extends MIBEntry<PIMSTDMIBDef>
            {
                public final PimStarGEntryEnt pimStarGEntry;

                private PimStarGTableEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimStarGTable", "1.3.6.1.2.1.157.1.4", false, true, false, false);
                    this.pimStarGEntry = new PimStarGEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimStarGEntry
                    };
                }
                public static final class PimStarGEntryEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    public final PimStarGAddressTypeEnt pimStarGAddressType;

                    public final PimStarGGrpAddressEnt pimStarGGrpAddress;

                    public final PimStarGUpTimeEnt pimStarGUpTime;

                    public final PimStarGPimModeEnt pimStarGPimMode;

                    public final PimStarGRPAddressTypeEnt pimStarGRPAddressType;

                    public final PimStarGRPAddressEnt pimStarGRPAddress;

                    public final PimStarGPimModeOriginEnt pimStarGPimModeOrigin;

                    public final PimStarGRPIsLocalEnt pimStarGRPIsLocal;

                    public final PimStarGUpstreamJoinStateEnt pimStarGUpstreamJoinState;

                    public final PimStarGUpstreamJoinTimerEnt pimStarGUpstreamJoinTimer;

                    public final PimStarGUpstreamNeighborTypeEnt pimStarGUpstreamNeighborType;

                    public final PimStarGUpstreamNeighborEnt pimStarGUpstreamNeighbor;

                    public final PimStarGRPFIfIndexEnt pimStarGRPFIfIndex;

                    public final PimStarGRPFNextHopTypeEnt pimStarGRPFNextHopType;

                    public final PimStarGRPFNextHopEnt pimStarGRPFNextHop;

                    public final PimStarGRPFRouteProtocolEnt pimStarGRPFRouteProtocol;

                    public final PimStarGRPFRouteAddressEnt pimStarGRPFRouteAddress;

                    public final PimStarGRPFRoutePrefixLengthEnt pimStarGRPFRoutePrefixLength;

                    public final PimStarGRPFRouteMetricPrefEnt pimStarGRPFRouteMetricPref;

                    public final PimStarGRPFRouteMetricEnt pimStarGRPFRouteMetric;

                    private PimStarGEntryEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimStarGEntry", "1.3.6.1.2.1.157.1.4.1", false, false, false, true);
                        this.pimStarGAddressType = new PimStarGAddressTypeEnt(mib, this);
                        this.pimStarGGrpAddress = new PimStarGGrpAddressEnt(mib, this);
                        this.pimStarGUpTime = new PimStarGUpTimeEnt(mib, this);
                        this.pimStarGPimMode = new PimStarGPimModeEnt(mib, this);
                        this.pimStarGRPAddressType = new PimStarGRPAddressTypeEnt(mib, this);
                        this.pimStarGRPAddress = new PimStarGRPAddressEnt(mib, this);
                        this.pimStarGPimModeOrigin = new PimStarGPimModeOriginEnt(mib, this);
                        this.pimStarGRPIsLocal = new PimStarGRPIsLocalEnt(mib, this);
                        this.pimStarGUpstreamJoinState = new PimStarGUpstreamJoinStateEnt(mib, this);
                        this.pimStarGUpstreamJoinTimer = new PimStarGUpstreamJoinTimerEnt(mib, this);
                        this.pimStarGUpstreamNeighborType = new PimStarGUpstreamNeighborTypeEnt(mib, this);
                        this.pimStarGUpstreamNeighbor = new PimStarGUpstreamNeighborEnt(mib, this);
                        this.pimStarGRPFIfIndex = new PimStarGRPFIfIndexEnt(mib, this);
                        this.pimStarGRPFNextHopType = new PimStarGRPFNextHopTypeEnt(mib, this);
                        this.pimStarGRPFNextHop = new PimStarGRPFNextHopEnt(mib, this);
                        this.pimStarGRPFRouteProtocol = new PimStarGRPFRouteProtocolEnt(mib, this);
                        this.pimStarGRPFRouteAddress = new PimStarGRPFRouteAddressEnt(mib, this);
                        this.pimStarGRPFRoutePrefixLength = new PimStarGRPFRoutePrefixLengthEnt(mib, this);
                        this.pimStarGRPFRouteMetricPref = new PimStarGRPFRouteMetricPrefEnt(mib, this);
                        this.pimStarGRPFRouteMetric = new PimStarGRPFRouteMetricEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimStarGAddressType,
                            this.pimStarGGrpAddress,
                            this.pimStarGUpTime,
                            this.pimStarGPimMode,
                            this.pimStarGRPAddressType,
                            this.pimStarGRPAddress,
                            this.pimStarGPimModeOrigin,
                            this.pimStarGRPIsLocal,
                            this.pimStarGUpstreamJoinState,
                            this.pimStarGUpstreamJoinTimer,
                            this.pimStarGUpstreamNeighborType,
                            this.pimStarGUpstreamNeighbor,
                            this.pimStarGRPFIfIndex,
                            this.pimStarGRPFNextHopType,
                            this.pimStarGRPFNextHop,
                            this.pimStarGRPFRouteProtocol,
                            this.pimStarGRPFRouteAddress,
                            this.pimStarGRPFRoutePrefixLength,
                            this.pimStarGRPFRouteMetricPref,
                            this.pimStarGRPFRouteMetric
                        };
                    }
                    public static final class PimStarGAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGAddressType", "1.3.6.1.2.1.157.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGGrpAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGGrpAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGGrpAddress", "1.3.6.1.2.1.157.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGUpTimeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGUpTimeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGUpTime", "1.3.6.1.2.1.157.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGPimModeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGPimModeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGPimMode", "1.3.6.1.2.1.157.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGRPAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGRPAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGRPAddressType", "1.3.6.1.2.1.157.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGRPAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGRPAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGRPAddress", "1.3.6.1.2.1.157.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGPimModeOriginEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGPimModeOriginEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGPimModeOrigin", "1.3.6.1.2.1.157.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGRPIsLocalEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGRPIsLocalEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGRPIsLocal", "1.3.6.1.2.1.157.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGUpstreamJoinStateEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGUpstreamJoinStateEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGUpstreamJoinState", "1.3.6.1.2.1.157.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGUpstreamJoinTimerEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGUpstreamJoinTimerEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGUpstreamJoinTimer", "1.3.6.1.2.1.157.1.4.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGUpstreamNeighborTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGUpstreamNeighborTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGUpstreamNeighborType", "1.3.6.1.2.1.157.1.4.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGUpstreamNeighborEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGUpstreamNeighborEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGUpstreamNeighbor", "1.3.6.1.2.1.157.1.4.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGRPFIfIndexEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGRPFIfIndexEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGRPFIfIndex", "1.3.6.1.2.1.157.1.4.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGRPFNextHopTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGRPFNextHopTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGRPFNextHopType", "1.3.6.1.2.1.157.1.4.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGRPFNextHopEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGRPFNextHopEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGRPFNextHop", "1.3.6.1.2.1.157.1.4.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGRPFRouteProtocolEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGRPFRouteProtocolEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGRPFRouteProtocol", "1.3.6.1.2.1.157.1.4.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGRPFRouteAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGRPFRouteAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGRPFRouteAddress", "1.3.6.1.2.1.157.1.4.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGRPFRoutePrefixLengthEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGRPFRoutePrefixLengthEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGRPFRoutePrefixLength", "1.3.6.1.2.1.157.1.4.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGRPFRouteMetricPrefEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGRPFRouteMetricPrefEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGRPFRouteMetricPref", "1.3.6.1.2.1.157.1.4.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGRPFRouteMetricEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGRPFRouteMetricEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGRPFRouteMetric", "1.3.6.1.2.1.157.1.4.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PimStarGITableEnt extends MIBEntry<PIMSTDMIBDef>
            {
                public final PimStarGIEntryEnt pimStarGIEntry;

                private PimStarGITableEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimStarGITable", "1.3.6.1.2.1.157.1.5", false, true, false, false);
                    this.pimStarGIEntry = new PimStarGIEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimStarGIEntry
                    };
                }
                public static final class PimStarGIEntryEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    public final PimStarGIIfIndexEnt pimStarGIIfIndex;

                    public final PimStarGIUpTimeEnt pimStarGIUpTime;

                    public final PimStarGILocalMembershipEnt pimStarGILocalMembership;

                    public final PimStarGIJoinPruneStateEnt pimStarGIJoinPruneState;

                    public final PimStarGIPrunePendingTimerEnt pimStarGIPrunePendingTimer;

                    public final PimStarGIJoinExpiryTimerEnt pimStarGIJoinExpiryTimer;

                    public final PimStarGIAssertStateEnt pimStarGIAssertState;

                    public final PimStarGIAssertTimerEnt pimStarGIAssertTimer;

                    public final PimStarGIAssertWinnerAddressTypeEnt pimStarGIAssertWinnerAddressType;

                    public final PimStarGIAssertWinnerAddressEnt pimStarGIAssertWinnerAddress;

                    public final PimStarGIAssertWinnerMetricPrefEnt pimStarGIAssertWinnerMetricPref;

                    public final PimStarGIAssertWinnerMetricEnt pimStarGIAssertWinnerMetric;

                    private PimStarGIEntryEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimStarGIEntry", "1.3.6.1.2.1.157.1.5.1", false, false, false, true);
                        this.pimStarGIIfIndex = new PimStarGIIfIndexEnt(mib, this);
                        this.pimStarGIUpTime = new PimStarGIUpTimeEnt(mib, this);
                        this.pimStarGILocalMembership = new PimStarGILocalMembershipEnt(mib, this);
                        this.pimStarGIJoinPruneState = new PimStarGIJoinPruneStateEnt(mib, this);
                        this.pimStarGIPrunePendingTimer = new PimStarGIPrunePendingTimerEnt(mib, this);
                        this.pimStarGIJoinExpiryTimer = new PimStarGIJoinExpiryTimerEnt(mib, this);
                        this.pimStarGIAssertState = new PimStarGIAssertStateEnt(mib, this);
                        this.pimStarGIAssertTimer = new PimStarGIAssertTimerEnt(mib, this);
                        this.pimStarGIAssertWinnerAddressType = new PimStarGIAssertWinnerAddressTypeEnt(mib, this);
                        this.pimStarGIAssertWinnerAddress = new PimStarGIAssertWinnerAddressEnt(mib, this);
                        this.pimStarGIAssertWinnerMetricPref = new PimStarGIAssertWinnerMetricPrefEnt(mib, this);
                        this.pimStarGIAssertWinnerMetric = new PimStarGIAssertWinnerMetricEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimStarGIIfIndex,
                            this.pimStarGIUpTime,
                            this.pimStarGILocalMembership,
                            this.pimStarGIJoinPruneState,
                            this.pimStarGIPrunePendingTimer,
                            this.pimStarGIJoinExpiryTimer,
                            this.pimStarGIAssertState,
                            this.pimStarGIAssertTimer,
                            this.pimStarGIAssertWinnerAddressType,
                            this.pimStarGIAssertWinnerAddress,
                            this.pimStarGIAssertWinnerMetricPref,
                            this.pimStarGIAssertWinnerMetric
                        };
                    }
                    public static final class PimStarGIIfIndexEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGIIfIndexEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGIIfIndex", "1.3.6.1.2.1.157.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGIUpTimeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGIUpTimeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGIUpTime", "1.3.6.1.2.1.157.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGILocalMembershipEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGILocalMembershipEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGILocalMembership", "1.3.6.1.2.1.157.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGIJoinPruneStateEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGIJoinPruneStateEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGIJoinPruneState", "1.3.6.1.2.1.157.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGIPrunePendingTimerEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGIPrunePendingTimerEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGIPrunePendingTimer", "1.3.6.1.2.1.157.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGIJoinExpiryTimerEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGIJoinExpiryTimerEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGIJoinExpiryTimer", "1.3.6.1.2.1.157.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGIAssertStateEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGIAssertStateEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGIAssertState", "1.3.6.1.2.1.157.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGIAssertTimerEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGIAssertTimerEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGIAssertTimer", "1.3.6.1.2.1.157.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGIAssertWinnerAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGIAssertWinnerAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGIAssertWinnerAddressType", "1.3.6.1.2.1.157.1.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGIAssertWinnerAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGIAssertWinnerAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGIAssertWinnerAddress", "1.3.6.1.2.1.157.1.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGIAssertWinnerMetricPrefEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGIAssertWinnerMetricPrefEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGIAssertWinnerMetricPref", "1.3.6.1.2.1.157.1.5.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStarGIAssertWinnerMetricEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStarGIAssertWinnerMetricEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStarGIAssertWinnerMetric", "1.3.6.1.2.1.157.1.5.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PimSGTableEnt extends MIBEntry<PIMSTDMIBDef>
            {
                public final PimSGEntryEnt pimSGEntry;

                private PimSGTableEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimSGTable", "1.3.6.1.2.1.157.1.6", false, true, false, false);
                    this.pimSGEntry = new PimSGEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimSGEntry
                    };
                }
                public static final class PimSGEntryEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    public final PimSGAddressTypeEnt pimSGAddressType;

                    public final PimSGGrpAddressEnt pimSGGrpAddress;

                    public final PimSGSrcAddressEnt pimSGSrcAddress;

                    public final PimSGUpTimeEnt pimSGUpTime;

                    public final PimSGPimModeEnt pimSGPimMode;

                    public final PimSGUpstreamJoinStateEnt pimSGUpstreamJoinState;

                    public final PimSGUpstreamJoinTimerEnt pimSGUpstreamJoinTimer;

                    public final PimSGUpstreamNeighborEnt pimSGUpstreamNeighbor;

                    public final PimSGRPFIfIndexEnt pimSGRPFIfIndex;

                    public final PimSGRPFNextHopTypeEnt pimSGRPFNextHopType;

                    public final PimSGRPFNextHopEnt pimSGRPFNextHop;

                    public final PimSGRPFRouteProtocolEnt pimSGRPFRouteProtocol;

                    public final PimSGRPFRouteAddressEnt pimSGRPFRouteAddress;

                    public final PimSGRPFRoutePrefixLengthEnt pimSGRPFRoutePrefixLength;

                    public final PimSGRPFRouteMetricPrefEnt pimSGRPFRouteMetricPref;

                    public final PimSGRPFRouteMetricEnt pimSGRPFRouteMetric;

                    public final PimSGSPTBitEnt pimSGSPTBit;

                    public final PimSGKeepaliveTimerEnt pimSGKeepaliveTimer;

                    public final PimSGDRRegisterStateEnt pimSGDRRegisterState;

                    public final PimSGDRRegisterStopTimerEnt pimSGDRRegisterStopTimer;

                    public final PimSGRPRegisterPMBRAddressTypeEnt pimSGRPRegisterPMBRAddressType;

                    public final PimSGRPRegisterPMBRAddressEnt pimSGRPRegisterPMBRAddress;

                    public final PimSGUpstreamPruneStateEnt pimSGUpstreamPruneState;

                    public final PimSGUpstreamPruneLimitTimerEnt pimSGUpstreamPruneLimitTimer;

                    public final PimSGOriginatorStateEnt pimSGOriginatorState;

                    public final PimSGSourceActiveTimerEnt pimSGSourceActiveTimer;

                    public final PimSGStateRefreshTimerEnt pimSGStateRefreshTimer;

                    private PimSGEntryEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimSGEntry", "1.3.6.1.2.1.157.1.6.1", false, false, false, true);
                        this.pimSGAddressType = new PimSGAddressTypeEnt(mib, this);
                        this.pimSGGrpAddress = new PimSGGrpAddressEnt(mib, this);
                        this.pimSGSrcAddress = new PimSGSrcAddressEnt(mib, this);
                        this.pimSGUpTime = new PimSGUpTimeEnt(mib, this);
                        this.pimSGPimMode = new PimSGPimModeEnt(mib, this);
                        this.pimSGUpstreamJoinState = new PimSGUpstreamJoinStateEnt(mib, this);
                        this.pimSGUpstreamJoinTimer = new PimSGUpstreamJoinTimerEnt(mib, this);
                        this.pimSGUpstreamNeighbor = new PimSGUpstreamNeighborEnt(mib, this);
                        this.pimSGRPFIfIndex = new PimSGRPFIfIndexEnt(mib, this);
                        this.pimSGRPFNextHopType = new PimSGRPFNextHopTypeEnt(mib, this);
                        this.pimSGRPFNextHop = new PimSGRPFNextHopEnt(mib, this);
                        this.pimSGRPFRouteProtocol = new PimSGRPFRouteProtocolEnt(mib, this);
                        this.pimSGRPFRouteAddress = new PimSGRPFRouteAddressEnt(mib, this);
                        this.pimSGRPFRoutePrefixLength = new PimSGRPFRoutePrefixLengthEnt(mib, this);
                        this.pimSGRPFRouteMetricPref = new PimSGRPFRouteMetricPrefEnt(mib, this);
                        this.pimSGRPFRouteMetric = new PimSGRPFRouteMetricEnt(mib, this);
                        this.pimSGSPTBit = new PimSGSPTBitEnt(mib, this);
                        this.pimSGKeepaliveTimer = new PimSGKeepaliveTimerEnt(mib, this);
                        this.pimSGDRRegisterState = new PimSGDRRegisterStateEnt(mib, this);
                        this.pimSGDRRegisterStopTimer = new PimSGDRRegisterStopTimerEnt(mib, this);
                        this.pimSGRPRegisterPMBRAddressType = new PimSGRPRegisterPMBRAddressTypeEnt(mib, this);
                        this.pimSGRPRegisterPMBRAddress = new PimSGRPRegisterPMBRAddressEnt(mib, this);
                        this.pimSGUpstreamPruneState = new PimSGUpstreamPruneStateEnt(mib, this);
                        this.pimSGUpstreamPruneLimitTimer = new PimSGUpstreamPruneLimitTimerEnt(mib, this);
                        this.pimSGOriginatorState = new PimSGOriginatorStateEnt(mib, this);
                        this.pimSGSourceActiveTimer = new PimSGSourceActiveTimerEnt(mib, this);
                        this.pimSGStateRefreshTimer = new PimSGStateRefreshTimerEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimSGAddressType,
                            this.pimSGGrpAddress,
                            this.pimSGSrcAddress,
                            this.pimSGUpTime,
                            this.pimSGPimMode,
                            this.pimSGUpstreamJoinState,
                            this.pimSGUpstreamJoinTimer,
                            this.pimSGUpstreamNeighbor,
                            this.pimSGRPFIfIndex,
                            this.pimSGRPFNextHopType,
                            this.pimSGRPFNextHop,
                            this.pimSGRPFRouteProtocol,
                            this.pimSGRPFRouteAddress,
                            this.pimSGRPFRoutePrefixLength,
                            this.pimSGRPFRouteMetricPref,
                            this.pimSGRPFRouteMetric,
                            this.pimSGSPTBit,
                            this.pimSGKeepaliveTimer,
                            this.pimSGDRRegisterState,
                            this.pimSGDRRegisterStopTimer,
                            this.pimSGRPRegisterPMBRAddressType,
                            this.pimSGRPRegisterPMBRAddress,
                            this.pimSGUpstreamPruneState,
                            this.pimSGUpstreamPruneLimitTimer,
                            this.pimSGOriginatorState,
                            this.pimSGSourceActiveTimer,
                            this.pimSGStateRefreshTimer
                        };
                    }
                    public static final class PimSGAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGAddressType", "1.3.6.1.2.1.157.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGGrpAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGGrpAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGGrpAddress", "1.3.6.1.2.1.157.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGSrcAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGSrcAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGSrcAddress", "1.3.6.1.2.1.157.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGUpTimeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGUpTimeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGUpTime", "1.3.6.1.2.1.157.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGPimModeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGPimModeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGPimMode", "1.3.6.1.2.1.157.1.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGUpstreamJoinStateEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGUpstreamJoinStateEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGUpstreamJoinState", "1.3.6.1.2.1.157.1.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGUpstreamJoinTimerEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGUpstreamJoinTimerEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGUpstreamJoinTimer", "1.3.6.1.2.1.157.1.6.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGUpstreamNeighborEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGUpstreamNeighborEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGUpstreamNeighbor", "1.3.6.1.2.1.157.1.6.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRPFIfIndexEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRPFIfIndexEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRPFIfIndex", "1.3.6.1.2.1.157.1.6.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRPFNextHopTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRPFNextHopTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRPFNextHopType", "1.3.6.1.2.1.157.1.6.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRPFNextHopEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRPFNextHopEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRPFNextHop", "1.3.6.1.2.1.157.1.6.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRPFRouteProtocolEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRPFRouteProtocolEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRPFRouteProtocol", "1.3.6.1.2.1.157.1.6.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRPFRouteAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRPFRouteAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRPFRouteAddress", "1.3.6.1.2.1.157.1.6.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRPFRoutePrefixLengthEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRPFRoutePrefixLengthEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRPFRoutePrefixLength", "1.3.6.1.2.1.157.1.6.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRPFRouteMetricPrefEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRPFRouteMetricPrefEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRPFRouteMetricPref", "1.3.6.1.2.1.157.1.6.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRPFRouteMetricEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRPFRouteMetricEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRPFRouteMetric", "1.3.6.1.2.1.157.1.6.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGSPTBitEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGSPTBitEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGSPTBit", "1.3.6.1.2.1.157.1.6.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGKeepaliveTimerEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGKeepaliveTimerEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGKeepaliveTimer", "1.3.6.1.2.1.157.1.6.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGDRRegisterStateEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGDRRegisterStateEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGDRRegisterState", "1.3.6.1.2.1.157.1.6.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGDRRegisterStopTimerEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGDRRegisterStopTimerEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGDRRegisterStopTimer", "1.3.6.1.2.1.157.1.6.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRPRegisterPMBRAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRPRegisterPMBRAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRPRegisterPMBRAddressType", "1.3.6.1.2.1.157.1.6.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRPRegisterPMBRAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRPRegisterPMBRAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRPRegisterPMBRAddress", "1.3.6.1.2.1.157.1.6.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGUpstreamPruneStateEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGUpstreamPruneStateEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGUpstreamPruneState", "1.3.6.1.2.1.157.1.6.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGUpstreamPruneLimitTimerEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGUpstreamPruneLimitTimerEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGUpstreamPruneLimitTimer", "1.3.6.1.2.1.157.1.6.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGOriginatorStateEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGOriginatorStateEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGOriginatorState", "1.3.6.1.2.1.157.1.6.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGSourceActiveTimerEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGSourceActiveTimerEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGSourceActiveTimer", "1.3.6.1.2.1.157.1.6.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGStateRefreshTimerEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGStateRefreshTimerEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGStateRefreshTimer", "1.3.6.1.2.1.157.1.6.1.27", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PimSGITableEnt extends MIBEntry<PIMSTDMIBDef>
            {
                public final PimSGIEntryEnt pimSGIEntry;

                private PimSGITableEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimSGITable", "1.3.6.1.2.1.157.1.7", false, true, false, false);
                    this.pimSGIEntry = new PimSGIEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimSGIEntry
                    };
                }
                public static final class PimSGIEntryEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    public final PimSGIIfIndexEnt pimSGIIfIndex;

                    public final PimSGIUpTimeEnt pimSGIUpTime;

                    public final PimSGILocalMembershipEnt pimSGILocalMembership;

                    public final PimSGIJoinPruneStateEnt pimSGIJoinPruneState;

                    public final PimSGIPrunePendingTimerEnt pimSGIPrunePendingTimer;

                    public final PimSGIJoinExpiryTimerEnt pimSGIJoinExpiryTimer;

                    public final PimSGIAssertStateEnt pimSGIAssertState;

                    public final PimSGIAssertTimerEnt pimSGIAssertTimer;

                    public final PimSGIAssertWinnerAddressTypeEnt pimSGIAssertWinnerAddressType;

                    public final PimSGIAssertWinnerAddressEnt pimSGIAssertWinnerAddress;

                    public final PimSGIAssertWinnerMetricPrefEnt pimSGIAssertWinnerMetricPref;

                    public final PimSGIAssertWinnerMetricEnt pimSGIAssertWinnerMetric;

                    private PimSGIEntryEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimSGIEntry", "1.3.6.1.2.1.157.1.7.1", false, false, false, true);
                        this.pimSGIIfIndex = new PimSGIIfIndexEnt(mib, this);
                        this.pimSGIUpTime = new PimSGIUpTimeEnt(mib, this);
                        this.pimSGILocalMembership = new PimSGILocalMembershipEnt(mib, this);
                        this.pimSGIJoinPruneState = new PimSGIJoinPruneStateEnt(mib, this);
                        this.pimSGIPrunePendingTimer = new PimSGIPrunePendingTimerEnt(mib, this);
                        this.pimSGIJoinExpiryTimer = new PimSGIJoinExpiryTimerEnt(mib, this);
                        this.pimSGIAssertState = new PimSGIAssertStateEnt(mib, this);
                        this.pimSGIAssertTimer = new PimSGIAssertTimerEnt(mib, this);
                        this.pimSGIAssertWinnerAddressType = new PimSGIAssertWinnerAddressTypeEnt(mib, this);
                        this.pimSGIAssertWinnerAddress = new PimSGIAssertWinnerAddressEnt(mib, this);
                        this.pimSGIAssertWinnerMetricPref = new PimSGIAssertWinnerMetricPrefEnt(mib, this);
                        this.pimSGIAssertWinnerMetric = new PimSGIAssertWinnerMetricEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimSGIIfIndex,
                            this.pimSGIUpTime,
                            this.pimSGILocalMembership,
                            this.pimSGIJoinPruneState,
                            this.pimSGIPrunePendingTimer,
                            this.pimSGIJoinExpiryTimer,
                            this.pimSGIAssertState,
                            this.pimSGIAssertTimer,
                            this.pimSGIAssertWinnerAddressType,
                            this.pimSGIAssertWinnerAddress,
                            this.pimSGIAssertWinnerMetricPref,
                            this.pimSGIAssertWinnerMetric
                        };
                    }
                    public static final class PimSGIIfIndexEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGIIfIndexEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGIIfIndex", "1.3.6.1.2.1.157.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGIUpTimeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGIUpTimeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGIUpTime", "1.3.6.1.2.1.157.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGILocalMembershipEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGILocalMembershipEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGILocalMembership", "1.3.6.1.2.1.157.1.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGIJoinPruneStateEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGIJoinPruneStateEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGIJoinPruneState", "1.3.6.1.2.1.157.1.7.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGIPrunePendingTimerEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGIPrunePendingTimerEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGIPrunePendingTimer", "1.3.6.1.2.1.157.1.7.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGIJoinExpiryTimerEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGIJoinExpiryTimerEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGIJoinExpiryTimer", "1.3.6.1.2.1.157.1.7.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGIAssertStateEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGIAssertStateEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGIAssertState", "1.3.6.1.2.1.157.1.7.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGIAssertTimerEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGIAssertTimerEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGIAssertTimer", "1.3.6.1.2.1.157.1.7.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGIAssertWinnerAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGIAssertWinnerAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGIAssertWinnerAddressType", "1.3.6.1.2.1.157.1.7.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGIAssertWinnerAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGIAssertWinnerAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGIAssertWinnerAddress", "1.3.6.1.2.1.157.1.7.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGIAssertWinnerMetricPrefEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGIAssertWinnerMetricPrefEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGIAssertWinnerMetricPref", "1.3.6.1.2.1.157.1.7.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGIAssertWinnerMetricEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGIAssertWinnerMetricEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGIAssertWinnerMetric", "1.3.6.1.2.1.157.1.7.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PimSGRptTableEnt extends MIBEntry<PIMSTDMIBDef>
            {
                public final PimSGRptEntryEnt pimSGRptEntry;

                private PimSGRptTableEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimSGRptTable", "1.3.6.1.2.1.157.1.8", false, true, false, false);
                    this.pimSGRptEntry = new PimSGRptEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimSGRptEntry
                    };
                }
                public static final class PimSGRptEntryEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    public final PimSGRptSrcAddressEnt pimSGRptSrcAddress;

                    public final PimSGRptUpTimeEnt pimSGRptUpTime;

                    public final PimSGRptUpstreamPruneStateEnt pimSGRptUpstreamPruneState;

                    public final PimSGRptUpstreamOverrideTimerEnt pimSGRptUpstreamOverrideTimer;

                    private PimSGRptEntryEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimSGRptEntry", "1.3.6.1.2.1.157.1.8.1", false, false, false, true);
                        this.pimSGRptSrcAddress = new PimSGRptSrcAddressEnt(mib, this);
                        this.pimSGRptUpTime = new PimSGRptUpTimeEnt(mib, this);
                        this.pimSGRptUpstreamPruneState = new PimSGRptUpstreamPruneStateEnt(mib, this);
                        this.pimSGRptUpstreamOverrideTimer = new PimSGRptUpstreamOverrideTimerEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimSGRptSrcAddress,
                            this.pimSGRptUpTime,
                            this.pimSGRptUpstreamPruneState,
                            this.pimSGRptUpstreamOverrideTimer
                        };
                    }
                    public static final class PimSGRptSrcAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRptSrcAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRptSrcAddress", "1.3.6.1.2.1.157.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRptUpTimeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRptUpTimeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRptUpTime", "1.3.6.1.2.1.157.1.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRptUpstreamPruneStateEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRptUpstreamPruneStateEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRptUpstreamPruneState", "1.3.6.1.2.1.157.1.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRptUpstreamOverrideTimerEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRptUpstreamOverrideTimerEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRptUpstreamOverrideTimer", "1.3.6.1.2.1.157.1.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PimSGRptITableEnt extends MIBEntry<PIMSTDMIBDef>
            {
                public final PimSGRptIEntryEnt pimSGRptIEntry;

                private PimSGRptITableEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimSGRptITable", "1.3.6.1.2.1.157.1.9", false, true, false, false);
                    this.pimSGRptIEntry = new PimSGRptIEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimSGRptIEntry
                    };
                }
                public static final class PimSGRptIEntryEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    public final PimSGRptIIfIndexEnt pimSGRptIIfIndex;

                    public final PimSGRptIUpTimeEnt pimSGRptIUpTime;

                    public final PimSGRptILocalMembershipEnt pimSGRptILocalMembership;

                    public final PimSGRptIJoinPruneStateEnt pimSGRptIJoinPruneState;

                    public final PimSGRptIPrunePendingTimerEnt pimSGRptIPrunePendingTimer;

                    public final PimSGRptIPruneExpiryTimerEnt pimSGRptIPruneExpiryTimer;

                    private PimSGRptIEntryEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimSGRptIEntry", "1.3.6.1.2.1.157.1.9.1", false, false, false, true);
                        this.pimSGRptIIfIndex = new PimSGRptIIfIndexEnt(mib, this);
                        this.pimSGRptIUpTime = new PimSGRptIUpTimeEnt(mib, this);
                        this.pimSGRptILocalMembership = new PimSGRptILocalMembershipEnt(mib, this);
                        this.pimSGRptIJoinPruneState = new PimSGRptIJoinPruneStateEnt(mib, this);
                        this.pimSGRptIPrunePendingTimer = new PimSGRptIPrunePendingTimerEnt(mib, this);
                        this.pimSGRptIPruneExpiryTimer = new PimSGRptIPruneExpiryTimerEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimSGRptIIfIndex,
                            this.pimSGRptIUpTime,
                            this.pimSGRptILocalMembership,
                            this.pimSGRptIJoinPruneState,
                            this.pimSGRptIPrunePendingTimer,
                            this.pimSGRptIPruneExpiryTimer
                        };
                    }
                    public static final class PimSGRptIIfIndexEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRptIIfIndexEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRptIIfIndex", "1.3.6.1.2.1.157.1.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRptIUpTimeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRptIUpTimeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRptIUpTime", "1.3.6.1.2.1.157.1.9.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRptILocalMembershipEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRptILocalMembershipEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRptILocalMembership", "1.3.6.1.2.1.157.1.9.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRptIJoinPruneStateEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRptIJoinPruneStateEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRptIJoinPruneState", "1.3.6.1.2.1.157.1.9.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRptIPrunePendingTimerEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRptIPrunePendingTimerEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRptIPrunePendingTimer", "1.3.6.1.2.1.157.1.9.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimSGRptIPruneExpiryTimerEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimSGRptIPruneExpiryTimerEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimSGRptIPruneExpiryTimer", "1.3.6.1.2.1.157.1.9.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PimBidirDFElectionTableEnt extends MIBEntry<PIMSTDMIBDef>
            {
                public final PimBidirDFElectionEntryEnt pimBidirDFElectionEntry;

                private PimBidirDFElectionTableEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimBidirDFElectionTable", "1.3.6.1.2.1.157.1.10", false, true, false, false);
                    this.pimBidirDFElectionEntry = new PimBidirDFElectionEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimBidirDFElectionEntry
                    };
                }
                public static final class PimBidirDFElectionEntryEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    public final PimBidirDFElectionAddressTypeEnt pimBidirDFElectionAddressType;

                    public final PimBidirDFElectionRPAddressEnt pimBidirDFElectionRPAddress;

                    public final PimBidirDFElectionIfIndexEnt pimBidirDFElectionIfIndex;

                    public final PimBidirDFElectionWinnerAddressTypeEnt pimBidirDFElectionWinnerAddressType;

                    public final PimBidirDFElectionWinnerAddressEnt pimBidirDFElectionWinnerAddress;

                    public final PimBidirDFElectionWinnerUpTimeEnt pimBidirDFElectionWinnerUpTime;

                    public final PimBidirDFElectionWinnerMetricPrefEnt pimBidirDFElectionWinnerMetricPref;

                    public final PimBidirDFElectionWinnerMetricEnt pimBidirDFElectionWinnerMetric;

                    public final PimBidirDFElectionStateEnt pimBidirDFElectionState;

                    public final PimBidirDFElectionStateTimerEnt pimBidirDFElectionStateTimer;

                    private PimBidirDFElectionEntryEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimBidirDFElectionEntry", "1.3.6.1.2.1.157.1.10.1", false, false, false, true);
                        this.pimBidirDFElectionAddressType = new PimBidirDFElectionAddressTypeEnt(mib, this);
                        this.pimBidirDFElectionRPAddress = new PimBidirDFElectionRPAddressEnt(mib, this);
                        this.pimBidirDFElectionIfIndex = new PimBidirDFElectionIfIndexEnt(mib, this);
                        this.pimBidirDFElectionWinnerAddressType = new PimBidirDFElectionWinnerAddressTypeEnt(mib, this);
                        this.pimBidirDFElectionWinnerAddress = new PimBidirDFElectionWinnerAddressEnt(mib, this);
                        this.pimBidirDFElectionWinnerUpTime = new PimBidirDFElectionWinnerUpTimeEnt(mib, this);
                        this.pimBidirDFElectionWinnerMetricPref = new PimBidirDFElectionWinnerMetricPrefEnt(mib, this);
                        this.pimBidirDFElectionWinnerMetric = new PimBidirDFElectionWinnerMetricEnt(mib, this);
                        this.pimBidirDFElectionState = new PimBidirDFElectionStateEnt(mib, this);
                        this.pimBidirDFElectionStateTimer = new PimBidirDFElectionStateTimerEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimBidirDFElectionAddressType,
                            this.pimBidirDFElectionRPAddress,
                            this.pimBidirDFElectionIfIndex,
                            this.pimBidirDFElectionWinnerAddressType,
                            this.pimBidirDFElectionWinnerAddress,
                            this.pimBidirDFElectionWinnerUpTime,
                            this.pimBidirDFElectionWinnerMetricPref,
                            this.pimBidirDFElectionWinnerMetric,
                            this.pimBidirDFElectionState,
                            this.pimBidirDFElectionStateTimer
                        };
                    }
                    public static final class PimBidirDFElectionAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimBidirDFElectionAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimBidirDFElectionAddressType", "1.3.6.1.2.1.157.1.10.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimBidirDFElectionRPAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimBidirDFElectionRPAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimBidirDFElectionRPAddress", "1.3.6.1.2.1.157.1.10.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimBidirDFElectionIfIndexEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimBidirDFElectionIfIndexEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimBidirDFElectionIfIndex", "1.3.6.1.2.1.157.1.10.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimBidirDFElectionWinnerAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimBidirDFElectionWinnerAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimBidirDFElectionWinnerAddressType", "1.3.6.1.2.1.157.1.10.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimBidirDFElectionWinnerAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimBidirDFElectionWinnerAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimBidirDFElectionWinnerAddress", "1.3.6.1.2.1.157.1.10.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimBidirDFElectionWinnerUpTimeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimBidirDFElectionWinnerUpTimeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimBidirDFElectionWinnerUpTime", "1.3.6.1.2.1.157.1.10.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimBidirDFElectionWinnerMetricPrefEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimBidirDFElectionWinnerMetricPrefEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimBidirDFElectionWinnerMetricPref", "1.3.6.1.2.1.157.1.10.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimBidirDFElectionWinnerMetricEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimBidirDFElectionWinnerMetricEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimBidirDFElectionWinnerMetric", "1.3.6.1.2.1.157.1.10.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimBidirDFElectionStateEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimBidirDFElectionStateEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimBidirDFElectionState", "1.3.6.1.2.1.157.1.10.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimBidirDFElectionStateTimerEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimBidirDFElectionStateTimerEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimBidirDFElectionStateTimer", "1.3.6.1.2.1.157.1.10.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PimStaticRPTableEnt extends MIBEntry<PIMSTDMIBDef>
            {
                public final PimStaticRPEntryEnt pimStaticRPEntry;

                private PimStaticRPTableEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimStaticRPTable", "1.3.6.1.2.1.157.1.11", false, true, false, false);
                    this.pimStaticRPEntry = new PimStaticRPEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimStaticRPEntry
                    };
                }
                public static final class PimStaticRPEntryEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    public final PimStaticRPAddressTypeEnt pimStaticRPAddressType;

                    public final PimStaticRPGrpAddressEnt pimStaticRPGrpAddress;

                    public final PimStaticRPGrpPrefixLengthEnt pimStaticRPGrpPrefixLength;

                    public final PimStaticRPRPAddressEnt pimStaticRPRPAddress;

                    public final PimStaticRPPimModeEnt pimStaticRPPimMode;

                    public final PimStaticRPOverrideDynamicEnt pimStaticRPOverrideDynamic;

                    public final PimStaticRPPrecedenceEnt pimStaticRPPrecedence;

                    public final PimStaticRPRowStatusEnt pimStaticRPRowStatus;

                    public final PimStaticRPStorageTypeEnt pimStaticRPStorageType;

                    private PimStaticRPEntryEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimStaticRPEntry", "1.3.6.1.2.1.157.1.11.1", false, false, false, true);
                        this.pimStaticRPAddressType = new PimStaticRPAddressTypeEnt(mib, this);
                        this.pimStaticRPGrpAddress = new PimStaticRPGrpAddressEnt(mib, this);
                        this.pimStaticRPGrpPrefixLength = new PimStaticRPGrpPrefixLengthEnt(mib, this);
                        this.pimStaticRPRPAddress = new PimStaticRPRPAddressEnt(mib, this);
                        this.pimStaticRPPimMode = new PimStaticRPPimModeEnt(mib, this);
                        this.pimStaticRPOverrideDynamic = new PimStaticRPOverrideDynamicEnt(mib, this);
                        this.pimStaticRPPrecedence = new PimStaticRPPrecedenceEnt(mib, this);
                        this.pimStaticRPRowStatus = new PimStaticRPRowStatusEnt(mib, this);
                        this.pimStaticRPStorageType = new PimStaticRPStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimStaticRPAddressType,
                            this.pimStaticRPGrpAddress,
                            this.pimStaticRPGrpPrefixLength,
                            this.pimStaticRPRPAddress,
                            this.pimStaticRPPimMode,
                            this.pimStaticRPOverrideDynamic,
                            this.pimStaticRPPrecedence,
                            this.pimStaticRPRowStatus,
                            this.pimStaticRPStorageType
                        };
                    }
                    public static final class PimStaticRPAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStaticRPAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStaticRPAddressType", "1.3.6.1.2.1.157.1.11.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStaticRPGrpAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStaticRPGrpAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStaticRPGrpAddress", "1.3.6.1.2.1.157.1.11.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStaticRPGrpPrefixLengthEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStaticRPGrpPrefixLengthEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStaticRPGrpPrefixLength", "1.3.6.1.2.1.157.1.11.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStaticRPRPAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStaticRPRPAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStaticRPRPAddress", "1.3.6.1.2.1.157.1.11.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStaticRPPimModeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStaticRPPimModeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStaticRPPimMode", "1.3.6.1.2.1.157.1.11.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStaticRPOverrideDynamicEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStaticRPOverrideDynamicEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStaticRPOverrideDynamic", "1.3.6.1.2.1.157.1.11.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStaticRPPrecedenceEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStaticRPPrecedenceEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStaticRPPrecedence", "1.3.6.1.2.1.157.1.11.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStaticRPRowStatusEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStaticRPRowStatusEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStaticRPRowStatus", "1.3.6.1.2.1.157.1.11.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimStaticRPStorageTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimStaticRPStorageTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimStaticRPStorageType", "1.3.6.1.2.1.157.1.11.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PimAnycastRPSetTableEnt extends MIBEntry<PIMSTDMIBDef>
            {
                public final PimAnycastRPSetEntryEnt pimAnycastRPSetEntry;

                private PimAnycastRPSetTableEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimAnycastRPSetTable", "1.3.6.1.2.1.157.1.12", false, true, false, false);
                    this.pimAnycastRPSetEntry = new PimAnycastRPSetEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimAnycastRPSetEntry
                    };
                }
                public static final class PimAnycastRPSetEntryEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    public final PimAnycastRPSetAddressTypeEnt pimAnycastRPSetAddressType;

                    public final PimAnycastRPSetAnycastAddressEnt pimAnycastRPSetAnycastAddress;

                    public final PimAnycastRPSetRouterAddressEnt pimAnycastRPSetRouterAddress;

                    public final PimAnycastRPSetLocalRouterEnt pimAnycastRPSetLocalRouter;

                    public final PimAnycastRPSetRowStatusEnt pimAnycastRPSetRowStatus;

                    public final PimAnycastRPSetStorageTypeEnt pimAnycastRPSetStorageType;

                    private PimAnycastRPSetEntryEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimAnycastRPSetEntry", "1.3.6.1.2.1.157.1.12.1", false, false, false, true);
                        this.pimAnycastRPSetAddressType = new PimAnycastRPSetAddressTypeEnt(mib, this);
                        this.pimAnycastRPSetAnycastAddress = new PimAnycastRPSetAnycastAddressEnt(mib, this);
                        this.pimAnycastRPSetRouterAddress = new PimAnycastRPSetRouterAddressEnt(mib, this);
                        this.pimAnycastRPSetLocalRouter = new PimAnycastRPSetLocalRouterEnt(mib, this);
                        this.pimAnycastRPSetRowStatus = new PimAnycastRPSetRowStatusEnt(mib, this);
                        this.pimAnycastRPSetStorageType = new PimAnycastRPSetStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimAnycastRPSetAddressType,
                            this.pimAnycastRPSetAnycastAddress,
                            this.pimAnycastRPSetRouterAddress,
                            this.pimAnycastRPSetLocalRouter,
                            this.pimAnycastRPSetRowStatus,
                            this.pimAnycastRPSetStorageType
                        };
                    }
                    public static final class PimAnycastRPSetAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimAnycastRPSetAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimAnycastRPSetAddressType", "1.3.6.1.2.1.157.1.12.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimAnycastRPSetAnycastAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimAnycastRPSetAnycastAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimAnycastRPSetAnycastAddress", "1.3.6.1.2.1.157.1.12.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimAnycastRPSetRouterAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimAnycastRPSetRouterAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimAnycastRPSetRouterAddress", "1.3.6.1.2.1.157.1.12.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimAnycastRPSetLocalRouterEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimAnycastRPSetLocalRouterEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimAnycastRPSetLocalRouter", "1.3.6.1.2.1.157.1.12.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimAnycastRPSetRowStatusEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimAnycastRPSetRowStatusEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimAnycastRPSetRowStatus", "1.3.6.1.2.1.157.1.12.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimAnycastRPSetStorageTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimAnycastRPSetStorageTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimAnycastRPSetStorageType", "1.3.6.1.2.1.157.1.12.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class PimGroupMappingTableEnt extends MIBEntry<PIMSTDMIBDef>
            {
                public final PimGroupMappingEntryEnt pimGroupMappingEntry;

                private PimGroupMappingTableEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimGroupMappingTable", "1.3.6.1.2.1.157.1.13", false, true, false, false);
                    this.pimGroupMappingEntry = new PimGroupMappingEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimGroupMappingEntry
                    };
                }
                public static final class PimGroupMappingEntryEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    public final PimGroupMappingOriginEnt pimGroupMappingOrigin;

                    public final PimGroupMappingAddressTypeEnt pimGroupMappingAddressType;

                    public final PimGroupMappingGrpAddressEnt pimGroupMappingGrpAddress;

                    public final PimGroupMappingGrpPrefixLengthEnt pimGroupMappingGrpPrefixLength;

                    public final PimGroupMappingRPAddressTypeEnt pimGroupMappingRPAddressType;

                    public final PimGroupMappingRPAddressEnt pimGroupMappingRPAddress;

                    public final PimGroupMappingPimModeEnt pimGroupMappingPimMode;

                    public final PimGroupMappingPrecedenceEnt pimGroupMappingPrecedence;

                    private PimGroupMappingEntryEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimGroupMappingEntry", "1.3.6.1.2.1.157.1.13.1", false, false, false, true);
                        this.pimGroupMappingOrigin = new PimGroupMappingOriginEnt(mib, this);
                        this.pimGroupMappingAddressType = new PimGroupMappingAddressTypeEnt(mib, this);
                        this.pimGroupMappingGrpAddress = new PimGroupMappingGrpAddressEnt(mib, this);
                        this.pimGroupMappingGrpPrefixLength = new PimGroupMappingGrpPrefixLengthEnt(mib, this);
                        this.pimGroupMappingRPAddressType = new PimGroupMappingRPAddressTypeEnt(mib, this);
                        this.pimGroupMappingRPAddress = new PimGroupMappingRPAddressEnt(mib, this);
                        this.pimGroupMappingPimMode = new PimGroupMappingPimModeEnt(mib, this);
                        this.pimGroupMappingPrecedence = new PimGroupMappingPrecedenceEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pimGroupMappingOrigin,
                            this.pimGroupMappingAddressType,
                            this.pimGroupMappingGrpAddress,
                            this.pimGroupMappingGrpPrefixLength,
                            this.pimGroupMappingRPAddressType,
                            this.pimGroupMappingRPAddress,
                            this.pimGroupMappingPimMode,
                            this.pimGroupMappingPrecedence
                        };
                    }
                    public static final class PimGroupMappingOriginEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimGroupMappingOriginEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimGroupMappingOrigin", "1.3.6.1.2.1.157.1.13.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimGroupMappingAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimGroupMappingAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimGroupMappingAddressType", "1.3.6.1.2.1.157.1.13.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimGroupMappingGrpAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimGroupMappingGrpAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimGroupMappingGrpAddress", "1.3.6.1.2.1.157.1.13.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimGroupMappingGrpPrefixLengthEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimGroupMappingGrpPrefixLengthEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimGroupMappingGrpPrefixLength", "1.3.6.1.2.1.157.1.13.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimGroupMappingRPAddressTypeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimGroupMappingRPAddressTypeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimGroupMappingRPAddressType", "1.3.6.1.2.1.157.1.13.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimGroupMappingRPAddressEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimGroupMappingRPAddressEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimGroupMappingRPAddress", "1.3.6.1.2.1.157.1.13.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimGroupMappingPimModeEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimGroupMappingPimModeEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimGroupMappingPimMode", "1.3.6.1.2.1.157.1.13.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class PimGroupMappingPrecedenceEnt extends MIBEntry<PIMSTDMIBDef>
                    {
                        private PimGroupMappingPrecedenceEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                        {
                            super(mib, parent, "pimGroupMappingPrecedence", "1.3.6.1.2.1.157.1.13.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class PimMIBConformanceEnt extends MIBEntry<PIMSTDMIBDef>
        {
            public final PimMIBCompliancesEnt pimMIBCompliances;

            public final PimMIBGroupsEnt pimMIBGroups;

            private PimMIBConformanceEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
            {
                super(mib, parent, "pimMIBConformance", "1.3.6.1.2.1.157.2", false, false, false, false);
                this.pimMIBCompliances = new PimMIBCompliancesEnt(mib, this);
                this.pimMIBGroups = new PimMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pimMIBCompliances,
                    this.pimMIBGroups
                };
            }
            public static final class PimMIBCompliancesEnt extends MIBEntry<PIMSTDMIBDef>
            {
                /** Compliance Statements*/
                public final PimMIBComplianceAsmEnt pimMIBComplianceAsm;

                public final PimMIBComplianceBidirEnt pimMIBComplianceBidir;

                public final PimMIBComplianceSsmEnt pimMIBComplianceSsm;

                public final PimMIBComplianceDmEnt pimMIBComplianceDm;

                private PimMIBCompliancesEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimMIBCompliances", "1.3.6.1.2.1.157.2.1", false, false, false, false);
                    this.pimMIBComplianceAsm = new PimMIBComplianceAsmEnt(mib, this);
                    this.pimMIBComplianceBidir = new PimMIBComplianceBidirEnt(mib, this);
                    this.pimMIBComplianceSsm = new PimMIBComplianceSsmEnt(mib, this);
                    this.pimMIBComplianceDm = new PimMIBComplianceDmEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimMIBComplianceAsm,
                        this.pimMIBComplianceBidir,
                        this.pimMIBComplianceSsm,
                        this.pimMIBComplianceDm
                    };
                }
                public static final class PimMIBComplianceAsmEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimMIBComplianceAsmEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimMIBComplianceAsm", "1.3.6.1.2.1.157.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimMIBComplianceBidirEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimMIBComplianceBidirEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimMIBComplianceBidir", "1.3.6.1.2.1.157.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimMIBComplianceSsmEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimMIBComplianceSsmEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimMIBComplianceSsm", "1.3.6.1.2.1.157.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimMIBComplianceDmEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimMIBComplianceDmEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimMIBComplianceDm", "1.3.6.1.2.1.157.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class PimMIBGroupsEnt extends MIBEntry<PIMSTDMIBDef>
            {
                /** Units of Conformance*/
                public final PimTopologyGroupEnt pimTopologyGroup;

                public final PimNotificationGroupEnt pimNotificationGroup;

                public final PimTuningParametersGroupEnt pimTuningParametersGroup;

                public final PimRouterStatisticsGroupEnt pimRouterStatisticsGroup;

                public final PimSsmGroupEnt pimSsmGroup;

                public final PimRPConfigGroupEnt pimRPConfigGroup;

                public final PimSmGroupEnt pimSmGroup;

                public final PimBidirGroupEnt pimBidirGroup;

                public final PimAnycastRpGroupEnt pimAnycastRpGroup;

                public final PimStaticRPPrecedenceGroupEnt pimStaticRPPrecedenceGroup;

                public final PimNetMgmtNotificationObjectsEnt pimNetMgmtNotificationObjects;

                public final PimNetMgmtNotificationGroupEnt pimNetMgmtNotificationGroup;

                public final PimDiagnosticsGroupEnt pimDiagnosticsGroup;

                public final PimDmGroupEnt pimDmGroup;

                public final PimDeviceStorageGroupEnt pimDeviceStorageGroup;

                private PimMIBGroupsEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                {
                    super(mib, parent, "pimMIBGroups", "1.3.6.1.2.1.157.2.2", false, false, false, false);
                    this.pimTopologyGroup = new PimTopologyGroupEnt(mib, this);
                    this.pimNotificationGroup = new PimNotificationGroupEnt(mib, this);
                    this.pimTuningParametersGroup = new PimTuningParametersGroupEnt(mib, this);
                    this.pimRouterStatisticsGroup = new PimRouterStatisticsGroupEnt(mib, this);
                    this.pimSsmGroup = new PimSsmGroupEnt(mib, this);
                    this.pimRPConfigGroup = new PimRPConfigGroupEnt(mib, this);
                    this.pimSmGroup = new PimSmGroupEnt(mib, this);
                    this.pimBidirGroup = new PimBidirGroupEnt(mib, this);
                    this.pimAnycastRpGroup = new PimAnycastRpGroupEnt(mib, this);
                    this.pimStaticRPPrecedenceGroup = new PimStaticRPPrecedenceGroupEnt(mib, this);
                    this.pimNetMgmtNotificationObjects = new PimNetMgmtNotificationObjectsEnt(mib, this);
                    this.pimNetMgmtNotificationGroup = new PimNetMgmtNotificationGroupEnt(mib, this);
                    this.pimDiagnosticsGroup = new PimDiagnosticsGroupEnt(mib, this);
                    this.pimDmGroup = new PimDmGroupEnt(mib, this);
                    this.pimDeviceStorageGroup = new PimDeviceStorageGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pimTopologyGroup,
                        this.pimNotificationGroup,
                        this.pimTuningParametersGroup,
                        this.pimRouterStatisticsGroup,
                        this.pimSsmGroup,
                        this.pimRPConfigGroup,
                        this.pimSmGroup,
                        this.pimBidirGroup,
                        this.pimAnycastRpGroup,
                        this.pimStaticRPPrecedenceGroup,
                        this.pimNetMgmtNotificationObjects,
                        this.pimNetMgmtNotificationGroup,
                        this.pimDiagnosticsGroup,
                        this.pimDmGroup,
                        this.pimDeviceStorageGroup
                    };
                }
                public static final class PimTopologyGroupEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimTopologyGroupEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimTopologyGroup", "1.3.6.1.2.1.157.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimNotificationGroupEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimNotificationGroupEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimNotificationGroup", "1.3.6.1.2.1.157.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimTuningParametersGroupEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimTuningParametersGroupEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimTuningParametersGroup", "1.3.6.1.2.1.157.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimRouterStatisticsGroupEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimRouterStatisticsGroupEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimRouterStatisticsGroup", "1.3.6.1.2.1.157.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimSsmGroupEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimSsmGroupEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimSsmGroup", "1.3.6.1.2.1.157.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimRPConfigGroupEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimRPConfigGroupEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimRPConfigGroup", "1.3.6.1.2.1.157.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimSmGroupEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimSmGroupEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimSmGroup", "1.3.6.1.2.1.157.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimBidirGroupEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimBidirGroupEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimBidirGroup", "1.3.6.1.2.1.157.2.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimAnycastRpGroupEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimAnycastRpGroupEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimAnycastRpGroup", "1.3.6.1.2.1.157.2.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimStaticRPPrecedenceGroupEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimStaticRPPrecedenceGroupEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimStaticRPPrecedenceGroup", "1.3.6.1.2.1.157.2.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimNetMgmtNotificationObjectsEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimNetMgmtNotificationObjectsEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimNetMgmtNotificationObjects", "1.3.6.1.2.1.157.2.2.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimNetMgmtNotificationGroupEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimNetMgmtNotificationGroupEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimNetMgmtNotificationGroup", "1.3.6.1.2.1.157.2.2.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimDiagnosticsGroupEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimDiagnosticsGroupEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimDiagnosticsGroup", "1.3.6.1.2.1.157.2.2.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimDmGroupEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimDmGroupEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimDmGroup", "1.3.6.1.2.1.157.2.2.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PimDeviceStorageGroupEnt extends MIBEntry<PIMSTDMIBDef>
                {
                    private PimDeviceStorageGroupEnt(PIMSTDMIBDef mib, MIBEntry<PIMSTDMIBDef> parent)
                    {
                        super(mib, parent, "pimDeviceStorageGroup", "1.3.6.1.2.1.157.2.2.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
